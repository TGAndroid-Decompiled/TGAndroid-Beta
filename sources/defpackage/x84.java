package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class x84 {
    public static x84 e;
    public boolean a = false;
    public boolean b = true;
    public boolean c = false;
    public Object d;

    public x84(Context context) {
        this.d = context;
    }

    public static x84 c() {
        x84 x84Var = e;
        if (x84Var == null) {
            ?? obj = new Object();
            e = obj;
            return obj;
        }
        return x84Var;
    }

    public final y84 a() {
        boolean z;
        ?? obj = new Object();
        boolean z2 = this.c;
        obj.a = z2 ? 1 : 0;
        boolean z3 = this.a;
        obj.b = z3 ? 1 : 0;
        boolean z4 = false;
        obj.c = 0;
        obj.d = false;
        obj.e = this.b;
        obj.f = -1.0f;
        if (!z2 && z3) {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z = false;
        } else {
            z = true;
        }
        if (obj.b == 2 && obj.c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z4 = z;
        }
        if (z4) {
            return new y84(new ldd((Context) this.d, (v0e) obj));
        }
        u36.j("Invalid build options");
        return null;
    }

    public final ivc b(String str) {
        d();
        ivc ivcVar = (ivc) ((HashMap) this.d).get(str);
        if (ivcVar == null) {
            return null;
        }
        ivcVar.a = Math.max(ivcVar.a, System.currentTimeMillis());
        e();
        return ivcVar;
    }

    public final void d() {
        if (!this.a && !this.b) {
            this.b = true;
            if (((HashMap) this.d) == null) {
                this.d = new HashMap();
            }
            Utilities.e.c(new fvc(this, (byte) 1));
        }
    }

    public final void e() {
        gm.r(new fvc(this, (byte) 0));
        if (this.c) {
            return;
        }
        fvc fvcVar = new fvc(this, (byte) 0);
        boolean z = e21.a;
        gm.d3(fvcVar, 1000L);
    }

    public final void f(int i) {
        if (i != 0 && i != 1 && i != 2) {
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid landmark type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.a = i;
    }

    public final void g(int i) {
        if (i != 0 && i != 1 && i != 2) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid mode: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.c = i;
    }
}
