package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class ii implements View.OnClickListener {
    public final byte a = 0;
    public final int b;
    public final long c;
    public final FrameLayout d;
    public final Object e;

    public ii(int i, b61 b61Var, my0 my0Var, long j) {
        this.b = i;
        this.d = b61Var;
        this.e = my0Var;
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
                ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new mh(i, (b61) frameLayout, (my0) obj, this.c));
                return;
            default:
                ik1 ik1Var = (ik1) frameLayout;
                Activity activity = (Activity) obj;
                if (view.isEnabled()) {
                    b61 b61Var = ik1Var.J0;
                    if (!b61Var.R) {
                        b61Var.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i2 = this.b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = oc7.r1(i2).i1(this.c);
                        ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new pm(ik1Var, activity, (byte) 12));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ii(ik1 ik1Var, int i, long j, Activity activity) {
        this.d = ik1Var;
        this.b = i;
        this.c = j;
        this.e = activity;
    }
}
