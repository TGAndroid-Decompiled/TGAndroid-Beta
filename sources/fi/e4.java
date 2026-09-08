package fi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.b7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.x9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r20;
import w7.x5;
import w7.z5;
public final class e4 extends r20 implements NotificationCenter.NotificationCenterDelegate {
    public final long P;
    public FrameLayout Q;
    public tg.e R;
    public jn S;
    public w3 T;

    public e4(long j3) {
        this.P = j3;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static void A0(e4 e4Var, TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var) {
        long j3 = e4Var.P;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            zh.l d = zh.o.g(e4Var.currentAccount).d(j3);
            ArrayList arrayList = d.f52207e;
            int i10 = d.f52204a;
            MessagesController.getInstance(i10).putUsers(connectedstarrefbots.users, false);
            for (int i11 = 0; i11 < connectedstarrefbots.connected_bots.size(); i11++) {
                TL_payments.connectedBotStarRef connectedbotstarref = connectedstarrefbots.connected_bots.get(i11);
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        break;
                    } else if (((TL_payments.connectedBotStarRef) arrayList.get(i12)).bot_id == connectedbotstarref.bot_id) {
                        if (connectedbotstarref.revoked) {
                            arrayList.remove(i12);
                            d.f52206c = Math.max(d.f52206c - 1, 0);
                        } else {
                            arrayList.set(i12, connectedbotstarref);
                        }
                    } else {
                        i12++;
                    }
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.f52205b));
            d.a();
            zh.m e7 = zh.o.g(e4Var.currentAccount).e(j3);
            e7.f52273c = 0;
            e7.d = false;
            e7.f52277i = false;
            e7.f52275f = 0L;
            e7.f52278j = null;
            e7.h = false;
            e7.a();
            e4Var.T.N(true);
        }
        b2Var.dismiss();
    }

    public static boolean B0(e4 e4Var, Context context, View view, int i10) {
        w3 w3Var = e4Var.T;
        if (w3Var != null) {
            Object obj = w3Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(e4Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                n70 H = n70.H(e4Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new b7(27, e4Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new b7(28, e4Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new a3.k0(e4Var, connectedbotstarref, user, 27), false);
                H.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new androidx.car.app.utils.b(e4Var, context, user, connectedbotstarref, 10));
                H.V(5);
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static int C0(e4 e4Var) {
        return e4Var.currentAccount;
    }

    public static int D0(e4 e4Var) {
        return e4Var.currentAccount;
    }

    public static void G0(android.content.Context r36, int r37, final org.telegram.tgnet.tl.TL_payments.starRefProgram r38, long r39, org.telegram.ui.ActionBar.f6 r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: fi.e4.G0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.f6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.f3 H0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j3, f6 f6Var) {
        int i11;
        int i12;
        float f7;
        float f10;
        ImageView.ScaleType scaleType;
        TLRPC.User user;
        LinearLayout linearLayout;
        String str;
        char c10;
        String formatPluralString;
        int i13;
        char c11;
        String formatPluralString2;
        long j10;
        int i14;
        LinearLayout linearLayout2;
        String str2;
        int i15;
        String formatPluralString3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        f6 f6Var2;
        int i16;
        PorterDuff.Mode mode;
        String str3;
        int i17;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.f3 i18 = wl.i(1, context, f6Var, false);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f11 = wl.f(context, 1);
        f11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f11.setClipChildren(false);
        f11.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        int dp = AndroidUtilities.dp(40.0f);
        if (connectedbotstarref.revoked) {
            i11 = j6.wj;
        } else {
            i11 = j6.Oh;
        }
        view.setBackground(j6.K(dp, j6.v0(i11, f6Var)));
        frameLayout.addView(view, x5.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        if (connectedbotstarref.revoked) {
            i12 = R.drawable.msg_link_2;
        } else {
            i12 = R.drawable.msg_limit_links;
        }
        imageView.setImageResource(i12);
        if (connectedbotstarref.revoked) {
            f7 = 2.0f;
        } else {
            f7 = 1.8f;
        }
        imageView.setScaleX(f7);
        if (connectedbotstarref.revoked) {
            f10 = 2.0f;
        } else {
            f10 = 1.8f;
        }
        imageView.setScaleY(f10);
        frameLayout.addView(imageView, x5.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(j6.b0(AndroidUtilities.dp(50.0f), j6.v0(j6.f20761h5, f6Var)));
            frameLayout.addView(frameLayout2, x5.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            int dp2 = AndroidUtilities.dp(9.5f);
            if (connectedbotstarref.revoked) {
                i17 = j6.wj;
            } else {
                i17 = j6.uj;
            }
            textView.setBackground(j6.b0(dp2, j6.v0(i17, f6Var)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            nq nqVar = new nq(R.drawable.mini_reply_user, 0);
            nqVar.setScale(0.937f, 0.937f);
            nqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            nqVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, x5.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f11.addView(frameLayout, x5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i19 = j6.G6;
        wl.n(i19, f6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        f11.addView(textView2, x5.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp3 = AndroidUtilities.dp(28.0f);
        int i20 = j6.f20634a7;
        linearLayout3.setBackground(j6.b0(dp3, j6.v0(i20, f6Var)));
        x9 x9Var = new x9(context);
        x9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        i9 i9Var = new i9((f6) null);
        linearLayout3.addView(x9Var, x5.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(j6.v0(i19, f6Var));
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        i9Var.r(user2);
        x9Var.e(user2, i9Var);
        linearLayout3.addView(textView3, x5.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i21 = j6.f20942r5;
        int v02 = j6.v0(i21, f6Var);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode2));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, x5.t(-2, -2, 16, 5, 0, 8, 0));
        f11.addView(linearLayout3, x5.t(-2, 28, 1, 4, 0, 4, 0));
        z5.a(linearLayout3);
        TextView textView4 = new TextView(context);
        wl.n(i19, f6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.w1.n(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            user = user2;
            linearLayout = linearLayout3;
        } else {
            user = user2;
            if (j3 < 0) {
                int i22 = R.string.ChannelAffiliateProgramLinkTextChannel;
                String G0 = m.G0(connectedbotstarref.commission_permille);
                String userName = UserObject.getUserName(user);
                int i23 = connectedbotstarref.duration_months;
                if (i23 <= 0) {
                    formatPluralString2 = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    linearLayout = linearLayout3;
                    c11 = 0;
                } else {
                    linearLayout = linearLayout3;
                    if (i23 < 12 || i23 % 12 != 0) {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i23, new Object[0]);
                    } else {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i23 / 12, new Object[0]);
                    }
                }
                Object[] objArr = new Object[3];
                objArr[c11] = G0;
                objArr[1] = userName;
                objArr[2] = formatPluralString2;
                wl.p(i22, objArr, textView4);
            } else {
                linearLayout = linearLayout3;
                int i24 = R.string.ChannelAffiliateProgramLinkTextUser;
                String G02 = m.G0(connectedbotstarref.commission_permille);
                String userName2 = UserObject.getUserName(user);
                int i25 = connectedbotstarref.duration_months;
                if (i25 <= 0) {
                    formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    str = userName2;
                    i13 = 3;
                    c10 = 0;
                } else {
                    str = userName2;
                    if (i25 < 12 || i25 % 12 != 0) {
                        c10 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i25, new Object[0]);
                    } else {
                        c10 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i25 / 12, new Object[0]);
                    }
                    i13 = 3;
                }
                Object[] objArr2 = new Object[i13];
                objArr2[c10] = G02;
                objArr2[1] = str;
                objArr2[2] = formatPluralString;
                wl.p(i24, objArr2, textView4);
            }
        }
        f11.addView(textView4, x5.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (!connectedbotstarref.revoked) {
            TextView textView5 = new TextView(context);
            wl.n(i19, f6Var, textView5, 1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            f11.addView(textView5, x5.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(j6.b0(AndroidUtilities.dp(28.0f), j6.v0(i20, f6Var)));
            x9 x9Var2 = new x9(context);
            x9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            i9 i9Var2 = new i9((f6) null);
            linearLayout4.addView(x9Var2, x5.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(j6.v0(i19, f6Var));
            if (j3 >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                i9Var2.r(user3);
                x9Var2.e(user3, i9Var2);
                textView6.setText(UserObject.getUserName(user3));
                i14 = i19;
                i16 = i21;
                mode = mode2;
                j10 = j3;
            } else {
                i14 = i19;
                i16 = i21;
                mode = mode2;
                j10 = j3;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                i9Var2.q(chat);
                x9Var2.e(chat, i9Var2);
                if (chat == null) {
                    str3 = "";
                } else {
                    str3 = chat.title;
                }
                textView6.setText(str3);
            }
            linearLayout4.addView(textView6, x5.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            imageView3.setColorFilter(new PorterDuffColorFilter(j6.v0(i16, f6Var), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, x5.t(-2, -2, 16, 2, 0, 5, 0));
            f11.addView(linearLayout4, x5.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        } else {
            j10 = j3;
            i14 = i19;
            linearLayout2 = null;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(j6.v0(i14, f6Var));
        int dp4 = AndroidUtilities.dp(8.0f);
        int v03 = j6.v0(i20, f6Var);
        int v = j6.v(j6.v0(i20, f6Var), j6.v0(j6.f20780i6, f6Var));
        textView7.setBackground(j6.i0(dp4, dp4, dp4, dp4, v03, v, v));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str4 = connectedbotstarref.url;
        if (str4 != null && str4.startsWith("https://")) {
            str2 = connectedbotstarref.url.substring(8);
        } else {
            str2 = connectedbotstarref.url;
        }
        textView7.setText(str2);
        f11.addView(textView7, x5.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        di.d dVar = new di.d(context, f6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new nq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.g(spannableStringBuilder2, false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        }
        f11.addView(dVar, x5.n(-1, 48));
        d90 d90Var = new d90(context, f6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            i15 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i15 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j11, UserObject.getUserName(user));
        }
        d90Var.setText(formatPluralString3);
        d90Var.setGravity(17);
        d90Var.setTextSize(i15, 12.0f);
        d90Var.setTextColor(j6.v0(j6.B6, f6Var));
        d90Var.setLinkTextColor(j6.v0(j6.gc, f6Var));
        f11.addView(d90Var, x5.t(-1, -2, 49, 14, 12, 14, 2));
        i18.customView = f11;
        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(connectedbotstarref, i18, f6Var, user, 9);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new ah.h0(bVar, 17));
        }
        dVar.setOnClickListener(new u3(connectedbotstarref, i10, i18, context, j10, f6Var, bVar));
        i18.setOnDismissListener(new di.f1(6));
        if (linearLayout2 != null) {
            zh.o.g(i10).n();
            zh.o.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            f6Var2 = f6Var;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new u3(i10, i18, f6Var, linearLayout5, j3, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            f6Var2 = f6Var;
        }
        linearLayout.setOnClickListener(new bi.u1(9, i18, connectedbotstarref2));
        i18.fixNavigationBar(j6.v0(j6.f20761h5, f6Var2));
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            i18.makeAttached(U);
        }
        i18.show();
        return i18;
    }

    public static void x0(e4 e4Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e4Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new ah.i0(11, e4Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static void y0(e4 e4Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(e4Var.getParentActivity(), 3, null);
        b2Var.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(e4Var.currentAccount).getInputPeer(e4Var.P);
        editconnectedstarrefbot.revoked = true;
        e4Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.m1(9, e4Var, b2Var));
    }

    public static void z0(e4 e4Var, Context context, int i10) {
        w3 w3Var = e4Var.T;
        if (w3Var != null) {
            Object obj = w3Var.G(i10).G;
            if (obj instanceof TL_payments.starRefProgram) {
                G0(context, e4Var.currentAccount, (TL_payments.starRefProgram) obj, e4Var.P, e4Var.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                H0(context, e4Var.currentAccount, (TL_payments.connectedBotStarRef) obj, e4Var.P, e4Var.resourceProvider);
            }
        }
    }

    public final void F0(java.util.ArrayList r18, org.telegram.ui.Components.v51 r19) {
        throw new UnsupportedOperationException("Method not decompiled: fi.e4.F0(java.util.ArrayList, org.telegram.ui.Components.v51):void");
    }

    @Override
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        jn jnVar = new jn(context, 3);
        this.S = jnVar;
        jnVar.setBackgroundColor(j6.w0(null, j6.f20779i5, false));
        super.createView(context);
        this.Q = new FrameLayout(context);
        tg.e eVar = new tg.e(context, 1, 3);
        this.R = eVar;
        eVar.setImportantForAccessibility(4);
        tg.a aVar = this.R.f46547b;
        aVar.f46535w = j6.fk;
        aVar.f46536x = j6.gk;
        aVar.b();
        this.R.setStarParticlesView(this.f40069e);
        this.Q.addView(this.R, x5.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.Q, null);
        this.f40068c.setOnItemClickListener(new bi.x5(2, this, context));
        this.f40068c.setOnItemLongClickListener(new ah.i0(12, this, context));
        s4.j jVar = new s4.j();
        jVar.f45805m = false;
        jVar.C = false;
        jVar.o(pr.h);
        jVar.n(350L);
        this.f40068c.setItemAnimator(jVar);
        this.f40068c.setOnScrollListener(new ah.e0(this, 6));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w3 w3Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j3 = this.P;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == j3) {
                w3 w3Var2 = this.T;
                if (w3Var2 != null) {
                    w3Var2.N(true);
                }
                zh.o.g(this.currentAccount).d(j3).a();
            }
        } else if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j3 && (w3Var = this.T) != null) {
            w3Var.N(true);
        }
    }

    @Override
    public final s4.h0 n0() {
        w3 w3Var = new w3(this, this.f40068c, getParentActivity(), this.currentAccount, this.classGuid, new ci.u(this, 17), getResourceProvider());
        this.T = w3Var;
        return w3Var;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
    }

    @Override
    public final void onPause() {
        super.onPause();
        tg.e eVar = this.R;
        if (eVar != null) {
            eVar.setPaused(true);
            this.R.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        tg.e eVar = this.R;
        if (eVar != null) {
            eVar.setPaused(false);
            this.R.setDialogVisible(false);
        }
    }

    @Override
    public final sg.z1 p0() {
        g gVar = new g(getParentActivity(), 1);
        gVar.b();
        return gVar;
    }
}
