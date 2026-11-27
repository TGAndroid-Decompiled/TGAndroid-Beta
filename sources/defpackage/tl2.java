package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public abstract class tl2 {
    public static List a(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List b(Object... objArr) {
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            asList.getClass();
            return asList;
        }
        return x24.a;
    }
}
