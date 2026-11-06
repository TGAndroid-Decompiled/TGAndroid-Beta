package ii;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import bi.e5;
import bi.s1;
import c8.ha;
import c8.ka;
import fi.d1;
import fi.p5;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
import org.telegram.ui.oq;
import org.telegram.ui.vq0;
public final class p extends f2 implements i30, ls, te.b {
    public RadialProgressView D;
    public w8 E;
    public j30 F;
    public TLRPC.FileLocation G;
    public ei.k H;
    public TLRPC.Chat I;
    public TLRPC.ChatFull J;
    public final u1[] K;
    public final n L;
    public ri.c f15580a;
    public final te.a f15581b;
    public long f15582c;
    public s1 d;
    public k41 f15583e;
    public String f15584f;
    public boolean h;
    public boolean f15585n;
    public e5 f15586r;
    public o f15587s;
    public p5 f15588w;
    public l9 f15589x;
    public AnimatorSet f15590y;

    public p(Bundle bundle) {
        super(bundle);
        this.f15581b = new te.a(0, this, xq.h, 320L, false);
        this.K = new u1[1];
        this.L = new n(this);
    }

    public static boolean Z(p pVar, r31 r31Var, View view) {
        long j3;
        boolean t6;
        boolean z9;
        boolean z10;
        boolean z11;
        int i7;
        Object obj = r31Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j3 = -chat.f26952id;
            boolean V = t3.V(chat);
            TLRPC.Chat chat2 = pVar.I;
            if (chat2 != null && (chat.creator || t3.y(27, chat2))) {
                z9 = true;
            } else {
                z9 = false;
            }
            z10 = V;
            t6 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j3 = user.f27101id;
                t6 = t10.t(user);
                TLRPC.Chat chat3 = pVar.I;
                if (chat3 != null && ((user.bot && user.bot_can_edit) || t3.y(27, chat3))) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z10 = false;
            }
            return false;
        }
        boolean z12 = z9;
        int b10 = m0.b(pVar.currentAccount, j3);
        if (b10 != 1 && b10 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z12 || z11) {
            k60 F = k60.F(pVar.d, null, view);
            if (t6) {
                i7 = 2131751910;
            } else if (z10) {
                i7 = 2131751909;
            } else {
                i7 = 2131751908;
            }
            F.l(2131232422, hd.M0(i7, null), new h(pVar, j3, 1), z11);
            F.m(2131232087, new m(pVar, t6, z10, j3, 0), hd.M0(2131751915, null), z12, true);
            F.W(pVar.f15583e.U0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void a0(p pVar, r31 r31Var) {
        TLRPC.Chat M0;
        TLRPC.ChatPhoto chatPhoto;
        int i7 = r31Var.d;
        if (i7 == 140) {
            if (!pVar.F.g() && (chatPhoto = (M0 = pVar.getMessagesController().M0(Long.valueOf(pVar.f15582c))).photo) != null && chatPhoto.photo_big != null) {
                hc hcVar = null;
                PhotoViewer.p1().H2(null, pVar, null);
                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                int i10 = chatPhoto2.dc_id;
                if (i10 != 0) {
                    chatPhoto2.photo_big.dc_id = i10;
                }
                TLRPC.ChatFull chatFull = pVar.J;
                if (chatFull != null) {
                    TLRPC.Photo photo = chatFull.chat_photo;
                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                        hcVar = hc.j(pVar.J.chat_photo.video_sizes.get(0), pVar.J.chat_photo);
                    }
                }
                PhotoViewer.p1().c2(null, M0.photo.photo_big, null, hcVar, null, null, null, 0, pVar.L, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            return;
        }
        boolean z9 = true;
        if (i7 == 141) {
            j30 j30Var = pVar.F;
            if (pVar.G == null) {
                z9 = false;
            }
            j30Var.n(z9, new i(pVar, 0), new d1(6), 0);
        } else if (i7 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", pVar.f15582c);
            bundle.putInt("type", 1);
            oq oqVar = new oq(bundle);
            oqVar.C0(pVar.J);
            pVar.presentFragment(oqVar);
        } else if (i7 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", pVar.f15582c);
            bundle2.putInt("type", 0);
            oq oqVar2 = new oq(bundle2);
            oqVar2.C0(pVar.J);
            pVar.presentFragment(oqVar2);
        } else if (i7 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", pVar.f15582c);
            pVar.presentFragment(new s(bundle3));
        } else if (i7 == 150) {
            pVar.e0(true);
        } else if (i7 == 151) {
            pVar.e0(false);
        } else if (i7 == 145) {
            v4.r(pVar, false, pVar.I, null, false, true, true, false, new k(pVar));
        } else if (i7 == 146) {
            m0.e(pVar.K, pVar, pVar.currentAccount, pVar.I);
        } else {
            Object obj = r31Var.G;
            if (obj instanceof TLRPC.Chat) {
                pVar.presentFragment(an.ra(-((TLRPC.Chat) obj).f26952id));
            } else if (obj instanceof TLRPC.User) {
                pVar.presentFragment(an.ra(((TLRPC.User) obj).f27101id));
            }
        }
    }

    public static void b0(p pVar) {
        pVar.G = null;
        qp.s1(pVar.currentAccount).B(pVar.f15582c, null, null, null, null, 0.0d, null, null, null, null);
        pVar.f0(false, true);
        pVar.f15589x.j(null, null, pVar.E, pVar.I);
    }

    public static void c0(p pVar, long j3) {
        qp.s1(pVar.currentAccount).Q2(j3, pVar.f15582c, true, false, new j(pVar, 0));
    }

    @Override
    public final void H(float f10) {
        RadialProgressView radialProgressView = this.D;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void O(boolean z9, boolean z10) {
        RadialProgressView radialProgressView = this.D;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new l(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        int i10;
        this.H.setAlpha(f10);
        this.H.setScaleX(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        this.H.setScaleY(org.telegram.messenger.g0.T1(0.75f, 1.0f, f10));
        ei.k kVar = this.H;
        if (f10 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        kVar.setVisibility(i10);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new y1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, 6));
        ri.c cVar = new ri.c();
        this.f15580a = cVar;
        cVar.a(getThemedColor(k6.f27848d6));
        this.actionBar.M(new dh.c(cVar, cVar, cVar), c8.g0.p(this.resourceProvider), false);
        this.actionBar.Q0 = true;
        s1 s1Var = new s1(this, context);
        this.d = s1Var;
        r6.i(k6.f27792a7, s1Var, null);
        this.E = new w8(this.I);
        o oVar = new o(context);
        this.f15587s = oVar;
        oVar.f15579a.e(this.I, this.E);
        this.f15589x = this.f15587s.f15579a;
        String m10 = m5.m(this.I);
        this.f15584f = m10;
        f6 f6Var = this.resourceProvider;
        e5 e5Var = new e5(6, context, false);
        bi.v vVar = new bi.v(context, 2);
        e5Var.f3761b = vVar;
        r6.V(vVar, k6.G6, f6Var);
        r6.H(vVar, k6.Uc, f6Var);
        r6.E(vVar, k6.H6, f6Var);
        vVar.setTextSize(1, 16.0f);
        vVar.setMaxLines(Integer.MAX_VALUE);
        vVar.setBackground(null);
        vVar.setImeOptions(vVar.getImeOptions() | 268435456);
        vVar.setInputType(vVar.getInputType() | 16384);
        vVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(11.0f));
        vVar.setMinHeight(org.telegram.messenger.g0.L(50.0f));
        if (hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        e5Var.addView(vVar, ha.d(-1, -2.0f, i7 | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f15586r = e5Var;
        vVar.setText(m10);
        ((bi.v) this.f15586r.f3761b).setSelection(m10.length());
        ((bi.v) this.f15586r.f3761b).addTextChangedListener(new ah.j(this, 7));
        ei.k kVar = new ei.k(this, context);
        this.H = kVar;
        r6.V(kVar, k6.Gi, getResourceProvider());
        this.H.setText(hd.M0(2131745947, null));
        this.H.setTypeface(org.telegram.messenger.g0.o());
        this.H.setTextSize(1, 14.0f);
        this.H.setGravity(17);
        this.H.setVisibility(8);
        this.H.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        this.H.setOnClickListener(new g(this, 0));
        ka.a(this.H);
        this.actionBar.addView(this.H, ha.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        p5 p5Var = new p5(this, context);
        this.f15588w = p5Var;
        this.f15587s.addView(p5Var, ha.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.D = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
        this.D.setProgressColor(-1);
        this.D.setNoProgress(false);
        this.f15587s.addView(this.D, ha.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        f0(false, false);
        k41 k41Var = new k41(this, new j(this, 1), new k(this), new k(this));
        this.f15583e = k41Var;
        k41Var.setClipToPadding(false);
        k41 k41Var2 = this.f15583e;
        f41 f41Var = k41Var2.f35167f3;
        f41Var.f33473r = false;
        f41Var.f33474s = true;
        k41Var2.r1();
        this.actionBar.setBackground(null);
        this.d.addView(this.f15583e, ha.c(-1.0f, -1));
        this.d.addView(this.actionBar, ha.e(-1, -2, 48));
        s1 s1Var2 = this.d;
        k kVar2 = new k(this);
        WeakHashMap weakHashMap = r0.i0.f54073a;
        r0.a0.i(s1Var2, kVar2);
        s1 s1Var3 = this.d;
        this.fragmentView = s1Var3;
        return s1Var3;
    }

    public final void d0() {
        boolean z9;
        if (this.h == this.f15585n && TextUtils.equals(((bi.v) this.f15586r.f3761b).getText().toString(), this.f15584f)) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f15581b.a(z9, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f26953id == this.f15582c) {
                this.J = chatFull;
                this.f15583e.f35167f3.O(true);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.F.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.F.f34866c && super.dismissDialogOnPause(dialog)) {
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

    public final void e0(boolean z9) {
        if (this.f15585n == z9) {
            return;
        }
        h6 h6Var = (h6) this.f15583e.B1(151);
        if (h6Var != null) {
            h6Var.a(!z9);
        }
        h6 h6Var2 = (h6) this.f15583e.B1(150);
        if (h6Var2 != null) {
            h6Var2.a(z9);
        }
        this.f15585n = z9;
        d0();
    }

    public final void f0(boolean z9, boolean z10) {
        if (this.D == null) {
            return;
        }
        AnimatorSet animatorSet = this.f15590y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f15590y = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f15590y = animatorSet2;
            if (z9) {
                this.D.setVisibility(0);
                this.f15588w.setVisibility(0);
                AnimatorSet animatorSet3 = this.f15590y;
                RadialProgressView radialProgressView = this.D;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f15588w, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.D;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f15588w, property2, 0.0f));
            }
            this.f15590y.setDuration(180L);
            this.f15590y.addListener(new ch.y(15, this, z9));
            this.f15590y.start();
        } else if (z9) {
            this.D.setAlpha(1.0f);
            this.D.setVisibility(0);
            this.f15588w.setAlpha(1.0f);
            this.f15588w.setVisibility(0);
        } else {
            this.D.setAlpha(0.0f);
            this.D.setVisibility(4);
            this.f15588w.setAlpha(0.0f);
            this.f15588w.setVisibility(4);
        }
    }

    @Override
    public final vq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((bi.v) this.f15586r.f3761b).getText().toString();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.F.h(i7, i10, intent);
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z9;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.f15582c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f15582c));
        this.I = M0;
        if (M0 != null && ((tL_chatBannedRights = M0.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.h = z9;
        this.f15585n = z9;
        this.J = getMessagesController().N0(this.f15582c);
        j30 j30Var = new j30(3, true, true);
        this.F = j30Var;
        j30Var.f34864a = this;
        j30Var.f34865b = this;
        getNotificationCenter().c(this, qs.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, qs.T);
        j30 j30Var = this.F;
        if (j30Var != null) {
            j30Var.d();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.F.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.F.j(i7, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.F.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            ri.c cVar = this.f15580a;
            if (cVar != null) {
                cVar.a(getThemedColor(k6.f27848d6));
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
        j30 j30Var = this.F;
        if (j30Var != null) {
            j30Var.f34868f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        j30 j30Var = this.F;
        if (j30Var != null && (str = j30Var.f34868f) != null) {
            bundle.putString("path", str);
        }
        e5 e5Var = this.f15586r;
        if (e5Var != null) {
            String obj = ((bi.v) e5Var.f3761b).getText().toString();
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
    public final void F(float f10, int i7) {
    }
}
