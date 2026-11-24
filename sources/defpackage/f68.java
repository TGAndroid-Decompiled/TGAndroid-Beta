package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class f68 implements u78 {
    public final byte a;
    public final HashMap b;
    public final ArrayList c;
    public final j68 d;

    public f68(j68 j68Var, HashMap hashMap, ArrayList arrayList, byte b) {
        this.a = b;
        this.d = j68Var;
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
    public final void i(Editable editable) {
        byte b = this.a;
        j68 j68Var = this.d;
        switch (b) {
            case 0:
                cv3 cv3Var = j68Var.N;
                j68Var.a = editable;
                cv3Var.setText(editable);
                return;
            default:
                cv3 cv3Var2 = j68Var.N;
                j68Var.a = editable;
                cv3Var2.setText(editable);
                return;
        }
    }

    @Override
    public final void j() {
        byte b = this.a;
    }

    @Override
    public final void k(int i, boolean z, boolean z2) {
        byte b = this.a;
        ArrayList arrayList = this.c;
        HashMap hashMap = this.b;
        j68 j68Var = this.d;
        switch (b) {
            case 0:
                j68Var.removeSelfFromStack();
                if (!z) {
                    j68Var.a0(hashMap, arrayList, z2, i);
                    return;
                }
                return;
            default:
                j68Var.removeSelfFromStack();
                if (!z) {
                    j68Var.a0(hashMap, arrayList, z2, i);
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
