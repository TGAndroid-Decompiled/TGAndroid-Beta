package o9;

import mh.c3;
public final class a {
    public static final l9.a f16663b = new Object();
    public static final String f16664c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final c3 f16665e = new c3(6);
    public final c f16666a;

    public a(c cVar) {
        this.f16666a = cVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb.append(str.charAt(i10));
                if (str2.length() > i10) {
                    sb.append(str2.charAt(i10));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
