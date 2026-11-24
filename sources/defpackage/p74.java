package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.HashSet;
public final class p74 extends l13 {
    public final tg2 b;
    public final jbd c;
    public final Object d;
    public boolean e;

    public p74(jbd jbdVar) {
        super((byte) 2);
        this.b = new tg2((byte) 3);
        this.d = new Object();
        this.e = true;
        this.c = jbdVar;
    }

    @Override
    public final void d() {
        super.d();
        synchronized (this.d) {
            if (!this.e) {
                return;
            }
            this.c.l();
            this.e = false;
        }
    }

    public final void finalize() {
        try {
            synchronized (this.d) {
                if (this.e) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    d();
                }
            }
        } finally {
            super.finalize();
        }
    }

    public final SparseArray h(xl3 xl3Var) {
        ByteBuffer w;
        n74[] n;
        Bitmap bitmap = (Bitmap) xl3Var.d;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            w = ByteBuffer.allocateDirect(((((height + 1) / 2) * ((width + 1) / 2)) << 1) + i);
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 % width;
                int i5 = i3 / width;
                int pixel = bitmap.getPixel(i4, i5);
                float red = Color.red(pixel);
                float green = Color.green(pixel);
                float blue = Color.blue(pixel);
                w.put(i3, (byte) ((0.114f * blue) + (0.587f * green) + (0.299f * red)));
                if (i5 % 2 == 0 && i4 % 2 == 0) {
                    float i6 = ir2.i(blue, 0.5f, ((-0.331f) * green) + ((-0.169f) * red), 128.0f);
                    float i7 = ir2.i(blue, -0.081f, (green * (-0.419f)) + (red * 0.5f), 128.0f);
                    int i8 = i2 + 1;
                    w.put(i2, (byte) i6);
                    i2 += 2;
                    w.put(i8, (byte) i7);
                }
            }
        } else {
            w = xl3Var.w();
        }
        synchronized (this.d) {
            if (this.e) {
                jbd jbdVar = this.c;
                fre.h(w);
                n = jbdVar.n(w, vcf.b(xl3Var));
            } else {
                throw new IllegalStateException("Cannot use detector after release()");
            }
        }
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = new SparseArray(n.length);
        int i9 = 0;
        for (n74 n74Var : n) {
            int i10 = n74Var.a;
            i9 = Math.max(i9, i10);
            if (hashSet.contains(Integer.valueOf(i10))) {
                i10 = i9 + 1;
                i9 = i10;
            }
            hashSet.add(Integer.valueOf(i10));
            sparseArray.append(this.b.d0(i10), n74Var);
        }
        return sparseArray;
    }
}
