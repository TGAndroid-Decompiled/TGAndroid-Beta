package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class lm7 extends e implements ej6, fn7, i1d {
    public static final fa4 f0 = new fa4(null, 0, null);
    public float E;
    public ValueAnimator F;
    public int G;
    public ir8 H;
    public c51 I;
    public Boolean J;
    public dm7 K;
    public sla L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public String Q;
    public wl7 R;
    public rla S;
    public boolean T;
    public final km7 U;
    public final HashMap V;
    public final HashMap W;
    public final fm7[] X;
    public final da4[] Y;
    public final wl7 Z;
    public oz4 a;
    public final na4 a0;
    public final jm7[] b;
    public String b0;
    public final ArrayList c;
    public boolean c0;
    public final HashSet d;
    public b29 d0;
    public final HashSet e;
    public b29 e0;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public ir1 w;
    public cm7 x;
    public hj3 y;

    public lm7() {
        super(null);
        float f;
        this.b = new jm7[]{new jm7(), new jm7(), new jm7()};
        this.c = new ArrayList();
        this.d = new HashSet();
        this.e = new HashSet();
        this.Q = "";
        boolean z = uc7.e1().getBoolean("news_expanded", false);
        this.T = z;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.U = new km7(this, f, f);
        this.V = new HashMap();
        this.W = new HashMap();
        this.X = new fm7[3];
        this.Y = new da4[3];
        this.Z = new wl7(this, (byte) 2);
        this.a0 = new na4(new su3((byte) 21), new y94(ea4.i(this.currentAccount), (byte) 0));
    }

    public static String C0(TLRPC.Message message) {
        Object valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(r47.B0(message));
        sb.append(":");
        if (message.grouped_id != 0) {
            valueOf = "g" + message.grouped_id;
        } else {
            valueOf = Integer.valueOf(message.id);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    public static void J0(jm7 jm7Var) {
        im7 im7Var = jm7Var.f;
        if (im7Var != null) {
            im7Var.g3.O(true);
        }
    }

    public static void e0(ViewGroup viewGroup, boolean z) {
        float f;
        ge7 ge7Var;
        viewGroup.animate().cancel();
        if (z) {
            viewGroup.setVisibility(0);
        }
        ViewPropertyAnimator animate = viewGroup.animate();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ViewPropertyAnimator interpolator = animate.alpha(f).scaleX(1.0f).scaleY(1.0f).setDuration(220L).setInterpolator(k43.h);
        if (z) {
            ge7Var = null;
        } else {
            ge7Var = new ge7(viewGroup, (byte) 7);
        }
        interpolator.withEndAction(ge7Var).start();
    }

    public static void f0(jm7 jm7Var, List list, fa4 fa4Var) {
        HashMap hashMap = jm7Var.d;
        if (fa4Var.a != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TLRPC.Message message = (TLRPC.Message) it.next();
                if (message != null && message.peer_id != null && !hashMap.containsKey(C0(message))) {
                    hashMap.put(C0(message), fa4Var);
                }
            }
        }
    }

    public static void h0(im7 im7Var) {
        if (im7Var == null) {
            return;
        }
        im7Var.getViewTreeObserver().addOnPreDrawListener(new gb(im7Var, (byte) 7));
        im7Var.invalidate();
    }

    public static String z0(int i, r47 r47Var) {
        return i + "_" + r47.B0(r47Var.k) + "_" + r47Var.e1();
    }

    @Override
    public final rz4 A() {
        return getBaseSimpleGlass().d();
    }

    public final String A0(r47 r47Var) {
        String K = xc2.K(getMessagesController().M0(Long.valueOf(-r47.B0(r47Var.k))), false);
        String k = c00.k(new StringBuilder("https://"), getMessagesController().N2, "/");
        if (!TextUtils.isEmpty(K)) {
            StringBuilder p = ik8.p(k, K, "/");
            p.append(r47Var.e1());
            return p.toString();
        }
        StringBuilder l = c00.l(k, "c/");
        l.append(-r47.B0(r47Var.k));
        l.append("/");
        l.append(r47Var.e1());
        return l.toString();
    }

    public final void B0(zu1 zu1Var, int i, r47 r47Var) {
        ha4 m0 = m0(i, r47Var, "open_post", null);
        fa4 fa4Var = m0.f;
        if (fa4Var != null) {
            zu1Var.yb = new ty0(fa4Var, new int[]{m0.d}, r47Var.k.grouped_id, SystemClock.elapsedRealtime());
        }
        zu1Var.zb = m0;
    }

    public final void D0(ha4 ha4Var) {
        this.a0.b();
        String i = ea4.i(this.currentAccount);
        if (i != null) {
            ea4.e.postRunnable(new x94(i, ha4Var, (byte) 0));
        }
    }

    public final void E0() {
        if (!this.f) {
            HashSet hashSet = this.d;
            if (!hashSet.isEmpty() && !hashSet.equals(this.e)) {
                this.f = true;
                K0(true);
                TL_feed.TL_feed_setInterestCategories tL_feed_setInterestCategories = new TL_feed.TL_feed_setInterestCategories();
                tL_feed_setInterestCategories.category_ids.addAll(hashSet);
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_feed_setInterestCategories, new pl7(this, tL_feed_setInterestCategories, (byte) 1)), this.classGuid);
            }
        }
    }

    @Override
    public final void F() {
        boolean z = this.N;
        jm7[] jm7VarArr = this.b;
        if (z) {
            h0(jm7VarArr[2].f);
            return;
        }
        ir1 ir1Var = this.w;
        if (ir1Var != null) {
            h0(jm7VarArr[ir1Var.getCurrentPosition()].f);
        }
    }

    public final void F0(String str) {
        boolean z;
        if (!str.equals(this.Q)) {
            this.Q = str;
            jm7[] jm7VarArr = this.b;
            jm7 jm7Var = jm7VarArr[2];
            wl7 wl7Var = this.R;
            if (wl7Var != null) {
                hl.r(wl7Var);
            }
            this.R = null;
            jm7Var.a.clear();
            jm7Var.b.clear();
            jm7Var.c.clear();
            jm7Var.d.clear();
            jm7Var.e.clear();
            jm7Var.i = null;
            jm7Var.l = false;
            jm7Var.n = false;
            jm7Var.m = false;
            jm7Var.o = false;
            J0(jm7Var);
            if (this.M && !TextUtils.isEmpty(this.Q)) {
                z = true;
            } else {
                z = false;
            }
            if (this.N != z) {
                this.N = z;
                im7 im7Var = jm7VarArr[2].f;
                e0(this.w, !z);
                e0(im7Var, z);
                if (z) {
                    im7Var.x0(0);
                }
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            wl7 wl7Var2 = new wl7(this, (byte) 0);
            this.R = wl7Var2;
            hl.d3(wl7Var2, 500L);
        }
    }

    public final float G0(int i) {
        im7 im7Var;
        View m;
        int L = hl.L(48.0f);
        if (i >= 0 && i < 2 && (im7Var = this.b[i].f) != null && im7Var.getChildCount() != 0) {
            if (im7Var.f3.K0() > 0 || (m = im7Var.f3.m(0)) == null) {
                return L;
            }
            return Math.max(0, Math.min(L, im7Var.getPaddingTop() - m.getTop()));
        }
        return 0.0f;
    }

    public final void H0(int i, r47 r47Var, boolean z) {
        String str;
        if (z) {
            str = "feed.likePost";
        } else {
            str = "feed.dislikePost";
        }
        D0(m0(i, r47Var, str, null));
        if (z) {
            d31.b0(this).M(getParentActivity().getResources().getDrawable(2131232327).mutate(), ob6.M0(2131747990, null)).j();
            return;
        }
        hl.d3(new gd7(this, this.b[i], r47Var, (byte) 11), 420L);
        d31.b0(this).M(getParentActivity().getResources().getDrawable(2131232326).mutate(), ob6.M0(2131747985, null)).j();
    }

    public final void I0(boolean z) {
        float f;
        if (this.M == z) {
            return;
        }
        this.M = z;
        if (!z) {
            F0("");
        }
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.E;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new ch4(this, (byte) 27));
        this.F.setDuration(350L);
        this.F.setInterpolator(k43.h);
        this.F.start();
    }

    public final void K0(boolean z) {
        int p0;
        float f;
        float f2;
        int i;
        HashSet hashSet;
        boolean r0 = r0();
        if (this.H != null) {
            Boolean bool = this.J;
            if (bool == null || bool.booleanValue() != r0) {
                this.J = Boolean.valueOf(r0);
                this.H.animate().cancel();
                ir8 ir8Var = this.H;
                float f3 = 0.0f;
                float f4 = 1.0f;
                if (z) {
                    if (r0) {
                        if (ir8Var.getVisibility() != 0) {
                            this.H.setAlpha(0.0f);
                            this.H.setScaleX(0.7f);
                            this.H.setScaleY(0.7f);
                            this.H.setTranslationY(hl.L(10.0f));
                        }
                        this.H.setVisibility(0);
                        this.H.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(320L).setInterpolator(k43.h).withEndAction(null).start();
                    } else {
                        ir8Var.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).translationY(hl.L(10.0f)).setDuration(320L).setInterpolator(k43.h).withEndAction(new wl7(this, (byte) 3)).start();
                    }
                } else {
                    if (r0) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    ir8Var.setAlpha(f);
                    ir8 ir8Var2 = this.H;
                    if (r0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.7f;
                    }
                    ir8Var2.setScaleX(f2);
                    ir8 ir8Var3 = this.H;
                    if (!r0) {
                        f4 = 0.7f;
                    }
                    ir8Var3.setScaleY(f4);
                    ir8 ir8Var4 = this.H;
                    if (!r0) {
                        f3 = hl.L(10.0f);
                    }
                    ir8Var4.setTranslationY(f3);
                    ir8 ir8Var5 = this.H;
                    if (r0) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    ir8Var5.setVisibility(i);
                }
            }
            this.H.setEnabled(!this.f);
            this.I.setLoading(this.f);
            this.I.c(this.d.size(), z);
            this.H.setContentDescription(ob6.M0(2131747983, null) + ", " + hashSet.size());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.H.getLayoutParams();
            layoutParams.bottomMargin = hl.L(72.0f) + this.G;
            this.H.setLayoutParams(layoutParams);
        }
        int i2 = 0;
        while (true) {
            jm7[] jm7VarArr = this.b;
            if (i2 < jm7VarArr.length) {
                jm7 jm7Var = jm7VarArr[i2];
                if (jm7Var.f != null && jm7Var.f.getPaddingBottom() != (p0 = p0(i2))) {
                    im7 im7Var = jm7Var.f;
                    im7Var.setPadding(0, im7Var.getPaddingTop(), 0, p0);
                    ViewGroup viewGroup = jm7Var.i;
                    if (viewGroup != null) {
                        viewGroup.requestLayout();
                    }
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void L0(boolean z) {
        int i;
        b29 b29Var;
        sla slaVar = this.L;
        if (slaVar != null) {
            if (this.T) {
                i = 2131747996;
            } else {
                i = 2131747993;
            }
            slaVar.setContentDescription(ob6.M0(i, null));
            e29 iconView = this.L.getIconView();
            if (iconView == null) {
                return;
            }
            if (this.d0 == null) {
                b29 b29Var2 = new b29(2131624090, hl.L(24.0f), hl.L(24.0f));
                b29Var2.M(iconView);
                b29Var2.E(true);
                b29Var2.h = true;
                b29Var2.F(0);
                this.d0 = b29Var2;
                b29 b29Var3 = new b29(2131624087, hl.L(24.0f), hl.L(24.0f));
                b29Var3.M(iconView);
                b29Var3.E(true);
                b29Var3.h = true;
                b29Var3.F(0);
                this.e0 = b29Var3;
            }
            if (this.T) {
                b29Var = this.e0;
            } else {
                b29Var = this.d0;
            }
            if (z && (Build.VERSION.SDK_INT < 26 || ValueAnimator.areAnimatorsEnabled())) {
                this.d0.H(0);
                this.e0.H(0);
                iconView.setImageDrawable(b29Var);
                b29Var.start();
                return;
            }
            b29Var.stop();
            b29Var.I(b29Var.e[0] - 1, false, false);
            iconView.setImageDrawable(b29Var);
        }
    }

    public final void M0(int i) {
        jm7 jm7Var;
        int e1;
        String str;
        jm7 jm7Var2 = this.b[i];
        ArrayList arrayList = new ArrayList();
        im7 im7Var = jm7Var2.f;
        int i2 = 0;
        while (im7Var != null && i2 < im7Var.getChildCount()) {
            View childAt = im7Var.getChildAt(i2);
            if (childAt instanceof v94) {
                v94 v94Var = (v94) childAt;
                if (v94Var.getMessage() != null && childAt.getAlpha() >= 0.5f) {
                    r47 message = v94Var.getMessage();
                    float y = childAt.getY() + im7Var.getTranslationY();
                    fa4 fa4Var = (fa4) jm7Var2.d.get(C0(message.k));
                    long B0 = r47.B0(message.k);
                    Integer num = (Integer) jm7Var2.e.get(C0(message.k));
                    if (num != null) {
                        e1 = num.intValue();
                    } else {
                        e1 = message.e1();
                    }
                    int i3 = e1;
                    long j = message.k.grouped_id;
                    float height = y + childAt.getHeight();
                    float paddingTop = im7Var.getPaddingTop();
                    jm7Var = jm7Var2;
                    float height2 = im7Var.getHeight() - Math.max(im7Var.getPaddingBottom(), this.O);
                    if (fa4Var == null) {
                        fa4Var = f0;
                    }
                    r47 message2 = v94Var.getMessage();
                    if (!s0(i, message2)) {
                        str = "card";
                    } else {
                        km7 km7Var = (km7) this.W.get(z0(i, message2));
                        if (v94Var.L && v94Var.a0 > v94Var.b0 && (km7Var == null || km7Var.b < 1.0f)) {
                            str = "cut";
                        } else {
                            str = "whole";
                        }
                    }
                    ga4 a = vke.a(B0, i3, j, y, height, paddingTop, height2, new fa4(fa4Var.a, fa4Var.b, str));
                    if (a != null) {
                        arrayList.add(a);
                    }
                    i2++;
                    jm7Var2 = jm7Var;
                }
            }
            jm7Var = jm7Var2;
            i2++;
            jm7Var2 = jm7Var;
        }
        this.Y[i].a.d(arrayList);
    }

    public final void N0() {
        ir1 ir1Var;
        int i;
        int i2;
        float f;
        if (this.y != null && (ir1Var = this.w) != null) {
            int currentPosition = ir1Var.getCurrentPosition();
            float positionAnimated = this.w.getPositionAnimated();
            float f2 = currentPosition;
            float abs = Math.abs(positionAnimated - f2);
            if (positionAnimated > f2) {
                i = currentPosition + 1;
            } else {
                i = currentPosition - 1;
            }
            float R1 = hl.R1(G0(currentPosition), G0(i), abs);
            float o0 = (o0() - hl.L(9.0f)) - R1;
            float q0 = q0();
            this.y.setTranslationY(hl.R1(o0, q0, this.E));
            this.w.setTranslationY((q0 - o0) * this.E);
            float R12 = hl.R1(1.0f - (R1 / hl.L(48.0f)), 1.0f, this.E);
            this.y.setAlpha(R12);
            hj3 hj3Var = this.y;
            int i3 = 4;
            if (R12 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            hj3Var.setVisibility(i2);
            this.y.setBlurredBackgroundVisibility(this.E);
            hj3 hj3Var2 = this.y;
            if (this.E > 0.0f) {
                f = hl.L(1.0f);
            } else {
                f = 0.0f;
            }
            hj3Var2.setTranslationZ(f);
            float f3 = 1.0f - this.E;
            cm7 cm7Var = this.x;
            if (cm7Var != null) {
                cm7Var.setAlpha(f3);
            }
            rla rlaVar = this.S;
            if (rlaVar != null) {
                rlaVar.setAlpha(f3);
                rla rlaVar2 = this.S;
                if (f3 > 0.0f) {
                    i3 = 0;
                }
                rlaVar2.setVisibility(i3);
                this.simpleActionBar.setMenuPillAlpha(f3);
            }
        }
    }

    @Override
    public final void P() {
        int i = this.P;
        if (this.O == i) {
            return;
        }
        this.O = i;
        K0(false);
    }

    @Override
    public final View R() {
        return this.fragmentView;
    }

    @Override
    public final boolean W(MotionEvent motionEvent, boolean z) {
        int[] iArr;
        int i;
        if (!t0(z)) {
            if (!this.N) {
                ir1 ir1Var = this.w;
                if (ir1Var != null && !ir1Var.s()) {
                    this.simpleActionBar.getLocationOnScreen(new int[2]);
                    if (motionEvent.getRawY() >= this.simpleActionBar.getHeight() + iArr[1]) {
                        ir1 ir1Var2 = this.w;
                        if (z) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        if (ir1Var2.canScrollHorizontally(i)) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean clipsScrimUnderOccluders() {
        return true;
    }

    @Override
    public final View createView(Context context) {
        int i;
        this.N = false;
        this.M = false;
        this.Q = "";
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 12));
        rla v = this.simpleActionBar.v();
        this.S = v;
        if (this.T) {
            i = 2131232452;
        } else {
            i = 2131232453;
        }
        this.L = v.a(1, i);
        L0(false);
        FrameLayout d26Var = new d26((byte) 5, context, this);
        bm6 bm6Var = new bm6(this, (byte) 18);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(d26Var, bm6Var);
        int i2 = aob.d6;
        yob.h(i2, getResourceProvider(), d26Var);
        this.fragmentView = d26Var;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.g1.d.add(this);
        }
        ir1 ir1Var = new ir1((byte) 4, context, this);
        this.w = ir1Var;
        ir1Var.setAllowDisallowInterceptTouch(false);
        this.w.setAdapter(new bn0((byte) 3, context, this));
        d26Var.addView(this.w, tre.e(-1, -1, 119));
        jm7[] jm7VarArr = this.b;
        jm7VarArr[2].f = l0(context, 2);
        jm7VarArr[2].f.setAlpha(0.0f);
        jm7VarArr[2].f.setVisibility(8);
        d26Var.addView(jm7VarArr[2].f, tre.c(-1.0f, -1));
        eg0 baseSimpleGlass = getBaseSimpleGlass();
        ir1 ir1Var2 = this.w;
        jla jlaVar = this.simpleActionBar;
        vnb vnbVar = this.resourceProvider;
        baseSimpleGlass.m = d26Var;
        baseSimpleGlass.n = ir1Var2;
        baseSimpleGlass.a.c(ir1Var2);
        baseSimpleGlass.j(d26Var, jlaVar, vnbVar);
        this.simpleActionBar.setButtonsGlassColorProvider(dtd.n(this.resourceProvider));
        getBaseSimpleGlass().o = new dg0(this, d26Var, (byte) 7);
        getBaseSimpleGlass().n = null;
        dm7 dm7Var = new dm7(this, context);
        this.K = dm7Var;
        dm7Var.setImportantForAccessibility(2);
        d26Var.addView(this.K, d26Var.indexOfChild(this.simpleActionBar), tre.e(-1, 0, 48));
        hj3 hj3Var = new hj3(context, this.resourceProvider, (byte) 1);
        hj3Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        hj3Var.setPivotX(0.0f);
        hj3Var.setPivotY(0.0f);
        String M0 = ob6.M0(2131745564, null);
        m7 m7Var = hj3Var.r;
        m7Var.setHint(M0);
        m7Var.setContentDescription(ob6.M0(2131745564, null));
        jl0 c = getBaseSimpleGlass().c.c(hj3Var, null, false);
        c.p(dtd.n(this.resourceProvider));
        hj3Var.setupBlurredBackground(c);
        hj3Var.setBlurredBackgroundVisibility(0.0f);
        m7Var.setOnFocusChangeListener(new ts0(this, (byte) 15));
        hj3Var.setCloseButtonOnClickListener(new wl7(this, (byte) 4));
        hj3Var.setCloseButtonHideDuration(80L);
        m7Var.addTextChangedListener(new nh6(this, (byte) 3));
        this.y = hj3Var;
        d26Var.addView(hj3Var, d26Var.indexOfChild(this.K), tre.d(-1, 48.0f, 48, 7.0f, 0.0f, 7.0f, 0.0f));
        this.simpleActionBar.setBackground(null);
        ?? fg4Var = new fg4(context, this.resourceProvider);
        jl0 c2 = getBaseSimpleGlass().c.c(fg4Var, null, false);
        c2.p(dtd.r(this.resourceProvider));
        c2.r(hl.L(18.0f));
        c2.q(hl.L(6.666f));
        fg4Var.setBlurredBackground(c2);
        fg4Var.setPadding(0, hl.L(7.0f), 0, hl.L(7.0f));
        fg4Var.setDelegate(new xh4(this, (byte) 17));
        fg4Var.a(0, 0, ob6.M0(2131747992, null));
        fg4Var.a(1, 1, ob6.M0(2131754355, null));
        fg4Var.G.setItemAnimator(null);
        fg4Var.J.f();
        fg4Var.j(1.0f, 0);
        this.x = fg4Var;
        this.simpleActionBar.addView((View) fg4Var, tre.e(-2, -2, 1));
        oz4 oz4Var = new oz4();
        this.a = oz4Var;
        oz4Var.a(getThemedColor(i2));
        ll0 ll0Var = new ll0(oz4Var, oz4Var, oz4Var);
        ir8 ir8Var = new ir8(context);
        this.H = ir8Var;
        jl0 c3 = ll0Var.c(ir8Var, new cl0(i2, this.resourceProvider), false);
        c3.q(hl.L(8.0f));
        c3.r(hl.L(22.0f));
        this.H.setBackground(c3);
        iye.b(this.H, 0.02f, 1.2f);
        c51 c51Var = new c51(this.resourceProvider, context, true);
        this.I = c51Var;
        c51Var.setUseWrapContent(true);
        this.I.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        this.I.setRoundRadius(19);
        this.I.i(ob6.M0(2131747983, null), false, true);
        this.I.setShowZero(true);
        this.I.setStateListAnimator(null);
        this.H.addView(this.I, tre.e(-2, -1, 17));
        this.H.setOnClickListener(new am7(this, (byte) 0));
        d26Var.addView(this.H, tre.e(-2, 60, 81));
        K0(false);
        u0();
        setBulletinDelegate(new t10(this, (byte) 13));
        return d26Var;
    }

    public final boolean d0(jm7 jm7Var, TLRPC.Message message, int i) {
        int i2 = 0;
        if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.peer_id != null) {
            String str = r47.B0(message) + ":" + message.id;
            HashSet hashSet = jm7Var.b;
            ArrayList arrayList = jm7Var.a;
            if (hashSet.add(str)) {
                r47 r47Var = new r47(this.currentAccount, message, false, false);
                if (jm7Var == this.b[2]) {
                    r47Var.J5(this.Q, true);
                }
                HashMap hashMap = jm7Var.e;
                String C0 = C0(message);
                int i3 = message.id;
                Integer num = (Integer) hashMap.get(C0);
                if (num == null || i3 < num.intValue()) {
                    hashMap.put(C0, Integer.valueOf(i3));
                }
                if (message.grouped_id != 0) {
                    long B0 = r47.B0(r47Var.k);
                    long j = r47Var.k.grouped_id;
                    while (true) {
                        IdentityHashMap identityHashMap = jm7Var.c;
                        if (i2 >= arrayList.size()) {
                            break;
                        }
                        Object obj = arrayList.get(i2);
                        if (obj instanceof r47) {
                            r47 r47Var2 = (r47) obj;
                            TLRPC.Message message2 = r47Var2.k;
                            if (message2.grouped_id == j && r47.B0(message2) == B0) {
                                ArrayList arrayList2 = (ArrayList) identityHashMap.get(r47Var2);
                                if (arrayList2 == null) {
                                    arrayList2 = qd4.t(r47Var2);
                                }
                                arrayList2.add(r47Var);
                                Collections.sort(arrayList2, new vk6((byte) 28));
                                if (TextUtils.isEmpty(r47Var2.k.message) && !TextUtils.isEmpty(r47Var.k.message)) {
                                    identityHashMap.remove(r47Var2);
                                    arrayList.set(i2, r47Var);
                                } else {
                                    r47Var = r47Var2;
                                }
                                identityHashMap.put(r47Var, arrayList2);
                                return true;
                            }
                        }
                        i2++;
                    }
                }
                if (i < 0) {
                    arrayList.add(r47Var);
                    return true;
                }
                arrayList.add(i, r47Var);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z = true;
        if (i == jn7.Q) {
            w0(1, true);
        } else if (i == 1) {
            long longValue = ((Long) objArr[0]).longValue();
            if (!((Boolean) objArr[2]).booleanValue() && ((Integer) objArr[3]).intValue() == 0 && longValue < 0) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-longValue));
                if (xc2.V(M0) && !xc2.r0(M0)) {
                    jm7 jm7Var = this.b[1];
                    if (jm7Var.l) {
                        if (!jm7Var.k || !jm7Var.p) {
                            ArrayList arrayList = (ArrayList) objArr[1];
                            im7 im7Var = jm7Var.f;
                            if (im7Var == null || im7Var.canScrollVertically(-1)) {
                                z = false;
                            }
                            int size = arrayList.size();
                            int i3 = 0;
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                TLRPC.Message message = ((r47) obj).k;
                                if (message != null && message.id > 0 && !(message instanceof TLRPC.TL_messageService) && d0(jm7Var, message, 0)) {
                                    i3++;
                                }
                            }
                            if (i3 > 0) {
                                J0(jm7Var);
                                if (z) {
                                    jm7Var.f.x0(0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void g0(ha4 ha4Var, boolean z, String str) {
        boolean z2;
        if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.a0.a(ha4Var, z, z2);
        ea4.c(this.currentAccount, ha4Var, str);
    }

    public final void i0() {
        hj3 hj3Var = this.y;
        if (hj3Var != null && this.M) {
            hj3Var.post(new ge7(hj3Var, (byte) 8));
            this.y.r.getText().clear();
            hl.t1(this.y.r);
            this.y.r.clearFocus();
            this.y.setCloseButtonVisible(false);
            I0(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final rz4 j() {
        return getBaseSimpleGlass().c();
    }

    public final FrameLayout j0(Context context, int i) {
        int i2;
        int i3;
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(hl.L(24.0f), hl.L(24.0f), hl.L(24.0f), hl.L(24.0f));
        frameLayout.addView(linearLayout, tre.e(-1, -2, 17));
        de0 de0Var = new de0(context);
        linearLayout.addView(de0Var, tre.r(130, 130, 1));
        ls6.d0(this.currentAccount).e2(de0Var, "UtyaDuck", "😎", "130_130");
        TextView textView = new TextView(context);
        if (i == 1) {
            i2 = 2131747998;
        } else if (i == 2) {
            i2 = 2131747999;
        } else {
            i2 = 2131748000;
        }
        textView.setText(ob6.M0(i2, null));
        textView.setTextSize(20.0f);
        textView.setTypeface(hl.o());
        yob.X(textView, aob.G6, getResourceProvider());
        textView.setGravity(17);
        TextView m = ik8.m(linearLayout, textView, tre.k(0.0f, 16.0f, 0.0f, 0.0f, -1, -2), context);
        if (i == 1) {
            i3 = 2131748001;
        } else if (i == 2) {
            i3 = 2131748002;
        } else {
            i3 = 2131748003;
        }
        m.setText(ob6.M0(i3, null));
        m.setTextSize(14.0f);
        yob.X(m, aob.y6, getResourceProvider());
        m.setGravity(17);
        linearLayout.addView(m, tre.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        return frameLayout;
    }

    public final rg2 k0(Context context) {
        ?? imageView = new ImageView(context);
        imageView.f(2131624315, 130, 130, null);
        imageView.d();
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131745528, null));
        textView.setTextSize(20.0f);
        textView.setTypeface(hl.o());
        yob.X(textView, aob.G6, getResourceProvider());
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        textView2.setText(ob6.M0(2131745535, null));
        textView2.setTextSize(14.0f);
        yob.X(textView2, aob.y6, getResourceProvider());
        textView2.setGravity(17);
        rg2 rg2Var = new rg2(context, textView, textView2, imageView);
        rg2Var.setOrientation(1);
        rg2Var.setGravity(17);
        rg2Var.setPadding(hl.L(24.0f), hl.L(12.0f), hl.L(24.0f), hl.L(12.0f));
        rg2Var.addView((View) imageView, tre.t(130, 130, 1, 0, 0, 0, 16));
        rg2Var.addView(textView, tre.o(-1, -2));
        rg2Var.addView(textView2, tre.k(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        return rg2Var;
    }

    public final im7 l0(Context context, int i) {
        jm7 jm7Var = this.b[i];
        im7 im7Var = new im7(this, context, i, new f(this, i, jm7Var, context, (byte) 7), new bf(this, i, jm7Var, (byte) 10), new wg(this, i, (byte) 16));
        im7Var.setClipToPadding(false);
        im7Var.setPadding(0, o0(), 0, p0(i));
        im7Var.j(new em7(this, i, im7Var, jm7Var));
        return im7Var;
    }

    public final ha4 m0(int i, r47 r47Var, String str, String str2) {
        long j;
        int e1;
        String str3;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-r47.B0(r47Var.k)));
        long B0 = r47.B0(r47Var.k);
        if (M0 != null && !M0.min) {
            j = M0.access_hash;
        } else {
            j = 0;
        }
        jm7[] jm7VarArr = this.b;
        Integer num = (Integer) jm7VarArr[i].e.get(C0(r47Var.k));
        if (num != null) {
            e1 = num.intValue();
        } else {
            e1 = r47Var.e1();
        }
        if (i == 2) {
            str3 = "search";
        } else if (i == 1) {
            str3 = "added";
        } else {
            str3 = "feed";
        }
        return new ha4(B0, j, e1, str, str2, str3, (fa4) jm7VarArr[i].d.get(C0(r47Var.k)), ea4.g(this.currentAccount), Utilities.b.nextLong());
    }

    public final void n0(int i, r47 r47Var, ArrayList arrayList) {
        String A0;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-r47.B0(r47Var.k)));
        if (TextUtils.isEmpty(xc2.K(M0, false))) {
            A0 = null;
        } else {
            A0 = A0(r47Var);
        }
        kea keaVar = new kea(getParentActivity(), arrayList, null, xc2.V(M0), A0, false, this.resourceProvider);
        keaVar.n2 = new lp(this, i, r47Var, (byte) 11);
        showDialog(keaVar);
    }

    @Override
    public final void o(l2d l2dVar) {
        int i = l2dVar.a.f(8).d;
        if (this.O == i) {
            return;
        }
        this.O = i;
        K0(false);
    }

    public final int o0() {
        int i;
        jla jlaVar = this.simpleActionBar;
        if (jlaVar == null) {
            return a.getCurrentActionBarHeight();
        }
        if (jlaVar.getOccupyStatusBar()) {
            i = hl.m;
        } else {
            i = 0;
        }
        return this.simpleActionBar.getExtraHeight() + a.getCurrentActionBarHeight() + i;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.M) {
            if (z) {
                i0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        String str;
        int i = 0;
        if (!super.onFragmentCreate()) {
            return false;
        }
        getNotificationCenter().b(this, jn7.Q);
        getNotificationCenter().b(this, 1);
        while (true) {
            da4[] da4VarArr = this.Y;
            if (i >= da4VarArr.length) {
                break;
            }
            int i2 = this.currentAccount;
            if (i == 2) {
                str = "search";
            } else if (i == 1) {
                str = "added";
            } else {
                str = "feed";
            }
            da4VarArr[i] = new da4(i2, str);
            i++;
        }
        hl.d3(this.Z, 100L);
        String i3 = ea4.i(this.currentAccount);
        if (i3 != null) {
            ea4.e.postRunnable(new qu2(i3, (byte) 1));
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        da4[] da4VarArr;
        jm7[] jm7VarArr;
        this.h = true;
        hl.r(this.Z);
        na4 na4Var = this.a0;
        na4Var.e &= na4Var.d;
        na4Var.b();
        for (da4 da4Var : this.Y) {
            da4Var.a.b(false);
            da4Var.a();
        }
        vpa vpaVar = this.U.c;
        if (vpaVar != null) {
            vpaVar.d();
        }
        for (km7 km7Var : this.V.values()) {
            vpa vpaVar2 = km7Var.c;
            if (vpaVar2 != null) {
                vpaVar2.d();
            }
        }
        for (km7 km7Var2 : this.W.values()) {
            vpa vpaVar3 = km7Var2.c;
            if (vpaVar3 != null) {
                vpaVar3.d();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.g1.d.remove(this);
        }
        wl7 wl7Var = this.R;
        if (wl7Var != null) {
            hl.r(wl7Var);
        }
        getNotificationCenter().n(this, jn7.Q);
        getNotificationCenter().n(this, 1);
        setBulletinDelegate(null);
        super.onFragmentDestroy();
        for (jm7 jm7Var : this.b) {
            yl7 yl7Var = jm7Var.t;
            if (yl7Var != null) {
                hl.r(yl7Var);
                jm7Var.t.run();
            }
            jm7Var.f = null;
            jm7Var.g = null;
            jm7Var.h = null;
            jm7Var.i = null;
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            oz4 oz4Var = this.a;
            if (oz4Var != null) {
                oz4Var.a(getThemedColor(aob.d6));
            }
            hj3 hj3Var = this.y;
            if (hj3Var != null) {
                hj3Var.updateColors();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final int p0(int i) {
        int i2;
        int i3 = this.G;
        if (r0()) {
            i2 = 60;
        } else {
            i2 = 0;
        }
        int L = hl.L(i2 + 72) + i3;
        if (i == 2) {
            return Math.max(L, this.O);
        }
        return L;
    }

    public final int q0() {
        int i;
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null && jlaVar.getOccupyStatusBar()) {
            i = hl.m;
        } else {
            i = 0;
        }
        return ((a.getCurrentActionBarHeight() - hl.L(48.0f)) / 2) + i;
    }

    public final boolean r0() {
        if (!this.f) {
            HashSet hashSet = this.d;
            if (hashSet.isEmpty() || hashSet.equals(this.e)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean s0(int i, r47 r47Var) {
        float f;
        km7 km7Var = (km7) this.V.get(z0(i, r47Var));
        if (km7Var != null) {
            f = km7Var.b;
        } else {
            f = this.U.b;
        }
        if (f > 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean t0(boolean r2) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm7.t0(boolean):boolean");
    }

    public final void u0() {
        if (!this.n && !this.h) {
            this.n = true;
            this.r = false;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(new TL_feed.TL_feed_getInterestCategories(), new xl7(this, (byte) 0)), this.classGuid);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void v() {
        int i;
        jm7 jm7Var;
        im7 im7Var;
        if (this.N) {
            i = 2;
        } else {
            ir1 ir1Var = this.w;
            if (ir1Var != null) {
                i = ir1Var.getCurrentPosition();
            } else {
                i = -1;
            }
        }
        if (i >= 0 && (im7Var = (jm7Var = this.b[i]).f) != null) {
            if (im7Var.f3.K0() < 2) {
                jm7Var.f.A0(0);
                return;
            }
            this.X[i] = null;
            hw6 hw6Var = jm7Var.g;
            if (hw6Var == null) {
                im7 im7Var2 = jm7Var.f;
                hw6Var = new hw6(im7Var2, im7Var2.f3);
                jm7Var.g = hw6Var;
            }
            hw6Var.l(1);
            jm7Var.g.k(0, 0, false, false);
        }
    }

    public final void w0(int i, boolean z) {
        TL_feed.TL_feed_getForYou tL_feed_getForYou;
        TL_feed.FeedPosition feedPosition;
        w94 w94Var;
        jm7 jm7Var = this.b[i];
        if (!this.h) {
            if (jm7Var.k) {
                jm7Var.o |= z;
            } else if (z || !jm7Var.m) {
                if (i == 2) {
                    if (!TextUtils.isEmpty(this.Q)) {
                        if (!z && (this.R != null || !jm7Var.l)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                String str = this.Q;
                jm7Var.p = z;
                jm7Var.q = z;
                if (z && (w94Var = jm7Var.h) != null) {
                    w94Var.setRefreshing(true);
                }
                jm7Var.k = true;
                jm7Var.n = false;
                J0(jm7Var);
                if (i != 0 && i != 2) {
                    TL_feed.TL_feed_getFeed tL_feed_getFeed = new TL_feed.TL_feed_getFeed();
                    tL_feed_getFeed.limit = 30;
                    if (z) {
                        feedPosition = null;
                    } else {
                        feedPosition = jm7Var.r;
                    }
                    tL_feed_getFeed.offset_position = feedPosition;
                    tL_feed_getForYou = tL_feed_getFeed;
                } else {
                    TL_feed.TL_feed_getForYou tL_feed_getForYou2 = new TL_feed.TL_feed_getForYou();
                    tL_feed_getForYou2.limit = 30;
                    if (i == 2) {
                        tL_feed_getForYou2.query = str;
                    }
                    tL_feed_getForYou = tL_feed_getForYou2;
                }
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_feed_getForYou, new qa7(this, jm7Var, i, str, z)), this.classGuid);
            }
        }
    }

    public final void x0(jm7 jm7Var) {
        im7 im7Var;
        int i;
        int i2;
        int i3;
        if (!this.h && (im7Var = jm7Var.f) != null) {
            int K0 = im7Var.f3.K0();
            int M0 = jm7Var.f.f3.M0();
            if (K0 >= 0) {
                TLRPC.Message message = null;
                while (K0 <= M0) {
                    b8c G = jm7Var.f.g3.G(K0);
                    if (G != null) {
                        Object obj = G.H;
                        if (obj instanceof r47) {
                            TLRPC.Message message2 = ((r47) obj).k;
                            if (message == null || (i2 = message2.date) > (i3 = message.date) || (i2 == i3 && message2.id > message.id)) {
                                message = message2;
                            }
                        }
                    }
                    K0++;
                }
                if (message != null) {
                    TL_feed.FeedPosition feedPosition = new TL_feed.FeedPosition();
                    int i4 = message.date;
                    feedPosition.date = i4;
                    feedPosition.peer = message.peer_id;
                    int i5 = message.id;
                    feedPosition.id = i5;
                    TL_feed.FeedPosition feedPosition2 = jm7Var.s;
                    if (feedPosition2 != null && i4 <= (i = feedPosition2.date) && (i4 != i || i5 <= feedPosition2.id)) {
                        return;
                    }
                    jm7Var.s = feedPosition;
                    yl7 yl7Var = jm7Var.t;
                    if (yl7Var != null) {
                        hl.r(yl7Var);
                    }
                    yl7 yl7Var2 = new yl7(this, jm7Var, (byte) 1);
                    jm7Var.t = yl7Var2;
                    hl.d3(yl7Var2, 500L);
                }
            }
        }
    }

    public final void y0() {
        View m;
        int height;
        int round;
        int i = 0;
        while (true) {
            jm7[] jm7VarArr = this.b;
            if (i < jm7VarArr.length) {
                im7 im7Var = jm7VarArr[i].f;
                if (im7Var != null) {
                    for (int i2 = 0; i2 < im7Var.getChildCount(); i2++) {
                        View childAt = im7Var.getChildAt(i2);
                        if (childAt instanceof v94) {
                            ((v94) childAt).p();
                        }
                    }
                    fm7 fm7Var = this.X[i];
                    im7 im7Var2 = jm7VarArr[i].f;
                    if (fm7Var != null && im7Var2 != null && (m = im7Var2.f3.m(fm7Var.a)) != null) {
                        km7 km7Var = fm7Var.d;
                        if (km7Var != null) {
                            float f = km7Var.b;
                            float f2 = fm7Var.f;
                            float f3 = 1.0f;
                            if (f != f2) {
                                f3 = Math.max(0.0f, Math.min(1.0f, (km7Var.a - f2) / (f - f2)));
                            }
                            int i3 = fm7Var.e;
                            round = Math.round(hl.U1(f3, i3, Math.max(0, i3)));
                        } else {
                            if (m instanceof v94) {
                                height = ((v94) m).getMorphHeight();
                            } else {
                                height = m.getHeight();
                            }
                            round = Math.round((fm7Var.b + fm7Var.c) - (height / 2.0f));
                        }
                        im7Var2.f3.g1(fm7Var.a, round);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void w() {
    }
}
