package dg;

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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.mr;
public final class o2 extends LinearLayout {
    public final jj0[] f4697a;
    public n2 f4698b;
    public final Paint f4699c;
    public final int d;
    public boolean e;
    public int f4700f;
    public int h;
    public float f4701n;
    public ValueAnimator f4702r;

    public o2(Context context, boolean z4) {
        super(context);
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        List list = cg.m.f2430a;
        this.f4697a = new jj0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f4699c = paint;
        this.f4700f = 1;
        this.h = -1;
        this.f4701n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z4 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = cg.m.f2430a;
            if (i10 < list2.size() + 2) {
                jj0[] jj0VarArr = this.f4697a;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 == list2.size() + 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ImageView imageView = new ImageView(getContext());
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 8.0f;
                }
                int dp = AndroidUtilities.dp(f10);
                int dp2 = AndroidUtilities.dp(8.0f);
                if (z11) {
                    f11 = 0.0f;
                } else {
                    f11 = 8.0f;
                }
                imageView.setPadding(dp, dp2, AndroidUtilities.dp(f11), AndroidUtilities.dp(8.0f));
                imageView.setLayoutParams(b6.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                jj0VarArr[i11] = imageView;
                if (i10 == 0) {
                    this.f4697a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final o2 f4657b;

                        {
                            this.f4657b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f4657b.f4698b.a();
                                    return;
                                default:
                                    this.f4657b.f4698b.A();
                                    return;
                            }
                        }
                    });
                } else if (i10 > 0 && i10 <= list2.size()) {
                    cg.m mVar = (cg.m) list2.get(i10 - 1);
                    if (z4 || !(mVar instanceof cg.b)) {
                        this.f4697a[i11].f(mVar.e(), 28, 28, null);
                        this.f4697a[i11].setOnClickListener(new m2(this, i11, mVar, 0));
                    } else {
                        i10++;
                    }
                } else if (i10 == list2.size() + 1) {
                    this.f4697a[i11].setImageResource(R.drawable.msg_add);
                    this.f4697a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final o2 f4657b;

                        {
                            this.f4657b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f4657b.f4698b.a();
                                    return;
                                default:
                                    this.f4657b.f4698b.A();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f4697a[i11]);
                i11++;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            jj0[] jj0VarArr = this.f4697a;
            if (i10 < jj0VarArr.length) {
                if (this.f4702r == null || this.h != i10) {
                    jj0 jj0Var = jj0VarArr[i10];
                    if (jj0Var != null) {
                        Drawable drawable = jj0Var.getDrawable();
                        if (drawable instanceof gj0) {
                            gj0 gj0Var = (gj0) drawable;
                            gj0Var.K(0);
                            gj0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f4702r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f4700f != i10) {
                        if (this.e) {
                            this.e = false;
                            AndroidUtilities.updateImageViewImageAnimated(jj0VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i10;
                        this.f4701n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f4702r = duration;
                        duration.setInterpolator(mr.f27122f);
                        this.f4702r.addUpdateListener(new o1(this, 1));
                        this.f4702r.addListener(new cg.l0(this, 2));
                        this.f4702r.start();
                    }
                }
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.f4698b.v().i(i10 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f4702r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new ag.d(childAt, 23));
                            return true;
                        }
                    } else if (this.f4700f != i10) {
                        a(i10);
                        post(new ag.d(childAt, 23));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        jj0 jj0Var;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        int i10 = this.f4700f;
        jj0[] jj0VarArr = this.f4697a;
        jj0 jj0Var2 = jj0VarArr[i10];
        int i11 = this.h;
        if (i11 != -1) {
            jj0Var = jj0VarArr[i11];
        } else {
            jj0Var = null;
        }
        float f13 = 0.0f;
        if (jj0Var != null) {
            f10 = this.f4701n;
        } else {
            f10 = 0.0f;
        }
        float f14 = 1.0f;
        if (f10 > 0.25f && f10 < 0.75f) {
            f14 = (f10 <= 0.25f || f10 >= 0.5f) ? org.telegram.messenger.y3.a(0.75f, f10, 0.25f, 1.0f) : (0.5f - f10) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f14) + (Math.min((jj0Var2.getWidth() - jj0Var2.getPaddingLeft()) - jj0Var2.getPaddingRight(), (jj0Var2.getHeight() - jj0Var2.getPaddingTop()) - jj0Var2.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (jj0Var2.getWidth() / 2.0f) + jj0Var2.getX();
        int i12 = this.f4700f;
        int i13 = this.d;
        if (i12 == i13 + 1) {
            f11 = AndroidUtilities.dp(4.0f);
        } else {
            f11 = 0.0f;
        }
        float f15 = f11 + width;
        if (jj0Var != null) {
            f12 = (jj0Var.getWidth() / 2.0f) + jj0Var.getX();
        } else {
            f12 = 0.0f;
        }
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f13 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(f15, f12 + f13, f10), (jj0Var2.getHeight() / 2.0f) + jj0Var2.getY(), dp, this.f4699c);
    }

    public void setDelegate(n2 n2Var) {
        this.f4698b = n2Var;
    }

    public void setSelectedIndex(int i10) {
        this.f4700f = i10;
        if (this.e) {
            this.e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.f4697a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
