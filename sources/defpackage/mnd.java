package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
public final class mnd extends bn4 implements c16 {
    public static final WeakHashMap m0 = new WeakHashMap();
    public final ab8 l0 = new ab8();

    @Override
    public final void A() {
        this.V = true;
        ab8 ab8Var = this.l0;
        ab8Var.a = (byte) 5;
        for (y06 y06Var : ((Map) ab8Var.b).values()) {
            y06Var.onDestroy();
        }
    }

    @Override
    public final void F() {
        this.V = true;
        ab8 ab8Var = this.l0;
        ab8Var.a = (byte) 3;
        for (y06 y06Var : ((Map) ab8Var.b).values()) {
            y06Var.onResume();
        }
    }

    @Override
    public final void G(Bundle bundle) {
        this.l0.c(bundle);
    }

    @Override
    public final void H() {
        this.V = true;
        ab8 ab8Var = this.l0;
        ab8Var.a = (byte) 2;
        for (y06 y06Var : ((Map) ab8Var.b).values()) {
            y06Var.onStart();
        }
    }

    @Override
    public final void I() {
        this.V = true;
        ab8 ab8Var = this.l0;
        ab8Var.a = (byte) 4;
        for (y06 y06Var : ((Map) ab8Var.b).values()) {
            y06Var.onStop();
        }
    }

    @Override
    public final void a(String str, y06 y06Var) {
        this.l0.a(str, y06Var);
    }

    @Override
    public final y06 b(Class cls, String str) {
        return (y06) cls.cast(((Map) this.l0.b).get(str));
    }

    @Override
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        for (y06 y06Var : ((Map) this.l0.b).values()) {
            y06Var.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    public final void x(int i, int i2, Intent intent) {
        super.x(i, i2, intent);
        for (y06 y06Var : ((Map) this.l0.b).values()) {
            y06Var.onActivityResult(i, i2, intent);
        }
    }

    @Override
    public final void z(Bundle bundle) {
        super.z(bundle);
        this.l0.b(bundle);
    }
}
