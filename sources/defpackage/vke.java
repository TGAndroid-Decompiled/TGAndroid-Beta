package defpackage;
public abstract class vke {
    public static ga4 a(long j, int i, long j2, float f, float f2, float f3, float f4, fa4 fa4Var) {
        float f5 = f4 - f3;
        float max = Math.max(f, f3);
        float min = Math.min(f2, f4);
        if (f5 > 0.0f && max < min) {
            float f6 = f2 - f;
            if (min - max >= Math.min(f6, f5) / 2.0f) {
                return new ga4(j, i, j2, max - f, min - f, f6, f5, fa4Var);
            }
            return null;
        }
        return null;
    }

    public static String b(String str, boolean z) {
        String str2;
        if (str != null) {
            if (str.indexOf(58) <= 0) {
                str2 = "";
            } else {
                str2 = str.substring(0, str.indexOf(58)).toLowerCase();
            }
            String lowerCase = str.toLowerCase();
            if (!str.startsWith("@") && !str2.equals("tg")) {
                if (!str2.equals("http") && !str2.equals("https") && !str2.equals("tonsite")) {
                    return null;
                }
                String str3 = lowerCase.substring(str2.length() + 1).replaceFirst("^//", "").split("[/?#:]", 2)[0];
                if (!str3.equals("telegra.ph") && !str3.equals("te.legra.ph") && !str3.equals("graph.org")) {
                    if (!str3.equals("telegram.org") || !lowerCase.matches(".*telegram\\.org/(faq|privacy|blog).*")) {
                        if (!z) {
                            return "external";
                        }
                        return "in_app";
                    }
                    return "iv";
                }
                return "iv";
            }
            return "in_app";
        }
        return null;
    }
}
