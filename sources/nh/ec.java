package nh;

import java.util.TimeZone;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.yd0;
public abstract class ec {
    public static String f17617a;
    public static dc f17618b;

    public static void a(boolean z10, Utilities.Callback callback) {
        yd0.e(R.raw.permission_request_location, R.string.PermissionNoLocationStory, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new jh.m6(3, new jh.m6(2, callback, z10), z10));
    }

    public static boolean b() {
        String id2 = TimeZone.getDefault().getID();
        if (!id2.startsWith("US/") && !"America/Nassau".equals(id2) && !"America/Belize".equals(id2) && !"America/Cayman".equals(id2) && !"Pacific/Palau".equals(id2)) {
            return true;
        }
        return false;
    }
}
