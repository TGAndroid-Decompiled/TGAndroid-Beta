package jg;

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
import org.telegram.messenger.m5;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.gr;
import w7.b6;
public final class y1 extends LinearLayout {
    public final ei0[] f10371a;
    public x1 f10372b;
    public final Paint f10373c;
    public final int d;
    public boolean e;
    public int f10374f;
    public int h;
    public float f10375n;
    public ValueAnimator f10376r;

    public y1(Context context, boolean z10) {
        super(context);
        Object[] objArr;
        Object[] objArr2;
        float f7;
        float f10;
        List list = ig.h.f8315a;
        this.f10371a = new ei0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f10373c = paint;
        this.f10374f = 1;
        this.h = -1;
        this.f10375n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = ig.h.f8315a;
            if (i10 < list2.size() + 2) {
                ei0[] ei0VarArr = this.f10371a;
                if (i10 == 0) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                if (i10 == list2.size() + 1) {
                    objArr2 = 1;
                } else {
                    objArr2 = null;
                }
                ImageView imageView = new ImageView(getContext());
                if (objArr != null) {
                    f7 = 0.0f;
                } else {
                    f7 = 8.0f;
                }
                int L = org.telegram.messenger.i0.L(f7);
                int L2 = org.telegram.messenger.i0.L(8.0f);
                if (objArr2 != null) {
                    f10 = 0.0f;
                } else {
                    f10 = 8.0f;
                }
                imageView.setPadding(L, L2, org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(8.0f));
                imageView.setLayoutParams(b6.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                ei0VarArr[i11] = imageView;
                if (i10 == 0) {
                    this.f10371a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final y1 f10306b;

                        {
                            this.f10306b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f10306b.f10372b.a();
                                    return;
                                default:
                                    this.f10306b.f10372b.A();
                                    return;
                            }
                        }
                    });
                } else if (i10 > 0 && i10 <= list2.size()) {
                    ig.h hVar = (ig.h) list2.get(i10 - 1);
                    if (z10 || !(hVar instanceof ig.b)) {
                        this.f10371a[i11].f(hVar.e(), 28, 28, null);
                        this.f10371a[i11].setOnClickListener(new w1(this, i11, hVar, 0));
                    } else {
                        i10++;
                    }
                } else if (i10 == list2.size() + 1) {
                    this.f10371a[i11].setImageResource(2131232041);
                    this.f10371a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final y1 f10306b;

                        {
                            this.f10306b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f10306b.f10372b.a();
                                    return;
                                default:
                                    this.f10306b.f10372b.A();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f10371a[i11]);
                i11++;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            ei0[] ei0VarArr = this.f10371a;
            if (i10 < ei0VarArr.length) {
                if (this.f10376r == null || this.h != i10) {
                    ei0 ei0Var = ei0VarArr[i10];
                    if (ei0Var != null) {
                        Drawable drawable = ei0Var.getDrawable();
                        if (drawable instanceof bi0) {
                            bi0 bi0Var = (bi0) drawable;
                            bi0Var.M(0);
                            bi0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f10376r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f10374f != i10) {
                        if (this.e) {
                            this.e = false;
                            org.telegram.messenger.i0.Q3(ei0VarArr[this.d + 1], 2131232041);
                        }
                        this.h = i10;
                        this.f10375n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f10376r = duration;
                        duration.setInterpolator(gr.f26495f);
                        this.f10376r.addUpdateListener(new bg.k(this, 4));
                        this.f10376r.addListener(new bg.e(this, 6));
                        this.f10376r.start();
                    }
                }
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.f10372b.v().i(i10 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f10376r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new u1(0, childAt));
                            return true;
                        }
                    } else if (this.f10374f != i10) {
                        a(i10);
                        post(new u1(0, childAt));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ei0 ei0Var;
        float f7;
        float f10;
        float f11;
        super.onDraw(canvas);
        int i10 = this.f10374f;
        ei0[] ei0VarArr = this.f10371a;
        ei0 ei0Var2 = ei0VarArr[i10];
        int i11 = this.h;
        if (i11 != -1) {
            ei0Var = ei0VarArr[i11];
        } else {
            ei0Var = null;
        }
        float f12 = 0.0f;
        if (ei0Var != null) {
            f7 = this.f10375n;
        } else {
            f7 = 0.0f;
        }
        float f13 = 1.0f;
        if (f7 > 0.25f && f7 < 0.75f) {
            f13 = (f7 <= 0.25f || f7 >= 0.5f) ? m5.y(0.75f, f7, 0.25f, 1.0f) : (0.5f - f7) / 0.25f;
        }
        float L = (org.telegram.messenger.i0.L(3.0f) * f13) + (Math.min((ei0Var2.getWidth() - ei0Var2.getPaddingLeft()) - ei0Var2.getPaddingRight(), (ei0Var2.getHeight() - ei0Var2.getPaddingTop()) - ei0Var2.getPaddingBottom()) / 2.0f) + org.telegram.messenger.i0.L(3.0f);
        float width = (ei0Var2.getWidth() / 2.0f) + ei0Var2.getX();
        int i12 = this.f10374f;
        int i13 = this.d;
        if (i12 == i13 + 1) {
            f10 = org.telegram.messenger.i0.L(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f10 + width;
        if (ei0Var != null) {
            f11 = (ei0Var.getWidth() / 2.0f) + ei0Var.getX();
        } else {
            f11 = 0.0f;
        }
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f12 = org.telegram.messenger.i0.L(4.0f);
        }
        canvas.drawCircle(org.telegram.messenger.i0.T1(f14, f11 + f12, f7), (ei0Var2.getHeight() / 2.0f) + ei0Var2.getY(), L, this.f10373c);
    }

    public void setDelegate(x1 x1Var) {
        this.f10372b = x1Var;
    }

    public void setSelectedIndex(int i10) {
        this.f10374f = i10;
        if (this.e) {
            this.e = false;
            org.telegram.messenger.i0.Q3(this.f10371a[this.d + 1], 2131232041);
        }
        invalidate();
    }
}
