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
public final class g48 extends FrameLayout {
    public int E;
    public int F;
    public o38 G;
    public jl0 H;
    public jl0 I;
    public boolean J;
    public final Path K;
    public int L;
    public final gu a;
    public final x46 b;
    public final kr c;
    public int d;
    public final mm e;
    public final ArrayList f;
    public r38 h;
    public final RectF n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public final Paint x;
    public int y;

    public g48(Context context, vnb vnbVar) {
        super(context);
        this.f = new ArrayList();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.w = new Paint(1);
        this.x = new Paint(1);
        this.K = new Path();
        this.L = Integer.MIN_VALUE;
        gu guVar = new gu(this, context, vnbVar, (byte) 27);
        this.a = guVar;
        guVar.setClipToPadding(false);
        guVar.setClipChildren(false);
        guVar.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        guVar.setOverScrollMode(2);
        guVar.setHorizontalScrollBarEnabled(false);
        guVar.setItemAnimator(null);
        x46 x46Var = new x46(0, false);
        this.b = x46Var;
        guVar.setLayoutManager(x46Var);
        kr krVar = new kr(this, (byte) 6);
        this.c = krVar;
        guVar.setAdapter(krVar);
        guVar.setOnItemClickListener(new zg4(this, (byte) 17));
        addView(guVar, tre.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new mm(guVar, 0L, 320L, k43.h);
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
        gu guVar = this.a;
        if (!isEmpty) {
            int j = Utilities.j(i, arrayList.size() - 1, 0);
            if (z) {
                guVar.A0(j);
            } else {
                guVar.x0(j);
            }
        }
        guVar.invalidate();
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
        jl0 jl0Var;
        br3.g(this.H, 0, 0, getWidth(), getHeight());
        br3.g(this.I, 0, 0, getWidth(), getHeight());
        if (this.J) {
            jl0Var = this.I;
        } else {
            jl0Var = this.H;
        }
        jl0Var.draw(canvas);
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
        int L = hl.L(3.0f);
        Path path = this.K;
        path.rewind();
        float f = L;
        path.addRoundRect(f, f, i - L, i2 - L, hl.L(18.0f) - L, hl.L(18.0f) - L, Path.Direction.CW);
    }
}
