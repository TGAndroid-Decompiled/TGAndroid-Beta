package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
public final class xn9 extends vb3 {
    @Override
    public final void a(Context context, int i, x30 x30Var, Handler handler, t54 t54Var, ArrayList arrayList) {
        arrayList.add(new fk6(context, this.b, handler, t54Var, x30Var));
    }

    @Override
    public final void c(Context context, int i, Handler handler, t54 t54Var, ArrayList arrayList) {
        tk6 tk6Var = new tk6(context);
        tk6Var.c = this.b;
        tk6Var.d = (short) 5000;
        tk6Var.e = handler;
        tk6Var.f = t54Var;
        tk6Var.g = (byte) 50;
        arrayList.add(new vk6(tk6Var));
    }
}
