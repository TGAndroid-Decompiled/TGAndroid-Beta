package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ak6 extends d implements jm7 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public int Y;
    public Drawable Z;
    public zj6 a;
    public Drawable a0;
    public r59 b;
    public Drawable b0;
    public TLRPC.Chat c;
    public boolean c0;
    public TLRPC.ChatFull d;
    public boolean d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean e0;
    public final long f;
    public boolean f0;
    public final int g0;
    public final boolean h;
    public boolean h0;
    public w49 i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public final HashMap l0;
    public xs5 m0;
    public final long n;
    public final ArrayList n0;
    public long o0;
    public boolean p0;
    public final boolean q0;
    public int r;
    public final qj6 r0;
    public int s;
    public boolean s0;
    public final rj6 t0;
    public final po u0;
    public int w;
    public int x;
    public int y;

    public ak6(long j, int i, long j2) {
        super(null);
        boolean z;
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.l0 = new HashMap();
        this.n0 = new ArrayList();
        this.r0 = new qj6(this);
        boolean z2 = false;
        this.s0 = false;
        this.t0 = new rj6(this);
        this.u0 = new po(null);
        this.n = j;
        this.g0 = i;
        TLRPC.Chat L0 = oc7.r1(this.currentAccount).L0(Long.valueOf(j));
        this.c = L0;
        if (sd2.T(L0) && !this.c.megagroup) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        if (j2 == 0) {
            j2 = z8c.h(getAccountInstance().a).n;
            this.f = j2;
        } else {
            this.f = j2;
        }
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j2));
        if (j2 == z8c.h(getAccountInstance().a).n || (W1 != null && !W1.bot)) {
            z2 = true;
        }
        this.q0 = z2;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.Ki));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.n6));
        hashSet.add(Integer.valueOf(cmb.u6));
        hashSet.add(Integer.valueOf(cmb.t6));
        hashSet.add(Integer.valueOf(cmb.U8));
        hashSet.add(Integer.valueOf(cmb.f9));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(jb6.M0(2131748897, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 8));
        int i = 2;
        ne6 ne6Var = new ne6((byte) 2, context, this);
        this.fragmentView = ne6Var;
        ne6Var.setTag(Integer.valueOf(cmb.Z6));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.b.setSectionsDrawBackground(true);
        zs zsVar = new zs((byte) 8, 1, false);
        this.b.setLayoutManager(zsVar);
        r59 r59Var2 = this.b;
        zj6 zj6Var = new zj6(this, context);
        this.a = zj6Var;
        r59Var2.setAdapter(zj6Var);
        this.b.setOnScrollListener(new bk1(this, zsVar, (byte) 4));
        this.i0 = new w49(this.b, false);
        sc3 sc3Var = new sc3();
        sc3Var.n(420L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        this.b.setItemAnimator(sc3Var);
        r59 r59Var3 = this.b;
        if (jb6.a0) {
            i = 1;
        }
        r59Var3.setVerticalScrollbarPosition(i);
        frameLayout.addView(this.b, qoe.c(-1.0f, -1));
        this.b.setOnItemClickListener(new k0(this, context, (byte) 15));
        this.b.setOnItemLongClickListener(new nj6(this));
        this.Z = context.getDrawable(2131232211);
        this.a0 = context.getDrawable(2131232212);
        this.b0 = context.getDrawable(2131231614);
        this.Z.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        o0(true);
        this.o0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0() {
        r59 r59Var = this.b;
        if (r59Var != null) {
            int childCount = r59Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.b.getChildAt(i);
                if (childAt instanceof f56) {
                    ((f56) childAt).f();
                }
            }
        }
        xs5 xs5Var = this.m0;
        if (xs5Var != null) {
            xs5Var.updateColors();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.y1 && ((Long) objArr[0]).longValue() == (-this.n)) {
            tk5 tk5Var = this.parentLayout;
            if (tk5Var != null && tk5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void e0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().i1(-this.n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new kj6(this, tL_chatInviteExported, (byte) 1));
    }

    public final void f0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        boolean z = false;
        if (tL_chatInviteExported.expire_date > 0) {
            if (getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date) {
                z = true;
            }
            tL_chatInviteExported.expired = z;
            return;
        }
        int i = tL_chatInviteExported.usage_limit;
        if (i > 0) {
            if (tL_chatInviteExported.usage >= i) {
                z = true;
            }
            tL_chatInviteExported.expired = z;
        }
    }

    public final void g0(org.telegram.tgnet.TLObject r8, org.telegram.tgnet.TLRPC.TL_error r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak6.g0(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        t10 t10Var = new t10(this, (byte) 10);
        arrayList.add(new cnb(this.b, 0, new Class[]{ij6.class}, new String[]{"statusColor"}, (Drawable[]) null, t10Var, cmb.x6));
        arrayList.add(new cnb(this.b, 0, new Class[]{ij6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, t10Var, cmb.m6));
        arrayList.add(new cnb(this.b, 32, new Class[]{y23.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.M6));
        arrayList.add(new cnb(this.b, 0, new Class[]{y23.class}, new String[]{"imageView"}, (Drawable[]) null, (bnb) null, cmb.j7));
        return arrayList;
    }

    public final void h0(org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak6.h0(org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public final void i0(boolean z) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z2 = this.e0;
        long j = this.n;
        if (z2 && !this.f0) {
            this.X = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().i1(-j);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new jj6(this, (byte) 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().i1(-j);
            long e = getUserConfig().e();
            long j2 = this.f;
            if (j2 == e) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().p1(getUserConfig().f());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().n1(j2);
            }
            boolean z3 = this.s0;
            if (z3) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.k0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) b10.f(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) b10.f(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.j0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) b10.f(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) b10.f(1, arrayList2)).date;
                }
            }
            this.X = true;
            if (this.p0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new vj1(this, tL_chatInviteExported, z3, (byte) 5)), getClassGuid());
        }
        if (z) {
            o0(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().i1(-this.n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new kj6(this, tL_chatInviteExported, (byte) 2));
    }

    public final void k0() {
        if (this.f == z8c.h(getAccountInstance().a).n) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = getMessagesController().i1(-this.n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.e;
            this.e = null;
            this.d.exported_invite = null;
            int sendRequest = getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new kj6(this, tL_chatInviteExported, (byte) 0));
            gm.V3(this.b);
            getConnectionsManager().bindRequestToGuid(sendRequest, this.classGuid);
            return;
        }
        j0(this.e);
    }

    public final sj6 l0() {
        sj6 sj6Var = new sj6(this);
        sj6Var.e(sj6Var.h);
        sj6Var.b = this.E;
        sj6Var.c = this.F;
        sj6Var.d = this.I;
        sj6Var.e = this.J;
        sj6Var.f = this.V;
        sj6Var.g = this.W;
        sj6Var.a = this.Y;
        sj6Var.j.clear();
        sj6Var.j.addAll(this.j0);
        sj6Var.k.clear();
        sj6Var.k.addAll(this.k0);
        return sj6Var;
    }

    public final void m0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.p0 = sd2.t0(this.c);
        i0(true);
    }

    public final void n0(sj6 sj6Var) {
        if (!this.isPaused && this.a != null && this.b != null) {
            o0(false);
            sj6Var.e(sj6Var.i);
            ww7.a(sj6Var, true).c(this.a);
            gm.V3(this.b);
            return;
        }
        o0(true);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(boolean z) {
        int i;
        zj6 zj6Var;
        TLRPC.Chat L0 = oc7.r1(this.currentAccount).L0(Long.valueOf(this.n));
        this.c = L0;
        if (L0 != null) {
            this.R = -1;
            this.S = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.I = -1;
            this.J = -1;
            this.M = -1;
            this.K = -1;
            this.L = -1;
            this.O = -1;
            this.N = -1;
            this.P = -1;
            this.r = -1;
            this.y = -1;
            this.W = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.Q = -1;
            this.x = -1;
            this.H = -1;
            boolean z2 = false;
            this.Y = 0;
            if (this.f != z8c.h(getAccountInstance().a).n) {
                z2 = true;
            }
            int i2 = this.Y;
            int i3 = i2 + 1;
            if (z2) {
                this.R = i2;
                i = i2 + 2;
                this.Y = i;
                this.S = i3;
            } else {
                this.Y = i3;
                this.r = i2;
                i = i3;
            }
            this.s = i;
            int i4 = i + 2;
            this.Y = i4;
            this.w = i + 1;
            ArrayList arrayList = this.j0;
            if (!z2) {
                this.x = i4;
                this.Y = i + 4;
                this.y = i + 3;
            } else if (!arrayList.isEmpty()) {
                int i5 = this.Y;
                this.x = i5;
                this.Y = i5 + 2;
                this.Q = i5 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i6 = this.Y;
                this.E = i6;
                int size = arrayList.size() + i6;
                this.Y = size;
                this.F = size;
            }
            if (!z2 && arrayList.isEmpty() && this.y >= 0 && (!this.X || this.e0 || this.s0)) {
                int i7 = this.Y;
                this.Y = i7 + 1;
                this.P = i7;
            }
            if (!z2) {
                ArrayList arrayList2 = this.n0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.y >= 0) && this.P == -1) {
                        int i8 = this.Y;
                        this.Y = i8 + 1;
                        this.U = i8;
                    }
                    int i9 = this.Y;
                    int i10 = i9 + 1;
                    this.Y = i10;
                    this.T = i9;
                    this.V = i10;
                    int size2 = arrayList2.size() + i10;
                    this.Y = size2;
                    this.W = size2;
                }
            }
            ArrayList arrayList3 = this.k0;
            if (!arrayList3.isEmpty()) {
                if (this.V >= 0) {
                    int i11 = this.Y;
                    this.Y = i11 + 1;
                    this.K = i11;
                } else if ((!arrayList.isEmpty() || this.y >= 0) && this.P == -1) {
                    int i12 = this.Y;
                    this.Y = i12 + 1;
                    this.K = i12;
                } else if (z2 && this.E == -1) {
                    int i13 = this.Y;
                    this.Y = i13 + 1;
                    this.K = i13;
                }
                int i14 = this.Y;
                int i15 = i14 + 1;
                this.Y = i15;
                this.M = i14;
                this.I = i15;
                int size3 = arrayList3.size() + i15;
                this.J = size3;
                this.N = size3;
                this.Y = size3 + 2;
                this.O = size3 + 1;
            }
            if (!this.e0 && !this.s0 && ((this.X || this.c0) && !z2)) {
                int i16 = this.Y;
                this.Y = i16 + 1;
                this.G = i16;
            }
            if (!arrayList.isEmpty()) {
                int i17 = this.F;
                int i18 = this.Y;
                if (i17 == i18) {
                    this.Y = i18 + 1;
                    this.H = i18;
                    zj6Var = this.a;
                    if (zj6Var == null && z) {
                        zj6Var.f();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i19 = this.Y;
                this.Y = i19 + 1;
                this.L = i19;
            }
            zj6Var = this.a;
            if (zj6Var == null) {
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.y1);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        zj6 zj6Var = this.a;
        if (zj6Var != null) {
            zj6Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            d0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        xs5 xs5Var;
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            this.h0 = true;
            if (z2 && (xs5Var = this.m0) != null && xs5Var.f2) {
                xs5Var.show();
            }
        }
        this.u0.e();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        this.u0.d();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
