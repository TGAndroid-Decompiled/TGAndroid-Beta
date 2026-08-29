package f8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.t2;
public final class b {
    public int f6687a;
    public int f6688b;
    public boolean f6689c;
    public final Object d;

    public b(Context context) {
        this.f6687a = 0;
        this.f6689c = true;
        this.f6688b = 0;
        this.d = context;
    }

    public c a() {
        boolean z10;
        ?? obj = new Object();
        int i10 = this.f6688b;
        obj.f7133a = i10;
        int i11 = this.f6687a;
        obj.f7134b = i11;
        boolean z11 = false;
        obj.f7135c = 0;
        obj.d = false;
        obj.f7136e = this.f6689c;
        obj.f7137f = -1.0f;
        if (i10 != 2 && i11 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f7134b == 2 && obj.f7135c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z11 = z10;
        }
        if (z11) {
            return new c(new t2((Context) this.d, (g8.c) obj));
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
        this.f6687a = i10;
    }

    public void c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f6688b = i10;
    }

    public b(ne.a... aVarArr) {
        this.f6687a = -1;
        this.f6688b = -1;
        this.f6689c = false;
        this.d = aVarArr;
    }
}
