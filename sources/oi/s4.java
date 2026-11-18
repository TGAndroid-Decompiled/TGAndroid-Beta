package oi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public abstract class s4 {
    public static final HashMap f22356a = new HashMap();
    public static final HashMap f22357b = new HashMap();

    public static synchronized void a(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (s4.class) {
            try {
                f22356a.clear();
                f22357b.clear();
                int i7 = 0;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        TLRPC.Photo photo = (TLRPC.Photo) obj;
                        if (photo != null) {
                            f22356a.put(Long.valueOf(photo.f28427id), photo);
                        }
                    }
                }
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i7 < size2) {
                        Object obj2 = arrayList2.get(i7);
                        i7++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        if (document != null) {
                            f22357b.put(Long.valueOf(document.f28409id), document);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
