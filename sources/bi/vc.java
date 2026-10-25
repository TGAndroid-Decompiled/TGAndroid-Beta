package bi;

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
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.j70;
public final class vc extends s61 {
    public static final int f5579a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        String userName;
        boolean z11;
        boolean z12;
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b6 b6Var;
        wc wcVar = (wc) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) t61Var.G;
        org.telegram.ui.ActionBar.b6 b6Var2 = wcVar.d;
        org.telegram.ui.Components.y9 y9Var = wcVar.f5626c;
        org.telegram.ui.ActionBar.u6 u6Var = wcVar.f5625b;
        TextView textView = wcVar.h;
        TextView textView2 = wcVar.f5627f;
        TextView textView3 = wcVar.e;
        int i12 = wcVar.f5624a;
        TextView textView4 = wcVar.f5628n;
        long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        wcVar.f5629r = !TextUtils.isEmpty(starsSubscription.title);
        if (peerDialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerDialogId));
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            j9Var.q(chat);
            y9Var.f(chat, j9Var);
            if (chat != null) {
                userName = chat.title;
            } else {
                userName = null;
            }
            z11 = false;
        } else {
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
            org.telegram.ui.Components.j9 j9Var2 = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            j9Var2.r(user);
            y9Var.f(user, j9Var2);
            userName = UserObject.getUserName(user);
            z11 = !UserObject.isBot(user);
        }
        long currentTime = ConnectionsManager.getInstance(i12).getCurrentTime();
        b6Var2.l(Emoji.replaceEmoji(userName, b6Var2.getPaint().getFontMetricsInt(), false), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                j70 j70Var = new j70(textView3, 14.0f, i12);
                j70Var.a(4.0f);
                j70Var.f40472f = false;
                SpannableString spannableString = new SpannableString("x");
                b6Var = b6Var2;
                z12 = z11;
                spannableString.setSpan(j70Var, 0, 1, 33);
                j70Var.f40470b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                b6Var = b6Var2;
                z12 = z11;
            }
            spannableStringBuilder.append(Emoji.replaceEmoji(starsSubscription.title, b6Var.getPaint().getFontMetricsInt(), false));
            textView3.setText(spannableStringBuilder);
        } else {
            z12 = z11;
            textView3.setVisibility(8);
        }
        if (wcVar.f5629r) {
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
                org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.wj, u6Var);
                textView4.setText(LocaleController.getString(R.string.StarsSubscriptionStatusExpired));
            } else {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j10)));
                textView.setVisibility(0);
                textView.setText(dd.W0(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.f23765z6, u6Var);
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
            org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.wj, u6Var);
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
        wcVar.f5630s = z10;
        wcVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        wc wcVar = (wc) getCached();
        if (wcVar != null) {
            return wcVar;
        }
        return new wc(context, i10, u6Var);
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        if (t61Var2 != null) {
            Object obj = t61Var.G;
            if (obj instanceof TL_stars.StarsSubscription) {
                Object obj2 = t61Var2.G;
                if (obj2 instanceof TL_stars.StarsSubscription) {
                    return TextUtils.equals(((TL_stars.StarsSubscription) obj).f22255id, ((TL_stars.StarsSubscription) obj2).f22255id);
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
