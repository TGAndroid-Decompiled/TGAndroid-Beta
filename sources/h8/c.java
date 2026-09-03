package h8;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;
import b6.m;
import cb.e;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.t2;
import java.nio.ByteBuffer;
import java.util.HashSet;
public final class c extends e {
    public final e8.b f7031b;
    public final t2 f7032c;
    public final Object d;
    public boolean e;

    public c(t2 t2Var) {
        super(2);
        this.f7031b = new e8.b();
        this.d = new Object();
        this.e = true;
        this.f7032c = t2Var;
    }

    @Override
    public final void J() {
        super.J();
        synchronized (this.d) {
            try {
                if (!this.e) {
                    return;
                }
                this.f7032c.l();
                this.e = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final SparseArray L(af.d dVar) {
        ByteBuffer s6;
        a[] n10;
        Bitmap bitmap = (Bitmap) dVar.d;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            s6 = ByteBuffer.allocateDirect(((((height + 1) / 2) * ((width + 1) / 2)) << 1) + i10);
            int i11 = i10;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = i12 % width;
                int i14 = i12 / width;
                int pixel = bitmap.getPixel(i13, i14);
                float red = Color.red(pixel);
                float green = Color.green(pixel);
                float blue = Color.blue(pixel);
                s6.put(i12, (byte) ((0.114f * blue) + (0.587f * green) + (0.299f * red)));
                if (i14 % 2 == 0 && i13 % 2 == 0) {
                    float A = e2.c.A(blue, 0.5f, ((-0.331f) * green) + ((-0.169f) * red), 128.0f);
                    float A2 = e2.c.A(blue, -0.081f, (green * (-0.419f)) + (red * 0.5f), 128.0f);
                    int i15 = i11 + 1;
                    s6.put(i11, (byte) A);
                    i11 += 2;
                    s6.put(i15, (byte) A2);
                }
            }
        } else {
            s6 = dVar.s();
        }
        synchronized (this.d) {
            if (this.e) {
                t2 t2Var = this.f7032c;
                m.h(s6);
                n10 = t2Var.n(s6, f3.e(dVar));
            } else {
                throw new IllegalStateException("Cannot use detector after release()");
            }
        }
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = new SparseArray(n10.length);
        int i16 = 0;
        for (a aVar : n10) {
            int i17 = aVar.f7025a;
            i16 = Math.max(i16, i17);
            if (hashSet.contains(Integer.valueOf(i17))) {
                i17 = i16 + 1;
                i16 = i17;
            }
            hashSet.add(Integer.valueOf(i17));
            sparseArray.append(this.f7031b.a(i17), aVar);
        }
        return sparseArray;
    }

    public final void finalize() {
        try {
            synchronized (this.d) {
                if (this.e) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    J();
                }
            }
        } finally {
            super.finalize();
        }
    }
}
