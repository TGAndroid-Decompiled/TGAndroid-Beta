package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import bi.nc;
import bi.r;
import c8.ha;
import fi.d;
import hi.u1;
import ii.g;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wp;
public final class b extends na {
    public final nc P1;
    public l41 Q1;

    public b(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (f6) null, false);
        int i7;
        int i10;
        this.B1 = g0.L(30.0f);
        pj0 pj0Var = this.f36277k1;
        int i11 = this.f28649t0;
        pj0Var.setPadding(i11, 0, i11, g0.L(130.0f) + g0.f22558n);
        this.f36277k1.setClipToPadding(false);
        d dVar = new d(context, this.I0, true);
        dVar.setText(id.M0(2131752589, null));
        dVar.e();
        dVar.f();
        dVar.setOnClickListener(new g(this, 9));
        boolean V = t3.V(chat);
        d dVar2 = new d(context, this.I0, true);
        if (V) {
            i7 = 2131751924;
        } else {
            i7 = 2131751922;
        }
        dVar2.setText(id.M0(i7, null));
        dVar2.f();
        dVar2.setOnClickListener(new r(21, this, runnable));
        nc ncVar = new nc(context, 3);
        TextView textView = (TextView) ncVar.d;
        TextView textView2 = (TextView) ncVar.f4436c;
        this.P1 = ncVar;
        ncVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(17.0f));
        ((l9) ncVar.f4435b).e(chat, new w8(chat));
        textView2.setText(m5.m(chat));
        int i12 = k6.G6;
        r6.V(textView2, i12, this.I0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new wp(2131231942, 0), 0, 1, 33);
        if (V) {
            i10 = 2131751925;
        } else {
            i10 = 2131751923;
        }
        spannableStringBuilder.append((CharSequence) id.M0(i10, null));
        r6.V(textView, i12, this.I0);
        textView.setText(spannableStringBuilder);
        this.f28619b.addView(dVar2, ha.f(48.0f, -1, 80, g0.L(12.0f) + this.f28649t0, 0, g0.L(12.0f) + this.f28649t0, g0.L(70.0f) + g0.f22558n));
        this.f28619b.addView(dVar, ha.f(48.0f, -1, 80, g0.L(12.0f) + this.f28649t0, 0, g0.L(12.0f) + this.f28649t0, g0.L(12.0f) + g0.f22558n));
        this.Q1.O(false);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(this.f36277k1, getContext(), this.f28616a, 0, true, new u1(this, 15), this.I0);
        this.Q1 = l41Var;
        l41Var.f35528r = false;
        return l41Var;
    }

    @Override
    public final CharSequence O0() {
        return null;
    }
}
