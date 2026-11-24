package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
public abstract class sk8 extends r59 implements jm7, rt7 {
    public final ArrayList f3;
    public final u46 g3;
    public boolean h3;
    public boolean i3;
    public final int j3;
    public boolean k3;
    public boolean l3;
    public final ei7 m3;
    public final d53 n3;
    public final ArrayList o3;
    public final qx7 p3;
    public View q3;
    public boolean r3;
    public int s3;
    public int t3;
    public boolean u3;
    public boolean v3;

    public sk8(Context context, int i) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f3 = arrayList;
        this.h3 = true;
        this.i3 = true;
        fj8 fj8Var = (fj8) this;
        this.m3 = new ei7(fj8Var, (byte) 9);
        this.n3 = new d53(0.0f, 0.5f, 0.5f, 1.0f);
        this.o3 = new ArrayList();
        this.p3 = new qx7((byte) 5);
        this.t3 = -1;
        this.j3 = i;
        u46 u46Var = new u46();
        this.g3 = u46Var;
        setLayoutManager(u46Var);
        setAdapter(new pk8(fj8Var));
        setClipChildren(false);
        setOnScrollListener(new so7(fj8Var, (byte) 5));
        setOnItemClickListener(new kg4(fj8Var, (byte) 24));
        hs6.d0(i).p1();
        arrayList.clear();
        arrayList.addAll(hs6.d0(i).C0);
        getAdapter().f();
        invalidate();
    }

    public final void A1() {
        if (!this.v3) {
            return;
        }
        ei7 ei7Var = this.m3;
        gm.r(ei7Var);
        gm.d3(ei7Var, 2700L);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.p5) {
            ArrayList arrayList = this.f3;
            arrayList.clear();
            arrayList.addAll(hs6.d0(this.j3).C0);
            getAdapter().f();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.u3) {
            ArrayList arrayList = this.o3;
            arrayList.clear();
            for (int i = 0; i < getChildCount(); i++) {
                rk8 rk8Var = (rk8) getChildAt(i);
                float measuredHeight = ((rk8Var.getMeasuredHeight() + rk8Var.getTop()) + (rk8Var.getMeasuredHeight() >> 1)) / (rk8Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float i2 = Utilities.i(measuredHeight, 1.0f, 0.0f);
                rk8Var.a = i2;
                rk8Var.b.setTranslationX((1.0f - this.n3.getInterpolation(i2)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(rk8Var);
            }
            Collections.sort(arrayList, this.p3);
            if ((this.i3 || this.r3) && arrayList.size() > 0 && !this.f3.isEmpty()) {
                View view = (View) b10.f(1, arrayList);
                this.q3 = view;
                z1(view, !this.i3);
                this.i3 = false;
                this.r3 = false;
            } else if (this.q3 != b10.f(1, arrayList)) {
                this.q3 = (View) b10.f(1, arrayList);
                if (this.l3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                canvas.save();
                canvas.translate(((rk8) arrayList.get(i3)).getX(), ((rk8) arrayList.get(i3)).getY());
                ((rk8) arrayList.get(i3)).draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.j3).b(this, nm7.p5);
        A1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.j3).n(this, nm7.p5);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.h3 && !this.f3.isEmpty() && getChildCount() > 0) {
            this.h3 = false;
            gm.c3(new q78(this, (byte) 24));
        }
        int i5 = this.t3;
        if (i5 > 0) {
            u69 K = K(i5);
            if (K != null) {
                z1(K.a, false);
            }
            this.t3 = -1;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getSize(i2) > View.MeasureSpec.getSize(i)) {
            this.s3 = View.MeasureSpec.getSize(i);
        } else {
            this.s3 = View.MeasureSpec.getSize(i2);
        }
        super.onMeasure(i, i2);
    }

    public void setAutoPlayEnabled(boolean z) {
        if (this.v3 != z) {
            this.v3 = z;
            if (z) {
                A1();
                this.r3 = true;
                invalidate();
                return;
            }
            gm.r(this.m3);
            z1(null, true);
        }
    }

    public void setOffset(float f) {
        boolean z;
        if (Math.abs(f / getMeasuredWidth()) < 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.u3 != z) {
            this.u3 = z;
            invalidate();
        }
    }

    public final void z1(View view, boolean z) {
        boolean z2;
        if (view != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.k3 = z2;
        for (int i = 0; i < getChildCount(); i++) {
            rk8 rk8Var = (rk8) getChildAt(i);
            if (rk8Var == view) {
                rk8Var.a(true, true, z);
            } else {
                rk8Var.a(!this.k3, false, z);
            }
        }
    }
}
