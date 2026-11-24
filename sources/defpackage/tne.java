package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
public abstract class tne {
    public static ArrayList a(Object... objArr) {
        int length = objArr.length;
        krd.b(length, "arraySize");
        ArrayList arrayList = new ArrayList(gle.d(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static AbstractList b(List list, aq4 aq4Var) {
        if (list instanceof RandomAccess) {
            return new c66(list, aq4Var);
        }
        return new d66(list, aq4Var);
    }
}
