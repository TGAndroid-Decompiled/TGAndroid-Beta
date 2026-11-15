package di;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k20;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.p50;
public final class db extends a41 {
    public static final int f8421b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        String p10;
        boolean z11;
        float f10;
        int i7;
        org.telegram.ui.ActionBar.j5 j5Var;
        eb ebVar = (eb) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) b41Var.G;
        org.telegram.ui.ActionBar.j5 j5Var2 = ebVar.d;
        org.telegram.ui.Components.i9 i9Var = ebVar.f8515c;
        org.telegram.ui.ActionBar.e6 e6Var = ebVar.f8514b;
        TextView textView = ebVar.h;
        TextView textView2 = ebVar.f8517f;
        TextView textView3 = ebVar.f8516e;
        int i10 = ebVar.f8513a;
        TextView textView4 = ebVar.f8518n;
        long o4 = org.telegram.messenger.m5.o(starsSubscription.peer);
        ebVar.f8519r = !TextUtils.isEmpty(starsSubscription.title);
        if (o4 < 0) {
            TLRPC.Chat M0 = np.s1(i10).M0(Long.valueOf(-o4));
            org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
            t8Var.q(M0);
            i9Var.f(M0, t8Var);
            if (M0 != null) {
                p10 = M0.title;
            } else {
                p10 = null;
            }
            z11 = false;
        } else {
            TLRPC.User a22 = np.s1(i10).a2(Long.valueOf(o4));
            org.telegram.ui.Components.t8 t8Var2 = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
            t8Var2.r(a22);
            i9Var.f(a22, t8Var2);
            p10 = q10.p(a22);
            z11 = !q10.t(a22);
        }
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        boolean z12 = z11;
        j5Var2.l(org.telegram.messenger.j6.m(p10, j5Var2.getPaint().getFontMetricsInt(), false, null, 0), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                p50 p50Var = new p50(14.0f, i10, textView3);
                p50Var.a(4.0f);
                p50Var.f50135f = false;
                SpannableString spannableString = new SpannableString("x");
                j5Var = j5Var2;
                spannableString.setSpan(p50Var, 0, 1, 33);
                p50Var.f50132b.q0(org.telegram.messenger.gc.p(k20.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                j5Var = j5Var2;
            }
            spannableStringBuilder.append(org.telegram.messenger.j6.m(starsSubscription.title, j5Var.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(spannableStringBuilder);
        } else {
            textView3.setVisibility(8);
        }
        if (ebVar.f8519r) {
            f10 = 13.0f;
        } else {
            f10 = 14.0f;
        }
        textView2.setTextSize(1, f10);
        int i11 = 2131744990;
        if (!starsSubscription.canceled && !starsSubscription.bot_canceled) {
            long j3 = starsSubscription.until_date;
            if (j3 < currentTime) {
                textView2.setText(hd.a0(null, null, 2131744990, hd.u(j3, false)));
                textView.setVisibility(8);
                i20.q(textView4, org.telegram.ui.ActionBar.j6.nk, e6Var, null, 2131744972);
            } else {
                textView2.setText(hd.a0(null, null, 2131744977, hd.u(j3, false)));
                textView.setVisibility(0);
                textView.setText(lb.a1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.q6.U(textView4, org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
                int i12 = starsSubscription.pricing.period;
                if (i12 == 2592000) {
                    textView4.setText(hd.M0(2131745056, null));
                } else if (i12 == 60) {
                    textView4.setText("per minute");
                } else if (i12 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        } else {
            long j10 = starsSubscription.until_date;
            if (j10 >= currentTime) {
                i11 = 2131744984;
            }
            textView2.setText(hd.a0(null, null, i11, hd.u(j10, false)));
            textView.setVisibility(8);
            org.telegram.ui.ActionBar.q6.U(textView4, org.telegram.ui.ActionBar.j6.nk, e6Var);
            if (starsSubscription.bot_canceled) {
                if (z12) {
                    i7 = 2131744975;
                } else {
                    i7 = 2131744974;
                }
            } else {
                i7 = 2131744973;
            }
            textView4.setText(hd.M0(i7, null));
        }
        ebVar.f8520s = z10;
        ebVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new eb(i7, context, e6Var);
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        if (b41Var2 != null) {
            Object obj = b41Var.G;
            if (obj instanceof TL_stars.StarsSubscription) {
                Object obj2 = b41Var2.G;
                if (obj2 instanceof TL_stars.StarsSubscription) {
                    return TextUtils.equals(((TL_stars.StarsSubscription) obj).f28281id, ((TL_stars.StarsSubscription) obj2).f28281id);
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
