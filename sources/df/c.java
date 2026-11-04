package df;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.vision.t2;
import java.util.ArrayList;
import org.telegram.ui.Components.y00;
public final class c {
    public int f8843a;
    public boolean f8844b;
    public int f8845c;
    public final Object d;

    public c(Context context) {
        this.f8843a = 0;
        this.f8844b = true;
        this.f8845c = 0;
        this.d = context;
    }

    public v8.b a() {
        boolean z10;
        ?? obj = new Object();
        int i3 = this.f8845c;
        obj.f57414a = i3;
        int i10 = this.f8843a;
        obj.f57415b = i10;
        boolean z11 = false;
        obj.f57416c = 0;
        obj.d = false;
        obj.f57417e = this.f8844b;
        obj.f57418f = -1.0f;
        if (i3 != 2 && i10 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f57415b == 2 && obj.f57416c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z11 = z10;
        }
        if (z11) {
            return new v8.b(new t2((Context) this.d, (w8.c) obj));
        }
        throw new IllegalArgumentException("Invalid build options");
    }

    public void b(int i3) {
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            StringBuilder sb2 = new StringBuilder(34);
            sb2.append("Invalid landmark type: ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f8843a = i3;
    }

    public void c(int i3) {
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f8845c = i3;
    }

    public c(jf.a... aVarArr) {
        this.f8843a = -1;
        this.f8845c = -1;
        this.f8844b = false;
        this.d = aVarArr;
    }

    public c(View view, ArrayList arrayList, yh.j jVar) {
        this.d = new y00(view.getContext(), new yh.i(this, view, arrayList, jVar));
    }
}
