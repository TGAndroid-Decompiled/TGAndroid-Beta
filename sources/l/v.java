package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import r0.i0;
public class v {
    public final Context f17725a;
    public final k f17726b;
    public final boolean f17727c;
    public final int d;
    public View f17728e;
    public boolean f17730g;
    public w h;
    public s f17731i;
    public PopupWindow.OnDismissListener f17732j;
    public int f17729f = 8388611;
    public final t f17733k = new t(this);

    public v(Context context, k kVar, View view, boolean z9, int i7, int i10) {
        this.f17725a = context;
        this.f17726b = kVar;
        this.f17728e = view;
        this.f17727c = z9;
        this.d = i7;
    }

    public final s a() {
        s c0Var;
        if (this.f17731i == null) {
            Context context = this.f17725a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.f17728e, this.d, this.f17727c);
            } else {
                c0Var = new c0(this.f17725a, this.f17726b, this.f17728e, this.d, this.f17727c);
            }
            c0Var.l(this.f17726b);
            c0Var.r(this.f17733k);
            c0Var.n(this.f17728e);
            c0Var.h(this.h);
            c0Var.o(this.f17730g);
            c0Var.p(this.f17729f);
            this.f17731i = c0Var;
        }
        return this.f17731i;
    }

    public final boolean b() {
        s sVar = this.f17731i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f17731i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f17732j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i7, int i10, boolean z9, boolean z10) {
        s a10 = a();
        a10.s(z10);
        if (z9) {
            int i11 = this.f17729f;
            View view = this.f17728e;
            WeakHashMap weakHashMap = i0.f54073a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f17728e.getWidth();
            }
            a10.q(i7);
            a10.t(i10);
            int i12 = (int) ((this.f17725a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f17723a = new Rect(i7 - i12, i10 - i12, i7 + i12, i10 + i12);
        }
        a10.g();
    }
}
