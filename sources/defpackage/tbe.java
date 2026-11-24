package defpackage;

import android.os.Bundle;
import org.json.JSONObject;
public abstract class tbe {
    public static w13 a(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        try {
            int hashCode = str.hashCode();
            if (hashCode != -1678407252) {
                if (hashCode != -543568185) {
                    if (hashCode == -95037569 && str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                            string.getClass();
                            return new n23(string, bundle);
                        } catch (Exception unused) {
                            throw new Exception();
                        }
                    }
                } else if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return new w13("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
                }
                throw new Exception();
            }
            if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                try {
                    String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON");
                    string2.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON", string2);
                    w13 w13Var = new w13("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle2);
                    if (string2.length() != 0) {
                        try {
                            new JSONObject(string2);
                            return w13Var;
                        } catch (Exception unused2) {
                        }
                    }
                    throw new IllegalArgumentException("responseJson must not be empty, and must be a valid JSON");
                } catch (Exception unused3) {
                    throw new Exception();
                }
            }
            throw new Exception();
        } catch (kr4 unused4) {
            w13 w13Var2 = new w13(str, bundle);
            if (str.length() > 0) {
                return w13Var2;
            }
            u36.j("type should not be empty");
            return null;
        }
    }
}
