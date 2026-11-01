package ag;

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
import org.telegram.messenger.dd;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Components.tp;
import w7.b6;
public abstract class k2 extends LinearLayout {
    public boolean D;
    public boolean E;
    public boolean F;
    public final p6 f604a;
    public final TextView f605b;
    public final TextView[] f606c;
    public final ImageView d;
    public final FrameLayout e;
    public final ViewGroup[] f607f;
    public final TextView[] h;
    public final TextView[][] f608n;
    public final tp f609r;
    public final FrameLayout f610s;
    public final LinearLayout f611w;
    public int f612x;
    public int f613y;

    public k2(Context context, p6 p6Var) {
        super(context);
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f606c = new TextView[2];
        this.f607f = new ViewGroup[7];
        this.h = new TextView[7];
        this.f608n = new TextView[7];
        this.f612x = 1;
        this.f613y = 0;
        this.D = true;
        this.f604a = p6Var;
        setOrientation(1);
        setClipChildren(false);
        int i17 = 0;
        for (int i18 = 7; i17 < i18; i18 = 7) {
            if (i17 == 0) {
                ViewGroup a5Var = new a5(context, 2);
                a5Var.setMinimumHeight(org.telegram.messenger.i0.L(60.0f));
                TextView textView = new TextView(context);
                this.f605b = textView;
                if (dd.X) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView.setGravity(i12);
                textView.setTextSize(1, 16.0f);
                a5Var.addView(textView, b6.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i17] = new TextView(context);
                TextView textView2 = this.h[i17];
                if (dd.X) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView2.setGravity(i13);
                this.h[i17].setTextSize(1, 13.0f);
                a7.V(this.h[i17], t6.f21331z6, p6Var);
                a5Var.addView(this.h[i17], b6.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.f611w = linearLayout;
                linearLayout.setOrientation(1);
                this.f610s = new FrameLayout(context);
                this.f608n[i17] = new TextView[2];
                for (int i19 = 0; i19 < 2; i19++) {
                    this.f608n[i17][i19] = new TextView(context);
                    this.f608n[i17][i19].setTextSize(1, 14.0f);
                    a7.V(this.f608n[i17][i19], t6.f21331z6, p6Var);
                    TextView textView3 = this.f608n[i17][i19];
                    if (dd.X) {
                        i16 = 3;
                    } else {
                        i16 = 5;
                    }
                    textView3.setGravity(i16);
                    this.f610s.addView(this.f608n[i17][i19], b6.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i20 = 0; i20 < 2; i20++) {
                    this.f606c[i20] = new TextView(context);
                    this.f606c[i20].setTextSize(1, 14.0f);
                    a7.V(this.f606c[i20], t6.f21331z6, p6Var);
                    TextView textView4 = this.f606c[i20];
                    if (dd.X) {
                        i15 = 3;
                    } else {
                        i15 = 5;
                    }
                    textView4.setGravity(i15);
                    this.f610s.addView(this.f606c[i20], b6.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(2131230871);
                a7.t(imageView, t6.f21331z6, p6Var, PorterDuff.Mode.SRC_IN);
                this.f610s.addView(imageView, b6.h(20.0f, 20.0f, 8388629));
                this.f611w.addView(this.f610s, new LinearLayout.LayoutParams(b6.z(-1.0f), b6.z(-1.0f), Gravity.getAbsoluteGravity(119, dd.X ? 1 : 0)));
                tp tpVar = new tp(context);
                this.f609r = tpVar;
                tpVar.getDrawable().L = true;
                tpVar.setTextSize(org.telegram.messenger.i0.L(13.0f));
                tpVar.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), 0);
                if (dd.X) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                tpVar.setGravity(i14);
                int L = org.telegram.messenger.i0.L(8.0f);
                int i21 = t6.f21135o6;
                int w02 = t6.w0(i21, p6Var);
                a(w02);
                int r12 = t6.r1(0.1f, w02);
                int w03 = t6.w0(i21, p6Var);
                a(w03);
                int r13 = t6.r1(0.22f, w03);
                tpVar.setBackground(t6.k0(L, L, L, L, r12, r13, r13));
                int w04 = t6.w0(i21, p6Var);
                a(w04);
                tpVar.setTextColor(w04);
                tpVar.getDrawable().A = 0.6f;
                tpVar.setVisibility(8);
                this.f611w.addView(tpVar, b6.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.e = frameLayout;
                frameLayout.addView(this.f611w, b6.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                a5Var.addView(frameLayout, b6.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f607f[i17] = a5Var;
                addView(a5Var, b6.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup f11 = m5.f(context, 0);
                this.h[i17] = new TextView(context);
                this.h[i17].setTextSize(1, 14.0f);
                a7.V(this.h[i17], t6.G6, p6Var);
                TextView textView5 = this.h[i17];
                if (dd.X) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView5.setGravity(i10);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.f608n[i17] = new TextView[2];
                for (int i22 = 0; i22 < 2; i22++) {
                    this.f608n[i17][i22] = new TextView(context);
                    this.f608n[i17][i22].setTextSize(1, 14.0f);
                    a7.V(this.f608n[i17][i22], t6.f21331z6, p6Var);
                    TextView textView6 = this.f608n[i17][i22];
                    if (dd.X) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    textView6.setGravity(i11);
                    frameLayout2.addView(this.f608n[i17][i22], b6.e(-1, -1, 119));
                }
                if (dd.X) {
                    f11.addView(frameLayout2, b6.r(-2, -1, 51));
                    f11.addView(this.h[i17], b6.r(-1, -1, 53));
                } else {
                    f11.addView(this.h[i17], b6.r(-2, -1, 51));
                    f11.addView(frameLayout2, b6.r(-1, -1, 53));
                }
                this.f607f[i17] = f11;
                if (i17 == 1) {
                    f7 = 1.0f;
                } else {
                    f7 = 11.66f;
                }
                float f12 = f7;
                if (i17 == 6) {
                    f10 = 16.66f;
                } else {
                    f10 = 0.0f;
                }
                addView(f11, b6.u(-1.0f, -2.0f, 51, 18.0f, f12, 28.0f, f10));
            }
            i17++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i10);

    public final void b(org.telegram.tgnet.tl.TL_account.TL_businessWorkHours r31, boolean r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: ag.k2.b(org.telegram.tgnet.tl.TL_account$TL_businessWorkHours, boolean, boolean, boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.E) {
            Paint W0 = t6.W0("paintDivider", this.f604a);
            if (W0 == null) {
                W0 = t6.f21053k0;
            }
            Paint paint = W0;
            float f10 = 21.33f;
            if (dd.X) {
                f7 = 0.0f;
            } else {
                f7 = 21.33f;
            }
            float L = org.telegram.messenger.i0.L(f7);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!dd.X) {
                f10 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - org.telegram.messenger.i0.L(f10), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int L;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (!this.F) {
            int L2 = org.telegram.messenger.i0.L(60.0f);
            int i12 = this.f612x;
            tp tpVar = this.f609r;
            if (i12 <= 2 && tpVar.getVisibility() != 0) {
                L = 0;
            } else {
                int L3 = org.telegram.messenger.i0.L(15.0f) + this.f613y;
                if (tpVar.getVisibility() == 0) {
                    f7 = 21.0f;
                } else {
                    f7 = 0.0f;
                }
                L = org.telegram.messenger.i0.L(f7) + L3;
            }
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max(L2, L) + (this.E ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tp tpVar = this.f609r;
        if (tpVar != null && tpVar.getVisibility() == 0) {
            float x10 = motionEvent.getX();
            ViewGroup[] viewGroupArr = this.f607f;
            float x11 = x10 - viewGroupArr[0].getX();
            FrameLayout frameLayout = this.e;
            float x12 = x11 - frameLayout.getX();
            FrameLayout frameLayout2 = this.f610s;
            return tpVar.getClickBounds().contains((int) ((x12 - frameLayout2.getX()) - tpVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - tpVar.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        tp tpVar = this.f609r;
        if (tpVar != null) {
            tpVar.setOnClickListener(onClickListener);
        }
    }
}
