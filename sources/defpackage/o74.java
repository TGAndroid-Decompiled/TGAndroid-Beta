package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
public final class o74 {
    public static o74 e;
    public boolean a = false;
    public boolean b = true;
    public boolean c = false;
    public Object d;

    public o74(Context context) {
        this.d = context;
    }

    public static o74 c() {
        o74 o74Var = e;
        if (o74Var == null) {
            ?? obj = new Object();
            e = obj;
            return obj;
        }
        return o74Var;
    }

    public final p74 a() {
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
            return new p74(new jbd((Context) this.d, (syd) obj));
        }
        w26.j("Invalid build options");
        return null;
    }

    public final htc b(String str) {
        d();
        htc htcVar = (htc) ((HashMap) this.d).get(str);
        if (htcVar == null) {
            return null;
        }
        htcVar.a = Math.max(htcVar.a, System.currentTimeMillis());
        e();
        return htcVar;
    }

    public final void d() {
        if (!this.a && !this.b) {
            this.b = true;
            if (((HashMap) this.d) == null) {
                this.d = new HashMap();
            }
            Utilities.e.c(new etc(this, (byte) 1));
        }
    }

    public final void e() {
        gl.r(new etc(this, (byte) 0));
        if (this.c) {
            return;
        }
        etc etcVar = new etc(this, (byte) 0);
        boolean z = w01.a;
        gl.d3(etcVar, 1000L);
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
