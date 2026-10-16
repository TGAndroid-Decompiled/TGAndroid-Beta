package di;

import java.util.TimeZone;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.df0;
public abstract class jd {
    public static String f7149a;
    public static id f7150b;

    public static void a(boolean z10, Utilities.Callback callback) {
        df0.c(R.raw.permission_request_location, R.string.PermissionNoLocationStory, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new bi.y2(2, new bi.y2(1, callback, z10), z10));
    }

    public static boolean b() {
        String id2 = TimeZone.getDefault().getID();
        if (!id2.startsWith("US/") && !"America/Nassau".equals(id2) && !"America/Belize".equals(id2) && !"America/Cayman".equals(id2) && !"Pacific/Palau".equals(id2)) {
            return true;
        }
        return false;
    }
}
