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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.d10;
public final class b4 extends f61 {
    public static final int f8944a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        int i10;
        int i11;
        int i12;
        float f7;
        Object obj = g61Var.G;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            c4 c4Var = (c4) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = g61Var.f26680r;
            View view2 = c4Var.f8962e;
            ImageView imageView = c4Var.f8963f;
            TLRPC.User user = MessagesController.getInstance(c4Var.f8959a).getUser(Long.valueOf(connectedbotstarref.bot_id));
            h9 h9Var = new h9((d6) null);
            h9Var.r(user);
            c4Var.f8961c.e(user, h9Var);
            TextView textView = c4Var.h;
            textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), textView.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                d10 d10Var = new d10();
                d10Var.f35609f = i6.w0(null, i6.uj, false);
                d10Var.f35610n = m.L0(connectedbotstarref.commission_permille);
                if (d10Var.f35607c != null) {
                    d10Var.f35607c = null;
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
            c4Var.f8964n.setText(spannableStringBuilder);
            ImageView imageView2 = c4Var.f8965r;
            if (z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
            c4Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int dp = AndroidUtilities.dp(9.665f);
            if (connectedbotstarref.revoked) {
                i11 = i6.wj;
            } else {
                i11 = i6.uj;
            }
            view2.setBackground(i6.K(dp, i6.v0(i11, c4Var.f8960b)));
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
            c4Var.f8966s = z10;
            c4Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            c4 c4Var2 = (c4) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = g61Var.f26680r;
            TLRPC.User user2 = MessagesController.getInstance(c4Var2.f8959a).getUser(Long.valueOf(starrefprogram.bot_id));
            h9 h9Var2 = new h9((d6) null);
            h9Var2.r(user2);
            c4Var2.f8961c.e(user2, h9Var2);
            c4Var2.h.setText(UserObject.getUserName(user2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                d10 d10Var2 = new d10();
                d10Var2.f35609f = i6.w0(null, i6.uj, false);
                d10Var2.f35610n = m.L0(starrefprogram.commission_permille);
                if (d10Var2.f35607c != null) {
                    d10Var2.f35607c = null;
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
            c4Var2.f8964n.setText(spannableStringBuilder2);
            ImageView imageView3 = c4Var2.f8965r;
            if (!z12) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            c4Var2.d.setVisibility(8);
            c4Var2.f8963f.setVisibility(8);
            c4Var2.f8962e.setVisibility(8);
            c4Var2.f8966s = z10;
            c4Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new c4(context, i10, d6Var);
    }
}
