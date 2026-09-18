package fi;

import ai.v0;
import ai.v7;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import ci.f1;
import ci.i2;
import ci.s6;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.u9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bo;
import org.telegram.ui.fv0;
import org.telegram.ui.ur;
import w7.x5;
import w7.z5;
public final class p extends o2 implements t40, NotificationCenter.NotificationCenterDelegate, le.d {
    public u40 E;
    public TLRPC.FileLocation F;
    public bi.o G;
    public TLRPC.Chat H;
    public TLRPC.ChatFull I;
    public final c2[] J;
    public final m K;
    public final le.b f9152a;
    public long f9153b;
    public v7 f9154c;
    public f61 d;
    public String e;
    public boolean f9155f;
    public boolean h;
    public ai.f0 f9156n;
    public n f9157r;
    public s6 f9158s;
    public u9 v;
    public AnimatorSet f9159w;
    public RadialProgressView f9160x;
    public f9 f9161y;

    public p(Bundle bundle) {
        super(bundle);
        this.f9152a = new le.b(0, this, qr.h, 320L, false);
        this.J = new c2[1];
        this.K = new m(this);
    }

    public static boolean U(p pVar, j51 j51Var, View view) {
        long j3;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        Object obj = j51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j3 = -chat.f18121id;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, pVar.H);
            z11 = isChannelAndNotMegaGroup;
            z10 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j3 = user.f18268id;
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
            n70 F = n70.F(pVar.f9154c, null, view);
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
            F.W(pVar.d.W0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void V(p pVar, j51 j51Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = j51Var.d;
        if (i10 == 140) {
            if (!pVar.E.h() && (chatPhoto = (chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f9153b))).photo) != null && chatPhoto.photo_big != null) {
                ImageLocation imageLocation = null;
                PhotoViewer.t1().J2(null, pVar, null);
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
            bundle.putLong("chat_id", pVar.f9153b);
            bundle.putInt("type", 1);
            ur urVar = new ur(bundle);
            urVar.x0(pVar.I);
            pVar.presentFragment(urVar);
        } else if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", pVar.f9153b);
            bundle2.putInt("type", 0);
            ur urVar2 = new ur(bundle2);
            urVar2.x0(pVar.I);
            pVar.presentFragment(urVar2);
        } else if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", pVar.f9153b);
            pVar.presentFragment(new s(bundle3));
        } else if (i10 == 150) {
            pVar.Z(true);
        } else if (i10 == 151) {
            pVar.Z(false);
        } else if (i10 == 145) {
            c5.s(pVar, false, pVar.H, null, false, true, true, false, new j(pVar));
        } else if (i10 == 146) {
            u0.e(pVar.J, pVar, pVar.currentAccount, pVar.H);
        } else {
            Object obj = j51Var.G;
            if (obj instanceof TLRPC.Chat) {
                pVar.presentFragment(bo.R9(-((TLRPC.Chat) obj).f18121id));
            } else if (obj instanceof TLRPC.User) {
                pVar.presentFragment(bo.R9(((TLRPC.User) obj).f18268id));
            }
        }
    }

    public static void W(p pVar) {
        pVar.F = null;
        MessagesController.getInstance(pVar.currentAccount).changeChatAvatar(pVar.f9153b, null, null, null, null, 0.0d, null, null, null, null);
        pVar.a0(false, true);
        pVar.v.h(null, null, pVar.f9161y, pVar.H);
    }

    @Override
    public final void B(float f7) {
        RadialProgressView radialProgressView = this.f9160x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        int i11;
        this.G.setAlpha(f7);
        this.G.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.G.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        bi.o oVar = this.G;
        if (f7 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        oVar.setVisibility(i11);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f9160x;
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
        if (this.f9155f == this.h && TextUtils.equals(((o) this.f9156n.f785b).getText().toString(), this.e)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f9152a.a(z10, true);
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
        if (this.f9160x == null) {
            return;
        }
        AnimatorSet animatorSet = this.f9159w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f9159w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f9159w = animatorSet2;
            if (z10) {
                this.f9160x.setVisibility(0);
                this.f9158s.setVisibility(0);
                AnimatorSet animatorSet3 = this.f9159w;
                RadialProgressView radialProgressView = this.f9160x;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f9158s, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f9160x;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f9158s, property2, 0.0f));
            }
            this.f9159w.setDuration(180L);
            this.f9159w.addListener(new ai.n(15, this, z10));
            this.f9159w.start();
        } else if (z10) {
            this.f9160x.setAlpha(1.0f);
            this.f9160x.setVisibility(0);
            this.f9158s.setAlpha(1.0f);
            this.f9158s.setVisibility(0);
        } else {
            this.f9160x.setAlpha(0.0f);
            this.f9160x.setVisibility(4);
            this.f9158s.setAlpha(0.0f);
            this.f9158s.setVisibility(4);
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        hg.k0.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 4));
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(j6.f18863d6));
        this.actionBar.M(new ah.c(cVar), eh.b.p(this.resourceProvider), false);
        this.actionBar.Q0 = true;
        v7 v7Var = new v7(this, context);
        this.f9154c = v7Var;
        v7Var.setBackgroundColor(j6.w0(null, j6.f18807a7, false));
        this.f9161y = new f9(this.H);
        n nVar = new n(context);
        this.f9157r = nVar;
        nVar.f9144a.e(this.H, this.f9161y);
        this.v = this.f9157r.f9144a;
        String name = DialogObject.getName(this.H);
        this.e = name;
        f6 f6Var = this.resourceProvider;
        ai.f0 f0Var = new ai.f0(context, 4);
        o oVar = new o(context, 0);
        f0Var.f785b = oVar;
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
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        f0Var.addView(oVar, x5.d(-1, -2.0f, i10 | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f9156n = f0Var;
        oVar.setText(name);
        ((o) this.f9156n.f785b).setSelection(name.length());
        ((o) this.f9156n.f785b).addTextChangedListener(new i2(this, 1));
        bi.o oVar2 = new bi.o(this, context);
        this.G = oVar2;
        oVar2.setTextColor(getThemedColor(j6.Sh));
        this.G.setText(LocaleController.getString(R.string.Save));
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextSize(1, 14.0f);
        this.G.setGravity(17);
        this.G.setVisibility(8);
        this.G.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.G.setOnClickListener(new v0(this, 17));
        z5.a(this.G);
        this.actionBar.addView(this.G, x5.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        s6 s6Var = new s6(this, context);
        this.f9158s = s6Var;
        this.f9157r.addView(s6Var, x5.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f9160x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f9160x.setProgressColor(-1);
        this.f9160x.setNoProgress(false);
        this.f9157r.addView(this.f9160x, x5.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        a0(false, false);
        f61 f61Var = new f61(this, new i(this, 1), new j(this), new j(this));
        this.d = f61Var;
        f61Var.setClipToPadding(false);
        f61 f61Var2 = this.d;
        f61Var2.Y2.f29854r = false;
        f61Var2.q1();
        this.actionBar.setBackground(null);
        this.f9154c.addView(this.d, x5.c(-1.0f, -1));
        this.f9154c.addView(this.actionBar, x5.e(-1, -2, 48));
        v7 v7Var2 = this.f9154c;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.i0.f41870a;
        r0.a0.j(v7Var2, jVar);
        v7 v7Var3 = this.f9154c;
        this.fragmentView = v7Var3;
        return v7Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f18122id == this.f9153b) {
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
        if (dialog != this.E.f28277c && super.dismissDialogOnPause(dialog)) {
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
    public final fv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((o) this.f9156n.f785b).getText().toString();
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
        this.f9153b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f9153b));
        this.H = chat;
        if (chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9155f = z10;
        this.h = z10;
        this.I = getMessagesController().getChatFull(this.f9153b);
        u40 u40Var = new u40(3, true, true);
        this.E = u40Var;
        u40Var.f28275a = this;
        u40Var.f28276b = this;
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
            u40Var.f28278f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        u40 u40Var = this.E;
        if (u40Var != null && (str = u40Var.f28278f) != null) {
            bundle.putString("path", str);
        }
        ai.f0 f0Var = this.f9156n;
        if (f0Var != null) {
            String obj = ((o) f0Var.f785b).getText().toString();
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
    public final void C(float f7, int i10) {
    }
}
