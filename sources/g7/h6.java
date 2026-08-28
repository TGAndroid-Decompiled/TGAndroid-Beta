package g7;

import java.util.ArrayList;
public abstract class h6 {
    public static ArrayList a(org.telegram.ui.ActionBar.g6 g6Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i9 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, g6Var, i9));
        }
        return arrayList;
    }
}
