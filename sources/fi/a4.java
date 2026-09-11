package fi;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.d10;
public final class a4 extends g51 {
    public static final int f9549a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        int i10;
        int i11;
        int i12;
        float f7;
        Object obj = h51Var.G;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            b4 b4Var = (b4) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = h51Var.f26600r;
            View view2 = b4Var.f9567e;
            ImageView imageView = b4Var.f9568f;
            TLRPC.User user = MessagesController.getInstance(b4Var.f9564a).getUser(Long.valueOf(connectedbotstarref.bot_id));
            i9 i9Var = new i9((f6) null);
            i9Var.r(user);
            b4Var.f9566c.e(user, i9Var);
            TextView textView = b4Var.h;
            textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), textView.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                d10 d10Var = new d10();
                d10Var.f35604f = j6.w0(null, j6.uj, false);
                d10Var.f35605n = m.G0(connectedbotstarref.commission_permille);
                if (d10Var.f35602c != null) {
                    d10Var.f35602c = null;
                    d10Var.a();
                }
                spannableStringBuilder.setSpan(d10Var, 1, 2, 33);
            }
            int i14 = connectedbotstarref.duration_months;
            if (i14 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i14 >= 12 && i14 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i14 / 12, new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i14, new Object[0]));
            }
            b4Var.f9569n.setText(spannableStringBuilder);
            ImageView imageView2 = b4Var.f9570r;
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
                i11 = j6.wj;
            } else {
                i11 = j6.uj;
            }
            view2.setBackground(j6.K(dp, j6.v0(i11, b4Var.f9565b)));
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
            b4Var.f9571s = z10;
            b4Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            b4 b4Var2 = (b4) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = h51Var.f26600r;
            TLRPC.User user2 = MessagesController.getInstance(b4Var2.f9564a).getUser(Long.valueOf(starrefprogram.bot_id));
            i9 i9Var2 = new i9((f6) null);
            i9Var2.r(user2);
            b4Var2.f9566c.e(user2, i9Var2);
            b4Var2.h.setText(UserObject.getUserName(user2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                d10 d10Var2 = new d10();
                d10Var2.f35604f = j6.w0(null, j6.uj, false);
                d10Var2.f35605n = m.G0(starrefprogram.commission_permille);
                if (d10Var2.f35602c != null) {
                    d10Var2.f35602c = null;
                    d10Var2.a();
                }
                spannableStringBuilder2.setSpan(d10Var2, 1, 2, 33);
            }
            int i15 = starrefprogram.duration_months;
            if (i15 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i15 >= 12 && i15 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i15 / 12, new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i15, new Object[0]));
            }
            b4Var2.f9569n.setText(spannableStringBuilder2);
            ImageView imageView3 = b4Var2.f9570r;
            if (!z12) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            b4Var2.d.setVisibility(8);
            b4Var2.f9568f.setVisibility(8);
            b4Var2.f9567e.setVisibility(8);
            b4Var2.f9571s = z10;
            b4Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new b4(context, i10, f6Var);
    }
}
