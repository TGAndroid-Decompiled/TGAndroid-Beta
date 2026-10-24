package gi;

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
import ci.x4;
import ei.p6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.tl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.zr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b20;
import w7.b6;
import w7.z5;
public final class u3 extends b20 implements NotificationCenter.NotificationCenterDelegate {
    public final long R;
    public FrameLayout S;
    public tg.n T;
    public sn U;
    public m3 V;

    public u3(long j10) {
        this.R = j10;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static void A0(u3 u3Var, Context context, int i10) {
        m3 m3Var = u3Var.V;
        if (m3Var != null) {
            Object obj = m3Var.G(i10).G;
            if (obj instanceof TL_payments.starRefProgram) {
                H0(context, u3Var.currentAccount, (TL_payments.starRefProgram) obj, u3Var.R, u3Var.resourceProvider, false);
            } else if (obj instanceof TL_payments.connectedBotStarRef) {
                I0(context, u3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, u3Var.R, u3Var.resourceProvider);
            }
        }
    }

    public static void B0(u3 u3Var, TLObject tLObject, org.telegram.ui.ActionBar.c2 c2Var) {
        long j10 = u3Var.R;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            ai.h0 d = ai.k0.g(u3Var.currentAccount).d(j10);
            ArrayList arrayList = d.e;
            int i10 = d.f1377a;
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
                            d.f1379c = Math.max(d.f1379c - 1, 0);
                        } else {
                            arrayList.set(i12, connectedbotstarref);
                        }
                    } else {
                        i12++;
                    }
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.f1378b));
            d.a();
            ai.i0 e = ai.k0.g(u3Var.currentAccount).e(j10);
            e.f1451c = 0;
            e.d = false;
            e.f1454i = false;
            e.f1452f = 0L;
            e.f1455j = null;
            e.h = false;
            e.a();
            u3Var.V.N(true);
        }
        c2Var.dismiss();
    }

    public static boolean C0(u3 u3Var, Context context, View view, int i10) {
        m3 m3Var = u3Var.V;
        if (m3Var != null) {
            Object obj = m3Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(u3Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                h80 H = h80.H(u3Var, view);
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

    public static void H0(android.content.Context r35, int r36, final org.telegram.tgnet.tl.TL_payments.starRefProgram r37, long r38, org.telegram.ui.ActionBar.g6 r40, boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: gi.u3.H0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.g6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.h3 I0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j10, g6 g6Var) {
        int i11;
        int i12;
        int i13;
        float f7;
        float f10;
        ImageView.ScaleType scaleType;
        LinearLayout linearLayout;
        int i14;
        org.telegram.ui.ActionBar.h3 h3Var;
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
        org.telegram.ui.ActionBar.h3 j11 = tl.j(1, context, g6Var, false);
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout e = tl.e(context, 1);
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        e.setClipChildren(false);
        e.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        int dp = AndroidUtilities.dp(40.0f);
        if (connectedbotstarref.revoked) {
            i11 = k6.wj;
        } else {
            i11 = k6.Oh;
        }
        Drawable K = k6.K(dp, k6.w0(i11, g6Var));
        if (connectedbotstarref.revoked) {
            i12 = k6.wj;
        } else {
            i12 = k6.Oh;
        }
        n6 O = r6.O(i12);
        view.setBackground(K);
        r6.k(view, K, O, null, g6Var);
        frameLayout.addView(view, z5.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
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
        frameLayout.addView(imageView, z5.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            int dp2 = AndroidUtilities.dp(50.0f);
            int i20 = k6.f21255h5;
            Drawable c02 = k6.c0(dp2, k6.w0(i20, g6Var));
            n6 O2 = r6.O(i20);
            frameLayout2.setBackground(c02);
            r6.k(frameLayout2, c02, O2, null, g6Var);
            frameLayout.addView(frameLayout2, z5.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            int dp3 = AndroidUtilities.dp(9.5f);
            if (connectedbotstarref.revoked) {
                i18 = k6.wj;
            } else {
                i18 = k6.uj;
            }
            Drawable c03 = k6.c0(dp3, k6.w0(i18, g6Var));
            if (connectedbotstarref.revoked) {
                i19 = k6.wj;
            } else {
                i19 = k6.uj;
            }
            n6 O3 = r6.O(i19);
            textView.setBackground(c03);
            r6.k(textView, c03, O3, null, g6Var);
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            vq vqVar = new vq(R.drawable.mini_reply_user, 0);
            vqVar.setScale(0.937f, 0.937f);
            vqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            vqVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(vqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, z5.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        e.addView(frameLayout, z5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i21 = k6.G6;
        r6.W(textView2, i21, g6Var);
        textView2.setTextSize(1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        e.addView(textView2, z5.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp4 = AndroidUtilities.dp(28.0f);
        int i22 = k6.f21126a7;
        ShapeDrawable c04 = k6.c0(dp4, k6.w0(i22, g6Var));
        n6 O4 = r6.O(i22);
        linearLayout3.setBackground(c04);
        r6.k(linearLayout3, c04, O4, null, g6Var);
        u9 u9Var = new u9(context);
        u9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        f9 f9Var = new f9((g6) null);
        linearLayout3.addView(u9Var, z5.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        r6.W(textView3, i21, g6Var);
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        f9Var.r(user);
        u9Var.e(user, f9Var);
        linearLayout3.addView(textView3, z5.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i23 = k6.f21440r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        r6.t(imageView2, i23, g6Var, mode);
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, z5.t(-2, -2, 16, 5, 0, 8, 0));
        e.addView(linearLayout3, z5.t(-2, 28, 1, 4, 0, 4, 0));
        b6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        r6.W(textView4, i21, g6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.v0.m(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            i14 = i23;
            h3Var = j11;
            linearLayout = linearLayout3;
        } else {
            linearLayout = linearLayout3;
            if (j10 < 0) {
                int i24 = R.string.ChannelAffiliateProgramLinkTextChannel;
                h3Var = j11;
                String H0 = l.H0(connectedbotstarref.commission_permille);
                String userName = UserObject.getUserName(user);
                int i25 = connectedbotstarref.duration_months;
                if (i25 <= 0) {
                    formatPluralString2 = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    i14 = i23;
                    c11 = 0;
                } else {
                    i14 = i23;
                    if (i25 < 12 || i25 % 12 != 0) {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i25, new Object[0]);
                    } else {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i25 / 12, new Object[0]);
                    }
                }
                Object[] objArr = new Object[3];
                objArr[c11] = H0;
                objArr[1] = userName;
                objArr[2] = formatPluralString2;
                tl.r(i24, objArr, textView4);
            } else {
                i14 = i23;
                h3Var = j11;
                int i26 = R.string.ChannelAffiliateProgramLinkTextUser;
                String H02 = l.H0(connectedbotstarref.commission_permille);
                String userName2 = UserObject.getUserName(user);
                int i27 = connectedbotstarref.duration_months;
                if (i27 <= 0) {
                    formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    str = userName2;
                    i15 = 3;
                    c10 = 0;
                } else {
                    str = userName2;
                    if (i27 < 12 || i27 % 12 != 0) {
                        c10 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i27, new Object[0]);
                    } else {
                        c10 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i27 / 12, new Object[0]);
                    }
                    i15 = 3;
                }
                Object[] objArr2 = new Object[i15];
                objArr2[c10] = H02;
                objArr2[1] = str;
                objArr2[2] = formatPluralString;
                tl.r(i26, objArr2, textView4);
            }
        }
        e.addView(textView4, z5.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (!connectedbotstarref.revoked) {
            TextView textView5 = new TextView(context);
            r6.W(textView5, i21, g6Var);
            textView5.setTextSize(1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            e.addView(textView5, z5.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            ShapeDrawable c05 = k6.c0(AndroidUtilities.dp(28.0f), k6.w0(i22, g6Var));
            n6 O5 = r6.O(i22);
            linearLayout4.setBackground(c05);
            r6.k(linearLayout4, c05, O5, null, g6Var);
            u9 u9Var2 = new u9(context);
            u9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            f9 f9Var2 = new f9((g6) null);
            linearLayout4.addView(u9Var2, z5.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            r6.W(textView6, i21, g6Var);
            if (j10 >= 0) {
                TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                f9Var2.r(user2);
                u9Var2.e(user2, f9Var2);
                textView6.setText(UserObject.getUserName(user2));
                i16 = i22;
            } else {
                i16 = i22;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                f9Var2.q(chat);
                u9Var2.e(chat, f9Var2);
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
            r6.t(imageView3, i14, g6Var, mode);
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, z5.t(-2, -2, 16, 2, 0, 5, 0));
            e.addView(linearLayout4, z5.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        } else {
            i16 = i22;
            linearLayout2 = null;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        r6.W(textView7, i21, g6Var);
        int dp5 = AndroidUtilities.dp(8.0f);
        int i28 = i16;
        int w02 = k6.w0(i28, g6Var);
        int w03 = k6.w0(i28, g6Var);
        int i29 = k6.f21273i6;
        int v = k6.v(w03, k6.w0(i29, g6Var));
        org.telegram.ui.Cells.y j02 = k6.j0(dp5, dp5, dp5, dp5, w02, v, v);
        n6 O6 = r6.O(i28);
        n6 q6 = r6.q(i28, i29);
        textView7.setBackground(j02);
        r6.k(textView7, j02, O6, q6, g6Var);
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str4 = connectedbotstarref.url;
        if (str4 != null && str4.startsWith("https://")) {
            str2 = connectedbotstarref.url.substring(8);
        } else {
            str2 = connectedbotstarref.url;
        }
        textView7.setText(str2);
        e.addView(textView7, z5.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        ei.d dVar = new ei.d(context, g6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new vq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.i(spannableStringBuilder2, false, true);
        } else {
            dVar.i(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        }
        e.addView(dVar, z5.n(-1, 48));
        w90 w90Var = new w90(context, g6Var);
        long j12 = connectedbotstarref.participants;
        if (j12 <= 0) {
            i17 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i17 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j12, UserObject.getUserName(user));
        }
        w90Var.setText(formatPluralString3);
        w90Var.setGravity(17);
        w90Var.setTextSize(i17, 12.0f);
        r6.W(w90Var, k6.B6, g6Var);
        r6.I(w90Var, k6.f21243gc, g6Var);
        e.addView(w90Var, z5.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
        h3Var2.customView = e;
        ai.y0 y0Var = new ai.y0(connectedbotstarref, h3Var2, g6Var, user, 14);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new ah.g0(y0Var, 27));
        }
        dVar.setOnClickListener(new k3(connectedbotstarref, i10, h3Var2, context, j10, g6Var, y0Var));
        h3Var2.setOnDismissListener(new ei.e1(6));
        if (linearLayout2 != null) {
            ai.k0.g(i10).n();
            ai.k0.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new k3(i10, h3Var2, g6Var, linearLayout5, j10, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
        }
        linearLayout.setOnClickListener(new ai.p(19, h3Var2, connectedbotstarref2));
        h3Var2.fixNavigationBarKey(k6.f21255h5);
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            h3Var2.makeAttached(U);
        }
        h3Var2.show();
        return h3Var2;
    }

    public static void y0(u3 u3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u3Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = string;
        c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new ah.h0(13, u3Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }

    public static void z0(u3 u3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(u3Var.getParentActivity(), 3, null);
        c2Var.r(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(u3Var.currentAccount).getInputPeer(u3Var.R);
        editconnectedstarrefbot.revoked = true;
        u3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new ai.g(16, u3Var, c2Var));
    }

    public final void G0(java.util.ArrayList r18, org.telegram.ui.Components.a71 r19) {
        throw new UnsupportedOperationException("Method not decompiled: gi.u3.G0(java.util.ArrayList, org.telegram.ui.Components.a71):void");
    }

    @Override
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        sn snVar = new sn(context, 3);
        this.U = snVar;
        r6.i(k6.f21272i5, snVar, null);
        super.createView(context);
        this.S = new FrameLayout(context);
        tg.n nVar = new tg.n(context, 1, 3);
        this.T = nVar;
        nVar.setImportantForAccessibility(4);
        tg.g gVar = this.T.f47546b;
        gVar.f47530z = k6.fk;
        gVar.A = k6.gk;
        gVar.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, z5.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.S, null);
        this.f35894c.setOnItemClickListener(new x4(2, this, context));
        this.f35894c.setOnItemLongClickListener(new ah.h0(14, this, context));
        s4.k kVar = new s4.k();
        kVar.f46376m = false;
        kVar.C = false;
        kVar.o(zr.h);
        kVar.n(350L);
        this.f35894c.setItemAnimator(kVar);
        this.f35894c.setOnScrollListener(new ah.d0(this, 9));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        m3 m3Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j10 = this.R;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() == j10) {
                m3 m3Var2 = this.V;
                if (m3Var2 != null) {
                    m3Var2.N(true);
                }
                ai.k0.g(this.currentAccount).d(j10).a();
            }
        } else if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j10 && (m3Var = this.V) != null) {
            m3Var.N(true);
        }
    }

    @Override
    public final s4.g0 n0() {
        m3 m3Var = new m3(this, this.f35894c, getParentActivity(), this.currentAccount, this.classGuid, new ai.q(this, 28), getResourceProvider());
        this.V = m3Var;
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
        tg.n nVar = this.T;
        if (nVar != null) {
            nVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        tg.n nVar = this.T;
        if (nVar != null) {
            nVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    @Override
    public final sg.x1 p0() {
        f fVar = new f(getParentActivity(), 1);
        fVar.c();
        return fVar;
    }
}
