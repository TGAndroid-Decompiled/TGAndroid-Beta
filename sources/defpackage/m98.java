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
public final class m98 extends FrameLayout {
    public final byte a = 1;
    public final de0 b;
    public final View c;
    public final View d;
    public final View e;
    public final Object f;

    public m98(o98 o98Var, Context context) {
        super(context);
        this.f = o98Var;
        de0 de0Var = new de0(context);
        this.b = de0Var;
        addView(de0Var, tre.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(2131230867);
        addView(linearLayout, tre.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView m = ik8.m(linearLayout, textView, tre.m(1.0f, 0, -1, 8, 0, 5), context);
        this.d = m;
        m.setTextSize(1, 13.0f);
        m.setTextColor(-1);
        m.setSingleLine(true);
        m.setEllipsize(truncateAt);
        m.setMaxLines(1);
        m.setGravity(80);
        linearLayout.addView(m, tre.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.e = view;
        view.setBackgroundDrawable(aob.L0(false));
        addView(view, tre.c(-1.0f, -1));
    }

    public final void a(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m98.a(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        ce8 ce8Var;
        switch (this.a) {
            case 1:
                de8 de8Var = (de8) this.f;
                float[] fArr = de8Var.Q;
                if (de8Var.C == null) {
                    float f2 = de8Var.P;
                    if (f2 != 1.0f) {
                        float f3 = f2 + 0.07272727f;
                        de8Var.P = f3;
                        if (f3 > 1.0f) {
                            de8Var.P = 1.0f;
                        } else {
                            de8Var.e();
                        }
                    }
                }
                float interpolation = k43.f.getInterpolation(de8Var.P) * de8Var.A;
                float measuredHeight = getMeasuredHeight();
                float f4 = 0.0f;
                if (interpolation != 1.0f && (ce8Var = de8Var.F) != null) {
                    ce8Var.a(fArr);
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
                de8Var.c(canvas, 1.0f - interpolation, de8Var.o - getLeft(), de8Var.p - getTop(), f4, f);
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
                Paint paint = ((o98) this.f).e;
                de0 de0Var = this.b;
                if (!de0Var.getImageReceiver().E() || de0Var.getImageReceiver().i1 != 1.0f) {
                    paint.setColor(aob.w0(null, aob.X9, false));
                    canvas.drawRect(0.0f, 0.0f, de0Var.getMeasuredWidth(), de0Var.getMeasuredHeight(), paint);
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

    public m98(de8 de8Var, Context context) {
        super(context);
        this.f = de8Var;
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setOutlineProvider(new yi((byte) 10));
        frameLayout.setClipToOutline(true);
        de0 de0Var = new de0(context);
        this.b = de0Var;
        frameLayout.addView(de0Var);
        frameLayout.setWillNotDraw(false);
        jx jxVar = new jx(context);
        this.e = jxVar;
        jxVar.setBackgroundColor(0);
        frameLayout.addView(jxVar, tre.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setOpaque(false);
        jxVar.addView(textureView, tre.c(-1.0f, -1));
        addView(frameLayout, tre.c(-2.0f, -2));
        setWillNotDraw(false);
    }
}
