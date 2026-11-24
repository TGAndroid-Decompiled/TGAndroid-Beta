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
public class taa extends fx0 implements gk7 {
    public static final int T2 = 0;
    public final v9a A1;
    public TL_stories.StoryItem A2;
    public final v9a B1;
    public io5 B2;
    public final r35 C1;
    public int C2;
    public final r35 D1;
    public boolean D2;
    public final vb4 E1;
    public m8 E2;
    public final maa F1;
    public int F2;
    public final raa G1;
    public boolean G2;
    public final qaa H1;
    public boolean H2;
    public final ArrayList I1;
    public int I2;
    public final String[] J1;
    public final cq3 J2;
    public final byte K1;
    public final ix4 K2;
    public final zya L1;
    public final kl0 L2;
    public final Drawable M1;
    public final kl0 M2;
    public final View[] N1;
    public final kl0 N2;
    public final AnimatorSet[] O1;
    public final vw0 O2;
    public final vf6 P1;
    public final il0 P2;
    public final HashMap Q1;
    public final ql0 Q2;
    public final haa R1;
    public final il0 R2;
    public int S1;
    public boolean S2;
    public boolean T1;
    public final boolean U1;
    public boolean V1;
    public final int W1;
    public final FrameLayout X1;
    public final LinearLayout Y1;
    public final wf2 Z1;
    public final mu1 a2;
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
    public final y9a m1;
    public boolean m2;
    public final z9a n1;
    public jaa n2;
    public final jh3 o1;
    public float o2;
    public final y9a p1;
    public float p2;
    public final FrameLayout q1;
    public float q2;
    public float r1;
    public ValueAnimator r2;
    public final si9 s1;
    public final t29 s2;
    public final FrameLayout t1;
    public final no4 t2;
    public final jia u1;
    public final a u2;
    public final FrameLayout v1;
    public boolean v2;
    public final FrameLayout w1;
    public yla w2;
    public final LinearLayout x1;
    public TLRPC.Dialog x2;
    public AnimatorSet y1;
    public final gaa y2;
    public final o39 z1;
    public ArrayList z2;

    public taa(android.content.Context r36, defpackage.mu1 r37, java.util.ArrayList r38, java.lang.String r39, java.lang.String r40, boolean r41, java.lang.String r42, java.lang.String r43, boolean r44, boolean r45, boolean r46, java.lang.Integer r47, defpackage.wjb r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.taa.<init>(android.content.Context, mu1, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, wjb):void");
    }

    public static taa G0(Context context, k27 k27Var, String str, boolean z, String str2) {
        ArrayList arrayList;
        if (k27Var != null) {
            arrayList = tb4.t(k27Var);
        } else {
            arrayList = null;
        }
        return new taa(context, arrayList, str, null, z, str2, null, false);
    }

    public static void Q0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i, wjb wjbVar) {
        int i2;
        int v0 = bkb.v0(i, wjbVar);
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
            zkb.R(childAt, bkb.Y(v0, i2, i4), null, zkb.M(i), wjbVar);
        }
    }

    public final void D0(boolean z) {
        no4 no4Var = this.t2;
        l7 l7Var = no4Var.r;
        l7 l7Var2 = no4Var.r;
        boolean isEmpty = TextUtils.isEmpty(l7Var.getText());
        v9a v9aVar = this.A1;
        v9a v9aVar2 = this.B1;
        boolean z2 = true;
        if (isEmpty && ((!this.d || !l7Var2.hasFocus()) && !this.H2)) {
            if (this.x2 == null) {
                gl.U3(v9aVar, true, 0.98f, true, true);
                gl.S3(v9aVar2, false);
            }
            z2 = false;
        } else {
            this.v2 = true;
            if (this.x2 == null) {
                gl.U3(v9aVar, false, 0.98f, true, true);
                gl.S3(v9aVar2, true);
            }
        }
        if (this.G2 == z2 && !z) {
            return;
        }
        this.G2 = z2;
        qaa qaaVar = this.H1;
        qaaVar.f();
        this.F1.f();
        boolean z3 = this.G2;
        int i = this.F2;
        if (z3) {
            if (i == Integer.MAX_VALUE) {
                ((t26) v9aVar2.getLayoutManager()).g1(0, -v9aVar2.getPaddingTop());
            } else {
                ((t26) v9aVar2.getLayoutManager()).g1(0, this.F2 - v9aVar2.getPaddingTop());
            }
            qaaVar.E(l7Var2.getText().toString());
            return;
        }
        r35 r35Var = this.C1;
        if (i == Integer.MAX_VALUE) {
            r35Var.g1(0, 0);
        } else {
            r35Var.g1(0, 0);
        }
    }

    @Override
    public final boolean E() {
        return false;
    }

    public final void E0() {
        float f;
        TLRPC.Dialog dialog = this.x2;
        if (dialog != null) {
            waa waaVar = null;
            this.x2 = null;
            for (int i = 0; i < J0().getChildCount(); i++) {
                View childAt = J0().getChildAt(i);
                if ((childAt instanceof waa) && ((waa) childAt).getCurrentDialog() == dialog.id) {
                    waaVar = childAt;
                }
            }
            if (waaVar == null) {
                return;
            }
            yla ylaVar = this.w2;
            if (ylaVar != null) {
                ylaVar.d();
            }
            J0().setVisibility(0);
            no4 no4Var = this.t2;
            no4Var.setVisibility(0);
            l7 l7Var = no4Var.r;
            if (this.G2 || this.H2) {
                this.y2.I.v = true;
                l7Var.requestFocus();
                gl.F3(l7Var);
            }
            int[] iArr = new int[2];
            yla ylaVar2 = new yla(new ti4(1000.0f));
            zla zlaVar = new zla(0.0f);
            mu1 mu1Var = this.a2;
            if (mu1Var != null && mu1Var.b) {
                f = 10.0f;
            } else {
                f = 800.0f;
            }
            zlaVar.b(f);
            zlaVar.a(1.0f);
            ylaVar2.m = zlaVar;
            this.w2 = ylaVar2;
            ylaVar2.b(new n9a(this, waaVar, iArr, (byte) 0));
            this.w2.a(new zv0(this, (byte) 9));
            this.w2.h();
        }
    }

    public final void F0() {
        boolean z = false;
        if (this.f2 != null || this.j2[0] != null) {
            try {
                ((ClipboardManager) org.telegram.messenger.a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", I0()));
                jaa jaaVar = this.n2;
                if (jaaVar != null) {
                    jaaVar.H();
                } else if (this.b2 instanceof LaunchActivity) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f2;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z = true;
                    }
                    ((LaunchActivity) this.b2).H0(new p54((byte) 6, z));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    public final int H0() {
        v9a v9aVar = this.A1;
        if (v9aVar.getChildCount() != 0) {
            int i = 0;
            View childAt = v9aVar.getChildAt(0);
            y29 y29Var = (y29) v9aVar.G(childAt);
            if (y29Var != null) {
                int paddingTop = v9aVar.getPaddingTop();
                if (y29Var.c() == 0 && childAt.getTop() >= 0) {
                    i = childAt.getTop();
                }
                return paddingTop - i;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public void I() {
        super.I();
        z9a z9aVar = this.n1;
        if (z9aVar != null) {
            z9aVar.o();
        }
    }

    public final String I0() {
        String str;
        String str2;
        String[] strArr = this.j2;
        haa haaVar = this.R1;
        if (haaVar != null) {
            str2 = strArr[haaVar.e ? 1 : 0];
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
        wf2 wf2Var = this.Z1;
        if (wf2Var != null && wf2Var.a.q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", gl.n0(this.W1)).build().toString();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final o39 J0() {
        if (!this.G2 && !this.H2) {
            return this.A1;
        }
        return this.B1;
    }

    public final void K0(View view, int[] iArr, float f) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        o39 o39Var = this.z1;
        o39Var.setPivotX(width);
        o39Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f2 = 0.25f * f;
        float f3 = 0.75f + f2;
        o39Var.setScaleX(f3);
        o39Var.setScaleY(f3);
        o39Var.setAlpha(f);
        o39 J0 = J0();
        J0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        J0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f4 = f2 + 1.0f;
        J0.setScaleX(f4);
        J0.setScaleY(f4);
        float f5 = 1.0f - f;
        J0.setAlpha(f5);
        no4 no4Var = this.t2;
        no4Var.setPivotX(no4Var.getWidth() / 2.0f);
        no4Var.setPivotY(0.0f);
        float f6 = (0.1f * f5) + 0.9f;
        no4Var.setScaleX(f6);
        no4Var.setScaleY(f6);
        no4Var.setAlpha(f5);
        a aVar = this.u2;
        aVar.getBackButton().setTranslationX((-gl.L(16.0f)) * f5);
        aVar.getTitleTextView().setTranslationY(gl.L(16.0f) * f5);
        aVar.getSubtitleTextView().setTranslationY(gl.L(16.0f) * f5);
        aVar.setAlpha(f);
        o39Var.getLocationInWindow(iArr);
        float interpolation = s33.g.getInterpolation(f);
        for (int i = 0; i < J0.getChildCount(); i++) {
            View childAt = J0.getChildAt(i);
            if (childAt instanceof waa) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f5);
                }
            }
        }
        for (int i2 = 0; i2 < o39Var.getChildCount(); i2++) {
            View childAt2 = o39Var.getChildAt(i2);
            if (childAt2 instanceof cba) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((o39Var.getTranslationY() + y) - view.getY()))));
            }
        }
        this.b.requestLayout();
        J0.invalidate();
    }

    public final void N0(boolean z) {
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
        animatorSetArr[0].addListener(new eaa(this, z, (byte) 0));
        animatorSetArr[0].start();
    }

    public final void O0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        ArrayList l;
        paa paaVar;
        if (dialog instanceof laa) {
            M0(view);
        } else if (((view instanceof waa) && ((waa) view).G) || ((view instanceof rr8) && ((rr8) view).o0)) {
            S0(dialog.id, view);
        } else {
            o39 o39Var = this.z1;
            if (o39Var.getVisibility() == 8 && (activity = this.b2) != null) {
                boolean y = cf3.y(dialog.id);
                byte b = this.K1;
                if (y) {
                    TLRPC.Chat K0 = na7.q1(this.a).K0(Long.valueOf(-dialog.id));
                    if (hc2.T(K0) && !K0.megagroup) {
                        TLRPC.Chat K02 = na7.q1(this.a).K0(Long.valueOf(-dialog.id));
                        if ((!hc2.n(K02) && !K02.megagroup) || b == 2 || b == 3) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                            String M0 = k96.M0(2131745404, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            if (b == 3) {
                                if (hc2.P(10, K0)) {
                                    hdVar.U = k96.M0(2131751072, null);
                                } else {
                                    hdVar.U = k96.M0(2131751073, null);
                                }
                            } else if (b == 2) {
                                if (this.i2) {
                                    hdVar.U = k96.M0(2131746394, null);
                                } else if (hc2.P(10, K0)) {
                                    hdVar.U = k96.M0(2131751080, null);
                                } else {
                                    hdVar.U = k96.M0(2131751081, null);
                                }
                            } else {
                                hdVar.U = k96.M0(2131752428, null);
                            }
                            ug8.y(null, 2131747638, alertDialog$Builder, null);
                            return;
                        }
                    }
                } else if (cf3.B(dialog.id) && b != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String M02 = k96.M0(2131745404, null);
                    hd hdVar2 = alertDialog$Builder2.a;
                    hdVar2.S = M02;
                    if (b == 3) {
                        hdVar2.U = k96.M0(2131743849, null);
                    } else if (b != 0) {
                        hdVar2.U = k96.M0(2131746983, null);
                    } else {
                        hdVar2.U = k96.M0(2131748912, null);
                    }
                    ug8.y(null, 2131747638, alertDialog$Builder2, null);
                    return;
                }
                long j = dialog.id;
                vf6 vf6Var = this.P1;
                if (vf6Var.h(j) >= 0) {
                    vf6Var.l(dialog.id);
                    this.Q1.remove(dialog);
                    if (view instanceof rr8) {
                        ((rr8) view).y(false, true);
                    } else if (view instanceof waa) {
                        ((waa) view).b(false, true);
                    }
                    W0(1);
                } else {
                    TLRPC.User V1 = na7.q1(this.a).V1(Long.valueOf(dialog.id));
                    TLRPC.Chat K03 = na7.q1(this.a).K0(Long.valueOf(-dialog.id));
                    if ((l7c.v(V1) && (((l = na7.q1(this.a).g4.l(-V1.id)) != null && !l.isEmpty()) || !na7.q1(this.a).g4.e(-V1.id))) || (cf3.y(dialog.id) && (hc2.c0(K03) || (hc2.p0(K03) && hc2.A(this.a, K03, 24))))) {
                        this.x2 = dialog;
                        this.D1.g1(0, this.k2 - o39Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        caa caaVar = new caa(this, dialog, atomicReference, view);
                        atomicReference.set(new bm8(this, atomicReference, caaVar, dialog, (byte) 23));
                        kk7 f = kk7.f(this.a);
                        int i = kk7.s5;
                        f.a(caaVar, i);
                        ArrayList l2 = na7.q1(this.a).g4.l(-dialog.id);
                        int i2 = this.a;
                        if (l2 != null) {
                            caaVar.didReceivedNotification(i, i2, Long.valueOf(-dialog.id));
                            return;
                        }
                        na7.q1(i2).g4.o(-dialog.id);
                        gl.e3((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                    vf6Var.k(dialog, dialog.id);
                    if (view instanceof rr8) {
                        ((rr8) view).y(true, true);
                    } else if (view instanceof waa) {
                        ((waa) view).b(true, true);
                    }
                    W0(2);
                    long j2 = y6c.h(this.a).n;
                    if (this.G2) {
                        maa maaVar = this.F1;
                        vf6 vf6Var2 = maaVar.e;
                        ArrayList arrayList = maaVar.d;
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) vf6Var2.f(dialog.id);
                        if (dialog2 == null) {
                            maaVar.e.k(dialog, dialog.id);
                            arrayList.add(!arrayList.isEmpty(), dialog);
                        } else if (dialog2.id != j2) {
                            arrayList.remove(dialog2);
                            arrayList.add(!arrayList.isEmpty(), dialog2);
                        }
                        maaVar.f();
                        this.v2 = false;
                        no4 no4Var = this.t2;
                        no4Var.r.setText("");
                        D0(false);
                        gl.t1(no4Var.r);
                    }
                }
                qaa qaaVar = this.H1;
                if (qaaVar != null && (paaVar = qaaVar.I) != null) {
                    paaVar.l(0, paaVar.b());
                }
            }
        }
    }

    public final void P0(final boolean z) {
        int i;
        ?? r9;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            vf6 vf6Var = this.P1;
            int m = vf6Var.m();
            y9a y9aVar = this.m1;
            z9a z9aVar = this.n1;
            boolean z2 = true;
            if (i4 < m) {
                long j = vf6Var.j(i4);
                if (ij.h(getContext(), this.a, j, (y9aVar.getTag() == null || z9aVar.a.length() <= 0) ? false : false)) {
                    return;
                }
                i4++;
            } else {
                Editable text = z9aVar.getText();
                mt3 mt3Var = z9aVar.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList Y = hq6.d0(this.a).Y(charSequenceArr, true, true);
                wf2 wf2Var = this.Z1;
                if (wf2Var != null && wf2Var.a.q) {
                    i = this.W1;
                } else {
                    i = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.I1 != null) {
                    i2 = 0;
                    while (i3 < vf6Var.m()) {
                        long j2 = vf6Var.j(i3);
                        long K1 = na7.q1(this.a).K1(j2);
                        if (K1 <= 0) {
                            K1 = cf3.j(na7.q1(this.a).I2(j2));
                        }
                        if (y9aVar.getTag() != null && mt3Var.length() > 0 && K1 > 0) {
                            i2++;
                        }
                        int i5 = (K1 > 0L ? 1 : (K1 == 0L ? 0 : -1));
                        if (i5 > 0) {
                            i2++;
                        }
                        if (i5 > 0 && !arrayList.contains(Long.valueOf(j2))) {
                            arrayList.add(Long.valueOf(j2));
                        }
                        i3++;
                    }
                } else {
                    haa haaVar = this.R1;
                    if (haaVar != null) {
                        r9 = haaVar.e;
                    } else {
                        r9 = 0;
                    }
                    if (this.A2 != null) {
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < vf6Var.m()) {
                            long j3 = vf6Var.j(i6);
                            long K12 = na7.q1(this.a).K1(j3);
                            if (K12 <= 0) {
                                K12 = cf3.j(na7.q1(this.a).I2(j3));
                            }
                            int i8 = i3;
                            if (this.A2 != null && y9aVar.getTag() != null && mt3Var.length() > 0 && charSequenceArr[i8] != null && K12 > 0) {
                                i7++;
                            }
                            int i9 = (K12 > 0L ? 1 : (K12 == 0L ? 0 : -1));
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
                            for (int i11 = 0; i11 < vf6Var.m(); i11++) {
                                long j4 = vf6Var.j(i11);
                                long K13 = na7.q1(this.a).K1(j4);
                                if (K13 <= 0) {
                                    K13 = cf3.j(na7.q1(this.a).I2(j4));
                                }
                                if (y9aVar.getTag() != null && mt3Var.length() > 0 && K13 > 0) {
                                    i10++;
                                }
                                int i12 = (K13 > 0L ? 1 : (K13 == 0L ? 0 : -1));
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
                ij.Z(this.a, arrayList, i2, new p8c() {
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
                        k27 k27Var;
                        z9a z9aVar2;
                        long longValue;
                        String charSequence;
                        long longValue2;
                        Long l2;
                        String[] strArr;
                        boolean z5;
                        long j6;
                        int i16;
                        Long l3;
                        k27 k27Var2;
                        x3a b;
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
                        k27 k27Var3;
                        k27 k27Var4;
                        ArrayList arrayList3;
                        ?? r11;
                        long longValue4;
                        String charSequence3;
                        long longValue5;
                        HashMap hashMap2 = (HashMap) obj;
                        taa taaVar = taa.this;
                        String[] strArr2 = taaVar.J1;
                        y9a y9aVar2 = taaVar.m1;
                        z9a z9aVar3 = taaVar.n1;
                        HashMap hashMap3 = taaVar.Q1;
                        Long l6 = 0L;
                        vf6 vf6Var2 = taaVar.P1;
                        ArrayList arrayList4 = taaVar.I1;
                        CharSequence[] charSequenceArr3 = charSequenceArr;
                        ArrayList arrayList5 = Y;
                        boolean z8 = z;
                        if (arrayList4 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int i18 = 0;
                            boolean z9 = false;
                            while (true) {
                                if (i18 < vf6Var2.m()) {
                                    boolean z10 = z8;
                                    long j8 = vf6Var2.j(i18);
                                    boolean x2 = na7.q1(taaVar.a).x2(j8);
                                    y9a y9aVar3 = y9aVar2;
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
                                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap3.get(vf6Var2.f(j8));
                                    if (tL_forumTopic3 != null && x2) {
                                        i17 = i18;
                                        z7 = x2;
                                        j7 = cf3.n(tL_forumTopic3.from_id);
                                    } else {
                                        i17 = i18;
                                        z7 = x2;
                                        j7 = 0;
                                    }
                                    if (tL_forumTopic3 != null && !z7) {
                                        l5 = l6;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        k27Var3 = new k27(taaVar.a, tL_forumTopic3.topicStartMessage, false, false);
                                    } else {
                                        l5 = l6;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        k27Var3 = null;
                                    }
                                    if (k27Var3 != null) {
                                        k27Var3.p = true;
                                    }
                                    if (y9aVar3.getTag() != null && z9aVar3.a.length() > 0) {
                                        CharSequence charSequence4 = charSequenceArr2[0];
                                        if (charSequence4 == null) {
                                            charSequence3 = null;
                                        } else {
                                            charSequence3 = charSequence4.toString();
                                        }
                                        r11 = 0;
                                        k27Var4 = k27Var3;
                                        ArrayList arrayList7 = arrayList5;
                                        x3a b2 = x3a.b(charSequence3, j8, k27Var4, k27Var3, null, true, arrayList7, null, null, z10, 0, 0, null, false);
                                        arrayList3 = arrayList7;
                                        z10 = z10;
                                        if (l7 == null) {
                                            longValue5 = 0;
                                        } else {
                                            longValue5 = l7.longValue();
                                        }
                                        b2.Q = longValue5;
                                        b2.R = j7;
                                        z3a.B(taaVar.a).q0(b2);
                                    } else {
                                        k27Var4 = k27Var3;
                                        arrayList3 = arrayList5;
                                        r11 = 0;
                                    }
                                    z3a B = z3a.B(taaVar.a);
                                    k27 k27Var5 = k27Var4;
                                    ArrayList arrayList8 = taaVar.I1;
                                    boolean z11 = !taaVar.D2;
                                    if (l7 == null) {
                                        longValue4 = 0;
                                    } else {
                                        longValue4 = l7.longValue();
                                    }
                                    boolean z12 = z10;
                                    int p0 = B.p0(arrayList8, j8, z11, false, z12, 0, 0, k27Var5, i13, longValue4, j7, null);
                                    if (p0 != 0) {
                                        arrayList6.add(Long.valueOf(j8));
                                    }
                                    if (vf6Var2.m() == 1) {
                                        ij.q0(p0, r11, taaVar.a2);
                                        if (p0 != 0) {
                                            z9 = z6;
                                            tL_forumTopic = r11;
                                            break;
                                        }
                                    }
                                    i18 = i17 + 1;
                                    arrayList5 = arrayList3;
                                    z8 = z12;
                                    y9aVar2 = y9aVar3;
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
                                TLRPC.Dialog dialog = (TLRPC.Dialog) vf6Var2.f(longValue6);
                                vf6Var2.l(longValue6);
                                if (dialog != null) {
                                    hashMap3.remove(dialog);
                                }
                            }
                            if (!vf6Var2.i()) {
                                int size2 = arrayList2.size();
                                if (vf6Var2.m() == 1) {
                                    tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap3.get(vf6Var2.n(0));
                                } else {
                                    tL_forumTopic2 = tL_forumTopic;
                                }
                                taaVar.L0(vf6Var2, size2, tL_forumTopic2, !z9);
                            }
                        } else {
                            boolean z13 = z8;
                            haa haaVar2 = taaVar.R1;
                            if (haaVar2 != null) {
                                r12 = haaVar2.e;
                            } else {
                                r12 = 0;
                            }
                            if (taaVar.A2 != null) {
                                int i20 = 0;
                                boolean z14 = false;
                                while (i20 < vf6Var2.m()) {
                                    long j9 = vf6Var2.j(i20);
                                    boolean x22 = na7.q1(taaVar.a).x2(j9);
                                    if (hashMap2 == null) {
                                        l2 = l6;
                                    } else {
                                        l2 = (Long) hashMap2.get(Long.valueOf(j9));
                                    }
                                    if (l2 != null && l2.longValue() > 0) {
                                        z14 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap3.get(vf6Var2.f(j9));
                                    if (tL_forumTopic4 != null && x22) {
                                        strArr = strArr2;
                                        z5 = z14;
                                        j6 = cf3.n(tL_forumTopic4.from_id);
                                    } else {
                                        strArr = strArr2;
                                        z5 = z14;
                                        j6 = 0;
                                    }
                                    if (tL_forumTopic4 != null && !x22) {
                                        i16 = i20;
                                        l3 = l2;
                                        k27Var2 = new k27(taaVar.a, tL_forumTopic4.topicStartMessage, false, false);
                                    } else {
                                        i16 = i20;
                                        l3 = l2;
                                        k27Var2 = null;
                                    }
                                    if (taaVar.A2 == null) {
                                        if (y9aVar2.getTag() != null && z9aVar3.a.length() > 0) {
                                            CharSequence charSequence5 = charSequenceArr3[0];
                                            if (charSequence5 == null) {
                                                charSequence2 = null;
                                            } else {
                                                charSequence2 = charSequence5.toString();
                                            }
                                            boolean z15 = z13;
                                            b = x3a.b(charSequence2, j9, k27Var2, k27Var2, null, true, arrayList5, null, null, z15, 0, 0, null, false);
                                            z13 = z15;
                                        } else {
                                            b = x3a.b(strArr[r12], j9, k27Var2, k27Var2, null, true, null, null, null, z13, 0, 0, null, false);
                                        }
                                    } else {
                                        if (y9aVar2.getTag() != null && z9aVar3.a.length() > 0 && charSequenceArr3[0] != null) {
                                            k27 k27Var6 = k27Var2;
                                            k27Var2 = k27Var6;
                                            z3a.B(taaVar.a).q0(x3a.b(charSequenceArr3[0].toString(), j9, null, k27Var6, null, true, null, null, null, z13, 0, 0, null, false));
                                        }
                                        b = x3a.b(null, j9, k27Var2, k27Var2, null, true, null, null, null, z13, 0, 0, null, false);
                                        b.I = taaVar.A2;
                                    }
                                    if (l3 == null) {
                                        longValue3 = 0;
                                    } else {
                                        longValue3 = l3.longValue();
                                    }
                                    b.Q = longValue3;
                                    b.R = j6;
                                    z3a.B(taaVar.a).q0(b);
                                    i20 = i16 + 1;
                                    z14 = z5;
                                    strArr2 = strArr;
                                }
                                z3 = z14;
                            } else if (strArr2[r12] != null) {
                                int i21 = 0;
                                boolean z16 = false;
                                while (i21 < vf6Var2.m()) {
                                    long j10 = vf6Var2.j(i21);
                                    boolean x23 = na7.q1(taaVar.a).x2(j10);
                                    if (hashMap2 == null) {
                                        l = l6;
                                    } else {
                                        l = (Long) hashMap2.get(Long.valueOf(j10));
                                    }
                                    if (l != null && l.longValue() > 0) {
                                        z16 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic5 = (TLRPC.TL_forumTopic) hashMap3.get(vf6Var2.f(j10));
                                    if (tL_forumTopic5 != null && x23) {
                                        i15 = i21;
                                        hashMap = hashMap2;
                                        j5 = cf3.n(tL_forumTopic5.from_id);
                                    } else {
                                        i15 = i21;
                                        hashMap = hashMap2;
                                        j5 = 0;
                                    }
                                    if (tL_forumTopic5 != null && !x23) {
                                        z4 = z16;
                                        c = 0;
                                        k27Var = new k27(taaVar.a, tL_forumTopic5.topicStartMessage, false, false);
                                    } else {
                                        z4 = z16;
                                        c = 0;
                                        k27Var = null;
                                    }
                                    if (y9aVar2.getTag() != null && z9aVar3.a.length() > 0) {
                                        CharSequence charSequence6 = charSequenceArr3[c];
                                        if (charSequence6 == null) {
                                            charSequence = null;
                                        } else {
                                            charSequence = charSequence6.toString();
                                        }
                                        boolean z17 = z13;
                                        x3a b3 = x3a.b(charSequence, j10, k27Var, k27Var, null, true, arrayList5, null, null, z17, 0, 0, null, false);
                                        z13 = z17;
                                        if (l == null) {
                                            z9aVar2 = z9aVar3;
                                            longValue2 = 0;
                                        } else {
                                            z9aVar2 = z9aVar3;
                                            longValue2 = l.longValue();
                                        }
                                        b3.Q = longValue2;
                                        b3.R = j5;
                                        z3a.B(taaVar.a).q0(b3);
                                    } else {
                                        z9aVar2 = z9aVar3;
                                    }
                                    k27 k27Var7 = k27Var;
                                    x3a b4 = x3a.b(strArr2[r12], j10, k27Var7, k27Var7, null, true, null, null, null, z13, 0, 0, null, false);
                                    if (l == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l.longValue();
                                    }
                                    b4.Q = longValue;
                                    b4.R = j5;
                                    z3a.B(taaVar.a).q0(b4);
                                    i21 = i15 + 1;
                                    z16 = z4;
                                    z9aVar3 = z9aVar2;
                                    hashMap2 = hashMap;
                                }
                                z3 = z16;
                            } else {
                                i14 = 0;
                                z3 = false;
                                taaVar.L0(vf6Var2, 1, (TLRPC.TL_forumTopic) hashMap3.get(vf6Var2.n(i14)), !z3);
                            }
                            i14 = 0;
                            taaVar.L0(vf6Var2, 1, (TLRPC.TL_forumTopic) hashMap3.get(vf6Var2.n(i14)), !z3);
                        }
                        jaa jaaVar = taaVar.n2;
                        if (jaaVar != null) {
                            jaaVar.x();
                        }
                        taaVar.dismiss();
                    }
                });
                return;
            }
        }
    }

    @Override
    public final int Q() {
        return this.b.getMeasuredHeight() - this.S1;
    }

    public final void R0(boolean z) {
        boolean z2;
        Integer num;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        y9a y9aVar = this.m1;
        if (y9aVar.getTag() != null) {
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
        y9aVar.setTag(num);
        z9a z9aVar = this.n1;
        if (z9aVar.getEditText().isFocused()) {
            gl.t1(z9aVar.getEditText());
        }
        z9aVar.k(true);
        FrameLayout frameLayout = this.X1;
        y9a y9aVar2 = this.p1;
        FrameLayout frameLayout2 = this.q1;
        if (z) {
            y9aVar.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            y9aVar2.setVisibility(0);
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
            WeakHashMap weakHashMap = jdc.a;
            frameLayout2.setImportantForAccessibility(i);
        }
        LinearLayout linearLayout = this.x1;
        if (linearLayout != null) {
            if (!z) {
                i2 = 1;
            }
            WeakHashMap weakHashMap2 = jdc.a;
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
        arrayList.add(ObjectAnimator.ofFloat(y9aVar, property, f));
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
        arrayList.add(ObjectAnimator.ofFloat(y9aVar2, property2, f2));
        Property property3 = View.SCALE_Y;
        if (z) {
            f8 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(y9aVar2, property3, f8));
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(y9aVar2, property, f3));
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
                f6 = gl.L(f4);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f6));
        }
        this.y1.playTogether(arrayList);
        this.y1.setInterpolator(new DecelerateInterpolator());
        this.y1.setDuration(180L);
        this.y1.addListener(new eaa(this, z, (byte) 1));
        this.y1.start();
    }

    public final void S0(long j, View view) {
        String str;
        m21 K;
        int i = -this.C2;
        this.C2 = i;
        gl.B3(i, view, null);
        pw0.APP_ERROR.a();
        if (j >= 0) {
            str = l7c.q(na7.q1(this.a).V1(Long.valueOf(j)));
        } else {
            str = "";
        }
        boolean E3 = na7.q1(this.a).E3();
        wjb wjbVar = this.J0;
        FrameLayout frameLayout = this.v1;
        if (E3) {
            K = new u21(frameLayout, wjbVar).Q(2131624212, 36, gl.T2(k96.a0(null, null, 2131743521, str)));
        } else {
            K = new u21(frameLayout, wjbVar).K(2131624212, gl.T2(k96.a0(null, null, 2131743521, str)), k96.M0(2131743520, null), new q9a(this, (byte) 1));
        }
        K.j();
    }

    public final void T0() {
        gb gbVar;
        y9a y9aVar = this.m1;
        if (y9aVar == null) {
            return;
        }
        z9a z9aVar = this.n1;
        if (z9aVar != null && z9aVar.m()) {
            z9aVar.getEmojiPaddingShown();
        } else {
            gaa gaaVar = this.y2;
            if (gaaVar != null && (gbVar = gaaVar.I) != null && !gbVar.f) {
                Typeface typeface = gl.a;
            }
        }
        float f = 0.0f;
        FrameLayout frameLayout = this.X1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f = 0.0f + gl.L(48.0f);
        }
        FrameLayout frameLayout2 = this.q1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f);
        }
        float f2 = -f;
        y9aVar.setTranslationY(f2);
        this.p1.setTranslationY(f2);
    }

    public final void U0() {
        v9a v9aVar;
        int i;
        int i2;
        if (!this.m2) {
            boolean z = this.G2;
            v9a v9aVar2 = this.A1;
            v9a v9aVar3 = this.B1;
            if (z) {
                v9aVar = v9aVar3;
            } else {
                v9aVar = v9aVar2;
            }
            if (v9aVar.getChildCount() > 0) {
                View childAt = v9aVar.getChildAt(0);
                for (int i3 = 0; i3 < v9aVar.getChildCount(); i3++) {
                    if (v9aVar.getChildAt(i3).getTop() < childAt.getTop()) {
                        childAt = v9aVar.getChildAt(i3);
                    }
                }
                y29 y29Var = (y29) v9aVar.G(childAt);
                int top = childAt.getTop() - gl.L(8.0f);
                if (top > 0 && y29Var != null && y29Var.b() == 0) {
                    i = top;
                } else {
                    i = 0;
                }
                if (top >= 0 && y29Var != null && y29Var.b() == 0) {
                    this.F2 = childAt.getTop();
                    N0(false);
                } else {
                    this.F2 = Integer.MAX_VALUE;
                    N0(true);
                    top = i;
                }
                o39 o39Var = this.z1;
                if (o39Var.getVisibility() == 0) {
                    if (o39Var.getChildCount() > 0) {
                        View childAt2 = o39Var.getChildAt(0);
                        for (int i4 = 0; i4 < o39Var.getChildCount(); i4++) {
                            if (o39Var.getChildAt(i4).getTop() < childAt2.getTop()) {
                                childAt2 = o39Var.getChildAt(i4);
                            }
                        }
                        y29 y29Var2 = (y29) o39Var.G(childAt2);
                        int top2 = childAt2.getTop() - gl.L(8.0f);
                        if (top2 > 0 && y29Var2 != null && y29Var2.b() == 0) {
                            i2 = top2;
                        } else {
                            i2 = 0;
                        }
                        if (top2 >= 0 && y29Var2 != null && y29Var2.b() == 0) {
                            this.F2 = childAt2.getTop();
                            N0(false);
                        } else {
                            this.F2 = Integer.MAX_VALUE;
                            N0(true);
                            top2 = i2;
                        }
                        top = gl.U1(o39Var.getAlpha(), top, top2);
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
                    v9aVar2.setTopGlowOffset(i6);
                    int i7 = (int) (this.o2 + f);
                    this.k2 = i7;
                    v9aVar3.setTopGlowOffset(i7);
                    int i8 = (int) (f + this.o2);
                    this.k2 = i8;
                    o39Var.setTopGlowOffset(i8);
                    this.l1.setTranslationY(this.k2 + this.o2);
                    this.L1.setTranslationY(this.k2 + this.o2);
                    this.b.invalidate();
                }
            }
        }
    }

    public final void V0() {
        jia jiaVar = this.u1;
        if (jiaVar != null) {
            String I0 = I0();
            if (I0.startsWith("https://")) {
                I0 = I0.substring(8);
            } else if (I0.startsWith("http://")) {
                I0 = I0.substring(7);
            }
            jiaVar.l(I0, false);
        }
    }

    public final void W0(int i) {
        int size;
        boolean z;
        boolean z2;
        vf6 vf6Var = this.P1;
        if (vf6Var.m() == 0) {
            R0(false);
            return;
        }
        ArrayList arrayList = this.I1;
        if (arrayList == null) {
            size = 1;
        } else {
            size = arrayList.size();
        }
        Object tag = this.m1.getTag();
        z9a z9aVar = this.n1;
        if (tag != null && z9aVar.a.length() > 0) {
            size++;
        }
        long j = 0;
        for (int i2 = 0; i2 < vf6Var.m(); i2++) {
            long j2 = ((TLRPC.Dialog) vf6Var.n(i2)).id;
            long K1 = na7.q1(this.a).K1(j2);
            if (K1 <= 0) {
                K1 = cf3.j(na7.q1(this.a).I2(j2));
            }
            j += K1;
        }
        int max = Math.max(1, vf6Var.m());
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        jh3 jh3Var = this.o1;
        jh3Var.f(max, z);
        if (i != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        jh3Var.i(size, j, z2);
        R0(true);
        z9aVar.setPadding(0, 0, Math.max(gl.L(84.0f), jh3Var.l()), 0);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.r;
        if (i == i3) {
            maa maaVar = this.F1;
            if (maaVar != null) {
                maaVar.E();
            }
            kk7.f(this.a).n(this, i3);
        }
    }

    @Override
    public final void dismiss() {
        z9a z9aVar = this.n1;
        if (z9aVar != null) {
            gl.t1(z9aVar.getEditText());
        }
        this.T1 = false;
        super.dismiss();
        kk7.f(this.a).n(this, kk7.r);
    }

    @Override
    public final void onBackPressed() {
        if (this.x2 != null) {
            E0();
            return;
        }
        z9a z9aVar = this.n1;
        if (z9aVar != null && z9aVar.e) {
            z9aVar.k(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void p0() {
        boolean z;
        try {
            super.p0();
            ix4 ix4Var = this.K2;
            if (ix4Var != null) {
                ix4Var.a(bkb.v0(bkb.c6, this.J0));
            }
            ww0 ww0Var = this.c;
            if (ww0Var != null) {
                if (gl.B(bkb.v0(bkb.g5, this.J0)) > 0.721f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != this.S2) {
                    this.S2 = z;
                    gl.k3(ww0Var, z);
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public void M0(View view) {
    }

    public void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
    }

    public taa(Context context, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2) {
        this(context, null, arrayList, str, str2, z, str3, str4, false, z2, false, null, null);
    }

    public taa(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2, wjb wjbVar) {
        this(context, null, arrayList, str, null, z, str2, null, z2, false, false, null, wjbVar);
    }
}
