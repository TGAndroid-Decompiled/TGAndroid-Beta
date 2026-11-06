package c8;
public abstract class p9 {
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
