package defpackage;

import android.os.Bundle;
import org.json.JSONObject;
public final class sv0 extends nk3 {
    public final boolean[] I4;
    public final ow0 J4;
    public final qw0 K4;

    public sv0(qw0 qw0Var, Bundle bundle, boolean[] zArr, ow0 ow0Var) {
        super(bundle);
        this.K4 = qw0Var;
        this.I4 = zArr;
        this.J4 = ow0Var;
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
