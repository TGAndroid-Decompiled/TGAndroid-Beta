package h8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.t2;
public final class b {
    public int f7028a;
    public int f7029b;
    public boolean f7030c;
    public final Object d;

    public b(Context context) {
        this.f7028a = 0;
        this.f7030c = true;
        this.f7029b = 0;
        this.d = context;
    }

    public c a() {
        boolean z4;
        ?? obj = new Object();
        int i10 = this.f7029b;
        obj.f7346a = i10;
        int i11 = this.f7028a;
        obj.f7347b = i11;
        boolean z10 = false;
        obj.f7348c = 0;
        obj.d = false;
        obj.e = this.f7030c;
        obj.f7349f = -1.0f;
        if (i10 != 2 && i11 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z4 = false;
        } else {
            z4 = true;
        }
        if (obj.f7347b == 2 && obj.f7348c == 1) {
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
        this.f7028a = i10;
    }

    public void c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid mode: ");
            sb.append(i10);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f7029b = i10;
    }

    public b(pe.a... aVarArr) {
        this.f7028a = -1;
        this.f7029b = -1;
        this.f7030c = false;
        this.d = aVarArr;
    }
}
