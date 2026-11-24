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
public class tca extends my0 implements jm7 {
    public static final int T2 = 0;
    public final vba A1;
    public TL_stories.StoryItem A2;
    public final vba B1;
    public iq5 B2;
    public final q55 C1;
    public int C2;
    public final q55 D1;
    public boolean D2;
    public final vd4 E1;
    public m8 E2;
    public final mca F1;
    public int F2;
    public final rca G1;
    public boolean G2;
    public final qca H1;
    public boolean H2;
    public final ArrayList I1;
    public int I2;
    public final String[] J1;
    public final mr3 J2;
    public final byte K1;
    public final kz4 K2;
    public final a1b L1;
    public final km0 L2;
    public final Drawable M1;
    public final km0 M2;
    public final View[] N1;
    public final km0 N2;
    public final AnimatorSet[] O1;
    public final ms0 O2;
    public final vh6 P1;
    public final im0 P2;
    public final HashMap Q1;
    public final qm0 Q2;
    public final hca R1;
    public final im0 R2;
    public int S1;
    public boolean S2;
    public boolean T1;
    public final boolean U1;
    public boolean V1;
    public final int W1;
    public final FrameLayout X1;
    public final LinearLayout Y1;
    public final jh2 Z1;
    public final yv1 a2;
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
    public final yba m1;
    public boolean m2;
    public final zba n1;
    public jca n2;
    public final vi3 o1;
    public float o2;
    public final yba p1;
    public float p2;
    public final FrameLayout q1;
    public float q2;
    public float r1;
    public ValueAnimator r2;
    public final xd9 s1;
    public final w49 s2;
    public final FrameLayout t1;
    public final oq4 t2;
    public final lka u1;
    public final a u2;
    public final FrameLayout v1;
    public boolean v2;
    public final FrameLayout w1;
    public zna w2;
    public final LinearLayout x1;
    public TLRPC.Dialog x2;
    public AnimatorSet y1;
    public final gca y2;
    public final r59 z1;
    public ArrayList z2;

    public tca(android.content.Context r34, defpackage.yv1 r35, java.util.ArrayList r36, java.lang.String r37, java.lang.String r38, boolean r39, java.lang.String r40, java.lang.String r41, boolean r42, boolean r43, boolean r44, java.lang.Integer r45, defpackage.ylb r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tca.<init>(android.content.Context, yv1, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, ylb):void");
    }

    public static tca G0(Context context, k47 k47Var, String str, boolean z, String str2) {
        ArrayList arrayList;
        if (k47Var != null) {
            arrayList = td4.u(k47Var);
        } else {
            arrayList = null;
        }
        return new tca(context, arrayList, str, null, z, str2, null, false);
    }

    public static void Q0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i, ylb ylbVar) {
        int i2;
        int v0 = cmb.v0(i, ylbVar);
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
            anb.R(childAt, cmb.Y(v0, i2, i4), null, anb.M(i), ylbVar);
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void D0(boolean z) {
        oq4 oq4Var = this.t2;
        l7 l7Var = oq4Var.r;
        l7 l7Var2 = oq4Var.r;
        boolean isEmpty = TextUtils.isEmpty(l7Var.getText());
        vba vbaVar = this.A1;
        vba vbaVar2 = this.B1;
        boolean z2 = true;
        if (isEmpty && ((!this.d || !l7Var2.hasFocus()) && !this.H2)) {
            if (this.x2 == null) {
                gm.T3(vbaVar, true, 0.98f, true, true);
                gm.R3(vbaVar2, false);
            }
            z2 = false;
        } else {
            this.v2 = true;
            if (this.x2 == null) {
                gm.T3(vbaVar, false, 0.98f, true, true);
                gm.R3(vbaVar2, true);
            }
        }
        if (this.G2 == z2 && !z) {
            return;
        }
        this.G2 = z2;
        qca qcaVar = this.H1;
        qcaVar.f();
        this.F1.f();
        boolean z3 = this.G2;
        int i = this.F2;
        if (z3) {
            if (i == Integer.MAX_VALUE) {
                ((u46) vbaVar2.getLayoutManager()).g1(0, -vbaVar2.getPaddingTop());
            } else {
                ((u46) vbaVar2.getLayoutManager()).g1(0, this.F2 - vbaVar2.getPaddingTop());
            }
            qcaVar.E(l7Var2.getText().toString());
            return;
        }
        q55 q55Var = this.C1;
        if (i == Integer.MAX_VALUE) {
            q55Var.g1(0, 0);
        } else {
            q55Var.g1(0, 0);
        }
    }

    public final void E0() {
        float f;
        TLRPC.Dialog dialog = this.x2;
        if (dialog != null) {
            wca wcaVar = null;
            this.x2 = null;
            for (int i = 0; i < J0().getChildCount(); i++) {
                View childAt = J0().getChildAt(i);
                if ((childAt instanceof wca) && ((wca) childAt).getCurrentDialog() == dialog.id) {
                    wcaVar = childAt;
                }
            }
            if (wcaVar == null) {
                return;
            }
            zna znaVar = this.w2;
            if (znaVar != null) {
                znaVar.d();
            }
            J0().setVisibility(0);
            oq4 oq4Var = this.t2;
            oq4Var.setVisibility(0);
            l7 l7Var = oq4Var.r;
            if (this.G2 || this.H2) {
                this.y2.I.v = true;
                l7Var.requestFocus();
                gm.E3(l7Var);
            }
            int[] iArr = new int[2];
            zna znaVar2 = new zna(new xk4(1000.0f));
            aoa aoaVar = new aoa(0.0f);
            yv1 yv1Var = this.a2;
            if (yv1Var != null && yv1Var.b) {
                f = 10.0f;
            } else {
                f = 800.0f;
            }
            aoaVar.b(f);
            aoaVar.a(1.0f);
            znaVar2.m = aoaVar;
            this.w2 = znaVar2;
            znaVar2.b(new nba(this, wcaVar, iArr, (byte) 0));
            this.w2.a(new hx0(this, (byte) 9));
            this.w2.h();
        }
    }

    public final void F0() {
        boolean z = false;
        if (this.f2 != null || this.j2[0] != null) {
            try {
                ((ClipboardManager) org.telegram.messenger.a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", I0()));
                jca jcaVar = this.n2;
                if ((jcaVar == null || !jcaVar.F()) && (this.b2 instanceof LaunchActivity)) {
                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f2;
                    if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                        z = true;
                    }
                    ((LaunchActivity) this.b2).H0(new z64((byte) 6, z));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public void H() {
        super.H();
        zba zbaVar = this.n1;
        if (zbaVar != null) {
            zbaVar.o();
        }
    }

    public final int H0() {
        vba vbaVar = this.A1;
        if (vbaVar.getChildCount() != 0) {
            int i = 0;
            View childAt = vbaVar.getChildAt(0);
            b59 b59Var = (b59) vbaVar.G(childAt);
            if (b59Var != null) {
                int paddingTop = vbaVar.getPaddingTop();
                if (b59Var.c() == 0 && childAt.getTop() >= 0) {
                    i = childAt.getTop();
                }
                return paddingTop - i;
            }
            return -1000;
        }
        return -1000;
    }

    public final String I0() {
        String str;
        String str2;
        String[] strArr = this.j2;
        hca hcaVar = this.R1;
        if (hcaVar != null) {
            str2 = strArr[hcaVar.e ? 1 : 0];
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
        jh2 jh2Var = this.Z1;
        if (jh2Var != null && jh2Var.a.q) {
            try {
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("t", gm.n0(this.W1)).build().toString();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final r59 J0() {
        if (!this.G2 && !this.H2) {
            return this.A1;
        }
        return this.B1;
    }

    public final void K0(View view, int[] iArr, float f) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        r59 r59Var = this.z1;
        r59Var.setPivotX(width);
        r59Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f2 = 0.25f * f;
        float f3 = 0.75f + f2;
        r59Var.setScaleX(f3);
        r59Var.setScaleY(f3);
        r59Var.setAlpha(f);
        r59 J0 = J0();
        J0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        J0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f4 = f2 + 1.0f;
        J0.setScaleX(f4);
        J0.setScaleY(f4);
        float f5 = 1.0f - f;
        J0.setAlpha(f5);
        oq4 oq4Var = this.t2;
        oq4Var.setPivotX(oq4Var.getWidth() / 2.0f);
        oq4Var.setPivotY(0.0f);
        float f6 = (0.1f * f5) + 0.9f;
        oq4Var.setScaleX(f6);
        oq4Var.setScaleY(f6);
        oq4Var.setAlpha(f5);
        a aVar = this.u2;
        aVar.getBackButton().setTranslationX((-gm.L(16.0f)) * f5);
        aVar.getTitleTextView().setTranslationY(gm.L(16.0f) * f5);
        aVar.getSubtitleTextView().setTranslationY(gm.L(16.0f) * f5);
        aVar.setAlpha(f);
        r59Var.getLocationInWindow(iArr);
        float interpolation = d53.g.getInterpolation(f);
        for (int i = 0; i < J0.getChildCount(); i++) {
            View childAt = J0.getChildAt(i);
            if (childAt instanceof wca) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f5);
                }
            }
        }
        for (int i2 = 0; i2 < r59Var.getChildCount(); i2++) {
            View childAt2 = r59Var.getChildAt(i2);
            if (childAt2 instanceof cda) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                float y = childAt2.getY();
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((r59Var.getTranslationY() + y) - view.getY()))));
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
        animatorSetArr[0].addListener(new eca(this, z, (byte) 0));
        animatorSetArr[0].start();
    }

    public final void O0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        ArrayList l;
        pca pcaVar;
        if (dialog instanceof lca) {
            M0(view);
        } else if (((view instanceof wca) && ((wca) view).G) || ((view instanceof ut8) && ((ut8) view).o0)) {
            S0(dialog.id, view);
        } else {
            r59 r59Var = this.z1;
            if (r59Var.getVisibility() == 8 && (activity = this.b2) != null) {
                boolean y = pg3.y(dialog.id);
                byte b = this.K1;
                if (y) {
                    TLRPC.Chat L0 = oc7.r1(this.a).L0(Long.valueOf(-dialog.id));
                    if (sd2.T(L0) && !L0.megagroup) {
                        TLRPC.Chat L02 = oc7.r1(this.a).L0(Long.valueOf(-dialog.id));
                        if ((!sd2.n(L02) && !L02.megagroup) || b == 2 || b == 3) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                            String M0 = jb6.M0(2131745330, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            if (b == 3) {
                                if (sd2.P(10, L0)) {
                                    heVar.U = jb6.M0(2131751021, null);
                                } else {
                                    heVar.U = jb6.M0(2131751022, null);
                                }
                            } else if (b == 2) {
                                if (this.i2) {
                                    heVar.U = jb6.M0(2131746320, null);
                                } else if (sd2.P(10, L0)) {
                                    heVar.U = jb6.M0(2131751029, null);
                                } else {
                                    heVar.U = jb6.M0(2131751030, null);
                                }
                            } else {
                                heVar.U = jb6.M0(2131752386, null);
                            }
                            wi8.y(null, 2131747564, alertDialog$Builder, null);
                            return;
                        }
                    }
                } else if (pg3.B(dialog.id) && b != 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
                    String M02 = jb6.M0(2131745330, null);
                    he heVar2 = alertDialog$Builder2.a;
                    heVar2.S = M02;
                    if (b == 3) {
                        heVar2.U = jb6.M0(2131743775, null);
                    } else if (b != 0) {
                        heVar2.U = jb6.M0(2131746909, null);
                    } else {
                        heVar2.U = jb6.M0(2131748861, null);
                    }
                    wi8.y(null, 2131747564, alertDialog$Builder2, null);
                    return;
                }
                long j = dialog.id;
                vh6 vh6Var = this.P1;
                if (vh6Var.h(j) >= 0) {
                    vh6Var.l(dialog.id);
                    this.Q1.remove(dialog);
                    if (view instanceof ut8) {
                        ((ut8) view).w(false, true);
                    } else if (view instanceof wca) {
                        ((wca) view).b(false, true);
                    }
                    W0(1);
                } else {
                    TLRPC.User W1 = oc7.r1(this.a).W1(Long.valueOf(dialog.id));
                    TLRPC.Chat L03 = oc7.r1(this.a).L0(Long.valueOf(-dialog.id));
                    if ((m9c.w(W1) && (((l = oc7.r1(this.a).g4.l(-W1.id)) != null && !l.isEmpty()) || !oc7.r1(this.a).g4.e(-W1.id))) || (pg3.y(dialog.id) && (sd2.c0(L03) || (sd2.p0(L03) && sd2.A(this.a, L03, 24))))) {
                        this.x2 = dialog;
                        this.D1.g1(0, this.k2 - r59Var.getPaddingTop());
                        AtomicReference atomicReference = new AtomicReference();
                        cca ccaVar = new cca(this, dialog, atomicReference, view);
                        atomicReference.set(new no8(this, atomicReference, ccaVar, dialog, (byte) 23));
                        nm7 f = nm7.f(this.a);
                        int i = nm7.u5;
                        f.a(ccaVar, i);
                        ArrayList l2 = oc7.r1(this.a).g4.l(-dialog.id);
                        int i2 = this.a;
                        if (l2 != null) {
                            ccaVar.didReceivedNotification(i, i2, Long.valueOf(-dialog.id));
                            return;
                        }
                        oc7.r1(i2).g4.o(-dialog.id);
                        gm.d3((Runnable) atomicReference.get(), 300L);
                        return;
                    }
                    vh6Var.k(dialog, dialog.id);
                    if (view instanceof ut8) {
                        ((ut8) view).w(true, true);
                    } else if (view instanceof wca) {
                        ((wca) view).b(true, true);
                    }
                    W0(2);
                    long j2 = z8c.h(this.a).n;
                    if (this.G2) {
                        mca mcaVar = this.F1;
                        vh6 vh6Var2 = mcaVar.e;
                        ArrayList arrayList = mcaVar.d;
                        TLRPC.Dialog dialog2 = (TLRPC.Dialog) vh6Var2.f(dialog.id);
                        if (dialog2 == null) {
                            mcaVar.e.k(dialog, dialog.id);
                            arrayList.add(!arrayList.isEmpty(), dialog);
                        } else if (dialog2.id != j2) {
                            arrayList.remove(dialog2);
                            arrayList.add(!arrayList.isEmpty(), dialog2);
                        }
                        mcaVar.f();
                        this.v2 = false;
                        oq4 oq4Var = this.t2;
                        oq4Var.r.setText("");
                        D0(false);
                        gm.t1(oq4Var.r);
                    }
                }
                qca qcaVar = this.H1;
                if (qcaVar != null && (pcaVar = qcaVar.I) != null) {
                    pcaVar.l(0, pcaVar.b());
                }
            }
        }
    }

    @Override
    public final int P() {
        return this.b.getMeasuredHeight() - this.S1;
    }

    public final void P0(final boolean z) {
        int i;
        ?? r9;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            vh6 vh6Var = this.P1;
            int m = vh6Var.m();
            yba ybaVar = this.m1;
            zba zbaVar = this.n1;
            boolean z2 = true;
            if (i4 < m) {
                long j = vh6Var.j(i4);
                if (ik.h(getContext(), this.a, j, (ybaVar.getTag() == null || zbaVar.a.length() <= 0) ? false : false)) {
                    return;
                }
                i4++;
            } else {
                Editable text = zbaVar.getText();
                wu3 wu3Var = zbaVar.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList Y = hs6.d0(this.a).Y(charSequenceArr, true, true);
                jh2 jh2Var = this.Z1;
                if (jh2Var != null && jh2Var.a.q) {
                    i = this.W1;
                } else {
                    i = -1;
                }
                ArrayList arrayList = new ArrayList();
                if (this.I1 != null) {
                    i2 = 0;
                    while (i3 < vh6Var.m()) {
                        long j2 = vh6Var.j(i3);
                        long L1 = oc7.r1(this.a).L1(j2);
                        if (L1 <= 0) {
                            L1 = pg3.j(oc7.r1(this.a).L2(j2));
                        }
                        if (ybaVar.getTag() != null && wu3Var.length() > 0 && L1 > 0) {
                            i2++;
                        }
                        int i5 = (L1 > 0L ? 1 : (L1 == 0L ? 0 : -1));
                        if (i5 > 0) {
                            i2++;
                        }
                        if (i5 > 0 && !arrayList.contains(Long.valueOf(j2))) {
                            arrayList.add(Long.valueOf(j2));
                        }
                        i3++;
                    }
                } else {
                    hca hcaVar = this.R1;
                    if (hcaVar != null) {
                        r9 = hcaVar.e;
                    } else {
                        r9 = 0;
                    }
                    if (this.A2 != null) {
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < vh6Var.m()) {
                            long j3 = vh6Var.j(i6);
                            long L12 = oc7.r1(this.a).L1(j3);
                            if (L12 <= 0) {
                                L12 = pg3.j(oc7.r1(this.a).L2(j3));
                            }
                            int i8 = i3;
                            if (this.A2 != null && ybaVar.getTag() != null && wu3Var.length() > 0 && charSequenceArr[i8] != null && L12 > 0) {
                                i7++;
                            }
                            int i9 = (L12 > 0L ? 1 : (L12 == 0L ? 0 : -1));
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
                            for (int i11 = 0; i11 < vh6Var.m(); i11++) {
                                long j4 = vh6Var.j(i11);
                                long L13 = oc7.r1(this.a).L1(j4);
                                if (L13 <= 0) {
                                    L13 = pg3.j(oc7.r1(this.a).L2(j4));
                                }
                                if (ybaVar.getTag() != null && wu3Var.length() > 0 && L13 > 0) {
                                    i10++;
                                }
                                int i12 = (L13 > 0L ? 1 : (L13 == 0L ? 0 : -1));
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
                ik.Z(this.a, arrayList, i2, new qac() {
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
                        k47 k47Var;
                        zba zbaVar2;
                        long longValue;
                        String charSequence;
                        long longValue2;
                        Long l2;
                        String[] strArr;
                        boolean z5;
                        long j6;
                        int i16;
                        Long l3;
                        k47 k47Var2;
                        y5a b;
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
                        k47 k47Var3;
                        k47 k47Var4;
                        ArrayList arrayList3;
                        ?? r11;
                        long longValue4;
                        String charSequence3;
                        long longValue5;
                        HashMap hashMap2 = (HashMap) obj;
                        tca tcaVar = tca.this;
                        String[] strArr2 = tcaVar.J1;
                        yba ybaVar2 = tcaVar.m1;
                        zba zbaVar3 = tcaVar.n1;
                        HashMap hashMap3 = tcaVar.Q1;
                        Long l6 = 0L;
                        vh6 vh6Var2 = tcaVar.P1;
                        ArrayList arrayList4 = tcaVar.I1;
                        CharSequence[] charSequenceArr3 = charSequenceArr;
                        ArrayList arrayList5 = Y;
                        boolean z8 = z;
                        if (arrayList4 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int i18 = 0;
                            boolean z9 = false;
                            while (true) {
                                if (i18 < vh6Var2.m()) {
                                    boolean z10 = z8;
                                    long j8 = vh6Var2.j(i18);
                                    boolean y2 = oc7.r1(tcaVar.a).y2(j8);
                                    yba ybaVar3 = ybaVar2;
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
                                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap3.get(vh6Var2.f(j8));
                                    if (tL_forumTopic3 != null && y2) {
                                        i17 = i18;
                                        z7 = y2;
                                        j7 = pg3.n(tL_forumTopic3.from_id);
                                    } else {
                                        i17 = i18;
                                        z7 = y2;
                                        j7 = 0;
                                    }
                                    if (tL_forumTopic3 != null && !z7) {
                                        l5 = l6;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        k47Var3 = new k47(tcaVar.a, tL_forumTopic3.topicStartMessage, false, false);
                                    } else {
                                        l5 = l6;
                                        arrayList2 = arrayList4;
                                        charSequenceArr2 = charSequenceArr3;
                                        k47Var3 = null;
                                    }
                                    if (k47Var3 != null) {
                                        k47Var3.p = true;
                                    }
                                    if (ybaVar3.getTag() != null && zbaVar3.a.length() > 0) {
                                        CharSequence charSequence4 = charSequenceArr2[0];
                                        if (charSequence4 == null) {
                                            charSequence3 = null;
                                        } else {
                                            charSequence3 = charSequence4.toString();
                                        }
                                        r11 = 0;
                                        k47Var4 = k47Var3;
                                        ArrayList arrayList7 = arrayList5;
                                        y5a b2 = y5a.b(charSequence3, j8, k47Var4, k47Var3, null, true, arrayList7, null, null, z10, 0, 0, null, false);
                                        arrayList3 = arrayList7;
                                        z10 = z10;
                                        if (l7 == null) {
                                            longValue5 = 0;
                                        } else {
                                            longValue5 = l7.longValue();
                                        }
                                        b2.Q = longValue5;
                                        b2.R = j7;
                                        a6a.B(tcaVar.a).q0(b2);
                                    } else {
                                        k47Var4 = k47Var3;
                                        arrayList3 = arrayList5;
                                        r11 = 0;
                                    }
                                    a6a B = a6a.B(tcaVar.a);
                                    k47 k47Var5 = k47Var4;
                                    ArrayList arrayList8 = tcaVar.I1;
                                    boolean z11 = !tcaVar.D2;
                                    if (l7 == null) {
                                        longValue4 = 0;
                                    } else {
                                        longValue4 = l7.longValue();
                                    }
                                    boolean z12 = z10;
                                    int p0 = B.p0(arrayList8, j8, z11, false, z12, 0, 0, k47Var5, i13, longValue4, j7, null);
                                    if (p0 != 0) {
                                        arrayList6.add(Long.valueOf(j8));
                                    }
                                    if (vh6Var2.m() == 1) {
                                        ik.q0(p0, r11, tcaVar.a2);
                                        if (p0 != 0) {
                                            z9 = z6;
                                            tL_forumTopic = r11;
                                            break;
                                        }
                                    }
                                    i18 = i17 + 1;
                                    arrayList5 = arrayList3;
                                    z8 = z12;
                                    ybaVar2 = ybaVar3;
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
                                TLRPC.Dialog dialog = (TLRPC.Dialog) vh6Var2.f(longValue6);
                                vh6Var2.l(longValue6);
                                if (dialog != null) {
                                    hashMap3.remove(dialog);
                                }
                            }
                            if (!vh6Var2.i()) {
                                int size2 = arrayList2.size();
                                if (vh6Var2.m() == 1) {
                                    tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap3.get(vh6Var2.n(0));
                                } else {
                                    tL_forumTopic2 = tL_forumTopic;
                                }
                                tcaVar.L0(vh6Var2, size2, tL_forumTopic2, !z9);
                            }
                        } else {
                            boolean z13 = z8;
                            hca hcaVar2 = tcaVar.R1;
                            if (hcaVar2 != null) {
                                r12 = hcaVar2.e;
                            } else {
                                r12 = 0;
                            }
                            if (tcaVar.A2 != null) {
                                int i20 = 0;
                                boolean z14 = false;
                                while (i20 < vh6Var2.m()) {
                                    long j9 = vh6Var2.j(i20);
                                    boolean y22 = oc7.r1(tcaVar.a).y2(j9);
                                    if (hashMap2 == null) {
                                        l2 = l6;
                                    } else {
                                        l2 = (Long) hashMap2.get(Long.valueOf(j9));
                                    }
                                    if (l2 != null && l2.longValue() > 0) {
                                        z14 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap3.get(vh6Var2.f(j9));
                                    if (tL_forumTopic4 != null && y22) {
                                        strArr = strArr2;
                                        z5 = z14;
                                        j6 = pg3.n(tL_forumTopic4.from_id);
                                    } else {
                                        strArr = strArr2;
                                        z5 = z14;
                                        j6 = 0;
                                    }
                                    if (tL_forumTopic4 != null && !y22) {
                                        i16 = i20;
                                        l3 = l2;
                                        k47Var2 = new k47(tcaVar.a, tL_forumTopic4.topicStartMessage, false, false);
                                    } else {
                                        i16 = i20;
                                        l3 = l2;
                                        k47Var2 = null;
                                    }
                                    if (tcaVar.A2 == null) {
                                        if (ybaVar2.getTag() != null && zbaVar3.a.length() > 0) {
                                            CharSequence charSequence5 = charSequenceArr3[0];
                                            if (charSequence5 == null) {
                                                charSequence2 = null;
                                            } else {
                                                charSequence2 = charSequence5.toString();
                                            }
                                            boolean z15 = z13;
                                            b = y5a.b(charSequence2, j9, k47Var2, k47Var2, null, true, arrayList5, null, null, z15, 0, 0, null, false);
                                            z13 = z15;
                                        } else {
                                            b = y5a.b(strArr[r12], j9, k47Var2, k47Var2, null, true, null, null, null, z13, 0, 0, null, false);
                                        }
                                    } else {
                                        if (ybaVar2.getTag() != null && zbaVar3.a.length() > 0 && charSequenceArr3[0] != null) {
                                            k47 k47Var6 = k47Var2;
                                            k47Var2 = k47Var6;
                                            a6a.B(tcaVar.a).q0(y5a.b(charSequenceArr3[0].toString(), j9, null, k47Var6, null, true, null, null, null, z13, 0, 0, null, false));
                                        }
                                        b = y5a.b(null, j9, k47Var2, k47Var2, null, true, null, null, null, z13, 0, 0, null, false);
                                        b.I = tcaVar.A2;
                                    }
                                    if (l3 == null) {
                                        longValue3 = 0;
                                    } else {
                                        longValue3 = l3.longValue();
                                    }
                                    b.Q = longValue3;
                                    b.R = j6;
                                    a6a.B(tcaVar.a).q0(b);
                                    i20 = i16 + 1;
                                    z14 = z5;
                                    strArr2 = strArr;
                                }
                                z3 = z14;
                            } else if (strArr2[r12] != null) {
                                int i21 = 0;
                                boolean z16 = false;
                                while (i21 < vh6Var2.m()) {
                                    long j10 = vh6Var2.j(i21);
                                    boolean y23 = oc7.r1(tcaVar.a).y2(j10);
                                    if (hashMap2 == null) {
                                        l = l6;
                                    } else {
                                        l = (Long) hashMap2.get(Long.valueOf(j10));
                                    }
                                    if (l != null && l.longValue() > 0) {
                                        z16 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic5 = (TLRPC.TL_forumTopic) hashMap3.get(vh6Var2.f(j10));
                                    if (tL_forumTopic5 != null && y23) {
                                        i15 = i21;
                                        hashMap = hashMap2;
                                        j5 = pg3.n(tL_forumTopic5.from_id);
                                    } else {
                                        i15 = i21;
                                        hashMap = hashMap2;
                                        j5 = 0;
                                    }
                                    if (tL_forumTopic5 != null && !y23) {
                                        z4 = z16;
                                        c = 0;
                                        k47Var = new k47(tcaVar.a, tL_forumTopic5.topicStartMessage, false, false);
                                    } else {
                                        z4 = z16;
                                        c = 0;
                                        k47Var = null;
                                    }
                                    if (ybaVar2.getTag() != null && zbaVar3.a.length() > 0) {
                                        CharSequence charSequence6 = charSequenceArr3[c];
                                        if (charSequence6 == null) {
                                            charSequence = null;
                                        } else {
                                            charSequence = charSequence6.toString();
                                        }
                                        boolean z17 = z13;
                                        y5a b3 = y5a.b(charSequence, j10, k47Var, k47Var, null, true, arrayList5, null, null, z17, 0, 0, null, false);
                                        z13 = z17;
                                        if (l == null) {
                                            zbaVar2 = zbaVar3;
                                            longValue2 = 0;
                                        } else {
                                            zbaVar2 = zbaVar3;
                                            longValue2 = l.longValue();
                                        }
                                        b3.Q = longValue2;
                                        b3.R = j5;
                                        a6a.B(tcaVar.a).q0(b3);
                                    } else {
                                        zbaVar2 = zbaVar3;
                                    }
                                    k47 k47Var7 = k47Var;
                                    y5a b4 = y5a.b(strArr2[r12], j10, k47Var7, k47Var7, null, true, null, null, null, z13, 0, 0, null, false);
                                    if (l == null) {
                                        longValue = 0;
                                    } else {
                                        longValue = l.longValue();
                                    }
                                    b4.Q = longValue;
                                    b4.R = j5;
                                    a6a.B(tcaVar.a).q0(b4);
                                    i21 = i15 + 1;
                                    z16 = z4;
                                    zbaVar3 = zbaVar2;
                                    hashMap2 = hashMap;
                                }
                                z3 = z16;
                            } else {
                                i14 = 0;
                                z3 = false;
                                tcaVar.L0(vh6Var2, 1, (TLRPC.TL_forumTopic) hashMap3.get(vh6Var2.n(i14)), !z3);
                            }
                            i14 = 0;
                            tcaVar.L0(vh6Var2, 1, (TLRPC.TL_forumTopic) hashMap3.get(vh6Var2.n(i14)), !z3);
                        }
                        jca jcaVar = tcaVar.n2;
                        if (jcaVar != null) {
                            jcaVar.s();
                        }
                        tcaVar.dismiss();
                    }
                });
                return;
            }
        }
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
        yba ybaVar = this.m1;
        if (ybaVar.getTag() != null) {
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
        ybaVar.setTag(num);
        zba zbaVar = this.n1;
        if (zbaVar.getEditText().isFocused()) {
            gm.t1(zbaVar.getEditText());
        }
        zbaVar.k(true);
        FrameLayout frameLayout = this.X1;
        yba ybaVar2 = this.p1;
        FrameLayout frameLayout2 = this.q1;
        if (z) {
            ybaVar.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            ybaVar2.setVisibility(0);
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
            WeakHashMap weakHashMap = kfc.a;
            frameLayout2.setImportantForAccessibility(i);
        }
        LinearLayout linearLayout = this.x1;
        if (linearLayout != null) {
            if (!z) {
                i2 = 1;
            }
            WeakHashMap weakHashMap2 = kfc.a;
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
        arrayList.add(ObjectAnimator.ofFloat(ybaVar, property, f));
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
        arrayList.add(ObjectAnimator.ofFloat(ybaVar2, property2, f2));
        Property property3 = View.SCALE_Y;
        if (z) {
            f8 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(ybaVar2, property3, f8));
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(ybaVar2, property, f3));
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
                f6 = gm.L(f4);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, f6));
        }
        this.y1.playTogether(arrayList);
        this.y1.setInterpolator(new DecelerateInterpolator());
        this.y1.setDuration(180L);
        this.y1.addListener(new eca(this, z, (byte) 1));
        this.y1.start();
    }

    public final void S0(long j, View view) {
        String str;
        u31 K;
        int i = -this.C2;
        this.C2 = i;
        gm.A3(i, view, null);
        xx0.APP_ERROR.a();
        if (j >= 0) {
            str = m9c.r(oc7.r1(this.a).W1(Long.valueOf(j)));
        } else {
            str = "";
        }
        boolean H3 = oc7.r1(this.a).H3();
        ylb ylbVar = this.J0;
        FrameLayout frameLayout = this.v1;
        if (H3) {
            K = new c41(frameLayout, ylbVar).Q(2131624211, 36, gm.S2(jb6.a0(null, null, 2131743447, str)));
        } else {
            K = new c41(frameLayout, ylbVar).K(2131624211, gm.S2(jb6.a0(null, null, 2131743447, str)), jb6.M0(2131743446, null), new qba(this, (byte) 1));
        }
        K.j();
    }

    public final void T0() {
        gb gbVar;
        yba ybaVar = this.m1;
        if (ybaVar == null) {
            return;
        }
        zba zbaVar = this.n1;
        if (zbaVar != null && zbaVar.m()) {
            zbaVar.getEmojiPaddingShown();
        } else {
            gca gcaVar = this.y2;
            if (gcaVar != null && (gbVar = gcaVar.I) != null && !gbVar.f) {
                Typeface typeface = gm.a;
            }
        }
        float f = 0.0f;
        FrameLayout frameLayout = this.X1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f = 0.0f + gm.L(48.0f);
        }
        FrameLayout frameLayout2 = this.q1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f);
        }
        float f2 = -f;
        ybaVar.setTranslationY(f2);
        this.p1.setTranslationY(f2);
    }

    public final void U0() {
        vba vbaVar;
        int i;
        int i2;
        if (!this.m2) {
            boolean z = this.G2;
            vba vbaVar2 = this.A1;
            vba vbaVar3 = this.B1;
            if (z) {
                vbaVar = vbaVar3;
            } else {
                vbaVar = vbaVar2;
            }
            if (vbaVar.getChildCount() > 0) {
                View childAt = vbaVar.getChildAt(0);
                for (int i3 = 0; i3 < vbaVar.getChildCount(); i3++) {
                    if (vbaVar.getChildAt(i3).getTop() < childAt.getTop()) {
                        childAt = vbaVar.getChildAt(i3);
                    }
                }
                b59 b59Var = (b59) vbaVar.G(childAt);
                int top = childAt.getTop() - gm.L(8.0f);
                if (top > 0 && b59Var != null && b59Var.b() == 0) {
                    i = top;
                } else {
                    i = 0;
                }
                if (top >= 0 && b59Var != null && b59Var.b() == 0) {
                    this.F2 = childAt.getTop();
                    N0(false);
                } else {
                    this.F2 = Integer.MAX_VALUE;
                    N0(true);
                    top = i;
                }
                r59 r59Var = this.z1;
                if (r59Var.getVisibility() == 0) {
                    if (r59Var.getChildCount() > 0) {
                        View childAt2 = r59Var.getChildAt(0);
                        for (int i4 = 0; i4 < r59Var.getChildCount(); i4++) {
                            if (r59Var.getChildAt(i4).getTop() < childAt2.getTop()) {
                                childAt2 = r59Var.getChildAt(i4);
                            }
                        }
                        b59 b59Var2 = (b59) r59Var.G(childAt2);
                        int top2 = childAt2.getTop() - gm.L(8.0f);
                        if (top2 > 0 && b59Var2 != null && b59Var2.b() == 0) {
                            i2 = top2;
                        } else {
                            i2 = 0;
                        }
                        if (top2 >= 0 && b59Var2 != null && b59Var2.b() == 0) {
                            this.F2 = childAt2.getTop();
                            N0(false);
                        } else {
                            this.F2 = Integer.MAX_VALUE;
                            N0(true);
                            top2 = i2;
                        }
                        top = gm.U1(r59Var.getAlpha(), top, top2);
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
                    vbaVar2.setTopGlowOffset(i6);
                    int i7 = (int) (this.o2 + f);
                    this.k2 = i7;
                    vbaVar3.setTopGlowOffset(i7);
                    int i8 = (int) (f + this.o2);
                    this.k2 = i8;
                    r59Var.setTopGlowOffset(i8);
                    this.l1.setTranslationY(this.k2 + this.o2);
                    this.L1.setTranslationY(this.k2 + this.o2);
                    this.b.invalidate();
                }
            }
        }
    }

    public final void V0() {
        lka lkaVar = this.u1;
        if (lkaVar != null) {
            String I0 = I0();
            if (I0.startsWith("https://")) {
                I0 = I0.substring(8);
            } else if (I0.startsWith("http://")) {
                I0 = I0.substring(7);
            }
            lkaVar.l(I0, false);
        }
    }

    public final void W0(int i) {
        int size;
        boolean z;
        boolean z2;
        vh6 vh6Var = this.P1;
        if (vh6Var.m() == 0) {
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
        zba zbaVar = this.n1;
        if (tag != null && zbaVar.a.length() > 0) {
            size++;
        }
        long j = 0;
        for (int i2 = 0; i2 < vh6Var.m(); i2++) {
            long j2 = ((TLRPC.Dialog) vh6Var.n(i2)).id;
            long L1 = oc7.r1(this.a).L1(j2);
            if (L1 <= 0) {
                L1 = pg3.j(oc7.r1(this.a).L2(j2));
            }
            j += L1;
        }
        int max = Math.max(1, vh6Var.m());
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        vi3 vi3Var = this.o1;
        vi3Var.f(max, z);
        if (i != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        vi3Var.i(size, j, z2);
        R0(true);
        zbaVar.setPadding(0, 0, Math.max(gm.L(84.0f), vi3Var.l()), 0);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.r;
        if (i == i3) {
            mca mcaVar = this.F1;
            if (mcaVar != null) {
                mcaVar.E();
            }
            nm7.f(this.a).n(this, i3);
        }
    }

    @Override
    public final void dismiss() {
        zba zbaVar = this.n1;
        if (zbaVar != null) {
            gm.t1(zbaVar.getEditText());
        }
        this.T1 = false;
        super.dismiss();
        nm7.f(this.a).n(this, nm7.r);
    }

    @Override
    public final void onBackPressed() {
        if (this.x2 != null) {
            E0();
            return;
        }
        zba zbaVar = this.n1;
        if (zbaVar != null && zbaVar.e) {
            zbaVar.k(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void p0() {
        boolean z;
        try {
            super.p0();
            kz4 kz4Var = this.K2;
            if (kz4Var != null) {
                kz4Var.a(cmb.v0(cmb.c6, this.J0));
            }
            dy0 dy0Var = this.c;
            if (dy0Var != null) {
                if (gm.B(cmb.v0(cmb.g5, this.J0)) > 0.721f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != this.S2) {
                    this.S2 = z;
                    gm.j3(dy0Var, z);
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public void M0(View view) {
    }

    public void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
    }

    public tca(Context context, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2) {
        this(context, null, arrayList, str, str2, z, str3, str4, false, z2, false, null, null);
    }

    public tca(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2, ylb ylbVar) {
        this(context, null, arrayList, str, null, z, str2, null, z2, false, false, null, ylbVar);
    }
}
