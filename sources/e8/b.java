package e8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.t2;

public final class b {

    public int f5351a;

    public int f5352b;

    public boolean f5353c;
    public final Object d;

    public b(Context context) {
        this.f5351a = 0;
        this.f5353c = true;
        this.f5352b = 0;
        this.d = context;
    }

    public c a() {
        boolean z10;
        f8.b bVar = new f8.b();
        int i10 = this.f5352b;
        bVar.f5909a = i10;
        int i11 = this.f5351a;
        bVar.f5910b = i11;
        boolean z11 = false;
        bVar.f5911c = 0;
        bVar.d = false;
        bVar.f5912e = this.f5353c;
        bVar.f5913f = -1.0f;
        if (i10 == 2 || i11 != 2) {
            z10 = true;
        } else {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        }
        if (bVar.f5910b == 2 && bVar.f5911c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z11 = z10;
        }
        if (z11) {
            return new c(new t2((Context) this.d, bVar));
        }
        throw new IllegalArgumentException("Invalid build options");
    }

    public void b(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            this.f5351a = i10;
            return;
        }
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("Invalid landmark type: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public void c(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            this.f5352b = i10;
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("Invalid mode: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public b(le.a... aVarArr) {
        this.f5351a = -1;
        this.f5352b = -1;
        this.f5353c = false;
        this.d = aVarArr;
    }
}
