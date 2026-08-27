package oh;

import ag.e1;
import ag.e2;
import ag.p1;
import ag.t0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import h7.b6;
import h7.z5;
import hh.h1;
import java.util.WeakHashMap;
import lh.c5;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.y8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cu0;
import org.telegram.ui.lr;
import org.telegram.ui.rn;

public final class o extends n2 implements i40, NotificationCenter.NotificationCenterDelegate, ud.b {
    public j40 A;
    public TLRPC.FileLocation B;
    public e1 C;
    public TLRPC.Chat D;
    public TLRPC.ChatFull E;
    public final b2[] F;
    public final m G;

    public final ud.a f19531a;

    public long f19532b;

    public h1 f19533c;
    public k51 d;

    public String f19534e;

    public boolean f19535f;
    public boolean h;

    public p1 f19536n;

    public n f19537r;

    public t0 f19538s;
    public n9 v;

    public AnimatorSet f19539w;

    public RadialProgressView f19540x;

    public y8 f19541y;

    public o(Bundle bundle) {
        super(bundle);
        this.f19531a = new ud.a(0, this, er.h, 320L, false);
        this.F = new b2[1];
        this.G = new m(this);
    }

    public static boolean U(o oVar, n41 n41Var, View view) {
        long j10;
        boolean zCanRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        int i10;
        Object obj = n41Var.G;
        if (!(obj instanceof TLRPC.Chat)) {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.f22527id;
                boolean zIsBot = UserObject.isBot(user);
                zCanRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, oVar.D);
                z10 = zIsBot;
                z11 = false;
            }
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        j10 = -chat.f22380id;
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        zCanRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, oVar.D);
        z11 = zIsChannelAndNotMegaGroup;
        z10 = false;
        boolean z12 = zCanRemoveBotFromCommunity;
        long j11 = j10;
        int iB = r0.b(oVar.currentAccount, j11);
        boolean z13 = iB == 1 || iB == 2;
        if (z12 || z13) {
            b70 b70VarF = b70.F(oVar.f19533c, null, view);
            int i11 = R.drawable.msg_viewintopic;
            if (z10) {
                i10 = R.string.CommunityMenuViewBot;
            } else {
                i10 = z11 ? R.string.CommunityMenuViewChannel : R.string.CommunityMenuViewGroup;
            }
            b70VarF.l(i11, LocaleController.getString(i10), new g(oVar, j11, 1), z13);
            b70VarF.m(z12, R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new l(oVar, z10, z11, j11, 0));
            b70VarF.W(oVar.d.V0(view, true));
            b70VarF.Z();
            return true;
        }
        return false;
    }

    public static void V(o oVar, n41 n41Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = n41Var.d;
        if (i10 == 140) {
            if (oVar.A.h() || (chatPhoto = (chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.f19532b))).photo) == null || chatPhoto.photo_big == null) {
                return;
            }
            ImageLocation forPhoto = null;
            PhotoViewer.t1().K2(null, oVar, null);
            TLRPC.ChatPhoto chatPhoto2 = chat.photo;
            int i11 = chatPhoto2.dc_id;
            if (i11 != 0) {
                chatPhoto2.photo_big.dc_id = i11;
            }
            TLRPC.ChatFull chatFull = oVar.E;
            if (chatFull != null) {
                TLRPC.Photo photo = chatFull.chat_photo;
                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                    forPhoto = ImageLocation.getForPhoto(oVar.E.chat_photo.video_sizes.get(0), oVar.E.chat_photo);
                }
            }
            PhotoViewer.t1().e2(null, chat.photo.photo_big, null, forPhoto, null, null, null, 0, oVar.G, null, 0L, 0L, 0L, true, null, null);
            return;
        }
        if (i10 == 141) {
            oVar.A.o(oVar.B != null, new h(oVar, 0), new lh.e1(6), 0);
            return;
        }
        if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", oVar.f19532b);
            bundle.putInt("type", 1);
            lr lrVar = new lr(bundle);
            lrVar.x0(oVar.E);
            oVar.presentFragment(lrVar);
            return;
        }
        if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", oVar.f19532b);
            bundle2.putInt("type", 0);
            lr lrVar2 = new lr(bundle2);
            lrVar2.x0(oVar.E);
            oVar.presentFragment(lrVar2);
            return;
        }
        if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", oVar.f19532b);
            oVar.presentFragment(new r(bundle3));
            return;
        }
        if (i10 == 150) {
            oVar.Z(true);
            return;
        }
        if (i10 == 151) {
            oVar.Z(false);
            return;
        }
        if (i10 == 145) {
            y4.s(oVar, false, oVar.D, null, false, true, true, false, new j(oVar));
            return;
        }
        if (i10 == 146) {
            r0.e(oVar.F, oVar, oVar.currentAccount, oVar.D);
            return;
        }
        Object obj = n41Var.G;
        if (obj instanceof TLRPC.Chat) {
            oVar.presentFragment(rn.R9(-((TLRPC.Chat) obj).f22380id));
        } else if (obj instanceof TLRPC.User) {
            oVar.presentFragment(rn.R9(((TLRPC.User) obj).f22527id));
        }
    }

    public static void W(o oVar) {
        oVar.B = null;
        MessagesController.getInstance(oVar.currentAccount).changeChatAvatar(oVar.f19532b, null, null, null, null, 0.0d, null, null, null, null);
        oVar.a0(false, true);
        oVar.v.h(null, null, oVar.f19541y, oVar.D);
    }

    @Override
    public final void E(float f10) {
        RadialProgressView radialProgressView = this.f19540x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f19540x;
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
        this.f19531a.a((this.f19535f == this.h && TextUtils.equals(((hh.o) this.f19536n.f594b).getText().toString(), this.f19534e)) ? false : true, true);
    }

    public final void Z(boolean z10) {
        if (this.h == z10) {
            return;
        }
        f6 f6Var = (f6) this.d.y1(151);
        if (f6Var != null) {
            f6Var.a(!z10);
        }
        f6 f6Var2 = (f6) this.d.y1(150);
        if (f6Var2 != null) {
            f6Var2.a(z10);
        }
        this.h = z10;
        Y();
    }

    public final void a0(boolean z10, boolean z11) {
        if (this.f19540x == null) {
            return;
        }
        AnimatorSet animatorSet = this.f19539w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f19539w = null;
        }
        if (!z11) {
            if (z10) {
                this.f19540x.setAlpha(1.0f);
                this.f19540x.setVisibility(0);
                this.f19538s.setAlpha(1.0f);
                this.f19538s.setVisibility(0);
                return;
            }
            this.f19540x.setAlpha(0.0f);
            this.f19540x.setVisibility(4);
            this.f19538s.setAlpha(0.0f);
            this.f19538s.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f19539w = animatorSet2;
        if (z10) {
            this.f19540x.setVisibility(0);
            this.f19538s.setVisibility(0);
            AnimatorSet animatorSet3 = this.f19539w;
            RadialProgressView radialProgressView = this.f19540x;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f19538s, (Property<t0, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.f19540x;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f19538s, (Property<t0, Float>) property2, 0.0f));
        }
        this.f19539w.setDuration(180L);
        this.f19539w.addListener(new ag.x(18, this, z10));
        this.f19539w.start();
    }

    @Override
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        pa.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e2(this, 8));
        og.c cVar = new og.c();
        cVar.a(getThemedColor(g6.f23053d6));
        this.actionBar.M(new jg.a(cVar), ng.c.n(this.resourceProvider), false);
        this.actionBar.L0 = true;
        h1 h1Var = new h1(this, context);
        this.f19533c = h1Var;
        h1Var.setBackgroundColor(g6.w0(null, g6.f22999a7, false));
        this.f19541y = new y8(this.D);
        n nVar = new n(context);
        this.f19537r = nVar;
        nVar.f19530a.e(this.D, this.f19541y);
        this.v = this.f19537r.f19530a;
        String name = DialogObject.getName(this.D);
        this.f19534e = name;
        c6 c6Var = this.resourceProvider;
        p1 p1Var = new p1(context, 11);
        hh.o oVar = new hh.o(context, i10);
        p1Var.f594b = oVar;
        oVar.setTextColor(g6.v0(g6.G6, c6Var));
        oVar.setLinkTextColor(g6.v0(g6.gc, c6Var));
        oVar.setHintTextColor(g6.v0(g6.H6, c6Var));
        oVar.setTextSize(1, 16.0f);
        oVar.setMaxLines(Integer.MAX_VALUE);
        oVar.setBackground(null);
        oVar.setImeOptions(oVar.getImeOptions() | 268435456);
        oVar.setInputType(oVar.getInputType() | 16384);
        oVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        oVar.setMinHeight(AndroidUtilities.dp(50.0f));
        int i11 = 5;
        p1Var.addView(oVar, z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f19536n = p1Var;
        oVar.setText(name);
        ((hh.o) this.f19536n.f594b).setSelection(name.length());
        ((hh.o) this.f19536n.f594b).addTextChangedListener(new ch.e(this, i11));
        e1 e1Var = new e1(this, context);
        this.C = e1Var;
        e1Var.setTextColor(getThemedColor(g6.Sh));
        this.C.setText(LocaleController.getString(R.string.Save));
        this.C.setTypeface(AndroidUtilities.bold());
        this.C.setTextSize(1, 14.0f);
        this.C.setGravity(17);
        this.C.setVisibility(8);
        this.C.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.C.setOnClickListener(new c5(this, 7));
        b6.a(this.C);
        this.actionBar.addView(this.C, z5.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        t0 t0Var = new t0(this, context);
        this.f19538s = t0Var;
        this.f19537r.addView(t0Var, z5.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f19540x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f19540x.setProgressColor(-1);
        this.f19540x.setNoProgress(false);
        this.f19537r.addView(this.f19540x, z5.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        a0(false, false);
        k51 k51Var = new k51(this, new i(this, i10), new j(this), new j(this));
        this.d = k51Var;
        k51Var.setClipToPadding(false);
        k51 k51Var2 = this.d;
        k51Var2.U2.f26942r = false;
        k51Var2.p1();
        this.actionBar.setBackground(null);
        this.f19533c.addView(this.d, z5.c(-1.0f, -1));
        this.f19533c.addView(this.actionBar, z5.e(-1, -2, 48));
        h1 h1Var2 = this.f19533c;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(h1Var2, jVar);
        h1 h1Var3 = this.f19533c;
        this.fragmentView = h1Var3;
        return h1Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22381id == this.f19532b) {
                this.E = chatFull;
                this.d.U2.N(true);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.A.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.A.f29571c && super.dismissDialogOnPause(dialog);
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
    public final cu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((hh.o) this.f19536n.f594b).getText().toString();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        this.C.setAlpha(f10);
        this.C.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f10));
        this.C.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f10));
        this.C.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.A.i(i10, i11, intent);
    }

    @Override
    public final boolean onFragmentCreate() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.f19532b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f19532b));
        this.D = chat;
        boolean z10 = chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers);
        this.f19535f = z10;
        this.h = z10;
        this.E = getMessagesController().getChatFull(this.f19532b);
        j40 j40Var = new j40(3, true, true);
        this.A = j40Var;
        j40Var.f29569a = this;
        j40Var.f29570b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        j40 j40Var = this.A;
        if (j40Var != null) {
            j40Var.e();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.A.j();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.A.k(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.A.l();
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        j40 j40Var = this.A;
        if (j40Var != null) {
            j40Var.f29573f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        j40 j40Var = this.A;
        if (j40Var != null && (str = j40Var.f29573f) != null) {
            bundle.putString("path", str);
        }
        p1 p1Var = this.f19536n;
        if (p1Var != null) {
            String string = ((hh.o) p1Var.f594b).getText().toString();
            if (string.isEmpty()) {
                return;
            }
            bundle.putString("nameTextView", string);
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
    public final void A(float f10, int i10) {
    }
}
