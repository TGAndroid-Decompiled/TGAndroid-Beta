package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public class wh1 extends e implements fn7 {
    public TLRPC.EmojiStatus E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public TLRPC.WallPaper H;
    public Drawable I;
    public SpannableStringBuilder J;
    public boolean K;
    public b29 L;
    public s7 M;
    public d79 N;
    public jh1 O;
    public FrameLayout P;
    public c51 Q;
    public fh1 R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long a;
    public int a0;
    public int b;
    public boolean b0;
    public TL_stories.TL_premium_boostsStatus c;
    public int c0;
    public boolean d;
    public int d0;
    public int e;
    public int e0;
    public int f;
    public int f0;
    public int g0;
    public long h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public e m0;
    public long n;
    public gh1 n0;
    public float o0;
    public ValueAnimator p0;
    public boolean q0;
    public int r;
    public vnb r0;
    public int s;
    public final SparseIntArray s0;
    public final t37 t0;
    public final t37 u0;
    public final t37 v0;
    public long w;
    public final t37 w0;
    public long x;
    public final Drawable x0;
    public TLRPC.EmojiStatus y;
    public final Drawable y0;
    public final Paint z0;

    public wh1(long j) {
        super(null);
        boolean o = aob.I.o();
        this.K = o;
        this.S = 0;
        this.q0 = o;
        this.s0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.z0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(aob.v0(aob.d7, this.resourceProvider));
        this.x0 = a.b.getDrawable(2131232096).mutate();
        this.y0 = a.b.getDrawable(2131232182).mutate();
        this.a = j;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j));
        if (M0 != null) {
            this.b = M0.level;
        }
        uc7.s1(this.currentAccount).G0().a(j, new y0(this, M0, (byte) 14));
        this.resourceProvider = new vh1(this);
        this.t0 = new t37(0, false, false, this.resourceProvider);
        this.u0 = new t37(0, false, true, this.resourceProvider);
        this.v0 = new t37(0, true, false, this.resourceProvider);
        this.w0 = new t37(0, true, true, this.resourceProvider);
    }

    public static void f1(View view) {
        if (view instanceof kh1) {
            ((kh1) view).updateColors();
        } else if (view instanceof skb) {
            ((skb) view).updateColors();
        } else if (view instanceof nh1) {
            ((nh1) view).updateColors();
        } else if (view instanceof uh1) {
            ((uh1) view).updateColors();
        }
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wh1.A0():void");
    }

    public void B0() {
        d79 d79Var = new d79(getParentActivity(), this.resourceProvider);
        this.N = d79Var;
        d79Var.setSections(false);
    }

    public final View C0(int i) {
        for (int i2 = 0; i2 < this.N.getChildCount(); i2++) {
            View childAt = this.N.getChildAt(i2);
            this.N.getClass();
            if (RecyclerView.S(childAt) == i) {
                return childAt;
            }
        }
        return null;
    }

    public int D0() {
        return getMessagesController().l4.o2.f();
    }

    public int E0() {
        return 0;
    }

    public int F0() {
        return 0;
    }

    public final TLRPC.Document G0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet a0 = getMediaDataController().a0(stickerSet);
            if (!a0.documents.isEmpty()) {
                return a0.documents.get(0);
            }
        }
        return null;
    }

    public final long H0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j = stickerSet.thumb_document_id;
        if (j == 0) {
            TLRPC.TL_messages_stickerSet a0 = getMediaDataController().a0(stickerSet);
            if (!a0.documents.isEmpty()) {
                return a0.documents.get(0).id;
            }
        }
        return j;
    }

    public int I0() {
        return 2131752384;
    }

    public int J0() {
        return getMessagesController().l4.f2.f();
    }

    public int K0() {
        return 2131752385;
    }

    public int L0() {
        return 0;
    }

    public int M0() {
        return 3;
    }

    public int N0() {
        return getMessagesController().l4.e2.f();
    }

    public int O0() {
        return 2131752290;
    }

    public int P0() {
        return 0;
    }

    public int Q0() {
        return 0;
    }

    public int R0() {
        return 2131752228;
    }

    public int S0() {
        return getMessagesController().l4.n2.f();
    }

    public int T0() {
        return 2131752229;
    }

    public final boolean U0() {
        if (this.e == this.f && this.h == this.n && this.r == this.s && this.w == this.x && wf3.a(this.y, this.E) && af2.t(this.F, this.G)) {
            return false;
        }
        return true;
    }

    public boolean V0() {
        return false;
    }

    public final void W0(org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wh1.W0(org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public final void X0(defpackage.wg1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wh1.X0(wg1):void");
    }

    public final void Y0() {
        vnb vnbVar = this.resourceProvider;
        if (vnbVar instanceof vh1) {
            wh1 wh1Var = ((vh1) vnbVar).a;
            wh1Var.K = !wh1Var.K;
            wh1Var.k1();
            wh1Var.g1(false);
        } else {
            this.K = !this.K;
            k1();
        }
        b1(this.K, true);
        g1(false);
        aob.Em++;
    }

    public final int Z0() {
        kc7 d;
        kc7 kc7Var = null;
        int i = 0;
        if (this.e != this.f) {
            lc7 lc7Var = getMessagesController().F3;
            if (lc7Var == null) {
                d = null;
            } else {
                d = lc7Var.d(this.f);
            }
            if (d != null) {
                i = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.n) {
            i = Math.max(i, getMessagesController().l4.d2.f());
        }
        if (this.r != this.s) {
            lc7 lc7Var2 = getMessagesController().G3;
            if (lc7Var2 != null) {
                kc7Var = lc7Var2.d(this.s);
            }
            if (kc7Var != null) {
                i = Math.max(i, kc7Var.l(this.d));
            }
        }
        if (this.w != this.x) {
            i = Math.max(i, N0());
        }
        if (!wf3.a(this.y, this.E)) {
            i = Math.max(i, J0());
        }
        if (!af2.t(this.F, this.G)) {
            return Math.max(i, S0());
        }
        return i;
    }

    public final void b1(boolean z, boolean z2) {
        int i;
        if (this.q0 != z) {
            this.q0 = z;
            int i2 = 0;
            if (z2) {
                b29 b29Var = this.L;
                if (z) {
                    i2 = b29Var.e[0];
                }
                b29Var.K(i2);
                b29 b29Var2 = this.L;
                if (b29Var2 != null) {
                    b29Var2.start();
                    return;
                }
                return;
            }
            if (z) {
                i = this.L.e[0] - 1;
            } else {
                i = 0;
            }
            this.L.I(i, false, true);
            this.L.K(i);
            s7 s7Var = this.M;
            if (s7Var != null) {
                s7Var.invalidate();
            }
        }
    }

    public final void c1() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = ob6.M0(2131752400, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131752399, null);
        alertDialog$Builder.g(ob6.M0(2131751334, null), new fd(this) {
            public final wh1 b;

            {
                this.b = this;
            }

            @Override
            public final void w(id idVar2, int i) {
                byte b = r2;
                wh1 wh1Var = this.b;
                switch (b) {
                    case 0:
                        wh1Var.finishFragment();
                        return;
                    default:
                        wh1Var.A0();
                        return;
                }
            }
        });
        alertDialog$Builder.j(ob6.M0(2131754209, null), new fd(this) {
            public final wh1 b;

            {
                this.b = this;
            }

            @Override
            public final void w(id idVar2, int i) {
                byte b = r2;
                wh1 wh1Var = this.b;
                switch (b) {
                    case 0:
                        wh1Var.finishFragment();
                        return;
                    default:
                        wh1Var.A0();
                        return;
                }
            }
        });
        showDialog(idVar);
        yob.X((TextView) idVar.c(-2), aob.q7, getResourceProvider());
    }

    @Override
    public View createView(Context context) {
        s7 d;
        float f;
        uc7 messagesController = getMessagesController();
        long j = -this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
        if (M0 != null) {
            int F = xc2.F(M0);
            this.f = F;
            this.e = F;
            long G = xc2.G(M0);
            this.n = G;
            this.h = G;
            int I = xc2.I(M0);
            this.s = I;
            this.r = I;
            long J = xc2.J(M0);
            this.x = J;
            this.w = J;
            TLRPC.EmojiStatus emojiStatus = M0.emoji_status;
            this.E = emojiStatus;
            this.y = emojiStatus;
        }
        TLRPC.ChatFull N0 = getMessagesController().N0(j);
        if (N0 != null) {
            TLRPC.WallPaper wallPaper = N0.wallpaper;
            this.G = wallPaper;
            this.F = wallPaper;
            String h = af2.h(wallPaper);
            if (h != null && h.length() == 0) {
                this.H = this.F;
            }
        }
        s8 s8Var = new s8(this, (byte) 21);
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            jlaVar.setBackButtonImage(2131231243);
            this.simpleActionBar.setTitle(ob6.M0(2131752401, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(s8Var);
        } else {
            this.actionBar.setBackButtonImage(2131231243);
            this.actionBar.setTitle(ob6.M0(2131752401, null));
            this.actionBar.setActionBarMenuOnItemClick(s8Var);
        }
        b29 b29Var = new b29(2131624235, hl.L(28.0f), hl.L(28.0f), true, null);
        this.L = b29Var;
        b29Var.h = true;
        if (!this.K) {
            b29Var.K(0);
            this.L.H(0);
        } else {
            b29Var.H(35);
            this.L.K(36);
        }
        this.L.a0 = true;
        int v0 = aob.v0(aob.J9, this.resourceProvider);
        this.L.L(v0, "Sunny");
        this.L.L(v0, "Path 6");
        this.L.L(v0, "Path");
        this.L.L(v0, "Path 5");
        jla jlaVar2 = this.simpleActionBar;
        if (jlaVar2 != null) {
            rla v = jlaVar2.v();
            b29 b29Var2 = this.L;
            v.getClass();
            d = v.b(1, 0, null, b29Var2, hl.L(48.0f), null);
        } else {
            d = this.actionBar.u().d(1, this.L);
        }
        this.M = d;
        FrameLayout frameLayout = new FrameLayout(context);
        j1();
        B0();
        if (!this.d) {
            setHasOwnBackground(true);
            this.N.setSectionsDrawBackground(true);
        } else {
            this.N.setBackgroundColor(getThemedColor(aob.a7));
        }
        d79 d79Var = this.N;
        jh1 jh1Var = new jh1(this);
        this.O = jh1Var;
        d79Var.setAdapter(jh1Var);
        new u55(3);
        this.N.setLayoutManager(new x46());
        d79 d79Var2 = this.N;
        if (this.d) {
            f = 68.0f;
        } else {
            f = 0.0f;
        }
        frameLayout.addView(d79Var2, tre.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, f));
        this.N.setOnItemClickListener(new l0(this, N0, (byte) 5));
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        this.N.setItemAnimator(zb3Var);
        c51 c51Var = new c51(this.resourceProvider, context, true);
        c51Var.setRoundRadius(24);
        this.Q = c51Var;
        c51Var.i(ob6.M0(2131754211, null), false, true);
        this.Q.setOnClickListener(new r81(this, (byte) 7));
        e1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        if (this.d) {
            yob.h(aob.a7, getResourceProvider(), frameLayout2);
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.P));
        }
        this.P.addView(this.Q, tre.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.P, tre.e(-1, 68, 80));
        setBulletinDelegate(new t10(this, (byte) 4));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.a));
            this.c = tL_premium_boostsStatus;
            int i = tL_premium_boostsStatus.level;
            this.b = i;
            if (M0 != null) {
                M0.level = i;
            }
            jh1 jh1Var = this.O;
            if (jh1Var != null) {
                jh1Var.f();
            }
            e1(true);
        }
    }

    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.r3;
        long j = this.a;
        if (i == i3) {
            if (j == ((Long) objArr[2]).longValue()) {
                d1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i == jn7.X2) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().G0().a(j, new ah1(this, (byte) 2));
            }
        } else if (i == jn7.y1 && j == ((Long) objArr[0]).longValue()) {
            wk5 wk5Var = this.parentLayout;
            if (wk5Var != null && wk5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public void e1(boolean z) {
        if (this.Q != null && this.c != null) {
            int Z0 = Z0();
            if (this.b >= Z0) {
                this.Q.g(null, z);
                return;
            }
            if (this.J == null) {
                this.J = new SpannableStringBuilder("l");
                wm2 wm2Var = new wm2(2131231980, 0);
                wm2Var.n = 1;
                this.J.setSpan(wm2Var, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) ob6.G(Z0, "BoostLevelRequired", new Object[0]));
            this.Q.g(spannableStringBuilder, z);
        }
    }

    public void g1(boolean z) {
        int themedColor;
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            jlaVar.updateColors();
        } else {
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            int i = -1;
            if (this.d && this.s != -1) {
                themedColor = -1;
            } else {
                themedColor = getThemedColor(aob.A8);
            }
            aVar.setTitleColor(themedColor);
            org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
            if (!this.d || this.s == -1) {
                i = getThemedColor(aob.v8);
            }
            aVar2.H(i, false);
            this.actionBar.G(getThemedColor(aob.t8), false);
        }
        if (!z) {
            this.O.f();
            hl.d0(this.N, new bm0(this));
            if (this.d) {
                this.P.setBackgroundColor(getThemedColor(aob.a7));
            }
            this.Q.updateColors();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        if (!this.d) {
            return this.N;
        }
        return null;
    }

    public final void h1(boolean z) {
        r47 messageObject;
        View C0 = C0(this.T);
        View C02 = C0(this.U ? 1 : 0);
        View C03 = C0(this.V);
        View C04 = C0(this.X);
        if (C0 instanceof sqb) {
            sqb sqbVar = (sqb) C0;
            wb2[] cells = sqbVar.getCells();
            for (int i = 0; i < cells.length; i++) {
                wb2 wb2Var = cells[i];
                if (wb2Var != null && (messageObject = wb2Var.getMessageObject()) != null) {
                    messageObject.e1 = this.f;
                    messageObject.f1 = this.n;
                    cells[i].setAvatar(messageObject);
                    cells[i].invalidate();
                }
            }
            Drawable e = mm8.e(this.I, this.currentAccount, this.G, this.K);
            this.I = e;
            sqbVar.setOverrideBackground(e);
        }
        if (C02 instanceof d48) {
            ((d48) C02).a(this.f, z);
        } else if (C02 instanceof nh1) {
            ((nh1) C02).a(this.f, z);
        }
        if (C03 instanceof kh1) {
            kh1 kh1Var = (kh1) C03;
            kh1Var.a(this.currentAccount, this.f, true);
            kh1Var.c(this.n, false, z);
        }
        if (C04 instanceof uh1) {
            uh1 uh1Var = (uh1) C04;
            String h = af2.h(this.G);
            if (h == null && this.G == null && this.H != null) {
                h = "❌";
            }
            uh1Var.a(h, z);
            uh1Var.setGalleryWallpaper(this.H);
        }
    }

    public final void i1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View C0 = C0(this.a0);
        View C02 = C0(this.c0);
        View C03 = C0(this.d0);
        View C04 = C0(this.g0);
        View C05 = C0(this.i0);
        View C06 = C0(this.k0);
        if (C0 instanceof ph1) {
            TLRPC.EmojiStatus emojiStatus = this.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                ph1 ph1Var = (ph1) C0;
                oh1 oh1Var = ph1Var.b;
                kc7 a = kc7.a(emojiStatus);
                oh1Var.c(a, true);
                ph1Var.a.c(a, true);
                oh1Var.d(((TLRPC.TL_emojiStatusCollectible) this.E).pattern_document_id, true, true);
            } else {
                ph1 ph1Var2 = (ph1) C0;
                oh1 oh1Var2 = ph1Var2.b;
                int i = this.s;
                oh1Var2.b(i, true);
                ph1Var2.a.b(ph1Var2.h.currentAccount, i, true);
                oh1Var2.d(this.x, false, true);
            }
            ph1 ph1Var3 = (ph1) C0;
            oh1 oh1Var3 = ph1Var3.b;
            oh1Var3.e(wf3.f(this.E), false, true);
            oh1Var3.a(this.f);
            ph1Var3.updateColors();
        }
        if (C02 instanceof d48) {
            ((d48) C02).a(this.s, true);
        } else if (C02 instanceof nh1) {
            ((nh1) C02).a(this.f, true);
        }
        if (C03 instanceof kh1) {
            kh1 kh1Var = (kh1) C03;
            kh1Var.a(this.currentAccount, this.s, false);
            kh1Var.c(this.x, false, true);
        }
        if (C04 instanceof kh1) {
            TLRPC.EmojiStatus emojiStatus2 = this.E;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((kh1) C04).b(kc7.a(emojiStatus2));
            } else {
                ((kh1) C04).a(this.currentAccount, this.s, false);
            }
            ((kh1) C04).c(wf3.f(this.E), wf3.A(this.E), true);
        }
        boolean z = C05 instanceof kh1;
        long j = this.a;
        if (z) {
            kh1 kh1Var2 = (kh1) C05;
            kh1Var2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull N0 = getMessagesController().N0(-j);
            if (N0 != null && (stickerSet2 = N0.emojiset) != null) {
                kh1Var2.c(H0(stickerSet2), false, false);
            } else {
                kh1Var2.c(0L, false, false);
            }
        }
        if (C06 instanceof kh1) {
            TLRPC.ChatFull N02 = getMessagesController().N0(-j);
            if (N02 != null && (stickerSet = N02.stickerset) != null) {
                ((kh1) C06).d(G0(stickerSet));
            } else {
                ((kh1) C06).c(0L, false, false);
            }
        }
        j1();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return !this.d;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (U0() && this.b >= Z0()) {
            return false;
        }
        return true;
    }

    public void j1() {
        jh1 jh1Var;
        jh1 jh1Var2;
        boolean z = false;
        this.T = 0;
        this.U = true;
        this.V = 2;
        this.W = 3;
        this.X = 4;
        this.Y = 5;
        this.Z = 6;
        this.a0 = 7;
        this.c0 = 8;
        this.S = 10;
        this.d0 = 9;
        if (this.x == 0 && this.s < 0 && !(this.E instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i = this.f0;
            this.f0 = -1;
            if (i >= 0 && (jh1Var2 = this.O) != null) {
                jh1Var2.s(i);
                this.O.g(this.d0);
            }
        } else {
            if (this.f0 >= 0) {
                z = true;
            }
            this.S = 11;
            this.f0 = 10;
            if (!z && (jh1Var = this.O) != null) {
                jh1Var.i(10);
                this.O.g(this.d0);
            }
        }
        int i2 = this.S;
        this.e0 = i2;
        this.g0 = i2 + 1;
        this.S = i2 + 3;
        this.h0 = i2 + 2;
    }

    public final void k1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wh1.k1():void");
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.b >= Z0() && U0()) {
            if (z) {
                c1();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public boolean onFragmentCreate() {
        getMediaDataController().Z0();
        getNotificationCenter().b(this, jn7.X2);
        getNotificationCenter().b(this, jn7.r3);
        getNotificationCenter().b(this, jn7.y1);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.X2);
        getNotificationCenter().n(this, jn7.r3);
        getNotificationCenter().n(this, jn7.y1);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        if (!this.d && this.P != null) {
            int L = hl.L(68.0f) + i4;
            ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.P.setLayoutParams(layoutParams);
            }
            if (this.P.getPaddingLeft() != i || this.P.getPaddingRight() != i3 || this.P.getPaddingBottom() != i4) {
                this.P.setPadding(i, 0, i3, i4);
            }
            eg0.g(this.N, i2, i4, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), hl.L(68.0f));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            z0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        mq5 mq5Var = this.mSystemInsets;
        onInsets(mq5Var.a, mq5Var.b, mq5Var.c, mq5Var.d);
    }

    @Override
    public final void setResourceProvider(vnb vnbVar) {
        this.r0 = vnbVar;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public final void y0() {
        int themedColor;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar == null) {
            return;
        }
        int i = -1;
        if (this.d && this.s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(aob.A8);
        }
        aVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
        if (!this.d || this.s == -1) {
            i = getThemedColor(aob.v8);
        }
        aVar2.H(i, false);
    }

    public void z0() {
        y0();
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            aVar.setBackgroundColor(getThemedColor(aob.s8));
        }
        d79 d79Var = this.N;
        if (d79Var != null && this.d) {
            d79Var.setBackgroundColor(getThemedColor(aob.a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(aob.a7));
        }
    }

    public void a1(int i) {
    }
}
