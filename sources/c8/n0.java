package c8;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public abstract class n0 {
    public static NinePatchDrawable a(Bitmap bitmap, Rect rect, int i7, int i10) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                if (i7 >= 0 && i7 < bitmap.getWidth() && i10 >= 0 && i10 < bitmap.getHeight()) {
                    return new NinePatchDrawable(org.telegram.messenger.t0.f25570b.getResources(), bitmap, c(i7, i7 + 1, i10, i10 + 1, rect.left, rect.top, rect.right, rect.bottom, bitmap.getPixel(i7, i10)).array(), rect, null);
                }
                StringBuilder o4 = jg.g.o("center pixel is outside bitmap: (", i7, ", ", i10, ") for ");
                o4.append(bitmap.getWidth());
                o4.append("x");
                o4.append(bitmap.getHeight());
                throw new IllegalArgumentException(o4.toString());
            }
            throw new IllegalArgumentException("bitmap is recycled");
        }
        throw new IllegalArgumentException("bitmap == null");
    }

    public static android.graphics.drawable.NinePatchDrawable b(android.graphics.Bitmap[] r38, int r39, float[] r40, float r41, int r42, float r43, int r44) {
        throw new UnsupportedOperationException("Method not decompiled: c8.n0.b(android.graphics.Bitmap[], int, float[], float, int, float, int):android.graphics.drawable.NinePatchDrawable");
    }

    public static ByteBuffer c(int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
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
        order.putInt(i7);
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
