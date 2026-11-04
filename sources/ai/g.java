package ai;

import android.content.Context;
import android.widget.FrameLayout;
import b8.mf;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.m9;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
public final class g extends ma {
    public static final int T1 = 0;
    public final List Q1;
    public final m9 R1;
    public f41 S1;

    public g(Context context, org.telegram.ui.ActionBar.e6 e6Var, m9 m9Var, List list) {
        super(context, null, false, false, 2, e6Var);
        this.R1 = m9Var;
        this.Q1 = list;
        this.f36108s1 = 0.2f;
        this.D1 = false;
        this.C1 = org.telegram.messenger.g0.L(12.0f);
        this.m1.setTitle(O0());
        N();
        this.f36102l1.setPadding(this.f28618u0, org.telegram.messenger.g0.L(9.0f), this.f28618u0, org.telegram.messenger.g0.L(64.0f));
        this.f36102l1.setOnItemClickListener(new a(0));
        this.f36102l1.setOverScrollMode(2);
        gi.d dVar = new gi.d(context, e6Var, true);
        dVar.setOnClickListener(new b(this, 0));
        dVar.i(bd.M0(2131747839, null), false, true);
        FrameLayout.LayoutParams d = mf.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i3 = d.leftMargin;
        int i10 = this.f28618u0;
        d.leftMargin = i3 + i10;
        d.rightMargin += i10;
        this.f28586b.addView(dVar, d);
        this.S1.O(false);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(this.f36102l1, getContext(), this.f28583a, 0, true, new c(this, 0), this.J0);
        this.S1 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        List list = this.Q1;
        if (list == null) {
            return null;
        }
        return bd.G(list.size(), "Gift2AuctionsAcquiredGifts", new Object[0]);
    }
}
