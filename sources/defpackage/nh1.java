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
import org.telegram.ui.ActionBar.d;
public class nh1 extends d implements gk7 {
    public TLRPC.EmojiStatus E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public TLRPC.WallPaper H;
    public Drawable I;
    public SpannableStringBuilder J;
    public boolean K;
    public oy8 L;
    public r7 M;
    public o39 N;
    public ah1 O;
    public FrameLayout P;
    public u41 Q;
    public wg1 R;
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
    public d m0;
    public long n;
    public xg1 n0;
    public float o0;
    public ValueAnimator p0;
    public boolean q0;
    public int r;
    public wjb r0;
    public int s;
    public final SparseIntArray s0;
    public final m17 t0;
    public final m17 u0;
    public final m17 v0;
    public long w;
    public final m17 w0;
    public long x;
    public final Drawable x0;
    public TLRPC.EmojiStatus y;
    public final Drawable y0;
    public final Paint z0;

    public nh1(long j) {
        super(null);
        boolean o = bkb.I.o();
        this.K = o;
        this.S = 0;
        this.q0 = o;
        this.s0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.z0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(bkb.v0(bkb.c7, this.resourceProvider));
        this.x0 = a.b.getDrawable(2131232096).mutate();
        this.y0 = a.b.getDrawable(2131232182).mutate();
        this.a = j;
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j));
        if (K0 != null) {
            this.b = K0.level;
        }
        na7.q1(this.currentAccount).E0().a(j, new x0(this, K0, (byte) 14));
        this.resourceProvider = new mh1(this);
        this.t0 = new m17(0, false, false, this.resourceProvider);
        this.u0 = new m17(0, false, true, this.resourceProvider);
        this.v0 = new m17(0, true, false, this.resourceProvider);
        this.w0 = new m17(0, true, true, this.resourceProvider);
    }

    public static void e1(View view) {
        if (view instanceof bh1) {
            ((bh1) view).updateColors();
        } else if (view instanceof wgb) {
            ((wgb) view).updateColors();
        } else if (view instanceof eh1) {
            ((eh1) view).updateColors();
        } else if (view instanceof lh1) {
            ((lh1) view).updateColors();
        }
    }

    public void A0() {
        o39 o39Var = new o39(getParentActivity(), this.resourceProvider);
        this.N = o39Var;
        o39Var.setSections(false);
    }

    public final View B0(int i) {
        for (int i2 = 0; i2 < this.N.getChildCount(); i2++) {
            View childAt = this.N.getChildAt(i2);
            this.N.getClass();
            if (RecyclerView.R(childAt) == i) {
                return childAt;
            }
        }
        return null;
    }

    public int C0() {
        return getMessagesController().k4.g2.f();
    }

    public int D0() {
        return 0;
    }

    public int E0() {
        return 0;
    }

    public final TLRPC.Document F0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet a0 = getMediaDataController().a0(stickerSet);
            if (!a0.documents.isEmpty()) {
                return a0.documents.get(0);
            }
        }
        return null;
    }

    public final long G0(TLRPC.StickerSet stickerSet) {
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

    public int H0() {
        return 2131752400;
    }

    public int I0() {
        return getMessagesController().k4.X1.f();
    }

    public int J0() {
        return 2131752401;
    }

    public int K0() {
        return 0;
    }

    public int L0() {
        return 3;
    }

    public int M0() {
        return getMessagesController().k4.W1.f();
    }

    public int N0() {
        return 2131752308;
    }

    public int O0() {
        return 0;
    }

    public int P0() {
        return 0;
    }

    public int Q0() {
        return 2131752251;
    }

    public int R0() {
        return getMessagesController().k4.f2.f();
    }

    public int S0() {
        return 2131752252;
    }

    public final boolean T0() {
        if (this.e == this.f && this.h == this.n && this.r == this.s && this.w == this.x && cf3.a(this.y, this.E) && je2.t(this.F, this.G)) {
            return false;
        }
        return true;
    }

    public boolean U0() {
        return false;
    }

    public final void V0(org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh1.V0(org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public final void W0(defpackage.ng1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh1.W0(ng1):void");
    }

    public final void X0() {
        wjb wjbVar = this.resourceProvider;
        if (wjbVar instanceof mh1) {
            nh1 nh1Var = ((mh1) wjbVar).a;
            nh1Var.K = !nh1Var.K;
            nh1Var.j1();
            nh1Var.f1(false);
        } else {
            this.K = !this.K;
            j1();
        }
        a1(this.K, true);
        f1(false);
        bkb.Dm++;
    }

    public final int Y0() {
        da7 d;
        da7 da7Var = null;
        int i = 0;
        if (this.e != this.f) {
            ea7 ea7Var = getMessagesController().E3;
            if (ea7Var == null) {
                d = null;
            } else {
                d = ea7Var.d(this.f);
            }
            if (d != null) {
                i = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.n) {
            i = Math.max(i, getMessagesController().k4.V1.f());
        }
        if (this.r != this.s) {
            ea7 ea7Var2 = getMessagesController().F3;
            if (ea7Var2 != null) {
                da7Var = ea7Var2.d(this.s);
            }
            if (da7Var != null) {
                i = Math.max(i, da7Var.l(this.d));
            }
        }
        if (this.w != this.x) {
            i = Math.max(i, M0());
        }
        if (!cf3.a(this.y, this.E)) {
            i = Math.max(i, I0());
        }
        if (!je2.t(this.F, this.G)) {
            return Math.max(i, R0());
        }
        return i;
    }

    public final void a1(boolean z, boolean z2) {
        int i;
        if (this.q0 != z) {
            this.q0 = z;
            int i2 = 0;
            if (z2) {
                oy8 oy8Var = this.L;
                if (z) {
                    i2 = oy8Var.e[0];
                }
                oy8Var.K(i2);
                oy8 oy8Var2 = this.L;
                if (oy8Var2 != null) {
                    oy8Var2.start();
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
            r7 r7Var = this.M;
            if (r7Var != null) {
                r7Var.invalidate();
            }
        }
    }

    public final void b1() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = k96.M0(2131752414, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131752413, null);
        alertDialog$Builder.g(k96.M0(2131751357, null), new ed(this) {
            public final nh1 b;

            {
                this.b = this;
            }

            @Override
            public final void u(hd hdVar2, int i) {
                byte b = r2;
                nh1 nh1Var = this.b;
                switch (b) {
                    case 0:
                        nh1Var.finishFragment();
                        return;
                    default:
                        nh1Var.z0();
                        return;
                }
            }
        });
        alertDialog$Builder.j(k96.M0(2131754213, null), new ed(this) {
            public final nh1 b;

            {
                this.b = this;
            }

            @Override
            public final void u(hd hdVar2, int i) {
                byte b = r2;
                nh1 nh1Var = this.b;
                switch (b) {
                    case 0:
                        nh1Var.finishFragment();
                        return;
                    default:
                        nh1Var.z0();
                        return;
                }
            }
        });
        showDialog(hdVar);
        zkb.X((TextView) hdVar.c(-2), bkb.p7, getResourceProvider());
    }

    public final void c1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-this.a));
            this.c = tL_premium_boostsStatus;
            int i = tL_premium_boostsStatus.level;
            this.b = i;
            if (K0 != null) {
                K0.level = i;
            }
            ah1 ah1Var = this.O;
            if (ah1Var != null) {
                ah1Var.f();
            }
            d1(true);
        }
    }

    @Override
    public View createView(Context context) {
        r7 d;
        float f;
        na7 messagesController = getMessagesController();
        long j = -this.a;
        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
        if (K0 != null) {
            int F = hc2.F(K0);
            this.f = F;
            this.e = F;
            long G = hc2.G(K0);
            this.n = G;
            this.h = G;
            int I = hc2.I(K0);
            this.s = I;
            this.r = I;
            long J = hc2.J(K0);
            this.x = J;
            this.w = J;
            TLRPC.EmojiStatus emojiStatus = K0.emoji_status;
            this.E = emojiStatus;
            this.y = emojiStatus;
        }
        TLRPC.ChatFull L0 = getMessagesController().L0(j);
        if (L0 != null) {
            TLRPC.WallPaper wallPaper = L0.wallpaper;
            this.G = wallPaper;
            this.F = wallPaper;
            String h = je2.h(wallPaper);
            if (h != null && h.length() == 0) {
                this.H = this.F;
            }
        }
        r8 r8Var = new r8(this, (byte) 20);
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            phaVar.setBackButtonImage(2131231243);
            this.simpleActionBar.setTitle(k96.M0(2131752415, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(r8Var);
        } else {
            this.actionBar.setBackButtonImage(2131231243);
            this.actionBar.setTitle(k96.M0(2131752415, null));
            this.actionBar.setActionBarMenuOnItemClick(r8Var);
        }
        oy8 oy8Var = new oy8(2131624235, gl.L(28.0f), gl.L(28.0f), true, null);
        this.L = oy8Var;
        oy8Var.h = true;
        if (!this.K) {
            oy8Var.K(0);
            this.L.H(0);
        } else {
            oy8Var.H(35);
            this.L.K(36);
        }
        this.L.a0 = true;
        int v0 = bkb.v0(bkb.I9, this.resourceProvider);
        this.L.L(v0, "Sunny");
        this.L.L(v0, "Path 6");
        this.L.L(v0, "Path");
        this.L.L(v0, "Path 5");
        pha phaVar2 = this.simpleActionBar;
        if (phaVar2 != null) {
            wha t = phaVar2.t();
            oy8 oy8Var2 = this.L;
            t.getClass();
            d = t.b(1, 0, null, oy8Var2, gl.L(48.0f), null);
        } else {
            d = this.actionBar.t().d(1, this.L);
        }
        this.M = d;
        FrameLayout frameLayout = new FrameLayout(context);
        i1();
        A0();
        if (!this.d) {
            setHasOwnBackground(true);
            this.N.setSectionsDrawBackground(true);
        } else {
            this.N.setBackgroundColor(getThemedColor(bkb.Z6));
        }
        o39 o39Var = this.N;
        ah1 ah1Var = new ah1(this);
        this.O = ah1Var;
        o39Var.setAdapter(ah1Var);
        new r35(3);
        this.N.setLayoutManager(new t26());
        o39 o39Var2 = this.N;
        if (this.d) {
            f = 68.0f;
        } else {
            f = 0.0f;
        }
        frameLayout.addView(o39Var2, nme.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, f));
        this.N.setOnItemClickListener(new k0(this, L0, (byte) 5));
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        this.N.setItemAnimator(gb3Var);
        u41 u41Var = new u41(this.resourceProvider, context, true);
        u41Var.setRoundRadius(24);
        this.Q = u41Var;
        u41Var.i(k96.M0(2131754215, null), false, true);
        this.Q.setOnClickListener(new x91(this, (byte) 5));
        d1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        if (this.d) {
            zkb.h(bkb.Z6, getResourceProvider(), frameLayout2);
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.P));
        }
        this.P.addView(this.Q, nme.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.P, nme.e(-1, 68, 80));
        setBulletinDelegate(new s10(this, (byte) 4));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public void d1(boolean z) {
        if (this.Q != null && this.c != null) {
            int Y0 = Y0();
            if (this.b >= Y0) {
                this.Q.g(null, z);
                return;
            }
            if (this.J == null) {
                this.J = new SpannableStringBuilder("l");
                cm2 cm2Var = new cm2(2131231980, 0);
                cm2Var.n = 1;
                this.J.setSpan(cm2Var, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) k96.G(Y0, "BoostLevelRequired", new Object[0]));
            this.Q.g(spannableStringBuilder, z);
        }
    }

    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.q3;
        long j = this.a;
        if (i == i3) {
            if (j == ((Long) objArr[2]).longValue()) {
                c1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i == kk7.W2) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().E0().a(j, new rg1(this, (byte) 2));
            }
        } else if (i == kk7.x1 && j == ((Long) objArr[0]).longValue()) {
            ui5 ui5Var = this.parentLayout;
            if (ui5Var != null && ui5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public void f1(boolean z) {
        int themedColor;
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            phaVar.updateColors();
        } else {
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            int i = -1;
            if (this.d && this.s != -1) {
                themedColor = -1;
            } else {
                themedColor = getThemedColor(bkb.z8);
            }
            aVar.setTitleColor(themedColor);
            org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
            if (!this.d || this.s == -1) {
                i = getThemedColor(bkb.u8);
            }
            aVar2.H(i, false);
            this.actionBar.G(getThemedColor(bkb.s8), false);
        }
        if (!z) {
            this.O.f();
            gl.d0(this.N, new bm0(this));
            if (this.d) {
                this.P.setBackgroundColor(getThemedColor(bkb.Z6));
            }
            this.Q.updateColors();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    public final void g1(boolean z) {
        k27 messageObject;
        View B0 = B0(this.T);
        View B02 = B0(this.U ? 1 : 0);
        View B03 = B0(this.V);
        View B04 = B0(this.X);
        if (B0 instanceof tmb) {
            tmb tmbVar = (tmb) B0;
            gb2[] cells = tmbVar.getCells();
            for (int i = 0; i < cells.length; i++) {
                gb2 gb2Var = cells[i];
                if (gb2Var != null && (messageObject = gb2Var.getMessageObject()) != null) {
                    messageObject.e1 = this.f;
                    messageObject.f1 = this.n;
                    cells[i].setAvatar(messageObject);
                    cells[i].invalidate();
                }
            }
            Drawable e = zi8.e(this.I, this.currentAccount, this.G, this.K);
            this.I = e;
            tmbVar.setOverrideBackground(e);
        }
        if (B02 instanceof w08) {
            ((w08) B02).a(this.f, z);
        } else if (B02 instanceof eh1) {
            ((eh1) B02).a(this.f, z);
        }
        if (B03 instanceof bh1) {
            bh1 bh1Var = (bh1) B03;
            bh1Var.a(this.currentAccount, this.f, true);
            bh1Var.c(this.n, false, z);
        }
        if (B04 instanceof lh1) {
            lh1 lh1Var = (lh1) B04;
            String h = je2.h(this.G);
            if (h == null && this.G == null && this.H != null) {
                h = "❌";
            }
            lh1Var.a(h, z);
            lh1Var.setGalleryWallpaper(this.H);
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        if (!this.d) {
            return this.N;
        }
        return null;
    }

    public final void h1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View B0 = B0(this.a0);
        View B02 = B0(this.c0);
        View B03 = B0(this.d0);
        View B04 = B0(this.g0);
        View B05 = B0(this.i0);
        View B06 = B0(this.k0);
        if (B0 instanceof gh1) {
            TLRPC.EmojiStatus emojiStatus = this.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                gh1 gh1Var = (gh1) B0;
                fh1 fh1Var = gh1Var.b;
                da7 a = da7.a(emojiStatus);
                fh1Var.c(a, true);
                gh1Var.a.c(a, true);
                fh1Var.d(((TLRPC.TL_emojiStatusCollectible) this.E).pattern_document_id, true, true);
            } else {
                gh1 gh1Var2 = (gh1) B0;
                fh1 fh1Var2 = gh1Var2.b;
                int i = this.s;
                fh1Var2.b(i, true);
                gh1Var2.a.b(gh1Var2.h.currentAccount, i, true);
                fh1Var2.d(this.x, false, true);
            }
            gh1 gh1Var3 = (gh1) B0;
            fh1 fh1Var3 = gh1Var3.b;
            fh1Var3.e(cf3.f(this.E), false, true);
            fh1Var3.a(this.f);
            gh1Var3.updateColors();
        }
        if (B02 instanceof w08) {
            ((w08) B02).a(this.s, true);
        } else if (B02 instanceof eh1) {
            ((eh1) B02).a(this.f, true);
        }
        if (B03 instanceof bh1) {
            bh1 bh1Var = (bh1) B03;
            bh1Var.a(this.currentAccount, this.s, false);
            bh1Var.c(this.x, false, true);
        }
        if (B04 instanceof bh1) {
            TLRPC.EmojiStatus emojiStatus2 = this.E;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((bh1) B04).b(da7.a(emojiStatus2));
            } else {
                ((bh1) B04).a(this.currentAccount, this.s, false);
            }
            ((bh1) B04).c(cf3.f(this.E), cf3.A(this.E), true);
        }
        boolean z = B05 instanceof bh1;
        long j = this.a;
        if (z) {
            bh1 bh1Var2 = (bh1) B05;
            bh1Var2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull L0 = getMessagesController().L0(-j);
            if (L0 != null && (stickerSet2 = L0.emojiset) != null) {
                bh1Var2.c(G0(stickerSet2), false, false);
            } else {
                bh1Var2.c(0L, false, false);
            }
        }
        if (B06 instanceof bh1) {
            TLRPC.ChatFull L02 = getMessagesController().L0(-j);
            if (L02 != null && (stickerSet = L02.stickerset) != null) {
                ((bh1) B06).d(F0(stickerSet));
            } else {
                ((bh1) B06).c(0L, false, false);
            }
        }
        i1();
    }

    public void i1() {
        ah1 ah1Var;
        ah1 ah1Var2;
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
            if (i >= 0 && (ah1Var2 = this.O) != null) {
                ah1Var2.r(i);
                this.O.g(this.d0);
            }
        } else {
            if (this.f0 >= 0) {
                z = true;
            }
            this.S = 11;
            this.f0 = 10;
            if (!z && (ah1Var = this.O) != null) {
                ah1Var.i(10);
                this.O.g(this.d0);
            }
        }
        int i2 = this.S;
        this.e0 = i2;
        this.g0 = i2 + 1;
        this.S = i2 + 3;
        this.h0 = i2 + 2;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return !this.d;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (T0() && this.b >= Y0()) {
            return false;
        }
        return true;
    }

    public final void j1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh1.j1():void");
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.b >= Y0() && T0()) {
            if (z) {
                b1();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public boolean onFragmentCreate() {
        getMediaDataController().Z0();
        getNotificationCenter().b(this, kk7.W2);
        getNotificationCenter().b(this, kk7.q3);
        getNotificationCenter().b(this, kk7.x1);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.W2);
        getNotificationCenter().n(this, kk7.q3);
        getNotificationCenter().n(this, kk7.x1);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        if (!this.d && this.P != null) {
            int L = gl.L(68.0f) + i4;
            ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.P.setLayoutParams(layoutParams);
            }
            if (this.P.getPaddingLeft() != i || this.P.getPaddingRight() != i3 || this.P.getPaddingBottom() != i4) {
                this.P.setPadding(i, 0, i3, i4);
            }
            dg0.e(this.N, i2, i4, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), gl.L(68.0f));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            y0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        io5 io5Var = this.mSystemInsets;
        onInsets(io5Var.a, io5Var.b, io5Var.c, io5Var.d);
    }

    @Override
    public final void setResourceProvider(wjb wjbVar) {
        this.r0 = wjbVar;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public final void x0() {
        int themedColor;
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar == null) {
            return;
        }
        int i = -1;
        if (this.d && this.s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(bkb.z8);
        }
        aVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
        if (!this.d || this.s == -1) {
            i = getThemedColor(bkb.u8);
        }
        aVar2.H(i, false);
    }

    public void y0() {
        x0();
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            aVar.setBackgroundColor(getThemedColor(bkb.r8));
        }
        o39 o39Var = this.N;
        if (o39Var != null && this.d) {
            o39Var.setBackgroundColor(getThemedColor(bkb.Z6));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(bkb.Z6));
        }
    }

    public final void z0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh1.z0():void");
    }

    public void Z0(int i) {
    }
}
