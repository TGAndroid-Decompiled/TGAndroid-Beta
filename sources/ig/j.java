package ig;

import android.content.Context;
import k7.b6;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
public final class j extends d {
    public final k5 f7523r;
    public Object f7524s;

    public j(Context context, f6 f6Var) {
        super(context, f6Var);
        int i10;
        float f10;
        float f11;
        this.f7501c.setVisibility(8);
        k5 k5Var = this.e;
        int i11 = j6.B6;
        k5Var.setTextColor(j6.v0(i11, f6Var));
        k5 k5Var2 = new k5(context);
        this.f7523r = k5Var2;
        k5Var2.setTextSize(16);
        k5Var2.setTextColor(j6.v0(i11, f6Var));
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        k5Var2.setGravity(i10);
        addView(k5Var2);
        boolean z4 = LocaleController.isRTL;
        int i12 = (z4 ? 3 : 5) | 16;
        if (z4) {
            f10 = 20.0f;
        } else {
            f10 = 0.0f;
        }
        if (z4) {
            f11 = 0.0f;
        } else {
            f11 = 20.0f;
        }
        k5Var2.setLayoutParams(b6.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.f7524s;
    }
}
