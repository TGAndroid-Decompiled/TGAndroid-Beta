package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.r31;
public final class x4 implements n10 {
    public final int f1100a;
    public final i6 f1101b;
    public final String[] f1102c;
    public final ArrayList d;

    public x4(i6 i6Var, String[] strArr, ArrayList arrayList, int i3) {
        this.f1100a = i3;
        this.f1101b = i6Var;
        this.f1102c = strArr;
        this.d = arrayList;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        int i3;
        int i10 = this.f1100a;
        boolean z10 = false;
        ArrayList arrayList = this.d;
        String[] strArr = this.f1102c;
        i6 i6Var = this.f1101b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String O3 = org.telegram.messenger.g0.O3(lowerCase);
                w5 w5Var = i6Var.d;
                boolean isEmpty = w5Var.f1076l.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = w5Var.f1076l.contains(Long.valueOf(stargiftattributepattern.document.f27007id));
                    boolean z11 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O3))) {
                        Integer num = (Integer) w5Var.f1079o.get(Long.valueOf(stargiftattributepattern.document.f27007id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i12 = t5.f988b;
                        r31 K = r31.K(t5.class);
                        K.G = stargiftattributepattern;
                        K.f37627l = lowerCase;
                        K.f37640z = intValue;
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
                    arrayList2.add(m5.i(bd.M0(2131750016, null)));
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                f41 f41Var2 = (f41) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                w5 w5Var2 = i6Var.d;
                boolean isEmpty2 = w5Var2.f1075k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = w5Var2.f1075k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z12 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                        Integer num2 = (Integer) w5Var2.f1078n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            intValue2 = num2.intValue();
                        }
                        int i14 = k5.f766b;
                        r31 K2 = r31.K(k5.class);
                        K2.G = stargiftattributebackdrop;
                        K2.f37627l = lowerCase2;
                        K2.f37640z = intValue2;
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
                    arrayList3.add(m5.i(bd.M0(2131750023, null)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                f41 f41Var3 = (f41) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                w5 w5Var3 = i6Var.d;
                boolean isEmpty3 = w5Var3.f1074j.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean z13 = z10;
                    boolean contains3 = w5Var3.f1074j.contains(Long.valueOf(stargiftattributemodel.document.f27007id));
                    boolean z14 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O33))) {
                        Integer num3 = (Integer) w5Var3.f1077m.get(Long.valueOf(stargiftattributemodel.document.f27007id));
                        if (num3 == null) {
                            i3 = z13;
                        } else {
                            i3 = num3.intValue();
                        }
                        int i16 = q5.f928b;
                        r31 K3 = r31.K(q5.class);
                        K3.G = stargiftattributemodel;
                        K3.f37627l = lowerCase3;
                        K3.f37640z = i3;
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
                    arrayList4.add(m5.i(bd.M0(2131750018, null)));
                    return;
                }
                return;
        }
    }
}
