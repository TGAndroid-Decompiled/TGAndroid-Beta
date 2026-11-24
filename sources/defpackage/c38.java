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
public final class c38 extends FrameLayout {
    public int E;
    public int F;
    public l28 G;
    public im0 H;
    public im0 I;
    public boolean J;
    public final Path K;
    public int L;
    public final fv a;
    public final u46 b;
    public final js c;
    public int d;
    public final ln e;
    public final ArrayList f;
    public o28 h;
    public final RectF n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public final Paint x;
    public int y;

    public c38(Context context, ylb ylbVar) {
        super(context);
        this.f = new ArrayList();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.w = new Paint(1);
        this.x = new Paint(1);
        this.K = new Path();
        this.L = Integer.MIN_VALUE;
        fv fvVar = new fv(this, context, ylbVar, (byte) 27);
        this.a = fvVar;
        fvVar.setClipToPadding(false);
        fvVar.setClipChildren(false);
        fvVar.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        fvVar.setOverScrollMode(2);
        fvVar.setHorizontalScrollBarEnabled(false);
        fvVar.setItemAnimator(null);
        u46 u46Var = new u46(0, false);
        this.b = u46Var;
        fvVar.setLayoutManager(u46Var);
        js jsVar = new js(this, (byte) 6);
        this.c = jsVar;
        fvVar.setAdapter(jsVar);
        fvVar.setOnItemClickListener(new kg4(this, (byte) 18));
        addView(fvVar, qoe.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new ln(fvVar, 0L, 320L, d53.h);
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
        fv fvVar = this.a;
        if (!isEmpty) {
            int j = Utilities.j(i, arrayList.size() - 1, 0);
            if (z) {
                fvVar.z0(j);
            } else {
                fvVar.w0(j);
            }
        }
        fvVar.invalidate();
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
        im0 im0Var;
        ur3.g(this.H, 0, 0, getWidth(), getHeight());
        ur3.g(this.I, 0, 0, getWidth(), getHeight());
        if (this.J) {
            im0Var = this.I;
        } else {
            im0Var = this.H;
        }
        im0Var.draw(canvas);
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
        int L = gm.L(3.0f);
        Path path = this.K;
        path.rewind();
        float f = L;
        path.addRoundRect(f, f, i - L, i2 - L, gm.L(18.0f) - L, gm.L(18.0f) - L, Path.Direction.CW);
    }
}
