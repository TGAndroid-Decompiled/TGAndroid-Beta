package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class fp0 extends View {
    public final byte a = 0;
    public final wi2 b;

    public fp0(Activity activity) {
        super(activity);
        this.b = new wi2(gm.L(30.0f), gm.L(3.0f), cmb.w0(null, cmb.l5, false));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        wi2 wi2Var = this.b;
        switch (b) {
            case 0:
                wi2Var.setBounds(0, 0, getWidth(), getHeight());
                wi2Var.b(cmb.w0(null, cmb.l5, false));
                wi2Var.setAlpha(255);
                wi2Var.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
            default:
                int L = gm.L(1.0f);
                wi2Var.setBounds(L, L, (getWidth() - L) - L, (getHeight() - L) - L);
                wi2Var.draw(canvas);
                invalidate();
                return;
        }
    }

    public fp0(Context context) {
        super(context);
        this.b = new wi2(gm.L(36.0f), gm.L(2.0f), -13522392);
    }
}
