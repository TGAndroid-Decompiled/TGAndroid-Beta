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
public final class ou6 {
    public static final AtomicReference l = new AtomicReference(null);
    public final Context a;
    public final oc8 b;
    public String c;
    public final cff d;
    public final Bundle e;
    public final Bundle f;
    public wj0 g;
    public final w59 h;
    public final w59 i;
    public final w59 j;
    public boolean k;

    public ou6(LaunchActivity launchActivity, oc8 oc8Var) {
        cff cffVar = new cff((byte) 21);
        Context applicationContext = launchActivity.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = oc8Var;
        gre.f(oc8Var.N());
        this.c = "";
        this.d = cffVar;
        this.e = new Bundle();
        this.f = new Bundle();
        km5 km5Var = mm5.b;
        w59 w59Var = w59.e;
        this.h = w59Var;
        this.i = w59Var;
        this.j = w59Var;
    }

    public final uu6 a() {
        gre.p(!this.k);
        this.k = true;
        Object obj = uu6.c;
        int intValue = ((Integer) tv6.C.get()).intValue();
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i < 27) {
            intValue = Math.max(intValue, (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()));
        }
        wj0 wj0Var = this.g;
        if (wj0Var == null) {
            dd ddVar = new dd(context, (byte) 5);
            ddVar.b = (intValue << 1) - 1;
            q63 q63Var = new q63(ddVar);
            this.g = q63Var;
            wj0Var = q63Var;
        }
        wj0 ddVar2 = new dd(wj0Var, intValue, (byte) 15);
        this.g = ddVar2;
        if (i == 29) {
            AtomicReference atomicReference = l;
            im5 im5Var = (im5) atomicReference.get();
            if (im5Var == null) {
                Display defaultDisplay = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                Point point2 = new Point();
                defaultDisplay.getRealSize(point2);
                int i2 = point2.y;
                int i3 = point2.x;
                Point point3 = new Point(i2 - (i3 - point.x), i3 - (i2 - point.y));
                im5 im5Var2 = new im5(new int[]{Math.max(point.x / 6, point.y / 6), Math.max(point3.x / 6, point3.y / 6)}, 2);
                atomicReference.set(im5Var2);
                im5Var = im5Var2;
            }
            wj0 sk4Var = new sk4(ddVar2, im5Var, (byte) 24);
            this.g = sk4Var;
            ddVar2 = sk4Var;
        }
        this.g = new tg2(ddVar2, (byte) 12);
        return new uu6(context, this.c, this.b, this.h, this.i, this.j, this.d, this.e, this.f, this.g);
    }
}
