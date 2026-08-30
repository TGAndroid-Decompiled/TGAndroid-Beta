package h8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.t2;
public final class b {
    public int f7041a;
    public int f7042b;
    public boolean f7043c;
    public final Object d;

    public b(Context context) {
        this.f7041a = 0;
        this.f7043c = true;
        this.f7042b = 0;
        this.d = context;
    }

    public c a() {
        boolean z4;
        ?? obj = new Object();
        int i10 = this.f7042b;
        obj.f7364a = i10;
        int i11 = this.f7041a;
        obj.f7365b = i11;
        boolean z10 = false;
        obj.f7366c = 0;
        obj.d = false;
        obj.e = this.f7043c;
        obj.f7367f = -1.0f;
        if (i10 != 2 && i11 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z4 = false;
        } else {
            z4 = true;
        }
        if (obj.f7365b == 2 && obj.f7366c == 1) {
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
        this.f7041a = i10;
    }

    public void c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid mode: ");
            sb.append(i10);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f7042b = i10;
    }

    public b(pe.a... aVarArr) {
        this.f7041a = -1;
        this.f7042b = -1;
        this.f7043c = false;
        this.d = aVarArr;
    }
}
