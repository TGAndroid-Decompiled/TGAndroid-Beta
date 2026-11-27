package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class fo0 extends View {
    public final byte a = 0;
    public final di2 b;

    public fo0(Activity activity) {
        super(activity);
        this.b = new di2(hl.L(30.0f), hl.L(3.0f), aob.w0(null, aob.m5, false));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        di2 di2Var = this.b;
        switch (b) {
            case 0:
                di2Var.setBounds(0, 0, getWidth(), getHeight());
                di2Var.b(aob.w0(null, aob.m5, false));
                di2Var.setAlpha(255);
                di2Var.draw(canvas);
                invalidate();
                super.onDraw(canvas);
                return;
            default:
                int L = hl.L(1.0f);
                di2Var.setBounds(L, L, (getWidth() - L) - L, (getHeight() - L) - L);
                di2Var.draw(canvas);
                invalidate();
                return;
        }
    }

    public fo0(Context context) {
        super(context);
        this.b = new di2(hl.L(36.0f), hl.L(2.0f), -13522392);
    }
}
