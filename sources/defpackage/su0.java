package defpackage;

import android.os.Bundle;
import org.json.JSONObject;
public final class su0 extends uj3 {
    public final boolean[] I4;
    public final pv0 J4;
    public final rv0 K4;

    public su0(rv0 rv0Var, Bundle bundle, boolean[] zArr, pv0 pv0Var) {
        super(bundle);
        this.K4 = rv0Var;
        this.I4 = zArr;
        this.J4 = pv0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        JSONObject jSONObject;
        super.onFragmentDestroy();
        boolean[] zArr = this.I4;
        if (!zArr[0]) {
            zArr[0] = true;
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                jSONObject = null;
            }
            this.K4.u(this.J4, "requested_chat_failed", jSONObject);
        }
    }
}
