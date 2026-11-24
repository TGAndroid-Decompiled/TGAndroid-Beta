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
public class fdb extends FrameLayout implements jm7, vlb {
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public zcb I;
    public byte J;
    public String K;
    public int L;
    public String[] M;
    public Runnable N;
    public long O;
    public Path P;
    public Path Q;
    public Paint R;
    public ln S;
    public ln T;
    public ln U;
    public ln V;
    public dw3 W;
    public final int a;
    public float a0;
    public final ylb b;
    public Integer b0;
    public ddb c;
    public Integer c0;
    public bdb d;
    public float d0;
    public cdb e;
    public ln e0;
    public s30 f;
    public ln f0;
    public ln g0;
    public int h;
    public int n;
    public adb r;
    public boolean s;
    public boolean w;
    public ArrayList x;
    public boolean y;

    public fdb(Context context, int i, ms1 ms1Var, ylb ylbVar) {
        super(context);
        this.h = 0;
        this.n = gm.L(10.0f);
        this.O = 0L;
        this.a = i;
        this.c = ms1Var;
        this.b = ylbVar;
        postDelayed(new fx0(i, (byte) 12), 260L);
    }

    public fx2 getPreviewDelegate() {
        adb adbVar = this.r;
        if (adbVar == null) {
            adb adbVar2 = new adb(this);
            this.r = adbVar2;
            return adbVar2;
        }
        return adbVar;
    }

    public final void b() {
        if (this.e == null) {
            this.P = new Path();
            this.Q = new Path();
            bdb bdbVar = new bdb((byte) 0, getContext(), this);
            this.d = bdbVar;
            d53 d53Var = d53.h;
            this.S = new ln(bdbVar, 120L, 350L, d53Var);
            this.T = new ln(this.d, 150L, 600L, d53Var);
            new OvershootInterpolator(0.4f);
            this.U = new ln(300L, this.d, d53Var);
            this.V = new ln(300L, this.d, d53Var);
            this.e0 = new ln(200L, this.d, d53Var);
            this.f0 = new ln(350L, this.d, d53Var);
            this.g0 = new ln(350L, this.d, d53Var);
            cdb cdbVar = new cdb(this, getContext());
            this.e = cdbVar;
            s30 s30Var = new s30(this, this, (byte) 16);
            this.f = s30Var;
            cdbVar.setAdapter(s30Var);
            getContext();
            u46 u46Var = new u46();
            u46Var.i1(0);
            this.e.setLayoutManager(u46Var);
            sc3 sc3Var = new sc3();
            sc3Var.n(45L);
            sc3Var.o = d53Var;
            this.e.setItemAnimator(sc3Var);
            anb.J(this.e, cmb.h6, this.b);
            cdb cdbVar2 = this.e;
            s19 s19Var = new s19(this, (byte) 19);
            cdbVar2.setOnItemClickListener(s19Var);
            this.e.setOnTouchListener(new f8(this, s19Var, (byte) 8));
            this.d.addView(this.e, qoe.c(52.0f, -1));
            addView(this.d, qoe.a(-1.0f, 66.66f, 80));
            ddb ddbVar = this.c;
            if (ddbVar != null) {
                ddbVar.d(new og6(this, (byte) 16));
            }
        }
    }

    public int c() {
        return 2;
    }

    public final void d() {
        zcb zcbVar = this.I;
        if (zcbVar != null) {
            gm.r(zcbVar);
        }
        zcb zcbVar2 = new zcb(this, (byte) 0);
        this.I = zcbVar2;
        gm.d3(zcbVar2, 16L);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.L2) {
            ArrayList arrayList = this.x;
            if (arrayList != null && !arrayList.isEmpty()) {
                d();
            }
        } else if (i == nm7.m4 && this.e != null) {
            for (int i3 = 0; i3 < this.e.getChildCount(); i3++) {
                this.e.getChildAt(i3).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cdb cdbVar = this.e;
        if (cdbVar == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f = this.g0.c;
        float f2 = this.f0.c;
        RectF rectF = gm.P;
        float f3 = f / 2.0f;
        rectF.set(this.e.getTranslationX() + (f2 - f3) + cdbVar.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f2 + f3 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
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
        zcb zcbVar = this.I;
        if (zcbVar != null) {
            gm.r(zcbVar);
            this.I = null;
        }
        this.s = false;
        this.w = true;
        bdb bdbVar = this.d;
        if (bdbVar != null) {
            bdbVar.invalidate();
        }
    }

    public final boolean f(s19 s19Var, MotionEvent motionEvent) {
        return hx2.e().h(motionEvent, this.e, s19Var, getPreviewDelegate(), this.b);
    }

    public ddb getDelegate() {
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
        nm7.e().b(this, nm7.m4);
        nm7.f(this.a).b(this, nm7.L2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.m4);
        nm7.f(this.a).n(this, nm7.L2);
    }

    public void setDelegate(ddb ddbVar) {
        this.c = ddbVar;
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
        ylb ylbVar = this.b;
        if (paint != null) {
            paint.setColor(cmb.v0(cmb.sf, ylbVar));
        }
        int v0 = cmb.v0(cmb.sf, ylbVar);
        if (this.G == null || this.H != v0) {
            this.H = v0;
            this.G = new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = cmb.D4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.G;
            if (colorFilter != porterDuffColorFilter) {
                cmb.D4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = cmb.E4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.G;
            if (colorFilter2 != porterDuffColorFilter2) {
                cmb.E4.setColorFilter(porterDuffColorFilter2);
            }
        }
        bdb bdbVar = this.d;
        if (bdbVar != null) {
            bdbVar.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
