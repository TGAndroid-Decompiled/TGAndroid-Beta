package nh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.b6;
import h7.z5;
import hh.oa;
import hh.u8;
import java.util.ArrayList;
import lh.a8;
import lh.c5;
import lh.k7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.zm;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a20;

public final class s3 extends a20 implements NotificationCenter.NotificationCenterDelegate {
    public final long L;
    public FrameLayout M;
    public bg.i N;
    public zm O;
    public k3 P;

    public s3(long j10) {
        this.L = j10;
        this.I = true;
        this.H = AndroidUtilities.dp(60.0f);
    }

    public static void A0(s3 s3Var, TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var) {
        long j10 = s3Var.L;
        if (tLObject instanceof TL_payments.connectedStarRefBots) {
            TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
            hh.z zVarD = hh.c0.g(s3Var.currentAccount).d(j10);
            ArrayList arrayList = zVarD.f10398e;
            int i10 = zVarD.f10395a;
            MessagesController.getInstance(i10).putUsers(connectedstarrefbots.users, false);
            for (int i11 = 0; i11 < connectedstarrefbots.connected_bots.size(); i11++) {
                TL_payments.connectedBotStarRef connectedbotstarref = connectedstarrefbots.connected_bots.get(i11);
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (((TL_payments.connectedBotStarRef) arrayList.get(i12)).bot_id == connectedbotstarref.bot_id) {
                        if (connectedbotstarref.revoked) {
                            arrayList.remove(i12);
                            zVarD.f10397c = Math.max(zVarD.f10397c - 1, 0);
                            break;
                        } else {
                            arrayList.set(i12, connectedbotstarref);
                            break;
                        }
                    }
                }
            }
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(zVarD.f10396b));
            zVarD.a();
            hh.a0 a0VarE = hh.c0.g(s3Var.currentAccount).e(j10);
            a0VarE.f8936c = 0;
            a0VarE.d = false;
            a0VarE.f8940i = false;
            a0VarE.f8938f = 0L;
            a0VarE.f8941j = null;
            a0VarE.h = false;
            a0VarE.a();
            s3Var.P.N(true);
        }
        b2Var.dismiss();
    }

    public static boolean B0(s3 s3Var, Context context, View view, int i10) {
        k3 k3Var = s3Var.P;
        if (k3Var != null) {
            Object obj = k3Var.G(i10).G;
            if (obj instanceof TL_payments.connectedBotStarRef) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                TLRPC.User user = MessagesController.getInstance(s3Var.currentAccount).getUser(Long.valueOf(connectedbotstarref.bot_id));
                b70 b70VarH = b70.H(s3Var, view);
                b70VarH.l(R.drawable.msg_bot, LocaleController.getString(R.string.ProfileBotOpenApp), new k7(13, s3Var, user), user.bot_has_main_app);
                b70VarH.l(R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new k7(14, s3Var, connectedbotstarref), !user.bot_has_main_app);
                b70VarH.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new j3.m(s3Var, connectedbotstarref, user, 22), false);
                b70VarH.m(!connectedbotstarref.revoked, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveAffiliateLinkButton), true, new androidx.car.app.utils.b(s3Var, context, user, connectedbotstarref, 19));
                b70VarH.V(5);
                b70VarH.Z();
                return true;
            }
        }
        return false;
    }

    public static void G0(Context context, int i10, final TL_payments.starRefProgram starrefprogram, long j10, c6 c6Var, boolean z10) {
        float f10;
        ?? r14;
        String pluralString;
        LinearLayout linearLayout;
        n9 n9Var;
        TextView textView;
        gh.e1 e1Var;
        c6 c6Var2;
        if (starrefprogram == null || context == null) {
            return;
        }
        final org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var, false, false);
        long[] jArr = {j10};
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(starrefprogram.bot_id));
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        linearLayoutG.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayoutG.setClipChildren(false);
        linearLayoutG.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipToPadding(false);
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, z5.d(60, 60.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        n9 n9Var2 = new n9(context);
        n9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        y8 y8Var = new y8((c6) null);
        y8Var.r(user);
        n9Var2.e(user, y8Var);
        b6.a(n9Var2);
        frameLayout2.addView(n9Var2, z5.e(60, 60, 119));
        if (starrefprogram.daily_revenue_per_user.positive()) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(g6.b0(AndroidUtilities.dp(10.0f), g6.v0(g6.f23124h5, c6Var)));
            frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
            TextView textView2 = new TextView(context);
            textView2.setBackground(g6.b0(AndroidUtilities.dp(10.0f), g6.v0(g6.uj, c6Var)));
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 10.0f);
            f10 = 10.0f;
            textView2.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
            textView2.setTextColor(-1);
            textView2.setGravity(17);
            textView2.setText(oa.R0("⭐️ " + ((Object) oa.K0(starrefprogram.daily_revenue_per_user, 1.0f, ',')), 0.75f, new cq[1]));
            frameLayout3.addView(textView2, z5.c(15.66f, -2));
            frameLayout2.addView(frameLayout3, z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        } else {
            f10 = 10.0f;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setTranslationX(-AndroidUtilities.dp(2.0825f));
        int iV0 = g6.v0(g6.E6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(iV0, mode));
        frameLayout.addView(imageView, z5.d(36, 60.0f, 17, 60.0f, 0.0f, 60.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        frameLayout4.setClipToPadding(false);
        frameLayout4.setClipChildren(false);
        frameLayout.addView(frameLayout4, z5.d(60, 60.0f, 21, 0.0f, 0.0f, 5.66f, 0.0f));
        n9 n9Var3 = new n9(context);
        n9Var3.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout4.addView(n9Var3, z5.e(60, 60, 119));
        FrameLayout frameLayout5 = new FrameLayout(context);
        int iDp = AndroidUtilities.dp(f10);
        int i11 = g6.f23124h5;
        frameLayout5.setBackground(g6.b0(iDp, g6.v0(i11, c6Var)));
        frameLayout5.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
        TextView textView3 = new TextView(context);
        textView3.setBackground(g6.b0(AndroidUtilities.dp(f10), g6.v0(g6.Oh, c6Var)));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 10.0f);
        textView3.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        SpannableString spannableString = new SpannableString("s " + ((Object) k.G0(starrefprogram.commission_permille)));
        cq cqVar = new cq(R.drawable.msg_link_1, 0);
        cqVar.setScale(0.65f, 0.65f);
        cqVar.spaceScaleX = 0.7f;
        cqVar.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(0.0f));
        spannableString.setSpan(cqVar, 0, 1, 33);
        textView3.setText(spannableString);
        frameLayout5.addView(textView3, z5.c(15.66f, -2));
        frameLayout4.addView(frameLayout5, z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, -4.0f));
        linearLayoutG.addView(frameLayout, z5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView4 = new TextView(context);
        int i12 = g6.G6;
        rl.l(i12, c6Var, textView4, 1, 20.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.ChannelAffiliateProgramJoinTitle));
        textView4.setTypeface(AndroidUtilities.bold());
        linearLayoutG.addView(textView4, z5.k(0.0f, 21.0f, 0.0f, 9.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int iDp2 = AndroidUtilities.dp(28.0f);
        int i13 = g6.f22999a7;
        linearLayout2.setBackground(g6.b0(iDp2, g6.v0(i13, c6Var)));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setTextColor(g6.v0(i12, c6Var));
        textView5.setText(LocaleController.formatString(R.string.ChannelAffiliateProgramJoinViewBot, DialogObject.getName(i10, starrefprogram.bot_id)));
        linearLayout2.addView(textView5, z5.t(-2, -2, 16, 11, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i14 = g6.f23300r5;
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(i14, c6Var), mode));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout2.addView(imageView2, z5.t(-2, -2, 16, 5, 0, 8, 0));
        linearLayoutG.addView(linearLayout2, z5.t(-2, 28, 1, 4, 0, 4, 0));
        b6.a(linearLayout2);
        TextView textView6 = new TextView(context);
        rl.l(i12, c6Var, textView6, 1, 14.0f);
        textView6.setGravity(17);
        NotificationCenter.listenEmojiLoading(textView6);
        SpannableString spannableString2 = new SpannableString(oa.K0(starrefprogram.daily_revenue_per_user, 0.95f, ','));
        spannableString2.setSpan(new k41(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
        textView6.setText(oa.X0(false, LocaleController.formatSpannable(R.string.ChannelAffiliateProgramJoinRevenue, spannableString2), 0.725f, null));
        TextView textViewI = pa.i(linearLayoutG, textView6, z5.k(0.0f, 10.0f, 0.0f, 20.0f, -1, -2), context);
        rl.l(i12, c6Var, textViewI, 1, 14.0f);
        textViewI.setGravity(17);
        NotificationCenter.listenEmojiLoading(textViewI);
        int i15 = R.string.ChannelAffiliateProgramJoinText;
        String userName = UserObject.getUserName(user);
        String strG0 = k.G0(starrefprogram.commission_permille);
        int i16 = starrefprogram.duration_months;
        if (i16 > 0) {
            if (i16 < 12 || i16 % 12 != 0) {
                userName = userName;
                r14 = 0;
                pluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i16, new Object[0]);
            } else {
                pluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i16 / 12, new Object[0]);
            }
            Object[] objArr = new Object[3];
            objArr[r14] = userName;
            objArr[1] = strG0;
            objArr[2] = pluralString;
            textViewI.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i15, objArr)), textViewI.getPaint().getFontMetricsInt(), r14));
            linearLayoutG.addView(textViewI, z5.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
            if (j10 >= 0) {
                TextView textView7 = new TextView(context);
                rl.l(i12, c6Var, textView7, 1, 14.0f);
                textView7.setGravity(17);
                textView7.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
                linearLayoutG.addView(textView7, z5.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                linearLayout3.setBackground(g6.b0(AndroidUtilities.dp(28.0f), g6.v0(i13, c6Var)));
                int iDp3 = AndroidUtilities.dp(28.0f);
                int iV1 = g6.v0(i13, c6Var);
                int iV = g6.v(g6.v0(i13, c6Var), g6.v0(g6.f23144i6, c6Var));
                linearLayout3.setBackground(g6.i0(iDp3, iDp3, iDp3, iDp3, iV1, iV, iV));
                n9 n9Var4 = new n9(context);
                n9Var4.setRoundRadius(AndroidUtilities.dp(14.0f));
                linearLayout3.addView(n9Var4, z5.n(28, 28));
                TextView textView8 = new TextView(context);
                textView8.setTextSize(1, 13.0f);
                textView8.setTextColor(g6.v0(i12, c6Var));
                linearLayout3.addView(textView8, z5.t(-2, -2, 16, 6, 0, 0, 0));
                ImageView imageView3 = new ImageView(context);
                imageView3.setScaleType(scaleType);
                imageView3.setColorFilter(new PorterDuffColorFilter(g6.v0(i14, c6Var), mode));
                imageView3.setImageResource(R.drawable.arrows_select);
                linearLayout3.addView(imageView3, z5.t(-2, -2, 16, 2, 0, 5, 0));
                linearLayoutG.addView(linearLayout3, z5.t(-2, 28, 1, 0, 11, 0, 20));
                textView = textView8;
                linearLayout = linearLayout3;
                n9Var = n9Var4;
            } else {
                linearLayout = null;
                n9Var = null;
                textView = null;
            }
            lh.d dVar = new lh.d(context, c6Var, true);
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
            linearLayoutG.addView(dVar, z5.n(-1, 48));
            p80 p80Var = new p80(context, c6Var);
            p80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new e2.e(context, 12)));
            p80Var.setGravity(17);
            p80Var.setTextSize(1, 12.0f);
            p80Var.setTextColor(g6.v0(g6.B6, c6Var));
            p80Var.setLinkTextColor(g6.v0(g6.gc, c6Var));
            linearLayoutG.addView(p80Var, z5.t(-1, -2, 49, 14, 14, 14, 6));
            e3VarO.customView = linearLayoutG;
            final int i17 = 1;
            n9Var2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                            if (n2VarU != null) {
                                org.telegram.ui.ActionBar.e3 e3Var = e3VarO;
                                e3Var.dismiss();
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", starrefprogram.bot_id);
                                n2VarU.presentFragment(new n3(bundle, e3Var));
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                            if (n2VarU2 != null) {
                                e3VarO.dismiss();
                                n2VarU2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                            }
                            break;
                    }
                }
            });
            dVar.setOnClickListener(new j3(dVar, jArr, i10, starrefprogram, e3VarO, j10, z10, context, c6Var, user));
            e3VarO.setOnDismissListener(new lh.e1(6));
            e1Var = new gh.e1(jArr, i10, n9Var3, n9Var, textView, 2);
            e1Var.run();
            if (linearLayout != null) {
                hh.c0.g(i10).n();
                hh.c0.g(i10).o();
                LinearLayout linearLayout4 = linearLayout;
                c6Var2 = c6Var;
                linearLayout4.setOnClickListener(new u8(i10, e3VarO, c6Var2, linearLayout4, jArr, e1Var));
            } else {
                c6Var2 = c6Var;
            }
            final int i18 = 0;
            linearLayout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                            if (n2VarU != null) {
                                org.telegram.ui.ActionBar.e3 e3Var = e3VarO;
                                e3Var.dismiss();
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", starrefprogram.bot_id);
                                n2VarU.presentFragment(new n3(bundle, e3Var));
                            }
                            break;
                        default:
                            org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                            if (n2VarU2 != null) {
                                e3VarO.dismiss();
                                n2VarU2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                            }
                            break;
                    }
                }
            });
            e3VarO.fixNavigationBar(g6.v0(i11, c6Var2));
            e3VarO.show();
        }
        pluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
        r14 = 0;
        Object[] objArr2 = new Object[3];
        objArr2[r14] = userName;
        objArr2[1] = strG0;
        objArr2[2] = pluralString;
        textViewI.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(i15, objArr2)), textViewI.getPaint().getFontMetricsInt(), r14));
        linearLayoutG.addView(textViewI, z5.k(0.0f, 0.0f, 0.0f, 22.0f, -1, -2));
        if (j10 >= 0) {
            TextView textView9 = new TextView(context);
            rl.l(i12, c6Var, textView9, 1, 14.0f);
            textView9.setGravity(17);
            textView9.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            linearLayoutG.addView(textView9, z5.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            LinearLayout linearLayout5 = new LinearLayout(context);
            linearLayout5.setOrientation(0);
            linearLayout5.setBackground(g6.b0(AndroidUtilities.dp(28.0f), g6.v0(i13, c6Var)));
            int iDp4 = AndroidUtilities.dp(28.0f);
            int iV2 = g6.v0(i13, c6Var);
            int iV3 = g6.v(g6.v0(i13, c6Var), g6.v0(g6.f23144i6, c6Var));
            linearLayout5.setBackground(g6.i0(iDp4, iDp4, iDp4, iDp4, iV2, iV3, iV3));
            n9 n9Var5 = new n9(context);
            n9Var5.setRoundRadius(AndroidUtilities.dp(14.0f));
            linearLayout5.addView(n9Var5, z5.n(28, 28));
            TextView textView10 = new TextView(context);
            textView10.setTextSize(1, 13.0f);
            textView10.setTextColor(g6.v0(i12, c6Var));
            linearLayout5.addView(textView10, z5.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView4 = new ImageView(context);
            imageView4.setScaleType(scaleType);
            imageView4.setColorFilter(new PorterDuffColorFilter(g6.v0(i14, c6Var), mode));
            imageView4.setImageResource(R.drawable.arrows_select);
            linearLayout5.addView(imageView4, z5.t(-2, -2, 16, 2, 0, 5, 0));
            linearLayoutG.addView(linearLayout5, z5.t(-2, 28, 1, 0, 11, 0, 20));
            textView = textView10;
            linearLayout = linearLayout5;
            n9Var = n9Var5;
        } else {
            linearLayout = null;
            n9Var = null;
            textView = null;
        }
        lh.d dVar2 = new lh.d(context, c6Var, true);
        dVar2.g(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButton), false, true);
        linearLayoutG.addView(dVar2, z5.n(-1, 48));
        p80 p80Var2 = new p80(context, c6Var);
        p80Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChannelAffiliateProgramJoinButtonInfo), new e2.e(context, 12)));
        p80Var2.setGravity(17);
        p80Var2.setTextSize(1, 12.0f);
        p80Var2.setTextColor(g6.v0(g6.B6, c6Var));
        p80Var2.setLinkTextColor(g6.v0(g6.gc, c6Var));
        linearLayoutG.addView(p80Var2, z5.t(-1, -2, 49, 14, 14, 14, 6));
        e3VarO.customView = linearLayoutG;
        final int i19 = 1;
        n9Var2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                        if (n2VarU != null) {
                            org.telegram.ui.ActionBar.e3 e3Var = e3VarO;
                            e3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            n2VarU.presentFragment(new n3(bundle, e3Var));
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                        if (n2VarU2 != null) {
                            e3VarO.dismiss();
                            n2VarU2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                        }
                        break;
                }
            }
        });
        dVar2.setOnClickListener(new j3(dVar2, jArr, i10, starrefprogram, e3VarO, j10, z10, context, c6Var, user));
        e3VarO.setOnDismissListener(new lh.e1(6));
        e1Var = new gh.e1(jArr, i10, n9Var3, n9Var, textView, 2);
        e1Var.run();
        if (linearLayout != null) {
            hh.c0.g(i10).n();
            hh.c0.g(i10).o();
            LinearLayout linearLayout6 = linearLayout;
            c6Var2 = c6Var;
            linearLayout6.setOnClickListener(new u8(i10, e3VarO, c6Var2, linearLayout6, jArr, e1Var));
        } else {
            c6Var2 = c6Var;
        }
        final int i110 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i110) {
                    case 0:
                        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                        if (n2VarU != null) {
                            org.telegram.ui.ActionBar.e3 e3Var = e3VarO;
                            e3Var.dismiss();
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", starrefprogram.bot_id);
                            n2VarU.presentFragment(new n3(bundle, e3Var));
                        }
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                        if (n2VarU2 != null) {
                            e3VarO.dismiss();
                            n2VarU2.presentFragment(ProfileActivity.m4(starrefprogram.bot_id));
                        }
                        break;
                }
            }
        });
        e3VarO.fixNavigationBar(g6.v0(i11, c6Var2));
        e3VarO.show();
    }

    public static org.telegram.ui.ActionBar.e3 H0(Context context, int i10, TL_payments.connectedBotStarRef connectedbotstarref, long j10, c6 c6Var) {
        TLRPC.User user;
        LinearLayout linearLayout;
        char c10;
        String pluralString;
        int i11;
        char c11;
        String pluralString2;
        ?? r19;
        int i12;
        String pluralString3;
        TL_payments.connectedBotStarRef connectedbotstarref2;
        c6 c6Var2;
        if (connectedbotstarref == null || context == null) {
            return null;
        }
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var, false, false);
        TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(connectedbotstarref.bot_id));
        ?? G = org.telegram.messenger.y1.g(context, 1);
        G.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        G.setClipChildren(false);
        G.setClipToPadding(false);
        ?? frameLayout = new FrameLayout(context);
        View view = new View(context);
        view.setBackground(g6.K(AndroidUtilities.dp(40.0f), g6.v0(connectedbotstarref.revoked ? g6.wj : g6.Oh, c6Var)));
        frameLayout.addView(view, z5.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 2.0f : 1.8f);
        imageView.setScaleY(connectedbotstarref.revoked ? 2.0f : 1.8f);
        frameLayout.addView(imageView, z5.d(80, 80.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        if (connectedbotstarref.participants > 0) {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(g6.b0(AndroidUtilities.dp(50.0f), g6.v0(g6.f23124h5, c6Var)));
            frameLayout.addView(frameLayout2, z5.d(-2, -2.0f, 49, 0.0f, 66.0f, 0.0f, 0.0f));
            ?? textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 12.0f);
            textView.setBackground(g6.b0(AndroidUtilities.dp(9.5f), g6.v0(connectedbotstarref.revoked ? g6.wj : g6.uj, c6Var)));
            textView.setTextColor(-1);
            textView.setPadding(AndroidUtilities.dp(6.66f), 0, AndroidUtilities.dp(6.66f), 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "s ");
            cq cqVar = new cq(R.drawable.mini_reply_user, 0);
            cqVar.setScale(0.937f, 0.937f);
            cqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.0f));
            cqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) String.valueOf(connectedbotstarref.participants));
            textView.setText(spannableStringBuilder);
            textView.setGravity(17);
            frameLayout2.addView(textView, z5.d(-1, 19.0f, 119, 1.33f, 1.33f, 1.33f, 1.33f));
        }
        G.addView(frameLayout, z5.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        int i13 = g6.G6;
        rl.l(i13, c6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkTitle));
        textView2.setTypeface(AndroidUtilities.bold());
        G.addView(textView2, z5.k(20.0f, 16.0f, 20.0f, 9.33f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int iDp = AndroidUtilities.dp(28.0f);
        int i14 = g6.f22999a7;
        linearLayout2.setBackground(g6.b0(iDp, g6.v0(i14, c6Var)));
        n9 n9Var = new n9(context);
        n9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        y8 y8Var = new y8((c6) null);
        linearLayout2.addView(n9Var, z5.n(28, 28));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(g6.v0(i13, c6Var));
        textView3.setText(DialogObject.getName(i10, connectedbotstarref.bot_id));
        y8Var.r(user2);
        n9Var.e(user2, y8Var);
        linearLayout2.addView(textView3, z5.t(-2, -2, 16, 6, 0, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        int i15 = g6.f23300r5;
        int iV0 = g6.v0(i15, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView2.setColorFilter(new PorterDuffColorFilter(iV0, mode));
        imageView2.setImageResource(R.drawable.settings_arrow);
        imageView2.setScaleX(1.2f);
        imageView2.setScaleY(1.2f);
        linearLayout2.addView(imageView2, z5.t(-2, -2, 16, 5, 0, 8, 0));
        G.addView(linearLayout2, z5.t(-2, 28, 1, 4, 0, 4, 0));
        b6.a(linearLayout2);
        TextView textView4 = new TextView(context);
        rl.l(i13, c6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        if (connectedbotstarref.revoked) {
            org.telegram.messenger.y1.p(R.string.ChannelAffiliateProgramLinkTextRevoked, textView4);
            user = user2;
            linearLayout = linearLayout2;
        } else {
            user = user2;
            if (j10 < 0) {
                int i16 = R.string.ChannelAffiliateProgramLinkTextChannel;
                String strG0 = k.G0(connectedbotstarref.commission_permille);
                String userName = UserObject.getUserName(user);
                int i17 = connectedbotstarref.duration_months;
                if (i17 <= 0) {
                    pluralString2 = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    linearLayout = linearLayout2;
                    c11 = 0;
                } else {
                    linearLayout = linearLayout2;
                    if (i17 < 12 || i17 % 12 != 0) {
                        c11 = 0;
                        pluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i17, new Object[0]);
                    } else {
                        c11 = 0;
                        pluralString2 = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i17 / 12, new Object[0]);
                    }
                }
                Object[] objArr = new Object[3];
                objArr[c11] = strG0;
                objArr[1] = userName;
                objArr[2] = pluralString2;
                rl.n(i16, objArr, textView4);
            } else {
                linearLayout = linearLayout2;
                int i18 = R.string.ChannelAffiliateProgramLinkTextUser;
                String strG1 = k.G0(connectedbotstarref.commission_permille);
                String userName2 = UserObject.getUserName(user);
                int i19 = connectedbotstarref.duration_months;
                if (i19 <= 0) {
                    pluralString = LocaleController.getString(R.string.ChannelAffiliateProgramJoinText_Lifetime);
                    i11 = 3;
                    c10 = 0;
                } else {
                    if (i19 < 12 || i19 % 12 != 0) {
                        c10 = 0;
                        pluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Months", i19, new Object[0]);
                    } else {
                        c10 = 0;
                        pluralString = LocaleController.formatPluralString("ChannelAffiliateProgramJoinText_Years", i19 / 12, new Object[0]);
                    }
                    i11 = 3;
                }
                Object[] objArr2 = new Object[i11];
                objArr2[c10] = strG1;
                objArr2[1] = userName2;
                objArr2[2] = pluralString;
                rl.n(i18, objArr2, textView4);
            }
        }
        G.addView(textView4, z5.k(20.0f, 19.0f, 20.0f, 18.0f, -1, -2));
        if (connectedbotstarref.revoked) {
            i13 = i13;
            e3VarO = e3VarO;
            r19 = 0;
        } else {
            TextView textView5 = new TextView(context);
            rl.l(i13, c6Var, textView5, 1, 14.0f);
            textView5.setGravity(17);
            textView5.setText(LocaleController.getString(R.string.ChannelAffiliateProgramLinkSendTo));
            G.addView(textView5, z5.k(20.0f, 0.0f, 20.0f, 0.0f, -1, -2));
            ?? linearLayout3 = new LinearLayout(context);
            linearLayout3.setOrientation(0);
            linearLayout3.setBackground(g6.b0(AndroidUtilities.dp(28.0f), g6.v0(i14, c6Var)));
            n9 n9Var2 = new n9(context);
            n9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
            y8 y8Var2 = new y8((c6) null);
            linearLayout3.addView(n9Var2, z5.n(28, 28));
            TextView textView6 = new TextView(context);
            textView6.setTextSize(1, 13.0f);
            textView6.setTextColor(g6.v0(i13, c6Var));
            if (j10 >= 0) {
                TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                y8Var2.r(user3);
                n9Var2.e(user3, y8Var2);
                textView6.setText(UserObject.getUserName(user3));
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                y8Var2.q(chat);
                n9Var2.e(chat, y8Var2);
                textView6.setText(chat == null ? "" : chat.title);
            }
            linearLayout3.addView(textView6, z5.t(-2, -2, 16, 6, 0, 0, 0));
            ImageView imageView3 = new ImageView(context);
            imageView3.setScaleType(scaleType);
            imageView3.setColorFilter(new PorterDuffColorFilter(g6.v0(i15, c6Var), mode));
            imageView3.setImageResource(R.drawable.arrows_select);
            linearLayout3.addView(imageView3, z5.t(-2, -2, 16, 2, 0, 5, 0));
            G.addView(linearLayout3, z5.t(-2, 28, 1, 0, 9, 0, 22));
            r19 = linearLayout3;
        }
        TextView textView7 = new TextView(context);
        textView7.setTextSize(1, 16.0f);
        textView7.setGravity(17);
        textView7.setTextColor(g6.v0(i13, c6Var));
        int iDp2 = AndroidUtilities.dp(8.0f);
        int iV1 = g6.v0(i14, c6Var);
        int iV = g6.v(g6.v0(i14, c6Var), g6.v0(g6.f23144i6, c6Var));
        textView7.setBackground(g6.i0(iDp2, iDp2, iDp2, iDp2, iV1, iV, iV));
        textView7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.66f));
        String str = connectedbotstarref.url;
        textView7.setText((str == null || !str.startsWith("https://")) ? connectedbotstarref.url : connectedbotstarref.url.substring(8));
        G.addView(textView7, z5.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 12.0f));
        lh.d dVar = new lh.d(context, c6Var, true);
        if (connectedbotstarref.revoked) {
            dVar.g(LocaleController.getString(R.string.ChannelAffiliateProgramLinkRejoin), false, true);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "c ");
            spannableStringBuilder2.setSpan(new cq(R.drawable.msg_copy_filled, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramLinkCopy));
            dVar.g(spannableStringBuilder2, false, true);
        }
        G.addView(dVar, z5.n(-1, 48));
        p80 p80Var = new p80(context, c6Var);
        long j11 = connectedbotstarref.participants;
        if (j11 <= 0) {
            i12 = 1;
            pluralString3 = LocaleController.formatString(R.string.ChannelAffiliateProgramLinkOpenedNone, UserObject.getUserName(user));
        } else {
            i12 = 1;
            pluralString3 = LocaleController.formatPluralString("ChannelAffiliateProgramLinkOpened", (int) j11, UserObject.getUserName(user));
        }
        p80Var.setText(pluralString3);
        p80Var.setGravity(17);
        p80Var.setTextSize(i12, 12.0f);
        p80Var.setTextColor(g6.v0(g6.B6, c6Var));
        p80Var.setLinkTextColor(g6.v0(g6.gc, c6Var));
        G.addView(p80Var, z5.t(-1, -2, 49, 14, 12, 14, 2));
        org.telegram.ui.ActionBar.e3 e3Var = e3VarO;
        e3Var.customView = G;
        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(connectedbotstarref, e3Var, c6Var, user, 18);
        int i20 = 6;
        if (!connectedbotstarref.revoked) {
            textView7.setOnClickListener(new c5(bVar, i20));
        }
        dVar.setOnClickListener(new i3(connectedbotstarref, i10, e3Var, context, j10, c6Var, bVar));
        e3Var.setOnDismissListener(new lh.e1(i20));
        if (r19 != 0) {
            hh.c0.g(i10).n();
            hh.c0.g(i10).o();
            ?? r10 = r19;
            c6Var2 = c6Var;
            connectedbotstarref2 = connectedbotstarref;
            r10.setOnClickListener(new i3(i10, e3Var, c6Var, (LinearLayout) r10, j10, context, connectedbotstarref));
        } else {
            connectedbotstarref2 = connectedbotstarref;
            c6Var2 = c6Var;
        }
        linearLayout.setOnClickListener(new x1(1, e3Var, connectedbotstarref2));
        e3Var.fixNavigationBar(g6.v0(g6.f23124h5, c6Var2));
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && n2VarU != null && !AndroidUtilities.hasDialogOnTop(n2VarU)) {
            e3Var.makeAttached(n2VarU);
        }
        e3Var.show();
        return e3Var;
    }

    public static void x0(s3 s3Var, Context context, TLRPC.User user, TL_payments.connectedBotStarRef connectedbotstarref) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, s3Var.resourceProvider);
        String string = LocaleController.getString(R.string.LeaveAffiliateLink);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LeaveAffiliateLinkAlert, UserObject.getUserName(user)));
        alertDialog$Builder.k(LocaleController.getString(R.string.LeaveAffiliateLinkButton), new jh.z1(5, s3Var, connectedbotstarref));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static void y0(s3 s3Var, TL_payments.connectedBotStarRef connectedbotstarref) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(s3Var.getParentActivity(), 3, null);
        b2Var.q(200L);
        TL_payments.editConnectedStarRefBot editconnectedstarrefbot = new TL_payments.editConnectedStarRefBot();
        editconnectedstarrefbot.link = connectedbotstarref.url;
        editconnectedstarrefbot.peer = MessagesController.getInstance(s3Var.currentAccount).getInputPeer(s3Var.L);
        editconnectedstarrefbot.revoked = true;
        s3Var.getConnectionsManager().sendRequest(editconnectedstarrefbot, new cg.g0(19, s3Var, b2Var));
    }

    public static void z0(s3 s3Var, Context context, int i10) {
        k3 k3Var = s3Var.P;
        if (k3Var == null) {
            return;
        }
        Object obj = k3Var.G(i10).G;
        if (obj instanceof TL_payments.starRefProgram) {
            G0(context, s3Var.currentAccount, (TL_payments.starRefProgram) obj, s3Var.L, s3Var.resourceProvider, false);
        } else if (obj instanceof TL_payments.connectedBotStarRef) {
            H0(context, s3Var.currentAccount, (TL_payments.connectedBotStarRef) obj, s3Var.L, s3Var.resourceProvider);
        }
    }

    public final void F0(ArrayList arrayList, b51 b51Var) {
        SpannableString spannableString;
        if (getParentActivity() == null) {
            return;
        }
        ag.s0 s0Var = (ag.s0) r0(getParentActivity());
        n41 n41Var = new n41(-2);
        n41Var.f30837c = s0Var;
        arrayList.add(n41Var);
        arrayList.add(i.a(R.drawable.menu_feature_reliable, LocaleController.getString(R.string.ChannelAffiliateProgramFeature1Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature1)));
        arrayList.add(i.a(R.drawable.menu_feature_transparent, LocaleController.getString(R.string.ChannelAffiliateProgramFeature2Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature2)));
        arrayList.add(i.a(R.drawable.menu_feature_simple, LocaleController.getString(R.string.ChannelAffiliateProgramFeature3Title), LocaleController.getString(R.string.ChannelAffiliateProgramFeature3)));
        arrayList.add(n41.A(1, null));
        hh.c0 c0VarG = hh.c0.g(this.currentAccount);
        long j10 = this.L;
        hh.z zVarD = c0VarG.d(j10);
        ArrayList arrayList2 = zVarD.f10398e;
        if (!arrayList2.isEmpty() || zVarD.f10397c > 0) {
            pa.o(R.string.ChannelAffiliateProgramMyPrograms, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) arrayList2.get(i10);
                int i11 = o3.f18861a;
                n41 n41VarJ = n41.J(o3.class);
                n41VarJ.G = connectedbotstarref;
                n41VarJ.f30850r = true;
                arrayList.add(n41VarJ);
            }
            if (!zVarD.d || zVarD.f10400g) {
                arrayList.add(n41.n(29));
                arrayList.add(n41.n(29));
                arrayList.add(n41.n(29));
            }
            arrayList.add(n41.A(2, null));
        }
        hh.a0 a0VarE = hh.c0.g(this.currentAccount).e(j10);
        ArrayList arrayList3 = a0VarE.f8937e;
        if (!arrayList3.isEmpty() || a0VarE.f8936c > 0) {
            String string = LocaleController.getString(R.string.ChannelAffiliateProgramPrograms);
            int i12 = a0VarE.f8939g;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSort)).append((CharSequence) " ");
            if (i12 == 1) {
                spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortProfitability) + "v");
            } else if (i12 == 2) {
                spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortRevenue) + "v");
            } else {
                if (i12 == 3) {
                    spannableString = new SpannableString(LocaleController.getString(R.string.ChannelAffiliateProgramProgramsSortDate) + "v");
                }
                int i13 = q3.f18904a;
                n41 n41VarJ2 = n41.J(q3.class);
                n41VarJ2.f30844l = string;
                n41VarJ2.f30845m = spannableStringBuilder;
                arrayList.add(n41VarJ2);
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    Object obj = arrayList3.get(i14);
                    int i15 = o3.f18861a;
                    n41 n41VarJ3 = n41.J(o3.class);
                    n41VarJ3.G = obj;
                    n41VarJ3.f30850r = true;
                    arrayList.add(n41VarJ3);
                }
                if (a0VarE.d || a0VarE.h) {
                    arrayList.add(n41.n(29));
                    arrayList.add(n41.n(29));
                    arrayList.add(n41.n(29));
                }
                arrayList.add(n41.A(3, null));
            }
            cq cqVar = new cq(R.drawable.arrow_more, 0);
            cqVar.useLinkPaintColor = true;
            cqVar.setScale(0.6f, 0.6f);
            spannableString.setSpan(cqVar, spannableString.length() - 1, spannableString.length(), 33);
            spannableString.setSpan(new m3(this, i12, hh.c0.g(this.currentAccount).e(j10)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            int i16 = q3.f18904a;
            n41 n41VarJ4 = n41.J(q3.class);
            n41VarJ4.f30844l = string;
            n41VarJ4.f30845m = spannableStringBuilder;
            arrayList.add(n41VarJ4);
            while (i14 < arrayList3.size()) {
                Object obj2 = arrayList3.get(i14);
                int i17 = o3.f18861a;
                n41 n41VarJ5 = n41.J(o3.class);
                n41VarJ5.G = obj2;
                n41VarJ5.f30850r = true;
                arrayList.add(n41VarJ5);
            }
            if (a0VarE.d) {
                arrayList.add(n41.n(29));
                arrayList.add(n41.n(29));
                arrayList.add(n41.n(29));
            } else {
                arrayList.add(n41.n(29));
                arrayList.add(n41.n(29));
                arrayList.add(n41.n(29));
            }
            arrayList.add(n41.A(3, null));
        }
        arrayList.add(n41.k(this.O));
    }

    @Override
    public final View createView(Context context) {
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        zm zmVar = new zm(context, 6);
        this.O = zmVar;
        zmVar.setBackgroundColor(g6.w0(null, g6.f23143i5, false));
        super.createView(context);
        this.M = new FrameLayout(context);
        bg.i iVar = new bg.i(context, 1, 3);
        this.N = iVar;
        iVar.setImportantForAccessibility(4);
        bg.a aVar = this.N.f2129b;
        aVar.f2107w = g6.fk;
        aVar.f2108x = g6.gk;
        aVar.b();
        this.N.setStarParticlesView(this.f36343e);
        this.M.addView(this.N, z5.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        m0(LocaleController.getString(R.string.ChannelAffiliateProgramTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ChannelAffiliateProgramText)), this.M, null);
        this.f36342c.setOnItemClickListener(new cg.x0(4, this, context));
        this.f36342c.setOnItemLongClickListener(new jh.z1(6, this, context));
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.f36342c.setItemAnimator(lVar);
        this.f36342c.setOnScrollListener(new ag.z2(this, 16));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k3 k3Var;
        int i12 = NotificationCenter.channelConnectedBotsUpdate;
        long j10 = this.L;
        if (i10 != i12) {
            if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == j10 && (k3Var = this.P) != null) {
                k3Var.N(true);
                return;
            }
            return;
        }
        if (((Long) objArr[0]).longValue() == j10) {
            k3 k3Var2 = this.P;
            if (k3Var2 != null) {
                k3Var2.N(true);
            }
            hh.c0.g(this.currentAccount).d(j10).a();
        }
    }

    @Override
    public final f2.q0 n0() {
        k3 k3Var = new k3(this, this.f36342c, getParentActivity(), this.currentAccount, this.classGuid, new a8(this, 10), getResourceProvider());
        this.P = k3Var;
        return k3Var;
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
        bg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(true);
            this.N.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        bg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(false);
            this.N.setDialogVisible(false);
        }
    }

    @Override
    public final ag.k3 p0() {
        ag.j jVar = new ag.j(getParentActivity(), 3);
        jVar.b();
        return jVar;
    }
}
