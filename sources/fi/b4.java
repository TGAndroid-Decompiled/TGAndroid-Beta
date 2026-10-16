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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.i10;
public final class b4 extends l61 {
    public static final int f9191a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        int i10;
        int i11;
        int i12;
        float f7;
        Object obj = m61Var.G;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            c4 c4Var = (c4) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = m61Var.f26952r;
            View view2 = c4Var.e;
            ImageView imageView = c4Var.f9215f;
            TLRPC.User user = MessagesController.getInstance(c4Var.f9212a).getUser(Long.valueOf(connectedbotstarref.bot_id));
            k9 k9Var = new k9((c6) null);
            k9Var.r(user);
            c4Var.f9214c.e(user, k9Var);
            TextView textView = c4Var.h;
            textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), textView.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                i10 i10Var = new i10();
                i10Var.f36693f = g6.x0(null, g6.uj, false);
                i10Var.f36694n = l.H0(connectedbotstarref.commission_permille);
                if (i10Var.f36692c != null) {
                    i10Var.f36692c = null;
                    i10Var.a();
                }
                spannableStringBuilder.setSpan(i10Var, 1, 2, 33);
            }
            int i14 = connectedbotstarref.duration_months;
            if (i14 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i14 >= 12 && i14 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i14 / 12, new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i14, new Object[0]));
            }
            c4Var.f9216n.setText(spannableStringBuilder);
            ImageView imageView2 = c4Var.f9217r;
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
                i11 = g6.wj;
            } else {
                i11 = g6.uj;
            }
            view2.setBackground(g6.K(dp, g6.w0(i11, c4Var.f9213b)));
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
            c4Var.f9218s = z10;
            c4Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            c4 c4Var2 = (c4) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = m61Var.f26952r;
            TLRPC.User user2 = MessagesController.getInstance(c4Var2.f9212a).getUser(Long.valueOf(starrefprogram.bot_id));
            k9 k9Var2 = new k9((c6) null);
            k9Var2.r(user2);
            c4Var2.f9214c.e(user2, k9Var2);
            c4Var2.h.setText(UserObject.getUserName(user2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                i10 i10Var2 = new i10();
                i10Var2.f36693f = g6.x0(null, g6.uj, false);
                i10Var2.f36694n = l.H0(starrefprogram.commission_permille);
                if (i10Var2.f36692c != null) {
                    i10Var2.f36692c = null;
                    i10Var2.a();
                }
                spannableStringBuilder2.setSpan(i10Var2, 1, 2, 33);
            }
            int i15 = starrefprogram.duration_months;
            if (i15 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i15 >= 12 && i15 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i15 / 12, new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i15, new Object[0]));
            }
            c4Var2.f9216n.setText(spannableStringBuilder2);
            ImageView imageView3 = c4Var2.f9217r;
            if (!z12) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            c4Var2.d.setVisibility(8);
            c4Var2.f9215f.setVisibility(8);
            c4Var2.e.setVisibility(8);
            c4Var2.f9218s = z10;
            c4Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new c4(context, i10, c6Var);
    }
}
