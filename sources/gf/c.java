package gf;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.vision.t2;
import java.util.ArrayList;
import org.telegram.ui.Components.vy;
public final class c {
    public int f13871a;
    public boolean f13872b;
    public int f13873c;
    public final Object d;

    public c(Context context) {
        this.f13871a = 0;
        this.f13872b = true;
        this.f13873c = 0;
        this.d = context;
    }

    public w8.b a() {
        boolean z9;
        ?? obj = new Object();
        int i7 = this.f13873c;
        obj.f58657a = i7;
        int i10 = this.f13871a;
        obj.f58658b = i10;
        boolean z10 = false;
        obj.f58659c = 0;
        obj.d = false;
        obj.f58660e = this.f13872b;
        obj.f58661f = -1.0f;
        if (i7 != 2 && i10 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z9 = false;
        } else {
            z9 = true;
        }
        if (obj.f58658b == 2 && obj.f58659c == 1) {
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
        this.f13871a = i7;
    }

    public void c(int i7) {
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i7);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f13873c = i7;
    }

    public c(mf.a... aVarArr) {
        this.f13871a = -1;
        this.f13873c = -1;
        this.f13872b = false;
        this.d = aVarArr;
    }

    public c(View view, ArrayList arrayList, xh.j jVar) {
        this.d = new vy(view.getContext(), new xh.i(this, view, arrayList, jVar));
    }
}
