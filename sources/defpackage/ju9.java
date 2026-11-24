package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.ui.SecretMediaViewer;
public final class ju9 extends FrameLayout {
    public float a;
    public final boolean b;
    public final boolean c;
    public boolean d;
    public int e;
    public final ti4 f;
    public final yla h;
    public final pm n;
    public final SecretMediaViewer r;

    public ju9(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.r = secretMediaViewer;
        this.a = 1.0f;
        this.b = true;
        this.c = true;
        ti4 ti4Var = new ti4(0.0f);
        this.f = ti4Var;
        yla ylaVar = new yla(ti4Var);
        ylaVar.m = oo1.j(0.0f, 750.0f, 1.0f);
        ylaVar.b(new h10(this, (byte) 15));
        this.h = ylaVar;
        this.n = new pm("progress", (byte) 15);
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
        i88 i88Var = secretMediaViewer.E;
        if (i88Var != null) {
            f = ((float) i88Var.S()) / ((float) secretMediaViewer.E.U());
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
        ((FrameLayout.LayoutParams) secretMediaViewer.R.getLayoutParams()).rightMargin = gl.L(12.0f);
        this.d = false;
        super.onMeasure(i, i2);
        i88 i88Var = secretMediaViewer.E;
        long j = 0;
        if (i88Var != null) {
            long U = i88Var.U();
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
        yla ylaVar = this.h;
        ylaVar.d();
        int i3 = this.e;
        ti4 ti4Var = this.f;
        if (i3 != 0) {
            float f = ceil;
            if (ti4Var.a != f) {
                ylaVar.m.i = f;
                ylaVar.h();
                this.e = ceil;
            }
        }
        tbc tbcVar = secretMediaViewer.P;
        int x = ls6.x(16.0f, getMeasuredWidth(), ceil);
        int measuredHeight = getMeasuredHeight();
        tbcVar.h = x;
        tbcVar.i = measuredHeight;
        View view = tbcVar.v;
        if (view != null) {
            view.invalidate();
        }
        ti4Var.a = ceil;
        this.e = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.r;
        if (secretMediaViewer.P.e(motionEvent.getX() - gl.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
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
