package e0;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
public abstract class e extends f0.e {
    public static void g(Activity activity, String[] strArr, int i9) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (!TextUtils.isEmpty(strArr[i10])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i10], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i10));
                }
            } else {
                throw new IllegalArgumentException(aa.d.r(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size != strArr.length) {
                int i11 = 0;
                for (int i12 = 0; i12 < strArr.length; i12++) {
                    if (!hashSet.contains(Integer.valueOf(i12))) {
                        strArr2[i11] = strArr[i12];
                        i11++;
                    }
                }
            } else {
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof d) {
                d dVar = (d) activity;
            }
            b.q(activity, strArr, i9);
        } else if (activity instanceof c) {
            new Handler(Looper.getMainLooper()).post(new androidx.activity.g(strArr2, activity, i9, 5));
        }
    }
}
