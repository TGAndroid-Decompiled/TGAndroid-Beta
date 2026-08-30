package lh;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.p70;
public final class ba extends h51 {
    public static final int f12177a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        String userName;
        boolean z10;
        boolean z11;
        float f10;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.k5 k5Var;
        ca caVar = (ca) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) i51Var.G;
        org.telegram.ui.ActionBar.k5 k5Var2 = caVar.d;
        org.telegram.ui.Components.p9 p9Var = caVar.f12264c;
        org.telegram.ui.ActionBar.f6 f6Var = caVar.f12263b;
        TextView textView = caVar.h;
        TextView textView2 = caVar.f12265f;
        TextView textView3 = caVar.e;
        int i12 = caVar.f12262a;
        TextView textView4 = caVar.f12266n;
        long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        caVar.f12267r = !TextUtils.isEmpty(starsSubscription.title);
        if (peerDialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerDialogId));
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
            z8Var.q(chat);
            p9Var.e(chat, z8Var);
            if (chat != null) {
                userName = chat.title;
            } else {
                userName = null;
            }
            z10 = false;
        } else {
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
            org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
            z8Var2.r(user);
            p9Var.e(user, z8Var2);
            userName = UserObject.getUserName(user);
            z10 = !UserObject.isBot(user);
        }
        long currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
        k5Var2.l(Emoji.replaceEmoji(userName, k5Var2.getPaint().getFontMetricsInt(), false), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                p70 p70Var = new p70(textView3, 14.0f, i12);
                p70Var.a(4.0f);
                p70Var.f37203f = false;
                SpannableString spannableString = new SpannableString("x");
                k5Var = k5Var2;
                z11 = z10;
                spannableString.setSpan(p70Var, 0, 1, 33);
                p70Var.f37201b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                k5Var = k5Var2;
                z11 = z10;
            }
            spannableStringBuilder.append(Emoji.replaceEmoji(starsSubscription.title, k5Var.getPaint().getFontMetricsInt(), false));
            textView3.setText(spannableStringBuilder);
        } else {
            z11 = z10;
            textView3.setVisibility(8);
        }
        if (caVar.f12267r) {
            f10 = 13.0f;
        } else {
            f10 = 14.0f;
        }
        textView2.setTextSize(1, f10);
        if (!starsSubscription.canceled && !starsSubscription.bot_canceled) {
            long j10 = starsSubscription.until_date;
            if (j10 < currentTime) {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionExpired, LocaleController.formatDateChat(j10)));
                textView.setVisibility(8);
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, f6Var));
                textView4.setText(LocaleController.getString(R.string.StarsSubscriptionStatusExpired));
            } else {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j10)));
                textView.setVisibility(0);
                textView.setText(ja.X0(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20298z6, f6Var));
                int i13 = starsSubscription.pricing.period;
                if (i13 == 2592000) {
                    textView4.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
                } else if (i13 == 60) {
                    textView4.setText("per minute");
                } else if (i13 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        } else {
            long j11 = starsSubscription.until_date;
            if (j11 < currentTime) {
                i10 = R.string.StarsSubscriptionExpired;
            } else {
                i10 = R.string.StarsSubscriptionExpires;
            }
            textView2.setText(LocaleController.formatString(i10, LocaleController.formatDateChat(j11)));
            textView.setVisibility(8);
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.wj, f6Var));
            if (starsSubscription.bot_canceled) {
                if (z11) {
                    i11 = R.string.StarsSubscriptionStatusBizCancelled;
                } else {
                    i11 = R.string.StarsSubscriptionStatusBotCancelled;
                }
            } else {
                i11 = R.string.StarsSubscriptionStatusCancelled;
            }
            textView4.setText(LocaleController.getString(i11));
        }
        caVar.f12268s = z4;
        caVar.setWillNotDraw(!z4);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        ca caVar = (ca) getCached();
        if (caVar != null) {
            return caVar;
        }
        return new ca(context, i10, f6Var);
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var2 != null) {
            Object obj = i51Var.G;
            if (obj instanceof TL_stars.StarsSubscription) {
                Object obj2 = i51Var2.G;
                if (obj2 instanceof TL_stars.StarsSubscription) {
                    return TextUtils.equals(((TL_stars.StarsSubscription) obj).f19410id, ((TL_stars.StarsSubscription) obj2).f19410id);
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
