package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.List;
public final class vsc extends BitmapDrawable {
    public final List a;

    public vsc(Bitmap bitmap, List list) {
        super(bitmap);
        this.a = list;
    }

    public static BitmapDrawable a(Bitmap bitmap, List list) {
        if (bitmap == null) {
            return null;
        }
        if (list != null && !list.isEmpty()) {
            return new vsc(bitmap, list);
        }
        return new BitmapDrawable(bitmap);
    }
}
