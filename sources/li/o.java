package li;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import bi.g3;
import bi.j7;
import bi.w1;
import c8.na;
import c8.sa;
import di.d1;
import hi.n1;
import hi.w5;
import hi.z4;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.fc;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.x60;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
import org.telegram.ui.rq;
import org.telegram.ui.wq0;
public final class o extends g2 implements t30, fs, te.b {
    public RadialProgressView E;
    public a9 F;
    public u30 G;
    public TLRPC.FileLocation H;
    public gi.j I;
    public TLRPC.Chat J;
    public TLRPC.ChatFull K;
    public final t1[] L;
    public final m M;
    public ui.c f20071a;
    public final te.a f20072b;
    public long f20073c;
    public d1 d;
    public g51 f20074e;
    public String f20075f;
    public boolean h;
    public boolean f20076n;
    public g3 f20077r;
    public n f20078s;
    public w5 f20079w;
    public p9 f20080x;
    public AnimatorSet f20081y;

    public o(Bundle bundle) {
        super(bundle);
        this.f20072b = new te.a(0, this, kr.h, 320L, false);
        this.L = new t1[1];
        this.M = new m(this);
    }

    public static boolean Z(o oVar, n41 n41Var, View view) {
        long j3;
        boolean u10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        Object obj = n41Var.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j3 = -chat.f28492id;
            boolean V = v3.V(chat);
            TLRPC.Chat chat2 = oVar.J;
            if (chat2 != null && (chat.creator || v3.y(27, chat2))) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = V;
            u10 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j3 = user.f28641id;
                u10 = n10.u(user);
                TLRPC.Chat chat3 = oVar.J;
                if (chat3 != null && ((user.bot && user.bot_can_edit) || v3.y(27, chat3))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = false;
            }
            return false;
        }
        boolean z13 = z10;
        int b10 = k0.b(oVar.currentAccount, j3);
        if (b10 != 1 && b10 != 2) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z13 || z12) {
            x60 G = x60.G(oVar.d, null, view);
            if (u10) {
                i7 = 2131751898;
            } else if (z11) {
                i7 = 2131751897;
            } else {
                i7 = 2131751896;
            }
            G.l(2131232427, gd.N0(i7, null), new g(oVar, j3, 1), z12);
            G.m(2131232092, new l(oVar, u10, z11, j3, 0), gd.N0(2131751903, null), z13, true);
            G.X(oVar.f20074e.U0(view, true));
            G.a0();
            return true;
        }
        return false;
    }

    public static void a0(o oVar, n41 n41Var) {
        TLRPC.Chat O0;
        TLRPC.ChatPhoto chatPhoto;
        int i7 = n41Var.d;
        if (i7 == 140) {
            if (!oVar.G.g() && (chatPhoto = (O0 = oVar.getMessagesController().O0(Long.valueOf(oVar.f20073c))).photo) != null && chatPhoto.photo_big != null) {
                fc fcVar = null;
                PhotoViewer.p1().J2(null, oVar, null);
                TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                int i10 = chatPhoto2.dc_id;
                if (i10 != 0) {
                    chatPhoto2.photo_big.dc_id = i10;
                }
                TLRPC.ChatFull chatFull = oVar.K;
                if (chatFull != null) {
                    TLRPC.Photo photo = chatFull.chat_photo;
                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                        fcVar = fc.j(oVar.K.chat_photo.video_sizes.get(0), oVar.K.chat_photo);
                    }
                }
                PhotoViewer.p1().e2(null, O0.photo.photo_big, null, fcVar, null, null, null, 0, oVar.M, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            return;
        }
        boolean z10 = true;
        if (i7 == 141) {
            u30 u30Var = oVar.G;
            if (oVar.H == null) {
                z10 = false;
            }
            u30Var.n(z10, new h(oVar, 0), new n1(6), 0);
        } else if (i7 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", oVar.f20073c);
            bundle.putInt("type", 1);
            rq rqVar = new rq(bundle);
            rqVar.C0(oVar.K);
            oVar.presentFragment(rqVar);
        } else if (i7 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", oVar.f20073c);
            bundle2.putInt("type", 0);
            rq rqVar2 = new rq(bundle2);
            rqVar2.C0(oVar.K);
            oVar.presentFragment(rqVar2);
        } else if (i7 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", oVar.f20073c);
            oVar.presentFragment(new r(bundle3));
        } else if (i7 == 150) {
            oVar.e0(true);
        } else if (i7 == 151) {
            oVar.e0(false);
        } else if (i7 == 145) {
            b5.r(oVar, false, oVar.J, null, false, true, true, false, new j(oVar));
        } else if (i7 == 146) {
            k0.e(oVar.L, oVar, oVar.currentAccount, oVar.J);
        } else {
            Object obj = n41Var.H;
            if (obj instanceof TLRPC.Chat) {
                oVar.presentFragment(bn.ua(-((TLRPC.Chat) obj).f28492id));
            } else if (obj instanceof TLRPC.User) {
                oVar.presentFragment(bn.ua(((TLRPC.User) obj).f28641id));
            }
        }
    }

    public static void b0(o oVar) {
        oVar.H = null;
        mp.u1(oVar.currentAccount).B(oVar.f20073c, null, null, null, null, 0.0d, null, null, null, null);
        oVar.f0(false, true);
        oVar.f20080x.j(null, null, oVar.F, oVar.J);
    }

    public static void c0(o oVar, long j3) {
        mp.u1(oVar.currentAccount).W2(j3, oVar.f20073c, true, false, new i(oVar, 0));
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
    public final void K(int i7, float f10, float f11, te.c cVar) {
        int i10;
        this.I.setAlpha(f10);
        this.I.setScaleX(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        this.I.setScaleY(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        gi.j jVar = this.I;
        if (f10 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        jVar.setVisibility(i10);
    }

    @Override
    public final void P(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new k(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new x1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new w1(this, 18));
        ui.c cVar = new ui.c();
        this.f20071a = cVar;
        cVar.a(getThemedColor(n6.f29451d6));
        this.actionBar.P(new dh.c(cVar, cVar, cVar), c8.j0.p(this.resourceProvider), false);
        this.actionBar.R0 = true;
        d1 d1Var = new d1(this, context);
        this.d = d1Var;
        u6.h(n6.f29394a7, d1Var, null);
        this.F = new a9(this.J);
        n nVar = new n(context);
        this.f20078s = nVar;
        nVar.f20070a.f(this.J, this.F);
        this.f20080x = this.f20078s.f20070a;
        String m10 = n5.m(this.J);
        this.f20075f = m10;
        i6 i6Var = this.resourceProvider;
        g3 g3Var = new g3(context, 9);
        di.q qVar = new di.q(context, 2);
        g3Var.f3604b = qVar;
        u6.U(qVar, n6.G6, i6Var);
        u6.G(qVar, n6.Xc, i6Var);
        u6.D(qVar, n6.H6, i6Var);
        qVar.setTextSize(1, 16.0f);
        qVar.setMaxLines(Integer.MAX_VALUE);
        qVar.setBackground(null);
        qVar.setImeOptions(qVar.getImeOptions() | 268435456);
        qVar.setInputType(qVar.getInputType() | 16384);
        qVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
        qVar.setMinHeight(org.telegram.messenger.g0.L(50.0f));
        if (gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        g3Var.addView(qVar, na.d(-1, -2.0f, i7 | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f20077r = g3Var;
        qVar.setText(m10);
        ((di.q) this.f20077r.f3604b).setSelection(m10.length());
        ((di.q) this.f20077r.f3604b).addTextChangedListener(new ah.j(this, 13));
        gi.j jVar = new gi.j(this, context);
        this.I = jVar;
        u6.U(jVar, n6.Ji, getResourceProvider());
        this.I.setText(gd.N0(2131745750, null));
        this.I.setTypeface(org.telegram.messenger.g0.o());
        this.I.setTextSize(1, 14.0f);
        this.I.setGravity(17);
        this.I.setVisibility(8);
        this.I.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.I.setOnClickListener(new z4(this, 13));
        sa.a(this.I);
        this.actionBar.addView(this.I, na.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        w5 w5Var = new w5(this, context);
        this.f20079w = w5Var;
        this.f20078s.addView(w5Var, na.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.E = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.E.setProgressColor(-1);
        this.E.setNoProgress(false);
        this.f20078s.addView(this.E, na.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        f0(false, false);
        g51 g51Var = new g51(this, new i(this, 1), new j(this), new j(this));
        this.f20074e = g51Var;
        g51Var.setClipToPadding(false);
        g51 g51Var2 = this.f20074e;
        b51 b51Var = g51Var2.f35323g3;
        b51Var.f33631r = false;
        b51Var.f33632s = true;
        g51Var2.r1();
        this.actionBar.setBackground(null);
        this.d.addView(this.f20074e, na.c(-1.0f, -1));
        this.d.addView(this.actionBar, na.e(-1, -2, 48));
        d1 d1Var2 = this.d;
        j jVar2 = new j(this);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.a0.i(d1Var2, jVar2);
        d1 d1Var3 = this.d;
        this.fragmentView = d1Var3;
        return d1Var3;
    }

    public final void d0() {
        boolean z10;
        if (this.h == this.f20076n && TextUtils.equals(((di.q) this.f20077r.f3604b).getText().toString(), this.f20075f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f20072b.a(z10, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28493id == this.f20073c) {
                this.K = chatFull;
                this.f20074e.f35323g3.O(true);
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
        if (dialog != this.G.f40252c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(boolean z10) {
        if (this.f20076n == z10) {
            return;
        }
        h6 h6Var = (h6) this.f20074e.B1(151);
        if (h6Var != null) {
            h6Var.a(!z10);
        }
        h6 h6Var2 = (h6) this.f20074e.B1(150);
        if (h6Var2 != null) {
            h6Var2.a(z10);
        }
        this.f20076n = z10;
        d0();
    }

    @Override
    public final boolean f() {
        return true;
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.E == null) {
            return;
        }
        AnimatorSet animatorSet = this.f20081y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f20081y = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f20081y = animatorSet2;
            if (z10) {
                this.E.setVisibility(0);
                this.f20079w.setVisibility(0);
                AnimatorSet animatorSet3 = this.f20081y;
                RadialProgressView radialProgressView = this.E;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f20079w, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.E;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f20079w, property2, 0.0f));
            }
            this.f20081y.setDuration(180L);
            this.f20081y.addListener(new j7(17, this, z10));
            this.f20081y.start();
        } else if (z10) {
            this.E.setAlpha(1.0f);
            this.E.setVisibility(0);
            this.f20079w.setAlpha(1.0f);
            this.f20079w.setVisibility(0);
        } else {
            this.E.setAlpha(0.0f);
            this.E.setVisibility(4);
            this.f20079w.setAlpha(0.0f);
            this.f20079w.setVisibility(4);
        }
    }

    @Override
    public final wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((di.q) this.f20077r.f3604b).getText().toString();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.G.h(i7, i10, intent);
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.f20073c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f20073c));
        this.J = O0;
        if (O0 != null && ((tL_chatBannedRights = O0.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        this.f20076n = z10;
        this.K = getMessagesController().P0(this.f20073c);
        u30 u30Var = new u30(3, true, true);
        this.G = u30Var;
        u30Var.f40250a = this;
        u30Var.f40251b = this;
        getNotificationCenter().c(this, ks.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, ks.T);
        u30 u30Var = this.G;
        if (u30Var != null) {
            u30Var.d();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.G.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.G.j(i7, strArr, iArr);
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
            ui.c cVar = this.f20071a;
            if (cVar != null) {
                cVar.a(getThemedColor(n6.f29451d6));
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
        u30 u30Var = this.G;
        if (u30Var != null) {
            u30Var.f40254f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        u30 u30Var = this.G;
        if (u30Var != null && (str = u30Var.f40254f) != null) {
            bundle.putString("path", str);
        }
        g3 g3Var = this.f20077r;
        if (g3Var != null) {
            String obj = ((di.q) g3Var.f3604b).getText().toString();
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
    public final void U() {
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
