package defpackage;
public abstract class jrd {
    public static boolean a(String str, String str2) {
        char charAt;
        char charAt2;
        char c;
        int length = str.length();
        if (str != str2) {
            if (length == str2.length()) {
                for (int i = 0; i < length; i++) {
                    if (str.charAt(i) == str2.charAt(i) || ((c = (char) ((charAt | ' ') - 97)) < 26 && c == ((char) ((charAt2 | ' ') - 97)))) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean b(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    public static String c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (b(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (b(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String d(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
