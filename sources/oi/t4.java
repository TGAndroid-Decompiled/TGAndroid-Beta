package oi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public abstract class t4 {
    public static final HashMap f22517a = new HashMap();
    public static final HashMap f22518b = new HashMap();

    public static synchronized void a(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (t4.class) {
            try {
                f22517a.clear();
                f22518b.clear();
                int i7 = 0;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        TLRPC.Photo photo = (TLRPC.Photo) obj;
                        if (photo != null) {
                            f22517a.put(Long.valueOf(photo.f28516id), photo);
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
                            f22518b.put(Long.valueOf(document.f28498id), document);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
