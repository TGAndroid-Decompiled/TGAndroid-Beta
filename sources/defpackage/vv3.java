package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;
public final class vv3 extends WebView {
    public final byte a;
    public final Context b;
    public final KeyEvent.Callback c;

    public vv3(KeyEvent.Callback callback, Context context, Context context2, byte b) {
        super(context);
        this.a = b;
        this.c = callback;
        this.b = context2;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.draw(canvas);
                ViewParent parent = getParent();
                ya8 ya8Var = (ya8) this.c;
                if (parent != ya8Var && ya8Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    ya8Var.j(canvas, getWidth(), getHeight());
                    return;
                }
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                gm.u((Activity) this.b, true);
                super.onAttachedToWindow();
                return;
            default:
                gm.u(this.b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                gm.u((Activity) this.b, false);
                super.onDetachedFromWindow();
                return;
            default:
                gm.u(this.b, false);
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (onTouchEvent) {
                    int action = motionEvent.getAction();
                    zv3 zv3Var = (zv3) this.c;
                    if (action == 1) {
                        zv3Var.E0 = false;
                    } else {
                        zv3Var.E0 = true;
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
