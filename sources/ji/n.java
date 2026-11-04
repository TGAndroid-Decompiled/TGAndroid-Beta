package ji;

import ai.g5;
import ai.o2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import b8.cd;
import b8.mf;
import b8.pf;
import ci.l1;
import gi.d1;
import gi.n5;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.mq0;
import org.telegram.ui.nq;
import org.telegram.ui.wm;
public final class n extends d2 implements e30, cs, qe.b {
    public RadialProgressView E;
    public u8 F;
    public f30 G;
    public TLRPC.FileLocation H;
    public fi.j I;
    public TLRPC.Chat J;
    public TLRPC.ChatFull K;
    public final s1[] L;
    public final l M;
    public si.c f16342a;
    public final qe.a f16343b;
    public long f16344c;
    public l1 d;
    public l41 f16345e;
    public String f16346f;
    public boolean h;
    public boolean f16347n;
    public o2 f16348r;
    public m f16349s;
    public n5 f16350w;
    public k9 f16351x;
    public AnimatorSet f16352y;

    public n(Bundle bundle) {
        super(bundle);
        this.f16343b = new qe.a(0, this, xq.h, 320L, false);
        this.L = new s1[1];
        this.M = new l(this);
    }

    public static boolean Z(n nVar, r31 r31Var, View view) {
        long j10;
        boolean t10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i3;
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j10 = -chat.f27001id;
            boolean V = t3.V(chat);
            TLRPC.Chat chat2 = nVar.J;
            if (chat2 != null && (chat.creator || t3.y(27, chat2))) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = V;
            t10 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.f27150id;
                t10 = l10.t(user);
                TLRPC.Chat chat3 = nVar.J;
                if (chat3 != null && ((user.bot && user.bot_can_edit) || t3.y(27, chat3))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = false;
            }
            return false;
        }
        boolean z13 = z10;
        int b10 = j0.b(nVar.currentAccount, j10);
        if (b10 != 1 && b10 != 2) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z13 || z12) {
            f60 F = f60.F(nVar.d, null, view);
            if (t10) {
                i3 = 2131751910;
            } else if (z11) {
                i3 = 2131751909;
            } else {
                i3 = 2131751908;
            }
            F.l(2131232422, bd.M0(i3, null), new f(nVar, j10, 1), z12);
            F.m(2131232087, new k(nVar, t10, z11, j10, 0), bd.M0(2131751915, null), z13, true);
            F.W(nVar.f16345e.U0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void a0(n nVar, r31 r31Var) {
        TLRPC.Chat M0;
        TLRPC.ChatPhoto chatPhoto;
        int i3 = r31Var.d;
        if (i3 == 140) {
            if (!nVar.G.g() && (chatPhoto = (M0 = nVar.getMessagesController().M0(Long.valueOf(nVar.f16344c))).photo) != null && chatPhoto.photo_big != null) {
                ac acVar = null;
                PhotoViewer.v1().N2(null, nVar, null);
                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                int i10 = chatPhoto2.dc_id;
                if (i10 != 0) {
                    chatPhoto2.photo_big.dc_id = i10;
                }
                TLRPC.ChatFull chatFull = nVar.K;
                if (chatFull != null) {
                    TLRPC.Photo photo = chatFull.chat_photo;
                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                        acVar = ac.j(nVar.K.chat_photo.video_sizes.get(0), nVar.K.chat_photo);
                    }
                }
                PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, nVar.M, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            return;
        }
        boolean z10 = true;
        if (i3 == 141) {
            f30 f30Var = nVar.G;
            if (nVar.H == null) {
                z10 = false;
            }
            f30Var.n(z10, new g(nVar, 0), new d1(6), 0);
        } else if (i3 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", nVar.f16344c);
            bundle.putInt("type", 1);
            nq nqVar = new nq(bundle);
            nqVar.C0(nVar.K);
            nVar.presentFragment(nqVar);
        } else if (i3 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", nVar.f16344c);
            bundle2.putInt("type", 0);
            nq nqVar2 = new nq(bundle2);
            nqVar2.C0(nVar.K);
            nVar.presentFragment(nqVar2);
        } else if (i3 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", nVar.f16344c);
            nVar.presentFragment(new q(bundle3));
        } else if (i3 == 150) {
            nVar.e0(true);
        } else if (i3 == 151) {
            nVar.e0(false);
        } else if (i3 == 145) {
            t4.r(nVar, false, nVar.J, null, false, true, true, false, new i(nVar));
        } else if (i3 == 146) {
            j0.e(nVar.L, nVar, nVar.currentAccount, nVar.J);
        } else {
            Object obj = r31Var.G;
            if (obj instanceof TLRPC.Chat) {
                nVar.presentFragment(wm.ra(-((TLRPC.Chat) obj).f27001id));
            } else if (obj instanceof TLRPC.User) {
                nVar.presentFragment(wm.ra(((TLRPC.User) obj).f27150id));
            }
        }
    }

    public static void b0(n nVar) {
        nVar.H = null;
        hp.s1(nVar.currentAccount).B(nVar.f16344c, null, null, null, null, 0.0d, null, null, null, null);
        nVar.f0(false, true);
        nVar.f16351x.j(null, null, nVar.F, nVar.J);
    }

    public static void c0(n nVar, long j10) {
        hp.s1(nVar.currentAccount).Q2(j10, nVar.f16344c, true, false, new h(nVar, 0));
    }

    @Override
    public final void H(float f10) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new j(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        int i10;
        this.I.setAlpha(f10);
        this.I.setScaleX(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        this.I.setScaleY(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        fi.j jVar = this.I;
        if (f10 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        jVar.setVisibility(i10);
    }

    @Override
    public final View createView(Context context) {
        int i3;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new w1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new g5(this, 7));
        si.c cVar = new si.c();
        this.f16342a = cVar;
        cVar.a(getThemedColor(k6.f27878d6));
        this.actionBar.M(new eh.c(cVar, cVar, cVar), cd.p(this.resourceProvider), false);
        this.actionBar.R0 = true;
        l1 l1Var = new l1(this, context);
        this.d = l1Var;
        r6.i(k6.f27824a7, l1Var, null);
        this.F = new u8(this.J);
        m mVar = new m(context);
        this.f16349s = mVar;
        mVar.f16341a.e(this.J, this.F);
        this.f16351x = this.f16349s.f16341a;
        String m10 = m5.m(this.J);
        this.f16346f = m10;
        e6 e6Var = this.resourceProvider;
        o2 o2Var = new o2(context, 7);
        ci.s sVar = new ci.s(context, 2);
        o2Var.f852b = sVar;
        r6.V(sVar, k6.G6, e6Var);
        r6.H(sVar, k6.Uc, e6Var);
        r6.E(sVar, k6.H6, e6Var);
        sVar.setTextSize(1, 16.0f);
        sVar.setMaxLines(Integer.MAX_VALUE);
        sVar.setBackground(null);
        sVar.setImeOptions(sVar.getImeOptions() | 268435456);
        sVar.setInputType(sVar.getInputType() | 16384);
        sVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
        sVar.setMinHeight(org.telegram.messenger.g0.L(50.0f));
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        o2Var.addView(sVar, mf.d(-1, -2.0f, i3 | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f16348r = o2Var;
        sVar.setText(m10);
        ((ci.s) this.f16348r.f852b).setSelection(m10.length());
        ((ci.s) this.f16348r.f852b).addTextChangedListener(new bh.h(this, 7));
        fi.j jVar = new fi.j(this, context);
        this.I = jVar;
        r6.V(jVar, k6.Gi, getResourceProvider());
        this.I.setText(bd.M0(2131745956, null));
        this.I.setTypeface(org.telegram.messenger.g0.o());
        this.I.setTextSize(1, 14.0f);
        this.I.setGravity(17);
        this.I.setVisibility(8);
        this.I.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.I.setOnClickListener(new ii.m(this, 3));
        pf.a(this.I);
        this.actionBar.addView(this.I, mf.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        n5 n5Var = new n5(this, context);
        this.f16350w = n5Var;
        this.f16349s.addView(n5Var, mf.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.E = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.E.setProgressColor(-1);
        this.E.setNoProgress(false);
        this.f16349s.addView(this.E, mf.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        f0(false, false);
        l41 l41Var = new l41(this, new h(this, 1), new i(this), new i(this));
        this.f16345e = l41Var;
        l41Var.setClipToPadding(false);
        l41 l41Var2 = this.f16345e;
        f41 f41Var = l41Var2.f35594g3;
        f41Var.f33698r = false;
        f41Var.f33699s = true;
        l41Var2.r1();
        this.actionBar.setBackground(null);
        this.d.addView(this.f16345e, mf.c(-1.0f, -1));
        this.d.addView(this.actionBar, mf.e(-1, -2, 48));
        l1 l1Var2 = this.d;
        i iVar = new i(this);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(l1Var2, iVar);
        l1 l1Var3 = this.d;
        this.fragmentView = l1Var3;
        return l1Var3;
    }

    public final void d0() {
        boolean z10;
        if (this.h == this.f16347n && TextUtils.equals(((ci.s) this.f16348r.f852b).getText().toString(), this.f16346f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f16343b.a(z10, true);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f27002id == this.f16344c) {
                this.K = chatFull;
                this.f16345e.f35594g3.O(true);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.G.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.G.f33683c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0(boolean z10) {
        if (this.f16347n == z10) {
            return;
        }
        g6 g6Var = (g6) this.f16345e.B1(151);
        if (g6Var != null) {
            g6Var.a(!z10);
        }
        g6 g6Var2 = (g6) this.f16345e.B1(150);
        if (g6Var2 != null) {
            g6Var2.a(z10);
        }
        this.f16347n = z10;
        d0();
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.E == null) {
            return;
        }
        AnimatorSet animatorSet = this.f16352y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f16352y = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f16352y = animatorSet2;
            if (z10) {
                this.E.setVisibility(0);
                this.f16350w.setVisibility(0);
                AnimatorSet animatorSet3 = this.f16352y;
                RadialProgressView radialProgressView = this.E;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f16350w, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.E;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f16350w, property2, 0.0f));
            }
            this.f16352y.setDuration(180L);
            this.f16352y.addListener(new dh.x(16, this, z10));
            this.f16352y.start();
        } else if (z10) {
            this.E.setAlpha(1.0f);
            this.E.setVisibility(0);
            this.f16350w.setAlpha(1.0f);
            this.f16350w.setVisibility(0);
        } else {
            this.E.setAlpha(0.0f);
            this.E.setVisibility(4);
            this.f16350w.setAlpha(0.0f);
            this.f16350w.setVisibility(4);
        }
    }

    @Override
    public final mq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((ci.s) this.f16348r.f852b).getText().toString();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        this.G.h(i3, i10, intent);
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.f16344c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f16344c));
        this.J = M0;
        if (M0 != null && ((tL_chatBannedRights = M0.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        this.f16347n = z10;
        this.K = getMessagesController().N0(this.f16344c);
        f30 f30Var = new f30(3, true, true);
        this.G = f30Var;
        f30Var.f33681a = this;
        f30Var.f33682b = this;
        getNotificationCenter().c(this, hs.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, hs.T);
        f30 f30Var = this.G;
        if (f30Var != null) {
            f30Var.d();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.G.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        this.G.j(i3, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.G.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            si.c cVar = this.f16342a;
            if (cVar != null) {
                cVar.a(getThemedColor(k6.f27878d6));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        f30 f30Var = this.G;
        if (f30Var != null) {
            f30Var.f33685f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        f30 f30Var = this.G;
        if (f30Var != null && (str = f30Var.f33685f) != null) {
            bundle.putString("path", str);
        }
        o2 o2Var = this.f16348r;
        if (o2Var != null) {
            String obj = ((ci.s) o2Var.f852b).getText().toString();
            if (!obj.isEmpty()) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void T() {
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
