package b8;
public abstract class aa {
    public static String a(String str) {
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
