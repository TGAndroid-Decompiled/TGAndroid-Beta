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
public final class bva extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        String r;
        boolean z2;
        boolean z3;
        long j;
        float f;
        int i;
        cva cvaVar = (cva) view;
        TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) c4cVar.H;
        jia jiaVar = cvaVar.d;
        be0 be0Var = cvaVar.c;
        wjb wjbVar = cvaVar.b;
        TextView textView = cvaVar.f;
        TextView textView2 = cvaVar.e;
        TextView textView3 = cvaVar.h;
        TextView textView4 = cvaVar.n;
        long n = cf3.n(starsSubscription.peer);
        cvaVar.r = !TextUtils.isEmpty(starsSubscription.title);
        int i2 = (n > 0L ? 1 : (n == 0L ? 0 : -1));
        int i3 = cvaVar.a;
        if (i2 < 0) {
            TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(-n));
            pb0 pb0Var = new pb0((wjb) null);
            pb0Var.p(K0);
            be0Var.f(K0, pb0Var);
            if (K0 != null) {
                r = K0.title;
            } else {
                r = null;
            }
            z2 = false;
        } else {
            TLRPC.User V1 = na7.q1(i3).V1(Long.valueOf(n));
            pb0 pb0Var2 = new pb0((wjb) null);
            pb0Var2.q(V1);
            be0Var.f(V1, pb0Var2);
            r = l7c.r(V1);
            z2 = !l7c.v(V1);
        }
        long currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
        jiaVar.l(b00.e(jiaVar, r, false, null, 0), false);
        if (!TextUtils.isEmpty(starsSubscription.title)) {
            textView2.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (starsSubscription.photo != null) {
                ol5 ol5Var = new ol5(14.0f, i3, textView2);
                ol5Var.a(4.0f);
                ol5Var.f = false;
                SpannableString spannableString = new SpannableString("x");
                z3 = z2;
                j = currentTime;
                spannableString.setSpan(ol5Var, 0, 1, 33);
                ol5Var.b.d0(gl5.p(usc.c(starsSubscription.photo)), "14_14", null, null, 0, 0);
                spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
            } else {
                z3 = z2;
                j = currentTime;
            }
            spannableStringBuilder.append(b00.e(jiaVar, starsSubscription.title, false, null, 0));
            textView2.setText(spannableStringBuilder);
        } else {
            z3 = z2;
            j = currentTime;
            textView2.setVisibility(8);
        }
        if (cvaVar.r) {
            f = 13.0f;
        } else {
            f = 14.0f;
        }
        textView.setTextSize(1, f);
        int i4 = 2131744753;
        if (!starsSubscription.canceled && !starsSubscription.bot_canceled) {
            long j2 = starsSubscription.until_date;
            if (j2 < j) {
                textView.setText(k96.a0(null, null, 2131744753, k96.u(j2, false)));
                textView3.setVisibility(8);
                ug8.x(textView4, bkb.mk, wjbVar, null, 2131744735);
            } else {
                textView.setText(k96.a0(null, null, 2131744740, k96.u(j2, false)));
                textView3.setVisibility(0);
                textView3.setText(jva.a1(false, "⭐️ " + Long.toString(starsSubscription.pricing.amount), 0.8f, null));
                zkb.X(textView4, bkb.y6, wjbVar);
                int i5 = starsSubscription.pricing.period;
                if (i5 == 2592000) {
                    textView4.setText(k96.M0(2131744819, null));
                } else if (i5 == 60) {
                    textView4.setText("per minute");
                } else if (i5 == 300) {
                    textView4.setText("per 5 minutes");
                }
            }
        } else {
            long j3 = starsSubscription.until_date;
            if (j3 >= j) {
                i4 = 2131744747;
            }
            textView.setText(k96.a0(null, null, i4, k96.u(j3, false)));
            textView3.setVisibility(8);
            zkb.X(textView4, bkb.mk, wjbVar);
            if (starsSubscription.bot_canceled) {
                if (z3) {
                    i = 2131744738;
                } else {
                    i = 2131744737;
                }
            } else {
                i = 2131744736;
            }
            textView4.setText(k96.M0(i, null));
        }
        cvaVar.s = z;
        cvaVar.setWillNotDraw(!z);
    }

    @Override
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new cva(i, wjbVar, context);
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        Object obj = c4cVar.H;
        if (obj instanceof TL_stars.StarsSubscription) {
            Object obj2 = c4cVar2.H;
            if (obj2 instanceof TL_stars.StarsSubscription) {
                return TextUtils.equals(((TL_stars.StarsSubscription) obj).id, ((TL_stars.StarsSubscription) obj2).id);
            }
            return false;
        }
        return false;
    }
}
