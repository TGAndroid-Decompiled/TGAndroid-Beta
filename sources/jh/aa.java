package jh;

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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
import org.telegram.ui.f70;
public final class aa extends v41 {
    public static final int f11747a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        String userName;
        boolean z11;
        boolean z12;
        float f9;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.h5 h5Var;
        ba baVar = (ba) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) w41Var.G;
        org.telegram.ui.ActionBar.h5 h5Var2 = baVar.d;
        org.telegram.ui.Components.t9 t9Var = baVar.f11817c;
        org.telegram.ui.ActionBar.c6 c6Var = baVar.f11816b;
        TextView textView = baVar.h;
        TextView textView2 = baVar.f11819f;
        TextView textView3 = baVar.f11818e;
        int i12 = baVar.f11815a;
        TextView textView4 = baVar.f11820n;
        long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        baVar.f11821r = !TextUtils.isEmpty(starsSubscription.title);
        if (peerDialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerDialogId));
            org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
            e9Var.q(chat);
            t9Var.e(chat, e9Var);
            if (chat != null) {
                userName = chat.title;
            } else {
                userName = null;
            }
            z11 = false;
        } else {
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
            org.telegram.ui.Components.e9 e9Var2 = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
            e9Var2.r(user);
            t9Var.e(user, e9Var2);
            userName = UserObject.getUserName(user);
            z11 = !UserObject.isBot(user);
        }
        long currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
        h5Var2.l(Emoji.replaceEmoji(userName, h5Var2.getPaint().getFontMetricsInt(), false), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                f70 f70Var = new f70(textView3, 14.0f, i12);
                f70Var.a(4.0f);
                f70Var.f38014f = false;
                SpannableString spannableString = new SpannableString("x");
                h5Var = h5Var2;
                z12 = z11;
                spannableString.setSpan(f70Var, 0, 1, 33);
                f70Var.f38011b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                h5Var = h5Var2;
                z12 = z11;
            }
            spannableStringBuilder.append(Emoji.replaceEmoji(starsSubscription.title, h5Var.getPaint().getFontMetricsInt(), false));
            textView3.setText(spannableStringBuilder);
        } else {
            z12 = z11;
            textView3.setVisibility(8);
        }
        if (baVar.f11821r) {
            f9 = 13.0f;
        } else {
            f9 = 14.0f;
        }
        textView2.setTextSize(1, f9);
        if (!starsSubscription.canceled && !starsSubscription.bot_canceled) {
            long j10 = starsSubscription.until_date;
            if (j10 < currentTime) {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionExpired, LocaleController.formatDateChat(j10)));
                textView.setVisibility(8);
                textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, c6Var));
                textView4.setText(LocaleController.getString(R.string.StarsSubscriptionStatusExpired));
            } else {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j10)));
                textView.setVisibility(0);
                textView.setText(ia.X0(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23450z6, c6Var));
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
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, c6Var));
            if (starsSubscription.bot_canceled) {
                if (z12) {
                    i11 = R.string.StarsSubscriptionStatusBizCancelled;
                } else {
                    i11 = R.string.StarsSubscriptionStatusBotCancelled;
                }
            } else {
                i11 = R.string.StarsSubscriptionStatusCancelled;
            }
            textView4.setText(LocaleController.getString(i11));
        }
        baVar.f11822s = z10;
        baVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        ba baVar = (ba) getCached();
        if (baVar != null) {
            return baVar;
        }
        return new ba(context, i10, c6Var);
    }

    @Override
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        if (w41Var2 != null) {
            Object obj = w41Var.G;
            if (obj instanceof TL_stars.StarsSubscription) {
                Object obj2 = w41Var2.G;
                if (obj2 instanceof TL_stars.StarsSubscription) {
                    return TextUtils.equals(((TL_stars.StarsSubscription) obj).f22620id, ((TL_stars.StarsSubscription) obj2).f22620id);
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
