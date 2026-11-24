package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class wa9 implements jac {
    public final byte a;
    public final zb9 b;
    public final String[] c;
    public final ArrayList d;

    public wa9(zb9 zb9Var, String[] strArr, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = zb9Var;
        this.c = strArr;
        this.d = arrayList;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int intValue;
        String str;
        int intValue2;
        boolean z;
        String str2;
        int i;
        byte b = this.a;
        boolean z2 = false;
        String str3 = " ";
        ArrayList arrayList = this.d;
        String[] strArr = this.c;
        zb9 zb9Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                l7c l7cVar = (l7c) obj2;
                zb9Var.getClass();
                String lowerCase = strArr[0].toLowerCase();
                String I3 = gm.I3(lowerCase);
                qb9 qb9Var = zb9Var.d;
                boolean isEmpty = qb9Var.l.isEmpty();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = qb9Var.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                    boolean z3 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(I3))) {
                        Integer num = (Integer) qb9Var.o.get(Long.valueOf(stargiftattributepattern.document.id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i3 = nb9.b;
                        c6c K = c6c.K(nb9.class);
                        K.H = stargiftattributepattern;
                        K.m = lowerCase;
                        K.A = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            if (!isEmpty && !contains) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                        K.L(z3);
                        arrayList2.add(K);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(gb9.i(jb6.M0(2131749941, null)));
                    return;
                }
                return;
            case 1:
                String str4 = " ";
                ArrayList arrayList3 = (ArrayList) obj;
                l7c l7cVar2 = (l7c) obj2;
                zb9Var.getClass();
                String lowerCase2 = strArr[0].toLowerCase();
                String I32 = gm.I3(lowerCase2);
                qb9 qb9Var2 = zb9Var.d;
                boolean isEmpty2 = qb9Var2.k.isEmpty();
                int size2 = arrayList.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj4 = arrayList.get(i4);
                    i4++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = qb9Var2.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z4 = !contains2;
                    if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                        str = str4;
                        if (!hg9.s(str, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !stargiftattributebackdrop.name.toLowerCase().contains(str.concat(I32))) {
                            str4 = str;
                        }
                    } else {
                        str = str4;
                    }
                    Integer num2 = (Integer) qb9Var2.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    if (num2 == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = num2.intValue();
                    }
                    int i5 = db9.b;
                    c6c K2 = c6c.K(db9.class);
                    K2.H = stargiftattributebackdrop;
                    K2.m = lowerCase2;
                    K2.A = intValue2;
                    if (!TextUtils.isEmpty(lowerCase2)) {
                        if (!isEmpty2 && !contains2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                    K2.L(z4);
                    arrayList3.add(K2);
                    str4 = str;
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(gb9.i(jb6.M0(2131749948, null)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                l7c l7cVar3 = (l7c) obj2;
                zb9Var.getClass();
                String lowerCase3 = strArr[0].toLowerCase();
                String I33 = gm.I3(lowerCase3);
                qb9 qb9Var3 = zb9Var.d;
                boolean isEmpty3 = qb9Var3.j.isEmpty();
                int size3 = arrayList.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj5 = arrayList.get(i6);
                    i6++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean contains3 = qb9Var3.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                    boolean z5 = !contains3;
                    if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributemodel.name.toLowerCase().startsWith(I33) && !hg9.s(str3, lowerCase3, stargiftattributemodel.name.toLowerCase())) {
                        z = z2;
                        if (!stargiftattributemodel.name.toLowerCase().contains(str3.concat(I33))) {
                            str2 = str3;
                            z2 = z;
                            str3 = str2;
                        }
                    } else {
                        z = z2;
                    }
                    str2 = str3;
                    Integer num3 = (Integer) qb9Var3.m.get(Long.valueOf(stargiftattributemodel.document.id));
                    if (num3 == null) {
                        i = z;
                    } else {
                        i = num3.intValue();
                    }
                    int i7 = kb9.b;
                    c6c K3 = c6c.K(kb9.class);
                    K3.H = stargiftattributemodel;
                    K3.m = lowerCase3;
                    K3.A = i;
                    if (!TextUtils.isEmpty(lowerCase3)) {
                        if (!isEmpty3 && !contains3) {
                            z5 = true;
                        } else {
                            z5 = z;
                        }
                    }
                    K3.L(z5);
                    arrayList4.add(K3);
                    z2 = z;
                    str3 = str2;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(gb9.i(jb6.M0(2131749943, null)));
                    return;
                }
                return;
        }
    }
}
