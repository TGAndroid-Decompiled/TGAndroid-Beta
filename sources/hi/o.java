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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.w9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.jr;
import org.telegram.ui.lu0;
import org.telegram.ui.sn;
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
    public final ne.b f12194a;
    public long f12195b;
    public w1 f12196c;
    public a71 d;
    public String e;
    public boolean f12197f;
    public boolean h;
    public ah.x f12198n;
    public n f12199r;
    public g6 f12200s;
    public w9 v;
    public AnimatorSet f12201w;
    public RadialProgressView f12202x;
    public h9 f12203y;

    public o(Bundle bundle) {
        super(bundle);
        this.f12194a = new ne.b(0, this, bs.h, 320L, false);
        this.J = new b2[1];
        this.K = new m(this);
    }

    public static boolean U(o oVar, f61 f61Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        Object obj = f61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j10 = -chat.f20279id;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, oVar.H);
            z11 = isChannelAndNotMegaGroup;
            z10 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.f20426id;
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
            i80 F = i80.F(oVar.f12196c, null, view);
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

    public static void V(o oVar, f61 f61Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = f61Var.d;
        if (i10 == 140) {
            if (!oVar.E.g() && (chatPhoto = (chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.f12195b))).photo) != null && chatPhoto.photo_big != null) {
                ImageLocation imageLocation = null;
                PhotoViewer.t1().K2(null, oVar, null);
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
                PhotoViewer.t1().f2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, oVar.K, null, 0L, 0L, 0L, true, null, null);
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
            bundle.putLong("chat_id", oVar.f12195b);
            bundle.putInt("type", 1);
            jr jrVar = new jr(bundle);
            jrVar.x0(oVar.I);
            oVar.presentFragment(jrVar);
        } else if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", oVar.f12195b);
            bundle2.putInt("type", 0);
            jr jrVar2 = new jr(bundle2);
            jrVar2.x0(oVar.I);
            oVar.presentFragment(jrVar2);
        } else if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", oVar.f12195b);
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
            Object obj = f61Var.G;
            if (obj instanceof TLRPC.Chat) {
                oVar.presentFragment(sn.W9(-((TLRPC.Chat) obj).f20279id));
            } else if (obj instanceof TLRPC.User) {
                oVar.presentFragment(sn.W9(((TLRPC.User) obj).f20426id));
            }
        }
    }

    public static void W(o oVar) {
        oVar.F = null;
        MessagesController.getInstance(oVar.currentAccount).changeChatAvatar(oVar.f12195b, null, null, null, null, 0.0d, null, null, null, null);
        oVar.a0(false, true);
        oVar.v.h(null, null, oVar.f12203y, oVar.H);
    }

    @Override
    public final void F(float f7) {
        RadialProgressView radialProgressView = this.f12202x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f12202x;
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
        if (this.f12197f == this.h && TextUtils.equals(((ai.t) this.f12198n.f901b).getText().toString(), this.e)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f12194a.a(z10, true);
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
        if (this.f12202x == null) {
            return;
        }
        AnimatorSet animatorSet = this.f12201w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f12201w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f12201w = animatorSet2;
            if (z10) {
                this.f12202x.setVisibility(0);
                this.f12200s.setVisibility(0);
                AnimatorSet animatorSet3 = this.f12201w;
                RadialProgressView radialProgressView = this.f12202x;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f12200s, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f12202x;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f12200s, property2, 0.0f));
            }
            this.f12201w.setDuration(180L);
            this.f12201w.addListener(new ah.p0(17, this, z10));
            this.f12201w.start();
        } else if (z10) {
            this.f12202x.setAlpha(1.0f);
            this.f12202x.setVisibility(0);
            this.f12200s.setAlpha(1.0f);
            this.f12200s.setVisibility(0);
        } else {
            this.f12202x.setAlpha(0.0f);
            this.f12202x.setVisibility(4);
            this.f12200s.setAlpha(0.0f);
            this.f12200s.setVisibility(4);
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 6));
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(h6.f20993d6));
        this.actionBar.M(new bh.b(cVar), fh.c.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        w1 w1Var = new w1(this, context);
        this.f12196c = w1Var;
        w1Var.setBackgroundColor(h6.x0(null, h6.f20935a7, false));
        this.f12203y = new h9(this.H);
        n nVar = new n(context);
        this.f12199r = nVar;
        nVar.f12190a.e(this.H, this.f12203y);
        this.v = this.f12199r.f12190a;
        String name = DialogObject.getName(this.H);
        this.e = name;
        d6 d6Var = this.resourceProvider;
        ah.x xVar = new ah.x(context, 6);
        ai.t tVar = new ai.t(context, 1);
        xVar.f901b = tVar;
        tVar.setTextColor(h6.w0(h6.G6, d6Var));
        tVar.setLinkTextColor(h6.w0(h6.f21052gc, d6Var));
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
        xVar.addView(tVar, z5.a(-2.0f, 13.0f, 0.0f, 13.0f, 0.0f, -1, i10 | 16));
        this.f12198n = xVar;
        tVar.setText(name);
        ((ai.t) this.f12198n.f901b).setSelection(name.length());
        ((ai.t) this.f12198n.f901b).addTextChangedListener(new ai.u(this, 2));
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
        this.actionBar.addView(this.G, z5.a(56.0f, 0.0f, 0.0f, 12.0f, 0.0f, -2, 85));
        g6 g6Var = new g6(this, context);
        this.f12200s = g6Var;
        this.f12199r.addView(g6Var, z5.a(72.0f, 0.0f, 0.0f, 0.0f, 28.0f, 72, 81));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f12202x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f12202x.setProgressColor(-1);
        this.f12202x.setNoProgress(false);
        this.f12199r.addView(this.f12202x, z5.a(64.0f, 0.0f, 0.0f, 0.0f, 32.0f, 64, 81));
        a0(false, false);
        a71 a71Var = new a71(this, new i(this, 1), new j(this), new j(this));
        this.d = a71Var;
        a71Var.setClipToPadding(false);
        a71 a71Var2 = this.d;
        a71Var2.W2.f30207r = false;
        a71Var2.p1();
        this.actionBar.setBackground(null);
        this.f12196c.addView(this.d, z5.d(-1.0f, -1));
        this.f12196c.addView(this.actionBar, z5.e(-1, -2, 48));
        w1 w1Var2 = this.f12196c;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.i0.f44864a;
        r0.a0.i(w1Var2, jVar);
        w1 w1Var3 = this.f12196c;
        this.fragmentView = w1Var3;
        return w1Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20280id == this.f12195b) {
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
        if (dialog != this.E.f25814c && super.dismissDialogOnPause(dialog)) {
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
    public final lu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((ai.t) this.f12198n.f901b).getText().toString();
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
        this.f12195b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f12195b));
        this.H = chat;
        if (chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12197f = z10;
        this.h = z10;
        this.I = getMessagesController().getChatFull(this.f12195b);
        e50 e50Var = new e50(3, true, true);
        this.E = e50Var;
        e50Var.f25812a = this;
        e50Var.f25813b = this;
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
    public final void restoreSelfArgs(Bundle bundle) {
        e50 e50Var = this.E;
        if (e50Var != null) {
            e50Var.f25815f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        e50 e50Var = this.E;
        if (e50Var != null && (str = e50Var.f25815f) != null) {
            bundle.putString("path", str);
        }
        ah.x xVar = this.f12198n;
        if (xVar != null) {
            String obj = ((ai.t) xVar.f901b).getText().toString();
            if (!obj.isEmpty()) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final void u(int i10, float f7, float f10, ne.e eVar) {
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
    public final boolean v() {
        return false;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
