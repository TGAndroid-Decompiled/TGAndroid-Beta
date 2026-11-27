package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ProfileActivity;
public final class ap8 extends View {
    public final HashSet E;
    public byte F;
    public boolean G;
    public boolean H;
    public xo8 I;
    public xo8 J;
    public xo8 K;
    public final float L;
    public final float M;
    public final float N;
    public int O;
    public boolean P;
    public RadialGradient Q;
    public final Matrix R;
    public int S;
    public PorterDuffColorFilter T;
    public xo8 U;
    public float V;
    public float W;
    public final ArrayList a;
    public long a0;
    public final Paint b;
    public w4 b0;
    public final Paint c;
    public float d;
    public boolean e;
    public float f;
    public ll0 h;
    public final ArrayList n;
    public int r;
    public int s;
    public final int w;
    public float x;
    public zo8 y;

    public ap8(Context context, int i) {
        super(context);
        this.a = new ArrayList();
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Paint();
        this.e = true;
        this.f = -1.0f;
        this.n = new ArrayList();
        this.s = 0;
        this.x = 0.0f;
        this.y = null;
        this.E = new HashSet();
        this.F = (byte) 6;
        this.I = null;
        this.O = 0;
        this.R = new Matrix();
        this.U = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.L = hl.N(14.0f);
        float N = hl.N(12.0f);
        this.M = N;
        float N2 = hl.N(8.0f);
        this.N = N2;
        this.w = (int) ((i - N) - N2);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f = this.L;
        int i = this.s;
        return ((measuredWidth - ((f / 2.0f) * (i - 1))) - (f * 2.0f)) / i;
    }

    public static xo8 i(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            xo8 xo8Var = (xo8) arrayList.get(i2);
            if (!xo8Var.o && xo8Var.a == i) {
                return xo8Var;
            }
        }
        return null;
    }

    public final void a() {
        xo8 xo8Var = new xo8(this, yo8.J);
        xo8Var.a = (byte) 14;
        this.a.add(xo8Var);
    }

    public final void b() {
        xo8 xo8Var = new xo8(this, yo8.K);
        xo8Var.a = (byte) 16;
        this.a.add(xo8Var);
    }

    public final void c() {
        xo8 xo8Var = new xo8(this, yo8.L);
        xo8Var.a = (byte) 17;
        this.a.add(xo8Var);
    }

    public final void d() {
        boolean z;
        if (this.G) {
            return;
        }
        if (this.F == 6) {
            this.s = this.a.size();
            invalidate();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.E;
        if (hashSet.contains(7) && !hashSet.contains(9)) {
            z = true;
        } else {
            z = false;
        }
        byte b = this.F;
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 3 && b != 4) {
                        if (b == 5) {
                            m(0, arrayList);
                            m(1, arrayList);
                        }
                    } else {
                        if (z) {
                            m(7, arrayList);
                        } else {
                            m(0, arrayList);
                        }
                        m(1, arrayList);
                        if (z) {
                            arrayList.add(j(8));
                        } else {
                            m(10, arrayList);
                            n(11, 10, arrayList);
                            m(12, arrayList);
                            m(9, arrayList);
                        }
                    }
                } else {
                    m(0, arrayList);
                    m(1, arrayList);
                    m(4, arrayList);
                    arrayList.add(j(13));
                }
            } else {
                if (z) {
                    m(7, arrayList);
                } else {
                    m(10, arrayList);
                    n(11, 10, arrayList);
                }
                m(1, arrayList);
                if (!z) {
                    m(2, arrayList);
                    if (hashSet.contains(3) && !hashSet.contains(2) && !hashSet.contains(12)) {
                        arrayList.add(j(3));
                    }
                }
                n(4, 12, arrayList);
                if (z) {
                    arrayList.add(j(8));
                } else {
                    m(12, arrayList);
                    n(9, 12, arrayList);
                }
            }
        } else {
            m(0, arrayList);
            m(1, arrayList);
            m(5, arrayList);
            m(6, arrayList);
            n(3, 6, arrayList);
        }
        hl.c3(new h68(this, arrayList, (byte) 27));
    }

    public final void e() {
        this.G = true;
    }

    public final boolean f() {
        byte b = this.F;
        if (b == 1 || b == 3) {
            return true;
        }
        return false;
    }

    public final void g() {
        float f;
        int i = this.O;
        if (i != 0) {
            if (!this.P) {
                this.b.setColor(i);
                return;
            }
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth <= 0) {
                return;
            }
            float f2 = this.L;
            float max = ((measuredWidth - ((f2 / 2.0f) * Math.max(0, this.s - 1))) - (f2 * 2.0f)) / Math.max(1, this.s);
            float f3 = max / 2.0f;
            float f4 = this.w / 2.0f;
            if (this.P) {
                f = max * 0.65f;
            } else {
                f = 1.0f;
            }
            RadialGradient radialGradient = new RadialGradient(f3, f4, f, aob.p1(0.8f, this.O), this.O, Shader.TileMode.CLAMP);
            this.Q = radialGradient;
            this.c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        w4 w4Var = this.b0;
        if (w4Var == null) {
            w4 w4Var2 = new w4(this);
            this.b0 = w4Var2;
            return w4Var2;
        }
        return w4Var;
    }

    public float getRoundRadius() {
        return hl.L(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.T);
        drawable.setAlpha((int) (f * 255.0f));
        drawable.draw(canvas);
    }

    public final xo8 j(int i) {
        xo8 i2 = i(i, this.a);
        if (i2 != null) {
            if (i == 1) {
                p(i2, false);
            }
            return i2;
        }
        switch (i) {
            case 0:
                i2 = new xo8(this, yo8.d);
                break;
            case 1:
                i2 = new xo8(this);
                p(i2, false);
                break;
            case 2:
                i2 = new xo8(this, yo8.h);
                break;
            case 3:
                i2 = new xo8(this, yo8.n);
                i2.t = true;
                i2.x = (short) 200;
                break;
            case 4:
                i2 = new xo8(this, yo8.r);
                break;
            case 5:
                i2 = new xo8(this, yo8.s);
                this.I = i2;
                i2.t = true;
                i2.x = (short) 500;
                break;
            case 6:
                i2 = new xo8(this, yo8.w);
                i2.t = true;
                i2.x = (short) 500;
                break;
            case 7:
                i2 = new xo8(this, yo8.x);
                i2.t = true;
                i2.v = (short) 300;
                break;
            case 8:
                i2 = new xo8(this, yo8.y);
                i2.t = true;
                i2.x = (short) 500;
                break;
            case 9:
                i2 = new xo8(this, yo8.E);
                i2.t = true;
                i2.u = 2131624163;
                i2.x = (short) 300;
                break;
            case 10:
                i2 = new xo8(this, yo8.F);
                i2.t = true;
                i2.u = 2131624166;
                i2.x = (short) 500;
                break;
            case 11:
                i2 = new xo8(this, yo8.G);
                i2.t = true;
                i2.u = 2131624166;
                i2.x = (short) 500;
                break;
            case 12:
                i2 = new xo8(this, yo8.H);
                break;
            case 13:
                i2 = new xo8(this, yo8.I);
                i2.t = true;
                i2.x = (short) 300;
                break;
        }
        if (i2 != null) {
            i2.a = i;
        }
        return i2;
    }

    public final boolean k() {
        if (this.E.contains(5) && this.I != null) {
            return true;
        }
        return false;
    }

    public final void l() {
        int i = this.r;
        while (true) {
            ArrayList arrayList = this.n;
            if (i < arrayList.size()) {
                jl0 jl0Var = (jl0) arrayList.get(i);
                if (!jl0Var.getBounds().isEmpty()) {
                    jl0Var.setBounds(0, 0, 0, 0);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void m(int i, ArrayList arrayList) {
        if (this.E.contains(Integer.valueOf(i))) {
            arrayList.add(j(i));
        }
    }

    public final void n(int i, int i2, ArrayList arrayList) {
        Integer valueOf = Integer.valueOf(i);
        HashSet hashSet = this.E;
        if (hashSet.contains(valueOf) && !hashSet.contains(Integer.valueOf(i2))) {
            arrayList.add(j(i));
        }
    }

    public final void o(int i, boolean z) {
        boolean remove;
        HashSet hashSet = this.E;
        if (z) {
            remove = hashSet.add(Integer.valueOf(i));
        } else {
            remove = hashSet.remove(Integer.valueOf(i));
        }
        if (remove) {
            d();
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.makeMeasureSpec((int) (this.w + this.N + this.M), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        xo8 xo8Var;
        if (this.x >= hl.L(8.0f)) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.U = null;
                ArrayList arrayList = this.a;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    xo8 xo8Var2 = (xo8) arrayList.get(i);
                    if (!xo8Var2.o && xo8Var2.d.contains(x, y)) {
                        this.U = xo8Var2;
                        this.V = x;
                        this.W = y;
                        this.a0 = System.currentTimeMillis();
                        this.U.b.c(true);
                        break;
                    }
                    i++;
                }
            } else if (action == 2) {
                if (this.U != null && (Math.abs(x - this.V) > 20.0f || Math.abs(y - this.W) > 20.0f)) {
                    this.U.b.c(false);
                    this.U = null;
                }
            } else if ((action == 1 || action == 3) && (xo8Var = this.U) != null) {
                xo8Var.b.c(false);
                if (action == 1 && this.U.d.contains(x, y)) {
                    if (System.currentTimeMillis() - this.a0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    xo8 xo8Var3 = this.U;
                    if (xo8Var3.t && !xo8Var3.s) {
                        xo8Var3.s = true;
                        invalidate();
                    }
                    xo8 xo8Var4 = this.U;
                    int i2 = xo8Var4.u;
                    if (i2 != 0) {
                        xo8Var4.d(i2, 0, 0);
                    }
                    this.U.w = System.currentTimeMillis();
                    xo8 xo8Var5 = this.U;
                    zo8 zo8Var = this.y;
                    if (zo8Var != null) {
                        short s = xo8Var5.v;
                        if (s == 0) {
                            byte b = xo8Var5.a;
                            RectF rectF = xo8Var5.d;
                            float f = rectF.left;
                            float f2 = rectF.top;
                            ProfileActivity profileActivity = ((bp8) zo8Var).b;
                            RectF rectF2 = ProfileActivity.Z6;
                            profileActivity.u2(f, f2, b);
                        } else {
                            postDelayed(new h68(this, xo8Var5, (byte) 28), s);
                        }
                    }
                }
                this.U = null;
                return true;
            }
            if (this.U != null) {
                return true;
            }
        }
        return false;
    }

    public final void p(xo8 xo8Var, boolean z) {
        yo8 yo8Var;
        boolean z2 = this.H;
        if (z) {
            if (z2) {
                xo8Var.c(ob6.M0(2131746414, null));
                xo8Var.d(2131624165, 2131231157, 2131232511);
                return;
            }
            xo8Var.c(ob6.M0(2131746413, null));
            xo8Var.d(2131624164, 2131231163, 2131232516);
            return;
        }
        if (z2) {
            yo8Var = yo8.e;
        } else {
            yo8Var = yo8.f;
        }
        xo8Var.d(0, yo8Var.b, yo8Var.c);
        xo8Var.c(ob6.M0(yo8Var.a, null));
    }

    public void setGlassFactory(ll0 ll0Var) {
        this.h = ll0Var;
        this.n.clear();
        this.r = 0;
        invalidate();
    }

    public void setNotifications(boolean z) {
        boolean z2;
        if (this.H != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.H = z;
        xo8 i = i(1, this.a);
        if (i != null) {
            p(i, z2);
            invalidate();
            return;
        }
        this.E.add(1);
        d();
    }

    public void setOnActionClickListener(zo8 zo8Var) {
        this.y = zo8Var;
    }

    public void setParentExpanded(float f) {
        if (this.d != f) {
            this.d = f;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof va6)) {
            return false;
        }
        return true;
    }
}
