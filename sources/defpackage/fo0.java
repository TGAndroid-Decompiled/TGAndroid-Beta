package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class fo0 extends View {
    public final byte a = 0;
    public final ih2 b;

    public fo0(Activity activity) {
        super(activity);
        this.b = new ih2(gl.L(30.0f), gl.L(3.0f), bkb.w0(null, bkb.l5, false));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        ih2 ih2Var = this.b;
        switch (b) {
            case 0:
                ih2Var.setBounds(0, 0, getWidth(), getHeight());
                ih2Var.b(bkb.w0(null, bkb.l5, false));
                ih2Var.setAlpha(255);
                ih2Var.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
            default:
                int L = gl.L(1.0f);
                ih2Var.setBounds(L, L, (getWidth() - L) - L, (getHeight() - L) - L);
                ih2Var.draw(canvas);
                invalidate();
                return;
        }
    }

    public fo0(Context context) {
        super(context);
        this.b = new ih2(gl.L(36.0f), gl.L(2.0f), -13522392);
    }
}
