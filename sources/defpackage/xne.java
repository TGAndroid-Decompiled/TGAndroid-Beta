package defpackage;

import com.google.android.gms.common.api.Status;
public final class xne extends p9d {
    public g5e b;

    @Override
    public final void T(vhe vheVar) {
        String str;
        int i = vheVar.a;
        switch (i) {
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
                str = qwd.a(i);
                break;
        }
        c7e c7eVar = new c7e(new Status(i, str, null, null), vheVar.b);
        g5e g5eVar = this.b;
        if (g5eVar != null) {
            g5eVar.a(c7eVar);
            this.b = null;
        }
    }
}
