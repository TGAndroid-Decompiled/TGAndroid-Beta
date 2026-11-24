package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public abstract class c8b extends View {
    public static final int a = 0;

    public static void a(int i, g6b g6bVar) {
        y7b y7bVar;
        if (g6bVar != null) {
            try {
                String string = oc7.r1(i).X3.getString("story_privacy2", null);
                if (string == null) {
                    y7bVar = new y7b();
                } else {
                    SerializedData serializedData = new SerializedData(Utilities.v(string));
                    y7bVar = b(serializedData);
                    serializedData.cleanup();
                    if (y7bVar.f.isEmpty() && y7bVar.b.isEmpty()) {
                        y7bVar = new y7b();
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(y7bVar.c);
                        for (ArrayList arrayList : y7bVar.d.values()) {
                            hashSet.addAll(arrayList);
                        }
                        if (!hashSet.isEmpty()) {
                            cf7 Y = cf7.Y(i);
                            Y.a.c(new v99(Y, hashSet, i, (byte) 19));
                        }
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
                y7bVar = new y7b();
            }
            g6bVar.E0 = y7bVar;
            g6bVar.F0.clear();
            g6bVar.F0.addAll(g6bVar.E0.b);
            if (z8c.h(i).p()) {
                g6bVar.I0 = oc7.r1(i).X3.getInt("story_period", 86400);
            } else {
                g6bVar.I0 = 86400;
            }
        }
    }

    public static y7b b(SerializedData serializedData) {
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
                            zo4.k("wrong Vector magic in TL_StoryPrivacy (4)");
                            return null;
                        }
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(arrayList2);
                    for (ArrayList arrayList4 : hashMap.values()) {
                        hashSet.addAll(arrayList4);
                    }
                    y7b y7bVar = new y7b(readInt32, arrayList, 0);
                    ArrayList arrayList5 = y7bVar.c;
                    arrayList5.clear();
                    arrayList5.addAll(arrayList2);
                    HashMap hashMap2 = y7bVar.d;
                    hashMap2.clear();
                    hashMap2.putAll(hashMap);
                    return y7bVar;
                }
                zo4.k("wrong Vector magic in TL_StoryPrivacy (3)");
                return null;
            }
            zo4.k("wrong Vector magic in TL_StoryPrivacy (2)");
            return null;
        }
        zo4.k("wrong Vector magic in TL_StoryPrivacy");
        return null;
    }

    public static void c(SerializedData serializedData, y7b y7bVar) {
        int i = y7bVar.a;
        HashMap hashMap = y7bVar.d;
        ArrayList arrayList = y7bVar.c;
        serializedData.writeInt32(i);
        serializedData.writeInt32(481674261);
        ArrayList arrayList2 = y7bVar.e;
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
