package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class y9b extends View {
    public static final int a = 0;

    public static void a(int i, c8b c8bVar) {
        u9b u9bVar;
        if (c8bVar != null) {
            try {
                String string = uc7.s1(i).Y3.getString("story_privacy2", null);
                if (string == null) {
                    u9bVar = new u9b();
                } else {
                    SerializedData serializedData = new SerializedData(Utilities.v(string));
                    u9bVar = b(serializedData);
                    serializedData.cleanup();
                    if (u9bVar.f.isEmpty() && u9bVar.b.isEmpty()) {
                        u9bVar = new u9b();
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(u9bVar.c);
                        for (ArrayList arrayList : u9bVar.d.values()) {
                            hashSet.addAll(arrayList);
                        }
                        if (!hashSet.isEmpty()) {
                            kf7 a0 = kf7.a0(i);
                            a0.a.c(new a39(a0, hashSet, i, (byte) 20));
                        }
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
                u9bVar = new u9b();
            }
            c8bVar.E0 = u9bVar;
            c8bVar.F0.clear();
            c8bVar.F0.addAll(c8bVar.E0.b);
            if (yac.h(i).p()) {
                c8bVar.I0 = uc7.s1(i).Y3.getInt("story_period", 86400);
            } else {
                c8bVar.I0 = 86400;
            }
        }
    }

    public static u9b b(SerializedData serializedData) {
        boolean z = true;
        int readInt32 = serializedData.readInt32(true);
        if (serializedData.readInt32(true) == 481674261) {
            int readInt322 = serializedData.readInt32(true);
            ArrayList arrayList = new ArrayList(readInt322);
            for (int i = 0; i < readInt322; i++) {
                arrayList.add(TLRPC.InputUser.TLdeserialize(serializedData, serializedData.readInt32(true), true));
            }
            if (serializedData.readInt32(true) == 481674261) {
                int readInt323 = serializedData.readInt32(true);
                ArrayList arrayList2 = new ArrayList(readInt323);
                for (int i2 = 0; i2 < readInt323; i2++) {
                    arrayList2.add(Long.valueOf(serializedData.readInt64(true)));
                }
                if (serializedData.readInt32(true) == 481674261) {
                    int readInt324 = serializedData.readInt32(true);
                    HashMap hashMap = new HashMap();
                    int i3 = 0;
                    while (i3 < readInt324) {
                        long readInt64 = serializedData.readInt64(z);
                        if (serializedData.readInt32(z) == 481674261) {
                            int readInt325 = serializedData.readInt32(z);
                            ArrayList arrayList3 = new ArrayList(readInt325);
                            int i4 = 0;
                            while (i4 < readInt325) {
                                arrayList3.add(Long.valueOf(serializedData.readInt64(z)));
                                i4++;
                                z = true;
                            }
                            hashMap.put(Long.valueOf(readInt64), arrayList3);
                            i3++;
                            z = true;
                        } else {
                            xi4.l("wrong Vector magic in TL_StoryPrivacy (4)");
                            return null;
                        }
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(arrayList2);
                    for (ArrayList arrayList4 : hashMap.values()) {
                        hashSet.addAll(arrayList4);
                    }
                    u9b u9bVar = new u9b(readInt32, arrayList, 0);
                    ArrayList arrayList5 = u9bVar.c;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    HashMap hashMap2 = u9bVar.d;
                    hashMap2.clear();
                    hashMap2.putAll(hashMap);
                    return u9bVar;
                }
                xi4.l("wrong Vector magic in TL_StoryPrivacy (3)");
                return null;
            }
            xi4.l("wrong Vector magic in TL_StoryPrivacy (2)");
            return null;
        }
        xi4.l("wrong Vector magic in TL_StoryPrivacy");
        return null;
    }

    public static void c(SerializedData serializedData, u9b u9bVar) {
        int i = u9bVar.a;
        HashMap hashMap = u9bVar.d;
        ArrayList arrayList = u9bVar.c;
        serializedData.writeInt32(i);
        serializedData.writeInt32(481674261);
        ArrayList arrayList2 = u9bVar.e;
        serializedData.writeInt32(arrayList2.size());
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((TLRPC.InputUser) obj).serializeToStream(serializedData);
        }
        serializedData.writeInt32(481674261);
        serializedData.writeInt32(arrayList.size());
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
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
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                serializedData.writeInt64(((Long) obj3).longValue());
            }
        }
    }
}
