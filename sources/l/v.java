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
    public final Context f19262a;
    public final k f19263b;
    public final boolean f19264c;
    public final int d;
    public View f19265e;
    public boolean f19267g;
    public w h;
    public s f19268i;
    public PopupWindow.OnDismissListener f19269j;
    public int f19266f = 8388611;
    public final t f19270k = new t(this);

    public v(Context context, k kVar, View view, boolean z10, int i7, int i10) {
        this.f19262a = context;
        this.f19263b = kVar;
        this.f19265e = view;
        this.f19264c = z10;
        this.d = i7;
    }

    public final s a() {
        s c0Var;
        if (this.f19268i == null) {
            Context context = this.f19262a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            u.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131165206)) {
                c0Var = new e(context, this.f19265e, this.d, this.f19264c);
            } else {
                c0Var = new c0(this.f19262a, this.f19263b, this.f19265e, this.d, this.f19264c);
            }
            c0Var.l(this.f19263b);
            c0Var.r(this.f19270k);
            c0Var.n(this.f19265e);
            c0Var.h(this.h);
            c0Var.o(this.f19267g);
            c0Var.p(this.f19266f);
            this.f19268i = c0Var;
        }
        return this.f19268i;
    }

    public final boolean b() {
        s sVar = this.f19268i;
        if (sVar != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f19268i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f19269j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i7, int i10, boolean z10, boolean z11) {
        s a10 = a();
        a10.s(z11);
        if (z10) {
            int i11 = this.f19266f;
            View view = this.f19265e;
            WeakHashMap weakHashMap = i0.f56285a;
            if ((Gravity.getAbsoluteGravity(i11, view.getLayoutDirection()) & 7) == 5) {
                i7 -= this.f19265e.getWidth();
            }
            a10.q(i7);
            a10.t(i10);
            int i12 = (int) ((this.f19262a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f19260a = new Rect(i7 - i12, i10 - i12, i7 + i12, i10 + i12);
        }
        a10.g();
    }
}
