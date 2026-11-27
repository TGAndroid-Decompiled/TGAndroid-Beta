package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class jh implements View.OnClickListener {
    public final byte a = 0;
    public final int b;
    public final long c;
    public final FrameLayout d;
    public final Object e;

    public jh(int i, c51 c51Var, nx0 nx0Var, long j) {
        this.b = i;
        this.d = c51Var;
        this.e = nx0Var;
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
                ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new gg(i, (c51) frameLayout, (nx0) obj, this.c));
                return;
            default:
                ij1 ij1Var = (ij1) frameLayout;
                Activity activity = (Activity) obj;
                if (view.isEnabled()) {
                    c51 c51Var = ij1Var.J0;
                    if (!c51Var.R) {
                        c51Var.setLoading(true);
                        TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                        int i2 = this.b;
                        tL_payments_getStarsRevenueAdsAccountUrl.peer = uc7.s1(i2).j1(this.c);
                        ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ql(ij1Var, activity, (byte) 12));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public jh(ij1 ij1Var, int i, long j, Activity activity) {
        this.d = ij1Var;
        this.b = i;
        this.c = j;
        this.e = activity;
    }
}
