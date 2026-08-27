package hh;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.f70;

public final class ia extends m41 {

    public static final int f9496a = 0;

    static {
        m41.setup(new ia());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        char c10;
        boolean z11;
        boolean z12;
        String userName;
        ImageLocation forDocument;
        int i10;
        int i11;
        long j10;
        SpannableString spannableString;
        ja jaVar = (ja) view;
        TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) n41Var.G;
        boolean z13 = n41Var.f30849q;
        org.telegram.ui.Components.n9 n9Var = jaVar.d;
        SpannableString spannableString2 = jaVar.v;
        SpannableString spannableString3 = jaVar.f9553w;
        org.telegram.ui.Components.y8 y8Var = jaVar.f9546b;
        int i12 = jaVar.f9545a;
        TextView textView = jaVar.f9551r;
        TextView textView2 = jaVar.f9552s;
        org.telegram.ui.Components.n9 n9Var2 = jaVar.f9547c;
        TextView textView3 = jaVar.f9549f;
        Integer num = 0;
        p80 p80Var = jaVar.f9550n;
        long peerDialogId = DialogObject.getPeerDialogId(starsTransaction.peer.peer);
        boolean z14 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
        int i13 = starsTransaction.flags;
        boolean z15 = (i13 & 131072) == 0 && (i13 & 65536) != 0;
        boolean z16 = !(peerDialogId == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
        jaVar.f9554x = z16;
        jaVar.h.bottomMargin = z16 ? 0 : AndroidUtilities.dp(4.33f);
        p80Var.setVisibility(jaVar.f9554x ? 0 : 8);
        textView.setTextSize(1, jaVar.f9554x ? 13.0f : 14.0f);
        textView.setText(LocaleController.formatShortDateTime(starsTransaction.date));
        if (starsTransaction.refund) {
            c10 = 2;
            textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsRefunded)));
        } else {
            c10 = 2;
            if (starsTransaction.failed) {
                textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsFailed)));
            } else if (starsTransaction.pending) {
                textView.setText(TextUtils.concat(textView.getText(), " — ", LocaleController.getString(R.string.StarsPending)));
            }
        }
        n9Var2.setTranslationX(0.0f);
        n9Var2.setTranslationY(0.0f);
        n9Var.setVisibility(8);
        n9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        if (starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
            n9Var2.setImageDrawable(new v4(n9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(LocaleController.getString(R.string.Gift2TransactionUpgraded));
            p80Var.setVisibility(8);
        } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
            n9Var2.setImageDrawable(new v4(n9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(LocaleController.getString(R.string.Gift2TransactionRemovedDescription));
            p80Var.setVisibility(8);
        } else {
            if (!starsTransaction.posts_search) {
                if (peerDialogId != 0) {
                    if (UserObject.isService(peerDialogId)) {
                        userName = LocaleController.getString(R.string.StarsTransactionUnknown);
                        n9Var2.setImageDrawable(ja.a(44, "fragment"));
                        z12 = false;
                    } else if (peerDialogId >= 0) {
                        TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
                        z12 = user == null;
                        y8Var.r(user);
                        n9Var2.e(user, y8Var);
                        userName = UserObject.getUserName(user);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerDialogId));
                        z12 = chat == null;
                        y8Var.q(chat);
                        n9Var2.e(chat, y8Var);
                        userName = chat == null ? "" : chat.title;
                    }
                    if (starsTransaction.stargift != null) {
                        f70 f70Var = new f70(p80Var, 16.0f, i12);
                        f70Var.a(4.0f);
                        f70Var.f37955f = false;
                        SpannableString spannableString4 = new SpannableString("x");
                        spannableString4.setSpan(f70Var, 0, 1, 33);
                        oa.a1(f70Var.f37952b, starsTransaction.stargift, 16);
                        textView3.setText(userName);
                        if (starsTransaction.offer) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(starsTransaction.stargift.getDocument(), p80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftOffer));
                            } else {
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftOfferRefund : R.string.StarGiftTransactionGiftSale));
                            }
                            p80Var.setText(spannableStringBuilder);
                        } else if (starsTransaction.stargift_resale) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(starsTransaction.stargift.getDocument(), p80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftSaleRefund : R.string.StarGiftTransactionGiftPurchase));
                            } else {
                                spannableStringBuilder2.append((CharSequence) LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftPurchaseRefund : R.string.StarGiftTransactionGiftSale));
                            }
                            p80Var.setText(spannableStringBuilder2);
                        } else if (starsTransaction.stargift_prepaid_upgrade) {
                            String string = LocaleController.getString(R.string.Gift2TransactionPrepaidUpgrade);
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            charSequenceArr[0] = spannableString4;
                            charSequenceArr[1] = " ";
                            charSequenceArr[c10] = string;
                            p80Var.setText(TextUtils.concat(charSequenceArr));
                        } else if (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique) {
                            p80Var.setText(LocaleController.getString(starsTransaction.refund ? R.string.StarGiftTransactionGiftTransferRefund : R.string.StarGiftTransactionGiftTransfer));
                        } else if (starsTransaction.refund) {
                            if (starsTransaction.stargift_auction_bid) {
                                i11 = R.string.Gift2TransactionRefundedAuctionBid;
                            } else if (starsTransaction.amount.amount > 0) {
                                i11 = starsTransaction.stargift_upgrade ? R.string.Gift2TransactionRefundedUpgrade : R.string.Gift2TransactionRefundedSent;
                            } else {
                                i11 = R.string.Gift2TransactionRefundedConverted;
                            }
                            String string2 = LocaleController.getString(i11);
                            CharSequence[] charSequenceArr2 = new CharSequence[3];
                            charSequenceArr2[0] = spannableString4;
                            charSequenceArr2[1] = " ";
                            charSequenceArr2[c10] = string2;
                            p80Var.setText(TextUtils.concat(charSequenceArr2));
                        } else {
                            if (starsTransaction.stargift_auction_bid) {
                                i10 = R.string.Gift2TransactionAuctionBid;
                            } else if (starsTransaction.amount.amount > 0) {
                                i10 = R.string.Gift2TransactionConverted;
                            } else {
                                i10 = starsTransaction.stargift_upgrade ? R.string.Gift2TransactionUpgraded : R.string.Gift2TransactionSent;
                            }
                            String string3 = LocaleController.getString(i10);
                            CharSequence[] charSequenceArr3 = new CharSequence[3];
                            charSequenceArr3[0] = spannableString4;
                            charSequenceArr3[1] = " ";
                            charSequenceArr3[c10] = string3;
                            p80Var.setText(TextUtils.concat(charSequenceArr3));
                        }
                    } else if (starsTransaction.subscription) {
                        textView3.setText(userName);
                        int i14 = starsTransaction.subscription_period;
                        if (i14 == 2592000) {
                            p80Var.setVisibility(0);
                            p80Var.setText(LocaleController.getString(R.string.StarsTransactionSubscriptionMonthly));
                        } else {
                            String str = i14 == 300 ? "5 minutes" : "Minute";
                            p80Var.setVisibility(0);
                            Locale locale = Locale.US;
                            p80Var.setText(str.concat(" subscription fee"));
                        }
                    } else if (starsTransaction.phonegroup_message) {
                        textView3.setText(userName);
                        p80Var.setVisibility(z12 ? 8 : 0);
                        p80Var.setText(LocaleController.getString(starsTransaction.reaction ? R.string.StarsTransactionLiveStoryReactionFee : R.string.StarsTransactionLiveStoryMessageFee));
                    } else if (starsTransaction.paid_message) {
                        textView3.setText(userName);
                        p80Var.setVisibility(z12 ? 8 : 0);
                        p80Var.setText(LocaleController.formatPluralStringComma("StarsTransactionMessageFee", starsTransaction.paid_messages));
                    } else if (starsTransaction.premium_gift) {
                        textView3.setText(userName);
                        p80Var.setVisibility(z12 ? 8 : 0);
                        p80Var.setText(LocaleController.getString(R.string.StarsTransactionPremiumGift));
                    } else if (z15) {
                        textView3.setText(userName);
                        p80Var.setVisibility(z12 ? 8 : 0);
                        p80Var.setText(LocaleController.formatString(R.string.StarTransactionCommission, nh.k.G0(starsTransaction.starref_commission_permille)));
                    } else if (starsTransaction.gift) {
                        textView3.setText(userName);
                        p80Var.setVisibility(z12 ? 8 : 0);
                        p80Var.setText(LocaleController.getString(R.string.StarsGiftReceived));
                    } else if ((starsTransaction.flags & 8192) != 0) {
                        textView3.setText(userName);
                        p80Var.setVisibility(z12 ? 8 : 0);
                        p80Var.setText(LocaleController.getString(R.string.StarsGiveawayPrizeReceived));
                    } else if (starsTransaction.reaction) {
                        textView3.setText(userName);
                        p80Var.setVisibility(z12 ? 8 : 0);
                        p80Var.setText(LocaleController.getString(R.string.StarsReactionsSent));
                    } else if (starsTransaction.extended_media.isEmpty()) {
                        z11 = z14;
                        if (starsTransaction.photo != null) {
                            f70 f70Var2 = new f70(p80Var, 14.0f, i12);
                            f70Var2.a(4.0f);
                            f70Var2.f37955f = false;
                            SpannableString spannableString5 = new SpannableString("x");
                            spannableString5.setSpan(f70Var2, 0, 1, 33);
                            f70Var2.f37952b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsTransaction.photo)), "14_14", null, null, num, 0);
                            textView3.setText(userName);
                            p80Var.setVisibility(z12 ? 8 : 0);
                            String str2 = starsTransaction.title;
                            p80Var.setText(Emoji.replaceEmoji(TextUtils.concat(spannableString5, " ", str2 != null ? str2 : ""), p80Var.getPaint().getFontMetricsInt(), false));
                        } else {
                            textView3.setText(userName);
                            p80Var.setVisibility(z12 ? 8 : 0);
                            String str3 = starsTransaction.title;
                            p80Var.setText(Emoji.replaceEmoji(str3 != null ? str3 : "", p80Var.getPaint().getFontMetricsInt(), false));
                        }
                    } else {
                        if (z13) {
                            textView3.setText(userName);
                            p80Var.setVisibility(0);
                            p80Var.setText(LocaleController.getString(R.string.StarMediaPurchase));
                        } else {
                            textView3.setText(LocaleController.getString(R.string.StarMediaPurchase));
                            p80Var.setVisibility(z12 ? 8 : 0);
                            p80Var.setText(userName);
                        }
                        jaVar.f9548e = 0;
                        int i15 = 0;
                        while (i15 < Math.min(2, starsTransaction.extended_media.size())) {
                            TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i15);
                            org.telegram.ui.Components.n9 n9Var3 = i15 == 0 ? n9Var2 : n9Var;
                            n9Var3.setRoundRadius(AndroidUtilities.dp(12.0f));
                            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                forDocument = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(46.0f), true), messageMedia.photo);
                            } else {
                                forDocument = messageMedia instanceof TLRPC.TL_messageMediaDocument ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(46.0f), true), messageMedia.document) : null;
                            }
                            n9Var3.setVisibility(0);
                            Integer num2 = num;
                            n9Var3.l(forDocument, "46_46", null, null, null, num2);
                            jaVar.f9548e++;
                            i15++;
                            num = num2;
                            z14 = z14;
                        }
                        z11 = z14;
                        int i16 = 0;
                        while (i16 < jaVar.f9548e) {
                            org.telegram.ui.Components.n9 n9Var4 = i16 == 0 ? n9Var2 : n9Var;
                            float f10 = i16;
                            n9Var4.setTranslationX(((f10 - (jaVar.f9548e / 2.0f)) * AndroidUtilities.dp(4.33f)) + AndroidUtilities.dp(2.0f));
                            n9Var4.setTranslationY((f10 - (jaVar.f9548e / 2.0f)) * AndroidUtilities.dp(4.33f));
                            i16++;
                        }
                    }
                } else {
                    z11 = z14;
                    if (starsTransaction.floodskip) {
                        textView3.setText(LocaleController.getString(R.string.StarsTransactionFloodskip));
                        p80Var.setText(LocaleController.formatPluralStringComma("StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                        n9Var2.setImageDrawable(ja.a(44, "api"));
                    } else {
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                            n9Var2.setImageDrawable(ja.a(44, "ios"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionInApp));
                            n9Var2.setImageDrawable(ja.a(44, "android"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction.gift) {
                                textView3.setText(LocaleController.getString(R.string.StarsGiftReceived));
                                p80Var.setText(LocaleController.getString(z11 ? R.string.StarsTransactionTONFromFragment : R.string.StarsTransactionUnknown));
                                p80Var.setVisibility(0);
                            } else {
                                textView3.setText(LocaleController.getString((z13 || (!starsTransaction.refund ? !starsTransaction.amount.negative() : !starsTransaction.amount.positive())) ? R.string.StarsTransactionWithdrawFragment : R.string.StarsTransactionFragment));
                            }
                            n9Var2.setImageDrawable(ja.a(44, "fragment"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionBot));
                            n9Var2.setImageDrawable(ja.a(44, "premiumbot"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionUnsupported));
                            n9Var2.setImageDrawable(ja.a(44, "?"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                            textView3.setText(LocaleController.getString(R.string.StarsTransactionAds));
                            n9Var2.setImageDrawable(ja.a(44, "ads"));
                        } else {
                            textView3.setText("");
                            n9Var2.setImageDrawable(null);
                        }
                    }
                }
                TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                j10 = starsAmount.amount;
                if (j10 <= 0 || (j10 == 0 && starsAmount.nanos > 0)) {
                    textView2.setVisibility(0);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.uj, false));
                    SpannableStringBuilder spannableStringBuilderI0 = oa.I0(starsTransaction.amount);
                    if (z11) {
                        spannableString = spannableString3;
                    } else {
                        spannableString = spannableString2;
                    }
                    textView2.setText(TextUtils.concat("+", spannableStringBuilderI0, " ", spannableString));
                } else if (j10 < 0 || (j10 == 0 && starsAmount.nanos < 0)) {
                    textView2.setVisibility(0);
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.wj, false));
                    textView2.setText(TextUtils.concat(oa.I0(starsTransaction.amount), " ", z11 ? spannableString3 : spannableString2));
                } else {
                    textView2.setVisibility(8);
                }
                jaVar.f9555y = z10;
                jaVar.setWillNotDraw(!z10);
            }
            n9Var2.setImageDrawable(ja.a(44, "search"));
            textView3.setText(LocaleController.getString(R.string.StarsTransactionPostsSearch));
            p80Var.setVisibility(8);
        }
        z11 = z14;
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        j10 = starsAmount2.amount;
        if (j10 <= 0) {
            textView2.setVisibility(0);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.uj, false));
            SpannableStringBuilder spannableStringBuilderI1 = oa.I0(starsTransaction.amount);
            if (z11) {
                spannableString = spannableString3;
            } else {
                spannableString = spannableString2;
            }
            textView2.setText(TextUtils.concat("+", spannableStringBuilderI1, " ", spannableString));
        } else {
            textView2.setVisibility(0);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.uj, false));
            SpannableStringBuilder spannableStringBuilderI2 = oa.I0(starsTransaction.amount);
            if (z11) {
                spannableString = spannableString3;
            } else {
                spannableString = spannableString2;
            }
            textView2.setText(TextUtils.concat("+", spannableStringBuilderI2, " ", spannableString));
        }
        jaVar.f9555y = z10;
        jaVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        ja jaVar = (ja) getCached();
        return jaVar != null ? jaVar : new ja(context, i10, c6Var);
    }
}
