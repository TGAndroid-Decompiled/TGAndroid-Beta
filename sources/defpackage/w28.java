package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class w28 extends FrameLayout {
    public static final int r0 = 0;
    public v28 E;
    public final c38 F;
    public View G;
    public boolean H;
    public boolean I;
    public TL_stars.TL_starGiftUnique J;
    public qb9 K;
    public TL_stars.StarGift L;
    public final ArrayList M;
    public final HashMap N;
    public final SpannableStringBuilder O;
    public final String P;
    public final String Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public int V;
    public int W;
    public final b38 a;
    public int a0;
    public final m28 b;
    public int b0;
    public final q55 c;
    public int c0;
    public final p28 d;
    public int d0;
    public final mj4 e;
    public int e0;
    public z28 f;
    public int f0;
    public int g0;
    public int h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public final ArrayList m0;
    public long n;
    public final boolean n0;
    public int o0;
    public t28 p0;
    public final d38 q0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final r28 w;
    public final View x;
    public final View y;

    public w28(d38 d38Var, Context context, final int i) {
        super(context);
        int i2;
        tk5 tk5Var;
        ylb ylbVar;
        ylb ylbVar2;
        ylb ylbVar3;
        int i3;
        ylb ylbVar4;
        this.q0 = d38Var;
        this.e = new mj4((byte) 15, false);
        this.h = -1;
        this.n = 0L;
        this.r = null;
        this.s = null;
        this.L = null;
        this.M = new ArrayList();
        this.N = new HashMap();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = 0;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.m0 = new ArrayList();
        this.n0 = i;
        c();
        Context context2 = getContext();
        ylb resourceProvider = d38Var.getResourceProvider();
        km0 km0Var = d38Var.H;
        m28 m28Var = new m28(this, context2, resourceProvider, i);
        this.b = m28Var;
        m28Var.setClipToPadding(false);
        m28Var.setSections(true);
        ((sc3) m28Var.getItemAnimator()).m = false;
        getContext();
        q55 q55Var = new q55(3);
        this.c = q55Var;
        q55Var.O = new zr1(this, (byte) 11);
        m28Var.i(new ks(this, (byte) 8));
        m28Var.setLayoutManager(q55Var);
        p28 p28Var = new p28(this, context, i);
        this.d = p28Var;
        m28Var.setAdapter(p28Var);
        m28Var.setOnItemClickListener(new f59() {
            @Override
            public final void g(int i4, View view) {
                b38 b38Var;
                w28 w28Var;
                int i5;
                int i6;
                int i7;
                int i8;
                Long valueOf;
                w28 w28Var2 = w28.this;
                d38 d38Var2 = w28Var2.q0;
                ArrayList arrayList = w28Var2.m0;
                if (view instanceof v28) {
                    v28 v28Var = (v28) view;
                    boolean z = w28Var2.n0;
                    if (w28Var2.p0 == null) {
                        tm tmVar = v28Var.c;
                        mz9[] mz9VarArr = new mz9[1];
                        Point point = gm.q;
                        int min = (int) Math.min(gm.L(330.0f), point.y * 0.75f);
                        int min2 = (int) Math.min(gm.L(324.0f), point.x * 0.95f);
                        if (tmVar != null) {
                            tmVar.f();
                            v28Var.c();
                            Rect rect = gm.Q;
                            rect.set(tmVar.getBounds());
                            if (z) {
                                i6 = (gm.L(12.0f) + (-rect.centerY())) - min;
                            } else {
                                i6 = (-(v28Var.getHeight() - rect.centerY())) - gm.L(16.0f);
                            }
                            i5 = gm.L(12.0f) + (rect.centerX() - (point.x - min2));
                        } else {
                            i5 = 0;
                            i6 = 0;
                        }
                        int i9 = i5;
                        Context context3 = w28Var2.getContext();
                        Integer valueOf2 = Integer.valueOf(i9);
                        int i10 = 5;
                        if (z) {
                            i7 = 5;
                        } else {
                            i7 = 7;
                        }
                        ylb resourceProvider2 = d38Var2.getResourceProvider();
                        if (z) {
                            i8 = 24;
                        } else {
                            i8 = 16;
                        }
                        int i11 = i6;
                        s28 s28Var = new s28(w28Var2, d38Var2, context3, valueOf2, i7, resourceProvider2, i8, v28Var.a(), v28Var, mz9VarArr);
                        s28Var.h1 = true;
                        long j = w28Var2.n;
                        if (j == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(j);
                        }
                        s28Var.setSelected(valueOf);
                        s28Var.setSaveState(3);
                        s28Var.y(tmVar, v28Var);
                        t28 t28Var = new t28(w28Var2, s28Var);
                        w28Var2.p0 = t28Var;
                        mz9VarArr[0] = t28Var;
                        if (jb6.a0) {
                            i10 = 3;
                        }
                        t28Var.showAsDropDown(v28Var, 0, i11, i10 | 48);
                        mz9VarArr[0].a();
                        return;
                    }
                    return;
                }
                int i12 = w28Var2.W;
                boolean z2 = i;
                if (i4 == i12) {
                    w28Var2.h = -1;
                    w28Var2.n = 0L;
                    w28Var2.r = null;
                    w28Var2.s = null;
                    w28Var2.J = null;
                    w28Var2.i();
                    if (!z2) {
                        d38Var2.h.i();
                    }
                    v28 v28Var2 = w28Var2.E;
                    if (v28Var2 != null) {
                        v28Var2.b(true);
                    }
                    w28Var2.j(true);
                    w28Var2.f(true);
                    w28 w28Var3 = d38Var2.n;
                    if (w28Var3 != null && (b38Var = w28Var3.a) != null && (w28Var = d38Var2.h) != null) {
                        b38Var.a(w28Var.h);
                        return;
                    }
                    return;
                }
                int i13 = w28Var2.c0;
                if (i4 >= i13 && i4 < w28Var2.d0) {
                    int i14 = i4 - i13;
                    if (w28Var2.L == null) {
                        if (i14 >= 0 && i14 < arrayList.size()) {
                            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                            if (z2) {
                                TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                    w28Var2.n = 0L;
                                    w28Var2.h = -1;
                                    w28Var2.J = null;
                                    w28Var2.r = null;
                                    w28Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                } else {
                                    return;
                                }
                            } else {
                                w28Var2.n = 0L;
                                w28Var2.h = -1;
                                w28Var2.J = null;
                                w28Var2.r = oc7.n0(tL_starGiftUnique);
                                w28Var2.s = null;
                            }
                            w28Var2.j(true);
                            w28Var2.i();
                            w28Var2.f(true);
                            v28 v28Var3 = w28Var2.E;
                            if (v28Var3 != null) {
                                v28Var3.b(true);
                            }
                        }
                    } else if (w28Var2.K != null && i14 >= 0 && i14 < arrayList.size()) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                        if (z2) {
                            TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                            if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                w28Var2.n = 0L;
                                w28Var2.h = -1;
                                w28Var2.r = null;
                                w28Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                            } else {
                                return;
                            }
                        } else {
                            w28Var2.n = 0L;
                            w28Var2.h = -1;
                            w28Var2.r = oc7.n0(tL_starGiftUnique2);
                            w28Var2.s = null;
                        }
                        w28Var2.J = tL_starGiftUnique2;
                        w28Var2.j(true);
                        w28Var2.i();
                        w28Var2.f(true);
                        v28 v28Var4 = w28Var2.E;
                        if (v28Var4 != null) {
                            v28Var4.b(true);
                        }
                    }
                }
            }
        });
        m28Var.j(new q28(this, i));
        addView(m28Var, qoe.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new pn2(2131232248, 0), 0, 1, 33);
        if (d38Var.a) {
            i2 = 2131752381;
        } else {
            i2 = 2131743442;
        }
        String M0 = jb6.M0(i2, null);
        this.P = M0;
        this.O = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) M0);
        this.Q = jb6.M0(2131743441, null);
        f(false);
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        m28Var.setItemAnimator(sc3Var);
        View view = new View(getContext());
        this.x = view;
        qm0 qm0Var = new qm0(km0Var.c(view, null, false));
        qm0Var.b(-gm.L(24.0f), true);
        qm0Var.H = 220;
        view.setBackground(qm0Var);
        addView(view, qoe.e(-1, 72, 55));
        if (i == 0) {
            Context context3 = getContext();
            i3 = ((d) d38Var).currentAccount;
            ylbVar4 = ((d) d38Var).resourceProvider;
            this.a = new b38(i3, 0L, ylbVar4, context3);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.y = view2;
            qm0 qm0Var2 = new qm0(km0Var.c(view2, null, false));
            qm0Var2.b(-gm.L(16.0f), false);
            view2.setBackground(qm0Var2);
            addView(view2, qoe.e(-1, 16, 55));
            Context context4 = getContext();
            tk5Var = ((d) d38Var).parentLayout;
            ylbVar = ((d) d38Var).resourceProvider;
            r28 r28Var = new r28(context4, tk5Var, 3, 0L, ylbVar);
            this.w = r28Var;
            r28Var.setImportantForAccessibility(4);
            r28Var.x = d38Var;
            r28Var.setClipToOutline(true);
            xj xjVar = agc.a;
            r28Var.setOutlineProvider(new yfc(0, gm.L(16.0f)));
            addView(r28Var, qoe.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        ylbVar2 = ((d) d38Var).resourceProvider;
        c38 c38Var = new c38(context5, ylbVar2);
        this.F = c38Var;
        im0 c = d38Var.F.c(c38Var, null, false);
        ylbVar3 = ((d) d38Var).resourceProvider;
        nm0 nm0Var = new nm0(ylbVar3);
        nm0Var.e = new w00((byte) 21);
        nm0Var.f(0, 0);
        nm0Var.e(0, 0);
        nm0Var.d(0, 0);
        c.p(nm0Var);
        c.r(gm.L(18.0f));
        c.S.e = true;
        c38Var.I = c;
        c38Var.H = c;
        c38Var.G = new l28(this, (byte) 0);
        c38Var.setVisibility(4);
        addView(c38Var, qoe.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, qoe.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public final boolean a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w28.a():boolean");
    }

    public final boolean b() {
        m28 m28Var = this.b;
        if (m28Var != null) {
            for (int i = 0; i < m28Var.getChildCount(); i++) {
                if (m28Var.getChildAt(i) instanceof tk4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c() {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = null;
        boolean z = this.n0;
        d38 d38Var = this.q0;
        if (!z) {
            TLRPC.User f = d38Var.getUserConfig().f();
            this.h = m9c.n(f);
            this.n = m9c.o(f);
            if (f != null) {
                TLRPC.EmojiStatus emojiStatus = f.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.r = tL_emojiStatusCollectible;
                    this.s = null;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = tL_emojiStatusCollectible;
                    tL_peerColorCollectible = null;
                    tL_emojiStatusCollectible2 = tL_emojiStatusCollectible3;
                }
            }
            tL_emojiStatusCollectible = null;
            this.r = tL_emojiStatusCollectible;
            this.s = null;
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible32 = tL_emojiStatusCollectible;
            tL_peerColorCollectible = null;
            tL_emojiStatusCollectible2 = tL_emojiStatusCollectible32;
        } else {
            TLRPC.User f2 = d38Var.getUserConfig().f();
            this.h = m9c.f(f2);
            this.n = m9c.g(f2);
            this.r = null;
            if (f2 != null) {
                TLRPC.PeerColor peerColor = f2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                    this.s = tL_peerColorCollectible;
                }
            }
            tL_peerColorCollectible = null;
            this.s = tL_peerColorCollectible;
        }
        if (tL_emojiStatusCollectible2 == null && tL_peerColorCollectible == null) {
            return;
        }
        this.h = -1;
        this.n = 0L;
    }

    public final void d() {
        k();
        this.d.f();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.F && !this.I) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e() {
        int i;
        boolean z = this.I;
        m28 m28Var = this.b;
        if (z) {
            m28Var.D0();
        }
        d();
        if (z && (i = this.i0) >= 0) {
            this.c.g1(i, this.q0.f);
            m28Var.post(new l28(this, (byte) 1));
        }
    }

    public final void f(boolean z) {
        Object obj;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J;
        d38 d38Var = this.q0;
        mj4 mj4Var = this.e;
        if (tL_starGiftUnique != null) {
            nk resellAmount = tL_starGiftUnique.getResellAmount(ok.a);
            if (tL_starGiftUnique.resale_ton_only) {
                mj4Var.b = nxa.t1(nxa.V0(jb6.a0(null, null, 2131745879, tL_starGiftUnique.getResellAmount(ok.b).d()), true), true);
                mj4Var.c = nxa.T0(jb6.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                mj4Var.b = nxa.T0(jb6.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                mj4Var.c = null;
            }
        } else {
            if (!d38Var.getUserConfig().p() && !d38Var.a) {
                obj = this.O;
            } else if (this.r != null) {
                obj = this.Q;
            } else {
                obj = this.P;
            }
            mj4Var.b = obj;
            mj4Var.c = null;
        }
        if (d38Var.F0() == this) {
            d38Var.S = this;
            d38Var.R.i((CharSequence) mj4Var.b, z, true);
            d38Var.R.g((SpannableStringBuilder) mj4Var.c, z);
        }
    }

    public final void g() {
        b61 b61Var = this.q0.R;
        if (b61Var != null) {
            b61Var.updateColors();
        }
        r28 r28Var = this.w;
        if (r28Var != null) {
            r28Var.invalidate();
        }
        j(true);
        gm.d0(this.b, new ci7(this, (byte) 9));
        c38 c38Var = this.F;
        if (c38Var != null) {
            l(c38Var);
        }
    }

    public final void h() {
        int i;
        boolean z;
        int i2 = this.q0.f;
        float f = 0.0f;
        View view = this.x;
        c38 c38Var = this.F;
        if (c38Var != null && (i = this.i0) >= 0) {
            q55 q55Var = this.c;
            this.G = q55Var.m(i);
            m28 m28Var = this.b;
            int paddingTop = m28Var.getPaddingTop() + i2;
            int K0 = q55Var.K0();
            View view2 = this.G;
            if (view2 != null) {
                if (view2.getTop() <= paddingTop) {
                    z = true;
                } else {
                    z = false;
                }
                this.I = z;
                this.H = !z;
                c38Var.setVisibility(0);
                c38Var.setTranslationY((Math.max(this.G.getTop(), paddingTop) + m28Var.getTop()) - c38Var.getTop());
            } else if (K0 != -1 && K0 > this.i0) {
                this.I = true;
                this.H = false;
                c38Var.setVisibility(0);
                c38Var.setTranslationY((m28Var.getTop() + paddingTop) - c38Var.getTop());
            } else {
                this.I = false;
                this.H = false;
                c38Var.setVisibility(0);
                c38Var.setTranslationY((gm.L(1.0f) + getHeight()) - c38Var.getTop());
            }
            boolean z2 = this.H;
            if (c38Var.J != z2) {
                c38Var.J = z2;
                c38Var.invalidate();
            }
            if (this.I) {
                f = gm.L(36.0f) + i2;
            }
            view.setTranslationY(f);
            m28Var.invalidate();
            invalidate();
            return;
        }
        this.H = false;
        this.I = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (c38Var != null) {
            c38Var.setVisibility(4);
            boolean z3 = this.H;
            if (c38Var.J != z3) {
                c38Var.J = z3;
                c38Var.invalidate();
            }
        }
    }

    public final void i() {
        k47 messageObject;
        r28 r28Var = this.w;
        if (r28Var != null) {
            rc2[] cells = r28Var.getCells();
            for (int i = 0; i < cells.length; i++) {
                rc2 rc2Var = cells[i];
                if (rc2Var != null && (messageObject = rc2Var.getMessageObject()) != null) {
                    messageObject.w1 = true;
                    z28 z28Var = this.f;
                    if (z28Var != null) {
                        messageObject.e1 = z28Var.getColorId();
                    }
                    messageObject.f1 = this.n;
                    messageObject.g1 = this.s;
                    cells[i].setAvatar(messageObject);
                    cells[i].invalidate();
                }
            }
        }
    }

    public final void j(boolean z) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z2;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        boolean z3;
        d38 d38Var;
        f28 f28Var;
        int i;
        z28 z28Var = this.f;
        if (z28Var != null) {
            z28Var.a(this.h, z);
        }
        b38 b38Var = this.a;
        if (b38Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                b38Var.e(tL_emojiStatusCollectible.document_id, true, z);
                b38Var.c(ec7.a(this.r), z);
                b38Var.d(this.r.pattern_document_id, true, z);
            } else {
                long j = 0;
                if (pg3.z()) {
                    b38Var.e(0L, false, z);
                } else {
                    TLRPC.User W1 = oc7.r1(z8c.t0).W1(0L);
                    if (W1 != null) {
                        j = pg3.f(W1.emoji_status);
                    }
                    b38Var.e(j, pg3.z(), z);
                }
                b38Var.b(this.h, z);
                b38Var.d(this.n, false, z);
            }
        }
        boolean z4 = this.n0;
        if (!z4 && (f28Var = (d38Var = this.q0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 == null) {
                i = ((d) d38Var).currentAccount;
                f28Var.b(i, this.h, z);
            } else {
                f28Var.c(ec7.a(tL_emojiStatusCollectible2), z);
            }
        }
        if (!z4) {
            int i2 = this.W;
            k();
            int i3 = this.W;
            p28 p28Var = this.d;
            if (i2 >= 0) {
                if (i3 < 0) {
                    p28Var.q(i2, 2);
                }
            } else if (i3 >= 0) {
                p28Var.p(i3, 2);
            }
        }
        int i4 = 0;
        while (true) {
            m28 m28Var = this.b;
            if (i4 < m28Var.getChildCount()) {
                View childAt = m28Var.getChildAt(i4);
                if (childAt instanceof j28) {
                    j28 j28Var = (j28) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == j28Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == j28Var.getGiftId())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    j28Var.b(z3, true);
                } else if (childAt instanceof ox4) {
                    ox4 ox4Var = (ox4) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == ox4Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == ox4Var.getGiftId())) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ox4Var.f(z2, true);
                }
                i4++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        int i;
        ava avaVar;
        int i2;
        d38 d38Var = this.q0;
        ava avaVar2 = d38Var.b;
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.d0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.g0 = 0;
        ArrayList arrayList = this.m0;
        arrayList.clear();
        this.R = 0;
        this.T = 1;
        int i3 = 3;
        this.l0 = 3;
        this.S = 2;
        boolean z = this.n0;
        if (!z && (this.h >= 0 || this.r != null || this.s != null)) {
            this.W = 3;
            i = 5;
            this.l0 = 5;
            this.a0 = 4;
        } else {
            i = 3;
        }
        if (z) {
            avaVar = d38Var.c;
        } else {
            avaVar = avaVar2;
        }
        if ((!z || z) && avaVar != null) {
            ArrayList arrayList2 = avaVar.l;
            this.l0 = i + 1;
            this.i0 = i;
            if (this.L == null) {
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i4)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i5 = this.l0;
                this.c0 = i5;
                this.l0 = arrayList.size() + i5;
                int size = arrayList.size() + this.g0;
                this.g0 = size;
                int i6 = this.l0;
                this.d0 = i6;
                if (!avaVar2.i && avaVar2.j) {
                    if (arrayList.isEmpty()) {
                        int i7 = this.l0;
                        this.k0 = i7;
                        this.l0 = i7 + 2;
                        this.j0 = i7 + 1;
                    }
                } else {
                    this.e0 = i6;
                    int i8 = 3 - (size % 3);
                    if (size <= 0) {
                        i3 = 9;
                    } else if (i8 > 0) {
                        i3 = i8;
                    }
                    int i9 = i6 + i3;
                    this.l0 = i9;
                    this.g0 = size + i3;
                    this.f0 = i9;
                }
                if (b()) {
                    avaVar.a();
                }
            } else if (this.K != null) {
                i2 = ((d) d38Var).currentAccount;
                long e = z8c.h(i2).e();
                for (int i10 = 0; i10 < this.K.d.size(); i10++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.K.d.get(i10);
                    if (pg3.n(tL_starGiftUnique.owner_id) != e && pg3.n(tL_starGiftUnique.host_id) != e) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i11 = this.l0;
                this.c0 = i11;
                this.l0 = arrayList.size() + i11;
                int size2 = arrayList.size() + this.g0;
                this.g0 = size2;
                int i12 = this.l0;
                this.d0 = i12;
                qb9 qb9Var = this.K;
                if (qb9Var.y || !qb9Var.z) {
                    this.e0 = i12;
                    int i13 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i3 = 9;
                    } else if (i13 > 0) {
                        i3 = i13;
                    }
                    int i14 = i12 + i3;
                    this.l0 = i14;
                    this.g0 = size2 + i3;
                    this.f0 = i14;
                }
                if (b()) {
                    this.K.l(false);
                }
            }
            int i15 = this.l0;
            i = i15 + 1;
            this.l0 = i;
            this.h0 = i15;
        }
        this.l0 = i + 1;
        this.V = i;
        c38 c38Var = this.F;
        if (c38Var != null) {
            c38Var.post(new l28(this, (byte) 1));
        }
    }

    public final void l(c38 c38Var) {
        int i;
        int i2 = cmb.c6;
        d38 d38Var = this.q0;
        int themedColor = d38Var.getThemedColor(i2);
        d38Var.getThemedColor(cmb.Z6);
        int themedColor2 = d38Var.getThemedColor(cmb.y6);
        int themedColor3 = d38Var.getThemedColor(cmb.F6);
        c38Var.w.setColor(themedColor);
        c38Var.y = cmb.p1(0.06f, themedColor3);
        c38Var.E = themedColor2;
        c38Var.F = themedColor3;
        fv fvVar = c38Var.a;
        for (int i3 = 0; i3 < fvVar.getChildCount(); i3++) {
            View childAt = fvVar.getChildAt(i3);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == c38Var.d) {
                    i = c38Var.F;
                } else {
                    i = c38Var.E;
                }
                textView.setTextColor(i);
                childAt.invalidate();
            }
        }
        fvVar.invalidate();
        c38Var.invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z = this.n0;
        View view = this.x;
        m28 m28Var = this.b;
        if (z) {
            super.onMeasure(i, i2);
            r28 r28Var = this.w;
            this.o0 = a.getCurrentActionBarHeight() + r28Var.getMeasuredHeight() + gm.m;
            ((ViewGroup.MarginLayoutParams) r28Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + gm.m;
            ((ViewGroup.MarginLayoutParams) m28Var.getLayoutParams()).topMargin = this.o0 - gm.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.o0 - gm.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.y.getLayoutParams()).topMargin = this.o0 - gm.L(16.0f);
            m28Var.setPadding(m28Var.getPaddingLeft(), gm.L(16.0f), m28Var.getPaddingRight(), m28Var.getPaddingBottom());
        } else {
            this.o0 = gm.L(230.0f) + gm.m;
            ((ViewGroup.MarginLayoutParams) m28Var.getLayoutParams()).topMargin = this.o0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.o0 - gm.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.o0;
        }
        super.onMeasure(i, i2);
    }
}
