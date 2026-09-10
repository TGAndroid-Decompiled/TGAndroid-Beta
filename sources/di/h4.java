package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.af;
import bi.cb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s20;
import w7.a6;
import w7.c6;
public final class h4 extends s20 implements NotificationCenter.NotificationCenterDelegate {
    public final long P;
    public FrameLayout Q;
    public rg.f R;
    public qn S;
    public z3 T;

    public h4(long j3) {
        this.P = j3;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static void A0(h4 h4Var, TLObject tLObject, org.telegram.ui.ActionBar.d2 d2Var) {
        long j3 = h4Var.P;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            xh.m d = xh.p.g(h4Var.currentAccount).d(j3);
            ArrayList arrayList = d.e;
            int i10 = d.f45687a;
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
                            d.f45689c = Math.max(d.f45689c - 1, 0);
                        } else {
                            arrayList.set(i12, connectedbotstarref);
                        }
                    } else {
                        i12++;
                    }
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.f45688b));
            d.a();
            xh.n e = xh.p.g(h4Var.currentAccount).e(j3);
            e.f45733c = 0;
            e.d = false;
            e.f45736i = false;
            e.f45734f = 0L;
            e.f45737j = null;
            e.h = false;
            e.a();
            h4Var.T.N(true);
        }
        d2Var.dismiss();
    }

    public static boolean B0(h4 h4Var, Context context, View view, int i10) {
        z3 z3Var = h4Var.T;
        if (z3Var != null) {
            Object obj = z3Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(h4Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                w70 H = w70.H(h4Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new af(13, h4Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new af(14, h4Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new a3.k0(h4Var, connectedbotstarref, user, 17), false);
                H.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new androidx.car.app.utils.b(h4Var, context, user, connectedbotstarref, 5));
                H.V(5);
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static int C0(h4 h4Var) {
        return h4Var.currentAccount;
    }

    public static int D0(h4 h4Var) {
        return h4Var.currentAccount;
    }

    public static void G0(android.content.Context r36, int r37, final org.telegram.tgnet.tl.TL_payments.starRefProgram r38, long r39, org.telegram.ui.ActionBar.f6 r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: di.h4.G0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.f6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.h3 H0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j3, f6 f6Var) {
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
        org.telegram.ui.ActionBar.h3 i18 = em.i(1, context, f6Var, false);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f11 = em.f(context, 1);
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
        frameLayout.addView(view, a6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
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
        frameLayout.addView(imageView, a6.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(j6.b0(AndroidUtilities.dp(50.0f), j6.v0(j6.f17998h5, f6Var)));
            frameLayout.addView(frameLayout2, a6.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
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
            uq uqVar = new uq(R.drawable.mini_reply_user, 0);
            uqVar.setScale(0.937f, 0.937f);
            uqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            uqVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(uqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, a6.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f11.addView(frameLayout, a6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i19 = j6.G6;
        em.n(i19, f6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        f11.addView(textView2, a6.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp3 = AndroidUtilities.dp(28.0f);
        int i20 = j6.f17872a7;
        linearLayout3.setBackground(j6.b0(dp3, j6.v0(i20, f6Var)));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        g9 g9Var = new g9((f6) null);
        linearLayout3.addView(w9Var, a6.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(j6.v0(i19, f6Var));
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        g9Var.r(user2);
        w9Var.e(user2, g9Var);
        linearLayout3.addView(textView3, a6.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i21 = j6.f18179r5;
        int v02 = j6.v0(i21, f6Var);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode2));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, a6.t(-2, -2, 16, 5, 0, 8, 0));
        f11.addView(linearLayout3, a6.t(-2, 28, 1, 4, 0, 4, 0));
        c6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        em.n(i19, f6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.a2.n(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
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
                em.p(i22, objArr, textView4);
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
                em.p(i24, objArr2, textView4);
            }
        }
        f11.addView(textView4, a6.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (!connectedbotstarref.revoked) {
            TextView textView5 = new TextView(context);
            em.n(i19, f6Var, textView5, 1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            f11.addView(textView5, a6.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(j6.b0(AndroidUtilities.dp(28.0f), j6.v0(i20, f6Var)));
            w9 w9Var2 = new w9(context);
            w9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            g9 g9Var2 = new g9((f6) null);
            linearLayout4.addView(w9Var2, a6.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(j6.v0(i19, f6Var));
            if (j3 >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                g9Var2.r(user3);
                w9Var2.e(user3, g9Var2);
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
                g9Var2.q(chat);
                w9Var2.e(chat, g9Var2);
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
            imageView3.setColorFilter(new PorterDuffColorFilter(j6.v0(i16, f6Var), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, a6.t(-2, -2, 16, 2, 0, 5, 0));
            f11.addView(linearLayout4, a6.t(-2, 28, 1, 0, 9, 0, 22));
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
        int v = j6.v(j6.v0(i20, f6Var), j6.v0(j6.f18017i6, f6Var));
        textView7.setBackground(j6.i0(dp4, dp4, dp4, dp4, v03, v, v));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str4 = connectedbotstarref.url;
        if (str4 != null && str4.startsWith("https://")) {
            str2 = connectedbotstarref.url.substring(8);
        } else {
            str2 = connectedbotstarref.url;
        }
        textView7.setText(str2);
        f11.addView(textView7, a6.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        bi.d dVar = new bi.d(context, f6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new uq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.g(spannableStringBuilder2, false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        }
        f11.addView(dVar, a6.n(-1, 48));
        m90 m90Var = new m90(context, f6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            i15 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i15 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j11, UserObject.getUserName(user));
        }
        m90Var.setText(formatPluralString3);
        m90Var.setGravity(17);
        m90Var.setTextSize(i15, 12.0f);
        m90Var.setTextColor(j6.v0(j6.B6, f6Var));
        m90Var.setLinkTextColor(j6.v0(j6.gc, f6Var));
        f11.addView(m90Var, a6.t(-1, -2, 49, 14, 12, 14, 2));
        i18.customView = f11;
        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(connectedbotstarref, i18, f6Var, user, 4);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new ai.u(bVar, 11));
        }
        dVar.setOnClickListener(new x3(connectedbotstarref, i10, i18, context, j10, f6Var, bVar));
        i18.setOnDismissListener(new bi.k1(6));
        if (linearLayout2 != null) {
            xh.p.g(i10).n();
            xh.p.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            f6Var2 = f6Var;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new x3(i10, i18, f6Var, linearLayout5, j3, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            f6Var2 = f6Var;
        }
        linearLayout.setOnClickListener(new bi.n3(5, i18, connectedbotstarref2));
        i18.fixNavigationBar(j6.v0(j6.f17998h5, f6Var2));
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            i18.makeAttached(U);
        }
        i18.show();
        return i18;
    }

    public static void x0(h4 h4Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, h4Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = string;
        d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new cb(6, h4Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static void y0(h4 h4Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(h4Var.getParentActivity(), 3, null);
        d2Var.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(h4Var.currentAccount).getInputPeer(h4Var.P);
        editconnectedstarrefbot.revoked = true;
        h4Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.o2(4, h4Var, d2Var));
    }

    public static void z0(h4 h4Var, Context context, int i10) {
        z3 z3Var = h4Var.T;
        if (z3Var != null) {
            Object obj = z3Var.G(i10).G;
            if (obj instanceof TL_payments.starRefProgram) {
                G0(context, h4Var.currentAccount, (TL_payments.starRefProgram) obj, h4Var.P, h4Var.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                H0(context, h4Var.currentAccount, (TL_payments.connectedBotStarRef) obj, h4Var.P, h4Var.resourceProvider);
            }
        }
    }

    public final void F0(java.util.ArrayList r18, org.telegram.ui.Components.j61 r19) {
        throw new UnsupportedOperationException("Method not decompiled: di.h4.F0(java.util.ArrayList, org.telegram.ui.Components.j61):void");
    }

    @Override
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        qn qnVar = new qn(context, 2);
        this.S = qnVar;
        qnVar.setBackgroundColor(j6.w0(null, j6.f18016i5, false));
        super.createView(context);
        this.Q = new FrameLayout(context);
        rg.f fVar = new rg.f(context, 1, 3);
        this.R = fVar;
        fVar.setImportantForAccessibility(4);
        rg.a aVar = this.R.f41485b;
        aVar.f41471w = j6.fk;
        aVar.f41472x = j6.gk;
        aVar.b();
        this.R.setStarParticlesView(this.e);
        this.Q.addView(this.R, a6.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.Q, null);
        this.f36527c.setOnItemClickListener(new ai.b0(1, this, context));
        this.f36527c.setOnItemLongClickListener(new cb(7, this, context));
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(wr.h);
        jVar.n(350L);
        this.f36527c.setItemAnimator(jVar);
        this.f36527c.setOnScrollListener(new bi.a2(this, 3));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j3 = this.P;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == j3) {
                z3 z3Var2 = this.T;
                if (z3Var2 != null) {
                    z3Var2.N(true);
                }
                xh.p.g(this.currentAccount).d(j3).a();
            }
        } else if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j3 && (z3Var = this.T) != null) {
            z3Var.N(true);
        }
    }

    @Override
    public final s4.h0 n0() {
        z3 z3Var = new z3(this, this.f36527c, getParentActivity(), this.currentAccount, this.classGuid, new ai.c0(this, 17), getResourceProvider());
        this.T = z3Var;
        return z3Var;
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
        rg.f fVar = this.R;
        if (fVar != null) {
            fVar.setPaused(true);
            this.R.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        rg.f fVar = this.R;
        if (fVar != null) {
            fVar.setPaused(false);
            this.R.setDialogVisible(false);
        }
    }

    @Override
    public final qg.x1 p0() {
        f fVar = new f(getParentActivity(), 1);
        fVar.b();
        return fVar;
    }
}
