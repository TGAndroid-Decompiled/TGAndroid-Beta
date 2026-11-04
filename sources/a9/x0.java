package a9;

import com.google.android.gms.common.api.Status;
public final class x0 extends a {
    public g0 f269b;

    @Override
    public final void i0(t0 t0Var) {
        String str;
        int i3 = t0Var.f253a;
        switch (i3) {
            case 4000:
                str = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                str = "DUPLICATE_LISTENER";
                break;
            case 4002:
                str = "UNKNOWN_LISTENER";
                break;
            case 4003:
                str = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                str = "INVALID_TARGET_NODE";
                break;
            case 4005:
                str = "ASSET_UNAVAILABLE";
                break;
            case 4006:
                str = "DUPLICATE_CAPABILITY";
                break;
            case 4007:
                str = "UNKNOWN_CAPABILITY";
                break;
            case 4008:
                str = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
                break;
            case 4009:
                str = "UNSUPPORTED_BY_TARGET";
                break;
            case 4010:
                str = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            default:
                str = z8.c.a(i3);
                break;
        }
        h0 h0Var = new h0(new Status(i3, str, null, null), t0Var.f254b);
        g0 g0Var = this.f269b;
        if (g0Var != null) {
            g0Var.a(h0Var);
            this.f269b = null;
        }
    }
}
