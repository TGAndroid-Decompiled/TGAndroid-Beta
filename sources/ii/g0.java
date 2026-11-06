package ii;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.d3;
import bi.ea;
import org.telegram.messenger.hd;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
public final class g0 implements v10 {
    public final int f15535a;
    public final long f15536b;
    public final Object f15537c;

    public g0(Object obj, long j3, int i7) {
        this.f15535a = i7;
        this.f15537c = obj;
        this.f15536b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z9;
        int i7;
        int i10 = this.f15535a;
        long j3 = this.f15536b;
        Object obj3 = this.f15537c;
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
                    org.telegram.messenger.g0.h3(new d3(launchActivity, l10, this.f15536b, 28));
                    return;
                }
                return;
            default:
                zh.m mVar = (zh.m) obj3;
                Boolean bool2 = (Boolean) obj;
                String str2 = (String) obj2;
                FrameLayout frameLayout = mVar.f60344c2;
                mVar.S1.setLoading(false);
                mVar.f60358r2 = false;
                if (bool2 != null) {
                    if (j3 > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    yb ybVar = new yb(mVar.getContext(), mVar.I0);
                    ybVar.f40613a.setImageResource(2131231117);
                    if (z9) {
                        i7 = 2131750306;
                    } else {
                        i7 = 2131750305;
                    }
                    String M0 = hd.M0(i7, null);
                    TextView textView = ybVar.f40614b;
                    textView.setText(M0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    String a02 = hd.a0(null, null, 2131750341, Integer.valueOf(mVar.d2.d.gifts_per_round));
                    TextView textView2 = ybVar.f40615c;
                    textView2.setText(a02);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    mVar.h1();
                    cc.f(frameLayout, ybVar, 2750).j();
                    ea.y(mVar.f28613a, false).q(null, false, true);
                }
                if (str2 != null) {
                    mVar.h1();
                    new hc(frameLayout, mVar.I0).Q(2131624011, 36, hd.a0(null, null, 2131743879, str2)).j();
                    return;
                }
                return;
        }
    }
}
