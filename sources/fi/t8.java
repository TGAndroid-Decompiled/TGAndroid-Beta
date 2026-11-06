package fi;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class t8 extends View {
    public static final int f12863a = 0;

    public static void a(int i7, e7 e7Var) {
        q8 q8Var;
        if (e7Var != null) {
            try {
                String string = qp.s1(i7).f24759e7.getString("story_privacy2", null);
                if (string == null) {
                    q8Var = new q8();
                } else {
                    SerializedData serializedData = new SerializedData(Utilities.v(string));
                    q8Var = b(serializedData);
                    serializedData.cleanup();
                    if (q8Var.f12682f.isEmpty() && q8Var.f12679b.isEmpty()) {
                        q8Var = new q8();
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(q8Var.f12680c);
                        for (ArrayList arrayList : q8Var.d.values()) {
                            hashSet.addAll(arrayList);
                        }
                        if (!hashSet.isEmpty()) {
                            yr a02 = yr.a0(i7);
                            a02.f26688a.c(new ai.e0(a02, hashSet, i7, 12));
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                q8Var = new q8();
            }
            e7Var.E0 = q8Var;
            e7Var.F0.clear();
            e7Var.F0.addAll(e7Var.E0.f12679b);
            if (p10.i(i7).q()) {
                e7Var.I0 = qp.s1(i7).f24759e7.getInt("story_period", 86400);
            } else {
                e7Var.I0 = 86400;
            }
        }
    }

    public static q8 b(SerializedData serializedData) {
        int readInt32 = serializedData.readInt32(true);
        if (serializedData.readInt32(true) == 481674261) {
            int readInt322 = serializedData.readInt32(true);
            ArrayList arrayList = new ArrayList(readInt322);
            for (int i7 = 0; i7 < readInt322; i7++) {
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
                    q8 q8Var = new q8(readInt32, arrayList, 0);
                    ArrayList arrayList5 = q8Var.f12680c;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    HashMap hashMap2 = q8Var.d;
                    hashMap2.clear();
                    hashMap2.putAll(hashMap);
                    return q8Var;
                }
                throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (3)");
            }
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (2)");
        }
        throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy");
    }

    public static void c(SerializedData serializedData, q8 q8Var) {
        int i7 = q8Var.f12678a;
        HashMap hashMap = q8Var.d;
        ArrayList arrayList = q8Var.f12680c;
        serializedData.writeInt32(i7);
        serializedData.writeInt32(481674261);
        ArrayList arrayList2 = q8Var.f12681e;
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
