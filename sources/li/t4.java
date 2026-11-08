package li;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public abstract class t4 {
    public static final HashMap f18912a = new HashMap();
    public static final HashMap f18913b = new HashMap();

    public static synchronized void a(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (t4.class) {
            try {
                f18912a.clear();
                f18913b.clear();
                int i7 = 0;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        TLRPC.Photo photo = (TLRPC.Photo) obj;
                        if (photo != null) {
                            f18912a.put(Long.valueOf(photo.f26980id), photo);
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
                            f18913b.put(Long.valueOf(document.f26962id), document);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
