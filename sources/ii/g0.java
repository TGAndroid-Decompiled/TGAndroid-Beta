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
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
public final class g0 implements v10 {
    public final int f15537a;
    public final long f15538b;
    public final Object f15539c;

    public g0(Object obj, long j3, int i7) {
        this.f15537a = i7;
        this.f15539c = obj;
        this.f15538b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z9;
        int i7;
        int i10 = this.f15537a;
        long j3 = this.f15538b;
        Object obj3 = this.f15539c;
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
                        gc.a0(f2Var).f0(tL_error, false);
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
                    org.telegram.messenger.g0.h3(new d3(launchActivity, l10, this.f15538b, 28));
                    return;
                }
                return;
            default:
                zh.l lVar = (zh.l) obj3;
                Boolean bool2 = (Boolean) obj;
                String str2 = (String) obj2;
                FrameLayout frameLayout = lVar.f60437f2;
                lVar.V1.setLoading(false);
                lVar.f60452u2 = false;
                if (bool2 != null) {
                    if (j3 > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    xb xbVar = new xb(lVar.getContext(), lVar.I0);
                    xbVar.f40279a.setImageResource(2131231117);
                    if (z9) {
                        i7 = 2131750307;
                    } else {
                        i7 = 2131750306;
                    }
                    String M0 = id.M0(i7, null);
                    TextView textView = xbVar.f40280b;
                    textView.setText(M0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    String a02 = id.a0(null, null, 2131750342, Integer.valueOf(lVar.f60438g2.d.gifts_per_round));
                    TextView textView2 = xbVar.f40281c;
                    textView2.setText(a02);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    lVar.h1();
                    bc.f(frameLayout, xbVar, 2750).j();
                    ea.y(lVar.f28669a, false).q(null, false, true);
                }
                if (str2 != null) {
                    lVar.h1();
                    new gc(frameLayout, lVar.I0).Q(2131624011, 36, id.a0(null, null, 2131743878, str2)).j();
                    return;
                }
                return;
        }
    }
}
