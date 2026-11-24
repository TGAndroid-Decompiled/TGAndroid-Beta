package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
public final class cjb {
    public final Bitmap a;
    public int b;

    public cjb(Bitmap bitmap) {
        this.a = bitmap;
    }

    public static int b(via viaVar) {
        int i = (int) viaVar.a;
        int i2 = (int) viaVar.b;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i3 = iArr[0];
        GLES20.glBindTexture(3553, i3);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        return i3;
    }

    public final void a(boolean z) {
        Bitmap bitmap;
        int i = this.b;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.b = 0;
            if (z && (bitmap = this.a) != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    public final int c() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        Bitmap bitmap = this.a;
        if (bitmap == null || bitmap.isRecycled()) {
            return 0;
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        this.b = i2;
        GLES20.glBindTexture(3553, i2);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        try {
            GLUtils.texImage2D(3553, 0, 6408, this.a, 5121, 0);
        } catch (Exception e) {
            fa4.g(e, true);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i3 = width * height;
            int[] iArr2 = new int[i3];
            this.a.getPixels(iArr2, 0, width, 0, 0, width, height);
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = iArr2[i4];
                iArr2[i4] = (i5 & (-16711936)) | ((i5 & 255) << 16) | ((i5 >> 16) & 255);
            }
            GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, IntBuffer.wrap(iArr2));
        }
        if (!bitmap.isRecycled() && Build.VERSION.SDK_INT <= 28) {
            int pixel = bitmap.getPixel(0, 0);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
            allocateDirect.putInt(((-16711936) & pixel) | ((pixel & 255) << 16) | ((pixel >> 16) & 255)).position(0);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, 1, 1, 6408, 5121, allocateDirect);
        }
        qxe.a();
        return this.b;
    }
}
