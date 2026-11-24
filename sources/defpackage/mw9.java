package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.ui.SecretMediaViewer;
public final class mw9 extends FrameLayout {
    public float a;
    public final boolean b;
    public final boolean c;
    public boolean d;
    public int e;
    public final xk4 f;
    public final zna h;
    public final pn n;
    public final SecretMediaViewer r;

    public mw9(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.r = secretMediaViewer;
        this.a = 1.0f;
        this.b = true;
        this.c = true;
        xk4 xk4Var = new xk4(0.0f);
        this.f = xk4Var;
        zna znaVar = new zna(xk4Var);
        znaVar.m = aq1.j(0.0f, 750.0f, 1.0f);
        znaVar.b(new h20(this, (byte) 15));
        this.h = znaVar;
        this.n = new pn("progress", (byte) 15);
        setWillNotDraw(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a = 0.0f;
        this.e = 0;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        super.onLayout(z, i, i2, i3, i4);
        SecretMediaViewer secretMediaViewer = this.r;
        la8 la8Var = secretMediaViewer.E;
        if (la8Var != null) {
            f = ((float) la8Var.S()) / ((float) secretMediaViewer.E.U());
        } else {
            f = 0.0f;
        }
        secretMediaViewer.P.h(false, f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        Locale locale;
        String format;
        this.d = true;
        SecretMediaViewer secretMediaViewer = this.r;
        ((FrameLayout.LayoutParams) secretMediaViewer.R.getLayoutParams()).rightMargin = gm.L(12.0f);
        this.d = false;
        super.onMeasure(i, i2);
        la8 la8Var = secretMediaViewer.E;
        long j = 0;
        if (la8Var != null) {
            long U = la8Var.U();
            if (U != -9223372036854775807L) {
                j = U;
            }
        }
        long j2 = j / 1000;
        long j3 = j2 / 60;
        if (j3 > 60) {
            locale = Locale.ROOT;
            format = String.format(locale, "%02d:%02d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60), Long.valueOf(j2 % 60));
        } else {
            locale = Locale.ROOT;
            format = String.format(locale, "%02d:%02d", Long.valueOf(j3), Long.valueOf(j2 % 60));
        }
        int ceil = (int) Math.ceil(secretMediaViewer.R.getPaint().measureText(String.format(locale, "%1$s / %1$s", format)));
        zna znaVar = this.h;
        znaVar.d();
        int i3 = this.e;
        xk4 xk4Var = this.f;
        if (i3 != 0) {
            float f = ceil;
            if (xk4Var.a != f) {
                znaVar.m.i = f;
                znaVar.h();
                this.e = ceil;
            }
        }
        vdc vdcVar = secretMediaViewer.P;
        int y = kt6.y(16.0f, getMeasuredWidth(), ceil);
        int measuredHeight = getMeasuredHeight();
        vdcVar.h = y;
        vdcVar.i = measuredHeight;
        View view = vdcVar.v;
        if (view != null) {
            view.invalidate();
        }
        xk4Var.a = ceil;
        this.e = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.r;
        if (secretMediaViewer.P.e(motionEvent.getX() - gm.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            secretMediaViewer.Q.invalidate();
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }
}
