package e6;

import java.util.Comparator;
public final class b implements Comparator {
    public static final b f5832a = new Object();

    @Override
    public final int compare(Object obj, Object obj2) {
        w5.c cVar = (w5.c) obj;
        w5.c cVar2 = (w5.c) obj2;
        if (!cVar.f49764a.equals(cVar2.f49764a)) {
            return cVar.f49764a.compareTo(cVar2.f49764a);
        }
        return (cVar.b() > cVar2.b() ? 1 : (cVar.b() == cVar2.b() ? 0 : -1));
    }
}
