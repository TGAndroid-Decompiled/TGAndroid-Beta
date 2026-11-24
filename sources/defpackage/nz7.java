package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import org.telegram.ui.p;
public final class nz7 extends WebView {
    public final byte a = 1;
    public final Object b;

    public nz7(p pVar, Context context) {
        super(context);
        this.b = pVar;
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 1:
                gl.u((Activity) this.b, true);
                super.onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 1:
                gl.u((Activity) this.b, false);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, i2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ((ViewGroup) ((p) this.b).fragmentView).requestDisallowInterceptTouchEvent(true);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public nz7(Activity activity, Activity activity2) {
        super(activity);
        this.b = activity2;
    }
}
