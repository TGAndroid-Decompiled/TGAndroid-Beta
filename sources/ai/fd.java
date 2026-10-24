package ai;

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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.h70;
public final class fd extends k61 {
    public static final int f1326a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        String userName;
        boolean z11;
        boolean z12;
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.n5 n5Var;
        gd gdVar = (gd) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) l61Var.G;
        org.telegram.ui.ActionBar.n5 n5Var2 = gdVar.d;
        org.telegram.ui.Components.u9 u9Var = gdVar.f1366c;
        org.telegram.ui.ActionBar.g6 g6Var = gdVar.f1365b;
        TextView textView = gdVar.h;
        TextView textView2 = gdVar.f1367f;
        TextView textView3 = gdVar.e;
        int i12 = gdVar.f1364a;
        TextView textView4 = gdVar.f1368n;
        long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        gdVar.f1369r = !TextUtils.isEmpty(starsSubscription.title);
        if (peerDialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerDialogId));
            org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
            f9Var.q(chat);
            u9Var.e(chat, f9Var);
            if (chat != null) {
                userName = chat.title;
            } else {
                userName = null;
            }
            z11 = false;
        } else {
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
            org.telegram.ui.Components.f9 f9Var2 = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
            f9Var2.r(user);
            u9Var.e(user, f9Var2);
            userName = UserObject.getUserName(user);
            z11 = !UserObject.isBot(user);
        }
        long currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
        n5Var2.l(Emoji.replaceEmoji(userName, n5Var2.getPaint().getFontMetricsInt(), false), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                h70 h70Var = new h70(textView3, 14.0f, i12);
                h70Var.a(4.0f);
                h70Var.f37772f = false;
                SpannableString spannableString = new SpannableString("x");
                n5Var = n5Var2;
                z12 = z11;
                spannableString.setSpan(h70Var, 0, 1, 33);
                h70Var.f37770b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                n5Var = n5Var2;
                z12 = z11;
            }
            spannableStringBuilder.append(Emoji.replaceEmoji(starsSubscription.title, n5Var.getPaint().getFontMetricsInt(), false));
            textView3.setText(spannableStringBuilder);
        } else {
            z12 = z11;
            textView3.setVisibility(8);
        }
        if (gdVar.f1369r) {
            f7 = 13.0f;
        } else {
            f7 = 14.0f;
        }
        textView2.setTextSize(1, f7);
        if (!starsSubscription.canceled && !starsSubscription.bot_canceled) {
            long j10 = starsSubscription.until_date;
            if (j10 < currentTime) {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionExpired, LocaleController.formatDateChat(j10)));
                textView.setVisibility(8);
                org.telegram.ui.ActionBar.r6.W(textView4, org.telegram.ui.ActionBar.k6.wj, g6Var);
                textView4.setText(LocaleController.getString(R.string.StarsSubscriptionStatusExpired));
            } else {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j10)));
                textView.setVisibility(0);
                textView.setText(nd.Y0(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.r6.W(textView4, org.telegram.ui.ActionBar.k6.f21589z6, g6Var);
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
            org.telegram.ui.ActionBar.r6.W(textView4, org.telegram.ui.ActionBar.k6.wj, g6Var);
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
        gdVar.f1370s = z10;
        gdVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        gd gdVar = (gd) getCached();
        if (gdVar != null) {
            return gdVar;
        }
        return new gd(context, i10, g6Var);
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var2 != null) {
            Object obj = l61Var.G;
            if (obj instanceof TL_stars.StarsSubscription) {
                Object obj2 = l61Var2.G;
                if (obj2 instanceof TL_stars.StarsSubscription) {
                    return TextUtils.equals(((TL_stars.StarsSubscription) obj).f20569id, ((TL_stars.StarsSubscription) obj2).f20569id);
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
