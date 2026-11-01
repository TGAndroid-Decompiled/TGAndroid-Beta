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
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import w7.b6;
public final class y1 extends LinearLayout {
    public final fi0[] f10372a;
    public x1 f10373b;
    public final Paint f10374c;
    public final int d;
    public boolean e;
    public int f10375f;
    public int h;
    public float f10376n;
    public ValueAnimator f10377r;

    public y1(Context context, boolean z10) {
        super(context);
        Object[] objArr;
        Object[] objArr2;
        float f7;
        float f10;
        List list = ig.h.f8316a;
        this.f10372a = new fi0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f10374c = paint;
        this.f10375f = 1;
        this.h = -1;
        this.f10376n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = ig.h.f8316a;
            if (i10 < list2.size() + 2) {
                fi0[] fi0VarArr = this.f10372a;
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
                fi0VarArr[i11] = imageView;
                if (i10 == 0) {
                    this.f10372a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final y1 f10307b;

                        {
                            this.f10307b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f10307b.f10373b.a();
                                    return;
                                default:
                                    this.f10307b.f10373b.A();
                                    return;
                            }
                        }
                    });
                } else if (i10 > 0 && i10 <= list2.size()) {
                    ig.h hVar = (ig.h) list2.get(i10 - 1);
                    if (z10 || !(hVar instanceof ig.b)) {
                        this.f10372a[i11].f(hVar.e(), 28, 28, null);
                        this.f10372a[i11].setOnClickListener(new w1(this, i11, hVar, 0));
                    } else {
                        i10++;
                    }
                } else if (i10 == list2.size() + 1) {
                    this.f10372a[i11].setImageResource(2131232041);
                    this.f10372a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final y1 f10307b;

                        {
                            this.f10307b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f10307b.f10373b.a();
                                    return;
                                default:
                                    this.f10307b.f10373b.A();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f10372a[i11]);
                i11++;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            fi0[] fi0VarArr = this.f10372a;
            if (i10 < fi0VarArr.length) {
                if (this.f10377r == null || this.h != i10) {
                    fi0 fi0Var = fi0VarArr[i10];
                    if (fi0Var != null) {
                        Drawable drawable = fi0Var.getDrawable();
                        if (drawable instanceof ci0) {
                            ci0 ci0Var = (ci0) drawable;
                            ci0Var.M(0);
                            ci0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f10377r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f10375f != i10) {
                        if (this.e) {
                            this.e = false;
                            org.telegram.messenger.i0.Q3(fi0VarArr[this.d + 1], 2131232041);
                        }
                        this.h = i10;
                        this.f10376n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f10377r = duration;
                        duration.setInterpolator(gr.f26523f);
                        this.f10377r.addUpdateListener(new bg.k(this, 4));
                        this.f10377r.addListener(new bg.e(this, 6));
                        this.f10377r.start();
                    }
                }
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.f10373b.v().i(i10 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f10377r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new u1(0, childAt));
                            return true;
                        }
                    } else if (this.f10375f != i10) {
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
        fi0 fi0Var;
        float f7;
        float f10;
        float f11;
        super.onDraw(canvas);
        int i10 = this.f10375f;
        fi0[] fi0VarArr = this.f10372a;
        fi0 fi0Var2 = fi0VarArr[i10];
        int i11 = this.h;
        if (i11 != -1) {
            fi0Var = fi0VarArr[i11];
        } else {
            fi0Var = null;
        }
        float f12 = 0.0f;
        if (fi0Var != null) {
            f7 = this.f10376n;
        } else {
            f7 = 0.0f;
        }
        float f13 = 1.0f;
        if (f7 > 0.25f && f7 < 0.75f) {
            f13 = (f7 <= 0.25f || f7 >= 0.5f) ? m5.y(0.75f, f7, 0.25f, 1.0f) : (0.5f - f7) / 0.25f;
        }
        float L = (org.telegram.messenger.i0.L(3.0f) * f13) + (Math.min((fi0Var2.getWidth() - fi0Var2.getPaddingLeft()) - fi0Var2.getPaddingRight(), (fi0Var2.getHeight() - fi0Var2.getPaddingTop()) - fi0Var2.getPaddingBottom()) / 2.0f) + org.telegram.messenger.i0.L(3.0f);
        float width = (fi0Var2.getWidth() / 2.0f) + fi0Var2.getX();
        int i12 = this.f10375f;
        int i13 = this.d;
        if (i12 == i13 + 1) {
            f10 = org.telegram.messenger.i0.L(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f10 + width;
        if (fi0Var != null) {
            f11 = (fi0Var.getWidth() / 2.0f) + fi0Var.getX();
        } else {
            f11 = 0.0f;
        }
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f12 = org.telegram.messenger.i0.L(4.0f);
        }
        canvas.drawCircle(org.telegram.messenger.i0.T1(f14, f11 + f12, f7), (fi0Var2.getHeight() / 2.0f) + fi0Var2.getY(), L, this.f10374c);
    }

    public void setDelegate(x1 x1Var) {
        this.f10373b = x1Var;
    }

    public void setSelectedIndex(int i10) {
        this.f10375f = i10;
        if (this.e) {
            this.e = false;
            org.telegram.messenger.i0.Q3(this.f10372a[this.d + 1], 2131232041);
        }
        invalidate();
    }
}
