package ei;

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
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.c10;
public final class a4 extends q61 {
    public static final int f8941a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        int i10;
        int i11;
        int i12;
        float f7;
        Object obj = r61Var.G;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            b4 b4Var = (b4) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = r61Var.f30367r;
            View view2 = b4Var.f8969e;
            ImageView imageView = b4Var.f8970f;
            TLRPC.User user = MessagesController.getInstance(b4Var.f8966a).getUser(Long.valueOf(connectedbotstarref.bot_id));
            j9 j9Var = new j9((d6) null);
            j9Var.r(user);
            b4Var.f8968c.e(user, j9Var);
            TextView textView = b4Var.h;
            textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), textView.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                c10 c10Var = new c10();
                c10Var.f36505f = h6.x0(null, h6.uj, false);
                c10Var.f36506n = l.H0(connectedbotstarref.commission_permille);
                if (c10Var.f36503c != null) {
                    c10Var.f36503c = null;
                    c10Var.a();
                }
                spannableStringBuilder.setSpan(c10Var, 1, 2, 33);
            }
            int i14 = connectedbotstarref.duration_months;
            if (i14 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i14 >= 12 && i14 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i14 / 12, new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i14, new Object[0]));
            }
            b4Var.f8971n.setText(spannableStringBuilder);
            ImageView imageView2 = b4Var.f8972r;
            if (z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
            b4Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int dp = AndroidUtilities.dp(9.665f);
            if (connectedbotstarref.revoked) {
                i11 = h6.wj;
            } else {
                i11 = h6.uj;
            }
            view2.setBackground(h6.K(dp, h6.w0(i11, b4Var.f8967b)));
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
            b4Var.f8973s = z10;
            b4Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            b4 b4Var2 = (b4) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = r61Var.f30367r;
            TLRPC.User user2 = MessagesController.getInstance(b4Var2.f8966a).getUser(Long.valueOf(starrefprogram.bot_id));
            j9 j9Var2 = new j9((d6) null);
            j9Var2.r(user2);
            b4Var2.f8968c.e(user2, j9Var2);
            b4Var2.h.setText(UserObject.getUserName(user2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                c10 c10Var2 = new c10();
                c10Var2.f36505f = h6.x0(null, h6.uj, false);
                c10Var2.f36506n = l.H0(starrefprogram.commission_permille);
                if (c10Var2.f36503c != null) {
                    c10Var2.f36503c = null;
                    c10Var2.a();
                }
                spannableStringBuilder2.setSpan(c10Var2, 1, 2, 33);
            }
            int i15 = starrefprogram.duration_months;
            if (i15 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i15 >= 12 && i15 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i15 / 12, new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i15, new Object[0]));
            }
            b4Var2.f8971n.setText(spannableStringBuilder2);
            ImageView imageView3 = b4Var2.f8972r;
            if (!z12) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            b4Var2.d.setVisibility(8);
            b4Var2.f8970f.setVisibility(8);
            b4Var2.f8969e.setVisibility(8);
            b4Var2.f8973s = z10;
            b4Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        return new b4(context, i10, d6Var);
    }
}
