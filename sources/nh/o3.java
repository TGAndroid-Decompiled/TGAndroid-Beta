package nh;

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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.o00;

public final class o3 extends m41 {

    public static final int f18861a = 0;

    static {
        m41.setup(new o3());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        Object obj = n41Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                p3 p3Var = (p3) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = n41Var.f30850r;
                TLRPC.User user = MessagesController.getInstance(p3Var.f18874a).getUser(Long.valueOf(starrefprogram.bot_id));
                y8 y8Var = new y8((c6) null);
                y8Var.r(user);
                p3Var.f18876c.e(user, y8Var);
                p3Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    o00 o00Var = new o00();
                    o00Var.f40970f = g6.w0(null, g6.uj, false);
                    o00Var.f40971n = k.G0(starrefprogram.commission_permille);
                    if (o00Var.f40968c != null) {
                        o00Var.f40968c = null;
                        o00Var.a();
                    }
                    spannableStringBuilder.setSpan(o00Var, 1, 2, 33);
                }
                int i10 = starrefprogram.duration_months;
                if (i10 == 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
                } else if (i10 < 12 || i10 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i10, new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i10 / 12, new Object[0]));
                }
                p3Var.f18879n.setText(spannableStringBuilder);
                p3Var.f18880r.setVisibility(z11 ? 0 : 8);
                p3Var.d.setVisibility(8);
                p3Var.f18878f.setVisibility(8);
                p3Var.f18877e.setVisibility(8);
                p3Var.f18881s = z10;
                p3Var.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        p3 p3Var2 = (p3) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z12 = n41Var.f30850r;
        View view2 = p3Var2.f18877e;
        ImageView imageView = p3Var2.f18878f;
        TLRPC.User user2 = MessagesController.getInstance(p3Var2.f18874a).getUser(Long.valueOf(connectedbotstarref.bot_id));
        y8 y8Var2 = new y8((c6) null);
        y8Var2.r(user2);
        p3Var2.f18876c.e(user2, y8Var2);
        TextView textView = p3Var2.h;
        textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            o00 o00Var2 = new o00();
            o00Var2.f40970f = g6.w0(null, g6.uj, false);
            o00Var2.f40971n = k.G0(connectedbotstarref.commission_permille);
            if (o00Var2.f40968c != null) {
                o00Var2.f40968c = null;
                o00Var2.a();
            }
            spannableStringBuilder2.setSpan(o00Var2, 1, 2, 33);
        }
        int i11 = connectedbotstarref.duration_months;
        if (i11 == 0) {
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
        } else if (i11 < 12 || i11 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i11, new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i11 / 12, new Object[0]));
        }
        p3Var2.f18879n.setText(spannableStringBuilder2);
        p3Var2.f18880r.setVisibility(z12 ? 0 : 8);
        p3Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        view2.setBackground(g6.K(AndroidUtilities.dp(9.665f), g6.v0(connectedbotstarref.revoked ? g6.wj : g6.uj, p3Var2.f18875b)));
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        p3Var2.f18881s = z10;
        p3Var2.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new p3(context, i10, c6Var);
    }
}
