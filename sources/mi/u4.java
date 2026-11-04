package mi;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public abstract class u4 {
    public static final HashMap f19972a = new HashMap();
    public static final HashMap f19973b = new HashMap();

    public static synchronized void a(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (u4.class) {
            try {
                f19972a.clear();
                f19973b.clear();
                int i3 = 0;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        TLRPC.Photo photo = (TLRPC.Photo) obj;
                        if (photo != null) {
                            f19972a.put(Long.valueOf(photo.f27025id), photo);
                        }
                    }
                }
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i3 < size2) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        if (document != null) {
                            f19973b.put(Long.valueOf(document.f27007id), document);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
