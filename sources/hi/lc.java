package hi;

import java.util.TimeZone;
public abstract class lc {
    public static String f14849a;
    public static kc f14850b;

    public static boolean a() {
        String id2 = TimeZone.getDefault().getID();
        if (!id2.startsWith("US/") && !"America/Nassau".equals(id2) && !"America/Belize".equals(id2) && !"America/Cayman".equals(id2) && !"Pacific/Palau".equals(id2)) {
            return true;
        }
        return false;
    }
}
