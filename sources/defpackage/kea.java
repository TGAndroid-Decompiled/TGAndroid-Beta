package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;
public class kea extends nx0 implements fn7 {
    public static final int T2 = 0;
    public final mda A1;
    public TL_stories.StoryItem A2;
    public final mda B1;
    public mq5 B2;
    public final u55 C1;
    public int C2;
    public final u55 D1;
    public boolean D2;
    public final sd4 E1;
    public n8 E2;
    public final dea F1;
    public int F2;
    public final iea G1;
    public boolean G2;
    public final hea H1;
    public boolean H2;
    public final ArrayList I1;
    public int I2;
    public final String[] J1;
    public final tq3 J2;
    public final byte K1;
    public final oz4 K2;
    public final z2b L1;
    public final ll0 L2;
    public final Drawable M1;
    public final ll0 M2;
    public final View[] N1;
    public final ll0 N2;
    public final AnimatorSet[] O1;
    public final mr0 O2;
    public final zh6 P1;
    public final jl0 P2;
    public final HashMap Q1;
    public final rl0 Q2;
    public final yda R1;
    public final jl0 R2;
    public int S1;
    public boolean S2;
    public boolean T1;
    public final boolean U1;
    public boolean V1;
    public final int W1;
    public final FrameLayout X1;
    public final LinearLayout Y1;
    public final og2 Z1;
    public final zu1 a2;
    public final Activity b2;
    public final boolean c2;
    public boolean d2;
    public final TextPaint e2;
    public TLRPC.TL_exportedMessageLink f2;
    public boolean g2;
    public boolean h2;
    public final boolean i2;
    public final String[] j2;
    public int k2;
    public final FrameLayout l1;
    public int l2;
    public final pda m1;
    public boolean m2;
    public final qda n1;
    public aea n2;
    public final di3 o1;
    public float o2;
    public final pda p1;
    public float p2;
    public final FrameLayout q1;
    public float q2;
    public float r1;
    public ValueAnimator r2;
    public final nf9 s1;
    public final i69 s2;
    public final FrameLayout t1;
    public final rq4 t2;
    public final ema u1;
    public final a u2;
    public final FrameLayout v1;
    public boolean v2;
    public final FrameLayout w1;
    public vpa w2;
    public final LinearLayout x1;
    public TLRPC.Dialog x2;
    public AnimatorSet y1;
    public final xda y2;
    public final d79 z1;
    public ArrayList z2;

    public kea(android.content.Context r34, defpackage.zu1 r35, java.util.ArrayList r36, java.lang.String r37, java.lang.String r38, boolean r39, java.lang.String r40, java.lang.String r41, boolean r42, boolean r43, boolean r44, java.lang.Integer r45, defpackage.vnb r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kea.<init>(android.content.Context, zu1, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, vnb):void");
    }

    public static kea H0(Context context, r47 r47Var, String str, boolean z, String str2) {
        ArrayList arrayList;
        if (r47Var != null) {
            arrayList = qd4.t(r47Var);
        } else {
            arrayList = null;
        }
        return new kea(context, arrayList, str, null, z, str2, null, false);
    }

    public static void R0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i, vnb vnbVar) {
        int i2;
        int v0 = aob.v0(i, vnbVar);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        for (int i3 = 0; i3 < itemsCount; i3++) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
            int i4 = 6;
            if (i3 == 0) {
                i2 = 6;
            } else {
                i2 = 0;
            }
            if (i3 != itemsCount - 1) {
                i4 = 0;
            }
            yob.R(childAt, aob.Y(v0, i2, i4), null, yob.M(i), vnbVar);
        }
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void E0(boolean z) {
        rq4 rq4Var = this.t2;
        m7 m7Var = rq4Var.r;
        m7 m7Var2 = rq4Var.r;
        boolean isEmpty = TextUtils.isEmpty(m7Var.getText());
        mda mdaVar = this.A1;
        mda mdaVar2 = this.B1;
        boolean z2 = true;
        if (isEmpty && ((!this.d || !m7Var2.hasFocus()) && !this.H2)) {
            if (this.x2 == null) {
                hl.T3(mdaVar, true, 0.98f, true, true);
                hl.R3(mdaVar2, false);
            }
            z2 = false;
        } else {
            this.v2 = true;
            if (this.x2 == null) {
                hl.T3(mdaVar, false, 0.98f, true, true);
                hl.R3(mdaVar2, true);
            }
        }
        if (this.G2 == z2 && !z) {
            return;
        }
        this.G2 = z2;
        hea heaVar = this.H1;
        heaVar.f();
        this.F1.f();
        boolean z3 = this.G2;
        int i = this.F2;
        if (z3) {
            if (i == Integer.MAX_VALUE) {
                ((x46) mdaVar2.getLayoutManager()).g1(0, -mdaVar2.getPaddingTop());
            } else {
                ((x46) mdaVar2.getLayoutManager()).g1(0, this.F2 - mdaVar2.getPaddingTop());
            }
            heaVar.E(m7Var2.getText().toString());
            return;
        }
        u55 u55Var = this.C1;
        if (i == Integer.MAX_VALUE) {
            u55Var.g1(0, 0);
        } else {
            u55Var.g1(0, 0);
        }
    }

    public final void F0() {
        float f;
        TLRPC.Dialog dialog = this.x2;
        if (dialog != null) {
            nea neaVar = null;
            this.x2 = null;
            for (int i = 0; i < K0().getChildCount(); i++) {
                View childAt = K0().getChildAt(i);
                if ((childAt instanceof nea) && ((nea) childAt).getCurrentDialog() == dialog.id) {
                    neaVar = childAt;
                }
            }
            if (neaVar == null) {
                return;
            }
            vpa vpaVar = this.w2;
            if (vpaVar != null) {
                vpaVar.d();
            }
            K0().setVisibility(0);
            rq4 rq4Var = this.t2;
            rq4Var.setVisibility(0);
            m7 m7Var = rq4Var.r;
            if (this.G2 || this.H2) {
                this.y2.I.v = true;
                m7Var.requestFocus();
                hl.E3(m7Var);
            }
            int[] iArr = new int[2];
            vpa vpaVar2 = new vpa(new xk4(1000.0f));
            wpa wpaVar = new wpa(0.0f);
            zu1 zu1Var = this.a2;
            if (zu1Var != null && zu1Var.b) {
                f = 10.0f;
            } else {
                f = 800.0f;
            }
            wpaVar.b(f);
            wpaVar.a(1.0f);
            vpaVar2.m = wpaVar;
            this.w2 = vpaVar2;
            vpaVar2.b(new dda(this, neaVar, iArr, (byte) 0));
            this.w2.a(new iw0(this, (byte) 10));
            this.w2.h();
        }
    }

    public final void G0() {
        boolean z = false;
        if (this.f2 != null || this.j2[0] != null) {
            try {
                ((ClipboardManager) org.telegram.messenger.a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", J0()));
                aea aeaVar = this.n2;
                if ((aeaVar == null || !aeaVar.E()) && (this.b2 instanceof LaunchActivity)) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f2;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z = true;
                    }
                    ((LaunchActivity) this.b2).H0(new k64((byte) 7, z));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override
    public void H() {
        super.H();
        qda qdaVar = this.n1;
        if (qdaVar != null) {
            qdaVar.o();
        }
    }

    public final int I0() {
        mda mdaVar = this.A1;
        if (mdaVar.getChildCount() != 0) {
            int i = 0;
            View childAt = mdaVar.getChildAt(0);
            n69 n69Var = (n69) mdaVar.H(childAt);
            if (n69Var != null) {
                int paddingTop = mdaVar.getPaddingTop();
                if (n69Var.c() == 0 && childAt.getTop() >= 0) {
                    i = childAt.getTop();
                }
                return paddingTop - i;
            }
            return -1000;
        }
        return -1000;
    }

    public final String J0() {
        String str;
        String str2;
        String[] strArr = this.j2;
        yda ydaVar = this.R1;
        if (ydaVar != null) {
            str2 = strArr[ydaVar.e ? 1 : 0];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f2;
            if (tL_exportedMessageLink != null) {
                str = tL_exportedMessageLink.link;
            } else {
                str = null;
            }
            if (str == null) {
                str2 = strArr[0];
            } else {
                str2 = str;
            }
        }
        og2 og2Var = this.Z1;
        if (og2Var != null && og2Var.a.q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", hl.n0(this.W1)).build().toString();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final d79 K0() {
        if (!this.G2 && !this.H2) {
            return this.A1;
        }
        return this.B1;
    }

    public final void L0(View view, int[] iArr, float f) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        d79 d79Var = this.z1;
        d79Var.setPivotX(width);
        d79Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f2 = 0.25f * f;
        float f3 = 0.75f + f2;
        d79Var.setScaleX(f3);
        d79Var.setScaleY(f3);
        d79Var.setAlpha(f);
        d79 K0 = K0();
        K0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        K0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f4 = f2 + 1.0f;
        K0.setScaleX(f4);
        K0.setScaleY(f4);
        float f5 = 1.0f - f;
        K0.setAlpha(f5);
        rq4 rq4Var = this.t2;
        rq4Var.setPivotX(rq4Var.getWidth() / 2.0f);
        rq4Var.setPivotY(0.0f);
        float f6 = (0.1f * f5) + 0.9f;
        rq4Var.setScaleX(f6);
        rq4Var.setScaleY(f6);
        rq4Var.setAlpha(f5);
        a aVar = this.u2;
        aVar.getBackButton().setTranslationX((-hl.L(16.0f)) * f5);
        aVar.getTitleTextView().setTranslationY(hl.L(16.0f) * f5);
        aVar.getSubtitleTextView().setTranslationY(hl.L(16.0f) * f5);
        aVar.setAlpha(f);
        d79Var.getLocationInWindow(iArr);
        float interpolation = k43.g.getInterpolation(f);
        for (int i = 0; i < K0.getChildCount(); i++) {
            View childAt = K0.getChildAt(i);
            if (childAt instanceof nea) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f5);
                }
            }
        }
        for (int i2 = 0; i2 < d79Var.getChildCount(); i2++) {
            View childAt2 = d79Var.getChildAt(i2);
            if (childAt2 instanceof tea) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((d79Var.getTranslationY() + y) - view.getY()))));
            }
        }
        this.b.requestLayout();
        K0.invalidate();
    }

    public final void O0(boolean z) {
        Integer num;
        float f;
        View[] viewArr = this.N1;
        if (z) {
            if (viewArr[0].getTag() == null) {
                return;
            }
        } else if (viewArr[0].getTag() != null) {
            return;
        }
        View view = viewArr[0];
        if (z) {
            num = null;
        } else {
            num = 1;
        }
        view.setTag(num);
        if (z) {
            viewArr[0].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.O1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[0] = animatorSet2;
        View view2 = viewArr[0];
        Property property = View.ALPHA;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f));
        animatorSetArr[0].setDuration(150L);
        animatorSetArr[0].addListener(new vda(this, z, (byte) 0));
        animatorSetArr[0].start();
    }

    @Override
    public final int P() {
        return this.b.getMeasuredHeight() - this.S1;
    }

    public final void P0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        ArrayList l;
        gea geaVar;
        if (dialog instanceof cea) {
            N0(view);
        } else if (((view instanceof nea) && ((nea) view).G) || ((view instanceof bv8) && ((bv8) view).p0)) {
            T0(dialog.id, view);
        } else {
            d79 d79Var = this.z1;
            if (d79Var.getVisibility() == 8 && (activity = this.b2) != null) {
                boolean y = wf3.y(dialog.id);
                byte b = this.K1;
                if (y) {
                    TLRPC.Chat M0 = uc7.s1(this.a).M0(Long.valueOf(-dialog.id));
                    if (xc2.T(M0) && !M0.megagroup) {
                        TLRPC.Chat M02 = uc7.s1(this.a).M0(Long.valueOf(-dialog.id));
                        if ((!xc2.n(M02) && !M02.megagroup) || b == 2 || b == 3) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                            String M03 = ob6.M0(2131745324, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M03;
                            if (b == 3) {
                                if (xc2.P(10, M0)) {
                                    idVar.U = ob6.M0(2131751049, null);
                                } else {
                                    idVar.U = ob6.M0(2131751050, null);
                                }
                            } else if (b == 2) {
                                if (this.i2) {
                                    idVar.U = ob6.M0(2131746314, null);
                                } else if (xc2.P(10, M0)) {
                                    idVar.U = ob6.M0(2131751057, null);
                                } else {
                                    idVar.U = ob6.M0(2131751058, null);
                                }
                            } else {
                                idVar.U = ob6.M0(2131752414, null);
                            }
                            ik8.y(null, 2131747558, alertDialog$Builder, null);
                            return;
                        }
                    }
                } else if (wf3.B(dialog.id) && b != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String M04 = ob6.M0(2131745324, null);
                    id idVar2 = alertDialog$Builder2.a;
                    idVar2.S = M04;
                    if (b == 3) {
                        idVar2.U = ob6.M0(2131743743, null);
                    } else if (b != 0) {
                        idVar2.U = ob6.M0(2131746903, null);
                    } else {
                        idVar2.U = ob6.M0(2131748858, null);
                    }
                    ik8.y(null, 2131747558, alertDialog$Builder2, null);
                    return;
                }
                long j = dialog.id;
                zh6 zh6Var = this.P1;
                if (zh6Var.h(j) >= 0) {
                    zh6Var.l(dialog.id);
                    this.Q1.remove(dialog);
                    if (view instanceof bv8) {
                        ((bv8) view).A(false, true);
                    } else if (view instanceof nea) {
                        ((nea) view).b(false, true);
                    }
                    X0(1);
                } else {
                    TLRPC.User X1 = uc7.s1(this.a).X1(Long.valueOf(dialog.id));
                    TLRPC.Chat M05 = uc7.s1(this.a).M0(Long.valueOf(-dialog.id));
                    if ((lbc.w(X1) && (((l = uc7.s1(this.a).g4.l(-X1.id)) != null && !l.isEmpty()) || !uc7.s1(this.a).g4.e(-X1.id))) || (wf3.y(dialog.id) && (xc2.c0(M05) || (xc2.p0(M05) && xc2.A(this.a, M05, 24))))) {
                        this.x2 = dialog;
                        this.D1.g1(0, this.k2 - d79Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        tda tdaVar = new tda(this, dialog, atomicReference, view);
                        atomicReference.set(new vp8(this, atomicReference, tdaVar, dialog, (byte) 24));
                        jn7 f = jn7.f(this.a);
                        int i = jn7.t5;
                        f.a(tdaVar, i);
                        ArrayList l2 = uc7.s1(this.a).g4.l(-dialog.id);
                        int i2 = this.a;
                        if (l2 != null) {
                            tdaVar.didReceivedNotification(i, i2, Long.valueOf(-dialog.id));
                            return;
                        }
                        uc7.s1(i2).g4.o(-dialog.id);
                        hl.d3((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                    zh6Var.k(dialog.id, dialog);
                    if (view instanceof bv8) {
                        ((bv8) view).A(true, true);
                    } else if (view instanceof nea) {
                        ((nea) view).b(true, true);
                    }
                    X0(2);
                    long j2 = yac.h(this.a).n;
                    if (this.G2) {
                        dea deaVar = this.F1;
                        zh6 zh6Var2 = deaVar.e;
                        ArrayList arrayList = deaVar.d;
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) zh6Var2.f(dialog.id);
                        if (dialog2 == null) {
                            deaVar.e.k(dialog.id, dialog);
                            arrayList.add(!arrayList.isEmpty(), dialog);
                        } else if (dialog2.id != j2) {
                            arrayList.remove(dialog2);
                            arrayList.add(!arrayList.isEmpty(), dialog2);
                        }
                        deaVar.f();
                        this.v2 = false;
                        rq4 rq4Var = this.t2;
                        rq4Var.r.setText("");
                        E0(false);
                        hl.t1(rq4Var.r);
                    }
                }
                hea heaVar = this.H1;
                if (heaVar != null && (geaVar = heaVar.I) != null) {
                    geaVar.l(0, geaVar.b());
                }
            }
        }
    }

    public final void Q0(final boolean z) {
        int i;
        ?? r9;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            zh6 zh6Var = this.P1;
            int m = zh6Var.m();
            pda pdaVar = this.m1;
            qda qdaVar = this.n1;
            boolean z2 = true;
            if (i4 < m) {
                long j = zh6Var.j(i4);
                if (jj.h(getContext(), this.a, j, (pdaVar.getTag() == null || qdaVar.a.length() <= 0) ? false : false)) {
                    return;
                }
                i4++;
            } else {
                Editable text = qdaVar.getText();
                du3 du3Var = qdaVar.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList Y = ls6.d0(this.a).Y(charSequenceArr, true, true);
                og2 og2Var = this.Z1;
                if (og2Var != null && og2Var.a.q) {
                    i = this.W1;
                } else {
                    i = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.I1 != null) {
                    i2 = 0;
                    while (i3 < zh6Var.m()) {
                        long j2 = zh6Var.j(i3);
                        long M1 = uc7.s1(this.a).M1(j2);
                        if (M1 <= 0) {
                            M1 = wf3.j(uc7.s1(this.a).P2(j2));
                        }
                        if (pdaVar.getTag() != null && du3Var.length() > 0 && M1 > 0) {
                            i2++;
                        }
                        int i5 = (M1 > 0L ? 1 : (M1 == 0L ? 0 : -1));
                        if (i5 > 0) {
                            i2++;
                        }
                        if (i5 > 0 && !arrayList.contains(Long.valueOf(j2))) {
                            arrayList.add(Long.valueOf(j2));
                        }
                        i3++;
                    }
                } else {
                    yda ydaVar = this.R1;
                    if (ydaVar != null) {
                        r9 = ydaVar.e;
                    } else {
                        r9 = 0;
                    }
                    if (this.A2 != null) {
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < zh6Var.m()) {
                            long j3 = zh6Var.j(i6);
                            long M12 = uc7.s1(this.a).M1(j3);
                            if (M12 <= 0) {
                                M12 = wf3.j(uc7.s1(this.a).P2(j3));
                            }
                            int i8 = i3;
                            if (this.A2 != null && pdaVar.getTag() != null && du3Var.length() > 0 && charSequenceArr[i8] != null && M12 > 0) {
                                i7++;
                            }
                            int i9 = (M12 > 0L ? 1 : (M12 == 0L ? 0 : -1));
                            if (i9 > 0) {
                                i7++;
                            }
                            if (i9 > 0 && !arrayList.contains(Long.valueOf(j3))) {
                                arrayList.add(Long.valueOf(j3));
                            }
                            i6++;
                            i3 = i8;
                        }
                        i2 = i7;
                    } else {
                        int i10 = 0;
                        if (this.J1[r9] != null) {
                            for (int i11 = 0; i11 < zh6Var.m(); i11++) {
                                long j4 = zh6Var.j(i11);
                                long M13 = uc7.s1(this.a).M1(j4);
                                if (M13 <= 0) {
                                    M13 = wf3.j(uc7.s1(this.a).P2(j4));
                                }
                                if (pdaVar.getTag() != null && du3Var.length() > 0 && M13 > 0) {
                                    i10++;
                                }
                                int i12 = (M13 > 0L ? 1 : (M13 == 0L ? 0 : -1));
                                if (i12 > 0) {
                                    i10++;
                                }
                                if (i12 > 0 && !arrayList.contains(Long.valueOf(j4))) {
                                    arrayList.add(Long.valueOf(j4));
                                }
                            }
                        }
                        i2 = i10;
                    }
                }
                final int i13 = i;
                jj.Z(this.a, arrayList, i2, new pcc() {
                    @Override
                    public final void a(Object obj) {
                        ?? r12;
                        int i14;
                        boolean z3;
                        Long l;
                        int i15;
                        HashMap hashMap;
                        long j5;
                        boolean z4;
                        char c;
                        r47 r47Var;
                        qda qdaVar2;
                        long longValue;
                        String charSequence;
                        long longValue2;
                        Long l2;
                        String[] strArr;
                        boolean z5;
                        long j6;
                        int i16;
                        Long l3;
                        r47 r47Var2;
                        p7a b;
                        long longValue3;
                        String charSequence2;
                        ArrayList arrayList2;
                        TLRPC.TL_forumTopic tL_forumTopic;
                        TLRPC.TL_forumTopic tL_forumTopic2;
                        Long l4;
                        boolean z6;
                        int i17;
                        boolean z7;
                        long j7;
                        Long l5;
                        CharSequence[] charSequenceArr2;
                        r47 r47Var3;
                        r47 r47Var4;
                        ArrayList arrayList3;
                        ?? r11;
                        long longValue4;
                        String charSequence3;
                        long longValue5;
                        HashMap hashMap2 = (HashMap) obj;
                        kea keaVar = kea.this;
                        String[] strArr2 = keaVar.J1;
                        pda pdaVar2 = keaVar.m1;
                        qda qdaVar3 = keaVar.n1;
                        HashMap hashMap3 = keaVar.Q1;
                        Long l6 = 0L;
                        zh6 zh6Var2 = keaVar.P1;
                        ArrayList arrayList4 = keaVar.I1;
                        CharSequence[] charSequenceArr3 = charSequenceArr;
                        ArrayList arrayList5 = Y;
                        boolean z8 = z;
                        if (arrayList4 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int i18 = 0;
                            boolean z9 = false;
                            while (true) {
                                if (i18 < zh6Var2.m()) {
                                    boolean z10 = z8;
                                    long j8 = zh6Var2.j(i18);
                                    boolean B2 = uc7.s1(keaVar.a).B2(j8);
                                    pda pdaVar3 = pdaVar2;
                                    if (hashMap2 == null) {
                                        l4 = l6;
                                    } else {
                                        l4 = (Long) hashMap2.get(Long.valueOf(j8));
                                    }
                                    if (l4 != null && l4.longValue() > 0) {
                                        z6 = true;
                                    } else {
                                        z6 = z9;
                                    }
                                    Long l7 = l4;
                                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap3.get(zh6Var2.f(j8));
                                    if (tL_forumTopic3 != null && B2) {
                                        i17 = i18;
                                        z7 = B2;
                                        j7 = wf3.n(tL_forumTopic3.from_id);
                                    } else {
                                        i17 = i18;
                                        z7 = B2;
                                        j7 = 0;
                                    }
                                    if (tL_forumTopic3 != null && !z7) {
                                        l5 = l6;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        r47Var3 = new r47(keaVar.a, tL_forumTopic3.topicStartMessage, false, false);
                                    } else {
                                        l5 = l6;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        r47Var3 = null;
                                    }
                                    if (r47Var3 != null) {
                                        r47Var3.p = true;
                                    }
                                    if (pdaVar3.getTag() != null && qdaVar3.a.length() > 0) {
                                        CharSequence charSequence4 = charSequenceArr2[0];
                                        if (charSequence4 == null) {
                                            charSequence3 = null;
                                        } else {
                                            charSequence3 = charSequence4.toString();
                                        }
                                        r11 = 0;
                                        r47Var4 = r47Var3;
                                        ArrayList arrayList7 = arrayList5;
                                        p7a b2 = p7a.b(charSequence3, j8, r47Var4, r47Var3, null, true, arrayList7, null, null, z10, 0, 0, null, false);
                                        arrayList3 = arrayList7;
                                        z10 = z10;
                                        if (l7 == null) {
                                            longValue5 = 0;
                                        } else {
                                            longValue5 = l7.longValue();
                                        }
                                        b2.Q = longValue5;
                                        b2.R = j7;
                                        r7a.B(keaVar.a).q0(b2);
                                    } else {
                                        r47Var4 = r47Var3;
                                        arrayList3 = arrayList5;
                                        r11 = 0;
                                    }
                                    r7a B = r7a.B(keaVar.a);
                                    r47 r47Var5 = r47Var4;
                                    ArrayList arrayList8 = keaVar.I1;
                                    boolean z11 = !keaVar.D2;
                                    if (l7 == null) {
                                        longValue4 = 0;
                                    } else {
                                        longValue4 = l7.longValue();
                                    }
                                    boolean z12 = z10;
                                    int p0 = B.p0(arrayList8, j8, z11, false, z12, 0, 0, r47Var5, i13, longValue4, j7, null);
                                    if (p0 != 0) {
                                        arrayList6.add(Long.valueOf(j8));
                                    }
                                    if (zh6Var2.m() == 1) {
                                        jj.q0(p0, r11, keaVar.a2);
                                        if (p0 != 0) {
                                            z9 = z6;
                                            tL_forumTopic = r11;
                                            break;
                                        }
                                    }
                                    i18 = i17 + 1;
                                    arrayList5 = arrayList3;
                                    z8 = z12;
                                    pdaVar2 = pdaVar3;
                                    z9 = z6;
                                    l6 = l5;
                                    arrayList4 = arrayList2;
                                    charSequenceArr3 = charSequenceArr2;
                                } else {
                                    arrayList2 = arrayList4;
                                    tL_forumTopic = null;
                                    break;
                                }
                            }
                            int size = arrayList6.size();
                            int i19 = 0;
                            while (i19 < size) {
                                Object obj2 = arrayList6.get(i19);
                                i19++;
                                long longValue6 = ((Long) obj2).longValue();
                                TLRPC.Dialog dialog = (TLRPC.Dialog) zh6Var2.f(longValue6);
                                zh6Var2.l(longValue6);
                                if (dialog != null) {
                                    hashMap3.remove(dialog);
                                }
                            }
                            if (!zh6Var2.i()) {
                                int size2 = arrayList2.size();
                                if (zh6Var2.m() == 1) {
                                    tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap3.get(zh6Var2.n(0));
                                } else {
                                    tL_forumTopic2 = tL_forumTopic;
                                }
                                keaVar.M0(zh6Var2, size2, tL_forumTopic2, !z9);
                            }
                        } else {
                            boolean z13 = z8;
                            yda ydaVar2 = keaVar.R1;
                            if (ydaVar2 != null) {
                                r12 = ydaVar2.e;
                            } else {
                                r12 = 0;
                            }
                            if (keaVar.A2 != null) {
                                int i20 = 0;
                                boolean z14 = false;
                                while (i20 < zh6Var2.m()) {
                                    long j9 = zh6Var2.j(i20);
                                    boolean B22 = uc7.s1(keaVar.a).B2(j9);
                                    if (hashMap2 == null) {
                                        l2 = l6;
                                    } else {
                                        l2 = (Long) hashMap2.get(Long.valueOf(j9));
                                    }
                                    if (l2 != null && l2.longValue() > 0) {
                                        z14 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap3.get(zh6Var2.f(j9));
                                    if (tL_forumTopic4 != null && B22) {
                                        strArr = strArr2;
                                        z5 = z14;
                                        j6 = wf3.n(tL_forumTopic4.from_id);
                                    } else {
                                        strArr = strArr2;
                                        z5 = z14;
                                        j6 = 0;
                                    }
                                    if (tL_forumTopic4 != null && !B22) {
                                        i16 = i20;
                                        l3 = l2;
                                        r47Var2 = new r47(keaVar.a, tL_forumTopic4.topicStartMessage, false, false);
                                    } else {
                                        i16 = i20;
                                        l3 = l2;
                                        r47Var2 = null;
                                    }
                                    if (keaVar.A2 == null) {
                                        if (pdaVar2.getTag() != null && qdaVar3.a.length() > 0) {
                                            CharSequence charSequence5 = charSequenceArr3[0];
                                            if (charSequence5 == null) {
                                                charSequence2 = null;
                                            } else {
                                                charSequence2 = charSequence5.toString();
                                            }
                                            boolean z15 = z13;
                                            b = p7a.b(charSequence2, j9, r47Var2, r47Var2, null, true, arrayList5, null, null, z15, 0, 0, null, false);
                                            z13 = z15;
                                        } else {
                                            b = p7a.b(strArr[r12], j9, r47Var2, r47Var2, null, true, null, null, null, z13, 0, 0, null, false);
                                        }
                                    } else {
                                        if (pdaVar2.getTag() != null && qdaVar3.a.length() > 0 && charSequenceArr3[0] != null) {
                                            r47 r47Var6 = r47Var2;
                                            r47Var2 = r47Var6;
                                            r7a.B(keaVar.a).q0(p7a.b(charSequenceArr3[0].toString(), j9, null, r47Var6, null, true, null, null, null, z13, 0, 0, null, false));
                                        }
                                        b = p7a.b(null, j9, r47Var2, r47Var2, null, true, null, null, null, z13, 0, 0, null, false);
                                        b.I = keaVar.A2;
                                    }
                                    if (l3 == null) {
                                        longValue3 = 0;
                                    } else {
                                        longValue3 = l3.longValue();
                                    }
                                    b.Q = longValue3;
                                    b.R = j6;
                                    r7a.B(keaVar.a).q0(b);
                                    i20 = i16 + 1;
                                    z14 = z5;
                                    strArr2 = strArr;
                                }
                                z3 = z14;
                            } else if (strArr2[r12] != null) {
                                int i21 = 0;
                                boolean z16 = false;
                                while (i21 < zh6Var2.m()) {
                                    long j10 = zh6Var2.j(i21);
                                    boolean B23 = uc7.s1(keaVar.a).B2(j10);
                                    if (hashMap2 == null) {
                                        l = l6;
                                    } else {
                                        l = (Long) hashMap2.get(Long.valueOf(j10));
                                    }
                                    if (l != null && l.longValue() > 0) {
                                        z16 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic5 = (TLRPC.TL_forumTopic) hashMap3.get(zh6Var2.f(j10));
                                    if (tL_forumTopic5 != null && B23) {
                                        i15 = i21;
                                        hashMap = hashMap2;
                                        j5 = wf3.n(tL_forumTopic5.from_id);
                                    } else {
                                        i15 = i21;
                                        hashMap = hashMap2;
                                        j5 = 0;
                                    }
                                    if (tL_forumTopic5 != null && !B23) {
                                        z4 = z16;
                                        c = 0;
                                        r47Var = new r47(keaVar.a, tL_forumTopic5.topicStartMessage, false, false);
                                    } else {
                                        z4 = z16;
                                        c = 0;
                                        r47Var = null;
                                    }
                                    if (pdaVar2.getTag() != null && qdaVar3.a.length() > 0) {
                                        CharSequence charSequence6 = charSequenceArr3[c];
                                        if (charSequence6 == null) {
                                            charSequence = null;
                                        } else {
                                            charSequence = charSequence6.toString();
                                        }
                                        boolean z17 = z13;
                                        p7a b3 = p7a.b(charSequence, j10, r47Var, r47Var, null, true, arrayList5, null, null, z17, 0, 0, null, false);
                                        z13 = z17;
                                        if (l == null) {
                                            qdaVar2 = qdaVar3;
                                            longValue2 = 0;
                                        } else {
                                            qdaVar2 = qdaVar3;
                                            longValue2 = l.longValue();
                                        }
                                        b3.Q = longValue2;
                                        b3.R = j5;
                                        r7a.B(keaVar.a).q0(b3);
                                    } else {
                                        qdaVar2 = qdaVar3;
                                    }
                                    r47 r47Var7 = r47Var;
                                    p7a b4 = p7a.b(strArr2[r12], j10, r47Var7, r47Var7, null, true, null, null, null, z13, 0, 0, null, false);
                                    if (l == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l.longValue();
                                    }
                                    b4.Q = longValue;
                                    b4.R = j5;
                                    r7a.B(keaVar.a).q0(b4);
                                    i21 = i15 + 1;
                                    z16 = z4;
                                    qdaVar3 = qdaVar2;
                                    hashMap2 = hashMap;
                                }
                                z3 = z16;
                            } else {
                                i14 = 0;
                                z3 = false;
                                keaVar.M0(zh6Var2, 1, (TLRPC.TL_forumTopic) hashMap3.get(zh6Var2.n(i14)), !z3);
                            }
                            i14 = 0;
                            keaVar.M0(zh6Var2, 1, (TLRPC.TL_forumTopic) hashMap3.get(zh6Var2.n(i14)), !z3);
                        }
                        aea aeaVar = keaVar.n2;
                        if (aeaVar != null) {
                            aeaVar.u();
                        }
                        keaVar.dismiss();
                    }
                });
                return;
            }
        }
    }

    public final void S0(boolean z) {
        boolean z2;
        Integer num;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        pda pdaVar = this.m1;
        if (pdaVar.getTag() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            return;
        }
        AnimatorSet animatorSet = this.y1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z) {
            num = 1;
        } else {
            num = null;
        }
        pdaVar.setTag(num);
        qda qdaVar = this.n1;
        if (qdaVar.getEditText().isFocused()) {
            hl.t1(qdaVar.getEditText());
        }
        qdaVar.k(true);
        FrameLayout frameLayout = this.X1;
        pda pdaVar2 = this.p1;
        FrameLayout frameLayout2 = this.q1;
        if (z) {
            pdaVar.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            pdaVar2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        int i2 = 4;
        if (frameLayout2 != null) {
            if (z) {
                i = 4;
            } else {
                i = 1;
            }
            WeakHashMap weakHashMap = ihc.a;
            frameLayout2.setImportantForAccessibility(i);
        }
        LinearLayout linearLayout = this.x1;
        if (linearLayout != null) {
            if (!z) {
                i2 = 1;
            }
            WeakHashMap weakHashMap2 = ihc.a;
            linearLayout.setImportantForAccessibility(i2);
        }
        this.y1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f6 = 0.0f;
        float f7 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(pdaVar, property, f));
        if (frameLayout != null && frameLayout2 == null) {
            if (z) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, property, f5));
        }
        Property property2 = View.SCALE_X;
        float f8 = 0.2f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.2f;
        }
        arrayList.add(ObjectAnimator.ofFloat(pdaVar2, property2, f2));
        Property property3 = View.SCALE_Y;
        if (z) {
            f8 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(pdaVar2, property3, f8));
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(pdaVar2, property, f3));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            View view = this.N1[1];
            if (!z) {
                f7 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(view, property, f7));
        }
        FrameLayout frameLayout3 = this.t1;
        if (frameLayout3 != null) {
            Property property4 = View.TRANSLATION_Y;
            if (this.c2 && z) {
                if (this.Y1 != null) {
                    f4 = 5.0f;
                } else {
                    f4 = 16.0f;
                }
                f6 = hl.L(f4);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f6));
        }
        this.y1.playTogether(arrayList);
        this.y1.setInterpolator(new DecelerateInterpolator());
        this.y1.setDuration(180L);
        this.y1.addListener(new vda(this, z, (byte) 1));
        this.y1.start();
    }

    public final void T0(long j, View view) {
        String str;
        v21 K;
        int i = -this.C2;
        this.C2 = i;
        hl.A3(i, view, null);
        yw0.APP_ERROR.a();
        if (j >= 0) {
            str = lbc.r(uc7.s1(this.a).X1(Long.valueOf(j)));
        } else {
            str = "";
        }
        boolean M3 = uc7.s1(this.a).M3();
        vnb vnbVar = this.J0;
        FrameLayout frameLayout = this.v1;
        if (M3) {
            K = new d31(frameLayout, vnbVar).Q(2131624211, 36, hl.S2(ob6.a0(null, null, 2131743415, str)));
        } else {
            K = new d31(frameLayout, vnbVar).K(2131624211, hl.S2(ob6.a0(null, null, 2131743415, str)), ob6.M0(2131743414, null), new gda(this, (byte) 1));
        }
        K.j();
    }

    public final void U0() {
        hb hbVar;
        pda pdaVar = this.m1;
        if (pdaVar == null) {
            return;
        }
        qda qdaVar = this.n1;
        if (qdaVar != null && qdaVar.m()) {
            qdaVar.getEmojiPaddingShown();
        } else {
            xda xdaVar = this.y2;
            if (xdaVar != null && (hbVar = xdaVar.I) != null && !hbVar.f) {
                Typeface typeface = hl.a;
            }
        }
        float f = 0.0f;
        FrameLayout frameLayout = this.X1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f = 0.0f + hl.L(48.0f);
        }
        FrameLayout frameLayout2 = this.q1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f);
        }
        float f2 = -f;
        pdaVar.setTranslationY(f2);
        this.p1.setTranslationY(f2);
    }

    public final void V0() {
        mda mdaVar;
        int i;
        int i2;
        if (!this.m2) {
            boolean z = this.G2;
            mda mdaVar2 = this.A1;
            mda mdaVar3 = this.B1;
            if (z) {
                mdaVar = mdaVar3;
            } else {
                mdaVar = mdaVar2;
            }
            if (mdaVar.getChildCount() > 0) {
                View childAt = mdaVar.getChildAt(0);
                for (int i3 = 0; i3 < mdaVar.getChildCount(); i3++) {
                    if (mdaVar.getChildAt(i3).getTop() < childAt.getTop()) {
                        childAt = mdaVar.getChildAt(i3);
                    }
                }
                n69 n69Var = (n69) mdaVar.H(childAt);
                int top = childAt.getTop() - hl.L(8.0f);
                if (top > 0 && n69Var != null && n69Var.b() == 0) {
                    i = top;
                } else {
                    i = 0;
                }
                if (top >= 0 && n69Var != null && n69Var.b() == 0) {
                    this.F2 = childAt.getTop();
                    O0(false);
                } else {
                    this.F2 = Integer.MAX_VALUE;
                    O0(true);
                    top = i;
                }
                d79 d79Var = this.z1;
                if (d79Var.getVisibility() == 0) {
                    if (d79Var.getChildCount() > 0) {
                        View childAt2 = d79Var.getChildAt(0);
                        for (int i4 = 0; i4 < d79Var.getChildCount(); i4++) {
                            if (d79Var.getChildAt(i4).getTop() < childAt2.getTop()) {
                                childAt2 = d79Var.getChildAt(i4);
                            }
                        }
                        n69 n69Var2 = (n69) d79Var.H(childAt2);
                        int top2 = childAt2.getTop() - hl.L(8.0f);
                        if (top2 > 0 && n69Var2 != null && n69Var2.b() == 0) {
                            i2 = top2;
                        } else {
                            i2 = 0;
                        }
                        if (top2 >= 0 && n69Var2 != null && n69Var2.b() == 0) {
                            this.F2 = childAt2.getTop();
                            O0(false);
                        } else {
                            this.F2 = Integer.MAX_VALUE;
                            O0(true);
                            top2 = i2;
                        }
                        top = hl.U1(d79Var.getAlpha(), top, top2);
                    } else {
                        return;
                    }
                }
                int i5 = this.k2;
                if (i5 != top) {
                    this.l2 = i5;
                    float f = top;
                    int i6 = (int) (this.o2 + f);
                    this.k2 = i6;
                    mdaVar2.setTopGlowOffset(i6);
                    int i7 = (int) (this.o2 + f);
                    this.k2 = i7;
                    mdaVar3.setTopGlowOffset(i7);
                    int i8 = (int) (f + this.o2);
                    this.k2 = i8;
                    d79Var.setTopGlowOffset(i8);
                    this.l1.setTranslationY(this.k2 + this.o2);
                    this.L1.setTranslationY(this.k2 + this.o2);
                    this.b.invalidate();
                }
            }
        }
    }

    public final void W0() {
        ema emaVar = this.u1;
        if (emaVar != null) {
            String J0 = J0();
            if (J0.startsWith("https://")) {
                J0 = J0.substring(8);
            } else if (J0.startsWith("http://")) {
                J0 = J0.substring(7);
            }
            emaVar.l(J0, false);
        }
    }

    public final void X0(int i) {
        int size;
        boolean z;
        boolean z2;
        zh6 zh6Var = this.P1;
        if (zh6Var.m() == 0) {
            S0(false);
            return;
        }
        ArrayList arrayList = this.I1;
        if (arrayList == null) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        Object tag = this.m1.getTag();
        qda qdaVar = this.n1;
        if (tag != null && qdaVar.a.length() > 0) {
            size++;
        }
        long j = 0;
        for (int i2 = 0; i2 < zh6Var.m(); i2++) {
            long j2 = ((TLRPC.Dialog) zh6Var.n(i2)).id;
            long M1 = uc7.s1(this.a).M1(j2);
            if (M1 <= 0) {
                M1 = wf3.j(uc7.s1(this.a).P2(j2));
            }
            j += M1;
        }
        int max = Math.max(1, zh6Var.m());
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        di3 di3Var = this.o1;
        di3Var.g(max, z);
        if (i != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        di3Var.i(size, j, z2);
        S0(true);
        qdaVar.setPadding(0, 0, Math.max(hl.L(84.0f), di3Var.l()), 0);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.r;
        if (i == i3) {
            dea deaVar = this.F1;
            if (deaVar != null) {
                deaVar.E();
            }
            jn7.f(this.a).n(this, i3);
        }
    }

    @Override
    public final void dismiss() {
        qda qdaVar = this.n1;
        if (qdaVar != null) {
            hl.t1(qdaVar.getEditText());
        }
        this.T1 = false;
        super.dismiss();
        jn7.f(this.a).n(this, jn7.r);
    }

    @Override
    public final void onBackPressed() {
        if (this.x2 != null) {
            F0();
            return;
        }
        qda qdaVar = this.n1;
        if (qdaVar != null && qdaVar.e) {
            qdaVar.k(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void p0() {
        boolean z;
        try {
            super.p0();
            oz4 oz4Var = this.K2;
            if (oz4Var != null) {
                oz4Var.a(aob.v0(aob.d6, this.J0));
            }
            ex0 ex0Var = this.c;
            if (ex0Var != null) {
                if (hl.B(aob.v0(aob.h5, this.J0)) > 0.721f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != this.S2) {
                    this.S2 = z;
                    hl.j3(ex0Var, z);
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void N0(View view) {
    }

    public void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
    }

    public kea(Context context, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2) {
        this(context, null, arrayList, str, str2, z, str3, str4, false, z2, false, null, null);
    }

    public kea(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2, vnb vnbVar) {
        this(context, null, arrayList, str, null, z, str2, null, z2, false, false, null, vnbVar);
    }
}
