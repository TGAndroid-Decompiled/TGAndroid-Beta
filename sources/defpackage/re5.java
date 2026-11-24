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
public final class re5 extends d implements jm7 {
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final String a;
    public final String b;
    public final String c;
    public final u3b d;
    public a6 e;
    public is1 f;
    public FrameLayout h;
    public oe5 n;
    public rc7 r;
    public FrameLayout s;
    public TextView w;
    public float x;
    public ValueAnimator y;

    public re5(String str, ylb ylbVar) {
        super(null);
        setResourceProvider(ylbVar);
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
        this.d = new u3b(this.currentAccount, this.c, trim);
    }

    public final int Z() {
        int i;
        if (this.simpleActionBar.getOccupyStatusBar()) {
            i = gm.m;
        } else {
            i = 0;
        }
        return a.getCurrentActionBarHeight() + i;
    }

    public final void a0(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        fw1 fw1Var;
        fv fvVar;
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
            oe5 oe5Var = this.n;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.95f;
            }
            oe5Var.setScaleX(f2);
            oe5 oe5Var2 = this.n;
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.95f;
            }
            oe5Var2.setScaleY(f3);
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
            is1 is1Var = this.f;
            if (is1Var != null && (fw1Var = is1Var.a) != null && (fvVar = fw1Var.a4) != null) {
                fvVar.setScaleX(gm.R1(1.0f, 0.95f, this.F));
                this.f.a.a4.setScaleY(gm.R1(1.0f, 0.95f, this.F));
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
            ofFloat.addUpdateListener(new pe5(this, (byte) 1));
            this.G.addListener(new qe5(this, z, (byte) 1));
            this.G.setDuration(320L);
            this.G.setInterpolator(d53.h);
            this.G.start();
        }
    }

    public final void b0(boolean z, boolean z2) {
        float f;
        int i;
        float f2;
        int i2;
        this.r.animate().cancel();
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        rc7 rc7Var = this.r;
        float f3 = 0.0f;
        if (!z2) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            rc7Var.setVisibility(i);
            rc7 rc7Var2 = this.r;
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = -gm.L(48.0f);
            }
            rc7Var2.setTranslationY(f2);
            a6 a6Var = this.e;
            if (z) {
                f3 = gm.L(48.0f);
            }
            a6Var.setTranslationY(f3);
            a6 a6Var2 = this.e;
            if (z) {
                i2 = gm.L(48.0f);
            } else {
                i2 = 0;
            }
            a6Var2.setPadding(0, 0, 0, i2);
            return;
        }
        rc7Var.setVisibility(0);
        ViewPropertyAnimator animate = this.r.animate();
        if (z) {
            f = 0.0f;
        } else {
            f = -gm.L(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f).withEndAction(new y8c((byte) 22, this, z)).setDuration(320L);
        d53 d53Var = d53.h;
        duration.setInterpolator(d53Var).start();
        float f4 = this.x;
        if (z) {
            f3 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f3);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new pe5(this, (byte) 0));
        this.y.addListener(new qe5(this, z, (byte) 0));
        this.y.setDuration(320L);
        this.y.setInterpolator(d53Var);
        this.y.start();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231244);
        rja rjaVar = this.simpleActionBar;
        String str = this.a;
        rjaVar.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 28));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i = cmb.c6;
        anb.h(i, getResourceProvider(), frameLayout);
        frameLayout.setClipChildren(false);
        a6 a6Var = new a6(context, (byte) 16);
        this.e = a6Var;
        a6Var.setClipChildren(false);
        frameLayout.addView(this.e, qoe.e(-1, -1, 119));
        gm.v3(this.e, 0, Z(), 0, 0);
        af5.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        is1 is1Var = new is1(context, getParentLayout(), bundle, (byte) 1);
        is1Var.h = false;
        this.f = is1Var;
        this.e.addView(is1Var, qoe.e(-1, -1, 119));
        oe5 oe5Var = new oe5(this, context, new fha(null), this, new Object(), this.resourceProvider);
        this.n = oe5Var;
        if (oe5Var.getSearchOptionsItem() != null) {
            anb.s(this.n.getSearchOptionsItem(), cmb.F6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.n.setPinnedToTop(true);
        this.n.u0.setTranslationY(0.0f);
        if (this.n.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        oe5 oe5Var2 = this.n;
        u3b u3bVar = this.d;
        oe5Var2.X1 = u3bVar;
        xfa xfaVar = oe5Var2.f0;
        xfaVar.s = u3bVar;
        xfaVar.f();
        kha khaVar = oe5Var2.g0;
        khaVar.s = u3bVar;
        khaVar.f();
        this.n.i1(0, eh0.c(gm.m) + gm.L(48.0f) + Z(), gm.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.n, qoe.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        anb.h(i, getResourceProvider(), frameLayout3);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(gm.o());
        this.w.setTextSize(1, 15.0f);
        anb.X(this.w, cmb.pf, getResourceProvider());
        this.w.setText(jb6.G(u3bVar.J, "FoundStories", new Object[0]));
        this.s.addView(this.w, qoe.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        anb.h(cmb.c7, this.resourceProvider, view);
        this.s.addView(view, qoe.a(-1.0f, 1.0f / gm.p, 55));
        this.h.addView(this.s, qoe.e(-1, 49, 87));
        this.e.addView(this.h, qoe.e(-1, -1, 119));
        rc7 rc7Var = new rc7(context, this.resourceProvider);
        this.r = rc7Var;
        int themedColor = getThemedColor(i);
        int i2 = cmb.h6;
        fg0 g0 = cmb.g0(themedColor, getThemedColor(i2));
        wmb M = anb.M(i);
        wmb M2 = anb.M(i2);
        ylb resourceProvider = getResourceProvider();
        rc7Var.setBackground(g0);
        anb.j(rc7Var, g0, M, M2, resourceProvider);
        this.r.setOnClickListener(new ca5(this, (byte) 10));
        b0(this.r.a(u3bVar), false);
        this.r.b(af5.a(this.currentAccount).d.m, this.b, this.c);
        frameLayout.addView(this.r, qoe.e(-1, 48, 55));
        gm.v3(this.r, 0, Z(), 0, 0);
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.g(frameLayout, this.simpleActionBar, getResourceProvider());
        baseSimpleGlass.o = new dh0(this, frameLayout, (byte) 5);
        this.n.setPagesGlassEngine(this.glassEngine);
        rja rjaVar2 = this.simpleActionBar;
        rjaVar2.setBackground(baseSimpleGlass.a(rjaVar2));
        a0(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        is1 is1Var;
        if (i == nm7.B5) {
            Object obj = objArr[0];
            u3b u3bVar = this.d;
            if (obj == u3bVar) {
                rc7 rc7Var = this.r;
                if (rc7Var != null) {
                    b0(rc7Var.a(u3bVar), true);
                }
                TextView textView = this.w;
                if (textView != null) {
                    textView.setText(jb6.G(u3bVar.J, "FoundStories", new Object[0]));
                }
            }
        } else if (i == nm7.I0 && (is1Var = this.f) != null && is1Var.a != null && ((Integer) objArr[0]).intValue() == this.f.a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            rc7 rc7Var2 = this.r;
            if (rc7Var2 != null) {
                rc7Var2.b(intValue, this.b, this.c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (on2.h(cmb.w0(null, cmb.c6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().N1().I;
        u3b u3bVar = this.d;
        arrayList.add(u3bVar);
        nm7.f(this.currentAccount).b(this, nm7.B5);
        nm7.f(this.currentAccount).b(this, nm7.I0);
        u3bVar.p(18, true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getMessagesController().N1().I.remove(this.d);
        nm7.f(this.currentAccount).n(this, nm7.B5);
        nm7.f(this.currentAccount).n(this, nm7.I0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
