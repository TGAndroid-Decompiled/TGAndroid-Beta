package bi;

import android.content.Context;
import android.widget.FrameLayout;
import c8.na;
import java.util.List;
import org.telegram.messenger.gd;
import org.telegram.messenger.q9;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ra;
public final class e extends ra {
    public static final int W1 = 0;
    public final List T1;
    public final q9 U1;
    public b51 V1;

    public e(Context context, org.telegram.ui.ActionBar.i6 i6Var, q9 q9Var, List list) {
        super(context, null, false, false, 2, i6Var);
        this.U1 = q9Var;
        this.T1 = list;
        this.f39253v1 = 0.2f;
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.f39247p1.setTitle(P0());
        O();
        this.f39246o1.setPadding(this.f30261u0, org.telegram.messenger.g0.L(9.0f), this.f30261u0, org.telegram.messenger.g0.L(64.0f));
        this.f39246o1.setOnItemClickListener(new a(0));
        this.f39246o1.setOverScrollMode(2);
        hi.e eVar = new hi.e(context, i6Var, true);
        eVar.setOnClickListener(new ah.d(this, 3));
        eVar.i(gd.N0(2131747637, null), false, true);
        FrameLayout.LayoutParams d = na.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i7 = d.leftMargin;
        int i10 = this.f30261u0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f30226b.addView(eVar, d);
        this.V1.O(false);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(this.f39246o1, getContext(), this.f30223a, 0, true, new b(this, 0), this.J0);
        this.V1 = b51Var;
        b51Var.f33631r = false;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        List list = this.T1;
        if (list == null) {
            return null;
        }
        return gd.G(list.size(), "Gift2AuctionsAcquiredGifts", new Object[0]);
    }
}
