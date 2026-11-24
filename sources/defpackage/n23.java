package defpackage;

import android.os.Bundle;
import org.json.JSONObject;
public final class n23 extends w13 {
    public n23(String str, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        u36.j("registrationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }
}
