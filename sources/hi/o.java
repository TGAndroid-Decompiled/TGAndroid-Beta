package hi;

import ai.w1;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import ei.e1;
import ei.g6;
import i2.o1;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.jr;
import org.telegram.ui.mu0;
import org.telegram.ui.sn;
import w7.b6;
import w7.z5;
public final class o extends o2 implements d50, NotificationCenter.NotificationCenterDelegate, ne.d {
    public h9 E;
    public e50 F;
    public TLRPC.FileLocation G;
    public di.n H;
    public TLRPC.Chat I;
    public TLRPC.ChatFull J;
    public final c2[] K;
    public final m L;
    public gh.c f12222a;
    public final ne.b f12223b;
    public long f12224c;
    public w1 d;
    public j71 e;
    public String f12225f;
    public boolean h;
    public boolean f12226n;
    public ah.x f12227r;
    public n f12228s;
    public g6 v;
    public w9 f12229w;
    public AnimatorSet f12230x;
    public RadialProgressView f12231y;

    public o(Bundle bundle) {
        super(bundle);
        this.f12223b = new ne.b(0, this, bs.h, 320L, false);
        this.K = new c2[1];
        this.L = new m(this);
    }

    public static boolean U(o oVar, m61 m61Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        Object obj = m61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j10 = -chat.f20343id;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, oVar.I);
            z11 = isChannelAndNotMegaGroup;
            z10 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.f20490id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, oVar.I);
                z10 = isBot;
                z11 = false;
            }
            return false;
        }
        boolean z13 = canRemoveBotFromCommunity;
        long j11 = j10;
        int b10 = t0.b(oVar.currentAccount, j11);
        if (b10 != 1 && b10 != 2) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z13 || z12) {
            j80 F = j80.F(oVar.d, null, view);
            int i11 = R.drawable.msg_viewintopic;
            if (z10) {
                i10 = R.string.CommunityMenuViewBot;
            } else if (z11) {
                i10 = R.string.CommunityMenuViewChannel;
            } else {
                i10 = R.string.CommunityMenuViewGroup;
            }
            F.l(i11, LocaleController.getString(i10), new g(oVar, j11, 1), z12);
            F.m(z13, R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new l(oVar, z10, z11, j11, 0));
            F.W(oVar.e.W0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void V(o oVar, m61 m61Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = m61Var.d;
        if (i10 == 140) {
            if (!oVar.F.g() && (chatPhoto = (chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.f12224c))).photo) != null && chatPhoto.photo_big != null) {
                ImageLocation imageLocation = null;
                PhotoViewer.u1().M2(null, oVar, null);
                TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                int i11 = chatPhoto2.dc_id;
                if (i11 != 0) {
                    chatPhoto2.photo_big.dc_id = i11;
                }
                TLRPC.ChatFull chatFull = oVar.J;
                if (chatFull != null) {
                    TLRPC.Photo photo = chatFull.chat_photo;
                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                        imageLocation = ImageLocation.getForPhoto(oVar.J.chat_photo.video_sizes.get(0), oVar.J.chat_photo);
                    }
                }
                PhotoViewer.u1().g2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, oVar.L, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            return;
        }
        boolean z10 = true;
        if (i10 == 141) {
            e50 e50Var = oVar.F;
            if (oVar.G == null) {
                z10 = false;
            }
            e50Var.n(z10, new h(oVar, 0), new e1(6), 0);
        } else if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", oVar.f12224c);
            bundle.putInt("type", 1);
            jr jrVar = new jr(bundle);
            jrVar.x0(oVar.J);
            oVar.presentFragment(jrVar);
        } else if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", oVar.f12224c);
            bundle2.putInt("type", 0);
            jr jrVar2 = new jr(bundle2);
            jrVar2.x0(oVar.J);
            oVar.presentFragment(jrVar2);
        } else if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", oVar.f12224c);
            oVar.presentFragment(new r(bundle3));
        } else if (i10 == 150) {
            oVar.Z(true);
        } else if (i10 == 151) {
            oVar.Z(false);
        } else if (i10 == 145) {
            f5.s(oVar, false, oVar.I, null, false, true, true, false, new j(oVar));
        } else if (i10 == 146) {
            t0.e(oVar.K, oVar, oVar.currentAccount, oVar.I);
        } else {
            Object obj = m61Var.G;
            if (obj instanceof TLRPC.Chat) {
                oVar.presentFragment(sn.W9(-((TLRPC.Chat) obj).f20343id));
            } else if (obj instanceof TLRPC.User) {
                oVar.presentFragment(sn.W9(((TLRPC.User) obj).f20490id));
            }
        }
    }

    public static void W(o oVar) {
        oVar.G = null;
        MessagesController.getInstance(oVar.currentAccount).changeChatAvatar(oVar.f12224c, null, null, null, null, 0.0d, null, null, null, null);
        oVar.a0(false, true);
        oVar.f12229w.h(null, null, oVar.E, oVar.I);
    }

    @Override
    public final void E(float f7) {
        RadialProgressView radialProgressView = this.f12231y;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f12231y;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new k(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void Y() {
        boolean z10;
        if (this.h == this.f12226n && TextUtils.equals(((ai.t) this.f12227r.f900b).getText().toString(), this.f12225f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f12223b.a(z10, true);
    }

    public final void Z(boolean z10) {
        if (this.f12226n == z10) {
            return;
        }
        j6 j6Var = (j6) this.e.E1(151);
        if (j6Var != null) {
            j6Var.a(!z10);
        }
        j6 j6Var2 = (j6) this.e.E1(150);
        if (j6Var2 != null) {
            j6Var2.a(z10);
        }
        this.f12226n = z10;
        Y();
    }

    public final void a0(boolean z10, boolean z11) {
        if (this.f12231y == null) {
            return;
        }
        AnimatorSet animatorSet = this.f12230x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f12230x = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f12230x = animatorSet2;
            if (z10) {
                this.f12231y.setVisibility(0);
                this.v.setVisibility(0);
                AnimatorSet animatorSet3 = this.f12230x;
                RadialProgressView radialProgressView = this.f12231y;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.v, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f12231y;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.v, property2, 0.0f));
            }
            this.f12230x.setDuration(180L);
            this.f12230x.addListener(new ah.p0(17, this, z10));
            this.f12230x.start();
        } else if (z10) {
            this.f12231y.setAlpha(1.0f);
            this.f12231y.setVisibility(0);
            this.v.setAlpha(1.0f);
            this.v.setVisibility(0);
        } else {
            this.f12231y.setAlpha(0.0f);
            this.f12231y.setVisibility(4);
            this.v.setAlpha(0.0f);
            this.v.setVisibility(4);
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        o1.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 6));
        gh.c cVar = new gh.c();
        this.f12222a = cVar;
        cVar.a(getThemedColor(k6.f21183d6));
        this.actionBar.L(new bh.b(cVar), fh.c.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        w1 w1Var = new w1(this, context);
        this.d = w1Var;
        r6.i(k6.f21125a7, w1Var, null);
        this.E = new h9(this.I);
        n nVar = new n(context);
        this.f12228s = nVar;
        nVar.f12218a.e(this.I, this.E);
        this.f12229w = this.f12228s.f12218a;
        String name = DialogObject.getName(this.I);
        this.f12225f = name;
        org.telegram.ui.ActionBar.g6 g6Var = this.resourceProvider;
        ah.x xVar = new ah.x(context, 6);
        ai.t tVar = new ai.t(context, 1);
        xVar.f900b = tVar;
        r6.W(tVar, k6.G6, g6Var);
        r6.I(tVar, k6.f21242gc, g6Var);
        r6.F(tVar, k6.H6, g6Var);
        tVar.setTextSize(1, 16.0f);
        tVar.setMaxLines(Integer.MAX_VALUE);
        tVar.setBackground(null);
        tVar.setImeOptions(tVar.getImeOptions() | 268435456);
        tVar.setInputType(tVar.getInputType() | 16384);
        tVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        tVar.setMinHeight(AndroidUtilities.dp(50.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        xVar.addView(tVar, z5.d(-1, -2.0f, i10 | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f12227r = xVar;
        tVar.setText(name);
        ((ai.t) this.f12227r.f900b).setSelection(name.length());
        ((ai.t) this.f12227r.f900b).addTextChangedListener(new ai.u(this, 2));
        di.n nVar2 = new di.n(this, context);
        this.H = nVar2;
        r6.W(nVar2, k6.Sh, getResourceProvider());
        this.H.setText(LocaleController.getString(R.string.Save));
        this.H.setTypeface(AndroidUtilities.bold());
        this.H.setTextSize(1, 14.0f);
        this.H.setGravity(17);
        this.H.setVisibility(8);
        this.H.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.H.setOnClickListener(new hg.r0(this, 2));
        b6.a(this.H);
        this.actionBar.addView(this.H, z5.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        g6 g6Var2 = new g6(this, context);
        this.v = g6Var2;
        this.f12228s.addView(g6Var2, z5.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f12231y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f12231y.setProgressColor(-1);
        this.f12231y.setNoProgress(false);
        this.f12228s.addView(this.f12231y, z5.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        a0(false, false);
        j71 j71Var = new j71(this, new i(this, 1), new j(this), new j(this));
        this.e = j71Var;
        j71Var.setClipToPadding(false);
        j71 j71Var2 = this.e;
        b71 b71Var = j71Var2.Z2;
        b71Var.f24972r = false;
        b71Var.f24973s = true;
        j71Var2.t1();
        this.actionBar.setBackground(null);
        this.d.addView(this.e, z5.c(-1.0f, -1));
        this.d.addView(this.actionBar, z5.e(-1, -2, 48));
        w1 w1Var2 = this.d;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.i0.f45242a;
        r0.a0.i(w1Var2, jVar);
        w1 w1Var3 = this.d;
        this.fragmentView = w1Var3;
        return w1Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20344id == this.f12224c) {
                this.J = chatFull;
                this.e.Z2.N(true);
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
        if (dialog != this.F.f25854c && super.dismissDialogOnPause(dialog)) {
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

    @Override
    public final mu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((ai.t) this.f12227r.f900b).getText().toString();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        this.H.setAlpha(f7);
        this.H.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.H.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        di.n nVar = this.H;
        if (f7 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        nVar.setVisibility(i11);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.F.h(i10, i11, intent);
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.f12224c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f12224c));
        this.I = chat;
        if (chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        this.f12226n = z10;
        this.J = getMessagesController().getChatFull(this.f12224c);
        e50 e50Var = new e50(3, true, true);
        this.F = e50Var;
        e50Var.f25852a = this;
        e50Var.f25853b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        e50 e50Var = this.F;
        if (e50Var != null) {
            e50Var.d();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.F.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.F.j(i10, strArr, iArr);
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
            gh.c cVar = this.f12222a;
            if (cVar != null) {
                cVar.a(getThemedColor(k6.f21183d6));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        e50 e50Var = this.F;
        if (e50Var != null) {
            e50Var.f25855f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        e50 e50Var = this.F;
        if (e50Var != null && (str = e50Var.f25855f) != null) {
            bundle.putString("path", str);
        }
        ah.x xVar = this.f12227r;
        if (xVar != null) {
            String obj = ((ai.t) xVar.f900b).getText().toString();
            if (!obj.isEmpty()) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
