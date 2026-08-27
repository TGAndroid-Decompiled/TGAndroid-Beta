package e8;

import a5.n;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.t2;
import java.nio.ByteBuffer;
import java.util.HashSet;
import y5.l;

public final class c extends b8.a {

    public final b8.c f5354b;

    public final t2 f5355c;
    public final Object d;

    public boolean f5356e;

    public c(t2 t2Var) {
        super(0);
        this.f5354b = new b8.c();
        this.d = new Object();
        this.f5356e = true;
        this.f5355c = t2Var;
    }

    @Override
    public final void N() {
        super.N();
        synchronized (this.d) {
            try {
                if (this.f5356e) {
                    this.f5355c.l();
                    this.f5356e = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final SparseArray Q(n nVar) {
        ByteBuffer byteBufferQ;
        a[] aVarArrN;
        Bitmap bitmap = (Bitmap) nVar.d;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            byteBufferQ = ByteBuffer.allocateDirect(((((height + 1) / 2) * ((width + 1) / 2)) << 1) + i10);
            int i11 = i10;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = i12 % width;
                int i14 = i12 / width;
                int pixel = bitmap.getPixel(i13, i14);
                float fRed = Color.red(pixel);
                float fGreen = Color.green(pixel);
                float fBlue = Color.blue(pixel);
                byteBufferQ.put(i12, (byte) ((0.114f * fBlue) + (0.587f * fGreen) + (0.299f * fRed)));
                if (i14 % 2 == 0 && i13 % 2 == 0) {
                    float fD = com.google.android.recaptcha.internal.a.d(fBlue, 0.5f, ((-0.331f) * fGreen) + ((-0.169f) * fRed), 128.0f);
                    float fD2 = com.google.android.recaptcha.internal.a.d(fBlue, -0.081f, (fGreen * (-0.419f)) + (fRed * 0.5f), 128.0f);
                    int i15 = i11 + 1;
                    byteBufferQ.put(i11, (byte) fD);
                    i11 += 2;
                    byteBufferQ.put(i15, (byte) fD2);
                }
            }
        } else {
            byteBufferQ = nVar.q();
        }
        synchronized (this.d) {
            if (!this.f5356e) {
                throw new IllegalStateException("Cannot use detector after release()");
            }
            t2 t2Var = this.f5355c;
            l.h(byteBufferQ);
            aVarArrN = t2Var.n(byteBufferQ, f3.b(nVar));
        }
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = new SparseArray(aVarArrN.length);
        int iMax = 0;
        for (a aVar : aVarArrN) {
            int i16 = aVar.f5348a;
            iMax = Math.max(iMax, i16);
            if (hashSet.contains(Integer.valueOf(i16))) {
                i16 = iMax + 1;
                iMax = i16;
            }
            hashSet.add(Integer.valueOf(i16));
            sparseArray.append(this.f5354b.a(i16), aVar);
        }
        return sparseArray;
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this.d) {
                try {
                    if (this.f5356e) {
                        Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                        N();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }
}
