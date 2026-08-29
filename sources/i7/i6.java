package i7;

import java.util.ArrayList;
public abstract class i6 {
    public static ArrayList a(org.telegram.ui.ActionBar.h6 h6Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, i10));
        }
        return arrayList;
    }
}
