package k9;

import i3.i;
public final class a {
    public static final h9.c f14708b = new Object();
    public static final String f14709c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final i f14710e = new i(13);
    public final c f14711a;

    public a(c cVar) {
        this.f14711a = cVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
            for (int i9 = 0; i9 < str.length(); i9++) {
                sb2.append(str.charAt(i9));
                if (str2.length() > i9) {
                    sb2.append(str2.charAt(i9));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
