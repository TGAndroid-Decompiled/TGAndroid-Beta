package nh;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.vision.t2;
import java.util.ArrayList;
import m2.t;
public final class n {
    public int f13882a;
    public int f13883b;
    public boolean f13884c;
    public final Object d;

    public n(Context context) {
        this.f13882a = 0;
        this.f13884c = true;
        this.f13883b = 0;
        this.d = context;
    }

    public t8.b a() {
        boolean z10;
        ?? obj = new Object();
        int i10 = this.f13883b;
        obj.f50199a = i10;
        int i11 = this.f13882a;
        obj.f50200b = i11;
        boolean z11 = false;
        obj.f50201c = 0;
        obj.d = false;
        obj.e = this.f13884c;
        obj.f50202f = -1.0f;
        if (i10 != 2 && i11 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f50200b == 2 && obj.f50201c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z11 = z10;
        }
        if (z11) {
            return new t8.b(new t2((Context) this.d, (u8.b) obj));
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
        this.f13882a = i10;
    }

    public void c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f13883b = i10;
    }

    public n(xe.a... aVarArr) {
        this.f13882a = -1;
        this.f13883b = -1;
        this.f13884c = false;
        this.d = aVarArr;
    }

    public n(View view, ArrayList arrayList, m mVar) {
        this.d = new t(view.getContext(), new l(this, view, arrayList, mVar));
    }
}
