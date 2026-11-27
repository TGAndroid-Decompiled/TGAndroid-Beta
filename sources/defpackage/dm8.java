package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
public abstract class dm8 extends d79 implements fn7, wu7 {
    public final ArrayList f3;
    public final x46 g3;
    public boolean h3;
    public boolean i3;
    public final int j3;
    public boolean k3;
    public boolean l3;
    public final li7 m3;
    public final k43 n3;
    public final ArrayList o3;
    public final qq7 p3;
    public View q3;
    public boolean r3;
    public int s3;
    public int t3;
    public boolean u3;
    public boolean v3;

    public dm8(Context context, int i) {
        super(context, null);
        ArrayList arrayList = new ArrayList();
        this.f3 = arrayList;
        this.h3 = true;
        this.i3 = true;
        rk8 rk8Var = (rk8) this;
        this.m3 = new li7(rk8Var, (byte) 9);
        this.n3 = new k43(0.0f, 0.5f, 0.5f, 1.0f);
        this.o3 = new ArrayList();
        this.p3 = new qq7((byte) 7);
        this.t3 = -1;
        this.j3 = i;
        x46 x46Var = new x46();
        this.g3 = x46Var;
        setLayoutManager(x46Var);
        setAdapter(new am8(rk8Var));
        setClipChildren(false);
        setOnScrollListener(new e98(rk8Var, (byte) 4));
        setOnItemClickListener(new zg4(rk8Var, (byte) 23));
        ls6.d0(i).p1();
        arrayList.clear();
        arrayList.addAll(ls6.d0(i).C0);
        getAdapter().f();
        invalidate();
    }

    public final void A1(View view, boolean z) {
        boolean z2;
        if (view != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.k3 = z2;
        for (int i = 0; i < getChildCount(); i++) {
            cm8 cm8Var = (cm8) getChildAt(i);
            if (cm8Var == view) {
                cm8Var.a(true, true, z);
            } else {
                cm8Var.a(!this.k3, false, z);
            }
        }
    }

    public final void B1() {
        if (!this.v3) {
            return;
        }
        li7 li7Var = this.m3;
        hl.r(li7Var);
        hl.d3(li7Var, 2700L);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.o5) {
            ArrayList arrayList = this.f3;
            arrayList.clear();
            arrayList.addAll(ls6.d0(this.j3).C0);
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
                cm8 cm8Var = (cm8) getChildAt(i);
                float measuredHeight = ((cm8Var.getMeasuredHeight() + cm8Var.getTop()) + (cm8Var.getMeasuredHeight() >> 1)) / (cm8Var.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float i2 = Utilities.i(measuredHeight, 1.0f, 0.0f);
                cm8Var.a = i2;
                cm8Var.b.setTranslationX((1.0f - this.n3.getInterpolation(i2)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(cm8Var);
            }
            Collections.sort(arrayList, this.p3);
            if ((this.i3 || this.r3) && arrayList.size() > 0 && !this.f3.isEmpty()) {
                View view = (View) c00.g(1, arrayList);
                this.q3 = view;
                A1(view, !this.i3);
                this.i3 = false;
                this.r3 = false;
            } else if (this.q3 != c00.g(1, arrayList)) {
                this.q3 = (View) c00.g(1, arrayList);
                if (this.l3) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                canvas.save();
                canvas.translate(((cm8) arrayList.get(i3)).getX(), ((cm8) arrayList.get(i3)).getY());
                ((cm8) arrayList.get(i3)).draw(canvas);
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
        jn7.f(this.j3).b(this, jn7.o5);
        B1();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.j3).n(this, jn7.o5);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.h3 && !this.f3.isEmpty() && getChildCount() > 0) {
            this.h3 = false;
            hl.c3(new uk8(this, (byte) 2));
        }
        int i5 = this.t3;
        if (i5 > 0) {
            f89 L = L(i5);
            if (L != null) {
                A1(L.a, false);
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
                B1();
                this.r3 = true;
                invalidate();
                return;
            }
            hl.r(this.m3);
            A1(null, true);
        }
    }

    @Override
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
}
