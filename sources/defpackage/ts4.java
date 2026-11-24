package defpackage;
public final class ts4 extends us4 {
    public ts4(CharSequence charSequence, byte b) {
        super(charSequence, "androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION");
        switch (b) {
            case 2:
                super(charSequence, "android.credentials.GetCredentialException.TYPE_UNKNOWN");
                return;
            case 3:
                super(charSequence, "androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION");
                return;
            default:
                return;
        }
    }

    public ts4(CharSequence charSequence, String str) {
        super(charSequence, str);
        if (str.length() > 0) {
            return;
        }
        w26.j("type must not be empty");
        throw null;
    }
}
