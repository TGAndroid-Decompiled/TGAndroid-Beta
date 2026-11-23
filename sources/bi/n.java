package bi;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.LaunchActivity;
public final class n implements p10 {
    public final int f3860a;
    public final long f3861b;
    public final Object f3862c;

    public n(Object obj, long j3, int i7) {
        this.f3860a = i7;
        this.f3862c = obj;
        this.f3861b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i7;
        int i10 = this.f3860a;
        long j3 = this.f3861b;
        Object obj3 = this.f3862c;
        switch (i10) {
            case 0:
                y yVar = (y) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                FrameLayout frameLayout = yVar.f4228g2;
                yVar.W1.setLoading(false);
                yVar.f4243v2 = false;
                if (bool != null) {
                    if (j3 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bc bcVar = new bc(yVar.getContext(), yVar.J0);
                    bcVar.f33733a.setImageResource(2131231119);
                    if (z10) {
                        i7 = 2131750290;
                    } else {
                        i7 = 2131750289;
                    }
                    String N0 = gd.N0(i7, null);
                    TextView textView = bcVar.f33734b;
                    textView.setText(N0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    String a02 = gd.a0(null, null, 2131750325, Integer.valueOf(yVar.f4229h2.d.gifts_per_round));
                    TextView textView2 = bcVar.f33735c;
                    textView2.setText(a02);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    yVar.i1();
                    fc.f(frameLayout, bcVar, 2750).j();
                    di.y8.y(yVar.f30223a, false).q(null, false, true);
                }
                if (str != null) {
                    yVar.i1();
                    new kc(frameLayout, yVar.J0).Q(2131624012, 36, gd.a0(null, null, 2131743631, str)).j();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        li.k0.d(2, -j3, g2Var);
                        return;
                    } else {
                        kc.b0(g2Var).g0(tL_error, false);
                        return;
                    }
                }
                li.k0.d(1, -j3, g2Var);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l10 = (Long) obj2;
                String str2 = LaunchActivity.C1;
                if ("paid".equals((String) obj) && l10.longValue() != 0) {
                    org.telegram.messenger.g0.g3(new s2(launchActivity, l10, this.f3861b, 29));
                    return;
                }
                return;
        }
    }
}
