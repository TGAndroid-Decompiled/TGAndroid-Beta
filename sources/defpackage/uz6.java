package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public abstract class uz6 extends FrameLayout implements gk7 {
    public final Rect E;
    public Paint F;
    public Integer G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final vl6 K;
    public yla L;
    public boolean M;
    public float N;
    public boolean O;
    public int P;
    public ArrayList Q;
    public final qz6 R;
    public il0 S;
    public final Path T;
    public final RectF U;
    public final wjb a;
    public final tz6 b;
    public final xe2 c;
    public final nz6 d;
    public final or7 e;
    public final kz6 f;
    public final d h;
    public float n;
    public float r;
    public float s;
    public float w;
    public k0 x;
    public rz6 y;

    public uz6(Context context, long j, long j2, d dVar, wjb wjbVar) {
        super(context);
        this.E = new Rect();
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = new vl6(this, (byte) 9);
        this.M = false;
        this.N = 0.0f;
        this.O = false;
        this.R = new qz6(this);
        this.T = new Path();
        this.U = new RectF();
        this.h = dVar;
        this.a = wjbVar;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.w = (int) Math.min(gl.L(126.0f), gl.q.y * 0.22f);
        tz6 tz6Var = new tz6(this, context, wjbVar);
        this.b = tz6Var;
        xe2 xe2Var = new xe2((byte) 3, this, false);
        this.c = xe2Var;
        xe2Var.i1(1);
        nz6 nz6Var = new nz6(this);
        this.d = nz6Var;
        nz6Var.O = new oz6(this);
        gb3 gb3Var = new gb3();
        gb3Var.c = (short) 150;
        gb3Var.e = (short) 150;
        gb3Var.f = (short) 150;
        gb3Var.g = (short) 150;
        gb3Var.d = (short) 150;
        gb3Var.o = s33.f;
        gb3Var.C = false;
        tz6Var.setItemAnimator(gb3Var);
        tz6Var.setClipToPadding(false);
        tz6Var.setLayoutManager(xe2Var);
        kz6 kz6Var = new kz6(context, j, j2, new pz6(this, dVar), wjbVar, h());
        this.f = kz6Var;
        ?? w39Var = new w39();
        w39Var.d = null;
        w39Var.f = false;
        nr7 nr7Var = new nr7(w39Var, (byte) 0);
        w39Var.c = kz6Var;
        kz6Var.B(nr7Var);
        this.e = w39Var;
        tz6Var.setAdapter(w39Var);
        tz6Var.setTranslationY(gl.L(6.0f));
        addView(tz6Var, nme.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i;
        nz6 nz6Var;
        kz6 kz6Var;
        int height;
        tz6 tz6Var = this.b;
        if (tz6Var != null && this.c != null) {
            boolean g = g();
            this.s = 0.0f;
            or7 or7Var = this.e;
            if (g) {
                if (or7Var.f) {
                    height = or7Var.e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, tz6Var.getTranslationY() + height) + this.s, (1.0f - this.N) * getHeight());
                this.n = 0.0f;
                this.r = min;
            } else {
                if (or7Var.f) {
                    i = or7Var.e.getBottom();
                } else {
                    i = 0;
                }
                this.n = Math.max(Math.max(0.0f, tz6Var.getTranslationY() + i) - this.s, this.N * getHeight());
                this.r = getMeasuredHeight();
            }
            il0 il0Var = this.S;
            if (il0Var != null) {
                il0Var.setBounds(0, ((int) this.n) - gl.L(5.0f), getMeasuredWidth(), gl.L(5.0f) + ((int) this.r));
                Path path = this.T;
                path.rewind();
                Rect rect = this.S.S.m;
                RectF rectF = this.U;
                rectF.set(rect);
                if (tz6Var != null && (nz6Var = this.d) != null && tz6Var.getLayoutManager() == nz6Var && (kz6Var = this.f) != null && kz6Var.S != null) {
                    rectF.inset(gl.L(2.0f), gl.L(2.0f));
                    path.addRoundRect(rectF, gl.L(20.0f), gl.L(20.0f), Path.Direction.CW);
                } else {
                    path.addRoundRect(rectF, gl.L(22.0f), gl.L(22.0f), Path.Direction.CW);
                }
                path.close();
                invalidate();
            }
        }
    }

    public final void c() {
        boolean z;
        float f;
        int i;
        nz6 nz6Var;
        kz6 kz6Var;
        tz6 tz6Var = this.b;
        if (tz6Var != null && this.c != null) {
            int i2 = 0;
            if (tz6Var != null && (nz6Var = this.d) != null && tz6Var.getLayoutManager() == nz6Var && (kz6Var = this.f) != null && kz6Var.S != null) {
                z = true;
            } else {
                z = false;
            }
            if (this.S == null) {
                tz6Var.setPadding(0, 0, 0, 0);
                return;
            }
            float f2 = 5.0f;
            if (z) {
                f = 7.0f;
            } else {
                f = 5.0f;
            }
            int L = gl.L(f);
            if (z) {
                i = gl.L(2.0f);
                f2 = 7.0f;
            } else {
                i = 0;
            }
            int L2 = gl.L(f2);
            if (z) {
                i2 = gl.L(2.0f);
            }
            tz6Var.setPadding(L, i, L2, i2);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.n;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            gl.d0(this.b, new bm0((byte) 18));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        float min;
        int v0;
        int height;
        il0 il0Var = this.S;
        if (il0Var != null) {
            il0Var.draw(canvas);
            canvas.save();
            canvas.clipPath(this.T);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g = g();
        kz6 kz6Var = this.f;
        if ((kz6Var.N() || kz6Var.S != null) && ((kz6Var.y0 || kz6Var.B0 != null) && kz6Var.I() == null && kz6Var.V == null)) {
            i = 2;
        } else {
            i = 0;
        }
        this.s = gl.L(i + 2);
        canvas.save();
        float L = gl.L(6.0f);
        float f = this.n;
        or7 or7Var = this.e;
        tz6 tz6Var = this.b;
        Rect rect = this.E;
        if (g) {
            if (or7Var.f) {
                height = or7Var.e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, tz6Var.getTranslationY() + height) + this.s, (1.0f - this.N) * getHeight());
            this.n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.r = min2;
            rect.set(0, 0, measuredWidth, (int) min2);
            min = Math.min(L, Math.abs(getMeasuredHeight() - this.r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (tz6Var.getLayoutManager() == this.d) {
                this.s += gl.L(2.0f);
                L += gl.L(2.0f);
            }
            if (or7Var.f) {
                i2 = or7Var.e.getBottom();
            } else {
                i2 = 0;
            }
            float max = Math.max(0.0f, tz6Var.getTranslationY() + i2) - this.s;
            this.n = max;
            float max2 = Math.max(max, this.N * getHeight());
            this.n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(L, Math.abs(this.n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f - this.n) > 0.1f) {
            i();
        }
        if (this.F == null) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setShadowLayer(gl.L(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.F;
        Integer num = this.G;
        if (num != null) {
            v0 = num.intValue();
        } else {
            v0 = bkb.v0(bkb.Ie, this.a);
        }
        paint2.setColor(v0);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f) {
        RectF rectF = gl.P;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f, f, this.F);
    }

    public final boolean g() {
        d49 layoutManager = this.b.getLayoutManager();
        xe2 xe2Var = this.c;
        if (layoutManager == xe2Var && xe2Var.t) {
            return true;
        }
        return false;
    }

    public kz6 getAdapter() {
        return this.f;
    }

    public t26 getCurrentLayoutManager() {
        d49 layoutManager = this.b.getLayoutManager();
        xe2 xe2Var = this.c;
        if (layoutManager == xe2Var) {
            return xe2Var;
        }
        return this.d;
    }

    public tz6 getListView() {
        return this.b;
    }

    public t26 getNeededLayoutManager() {
        kz6 kz6Var = this.f;
        if ((!kz6Var.N() && kz6Var.S == null) || (!kz6Var.y0 && kz6Var.B0 == null)) {
            return this.c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof s18;
    }

    public final void o(boolean z) {
        long j;
        float computeVerticalScrollOffset;
        int i;
        if (z) {
            boolean g = g();
            if (!this.J) {
                this.I = true;
                tz6 tz6Var = this.b;
                d49 layoutManager = tz6Var.getLayoutManager();
                xe2 xe2Var = this.c;
                if (layoutManager == xe2Var) {
                    if (g) {
                        i = -100000;
                    } else {
                        i = 100000;
                    }
                    xe2Var.g1(0, i);
                }
                if (getVisibility() == 8) {
                    this.N = 1.0f;
                    if (g) {
                        computeVerticalScrollOffset = -(this.w + gl.L(12.0f));
                    } else {
                        computeVerticalScrollOffset = tz6Var.computeVerticalScrollOffset() + this.w;
                    }
                    tz6Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.I = false;
        }
        this.J = z;
        vl6 vl6Var = this.K;
        gl.r(vl6Var);
        yla ylaVar = this.L;
        if (ylaVar != null) {
            ylaVar.d();
        }
        d dVar = this.h;
        if (dVar != null && dVar.getFragmentBeginToShow()) {
            j = 0;
        } else {
            j = 100;
        }
        gl.d3(vl6Var, j);
        if (z) {
            m();
        } else {
            j();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.k4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.k4);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        c();
        super.onMeasure(i, i2);
    }

    public final void p(rz6 rz6Var) {
        this.y = rz6Var;
        tz6 listView = getListView();
        k0 k0Var = new k0(this, rz6Var, (byte) 16);
        this.x = k0Var;
        listView.setOnItemClickListener(k0Var);
        getListView().setOnTouchListener(new a7(this, (byte) 10));
    }

    @Override
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(il0 il0Var) {
        this.S = il0Var;
        il0Var.r(gl.L(22.0f));
        this.S.q(gl.L(5.0f));
        c();
    }

    public void setDialogId(long j) {
        kz6 kz6Var = this.f;
        if (kz6Var.n != j) {
            kz6Var.n = j;
        }
    }

    public void setIgnoreLayout(boolean z) {
        this.H = z;
    }

    public void setOverrideColor(int i) {
        this.G = Integer.valueOf(i);
        invalidate();
    }

    public void setReversed(boolean z) {
        if (z != g()) {
            this.I = true;
            this.c.j1(z);
            kz6 kz6Var = this.f;
            if (kz6Var.M0 != z) {
                kz6Var.M0 = z;
                int i = kz6Var.N0;
                if (i > 0) {
                    kz6Var.g(0);
                }
                if (i > 1) {
                    kz6Var.g(i - 1);
                }
            }
        }
    }

    public void i() {
    }

    public void j() {
    }

    public void m() {
    }

    public void k(TLRPC.BotInlineResult botInlineResult) {
    }

    public void l(boolean z) {
    }

    public void n(boolean z) {
    }
}
