package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Locale;
import org.telegram.ui.PhotoViewer;
public final class kd8 extends FrameLayout {
    public float a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public final xk4 n;
    public final vpa r;
    public final PhotoViewer s;

    public kd8(Context context, PhotoViewer photoViewer) {
        super(context);
        this.s = photoViewer;
        this.a = 1.0f;
        this.c = true;
        xk4 xk4Var = new xk4(0.0f);
        this.n = xk4Var;
        vpa vpaVar = new vpa(xk4Var);
        vpaVar.m = bp1.j(0.0f, 750.0f, 1.0f);
        vpaVar.b(new i10(this, (byte) 13));
        this.r = vpaVar;
        setWillNotDraw(false);
    }

    public final void a(float f) {
        PhotoViewer photoViewer = this.s;
        photoViewer.o3.setAlpha(f);
        photoViewer.p3.setAlpha(f);
        if (this.b) {
            ema emaVar = photoViewer.o3;
            emaVar.setPivotX(emaVar.getWidth());
            ema emaVar2 = photoViewer.o3;
            emaVar2.setPivotY(emaVar2.getHeight());
            float f2 = 1.0f - f;
            float f3 = 1.0f - (0.1f * f2);
            photoViewer.o3.setScaleX(f3);
            photoViewer.o3.setScaleY(f3);
            sfc sfcVar = photoViewer.q3;
            if (sfcVar.y != f2) {
                sfcVar.y = f2;
                sfcVar.v.invalidate();
                return;
            }
            return;
        }
        if (this.c) {
            setTranslationY((1.0f - f) * hl.N(24.0f));
        }
        photoViewer.r3.setAlpha(f);
    }

    public final void b(float f) {
        if (this.a != f) {
            this.a = f;
            a(f);
        }
    }

    public final void c(boolean z) {
        if (this.b != z) {
            this.b = z;
            PhotoViewer photoViewer = this.s;
            if (z) {
                setTranslationY(0.0f);
                photoViewer.r3.setAlpha(1.0f);
            } else {
                photoViewer.o3.setScaleX(1.0f);
                photoViewer.o3.setScaleY(1.0f);
                sfc sfcVar = photoViewer.q3;
                if (sfcVar.y != 0.0f) {
                    sfcVar.y = 0.0f;
                    sfcVar.v.invalidate();
                }
            }
            a(this.a);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n.a = 0.0f;
        this.h = 0;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        super.onLayout(z, i, i2, i3, i4);
        PhotoViewer photoViewer = this.s;
        kfc kfcVar = photoViewer.G2;
        if (kfcVar != null) {
            f = ((float) kfcVar.S()) / ((float) photoViewer.G2.U());
        } else {
            f = 0.0f;
        }
        if (photoViewer.W2) {
            photoViewer.q3.h(false, f);
        }
        photoViewer.X7.setProgress(f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        Locale locale;
        String format;
        this.d = true;
        PhotoViewer photoViewer = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.o3.getLayoutParams();
        int i4 = this.e;
        int i5 = this.f;
        ImageView imageView = photoViewer.p3;
        if (i4 > i5) {
            if (imageView.getVisibility() != 0) {
                photoViewer.p3.setVisibility(0);
            }
            i3 = hl.L(48.0f);
            layoutParams.rightMargin = hl.L(47.0f);
        } else {
            if (imageView.getVisibility() != 4) {
                photoViewer.p3.setVisibility(4);
            }
            layoutParams.rightMargin = hl.L(12.0f);
            i3 = 0;
        }
        this.d = false;
        super.onMeasure(i, i2);
        kfc kfcVar = photoViewer.G2;
        long j = 0;
        if (kfcVar != null) {
            long U = kfcVar.U();
            if (U != -9223372036854775807L) {
                j = U;
            }
        } else {
            nc8 nc8Var = photoViewer.g0;
            if (nc8Var != null && nc8Var.y) {
                j = nc8Var.getVideoDuration();
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
        int ceil = (int) Math.ceil(photoViewer.o3.getPaint().measureText(String.format(locale, "%1$s / %1$s", format)));
        vpa vpaVar = this.r;
        vpaVar.d();
        int i6 = this.h;
        xk4 xk4Var = this.n;
        if (i6 != 0) {
            float f = ceil;
            if (xk4Var.a != f) {
                vpaVar.m.i = f;
                vpaVar.h();
                this.h = ceil;
            }
        }
        sfc sfcVar = photoViewer.q3;
        int measuredHeight = getMeasuredHeight();
        sfcVar.h = ((getMeasuredWidth() - hl.L(16.0f)) - ceil) - i3;
        sfcVar.i = measuredHeight;
        View view = sfcVar.v;
        if (view != null) {
            view.invalidate();
        }
        xk4Var.a = ceil;
        this.h = ceil;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.s;
        if (photoViewer.q3.e(motionEvent.getX() - hl.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.r3.invalidate();
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
