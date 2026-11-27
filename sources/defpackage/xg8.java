package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class xg8 extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, snb {
    public final int[] E;
    public final Rect F;
    public ViewTreeObserver G;
    public int H;
    public final fm0 I;
    public final fm0 J;
    public final qy a;
    public final vl4 b;
    public final yg8 c;
    public final zu1 d;
    public final FrameLayout.LayoutParams e;
    public final ema f;
    public zg8 h;
    public wb2 n;
    public int r;
    public gn1 s;
    public final b6 w;
    public final b6 x;
    public final int y;

    public xg8(zu1 zu1Var, vnb vnbVar, Activity activity) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.E = new int[2];
        this.F = new Rect();
        jz7 jz7Var = new jz7(this, (byte) 8);
        k43 k43Var = k43.h;
        this.I = new fm0(0, jz7Var, k43Var, 380L, false);
        this.J = new fm0(0, new jz7(this, (byte) 8), k43Var, 380L, false);
        this.d = zu1Var;
        this.y = zu1Var.getMessagesController().l4.T.f();
        qy qyVar = new qy(this, activity, vnbVar, (byte) 1);
        this.a = qyVar;
        qyVar.setAllowTextEntitiesIntersection(true);
        yob.X(qyVar, aob.G6, vnbVar);
        yob.G(qyVar, aob.Xc, vnbVar);
        yob.D(qyVar, aob.H6, vnbVar);
        qyVar.setHint(ob6.M0(2131746910, null));
        qyVar.setTextSize(1, 15.0f);
        qyVar.setMaxLines(Integer.MAX_VALUE);
        qyVar.setBackground(null);
        qyVar.setImeOptions(268435462);
        qyVar.setInputType(qyVar.getInputType() | 16384);
        qyVar.addTextChangedListener(new nh6(this, (byte) 7));
        vl4 vl4Var = new vl4(activity);
        this.b = vl4Var;
        int i = aob.Mi;
        hf0 f0 = aob.f0(aob.v0(i, vnbVar), 1, -1);
        uob M = yob.M(i);
        vl4Var.setBackground(f0);
        yob.j(vl4Var, f0, null, M, vnbVar);
        iye.a(vl4Var);
        yg8 yg8Var = new yg8(getContext(), 36);
        this.c = yg8Var;
        hf0 f02 = aob.f0(aob.v0(i, vnbVar), 1, -1);
        uob M2 = yob.M(i);
        yg8Var.setBackground(f02);
        yob.j(yg8Var, f02, null, M2, vnbVar);
        yg8Var.setOnClickListener(new uv5(this, zu1Var, (byte) 22));
        iye.a(yg8Var);
        ema emaVar = new ema(getContext());
        this.f = emaVar;
        emaVar.setTextSize(13);
        emaVar.setGravity(17);
        emaVar.setTranslationY(hl.L(44.0f));
        emaVar.setVisibility(8);
        b6 b6Var = new b6(activity, (byte) 28);
        this.x = b6Var;
        addView(b6Var, layoutParams);
        b6 b6Var2 = new b6(activity, (byte) 27);
        this.w = b6Var2;
        b6Var.addView(b6Var2, tre.c(-2.0f, -1));
        b6Var2.addView(emaVar, tre.e(54, 24, 53));
        b6Var2.addView(vl4Var, tre.e(44, 44, 51));
        b6Var2.addView(yg8Var, tre.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        b6Var2.addView(qyVar, tre.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        qyVar.setPadding(hl.L(5.0f), hl.L(11.0f), hl.L(5.0f), hl.L(11.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.p7));
    }

    public zg8 getAttachedMedia() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.G = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.G;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.G.removeOnPreDrawListener(this);
        }
        this.G = null;
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onPreDraw() {
        cc2 cc2Var;
        wg8 wg8Var;
        wb2 wb2Var = this.n;
        if (wb2Var != null) {
            int e1 = wb2Var.getMessageObject().e1();
            if (this.n.isAttachedToWindow() && this.r == e1 && (cc2Var = this.n.x2) != null && (wg8Var = cc2Var.l) != null && cc2Var.s) {
                Rect bounds = wg8Var.getBounds();
                Rect rect = this.F;
                rect.set(bounds);
                wb2 wb2Var2 = this.n;
                int[] iArr = this.E;
                wb2Var2.getLocationInWindow(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i - iArr[0], i2 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i3 = layoutParams.width;
                b6 b6Var = this.x;
                if (i3 != width) {
                    layoutParams.width = width;
                    b6Var.setLayoutParams(layoutParams);
                }
                b6Var.setTranslationX(rect.left);
                b6Var.setTranslationY(hl.L(0.66f) + rect.top);
                return true;
            }
            gn1 gn1Var = this.s;
            if (gn1Var != null) {
                gn1Var.run();
                this.s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f) {
        this.w.setAlpha(f);
    }

    public void setCellToWatch(wb2 wb2Var) {
        this.n = wb2Var;
        this.r = wb2Var.getMessageObject().e1();
    }

    public void setColor(int i) {
        if (this.H != i) {
            this.H = i;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
            vl4 vl4Var = this.b;
            ((Drawable) vl4Var.c).setColorFilter(porterDuffColorFilter);
            ((Drawable) vl4Var.d).setColorFilter(porterDuffColorFilter);
            this.c.a.setColorFilter(porterDuffColorFilter);
            qy qyVar = this.a;
            qyVar.setCursorColor(i);
            qyVar.setHandlesColor(i);
            qyVar.setHintTextColor(i);
        }
    }

    @Override
    public final void updateColors() {
        zu1 zu1Var;
        try {
            ema emaVar = this.f;
            if (emaVar != null && (zu1Var = this.d) != null) {
                emaVar.setTextColor(vm2.f(this.J.e, aob.v0(aob.A6, zu1Var.getResourceProvider()), aob.v0(aob.p7, zu1Var.getResourceProvider())));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
