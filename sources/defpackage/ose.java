package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
public abstract class ose {
    public static ArrayList a(Object... objArr) {
        int length = objArr.length;
        awd.b(length, "arraySize");
        ArrayList arrayList = new ArrayList(ype.d(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static AbstractList b(List list, es4 es4Var) {
        if (list instanceof RandomAccess) {
            return new g86(list, es4Var);
        }
        return new h86(list, es4Var);
    }
}
