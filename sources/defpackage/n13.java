package defpackage;
public final class n13 extends o13 {
    public n13(CharSequence charSequence, byte b) {
        super(charSequence, "androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION");
        switch (b) {
            case 2:
                super(charSequence, "android.credentials.CreateCredentialException.TYPE_UNKNOWN");
                return;
            case 3:
                super(charSequence, "androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION");
                return;
            default:
                return;
        }
    }

    public n13(CharSequence charSequence, String str) {
        super(charSequence, str);
        if (str.length() > 0) {
            return;
        }
        u36.j("type must not be empty");
        throw null;
    }
}
