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
public class zeb extends FrameLayout implements fn7, snb {
    public boolean E;
    public boolean F;
    public PorterDuffColorFilter G;
    public int H;
    public s8b I;
    public byte J;
    public String K;
    public int L;
    public String[] M;
    public Runnable N;
    public long O;
    public Path P;
    public Path Q;
    public Paint R;
    public mm S;
    public mm T;
    public mm U;
    public mm V;
    public mv3 W;
    public final int a;
    public float a0;
    public final vnb b;
    public Integer b0;
    public xeb c;
    public Integer c0;
    public h8b d;
    public float d0;
    public web e;
    public mm e0;
    public t20 f;
    public mm f0;
    public mm g0;
    public int h;
    public int n;
    public veb r;
    public boolean s;
    public boolean w;
    public ArrayList x;
    public boolean y;

    public zeb(Context context, int i, nr1 nr1Var, vnb vnbVar) {
        super(context);
        this.h = 0;
        this.n = hl.L(10.0f);
        this.O = 0L;
        this.a = i;
        this.c = nr1Var;
        this.b = vnbVar;
        postDelayed(new gw0(i, (byte) 16), 260L);
    }

    public pw2 getPreviewDelegate() {
        veb vebVar = this.r;
        if (vebVar == null) {
            veb vebVar2 = new veb(this);
            this.r = vebVar2;
            return vebVar2;
        }
        return vebVar;
    }

    public final void b() {
        if (this.e == null) {
            this.P = new Path();
            this.Q = new Path();
            h8b h8bVar = new h8b((byte) 2, getContext(), this);
            this.d = h8bVar;
            k43 k43Var = k43.h;
            this.S = new mm(h8bVar, 120L, 350L, k43Var);
            this.T = new mm(this.d, 150L, 600L, k43Var);
            new OvershootInterpolator(0.4f);
            this.U = new mm(300L, this.d, k43Var);
            this.V = new mm(300L, this.d, k43Var);
            this.e0 = new mm(200L, this.d, k43Var);
            this.f0 = new mm(350L, this.d, k43Var);
            this.g0 = new mm(350L, this.d, k43Var);
            web webVar = new web(this, getContext());
            this.e = webVar;
            t20 t20Var = new t20(this, this, (byte) 16);
            this.f = t20Var;
            webVar.setAdapter(t20Var);
            getContext();
            x46 x46Var = new x46();
            x46Var.i1(0);
            this.e.setLayoutManager(x46Var);
            zb3 zb3Var = new zb3();
            zb3Var.n(45L);
            zb3Var.o = k43Var;
            this.e.setItemAnimator(zb3Var);
            yob.J(this.e, aob.i6, this.b);
            web webVar2 = this.e;
            t39 t39Var = new t39(this, (byte) 18);
            webVar2.setOnItemClickListener(t39Var);
            this.e.setOnTouchListener(new g8(this, t39Var, (byte) 8));
            this.d.addView(this.e, tre.c(52.0f, -1));
            addView(this.d, tre.a(-1.0f, 66.66f, 80));
            xeb xebVar = this.c;
            if (xebVar != null) {
                xebVar.d(new nh6(this, (byte) 16));
            }
        }
    }

    public int c() {
        return 2;
    }

    public final void d() {
        s8b s8bVar = this.I;
        if (s8bVar != null) {
            hl.r(s8bVar);
        }
        s8b s8bVar2 = new s8b(this, (byte) 9);
        this.I = s8bVar2;
        hl.d3(s8bVar2, 16L);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.L2) {
            ArrayList arrayList = this.x;
            if (arrayList != null && !arrayList.isEmpty()) {
                d();
            }
        } else if (i == jn7.l4 && this.e != null) {
            for (int i3 = 0; i3 < this.e.getChildCount(); i3++) {
                this.e.getChildAt(i3).invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        web webVar = this.e;
        if (webVar == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        float f = this.g0.c;
        float f2 = this.f0.c;
        RectF rectF = hl.P;
        float f3 = f / 2.0f;
        rectF.set(this.e.getTranslationX() + (f2 - f3) + webVar.getPaddingLeft(), this.e.getPaddingTop() + this.e.getTop(), Math.min(this.e.getTranslationX() + f2 + f3 + this.e.getPaddingLeft(), getWidth() - this.d.getPaddingRight()), this.e.getBottom());
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
        s8b s8bVar = this.I;
        if (s8bVar != null) {
            hl.r(s8bVar);
            this.I = null;
        }
        this.s = false;
        this.w = true;
        h8b h8bVar = this.d;
        if (h8bVar != null) {
            h8bVar.invalidate();
        }
    }

    public final boolean f(t39 t39Var, MotionEvent motionEvent) {
        return rw2.e().h(motionEvent, this.e, t39Var, getPreviewDelegate(), this.b);
    }

    public xeb getDelegate() {
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
        jn7.e().b(this, jn7.l4);
        jn7.f(this.a).b(this, jn7.L2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.l4);
        jn7.f(this.a).n(this, jn7.L2);
    }

    public void setDelegate(xeb xebVar) {
        this.c = xebVar;
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
        vnb vnbVar = this.b;
        if (paint != null) {
            paint.setColor(aob.v0(aob.tf, vnbVar));
        }
        int v0 = aob.v0(aob.tf, vnbVar);
        if (this.G == null || this.H != v0) {
            this.H = v0;
            this.G = new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY);
        }
        Drawable drawable = aob.E4;
        if (drawable != null) {
            ColorFilter colorFilter = drawable.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter = this.G;
            if (colorFilter != porterDuffColorFilter) {
                aob.E4.setColorFilter(porterDuffColorFilter);
            }
        }
        Drawable drawable2 = aob.F4;
        if (drawable2 != null) {
            ColorFilter colorFilter2 = drawable2.getColorFilter();
            PorterDuffColorFilter porterDuffColorFilter2 = this.G;
            if (colorFilter2 != porterDuffColorFilter2) {
                aob.F4.setColorFilter(porterDuffColorFilter2);
            }
        }
        h8b h8bVar = this.d;
        if (h8bVar != null) {
            h8bVar.invalidate();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
