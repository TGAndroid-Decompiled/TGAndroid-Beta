package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class ih implements View.OnClickListener {
    public final byte a = 0;
    public final int b;
    public final long c;
    public final FrameLayout d;
    public final Object e;

    public ih(int i, u41 u41Var, fx0 fx0Var, long j) {
        this.b = i;
        this.d = u41Var;
        this.e = fx0Var;
        this.c = j;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.e;
        FrameLayout frameLayout = this.d;
        switch (b) {
            case 0:
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.b.nextInt();
                int i = this.b;
                ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new tg(i, (u41) frameLayout, (fx0) obj, this.c));
                return;
            default:
                zi1 zi1Var = (zi1) frameLayout;
                Activity activity = (Activity) obj;
                if (view.isEnabled()) {
                    u41 u41Var = zi1Var.J0;
                    if (!u41Var.R) {
                        u41Var.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i2 = this.b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = na7.q1(i2).h1(this.c);
                        ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new pl(zi1Var, activity, (byte) 12));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ih(zi1 zi1Var, int i, long j, Activity activity) {
        this.d = zi1Var;
        this.b = i;
        this.c = j;
        this.e = activity;
    }
}
