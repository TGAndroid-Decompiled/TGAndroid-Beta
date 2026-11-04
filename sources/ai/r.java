package ai;

import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.e9;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
public final class r implements n10 {
    public final int f931a;
    public final long f932b;
    public final Object f933c;

    public r(Object obj, long j10, int i3) {
        this.f931a = i3;
        this.f933c = obj;
        this.f932b = j10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i3;
        int i10 = this.f931a;
        long j10 = this.f932b;
        Object obj3 = this.f933c;
        switch (i10) {
            case 0:
                e0 e0Var = (e0) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                FrameLayout frameLayout = e0Var.f598d2;
                e0Var.T1.setLoading(false);
                e0Var.f613s2 = false;
                if (bool != null) {
                    if (j10 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    wb wbVar = new wb(e0Var.getContext(), e0Var.J0);
                    wbVar.f39978a.setImageResource(2131231117);
                    if (z10) {
                        i3 = 2131750315;
                    } else {
                        i3 = 2131750314;
                    }
                    String M0 = bd.M0(i3, null);
                    TextView textView = wbVar.f39979b;
                    textView.setText(M0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    String a02 = bd.a0(null, null, 2131750350, Integer.valueOf(e0Var.f599e2.d.gifts_per_round));
                    TextView textView2 = wbVar.f39980c;
                    textView2.setText(a02);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    e0Var.h1();
                    ac.f(frameLayout, wbVar, 2750).j();
                    e9.y(e0Var.f28583a, false).q(null, false, true);
                }
                if (str != null) {
                    e0Var.h1();
                    new fc(frameLayout, e0Var.J0).Q(2131624011, 36, bd.a0(null, null, 2131743888, str)).j();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        ji.j0.d(d2Var, -j10, 2);
                        return;
                    } else {
                        fc.a0(d2Var).f0(tL_error, false);
                        return;
                    }
                }
                ji.j0.d(d2Var, -j10, 1);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l10 = (Long) obj2;
                String str2 = LaunchActivity.E1;
                if ("paid".equals((String) obj) && l10.longValue() != 0) {
                    org.telegram.messenger.g0.h3(new r1(launchActivity, l10, this.f932b, 29));
                    return;
                }
                return;
        }
    }
}
