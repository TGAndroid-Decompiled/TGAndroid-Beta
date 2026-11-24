package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.a;
public abstract class ure {
    public static NinePatchDrawable a(Bitmap bitmap, Rect rect, int i, int i2) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                if (i >= 0 && i < bitmap.getWidth() && i2 >= 0 && i2 < bitmap.getHeight()) {
                    return new NinePatchDrawable(a.b.getResources(), bitmap, c(i, i + 1, i2, i2 + 1, rect.left, rect.top, rect.right, rect.bottom, bitmap.getPixel(i, i2)).array(), rect, null);
                }
                StringBuilder o = ts2.o("center pixel is outside bitmap: (", i, ", ", i2, ") for ");
                o.append(bitmap.getWidth());
                o.append("x");
                gxc.c(bitmap.getHeight(), o);
                return null;
            }
            u36.j("bitmap is recycled");
            return null;
        }
        u36.j("bitmap == null");
        return null;
    }

    public static android.graphics.drawable.NinePatchDrawable b(android.graphics.Bitmap[] r39, int r40, float[] r41, float r42, int r43, float r44, int r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ure.b(android.graphics.Bitmap[], int, float[], float, int, float, int):android.graphics.drawable.NinePatchDrawable");
    }

    public static ByteBuffer c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i5);
        order.putInt(i7);
        order.putInt(i6);
        order.putInt(i8);
        order.putInt(0);
        order.putInt(i);
        order.putInt(i2);
        order.putInt(i3);
        order.putInt(i4);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(i9);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        return order;
    }
}
