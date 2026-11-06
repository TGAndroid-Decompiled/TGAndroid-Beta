package db;

import android.util.Log;
public final class h {
    static {
        String[] strArr = {"TestSessionManager"};
        if (strArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str);
            }
            sb2.append("] ");
        }
        for (int i7 = 2; i7 <= 7 && !Log.isLoggable("fpnvsdk", i7); i7++) {
        }
    }
}
