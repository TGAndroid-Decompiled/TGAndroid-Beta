package defpackage;

import android.os.Bundle;
import org.json.JSONObject;
public final class ju0 extends cj3 {
    public final boolean[] G4;
    public final ev0 H4;
    public final hv0 I4;

    public ju0(hv0 hv0Var, Bundle bundle, boolean[] zArr, ev0 ev0Var) {
        super(bundle);
        this.I4 = hv0Var;
        this.G4 = zArr;
        this.H4 = ev0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.G4;
        if (!zArr[0]) {
            zArr[0] = true;
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                jSONObject = null;
            }
            this.I4.u(this.H4, "requested_chat_failed", jSONObject);
        }
    }
}
