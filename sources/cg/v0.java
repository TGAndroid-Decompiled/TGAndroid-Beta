package cg;

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
import i7.f6;
import i7.h6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import nh.gb;
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
import org.telegram.ui.Cells.e4;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fy;
import org.telegram.ui.ko;
import org.telegram.ui.tn;
import org.telegram.ui.vc;
public class v0 extends xa implements NotificationCenter.NotificationCenterDelegate {
    public static final int R0 = 0;
    public g0 A0;
    public final TextView B0;
    public nh.d C0;
    public Runnable D0;
    public boolean E0;
    public pk0 F0;
    public final org.telegram.ui.ActionBar.o2 G0;
    public h0 H0;
    public androidx.emoji2.text.o I0;
    public boolean J0;
    public TLRPC.Chat K0;
    public final n00 L0;
    public Runnable M0;
    public int N0;
    public final nh.d O0;
    public int P0;
    public String Q0;
    public int T;
    public boolean U;
    public int V;
    public long W;
    public TL_stories.TL_premium_boostsStatus X;
    public ChannelBoostsController.CanApplyBoost Y;
    public u0 Z;
    public boolean f3401a0;
    public boolean f3402b0;
    public org.telegram.ui.Cells.s1 f3403c0;
    public final int f3404d0;
    public final ArrayList f3405e0;
    public boolean f3406f0;
    public int f3407g0;
    public int f3408h0;
    public int f3409i0;
    public int f3410j0;
    public int f3411k0;
    public int f3412l0;
    public int m0;
    public int f3413n0;
    public int f3414o0;
    public int f3415p0;
    public ArrayList f3416q0;
    public boolean f3417r0;
    public int f3418s0;
    public t0 f3419t0;
    public final HashSet f3420u0;
    public final ArrayList f3421v0;
    public final ArrayList f3422w0;
    public ArrayList f3423x0;
    public ArrayList f3424y0;
    public ArrayList f3425z0;

    public v0(int i10, int i11, Context context, org.telegram.ui.ActionBar.o2 o2Var, c6 c6Var) {
        super(context, o2Var, false, v1(i10), false, 1, c6Var);
        this.V = -1;
        this.f3402b0 = false;
        this.f3405e0 = new ArrayList();
        this.f3408h0 = -1;
        this.f3409i0 = -1;
        this.f3410j0 = -1;
        this.f3411k0 = -1;
        this.f3412l0 = -1;
        this.m0 = -1;
        this.f3413n0 = -1;
        this.f3414o0 = -1;
        this.f3415p0 = -1;
        this.f3418s0 = -1;
        this.f3420u0 = new HashSet();
        this.f3421v0 = new ArrayList();
        this.f3422w0 = new ArrayList();
        this.f3423x0 = new ArrayList();
        this.f3424y0 = new ArrayList();
        this.f3425z0 = new ArrayList();
        this.E0 = false;
        this.N0 = 0;
        this.P0 = -4;
        fixNavigationBar(g6.v0(g6.f23133h5, this.resourcesProvider));
        this.G0 = o2Var;
        this.currentAccount = i11;
        this.f3404d0 = i10;
        M();
        M1();
        if (i10 == 2) {
            this.E0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new a0(this, 0));
        } else if (i10 == 5) {
            this.E0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new a0(this, 2));
        }
        L1();
        if (i10 == 32 || w1()) {
            n00 n00Var = new n00(getContext());
            this.L0 = n00Var;
            this.container.addView(n00Var, f6.c(-1.0f, -1));
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35 || i10 == 31) {
            ((ViewGroup) this.A0.getParent()).removeView(this.A0);
            h0 h0Var = this.H0;
            if (h0Var != null) {
                ((ViewGroup) h0Var.getParent()).removeView(this.H0);
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
            textView.setOnClickListener(new z(this, 0));
            int dp = AndroidUtilities.dp(8.0f);
            int v02 = g6.v0(g6.Oh, c6Var);
            int k9 = i0.a.k(g6.v0(g6.f23062d6, c6Var), 120);
            textView.setBackground(g6.i0(dp, dp, dp, dp, v02, k9, k9));
        }
        if (i10 == 32) {
            ((ViewGroup) this.A0.getParent()).removeView(this.A0);
            nh.d dVar = new nh.d(context, c6Var, true);
            this.O0 = dVar;
            dVar.k();
            dVar.g(LocaleController.getString(R.string.BoostGroup), false, true);
            dVar.setOnClickListener(new z(this, 1));
            this.containerView.addView(dVar, f6.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
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

    public static void C1(org.telegram.ui.ActionBar.o2 o2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j10, boolean z10) {
        if (tL_premium_boostsStatus != null && canApplyBoost != null && o2Var.getContext() != null) {
            v0 v0Var = new v0(32, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, o2Var.getResourceProvider());
            v0Var.G1(canApplyBoost);
            v0Var.F1(tL_premium_boostsStatus, true);
            v0Var.H1(j10);
            if (z10) {
                o2Var.showDialog(v0Var);
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
            MessagesController.getInstance(v0Var.currentAccount).deleteParticipantFromChat(chat.f22392id, user);
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
        jl0 jl0Var = v0Var.d;
        ArrayList arrayList2 = v0Var.f3422w0;
        arrayList2.clear();
        ArrayList arrayList3 = v0Var.f3421v0;
        arrayList3.clear();
        arrayList2.addAll(arrayList);
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList3.add(tL_messages_inactiveChats.chats.get(i12));
        }
        v0Var.E0 = false;
        v0Var.F0.b(v0Var.f3410j0 + 4);
        int i13 = 0;
        while (true) {
            if (i13 < jl0Var.getChildCount()) {
                if (jl0Var.getChildAt(i13) instanceof u0) {
                    i11 = jl0Var.getChildAt(i13).getTop();
                    break;
                }
                i13++;
            } else {
                i11 = 0;
                break;
            }
        }
        v0Var.M1();
        if (v0Var.f3408h0 >= 0 && i11 != 0) {
            ((f2.j0) jl0Var.getLayoutManager()).h1(v0Var.f3408h0 + 1, i11);
        }
        if (v0Var.I0 == null) {
            v0Var.I0 = u1(v0Var.f3404d0, v0Var.currentAccount);
        }
        int max = Math.max(arrayList3.size(), v0Var.I0.f1366b);
        t0 t0Var = v0Var.f3419t0;
        if (t0Var != null) {
            t0Var.g(max, false);
            v0Var.f3419t0.setBagePosition(max / v0Var.I0.f1367c);
            t0 t0Var2 = v0Var.f3419t0;
            t0Var2.D = true;
            t0Var2.requestLayout();
        }
    }

    public static c6 R0(v0 v0Var) {
        return v0Var.resourcesProvider;
    }

    public static void S(v0 v0Var) {
        long j10;
        int i10 = v0Var.f3404d0;
        HashSet hashSet = v0Var.f3420u0;
        if (v0Var.f3406f0) {
            org.telegram.ui.ActionBar.o2 o2Var = v0Var.G0;
            if (o2Var != 0) {
                ?? obj = new Object();
                obj.f23673a = true;
                o2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), obj);
            } else {
                return;
            }
        } else if (i10 == 19 || i10 == 32 || v0Var.y1()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = v0Var.Y;
            if (canApplyBoost.canApply) {
                v0Var.A0.f3095r.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = v0Var.Y;
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
            } else if (canApplyBoost.alreadyActive && eg.q0.i() && !v0Var.Y.isMaxLvl) {
                eg.s.i(v0Var.W, v0Var);
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
                        v0Var.f3405e0.add((TLRPC.Chat) it.next());
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
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.N = formatPluralString;
                    if (arrayList2.size() == 1) {
                        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList2.get(0)).title));
                    } else {
                        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0]));
                    }
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new androidx.car.app.utils.a(v0Var, arrayList2, user, 2));
                    c2Var.show();
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(g6.v0(g6.f23295q7, v0Var.resourcesProvider));
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
            AndroidUtilities.runOnUIThread(new ag.z1(v0Var, arrayList, min, tL_messages_inactiveChats));
        }
    }

    public static void V(v0 v0Var, Context context) {
        int i10;
        org.telegram.ui.ActionBar.o2 o2Var = v0Var.G0;
        int i11 = v0Var.f3404d0;
        if (i11 != 11 && i11 != 34) {
            if (i11 != 19 && i11 != 32 && !v0Var.y1()) {
                if (i11 != 18 && i11 != 20 && i11 != 24 && i11 != 25 && i11 != 26 && i11 != 29 && i11 != 22 && i11 != 23 && i11 != 21 && i11 != 27 && i11 != 28 && i11 != 30 && i11 != 35) {
                    if (!UserConfig.getInstance(v0Var.currentAccount).isPremium() && !MessagesController.getInstance(v0Var.currentAccount).premiumFeaturesBlocked() && !v0Var.J0) {
                        if (o2Var != null) {
                            if (o2Var.getVisibleDialog() != null) {
                                o2Var.getVisibleDialog().dismiss();
                            }
                            o2Var.presentFragment(new PremiumPreviewFragment(0, A1(i11)));
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
            ChannelBoostsController.CanApplyBoost canApplyBoost = v0Var.Y;
            if (canApplyBoost.empty) {
                if (UserConfig.getInstance(v0Var.currentAccount).isPremium() && eg.q0.i()) {
                    eg.s.i(v0Var.W, v0Var);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, v0Var.resourcesProvider);
                String string = LocaleController.getString(R.string.PremiumNeeded);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string;
                if (v0Var.x1()) {
                    i10 = R.string.PremiumNeededForBoostingGroup;
                } else {
                    i10 = R.string.PremiumNeededForBoosting;
                }
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(i10));
                alertDialog$Builder.k(LocaleController.getString(R.string.CheckPhoneNumberYes), new c0(v0Var, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new a9.f(20));
                alertDialog$Builder.o();
                return;
            }
            boolean z10 = canApplyBoost.canApply;
            if (z10 && canApplyBoost.replaceDialogId == 0) {
                if (canApplyBoost.needSelector && eg.q0.i()) {
                    v0Var.f3402b0 = true;
                    v0Var.f3419t0.W = false;
                    org.telegram.ui.ActionBar.o2 o2Var2 = v0Var.f34662n;
                    ChannelBoostsController.CanApplyBoost canApplyBoost2 = v0Var.Y;
                    eg.x1 x1Var = new eg.x1(o2Var2, canApplyBoost2.myBoosts, canApplyBoost2.currentChat);
                    x1Var.show();
                    x1Var.setOnHideListener(new d0(v0Var, 0));
                    return;
                }
                v0Var.n1();
            } else if (z10) {
                FrameLayout frameLayout = new FrameLayout(v0Var.getContext());
                t9 t9Var = new t9(v0Var.getContext());
                t9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(t9Var, f6.c(60.0f, 60));
                frameLayout.setClipChildren(false);
                Paint paint = new Paint(1);
                paint.setColor(g6.w0(null, g6.f23133h5, false));
                frameLayout.addView(new i0(v0Var.getContext(), paint, v0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), f6.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(v0Var.getContext());
                imageView.setImageResource(R.drawable.msg_arrow_avatar);
                imageView.setColorFilter(g6.w0(null, g6.f23223m6, false));
                frameLayout.addView(imageView, f6.e(24, 24, 17));
                t9 t9Var2 = new t9(v0Var.getContext());
                t9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
                frameLayout.addView(t9Var2, f6.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
                FrameLayout frameLayout2 = new FrameLayout(v0Var.getContext());
                frameLayout2.addView(frameLayout, f6.e(-2, 60, 1));
                frameLayout2.setClipChildren(false);
                TextView textView = new TextView(context);
                textView.setLetterSpacing(0.025f);
                textView.setTextColor(g6.w0(null, g6.f23169j5, false));
                textView.setTextSize(1, 16.0f);
                frameLayout2.addView(textView, f6.t(-1, -2, 0, 24, 80, 24, 0));
                e9 e9Var = new e9((c6) null);
                TLRPC.Chat chat = MessagesController.getInstance(v0Var.currentAccount).getChat(Long.valueOf(-v0Var.Y.replaceDialogId));
                e9Var.k(v0Var.currentAccount, chat);
                t9Var.e(chat, e9Var);
                e9 e9Var2 = new e9((c6) null);
                TLRPC.Chat chat2 = MessagesController.getInstance(v0Var.currentAccount).getChat(Long.valueOf(-v0Var.W));
                e9Var2.k(v0Var.currentAccount, chat2);
                t9Var2.e(chat2, e9Var2);
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                alertDialog$Builder2.n(frameLayout2);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
                alertDialog$Builder2.k(LocaleController.getString(R.string.Replace), new c0(v0Var, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new a9.f(21));
                alertDialog$Builder2.o();
            } else {
                int i12 = canApplyBoost.floodWait;
                if (i12 != 0) {
                    eg.s.g(i12);
                }
            }
        }
    }

    public static void W(v0 v0Var, View view) {
        String str;
        mc J;
        int i10;
        HashSet hashSet = v0Var.f3420u0;
        if (view instanceof org.telegram.ui.Cells.n) {
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            if (hashSet.contains(currentChannel)) {
                hashSet.remove(currentChannel);
            } else {
                hashSet.add(currentChannel);
            }
            nVar.f24728r.a(hashSet.contains(currentChannel), true);
            v0Var.K1();
        } else if (view instanceof e4) {
            if (v0Var.U || ((i10 = v0Var.f3404d0) != 11 && i10 != 34)) {
                e4 e4Var = (e4) view;
                Object object = e4Var.getObject();
                if (e4Var.K) {
                    if (object instanceof TLRPC.User) {
                        long j10 = ((TLRPC.User) object).f22539id;
                        int i11 = -v0Var.P0;
                        v0Var.P0 = i11;
                        AndroidUtilities.shakeViewSpring(e4Var, i11);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        if (j10 >= 0) {
                            str = UserObject.getForcedFirstName(MessagesController.getInstance(v0Var.currentAccount).getUser(Long.valueOf(j10)));
                        } else {
                            str = "";
                        }
                        if (MessagesController.getInstance(v0Var.currentAccount).premiumFeaturesBlocked()) {
                            J = new tc((FrameLayout) v0Var.containerView, v0Var.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)));
                        } else {
                            J = new tc((FrameLayout) v0Var.containerView, v0Var.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new b0(v0Var, 0));
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
                e4Var.c(hashSet.contains(object), true);
                v0Var.K1();
            }
        }
    }

    public static c6 i1(v0 v0Var) {
        return v0Var.resourcesProvider;
    }

    public static androidx.emoji2.text.o u1(int i10, int i11) {
        ?? obj = new Object();
        obj.f1365a = 0;
        obj.d = null;
        obj.f1368e = null;
        obj.f1369f = null;
        obj.f1366b = 0;
        obj.f1367c = 0;
        if (i10 == 0) {
            obj.f1366b = MessagesController.getInstance(i11).dialogFiltersPinnedLimitDefault;
            obj.f1367c = MessagesController.getInstance(i11).dialogFiltersPinnedLimitPremium;
            obj.f1365a = R.drawable.msg_limit_pin;
            obj.d = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(obj.f1366b), Integer.valueOf(obj.f1367c));
            obj.f1368e = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(obj.f1367c));
            obj.f1369f = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(obj.f1366b));
            return obj;
        } else if (i10 == 33) {
            obj.f1366b = MessagesController.getInstance(i11).savedDialogsPinnedLimitDefault;
            obj.f1367c = MessagesController.getInstance(i11).savedDialogsPinnedLimitPremium;
            obj.f1365a = R.drawable.msg_limit_pin;
            obj.d = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(obj.f1366b), Integer.valueOf(obj.f1367c));
            obj.f1368e = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(obj.f1367c));
            obj.f1369f = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(obj.f1366b));
            return obj;
        } else if (i10 == 2) {
            obj.f1366b = MessagesController.getInstance(i11).publicLinksLimitDefault;
            obj.f1367c = MessagesController.getInstance(i11).publicLinksLimitPremium;
            obj.f1365a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(obj.f1366b), Integer.valueOf(obj.f1367c));
            obj.f1368e = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(obj.f1367c));
            obj.f1369f = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(obj.f1366b));
            return obj;
        } else if (i10 == 12) {
            obj.f1366b = MessagesController.getInstance(i11).chatlistInvitesLimitDefault;
            obj.f1367c = MessagesController.getInstance(i11).chatlistInvitesLimitPremium;
            obj.f1365a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(obj.f1366b), Integer.valueOf(obj.f1367c));
            obj.f1368e = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(obj.f1367c));
            obj.f1369f = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(obj.f1366b));
            return obj;
        } else if (i10 == 13) {
            obj.f1366b = MessagesController.getInstance(i11).chatlistJoinedLimitDefault;
            obj.f1367c = MessagesController.getInstance(i11).chatlistJoinedLimitPremium;
            obj.f1365a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(obj.f1366b), Integer.valueOf(obj.f1367c));
            obj.f1368e = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(obj.f1367c));
            obj.f1369f = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(obj.f1366b));
            return obj;
        } else if (i10 == 3) {
            obj.f1366b = MessagesController.getInstance(i11).dialogFiltersLimitDefault;
            obj.f1367c = MessagesController.getInstance(i11).dialogFiltersLimitPremium;
            obj.f1365a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(obj.f1366b), Integer.valueOf(obj.f1367c));
            obj.f1368e = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(obj.f1367c));
            obj.f1369f = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(obj.f1366b));
            return obj;
        } else if (i10 == 4) {
            obj.f1366b = MessagesController.getInstance(i11).dialogFiltersChatsLimitDefault;
            obj.f1367c = MessagesController.getInstance(i11).dialogFiltersChatsLimitPremium;
            obj.f1365a = R.drawable.msg_limit_chats;
            obj.d = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(obj.f1366b), Integer.valueOf(obj.f1367c));
            obj.f1368e = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(obj.f1367c));
            obj.f1369f = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(obj.f1366b));
            return obj;
        } else if (i10 == 5) {
            obj.f1366b = MessagesController.getInstance(i11).channelsLimitDefault;
            obj.f1367c = MessagesController.getInstance(i11).channelsLimitPremium;
            obj.f1365a = R.drawable.msg_limit_groups;
            obj.d = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(obj.f1366b), Integer.valueOf(obj.f1367c));
            obj.f1368e = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(obj.f1367c));
            obj.f1369f = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(obj.f1366b));
            return obj;
        } else if (i10 == 6) {
            obj.f1366b = 100;
            obj.f1367c = 200;
            obj.f1365a = R.drawable.msg_limit_folder;
            obj.d = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            obj.f1368e = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            obj.f1369f = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
            return obj;
        } else if (i10 == 7) {
            obj.f1366b = 3;
            obj.f1367c = 4;
            obj.f1365a = R.drawable.msg_limit_accounts;
            obj.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(obj.f1367c));
            obj.f1368e = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(obj.f1367c));
            obj.f1369f = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(obj.f1366b));
            return obj;
        } else if (i10 == 11) {
            obj.f1366b = 0;
            obj.f1367c = 0;
            obj.f1365a = R.drawable.msg_limit_links;
            obj.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(obj.f1367c));
            obj.f1368e = "";
            obj.f1369f = "";
            return obj;
        } else if (i10 == 14) {
            obj.f1366b = MessagesController.getInstance(i11).storyExpiringLimitDefault;
            obj.f1367c = MessagesController.getInstance(i11).storyExpiringLimitPremium;
            obj.f1365a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", obj.f1366b) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", obj.f1367c);
            obj.f1368e = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", obj.f1367c);
            obj.f1369f = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", obj.f1366b);
            return obj;
        } else if (i10 == 15) {
            obj.f1366b = MessagesController.getInstance(i11).storiesSentWeeklyLimitDefault;
            obj.f1367c = MessagesController.getInstance(i11).storiesSentWeeklyLimitPremium;
            obj.f1365a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(obj.f1366b), Integer.valueOf(obj.f1367c));
            obj.f1368e = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(obj.f1367c));
            obj.f1369f = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(obj.f1366b));
            return obj;
        } else if (i10 == 16) {
            obj.f1366b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            obj.f1367c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            obj.f1365a = R.drawable.msg_limit_stories;
            obj.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(obj.f1366b), Integer.valueOf(obj.f1367c));
            obj.f1368e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f1367c));
            obj.f1369f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f1366b));
            return obj;
        } else if (i10 != 18 && i10 != 32 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 25 && i10 != 30 && i10 != 35 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 19 && i10 != 21 && i10 != 26) {
            return obj;
        } else {
            obj.f1366b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            obj.f1367c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            obj.f1365a = R.drawable.filled_limit_boost;
            obj.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(obj.f1366b), Integer.valueOf(obj.f1367c));
            obj.f1368e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f1367c));
            obj.f1369f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(obj.f1366b));
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
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.X, this.Y.copy(), Long.valueOf(this.W));
        nh.d dVar = this.O0;
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
        TransitionManager.beginDelayedTransition(this.Z, transitionSet);
        u0 u0Var = this.Z;
        eg.b bVar = u0Var.f3393c;
        int indexOfChild = u0Var.indexOfChild(u0Var.f3392b);
        v0 v0Var = u0Var.f3394e;
        if (v0Var.f3401a0) {
            int indexOfChild2 = u0Var.indexOfChild(u0Var.d);
            u0Var.removeView(u0Var.d);
            u0Var.d.removeView(u0Var.f3391a);
            u0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(u0Var.getContext());
            u0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            u0Var.d.setWeightSum(1.0f);
            u0Var.d.addView(u0Var.f3391a, f6.o(-2, -2, 1.0f, 0));
            u0Var.d.addView(bVar, f6.t(-2, -2, 48, 0, 2, 0, 0));
            u0Var.addView(u0Var.d, indexOfChild2, f6.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = u0Var.indexOfChild(u0Var.f3391a);
            u0Var.removeView(u0Var.f3391a);
            TextView textView = new TextView(u0Var.getContext());
            u0Var.f3391a = textView;
            textView.setTypeface(AndroidUtilities.bold());
            u0Var.f3391a.setTextSize(1, 20.0f);
            u0Var.f3391a.setTextColor(g6.v0(g6.G6, v0Var.resourcesProvider));
            u0Var.f3391a.setGravity(17);
            u0Var.addView(u0Var.f3391a, indexOfChild3, f6.t(-2, -2, 1, 0, 22, 0, 0));
        }
        u0Var.removeView(u0Var.f3392b);
        TextView textView2 = new TextView(u0Var.getContext());
        u0Var.f3392b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = u0Var.f3392b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), u0Var.f3392b.getLineSpacingMultiplier() * 1.1f);
        u0Var.f3392b.setGravity(1);
        u0Var.f3392b.setTextColor(g6.v0(g6.G6, v0Var.resourcesProvider));
        u0Var.addView(u0Var.f3392b, indexOfChild, f6.t(-2, -2, 1, 24, -2, 24, 17));
        this.Z.f3391a.setText(r1());
        TextView textView4 = this.Z.f3392b;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean x12 = x1();
        int i23 = this.f3404d0;
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
        n00 n00Var = this.L0;
        n00Var.c(false);
        try {
            n00Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.Z.f3393c.a(this.Y.boostCount, true);
        this.d.x0(0);
        if (i23 == 32) {
            this.Z.f3393c.setVisibility(8);
        }
        return true;
    }

    public final void D1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        String formatPluralString = LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = formatPluralString;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.f3417r0) {
                int i10 = R.string.RevokeLinkAlertChannel;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", i10, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            } else {
                int i11 = R.string.RevokeLinkAlert;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", i11, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            }
        } else if (this.f3417r0) {
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0]));
        } else {
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0]));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new a9.s(3, this, arrayList));
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(g6.v0(g6.f23295q7, this.resourcesProvider));
        }
    }

    public final void E1(HashMap hashMap) {
        String str;
        long longValue;
        ArrayList arrayList;
        HashMap hashMap2 = hashMap;
        if (!TextUtils.isEmpty(this.Q0)) {
            str = this.Q0;
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.K0.f22392id);
            if (chatFull == null) {
                dismiss();
                return;
            } else if (this.K0.username != null) {
                str = "@" + this.K0.username;
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
        HashSet hashSet = this.f3420u0;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(user.f22539id);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(user.f22539id));
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
                arrayList4.add(Long.valueOf(((TLRPC.User) obj).f22539id));
            }
            c5.c0(this.currentAccount, arrayList4, 1, new ag.i0(this, 5));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            if (hashMap2 == null) {
                longValue = 0;
            } else {
                longValue = ((Long) hashMap2.get(Long.valueOf(user2.f22539id))).longValue();
            }
            Iterator it3 = it2;
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str2, user2.f22539id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            of2.payStars = longValue;
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            if (of2.payStars > 0) {
                z10 = true;
            }
            hashMap2 = hashMap;
            it2 = it3;
        }
        if (!z10) {
            AndroidUtilities.runOnUIThread(new b0(this, 2));
        }
        dismiss();
    }

    @Override
    public final void F(hv0 hv0Var) {
        int i10;
        Context context = hv0Var.getContext();
        nh.d dVar = new nh.d(context, this.resourcesProvider, true);
        this.C0 = dVar;
        dVar.setFlickeringLoading(true);
        this.C0.g(LocaleController.getString(R.string.BoostBtn), false, true);
        this.C0.setOnClickListener(new z(this, 2));
        g0 g0Var = new g0(this, context, this.resourcesProvider);
        this.A0 = g0Var;
        h6.b(g0Var, 0.02f, 1.2f);
        if (!this.f34663r && (i10 = this.f3404d0) != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
            h0 h0Var = new h0(this, context, 0);
            this.H0 = h0Var;
            h0Var.setBackgroundColor(g6.v0(g6.f23133h5, this.resourcesProvider));
            hv0Var.addView(this.H0, f6.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        g0 g0Var2 = this.A0;
        float f9 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        hv0Var.addView(g0Var2, f6.d(-1, 48.0f, 80, f9, 0.0f, f9, 12.0f));
        int dp = AndroidUtilities.dp(72.0f);
        jl0 jl0Var = this.d;
        jl0Var.setPadding(0, 0, 0, dp);
        jl0Var.setClipToPadding(false);
        jl0Var.setClipChildren(false);
        jl0Var.setOnItemClickListener(new bg.o(this, 2));
        jl0Var.setOnItemLongClickListener(new c0(this, 2));
        this.A0.f3095r.setOnClickListener(new ag.n(3, this, context));
        this.A0.f3092e.setOnClickListener(new z(this, 3));
        this.F0 = new pk0(jl0Var, true);
    }

    public final void F1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.X = tL_premium_boostsStatus;
        this.f3401a0 = z10;
        M1();
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
        boolean z10;
        this.K0 = chat;
        this.Q0 = str;
        if (TextUtils.isEmpty(str) && !ChatObject.canUserDoAdminAction(chat, 3)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.U = z10;
        this.f3423x0 = new ArrayList(arrayList);
        this.f3424y0 = arrayList2;
        this.f3425z0 = arrayList3;
        HashSet hashSet = this.f3420u0;
        hashSet.clear();
        if (this.U) {
            ArrayList arrayList4 = this.f3423x0;
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.f22539id))) {
                    hashSet.add(user);
                }
            }
        }
        M1();
        K1();
        int i11 = this.f3404d0;
        if ((i11 == 11 || i11 == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.f3423x0.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    g0 g0Var = this.A0;
                    if (g0Var != null && g0Var.getParent() != null) {
                        ((ViewGroup) this.A0.getParent()).removeView(this.A0);
                    }
                    h0 h0Var = this.H0;
                    if (h0Var != null && h0Var.getParent() != null) {
                        ((ViewGroup) this.H0.getParent()).removeView(this.H0);
                    }
                    jl0 jl0Var = this.d;
                    if (jl0Var != null) {
                        jl0Var.setPadding(0, 0, 0, 0);
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
        this.f3416q0 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus != null) {
            i10 = tL_premium_boostsStatus.level + 1;
        } else {
            i10 = 1;
        }
        if (this.f3404d0 == 31) {
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
                b10.f3262f = true;
                arrayList2.add(b10);
                if (!x12) {
                    p0 b11 = p0.b(R.drawable.menu_feature_reactions, i10, "BoostFeatureCustomReaction");
                    b11.f3262f = true;
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
                    int i23 = p0Var.f3261e;
                    if (p0Var2 != null && ((p0Var.f3262f && i23 > 2) || (p0Var.f3258a == p0Var2.f3258a && p0Var.f3259b == p0Var2.f3259b && TextUtils.equals(p0Var.f3260c, p0Var2.f3260c) && TextUtils.equals(p0Var.d, p0Var2.d) && i23 == p0Var2.f3261e))) {
                    }
                }
                i10++;
            }
            ArrayList arrayList3 = this.f3416q0;
            arrayList3.add(new o0(i10, arrayList3.isEmpty()));
            this.f3416q0.addAll(arrayList2);
            arrayList = arrayList2;
            i10++;
        }
    }

    public final void K1() {
        int i10;
        if (this.f3406f0) {
            this.A0.c(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i11 = this.f3404d0;
        if (i11 != 19 && i11 != 32 && !y1()) {
            String str = null;
            HashSet hashSet = this.f3420u0;
            if (i11 != 11 && i11 != 34) {
                if (hashSet.size() > 0) {
                    if (i11 == 2) {
                        str = LocaleController.formatPluralString("RevokeLinks", hashSet.size(), new Object[0]);
                    } else if (i11 == 5) {
                        str = LocaleController.formatPluralString("LeaveCommunities", hashSet.size(), new Object[0]);
                    }
                    this.A0.c(str, true, true);
                    return;
                }
                g0 g0Var = this.A0;
                g0Var.h = false;
                g0Var.d(true);
                return;
            }
            g0 g0Var2 = this.A0;
            if (g0Var2.C == null) {
                qq qqVar = new qq(g0Var2.getContext(), null);
                g0Var2.C = qqVar;
                qqVar.setGravity(3);
                qq qqVar2 = g0Var2.C;
                int i12 = g6.Oh;
                int i13 = g6.Sh;
                pq pqVar = qqVar2.f32029a;
                pqVar.v = i12;
                pqVar.f31750w = i13;
                pqVar.f31732b = 0.8f;
                g0Var2.setClipChildren(false);
                g0Var2.addView(g0Var2.C, f6.e(-1, 24, 16));
            }
            if (!this.U) {
                this.A0.c(LocaleController.getString(R.string.Close), true, true);
            } else if (hashSet.size() > 0) {
                this.A0.c(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.A0.c(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            qq qqVar3 = this.A0.C;
            qqVar3.f32029a.c(hashSet.size(), true);
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
            g0 g0Var3 = this.A0;
            g0Var3.h = false;
            g0Var3.d(true);
            return;
        }
        nh.d dVar = this.O0;
        if (z10) {
            if (eg.q0.i()) {
                this.A0.c(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            } else {
                g0 g0Var4 = this.A0;
                if (x1()) {
                    i10 = R.string.BoostGroup;
                } else {
                    i10 = R.string.BoostChannel;
                }
                g0Var4.c(LocaleController.getString(i10), true, true);
            }
            this.C0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
            }
        } else if (canApplyBoost.isMaxLvl) {
            this.C0.g(LocaleController.getString(R.string.OK), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.OK), true, true);
            }
            this.A0.c(LocaleController.getString(R.string.OK), true, true);
        } else if (eg.q0.i()) {
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
            }
            this.C0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            this.A0.c(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
        } else {
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.OK), true, true);
            }
            this.C0.g(LocaleController.getString(R.string.OK), true, true);
            this.A0.c(LocaleController.getString(R.string.OK), true, true);
        }
    }

    public final void L1() {
        int i10;
        int i11;
        String string;
        if (this.f3406f0) {
            this.A0.c(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i12 = this.f3404d0;
        if (i12 != 19 && i12 != 32 && !y1()) {
            if (i12 != 18 && i12 != 20 && i12 != 24 && i12 != 25 && i12 != 26 && i12 != 29 && i12 != 22 && i12 != 23 && i12 != 21 && i12 != 27 && i12 != 28 && i12 != 30 && i12 != 35) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && !this.J0) {
                    this.A0.d.setText(LocaleController.getString(R.string.IncreaseLimit));
                    androidx.emoji2.text.o oVar = this.I0;
                    if (oVar != null) {
                        int i13 = oVar.f1366b;
                        int i14 = i13 + 1;
                        int i15 = oVar.f1367c;
                        if (i14 == i15) {
                            this.A0.setIcon(R.raw.addone_icon);
                            return;
                        }
                        if (i13 != 0 && i15 != 0) {
                            float f9 = i15 / i13;
                            if (f9 >= 1.6f && f9 <= 2.5f) {
                                this.A0.setIcon(R.raw.double_icon);
                                return;
                            }
                        }
                        g0 g0Var = this.A0;
                        g0Var.f3097w.f33729p = null;
                        g0Var.f3099y.setVisibility(8);
                        return;
                    }
                    g0 g0Var2 = this.A0;
                    g0Var2.f3097w.f33729p = null;
                    g0Var2.f3099y.setVisibility(8);
                    return;
                }
                this.A0.d.setText(LocaleController.getString(R.string.OK));
                g0 g0Var3 = this.A0;
                g0Var3.f3097w.f33729p = null;
                g0Var3.f3099y.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new iq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.A0.d.setText(spannableStringBuilder);
        } else if (eg.q0.i()) {
            b1 b1Var = this.A0.d;
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.Y;
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
            b1Var.setText(string);
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.Y;
            if (canApplyBoost2 != null && canApplyBoost2.isMaxLvl) {
                this.A0.d.setText(LocaleController.getString(R.string.OK));
            }
        } else {
            b1 b1Var2 = this.A0.d;
            if (x1()) {
                i10 = R.string.BoostGroup;
            } else {
                i10 = R.string.BoostChannel;
            }
            b1Var2.setText(LocaleController.getString(i10));
        }
    }

    public final void M1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.f3409i0 = -1;
        this.f3411k0 = -1;
        this.f3412l0 = -1;
        this.m0 = -1;
        this.V = -1;
        this.f3413n0 = -1;
        this.f3415p0 = -1;
        this.f3407g0 = 1;
        this.f3408h0 = 0;
        int i10 = this.f3404d0;
        if (i10 != 19 && i10 != 18 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 22 && i10 != 23 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 21 && i10 != 30 && i10 != 35) {
            if (i10 != 31 && i10 != 32) {
                if (!v1(i10)) {
                    if (i10 != 11 && i10 != 34) {
                        int i11 = this.f3407g0;
                        this.f3409i0 = i11;
                        this.f3407g0 = i11 + 2;
                        this.f3410j0 = i11 + 1;
                    } else {
                        this.v = 0.24f;
                    }
                    if (this.E0) {
                        int i12 = this.f3407g0;
                        this.f3407g0 = i12 + 1;
                        this.m0 = i12;
                    } else if (i10 != 11 || this.U) {
                        if (i10 != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.f3425z0) == null || arrayList.isEmpty()) && ((arrayList2 = this.f3424y0) == null || arrayList2.size() < this.f3423x0.size())) || (arrayList3 = this.f3425z0) == null || arrayList3.size() != 1 || (arrayList4 = this.f3424y0) == null || arrayList4.size() != 1 || !this.U)) {
                            int i13 = this.f3407g0;
                            this.f3411k0 = i13;
                            if (i10 != 11 && i10 != 34) {
                                if (i10 == 5) {
                                    this.f3407g0 = this.f3421v0.size() + i13;
                                } else {
                                    this.f3407g0 = this.f3405e0.size() + i13;
                                }
                            } else {
                                this.f3407g0 = this.f3423x0.size() + i13;
                            }
                            this.f3412l0 = this.f3407g0;
                        }
                        if (this.f3412l0 - this.f3411k0 > 1) {
                            int i14 = this.f3407g0;
                            this.f3407g0 = i14 + 1;
                            this.f3413n0 = i14;
                        }
                    }
                }
            } else {
                this.v = 0.24f;
                J1();
                int i15 = this.f3407g0;
                this.f3411k0 = i15;
                int i16 = i15 + 1;
                this.f3407g0 = i16;
                this.f3415p0 = i15;
                int size = (this.f3416q0.size() - 1) + i16;
                this.f3407g0 = size;
                this.f3412l0 = size;
            }
        } else {
            if (i10 != 19 || ChatObject.hasAdminRights(s1())) {
                this.v = 0.24f;
                int i17 = this.f3407g0;
                this.f3407g0 = i17 + 1;
                this.V = i17;
                if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable) {
                    int i18 = this.f3407g0;
                    this.f3407g0 = i18 + 1;
                    this.f3414o0 = i18;
                }
            }
            J1();
            int i19 = this.f3407g0;
            int i20 = i19 + 1;
            this.f3407g0 = i20;
            this.f3415p0 = i19;
            this.f3407g0 = (this.f3416q0.size() - 1) + i20;
        }
        this.d.getAdapter().l();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        TLRPC.ChatFull t12;
        org.telegram.ui.ActionBar.o2 o2Var;
        org.telegram.ui.ActionBar.o2 o2Var2;
        if (i10 == NotificationCenter.boostByChannelCreated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            org.telegram.ui.ActionBar.o2 o2Var3 = this.f34662n;
            org.telegram.ui.ActionBar.o2 lastFragment = o2Var3.getParentLayout().getLastFragment();
            org.telegram.ui.ActionBar.o2 o2Var4 = null;
            if (lastFragment instanceof kg.s) {
                List fragmentStack = o2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    o2Var = (org.telegram.ui.ActionBar.o2) j7.l1.j(2, fragmentStack);
                } else {
                    o2Var = null;
                }
                if (fragmentStack.size() >= 3) {
                    o2Var2 = (org.telegram.ui.ActionBar.o2) j7.l1.j(3, fragmentStack);
                } else {
                    o2Var2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    o2Var4 = (org.telegram.ui.ActionBar.o2) j7.l1.j(4, fragmentStack);
                }
                if (o2Var instanceof ko) {
                    ((ActionBarLayout) o2Var3.getParentLayout()).a0(o2Var, false);
                }
                dismiss();
                if (booleanValue) {
                    if (o2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) o2Var3.getParentLayout()).a0(o2Var2, false);
                    }
                    lastFragment.finishFragment();
                    eg.s.f(o2Var4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                eg.s.f(o2Var2, chat, false);
            } else if ((lastFragment instanceof tn) && booleanValue) {
                eg.s.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof vc) && booleanValue) {
                List fragmentStack2 = o2Var3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    org.telegram.ui.ActionBar.o2 o2Var5 = (org.telegram.ui.ActionBar.o2) fragmentStack2.get(size);
                    if (!(o2Var5 instanceof tn) && !(o2Var5 instanceof fy)) {
                        arrayList.add(o2Var5);
                    } else {
                        o2Var4 = o2Var5;
                        break;
                    }
                }
                if (o2Var4 != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((ActionBarLayout) o2Var3.getParentLayout()).a0((org.telegram.ui.ActionBar.o2) obj, false);
                    }
                    o2Var3.finishFragment();
                    dismiss();
                    eg.s.f(o2Var4, chat, true);
                }
            } else if (booleanValue) {
                gb gbVar = gb.B2;
                if (gbVar != null && gbVar.d) {
                    tn R9 = tn.R9(-chat.f22392id);
                    LaunchActivity.R().presentFragment(R9, false, false);
                    gb.x();
                    dismiss();
                    eg.s.f(R9, chat, true);
                    return;
                }
                List fragmentStack3 = o2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack3.size() >= 2) {
                    o2Var4 = (org.telegram.ui.ActionBar.o2) j7.l1.j(2, fragmentStack3);
                }
                o2Var3.finishFragment();
                dismiss();
                if (o2Var4 instanceof tn) {
                    eg.s.f(o2Var4, chat, true);
                }
            } else {
                gb gbVar2 = gb.B2;
                if (gbVar2 != null && gbVar2.d) {
                    tn R92 = tn.R9(-chat.f22392id);
                    LaunchActivity.R().presentFragment(R92, false, false);
                    gb.x();
                    dismiss();
                    eg.s.f(R92, chat, false);
                    return;
                }
                dismiss();
                eg.s.f(LaunchActivity.R(), chat, false);
            }
        } else if (i10 == NotificationCenter.boostedChannelByUser) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus != null && this.Y != null) {
                this.X.boosts += intValue;
                if (this.f3404d0 == 32 && (t12 = t1()) != null) {
                    t12.boosts_applied += intValue;
                }
                z1();
                F1(tL_premium_boostsStatus, this.f3401a0);
                ChannelBoostsController.CanApplyBoost canApplyBoost = this.Y;
                if (this.X.next_level_boosts <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                canApplyBoost.isMaxLvl = z10;
                canApplyBoost.boostedNow = true;
                canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                if (B1()) {
                    mc Q = new tc(this.container, this.resourcesProvider).Q(R.raw.ic_boosts_replace, 30, LocaleController.formatPluralString("BoostingReassignedFromPlural", intValue, LocaleController.formatPluralString("BoostingFromOtherChannel", intValue2, new Object[0])));
                    Q.f30652j = 4000;
                    Q.k(true);
                }
            }
        } else if (i10 == NotificationCenter.didStartedMultiGiftsSelector) {
            dismiss();
        }
    }

    public final void m1(final b90 b90Var, boolean z10) {
        if (b90Var.b() && !z10) {
            return;
        }
        b90Var.setLoading(true);
        MessagesController.getInstance(this.currentAccount).getBoostsController().applyBoost(this.W, this.Y.slot, new Utilities.Callback(this) {
            public final v0 f3107b;

            {
                this.f3107b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r3) {
                    case 0:
                        MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.W, new f0(this.f3107b, b90Var, (TL_stories.TL_premium_myBoosts) obj, 0));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        b90 b90Var2 = b90Var;
                        if (startsWith) {
                            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            if (intValue <= 5) {
                                AndroidUtilities.runOnUIThread(new a1.e(18, this.f3107b, b90Var2), intValue * 1000);
                                return;
                            }
                            eg.s.g(intValue);
                        }
                        b90Var2.setLoading(false);
                        return;
                }
            }
        }, new Utilities.Callback(this) {
            public final v0 f3107b;

            {
                this.f3107b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r3) {
                    case 0:
                        MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.W, new f0(this.f3107b, b90Var, (TL_stories.TL_premium_myBoosts) obj, 0));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        b90 b90Var2 = b90Var;
                        if (startsWith) {
                            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                            if (intValue <= 5) {
                                AndroidUtilities.runOnUIThread(new a1.e(18, this.f3107b, b90Var2), intValue * 1000);
                                return;
                            }
                            eg.s.g(intValue);
                        }
                        b90Var2.setLoading(false);
                        return;
                }
            }
        });
    }

    public final void n1() {
        if (this.C0.isAttachedToWindow()) {
            m1(this.C0, false);
            return;
        }
        nh.d dVar = this.O0;
        if (dVar != null && dVar.isAttachedToWindow()) {
            m1(dVar, false);
        } else {
            m1(this.A0, false);
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
        if (!TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
            return "https://t.me/boost/" + ChatObject.getPublicUsername(chat);
        }
        return a4.w.m(j10, "https://t.me/boost/?c=");
    }

    public final String q1(boolean z10) {
        String str;
        boolean z11;
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
        if (this.f3404d0 == 32) {
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
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W));
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
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (y1() && this.X.next_level_boosts != 0 && z10) {
            if (x1()) {
                i18 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
            } else {
                i18 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X;
            int i20 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i18, str, LocaleController.formatPluralString("MoreBoosts", i20, Integer.valueOf(i20)));
        } else if (z11 && this.Y.alreadyActive) {
            if (this.X.level == 1) {
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
            return LocaleController.formatString(i16, Integer.valueOf(this.X.level), LocaleController.formatPluralString("BoostStories", this.X.level, new Object[0]));
        } else if (this.Y.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.X;
            if (tL_premium_boostsStatus3.level == 0) {
                if (x1()) {
                    i15 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i15 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.X;
                int i21 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i15, str, LocaleController.formatPluralString("MoreBoosts", i21, Integer.valueOf(i21)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (x1()) {
                    i14 = R.string.GroupBoostsJustReachedLevelNext;
                } else {
                    i14 = R.string.ChannelBoostsJustReachedLevelNext;
                }
                return LocaleController.formatString(i14, Integer.valueOf(this.X.level), LocaleController.formatPluralString("BoostStories", this.X.level + 1, new Object[0]));
            } else {
                if (x1()) {
                    i13 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i13 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.X;
                int i22 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return LocaleController.formatString(i13, str, LocaleController.formatPluralString("MoreBoosts", i22, Integer.valueOf(i22)));
            }
        } else {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.X;
            if (tL_premium_boostsStatus6.level == 0) {
                if (x1()) {
                    i12 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i12 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.X;
                int i23 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
                return LocaleController.formatString(i12, str, LocaleController.formatPluralString("MoreBoosts", i23, Integer.valueOf(i23)));
            } else if (tL_premium_boostsStatus6.next_level_boosts == 0) {
                if (x1()) {
                    i11 = R.string.GroupBoostsJustReachedLevelNext;
                } else {
                    i11 = R.string.ChannelBoostsJustReachedLevelNext;
                }
                return LocaleController.formatString(i11, Integer.valueOf(this.X.level), LocaleController.formatPluralString("BoostStories", this.X.level + 1, new Object[0]));
            } else {
                if (x1()) {
                    i10 = R.string.GroupNeedBoostsDescriptionForNewFeatures;
                } else {
                    i10 = R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.X;
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
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.Y.alreadyActive) {
            if (x1()) {
                i15 = R.string.BoostGroup;
            } else {
                i15 = R.string.BoostChannel;
            }
            return LocaleController.getString(i15);
        }
        boolean z10 = this.f3401a0;
        int i16 = this.f3404d0;
        if (z10) {
            if (i16 == 32) {
                if (x1()) {
                    i14 = R.string.BoostGroup;
                } else {
                    i14 = R.string.BoostChannel;
                }
                return LocaleController.getString(i14);
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W));
            if (this.Y.alreadyActive) {
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
        } else if (this.Y.alreadyActive) {
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
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W));
    }

    public final TLRPC.ChatFull t1() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.W);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        return new n0(this);
    }

    public final boolean w1() {
        int i10 = this.f3404d0;
        if (i10 != 19 && i10 != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 27 && i10 != 28 && i10 != 23 && i10 != 30 && i10 != 35) {
            return false;
        }
        return true;
    }

    public final boolean x1() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W)));
    }

    @Override
    public final CharSequence y() {
        int i10;
        int i11 = this.f3404d0;
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
        t0 t0Var = this.f3419t0;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        int i11 = tL_premium_boostsStatus.boosts;
        int i12 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        t0Var.f26460b++;
        t0Var.f26458a = i7.w.a((i11 - i10) / i12, 0.0f, 1.0f);
        t0Var.S = true;
        t0Var.T = t0Var.f26470n;
        t0Var.g(i11, true);
        t0Var.E.requestLayout();
        t0Var.requestLayout();
    }
}
