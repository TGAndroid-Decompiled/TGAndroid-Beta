package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Locale;
import org.telegram.ui.PhotoViewer;
public final class vb8 extends FrameLayout {
    public float a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public final xk4 n;
    public final zna r;
    public final PhotoViewer s;

    public vb8(Context context, PhotoViewer photoViewer) {
        super(context);
        this.s = photoViewer;
        this.a = 1.0f;
        this.c = true;
        xk4 xk4Var = new xk4(0.0f);
        this.n = xk4Var;
        zna znaVar = new zna(xk4Var);
        znaVar.m = aq1.j(0.0f, 750.0f, 1.0f);
        znaVar.b(new h20(this, (byte) 12));
        this.r = znaVar;
        setWillNotDraw(false);
    }

    public final void a(float f) {
        PhotoViewer photoViewer = this.s;
        photoViewer.o3.setAlpha(f);
        photoViewer.p3.setAlpha(f);
        if (this.b) {
            lka lkaVar = photoViewer.o3;
            lkaVar.setPivotX(lkaVar.getWidth());
            lka lkaVar2 = photoViewer.o3;
            lkaVar2.setPivotY(lkaVar2.getHeight());
            float f2 = 1.0f - f;
            float f3 = 1.0f - (0.1f * f2);
            photoViewer.o3.setScaleX(f3);
            photoViewer.o3.setScaleY(f3);
            vdc vdcVar = photoViewer.q3;
            if (vdcVar.y != f2) {
                vdcVar.y = f2;
                vdcVar.v.invalidate();
                return;
            }
            return;
        }
        if (this.c) {
            setTranslationY((1.0f - f) * gm.N(24.0f));
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
                vdc vdcVar = photoViewer.q3;
                if (vdcVar.y != 0.0f) {
                    vdcVar.y = 0.0f;
                    vdcVar.v.invalidate();
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
        ndc ndcVar = photoViewer.G2;
        if (ndcVar != null) {
            f = ((float) ndcVar.S()) / ((float) photoViewer.G2.U());
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
            i3 = gm.L(48.0f);
            layoutParams.rightMargin = gm.L(47.0f);
        } else {
            if (imageView.getVisibility() != 4) {
                photoViewer.p3.setVisibility(4);
            }
            layoutParams.rightMargin = gm.L(12.0f);
            i3 = 0;
        }
        this.d = false;
        super.onMeasure(i, i2);
        ndc ndcVar = photoViewer.G2;
        long j = 0;
        if (ndcVar != null) {
            long U = ndcVar.U();
            if (U != -9223372036854775807L) {
                j = U;
            }
        } else {
            ya8 ya8Var = photoViewer.g0;
            if (ya8Var != null && ya8Var.y) {
                j = ya8Var.getVideoDuration();
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
        zna znaVar = this.r;
        znaVar.d();
        int i6 = this.h;
        xk4 xk4Var = this.n;
        if (i6 != 0) {
            float f = ceil;
            if (xk4Var.a != f) {
                znaVar.m.i = f;
                znaVar.h();
                this.h = ceil;
            }
        }
        vdc vdcVar = photoViewer.q3;
        int measuredHeight = getMeasuredHeight();
        vdcVar.h = ((getMeasuredWidth() - gm.L(16.0f)) - ceil) - i3;
        vdcVar.i = measuredHeight;
        View view = vdcVar.v;
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
        if (photoViewer.q3.e(motionEvent.getX() - gm.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
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
