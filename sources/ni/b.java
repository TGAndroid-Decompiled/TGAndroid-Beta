package ni;

import ai.t2;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import di.wa;
import hi.d;
import hi.p5;
import hi.q4;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
public final class b extends ja {
    public final wa T1;
    public p41 U1;

    public b(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (e6) null, false);
        int i7;
        int i10;
        this.F1 = g0.L(30.0f);
        uj0 uj0Var = this.f35936o1;
        int i11 = this.f29717u0;
        uj0Var.setPadding(i11, 0, i11, g0.L(130.0f) + g0.f23604n);
        this.f35936o1.setClipToPadding(false);
        d dVar = new d(context, this.J0, true);
        dVar.setText(hd.M0(2131752589, null));
        dVar.e();
        dVar.f();
        dVar.setOnClickListener(new p5(this, 15));
        boolean V = t3.V(chat);
        d dVar2 = new d(context, this.J0, true);
        if (V) {
            i7 = 2131751924;
        } else {
            i7 = 2131751922;
        }
        dVar2.setText(hd.M0(i7, null));
        dVar2.f();
        dVar2.setOnClickListener(new t2(28, this, runnable));
        wa waVar = new wa(context, 3);
        TextView textView = (TextView) waVar.d;
        TextView textView2 = (TextView) waVar.f9709c;
        this.T1 = waVar;
        waVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(17.0f));
        ((i9) waVar.f9708b).f(chat, new t8(chat));
        textView2.setText(m5.m(chat));
        int i12 = j6.G6;
        q6.U(textView2, i12, this.J0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new eq(2131231942, 0), 0, 1, 33);
        if (V) {
            i10 = 2131751925;
        } else {
            i10 = 2131751923;
        }
        spannableStringBuilder.append((CharSequence) hd.M0(i10, null));
        q6.U(textView, i12, this.J0);
        textView.setText(spannableStringBuilder);
        this.f29682b.addView(dVar2, c8.ja.f(48.0f, -1, 80, g0.L(12.0f) + this.f29717u0, 0, g0.L(12.0f) + this.f29717u0, g0.L(70.0f) + g0.f23604n));
        this.f29682b.addView(dVar, c8.ja.f(48.0f, -1, 80, g0.L(12.0f) + this.f29717u0, 0, g0.L(12.0f) + this.f29717u0, g0.L(12.0f) + g0.f23604n));
        this.U1.O(false);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.f35936o1, getContext(), this.f29679a, 0, true, new q4(this, 25), this.J0);
        this.U1 = p41Var;
        p41Var.f38201r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        return null;
    }
}
