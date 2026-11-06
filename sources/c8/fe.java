package c8;
public abstract class fe {
    public static final w0.d a(CharSequence charSequence, String str) {
        String str2;
        switch (str.hashCode()) {
            case -2055374133:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new w0.b(charSequence);
                }
                break;
            case -1166690414:
                if (str.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new w0.c(3, charSequence);
                }
                break;
            case -580283253:
                if (str.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new w0.c(1, charSequence);
                }
                break;
            case 1316905704:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new w0.c(2, charSequence);
                }
                break;
            case 2092588512:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    return new w0.e(charSequence);
                }
                break;
            case 2131915191:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    return new w0.f(charSequence);
                }
                break;
        }
        if (xd.l.d(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION")) {
            int i7 = y0.a.f58748c;
            if (charSequence != null) {
                str2 = charSequence.toString();
            } else {
                str2 = null;
            }
            try {
                if (xd.d.e(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION")) {
                    int i10 = y0.a.f58748c;
                    return ud.a(str, str2);
                }
                throw new Exception();
            } catch (z0.a unused) {
                return new w0.c(str2, str);
            }
        }
        return new w0.c(charSequence, str);
    }

    public static final w0.i b(CharSequence charSequence, String str) {
        String str2;
        switch (str.hashCode()) {
            case -781118336:
                if (str.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new w0.h(2, charSequence);
                }
                break;
            case -408155724:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new w0.h(3, charSequence);
                }
                break;
            case -45448328:
                if (str.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new w0.j(charSequence);
                }
                break;
            case 580557411:
                if (str.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new w0.g(charSequence);
                }
                break;
            case 627896683:
                if (str.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new w0.k(charSequence);
                }
                break;
            case 1594095913:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new w0.h(1, charSequence);
                }
                break;
        }
        if (xd.l.d(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION")) {
            int i7 = y0.b.f58750c;
            if (charSequence != null) {
                str2 = charSequence.toString();
            } else {
                str2 = null;
            }
            try {
                if (xd.l.d(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION")) {
                    int i10 = y0.b.f58750c;
                    return wd.a(str, str2);
                }
                throw new Exception();
            } catch (z0.a unused) {
                return new w0.h(str2, str);
            }
        }
        return new w0.h(charSequence, str);
    }
}
