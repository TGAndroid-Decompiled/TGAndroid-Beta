package bi;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.m20;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
import org.telegram.ui.s50;
public final class vc extends x31 {
    public static final int f4925b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        String p10;
        boolean z10;
        float f10;
        int i7;
        org.telegram.ui.ActionBar.l5 l5Var;
        wc wcVar = (wc) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) y31Var.G;
        org.telegram.ui.ActionBar.l5 l5Var2 = wcVar.d;
        org.telegram.ui.Components.l9 l9Var = wcVar.f4991c;
        org.telegram.ui.ActionBar.g6 g6Var = wcVar.f4990b;
        TextView textView = wcVar.h;
        TextView textView2 = wcVar.f4993f;
        TextView textView3 = wcVar.f4992e;
        int i10 = wcVar.f4989a;
        TextView textView4 = wcVar.f4994n;
        long o4 = org.telegram.messenger.m5.o(starsSubscription.peer);
        wcVar.f4995r = !TextUtils.isEmpty(starsSubscription.title);
        if (o4 < 0) {
            TLRPC.Chat M0 = qp.s1(i10).M0(Long.valueOf(-o4));
            org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
            w8Var.q(M0);
            l9Var.e(M0, w8Var);
            if (M0 != null) {
                p10 = M0.title;
            } else {
                p10 = null;
            }
            z10 = false;
        } else {
            TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(o4));
            org.telegram.ui.Components.w8 w8Var2 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
            w8Var2.r(a22);
            l9Var.e(a22, w8Var2);
            p10 = t10.p(a22);
            z10 = !t10.t(a22);
        }
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        boolean z11 = z10;
        l5Var2.l(org.telegram.messenger.i6.m(p10, l5Var2.getPaint().getFontMetricsInt(), false, null, 0), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView3.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                s50 s50Var = new s50(14.0f, i10, textView3);
                s50Var.a(4.0f);
                s50Var.f49768f = false;
                SpannableString spannableString = new SpannableString("x");
                l5Var = l5Var2;
                spannableString.setSpan(s50Var, 0, 1, 33);
                s50Var.f49765b.q0(org.telegram.messenger.hc.p(m20.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                l5Var = l5Var2;
            }
            spannableStringBuilder.append(org.telegram.messenger.i6.m(starsSubscription.title, l5Var.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(spannableStringBuilder);
        } else {
            textView3.setVisibility(8);
        }
        if (wcVar.f4995r) {
            f10 = 13.0f;
        } else {
            f10 = 14.0f;
        }
        textView2.setTextSize(1, f10);
        int i11 = 2131744990;
        if (!starsSubscription.canceled && !starsSubscription.bot_canceled) {
            long j3 = starsSubscription.until_date;
            if (j3 < currentTime) {
                textView2.setText(org.telegram.messenger.id.a0(null, null, 2131744990, org.telegram.messenger.id.u(j3, false)));
                textView.setVisibility(8);
                org.telegram.messenger.camera.q.o(textView4, org.telegram.ui.ActionBar.l6.kk, g6Var, null, 2131744972);
            } else {
                textView2.setText(org.telegram.messenger.id.a0(null, null, 2131744977, org.telegram.messenger.id.u(j3, false)));
                textView.setVisibility(0);
                textView.setText(dd.a1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                org.telegram.ui.ActionBar.s6.U(textView4, org.telegram.ui.ActionBar.l6.f28275z6, g6Var);
                int i12 = starsSubscription.pricing.period;
                if (i12 == 2592000) {
                    textView4.setText(org.telegram.messenger.id.M0(2131745056, null));
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
            textView2.setText(org.telegram.messenger.id.a0(null, null, i11, org.telegram.messenger.id.u(j10, false)));
            textView.setVisibility(8);
            org.telegram.ui.ActionBar.s6.U(textView4, org.telegram.ui.ActionBar.l6.kk, g6Var);
            if (starsSubscription.bot_canceled) {
                if (z11) {
                    i7 = 2131744975;
                } else {
                    i7 = 2131744974;
                }
            } else {
                i7 = 2131744973;
            }
            textView4.setText(org.telegram.messenger.id.M0(i7, null));
        }
        wcVar.f4996s = z9;
        wcVar.setWillNotDraw(!z9);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        return new wc(i7, context, g6Var);
    }

    @Override
    public final boolean e(y31 y31Var, y31 y31Var2) {
        if (y31Var2 != null) {
            Object obj = y31Var.G;
            if (obj instanceof TL_stars.StarsSubscription) {
                Object obj2 = y31Var2.G;
                if (obj2 instanceof TL_stars.StarsSubscription) {
                    return TextUtils.equals(((TL_stars.StarsSubscription) obj).f27186id, ((TL_stars.StarsSubscription) obj2).f27186id);
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
