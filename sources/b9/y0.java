package b9;

import a8.j8;
import com.google.android.gms.common.api.Status;
public final class y0 extends a {
    public h0 f3080b;

    @Override
    public final void O(u0 u0Var) {
        String str;
        int i7 = u0Var.f3064a;
        switch (i7) {
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
                str = j8.a(i7);
                break;
        }
        i0 i0Var = new i0(new Status(i7, str, null, null), u0Var.f3065b);
        h0 h0Var = this.f3080b;
        if (h0Var != null) {
            h0Var.a(i0Var);
            this.f3080b = null;
        }
    }
}
