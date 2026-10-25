package bf;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.t2;
public final class c {
    public int f3904a;
    public boolean f3905b;
    public int f3906c;
    public final Object d;

    public c(Context context) {
        this.f3904a = 0;
        this.f3905b = true;
        this.f3906c = 0;
        this.d = context;
    }

    public u8.b a() {
        boolean z10;
        ?? obj = new Object();
        int i10 = this.f3906c;
        obj.f50089a = i10;
        int i11 = this.f3904a;
        obj.f50090b = i11;
        boolean z11 = false;
        obj.f50091c = 0;
        obj.d = false;
        obj.e = this.f3905b;
        obj.f50092f = -1.0f;
        if (i10 != 2 && i11 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f50090b == 2 && obj.f50091c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z11 = z10;
        }
        if (z11) {
            return new u8.b(new t2((Context) this.d, (v8.b) obj));
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
        this.f3904a = i10;
    }

    public void c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f3906c = i10;
    }

    public c(gf.a... aVarArr) {
        this.f3904a = -1;
        this.f3906c = -1;
        this.f3905b = false;
        this.d = aVarArr;
    }
}
