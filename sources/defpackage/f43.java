package defpackage;

import android.os.Bundle;
import org.json.JSONObject;
public class f43 extends l13 {
    public f43(String str, Bundle bundle, byte b) {
        super(str, bundle);
        switch (b) {
            case 2:
                super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
                if (str.length() > 0) {
                    return;
                }
                w26.j("password should not be empty");
                throw null;
            case 3:
                super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                w26.j("authenticationResponseJson must not be empty, and must be a valid JSON");
                throw null;
            default:
                bundle.getClass();
                if (str.length() > 0) {
                    return;
                }
                w26.j("type should not be empty");
                throw null;
        }
    }
}
