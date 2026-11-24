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
public final class fxa extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        String r;
        boolean z2;
        boolean z3;
        long j;
        float f;
        int i;
        gxa gxaVar = (gxa) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) c6cVar.H;
        lka lkaVar = gxaVar.d;
        bf0 bf0Var = gxaVar.c;
        ylb ylbVar = gxaVar.b;
        TextView textView = gxaVar.f;
        TextView textView2 = gxaVar.e;
        TextView textView3 = gxaVar.h;
        TextView textView4 = gxaVar.n;
        long n = pg3.n(starsSubscription.peer);
        gxaVar.r = !TextUtils.isEmpty(starsSubscription.title);
        int i2 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
        int i3 = gxaVar.a;
        if (i2 < 0) {
            TLRPC.Chat L0 = oc7.r1(i3).L0(Long.valueOf(-n));
            pc0 pc0Var = new pc0((ylb) null);
            pc0Var.p(L0);
            bf0Var.f(L0, pc0Var);
            if (L0 != null) {
                r = L0.title;
            } else {
                r = null;
            }
            z2 = false;
        } else {
            TLRPC.User W1 = oc7.r1(i3).W1(Long.valueOf(n));
            pc0 pc0Var2 = new pc0((ylb) null);
            pc0Var2.q(W1);
            bf0Var.f(W1, pc0Var2);
            r = m9c.r(W1);
            z2 = !m9c.v(W1);
        }
        long currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
        lkaVar.l(b10.e(lkaVar, r, false, null, 0), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView2.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                on5 on5Var = new on5(14.0f, i3, textView2);
                on5Var.a(4.0f);
                on5Var.f = false;
                SpannableString spannableString = new SpannableString("x");
                z3 = z2;
                j = currentTime;
                spannableString.setSpan(on5Var, 0, 1, 33);
                on5Var.b.d0(gn5.p(vuc.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                z3 = z2;
                j = currentTime;
            }
            spannableStringBuilder.append(b10.e(lkaVar, starsSubscription.title, false, null, 0));
            textView2.setText(spannableStringBuilder);
        } else {
            z3 = z2;
            j = currentTime;
            textView2.setVisibility(8);
        }
        if (gxaVar.r) {
            f = 13.0f;
        } else {
            f = 14.0f;
        }
        textView.setTextSize(1, f);
        int i4 = 2131744679;
        if (!starsSubscription.canceled && !starsSubscription.bot_canceled) {
            long j2 = starsSubscription.until_date;
            if (j2 < j) {
                textView.setText(jb6.a0(null, null, 2131744679, jb6.u(j2, false)));
                textView3.setVisibility(8);
                wi8.x(textView4, cmb.mk, ylbVar, null, 2131744661);
            } else {
                textView.setText(jb6.a0(null, null, 2131744666, jb6.u(j2, false)));
                textView3.setVisibility(0);
                textView3.setText(nxa.b1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                anb.X(textView4, cmb.y6, ylbVar);
                int i5 = starsSubscription.pricing.period;
                if (i5 == 2592000) {
                    textView4.setText(jb6.M0(2131744745, null));
                } else if (i5 == 60) {
                    textView4.setText("per minute");
                } else if (i5 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        } else {
            long j3 = starsSubscription.until_date;
            if (j3 >= j) {
                i4 = 2131744673;
            }
            textView.setText(jb6.a0(null, null, i4, jb6.u(j3, false)));
            textView3.setVisibility(8);
            anb.X(textView4, cmb.mk, ylbVar);
            if (starsSubscription.bot_canceled) {
                if (z3) {
                    i = 2131744664;
                } else {
                    i = 2131744663;
                }
            } else {
                i = 2131744662;
            }
            textView4.setText(jb6.M0(i, null));
        }
        gxaVar.s = z;
        gxaVar.setWillNotDraw(!z);
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new gxa(i, ylbVar, context);
    }

    @Override
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        Object obj = c6cVar.H;
        if (obj instanceof TL_stars.StarsSubscription) {
            Object obj2 = c6cVar2.H;
            if (obj2 instanceof TL_stars.StarsSubscription) {
                return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
            }
            return false;
        }
        return false;
    }
}
