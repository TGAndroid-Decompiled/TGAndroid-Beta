package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
public abstract class qi8 extends o39 implements gk7, qr7 {
    public final ArrayList f3;
    public final t26 g3;
    public boolean h3;
    public boolean i3;
    public final int j3;
    public boolean k3;
    public boolean l3;
    public final bg7 m3;
    public final s33 n3;
    public final ArrayList o3;
    public final fx7 p3;
    public View q3;
    public boolean r3;
    public int s3;
    public int t3;
    public boolean u3;
    public boolean v3;

    public qi8(Context context, int i) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f3 = arrayList;
        this.h3 = true;
        this.i3 = true;
        dh8 dh8Var = (dh8) this;
        this.m3 = new bg7(dh8Var, (byte) 9);
        this.n3 = new s33(0.0f, 0.5f, 0.5f, 1.0f);
        this.o3 = new ArrayList();
        this.p3 = new fx7((byte) 4);
        this.t3 = -1;
        this.j3 = i;
        t26 t26Var = new t26();
        this.g3 = t26Var;
        setLayoutManager(t26Var);
        setAdapter(new ni8(dh8Var));
        setClipChildren(false);
        setOnScrollListener(new n58(dh8Var, (byte) 4));
        setOnItemClickListener(new bf4(dh8Var, (byte) 23));
        hq6.d0(i).p1();
        arrayList.clear();
        arrayList.addAll(hq6.d0(i).C0);
        getAdapter().f();
        invalidate();
    }

    public final void A1() {
        if (!this.v3) {
            return;
        }
        bg7 bg7Var = this.m3;
        gl.r(bg7Var);
        gl.d3(bg7Var, 2700L);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.n5) {
            ArrayList arrayList = this.f3;
            arrayList.clear();
            arrayList.addAll(hq6.d0(this.j3).C0);
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
                pi8 pi8Var = (pi8) getChildAt(i);
                float measuredHeight = ((pi8Var.getMeasuredHeight() + pi8Var.getTop()) + (pi8Var.getMeasuredHeight() >> 1)) / (pi8Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float i2 = Utilities.i(measuredHeight, 1.0f, 0.0f);
                pi8Var.a = i2;
                pi8Var.b.setTranslationX((1.0f - this.n3.getInterpolation(i2)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(pi8Var);
            }
            Collections.sort(arrayList, this.p3);
            if ((this.i3 || this.r3) && arrayList.size() > 0 && !this.f3.isEmpty()) {
                View view = (View) b00.f(1, arrayList);
                this.q3 = view;
                z1(view, !this.i3);
                this.i3 = false;
                this.r3 = false;
            } else if (this.q3 != b00.f(1, arrayList)) {
                this.q3 = (View) b00.f(1, arrayList);
                if (this.l3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                canvas.save();
                canvas.translate(((pi8) arrayList.get(i3)).getX(), ((pi8) arrayList.get(i3)).getY());
                ((pi8) arrayList.get(i3)).draw(canvas);
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
        kk7.f(this.j3).b(this, kk7.n5);
        A1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.j3).n(this, kk7.n5);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.h3 && !this.f3.isEmpty() && getChildCount() > 0) {
            this.h3 = false;
            gl.c3(new w88(this, (byte) 17));
        }
        int i5 = this.t3;
        if (i5 > 0) {
            s49 K = K(i5);
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
            gl.r(this.m3);
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
            pi8 pi8Var = (pi8) getChildAt(i);
            if (pi8Var == view) {
                pi8Var.a(true, true, z);
            } else {
                pi8Var.a(!this.k3, false, z);
            }
        }
    }
}
