package gi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.y4;
import ei.p6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.y10;
import w7.b6;
import w7.z5;
public final class u3 extends y10 implements NotificationCenter.NotificationCenterDelegate {
    public final long P;
    public FrameLayout Q;
    public tg.n R;
    public un S;
    public m3 T;

    public u3(long j10) {
        this.P = j10;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static void A0(u3 u3Var, Context context, int i10) {
        m3 m3Var = u3Var.T;
        if (m3Var != null) {
            Object obj = m3Var.G(i10).G;
            if (obj instanceof TL_payments.starRefProgram) {
                H0(context, u3Var.currentAccount, (TL_payments.starRefProgram) obj, u3Var.P, u3Var.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                I0(context, u3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, u3Var.P, u3Var.resourceProvider);
            }
        }
    }

    public static void B0(u3 u3Var, TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var) {
        long j10 = u3Var.P;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            ai.h0 d = ai.k0.g(u3Var.currentAccount).d(j10);
            ArrayList arrayList = d.e;
            int i10 = d.f1397a;
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
                            d.f1399c = Math.max(d.f1399c - 1, 0);
                        } else {
                            arrayList.set(i12, connectedbotstarref);
                        }
                    } else {
                        i12++;
                    }
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.f1398b));
            d.a();
            ai.i0 e = ai.k0.g(u3Var.currentAccount).e(j10);
            e.f1463c = 0;
            e.d = false;
            e.f1466i = false;
            e.f1464f = 0L;
            e.f1467j = null;
            e.h = false;
            e.a();
            u3Var.T.N(true);
        }
        b2Var.dismiss();
    }

    public static boolean C0(u3 u3Var, Context context, View view, int i10) {
        m3 m3Var = u3Var.T;
        if (m3Var != null) {
            Object obj = m3Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(u3Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                i80 H = i80.H(u3Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new p6(18, u3Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new p6(19, u3Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new ei.z1(u3Var, connectedbotstarref, user, 12), false);
                H.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new ai.y0(u3Var, context, user, connectedbotstarref, 15));
                H.V(5);
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static int D0(u3 u3Var) {
        return u3Var.currentAccount;
    }

    public static int E0(u3 u3Var) {
        return u3Var.currentAccount;
    }

    public static void H0(android.content.Context r36, int r37, final org.telegram.tgnet.tl.TL_payments.starRefProgram r38, long r39, org.telegram.ui.ActionBar.d6 r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: gi.u3.H0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.d6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.f3 I0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j10, d6 d6Var) {
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
        long j11;
        int i14;
        LinearLayout linearLayout2;
        String str2;
        int i15;
        String formatPluralString3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        d6 d6Var2;
        int i16;
        PorterDuff.Mode mode;
        String str3;
        int i17;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.f3 i18 = kk.i(1, context, d6Var, false);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout e = kk.e(context, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        int dp = AndroidUtilities.dp(40.0f);
        if (connectedbotstarref.revoked) {
            i11 = h6.wj;
        } else {
            i11 = h6.Oh;
        }
        view.setBackground(h6.K(dp, h6.w0(i11, d6Var)));
        frameLayout.addView(view, z5.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
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
        frameLayout.addView(imageView, z5.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(h6.c0(AndroidUtilities.dp(50.0f), h6.w0(h6.f21058h5, d6Var)));
            frameLayout.addView(frameLayout2, z5.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            int dp2 = AndroidUtilities.dp(9.5f);
            if (connectedbotstarref.revoked) {
                i17 = h6.wj;
            } else {
                i17 = h6.uj;
            }
            textView.setBackground(h6.c0(dp2, h6.w0(i17, d6Var)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            yq yqVar = new yq(R.drawable.mini_reply_user, 0);
            yqVar.setScale(0.937f, 0.937f);
            yqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            yqVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, z5.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        e.addView(frameLayout, z5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i19 = h6.G6;
        kk.o(i19, d6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        e.addView(textView2, z5.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp3 = AndroidUtilities.dp(28.0f);
        int i20 = h6.f20929a7;
        linearLayout3.setBackground(h6.c0(dp3, h6.w0(i20, d6Var)));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        h9 h9Var = new h9((d6) null);
        linearLayout3.addView(w9Var, z5.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(h6.w0(i19, d6Var));
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        h9Var.r(user2);
        w9Var.e(user2, h9Var);
        linearLayout3.addView(textView3, z5.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i21 = h6.f21243r5;
        int w02 = h6.w0(i21, d6Var);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, z5.t(-2, -2, 16, 5, 0, 8, 0));
        e.addView(linearLayout3, z5.t(-2, 28, 1, 4, 0, 4, 0));
        b6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        kk.o(i19, d6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.g0.n(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            user = user2;
            linearLayout = linearLayout3;
        } else {
            user = user2;
            if (j10 < 0) {
                int i22 = R.string.ChannelAffiliateProgramLinkTextChannel;
                String H0 = l.H0(connectedbotstarref.commission_permille);
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
                objArr[c11] = H0;
                objArr[1] = userName;
                objArr[2] = formatPluralString2;
                kk.r(i22, objArr, textView4);
            } else {
                linearLayout = linearLayout3;
                int i24 = R.string.ChannelAffiliateProgramLinkTextUser;
                String H02 = l.H0(connectedbotstarref.commission_permille);
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
                objArr2[c10] = H02;
                objArr2[1] = str;
                objArr2[2] = formatPluralString;
                kk.r(i24, objArr2, textView4);
            }
        }
        e.addView(textView4, z5.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (!connectedbotstarref.revoked) {
            TextView textView5 = new TextView(context);
            kk.o(i19, d6Var, textView5, 1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            e.addView(textView5, z5.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(h6.c0(AndroidUtilities.dp(28.0f), h6.w0(i20, d6Var)));
            w9 w9Var2 = new w9(context);
            w9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            h9 h9Var2 = new h9((d6) null);
            linearLayout4.addView(w9Var2, z5.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(h6.w0(i19, d6Var));
            if (j10 >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                h9Var2.r(user3);
                w9Var2.e(user3, h9Var2);
                textView6.setText(UserObject.getUserName(user3));
                i14 = i19;
                i16 = i21;
                mode = mode2;
                j11 = j10;
            } else {
                i14 = i19;
                i16 = i21;
                mode = mode2;
                j11 = j10;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j11));
                h9Var2.q(chat);
                w9Var2.e(chat, h9Var2);
                if (chat == null) {
                    str3 = "";
                } else {
                    str3 = chat.title;
                }
                textView6.setText(str3);
            }
            linearLayout4.addView(textView6, z5.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            imageView3.setColorFilter(new PorterDuffColorFilter(h6.w0(i16, d6Var), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, z5.t(-2, -2, 16, 2, 0, 5, 0));
            e.addView(linearLayout4, z5.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        } else {
            j11 = j10;
            i14 = i19;
            linearLayout2 = null;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(h6.w0(i14, d6Var));
        int dp4 = AndroidUtilities.dp(8.0f);
        int w03 = h6.w0(i20, d6Var);
        int v = h6.v(h6.w0(i20, d6Var), h6.w0(h6.f21076i6, d6Var));
        textView7.setBackground(h6.j0(dp4, dp4, dp4, dp4, w03, v, v));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str4 = connectedbotstarref.url;
        if (str4 != null && str4.startsWith("https://")) {
            str2 = connectedbotstarref.url.substring(8);
        } else {
            str2 = connectedbotstarref.url;
        }
        textView7.setText(str2);
        e.addView(textView7, z5.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        ei.d dVar = new ei.d(context, d6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new yq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.g(spannableStringBuilder2, false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        }
        e.addView(dVar, z5.n(-1, 48));
        x90 x90Var = new x90(context, d6Var);
        long j12 = connectedbotstarref.participants;
        if (j12 <= 0) {
            i15 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i15 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j12, UserObject.getUserName(user));
        }
        x90Var.setText(formatPluralString3);
        x90Var.setGravity(17);
        x90Var.setTextSize(i15, 12.0f);
        x90Var.setTextColor(h6.w0(h6.B6, d6Var));
        x90Var.setLinkTextColor(h6.w0(h6.f21046gc, d6Var));
        e.addView(x90Var, z5.t(-1, -2, 49, 14, 12, 14, 2));
        i18.customView = e;
        ai.y0 y0Var = new ai.y0(connectedbotstarref, i18, d6Var, user, 14);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new ah.g0(y0Var, 27));
        }
        dVar.setOnClickListener(new k3(connectedbotstarref, i10, i18, context, j11, d6Var, y0Var));
        i18.setOnDismissListener(new ei.e1(6));
        if (linearLayout2 != null) {
            ai.k0.g(i10).n();
            ai.k0.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            d6Var2 = d6Var;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new k3(i10, i18, d6Var, linearLayout5, j10, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            d6Var2 = d6Var;
        }
        linearLayout.setOnClickListener(new ai.p(19, i18, connectedbotstarref2));
        i18.fixNavigationBar(h6.w0(h6.f21058h5, d6Var2));
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            i18.makeAttached(U);
        }
        i18.show();
        return i18;
    }

    public static void y0(u3 u3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u3Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20602a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new ah.h0(13, u3Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static void z0(u3 u3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(u3Var.getParentActivity(), 3, null);
        b2Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(u3Var.currentAccount).getInputPeer(u3Var.P);
        editconnectedstarrefbot.revoked = true;
        u3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new ai.g(16, u3Var, b2Var));
    }

    public final void G0(java.util.ArrayList r18, org.telegram.ui.Components.t61 r19) {
        throw new UnsupportedOperationException("Method not decompiled: gi.u3.G0(java.util.ArrayList, org.telegram.ui.Components.t61):void");
    }

    @Override
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        un unVar = new un(context, 3);
        this.S = unVar;
        unVar.setBackgroundColor(h6.x0(null, h6.f21075i5, false));
        super.createView(context);
        this.Q = new FrameLayout(context);
        tg.n nVar = new tg.n(context, 1, 3);
        this.R = nVar;
        nVar.setImportantForAccessibility(4);
        tg.g gVar = this.R.f47103b;
        gVar.f47087z = h6.fk;
        gVar.A = h6.gk;
        gVar.b();
        this.R.setStarParticlesView(this.e);
        this.Q.addView(this.R, z5.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.Q, null);
        this.f43319c.setOnItemClickListener(new y4(2, this, context));
        this.f43319c.setOnItemLongClickListener(new ah.h0(14, this, context));
        s4.k kVar = new s4.k();
        kVar.f45946m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.f43319c.setItemAnimator(kVar);
        this.f43319c.setOnScrollListener(new ah.d0(this, 9));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        m3 m3Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j10 = this.P;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == j10) {
                m3 m3Var2 = this.T;
                if (m3Var2 != null) {
                    m3Var2.N(true);
                }
                ai.k0.g(this.currentAccount).d(j10).a();
            }
        } else if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j10 && (m3Var = this.T) != null) {
            m3Var.N(true);
        }
    }

    @Override
    public final s4.g0 n0() {
        m3 m3Var = new m3(this, this.f43319c, getParentActivity(), this.currentAccount, this.classGuid, new ai.q(this, 28), getResourceProvider());
        this.T = m3Var;
        return m3Var;
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
        tg.n nVar = this.R;
        if (nVar != null) {
            nVar.setPaused(true);
            this.R.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        tg.n nVar = this.R;
        if (nVar != null) {
            nVar.setPaused(false);
            this.R.setDialogVisible(false);
        }
    }

    @Override
    public final sg.x1 p0() {
        f fVar = new f(getParentActivity(), 1);
        fVar.c();
        return fVar;
    }
}
