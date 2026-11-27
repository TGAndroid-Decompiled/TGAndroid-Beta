package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
public final class t78 implements j98 {
    public final byte a;
    public final HashMap b;
    public final ArrayList c;
    public final w78 d;

    public t78(w78 w78Var, HashMap hashMap, ArrayList arrayList, byte b) {
        this.a = b;
        this.d = w78Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override
    public final void C(int i, boolean z, boolean z2) {
        byte b = this.a;
        ArrayList arrayList = this.c;
        HashMap hashMap = this.b;
        w78 w78Var = this.d;
        switch (b) {
            case 0:
                w78Var.removeSelfFromStack();
                if (!z) {
                    w78Var.Z(hashMap, arrayList, z2, i);
                    return;
                }
                return;
            default:
                w78Var.removeSelfFromStack();
                if (!z) {
                    w78Var.Z(hashMap, arrayList, z2, i);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean f() {
        byte b = this.a;
        return true;
    }

    @Override
    public final void h() {
        byte b = this.a;
    }

    @Override
    public final void l(Editable editable) {
        byte b = this.a;
        w78 w78Var = this.d;
        switch (b) {
            case 0:
                iu3 iu3Var = w78Var.N;
                w78Var.a = editable;
                iu3Var.setText(editable);
                return;
            default:
                iu3 iu3Var2 = w78Var.N;
                w78Var.a = editable;
                iu3Var2.setText(editable);
                return;
        }
    }

    @Override
    public final void y() {
        byte b = this.a;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
