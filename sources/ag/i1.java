package ag;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.b6;
import h7.z5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lh.sb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.d4;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gy;
import org.telegram.ui.jo;
import org.telegram.ui.rn;
import org.telegram.ui.xc;

public class i1 extends qa implements NotificationCenter.NotificationCenterDelegate {
    public static final int R0 = 0;
    public r0 A0;
    public final TextView B0;
    public lh.d C0;
    public Runnable D0;
    public boolean E0;
    public gk0 F0;
    public final org.telegram.ui.ActionBar.n2 G0;
    public s0 H0;
    public h1 I0;
    public boolean J0;
    public TLRPC.Chat K0;
    public final f00 L0;
    public Runnable M0;
    public int N0;
    public final lh.d O0;
    public int P0;
    public String Q0;
    public int T;
    public boolean U;
    public int V;
    public long W;
    public TL_stories.TL_premium_boostsStatus X;
    public ChannelBoostsController.CanApplyBoost Y;
    public g1 Z;

    public boolean f429a0;

    public boolean f430b0;

    public org.telegram.ui.Cells.s1 f431c0;

    public final int f432d0;

    public final ArrayList f433e0;

    public boolean f434f0;

    public int f435g0;

    public int f436h0;

    public int f437i0;

    public int f438j0;

    public int f439k0;

    public int f440l0;
    public int m0;

    public int f441n0;

    public int f442o0;

    public int f443p0;

    public ArrayList f444q0;

    public boolean f445r0;

    public int f446s0;

    public f1 f447t0;

    public final HashSet f448u0;

    public final ArrayList f449v0;

    public final ArrayList f450w0;

    public ArrayList f451x0;

    public ArrayList f452y0;

    public ArrayList f453z0;

    public i1(int i10, int i11, Context context, org.telegram.ui.ActionBar.n2 n2Var, c6 c6Var) {
        super(context, n2Var, false, v1(i10), false, 1, c6Var);
        this.V = -1;
        this.f430b0 = false;
        this.f433e0 = new ArrayList();
        this.f436h0 = -1;
        this.f437i0 = -1;
        this.f438j0 = -1;
        this.f439k0 = -1;
        this.f440l0 = -1;
        this.m0 = -1;
        this.f441n0 = -1;
        this.f442o0 = -1;
        this.f443p0 = -1;
        this.f446s0 = -1;
        this.f448u0 = new HashSet();
        this.f449v0 = new ArrayList();
        this.f450w0 = new ArrayList();
        this.f451x0 = new ArrayList();
        this.f452y0 = new ArrayList();
        this.f453z0 = new ArrayList();
        this.E0 = false;
        this.N0 = 0;
        this.P0 = -4;
        fixNavigationBar(g6.v0(g6.f23124h5, this.resourcesProvider));
        this.G0 = n2Var;
        this.currentAccount = i11;
        this.f432d0 = i10;
        N();
        M1();
        if (i10 == 2) {
            this.E0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new f0(this, 0));
        } else if (i10 == 5) {
            this.E0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new f0(this, 2));
        }
        L1();
        if (i10 == 32 || w1()) {
            f00 f00Var = new f00(getContext());
            this.L0 = f00Var;
            this.container.addView(f00Var, z5.c(-1.0f, -1));
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35 || i10 == 31) {
            ((ViewGroup) this.A0.getParent()).removeView(this.A0);
            s0 s0Var = this.H0;
            if (s0Var != null) {
                ((ViewGroup) s0Var.getParent()).removeView(this.H0);
            }
            this.d.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.B0 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(this.A0.getTextView().getText());
            textView.setTextColor(g6.v0(g6.Sh, c6Var));
            textView.setOnClickListener(new e0(this, 0));
            int iDp = AndroidUtilities.dp(8.0f);
            int iV0 = g6.v0(g6.Oh, c6Var);
            int iK = i0.b.k(g6.v0(g6.f23053d6, c6Var), 120);
            textView.setBackground(g6.i0(iDp, iDp, iDp, iDp, iV0, iK, iK));
        }
        if (i10 == 32) {
            ((ViewGroup) this.A0.getParent()).removeView(this.A0);
            lh.d dVar = new lh.d(context, c6Var, true);
            this.O0 = dVar;
            dVar.k();
            dVar.g(LocaleController.getString(R.string.BoostGroup), false, true);
            dVar.setOnClickListener(new e0(this, 1));
            this.containerView.addView(dVar, z5.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.containerView.post(new g0(this, 3));
        }
        if (i10 == 19 || i10 == 18) {
            this.containerView.post(new g0(this, 4));
        }
    }

    public static String A1(int i10) {
        switch (i10) {
            case 0:
                return "double_limits__dialog_pinned";
            case 1:
            case 7:
            case 11:
            default:
                return null;
            case 2:
                return "double_limits__channels_public";
            case 3:
                return "double_limits__dialog_filters";
            case 4:
                return "double_limits__dialog_filters_chats";
            case 5:
                return "double_limits__channels";
            case 6:
                return "double_limits__upload_max_fileparts";
            case 8:
                return "double_limits__caption_length";
            case 9:
                return "double_limits__saved_gifs";
            case 10:
                return "double_limits__stickers_faved";
            case 12:
                return "double_limits__chatlist_invites";
            case 13:
                return "double_limits__chatlists_joined";
        }
    }

    public static void C1(org.telegram.ui.ActionBar.n2 n2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j10, boolean z10) {
        if (tL_premium_boostsStatus == null || canApplyBoost == null || n2Var.getContext() == null) {
            return;
        }
        i1 i1Var = new i1(32, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, n2Var.getResourceProvider());
        i1Var.G1(canApplyBoost);
        i1Var.F1(tL_premium_boostsStatus, true);
        i1Var.H1(j10);
        if (z10) {
            n2Var.showDialog(i1Var);
        } else {
            i1Var.show();
        }
    }

    public static void P(i1 i1Var, ArrayList arrayList, TLRPC.User user) {
        i1Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
            MessagesController.getInstance(i1Var.currentAccount).putChat(chat, false);
            MessagesController.getInstance(i1Var.currentAccount).deleteParticipantFromChat(chat.f22380id, user);
        }
    }

    public static void Q(i1 i1Var, ArrayList arrayList) {
        i1Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
            tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) arrayList.get(i10));
            tL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(i1Var.currentAccount).sendRequest(tL_channels_updateUsername, new f0(i1Var, 1), 64);
        }
    }

    public static void R(i1 i1Var, ArrayList arrayList, int i10, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        int top;
        zk0 zk0Var = i1Var.d;
        ArrayList arrayList2 = i1Var.f450w0;
        arrayList2.clear();
        ArrayList arrayList3 = i1Var.f449v0;
        arrayList3.clear();
        arrayList2.addAll(arrayList);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList3.add(tL_messages_inactiveChats.chats.get(i11));
        }
        i1Var.E0 = false;
        i1Var.F0.b(i1Var.f438j0 + 4);
        int i12 = 0;
        while (true) {
            if (i12 >= zk0Var.getChildCount()) {
                top = 0;
                break;
            } else {
                if (zk0Var.getChildAt(i12) instanceof g1) {
                    top = zk0Var.getChildAt(i12).getTop();
                    break;
                }
                i12++;
            }
        }
        i1Var.M1();
        if (i1Var.f436h0 >= 0 && top != 0) {
            ((f2.k0) zk0Var.getLayoutManager()).h1(i1Var.f436h0 + 1, top);
        }
        if (i1Var.I0 == null) {
            i1Var.I0 = u1(i1Var.f432d0, i1Var.currentAccount);
        }
        int iMax = Math.max(arrayList3.size(), i1Var.I0.f412b);
        f1 f1Var = i1Var.f447t0;
        if (f1Var != null) {
            f1Var.g(iMax, false);
            i1Var.f447t0.setBagePosition(iMax / i1Var.I0.f413c);
            f1 f1Var2 = i1Var.f447t0;
            f1Var2.D = true;
            f1Var2.requestLayout();
        }
    }

    public static void S(i1 i1Var) {
        int i10 = i1Var.f432d0;
        HashSet hashSet = i1Var.f448u0;
        int i11 = 1;
        int i12 = 0;
        if (i1Var.f434f0) {
            org.telegram.ui.ActionBar.n2 n2Var = i1Var.G0;
            if (n2Var == null) {
                return;
            }
            org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
            l2Var.f23619a = true;
            n2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
        } else if (i10 == 19 || i10 == 32 || i1Var.y1()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = i1Var.Y;
            if (canApplyBoost.canApply) {
                i1Var.A0.f647r.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = i1Var.Y;
                if (canApplyBoost2.alreadyActive && canApplyBoost2.boostedNow) {
                    AndroidUtilities.runOnUIThread(new g0(i1Var, i11), canApplyBoost2.needSelector ? 300L : 0L);
                    return;
                }
                return;
            }
            if (canApplyBoost.alreadyActive && cg.q0.i() && !i1Var.Y.isMaxLvl) {
                cg.r.i(i1Var.W, i1Var);
                return;
            } else {
                i1Var.dismiss();
                return;
            }
        }
        if (i10 == 11 || i10 == 34) {
            if (hashSet.isEmpty()) {
                i1Var.dismiss();
                return;
            } else {
                i1Var.E1(null);
                return;
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        if (i10 == 2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                i1Var.f433e0.add((TLRPC.Chat) it.next());
            }
            i1Var.D1(arrayList);
            return;
        }
        if (i10 == 5) {
            TLRPC.User user = MessagesController.getInstance(i1Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(i1Var.currentAccount).getClientUserId()));
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList2.add((TLRPC.Chat) it2.next());
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i1Var.getContext(), 0, i1Var.resourcesProvider);
            String pluralString = LocaleController.formatPluralString("LeaveCommunities", arrayList2.size(), new Object[0]);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = pluralString;
            if (arrayList2.size() == 1) {
                b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList2.get(0)).title));
            } else {
                b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0]));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new l0(i1Var, arrayList2, user, i12));
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(g6.v0(g6.f23284q7, i1Var.resourcesProvider));
            }
        }
    }

    public static void U(i1 i1Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
            ArrayList arrayList = new ArrayList();
            int iMin = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
            for (int i10 = 0; i10 < iMin; i10++) {
                TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i10);
                int currentTime = (ConnectionsManager.getInstance(i1Var.currentAccount).getCurrentTime() - tL_messages_inactiveChats.dates.get(i10).intValue()) / 86400;
                String pluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                if (ChatObject.isMegagroup(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), pluralString));
                } else if (ChatObject.isChannel(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, pluralString));
                } else {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), pluralString));
                }
            }
            AndroidUtilities.runOnUIThread(new k0(i1Var, arrayList, iMin, tL_messages_inactiveChats, 0));
        }
    }

    public static void V(i1 i1Var, Context context) {
        org.telegram.ui.ActionBar.n2 n2Var = i1Var.G0;
        int i10 = i1Var.f432d0;
        if (i10 == 11 || i10 == 34) {
            return;
        }
        int i11 = 0;
        if (i10 != 19 && i10 != 32 && !i1Var.y1()) {
            if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35) {
                AndroidUtilities.addToClipboard(i1Var.p1());
                i1Var.dismiss();
                return;
            }
            if (UserConfig.getInstance(i1Var.currentAccount).isPremium() || MessagesController.getInstance(i1Var.currentAccount).premiumFeaturesBlocked() || i1Var.J0) {
                i1Var.dismiss();
                return;
            } else {
                if (n2Var == null) {
                    return;
                }
                if (n2Var.getVisibleDialog() != null) {
                    n2Var.getVisibleDialog().dismiss();
                }
                n2Var.presentFragment(new PremiumPreviewFragment(0, A1(i10)));
                i1Var.dismiss();
                return;
            }
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = i1Var.Y;
        if (canApplyBoost.empty) {
            if (UserConfig.getInstance(i1Var.currentAccount).isPremium() && cg.q0.i()) {
                cg.r.i(i1Var.W, i1Var);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, i1Var.resourcesProvider);
            String string = LocaleController.getString(R.string.PremiumNeeded);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string;
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(i1Var.x1() ? R.string.PremiumNeededForBoostingGroup : R.string.PremiumNeededForBoosting));
            alertDialog$Builder.k(LocaleController.getString(R.string.CheckPhoneNumberYes), new i0(i1Var, i11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new a9.m(4));
            alertDialog$Builder.o();
            return;
        }
        boolean z10 = canApplyBoost.canApply;
        int i12 = 1;
        if (z10 && canApplyBoost.replaceDialogId == 0) {
            if (!canApplyBoost.needSelector || !cg.q0.i()) {
                i1Var.n1();
                return;
            }
            i1Var.f430b0 = true;
            i1Var.f447t0.W = false;
            org.telegram.ui.ActionBar.n2 n2Var2 = i1Var.f31855n;
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = i1Var.Y;
            cg.z1 z1Var = new cg.z1(n2Var2, canApplyBoost2.myBoosts, canApplyBoost2.currentChat);
            z1Var.show();
            z1Var.setOnHideListener(new j0(i1Var, i11));
            return;
        }
        if (!z10) {
            int i13 = canApplyBoost.floodWait;
            if (i13 != 0) {
                cg.r.g(i13);
                return;
            }
            return;
        }
        FrameLayout frameLayout = new FrameLayout(i1Var.getContext());
        n9 n9Var = new n9(i1Var.getContext());
        n9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(n9Var, z5.c(60.0f, 60));
        frameLayout.setClipChildren(false);
        Paint paint = new Paint(1);
        paint.setColor(g6.w0(null, g6.f23124h5, false));
        frameLayout.addView(new t0(i1Var.getContext(), paint, i1Var.getContext().getDrawable(R.drawable.filled_limit_boost)), z5.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(i1Var.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(g6.w0(null, g6.f23215m6, false));
        frameLayout.addView(imageView, z5.e(24, 24, 17));
        n9 n9Var2 = new n9(i1Var.getContext());
        n9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(n9Var2, z5.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(i1Var.getContext());
        frameLayout2.addView(frameLayout, z5.e(-2, 60, 1));
        frameLayout2.setClipChildren(false);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(g6.w0(null, g6.f23161j5, false));
        textView.setTextSize(1, 16.0f);
        frameLayout2.addView(textView, z5.t(-1, -2, 0, 24, 80, 24, 0));
        y8 y8Var = new y8((c6) null);
        TLRPC.Chat chat = MessagesController.getInstance(i1Var.currentAccount).getChat(Long.valueOf(-i1Var.Y.replaceDialogId));
        y8Var.k(i1Var.currentAccount, chat);
        n9Var.e(chat, y8Var);
        y8 y8Var2 = new y8((c6) null);
        TLRPC.Chat chat2 = MessagesController.getInstance(i1Var.currentAccount).getChat(Long.valueOf(-i1Var.W));
        y8Var2.k(i1Var.currentAccount, chat2);
        n9Var2.e(chat2, y8Var2);
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
        alertDialog$Builder2.n(frameLayout2);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Replace), new i0(i1Var, i12));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new a9.m(5));
        alertDialog$Builder2.o();
    }

    public static void W(i1 i1Var, View view) {
        int i10;
        HashSet hashSet = i1Var.f448u0;
        if (view instanceof org.telegram.ui.Cells.n) {
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            if (hashSet.contains(currentChannel)) {
                hashSet.remove(currentChannel);
            } else {
                hashSet.add(currentChannel);
            }
            nVar.f24701r.a(hashSet.contains(currentChannel), true);
            i1Var.K1();
            return;
        }
        if (view instanceof d4) {
            if (i1Var.U || !((i10 = i1Var.f432d0) == 11 || i10 == 34)) {
                d4 d4Var = (d4) view;
                Object object = d4Var.getObject();
                if (!d4Var.K) {
                    if (hashSet.contains(object)) {
                        hashSet.remove(object);
                    } else {
                        hashSet.add(object);
                    }
                    d4Var.c(hashSet.contains(object), true);
                    i1Var.K1();
                    return;
                }
                if (object instanceof TLRPC.User) {
                    long j10 = ((TLRPC.User) object).f22527id;
                    int i11 = -i1Var.P0;
                    i1Var.P0 = i11;
                    AndroidUtilities.shakeViewSpring(d4Var, i11);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    String forcedFirstName = j10 >= 0 ? UserObject.getForcedFirstName(MessagesController.getInstance(i1Var.currentAccount).getUser(Long.valueOf(j10))) : "";
                    (MessagesController.getInstance(i1Var.currentAccount).premiumFeaturesBlocked() ? new mc((FrameLayout) i1Var.containerView, i1Var.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName))) : new mc((FrameLayout) i1Var.containerView, i1Var.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new g0(i1Var, 0))).j();
                }
            }
        }
    }

    public static h1 u1(int i10, int i11) {
        h1 h1Var = new h1();
        h1Var.f411a = 0;
        h1Var.d = null;
        h1Var.f414e = null;
        h1Var.f415f = null;
        h1Var.f412b = 0;
        h1Var.f413c = 0;
        if (i10 == 0) {
            h1Var.f412b = MessagesController.getInstance(i11).dialogFiltersPinnedLimitDefault;
            h1Var.f413c = MessagesController.getInstance(i11).dialogFiltersPinnedLimitPremium;
            h1Var.f411a = R.drawable.msg_limit_pin;
            h1Var.d = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(h1Var.f412b), Integer.valueOf(h1Var.f413c));
            h1Var.f414e = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(h1Var.f413c));
            h1Var.f415f = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(h1Var.f412b));
            return h1Var;
        }
        if (i10 == 33) {
            h1Var.f412b = MessagesController.getInstance(i11).savedDialogsPinnedLimitDefault;
            h1Var.f413c = MessagesController.getInstance(i11).savedDialogsPinnedLimitPremium;
            h1Var.f411a = R.drawable.msg_limit_pin;
            h1Var.d = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(h1Var.f412b), Integer.valueOf(h1Var.f413c));
            h1Var.f414e = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(h1Var.f413c));
            h1Var.f415f = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(h1Var.f412b));
            return h1Var;
        }
        if (i10 == 2) {
            h1Var.f412b = MessagesController.getInstance(i11).publicLinksLimitDefault;
            h1Var.f413c = MessagesController.getInstance(i11).publicLinksLimitPremium;
            h1Var.f411a = R.drawable.msg_limit_links;
            h1Var.d = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(h1Var.f412b), Integer.valueOf(h1Var.f413c));
            h1Var.f414e = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(h1Var.f413c));
            h1Var.f415f = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(h1Var.f412b));
            return h1Var;
        }
        if (i10 == 12) {
            h1Var.f412b = MessagesController.getInstance(i11).chatlistInvitesLimitDefault;
            h1Var.f413c = MessagesController.getInstance(i11).chatlistInvitesLimitPremium;
            h1Var.f411a = R.drawable.msg_limit_links;
            h1Var.d = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(h1Var.f412b), Integer.valueOf(h1Var.f413c));
            h1Var.f414e = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(h1Var.f413c));
            h1Var.f415f = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(h1Var.f412b));
            return h1Var;
        }
        if (i10 == 13) {
            h1Var.f412b = MessagesController.getInstance(i11).chatlistJoinedLimitDefault;
            h1Var.f413c = MessagesController.getInstance(i11).chatlistJoinedLimitPremium;
            h1Var.f411a = R.drawable.msg_limit_folder;
            h1Var.d = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(h1Var.f412b), Integer.valueOf(h1Var.f413c));
            h1Var.f414e = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(h1Var.f413c));
            h1Var.f415f = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(h1Var.f412b));
            return h1Var;
        }
        if (i10 == 3) {
            h1Var.f412b = MessagesController.getInstance(i11).dialogFiltersLimitDefault;
            h1Var.f413c = MessagesController.getInstance(i11).dialogFiltersLimitPremium;
            h1Var.f411a = R.drawable.msg_limit_folder;
            h1Var.d = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(h1Var.f412b), Integer.valueOf(h1Var.f413c));
            h1Var.f414e = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(h1Var.f413c));
            h1Var.f415f = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(h1Var.f412b));
            return h1Var;
        }
        if (i10 == 4) {
            h1Var.f412b = MessagesController.getInstance(i11).dialogFiltersChatsLimitDefault;
            h1Var.f413c = MessagesController.getInstance(i11).dialogFiltersChatsLimitPremium;
            h1Var.f411a = R.drawable.msg_limit_chats;
            h1Var.d = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(h1Var.f412b), Integer.valueOf(h1Var.f413c));
            h1Var.f414e = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(h1Var.f413c));
            h1Var.f415f = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(h1Var.f412b));
            return h1Var;
        }
        if (i10 == 5) {
            h1Var.f412b = MessagesController.getInstance(i11).channelsLimitDefault;
            h1Var.f413c = MessagesController.getInstance(i11).channelsLimitPremium;
            h1Var.f411a = R.drawable.msg_limit_groups;
            h1Var.d = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(h1Var.f412b), Integer.valueOf(h1Var.f413c));
            h1Var.f414e = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(h1Var.f413c));
            h1Var.f415f = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(h1Var.f412b));
            return h1Var;
        }
        if (i10 == 6) {
            h1Var.f412b = 100;
            h1Var.f413c = 200;
            h1Var.f411a = R.drawable.msg_limit_folder;
            h1Var.d = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            h1Var.f414e = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            h1Var.f415f = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
            return h1Var;
        }
        if (i10 == 7) {
            h1Var.f412b = 3;
            h1Var.f413c = 4;
            h1Var.f411a = R.drawable.msg_limit_accounts;
            h1Var.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(h1Var.f413c));
            h1Var.f414e = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(h1Var.f413c));
            h1Var.f415f = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(h1Var.f412b));
            return h1Var;
        }
        if (i10 == 11) {
            h1Var.f412b = 0;
            h1Var.f413c = 0;
            h1Var.f411a = R.drawable.msg_limit_links;
            h1Var.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(h1Var.f413c));
            h1Var.f414e = "";
            h1Var.f415f = "";
            return h1Var;
        }
        if (i10 == 14) {
            h1Var.f412b = MessagesController.getInstance(i11).storyExpiringLimitDefault;
            h1Var.f413c = MessagesController.getInstance(i11).storyExpiringLimitPremium;
            h1Var.f411a = R.drawable.msg_limit_stories;
            h1Var.d = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", h1Var.f412b) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", h1Var.f413c);
            h1Var.f414e = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", h1Var.f413c);
            h1Var.f415f = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", h1Var.f412b);
            return h1Var;
        }
        if (i10 == 15) {
            h1Var.f412b = MessagesController.getInstance(i11).storiesSentWeeklyLimitDefault;
            h1Var.f413c = MessagesController.getInstance(i11).storiesSentWeeklyLimitPremium;
            h1Var.f411a = R.drawable.msg_limit_stories;
            h1Var.d = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(h1Var.f412b), Integer.valueOf(h1Var.f413c));
            h1Var.f414e = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(h1Var.f413c));
            h1Var.f415f = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(h1Var.f412b));
            return h1Var;
        }
        if (i10 == 16) {
            h1Var.f412b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            h1Var.f413c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            h1Var.f411a = R.drawable.msg_limit_stories;
            h1Var.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(h1Var.f412b), Integer.valueOf(h1Var.f413c));
            h1Var.f414e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(h1Var.f413c));
            h1Var.f415f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(h1Var.f412b));
            return h1Var;
        }
        if (i10 != 18 && i10 != 32 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 25 && i10 != 30 && i10 != 35 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 19 && i10 != 21 && i10 != 26) {
            return h1Var;
        }
        h1Var.f412b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
        h1Var.f413c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
        h1Var.f411a = R.drawable.filled_limit_boost;
        h1Var.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(h1Var.f412b), Integer.valueOf(h1Var.f413c));
        h1Var.f414e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(h1Var.f413c));
        h1Var.f415f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(h1Var.f412b));
        return h1Var;
    }

    public static boolean v1(int i10) {
        return i10 == 0 || i10 == 33 || i10 == 3 || i10 == 4 || i10 == 6 || i10 == 7 || i10 == 12 || i10 == 13 || i10 == 14 || i10 == 15 || i10 == 16;
    }

    public final boolean B1() {
        String string;
        int i10 = 0;
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.X, this.Y.copy(), Long.valueOf(this.W));
        lh.d dVar = this.O0;
        if (dVar != null) {
            TLRPC.ChatFull chatFullT1 = t1();
            int iMax = Math.max(chatFullT1.boosts_unrestrict - chatFullT1.boosts_applied, 0);
            if (iMax == 0) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.groupRestrictionsUnlockedByBoosts, new Object[0]);
                dismiss();
                return false;
            }
            dVar.c(iMax, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new u0(i10));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.Z, transitionSet);
        g1 g1Var = this.Z;
        cg.b bVar = g1Var.f388c;
        int iIndexOfChild = g1Var.indexOfChild(g1Var.f387b);
        i1 i1Var = g1Var.f389e;
        if (i1Var.f429a0) {
            int iIndexOfChild2 = g1Var.indexOfChild(g1Var.d);
            g1Var.removeView(g1Var.d);
            g1Var.d.removeView(g1Var.f386a);
            g1Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(g1Var.getContext());
            g1Var.d = linearLayout;
            linearLayout.setOrientation(0);
            g1Var.d.setWeightSum(1.0f);
            g1Var.d.addView(g1Var.f386a, z5.o(-2, -2, 1.0f, 0));
            g1Var.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
            g1Var.addView(g1Var.d, iIndexOfChild2, z5.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int iIndexOfChild3 = g1Var.indexOfChild(g1Var.f386a);
            g1Var.removeView(g1Var.f386a);
            TextView textView = new TextView(g1Var.getContext());
            g1Var.f386a = textView;
            textView.setTypeface(AndroidUtilities.bold());
            g1Var.f386a.setTextSize(1, 20.0f);
            g1Var.f386a.setTextColor(g6.v0(g6.G6, i1Var.resourcesProvider));
            g1Var.f386a.setGravity(17);
            g1Var.addView(g1Var.f386a, iIndexOfChild3, z5.t(-2, -2, 1, 0, 22, 0, 0));
        }
        g1Var.removeView(g1Var.f387b);
        TextView textView2 = new TextView(g1Var.getContext());
        g1Var.f387b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = g1Var.f387b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), g1Var.f387b.getLineSpacingMultiplier() * 1.1f);
        g1Var.f387b.setGravity(1);
        g1Var.f387b.setTextColor(g6.v0(g6.G6, i1Var.resourcesProvider));
        g1Var.addView(g1Var.f387b, iIndexOfChild, z5.t(-2, -2, 1, 24, -2, 24, 17));
        this.Z.f386a.setText(r1());
        TextView textView4 = this.Z.f387b;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean zX1 = x1();
        int i11 = this.f432d0;
        if (i11 == 20) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(o1()));
        } else if (i11 == 24) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(o1()));
        } else if (i11 == 29) {
            string = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i11 == 30) {
            string = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i11 == 35) {
            string = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i11 == 25) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(zX1 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i11 == 26) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(zX1 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i11 == 27) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i11 == 28) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(zX1 ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
        } else if (i11 == 22) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(zX1 ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
        } else if (i11 == 23) {
            string = LocaleController.formatString(zX1 ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(zX1 ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
        } else {
            string = null;
        }
        if (string == null) {
            string = q1(false);
        }
        textView4.setText(AndroidUtilities.replaceTags(string));
        K1();
        f00 f00Var = this.L0;
        f00Var.c(false);
        try {
            f00Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.Z.f388c.a(this.Y.boostCount, true);
        this.d.x0(0);
        if (i11 == 32) {
            this.Z.f388c.setVisibility(8);
        }
        return true;
    }

    public final void D1(ArrayList arrayList) {
        int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        String pluralString = LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = pluralString;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.f445r0) {
                b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            } else {
                b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            }
        } else if (this.f445r0) {
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0]));
        } else {
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0]));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new h0(i10, this, arrayList));
        b2Var.show();
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(g6.v0(g6.f23284q7, this.resourcesProvider));
        }
    }

    public final void E1(HashMap map) {
        String str;
        HashMap map2 = map;
        if (TextUtils.isEmpty(this.Q0)) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.K0.f22380id);
            if (chatFull == null) {
                dismiss();
                return;
            }
            if (this.K0.username != null) {
                str = "@" + this.K0.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                if (tL_chatInviteExported == null) {
                    dismiss();
                    return;
                }
                str = tL_chatInviteExported.link;
            }
        } else {
            str = this.Q0;
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet<TLRPC.User> hashSet = this.f448u0;
        for (TLRPC.User user : hashSet) {
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(user.f22527id);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(user.f22527id));
            }
            (sendPaidMessagesStars >= 0 ? arrayList : arrayList2).add(user);
        }
        int i10 = 0;
        if (map2 == null && !arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                arrayList3.add(Long.valueOf(((TLRPC.User) obj).f22527id));
            }
            y4.c0(this.currentAccount, arrayList3, 1, new n0(this, 0));
            return;
        }
        Iterator it = hashSet.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it.next();
            long jLongValue = map2 == null ? 0L : ((Long) map2.get(Long.valueOf(user2.f22527id))).longValue();
            Iterator it2 = it;
            SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(str2, user2.f22527id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            sendMessageParamsOf.payStars = jLongValue;
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf);
            if (sendMessageParamsOf.payStars > 0) {
                z10 = true;
            }
            map2 = map;
            it = it2;
        }
        if (!z10) {
            AndroidUtilities.runOnUIThread(new g0(this, 2));
        }
        dismiss();
    }

    public final void F1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.X = tL_premium_boostsStatus;
        this.f429a0 = z10;
        M1();
    }

    @Override
    public final void G(zu0 zu0Var) {
        int i10;
        Context context = zu0Var.getContext();
        lh.d dVar = new lh.d(context, this.resourcesProvider, true);
        this.C0 = dVar;
        dVar.setFlickeringLoading(true);
        this.C0.g(LocaleController.getString(R.string.BoostBtn), false, true);
        this.C0.setOnClickListener(new e0(this, 2));
        r0 r0Var = new r0(this, context, this.resourcesProvider);
        this.A0 = r0Var;
        b6.b(r0Var, 0.02f, 1.2f);
        if (!this.f31856r && (i10 = this.f432d0) != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
            s0 s0Var = new s0(this, context, 0);
            this.H0 = s0Var;
            s0Var.setBackgroundColor(g6.v0(g6.f23124h5, this.resourcesProvider));
            zu0Var.addView(this.H0, z5.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        r0 r0Var2 = this.A0;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        zu0Var.addView(r0Var2, z5.d(-1, 48.0f, 80, f10, 0.0f, f10, 12.0f));
        int iDp = AndroidUtilities.dp(72.0f);
        zk0 zk0Var = this.d;
        zk0Var.setPadding(0, 0, 0, iDp);
        zk0Var.setClipToPadding(false);
        zk0Var.setClipChildren(false);
        zk0Var.setOnItemClickListener(new p0(this, 0));
        zk0Var.setOnItemLongClickListener(new i0(this, 2));
        this.A0.f647r.setOnClickListener(new q0(0, this, context));
        this.A0.f644e.setOnClickListener(new e0(this, 3));
        this.F0 = new gk0(zk0Var, true);
    }

    public final void G1(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.Y = canApplyBoost;
        K1();
        L1();
    }

    public final void H1(long j10) {
        this.W = j10;
        M1();
    }

    public final void I1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.K0 = chat;
        this.Q0 = str;
        this.U = !TextUtils.isEmpty(str) || ChatObject.canUserDoAdminAction(chat, 3);
        this.f451x0 = new ArrayList(arrayList);
        this.f452y0 = arrayList2;
        this.f453z0 = arrayList3;
        HashSet hashSet = this.f448u0;
        hashSet.clear();
        if (this.U) {
            ArrayList arrayList4 = this.f451x0;
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.f22527id))) {
                    hashSet.add(user);
                }
            }
        }
        M1();
        K1();
        int i11 = this.f432d0;
        if ((i11 == 11 || i11 == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.f451x0.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            r0 r0Var = this.A0;
            if (r0Var != null && r0Var.getParent() != null) {
                ((ViewGroup) this.A0.getParent()).removeView(this.A0);
            }
            s0 s0Var = this.H0;
            if (s0Var != null && s0Var.getParent() != null) {
                ((ViewGroup) this.H0.getParent()).removeView(this.H0);
            }
            zk0 zk0Var = this.d;
            if (zk0Var != null) {
                zk0Var.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void J1() {
        this.f444q0 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        int i10 = tL_premium_boostsStatus != null ? tL_premium_boostsStatus.level + 1 : 1;
        if (this.f432d0 == 31) {
            i10 = 1;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        int iMax = 10;
        if (messagesController != null) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            int iMax2 = Math.max(10, peerColors != null ? peerColors.maxLevel(x1()) : 0);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            int iMax3 = Math.max(iMax2, peerColors2 != null ? peerColors2.maxLevel(x1()) : 0);
            iMax = x1() ? Math.max(Math.max(Math.max(Math.max(Math.max(iMax3, messagesController.groupTranscribeLevelMin), messagesController.groupWallpaperLevelMin), messagesController.groupCustomWallpaperLevelMin), messagesController.groupEmojiStatusLevelMin), messagesController.groupProfileBgIconLevelMin) : Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(iMax3, messagesController.channelBgIconLevelMin), messagesController.channelProfileIconLevelMin), messagesController.channelEmojiStatusLevelMin), messagesController.channelWallpaperLevelMin), messagesController.channelCustomWallpaperLevelMin), messagesController.channelRestrictSponsoredLevelMin), messagesController.channelAutotranslationLevelMin);
        }
        ArrayList arrayList = null;
        while (i10 <= iMax) {
            boolean zX1 = x1();
            ArrayList arrayList2 = new ArrayList();
            MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
            if (messagesController2 != null) {
                if (!zX1 && i10 >= messagesController2.channelAutotranslationLevelMin) {
                    arrayList2.add(b1.a(R.drawable.menu_feature_translate, R.string.BoostFeatureAutotranslation));
                }
                b1 b1VarB = b1.b(R.drawable.menu_feature_stories, i10, "BoostFeatureStoriesPerDay");
                b1VarB.f309f = true;
                arrayList2.add(b1VarB);
                if (!zX1) {
                    b1 b1VarB2 = b1.b(R.drawable.menu_feature_reactions, i10, "BoostFeatureCustomReaction");
                    b1VarB2.f309f = true;
                    arrayList2.add(b1VarB2);
                }
                MessagesController.PeerColors peerColors3 = messagesController2.peerColors;
                int iColorsAvailable = peerColors3 != null ? peerColors3.colorsAvailable(i10, false) : 0;
                MessagesController.PeerColors peerColors4 = messagesController2.profilePeerColors;
                int iColorsAvailable2 = peerColors4 != null ? peerColors4.colorsAvailable(i10, zX1) : 0;
                if (!zX1 && iColorsAvailable > 0) {
                    arrayList2.add(b1.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
                }
                if (!zX1 && iColorsAvailable > 0) {
                    arrayList2.add(b1.b(R.drawable.menu_feature_links, iColorsAvailable, "BoostFeatureReplyColor"));
                }
                if (!zX1 && i10 >= messagesController2.channelBgIconLevelMin) {
                    arrayList2.add(b1.a(R.drawable.menu_feature_links2, R.string.BoostFeatureReplyIcon));
                }
                if (iColorsAvailable2 > 0) {
                    arrayList2.add(b1.b(R.drawable.menu_feature_color_profile, iColorsAvailable2, zX1 ? "BoostFeatureProfileColorGroup" : "BoostFeatureProfileColor"));
                }
                if (zX1 && i10 >= messagesController2.groupEmojiStickersLevelMin) {
                    arrayList2.add(b1.a(R.drawable.menu_feature_pack, R.string.BoostFeatureCustomEmojiPack));
                }
                if ((!zX1 && i10 >= messagesController2.channelProfileIconLevelMin) || (zX1 && i10 >= messagesController2.groupProfileBgIconLevelMin)) {
                    arrayList2.add(b1.a(R.drawable.menu_feature_cover, zX1 ? R.string.BoostFeatureProfileIconGroup : R.string.BoostFeatureProfileIcon));
                }
                if (zX1 && i10 >= messagesController2.groupTranscribeLevelMin) {
                    arrayList2.add(b1.a(R.drawable.menu_feature_voice, R.string.BoostFeatureVoiceToTextConversion));
                }
                if ((!zX1 && i10 >= messagesController2.channelEmojiStatusLevelMin) || (zX1 && i10 >= messagesController2.groupEmojiStatusLevelMin)) {
                    arrayList2.add(new b1(R.drawable.menu_feature_status, R.string.BoostFeatureEmojiStatuses, -1, "1000+", null));
                }
                if ((!zX1 && i10 >= messagesController2.channelWallpaperLevelMin) || (zX1 && i10 >= messagesController2.groupWallpaperLevelMin)) {
                    arrayList2.add(b1.b(R.drawable.menu_feature_wallpaper, 8, zX1 ? "BoostFeatureBackgroundGroup" : "BoostFeatureBackground"));
                }
                if ((!zX1 && i10 >= messagesController2.channelCustomWallpaperLevelMin) || (zX1 && i10 >= messagesController2.groupCustomWallpaperLevelMin)) {
                    arrayList2.add(b1.a(R.drawable.menu_feature_custombg, zX1 ? R.string.BoostFeatureCustomBackgroundGroup : R.string.BoostFeatureCustomBackground));
                }
                if (!zX1 && i10 >= messagesController2.channelRestrictSponsoredLevelMin) {
                    arrayList2.add(b1.a(R.drawable.menu_feature_noads, R.string.BoostFeatureSwitchOffAds));
                }
                Collections.reverse(arrayList2);
            }
            if (arrayList == null || arrayList.size() != arrayList2.size()) {
                ArrayList arrayList3 = this.f444q0;
                arrayList3.add(new a1(i10, arrayList3.isEmpty()));
                this.f444q0.addAll(arrayList2);
                arrayList = arrayList2;
                break;
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                b1 b1Var = (b1) arrayList.get(i11);
                b1 b1Var2 = (b1) arrayList2.get(i11);
                int i12 = b1Var.f308e;
                if (b1Var2 == null || ((!b1Var.f309f || i12 <= 2) && (b1Var.f305a != b1Var2.f305a || b1Var.f306b != b1Var2.f306b || !TextUtils.equals(b1Var.f307c, b1Var2.f307c) || !TextUtils.equals(b1Var.d, b1Var2.d) || i12 != b1Var2.f308e))) {
                    ArrayList arrayList4 = this.f444q0;
                    arrayList4.add(new a1(i10, arrayList4.isEmpty()));
                    this.f444q0.addAll(arrayList2);
                    arrayList = arrayList2;
                    break;
                    break;
                }
            }
            i10++;
        }
    }

    public final void K1() {
        if (this.f434f0) {
            this.A0.c(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i10 = this.f432d0;
        if (i10 != 19 && i10 != 32 && !y1()) {
            String pluralString = null;
            HashSet hashSet = this.f448u0;
            if (i10 != 11 && i10 != 34) {
                if (hashSet.size() <= 0) {
                    r0 r0Var = this.A0;
                    r0Var.h = false;
                    r0Var.d(true);
                    return;
                } else {
                    if (i10 == 2) {
                        pluralString = LocaleController.formatPluralString("RevokeLinks", hashSet.size(), new Object[0]);
                    } else if (i10 == 5) {
                        pluralString = LocaleController.formatPluralString("LeaveCommunities", hashSet.size(), new Object[0]);
                    }
                    this.A0.c(pluralString, true, true);
                    return;
                }
            }
            r0 r0Var2 = this.A0;
            if (r0Var2.C == null) {
                kq kqVar = new kq(r0Var2.getContext(), null);
                r0Var2.C = kqVar;
                kqVar.setGravity(3);
                kq kqVar2 = r0Var2.C;
                int i11 = g6.Oh;
                int i12 = g6.Sh;
                jq jqVar = kqVar2.f30167a;
                jqVar.v = i11;
                jqVar.f29794w = i12;
                jqVar.f29776b = 0.8f;
                r0Var2.setClipChildren(false);
                r0Var2.addView(r0Var2.C, z5.e(-1, 24, 16));
            }
            if (!this.U) {
                this.A0.c(LocaleController.getString(R.string.Close), true, true);
            } else if (hashSet.size() > 0) {
                this.A0.c(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.A0.c(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            this.A0.C.f30167a.c(hashSet.size(), true);
            this.A0.invalidate();
            return;
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.Y;
        boolean z10 = canApplyBoost.canApply;
        if ((z10 || canApplyBoost.empty) && !canApplyBoost.boostedNow && !canApplyBoost.alreadyActive) {
            if (canApplyBoost.isMaxLvl) {
                this.A0.c(LocaleController.getString(R.string.OK), true, true);
                return;
            }
            r0 r0Var3 = this.A0;
            r0Var3.h = false;
            r0Var3.d(true);
            return;
        }
        lh.d dVar = this.O0;
        if (z10) {
            if (cg.q0.i()) {
                this.A0.c(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            } else {
                this.A0.c(LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel), true, true);
            }
            this.C0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
                return;
            }
            return;
        }
        if (canApplyBoost.isMaxLvl) {
            this.C0.g(LocaleController.getString(R.string.OK), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.OK), true, true);
            }
            this.A0.c(LocaleController.getString(R.string.OK), true, true);
            return;
        }
        if (cg.q0.i()) {
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
            }
            this.C0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            this.A0.c(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            return;
        }
        if (dVar != null) {
            dVar.g(LocaleController.getString(R.string.OK), true, true);
        }
        this.C0.g(LocaleController.getString(R.string.OK), true, true);
        this.A0.c(LocaleController.getString(R.string.OK), true, true);
    }

    public final void L1() {
        String string;
        if (this.f434f0) {
            this.A0.c(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i10 = this.f432d0;
        if (i10 == 19 || i10 == 32 || y1()) {
            if (!cg.q0.i()) {
                this.A0.d.setText(LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel));
                return;
            }
            o1 o1Var = this.A0.d;
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.Y;
            if (canApplyBoost == null || !canApplyBoost.alreadyActive) {
                string = LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
            } else {
                string = LocaleController.getString(R.string.BoostingBoostAgain);
            }
            o1Var.setText(string);
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.Y;
            if (canApplyBoost2 == null || !canApplyBoost2.isMaxLvl) {
                return;
            }
            this.A0.d.setText(LocaleController.getString(R.string.OK));
            return;
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new cq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.A0.d.setText(spannableStringBuilder);
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.J0) {
            this.A0.d.setText(LocaleController.getString(R.string.OK));
            r0 r0Var = this.A0;
            r0Var.f649w.f33600p = null;
            r0Var.f651y.setVisibility(8);
            return;
        }
        this.A0.d.setText(LocaleController.getString(R.string.IncreaseLimit));
        h1 h1Var = this.I0;
        if (h1Var == null) {
            r0 r0Var2 = this.A0;
            r0Var2.f649w.f33600p = null;
            r0Var2.f651y.setVisibility(8);
            return;
        }
        int i11 = h1Var.f412b;
        int i12 = i11 + 1;
        int i13 = h1Var.f413c;
        if (i12 == i13) {
            this.A0.setIcon(R.raw.addone_icon);
            return;
        }
        if (i11 != 0 && i13 != 0) {
            float f10 = i13 / i11;
            if (f10 >= 1.6f && f10 <= 2.5f) {
                this.A0.setIcon(R.raw.double_icon);
                return;
            }
        }
        r0 r0Var3 = this.A0;
        r0Var3.f649w.f33600p = null;
        r0Var3.f651y.setVisibility(8);
    }

    public final void M1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.f437i0 = -1;
        this.f439k0 = -1;
        this.f440l0 = -1;
        this.m0 = -1;
        this.V = -1;
        this.f441n0 = -1;
        this.f443p0 = -1;
        this.f435g0 = 1;
        this.f436h0 = 0;
        int i10 = this.f432d0;
        if (i10 == 19 || i10 == 18 || i10 == 20 || i10 == 24 || i10 == 27 || i10 == 28 || i10 == 22 || i10 == 23 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 21 || i10 == 30 || i10 == 35) {
            if (i10 != 19 || ChatObject.hasAdminRights(s1())) {
                this.v = 0.24f;
                int i11 = this.f435g0;
                this.f435g0 = i11 + 1;
                this.V = i11;
                if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable) {
                    int i12 = this.f435g0;
                    this.f435g0 = i12 + 1;
                    this.f442o0 = i12;
                }
            }
            J1();
            int i13 = this.f435g0;
            int i14 = i13 + 1;
            this.f435g0 = i14;
            this.f443p0 = i13;
            this.f435g0 = (this.f444q0.size() - 1) + i14;
        } else if (i10 == 31 || i10 == 32) {
            this.v = 0.24f;
            J1();
            int i15 = this.f435g0;
            this.f439k0 = i15;
            int i16 = i15 + 1;
            this.f435g0 = i16;
            this.f443p0 = i15;
            int size = (this.f444q0.size() - 1) + i16;
            this.f435g0 = size;
            this.f440l0 = size;
        } else if (!v1(i10)) {
            if (i10 == 11 || i10 == 34) {
                this.v = 0.24f;
            } else {
                int i17 = this.f435g0;
                this.f437i0 = i17;
                this.f435g0 = i17 + 2;
                this.f438j0 = i17 + 1;
            }
            if (this.E0) {
                int i18 = this.f435g0;
                this.f435g0 = i18 + 1;
                this.m0 = i18;
            } else if (i10 != 11 || this.U) {
                if (i10 != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.f453z0) == null || arrayList.isEmpty()) && ((arrayList2 = this.f452y0) == null || arrayList2.size() < this.f451x0.size())) || (arrayList3 = this.f453z0) == null || arrayList3.size() != 1 || (arrayList4 = this.f452y0) == null || arrayList4.size() != 1 || !this.U)) {
                    int i19 = this.f435g0;
                    this.f439k0 = i19;
                    if (i10 == 11 || i10 == 34) {
                        this.f435g0 = this.f451x0.size() + i19;
                    } else if (i10 == 5) {
                        this.f435g0 = this.f449v0.size() + i19;
                    } else {
                        this.f435g0 = this.f433e0.size() + i19;
                    }
                    this.f440l0 = this.f435g0;
                }
                if (this.f440l0 - this.f439k0 > 1) {
                    int i20 = this.f435g0;
                    this.f435g0 = i20 + 1;
                    this.f441n0 = i20;
                }
            }
        }
        this.d.getAdapter().l();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFullT1;
        if (i10 != NotificationCenter.boostByChannelCreated) {
            if (i10 != NotificationCenter.boostedChannelByUser) {
                if (i10 == NotificationCenter.didStartedMultiGiftsSelector) {
                    dismiss();
                    return;
                }
                return;
            }
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int iIntValue = ((Integer) objArr[1]).intValue();
            int iIntValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus == null || this.Y == null) {
                return;
            }
            this.X.boosts += iIntValue;
            if (this.f432d0 == 32 && (chatFullT1 = t1()) != null) {
                chatFullT1.boosts_applied += iIntValue;
            }
            z1();
            F1(tL_premium_boostsStatus, this.f429a0);
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.Y;
            canApplyBoost.isMaxLvl = this.X.next_level_boosts <= 0;
            canApplyBoost.boostedNow = true;
            canApplyBoost.setMyBoosts(tL_premium_myBoosts);
            if (B1()) {
                ec ecVarQ = new mc(this.container, this.resourcesProvider).Q(R.raw.ic_boosts_replace, 30, LocaleController.formatPluralString("BoostingReassignedFromPlural", iIntValue, LocaleController.formatPluralString("BoostingFromOtherChannel", iIntValue2, new Object[0])));
                ecVarQ.f28020j = 4000;
                ecVarQ.k(true);
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        org.telegram.ui.ActionBar.n2 n2Var = this.f31855n;
        org.telegram.ui.ActionBar.n2 lastFragment = n2Var.getParentLayout().getLastFragment();
        org.telegram.ui.ActionBar.n2 n2Var2 = null;
        if (lastFragment instanceof ig.s) {
            List fragmentStack = n2Var.getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.n2 n2Var3 = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.n2) i0.a.j(2, fragmentStack) : null;
            org.telegram.ui.ActionBar.n2 n2Var4 = fragmentStack.size() >= 3 ? (org.telegram.ui.ActionBar.n2) i0.a.j(3, fragmentStack) : null;
            n2Var2 = fragmentStack.size() >= 4 ? (org.telegram.ui.ActionBar.n2) i0.a.j(4, fragmentStack) : null;
            if (n2Var3 instanceof jo) {
                ((ActionBarLayout) n2Var.getParentLayout()).a0(n2Var3, false);
            }
            dismiss();
            if (!zBooleanValue) {
                lastFragment.finishFragment();
                cg.r.f(n2Var4, chat, false);
                return;
            } else {
                if (n2Var4 instanceof ProfileActivity) {
                    ((ActionBarLayout) n2Var.getParentLayout()).a0(n2Var4, false);
                }
                lastFragment.finishFragment();
                cg.r.f(n2Var2, chat, true);
                return;
            }
        }
        if ((lastFragment instanceof rn) && zBooleanValue) {
            cg.r.f(lastFragment, chat, true);
            return;
        }
        if ((lastFragment instanceof xc) && zBooleanValue) {
            List fragmentStack2 = n2Var.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                org.telegram.ui.ActionBar.n2 n2Var5 = (org.telegram.ui.ActionBar.n2) fragmentStack2.get(size);
                if ((n2Var5 instanceof rn) || (n2Var5 instanceof gy)) {
                    n2Var2 = n2Var5;
                    break;
                }
                arrayList.add(n2Var5);
            }
            if (n2Var2 == null) {
                return;
            }
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ((ActionBarLayout) n2Var.getParentLayout()).a0((org.telegram.ui.ActionBar.n2) obj, false);
            }
            n2Var.finishFragment();
            dismiss();
            cg.r.f(n2Var2, chat, true);
            return;
        }
        if (!zBooleanValue) {
            sb sbVar = sb.B2;
            if (sbVar == null || !sbVar.d) {
                dismiss();
                cg.r.f(LaunchActivity.R(), chat, false);
                return;
            }
            rn rnVarR9 = rn.R9(-chat.f22380id);
            LaunchActivity.R().presentFragment(rnVarR9, false, false);
            sb.x();
            dismiss();
            cg.r.f(rnVarR9, chat, false);
            return;
        }
        sb sbVar2 = sb.B2;
        if (sbVar2 != null && sbVar2.d) {
            rn rnVarR10 = rn.R9(-chat.f22380id);
            LaunchActivity.R().presentFragment(rnVarR10, false, false);
            sb.x();
            dismiss();
            cg.r.f(rnVarR10, chat, true);
            return;
        }
        List fragmentStack3 = n2Var.getParentLayout().getFragmentStack();
        n2Var2 = fragmentStack3.size() >= 2 ? (org.telegram.ui.ActionBar.n2) i0.a.j(2, fragmentStack3) : null;
        n2Var.finishFragment();
        dismiss();
        if (n2Var2 instanceof rn) {
            cg.r.f(n2Var2, chat, true);
        }
    }

    public final void m1(final s80 s80Var, boolean z10) {
        if (!s80Var.b() || z10) {
            s80Var.setLoading(true);
            ChannelBoostsController boostsController = MessagesController.getInstance(this.currentAccount).getBoostsController();
            long j10 = this.W;
            int i10 = this.Y.slot;
            final int i11 = 0;
            Utilities.Callback<TL_stories.TL_premium_myBoosts> callback = new Utilities.Callback(this) {

                public final i1 f558b;

                {
                    this.f558b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            i1 i1Var = this.f558b;
                            MessagesController.getInstance(i1Var.currentAccount).getBoostsController().getBoostsStats(i1Var.W, new o0(i1Var, s80Var, (TL_stories.TL_premium_myBoosts) obj, 0));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean zStartsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            s80 s80Var2 = s80Var;
                            if (zStartsWith) {
                                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (iIntValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new a1.e(5, this.f558b, s80Var2), ((long) iIntValue) * 1000);
                                } else {
                                    cg.r.g(iIntValue);
                                }
                            }
                            s80Var2.setLoading(false);
                            break;
                    }
                }
            };
            final int i12 = 1;
            boostsController.applyBoost(j10, i10, callback, new Utilities.Callback(this) {

                public final i1 f558b;

                {
                    this.f558b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            i1 i1Var = this.f558b;
                            MessagesController.getInstance(i1Var.currentAccount).getBoostsController().getBoostsStats(i1Var.W, new o0(i1Var, s80Var, (TL_stories.TL_premium_myBoosts) obj, 0));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean zStartsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            s80 s80Var2 = s80Var;
                            if (zStartsWith) {
                                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (iIntValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new a1.e(5, this.f558b, s80Var2), ((long) iIntValue) * 1000);
                                } else {
                                    cg.r.g(iIntValue);
                                }
                            }
                            s80Var2.setLoading(false);
                            break;
                    }
                }
            });
        }
    }

    public final void n1() {
        if (this.C0.isAttachedToWindow()) {
            m1(this.C0, false);
            return;
        }
        lh.d dVar = this.O0;
        if (dVar == null || !dVar.isAttachedToWindow()) {
            m1(this.A0, false);
        } else {
            m1(dVar, false);
        }
    }

    public int o1() {
        return 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    public final String p1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.X.boost_url;
        }
        int i10 = this.currentAccount;
        long j10 = -this.W;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        if (TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
            return a9.p.l(j10, "https://t.me/boost/?c=");
        }
        return "https://t.me/boost/" + ChatObject.getPublicUsername(chat);
    }

    public final String q1(boolean z10) {
        String string;
        if (this.f432d0 == 32) {
            TLRPC.Chat chatS1 = s1();
            TLRPC.ChatFull chatFullT1 = t1();
            return LocaleController.formatPluralString("BoostingRemoveRestrictionsSubtitle", Math.max(chatFullT1.boosts_unrestrict - chatFullT1.boosts_applied, 0), chatS1 == null ? "" : chatS1.title);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W));
        if (chat == null) {
            string = LocaleController.getString(x1() ? R.string.AccDescrGroup : R.string.AccDescrChannel);
        } else {
            string = chat.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        boolean z11 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (y1() && this.X.next_level_boosts != 0 && z10) {
            int i10 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X;
            int i11 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i10, string, LocaleController.formatPluralString("MoreBoosts", i11, Integer.valueOf(i11)));
        }
        if (z11 && this.Y.alreadyActive) {
            if (this.X.level == 1) {
                return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevel1 : R.string.ChannelBoostsJustReachedLevel1, new Object[0]);
            }
            return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.X.level), LocaleController.formatPluralString("BoostStories", this.X.level, new Object[0]));
        }
        if (this.Y.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.X;
            if (tL_premium_boostsStatus3.level == 0) {
                int i12 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.X;
                int i13 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i12, string, LocaleController.formatPluralString("MoreBoosts", i13, Integer.valueOf(i13)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.X.level), LocaleController.formatPluralString("BoostStories", this.X.level + 1, new Object[0]));
            }
            int i14 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.X;
            int i15 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return LocaleController.formatString(i14, string, LocaleController.formatPluralString("MoreBoosts", i15, Integer.valueOf(i15)));
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.X;
        if (tL_premium_boostsStatus6.level == 0) {
            int i16 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.X;
            int i17 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return LocaleController.formatString(i16, string, LocaleController.formatPluralString("MoreBoosts", i17, Integer.valueOf(i17)));
        }
        if (tL_premium_boostsStatus6.next_level_boosts == 0) {
            return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.X.level), LocaleController.formatPluralString("BoostStories", this.X.level + 1, new Object[0]));
        }
        int i18 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.X;
        int i19 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
        return LocaleController.formatString(i18, string, LocaleController.formatPluralString("MoreBoosts", i19, Integer.valueOf(i19)));
    }

    public final String r1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.Y.alreadyActive) {
            return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        boolean z10 = this.f429a0;
        int i10 = this.f432d0;
        if (!z10) {
            if (i10 == 32) {
                return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
            }
            if (this.Y.alreadyActive) {
                return LocaleController.getString(x1() ? R.string.YouBoostedGroup : R.string.YouBoostedChannel);
            }
            return LocaleController.getString(x1() ? R.string.BoostingEnableStoriesForGroup : R.string.BoostingEnableStoriesForChannel);
        }
        if (i10 == 32) {
            return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W));
        if (this.Y.alreadyActive) {
            return LocaleController.formatString("YouBoostedChannel2", R.string.YouBoostedChannel2, chat.title);
        }
        return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
    }

    public final TLRPC.Chat s1() {
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W));
    }

    public final TLRPC.ChatFull t1() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.W);
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        return new z0(this);
    }

    public final boolean w1() {
        int i10 = this.f432d0;
        return i10 == 19 || i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 27 || i10 == 28 || i10 == 23 || i10 == 30 || i10 == 35;
    }

    public final boolean x1() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W)));
    }

    public final boolean y1() {
        return w1() && ChatObject.hasAdminRights(s1());
    }

    @Override
    public final CharSequence z() {
        int i10 = this.f432d0;
        if (i10 == 11) {
            return LocaleController.getString(R.string.ChannelInviteViaLink2);
        }
        if (i10 == 34) {
            return LocaleController.getString(R.string.CallInviteViaLink);
        }
        if (i10 == 35) {
            return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
        }
        switch (i10) {
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
            case 19:
            case 30:
                return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
            case 31:
                return LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle);
            case 32:
                return LocaleController.getString(R.string.BoostGroup);
            default:
                return LocaleController.getString(R.string.LimitReached);
        }
    }

    public final void z1() {
        f1 f1Var = this.f447t0;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        int i10 = tL_premium_boostsStatus.boosts;
        int i11 = tL_premium_boostsStatus.current_level_boosts;
        int i12 = tL_premium_boostsStatus.next_level_boosts - i11;
        f1Var.f26445b++;
        f1Var.f26443a = h7.n.a((i10 - i11) / i12, 0.0f, 1.0f);
        f1Var.S = true;
        f1Var.T = f1Var.f26455n;
        f1Var.g(i10, true);
        f1Var.E.requestLayout();
        f1Var.requestLayout();
    }
}
