package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class mh2 extends io {
    public final byte s;
    public Object w;

    public mh2(FrameLayout frameLayout, Context context, byte b) {
        super(context, false, false, false);
        this.s = b;
        this.w = frameLayout;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.s) {
            case 4:
                int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - gm.L(20.0f));
                Drawable drawable = (Drawable) this.w;
                drawable.setBounds(measuredWidth, wi8.D(17.0f, getMeasuredHeight(), 2), gm.L(17.0f) + measuredWidth, (gm.L(17.0f) + getMeasuredHeight()) / 2);
                drawable.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.s) {
            case 3:
                super.invalidate();
                gh8 gh8Var = (gh8) this.w;
                ih8 ih8Var = gh8Var.d;
                if (gh8Var == ih8Var.l1.getPinnedHeader()) {
                    ih8Var.l1.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int p1;
        switch (this.s) {
            case 0:
                super.onDraw(canvas);
                ((oh2) this.w).f();
                return;
            case 1:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.w;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (p1 = cmb.p1(0.15f, cmb.w0(null, cmb.K6, false)))) {
                    shapeDrawable.getPaint().setColor(p1);
                }
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().c() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                return;
            case 5:
                canvas.save();
                canvas.translate(gm.L(15.0f), 0.0f);
                super.onDraw(canvas);
                canvas.translate(((getMeasuredWidth() - d()) / 2.0f) - gm.L(30.0f), gm.L(11.0f));
                ((l8c) this.w).b.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.s) {
            case 2:
                k86 k86Var = (k86) this.w;
                TextView textView = k86Var.f;
                TextView textView2 = k86Var.d;
                int size = View.MeasureSpec.getSize(i);
                if (size <= 0) {
                    size = gm.q.x - gm.L(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - textView2.getPaint().measureText(textView2.getText().toString())) - textView.getPaint().measureText(textView.getText().toString())), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean post(Runnable runnable) {
        switch (this.s) {
            case 3:
                ih8 ih8Var = ((gh8) this.w).d;
                pn pnVar = ih8.L1;
                return ih8Var.b.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override
    public final boolean postDelayed(Runnable runnable, long j) {
        switch (this.s) {
            case 3:
                ih8 ih8Var = ((gh8) this.w).d;
                pn pnVar = ih8.L1;
                return ih8Var.b.postDelayed(runnable, j);
            default:
                return super.postDelayed(runnable, j);
        }
    }

    public mh2(Context context, boolean z, boolean z2, boolean z3) {
        super(context, z, z2, z3);
        this.s = (byte) 1;
    }

    public mh2(l8c l8cVar, Context context) {
        super(context, true, true, true);
        this.s = (byte) 5;
        this.w = l8cVar;
    }

    public mh2(k86 k86Var, Context context) {
        super(context, false, true, true);
        this.s = (byte) 2;
        this.w = k86Var;
    }

    public mh2(cxa cxaVar, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.s = (byte) 4;
        this.w = drawable;
    }
}
