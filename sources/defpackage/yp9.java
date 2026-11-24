package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
public final class yp9 extends hd3 {
    @Override
    public final void a(Context context, int i, x40 x40Var, Handler handler, c74 c74Var, ArrayList arrayList) {
        arrayList.add(new im6(context, this.b, handler, c74Var, x40Var));
    }

    @Override
    public final void c(Context context, int i, Handler handler, c74 c74Var, ArrayList arrayList) {
        wm6 wm6Var = new wm6(context);
        wm6Var.c = this.b;
        wm6Var.d = (short) 5000;
        wm6Var.e = handler;
        wm6Var.f = c74Var;
        wm6Var.g = (byte) 50;
        arrayList.add(new ym6(wm6Var));
    }
}
