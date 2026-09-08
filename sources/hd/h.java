package hd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public abstract class h {
    public static int a(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static List b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static List c(Object... objArr) {
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            kotlin.jvm.internal.i.d(asList, "asList(...)");
            return asList;
        }
        return o.f10982a;
    }
}
