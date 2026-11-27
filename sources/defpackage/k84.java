package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.HashSet;
public final class k84 extends e23 {
    public final lh2 b;
    public final cgd c;
    public final Object d;
    public boolean e;

    public k84(cgd cgdVar) {
        super((byte) 2);
        this.b = new lh2((byte) 3);
        this.d = new Object();
        this.e = true;
        this.c = cgdVar;
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

    public final SparseArray h(pm3 pm3Var) {
        ByteBuffer v;
        i84[] n;
        Bitmap bitmap = (Bitmap) pm3Var.d;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            v = ByteBuffer.allocateDirect(((((height + 1) / 2) * ((width + 1) / 2)) << 1) + i);
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 % width;
                int i5 = i3 / width;
                int pixel = bitmap.getPixel(i4, i5);
                float red = Color.red(pixel);
                float green = Color.green(pixel);
                float blue = Color.blue(pixel);
                v.put(i3, (byte) ((0.114f * blue) + (0.587f * green) + (0.299f * red)));
                if (i5 % 2 == 0 && i4 % 2 == 0) {
                    float i6 = bs2.i(blue, 0.5f, ((-0.331f) * green) + ((-0.169f) * red), 128.0f);
                    float i7 = bs2.i(blue, -0.081f, (green * (-0.419f)) + (red * 0.5f), 128.0f);
                    int i8 = i2 + 1;
                    v.put(i2, (byte) i6);
                    i2 += 2;
                    v.put(i8, (byte) i7);
                }
            }
        } else {
            v = pm3Var.v();
        }
        synchronized (this.d) {
            if (this.e) {
                cgd cgdVar = this.c;
                xve.h(v);
                n = cgdVar.n(v, lhf.b(pm3Var));
            } else {
                throw new IllegalStateException("Cannot use detector after release()");
            }
        }
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = new SparseArray(n.length);
        int i9 = 0;
        for (i84 i84Var : n) {
            int i10 = i84Var.a;
            i9 = Math.max(i9, i10);
            if (hashSet.contains(Integer.valueOf(i10))) {
                i10 = i9 + 1;
                i9 = i10;
            }
            hashSet.add(Integer.valueOf(i10));
            sparseArray.append(this.b.Y(i10), i84Var);
        }
        return sparseArray;
    }
}
