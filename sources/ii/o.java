package ii;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import bi.t1;
import fi.e1;
import fi.f6;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.g50;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.y9;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.kr;
import org.telegram.ui.qu0;
import org.telegram.ui.un;
public final class o extends r2 implements f50, NotificationCenter.NotificationCenterDelegate, oe.d {
    public j9 E;
    public g50 F;
    public TLRPC.FileLocation G;
    public ei.n H;
    public TLRPC.Chat I;
    public TLRPC.ChatFull J;
    public final e2[] K;
    public final m L;
    public hh.c f14390a;
    public final oe.b f14391b;
    public long f14392c;
    public t1 d;
    public r71 e;
    public String f14393f;
    public boolean h;
    public boolean f14394n;
    public bh.r f14395r;
    public n f14396s;
    public f6 v;
    public y9 f14397w;
    public AnimatorSet f14398x;
    public RadialProgressView f14399y;

    public o(Bundle bundle) {
        super(bundle);
        this.f14391b = new oe.b(0, this, ds.h, 320L, false);
        this.K = new e2[1];
        this.L = new m(this);
    }

    public static boolean V(o oVar, t61 t61Var, View view) {
        long j10;
        boolean canRemoveBotFromCommunity;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        Object obj = t61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            j10 = -chat.f22027id;
            z11 = ChatObject.isChannelAndNotMegaGroup(chat);
            canRemoveBotFromCommunity = ChatObject.canRemoveChatFromCommunity(chat, oVar.I);
            z10 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                j10 = user.f22176id;
                boolean isBot = UserObject.isBot(user);
                canRemoveBotFromCommunity = ChatObject.canRemoveBotFromCommunity(user, oVar.I);
                z10 = isBot;
                z11 = false;
            }
            return false;
        }
        int b10 = s0.b(oVar.currentAccount, j10);
        if (b10 != 1 && b10 != 2) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (canRemoveBotFromCommunity || z12) {
            k80 F = k80.F(oVar.d, null, view);
            int i11 = R.drawable.msg_viewintopic;
            if (z10) {
                i10 = R.string.CommunityMenuViewBot;
            } else if (z11) {
                i10 = R.string.CommunityMenuViewChannel;
            } else {
                i10 = R.string.CommunityMenuViewGroup;
            }
            F.l(i11, LocaleController.getString(i10), new g(oVar, j10, 1), z12);
            F.m(R.drawable.msg_cancel, new l(oVar, z10, z11, j10, 0), LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), canRemoveBotFromCommunity, true);
            F.W(oVar.e.V0(view, true));
            F.Z();
            return true;
        }
        return false;
    }

    public static void W(o oVar, t61 t61Var) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        int i10 = t61Var.d;
        if (i10 == 140) {
            if (!oVar.F.g() && (chatPhoto = (chat = oVar.getMessagesController().getChat(Long.valueOf(oVar.f14392c))).photo) != null && chatPhoto.photo_big != null) {
                ImageLocation imageLocation = null;
                PhotoViewer.u1().M2(null, oVar, null);
                TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                int i11 = chatPhoto2.dc_id;
                if (i11 != 0) {
                    chatPhoto2.photo_big.dc_id = i11;
                }
                TLRPC.ChatFull chatFull = oVar.J;
                if (chatFull != null) {
                    TLRPC.Photo photo = chatFull.chat_photo;
                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                        imageLocation = ImageLocation.getForPhoto(oVar.J.chat_photo.video_sizes.get(0), oVar.J.chat_photo);
                    }
                }
                PhotoViewer.u1().g2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, oVar.L, null, 0L, 0L, 0L, true, null, null);
                return;
            }
            return;
        }
        boolean z10 = true;
        if (i10 == 141) {
            g50 g50Var = oVar.F;
            if (oVar.G == null) {
                z10 = false;
            }
            g50Var.n(z10, new h(oVar, 0), new e1(7), 0);
        } else if (i10 == 142) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", oVar.f14392c);
            bundle.putInt("type", 1);
            kr krVar = new kr(bundle);
            krVar.y0(oVar.J);
            oVar.presentFragment(krVar);
        } else if (i10 == 144) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", oVar.f14392c);
            bundle2.putInt("type", 0);
            kr krVar2 = new kr(bundle2);
            krVar2.y0(oVar.J);
            oVar.presentFragment(krVar2);
        } else if (i10 == 143) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("community_id", oVar.f14392c);
            oVar.presentFragment(new r(bundle3));
        } else if (i10 == 150) {
            oVar.a0(true);
        } else if (i10 == 151) {
            oVar.a0(false);
        } else if (i10 == 145) {
            g5.r(oVar, false, oVar.I, null, false, true, true, false, new j(oVar));
        } else if (i10 == 146) {
            s0.e(oVar.K, oVar, oVar.currentAccount, oVar.I);
        } else {
            Object obj = t61Var.G;
            if (obj instanceof TLRPC.Chat) {
                oVar.presentFragment(un.ba(-((TLRPC.Chat) obj).f22027id));
            } else if (obj instanceof TLRPC.User) {
                oVar.presentFragment(un.ba(((TLRPC.User) obj).f22176id));
            }
        }
    }

    public static void X(o oVar) {
        oVar.G = null;
        MessagesController.getInstance(oVar.currentAccount).changeChatAvatar(oVar.f14392c, null, null, null, null, 0.0d, null, null, null, null);
        oVar.b0(false, true);
        oVar.f14397w.h(null, null, oVar.E, oVar.I);
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        int i11;
        this.H.setAlpha(f7);
        this.H.setScaleX(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        this.H.setScaleY(AndroidUtilities.lerp(0.75f, 1.0f, f7));
        ei.n nVar = this.H;
        if (f7 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        nVar.setVisibility(i11);
    }

    @Override
    public final void F(float f7) {
        RadialProgressView radialProgressView = this.f14399y;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f14399y;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new k(this, photoSize2, inputFile, inputFile2, videoSize, d, str, photoSize));
    }

    public final void Z() {
        boolean z10;
        if (this.h == this.f14394n && TextUtils.equals(((bi.t) this.f14395r.f4113b).getText().toString(), this.f14393f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f14391b.a(z10, true);
    }

    public final void a0(boolean z10) {
        if (this.f14394n == z10) {
            return;
        }
        n6 n6Var = (n6) this.e.E1(151);
        if (n6Var != null) {
            n6Var.a(!z10);
        }
        n6 n6Var2 = (n6) this.e.E1(150);
        if (n6Var2 != null) {
            n6Var2.a(z10);
        }
        this.f14394n = z10;
        Z();
    }

    public final void b0(boolean z10, boolean z11) {
        if (this.f14399y == null) {
            return;
        }
        AnimatorSet animatorSet = this.f14398x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f14398x = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f14398x = animatorSet2;
            if (z10) {
                this.f14399y.setVisibility(0);
                this.v.setVisibility(0);
                AnimatorSet animatorSet3 = this.f14398x;
                RadialProgressView radialProgressView = this.f14399y;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.v, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f14399y;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.v, property2, 0.0f));
            }
            this.f14398x.setDuration(180L);
            this.f14398x.addListener(new bh.f0(17, this, z10));
            this.f14398x.start();
        } else if (z10) {
            this.f14399y.setAlpha(1.0f);
            this.f14399y.setVisibility(0);
            this.v.setAlpha(1.0f);
            this.v.setVisibility(0);
        } else {
            this.f14399y.setAlpha(0.0f);
            this.f14399y.setVisibility(4);
            this.v.setAlpha(0.0f);
            this.v.setVisibility(4);
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonDrawable(new j2(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, 6));
        hh.c cVar = new hh.c();
        this.f14390a = cVar;
        cVar.a(getThemedColor(y6.f23356d6));
        this.actionBar.I(new ch.b(cVar), gh.c.p(this.resourceProvider), false);
        this.actionBar.Q0 = true;
        t1 t1Var = new t1(this, context);
        this.d = t1Var;
        f7.i(y6.f23299a7, t1Var, null);
        this.E = new j9(this.I);
        n nVar = new n(context);
        this.f14396s = nVar;
        nVar.f14386a.f(this.I, this.E);
        this.f14397w = this.f14396s.f14386a;
        String name = DialogObject.getName(this.I);
        this.f14393f = name;
        u6 u6Var = this.resourceProvider;
        bh.r rVar = new bh.r(context, 6);
        bi.t tVar = new bi.t(context, 1);
        rVar.f4113b = tVar;
        f7.V(tVar, y6.G6, u6Var);
        f7.H(tVar, y6.gc, u6Var);
        f7.E(tVar, y6.H6, u6Var);
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
        rVar.addView(tVar, gb1.h(-1, -2.0f, i10 | 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f14395r = rVar;
        tVar.setText(name);
        ((bi.t) this.f14395r.f4113b).setSelection(name.length());
        ((bi.t) this.f14395r.f4113b).addTextChangedListener(new bi.u(this, 2));
        ei.n nVar2 = new ei.n(this, context);
        this.H = nVar2;
        f7.V(nVar2, y6.Sh, getResourceProvider());
        this.H.setText(LocaleController.getString(R.string.Save));
        this.H.setTypeface(AndroidUtilities.bold());
        this.H.setTextSize(1, 14.0f);
        this.H.setGravity(17);
        this.H.setVisibility(8);
        this.H.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.H.setOnClickListener(new ig.d0(this, 3));
        gb1.b(this.H);
        this.actionBar.addView(this.H, gb1.h(-2, 56.0f, 85, 0.0f, 0.0f, 12.0f, 0.0f));
        f6 f6Var = new f6(this, context);
        this.v = f6Var;
        this.f14396s.addView(f6Var, gb1.h(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f14399y = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f14399y.setProgressColor(-1);
        this.f14399y.setNoProgress(false);
        this.f14396s.addView(this.f14399y, gb1.h(64, 64.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
        b0(false, false);
        r71 r71Var = new r71(this, new i(this, 1), new j(this), new j(this));
        this.e = r71Var;
        r71Var.setClipToPadding(false);
        r71 r71Var2 = this.e;
        j71 j71Var = r71Var2.f32152g3;
        j71Var.f29507r = false;
        j71Var.f29508s = true;
        r71Var2.u1();
        this.actionBar.setBackground(null);
        this.d.addView(this.e, gb1.g(-1.0f, -1));
        this.d.addView(this.actionBar, gb1.i(-1, -2, 48));
        t1 t1Var2 = this.d;
        j jVar = new j(this);
        WeakHashMap weakHashMap = r0.i0.f47108a;
        r0.a0.i(t1Var2, jVar);
        t1 t1Var3 = this.d;
        this.fragmentView = t1Var3;
        return t1Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22028id == this.f14392c) {
                this.J = chatFull;
                this.e.f32152g3.O(true);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.F.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.F.f28423c && super.dismissDialogOnPause(dialog)) {
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
    public final qu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return ((bi.t) this.f14395r.f4113b).getText().toString();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.F.h(i10, i11, intent);
    }

    @Override
    public final boolean onFragmentCreate() {
        boolean z10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.f14392c = this.arguments.getLong("community_id", 0L);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f14392c));
        this.I = chat;
        if (chat != null && ((tL_chatBannedRights = chat.default_banned_rights) == null || !tL_chatBannedRights.manage_linked_peers)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        this.f14394n = z10;
        this.J = getMessagesController().getChatFull(this.f14392c);
        g50 g50Var = new g50(3, true, true);
        this.F = g50Var;
        g50Var.f28421a = this;
        g50Var.f28422b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        g50 g50Var = this.F;
        if (g50Var != null) {
            g50Var.d();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.F.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.F.j(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.F.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            hh.c cVar = this.f14390a;
            if (cVar != null) {
                cVar.a(getThemedColor(y6.f23356d6));
            }
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        g50 g50Var = this.F;
        if (g50Var != null) {
            g50Var.f28424f = bundle.getString("path");
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        g50 g50Var = this.F;
        if (g50Var != null && (str = g50Var.f28424f) != null) {
            bundle.putString("path", str);
        }
        bh.r rVar = this.f14395r;
        if (rVar != null) {
            String obj = ((bi.t) rVar.f4113b).getText().toString();
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
    public final void Q() {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
