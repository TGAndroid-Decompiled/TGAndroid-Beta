package hi;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class l9 extends View {
    public static final int f14846a = 0;

    public static void a(int i7, x7 x7Var) {
        i9 i9Var;
        if (x7Var != null) {
            try {
                String string = mp.u1(i7).h7.getString("story_privacy2", null);
                if (string == null) {
                    i9Var = new i9();
                } else {
                    SerializedData serializedData = new SerializedData(Utilities.v(string));
                    i9Var = b(serializedData);
                    serializedData.cleanup();
                    if (i9Var.f14705f.isEmpty() && i9Var.f14702b.isEmpty()) {
                        i9Var = new i9();
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(i9Var.f14703c);
                        for (ArrayList arrayList : i9Var.d.values()) {
                            hashSet.addAll(arrayList);
                        }
                        if (!hashSet.isEmpty()) {
                            tr a02 = tr.a0(i7);
                            a02.f27149a.c(new ai.e1(a02, hashSet, i7, 16));
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                i9Var = new i9();
            }
            x7Var.E0 = i9Var;
            x7Var.F0.clear();
            x7Var.F0.addAll(x7Var.E0.f14702b);
            if (i10.i(i7).q()) {
                x7Var.I0 = mp.u1(i7).h7.getInt("story_period", 86400);
            } else {
                x7Var.I0 = 86400;
            }
        }
    }

    public static i9 b(SerializedData serializedData) {
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
                    i9 i9Var = new i9(readInt32, arrayList, 0);
                    ArrayList arrayList5 = i9Var.f14703c;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    HashMap hashMap2 = i9Var.d;
                    hashMap2.clear();
                    hashMap2.putAll(hashMap);
                    return i9Var;
                }
                throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (3)");
            }
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (2)");
        }
        throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy");
    }

    public static void c(SerializedData serializedData, i9 i9Var) {
        int i7 = i9Var.f14701a;
        HashMap hashMap = i9Var.d;
        ArrayList arrayList = i9Var.f14703c;
        serializedData.writeInt32(i7);
        serializedData.writeInt32(481674261);
        ArrayList arrayList2 = i9Var.f14704e;
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
