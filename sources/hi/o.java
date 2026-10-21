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
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.w9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hr;
import org.telegram.ui.ju0;
import org.telegram.ui.qn;
import w7.b6;
import w7.z5;
public final class o extends n2 implements d50, NotificationCenter.NotificationCenterDelegate, ne.d {
    public e50 E;
    public TLRPC.FileLocation F;
    public di.n G;
    public TLRPC.Chat H;
    public TLRPC.ChatFull I;
    public final b2[] J;
    public final m K;
    public final ne.b f12191a;
    public long f12192b;
    public w1 f12193c;
    public c71 d;
    public String e;
    public boolean f12194f;
    public boolean h;
    public ah.x f12195n;
    public n f12196r;
    public g6 f12197s;
    public w9 v;
    public AnimatorSet f12198w;
    public RadialProgressView f12199x;
    public h9 f12200y;

    public o(Bundle bundle) {
        super(bundle);
        this.f12191a = new ne.b(0, this, bs.h, 320L, false);
        this.J = new b2[1];
        this.K = new m(this);
    }

    public static boolean U(o oVar, h61 h61Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        Object obj = h61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j10 = -chat.f20276id;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, oVar.H);
            z11 = isChannelAndNotMegaGroup;
            z10 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.f20423id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, oVar.H);
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
            i80 F = i80.F(oVar.f12193c, null, view);
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
            F.W(oVar.d.V0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void V(o oVar, h61 h61Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = h61Var.d;
        if (i10 == 140) {
            if (!oVar.E.g() && (chatPhoto = (chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.f12192b))).photo) != null && chatPhoto.photo_big != null) {
                ImageLocation imageLocation = null;
                PhotoViewer.u1().M2(null, oVar, null);
                TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                int i11 = chatPhoto2.dc_id;
                if (i11 != 0) {
                    chatPhoto2.photo_big.dc_id = i11;
                }
                TLRPC.ChatFull chatFull = oVar.I;
                if (chatFull != null) {
                    TLRPC.Photo photo = chatFull.chat_photo;
                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                        imageLocation = ImageLocation.getForPhoto(oVar.I.chat_photo.video_sizes.get(0), oVar.I.chat_photo);
                    }
                }
                PhotoViewer.u1().g2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, oVar.K, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            return;
        }
        boolean z10 = true;
        if (i10 == 141) {
            e50 e50Var = oVar.E;
            if (oVar.F == null) {
                z10 = false;
            }
            e50Var.n(z10, new h(oVar, 0), new e1(6), 0);
        } else if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", oVar.f12192b);
            bundle.putInt("type", 1);
            hr hrVar = new hr(bundle);
            hrVar.x0(oVar.I);
            oVar.presentFragment(hrVar);
        } else if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", oVar.f12192b);
            bundle2.putInt("type", 0);
            hr hrVar2 = new hr(bundle2);
            hrVar2.x0(oVar.I);
            oVar.presentFragment(hrVar2);
        } else if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", oVar.f12192b);
            oVar.presentFragment(new r(bundle3));
        } else if (i10 == 150) {
            oVar.Z(true);
        } else if (i10 == 151) {
            oVar.Z(false);
        } else if (i10 == 145) {
            f5.r(oVar, false, oVar.H, null, false, true, true, false, new j(oVar));
        } else if (i10 == 146) {
            t0.e(oVar.J, oVar, oVar.currentAccount, oVar.H);
        } else {
            Object obj = h61Var.G;
            if (obj instanceof TLRPC.Chat) {
                oVar.presentFragment(qn.W9(-((TLRPC.Chat) obj).f20276id));
            } else if (obj instanceof TLRPC.User) {
                oVar.presentFragment(qn.W9(((TLRPC.User) obj).f20423id));
            }
        }
    }

    public static void W(o oVar) {
        oVar.F = null;
        MessagesController.getInstance(oVar.currentAccount).changeChatAvatar(oVar.f12192b, null, null, null, null, 0.0d, null, null, null, null);
        oVar.a0(false, true);
        oVar.v.h(null, null, oVar.f12200y, oVar.H);
    }

    @Override
    public final void E(float f7) {
        RadialProgressView radialProgressView = this.f12199x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f12199x;
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
        if (this.f12194f == this.h && TextUtils.equals(((ai.t) this.f12195n.f899b).getText().toString(), this.e)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f12191a.a(z10, true);
    }

    public final void Z(boolean z10) {
        if (this.h == z10) {
            return;
        }
        i6 i6Var = (i6) this.d.z1(151);
        if (i6Var != null) {
            i6Var.a(!z10);
        }
        i6 i6Var2 = (i6) this.d.z1(150);
        if (i6Var2 != null) {
            i6Var2.a(z10);
        }
        this.h = z10;
        Y();
    }

    public final void a0(boolean z10, boolean z11) {
        if (this.f12199x == null) {
            return;
        }
        AnimatorSet animatorSet = this.f12198w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f12198w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f12198w = animatorSet2;
            if (z10) {
                this.f12199x.setVisibility(0);
                this.f12197s.setVisibility(0);
                AnimatorSet animatorSet3 = this.f12198w;
                RadialProgressView radialProgressView = this.f12199x;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f12197s, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f12199x;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f12197s, property2, 0.0f));
            }
            this.f12198w.setDuration(180L);
            this.f12198w.addListener(new ah.p0(17, this, z10));
            this.f12198w.start();
        } else if (z10) {
            this.f12199x.setAlpha(1.0f);
            this.f12199x.setVisibility(0);
            this.f12197s.setAlpha(1.0f);
            this.f12197s.setVisibility(0);
        } else {
            this.f12199x.setAlpha(0.0f);
            this.f12199x.setVisibility(4);
            this.f12197s.setAlpha(0.0f);
            this.f12197s.setVisibility(4);
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        i2.e.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 6));
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(h6.f20990d6));
        this.actionBar.M(new bh.b(cVar), fh.c.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        w1 w1Var = new w1(this, context);
        this.f12193c = w1Var;
        w1Var.setBackgroundColor(h6.x0(null, h6.f20932a7, false));
        this.f12200y = new h9(this.H);
        n nVar = new n(context);
        this.f12196r = nVar;
        nVar.f12187a.e(this.H, this.f12200y);
        this.v = this.f12196r.f12187a;
        String name = DialogObject.getName(this.H);
        this.e = name;
        d6 d6Var = this.resourceProvider;
        ah.x xVar = new ah.x(context, 6);
        ai.t tVar = new ai.t(context, 1);
        xVar.f899b = tVar;
        tVar.setTextColor(h6.w0(h6.G6, d6Var));
        tVar.setLinkTextColor(h6.w0(h6.f21049gc, d6Var));
        tVar.setHintTextColor(h6.w0(h6.H6, d6Var));
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
        this.f12195n = xVar;
        tVar.setText(name);
        ((ai.t) this.f12195n.f899b).setSelection(name.length());
        ((ai.t) this.f12195n.f899b).addTextChangedListener(new ai.u(this, 2));
        di.n nVar2 = new di.n(this, context);
        this.G = nVar2;
        nVar2.setTextColor(getThemedColor(h6.Sh));
        this.G.setText(LocaleController.getString(R.string.Save));
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextSize(1, 14.0f);
        this.G.setGravity(17);
        this.G.setVisibility(8);
        this.G.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.G.setOnClickListener(new hg.r0(this, 2));
        b6.a(this.G);
        this.actionBar.addView(this.G, z5.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        g6 g6Var = new g6(this, context);
        this.f12197s = g6Var;
        this.f12196r.addView(g6Var, z5.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f12199x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f12199x.setProgressColor(-1);
        this.f12199x.setNoProgress(false);
        this.f12196r.addView(this.f12199x, z5.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        a0(false, false);
        c71 c71Var = new c71(this, new i(this, 1), new j(this), new j(this));
        this.d = c71Var;
        c71Var.setClipToPadding(false);
        c71 c71Var2 = this.d;
        c71Var2.W2.f30861r = false;
        c71Var2.p1();
        this.actionBar.setBackground(null);
        this.f12193c.addView(this.d, z5.c(-1.0f, -1));
        this.f12193c.addView(this.actionBar, z5.e(-1, -2, 48));
        w1 w1Var2 = this.f12193c;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.i0.f44826a;
        r0.a0.i(w1Var2, jVar);
        w1 w1Var3 = this.f12193c;
        this.fragmentView = w1Var3;
        return w1Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20277id == this.f12192b) {
                this.I = chatFull;
                this.d.W2.N(true);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.E.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.E.f25722c && super.dismissDialogOnPause(dialog)) {
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
    public final ju0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((ai.t) this.f12195n.f899b).getText().toString();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.E.h(i10, i11, intent);
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.f12192b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f12192b));
        this.H = chat;
        if (chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12194f = z10;
        this.h = z10;
        this.I = getMessagesController().getChatFull(this.f12192b);
        e50 e50Var = new e50(3, true, true);
        this.E = e50Var;
        e50Var.f25720a = this;
        e50Var.f25721b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        e50 e50Var = this.E;
        if (e50Var != null) {
            e50Var.d();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.E.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.E.j(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.E.k();
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        this.G.setAlpha(f7);
        this.G.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.G.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        di.n nVar = this.G;
        if (f7 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        nVar.setVisibility(i11);
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        e50 e50Var = this.E;
        if (e50Var != null) {
            e50Var.f25723f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        e50 e50Var = this.E;
        if (e50Var != null && (str = e50Var.f25723f) != null) {
            bundle.putString("path", str);
        }
        ah.x xVar = this.f12195n;
        if (xVar != null) {
            String obj = ((ai.t) xVar.f899b).getText().toString();
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
