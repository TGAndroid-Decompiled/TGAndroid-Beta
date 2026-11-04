package ga;

import d2.t1;
public final class a {
    public static final da.a f12182b = new Object();
    public static final String f12183c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final t1 f12184e = new t1(27);
    public final c f12185a;

    public a(c cVar) {
        this.f12185a = cVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
            for (int i3 = 0; i3 < str.length(); i3++) {
                sb2.append(str.charAt(i3));
                if (str2.length() > i3) {
                    sb2.append(str2.charAt(i3));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
