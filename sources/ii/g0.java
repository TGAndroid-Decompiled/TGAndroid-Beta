package ii;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.d3;
import bi.ea;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
public final class g0 implements v10 {
    public final int f15538a;
    public final long f15539b;
    public final Object f15540c;

    public g0(Object obj, long j3, int i7) {
        this.f15538a = i7;
        this.f15540c = obj;
        this.f15539b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z9;
        int i7;
        int i10 = this.f15538a;
        long j3 = this.f15539b;
        Object obj3 = this.f15540c;
        switch (i10) {
            case 0:
                f2 f2Var = (f2) obj3;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        m0.d(f2Var, -j3, 2);
                        return;
                    } else {
                        hc.a0(f2Var).f0(tL_error, false);
                        return;
                    }
                }
                m0.d(f2Var, -j3, 1);
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l10 = (Long) obj2;
                String str = LaunchActivity.B1;
                if ("paid".equals((String) obj) && l10.longValue() != 0) {
                    org.telegram.messenger.g0.h3(new d3(launchActivity, l10, this.f15539b, 28));
                    return;
                }
                return;
            default:
                zh.l lVar = (zh.l) obj3;
                Boolean bool2 = (Boolean) obj;
                String str2 = (String) obj2;
                FrameLayout frameLayout = lVar.f60423c2;
                lVar.S1.setLoading(false);
                lVar.f60437r2 = false;
                if (bool2 != null) {
                    if (j3 > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    yb ybVar = new yb(lVar.getContext(), lVar.I0);
                    ybVar.f40639a.setImageResource(2131231117);
                    if (z9) {
                        i7 = 2131750308;
                    } else {
                        i7 = 2131750307;
                    }
                    String M0 = id.M0(i7, null);
                    TextView textView = ybVar.f40640b;
                    textView.setText(M0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    String a02 = id.a0(null, null, 2131750343, Integer.valueOf(lVar.d2.d.gifts_per_round));
                    TextView textView2 = ybVar.f40641c;
                    textView2.setText(a02);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    lVar.h1();
                    cc.f(frameLayout, ybVar, 2750).j();
                    ea.y(lVar.f28616a, false).q(null, false, true);
                }
                if (str2 != null) {
                    lVar.h1();
                    new hc(frameLayout, lVar.I0).Q(2131624011, 36, id.a0(null, null, 2131743881, str2)).j();
                    return;
                }
                return;
        }
    }
}
