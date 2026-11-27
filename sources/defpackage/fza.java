package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class fza extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        String r;
        boolean z2;
        boolean z3;
        long j;
        float f;
        int i;
        gza gzaVar = (gza) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) b8cVar.H;
        ema emaVar = gzaVar.d;
        de0 de0Var = gzaVar.c;
        vnb vnbVar = gzaVar.b;
        TextView textView = gzaVar.f;
        TextView textView2 = gzaVar.e;
        TextView textView3 = gzaVar.h;
        TextView textView4 = gzaVar.n;
        long n = wf3.n(starsSubscription.peer);
        gzaVar.r = !TextUtils.isEmpty(starsSubscription.title);
        int i2 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
        int i3 = gzaVar.a;
        if (i2 < 0) {
            TLRPC.Chat M0 = uc7.s1(i3).M0(Long.valueOf(-n));
            rb0 rb0Var = new rb0((vnb) null);
            rb0Var.p(M0);
            de0Var.f(M0, rb0Var);
            if (M0 != null) {
                r = M0.title;
            } else {
                r = null;
            }
            z2 = false;
        } else {
            TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(n));
            rb0 rb0Var2 = new rb0((vnb) null);
            rb0Var2.q(X1);
            de0Var.f(X1, rb0Var2);
            r = lbc.r(X1);
            z2 = !lbc.v(X1);
        }
        long currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
        emaVar.l(c00.f(emaVar, r, false, null, 0), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView2.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                rn5 rn5Var = new rn5(14.0f, i3, textView2);
                rn5Var.a(4.0f);
                rn5Var.f = false;
                SpannableString spannableString = new SpannableString("x");
                z3 = z2;
                j = currentTime;
                spannableString.setSpan(rn5Var, 0, 1, 33);
                rn5Var.b.d0(jn5.p(jxc.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                z3 = z2;
                j = currentTime;
            }
            spannableStringBuilder.append(c00.f(emaVar, starsSubscription.title, false, null, 0));
            textView2.setText(spannableStringBuilder);
        } else {
            z3 = z2;
            j = currentTime;
            textView2.setVisibility(8);
        }
        if (gzaVar.r) {
            f = 13.0f;
        } else {
            f = 14.0f;
        }
        textView.setTextSize(1, f);
        int i4 = 2131744647;
        if (!starsSubscription.canceled && !starsSubscription.bot_canceled) {
            long j2 = starsSubscription.until_date;
            if (j2 < j) {
                textView.setText(ob6.a0(null, null, 2131744647, ob6.u(j2, false)));
                textView3.setVisibility(8);
                ik8.x(textView4, aob.nk, vnbVar, null, 2131744629);
            } else {
                textView.setText(ob6.a0(null, null, 2131744634, ob6.u(j2, false)));
                textView3.setVisibility(0);
                textView3.setText(nza.b1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                yob.X(textView4, aob.z6, vnbVar);
                int i5 = starsSubscription.pricing.period;
                if (i5 == 2592000) {
                    textView4.setText(ob6.M0(2131744713, null));
                } else if (i5 == 60) {
                    textView4.setText("per minute");
                } else if (i5 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        } else {
            long j3 = starsSubscription.until_date;
            if (j3 >= j) {
                i4 = 2131744641;
            }
            textView.setText(ob6.a0(null, null, i4, ob6.u(j3, false)));
            textView3.setVisibility(8);
            yob.X(textView4, aob.nk, vnbVar);
            if (starsSubscription.bot_canceled) {
                if (z3) {
                    i = 2131744632;
                } else {
                    i = 2131744631;
                }
            } else {
                i = 2131744630;
            }
            textView4.setText(ob6.M0(i, null));
        }
        gzaVar.s = z;
        gzaVar.setWillNotDraw(!z);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new gza(i, vnbVar, context);
    }

    @Override
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        Object obj = b8cVar.H;
        if (obj instanceof TL_stars.StarsSubscription) {
            Object obj2 = b8cVar2.H;
            if (obj2 instanceof TL_stars.StarsSubscription) {
                return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
            }
            return false;
        }
        return false;
    }
}
