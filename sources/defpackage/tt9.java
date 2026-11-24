package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.NumberTextView;
public abstract class tt9 extends wec implements ze4, gk7, wg5 {
    public qt9 A0;
    public boolean B0;
    public final HashMap C0;
    public final ArrayList D0;
    public r7 E0;
    public r7 F0;
    public r7 G0;
    public r7 H0;
    public r6 I0;
    public hs9 J0;
    public final int K0;
    public boolean L0;
    public final cj3 M0;
    public String N0;
    public qe4 O0;
    public final af4 P0;
    public int Q0;
    public boolean R0;
    public final gi3 S0;
    public final cja T0;
    public final int U0;
    public int V0;
    public final bn0 W;
    public final long W0;
    public int X0;
    public int Y0;
    public wtc Z0;
    public final FrameLayout a0;
    public kl0 a1;
    public final ns9 b0;
    public final gt9 c0;
    public final gb3 d0;
    public final mt9 e0;
    public final t26 f0;
    public final t29 g0;
    public boolean h0;
    public final FrameLayout i0;
    public final gt9 j0;
    public final t26 k0;
    public final o39 l0;
    public final ot9 m0;
    public final FrameLayout n0;
    public final gt9 o0;
    public final t26 p0;
    public final o39 q0;
    public final ht9 r0;
    public final yf8 s0;
    public boolean t0;
    public final FrameLayout u0;
    public final gt9 v0;
    public final t26 w0;
    public final o39 x0;
    public final kt9 y0;
    public ImageView z0;

    public tt9(Activity activity, cj3 cj3Var, int i, int i2, int i3, long j, gi3 gi3Var) {
        super(activity, null);
        int i4;
        int i5;
        int i6;
        int i7;
        this.t0 = false;
        this.C0 = new HashMap();
        this.D0 = new ArrayList();
        int i8 = y6c.t0;
        this.K0 = i8;
        this.V0 = 0;
        this.U0 = i3;
        this.W0 = j;
        this.M0 = cj3Var;
        this.S0 = gi3Var;
        gb3 gb3Var = new gb3();
        this.d0 = gb3Var;
        gb3Var.c = (short) 150;
        gb3Var.e = (short) 350;
        gb3Var.f = (short) 0;
        gb3Var.g = (short) 0;
        gb3Var.d = (short) 0;
        gb3Var.i = new OvershootInterpolator(1.1f);
        gb3Var.o = s33.h;
        hi3 hi3Var = (hi3) this;
        this.e0 = new mt9(hi3Var, activity, cj3Var, i, i2, gb3Var, cj3Var.G, cj3Var, activity);
        if (i2 == 15) {
            ArrayList m3 = cj3Var.m3(i8, i2, i3, true);
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < m3.size(); i9 = mue.c(i9, 1, ((TLRPC.Dialog) m3.get(i9)).id, arrayList)) {
            }
            this.e0.r0 = arrayList;
        }
        this.T0 = (cja) cj3Var.getFragmentView();
        ns9 ns9Var = new ns9((byte) 1, activity, hi3Var);
        this.b0 = ns9Var;
        ns9Var.setItemAnimator(this.d0);
        ns9Var.setPivotY(0.0f);
        ns9Var.setClipToPadding(false);
        ns9Var.setAdapter(this.e0);
        ns9Var.setVerticalScrollBarEnabled(true);
        ns9Var.setInstantClick(true);
        if (k96.a0) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        ns9Var.setVerticalScrollbarPosition(i4);
        t26 t26Var = new t26(1, false);
        this.f0 = t26Var;
        ns9Var.setLayoutManager(t26Var);
        ns9Var.X1 = true;
        ns9Var.Y1 = false;
        ns9Var.setOnScrollListener(new it9(hi3Var, cj3Var, (byte) 2));
        ns9Var.E0(new zk9(hi3Var, (byte) 13));
        af4 af4Var = new af4(this.M0);
        this.P0 = af4Var;
        fu fuVar = af4Var.b;
        fuVar.setClipToPadding(false);
        fuVar.j(new lt9(hi3Var, (byte) 1));
        fuVar.E0(new zk9(hi3Var, (byte) 13));
        af4Var.setUiCallback(this);
        af4Var.setVisibility(8);
        af4Var.setChatPreviewDelegate(gi3Var);
        pi4 pi4Var = new pi4(activity, null);
        pi4Var.setViewType(1);
        gt9 gt9Var = new gt9(hi3Var, activity, pi4Var, (byte) 2);
        this.c0 = gt9Var;
        gt9Var.d.setText(k96.M0(2131747975, null));
        gt9Var.e.setVisibility(8);
        gt9Var.setVisibility(8);
        gt9Var.addView(pi4Var, 0);
        gt9Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a0 = frameLayout;
        frameLayout.addView(gt9Var);
        frameLayout.addView(ns9Var);
        frameLayout.addView(af4Var);
        ns9Var.setEmptyView(gt9Var);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.i0 = frameLayout2;
        nt9 nt9Var = new nt9(hi3Var);
        nt9Var.m = false;
        nt9Var.C = false;
        s33 s33Var = s33.h;
        nt9Var.o(s33Var);
        nt9Var.n(350L);
        o39 o39Var = new o39(activity, null);
        this.l0 = o39Var;
        o39Var.setItemAnimator(nt9Var);
        o39Var.setPivotY(0.0f);
        o39Var.setVerticalScrollBarEnabled(true);
        o39Var.setInstantClick(true);
        if (k96.a0) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        o39Var.setVerticalScrollbarPosition(i5);
        t26 t26Var2 = new t26(1, false);
        this.k0 = t26Var2;
        o39Var.setLayoutManager(t26Var2);
        o39Var.X1 = true;
        o39Var.Y1 = false;
        o39Var.setClipToPadding(false);
        pi4 pi4Var2 = new pi4(activity, null);
        pi4Var2.setViewType(1);
        gt9 gt9Var2 = new gt9(hi3Var, activity, pi4Var2, (byte) 3);
        this.j0 = gt9Var2;
        gt9Var2.d.setText(k96.M0(2131747975, null));
        gt9Var2.e.setVisibility(8);
        gt9Var2.setVisibility(8);
        gt9Var2.addView(pi4Var2, 0);
        gt9Var2.e(true, false);
        frameLayout2.addView(gt9Var2);
        frameLayout2.addView(o39Var);
        o39Var.setEmptyView(gt9Var2);
        ot9 ot9Var = new ot9(hi3Var, o39Var, activity, this.K0, i3, cj3Var);
        this.m0 = ot9Var;
        o39Var.setAdapter(ot9Var);
        o39Var.setOnScrollListener(new it9(hi3Var, cj3Var, (byte) 3));
        o39Var.E0(new zk9(hi3Var, (byte) 13));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.n0 = frameLayout3;
        ft9 ft9Var = new ft9(hi3Var);
        ft9Var.m = false;
        ft9Var.C = false;
        ft9Var.o(s33Var);
        ft9Var.n(350L);
        o39 o39Var2 = new o39(activity, null);
        this.q0 = o39Var2;
        o39Var2.setItemAnimator(ft9Var);
        o39Var2.setPivotY(0.0f);
        o39Var2.setClipToPadding(false);
        o39Var2.setVerticalScrollBarEnabled(true);
        o39Var2.setInstantClick(true);
        if (k96.a0) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        o39Var2.setVerticalScrollbarPosition(i6);
        t26 t26Var3 = new t26(1, false);
        this.p0 = t26Var3;
        o39Var2.setLayoutManager(t26Var3);
        o39Var2.X1 = true;
        o39Var2.Y1 = false;
        pi4 pi4Var3 = new pi4(activity, null);
        pi4Var3.setViewType(1);
        gt9 gt9Var3 = new gt9(hi3Var, activity, pi4Var3, (byte) 0);
        this.o0 = gt9Var3;
        gt9Var3.d.setText(k96.M0(2131747975, null));
        gt9Var3.e.setVisibility(8);
        gt9Var3.setVisibility(8);
        gt9Var3.addView(pi4Var3, 0);
        gt9Var3.e(true, false);
        frameLayout3.addView(gt9Var3);
        frameLayout3.addView(o39Var2);
        o39Var2.setEmptyView(gt9Var3);
        ht9 ht9Var = new ht9(hi3Var, o39Var2, activity, this.K0, i3);
        this.r0 = ht9Var;
        o39Var2.setAdapter(ht9Var);
        o39Var2.setOnScrollListener(new it9(hi3Var, cj3Var, (byte) 0));
        o39Var2.E0(new zk9(hi3Var, (byte) 13));
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.u0 = frameLayout4;
        jt9 jt9Var = new jt9(hi3Var);
        jt9Var.m = false;
        jt9Var.C = false;
        jt9Var.o(s33Var);
        jt9Var.n(350L);
        o39 o39Var3 = new o39(activity, null);
        this.x0 = o39Var3;
        o39Var3.setItemAnimator(jt9Var);
        o39Var3.setPivotY(0.0f);
        o39Var3.setVerticalScrollBarEnabled(true);
        o39Var3.setInstantClick(true);
        if (k96.a0) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        o39Var3.setVerticalScrollbarPosition(i7);
        t26 t26Var4 = new t26(1, false);
        this.w0 = t26Var4;
        o39Var3.setLayoutManager(t26Var4);
        o39Var3.X1 = true;
        o39Var3.Y1 = false;
        o39Var3.setClipToPadding(false);
        pi4 pi4Var4 = new pi4(activity, null);
        pi4Var4.setViewType(1);
        gt9 gt9Var4 = new gt9(hi3Var, activity, pi4Var4, (byte) 1);
        this.v0 = gt9Var4;
        gt9Var4.d.setText(k96.M0(2131747975, null));
        gt9Var4.e.setVisibility(8);
        gt9Var4.setVisibility(8);
        gt9Var4.addView(pi4Var4, 0);
        gt9Var4.e(true, false);
        frameLayout4.addView(gt9Var4);
        frameLayout4.addView(o39Var3);
        o39Var3.setEmptyView(gt9Var4);
        kt9 kt9Var = new kt9(hi3Var, o39Var3, activity, this.K0);
        this.y0 = kt9Var;
        o39Var3.setAdapter(kt9Var);
        o39Var3.setOnScrollListener(new it9(hi3Var, cj3Var, (byte) 1));
        o39Var3.E0(new zk9(hi3Var, (byte) 13));
        this.g0 = new t29(ns9Var, true);
        yf8 yf8Var = new yf8(activity, cj3Var);
        this.s0 = yf8Var;
        q5c q5cVar = yf8Var.c;
        q5cVar.setClipToPadding(false);
        q5cVar.j(new lt9(hi3Var, (byte) 0));
        q5cVar.E0(new zk9(hi3Var, (byte) 13));
        bn0 bn0Var = new bn0(hi3Var);
        this.W = bn0Var;
        setAdapter(bn0Var);
    }

    public static mu1 M(int i, k27 k27Var) {
        Bundle bundle = new Bundle();
        long B0 = k27.B0(k27Var.k);
        if (cf3.B(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (cf3.D(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat K0 = na7.q1(j5.a(i).a).K0(Long.valueOf(-B0));
            if (K0 != null && K0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -K0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", k27Var.e1());
        return new mu1(bundle);
    }

    public static void Q(FrameLayout frameLayout, o39 o39Var, int i, int i2, boolean z) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i, 0, i2);
        if (z) {
            o39Var.q1(0, i, 0, i2);
        } else {
            o39Var.setPadding(0, i, 0, i2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o39Var.getLayoutParams();
        marginLayoutParams.topMargin = -i;
        marginLayoutParams.bottomMargin = -i2;
    }

    public final void L() {
        if (this.t0) {
            int i = 0;
            this.t0 = false;
            S();
            mec mecVar = this.N;
            if (mecVar != null && mecVar.getCurrentTabId() != 0) {
                this.N.e(0, 0);
            }
            mt9 mt9Var = this.e0;
            if (mt9Var != null) {
                String str = this.N0;
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.D0;
                    if (i2 >= arrayList.size()) {
                        break;
                    } else if (((rf4) arrayList.get(i2)).d == 7) {
                        i = 1;
                        break;
                    } else {
                        i2++;
                    }
                }
                mt9Var.T(i, str);
            }
        }
    }

    public final int N(int i) {
        int i2 = 0;
        while (true) {
            bn0 bn0Var = this.W;
            ArrayList arrayList = (ArrayList) bn0Var.b;
            if (i2 < ((ArrayList) bn0Var.b).size()) {
                if (((st9) arrayList.get(i2)).a == 3 && ((st9) arrayList.get(i2)).b == i) {
                    return i2;
                }
                i2++;
            } else {
                return -1;
            }
        }
    }

    public final boolean O() {
        int i = this.K0;
        if (!y6c.h(i).p() && !na7.q1(i).E3()) {
            for (k27 k27Var : this.C0.values()) {
                if (k27Var.F0() != null && k27Var.F0().size >= 157286400) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void P(View view, int i, String str, boolean z) {
        long j;
        long j2;
        boolean z2;
        boolean z3;
        gt9 gt9Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        long j3;
        boolean isEmpty = TextUtils.isEmpty(str);
        gt9 gt9Var2 = this.c0;
        if (isEmpty) {
            gt9Var2.e.setVisibility(8);
        } else {
            gt9Var2.e.setVisibility(0);
            gt9Var2.e.setText(k96.a0(null, null, 2131747973, str));
        }
        mt9 mt9Var = this.e0;
        ji3 ji3Var = mt9Var.V;
        if (ji3Var != null) {
            j = ji3Var.a();
        } else {
            j = 0;
        }
        if (i == 0) {
            j2 = 0;
        } else {
            j2 = j;
        }
        int i2 = 0;
        int i3 = 0;
        long j4 = 0;
        long j5 = 0;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i2 >= arrayList.size()) {
                break;
            }
            rf4 rf4Var = (rf4) arrayList.get(i2);
            byte b = rf4Var.d;
            if (b == 4) {
                TLObject tLObject = rf4Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).id;
                } else if ((tLObject instanceof TLRPC.Chat) && !hc2.Y((TLRPC.Chat) tLObject)) {
                    j3 = -((TLRPC.Chat) rf4Var.f).id;
                }
                j2 = j3;
            } else if (b == 6) {
                pf4 pf4Var = rf4Var.g;
                long j6 = pf4Var.b;
                j5 = pf4Var.c;
                j4 = j6;
            } else if (b == 7) {
                i3 = 1;
            }
            i2++;
        }
        kt9 kt9Var = this.y0;
        kt9Var.getClass();
        if (dd5.Y(str, null) == null) {
            L();
        }
        if (view == this.i0) {
            na7.q1(this.K0).J0(0L);
            ot9 ot9Var = this.m0;
            o39 o39Var = ot9Var.d;
            ArrayList arrayList2 = ot9Var.T;
            ArrayList arrayList3 = ot9Var.U;
            ArrayList arrayList4 = ot9Var.V;
            li3 li3Var = ot9Var.f0;
            ot9Var.X();
            if (!TextUtils.equals(str, ot9Var.e0)) {
                ot9Var.e0 = str;
                gl.r(li3Var);
                boolean isEmpty2 = TextUtils.isEmpty(ot9Var.e0);
                ArrayList arrayList5 = ot9Var.S;
                if (isEmpty2) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    ot9Var.O(true);
                    ot9Var.d0++;
                    z9 = false;
                    ot9Var.Z = false;
                    ot9Var.a0 = false;
                    ot9Var.b0 = false;
                    ot9Var.c0 = 0;
                    if (o39Var != null) {
                        o39Var.w0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    gl.e3(li3Var, 1000L);
                    ot9Var.Z = true;
                    ot9Var.a0 = true;
                    ot9Var.O(true);
                    if (o39Var != null) {
                        z9 = false;
                        o39Var.w0(0);
                    }
                }
                this.j0.b(this.Q0, z9);
            }
            z9 = false;
            this.j0.b(this.Q0, z9);
        } else if (view == this.n0) {
            ht9 ht9Var = this.r0;
            o39 o39Var2 = ht9Var.d;
            qj3 qj3Var = ht9Var.i0;
            if (TextUtils.equals(str, ht9Var.h0)) {
                z8 = false;
            } else {
                ht9Var.h0 = str;
                gl.r(qj3Var);
                boolean isEmpty3 = TextUtils.isEmpty(ht9Var.h0);
                ArrayList arrayList6 = ht9Var.W;
                if (isEmpty3) {
                    arrayList6.clear();
                    ht9Var.O(true);
                    ht9Var.g0++;
                    z8 = false;
                    ht9Var.c0 = false;
                    ht9Var.d0 = false;
                    ht9Var.e0 = false;
                    ht9Var.f0 = 0;
                    if (o39Var2 != null) {
                        o39Var2.w0(0);
                    }
                } else {
                    z8 = false;
                    arrayList6.clear();
                    gl.e3(qj3Var, 1000L);
                    ht9Var.c0 = true;
                    ht9Var.d0 = true;
                    ht9Var.O(true);
                    if (o39Var2 != null) {
                        o39Var2.w0(0);
                    }
                }
            }
            this.o0.b(this.Q0, z8);
            if (TextUtils.isEmpty(str)) {
                ht9Var.W();
            }
        } else {
            yf8 yf8Var = this.s0;
            if (view == yf8Var) {
                q5c q5cVar = yf8Var.c;
                ArrayList arrayList7 = yf8Var.n;
                if (!TextUtils.equals(yf8Var.x, str)) {
                    if (yf8Var.L >= 0) {
                        ConnectionsManager.getInstance(yf8Var.b).cancelRequest(yf8Var.L, true);
                        yf8Var.L = -1;
                    }
                    yf8Var.w = false;
                    yf8Var.I.setLoading(false);
                    yf8Var.x = str;
                    if (TextUtils.isEmpty(str)) {
                        yf8Var.r = 0;
                        z7 = true;
                        yf8Var.M++;
                        yf8Var.s = false;
                        arrayList7.clear();
                        yf8Var.a(false);
                    } else {
                        z7 = true;
                        yf8Var.b(str);
                        yf8Var.r = 0;
                        yf8Var.M++;
                        yf8Var.s = false;
                        arrayList7.clear();
                    }
                    yf8Var.d();
                    q5cVar.w0(0);
                    q5cVar.g3.O(z7);
                }
            } else if (view == this.u0) {
                if (dd5.Y(str, null) != null) {
                    if (z) {
                        this.w0.g1(0, 0);
                    }
                    kt9Var.Z(str);
                    this.v0.b(this.Q0, false);
                }
            } else if (view == this.a0) {
                int i4 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                af4 af4Var = this.P0;
                if ((i4 == 0 && this.W0 == 0 && j4 == 0 && j5 == 0) || j != 0) {
                    this.L0 = false;
                    mt9Var.T(i3, str);
                    mt9Var.B0 = this.O0;
                    af4Var.animate().setListener(null).cancel();
                    af4Var.i(null, false);
                    if (z) {
                        if (mt9Var.E0 > 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        gt9Var2.e(!z5, false);
                        if (mt9Var.E0 > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        gt9Var2.e(z6, false);
                    } else if (!mt9Var.M()) {
                        if (mt9Var.E0 > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        gt9Var2.e(z4, true);
                    }
                    if (z) {
                        af4Var.setVisibility(8);
                    } else if (af4Var.getVisibility() != 8) {
                        af4Var.animate().alpha(0.0f).setListener(new ng9(this, (byte) 4)).setDuration(150L).start();
                    }
                    af4Var.setTag(null);
                    gt9Var = gt9Var2;
                } else {
                    boolean z10 = true;
                    af4Var.setTag(1);
                    af4Var.i(this.O0, false);
                    af4Var.animate().setListener(null).cancel();
                    if (z) {
                        af4Var.setVisibility(0);
                        af4Var.setAlpha(1.0f);
                        z3 = z;
                    } else {
                        if (af4Var.getVisibility() != 0) {
                            af4Var.setVisibility(0);
                            af4Var.setAlpha(0.0f);
                        } else {
                            z10 = z;
                        }
                        af4Var.animate().alpha(1.0f).setDuration(150L).start();
                        z3 = z10;
                    }
                    gt9Var = gt9Var2;
                    this.P0.h(j2, this.W0, j4, j5, null, i3, str, z3);
                    gt9Var.setVisibility(8);
                }
                gt9Var.b(this.Q0, false);
                af4Var.c.b(this.Q0, false);
            } else {
                boolean z11 = i3;
                long j7 = j4;
                long j8 = j5;
                if (view instanceof af4) {
                    af4 af4Var2 = (af4) view;
                    if (j != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    af4Var2.setUseFromUserAsAvatar(z2);
                    af4Var2.c.b(this.Q0, false);
                    af4Var2.h(j2, this.W0, j7, j8, tf4.k3[((st9) ((ArrayList) this.W.b).get(i)).b], z11, str, z);
                } else if (view instanceof hs9) {
                    hs9 hs9Var = (hs9) view;
                    hs9Var.a.b(this.Q0, false);
                    hs9Var.L = str;
                    hs9Var.d(false);
                }
            }
        }
    }

    public final void R(boolean z) {
        n39 n39Var;
        n39 n39Var2;
        n39 n39Var3;
        int i;
        boolean z2;
        int i2;
        int i3;
        ji3 ji3Var;
        int i4;
        if (this.B0 != z) {
            cj3 cj3Var = this.M0;
            if (z) {
                if (!cj3Var.getActionBar().y()) {
                    if (!cj3Var.getActionBar().d("search_view_pager")) {
                        this.I0 = cj3Var.getActionBar().q("search_view_pager");
                        if (cj3Var.X) {
                            ImageView imageView = new ImageView(getContext());
                            this.z0 = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            this.z0.setImageDrawable(new ed0(true));
                            zkb.s(this.z0, bkb.x8, null, PorterDuff.Mode.MULTIPLY);
                            ImageView imageView2 = this.z0;
                            int i5 = bkb.y8;
                            zkb.R(imageView2, bkb.f0(bkb.w0(null, i5, false), 1, -1), null, zkb.M(i5), null);
                            this.z0.setOnClickListener(new ik8(this, (byte) 18));
                            this.I0.addView(this.z0, nme.p(54, 54, 0.0f, 16));
                        }
                        ?? numberTextView = new NumberTextView(this.I0.getContext());
                        this.A0 = numberTextView;
                        numberTextView.setTextSize(18);
                        this.A0.setTypeface(gl.o());
                        qt9 qt9Var = this.A0;
                        int i6 = bkb.x8;
                        ho9 ho9Var = new ho9((byte) 5);
                        ho9 ho9Var2 = new ho9((byte) 6);
                        int P = zkb.P(i6, -1, 0, 0.0f, null);
                        ho9Var2.d(P, qt9Var);
                        tkb w = zkb.w(101, qt9Var);
                        w.c(i6, -1, 0, 0.0f, null);
                        w.n = ho9Var;
                        w.o = ho9Var2;
                        w.m = false;
                        w.g = P;
                        r6 r6Var = this.I0;
                        qt9 qt9Var2 = this.A0;
                        if (cj3Var.X) {
                            i4 = 18;
                        } else {
                            i4 = 72;
                        }
                        r6Var.addView(qt9Var2, nme.m(1.0f, 0, -1, i4, 0, 0));
                        this.A0.setOnTouchListener(new jz1((byte) 23));
                        r7 h = this.I0.h(203, 2131230879, gl.L(54.0f), k96.M0(2131754800, null));
                        this.E0 = h;
                        if (h.getIconView() != null) {
                            zkb.s(this.E0.getIconView(), i6, null, PorterDuff.Mode.SRC_IN);
                        }
                        this.F0 = this.I0.h(200, 2131232229, gl.L(54.0f), k96.M0(2131754877, null));
                        this.G0 = this.I0.h(201, 2131232170, gl.L(54.0f), k96.M0(2131750570, null));
                        this.H0 = this.I0.h(202, 2131232113, gl.L(54.0f), k96.M0(2131751586, null));
                    }
                } else {
                    return;
                }
            }
            if (this.A0 != null) {
                mt9 mt9Var = this.e0;
                if (mt9Var != null && (ji3Var = mt9Var.V) != null && ji3Var.a() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0.getLayoutParams();
                if (cj3Var.X) {
                    i2 = 18;
                } else {
                    i2 = 72;
                }
                if (z2) {
                    i3 = 56;
                } else {
                    i3 = 0;
                }
                marginLayoutParams.leftMargin = gl.L(i2 + i3);
                qt9 qt9Var3 = this.A0;
                qt9Var3.setLayoutParams(qt9Var3.getLayoutParams());
            }
            if (cj3Var.getActionBar().getBackButton() != null && (cj3Var.getActionBar().getBackButton().getDrawable() instanceof a07)) {
                ed0 ed0Var = new ed0(false);
                cj3Var.getActionBar().setBackButtonDrawable(ed0Var);
                ed0Var.setColorFilter(null);
            }
            this.B0 = z;
            HashMap hashMap = this.C0;
            if (z) {
                gl.t1(cj3Var.getParentActivity().getCurrentFocus());
                cj3Var.getActionBar().R(null, null);
                this.A0.a(hashMap.size(), false);
                r7 r7Var = this.E0;
                if (O()) {
                    i = 0;
                } else {
                    i = 8;
                }
                r7Var.setVisibility(i);
                this.F0.setVisibility(0);
                this.G0.setVisibility(0);
                this.H0.setVisibility(0);
                return;
            }
            cj3Var.getActionBar().x();
            hashMap.clear();
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                if ((getChildAt(i7) instanceof af4) && (n39Var3 = ((af4) getChildAt(i7)).d) != null) {
                    n39Var3.f();
                }
                if (getChildAt(i7) instanceof hs9) {
                    ((hs9) getChildAt(i7)).d(true);
                }
            }
            af4 af4Var = this.P0;
            if (af4Var != null && (n39Var2 = af4Var.d) != null) {
                n39Var2.f();
            }
            SparseArray sparseArray = this.h;
            int size = sparseArray.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = (View) sparseArray.valueAt(i8);
                if ((view instanceof af4) && (n39Var = ((af4) view).d) != null) {
                    n39Var.f();
                }
            }
        }
    }

    public final void S() {
        this.W.l();
        m(false);
        mec mecVar = this.N;
        if (mecVar != null) {
            mecVar.y.f();
        }
    }

    @Override
    public final void a(tab tabVar, RectF rectF) {
        tabVar.b = true;
    }

    @Override
    public final boolean b(se4 se4Var) {
        return this.C0.containsKey(se4Var);
    }

    @Override
    public final void c() {
        R(true);
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.a0;
                o39 o39Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        o39Var = this.b0;
                    } else if (view == this.i0) {
                        o39Var = this.l0;
                    } else if (view == this.n0) {
                        o39Var = this.q0;
                    } else if (view == this.u0) {
                        o39Var = this.x0;
                    } else {
                        hs9 hs9Var = this.J0;
                        if (view == hs9Var) {
                            o39Var = hs9Var.b;
                        } else {
                            yf8 yf8Var = this.s0;
                            if (view == yf8Var) {
                                o39Var = yf8Var.c;
                            } else if (view instanceof af4) {
                                o39Var = ((af4) view).b;
                            }
                        }
                    }
                }
                if (o39Var != null) {
                    tk0.a(o39Var, canvas, rectF, o39Var, this);
                }
                if (view == frameLayout) {
                    af4 af4Var = this.P0;
                    if (af4Var.getVisibility() == 0) {
                        fu fuVar = af4Var.b;
                        tk0.a(fuVar, canvas, rectF, fuVar, this);
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.g3;
        boolean z = false;
        ot9 ot9Var = this.m0;
        if (i == i3) {
            if (na7.q1(this.K0).J0(0L) != null) {
                z = true;
            }
            this.j0.e(z, true);
            ot9Var.X();
            ot9Var.O(true);
        } else if (i != kk7.x1 && i != kk7.r) {
            if (i == kk7.U0) {
                this.r0.O(true);
            } else if (i == kk7.z5) {
                Object obj = objArr[0];
                kt9 kt9Var = this.y0;
                if (obj == kt9Var.T) {
                    kt9Var.O(true);
                }
            }
        } else {
            ot9Var.X();
            ot9Var.O(true);
        }
    }

    @Override
    public final void f(k27 k27Var, View view, int i) {
        boolean z;
        int i2;
        int i3;
        se4 se4Var = new se4(k27Var.e1(), k27.B0(k27Var.k));
        HashMap hashMap = this.C0;
        if (hashMap.containsKey(se4Var)) {
            hashMap.remove(se4Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(se4Var, k27Var);
        } else {
            return;
        }
        int i4 = 0;
        if (hashMap.size() == 0) {
            R(false);
        } else {
            this.A0.a(hashMap.size(), true);
            r7 r7Var = this.F0;
            if (r7Var != null) {
                if (hashMap.size() == 1) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                r7Var.setVisibility(i3);
            }
            if (this.E0 != null) {
                boolean O = O();
                if (O) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                if (this.E0.getVisibility() != i2) {
                    this.E0.setVisibility(i2);
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.E0.getIconView().getDrawable();
                    zkb.x(this, animatedVectorDrawable, bkb.x8, null, PorterDuff.Mode.SRC_IN);
                    if (O) {
                        animatedVectorDrawable.start();
                    } else {
                        animatedVectorDrawable.reset();
                    }
                }
            }
            if (this.H0 != null) {
                Iterator it = hashMap.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((k27) hashMap.get((se4) it.next())).Q) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                r7 r7Var2 = this.H0;
                if (!z) {
                    i4 = 8;
                }
                r7Var2.setVisibility(i4);
            }
        }
        if (view instanceof iba) {
            ((iba) view).b(hashMap.containsKey(se4Var), true);
        } else if (view instanceof rfa) {
            ((rfa) view).b(i, hashMap.containsKey(se4Var), true);
        } else if (view instanceof lba) {
            ((lba) view).f(hashMap.containsKey(se4Var), true);
        } else if (view instanceof eba) {
            ((eba) view).e(hashMap.containsKey(se4Var), true);
        } else if (view instanceof bw2) {
            ((bw2) view).c(hashMap.containsKey(se4Var), true);
        } else if (view instanceof ue3) {
            ((ue3) view).e0(hashMap.containsKey(se4Var), true);
        }
    }

    public r6 getActionMode() {
        return this.I0;
    }

    public ArrayList<rf4> getCurrentSearchFilters() {
        return this.D0;
    }

    public hs9 getDownloadsContainer() {
        return this.J0;
    }

    public int getFolderId() {
        return this.U0;
    }

    @Override
    public long getManualScrollDuration() {
        return 320L;
    }

    public r7 getSpeedItem() {
        return this.E0;
    }

    public vec getTabsView() {
        return this.N;
    }

    @Override
    public final void n(k27 k27Var) {
        this.M0.presentFragment(M(this.K0, k27Var));
        R(false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wtc wtcVar = this.Z0;
        if (wtcVar != null) {
            wtcVar.a();
            this.Z0 = null;
        }
        wtc wtcVar2 = new wtc(kk7.f(this.K0), this);
        wtcVar2.b(kk7.g3);
        wtcVar2.b(kk7.x1);
        wtcVar2.b(kk7.r);
        wtcVar2.b(kk7.U0);
        wtcVar2.b(kk7.z5);
        this.Z0 = wtcVar2;
        this.h0 = true;
        ot9 ot9Var = this.m0;
        if (ot9Var != null) {
            ot9Var.O(false);
        }
        ht9 ht9Var = this.r0;
        if (ht9Var != null) {
            ht9Var.O(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h0 = false;
        wtc wtcVar = this.Z0;
        if (wtcVar != null) {
            wtcVar.a();
            this.Z0 = null;
        }
    }

    @Override
    public final void r() {
        this.T0.K();
    }

    @Override
    public final void s(View view, View view2, int i, int i2) {
        boolean z;
        mt9 mt9Var = this.e0;
        af4 af4Var = this.P0;
        if (i == 0) {
            if (af4Var.getVisibility() == 0) {
                af4Var.i(this.O0, false);
                mt9Var.B0 = null;
            } else {
                af4Var.i(null, false);
                qe4 qe4Var = this.O0;
                mt9Var.B0 = qe4Var;
                if (qe4Var != null) {
                    ((ag3) qe4Var).h(false, null, mt9Var.z0, mt9Var.A0);
                }
            }
        } else if (view instanceof af4) {
            if (i2 == 0 && af4Var.getVisibility() != 0) {
                z = true;
            } else {
                z = false;
            }
            ((af4) view).i(this.O0, z);
        }
        if (view2 instanceof af4) {
            ((af4) view2).i(null, false);
            return;
        }
        mt9Var.B0 = null;
        af4Var.i(null, false);
    }

    public void setBlurredBackgroundDrawableFactory(kl0 kl0Var) {
        this.a1 = kl0Var;
    }

    public void setFilteredSearchViewDelegate(qe4 qe4Var) {
        this.O0 = qe4Var;
    }

    public void setKeyboardHeight(int i) {
        boolean z;
        this.Q0 = i;
        if (getVisibility() == 0 && getAlpha() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof af4) {
                ((af4) getChildAt(i2)).c.b(i, z);
            } else if (getChildAt(i2) == this.a0) {
                this.c0.b(i, z);
                this.P0.c.b(i, z);
            } else if (getChildAt(i2) instanceof hs9) {
                ((hs9) getChildAt(i2)).a.b(i, z);
            } else if (getChildAt(i2) == this.i0) {
                this.j0.b(i, z);
            }
        }
    }

    @Override
    public void setPosition(int i) {
        if (i < 0) {
            return;
        }
        super.setPosition(i);
        this.h.clear();
        mec mecVar = this.N;
        if (mecVar != null) {
            mecVar.g(1.0f, i);
        }
        invalidate();
    }

    @Override
    public final boolean t() {
        return this.B0;
    }
}
