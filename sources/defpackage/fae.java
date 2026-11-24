package defpackage;

import android.os.Bundle;
import org.json.JSONObject;
public abstract class fae {
    public static l13 a(String str, Bundle bundle) {
        bundle.getClass();
        try {
            switch (str.hashCode()) {
                case -1678407252:
                    if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        try {
                            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            string.getClass();
                            l13 l13Var = new l13("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle);
                            if (string.length() != 0) {
                                try {
                                    new JSONObject(string);
                                    return l13Var;
                                } catch (Exception unused) {
                                }
                            }
                            throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
                        } catch (Exception unused2) {
                            throw new Exception();
                        }
                    }
                    throw new Exception();
                case -1072734346:
                    if (str.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (string2 != null) {
                            l13 l13Var2 = new l13("androidx.credentials.TYPE_RESTORE_CREDENTIAL", bundle);
                            if (string2.length() != 0) {
                                try {
                                    new JSONObject(string2);
                                    return l13Var2;
                                } catch (Exception unused3) {
                                }
                            }
                            throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                        }
                        throw new pj7("The device does not contain a restore credential.");
                    }
                    throw new Exception();
                case -543568185:
                    if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String string3 = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string4 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            string3.getClass();
                            string4.getClass();
                            return new f43(string4, bundle, (byte) 2);
                        } catch (Exception unused4) {
                            throw new Exception();
                        }
                    }
                    throw new Exception();
                case -95037569:
                    if (str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string5 = bundle.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            string5.getClass();
                            return new f43(string5, bundle, (byte) 3);
                        } catch (Exception unused5) {
                            throw new Exception();
                        }
                    }
                    throw new Exception();
                default:
                    throw new Exception();
            }
        } catch (jp4 unused6) {
            return new f43(str, bundle, (byte) 0);
        }
    }
}
