package g7;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.ApplicationLoader;
public abstract class z5 {
    public static NinePatchDrawable a(Bitmap bitmap, Rect rect, int i9, int i10) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                if (i9 >= 0 && i9 < bitmap.getWidth() && i10 >= 0 && i10 < bitmap.getHeight()) {
                    return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap, c(i9, i9 + 1, i10, i10 + 1, rect.left, rect.top, rect.right, rect.bottom, bitmap.getPixel(i9, i10)).array(), rect, null);
                }
                StringBuilder o6 = e2.c.o("center pixel is outside bitmap: (", i9, ", ", i10, ") for ");
                o6.append(bitmap.getWidth());
                o6.append("x");
                o6.append(bitmap.getHeight());
                throw new IllegalArgumentException(o6.toString());
            }
            throw new IllegalArgumentException("bitmap is recycled");
        }
        throw new IllegalArgumentException("bitmap == null");
    }

    public static android.graphics.drawable.NinePatchDrawable b(android.graphics.Bitmap[] r37, float[] r38, float r39, float r40, int r41, og.f r42) {
        throw new UnsupportedOperationException("Method not decompiled: g7.z5.b(android.graphics.Bitmap[], float[], float, float, int, og.f):android.graphics.drawable.NinePatchDrawable");
    }

    public static ByteBuffer c(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i13);
        order.putInt(i15);
        order.putInt(i14);
        order.putInt(i16);
        order.putInt(0);
        order.putInt(i9);
        order.putInt(i10);
        order.putInt(i11);
        order.putInt(i12);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(i17);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        return order;
    }
}
