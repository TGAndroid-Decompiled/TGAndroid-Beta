package ei;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import bi.k1;
import bi.ld;
import bi.s7;
import bi.u2;
import bi.w7;
import com.google.android.gms.internal.vision.e2;
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
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.eo;
import org.telegram.ui.ev0;
import w7.a6;
import w7.c6;
public final class p extends p2 implements d50, NotificationCenter.NotificationCenterDelegate, le.d {
    public e50 E;
    public TLRPC.FileLocation F;
    public ai.t G;
    public TLRPC.Chat H;
    public TLRPC.ChatFull I;
    public final d2[] J;
    public final m K;
    public final le.b f7596a;
    public long f7597b;
    public w7 f7598c;
    public r61 d;
    public String e;
    public boolean f7599f;
    public boolean h;
    public ld f7600n;
    public n f7601r;
    public s7 f7602s;
    public w9 v;
    public AnimatorSet f7603w;
    public RadialProgressView f7604x;
    public g9 f7605y;

    public p(Bundle bundle) {
        super(bundle);
        this.f7596a = new le.b(0, this, wr.h, 320L, false);
        this.J = new d2[1];
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
            j3 = -chat.f17195id;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, pVar.H);
            z11 = isChannelAndNotMegaGroup;
            z10 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j3 = user.f17342id;
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
            w70 F = w70.F(pVar.f7598c, null, view);
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

    public static void V(p pVar, v51 v51Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = v51Var.d;
        if (i10 == 140) {
            if (!pVar.E.h() && (chatPhoto = (chat = pVar.getMessagesController().getChat(Long.valueOf(pVar.f7597b))).photo) != null && chatPhoto.photo_big != null) {
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
            e50 e50Var = pVar.E;
            if (pVar.F == null) {
                z10 = false;
            }
            e50Var.o(z10, new h(pVar, 0), new k1(6), 0);
        } else if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", pVar.f7597b);
            bundle.putInt("type", 1);
            org.telegram.ui.wr wrVar = new org.telegram.ui.wr(bundle);
            wrVar.x0(pVar.I);
            pVar.presentFragment(wrVar);
        } else if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", pVar.f7597b);
            bundle2.putInt("type", 0);
            org.telegram.ui.wr wrVar2 = new org.telegram.ui.wr(bundle2);
            wrVar2.x0(pVar.I);
            pVar.presentFragment(wrVar2);
        } else if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", pVar.f7597b);
            pVar.presentFragment(new s(bundle3));
        } else if (i10 == 150) {
            pVar.Z(true);
        } else if (i10 == 151) {
            pVar.Z(false);
        } else if (i10 == 145) {
            d5.s(pVar, false, pVar.H, null, false, true, true, false, new j(pVar));
        } else if (i10 == 146) {
            u0.e(pVar.J, pVar, pVar.currentAccount, pVar.H);
        } else {
            Object obj = v51Var.G;
            if (obj instanceof TLRPC.Chat) {
                pVar.presentFragment(eo.R9(-((TLRPC.Chat) obj).f17195id));
            } else if (obj instanceof TLRPC.User) {
                pVar.presentFragment(eo.R9(((TLRPC.User) obj).f17342id));
            }
        }
    }

    public static void W(p pVar) {
        pVar.F = null;
        MessagesController.getInstance(pVar.currentAccount).changeChatAvatar(pVar.f7597b, null, null, null, null, 0.0d, null, null, null, null);
        pVar.a0(false, true);
        pVar.v.h(null, null, pVar.f7605y, pVar.H);
    }

    @Override
    public final void C(float f7) {
        RadialProgressView radialProgressView = this.f7604x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        int i11;
        this.G.setAlpha(f7);
        this.G.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.G.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        ai.t tVar = this.G;
        if (f7 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        tVar.setVisibility(i11);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f7604x;
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
        if (this.f7599f == this.h && TextUtils.equals(((o) this.f7600n.f3058b).getText().toString(), this.e)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f7596a.a(z10, true);
    }

    public final void Z(boolean z10) {
        if (this.h == z10) {
            return;
        }
        k6 k6Var = (k6) this.d.x1(151);
        if (k6Var != null) {
            k6Var.a(!z10);
        }
        k6 k6Var2 = (k6) this.d.x1(150);
        if (k6Var2 != null) {
            k6Var2.a(z10);
        }
        this.h = z10;
        Y();
    }

    public final void a0(boolean z10, boolean z11) {
        if (this.f7604x == null) {
            return;
        }
        AnimatorSet animatorSet = this.f7603w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f7603w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f7603w = animatorSet2;
            if (z10) {
                this.f7604x.setVisibility(0);
                this.f7602s.setVisibility(0);
                AnimatorSet animatorSet3 = this.f7603w;
                RadialProgressView radialProgressView = this.f7604x;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f7602s, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f7604x;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f7602s, property2, 0.0f));
            }
            this.f7603w.setDuration(180L);
            this.f7603w.addListener(new ai.e(11, this, z10));
            this.f7603w.start();
        } else if (z10) {
            this.f7604x.setAlpha(1.0f);
            this.f7604x.setVisibility(0);
            this.f7602s.setAlpha(1.0f);
            this.f7602s.setVisibility(0);
        } else {
            this.f7604x.setAlpha(0.0f);
            this.f7604x.setVisibility(4);
            this.f7602s.setAlpha(0.0f);
            this.f7602s.setVisibility(4);
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        e2.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 4));
        eh.c cVar = new eh.c();
        cVar.a(getThemedColor(j6.f17928d6));
        this.actionBar.M(new zg.a(cVar), dh.c.o(this.resourceProvider), false);
        this.actionBar.P0 = true;
        w7 w7Var = new w7(this, context);
        this.f7598c = w7Var;
        w7Var.setBackgroundColor(j6.w0(null, j6.f17872a7, false));
        this.f7605y = new g9(this.H);
        n nVar = new n(context);
        this.f7601r = nVar;
        nVar.f7588a.e(this.H, this.f7605y);
        this.v = this.f7601r.f7588a;
        String name = DialogObject.getName(this.H);
        this.e = name;
        f6 f6Var = this.resourceProvider;
        ld ldVar = new ld(context, 2);
        o oVar = new o(context, 0);
        ldVar.f3058b = oVar;
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
        ldVar.addView(oVar, a6.d(-1, -2.0f, i10 | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f7600n = ldVar;
        oVar.setText(name);
        ((o) this.f7600n.f3058b).setSelection(name.length());
        ((o) this.f7600n.f3058b).addTextChangedListener(new u2(this, 1));
        ai.t tVar = new ai.t(this, context);
        this.G = tVar;
        tVar.setTextColor(getThemedColor(j6.Sh));
        this.G.setText(LocaleController.getString(R.string.Save));
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setTextSize(1, 14.0f);
        this.G.setGravity(17);
        this.G.setVisibility(8);
        this.G.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.G.setOnClickListener(new ai.u(this, 12));
        c6.a(this.G);
        this.actionBar.addView(this.G, a6.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        s7 s7Var = new s7(this, context);
        this.f7602s = s7Var;
        this.f7601r.addView(s7Var, a6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f7604x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f7604x.setProgressColor(-1);
        this.f7604x.setNoProgress(false);
        this.f7601r.addView(this.f7604x, a6.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        a0(false, false);
        r61 r61Var = new r61(this, new i(this, 1), new j(this), new j(this));
        this.d = r61Var;
        r61Var.setClipToPadding(false);
        r61 r61Var2 = this.d;
        r61Var2.Y2.f24250r = false;
        r61Var2.o1();
        this.actionBar.setBackground(null);
        this.f7598c.addView(this.d, a6.c(-1.0f, -1));
        this.f7598c.addView(this.actionBar, a6.e(-1, -2, 48));
        w7 w7Var2 = this.f7598c;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.i0.f41062a;
        r0.a0.j(w7Var2, jVar);
        w7 w7Var3 = this.f7598c;
        this.fragmentView = w7Var3;
        return w7Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f17196id == this.f7597b) {
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
        if (dialog != this.E.f22554c && super.dismissDialogOnPause(dialog)) {
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
        return ((o) this.f7600n.f3058b).getText().toString();
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
        this.f7597b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f7597b));
        this.H = chat;
        if (chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f7599f = z10;
        this.h = z10;
        this.I = getMessagesController().getChatFull(this.f7597b);
        e50 e50Var = new e50(3, true, true);
        this.E = e50Var;
        e50Var.f22552a = this;
        e50Var.f22553b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        e50 e50Var = this.E;
        if (e50Var != null) {
            e50Var.e();
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
        e50 e50Var = this.E;
        if (e50Var != null) {
            e50Var.f22555f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        e50 e50Var = this.E;
        if (e50Var != null && (str = e50Var.f22555f) != null) {
            bundle.putString("path", str);
        }
        ld ldVar = this.f7600n;
        if (ldVar != null) {
            String obj = ((o) ldVar.f3058b).getText().toString();
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
    public final void B(float f7, int i10) {
    }
}
