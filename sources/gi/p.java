package gi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import bi.e7;
import di.f1;
import di.i2;
import di.r6;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.x9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.co;
import org.telegram.ui.cv0;
import org.telegram.ui.vr;
import w7.x5;
import w7.z5;
public final class p extends n2 implements t40, NotificationCenter.NotificationCenterDelegate, le.d {
    public u40 E;
    public TLRPC.FileLocation F;
    public ci.n G;
    public TLRPC.Chat H;
    public TLRPC.ChatFull I;
    public final b2[] J;
    public final m K;
    public final le.b f10740a;
    public long f10741b;
    public e7 f10742c;
    public d61 d;
    public String f10743e;
    public boolean f10744f;
    public boolean h;
    public ah.y f10745n;
    public n f10746r;
    public r6 f10747s;
    public x9 v;
    public AnimatorSet f10748w;
    public RadialProgressView f10749x;
    public i9 f10750y;

    public p(Bundle bundle) {
        super(bundle);
        this.f10740a = new le.b(0, this, pr.h, 320L, false);
        this.J = new b2[1];
        this.K = new m(this);
    }

    public static boolean U(p pVar, h51 h51Var, View view) {
        long j3;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j3 = -chat.f19869id;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, pVar.H);
            z11 = isChannelAndNotMegaGroup;
            z10 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j3 = user.f20016id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, pVar.H);
                z10 = isBot;
                z11 = false;
            }
            return false;
        }
        boolean z13 = canRemoveBotFromCommunity;
        long j10 = j3;
        int b10 = u0.b(pVar.currentAccount, j10);
        if (b10 != 1 && b10 != 2) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z13 || z12) {
            n70 F = n70.F(pVar.f10742c, null, view);
            int i11 = R.drawable.msg_viewintopic;
            if (z10) {
                i10 = R.string.CommunityMenuViewBot;
            } else if (z11) {
                i10 = R.string.CommunityMenuViewChannel;
            } else {
                i10 = R.string.CommunityMenuViewGroup;
            }
            F.l(i11, LocaleController.getString(i10), new g(pVar, j10, 1), z12);
            F.m(z13, R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new l(pVar, z10, z11, j10, 0));
            F.W(pVar.d.U0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void V(p pVar, h51 h51Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = h51Var.d;
        if (i10 == 140) {
            if (!pVar.E.h() && (chatPhoto = (chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f10741b))).photo) != null && chatPhoto.photo_big != null) {
                ImageLocation imageLocation = null;
                PhotoViewer.t1().K2(null, pVar, null);
                TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                int i11 = chatPhoto2.dc_id;
                if (i11 != 0) {
                    chatPhoto2.photo_big.dc_id = i11;
                }
                TLRPC.ChatFull chatFull = pVar.I;
                if (chatFull != null) {
                    TLRPC.Photo photo = chatFull.chat_photo;
                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                        imageLocation = ImageLocation.getForPhoto(pVar.I.chat_photo.video_sizes.get(0), pVar.I.chat_photo);
                    }
                }
                PhotoViewer.t1().e2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, pVar.K, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            return;
        }
        boolean z10 = true;
        if (i10 == 141) {
            u40 u40Var = pVar.E;
            if (pVar.F == null) {
                z10 = false;
            }
            u40Var.o(z10, new h(pVar, 0), new f1(6), 0);
        } else if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", pVar.f10741b);
            bundle.putInt("type", 1);
            vr vrVar = new vr(bundle);
            vrVar.x0(pVar.I);
            pVar.presentFragment(vrVar);
        } else if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", pVar.f10741b);
            bundle2.putInt("type", 0);
            vr vrVar2 = new vr(bundle2);
            vrVar2.x0(pVar.I);
            pVar.presentFragment(vrVar2);
        } else if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", pVar.f10741b);
            pVar.presentFragment(new s(bundle3));
        } else if (i10 == 150) {
            pVar.Z(true);
        } else if (i10 == 151) {
            pVar.Z(false);
        } else if (i10 == 145) {
            e5.s(pVar, false, pVar.H, null, false, true, true, false, new j(pVar));
        } else if (i10 == 146) {
            u0.e(pVar.J, pVar, pVar.currentAccount, pVar.H);
        } else {
            Object obj = h51Var.G;
            if (obj instanceof TLRPC.Chat) {
                pVar.presentFragment(co.R9(-((TLRPC.Chat) obj).f19869id));
            } else if (obj instanceof TLRPC.User) {
                pVar.presentFragment(co.R9(((TLRPC.User) obj).f20016id));
            }
        }
    }

    public static void W(p pVar) {
        pVar.F = null;
        MessagesController.getInstance(pVar.currentAccount).changeChatAvatar(pVar.f10741b, null, null, null, null, 0.0d, null, null, null, null);
        pVar.a0(false, true);
        pVar.v.h(null, null, pVar.f10750y, pVar.H);
    }

    @Override
    public final void C(float f7) {
        RadialProgressView radialProgressView = this.f10749x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        int i11;
        this.G.setAlpha(f7);
        this.G.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.G.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        ci.n nVar = this.G;
        if (f7 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        nVar.setVisibility(i11);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f10749x;
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
        if (this.f10744f == this.h && TextUtils.equals(((o) this.f10745n.f718b).getText().toString(), this.f10743e)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f10740a.a(z10, true);
    }

    public final void Z(boolean z10) {
        if (this.h == z10) {
            return;
        }
        i6 i6Var = (i6) this.d.x1(151);
        if (i6Var != null) {
            i6Var.a(!z10);
        }
        i6 i6Var2 = (i6) this.d.x1(150);
        if (i6Var2 != null) {
            i6Var2.a(z10);
        }
        this.h = z10;
        Y();
    }

    public final void a0(boolean z10, boolean z11) {
        if (this.f10749x == null) {
            return;
        }
        AnimatorSet animatorSet = this.f10748w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f10748w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f10748w = animatorSet2;
            if (z10) {
                this.f10749x.setVisibility(0);
                this.f10747s.setVisibility(0);
                AnimatorSet animatorSet3 = this.f10748w;
                RadialProgressView radialProgressView = this.f10749x;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f10747s, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f10749x;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f10747s, property2, 0.0f));
            }
            this.f10748w.setDuration(180L);
            this.f10748w.addListener(new ah.q0(16, this, z10));
            this.f10748w.start();
        } else if (z10) {
            this.f10749x.setAlpha(1.0f);
            this.f10749x.setVisibility(0);
            this.f10747s.setAlpha(1.0f);
            this.f10747s.setVisibility(0);
        } else {
            this.f10749x.setAlpha(0.0f);
            this.f10749x.setVisibility(4);
            this.f10747s.setAlpha(0.0f);
            this.f10747s.setVisibility(4);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        i2.g.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 5;
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 5));
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(j6.f20663d6));
        this.actionBar.M(new bh.b(cVar), fh.b.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        e7 e7Var = new e7(this, context);
        this.f10742c = e7Var;
        e7Var.setBackgroundColor(j6.w0(null, j6.f20607a7, false));
        this.f10750y = new i9(this.H);
        n nVar = new n(context);
        this.f10746r = nVar;
        nVar.f10731a.e(this.H, this.f10750y);
        this.v = this.f10746r.f10731a;
        String name = DialogObject.getName(this.H);
        this.f10743e = name;
        f6 f6Var = this.resourceProvider;
        ah.y yVar = new ah.y(context, 5);
        o oVar = new o(context, 0);
        yVar.f718b = oVar;
        oVar.setTextColor(j6.v0(j6.G6, f6Var));
        oVar.setLinkTextColor(j6.v0(j6.gc, f6Var));
        oVar.setHintTextColor(j6.v0(j6.H6, f6Var));
        oVar.setTextSize(1, 16.0f);
        oVar.setMaxLines(Integer.MAX_VALUE);
        oVar.setBackground(null);
        oVar.setImeOptions(oVar.getImeOptions() | 268435456);
        oVar.setInputType(oVar.getInputType() | 16384);
        oVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        oVar.setMinHeight(AndroidUtilities.dp(50.0f));
        if (!LocaleController.isRTL) {
            i10 = 3;
        }
        yVar.addView(oVar, x5.d(-1, -2.0f, i10 | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f10745n = yVar;
        oVar.setText(name);
        ((o) this.f10745n.f718b).setSelection(name.length());
        ((o) this.f10745n.f718b).addTextChangedListener(new i2(this, 1));
        ci.n nVar2 = new ci.n(this, context);
        this.G = nVar2;
        nVar2.setTextColor(getThemedColor(j6.Sh));
        this.G.setText(LocaleController.getString(R.string.Save));
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextSize(1, 14.0f);
        this.G.setGravity(17);
        this.G.setVisibility(8);
        this.G.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.G.setOnClickListener(new ah.h0(this, 18));
        z5.a(this.G);
        this.actionBar.addView(this.G, x5.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        r6 r6Var = new r6(this, context);
        this.f10747s = r6Var;
        this.f10746r.addView(r6Var, x5.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f10749x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f10749x.setProgressColor(-1);
        this.f10749x.setNoProgress(false);
        this.f10746r.addView(this.f10749x, x5.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        a0(false, false);
        d61 d61Var = new d61(this, new i(this, 1), new j(this), new j(this));
        this.d = d61Var;
        d61Var.setClipToPadding(false);
        d61 d61Var2 = this.d;
        d61Var2.Y2.f31135r = false;
        d61Var2.o1();
        this.actionBar.setBackground(null);
        this.f10742c.addView(this.d, x5.c(-1.0f, -1));
        this.f10742c.addView(this.actionBar, x5.e(-1, -2, 48));
        e7 e7Var2 = this.f10742c;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.i0.f44697a;
        r0.a0.j(e7Var2, jVar);
        e7 e7Var3 = this.f10742c;
        this.fragmentView = e7Var3;
        return e7Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19870id == this.f10741b) {
                this.I = chatFull;
                this.d.Y2.N(true);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.E.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.E.f30801c && super.dismissDialogOnPause(dialog)) {
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
    public final cv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((o) this.f10745n.f718b).getText().toString();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.E.i(i10, i11, intent);
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.f10741b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f10741b));
        this.H = chat;
        if (chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10744f = z10;
        this.h = z10;
        this.I = getMessagesController().getChatFull(this.f10741b);
        u40 u40Var = new u40(3, true, true);
        this.E = u40Var;
        u40Var.f30799a = this;
        u40Var.f30800b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        u40 u40Var = this.E;
        if (u40Var != null) {
            u40Var.e();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.E.j();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.E.k(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.E.l();
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        u40 u40Var = this.E;
        if (u40Var != null) {
            u40Var.f30803f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        u40 u40Var = this.E;
        if (u40Var != null && (str = u40Var.f30803f) != null) {
            bundle.putString("path", str);
        }
        ah.y yVar = this.f10745n;
        if (yVar != null) {
            String obj = ((o) yVar.f718b).getText().toString();
            if (!obj.isEmpty()) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
