package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
public final class or9 extends oc3 {
    @Override
    public final void a(Context context, int i, y30 y30Var, Handler handler, n64 n64Var, ArrayList arrayList) {
        arrayList.add(new km6(context, this.b, handler, n64Var, y30Var));
    }

    @Override
    public final void c(Context context, int i, Handler handler, n64 n64Var, ArrayList arrayList) {
        zm6 zm6Var = new zm6(context);
        zm6Var.c = this.b;
        zm6Var.d = (short) 5000;
        zm6Var.e = handler;
        zm6Var.f = n64Var;
        zm6Var.g = (byte) 50;
        arrayList.add(new bn6(zm6Var));
    }
}
