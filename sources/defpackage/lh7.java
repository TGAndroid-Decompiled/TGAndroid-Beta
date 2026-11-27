package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.Build;
import java.lang.ref.WeakReference;
public final class lh7 {
    public final Shader.TileMode a;
    public final Matrix b = new Matrix();
    public boolean c;
    public BitmapShader d;
    public WeakReference e;

    public lh7(Shader.TileMode tileMode) {
        this.a = tileMode;
    }

    public final void a(boolean z) {
        BitmapShader bitmapShader;
        int i;
        if (this.c != z) {
            this.c = z;
            if (Build.VERSION.SDK_INT >= 33 && (bitmapShader = this.d) != null) {
                if (z) {
                    i = 1;
                } else {
                    i = 2;
                }
                bitmapShader.setFilterMode(i);
            }
        }
    }

    public final boolean b(Bitmap bitmap) {
        int i;
        WeakReference weakReference = this.e;
        if (weakReference != null && weakReference.get() == bitmap) {
            return false;
        }
        this.e = new WeakReference(bitmap);
        Shader.TileMode tileMode = this.a;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.d = bitmapShader;
        bitmapShader.setLocalMatrix(this.b);
        if (Build.VERSION.SDK_INT >= 33) {
            BitmapShader bitmapShader2 = this.d;
            if (this.c) {
                i = 1;
            } else {
                i = 2;
            }
            bitmapShader2.setFilterMode(i);
        }
        return true;
    }
}
