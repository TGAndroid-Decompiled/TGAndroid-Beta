package e0;

import a8.p0;
import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
public abstract class b extends f0.d {
    public static void f(Activity activity, String[] strArr, int i7) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (!TextUtils.isEmpty(strArr[i10])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i10], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i10));
                }
            } else {
                throw new IllegalArgumentException(p0.s(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
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
            int i11 = 0;
            for (int i12 = 0; i12 < strArr.length; i12++) {
                if (!hashSet.contains(Integer.valueOf(i12))) {
                    strArr2[i11] = strArr[i12];
                    i11++;
                }
            }
        }
        if (activity instanceof a) {
            a aVar = (a) activity;
        }
        activity.requestPermissions(strArr, i7);
    }
}
