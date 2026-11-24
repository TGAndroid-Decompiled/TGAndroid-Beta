package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
public abstract class wpe {
    public static ArrayList a(Object... objArr) {
        int length = objArr.length;
        ntd.b(length, "arraySize");
        ArrayList arrayList = new ArrayList(ine.d(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static AbstractList b(List list, bs4 bs4Var) {
        if (list instanceof RandomAccess) {
            return new c86(list, bs4Var);
        }
        return new d86(list, bs4Var);
    }
}
