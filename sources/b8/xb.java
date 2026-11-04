package b8;
public abstract class xb {
    public static boolean a(String str, String str2) {
        char charAt;
        char charAt2;
        char c2;
        int length = str.length();
        if (str != str2) {
            if (length == str2.length()) {
                for (int i3 = 0; i3 < length; i3++) {
                    if (str.charAt(i3) == str2.charAt(i3) || ((c2 = (char) ((charAt | ' ') - 97)) < 26 && c2 == ((char) ((charAt2 | ' ') - 97)))) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean b(char c2) {
        if (c2 >= 'A' && c2 <= 'Z') {
            return true;
        }
        return false;
    }

    public static String c(String str) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            if (b(str.charAt(i3))) {
                char[] charArray = str.toCharArray();
                while (i3 < length) {
                    char c2 = charArray[i3];
                    if (b(c2)) {
                        charArray[i3] = (char) (c2 ^ ' ');
                    }
                    i3++;
                }
                return String.valueOf(charArray);
            }
            i3++;
        }
        return str;
    }

    public static String d(String str) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt = str.charAt(i3);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i3 < length) {
                    char c2 = charArray[i3];
                    if (c2 >= 'a' && c2 <= 'z') {
                        charArray[i3] = (char) (c2 ^ ' ');
                    }
                    i3++;
                }
                return String.valueOf(charArray);
            }
            i3++;
        }
        return str;
    }
}
