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
public abstract class lu8 extends LinearLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public final vnb a;
    public final TextView b;
    public final TextView[] c;
    public final ImageView d;
    public final FrameLayout e;
    public final ViewGroup[] f;
    public final TextView[] h;
    public final TextView[][] n;
    public final ej2 r;
    public final FrameLayout s;
    public final LinearLayout w;
    public int x;
    public int y;

    public lu8(Context context, vnb vnbVar) {
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
        this.a = vnbVar;
        setOrientation(1);
        setClipChildren(false);
        int i8 = 0;
        for (int i9 = 7; i8 < i9; i9 = 7) {
            if (i8 == 0) {
                ViewGroup ir8Var = new ir8(context, (byte) 1);
                ir8Var.setMinimumHeight(hl.L(60.0f));
                TextView textView = new TextView(context);
                this.b = textView;
                if (ob6.a0) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                textView.setGravity(i3);
                textView.setTextSize(1, 16.0f);
                ir8Var.addView(textView, tre.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i8] = new TextView(context);
                TextView textView2 = this.h[i8];
                if (ob6.a0) {
                    i4 = 5;
                } else {
                    i4 = 3;
                }
                textView2.setGravity(i4);
                this.h[i8].setTextSize(1, 13.0f);
                yob.X(this.h[i8], aob.z6, vnbVar);
                ir8Var.addView(this.h[i8], tre.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.w = linearLayout;
                linearLayout.setOrientation(1);
                this.s = new FrameLayout(context);
                this.n[i8] = new TextView[2];
                for (int i10 = 0; i10 < 2; i10++) {
                    this.n[i8][i10] = new TextView(context);
                    this.n[i8][i10].setTextSize(1, 14.0f);
                    yob.X(this.n[i8][i10], aob.z6, vnbVar);
                    TextView textView3 = this.n[i8][i10];
                    if (ob6.a0) {
                        i7 = 3;
                    } else {
                        i7 = 5;
                    }
                    textView3.setGravity(i7);
                    this.s.addView(this.n[i8][i10], tre.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i11 = 0; i11 < 2; i11++) {
                    this.c[i11] = new TextView(context);
                    this.c[i11].setTextSize(1, 14.0f);
                    yob.X(this.c[i11], aob.z6, vnbVar);
                    TextView textView4 = this.c[i11];
                    if (ob6.a0) {
                        i6 = 3;
                    } else {
                        i6 = 5;
                    }
                    textView4.setGravity(i6);
                    this.s.addView(this.c[i11], tre.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(2131230871);
                yob.s(imageView, aob.z6, vnbVar, PorterDuff.Mode.SRC_IN);
                this.s.addView(imageView, tre.h(20.0f, 20.0f, 8388629));
                this.w.addView(this.s, new LinearLayout.LayoutParams(tre.z(-1.0f), tre.z(-1.0f), Gravity.getAbsoluteGravity(119, ob6.a0 ? 1 : 0)));
                ej2 ej2Var = new ej2(context);
                this.r = ej2Var;
                ej2Var.getDrawable().M = true;
                ej2Var.setTextSize(hl.L(13.0f));
                ej2Var.setPadding(hl.L(6.0f), 0, hl.L(6.0f), 0);
                if (ob6.a0) {
                    i5 = 3;
                } else {
                    i5 = 5;
                }
                ej2Var.setGravity(i5);
                int L = hl.L(8.0f);
                int i12 = aob.o6;
                int v0 = aob.v0(i12, vnbVar);
                RectF rectF = ProfileActivity.Z6;
                int p1 = aob.p1(0.1f, v0);
                int p12 = aob.p1(0.22f, aob.v0(i12, vnbVar));
                ej2Var.setBackground(aob.i0(L, L, L, L, p1, p12, p12));
                ej2Var.setTextColor(aob.v0(i12, vnbVar));
                ej2Var.getDrawable().B = 0.6f;
                ej2Var.setVisibility(8);
                this.w.addView(ej2Var, tre.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.e = frameLayout;
                frameLayout.addView(this.w, tre.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                ir8Var.addView(frameLayout, tre.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f[i8] = ir8Var;
                addView(ir8Var, tre.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup j = uh9.j(context, 0);
                this.h[i8] = new TextView(context);
                this.h[i8].setTextSize(1, 14.0f);
                yob.X(this.h[i8], aob.G6, vnbVar);
                TextView textView5 = this.h[i8];
                if (ob6.a0) {
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
                    yob.X(this.n[i8][i13], aob.z6, vnbVar);
                    TextView textView6 = this.n[i8][i13];
                    if (ob6.a0) {
                        i2 = 3;
                    } else {
                        i2 = 5;
                    }
                    textView6.setGravity(i2);
                    frameLayout2.addView(this.n[i8][i13], tre.e(-1, -1, 119));
                }
                if (ob6.a0) {
                    j.addView(frameLayout2, tre.r(-2, -1, 51));
                    j.addView(this.h[i8], tre.r(-1, -1, 53));
                } else {
                    j.addView(this.h[i8], tre.r(-2, -1, 51));
                    j.addView(frameLayout2, tre.r(-1, -1, 53));
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
                addView(j, tre.u(-1.0f, -2.0f, 51, 18.0f, f3, 28.0f, f2));
            }
            i8++;
        }
        setWillNotDraw(false);
    }

    public final void a(org.telegram.tgnet.tl.TL_account.TL_businessWorkHours r31, boolean r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu8.a(org.telegram.tgnet.tl.TL_account$TL_businessWorkHours, boolean, boolean, boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.F) {
            Paint U0 = aob.U0("paintDivider", this.a);
            if (U0 == null) {
                U0 = aob.j0;
            }
            Paint paint = U0;
            float f2 = 21.33f;
            if (ob6.a0) {
                f = 0.0f;
            } else {
                f = 21.33f;
            }
            float L = hl.L(f);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!ob6.a0) {
                f2 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - hl.L(f2), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int L;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (!this.G) {
            int L2 = hl.L(60.0f);
            int i3 = this.x;
            ej2 ej2Var = this.r;
            if (i3 <= 2 && ej2Var.getVisibility() != 0) {
                L = 0;
            } else {
                int L3 = hl.L(15.0f) + this.y;
                if (ej2Var.getVisibility() == 0) {
                    f = 21.0f;
                } else {
                    f = 0.0f;
                }
                L = hl.L(f) + L3;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max(L2, L) + (this.F ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ej2 ej2Var = this.r;
        if (ej2Var != null && ej2Var.getVisibility() == 0) {
            float x = motionEvent.getX();
            ViewGroup[] viewGroupArr = this.f;
            float x2 = x - viewGroupArr[0].getX();
            FrameLayout frameLayout = this.e;
            FrameLayout frameLayout2 = this.s;
            return ej2Var.getClickBounds().contains((int) (((x2 - frameLayout.getX()) - frameLayout2.getX()) - ej2Var.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - ej2Var.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        ej2 ej2Var = this.r;
        if (ej2Var != null) {
            ej2Var.setOnClickListener(onClickListener);
        }
    }
}
