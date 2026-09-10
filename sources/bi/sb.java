package bi;

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
public abstract class sb extends View {
    public static final int f3659a = 0;

    public static void a(int i10, r9 r9Var) {
        pb pbVar;
        if (r9Var != null) {
            try {
                String string = MessagesController.getInstance(i10).getMainSettings().getString("story_privacy2", null);
                if (string == null) {
                    pbVar = new pb();
                } else {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                    pbVar = b(serializedData);
                    serializedData.cleanup();
                    if (pbVar.f3418f.isEmpty() && pbVar.f3416b.isEmpty()) {
                        pbVar = new pb();
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(pbVar.f3417c);
                        for (ArrayList arrayList : pbVar.d.values()) {
                            hashSet.addAll(arrayList);
                        }
                        if (!hashSet.isEmpty()) {
                            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                            messagesStorage.getStorageQueue().postRunnable(new g3(messagesStorage, hashSet, i10, 3));
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
                pbVar = new pb();
            }
            r9Var.E0 = pbVar;
            r9Var.F0.clear();
            r9Var.F0.addAll(r9Var.E0.f3416b);
            if (UserConfig.getInstance(i10).isPremium()) {
                r9Var.I0 = MessagesController.getInstance(i10).getMainSettings().getInt("story_period", 86400);
            } else {
                r9Var.I0 = 86400;
            }
        }
    }

    public static pb b(SerializedData serializedData) {
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
                    pb pbVar = new pb(readInt32, arrayList, 0);
                    ArrayList arrayList5 = pbVar.f3417c;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    HashMap hashMap2 = pbVar.d;
                    hashMap2.clear();
                    hashMap2.putAll(hashMap);
                    return pbVar;
                }
                throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (3)");
            }
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (2)");
        }
        throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy");
    }

    public static void c(SerializedData serializedData, pb pbVar) {
        int i10 = pbVar.f3415a;
        HashMap hashMap = pbVar.d;
        ArrayList arrayList = pbVar.f3417c;
        serializedData.writeInt32(i10);
        serializedData.writeInt32(481674261);
        ArrayList arrayList2 = pbVar.e;
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
