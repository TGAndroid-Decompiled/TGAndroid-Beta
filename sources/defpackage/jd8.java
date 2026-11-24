package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class jd8 extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, tjb {
    public final int[] E;
    public final Rect F;
    public ViewTreeObserver G;
    public int H;
    public final fm0 I;
    public final fm0 J;
    public final py a;
    public final rj4 b;
    public final kd8 c;
    public final mu1 d;
    public final FrameLayout.LayoutParams e;
    public final jia f;
    public ld8 h;
    public gb2 n;
    public int r;
    public vm1 s;
    public final a6 w;
    public final a6 x;
    public final int y;

    public jd8(mu1 mu1Var, wjb wjbVar, Activity activity) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.E = new int[2];
        this.F = new Rect();
        k88 k88Var = new k88(this, (byte) 1);
        s33 s33Var = s33.h;
        this.I = new fm0(0, k88Var, s33Var, 380L, false);
        this.J = new fm0(0, new k88(this, (byte) 1), s33Var, 380L, false);
        this.d = mu1Var;
        this.y = mu1Var.getMessagesController().k4.M.f();
        py pyVar = new py(this, activity, wjbVar, (byte) 1);
        this.a = pyVar;
        pyVar.setAllowTextEntitiesIntersection(true);
        zkb.X(pyVar, bkb.F6, wjbVar);
        zkb.G(pyVar, bkb.Wc, wjbVar);
        zkb.D(pyVar, bkb.G6, wjbVar);
        pyVar.setHint(k96.M0(2131746990, null));
        pyVar.setTextSize(1, 15.0f);
        pyVar.setMaxLines(Integer.MAX_VALUE);
        pyVar.setBackground(null);
        pyVar.setImeOptions(268435462);
        pyVar.setInputType(pyVar.getInputType() | 16384);
        pyVar.addTextChangedListener(new jf6(this, (byte) 6));
        rj4 rj4Var = new rj4(activity);
        this.b = rj4Var;
        int i = bkb.Li;
        ff0 f0 = bkb.f0(bkb.v0(i, wjbVar), 1, -1);
        vkb M = zkb.M(i);
        rj4Var.setBackground(f0);
        zkb.j(rj4Var, f0, null, M, wjbVar);
        ote.a(rj4Var);
        kd8 kd8Var = new kd8(getContext(), 36);
        this.c = kd8Var;
        ff0 f02 = bkb.f0(bkb.v0(i, wjbVar), 1, -1);
        vkb M2 = zkb.M(i);
        kd8Var.setBackground(f02);
        zkb.j(kd8Var, f02, null, M2, wjbVar);
        kd8Var.setOnClickListener(new v16(this, mu1Var, (byte) 19));
        ote.a(kd8Var);
        jia jiaVar = new jia(getContext());
        this.f = jiaVar;
        jiaVar.setTextSize(13);
        jiaVar.setGravity(17);
        jiaVar.setTranslationY(gl.L(44.0f));
        jiaVar.setVisibility(8);
        a6 a6Var = new a6(activity, (byte) 27);
        this.x = a6Var;
        addView(a6Var, layoutParams);
        a6 a6Var2 = new a6(activity, (byte) 26);
        this.w = a6Var2;
        a6Var.addView(a6Var2, nme.c(-2.0f, -1));
        a6Var2.addView(jiaVar, nme.e(54, 24, 53));
        a6Var2.addView(rj4Var, nme.e(44, 44, 51));
        a6Var2.addView(kd8Var, nme.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        a6Var2.addView(pyVar, nme.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        pyVar.setPadding(gl.L(5.0f), gl.L(11.0f), gl.L(5.0f), gl.L(11.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.o7));
    }

    public ld8 getAttachedMedia() {
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
        mb2 mb2Var;
        id8 id8Var;
        gb2 gb2Var = this.n;
        if (gb2Var != null) {
            int e1 = gb2Var.getMessageObject().e1();
            if (this.n.isAttachedToWindow() && this.r == e1 && (mb2Var = this.n.x2) != null && (id8Var = mb2Var.l) != null && mb2Var.s) {
                Rect bounds = id8Var.getBounds();
                Rect rect = this.F;
                rect.set(bounds);
                gb2 gb2Var2 = this.n;
                int[] iArr = this.E;
                gb2Var2.getLocationInWindow(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i - iArr[0], i2 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i3 = layoutParams.width;
                a6 a6Var = this.x;
                if (i3 != width) {
                    layoutParams.width = width;
                    a6Var.setLayoutParams(layoutParams);
                }
                a6Var.setTranslationX(rect.left);
                a6Var.setTranslationY(gl.L(0.66f) + rect.top);
                return true;
            }
            vm1 vm1Var = this.s;
            if (vm1Var != null) {
                vm1Var.run();
                this.s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f) {
        this.w.setAlpha(f);
    }

    public void setCellToWatch(gb2 gb2Var) {
        this.n = gb2Var;
        this.r = gb2Var.getMessageObject().e1();
    }

    public void setColor(int i) {
        if (this.H != i) {
            this.H = i;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
            rj4 rj4Var = this.b;
            ((Drawable) rj4Var.c).setColorFilter(porterDuffColorFilter);
            ((Drawable) rj4Var.d).setColorFilter(porterDuffColorFilter);
            this.c.a.setColorFilter(porterDuffColorFilter);
            py pyVar = this.a;
            pyVar.setCursorColor(i);
            pyVar.setHandlesColor(i);
            pyVar.setHintTextColor(i);
        }
    }

    @Override
    public final void updateColors() {
        mu1 mu1Var;
        try {
            jia jiaVar = this.f;
            if (jiaVar != null && (mu1Var = this.d) != null) {
                jiaVar.setTextColor(bm2.f(this.J.e, bkb.v0(bkb.z6, mu1Var.getResourceProvider()), bkb.v0(bkb.o7, mu1Var.getResourceProvider())));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
