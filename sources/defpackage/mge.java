package defpackage;

import android.content.Context;
import java.io.File;
public abstract class mge {
    public static final File a(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }
}
