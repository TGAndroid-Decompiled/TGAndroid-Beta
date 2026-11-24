package defpackage;

import android.content.Context;
import java.io.File;
public abstract class xde {
    public static final File a(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }
}
