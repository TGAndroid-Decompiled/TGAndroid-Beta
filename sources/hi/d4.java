package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f20;
public final class d4 extends f20 implements NotificationCenter.NotificationCenterDelegate {
    public final long R;
    public FrameLayout S;
    public ug.n T;
    public vn U;
    public v3 V;

    public d4(long j10) {
        this.R = j10;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static boolean A0(d4 d4Var, Context context, View view, int i10) {
        v3 v3Var = d4Var.V;
        if (v3Var != null) {
            Object obj = v3Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(d4Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                l80 H = l80.H(d4Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new u2(1, d4Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new u2(2, d4Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new e2.m0(d4Var, connectedbotstarref, user, 13), false);
                H.m(R.drawable.msg_leave, new ai.e0(d4Var, context, user, connectedbotstarref, 18), LocaleController.getString(R.string.LeaveAffiliateLinkButton), !connectedbotstarref.revoked, true);
                H.V(5);
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static int B0(d4 d4Var) {
        return d4Var.currentAccount;
    }

    public static int C0(d4 d4Var) {
        return d4Var.currentAccount;
    }

    public static void F0(android.content.Context r35, int r36, final org.telegram.tgnet.tl.TL_payments.starRefProgram r37, long r38, org.telegram.ui.ActionBar.u6 r40, boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: hi.d4.F0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.u6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.k3 G0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j10, u6 u6Var) {
        int i11;
        int i12;
        int i13;
        float f7;
        float f10;
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        int i14;
        org.telegram.ui.ActionBar.k3 k3Var;
        String str;
        char c10;
        String formatPluralString;
        int i15;
        char c11;
        String formatPluralString2;
        int i16;
        LinearLayout linearLayout2;
        String str2;
        int i17;
        String formatPluralString3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        String str3;
        int i18;
        int i19;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.k3 i20 = wh.i(1, context, u6Var, false);
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout d = wh.d(context, 1);
        d.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        d.setClipChildren(false);
        d.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        int dp = AndroidUtilities.dp(40.0f);
        if (connectedbotstarref.revoked) {
            i11 = y6.wj;
        } else {
            i11 = y6.Oh;
        }
        Drawable K = y6.K(dp, y6.w0(i11, u6Var));
        if (connectedbotstarref.revoked) {
            i12 = y6.wj;
        } else {
            i12 = y6.Oh;
        }
        b7 N = f7.N(i12);
        view.setBackground(K);
        f7.k(view, K, N, null, u6Var);
        frameLayout.addView(view, kb1.h(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        if (connectedbotstarref.revoked) {
            i13 = R.drawable.msg_link_2;
        } else {
            i13 = R.drawable.msg_limit_links;
        }
        imageView.setImageResource(i13);
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
        frameLayout.addView(imageView, kb1.h(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int dp2 = AndroidUtilities.dp(50.0f);
            int i21 = y6.f23428h5;
            Drawable c02 = y6.c0(dp2, y6.w0(i21, u6Var));
            b7 N2 = f7.N(i21);
            frameLayout2.setBackground(c02);
            f7.k(frameLayout2, c02, N2, null, u6Var);
            frameLayout.addView(frameLayout2, kb1.h(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            int dp3 = AndroidUtilities.dp(9.5f);
            if (connectedbotstarref.revoked) {
                i18 = y6.wj;
            } else {
                i18 = y6.uj;
            }
            Drawable c03 = y6.c0(dp3, y6.w0(i18, u6Var));
            if (connectedbotstarref.revoked) {
                i19 = y6.wj;
            } else {
                i19 = y6.uj;
            }
            b7 N3 = f7.N(i19);
            textView.setBackground(c03);
            f7.k(textView, c03, N3, null, u6Var);
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            zq zqVar = new zq(R.drawable.mini_reply_user, 0);
            zqVar.setScale(0.937f, 0.937f);
            zqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            zqVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, kb1.h(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        d.addView(frameLayout, kb1.x(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i22 = y6.G6;
        f7.V(textView2, i22, u6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        d.addView(textView2, kb1.o(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp4 = AndroidUtilities.dp(28.0f);
        int i23 = y6.f23300a7;
        ShapeDrawable c04 = y6.c0(dp4, y6.w0(i23, u6Var));
        b7 N4 = f7.N(i23);
        linearLayout3.setBackground(c04);
        f7.k(linearLayout3, c04, N4, null, u6Var);
        y9 y9Var = new y9(context);
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        j9 j9Var = new j9((u6) null);
        linearLayout3.addView(y9Var, kb1.r(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        f7.V(textView3, i22, u6Var);
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        j9Var.r(user);
        y9Var.f(user, j9Var);
        linearLayout3.addView(textView3, kb1.x(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i24 = y6.f23615r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        f7.t(imageView2, i24, u6Var, mode);
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, kb1.x(-2, -2, 16, 5, 0, 8, 0));
        d.addView(linearLayout3, kb1.x(-2, 28, 1, 4, 0, 4, 0));
        kb1.b(linearLayout3);
        TextView textView4 = new TextView(context);
        f7.V(textView4, i22, u6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.t.n(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            i14 = i24;
            k3Var = i20;
            linearLayout = linearLayout3;
        } else {
            linearLayout = linearLayout3;
            if (j10 < 0) {
                int i25 = R.string.ChannelAffiliateProgramLinkTextChannel;
                k3Var = i20;
                String F0 = k.F0(connectedbotstarref.commission_permille);
                String userName = UserObject.getUserName(user);
                int i26 = connectedbotstarref.duration_months;
                if (i26 <= 0) {
                    formatPluralString2 = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    i14 = i24;
                    c11 = 0;
                } else {
                    i14 = i24;
                    if (i26 < 12 || i26 % 12 != 0) {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i26, new Object[0]);
                    } else {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i26 / 12, new Object[0]);
                    }
                }
                Object[] objArr = new Object[3];
                objArr[c11] = F0;
                objArr[1] = userName;
                objArr[2] = formatPluralString2;
                wh.o(i25, objArr, textView4);
            } else {
                i14 = i24;
                k3Var = i20;
                int i27 = R.string.ChannelAffiliateProgramLinkTextUser;
                String F02 = k.F0(connectedbotstarref.commission_permille);
                String userName2 = UserObject.getUserName(user);
                int i28 = connectedbotstarref.duration_months;
                if (i28 <= 0) {
                    formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    str = userName2;
                    i15 = 3;
                    c10 = 0;
                } else {
                    str = userName2;
                    if (i28 < 12 || i28 % 12 != 0) {
                        c10 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i28, new Object[0]);
                    } else {
                        c10 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i28 / 12, new Object[0]);
                    }
                    i15 = 3;
                }
                Object[] objArr2 = new Object[i15];
                objArr2[c10] = F02;
                objArr2[1] = str;
                objArr2[2] = formatPluralString;
                wh.o(i27, objArr2, textView4);
            }
        }
        d.addView(textView4, kb1.o(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (!connectedbotstarref.revoked) {
            TextView textView5 = new TextView(context);
            f7.V(textView5, i22, u6Var);
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            d.addView(textView5, kb1.o(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ShapeDrawable c05 = y6.c0(AndroidUtilities.dp(28.0f), y6.w0(i23, u6Var));
            b7 N5 = f7.N(i23);
            linearLayout4.setBackground(c05);
            f7.k(linearLayout4, c05, N5, null, u6Var);
            y9 y9Var2 = new y9(context);
            y9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            j9 j9Var2 = new j9((u6) null);
            linearLayout4.addView(y9Var2, kb1.r(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            f7.V(textView6, i22, u6Var);
            if (j10 >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                j9Var2.r(user2);
                y9Var2.f(user2, j9Var2);
                textView6.setText(UserObject.getUserName(user2));
                i16 = i23;
            } else {
                i16 = i23;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                j9Var2.q(chat);
                y9Var2.f(chat, j9Var2);
                if (chat == null) {
                    str3 = "";
                } else {
                    str3 = chat.title;
                }
                textView6.setText(str3);
            }
            linearLayout4.addView(textView6, kb1.x(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            f7.t(imageView3, i14, u6Var, mode);
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, kb1.x(-2, -2, 16, 2, 0, 5, 0));
            d.addView(linearLayout4, kb1.x(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        } else {
            i16 = i23;
            linearLayout2 = null;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        f7.V(textView7, i22, u6Var);
        int dp5 = AndroidUtilities.dp(8.0f);
        int i29 = i16;
        int w02 = y6.w0(i29, u6Var);
        int w03 = y6.w0(i29, u6Var);
        int i30 = y6.f23449i6;
        int v = y6.v(w03, y6.w0(i30, u6Var));
        org.telegram.ui.Cells.y j02 = y6.j0(dp5, dp5, dp5, dp5, w02, v, v);
        b7 N6 = f7.N(i29);
        b7 q5 = f7.q(i29, i30);
        textView7.setBackground(j02);
        f7.k(textView7, j02, N6, q5, u6Var);
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str4 = connectedbotstarref.url;
        if (str4 != null && str4.startsWith("https://")) {
            str2 = connectedbotstarref.url.substring(8);
        } else {
            str2 = connectedbotstarref.url;
        }
        textView7.setText(str2);
        d.addView(textView7, kb1.h(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        fi.d dVar = new fi.d(context, u6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new zq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.i(spannableStringBuilder2, false, true);
        } else {
            dVar.i(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        }
        d.addView(dVar, kb1.r(-1, 48));
        aa0 aa0Var = new aa0(context, u6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            i17 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i17 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j11, UserObject.getUserName(user));
        }
        aa0Var.setText(formatPluralString3);
        aa0Var.setGravity(17);
        aa0Var.setTextSize(i17, 12.0f);
        f7.V(aa0Var, y6.B6, u6Var);
        f7.H(aa0Var, y6.gc, u6Var);
        d.addView(aa0Var, kb1.x(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.k3 k3Var2 = k3Var;
        k3Var2.customView = d;
        ai.e0 e0Var = new ai.e0(connectedbotstarref, k3Var2, u6Var, user, 17);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new ai.s(e0Var, 28));
        }
        dVar.setOnClickListener(new t3(connectedbotstarref, i10, k3Var2, context, j10, u6Var, e0Var));
        k3Var2.setOnDismissListener(new fi.e1(7));
        if (linearLayout2 != null) {
            bi.m0.g(i10).n();
            bi.m0.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new t3(i10, k3Var2, u6Var, linearLayout5, j10, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new bi.q(19, k3Var2, connectedbotstarref2));
        k3Var2.fixNavigationBarKey(y6.f23428h5);
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            k3Var2.makeAttached(U);
        }
        k3Var2.show();
        return k3Var2;
    }

    public static void w0(d4 d4Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d4Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = string;
        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new ai.f0(15, d4Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void x0(d4 d4Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(d4Var.getParentActivity(), 3, null);
        e2Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(d4Var.currentAccount).getInputPeer(d4Var.R);
        editconnectedstarrefbot.revoked = true;
        d4Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new bi.j(17, d4Var, e2Var));
    }

    public static void y0(d4 d4Var, Context context, int i10) {
        v3 v3Var = d4Var.V;
        if (v3Var != null) {
            Object obj = v3Var.G(i10).G;
            if (obj instanceof TL_payments.starRefProgram) {
                F0(context, d4Var.currentAccount, (TL_payments.starRefProgram) obj, d4Var.R, d4Var.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                G0(context, d4Var.currentAccount, (TL_payments.connectedBotStarRef) obj, d4Var.R, d4Var.resourceProvider);
            }
        }
    }

    public static void z0(d4 d4Var, TLObject tLObject, org.telegram.ui.ActionBar.e2 e2Var) {
        long j10 = d4Var.R;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            bi.j0 d = bi.m0.g(d4Var.currentAccount).d(j10);
            ArrayList arrayList = d.e;
            int i10 = d.f4855a;
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
                            d.f4857c = Math.max(d.f4857c - 1, 0);
                        } else {
                            arrayList.set(i12, connectedbotstarref);
                        }
                    } else {
                        i12++;
                    }
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.f4856b));
            d.a();
            bi.k0 e = bi.m0.g(d4Var.currentAccount).e(j10);
            e.f4928c = 0;
            e.d = false;
            e.f4931i = false;
            e.f4929f = 0L;
            e.f4932j = null;
            e.h = false;
            e.a();
            d4Var.V.O(true);
        }
        e2Var.dismiss();
    }

    public final void E0(java.util.ArrayList r18, org.telegram.ui.Components.k71 r19) {
        throw new UnsupportedOperationException("Method not decompiled: hi.d4.E0(java.util.ArrayList, org.telegram.ui.Components.k71):void");
    }

    @Override
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        vn vnVar = new vn(context, 3);
        this.U = vnVar;
        f7.i(y6.f23448i5, vnVar, null);
        super.createView(context);
        this.S = new FrameLayout(context);
        ug.n nVar = new ug.n(context, 1, 3);
        this.T = nVar;
        nVar.setImportantForAccessibility(4);
        ug.g gVar = this.T.f49851b;
        gVar.f49835z = y6.fk;
        gVar.A = y6.gk;
        gVar.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, kb1.h(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        f0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.S, null);
        this.f39131c.setOnItemClickListener(new di.x4(2, this, context));
        this.f39131c.setOnItemLongClickListener(new ai.f0(16, this, context));
        s4.l lVar = new s4.l();
        lVar.f47798m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.f39131c.setItemAnimator(lVar);
        this.f39131c.setOnScrollListener(new ai.b(this, 13));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v3 v3Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j10 = this.R;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == j10) {
                v3 v3Var2 = this.V;
                if (v3Var2 != null) {
                    v3Var2.O(true);
                }
                bi.m0.g(this.currentAccount).d(j10).a();
            }
        } else if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j10 && (v3Var = this.V) != null) {
            v3Var.O(true);
        }
    }

    @Override
    public final s4.h0 g0() {
        v3 v3Var = new v3(this, this.f39131c, getParentActivity(), this.currentAccount, this.classGuid, new e2(this, 1), getResourceProvider());
        this.V = v3Var;
        return v3Var;
    }

    @Override
    public final tg.x1 i0() {
        e eVar = new e(getParentActivity(), 1);
        eVar.c();
        return eVar;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
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
        ug.n nVar = this.T;
        if (nVar != null) {
            nVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ug.n nVar = this.T;
        if (nVar != null) {
            nVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }
}
