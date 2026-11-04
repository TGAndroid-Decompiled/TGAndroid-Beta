package gi;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class u8 extends View {
    public static final int f13663a = 0;

    public static void a(int i3, f7 f7Var) {
        r8 r8Var;
        if (f7Var != null) {
            try {
                String string = hp.s1(i3).f22999e7.getString("story_privacy2", null);
                if (string == null) {
                    r8Var = new r8();
                } else {
                    SerializedData serializedData = new SerializedData(Utilities.v(string));
                    r8Var = b(serializedData);
                    serializedData.cleanup();
                    if (r8Var.f13530f.isEmpty() && r8Var.f13527b.isEmpty()) {
                        r8Var = new r8();
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(r8Var.f13528c);
                        for (ArrayList arrayList : r8Var.d.values()) {
                            hashSet.addAll(arrayList);
                        }
                        if (!hashSet.isEmpty()) {
                            qr a02 = qr.a0(i3);
                            a02.f24934a.c(new ai.e3(a02, hashSet, i3, 14));
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                r8Var = new r8();
            }
            f7Var.E0 = r8Var;
            f7Var.F0.clear();
            f7Var.F0.addAll(f7Var.E0.f13527b);
            if (h10.i(i3).q()) {
                f7Var.I0 = hp.s1(i3).f22999e7.getInt("story_period", 86400);
            } else {
                f7Var.I0 = 86400;
            }
        }
    }

    public static r8 b(SerializedData serializedData) {
        int readInt32 = serializedData.readInt32(true);
        if (serializedData.readInt32(true) == 481674261) {
            int readInt322 = serializedData.readInt32(true);
            ArrayList arrayList = new ArrayList(readInt322);
            for (int i3 = 0; i3 < readInt322; i3++) {
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
                    r8 r8Var = new r8(readInt32, arrayList, 0);
                    ArrayList arrayList5 = r8Var.f13528c;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    HashMap hashMap2 = r8Var.d;
                    hashMap2.clear();
                    hashMap2.putAll(hashMap);
                    return r8Var;
                }
                throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (3)");
            }
            throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy (2)");
        }
        throw new RuntimeException("wrong Vector magic in TL_StoryPrivacy");
    }

    public static void c(SerializedData serializedData, r8 r8Var) {
        int i3 = r8Var.f13526a;
        HashMap hashMap = r8Var.d;
        ArrayList arrayList = r8Var.f13528c;
        serializedData.writeInt32(i3);
        serializedData.writeInt32(481674261);
        ArrayList arrayList2 = r8Var.f13529e;
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
