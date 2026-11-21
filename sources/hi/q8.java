package hi;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class q8 extends View {
    public static final int f15311a = 0;

    public static void a(int i7, c7 c7Var) {
        n8 n8Var;
        if (c7Var != null) {
            try {
                String string = mp.u1(i7).h7.getString("story_privacy2", null);
                if (string == null) {
                    n8Var = new n8();
                } else {
                    SerializedData serializedData = new SerializedData(Utilities.v(string));
                    n8Var = b(serializedData);
                    serializedData.cleanup();
                    if (n8Var.f15129f.isEmpty() && n8Var.f15126b.isEmpty()) {
                        n8Var = new n8();
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(n8Var.f15127c);
                        for (ArrayList arrayList : n8Var.d.values()) {
                            hashSet.addAll(arrayList);
                        }
                        if (!hashSet.isEmpty()) {
                            tr a02 = tr.a0(i7);
                            a02.f27080a.c(new ai.c1(a02, hashSet, i7, 17));
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                n8Var = new n8();
            }
            c7Var.E0 = n8Var;
            c7Var.F0.clear();
            c7Var.F0.addAll(c7Var.E0.f15126b);
            if (j10.i(i7).q()) {
                c7Var.I0 = mp.u1(i7).h7.getInt("story_period", 86400);
            } else {
                c7Var.I0 = 86400;
            }
        }
    }

    public static n8 b(SerializedData serializedData) {
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
                    n8 n8Var = new n8(readInt32, arrayList, 0);
                    ArrayList arrayList5 = n8Var.f15127c;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    HashMap hashMap2 = n8Var.d;
                    hashMap2.clear();
                    hashMap2.putAll(hashMap);
                    return n8Var;
                }
                throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (3)");
            }
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (2)");
        }
        throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy");
    }

    public static void c(SerializedData serializedData, n8 n8Var) {
        int i7 = n8Var.f15125a;
        HashMap hashMap = n8Var.d;
        ArrayList arrayList = n8Var.f15127c;
        serializedData.writeInt32(i7);
        serializedData.writeInt32(481674261);
        ArrayList arrayList2 = n8Var.f15128e;
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
