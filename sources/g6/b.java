package g6;

import java.util.Comparator;
public final class b implements Comparator {
    public static final b f6972a = new Object();

    @Override
    public final int compare(Object obj, Object obj2) {
        y5.c cVar = (y5.c) obj;
        y5.c cVar2 = (y5.c) obj2;
        if (!cVar.f50764a.equals(cVar2.f50764a)) {
            return cVar.f50764a.compareTo(cVar2.f50764a);
        }
        return (cVar.e() > cVar2.e() ? 1 : (cVar.e() == cVar2.e() ? 0 : -1));
    }
}
