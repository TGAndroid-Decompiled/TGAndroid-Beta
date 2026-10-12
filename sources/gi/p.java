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
import bi.i7;
import di.e1;
import di.h2;
import di.p6;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.h50;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.i50;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.z9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fo;
import org.telegram.ui.kv0;
import org.telegram.ui.yr;
import w7.a6;
public final class p extends m2 implements h50, NotificationCenter.NotificationCenterDelegate, ne.d {
    public i50 E;
    public TLRPC.FileLocation F;
    public ci.n G;
    public TLRPC.Chat H;
    public TLRPC.ChatFull I;
    public final a2[] J;
    public final m K;
    public final ne.b f10227a;
    public long f10228b;
    public i7 f10229c;
    public h71 d;
    public String e;
    public boolean f10230f;
    public boolean h;
    public ah.x f10231n;
    public n f10232r;
    public p6 f10233s;
    public z9 v;
    public AnimatorSet f10234w;
    public RadialProgressView f10235x;
    public k9 f10236y;

    public p(Bundle bundle) {
        super(bundle);
        this.f10227a = new ne.b(0, this, es.h, 320L, false);
        this.J = new a2[1];
        this.K = new m(this);
    }

    public static boolean U(p pVar, l61 l61Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        Object obj = l61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j10 = -chat.f19216id;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, pVar.H);
            z11 = isChannelAndNotMegaGroup;
            z10 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.f19363id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, pVar.H);
                z10 = isBot;
                z11 = false;
            }
            return false;
        }
        boolean z13 = canRemoveBotFromCommunity;
        long j11 = j10;
        int b10 = u0.b(pVar.currentAccount, j11);
        if (b10 != 1 && b10 != 2) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z13 || z12) {
            m80 F = m80.F(pVar.f10229c, null, view);
            int i11 = R.drawable.msg_viewintopic;
            if (z10) {
                i10 = R.string.CommunityMenuViewBot;
            } else if (z11) {
                i10 = R.string.CommunityMenuViewChannel;
            } else {
                i10 = R.string.CommunityMenuViewGroup;
            }
            F.l(i11, LocaleController.getString(i10), new g(pVar, j11, 1), z12);
            F.m(z13, R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new l(pVar, z10, z11, j11, 0));
            F.W(pVar.d.V0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void V(p pVar, l61 l61Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = l61Var.d;
        if (i10 == 140) {
            if (!pVar.E.g() && (chatPhoto = (chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f10228b))).photo) != null && chatPhoto.photo_big != null) {
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
            i50 i50Var = pVar.E;
            if (pVar.F == null) {
                z10 = false;
            }
            i50Var.n(z10, new h(pVar, 0), new e1(6), 0);
        } else if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", pVar.f10228b);
            bundle.putInt("type", 1);
            yr yrVar = new yr(bundle);
            yrVar.x0(pVar.I);
            pVar.presentFragment(yrVar);
        } else if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", pVar.f10228b);
            bundle2.putInt("type", 0);
            yr yrVar2 = new yr(bundle2);
            yrVar2.x0(pVar.I);
            pVar.presentFragment(yrVar2);
        } else if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", pVar.f10228b);
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
            Object obj = l61Var.G;
            if (obj instanceof TLRPC.Chat) {
                pVar.presentFragment(fo.W9(-((TLRPC.Chat) obj).f19216id));
            } else if (obj instanceof TLRPC.User) {
                pVar.presentFragment(fo.W9(((TLRPC.User) obj).f19363id));
            }
        }
    }

    public static void W(p pVar) {
        pVar.F = null;
        MessagesController.getInstance(pVar.currentAccount).changeChatAvatar(pVar.f10228b, null, null, null, null, 0.0d, null, null, null, null);
        pVar.a0(false, true);
        pVar.v.h(null, null, pVar.f10236y, pVar.H);
    }

    @Override
    public final void E(float f7) {
        RadialProgressView radialProgressView = this.f10235x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f10235x;
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
        if (this.f10230f == this.h && TextUtils.equals(((o) this.f10231n.f895b).getText().toString(), this.e)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f10227a.a(z10, true);
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
        if (this.f10235x == null) {
            return;
        }
        AnimatorSet animatorSet = this.f10234w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f10234w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f10234w = animatorSet2;
            if (z10) {
                this.f10235x.setVisibility(0);
                this.f10233s.setVisibility(0);
                AnimatorSet animatorSet3 = this.f10234w;
                RadialProgressView radialProgressView = this.f10235x;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f10233s, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f10235x;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f10233s, property2, 0.0f));
            }
            this.f10234w.setDuration(180L);
            this.f10234w.addListener(new ah.p0(16, this, z10));
            this.f10234w.start();
        } else if (z10) {
            this.f10235x.setAlpha(1.0f);
            this.f10235x.setVisibility(0);
            this.f10233s.setAlpha(1.0f);
            this.f10233s.setVisibility(0);
        } else {
            this.f10235x.setAlpha(0.0f);
            this.f10235x.setVisibility(4);
            this.f10233s.setAlpha(0.0f);
            this.f10233s.setVisibility(4);
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        i2.d.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = 5;
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 5));
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(g6.f19901d6));
        this.actionBar.M(new bh.b(cVar), fh.b.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        i7 i7Var = new i7(this, context);
        this.f10229c = i7Var;
        i7Var.setBackgroundColor(g6.x0(null, g6.f19843a7, false));
        this.f10236y = new k9(this.H);
        n nVar = new n(context);
        this.f10232r = nVar;
        nVar.f10219a.e(this.H, this.f10236y);
        this.v = this.f10232r.f10219a;
        String name = DialogObject.getName(this.H);
        this.e = name;
        c6 c6Var = this.resourceProvider;
        ah.x xVar = new ah.x(context, 4);
        o oVar = new o(context, 0);
        xVar.f895b = oVar;
        oVar.setTextColor(g6.w0(g6.G6, c6Var));
        oVar.setLinkTextColor(g6.w0(g6.f19960gc, c6Var));
        oVar.setHintTextColor(g6.w0(g6.H6, c6Var));
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
        xVar.addView(oVar, a6.a(-2.0f, 13.0f, 0.0f, 13.0f, 0.0f, -1, i10 | 16));
        this.f10231n = xVar;
        oVar.setText(name);
        ((o) this.f10231n.f895b).setSelection(name.length());
        ((o) this.f10231n.f895b).addTextChangedListener(new h2(this, 1));
        ci.n nVar2 = new ci.n(this, context);
        this.G = nVar2;
        nVar2.setTextColor(getThemedColor(g6.Sh));
        this.G.setText(LocaleController.getString(R.string.Save));
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextSize(1, 14.0f);
        this.G.setGravity(17);
        this.G.setVisibility(8);
        this.G.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.G.setOnClickListener(new ah.g0(this, 18));
        w7.c6.a(this.G);
        this.actionBar.addView(this.G, a6.a(56.0f, 0.0f, 0.0f, 12.0f, 0.0f, -2, 85));
        p6 p6Var = new p6(this, context);
        this.f10233s = p6Var;
        this.f10232r.addView(p6Var, a6.a(72.0f, 0.0f, 0.0f, 0.0f, 28.0f, 72, 81));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f10235x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f10235x.setProgressColor(-1);
        this.f10235x.setNoProgress(false);
        this.f10232r.addView(this.f10235x, a6.a(64.0f, 0.0f, 0.0f, 0.0f, 32.0f, 64, 81));
        a0(false, false);
        h71 h71Var = new h71(this, new i(this, 1), new j(this), new j(this));
        this.d = h71Var;
        h71Var.setClipToPadding(false);
        h71 h71Var2 = this.d;
        h71Var2.W2.f31780r = false;
        h71Var2.p1();
        this.actionBar.setBackground(null);
        this.f10229c.addView(this.d, a6.d(-1.0f, -1));
        this.f10229c.addView(this.actionBar, a6.e(-1, -2, 48));
        i7 i7Var2 = this.f10229c;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.j0.f43732a;
        r0.b0.i(i7Var2, jVar);
        i7 i7Var3 = this.f10229c;
        this.fragmentView = i7Var3;
        return i7Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f19217id == this.f10228b) {
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
        if (dialog != this.E.f25831c && super.dismissDialogOnPause(dialog)) {
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
    public final kv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((o) this.f10231n.f895b).getText().toString();
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
        this.f10228b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f10228b));
        this.H = chat;
        if (chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10230f = z10;
        this.h = z10;
        this.I = getMessagesController().getChatFull(this.f10228b);
        i50 i50Var = new i50(3, true, true);
        this.E = i50Var;
        i50Var.f25829a = this;
        i50Var.f25830b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        i50 i50Var = this.E;
        if (i50Var != null) {
            i50Var.d();
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
    public final void p(int i10, float f7, float f10, ne.e eVar) {
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
    public final void restoreSelfArgs(Bundle bundle) {
        i50 i50Var = this.E;
        if (i50Var != null) {
            i50Var.f25832f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        i50 i50Var = this.E;
        if (i50Var != null && (str = i50Var.f25832f) != null) {
            bundle.putString("path", str);
        }
        ah.x xVar = this.f10231n;
        if (xVar != null) {
            String obj = ((o) xVar.f895b).getText().toString();
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
    public final void C(float f7, int i10) {
    }
}
