package a8;
public abstract class ga {
    public static boolean a(String str, String str2) {
        char charAt;
        char charAt2;
        char c10;
        int length = str.length();
        if (str != str2) {
            if (length == str2.length()) {
                for (int i7 = 0; i7 < length; i7++) {
                    if (str.charAt(i7) == str2.charAt(i7) || ((c10 = (char) ((charAt | ' ') - 97)) < 26 && c10 == ((char) ((charAt2 | ' ') - 97)))) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean b(char c10) {
        if (c10 >= 'A' && c10 <= 'Z') {
            return true;
        }
        return false;
    }

    public static String c(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            if (b(str.charAt(i7))) {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c10 = charArray[i7];
                    if (b(c10)) {
                        charArray[i7] = (char) (c10 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static String d(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c10 = charArray[i7];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i7] = (char) (c10 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }
}
