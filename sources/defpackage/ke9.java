package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ke9 implements ag9 {
    public final iy6 a;
    public final lk0 b;
    public final ye9 c;

    public ke9(ye9 ye9Var, iy6 iy6Var, lk0 lk0Var) {
        this.c = ye9Var;
        this.a = iy6Var;
        this.b = lk0Var;
    }

    @Override
    public final void a() {
        iy6 iy6Var = this.a;
        iy6Var.a = (byte) 3;
        ye9 ye9Var = this.c;
        ye9Var.h4.remove(iy6Var);
        ArrayList arrayList = ye9Var.t3;
        int indexOf = arrayList.indexOf(this.b);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            ye9Var.g3.O(true);
        }
        ye9Var.p3.onContentChanged();
    }

    @Override
    public final void f(TLRPC.Document document) {
        iy6 iy6Var = this.a;
        iy6Var.h = document;
        iy6Var.i = document;
        iy6Var.a = (byte) 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        ye9 ye9Var = this.c;
        ye9Var.h4.remove(iy6Var);
        ye9Var.g3.O(false);
        ye9Var.p3.onContentChanged();
    }

    @Override
    public final void g(float f) {
        this.a.f = f;
        lk0 lk0Var = this.b;
        ye9 ye9Var = this.c;
        View C1 = ye9Var.C1(lk0Var);
        if (C1 instanceof ib9) {
            ((ib9) C1).o(false);
            C1.invalidate();
        }
        ye9Var.p3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Photo photo) {
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void b(int i, int i2) {
    }
}
