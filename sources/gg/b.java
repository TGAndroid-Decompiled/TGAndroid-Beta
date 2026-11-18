package gg;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import java.util.List;
public final class b extends BitmapDrawable {
    public final List f13612a;

    public b(Bitmap bitmap, List list) {
        super(bitmap);
        this.f13612a = list;
    }

    public static BitmapDrawable a(Bitmap bitmap, ArrayList arrayList) {
        if (bitmap == null) {
            return null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            return new b(bitmap, arrayList);
        }
        return new BitmapDrawable(bitmap);
    }
}
