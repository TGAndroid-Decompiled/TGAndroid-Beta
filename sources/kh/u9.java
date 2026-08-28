package kh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class u9 extends View {
    public static final int f16170a = 0;

    public static void a(int i9, a8 a8Var) {
        r9 r9Var;
        if (a8Var != null) {
            try {
                String string = MessagesController.getInstance(i9).getMainSettings().getString("story_privacy2", null);
                if (string == null) {
                    r9Var = new r9();
                } else {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                    r9Var = b(serializedData);
                    serializedData.cleanup();
                    if (r9Var.f15970f.isEmpty() && r9Var.f15967b.isEmpty()) {
                        r9Var = new r9();
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(r9Var.f15968c);
                        for (ArrayList arrayList : r9Var.d.values()) {
                            hashSet.addAll(arrayList);
                        }
                        if (!hashSet.isEmpty()) {
                            MessagesStorage messagesStorage = MessagesStorage.getInstance(i9);
                            messagesStorage.getStorageQueue().postRunnable(new d5.i(messagesStorage, hashSet, i9, 14));
                        }
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                r9Var = new r9();
            }
            a8Var.E0 = r9Var;
            a8Var.F0.clear();
            a8Var.F0.addAll(a8Var.E0.f15967b);
            if (UserConfig.getInstance(i9).isPremium()) {
                a8Var.I0 = MessagesController.getInstance(i9).getMainSettings().getInt("story_period", 86400);
            } else {
                a8Var.I0 = 86400;
            }
        }
    }

    public static r9 b(SerializedData serializedData) {
        int readInt32 = serializedData.readInt32(true);
        if (serializedData.readInt32(true) == 481674261) {
            int readInt322 = serializedData.readInt32(true);
            ArrayList arrayList = new ArrayList(readInt322);
            for (int i9 = 0; i9 < readInt322; i9++) {
                arrayList.add(TLRPC.InputUser.TLdeserialize(serializedData, serializedData.readInt32(true), true));
            }
            if (serializedData.readInt32(true) == 481674261) {
                int readInt323 = serializedData.readInt32(true);
                ArrayList arrayList2 = new ArrayList(readInt323);
                for (int i10 = 0; i10 < readInt323; i10++) {
                    arrayList2.add(Long.valueOf(serializedData.readInt64(true)));
                }
                if (serializedData.readInt32(true) == 481674261) {
                    int readInt324 = serializedData.readInt32(true);
                    HashMap hashMap = new HashMap();
                    for (int i11 = 0; i11 < readInt324; i11++) {
                        long readInt64 = serializedData.readInt64(true);
                        if (serializedData.readInt32(true) == 481674261) {
                            int readInt325 = serializedData.readInt32(true);
                            ArrayList arrayList3 = new ArrayList(readInt325);
                            for (int i12 = 0; i12 < readInt325; i12++) {
                                arrayList3.add(Long.valueOf(serializedData.readInt64(true)));
                            }
                            hashMap.put(Long.valueOf(readInt64), arrayList3);
                        } else {
                            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (4)");
                        }
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(arrayList2);
                    for (ArrayList arrayList4 : hashMap.values()) {
                        hashSet.addAll(arrayList4);
                    }
                    r9 r9Var = new r9(readInt32, arrayList, 0);
                    ArrayList arrayList5 = r9Var.f15968c;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    HashMap hashMap2 = r9Var.d;
                    hashMap2.clear();
                    hashMap2.putAll(hashMap);
                    return r9Var;
                }
                throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (3)");
            }
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (2)");
        }
        throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy");
    }

    public static void c(SerializedData serializedData, r9 r9Var) {
        int i9 = r9Var.f15966a;
        HashMap hashMap = r9Var.d;
        ArrayList arrayList = r9Var.f15968c;
        serializedData.writeInt32(i9);
        serializedData.writeInt32(481674261);
        ArrayList arrayList2 = r9Var.f15969e;
        serializedData.writeInt32(arrayList2.size());
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((TLRPC.InputUser) obj).serializeToStream(serializedData);
        }
        serializedData.writeInt32(481674261);
        serializedData.writeInt32(arrayList.size());
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            serializedData.writeInt64(((Long) obj2).longValue());
        }
        serializedData.writeInt32(481674261);
        serializedData.writeInt32(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            serializedData.writeInt64(((Long) entry.getKey()).longValue());
            serializedData.writeInt32(481674261);
            serializedData.writeInt32(((ArrayList) entry.getValue()).size());
            ArrayList arrayList3 = (ArrayList) entry.getValue();
            int size3 = arrayList3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList3.get(i12);
                i12++;
                serializedData.writeInt64(((Long) obj3).longValue());
            }
        }
    }
}
