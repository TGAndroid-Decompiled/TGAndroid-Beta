package fg;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k7.c6;
import k7.e6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
import org.telegram.ui.po;
import org.telegram.ui.py;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import qh.ba;
public class v0 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public static final int S0 = 0;
    public ArrayList A0;
    public g0 B0;
    public final TextView C0;
    public qh.d D0;
    public Runnable E0;
    public boolean F0;
    public zk0 G0;
    public final org.telegram.ui.ActionBar.p2 H0;
    public h0 I0;
    public androidx.emoji2.text.p J0;
    public boolean K0;
    public TLRPC.Chat L0;
    public final s00 M0;
    public Runnable N0;
    public int O0;
    public final qh.d P0;
    public int Q0;
    public String R0;
    public int U;
    public boolean V;
    public int W;
    public long X;
    public TL_stories.TL_premium_boostsStatus Y;
    public ChannelBoostsController.CanApplyBoost Z;
    public u0 f6581a0;
    public boolean f6582b0;
    public boolean f6583c0;
    public org.telegram.ui.Cells.t1 f6584d0;
    public final int f6585e0;
    public final ArrayList f6586f0;
    public boolean f6587g0;
    public int f6588h0;
    public int f6589i0;
    public int f6590j0;
    public int f6591k0;
    public int f6592l0;
    public int m0;
    public int f6593n0;
    public int f6594o0;
    public int f6595p0;
    public int f6596q0;
    public ArrayList f6597r0;
    public boolean f6598s0;
    public int f6599t0;
    public t0 f6600u0;
    public final HashSet f6601v0;
    public final ArrayList f6602w0;
    public final ArrayList f6603x0;
    public ArrayList f6604y0;
    public ArrayList f6605z0;

    public v0(int i10, int i11, Context context, org.telegram.ui.ActionBar.p2 p2Var, g6 g6Var) {
        super(context, p2Var, false, v1(i10), false, 1, g6Var);
        this.W = -1;
        this.f6583c0 = false;
        this.f6586f0 = new ArrayList();
        this.f6589i0 = -1;
        this.f6590j0 = -1;
        this.f6591k0 = -1;
        this.f6592l0 = -1;
        this.m0 = -1;
        this.f6593n0 = -1;
        this.f6594o0 = -1;
        this.f6595p0 = -1;
        this.f6596q0 = -1;
        this.f6599t0 = -1;
        this.f6601v0 = new HashSet();
        this.f6602w0 = new ArrayList();
        this.f6603x0 = new ArrayList();
        this.f6604y0 = new ArrayList();
        this.f6605z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.F0 = false;
        this.O0 = 0;
        this.Q0 = -4;
        fixNavigationBar(k6.v0(k6.f21733h5, this.resourcesProvider));
        this.H0 = p2Var;
        this.currentAccount = i11;
        this.f6585e0 = i10;
        N();
        M1();
        if (i10 == 2) {
            this.F0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new a0(this, 0));
        } else if (i10 == 5) {
            this.F0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new a0(this, 2));
        }
        L1();
        if (i10 == 32 || w1()) {
            s00 s00Var = new s00(getContext());
            this.M0 = s00Var;
            this.container.addView(s00Var, c6.c(-1.0f, -1));
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35 || i10 == 31) {
            ((ViewGroup) this.B0.getParent()).removeView(this.B0);
            h0 h0Var = this.I0;
            if (h0Var != null) {
                ((ViewGroup) h0Var.getParent()).removeView(this.I0);
            }
            this.d.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.C0 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(this.B0.getTextView().getText());
            textView.setTextColor(k6.v0(k6.Sh, g6Var));
            textView.setOnClickListener(new z(this, 0));
            int dp = AndroidUtilities.dp(8.0f);
            int v02 = k6.v0(k6.Oh, g6Var);
            int k10 = i0.a.k(k6.v0(k6.f21661d6, g6Var), 120);
            textView.setBackground(k6.i0(dp, dp, dp, dp, v02, k10, k10));
        }
        if (i10 == 32) {
            ((ViewGroup) this.B0.getParent()).removeView(this.B0);
            qh.d dVar = new qh.d(context, g6Var, true);
            this.P0 = dVar;
            dVar.k();
            dVar.g(LocaleController.getString(R.string.BoostGroup), false, true);
            dVar.setOnClickListener(new z(this, 1));
            this.containerView.addView(dVar, c6.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.containerView.post(new b0(this, 3));
        }
        if (i10 != 19 && i10 != 18) {
            return;
        }
        this.containerView.post(new b0(this, 4));
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

    public static void C1(org.telegram.ui.ActionBar.p2 p2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j10, boolean z4) {
        if (tL_premium_boostsStatus != null && canApplyBoost != null && p2Var.getContext() != null) {
            v0 v0Var = new v0(32, p2Var.getCurrentAccount(), p2Var.getContext(), p2Var, p2Var.getResourceProvider());
            v0Var.G1(canApplyBoost);
            v0Var.F1(tL_premium_boostsStatus, true);
            v0Var.H1(j10);
            if (z4) {
                p2Var.showDialog(v0Var);
            } else {
                v0Var.show();
            }
        }
    }

    public static void P(v0 v0Var, ArrayList arrayList, TLRPC.User user) {
        v0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
            MessagesController.getInstance(v0Var.currentAccount).putChat(chat, false);
            MessagesController.getInstance(v0Var.currentAccount).deleteParticipantFromChat(chat.f20845id, user);
        }
    }

    public static void Q(v0 v0Var, ArrayList arrayList) {
        v0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
            tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) arrayList.get(i10));
            tL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(v0Var.currentAccount).sendRequest(tL_channels_updateUsername, new a0(v0Var, 1), 64);
        }
    }

    public static void R(v0 v0Var, ArrayList arrayList, int i10, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        int i11;
        sl0 sl0Var = v0Var.d;
        ArrayList arrayList2 = v0Var.f6603x0;
        arrayList2.clear();
        ArrayList arrayList3 = v0Var.f6602w0;
        arrayList3.clear();
        arrayList2.addAll(arrayList);
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList3.add(tL_messages_inactiveChats.chats.get(i12));
        }
        v0Var.F0 = false;
        v0Var.G0.b(v0Var.f6591k0 + 4);
        int i13 = 0;
        while (true) {
            if (i13 < sl0Var.getChildCount()) {
                if (sl0Var.getChildAt(i13) instanceof u0) {
                    i11 = sl0Var.getChildAt(i13).getTop();
                    break;
                }
                i13++;
            } else {
                i11 = 0;
                break;
            }
        }
        v0Var.M1();
        if (v0Var.f6589i0 >= 0 && i11 != 0) {
            ((f2.j0) sl0Var.getLayoutManager()).h1(v0Var.f6589i0 + 1, i11);
        }
        if (v0Var.J0 == null) {
            v0Var.J0 = u1(v0Var.f6585e0, v0Var.currentAccount);
        }
        int max = Math.max(arrayList3.size(), v0Var.J0.f848b);
        t0 t0Var = v0Var.f6600u0;
        if (t0Var != null) {
            t0Var.g(max, false);
            v0Var.f6600u0.setBagePosition(max / v0Var.J0.f849c);
            t0 t0Var2 = v0Var.f6600u0;
            t0Var2.E = true;
            t0Var2.requestLayout();
        }
    }

    public static g6 R0(v0 v0Var) {
        return v0Var.resourcesProvider;
    }

    public static void S(v0 v0Var) {
        long j10;
        int i10 = v0Var.f6585e0;
        HashSet hashSet = v0Var.f6601v0;
        if (v0Var.f6587g0) {
            org.telegram.ui.ActionBar.p2 p2Var = v0Var.H0;
            if (p2Var != 0) {
                ?? obj = new Object();
                obj.f22158a = true;
                p2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), obj);
            } else {
                return;
            }
        } else if (i10 == 19 || i10 == 32 || v0Var.y1()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = v0Var.Z;
            if (canApplyBoost.canApply) {
                v0Var.B0.f6250r.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = v0Var.Z;
                if (canApplyBoost2.alreadyActive && canApplyBoost2.boostedNow) {
                    b0 b0Var = new b0(v0Var, 1);
                    if (canApplyBoost2.needSelector) {
                        j10 = 300;
                    } else {
                        j10 = 0;
                    }
                    AndroidUtilities.runOnUIThread(b0Var, j10);
                    return;
                }
                return;
            } else if (canApplyBoost.alreadyActive && hg.p0.i() && !v0Var.Z.isMaxLvl) {
                hg.r.i(v0Var.X, v0Var);
                return;
            } else {
                v0Var.dismiss();
                return;
            }
        }
        if (i10 != 11 && i10 != 34) {
            if (!hashSet.isEmpty()) {
                if (i10 == 2) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        v0Var.f6586f0.add((TLRPC.Chat) it.next());
                    }
                    v0Var.D1(arrayList);
                } else if (i10 == 5) {
                    TLRPC.User user = MessagesController.getInstance(v0Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(v0Var.currentAccount).getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((TLRPC.Chat) it2.next());
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v0Var.getContext(), 0, v0Var.resourcesProvider);
                    String formatPluralString = LocaleController.formatPluralString("LeaveCommunities", arrayList2.size(), new Object[0]);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.O = formatPluralString;
                    if (arrayList2.size() == 1) {
                        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList2.get(0)).title));
                    } else {
                        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0]));
                    }
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new androidx.car.app.utils.a(v0Var, arrayList2, user, 7));
                    d2Var.show();
                    TextView textView = (TextView) d2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(k6.v0(k6.f21897q7, v0Var.resourcesProvider));
                    }
                }
            }
        } else if (hashSet.isEmpty()) {
            v0Var.dismiss();
        } else {
            v0Var.E1(null);
        }
    }

    public static void U(v0 v0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        String formatPluralString;
        if (tL_error == null) {
            TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
            ArrayList arrayList = new ArrayList();
            int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
            for (int i10 = 0; i10 < min; i10++) {
                TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i10);
                int currentTime = (ConnectionsManager.getInstance(v0Var.currentAccount).getCurrentTime() - tL_messages_inactiveChats.dates.get(i10).intValue()) / 86400;
                if (currentTime < 30) {
                    formatPluralString = LocaleController.formatPluralString("Days", currentTime, new Object[0]);
                } else if (currentTime < 365) {
                    formatPluralString = LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                }
                if (ChatObject.isMegagroup(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                } else if (ChatObject.isChannel(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                } else {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                }
            }
            AndroidUtilities.runOnUIThread(new dg.u1(v0Var, arrayList, min, tL_messages_inactiveChats));
        }
    }

    public static void V(v0 v0Var, Context context) {
        int i10;
        org.telegram.ui.ActionBar.p2 p2Var = v0Var.H0;
        int i11 = v0Var.f6585e0;
        if (i11 != 11 && i11 != 34) {
            if (i11 != 19 && i11 != 32 && !v0Var.y1()) {
                if (i11 != 18 && i11 != 20 && i11 != 24 && i11 != 25 && i11 != 26 && i11 != 29 && i11 != 22 && i11 != 23 && i11 != 21 && i11 != 27 && i11 != 28 && i11 != 30 && i11 != 35) {
                    if (!UserConfig.getInstance(v0Var.currentAccount).isPremium() && !MessagesController.getInstance(v0Var.currentAccount).premiumFeaturesBlocked() && !v0Var.K0) {
                        if (p2Var != null) {
                            if (p2Var.getVisibleDialog() != null) {
                                p2Var.getVisibleDialog().dismiss();
                            }
                            p2Var.presentFragment(new PremiumPreviewFragment(0, A1(i11)));
                            v0Var.dismiss();
                            return;
                        }
                        return;
                    }
                    v0Var.dismiss();
                    return;
                }
                AndroidUtilities.addToClipboard(v0Var.p1());
                v0Var.dismiss();
                return;
            }
            ChannelBoostsController.CanApplyBoost canApplyBoost = v0Var.Z;
            if (canApplyBoost.empty) {
                if (UserConfig.getInstance(v0Var.currentAccount).isPremium() && hg.p0.i()) {
                    hg.r.i(v0Var.X, v0Var);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, v0Var.resourcesProvider);
                String string = LocaleController.getString(R.string.PremiumNeeded);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                d2Var.O = string;
                if (v0Var.x1()) {
                    i10 = R.string.PremiumNeededForBoostingGroup;
                } else {
                    i10 = R.string.PremiumNeededForBoosting;
                }
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.getString(i10));
                alertDialog$Builder.k(LocaleController.getString(R.string.CheckPhoneNumberYes), new c0(v0Var, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new f5.u(2));
                alertDialog$Builder.o();
                return;
            }
            boolean z4 = canApplyBoost.canApply;
            if (z4 && canApplyBoost.replaceDialogId == 0) {
                if (canApplyBoost.needSelector && hg.p0.i()) {
                    v0Var.f6583c0 = true;
                    v0Var.f6600u0.f24947a0 = false;
                    org.telegram.ui.ActionBar.p2 p2Var2 = v0Var.f31017n;
                    ChannelBoostsController.CanApplyBoost canApplyBoost2 = v0Var.Z;
                    hg.w1 w1Var = new hg.w1(p2Var2, canApplyBoost2.myBoosts, canApplyBoost2.currentChat);
                    w1Var.show();
                    w1Var.setOnHideListener(new d0(v0Var, 0));
                    return;
                }
                v0Var.n1();
            } else if (z4) {
                FrameLayout frameLayout = new FrameLayout(v0Var.getContext());
                p9 p9Var = new p9(v0Var.getContext());
                p9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(p9Var, c6.c(60.0f, 60));
                frameLayout.setClipChildren(false);
                Paint paint = new Paint(1);
                paint.setColor(k6.w0(null, k6.f21733h5, false));
                frameLayout.addView(new i0(v0Var.getContext(), paint, v0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), c6.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(v0Var.getContext());
                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                imageView.setColorFilter(k6.w0(null, k6.f21823m6, false));
                frameLayout.addView(imageView, c6.e(24, 24, 17));
                p9 p9Var2 = new p9(v0Var.getContext());
                p9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(p9Var2, c6.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout2 = new FrameLayout(v0Var.getContext());
                frameLayout2.addView(frameLayout, c6.e(-2, 60, 1));
                frameLayout2.setClipChildren(false);
                TextView textView = new TextView(context);
                textView.setLetterSpacing(0.025f);
                textView.setTextColor(k6.w0(null, k6.f21768j5, false));
                textView.setTextSize(1, 16.0f);
                frameLayout2.addView(textView, c6.t(-1, -2, 0, 24, 80, 24, 0));
                z8 z8Var = new z8((g6) null);
                TLRPC.Chat chat = MessagesController.getInstance(v0Var.currentAccount).getChat(Long.valueOf(-v0Var.Z.replaceDialogId));
                z8Var.k(v0Var.currentAccount, chat);
                p9Var.e(chat, z8Var);
                z8 z8Var2 = new z8((g6) null);
                TLRPC.Chat chat2 = MessagesController.getInstance(v0Var.currentAccount).getChat(Long.valueOf(-v0Var.X));
                z8Var2.k(v0Var.currentAccount, chat2);
                p9Var2.e(chat2, z8Var2);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                alertDialog$Builder2.n(frameLayout2);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
                alertDialog$Builder2.k(LocaleController.getString(R.string.Replace), new c0(v0Var, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new f5.u(3));
                alertDialog$Builder2.o();
            } else {
                int i12 = canApplyBoost.floodWait;
                if (i12 != 0) {
                    hg.r.g(i12);
                }
            }
        }
    }

    public static void W(v0 v0Var, View view) {
        String str;
        ic J;
        int i10;
        HashSet hashSet = v0Var.f6601v0;
        if (view instanceof org.telegram.ui.Cells.n) {
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            if (hashSet.contains(currentChannel)) {
                hashSet.remove(currentChannel);
            } else {
                hashSet.add(currentChannel);
            }
            nVar.f23190r.a(hashSet.contains(currentChannel), true);
            v0Var.K1();
        } else if (view instanceof g4) {
            if (v0Var.V || ((i10 = v0Var.f6585e0) != 11 && i10 != 34)) {
                g4 g4Var = (g4) view;
                Object object = g4Var.getObject();
                if (g4Var.L) {
                    if (object instanceof TLRPC.User) {
                        long j10 = ((TLRPC.User) object).f20992id;
                        int i11 = -v0Var.Q0;
                        v0Var.Q0 = i11;
                        AndroidUtilities.shakeViewSpring(g4Var, i11);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j10 >= 0) {
                            str = UserObject.getForcedFirstName(MessagesController.getInstance(v0Var.currentAccount).getUser(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(v0Var.currentAccount).premiumFeaturesBlocked()) {
                            J = new qc((FrameLayout) v0Var.containerView, v0Var.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = new qc((FrameLayout) v0Var.containerView, v0Var.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new b0(v0Var, 0));
                        }
                        J.j();
                        return;
                    }
                    return;
                }
                if (hashSet.contains(object)) {
                    hashSet.remove(object);
                } else {
                    hashSet.add(object);
                }
                g4Var.c(hashSet.contains(object), true);
                v0Var.K1();
            }
        }
    }

    public static g6 i1(v0 v0Var) {
        return v0Var.resourcesProvider;
    }

    public static androidx.emoji2.text.p u1(int i10, int i11) {
        ?? obj = new Object();
        obj.f847a = 0;
        obj.d = null;
        obj.f850e = null;
        obj.f851f = null;
        obj.f848b = 0;
        obj.f849c = 0;
        if (i10 == 0) {
            obj.f848b = MessagesController.getInstance(i11).dialogFiltersPinnedLimitDefault;
            obj.f849c = MessagesController.getInstance(i11).dialogFiltersPinnedLimitPremium;
            obj.f847a = R.drawable.msg_limit_pin;
            obj.d = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(obj.f848b), Integer.valueOf(obj.f849c));
            obj.f850e = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(obj.f849c));
            obj.f851f = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(obj.f848b));
            return obj;
        } else if (i10 == 33) {
            obj.f848b = MessagesController.getInstance(i11).savedDialogsPinnedLimitDefault;
            obj.f849c = MessagesController.getInstance(i11).savedDialogsPinnedLimitPremium;
            obj.f847a = R.drawable.msg_limit_pin;
            obj.d = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(obj.f848b), Integer.valueOf(obj.f849c));
            obj.f850e = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(obj.f849c));
            obj.f851f = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(obj.f848b));
            return obj;
        } else if (i10 == 2) {
            obj.f848b = MessagesController.getInstance(i11).publicLinksLimitDefault;
            obj.f849c = MessagesController.getInstance(i11).publicLinksLimitPremium;
            obj.f847a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(obj.f848b), Integer.valueOf(obj.f849c));
            obj.f850e = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(obj.f849c));
            obj.f851f = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(obj.f848b));
            return obj;
        } else if (i10 == 12) {
            obj.f848b = MessagesController.getInstance(i11).chatlistInvitesLimitDefault;
            obj.f849c = MessagesController.getInstance(i11).chatlistInvitesLimitPremium;
            obj.f847a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(obj.f848b), Integer.valueOf(obj.f849c));
            obj.f850e = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(obj.f849c));
            obj.f851f = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(obj.f848b));
            return obj;
        } else if (i10 == 13) {
            obj.f848b = MessagesController.getInstance(i11).chatlistJoinedLimitDefault;
            obj.f849c = MessagesController.getInstance(i11).chatlistJoinedLimitPremium;
            obj.f847a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(obj.f848b), Integer.valueOf(obj.f849c));
            obj.f850e = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(obj.f849c));
            obj.f851f = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(obj.f848b));
            return obj;
        } else if (i10 == 3) {
            obj.f848b = MessagesController.getInstance(i11).dialogFiltersLimitDefault;
            obj.f849c = MessagesController.getInstance(i11).dialogFiltersLimitPremium;
            obj.f847a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(obj.f848b), Integer.valueOf(obj.f849c));
            obj.f850e = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(obj.f849c));
            obj.f851f = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(obj.f848b));
            return obj;
        } else if (i10 == 4) {
            obj.f848b = MessagesController.getInstance(i11).dialogFiltersChatsLimitDefault;
            obj.f849c = MessagesController.getInstance(i11).dialogFiltersChatsLimitPremium;
            obj.f847a = R.drawable.msg_limit_chats;
            obj.d = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(obj.f848b), Integer.valueOf(obj.f849c));
            obj.f850e = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(obj.f849c));
            obj.f851f = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(obj.f848b));
            return obj;
        } else if (i10 == 5) {
            obj.f848b = MessagesController.getInstance(i11).channelsLimitDefault;
            obj.f849c = MessagesController.getInstance(i11).channelsLimitPremium;
            obj.f847a = R.drawable.msg_limit_groups;
            obj.d = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(obj.f848b), Integer.valueOf(obj.f849c));
            obj.f850e = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(obj.f849c));
            obj.f851f = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(obj.f848b));
            return obj;
        } else if (i10 == 6) {
            obj.f848b = 100;
            obj.f849c = 200;
            obj.f847a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            obj.f850e = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            obj.f851f = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
            return obj;
        } else if (i10 == 7) {
            obj.f848b = 3;
            obj.f849c = 4;
            obj.f847a = R.drawable.msg_limit_accounts;
            obj.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(obj.f849c));
            obj.f850e = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(obj.f849c));
            obj.f851f = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(obj.f848b));
            return obj;
        } else if (i10 == 11) {
            obj.f848b = 0;
            obj.f849c = 0;
            obj.f847a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(obj.f849c));
            obj.f850e = "";
            obj.f851f = "";
            return obj;
        } else if (i10 == 14) {
            obj.f848b = MessagesController.getInstance(i11).storyExpiringLimitDefault;
            obj.f849c = MessagesController.getInstance(i11).storyExpiringLimitPremium;
            obj.f847a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", obj.f848b) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", obj.f849c);
            obj.f850e = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", obj.f849c);
            obj.f851f = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", obj.f848b);
            return obj;
        } else if (i10 == 15) {
            obj.f848b = MessagesController.getInstance(i11).storiesSentWeeklyLimitDefault;
            obj.f849c = MessagesController.getInstance(i11).storiesSentWeeklyLimitPremium;
            obj.f847a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(obj.f848b), Integer.valueOf(obj.f849c));
            obj.f850e = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(obj.f849c));
            obj.f851f = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(obj.f848b));
            return obj;
        } else if (i10 == 16) {
            obj.f848b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            obj.f849c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            obj.f847a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(obj.f848b), Integer.valueOf(obj.f849c));
            obj.f850e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f849c));
            obj.f851f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f848b));
            return obj;
        } else if (i10 != 18 && i10 != 32 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 25 && i10 != 30 && i10 != 35 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 19 && i10 != 21 && i10 != 26) {
            return obj;
        } else {
            obj.f848b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            obj.f849c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            obj.f847a = R.drawable.filled_limit_boost;
            obj.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(obj.f848b), Integer.valueOf(obj.f849c));
            obj.f850e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f849c));
            obj.f851f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f848b));
            return obj;
        }
    }

    public static boolean v1(int i10) {
        if (i10 != 0 && i10 != 33 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 12 && i10 != 13 && i10 != 14 && i10 != 15 && i10 != 16) {
            return false;
        }
        return true;
    }

    public final boolean B1() {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.Y, this.Z.copy(), Long.valueOf(this.X));
        qh.d dVar = this.P0;
        if (dVar != null) {
            TLRPC.ChatFull t12 = t1();
            int max = Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0);
            if (max == 0) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.groupRestrictionsUnlockedByBoosts, new Object[0]);
                dismiss();
                return false;
            }
            dVar.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new j0(0));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.f6581a0, transitionSet);
        u0 u0Var = this.f6581a0;
        hg.b bVar = u0Var.f6573c;
        int indexOfChild = u0Var.indexOfChild(u0Var.f6572b);
        v0 v0Var = u0Var.f6574e;
        if (v0Var.f6582b0) {
            int indexOfChild2 = u0Var.indexOfChild(u0Var.d);
            u0Var.removeView(u0Var.d);
            u0Var.d.removeView(u0Var.f6571a);
            u0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(u0Var.getContext());
            u0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            u0Var.d.setWeightSum(1.0f);
            u0Var.d.addView(u0Var.f6571a, c6.o(-2, -2, 1.0f, 0));
            u0Var.d.addView(bVar, c6.t(-2, -2, 48, 0, 2, 0, 0));
            u0Var.addView(u0Var.d, indexOfChild2, c6.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = u0Var.indexOfChild(u0Var.f6571a);
            u0Var.removeView(u0Var.f6571a);
            TextView textView = new TextView(u0Var.getContext());
            u0Var.f6571a = textView;
            textView.setTypeface(AndroidUtilities.bold());
            u0Var.f6571a.setTextSize(1, 20.0f);
            u0Var.f6571a.setTextColor(k6.v0(k6.G6, v0Var.resourcesProvider));
            u0Var.f6571a.setGravity(17);
            u0Var.addView(u0Var.f6571a, indexOfChild3, c6.t(-2, -2, 1, 0, 22, 0, 0));
        }
        u0Var.removeView(u0Var.f6572b);
        TextView textView2 = new TextView(u0Var.getContext());
        u0Var.f6572b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = u0Var.f6572b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), u0Var.f6572b.getLineSpacingMultiplier() * 1.1f);
        u0Var.f6572b.setGravity(1);
        u0Var.f6572b.setTextColor(k6.v0(k6.G6, v0Var.resourcesProvider));
        u0Var.addView(u0Var.f6572b, indexOfChild, c6.t(-2, -2, 1, 24, -2, 24, 17));
        this.f6581a0.f6571a.setText(r1());
        TextView textView4 = this.f6581a0.f6572b;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean x12 = x1();
        int i23 = this.f6585e0;
        if (i23 == 20) {
            if (x12) {
                i22 = R.string.GroupNeedBoostsForColorDescription;
            } else {
                i22 = R.string.ChannelNeedBoostsForColorDescription;
            }
            str = LocaleController.formatString(i22, Integer.valueOf(o1()));
        } else if (i23 == 24) {
            if (x12) {
                i21 = R.string.GroupNeedBoostsForProfileColorDescription;
            } else {
                i21 = R.string.ChannelNeedBoostsForProfileColorDescription;
            }
            str = LocaleController.formatString(i21, Integer.valueOf(o1()));
        } else if (i23 == 29) {
            str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i23 == 30) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i23 == 35) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i23 == 25) {
            if (x12) {
                i19 = R.string.GroupNeedBoostsForEmojiStatusDescription;
            } else {
                i19 = R.string.ChannelNeedBoostsForEmojiStatusDescription;
            }
            if (x12) {
                i20 = messagesController.groupEmojiStatusLevelMin;
            } else {
                i20 = messagesController.channelEmojiStatusLevelMin;
            }
            str = LocaleController.formatString(i19, Integer.valueOf(i20));
        } else if (i23 == 26) {
            if (x12) {
                i17 = R.string.GroupNeedBoostsForWearCollectiblesDescription;
            } else {
                i17 = R.string.ChannelNeedBoostsForWearCollectiblesDescription;
            }
            if (x12) {
                i18 = messagesController.groupEmojiStatusLevelMin;
            } else {
                i18 = messagesController.channelEmojiStatusLevelMin;
            }
            str = LocaleController.formatString(i17, Integer.valueOf(i18));
        } else if (i23 == 27) {
            if (x12) {
                i16 = R.string.GroupNeedBoostsForReplyIconDescription;
            } else {
                i16 = R.string.ChannelNeedBoostsForReplyIconDescription;
            }
            str = LocaleController.formatString(i16, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i23 == 28) {
            if (x12) {
                i14 = R.string.GroupNeedBoostsForProfileIconDescription;
            } else {
                i14 = R.string.ChannelNeedBoostsForProfileIconDescription;
            }
            if (x12) {
                i15 = messagesController.groupProfileBgIconLevelMin;
            } else {
                i15 = messagesController.channelProfileIconLevelMin;
            }
            str = LocaleController.formatString(i14, Integer.valueOf(i15));
        } else if (i23 == 22) {
            if (x12) {
                i12 = R.string.GroupNeedBoostsForWallpaperDescription;
            } else {
                i12 = R.string.ChannelNeedBoostsForWallpaperDescription;
            }
            if (x12) {
                i13 = messagesController.groupWallpaperLevelMin;
            } else {
                i13 = messagesController.channelWallpaperLevelMin;
            }
            str = LocaleController.formatString(i12, Integer.valueOf(i13));
        } else if (i23 == 23) {
            if (x12) {
                i10 = R.string.GroupNeedBoostsForCustomWallpaperDescription;
            } else {
                i10 = R.string.ChannelNeedBoostsForCustomWallpaperDescription;
            }
            if (x12) {
                i11 = messagesController.groupCustomWallpaperLevelMin;
            } else {
                i11 = messagesController.channelCustomWallpaperLevelMin;
            }
            str = LocaleController.formatString(i10, Integer.valueOf(i11));
        } else {
            str = null;
        }
        if (str == null) {
            str = q1(false);
        }
        textView4.setText(AndroidUtilities.replaceTags(str));
        K1();
        s00 s00Var = this.M0;
        s00Var.c(false);
        try {
            s00Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.f6581a0.f6573c.a(this.Z.boostCount, true);
        this.d.x0(0);
        if (i23 == 32) {
            this.f6581a0.f6573c.setVisibility(8);
        }
        return true;
    }

    public final void D1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        String formatPluralString = LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.O = formatPluralString;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.f6598s0) {
                int i10 = R.string.RevokeLinkAlertChannel;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i10, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            } else {
                int i11 = R.string.RevokeLinkAlert;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i11, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            }
        } else if (this.f6598s0) {
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0]));
        } else {
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0]));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new c1.b(11, this, arrayList));
        d2Var.show();
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(k6.v0(k6.f21897q7, this.resourcesProvider));
        }
    }

    public final void E1(HashMap hashMap) {
        String str;
        long longValue;
        ArrayList arrayList;
        HashMap hashMap2 = hashMap;
        if (!TextUtils.isEmpty(this.R0)) {
            str = this.R0;
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.L0.f20845id);
            if (chatFull == null) {
                dismiss();
                return;
            } else if (this.L0.username != null) {
                str = "@" + this.L0.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                if (tL_chatInviteExported != null) {
                    str = tL_chatInviteExported.link;
                } else {
                    dismiss();
                    return;
                }
            }
        }
        String str2 = str;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet = this.f6601v0;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(user.f20992id);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(user.f20992id));
            }
            if (sendPaidMessagesStars >= 0) {
                arrayList = arrayList2;
            } else {
                arrayList = arrayList3;
            }
            arrayList.add(user);
        }
        int i10 = 0;
        if (hashMap2 == null && !arrayList2.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                arrayList4.add(Long.valueOf(((TLRPC.User) obj).f20992id));
            }
            z4.c0(this.currentAccount, arrayList4, 1, new dg.h0(this, 5));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z4 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            if (hashMap2 == null) {
                longValue = 0;
            } else {
                longValue = ((Long) hashMap2.get(Long.valueOf(user2.f20992id))).longValue();
            }
            Iterator it3 = it2;
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str2, user2.f20992id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            of2.payStars = longValue;
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            if (of2.payStars > 0) {
                z4 = true;
            }
            hashMap2 = hashMap;
            it2 = it3;
        }
        if (!z4) {
            AndroidUtilities.runOnUIThread(new b0(this, 2));
        }
        dismiss();
    }

    @Override
    public final void F(pv0 pv0Var) {
        int i10;
        Context context = pv0Var.getContext();
        qh.d dVar = new qh.d(context, this.resourcesProvider, true);
        this.D0 = dVar;
        dVar.setFlickeringLoading(true);
        this.D0.g(LocaleController.getString(R.string.BoostBtn), false, true);
        this.D0.setOnClickListener(new z(this, 2));
        g0 g0Var = new g0(this, context, this.resourcesProvider);
        this.B0 = g0Var;
        e6.b(g0Var, 0.02f, 1.2f);
        if (!this.f31018r && (i10 = this.f6585e0) != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
            h0 h0Var = new h0(this, context, 0);
            this.I0 = h0Var;
            h0Var.setBackgroundColor(k6.v0(k6.f21733h5, this.resourcesProvider));
            pv0Var.addView(this.I0, c6.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        g0 g0Var2 = this.B0;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        pv0Var.addView(g0Var2, c6.d(-1, 48.0f, 80, f10, 0.0f, f10, 12.0f));
        int dp = AndroidUtilities.dp(72.0f);
        sl0 sl0Var = this.d;
        sl0Var.setPadding(0, 0, 0, dp);
        sl0Var.setClipToPadding(false);
        sl0Var.setClipChildren(false);
        sl0Var.setOnItemClickListener(new ag.h(this, 3));
        sl0Var.setOnItemLongClickListener(new c0(this, 2));
        this.B0.f6250r.setOnClickListener(new dg.n(3, this, context));
        this.B0.f6247e.setOnClickListener(new z(this, 3));
        this.G0 = new zk0(sl0Var, true);
    }

    public final void F1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z4) {
        this.Y = tL_premium_boostsStatus;
        this.f6582b0 = z4;
        M1();
    }

    public final void G1(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.Z = canApplyBoost;
        K1();
        L1();
    }

    public final void H1(long j10) {
        this.X = j10;
        M1();
    }

    public final void I1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        boolean z4;
        this.L0 = chat;
        this.R0 = str;
        if (TextUtils.isEmpty(str) && !ChatObject.canUserDoAdminAction(chat, 3)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.V = z4;
        this.f6604y0 = new ArrayList(arrayList);
        this.f6605z0 = arrayList2;
        this.A0 = arrayList3;
        HashSet hashSet = this.f6601v0;
        hashSet.clear();
        if (this.V) {
            ArrayList arrayList4 = this.f6604y0;
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.f20992id))) {
                    hashSet.add(user);
                }
            }
        }
        M1();
        K1();
        int i11 = this.f6585e0;
        if ((i11 == 11 || i11 == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.f6604y0.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    g0 g0Var = this.B0;
                    if (g0Var != null && g0Var.getParent() != null) {
                        ((ViewGroup) this.B0.getParent()).removeView(this.B0);
                    }
                    h0 h0Var = this.I0;
                    if (h0Var != null && h0Var.getParent() != null) {
                        ((ViewGroup) this.I0.getParent()).removeView(this.I0);
                    }
                    sl0 sl0Var = this.d;
                    if (sl0Var != null) {
                        sl0Var.setPadding(0, 0, 0, 0);
                    }
                }
            }
        }
    }

    public final void J1() {
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        String str2;
        int i15;
        int i16;
        this.f6597r0 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Y;
        if (tL_premium_boostsStatus != null) {
            i10 = tL_premium_boostsStatus.level + 1;
        } else {
            i10 = 1;
        }
        if (this.f6585e0 == 31) {
            i10 = 1;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        int i17 = 10;
        if (messagesController != null) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            if (peerColors != null) {
                i15 = peerColors.maxLevel(x1());
            } else {
                i15 = 0;
            }
            int max = Math.max(10, i15);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            if (peerColors2 != null) {
                i16 = peerColors2.maxLevel(x1());
            } else {
                i16 = 0;
            }
            int max2 = Math.max(max, i16);
            if (x1()) {
                i17 = Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.groupTranscribeLevelMin), messagesController.groupWallpaperLevelMin), messagesController.groupCustomWallpaperLevelMin), messagesController.groupEmojiStatusLevelMin), messagesController.groupProfileBgIconLevelMin);
            } else {
                i17 = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.channelBgIconLevelMin), messagesController.channelProfileIconLevelMin), messagesController.channelEmojiStatusLevelMin), messagesController.channelWallpaperLevelMin), messagesController.channelCustomWallpaperLevelMin), messagesController.channelRestrictSponsoredLevelMin), messagesController.channelAutotranslationLevelMin);
            }
        }
        ArrayList arrayList = null;
        while (i10 <= i17) {
            boolean x12 = x1();
            ArrayList arrayList2 = new ArrayList();
            MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
            if (messagesController2 != null) {
                if (!x12 && i10 >= messagesController2.channelAutotranslationLevelMin) {
                    arrayList2.add(p0.a(R.drawable.menu_feature_translate, R.string.BoostFeatureAutotranslation));
                }
                p0 b10 = p0.b(R.drawable.menu_feature_stories, i10, "BoostFeatureStoriesPerDay");
                b10.f6485f = true;
                arrayList2.add(b10);
                if (!x12) {
                    p0 b11 = p0.b(R.drawable.menu_feature_reactions, i10, "BoostFeatureCustomReaction");
                    b11.f6485f = true;
                    arrayList2.add(b11);
                }
                MessagesController.PeerColors peerColors3 = messagesController2.peerColors;
                if (peerColors3 != null) {
                    i11 = peerColors3.colorsAvailable(i10, false);
                } else {
                    i11 = 0;
                }
                MessagesController.PeerColors peerColors4 = messagesController2.profilePeerColors;
                if (peerColors4 != null) {
                    i12 = peerColors4.colorsAvailable(i10, x12);
                } else {
                    i12 = 0;
                }
                if (!x12 && i11 > 0) {
                    arrayList2.add(p0.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
                }
                if (!x12 && i11 > 0) {
                    arrayList2.add(p0.b(R.drawable.menu_feature_links, i11, "BoostFeatureReplyColor"));
                }
                if (!x12 && i10 >= messagesController2.channelBgIconLevelMin) {
                    arrayList2.add(p0.a(R.drawable.menu_feature_links2, R.string.BoostFeatureReplyIcon));
                }
                if (i12 > 0) {
                    int i18 = R.drawable.menu_feature_color_profile;
                    if (x12) {
                        str2 = "BoostFeatureProfileColorGroup";
                    } else {
                        str2 = "BoostFeatureProfileColor";
                    }
                    arrayList2.add(p0.b(i18, i12, str2));
                }
                if (x12 && i10 >= messagesController2.groupEmojiStickersLevelMin) {
                    arrayList2.add(p0.a(R.drawable.menu_feature_pack, R.string.BoostFeatureCustomEmojiPack));
                }
                if ((!x12 && i10 >= messagesController2.channelProfileIconLevelMin) || (x12 && i10 >= messagesController2.groupProfileBgIconLevelMin)) {
                    int i19 = R.drawable.menu_feature_cover;
                    if (x12) {
                        i14 = R.string.BoostFeatureProfileIconGroup;
                    } else {
                        i14 = R.string.BoostFeatureProfileIcon;
                    }
                    arrayList2.add(p0.a(i19, i14));
                }
                if (x12 && i10 >= messagesController2.groupTranscribeLevelMin) {
                    arrayList2.add(p0.a(R.drawable.menu_feature_voice, R.string.BoostFeatureVoiceToTextConversion));
                }
                if ((!x12 && i10 >= messagesController2.channelEmojiStatusLevelMin) || (x12 && i10 >= messagesController2.groupEmojiStatusLevelMin)) {
                    arrayList2.add(new p0(R.drawable.menu_feature_status, R.string.BoostFeatureEmojiStatuses, -1, "1000+", null));
                }
                if ((!x12 && i10 >= messagesController2.channelWallpaperLevelMin) || (x12 && i10 >= messagesController2.groupWallpaperLevelMin)) {
                    int i20 = R.drawable.menu_feature_wallpaper;
                    if (x12) {
                        str = "BoostFeatureBackgroundGroup";
                    } else {
                        str = "BoostFeatureBackground";
                    }
                    arrayList2.add(p0.b(i20, 8, str));
                }
                if ((!x12 && i10 >= messagesController2.channelCustomWallpaperLevelMin) || (x12 && i10 >= messagesController2.groupCustomWallpaperLevelMin)) {
                    int i21 = R.drawable.menu_feature_custombg;
                    if (x12) {
                        i13 = R.string.BoostFeatureCustomBackgroundGroup;
                    } else {
                        i13 = R.string.BoostFeatureCustomBackground;
                    }
                    arrayList2.add(p0.a(i21, i13));
                }
                if (!x12 && i10 >= messagesController2.channelRestrictSponsoredLevelMin) {
                    arrayList2.add(p0.a(R.drawable.menu_feature_noads, R.string.BoostFeatureSwitchOffAds));
                }
                Collections.reverse(arrayList2);
            }
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    p0 p0Var = (p0) arrayList.get(i22);
                    p0 p0Var2 = (p0) arrayList2.get(i22);
                    int i23 = p0Var.f6484e;
                    if (p0Var2 != null && ((p0Var.f6485f && i23 > 2) || (p0Var.f6481a == p0Var2.f6481a && p0Var.f6482b == p0Var2.f6482b && TextUtils.equals(p0Var.f6483c, p0Var2.f6483c) && TextUtils.equals(p0Var.d, p0Var2.d) && i23 == p0Var2.f6484e))) {
                    }
                }
                i10++;
            }
            ArrayList arrayList3 = this.f6597r0;
            arrayList3.add(new o0(i10, arrayList3.isEmpty()));
            this.f6597r0.addAll(arrayList2);
            arrayList = arrayList2;
            i10++;
        }
    }

    public final void K1() {
        int i10;
        if (this.f6587g0) {
            this.B0.c(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i11 = this.f6585e0;
        if (i11 != 19 && i11 != 32 && !y1()) {
            String str = null;
            HashSet hashSet = this.f6601v0;
            if (i11 != 11 && i11 != 34) {
                if (hashSet.size() > 0) {
                    if (i11 == 2) {
                        str = LocaleController.formatPluralString("RevokeLinks", hashSet.size(), new Object[0]);
                    } else if (i11 == 5) {
                        str = LocaleController.formatPluralString("LeaveCommunities", hashSet.size(), new Object[0]);
                    }
                    this.B0.c(str, true, true);
                    return;
                }
                g0 g0Var = this.B0;
                g0Var.h = false;
                g0Var.d(true);
                return;
            }
            g0 g0Var2 = this.B0;
            if (g0Var2.D == null) {
                wq wqVar = new wq(g0Var2.getContext(), null);
                g0Var2.D = wqVar;
                wqVar.setGravity(3);
                wq wqVar2 = g0Var2.D;
                int i12 = k6.Oh;
                int i13 = k6.Sh;
                vq vqVar = wqVar2.f32815a;
                vqVar.v = i12;
                vqVar.f32526w = i13;
                vqVar.f32508b = 0.8f;
                g0Var2.setClipChildren(false);
                g0Var2.addView(g0Var2.D, c6.e(-1, 24, 16));
            }
            if (!this.V) {
                this.B0.c(LocaleController.getString(R.string.Close), true, true);
            } else if (hashSet.size() > 0) {
                this.B0.c(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.B0.c(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            wq wqVar3 = this.B0.D;
            wqVar3.f32815a.c(hashSet.size(), true);
            this.B0.invalidate();
            return;
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.Z;
        boolean z4 = canApplyBoost.canApply;
        if ((z4 || canApplyBoost.empty) && !canApplyBoost.boostedNow && !canApplyBoost.alreadyActive) {
            if (canApplyBoost.isMaxLvl) {
                this.B0.c(LocaleController.getString(R.string.OK), true, true);
                return;
            }
            g0 g0Var3 = this.B0;
            g0Var3.h = false;
            g0Var3.d(true);
            return;
        }
        qh.d dVar = this.P0;
        if (z4) {
            if (hg.p0.i()) {
                this.B0.c(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            } else {
                g0 g0Var4 = this.B0;
                if (x1()) {
                    i10 = R.string.BoostGroup;
                } else {
                    i10 = R.string.BoostChannel;
                }
                g0Var4.c(LocaleController.getString(i10), true, true);
            }
            this.D0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
            }
        } else if (canApplyBoost.isMaxLvl) {
            this.D0.g(LocaleController.getString(R.string.OK), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.OK), true, true);
            }
            this.B0.c(LocaleController.getString(R.string.OK), true, true);
        } else if (hg.p0.i()) {
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
            }
            this.D0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            this.B0.c(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
        } else {
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.OK), true, true);
            }
            this.D0.g(LocaleController.getString(R.string.OK), true, true);
            this.B0.c(LocaleController.getString(R.string.OK), true, true);
        }
    }

    public final void L1() {
        int i10;
        int i11;
        String string;
        if (this.f6587g0) {
            this.B0.c(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i12 = this.f6585e0;
        if (i12 != 19 && i12 != 32 && !y1()) {
            if (i12 != 18 && i12 != 20 && i12 != 24 && i12 != 25 && i12 != 26 && i12 != 29 && i12 != 22 && i12 != 23 && i12 != 21 && i12 != 27 && i12 != 28 && i12 != 30 && i12 != 35) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && !this.K0) {
                    this.B0.d.setText(LocaleController.getString(R.string.IncreaseLimit));
                    androidx.emoji2.text.p pVar = this.J0;
                    if (pVar != null) {
                        int i13 = pVar.f848b;
                        int i14 = i13 + 1;
                        int i15 = pVar.f849c;
                        if (i14 == i15) {
                            this.B0.setIcon(R.raw.addone_icon);
                            return;
                        }
                        if (i13 != 0 && i15 != 0) {
                            float f10 = i15 / i13;
                            if (f10 >= 1.6f && f10 <= 2.5f) {
                                this.B0.setIcon(R.raw.double_icon);
                                return;
                            }
                        }
                        g0 g0Var = this.B0;
                        g0Var.f6252w.f32069p = null;
                        g0Var.f6254y.setVisibility(8);
                        return;
                    }
                    g0 g0Var2 = this.B0;
                    g0Var2.f6252w.f32069p = null;
                    g0Var2.f6254y.setVisibility(8);
                    return;
                }
                this.B0.d.setText(LocaleController.getString(R.string.OK));
                g0 g0Var3 = this.B0;
                g0Var3.f6252w.f32069p = null;
                g0Var3.f6254y.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new oq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.B0.d.setText(spannableStringBuilder);
        } else if (hg.p0.i()) {
            a1 a1Var = this.B0.d;
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.Z;
            if (canApplyBoost != null && canApplyBoost.alreadyActive) {
                string = LocaleController.getString(R.string.BoostingBoostAgain);
            } else {
                if (x1()) {
                    i11 = R.string.BoostGroup;
                } else {
                    i11 = R.string.BoostChannel;
                }
                string = LocaleController.getString(i11);
            }
            a1Var.setText(string);
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.Z;
            if (canApplyBoost2 != null && canApplyBoost2.isMaxLvl) {
                this.B0.d.setText(LocaleController.getString(R.string.OK));
            }
        } else {
            a1 a1Var2 = this.B0.d;
            if (x1()) {
                i10 = R.string.BoostGroup;
            } else {
                i10 = R.string.BoostChannel;
            }
            a1Var2.setText(LocaleController.getString(i10));
        }
    }

    public final void M1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.f6590j0 = -1;
        this.f6592l0 = -1;
        this.m0 = -1;
        this.f6593n0 = -1;
        this.W = -1;
        this.f6594o0 = -1;
        this.f6596q0 = -1;
        this.f6588h0 = 1;
        this.f6589i0 = 0;
        int i10 = this.f6585e0;
        if (i10 != 19 && i10 != 18 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 22 && i10 != 23 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 21 && i10 != 30 && i10 != 35) {
            if (i10 != 31 && i10 != 32) {
                if (!v1(i10)) {
                    if (i10 != 11 && i10 != 34) {
                        int i11 = this.f6588h0;
                        this.f6590j0 = i11;
                        this.f6588h0 = i11 + 2;
                        this.f6591k0 = i11 + 1;
                    } else {
                        this.v = 0.24f;
                    }
                    if (this.F0) {
                        int i12 = this.f6588h0;
                        this.f6588h0 = i12 + 1;
                        this.f6593n0 = i12;
                    } else if (i10 != 11 || this.V) {
                        if (i10 != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.A0) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6605z0) == null || arrayList2.size() < this.f6604y0.size())) || (arrayList3 = this.A0) == null || arrayList3.size() != 1 || (arrayList4 = this.f6605z0) == null || arrayList4.size() != 1 || !this.V)) {
                            int i13 = this.f6588h0;
                            this.f6592l0 = i13;
                            if (i10 != 11 && i10 != 34) {
                                if (i10 == 5) {
                                    this.f6588h0 = this.f6602w0.size() + i13;
                                } else {
                                    this.f6588h0 = this.f6586f0.size() + i13;
                                }
                            } else {
                                this.f6588h0 = this.f6604y0.size() + i13;
                            }
                            this.m0 = this.f6588h0;
                        }
                        if (this.m0 - this.f6592l0 > 1) {
                            int i14 = this.f6588h0;
                            this.f6588h0 = i14 + 1;
                            this.f6594o0 = i14;
                        }
                    }
                }
            } else {
                this.v = 0.24f;
                J1();
                int i15 = this.f6588h0;
                this.f6592l0 = i15;
                int i16 = i15 + 1;
                this.f6588h0 = i16;
                this.f6596q0 = i15;
                int size = (this.f6597r0.size() - 1) + i16;
                this.f6588h0 = size;
                this.m0 = size;
            }
        } else {
            if (i10 != 19 || ChatObject.hasAdminRights(s1())) {
                this.v = 0.24f;
                int i17 = this.f6588h0;
                this.f6588h0 = i17 + 1;
                this.W = i17;
                if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable) {
                    int i18 = this.f6588h0;
                    this.f6588h0 = i18 + 1;
                    this.f6595p0 = i18;
                }
            }
            J1();
            int i19 = this.f6588h0;
            int i20 = i19 + 1;
            this.f6588h0 = i20;
            this.f6596q0 = i19;
            this.f6588h0 = (this.f6597r0.size() - 1) + i20;
        }
        this.d.getAdapter().l();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z4;
        TLRPC.ChatFull t12;
        org.telegram.ui.ActionBar.p2 p2Var;
        org.telegram.ui.ActionBar.p2 p2Var2;
        if (i10 == NotificationCenter.boostByChannelCreated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            org.telegram.ui.ActionBar.p2 p2Var3 = this.f31017n;
            org.telegram.ui.ActionBar.p2 lastFragment = p2Var3.getParentLayout().getLastFragment();
            org.telegram.ui.ActionBar.p2 p2Var4 = null;
            if (lastFragment instanceof ng.s) {
                List fragmentStack = p2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    p2Var = (org.telegram.ui.ActionBar.p2) yh.j(2, fragmentStack);
                } else {
                    p2Var = null;
                }
                if (fragmentStack.size() >= 3) {
                    p2Var2 = (org.telegram.ui.ActionBar.p2) yh.j(3, fragmentStack);
                } else {
                    p2Var2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    p2Var4 = (org.telegram.ui.ActionBar.p2) yh.j(4, fragmentStack);
                }
                if (p2Var instanceof po) {
                    ((ActionBarLayout) p2Var3.getParentLayout()).a0(p2Var, false);
                }
                dismiss();
                if (booleanValue) {
                    if (p2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) p2Var3.getParentLayout()).a0(p2Var2, false);
                    }
                    lastFragment.finishFragment();
                    hg.r.f(p2Var4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                hg.r.f(p2Var2, chat, false);
            } else if ((lastFragment instanceof xn) && booleanValue) {
                hg.r.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof bd) && booleanValue) {
                List fragmentStack2 = p2Var3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    org.telegram.ui.ActionBar.p2 p2Var5 = (org.telegram.ui.ActionBar.p2) fragmentStack2.get(size);
                    if (!(p2Var5 instanceof xn) && !(p2Var5 instanceof py)) {
                        arrayList.add(p2Var5);
                    } else {
                        p2Var4 = p2Var5;
                        break;
                    }
                }
                if (p2Var4 != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((ActionBarLayout) p2Var3.getParentLayout()).a0((org.telegram.ui.ActionBar.p2) obj, false);
                    }
                    p2Var3.finishFragment();
                    dismiss();
                    hg.r.f(p2Var4, chat, true);
                }
            } else if (booleanValue) {
                ba baVar = ba.C2;
                if (baVar != null && baVar.d) {
                    xn R9 = xn.R9(-chat.f20845id);
                    LaunchActivity.R().presentFragment(R9, false, false);
                    ba.x();
                    dismiss();
                    hg.r.f(R9, chat, true);
                    return;
                }
                List fragmentStack3 = p2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack3.size() >= 2) {
                    p2Var4 = (org.telegram.ui.ActionBar.p2) yh.j(2, fragmentStack3);
                }
                p2Var3.finishFragment();
                dismiss();
                if (p2Var4 instanceof xn) {
                    hg.r.f(p2Var4, chat, true);
                }
            } else {
                ba baVar2 = ba.C2;
                if (baVar2 != null && baVar2.d) {
                    xn R92 = xn.R9(-chat.f20845id);
                    LaunchActivity.R().presentFragment(R92, false, false);
                    ba.x();
                    dismiss();
                    hg.r.f(R92, chat, false);
                    return;
                }
                dismiss();
                hg.r.f(LaunchActivity.R(), chat, false);
            }
        } else if (i10 == NotificationCenter.boostedChannelByUser) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus != null && this.Z != null) {
                this.Y.boosts += intValue;
                if (this.f6585e0 == 32 && (t12 = t1()) != null) {
                    t12.boosts_applied += intValue;
                }
                z1();
                F1(tL_premium_boostsStatus, this.f6582b0);
                ChannelBoostsController.CanApplyBoost canApplyBoost = this.Z;
                if (this.Y.next_level_boosts <= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                canApplyBoost.isMaxLvl = z4;
                canApplyBoost.boostedNow = true;
                canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                if (B1()) {
                    ic Q = new qc(this.container, this.resourcesProvider).Q(R.raw.ic_boosts_replace, 30, LocaleController.formatPluralString("BoostingReassignedFromPlural", intValue, LocaleController.formatPluralString("BoostingFromOtherChannel", intValue2, new Object[0])));
                    Q.f27778j = 4000;
                    Q.k(true);
                }
            }
        } else if (i10 == NotificationCenter.didStartedMultiGiftsSelector) {
            dismiss();
        }
    }

    public final void m1(final j90 j90Var, boolean z4) {
        if (j90Var.b() && !z4) {
            return;
        }
        j90Var.setLoading(true);
        MessagesController.getInstance(this.currentAccount).getBoostsController().applyBoost(this.X, this.Z.slot, new Utilities.Callback(this) {
            public final v0 f6304b;

            {
                this.f6304b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r3) {
                    case 0:
                        MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.X, new f0(this.f6304b, j90Var, (TL_stories.TL_premium_myBoosts) obj, 0));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        j90 j90Var2 = j90Var;
                        if (startsWith) {
                            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            if (intValue <= 5) {
                                AndroidUtilities.runOnUIThread(new a1.e(26, this.f6304b, j90Var2), intValue * 1000);
                                return;
                            }
                            hg.r.g(intValue);
                        }
                        j90Var2.setLoading(false);
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final v0 f6304b;

            {
                this.f6304b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r3) {
                    case 0:
                        MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.X, new f0(this.f6304b, j90Var, (TL_stories.TL_premium_myBoosts) obj, 0));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        j90 j90Var2 = j90Var;
                        if (startsWith) {
                            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            if (intValue <= 5) {
                                AndroidUtilities.runOnUIThread(new a1.e(26, this.f6304b, j90Var2), intValue * 1000);
                                return;
                            }
                            hg.r.g(intValue);
                        }
                        j90Var2.setLoading(false);
                        return;
                }
            }
        });
    }

    public final void n1() {
        if (this.D0.isAttachedToWindow()) {
            m1(this.D0, false);
            return;
        }
        qh.d dVar = this.P0;
        if (dVar != null && dVar.isAttachedToWindow()) {
            m1(dVar, false);
        } else {
            m1(this.B0, false);
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
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Y;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.Y.boost_url;
        }
        int i10 = this.currentAccount;
        long j10 = -this.X;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        if (!TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
            return "https://t.me/boost/" + ChatObject.getPublicUsername(chat);
        }
        return android.support.v4.media.a.n(j10, "https://t.me/boost/?c=");
    }

    public final String q1(boolean z4) {
        String str;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str2;
        if (this.f6585e0 == 32) {
            TLRPC.Chat s12 = s1();
            TLRPC.ChatFull t12 = t1();
            int max = Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0);
            if (s12 == null) {
                str2 = "";
            } else {
                str2 = s12.title;
            }
            return LocaleController.formatPluralString("BoostingRemoveRestrictionsSubtitle", max, str2);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.X));
        if (chat == null) {
            if (x1()) {
                i19 = R.string.AccDescrGroup;
            } else {
                i19 = R.string.AccDescrChannel;
            }
            str = LocaleController.getString(i19);
        } else {
            str = chat.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Y;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (y1() && this.Y.next_level_boosts != 0 && z4) {
            if (x1()) {
                i18 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
            } else {
                i18 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.Y;
            int i20 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i18, str, LocaleController.formatPluralString("MoreBoosts", i20, Integer.valueOf(i20)));
        } else if (z10 && this.Z.alreadyActive) {
            if (this.Y.level == 1) {
                if (x1()) {
                    i17 = R.string.GroupBoostsJustReachedLevel1;
                } else {
                    i17 = R.string.ChannelBoostsJustReachedLevel1;
                }
                return LocaleController.formatString(i17, new Object[0]);
            }
            if (x1()) {
                i16 = R.string.GroupBoostsJustReachedLevelNext;
            } else {
                i16 = R.string.ChannelBoostsJustReachedLevelNext;
            }
            return LocaleController.formatString(i16, Integer.valueOf(this.Y.level), LocaleController.formatPluralString("BoostStories", this.Y.level, new Object[0]));
        } else if (this.Z.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.Y;
            if (tL_premium_boostsStatus3.level == 0) {
                if (x1()) {
                    i15 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i15 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.Y;
                int i21 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i15, str, LocaleController.formatPluralString("MoreBoosts", i21, Integer.valueOf(i21)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (x1()) {
                    i14 = R.string.GroupBoostsJustReachedLevelNext;
                } else {
                    i14 = R.string.ChannelBoostsJustReachedLevelNext;
                }
                return LocaleController.formatString(i14, Integer.valueOf(this.Y.level), LocaleController.formatPluralString("BoostStories", this.Y.level + 1, new Object[0]));
            } else {
                if (x1()) {
                    i13 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i13 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.Y;
                int i22 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return LocaleController.formatString(i13, str, LocaleController.formatPluralString("MoreBoosts", i22, Integer.valueOf(i22)));
            }
        } else {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.Y;
            if (tL_premium_boostsStatus6.level == 0) {
                if (x1()) {
                    i12 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i12 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.Y;
                int i23 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
                return LocaleController.formatString(i12, str, LocaleController.formatPluralString("MoreBoosts", i23, Integer.valueOf(i23)));
            } else if (tL_premium_boostsStatus6.next_level_boosts == 0) {
                if (x1()) {
                    i11 = R.string.GroupBoostsJustReachedLevelNext;
                } else {
                    i11 = R.string.ChannelBoostsJustReachedLevelNext;
                }
                return LocaleController.formatString(i11, Integer.valueOf(this.Y.level), LocaleController.formatPluralString("BoostStories", this.Y.level + 1, new Object[0]));
            } else {
                if (x1()) {
                    i10 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i10 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.Y;
                int i24 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
                return LocaleController.formatString(i10, str, LocaleController.formatPluralString("MoreBoosts", i24, Integer.valueOf(i24)));
            }
        }
    }

    public final String r1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Y;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.Z.alreadyActive) {
            if (x1()) {
                i15 = R.string.BoostGroup;
            } else {
                i15 = R.string.BoostChannel;
            }
            return LocaleController.getString(i15);
        }
        boolean z4 = this.f6582b0;
        int i16 = this.f6585e0;
        if (z4) {
            if (i16 == 32) {
                if (x1()) {
                    i14 = R.string.BoostGroup;
                } else {
                    i14 = R.string.BoostChannel;
                }
                return LocaleController.getString(i14);
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.X));
            if (this.Z.alreadyActive) {
                return LocaleController.formatString("YouBoostedChannel2", R.string.YouBoostedChannel2, chat.title);
            }
            if (x1()) {
                i13 = R.string.BoostGroup;
            } else {
                i13 = R.string.BoostChannel;
            }
            return LocaleController.getString(i13);
        } else if (i16 == 32) {
            if (x1()) {
                i12 = R.string.BoostGroup;
            } else {
                i12 = R.string.BoostChannel;
            }
            return LocaleController.getString(i12);
        } else if (this.Z.alreadyActive) {
            if (x1()) {
                i11 = R.string.YouBoostedGroup;
            } else {
                i11 = R.string.YouBoostedChannel;
            }
            return LocaleController.getString(i11);
        } else {
            if (x1()) {
                i10 = R.string.BoostingEnableStoriesForGroup;
            } else {
                i10 = R.string.BoostingEnableStoriesForChannel;
            }
            return LocaleController.getString(i10);
        }
    }

    public final TLRPC.Chat s1() {
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.X));
    }

    public final TLRPC.ChatFull t1() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.X);
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        return new n0(this);
    }

    public final boolean w1() {
        int i10 = this.f6585e0;
        if (i10 != 19 && i10 != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 27 && i10 != 28 && i10 != 23 && i10 != 30 && i10 != 35) {
            return false;
        }
        return true;
    }

    public final boolean x1() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.X)));
    }

    @Override
    public final CharSequence y() {
        int i10;
        int i11 = this.f6585e0;
        if (i11 != 11) {
            if (i11 != 34) {
                if (i11 != 35) {
                    switch (i11) {
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
                            if (x1()) {
                                i10 = R.string.BoostGroup;
                            } else {
                                i10 = R.string.BoostChannel;
                            }
                            return LocaleController.getString(i10);
                        case 31:
                            return LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle);
                        case 32:
                            return LocaleController.getString(R.string.BoostGroup);
                        default:
                            return LocaleController.getString(R.string.LimitReached);
                    }
                }
                return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
            }
            return LocaleController.getString(R.string.CallInviteViaLink);
        }
        return LocaleController.getString(R.string.ChannelInviteViaLink2);
    }

    public final boolean y1() {
        if (w1() && ChatObject.hasAdminRights(s1())) {
            return true;
        }
        return false;
    }

    public final void z1() {
        int i10;
        t0 t0Var = this.f6600u0;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Y;
        int i11 = tL_premium_boostsStatus.boosts;
        int i12 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        t0Var.f24948b++;
        t0Var.f24946a = k7.o.a((i11 - i10) / i12, 0.0f, 1.0f);
        t0Var.T = true;
        t0Var.U = t0Var.f24959n;
        t0Var.g(i11, true);
        t0Var.F.requestLayout();
        t0Var.requestLayout();
    }
}
