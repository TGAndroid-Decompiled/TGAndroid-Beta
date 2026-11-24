package defpackage;

import java.util.TimeZone;
public abstract class gsc {
    public static String a;
    public static fsc b;

    public static boolean a() {
        String id = TimeZone.getDefault().getID();
        if (!id.startsWith("US/") && !"America/Nassau".equals(id) && !"America/Belize".equals(id) && !"America/Cayman".equals(id) && !"Pacific/Palau".equals(id)) {
            return true;
        }
        return false;
    }
}
