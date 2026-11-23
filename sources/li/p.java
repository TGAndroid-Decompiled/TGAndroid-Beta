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
import bi.e3;
import bi.g7;
import bi.v1;
import c8.ma;
import c8.ra;
import di.d1;
import hi.f1;
import hi.l5;
import hi.o4;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.x30;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn;
import org.telegram.ui.rq;
import org.telegram.ui.wq0;
public final class p extends g2 implements w30, gs, te.b {
    public RadialProgressView E;
    public b9 F;
    public x30 G;
    public TLRPC.FileLocation H;
    public gi.j I;
    public TLRPC.Chat J;
    public TLRPC.ChatFull K;
    public final t1[] L;
    public final n M;
    public ui.c f20008a;
    public final te.a f20009b;
    public long f20010c;
    public d1 d;
    public h51 f20011e;
    public String f20012f;
    public boolean h;
    public boolean f20013n;
    public e3 f20014r;
    public o f20015s;
    public l5 f20016w;
    public q9 f20017x;
    public AnimatorSet f20018y;

    public p(Bundle bundle) {
        super(bundle);
        this.f20009b = new te.a(0, this, nr.h, 320L, false);
        this.L = new t1[1];
        this.M = new n(this);
    }

    public static boolean Z(p pVar, o41 o41Var, View view) {
        long j3;
        boolean u10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i7;
        Object obj = o41Var.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j3 = -chat.f28434id;
            boolean V = v3.V(chat);
            TLRPC.Chat chat2 = pVar.J;
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
                j3 = user.f28583id;
                u10 = p10.u(user);
                TLRPC.Chat chat3 = pVar.J;
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
        int b10 = l0.b(pVar.currentAccount, j3);
        if (b10 != 1 && b10 != 2) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z13 || z12) {
            a70 G = a70.G(pVar.d, null, view);
            if (u10) {
                i7 = 2131751898;
            } else if (z11) {
                i7 = 2131751897;
            } else {
                i7 = 2131751896;
            }
            G.l(2131232424, hd.N0(i7, null), new h(pVar, j3, 1), z12);
            G.m(2131232089, new m(pVar, u10, z11, j3, 0), hd.N0(2131751903, null), z13, true);
            G.X(pVar.f20011e.U0(view, true));
            G.a0();
            return true;
        }
        return false;
    }

    public static void a0(p pVar, o41 o41Var) {
        TLRPC.Chat O0;
        TLRPC.ChatPhoto chatPhoto;
        int i7 = o41Var.d;
        if (i7 == 140) {
            if (!pVar.G.g() && (chatPhoto = (O0 = pVar.getMessagesController().O0(Long.valueOf(pVar.f20010c))).photo) != null && chatPhoto.photo_big != null) {
                gc gcVar = null;
                PhotoViewer.p1().I2(null, pVar, null);
                TLRPC.ChatPhoto chatPhoto2 = O0.photo;
                int i10 = chatPhoto2.dc_id;
                if (i10 != 0) {
                    chatPhoto2.photo_big.dc_id = i10;
                }
                TLRPC.ChatFull chatFull = pVar.K;
                if (chatFull != null) {
                    TLRPC.Photo photo = chatFull.chat_photo;
                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                        gcVar = gc.j(pVar.K.chat_photo.video_sizes.get(0), pVar.K.chat_photo);
                    }
                }
                PhotoViewer.p1().d2(null, O0.photo.photo_big, null, gcVar, null, null, null, 0, pVar.M, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            return;
        }
        boolean z10 = true;
        if (i7 == 141) {
            x30 x30Var = pVar.G;
            if (pVar.H == null) {
                z10 = false;
            }
            x30Var.n(z10, new i(pVar, 0), new f1(6), 0);
        } else if (i7 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", pVar.f20010c);
            bundle.putInt("type", 1);
            rq rqVar = new rq(bundle);
            rqVar.C0(pVar.K);
            pVar.presentFragment(rqVar);
        } else if (i7 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", pVar.f20010c);
            bundle2.putInt("type", 0);
            rq rqVar2 = new rq(bundle2);
            rqVar2.C0(pVar.K);
            pVar.presentFragment(rqVar2);
        } else if (i7 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", pVar.f20010c);
            pVar.presentFragment(new s(bundle3));
        } else if (i7 == 150) {
            pVar.e0(true);
        } else if (i7 == 151) {
            pVar.e0(false);
        } else if (i7 == 145) {
            c5.r(pVar, false, pVar.J, null, false, true, true, false, new k(pVar));
        } else if (i7 == 146) {
            l0.e(pVar.L, pVar, pVar.currentAccount, pVar.J);
        } else {
            Object obj = o41Var.H;
            if (obj instanceof TLRPC.Chat) {
                pVar.presentFragment(bn.ua(-((TLRPC.Chat) obj).f28434id));
            } else if (obj instanceof TLRPC.User) {
                pVar.presentFragment(bn.ua(((TLRPC.User) obj).f28583id));
            }
        }
    }

    public static void b0(p pVar) {
        pVar.H = null;
        np.u1(pVar.currentAccount).B(pVar.f20010c, null, null, null, null, 0.0d, null, null, null, null);
        pVar.f0(false, true);
        pVar.f20017x.j(null, null, pVar.F, pVar.J);
    }

    public static void c0(p pVar, long j3) {
        np.u1(pVar.currentAccount).W2(j3, pVar.f20010c, true, false, new j(pVar, 0));
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
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
    public final void I(float f10) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void Q(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new l(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new x1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new v1(this, 18));
        ui.c cVar = new ui.c();
        this.f20008a = cVar;
        cVar.a(getThemedColor(m6.f29381d6));
        this.actionBar.P(new dh.c(cVar, cVar, cVar), c8.i0.p(this.resourceProvider), false);
        this.actionBar.R0 = true;
        d1 d1Var = new d1(this, context);
        this.d = d1Var;
        t6.h(m6.f29324a7, d1Var, null);
        this.F = new b9(this.J);
        o oVar = new o(context);
        this.f20015s = oVar;
        oVar.f20007a.f(this.J, this.F);
        this.f20017x = this.f20015s.f20007a;
        String m10 = n5.m(this.J);
        this.f20012f = m10;
        h6 h6Var = this.resourceProvider;
        e3 e3Var = new e3(context, 9);
        di.q qVar = new di.q(context, 2);
        e3Var.f3595b = qVar;
        t6.U(qVar, m6.G6, h6Var);
        t6.G(qVar, m6.Xc, h6Var);
        t6.D(qVar, m6.H6, h6Var);
        qVar.setTextSize(1, 16.0f);
        qVar.setMaxLines(Integer.MAX_VALUE);
        qVar.setBackground(null);
        qVar.setImeOptions(qVar.getImeOptions() | 268435456);
        qVar.setInputType(qVar.getInputType() | 16384);
        qVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
        qVar.setMinHeight(org.telegram.messenger.g0.L(50.0f));
        if (hd.f24444a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        e3Var.addView(qVar, ma.d(-1, -2.0f, i7 | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f20014r = e3Var;
        qVar.setText(m10);
        ((di.q) this.f20014r.f3595b).setSelection(m10.length());
        ((di.q) this.f20014r.f3595b).addTextChangedListener(new ah.j(this, 13));
        gi.j jVar = new gi.j(this, context);
        this.I = jVar;
        t6.U(jVar, m6.Ji, getResourceProvider());
        this.I.setText(hd.N0(2131745750, null));
        this.I.setTypeface(org.telegram.messenger.g0.o());
        this.I.setTextSize(1, 14.0f);
        this.I.setGravity(17);
        this.I.setVisibility(8);
        this.I.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.I.setOnClickListener(new o4(this, 13));
        ra.a(this.I);
        this.actionBar.addView(this.I, ma.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        l5 l5Var = new l5(this, context);
        this.f20016w = l5Var;
        this.f20015s.addView(l5Var, ma.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.E = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.E.setProgressColor(-1);
        this.E.setNoProgress(false);
        this.f20015s.addView(this.E, ma.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        f0(false, false);
        h51 h51Var = new h51(this, new j(this, 1), new k(this), new k(this));
        this.f20011e = h51Var;
        h51Var.setClipToPadding(false);
        h51 h51Var2 = this.f20011e;
        c51 c51Var = h51Var2.f35790g3;
        c51Var.f34062r = false;
        c51Var.f34063s = true;
        h51Var2.r1();
        this.actionBar.setBackground(null);
        this.d.addView(this.f20011e, ma.c(-1.0f, -1));
        this.d.addView(this.actionBar, ma.e(-1, -2, 48));
        d1 d1Var2 = this.d;
        k kVar = new k(this);
        WeakHashMap weakHashMap = r0.i0.f56289a;
        r0.a0.i(d1Var2, kVar);
        d1 d1Var3 = this.d;
        this.fragmentView = d1Var3;
        return d1Var3;
    }

    public final void d0() {
        boolean z10;
        if (this.h == this.f20013n && TextUtils.equals(((di.q) this.f20014r.f3595b).getText().toString(), this.f20012f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f20009b.a(z10, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28435id == this.f20010c) {
                this.K = chatFull;
                this.f20011e.f35790g3.O(true);
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
        if (dialog != this.G.f41961c && super.dismissDialogOnPause(dialog)) {
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
        if (this.f20013n == z10) {
            return;
        }
        i6 i6Var = (i6) this.f20011e.B1(151);
        if (i6Var != null) {
            i6Var.a(!z10);
        }
        i6 i6Var2 = (i6) this.f20011e.B1(150);
        if (i6Var2 != null) {
            i6Var2.a(z10);
        }
        this.f20013n = z10;
        d0();
    }

    public final void f0(boolean z10, boolean z11) {
        if (this.E == null) {
            return;
        }
        AnimatorSet animatorSet = this.f20018y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f20018y = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f20018y = animatorSet2;
            if (z10) {
                this.E.setVisibility(0);
                this.f20016w.setVisibility(0);
                AnimatorSet animatorSet3 = this.f20018y;
                RadialProgressView radialProgressView = this.E;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f20016w, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.E;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f20016w, property2, 0.0f));
            }
            this.f20018y.setDuration(180L);
            this.f20018y.addListener(new g7(17, this, z10));
            this.f20018y.start();
        } else if (z10) {
            this.E.setAlpha(1.0f);
            this.E.setVisibility(0);
            this.f20016w.setAlpha(1.0f);
            this.f20016w.setVisibility(0);
        } else {
            this.E.setAlpha(0.0f);
            this.E.setVisibility(4);
            this.f20016w.setAlpha(0.0f);
            this.f20016w.setVisibility(4);
        }
    }

    @Override
    public final wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((di.q) this.f20014r.f3595b).getText().toString();
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
        this.f20010c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.f20010c));
        this.J = O0;
        if (O0 != null && ((tL_chatBannedRights = O0.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        this.f20013n = z10;
        this.K = getMessagesController().P0(this.f20010c);
        x30 x30Var = new x30(3, true, true);
        this.G = x30Var;
        x30Var.f41959a = this;
        x30Var.f41960b = this;
        getNotificationCenter().c(this, ls.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, ls.T);
        x30 x30Var = this.G;
        if (x30Var != null) {
            x30Var.d();
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
            ui.c cVar = this.f20008a;
            if (cVar != null) {
                cVar.a(getThemedColor(m6.f29381d6));
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
        x30 x30Var = this.G;
        if (x30Var != null) {
            x30Var.f41963f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        x30 x30Var = this.G;
        if (x30Var != null && (str = x30Var.f41963f) != null) {
            bundle.putString("path", str);
        }
        e3 e3Var = this.f20014r;
        if (e3Var != null) {
            String obj = ((di.q) e3Var.f3595b).getText().toString();
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
    public final void D(float f10, int i7) {
    }
}
