package defpackage;

import com.google.android.gms.common.api.Status;
public final class hle extends y6d {
    public t2e b;

    @Override
    public final void T(ffe ffeVar) {
        String str;
        int i = ffeVar.a;
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
                str = dud.a(i);
                break;
        }
        p4e p4eVar = new p4e(new Status(i, str, null, null), ffeVar.b);
        t2e t2eVar = this.b;
        if (t2eVar != null) {
            t2eVar.a(p4eVar);
            this.b = null;
        }
    }
}
