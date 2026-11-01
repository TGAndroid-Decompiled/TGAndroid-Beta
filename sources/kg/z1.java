package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.uk0;
public abstract class z1 extends uk0 implements vs, t0 {
    public final ArrayList f11353e3;
    public final s4.a0 f11354f3;
    public boolean f11355g3;
    public boolean f11356h3;
    public final int f11357i3;
    public boolean f11358j3;
    public boolean f11359k3;
    public final androidx.activity.i f11360l3;
    public final gr f11361m3;
    public final ArrayList f11362n3;
    public final a4.d f11363o3;
    public View f11364p3;
    public boolean f11365q3;
    public int f11366r3;
    public int f11367s3;
    public boolean f11368t3;
    public boolean f11369u3;

    public z1(Context context, int i10) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f11353e3 = arrayList;
        this.f11355g3 = true;
        this.f11356h3 = true;
        b1 b1Var = (b1) this;
        this.f11360l3 = new androidx.activity.i(b1Var, 24);
        this.f11361m3 = new gr(0.0f, 0.5f, 0.5f, 1.0f);
        this.f11362n3 = new ArrayList();
        this.f11363o3 = new a4.d(9);
        this.f11367s3 = -1;
        this.f11357i3 = i10;
        s4.a0 a0Var = new s4.a0();
        this.f11354f3 = a0Var;
        setLayoutManager(a0Var);
        setAdapter(new w1(b1Var));
        setClipChildren(false);
        setOnScrollListener(new ag.u(b1Var, 4));
        setOnItemClickListener(new ag.y0(b1Var, 7));
        vi.b0(i10).o1();
        arrayList.clear();
        arrayList.addAll(vi.b0(i10).B0);
        getAdapter().f();
        invalidate();
    }

    public final void A1() {
        if (!this.f11369u3) {
            return;
        }
        androidx.activity.i iVar = this.f11360l3;
        org.telegram.messenger.i0.r(iVar);
        org.telegram.messenger.i0.h3(iVar, 2700L);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.f14743l5) {
            ArrayList arrayList = this.f11353e3;
            arrayList.clear();
            arrayList.addAll(vi.b0(this.f11357i3).B0);
            getAdapter().f();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f11368t3) {
            ArrayList arrayList = this.f11362n3;
            arrayList.clear();
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                y1 y1Var = (y1) getChildAt(i10);
                float measuredHeight = ((y1Var.getMeasuredHeight() + y1Var.getTop()) + (y1Var.getMeasuredHeight() >> 1)) / (y1Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float i11 = Utilities.i(measuredHeight, 1.0f, 0.0f);
                y1Var.f11340a = i11;
                y1Var.f11341b.setTranslationX((1.0f - this.f11361m3.getInterpolation(i11)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(y1Var);
            }
            Collections.sort(arrayList, this.f11363o3);
            if ((this.f11356h3 || this.f11365q3) && arrayList.size() > 0 && !this.f11353e3.isEmpty()) {
                View view = (View) i0.a.g(1, arrayList);
                this.f11364p3 = view;
                z1(view, !this.f11356h3);
                this.f11356h3 = false;
                this.f11365q3 = false;
            } else if (this.f11364p3 != i0.a.g(1, arrayList)) {
                this.f11364p3 = (View) i0.a.g(1, arrayList);
                if (this.f11359k3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                canvas.save();
                canvas.translate(((y1) arrayList.get(i12)).getX(), ((y1) arrayList.get(i12)).getY());
                ((y1) arrayList.get(i12)).draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        at.f(this.f11357i3).c(this, at.f14743l5);
        A1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        at.f(this.f11357i3).n(this, at.f14743l5);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f11355g3 && !this.f11353e3.isEmpty() && getChildCount() > 0) {
            this.f11355g3 = false;
            org.telegram.messenger.i0.g3(new gg.c(this, 25));
        }
        int i14 = this.f11367s3;
        if (i14 > 0) {
            s4.c1 K = K(i14);
            if (K != null) {
                z1(K.f47909a, false);
            }
            this.f11367s3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getSize(i11) > View.MeasureSpec.getSize(i10)) {
            this.f11366r3 = View.MeasureSpec.getSize(i10);
        } else {
            this.f11366r3 = View.MeasureSpec.getSize(i11);
        }
        super.onMeasure(i10, i11);
    }

    public void setAutoPlayEnabled(boolean z10) {
        if (this.f11369u3 != z10) {
            this.f11369u3 = z10;
            if (z10) {
                A1();
                this.f11365q3 = true;
                invalidate();
                return;
            }
            org.telegram.messenger.i0.r(this.f11360l3);
            z1(null, true);
        }
    }

    public void setOffset(float f7) {
        boolean z10;
        if (Math.abs(f7 / getMeasuredWidth()) < 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f11368t3 != z10) {
            this.f11368t3 = z10;
            invalidate();
        }
    }

    public final void z1(View view, boolean z10) {
        boolean z11;
        if (view != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11358j3 = z11;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            y1 y1Var = (y1) getChildAt(i10);
            if (y1Var == view) {
                y1Var.a(true, true, z10);
            } else {
                y1Var.a(!this.f11358j3, false, z10);
            }
        }
    }
}
