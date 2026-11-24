package defpackage;

import android.net.Uri;
import android.text.TextUtils;
public abstract class lze {
    public static int[] a(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static String b(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i6 = i;
        int i7 = i6;
        while (i6 <= i2) {
            if (i6 == i2) {
                i3 = i6;
            } else if (sb.charAt(i6) == '/') {
                i3 = i6 + 1;
            } else {
                i6++;
            }
            int i8 = i7 + 1;
            if (i6 == i8 && sb.charAt(i7) == '.') {
                sb.delete(i7, i3);
                i2 -= i3 - i7;
            } else {
                if (i6 == i7 + 2 && sb.charAt(i7) == '.' && sb.charAt(i8) == '.') {
                    i4 = sb.lastIndexOf("/", i7 - 2) + 1;
                    if (i4 > i) {
                        i5 = i4;
                    } else {
                        i5 = i;
                    }
                    sb.delete(i5, i3);
                    i2 -= i3 - i5;
                } else {
                    i4 = i6 + 1;
                }
                i7 = i4;
            }
            i6 = i7;
        }
        return sb.toString();
    }

    public static String c(String str, String str2) {
        int i;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] a = a(str2);
        if (a[0] != -1) {
            sb.append(str2);
            b(sb, a[1], a[2]);
            return sb.toString();
        }
        int[] a2 = a(str);
        if (a[3] == 0) {
            sb.append((CharSequence) str, 0, a2[3]);
            sb.append(str2);
            return sb.toString();
        } else if (a[2] == 0) {
            sb.append((CharSequence) str, 0, a2[2]);
            sb.append(str2);
            return sb.toString();
        } else {
            int i2 = a[1];
            if (i2 != 0) {
                int i3 = a2[0] + 1;
                sb.append((CharSequence) str, 0, i3);
                sb.append(str2);
                return b(sb, a[1] + i3, i3 + a[2]);
            } else if (str2.charAt(i2) == '/') {
                sb.append((CharSequence) str, 0, a2[1]);
                sb.append(str2);
                int i4 = a2[1];
                return b(sb, i4, a[2] + i4);
            } else {
                int i5 = a2[0] + 2;
                int i6 = a2[1];
                if (i5 < i6 && i6 == a2[2]) {
                    sb.append((CharSequence) str, 0, i6);
                    sb.append('/');
                    sb.append(str2);
                    int i7 = a2[1];
                    return b(sb, i7, a[2] + i7 + 1);
                }
                int lastIndexOf = str.lastIndexOf(47, a2[2] - 1);
                if (lastIndexOf == -1) {
                    i = a2[1];
                } else {
                    i = lastIndexOf + 1;
                }
                sb.append((CharSequence) str, 0, i);
                sb.append(str2);
                return b(sb, a2[1], i + a[2]);
            }
        }
    }

    public static Uri d(String str, String str2) {
        return Uri.parse(c(str, str2));
    }
}
