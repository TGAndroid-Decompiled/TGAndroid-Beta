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
import bi.v2;
import c8.na;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.aq;
public abstract class i1 extends LinearLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public final i6 f18435a;
    public final TextView f18436b;
    public final TextView[] f18437c;
    public final ImageView d;
    public final FrameLayout f18438e;
    public final ViewGroup[] f18439f;
    public final TextView[] h;
    public final TextView[][] f18440n;
    public final aq f18441r;
    public final FrameLayout f18442s;
    public final LinearLayout f18443w;
    public int f18444x;
    public int f18445y;

    public i1(Context context, i6 i6Var) {
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
        this.f18437c = new TextView[2];
        this.f18439f = new ViewGroup[7];
        this.h = new TextView[7];
        this.f18440n = new TextView[7];
        this.f18444x = 1;
        this.f18445y = 0;
        this.E = true;
        this.f18435a = i6Var;
        setOrientation(1);
        setClipChildren(false);
        int i16 = 0;
        for (int i17 = 7; i16 < i17; i17 = 7) {
            if (i16 == 0) {
                ViewGroup v2Var = new v2(context, 6);
                v2Var.setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
                TextView textView = new TextView(context);
                this.f18436b = textView;
                if (gd.f24314a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView.setGravity(i11);
                textView.setTextSize(1, 16.0f);
                v2Var.addView(textView, na.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i16] = new TextView(context);
                TextView textView2 = this.h[i16];
                if (gd.f24314a0) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView2.setGravity(i12);
                this.h[i16].setTextSize(1, 13.0f);
                u6.U(this.h[i16], n6.f29862z6, i6Var);
                v2Var.addView(this.h[i16], na.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.f18443w = linearLayout;
                linearLayout.setOrientation(1);
                this.f18442s = new FrameLayout(context);
                this.f18440n[i16] = new TextView[2];
                for (int i18 = 0; i18 < 2; i18++) {
                    this.f18440n[i16][i18] = new TextView(context);
                    this.f18440n[i16][i18].setTextSize(1, 14.0f);
                    u6.U(this.f18440n[i16][i18], n6.f29862z6, i6Var);
                    TextView textView3 = this.f18440n[i16][i18];
                    if (gd.f24314a0) {
                        i15 = 3;
                    } else {
                        i15 = 5;
                    }
                    textView3.setGravity(i15);
                    this.f18442s.addView(this.f18440n[i16][i18], na.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i19 = 0; i19 < 2; i19++) {
                    this.f18437c[i19] = new TextView(context);
                    this.f18437c[i19].setTextSize(1, 14.0f);
                    u6.U(this.f18437c[i19], n6.f29862z6, i6Var);
                    TextView textView4 = this.f18437c[i19];
                    if (gd.f24314a0) {
                        i14 = 3;
                    } else {
                        i14 = 5;
                    }
                    textView4.setGravity(i14);
                    this.f18442s.addView(this.f18437c[i19], na.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(2131230871);
                u6.s(imageView, n6.f29862z6, i6Var, PorterDuff.Mode.SRC_IN);
                this.f18442s.addView(imageView, na.h(20.0f, 20.0f, 8388629));
                this.f18443w.addView(this.f18442s, new LinearLayout.LayoutParams(na.z(-1.0f), na.z(-1.0f), Gravity.getAbsoluteGravity(119, gd.f24314a0 ? 1 : 0)));
                aq aqVar = new aq(context);
                this.f18441r = aqVar;
                aqVar.getDrawable().M = true;
                aqVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
                aqVar.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                if (gd.f24314a0) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                aqVar.setGravity(i13);
                int L = org.telegram.messenger.g0.L(8.0f);
                int i20 = n6.f29651o6;
                int w02 = n6.w0(i20, i6Var);
                a(w02);
                int r12 = n6.r1(0.1f, w02);
                int w03 = n6.w0(i20, i6Var);
                a(w03);
                int r13 = n6.r1(0.22f, w03);
                aqVar.setBackground(n6.k0(L, L, L, L, r12, r13, r13));
                int w04 = n6.w0(i20, i6Var);
                a(w04);
                aqVar.setTextColor(w04);
                aqVar.getDrawable().B = 0.6f;
                aqVar.setVisibility(8);
                this.f18443w.addView(aqVar, na.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.f18438e = frameLayout;
                frameLayout.addView(this.f18443w, na.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                v2Var.addView(frameLayout, na.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f18439f[i16] = v2Var;
                addView(v2Var, na.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup g10 = f3.g(context, 0);
                this.h[i16] = new TextView(context);
                this.h[i16].setTextSize(1, 14.0f);
                u6.U(this.h[i16], n6.G6, i6Var);
                TextView textView5 = this.h[i16];
                if (gd.f24314a0) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                textView5.setGravity(i7);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.f18440n[i16] = new TextView[2];
                for (int i21 = 0; i21 < 2; i21++) {
                    this.f18440n[i16][i21] = new TextView(context);
                    this.f18440n[i16][i21].setTextSize(1, 14.0f);
                    u6.U(this.f18440n[i16][i21], n6.f29862z6, i6Var);
                    TextView textView6 = this.f18440n[i16][i21];
                    if (gd.f24314a0) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    textView6.setGravity(i10);
                    frameLayout2.addView(this.f18440n[i16][i21], na.e(-1, -1, 119));
                }
                if (gd.f24314a0) {
                    g10.addView(frameLayout2, na.r(-2, -1, 51));
                    g10.addView(this.h[i16], na.r(-1, -1, 53));
                } else {
                    g10.addView(this.h[i16], na.r(-2, -1, 51));
                    g10.addView(frameLayout2, na.r(-1, -1, 53));
                }
                this.f18439f[i16] = g10;
                if (i16 == 1) {
                    f10 = 1.0f;
                } else {
                    f10 = 11.66f;
                }
                float f12 = f10;
                if (i16 == 6) {
                    f11 = 16.66f;
                } else {
                    f11 = 0.0f;
                }
                addView(g10, na.u(-1.0f, -2.0f, 51, 18.0f, f12, 28.0f, f11));
            }
            i16++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i7);

    public final void b(org.telegram.tgnet.tl.TL_account.TL_businessWorkHours r31, boolean r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: kg.i1.b(org.telegram.tgnet.tl.TL_account$TL_businessWorkHours, boolean, boolean, boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.F) {
            Paint W0 = n6.W0("paintDivider", this.f18435a);
            if (W0 == null) {
                W0 = n6.f29574k0;
            }
            Paint paint = W0;
            float f11 = 21.33f;
            if (gd.f24314a0) {
                f10 = 0.0f;
            } else {
                f10 = 21.33f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!gd.f24314a0) {
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
            int i11 = this.f18444x;
            aq aqVar = this.f18441r;
            if (i11 <= 2 && aqVar.getVisibility() != 0) {
                L = 0;
            } else {
                int L3 = org.telegram.messenger.g0.L(15.0f) + this.f18445y;
                if (aqVar.getVisibility() == 0) {
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
        aq aqVar = this.f18441r;
        if (aqVar != null && aqVar.getVisibility() == 0) {
            float x10 = motionEvent.getX();
            ViewGroup[] viewGroupArr = this.f18439f;
            float x11 = x10 - viewGroupArr[0].getX();
            FrameLayout frameLayout = this.f18438e;
            float x12 = x11 - frameLayout.getX();
            FrameLayout frameLayout2 = this.f18442s;
            return aqVar.getClickBounds().contains((int) ((x12 - frameLayout2.getX()) - aqVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - aqVar.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        aq aqVar = this.f18441r;
        if (aqVar != null) {
            aqVar.setOnClickListener(onClickListener);
        }
    }
}
