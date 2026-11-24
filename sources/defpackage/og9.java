package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class og9 implements ei9 {
    public final i07 a;
    public final ll0 b;
    public final ch9 c;

    public og9(ch9 ch9Var, i07 i07Var, ll0 ll0Var) {
        this.c = ch9Var;
        this.a = i07Var;
        this.b = ll0Var;
    }

    @Override
    public final void a() {
        i07 i07Var = this.a;
        i07Var.a = (byte) 3;
        ch9 ch9Var = this.c;
        ch9Var.h4.remove(i07Var);
        ArrayList arrayList = ch9Var.t3;
        int indexOf = arrayList.indexOf(this.b);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            ch9Var.g3.O(true);
        }
        ch9Var.p3.onContentChanged();
    }

    @Override
    public final void f(TLRPC.Document document) {
        i07 i07Var = this.a;
        i07Var.h = document;
        i07Var.i = document;
        i07Var.a = (byte) 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.id;
        }
        ch9 ch9Var = this.c;
        ch9Var.h4.remove(i07Var);
        ch9Var.g3.O(false);
        ch9Var.p3.onContentChanged();
    }

    @Override
    public final void g(float f) {
        this.a.f = f;
        ll0 ll0Var = this.b;
        ch9 ch9Var = this.c;
        View C1 = ch9Var.C1(ll0Var);
        if (C1 instanceof id9) {
            ((id9) C1).o(false);
            C1.invalidate();
        }
        ch9Var.p3.onContentChanged();
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
