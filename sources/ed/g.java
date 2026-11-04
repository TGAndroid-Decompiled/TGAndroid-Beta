package ed;

import b8.tb;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import k2.p1;
public abstract class g extends m {
    public static final void f(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, od.l lVar) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        sb2.append(charSequence2);
        int i3 = 0;
        for (Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                sb2.append(charSequence);
            }
            ud.e.a(sb2, obj, lVar);
        }
        sb2.append(charSequence3);
    }

    public static String g(Iterable iterable, String str, String str2, String str3, od.l lVar, int i3) {
        String prefix;
        String str4;
        if ((i3 & 1) != 0) {
            str = ", ";
        }
        String str5 = str;
        if ((i3 & 2) != 0) {
            prefix = "";
        } else {
            prefix = str2;
        }
        if ((i3 & 4) != 0) {
            str4 = "";
        } else {
            str4 = str3;
        }
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.j.e(iterable, "<this>");
        kotlin.jvm.internal.j.e(prefix, "prefix");
        StringBuilder sb2 = new StringBuilder();
        f(iterable, sb2, str5, prefix, str4, "...", lVar);
        return sb2.toString();
    }

    public static List h(Iterable iterable, int i3) {
        Object next;
        kotlin.jvm.internal.j.e(iterable, "<this>");
        if (i3 >= 0) {
            o oVar = o.f9953a;
            if (i3 == 0) {
                return oVar;
            }
            if (iterable instanceof Collection) {
                if (i3 >= ((Collection) iterable).size()) {
                    return l(iterable);
                }
                if (i3 == 1) {
                    if (iterable instanceof List) {
                        List list = (List) iterable;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                        } else {
                            throw new NoSuchElementException("List is empty.");
                        }
                    } else {
                        Iterator it = iterable.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                    }
                    return tb.a(next);
                }
            }
            ArrayList arrayList = new ArrayList(i3);
            int i10 = 0;
            for (Object obj : iterable) {
                arrayList.add(obj);
                i10++;
                if (i10 == i3) {
                    break;
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                if (size != 1) {
                    return arrayList;
                }
                return tb.a(arrayList.get(0));
            }
            return oVar;
        }
        throw new IllegalArgumentException(p1.j(i3, "Requested element count ", " is less than zero.").toString());
    }

    public static byte[] i(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bArr[i3] = ((Number) obj).byteValue();
            i3++;
        }
        return bArr;
    }

    public static final void j(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static int[] k(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            iArr[i3] = ((Number) obj).intValue();
            i3++;
        }
        return iArr;
    }

    public static List l(Iterable iterable) {
        ArrayList arrayList;
        Object next;
        kotlin.jvm.internal.j.e(iterable, "<this>");
        boolean z10 = iterable instanceof Collection;
        o oVar = o.f9953a;
        if (z10) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return n(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return tb.a(next);
            }
            return oVar;
        }
        if (z10) {
            arrayList = n((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            j(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return arrayList;
            }
            return tb.a(arrayList.get(0));
        }
        return oVar;
    }

    public static long[] m(Collection collection) {
        kotlin.jvm.internal.j.e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            jArr[i3] = ((Number) it.next()).longValue();
            i3++;
        }
        return jArr;
    }

    public static ArrayList n(Collection collection) {
        kotlin.jvm.internal.j.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set o(Iterable iterable) {
        Object next;
        kotlin.jvm.internal.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(s.b(collection.size()));
                    j(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                Set singleton = Collections.singleton(next);
                kotlin.jvm.internal.j.d(singleton, "singleton(...)");
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            j(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                kotlin.jvm.internal.j.d(singleton2, "singleton(...)");
                return singleton2;
            }
        }
        return q.f9955a;
    }
}
