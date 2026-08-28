package d8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.t2;
public final class b {
    public int f4454a;
    public int f4455b;
    public boolean f4456c;
    public final Object d;

    public b(Context context) {
        this.f4454a = 0;
        this.f4456c = true;
        this.f4455b = 0;
        this.d = context;
    }

    public c a() {
        boolean z10;
        ?? obj = new Object();
        int i9 = this.f4455b;
        obj.f4980a = i9;
        int i10 = this.f4454a;
        obj.f4981b = i10;
        boolean z11 = false;
        obj.f4982c = 0;
        obj.d = false;
        obj.f4983e = this.f4456c;
        obj.f4984f = -1.0f;
        if (i9 != 2 && i10 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f4981b == 2 && obj.f4982c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z11 = z10;
        }
        if (z11) {
            return new c(new t2((Context) this.d, (e8.b) obj));
        }
        throw new IllegalArgumentException("Invalid build options");
    }

    public void b(int i9) {
        if (i9 != 0 && i9 != 1 && i9 != 2) {
            StringBuilder sb2 = new StringBuilder(34);
            sb2.append("Invalid landmark type: ");
            sb2.append(i9);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f4454a = i9;
    }

    public void c(int i9) {
        if (i9 != 0 && i9 != 1 && i9 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i9);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f4455b = i9;
    }

    public b(ke.a... aVarArr) {
        this.f4454a = -1;
        this.f4455b = -1;
        this.f4456c = false;
        this.d = aVarArr;
    }
}
