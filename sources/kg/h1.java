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
import bi.t2;
import c8.ma;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dq;
public abstract class h1 extends LinearLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public final h6 f18366a;
    public final TextView f18367b;
    public final TextView[] f18368c;
    public final ImageView d;
    public final FrameLayout f18369e;
    public final ViewGroup[] f18370f;
    public final TextView[] h;
    public final TextView[][] f18371n;
    public final dq f18372r;
    public final FrameLayout f18373s;
    public final LinearLayout f18374w;
    public int f18375x;
    public int f18376y;

    public h1(Context context, h6 h6Var) {
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
        this.f18368c = new TextView[2];
        this.f18370f = new ViewGroup[7];
        this.h = new TextView[7];
        this.f18371n = new TextView[7];
        this.f18375x = 1;
        this.f18376y = 0;
        this.E = true;
        this.f18366a = h6Var;
        setOrientation(1);
        setClipChildren(false);
        int i16 = 0;
        for (int i17 = 7; i16 < i17; i17 = 7) {
            if (i16 == 0) {
                ViewGroup t2Var = new t2(context, 6);
                t2Var.setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
                TextView textView = new TextView(context);
                this.f18367b = textView;
                if (gd.f24241a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView.setGravity(i11);
                textView.setTextSize(1, 16.0f);
                t2Var.addView(textView, ma.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i16] = new TextView(context);
                TextView textView2 = this.h[i16];
                if (gd.f24241a0) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView2.setGravity(i12);
                this.h[i16].setTextSize(1, 13.0f);
                t6.U(this.h[i16], m6.f29789z6, h6Var);
                t2Var.addView(this.h[i16], ma.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.f18374w = linearLayout;
                linearLayout.setOrientation(1);
                this.f18373s = new FrameLayout(context);
                this.f18371n[i16] = new TextView[2];
                for (int i18 = 0; i18 < 2; i18++) {
                    this.f18371n[i16][i18] = new TextView(context);
                    this.f18371n[i16][i18].setTextSize(1, 14.0f);
                    t6.U(this.f18371n[i16][i18], m6.f29789z6, h6Var);
                    TextView textView3 = this.f18371n[i16][i18];
                    if (gd.f24241a0) {
                        i15 = 3;
                    } else {
                        i15 = 5;
                    }
                    textView3.setGravity(i15);
                    this.f18373s.addView(this.f18371n[i16][i18], ma.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i19 = 0; i19 < 2; i19++) {
                    this.f18368c[i19] = new TextView(context);
                    this.f18368c[i19].setTextSize(1, 14.0f);
                    t6.U(this.f18368c[i19], m6.f29789z6, h6Var);
                    TextView textView4 = this.f18368c[i19];
                    if (gd.f24241a0) {
                        i14 = 3;
                    } else {
                        i14 = 5;
                    }
                    textView4.setGravity(i14);
                    this.f18373s.addView(this.f18368c[i19], ma.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(2131230871);
                t6.s(imageView, m6.f29789z6, h6Var, PorterDuff.Mode.SRC_IN);
                this.f18373s.addView(imageView, ma.h(20.0f, 20.0f, 8388629));
                this.f18374w.addView(this.f18373s, new LinearLayout.LayoutParams(ma.z(-1.0f), ma.z(-1.0f), Gravity.getAbsoluteGravity(119, gd.f24241a0 ? 1 : 0)));
                dq dqVar = new dq(context);
                this.f18372r = dqVar;
                dqVar.getDrawable().M = true;
                dqVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
                dqVar.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                if (gd.f24241a0) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                dqVar.setGravity(i13);
                int L = org.telegram.messenger.g0.L(8.0f);
                int i20 = m6.f29578o6;
                int w02 = m6.w0(i20, h6Var);
                a(w02);
                int r12 = m6.r1(0.1f, w02);
                int w03 = m6.w0(i20, h6Var);
                a(w03);
                int r13 = m6.r1(0.22f, w03);
                dqVar.setBackground(m6.k0(L, L, L, L, r12, r13, r13));
                int w04 = m6.w0(i20, h6Var);
                a(w04);
                dqVar.setTextColor(w04);
                dqVar.getDrawable().B = 0.6f;
                dqVar.setVisibility(8);
                this.f18374w.addView(dqVar, ma.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.f18369e = frameLayout;
                frameLayout.addView(this.f18374w, ma.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                t2Var.addView(frameLayout, ma.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f18370f[i16] = t2Var;
                addView(t2Var, ma.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup g10 = f3.g(context, 0);
                this.h[i16] = new TextView(context);
                this.h[i16].setTextSize(1, 14.0f);
                t6.U(this.h[i16], m6.G6, h6Var);
                TextView textView5 = this.h[i16];
                if (gd.f24241a0) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                textView5.setGravity(i7);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.f18371n[i16] = new TextView[2];
                for (int i21 = 0; i21 < 2; i21++) {
                    this.f18371n[i16][i21] = new TextView(context);
                    this.f18371n[i16][i21].setTextSize(1, 14.0f);
                    t6.U(this.f18371n[i16][i21], m6.f29789z6, h6Var);
                    TextView textView6 = this.f18371n[i16][i21];
                    if (gd.f24241a0) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    textView6.setGravity(i10);
                    frameLayout2.addView(this.f18371n[i16][i21], ma.e(-1, -1, 119));
                }
                if (gd.f24241a0) {
                    g10.addView(frameLayout2, ma.r(-2, -1, 51));
                    g10.addView(this.h[i16], ma.r(-1, -1, 53));
                } else {
                    g10.addView(this.h[i16], ma.r(-2, -1, 51));
                    g10.addView(frameLayout2, ma.r(-1, -1, 53));
                }
                this.f18370f[i16] = g10;
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
                addView(g10, ma.u(-1.0f, -2.0f, 51, 18.0f, f12, 28.0f, f11));
            }
            i16++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i7);

    public final void b(org.telegram.tgnet.tl.TL_account.TL_businessWorkHours r31, boolean r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: kg.h1.b(org.telegram.tgnet.tl.TL_account$TL_businessWorkHours, boolean, boolean, boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.F) {
            Paint W0 = m6.W0("paintDivider", this.f18366a);
            if (W0 == null) {
                W0 = m6.f29501k0;
            }
            Paint paint = W0;
            float f11 = 21.33f;
            if (gd.f24241a0) {
                f10 = 0.0f;
            } else {
                f10 = 21.33f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!gd.f24241a0) {
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
            int i11 = this.f18375x;
            dq dqVar = this.f18372r;
            if (i11 <= 2 && dqVar.getVisibility() != 0) {
                L = 0;
            } else {
                int L3 = org.telegram.messenger.g0.L(15.0f) + this.f18376y;
                if (dqVar.getVisibility() == 0) {
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
        dq dqVar = this.f18372r;
        if (dqVar != null && dqVar.getVisibility() == 0) {
            float x10 = motionEvent.getX();
            ViewGroup[] viewGroupArr = this.f18370f;
            float x11 = x10 - viewGroupArr[0].getX();
            FrameLayout frameLayout = this.f18369e;
            float x12 = x11 - frameLayout.getX();
            FrameLayout frameLayout2 = this.f18373s;
            return dqVar.getClickBounds().contains((int) ((x12 - frameLayout2.getX()) - dqVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - dqVar.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        dq dqVar = this.f18372r;
        if (dqVar != null) {
            dqVar.setOnClickListener(onClickListener);
        }
    }
}
