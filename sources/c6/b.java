package c6;

import java.util.Comparator;
public final class b implements Comparator {
    public static final b f2320a = new Object();

    @Override
    public final int compare(Object obj, Object obj2) {
        u5.c cVar = (u5.c) obj;
        u5.c cVar2 = (u5.c) obj2;
        if (!cVar.f48105a.equals(cVar2.f48105a)) {
            return cVar.f48105a.compareTo(cVar2.f48105a);
        }
        return (cVar.b() > cVar2.b() ? 1 : (cVar.b() == cVar2.b() ? 0 : -1));
    }
}
