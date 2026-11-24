package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
public final class ppd extends dp4 implements c36 {
    public static final WeakHashMap m0 = new WeakHashMap();
    public final dd8 l0 = new dd8();

    @Override
    public final void A() {
        this.V = true;
        dd8 dd8Var = this.l0;
        dd8Var.a = (byte) 5;
        for (y26 y26Var : ((Map) dd8Var.b).values()) {
            y26Var.onDestroy();
        }
    }

    @Override
    public final void F() {
        this.V = true;
        dd8 dd8Var = this.l0;
        dd8Var.a = (byte) 3;
        for (y26 y26Var : ((Map) dd8Var.b).values()) {
            y26Var.onResume();
        }
    }

    @Override
    public final void G(Bundle bundle) {
        this.l0.c(bundle);
    }

    @Override
    public final void H() {
        this.V = true;
        dd8 dd8Var = this.l0;
        dd8Var.a = (byte) 2;
        for (y26 y26Var : ((Map) dd8Var.b).values()) {
            y26Var.onStart();
        }
    }

    @Override
    public final void I() {
        this.V = true;
        dd8 dd8Var = this.l0;
        dd8Var.a = (byte) 4;
        for (y26 y26Var : ((Map) dd8Var.b).values()) {
            y26Var.onStop();
        }
    }

    @Override
    public final void a(String str, y26 y26Var) {
        this.l0.a(str, y26Var);
    }

    @Override
    public final y26 b(Class cls, String str) {
        return (y26) cls.cast(((Map) this.l0.b).get(str));
    }

    @Override
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        for (y26 y26Var : ((Map) this.l0.b).values()) {
            y26Var.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    public final void x(int i, int i2, Intent intent) {
        super.x(i, i2, intent);
        for (y26 y26Var : ((Map) this.l0.b).values()) {
            y26Var.onActivityResult(i, i2, intent);
        }
    }

    @Override
    public final void z(Bundle bundle) {
        super.z(bundle);
        this.l0.b(bundle);
    }
}
