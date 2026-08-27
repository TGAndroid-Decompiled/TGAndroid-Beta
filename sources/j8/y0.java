package j8;

import com.google.android.gms.common.api.Status;

public final class y0 extends a {

    public i0 f12857b;

    @Override
    public final void u(u0 u0Var) {
        String strA;
        int i10 = u0Var.f12841a;
        switch (i10) {
            case 4000:
                strA = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                strA = "DUPLICATE_LISTENER";
                break;
            case 4002:
                strA = "UNKNOWN_LISTENER";
                break;
            case 4003:
                strA = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                strA = "INVALID_TARGET_NODE";
                break;
            case 4005:
                strA = "ASSET_UNAVAILABLE";
                break;
            case 4006:
                strA = "DUPLICATE_CAPABILITY";
                break;
            case 4007:
                strA = "UNKNOWN_CAPABILITY";
                break;
            case 4008:
                strA = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
                break;
            case 4009:
                strA = "UNSUPPORTED_BY_TARGET";
                break;
            case 4010:
                strA = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            default:
                strA = i8.j.a(i10);
                break;
        }
        j0 j0Var = new j0(new Status(i10, strA, null, null), u0Var.f12842b);
        i0 i0Var = this.f12857b;
        if (i0Var != null) {
            i0Var.a(j0Var);
            this.f12857b = null;
        }
    }
}
