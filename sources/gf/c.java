package gf;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.vision.u2;
import java.util.ArrayList;
import org.telegram.ui.Components.hn;
public final class c {
    public int f13527a;
    public boolean f13528b;
    public int f13529c;
    public final Object d;

    public c(Context context) {
        this.f13527a = 0;
        this.f13528b = true;
        this.f13529c = 0;
        this.d = context;
    }

    public w8.b a() {
        boolean z10;
        ?? obj = new Object();
        int i7 = this.f13529c;
        obj.f60418a = i7;
        int i10 = this.f13527a;
        obj.f60419b = i10;
        boolean z11 = false;
        obj.f60420c = 0;
        obj.d = false;
        obj.f60421e = this.f13528b;
        obj.f60422f = -1.0f;
        if (i7 != 2 && i10 == 2) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        } else {
            z10 = true;
        }
        if (obj.f60419b == 2 && obj.f60420c == 1) {
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
        this.f13527a = i7;
    }

    public void c(int i7) {
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Invalid mode: ");
            sb2.append(i7);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.f13529c = i7;
    }

    public c(mf.a... aVarArr) {
        this.f13527a = -1;
        this.f13529c = -1;
        this.f13528b = false;
        this.d = aVarArr;
    }

    public c(View view, ArrayList arrayList, xh.j jVar) {
        this.d = new hn(view.getContext(), new xh.i(this, view, arrayList, jVar));
    }
}
