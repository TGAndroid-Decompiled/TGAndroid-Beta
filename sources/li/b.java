package li;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import b8.mf;
import ci.gb;
import gi.d;
import gi.q4;
import ii.m;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wp;
public final class b extends ma {
    public final gb Q1;
    public f41 R1;

    public b(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, (e6) null, false);
        int i3;
        int i10;
        this.C1 = g0.L(30.0f);
        tj0 tj0Var = this.f36102l1;
        int i11 = this.f28618u0;
        tj0Var.setPadding(i11, 0, i11, g0.L(130.0f) + g0.f22603n);
        this.f36102l1.setClipToPadding(false);
        d dVar = new d(context, this.J0, true);
        dVar.setText(bd.M0(2131752589, null));
        dVar.e();
        dVar.f();
        dVar.setOnClickListener(new m(this, 12));
        boolean V = t3.V(chat);
        d dVar2 = new d(context, this.J0, true);
        if (V) {
            i3 = 2131751924;
        } else {
            i3 = 2131751922;
        }
        dVar2.setText(bd.M0(i3, null));
        dVar2.f();
        dVar2.setOnClickListener(new ai.d(27, this, runnable));
        gb gbVar = new gb(context, 3);
        TextView textView = (TextView) gbVar.d;
        TextView textView2 = (TextView) gbVar.f5199c;
        this.Q1 = gbVar;
        gbVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(17.0f));
        ((k9) gbVar.f5198b).e(chat, new u8(chat));
        textView2.setText(m5.m(chat));
        int i12 = k6.G6;
        r6.V(textView2, i12, this.J0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new wp(2131231942, 0), 0, 1, 33);
        if (V) {
            i10 = 2131751925;
        } else {
            i10 = 2131751923;
        }
        spannableStringBuilder.append((CharSequence) bd.M0(i10, null));
        r6.V(textView, i12, this.J0);
        textView.setText(spannableStringBuilder);
        this.f28586b.addView(dVar2, mf.f(48.0f, -1, 80, g0.L(12.0f) + this.f28618u0, 0, g0.L(12.0f) + this.f28618u0, g0.L(70.0f) + g0.f22603n));
        this.f28586b.addView(dVar, mf.f(48.0f, -1, 80, g0.L(12.0f) + this.f28618u0, 0, g0.L(12.0f) + this.f28618u0, g0.L(12.0f) + g0.f22603n));
        this.R1.O(false);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.f36102l1, getContext(), this.f28583a, 0, true, new q4(this, 25), this.J0);
        this.R1 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return null;
    }
}
