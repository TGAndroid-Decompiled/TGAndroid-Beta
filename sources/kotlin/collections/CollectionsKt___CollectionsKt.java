package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
public class CollectionsKt___CollectionsKt extends CollectionsKt___CollectionsJvmKt {
    public static final <T, C extends Collection<? super T>> C toCollection(Iterable<? extends T> iterable, C destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t : iterable) {
            destination.add(t);
        }
        return destination;
    }

    public static <T> List<T> toList(Iterable<? extends T> iterable) {
        List<T> optimizeReadOnlyList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return toMutableList(collection);
                }
                return CollectionsKt__CollectionsJVMKt.listOf(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
        optimizeReadOnlyList = CollectionsKt__CollectionsKt.optimizeReadOnlyList(toMutableList(iterable));
        return optimizeReadOnlyList;
    }

    public static final <T> List<T> toMutableList(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return toMutableList((Collection) iterable);
        }
        return (List) toCollection(iterable, new ArrayList());
    }

    public static final <T> List<T> toMutableList(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> toSet(Iterable<? extends T> iterable) {
        int mapCapacity;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return SetsKt__SetsJVMKt.setOf(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                }
                mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collection.size());
                return (Set) toCollection(iterable, new LinkedHashSet(mapCapacity));
            }
            return SetsKt__SetsKt.emptySet();
        }
        return SetsKt__SetsKt.optimizeReadOnlySet((Set) toCollection(iterable, new LinkedHashSet()));
    }

    public static <T, R> List<Pair<T, R>> zip(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(collectionSizeOrDefault, collectionSizeOrDefault2));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(TuplesKt.to(it.next(), it2.next()));
        }
        return arrayList;
    }
}
