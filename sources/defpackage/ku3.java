package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;
public final class ku3 extends WebView {
    public final byte a;
    public final Context b;
    public final KeyEvent.Callback c;

    public ku3(KeyEvent.Callback callback, Context context, Context context2, byte b) {
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
                x88 x88Var = (x88) this.c;
                if (parent != x88Var && x88Var.h.getVisibility() == 0) {
                    canvas.drawColor(-16777216);
                    x88Var.j(canvas, getWidth(), getHeight());
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
                gl.u((Activity) this.b, true);
                super.onAttachedToWindow();
                return;
            default:
                gl.u(this.b, true);
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                gl.u((Activity) this.b, false);
                super.onDetachedFromWindow();
                return;
            default:
                gl.u(this.b, false);
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
                    ou3 ou3Var = (ou3) this.c;
                    if (action == 1) {
                        ou3Var.E0 = false;
                    } else {
                        ou3Var.E0 = true;
                    }
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
