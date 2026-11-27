package defpackage;

import android.media.MediaRoute2Info;
import java.util.Set;
public abstract class kw6 {
    public static void a(MediaRoute2Info.Builder builder, ev6 ev6Var) {
        if (ev6Var.a.getBoolean("isVisibilityPublic", true)) {
            builder.setVisibilityPublic();
        } else {
            builder.setVisibilityRestricted(ev6Var.a());
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
