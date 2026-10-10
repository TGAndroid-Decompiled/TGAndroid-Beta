package fi;

import ai.v0;
import ai.x7;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import ci.e1;
import ci.h2;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.m50;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.y9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ev0;
import org.telegram.ui.tr;
import org.telegram.ui.zn;
import w7.x5;
import w7.z5;
public final class p extends n2 implements m50, NotificationCenter.NotificationCenterDelegate, me.d {
    public n50 E;
    public TLRPC.FileLocation F;
    public bi.o G;
    public TLRPC.Chat H;
    public TLRPC.ChatFull I;
    public final b2[] J;
    public final m K;
    public final me.b f10021a;
    public long f10022b;
    public x7 f10023c;
    public l71 d;
    public String f10024e;
    public boolean f10025f;
    public boolean h;
    public ai.f0 f10026n;
    public n f10027r;
    public r6 f10028s;
    public y9 v;
    public AnimatorSet f10029w;
    public RadialProgressView f10030x;
    public j9 f10031y;

    public p(Bundle bundle) {
        super(bundle);
        this.f10021a = new me.b(0, this, is.h, 320L, false);
        this.J = new b2[1];
        this.K = new m(this);
    }

    public static boolean U(p pVar, q61 q61Var, View view) {
        long j3;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        Object obj = q61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j3 = -chat.f20042id;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, pVar.H);
            z11 = isChannelAndNotMegaGroup;
            z10 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j3 = user.f20189id;
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
            q80 F = q80.F(pVar.f10023c, null, view);
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

    public static void V(p pVar, q61 q61Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = q61Var.d;
        if (i10 == 140) {
            if (!pVar.E.g() && (chatPhoto = (chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f10022b))).photo) != null && chatPhoto.photo_big != null) {
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
                PhotoViewer.t1().f2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, pVar.K, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            return;
        }
        boolean z10 = true;
        if (i10 == 141) {
            n50 n50Var = pVar.E;
            if (pVar.F == null) {
                z10 = false;
            }
            n50Var.n(z10, new h(pVar, 0), new e1(6), 0);
        } else if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", pVar.f10022b);
            bundle.putInt("type", 1);
            tr trVar = new tr(bundle);
            trVar.x0(pVar.I);
            pVar.presentFragment(trVar);
        } else if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", pVar.f10022b);
            bundle2.putInt("type", 0);
            tr trVar2 = new tr(bundle2);
            trVar2.x0(pVar.I);
            pVar.presentFragment(trVar2);
        } else if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", pVar.f10022b);
            pVar.presentFragment(new s(bundle3));
        } else if (i10 == 150) {
            pVar.Z(true);
        } else if (i10 == 151) {
            pVar.Z(false);
        } else if (i10 == 145) {
            g5.r(pVar, false, pVar.H, null, false, true, true, false, new j(pVar));
        } else if (i10 == 146) {
            u0.e(pVar.J, pVar, pVar.currentAccount, pVar.H);
        } else {
            Object obj = q61Var.G;
            if (obj instanceof TLRPC.Chat) {
                pVar.presentFragment(zn.W9(-((TLRPC.Chat) obj).f20042id));
            } else if (obj instanceof TLRPC.User) {
                pVar.presentFragment(zn.W9(((TLRPC.User) obj).f20189id));
            }
        }
    }

    public static void W(p pVar) {
        pVar.F = null;
        MessagesController.getInstance(pVar.currentAccount).changeChatAvatar(pVar.f10022b, null, null, null, null, 0.0d, null, null, null, null);
        pVar.a0(false, true);
        pVar.v.h(null, null, pVar.f10031y, pVar.H);
    }

    @Override
    public final void D(float f7) {
        RadialProgressView radialProgressView = this.f10030x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f10030x;
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
        if (this.f10025f == this.h && TextUtils.equals(((o) this.f10026n.f933b).getText().toString(), this.f10024e)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f10021a.a(z10, true);
    }

    public final void Z(boolean z10) {
        if (this.h == z10) {
            return;
        }
        j6 j6Var = (j6) this.d.z1(151);
        if (j6Var != null) {
            j6Var.a(!z10);
        }
        j6 j6Var2 = (j6) this.d.z1(150);
        if (j6Var2 != null) {
            j6Var2.a(z10);
        }
        this.h = z10;
        Y();
    }

    public final void a0(boolean z10, boolean z11) {
        if (this.f10030x == null) {
            return;
        }
        AnimatorSet animatorSet = this.f10029w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f10029w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f10029w = animatorSet2;
            if (z10) {
                this.f10030x.setVisibility(0);
                this.f10028s.setVisibility(0);
                AnimatorSet animatorSet3 = this.f10029w;
                RadialProgressView radialProgressView = this.f10030x;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f10028s, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f10030x;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f10028s, property2, 0.0f));
            }
            this.f10029w.setDuration(180L);
            this.f10029w.addListener(new ai.n(15, this, z10));
            this.f10029w.start();
        } else if (z10) {
            this.f10030x.setAlpha(1.0f);
            this.f10030x.setVisibility(0);
            this.f10028s.setAlpha(1.0f);
            this.f10028s.setVisibility(0);
        } else {
            this.f10030x.setAlpha(0.0f);
            this.f10030x.setVisibility(4);
            this.f10028s.setAlpha(0.0f);
            this.f10028s.setVisibility(4);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 4));
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(i6.f20801d6));
        this.actionBar.M(new ah.c(cVar), eh.b.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        x7 x7Var = new x7(this, context);
        this.f10023c = x7Var;
        x7Var.setBackgroundColor(i6.x0(null, i6.f20745a7, false));
        this.f10031y = new j9(this.H);
        n nVar = new n(context);
        this.f10027r = nVar;
        nVar.f10012a.e(this.H, this.f10031y);
        this.v = this.f10027r.f10012a;
        String name = DialogObject.getName(this.H);
        this.f10024e = name;
        e6 e6Var = this.resourceProvider;
        int i10 = 3;
        ai.f0 f0Var = new ai.f0(context, 3);
        o oVar = new o(context, 0);
        f0Var.f933b = oVar;
        oVar.setTextColor(i6.w0(i6.G6, e6Var));
        oVar.setLinkTextColor(i6.w0(i6.gc, e6Var));
        oVar.setHintTextColor(i6.w0(i6.H6, e6Var));
        oVar.setTextSize(1, 16.0f);
        oVar.setMaxLines(Integer.MAX_VALUE);
        oVar.setBackground(null);
        oVar.setImeOptions(oVar.getImeOptions() | 268435456);
        oVar.setInputType(oVar.getInputType() | 16384);
        oVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        oVar.setMinHeight(AndroidUtilities.dp(50.0f));
        if (LocaleController.isRTL) {
            i10 = 5;
        }
        f0Var.addView(oVar, x5.a(-2.0f, 13.0f, 0.0f, 13.0f, 0.0f, -1, i10 | 16));
        this.f10026n = f0Var;
        oVar.setText(name);
        ((o) this.f10026n.f933b).setSelection(name.length());
        ((o) this.f10026n.f933b).addTextChangedListener(new h2(this, 1));
        bi.o oVar2 = new bi.o(this, context);
        this.G = oVar2;
        oVar2.setTextColor(getThemedColor(i6.Sh));
        this.G.setText(LocaleController.getString(R.string.Save));
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextSize(1, 14.0f);
        this.G.setGravity(17);
        this.G.setVisibility(8);
        this.G.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.G.setOnClickListener(new v0(this, 17));
        z5.a(this.G);
        this.actionBar.addView(this.G, x5.a(56.0f, 0.0f, 0.0f, 12.0f, 0.0f, -2, 85));
        r6 r6Var = new r6(this, context);
        this.f10028s = r6Var;
        this.f10027r.addView(r6Var, x5.a(72.0f, 0.0f, 0.0f, 0.0f, 28.0f, 72, 81));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f10030x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f10030x.setProgressColor(-1);
        this.f10030x.setNoProgress(false);
        this.f10027r.addView(this.f10030x, x5.a(64.0f, 0.0f, 0.0f, 0.0f, 32.0f, 64, 81));
        a0(false, false);
        l71 l71Var = new l71(this, new i(this, 1), new j(this), new j(this));
        this.d = l71Var;
        l71Var.setClipToPadding(false);
        l71 l71Var2 = this.d;
        l71Var2.W2.f25587r = false;
        l71Var2.p1();
        this.actionBar.setBackground(null);
        this.f10023c.addView(this.d, x5.d(-1.0f, -1));
        this.f10023c.addView(this.actionBar, x5.e(-1, -2, 48));
        x7 x7Var2 = this.f10023c;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.i0.f46810a;
        r0.a0.i(x7Var2, jVar);
        x7 x7Var3 = this.f10023c;
        this.fragmentView = x7Var3;
        return x7Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20043id == this.f10022b) {
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
        if (dialog != this.E.f28986c && super.dismissDialogOnPause(dialog)) {
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
    public final ev0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((o) this.f10026n.f933b).getText().toString();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
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
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.E.h(i10, i11, intent);
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.f10022b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f10022b));
        this.H = chat;
        if (chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10025f = z10;
        this.h = z10;
        this.I = getMessagesController().getChatFull(this.f10022b);
        n50 n50Var = new n50(3, true, true);
        this.E = n50Var;
        n50Var.f28984a = this;
        n50Var.f28985b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        n50 n50Var = this.E;
        if (n50Var != null) {
            n50Var.d();
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
    public final void restoreSelfArgs(Bundle bundle) {
        n50 n50Var = this.E;
        if (n50Var != null) {
            n50Var.f28988f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        n50 n50Var = this.E;
        if (n50Var != null && (str = n50Var.f28988f) != null) {
            bundle.putString("path", str);
        }
        ai.f0 f0Var = this.f10026n;
        if (f0Var != null) {
            String obj = ((o) f0Var.f933b).getText().toString();
            if (!obj.isEmpty()) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
