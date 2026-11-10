package ha;
public final class a {
    public static final ea.a f14427b = new Object();
    public static final String f14428c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final g2.c f14429e = new g2.c(5);
    public final c f14430a;

    public a(c cVar) {
        this.f14430a = cVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
            for (int i7 = 0; i7 < str.length(); i7++) {
                sb2.append(str.charAt(i7));
                if (str2.length() > i7) {
                    sb2.append(str2.charAt(i7));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
