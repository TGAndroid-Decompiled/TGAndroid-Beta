package d6;

import java.util.Comparator;

public final class b implements Comparator {

    public static final b f4864a = new b();

    @Override
    public final int compare(Object obj, Object obj2) {
        v5.c cVar = (v5.c) obj;
        v5.c cVar2 = (v5.c) obj2;
        return !cVar.f48790a.equals(cVar2.f48790a) ? cVar.f48790a.compareTo(cVar2.f48790a) : (cVar.b() > cVar2.b() ? 1 : (cVar.b() == cVar2.b() ? 0 : -1));
    }
}
