package defpackage;

import android.os.Bundle;
import org.json.JSONObject;
public final class b13 extends k03 {
    public b13(String str, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        w26.j("registrationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }
}
