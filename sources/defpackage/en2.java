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
public final class en2 extends d implements vl5, gk7, x74 {
    public RadialProgressView E;
    public pb0 F;
    public wl5 G;
    public TLRPC.FileLocation H;
    public t8 I;
    public TLRPC.Chat J;
    public TLRPC.ChatFull K;
    public final hd[] L;
    public final cn2 M;
    public ix4 a;
    public final fm0 b;
    public long c;
    public eb0 d;
    public q5c e;
    public String f;
    public boolean h;
    public boolean n;
    public yc r;
    public dn2 s;
    public s71 w;
    public be0 x;
    public AnimatorSet y;

    public en2(Bundle bundle) {
        super(bundle);
        this.b = new fm0(0, this, s33.h, 320L, false);
        this.L = new hd[1];
        this.M = new cn2(this);
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
        gl.d3(new ph1(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void Y() {
        boolean z;
        if (this.h == this.n && TextUtils.equals(((ps0) this.r.b).getText().toString(), this.f)) {
            z = false;
        } else {
            z = true;
        }
        this.b.a(z, true);
    }

    public final void Z(long j) {
        na7.q1(this.currentAccount).S2(j, this.c, true, false, new an2(this, (byte) 0));
    }

    public final void a0() {
        this.H = null;
        na7.q1(this.currentAccount).x(this.c, null, null, null, null, 0.0d, null, null, null, null);
        e0(false, true);
        this.x.m(null, null, this.F, this.J);
    }

    public final void b0(c4c c4cVar) {
        TLRPC.Chat K0;
        TLRPC.ChatPhoto chatPhoto;
        int i = c4cVar.d;
        if (i == 140) {
            if (!this.G.g() && (chatPhoto = (K0 = getMessagesController().K0(Long.valueOf(this.c))).photo) != null && chatPhoto.photo_big != null) {
                gl5 gl5Var = null;
                PhotoViewer.r0().S1(null, this, null);
                TLRPC.ChatPhoto chatPhoto2 = K0.photo;
                int i2 = chatPhoto2.dc_id;
                if (i2 != 0) {
                    chatPhoto2.photo_big.dc_id = i2;
                }
                TLRPC.ChatFull chatFull = this.K;
                if (chatFull != null) {
                    TLRPC.Photo photo = chatFull.chat_photo;
                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                        gl5Var = gl5.j(this.K.chat_photo.video_sizes.get(0), this.K.chat_photo);
                    }
                }
                PhotoViewer.r0().m1(null, K0.photo.photo_big, null, gl5Var, null, null, null, 0, this.M, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            return;
        }
        boolean z = true;
        if (i == 141) {
            wl5 wl5Var = this.G;
            if (this.H == null) {
                z = false;
            }
            wl5Var.n(z, new zm2(this, (byte) 0), new g5((byte) 6), 0);
        } else if (i == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.c);
            bundle.putInt("type", 1);
            kf2 kf2Var = new kf2(bundle);
            kf2Var.A0(this.K);
            presentFragment(kf2Var);
        } else if (i == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", this.c);
            bundle2.putInt("type", 0);
            kf2 kf2Var2 = new kf2(bundle2);
            kf2Var2.A0(this.K);
            presentFragment(kf2Var2);
        } else if (i == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", this.c);
            presentFragment(new pn2(bundle3));
        } else if (i == 150) {
            d0(true);
        } else if (i == 151) {
            d0(false);
        } else if (i == 145) {
            ij.r(this, false, this.J, null, false, true, true, false, new bn2(this));
        } else if (i == 146) {
            no2.e(this.L, this, this.currentAccount, this.J);
        } else {
            Object obj = c4cVar.H;
            if (obj instanceof TLRPC.Chat) {
                presentFragment(mu1.U9(-((TLRPC.Chat) obj).id));
            } else if (obj instanceof TLRPC.User) {
                presentFragment(mu1.U9(((TLRPC.User) obj).id));
            }
        }
    }

    @Override
    public final boolean c() {
        return true;
    }

    public final boolean c0(c4c c4cVar, View view) {
        long j;
        boolean u;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        Object obj = c4cVar.H;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j = -chat.id;
            boolean V = hc2.V(chat);
            TLRPC.Chat chat2 = this.J;
            if (chat2 != null && (chat.creator || hc2.y(27, chat2))) {
                z = true;
            } else {
                z = false;
            }
            z2 = V;
            u = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j = user.id;
                u = l7c.u(user);
                TLRPC.Chat chat3 = this.J;
                if (chat3 != null && ((user.bot && user.bot_can_edit) || hc2.y(27, chat3))) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = false;
            }
            return false;
        }
        boolean z4 = z;
        int b = no2.b(this.currentAccount, j);
        if (b != 1 && b != 2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z4 || z3) {
            cs5 G = cs5.G(this.d, null, view);
            if (u) {
                i = 2131751898;
            } else if (z2) {
                i = 2131751897;
            } else {
                i = 2131751896;
            }
            G.k(2131232427, k96.M0(i, null), new ym2(this, j, (byte) 1), z3);
            G.l(2131232092, new mo1(this, u, z2, j, (byte) 1), k96.M0(2131751903, null), z4, true);
            G.X(this.e.V0(view, true));
            G.a0();
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new ed0(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 1));
        ix4 ix4Var = new ix4();
        this.a = ix4Var;
        ix4Var.a(getThemedColor(bkb.c6));
        this.actionBar.P(new kl0(ix4Var, ix4Var, ix4Var), nod.o(this.resourceProvider), false);
        this.actionBar.R0 = true;
        eb0 eb0Var = new eb0(this, context);
        this.d = eb0Var;
        zkb.h(bkb.Z6, null, eb0Var);
        this.F = new pb0(this.J);
        dn2 dn2Var = new dn2(context);
        this.s = dn2Var;
        dn2Var.a.f(this.J, this.F);
        this.x = this.s.a;
        String l = cf3.l(this.J);
        this.f = l;
        wjb wjbVar = this.resourceProvider;
        yc ycVar = new yc(context, (byte) 15);
        ps0 ps0Var = new ps0(context, (byte) 2);
        ycVar.b = ps0Var;
        zkb.X(ps0Var, bkb.F6, wjbVar);
        zkb.G(ps0Var, bkb.Wc, wjbVar);
        zkb.D(ps0Var, bkb.G6, wjbVar);
        ps0Var.setTextSize(1, 16.0f);
        ps0Var.setMaxLines(Integer.MAX_VALUE);
        ps0Var.setBackground(null);
        ps0Var.setImeOptions(ps0Var.getImeOptions() | 268435456);
        ps0Var.setInputType(ps0Var.getInputType() | 16384);
        ps0Var.setPadding(gl.L(4.0f), gl.L(10.0f), gl.L(4.0f), gl.L(11.0f));
        ps0Var.setMinHeight(gl.L(50.0f));
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        ycVar.addView(ps0Var, nme.d(-1, -2.0f, i | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.r = ycVar;
        ps0Var.setText(l);
        ((ps0) this.r.b).setSelection(l.length());
        ((ps0) this.r.b).addTextChangedListener(new b7(this, (byte) 15));
        t8 t8Var = new t8(this, context);
        this.I = t8Var;
        zkb.X(t8Var, bkb.Ii, getResourceProvider());
        this.I.setText(k96.M0(2131745754, null));
        this.I.setTypeface(gl.o());
        this.I.setTextSize(1, 14.0f);
        this.I.setGravity(17);
        this.I.setVisibility(8);
        this.I.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        this.I.setOnClickListener(new x91(this, (byte) 15));
        ote.a(this.I);
        this.actionBar.addView(this.I, nme.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        s71 s71Var = new s71(this, context);
        this.w = s71Var;
        this.s.addView(s71Var, nme.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.E = radialProgressView;
        radialProgressView.setSize(gl.L(30.0f));
        this.E.setProgressColor(-1);
        this.E.setNoProgress(false);
        this.s.addView(this.E, nme.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        e0(false, false);
        q5c q5cVar = new q5c(this, new an2(this, (byte) 1), new bn2(this), new bn2(this));
        this.e = q5cVar;
        q5cVar.setClipToPadding(false);
        q5c q5cVar2 = this.e;
        l5c l5cVar = q5cVar2.g3;
        l5cVar.r = false;
        l5cVar.s = true;
        q5cVar2.r1();
        this.actionBar.setBackground(null);
        this.d.addView(this.e, nme.c(-1.0f, -1));
        this.d.addView(this.actionBar, nme.e(-1, -2, 48));
        eb0 eb0Var2 = this.d;
        bn2 bn2Var = new bn2(this);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(eb0Var2, bn2Var);
        eb0 eb0Var3 = this.d;
        this.fragmentView = eb0Var3;
        return eb0Var3;
    }

    public final void d0(boolean z) {
        if (this.n == z) {
            return;
        }
        uy8 uy8Var = (uy8) this.e.B1(151);
        if (uy8Var != null) {
            uy8Var.a(!z);
        }
        uy8 uy8Var2 = (uy8) this.e.B1(150);
        if (uy8Var2 != null) {
            uy8Var2.a(z);
        }
        this.n = z;
        Y();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.S) {
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

    public final void e0(boolean z, boolean z2) {
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
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((ps0) this.r.b).getText().toString();
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
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.c));
        this.J = K0;
        if (K0 != null && ((tL_chatBannedRights = K0.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        this.n = z;
        this.K = getMessagesController().L0(this.c);
        wl5 wl5Var = new wl5(3, true, true);
        this.G = wl5Var;
        wl5Var.a = this;
        wl5Var.b = this;
        getNotificationCenter().b(this, kk7.S);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.S);
        wl5 wl5Var = this.G;
        if (wl5Var != null) {
            wl5Var.c();
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
            ix4 ix4Var = this.a;
            if (ix4Var != null) {
                ix4Var.a(getThemedColor(bkb.c6));
            }
            a aVar = this.actionBar;
            if (aVar != null) {
                aVar.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        int i2;
        this.I.setAlpha(f);
        this.I.setScaleX(gl.R1(0.75f, 1.0f, f));
        this.I.setScaleY(gl.R1(0.75f, 1.0f, f));
        t8 t8Var = this.I;
        if (f > 0.0f) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        t8Var.setVisibility(i2);
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        wl5 wl5Var = this.G;
        if (wl5Var != null) {
            wl5Var.f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        wl5 wl5Var = this.G;
        if (wl5Var != null && (str = wl5Var.f) != null) {
            bundle.putString("path", str);
        }
        yc ycVar = this.r;
        if (ycVar != null) {
            String obj = ((ps0) ycVar.b).getText().toString();
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
    public final void D(float f, int i) {
    }
}
