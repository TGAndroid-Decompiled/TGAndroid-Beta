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
public final class lu7 extends LinearLayout {
    public final s09[] a;
    public ku7 b;
    public final Paint c;
    public final int d;
    public boolean e;
    public int f;
    public int h;
    public float n;
    public ValueAnimator r;

    public lu7(Context context, boolean z) {
        super(context);
        Object[] objArr;
        Object[] objArr2;
        float f;
        float f2;
        List list = u11.a;
        this.a = new s09[list.size() + 2];
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
            List list2 = u11.a;
            if (i < list2.size() + 2) {
                s09[] s09VarArr = this.a;
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
                int L = gm.L(f);
                int L2 = gm.L(8.0f);
                if (objArr2 != null) {
                    f2 = 0.0f;
                } else {
                    f2 = 8.0f;
                }
                imageView.setPadding(L, L2, gm.L(f2), gm.L(8.0f));
                imageView.setLayoutParams(qoe.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                s09VarArr[i2] = imageView;
                if (i == 0) {
                    this.a[i2].setOnClickListener(new View.OnClickListener(this) {
                        public final lu7 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r2;
                            lu7 lu7Var = this.b;
                            switch (b) {
                                case 0:
                                    lu7Var.b.a();
                                    return;
                                default:
                                    lu7Var.b.z();
                                    return;
                            }
                        }
                    });
                } else if (i > 0 && i <= list2.size()) {
                    u11 u11Var = (u11) list2.get(i - 1);
                    if (z || !(u11Var instanceof o11)) {
                        this.a[i2].f(u11Var.d(), 28, 28, null);
                        this.a[i2].setOnClickListener(new wh(this, i2, u11Var, (byte) 11));
                    } else {
                        i++;
                    }
                } else if (i == list2.size() + 1) {
                    this.a[i2].setImageResource(2131232048);
                    this.a[i2].setOnClickListener(new View.OnClickListener(this) {
                        public final lu7 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r2;
                            lu7 lu7Var = this.b;
                            switch (b) {
                                case 0:
                                    lu7Var.b.a();
                                    return;
                                default:
                                    lu7Var.b.z();
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
            s09[] s09VarArr = this.a;
            if (i < s09VarArr.length) {
                if (this.r == null || this.h != i) {
                    s09 s09Var = s09VarArr[i];
                    if (s09Var != null) {
                        Drawable drawable = s09Var.getDrawable();
                        if (drawable instanceof p09) {
                            p09 p09Var = (p09) drawable;
                            p09Var.H(0);
                            p09Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f != i) {
                        if (this.e) {
                            this.e = false;
                            gm.L3(s09VarArr[this.d + 1], 2131232048);
                        }
                        this.h = i;
                        this.n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.r = duration;
                        duration.setInterpolator(d53.f);
                        this.r.addUpdateListener(new fh4(this, (byte) 29));
                        this.r.addListener(new v85(this, (byte) 24));
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
                            post(new ud(childAt, (byte) 3));
                            return true;
                        }
                    } else if (this.f != i) {
                        a(i);
                        post(new ud(childAt, (byte) 3));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        s09 s09Var;
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        int i = this.f;
        s09[] s09VarArr = this.a;
        s09 s09Var2 = s09VarArr[i];
        int i2 = this.h;
        if (i2 != -1) {
            s09Var = s09VarArr[i2];
        } else {
            s09Var = null;
        }
        float f4 = 0.0f;
        if (s09Var != null) {
            f = this.n;
        } else {
            f = 0.0f;
        }
        float f5 = 1.0f;
        if (f > 0.25f && f < 0.75f) {
            f5 = (f <= 0.25f || f >= 0.5f) ? td4.y(0.75f, f, 0.25f, 1.0f) : (0.5f - f) / 0.25f;
        }
        float L = (gm.L(3.0f) * f5) + (Math.min((s09Var2.getWidth() - s09Var2.getPaddingLeft()) - s09Var2.getPaddingRight(), (s09Var2.getHeight() - s09Var2.getPaddingTop()) - s09Var2.getPaddingBottom()) / 2.0f) + gm.L(3.0f);
        float width = (s09Var2.getWidth() / 2.0f) + s09Var2.getX();
        int i3 = this.f;
        int i4 = this.d;
        if (i3 == i4 + 1) {
            f2 = gm.L(4.0f);
        } else {
            f2 = 0.0f;
        }
        float f6 = f2 + width;
        if (s09Var != null) {
            f3 = (s09Var.getWidth() / 2.0f) + s09Var.getX();
        } else {
            f3 = 0.0f;
        }
        int i5 = this.h;
        if (i5 != -1 && i5 == i4 + 1) {
            f4 = gm.L(4.0f);
        }
        canvas.drawCircle(gm.R1(f6, f3 + f4, f), (s09Var2.getHeight() / 2.0f) + s09Var2.getY(), L, this.c);
    }

    public void setDelegate(ku7 ku7Var) {
        this.b = ku7Var;
    }

    public void setSelectedIndex(int i) {
        this.f = i;
        if (this.e) {
            this.e = false;
            gm.L3(this.a[this.d + 1], 2131232048);
        }
        invalidate();
    }
}
