package bg;

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
import i7.f6;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.xi0;
public final class r2 extends LinearLayout {
    public final aj0[] f2470a;
    public q2 f2471b;
    public final Paint f2472c;
    public final int d;
    public boolean f2473e;
    public int f2474f;
    public int h;
    public float f2475n;
    public ValueAnimator f2476r;

    public r2(Context context, boolean z10) {
        super(context);
        boolean z11;
        boolean z12;
        float f9;
        float f10;
        List list = ag.m.f584a;
        this.f2470a = new aj0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f2472c = paint;
        this.f2474f = 1;
        this.h = -1;
        this.f2475n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = ag.m.f584a;
            if (i10 < list2.size() + 2) {
                aj0[] aj0VarArr = this.f2470a;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i10 == list2.size() + 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ImageView imageView = new ImageView(getContext());
                if (z11) {
                    f9 = 0.0f;
                } else {
                    f9 = 8.0f;
                }
                int dp = AndroidUtilities.dp(f9);
                int dp2 = AndroidUtilities.dp(8.0f);
                if (z12) {
                    f10 = 0.0f;
                } else {
                    f10 = 8.0f;
                }
                imageView.setPadding(dp, dp2, AndroidUtilities.dp(f10), AndroidUtilities.dp(8.0f));
                imageView.setLayoutParams(f6.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                aj0VarArr[i11] = imageView;
                if (i10 == 0) {
                    this.f2470a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final r2 f2436b;

                        {
                            this.f2436b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f2436b.f2471b.a();
                                    return;
                                default:
                                    this.f2436b.f2471b.A();
                                    return;
                            }
                        }
                    });
                } else if (i10 > 0 && i10 <= list2.size()) {
                    ag.m mVar = (ag.m) list2.get(i10 - 1);
                    if (z10 || !(mVar instanceof ag.b)) {
                        this.f2470a[i11].f(mVar.e(), 28, 28, null);
                        this.f2470a[i11].setOnClickListener(new p2(this, i11, mVar, 0));
                    } else {
                        i10++;
                    }
                } else if (i10 == list2.size() + 1) {
                    this.f2470a[i11].setImageResource(R.drawable.msg_add);
                    this.f2470a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final r2 f2436b;

                        {
                            this.f2436b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f2436b.f2471b.a();
                                    return;
                                default:
                                    this.f2436b.f2471b.A();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f2470a[i11]);
                i11++;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            aj0[] aj0VarArr = this.f2470a;
            if (i10 < aj0VarArr.length) {
                if (this.f2476r == null || this.h != i10) {
                    aj0 aj0Var = aj0VarArr[i10];
                    if (aj0Var != null) {
                        Drawable drawable = aj0Var.getDrawable();
                        if (drawable instanceof xi0) {
                            xi0 xi0Var = (xi0) drawable;
                            xi0Var.K(0);
                            xi0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f2476r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f2474f != i10) {
                        if (this.f2473e) {
                            this.f2473e = false;
                            AndroidUtilities.updateImageViewImageAnimated(aj0VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i10;
                        this.f2475n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f2476r = duration;
                        duration.setInterpolator(jr.f29800f);
                        this.f2476r.addUpdateListener(new q1(this, 1));
                        this.f2476r.addListener(new ag.m0(this, 2));
                        this.f2476r.start();
                    }
                }
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.f2471b.w().i(i10 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x4 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x4 >= childAt.getLeft() && x4 <= childAt.getRight()) {
                    if (this.f2476r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new a4.g(childAt, 14));
                            return true;
                        }
                    } else if (this.f2474f != i10) {
                        a(i10);
                        post(new a4.g(childAt, 14));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        aj0 aj0Var;
        float f9;
        float f10;
        float f11;
        super.onDraw(canvas);
        int i10 = this.f2474f;
        aj0[] aj0VarArr = this.f2470a;
        aj0 aj0Var2 = aj0VarArr[i10];
        int i11 = this.h;
        if (i11 != -1) {
            aj0Var = aj0VarArr[i11];
        } else {
            aj0Var = null;
        }
        float f12 = 0.0f;
        if (aj0Var != null) {
            f9 = this.f2475n;
        } else {
            f9 = 0.0f;
        }
        float f13 = 1.0f;
        if (f9 > 0.25f && f9 < 0.75f) {
            f13 = (f9 <= 0.25f || f9 >= 0.5f) ? org.telegram.messenger.x3.a(0.75f, f9, 0.25f, 1.0f) : (0.5f - f9) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f13) + (Math.min((aj0Var2.getWidth() - aj0Var2.getPaddingLeft()) - aj0Var2.getPaddingRight(), (aj0Var2.getHeight() - aj0Var2.getPaddingTop()) - aj0Var2.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (aj0Var2.getWidth() / 2.0f) + aj0Var2.getX();
        int i12 = this.f2474f;
        int i13 = this.d;
        if (i12 == i13 + 1) {
            f10 = AndroidUtilities.dp(4.0f);
        } else {
            f10 = 0.0f;
        }
        float f14 = f10 + width;
        if (aj0Var != null) {
            f11 = (aj0Var.getWidth() / 2.0f) + aj0Var.getX();
        } else {
            f11 = 0.0f;
        }
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f12 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(f14, f11 + f12, f9), (aj0Var2.getHeight() / 2.0f) + aj0Var2.getY(), dp, this.f2472c);
    }

    public void setDelegate(q2 q2Var) {
        this.f2471b = q2Var;
    }

    public void setSelectedIndex(int i10) {
        this.f2474f = i10;
        if (this.f2473e) {
            this.f2473e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.f2470a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
