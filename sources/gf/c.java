package gf;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.vision.t2;
import java.util.ArrayList;
import org.telegram.ui.Components.uy;
public final class c {
    public int f13873a;
    public boolean f13874b;
    public int f13875c;
    public final Object d;

    public c(Context context) {
        this.f13873a = 0;
        this.f13874b = true;
        this.f13875c = 0;
        this.d = context;
    }

    public w8.b a() {
        boolean z9;
        ?? obj = new Object();
        int i7 = this.f13875c;
        obj.f58664a = i7;
        int i10 = this.f13873a;
        obj.f58665b = i10;
        boolean z10 = false;
        obj.f58666c = 0;
        obj.d = false;
        obj.f58667e = this.f13874b;
        obj.f58668f = -1.0f;
        if (i7 != 2 && i10 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z9 = false;
        } else {
            z9 = true;
        }
        if (obj.f58665b == 2 && obj.f58666c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z10 = z9;
        }
        if (z10) {
            return new w8.b(new t2((Context) this.d, (x8.b) obj));
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
        this.f13873a = i7;
    }

    public void c(int i7) {
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i7);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f13875c = i7;
    }

    public c(mf.a... aVarArr) {
        this.f13873a = -1;
        this.f13875c = -1;
        this.f13874b = false;
        this.d = aVarArr;
    }

    public c(View view, ArrayList arrayList, xh.j jVar) {
        this.d = new uy(view.getContext(), new xh.i(this, view, arrayList, jVar));
    }
}
