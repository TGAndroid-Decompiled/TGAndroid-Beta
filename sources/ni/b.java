package ni;

import ai.y2;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import c8.ma;
import di.za;
import hi.d7;
import hi.e;
import hi.o4;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.sa;
public final class b extends sa {
    public final za T1;
    public c51 U1;

    public b(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (h6) null, false);
        int i7;
        int i10;
        this.F1 = g0.L(30.0f);
        ek0 ek0Var = this.f39531o1;
        int i11 = this.f30211u0;
        ek0Var.setPadding(i11, 0, i11, g0.L(130.0f) + g0.f24041n);
        this.f39531o1.setClipToPadding(false);
        e eVar = new e(context, this.J0, true);
        eVar.setText(hd.N0(2131752577, null));
        eVar.e();
        eVar.f();
        eVar.setOnClickListener(new o4(this, 16));
        boolean V = v3.V(chat);
        e eVar2 = new e(context, this.J0, true);
        if (V) {
            i7 = 2131751912;
        } else {
            i7 = 2131751910;
        }
        eVar2.setText(hd.N0(i7, null));
        eVar2.f();
        eVar2.setOnClickListener(new y2(29, this, runnable));
        za zaVar = new za(context, 3);
        TextView textView = (TextView) zaVar.d;
        TextView textView2 = (TextView) zaVar.f10206c;
        this.T1 = zaVar;
        zaVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(17.0f));
        ((q9) zaVar.f10205b).f(chat, new b9(chat));
        textView2.setText(n5.m(chat));
        int i12 = m6.G6;
        t6.U(textView2, i12, this.J0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new nq(2131231943, 0), 0, 1, 33);
        if (V) {
            i10 = 2131751913;
        } else {
            i10 = 2131751911;
        }
        spannableStringBuilder.append((CharSequence) hd.N0(i10, null));
        t6.U(textView, i12, this.J0);
        textView.setText(spannableStringBuilder);
        this.f30176b.addView(eVar2, ma.f(48.0f, -1, 80, g0.L(12.0f) + this.f30211u0, 0, g0.L(12.0f) + this.f30211u0, g0.L(70.0f) + g0.f24041n));
        this.f30176b.addView(eVar, ma.f(48.0f, -1, 80, g0.L(12.0f) + this.f30211u0, 0, g0.L(12.0f) + this.f30211u0, g0.L(12.0f) + g0.f24041n));
        this.U1.O(false);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(this.f39531o1, getContext(), this.f30173a, 0, true, new d7(this, 25), this.J0);
        this.U1 = c51Var;
        c51Var.f34062r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        return null;
    }
}
