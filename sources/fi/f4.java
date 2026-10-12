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
import bi.z5;
import di.x6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.z9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.v20;
import w7.a6;
public final class f4 extends v20 implements NotificationCenter.NotificationCenterDelegate {
    public final long P;
    public FrameLayout Q;
    public tg.n R;
    public xn S;
    public x3 T;

    public f4(long j10) {
        this.P = j10;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static void A0(f4 f4Var, Context context, int i10) {
        x3 x3Var = f4Var.T;
        if (x3Var != null) {
            Object obj = x3Var.G(i10).G;
            if (obj instanceof TL_payments.starRefProgram) {
                H0(context, f4Var.currentAccount, (TL_payments.starRefProgram) obj, f4Var.P, f4Var.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                I0(context, f4Var.currentAccount, (TL_payments.connectedBotStarRef) obj, f4Var.P, f4Var.resourceProvider);
            }
        }
    }

    public static void B0(f4 f4Var, TLObject tLObject, org.telegram.ui.ActionBar.a2 a2Var) {
        long j10 = f4Var.P;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            zh.l d = zh.p.g(f4Var.currentAccount).d(j10);
            ArrayList arrayList = d.e;
            int i10 = d.f50773a;
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
                            d.f50775c = Math.max(d.f50775c - 1, 0);
                        } else {
                            arrayList.set(i12, connectedbotstarref);
                        }
                    } else {
                        i12++;
                    }
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.f50774b));
            d.a();
            zh.n e = zh.p.g(f4Var.currentAccount).e(j10);
            e.f50845c = 0;
            e.d = false;
            e.f50848i = false;
            e.f50846f = 0L;
            e.f50849j = null;
            e.h = false;
            e.a();
            f4Var.T.N(true);
        }
        a2Var.dismiss();
    }

    public static boolean C0(f4 f4Var, Context context, View view, int i10) {
        x3 x3Var = f4Var.T;
        if (x3Var != null) {
            Object obj = x3Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(f4Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                m80 H = m80.H(f4Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new x6(29, f4Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new q3(0, f4Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new a3.l0(f4Var, connectedbotstarref, user, 27), false);
                H.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new androidx.car.app.utils.b(f4Var, context, user, connectedbotstarref, 9));
                H.V(5);
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static int D0(f4 f4Var) {
        return f4Var.currentAccount;
    }

    public static int E0(f4 f4Var) {
        return f4Var.currentAccount;
    }

    public static void H0(android.content.Context r36, int r37, final org.telegram.tgnet.tl.TL_payments.starRefProgram r38, long r39, org.telegram.ui.ActionBar.c6 r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: fi.f4.H0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.c6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.e3 I0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j10, c6 c6Var) {
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
        c6 c6Var2;
        int i16;
        PorterDuff.Mode mode;
        String str3;
        int i17;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.e3 i18 = yh.i(1, context, c6Var, false);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout e = yh.e(context, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        int dp = AndroidUtilities.dp(40.0f);
        if (connectedbotstarref.revoked) {
            i11 = g6.wj;
        } else {
            i11 = g6.Oh;
        }
        view.setBackground(g6.K(dp, g6.w0(i11, c6Var)));
        frameLayout.addView(view, a6.a(80.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 49));
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
        frameLayout.addView(imageView, a6.a(80.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 49));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(g6.c0(AndroidUtilities.dp(50.0f), g6.w0(g6.f19972h5, c6Var)));
            frameLayout.addView(frameLayout2, a6.a(-2.0f, 0.0f, 66.0f, 0.0f, 0.0f, -2, 49));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            int dp2 = AndroidUtilities.dp(9.5f);
            if (connectedbotstarref.revoked) {
                i17 = g6.wj;
            } else {
                i17 = g6.uj;
            }
            textView.setBackground(g6.c0(dp2, g6.w0(i17, c6Var)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            br brVar = new br(R.drawable.mini_reply_user, 0);
            brVar.setScale(0.937f, 0.937f);
            brVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            brVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(brVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, a6.a(19.0f, 1.33f, 1.33f, 1.33f, 1.33f, -1, 119));
        } else {
            scaleType = scaleType2;
        }
        e.addView(frameLayout, a6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i19 = g6.G6;
        yh.n(i19, c6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        e.addView(textView2, a6.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp3 = AndroidUtilities.dp(28.0f);
        int i20 = g6.f19843a7;
        linearLayout3.setBackground(g6.c0(dp3, g6.w0(i20, c6Var)));
        z9 z9Var = new z9(context);
        z9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        k9 k9Var = new k9((c6) null);
        linearLayout3.addView(z9Var, a6.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(g6.w0(i19, c6Var));
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        k9Var.r(user2);
        z9Var.e(user2, k9Var);
        linearLayout3.addView(textView3, a6.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i21 = g6.f20157r5;
        int w02 = g6.w0(i21, c6Var);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode2));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, a6.t(-2, -2, 16, 5, 0, 8, 0));
        e.addView(linearLayout3, a6.t(-2, 28, 1, 4, 0, 4, 0));
        w7.c6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        yh.n(i19, c6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.q.o(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
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
                yh.q(i22, objArr, textView4);
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
                yh.q(i24, objArr2, textView4);
            }
        }
        e.addView(textView4, a6.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (!connectedbotstarref.revoked) {
            TextView textView5 = new TextView(context);
            yh.n(i19, c6Var, textView5, 1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            e.addView(textView5, a6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(g6.c0(AndroidUtilities.dp(28.0f), g6.w0(i20, c6Var)));
            z9 z9Var2 = new z9(context);
            z9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            k9 k9Var2 = new k9((c6) null);
            linearLayout4.addView(z9Var2, a6.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(g6.w0(i19, c6Var));
            if (j10 >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                k9Var2.r(user3);
                z9Var2.e(user3, k9Var2);
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
                k9Var2.q(chat);
                z9Var2.e(chat, k9Var2);
                if (chat == null) {
                    str3 = "";
                } else {
                    str3 = chat.title;
                }
                textView6.setText(str3);
            }
            linearLayout4.addView(textView6, a6.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            imageView3.setColorFilter(new PorterDuffColorFilter(g6.w0(i16, c6Var), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, a6.t(-2, -2, 16, 2, 0, 5, 0));
            e.addView(linearLayout4, a6.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        } else {
            j11 = j10;
            i14 = i19;
            linearLayout2 = null;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(g6.w0(i14, c6Var));
        int dp4 = AndroidUtilities.dp(8.0f);
        int w03 = g6.w0(i20, c6Var);
        int v = g6.v(g6.w0(i20, c6Var), g6.w0(g6.f19990i6, c6Var));
        textView7.setBackground(g6.j0(dp4, dp4, dp4, dp4, w03, v, v));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str4 = connectedbotstarref.url;
        if (str4 != null && str4.startsWith("https://")) {
            str2 = connectedbotstarref.url.substring(8);
        } else {
            str2 = connectedbotstarref.url;
        }
        textView7.setText(str2);
        e.addView(textView7, a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 12.0f, -1, 7));
        di.d dVar = new di.d(context, c6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new br(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.g(spannableStringBuilder2, false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        }
        e.addView(dVar, a6.n(-1, 48));
        da0 da0Var = new da0(context, c6Var);
        long j12 = connectedbotstarref.participants;
        if (j12 <= 0) {
            i15 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i15 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j12, UserObject.getUserName(user));
        }
        da0Var.setText(formatPluralString3);
        da0Var.setGravity(17);
        da0Var.setTextSize(i15, 12.0f);
        da0Var.setTextColor(g6.w0(g6.B6, c6Var));
        da0Var.setLinkTextColor(g6.w0(g6.f19960gc, c6Var));
        e.addView(da0Var, a6.t(-1, -2, 49, 14, 12, 14, 2));
        i18.customView = e;
        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(connectedbotstarref, i18, c6Var, user, 8);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new ah.g0(bVar, 17));
        }
        dVar.setOnClickListener(new v3(connectedbotstarref, i10, i18, context, j11, c6Var, bVar));
        i18.setOnDismissListener(new di.e1(6));
        if (linearLayout2 != null) {
            zh.p.g(i10).n();
            zh.p.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            c6Var2 = c6Var;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new v3(i10, i18, c6Var, linearLayout5, j10, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            c6Var2 = c6Var;
        }
        linearLayout.setOnClickListener(new bi.u1(9, i18, connectedbotstarref2));
        i18.fixNavigationBar(g6.w0(g6.f19972h5, c6Var2));
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            i18.makeAttached(U);
        }
        i18.show();
        return i18;
    }

    public static void y0(f4 f4Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f4Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new ah.h0(11, f4Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static void z0(f4 f4Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(f4Var.getParentActivity(), 3, null);
        a2Var.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(f4Var.currentAccount).getInputPeer(f4Var.P);
        editconnectedstarrefbot.revoked = true;
        f4Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.m1(9, f4Var, a2Var));
    }

    public final void G0(java.util.ArrayList r18, org.telegram.ui.Components.z61 r19) {
        throw new UnsupportedOperationException("Method not decompiled: fi.f4.G0(java.util.ArrayList, org.telegram.ui.Components.z61):void");
    }

    @Override
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        xn xnVar = new xn(context, 3);
        this.S = xnVar;
        xnVar.setBackgroundColor(g6.x0(null, g6.f19989i5, false));
        super.createView(context);
        this.Q = new FrameLayout(context);
        tg.n nVar = new tg.n(context, 1, 3);
        this.R = nVar;
        nVar.setImportantForAccessibility(4);
        tg.g gVar = this.R.f45740b;
        gVar.f45724z = g6.fk;
        gVar.A = g6.gk;
        gVar.b();
        this.R.setStarParticlesView(this.e);
        this.Q.addView(this.R, a6.a(190.0f, 0.0f, 32.0f, 0.0f, 12.0f, 190, 17));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.Q, null);
        this.f40861c.setOnItemClickListener(new z5(2, this, context));
        this.f40861c.setOnItemLongClickListener(new ah.h0(12, this, context));
        s4.k kVar = new s4.k();
        kVar.f44872m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.f40861c.setItemAnimator(kVar);
        this.f40861c.setOnScrollListener(new ah.d0(this, 5));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x3 x3Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j10 = this.P;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == j10) {
                x3 x3Var2 = this.T;
                if (x3Var2 != null) {
                    x3Var2.N(true);
                }
                zh.p.g(this.currentAccount).d(j10).a();
            }
        } else if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j10 && (x3Var = this.T) != null) {
            x3Var.N(true);
        }
    }

    @Override
    public final s4.g0 n0() {
        x3 x3Var = new x3(this, this.f40861c, getParentActivity(), this.currentAccount, this.classGuid, new ci.u(this, 17), getResourceProvider());
        this.T = x3Var;
        return x3Var;
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
