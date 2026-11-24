package defpackage;

import android.graphics.Paint;
import org.telegram.ui.ProfileActivity;
public final class xo8 extends Paint {
    public final byte a;
    public final Object b;

    public xo8(Object obj, byte b) {
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
                xm9 xm9Var = (xm9) obj;
                xm9Var.a.setAlpha(Math.round(i * 0.2f));
                xm9Var.invalidate();
                return;
        }
    }
}
