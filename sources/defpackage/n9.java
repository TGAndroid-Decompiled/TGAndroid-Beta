package defpackage;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
public abstract class n9 extends rr {
    public static void v(Activity activity, String[] strArr, int i) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i2));
                }
            } else {
                w26.j(b00.j(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        activity.requestPermissions(strArr, i);
    }
}
