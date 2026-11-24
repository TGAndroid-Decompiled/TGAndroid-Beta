package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class fn2 extends fy0 {
    public final zf2 S1;
    public l5c T1;

    public fn2(Context context, TLRPC.Chat chat, Runnable runnable) {
        super((wjb) null, context, false);
        int i;
        int i2;
        this.E1 = gl.L(30.0f);
        o39 o39Var = this.n1;
        int i3 = this.u0;
        o39Var.setPadding(i3, 0, i3, gl.L(130.0f) + gl.n);
        this.n1.setClipToPadding(false);
        u41 u41Var = new u41(this.J0, context, true);
        u41Var.setText(k96.M0(2131752577, null));
        u41Var.e();
        u41Var.f();
        u41Var.setOnClickListener(new x91(this, (byte) 16));
        boolean V = hc2.V(chat);
        u41 u41Var2 = new u41(this.J0, context, true);
        if (V) {
            i = 2131751912;
        } else {
            i = 2131751910;
        }
        u41Var2.setText(k96.M0(i, null));
        u41Var2.f();
        u41Var2.setOnClickListener(new kb1(this, runnable, (byte) 21));
        zf2 zf2Var = new zf2(context, (byte) 3);
        TextView textView = (TextView) zf2Var.d;
        TextView textView2 = (TextView) zf2Var.c;
        this.S1 = zf2Var;
        zf2Var.setPadding(gl.L(20.0f), 0, gl.L(20.0f), gl.L(17.0f));
        ((be0) zf2Var.b).f(chat, new pb0(chat));
        textView2.setText(cf3.l(chat));
        int i4 = bkb.F6;
        zkb.X(textView2, i4, this.J0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new cm2(2131231946, 0), 0, 1, 33);
        if (V) {
            i2 = 2131751913;
        } else {
            i2 = 2131751911;
        }
        spannableStringBuilder.append((CharSequence) k96.M0(i2, null));
        zkb.X(textView, i4, this.J0);
        textView.setText(spannableStringBuilder);
        this.b.addView(u41Var2, nme.f(48.0f, -1, 80, gl.L(12.0f) + this.u0, 0, gl.L(12.0f) + this.u0, gl.L(70.0f) + gl.n));
        this.b.addView(u41Var, nme.f(48.0f, -1, 80, gl.L(12.0f) + this.u0, 0, gl.L(12.0f) + this.u0, gl.L(12.0f) + gl.n));
        this.T1.O(false);
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.a, 0, true, new w72(this, (byte) 8), this.J0);
        this.T1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        return null;
    }
}
