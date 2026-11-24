package defpackage;

import android.util.Log;
public final class a0d {
    static {
        String[] strArr = {"TestSessionManager"};
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str);
            }
            sb.append("] ");
        }
        for (int i = 2; i <= 7 && !Log.isLoggable("fpnvsdk", i); i++) {
        }
    }
}
