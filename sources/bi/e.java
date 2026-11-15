package bi;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.messenger.r9;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
public final class e extends ja {
    public static final int W1 = 0;
    public final List T1;
    public final r9 U1;
    public p41 V1;

    public e(Context context, org.telegram.ui.ActionBar.e6 e6Var, r9 r9Var, List list) {
        super(context, null, false, false, 2, e6Var);
        this.U1 = r9Var;
        this.T1 = list;
        this.f35938v1 = 0.2f;
        this.G1 = false;
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        this.f35932p1.setTitle(O0());
        O();
        this.f35931o1.setPadding(this.f29717u0, org.telegram.messenger.g0.L(9.0f), this.f29717u0, org.telegram.messenger.g0.L(64.0f));
        this.f35931o1.setOnItemClickListener(new a(0));
        this.f35931o1.setOverScrollMode(2);
        hi.d dVar = new hi.d(context, e6Var, true);
        dVar.setOnClickListener(new ah.d(this, 3));
        dVar.i(hd.M0(2131747831, null), false, true);
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i7 = d.leftMargin;
        int i10 = this.f29717u0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f29682b.addView(dVar, d);
        this.V1.O(false);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.f35931o1, getContext(), this.f29679a, 0, true, new b(this, 0), this.J0);
        this.V1 = p41Var;
        p41Var.f38199r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        List list = this.T1;
        if (list == null) {
            return null;
        }
        return hd.G(list.size(), "Gift2AuctionsAcquiredGifts", new Object[0]);
    }
}
