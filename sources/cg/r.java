package cg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ut;
import org.telegram.ui.LaunchActivity;

public abstract class r {
    public static void a(org.telegram.ui.ActionBar.b2 b2Var, boolean z10) {
        eh.s sVar = b2Var.f22751f;
        if (sVar != null) {
            sVar.setTextSize(1, 20);
        }
        ut utVar = b2Var.f22759n;
        if (utVar != null) {
            utVar.setTextSize(1, 14);
        }
        ut utVar2 = b2Var.f22759n;
        if (utVar2 != null) {
            utVar2.setLineSpacing(AndroidUtilities.dp(2.5f), 1.0f);
        }
        if (z10) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) b2Var.f22762p0.getLayoutParams()).topMargin = AndroidUtilities.dp(-14.0f);
    }

    public static String b(MessageObject messageObject) {
        if (messageObject == null) {
            return "";
        }
        String forwardedName = messageObject.getForwardedName();
        if (forwardedName != null) {
            return forwardedName;
        }
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-MessageObject.getPeerId(messageObject.messageOwner.peer_id)));
        return chat != null ? chat.title : "";
    }

    public static void c(TLRPC.TL_error tL_error, FrameLayout frameLayout, c6 c6Var, Runnable runnable) {
        String str;
        if (tL_error == null || (str = tL_error.text) == null) {
            return;
        }
        if (!str.contains("PREMIUM_SUB_ACTIVE_UNTIL_")) {
            j(frameLayout.getContext(), tL_error);
            return;
        }
        String str2 = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(Long.parseLong(tL_error.text.replace("PREMIUM_SUB_ACTIVE_UNTIL_", "")) * 1000));
        SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("GiftPremiumActivateErrorText", R.string.GiftPremiumActivateErrorText), g6.Gi, 0, runnable);
        mc mcVar = new mc(frameLayout, c6Var);
        int i10 = R.raw.chats_infotip;
        mcVar.M(LocaleController.getString(R.string.GiftPremiumActivateErrorTitle), AndroidUtilities.replaceCharSequence("%1$s", spannableStringBuilderReplaceSingleTag, AndroidUtilities.replaceTags("**" + str2 + "**")), i10).j();
        try {
            frameLayout.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public static void d(boolean z10, String str, TLRPC.TL_payments_giveawayInfo tL_payments_giveawayInfo, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, c6 c6Var) {
        char c10;
        int i10 = tL_messageMediaGiveaway.quantity;
        String pluralString = LocaleController.formatPluralString("BoldMonths", tL_messageMediaGiveaway.months, new Object[0]);
        String str2 = LocaleController.getInstance().getFormatterGiveawayMonthDay().format(new Date(((long) tL_messageMediaGiveaway.until_date) * 1000));
        String str3 = LocaleController.getInstance().getFormatterDay().format(new Date(((long) tL_payments_giveawayInfo.start_date) * 1000));
        String str4 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(((long) tL_payments_giveawayInfo.start_date) * 1000));
        boolean z11 = tL_messageMediaGiveaway.channels.size() > 1;
        boolean z12 = (tL_messageMediaGiveaway.flags & 32) != 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        String string = LocaleController.getString("BoostingGiveAwayAbout", R.string.BoostingGiveAwayAbout);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z10 ? "BoostingStarsGiveawayHowItWorksText" : "BoostingStarsGiveawayHowItWorksTextGroup", (int) tL_messageMediaGiveaway.stars, str)));
            c10 = 0;
        } else {
            c10 = 0;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString(z10 ? "BoostingGiveawayHowItWorksText" : "BoostingGiveawayHowItWorksTextGroup", i10, str, Integer.valueOf(i10), pluralString)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str5 = tL_messageMediaGiveaway.prize_description;
        if (str5 != null && !str5.isEmpty()) {
            String str6 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[c10] = str;
            objArr[1] = str6;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksIncludeText", i10, objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                int size = tL_messageMediaGiveaway.channels.size() - 1;
                Object[] objArr2 = new Object[2];
                objArr2[c10] = str3;
                objArr2[1] = str4;
                String pluralString2 = LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveral2", size, objArr2);
                Integer numValueOf = Integer.valueOf(i10);
                Object[] objArr3 = new Object[4];
                objArr3[c10] = str2;
                objArr3[1] = numValueOf;
                objArr3[2] = str;
                objArr3[3] = pluralString2;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveral1", i10, objArr3)));
            } else {
                Integer numValueOf2 = Integer.valueOf(i10);
                Object[] objArr4 = new Object[5];
                objArr4[c10] = str2;
                objArr4[1] = numValueOf2;
                objArr4[2] = str;
                objArr4[3] = str3;
                objArr4[4] = str4;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDate", i10, objArr4)));
            }
        } else if (z11) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveral1", i10, str2, Integer.valueOf(i10), str, LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveral2", tL_messageMediaGiveaway.channels.size() - 1, new Object[0]))));
        } else {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubText", i10, str2, Integer.valueOf(i10), str)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        if (!tL_payments_giveawayInfo.participating) {
            String str7 = tL_payments_giveawayInfo.disallowed_country;
            if (str7 != null && !str7.isEmpty()) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString("BoostingGiveawayNotEligibleCountry", R.string.BoostingGiveawayNotEligibleCountry)));
            } else if (tL_payments_giveawayInfo.admin_disallowed_chat_id != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(tL_payments_giveawayInfo.admin_disallowed_chat_id));
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(z10 ? R.string.BoostingGiveawayNotEligibleAdmin : R.string.BoostingGiveawayNotEligibleAdminGroup, chat != null ? chat.title : "")));
            } else if (tL_payments_giveawayInfo.joined_too_early_date != 0) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayNotEligible", R.string.BoostingGiveawayNotEligible, LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(((long) tL_payments_giveawayInfo.joined_too_early_date) * 1000)))));
            } else if (z11) {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayTakePartMultiPlural", tL_messageMediaGiveaway.channels.size() - 1, str, str2)));
            } else {
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayTakePart", R.string.BoostingGiveawayTakePart, str, str2)));
            }
        } else if (z11) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayParticipantMultiPlural", tL_messageMediaGiveaway.channels.size() - 1, str)));
        } else {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiveawayParticipant", R.string.BoostingGiveawayParticipant, str)));
        }
        b2Var.P = spannableStringBuilder;
        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new a9.m(14));
        a(alertDialog$Builder.o(), false);
    }

    public static void e(boolean z10, String str, TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, Context context, c6 c6Var) {
        char c10;
        String string;
        if (tL_messageMediaGiveaway.until_date == 0) {
            tL_messageMediaGiveaway.until_date = tL_payments_giveawayInfoResults.finish_date;
        }
        int i10 = tL_messageMediaGiveaway.quantity;
        String pluralString = LocaleController.formatPluralString("BoldMonths", tL_messageMediaGiveaway.months, new Object[0]);
        String str2 = LocaleController.getInstance().getFormatterGiveawayMonthDay().format(new Date(((long) tL_messageMediaGiveaway.until_date) * 1000));
        String str3 = LocaleController.getInstance().getFormatterDay().format(new Date(((long) tL_payments_giveawayInfoResults.start_date) * 1000));
        String str4 = LocaleController.getInstance().getFormatterGiveawayMonthDayYear().format(new Date(((long) tL_payments_giveawayInfoResults.start_date) * 1000));
        boolean z11 = tL_messageMediaGiveaway.channels.size() > 1;
        boolean z12 = (tL_messageMediaGiveaway.flags & 32) != 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        String string2 = LocaleController.getString("BoostingGiveawayEnd", R.string.BoostingGiveawayEnd);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z12) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z10 ? "BoostingStarsGiveawayHowItWorksTextEnd" : "BoostingStarsGiveawayHowItWorksTextEndGroup", (int) tL_messageMediaGiveaway.stars, str)));
            c10 = 1;
        } else {
            c10 = 1;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString(z10 ? "BoostingGiveawayHowItWorksTextEnd" : "BoostingGiveawayHowItWorksTextEndGroup", i10, str, Integer.valueOf(i10), pluralString)));
        }
        spannableStringBuilder.append((CharSequence) "\n\n");
        String str5 = tL_messageMediaGiveaway.prize_description;
        if (str5 != null && !str5.isEmpty()) {
            String str6 = tL_messageMediaGiveaway.prize_description;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[c10] = str6;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksIncludeText", i10, objArr)));
            spannableStringBuilder.append((CharSequence) "\n\n");
        }
        if (tL_messageMediaGiveaway.only_new_subscribers) {
            if (z11) {
                int size = tL_messageMediaGiveaway.channels.size() - 1;
                Object[] objArr2 = new Object[2];
                objArr2[0] = str3;
                objArr2[c10] = str4;
                String pluralString2 = LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveral2", size, objArr2);
                Integer numValueOf = Integer.valueOf(i10);
                Object[] objArr3 = new Object[4];
                objArr3[0] = str2;
                objArr3[c10] = numValueOf;
                objArr3[2] = str;
                objArr3[3] = pluralString2;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateSeveralEnd1", i10, objArr3)));
            } else {
                Integer numValueOf2 = Integer.valueOf(i10);
                Object[] objArr4 = new Object[5];
                objArr4[0] = str2;
                objArr4[c10] = numValueOf2;
                objArr4[2] = str;
                objArr4[3] = str3;
                objArr4[4] = str4;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextDateEnd", i10, objArr4)));
            }
        } else if (z11) {
            String pluralString3 = LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveral2", tL_messageMediaGiveaway.channels.size() - 1, new Object[0]);
            Integer numValueOf3 = Integer.valueOf(i10);
            Object[] objArr5 = new Object[4];
            objArr5[0] = str2;
            objArr5[c10] = numValueOf3;
            objArr5[2] = str;
            objArr5[3] = pluralString3;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextSeveralEnd1", i10, objArr5)));
        } else {
            Integer numValueOf4 = Integer.valueOf(i10);
            Object[] objArr6 = new Object[3];
            objArr6[0] = str2;
            objArr6[c10] = numValueOf4;
            objArr6[2] = str;
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayHowItWorksSubTextEnd", i10, objArr6)));
        }
        spannableStringBuilder.append((CharSequence) " ");
        int i11 = tL_payments_giveawayInfoResults.activated_count;
        if (i11 > 0) {
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayUsedLinksPlural", i11, new Object[0])));
        }
        if (tL_payments_giveawayInfoResults.refunded) {
            String string3 = LocaleController.getString("BoostingGiveawayCanceledByPayment", R.string.BoostingGiveawayCanceledByPayment);
            TextView textViewH = org.telegram.messenger.y1.h(context, 1, 14.0f);
            textViewH.setTypeface(AndroidUtilities.bold());
            textViewH.setGravity(17);
            textViewH.setText(string3);
            int i12 = g6.f23269p7;
            textViewH.setTextColor(g6.v0(i12, c6Var));
            textViewH.setBackground(g6.c0(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), g6.l1(0.1f, g6.v0(i12, c6Var))));
            textViewH.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            b2Var.f22746c = textViewH;
            b2Var.P = spannableStringBuilder;
            alertDialog$Builder.k(LocaleController.getString("Close", R.string.Close), new a9.m(14));
            a(alertDialog$Builder.o(), true);
            return;
        }
        b2Var.P = spannableStringBuilder;
        if (tL_payments_giveawayInfoResults.winner) {
            string = LocaleController.getString(R.string.BoostingGiveawayYouWon);
            if ((tL_payments_giveawayInfoResults.flags & 16) == 0) {
                alertDialog$Builder.k(LocaleController.getString("BoostingGiveawayViewPrize", R.string.BoostingGiveawayViewPrize), new a1.c(tL_payments_giveawayInfoResults, 9));
            }
            alertDialog$Builder.h(LocaleController.getString("Close", R.string.Close), new a9.m(14));
        } else {
            string = LocaleController.getString("BoostingGiveawayYouNotWon", R.string.BoostingGiveawayYouNotWon);
            alertDialog$Builder.k(LocaleController.getString("Close", R.string.Close), new a9.m(14));
        }
        ut utVar = new ut(context);
        NotificationCenter.listenEmojiLoading(utVar);
        utVar.setTextColor(g6.v0(g6.f23161j5, c6Var));
        utVar.setTextSize(1, 14.0f);
        utVar.setGravity(17);
        utVar.setText(string);
        utVar.setBackground(g6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), g6.v0(g6.yh, c6Var)));
        utVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(9.0f));
        b2Var.d = utVar;
        a(alertDialog$Builder.o(), false);
    }

    public static void f(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.Chat chat, boolean z10) {
        if (n2Var == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new c(mc.a0(n2Var), z10, chat, n2Var.getResourceProvider(), 0), 300L);
    }

    public static void g(int i10) {
        String pluralString;
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR == null) {
            return;
        }
        if (i10 < 60) {
            pluralString = LocaleController.formatPluralString("Seconds", i10, new Object[0]);
        } else if (i10 < 3600) {
            pluralString = LocaleController.formatPluralString("Minutes", i10 / 60, new Object[0]);
        } else {
            int i11 = (i10 / 60) / 60;
            if (i11 > 2) {
                pluralString = LocaleController.formatPluralString("Hours", i11, new Object[0]);
            } else {
                pluralString = LocaleController.formatPluralString("Hours", i11, new Object[0]) + " " + LocaleController.formatPluralString("Minutes", i10 % 60, new Object[0]);
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2VarR.getContext(), 0, n2VarR.getResourceProvider());
        String string = LocaleController.getString(R.string.CantBoostTooOften);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("CantBoostTooOftenDescription", R.string.CantBoostTooOftenDescription, pluralString));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new a9.m(18));
        alertDialog$Builder.o();
    }

    public static void h(long j10) {
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingGiftLinkForwardedToSavedMsg));
        } else if (DialogObject.isChatDialog(j10)) {
            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiftLinkForwardedTo", R.string.BoostingGiftLinkForwardedTo, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10)).title));
        } else {
            spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("BoostingGiftLinkForwardedTo", R.string.BoostingGiftLinkForwardedTo, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10)))));
        }
        AndroidUtilities.runOnUIThread(new af.e(spannableStringBuilderReplaceTags, 20), 450L);
    }

    public static void i(long j10, ag.i1 i1Var) {
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2VarR.getContext(), 0, n2VarR.getResourceProvider());
        String string = LocaleController.getString(R.string.BoostingMoreBoostsNeeded);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGetMoreBoostByGiftingCount", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, chat.title));
        alertDialog$Builder.h(LocaleController.getString("GiftPremium", R.string.GiftPremium), new ag.i0(i1Var, 3));
        alertDialog$Builder.k(LocaleController.getString("Close", R.string.Close), new a9.m(14));
        alertDialog$Builder.o();
    }

    public static void j(Context context, TLRPC.TL_error tL_error) {
        String str;
        if (tL_error == null || (str = tL_error.text) == null || TextUtils.isEmpty(str)) {
            return;
        }
        Toast.makeText(context, tL_error.text, 1).show();
    }
}
