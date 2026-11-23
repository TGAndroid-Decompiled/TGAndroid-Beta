package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.n41;
public final class b7 implements p10 {
    public final int f3416a;
    public final m8 f3417b;
    public final String[] f3418c;
    public final ArrayList d;

    public b7(m8 m8Var, String[] strArr, ArrayList arrayList, int i7) {
        this.f3416a = i7;
        this.f3417b = m8Var;
        this.f3418c = strArr;
        this.d = arrayList;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        int i7;
        int i10 = this.f3416a;
        boolean z10 = false;
        ArrayList arrayList = this.d;
        String[] strArr = this.f3418c;
        m8 m8Var = this.f3417b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                b51 b51Var = (b51) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String M3 = org.telegram.messenger.g0.M3(lowerCase);
                a8 a8Var = m8Var.d;
                boolean isEmpty = a8Var.f3370l.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = a8Var.f3370l.contains(Long.valueOf(stargiftattributepattern.document.f28498id));
                    boolean z11 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M3))) {
                        Integer num = (Integer) a8Var.f3373o.get(Long.valueOf(stargiftattributepattern.document.f28498id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i12 = x7.f4221b;
                        n41 K = n41.K(x7.class);
                        K.H = stargiftattributepattern;
                        K.f37655m = lowerCase;
                        K.A = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            if (!isEmpty && !contains) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        K.L(z11);
                        arrayList2.add(K);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(p7.i(gd.N0(2131749991, null)));
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                b51 b51Var2 = (b51) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                a8 a8Var2 = m8Var.d;
                boolean isEmpty2 = a8Var2.f3369k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = a8Var2.f3369k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z12 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                        Integer num2 = (Integer) a8Var2.f3372n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            intValue2 = num2.intValue();
                        }
                        int i14 = m7.f3848b;
                        n41 K2 = n41.K(m7.class);
                        K2.H = stargiftattributebackdrop;
                        K2.f37655m = lowerCase2;
                        K2.A = intValue2;
                        if (!TextUtils.isEmpty(lowerCase2)) {
                            if (!isEmpty2 && !contains2) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        K2.L(z12);
                        arrayList3.add(K2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(p7.i(gd.N0(2131749998, null)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                b51 b51Var3 = (b51) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                a8 a8Var3 = m8Var.d;
                boolean isEmpty3 = a8Var3.f3368j.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean z13 = z10;
                    boolean contains3 = a8Var3.f3368j.contains(Long.valueOf(stargiftattributemodel.document.f28498id));
                    boolean z14 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M33))) {
                        Integer num3 = (Integer) a8Var3.f3371m.get(Long.valueOf(stargiftattributemodel.document.f28498id));
                        if (num3 == null) {
                            i7 = z13;
                        } else {
                            i7 = num3.intValue();
                        }
                        int i16 = u7.f4127b;
                        n41 K3 = n41.K(u7.class);
                        K3.H = stargiftattributemodel;
                        K3.f37655m = lowerCase3;
                        K3.A = i7;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            if (!isEmpty3 && !contains3) {
                                z14 = true;
                            } else {
                                z14 = z13;
                            }
                        }
                        K3.L(z14);
                        arrayList4.add(K3);
                    }
                    z10 = z13;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(p7.i(gd.N0(2131749993, null)));
                    return;
                }
                return;
        }
    }
}
