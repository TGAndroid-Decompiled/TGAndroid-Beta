package defpackage;

import android.media.MediaRoute2Info;
import java.util.Set;
public abstract class fw6 {
    public static void a(MediaRoute2Info.Builder builder, zu6 zu6Var) {
        if (zu6Var.a.getBoolean("isVisibilityPublic", true)) {
            builder.setVisibilityPublic();
        } else {
            builder.setVisibilityRestricted(zu6Var.a());
        }
    }

    public static Set<String> b(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getDeduplicationIds();
    }

    public static int c(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getType();
    }

    public static void d(MediaRoute2Info.Builder builder, Set<String> set) {
        builder.setDeduplicationIds(set);
    }

    public static void e(MediaRoute2Info.Builder builder, int i) {
        builder.setType(i);
    }
}
