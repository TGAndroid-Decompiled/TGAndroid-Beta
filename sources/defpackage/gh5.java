package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class gh5 extends hh5 {
    public static final gh5 o;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final go4 j;
    public final List k;
    public final Map l;
    public final List m;
    public final mj4 n;

    static {
        List list = Collections.EMPTY_LIST;
        o = new gh5("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list, null);
    }

    public gh5(String str, List list, List list2, List list3, List list4, List list5, List list6, go4 go4Var, List list7, boolean z, Map map, List list8, mj4 mj4Var) {
        super(str, list, z);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            Uri uri = ((fh5) list2.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f = DesugarCollections.unmodifiableList(list3);
        this.g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.i = DesugarCollections.unmodifiableList(list6);
        this.j = go4Var;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.k = list9;
        this.l = DesugarCollections.unmodifiableMap(map);
        this.m = DesugarCollections.unmodifiableList(list8);
        this.n = mj4Var;
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i = 0; i < list.size(); i++) {
            Uri uri = ((eh5) list.get(i)).a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(List list, int i, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 < list2.size()) {
                    vab vabVar = (vab) list2.get(i3);
                    if (vabVar.b == i && vabVar.c == i2) {
                        arrayList.add(obj);
                        break;
                    }
                    i3++;
                }
            }
        }
        return arrayList;
    }

    @Override
    public final Object a(List list) {
        ArrayList c = c(this.e, 0, list);
        List list2 = Collections.EMPTY_LIST;
        return new gh5(this.a, this.b, c, list2, c(this.g, 1, list), c(this.h, 2, list), list2, this.j, this.k, this.c, this.l, this.m, this.n);
    }
}
