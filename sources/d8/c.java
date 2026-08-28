package d8;

import a5.m;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.t2;
import java.nio.ByteBuffer;
import java.util.HashSet;
import x5.l;
public final class c extends a8.a {
    public final a8.c f4457b;
    public final t2 f4458c;
    public final Object d;
    public boolean f4459e;

    public c(t2 t2Var) {
        super(0);
        this.f4457b = new a8.c();
        this.d = new Object();
        this.f4459e = true;
        this.f4458c = t2Var;
    }

    @Override
    public final void N() {
        super.N();
        synchronized (this.d) {
            try {
                if (!this.f4459e) {
                    return;
                }
                this.f4458c.l();
                this.f4459e = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final SparseArray Q(m mVar) {
        ByteBuffer s10;
        a[] n10;
        Bitmap bitmap = (Bitmap) mVar.d;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i9 = width * height;
            s10 = ByteBuffer.allocateDirect(((((height + 1) / 2) * ((width + 1) / 2)) << 1) + i9);
            int i10 = i9;
            for (int i11 = 0; i11 < i9; i11++) {
                int i12 = i11 % width;
                int i13 = i11 / width;
                int pixel = bitmap.getPixel(i12, i13);
                float red = Color.red(pixel);
                float green = Color.green(pixel);
                float blue = Color.blue(pixel);
                s10.put(i11, (byte) ((0.114f * blue) + (0.587f * green) + (0.299f * red)));
                if (i13 % 2 == 0 && i12 % 2 == 0) {
                    float w8 = aa.d.w(blue, 0.5f, ((-0.331f) * green) + ((-0.169f) * red), 128.0f);
                    float w10 = aa.d.w(blue, -0.081f, (green * (-0.419f)) + (red * 0.5f), 128.0f);
                    int i14 = i10 + 1;
                    s10.put(i10, (byte) w8);
                    i10 += 2;
                    s10.put(i14, (byte) w10);
                }
            }
        } else {
            s10 = mVar.s();
        }
        synchronized (this.d) {
            if (this.f4459e) {
                t2 t2Var = this.f4458c;
                l.h(s10);
                n10 = t2Var.n(s10, f3.b(mVar));
            } else {
                throw new IllegalStateException("Cannot use detector after release()");
            }
        }
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = new SparseArray(n10.length);
        int i15 = 0;
        for (a aVar : n10) {
            int i16 = aVar.f4451a;
            i15 = Math.max(i15, i16);
            if (hashSet.contains(Integer.valueOf(i16))) {
                i16 = i15 + 1;
                i15 = i16;
            }
            hashSet.add(Integer.valueOf(i16));
            sparseArray.append(this.f4457b.a(i16), aVar);
        }
        return sparseArray;
    }

    public final void finalize() {
        try {
            synchronized (this.d) {
                if (this.f4459e) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    N();
                }
            }
        } finally {
            super.finalize();
        }
    }
}
