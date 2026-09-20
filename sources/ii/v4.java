package ii;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public abstract class v4 {
    public static final HashMap f11696a = new HashMap();
    public static final HashMap f11697b = new HashMap();

    public static synchronized void a(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (v4.class) {
            try {
                f11696a.clear();
                f11697b.clear();
                int i10 = 0;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        TLRPC.Photo photo = (TLRPC.Photo) obj;
                        if (photo != null) {
                            f11696a.put(Long.valueOf(photo.f18352id), photo);
                        }
                    }
                }
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        if (document != null) {
                            f11697b.put(Long.valueOf(document.f18334id), document);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
