package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class v58 extends FrameLayout {
    public final byte a = 1;
    public final be0 b;
    public final View c;
    public final View d;
    public final View e;
    public final Object f;

    public v58(x58 x58Var, Context context) {
        super(context);
        this.f = x58Var;
        be0 be0Var = new be0(context);
        this.b = be0Var;
        addView(be0Var, nme.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(2131230867);
        addView(linearLayout, nme.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView m = ug8.m(linearLayout, textView, nme.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = m;
        m.setTextSize(1, 13.0f);
        m.setTextColor(-1);
        m.setSingleLine(true);
        m.setEllipsize(truncateAt);
        m.setMaxLines(1);
        m.setGravity(80);
        linearLayout.addView(m, nme.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.e = view;
        view.setBackgroundDrawable(bkb.L0(false));
        addView(view, nme.c(-1.0f, -1));
    }

    public final void a(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v58.a(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        la8 la8Var;
        switch (this.a) {
            case 1:
                ma8 ma8Var = (ma8) this.f;
                float[] fArr = ma8Var.Q;
                if (ma8Var.C == null) {
                    float f2 = ma8Var.P;
                    if (f2 != 1.0f) {
                        float f3 = f2 + 0.07272727f;
                        ma8Var.P = f3;
                        if (f3 > 1.0f) {
                            ma8Var.P = 1.0f;
                        } else {
                            ma8Var.e();
                        }
                    }
                }
                float interpolation = s33.f.getInterpolation(ma8Var.P) * ma8Var.A;
                float measuredHeight = getMeasuredHeight();
                float f4 = 0.0f;
                if (interpolation != 1.0f && (la8Var = ma8Var.F) != null) {
                    la8Var.a(fArr);
                    canvas.save();
                    float f5 = 1.0f - interpolation;
                    float f6 = fArr[0] * f5;
                    float measuredHeight2 = (fArr[1] * f5) + (getMeasuredHeight() * interpolation);
                    canvas.clipRect(0.0f, f6, getMeasuredWidth(), measuredHeight2);
                    a(canvas);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    f = measuredHeight2;
                    f4 = f6;
                } else {
                    a(canvas);
                    super.dispatchDraw(canvas);
                    f = measuredHeight;
                }
                ma8Var.c(canvas, 1.0f - interpolation, ma8Var.o - getLeft(), ma8Var.p - getTop(), f4, f);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Paint paint = ((x58) this.f).e;
                be0 be0Var = this.b;
                if (!be0Var.getImageReceiver().E() || be0Var.getImageReceiver().i1 != 1.0f) {
                    paint.setColor(bkb.w0(null, bkb.W9, false));
                    canvas.drawRect(0.0f, 0.0f, be0Var.getMeasuredWidth(), be0Var.getMeasuredHeight(), paint);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                this.e.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public v58(ma8 ma8Var, Context context) {
        super(context);
        this.f = ma8Var;
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setOutlineProvider(new xi((byte) 10));
        frameLayout.setClipToOutline(true);
        be0 be0Var = new be0(context);
        this.b = be0Var;
        frameLayout.addView(be0Var);
        frameLayout.setWillNotDraw(false);
        ix ixVar = new ix(context);
        this.e = ixVar;
        ixVar.setBackgroundColor(0);
        frameLayout.addView(ixVar, nme.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        ixVar.addView(textureView, nme.c(-1.0f, -1));
        addView(frameLayout, nme.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
