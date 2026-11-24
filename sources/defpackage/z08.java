package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class z08 extends FrameLayout {
    public int E;
    public int F;
    public i08 G;
    public il0 H;
    public il0 I;
    public boolean J;
    public final Path K;
    public int L;
    public final fu a;
    public final t26 b;
    public final jr c;
    public int d;
    public final lm e;
    public final ArrayList f;
    public l08 h;
    public final RectF n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public final Paint x;
    public int y;

    public z08(Context context, wjb wjbVar) {
        super(context);
        this.f = new ArrayList();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.w = new Paint(1);
        this.x = new Paint(1);
        this.K = new Path();
        this.L = Integer.MIN_VALUE;
        fu fuVar = new fu(this, context, wjbVar, (byte) 27);
        this.a = fuVar;
        fuVar.setClipToPadding(false);
        fuVar.setClipChildren(false);
        fuVar.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        fuVar.setOverScrollMode(2);
        fuVar.setHorizontalScrollBarEnabled(false);
        fuVar.setItemAnimator(null);
        t26 t26Var = new t26(0, false);
        this.b = t26Var;
        fuVar.setLayoutManager(t26Var);
        jr jrVar = new jr(this, (byte) 6);
        this.c = jrVar;
        fuVar.setAdapter(jrVar);
        fuVar.setOnItemClickListener(new bf4(this, (byte) 17));
        addView(fuVar, nme.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new lm(fuVar, 0L, 320L, s33.h);
    }

    public final void a(int i, boolean z) {
        int i2 = this.d;
        this.d = i;
        if (!z) {
            this.e.e(true, i);
        }
        b(i2);
        if (i != i2) {
            b(i);
        }
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        fu fuVar = this.a;
        if (!isEmpty) {
            int j = Utilities.j(i, arrayList.size() - 1, 0);
            if (z) {
                fuVar.z0(j);
            } else {
                fuVar.w0(j);
            }
        }
        fuVar.invalidate();
    }

    public final void b(int i) {
        int i2;
        View m = this.b.m(i);
        if (m instanceof TextView) {
            TextView textView = (TextView) m;
            if (i == this.d) {
                i2 = this.F;
            } else {
                i2 = this.E;
            }
            textView.setTextColor(i2);
            m.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        il0 il0Var;
        kq3.g(this.H, 0, 0, getWidth(), getHeight());
        kq3.g(this.I, 0, 0, getWidth(), getHeight());
        if (this.J) {
            il0Var = this.I;
        } else {
            il0Var = this.H;
        }
        il0Var.draw(canvas);
        canvas.save();
        canvas.clipPath(this.K);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int L = gl.L(3.0f);
        Path path = this.K;
        path.rewind();
        float f = L;
        path.addRoundRect(f, f, i - L, i2 - L, gl.L(18.0f) - L, gl.L(18.0f) - L, Path.Direction.CW);
    }
}
