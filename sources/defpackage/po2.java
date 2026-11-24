package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.PhotoViewer;
public final class po2 extends d implements vn5, jm7, g94 {
    public RadialProgressView E;
    public pc0 F;
    public wn5 G;
    public TLRPC.FileLocation H;
    public t8 I;
    public TLRPC.Chat J;
    public TLRPC.ChatFull K;
    public final he[] L;
    public final no2 M;
    public kz4 a;
    public final fn0 b;
    public long c;
    public ec0 d;
    public q7c e;
    public String f;
    public boolean h;
    public boolean n;
    public yd r;
    public oo2 s;
    public a91 w;
    public bf0 x;
    public AnimatorSet y;

    public po2(Bundle bundle) {
        super(bundle);
        this.b = new fn0(0, this, d53.h, 320L, false);
        this.L = new he[1];
        this.M = new no2(this);
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        int i2;
        this.I.setAlpha(f);
        this.I.setScaleX(gm.R1(0.75f, 1.0f, f));
        this.I.setScaleY(gm.R1(0.75f, 1.0f, f));
        t8 t8Var = this.I;
        if (f > 0.0f) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        t8Var.setVisibility(i2);
    }

    @Override
    public final void H(float f) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override
    public final void O(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.E;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gm.c3(new xi1(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void Z() {
        boolean z;
        if (this.h == this.n && TextUtils.equals(((vc) this.r.b).getText().toString(), this.f)) {
            z = false;
        } else {
            z = true;
        }
        this.b.a(z, true);
    }

    public final void a0(long j) {
        oc7.r1(this.currentAccount).V2(j, this.c, true, false, new lo2(this, (byte) 0));
    }

    public final void b0() {
        this.H = null;
        oc7.r1(this.currentAccount).x(this.c, null, null, null, null, 0.0d, null, null, null, null);
        f0(false, true);
        this.x.m(null, null, this.F, this.J);
    }

    @Override
    public final boolean c() {
        return true;
    }

    public final void c0(c6c c6cVar) {
        TLRPC.Chat L0;
        TLRPC.ChatPhoto chatPhoto;
        int i = c6cVar.d;
        if (i == 140) {
            if (!this.G.g() && (chatPhoto = (L0 = getMessagesController().L0(Long.valueOf(this.c))).photo) != null && chatPhoto.photo_big != null) {
                gn5 gn5Var = null;
                PhotoViewer.r0().T1(null, this, null);
                TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                int i2 = chatPhoto2.dc_id;
                if (i2 != 0) {
                    chatPhoto2.photo_big.dc_id = i2;
                }
                TLRPC.ChatFull chatFull = this.K;
                if (chatFull != null) {
                    TLRPC.Photo photo = chatFull.chat_photo;
                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                        gn5Var = gn5.j(this.K.chat_photo.video_sizes.get(0), this.K.chat_photo);
                    }
                }
                PhotoViewer.r0().m1(null, L0.photo.photo_big, null, gn5Var, null, null, null, 0, this.M, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            return;
        }
        boolean z = true;
        if (i == 141) {
            wn5 wn5Var = this.G;
            if (this.H == null) {
                z = false;
            }
            wn5Var.n(z, new ko2(this, (byte) 0), new g5((byte) 6), 0);
        } else if (i == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.c);
            bundle.putInt("type", 1);
            wg2 wg2Var = new wg2(bundle);
            wg2Var.B0(this.K);
            presentFragment(wg2Var);
        } else if (i == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", this.c);
            bundle2.putInt("type", 0);
            wg2 wg2Var2 = new wg2(bundle2);
            wg2Var2.B0(this.K);
            presentFragment(wg2Var2);
        } else if (i == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", this.c);
            presentFragment(new ap2(bundle3));
        } else if (i == 150) {
            e0(true);
        } else if (i == 151) {
            e0(false);
        } else if (i == 145) {
            ik.r(this, false, this.J, null, false, true, true, false, new mo2(this));
        } else if (i == 146) {
            yp2.e(this.L, this, this.currentAccount, this.J);
        } else {
            Object obj = c6cVar.H;
            if (obj instanceof TLRPC.Chat) {
                presentFragment(yv1.ga(-((TLRPC.Chat) obj).id));
            } else if (obj instanceof TLRPC.User) {
                presentFragment(yv1.ga(((TLRPC.User) obj).id));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new ee0(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 2));
        kz4 kz4Var = new kz4();
        this.a = kz4Var;
        kz4Var.a(getThemedColor(cmb.c6));
        this.actionBar.P(new km0(kz4Var, kz4Var, kz4Var), qqd.o(this.resourceProvider), false);
        this.actionBar.R0 = true;
        ec0 ec0Var = new ec0(this, context);
        this.d = ec0Var;
        anb.h(cmb.Z6, null, ec0Var);
        this.F = new pc0(this.J);
        oo2 oo2Var = new oo2(context);
        this.s = oo2Var;
        oo2Var.a.f(this.J, this.F);
        this.x = this.s.a;
        String l = pg3.l(this.J);
        this.f = l;
        ylb ylbVar = this.resourceProvider;
        yd ydVar = new yd(context, (byte) 15);
        int i = 3;
        vc vcVar = new vc(context, (byte) 3);
        ydVar.b = vcVar;
        anb.X(vcVar, cmb.F6, ylbVar);
        anb.G(vcVar, cmb.Wc, ylbVar);
        anb.D(vcVar, cmb.G6, ylbVar);
        vcVar.setTextSize(1, 16.0f);
        vcVar.setMaxLines(Integer.MAX_VALUE);
        vcVar.setBackground(null);
        vcVar.setImeOptions(vcVar.getImeOptions() | 268435456);
        vcVar.setInputType(vcVar.getInputType() | 16384);
        vcVar.setPadding(gm.L(4.0f), gm.L(10.0f), gm.L(4.0f), gm.L(11.0f));
        vcVar.setMinHeight(gm.L(50.0f));
        if (jb6.a0) {
            i = 5;
        }
        ydVar.addView(vcVar, qoe.d(-1, -2.0f, i | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.r = ydVar;
        vcVar.setText(l);
        ((vc) this.r.b).setSelection(l.length());
        ((vc) this.r.b).addTextChangedListener(new b7(this, (byte) 16));
        t8 t8Var = new t8(this, context);
        this.I = t8Var;
        anb.X(t8Var, cmb.Ii, getResourceProvider());
        this.I.setText(jb6.M0(2131745680, null));
        this.I.setTypeface(gm.o());
        this.I.setTextSize(1, 14.0f);
        this.I.setGravity(17);
        this.I.setVisibility(8);
        this.I.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        this.I.setOnClickListener(new k81(this, (byte) 18));
        rve.a(this.I);
        this.actionBar.addView(this.I, qoe.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        a91 a91Var = new a91(this, context);
        this.w = a91Var;
        this.s.addView(a91Var, qoe.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.E = radialProgressView;
        radialProgressView.setSize(gm.L(30.0f));
        this.E.setProgressColor(-1);
        this.E.setNoProgress(false);
        this.s.addView(this.E, qoe.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        f0(false, false);
        q7c q7cVar = new q7c(this, new lo2(this, (byte) 1), new mo2(this), new mo2(this));
        this.e = q7cVar;
        q7cVar.setClipToPadding(false);
        q7c q7cVar2 = this.e;
        l7c l7cVar = q7cVar2.g3;
        l7cVar.r = false;
        l7cVar.s = true;
        q7cVar2.r1();
        this.actionBar.setBackground(null);
        this.d.addView(this.e, qoe.c(-1.0f, -1));
        this.d.addView(this.actionBar, qoe.e(-1, -2, 48));
        ec0 ec0Var2 = this.d;
        mo2 mo2Var = new mo2(this);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(ec0Var2, mo2Var);
        ec0 ec0Var3 = this.d;
        this.fragmentView = ec0Var3;
        return ec0Var3;
    }

    public final boolean d0(c6c c6cVar, View view) {
        long j;
        boolean v;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        Object obj = c6cVar.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j = -chat.id;
            boolean V = sd2.V(chat);
            TLRPC.Chat chat2 = this.J;
            if (chat2 != null && (chat.creator || sd2.y(27, chat2))) {
                z = true;
            } else {
                z = false;
            }
            z2 = V;
            v = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j = user.id;
                v = m9c.v(user);
                TLRPC.Chat chat3 = this.J;
                if (chat3 != null && ((user.bot && user.bot_can_edit) || sd2.y(27, chat3))) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = false;
            }
            return false;
        }
        boolean z4 = z;
        int b = yp2.b(this.currentAccount, j);
        if (b != 1 && b != 2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z4 || z3) {
            bu5 G = bu5.G(this.d, null, view);
            if (v) {
                i = 2131751847;
            } else if (z2) {
                i = 2131751846;
            } else {
                i = 2131751845;
            }
            G.k(2131232428, jb6.M0(i, null), new jo2(this, j, (byte) 1), z3);
            G.l(2131232093, new yp1(this, v, z2, j, (byte) 1), jb6.M0(2131751852, null), z4, true);
            G.X(this.e.V0(view, true));
            G.a0();
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.c) {
                this.K = chatFull;
                this.e.g3.O(true);
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
        if (dialog != this.G.c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0(boolean z) {
        if (this.n == z) {
            return;
        }
        v09 v09Var = (v09) this.e.B1(151);
        if (v09Var != null) {
            v09Var.a(!z);
        }
        v09 v09Var2 = (v09) this.e.B1(150);
        if (v09Var2 != null) {
            v09Var2.a(z);
        }
        this.n = z;
        Z();
    }

    public final void f0(boolean z, boolean z2) {
        if (this.E == null) {
            return;
        }
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.y = null;
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.y = animatorSet2;
            RadialProgressView radialProgressView = this.E;
            if (z) {
                radialProgressView.setVisibility(0);
                this.w.setVisibility(0);
                AnimatorSet animatorSet3 = this.y;
                RadialProgressView radialProgressView2 = this.E;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property, 1.0f), ObjectAnimator.ofFloat(this.w, property, 1.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, property2, 0.0f), ObjectAnimator.ofFloat(this.w, property2, 0.0f));
            }
            this.y.setDuration(180L);
            this.y.addListener(new y7((byte) 23, this, z));
            this.y.start();
            return;
        }
        RadialProgressView radialProgressView3 = this.E;
        if (z) {
            radialProgressView3.setAlpha(1.0f);
            this.E.setVisibility(0);
            this.w.setAlpha(1.0f);
            this.w.setVisibility(0);
            return;
        }
        radialProgressView3.setAlpha(0.0f);
        this.E.setVisibility(4);
        this.w.setAlpha(0.0f);
        this.w.setVisibility(4);
    }

    @Override
    public final qb8 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((vc) this.r.b).getText().toString();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        this.G.h(i, i2, intent);
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.c));
        this.J = L0;
        if (L0 != null && ((tL_chatBannedRights = L0.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        this.n = z;
        this.K = getMessagesController().M0(this.c);
        wn5 wn5Var = new wn5(3, true, true);
        this.G = wn5Var;
        wn5Var.a = this;
        wn5Var.b = this;
        getNotificationCenter().b(this, nm7.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.T);
        wn5 wn5Var = this.G;
        if (wn5Var != null) {
            wn5Var.c();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.G.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        this.G.j(i, strArr, iArr);
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
            kz4 kz4Var = this.a;
            if (kz4Var != null) {
                kz4Var.a(getThemedColor(cmb.c6));
            }
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        wn5 wn5Var = this.G;
        if (wn5Var != null) {
            wn5Var.f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        wn5 wn5Var = this.G;
        if (wn5Var != null && (str = wn5Var.f) != null) {
            bundle.putString("path", str);
        }
        yd ydVar = this.r;
        if (ydVar != null) {
            String obj = ((vc) ydVar.b).getText().toString();
            if (!obj.isEmpty()) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void T() {
    }

    @Override
    public final void V(float f, int i) {
    }
}
