package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
public final class j2 extends d2 implements e2 {
    public static final Method T;
    public pb.c S;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                T = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override
    public final void h(l.l lVar, MenuItem menuItem) {
        pb.c cVar = this.S;
        if (cVar != null) {
            cVar.h(lVar, menuItem);
        }
    }

    @Override
    public final void o(l.l lVar, l.n nVar) {
        pb.c cVar = this.S;
        if (cVar != null) {
            cVar.o(lVar, nVar);
        }
    }

    @Override
    public final r1 q(Context context, boolean z10) {
        i2 i2Var = new i2(context, z10);
        i2Var.setHoverListener(this);
        return i2Var;
    }
}
