package f7;
public abstract class k5 {
    public static String a(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            char charAt = str.charAt(i9);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c10 = charArray[i9];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i9] = (char) (c10 ^ ' ');
                    }
                    i9++;
                }
                return String.valueOf(charArray);
            }
            i9++;
        }
        return str;
    }
}
