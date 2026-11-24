package defpackage;

import android.graphics.Bitmap;
import java.util.HashMap;
public abstract class jd8 {
    public static np3 a;
    public static final ot4 b = new ot4(25165824, (byte) 2);
    public static final or4 c = new or4(16, 0.75f, true, (byte) 2);
    public static final HashMap d = new HashMap();

    public static int a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
