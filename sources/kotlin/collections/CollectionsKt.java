package kotlin.collections;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__AppendableKt;

public abstract class CollectionsKt extends CollectionsKt__MutableCollectionsKt {
    public static ArrayList filterNotNull(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void joinTo(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            StringsKt__AppendableKt.appendElement(sb, obj, function1);
        }
        sb.append(charSequence3);
    }

    public static String joinToString$default(Iterable iterable, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        StringBuilder sb = new StringBuilder();
        joinTo(iterable, sb, str4, str5, str6, "...", function1);
        return sb.toString();
    }

    public static List take(Iterable iterable, int i) {
        Object next;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(SurfaceContainer$$ExternalSyntheticOutline0.m(i, "Requested element count ", " is less than zero.").toString());
        }
        EmptyList emptyList = EmptyList.INSTANCE;
        if (i == 0) {
            return emptyList;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return toList(iterable);
            }
            if (i == 1) {
                if (iterable instanceof List) {
                    List list = (List) iterable;
                    if (list.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    next = list.get(0);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    next = it.next();
                }
                return CollectionsKt__CollectionsJVMKt.listOf(next);
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it2 = iterable.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        int size = arrayList.size();
        if (size != 0) {
            return size != 1 ? arrayList : CollectionsKt__CollectionsJVMKt.listOf(arrayList.get(0));
        }
        return emptyList;
    }

    public static byte[] toByteArray(ArrayList arrayList) {
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

    public static final void toCollection(Iterable iterable, AbstractCollection abstractCollection) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] toIntArray(ArrayList arrayList) {
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

    public static List toList(Iterable iterable) {
        ArrayList mutableList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        EmptyList emptyList = EmptyList.INSTANCE;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return emptyList;
            }
            if (size != 1) {
                return toMutableList(collection);
            }
            return CollectionsKt__CollectionsJVMKt.listOf(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (z) {
            mutableList = toMutableList((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            toCollection(iterable, arrayList);
            mutableList = arrayList;
        }
        int size2 = mutableList.size();
        if (size2 != 0) {
            return size2 != 1 ? mutableList : CollectionsKt__CollectionsJVMKt.listOf(mutableList.get(0));
        }
        return emptyList;
    }

    public static long[] toLongArray(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList toMutableList(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set toSet(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        EmptySet emptySet = EmptySet.INSTANCE;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsKt.mapCapacity(collection.size()));
                    toCollection(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(...)");
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            toCollection(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                Intrinsics.checkNotNullExpressionValue(setSingleton2, "singleton(...)");
                return setSingleton2;
            }
        }
        return emptySet;
    }
}
