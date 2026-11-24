package defpackage;
public abstract class pbb extends obb {
    public static String c(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int e = hbb.e(0, str, str2, false);
        if (e < 0) {
            return str;
        }
        int length = str2.length();
        int i = 1;
        if (length >= 1) {
            i = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i2 = 0;
            do {
                sb.append((CharSequence) str, i2, e);
                sb.append(str3);
                i2 = e + length;
                if (e >= str.length()) {
                    break;
                }
                e = hbb.e(e + i, str, str2, false);
            } while (e > 0);
            sb.append((CharSequence) str, i2, str.length());
            return sb.toString();
        }
        throw new OutOfMemoryError();
    }

    public static boolean d(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str.startsWith(str2);
    }
}
