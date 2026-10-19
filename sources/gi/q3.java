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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.l00;
public final class q3 extends f61 {
    public static final int f11400a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        int i10;
        int i11;
        int i12;
        float f7;
        Object obj = g61Var.G;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            r3 r3Var = (r3) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = g61Var.f26505r;
            View view2 = r3Var.e;
            ImageView imageView = r3Var.f11431f;
            TLRPC.User user = MessagesController.getInstance(r3Var.f11428a).getUser(Long.valueOf(connectedbotstarref.bot_id));
            h9 h9Var = new h9((d6) null);
            h9Var.r(user);
            r3Var.f11430c.e(user, h9Var);
            TextView textView = r3Var.h;
            textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), textView.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                l00 l00Var = new l00();
                l00Var.f38706f = h6.x0(null, h6.uj, false);
                l00Var.f38707n = l.H0(connectedbotstarref.commission_permille);
                if (l00Var.f38705c != null) {
                    l00Var.f38705c = null;
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
            r3Var.f11432n.setText(spannableStringBuilder);
            ImageView imageView2 = r3Var.f11433r;
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
            view2.setBackground(h6.K(dp, h6.w0(i11, r3Var.f11429b)));
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
            r3Var.f11434s = z10;
            r3Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            r3 r3Var2 = (r3) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = g61Var.f26505r;
            TLRPC.User user2 = MessagesController.getInstance(r3Var2.f11428a).getUser(Long.valueOf(starrefprogram.bot_id));
            h9 h9Var2 = new h9((d6) null);
            h9Var2.r(user2);
            r3Var2.f11430c.e(user2, h9Var2);
            r3Var2.h.setText(UserObject.getUserName(user2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                l00 l00Var2 = new l00();
                l00Var2.f38706f = h6.x0(null, h6.uj, false);
                l00Var2.f38707n = l.H0(starrefprogram.commission_permille);
                if (l00Var2.f38705c != null) {
                    l00Var2.f38705c = null;
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
            r3Var2.f11432n.setText(spannableStringBuilder2);
            ImageView imageView3 = r3Var2.f11433r;
            if (!z12) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            r3Var2.d.setVisibility(8);
            r3Var2.f11431f.setVisibility(8);
            r3Var2.e.setVisibility(8);
            r3Var2.f11434s = z10;
            r3Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new r3(context, i10, d6Var);
    }
}
