package di;

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
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.f10;
public final class d4 extends u51 {
    public static final int f6591a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        int i10;
        int i11;
        int i12;
        float f7;
        Object obj = v51Var.G;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            e4 e4Var = (e4) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = v51Var.f27835r;
            View view2 = e4Var.e;
            ImageView imageView = e4Var.f6606f;
            TLRPC.User user = MessagesController.getInstance(e4Var.f6603a).getUser(Long.valueOf(connectedbotstarref.bot_id));
            g9 g9Var = new g9((f6) null);
            g9Var.r(user);
            e4Var.f6605c.e(user, g9Var);
            TextView textView = e4Var.h;
            textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user), textView.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                f10 f10Var = new f10();
                f10Var.f32667f = j6.w0(null, j6.uj, false);
                f10Var.f32668n = m.G0(connectedbotstarref.commission_permille);
                if (f10Var.f32666c != null) {
                    f10Var.f32666c = null;
                    f10Var.a();
                }
                spannableStringBuilder.setSpan(f10Var, 1, 2, 33);
            }
            int i14 = connectedbotstarref.duration_months;
            if (i14 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i14 >= 12 && i14 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i14 / 12, new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i14, new Object[0]));
            }
            e4Var.f6607n.setText(spannableStringBuilder);
            ImageView imageView2 = e4Var.f6608r;
            if (z11) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView2.setVisibility(i10);
            e4Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int dp = AndroidUtilities.dp(9.665f);
            if (connectedbotstarref.revoked) {
                i11 = j6.wj;
            } else {
                i11 = j6.uj;
            }
            view2.setBackground(j6.K(dp, j6.v0(i11, e4Var.f6604b)));
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
            e4Var.f6609s = z10;
            e4Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            e4 e4Var2 = (e4) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = v51Var.f27835r;
            TLRPC.User user2 = MessagesController.getInstance(e4Var2.f6603a).getUser(Long.valueOf(starrefprogram.bot_id));
            g9 g9Var2 = new g9((f6) null);
            g9Var2.r(user2);
            e4Var2.f6605c.e(user2, g9Var2);
            e4Var2.h.setText(UserObject.getUserName(user2));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                f10 f10Var2 = new f10();
                f10Var2.f32667f = j6.w0(null, j6.uj, false);
                f10Var2.f32668n = m.G0(starrefprogram.commission_permille);
                if (f10Var2.f32666c != null) {
                    f10Var2.f32666c = null;
                    f10Var2.a();
                }
                spannableStringBuilder2.setSpan(f10Var2, 1, 2, 33);
            }
            int i15 = starrefprogram.duration_months;
            if (i15 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
            } else if (i15 >= 12 && i15 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i15 / 12, new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i15, new Object[0]));
            }
            e4Var2.f6607n.setText(spannableStringBuilder2);
            ImageView imageView3 = e4Var2.f6608r;
            if (!z12) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            e4Var2.d.setVisibility(8);
            e4Var2.f6606f.setVisibility(8);
            e4Var2.e.setVisibility(8);
            e4Var2.f6609s = z10;
            e4Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new e4(context, i10, f6Var);
    }
}
