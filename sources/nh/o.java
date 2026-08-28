package nh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import fh.d2;
import fh.w4;
import g7.e6;
import g7.g6;
import gh.h1;
import java.util.WeakHashMap;
import kh.g1;
import kh.h6;
import kh.x8;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bu0;
import org.telegram.ui.jr;
import org.telegram.ui.qn;
public final class o extends o2 implements d40, NotificationCenter.NotificationCenterDelegate, td.b {
    public e40 A;
    public TLRPC.FileLocation B;
    public bh.e C;
    public TLRPC.Chat D;
    public TLRPC.ChatFull E;
    public final c2[] F;
    public final m G;
    public final td.a f18682a;
    public long f18683b;
    public h1 f18684c;
    public i51 d;
    public String f18685e;
    public boolean f18686f;
    public boolean h;
    public d2 f18687n;
    public n f18688r;
    public h6 f18689s;
    public o9 v;
    public AnimatorSet f18690w;
    public RadialProgressView f18691x;
    public z8 f18692y;

    public o(Bundle bundle) {
        super(bundle);
        this.f18682a = new td.a(0, this, gr.h, 320L, false);
        this.F = new c2[1];
        this.G = new m(this);
    }

    public static boolean T(o oVar, l41 l41Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        boolean z12;
        int i9;
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j10 = -chat.f22380id;
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, oVar.D);
            z11 = isChannelAndNotMegaGroup;
            z10 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.f22527id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, oVar.D);
                z10 = isBot;
                z11 = false;
            }
            return false;
        }
        boolean z13 = canRemoveBotFromCommunity;
        long j11 = j10;
        int b10 = r0.b(oVar.currentAccount, j11);
        if (b10 != 1 && b10 != 2) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z13 || z12) {
            x60 F = x60.F(oVar.f18684c, null, view);
            int i10 = R.drawable.msg_viewintopic;
            if (z10) {
                i9 = R.string.CommunityMenuViewBot;
            } else if (z11) {
                i9 = R.string.CommunityMenuViewChannel;
            } else {
                i9 = R.string.CommunityMenuViewGroup;
            }
            F.l(i10, LocaleController.getString(i9), new g(oVar, j11, 1), z12);
            F.m(z13, R.drawable.msg_cancel, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), true, new l(oVar, z10, z11, j11, 0));
            F.W(oVar.d.V0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void U(o oVar, l41 l41Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i9 = l41Var.d;
        if (i9 == 140) {
            if (!oVar.A.h() && (chatPhoto = (chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.f18683b))).photo) != null && chatPhoto.photo_big != null) {
                ImageLocation imageLocation = null;
                PhotoViewer.t1().K2(null, oVar, null);
                TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                int i10 = chatPhoto2.dc_id;
                if (i10 != 0) {
                    chatPhoto2.photo_big.dc_id = i10;
                }
                TLRPC.ChatFull chatFull = oVar.E;
                if (chatFull != null) {
                    TLRPC.Photo photo = chatFull.chat_photo;
                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                        imageLocation = ImageLocation.getForPhoto(oVar.E.chat_photo.video_sizes.get(0), oVar.E.chat_photo);
                    }
                }
                PhotoViewer.t1().e2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, oVar.G, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            return;
        }
        boolean z10 = true;
        if (i9 == 141) {
            e40 e40Var = oVar.A;
            if (oVar.B == null) {
                z10 = false;
            }
            e40Var.o(z10, new h(oVar, 0), new g1(6), 0);
        } else if (i9 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", oVar.f18683b);
            bundle.putInt("type", 1);
            jr jrVar = new jr(bundle);
            jrVar.w0(oVar.E);
            oVar.presentFragment(jrVar);
        } else if (i9 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", oVar.f18683b);
            bundle2.putInt("type", 0);
            jr jrVar2 = new jr(bundle2);
            jrVar2.w0(oVar.E);
            oVar.presentFragment(jrVar2);
        } else if (i9 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", oVar.f18683b);
            oVar.presentFragment(new r(bundle3));
        } else if (i9 == 150) {
            oVar.Y(true);
        } else if (i9 == 151) {
            oVar.Y(false);
        } else if (i9 == 145) {
            y4.s(oVar, false, oVar.D, null, false, true, true, false, new j(oVar));
        } else if (i9 == 146) {
            r0.e(oVar.F, oVar, oVar.currentAccount, oVar.D);
        } else {
            Object obj = l41Var.G;
            if (obj instanceof TLRPC.Chat) {
                oVar.presentFragment(qn.R9(-((TLRPC.Chat) obj).f22380id));
            } else if (obj instanceof TLRPC.User) {
                oVar.presentFragment(qn.R9(((TLRPC.User) obj).f22527id));
            }
        }
    }

    public static void V(o oVar) {
        oVar.B = null;
        MessagesController.getInstance(oVar.currentAccount).changeChatAvatar(oVar.f18683b, null, null, null, null, 0.0d, null, null, null, null);
        oVar.Z(false, true);
        oVar.v.h(null, null, oVar.f18692y, oVar.D);
    }

    @Override
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.f18691x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f18691x;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        int i10;
        this.C.setAlpha(f10);
        this.C.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f10));
        this.C.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f10));
        bh.e eVar = this.C;
        if (f10 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        eVar.setVisibility(i10);
    }

    @Override
    public final void P(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new k(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void X() {
        boolean z10;
        if (this.f18686f == this.h && TextUtils.equals(((gh.o) this.f18687n.f6412b).getText().toString(), this.f18685e)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f18682a.a(z10, true);
    }

    public final void Y(boolean z10) {
        if (this.h == z10) {
            return;
        }
        i6 i6Var = (i6) this.d.y1(151);
        if (i6Var != null) {
            i6Var.a(!z10);
        }
        i6 i6Var2 = (i6) this.d.y1(150);
        if (i6Var2 != null) {
            i6Var2.a(z10);
        }
        this.h = z10;
        X();
    }

    public final void Z(boolean z10, boolean z11) {
        if (this.f18691x == null) {
            return;
        }
        AnimatorSet animatorSet = this.f18690w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f18690w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f18690w = animatorSet2;
            if (z10) {
                this.f18691x.setVisibility(0);
                this.f18689s.setVisibility(0);
                AnimatorSet animatorSet3 = this.f18690w;
                RadialProgressView radialProgressView = this.f18691x;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.f18689s, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f18691x;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.f18689s, property2, 0.0f));
            }
            this.f18690w.setDuration(180L);
            this.f18690w.addListener(new hg.b0(16, this, z10));
            this.f18690w.start();
        } else if (z10) {
            this.f18691x.setAlpha(1.0f);
            this.f18691x.setVisibility(0);
            this.f18689s.setAlpha(1.0f);
            this.f18689s.setVisibility(0);
        } else {
            this.f18691x.setAlpha(0.0f);
            this.f18691x.setVisibility(4);
            this.f18689s.setAlpha(0.0f);
            this.f18689s.setVisibility(4);
        }
    }

    @Override
    public final View createView(Context context) {
        int i9;
        setHasOwnBackground(true);
        j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new w4(this, 7));
        ng.c cVar = new ng.c();
        cVar.a(getThemedColor(f6.f23001d6));
        this.actionBar.L(new ig.a(cVar), mg.c.n(this.resourceProvider), false);
        this.actionBar.L0 = true;
        h1 h1Var = new h1(this, context);
        this.f18684c = h1Var;
        h1Var.setBackgroundColor(f6.w0(null, f6.f22947a7, false));
        this.f18692y = new z8(this.D);
        n nVar = new n(context);
        this.f18688r = nVar;
        nVar.f18681a.e(this.D, this.f18692y);
        this.v = this.f18688r.f18681a;
        String name = DialogObject.getName(this.D);
        this.f18685e = name;
        b6 b6Var = this.resourceProvider;
        d2 d2Var = new d2(context, 8);
        gh.o oVar = new gh.o(context, 1);
        d2Var.f6412b = oVar;
        oVar.setTextColor(f6.v0(f6.G6, b6Var));
        oVar.setLinkTextColor(f6.v0(f6.f23061gc, b6Var));
        oVar.setHintTextColor(f6.v0(f6.H6, b6Var));
        oVar.setTextSize(1, 16.0f);
        oVar.setMaxLines(Integer.MAX_VALUE);
        oVar.setBackground(null);
        oVar.setImeOptions(oVar.getImeOptions() | 268435456);
        oVar.setInputType(oVar.getInputType() | 16384);
        oVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(11.0f));
        oVar.setMinHeight(AndroidUtilities.dp(50.0f));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        d2Var.addView(oVar, e6.d(-1, -2.0f, i9 | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f18687n = d2Var;
        oVar.setText(name);
        ((gh.o) this.f18687n.f6412b).setSelection(name.length());
        ((gh.o) this.f18687n.f6412b).addTextChangedListener(new bh.f(this, 5));
        bh.e eVar = new bh.e(this, context);
        this.C = eVar;
        eVar.setTextColor(getThemedColor(f6.Sh));
        this.C.setText(LocaleController.getString(R.string.Save));
        this.C.setTypeface(AndroidUtilities.bold());
        this.C.setTextSize(1, 14.0f);
        this.C.setGravity(17);
        this.C.setVisibility(8);
        this.C.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.C.setOnClickListener(new x8(this, 5));
        g6.a(this.C);
        this.actionBar.addView(this.C, e6.d(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        h6 h6Var = new h6(this, context);
        this.f18689s = h6Var;
        this.f18688r.addView(h6Var, e6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f18691x = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f18691x.setProgressColor(-1);
        this.f18691x.setNoProgress(false);
        this.f18688r.addView(this.f18691x, e6.d(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        Z(false, false);
        i51 i51Var = new i51(this, new i(this, 1), new j(this), new j(this));
        this.d = i51Var;
        i51Var.setClipToPadding(false);
        i51 i51Var2 = this.d;
        i51Var2.U2.f35188r = false;
        i51Var2.p1();
        this.actionBar.setBackground(null);
        this.f18684c.addView(this.d, e6.c(-1.0f, -1));
        this.f18684c.addView(this.actionBar, e6.e(-1, -2, 48));
        h1 h1Var2 = this.f18684c;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(h1Var2, jVar);
        h1 h1Var3 = this.f18684c;
        this.fragmentView = h1Var3;
        return h1Var3;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22381id == this.f18683b) {
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
        if (dialog != this.A.f27911c && super.dismissDialogOnPause(dialog)) {
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
    public final bu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((gh.o) this.f18687n.f6412b).getText().toString();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        this.A.i(i9, i10, intent);
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.f18683b = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f18683b));
        this.D = chat;
        if (chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18686f = z10;
        this.h = z10;
        this.E = getMessagesController().getChatFull(this.f18683b);
        e40 e40Var = new e40(3, true, true);
        this.A = e40Var;
        e40Var.f27909a = this;
        e40Var.f27910b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        e40 e40Var = this.A;
        if (e40Var != null) {
            e40Var.e();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.A.j();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        this.A.k(i9, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.A.l();
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        e40 e40Var = this.A;
        if (e40Var != null) {
            e40Var.f27913f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        e40 e40Var = this.A;
        if (e40Var != null && (str = e40Var.f27913f) != null) {
            bundle.putString("path", str);
        }
        d2 d2Var = this.f18687n;
        if (d2Var != null) {
            String obj = ((gh.o) d2Var.f6412b).getText().toString();
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
    public final void O() {
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
