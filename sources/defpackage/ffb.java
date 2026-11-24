package defpackage;

import android.content.Context;
import android.media.MediaRouter2;
public abstract class ffb {
    public static MediaRouter2 a(Context context) {
        return MediaRouter2.getInstance(context);
    }
}
