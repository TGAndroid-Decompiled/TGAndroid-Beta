package fi;

import ai.v0;
import ai.w7;
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
import ci.r6;
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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.y70;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.pr;
import org.telegram.ui.vu0;
import org.telegram.ui.wn;
import w7.a6;
import w7.y5;
public final class p extends m2 implements u40, NotificationCenter.NotificationCenterDelegate, le.e {
    public v40 E;
    public TLRPC.FileLocation F;
    public bi.o G;
    public TLRPC.Chat H;
    public TLRPC.ChatFull I;
    public final a2[] J;
    public final m K;
    public final le.c f9134a;
    public long f9135b;
    public w7 f9136c;
    public r61 d;
    public String e;
    public boolean f9137f;
    public boolean h;
    public ai.f0 f9138n;
    public n f9139r;
    public r6 f9140s;
    public w9 v;
    public AnimatorSet f9141w;
    public RadialProgressView f9142x;
    public h9 f9143y;

    public p(Bundle bundle) {
        super(bundle);
        this.f9134a = new le.c(0, this, rr.h, 320L, false);
        this.J = new a2[1];
        this.K = new m(this);
    }

    public static boolean U(p pVar, v51 v51Var, View view) {
        long j3;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        Object obj = v51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j3 = -chat.f18335id;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, pVar.H);
            z11 = isChannelAndNotMegaGroup;
            z10 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j3 = user.f18482id;
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
            y70 F = y70.F(pVar.f9136c, null, view);
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
            F.W(pVar.d.V0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void V(p pVar, v51 v51Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = v51Var.d;
        if (i10 == 140) {
            if (!pVar.E.h() && (chatPhoto = (chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f9135b))).photo) != null && chatPhoto.photo_big != null) {
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
            v40 v40Var = pVar.E;
            if (pVar.F == null) {
                z10 = false;
            }
            v40Var.o(z10, new h(pVar, 0), new f1(6), 0);
        } else if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", pVar.f9135b);
            bundle.putInt("type", 1);
            pr prVar = new pr(bundle);
            prVar.x0(pVar.I);
            pVar.presentFragment(prVar);
        } else if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", pVar.f9135b);
            bundle2.putInt("type", 0);
            pr prVar2 = new pr(bundle2);
            prVar2.x0(pVar.I);
            pVar.presentFragment(prVar2);
        } else if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", pVar.f9135b);
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
            Object obj = v51Var.G;
            if (obj instanceof TLRPC.Chat) {
                pVar.presentFragment(wn.R9(-((TLRPC.Chat) obj).f18335id));
            } else if (obj instanceof TLRPC.User) {
                pVar.presentFragment(wn.R9(((TLRPC.User) obj).f18482id));
            }
        }
    }

    public static void W(p pVar) {
        pVar.F = null;
        MessagesController.getInstance(pVar.currentAccount).changeChatAvatar(pVar.f9135b, null, null, null, null, 0.0d, null, null, null, null);
        pVar.a0(false, true);
        pVar.v.h(null, null, pVar.f9143y, pVar.H);
    }

    @Override
    public final void B(float f7) {
        RadialProgressView radialProgressView = this.f9142x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
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
        RadialProgressView radialProgressView = this.f9142x;
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
        if (this.f9137f == this.h && TextUtils.equals(((o) this.f9138n.f866b).getText().toString(), this.e)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f9134a.a(z10, true);
    }

    public final void Z(boolean z10) {
        if (this.h == z10) {
            return;
        }
        j6 j6Var = (j6) this.d.y1(151);
        if (j6Var != null) {
            j6Var.a(!z10);
        }
        j6 j6Var2 = (j6) this.d.y1(150);
        if (j6Var2 != null) {
            j6Var2.a(z10);
        }
        this.h = z10;
        Y();
    }

    public final void a0(boolean z10, boolean z11) {
        if (this.f9142x == null) {
            return;
        }
        AnimatorSet animatorSet = this.f9141w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f9141w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f9141w = animatorSet2;
            if (z10) {
                this.f9142x.setVisibility(0);
                this.f9140s.setVisibility(0);
                AnimatorSet animatorSet3 = this.f9141w;
                RadialProgressView radialProgressView = this.f9142x;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f9140s, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f9142x;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f9140s, property2, 0.0f));
            }
            this.f9141w.setDuration(180L);
            this.f9141w.addListener(new ai.n(15, this, z10));
            this.f9141w.start();
        } else if (z10) {
            this.f9142x.setAlpha(1.0f);
            this.f9142x.setVisibility(0);
            this.f9140s.setAlpha(1.0f);
            this.f9140s.setVisibility(0);
        } else {
            this.f9142x.setAlpha(0.0f);
            this.f9142x.setVisibility(4);
            this.f9140s.setAlpha(0.0f);
            this.f9140s.setVisibility(4);
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 4));
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(h6.f19059d6));
        this.actionBar.M(new ah.c(cVar), eh.b.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        w7 w7Var = new w7(this, context);
        this.f9136c = w7Var;
        w7Var.setBackgroundColor(h6.w0(null, h6.f19003a7, false));
        this.f9143y = new h9(this.H);
        n nVar = new n(context);
        this.f9139r = nVar;
        nVar.f9126a.e(this.H, this.f9143y);
        this.v = this.f9139r.f9126a;
        String name = DialogObject.getName(this.H);
        this.e = name;
        d6 d6Var = this.resourceProvider;
        ai.f0 f0Var = new ai.f0(context, 4);
        o oVar = new o(context, 0);
        f0Var.f866b = oVar;
        oVar.setTextColor(h6.v0(h6.G6, d6Var));
        oVar.setLinkTextColor(h6.v0(h6.gc, d6Var));
        oVar.setHintTextColor(h6.v0(h6.H6, d6Var));
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
        f0Var.addView(oVar, y5.d(-1, -2.0f, i10 | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f9138n = f0Var;
        oVar.setText(name);
        ((o) this.f9138n.f866b).setSelection(name.length());
        ((o) this.f9138n.f866b).addTextChangedListener(new i2(this, 1));
        bi.o oVar2 = new bi.o(this, context);
        this.G = oVar2;
        oVar2.setTextColor(getThemedColor(h6.Sh));
        this.G.setText(LocaleController.getString(R.string.Save));
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextSize(1, 14.0f);
        this.G.setGravity(17);
        this.G.setVisibility(8);
        this.G.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.G.setOnClickListener(new v0(this, 17));
        a6.a(this.G);
        this.actionBar.addView(this.G, y5.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        r6 r6Var = new r6(this, context);
        this.f9140s = r6Var;
        this.f9139r.addView(r6Var, y5.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f9142x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f9142x.setProgressColor(-1);
        this.f9142x.setNoProgress(false);
        this.f9139r.addView(this.f9142x, y5.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        a0(false, false);
        r61 r61Var = new r61(this, new i(this, 1), new j(this), new j(this));
        this.d = r61Var;
        r61Var.setClipToPadding(false);
        r61 r61Var2 = this.d;
        r61Var2.Y2.f25290r = false;
        r61Var2.p1();
        this.actionBar.setBackground(null);
        this.f9136c.addView(this.d, y5.c(-1.0f, -1));
        this.f9136c.addView(this.actionBar, y5.e(-1, -2, 48));
        w7 w7Var2 = this.f9136c;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.i0.f42128a;
        r0.a0.j(w7Var2, jVar);
        w7 w7Var3 = this.f9136c;
        this.fragmentView = w7Var3;
        return w7Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f18336id == this.f9135b) {
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
        if (dialog != this.E.f28993c && super.dismissDialogOnPause(dialog)) {
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
    public final vu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((o) this.f9138n.f866b).getText().toString();
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
        this.f9135b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f9135b));
        this.H = chat;
        if (chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9137f = z10;
        this.h = z10;
        this.I = getMessagesController().getChatFull(this.f9135b);
        v40 v40Var = new v40(3, true, true);
        this.E = v40Var;
        v40Var.f28991a = this;
        v40Var.f28992b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        v40 v40Var = this.E;
        if (v40Var != null) {
            v40Var.e();
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
        v40 v40Var = this.E;
        if (v40Var != null) {
            v40Var.f28994f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        v40 v40Var = this.E;
        if (v40Var != null && (str = v40Var.f28994f) != null) {
            bundle.putString("path", str);
        }
        ai.f0 f0Var = this.f9138n;
        if (f0Var != null) {
            String obj = ((o) f0Var.f866b).getText().toString();
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
