package lh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

public abstract class r9 extends View {

    public static final int f16677a = 0;

    public static void a(int i10, z7 z7Var) {
        o9 o9Var;
        if (z7Var == null) {
            return;
        }
        try {
            String string = MessagesController.getInstance(i10).getMainSettings().getString("story_privacy2", null);
            if (string == null) {
                o9Var = new o9();
            } else {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                o9Var = b(serializedData);
                serializedData.cleanup();
                if (o9Var.f16493f.isEmpty() && o9Var.f16490b.isEmpty()) {
                    o9Var = new o9();
                } else {
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(o9Var.f16491c);
                    Iterator it = o9Var.d.values().iterator();
                    while (it.hasNext()) {
                        hashSet.addAll((ArrayList) it.next());
                    }
                    if (!hashSet.isEmpty()) {
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                        messagesStorage.getStorageQueue().postRunnable(new d5.i(messagesStorage, hashSet, i10, 14));
                    }
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
            o9Var = new o9();
        }
        z7Var.E0 = o9Var;
        z7Var.F0.clear();
        z7Var.F0.addAll(z7Var.E0.f16490b);
        if (UserConfig.getInstance(i10).isPremium()) {
            z7Var.I0 = MessagesController.getInstance(i10).getMainSettings().getInt("story_period", 86400);
        } else {
            z7Var.I0 = 86400;
        }
    }

    public static o9 b(SerializedData serializedData) {
        int int32 = serializedData.readInt32(true);
        if (serializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy");
        }
        int int33 = serializedData.readInt32(true);
        ArrayList arrayList = new ArrayList(int33);
        for (int i10 = 0; i10 < int33; i10++) {
            arrayList.add(TLRPC.InputUser.TLdeserialize(serializedData, serializedData.readInt32(true), true));
        }
        if (serializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (2)");
        }
        int int34 = serializedData.readInt32(true);
        ArrayList arrayList2 = new ArrayList(int34);
        for (int i11 = 0; i11 < int34; i11++) {
            arrayList2.add(Long.valueOf(serializedData.readInt64(true)));
        }
        if (serializedData.readInt32(true) != 481674261) {
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (3)");
        }
        int int35 = serializedData.readInt32(true);
        HashMap map = new HashMap();
        for (int i12 = 0; i12 < int35; i12++) {
            long int64 = serializedData.readInt64(true);
            if (serializedData.readInt32(true) != 481674261) {
                throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (4)");
            }
            int int36 = serializedData.readInt32(true);
            ArrayList arrayList3 = new ArrayList(int36);
            for (int i13 = 0; i13 < int36; i13++) {
                arrayList3.add(Long.valueOf(serializedData.readInt64(true)));
            }
            map.put(Long.valueOf(int64), arrayList3);
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList2);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll((ArrayList) it.next());
        }
        o9 o9Var = new o9(int32, arrayList, 0);
        ArrayList arrayList4 = o9Var.f16491c;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        HashMap map2 = o9Var.d;
        map2.clear();
        map2.putAll(map);
        return o9Var;
    }

    public static void c(SerializedData serializedData, o9 o9Var) {
        int i10 = o9Var.f16489a;
        HashMap map = o9Var.d;
        ArrayList arrayList = o9Var.f16491c;
        serializedData.writeInt32(i10);
        serializedData.writeInt32(481674261);
        ArrayList arrayList2 = o9Var.f16492e;
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
        serializedData.writeInt32(map.size());
        for (Map.Entry entry : map.entrySet()) {
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
