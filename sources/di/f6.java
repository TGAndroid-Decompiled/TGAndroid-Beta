package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONObject;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.time.FastDateFormat;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.tz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
public class f6 extends org.telegram.ui.Components.ra implements fs {
    public static final int f8755z3 = 0;
    public boolean A2;
    public TL_stars.SavedStarGift B2;
    public q8 C2;
    public fj D2;
    public String E2;
    public TL_stars.TL_starGiftUnique F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public boolean J2;
    public boolean K2;
    public o5 L2;
    public boolean M2;
    public m4 N2;
    public final int[] O2;
    public l4 P2;
    public int Q2;
    public String R2;
    public bi.k8 S2;
    public final long T1;
    public kq T2;
    public final n4 U1;
    public boolean U2;
    public final h4 V1;
    public z3 V2;
    public final tz W1;
    public Float W2;
    public final View X1;
    public e5 X2;
    public bi.b3 Y1;
    public ValueAnimator Y2;
    public bi.b3 Z1;
    public kq Z2;
    public final k4 f8756a2;
    public boolean f8757a3;
    public final z5 f8758b2;
    public TL_wallet.nftItem f8759b3;
    public final j4 f8760c2;
    public org.telegram.ui.Wallet.w5 f8761c3;
    public final j80 d2;
    public org.telegram.ui.Wallet.x5 f8762d3;
    public final dy0 f8763e2;
    public TL_wallet.walletTransaction f8764e3;
    public final j80 f8765f2;
    public final LinearLayout f8766f3;
    public final hi.e f8767g2;
    public final TextView f8768g3;
    public final FrameLayout f8769h2;
    public final TextView f8770h3;
    public final j80 f8771i2;
    public View f8772i3;
    public final FrameLayout f8773j2;
    public bi.b6 j3;
    public final View f8774k2;
    public boolean f8775k3;
    public final FrameLayout f8776l2;
    public Boolean f8777l3;
    public b6 f8778m2;
    public boolean f8779m3;
    public boolean f8780n2;
    public ArrayList f8781n3;
    public final j4 f8782o2;
    public ArrayList f8783o3;
    public final ki.i[] f8784p2;
    public ArrayList f8785p3;
    public final View f8786q2;
    public boolean f8787q3;
    public final LinearLayout f8788r2;
    public TLRPC.PaymentForm f8789r3;
    public final lp f8790s2;
    public final kq[] f8791s3;
    public final TextView f8792t2;
    public final k1 f8793t3;
    public final LinearLayout f8794u2;
    public int f8795u3;
    public final lp f8796v2;
    public Boolean f8797v3;
    public boolean f8798w2;
    public boolean f8799w3;
    public final j4 f8800x2;
    public hi.u3 f8801x3;
    public final TextView f8802y2;
    public View f8803y3;
    public final j4 f8804z2;

    public f6(Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var, View view) {
        super(context, null, false, false, i6Var);
        this.f8780n2 = false;
        this.O2 = new int[2];
        this.Q2 = -1;
        this.R2 = "";
        this.X2 = new e5(0, 0);
        this.f8757a3 = true;
        this.f8791s3 = new kq[1];
        this.f8793t3 = new k1(this, 16);
        this.f8799w3 = true;
        this.f30223a = i7;
        this.T1 = j3;
        this.f39253v1 = Math.max(0.05f, org.telegram.messenger.g0.L(82.0f) / (org.telegram.messenger.g0.f24226q.y + org.telegram.messenger.g0.f24220m));
        this.f30265x = true;
        this.f30226b = new bi.g3(2, context, this);
        n4 n4Var = new n4(this, context);
        this.U1 = n4Var;
        h4 h4Var = new h4(this, context);
        this.V1 = h4Var;
        h4Var.setAdapter(new i4(0, context, this));
        K2();
        View view2 = new View(context);
        this.X1 = view2;
        int i10 = org.telegram.ui.ActionBar.n6.f29524h5;
        org.telegram.ui.ActionBar.u6.h(i10, view2, i6Var);
        FrameLayout.LayoutParams e10 = c8.na.e(-1, 50, 80);
        int i11 = this.f30261u0;
        e10.rightMargin = i11;
        e10.leftMargin = i11;
        this.f30226b.addView(view2, e10);
        this.f30226b.addView(h4Var, c8.na.e(-1, -1, 119));
        Q(i10);
        org.telegram.messenger.g0.E2(this.f39246o1);
        n4Var.addView(this.f39246o1, c8.na.e(-1, -1, 119));
        if (Build.VERSION.SDK_INT >= 26) {
            this.f39246o1.setDefaultFocusHighlightEnabled(false);
        }
        j4 j4Var = new j4(this, context, 0);
        this.f8760c2 = j4Var;
        j4Var.setOrientation(1);
        j4Var.setPadding(org.telegram.messenger.g0.L(14.0f) + this.f30261u0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(14.0f) + this.f30261u0, org.telegram.messenger.g0.L(68.0f));
        n4Var.addView(j4Var, c8.na.e(-1, -1, 55));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f8766f3 = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f8768g3 = textView;
        textView.setSingleLine(true);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        i5.c.x(textView, 1, 40.0f);
        int i12 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.u6.U(textView, i12, i6Var);
        linearLayout.addView(textView, c8.na.r(-1, 50, 1));
        TextView textView2 = new TextView(context);
        this.f8770h3 = textView2;
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29862z6, i6Var);
        linearLayout.addView(textView2, c8.na.t(-1, 20, 1, 0, 3, 0, 0));
        j4Var.addView(linearLayout, c8.na.k(0.0f, 4.0f, 0.0f, 16.0f, -1, -2));
        linearLayout.setVisibility(8);
        j80 j80Var = new j80(context, i6Var);
        this.d2 = j80Var;
        int i13 = org.telegram.ui.ActionBar.n6.f29690q5;
        org.telegram.ui.ActionBar.u6.U(j80Var, i13, i6Var);
        j80Var.setTextSize(1, 12.0f);
        j80Var.setGravity(17);
        j80Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
        j80Var.setDisablePaddingsOffsetY(true);
        j4Var.addView(j80Var, c8.na.t(-2, -2, 1, 4, -2, 4, 16));
        j80Var.setVisibility(8);
        dy0 dy0Var = new dy0(context, i6Var);
        this.f8763e2 = dy0Var;
        j4Var.addView(dy0Var, c8.na.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        j80 j80Var2 = new j80(context, i6Var);
        this.f8765f2 = j80Var2;
        org.telegram.ui.ActionBar.u6.U(j80Var2, i13, i6Var);
        j80Var2.setTextSize(1, 12.0f);
        j80Var2.setGravity(17);
        j80Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.u6.G(j80Var2, i12, i6Var);
        j80Var2.setDisablePaddingsOffsetY(true);
        j80Var2.setPadding(org.telegram.messenger.g0.L(5.0f), 0, org.telegram.messenger.g0.L(5.0f), 0);
        j4Var.addView(j80Var2, c8.na.t(-2, -2, 1, 4, 2, 4, 8));
        j80Var2.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f8794u2 = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout2.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i14, i6Var), 21, 21);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
        linearLayout2.setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(linearLayout2, a02, null, M, i6Var);
        lp lpVar = new lp(24, context, i6Var);
        this.f8796v2 = lpVar;
        int i15 = org.telegram.ui.ActionBar.n6.h7;
        int i16 = org.telegram.ui.ActionBar.n6.f29561j7;
        int i17 = org.telegram.ui.ActionBar.n6.f29581k7;
        lpVar.b(i15, i16, i17);
        lpVar.setDrawUnchecked(true);
        lpVar.a(false, false);
        lpVar.setDrawBackgroundAsArc(10);
        linearLayout2.addView(lpVar, c8.na.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        int i18 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.U(textView3, i18, i6Var);
        i5.c.r(14.0f, 1, 2131750372, textView3, null);
        linearLayout2.addView(textView3, c8.na.t(-2, -2, 16, 9, 0, 0, 0));
        j4Var.addView(linearLayout2, c8.na.t(-2, -2, 1, 0, -4, 0, 4));
        c8.sa.b(linearLayout2, 0.025f, 1.5f);
        linearLayout2.setOnClickListener(new i1(this, 25));
        linearLayout2.setVisibility(8);
        j4 j4Var2 = new j4(this, context, 1);
        this.f8782o2 = j4Var2;
        j4Var2.setOrientation(1);
        j4Var2.setPadding(org.telegram.messenger.g0.L(4.0f) + this.f30261u0, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f) + this.f30261u0, org.telegram.messenger.g0.L(66.0f));
        n4Var.addView(j4Var2, c8.na.e(-1, -1, 55));
        this.f8784p2 = r6;
        ki.i iVar = new ki.i(context, i6Var, false);
        iVar.a(2131231825, gd.N0(2131749848, null), gd.N0(2131749399, null));
        j4Var2.addView(r6[0], c8.na.o(-1, -2));
        ki.i iVar2 = new ki.i(context, i6Var, false);
        iVar2.a(2131231821, gd.N0(2131749842, null), gd.N0(2131749397, null));
        j4Var2.addView(r6[1], c8.na.o(-1, -2));
        ki.i iVar3 = new ki.i(context, i6Var, false);
        ki.i[] iVarArr = {iVar, iVar2, iVar3};
        iVar3.a(2131231928, gd.N0(2131749394, null), gd.N0(2131749395, null));
        j4Var2.addView(iVarArr[2], c8.na.o(-1, -2));
        View view3 = new View(context);
        this.f8786q2 = view3;
        int i19 = org.telegram.ui.ActionBar.n6.f29452d7;
        org.telegram.ui.ActionBar.u6.h(i19, view3, i6Var);
        j4Var2.addView(view3, c8.na.n(1.0f / org.telegram.messenger.g0.f24225p, -2, 7, 17, -4, 17, 6));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f8788r2 = linearLayout3;
        linearLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout3.setOrientation(0);
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i14, i6Var), 6, 6);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i14);
        linearLayout3.setBackground(a03);
        org.telegram.ui.ActionBar.u6.j(linearLayout3, a03, null, M2, i6Var);
        lp lpVar2 = new lp(24, context, i6Var);
        this.f8790s2 = lpVar2;
        lpVar2.b(i15, i16, i17);
        lpVar2.setDrawUnchecked(true);
        lpVar2.a(false, false);
        lpVar2.setDrawBackgroundAsArc(10);
        linearLayout3.addView(lpVar2, c8.na.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        this.f8792t2 = textView4;
        org.telegram.ui.ActionBar.u6.U(textView4, i18, i6Var);
        i5.c.r(14.0f, 1, 2131750380, textView4, null);
        linearLayout3.addView(textView4, c8.na.t(-2, -2, 16, 9, 0, 0, 0));
        j4Var2.addView(linearLayout3, c8.na.t(-2, -2, 1, 0, 0, 0, 4));
        c8.sa.b(linearLayout3, 0.025f, 1.5f);
        j4 j4Var3 = new j4(this, context, 2);
        this.f8800x2 = j4Var3;
        j4Var3.setOrientation(1);
        j4Var3.setPadding(org.telegram.messenger.g0.L(4.0f) + this.f30261u0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(4.0f) + this.f30261u0, org.telegram.messenger.g0.L(66.0f));
        n4Var.addView(j4Var3, c8.na.e(-1, -1, 55));
        TextView textView5 = new TextView(context);
        this.f8802y2 = textView5;
        org.telegram.ui.ActionBar.u6.U(textView5, i18, i6Var);
        textView5.setTextSize(1, 20.0f);
        textView5.setGravity(17);
        textView5.setTypeface(org.telegram.messenger.g0.o());
        j4Var3.addView(textView5, c8.na.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView6 = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView6, i18, i6Var);
        textView6.setTextSize(1, 14.0f);
        org.telegram.messenger.f3.k(textView6, 17, null, 2131749817);
        j4Var3.addView(textView6, c8.na.t(-1, -2, 7, 20, 6, 20, 24));
        ki.i iVar4 = new ki.i(context, i6Var, false);
        iVar4.a(2131231825, gd.N0(2131749823, null), gd.N0(2131749824, null));
        j4Var3.addView(r6[0], c8.na.o(-1, -2));
        ki.i iVar5 = new ki.i(context, i6Var, false);
        iVar5.a(2131231803, gd.N0(2131749821, null), gd.N0(2131749822, null));
        j4Var3.addView(r6[1], c8.na.o(-1, -2));
        ki.i iVar6 = new ki.i(context, i6Var, false);
        ki.i[] iVarArr2 = {iVar4, iVar5, iVar6};
        iVar6.a(2131231915, gd.N0(2131749819, null), gd.N0(2131749820, null));
        j4Var3.addView(iVarArr2[2], c8.na.o(-1, -2));
        j4 j4Var4 = new j4(this, context, 3);
        this.f8804z2 = j4Var4;
        j4Var4.setOrientation(1);
        j4Var4.setPadding(org.telegram.messenger.g0.L(4.0f) + this.f30261u0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f) + this.f30261u0, org.telegram.messenger.g0.L(92.0f));
        n4Var.addView(j4Var4, c8.na.e(-1, -1, 55));
        ki.i iVar7 = new ki.i(context, i6Var, false);
        iVar7.a(2131231825, gd.N0(2131749768, null), gd.N0(2131749769, null));
        j4Var4.addView(r7[0], c8.na.o(-1, -2));
        ki.i iVar8 = new ki.i(context, i6Var, false);
        iVar8.a(2131231877, gd.N0(2131749766, null), gd.N0(2131749767, null));
        j4Var4.addView(r7[1], c8.na.o(-1, -2));
        ki.i iVar9 = new ki.i(context, i6Var, false);
        ki.i[] iVarArr3 = {iVar7, iVar8, iVar9};
        iVar9.a(2131231799, gd.N0(2131749764, null), gd.N0(2131749765, null));
        j4Var4.addView(iVarArr3[2], c8.na.o(-1, -2));
        j4Var.setAlpha(1.0f);
        j4Var2.setAlpha(0.0f);
        j4Var3.setAlpha(0.0f);
        j4Var4.setAlpha(0.0f);
        z5 z5Var = new z5(context, i6Var, new k1(this, 17), new i1(this, 26), new i1(this, 27), new i1(this, 28), new i1(this, 29), new p3(this, 0), new p3(this, 1), new p3(this, 2));
        this.f8758b2 = z5Var;
        z5Var.N.f8524c.setOnClickListener(new i1(this, 23));
        int i20 = this.f30261u0;
        z5Var.setPadding(i20, 0, i20, 0);
        n4Var.addView(z5Var, c8.na.e(-1, -2, 55));
        jg.b0 b0Var = this.n1;
        this.K1 = true;
        b0Var.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8769h2 = frameLayout;
        org.telegram.ui.ActionBar.u6.h(i10, frameLayout, i6Var);
        View view4 = new View(context);
        this.f8774k2 = view4;
        org.telegram.ui.ActionBar.u6.h(i19, view4, i6Var);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, c8.na.a(-1.0f, 1.0f / org.telegram.messenger.g0.f24225p, 55));
        hi.e g10 = m10.g(24, context, i6Var, true);
        this.f8767g2 = g10;
        g10.i(gd.N0(2131747637, null), false, true);
        g10.g(null, false);
        FrameLayout.LayoutParams d = c8.na.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = org.telegram.messenger.g0.L(14.0f) + this.f30261u0;
        d.rightMargin = org.telegram.messenger.g0.L(14.0f) + this.f30261u0;
        frameLayout.addView(g10, d);
        n4Var.addView(frameLayout, c8.na.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f8773j2 = frameLayout2;
        org.telegram.ui.ActionBar.u6.h(i10, frameLayout2, i6Var);
        j80 j80Var3 = new j80(context, null);
        this.f8771i2 = j80Var3;
        j80Var3.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.u6.U(j80Var3, i12, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var3, i12, i6Var);
        j80Var3.setGravity(17);
        frameLayout2.addView(j80Var3, c8.na.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        n4Var.addView(frameLayout2, c8.na.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.f39246o1.setOnScrollListener(new bi.v1(this, 9));
        linearLayout3.setOnClickListener(new i1(this, 24));
        tz tzVar = new tz(context);
        this.W1 = tzVar;
        n4Var.addView(tzVar, c8.na.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f8776l2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(6.0f) + this.f30261u0, 0, org.telegram.messenger.g0.L(6.0f) + this.f30261u0, 0);
        n4Var.addView(frameLayout3, c8.na.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        org.telegram.messenger.g0.E2(this.f39247p1);
        n4Var.addView(this.f39247p1, c8.na.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        k4 k4Var = new k4(context);
        this.f8756a2 = k4Var;
        n4Var.addView(k4Var, c8.na.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        org.telegram.messenger.g0.m2(new ai.d0(k4Var, 11), 12.0f, 12, arrayList);
    }

    public static String A1(int i7) {
        FastDateFormat s02;
        Date date = new Date(i7 * 1000);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        gd E0 = gd.E0();
        if (calendar.get(1) == calendar2.get(1)) {
            s02 = E0.q0();
        } else {
            s02 = E0.s0();
        }
        return gd.a0(null, null, 2131742512, s02.format(date), E0.p0().format(date));
    }

    public static String F1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return i5.c.l(tL_starGiftUnique.num, ',', sb2);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return gd.N0(2131750175, null);
        }
    }

    public static String L1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return gd.N0(2131749446, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return gd.N0(2131749447, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return gd.N0(2131749449, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return gd.N0(2131749448, null);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            int i7 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
            if (i7 <= 0) {
                return "<0.1%";
            }
            return ki.j.J0(i7);
        } else {
            return "";
        }
    }

    public static boolean P1(int i7, TL_stars.StarGift starGift) {
        if (!bi.a5.m(starGift)) {
            return false;
        }
        org.telegram.messenger.p0 p0Var = mp.u1(i7).A7;
        if (!((org.telegram.messenger.h0) p0Var.f26254p0.f17372b).f24439c) {
            return true;
        }
        if (((TL_stars.TL_starGiftUnique) starGift).fixed_sale) {
            return false;
        }
        return !((org.telegram.messenger.h0) p0Var.f26261t.f17372b).f24439c;
    }

    public static boolean R1(int i7, long j3) {
        if (j3 >= 0) {
            if (i10.i(i7).e() == j3) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.v3.w(5, mp.u1(i7).O0(Long.valueOf(-j3)));
    }

    public static boolean S1(int i7, long j3) {
        if (j3 >= 0) {
            if (i10.i(i7).e() != j3) {
                return false;
            }
            return true;
        }
        TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
        if (O0 == null || !O0.creator) {
            return false;
        }
        return true;
    }

    public static boolean U1(int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long o4 = org.telegram.messenger.n5.o(peer);
        int i10 = (o4 > 0L ? 1 : (o4 == 0L ? 0 : -1));
        if (i10 == 0) {
            return false;
        }
        if (i10 > 0) {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(o4));
            if (c22 != null) {
                TLRPC.EmojiStatus emojiStatus = c22.emoji_status;
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.f28721id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-o4));
            if (O0 != null) {
                TLRPC.EmojiStatus emojiStatus2 = O0.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.f28721id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void e1(f6 f6Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        n8 F;
        TLRPC.Message message;
        hi.e eVar = f6Var.f8767g2;
        if (!eVar.R) {
            TL_stars.InputSavedStarGift G1 = f6Var.G1();
            fj fjVar = f6Var.D2;
            if (fjVar != null && (message = fjVar.f24073k) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    z10 = tL_messageActionStarGift.saved;
                    document = tL_messageActionStarGift.gift.getDocument();
                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    z10 = tL_messageActionStarGiftUnique.saved;
                    document = tL_messageActionStarGiftUnique.gift.getDocument();
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = f6Var.B2;
                if (savedStarGift != null) {
                    z10 = !savedStarGift.unsaved;
                    document = savedStarGift.gift.getDocument();
                } else {
                    return;
                }
            }
            TLRPC.Document document2 = document;
            boolean z12 = z10;
            eVar.setLoading(true);
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.unsave = z12;
            savestargift.stargift = G1;
            if (f6Var.B2 != null && (F = y8.y(f6Var.f30223a, false).F(f6Var.T1, false)) != null) {
                F.m(f6Var.B2, savestargift.unsave);
                z11 = true;
            } else {
                z11 = false;
            }
            ConnectionsManager.getInstance(f6Var.f30223a).sendRequest(savestargift, new x3(f6Var, z11, document2, z12, savestargift));
        }
    }

    public static void f1(final f6 f6Var) {
        int i7;
        long j3;
        long j10;
        long j11;
        String N0;
        final long e10 = i10.i(f6Var.f30223a).e();
        final TL_stars.InputSavedStarGift G1 = f6Var.G1();
        if (G1 != null) {
            fj fjVar = f6Var.D2;
            if (fjVar != null) {
                i7 = fjVar.f24073k.date;
                boolean P3 = fjVar.P3();
                TLRPC.Message message = f6Var.D2.f24073k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TLRPC.Peer peer = tL_messageActionStarGift.peer;
                        if (peer != null) {
                            j11 = org.telegram.messenger.n5.o(peer);
                        } else if (P3) {
                            j11 = fj.B0(message);
                        } else {
                            j11 = e10;
                        }
                        TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
                        if (peer2 != null) {
                            j3 = org.telegram.messenger.n5.o(peer2);
                        } else if (P3) {
                            j3 = e10;
                        } else {
                            j3 = fj.B0(f6Var.D2.f24073k);
                        }
                        j10 = tL_messageActionStarGift.convert_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = f6Var.B2;
                if (savedStarGift != null) {
                    i7 = savedStarGift.date;
                    if ((savedStarGift.flags & 2) != 0 && !savedStarGift.name_hidden) {
                        j3 = org.telegram.messenger.n5.o(savedStarGift.from_id);
                    } else {
                        j3 = 2666000;
                    }
                    j10 = f6Var.B2.convert_stars;
                    j11 = f6Var.T1;
                } else {
                    return;
                }
            }
            int max = Math.max(1, (mp.u1(f6Var.f30223a).H6 - (ConnectionsManager.getInstance(f6Var.f30223a).getCurrentTime() - i7)) / 86400);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
            String N02 = gd.N0(2131750209, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N02;
            if (!n10.B(j3) && j3 != 2666000) {
                N0 = org.telegram.messenger.n5.t(j3);
            } else {
                N0 = gd.N0(2131744708, null);
            }
            t1Var.U = org.telegram.messenger.g0.W2(gd.G(max, "Gift2ConvertText2", N0, gd.H(',', "Gift2ConvertStars", (int) j10)));
            final long j12 = j10;
            final long j13 = j11;
            alertDialog$Builder.k(gd.N0(2131750216, null), new org.telegram.ui.ActionBar.q1() {
                @Override
                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                    f6 f6Var2 = f6.this;
                    TL_stars.InputSavedStarGift inputSavedStarGift = G1;
                    long j14 = j13;
                    long j15 = e10;
                    long j16 = j12;
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, org.telegram.messenger.t0.f27013b, null);
                    t1Var3.r(500L);
                    TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
                    convertstargift.stargift = inputSavedStarGift;
                    ConnectionsManager.getInstance(f6Var2.f30223a).sendRequest(convertstargift, new h2(f6Var2, t1Var3, j14, j15, j16));
                }
            });
            i5.c.y(null, 2131752577, alertDialog$Builder, null);
        }
    }

    public static void g1(f6 f6Var, org.telegram.ui.ActionBar.t1 t1Var, fj fjVar) {
        t1Var.dismiss();
        f6Var.I2 = true;
        f6Var.v2(fjVar, null);
        super.show();
    }

    public static void h1(f6 f6Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        f6Var.F2 = tL_starGiftUnique;
        f6Var.x2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static void i1(f6 f6Var, org.telegram.ui.ActionBar.t1 t1Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            t1Var.dismiss();
            f6Var.K2 = true;
            f6Var.w2(savedStarGift, null);
            super.show();
            return;
        }
        t1Var.dismiss();
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T != null) {
            org.telegram.ui.Components.fc Q = org.telegram.ui.Components.kc.b0(T).Q(2131624012, 36, gd.N0(2131748359, null));
            Q.f35101t = true;
            Q.j();
        }
    }

    public static void j1(f6 f6Var, boolean z10) {
        int i7;
        Object obj;
        bi.b3 b3Var;
        bi.b3 b3Var2;
        bi.b3 b3Var3;
        int I1 = f6Var.I1();
        if (I1 >= 0) {
            if (z10) {
                i7 = 1;
            } else {
                i7 = -1;
            }
            int i10 = i7 + I1;
            int i11 = f6Var.Q2;
            if (i11 >= 0 && (!z10 ? i11 < I1 : i11 > I1)) {
                i10 = i11;
            }
            q8 q8Var = f6Var.C2;
            if (q8Var != null && i10 >= 0 && i10 < q8Var.e()) {
                obj = f6Var.C2.get(i10);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z10) {
                    b3Var = f6Var.Z1;
                } else {
                    b3Var = f6Var.Y1;
                }
                if (b3Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z10) {
                            b3Var3 = f6Var.Z1;
                        } else {
                            b3Var3 = f6Var.Y1;
                        }
                        if (y1(b3Var3.B2, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z10) {
                            b3Var2 = f6Var.Z1;
                        } else {
                            b3Var2 = f6Var.Y1;
                        }
                        if (z1(b3Var2.F2, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                bi.b3 b3Var4 = new bi.b3(f6Var, f6Var.getContext(), f6Var.f30223a, f6Var.T1, f6Var.J0, f6Var.U1.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    b3Var4.w2((TL_stars.SavedStarGift) obj, f6Var.C2);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    b3Var4.u2(tL_starGiftUnique.slug, tL_starGiftUnique, f6Var.C2);
                }
                org.telegram.messenger.g0.E2(b3Var4.f30226b);
                if (z10) {
                    f6Var.Z1 = b3Var4;
                } else {
                    f6Var.Y1 = b3Var4;
                }
            }
        }
    }

    public static TableRow k1(dy0 dy0Var, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        String str3;
        if (!WalletEngine2.isValidAddress(str2)) {
            return dy0Var.e(str, str2, null, null);
        }
        float L = org.telegram.messenger.g0.L(14.0f);
        TextView d4Var = new d4(dy0Var.getContext(), L);
        d4Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        int i7 = 0;
        d4Var.setTextSize(0, L);
        d4Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        org.telegram.ui.ActionBar.u6.U(d4Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        while (i7 < str2.length()) {
            int i11 = i10 / 4;
            int i12 = i10 % 4;
            if (i10 > 0) {
                if (i12 == 0) {
                    str3 = "\n";
                } else {
                    str3 = " ";
                }
                spannableStringBuilder.append((CharSequence) str3);
            }
            int length = spannableStringBuilder.length();
            int i13 = i7 + 4;
            spannableStringBuilder.append((CharSequence) str2, i7, Math.min(str2.length(), i13));
            if (((i11 + i12) & 1) == 1) {
                spannableStringBuilder.setSpan(new i00(org.telegram.ui.ActionBar.n6.f29843y6, i6Var), length, spannableStringBuilder.length(), 33);
            }
            i10++;
            i7 = i13;
        }
        d4Var.setText(spannableStringBuilder);
        return dy0Var.c(d4Var, str);
    }

    public static void m1(dy0 dy0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String N0;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            N0 = gd.N0(2131750370, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            N0 = gd.N0(2131750363, null);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            N0 = gd.N0(2131750371, null);
        } else {
            return;
        }
        String str = N0;
        Integer[] numArr = new Integer[1];
        dy0Var.d(str, starGiftAttribute.name, L1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static void p2(org.telegram.ui.ActionBar.g2 g2Var) {
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f28948a = true;
        T.showAsSheet(g2Var, obj);
    }

    public static SpannableStringBuilder s2(String str) {
        int i7;
        int i10;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i10 = indexOf2 - indexOf) > 2) {
            i7 = i10 - 2;
        } else {
            indexOf = -1;
            i7 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new e4(0), indexOf, i7 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder t2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new kq(2131231182, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new kq(2131231166, 0), 0, spannableString2.length(), 33);
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString, "👌");
        org.telegram.messenger.g0.M2(spannableStringBuilder, spannableString2, "👍");
        return spannableStringBuilder;
    }

    public static boolean y1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift != savedStarGift2) {
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.StarGift starGift2 = savedStarGift2.gift;
                if (starGift != starGift2) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                        if (starGift.f28721id == starGift2.f28721id) {
                            return true;
                        }
                        return false;
                    } else if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.f28721id == starGift2.f28721id && savedStarGift.date == savedStarGift2.date) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean z1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique != tL_starGiftUnique2) {
            if (tL_starGiftUnique != null) {
                if (tL_starGiftUnique.f28721id == tL_starGiftUnique2.f28721id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void A2() {
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 == null) {
            return;
        }
        TLRPC.Peer peer = M1.owner_id;
        if (peer == null) {
            peer = M1.host_id;
        }
        long o4 = org.telegram.messenger.n5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(M1.title);
        sb2.append(" #");
        this.f8802y2.setText(gd.a0(null, null, 2131749816, i5.c.l(M1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131749818, null));
        if (o4 == i10.i(this.f30223a).e() && !i10.i(this.f30223a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.T2 == null) {
                this.T2 = new kq(2131232248, 0);
            }
            spannableStringBuilder.setSpan(this.T2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        hi.e eVar = this.f8767g2;
        eVar.i(spannableStringBuilder, true, true);
        eVar.g(null, true);
        eVar.setOnClickListener(new p3(this, 3));
        this.f8758b2.setWearPreview(mp.u1(this.f30223a).g2(o4));
        H2(2, false, null);
        this.f8798w2 = true;
    }

    public final int B1() {
        if (this.X2.d(1)) {
            return this.f8782o2.getMeasuredHeight();
        }
        if (this.X2.d(2)) {
            return this.f8800x2.getMeasuredHeight();
        }
        if (this.X2.d(3)) {
            return this.f8804z2.getMeasuredHeight();
        }
        if (this.X2.d(4)) {
            return 0;
        }
        return this.f8760c2.getMeasuredHeight();
    }

    public final void B2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique M1 = M1();
        TL_stars.InputSavedStarGift G1 = G1();
        if (G1 != null && M1 != null) {
            TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
            tL_inputInvoiceStarGiftDropOriginalDetails.stargift = G1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
            JSONObject u10 = ki.t2.u(this.J0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.f30223a).sendRequest(tL_payments_getPaymentForm, new bi.m2(this, charSequence, M1, tL_inputInvoiceStarGiftDropOriginalDetails, 2));
        }
    }

    public final long C1() {
        TLRPC.Peer peer;
        fj fjVar = this.D2;
        if (fjVar != null) {
            TLRPC.Message message = fjVar.f24073k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                    if (peer2 != null) {
                        return org.telegram.messenger.n5.o(peer2);
                    }
                    if (fjVar.P3()) {
                        return fj.B0(this.D2.f24073k);
                    }
                    return i10.i(this.f30223a).e();
                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (peer = starGift.owner_id) != null) {
                        return org.telegram.messenger.n5.o(peer);
                    }
                    TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
                    if (peer3 != null) {
                        return org.telegram.messenger.n5.o(peer3);
                    }
                    return 0L;
                } else {
                    return 0L;
                }
            }
            return 0L;
        }
        TL_stars.SavedStarGift savedStarGift = this.B2;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                return org.telegram.messenger.n5.o(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
            }
            return this.T1;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F2;
        if (tL_starGiftUnique != null) {
            return org.telegram.messenger.n5.o(tL_starGiftUnique.owner_id);
        }
        return 0L;
    }

    public final void C2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        org.telegram.ui.Components.nc ncVar;
        float primaryHorizontal;
        int i7;
        hi.u3 u3Var = this.f8801x3;
        if ((u3Var == null || !u3Var.W || this.f8803y3 != view) && view != null) {
            if (z10) {
                if (view instanceof org.telegram.ui.ActionBar.n5) {
                    org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) view;
                    primaryHorizontal = (n5Var.getRightDrawableWidth() / 2.0f) + n5Var.getRightDrawableX();
                } else {
                    return;
                }
            } else {
                if (view instanceof TextView) {
                    layout = ((TextView) view).getLayout();
                } else if (view instanceof org.telegram.ui.ActionBar.n5) {
                    layout = ((org.telegram.ui.ActionBar.n5) view).getLayout();
                } else {
                    return;
                }
                if (layout != null) {
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        org.telegram.ui.Components.nc[] ncVarArr = (org.telegram.ui.Components.nc[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.nc.class);
                        if (ncVarArr != null && ncVarArr.length > 0) {
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(ncVarArr[ncVarArr.length - 1])) + view.getPaddingLeft() + (ncVar.a() / 2.0f);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(r5);
            n4 n4Var = this.U1;
            n4Var.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            hi.u3 u3Var2 = this.f8801x3;
            if (u3Var2 != null) {
                u3Var2.f(true);
                this.f8801x3 = null;
            }
            hi.u3 u3Var3 = new hi.u3(getContext(), 3);
            u3Var3.r(!z10);
            u3Var3.v(charSequence);
            u3Var3.p(0.0f, (iArr2[0] + primaryHorizontal) - (org.telegram.messenger.g0.L(16.0f) + this.f30261u0));
            float L = (iArr2[1] - org.telegram.messenger.g0.L(100.0f)) - (view.getHeight() / 2.0f);
            if (z10) {
                i7 = 18;
            } else {
                i7 = 0;
            }
            u3Var3.setTranslationY(L + org.telegram.messenger.g0.L(i7 + 4.33f));
            u3Var3.d = 3000L;
            u3Var3.setPadding(org.telegram.messenger.g0.L(16.0f) + this.f30261u0, 0, org.telegram.messenger.g0.L(16.0f) + this.f30261u0, 0);
            u3Var3.f15506r0 = new bi.c0(u3Var3, 1);
            u3Var3.x();
            n4Var.addView(u3Var3, c8.na.c(100.0f, -1));
            this.f8801x3 = u3Var3;
            this.f8803y3 = view;
        }
    }

    public final TL_stars.StarGift D1() {
        fj fjVar = this.D2;
        if (fjVar != null) {
            TLRPC.Message message = fjVar.f24073k;
            if (message == null) {
                return null;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                return ((TLRPC.TL_messageActionStarGift) messageAction).gift;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F2;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final void D2(int i7, Context context, boolean z10) {
        int i10;
        int i11;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(64.0f);
        int i12 = org.telegram.ui.ActionBar.n6.Fi;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i12, this.J0));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        frameLayout.setBackground(L2);
        org.telegram.ui.ActionBar.u6.j(frameLayout, L2, M, null, i6Var);
        g10.addView(frameLayout, c8.na.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624292, 42, 42, null);
        frameLayout.addView((View) imageView, c8.na.r(64, 64, 17));
        imageView.d();
        TextView b10 = c8.wa.b(context, 20.0f, org.telegram.ui.ActionBar.n6.G6, true, null);
        b10.setGravity(17);
        if (z10) {
            i10 = 2131749988;
        } else {
            i10 = 2131749894;
        }
        b10.setText(gd.N0(i10, null));
        g10.addView(b10, c8.na.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = c8.wa.b(context, 14.0f, org.telegram.ui.ActionBar.n6.F6, false, null);
        b11.setGravity(17);
        if (z10) {
            i11 = 2131749989;
        } else {
            i11 = 2131749895;
        }
        b11.setText(gd.a0(null, null, i11, gd.c0(Math.max(10, i7))));
        g10.addView(b11, c8.na.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, this.J0);
        alertDialog$Builder.o(g10);
        alertDialog$Builder.k(gd.N0(2131747637, null), null);
        alertDialog$Builder.p();
    }

    @Override
    public final void E0(int i7) {
        super.E0(i7);
        org.telegram.messenger.g0.s3(this, 0, false, null);
    }

    public final String E1() {
        TL_stars.StarGift D1 = D1();
        if (D1 instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) D1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return i5.c.l(tL_starGiftUnique.num, ',', sb2);
        }
        return "";
    }

    public final boolean E2() {
        if (!bi.a5.m(M1())) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String N0 = gd.N0(2131749901, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = gd.N0(2131749514, null);
        if (t1()) {
            alertDialog$Builder.k(gd.N0(2131750415, null), new g2(this, 2));
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
        } else {
            alertDialog$Builder.k(gd.N0(2131747637, null), null);
        }
        alertDialog$Builder.p();
        return true;
    }

    @Override
    public final boolean F() {
        if (this.X2.c(4)) {
            boolean z10 = this.f8758b2.N.f8533i0;
        }
        return false;
    }

    public final boolean F2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (com.google.android.gms.internal.vision.e2.s(tL_starGiftUnique) && !TextUtils.isEmpty(tL_starGiftUnique.gift_address) && !TextUtils.isEmpty(tL_starGiftUnique.owner_address) && !bi.a5.m(tL_starGiftUnique)) {
            org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(this.f30223a);
            if (org.telegram.ui.Wallet.v0.c(tL_starGiftUnique.owner_address, D.y()) || D.B().d(tL_starGiftUnique.gift_address)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final TL_stars.InputSavedStarGift G1() {
        TLRPC.Message message;
        long B0;
        TLRPC.Message message2;
        long B02;
        TLRPC.Message message3;
        long j3 = this.T1;
        if (j3 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = mp.u1(this.f30223a).l1(j3);
            fj fjVar = this.D2;
            if (fjVar != null && (message3 = fjVar.f24073k) != null) {
                TLRPC.MessageAction messageAction = message3.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    if ((tL_messageActionStarGift.flags & 4096) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                } else if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return null;
                } else {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGiftUnique.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
            }
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                if ((savedStarGift.flags & 2048) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            } else if (this.F2 != null && !TextUtils.isEmpty(this.E2)) {
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.E2;
                return tL_inputSavedStarGiftSlug;
            } else {
                return tL_inputSavedStarGiftChat;
            }
        }
        fj fjVar2 = this.D2;
        if (fjVar2 != null && (message2 = fjVar2.f24073k) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                mp u12 = mp.u1(this.f30223a);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                if (peer != null) {
                    B02 = org.telegram.messenger.n5.o(peer);
                } else {
                    B02 = fj.B0(this.D2.f24073k);
                }
                tL_inputSavedStarGiftChat2.peer = u12.l1(B02);
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (fjVar2 != null && (message = fjVar2.f24073k) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                mp u13 = mp.u1(this.f30223a);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                if (peer2 != null) {
                    B0 = org.telegram.messenger.n5.o(peer2);
                } else {
                    B0 = fj.B0(this.D2.f24073k);
                }
                tL_inputSavedStarGiftChat3.peer = u13.l1(B0);
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        fj fjVar3 = this.D2;
        if (fjVar3 != null) {
            TLRPC.Message message4 = fjVar3.f24073k;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = fjVar3.e1();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.B2;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        } else if (this.F2 != null && !TextUtils.isEmpty(this.E2)) {
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug2.slug = this.E2;
            return tL_inputSavedStarGiftSlug2;
        } else {
            return tL_inputSavedStarGiftUser;
        }
    }

    public final void G2(boolean z10, org.telegram.ui.ActionBar.t1 t1Var, vf.b bVar, Runnable runnable) {
        bVar.d();
        i10 i7 = i10.i(this.f30223a);
        TL_account.tmpPassword tmppassword = i7.f24667y;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.f30223a).getCurrentTime() + 60) {
            i7.f24667y = null;
            i7.v(false);
        }
        TL_account.tmpPassword tmppassword2 = i7.f24667y;
        if (tmppassword2 == null) {
            i2(z10, bVar, runnable);
        } else {
            O1(tmppassword2.tmp_password, null, z10, new x2(this, z10, bVar, runnable, t1Var));
        }
    }

    @Override
    public final boolean H() {
        if (this.X2.c(4) && this.f8758b2.N.f8533i0) {
            return false;
        }
        return this.f30232d0;
    }

    public final String H1() {
        TL_stars.StarGift D1 = D1();
        if ((D1 instanceof TL_stars.TL_starGiftUnique) && D1.slug != null) {
            return mp.u1(this.f30223a).X2 + "/nft/" + D1.slug;
        }
        return null;
    }

    public final void H2(int r12, boolean r13, ch.k r14) {
        throw new UnsupportedOperationException("Method not decompiled: di.f6.H2(int, boolean, ch.k):void");
    }

    @Override
    public final boolean I(MotionEvent motionEvent) {
        if (this.X2.c(4)) {
            boolean z10 = this.f8758b2.N.f8533i0;
        }
        return false;
    }

    public final int I1() {
        int indexOf;
        q8 q8Var = this.C2;
        if (q8Var != null) {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                indexOf = q8Var.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F2;
                if (tL_starGiftUnique != null) {
                    indexOf = q8Var.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift D1 = D1();
            for (int i7 = 0; i7 < this.C2.e(); i7++) {
                Object obj = this.C2.get(i7);
                if (obj instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift2 = this.B2;
                    if (savedStarGift2 != null) {
                        if (y1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                            return i7;
                        }
                    }
                    if (D1 != null) {
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (D1 != starGift) {
                            if ((D1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && D1.f28721id == starGift.f28721id) {
                            }
                        }
                        return i7;
                    }
                    continue;
                } else {
                    if ((obj instanceof TL_stars.TL_starGiftUnique) && z1(this.F2, (TL_stars.TL_starGiftUnique) obj)) {
                        return i7;
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    public final void I2(boolean z10) {
        f6 f6Var;
        int i7;
        int i10;
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 == null) {
            return;
        }
        mp.g1().edit().putInt("statusgiftpage", 3).apply();
        boolean U1 = U1(this.f30223a, M1());
        boolean z11 = !U1;
        boolean U12 = U1(this.f30223a, M1());
        hi.e eVar = this.f8767g2;
        if (U12) {
            mp.u1(this.f30223a).s5(C1(), new TLRPC.TL_emojiStatusEmpty(), null);
            f6Var = this;
        } else {
            long C1 = C1();
            if (C1 >= 0) {
                if (!i10.i(this.f30223a).q()) {
                    org.telegram.ui.Components.fc P = k().P(2131624217, org.telegram.messenger.g0.x2(gd.N0(2131750406, null), new k1(this, 3)));
                    P.f35101t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                mp u12 = mp.u1(this.f30223a);
                eVar.setLoading(true);
                mp.u1(this.f30223a).I0().a(C1, new bi.d4(this, u12, C1, 2));
                return;
            }
            f6Var = this;
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = M1.f28721id;
            mp.u1(f6Var.f30223a).s5(C1(), tL_inputEmojiStatusCollectible, M1);
        }
        ai.h0 h0Var = f6Var.f8758b2.J[1];
        if (!U1) {
            i7 = 2131231104;
        } else {
            i7 = 2131231105;
        }
        if (!U1) {
            i10 = 2131750405;
        } else {
            i10 = 2131750408;
        }
        h0Var.e(i7, gd.N0(i10, null), true);
        if (f6Var.f8798w2) {
            dismiss();
            return;
        }
        ch.k kVar = new ch.k(2, this, z11);
        if (f6Var.X2.c(0)) {
            kVar.run();
        } else {
            H2(0, true, kVar);
        }
        eVar.i(gd.N0(2131747637, null), !f6Var.f8757a3, true);
        eVar.g(null, !f6Var.f8757a3);
        eVar.setOnClickListener(new i1(this, 11));
    }

    public final TL_stars.SavedStarGift J1(boolean z10) {
        int i7;
        Object obj;
        int I1 = I1();
        if (I1 < 0) {
            return null;
        }
        if (z10) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i10 = i7 + I1;
        int i11 = this.Q2;
        if (i11 >= 0 && (!z10 ? i11 < I1 : i11 > I1)) {
            i10 = i11;
        }
        q8 q8Var = this.C2;
        if (q8Var != null && i10 >= 0 && i10 < q8Var.e()) {
            obj = this.C2.get(i10);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.SavedStarGift)) {
            return null;
        }
        return (TL_stars.SavedStarGift) obj;
    }

    public final void J2() {
        FrameLayout frameLayout = this.f8773j2;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.f8776l2;
        FrameLayout frameLayout3 = this.f8769h2;
        if (visibility == 0) {
            frameLayout3.setTranslationY(this.X2.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.X2.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.X2.a(1) * (-frameLayout.getMeasuredHeight()));
            return;
        }
        frameLayout3.setTranslationY(0.0f);
        frameLayout.setTranslationY(0.0f);
        frameLayout2.setTranslationY(0.0f);
    }

    public final TL_stars.TL_starGiftUnique K1(boolean z10) {
        int i7;
        Object obj;
        int I1 = I1();
        if (I1 < 0) {
            return null;
        }
        if (z10) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        int i10 = i7 + I1;
        int i11 = this.Q2;
        if (i11 >= 0 && (!z10 ? i11 < I1 : i11 > I1)) {
            i10 = i11;
        }
        q8 q8Var = this.C2;
        if (q8Var != null && i10 >= 0 && i10 < q8Var.e()) {
            obj = this.C2.get(i10);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return (TL_stars.TL_starGiftUnique) obj;
    }

    public final void K2() {
        boolean N1 = N1(false);
        h4 h4Var = this.V1;
        h4Var.setPosition(N1 ? 1 : 0);
        h4Var.A(false);
        if (this.C2 != null && !N1(true) && this.C2.e() < this.C2.c()) {
            this.C2.a();
        }
    }

    public final void L2() {
        TL_stars.TL_starGiftUnique M1 = M1();
        TL_wallet.nftItem nftitem = this.f8759b3;
        LinearLayout linearLayout = this.f8794u2;
        if (nftitem != null && M1 != null) {
            this.d2.setVisibility(8);
            this.f8765f2.setVisibility(8);
            boolean z10 = false;
            linearLayout.setVisibility(0);
            if (M1.host_id != null) {
                z10 = true;
            }
            this.f8796v2.a(z10, linearLayout.isAttachedToWindow());
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        l4 l4Var = new l4(this, 0);
        this.P2 = l4Var;
        return l4Var;
    }

    public final TL_stars.TL_starGiftUnique M1() {
        TL_stars.StarGift D1 = D1();
        if (D1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) D1;
        }
        return null;
    }

    public final TL_wallet.nftItem M2() {
        TL_wallet.nftItem nftitem = this.f8759b3;
        if (nftitem != null) {
            return nftitem;
        }
        TL_stars.TL_starGiftUnique M1 = M1();
        if (F2(M1)) {
            org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(this.f30223a);
            if (M1 != null && !TextUtils.isEmpty(M1.gift_address)) {
                ArrayList arrayList = D.B().f44630b;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) obj;
                    if (org.telegram.ui.Wallet.v0.c(nftitem2.address, M1.gift_address)) {
                        return nftitem2;
                    }
                }
                TL_wallet.nftItem nftitem3 = new TL_wallet.nftItem();
                nftitem3.address = M1.gift_address;
                nftitem3.owner_address = D.y();
                nftitem3.index = "";
                nftitem3.name = M1.title + " #" + M1.num;
                nftitem3.gift = M1;
                return nftitem3;
            }
            return null;
        }
        return null;
    }

    public final boolean N1(boolean z10) {
        if (J1(z10) == null && K1(z10) == null) {
            return false;
        }
        return true;
    }

    @Override
    public final int O0() {
        return org.telegram.messenger.g0.L(12.0f);
    }

    public final void O1(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, x2 x2Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift G1 = G1();
        if (G1 == null) {
            if (x2Var != null) {
                x2Var.a(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z10) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.f8799w3;
            withdrawstargift.stargift = G1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = G1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.f30223a).sendRequest(getstargiftwithdrawalurl, new j3(this, x2Var, twoStepVerificationActivity, z10, 0));
    }

    @Override
    public final CharSequence P0() {
        return this.R2;
    }

    public final boolean Q1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique != null && !TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
            org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(this.f30223a);
            String y10 = D.y();
            if (TextUtils.isEmpty(y10)) {
                TLRPC.Peer peer = tL_starGiftUnique.host_id;
                if (peer == null || org.telegram.messenger.n5.o(peer) != i10.i(this.f30223a).e()) {
                    return false;
                }
                return true;
            } else if (org.telegram.ui.Wallet.v0.c(tL_starGiftUnique.owner_address, y10) || D.B().d(tL_starGiftUnique.gift_address)) {
                return true;
            }
        }
        return false;
    }

    public final boolean T1(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (com.google.android.gms.internal.vision.e2.s(tL_starGiftUnique) && bi.a5.m(tL_starGiftUnique)) {
            if (!tL_starGiftUnique.my_sale && this.f8759b3 == null) {
                TLRPC.Peer peer = tL_starGiftUnique.host_id;
                if (peer == null || org.telegram.messenger.n5.o(peer) != i10.i(this.f30223a).e()) {
                    if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address) && org.telegram.ui.Wallet.v0.c(tL_starGiftUnique.owner_address, org.telegram.ui.Wallet.v0.D(this.f30223a).y())) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final void V1() {
        cg.b bVar;
        TL_stars.TL_starGiftUnique M1 = M1();
        hi.e eVar = this.f8767g2;
        if (!eVar.R && M1 != null && !P1(this.f30223a, M1) && !T1(M1)) {
            boolean m10 = bi.a5.m(M1);
            long j3 = this.T1;
            if (m10) {
                if (this.F2 == null || !this.G2 || j3 == 0) {
                    j3 = i10.i(this.f30223a).e();
                }
                long j10 = j3;
                if (this.F2 != null && this.G2 && j10 != i10.i(this.f30223a).e()) {
                    bi.k1 k1Var = new bi.k1(getContext(), this.J0, M1, j10);
                    k1Var.F1 = new bg.f0(this, k1Var, M1, j10, 1);
                    k1Var.show();
                    return;
                }
                p1(M1, j10, null, true, null);
                return;
            }
            if (this.F2 == null || !this.G2 || j3 == 0) {
                j3 = i10.i(this.f30223a).e();
            }
            long j11 = j3;
            if (M1.resale_ton_only) {
                bVar = cg.b.f5269b;
            } else {
                bVar = cg.b.f5268a;
            }
            cg.b bVar2 = bVar;
            if (this.F2 != null && this.G2 && j11 != i10.i(this.f30223a).e()) {
                bi.k1 k1Var2 = new bi.k1(getContext(), this.J0, M1, j11);
                k1Var2.F1 = new t1(this, k1Var2, M1, j11, bVar2, 1);
                k1Var2.show();
                return;
            }
            eVar.setLoading(true);
            y8.x(this.f30223a, bVar2).H(M1, j11, null, true, new r1(this, null, bVar2, M1, j11, null, true));
        }
    }

    public final void W1() {
        z3 z3Var = this.V2;
        if (z3Var != null && !z3Var.J) {
            z3Var.dismiss();
        }
        String H1 = H1();
        z3 z3Var2 = new z3(this, getContext(), H1, H1, this.J0);
        this.V2 = z3Var2;
        z3Var2.f42985o2 = new ob.c(this, 16);
        z3Var2.show();
    }

    public final void X1() {
        throw new UnsupportedOperationException("Method not decompiled: di.f6.X1():void");
    }

    public final void Y1(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        int i7;
        int i10;
        int L;
        int i11;
        int i12;
        int L2;
        int i13;
        int i14;
        int i15;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            org.telegram.ui.Components.kc.c0("NULL_ERROR");
        } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.f30223a).sendRequest(new TL_account.getPassword(), new l3(this, twoStepVerificationActivity, z10, 1), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
            }
            if (z10 && ("WALLET_CREATING".equals(tL_error.text) || "WALLET_UNAVAILABLE".equals(tL_error.text))) {
                bi.a5.q(getContext(), this.f30223a, this.J0, null, tL_error.text, null);
                return;
            }
            String str = tL_error.text;
            if (str != null && str.startsWith("FLOOD_WAIT")) {
                org.telegram.messenger.f3.o(null, 2131750670, org.telegram.ui.Components.kc.Y(), null);
            } else {
                org.telegram.ui.Components.kc.e0(tL_error);
            }
        } else {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            String N0 = gd.N0(2131749883, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(getContext());
            int i16 = org.telegram.ui.ActionBar.n6.f29559j5;
            org.telegram.ui.ActionBar.u6.U(textView, i16, null);
            textView.setTextSize(1, 16.0f);
            if (gd.f24314a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            textView.setGravity(i7 | 48);
            textView.setText(org.telegram.messenger.g0.W2(gd.N0(2131749887, null)));
            linearLayout.addView(textView, c8.na.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, c8.na.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(2131231627);
            if (gd.f24314a0) {
                i10 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i10 = 0;
            }
            int L3 = org.telegram.messenger.g0.L(9.0f);
            if (gd.f24314a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(11.0f);
            }
            imageView.setPadding(i10, L3, L, 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6.s(imageView, i16, null, mode);
            TextView textView2 = new TextView(getContext());
            org.telegram.ui.ActionBar.u6.U(textView2, i16, null);
            textView2.setTextSize(1, 16.0f);
            if (gd.f24314a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 48);
            textView2.setText(org.telegram.messenger.g0.W2(gd.N0(2131749886, null)));
            if (gd.f24314a0) {
                linearLayout2.addView(textView2, c8.na.o(-1, -2));
                linearLayout2.addView(imageView, c8.na.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, c8.na.o(-2, -2));
                linearLayout2.addView(textView2, c8.na.o(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, c8.na.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(2131231627);
            if (gd.f24314a0) {
                i12 = org.telegram.messenger.g0.L(11.0f);
            } else {
                i12 = 0;
            }
            int L4 = org.telegram.messenger.g0.L(9.0f);
            if (gd.f24314a0) {
                L2 = 0;
            } else {
                L2 = org.telegram.messenger.g0.L(11.0f);
            }
            imageView2.setPadding(i12, L4, L2, 0);
            org.telegram.ui.ActionBar.u6.s(imageView2, i16, null, mode);
            TextView textView3 = new TextView(getContext());
            org.telegram.ui.ActionBar.u6.U(textView3, i16, null);
            textView3.setTextSize(1, 16.0f);
            if (gd.f24314a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView3.setGravity(i13 | 48);
            textView3.setText(org.telegram.messenger.g0.W2(gd.N0(2131749885, null)));
            if (gd.f24314a0) {
                linearLayout3.addView(textView3, c8.na.o(-1, -2));
                i14 = 5;
                linearLayout3.addView(imageView2, c8.na.r(-2, -2, 5));
            } else {
                i14 = 5;
                linearLayout3.addView(imageView2, c8.na.o(-2, -2));
                linearLayout3.addView(textView3, c8.na.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(gd.N0(2131749882, null), new ci.v(this, 3));
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
            } else {
                TextView textView4 = new TextView(getContext());
                org.telegram.ui.ActionBar.u6.U(textView4, i16, null);
                textView4.setTextSize(1, 16.0f);
                if (gd.f24314a0) {
                    i15 = i14;
                } else {
                    i15 = 3;
                }
                org.telegram.messenger.f3.k(textView4, i15 | 48, null, 2131749884);
                linearLayout.addView(textView4, c8.na.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(gd.N0(2131747637, null), null);
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.showDialog(t1Var);
            } else {
                alertDialog$Builder.p();
            }
        }
    }

    public final void Z1() {
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 == null) {
            return;
        }
        if (bi.a5.u(M1)) {
            if (t1()) {
                e2();
                return;
            } else {
                bi.a5.q(getContext(), this.f30223a, this.J0, k(), "STARGIFT_ONCHAIN_SALE_DISABLED", Boolean.valueOf(M1.fixed_sale));
                return;
            }
        }
        pb.j1(getContext(), this.f30223a, M1, new t3(this, M1, 2), this.J0);
    }

    @Override
    public final boolean a1() {
        return false;
    }

    public final void a2() {
        throw new UnsupportedOperationException("Method not decompiled: di.f6.a2():void");
    }

    public final void b2() {
        if (i10.i(this.f30223a).q() && (U1(this.f30223a, M1()) || this.U2)) {
            I2(false);
            return;
        }
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 == null) {
            return;
        }
        TLRPC.Peer peer = M1.owner_id;
        if (peer == null) {
            peer = M1.host_id;
        }
        long o4 = org.telegram.messenger.n5.o(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(M1.title);
        sb2.append(" #");
        this.f8802y2.setText(gd.a0(null, null, 2131749816, i5.c.l(M1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131749818, null));
        if (!i10.i(this.f30223a).q()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.T2 == null) {
                this.T2 = new kq(2131232248, 0);
            }
            spannableStringBuilder.setSpan(this.T2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        hi.e eVar = this.f8767g2;
        eVar.i(spannableStringBuilder, true, true);
        eVar.g(null, true);
        eVar.setOnClickListener(new i1(this, 10));
        this.f8758b2.setWearPreview(mp.u1(this.f30223a).g2(o4));
        H2(2, true, null);
    }

    public final void c2(boolean z10) {
        int i7;
        fj fjVar = this.D2;
        int i10 = 0;
        if (fjVar != null) {
            TLRPC.Message message = fjVar.f24073k;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i7 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                i7 = savedStarGift.can_craft_at;
            }
            i7 = 0;
        }
        if (i7 > ConnectionsManager.getInstance(this.f30223a).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
            String N0 = gd.N0(2131749760, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = gd.a0(null, null, 2131749761, gd.x(i7, true));
            org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(M1.gift_address) && !((org.telegram.messenger.h0) mp.u1(this.f30223a).A7.f26267x.f17372b).f24439c) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getContext(), this.J0);
            String N02 = gd.N0(2131749775, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
            t1Var2.S = N02;
            t1Var2.U = gd.N0(2131749776, null);
            org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder2, null);
            return;
        }
        z5 z5Var = this.f8758b2;
        if (z10) {
            z5Var.N.a(this.f30223a, M1.gift_id, M1.getDocument(), M1.title);
            if (r1()) {
                b5 b5Var = z5Var.N;
                TL_stars.TL_starGiftUnique M12 = M1();
                if (M12 == null) {
                    b5Var.getClass();
                } else {
                    while (true) {
                        z4[] z4VarArr = b5Var.f8537n;
                        if (i10 >= z4VarArr.length) {
                            break;
                        }
                        z4 z4Var = z4VarArr[i10];
                        TL_stars.StarGift starGift = z4Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            z4Var.a(M12, true);
                            break;
                        }
                        i10++;
                    }
                    b5Var.d(true);
                }
            }
        }
        b5 b5Var2 = z5Var.N;
        b5 b5Var3 = z5Var.N;
        b5Var2.setOnCraft(new q1(this, 1));
        if (this.S2 == null) {
            bi.k8 k8Var = new bi.k8(this.f30223a, M1.gift_id);
            this.S2 = k8Var;
            k8Var.a();
        }
        b5Var3.setOnAddGift(new t3(this, M1, 1));
        b5Var3.setOnClose(new r3(this, 2));
        H2(4, true, null);
    }

    public final void d2(long j3) {
        if (j3 > 0 && n10.c(mp.u1(this.f30223a).d2(j3))) {
            k().Q(2131624012, 36, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131743495, org.telegram.messenger.n5.t(j3)))).k(false);
        } else {
            new bi.p3(getContext(), this.f30223a, j3, null, new n1(this, 0)).show();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.I3;
        z5 z5Var = this.f8758b2;
        boolean z10 = true;
        if (i7 == i11) {
            if (this.C2 == ((p8) objArr[1])) {
                b5 b5Var = z5Var.N;
                if (b5Var == null || !b5Var.f8533i0) {
                    K2();
                }
            }
        } else if (i7 == ks.f25201d4) {
            z5Var.setInWallet((this.f8764e3 == null && this.f8759b3 == null && F2(M1())) ? false : false);
        }
    }

    @Override
    public final void dismiss() {
        if (this.X2.c(4) && this.f8758b2.N.f8533i0) {
            return;
        }
        bi.k8 k8Var = this.S2;
        if (k8Var != null) {
            k8Var.b();
            this.S2 = null;
        }
        o5 o5Var = this.L2;
        if (o5Var != null) {
            o5Var.a();
        }
        super.dismiss();
    }

    public final void e2() {
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 != null && M1.fixed_sale) {
            if (!t1()) {
                return;
            }
            bi.g5 g5Var = new bi.g5(this.f30223a, getContext(), new y1(this, r5, M1, 1), this.J0);
            bi.g5[] g5VarArr = {g5Var};
            cg.b bVar = cg.b.f5269b;
            long j3 = M1.getResellAmount(bVar).f5267b;
            g5Var.f3615v1 = true;
            g5Var.f3616w1 = j3;
            g5Var.f3612s1.setText(gd.N0(2131750247, null));
            if (j3 > 0) {
                String b10 = cg.a.j(j3, bVar).b();
                EditTextBoldCursor editTextBoldCursor = g5Var.f3608o1;
                InputFilter[] filters = editTextBoldCursor.getFilters();
                editTextBoldCursor.setFilters(new InputFilter[0]);
                g5Var.f3617x1 = true;
                editTextBoldCursor.setText(b10);
                g5Var.f3617x1 = false;
                editTextBoldCursor.setFilters(filters);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            g5Var.J0(g5Var.f3613t1);
            g5VarArr[0].show();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String N0 = gd.N0(2131750247, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = gd.N0(2131749649, null);
        alertDialog$Builder.k(gd.N0(2131750415, null), new g2(this, 0));
        alertDialog$Builder.h(gd.N0(2131752577, null), null);
        alertDialog$Builder.p();
    }

    public final void f2() {
        boolean z10;
        int i7;
        TL_stars.TL_starGiftUnique M1 = M1();
        if (!t1()) {
            return;
        }
        bi.g5[] g5VarArr = {new bi.g5(this.f30223a, getContext(), new y1(this, g5VarArr, M1, 0), this.J0)};
        org.telegram.messenger.p0 p0Var = mp.u1(this.f30223a).A7;
        bi.g5 g5Var = g5VarArr[0];
        if (M1 != null && M1.onchain_sale) {
            z10 = M1.fixed_sale;
        } else {
            z10 = ((org.telegram.messenger.h0) p0Var.f26263u.f17372b).f24439c;
        }
        g5Var.f3618y1 = z10;
        if (!g5Var.f3615v1) {
            TextView textView = g5Var.f3612s1;
            if (z10) {
                i7 = 2131749528;
            } else {
                i7 = 2131749515;
            }
            textView.setText(gd.N0(i7, null));
        }
        g5Var.J0(g5Var.f3613t1);
        g5VarArr[0].show();
    }

    public final void g2() {
        TL_stars.TL_starGiftUnique M1 = M1();
        if (t1()) {
            Context context = getContext();
            int i7 = this.f30223a;
            org.telegram.ui.ActionBar.i6 i6Var = this.J0;
            hi.e eVar = this.f8767g2;
            Objects.requireNonNull(eVar);
            ai.d0 d0Var = new ai.d0(eVar, 3);
            org.telegram.ui.Components.kc k10 = k();
            k1 k1Var = new k1(this, 9);
            if (M1 != null && !TextUtils.isEmpty(M1.slug)) {
                TL_stars.cancelStarGiftOnchainSale cancelstargiftonchainsale = new TL_stars.cancelStarGiftOnchainSale();
                cancelstargiftonchainsale.slug = M1.slug;
                bi.a5.o(context, i7, cancelstargiftonchainsale, Boolean.valueOf(M1.fixed_sale), i6Var, d0Var, k10, new bi.z3(M1, context, i7, i6Var, bi.a5.h(M1), k1Var));
            }
        }
    }

    public final void h2(long j3) {
        hi.u3 u3Var = this.f8801x3;
        if (u3Var != null) {
            u3Var.f(true);
            this.f8801x3 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T != null && !n10.B(j3)) {
            Bundle bundle = new Bundle();
            if (j3 > 0) {
                bundle.putLong("user_id", j3);
                if (j3 == i10.i(this.f30223a).e()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j3);
            }
            bundle.putBoolean("open_gifts", true);
            T.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    public final void i2(boolean z10, vf.b bVar, Runnable runnable) {
        int i7;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        if (z10) {
            i7 = 3;
        } else {
            i7 = 2;
        }
        ab.j jVar = new ab.j(this, twoStepVerificationActivity, z10, 1);
        twoStepVerificationActivity.f43998a0 = i7;
        twoStepVerificationActivity.f44002c0 = jVar;
        twoStepVerificationActivity.f44000b0 = E1();
        twoStepVerificationActivity.x0(new aa.r(this, runnable, bVar, twoStepVerificationActivity, 23));
    }

    public final void j2() {
        throw new UnsupportedOperationException("Method not decompiled: di.f6.j2():void");
    }

    @Override
    public org.telegram.ui.Components.kc k() {
        return new org.telegram.ui.Components.kc(this.f8776l2, this.J0);
    }

    public final void k2(long j3, long j10, SpannableStringBuilder spannableStringBuilder, boolean z10, w10 w10Var) {
        String str;
        TLRPC.User user;
        String a02;
        SpannableStringBuilder W2;
        CharSequence N0;
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 == null) {
            return;
        }
        if (j3 >= 0) {
            TLRPC.User c22 = mp.u1(this.f30223a).c2(Long.valueOf(j3));
            str = n10.l(c22);
            user = c22;
        } else {
            TLRPC.Chat O0 = mp.u1(this.f30223a).O0(Long.valueOf(-j3));
            if (O0 == null) {
                str = "";
                user = O0;
            } else {
                str = O0.title;
                user = O0;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new d5(getContext(), M1, user), c8.na.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, this.J0);
        textView.setTextSize(1, 16.0f);
        if (spannableStringBuilder != null) {
            W2 = spannableStringBuilder;
        } else {
            if (j10 > 0) {
                a02 = gd.K("Gift2TransferPriceText", (int) j10, ',', E1(), org.telegram.messenger.n5.t(j3));
            } else {
                a02 = gd.a0(null, null, 2131749896, E1(), str);
            }
            W2 = org.telegram.messenger.g0.W2(a02);
        }
        textView.setText(W2);
        linearLayout.addView(textView, c8.na.t(-1, -2, 48, 24, 4, 24, 4));
        dy0 dy0Var = new dy0(getContext(), this.J0);
        m1(dy0Var, y8.l(M1.attributes, TL_stars.starGiftAttributeModel.class));
        m1(dy0Var, y8.l(M1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        m1(dy0Var, y8.l(M1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(M1.slug) && (M1.flags & 256) != 0) {
            org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
            long j11 = M1.value_amount;
            String str2 = M1.value_currency;
            int h = org.telegram.messenger.r1.i().h(M1.value_currency);
            i7.getClass();
            dy0Var.e(gd.N0(2131749415, null), p5.c.k("~", org.telegram.messenger.r1.g(str2, h, j11, true)), null, null);
        }
        linearLayout.addView(dy0Var, c8.na.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        alertDialog$Builder.o(linearLayout);
        if (j10 > 0) {
            N0 = pb.T0(gd.a0(null, null, 2131749903, Integer.valueOf((int) j10)));
        } else {
            N0 = gd.N0(2131749904, null);
        }
        alertDialog$Builder.k(N0, new a1.c(w10Var, 25));
        alertDialog$Builder.h(gd.N0(2131752577, null), null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.Y0 = z10;
        t1Var.show();
    }

    public final void l1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String N0;
        boolean z10;
        o5 o5Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        f6 f6Var;
        ai.j jVar;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            N0 = gd.N0(2131750370, null);
            z10 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            N0 = gd.N0(2131750363, null);
            z10 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            N0 = gd.N0(2131750371, null);
            z10 = false;
        } else {
            return;
        }
        if (!this.M2 && ((o5Var = this.L2) == null || !o5Var.f9434o)) {
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.mc[] mcVarArr = new org.telegram.ui.Components.mc[1];
            Integer[] numArr = new Integer[1];
            String L1 = L1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                f6Var = this;
                jVar = new ai.j((Object) this, zArr, (Object) starGiftAttribute2, (Object) mcVarArr, 10);
            } else {
                starGiftAttribute2 = starGiftAttribute;
                f6Var = this;
                jVar = null;
            }
            mcVarArr[0] = (org.telegram.ui.Components.mc) ((ay0) f6Var.f8763e2.d(N0, starGiftAttribute2.name, L1, jVar, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        t5 t5Var = new t5(getContext(), this.J0, new q1(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        dy0 dy0Var = this.f8763e2;
        tableRow.addView(new cy0(dy0Var, N0), layoutParams);
        tableRow.addView(new ay0(dy0Var, t5Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        dy0Var.addView(tableRow);
        o5 o5Var2 = this.L2;
        if (o5Var2 != null) {
            if (!z10) {
                o5Var2.d = t5Var;
            }
            if (z10) {
                o5Var2.f9424c = t5Var;
            }
            if (z10) {
                o5Var2.f9423b = t5Var;
            }
        }
    }

    public final void l2(long j3, w10 w10Var) {
        TLRPC.Message message;
        long j10;
        TL_stars.SavedStarGift savedStarGift = this.B2;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j10 = savedStarGift.transfer_stars;
        } else {
            fj fjVar = this.D2;
            if (fjVar != null && (message = fjVar.f24073k) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    if (tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique) {
                        j10 = tL_messageActionStarGiftUnique.transfer_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        k2(j3, j10, null, true, w10Var);
    }

    public final void m2() {
        TL_stars.InputSavedStarGift G1;
        long j3;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        int i7;
        hi.u3 u3Var = this.f8801x3;
        if (u3Var != null) {
            u3Var.f(true);
            this.f8801x3 = null;
        }
        if (this.Y2 == null && (G1 = G1()) != null) {
            fj fjVar = this.D2;
            long j12 = this.T1;
            if (fjVar != null) {
                TLRPC.MessageAction messageAction = fjVar.f24073k.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j10 = tL_messageActionStarGift.gift.f28721id;
                    j11 = tL_messageActionStarGift.upgrade_stars;
                    z10 = tL_messageActionStarGift.name_hidden;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j3 = 0;
                    z12 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                    str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    if (tL_messageActionStarGift.prepaid_upgrade) {
                        if (org.telegram.messenger.n5.o(tL_messageActionStarGift.from_id) != this.D2.Z0()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = tL_messageActionStarGift.upgrade_separate;
                    }
                } else {
                    return;
                }
            } else {
                j3 = 0;
                TL_stars.SavedStarGift savedStarGift = this.B2;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    j10 = starGift.f28721id;
                    j11 = savedStarGift.upgrade_stars;
                    if ((starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j12 < 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TL_stars.SavedStarGift savedStarGift2 = this.B2;
                    str = savedStarGift2.prepaid_upgrade_hash;
                    z13 = savedStarGift2.upgrade_separate;
                } else {
                    return;
                }
            }
            TextView textView = this.f8792t2;
            if (z10) {
                if (z12) {
                    i7 = 2131750381;
                } else {
                    i7 = 2131750382;
                }
                textView.setText(gd.N0(i7, null));
            } else if (z11) {
                textView.setText(gd.N0(2131750379, null));
            } else {
                textView.setText(gd.N0(2131750380, null));
            }
            if (!z10 && j11 > j3 && !z13) {
                z14 = true;
            } else {
                z14 = false;
            }
            lp lpVar = this.f8790s2;
            lpVar.a(z14, false);
            ArrayList arrayList = this.f8781n3;
            if (arrayList != null && (j11 > j3 || this.f8789r3 != null)) {
                n2();
                return;
            }
            if (arrayList == null) {
                y8.y(this.f30223a, false).K(j10, new n1(this, 2));
            }
            if (j11 <= j3 && this.f8789r3 == null) {
                this.f8787q3 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = mp.u1(this.f30223a).l1(j12);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = lpVar.f37189a.f32938q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = G1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject u10 = ki.t2.u(this.J0, false);
                if (u10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.f30223a).sendRequest(tL_payments_getPaymentForm, new w3(this, 0));
            }
        }
    }

    public final void n1(LinearLayout linearLayout, int i7, int i10, int i11, String str, boolean z10) {
        int i12;
        int i13;
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i7);
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.s(imageView, i11, i6Var, mode);
        if (i10 < 15) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        if (i10 < 15) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        linearLayout.addView(imageView, c8.na.t(i10, i10, 16, i12, 0, i13, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i14 = org.telegram.ui.ActionBar.n6.f29709r5;
        org.telegram.ui.ActionBar.u6.U(textView, i14, this.J0);
        textView.setText(str);
        linearLayout.addView(textView, c8.na.t(-2, -2, 16, 4, 0, 0, 0));
        if (z10) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(2131232255);
            org.telegram.ui.ActionBar.u6.s(imageView2, i14, this.J0, mode);
            linearLayout.addView(imageView2, c8.na.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void n2() {
        throw new UnsupportedOperationException("Method not decompiled: di.f6.n2():void");
    }

    public final void o1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            y8.y(this.f30223a, false).O(C1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i7 = 0; i7 < updates.updates.size(); i7++) {
                    TLRPC.Update update2 = updates.updates.get(i7);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        message = ((TL_update.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message != null) {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    this.M2 = true;
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.SavedStarGift savedStarGift2 = this.B2;
                    savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                    savedStarGift2.msg_id = message.f28513id;
                    savedStarGift2.flags = (savedStarGift2.flags | 8) & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    w2(savedStarGift2, this.C2);
                    this.f8781n3 = null;
                    this.M2 = false;
                    q8 q8Var = this.C2;
                    if (q8Var != null) {
                        q8Var.d();
                    } else {
                        y8.y(this.f30223a, false).O(this.T1);
                    }
                    org.telegram.messenger.g0.g3(runnable);
                    return;
                }
            }
            if (this.C2 == null) {
                y8.y(this.f30223a, false).O(C1());
            }
            this.M2 = true;
            this.B2 = null;
            this.A2 = false;
            fj fjVar = new fj(this.f30223a, message, false, false);
            fjVar.L5();
            v2(fjVar, this.C2);
            this.f8781n3 = null;
            this.M2 = false;
            org.telegram.messenger.g0.g3(runnable);
            return;
        }
        y8.y(this.f30223a, false).O(C1());
        dismiss();
    }

    public final void o2() {
        TL_stars.TL_starGiftUnique M1 = M1();
        if (!E2() && M2() != null && M1 != null && !TextUtils.isEmpty(M1.slug)) {
            ?? obj = new Object();
            obj.d = gd.N0(2131749897, null);
            obj.f3456b = true;
            obj.f3458e = new ai.s1(10, this, r1);
            Context context = getContext();
            int i7 = this.f30223a;
            bi.f2 f2Var = new bi.f2(context, i7, false, org.telegram.messenger.v1.a(i7).b(), null, obj, this.J0);
            bi.f2[] f2VarArr = {f2Var};
            f2Var.show();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f30223a).c(this, ks.I3);
        ks.f(this.f30223a).c(this, ks.f25201d4);
    }

    @Override
    public final void onBackPressed() {
        z5 z5Var;
        b5 b5Var;
        if (this.X2.c(4) && (z5Var = this.f8758b2) != null && (b5Var = z5Var.N) != null) {
            if (b5Var.f8533i0) {
                return;
            }
            if (b5Var.f8534j0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.f8798w2 && this.X2.f8702c > 0 && !this.f8767g2.R && !this.f8779m3) {
            fj fjVar = this.D2;
            if (fjVar != null) {
                v2(fjVar, null);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.B2;
                if (savedStarGift != null) {
                    w2(savedStarGift, this.C2);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.F2;
                    if (tL_starGiftUnique != null) {
                        u2(this.E2, tL_starGiftUnique, this.C2);
                    }
                }
            }
            H2(0, true, null);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f30223a).n(this, ks.I3);
        ks.f(this.f30223a).n(this, ks.f25201d4);
    }

    public final void p1(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, bi.k1 k1Var) {
        org.telegram.ui.Components.kc k10;
        q8 q8Var = this.C2;
        if (k1Var != null) {
            org.telegram.ui.ActionBar.m2 m2Var = k1Var.f30229c;
            org.telegram.messenger.g0.v1(m2Var.findFocus());
            k10 = new org.telegram.ui.Components.kc(m2Var, this.J0);
        } else {
            k10 = k();
        }
        bi.a5.d(getContext(), this.f30223a, tL_starGiftUnique, j3, tL_textWithEntities, !z10, this.J0, new ai.s1(8, this, k1Var), k10, new c1.a(29, this, k1Var), new f2(0, q8Var, tL_starGiftUnique));
    }

    public final boolean q1() {
        int i7;
        boolean z10;
        boolean z11;
        TLRPC.Peer peer;
        if (G1() == null) {
            return false;
        }
        fj fjVar = this.D2;
        if (fjVar != null) {
            TLRPC.MessageAction messageAction = fjVar.f24073k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.peer != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean P3 = fjVar.P3();
                if (fj.B0(this.D2.f24073k) == i10.i(this.f30223a).e()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int currentTime = mp.u1(this.f30223a).H6 - (ConnectionsManager.getInstance(this.f30223a).getCurrentTime() - this.D2.f24073k.date);
                if (((z10 || (P3 && !z11)) && ((peer = tL_messageActionStarGift.peer) == null || !S1(this.f30223a, org.telegram.messenger.n5.o(peer)))) || tL_messageActionStarGift.converted || tL_messageActionStarGift.convert_stars <= 0 || currentTime <= 0) {
                    return false;
                }
                return true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null) {
                int currentTime2 = mp.u1(this.f30223a).H6 - (ConnectionsManager.getInstance(this.f30223a).getCurrentTime() - savedStarGift.date);
                int i10 = this.f30223a;
                long j3 = this.T1;
                if (S1(i10, j3)) {
                    int i11 = this.B2.flags;
                    if (j3 < 0) {
                        i7 = 2048;
                    } else {
                        i7 = 8;
                    }
                    if ((i7 & i11) != 0 && (i11 & 16) != 0 && (i11 & 2) != 0 && currentTime2 > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final SpannableStringBuilder q2(TLRPC.Peer peer) {
        if (peer != null) {
            String r10 = org.telegram.messenger.n5.r(mp.u1(this.f30223a).g2(org.telegram.messenger.n5.o(peer)));
            if (!TextUtils.isEmpty(r10)) {
                return org.telegram.messenger.g0.T2(gd.a0(null, null, 2131750026, p5.c.k("@", r10)), new h3(this, r10, 8));
            }
        }
        return null;
    }

    @Override
    public final void r0() {
        hi.u3 u3Var = this.f8801x3;
        if (u3Var != null) {
            u3Var.f(true);
            this.f8801x3 = null;
        }
    }

    public final boolean r1() {
        int i7;
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 == null || M1.crafted || bi.a5.m(M1) || !S1(this.f30223a, org.telegram.messenger.n5.o(M1.owner_id))) {
            return false;
        }
        fj fjVar = this.D2;
        if (fjVar != null) {
            TLRPC.Message message = fjVar.f24073k;
            if (message == null) {
                return false;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return false;
            }
            i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i7 = savedStarGift.can_craft_at;
            }
            return false;
        }
        int currentTime = ConnectionsManager.getInstance(this.f30223a).getCurrentTime();
        if (i7 <= 0 || currentTime < i7) {
            return false;
        }
        return true;
    }

    public final SpannableStringBuilder r2(TL_stars.StarGift starGift) {
        if (starGift != null && !(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return q2(starGift.released_by);
        }
        return null;
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            Q(org.telegram.ui.ActionBar.n6.f29524h5);
            z5 z5Var = this.f8758b2;
            if (z5Var != null) {
                z5Var.l();
            }
            kq kqVar = this.Z2;
            if (kqVar != null) {
                Drawable drawable = kqVar.f36849c;
                if (drawable instanceof a6) {
                    ((a6) drawable).d.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.J0));
                    hi.e eVar = this.f8767g2;
                    if (eVar != null) {
                        eVar.invalidate();
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean s1() {
        throw new UnsupportedOperationException("Method not decompiled: di.f6.s1():boolean");
    }

    @Override
    public final void show() {
        fj fjVar;
        TLRPC.Message message;
        String str;
        if (mp.u1(this.f30223a).A2()) {
            org.telegram.ui.b.b(this.f30223a);
            return;
        }
        TL_wallet.nftItem nftitem = this.f8759b3;
        if (nftitem != null && (str = this.E2) != null && this.F2 != null) {
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = str;
            ConnectionsManager.getInstance(this.f30223a).sendRequest(getuniquestargift, new bi.q1(this, nftitem, str, 4));
        }
        if (this.E2 != null && this.F2 == null) {
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
            t1Var.r(500L);
            TL_stars.getUniqueStarGift getuniquestargift2 = new TL_stars.getUniqueStarGift();
            getuniquestargift2.slug = this.E2;
            ConnectionsManager.getInstance(this.f30223a).sendRequest(getuniquestargift2, new bi.o1(5, this, t1Var));
        } else if (this.B2 == null && (fjVar = this.D2) != null && (message = fjVar.f24073k) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
                        t1Var2.r(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.f28588id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.f30223a).sendRequest(tL_messages_getMessages, new bi.q1(this, tL_messageActionStarGift, t1Var2, 2));
                        return;
                    } else if (G1() != null) {
                        org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, getContext(), null);
                        t1Var3.r(500L);
                        y8.y(this.f30223a, false).L(G1(), new ai.s1(7, this, t1Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final boolean t1() {
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 != null && !TextUtils.isEmpty(M1.slug)) {
            if (this.f8759b3 != null || T1(M1) || Q1(M1) || (bi.a5.u(M1) && R1(this.f30223a, org.telegram.messenger.n5.o(M1.owner_id)))) {
                org.telegram.messenger.p0 p0Var = mp.u1(this.f30223a).A7;
                if (((org.telegram.messenger.h0) p0Var.f26254p0.f17372b).f24439c) {
                    if (((org.telegram.messenger.h0) p0Var.f26261t.f17372b).f24439c || ((org.telegram.messenger.h0) p0Var.f26263u.f17372b).f24439c || T1(M1)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void u1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String N0 = gd.N0(2131750249, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = N0;
        t1Var.U = gd.N0(2131750250, null);
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M1 != null && !TextUtils.isEmpty(M1.slug)) {
            alertDialog$Builder.k(gd.N0(2131747611, null), new s3(this, M1, 1));
        }
        i5.c.y(null, 2131752577, alertDialog$Builder, null);
    }

    public final void u2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, q8 q8Var) {
        boolean z10;
        boolean z11;
        o5 o5Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.E2 = str;
        this.F2 = tL_starGiftUnique;
        this.C2 = q8Var;
        if (this.f8764e3 == null && tL_starGiftUnique.resell_amount != null && !R1(this.f30223a, org.telegram.messenger.n5.o(tL_starGiftUnique.owner_id)) && !P1(this.f30223a, tL_starGiftUnique) && !T1(tL_starGiftUnique)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G2 = z10;
        if (!this.M2 && (o5Var = this.L2) != null && o5Var.f9434o && (tL_starGiftUnique2 = o5Var.f9431l) != null && tL_starGiftUnique2.f28721id != tL_starGiftUnique.f28721id) {
            o5Var.a();
            this.L2 = null;
            z5 z5Var = this.f8758b2;
            z5Var.f10106b.setAlpha(1.0f);
            z5Var.f10108c.setAlpha(0.0f);
        }
        this.f8756a2.b(this.f30223a, this.B2);
        x2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        TL_wallet.walletTransaction wallettransaction = this.f8764e3;
        j80 j80Var = this.d2;
        if (wallettransaction == null && z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            j80Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(2131750164, null), new h3(this, str3, 3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            j80Var.setVisibility(0);
            org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.f29690q5, this.J0);
        } else {
            j80Var.setVisibility(8);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.f8764e3;
        j80 j80Var2 = this.f8765f2;
        if (wallettransaction2 == null && !z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            j80Var2.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(2131750164, null), new h3(this, str3, 4)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
            j80Var2.setVisibility(0);
        } else {
            j80Var2.setVisibility(8);
        }
        L2();
        if (this.G2) {
            y2(tL_starGiftUnique);
            this.f8767g2.setOnClickListener(new i1(this, 18));
        }
        if (this.f8757a3) {
            H2(0, false, null);
            this.n1.n0(1);
            this.f8757a3 = false;
        }
        K2();
    }

    public final void v1(long j3, TL_stars.starGiftDepositPayload stargiftdepositpayload, long j10, vf.b bVar, bi.f2 f2Var) {
        boolean z10;
        TL_wallet.nftItem M2 = M2();
        TL_stars.TL_starGiftUnique M1 = M1();
        if (M2 != null && M1 != null && !TextUtils.isEmpty(M1.slug)) {
            if (this.f8759b3 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            String E1 = E1();
            bVar.d();
            w2 w2Var = new w2(this, j10, bVar, j3, M1, M2, f2Var, z11, E1);
            if (stargiftdepositpayload != null) {
                w2Var.a(stargiftdepositpayload);
                return;
            }
            TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
            depositstargift.peer = mp.u1(this.f30223a).l1(j3);
            depositstargift.slug = M1.slug;
            ConnectionsManager.getInstance(this.f30223a).sendRequestTyped(depositstargift, new d3.b(1), new e2(this, bVar, f2Var, w2Var, 1));
        }
    }

    public final void v2(org.telegram.messenger.fj r59, di.q8 r60) {
        throw new UnsupportedOperationException("Method not decompiled: di.f6.v2(org.telegram.messenger.fj, di.q8):void");
    }

    public final void w1(final long j3, final w10 w10Var) {
        TLRPC.Message message;
        long o4;
        long j10;
        TL_stars.InputSavedStarGift G1 = G1();
        if (G1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.B2;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                j10 = savedStarGift.transfer_stars;
                o4 = this.T1;
            } else {
                fj fjVar = this.D2;
                if (fjVar != null && (message = fjVar.f24073k) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                        o4 = org.telegram.messenger.n5.o(tL_messageActionStarGiftUnique.gift.owner_id);
                        j10 = tL_messageActionStarGiftUnique.transfer_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (j10 <= 0) {
                TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
                transferstargift.stargift = G1;
                transferstargift.to_id = mp.u1(this.f30223a).l1(j3);
                final long j11 = o4;
                ConnectionsManager.getInstance(this.f30223a).sendRequest(transferstargift, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        boolean z10 = tLObject instanceof TLRPC.Updates;
                        f6 f6Var = f6.this;
                        if (z10) {
                            mp.u1(f6Var.f30223a).V3((TLRPC.Updates) tLObject, false);
                        }
                        org.telegram.messenger.g0.g3(new l2(f6Var, w10Var, tL_error, tLObject, j3, j11));
                    }
                });
                return;
            }
            long j12 = o4;
            y8 y10 = y8.y(this.f30223a, false);
            if (!y10.f10049e) {
                y10.r(new j2(this, y10, j3, w10Var, 0));
                return;
            }
            TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = G1;
            tL_inputInvoiceStarGiftTransfer.to_id = mp.u1(this.f30223a).l1(j3);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject u10 = ki.t2.u(this.J0, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.f30223a).sendRequest(tL_payments_getPaymentForm, new k2(this, tL_inputInvoiceStarGiftTransfer, j3, j12, w10Var));
        }
    }

    public final void w2(org.telegram.tgnet.tl.TL_stars.SavedStarGift r36, di.q8 r37) {
        throw new UnsupportedOperationException("Method not decompiled: di.f6.w2(org.telegram.tgnet.tl.TL_stars$SavedStarGift, di.q8):void");
    }

    public final void x1() {
        TL_stars.InputSavedStarGift G1;
        long j3;
        hi.e eVar = this.f8767g2;
        if (!eVar.R && (G1 = G1()) != null) {
            fj fjVar = this.D2;
            String str = null;
            long j10 = 0;
            if (fjVar != null) {
                TLRPC.MessageAction messageAction = fjVar.f24073k.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j3 = tL_messageActionStarGift.upgrade_stars;
                    if (j3 <= 0) {
                        str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.B2;
                if (savedStarGift != null) {
                    j3 = savedStarGift.upgrade_stars;
                    if (j3 <= 0) {
                        str = savedStarGift.prepaid_upgrade_hash;
                    }
                } else {
                    return;
                }
            }
            int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i7 > 0 || this.f8789r3 != null) {
                eVar.setLoading(true);
                lp lpVar = this.f8790s2;
                if (i7 > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = lpVar.f37189a.f32938q;
                    upgradestargift.stargift = G1;
                    ConnectionsManager.getInstance(this.f30223a).sendRequest(upgradestargift, new bi.o1(7, this, G1));
                    return;
                }
                int i10 = 0;
                y8 y10 = y8.y(this.f30223a, false);
                if (!y10.f10049e) {
                    y10.r(new f2(2, this, y10));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.f8789r3.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = mp.u1(this.f30223a).l1(this.T1);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = lpVar.f37189a.f32938q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = G1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.f8789r3.invoice.prices;
                int size = arrayList.size();
                while (i10 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                    i10++;
                    j10 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.f30223a).sendRequest(tL_payments_sendStarsForm, new y(this, str, G1, j10, 1));
            }
        }
    }

    public final void x2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r42, boolean r43, org.telegram.tgnet.TLObject r44, org.telegram.tgnet.TLRPC.TL_textWithEntities r45) {
        throw new UnsupportedOperationException("Method not decompiled: di.f6.x2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public final void y2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        cg.a resellAmount = tL_starGiftUnique.getResellAmount(cg.b.f5268a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        SpannableStringBuilder spannableStringBuilder = null;
        hi.e eVar = this.f8767g2;
        if (z10) {
            eVar.i(pb.t1(pb.V0(gd.a0(null, null, 2131745950, tL_starGiftUnique.getResellAmount(cg.b.f5269b).d()), true), true), !this.f8757a3, true);
            if (!bi.a5.m(tL_starGiftUnique)) {
                spannableStringBuilder = pb.T0(gd.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            }
            eVar.g(spannableStringBuilder, !this.f8757a3);
            return;
        }
        eVar.i(pb.T0(gd.H(',', "ResellGiftBuy", (int) resellAmount.a())), !this.f8757a3, true);
        eVar.g(null, !this.f8757a3);
    }

    public final void z2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10) {
        if (z10) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = i10.i(this.f30223a).e();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= 4096;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.f8758b2.setWalletDisplayed(z10);
        L2();
    }
}
