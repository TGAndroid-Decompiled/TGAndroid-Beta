package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class qo2 extends mz0 {
    public final nh2 S1;
    public l7c T1;

    public qo2(Context context, TLRPC.Chat chat, Runnable runnable) {
        super((ylb) null, context, false);
        int i;
        int i2;
        this.E1 = gm.L(30.0f);
        r59 r59Var = this.n1;
        int i3 = this.u0;
        r59Var.setPadding(i3, 0, i3, gm.L(130.0f) + gm.n);
        this.n1.setClipToPadding(false);
        b61 b61Var = new b61(this.J0, context, true);
        b61Var.setText(jb6.M0(2131752542, null));
        b61Var.e();
        b61Var.f();
        b61Var.setOnClickListener(new k81(this, (byte) 19));
        boolean V = sd2.V(chat);
        b61 b61Var2 = new b61(this.J0, context, true);
        if (V) {
            i = 2131751861;
        } else {
            i = 2131751859;
        }
        b61Var2.setText(jb6.M0(i, null));
        b61Var2.f();
        b61Var2.setOnClickListener(new rc1(this, runnable, (byte) 22));
        nh2 nh2Var = new nh2(context, (byte) 3);
        TextView textView = (TextView) nh2Var.d;
        TextView textView2 = (TextView) nh2Var.c;
        this.S1 = nh2Var;
        nh2Var.setPadding(gm.L(20.0f), 0, gm.L(20.0f), gm.L(17.0f));
        ((bf0) nh2Var.b).f(chat, new pc0(chat));
        textView2.setText(pg3.l(chat));
        int i4 = cmb.F6;
        anb.X(textView2, i4, this.J0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new pn2(2131231947, 0), 0, 1, 33);
        if (V) {
            i2 = 2131751862;
        } else {
            i2 = 2131751860;
        }
        spannableStringBuilder.append((CharSequence) jb6.M0(i2, null));
        anb.X(textView, i4, this.J0);
        textView.setText(spannableStringBuilder);
        this.b.addView(b61Var2, qoe.f(48.0f, -1, 80, gm.L(12.0f) + this.u0, 0, gm.L(12.0f) + this.u0, gm.L(70.0f) + gm.n));
        this.b.addView(b61Var, qoe.f(48.0f, -1, 80, gm.L(12.0f) + this.u0, 0, gm.L(12.0f) + this.u0, gm.L(12.0f) + gm.n));
        this.T1.O(false);
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.a, 0, true, new h92(this, (byte) 8), this.J0);
        this.T1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return null;
    }
}
