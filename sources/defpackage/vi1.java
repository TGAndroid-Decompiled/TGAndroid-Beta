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
public class vi1 extends d implements jm7 {
    public TLRPC.EmojiStatus E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public TLRPC.WallPaper H;
    public Drawable I;
    public SpannableStringBuilder J;
    public boolean K;
    public p09 L;
    public r7 M;
    public r59 N;
    public ii1 O;
    public FrameLayout P;
    public b61 Q;
    public ei1 R;
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
    public fi1 n0;
    public float o0;
    public ValueAnimator p0;
    public boolean q0;
    public int r;
    public ylb r0;
    public int s;
    public final SparseIntArray s0;
    public final m37 t0;
    public final m37 u0;
    public final m37 v0;
    public long w;
    public final m37 w0;
    public long x;
    public final Drawable x0;
    public TLRPC.EmojiStatus y;
    public final Drawable y0;
    public final Paint z0;

    public vi1(long j) {
        super(null);
        boolean o = cmb.I.o();
        this.K = o;
        this.S = 0;
        this.q0 = o;
        this.s0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.z0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(cmb.v0(cmb.c7, this.resourceProvider));
        this.x0 = a.b.getDrawable(2131232097).mutate();
        this.y0 = a.b.getDrawable(2131232183).mutate();
        this.a = j;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j));
        if (L0 != null) {
            this.b = L0.level;
        }
        oc7.r1(this.currentAccount).F0().a(j, new x0(this, L0, (byte) 15));
        this.resourceProvider = new ui1(this);
        this.t0 = new m37(0, false, false, this.resourceProvider);
        this.u0 = new m37(0, false, true, this.resourceProvider);
        this.v0 = new m37(0, true, false, this.resourceProvider);
        this.w0 = new m37(0, true, true, this.resourceProvider);
    }

    public static void f1(View view) {
        if (view instanceof ji1) {
            ((ji1) view).updateColors();
        } else if (view instanceof xib) {
            ((xib) view).updateColors();
        } else if (view instanceof mi1) {
            ((mi1) view).updateColors();
        } else if (view instanceof ti1) {
            ((ti1) view).updateColors();
        }
    }

    public final void A0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi1.A0():void");
    }

    public void B0() {
        r59 r59Var = new r59(getParentActivity(), this.resourceProvider);
        this.N = r59Var;
        r59Var.setSections(false);
    }

    public final View C0(int i) {
        for (int i2 = 0; i2 < this.N.getChildCount(); i2++) {
            View childAt = this.N.getChildAt(i2);
            this.N.getClass();
            if (RecyclerView.R(childAt) == i) {
                return childAt;
            }
        }
        return null;
    }

    public int D0() {
        return getMessagesController().l4.g2.f();
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
        return 2131752356;
    }

    public int J0() {
        return getMessagesController().l4.X1.f();
    }

    public int K0() {
        return 2131752357;
    }

    public int L0() {
        return 0;
    }

    public int M0() {
        return 3;
    }

    public int N0() {
        return getMessagesController().l4.W1.f();
    }

    public int O0() {
        return 2131752262;
    }

    public int P0() {
        return 0;
    }

    public int Q0() {
        return 0;
    }

    public int R0() {
        return 2131752200;
    }

    public int S0() {
        return getMessagesController().l4.f2.f();
    }

    public int T0() {
        return 2131752201;
    }

    public final boolean U0() {
        if (this.e == this.f && this.h == this.n && this.r == this.s && this.w == this.x && pg3.a(this.y, this.E) && uf2.t(this.F, this.G)) {
            return false;
        }
        return true;
    }

    public boolean V0() {
        return false;
    }

    public final void W0(org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi1.W0(org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public final void X0(defpackage.vh1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi1.X0(vh1):void");
    }

    public final void Y0() {
        ylb ylbVar = this.resourceProvider;
        if (ylbVar instanceof ui1) {
            vi1 vi1Var = ((ui1) ylbVar).a;
            vi1Var.K = !vi1Var.K;
            vi1Var.k1();
            vi1Var.g1(false);
        } else {
            this.K = !this.K;
            k1();
        }
        b1(this.K, true);
        g1(false);
        cmb.Dm++;
    }

    public final int Z0() {
        ec7 d;
        ec7 ec7Var = null;
        int i = 0;
        if (this.e != this.f) {
            fc7 fc7Var = getMessagesController().E3;
            if (fc7Var == null) {
                d = null;
            } else {
                d = fc7Var.d(this.f);
            }
            if (d != null) {
                i = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.n) {
            i = Math.max(i, getMessagesController().l4.V1.f());
        }
        if (this.r != this.s) {
            fc7 fc7Var2 = getMessagesController().F3;
            if (fc7Var2 != null) {
                ec7Var = fc7Var2.d(this.s);
            }
            if (ec7Var != null) {
                i = Math.max(i, ec7Var.l(this.d));
            }
        }
        if (this.w != this.x) {
            i = Math.max(i, N0());
        }
        if (!pg3.a(this.y, this.E)) {
            i = Math.max(i, J0());
        }
        if (!uf2.t(this.F, this.G)) {
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
                p09 p09Var = this.L;
                if (z) {
                    i2 = p09Var.e[0];
                }
                p09Var.K(i2);
                p09 p09Var2 = this.L;
                if (p09Var2 != null) {
                    p09Var2.start();
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

    public final void c1() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
        String M0 = jb6.M0(2131752372, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131752371, null);
        alertDialog$Builder.g(jb6.M0(2131751306, null), new ee(this) {
            public final vi1 b;

            {
                this.b = this;
            }

            @Override
            public final void r(he heVar2, int i) {
                byte b = r2;
                vi1 vi1Var = this.b;
                switch (b) {
                    case 0:
                        vi1Var.finishFragment();
                        return;
                    default:
                        vi1Var.A0();
                        return;
                }
            }
        });
        alertDialog$Builder.j(jb6.M0(2131754181, null), new ee(this) {
            public final vi1 b;

            {
                this.b = this;
            }

            @Override
            public final void r(he heVar2, int i) {
                byte b = r2;
                vi1 vi1Var = this.b;
                switch (b) {
                    case 0:
                        vi1Var.finishFragment();
                        return;
                    default:
                        vi1Var.A0();
                        return;
                }
            }
        });
        showDialog(heVar);
        anb.X((TextView) heVar.c(-2), cmb.p7, getResourceProvider());
    }

    @Override
    public View createView(Context context) {
        r7 d;
        float f;
        oc7 messagesController = getMessagesController();
        long j = -this.a;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j));
        if (L0 != null) {
            int F = sd2.F(L0);
            this.f = F;
            this.e = F;
            long G = sd2.G(L0);
            this.n = G;
            this.h = G;
            int I = sd2.I(L0);
            this.s = I;
            this.r = I;
            long J = sd2.J(L0);
            this.x = J;
            this.w = J;
            TLRPC.EmojiStatus emojiStatus = L0.emoji_status;
            this.E = emojiStatus;
            this.y = emojiStatus;
        }
        TLRPC.ChatFull M0 = getMessagesController().M0(j);
        if (M0 != null) {
            TLRPC.WallPaper wallPaper = M0.wallpaper;
            this.G = wallPaper;
            this.F = wallPaper;
            String h = uf2.h(wallPaper);
            if (h != null && h.length() == 0) {
                this.H = this.F;
            }
        }
        r8 r8Var = new r8(this, (byte) 21);
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            rjaVar.setBackButtonImage(2131231244);
            this.simpleActionBar.setTitle(jb6.M0(2131752373, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(r8Var);
        } else {
            this.actionBar.setBackButtonImage(2131231244);
            this.actionBar.setTitle(jb6.M0(2131752373, null));
            this.actionBar.setActionBarMenuOnItemClick(r8Var);
        }
        p09 p09Var = new p09(2131624235, gm.L(28.0f), gm.L(28.0f), true, null);
        this.L = p09Var;
        p09Var.h = true;
        if (!this.K) {
            p09Var.K(0);
            this.L.H(0);
        } else {
            p09Var.H(35);
            this.L.K(36);
        }
        this.L.a0 = true;
        int v0 = cmb.v0(cmb.I9, this.resourceProvider);
        this.L.L(v0, "Sunny");
        this.L.L(v0, "Path 6");
        this.L.L(v0, "Path");
        this.L.L(v0, "Path 5");
        rja rjaVar2 = this.simpleActionBar;
        if (rjaVar2 != null) {
            yja t = rjaVar2.t();
            p09 p09Var2 = this.L;
            t.getClass();
            d = t.b(1, 0, null, p09Var2, gm.L(48.0f), null);
        } else {
            d = this.actionBar.t().d(1, this.L);
        }
        this.M = d;
        FrameLayout frameLayout = new FrameLayout(context);
        j1();
        B0();
        if (!this.d) {
            setHasOwnBackground(true);
            this.N.setSectionsDrawBackground(true);
        } else {
            this.N.setBackgroundColor(getThemedColor(cmb.Z6));
        }
        r59 r59Var = this.N;
        ii1 ii1Var = new ii1(this);
        this.O = ii1Var;
        r59Var.setAdapter(ii1Var);
        new q55(3);
        this.N.setLayoutManager(new u46());
        r59 r59Var2 = this.N;
        if (this.d) {
            f = 68.0f;
        } else {
            f = 0.0f;
        }
        frameLayout.addView(r59Var2, qoe.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, f));
        this.N.setOnItemClickListener(new k0(this, M0, (byte) 5));
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        this.N.setItemAnimator(sc3Var);
        b61 b61Var = new b61(this.resourceProvider, context, true);
        b61Var.setRoundRadius(24);
        this.Q = b61Var;
        b61Var.i(jb6.M0(2131754183, null), false, true);
        this.Q.setOnClickListener(new k81(this, (byte) 8));
        e1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        if (this.d) {
            anb.h(cmb.Z6, getResourceProvider(), frameLayout2);
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.P));
        }
        this.P.addView(this.Q, qoe.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.P, qoe.e(-1, 68, 80));
        setBulletinDelegate(new s20(this, (byte) 4));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.a));
            this.c = tL_premium_boostsStatus;
            int i = tL_premium_boostsStatus.level;
            this.b = i;
            if (L0 != null) {
                L0.level = i;
            }
            ii1 ii1Var = this.O;
            if (ii1Var != null) {
                ii1Var.f();
            }
            e1(true);
        }
    }

    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.r3;
        long j = this.a;
        if (i == i3) {
            if (j == ((Long) objArr[2]).longValue()) {
                d1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i == nm7.X2) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().F0().a(j, new zh1(this, (byte) 2));
            }
        } else if (i == nm7.y1 && j == ((Long) objArr[0]).longValue()) {
            tk5 tk5Var = this.parentLayout;
            if (tk5Var != null && tk5Var.getLastFragment() == this) {
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
                pn2 pn2Var = new pn2(2131231981, 0);
                pn2Var.n = 1;
                this.J.setSpan(pn2Var, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) jb6.G(Z0, "BoostLevelRequired", new Object[0]));
            this.Q.g(spannableStringBuilder, z);
        }
    }

    public void g1(boolean z) {
        int themedColor;
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            rjaVar.updateColors();
        } else {
            org.telegram.ui.ActionBar.a aVar = this.actionBar;
            int i = -1;
            if (this.d && this.s != -1) {
                themedColor = -1;
            } else {
                themedColor = getThemedColor(cmb.z8);
            }
            aVar.setTitleColor(themedColor);
            org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
            if (!this.d || this.s == -1) {
                i = getThemedColor(cmb.u8);
            }
            aVar2.H(i, false);
            this.actionBar.G(getThemedColor(cmb.s8), false);
        }
        if (!z) {
            this.O.f();
            gm.d0(this.N, new bn0(this));
            if (this.d) {
                this.P.setBackgroundColor(getThemedColor(cmb.Z6));
            }
            this.Q.updateColors();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        if (!this.d) {
            return this.N;
        }
        return null;
    }

    public final void h1(boolean z) {
        k47 messageObject;
        View C0 = C0(this.T);
        View C02 = C0(this.U ? 1 : 0);
        View C03 = C0(this.V);
        View C04 = C0(this.X);
        if (C0 instanceof uob) {
            uob uobVar = (uob) C0;
            rc2[] cells = uobVar.getCells();
            for (int i = 0; i < cells.length; i++) {
                rc2 rc2Var = cells[i];
                if (rc2Var != null && (messageObject = rc2Var.getMessageObject()) != null) {
                    messageObject.e1 = this.f;
                    messageObject.f1 = this.n;
                    cells[i].setAvatar(messageObject);
                    cells[i].invalidate();
                }
            }
            Drawable e = cl8.e(this.I, this.currentAccount, this.G, this.K);
            this.I = e;
            uobVar.setOverrideBackground(e);
        }
        if (C02 instanceof z28) {
            ((z28) C02).a(this.f, z);
        } else if (C02 instanceof mi1) {
            ((mi1) C02).a(this.f, z);
        }
        if (C03 instanceof ji1) {
            ji1 ji1Var = (ji1) C03;
            ji1Var.a(this.currentAccount, this.f, true);
            ji1Var.c(this.n, false, z);
        }
        if (C04 instanceof ti1) {
            ti1 ti1Var = (ti1) C04;
            String h = uf2.h(this.G);
            if (h == null && this.G == null && this.H != null) {
                h = "❌";
            }
            ti1Var.a(h, z);
            ti1Var.setGalleryWallpaper(this.H);
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
        if (C0 instanceof oi1) {
            TLRPC.EmojiStatus emojiStatus = this.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                oi1 oi1Var = (oi1) C0;
                ni1 ni1Var = oi1Var.b;
                ec7 a = ec7.a(emojiStatus);
                ni1Var.c(a, true);
                oi1Var.a.c(a, true);
                ni1Var.d(((TLRPC.TL_emojiStatusCollectible) this.E).pattern_document_id, true, true);
            } else {
                oi1 oi1Var2 = (oi1) C0;
                ni1 ni1Var2 = oi1Var2.b;
                int i = this.s;
                ni1Var2.b(i, true);
                oi1Var2.a.b(oi1Var2.h.currentAccount, i, true);
                ni1Var2.d(this.x, false, true);
            }
            oi1 oi1Var3 = (oi1) C0;
            ni1 ni1Var3 = oi1Var3.b;
            ni1Var3.e(pg3.f(this.E), false, true);
            ni1Var3.a(this.f);
            oi1Var3.updateColors();
        }
        if (C02 instanceof z28) {
            ((z28) C02).a(this.s, true);
        } else if (C02 instanceof mi1) {
            ((mi1) C02).a(this.f, true);
        }
        if (C03 instanceof ji1) {
            ji1 ji1Var = (ji1) C03;
            ji1Var.a(this.currentAccount, this.s, false);
            ji1Var.c(this.x, false, true);
        }
        if (C04 instanceof ji1) {
            TLRPC.EmojiStatus emojiStatus2 = this.E;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((ji1) C04).b(ec7.a(emojiStatus2));
            } else {
                ((ji1) C04).a(this.currentAccount, this.s, false);
            }
            ((ji1) C04).c(pg3.f(this.E), pg3.A(this.E), true);
        }
        boolean z = C05 instanceof ji1;
        long j = this.a;
        if (z) {
            ji1 ji1Var2 = (ji1) C05;
            ji1Var2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull M0 = getMessagesController().M0(-j);
            if (M0 != null && (stickerSet2 = M0.emojiset) != null) {
                ji1Var2.c(H0(stickerSet2), false, false);
            } else {
                ji1Var2.c(0L, false, false);
            }
        }
        if (C06 instanceof ji1) {
            TLRPC.ChatFull M02 = getMessagesController().M0(-j);
            if (M02 != null && (stickerSet = M02.stickerset) != null) {
                ((ji1) C06).d(G0(stickerSet));
            } else {
                ((ji1) C06).c(0L, false, false);
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
        ii1 ii1Var;
        ii1 ii1Var2;
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
            if (i >= 0 && (ii1Var2 = this.O) != null) {
                ii1Var2.s(i);
                this.O.g(this.d0);
            }
        } else {
            if (this.f0 >= 0) {
                z = true;
            }
            this.S = 11;
            this.f0 = 10;
            if (!z && (ii1Var = this.O) != null) {
                ii1Var.i(10);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi1.k1():void");
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
        getNotificationCenter().b(this, nm7.X2);
        getNotificationCenter().b(this, nm7.r3);
        getNotificationCenter().b(this, nm7.y1);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.X2);
        getNotificationCenter().n(this, nm7.r3);
        getNotificationCenter().n(this, nm7.y1);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        if (!this.d && this.P != null) {
            int L = gm.L(68.0f) + i4;
            ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.P.setLayoutParams(layoutParams);
            }
            if (this.P.getPaddingLeft() != i || this.P.getPaddingRight() != i3 || this.P.getPaddingBottom() != i4) {
                this.P.setPadding(i, 0, i3, i4);
            }
            eh0.e(this.N, i2, i4, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), gm.L(68.0f));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            z0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        iq5 iq5Var = this.mSystemInsets;
        onInsets(iq5Var.a, iq5Var.b, iq5Var.c, iq5Var.d);
    }

    @Override
    public final void setResourceProvider(ylb ylbVar) {
        this.r0 = ylbVar;
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
            themedColor = getThemedColor(cmb.z8);
        }
        aVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.a aVar2 = this.actionBar;
        if (!this.d || this.s == -1) {
            i = getThemedColor(cmb.u8);
        }
        aVar2.H(i, false);
    }

    public void z0() {
        y0();
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null) {
            aVar.setBackgroundColor(getThemedColor(cmb.r8));
        }
        r59 r59Var = this.N;
        if (r59Var != null && this.d) {
            r59Var.setBackgroundColor(getThemedColor(cmb.Z6));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(cmb.Z6));
        }
    }

    public void a1(int i) {
    }
}
