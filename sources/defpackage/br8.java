package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;
public abstract class br8 extends LinearLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public final wjb a;
    public final TextView b;
    public final TextView[] c;
    public final ImageView d;
    public final FrameLayout e;
    public final ViewGroup[] f;
    public final TextView[] h;
    public final TextView[][] n;
    public final ii2 r;
    public final FrameLayout s;
    public final LinearLayout w;
    public int x;
    public int y;

    public br8(Context context, wjb wjbVar) {
        super(context);
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        this.c = new TextView[2];
        this.f = new ViewGroup[7];
        this.h = new TextView[7];
        this.n = new TextView[7];
        this.x = 1;
        this.y = 0;
        this.E = true;
        this.a = wjbVar;
        setOrientation(1);
        setClipChildren(false);
        int i8 = 0;
        for (int i9 = 7; i8 < i9; i9 = 7) {
            if (i8 == 0) {
                ViewGroup ar8Var = new ar8(context, (byte) 0);
                ar8Var.setMinimumHeight(gl.L(60.0f));
                TextView textView = new TextView(context);
                this.b = textView;
                if (k96.a0) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                textView.setGravity(i3);
                textView.setTextSize(1, 16.0f);
                ar8Var.addView(textView, nme.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i8] = new TextView(context);
                TextView textView2 = this.h[i8];
                if (k96.a0) {
                    i4 = 5;
                } else {
                    i4 = 3;
                }
                textView2.setGravity(i4);
                this.h[i8].setTextSize(1, 13.0f);
                zkb.X(this.h[i8], bkb.y6, wjbVar);
                ar8Var.addView(this.h[i8], nme.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.w = linearLayout;
                linearLayout.setOrientation(1);
                this.s = new FrameLayout(context);
                this.n[i8] = new TextView[2];
                for (int i10 = 0; i10 < 2; i10++) {
                    this.n[i8][i10] = new TextView(context);
                    this.n[i8][i10].setTextSize(1, 14.0f);
                    zkb.X(this.n[i8][i10], bkb.y6, wjbVar);
                    TextView textView3 = this.n[i8][i10];
                    if (k96.a0) {
                        i7 = 3;
                    } else {
                        i7 = 5;
                    }
                    textView3.setGravity(i7);
                    this.s.addView(this.n[i8][i10], nme.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i11 = 0; i11 < 2; i11++) {
                    this.c[i11] = new TextView(context);
                    this.c[i11].setTextSize(1, 14.0f);
                    zkb.X(this.c[i11], bkb.y6, wjbVar);
                    TextView textView4 = this.c[i11];
                    if (k96.a0) {
                        i6 = 3;
                    } else {
                        i6 = 5;
                    }
                    textView4.setGravity(i6);
                    this.s.addView(this.c[i11], nme.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(2131230871);
                zkb.s(imageView, bkb.y6, wjbVar, PorterDuff.Mode.SRC_IN);
                this.s.addView(imageView, nme.h(20.0f, 20.0f, 8388629));
                this.w.addView(this.s, new LinearLayout.LayoutParams(nme.z(-1.0f), nme.z(-1.0f), Gravity.getAbsoluteGravity(119, k96.a0 ? 1 : 0)));
                ii2 ii2Var = new ii2(context);
                this.r = ii2Var;
                ii2Var.getDrawable().M = true;
                ii2Var.setTextSize(gl.L(13.0f));
                ii2Var.setPadding(gl.L(6.0f), 0, gl.L(6.0f), 0);
                if (k96.a0) {
                    i5 = 3;
                } else {
                    i5 = 5;
                }
                ii2Var.setGravity(i5);
                int L = gl.L(8.0f);
                int i12 = bkb.n6;
                int v0 = bkb.v0(i12, wjbVar);
                RectF rectF = ProfileActivity.Z6;
                int p1 = bkb.p1(0.1f, v0);
                int p12 = bkb.p1(0.22f, bkb.v0(i12, wjbVar));
                ii2Var.setBackground(bkb.i0(L, L, L, L, p1, p12, p12));
                ii2Var.setTextColor(bkb.v0(i12, wjbVar));
                ii2Var.getDrawable().B = 0.6f;
                ii2Var.setVisibility(8);
                this.w.addView(ii2Var, nme.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.e = frameLayout;
                frameLayout.addView(this.w, nme.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                ar8Var.addView(frameLayout, nme.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f[i8] = ar8Var;
                addView(ar8Var, nme.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup j = de9.j(context, 0);
                this.h[i8] = new TextView(context);
                this.h[i8].setTextSize(1, 14.0f);
                zkb.X(this.h[i8], bkb.F6, wjbVar);
                TextView textView5 = this.h[i8];
                if (k96.a0) {
                    i = 5;
                } else {
                    i = 3;
                }
                textView5.setGravity(i);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.n[i8] = new TextView[2];
                for (int i13 = 0; i13 < 2; i13++) {
                    this.n[i8][i13] = new TextView(context);
                    this.n[i8][i13].setTextSize(1, 14.0f);
                    zkb.X(this.n[i8][i13], bkb.y6, wjbVar);
                    TextView textView6 = this.n[i8][i13];
                    if (k96.a0) {
                        i2 = 3;
                    } else {
                        i2 = 5;
                    }
                    textView6.setGravity(i2);
                    frameLayout2.addView(this.n[i8][i13], nme.e(-1, -1, 119));
                }
                if (k96.a0) {
                    j.addView(frameLayout2, nme.r(-2, -1, 51));
                    j.addView(this.h[i8], nme.r(-1, -1, 53));
                } else {
                    j.addView(this.h[i8], nme.r(-2, -1, 51));
                    j.addView(frameLayout2, nme.r(-1, -1, 53));
                }
                this.f[i8] = j;
                if (i8 == 1) {
                    f = 1.0f;
                } else {
                    f = 11.66f;
                }
                float f3 = f;
                if (i8 == 6) {
                    f2 = 16.66f;
                } else {
                    f2 = 0.0f;
                }
                addView(j, nme.u(-1.0f, -2.0f, 51, 18.0f, f3, 28.0f, f2));
            }
            i8++;
        }
        setWillNotDraw(false);
    }

    public final void a(org.telegram.tgnet.tl.TL_account.TL_businessWorkHours r31, boolean r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br8.a(org.telegram.tgnet.tl.TL_account$TL_businessWorkHours, boolean, boolean, boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.F) {
            Paint U0 = bkb.U0("paintDivider", this.a);
            if (U0 == null) {
                U0 = bkb.j0;
            }
            Paint paint = U0;
            float f2 = 21.33f;
            if (k96.a0) {
                f = 0.0f;
            } else {
                f = 21.33f;
            }
            float L = gl.L(f);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!k96.a0) {
                f2 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - gl.L(f2), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int L;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (!this.G) {
            int L2 = gl.L(60.0f);
            int i3 = this.x;
            ii2 ii2Var = this.r;
            if (i3 <= 2 && ii2Var.getVisibility() != 0) {
                L = 0;
            } else {
                int L3 = gl.L(15.0f) + this.y;
                if (ii2Var.getVisibility() == 0) {
                    f = 21.0f;
                } else {
                    f = 0.0f;
                }
                L = gl.L(f) + L3;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max(L2, L) + (this.F ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ii2 ii2Var = this.r;
        if (ii2Var != null && ii2Var.getVisibility() == 0) {
            float x = motionEvent.getX();
            ViewGroup[] viewGroupArr = this.f;
            float x2 = x - viewGroupArr[0].getX();
            FrameLayout frameLayout = this.e;
            FrameLayout frameLayout2 = this.s;
            return ii2Var.getClickBounds().contains((int) (((x2 - frameLayout.getX()) - frameLayout2.getX()) - ii2Var.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - ii2Var.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        ii2 ii2Var = this.r;
        if (ii2Var != null) {
            ii2Var.setOnClickListener(onClickListener);
        }
    }
}
