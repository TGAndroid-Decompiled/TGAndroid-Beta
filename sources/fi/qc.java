package fi;

import java.util.TimeZone;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xe0;
public abstract class qc {
    public static String f11506a;
    public static pc f11507b;

    public static void a(boolean z10, Utilities.Callback callback) {
        xe0.c(R.raw.permission_request_location, R.string.PermissionNoLocationStory, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new bi.t8(3, new bi.t8(2, callback, z10), z10));
    }

    public static boolean b() {
        String id2 = TimeZone.getDefault().getID();
        if (!id2.startsWith("US/") && !"America/Nassau".equals(id2) && !"America/Belize".equals(id2) && !"America/Cayman".equals(id2) && !"Pacific/Palau".equals(id2)) {
            return true;
        }
        return false;
    }
}
