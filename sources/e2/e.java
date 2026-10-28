package e2;

import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Bundle;
import android.text.TextUtils;
import f9.s1;
import java.util.ArrayList;
import java.util.Collection;
public abstract class e {
    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        f9.g0 g0Var = f9.i0.f10286b;
        throw new m(str, s1.e);
    }

    public static s1 b(e9.k kVar, ArrayList arrayList) {
        f9.f0 t10 = f9.i0.t();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            t10.c(kVar.apply(bundle));
        }
        return t10.f();
    }

    public static int[] c(String str) {
        int i10;
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
        int i11 = indexOf4 + 2;
        if (i11 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i11) == '/') {
            i10 = str.indexOf(47, indexOf4 + 3);
            if (i10 == -1 || i10 > indexOf2) {
                i10 = indexOf2;
            }
        } else {
            i10 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i10;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static boolean d(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        a("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        a("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            if (eglQueryString == null || !eglQueryString.contains(str)) {
                return false;
            }
            return true;
        }
        throw new m("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(eglGetError), f9.i0.y(Integer.valueOf(eglGetError)));
    }

    public static String e(StringBuilder sb2, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i15 = i10;
        int i16 = i15;
        while (i15 <= i11) {
            if (i15 == i11) {
                i12 = i15;
            } else if (sb2.charAt(i15) == '/') {
                i12 = i15 + 1;
            } else {
                i15++;
            }
            int i17 = i16 + 1;
            if (i15 == i17 && sb2.charAt(i16) == '.') {
                sb2.delete(i16, i12);
                i11 -= i12 - i16;
            } else {
                if (i15 == i16 + 2 && sb2.charAt(i16) == '.' && sb2.charAt(i17) == '.') {
                    i13 = sb2.lastIndexOf("/", i16 - 2) + 1;
                    if (i13 > i10) {
                        i14 = i13;
                    } else {
                        i14 = i10;
                    }
                    sb2.delete(i14, i12);
                    i11 -= i12 - i14;
                } else {
                    i13 = i15 + 1;
                }
                i16 = i13;
            }
            i15 = i16;
        }
        return sb2.toString();
    }

    public static String f(String str, String str2) {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] c10 = c(str2);
        if (c10[0] != -1) {
            sb2.append(str2);
            e(sb2, c10[1], c10[2]);
            return sb2.toString();
        }
        int[] c11 = c(str);
        if (c10[3] == 0) {
            sb2.append((CharSequence) str, 0, c11[3]);
            sb2.append(str2);
            return sb2.toString();
        } else if (c10[2] == 0) {
            sb2.append((CharSequence) str, 0, c11[2]);
            sb2.append(str2);
            return sb2.toString();
        } else {
            int i11 = c10[1];
            if (i11 != 0) {
                int i12 = c11[0] + 1;
                sb2.append((CharSequence) str, 0, i12);
                sb2.append(str2);
                return e(sb2, c10[1] + i12, i12 + c10[2]);
            } else if (str2.charAt(i11) == '/') {
                sb2.append((CharSequence) str, 0, c11[1]);
                sb2.append(str2);
                int i13 = c11[1];
                return e(sb2, i13, c10[2] + i13);
            } else {
                int i14 = c11[0] + 2;
                int i15 = c11[1];
                if (i14 < i15 && i15 == c11[2]) {
                    sb2.append((CharSequence) str, 0, i15);
                    sb2.append('/');
                    sb2.append(str2);
                    int i16 = c11[1];
                    return e(sb2, i16, c10[2] + i16 + 1);
                }
                int lastIndexOf = str.lastIndexOf(47, c11[2] - 1);
                if (lastIndexOf == -1) {
                    i10 = c11[1];
                } else {
                    i10 = lastIndexOf + 1;
                }
                sb2.append((CharSequence) str, 0, i10);
                sb2.append(str2);
                return e(sb2, c11[1], i10 + c10[2]);
            }
        }
    }

    public static Uri g(String str, String str2) {
        return Uri.parse(f(str, str2));
    }

    public static ArrayList h(Collection collection, e9.k kVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            arrayList.add((Bundle) kVar.apply(obj));
        }
        return arrayList;
    }
}
