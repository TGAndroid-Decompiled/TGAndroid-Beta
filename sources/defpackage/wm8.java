package defpackage;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class wm8 extends Paint {
    public final byte a;
    public final Object b;

    public wm8(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void setAlpha(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                super.setAlpha(i);
                ((ProfileActivity) obj).fragmentView.invalidate();
                return;
            default:
                super.setAlpha(i);
                wk9 wk9Var = (wk9) obj;
                wk9Var.a.setAlpha(Math.round(i * 0.2f));
                wk9Var.invalidate();
                return;
        }
    }
}
