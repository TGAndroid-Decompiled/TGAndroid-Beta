package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class d48 implements s58 {
    public final byte a;
    public final HashMap b;
    public final ArrayList c;
    public final g48 d;

    public d48(g48 g48Var, HashMap hashMap, ArrayList arrayList, byte b) {
        this.a = b;
        this.d = g48Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override
    public final boolean c() {
        byte b = this.a;
        return true;
    }

    @Override
    public final void e() {
        byte b = this.a;
    }

    @Override
    public final void j(Editable editable) {
        byte b = this.a;
        g48 g48Var = this.d;
        switch (b) {
            case 0:
                rt3 rt3Var = g48Var.N;
                g48Var.a = editable;
                rt3Var.setText(editable);
                return;
            default:
                rt3 rt3Var2 = g48Var.N;
                g48Var.a = editable;
                rt3Var2.setText(editable);
                return;
        }
    }

    @Override
    public final void k() {
        byte b = this.a;
    }

    @Override
    public final void l(int i, boolean z, boolean z2) {
        byte b = this.a;
        ArrayList arrayList = this.c;
        HashMap hashMap = this.b;
        g48 g48Var = this.d;
        switch (b) {
            case 0:
                g48Var.removeSelfFromStack();
                if (!z) {
                    g48Var.Z(hashMap, arrayList, z2, i);
                    return;
                }
                return;
            default:
                g48Var.removeSelfFromStack();
                if (!z) {
                    g48Var.Z(hashMap, arrayList, z2, i);
                    return;
                }
                return;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void d() {
    }

    private final void f() {
    }
}
