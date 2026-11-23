package bi;

import android.content.Context;
import android.widget.FrameLayout;
import c8.na;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.messenger.r9;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.sa;
public final class e extends sa {
    public static final int W1 = 0;
    public final List T1;
    public final r9 U1;
    public c51 V1;

    public e(Context context, org.telegram.ui.ActionBar.h6 h6Var, r9 r9Var, List list) {
        super(context, null, false, false, 2, h6Var);
        this.U1 = r9Var;
        this.T1 = list;
        this.f39494v1 = 0.2f;
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.f39488p1.setTitle(P0());
        O();
        this.f39487o1.setPadding(this.f30177u0, org.telegram.messenger.g0.L(9.0f), this.f30177u0, org.telegram.messenger.g0.L(64.0f));
        this.f39487o1.setOnItemClickListener(new a(0));
        this.f39487o1.setOverScrollMode(2);
        hi.d dVar = new hi.d(context, h6Var, true);
        dVar.setOnClickListener(new ah.d(this, 3));
        dVar.i(hd.N0(2131747637, null), false, true);
        FrameLayout.LayoutParams d = na.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i7 = d.leftMargin;
        int i10 = this.f30177u0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f30142b.addView(dVar, d);
        this.V1.O(false);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(this.f39487o1, getContext(), this.f30139a, 0, true, new b(this, 0), this.J0);
        this.V1 = c51Var;
        c51Var.f34026r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        List list = this.T1;
        if (list == null) {
            return null;
        }
        return hd.G(list.size(), "Gift2AuctionsAcquiredGifts", new Object[0]);
    }
}
