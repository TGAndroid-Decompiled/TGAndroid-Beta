package gh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import hh.oa;
import hh.u7;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;

public final class z5 implements Utilities.Callback2 {

    public final int f7702a;

    public final m6 f7703b;

    public z5(m6 m6Var, int i10) {
        this.f7702a = i10;
        this.f7703b = m6Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        char c10;
        String string;
        int i11;
        boolean z10;
        String string2;
        CharSequence charSequenceReplaceArrows;
        int i12 = this.f7702a;
        m6 m6Var = this.f7703b;
        switch (i12) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ag.p pVar = m6Var.f7438a0;
                FrameLayout frameLayout = m6Var.f7448k0;
                boolean z11 = m6Var.W;
                boolean z12 = m6Var.X;
                TL_stars.StarGift starGift = m6Var.Y;
                String str = m6Var.f7439b0;
                boolean z13 = m6Var.T;
                int i13 = m6Var.U;
                MessagesController messagesController = MessagesController.getInstance(i13);
                long j10 = m6Var.V;
                long sendPaidMessagesStars = messagesController.getSendPaidMessagesStars(j10);
                arrayList.add(n41.j(-1, m6Var.f7441d0));
                if (sendPaidMessagesStars <= 0) {
                    arrayList.add(n41.j(-2, m6Var.f7451o0));
                    arrayList.add(n41.C(AndroidUtilities.dp(12.0f)));
                }
                if (starGift != null) {
                    if (!starGift.can_upgrade || z13) {
                        arrayList.add(n41.A(-5, null));
                    } else {
                        arrayList.add(n41.A(-3, null));
                        n41 n41VarI = n41.i(2, oa.X0(false, LocaleController.formatString(z13 ? R.string.Gift2UpgradeSelf : R.string.Gift2Upgrade, Integer.valueOf((int) starGift.upgrade_stars)), 0.78f, null));
                        n41VarI.K(m6Var.m0);
                        arrayList.add(n41VarI);
                        if (z12) {
                            charSequenceReplaceArrows = LocaleController.formatString(j10 < 0 ? R.string.Gift2NoUpgradeChannelForcedInfo : R.string.Gift2NoUpgradeForcedInfo, str);
                        } else if (z11) {
                            charSequenceReplaceArrows = LocaleController.formatString(j10 < 0 ? R.string.Gift2UpgradeChannelForcedInfo : R.string.Gift2UpgradeForcedInfo, str);
                        } else {
                            if (z13) {
                                string2 = LocaleController.getString(R.string.Gift2UpgradeSelfInfo);
                                z10 = true;
                            } else {
                                z10 = true;
                                string2 = LocaleController.formatString(j10 >= 0 ? R.string.Gift2UpgradeInfo : R.string.Gift2UpgradeChannelInfo, str);
                            }
                            charSequenceReplaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string2, new b6(m6Var, 2)), z10);
                        }
                        n41 n41VarA = n41.A(-5, charSequenceReplaceArrows);
                        n41VarA.f30840g = (z11 || z12) ? false : true;
                        arrayList.add(n41VarA);
                    }
                    n41 n41VarI2 = n41.i(1, LocaleController.getString(z13 ? R.string.Gift2HideSelf : R.string.Gift2Hide));
                    n41VarI2.K(m6Var.f7449l0);
                    arrayList.add(n41VarI2);
                    if (z13) {
                        i11 = R.string.Gift2HideSelfInfo;
                    } else {
                        if (j10 < 0) {
                            i11 = R.string.Gift2HideChannelInfo;
                        } else {
                            i10 = 1;
                            c10 = 0;
                            string = LocaleController.formatString(R.string.Gift2HideInfo, str);
                        }
                        arrayList.add(n41.A(-6, string));
                        if (frameLayout != null) {
                            int i14 = starGift.gifts_per_round;
                            Object[] objArr = new Object[i10];
                            objArr[c10] = Integer.valueOf(i14);
                            CharSequence charSequenceReplaceArrows2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("Gift2AuctionInfoLearnMore2", i14, objArr), new b6(m6Var, 3)), i10);
                            arrayList.add(n41.j(-43, frameLayout));
                            arrayList.add(n41.A(-44, charSequenceReplaceArrows2));
                        }
                    }
                    string = LocaleController.getString(i11);
                    i10 = 1;
                    c10 = 0;
                    arrayList.add(n41.A(-6, string));
                    if (frameLayout != null) {
                        int i15 = starGift.gifts_per_round;
                        Object[] objArr2 = new Object[i10];
                        objArr2[c10] = Integer.valueOf(i15);
                        CharSequence charSequenceReplaceArrows3 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("Gift2AuctionInfoLearnMore2", i15, objArr2), new b6(m6Var, 3)), i10);
                        arrayList.add(n41.j(-43, frameLayout));
                        arrayList.add(n41.A(-44, charSequenceReplaceArrows3));
                    }
                } else {
                    if (sendPaidMessagesStars <= 0) {
                        arrayList.add(n41.A(-3, LocaleController.formatString(R.string.Gift2MessagePremiumInfo, str)));
                    }
                    if (pVar != null && (pVar.f587c != null || pVar.d != null)) {
                        n41 n41VarI3 = n41.i(3, oa.X0(false, LocaleController.formatString(R.string.Gift2MessageStars, Integer.valueOf((int) pVar.g())), 0.78f, null));
                        n41VarI3.K(m6Var.f7450n0);
                        arrayList.add(n41VarI3);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatNumber(u7.y(i13, false).p().amount, ','));
                        spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                        arrayList.add(n41.A(-7, TextUtils.concat(oa.X0(false, LocaleController.formatSpannable(R.string.Gift2MessageStarsInfo, spannableStringBuilder), 0.66f, null), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new b6(m6Var, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
                    }
                }
                if (m6Var.M) {
                    Collections.reverse(arrayList);
                }
                break;
            default:
                String str2 = (String) obj2;
                TL_stars.StarGift starGift2 = m6Var.Y;
                h6 h6Var = m6Var.f7451o0;
                if (((Boolean) obj).booleanValue()) {
                    Runnable runnable = m6Var.f7440c0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.hideKeyboard(h6Var);
                    m6Var.dismiss();
                } else if ("STARGIFT_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                    AndroidUtilities.hideKeyboard(h6Var);
                    m6Var.dismiss();
                    u7 u7VarY = u7.y(m6Var.U, false);
                    if (starGift2 != null && u7VarY.D) {
                        starGift2.availability_remains = 0;
                        u7VarY.c0(u7VarY.F, u7VarY.G, u7VarY.H);
                        NotificationCenter.getInstance(u7VarY.f10151a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftSoldOut, starGift2);
                        break;
                    }
                } else if ("STARGIFT_USER_USAGE_LIMITED".equalsIgnoreCase(str2)) {
                    AndroidUtilities.hideKeyboard(h6Var);
                    m6Var.dismiss();
                    mc mcVarX = m6Var.X();
                    if (mcVarX != null && starGift2 != null && starGift2.limited_per_user) {
                        mcVarX.R(starGift2.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift2.per_user_total))).j();
                        break;
                    }
                }
                m6Var.f7447j0.setLoading(false);
                break;
        }
    }
}
