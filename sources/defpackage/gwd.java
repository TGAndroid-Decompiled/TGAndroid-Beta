package defpackage;
public abstract class gwd {
    public static final o13 a(CharSequence charSequence, String str) {
        String str2;
        boolean z = true;
        switch (str.hashCode()) {
            case -2055374133:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new m13(charSequence);
                }
                break;
            case -1166690414:
                if (str.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new n13(charSequence, (byte) 3);
                }
                break;
            case -580283253:
                if (str.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new n13(charSequence, (byte) 1);
                }
                break;
            case 1316905704:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new n13(charSequence, (byte) 2);
                }
                break;
            case 2092588512:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    return new q13(charSequence);
                }
                break;
            case 2131915191:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    return new r13(charSequence);
                }
                break;
        }
        if (str.startsWith("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION")) {
            int i = l23.c;
            if (charSequence != null) {
                str2 = charSequence.toString();
            } else {
                str2 = null;
            }
            try {
                if (hbb.f(0, 2, str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION") < 0) {
                    z = false;
                }
                if (z) {
                    int i2 = l23.c;
                    return bce.a(str, str2);
                }
                throw new Exception();
            } catch (kr4 unused) {
                return new n13(str2, str);
            }
        }
        return new n13(charSequence, str);
    }

    public static final vu4 b(CharSequence charSequence, String str) {
        String str2;
        switch (str.hashCode()) {
            case -781118336:
                if (str.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new uu4(charSequence, (byte) 2);
                }
                break;
            case -408155724:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new uu4(charSequence, (byte) 3);
                }
                break;
            case -45448328:
                if (str.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new wu4(charSequence);
                }
                break;
            case 580557411:
                if (str.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new su4(charSequence);
                }
                break;
            case 627896683:
                if (str.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new sl7(charSequence);
                }
                break;
            case 1594095913:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new uu4(charSequence, (byte) 1);
                }
                break;
        }
        if (str.startsWith("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION")) {
            int i = bv4.b;
            if (charSequence != null) {
                str2 = charSequence.toString();
            } else {
                str2 = null;
            }
            try {
                if (str.startsWith("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION")) {
                    int i2 = bv4.b;
                    return uke.a(str, str2);
                }
                throw new Exception();
            } catch (kr4 unused) {
                return new uu4(str2, str);
            }
        }
        return new uu4(charSequence, str);
    }
}
