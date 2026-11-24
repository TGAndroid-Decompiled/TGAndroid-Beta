package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.List;
public final class ks7 extends LinearLayout {
    public final ry8[] a;
    public js7 b;
    public final Paint c;
    public final int d;
    public boolean e;
    public int f;
    public int h;
    public float n;
    public ValueAnimator r;

    public ks7(Context context, boolean z) {
        super(context);
        Object[] objArr;
        Object[] objArr2;
        float f;
        float f2;
        List list = m01.a;
        this.a = new ry8[list.size() + 2];
        Paint paint = new Paint(1);
        this.c = paint;
        this.f = 1;
        this.h = -1;
        this.n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z ? 1 : 0);
        int i = 0;
        int i2 = 0;
        while (true) {
            List list2 = m01.a;
            if (i < list2.size() + 2) {
                ry8[] ry8VarArr = this.a;
                if (i == 0) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                if (i == list2.size() + 1) {
                    objArr2 = 1;
                } else {
                    objArr2 = null;
                }
                ImageView imageView = new ImageView(getContext());
                if (objArr != null) {
                    f = 0.0f;
                } else {
                    f = 8.0f;
                }
                int L = gl.L(f);
                int L2 = gl.L(8.0f);
                if (objArr2 != null) {
                    f2 = 0.0f;
                } else {
                    f2 = 8.0f;
                }
                imageView.setPadding(L, L2, gl.L(f2), gl.L(8.0f));
                imageView.setLayoutParams(nme.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                ry8VarArr[i2] = imageView;
                if (i == 0) {
                    this.a[i2].setOnClickListener(new View.OnClickListener(this) {
                        public final ks7 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r2;
                            ks7 ks7Var = this.b;
                            switch (b) {
                                case 0:
                                    ks7Var.b.a();
                                    return;
                                default:
                                    ks7Var.b.z();
                                    return;
                            }
                        }
                    });
                } else if (i > 0 && i <= list2.size()) {
                    m01 m01Var = (m01) list2.get(i - 1);
                    if (z || !(m01Var instanceof g01)) {
                        this.a[i2].f(m01Var.d(), 28, 28, null);
                        this.a[i2].setOnClickListener(new wg(this, i2, m01Var, (byte) 11));
                    } else {
                        i++;
                    }
                } else if (i == list2.size() + 1) {
                    this.a[i2].setImageResource(2131232047);
                    this.a[i2].setOnClickListener(new View.OnClickListener(this) {
                        public final ks7 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r2;
                            ks7 ks7Var = this.b;
                            switch (b) {
                                case 0:
                                    ks7Var.b.a();
                                    return;
                                default:
                                    ks7Var.b.z();
                                    return;
                            }
                        }
                    });
                }
                addView(this.a[i2]);
                i2++;
                i++;
            } else {
                return;
            }
        }
    }

    public final void a(int i) {
        if (i >= 0) {
            ry8[] ry8VarArr = this.a;
            if (i < ry8VarArr.length) {
                if (this.r == null || this.h != i) {
                    ry8 ry8Var = ry8VarArr[i];
                    if (ry8Var != null) {
                        Drawable drawable = ry8Var.getDrawable();
                        if (drawable instanceof oy8) {
                            oy8 oy8Var = (oy8) drawable;
                            oy8Var.H(0);
                            oy8Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f != i) {
                        if (this.e) {
                            this.e = false;
                            gl.M3(ry8VarArr[this.d + 1], 2131232047);
                        }
                        this.h = i;
                        this.n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.r = duration;
                        duration.setInterpolator(s33.f);
                        this.r.addUpdateListener(new ni4(this, (byte) 27));
                        this.r.addListener(new v85(this, (byte) 22));
                        this.r.start();
                    }
                }
            }
        }
    }

    public final void b(int i) {
        a(i);
        this.b.w().i(i - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            motionEvent.getY();
            for (int i = 1; i < getChildCount() - 1; i++) {
                View childAt = getChildAt(i);
                if (x >= childAt.getLeft() && x <= childAt.getRight()) {
                    if (this.r != null) {
                        if (this.h != i) {
                            a(i);
                            post(new uc(childAt, (byte) 3));
                            return true;
                        }
                    } else if (this.f != i) {
                        a(i);
                        post(new uc(childAt, (byte) 3));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ry8 ry8Var;
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        int i = this.f;
        ry8[] ry8VarArr = this.a;
        ry8 ry8Var2 = ry8VarArr[i];
        int i2 = this.h;
        if (i2 != -1) {
            ry8Var = ry8VarArr[i2];
        } else {
            ry8Var = null;
        }
        float f4 = 0.0f;
        if (ry8Var != null) {
            f = this.n;
        } else {
            f = 0.0f;
        }
        float f5 = 1.0f;
        if (f > 0.25f && f < 0.75f) {
            f5 = (f <= 0.25f || f >= 0.5f) ? tb4.x(0.75f, f, 0.25f, 1.0f) : (0.5f - f) / 0.25f;
        }
        float L = (gl.L(3.0f) * f5) + (Math.min((ry8Var2.getWidth() - ry8Var2.getPaddingLeft()) - ry8Var2.getPaddingRight(), (ry8Var2.getHeight() - ry8Var2.getPaddingTop()) - ry8Var2.getPaddingBottom()) / 2.0f) + gl.L(3.0f);
        float width = (ry8Var2.getWidth() / 2.0f) + ry8Var2.getX();
        int i3 = this.f;
        int i4 = this.d;
        if (i3 == i4 + 1) {
            f2 = gl.L(4.0f);
        } else {
            f2 = 0.0f;
        }
        float f6 = f2 + width;
        if (ry8Var != null) {
            f3 = (ry8Var.getWidth() / 2.0f) + ry8Var.getX();
        } else {
            f3 = 0.0f;
        }
        int i5 = this.h;
        if (i5 != -1 && i5 == i4 + 1) {
            f4 = gl.L(4.0f);
        }
        canvas.drawCircle(gl.R1(f6, f3 + f4, f), (ry8Var2.getHeight() / 2.0f) + ry8Var2.getY(), L, this.c);
    }

    public void setDelegate(js7 js7Var) {
        this.b = js7Var;
    }

    public void setSelectedIndex(int i) {
        this.f = i;
        if (this.e) {
            this.e = false;
            gl.M3(this.a[this.d + 1], 2131232047);
        }
        invalidate();
    }
}
