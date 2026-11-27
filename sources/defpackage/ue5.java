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
import org.telegram.ui.ActionBar.e;
public final class ue5 extends e implements fn7 {
    public boolean E;
    public float F;
    public ValueAnimator G;
    public final String a;
    public final String b;
    public final String c;
    public final p5b d;
    public b6 e;
    public jr1 f;
    public FrameLayout h;
    public re5 n;
    public xc7 r;
    public FrameLayout s;
    public TextView w;
    public float x;
    public ValueAnimator y;

    public ue5(String str, vnb vnbVar) {
        super(null);
        setResourceProvider(vnbVar);
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
        this.d = new p5b(this.currentAccount, this.c, trim);
    }

    public final int Y() {
        int i;
        if (this.simpleActionBar.getOccupyStatusBar()) {
            i = hl.m;
        } else {
            i = 0;
        }
        return a.getCurrentActionBarHeight() + i;
    }

    public final void Z(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        gv1 gv1Var;
        gu guVar;
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
            re5 re5Var = this.n;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.95f;
            }
            re5Var.setScaleX(f2);
            re5 re5Var2 = this.n;
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.95f;
            }
            re5Var2.setScaleY(f3);
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
            jr1 jr1Var = this.f;
            if (jr1Var != null && (gv1Var = jr1Var.a) != null && (guVar = gv1Var.a4) != null) {
                guVar.setScaleX(hl.R1(1.0f, 0.95f, this.F));
                this.f.a.a4.setScaleY(hl.R1(1.0f, 0.95f, this.F));
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
            ofFloat.addUpdateListener(new se5(this, (byte) 1));
            this.G.addListener(new te5(this, z, (byte) 1));
            this.G.setDuration(320L);
            this.G.setInterpolator(k43.h);
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
        xc7 xc7Var = this.r;
        float f3 = 0.0f;
        if (!z2) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            xc7Var.setVisibility(i);
            xc7 xc7Var2 = this.r;
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = -hl.L(48.0f);
            }
            xc7Var2.setTranslationY(f2);
            b6 b6Var = this.e;
            if (z) {
                f3 = hl.L(48.0f);
            }
            b6Var.setTranslationY(f3);
            b6 b6Var2 = this.e;
            if (z) {
                i2 = hl.L(48.0f);
            } else {
                i2 = 0;
            }
            b6Var2.setPadding(0, 0, 0, i2);
            return;
        }
        xc7Var.setVisibility(0);
        ViewPropertyAnimator animate = this.r.animate();
        if (z) {
            f = 0.0f;
        } else {
            f = -hl.L(48.0f);
        }
        ViewPropertyAnimator duration = animate.translationY(f).withEndAction(new xac((byte) 22, this, z)).setDuration(320L);
        k43 k43Var = k43.h;
        duration.setInterpolator(k43Var).start();
        float f4 = this.x;
        if (z) {
            f3 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f4, f3);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new se5(this, (byte) 0));
        this.y.addListener(new te5(this, z, (byte) 0));
        this.y.setDuration(320L);
        this.y.setInterpolator(k43Var);
        this.y.start();
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231243);
        jla jlaVar = this.simpleActionBar;
        String str = this.a;
        jlaVar.setTitle(str);
        this.simpleActionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 28));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i = aob.d6;
        yob.h(i, getResourceProvider(), frameLayout);
        frameLayout.setClipChildren(false);
        b6 b6Var = new b6(context, (byte) 17);
        this.e = b6Var;
        b6Var.setClipChildren(false);
        frameLayout.addView(this.e, tre.e(-1, -1, 119));
        hl.v3(this.e, 0, Y(), 0, 0);
        df5.a(this.currentAccount).b(3).a();
        Bundle bundle = new Bundle();
        bundle.putInt("chatMode", 7);
        bundle.putInt("searchType", 3);
        bundle.putString("searchHashtag", str);
        jr1 jr1Var = new jr1(context, getParentLayout(), bundle, (byte) 1);
        jr1Var.h = false;
        this.f = jr1Var;
        this.e.addView(jr1Var, tre.e(-1, -1, 119));
        re5 re5Var = new re5(this, context, new wia(null), this, new Object(), this.resourceProvider);
        this.n = re5Var;
        if (re5Var.getSearchOptionsItem() != null) {
            yob.s(this.n.getSearchOptionsItem(), aob.G6, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        }
        this.n.setPinnedToTop(true);
        this.n.u0.setTranslationY(0.0f);
        if (this.n.getSearchOptionsItem() != null) {
            this.n.getSearchOptionsItem().setTranslationY(0.0f);
        }
        re5 re5Var2 = this.n;
        p5b p5bVar = this.d;
        re5Var2.X1 = p5bVar;
        oha ohaVar = re5Var2.f0;
        ohaVar.s = p5bVar;
        ohaVar.f();
        bja bjaVar = re5Var2.g0;
        bjaVar.s = p5bVar;
        bjaVar.f();
        this.n.i1(0, eg0.e(hl.m) + hl.L(48.0f) + Y(), hl.L(8.0f), 0);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.h.addView(this.n, tre.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 49.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.s = frameLayout3;
        yob.h(i, getResourceProvider(), frameLayout3);
        TextView textView = new TextView(context);
        this.w = textView;
        textView.setTypeface(hl.o());
        this.w.setTextSize(1, 15.0f);
        yob.X(this.w, aob.qf, getResourceProvider());
        this.w.setText(ob6.G(p5bVar.J, "FoundStories", new Object[0]));
        this.s.addView(this.w, tre.d(-1, -2.0f, 19, 18.0f, 0.0f, 18.0f, 0.0f));
        View view = new View(context);
        yob.h(aob.d7, this.resourceProvider, view);
        this.s.addView(view, tre.a(-1.0f, 1.0f / hl.p, 55));
        this.h.addView(this.s, tre.e(-1, 49, 87));
        this.e.addView(this.h, tre.e(-1, -1, 119));
        xc7 xc7Var = new xc7(context, this.resourceProvider);
        this.r = xc7Var;
        int themedColor = getThemedColor(i);
        int i2 = aob.i6;
        hf0 g0 = aob.g0(themedColor, getThemedColor(i2));
        uob M = yob.M(i);
        uob M2 = yob.M(i2);
        vnb resourceProvider = getResourceProvider();
        xc7Var.setBackground(g0);
        yob.j(xc7Var, g0, M, M2, resourceProvider);
        this.r.setOnClickListener(new sa5(this, (byte) 8));
        a0(this.r.a(p5bVar), false);
        this.r.b(df5.a(this.currentAccount).d.m, this.b, this.c);
        frameLayout.addView(this.r, tre.e(-1, 48, 55));
        hl.v3(this.r, 0, Y(), 0, 0);
        eg0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.i(frameLayout, this.simpleActionBar, getResourceProvider());
        baseSimpleGlass.o = new dg0(this, frameLayout, (byte) 5);
        this.n.setPagesGlassEngine(this.glassEngine);
        jla jlaVar2 = this.simpleActionBar;
        jlaVar2.setBackground(baseSimpleGlass.a(jlaVar2));
        Z(false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        jr1 jr1Var;
        if (i == jn7.A5) {
            Object obj = objArr[0];
            p5b p5bVar = this.d;
            if (obj == p5bVar) {
                xc7 xc7Var = this.r;
                if (xc7Var != null) {
                    a0(xc7Var.a(p5bVar), true);
                }
                TextView textView = this.w;
                if (textView != null) {
                    textView.setText(ob6.G(p5bVar.J, "FoundStories", new Object[0]));
                }
            }
        } else if (i == jn7.I0 && (jr1Var = this.f) != null && jr1Var.a != null && ((Integer) objArr[0]).intValue() == this.f.a.getClassGuid()) {
            int intValue = ((Integer) objArr[1]).intValue();
            xc7 xc7Var2 = this.r;
            if (xc7Var2 != null) {
                xc7Var2.b(intValue, this.b, this.c);
            }
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (vm2.h(aob.w0(null, aob.d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList = getMessagesController().O1().I;
        p5b p5bVar = this.d;
        arrayList.add(p5bVar);
        jn7.f(this.currentAccount).b(this, jn7.A5);
        jn7.f(this.currentAccount).b(this, jn7.I0);
        p5bVar.p(18, true);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getMessagesController().O1().I.remove(this.d);
        jn7.f(this.currentAccount).n(this, jn7.A5);
        jn7.f(this.currentAccount).n(this, jn7.I0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
