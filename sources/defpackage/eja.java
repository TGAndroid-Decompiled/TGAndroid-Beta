package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public abstract class eja extends FrameLayout implements snb, fn7, kf3, x69 {
    public static final int[] t2 = {0, 1, 2, 4};
    public static final yf3 u2 = new yf3((byte) 3);
    public static final int v2 = hl.L(7.0f);
    public static final int w2 = hl.L(7.0f) + hl.L(14.0f);
    public byte A0;
    public boolean A1;
    public final Drawable B0;
    public boolean B1;
    public boolean C0;
    public int C1;
    public final NumberTextView D0;
    public int D1;
    public final tk4 E;
    public final LinearLayout E0;
    public VelocityTracker E1;
    public final boolean F;
    public final ImageView F0;
    public boolean F1;
    public final long G;
    public final gd0 G0;
    public final tha G1;
    public final a H;
    public final ArrayList H0;
    public kg5 H1;
    public final jla I;
    public final ArrayList I0;
    public final vnb I1;
    public final sla J;
    public final ArrayList J0;
    public final oz4 J1;
    public final lha K;
    public final ArrayList K0;
    public final u8a K1;
    public final yia L;
    public final bha L0;
    public boolean L1;
    public final sia M;
    public final yga M0;
    public final pn M1;
    public final ria N;
    public final dl1 N0;
    public a39 N1;
    public final ria O;
    public AnimatorSet O0;
    public int O1;
    public final ria P;
    public final gfa P0;
    public boolean P1;
    public final nia Q;
    public final ArrayList Q0;
    public int Q1;
    public final uha R;
    public float R0;
    public AnimatorSet R1;
    public final sha S;
    public final xj3 S0;
    public final SparseArray S1;
    public final qha T;
    public final FrameLayout T0;
    public long T1;
    public final pia U;
    public final xga U0;
    public boolean U1;
    public final qia V;
    public final int V0;
    public int V1;
    public final mha W;
    public final Paint W0;
    public final iha W1;
    public boolean X0;
    public v5b X1;
    public boolean Y0;
    public float Y1;
    public w49 Z0;
    public boolean Z1;
    public boolean a;
    public final bga a0;
    public final int[] a1;
    public SpannableStringBuilder a2;
    public boolean b;
    public final cga b0;
    public int b1;
    public int b2;
    public boolean c;
    public final fga c0;
    public final SparseArray[] c1;
    public boolean c2;
    public boolean d;
    public final rha d0;
    public int d1;
    public int d2;
    public int e;
    public final lu5 e0;
    public boolean e1;
    public int e2;
    public int f;
    public final oha f0;
    public long f1;
    public int f2;
    public final bja g0;
    public TLRPC.ChatFull g1;
    public int g2;
    public float h;
    public final aga h0;
    public TLRPC.UserFull h1;
    public vy4 h2;
    public final bja i0;
    public AnimatorSet i1;
    public float i2;
    public final bia j0;
    public boolean j1;
    public final RectF j2;
    public final bia k0;
    public boolean k1;
    public Runnable k2;
    public final bia l0;
    public boolean l1;
    public int l2;
    public final xha m0;
    public final long m1;
    public final HashMap m2;
    public float n;
    public final zha[] n0;
    public boolean n1;
    public final HashMap n2;
    public final s7 o0;
    public boolean o1;
    public int o2;
    public final s7 p0;
    public final int[] p1;
    public int p2;
    public final s7 q0;
    public float q1;
    public boolean q2;
    public boolean r;
    public float r0;
    public boolean r1;
    public int r2;
    public int s;
    public float s0;
    public int s1;
    public int s2;
    public final TextView t0;
    public int t1;
    public final ImageView u0;
    public final lga u1;
    public final e29 v0;
    public float v1;
    public int w;
    public final s7 w0;
    public final tia[] w1;
    public int x;
    public final s7 x0;
    public final wia x1;
    public final Rect y;
    public final s7 y0;
    public final e y1;
    public final s7 z0;
    public int z1;

    public eja(Context context, long j, wia wiaVar, int i, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, e eVar, tha thaVar, int i4, vnb vnbVar, ll0 ll0Var) {
        super(context);
        TLRPC.ProfileTab profileTab;
        float f;
        float f2;
        ll0 ll0Var2;
        int i5;
        boolean z;
        ?? r14;
        eja ejaVar;
        boolean z2;
        zha zhaVar;
        hga hgaVar;
        n69 n69Var;
        s7 a;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        TL_bots.BotInfo botInfo;
        eja ejaVar2 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        vnb vnbVar2 = vnbVar;
        ejaVar2.y = new Rect();
        ejaVar2.n0 = new zha[2];
        ejaVar2.H0 = new ArrayList(10);
        ejaVar2.I0 = new ArrayList(10);
        ejaVar2.J0 = new ArrayList(10);
        ejaVar2.K0 = new ArrayList(10);
        ejaVar2.P0 = new gfa(ejaVar2, (byte) 14);
        ejaVar2.Q0 = new ArrayList();
        ejaVar2.W0 = new Paint();
        ejaVar2.c1 = new SparseArray[]{new SparseArray(), new SparseArray()};
        ejaVar2.n1 = false;
        ejaVar2.o1 = false;
        ejaVar2.p1 = new int[]{3, 3};
        ejaVar2.u1 = new lga(ejaVar2);
        ejaVar2.v1 = -5.0f;
        ejaVar2.w1 = new tia[9];
        ejaVar2.M1 = new pn(null);
        ejaVar2.S1 = new SparseArray();
        ejaVar2.V1 = -1;
        ejaVar2.W1 = new iha(ejaVar2);
        ejaVar2.Y1 = 0.0f;
        ejaVar2.g2 = Integer.MAX_VALUE;
        ejaVar2.j2 = new RectF();
        ejaVar2.l2 = -1;
        ejaVar2.m2 = new HashMap();
        ejaVar2.n2 = new HashMap();
        ejaVar2.q2 = true;
        oz4 oz4Var = new oz4();
        ejaVar2.J1 = oz4Var;
        oz4Var.a(ejaVar2.c0(aob.d6));
        ll0 ll0Var3 = ll0Var == null ? new ll0(oz4Var, oz4Var, oz4Var) : ll0Var;
        ejaVar2.F = i4;
        ejaVar2.I1 = vnbVar2;
        tk4 tk4Var = new tk4(context, null);
        ejaVar2.E = tk4Var;
        tk4Var.setIsSingleCell(true);
        TLRPC.User X1 = eVar.getMessagesController().X1(Long.valueOf(j));
        ejaVar2.x1 = wiaVar;
        ejaVar2.G1 = thaVar;
        int[] iArr = wiaVar.c;
        long j2 = wiaVar.s;
        ejaVar2.G = j2;
        int i11 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], i11 == 0 ? i : 0, iArr[7], iArr[8]};
        ejaVar2.a1 = iArr2;
        if (userFull != null) {
            profileTab = userFull.main_tab;
        } else {
            profileTab = chatFull2 != null ? chatFull2.main_tab : null;
        }
        if (i2 != 14 && i2 != 10 && i2 != 11 && i2 != 6) {
            if (X1 != null && X1.bot && X1.bot_has_main_app && X1.bot_can_edit) {
                ejaVar2.b1 = 13;
            } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
                ejaVar2.b1 = 8;
            } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || ejaVar2.s0()))) {
                ejaVar2.b1 = 8;
            } else if ((profileTab instanceof TLRPC.TL_profileTabGifts) && ((userFull != null && userFull.stargifts_count > 0) || (chatFull2 != null && chatFull2.stargifts_count > 0))) {
                ejaVar2.b1 = 14;
            } else {
                if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                    int i12 = iArr2[1];
                    i6 = -1;
                    if (i12 == -1 || i12 > 0) {
                        ejaVar2.b1 = 1;
                    }
                } else {
                    i6 = -1;
                }
                if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i10 = iArr2[5]) == i6 || i10 > 0)) {
                    ejaVar2.b1 = 5;
                } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i9 = iArr2[3]) == i6 || i9 > 0)) {
                    ejaVar2.b1 = 3;
                } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i8 = iArr2[4]) == i6 || i8 > 0)) {
                    ejaVar2.b1 = 4;
                } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i7 = iArr2[2]) == i6 || i7 > 0)) {
                    ejaVar2.b1 = 2;
                } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || ejaVar2.s0())) {
                    ejaVar2.b1 = ejaVar2.getInitialTab();
                } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                    int i13 = -1;
                    if (i2 != -1 && i11 == 0) {
                        ejaVar2.b1 = i2;
                    } else {
                        int i14 = 0;
                        while (true) {
                            int[] iArr3 = ejaVar2.a1;
                            if (i14 >= iArr3.length) {
                                break;
                            }
                            int i15 = iArr3[i14];
                            if (i15 == i13 || i15 > 0) {
                                break;
                            }
                            i14++;
                            i13 = -1;
                        }
                        ejaVar2.b1 = i14;
                    }
                } else {
                    ejaVar2.b1 = 14;
                }
            }
        } else {
            ejaVar2.b1 = i2;
        }
        ejaVar2.T0(i2);
        ejaVar2.g1 = chatFull2;
        ejaVar2.h1 = userFull;
        if (chatFull2 != null) {
            ejaVar2.f1 = -chatFull2.migrated_from_chat_id;
        }
        long j3 = j;
        ejaVar2.m1 = j3;
        int i16 = 0;
        while (true) {
            tia[] tiaVarArr = ejaVar2.w1;
            if (i16 >= tiaVarArr.length) {
                break;
            }
            tiaVarArr[i16] = new tia();
            ejaVar2.w1[i16].j[0] = wf3.B(ejaVar2.m1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            ejaVar2.w1[i16].j[1] = Integer.MAX_VALUE;
            ejaVar2.J(i16);
            if (ejaVar2.f1 != 0 && ejaVar2.g1 != null && ejaVar2.w1[i16].b[1].size() == 0) {
                tia tiaVar = ejaVar2.w1[i16];
                tiaVar.j[1] = ejaVar2.g1.migrated_from_max_id;
                tiaVar.i[1] = false;
            }
            i16++;
        }
        ejaVar2.y1 = eVar;
        ejaVar2.H = eVar.getActionBar();
        ejaVar2.I = eVar.getSimpleActionBar();
        ejaVar2.p1[0] = ejaVar2.Z0() <= 0 ? xea.p1 : ejaVar2.Z0();
        ejaVar2.p1[1] = ejaVar2.Z0() <= 0 ? xea.q1 : ejaVar2.Z0();
        jn7 notificationCenter = eVar.getNotificationCenter();
        notificationCenter.getClass();
        u8a u8aVar = new u8a(notificationCenter, ejaVar2);
        u8aVar.b(jn7.V);
        u8aVar.b(jn7.v);
        u8aVar.b(1);
        u8aVar.b(jn7.J);
        u8aVar.b(jn7.f2);
        u8aVar.b(jn7.g2);
        u8aVar.b(jn7.h2);
        u8aVar.b(jn7.A5);
        u8aVar.b(jn7.y5);
        u8aVar.b(jn7.h3);
        u8aVar.b(jn7.i3);
        u8aVar.b(jn7.r);
        u8aVar.b(jn7.I3);
        u8aVar.b(jn7.Z3);
        u8aVar.b(jn7.f1);
        ejaVar2.K1 = u8aVar;
        for (int i17 = 0; i17 < 10; i17++) {
            if (i2 == 4) {
                wga wgaVar = new wga(ejaVar2, context);
                wgaVar.U.c();
                ejaVar2.J0.add(wgaVar);
            }
        }
        ejaVar2.V0 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        ejaVar2.Y0 = false;
        ejaVar2.Z0 = null;
        yga ygaVar = ejaVar2.M0;
        if (ygaVar != null) {
            ygaVar.g(false);
        }
        ejaVar2.X0 = false;
        Drawable drawable = context.getResources().getDrawable(2131232551);
        ejaVar2.B0 = drawable;
        yob.x(ejaVar2, drawable, aob.b7, vnbVar2, PorterDuff.Mode.MULTIPLY);
        bha bhaVar = ejaVar2.L0;
        int currentTabId = bhaVar != null ? bhaVar.getCurrentTabId() : i2;
        bha bhaVar2 = new bha(ejaVar2, context, ejaVar2.I1);
        int i18 = ejaVar2.b1;
        if (i18 != -1) {
            bhaVar2.setInitialTabId(i18);
            ejaVar2.b1 = -1;
        }
        bhaVar2.c0 = (short) 320;
        int i19 = aob.wi;
        int i20 = aob.vi;
        bhaVar2.M = i19;
        bhaVar2.N = i20;
        bhaVar2.updateColors();
        bhaVar2.setUseMinimalWidth(true);
        bhaVar2.setDelegate(new dha(ejaVar2));
        ejaVar2.L0 = bhaVar2;
        for (int i21 = 1; i21 >= 0; i21--) {
            ejaVar2.c1[i21].clear();
        }
        ejaVar2.d1 = 0;
        ejaVar2.Q0.clear();
        pia piaVar = ejaVar2.U;
        if (piaVar != null) {
            piaVar.x.clear();
        }
        if (ejaVar2 instanceof re5) {
            f = 10.0f;
        } else {
            jla jlaVar = ejaVar2.I;
            if (jlaVar != null) {
                rla v = jlaVar.v();
                a = v.a(0, 2131232502);
                if (ejaVar2.k0() || ejaVar2.q0()) {
                    f = 10.0f;
                } else {
                    sla a2 = v.a(0, 2131231247);
                    ejaVar2.J = a2;
                    f = 10.0f;
                    a2.setContentDescription(ob6.M0(2131754834, null));
                    a2.Y(false, false);
                }
            } else {
                f = 10.0f;
                s6 u = ejaVar2.H.u();
                u.addOnLayoutChangeListener(new cha(ejaVar2));
                if (ejaVar2.m1 == ejaVar2.y1.getUserConfig().e() && (ejaVar2.y1 instanceof em6) && ejaVar2.q()) {
                    ejaVar2.p0 = u.a(11, 2131232502);
                }
                a = u.a(0, 0);
            }
            s7 K = a.M().K(new jha(ejaVar2));
            ejaVar2.q0 = K;
            yga ygaVar2 = ejaVar2.M0;
            K.setSearchFieldHint(ob6.M0((ygaVar2 != null && ygaVar2.a() && ejaVar2.getSelectedTab() == 11) ? 2131745596 : 2131745564, null));
            K.setContentDescription(ob6.M0(2131745564, "Search"));
            if (ejaVar2.I != null) {
                ((sla) K).Y(false, false);
            } else {
                K.setTranslationY(hl.L(f));
                ejaVar2.setSearchItemVisibility(ejaVar2.s0() ? 8 : 4);
            }
        }
        ImageView imageView = new ImageView(context);
        ejaVar2.u0 = imageView;
        imageView.setContentDescription(ob6.M0(2131754834, "AccDescrMoreOptions"));
        imageView.setTranslationY(hl.L(f));
        imageView.setVisibility(4);
        if (ejaVar2.I != null || ejaVar2.k0() || ejaVar2.q0()) {
            f2 = 2.0f;
        } else {
            f2 = 2.0f;
            ejaVar2.H.addView(imageView, tre.e(48, 56, 85));
            ?? imageView2 = new ImageView(context);
            ejaVar2.v0 = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView2.e(2131624111, 24, 24);
            imageView2.getAnimatedDrawable().G *= 2.0f;
            imageView2.getAnimatedDrawable().h = true;
            yob.s(imageView2, aob.y8, vnbVar2, PorterDuff.Mode.SRC_IN);
            imageView2.setVisibility(8);
            ejaVar2.H.addView((View) imageView2, tre.e(48, 56, 85));
        }
        imageView.setOnClickListener(new ffa(ejaVar2, (byte) 4));
        sla slaVar = ejaVar2.J;
        if (slaVar != null) {
            slaVar.setOnClickListener(new ffa(ejaVar2, (byte) 0));
        }
        s7 s7Var = ejaVar2.q0;
        if (s7Var != null && ejaVar2.I == null) {
            EditTextBoldCursor searchField = s7Var.getSearchField();
            int i22 = aob.G6;
            yob.X(searchField, i22, vnbVar2);
            yob.D(searchField, aob.Jj, vnbVar2);
            yob.v(searchField, i22, vnbVar2);
        }
        ejaVar2.A0 = (byte) 0;
        LinearLayout linearLayout = new LinearLayout(context);
        ejaVar2.E0 = linearLayout;
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        linearLayout.setVisibility(4);
        ImageView imageView3 = new ImageView(context);
        ejaVar2.F0 = imageView3;
        imageView3.setScaleType(ImageView.ScaleType.CENTER);
        gd0 gd0Var = new gd0(true);
        ejaVar2.G0 = gd0Var;
        imageView3.setImageDrawable(gd0Var);
        int i23 = aob.y8;
        gd0Var.a(ejaVar2.c0(i23));
        int i24 = aob.z8;
        yob.R(imageView3, aob.e0(ejaVar2.c0(i24), 1), null, yob.M(i24), vnbVar2);
        imageView3.setContentDescription(ob6.M0(2131752006, "Close"));
        linearLayout.addView(imageView3, new LinearLayout.LayoutParams(hl.L(54.0f), -1));
        ejaVar2.Q0.add(imageView3);
        imageView3.setOnClickListener(new ffa(ejaVar2, (byte) 1));
        NumberTextView numberTextView = new NumberTextView(context);
        ejaVar2.D0 = numberTextView;
        numberTextView.setTextSize(18);
        numberTextView.setTypeface(hl.o());
        numberTextView.setTextColor(ejaVar2.c0(i23));
        linearLayout.addView(numberTextView, tre.m(1.0f, 0, -1, 18, 0, 0));
        ejaVar2.Q0.add(numberTextView);
        if (!wf3.B(ejaVar2.m1)) {
            if (!ejaVar2.s0()) {
                ejaVar2.x0 = ejaVar2.F(context, 102, 2131232229, ob6.L0(2131754873));
                ejaVar2.w0 = ejaVar2.F(context, 100, 2131232170, ob6.L0(2131750547));
            }
            s7 F = ejaVar2.F(context, 103, 2131232298, ob6.L0(2131746972));
            ejaVar2.y0 = F;
            F.setVisibility(8);
            s7 F2 = ejaVar2.F(context, 104, 2131232418, ob6.L0(2131743499));
            ejaVar2.z0 = F2;
            F2.setVisibility(8);
            ejaVar2.E1();
        }
        ejaVar2.o0 = ejaVar2.F(context, 101, 2131232113, ob6.M0(2131751563, "Delete"));
        ejaVar2.K = new lha(ejaVar2, context);
        ejaVar2.L = new yia(ejaVar2, context);
        ejaVar2.N = new ria(ejaVar2, context, 1);
        ejaVar2.O = new ria(ejaVar2, context, 2);
        ejaVar2.P = new ria(ejaVar2, context, 4);
        ejaVar2.Q = new nia(ejaVar2, context, ejaVar2.y1.getCurrentAccount(), ejaVar2.y1.getResourceProvider());
        ejaVar2.R = new uha(ejaVar2, context);
        ejaVar2.j0 = new bia(ejaVar2, context, 1);
        ejaVar2.k0 = new bia(ejaVar2, context, 4);
        ejaVar2.l0 = new bia(ejaVar2, context, 3);
        ejaVar2.m0 = new xha(ejaVar2, context);
        ejaVar2.S = new sha(ejaVar2, context);
        ejaVar2.T = new qha(ejaVar2, context);
        ejaVar2.U = new pia(ejaVar2, context);
        ejaVar2.V = new qia(ejaVar2, context);
        if (!ejaVar2.s0() && !ejaVar2.h0() && ejaVar2.G == 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", ejaVar2.y1.getUserConfig().e());
            bundle.putInt("chatMode", 3);
            mha mhaVar = new mha(ejaVar2, context, ejaVar2.y1.getParentLayout(), bundle);
            ejaVar2.W = mhaVar;
            long j4 = ejaVar2.m1;
            gv1 gv1Var = mhaVar.a;
            gv1Var.s4 = j4;
            gv1Var.nb = true;
            mhaVar.setClipToOutline(true);
            mhaVar.setOutlineProvider(new ViewOutlineProvider());
        }
        rha rhaVar = new rha(ejaVar2, context);
        ejaVar2.d0 = rhaVar;
        if (ejaVar2.G == 0) {
            rhaVar.e = arrayList;
            rhaVar.d = currentTabId != 7 ? null : chatFull2;
        }
        ejaVar2.f0 = new oha(ejaVar2, context);
        ejaVar2.e0 = new lu5(new pha(ejaVar2));
        ejaVar2.g0 = new bja(ejaVar2, context, false);
        ejaVar2.h0 = new aga(ejaVar2, context);
        ejaVar2.i0 = new bja(ejaVar2, context, true);
        ejaVar2.M = new sia(ejaVar2, context);
        boolean l0 = ejaVar2.l0();
        e eVar2 = ejaVar2.y1;
        if (l0) {
            ejaVar2.a0 = new bga(ejaVar2, context, eVar2, ejaVar2.m1);
            ll0Var2 = ll0Var3;
            z = false;
            i5 = 1;
        } else {
            if (eVar2 instanceof ProfileActivity) {
                TextView textView = new TextView(context);
                ejaVar2.t0 = textView;
                textView.setText(ob6.L0(2131745674).toUpperCase());
                textView.setTypeface(hl.o());
                int i25 = aob.Fi;
                yob.X(textView, i25, vnbVar2);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(17);
                yob.R(textView, aob.e0(aob.p1(0.15f, ejaVar2.c0(i25)), 3), null, yob.K(0.15f, i25), vnbVar2);
                textView.setPadding(hl.L(19.0f), 0, hl.L(19.0f), 0);
                ViewGroup viewGroup = ejaVar2.I;
                (viewGroup == null ? ejaVar2.H : viewGroup).addView(textView, tre.e(-2, 56, 85));
                textView.setOnClickListener(new ffa(ejaVar2, (byte) 2));
                textView.setVisibility(8);
                textView.setAlpha(0.0f);
                textView.setScaleX(0.4f);
                textView.setScaleY(0.4f);
                e eVar3 = ejaVar2.y1;
                ll0Var2 = ll0Var3;
                i5 = 1;
                cga cgaVar = new cga(ejaVar2, eVar3, context, eVar3.getCurrentAccount(), ((ProfileActivity) ejaVar2.y1).a(), vnbVar2, ll0Var2);
                vnbVar2 = vnbVar2;
                ejaVar2.b0 = cgaVar;
                ejaVar2.F1();
                ejaVar2.c0 = new fga(ejaVar2, context, ejaVar2.getStoriesController().A(ejaVar2.m1, true), new ega(ejaVar2, context, eVar, vnbVar2));
            } else {
                ll0Var2 = ll0Var3;
                i5 = 1;
            }
            z = false;
        }
        ejaVar2.setWillNotDraw(z);
        int i26 = 0;
        int i27 = -1;
        int i28 = 0;
        while (true) {
            zha[] zhaVarArr = ejaVar2.n0;
            if (i28 >= zhaVarArr.length) {
                break;
            }
            if (i28 == 0 && (zhaVar = zhaVarArr[i28]) != null && (hgaVar = zhaVar.x) != null) {
                i27 = hgaVar.K0();
                if (i27 == ejaVar2.n0[i28].x.A() - i5 || (n69Var = (n69) ejaVar2.n0[i28].h.L(i27)) == null) {
                    i27 = -1;
                } else {
                    i26 = n69Var.a.getTop();
                }
            }
            gga ggaVar = new gga(ejaVar2, context);
            ejaVar2.addView(ggaVar, tre.d(-1, -1.0f, 51, 0.0f, ejaVar2.I0(), 0.0f, 0.0f));
            if (i28 == i5) {
                ggaVar.setTranslationX(hl.q.x);
            }
            ejaVar2.n0[i28] = ggaVar;
            ggaVar.O = vnbVar2;
            hga hgaVar2 = new hga(ejaVar2, ggaVar);
            ggaVar.x = hgaVar2;
            hgaVar2.O = new iga(ejaVar2, ggaVar);
            ejaVar2.n0[i28].d = new zb3();
            ejaVar2.n0[i28].d.n(280L);
            ejaVar2.n0[i28].d.o(k43.h);
            zha zhaVar2 = ejaVar2.n0[i28];
            zhaVar2.d.m = false;
            jga jgaVar = new jga(ejaVar2, context, vnbVar2, ggaVar, hgaVar2);
            int i29 = i27;
            zhaVar2.h = jgaVar;
            ejaVar2.n0[i28].h.setFastScrollEnabled(1);
            ejaVar2.n0[i28].h.setScrollingTouchSlop(1);
            ejaVar2.n0[i28].h.setPinnedSectionOffsetY(-hl.L(f2));
            ejaVar2.n0[i28].h.setPadding(0, hl.L(54.0f), 0, 0);
            ejaVar2.n0[i28].h.setItemAnimator(null);
            ejaVar2.n0[i28].h.setClipToPadding(false);
            ejaVar2.n0[i28].h.setSectionsType(2);
            ejaVar2.n0[i28].h.setLayoutManager(hgaVar2);
            zha zhaVar3 = ejaVar2.n0[i28];
            int i30 = i26;
            zhaVar3.addView(zhaVar3.h, tre.c(-1.0f, -1));
            ejaVar2.n0[i28].n = new d79(context);
            zha zhaVar4 = ejaVar2.n0[i28];
            yha yhaVar = zhaVar4.n;
            kga kgaVar = new kga(ejaVar2);
            zhaVar4.r = kgaVar;
            yhaVar.setLayoutManager(kgaVar);
            zha zhaVar5 = ejaVar2.n0[i28];
            zhaVar5.addView(zhaVar5.n, tre.c(-1.0f, -1));
            ejaVar2.n0[i28].n.setVisibility(8);
            ejaVar2.n0[i28].n.i(new mga(ggaVar));
            ejaVar2.n0[i28].h.i(new nga(ejaVar2, ggaVar));
            ejaVar2.n0[i28].h.setOnItemClickListener(new oo1(ejaVar2, ggaVar, context, j3, vnbVar, (byte) 1));
            ejaVar2.n0[i28].h.setOnScrollListener(new qga(ejaVar2, ggaVar, hgaVar2));
            ejaVar2.n0[i28].h.setOnItemLongClickListener(new rga(ejaVar2, ggaVar));
            if (i28 == 0 && i29 != -1) {
                hgaVar2.g1(i29, i30);
            }
            zha zhaVar6 = ejaVar2.n0[i28];
            zhaVar6.y = new sga(context, zhaVar6.h);
            ejaVar2.n0[i28].y.setVisibility(8);
            zha zhaVar7 = ejaVar2.n0[i28];
            jga jgaVar2 = zhaVar7.h;
            sga sgaVar = zhaVar7.y;
            FrameLayout.LayoutParams c = tre.c(-1.0f, -1);
            d26 d26Var = jgaVar2.c1;
            if (d26Var == null) {
                d26Var = new d26((byte) 17, jgaVar2.getContext(), jgaVar2);
                jgaVar2.c1 = d26Var;
            }
            d26Var.addView(sgaVar, c);
            ejaVar2.n0[i28].s = new tga(ejaVar2, context, ggaVar);
            tga tgaVar = ejaVar2.n0[i28].s;
            tgaVar.x = false;
            tgaVar.setClipToOutline(true);
            ejaVar2.n0[i28].s.setOutlineProvider(new ViewOutlineProvider());
            if (i28 != 0) {
                ejaVar2.n0[i28].setVisibility(8);
            }
            zha zhaVar8 = ejaVar2.n0[i28];
            zhaVar8.w = new vga(ejaVar2, context, zhaVar8.s);
            ejaVar2.n0[i28].w.d(8, false);
            ejaVar2.n0[i28].w.setAnimateLayoutChange(true);
            zha zhaVar9 = ejaVar2.n0[i28];
            zhaVar9.addView(zhaVar9.w, tre.c(-1.0f, -1));
            ejaVar2.n0[i28].w.setOnTouchListener(new b02((byte) 25));
            ejaVar2.n0[i28].w.e(true, false);
            ejaVar2.n0[i28].w.d.setText(ob6.M0(2131747898, "NoResult"));
            ejaVar2.n0[i28].w.f.setVisibility(8);
            ejaVar2.n0[i28].w.e.setText(ob6.L0(2131745535));
            ejaVar2.n0[i28].w.f.setVisibility(8);
            zha zhaVar10 = ejaVar2.n0[i28];
            zhaVar10.w.addView(zhaVar10.s, tre.d(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
            zha zhaVar11 = ejaVar2.n0[i28];
            zhaVar11.h.setEmptyView(zhaVar11.w);
            ejaVar2.n0[i28].h.q1(0, true);
            zha[] zhaVarArr2 = ejaVar2.n0;
            zha zhaVar12 = zhaVarArr2[i28];
            zhaVar12.E = new hw6(zhaVar12.h, zhaVarArr2[i28].x);
            i28++;
            vnbVar2 = vnbVar;
            i27 = i29;
            i26 = i30;
            i5 = 1;
            j3 = j;
        }
        View view = ejaVar2.c0;
        if (view != null) {
            ejaVar2.addView(view, tre.d(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
        }
        dl1 dl1Var = new dl1(context);
        ejaVar2.N0 = dl1Var;
        dl1Var.h0((int) (System.currentTimeMillis() / 1000), false, false);
        dl1Var.setAlpha(0.0f);
        int i31 = aob.nd;
        int i32 = aob.be;
        dl1Var.U0 = i31;
        dl1Var.V0 = i32;
        dl1Var.setTranslationY(-hl.L(48.0f));
        ejaVar2.addView(dl1Var, tre.d(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        for (zha zhaVar13 : ejaVar2.n0) {
            k69 fastScroll = zhaVar13.h.getFastScroll();
            if (fastScroll != null) {
                fastScroll.a(ll0Var2, ejaVar2.I != null ? dtd.l(vnbVar) : dtd.n(vnbVar));
            }
        }
        if (ejaVar2.H()) {
            r14 = 0;
            ejaVar = ejaVar2;
        } else {
            ol0 l = ejaVar2.I != null ? dtd.l(vnbVar) : dtd.n(vnbVar);
            xj3 xj3Var = new xj3(context);
            ejaVar2.S0 = xj3Var;
            int L = hl.L(11.0f);
            int i33 = w2;
            xj3Var.setPadding(L, i33, hl.L(11.0f), i33);
            jl0 b = ll0Var2.b(xj3Var, l);
            b.r(hl.L(24.0f));
            b.q(hl.L(7.0f));
            xj3Var.setBlurredBackground(b);
            FrameLayout frameLayout = new FrameLayout(context);
            ejaVar2.T0 = frameLayout;
            xj3Var.addView(frameLayout);
            xj3Var.j(frameLayout, true, false);
            xj3Var.setOnAnimatedHeightChangedListener(new gfa(ejaVar2, (byte) 0));
            xga xgaVar = new xga(ejaVar2, context, eVar, this, vnbVar);
            ejaVar2.U0 = xgaVar;
            frameLayout.addView(xgaVar);
            xj3Var.setCallFragmentContextView(xgaVar);
            ejaVar2.addView(xj3Var, tre.d(-1, -2.0f, 48, -5.0f, 0.0f, -5.0f, 0.0f));
            xgaVar.setDelegate(new hfa(ejaVar2));
            jl0 b2 = ll0Var2.b(ejaVar2.L0, l);
            ik8.r(b2, hl.L(18.0f), 6.666f);
            ejaVar2.L0.setPadding(0, hl.L(7.0f), 0, hl.L(7.0f));
            ejaVar2.L0.setClipToPadding(false);
            ejaVar2.L0.setBackground(null);
            ejaVar2.L0.setBlurredBackground(b2);
            ejaVar2.L0.setOpen(false);
            ejaVar2.addView(ejaVar2.L0, tre.d(-2, 50.0f, 49, -0.6659999f, 0.0f, -0.6659999f, 0.0f));
            Context context2 = ejaVar2.getContext();
            e eVar4 = ejaVar2.y1;
            yga ygaVar3 = new yga(ejaVar2, context2, eVar4, eVar4.getCurrentAccount(), ejaVar2.h0() ? 0L : ejaVar2.m1, vnbVar);
            eja ejaVar3 = ejaVar2;
            ejaVar3.M0 = ygaVar3;
            ygaVar3.d(ll0Var2, l);
            ygaVar3.setShown(0.0f);
            ejaVar3.addView(ygaVar3, tre.d(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
            if (ejaVar3.I == null) {
                jl0 b3 = ll0Var2.b(ejaVar3.E0, l);
                ik8.r(b3, hl.L(18.0f), 6.666f);
                ejaVar3.E0.setBackground(b3);
                z2 = false;
                ejaVar3.E0.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                ejaVar3.addView(ejaVar3.E0, tre.e(-1, 50, 51));
            } else {
                z2 = false;
            }
            ejaVar3.n();
            ejaVar = ejaVar3;
            r14 = z2;
        }
        ejaVar.N1(r14);
        ejaVar.z1(r14);
        ejaVar.B(r14, r14);
        if (ejaVar.a1[r14] >= 0) {
            ejaVar.G0(r14);
        }
        fga fgaVar = ejaVar.c0;
        if (fgaVar == null || i3 <= 0) {
            return;
        }
        fgaVar.setInitialTabId(i3);
    }

    public static ci G(int i, long j, vnb vnbVar, Context context) {
        ci ciVar = new ci(context, vnbVar);
        ImageView imageView = (ImageView) ciVar.d;
        TextView textView = (TextView) ciVar.c;
        if (i == 0) {
            if (wf3.B(j)) {
                textView.setText(ob6.M0(2131747927, null));
                return ciVar;
            }
            textView.setText(ob6.M0(2131747929, null));
            return ciVar;
        } else if (i == 1) {
            if (wf3.B(j)) {
                textView.setText(ob6.M0(2131747888, null));
                return ciVar;
            }
            textView.setText(ob6.M0(2131747889, null));
            return ciVar;
        } else if (i == 2) {
            if (wf3.B(j)) {
                textView.setText(ob6.M0(2131747883, null));
                return ciVar;
            }
            textView.setText(ob6.M0(2131747884, null));
            return ciVar;
        } else if (i == 3) {
            if (wf3.B(j)) {
                textView.setText(ob6.M0(2131747885, null));
                return ciVar;
            }
            textView.setText(ob6.M0(2131747886, null));
            return ciVar;
        } else if (i == 4) {
            if (wf3.B(j)) {
                textView.setText(ob6.M0(2131747890, null));
                return ciVar;
            }
            textView.setText(ob6.M0(2131747891, null));
            return ciVar;
        } else if (i == 5) {
            if (wf3.B(j)) {
                textView.setText(ob6.M0(2131747887, null));
                return ciVar;
            }
            textView.setText(ob6.M0(2131747939, null));
            return ciVar;
        } else if (i == 6) {
            imageView.setImageDrawable(null);
            textView.setText(ob6.M0(2131747937, null));
            return ciVar;
        } else {
            if (i == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return ciVar;
        }
    }

    public static int Q(View view) {
        if (view instanceof jja) {
            return ((jja) view).getMessageId();
        }
        if (view instanceof zea) {
            return ((zea) view).getMessage().e1();
        }
        if (view instanceof vea) {
            return ((vea) view).getMessage().e1();
        }
        return 0;
    }

    public static TLRPC.ProfileTab Y(int i, boolean z) {
        if (i != 8 && i != 14 && !z) {
            return null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 8) {
                                    if (i != 14) {
                                        return null;
                                    }
                                    return new TLRPC.TL_profileTabGifts();
                                }
                                return new TLRPC.TL_profileTabPosts();
                            }
                            return new TLRPC.TL_profileTabGifs();
                        }
                        return new TLRPC.TL_profileTabMusic();
                    }
                    return new TLRPC.TL_profileTabLinks();
                }
                return new TLRPC.TL_profileTabVoice();
            }
            return new TLRPC.TL_profileTabFiles();
        }
        return new TLRPC.TL_profileTabMedia();
    }

    public static int Z(TLRPC.ProfileTab profileTab) {
        if (profileTab instanceof TLRPC.TL_profileTabPosts) {
            return 8;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMedia) {
            return 0;
        }
        if (profileTab instanceof TLRPC.TL_profileTabGifts) {
            return 14;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMusic) {
            return 4;
        }
        if (profileTab instanceof TLRPC.TL_profileTabVoice) {
            return 2;
        }
        if (profileTab instanceof TLRPC.TL_profileTabLinks) {
            return 3;
        }
        if (profileTab instanceof TLRPC.TL_profileTabFiles) {
            return 1;
        }
        if (profileTab instanceof TLRPC.TL_profileTabGifs) {
            return 5;
        }
        return -1;
    }

    public static c6b b(eja ejaVar) {
        return ejaVar.getStoriesController();
    }

    public long getPlaylistTopicId() {
        if (xc2.b0(this.y1.getCurrentAccount(), this.m1)) {
            return this.G;
        }
        return 0L;
    }

    public c6b getStoriesController() {
        return uc7.s1(this.y1.getCurrentAccount()).O1();
    }

    public static boolean j0(int i) {
        if (i != 8 && i != 9 && !t0(i)) {
            return false;
        }
        return true;
    }

    public static void k1(int i, View view) {
        if (view != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.topMargin != i) {
                marginLayoutParams.topMargin = i;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void m1(zha zhaVar, tia[] tiaVarArr, boolean z) {
        kba kbaVar;
        if (z) {
            if (xea.r1 > 0 && zhaVar.G == null && !zhaVar.I && zhaVar.h.getFastScroll() != null && zhaVar.h.getFastScroll().b0 && zhaVar.h.getFastScroll().getVisibility() == 0 && tiaVarArr[0].e() >= 50) {
                int i = xea.r1;
                int i2 = i - 1;
                if (i != i2) {
                    xea.r1 = i2;
                    org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", xea.r1).apply();
                }
                zhaVar.I = true;
                Context context = zhaVar.getContext();
                ir8 ir8Var = new ir8(context, (byte) 7);
                TextView textView = new TextView(context);
                qd4.u(14.0f, 2131745136, 1, textView, null);
                textView.setMaxLines(3);
                int i3 = aob.gg;
                yob.X(textView, i3, null);
                int L = hl.L(6.0f);
                int i4 = aob.hg;
                ShapeDrawable b0 = aob.b0(L, aob.w0(null, i4, false));
                uob M = yob.M(i4);
                ir8Var.setBackground(b0);
                yob.j(ir8Var, b0, M, null, null);
                ir8Var.addView(textView, tre.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.a = new Random();
                Paint paint = new Paint(1);
                view.b = paint;
                Paint paint2 = new Paint(1);
                view.c = paint2;
                view.f = 1.0f;
                view.h = 0.0f;
                paint.setColor(vm2.o(aob.w0(null, i3, false), 76));
                paint2.setColor(aob.w0(null, i3, false));
                Paint paint3 = new Paint();
                view.d = paint3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new LinearGradient(0.0f, hl.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                Paint paint4 = new Paint();
                view.e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                ir8Var.addView((View) view, tre.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                zhaVar.G = ir8Var;
                zhaVar.addView(ir8Var, tre.c(-2.0f, -2));
                zhaVar.G.setAlpha(0.0f);
                zhaVar.G.setScaleX(0.8f);
                zhaVar.G.setScaleY(0.8f);
                zhaVar.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                zhaVar.invalidate();
                kba kbaVar2 = new kba(zhaVar, ir8Var, (byte) 2);
                zhaVar.H = kbaVar2;
                hl.d3(kbaVar2, 4000L);
            }
        } else if (zhaVar.G != null && (kbaVar = zhaVar.H) != null) {
            hl.r(kbaVar);
            zhaVar.H.run();
            zhaVar.H = null;
            zhaVar.G = null;
        }
    }

    public void setHeaderEnabled(boolean z) {
        jla jlaVar = this.I;
        if (jlaVar != null) {
            jlaVar.setEnabled(z);
        } else {
            this.H.setEnabled(z);
        }
    }

    private void setPageOverscan(yha yhaVar) {
        if (this.c2 && yhaVar != null) {
            yhaVar.j3 = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yhaVar.getLayoutParams();
            if (marginLayoutParams != null) {
                int i = marginLayoutParams.topMargin;
                int i2 = -this.e2;
                if (i != i2 || marginLayoutParams.bottomMargin != (-this.f2)) {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.bottomMargin = -this.f2;
                    yhaVar.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public void setSearchItemVisibility(int i) {
        s7 s7Var = this.q0;
        if (s7Var == null) {
            return;
        }
        if (this.I != null) {
            B(true, true);
        } else {
            s7Var.setVisibility(i);
        }
    }

    public static boolean t0(int i) {
        if ((i & (-65536)) == 65536) {
            return true;
        }
        return false;
    }

    public final boolean A(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eja.A(android.view.MotionEvent):boolean");
    }

    public final void A0(int i, TL_stories.StoryItem storyItem) {
        getStoriesController().b(i, this.m1, storyItem);
    }

    public final void A1(b8 b8Var, b8 b8Var2, Runnable runnable) {
        if (this.L1) {
            return;
        }
        if (!b8Var2.getCheckView().a.q && b8Var.getCheckView().a.q) {
            float f = -this.v1;
            this.v1 = f;
            hl.A3(f, b8Var, null);
            return;
        }
        b8Var.setChecked(!b8Var.getCheckView().a.q);
        runnable.run();
    }

    public final void B(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (this.I != null) {
            int closestTab = getClosestTab();
            boolean z5 = false;
            if (this.q2 && !o0()) {
                z3 = true;
            } else {
                z3 = false;
            }
            s7 s7Var = this.q0;
            if (s7Var != null) {
                if (z3 && q() && (p0(closestTab) || (closestTab == 11 && h0()))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ((sla) s7Var).Y(z4, z);
            }
            sla slaVar = this.J;
            if (slaVar != null) {
                if (z3 && q() && !k0() && f0(closestTab)) {
                    z5 = true;
                }
                slaVar.Y(z5, z2);
            }
        }
    }

    public final void B0(int i, TL_stories.StoryItem storyItem, String str) {
        a39 a39Var = new a39(this, i, storyItem, (byte) 7);
        c6b storiesController = getStoriesController();
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.e0(i, this.m1, arrayList);
        d31.b0(this.y1).K(2131623980, hl.S2(ob6.G(1, "StoryRemovedFromAlbumTitle", str)), ob6.M0(2131743540, null), a39Var).j();
    }

    public final void B1() {
        if (this.I == null) {
            try {
                int c0 = c0(aob.y8);
                int c02 = c0(aob.z8);
                if (c0 != this.r2 || c02 != this.s2) {
                    this.r2 = c0;
                    this.s2 = c02;
                    s7[] s7VarArr = {this.x0, this.w0, this.y0, this.z0, this.o0};
                    for (int i = 0; i < 5; i++) {
                        s7 s7Var = s7VarArr[i];
                        if (s7Var != null) {
                            s7Var.setIconColor(c0);
                            if (s7Var.getBackground() != null) {
                                aob.F1(s7Var.getBackground(), c02, true);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void C() {
        char c;
        char c2;
        float abs;
        View childAt;
        int S;
        float f;
        float measuredWidth;
        zha[] zhaVarArr = this.n0;
        zha zhaVar = zhaVarArr[0];
        if (zhaVar != null && zhaVarArr[1] != null) {
            float f2 = 0.0f;
            fga fgaVar = this.c0;
            if (fgaVar != null) {
                if (j0(zhaVar.F) && zhaVarArr[0].F != 9) {
                    c = 1;
                } else {
                    c = 0;
                }
                if (zhaVarArr[1].getVisibility() == 0) {
                    if (j0(zhaVarArr[1].F) && zhaVarArr[1].F != 9) {
                        c2 = 1;
                    } else {
                        c2 = 0;
                    }
                } else {
                    c2 = c;
                }
                if (c == c2) {
                    if (c != 0) {
                        measuredWidth = 0.0f;
                        abs = 1.0f;
                    } else {
                        measuredWidth = zhaVarArr[0].getMeasuredWidth();
                        abs = 0.0f;
                    }
                    fgaVar.setTranslationX(measuredWidth);
                } else {
                    fgaVar.setTranslationX(zhaVarArr[c ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(fgaVar.getTranslationX()) / fgaVar.getMeasuredWidth());
                }
                float f3 = 0.0f;
                for (int i = 0; i < zhaVarArr.length; i++) {
                    if (zhaVarArr[i].getVisibility() == 0) {
                        jga jgaVar = zhaVarArr[i].h;
                        if (jgaVar.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = jgaVar.getChildAt(0);
                        }
                        if (childAt == null) {
                            S = -1;
                        } else {
                            S = RecyclerView.S(childAt);
                        }
                        if (S == 0) {
                            f = childAt.getY() - jgaVar.getPaddingTop();
                        } else if (jgaVar.getChildCount() == 0) {
                            f = 0.0f;
                        } else {
                            f = -hl.L(48.0f);
                        }
                        f3 += Utilities.l(1.0f - (zhaVarArr[i].getTranslationX() / zhaVarArr[i].getMeasuredWidth())) * f;
                    }
                }
                float l = Utilities.l(1.0f - ((-f3) / hl.N(48.0f)));
                float R1 = hl.R1(0.9f, 1.0f, l);
                fgaVar.setAlpha(l);
                fgaVar.setScaleX(R1);
                fgaVar.setScaleY(R1);
                fgaVar.setTranslationY(this.O1 + f3);
                f2 = abs;
            }
            xj3 xj3Var = this.S0;
            if (xj3Var != null) {
                xj3Var.setTranslationY(this.O1);
            }
            if (this.Y1 != f2) {
                this.Y1 = f2;
                invalidate();
            }
        }
    }

    public final void C0(TL_stories.StoryItem storyItem) {
        getStoriesController().r0(this.m1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        d31.b0(this.y1).G(2131623980, 5000, ob6.G(1, "StoryArchived", new Object[0])).j();
    }

    public final void C1() {
        if (n0()) {
            post(new gfa(this, (byte) 12));
            return;
        }
        lha lhaVar = this.K;
        if (lhaVar != null) {
            lhaVar.f();
        }
        ria riaVar = this.N;
        if (riaVar != null) {
            riaVar.f();
        }
        ria riaVar2 = this.O;
        if (riaVar2 != null) {
            riaVar2.f();
        }
        sia siaVar = this.M;
        if (siaVar != null) {
            siaVar.X(false);
        }
        ria riaVar3 = this.P;
        if (riaVar3 != null) {
            riaVar3.f();
        }
        nia niaVar = this.Q;
        if (niaVar != null) {
            niaVar.f();
        }
        uha uhaVar = this.R;
        if (uhaVar != null) {
            uhaVar.f();
        }
        oha ohaVar = this.f0;
        if (ohaVar != null) {
            ohaVar.f();
        }
        for (dja djaVar : this.m2.values()) {
            djaVar.c.f();
        }
    }

    public final boolean D() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eja.D():boolean");
    }

    public final void D0(int i, long j, ArrayList arrayList) {
        getStoriesController().a(i, j, arrayList);
    }

    public final void D1(zha zhaVar, boolean z) {
        boolean z2;
        Integer num = 1;
        int i = 0;
        if (zhaVar.b && this.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        k69 fastScroll = zhaVar.h.getFastScroll();
        ObjectAnimator objectAnimator = zhaVar.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            zhaVar.c.cancel();
        }
        if (!z) {
            fastScroll.animate().setListener(null).cancel();
            if (!z2) {
                i = 8;
            }
            fastScroll.setVisibility(i);
            if (!z2) {
                num = null;
            }
            fastScroll.setTag(num);
            fastScroll.setAlpha(1.0f);
            fastScroll.setScaleX(1.0f);
            fastScroll.setScaleY(1.0f);
            return;
        }
        Property property = View.ALPHA;
        if (z2) {
            if (fastScroll.getTag() == null) {
                fastScroll.animate().setListener(null).cancel();
                if (fastScroll.getVisibility() != 0) {
                    fastScroll.setVisibility(0);
                    fastScroll.setAlpha(0.0f);
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 1.0f);
                zhaVar.c = ofFloat;
                ofFloat.setDuration(150L).start();
                fastScroll.setTag(num);
            }
        } else if (fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new gf4(fastScroll));
            zhaVar.c = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setTag(null);
        }
    }

    public final boolean E(boolean z) {
        SparseArray[] sparseArrayArr;
        if (!this.F1) {
            return false;
        }
        int i = 1;
        while (true) {
            sparseArrayArr = this.c1;
            if (i < 0) {
                break;
            }
            sparseArrayArr[i].clear();
            i--;
        }
        this.d1 = 0;
        J0(sparseArrayArr[0]);
        bga bgaVar = this.a0;
        if (bgaVar != null) {
            bgaVar.h();
            bgaVar.j();
        }
        l1(false);
        J1(z);
        pia piaVar = this.U;
        if (piaVar != null) {
            piaVar.x.clear();
        }
        return true;
    }

    public final void E0(int i, long j) {
        r5b A = getStoriesController().A(j, true);
        int i2 = A.a;
        int c = A.c(i);
        if (c == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = uc7.s1(i2).j1(A.b);
        tL_deleteAlbum.album_id = ((w5b) A.h.remove(c)).a;
        ConnectionsManager.getInstance(i2).sendRequest(tL_deleteAlbum, null);
        A.f(true);
    }

    public final void E1() {
        boolean z;
        float f;
        s7 s7Var = this.w0;
        if (s7Var != null) {
            if (!this.y1.getMessagesController().E2(this.m1) && !e0()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            s7Var.setAlpha(f);
            if (z) {
                if (s7Var.getBackground() != null) {
                    s7Var.setBackground(null);
                }
            } else if (s7Var.getBackground() == null) {
                int i = aob.z8;
                hf0 f0 = aob.f0(c0(i), 5, -1);
                uob M = yob.M(i);
                s7Var.setBackground(f0);
                yob.j(s7Var, f0, null, M, this.I1);
            }
        }
    }

    public final s7 F(Context context, int i, int i2, String str) {
        s7 s7Var;
        jla jlaVar = this.I;
        if (jlaVar != null) {
            s7Var = jlaVar.r().a(i, i2);
        } else {
            int i3 = aob.z8;
            int c0 = c0(i3);
            int i4 = aob.y8;
            s7 s7Var2 = new s7(context, null, c0, c0(i4), false, null);
            s7Var2.setIcon(i2);
            s7Var2.setDuplicateParentStateEnabled(false);
            this.E0.addView(s7Var2, new LinearLayout.LayoutParams(hl.L(54.0f), -1));
            this.Q0.add(s7Var2);
            e29 iconView = s7Var2.getIconView();
            vnb vnbVar = this.I1;
            if (iconView != null) {
                yob.s(s7Var2.getIconView(), i4, vnbVar, PorterDuff.Mode.SRC_IN);
            }
            if (s7Var2.getBackground() != null) {
                Drawable background = s7Var2.getBackground();
                uob M = yob.M(i3);
                s7Var2.setBackground(background);
                yob.j(s7Var2, background, null, M, vnbVar);
            }
            s7Var = s7Var2;
        }
        s7Var.setContentDescription(str);
        s7Var.setOnClickListener(new ib(this, i, (byte) 7));
        return s7Var;
    }

    public final void F0(int i, String str, long j) {
        r5b A = getStoriesController().A(j, true);
        int i2 = A.a;
        int c = A.c(i);
        if (c == -1) {
            return;
        }
        ((w5b) A.h.get(c)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = uc7.s1(i2).j1(A.b);
        tL_updateAlbum.album_id = i;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i2).sendRequest(tL_updateAlbum, null);
        A.f(true);
    }

    public final void F1() {
        int i;
        cga cgaVar = this.b0;
        if (cgaVar != null) {
            int L = hl.L(48.0f) + this.d2;
            xj3 xj3Var = this.S0;
            if (xj3Var != null) {
                i = (int) xj3Var.c(hl.L(7.0f));
            } else {
                i = 0;
            }
            cgaVar.setPaddingTop(L + i);
        }
    }

    public final void G0(boolean z) {
        long j = this.G;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0 && !q0()) {
            for (int i2 = 0; i2 < 4; i2++) {
                int i3 = t2[i2];
                tia[] tiaVarArr = this.w1;
                if (!tiaVarArr[i3].h || z) {
                    long j2 = this.m1;
                    if (!wf3.B(j2)) {
                        tiaVarArr[i3].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i3 == 0) {
                            byte b = tiaVarArr[i3].q;
                            if (b == 1) {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                            } else if (b == 2) {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterVideo();
                            } else {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                            }
                        } else if (i3 == 1) {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterDocument();
                        } else if (i3 == 2) {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
                        } else {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterMusic();
                        }
                        tL_messages_getSearchResultsPositions.limit = 100;
                        e eVar = this.y1;
                        tL_messages_getSearchResultsPositions.peer = eVar.getMessagesController().j1(j2);
                        if (i != 0 && eVar.getUserConfig().e() == j2) {
                            tL_messages_getSearchResultsPositions.flags |= 4;
                            tL_messages_getSearchResultsPositions.saved_peer_id = eVar.getMessagesController().j1(j);
                        }
                        ConnectionsManager.getInstance(eVar.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(eVar.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new ln6(this, tiaVarArr[i3].p, i3, (byte) 2)), eVar.getClassGuid());
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void G1(boolean z) {
        cga cgaVar;
        fga fgaVar;
        boolean z2 = true;
        B(true, true);
        e29 e29Var = this.v0;
        if (e29Var == null) {
            return;
        }
        float f = 0.0f;
        if (!this.Y0 && (((cgaVar = this.b0) == null || !cgaVar.g()) && ((fgaVar = this.c0) == null || !fgaVar.f))) {
            f = Utilities.i(this.r0 + this.s0, 1.0f, 0.0f);
        }
        e29Var.setAlpha(f);
        if (z) {
            if (U(1.0f) <= 0.5f) {
                z2 = false;
            }
            j(z2);
        } else if (this.A0 == 2) {
            if (this.s0 <= 0.1f) {
                z2 = false;
            }
            j(z2);
        } else {
            if (this.r0 >= 0.1f) {
                z2 = false;
            }
            j(z2);
        }
    }

    public boolean H() {
        return this instanceof re5;
    }

    public final void H0(int i) {
        int i2;
        int i3 = 2;
        tia[] tiaVarArr = this.w1;
        if (i == 0) {
            byte b = tiaVarArr[0].q;
            if (b == 1) {
                i3 = 6;
            } else if (b == 2) {
                i3 = 7;
            } else {
                i2 = 0;
            }
            i2 = i3;
        } else if (i == 1) {
            i2 = 1;
        } else {
            if (i != 2) {
                i3 = 4;
                if (i != 4) {
                    i3 = 5;
                    if (i != 5) {
                        i3 = 3;
                    }
                }
            }
            i2 = i3;
        }
        tiaVarArr[i].g = true;
        e eVar = this.y1;
        eVar.getMediaDataController().P0(this.m1, 50, 0, tiaVarArr[i].k, i2, this.G, 1, eVar.getClassGuid(), tiaVarArr[i].p, null, null);
    }

    public final void H1(zha zhaVar) {
        boolean z;
        boolean d1 = zhaVar.h.d1();
        if (d1) {
            zhaVar.h.setSectionsDrawBackground(this.c2);
        }
        if (this.c2 && !d1 && zhaVar.F != 15) {
            z = true;
        } else {
            z = false;
        }
        zhaVar.setDrawPageBackground(z);
        if (zhaVar.F == 15) {
            Drawable drawable = zhaVar.P;
            if (drawable == null) {
                drawable = zhaVar.getBackground();
            }
            Drawable d = mm8.d(drawable, this.y1.getCurrentAccount(), this.m1, aob.I.o());
            if (!this.c2) {
                zhaVar.setWallpaper(null);
                zhaVar.setBackground(d);
                zhaVar.setOutlineProvider(new yi((byte) 17));
                zhaVar.setClipToOutline(true);
                return;
            }
            zhaVar.setBackground(null);
            zhaVar.setClipToOutline(false);
            zhaVar.setWallpaper(d);
            return;
        }
        zhaVar.setClipToOutline(false);
        zhaVar.setBackground(null);
        zhaVar.setWallpaper(null);
    }

    public final boolean I(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x = (-view.getX()) - getX();
        zha[] zhaVarArr = this.n0;
        motionEvent.offsetLocation(x - zhaVarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - zhaVarArr[0].getY()) - zhaVarArr[0].h.getFastScroll().getY());
        return zhaVarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public int I0() {
        return 0;
    }

    public final void I1(zha zhaVar) {
        boolean z;
        float f;
        int i;
        float f2;
        int i2 = zhaVar.F;
        if (i2 != 0 && !j0(i2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            f = 0.0f;
        } else {
            f = 12.0f;
        }
        if (z) {
            i = 8;
        } else {
            i = 12;
        }
        float f3 = i + 48;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = 12.0f;
        }
        FrameLayout.LayoutParams d = tre.d(-1, -1.0f, 119, f, f3, f2, f2);
        d.topMargin = X(zhaVar.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = zhaVar.s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        zhaVar.s.setLayoutParams(d);
    }

    public final boolean J(int i) {
        tia[] tiaVarArr = this.x1.n;
        if (tiaVarArr == null) {
            return false;
        }
        tia[] tiaVarArr2 = this.w1;
        if (i == 0) {
            tia tiaVar = tiaVarArr2[i];
            if (!tiaVar.h) {
                int[] iArr = tiaVar.f;
                int[] iArr2 = tiaVarArr[i].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = tiaVarArr2[i].f;
            int[] iArr4 = tiaVarArr[i].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        tiaVarArr2[i].a.addAll(tiaVarArr[i].a);
        tiaVarArr2[i].c.addAll(tiaVarArr[i].c);
        for (Map.Entry entry : tiaVarArr[i].d.entrySet()) {
            tiaVarArr2[i].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i2 = 0; i2 < 2; i2++) {
            tiaVarArr2[i].b[i2] = tiaVarArr[i].b[i2].clone();
            tia tiaVar2 = tiaVarArr2[i];
            int[] iArr5 = tiaVar2.j;
            tia tiaVar3 = tiaVarArr[i];
            iArr5[i2] = tiaVar3.j[i2];
            tiaVar2.i[i2] = tiaVar3.i[i2];
        }
        tiaVarArr2[i].e.addAll(tiaVarArr[i].e);
        return !tiaVarArr[i].a.isEmpty();
    }

    public final void J1(boolean z) {
        int i = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i < zhaVarArr.length) {
                int childCount = zhaVarArr[i].h.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = zhaVarArr[i].h.getChildAt(i2);
                    if (childAt instanceof zea) {
                        ((zea) childAt).b(false, z);
                    } else if (childAt instanceof jja) {
                        ((jja) childAt).i(false, z);
                    } else if (childAt instanceof cfa) {
                        ((cfa) childAt).f(false, z);
                    } else if (childAt instanceof vea) {
                        ((vea) childAt).e(false, z);
                    } else if (childAt instanceof vw2) {
                        ((vw2) childAt).c(false, z);
                    } else if (childAt instanceof of3) {
                        ((of3) childAt).d0(false, z);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean K(int i, dia diaVar) {
        final ?? r14;
        dia diaVar2;
        dia diaVar3;
        boolean z;
        boolean z2;
        v5b v5bVar;
        TLRPC.Chat M0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        bga bgaVar;
        bga bgaVar2;
        ?? r13;
        byte b;
        int i2;
        axa axaVar;
        boolean w;
        String str;
        b8 b8Var;
        boolean z3;
        dia diaVar4;
        b8 b8Var2;
        b8 b8Var3;
        dja u1;
        boolean j0 = j0(i);
        e eVar = this.y1;
        int currentAccount = eVar.getCurrentAccount();
        uc7 s1 = uc7.s1(currentAccount);
        long j = this.m1;
        TLRPC.User X1 = s1.X1(Long.valueOf(j));
        boolean h = getStoriesController().h(j);
        if (t0(i) && h && (u1 = u1(i)) != null) {
            int i3 = u1.b;
            diaVar.Z(2131231767, new kfa(this, i3, (byte) 0), ob6.M0(2131744455, null), false, true);
            g(diaVar, eVar, this.m1, i3);
            diaVar.Z(2131232797, new kfa(this, i3, (byte) 2), ob6.M0(2131744447, null), false, true);
            diaVar.Z(2131232113, new kfa(this, i3, (byte) 3), ob6.M0(2131744453, null), true, true);
            diaVar.H();
            h(diaVar);
            return true;
        }
        if (i == 14) {
            cga cgaVar = this.b0;
            if (cgaVar != null) {
                au8 currentPage = cgaVar.getCurrentPage();
                if (currentPage == null) {
                    axaVar = null;
                } else {
                    axaVar = currentPage.e;
                }
                if (axaVar != null) {
                    long j2 = cgaVar.c;
                    int i4 = cgaVar.b;
                    if (j2 == yac.h(i4).e()) {
                        w = true;
                    } else if (j2 >= 0) {
                        w = false;
                    } else {
                        w = xc2.w(5, uc7.s1(i4).M0(Long.valueOf(-j2)));
                    }
                    Runnable[] runnableArr = new Runnable[1];
                    if (!axaVar.c) {
                        str = 0;
                        b8Var = diaVar.Z(2131231894, new kba(axaVar, runnableArr, (byte) 3), ob6.M0(2131750156, null), false, false);
                        z3 = true;
                    } else {
                        str = 0;
                        b8Var = null;
                        z3 = false;
                    }
                    if (cgaVar.b()) {
                        diaVar.Z(2131231829, new gfa(this, (byte) 10), ob6.M0(2131750057, str), false, true);
                        z3 = true;
                    }
                    if (cgaVar.e.h()) {
                        if (axaVar.i().isEmpty() && !currentPage.d) {
                            diaVar4 = diaVar;
                        } else {
                            diaVar.Z(2131232797, new gfa(this, (byte) 11), ob6.M0(2131749991, str), false, true);
                            diaVar4 = diaVar;
                        }
                        z3 = true;
                    } else {
                        diaVar4 = diaVar;
                    }
                    if (z3) {
                        diaVar4.H();
                    }
                    b8 K = diaVar4.K(ob6.M0(2131750154, str));
                    b8 K2 = diaVar4.K(ob6.M0(2131750158, str));
                    b8 K3 = diaVar4.K(ob6.M0(2131750153, str));
                    b8 K4 = diaVar4.K(ob6.M0(2131750155, str));
                    if (w) {
                        diaVar4.H();
                        b8 K5 = diaVar4.K(ob6.M0(2131750160, str));
                        b8Var3 = diaVar4.K(ob6.M0(2131750159, str));
                        b8Var2 = K5;
                    } else {
                        b8Var2 = str;
                        b8Var3 = b8Var2;
                    }
                    axa axaVar2 = axaVar;
                    f2a f2aVar = new f2a(b8Var, axaVar2, K, K2, K3, K4, w, b8Var2, b8Var3);
                    b8 b8Var4 = b8Var2;
                    b8 b8Var5 = b8Var3;
                    runnableArr[0] = f2aVar;
                    f2aVar.run();
                    eu8.j(K, axaVar2, runnableArr[0], 1);
                    eu8.j(K2, axaVar2, runnableArr[0], 2);
                    eu8.j(K3, axaVar2, runnableArr[0], 4);
                    eu8.j(K4, axaVar2, runnableArr[0], 8);
                    if (w) {
                        eu8.j(b8Var4, axaVar2, runnableArr[0], 256);
                        eu8.j(b8Var5, axaVar2, runnableArr[0], 512);
                        return true;
                    }
                }
            }
            return false;
        } else if (i == 13 && X1 != null && X1.bot && X1.bot_has_main_app && X1.bot_can_edit && (bgaVar = this.a0) != null) {
            int itemsCount = bgaVar.getItemsCount();
            if (itemsCount < eVar.getMessagesController().l4.A2.f()) {
                r13 = 0;
                bgaVar2 = bgaVar;
                b = 5;
                diaVar.Z(2131232049, new gfa(this, (byte) 3), ob6.M0(2131746444, null), false, true);
            } else {
                bgaVar2 = bgaVar;
                r13 = 0;
                b = 5;
            }
            if (itemsCount > 1 && !bgaVar2.d()) {
                diaVar.Z(2131232797, new gfa(this, (byte) 4), ob6.M0(2131746417, r13), false, true);
            }
            if (itemsCount > 0) {
                if (bgaVar2.d()) {
                    i2 = 2131746415;
                } else {
                    i2 = 2131746416;
                }
                diaVar.Z(2131232362, new gfa(this, b), ob6.M0(i2, r13), false, true);
            }
            if (!TextUtils.isEmpty(bgaVar2.getCurrentLang())) {
                diaVar.Z(2131232113, new gfa(this, (byte) 6), ob6.a0(r13, r13, 2131746418, r3c.K0(bgaVar2.getCurrentLang(), r13, r13)), true, true);
                return true;
            }
        } else if (i == 11) {
            diaVar.Z(2131232118, new gfa(this, (byte) 7), ob6.M0(2131745592, null), false, true);
            diaVar.H();
            diaVar.Z(2131232188, new gfa(this, (byte) 8), ob6.M0(2131754383, null), false, true);
            diaVar.Z(2131232113, new gfa(this, (byte) 9), ob6.M0(2131751555, null), false, true);
            return true;
        } else {
            if ((i == 8 || t0(i)) && h) {
                r14 = 1;
                diaVar2 = diaVar;
                diaVar2.Z(2131231769, new gfa(this, (byte) 1), ob6.M0(2131744464, null), false, true);
                diaVar2.H();
            } else {
                diaVar2 = diaVar;
                r14 = 1;
            }
            h(diaVar2);
            if (!wf3.B(j)) {
                if (X1 == null || !X1.bot) {
                    diaVar2.Z(2131232082, new kfa(this, i, r14), ob6.M0(2131752623, null), false, true);
                    if (this.g1 != null && !s0() && (M0 = uc7.s1(currentAccount).M0(Long.valueOf(this.g1.id))) != null && (tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.edit_stories) {
                        diaVar3 = diaVar;
                        diaVar3.Z(2131232056, new gfa(this, (byte) 2), ob6.M0(2131747537, null), false, true);
                    } else {
                        diaVar3 = diaVar;
                    }
                    tia[] tiaVarArr = this.w1;
                    if (!j0) {
                        tia tiaVar = tiaVarArr[0];
                        if (!tiaVar.w || !tiaVar.v) {
                            boolean[] zArr = tiaVar.i;
                            if (zArr[0] && zArr[r14] && tiaVar.l) {
                                return r14;
                            }
                        }
                    }
                    diaVar3.H();
                    final b8 K6 = diaVar3.K(ob6.M0(2131748407, null));
                    final b8 K7 = diaVar3.K(ob6.M0(2131748406, null));
                    if (j0) {
                        final bja v1 = v1(i);
                        if (v1 != null && (v5bVar = v1.s) != null) {
                            K6.setChecked(v5bVar.n);
                            K7.setChecked(v1.s.o);
                        }
                        K6.setOnClickListener(new View.OnClickListener(this) {
                            public final eja b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                byte b2 = r5;
                                final bja bjaVar = v1;
                                final b8 b8Var6 = K7;
                                final b8 b8Var7 = K6;
                                eja ejaVar = this.b;
                                switch (b2) {
                                    case 0:
                                        ejaVar.A1(b8Var7, b8Var6, new Runnable() {
                                            @Override
                                            public final void run() {
                                                v5b v5bVar2;
                                                v5b v5bVar3;
                                                byte b3 = r4;
                                                b8 b8Var8 = b8Var6;
                                                b8 b8Var9 = b8Var7;
                                                bja bjaVar2 = bjaVar;
                                                switch (b3) {
                                                    case 0:
                                                        if (bjaVar2 != null && (v5bVar2 = bjaVar2.s) != null) {
                                                            boolean z4 = b8Var9.getCheckView().a.q;
                                                            boolean z5 = b8Var8.getCheckView().a.q;
                                                            v5bVar2.n = z4;
                                                            v5bVar2.o = z5;
                                                            v5bVar2.d(true);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        if (bjaVar2 != null && (v5bVar3 = bjaVar2.s) != null) {
                                                            boolean z6 = b8Var9.getCheckView().a.q;
                                                            boolean z7 = b8Var8.getCheckView().a.q;
                                                            v5bVar3.n = z6;
                                                            v5bVar3.o = z7;
                                                            v5bVar3.d(true);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        ejaVar.A1(b8Var7, b8Var6, new Runnable() {
                                            @Override
                                            public final void run() {
                                                v5b v5bVar2;
                                                v5b v5bVar3;
                                                byte b3 = r4;
                                                b8 b8Var8 = b8Var7;
                                                b8 b8Var9 = b8Var6;
                                                bja bjaVar2 = bjaVar;
                                                switch (b3) {
                                                    case 0:
                                                        if (bjaVar2 != null && (v5bVar2 = bjaVar2.s) != null) {
                                                            boolean z4 = b8Var9.getCheckView().a.q;
                                                            boolean z5 = b8Var8.getCheckView().a.q;
                                                            v5bVar2.n = z4;
                                                            v5bVar2.o = z5;
                                                            v5bVar2.d(true);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        if (bjaVar2 != null && (v5bVar3 = bjaVar2.s) != null) {
                                                            boolean z6 = b8Var9.getCheckView().a.q;
                                                            boolean z7 = b8Var8.getCheckView().a.q;
                                                            v5bVar3.n = z6;
                                                            v5bVar3.o = z7;
                                                            v5bVar3.d(true);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                }
                            }
                        });
                        K7.setOnClickListener(new View.OnClickListener(this) {
                            public final eja b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                byte b2 = r5;
                                final bja bjaVar = v1;
                                final b8 b8Var6 = K6;
                                final b8 b8Var7 = K7;
                                eja ejaVar = this.b;
                                switch (b2) {
                                    case 0:
                                        ejaVar.A1(b8Var7, b8Var6, new Runnable() {
                                            @Override
                                            public final void run() {
                                                v5b v5bVar2;
                                                v5b v5bVar3;
                                                byte b3 = r4;
                                                b8 b8Var8 = b8Var6;
                                                b8 b8Var9 = b8Var7;
                                                bja bjaVar2 = bjaVar;
                                                switch (b3) {
                                                    case 0:
                                                        if (bjaVar2 != null && (v5bVar2 = bjaVar2.s) != null) {
                                                            boolean z4 = b8Var9.getCheckView().a.q;
                                                            boolean z5 = b8Var8.getCheckView().a.q;
                                                            v5bVar2.n = z4;
                                                            v5bVar2.o = z5;
                                                            v5bVar2.d(true);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        if (bjaVar2 != null && (v5bVar3 = bjaVar2.s) != null) {
                                                            boolean z6 = b8Var9.getCheckView().a.q;
                                                            boolean z7 = b8Var8.getCheckView().a.q;
                                                            v5bVar3.n = z6;
                                                            v5bVar3.o = z7;
                                                            v5bVar3.d(true);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        ejaVar.A1(b8Var7, b8Var6, new Runnable() {
                                            @Override
                                            public final void run() {
                                                v5b v5bVar2;
                                                v5b v5bVar3;
                                                byte b3 = r4;
                                                b8 b8Var8 = b8Var7;
                                                b8 b8Var9 = b8Var6;
                                                bja bjaVar2 = bjaVar;
                                                switch (b3) {
                                                    case 0:
                                                        if (bjaVar2 != null && (v5bVar2 = bjaVar2.s) != null) {
                                                            boolean z4 = b8Var9.getCheckView().a.q;
                                                            boolean z5 = b8Var8.getCheckView().a.q;
                                                            v5bVar2.n = z4;
                                                            v5bVar2.o = z5;
                                                            v5bVar2.d(true);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        if (bjaVar2 != null && (v5bVar3 = bjaVar2.s) != null) {
                                                            boolean z6 = b8Var9.getCheckView().a.q;
                                                            boolean z7 = b8Var8.getCheckView().a.q;
                                                            v5bVar3.n = z6;
                                                            v5bVar3.o = z7;
                                                            v5bVar3.d(true);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                }
                            }
                        });
                        return r14;
                    }
                    byte b2 = tiaVarArr[0].q;
                    if (b2 != 0 && b2 != r14) {
                        z = false;
                    } else {
                        z = r14;
                    }
                    K6.setChecked(z);
                    byte b3 = tiaVarArr[0].q;
                    if (b3 != 0 && b3 != 2) {
                        z2 = false;
                    } else {
                        z2 = r14;
                    }
                    K7.setChecked(z2);
                    K6.setOnClickListener(new View.OnClickListener(this) {
                        public final eja b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b4 = r4;
                            final b8 b8Var6 = K7;
                            final b8 b8Var7 = K6;
                            final eja ejaVar = this.b;
                            switch (b4) {
                                case 0:
                                    ejaVar.A1(b8Var7, b8Var6, new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b5 = r4;
                                            byte b6 = 0;
                                            b8 b8Var8 = b8Var6;
                                            b8 b8Var9 = b8Var7;
                                            eja ejaVar2 = ejaVar;
                                            switch (b5) {
                                                case 0:
                                                    ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 1 : (byte) 1;
                                                    ejaVar2.x();
                                                    return;
                                                default:
                                                    ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 2 : (byte) 2;
                                                    ejaVar2.x();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    ejaVar.A1(b8Var7, b8Var6, new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b5 = r4;
                                            byte b6 = 0;
                                            b8 b8Var8 = b8Var7;
                                            b8 b8Var9 = b8Var6;
                                            eja ejaVar2 = ejaVar;
                                            switch (b5) {
                                                case 0:
                                                    ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 1 : (byte) 1;
                                                    ejaVar2.x();
                                                    return;
                                                default:
                                                    ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 2 : (byte) 2;
                                                    ejaVar2.x();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                            }
                        }
                    });
                    K7.setOnClickListener(new View.OnClickListener(this) {
                        public final eja b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b4 = r14;
                            final b8 b8Var6 = K6;
                            final b8 b8Var7 = K7;
                            final eja ejaVar = this.b;
                            switch (b4) {
                                case 0:
                                    ejaVar.A1(b8Var7, b8Var6, new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b5 = r4;
                                            byte b6 = 0;
                                            b8 b8Var8 = b8Var6;
                                            b8 b8Var9 = b8Var7;
                                            eja ejaVar2 = ejaVar;
                                            switch (b5) {
                                                case 0:
                                                    ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 1 : (byte) 1;
                                                    ejaVar2.x();
                                                    return;
                                                default:
                                                    ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 2 : (byte) 2;
                                                    ejaVar2.x();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    ejaVar.A1(b8Var7, b8Var6, new Runnable() {
                                        @Override
                                        public final void run() {
                                            byte b5 = r4;
                                            byte b6 = 0;
                                            b8 b8Var8 = b8Var7;
                                            b8 b8Var9 = b8Var6;
                                            eja ejaVar2 = ejaVar;
                                            switch (b5) {
                                                case 0:
                                                    ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 1 : (byte) 1;
                                                    ejaVar2.x();
                                                    return;
                                                default:
                                                    ejaVar2.w1[0].q = (b8Var9.getCheckView().a.q && b8Var8.getCheckView().a.q) ? (byte) 2 : (byte) 2;
                                                    ejaVar2.x();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                            }
                        }
                    });
                    return r14;
                }
                return r14;
            }
            return r14;
        }
        return true;
    }

    public final void K1(float f) {
        s7 s7Var = this.p0;
        if (s7Var == null) {
            return;
        }
        zha[] zhaVarArr = this.n0;
        zha zhaVar = zhaVarArr[1];
        float f2 = 0.0f;
        if (zhaVar != null && zhaVar.F == 11) {
            f2 = 0.0f + f;
        }
        int i = 0;
        zha zhaVar2 = zhaVarArr[0];
        if (zhaVar2 != null && zhaVar2.F == 11) {
            f2 += 1.0f - f;
        }
        s7Var.setAlpha(f2);
        float f3 = (0.15f * f2) + 0.85f;
        s7Var.setScaleX(f3);
        s7Var.setScaleY(f3);
        if (f2 <= 0.01f) {
            i = 8;
        }
        s7Var.setVisibility(i);
    }

    public final void L(int i, d79 d79Var, boolean z) {
        eia eiaVar;
        ArrayList arrayList = this.w1[i].e;
        int K0 = ((x46) d79Var.getLayoutManager()).K0();
        if (K0 >= 0) {
            int i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    if (K0 <= ((eia) arrayList.get(i2)).b) {
                        eiaVar = (eia) arrayList.get(i2);
                        break;
                    }
                    i2++;
                } else {
                    eiaVar = null;
                    break;
                }
            }
            if (eiaVar == null) {
                eiaVar = (eia) c00.g(1, arrayList);
            }
            if (eiaVar != null) {
                v0(i, eiaVar.d, eiaVar.b + 1, z);
            }
        }
    }

    public final void L0() {
        v5b v5bVar;
        v5b v5bVar2;
        this.K1.a();
        oha ohaVar = this.f0;
        if (ohaVar != null && (v5bVar2 = ohaVar.s) != null && v5bVar2 != null) {
            v5bVar2.z(ohaVar.w);
        }
        aga agaVar = this.h0;
        if (agaVar != null && (v5bVar = agaVar.s) != null && v5bVar != null) {
            v5bVar.z(agaVar.w);
        }
        for (dja djaVar : this.m2.values()) {
            cja cjaVar = djaVar.c;
            v5b v5bVar3 = cjaVar.s;
            if (v5bVar3 != null && v5bVar3 != null) {
                v5bVar3.z(cjaVar.w);
            }
        }
    }

    public final void L1() {
        float f;
        float f2;
        s7 s7Var = this.p0;
        if (s7Var == null) {
            return;
        }
        boolean z = true;
        zha zhaVar = this.n0[1];
        if (zhaVar == null || zhaVar.F != 11) {
            z = false;
        }
        if (z) {
            s7Var.setVisibility(0);
        }
        ViewPropertyAnimator animate = s7Var.animate();
        float f3 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f);
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.85f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f2);
        if (!z) {
            f3 = 0.85f;
        }
        scaleX.scaleY(f3).withEndAction(new q38((byte) 12, this, z)).setDuration(420L).setInterpolator(k43.h).start();
    }

    public final void M() {
        zha[] zhaVarArr;
        zha zhaVar;
        boolean z;
        int i;
        j79 adapter;
        if (this.r1) {
            int i2 = 0;
            while (true) {
                zhaVarArr = this.n0;
                if (i2 < zhaVarArr.length) {
                    zhaVar = zhaVarArr[i2];
                    if (zhaVar.F == this.s1) {
                        break;
                    }
                    i2++;
                } else {
                    zhaVar = null;
                    break;
                }
            }
            if (zhaVar != null) {
                boolean j0 = j0(zhaVar.F);
                float f = this.q1;
                float f2 = 1.0f;
                int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                tia[] tiaVarArr = this.w1;
                if (i3 == 0) {
                    this.r1 = false;
                    int i4 = this.t1;
                    int[] iArr = this.p1;
                    iArr[j0 ? 1 : 0] = i4;
                    if (!j0) {
                        xea.A(i4);
                    } else if (W(zhaVar.F) >= 5) {
                        xea.E(this.t1);
                    }
                    for (int i5 = 0; i5 < zhaVarArr.length; i5++) {
                        zha zhaVar2 = zhaVarArr[i5];
                        if (zhaVar2 != null && zhaVar2.h != null && (((i = zhaVar2.F) == 0 || j0(i)) && (adapter = zhaVarArr[i5].h.getAdapter()) != null)) {
                            int b = adapter.b();
                            if (i5 == 0) {
                                tiaVarArr[0].g(false);
                            }
                            zhaVarArr[i5].n.setVisibility(8);
                            zhaVarArr[i5].x.x1(iArr[j0 ? 1 : 0]);
                            zhaVarArr[i5].h.c0();
                            zhaVarArr[i5].h.invalidate();
                            if (adapter.b() == b) {
                                hl.V3(zhaVarArr[i5].h);
                            } else {
                                adapter.f();
                            }
                        }
                    }
                    if (this.s >= 0) {
                        for (int i6 = 0; i6 < zhaVarArr.length; i6++) {
                            zha zhaVar3 = zhaVarArr[i6];
                            if (zhaVar3.F == this.s1) {
                                View m = zhaVar3.r.m(this.s);
                                if (m != null) {
                                    this.w = m.getTop();
                                }
                                zha zhaVar4 = zhaVarArr[i6];
                                zhaVar4.x.g1(this.s, (-zhaVar4.h.getPaddingTop()) + this.w);
                            }
                        }
                        return;
                    }
                    e1();
                } else if (f == 0.0f) {
                    this.r1 = false;
                    if (this.s1 == 0) {
                        tiaVarArr[0].g(false);
                    }
                    zhaVar.n.setVisibility(8);
                    zhaVar.h.invalidate();
                } else {
                    if (f > 0.2f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        f2 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
                    ofFloat.addUpdateListener(new aha(this, zhaVar, (byte) 0));
                    ofFloat.addListener(new fq1(this, z, j0 ? 1 : 0, zhaVar));
                    ofFloat.setInterpolator(k43.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void M0(int i, View view, r47 r47Var, int i2) {
        TLRPC.WebPage webPage;
        String str;
        char c;
        int i3;
        int i4;
        boolean z;
        if (r47Var != null && !this.r1) {
            fga fgaVar = this.c0;
            if (fgaVar == null || !fgaVar.f) {
                int i5 = 0;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                i5 = 0;
                String str2 = null;
                v5b v5bVar = null;
                if (this.F1) {
                    int i6 = 8;
                    if (i2 != 8 || p()) {
                        if (r47.B0(r47Var.k) == this.m1) {
                            c = 0;
                        } else {
                            c = 1;
                        }
                        SparseArray[] sparseArrayArr = this.c1;
                        if (sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0) {
                            sparseArrayArr[c].remove(r47Var.e1());
                            if (!r47Var.s(null, false)) {
                                this.d1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c].put(r47Var.e1(), r47Var);
                                if (!r47Var.s(null, false)) {
                                    this.d1++;
                                }
                            } else {
                                return;
                            }
                        }
                        J0(sparseArrayArr[0]);
                        if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                            l1(false);
                        } else {
                            j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                            if (this.d1 == 0) {
                                i3 = 0;
                            } else {
                                i3 = 8;
                            }
                            this.o0.setVisibility(i3);
                            s7 s7Var = this.x0;
                            if (s7Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i4 = 0;
                                } else {
                                    i4 = 8;
                                }
                                s7Var.setVisibility(i4);
                            }
                            s7 s7Var2 = this.w0;
                            if (s7Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i6 = 0;
                                }
                                s7Var2.setVisibility(i6);
                            }
                            M1();
                        }
                        this.e1 = false;
                        if (view instanceof zea) {
                            zea zeaVar = (zea) view;
                            if (sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0) {
                                z2 = true;
                            }
                            zeaVar.b(z2, true);
                        } else if (view instanceof kja) {
                            kja kjaVar = (kja) view;
                            if (sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            kjaVar.b(0, z, true);
                        } else if (view instanceof cfa) {
                            cfa cfaVar = (cfa) view;
                            if (sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0) {
                                z3 = true;
                            }
                            cfaVar.f(z3, true);
                        } else if (view instanceof vea) {
                            vea veaVar = (vea) view;
                            if (sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0) {
                                z4 = true;
                            }
                            veaVar.e(z4, true);
                        } else if (view instanceof vw2) {
                            vw2 vw2Var = (vw2) view;
                            if (sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0) {
                                z5 = true;
                            }
                            vw2Var.c(z5, true);
                        } else if (view instanceof jja) {
                            jja jjaVar = (jja) view;
                            if (sparseArrayArr[c].indexOfKey(r47Var.e1()) >= 0) {
                                z6 = true;
                            }
                            jjaVar.i(z6, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    lga lgaVar = this.u1;
                    tia[] tiaVarArr = this.w1;
                    e eVar = this.y1;
                    if (i2 == 0) {
                        tia tiaVar = tiaVarArr[i2];
                        int i7 = i - tiaVar.m;
                        if (i7 >= 0 && i7 < tiaVar.a.size()) {
                            PhotoViewer.q0().T1(null, eVar, null);
                            PhotoViewer.q0().n1(tiaVarArr[i2].a, i7, this.m1, this.f1, this.G, lgaVar);
                        }
                    } else if (i2 != 2 && i2 != 4) {
                        if (i2 == 5) {
                            PhotoViewer.q0().T1(null, eVar, null);
                            int indexOf = tiaVarArr[i2].a.indexOf(r47Var);
                            if (indexOf < 0) {
                                PhotoViewer.q0().n1(qd4.t(r47Var), 0, 0L, 0L, 0L, lgaVar);
                            } else {
                                PhotoViewer.q0().n1(tiaVarArr[i2].a, indexOf, this.m1, this.f1, this.G, lgaVar);
                            }
                        } else if (i2 == 1) {
                            if (view instanceof zea) {
                                zea zeaVar2 = (zea) view;
                                TLRPC.Document F0 = r47Var.F0();
                                if (zeaVar2.H) {
                                    if (r47Var.x()) {
                                        PhotoViewer.q0().T1(null, eVar, null);
                                        int indexOf2 = tiaVarArr[i2].a.indexOf(r47Var);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.q0().n1(qd4.t(r47Var), 0, 0L, 0L, 0L, lgaVar);
                                            return;
                                        }
                                        PhotoViewer.q0().n1(tiaVarArr[i2].a, indexOf2, this.m1, this.f1, this.G, lgaVar);
                                        return;
                                    }
                                    hl.q2(r47Var, eVar.getParentActivity(), eVar);
                                } else if (!zeaVar2.G) {
                                    r47 message = zeaVar2.getMessage();
                                    message.P = true;
                                    eVar.getFileLoader().X(F0, message, 0, 0);
                                    zeaVar2.f(true);
                                } else {
                                    eVar.getFileLoader().f(F0);
                                    zeaVar2.f(true);
                                }
                            }
                        } else if (i2 == 3) {
                            try {
                                if (r47.n1(r47Var.k) != null) {
                                    webPage = r47.n1(r47Var.k).webpage;
                                } else {
                                    webPage = null;
                                }
                                if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                    if (webPage.cached_page != null) {
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(r47Var) == null) {
                                            eVar.createArticleViewer(false).L(r47Var, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        iv3.J0(eVar, r47Var, this.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                        return;
                                    }
                                    str = webPage.url;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    ArrayList arrayList = ((cfa) view).F;
                                    if (arrayList.size() > 0) {
                                        str2 = ((CharSequence) arrayList.get(0)).toString();
                                    }
                                    str = str2;
                                }
                                if (str != null) {
                                    Y0(str);
                                }
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                        } else if (j0(i2)) {
                            bja v1 = v1(i2);
                            if (v1 != null) {
                                v5bVar = v1.s;
                            }
                            if (v5bVar != null) {
                                lcb orCreateStoryViewer = eVar.getOrCreateStoryViewer();
                                Context context = getContext();
                                int e1 = r47Var.e1();
                                l6b a = l6b.a(this.n0[0].h);
                                a.e = new ye9(v5bVar, (byte) 28);
                                if ((eVar instanceof ProfileActivity) && ((ProfileActivity) eVar).s1) {
                                    i5 = hl.L(68.0f);
                                }
                                a.s += i5;
                                orCreateStoryViewer.G(context, e1, v5bVar, a);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof vea) {
                        ((vea) view).a();
                    }
                }
                E1();
            }
        }
    }

    public final void M1() {
        boolean z;
        int i;
        v5b v5bVar;
        boolean l0 = l0();
        s7 s7Var = this.z0;
        s7 s7Var2 = this.y0;
        int i2 = 8;
        if (l0) {
            if (s7Var2 != null) {
                s7Var2.setVisibility(8);
            }
            if (s7Var != null) {
                s7Var.setVisibility(8);
            }
        } else if (getClosestTab() == 9) {
            if (s7Var2 != null) {
                s7Var2.setVisibility(8);
            }
            if (s7Var != null) {
                s7Var.setVisibility(8);
            }
        } else if (getClosestTab() == 8) {
            int i3 = 0;
            while (true) {
                SparseArray[] sparseArrayArr = this.c1;
                if (i3 < sparseArrayArr[0].size()) {
                    r47 r47Var = (r47) sparseArrayArr[0].valueAt(i3);
                    oha ohaVar = this.f0;
                    if (ohaVar != null && (v5bVar = ohaVar.s) != null && !v5bVar.m(r47Var.e1())) {
                        z = true;
                        break;
                    }
                    i3++;
                } else {
                    z = false;
                    break;
                }
            }
            if (s7Var2 != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                s7Var2.setVisibility(i);
            }
            if (s7Var != null) {
                if (!z) {
                    i2 = 0;
                }
                s7Var.setVisibility(i2);
            }
        } else if (t0(getClosestTab())) {
            if (s7Var2 != null) {
                s7Var2.setVisibility(8);
            }
            if (s7Var != null) {
                s7Var.setVisibility(8);
            }
        }
    }

    public final void N(int i) {
        ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 0) {
            if (!hl.O1() && org.telegram.messenger.a.b.getResources().getConfiguration().orientation == 2) {
                this.D0.setTextSize(18);
            } else {
                this.D0.setTextSize(20);
            }
        }
        if (i == 0) {
            this.K.f();
        }
    }

    public final boolean N0(r47 r47Var, View view, int i, boolean z) {
        fga fgaVar;
        char c;
        int i2;
        int i3;
        int i4;
        final TL_stories.StoryItem storyItem;
        oha ohaVar;
        v5b v5bVar;
        if (!this.F1) {
            e eVar = this.y1;
            if (eVar.getParentActivity() != null && r47Var != null && ((fgaVar = this.c0) == null || !fgaVar.f)) {
                hl.t1(eVar.getParentActivity().getCurrentFocus());
                long j = this.m1;
                if (z && ((t0(getClosestTab()) || getClosestTab() == 8) && !this.F1)) {
                    if (view instanceof jja) {
                        jja jjaVar = (jja) view;
                        jjaVar.k(jjaVar.r, jjaVar.n, true);
                    }
                    TL_stories.StoryItem storyItem2 = r47Var.l;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean t0 = t0(getClosestTab());
                        fu5 J = fu5.J(eVar, view);
                        fu5 K = J.K();
                        K.b(2131231243, ob6.M0(2131753749, null), new vn1(J, (byte) 0), false);
                        K.j();
                        fu5.e(K, getStoriesController().A(j, true), hashSet, true, new jr9(this, storyItem2, J, (byte) 14), new ku0(this, hashSet, storyItem2, J, (byte) 21));
                        J.b(2131231769, ob6.M0(2131744462, null), new c10(J, K, (byte) 10), false);
                        J.j();
                        J.b(2131232362, ob6.M0(2131744446, null), new efa(this, r47Var, view, i, (byte) 1), false);
                        if (t0) {
                            int s1 = s1(getClosestTab());
                            String v = getStoriesController().v(s1, j);
                            J.b(2131232797, ob6.M0(2131744447, null), new kfa(this, s1, (byte) 4), false);
                            storyItem = storyItem2;
                            J.b(2131232334, ob6.M0(2131744448, null), new efa(this, s1, storyItem, v, (byte) 2), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (ohaVar = this.f0) != null && (v5bVar = ohaVar.s) != null) {
                                if (v5bVar.m(storyItem.id)) {
                                    J.b(2131231004, ob6.M0(2131744444, null), new Runnable(this) {
                                        public final eja b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b = r3;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            eja ejaVar = this.b;
                                            switch (b) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ejaVar.I1, ejaVar.getContext());
                                                    String M0 = ob6.M0(2131751452, null);
                                                    id idVar = alertDialog$Builder.a;
                                                    idVar.S = M0;
                                                    idVar.U = ob6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.j(ob6.M0(2131751563, null), new vfa(ejaVar, storyItem3));
                                                    alertDialog$Builder.g(ob6.M0(2131752570, null), new vr9((byte) 19));
                                                    idVar.show();
                                                    idVar.h();
                                                    return;
                                                case 1:
                                                    ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                    return;
                                                case 2:
                                                    ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                    return;
                                                default:
                                                    ejaVar.C0(storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                } else {
                                    J.b(2131231000, ob6.M0(2131744449, null), new Runnable(this) {
                                        public final eja b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b = r3;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            eja ejaVar = this.b;
                                            switch (b) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ejaVar.I1, ejaVar.getContext());
                                                    String M0 = ob6.M0(2131751452, null);
                                                    id idVar = alertDialog$Builder.a;
                                                    idVar.S = M0;
                                                    idVar.U = ob6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.j(ob6.M0(2131751563, null), new vfa(ejaVar, storyItem3));
                                                    alertDialog$Builder.g(ob6.M0(2131752570, null), new vr9((byte) 19));
                                                    idVar.show();
                                                    idVar.h();
                                                    return;
                                                case 1:
                                                    ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                    return;
                                                case 2:
                                                    ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                    return;
                                                default:
                                                    ejaVar.C0(storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            J.b(2131232056, ob6.M0(2131744454, null), new Runnable(this) {
                                public final eja b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void run() {
                                    byte b = r3;
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    eja ejaVar = this.b;
                                    switch (b) {
                                        case 0:
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ejaVar.I1, ejaVar.getContext());
                                            String M0 = ob6.M0(2131751452, null);
                                            id idVar = alertDialog$Builder.a;
                                            idVar.S = M0;
                                            idVar.U = ob6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                            alertDialog$Builder.j(ob6.M0(2131751563, null), new vfa(ejaVar, storyItem3));
                                            alertDialog$Builder.g(ob6.M0(2131752570, null), new vr9((byte) 19));
                                            idVar.show();
                                            idVar.h();
                                            return;
                                        case 1:
                                            ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                            return;
                                        case 2:
                                            ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                            return;
                                        default:
                                            ejaVar.C0(storyItem3);
                                            return;
                                    }
                                }
                            }, false);
                        }
                        J.b(2131232113, ob6.M0(2131751563, null), new Runnable(this) {
                            public final eja b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b = r3;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                eja ejaVar = this.b;
                                switch (b) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ejaVar.I1, ejaVar.getContext());
                                        String M0 = ob6.M0(2131751452, null);
                                        id idVar = alertDialog$Builder.a;
                                        idVar.S = M0;
                                        idVar.U = ob6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.j(ob6.M0(2131751563, null), new vfa(ejaVar, storyItem3));
                                        alertDialog$Builder.g(ob6.M0(2131752570, null), new vr9((byte) 19));
                                        idVar.show();
                                        idVar.h();
                                        return;
                                    case 1:
                                        ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                        return;
                                    case 2:
                                        ejaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                        return;
                                    default:
                                        ejaVar.C0(storyItem3);
                                        return;
                                }
                            }
                        }, true);
                        J.i = (byte) 3;
                        J.u = true;
                        J.v = true;
                        J.L = true;
                        J.M = (byte) 3;
                        Point point = hl.q;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point.x, point.y) * 0.4333f) * 3.0f) / 4.0f));
                        J.N = min;
                        J.O = (min << 2) / 3;
                        J.t = true;
                        J.V = true;
                        J.c0 = true;
                        J.a0();
                        return true;
                    }
                } else {
                    if (r47.B0(r47Var.k) == j) {
                        c = 0;
                    } else {
                        c = 1;
                    }
                    SparseArray[] sparseArrayArr = this.c1;
                    sparseArrayArr[c].put(r47Var.e1(), r47Var);
                    if (!r47Var.s(null, false)) {
                        this.d1++;
                    }
                    if (this.d1 == 0) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    this.o0.setVisibility(i2);
                    s7 s7Var = this.x0;
                    if (s7Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        s7Var.setVisibility(i4);
                    }
                    s7 s7Var2 = this.w0;
                    if (s7Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        s7Var2.setVisibility(i3);
                    }
                    j1(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.Q0;
                        if (i5 >= arrayList3.size()) {
                            break;
                        }
                        View view2 = (View) arrayList3.get(i5);
                        hl.y(view2);
                        arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                        i5++;
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.e1 = false;
                    if (view instanceof zea) {
                        ((zea) view).b(true, true);
                    } else if (view instanceof kja) {
                        ((kja) view).b(i, true, true);
                    } else if (view instanceof cfa) {
                        ((cfa) view).f(true, true);
                    } else if (view instanceof vea) {
                        ((vea) view).e(true, true);
                    } else if (view instanceof vw2) {
                        ((vw2) view).c(true, true);
                    } else if (view instanceof jja) {
                        ((jja) view).i(true, true);
                    }
                    if (!this.F1) {
                        l1(true);
                    }
                    J0(sparseArrayArr[0]);
                    E1();
                    return true;
                }
            }
        }
        return false;
    }

    public void N1(boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eja.N1(boolean):void");
    }

    public final String O(boolean z) {
        int i;
        int i2;
        TLRPC.MessageMedia messageMedia;
        bga bgaVar;
        if (!l0()) {
            return ob6.M0(2131752998, null);
        }
        if (z && (bgaVar = this.a0) != null) {
            return bgaVar.getBotPreviewsSubtitle();
        }
        oha ohaVar = this.f0;
        if (ohaVar != null && ohaVar.s != null) {
            i = 0;
            i2 = 0;
            for (int i3 = 0; i3 < ohaVar.s.i.size(); i3++) {
                r47 r47Var = (r47) ohaVar.s.i.get(i3);
                TL_stories.StoryItem storyItem = r47Var.l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (r47.J4(messageMedia.document)) {
                        i2++;
                    } else if (r47Var.l.media.photo != null) {
                        i++;
                    }
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return ob6.M0(2131752998, null);
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append(ob6.G(i, "Images", new Object[0]));
        }
        if (i2 > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(ob6.G(i2, "Videos", new Object[0]));
        }
        return sb.toString();
    }

    public boolean O0(TLRPC.ChatParticipant chatParticipant, boolean z, View view) {
        return false;
    }

    public final Boolean O1(View view, View view2) {
        if (!this.r1) {
            zha[] zhaVarArr = this.n0;
            boolean z = false;
            zha zhaVar = zhaVarArr[0];
            if (zhaVar != null) {
                int i = zhaVar.F;
                this.s1 = i;
                boolean j0 = j0(i);
                int[] iArr = this.p1;
                int R = R(j0 ? 1 : 0, iArr[j0 ? 1 : 0], true);
                if (view != null && R == R(j0 ? 1 : 0, R, true)) {
                    view.setEnabled(false);
                    view.animate().alpha(0.5f).start();
                }
                if (iArr[j0 ? 1 : 0] != R) {
                    if (view2 != null && !view2.isEnabled()) {
                        view2.setEnabled(true);
                        view2.animate().alpha(1.0f).start();
                    }
                    if (!j0) {
                        xea.A(R);
                    } else if (W(zhaVarArr[0].F) >= 5 || t0(zhaVarArr[0].F)) {
                        xea.E(R);
                    }
                    l(R);
                }
                if (R != R(j0 ? 1 : 0, R, true)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            return null;
        }
        return null;
    }

    public final zha P(int i) {
        int i2 = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i2 < zhaVarArr.length) {
                zha zhaVar = zhaVarArr[i2];
                if (zhaVar != null && zhaVar.F == i) {
                    return zhaVar;
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    public final void P0(float f) {
        zha zhaVar;
        int i;
        int i2;
        zha zhaVar2;
        int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        zha[] zhaVarArr = this.n0;
        if (i3 != 0 || zhaVarArr[1].getVisibility() == 0) {
            if (this.k1) {
                zhaVarArr[0].setTranslationX((-f) * zhaVar2.getMeasuredWidth());
                zhaVarArr[1].setTranslationX(zhaVarArr[0].getMeasuredWidth() - (zhaVarArr[0].getMeasuredWidth() * f));
            } else {
                zhaVarArr[0].setTranslationX(zhaVar.getMeasuredWidth() * f);
                zhaVarArr[1].setTranslationX((zhaVarArr[0].getMeasuredWidth() * f) - zhaVarArr[0].getMeasuredWidth());
            }
            T0(getTabProgress());
            float U = U(f);
            this.s0 = U;
            int i4 = 4;
            if (U != 0.0f && q() && !k0()) {
                i = 0;
            } else {
                i = 4;
            }
            this.u0.setVisibility(i);
            s7 s7Var = this.q0;
            if (s7Var != null && !q()) {
                if (s0()) {
                    i2 = 8;
                } else {
                    i2 = 4;
                }
                setSearchItemVisibility(i2);
                this.r0 = 0.0f;
            } else {
                this.r0 = V(f);
                L1();
            }
            G1(false);
            if (i3 == 0) {
                zha zhaVar3 = zhaVarArr[0];
                zhaVarArr[0] = zhaVarArr[1];
                zhaVarArr[1] = zhaVar3;
                zhaVar3.setVisibility(8);
                if (s7Var != null && this.A0 == 2) {
                    if (s0()) {
                        i4 = 8;
                    }
                    setSearchItemVisibility(i4);
                }
                this.A0 = (byte) 0;
                q1();
            }
        }
    }

    public final Boolean P1(View view, View view2) {
        if (!this.r1) {
            zha[] zhaVarArr = this.n0;
            boolean z = false;
            zha zhaVar = zhaVarArr[0];
            if (zhaVar != null) {
                if (!this.n1 || !j0(zhaVar.F)) {
                    int i = zhaVarArr[0].F;
                    this.s1 = i;
                    boolean j0 = j0(i);
                    int[] iArr = this.p1;
                    int R = R(j0 ? 1 : 0, iArr[j0 ? 1 : 0], false);
                    if (view2 != null && R == R(j0 ? 1 : 0, R, false)) {
                        view2.setEnabled(false);
                        view2.animate().alpha(0.5f).start();
                    }
                    if (iArr[j0 ? 1 : 0] != R) {
                        if (view != null && !view.isEnabled()) {
                            view.setEnabled(true);
                            view.animate().alpha(1.0f).start();
                        }
                        if (!j0) {
                            xea.A(R);
                        } else if (W(zhaVarArr[0].F) >= 5 || t0(zhaVarArr[0].F)) {
                            xea.E(R);
                        }
                        l(R);
                    }
                    if (R != R(j0 ? 1 : 0, R, false)) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final int R(int i, int i2, boolean z) {
        int i3;
        int i4 = 1;
        if (!z) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i5 = i2 + i3;
        if (i5 > 6) {
            if (!z) {
                i5 = 9;
            } else {
                i5 = 6;
            }
        }
        return Utilities.j(i5, 9, (this.n1 && i == 1) ? 2 : 2);
    }

    public final int S(boolean z) {
        int i;
        int i2 = this.b2 + this.f2;
        if (z) {
            i = hl.L(52.0f);
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public void S0() {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!s0() && !k0()) {
            z = false;
        } else {
            z = true;
        }
        zia ziaVar = this.h0.x;
        if (ziaVar != null) {
            if (z && getClosestTab() == 9) {
                z4 = true;
            } else {
                z4 = false;
            }
            ziaVar.b(z4);
        }
        zia ziaVar2 = this.f0.x;
        if (ziaVar2 != null) {
            if (z && getClosestTab() == 8) {
                z3 = true;
            } else {
                z3 = false;
            }
            ziaVar2.b(z3);
        }
        for (dja djaVar : this.m2.values()) {
            cja cjaVar = djaVar.c;
            if (cjaVar.s != null) {
                zia ziaVar3 = cjaVar.x;
                if (z && getClosestTab() == djaVar.a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ziaVar3.b(z2);
            }
        }
        s7 s7Var = this.q0;
        if (s7Var != null) {
            yga ygaVar = this.M0;
            if (ygaVar != null && ygaVar.a() && getSelectedTab() == 11) {
                i = 2131745596;
            } else {
                i = 2131745564;
            }
            s7Var.setSearchFieldHint(ob6.M0(i, null));
        }
        C();
        B(true, true);
    }

    public final int T(int i) {
        int i2;
        int i3 = this.d2 + this.e2;
        int X = X(i) + hl.L(54.0f) + i3 + this.p2;
        if (i == 9) {
            i2 = hl.L(64.0f);
        } else {
            i2 = 0;
        }
        return X + i2;
    }

    public void T0(float f) {
        K0();
    }

    public final float U(float f) {
        float f2 = 0.0f;
        if (k0()) {
            return 0.0f;
        }
        zha[] zhaVarArr = this.n0;
        zha zhaVar = zhaVarArr[1];
        if (zhaVar != null && f0(zhaVar.F)) {
            f2 = 0.0f + f;
        }
        zha zhaVar2 = zhaVarArr[0];
        if (zhaVar2 != null && f0(zhaVar2.F)) {
            return (1.0f - f) + f2;
        }
        return f2;
    }

    public final void U0(int i, long j, e eVar) {
        new k2a(eVar, j, this.p1[1], new mt7(this, j, i, (byte) 1)).show();
    }

    public final float V(float f) {
        float f2 = 0.0f;
        if (k0()) {
            return 0.0f;
        }
        zha[] zhaVarArr = this.n0;
        zha zhaVar = zhaVarArr[1];
        if (zhaVar != null && p0(zhaVar.F) && zhaVarArr[1].F != 11) {
            f2 = 0.0f + f;
        }
        zha zhaVar2 = zhaVarArr[0];
        if (zhaVar2 != null && p0(zhaVar2.F) && zhaVarArr[0].F != 11) {
            return (1.0f - f) + f2;
        }
        return f2;
    }

    public final void V0(int i, long j, e eVar) {
        jj.s0(eVar, ob6.M0(2131751563, null), hl.S2(ob6.a0(null, null, 2131744452, getStoriesController().v(i, j))), ob6.M0(2131751563, null), true, new lb2(this, j, i, (byte) 5));
    }

    public final int W(int i) {
        bja v1;
        v5b v5bVar;
        if (j0(i) && (v1 = v1(i)) != null && (v5bVar = v1.s) != null) {
            return v5bVar.g();
        }
        return 0;
    }

    public final void W0(int i, long j, e eVar) {
        String v = getStoriesController().v(i, j);
        Context context = eVar.getContext();
        vnb resourceProvider = eVar.getResourceProvider();
        lf lfVar = new lf(this, j, i, (byte) 6);
        Pattern pattern = jj.a;
        jj.O(context, eVar, ob6.M0(2131744439, null), ob6.M0(2131744438, null), ob6.M0(2131744437, null), v, 12, ob6.M0(2131746005, null), resourceProvider, lfVar);
    }

    public final int X(int i) {
        float f;
        fga fgaVar = this.c0;
        if (fgaVar != null && (t0(i) || i == 8)) {
            f = fgaVar.getVisibilityFactor() * hl.L(40.0f);
        } else {
            f = 0.0f;
        }
        return (int) f;
    }

    public final void X0(int i, boolean z) {
        zha[] zhaVarArr = this.n0;
        if (zhaVarArr[0].F == i) {
            return;
        }
        zha zhaVar = zhaVarArr[1];
        zhaVar.F = i;
        zhaVar.setVisibility(0);
        g0();
        z1(true);
        this.k1 = z;
        S0();
        j(!p0(i));
        G1(true);
    }

    public final void Y0(String str) {
        boolean D3 = hl.D3(str);
        e eVar = this.y1;
        if (D3) {
            jj.n0(eVar, str, true, true);
        } else {
            m01.u(eVar.getParentActivity(), str);
        }
    }

    public int Z0() {
        return -1;
    }

    public final float a0(int i, boolean z) {
        float width = getWidth();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i2 >= zhaVarArr.length) {
                break;
            }
            zha zhaVar = zhaVarArr[i2];
            if (zhaVar != null) {
                int i4 = zhaVar.F;
                if ((z && i == 8 && t0(i4)) || i4 == i) {
                    i3++;
                    width = zhaVarArr[i2].getTranslationX();
                }
            }
            i2++;
        }
        if (i3 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void a1(ArrayList arrayList, boolean z) {
        boolean z2;
        boolean z3;
        oha ohaVar = this.f0;
        if (ohaVar != null && ohaVar.s != null) {
            e eVar = this.y1;
            if (z && arrayList.size() > eVar.getMessagesController().l4.x2.f()) {
                c00.v(ob6.G(eVar.getMessagesController().l4.x2.f(), "StoriesPinLimit", new Object[0]), d31.b0(eVar), 2131623982, 36);
                return;
            }
            v5b v5bVar = ohaVar.s;
            int i = v5bVar.c;
            ArrayList arrayList2 = v5bVar.g;
            ArrayList arrayList3 = new ArrayList(arrayList2);
            boolean z4 = true;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                num.getClass();
                if (z) {
                    if (!arrayList3.contains(num)) {
                        arrayList3.add(0, num);
                    }
                } else if (arrayList3.contains(num)) {
                    arrayList3.remove(num);
                }
            }
            if (arrayList3.size() > uc7.s1(i).l4.x2.f()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (arrayList2.size() != arrayList3.size()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i2) != arrayList3.get(i2)) {
                            z3 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (z3) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList3);
                    v5bVar.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = uc7.s1(i).j1(v5bVar.d);
                    ConnectionsManager.getInstance(i).sendRequest(tL_togglePinnedToTop, new xe2((byte) 11));
                }
                z4 = z2;
            }
            if (z4) {
                c00.v(ob6.G(eVar.getMessagesController().l4.x2.f(), "StoriesPinLimit", new Object[0]), d31.b0(eVar), 2131623982, 36);
            } else if (z) {
                d31.b0(eVar).I(2131624055, hl.S2(ob6.G(arrayList.size(), "StoriesPinned", new Object[0])), ob6.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
            } else {
                c00.v(ob6.G(arrayList.size(), "StoriesUnpinned", new Object[0]), d31.b0(eVar), 2131624061, 36);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Ci));
        hashSet.add(Integer.valueOf(aob.d6));
        hashSet.add(Integer.valueOf(aob.Ai));
        hashSet.add(Integer.valueOf(aob.Bi));
        hashSet.add(Integer.valueOf(aob.K6));
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.sj));
        hashSet.add(Integer.valueOf(aob.zi));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.Z8));
        hashSet.add(Integer.valueOf(aob.X8));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.li));
        hashSet.add(Integer.valueOf(aob.e7));
        hashSet.add(Integer.valueOf(aob.f7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.x7));
        hashSet.add(Integer.valueOf(aob.t7));
        hashSet.add(Integer.valueOf(aob.w7));
        hashSet.add(Integer.valueOf(aob.be));
        hashSet.add(Integer.valueOf(aob.nd));
    }

    public final float b0(int i, boolean z) {
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i2 < zhaVarArr.length) {
                zha zhaVar = zhaVarArr[i2];
                if (zhaVar != null) {
                    int i3 = zhaVar.F;
                    if ((z && i == 8 && t0(i3)) || i3 == i) {
                        f = (1.0f - Math.abs(zhaVarArr[i2].getTranslationX() / getWidth())) + f;
                    }
                }
                i2++;
            } else {
                return f;
            }
        }
    }

    public final boolean b1(MotionEvent motionEvent, boolean z) {
        int i;
        zha zhaVar;
        bga bgaVar;
        int i2;
        int i3;
        int closestTab = getClosestTab();
        bha bhaVar = this.L0;
        SparseIntArray sparseIntArray = bhaVar.P;
        int i4 = bhaVar.n;
        int i5 = -1;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        int i6 = sparseIntArray.get(i4 + i, -1);
        fga fgaVar = this.c0;
        if (fgaVar != null) {
            if (!t0(closestTab) && closestTab != 8) {
                if (t0(i6) || i6 == 8) {
                    i5 = fgaVar.getCurrentAlbumId();
                }
            } else {
                uic uicVar = fgaVar.b;
                SparseIntArray sparseIntArray2 = uicVar.c0;
                int i7 = uicVar.G;
                if (z) {
                    i3 = 1;
                } else {
                    i3 = -1;
                }
                i5 = sparseIntArray2.get(i7 + i3, -1);
            }
            if (i5 == 0) {
                i6 = 8;
            } else if (i5 > 0) {
                i6 = t1(i5).a;
            }
        }
        if (i6 >= 0) {
            if (this.q0 != null && !q()) {
                if (s0()) {
                    i2 = 8;
                } else {
                    i2 = 4;
                }
                setSearchItemVisibility(i2);
                this.r0 = 0.0f;
            } else {
                this.r0 = V(0.0f);
                K1(0.0f);
            }
            if ((!this.Y0 || getSelectedTab() != 11) && (!p() || !this.F1 || (getClosestTab() != 8 && !t0(getClosestTab())))) {
                zha[] zhaVarArr = this.n0;
                zha zhaVar2 = zhaVarArr[0];
                if (zhaVar2 != null && zhaVar2.F == 13 && (bgaVar = this.a0) != null) {
                    uq0 uq0Var = bgaVar.n;
                    if (!z) {
                    }
                }
                zha zhaVar3 = zhaVarArr[0];
                cga cgaVar = this.b0;
                if (zhaVar3 != null && zhaVar3.F == 14 && cgaVar != null) {
                    uq0 uq0Var2 = cgaVar.h;
                    if (!z) {
                    }
                }
                if ((!this.F1 || (zhaVar = zhaVarArr[0]) == null || zhaVar.F != 13) && ((cgaVar == null || !cgaVar.g()) && (fgaVar == null || !fgaVar.f))) {
                    G1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    g0();
                    this.B1 = false;
                    this.A1 = true;
                    this.C1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    bhaVar.setEnabled(false);
                    zha zhaVar4 = zhaVarArr[1];
                    zhaVar4.F = i6;
                    zhaVar4.setVisibility(0);
                    this.k1 = z;
                    z1(true);
                    if (z) {
                        zhaVarArr[1].setTranslationX(zhaVarArr[0].getMeasuredWidth());
                    } else {
                        zhaVarArr[1].setTranslationX(-zhaVarArr[0].getMeasuredWidth());
                    }
                    T0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final int c0(int i) {
        vnb vnbVar = this.I1;
        if (vnbVar != null) {
            return vnbVar.h(i);
        }
        return aob.w0(null, i, false);
    }

    public final boolean d0() {
        if (this.y1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final void d1(j79 j79Var) {
        if (j79Var instanceof yia) {
            ArrayList arrayList = this.H0;
            ArrayList arrayList2 = this.I0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        } else if (j79Var == this.P) {
            ArrayList arrayList3 = this.J0;
            ArrayList arrayList4 = this.K0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
        } else {
            nia niaVar = this.Q;
            if (j79Var == niaVar) {
                niaVar.r = null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eja.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        bha bhaVar = this.L0;
        if (bhaVar != null) {
            canvas.save();
            canvas.translate(bhaVar.getX(), bhaVar.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        xga xgaVar = this.U0;
        if (xgaVar != null) {
            int i = xgaVar.U;
            if ((i == 3 || i == 1) && this.S0 == null) {
                canvas.save();
                canvas.translate(xgaVar.getX(), xgaVar.getY());
                xgaVar.setDrawOverlay(true);
                xgaVar.draw(canvas);
                xgaVar.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        if (this.c2 && (view instanceof zha) && this.g2 < this.e2) {
            canvas.save();
            canvas.clipRect(0, -this.g2, getWidth(), getHeight() + this.f2);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        } else if (view == this.U0 && this.S0 == null) {
            canvas.save();
            zha[] zhaVarArr = this.n0;
            float top = zhaVarArr[0].getTop();
            fga fgaVar = this.c0;
            if (fgaVar != null && ((i = zhaVarArr[0].F) == 8 || t0(i))) {
                top -= fgaVar.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + hl.L(12.0f));
            boolean drawChild2 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild2;
        } else {
            return super.drawChild(canvas, view, j);
        }
    }

    public final void e(View view) {
        zha[] zhaVarArr = this.n0;
        addView(view, Math.max(indexOfChild(zhaVarArr[0]), indexOfChild(zhaVarArr[1])) + 1, tre.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final boolean e0() {
        SparseArray[] sparseArrayArr;
        r47 r47Var;
        TLRPC.Message message;
        boolean z = false;
        for (int i = 1; i >= 0; i--) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                sparseArrayArr = this.c1;
                if (i2 >= sparseArrayArr[i].size()) {
                    break;
                }
                arrayList.add(Integer.valueOf(sparseArrayArr[i].keyAt(i2)));
                i2++;
            }
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                Object obj = arrayList.get(i3);
                i3++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0 && (r47Var = (r47) sparseArrayArr[i].get(num.intValue())) != null && (message = r47Var.k) != null && message.noforwards) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return z;
            }
        }
        return z;
    }

    public final void e1() {
        int i;
        int i2 = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i2 < zhaVarArr.length) {
                jga jgaVar = zhaVarArr[i2].h;
                if (jgaVar != null) {
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < jgaVar.getChildCount(); i5++) {
                        View childAt = jgaVar.getChildAt(i5);
                        if (childAt instanceof jja) {
                            jja jjaVar = (jja) childAt;
                            int messageId = jjaVar.getMessageId();
                            i4 = jjaVar.getTop();
                            i3 = messageId;
                        }
                        if (childAt instanceof zea) {
                            zea zeaVar = (zea) childAt;
                            int e1 = zeaVar.getMessage().e1();
                            i4 = zeaVar.getTop();
                            i3 = e1;
                        }
                        if (childAt instanceof vea) {
                            vea veaVar = (vea) childAt;
                            i3 = veaVar.getMessage().e1();
                            i4 = veaVar.getTop();
                        }
                        if (i3 != 0) {
                            break;
                        }
                    }
                    if (i3 != 0) {
                        int i6 = zhaVarArr[i2].F;
                        int i7 = -1;
                        if (j0(i6)) {
                            bja v1 = v1(i6);
                            if (v1 != null && v1.s != null) {
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= v1.s.i.size()) {
                                        break;
                                    } else if (i3 == ((r47) v1.s.i.get(i8)).e1()) {
                                        i7 = i8;
                                        break;
                                    } else {
                                        i8++;
                                    }
                                }
                            }
                            i = i7;
                        } else if (i6 >= 0) {
                            tia[] tiaVarArr = this.w1;
                            if (i6 < tiaVarArr.length) {
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= tiaVarArr[i6].a.size()) {
                                        break;
                                    } else if (i3 == ((r47) tiaVarArr[i6].a.get(i9)).e1()) {
                                        i7 = i9;
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                                i = tiaVarArr[i6].m + i7;
                            }
                        }
                        if (i7 >= 0) {
                            ((x46) jgaVar.getLayoutManager()).g1(i, (-zhaVarArr[i2].h.getPaddingTop()) + i4);
                            if (this.r1) {
                                zha zhaVar = zhaVarArr[i2];
                                zhaVar.r.g1(i, (-zhaVar.h.getPaddingTop()) + i4);
                            }
                        }
                    }
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final SpannableStringBuilder f() {
        if (this.a2 == null) {
            this.a2 = new SpannableStringBuilder();
            boolean l0 = l0();
            SpannableStringBuilder spannableStringBuilder = this.a2;
            if (l0) {
                spannableStringBuilder.append((CharSequence) ob6.M0(2131746429, null));
            } else {
                spannableStringBuilder.append((CharSequence) "c");
                this.a2.setSpan(new wm2(2131231148, 0), 0, 1, 33);
                this.a2.append((CharSequence) "  ").append((CharSequence) ob6.M0(2131744466, null));
            }
        }
        return this.a2;
    }

    public final boolean f0(int i) {
        if (i != 0) {
            if (((i != 8 && !t0(i)) || !TextUtils.isEmpty(getStoriesHashtag())) && i != 9 && i != 11 && i != 13) {
                if (i != 14 || this.b0 == null) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void f1(int i) {
        bha bhaVar;
        if (!this.P1 && (bhaVar = this.L0) != null) {
            bhaVar.g(null, i, bhaVar.Q.get(i));
        }
    }

    public final void g(dia diaVar, e eVar, long j, int i) {
        String K;
        if (j > 0) {
            K = lbc.p(uc7.s1(eVar.getCurrentAccount()).X1(Long.valueOf(j)));
        } else {
            K = xc2.K(uc7.s1(eVar.getCurrentAccount()).M0(Long.valueOf(-j)), false);
        }
        if (K == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("https://");
        qu6.u(sb, uc7.s1(eVar.getCurrentAccount()).N2, "/", K, "/a/");
        sb.append(i);
        String sb2 = sb.toString();
        diaVar.Z(2131231761, new jr9(this, sb2, eVar, (byte) 13), ob6.M0(2131744445, null), false, true);
    }

    public final void g0() {
        hl.r(this.P0);
        dl1 dl1Var = this.N0;
        if (dl1Var.getTag() == null) {
            return;
        }
        dl1Var.setTag(null);
        AnimatorSet animatorSet = this.O0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.O0.playTogether(ObjectAnimator.ofFloat(dl1Var, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(dl1Var, View.TRANSLATION_Y, (-hl.L(48.0f)) + this.R0));
        this.O0.setInterpolator(k43.g);
        this.O0.addListener(new eha(this, (byte) 0));
        this.O0.start();
    }

    public final void g1(float f, int i) {
        int i2;
        bha bhaVar = this.L0;
        if (bhaVar != null) {
            if (t0(i)) {
                i2 = 8;
            } else {
                i2 = i;
            }
            bhaVar.i(f, i2);
        }
        fga fgaVar = this.c0;
        if (fgaVar != null) {
            uic uicVar = fgaVar.b;
            if (t0(i)) {
                uicVar.g(f, s1(i));
            } else if (i == 8) {
                uicVar.g(f, 0);
            }
        }
    }

    public SparseArray<r47> getActionModeSelected() {
        return this.c1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        zha zhaVar;
        zha zhaVar2;
        boolean z;
        boolean z2;
        v5b v5bVar;
        v5b v5bVar2;
        float f = 1.0f;
        zha[] zhaVarArr = this.n0;
        if (zhaVarArr != null && (zhaVar = zhaVarArr[0]) != null && (zhaVar2 = zhaVarArr[1]) != null && zhaVar.w != null && zhaVar2.w != null) {
            int i = zhaVar.F;
            int i2 = zhaVar2.F;
            if (!t0(i) && i != 8) {
                z = false;
            } else {
                z = true;
            }
            if (!t0(i2) && i2 != 8) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || z2) {
                float visibilityFactor = 1.0f - zhaVarArr[0].w.getVisibilityFactor();
                float visibilityFactor2 = 1.0f - zhaVarArr[1].w.getVisibilityFactor();
                bja v1 = v1(zhaVarArr[0].F);
                if (i == 8 || (v1 != null && (v5bVar2 = v1.s) != null && v5bVar2.g() > 0)) {
                    visibilityFactor = 1.0f;
                }
                bja v12 = v1(i2);
                if (i2 != 8 && (v12 == null || (v5bVar = v12.s) == null || v5bVar.g() <= 0)) {
                    f = visibilityFactor2;
                }
                if (!z) {
                    visibilityFactor = f;
                }
                if (!z2) {
                    f = visibilityFactor;
                }
                return hl.R1(visibilityFactor, f, Math.abs(zhaVarArr[0].getTranslationX() / zhaVarArr[0].getMeasuredWidth()));
            }
        }
        return 1.0f;
    }

    public int getClosestTab() {
        zha[] zhaVarArr = this.n0;
        zha zhaVar = zhaVarArr[1];
        if (zhaVar != null && zhaVar.getVisibility() == 0) {
            if (this.j1 && !this.l1) {
                return zhaVarArr[1].F;
            }
            if (Math.abs(zhaVarArr[1].getTranslationX()) < zhaVarArr[1].getMeasuredWidth() / 2.0f) {
                return zhaVarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public d79 getCurrentListView() {
        mha mhaVar;
        zha zhaVar = this.n0[0];
        int i = zhaVar.F;
        if (i == 13) {
            return this.a0.getCurrentListView();
        }
        if (i == 14) {
            return this.b0.getCurrentListView();
        }
        if (i == 12 && (mhaVar = this.W) != null) {
            return mhaVar.a.A0;
        }
        return zhaVar.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.w1[0].q;
    }

    public TextView getSaveItem() {
        return this.t0;
    }

    public s7 getSearchItem() {
        return this.q0;
    }

    public e29 getSearchOptionsItem() {
        return this.v0;
    }

    public int getSelectedTab() {
        int currentTabId = this.L0.getCurrentTabId();
        fga fgaVar = this.c0;
        if (fgaVar != null && currentTabId == 8) {
            int currentAlbumId = fgaVar.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return t1(currentAlbumId).a;
            }
        }
        return currentTabId;
    }

    public TL_stories.MediaArea getStoriesArea() {
        return null;
    }

    public String getStoriesHashtag() {
        return null;
    }

    public String getStoriesHashtagUsername() {
        return null;
    }

    @Deprecated
    public float getTabProgress() {
        float f = 0.0f;
        int i = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i < zhaVarArr.length) {
                zha zhaVar = zhaVarArr[i];
                if (zhaVar != null) {
                    f = ((1.0f - Math.abs(zhaVar.getTranslationX() / getWidth())) * zhaVar.F) + f;
                }
                i++;
            } else {
                return f;
            }
        }
    }

    public ArrayList<apb> getThemeDescriptions() {
        ArrayList<apb> arrayList = new ArrayList<>();
        arrayList.add(new apb(this.D0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.z6));
        int i = aob.z8;
        arrayList.add(new apb(this.o0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        s7 s7Var = this.x0;
        if (s7Var != null) {
            arrayList.add(new apb(s7Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        }
        s7 s7Var2 = this.w0;
        if (s7Var2 != null) {
            arrayList.add(new apb(s7Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        }
        Drawable[] drawableArr = {this.G0};
        int i2 = aob.y8;
        ImageView imageView = this.F0;
        arrayList.add(new apb(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (zob) null, i2));
        arrayList.add(new apb(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.E0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.L0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (zob) null, aob.xi));
        bha bhaVar = this.L0;
        arrayList.add(new apb(bhaVar.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.wi));
        arrayList.add(new apb(bhaVar.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.vi));
        arrayList.add(new apb(bhaVar.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.yi));
        xga xgaVar = this.U0;
        if (xgaVar != null) {
            arrayList.add(new apb(xgaVar, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (zob) null, aob.v7));
            arrayList.add(new apb(xgaVar, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (zob) null, aob.u7));
            arrayList.add(new apb(xgaVar, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (zob) null, aob.y7));
            arrayList.add(new apb(xgaVar, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (zob) null, aob.A7));
        }
        final int i3 = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i3 < zhaVarArr.length) {
                zob zobVar = new zob() {
                    @Override
                    public final void b() {
                        zha[] zhaVarArr2 = eja.this.n0;
                        int i4 = i3;
                        jga jgaVar = zhaVarArr2[i4].h;
                        if (jgaVar != null) {
                            int childCount = jgaVar.getChildCount();
                            for (int i5 = 0; i5 < childCount; i5++) {
                                View childAt = zhaVarArr2[i4].h.getChildAt(i5);
                                if (childAt instanceof kja) {
                                    kja kjaVar = (kja) childAt;
                                    for (int i6 = 0; i6 < 6; i6++) {
                                        kjaVar.a[i6].e.invalidate();
                                    }
                                } else if (childAt instanceof bv8) {
                                    ((bv8) childAt).D(0);
                                } else if (childAt instanceof vac) {
                                    ((vac) childAt).i(0);
                                }
                            }
                        }
                    }

                    @Override
                    public final void a(float f) {
                    }
                };
                arrayList.add(new apb(zhaVarArr[i3].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.s8));
                arrayList.add(new apb(zhaVarArr[i3].h, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.i6));
                arrayList.add(new apb(zhaVarArr[i3].w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.c7));
                int i4 = aob.h6;
                arrayList.add(new apb(zhaVarArr[i3].h, 0, new Class[]{ua6.class}, new String[]{"progressBar"}, (Drawable[]) null, (zob) null, i4));
                arrayList.add(new apb(zhaVarArr[i3].h, 0, new Class[]{vac.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, zobVar, aob.n6));
                arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.O7));
                arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.P7));
                arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.Q7));
                arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.R7));
                arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.S7));
                arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.T7));
                arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, aob.U7));
                int i5 = aob.i7;
                arrayList.add(new apb(zhaVarArr[i3].h, 8192, new Class[]{zea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i5));
                int i6 = aob.k7;
                arrayList.add(new apb(zhaVarArr[i3].h, 16384, new Class[]{zea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i6));
                arrayList.add(new apb(zhaVarArr[i3].h, 8, new Class[]{zea.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (zob) null, aob.qj));
                arrayList.add(new apb(zhaVarArr[i3].h, 0, new Class[]{ua6.class}, new String[]{"progressBar"}, (Drawable[]) null, (zob) null, i4));
                arrayList.add(new apb(zhaVarArr[i3].h, 8192, new Class[]{vea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i5));
                arrayList.add(new apb(zhaVarArr[i3].h, 16384, new Class[]{vea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i6));
                arrayList.add(new apb(zhaVarArr[i3].h, 8192, new Class[]{cfa.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i5));
                arrayList.add(new apb(zhaVarArr[i3].h, 16384, new Class[]{cfa.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i6));
                arrayList.add(new apb(zhaVarArr[i3].h, 8192, new Class[]{kja.class}, (Paint) null, (Drawable[]) null, zobVar, i5));
                arrayList.add(new apb(zhaVarArr[i3].h, 16384, new Class[]{kja.class}, (Paint) null, (Drawable[]) null, zobVar, i6));
                arrayList.add(new apb(zhaVarArr[i3].h, 0, new Class[]{vw2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (zob) null, aob.Ci));
                arrayList.add(new apb(zhaVarArr[i3].h, 8192, new Class[]{vw2.class}, (Paint) null, (Drawable[]) null, zobVar, i5));
                arrayList.add(new apb(zhaVarArr[i3].h, 16384, new Class[]{vw2.class}, (Paint) null, (Drawable[]) null, zobVar, i6));
                arrayList.add(new apb(zhaVarArr[i3].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.B0}, (zob) null, aob.b7));
                arrayList.add(new apb(zhaVarArr[i3].w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G6));
                arrayList.add(new apb(zhaVarArr[i3].w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.y6));
                i3++;
            } else {
                return arrayList;
            }
        }
    }

    public int getTopPanelShift() {
        return this.p2;
    }

    public final void h(dia diaVar) {
        float f;
        final View[] viewArr = {diaVar.Z(2131232443, new Runnable(this) {
            public final eja b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                View[] viewArr2 = viewArr;
                eja ejaVar = this.b;
                switch (b) {
                    case 0:
                        ejaVar.O1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        ejaVar.P1(viewArr2[0], viewArr2[1]);
                        return;
                }
            }
        }, ob6.M0(2131748404, null), false, false), diaVar.Z(2131232444, new Runnable(this) {
            public final eja b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                View[] viewArr2 = viewArr;
                eja ejaVar = this.b;
                switch (b) {
                    case 0:
                        ejaVar.O1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        ejaVar.P1(viewArr2[0], viewArr2[1]);
                        return;
                }
            }
        }, ob6.M0(2131748403, null), false, false)};
        View view = viewArr[0];
        float f2 = 0.5f;
        if (view != null) {
            view.setEnabled(s());
            View view2 = viewArr[0];
            if (s()) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            view2.setAlpha(f);
        }
        View view3 = viewArr[1];
        if (view3 != null) {
            view3.setEnabled(t());
            View view4 = viewArr[1];
            if (t()) {
                f2 = 1.0f;
            }
            view4.setAlpha(f2);
        }
    }

    public boolean h0() {
        return false;
    }

    public final void h1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i < zhaVarArr.length) {
                zha zhaVar = zhaVarArr[i];
                if (zhaVar.F != 7 || zhaVar.h.getAdapter() == null || zhaVarArr[i].h.getAdapter().b() == 0 || this.y1.getMessagesController().O1().j.size() <= 0) {
                    i++;
                } else {
                    return;
                }
            } else {
                if (this.G == 0) {
                    rha rhaVar = this.d0;
                    rhaVar.d = chatFull;
                    rhaVar.e = arrayList;
                }
                N1(true);
                for (int i2 = 0; i2 < zhaVarArr.length; i2++) {
                    zha zhaVar2 = zhaVarArr[i2];
                    if (zhaVar2.F == 7 && zhaVar2.h.getAdapter() != null) {
                        hl.p2(zhaVarArr[i2].h);
                    }
                }
                return;
            }
        }
    }

    public final void i(jga jgaVar, int i, SparseBooleanArray sparseBooleanArray) {
        int childCount = jgaVar.getChildCount();
        tk4 tk4Var = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = jgaVar.getChildAt(i2);
            if (childAt instanceof tk4) {
                tk4Var = childAt;
            }
        }
        if (tk4Var != null) {
            jgaVar.removeView(tk4Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new gha(this, jgaVar, sparseBooleanArray, tk4Var, i));
    }

    public boolean i0() {
        return !(this instanceof re5);
    }

    public final void i1(int i, int i2, int i3, int i4) {
        zha[] zhaVarArr;
        boolean z;
        boolean z2;
        this.c2 = true;
        this.d2 = i;
        this.e2 = i2;
        this.f2 = i3;
        this.b2 = i4;
        n();
        cga cgaVar = this.b0;
        if (cgaVar != null) {
            if (cgaVar.M != i2 || cgaVar.N != i3) {
                cgaVar.M = i2;
                cgaVar.N = i3;
                if (i2 == 0 && i3 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                cgaVar.setClipChildren(z);
                uq0 uq0Var = cgaVar.h;
                if (i2 == 0 && i3 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                uq0Var.setClipChildren(z2);
                cgaVar.n();
            }
            F1();
        }
        for (zha zhaVar : this.n0) {
            if (zhaVar != null) {
                zhaVar.setClipChildren(false);
                H1(zhaVar);
                setPageOverscan(zhaVar.h);
                setPageOverscan(zhaVar.n);
                int paddingTop = zhaVar.h.getPaddingTop();
                jga jgaVar = zhaVar.h;
                int paddingLeft = jgaVar.getPaddingLeft();
                jga jgaVar2 = zhaVar.h;
                int T = T(zhaVar.F);
                jgaVar2.h3 = T;
                int paddingRight = zhaVar.h.getPaddingRight();
                jga jgaVar3 = zhaVar.h;
                int S = S(s0());
                jgaVar3.i3 = S;
                jgaVar.setPadding(paddingLeft, T, paddingRight, S);
                int paddingTop2 = paddingTop - zhaVar.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    hl.J(zhaVar.h, new jfa(zhaVar, paddingTop2, (byte) 1));
                }
                zhaVar.w.setPadding(0, i, 0, i4);
                mha mhaVar = this.W;
                if (mhaVar != null && mhaVar.getParent() == zhaVar) {
                    k1(hl.L(56.0f) + i, mhaVar);
                }
                bga bgaVar = this.a0;
                if (bgaVar != null && bgaVar.getParent() == zhaVar) {
                    k1(i, bgaVar);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final void j(boolean z) {
        int i;
        e29 e29Var = this.v0;
        if (e29Var != null && this.Z1 != z) {
            this.Z1 = z;
            if (!z && e29Var.getAnimatedDrawable().b0 < 20) {
                e29Var.getAnimatedDrawable().K(0);
            } else {
                b29 animatedDrawable = e29Var.getAnimatedDrawable();
                if (this.Z1) {
                    i = 50;
                } else {
                    i = 100;
                }
                animatedDrawable.K(i);
            }
            e29Var.getAnimatedDrawable().start();
        }
    }

    public final void j1(int i, boolean z) {
        this.D0.a(i, z);
        jla jlaVar = this.I;
        if (jlaVar != null) {
            jlaVar.H(i, z);
        }
    }

    @Override
    public final void k(of3 of3Var) {
        int i;
        e eVar = this.y1;
        if (eVar != null && eVar.getMessagesController().O1().J(of3Var.getDialogId())) {
            eVar.getOrCreateStoryViewer().getClass();
            lcb orCreateStoryViewer = eVar.getOrCreateStoryViewer();
            Context context = eVar.getContext();
            long dialogId = of3Var.getDialogId();
            l6b a = l6b.a((d79) of3Var.getParent());
            if ((eVar instanceof ProfileActivity) && ((ProfileActivity) eVar).s1) {
                i = hl.L(68.0f);
            } else {
                i = 0;
            }
            a.s += i;
            orCreateStoryViewer.H(context, dialogId, a);
        }
    }

    public boolean k0() {
        return false;
    }

    public final void l(int i) {
        int i2;
        zha P = P(this.s1);
        this.s = -1;
        if (P != null) {
            P.h.E0();
            this.t1 = i;
            P.n.setVisibility(0);
            boolean j0 = j0(this.s1);
            yha yhaVar = P.n;
            if (j0) {
                yhaVar.setAdapter(w1(this.s1));
            } else {
                yhaVar.setAdapter(this.L);
            }
            yha yhaVar2 = P.n;
            int paddingLeft = yhaVar2.getPaddingLeft();
            yha yhaVar3 = P.n;
            int T = T(P.F);
            yhaVar3.h3 = T;
            int paddingRight = P.n.getPaddingRight();
            yha yhaVar4 = P.n;
            int S = S(s0());
            yhaVar4.i3 = S;
            yhaVar2.setPadding(paddingLeft, T, paddingRight, S);
            P.r.x1(i);
            P.n.c0();
            int i3 = 0;
            while (true) {
                zha[] zhaVarArr = this.n0;
                if (i3 >= zhaVarArr.length) {
                    break;
                }
                zha zhaVar = zhaVarArr[i3];
                if (zhaVar != null && ((i2 = zhaVar.F) == 0 || j0(i2))) {
                    hl.V3(zhaVarArr[i3].h);
                }
                i3++;
            }
            this.r1 = true;
            if (this.s1 == 0) {
                this.w1[0].g(true);
            }
            this.q1 = 0.0f;
            e1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M1.d();
            ofFloat.addUpdateListener(new aha(this, P, (byte) 1));
            ofFloat.addListener(new mw0(this, j0(P.F) ? 1 : 0, i, (byte) 3));
            ofFloat.setInterpolator(k43.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final boolean l0() {
        TLRPC.User X1;
        long j = this.m1;
        if (j > 0 && (X1 = uc7.s1(this.y1.getCurrentAccount()).X1(Long.valueOf(j))) != null && X1.bot) {
            return true;
        }
        return false;
    }

    public void l1(boolean z) {
        float f;
        if (this.F1 != z) {
            this.F1 = z;
            jla jlaVar = this.I;
            if (jlaVar != null) {
                if (z) {
                    M1();
                    jlaVar.L();
                } else {
                    jlaVar.y();
                }
                B(true, true);
                return;
            }
            AnimatorSet animatorSet = this.R1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            LinearLayout linearLayout = this.E0;
            if (z) {
                linearLayout.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.R1 = animatorSet2;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, View.ALPHA, f));
            this.R1.setDuration(180L);
            this.R1.addListener(new i1a((byte) 2, this, z));
            this.R1.start();
            if (z) {
                M1();
            }
        }
    }

    @Override
    public final boolean m() {
        return false;
    }

    public final boolean m0() {
        e eVar;
        if (this.g1 != null && (eVar = this.y1) != null) {
            return xc2.V(eVar.getMessagesController().M0(Long.valueOf(this.g1.id)));
        }
        return false;
    }

    public final void n() {
        int i = this.d2;
        int i2 = this.p2;
        k1((hl.L(6.666f) + i) - w2, this.S0);
        int i3 = i + i2;
        k1(i3, this.L0);
        k1(i3, this.E0);
        k1(hl.L(52.0f) + i + i2, this.N0);
        k1(hl.L(4.0f) + i + i2, this.M0);
        k1(hl.L(48.0f) + i + i2, this.c0);
        if (this.l2 != i2) {
            this.l2 = i2;
            Runnable runnable = this.k2;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final boolean n0() {
        int i = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i >= zhaVarArr.length) {
                return false;
            }
            zha zhaVar = zhaVarArr[i];
            if (zhaVar != null) {
                jga jgaVar = zhaVar.h;
                if (jgaVar == null || !jgaVar.e0()) {
                    yha yhaVar = zhaVarArr[i].n;
                    if (yhaVar != null && yhaVar.e0()) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            i++;
        }
    }

    public final void n1(int r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eja.n1(int, boolean):void");
    }

    public final boolean o0() {
        cga cgaVar = this.b0;
        if (cgaVar == null || !cgaVar.g()) {
            fga fgaVar = this.c0;
            if (fgaVar != null && fgaVar.f) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void o1(int i) {
        int s1 = s1(getClosestTab());
        fga fgaVar = this.c0;
        if (s1 != i) {
            if (fgaVar != null) {
                fgaVar.b.e(i, fgaVar.d.i(i));
                return;
            }
            return;
        }
        fgaVar.setReorderingAlbums(true);
        dja t1 = t1(i);
        zha P = P(t1.a);
        if (P == null) {
            return;
        }
        jga jgaVar = P.h;
        for (int i2 = 0; i2 < jgaVar.getChildCount(); i2++) {
            View childAt = jgaVar.getChildAt(i2);
            if (childAt instanceof jja) {
                ((jja) childAt).l(true, true);
            }
        }
        cja cjaVar = t1.c;
        if (cjaVar != null && !cjaVar.y) {
            cjaVar.y = true;
        }
        G1(true);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i < zhaVarArr.length) {
                jga jgaVar = zhaVarArr[i].h;
                if (jgaVar != null) {
                    jgaVar.getViewTreeObserver().addOnPreDrawListener(new hha(this, i, (byte) 0));
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!D() && !this.L0.I && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        eja ejaVar;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        tha thaVar = this.G1;
        if (thaVar.d() != null) {
            i3 = thaVar.d().getHeight();
        } else {
            i3 = 0;
        }
        if (i3 == 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size, i3);
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = this.getChildAt(i6);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (childAt instanceof zha) {
                    ejaVar = this;
                    i4 = i;
                    ejaVar.measureChildWithMargins(childAt, i4, 0, View.MeasureSpec.makeMeasureSpec(i3, 1073741824), 0);
                    jga jgaVar = ((zha) childAt).h;
                    jgaVar.setPadding(0, jgaVar.f3, 0, jgaVar.g3);
                } else {
                    ejaVar = this;
                    i4 = i;
                    i5 = i2;
                    ejaVar.measureChildWithMargins(childAt, i4, 0, i5, 0);
                    i6++;
                    this = ejaVar;
                    i = i4;
                    i2 = i5;
                }
            } else {
                ejaVar = this;
                i4 = i;
            }
            i5 = i2;
            i6++;
            this = ejaVar;
            i = i4;
            i2 = i5;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        int i2;
        boolean z2 = false;
        if (!this.P1) {
            e eVar = this.y1;
            if (eVar.getParentLayout() != null && !((ActionBarLayout) eVar.getParentLayout()).h() && !D() && !this.a) {
                if (motionEvent != null) {
                    VelocityTracker velocityTracker = this.E1;
                    if (velocityTracker == null) {
                        velocityTracker = VelocityTracker.obtain();
                        this.E1 = velocityTracker;
                    }
                    velocityTracker.addMovement(motionEvent);
                    kg5 kg5Var = this.H1;
                    if (kg5Var != null) {
                        kg5Var.f(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.A1 && !this.B1) {
                    if (motionEvent.getY() >= hl.L(90.0f) + this.d2) {
                        this.z1 = motionEvent.getPointerId(0);
                        this.B1 = true;
                        this.C1 = (int) motionEvent.getX();
                        this.D1 = (int) motionEvent.getY();
                        this.E1.clear();
                        return this.A1;
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.z1) {
                    int x = (int) (motionEvent.getX() - this.C1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.D1);
                    boolean z3 = this.A1;
                    zha[] zhaVarArr = this.n0;
                    if (z3 && (!this.k1 ? x < 0 : x > 0)) {
                        if (x < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!b1(motionEvent, z)) {
                            this.B1 = true;
                            this.A1 = false;
                            zhaVarArr[0].setTranslationX(0.0f);
                            zha zhaVar = zhaVarArr[1];
                            if (this.k1) {
                                i2 = zhaVarArr[0].getMeasuredWidth();
                            } else {
                                i2 = -zhaVarArr[0].getMeasuredWidth();
                            }
                            zhaVar.setTranslationX(i2);
                            g1(0.0f, zhaVarArr[1].F);
                            T0(getTabProgress());
                        }
                    }
                    if (this.B1 && !this.A1) {
                        if (Math.abs(x) >= hl.Z0(true, 0.3f) && Math.abs(x) > abs) {
                            if (x < 0) {
                                z2 = true;
                            }
                            b1(motionEvent, z2);
                        }
                    } else if (this.A1) {
                        zhaVarArr[0].setTranslationX(x);
                        if (this.k1) {
                            zhaVarArr[1].setTranslationX(zhaVarArr[0].getMeasuredWidth() + x);
                        } else {
                            zhaVarArr[1].setTranslationX(x - zhaVarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x) / zhaVarArr[0].getMeasuredWidth();
                        if (!q()) {
                            this.r0 = 0.0f;
                        } else {
                            this.r0 = V(abs2);
                            K1(abs2);
                            float U = U(abs2);
                            this.s0 = U;
                            if (U != 0.0f && q() && !k0()) {
                                i = 0;
                            } else {
                                i = 4;
                            }
                            this.u0.setVisibility(i);
                        }
                        G1(false);
                        g1(abs2, zhaVarArr[1].F);
                        T0(getTabProgress());
                        S0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.z1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    r1(motionEvent);
                }
                return this.A1;
            }
        }
        return false;
    }

    public final boolean p() {
        boolean l0 = l0();
        long j = this.m1;
        e eVar = this.y1;
        if (l0) {
            TLRPC.User X1 = uc7.s1(eVar.getCurrentAccount()).X1(Long.valueOf(j));
            if (X1 == null || !X1.bot || !X1.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!s0()) {
            if (eVar == null || !eVar.getMessagesController().O1().g(j)) {
                return false;
            }
            return true;
        } else {
            return true;
        }
    }

    public final boolean p0(int i) {
        if (i == 7) {
            return this.G1.X();
        }
        if (!q0() && i != 0 && !j0(i) && i != 2 && i != 5 && i != 6 && i != 11 && i != 10 && i != 13 && i != 14 && i != 15) {
            return true;
        }
        return false;
    }

    public final void p1(boolean z) {
        zha[] zhaVarArr;
        zha zhaVar;
        if (!this.r1) {
            int i = 0;
            while (true) {
                zhaVarArr = this.n0;
                if (i < zhaVarArr.length) {
                    int i2 = zhaVarArr[i].F;
                    if (i2 == 0 || j0(i2)) {
                        break;
                    }
                    i++;
                } else {
                    zhaVar = null;
                    break;
                }
            }
            zhaVar = zhaVarArr[i];
            if (zhaVar != null) {
                int i3 = zhaVar.F;
                this.s1 = i3;
                boolean j0 = j0(i3);
                int[] iArr = this.p1;
                int R = R(j0 ? 1 : 0, iArr[j0 ? 1 : 0], z);
                this.t1 = R;
                if (R != iArr[j0 ? 1 : 0]) {
                    if (!this.n1 || !j0(this.s1)) {
                        zhaVar.n.setVisibility(0);
                        boolean j02 = j0(this.s1);
                        yha yhaVar = zhaVar.n;
                        if (j02) {
                            yhaVar.setAdapter(w1(this.s1));
                        } else {
                            yhaVar.setAdapter(this.L);
                        }
                        yha yhaVar2 = zhaVar.n;
                        yhaVar2.setPadding(yhaVar2.getPaddingLeft(), T(this.s1), zhaVar.n.getPaddingRight(), S(s0()));
                        zhaVar.r.x1(R);
                        zhaVar.n.c0();
                        zhaVar.r.O = new zga(this, zhaVar, (byte) 0);
                        hl.V3(zhaVar.h);
                        this.r1 = true;
                        if (this.s1 == 0) {
                            this.w1[0].g(true);
                        }
                        this.q1 = 0.0f;
                        if (this.s >= 0) {
                            for (zha zhaVar2 : zhaVarArr) {
                                if (zhaVar2.F == this.s1) {
                                    zhaVar2.r.g1(this.s, this.w - zhaVar2.n.getPaddingTop());
                                }
                            }
                            return;
                        }
                        e1();
                    }
                }
            }
        }
    }

    public boolean q() {
        return !(this instanceof re5);
    }

    public boolean q0() {
        if (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) {
            return false;
        }
        return true;
    }

    public final void q1() {
        int i = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i < zhaVarArr.length) {
                int childCount = zhaVarArr[i].h.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = zhaVarArr[i].h.getChildAt(i2);
                    if (childAt instanceof vw2) {
                        ImageReceiver photoImage = ((vw2) childAt).getPhotoImage();
                        if (i == 0) {
                            photoImage.u0 = true;
                            photoImage.w0(false);
                        } else {
                            photoImage.u0 = false;
                            photoImage.x0();
                        }
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public boolean r0() {
        return false;
    }

    public final void r1(MotionEvent motionEvent) {
        float f;
        float f2;
        boolean z;
        float measuredWidth;
        zha zhaVar;
        zha zhaVar2;
        int measuredWidth2;
        zha zhaVar3;
        zha zhaVar4;
        boolean z2;
        VelocityTracker velocityTracker = this.E1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.V0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f = this.E1.getXVelocity();
                f2 = this.E1.getYVelocity();
                if (!this.A1 && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                    if (f < 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    b1(motionEvent, z2);
                }
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (this.A1) {
                zha[] zhaVarArr = this.n0;
                float x = zhaVarArr[0].getX();
                this.i1 = new AnimatorSet();
                if (Math.abs(x) < zhaVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2))) {
                    z = true;
                } else {
                    z = false;
                }
                this.l1 = z;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new b49(this, (byte) 28));
                boolean z3 = this.l1;
                Property property = View.TRANSLATION_X;
                if (z3) {
                    measuredWidth = Math.abs(x);
                    boolean z4 = this.k1;
                    AnimatorSet animatorSet = this.i1;
                    if (z4) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(zhaVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(zhaVarArr[1], property, zhaVar4.getMeasuredWidth()), ofFloat);
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(zhaVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(zhaVarArr[1], property, -zhaVar3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = zhaVarArr[0].getMeasuredWidth() - Math.abs(x);
                    boolean z5 = this.k1;
                    AnimatorSet animatorSet2 = this.i1;
                    if (z5) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(zhaVarArr[0], property, -zhaVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(zhaVarArr[1], property, 0.0f), ofFloat);
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(zhaVarArr[0], property, zhaVar.getMeasuredWidth()), ObjectAnimator.ofFloat(zhaVarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.i1.setInterpolator(u2);
                int measuredWidth3 = getMeasuredWidth();
                float f3 = measuredWidth3 / 2;
                float I = (hl.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f3) + f3;
                float abs = Math.abs(f);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs) * 1000.0f) << 2;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.i1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.i1.addListener(new eha(this, (byte) 1));
                this.i1.start();
                this.j1 = true;
                this.A1 = false;
                S0();
            } else {
                this.B1 = false;
                setHeaderEnabled(true);
                this.L0.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.E1;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.E1 = null;
            }
        }
    }

    public final boolean s() {
        zha zhaVar;
        zha[] zhaVarArr = this.n0;
        if (zhaVarArr != null && (zhaVar = zhaVarArr[0]) != null) {
            boolean j0 = j0(zhaVar.F);
            int i = this.p1[j0 ? 1 : 0];
            if (i != R(j0 ? 1 : 0, i, true)) {
                return true;
            }
        }
        return false;
    }

    public boolean s0() {
        return false;
    }

    public final int s1(int i) {
        dja u1 = u1(i);
        if (u1 == null) {
            return -1;
        }
        return u1.b;
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z;
        int i;
        TLRPC.ChatFull chatFull2 = this.g1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z = true;
        } else {
            z = false;
        }
        this.g1 = chatFull;
        if (chatFull != null) {
            long j = chatFull.migrated_from_chat_id;
            if (j != 0 && this.f1 == 0) {
                this.f1 = -j;
                int i2 = 0;
                while (true) {
                    tia[] tiaVarArr = this.w1;
                    if (i2 >= tiaVarArr.length) {
                        break;
                    }
                    if (tiaVarArr[i2].b[1].size() == 0) {
                        tia tiaVar = tiaVarArr[i2];
                        tiaVar.j[1] = this.g1.migrated_from_max_id;
                        tiaVar.i[1] = false;
                    }
                    i2++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.g1;
        if (chatFull3 != null && z != chatFull3.stories_pinned_available) {
            bha bhaVar = this.L0;
            if (bhaVar != null) {
                if (k0()) {
                    i = 9;
                } else {
                    i = 8;
                }
                bhaVar.setInitialTabId(i);
            }
            N1(true);
            z1(false);
        }
    }

    public void setCommonGroupsCount(int i) {
        if (this.G == 0) {
            this.a1[6] = i;
        }
        N1(true);
        y();
    }

    public void setForwardRestrictedHint(kg5 kg5Var) {
        this.H1 = kg5Var;
    }

    public void setMergeDialogId(long j) {
        this.f1 = j;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i = 0;
        while (true) {
            iArr2 = this.a1;
            if (i > 6 || iArr2[i] >= 0) {
                break;
            }
            i++;
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        N1(true);
        y();
        if (iArr2[0] >= 0) {
            G0(false);
        }
    }

    public void setOnTopPanelShiftChanged(Runnable runnable) {
        this.k2 = runnable;
    }

    @Override
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.O1 = i2;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i6 >= zhaVarArr.length) {
                break;
            }
            zhaVarArr[i6].setTranslationY(this.O1);
            i6++;
        }
        xj3 xj3Var = this.S0;
        if (xj3Var != null) {
            if (xj3Var != null) {
                xj3Var.setTranslationY(this.O1);
            }
        } else {
            xga xgaVar = this.U0;
            if (xgaVar != null) {
                xgaVar.setTranslationY(hl.L(48.0f) + i2);
            }
        }
        this.R0 = i2;
        dl1 dl1Var = this.N0;
        if (dl1Var.getTag() == null) {
            i5 = -hl.L(48.0f);
        }
        dl1Var.setTranslationY(i5 + this.R0);
    }

    public void setPagesGlassEngine(vy4 vy4Var) {
        zha[] zhaVarArr;
        this.h2 = vy4Var;
        cga cgaVar = this.b0;
        if (cgaVar != null) {
            cgaVar.setGlassEngine(vy4Var);
        }
        for (zha zhaVar : this.n0) {
            if (zhaVar != null) {
                zhaVar.h.setCaptureSectionsDecoratorAllowed(true);
                vy4Var.b(zhaVar.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i) {
        if (this.b2 != i) {
            this.b2 = i;
            zha[] zhaVarArr = this.n0;
            if (zhaVarArr != null) {
                for (zha zhaVar : zhaVarArr) {
                    if (zhaVar != null) {
                        jga jgaVar = zhaVar.h;
                        int paddingLeft = jgaVar.getPaddingLeft();
                        jga jgaVar2 = zhaVar.h;
                        int i2 = jgaVar2.f3;
                        int paddingRight = jgaVar2.getPaddingRight();
                        jga jgaVar3 = zhaVar.h;
                        int S = S(s0());
                        jgaVar3.i3 = S;
                        jgaVar.setPadding(paddingLeft, i2, paddingRight, S);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i) {
        if (this.g2 != i) {
            this.g2 = i;
            invalidate();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setPinnedToTop(boolean z) {
        if (this.d != z) {
            this.d = z;
            int i = 0;
            while (true) {
                zha[] zhaVarArr = this.n0;
                if (i < zhaVarArr.length) {
                    D1(zhaVarArr[i], true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z;
        TLRPC.UserFull userFull2 = this.h1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z = true;
        } else {
            z = false;
        }
        this.h1 = userFull;
        N1(true);
        if (userFull != null && z != userFull.stories_pinned_available) {
            f1(8);
        }
    }

    public void setVisibleHeight(int i) {
        float f;
        this.Q1 = i;
        int i2 = 0;
        while (true) {
            zha[] zhaVarArr = this.n0;
            if (i2 >= zhaVarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (zhaVarArr[i2].F == 8) {
                f = 280.0f;
            } else {
                f = 120.0f;
            }
            float f2 = (-(measuredHeight - Math.max(i, hl.L(f)))) / 2.0f;
            zhaVarArr[i2].w.setTranslationY(f2);
            zhaVarArr[i2].s.setTranslationY(-f2);
            i2++;
        }
        bga bgaVar = this.a0;
        if (bgaVar != null) {
            bgaVar.setVisibleHeight(i);
        }
        cga cgaVar = this.b0;
        if (cgaVar != null) {
            cgaVar.setVisibleHeight(i);
        }
    }

    public final boolean t() {
        zha zhaVar;
        zha[] zhaVarArr = this.n0;
        if (zhaVarArr != null && (zhaVar = zhaVarArr[0]) != null && (!this.n1 || !j0(zhaVar.F))) {
            boolean j0 = j0(zhaVarArr[0].F);
            int i = this.p1[j0 ? 1 : 0];
            if (i != R(j0 ? 1 : 0, i, false)) {
                return true;
            }
        }
        return false;
    }

    public final dja t1(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.m2;
        dja djaVar = (dja) hashMap.get(valueOf);
        if (djaVar == null) {
            dja djaVar2 = new dja(this, getContext(), i);
            hashMap.put(Integer.valueOf(i), djaVar2);
            this.n2.put(Integer.valueOf(djaVar2.a), Integer.valueOf(i));
            return djaVar2;
        }
        return djaVar;
    }

    public final void u(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        zha[] zhaVarArr;
        d79 d79Var;
        bga bgaVar;
        mha mhaVar;
        cga cgaVar;
        View[] viewPages;
        for (zha zhaVar : this.n0) {
            if (zhaVar != null && zhaVar.getVisibility() == 0) {
                if (zhaVar.P != null) {
                    RectF rectF2 = this.j2;
                    if (yic.c(zhaVar, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        zhaVar.c(canvas);
                        canvas.restore();
                    }
                }
                if (zhaVar.F == 14 && (cgaVar = this.b0) != null && cgaVar.getParent() == zhaVar) {
                    for (View view : cgaVar.h.getViewPages()) {
                        if ((view instanceof au8) && view.getVisibility() == 0) {
                            wa waVar = ((au8) view).f;
                            uk0.a(waVar, canvas, rectF, waVar, viewGroup);
                        }
                    }
                } else {
                    if (zhaVar.F == 12 && (mhaVar = this.W) != null && mhaVar.getParent() == zhaVar) {
                        d79Var = mhaVar.a.A0;
                    } else if (zhaVar.F == 13 && (bgaVar = this.a0) != null && bgaVar.getParent() == zhaVar) {
                        d79Var = bgaVar.getCurrentListView();
                    } else {
                        d79Var = zhaVar.h;
                    }
                    if (d79Var != null && d79Var.getVisibility() == 0) {
                        uk0.a(d79Var, canvas, rectF, d79Var, viewGroup);
                    }
                }
            }
        }
    }

    public final boolean u0() {
        if (!p() || ((getClosestTab() != 8 && getClosestTab() != 13 && !t0(getClosestTab())) || !this.F1)) {
            cga cgaVar = this.b0;
            if (cgaVar == null || !cgaVar.g()) {
                fga fgaVar = this.c0;
                if ((fgaVar == null || !fgaVar.f) && !this.r1 && !this.j1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final dja u1(int i) {
        Integer num = (Integer) this.n2.get(Integer.valueOf(i));
        if (num == null) {
            return null;
        }
        return (dja) this.m2.get(num);
    }

    @Override
    public final void updateColors() {
        zha[] zhaVarArr;
        try {
            this.J1.a(c0(aob.d6));
            gd0 gd0Var = this.G0;
            if (gd0Var != null) {
                gd0Var.a(c0(aob.y8));
            }
            NumberTextView numberTextView = this.D0;
            if (numberTextView != null) {
                numberTextView.setTextColor(c0(aob.y8));
            }
            B1();
            invalidate();
            for (zha zhaVar : this.n0) {
                if (zhaVar != null && zhaVar.M) {
                    zhaVar.invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void v0(int i, int i2, int i3, boolean z) {
        tia[] tiaVarArr = this.w1;
        tiaVarArr[i].a.clear();
        tiaVarArr[i].b[0].clear();
        tiaVarArr[i].b[1].clear();
        tia tiaVar = tiaVarArr[i];
        tiaVar.j[0] = i2;
        tiaVar.i[0] = false;
        tiaVar.l = false;
        tiaVar.m = i3;
        tiaVar.n = (tiaVar.e() - i3) - 1;
        tia tiaVar2 = tiaVarArr[i];
        if (tiaVar2.n < 0) {
            tiaVar2.n = 0;
        }
        tiaVar2.k = i2;
        tiaVar2.o = true;
        tiaVar2.g = false;
        tiaVar2.p++;
        zha P = P(i);
        if (P != null && P.h.getAdapter() != null) {
            P.h.getAdapter().f();
        }
        if (z) {
            int i4 = 0;
            while (true) {
                zha[] zhaVarArr = this.n0;
                if (i4 < zhaVarArr.length) {
                    zha zhaVar = zhaVarArr[i4];
                    if (zhaVar.F == i) {
                        zhaVar.x.g1(Math.min(tiaVarArr[i].e() - 1, tiaVarArr[i].m), 0);
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public final bja v1(int i) {
        dja u1;
        if (i == 8) {
            return this.f0;
        }
        if (i == 9) {
            return this.h0;
        }
        if (t0(i) && (u1 = u1(i)) != null) {
            return u1.c;
        }
        return null;
    }

    public final void w0(String str) {
        getStoriesController().q(this.m1, str, new yfa(this, (byte) 0));
    }

    public final bja w1(int i) {
        dja u1;
        if (i == 8) {
            return this.g0;
        }
        if (i == 9) {
            return this.i0;
        }
        if (!t0(i) || (u1 = u1(i)) == null) {
            return null;
        }
        return u1.d;
    }

    public final void x() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eja.x():void");
    }

    public final void x0(TL_stories.StoryItem storyItem, w5b w5bVar) {
        getStoriesController().b(w5bVar.a, this.m1, storyItem);
        hl.d3(new kba(this, w5bVar, (byte) 4), 100L);
    }

    public final int x1(j79 j79Var) {
        if (j79Var == this.f0) {
            return 8;
        }
        if (j79Var == this.h0) {
            return 9;
        }
        for (dja djaVar : this.m2.values()) {
            if (djaVar.c == j79Var) {
                return djaVar.a;
            }
        }
        return -1;
    }

    public final void y() {
        bha bhaVar = this.L0;
        if (!bhaVar.d(bhaVar.getCurrentTabId())) {
            int firstTabId = bhaVar.getFirstTabId();
            bhaVar.setInitialTabId(firstTabId);
            this.n0[0].F = firstTabId;
            z1(false);
        }
    }

    public final void y0(TL_stories.StoryItem storyItem, String str) {
        getStoriesController().q(this.m1, str, new ku9(this, storyItem, (byte) 6));
    }

    public final int y1(j79 j79Var) {
        if (j79Var == this.g0) {
            return 8;
        }
        if (j79Var == this.i0) {
            return 9;
        }
        for (dja djaVar : this.m2.values()) {
            if (djaVar.d == j79Var) {
                return djaVar.a;
            }
        }
        return -1;
    }

    public final void z(zha zhaVar, d79 d79Var, x46 x46Var) {
        int abs;
        int b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        f89 L;
        boolean z;
        r47 r47Var;
        jga jgaVar;
        v5b v5bVar;
        if (!this.r1 && this.N1 == null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (d79Var.getFastScroll() == null || !d79Var.getFastScroll().n || currentTimeMillis - zhaVar.a >= 300) {
                zhaVar.a = currentTimeMillis;
                if ((!this.Y0 || !this.X0 || zhaVar.F == 11) && zhaVar.F != 7) {
                    int K0 = x46Var.K0();
                    if (K0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(x46Var.M0() - K0) + 1;
                    }
                    if (d79Var.getAdapter() == null) {
                        b = 0;
                    } else {
                        b = d79Var.getAdapter().b();
                    }
                    int i6 = zhaVar.F;
                    int[] iArr = this.p1;
                    tia[] tiaVarArr = this.w1;
                    if (i6 != 0 && i6 != 1 && i6 != 2 && i6 != 4) {
                        i = false;
                    } else {
                        b = tiaVarArr[i6].d() + tiaVarArr[i6].a.size();
                        tia tiaVar = tiaVarArr[i6];
                        i = false;
                        if (tiaVar.h && tiaVar.e.size() > 2 && zhaVar.F == 0 && tiaVarArr[i6].a.size() != 0) {
                            if (i6 == 0) {
                                i2 = iArr[0];
                            } else {
                                i2 = 1;
                            }
                            float f = i2;
                            int measuredHeight = (int) ((d79Var.getMeasuredHeight() / (d79Var.getMeasuredWidth() / f)) * f * 1.5f);
                            if (measuredHeight < 100) {
                                measuredHeight = 100;
                            }
                            if (measuredHeight < ((eia) tiaVarArr[i6].e.get(1)).b) {
                                measuredHeight = ((eia) tiaVarArr[i6].e.get(1)).b;
                            }
                            if ((K0 > b && K0 - b > measuredHeight) || ((i3 = K0 + abs) < tiaVarArr[i6].m && tiaVarArr[0].m - i3 > measuredHeight)) {
                                a39 a39Var = new a39(this, i6, d79Var, (byte) 6);
                                this.N1 = a39Var;
                                hl.c3(a39Var);
                                return;
                            }
                        }
                    }
                    int i7 = zhaVar.F;
                    if (i7 != 7) {
                        boolean j0 = j0(i7);
                        int i8 = zhaVar.F;
                        if (j0) {
                            bja v1 = v1(i8);
                            if (v1 != null && (v5bVar = v1.s) != null && K0 + abs > v5bVar.i() - iArr[1]) {
                                v1.P();
                            }
                        } else if (i8 == 6) {
                            if (abs > 0) {
                                sha shaVar = this.S;
                                boolean z2 = shaVar.h;
                                ArrayList arrayList = shaVar.d;
                                if (!z2 && !shaVar.e && !arrayList.isEmpty() && K0 + abs >= b - 5) {
                                    shaVar.E(((TLRPC.Chat) c00.g(1, arrayList)).id);
                                }
                            }
                        } else {
                            e eVar = this.y1;
                            if (i8 == 11) {
                                int i9 = i;
                                int i10 = -1;
                                while (true) {
                                    int childCount = zhaVar.h.getChildCount();
                                    jgaVar = zhaVar.h;
                                    if (i9 >= childCount) {
                                        break;
                                    }
                                    View childAt = jgaVar.getChildAt(i9);
                                    zhaVar.h.getClass();
                                    i10 = Math.max(RecyclerView.S(childAt), i10);
                                    i9++;
                                }
                                j79 adapter = jgaVar.getAdapter();
                                qia qiaVar = this.V;
                                int i11 = i10 + 1;
                                if (adapter == qiaVar) {
                                    if (i11 >= qiaVar.h.size() + qiaVar.e.size() && !qiaVar.s && !qiaVar.r) {
                                        qiaVar.r = true;
                                        qiaVar.F();
                                        return;
                                    }
                                    return;
                                } else if (i11 >= eVar.getMessagesController().F1().i.size()) {
                                    eVar.getMessagesController().F1().g(i);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            int i12 = 10;
                            if (i8 != 10 && i8 != 12 && i8 != 13 && i8 != 14) {
                                if (i8 == 0) {
                                    i12 = 3;
                                } else if (i8 != 5) {
                                    i12 = 6;
                                }
                                if (i8 == 15) {
                                    i4 = 8;
                                } else {
                                    i4 = i8;
                                }
                                if (abs + K0 > b - i12 || tiaVarArr[i4].o) {
                                    tia tiaVar2 = tiaVarArr[i4];
                                    if (!tiaVar2.g) {
                                        if (i8 == 0) {
                                            byte b2 = tiaVarArr[0].q;
                                            if (b2 == 1) {
                                                i5 = 6;
                                            } else if (b2 == 2) {
                                                i5 = 7;
                                            } else {
                                                i5 = 0;
                                            }
                                        } else {
                                            int i13 = 2;
                                            if (i8 == 1) {
                                                i5 = 1;
                                            } else {
                                                if (i8 != 2) {
                                                    i13 = 4;
                                                    if (i8 != 4) {
                                                        if (i8 == 5) {
                                                            i5 = 5;
                                                        } else if (i8 == 15) {
                                                            i5 = 8;
                                                        } else {
                                                            i5 = 3;
                                                        }
                                                    }
                                                }
                                                i5 = i13;
                                            }
                                        }
                                        boolean[] zArr = tiaVar2.i;
                                        if (!zArr[0]) {
                                            tiaVar2.g = true;
                                            eVar.getMediaDataController().P0(this.m1, 50, tiaVarArr[i4].j[0], 0, i5, this.G, 1, eVar.getClassGuid(), tiaVarArr[i4].p, null, null);
                                        } else if (this.f1 != 0 && !zArr[1]) {
                                            tiaVar2.g = true;
                                            eVar.getMediaDataController().P0(this.f1, 50, tiaVarArr[i4].j[1], 0, i5, this.G, 1, eVar.getClassGuid(), tiaVarArr[i4].p, null, null);
                                        }
                                    }
                                }
                                int i14 = tiaVarArr[i4].m;
                                if (i4 == 0) {
                                    i14 = this.K.L(0);
                                }
                                if (K0 - i14 < i12 + 1) {
                                    tia tiaVar3 = tiaVarArr[i4];
                                    if (!tiaVar3.g && !tiaVar3.l && !tiaVar3.o) {
                                        H0(zhaVar.F);
                                    }
                                }
                                zha zhaVar2 = this.n0[0];
                                if (zhaVar2.h == d79Var) {
                                    int i15 = zhaVar2.F;
                                    if ((i15 == 0 || i15 == 5) && K0 != -1 && (L = d79Var.L(K0)) != null) {
                                        int i16 = L.f;
                                        if (i16 == 0 || i16 == 12) {
                                            View view = L.a;
                                            boolean z3 = view instanceof kja;
                                            dl1 dl1Var = this.N0;
                                            if (z3) {
                                                kja kjaVar = (kja) view;
                                                if (kjaVar.e <= 0) {
                                                    r47Var = null;
                                                    z = false;
                                                } else {
                                                    z = false;
                                                    r47Var = kjaVar.b[0];
                                                }
                                                if (r47Var != null) {
                                                    dl1Var.h0(r47Var.k.date, z, true);
                                                }
                                            } else if (view instanceof vw2) {
                                                dl1Var.h0(((vw2) view).getDate(), false, true);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void z0(HashSet hashSet, TL_stories.StoryItem storyItem, fu5 fu5Var, w5b w5bVar) {
        String a0;
        boolean contains = hashSet.contains(Integer.valueOf(w5bVar.a));
        long j = this.m1;
        if (contains) {
            getStoriesController().b(w5bVar.a, j, storyItem);
            a0 = ob6.a0(null, null, 2131744388, w5bVar.b);
        } else {
            c6b storiesController = getStoriesController();
            int i = w5bVar.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.e0(i, j, arrayList);
            a0 = ob6.a0(null, null, 2131744148, w5bVar.b);
        }
        d31.b0(this.y1).Q(2131623990, 36, hl.S2(a0)).j();
        fu5Var.u();
    }

    public final void z1(boolean z) {
        zha[] zhaVarArr;
        zha[] zhaVarArr2;
        s7 s7Var;
        x79 x79Var;
        boolean z2;
        boolean z3;
        boolean z4;
        x79 x79Var2;
        int i;
        int i2;
        int i3;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z7;
        x79 x79Var3;
        int i8;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        x79 x79Var4;
        cga cgaVar = this.b0;
        if (cgaVar != null) {
            cgaVar.i();
        }
        int i13 = 0;
        while (true) {
            zhaVarArr = this.n0;
            if (i13 >= zhaVarArr.length) {
                break;
            }
            zhaVarArr[i13].h.E0();
            i13++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zhaVarArr[z ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = hl.L(I0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        j79 adapter = zhaVarArr[z ? 1 : 0].h.getAdapter();
        j79 j79Var = this.f0;
        lu5 lu5Var = this.e0;
        if (adapter == j79Var) {
            lu5Var.h(null);
        }
        boolean z12 = this.Y0;
        jla jlaVar = this.I;
        tha thaVar = this.G1;
        a aVar = this.H;
        String str = "";
        nia niaVar = this.Q;
        s7 s7Var2 = this.q0;
        int i14 = 100;
        if (z12 && this.X0) {
            zha zhaVar = zhaVarArr[z ? 1 : 0];
            if (zhaVar.f == null) {
                zhaVar.f = new x79();
            }
            zha zhaVar2 = zhaVarArr[z ? 1 : 0];
            x79 x79Var5 = zhaVar2.f;
            qia qiaVar = this.V;
            xha xhaVar = this.m0;
            bia biaVar = this.k0;
            bia biaVar2 = this.l0;
            bia biaVar3 = this.j0;
            if (z) {
                int i15 = zhaVar2.F;
                if (i15 != 0) {
                    x79Var4 = x79Var5;
                    if (i15 != 2 && i15 != 5 && i15 != 6 && (i15 != 7 || thaVar.X())) {
                        if (s7Var2 != null) {
                            str = s7Var2.getSearchField().getText().toString();
                        }
                        String str2 = str;
                        int i16 = zhaVarArr[z ? 1 : 0].F;
                        if (i16 == 1) {
                            if (biaVar3 != null) {
                                biaVar3.G(str2, false);
                                if (adapter != biaVar3) {
                                    d1(adapter);
                                    zhaVarArr[z ? 1 : 0].h.setAdapter(biaVar3);
                                }
                            }
                        } else if (i16 == 3) {
                            if (biaVar2 != null) {
                                biaVar2.G(str2, false);
                                if (adapter != biaVar2) {
                                    d1(adapter);
                                    zhaVarArr[z ? 1 : 0].h.setAdapter(biaVar2);
                                }
                            }
                        } else if (i16 == 4) {
                            if (biaVar != null) {
                                biaVar.G(str2, false);
                                if (adapter != biaVar) {
                                    d1(adapter);
                                    zhaVarArr[z ? 1 : 0].h.setAdapter(biaVar);
                                }
                            }
                        } else if (i16 == 7) {
                            if (xhaVar != null) {
                                xhaVar.F(str2, false);
                                if (adapter != xhaVar) {
                                    d1(adapter);
                                    zhaVarArr[z ? 1 : 0].h.setAdapter(xhaVar);
                                }
                            }
                        } else if (i16 == 11) {
                            if (qiaVar != null) {
                                qiaVar.E(this.Z0, str2);
                                if (adapter != qiaVar) {
                                    d1(adapter);
                                    zhaVarArr[z ? 1 : 0].h.setAdapter(qiaVar);
                                }
                            }
                        } else if (i16 == 15 && niaVar != null && adapter != niaVar) {
                            d1(adapter);
                            jga jgaVar = zhaVarArr[z ? 1 : 0].h;
                            niaVar.r = jgaVar;
                            jgaVar.setAdapter(niaVar);
                        }
                    }
                }
                this.Y0 = false;
                yga ygaVar = this.M0;
                if (ygaVar != null) {
                    ygaVar.g(false);
                }
                this.X0 = false;
                z1(true);
                return;
            }
            x79Var4 = x79Var5;
            if (zhaVar2.h != null) {
                int i17 = zhaVar2.F;
                if (i17 == 1) {
                    if (adapter != biaVar3) {
                        d1(adapter);
                        zhaVarArr[z ? 1 : 0].h.setAdapter(biaVar3);
                    }
                    biaVar3.f();
                } else if (i17 == 3) {
                    if (adapter != biaVar2) {
                        d1(adapter);
                        zhaVarArr[z ? 1 : 0].h.setAdapter(biaVar2);
                    }
                    biaVar2.f();
                } else if (i17 == 4) {
                    if (adapter != biaVar) {
                        d1(adapter);
                        zhaVarArr[z ? 1 : 0].h.setAdapter(biaVar);
                    }
                    biaVar.f();
                } else if (i17 == 7) {
                    if (adapter != xhaVar) {
                        d1(adapter);
                        zhaVarArr[z ? 1 : 0].h.setAdapter(xhaVar);
                    }
                    xhaVar.f();
                } else if (i17 == 11) {
                    if (adapter != qiaVar) {
                        d1(adapter);
                        zhaVarArr[z ? 1 : 0].h.setAdapter(qiaVar);
                    }
                    qiaVar.f();
                }
            }
            zhaVarArr2 = zhaVarArr;
            s7Var = s7Var2;
            x79Var3 = x79Var4;
            i = 4;
            z4 = false;
            z7 = false;
            i5 = 8;
        } else {
            zha zhaVar3 = zhaVarArr[z ? 1 : 0];
            if (zhaVar3.e == null) {
                zhaVar3.e = new x79();
            }
            zha zhaVar4 = zhaVarArr[z ? 1 : 0];
            x79 x79Var6 = zhaVar4.e;
            zhaVar4.h.setPinnedHeaderShadowDrawable(null);
            int i18 = zhaVarArr[z ? 1 : 0].F;
            if (i18 == 8 || t0(i18)) {
                layoutParams.topMargin = hl.L(I0());
            }
            jga jgaVar2 = zhaVarArr[z ? 1 : 0].h;
            int paddingLeft = jgaVar2.getPaddingLeft();
            zha zhaVar5 = zhaVarArr[z ? 1 : 0];
            zhaVarArr2 = zhaVarArr;
            jga jgaVar3 = zhaVar5.h;
            int T = T(zhaVar5.F);
            jgaVar3.h3 = T;
            int paddingRight = zhaVarArr2[z ? 1 : 0].h.getPaddingRight();
            jga jgaVar4 = zhaVarArr2[z ? 1 : 0].h;
            int S = S(s0());
            jgaVar4.i3 = S;
            jgaVar2.setPadding(paddingLeft, T, paddingRight, S);
            int i19 = zhaVarArr2[z ? 1 : 0].F;
            int[] iArr = this.p1;
            j79 j79Var2 = this.N;
            sha shaVar = this.S;
            pia piaVar = this.U;
            View view = this.a0;
            mha mhaVar = this.W;
            s7Var = s7Var2;
            tia[] tiaVarArr = this.w1;
            if (i19 == 0) {
                j79 j79Var3 = this.K;
                if (adapter != j79Var3) {
                    d1(adapter);
                    zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var3);
                }
                int i20 = -hl.L(1.0f);
                layoutParams.rightMargin = i20;
                layoutParams.leftMargin = i20;
                tia tiaVar = tiaVarArr[0];
                if (tiaVar.h && !tiaVar.e.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i14 = iArr[0];
                zhaVarArr2[z ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.B0);
                x79Var = tiaVarArr[0].x;
                z4 = z10;
                z2 = false;
            } else {
                if (i19 == 1) {
                    tia tiaVar2 = tiaVarArr[1];
                    if (tiaVar2.h && !tiaVar2.e.isEmpty()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (adapter != j79Var2) {
                        d1(adapter);
                        zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var2);
                    }
                } else if (i19 == 2) {
                    tia tiaVar3 = tiaVarArr[2];
                    if (tiaVar3.h && !tiaVar3.e.isEmpty()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    j79 j79Var4 = this.O;
                    if (adapter != j79Var4) {
                        d1(adapter);
                        zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var4);
                    }
                } else {
                    if (i19 == 3) {
                        j79 j79Var5 = this.M;
                        if (adapter != j79Var5) {
                            d1(adapter);
                            zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var5);
                        }
                    } else if (i19 == 4) {
                        tia tiaVar4 = tiaVarArr[4];
                        if (tiaVar4.h && !tiaVar4.e.isEmpty()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        j79 j79Var6 = this.P;
                        if (adapter != j79Var6) {
                            d1(adapter);
                            zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var6);
                        }
                    } else {
                        if (i19 == 5) {
                            j79 j79Var7 = this.R;
                            if (adapter != j79Var7) {
                                d1(adapter);
                                zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var7);
                            }
                        } else if (i19 == 15) {
                            if (adapter != niaVar) {
                                d1(adapter);
                                jga jgaVar5 = zhaVarArr2[z ? 1 : 0].h;
                                niaVar.r = jgaVar5;
                                jgaVar5.setAdapter(niaVar);
                            }
                        } else if (i19 == 6) {
                            if (adapter != shaVar) {
                                d1(adapter);
                                zhaVarArr2[z ? 1 : 0].h.setAdapter(shaVar);
                            }
                        } else if (i19 == 7) {
                            j79 j79Var8 = this.d0;
                            if (adapter != j79Var8) {
                                d1(adapter);
                                zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var8);
                            }
                        } else if (j0(i19)) {
                            j79 v1 = v1(zhaVarArr2[z ? 1 : 0].F);
                            if (adapter != v1) {
                                d1(adapter);
                                zhaVarArr2[z ? 1 : 0].h.setAdapter(v1);
                                zhaVarArr2[z ? 1 : 0].h.getClass();
                            }
                            zha zhaVar6 = zhaVarArr2[z ? 1 : 0];
                            if (zhaVar6.F != 9) {
                                lu5Var.h(zhaVar6.h);
                            }
                            i14 = iArr[1];
                        } else {
                            int i21 = zhaVarArr2[z ? 1 : 0].F;
                            if (i21 == 10) {
                                j79 j79Var9 = this.T;
                                if (adapter != j79Var9) {
                                    d1(adapter);
                                    zhaVarArr2[z ? 1 : 0].h.setAdapter(j79Var9);
                                }
                            } else if (i21 == 11) {
                                if (adapter != piaVar) {
                                    d1(adapter);
                                    zhaVarArr2[z ? 1 : 0].h.setAdapter(piaVar);
                                    lu5 lu5Var2 = piaVar.w;
                                    jga jgaVar6 = zhaVarArr2[z ? 1 : 0].h;
                                    piaVar.s = jgaVar6;
                                    lu5Var2.h(jgaVar6);
                                }
                                x79Var = piaVar.r;
                                z2 = true;
                                z4 = false;
                            } else if (i21 == 12) {
                                if (adapter != null) {
                                    d1(adapter);
                                    zhaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (mhaVar.getParent() != zhaVarArr2[z ? 1 : 0]) {
                                    hl.B2(mhaVar);
                                    zhaVarArr2[z ? 1 : 0].addView(mhaVar, tre.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                    k1(hl.L(56.0f) + this.d2, mhaVar);
                                }
                            } else if (i21 == 13) {
                                if (adapter != null) {
                                    d1(adapter);
                                    zhaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != zhaVarArr2[z ? 1 : 0]) {
                                    hl.B2(view);
                                    zhaVarArr2[z ? 1 : 0].addView(view);
                                    k1(this.d2, view);
                                }
                            } else if (i21 == 14) {
                                if (adapter != null) {
                                    d1(adapter);
                                    zhaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (cgaVar != null && cgaVar.getParent() != zhaVarArr2[z ? 1 : 0]) {
                                    hl.B2(cgaVar);
                                    zhaVarArr2[z ? 1 : 0].addView(cgaVar);
                                    zhaVarArr2[z ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        x79Var = x79Var6;
                        z2 = false;
                        z4 = false;
                    }
                    x79Var = x79Var6;
                    z2 = true;
                    z4 = false;
                }
                z4 = z3;
                x79Var = x79Var6;
                z2 = true;
            }
            I1(zhaVarArr2[z ? 1 : 0]);
            if (z2) {
                zhaVarArr2[z ? 1 : 0].h.setSections(false);
                x79Var2 = x79Var;
            } else {
                jga jgaVar7 = zhaVarArr2[z ? 1 : 0].h;
                jgaVar7.getClass();
                x79Var2 = x79Var;
                yob.l(jgaVar7, 20, aob.i6, jgaVar7.o2);
                jgaVar7.U2 = false;
                jgaVar7.I2 = null;
                jgaVar7.J2 = null;
                jgaVar7.M2 = 0.0f;
                jgaVar7.N2 = null;
                jgaVar7.O2 = null;
                jgaVar7.K2 = null;
                p69 p69Var = jgaVar7.H2;
                if (p69Var != null) {
                    jgaVar7.s0(p69Var);
                    jgaVar7.H2 = null;
                }
                zj0 zj0Var = jgaVar7.S2;
                if (zj0Var != null) {
                    jgaVar7.s0(zj0Var);
                    jgaVar7.S2 = null;
                }
            }
            H1(zhaVarArr2[z ? 1 : 0]);
            zha zhaVar7 = zhaVarArr2[z ? 1 : 0];
            int i22 = zhaVar7.F;
            jga jgaVar8 = zhaVar7.h;
            if (i22 == 11) {
                jgaVar8.setItemAnimator(zhaVar7.d);
            } else {
                jgaVar8.setItemAnimator(null);
                if (piaVar != null && zhaVarArr2[z ? 1 : 0].h == piaVar.s) {
                    lu5 lu5Var3 = piaVar.w;
                    piaVar.s = null;
                    lu5Var3.h(null);
                }
            }
            if (mhaVar != null && zhaVarArr2[z ? 1 : 0].F != 12 && mhaVar.getParent() == zhaVarArr2[z ? 1 : 0]) {
                mhaVar.a.onRemoveFromParent();
                zhaVarArr2[z ? 1 : 0].removeView(mhaVar);
            }
            if (view != null && zhaVarArr2[z ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                zha zhaVar8 = zhaVarArr2[z ? 1 : 0];
                if (parent == zhaVar8) {
                    zhaVar8.removeView(view);
                }
            }
            if (cgaVar != null && zhaVarArr2[z ? 1 : 0].F != 14) {
                ViewParent parent2 = cgaVar.getParent();
                zha zhaVar9 = zhaVarArr2[z ? 1 : 0];
                if (parent2 == zhaVar9) {
                    zhaVar9.removeView(cgaVar);
                }
            }
            int i23 = zhaVarArr2[z ? 1 : 0].F;
            if (i23 != 0 && i23 != 11 && !j0(i23) && (i8 = zhaVarArr2[z ? 1 : 0].F) != 2 && i8 != 5 && i8 != 6 && ((i8 != 7 || thaVar.X()) && (i9 = zhaVarArr2[z ? 1 : 0].F) != 10 && i9 != 13 && i9 != 14)) {
                if (z) {
                    if (s7Var != null && s7Var.getVisibility() == 4) {
                        if (jlaVar != null) {
                            z9 = jlaVar.L;
                        } else {
                            z9 = aVar.o0;
                        }
                        if (!z9) {
                            if (q()) {
                                this.A0 = (byte) 1;
                                setSearchItemVisibility(0);
                            } else {
                                if (s0()) {
                                    i11 = 8;
                                } else {
                                    i11 = 4;
                                }
                                setSearchItemVisibility(i11);
                            }
                            float f = z ? 1.0f : 0.0f;
                            this.r0 = V(f);
                            K1(1.0f - f);
                            i = 4;
                            z8 = false;
                            G1(z8);
                        }
                    }
                    z8 = false;
                    this.A0 = (byte) 0;
                    this.r0 = 1.0f;
                    i = 4;
                    G1(z8);
                } else {
                    z8 = false;
                    if (s7Var != null) {
                        i = 4;
                        if (s7Var.getVisibility() == 4) {
                            if (q()) {
                                this.A0 = (byte) 0;
                                this.r0 = 1.0f;
                                setSearchItemVisibility(0);
                            } else {
                                if (s0()) {
                                    i10 = 8;
                                } else {
                                    i10 = 4;
                                }
                                setSearchItemVisibility(i10);
                                this.r0 = 0.0f;
                            }
                        }
                        G1(z8);
                    }
                    i = 4;
                    G1(z8);
                }
            } else {
                i = 4;
                if (z) {
                    this.A0 = (byte) 2;
                } else {
                    this.A0 = (byte) 0;
                    if (s7Var != null) {
                        if (!s0() && !this.Y0) {
                            i2 = 4;
                        } else {
                            i2 = 8;
                        }
                        setSearchItemVisibility(i2);
                    }
                }
            }
            int i24 = zhaVarArr2[z ? 1 : 0].F;
            if (i24 == 6) {
                if (!shaVar.e && !shaVar.h && shaVar.d.isEmpty()) {
                    shaVar.E(0L);
                }
            } else if (i24 != 7) {
                if (j0(i24)) {
                    bja v12 = v1(zhaVarArr2[z ? 1 : 0].F);
                    if (v12 != null) {
                        v5b v5bVar = v12.s;
                        v12.P();
                        vga vgaVar = zhaVarArr2[z ? 1 : 0].w;
                        if (v5bVar != null && (v5bVar.k() || (d0() && v5bVar.g() > 0))) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        vgaVar.e(z5, z);
                        if (v5bVar != null && v5bVar.g() > 0 && !q0()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z4 = z6;
                    }
                } else {
                    int i25 = zhaVarArr2[z ? 1 : 0].F;
                    if (i25 != 10 && i25 != 11 && i25 != 12 && i25 != 13 && i25 != 14) {
                        if (i25 == 15) {
                            i25 = 8;
                        }
                        tia tiaVar5 = tiaVarArr[i25];
                        if (!tiaVar5.g && !tiaVar5.i[0] && tiaVar5.a.isEmpty()) {
                            tiaVarArr[i25].g = true;
                            j79Var2.f();
                            if (i25 == 0) {
                                byte b = tiaVarArr[0].q;
                                if (b == 1) {
                                    i3 = 6;
                                } else if (b == 2) {
                                    i3 = 7;
                                }
                                e eVar = this.y1;
                                eVar.getMediaDataController().P0(this.m1, 50, 0, 0, i3, this.G, 1, eVar.getClassGuid(), tiaVarArr[i3].p, null, null);
                            }
                            i3 = i25;
                            e eVar2 = this.y1;
                            eVar2.getMediaDataController().P0(this.m1, 50, 0, 0, i3, this.G, 1, eVar2.getClassGuid(), tiaVarArr[i3].p, null, null);
                        }
                    }
                }
            }
            int i26 = zhaVarArr2[z ? 1 : 0].F;
            if (i26 != 8 && !t0(i26)) {
                zha zhaVar10 = zhaVarArr2[z ? 1 : 0];
                if (zhaVar10.F == 9) {
                    if (r0()) {
                        zhaVarArr2[z ? 1 : 0].w.b.setVisibility(8);
                        zhaVarArr2[z ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        zhaVarArr2[z ? 1 : 0].w.b.setVisibility(0);
                        zhaVarArr2[z ? 1 : 0].w.setStickerType(11);
                        zhaVarArr2[z ? 1 : 0].w.f.setVisibility(0);
                        zhaVarArr2[z ? 1 : 0].w.f.h(f(), false);
                    }
                    zhaVarArr2[z ? 1 : 0].w.d.setText(ob6.M0(2131747977, null));
                    p66 p66Var = zhaVarArr2[z ? 1 : 0].w.e;
                    if (s0()) {
                        str = ob6.M0(2131747978, null);
                    }
                    p66Var.setText(str);
                    zhaVarArr2[z ? 1 : 0].w.f.setOnClickListener(new ffa(this, (byte) 3));
                    i5 = 8;
                } else {
                    zhaVar10.w.b.setVisibility(0);
                    zhaVarArr2[z ? 1 : 0].w.setStickerType(1);
                    zhaVarArr2[z ? 1 : 0].w.d.setText(ob6.M0(2131747898, null));
                    zhaVarArr2[z ? 1 : 0].w.e.setText(ob6.M0(2131745535, null));
                    i5 = 8;
                    zhaVarArr2[z ? 1 : 0].w.f.setVisibility(8);
                }
            } else {
                zha zhaVar11 = zhaVarArr2[z ? 1 : 0];
                vga vgaVar2 = zhaVar11.w;
                boolean t0 = t0(zhaVar11.F);
                int s1 = s1(zhaVarArr2[z ? 1 : 0].F);
                de0 de0Var = vgaVar2.b;
                c51 c51Var = vgaVar2.f;
                if (!t0 && !r0() && !l0()) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                de0Var.setVisibility(i4);
                if (t0) {
                    c51Var.setVisibility(0);
                    c51Var.h(ob6.M0(2131744462, null), false);
                    i5 = 8;
                } else if (r0()) {
                    i5 = 8;
                    c51Var.setVisibility(8);
                } else {
                    i5 = 8;
                    vgaVar2.setStickerType(11);
                    if (!q0()) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    c51Var.setVisibility(i6);
                    c51Var.h(f(), false);
                }
                tpa tpaVar = vgaVar2.d;
                if (t0) {
                    tpaVar.setText(ob6.M0(2131744440, null));
                    vgaVar2.e.setText(ob6.M0(2131744441, null));
                } else {
                    if (!q0()) {
                        if (s0()) {
                            i7 = 2131747907;
                        } else {
                            i7 = 2131747878;
                        }
                    } else {
                        i7 = 2131747935;
                    }
                    tpaVar.setText(ob6.M0(i7, null));
                    p66 p66Var2 = vgaVar2.e;
                    if (s0()) {
                        str = ob6.M0(2131747879, null);
                    }
                    p66Var2.setText(str);
                }
                c51Var.setOnClickListener(new kt8(this, t0, s1, (byte) 1));
            }
            z7 = false;
            zhaVarArr2[z ? 1 : 0].h.setVisibility(0);
            x79Var3 = x79Var2;
        }
        int i27 = i14;
        zha zhaVar12 = zhaVarArr2[z ? 1 : 0];
        zhaVar12.b = z4;
        D1(zhaVar12, z7);
        zhaVarArr2[z ? 1 : 0].x.x1(i27);
        zhaVarArr2[z ? 1 : 0].h.c0();
        if (x79Var3 != null) {
            zhaVarArr2[z ? 1 : 0].h.setRecycledViewPool(x79Var3);
            zhaVarArr2[z ? 1 : 0].n.setRecycledViewPool(x79Var3);
        }
        if (this.A0 == 2) {
            if (jlaVar != null) {
                z11 = jlaVar.L;
            } else {
                z11 = aVar.o0;
            }
            if (z11) {
                this.C0 = true;
                if (jlaVar != null) {
                    jlaVar.o(true);
                } else {
                    aVar.o(true);
                }
                this.A0 = (byte) 0;
                this.r0 = 0.0f;
                if (s7Var != null) {
                    if (s0()) {
                        i12 = i5;
                    } else {
                        i12 = i;
                    }
                    setSearchItemVisibility(i12);
                }
                G1(false);
            }
        }
    }

    public void K0() {
    }

    public void Q0() {
    }

    @Override
    public final void r() {
    }

    public void J0(SparseArray sparseArray) {
    }

    public void R0(boolean z) {
    }

    public int c1(int i) {
        return i;
    }

    @Override
    public final void o(of3 of3Var) {
    }

    @Override
    public final void v(of3 of3Var) {
    }

    @Override
    public final void w(of3 of3Var) {
    }
}
