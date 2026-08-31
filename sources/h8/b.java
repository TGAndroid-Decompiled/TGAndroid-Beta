package h8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.t2;
public final class b {
    public int f7354a;
    public int f7355b;
    public boolean f7356c;
    public final Object d;

    public b(Context context) {
        this.f7354a = 0;
        this.f7356c = true;
        this.f7355b = 0;
        this.d = context;
    }

    public c a() {
        boolean z4;
        ?? obj = new Object();
        int i10 = this.f7355b;
        obj.f7925a = i10;
        int i11 = this.f7354a;
        obj.f7926b = i11;
        boolean z10 = false;
        obj.f7927c = 0;
        obj.d = false;
        obj.f7928e = this.f7356c;
        obj.f7929f = -1.0f;
        if (i10 != 2 && i11 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z4 = false;
        } else {
            z4 = true;
        }
        if (obj.f7926b == 2 && obj.f7927c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z10 = z4;
        }
        if (z10) {
            return new c(new t2((Context) this.d, (i8.b) obj));
        }
        throw new IllegalArgumentException("Invalid build options");
    }

    public void b(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid landmark type: ");
            sb.append(i10);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f7354a = i10;
    }

    public void c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid mode: ");
            sb.append(i10);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f7355b = i10;
    }

    public b(pe.a... aVarArr) {
        this.f7354a = -1;
        this.f7355b = -1;
        this.f7356c = false;
        this.d = aVarArr;
    }
}
