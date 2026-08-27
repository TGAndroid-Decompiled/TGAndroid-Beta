package gh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.n41;

public final class g4 implements Utilities.Callback2 {

    public final int f7271a;

    public final y5 f7272b;

    public final String[] f7273c;
    public final ArrayList d;

    public g4(y5 y5Var, String[] strArr, ArrayList arrayList, int i10) {
        this.f7271a = i10;
        this.f7272b = y5Var;
        this.f7273c = strArr;
        this.d = arrayList;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        int i10 = this.f7271a;
        String str2 = " ";
        ArrayList arrayList = this.d;
        String[] strArr = this.f7273c;
        y5 y5Var = this.f7272b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                String lowerCase = strArr[0].toLowerCase();
                String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
                i5 i5Var = y5Var.d;
                boolean zIsEmpty = i5Var.f7332l.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean zContains = i5Var.f7332l.contains(Long.valueOf(stargiftattributepattern.document.f22386id));
                    boolean z10 = !zContains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(strTranslitSafe) || org.telegram.messenger.y1.x(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || org.telegram.messenger.y1.x(" ", strTranslitSafe, stargiftattributepattern.name.toLowerCase())) {
                        Integer num = (Integer) i5Var.f7335o.get(Long.valueOf(stargiftattributepattern.document.f22386id));
                        int iIntValue = num == null ? 0 : num.intValue();
                        int i12 = f5.f7256a;
                        n41 n41VarJ = n41.J(f5.class);
                        n41VarJ.G = stargiftattributepattern;
                        n41VarJ.f30844l = lowerCase;
                        n41VarJ.f30857z = iIntValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            z10 = (zIsEmpty || zContains) ? false : true;
                        }
                        n41VarJ.K(z10);
                        arrayList2.add(n41VarJ);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(x4.a(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
                }
                break;
            case 1:
                String str3 = " ";
                ArrayList arrayList3 = (ArrayList) obj;
                String lowerCase2 = strArr[0].toLowerCase();
                String strTranslitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                i5 i5Var2 = y5Var.d;
                boolean zIsEmpty2 = i5Var2.f7331k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean zContains2 = i5Var2.f7331k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z11 = !zContains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(strTranslitSafe2)) {
                        str = str3;
                    } else {
                        str = str3;
                        if (org.telegram.messenger.y1.x(str, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || org.telegram.messenger.y1.x(str, strTranslitSafe2, stargiftattributebackdrop.name.toLowerCase())) {
                        }
                        str3 = str;
                    }
                    Integer num2 = (Integer) i5Var2.f7334n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    int iIntValue2 = num2 == null ? 0 : num2.intValue();
                    int i14 = v4.f7593a;
                    n41 n41VarJ2 = n41.J(v4.class);
                    n41VarJ2.G = stargiftattributebackdrop;
                    n41VarJ2.f30844l = lowerCase2;
                    n41VarJ2.f30857z = iIntValue2;
                    if (!TextUtils.isEmpty(lowerCase2)) {
                        z11 = (zIsEmpty2 || zContains2) ? false : true;
                    }
                    n41VarJ2.K(z11);
                    arrayList3.add(n41VarJ2);
                    str3 = str;
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(x4.a(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
                }
                break;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                String lowerCase3 = strArr[0].toLowerCase();
                String strTranslitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                i5 i5Var3 = y5Var.d;
                boolean zIsEmpty3 = i5Var3.f7330j.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean zContains3 = i5Var3.f7330j.contains(Long.valueOf(stargiftattributemodel.document.f22386id));
                    boolean z12 = !zContains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(strTranslitSafe3) || org.telegram.messenger.y1.x(str2, lowerCase3, stargiftattributemodel.name.toLowerCase()) || org.telegram.messenger.y1.x(str2, strTranslitSafe3, stargiftattributemodel.name.toLowerCase())) {
                        Integer num3 = (Integer) i5Var3.f7333m.get(Long.valueOf(stargiftattributemodel.document.f22386id));
                        int iIntValue3 = num3 == null ? 0 : num3.intValue();
                        int i16 = c5.f7185a;
                        n41 n41VarJ3 = n41.J(c5.class);
                        n41VarJ3.G = stargiftattributemodel;
                        n41VarJ3.f30844l = lowerCase3;
                        n41VarJ3.f30857z = iIntValue3;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            z12 = (zIsEmpty3 || zContains3) ? false : true;
                        }
                        n41VarJ3.K(z12);
                        arrayList4.add(n41VarJ3);
                    }
                    str2 = str2;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(x4.a(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
                }
                break;
        }
    }
}
