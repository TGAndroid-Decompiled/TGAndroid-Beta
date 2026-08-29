package nh;

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
public abstract class f9 extends View {
    public static final int f17679a = 0;

    public static void a(int i10, o7 o7Var) {
        c9 c9Var;
        if (o7Var != null) {
            try {
                String string = MessagesController.getInstance(i10).getMainSettings().getString("story_privacy2", null);
                if (string == null) {
                    c9Var = new c9();
                } else {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                    c9Var = b(serializedData);
                    serializedData.cleanup();
                    if (c9Var.f17485f.isEmpty() && c9Var.f17482b.isEmpty()) {
                        c9Var = new c9();
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(c9Var.f17483c);
                        for (ArrayList arrayList : c9Var.d.values()) {
                            hashSet.addAll(arrayList);
                        }
                        if (!hashSet.isEmpty()) {
                            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                            messagesStorage.getStorageQueue().postRunnable(new ag.v0(messagesStorage, hashSet, i10, 16));
                        }
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                c9Var = new c9();
            }
            o7Var.E0 = c9Var;
            o7Var.F0.clear();
            o7Var.F0.addAll(o7Var.E0.f17482b);
            if (UserConfig.getInstance(i10).isPremium()) {
                o7Var.I0 = MessagesController.getInstance(i10).getMainSettings().getInt("story_period", 86400);
            } else {
                o7Var.I0 = 86400;
            }
        }
    }

    public static c9 b(SerializedData serializedData) {
        int readInt32 = serializedData.readInt32(true);
        if (serializedData.readInt32(true) == 481674261) {
            int readInt322 = serializedData.readInt32(true);
            ArrayList arrayList = new ArrayList(readInt322);
            for (int i10 = 0; i10 < readInt322; i10++) {
                arrayList.add(TLRPC.InputUser.TLdeserialize(serializedData, serializedData.readInt32(true), true));
            }
            if (serializedData.readInt32(true) == 481674261) {
                int readInt323 = serializedData.readInt32(true);
                ArrayList arrayList2 = new ArrayList(readInt323);
                for (int i11 = 0; i11 < readInt323; i11++) {
                    arrayList2.add(Long.valueOf(serializedData.readInt64(true)));
                }
                if (serializedData.readInt32(true) == 481674261) {
                    int readInt324 = serializedData.readInt32(true);
                    HashMap hashMap = new HashMap();
                    for (int i12 = 0; i12 < readInt324; i12++) {
                        long readInt64 = serializedData.readInt64(true);
                        if (serializedData.readInt32(true) == 481674261) {
                            int readInt325 = serializedData.readInt32(true);
                            ArrayList arrayList3 = new ArrayList(readInt325);
                            for (int i13 = 0; i13 < readInt325; i13++) {
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
                    c9 c9Var = new c9(readInt32, arrayList, 0);
                    ArrayList arrayList5 = c9Var.f17483c;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    HashMap hashMap2 = c9Var.d;
                    hashMap2.clear();
                    hashMap2.putAll(hashMap);
                    return c9Var;
                }
                throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (3)");
            }
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (2)");
        }
        throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy");
    }

    public static void c(SerializedData serializedData, c9 c9Var) {
        int i10 = c9Var.f17481a;
        HashMap hashMap = c9Var.d;
        ArrayList arrayList = c9Var.f17483c;
        serializedData.writeInt32(i10);
        serializedData.writeInt32(481674261);
        ArrayList arrayList2 = c9Var.f17484e;
        serializedData.writeInt32(arrayList2.size());
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ((TLRPC.InputUser) obj).serializeToStream(serializedData);
        }
        serializedData.writeInt32(481674261);
        serializedData.writeInt32(arrayList.size());
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
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
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                serializedData.writeInt64(((Long) obj3).longValue());
            }
        }
    }
}
