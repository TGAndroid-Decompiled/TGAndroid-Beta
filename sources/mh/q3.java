package mh;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.z8;
import org.telegram.ui.l00;
public final class q3 extends k41 {
    public static final int f18058a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        int i9;
        int i10;
        int i11;
        float f10;
        Object obj = l41Var.G;
        int i12 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            r3 r3Var = (r3) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = l41Var.f30345r;
            View view2 = r3Var.f18081e;
            ImageView imageView = r3Var.f18082f;
            TLRPC.User user = MessagesController.getInstance(r3Var.f18078a).getUser(Long.valueOf(connectedbotstarref.bot_id));
            z8 z8Var = new z8((b6) null);
            z8Var.r(user);
            r3Var.f18080c.e(user, z8Var);
            TextView textView = r3Var.h;
            textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), textView.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                l00 l00Var = new l00();
                l00Var.f39963f = f6.w0(null, f6.uj, false);
                l00Var.f39964n = l.F0(connectedbotstarref.commission_permille);
                if (l00Var.f39961c != null) {
                    l00Var.f39961c = null;
                    l00Var.a();
                }
                spannableStringBuilder.setSpan(l00Var, 1, 2, 33);
            }
            int i13 = connectedbotstarref.duration_months;
            if (i13 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i13 >= 12 && i13 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i13 / 12, new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i13, new Object[0]));
            }
            r3Var.f18083n.setText(spannableStringBuilder);
            ImageView imageView2 = r3Var.f18084r;
            if (z11) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            imageView2.setVisibility(i9);
            r3Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int dp = AndroidUtilities.dp(9.665f);
            if (connectedbotstarref.revoked) {
                i10 = f6.wj;
            } else {
                i10 = f6.uj;
            }
            view2.setBackground(f6.K(dp, f6.v0(i10, r3Var.f18079b)));
            if (connectedbotstarref.revoked) {
                i11 = R.drawable.msg_link_2;
            } else {
                i11 = R.drawable.msg_limit_links;
            }
            imageView.setImageResource(i11);
            float f11 = 0.6f;
            if (connectedbotstarref.revoked) {
                f10 = 0.8f;
            } else {
                f10 = 0.6f;
            }
            imageView.setScaleX(f10);
            if (connectedbotstarref.revoked) {
                f11 = 0.8f;
            }
            imageView.setScaleY(f11);
            r3Var.f18085s = z10;
            r3Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            r3 r3Var2 = (r3) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = l41Var.f30345r;
            TLRPC.User user2 = MessagesController.getInstance(r3Var2.f18078a).getUser(Long.valueOf(starrefprogram.bot_id));
            z8 z8Var2 = new z8((b6) null);
            z8Var2.r(user2);
            r3Var2.f18080c.e(user2, z8Var2);
            r3Var2.h.setText(UserObject.getUserName(user2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                l00 l00Var2 = new l00();
                l00Var2.f39963f = f6.w0(null, f6.uj, false);
                l00Var2.f39964n = l.F0(starrefprogram.commission_permille);
                if (l00Var2.f39961c != null) {
                    l00Var2.f39961c = null;
                    l00Var2.a();
                }
                spannableStringBuilder2.setSpan(l00Var2, 1, 2, 33);
            }
            int i14 = starrefprogram.duration_months;
            if (i14 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i14 >= 12 && i14 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i14 / 12, new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i14, new Object[0]));
            }
            r3Var2.f18083n.setText(spannableStringBuilder2);
            ImageView imageView3 = r3Var2.f18084r;
            if (!z12) {
                i12 = 8;
            }
            imageView3.setVisibility(i12);
            r3Var2.d.setVisibility(8);
            r3Var2.f18082f.setVisibility(8);
            r3Var2.f18081e.setVisibility(8);
            r3Var2.f18085s = z10;
            r3Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new r3(context, i9, b6Var);
    }
}
