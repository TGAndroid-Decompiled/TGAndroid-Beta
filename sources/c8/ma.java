package c8;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public abstract class ma {
    public static ArrayList a(org.telegram.ui.ActionBar.t6 t6Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i7 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t6Var, i7));
        }
        return arrayList;
    }
}
