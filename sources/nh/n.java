package nh;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.vision.t2;
import java.util.ArrayList;
import m2.t;
public final class n {
    public int f13881a;
    public int f13882b;
    public boolean f13883c;
    public final Object d;

    public n(Context context) {
        this.f13881a = 0;
        this.f13883c = true;
        this.f13882b = 0;
        this.d = context;
    }

    public t8.b a() {
        boolean z10;
        ?? obj = new Object();
        int i10 = this.f13882b;
        obj.f50185a = i10;
        int i11 = this.f13881a;
        obj.f50186b = i11;
        boolean z11 = false;
        obj.f50187c = 0;
        obj.d = false;
        obj.e = this.f13883c;
        obj.f50188f = -1.0f;
        if (i10 != 2 && i11 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f50186b == 2 && obj.f50187c == 1) {
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
        this.f13881a = i10;
    }

    public void c(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f13882b = i10;
    }

    public n(xe.a... aVarArr) {
        this.f13881a = -1;
        this.f13882b = -1;
        this.f13883c = false;
        this.d = aVarArr;
    }

    public n(View view, ArrayList arrayList, m mVar) {
        this.d = new t(view.getContext(), new l(this, view, arrayList, mVar));
    }
}
