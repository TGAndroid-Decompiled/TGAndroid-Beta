package kotlin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public abstract class MapsKt__MapsKt {
    public static int mapCapacity(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map mapOf(Pair... pairArr) {
        if (pairArr.length <= 0) {
            return EmptyMap.INSTANCE;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity(pairArr.length));
        putAll(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final void putAll(LinkedHashMap linkedHashMap, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            linkedHashMap.put(pair.first, pair.second);
        }
    }

    public static Map toMap(ArrayList arrayList) {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        int size = arrayList.size();
        if (size == 0) {
            return emptyMap;
        }
        if (size == 1) {
            Pair pair = (Pair) arrayList.get(0);
            Intrinsics.checkNotNullParameter(pair, "pair");
            Map mapSingletonMap = Collections.singletonMap(pair.first, pair.second);
            Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(...)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity(arrayList.size()));
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair2 = (Pair) obj;
            linkedHashMap.put(pair2.first, pair2.second);
        }
        return linkedHashMap;
    }
}
