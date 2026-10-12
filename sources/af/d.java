package af;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.t2;
public final class d {
    public int f550a;
    public boolean f551b;
    public int f552c;
    public final Object d;

    public d(Context context) {
        this.f550a = 0;
        this.f551b = true;
        this.f552c = 0;
        this.d = context;
    }

    public t8.c a() {
        boolean z10;
        ?? obj = new Object();
        int i10 = this.f552c;
        obj.f46227a = i10;
        int i11 = this.f550a;
        obj.f46228b = i11;
        boolean z11 = false;
        obj.f46229c = 0;
        obj.d = false;
        obj.e = this.f551b;
        obj.f46230f = -1.0f;
        if (i10 != 2 && i11 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f46228b == 2 && obj.f46229c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z11 = z10;
        }
        if (z11) {
            return new t8.c(new t2((Context) this.d, (u8.b) obj));
        }
        throw new IllegalArgumentException("Invalid build options");
    }

    public void b(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb2 = new StringBuilder(34);
            sb2.append("Invalid landmark type: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f550a = i10;
    }

    public void c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f552c = i10;
    }

    public d(ff.a... aVarArr) {
        this.f550a = -1;
        this.f552c = -1;
        this.f551b = false;
        this.d = aVarArr;
    }
}
