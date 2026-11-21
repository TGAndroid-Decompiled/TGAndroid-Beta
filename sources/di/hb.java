package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.h20;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.r50;
public final class hb extends n41 {
    public static final int f9015b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        String q10;
        boolean z11;
        float f10;
        int i7;
        org.telegram.ui.ActionBar.m5 m5Var;
        ib ibVar = (ib) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) o41Var.H;
        org.telegram.ui.ActionBar.m5 m5Var2 = ibVar.d;
        org.telegram.ui.Components.q9 q9Var = ibVar.f9069c;
        org.telegram.ui.ActionBar.h6 h6Var = ibVar.f9068b;
        TextView textView = ibVar.h;
        TextView textView2 = ibVar.f9071f;
        TextView textView3 = ibVar.f9070e;
        int i10 = ibVar.f9067a;
        TextView textView4 = ibVar.f9072n;
        long o4 = org.telegram.messenger.n5.o(starsSubscription.peer);
        ibVar.f9073r = !TextUtils.isEmpty(starsSubscription.title);
        if (o4 < 0) {
            TLRPC.Chat O0 = mp.u1(i10).O0(Long.valueOf(-o4));
            org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
            b9Var.q(O0);
            q9Var.f(O0, b9Var);
            if (O0 != null) {
                q10 = O0.title;
            } else {
                q10 = null;
            }
            z11 = false;
        } else {
            TLRPC.User c22 = mp.u1(i10).c2(Long.valueOf(o4));
            org.telegram.ui.Components.b9 b9Var2 = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
            b9Var2.r(c22);
            q9Var.f(c22, b9Var2);
            q10 = o10.q(c22);
            z11 = !o10.u(c22);
        }
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        boolean z12 = z11;
        m5Var2.l(org.telegram.messenger.j6.m(q10, m5Var2.getPaint().getFontMetricsInt(), false, null, 0), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                r50 r50Var = new r50(14.0f, i10, textView3);
                r50Var.a(4.0f);
                r50Var.f51451f = false;
                SpannableString spannableString = new SpannableString("x");
                m5Var = m5Var2;
                spannableString.setSpan(r50Var, 0, 1, 33);
                r50Var.f51448b.q0(org.telegram.messenger.fc.p(h20.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                m5Var = m5Var2;
            }
            spannableStringBuilder.append(org.telegram.messenger.j6.m(starsSubscription.title, m5Var.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(spannableStringBuilder);
        } else {
            textView3.setVisibility(8);
        }
        if (ibVar.f9073r) {
            f10 = 13.0f;
        } else {
            f10 = 14.0f;
        }
        textView2.setTextSize(1, f10);
        int i11 = 2131744749;
        if (!starsSubscription.canceled && !starsSubscription.bot_canceled) {
            long j3 = starsSubscription.until_date;
            if (j3 < currentTime) {
                textView2.setText(gd.a0(null, null, 2131744749, gd.u(j3, false)));
                textView.setVisibility(8);
                n10.r(textView4, org.telegram.ui.ActionBar.m6.nk, h6Var, null, 2131744731);
            } else {
                textView2.setText(gd.a0(null, null, 2131744736, gd.u(j3, false)));
                textView.setVisibility(0);
                textView.setText(pb.b1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.t6.U(textView4, org.telegram.ui.ActionBar.m6.f29789z6, h6Var);
                int i12 = starsSubscription.pricing.period;
                if (i12 == 2592000) {
                    textView4.setText(gd.N0(2131744815, null));
                } else if (i12 == 60) {
                    textView4.setText("per minute");
                } else if (i12 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        } else {
            long j10 = starsSubscription.until_date;
            if (j10 >= currentTime) {
                i11 = 2131744743;
            }
            textView2.setText(gd.a0(null, null, i11, gd.u(j10, false)));
            textView.setVisibility(8);
            org.telegram.ui.ActionBar.t6.U(textView4, org.telegram.ui.ActionBar.m6.nk, h6Var);
            if (starsSubscription.bot_canceled) {
                if (z12) {
                    i7 = 2131744734;
                } else {
                    i7 = 2131744733;
                }
            } else {
                i7 = 2131744732;
            }
            textView4.setText(gd.N0(i7, null));
        }
        ibVar.f9074s = z10;
        ibVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new ib(i7, context, h6Var);
    }

    @Override
    public final boolean e(o41 o41Var, o41 o41Var2) {
        if (o41Var2 != null) {
            Object obj = o41Var.H;
            if (obj instanceof TL_stars.StarsSubscription) {
                Object obj2 = o41Var2.H;
                if (obj2 instanceof TL_stars.StarsSubscription) {
                    return TextUtils.equals(((TL_stars.StarsSubscription) obj).f28661id, ((TL_stars.StarsSubscription) obj2).f28661id);
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
