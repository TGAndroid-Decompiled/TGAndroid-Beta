package bi;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
public final class n implements q10 {
    public final int f3892a;
    public final long f3893b;
    public final Object f3894c;

    public n(Object obj, long j3, int i7) {
        this.f3892a = i7;
        this.f3894c = obj;
        this.f3893b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i7;
        int i10 = this.f3892a;
        long j3 = this.f3893b;
        Object obj3 = this.f3894c;
        switch (i10) {
            case 0:
                y yVar = (y) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                FrameLayout frameLayout = yVar.f4230g2;
                yVar.W1.setLoading(false);
                yVar.f4245v2 = false;
                if (bool != null) {
                    if (j3 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cc ccVar = new cc(yVar.getContext(), yVar.J0);
                    ccVar.f33963a.setImageResource(2131231117);
                    if (z10) {
                        i7 = 2131750291;
                    } else {
                        i7 = 2131750290;
                    }
                    String M0 = gd.M0(i7, null);
                    TextView textView = ccVar.f33964b;
                    textView.setText(M0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    String a02 = gd.a0(null, null, 2131750326, Integer.valueOf(yVar.f4231h2.d.gifts_per_round));
                    TextView textView2 = ccVar.f33965c;
                    textView2.setText(a02);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    yVar.i1();
                    gc.f(frameLayout, ccVar, 2750).j();
                    di.x8.y(yVar.f30189a, false).q(null, false, true);
                }
                if (str != null) {
                    yVar.i1();
                    new lc(frameLayout, yVar.J0).Q(2131624012, 36, gd.a0(null, null, 2131743641, str)).j();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        li.l0.d(2, -j3, h2Var);
                        return;
                    } else {
                        lc.b0(h2Var).g0(tL_error, false);
                        return;
                    }
                }
                li.l0.d(1, -j3, h2Var);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l10 = (Long) obj2;
                String str2 = LaunchActivity.C1;
                if ("paid".equals((String) obj) && l10.longValue() != 0) {
                    org.telegram.messenger.g0.g3(new m2(launchActivity, l10, this.f3893b, 29));
                    return;
                }
                return;
        }
    }
}
