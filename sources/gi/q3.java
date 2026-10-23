package gi;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.o00;
public final class q3 extends l61 {
    public static final int f11424a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f7;
        Object obj = m61Var.G;
        int i14 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            r3 r3Var = (r3) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = m61Var.f28565r;
            g6 g6Var = r3Var.f11453b;
            View view2 = r3Var.e;
            ImageView imageView = r3Var.f11455f;
            TLRPC.User user = MessagesController.getInstance(r3Var.f11452a).getUser(Long.valueOf(connectedbotstarref.bot_id));
            h9 h9Var = new h9((g6) null);
            h9Var.r(user);
            r3Var.f11454c.e(user, h9Var);
            TextView textView = r3Var.h;
            textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), textView.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                o00 o00Var = new o00();
                int i15 = k6.uj;
                o00Var.f40033f = k6.w0(i15, null);
                o00Var.f40035r = i15;
                o00Var.f40036s = null;
                o00Var.f40034n = true;
                o00Var.v = l.H0(connectedbotstarref.commission_permille);
                if (o00Var.f40032c != null) {
                    o00Var.f40032c = null;
                    o00Var.a();
                }
                spannableStringBuilder.setSpan(o00Var, 1, 2, 33);
            }
            int i16 = connectedbotstarref.duration_months;
            if (i16 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i16 >= 12 && i16 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i16 / 12, new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i16, new Object[0]));
            }
            r3Var.f11456n.setText(spannableStringBuilder);
            ImageView imageView2 = r3Var.f11457r;
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
                i11 = k6.wj;
            } else {
                i11 = k6.uj;
            }
            ShapeDrawable K = k6.K(dp, k6.w0(i11, g6Var));
            if (connectedbotstarref.revoked) {
                i12 = k6.wj;
            } else {
                i12 = k6.uj;
            }
            n6 O = r6.O(i12);
            view2.setBackground(K);
            r6.k(view2, K, O, null, g6Var);
            if (connectedbotstarref.revoked) {
                i13 = R.drawable.msg_link_2;
            } else {
                i13 = R.drawable.msg_limit_links;
            }
            imageView.setImageResource(i13);
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
            r3Var.f11458s = z10;
            r3Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            r3 r3Var2 = (r3) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = m61Var.f28565r;
            TLRPC.User user2 = MessagesController.getInstance(r3Var2.f11452a).getUser(Long.valueOf(starrefprogram.bot_id));
            h9 h9Var2 = new h9((g6) null);
            h9Var2.r(user2);
            r3Var2.f11454c.e(user2, h9Var2);
            r3Var2.h.setText(UserObject.getUserName(user2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                o00 o00Var2 = new o00();
                int i17 = k6.uj;
                o00Var2.f40033f = k6.w0(i17, null);
                o00Var2.f40035r = i17;
                o00Var2.f40036s = null;
                o00Var2.f40034n = true;
                o00Var2.v = l.H0(starrefprogram.commission_permille);
                if (o00Var2.f40032c != null) {
                    o00Var2.f40032c = null;
                    o00Var2.a();
                }
                spannableStringBuilder2.setSpan(o00Var2, 1, 2, 33);
            }
            int i18 = starrefprogram.duration_months;
            if (i18 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i18 >= 12 && i18 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i18 / 12, new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i18, new Object[0]));
            }
            r3Var2.f11456n.setText(spannableStringBuilder2);
            ImageView imageView3 = r3Var2.f11457r;
            if (!z12) {
                i14 = 8;
            }
            imageView3.setVisibility(i14);
            r3Var2.d.setVisibility(8);
            r3Var2.f11455f.setVisibility(8);
            r3Var2.e.setVisibility(8);
            r3Var2.f11458s = z10;
            r3Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new r3(context, i10, g6Var);
    }
}
