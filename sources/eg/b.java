package eg;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.List;
public final class b extends BitmapDrawable {
    public final List f8766a;

    public b(Bitmap bitmap, List list) {
        super(bitmap);
        this.f8766a = list;
    }

    public static BitmapDrawable a(Bitmap bitmap, List list) {
        if (bitmap == null) {
            return null;
        }
        if (list != null && !list.isEmpty()) {
            return new b(bitmap, list);
        }
        return new BitmapDrawable(bitmap);
    }
}
