package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
public final class o4 implements s10 {
    public final int f3754a;
    public final a6 f3755b;
    public final String[] f3756c;
    public final ArrayList d;

    public o4(a6 a6Var, String[] strArr, ArrayList arrayList, int i7) {
        this.f3754a = i7;
        this.f3755b = a6Var;
        this.f3756c = strArr;
        this.d = arrayList;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        int i7;
        int i10 = this.f3754a;
        boolean z10 = false;
        ArrayList arrayList = this.d;
        String[] strArr = this.f3756c;
        a6 a6Var = this.f3755b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                p41 p41Var = (p41) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String N3 = org.telegram.messenger.g0.N3(lowerCase);
                o5 o5Var = a6Var.d;
                boolean isEmpty = o5Var.f3764j.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                    boolean contains = o5Var.f3764j.contains(Long.valueOf(stargiftattributemodel.document.f28057id));
                    boolean z11 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || i5.c.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                        Integer num = (Integer) o5Var.f3767m.get(Long.valueOf(stargiftattributemodel.document.f28057id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i12 = i5.f3621b;
                        b41 K = b41.K(i5.class);
                        K.G = stargiftattributemodel;
                        K.f33184l = lowerCase;
                        K.f33197z = intValue;
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
                    arrayList2.add(d5.i(hd.M0(2131750010, null)));
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                p41 p41Var2 = (p41) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                o5 o5Var2 = a6Var.d;
                boolean isEmpty2 = o5Var2.f3765k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = o5Var2.f3765k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z12 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || i5.c.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                        Integer num2 = (Integer) o5Var2.f3768n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            intValue2 = num2.intValue();
                        }
                        int i14 = a5.f3377b;
                        b41 K2 = b41.K(a5.class);
                        K2.G = stargiftattributebackdrop;
                        K2.f33184l = lowerCase2;
                        K2.f33197z = intValue2;
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
                    arrayList3.add(d5.i(hd.M0(2131750015, null)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                p41 p41Var3 = (p41) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String N33 = org.telegram.messenger.g0.N3(lowerCase3);
                o5 o5Var3 = a6Var.d;
                boolean isEmpty3 = o5Var3.f3766l.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                    boolean z13 = z10;
                    boolean contains3 = o5Var3.f3766l.contains(Long.valueOf(stargiftattributepattern.document.f28057id));
                    boolean z14 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || i5.c.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                        Integer num3 = (Integer) o5Var3.f3769o.get(Long.valueOf(stargiftattributepattern.document.f28057id));
                        if (num3 == null) {
                            i7 = z13;
                        } else {
                            i7 = num3.intValue();
                        }
                        int i16 = l5.f3679b;
                        b41 K3 = b41.K(l5.class);
                        K3.G = stargiftattributepattern;
                        K3.f33184l = lowerCase3;
                        K3.f33197z = i7;
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
                    arrayList4.add(d5.i(hd.M0(2131750008, null)));
                    return;
                }
                return;
        }
    }
}
