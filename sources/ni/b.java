package ni;

import ai.p2;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import c8.na;
import di.za;
import hi.e;
import hi.y7;
import hi.z4;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.ra;
public final class b extends ra {
    public final za T1;
    public b51 U1;

    public b(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (i6) null, false);
        int i7;
        int i10;
        this.F1 = g0.L(30.0f);
        ek0 ek0Var = this.f39246o1;
        int i11 = this.f30261u0;
        ek0Var.setPadding(i11, 0, i11, g0.L(130.0f) + g0.f24221n);
        this.f39246o1.setClipToPadding(false);
        e eVar = new e(context, this.J0, true);
        eVar.setText(gd.N0(2131752577, null));
        eVar.e();
        eVar.f();
        eVar.setOnClickListener(new z4(this, 16));
        boolean V = v3.V(chat);
        e eVar2 = new e(context, this.J0, true);
        if (V) {
            i7 = 2131751912;
        } else {
            i7 = 2131751910;
        }
        eVar2.setText(gd.N0(i7, null));
        eVar2.f();
        eVar2.setOnClickListener(new p2(29, this, runnable));
        za zaVar = new za(context, 3);
        TextView textView = (TextView) zaVar.d;
        TextView textView2 = (TextView) zaVar.f10167c;
        this.T1 = zaVar;
        zaVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(17.0f));
        ((p9) zaVar.f10166b).f(chat, new a9(chat));
        textView2.setText(n5.m(chat));
        int i12 = n6.G6;
        u6.U(textView2, i12, this.J0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new kq(2131231946, 0), 0, 1, 33);
        if (V) {
            i10 = 2131751913;
        } else {
            i10 = 2131751911;
        }
        spannableStringBuilder.append((CharSequence) gd.N0(i10, null));
        u6.U(textView, i12, this.J0);
        textView.setText(spannableStringBuilder);
        this.f30226b.addView(eVar2, na.f(48.0f, -1, 80, g0.L(12.0f) + this.f30261u0, 0, g0.L(12.0f) + this.f30261u0, g0.L(70.0f) + g0.f24221n));
        this.f30226b.addView(eVar, na.f(48.0f, -1, 80, g0.L(12.0f) + this.f30261u0, 0, g0.L(12.0f) + this.f30261u0, g0.L(12.0f) + g0.f24221n));
        this.U1.O(false);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(this.f39246o1, getContext(), this.f30223a, 0, true, new y7(this, 25), this.J0);
        this.U1 = b51Var;
        b51Var.f33631r = false;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        return null;
    }
}
