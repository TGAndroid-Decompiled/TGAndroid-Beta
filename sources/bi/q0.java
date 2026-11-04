package bi;

import android.content.Context;
import lg.u1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.tl0;
public final class q0 implements Runnable {
    public final int f3826a;
    public final Object f3827b;
    public final int f3828c;
    public final Object d;
    public final Object f3829e;

    public q0(int i3, Object obj, Object obj2, Object obj3, int i10) {
        this.f3826a = i10;
        this.f3828c = i3;
        this.f3827b = obj;
        this.d = obj2;
        this.f3829e = obj3;
    }

    private final void a() {
        Context context = ((tl0) this.f3827b).getContext();
        TLRPC.Reaction g7 = ((ql0) this.d).f37490a.g();
        tl0.c(context, this.f3828c, g7, (e6) this.f3829e);
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: bi.q0.b():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.q0.run():void");
    }

    public q0(Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.f3826a = i10;
        this.f3827b = obj;
        this.f3828c = i3;
        this.d = obj2;
        this.f3829e = obj3;
    }

    public q0(Object obj, int i3, Object obj2, String str, int i10) {
        this.f3826a = i10;
        this.f3827b = obj;
        this.f3828c = i3;
        this.f3829e = obj2;
        this.d = str;
    }

    public q0(Object obj, Object obj2, int i3, Object obj3, int i10) {
        this.f3826a = i10;
        this.f3827b = obj;
        this.d = obj2;
        this.f3828c = i3;
        this.f3829e = obj3;
    }

    public q0(Object obj, Object obj2, Object obj3, int i3, int i10) {
        this.f3826a = i10;
        this.f3827b = obj;
        this.d = obj2;
        this.f3829e = obj3;
        this.f3828c = i3;
    }

    public q0(u1 u1Var, TLRPC.Message message, String str, int i3) {
        this.f3826a = 9;
        this.f3827b = u1Var;
        this.f3829e = message;
        this.d = str;
        this.f3828c = i3;
    }
}
