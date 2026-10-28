package kd;

import a8.ud;
import java.util.Arrays;
import java.util.List;
public abstract class h extends ud {
    public static int b(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static List c(Object... objArr) {
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            kotlin.jvm.internal.i.d(asList, "asList(...)");
            return asList;
        }
        return o.f16524a;
    }
}
