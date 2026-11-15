package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.up;
public abstract class f1 extends LinearLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public final e6 f17930a;
    public final TextView f17931b;
    public final TextView[] f17932c;
    public final ImageView d;
    public final FrameLayout f17933e;
    public final ViewGroup[] f17934f;
    public final TextView[] h;
    public final TextView[][] f17935n;
    public final up f17936r;
    public final FrameLayout f17937s;
    public final LinearLayout f17938w;
    public int f17939x;
    public int f17940y;

    public f1(Context context, e6 e6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f17932c = new TextView[2];
        this.f17934f = new ViewGroup[7];
        this.h = new TextView[7];
        this.f17935n = new TextView[7];
        this.f17939x = 1;
        this.f17940y = 0;
        this.E = true;
        this.f17930a = e6Var;
        setOrientation(1);
        setClipChildren(false);
        int i16 = 0;
        for (int i17 = 7; i16 < i17; i17 = 7) {
            if (i16 == 0) {
                ViewGroup v1Var = new bi.v1(context, 6);
                v1Var.setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
                TextView textView = new TextView(context);
                this.f17931b = textView;
                if (hd.f24104a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView.setGravity(i11);
                textView.setTextSize(1, 16.0f);
                v1Var.addView(textView, ja.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i16] = new TextView(context);
                TextView textView2 = this.h[i16];
                if (hd.f24104a0) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView2.setGravity(i12);
                this.h[i16].setTextSize(1, 13.0f);
                q6.U(this.h[i16], j6.f29260z6, e6Var);
                v1Var.addView(this.h[i16], ja.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.f17938w = linearLayout;
                linearLayout.setOrientation(1);
                this.f17937s = new FrameLayout(context);
                this.f17935n[i16] = new TextView[2];
                for (int i18 = 0; i18 < 2; i18++) {
                    this.f17935n[i16][i18] = new TextView(context);
                    this.f17935n[i16][i18].setTextSize(1, 14.0f);
                    q6.U(this.f17935n[i16][i18], j6.f29260z6, e6Var);
                    TextView textView3 = this.f17935n[i16][i18];
                    if (hd.f24104a0) {
                        i15 = 3;
                    } else {
                        i15 = 5;
                    }
                    textView3.setGravity(i15);
                    this.f17937s.addView(this.f17935n[i16][i18], ja.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i19 = 0; i19 < 2; i19++) {
                    this.f17932c[i19] = new TextView(context);
                    this.f17932c[i19].setTextSize(1, 14.0f);
                    q6.U(this.f17932c[i19], j6.f29260z6, e6Var);
                    TextView textView4 = this.f17932c[i19];
                    if (hd.f24104a0) {
                        i14 = 3;
                    } else {
                        i14 = 5;
                    }
                    textView4.setGravity(i14);
                    this.f17937s.addView(this.f17932c[i19], ja.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(2131230871);
                q6.s(imageView, j6.f29260z6, e6Var, PorterDuff.Mode.SRC_IN);
                this.f17937s.addView(imageView, ja.h(20.0f, 20.0f, 8388629));
                this.f17938w.addView(this.f17937s, new LinearLayout.LayoutParams(ja.z(-1.0f), ja.z(-1.0f), Gravity.getAbsoluteGravity(119, hd.f24104a0 ? 1 : 0)));
                up upVar = new up(context);
                this.f17936r = upVar;
                upVar.getDrawable().M = true;
                upVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
                upVar.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                if (hd.f24104a0) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                upVar.setGravity(i13);
                int L = org.telegram.messenger.g0.L(8.0f);
                int i20 = j6.f29049o6;
                int w02 = j6.w0(i20, e6Var);
                a(w02);
                int r12 = j6.r1(0.1f, w02);
                int w03 = j6.w0(i20, e6Var);
                a(w03);
                int r13 = j6.r1(0.22f, w03);
                upVar.setBackground(j6.k0(L, L, L, L, r12, r13, r13));
                int w04 = j6.w0(i20, e6Var);
                a(w04);
                upVar.setTextColor(w04);
                upVar.getDrawable().B = 0.6f;
                upVar.setVisibility(8);
                this.f17938w.addView(upVar, ja.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.f17933e = frameLayout;
                frameLayout.addView(this.f17938w, ja.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                v1Var.addView(frameLayout, ja.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f17934f[i16] = v1Var;
                addView(v1Var, ja.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup f12 = k5.f(context, 0);
                this.h[i16] = new TextView(context);
                this.h[i16].setTextSize(1, 14.0f);
                q6.U(this.h[i16], j6.G6, e6Var);
                TextView textView5 = this.h[i16];
                if (hd.f24104a0) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                textView5.setGravity(i7);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.f17935n[i16] = new TextView[2];
                for (int i21 = 0; i21 < 2; i21++) {
                    this.f17935n[i16][i21] = new TextView(context);
                    this.f17935n[i16][i21].setTextSize(1, 14.0f);
                    q6.U(this.f17935n[i16][i21], j6.f29260z6, e6Var);
                    TextView textView6 = this.f17935n[i16][i21];
                    if (hd.f24104a0) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    textView6.setGravity(i10);
                    frameLayout2.addView(this.f17935n[i16][i21], ja.e(-1, -1, 119));
                }
                if (hd.f24104a0) {
                    f12.addView(frameLayout2, ja.r(-2, -1, 51));
                    f12.addView(this.h[i16], ja.r(-1, -1, 53));
                } else {
                    f12.addView(this.h[i16], ja.r(-2, -1, 51));
                    f12.addView(frameLayout2, ja.r(-1, -1, 53));
                }
                this.f17934f[i16] = f12;
                if (i16 == 1) {
                    f10 = 1.0f;
                } else {
                    f10 = 11.66f;
                }
                float f13 = f10;
                if (i16 == 6) {
                    f11 = 16.66f;
                } else {
                    f11 = 0.0f;
                }
                addView(f12, ja.u(-1.0f, -2.0f, 51, 18.0f, f13, 28.0f, f11));
            }
            i16++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i7);

    public final void b(org.telegram.tgnet.tl.TL_account.TL_businessWorkHours r31, boolean r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: kg.f1.b(org.telegram.tgnet.tl.TL_account$TL_businessWorkHours, boolean, boolean, boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.F) {
            Paint W0 = j6.W0("paintDivider", this.f17930a);
            if (W0 == null) {
                W0 = j6.f28972k0;
            }
            Paint paint = W0;
            float f11 = 21.33f;
            if (hd.f24104a0) {
                f10 = 0.0f;
            } else {
                f10 = 21.33f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!hd.f24104a0) {
                f11 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - org.telegram.messenger.g0.L(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int L;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (!this.G) {
            int L2 = org.telegram.messenger.g0.L(60.0f);
            int i11 = this.f17939x;
            up upVar = this.f17936r;
            if (i11 <= 2 && upVar.getVisibility() != 0) {
                L = 0;
            } else {
                int L3 = org.telegram.messenger.g0.L(15.0f) + this.f17940y;
                if (upVar.getVisibility() == 0) {
                    f10 = 21.0f;
                } else {
                    f10 = 0.0f;
                }
                L = org.telegram.messenger.g0.L(f10) + L3;
            }
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max(L2, L) + (this.F ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        up upVar = this.f17936r;
        if (upVar != null && upVar.getVisibility() == 0) {
            float x10 = motionEvent.getX();
            ViewGroup[] viewGroupArr = this.f17934f;
            float x11 = x10 - viewGroupArr[0].getX();
            FrameLayout frameLayout = this.f17933e;
            float x12 = x11 - frameLayout.getX();
            FrameLayout frameLayout2 = this.f17937s;
            return upVar.getClickBounds().contains((int) ((x12 - frameLayout2.getX()) - upVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - upVar.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        up upVar = this.f17936r;
        if (upVar != null) {
            upVar.setOnClickListener(onClickListener);
        }
    }
}
