package bi;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import di.v8;
import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
public final class n implements s10 {
    public final int f3717a;
    public final long f3718b;
    public final Object f3719c;

    public n(Object obj, long j3, int i7) {
        this.f3717a = i7;
        this.f3719c = obj;
        this.f3718b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i7;
        int i10 = this.f3717a;
        long j3 = this.f3718b;
        Object obj3 = this.f3719c;
        switch (i10) {
            case 0:
                y yVar = (y) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                FrameLayout frameLayout = yVar.f3990g2;
                yVar.W1.setLoading(false);
                yVar.f4005v2 = false;
                if (bool != null) {
                    if (j3 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tb tbVar = new tb(yVar.getContext(), yVar.J0);
                    tbVar.f39628a.setImageResource(2131231117);
                    if (z10) {
                        i7 = 2131750307;
                    } else {
                        i7 = 2131750306;
                    }
                    String M0 = hd.M0(i7, null);
                    TextView textView = tbVar.f39629b;
                    textView.setText(M0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    String a02 = hd.a0(null, null, 2131750342, Integer.valueOf(yVar.f3991h2.d.gifts_per_round));
                    TextView textView2 = tbVar.f39630c;
                    textView2.setText(a02);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    yVar.h1();
                    xb.f(frameLayout, tbVar, 2750).j();
                    v8.y(yVar.f29679a, false).q(null, false, true);
                }
                if (str != null) {
                    yVar.h1();
                    new cc(frameLayout, yVar.J0).Q(2131624012, 36, hd.a0(null, null, 2131743878, str)).j();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        li.l0.d(e2Var, -j3, 2);
                        return;
                    } else {
                        cc.a0(e2Var).f0(tL_error, false);
                        return;
                    }
                }
                li.l0.d(e2Var, -j3, 1);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l10 = (Long) obj2;
                String str2 = LaunchActivity.C1;
                if ("paid".equals((String) obj) && l10.longValue() != 0) {
                    org.telegram.messenger.g0.h3(new m1(launchActivity, l10, this.f3718b, 29));
                    return;
                }
                return;
        }
    }
}
