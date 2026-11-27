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
public final class tw6 {
    public static final AtomicReference l = new AtomicReference(null);
    public final Context a;
    public final dg8 b;
    public String c;
    public final sjf d;
    public final Bundle e;
    public final Bundle f;
    public xj0 g;
    public final j99 h;
    public final j99 i;
    public final j99 j;
    public boolean k;

    public tw6(LaunchActivity launchActivity, dg8 dg8Var) {
        sjf sjfVar = new sjf((byte) 21);
        Context applicationContext = launchActivity.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = dg8Var;
        yve.f(dg8Var.N());
        this.c = "";
        this.d = sjfVar;
        this.e = new Bundle();
        this.f = new Bundle();
        no5 no5Var = po5.b;
        j99 j99Var = j99.e;
        this.h = j99Var;
        this.i = j99Var;
        this.j = j99Var;
    }

    public final zw6 a() {
        yve.p(!this.k);
        this.k = true;
        Object obj = zw6.c;
        int intValue = ((Integer) yx6.C.get()).intValue();
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i < 27) {
            intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
        }
        xj0 xj0Var = this.g;
        if (xj0Var == null) {
            ed edVar = new ed(context, (byte) 5);
            edVar.b = (intValue << 1) - 1;
            j73 j73Var = new j73(edVar);
            this.g = j73Var;
            xj0Var = j73Var;
        }
        xj0 edVar2 = new ed(xj0Var, intValue, (byte) 15);
        this.g = edVar2;
        if (i == 29) {
            AtomicReference atomicReference = l;
            lo5 lo5Var = (lo5) atomicReference.get();
            if (lo5Var == null) {
                Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                Point point2 = new Point();
                defaultDisplay.getRealSize(point2);
                int i2 = point2.y;
                int i3 = point2.x;
                Point point3 = new Point(i2 - (i3 - point.x), i3 - (i2 - point.y));
                lo5 lo5Var2 = new lo5(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)}, 2);
                atomicReference.set(lo5Var2);
                lo5Var = lo5Var2;
            }
            xj0 ym4Var = new ym4(edVar2, lo5Var, (byte) 24);
            this.g = ym4Var;
            edVar2 = ym4Var;
        }
        this.g = new lh2(edVar2, (byte) 12);
        return new zw6(context, this.c, this.b, this.h, this.i, this.j, this.d, this.e, this.f, this.g);
    }
}
