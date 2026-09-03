package eg;

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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.pr;
public final class m2 extends LinearLayout {
    public final kj0[] f5349a;
    public l2 f5350b;
    public final Paint f5351c;
    public final int d;
    public boolean f5352e;
    public int f5353f;
    public int h;
    public float f5354n;
    public ValueAnimator f5355r;

    public m2(Context context, boolean z4) {
        super(context);
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        List list = dg.m.f4581a;
        this.f5349a = new kj0[list.size() + 2];
        Paint paint = new Paint(1);
        this.f5351c = paint;
        this.f5353f = 1;
        this.h = -1;
        this.f5354n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z4 ? 1 : 0);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = dg.m.f4581a;
            if (i10 < list2.size() + 2) {
                kj0[] kj0VarArr = this.f5349a;
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
                imageView.setLayoutParams(c6.l(1.0f, 0, 40));
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                kj0VarArr[i11] = imageView;
                if (i10 == 0) {
                    this.f5349a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final m2 f5307b;

                        {
                            this.f5307b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f5307b.f5350b.a();
                                    return;
                                default:
                                    this.f5307b.f5350b.A();
                                    return;
                            }
                        }
                    });
                } else if (i10 > 0 && i10 <= list2.size()) {
                    dg.m mVar = (dg.m) list2.get(i10 - 1);
                    if (z4 || !(mVar instanceof dg.b)) {
                        this.f5349a[i11].f(mVar.e(), 28, 28, null);
                        this.f5349a[i11].setOnClickListener(new k2(this, i11, mVar, 0));
                    } else {
                        i10++;
                    }
                } else if (i10 == list2.size() + 1) {
                    this.f5349a[i11].setImageResource(R.drawable.msg_add);
                    this.f5349a[i11].setOnClickListener(new View.OnClickListener(this) {
                        public final m2 f5307b;

                        {
                            this.f5307b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f5307b.f5350b.a();
                                    return;
                                default:
                                    this.f5307b.f5350b.A();
                                    return;
                            }
                        }
                    });
                }
                addView(this.f5349a[i11]);
                i11++;
                i10++;
            } else {
                return;
            }
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            kj0[] kj0VarArr = this.f5349a;
            if (i10 < kj0VarArr.length) {
                if (this.f5355r == null || this.h != i10) {
                    kj0 kj0Var = kj0VarArr[i10];
                    if (kj0Var != null) {
                        Drawable drawable = kj0Var.getDrawable();
                        if (drawable instanceof hj0) {
                            hj0 hj0Var = (hj0) drawable;
                            hj0Var.K(0);
                            hj0Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.f5355r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f5353f != i10) {
                        if (this.f5352e) {
                            this.f5352e = false;
                            AndroidUtilities.updateImageViewImageAnimated(kj0VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i10;
                        this.f5354n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.f5355r = duration;
                        duration.setInterpolator(pr.f30168f);
                        this.f5355r.addUpdateListener(new m1(this, 1));
                        this.f5355r.addListener(new dg.l0(this, 2));
                        this.f5355r.start();
                    }
                }
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.f5350b.w().i(i10 - 1, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.f5355r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new ag.e(childAt, 25));
                            return true;
                        }
                    } else if (this.f5353f != i10) {
                        a(i10);
                        post(new ag.e(childAt, 25));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        kj0 kj0Var;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        int i10 = this.f5353f;
        kj0[] kj0VarArr = this.f5349a;
        kj0 kj0Var2 = kj0VarArr[i10];
        int i11 = this.h;
        if (i11 != -1) {
            kj0Var = kj0VarArr[i11];
        } else {
            kj0Var = null;
        }
        float f13 = 0.0f;
        if (kj0Var != null) {
            f10 = this.f5354n;
        } else {
            f10 = 0.0f;
        }
        float f14 = 1.0f;
        if (f10 > 0.25f && f10 < 0.75f) {
            f14 = (f10 <= 0.25f || f10 >= 0.5f) ? org.telegram.messenger.y3.a(0.75f, f10, 0.25f, 1.0f) : (0.5f - f10) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f14) + (Math.min((kj0Var2.getWidth() - kj0Var2.getPaddingLeft()) - kj0Var2.getPaddingRight(), (kj0Var2.getHeight() - kj0Var2.getPaddingTop()) - kj0Var2.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (kj0Var2.getWidth() / 2.0f) + kj0Var2.getX();
        int i12 = this.f5353f;
        int i13 = this.d;
        if (i12 == i13 + 1) {
            f11 = AndroidUtilities.dp(4.0f);
        } else {
            f11 = 0.0f;
        }
        float f15 = f11 + width;
        if (kj0Var != null) {
            f12 = (kj0Var.getWidth() / 2.0f) + kj0Var.getX();
        } else {
            f12 = 0.0f;
        }
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f13 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(f15, f12 + f13, f10), (kj0Var2.getHeight() / 2.0f) + kj0Var2.getY(), dp, this.f5351c);
    }

    public void setDelegate(l2 l2Var) {
        this.f5350b = l2Var;
    }

    public void setSelectedIndex(int i10) {
        this.f5353f = i10;
        if (this.f5352e) {
            this.f5352e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.f5349a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
