package gi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.l00;
public final class q3 extends g61 {
    public static final int f11398a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        int i10;
        int i11;
        int i12;
        float f7;
        Object obj = h61Var.G;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            r3 r3Var = (r3) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = h61Var.f26788r;
            View view2 = r3Var.e;
            ImageView imageView = r3Var.f11429f;
            TLRPC.User user = MessagesController.getInstance(r3Var.f11426a).getUser(Long.valueOf(connectedbotstarref.bot_id));
            h9 h9Var = new h9((d6) null);
            h9Var.r(user);
            r3Var.f11428c.e(user, h9Var);
            TextView textView = r3Var.h;
            textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), textView.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                l00 l00Var = new l00();
                l00Var.f38710f = h6.x0(null, h6.uj, false);
                l00Var.f38711n = l.H0(connectedbotstarref.commission_permille);
                if (l00Var.f38709c != null) {
                    l00Var.f38709c = null;
                    l00Var.a();
                }
                spannableStringBuilder.setSpan(l00Var, 1, 2, 33);
            }
            int i14 = connectedbotstarref.duration_months;
            if (i14 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i14 >= 12 && i14 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i14 / 12, new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i14, new Object[0]));
            }
            r3Var.f11430n.setText(spannableStringBuilder);
            ImageView imageView2 = r3Var.f11431r;
            if (z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
            r3Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int dp = AndroidUtilities.dp(9.665f);
            if (connectedbotstarref.revoked) {
                i11 = h6.wj;
            } else {
                i11 = h6.uj;
            }
            view2.setBackground(h6.K(dp, h6.w0(i11, r3Var.f11427b)));
            if (connectedbotstarref.revoked) {
                i12 = R.drawable.msg_link_2;
            } else {
                i12 = R.drawable.msg_limit_links;
            }
            imageView.setImageResource(i12);
            float f10 = 0.6f;
            if (connectedbotstarref.revoked) {
                f7 = 0.8f;
            } else {
                f7 = 0.6f;
            }
            imageView.setScaleX(f7);
            if (connectedbotstarref.revoked) {
                f10 = 0.8f;
            }
            imageView.setScaleY(f10);
            r3Var.f11432s = z10;
            r3Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            r3 r3Var2 = (r3) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = h61Var.f26788r;
            TLRPC.User user2 = MessagesController.getInstance(r3Var2.f11426a).getUser(Long.valueOf(starrefprogram.bot_id));
            h9 h9Var2 = new h9((d6) null);
            h9Var2.r(user2);
            r3Var2.f11428c.e(user2, h9Var2);
            r3Var2.h.setText(UserObject.getUserName(user2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                l00 l00Var2 = new l00();
                l00Var2.f38710f = h6.x0(null, h6.uj, false);
                l00Var2.f38711n = l.H0(starrefprogram.commission_permille);
                if (l00Var2.f38709c != null) {
                    l00Var2.f38709c = null;
                    l00Var2.a();
                }
                spannableStringBuilder2.setSpan(l00Var2, 1, 2, 33);
            }
            int i15 = starrefprogram.duration_months;
            if (i15 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i15 >= 12 && i15 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i15 / 12, new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i15, new Object[0]));
            }
            r3Var2.f11430n.setText(spannableStringBuilder2);
            ImageView imageView3 = r3Var2.f11431r;
            if (!z12) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            r3Var2.d.setVisibility(8);
            r3Var2.f11429f.setVisibility(8);
            r3Var2.e.setVisibility(8);
            r3Var2.f11432s = z10;
            r3Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, d6 d6Var) {
        return new r3(context, i10, d6Var);
    }
}
