package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public class dbb extends FrameLayout implements gk7, tjb {
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public kya I;
    public byte J;
    public String K;
    public int L;
    public String[] M;
    public Runnable N;
    public long O;
    public Path P;
    public Path Q;
    public Paint R;
    public lm S;
    public lm T;
    public lm U;
    public lm V;
    public su3 W;
    public final int a;
    public float a0;
    public final wjb b;
    public Integer b0;
    public bbb c;
    public Integer c0;
    public zab d;
    public float d0;
    public abb e;
    public lm e0;
    public s20 f;
    public lm f0;
    public lm g0;
    public int h;
    public int n;
    public yab r;
    public boolean s;
    public boolean w;
    public ArrayList x;
    public boolean y;

    public dbb(Context context, int i, ar1 ar1Var, wjb wjbVar) {
        super(context);
        this.h = 0;
        this.n = gl.L(10.0f);
        this.O = 0L;
        this.a = i;
        this.c = ar1Var;
        this.b = wjbVar;
        postDelayed(new xv0(i, (byte) 12), 260L);
    }

    public vv2 getPreviewDelegate() {
        yab yabVar = this.r;
        if (yabVar == null) {
            yab yabVar2 = new yab(this);
            this.r = yabVar2;
            return yabVar2;
        }
        return yabVar;
    }

    public final void b() {
        if (this.e == null) {
            this.P = new Path();
            this.Q = new Path();
            zab zabVar = new zab((byte) 0, getContext(), this);
            this.d = zabVar;
            s33 s33Var = s33.h;
            this.S = new lm(zabVar, 120L, 350L, s33Var);
            this.T = new lm(this.d, 150L, 600L, s33Var);
            new OvershootInterpolator(0.4f);
            this.U = new lm(300L, this.d, s33Var);
            this.V = new lm(300L, this.d, s33Var);
            this.e0 = new lm(200L, this.d, s33Var);
            this.f0 = new lm(350L, this.d, s33Var);
            this.g0 = new lm(350L, this.d, s33Var);
            abb abbVar = new abb(this, getContext());
            this.e = abbVar;
            s20 s20Var = new s20(this, this, (byte) 16);
            this.f = s20Var;
            abbVar.setAdapter(s20Var);
            getContext();
            t26 t26Var = new t26();
            t26Var.i1(0);
            this.e.setLayoutManager(t26Var);
            gb3 gb3Var = new gb3();
            gb3Var.n(45L);
            gb3Var.o = s33Var;
            this.e.setItemAnimator(gb3Var);
            zkb.J(this.e, bkb.h6, this.b);
            abb abbVar2 = this.e;
            f09 f09Var = new f09(this, (byte) 18);
            abbVar2.setOnItemClickListener(f09Var);
            this.e.setOnTouchListener(new f8(this, f09Var, (byte) 8));
            this.d.addView(this.e, nme.c(52.0f, -1));
            addView(this.d, nme.a(-1.0f, 66.66f, 80));
            bbb bbbVar = this.c;
            if (bbbVar != null) {
                bbbVar.d(new jf6(this, (byte) 15));
            }
        }
    }

    public int c() {
        return 2;
    }

    public final void d() {
        kya kyaVar = this.I;
        if (kyaVar != null) {
            gl.r(kyaVar);
        }
        kya kyaVar2 = new kya(this, (byte) 22);
        this.I = kyaVar2;
        gl.e3(kyaVar2, 16L);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.K2) {
            ArrayList arrayList = this.x;
            if (arrayList != null && !arrayList.isEmpty()) {
                d();
            }
        } else if (i == kk7.k4 && this.e != null) {
            for (int i3 = 0; i3 < this.e.getChildCount(); i3++) {
                this.e.getChildAt(i3).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        abb abbVar = this.e;
        if (abbVar == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f = this.g0.c;
        float f2 = this.f0.c;
        RectF rectF = gl.P;
        float f3 = f / 2.0f;
        rectF.set(this.e.getTranslationX() + (f2 - f3) + abbVar.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f2 + f3 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
        rectF.offset(this.d.getX(), this.d.getY());
        if (this.s && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            motionEvent.setAction(3);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        kya kyaVar = this.I;
        if (kyaVar != null) {
            gl.r(kyaVar);
            this.I = null;
        }
        this.s = false;
        this.w = true;
        zab zabVar = this.d;
        if (zabVar != null) {
            zabVar.invalidate();
        }
    }

    public final boolean f(f09 f09Var, MotionEvent motionEvent) {
        return xv2.e().h(motionEvent, this.e, f09Var, getPreviewDelegate(), this.b);
    }

    public bbb getDelegate() {
        return this.c;
    }

    public int getDirection() {
        return this.h;
    }

    @Override
    public final boolean isShown() {
        return this.s;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.k4);
        kk7.f(this.a).b(this, kk7.K2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.k4);
        kk7.f(this.a).n(this, kk7.K2);
    }

    public void setDelegate(bbb bbbVar) {
        this.c = bbbVar;
    }

    public void setDirection(int i) {
        if (this.h != i) {
            this.h = i;
            requestLayout();
        }
    }

    public void setHorizontalPadding(int i) {
        this.n = i;
    }

    @Override
    public final void updateColors() {
        Paint paint = this.R;
        wjb wjbVar = this.b;
        if (paint != null) {
            paint.setColor(bkb.v0(bkb.sf, wjbVar));
        }
        int v0 = bkb.v0(bkb.sf, wjbVar);
        if (this.G == null || this.H != v0) {
            this.H = v0;
            this.G = new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = bkb.D4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.G;
            if (colorFilter != porterDuffColorFilter) {
                bkb.D4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = bkb.E4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.G;
            if (colorFilter2 != porterDuffColorFilter2) {
                bkb.E4.setColorFilter(porterDuffColorFilter2);
            }
        }
        zab zabVar = this.d;
        if (zabVar != null) {
            zabVar.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
