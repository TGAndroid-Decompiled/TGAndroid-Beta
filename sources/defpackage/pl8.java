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
public final class pl8 extends View {
    public final HashSet E;
    public byte F;
    public boolean G;
    public boolean H;
    public ml8 I;
    public ml8 J;
    public ml8 K;
    public final float L;
    public final float M;
    public final float N;
    public int O;
    public boolean P;
    public RadialGradient Q;
    public final Matrix R;
    public int S;
    public PorterDuffColorFilter T;
    public ml8 U;
    public float V;
    public float W;
    public final ArrayList a;
    public long a0;
    public final Paint b;
    public v4 b0;
    public final Paint c;
    public float d;
    public boolean e;
    public float f;
    public kl0 h;
    public final ArrayList n;
    public int r;
    public int s;
    public final int w;
    public float x;
    public ol8 y;

    public pl8(Context context, int i) {
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
        this.L = gl.N(14.0f);
        float N = gl.N(12.0f);
        this.M = N;
        float N2 = gl.N(8.0f);
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

    public static ml8 i(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ml8 ml8Var = (ml8) arrayList.get(i2);
            if (!ml8Var.o && ml8Var.a == i) {
                return ml8Var;
            }
        }
        return null;
    }

    public final void a() {
        ml8 ml8Var = new ml8(this, nl8.J);
        ml8Var.a = (byte) 14;
        this.a.add(ml8Var);
    }

    public final void b() {
        ml8 ml8Var = new ml8(this, nl8.K);
        ml8Var.a = (byte) 16;
        this.a.add(ml8Var);
    }

    public final void c() {
        ml8 ml8Var = new ml8(this, nl8.L);
        ml8Var.a = (byte) 17;
        this.a.add(ml8Var);
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
        gl.d3(new h18(this, arrayList, (byte) 29));
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
            RadialGradient radialGradient = new RadialGradient(f3, f4, f, bkb.p1(0.8f, this.O), this.O, Shader.TileMode.CLAMP);
            this.Q = radialGradient;
            this.c.setShader(radialGradient);
        }
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        v4 v4Var = this.b0;
        if (v4Var == null) {
            v4 v4Var2 = new v4(this);
            this.b0 = v4Var2;
            return v4Var2;
        }
        return v4Var;
    }

    public float getRoundRadius() {
        return gl.L(16.0f);
    }

    public final void h(Canvas canvas, Drawable drawable, float f) {
        if (drawable == null) {
            return;
        }
        drawable.setColorFilter(this.T);
        drawable.setAlpha((int) (f * 255.0f));
        drawable.draw(canvas);
    }

    public final ml8 j(int i) {
        ml8 i2 = i(i, this.a);
        if (i2 != null) {
            if (i == 1) {
                p(i2, false);
            }
            return i2;
        }
        switch (i) {
            case 0:
                i2 = new ml8(this, nl8.d);
                break;
            case 1:
                i2 = new ml8(this);
                p(i2, false);
                break;
            case 2:
                i2 = new ml8(this, nl8.h);
                break;
            case 3:
                i2 = new ml8(this, nl8.n);
                i2.t = true;
                i2.x = (short) 200;
                break;
            case 4:
                i2 = new ml8(this, nl8.r);
                break;
            case 5:
                i2 = new ml8(this, nl8.s);
                this.I = i2;
                i2.t = true;
                i2.x = (short) 500;
                break;
            case 6:
                i2 = new ml8(this, nl8.w);
                i2.t = true;
                i2.x = (short) 500;
                break;
            case 7:
                i2 = new ml8(this, nl8.x);
                i2.t = true;
                i2.v = (short) 300;
                break;
            case 8:
                i2 = new ml8(this, nl8.y);
                i2.t = true;
                i2.x = (short) 500;
                break;
            case 9:
                i2 = new ml8(this, nl8.E);
                i2.t = true;
                i2.u = 2131624164;
                i2.x = (short) 300;
                break;
            case 10:
                i2 = new ml8(this, nl8.F);
                i2.t = true;
                i2.u = 2131624167;
                i2.x = (short) 500;
                break;
            case 11:
                i2 = new ml8(this, nl8.G);
                i2.t = true;
                i2.u = 2131624167;
                i2.x = (short) 500;
                break;
            case 12:
                i2 = new ml8(this, nl8.H);
                break;
            case 13:
                i2 = new ml8(this, nl8.I);
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
                il0 il0Var = (il0) arrayList.get(i);
                if (!il0Var.getBounds().isEmpty()) {
                    il0Var.setBounds(0, 0, 0, 0);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.makeMeasureSpec((int) (this.w + this.N + this.M), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ml8 ml8Var;
        if (this.x >= gl.L(8.0f)) {
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
                    ml8 ml8Var2 = (ml8) arrayList.get(i);
                    if (!ml8Var2.o && ml8Var2.d.contains(x, y)) {
                        this.U = ml8Var2;
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
            } else if ((action == 1 || action == 3) && (ml8Var = this.U) != null) {
                ml8Var.b.c(false);
                if (action == 1 && this.U.d.contains(x, y)) {
                    if (System.currentTimeMillis() - this.a0 > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    ml8 ml8Var3 = this.U;
                    if (ml8Var3.t && !ml8Var3.s) {
                        ml8Var3.s = true;
                        invalidate();
                    }
                    ml8 ml8Var4 = this.U;
                    int i2 = ml8Var4.u;
                    if (i2 != 0) {
                        ml8Var4.d(i2, 0, 0);
                    }
                    this.U.w = System.currentTimeMillis();
                    ml8 ml8Var5 = this.U;
                    ol8 ol8Var = this.y;
                    if (ol8Var != null) {
                        short s = ml8Var5.v;
                        if (s == 0) {
                            byte b = ml8Var5.a;
                            RectF rectF = ml8Var5.d;
                            float f = rectF.left;
                            float f2 = rectF.top;
                            ProfileActivity profileActivity = ((ql8) ol8Var).b;
                            RectF rectF2 = ProfileActivity.Z6;
                            profileActivity.t2(f, f2, b);
                        } else {
                            postDelayed(new ll8(this, ml8Var5, (byte) 0), s);
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

    public final void p(ml8 ml8Var, boolean z) {
        nl8 nl8Var;
        boolean z2 = this.H;
        if (z) {
            if (z2) {
                ml8Var.c(k96.M0(2131746494, null));
                ml8Var.d(2131624166, 2131231157, 2131232500);
                return;
            }
            ml8Var.c(k96.M0(2131746493, null));
            ml8Var.d(2131624165, 2131231163, 2131232505);
            return;
        }
        if (z2) {
            nl8Var = nl8.e;
        } else {
            nl8Var = nl8.f;
        }
        ml8Var.d(0, nl8Var.b, nl8Var.c);
        ml8Var.c(k96.M0(nl8Var.a, null));
    }

    public void setGlassFactory(kl0 kl0Var) {
        this.h = kl0Var;
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
        ml8 i = i(1, this.a);
        if (i != null) {
            p(i, z2);
            invalidate();
            return;
        }
        this.E.add(1);
        d();
    }

    public void setOnActionClickListener(ol8 ol8Var) {
        this.y = ol8Var;
    }

    public void setParentExpanded(float f) {
        if (this.d != f) {
            this.d = f;
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && !(drawable instanceof r86)) {
            return false;
        }
        return true;
    }
}
