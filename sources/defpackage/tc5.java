package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class tc5 extends d implements gk7 {
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final String a;
    public final String b;
    public final String c;
    public final t1b d;
    public a6 e;
    public wq1 f;
    public FrameLayout h;
    public qc5 n;
    public qa7 r;
    public FrameLayout s;
    public TextView w;
    public float x;
    public ValueAnimator y;

    public tc5(String str, wjb wjbVar) {
        super(null);
        setResourceProvider(wjbVar);
        String str2 = "";
        String trim = (str == null ? "" : str).trim();
        if (!trim.startsWith("#") && !trim.startsWith("$")) {
            trim = "#".concat(trim);
        }
        int indexOf = trim.indexOf("@");
        if (indexOf > 0) {
            String substring = trim.substring(0, indexOf);
            this.b = substring;
            this.c = trim.substring(indexOf + 1);
            trim = substring;
        } else {
            this.b = trim;
            this.c = null;
        }
        if (!TextUtils.isEmpty(this.c)) {
            str2 = "@" + this.c;
        }
        this.a = trim.concat(str2);
        this.d = new t1b(this.currentAccount, this.c, trim);
    }

    public final int Y() {
        int i;
        if (this.simpleActionBar.getOccupyStatusBar()) {
            i = gl.m;
        } else {
            i = 0;
        }
        return a.getCurrentActionBarHeight() + i;
    }

    public final void Z(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        tu1 tu1Var;
        fu fuVar;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i = 0;
        float f4 = 0.0f;
        if (!z2) {
            this.E = z;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.F = f;
            qc5 qc5Var = this.n;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.95f;
            }
            qc5Var.setScaleX(f2);
            qc5 qc5Var2 = this.n;
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.95f;
            }
            qc5Var2.setScaleY(f3);
            FrameLayout frameLayout = this.h;
            if (z) {
                f4 = 1.0f;
            }
            frameLayout.setAlpha(f4);
            FrameLayout frameLayout2 = this.h;
            if (!z) {
                i = 8;
            }
            frameLayout2.setVisibility(i);
            wq1 wq1Var = this.f;
            if (wq1Var != null && (tu1Var = wq1Var.a) != null && (fuVar = tu1Var.a4) != null) {
                fuVar.setScaleX(gl.R1(1.0f, 0.95f, this.F));
                this.f.a.a4.setScaleY(gl.R1(1.0f, 0.95f, this.F));
            }
        } else if (this.E == z) {
        } else {
            this.E = z;
            this.h.setVisibility(0);
            float f5 = this.F;
            if (z) {
                f4 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f4);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new rc5(this, (byte) 1));
            this.G.addListener(new sc5(this, z, (byte) 1));
            this.G.setDuration(320L);
            this.G.setInterpolator(s33.h);
            this.G.start();
        }
    }

    public final void a0(boolean z, boolean z2) {
        float f;
        int i;
        float f2;
        int i2;
        this.r.animate().cancel();
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        qa7 qa7Var = this.r;
        float f3 = 0.0f;
        if (!z2) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            qa7Var.setVisibility(i);
            qa7 qa7Var2 = this.r;
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = -gl.L(48.0f);
            }
            qa7Var2.setTranslationY(f2);
            a6 a6Var = this.e;
            if (z) {
                f3 = gl.L(48.0f);
            }
            a6Var.setTranslationY(f3);
            a6 a6Var2 = this.e;
            if (z) {
                i2 = gl.L(48.0f);
            } else {
                i2 = 0;
            }
            a6Var2.setPadding(0, 0, 0, i2);
            return;
        }
        qa7Var.setVisibility(0);
        ViewPropertyAnimator animate = this.r.animate();
        if (z) {
            f = 0.0f;
        } else {
            f = -gl.L(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f).withEndAction(new x6c((byte) 22, this, z)).setDuration(320L);
        s33 s33Var = s33.h;
        duration.setInterpolator(s33Var).start();
        float f4 = this.x;
        if (z) {
            f3 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f3);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new rc5(this, (byte) 0));
        this.y.addListener(new sc5(this, z, (byte) 0));
        this.y.setDuration(320L);
        this.y.setInterpolator(s33Var);
        this.y.start();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231243);
        pha phaVar = this.simpleActionBar;
        String str = this.a;
        phaVar.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 27));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i = bkb.c6;
        zkb.h(i, getResourceProvider(), frameLayout);
        frameLayout.setClipChildren(false);
        a6 a6Var = new a6(context, (byte) 16);
        this.e = a6Var;
        a6Var.setClipChildren(false);
        frameLayout.addView(this.e, nme.e(-1, -1, 119));
        gl.w3(this.e, 0, Y(), 0, 0);
        cd5.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        wq1 wq1Var = new wq1(context, getParentLayout(), bundle, (byte) 1);
        wq1Var.h = false;
        this.f = wq1Var;
        this.e.addView(wq1Var, nme.e(-1, -1, 119));
        qc5 qc5Var = new qc5(this, context, new ffa(null), this, new Object(), this.resourceProvider);
        this.n = qc5Var;
        if (qc5Var.getSearchOptionsItem() != null) {
            zkb.s(this.n.getSearchOptionsItem(), bkb.F6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.n.setPinnedToTop(true);
        this.n.u0.setTranslationY(0.0f);
        if (this.n.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        qc5 qc5Var2 = this.n;
        t1b t1bVar = this.d;
        qc5Var2.X1 = t1bVar;
        xda xdaVar = qc5Var2.f0;
        xdaVar.s = t1bVar;
        xdaVar.f();
        kfa kfaVar = qc5Var2.g0;
        kfaVar.s = t1bVar;
        kfaVar.f();
        this.n.i1(0, dg0.c(gl.m) + gl.L(48.0f) + Y(), gl.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.n, nme.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        zkb.h(i, getResourceProvider(), frameLayout3);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(gl.o());
        this.w.setTextSize(1, 15.0f);
        zkb.X(this.w, bkb.pf, getResourceProvider());
        this.w.setText(k96.G(t1bVar.J, "FoundStories", new Object[0]));
        this.s.addView(this.w, nme.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        zkb.h(bkb.c7, this.resourceProvider, view);
        this.s.addView(view, nme.a(-1.0f, 1.0f / gl.p, 55));
        this.h.addView(this.s, nme.e(-1, 49, 87));
        this.e.addView(this.h, nme.e(-1, -1, 119));
        qa7 qa7Var = new qa7(context, this.resourceProvider);
        this.r = qa7Var;
        int themedColor = getThemedColor(i);
        int i2 = bkb.h6;
        ff0 g0 = bkb.g0(themedColor, getThemedColor(i2));
        vkb M = zkb.M(i);
        vkb M2 = zkb.M(i2);
        wjb resourceProvider = getResourceProvider();
        qa7Var.setBackground(g0);
        zkb.j(qa7Var, g0, M, M2, resourceProvider);
        this.r.setOnClickListener(new b95(this, (byte) 7));
        a0(this.r.a(t1bVar), false);
        this.r.b(cd5.a(this.currentAccount).d.m, this.b, this.c);
        frameLayout.addView(this.r, nme.e(-1, 48, 55));
        gl.w3(this.r, 0, Y(), 0, 0);
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        pha phaVar2 = this.simpleActionBar;
        wjb resourceProvider2 = getResourceProvider();
        baseSimpleGlass.m = frameLayout;
        baseSimpleGlass.n = null;
        baseSimpleGlass.g(frameLayout, phaVar2, resourceProvider2);
        baseSimpleGlass.o = new cg0(this, frameLayout, (byte) 5);
        this.n.setPagesGlassEngine(this.glassEngine);
        pha phaVar3 = this.simpleActionBar;
        phaVar3.setBackground(baseSimpleGlass.a(phaVar3));
        Z(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        wq1 wq1Var;
        if (i == kk7.z5) {
            Object obj = objArr[0];
            t1b t1bVar = this.d;
            if (obj == t1bVar) {
                qa7 qa7Var = this.r;
                if (qa7Var != null) {
                    a0(qa7Var.a(t1bVar), true);
                }
                TextView textView = this.w;
                if (textView != null) {
                    textView.setText(k96.G(t1bVar.J, "FoundStories", new Object[0]));
                }
            }
        } else if (i == kk7.H0 && (wq1Var = this.f) != null && wq1Var.a != null && ((Integer) objArr[0]).intValue() == this.f.a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            qa7 qa7Var2 = this.r;
            if (qa7Var2 != null) {
                qa7Var2.b(intValue, this.b, this.c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (bm2.h(bkb.w0(null, bkb.c6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().M1().I;
        t1b t1bVar = this.d;
        arrayList.add(t1bVar);
        kk7.f(this.currentAccount).b(this, kk7.z5);
        kk7.f(this.currentAccount).b(this, kk7.H0);
        t1bVar.p(18, true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getMessagesController().M1().I.remove(this.d);
        kk7.f(this.currentAccount).n(this, kk7.z5);
        kk7.f(this.currentAccount).n(this, kk7.H0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
