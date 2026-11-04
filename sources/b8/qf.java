package b8;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public abstract class qf {
    public static ArrayList a(org.telegram.ui.ActionBar.s6 s6Var, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i3 : iArr) {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i3));
        }
        return arrayList;
    }
}
