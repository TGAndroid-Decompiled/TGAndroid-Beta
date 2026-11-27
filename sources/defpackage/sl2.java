package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
public abstract class sl2 extends yl2 {
    public static final void e(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ur4 ur4Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            edb.a(sb, obj, ur4Var);
        }
        sb.append(charSequence3);
    }

    public static String f(Iterable iterable, String str, String str2, String str3, ur4 ur4Var, int i) {
        String str4;
        String str5;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 32) != 0) {
            ur4Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        e(iterable, sb, str6, str4, str5, "...", ur4Var);
        return sb.toString();
    }

    public static List g(Iterable iterable, int i) {
        Object next;
        iterable.getClass();
        if (i >= 0) {
            x24 x24Var = x24.a;
            if (i == 0) {
                return x24Var;
            }
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return k(iterable);
                }
                if (i == 1) {
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
                    return tl2.a(next);
                }
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (Object obj : iterable) {
                arrayList.add(obj);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                if (size != 1) {
                    return arrayList;
                }
                return tl2.a(arrayList.get(0));
            }
            return x24Var;
        }
        bya.a(qd4.n(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static byte[] h(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            bArr[i] = ((Number) obj).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void i(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static int[] j(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            iArr[i] = ((Number) obj).intValue();
            i++;
        }
        return iArr;
    }

    public static List k(Iterable iterable) {
        ArrayList arrayList;
        Object next;
        iterable.getClass();
        boolean z = iterable instanceof Collection;
        x24 x24Var = x24.a;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return tl2.a(next);
            }
            return x24Var;
        }
        if (z) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            i(iterable, arrayList);
        }
        int size2 = arrayList.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return arrayList;
            }
            return tl2.a(arrayList.get(0));
        }
        return x24Var;
    }

    public static long[] l(Collection collection) {
        collection.getClass();
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static Set m(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(uk6.b(collection.size()));
                    i(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                Set singleton = Collections.singleton(next);
                singleton.getClass();
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            i(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                singleton2.getClass();
                return singleton2;
            }
        }
        return a34.a;
    }
}
