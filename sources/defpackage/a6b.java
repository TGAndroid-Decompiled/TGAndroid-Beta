package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class a6b extends View {
    public static final int a = 0;

    public static void a(int i, f4b f4bVar) {
        w5b w5bVar;
        if (f4bVar != null) {
            try {
                String string = na7.q1(i).X3.getString("story_privacy2", null);
                if (string == null) {
                    w5bVar = new w5b();
                } else {
                    SerializedData serializedData = new SerializedData(Utilities.v(string));
                    w5bVar = b(serializedData);
                    serializedData.cleanup();
                    if (w5bVar.f.isEmpty() && w5bVar.b.isEmpty()) {
                        w5bVar = new w5b();
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(w5bVar.c);
                        for (ArrayList arrayList : w5bVar.d.values()) {
                            hashSet.addAll(arrayList);
                        }
                        if (!hashSet.isEmpty()) {
                            ad7 Y = ad7.Y(i);
                            Y.a.c(new t79(Y, hashSet, i, (byte) 19));
                        }
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
                w5bVar = new w5b();
            }
            f4bVar.E0 = w5bVar;
            f4bVar.F0.clear();
            f4bVar.F0.addAll(f4bVar.E0.b);
            if (y6c.h(i).p()) {
                f4bVar.I0 = na7.q1(i).X3.getInt("story_period", 86400);
            } else {
                f4bVar.I0 = 86400;
            }
        }
    }

    public static w5b b(SerializedData serializedData) {
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
                            wn4.j("wrong Vector magic in TL_StoryPrivacy (4)");
                            return null;
                        }
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(arrayList2);
                    for (ArrayList arrayList4 : hashMap.values()) {
                        hashSet.addAll(arrayList4);
                    }
                    w5b w5bVar = new w5b(readInt32, arrayList, 0);
                    ArrayList arrayList5 = w5bVar.c;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    HashMap hashMap2 = w5bVar.d;
                    hashMap2.clear();
                    hashMap2.putAll(hashMap);
                    return w5bVar;
                }
                wn4.j("wrong Vector magic in TL_StoryPrivacy (3)");
                return null;
            }
            wn4.j("wrong Vector magic in TL_StoryPrivacy (2)");
            return null;
        }
        wn4.j("wrong Vector magic in TL_StoryPrivacy");
        return null;
    }

    public static void c(SerializedData serializedData, w5b w5bVar) {
        int i = w5bVar.a;
        HashMap hashMap = w5bVar.d;
        ArrayList arrayList = w5bVar.c;
        serializedData.writeInt32(i);
        serializedData.writeInt32(481674261);
        ArrayList arrayList2 = w5bVar.e;
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
