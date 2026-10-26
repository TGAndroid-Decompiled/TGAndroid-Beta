package hi;

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
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.m00;
public final class z3 extends s61 {
    public static final int f13400a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f7;
        Object obj = t61Var.G;
        int i14 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            a4 a4Var = (a4) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = t61Var.f32881r;
            u6 u6Var = a4Var.f12862b;
            View view2 = a4Var.e;
            ImageView imageView = a4Var.f12864f;
            TLRPC.User user = MessagesController.getInstance(a4Var.f12861a).getUser(Long.valueOf(connectedbotstarref.bot_id));
            j9 j9Var = new j9((u6) null);
            j9Var.r(user);
            a4Var.f12863c.f(user, j9Var);
            TextView textView = a4Var.h;
            textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), textView.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                m00 m00Var = new m00();
                int i15 = y6.uj;
                m00Var.f41421f = y6.w0(i15, null);
                m00Var.f41423r = i15;
                m00Var.f41424s = null;
                m00Var.f41422n = true;
                m00Var.v = k.F0(connectedbotstarref.commission_permille);
                if (m00Var.f41420c != null) {
                    m00Var.f41420c = null;
                    m00Var.a();
                }
                spannableStringBuilder.setSpan(m00Var, 1, 2, 33);
            }
            int i16 = connectedbotstarref.duration_months;
            if (i16 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i16 >= 12 && i16 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i16 / 12, new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i16, new Object[0]));
            }
            a4Var.f12865n.setText(spannableStringBuilder);
            ImageView imageView2 = a4Var.f12866r;
            if (z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
            a4Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int dp = AndroidUtilities.dp(9.665f);
            if (connectedbotstarref.revoked) {
                i11 = y6.wj;
            } else {
                i11 = y6.uj;
            }
            ShapeDrawable K = y6.K(dp, y6.w0(i11, u6Var));
            if (connectedbotstarref.revoked) {
                i12 = y6.wj;
            } else {
                i12 = y6.uj;
            }
            b7 N = f7.N(i12);
            view2.setBackground(K);
            f7.k(view2, K, N, null, u6Var);
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
            a4Var.f12867s = z10;
            a4Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            a4 a4Var2 = (a4) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = t61Var.f32881r;
            TLRPC.User user2 = MessagesController.getInstance(a4Var2.f12861a).getUser(Long.valueOf(starrefprogram.bot_id));
            j9 j9Var2 = new j9((u6) null);
            j9Var2.r(user2);
            a4Var2.f12863c.f(user2, j9Var2);
            a4Var2.h.setText(UserObject.getUserName(user2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                m00 m00Var2 = new m00();
                int i17 = y6.uj;
                m00Var2.f41421f = y6.w0(i17, null);
                m00Var2.f41423r = i17;
                m00Var2.f41424s = null;
                m00Var2.f41422n = true;
                m00Var2.v = k.F0(starrefprogram.commission_permille);
                if (m00Var2.f41420c != null) {
                    m00Var2.f41420c = null;
                    m00Var2.a();
                }
                spannableStringBuilder2.setSpan(m00Var2, 1, 2, 33);
            }
            int i18 = starrefprogram.duration_months;
            if (i18 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i18 >= 12 && i18 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i18 / 12, new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i18, new Object[0]));
            }
            a4Var2.f12865n.setText(spannableStringBuilder2);
            ImageView imageView3 = a4Var2.f12866r;
            if (!z12) {
                i14 = 8;
            }
            imageView3.setVisibility(i14);
            a4Var2.d.setVisibility(8);
            a4Var2.f12864f.setVisibility(8);
            a4Var2.e.setVisibility(8);
            a4Var2.f12867s = z10;
            a4Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new a4(context, i10, u6Var);
    }
}
