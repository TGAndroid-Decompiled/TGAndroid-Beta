package ei;

import ai.h5;
import ai.n6;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.y8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.y70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m20;
import w7.a6;
import w7.y5;
public final class e4 extends m20 implements NotificationCenter.NotificationCenterDelegate {
    public final long P;
    public FrameLayout Q;
    public sg.e R;
    public ln S;
    public w3 T;

    public e4(long j3) {
        this.P = j3;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static void A0(e4 e4Var, TLObject tLObject, org.telegram.ui.ActionBar.a2 a2Var) {
        long j3 = e4Var.P;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            yh.l d = yh.o.g(e4Var.currentAccount).d(j3);
            ArrayList arrayList = d.e;
            int i10 = d.f47630a;
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
                            d.f47632c = Math.max(d.f47632c - 1, 0);
                        } else {
                            arrayList.set(i12, connectedbotstarref);
                        }
                    } else {
                        i12++;
                    }
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(d.f47631b));
            d.a();
            yh.m e = yh.o.g(e4Var.currentAccount).e(j3);
            e.f47698c = 0;
            e.d = false;
            e.f47701i = false;
            e.f47699f = 0L;
            e.f47702j = null;
            e.h = false;
            e.a();
            e4Var.T.N(true);
        }
        a2Var.dismiss();
    }

    public static boolean B0(e4 e4Var, Context context, View view, int i10) {
        w3 w3Var = e4Var.T;
        if (w3Var != null) {
            Object obj = w3Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(e4Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                y70 H = y70.H(e4Var, view);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new y8(19, e4Var, user), user.bot_has_main_app);
                H.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new y8(20, e4Var, connectedbotstarref), !user.bot_has_main_app);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new a3.k0(e4Var, connectedbotstarref, user, 27), false);
                H.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new h5(e4Var, context, user, connectedbotstarref, 9));
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

    public static void G0(android.content.Context r36, int r37, final org.telegram.tgnet.tl.TL_payments.starRefProgram r38, long r39, org.telegram.ui.ActionBar.d6 r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: ei.e4.G0(android.content.Context, int, org.telegram.tgnet.tl.TL_payments$starRefProgram, long, org.telegram.ui.ActionBar.d6, boolean):void");
    }

    public static org.telegram.ui.ActionBar.e3 H0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j3, d6 d6Var) {
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
        d6 d6Var2;
        int i16;
        PorterDuff.Mode mode;
        String str3;
        int i17;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.e3 j11 = ok.j(1, context, d6Var, false);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        LinearLayout f11 = ok.f(context, 1);
        f11.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        f11.setClipChildren(false);
        f11.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        View view = new View(context);
        int dp = AndroidUtilities.dp(40.0f);
        if (connectedbotstarref.revoked) {
            i11 = h6.wj;
        } else {
            i11 = h6.Oh;
        }
        view.setBackground(h6.K(dp, h6.v0(i11, d6Var)));
        frameLayout.addView(view, y5.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
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
        frameLayout.addView(imageView, y5.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(h6.b0(AndroidUtilities.dp(50.0f), h6.v0(h6.f19129h5, d6Var)));
            frameLayout.addView(frameLayout2, y5.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            int dp2 = AndroidUtilities.dp(9.5f);
            if (connectedbotstarref.revoked) {
                i17 = h6.wj;
            } else {
                i17 = h6.uj;
            }
            textView.setBackground(h6.b0(dp2, h6.v0(i17, d6Var)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            pq pqVar = new pq(R.drawable.mini_reply_user, 0);
            pqVar.setScale(0.937f, 0.937f);
            pqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            pqVar.spaceScaleX = 0.8f;
            scaleType = scaleType2;
            spannableStringBuilder.setSpan(pqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, y5.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        } else {
            scaleType = scaleType2;
        }
        f11.addView(frameLayout, y5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i18 = h6.G6;
        ok.n(i18, d6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        f11.addView(textView2, y5.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        int dp3 = AndroidUtilities.dp(28.0f);
        int i19 = h6.f19003a7;
        linearLayout3.setBackground(h6.b0(dp3, h6.v0(i19, d6Var)));
        w9 w9Var = new w9(context);
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        h9 h9Var = new h9((d6) null);
        linearLayout3.addView(w9Var, y5.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(h6.v0(i18, d6Var));
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        h9Var.r(user2);
        w9Var.e(user2, h9Var);
        linearLayout3.addView(textView3, y5.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        ImageView.ScaleType scaleType3 = scaleType;
        imageView2.setScaleType(scaleType3);
        int i20 = h6.f19315r5;
        int v02 = h6.v0(i20, d6Var);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(v02, mode2));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout3.addView(imageView2, y5.t(-2, -2, 16, 5, 0, 8, 0));
        f11.addView(linearLayout3, y5.t(-2, 28, 1, 4, 0, 4, 0));
        a6.a(linearLayout3);
        TextView textView4 = new TextView(context);
        ok.n(i18, d6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.f0.m(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            user = user2;
            linearLayout = linearLayout3;
        } else {
            user = user2;
            if (j3 < 0) {
                int i21 = R.string.ChannelAffiliateProgramLinkTextChannel;
                String G0 = l.G0(connectedbotstarref.commission_permille);
                String userName = UserObject.getUserName(user);
                int i22 = connectedbotstarref.duration_months;
                if (i22 <= 0) {
                    formatPluralString2 = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    linearLayout = linearLayout3;
                    c11 = 0;
                } else {
                    linearLayout = linearLayout3;
                    if (i22 < 12 || i22 % 12 != 0) {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i22, new Object[0]);
                    } else {
                        c11 = 0;
                        formatPluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i22 / 12, new Object[0]);
                    }
                }
                Object[] objArr = new Object[3];
                objArr[c11] = G0;
                objArr[1] = userName;
                objArr[2] = formatPluralString2;
                ok.q(i21, objArr, textView4);
            } else {
                linearLayout = linearLayout3;
                int i23 = R.string.ChannelAffiliateProgramLinkTextUser;
                String G02 = l.G0(connectedbotstarref.commission_permille);
                String userName2 = UserObject.getUserName(user);
                int i24 = connectedbotstarref.duration_months;
                if (i24 <= 0) {
                    formatPluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    str = userName2;
                    i13 = 3;
                    c10 = 0;
                } else {
                    str = userName2;
                    if (i24 < 12 || i24 % 12 != 0) {
                        c10 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i24, new Object[0]);
                    } else {
                        c10 = 0;
                        formatPluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i24 / 12, new Object[0]);
                    }
                    i13 = 3;
                }
                Object[] objArr2 = new Object[i13];
                objArr2[c10] = G02;
                objArr2[1] = str;
                objArr2[2] = formatPluralString;
                ok.q(i23, objArr2, textView4);
            }
        }
        f11.addView(textView4, y5.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (!connectedbotstarref.revoked) {
            TextView textView5 = new TextView(context);
            ok.n(i18, d6Var, textView5, 1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            f11.addView(textView5, y5.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(h6.b0(AndroidUtilities.dp(28.0f), h6.v0(i19, d6Var)));
            w9 w9Var2 = new w9(context);
            w9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            h9 h9Var2 = new h9((d6) null);
            linearLayout4.addView(w9Var2, y5.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(h6.v0(i18, d6Var));
            if (j3 >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                h9Var2.r(user3);
                w9Var2.e(user3, h9Var2);
                textView6.setText(UserObject.getUserName(user3));
                i14 = i18;
                i16 = i20;
                mode = mode2;
                j10 = j3;
            } else {
                i14 = i18;
                i16 = i20;
                mode = mode2;
                j10 = j3;
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                h9Var2.q(chat);
                w9Var2.e(chat, h9Var2);
                if (chat == null) {
                    str3 = "";
                } else {
                    str3 = chat.title;
                }
                textView6.setText(str3);
            }
            linearLayout4.addView(textView6, y5.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType3);
            imageView3.setColorFilter(new PorterDuffColorFilter(h6.v0(i16, d6Var), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout4.addView(imageView3, y5.t(-2, -2, 16, 2, 0, 5, 0));
            f11.addView(linearLayout4, y5.t(-2, 28, 1, 0, 9, 0, 22));
            linearLayout2 = linearLayout4;
        } else {
            j10 = j3;
            i14 = i18;
            linearLayout2 = null;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(h6.v0(i14, d6Var));
        int dp4 = AndroidUtilities.dp(8.0f);
        int v03 = h6.v0(i19, d6Var);
        int v = h6.v(h6.v0(i19, d6Var), h6.v0(h6.f19148i6, d6Var));
        textView7.setBackground(h6.i0(dp4, dp4, dp4, dp4, v03, v, v));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str4 = connectedbotstarref.url;
        if (str4 != null && str4.startsWith("https://")) {
            str2 = connectedbotstarref.url.substring(8);
        } else {
            str2 = connectedbotstarref.url;
        }
        textView7.setText(str2);
        f11.addView(textView7, y5.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        ci.d dVar = new ci.d(context, d6Var, true);
        if (!connectedbotstarref.revoked) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new pq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.g(spannableStringBuilder2, false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        }
        f11.addView(dVar, y5.n(-1, 48));
        n90 n90Var = new n90(context, d6Var);
        long j12 = connectedbotstarref.participants;
        if (j12 <= 0) {
            i15 = 1;
            formatPluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i15 = 1;
            formatPluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j12, UserObject.getUserName(user));
        }
        n90Var.setText(formatPluralString3);
        n90Var.setGravity(17);
        n90Var.setTextSize(i15, 12.0f);
        n90Var.setTextColor(h6.v0(h6.B6, d6Var));
        n90Var.setLinkTextColor(h6.v0(h6.gc, d6Var));
        f11.addView(n90Var, y5.t(-1, -2, 49, 14, 12, 14, 2));
        j11.customView = f11;
        h5 h5Var = new h5(connectedbotstarref, j11, d6Var, user, 8);
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new ai.v0(h5Var, 16));
        }
        dVar.setOnClickListener(new u3(connectedbotstarref, i10, j11, context, j10, d6Var, h5Var));
        j11.setOnDismissListener(new ci.f1(6));
        if (linearLayout2 != null) {
            yh.o.g(i10).n();
            yh.o.g(i10).o();
            LinearLayout linearLayout5 = linearLayout2;
            d6Var2 = d6Var;
            connectedbotstarref2 = connectedbotstarref;
            linearLayout5.setOnClickListener(new u3(i10, j11, d6Var, linearLayout5, j3, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            d6Var2 = d6Var;
        }
        linearLayout.setOnClickListener(new ai.f2(9, j11, connectedbotstarref2));
        j11.fixNavigationBar(h6.v0(h6.f19129h5, d6Var2));
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
            j11.makeAttached(U);
        }
        j11.show();
        return j11;
    }

    public static void x0(e4 e4Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e4Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new ah.b(10, e4Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static void y0(e4 e4Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(e4Var.getParentActivity(), 3, null);
        a2Var.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(e4Var.currentAccount).getInputPeer(e4Var.P);
        editconnectedstarrefbot.revoked = true;
        e4Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new ai.v1(9, e4Var, a2Var));
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

    public final void F0(java.util.ArrayList r18, org.telegram.ui.Components.j61 r19) {
        throw new UnsupportedOperationException("Method not decompiled: ei.e4.F0(java.util.ArrayList, org.telegram.ui.Components.j61):void");
    }

    @Override
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        ln lnVar = new ln(context, 3);
        this.S = lnVar;
        lnVar.setBackgroundColor(h6.w0(null, h6.f19147i5, false));
        super.createView(context);
        this.Q = new FrameLayout(context);
        sg.e eVar = new sg.e(context, 1, 3);
        this.R = eVar;
        eVar.setImportantForAccessibility(4);
        sg.a aVar = this.R.f43225b;
        aVar.f43213w = h6.fk;
        aVar.f43214x = h6.gk;
        aVar.b();
        this.R.setStarParticlesView(this.e);
        this.Q.addView(this.R, y5.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.Q, null);
        this.f35449c.setOnItemClickListener(new n6(2, this, context));
        this.f35449c.setOnItemLongClickListener(new ah.b(11, this, context));
        s4.j jVar = new s4.j();
        jVar.f42995m = false;
        jVar.C = false;
        jVar.o(rr.h);
        jVar.n(350L);
        this.f35449c.setItemAnimator(jVar);
        this.f35449c.setOnScrollListener(new ai.r(this, 4));
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
                yh.o.g(this.currentAccount).d(j3).a();
            }
        } else if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j3 && (w3Var = this.T) != null) {
            w3Var.N(true);
        }
    }

    @Override
    public final s4.h0 n0() {
        w3 w3Var = new w3(this, this.f35449c, getParentActivity(), this.currentAccount, this.classGuid, new bi.v(this, 17), getResourceProvider());
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
        sg.e eVar = this.R;
        if (eVar != null) {
            eVar.setPaused(true);
            this.R.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        sg.e eVar = this.R;
        if (eVar != null) {
            eVar.setPaused(false);
            this.R.setDialogVisible(false);
        }
    }

    @Override
    public final rg.w1 p0() {
        f fVar = new f(getParentActivity(), 1);
        fVar.b();
        return fVar;
    }
}
