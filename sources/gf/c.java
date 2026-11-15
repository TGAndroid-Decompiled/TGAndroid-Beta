package gf;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.vision.u2;
import java.util.ArrayList;
import org.telegram.messenger.ou;
public final class c {
    public int f13215a;
    public boolean f13216b;
    public int f13217c;
    public final Object d;

    public c(Context context) {
        this.f13215a = 0;
        this.f13216b = true;
        this.f13217c = 0;
        this.d = context;
    }

    public w8.b a() {
        boolean z10;
        ?? obj = new Object();
        int i7 = this.f13217c;
        obj.f59847a = i7;
        int i10 = this.f13215a;
        obj.f59848b = i10;
        boolean z11 = false;
        obj.f59849c = 0;
        obj.d = false;
        obj.f59850e = this.f13216b;
        obj.f59851f = -1.0f;
        if (i7 != 2 && i10 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f59848b == 2 && obj.f59849c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z11 = z10;
        }
        if (z11) {
            return new w8.b(new u2((Context) this.d, (x8.b) obj));
        }
        throw new IllegalArgumentException("Invalid build options");
    }

    public void b(int i7) {
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            StringBuilder sb2 = new StringBuilder(34);
            sb2.append("Invalid landmark type: ");
            sb2.append(i7);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f13215a = i7;
    }

    public void c(int i7) {
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i7);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f13217c = i7;
    }

    public c(mf.a... aVarArr) {
        this.f13215a = -1;
        this.f13217c = -1;
        this.f13216b = false;
        this.d = aVarArr;
    }

    public c(View view, ArrayList arrayList, xh.j jVar) {
        this.d = new ou(view.getContext(), new xh.i(this, view, arrayList, jVar));
    }
}
