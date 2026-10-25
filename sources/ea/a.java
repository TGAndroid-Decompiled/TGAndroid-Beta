package ea;

import c2.i;
public final class a {
    public static final ba.a f9859b = new Object();
    public static final String f9860c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final i e = new i(17);
    public final c f9861a;

    public a(c cVar) {
        this.f9861a = cVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb2.append(str.charAt(i10));
                if (str2.length() > i10) {
                    sb2.append(str2.charAt(i10));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
