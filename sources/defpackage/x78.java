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
public final class x78 extends FrameLayout {
    public final byte a = 1;
    public final bf0 b;
    public final View c;
    public final View d;
    public final View e;
    public final Object f;

    public x78(z78 z78Var, Context context) {
        super(context);
        this.f = z78Var;
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        addView(bf0Var, qoe.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(2131230868);
        addView(linearLayout, qoe.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView m = wi8.m(linearLayout, textView, qoe.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = m;
        m.setTextSize(1, 13.0f);
        m.setTextColor(-1);
        m.setSingleLine(true);
        m.setEllipsize(truncateAt);
        m.setMaxLines(1);
        m.setGravity(80);
        linearLayout.addView(m, qoe.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.e = view;
        view.setBackgroundDrawable(cmb.L0(false));
        addView(view, qoe.c(-1.0f, -1));
    }

    public final void a(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x78.a(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        oc8 oc8Var;
        switch (this.a) {
            case 1:
                pc8 pc8Var = (pc8) this.f;
                float[] fArr = pc8Var.Q;
                if (pc8Var.C == null) {
                    float f2 = pc8Var.P;
                    if (f2 != 1.0f) {
                        float f3 = f2 + 0.07272727f;
                        pc8Var.P = f3;
                        if (f3 > 1.0f) {
                            pc8Var.P = 1.0f;
                        } else {
                            pc8Var.e();
                        }
                    }
                }
                float interpolation = d53.f.getInterpolation(pc8Var.P) * pc8Var.A;
                float measuredHeight = getMeasuredHeight();
                float f4 = 0.0f;
                if (interpolation != 1.0f && (oc8Var = pc8Var.F) != null) {
                    oc8Var.a(fArr);
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
                pc8Var.c(canvas, 1.0f - interpolation, pc8Var.o - getLeft(), pc8Var.p - getTop(), f4, f);
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
                Paint paint = ((z78) this.f).e;
                bf0 bf0Var = this.b;
                if (!bf0Var.getImageReceiver().E() || bf0Var.getImageReceiver().i1 != 1.0f) {
                    paint.setColor(cmb.w0(null, cmb.W9, false));
                    canvas.drawRect(0.0f, 0.0f, bf0Var.getMeasuredWidth(), bf0Var.getMeasuredHeight(), paint);
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

    public x78(pc8 pc8Var, Context context) {
        super(context);
        this.f = pc8Var;
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setOutlineProvider(new xj((byte) 10));
        frameLayout.setClipToOutline(true);
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        frameLayout.addView(bf0Var);
        frameLayout.setWillNotDraw(false);
        jy jyVar = new jy(context);
        this.e = jyVar;
        jyVar.setBackgroundColor(0);
        frameLayout.addView(jyVar, qoe.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        jyVar.addView(textureView, qoe.c(-1.0f, -1));
        addView(frameLayout, qoe.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
