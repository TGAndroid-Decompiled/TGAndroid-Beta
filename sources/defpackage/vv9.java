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
public abstract class vv9 extends wgc implements bh4, jm7, vi5 {
    public sv9 A0;
    public boolean B0;
    public final HashMap C0;
    public final ArrayList D0;
    public r7 E0;
    public r7 F0;
    public r7 G0;
    public r7 H0;
    public r6 I0;
    public ju9 J0;
    public final int K0;
    public boolean L0;
    public final nk3 M0;
    public String N0;
    public sg4 O0;
    public final ch4 P0;
    public int Q0;
    public boolean R0;
    public final k6d S0;
    public final ela T0;
    public final int U0;
    public int V0;
    public final bo0 W;
    public final long W0;
    public int X0;
    public int Y0;
    public e7a Z0;
    public final FrameLayout a0;
    public km0 a1;
    public final pu9 b0;
    public final iv9 c0;
    public final sc3 d0;
    public final ov9 e0;
    public final u46 f0;
    public final w49 g0;
    public boolean h0;
    public final FrameLayout i0;
    public final iv9 j0;
    public final u46 k0;
    public final r59 l0;
    public final qv9 m0;
    public final FrameLayout n0;
    public final iv9 o0;
    public final u46 p0;
    public final r59 q0;
    public final jv9 r0;
    public final ai8 s0;
    public boolean t0;
    public final FrameLayout u0;
    public final iv9 v0;
    public final u46 w0;
    public final r59 x0;
    public final mv9 y0;
    public ImageView z0;

    public vv9(Activity activity, nk3 nk3Var, int i, int i2, int i3, long j, k6d k6dVar) {
        super(activity, null);
        int i4;
        int i5;
        int i6;
        int i7;
        this.t0 = false;
        this.C0 = new HashMap();
        this.D0 = new ArrayList();
        int i8 = z8c.t0;
        this.K0 = i8;
        this.V0 = 0;
        this.U0 = i3;
        this.W0 = j;
        this.M0 = nk3Var;
        this.S0 = k6dVar;
        sc3 sc3Var = new sc3();
        this.d0 = sc3Var;
        sc3Var.c = (short) 150;
        sc3Var.e = (short) 350;
        sc3Var.f = (short) 0;
        sc3Var.g = (short) 0;
        sc3Var.d = (short) 0;
        sc3Var.i = new OvershootInterpolator(1.1f);
        sc3Var.o = d53.h;
        sj3 sj3Var = (sj3) this;
        this.e0 = new ov9(sj3Var, activity, nk3Var, i, i2, sc3Var, nk3Var.G, nk3Var, activity);
        if (i2 == 15) {
            ArrayList o3 = nk3Var.o3(i8, i2, i3, true);
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < o3.size(); i9 = mle.c(i9, 1, ((TLRPC.Dialog) o3.get(i9)).id, arrayList)) {
            }
            this.e0.r0 = arrayList;
        }
        this.T0 = (ela) nk3Var.getFragmentView();
        pu9 pu9Var = new pu9((byte) 1, activity, sj3Var);
        this.b0 = pu9Var;
        pu9Var.setItemAnimator(this.d0);
        pu9Var.setPivotY(0.0f);
        pu9Var.setClipToPadding(false);
        pu9Var.setAdapter(this.e0);
        pu9Var.setVerticalScrollBarEnabled(true);
        pu9Var.setInstantClick(true);
        if (jb6.a0) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        pu9Var.setVerticalScrollbarPosition(i4);
        u46 u46Var = new u46(1, false);
        this.f0 = u46Var;
        pu9Var.setLayoutManager(u46Var);
        pu9Var.X1 = true;
        pu9Var.Y1 = false;
        pu9Var.setOnScrollListener(new kv9(sj3Var, nk3Var, (byte) 2));
        pu9Var.E0(new kf9(sj3Var, (byte) 21));
        ch4 ch4Var = new ch4(this.M0);
        this.P0 = ch4Var;
        fv fvVar = ch4Var.b;
        fvVar.setClipToPadding(false);
        fvVar.j(new nv9(sj3Var, (byte) 1));
        fvVar.E0(new kf9(sj3Var, (byte) 21));
        ch4Var.setUiCallback(this);
        ch4Var.setVisibility(8);
        ch4Var.setChatPreviewDelegate(k6dVar);
        tk4 tk4Var = new tk4(activity, null);
        tk4Var.setViewType(1);
        iv9 iv9Var = new iv9(sj3Var, activity, tk4Var, (byte) 2);
        this.c0 = iv9Var;
        iv9Var.d.setText(jb6.M0(2131747901, null));
        iv9Var.e.setVisibility(8);
        iv9Var.setVisibility(8);
        iv9Var.addView(tk4Var, 0);
        iv9Var.e(true, false);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.a0 = frameLayout;
        frameLayout.addView(iv9Var);
        frameLayout.addView(pu9Var);
        frameLayout.addView(ch4Var);
        pu9Var.setEmptyView(iv9Var);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.i0 = frameLayout2;
        pv9 pv9Var = new pv9(sj3Var);
        pv9Var.m = false;
        pv9Var.C = false;
        d53 d53Var = d53.h;
        pv9Var.o(d53Var);
        pv9Var.n(350L);
        r59 r59Var = new r59(activity, null);
        this.l0 = r59Var;
        r59Var.setItemAnimator(pv9Var);
        r59Var.setPivotY(0.0f);
        r59Var.setVerticalScrollBarEnabled(true);
        r59Var.setInstantClick(true);
        if (jb6.a0) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        r59Var.setVerticalScrollbarPosition(i5);
        u46 u46Var2 = new u46(1, false);
        this.k0 = u46Var2;
        r59Var.setLayoutManager(u46Var2);
        r59Var.X1 = true;
        r59Var.Y1 = false;
        r59Var.setClipToPadding(false);
        tk4 tk4Var2 = new tk4(activity, null);
        tk4Var2.setViewType(1);
        iv9 iv9Var2 = new iv9(sj3Var, activity, tk4Var2, (byte) 3);
        this.j0 = iv9Var2;
        iv9Var2.d.setText(jb6.M0(2131747901, null));
        iv9Var2.e.setVisibility(8);
        iv9Var2.setVisibility(8);
        iv9Var2.addView(tk4Var2, 0);
        iv9Var2.e(true, false);
        frameLayout2.addView(iv9Var2);
        frameLayout2.addView(r59Var);
        r59Var.setEmptyView(iv9Var2);
        qv9 qv9Var = new qv9(sj3Var, r59Var, activity, this.K0, i3, nk3Var);
        this.m0 = qv9Var;
        r59Var.setAdapter(qv9Var);
        r59Var.setOnScrollListener(new kv9(sj3Var, nk3Var, (byte) 3));
        r59Var.E0(new kf9(sj3Var, (byte) 21));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.n0 = frameLayout3;
        hv9 hv9Var = new hv9(sj3Var);
        hv9Var.m = false;
        hv9Var.C = false;
        hv9Var.o(d53Var);
        hv9Var.n(350L);
        r59 r59Var2 = new r59(activity, null);
        this.q0 = r59Var2;
        r59Var2.setItemAnimator(hv9Var);
        r59Var2.setPivotY(0.0f);
        r59Var2.setClipToPadding(false);
        r59Var2.setVerticalScrollBarEnabled(true);
        r59Var2.setInstantClick(true);
        if (jb6.a0) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        r59Var2.setVerticalScrollbarPosition(i6);
        u46 u46Var3 = new u46(1, false);
        this.p0 = u46Var3;
        r59Var2.setLayoutManager(u46Var3);
        r59Var2.X1 = true;
        r59Var2.Y1 = false;
        tk4 tk4Var3 = new tk4(activity, null);
        tk4Var3.setViewType(1);
        iv9 iv9Var3 = new iv9(sj3Var, activity, tk4Var3, (byte) 0);
        this.o0 = iv9Var3;
        iv9Var3.d.setText(jb6.M0(2131747901, null));
        iv9Var3.e.setVisibility(8);
        iv9Var3.setVisibility(8);
        iv9Var3.addView(tk4Var3, 0);
        iv9Var3.e(true, false);
        frameLayout3.addView(iv9Var3);
        frameLayout3.addView(r59Var2);
        r59Var2.setEmptyView(iv9Var3);
        jv9 jv9Var = new jv9(sj3Var, r59Var2, activity, this.K0, i3);
        this.r0 = jv9Var;
        r59Var2.setAdapter(jv9Var);
        r59Var2.setOnScrollListener(new kv9(sj3Var, nk3Var, (byte) 0));
        r59Var2.E0(new kf9(sj3Var, (byte) 21));
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.u0 = frameLayout4;
        lv9 lv9Var = new lv9(sj3Var);
        lv9Var.m = false;
        lv9Var.C = false;
        lv9Var.o(d53Var);
        lv9Var.n(350L);
        r59 r59Var3 = new r59(activity, null);
        this.x0 = r59Var3;
        r59Var3.setItemAnimator(lv9Var);
        r59Var3.setPivotY(0.0f);
        r59Var3.setVerticalScrollBarEnabled(true);
        r59Var3.setInstantClick(true);
        if (jb6.a0) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        r59Var3.setVerticalScrollbarPosition(i7);
        u46 u46Var4 = new u46(1, false);
        this.w0 = u46Var4;
        r59Var3.setLayoutManager(u46Var4);
        r59Var3.X1 = true;
        r59Var3.Y1 = false;
        r59Var3.setClipToPadding(false);
        tk4 tk4Var4 = new tk4(activity, null);
        tk4Var4.setViewType(1);
        iv9 iv9Var4 = new iv9(sj3Var, activity, tk4Var4, (byte) 1);
        this.v0 = iv9Var4;
        iv9Var4.d.setText(jb6.M0(2131747901, null));
        iv9Var4.e.setVisibility(8);
        iv9Var4.setVisibility(8);
        iv9Var4.addView(tk4Var4, 0);
        iv9Var4.e(true, false);
        frameLayout4.addView(iv9Var4);
        frameLayout4.addView(r59Var3);
        r59Var3.setEmptyView(iv9Var4);
        mv9 mv9Var = new mv9(sj3Var, r59Var3, activity, this.K0);
        this.y0 = mv9Var;
        r59Var3.setAdapter(mv9Var);
        r59Var3.setOnScrollListener(new kv9(sj3Var, nk3Var, (byte) 1));
        r59Var3.E0(new kf9(sj3Var, (byte) 21));
        this.g0 = new w49(pu9Var, true);
        ai8 ai8Var = new ai8(activity, nk3Var);
        this.s0 = ai8Var;
        q7c q7cVar = ai8Var.c;
        q7cVar.setClipToPadding(false);
        q7cVar.j(new nv9(sj3Var, (byte) 0));
        q7cVar.E0(new kf9(sj3Var, (byte) 21));
        bo0 bo0Var = new bo0(sj3Var);
        this.W = bo0Var;
        setAdapter(bo0Var);
    }

    public static yv1 M(int i, k47 k47Var) {
        Bundle bundle = new Bundle();
        long B0 = k47.B0(k47Var.k);
        if (pg3.B(B0)) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (pg3.D(B0)) {
            bundle.putLong("user_id", B0);
        } else {
            TLRPC.Chat L0 = oc7.r1(j5.a(i).a).L0(Long.valueOf(-B0));
            if (L0 != null && L0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -L0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        }
        bundle.putInt("message_id", k47Var.e1());
        return new yv1(bundle);
    }

    public static void Q(FrameLayout frameLayout, r59 r59Var, int i, int i2, boolean z) {
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(0, i, 0, i2);
        if (z) {
            r59Var.q1(0, i, 0, i2);
        } else {
            r59Var.setPadding(0, i, 0, i2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r59Var.getLayoutParams();
        marginLayoutParams.topMargin = -i;
        marginLayoutParams.bottomMargin = -i2;
    }

    public final void L() {
        if (this.t0) {
            int i = 0;
            this.t0 = false;
            S();
            mgc mgcVar = this.N;
            if (mgcVar != null && mgcVar.getCurrentTabId() != 0) {
                this.N.e(0, 0);
            }
            ov9 ov9Var = this.e0;
            if (ov9Var != null) {
                String str = this.N0;
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.D0;
                    if (i2 >= arrayList.size()) {
                        break;
                    } else if (((sh4) arrayList.get(i2)).d == 7) {
                        i = 1;
                        break;
                    } else {
                        i2++;
                    }
                }
                ov9Var.T(i, str);
            }
        }
    }

    public final int N(int i) {
        int i2 = 0;
        while (true) {
            bo0 bo0Var = this.W;
            ArrayList arrayList = (ArrayList) bo0Var.b;
            if (i2 < ((ArrayList) bo0Var.b).size()) {
                if (((uv9) arrayList.get(i2)).a == 3 && ((uv9) arrayList.get(i2)).b == i) {
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
        if (!z8c.h(i).p() && !oc7.r1(i).H3()) {
            for (k47 k47Var : this.C0.values()) {
                if (k47Var.F0() != null && k47Var.F0().size >= 157286400) {
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
        iv9 iv9Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        long j3;
        boolean isEmpty = TextUtils.isEmpty(str);
        iv9 iv9Var2 = this.c0;
        if (isEmpty) {
            iv9Var2.e.setVisibility(8);
        } else {
            iv9Var2.e.setVisibility(0);
            iv9Var2.e.setText(jb6.a0(null, null, 2131747899, str));
        }
        ov9 ov9Var = this.e0;
        uj3 uj3Var = ov9Var.V;
        if (uj3Var != null) {
            j = uj3Var.a();
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
            sh4 sh4Var = (sh4) arrayList.get(i2);
            byte b = sh4Var.d;
            if (b == 4) {
                TLObject tLObject = sh4Var.f;
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).id;
                } else if ((tLObject instanceof TLRPC.Chat) && !sd2.Y((TLRPC.Chat) tLObject)) {
                    j3 = -((TLRPC.Chat) sh4Var.f).id;
                }
                j2 = j3;
            } else if (b == 6) {
                qh4 qh4Var = sh4Var.g;
                j4 = qh4Var.b;
                j5 = qh4Var.c;
            } else if (b == 7) {
                i3 = 1;
            }
            i2++;
        }
        mv9 mv9Var = this.y0;
        mv9Var.getClass();
        if (bf5.Y(str, null) == null) {
            L();
        }
        if (view == this.i0) {
            oc7.r1(this.K0).K0(0L);
            qv9 qv9Var = this.m0;
            r59 r59Var = qv9Var.d;
            ArrayList arrayList2 = qv9Var.T;
            ArrayList arrayList3 = qv9Var.U;
            ArrayList arrayList4 = qv9Var.V;
            bi3 bi3Var = qv9Var.f0;
            qv9Var.X();
            if (!TextUtils.equals(str, qv9Var.e0)) {
                qv9Var.e0 = str;
                gm.r(bi3Var);
                boolean isEmpty2 = TextUtils.isEmpty(qv9Var.e0);
                ArrayList arrayList5 = qv9Var.S;
                if (isEmpty2) {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    qv9Var.O(true);
                    qv9Var.d0++;
                    z9 = false;
                    qv9Var.Z = false;
                    qv9Var.a0 = false;
                    qv9Var.b0 = false;
                    qv9Var.c0 = 0;
                    if (r59Var != null) {
                        r59Var.w0(0);
                    }
                } else {
                    arrayList5.clear();
                    arrayList4.clear();
                    arrayList3.clear();
                    arrayList2.clear();
                    gm.d3(bi3Var, 1000L);
                    qv9Var.Z = true;
                    qv9Var.a0 = true;
                    qv9Var.O(true);
                    if (r59Var != null) {
                        z9 = false;
                        r59Var.w0(0);
                    }
                }
                this.j0.b(this.Q0, z9);
            }
            z9 = false;
            this.j0.b(this.Q0, z9);
        } else if (view == this.n0) {
            jv9 jv9Var = this.r0;
            r59 r59Var2 = jv9Var.d;
            bl3 bl3Var = jv9Var.i0;
            if (TextUtils.equals(str, jv9Var.h0)) {
                z8 = false;
            } else {
                jv9Var.h0 = str;
                gm.r(bl3Var);
                boolean isEmpty3 = TextUtils.isEmpty(jv9Var.h0);
                ArrayList arrayList6 = jv9Var.W;
                if (isEmpty3) {
                    arrayList6.clear();
                    jv9Var.O(true);
                    jv9Var.g0++;
                    z8 = false;
                    jv9Var.c0 = false;
                    jv9Var.d0 = false;
                    jv9Var.e0 = false;
                    jv9Var.f0 = 0;
                    if (r59Var2 != null) {
                        r59Var2.w0(0);
                    }
                } else {
                    z8 = false;
                    arrayList6.clear();
                    gm.d3(bl3Var, 1000L);
                    jv9Var.c0 = true;
                    jv9Var.d0 = true;
                    jv9Var.O(true);
                    if (r59Var2 != null) {
                        r59Var2.w0(0);
                    }
                }
            }
            this.o0.b(this.Q0, z8);
            if (TextUtils.isEmpty(str)) {
                jv9Var.W();
            }
        } else {
            ai8 ai8Var = this.s0;
            if (view == ai8Var) {
                q7c q7cVar = ai8Var.c;
                ArrayList arrayList7 = ai8Var.n;
                if (!TextUtils.equals(ai8Var.x, str)) {
                    if (ai8Var.L >= 0) {
                        ConnectionsManager.getInstance(ai8Var.b).cancelRequest(ai8Var.L, true);
                        ai8Var.L = -1;
                    }
                    ai8Var.w = false;
                    ai8Var.I.setLoading(false);
                    ai8Var.x = str;
                    if (TextUtils.isEmpty(str)) {
                        ai8Var.r = 0;
                        z7 = true;
                        ai8Var.M++;
                        ai8Var.s = false;
                        arrayList7.clear();
                        ai8Var.a(false);
                    } else {
                        z7 = true;
                        ai8Var.b(str);
                        ai8Var.r = 0;
                        ai8Var.M++;
                        ai8Var.s = false;
                        arrayList7.clear();
                    }
                    ai8Var.d();
                    q7cVar.w0(0);
                    q7cVar.g3.O(z7);
                }
            } else if (view == this.u0) {
                if (bf5.Y(str, null) != null) {
                    if (z) {
                        this.w0.g1(0, 0);
                    }
                    mv9Var.Z(str);
                    this.v0.b(this.Q0, false);
                }
            } else if (view == this.a0) {
                int i4 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                ch4 ch4Var = this.P0;
                if ((i4 == 0 && this.W0 == 0 && j4 == 0 && j5 == 0) || j != 0) {
                    this.L0 = false;
                    ov9Var.T(i3, str);
                    ov9Var.B0 = this.O0;
                    ch4Var.animate().setListener(null).cancel();
                    ch4Var.i(null, false);
                    if (z) {
                        if (ov9Var.E0 > 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        iv9Var2.e(!z5, false);
                        if (ov9Var.E0 > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        iv9Var2.e(z6, false);
                    } else if (!ov9Var.M()) {
                        if (ov9Var.E0 > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        iv9Var2.e(z4, true);
                    }
                    if (z) {
                        ch4Var.setVisibility(8);
                    } else if (ch4Var.getVisibility() != 8) {
                        ch4Var.animate().alpha(0.0f).setListener(new c39(this, (byte) 6)).setDuration(150L).start();
                    }
                    ch4Var.setTag(null);
                    iv9Var = iv9Var2;
                } else {
                    boolean z10 = true;
                    ch4Var.setTag(1);
                    ch4Var.i(this.O0, false);
                    ch4Var.animate().setListener(null).cancel();
                    if (z) {
                        ch4Var.setVisibility(0);
                        ch4Var.setAlpha(1.0f);
                        z3 = z;
                    } else {
                        if (ch4Var.getVisibility() != 0) {
                            ch4Var.setVisibility(0);
                            ch4Var.setAlpha(0.0f);
                        } else {
                            z10 = z;
                        }
                        ch4Var.animate().alpha(1.0f).setDuration(150L).start();
                        z3 = z10;
                    }
                    iv9Var = iv9Var2;
                    this.P0.h(j2, this.W0, j4, j5, null, i3, str, z3);
                    iv9Var.setVisibility(8);
                }
                iv9Var.b(this.Q0, false);
                ch4Var.c.b(this.Q0, false);
            } else {
                boolean z11 = i3;
                long j6 = j4;
                long j7 = j5;
                if (view instanceof ch4) {
                    ch4 ch4Var2 = (ch4) view;
                    if (j != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ch4Var2.setUseFromUserAsAvatar(z2);
                    ch4Var2.c.b(this.Q0, false);
                    ch4Var2.h(j2, this.W0, j6, j7, uh4.k3[((uv9) ((ArrayList) this.W.b).get(i)).b], z11, str, z);
                } else if (view instanceof ju9) {
                    ju9 ju9Var = (ju9) view;
                    ju9Var.a.b(this.Q0, false);
                    ju9Var.L = str;
                    ju9Var.d(false);
                }
            }
        }
    }

    public final void R(boolean z) {
        q59 q59Var;
        q59 q59Var2;
        q59 q59Var3;
        int i;
        boolean z2;
        int i2;
        int i3;
        uj3 uj3Var;
        int i4;
        if (this.B0 != z) {
            nk3 nk3Var = this.M0;
            if (z) {
                if (!nk3Var.getActionBar().y()) {
                    if (!nk3Var.getActionBar().e("search_view_pager")) {
                        this.I0 = nk3Var.getActionBar().q("search_view_pager");
                        if (nk3Var.X) {
                            ImageView imageView = new ImageView(getContext());
                            this.z0 = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            this.z0.setImageDrawable(new ee0(true));
                            anb.s(this.z0, cmb.x8, null, PorterDuff.Mode.MULTIPLY);
                            ImageView imageView2 = this.z0;
                            int i5 = cmb.y8;
                            anb.R(imageView2, cmb.f0(cmb.w0(null, i5, false), 1, -1), null, anb.M(i5), null);
                            this.z0.setOnClickListener(new wk8(this, (byte) 21));
                            this.I0.addView(this.z0, qoe.p(54, 54, 0.0f, 16));
                        }
                        ?? numberTextView = new NumberTextView(this.I0.getContext());
                        this.A0 = numberTextView;
                        numberTextView.setTextSize(18);
                        this.A0.setTypeface(gm.o());
                        sv9 sv9Var = this.A0;
                        int i6 = cmb.x8;
                        dq9 dq9Var = new dq9((byte) 6);
                        dq9 dq9Var2 = new dq9((byte) 7);
                        int P = anb.P(i6, -1, 0, 0.0f, null);
                        dq9Var2.e(P, sv9Var);
                        umb w = anb.w(101, sv9Var);
                        w.c(i6, -1, 0, 0.0f, null);
                        w.n = dq9Var;
                        w.o = dq9Var2;
                        w.m = false;
                        w.g = P;
                        r6 r6Var = this.I0;
                        sv9 sv9Var2 = this.A0;
                        if (nk3Var.X) {
                            i4 = 18;
                        } else {
                            i4 = 72;
                        }
                        r6Var.addView(sv9Var2, qoe.m(1.0f, 0, -1, i4, 0, 0));
                        this.A0.setOnTouchListener(new w02((byte) 23));
                        r7 h = this.I0.h(203, 2131230880, gm.L(54.0f), jb6.M0(2131754800, null));
                        this.E0 = h;
                        if (h.getIconView() != null) {
                            anb.s(this.E0.getIconView(), i6, null, PorterDuff.Mode.SRC_IN);
                        }
                        this.F0 = this.I0.h(200, 2131232230, gm.L(54.0f), jb6.M0(2131754877, null));
                        this.G0 = this.I0.h(201, 2131232171, gm.L(54.0f), jb6.M0(2131750519, null));
                        this.H0 = this.I0.h(202, 2131232114, gm.L(54.0f), jb6.M0(2131751535, null));
                    }
                } else {
                    return;
                }
            }
            if (this.A0 != null) {
                ov9 ov9Var = this.e0;
                if (ov9Var != null && (uj3Var = ov9Var.V) != null && uj3Var.a() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0.getLayoutParams();
                if (nk3Var.X) {
                    i2 = 18;
                } else {
                    i2 = 72;
                }
                if (z2) {
                    i3 = 56;
                } else {
                    i3 = 0;
                }
                marginLayoutParams.leftMargin = gm.L(i2 + i3);
                sv9 sv9Var3 = this.A0;
                sv9Var3.setLayoutParams(sv9Var3.getLayoutParams());
            }
            if (nk3Var.getActionBar().getBackButton() != null && (nk3Var.getActionBar().getBackButton().getDrawable() instanceof a27)) {
                ee0 ee0Var = new ee0(false);
                nk3Var.getActionBar().setBackButtonDrawable(ee0Var);
                ee0Var.setColorFilter(null);
            }
            this.B0 = z;
            HashMap hashMap = this.C0;
            if (z) {
                gm.t1(nk3Var.getParentActivity().getCurrentFocus());
                nk3Var.getActionBar().R(null, null);
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
            nk3Var.getActionBar().x();
            hashMap.clear();
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                if ((getChildAt(i7) instanceof ch4) && (q59Var3 = ((ch4) getChildAt(i7)).d) != null) {
                    q59Var3.f();
                }
                if (getChildAt(i7) instanceof ju9) {
                    ((ju9) getChildAt(i7)).d(true);
                }
            }
            ch4 ch4Var = this.P0;
            if (ch4Var != null && (q59Var2 = ch4Var.d) != null) {
                q59Var2.f();
            }
            SparseArray sparseArray = this.h;
            int size = sparseArray.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = (View) sparseArray.valueAt(i8);
                if ((view instanceof ch4) && (q59Var = ((ch4) view).d) != null) {
                    q59Var.f();
                }
            }
        }
    }

    public final void S() {
        this.W.l();
        m(false);
        mgc mgcVar = this.N;
        if (mgcVar != null) {
            mgcVar.y.f();
        }
    }

    @Override
    public final void a(ucb ucbVar, RectF rectF) {
        ucbVar.b = true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.h3;
        boolean z = false;
        qv9 qv9Var = this.m0;
        if (i == i3) {
            if (oc7.r1(this.K0).K0(0L) != null) {
                z = true;
            }
            this.j0.e(z, true);
            qv9Var.X();
            qv9Var.O(true);
        } else if (i != nm7.y1 && i != nm7.r) {
            if (i == nm7.V0) {
                this.r0.O(true);
            } else if (i == nm7.B5) {
                Object obj = objArr[0];
                mv9 mv9Var = this.y0;
                if (obj == mv9Var.T) {
                    mv9Var.O(true);
                }
            }
        } else {
            qv9Var.X();
            qv9Var.O(true);
        }
    }

    @Override
    public final boolean e(ug4 ug4Var) {
        return this.C0.containsKey(ug4Var);
    }

    @Override
    public final void f() {
        R(true);
    }

    @Override
    public final void g(Canvas canvas, RectF rectF) {
        View[] viewPages = getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                FrameLayout frameLayout = this.a0;
                r59 r59Var = null;
                if (view != null) {
                    if (view == frameLayout) {
                        r59Var = this.b0;
                    } else if (view == this.i0) {
                        r59Var = this.l0;
                    } else if (view == this.n0) {
                        r59Var = this.q0;
                    } else if (view == this.u0) {
                        r59Var = this.x0;
                    } else {
                        ju9 ju9Var = this.J0;
                        if (view == ju9Var) {
                            r59Var = ju9Var.b;
                        } else {
                            ai8 ai8Var = this.s0;
                            if (view == ai8Var) {
                                r59Var = ai8Var.c;
                            } else if (view instanceof ch4) {
                                r59Var = ((ch4) view).b;
                            }
                        }
                    }
                }
                if (r59Var != null) {
                    tl0.a(r59Var, canvas, rectF, r59Var, this);
                }
                if (view == frameLayout) {
                    ch4 ch4Var = this.P0;
                    if (ch4Var.getVisibility() == 0) {
                        fv fvVar = ch4Var.b;
                        tl0.a(fvVar, canvas, rectF, fvVar, this);
                    }
                }
            }
        }
    }

    public r6 getActionMode() {
        return this.I0;
    }

    public ArrayList<sh4> getCurrentSearchFilters() {
        return this.D0;
    }

    public ju9 getDownloadsContainer() {
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

    public vgc getTabsView() {
        return this.N;
    }

    @Override
    public final void i(k47 k47Var, View view, int i) {
        boolean z;
        int i2;
        int i3;
        ug4 ug4Var = new ug4(k47Var.e1(), k47.B0(k47Var.k));
        HashMap hashMap = this.C0;
        if (hashMap.containsKey(ug4Var)) {
            hashMap.remove(ug4Var);
        } else if (hashMap.size() < 100) {
            hashMap.put(ug4Var, k47Var);
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
                    anb.x(this, animatedVectorDrawable, cmb.x8, null, PorterDuff.Mode.SRC_IN);
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
                        if (!((k47) hashMap.get((ug4) it.next())).Q) {
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
        if (view instanceof ida) {
            ((ida) view).b(hashMap.containsKey(ug4Var), true);
        } else if (view instanceof tha) {
            ((tha) view).b(i, hashMap.containsKey(ug4Var), true);
        } else if (view instanceof lda) {
            ((lda) view).f(hashMap.containsKey(ug4Var), true);
        } else if (view instanceof eda) {
            ((eda) view).e(hashMap.containsKey(ug4Var), true);
        } else if (view instanceof lx2) {
            ((lx2) view).c(hashMap.containsKey(ug4Var), true);
        } else if (view instanceof hg3) {
            ((hg3) view).d0(hashMap.containsKey(ug4Var), true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e7a e7aVar = this.Z0;
        if (e7aVar != null) {
            e7aVar.a();
            this.Z0 = null;
        }
        e7a e7aVar2 = new e7a(nm7.f(this.K0), this);
        e7aVar2.b(nm7.h3);
        e7aVar2.b(nm7.y1);
        e7aVar2.b(nm7.r);
        e7aVar2.b(nm7.V0);
        e7aVar2.b(nm7.B5);
        this.Z0 = e7aVar2;
        this.h0 = true;
        qv9 qv9Var = this.m0;
        if (qv9Var != null) {
            qv9Var.O(false);
        }
        jv9 jv9Var = this.r0;
        if (jv9Var != null) {
            jv9Var.O(false);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h0 = false;
        e7a e7aVar = this.Z0;
        if (e7aVar != null) {
            e7aVar.a();
            this.Z0 = null;
        }
    }

    @Override
    public final void q() {
        this.T0.K();
    }

    @Override
    public final void r(k47 k47Var) {
        this.M0.presentFragment(M(this.K0, k47Var));
        R(false);
    }

    @Override
    public final void s(View view, View view2, int i, int i2) {
        boolean z;
        ov9 ov9Var = this.e0;
        ch4 ch4Var = this.P0;
        if (i == 0) {
            if (ch4Var.getVisibility() == 0) {
                ch4Var.i(this.O0, false);
                ov9Var.B0 = null;
            } else {
                ch4Var.i(null, false);
                sg4 sg4Var = this.O0;
                ov9Var.B0 = sg4Var;
                if (sg4Var != null) {
                    ((nh3) sg4Var).h(false, null, ov9Var.z0, ov9Var.A0);
                }
            }
        } else if (view instanceof ch4) {
            if (i2 == 0 && ch4Var.getVisibility() != 0) {
                z = true;
            } else {
                z = false;
            }
            ((ch4) view).i(this.O0, z);
        }
        if (view2 instanceof ch4) {
            ((ch4) view2).i(null, false);
            return;
        }
        ov9Var.B0 = null;
        ch4Var.i(null, false);
    }

    public void setBlurredBackgroundDrawableFactory(km0 km0Var) {
        this.a1 = km0Var;
    }

    public void setFilteredSearchViewDelegate(sg4 sg4Var) {
        this.O0 = sg4Var;
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
            if (getChildAt(i2) instanceof ch4) {
                ((ch4) getChildAt(i2)).c.b(i, z);
            } else if (getChildAt(i2) == this.a0) {
                this.c0.b(i, z);
                this.P0.c.b(i, z);
            } else if (getChildAt(i2) instanceof ju9) {
                ((ju9) getChildAt(i2)).a.b(i, z);
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
        mgc mgcVar = this.N;
        if (mgcVar != null) {
            mgcVar.g(1.0f, i);
        }
        invalidate();
    }

    @Override
    public final boolean u() {
        return this.B0;
    }
}
