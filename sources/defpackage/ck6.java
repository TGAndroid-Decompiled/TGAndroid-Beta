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
import org.telegram.ui.ActionBar.e;
public final class ck6 extends e implements fn7 {
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
    public bk6 a;
    public Drawable a0;
    public d79 b;
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
    public i69 i0;
    public final ArrayList j0;
    public final ArrayList k0;
    public final HashMap l0;
    public bt5 m0;
    public final long n;
    public final ArrayList n0;
    public long o0;
    public boolean p0;
    public final boolean q0;
    public int r;
    public final sj6 r0;
    public int s;
    public boolean s0;
    public final tj6 t0;
    public final pn u0;
    public int w;
    public int x;
    public int y;

    public ck6(long j, int i, long j2) {
        super(null);
        boolean z;
        this.j0 = new ArrayList();
        this.k0 = new ArrayList();
        this.l0 = new HashMap();
        this.n0 = new ArrayList();
        this.r0 = new sj6(this);
        boolean z2 = false;
        this.s0 = false;
        this.t0 = new tj6(this);
        this.u0 = new pn(null);
        this.n = j;
        this.g0 = i;
        TLRPC.Chat M0 = uc7.s1(this.currentAccount).M0(Long.valueOf(j));
        this.c = M0;
        if (xc2.T(M0) && !this.c.megagroup) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        if (j2 == 0) {
            j2 = yac.h(getAccountInstance().a).n;
            this.f = j2;
        } else {
            this.f = j2;
        }
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j2));
        if (j2 == yac.h(getAccountInstance().a).n || (X1 != null && !X1.bot)) {
            z2 = true;
        }
        this.q0 = z2;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.Li));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.o6));
        hashSet.add(Integer.valueOf(aob.v6));
        hashSet.add(Integer.valueOf(aob.u6));
        hashSet.add(Integer.valueOf(aob.V8));
        hashSet.add(Integer.valueOf(aob.g9));
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.d6));
    }

    public final void c0() {
        d79 d79Var = this.b;
        if (d79Var != null) {
            int childCount = d79Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.b.getChildAt(i);
                if (childAt instanceof i56) {
                    ((i56) childAt).f();
                }
            }
        }
        bt5 bt5Var = this.m0;
        if (bt5Var != null) {
            bt5Var.updateColors();
        }
    }

    @Override
    public final View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131748894, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 8));
        d26 d26Var = new d26((byte) 3, context, this);
        this.fragmentView = d26Var;
        d26Var.setTag(Integer.valueOf(aob.a7));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        this.b.setSectionsDrawBackground(true);
        as asVar = new as((byte) 8, 1, false);
        this.b.setLayoutManager(asVar);
        d79 d79Var2 = this.b;
        bk6 bk6Var = new bk6(this, context);
        this.a = bk6Var;
        d79Var2.setAdapter(bk6Var);
        this.b.setOnScrollListener(new bj1(this, asVar, (byte) 4));
        this.i0 = new i69(this.b, false);
        zb3 zb3Var = new zb3();
        zb3Var.n(420L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        this.b.setItemAnimator(zb3Var);
        d79 d79Var3 = this.b;
        if (ob6.a0) {
            i = 1;
        } else {
            i = 2;
        }
        d79Var3.setVerticalScrollbarPosition(i);
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        this.b.setOnItemClickListener(new l0(this, context, (byte) 15));
        this.b.setOnItemLongClickListener(new qj6(this));
        this.Z = context.getDrawable(2131232210);
        this.a0 = context.getDrawable(2131232211);
        this.b0 = context.getDrawable(2131231613);
        this.Z.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        n0(true);
        this.o0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().j1(-this.n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new oj6(this, tL_chatInviteExported, (byte) 2));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.y1 && ((Long) objArr[0]).longValue() == (-this.n)) {
            wk5 wk5Var = this.parentLayout;
            if (wk5Var != null && wk5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void e0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
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

    public final void f0(org.telegram.tgnet.TLObject r8, org.telegram.tgnet.TLRPC.TL_error r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck6.f0(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public final void g0(org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck6.g0(org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        u00 u00Var = new u00(this, (byte) 10);
        arrayList.add(new apb(this.b, 0, new Class[]{lj6.class}, new String[]{"statusColor"}, (Drawable[]) null, u00Var, aob.y6));
        arrayList.add(new apb(this.b, 0, new Class[]{lj6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, u00Var, aob.n6));
        arrayList.add(new apb(this.b, 32, new Class[]{f23.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.N6));
        arrayList.add(new apb(this.b, 0, new Class[]{f23.class}, new String[]{"imageView"}, (Drawable[]) null, (zob) null, aob.k7));
        return arrayList;
    }

    public final void h0(boolean z) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z2 = this.e0;
        long j = this.n;
        if (z2 && !this.f0) {
            this.X = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().j1(-j);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new nj6(this, (byte) 1)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-j);
            long e = getUserConfig().e();
            long j2 = this.f;
            if (j2 == e) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().o1(j2);
            }
            boolean z3 = this.s0;
            if (z3) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.k0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) c00.g(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) c00.g(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.j0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) c00.g(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) c00.g(1, arrayList2)).date;
                }
            }
            this.X = true;
            if (this.p0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new vi1(this, tL_chatInviteExported, z3, (byte) 5)), getClassGuid());
        }
        if (z) {
            n0(true);
        }
    }

    public final void i0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().j1(-this.n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new oj6(this, tL_chatInviteExported, (byte) 1));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        if (this.f == yac.h(getAccountInstance().a).n) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = getMessagesController().j1(-this.n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = this.e;
            this.e = null;
            this.d.exported_invite = null;
            int sendRequest = getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new oj6(this, tL_chatInviteExported, (byte) 0));
            hl.V3(this.b);
            getConnectionsManager().bindRequestToGuid(sendRequest, this.classGuid);
            return;
        }
        i0(this.e);
    }

    public final uj6 k0() {
        uj6 uj6Var = new uj6(this);
        uj6Var.e(uj6Var.h);
        uj6Var.b = this.E;
        uj6Var.c = this.F;
        uj6Var.d = this.I;
        uj6Var.e = this.J;
        uj6Var.f = this.V;
        uj6Var.g = this.W;
        uj6Var.a = this.Y;
        uj6Var.j.clear();
        uj6Var.j.addAll(this.j0);
        uj6Var.k.clear();
        uj6Var.k.addAll(this.k0);
        return uj6Var;
    }

    public final void l0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.p0 = xc2.t0(this.c);
        h0(true);
    }

    public final void m0(uj6 uj6Var) {
        if (!this.isPaused && this.a != null && this.b != null) {
            n0(false);
            uj6Var.e(uj6Var.i);
            cy7.a(uj6Var, true).c(this.a);
            hl.V3(this.b);
            return;
        }
        n0(true);
    }

    public final void n0(boolean z) {
        int i;
        bk6 bk6Var;
        TLRPC.Chat M0 = uc7.s1(this.currentAccount).M0(Long.valueOf(this.n));
        this.c = M0;
        if (M0 != null) {
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
            if (this.f != yac.h(getAccountInstance().a).n) {
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
                    bk6Var = this.a;
                    if (bk6Var == null && z) {
                        bk6Var.f();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i19 = this.Y;
                this.Y = i19 + 1;
                this.L = i19;
            }
            bk6Var = this.a;
            if (bk6Var == null) {
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.y1);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        bk6 bk6Var = this.a;
        if (bk6Var != null) {
            bk6Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            c0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        bt5 bt5Var;
        super.onTransitionAnimationEnd(z, z2);
        if (z) {
            this.h0 = true;
            if (z2 && (bt5Var = this.m0) != null && bt5Var.f2) {
                bt5Var.show();
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
