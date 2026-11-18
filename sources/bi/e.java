package bi;

import android.content.Context;
import android.widget.FrameLayout;
import c8.ma;
import java.util.List;
import org.telegram.messenger.gd;
import org.telegram.messenger.q9;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
public final class e extends sa {
    public static final int W1 = 0;
    public final List T1;
    public final q9 U1;
    public z41 V1;

    public e(Context context, org.telegram.ui.ActionBar.i6 i6Var, q9 q9Var, List list) {
        super(context, null, false, false, 2, i6Var);
        this.U1 = q9Var;
        this.T1 = list;
        this.f39541v1 = 0.2f;
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.f39535p1.setTitle(P0());
        O();
        this.f39534o1.setPadding(this.f30227u0, org.telegram.messenger.g0.L(9.0f), this.f30227u0, org.telegram.messenger.g0.L(64.0f));
        this.f39534o1.setOnItemClickListener(new a(0));
        this.f39534o1.setOverScrollMode(2);
        hi.d dVar = new hi.d(context, i6Var, true);
        dVar.setOnClickListener(new ah.d(this, 3));
        dVar.i(gd.M0(2131747638, null), false, true);
        FrameLayout.LayoutParams d = ma.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i7 = d.leftMargin;
        int i10 = this.f30227u0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f30192b.addView(dVar, d);
        this.V1.O(false);
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.f39534o1, getContext(), this.f30189a, 0, true, new b(this, 0), this.J0);
        this.V1 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
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
