package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class xza extends d implements jm7 {
    public boolean A0;
    public boolean B0;
    public kza C0;
    public z3b D0;
    public jza E;
    public int E0;
    public jza F;
    public final zka F0;
    public jza G;
    public e7a G0;
    public tza H;
    public PorterDuffColorFilter H0;
    public jza I;
    public int I0;
    public jza J;
    public jza K;
    public jza L;
    public jza M;
    public jza N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;
    public z82 S;
    public wya T;
    public u46 U;
    public final ir V;
    public s09 W;
    public bza X;
    public xya Y;
    public wza Z;
    public TLRPC.ChatFull a;
    public mg0 a0;
    public final long b;
    public LinearLayout b0;
    public boolean c;
    public final boolean c0;
    public jza d;
    public final boolean d0;
    public jza e;
    public final boolean e0;
    public sza f;
    public long f0;
    public long g0;
    public jza h;
    public final he[] h0;
    public uya i0;
    public sh1 j0;
    public ik1 k0;
    public View l0;
    public FrameLayout m0;
    public jza n;
    public fn0 n0;
    public final boolean o0;
    public ej6 p0;
    public FrameLayout q0;
    public jza r;
    public qz4[] r0;
    public jza s;
    public int s0;
    public final SparseIntArray t0;
    public final SparseIntArray u0;
    public final ArrayList v0;
    public jza w;
    public final ArrayList w0;
    public jza x;
    public final ArrayList x0;
    public jza y;
    public final ArrayList y0;
    public final ArrayList z0;

    public xza(Bundle bundle) {
        super(bundle);
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.V = new ir(50);
        this.h0 = new he[1];
        this.s0 = -1;
        this.t0 = new SparseIntArray();
        this.u0 = new SparseIntArray();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.z0 = new ArrayList();
        this.B0 = true;
        this.F0 = new zka(this, (byte) 2);
        long j = bundle.getLong("chat_id");
        this.b = j;
        this.c0 = bundle.getBoolean("is_megagroup", false);
        this.d0 = bundle.getBoolean("start_from_boosts", false);
        this.e0 = bundle.getBoolean("start_from_monetization", false);
        this.o0 = bundle.getBoolean("only_boosts", false);
        this.a = getMessagesController().M0(j);
    }

    public static d e0(TLRPC.Chat chat, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z);
        TLRPC.ChatFull M0 = oc7.r1(z8c.t0).M0(chat.id);
        if (M0 != null && (M0.can_view_stats || M0.can_view_stars_revenue)) {
            return new xza(bundle);
        }
        return new lp0(-chat.id);
    }

    public static nl1 f0(JSONObject jSONObject, int i, boolean z) {
        if (i == 0) {
            return new nl1(jSONObject);
        }
        if (i == 1) {
            return new nl1(jSONObject);
        }
        if (i == 2) {
            ?? nl1Var = new nl1(jSONObject);
            int length = ((ml1) nl1Var.d.get(0)).a.length;
            int size = nl1Var.d.size();
            nl1Var.l = new long[length];
            int i2 = 0;
            while (true) {
                long[] jArr = nl1Var.l;
                if (i2 < length) {
                    jArr[i2] = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        long[] jArr2 = nl1Var.l;
                        jArr2[i2] = jArr2[i2] + ((ml1) nl1Var.d.get(i3)).a[i2];
                    }
                    i2++;
                } else {
                    nl1Var.m = new mj4(jArr);
                    return nl1Var;
                }
            }
        } else if (i == 4) {
            ?? nl1Var2 = new nl1(jSONObject);
            if (z) {
                long[] jArr3 = new long[nl1Var2.d.size()];
                int[] iArr = new int[nl1Var2.d.size()];
                long j = 0;
                for (int i4 = 0; i4 < nl1Var2.d.size(); i4++) {
                    int length2 = nl1Var2.a.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        long j2 = ((ml1) nl1Var2.d.get(i4)).a[i5];
                        jArr3[i4] = jArr3[i4] + j2;
                        if (j2 == 0) {
                            iArr[i4] = iArr[i4] + 1;
                        }
                    }
                    j += jArr3[i4];
                }
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < nl1Var2.d.size(); i6++) {
                    if (jArr3[i6] / j < 0.01d && iArr[i6] > nl1Var2.a.length / 2.0f) {
                        arrayList.add((ml1) nl1Var2.d.get(i6));
                    }
                }
                int size2 = arrayList.size();
                int i7 = 0;
                while (i7 < size2) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    nl1Var2.d.remove((ml1) obj);
                }
            }
            int length3 = ((ml1) nl1Var2.d.get(0)).a.length;
            int size3 = nl1Var2.d.size();
            nl1Var2.l = new long[length3];
            int i8 = 0;
            while (true) {
                long[] jArr4 = nl1Var2.l;
                if (i8 < length3) {
                    jArr4[i8] = 0;
                    for (int i9 = 0; i9 < size3; i9++) {
                        long[] jArr5 = nl1Var2.l;
                        jArr5[i8] = jArr5[i8] + ((ml1) nl1Var2.d.get(i9)).a[i8];
                    }
                    i8++;
                } else {
                    new mj4(jArr4);
                    return nl1Var2;
                }
            }
        } else {
            return null;
        }
    }

    public static jza g0(TL_stats.StatsGraph statsGraph, String str, int i, boolean z) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        jza jzaVar = new jza(str, i);
        jzaVar.m = z;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                nl1 f0 = f0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i, z);
                jzaVar.d = f0;
                if (f0 != null) {
                    f0.h = statsGraph.rate;
                }
                jzaVar.g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (f0 == null || (jArr2 = f0.a) == null || jArr2.length < 2) {
                    jzaVar.l = true;
                }
                if (i == 4 && f0 != null && (jArr = f0.a) != null && jArr.length > 0) {
                    long j = jArr[jArr.length - 1];
                    jzaVar.e = new moa(f0, j);
                    jzaVar.c = j;
                    return jzaVar;
                }
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            jzaVar.f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return jzaVar;
    }

    public static void n0(jza jzaVar, ArrayList arrayList, bnb bnbVar) {
        nl1 nl1Var;
        int i;
        if (jzaVar != null && (nl1Var = jzaVar.d) != null) {
            ArrayList arrayList2 = nl1Var.d;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                ml1 ml1Var = (ml1) obj;
                int i3 = ml1Var.g;
                if (i3 >= 0) {
                    if (!cmb.d1(i3)) {
                        int i4 = ml1Var.g;
                        if (cmb.I == cmb.J) {
                            i = ml1Var.i;
                        } else {
                            i = ml1Var.h;
                        }
                        cmb.y1(i4, i, false);
                        cmb.gm[ml1Var.g] = ml1Var.h;
                    }
                    arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, ml1Var.g));
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.o7));
        hashSet.add(Integer.valueOf(cmb.u6));
        hashSet.add(Integer.valueOf(cmb.t6));
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.hk));
        hashSet.add(Integer.valueOf(cmb.w6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.g5));
        hashSet.add(Integer.valueOf(cmb.Tj));
        hashSet.add(Integer.valueOf(cmb.Sj));
        hashSet.add(Integer.valueOf(cmb.Rj));
        hashSet.add(Integer.valueOf(cmb.Qj));
        hashSet.add(Integer.valueOf(cmb.Pj));
        hashSet.add(Integer.valueOf(cmb.Oj));
        hashSet.add(Integer.valueOf(cmb.i5));
        hashSet.add(Integer.valueOf(cmb.z6));
    }

    public final void c0() {
        wza wzaVar = this.Z;
        if (wzaVar != null) {
            wzaVar.b = true;
        }
        int childCount = this.T.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.T.getChildAt(i);
            if (childAt instanceof iza) {
                ((iza) childAt).b.u0.d(false, true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        boolean z;
        boolean z2;
        FrameLayout frameLayout;
        int i;
        boolean z3;
        String str;
        int i2;
        boolean z4;
        xza xzaVar = this;
        xzaVar.setHasOwnBackground(true);
        xzaVar.a0 = new mg0((ylb) null);
        oc7 r1 = oc7.r1(xzaVar.currentAccount);
        long j = xzaVar.b;
        TLRPC.Chat L0 = r1.L0(Long.valueOf(j));
        TLRPC.ChatFull M0 = oc7.r1(xzaVar.currentAccount).M0(j);
        if (M0 != null && M0.can_view_stats) {
            z = true;
        } else {
            z = false;
        }
        boolean R = sd2.R(L0);
        if (M0 != null && (M0.can_view_revenue || M0.can_view_stars_revenue)) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList = new ArrayList(3);
        if (z) {
            arrayList.add(qz4.c(context, xzaVar.resourceProvider, pz4.I, 2131744581));
        }
        arrayList.add(qz4.c(context, xzaVar.resourceProvider, pz4.O, 2131753128));
        if (z2) {
            arrayList.add(qz4.c(context, xzaVar.resourceProvider, pz4.P, 2131748164));
        }
        xzaVar.r0 = (qz4[]) arrayList.toArray(new qz4[0]);
        ej6 ej6Var = new ej6(context, xzaVar.resourceProvider);
        xzaVar.p0 = ej6Var;
        ej6Var.setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(12.0f));
        xzaVar.p0.setMaxWidth(gm.L(344.0f));
        xzaVar.p0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        xzaVar.q0 = frameLayout2;
        frameLayout2.setOnClickListener(new x10((byte) 1));
        xzaVar.q0.addView(xzaVar.p0, qoe.e(-1, 72, 81));
        xzaVar.q0.setClipToPadding(false);
        int i3 = 0;
        while (true) {
            qz4[] qz4VarArr = xzaVar.r0;
            if (i3 >= qz4VarArr.length) {
                break;
            }
            qz4 qz4Var = qz4VarArr[i3];
            qz4Var.setOnClickListener(new v0(xzaVar, i3, (byte) 25));
            xzaVar.p0.addView(xzaVar.r0[i3]);
            xzaVar.p0.j(qz4Var, true, false);
            i3++;
        }
        xzaVar.i0 = new uya(xzaVar, xzaVar.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            sh1 sh1Var = new sh1(xzaVar, -j, xzaVar.getResourceProvider());
            xzaVar.j0 = sh1Var;
            sh1Var.G.setCaptureSectionsDecoratorAllowed(true);
            xzaVar.glassEngine.b(xzaVar.j0.G);
        }
        if (z2) {
            Activity parentActivity = xzaVar.getParentActivity();
            int i4 = xzaVar.currentAccount;
            long j2 = -j;
            frameLayout = frameLayout3;
            ylb resourceProvider = xzaVar.getResourceProvider();
            sy4 sy4Var = xzaVar.glassEngine;
            if (sd2.V(L0) && M0.can_view_revenue) {
                z4 = true;
            } else {
                z4 = false;
            }
            i = -1;
            ik1 ik1Var = new ik1(parentActivity, xzaVar, i4, j2, resourceProvider, sy4Var, z4, M0.can_view_stars_revenue);
            xzaVar = xzaVar;
            xzaVar.k0 = ik1Var;
            ik1Var.X0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i = -1;
        }
        boolean z5 = z;
        FrameLayout frameLayout4 = frameLayout;
        xzaVar.i0.setAdapter(new vya(xzaVar, z5, R, z2, frameLayout4));
        boolean z6 = xzaVar.o0;
        if (R && !z6) {
            z3 = true;
        } else {
            z3 = false;
        }
        xzaVar.c = z3;
        if (z3) {
            if (xzaVar.d0) {
                xzaVar.i0.setPosition(z5 ? 1 : 0);
            } else if (xzaVar.e0) {
                uya uyaVar = xzaVar.i0;
                if (!z6 && R) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                uyaVar.setPosition(i2 + (z5 ? 1 : 0));
            }
        }
        xzaVar.p0(xzaVar.i0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(xzaVar.getParentActivity());
        frameLayout5.addView(xzaVar.i0, qoe.g());
        View view = new View(context);
        xzaVar.l0 = view;
        frameLayout5.addView(view, qoe.e(i, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        xzaVar.m0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(xzaVar.m0, qoe.g());
        frameLayout5.addView(xzaVar.simpleActionBar);
        if (xzaVar.c) {
            xzaVar.setBulletinDelegate(new oz((byte) 12));
            xzaVar.q0.setBackground(xzaVar.getBaseSimpleGlass().b(xzaVar.q0));
            frameLayout5.addView(xzaVar.q0, qoe.e(i, -2, 80));
        }
        xzaVar.fragmentView = frameLayout5;
        wya wyaVar = new wya(xzaVar, context);
        xzaVar.T = wyaVar;
        wyaVar.setCaptureSectionsDecoratorAllowed(true);
        xzaVar.T.setSections(true);
        xzaVar.T.setClipToPadding(false);
        xzaVar.glassEngine.b(xzaVar.T);
        xzaVar.T.r1();
        LinearLayout linearLayout = new LinearLayout(context);
        xzaVar.b0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        xzaVar.W = imageView;
        imageView.setAutoRepeat(true);
        xzaVar.W.f(2131624223, 120, 120, null);
        xzaVar.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        int i5 = cmb.Ej;
        anb.X(textView, i5, null);
        textView.setTag(Integer.valueOf(i5));
        textView.setText(jb6.M0(2131748534, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i6 = cmb.Fj;
        anb.X(textView2, i6, null);
        textView2.setTag(Integer.valueOf(i6));
        textView2.setText(jb6.M0(2131748533, null));
        textView2.setGravity(1);
        xzaVar.b0.addView(xzaVar.W, qoe.t(120, 120, 1, 0, 0, 0, 20));
        xzaVar.b0.addView(textView, qoe.t(-2, -2, 1, 0, 0, 0, 10));
        xzaVar.b0.addView(textView2, qoe.r(-2, -2, 1));
        frameLayout4.addView(xzaVar.b0, qoe.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        bza bzaVar = xzaVar.X;
        if (bzaVar == null) {
            bzaVar = new bza(xzaVar);
            xzaVar.X = bzaVar;
        }
        xzaVar.T.setAdapter(bzaVar);
        u46 u46Var = new u46();
        xzaVar.U = u46Var;
        xzaVar.T.setLayoutManager(u46Var);
        xzaVar.Y = new sc3();
        xzaVar.T.setItemAnimator(null);
        xzaVar.T.j(new so7(xzaVar, (byte) 29));
        xzaVar.T.setOnItemClickListener(new s19(xzaVar, (byte) 16));
        xzaVar.T.setOnItemLongClickListener(new tya(xzaVar));
        frameLayout4.addView(xzaVar.T);
        xzaVar.S = new z82(context, null, false, null);
        TLRPC.Chat L02 = xzaVar.getMessagesController().L0(Long.valueOf(j));
        xzaVar.S.setChatAvatar(L02);
        xzaVar.simpleActionBar.setBackButtonDrawable(new ee0(false));
        rja rjaVar = xzaVar.simpleActionBar;
        if (L02 == null) {
            str = "";
        } else {
            str = L02.title;
        }
        rjaVar.setTitle(str);
        xzaVar.simpleActionBar.setActionBarMenuOnItemClick(new im8(xzaVar, (byte) 16));
        xzaVar.S.i(cmb.w0(null, i5, false), cmb.w0(null, i6, false));
        boolean z7 = xzaVar.B0;
        zka zkaVar = xzaVar.F0;
        if (z7) {
            xzaVar.b0.setAlpha(0.0f);
            gm.d3(zkaVar, 500L);
            xzaVar.b0.setVisibility(0);
            xzaVar.T.setVisibility(8);
        } else {
            gm.r(zkaVar);
            xzaVar.b0.setVisibility(8);
            xzaVar.T.setVisibility(0);
        }
        im0 c = xzaVar.getBaseSimpleGlass().c.c(xzaVar.p0, qqd.g(xzaVar.resourceProvider), false);
        wi8.r(c, gm.L(28.0f), 7.666f);
        xzaVar.p0.setBackground(c);
        xzaVar.glassEngine.c(xzaVar.i0);
        eh0 baseSimpleGlass = xzaVar.getBaseSimpleGlass();
        uya uyaVar2 = xzaVar.i0;
        rja rjaVar2 = xzaVar.simpleActionBar;
        ylb ylbVar = xzaVar.resourceProvider;
        baseSimpleGlass.m = frameLayout5;
        baseSimpleGlass.n = uyaVar2;
        baseSimpleGlass.a.c(uyaVar2);
        baseSimpleGlass.h(frameLayout5, rjaVar2, ylbVar);
        xzaVar.n0 = new fn0(0, new tya(xzaVar), d53.h, 380L, false);
        ik1 ik1Var2 = xzaVar.k0;
        if (ik1Var2 != null) {
            eh0 baseSimpleGlass2 = xzaVar.getBaseSimpleGlass();
            View view2 = ik1Var2.a1.d;
            im0 c2 = baseSimpleGlass2.c.c(view2, null, false);
            c2.p(qqd.l(ik1Var2.n0));
            c2.q(gm.L(9.66f));
            c2.r(gm.L(18.0f));
            view2.setBackground(c2);
            View transactionTabs = xzaVar.k0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            gm.B2(transactionTabs);
            xzaVar.m0.addView(transactionTabs, layoutParams);
            xzaVar.k0.setTabsPinnedChangedListener(new nsa(xzaVar, (byte) 6));
            xzaVar.n0.a(xzaVar.k0.f0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new cc(xzaVar, (byte) 8));
        xzaVar.getBaseSimpleGlass().o = new ai3(xzaVar, frameLayout5, new je(frameLayout5, (byte) 2), (byte) 1);
        xzaVar.getBaseSimpleGlass().n = null;
        xzaVar.simpleActionBar.setBackground(null);
        xzaVar.l0.setBackground(xzaVar.getBaseSimpleGlass().a(xzaVar.l0));
        gm.B2(xzaVar.S.e);
        frameLayout5.addView(xzaVar.S.e, qoe.e(42, 42, 53));
        xzaVar.d0();
        xzaVar.fragmentView.setBackgroundColor(xzaVar.getThemedColor(cmb.Z6));
        xzaVar.C0 = new kza(xzaVar.X, xzaVar.U);
        return xzaVar.fragmentView;
    }

    public final void d0() {
        int i;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        if (this.l0 != null) {
            int L = gm.L(44.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
            ViewGroup.LayoutParams layoutParams = this.l0.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.l0.setLayoutParams(layoutParams);
            }
            t0();
        }
        if (this.c) {
            i = gm.L(72.0f);
        } else {
            i = 0;
        }
        gm.v3(this.S.e, 0, ((a.getCurrentActionBarHeight() - gm.L(42.0f)) / 2) + this.mSystemInsets.b, gm.L(6.0f), 0);
        this.q0.setPadding(0, 0, 0, this.mSystemInsets.d);
        wya wyaVar = this.T;
        if (wyaVar != null) {
            iq5 iq5Var = this.mSystemInsets;
            eh0.e(wyaVar, iq5Var.b, iq5Var.d, currentActionBarHeight, i);
        }
        sh1 sh1Var = this.j0;
        if (sh1Var != null) {
            r59 r59Var = sh1Var.G;
            iq5 iq5Var2 = this.mSystemInsets;
            eh0.e(r59Var, iq5Var2.b, iq5Var2.d, currentActionBarHeight, i);
        }
        ik1 ik1Var = this.k0;
        if (ik1Var != null) {
            iq5 iq5Var3 = this.mSystemInsets;
            int i2 = iq5Var3.b;
            int i3 = iq5Var3.d;
            ik1Var.U0 = i2;
            ik1Var.V0 = i3;
            ik1Var.W0 = i;
            int x = b10.x(48.0f, i2, -gm.L(8.0f));
            int x2 = b10.x(48.0f, i3, -gm.L(8.0f));
            q7c q7cVar = ik1Var.X0;
            gm.v3(q7cVar, 0, x, 0, x2);
            q7cVar.setPadding(q7cVar.getPaddingLeft(), (a.getCurrentActionBarHeight() + i2) - x, q7cVar.getPaddingRight(), (i3 + i) - x2);
            ik1Var.A(-x, -x2);
            ik1Var.C();
            ik1Var.requestLayout();
            ik1Var.invalidate();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ArrayList arrayList;
        d dVar;
        d dVar2;
        d dVar3 = null;
        int i3 = 0;
        if (i == nm7.B5) {
            if (((z3b) objArr[0]) == this.D0) {
                m0();
                r0();
                if (this.X != null) {
                    this.T.setItemAnimator(null);
                    this.C0.e();
                }
            }
        } else if (i == nm7.X2) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    dVar = (d) aq1.m(2, fragmentStack);
                } else {
                    dVar = null;
                }
                if (dVar instanceof ba2) {
                    ((ActionBarLayout) getParentLayout()).c0(dVar, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    dVar2 = (d) aq1.m(2, fragmentStack2);
                } else {
                    dVar2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        dVar3 = (d) aq1.m(3, fragmentStack2);
                    }
                    if (dVar2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).c0(dVar2, false);
                    }
                    finishFragment();
                    if (dVar3 instanceof yv1) {
                        yn0.f(dVar3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (dVar2 instanceof ProfileActivity) {
                    yn0.f(dVar2, chat, false);
                }
            }
        } else if (i == nm7.C) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i4 = 0;
                while (true) {
                    arrayList = this.v0;
                    if (i4 >= size) {
                        break;
                    }
                    k47 k47Var = (k47) arrayList2.get(i4);
                    int i5 = this.t0.get(k47Var.e1(), -1);
                    if (i5 >= 0 && ((uza) arrayList.get(i5)).b() == k47Var.e1()) {
                        if (k47Var.Z) {
                            arrayList3.add((uza) arrayList.get(i5));
                        } else {
                            ((uza) arrayList.get(i5)).b = k47Var;
                        }
                    }
                    i4++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.w0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    uza uzaVar = (uza) arrayList.get(i3);
                    if (uzaVar.b == null) {
                        this.s0 = uzaVar.b();
                        break;
                    } else {
                        arrayList4.add(uzaVar);
                        i3++;
                    }
                }
                if (arrayList4.size() < 20) {
                    k0();
                }
                r0();
                if (this.X != null) {
                    this.T.setItemAnimator(null);
                    this.C0.e();
                }
            }
        } else if (i == nm7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.b && this.a == null) {
                this.a = chatFull;
                l0();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        jza jzaVar;
        jza jzaVar2;
        t10 t10Var = new t10(this, (byte) 19);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        arrayList.add(new cnb(this.T, 0, new Class[]{pl1.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.i5));
        if (this.c0) {
            while (i < 6) {
                if (i == 0) {
                    jzaVar2 = this.d;
                } else if (i == 1) {
                    jzaVar2 = this.I;
                } else if (i == 2) {
                    jzaVar2 = this.J;
                } else if (i == 3) {
                    jzaVar2 = this.K;
                } else if (i == 4) {
                    jzaVar2 = this.L;
                } else {
                    jzaVar2 = this.M;
                }
                n0(jzaVar2, arrayList, t10Var);
                i++;
            }
        } else {
            while (i < 12) {
                if (i == 0) {
                    jzaVar = this.d;
                } else if (i == 1) {
                    jzaVar = this.h;
                } else if (i == 2) {
                    jzaVar = this.n;
                } else if (i == 3) {
                    jzaVar = this.r;
                } else if (i == 4) {
                    jzaVar = this.s;
                } else if (i == 5) {
                    jzaVar = this.w;
                } else if (i == 6) {
                    jzaVar = this.y;
                } else if (i == 7) {
                    jzaVar = this.e;
                } else if (i == 8) {
                    jzaVar = this.x;
                } else if (i == 9) {
                    jzaVar = this.E;
                } else if (i == 10) {
                    jzaVar = this.F;
                } else {
                    jzaVar = this.G;
                }
                n0(jzaVar, arrayList, t10Var);
                i++;
            }
        }
        return arrayList;
    }

    public final void h0(jza[] jzaVarArr) {
        bza bzaVar = this.X;
        if (bzaVar != null) {
            bzaVar.E();
            this.T.setItemAnimator(null);
            this.X.f();
        }
        this.B0 = false;
        LinearLayout linearLayout = this.b0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            gm.r(this.F0);
            this.b0.animate().alpha(0.0f).setDuration(230L).setListener(new c39(this, (byte) 23));
            this.T.setVisibility(0);
            this.T.setAlpha(0.0f);
            this.T.animate().alpha(1.0f).setDuration(230L).start();
            for (jza jzaVar : jzaVarArr) {
                if (jzaVar != null && jzaVar.d == null && jzaVar.f != null) {
                    jzaVar.a(this.currentAccount, this.classGuid, this.a.stats_dc, new sp1(this, jzaVar, (byte) 1));
                }
            }
        }
    }

    public final void i0(TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i = 0; i < arrayList2.size(); i++) {
                arrayList.add(new k47(this.currentAccount, arrayList2.get(i), false, true));
            }
            getMessagesStorage().g1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        gm.c3(new qya(this, arrayList, (byte) 1));
    }

    @Override
    public final boolean isLightStatusBar() {
        if (on2.h(cmb.w0(null, cmb.c6, false)) <= 0.699999988079071d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        uya uyaVar;
        if (motionEvent != null && this.k0 != null && (uyaVar = this.i0) != null) {
            View currentView = uyaVar.getCurrentView();
            ik1 ik1Var = this.k0;
            if (currentView == ik1Var && ik1Var.H((motionEvent.getX() - this.i0.getX()) - this.k0.getX(), (motionEvent.getY() - this.i0.getY()) - this.k0.getY())) {
                return false;
            }
        }
        uya uyaVar2 = this.i0;
        if (uyaVar2 != null && (uyaVar2.b != 0 || uyaVar2.c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0(TLObject tLObject) {
        final xza xzaVar;
        ?? r10;
        String str;
        String str2;
        float abs;
        boolean z;
        float abs2;
        boolean z2;
        float abs3;
        boolean z3;
        float abs4;
        boolean z4;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        float abs5;
        boolean z5;
        float abs6;
        boolean z6;
        float abs7;
        boolean z7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            final jza[] jzaVarArr = {g0(tL_broadcastStats.iv_interactions_graph, jb6.M0(2131749030, "IVInteractionsChartTitle"), 1, false), g0(tL_broadcastStats.followers_graph, jb6.M0(2131750542, "FollowersChartTitle"), 0, false), g0(tL_broadcastStats.top_hours_graph, jb6.M0(2131743719, "TopHoursChartTitle"), 0, false), g0(tL_broadcastStats.interactions_graph, jb6.M0(2131743214, "ViewsAndSharesChartTitle"), 1, false), g0(tL_broadcastStats.growth_graph, jb6.M0(2131749132, "GrowthChartTitle"), 0, false), g0(tL_broadcastStats.views_by_source_graph, jb6.M0(2131743213, "ViewsBySourceChartTitle"), 2, false), g0(tL_broadcastStats.new_followers_by_source_graph, jb6.M0(2131748031, "NewFollowersBySourceChartTitle"), 2, false), g0(tL_broadcastStats.languages_graph, jb6.M0(2131748798, "LanguagesChartTitle"), 4, true), g0(tL_broadcastStats.mute_graph, jb6.M0(2131747653, "NotificationsChartTitle"), 0, false), g0(tL_broadcastStats.reactions_by_emotion_graph, jb6.M0(2131746118, "ReactionsByEmotionChartTitle"), 2, false), g0(tL_broadcastStats.story_interactions_graph, jb6.M0(2131744345, "StoryInteractionsChartTitle"), 1, false), g0(tL_broadcastStats.story_reactions_by_emotion_graph, jb6.M0(2131744190, "StoryReactionsByEmotionChartTitle"), 2, false)};
            jza jzaVar = jzaVarArr[2];
            if (jzaVar != null) {
                jzaVar.n = true;
            }
            ?? obj = new Object();
            xvc a = sza.a(tL_broadcastStats.reactions_per_post);
            str2 = "+";
            obj.o = jb6.M0(2131746111, "ReactionsPerPost");
            obj.p = (String) a.b;
            obj.q = (String) a.c;
            obj.r = ((Boolean) a.d).booleanValue();
            obj.s = ((Boolean) a.e).booleanValue();
            xvc a2 = sza.a(tL_broadcastStats.reactions_per_story);
            obj.t = jb6.M0(2131746110, "ReactionsPerStory");
            obj.u = (String) a2.b;
            obj.v = (String) a2.c;
            obj.w = ((Boolean) a2.d).booleanValue();
            obj.x = ((Boolean) a2.e).booleanValue();
            xvc a3 = sza.a(tL_broadcastStats.views_per_story);
            obj.y = jb6.M0(2131743211, "ViewsPerStory");
            obj.z = (String) a3.b;
            obj.A = (String) a3.c;
            obj.B = ((Boolean) a3.d).booleanValue();
            obj.C = ((Boolean) a3.e).booleanValue();
            xvc a4 = sza.a(tL_broadcastStats.shares_per_story);
            obj.D = jb6.M0(2131745131, "SharesPerStory");
            obj.E = (String) a4.b;
            obj.F = (String) a4.c;
            obj.G = ((Boolean) a4.d).booleanValue();
            obj.H = ((Boolean) a4.e).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            String str15 = "TopHoursChartTitle";
            double d = tL_statsAbsValueAndPrev.current;
            double d2 = tL_statsAbsValueAndPrev.previous;
            int i2 = (int) (d - d2);
            if (d2 == 0.0d) {
                abs5 = 0.0f;
            } else {
                abs5 = Math.abs((i2 / ((float) d2)) * 100.0f);
            }
            obj.a = jb6.M0(2131750542, "FollowersChartTitle");
            obj.b = gm.o0((int) tL_broadcastStats.followers.current, 0);
            if (i2 != 0 && abs5 != 0.0f) {
                int i3 = (int) abs5;
                if (abs5 == i3) {
                    Locale locale = Locale.ENGLISH;
                    if (i2 <= 0) {
                        str14 = "";
                    } else {
                        str14 = str2;
                    }
                    obj.c = (str14 + gm.o0(i2, 0)) + " (" + i3 + "%)";
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    if (i2 <= 0) {
                        str13 = "";
                    } else {
                        str13 = str2;
                    }
                    obj.c = String.format(locale2, "%s (%.1f%s)", str13 + gm.o0(i2, 0), Float.valueOf(abs5), "%");
                }
            } else {
                obj.c = "";
            }
            if (i2 >= 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            obj.d = z5;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d3 = tL_statsAbsValueAndPrev2.current;
            double d4 = tL_statsAbsValueAndPrev2.previous;
            int i4 = (int) (d3 - d4);
            if (d4 == 0.0d) {
                abs6 = 0.0f;
            } else {
                abs6 = Math.abs((i4 / ((float) d4)) * 100.0f);
            }
            obj.i = jb6.M0(2131745132, "SharesPerPost");
            obj.j = gm.o0((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i4 != 0 && abs6 != 0.0f) {
                int i5 = (int) abs6;
                if (abs6 == i5) {
                    Locale locale3 = Locale.ENGLISH;
                    if (i4 <= 0) {
                        str12 = "";
                    } else {
                        str12 = str2;
                    }
                    obj.k = (str12 + gm.o0(i4, 0)) + " (" + i5 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    if (i4 <= 0) {
                        str11 = "";
                    } else {
                        str11 = str2;
                    }
                    obj.k = String.format(locale4, "%s (%.1f%s)", str11 + gm.o0(i4, 0), Float.valueOf(abs6), "%");
                }
            } else {
                obj.k = "";
            }
            if (i4 >= 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            obj.l = z6;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d5 = tL_statsAbsValueAndPrev3.current;
            double d6 = tL_statsAbsValueAndPrev3.previous;
            int i6 = (int) (d5 - d6);
            if (d6 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i6 / ((float) d6)) * 100.0f);
            }
            obj.e = jb6.M0(2131743212, "ViewsPerPost");
            obj.f = gm.o0((int) tL_broadcastStats.views_per_post.current, 0);
            if (i6 != 0 && abs7 != 0.0f) {
                int i7 = (int) abs7;
                if (abs7 == i7) {
                    Locale locale5 = Locale.ENGLISH;
                    if (i6 <= 0) {
                        str10 = "";
                    } else {
                        str10 = str2;
                    }
                    obj.g = (str10 + gm.o0(i6, 0)) + " (" + i7 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    if (i6 <= 0) {
                        str9 = "";
                    } else {
                        str9 = str2;
                    }
                    obj.g = String.format(locale6, "%s (%.1f%s)", str9 + gm.o0(i6, 0), Float.valueOf(abs7), "%");
                }
            } else {
                obj.g = "";
            }
            if (i6 >= 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            obj.h = z7;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.m = jb6.M0(2131751080, "EnabledNotifications");
            int i8 = (int) f;
            if (f == i8) {
                Locale locale7 = Locale.ENGLISH;
                obj.n = aq1.n(i8, "%");
            } else {
                obj.n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f), "%");
            }
            xzaVar = this;
            xzaVar.f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            xzaVar.f0 = tL_statsDateRangeDays.max_date * 1000;
            xzaVar.g0 = tL_statsDateRangeDays.min_date * 1000;
            ArrayList arrayList3 = xzaVar.v0;
            arrayList3.clear();
            ArrayList arrayList4 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList5 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList5.size();
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList5.get(i11);
                int i12 = i11 + 1;
                ArrayList<TL_stats.PostInteractionCounters> arrayList6 = arrayList5;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                int i13 = size;
                ?? obj2 = new Object();
                obj2.a = postInteractionCounters2;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList3.add(obj2);
                    str8 = str15;
                    xzaVar.t0.put(obj2.b(), i9);
                    i9++;
                } else {
                    str8 = str15;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList4.add(Integer.valueOf(obj2.b()));
                    xzaVar.x0.add(obj2);
                    xzaVar.u0.put(obj2.b(), i10);
                    i10++;
                }
                size = i13;
                arrayList5 = arrayList6;
                i11 = i12;
                str15 = str8;
            }
            str = str15;
            gm.c3(new qya(xzaVar, arrayList4, (byte) 0));
            if (arrayList3.size() > 0) {
                int b = ((uza) arrayList3.get(0)).b();
                int size2 = arrayList3.size();
                cf7 messagesStorage = xzaVar.getMessagesStorage();
                int i14 = xzaVar.classGuid;
                messagesStorage.getClass();
                messagesStorage.a.c(new uc7(messagesStorage, rqb.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, -xzaVar.b, 0L, size2, b, 0, 0, i14, 0, 0, 0L, 0, true, false));
            }
            r10 = 0;
            gm.c3(new Runnable(xzaVar) {
                public final xza b;

                {
                    this.b = xzaVar;
                }

                @Override
                public final void run() {
                    byte b2 = r3;
                    jza[] jzaVarArr2 = jzaVarArr;
                    xza xzaVar2 = this.b;
                    xzaVar2.getClass();
                    switch (b2) {
                        case 0:
                            xzaVar2.r = jzaVarArr2[0];
                            xzaVar2.h = jzaVarArr2[1];
                            xzaVar2.e = jzaVarArr2[2];
                            xzaVar2.n = jzaVarArr2[3];
                            xzaVar2.d = jzaVarArr2[4];
                            xzaVar2.s = jzaVarArr2[5];
                            xzaVar2.w = jzaVarArr2[6];
                            xzaVar2.x = jzaVarArr2[7];
                            xzaVar2.y = jzaVarArr2[8];
                            xzaVar2.E = jzaVarArr2[9];
                            xzaVar2.F = jzaVarArr2[10];
                            xzaVar2.G = jzaVarArr2[11];
                            xzaVar2.h0(jzaVarArr2);
                            return;
                        default:
                            xzaVar2.d = jzaVarArr2[0];
                            xzaVar2.I = jzaVarArr2[1];
                            xzaVar2.J = jzaVarArr2[2];
                            xzaVar2.K = jzaVarArr2[3];
                            xzaVar2.L = jzaVarArr2[4];
                            xzaVar2.M = jzaVarArr2[5];
                            xzaVar2.e = jzaVarArr2[6];
                            xzaVar2.N = jzaVarArr2[7];
                            xzaVar2.h0(jzaVarArr2);
                            return;
                    }
                }
            });
        } else {
            xzaVar = this;
            r10 = 0;
            str = "TopHoursChartTitle";
            str2 = "+";
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            jza g0 = g0(tL_megagroupStats.growth_graph, jb6.M0(2131749132, "GrowthChartTitle"), r10, r10);
            jza g02 = g0(tL_megagroupStats.members_graph, jb6.M0(2131749184, "GroupMembersChartTitle"), r10, r10);
            jza g03 = g0(tL_megagroupStats.new_members_by_source_graph, jb6.M0(2131748028, "NewMembersBySourceChartTitle"), 2, r10);
            jza g04 = g0(tL_megagroupStats.languages_graph, jb6.M0(2131748375, "MembersLanguageChartTitle"), 4, true);
            jza g05 = g0(tL_megagroupStats.messages_graph, jb6.M0(2131748219, "MessagesChartTitle"), 2, r10);
            jza g06 = g0(tL_megagroupStats.actions_graph, jb6.M0(2131754486, "ActionsChartTitle"), 1, r10);
            jza g07 = g0(tL_megagroupStats.top_hours_graph, jb6.M0(2131743719, str), r10, r10);
            jza g08 = g0(tL_megagroupStats.weekdays_graph, jb6.M0(2131743720, "TopDaysOfWeekChartTitle"), 4, r10);
            final jza[] jzaVarArr2 = new jza[8];
            jzaVarArr2[r10] = g0;
            jzaVarArr2[1] = g02;
            jzaVarArr2[2] = g03;
            jzaVarArr2[3] = g04;
            jzaVarArr2[4] = g05;
            jzaVarArr2[5] = g06;
            jzaVarArr2[6] = g07;
            jzaVarArr2[7] = g08;
            jza jzaVar2 = jzaVarArr2[6];
            if (jzaVar2 != null) {
                jzaVar2.n = true;
            }
            jza jzaVar3 = jzaVarArr2[7];
            if (jzaVar3 != null) {
                jzaVar3.o = true;
            }
            ?? obj3 = new Object();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d7 = tL_statsAbsValueAndPrev4.current;
            double d8 = tL_statsAbsValueAndPrev4.previous;
            int i15 = (int) (d7 - d8);
            if (d8 == 0.0d) {
                abs = 0.0f;
            } else {
                abs = Math.abs((i15 / ((float) d8)) * 100.0f);
            }
            obj3.a = jb6.M0(2131748374, "MembersOverviewTitle");
            obj3.b = gm.o0((int) tL_megagroupStats.members.current, 0);
            if (i15 != 0 && abs != 0.0f) {
                int i16 = (int) abs;
                if (abs == i16) {
                    Locale locale8 = Locale.ENGLISH;
                    if (i15 <= 0) {
                        str7 = "";
                    } else {
                        str7 = str2;
                    }
                    obj3.c = (str7 + gm.o0(i15, 0)) + " (" + i16 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    if (i15 <= 0) {
                        str6 = "";
                    } else {
                        str6 = str2;
                    }
                    obj3.c = String.format(locale9, "%s (%.1f%s)", str6 + gm.o0(i15, 0), Float.valueOf(abs), "%");
                }
            } else {
                obj3.c = "";
            }
            if (i15 >= 0) {
                z = true;
            } else {
                z = false;
            }
            obj3.d = z;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d9 = tL_statsAbsValueAndPrev5.current;
            double d10 = tL_statsAbsValueAndPrev5.previous;
            int i17 = (int) (d9 - d10);
            if (d10 == 0.0d) {
                abs2 = 0.0f;
            } else {
                abs2 = Math.abs((i17 / ((float) d10)) * 100.0f);
            }
            obj3.i = jb6.M0(2131743216, "ViewingMembers");
            obj3.j = gm.o0((int) tL_megagroupStats.viewers.current, 0);
            if (i17 != 0 && abs2 != 0.0f) {
                Locale locale10 = Locale.ENGLISH;
                if (i17 <= 0) {
                    str5 = "";
                } else {
                    str5 = str2;
                }
                obj3.k = str5 + gm.o0(i17, 0);
            } else {
                obj3.k = "";
            }
            if (i17 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            obj3.l = z2;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d11 = tL_statsAbsValueAndPrev6.current;
            double d12 = tL_statsAbsValueAndPrev6.previous;
            int i18 = (int) (d11 - d12);
            if (d12 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i18 / ((float) d12)) * 100.0f);
            }
            obj3.m = jb6.M0(2131746802, "PostingMembers");
            obj3.n = gm.o0((int) tL_megagroupStats.posters.current, 0);
            if (i18 != 0 && abs3 != 0.0f) {
                Locale locale11 = Locale.ENGLISH;
                if (i18 <= 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                obj3.o = str4 + gm.o0(i18, 0);
            } else {
                obj3.o = "";
            }
            if (i18 >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            obj3.p = z3;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d13 = tL_statsAbsValueAndPrev7.current;
            double d14 = tL_statsAbsValueAndPrev7.previous;
            int i19 = (int) (d13 - d14);
            if (d14 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i19 / ((float) d14)) * 100.0f);
            }
            obj3.e = jb6.M0(2131748210, "MessagesOverview");
            obj3.f = gm.o0((int) tL_megagroupStats.messages.current, 0);
            if (i19 != 0 && abs4 != 0.0f) {
                Locale locale12 = Locale.ENGLISH;
                if (i19 <= 0) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                obj3.g = str3 + gm.o0(i19, 0);
            } else {
                obj3.g = "";
            }
            if (i19 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            obj3.h = z4;
            xzaVar.H = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            xzaVar.f0 = tL_statsDateRangeDays2.max_date * 1000;
            xzaVar.g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList7 = tL_megagroupStats.top_posters;
            if (arrayList7 != null && !arrayList7.isEmpty()) {
                int i20 = 0;
                while (true) {
                    int size3 = tL_megagroupStats.top_posters.size();
                    arrayList = xzaVar.O;
                    arrayList2 = xzaVar.P;
                    if (i20 >= size3) {
                        break;
                    }
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i20);
                    ArrayList<TLRPC.User> arrayList8 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.a = qza.a(arrayList8, tL_statsGroupTopPoster.user_id);
                    StringBuilder sb = new StringBuilder();
                    int i21 = tL_statsGroupTopPoster.messages;
                    if (i21 > 0) {
                        sb.append(jb6.G(i21, "messages", new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(jb6.a0("CharactersPerMessage", null, 2131752191, jb6.G(tL_statsGroupTopPoster.avg_chars, "Characters", new Object[0])));
                    }
                    obj4.b = sb.toString();
                    int i22 = i;
                    if (arrayList2.size() < i22) {
                        arrayList2.add(obj4);
                    }
                    arrayList.add(obj4);
                    i20++;
                    i = i22;
                }
                if (arrayList.size() - arrayList2.size() < 2) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList9 = tL_megagroupStats.top_admins;
            if (arrayList9 != null && !arrayList9.isEmpty()) {
                for (int i23 = 0; i23 < tL_megagroupStats.top_admins.size(); i23++) {
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i23);
                    ArrayList<TLRPC.User> arrayList10 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.a = qza.a(arrayList10, tL_statsGroupTopAdmin.user_id);
                    StringBuilder sb2 = new StringBuilder();
                    int i24 = tL_statsGroupTopAdmin.deleted;
                    if (i24 > 0) {
                        sb2.append(jb6.G(i24, "Deletions", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(jb6.G(tL_statsGroupTopAdmin.banned, "Bans", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(jb6.G(tL_statsGroupTopAdmin.kicked, "Restrictions", new Object[0]));
                    }
                    obj5.b = sb2.toString();
                    xzaVar.R.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList11 = tL_megagroupStats.top_inviters;
            if (arrayList11 != null && !arrayList11.isEmpty()) {
                for (int i25 = 0; i25 < tL_megagroupStats.top_inviters.size(); i25++) {
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i25);
                    ArrayList<TLRPC.User> arrayList12 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.a = qza.a(arrayList12, tL_statsGroupTopInviter.user_id);
                    int i26 = tL_statsGroupTopInviter.invitations;
                    if (i26 > 0) {
                        obj6.b = jb6.G(i26, "Invitations", new Object[0]);
                    } else {
                        obj6.b = "";
                    }
                    xzaVar.Q.add(obj6);
                }
            }
            gm.c3(new Runnable(xzaVar) {
                public final xza b;

                {
                    this.b = xzaVar;
                }

                @Override
                public final void run() {
                    byte b2 = r3;
                    jza[] jzaVarArr22 = jzaVarArr2;
                    xza xzaVar2 = this.b;
                    xzaVar2.getClass();
                    switch (b2) {
                        case 0:
                            xzaVar2.r = jzaVarArr22[0];
                            xzaVar2.h = jzaVarArr22[1];
                            xzaVar2.e = jzaVarArr22[2];
                            xzaVar2.n = jzaVarArr22[3];
                            xzaVar2.d = jzaVarArr22[4];
                            xzaVar2.s = jzaVarArr22[5];
                            xzaVar2.w = jzaVarArr22[6];
                            xzaVar2.x = jzaVarArr22[7];
                            xzaVar2.y = jzaVarArr22[8];
                            xzaVar2.E = jzaVarArr22[9];
                            xzaVar2.F = jzaVarArr22[10];
                            xzaVar2.G = jzaVarArr22[11];
                            xzaVar2.h0(jzaVarArr22);
                            return;
                        default:
                            xzaVar2.d = jzaVarArr22[0];
                            xzaVar2.I = jzaVarArr22[1];
                            xzaVar2.J = jzaVarArr22[2];
                            xzaVar2.K = jzaVarArr22[3];
                            xzaVar2.L = jzaVarArr22[4];
                            xzaVar2.M = jzaVarArr22[5];
                            xzaVar2.e = jzaVarArr22[6];
                            xzaVar2.N = jzaVarArr22[7];
                            xzaVar2.h0(jzaVarArr22);
                            return;
                    }
                }
            });
        }
    }

    public final void k0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.id = new ArrayList<>();
        ArrayList arrayList = this.v0;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = this.t0.get(this.s0); i2 < size; i2++) {
            if (((uza) arrayList.get(i2)).b == null) {
                tL_channels_getMessages.id.add(Integer.valueOf(((uza) arrayList.get(i2)).b()));
                i++;
                if (i > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = oc7.r1(this.currentAccount).g1(this.b);
        this.A0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new pya(this, (byte) 0));
    }

    public final void l0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.o0) {
            return;
        }
        boolean z = this.c0;
        long j = this.b;
        if (z) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = oc7.r1(this.currentAccount).g1(j);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = oc7.r1(this.currentAccount).g1(j);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new pya(this, (byte) 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    public final void m0() {
        ArrayList arrayList = this.y0;
        arrayList.clear();
        ArrayList arrayList2 = this.x0;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            uza uzaVar = (uza) obj;
            k47 f = this.D0.f(uzaVar.b());
            if (f != null) {
                uzaVar.b = f;
                arrayList.add(uzaVar);
            }
        }
        this.u0.clear();
        arrayList2.clear();
    }

    public final void o0(View view) {
        if (view instanceof iza) {
            return;
        }
        if ((view instanceof bba) && !this.T.c1()) {
            Drawable background = view.getBackground();
            if (background instanceof sn2) {
                sn2 sn2Var = (sn2) background;
                if ((sn2Var.a instanceof ColorDrawable) && sn2Var.b != null) {
                    int w0 = cmb.w0(null, cmb.a7, false);
                    if (this.H0 == null || this.I0 != w0) {
                        this.I0 = w0;
                        this.H0 = new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY);
                    }
                    ((ColorDrawable) sn2Var.a).setColor(cmb.w0(null, cmb.Z6, false));
                    sn2Var.b.setColorFilter(this.H0);
                    view.invalidate();
                    return;
                }
            }
            sn2 sn2Var2 = new sn2(new ColorDrawable(cmb.w0(null, cmb.Z6, false)), cmb.W0(org.telegram.messenger.a.b, 2131231233, cmb.a7), 0, 0);
            sn2Var2.x = true;
            view.setBackground(sn2Var2);
        } else if (view instanceof pl1) {
            ((pl1) view).a();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        e7a e7aVar = this.G0;
        if (e7aVar != null) {
            e7aVar.a();
            this.G0 = null;
        }
        nm7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        e7a e7aVar2 = new e7a(notificationCenter, this);
        e7aVar2.b(nm7.C);
        e7aVar2.b(nm7.T);
        e7aVar2.b(nm7.X2);
        e7aVar2.b(nm7.B5);
        this.G0 = e7aVar2;
        h4b N1 = getMessagesController().N1();
        long j = this.b;
        z3b z = N1.z(2, -1, -j, true);
        this.D0 = z;
        if (z != null) {
            this.E0 = z.o();
        }
        if (this.a != null) {
            l0();
        } else {
            oc7.r1(this.currentAccount).a3(this.classGuid, j, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        e7a e7aVar = this.G0;
        if (e7aVar != null) {
            e7aVar.a();
            this.G0 = null;
        }
        he[] heVarArr = this.h0;
        he heVar = heVarArr[0];
        if (heVar != null) {
            heVar.dismiss();
            heVarArr[0] = null;
        }
        z3b z3bVar = this.D0;
        if (z3bVar != null) {
            z3bVar.z(this.E0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        d0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            z82 z82Var = this.S;
            if (z82Var != null) {
                z82Var.i(cmb.w0(null, cmb.Ej, false), cmb.w0(null, cmb.Fj, false));
            }
            s0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void p0(int i, boolean z) {
        boolean z2;
        int i2 = 0;
        while (true) {
            qz4[] qz4VarArr = this.r0;
            if (i2 < qz4VarArr.length) {
                qz4 qz4Var = qz4VarArr[i2];
                if (i2 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                qz4Var.f(z2, z);
                i2++;
            } else {
                return;
            }
        }
    }

    public final void q0(boolean z, float f) {
        for (int i = 0; i < this.r0.length; i++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i - f));
            qz4 qz4Var = this.r0[i];
            qz4Var.K = max;
            qz4Var.J = z;
            qz4Var.invalidate();
        }
        this.p0.invalidate();
    }

    public final void r0() {
        ArrayList arrayList = this.z0;
        arrayList.clear();
        arrayList.addAll(this.w0);
        arrayList.addAll(this.y0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new te((byte) 4))));
    }

    public final void s0() {
        wya wyaVar;
        wya wyaVar2;
        wya wyaVar3;
        wya wyaVar4;
        wya wyaVar5 = this.T;
        if (wyaVar5 != null) {
            int childCount = wyaVar5.getChildCount();
            int i = 0;
            int i2 = 0;
            while (true) {
                wyaVar = this.T;
                if (i2 >= childCount) {
                    break;
                }
                o0(wyaVar.getChildAt(i2));
                i2++;
            }
            int hiddenChildCount = wyaVar.getHiddenChildCount();
            int i3 = 0;
            while (true) {
                wyaVar2 = this.T;
                if (i3 >= hiddenChildCount) {
                    break;
                }
                o0(wyaVar2.W(i3));
                i3++;
            }
            int cachedChildCount = wyaVar2.getCachedChildCount();
            int i4 = 0;
            while (true) {
                wyaVar3 = this.T;
                if (i4 >= cachedChildCount) {
                    break;
                }
                o0(wyaVar3.P(i4));
                i4++;
            }
            int attachedScrapChildCount = wyaVar3.getAttachedScrapChildCount();
            while (true) {
                wyaVar4 = this.T;
                if (i >= attachedScrapChildCount) {
                    break;
                }
                o0(wyaVar4.O(i));
                i++;
            }
            wyaVar4.getRecycledViewPool().a();
        }
        mg0 mg0Var = this.a0;
        if (mg0Var != null) {
            mg0Var.b = true;
        }
    }

    public final void t0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xza.t0():void");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
