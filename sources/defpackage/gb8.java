package defpackage;

import android.graphics.Bitmap;
import java.util.HashMap;
public abstract class gb8 {
    public static do3 a;
    public static final nr4 b = new nr4(25165824, (byte) 2);
    public static final np4 c = new np4(16, 0.75f, true, (byte) 2);
    public static final HashMap d = new HashMap();

    public static int a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
