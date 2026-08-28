package gh;

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
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.c70;
public final class ga extends k41 {
    public static final int f8164a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        String userName;
        boolean z11;
        boolean z12;
        float f10;
        int i9;
        int i10;
        org.telegram.ui.ActionBar.h5 h5Var;
        ha haVar = (ha) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) l41Var.G;
        org.telegram.ui.ActionBar.h5 h5Var2 = haVar.d;
        org.telegram.ui.Components.o9 o9Var = haVar.f8237c;
        org.telegram.ui.ActionBar.b6 b6Var = haVar.f8236b;
        TextView textView = haVar.h;
        TextView textView2 = haVar.f8239f;
        TextView textView3 = haVar.f8238e;
        int i11 = haVar.f8235a;
        TextView textView4 = haVar.f8240n;
        long peerDialogId = DialogObject.getPeerDialogId(starsSubscription.peer);
        haVar.f8241r = !TextUtils.isEmpty(starsSubscription.title);
        if (peerDialogId < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            z8Var.q(chat);
            o9Var.e(chat, z8Var);
            if (chat != null) {
                userName = chat.title;
            } else {
                userName = null;
            }
            z11 = false;
        } else {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
            org.telegram.ui.Components.z8 z8Var2 = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            z8Var2.r(user);
            o9Var.e(user, z8Var2);
            userName = UserObject.getUserName(user);
            z11 = !UserObject.isBot(user);
        }
        long currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
        h5Var2.l(Emoji.replaceEmoji(userName, h5Var2.getPaint().getFontMetricsInt(), false), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                c70 c70Var = new c70(textView3, 14.0f, i11);
                c70Var.a(4.0f);
                c70Var.f37084f = false;
                SpannableString spannableString = new SpannableString("x");
                h5Var = h5Var2;
                z12 = z11;
                spannableString.setSpan(c70Var, 0, 1, 33);
                c70Var.f37081b.setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(starsSubscription.photo)), "14_14", null, null, 0, 0);
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
        if (haVar.f8241r) {
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
                textView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.wj, b6Var));
                textView4.setText(LocaleController.getString(R.string.StarsSubscriptionStatusExpired));
            } else {
                textView2.setText(LocaleController.formatString(R.string.StarsSubscriptionRenews, LocaleController.formatDateChat(j10)));
                textView.setVisibility(0);
                textView.setText(oa.X0(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                textView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23386z6, b6Var));
                int i12 = starsSubscription.pricing.period;
                if (i12 == 2592000) {
                    textView4.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
                } else if (i12 == 60) {
                    textView4.setText("per minute");
                } else if (i12 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        } else {
            long j11 = starsSubscription.until_date;
            if (j11 < currentTime) {
                i9 = R.string.StarsSubscriptionExpired;
            } else {
                i9 = R.string.StarsSubscriptionExpires;
            }
            textView2.setText(LocaleController.formatString(i9, LocaleController.formatDateChat(j11)));
            textView.setVisibility(8);
            textView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.wj, b6Var));
            if (starsSubscription.bot_canceled) {
                if (z12) {
                    i10 = R.string.StarsSubscriptionStatusBizCancelled;
                } else {
                    i10 = R.string.StarsSubscriptionStatusBotCancelled;
                }
            } else {
                i10 = R.string.StarsSubscriptionStatusCancelled;
            }
            textView4.setText(LocaleController.getString(i10));
        }
        haVar.f8242s = z10;
        haVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        ha haVar = (ha) getCached();
        if (haVar != null) {
            return haVar;
        }
        return new ha(context, i9, b6Var);
    }

    @Override
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        if (l41Var2 != null) {
            Object obj = l41Var.G;
            if (obj instanceof TL_stars.StarsSubscription) {
                Object obj2 = l41Var2.G;
                if (obj2 instanceof TL_stars.StarsSubscription) {
                    return TextUtils.equals(((TL_stars.StarsSubscription) obj).f22608id, ((TL_stars.StarsSubscription) obj2).f22608id);
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
