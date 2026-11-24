package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public abstract class qde {
    protected int zza;

    public static void a(List list, List list2) {
        Charset charset = foe.a;
        list.getClass();
        if (list instanceof ere) {
            List zzd = ((ere) list).zzd();
            ere ereVar = (ere) list2;
            int size = list2.size();
            for (Object obj : zzd) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(ereVar.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = ereVar.size() - 1; size2 >= size; size2--) {
                        ereVar.remove(size2);
                    }
                    fvc.f(sb2);
                    return;
                } else if (obj instanceof sie) {
                    ereVar.e((sie) obj);
                } else {
                    ereVar.add((String) obj);
                }
            }
        } else if (list instanceof yve) {
            list2.addAll(list);
        } else {
            if ((list2 instanceof ArrayList) && (list instanceof Collection)) {
                ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
            }
            int size3 = list2.size();
            for (Object obj2 : list) {
                if (obj2 == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list2.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list2.size() - 1; size4 >= size3; size4--) {
                        list2.remove(size4);
                    }
                    fvc.f(sb4);
                    return;
                }
                list2.add(obj2);
            }
        }
    }

    public abstract void b(int i);

    public abstract int c();
}
