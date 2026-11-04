package b8;
public abstract class vd {
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
