package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
public final class dsd extends gp4 implements g36 {
    public static final WeakHashMap m0 = new WeakHashMap();
    public final pe8 l0 = new pe8();

    @Override
    public final void A() {
        this.V = true;
        pe8 pe8Var = this.l0;
        pe8Var.a = (byte) 5;
        for (c36 c36Var : ((Map) pe8Var.b).values()) {
            c36Var.onDestroy();
        }
    }

    @Override
    public final void F() {
        this.V = true;
        pe8 pe8Var = this.l0;
        pe8Var.a = (byte) 3;
        for (c36 c36Var : ((Map) pe8Var.b).values()) {
            c36Var.onResume();
        }
    }

    @Override
    public final void G(Bundle bundle) {
        this.l0.c(bundle);
    }

    @Override
    public final void H() {
        this.V = true;
        pe8 pe8Var = this.l0;
        pe8Var.a = (byte) 2;
        for (c36 c36Var : ((Map) pe8Var.b).values()) {
            c36Var.onStart();
        }
    }

    @Override
    public final void I() {
        this.V = true;
        pe8 pe8Var = this.l0;
        pe8Var.a = (byte) 4;
        for (c36 c36Var : ((Map) pe8Var.b).values()) {
            c36Var.onStop();
        }
    }

    @Override
    public final void a(String str, c36 c36Var) {
        this.l0.a(str, c36Var);
    }

    @Override
    public final c36 b(Class cls, String str) {
        return (c36) cls.cast(((Map) this.l0.b).get(str));
    }

    @Override
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        for (c36 c36Var : ((Map) this.l0.b).values()) {
            c36Var.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    public final void x(int i, int i2, Intent intent) {
        super.x(i, i2, intent);
        for (c36 c36Var : ((Map) this.l0.b).values()) {
            c36Var.onActivityResult(i, i2, intent);
        }
    }

    @Override
    public final void z(Bundle bundle) {
        super.z(bundle);
        this.l0.b(bundle);
    }
}
