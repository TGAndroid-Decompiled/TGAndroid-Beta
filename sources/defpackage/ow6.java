package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.LaunchActivity;
public final class ow6 {
    public static final AtomicReference l = new AtomicReference(null);
    public final Context a;
    public final re8 b;
    public String c;
    public final dhf d;
    public final Bundle e;
    public final Bundle f;
    public wk0 g;
    public final y79 h;
    public final y79 i;
    public final y79 j;
    public boolean k;

    public ow6(LaunchActivity launchActivity, re8 re8Var) {
        dhf dhfVar = new dhf((byte) 21);
        Context applicationContext = launchActivity.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = re8Var;
        jte.f(re8Var.N());
        this.c = "";
        this.d = dhfVar;
        this.e = new Bundle();
        this.f = new Bundle();
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        this.h = y79Var;
        this.i = y79Var;
        this.j = y79Var;
    }

    public final uw6 a() {
        jte.p(!this.k);
        this.k = true;
        Object obj = uw6.c;
        int intValue = ((Integer) tx6.C.get()).intValue();
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i < 27) {
            intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
        }
        wk0 wk0Var = this.g;
        if (wk0Var == null) {
            de deVar = new de(context, (byte) 5);
            deVar.b = (intValue << 1) - 1;
            c83 c83Var = new c83(deVar);
            this.g = c83Var;
            wk0Var = c83Var;
        }
        wk0 deVar2 = new de(wk0Var, intValue, (byte) 15);
        this.g = deVar2;
        if (i == 29) {
            AtomicReference atomicReference = l;
            io5 io5Var = (io5) atomicReference.get();
            if (io5Var == null) {
                Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                Point point2 = new Point();
                defaultDisplay.getRealSize(point2);
                int i2 = point2.y;
                int i3 = point2.x;
                Point point3 = new Point(i2 - (i3 - point.x), i3 - (i2 - point.y));
                io5 io5Var2 = new io5(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)}, 2);
                atomicReference.set(io5Var2);
                io5Var = io5Var2;
            }
            wk0 mj4Var = new mj4(deVar2, io5Var, (byte) 26);
            this.g = mj4Var;
            deVar2 = mj4Var;
        }
        this.g = new lx6(deVar2, (byte) 11);
        return new uw6(context, this.c, this.b, this.h, this.i, this.j, this.d, this.e, this.f, this.g);
    }
}
