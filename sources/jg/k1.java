package jg;

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
import di.i4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.pq;
public abstract class k1 extends LinearLayout {
    public boolean E;
    public boolean F;
    public final u6 f15759a;
    public final TextView f15760b;
    public final TextView[] f15761c;
    public final ImageView d;
    public final FrameLayout e;
    public final ViewGroup[] f15762f;
    public final TextView[] h;
    public final TextView[][] f15763n;
    public final pq f15764r;
    public final FrameLayout f15765s;
    public final LinearLayout v;
    public int f15766w;
    public int f15767x;
    public boolean f15768y;

    public k1(Context context, u6 u6Var) {
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
        this.f15761c = new TextView[2];
        this.f15762f = new ViewGroup[7];
        this.h = new TextView[7];
        this.f15763n = new TextView[7];
        this.f15766w = 1;
        this.f15767x = 0;
        this.f15768y = true;
        this.f15759a = u6Var;
        setOrientation(1);
        setClipChildren(false);
        int i17 = 0;
        for (int i18 = 7; i17 < i18; i18 = 7) {
            if (i17 == 0) {
                ViewGroup i4Var = new i4(context, 4);
                i4Var.setMinimumHeight(AndroidUtilities.dp(60.0f));
                TextView textView = new TextView(context);
                this.f15760b = textView;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView.setGravity(i12);
                textView.setTextSize(1, 16.0f);
                i4Var.addView(textView, kb1.m(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i17] = new TextView(context);
                TextView textView2 = this.h[i17];
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView2.setGravity(i13);
                this.h[i17].setTextSize(1, 13.0f);
                f7.V(this.h[i17], y6.f23768z6, u6Var);
                i4Var.addView(this.h[i17], kb1.m(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.v = linearLayout;
                linearLayout.setOrientation(1);
                this.f15765s = new FrameLayout(context);
                this.f15763n[i17] = new TextView[2];
                for (int i19 = 0; i19 < 2; i19++) {
                    this.f15763n[i17][i19] = new TextView(context);
                    this.f15763n[i17][i19].setTextSize(1, 14.0f);
                    f7.V(this.f15763n[i17][i19], y6.f23768z6, u6Var);
                    TextView textView3 = this.f15763n[i17][i19];
                    if (LocaleController.isRTL) {
                        i16 = 3;
                    } else {
                        i16 = 5;
                    }
                    textView3.setGravity(i16);
                    this.f15765s.addView(this.f15763n[i17][i19], kb1.m(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i20 = 0; i20 < 2; i20++) {
                    this.f15761c[i20] = new TextView(context);
                    this.f15761c[i20].setTextSize(1, 14.0f);
                    f7.V(this.f15761c[i20], y6.f23768z6, u6Var);
                    TextView textView4 = this.f15761c[i20];
                    if (LocaleController.isRTL) {
                        i15 = 3;
                    } else {
                        i15 = 5;
                    }
                    textView4.setGravity(i15);
                    this.f15765s.addView(this.f15761c[i20], kb1.m(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(R.drawable.arrow_more);
                f7.t(imageView, y6.f23768z6, u6Var, PorterDuff.Mode.SRC_IN);
                this.f15765s.addView(imageView, kb1.l(20.0f, 20.0f, 8388629));
                this.v.addView(this.f15765s, new LinearLayout.LayoutParams(kb1.I(-1.0f), kb1.I(-1.0f), Gravity.getAbsoluteGravity(119, LocaleController.isRTL ? 1 : 0)));
                pq pqVar = new pq(context);
                this.f15764r = pqVar;
                pqVar.getDrawable().L = true;
                pqVar.setTextSize(AndroidUtilities.dp(13.0f));
                pqVar.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                if (LocaleController.isRTL) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                pqVar.setGravity(i14);
                int dp = AndroidUtilities.dp(8.0f);
                int i21 = y6.f23561o6;
                int w02 = y6.w0(i21, u6Var);
                a(w02);
                int o12 = y6.o1(0.1f, w02);
                int w03 = y6.w0(i21, u6Var);
                a(w03);
                int o13 = y6.o1(0.22f, w03);
                pqVar.setBackground(y6.j0(dp, dp, dp, dp, o12, o13, o13));
                int w04 = y6.w0(i21, u6Var);
                a(w04);
                pqVar.setTextColor(w04);
                pqVar.getDrawable().A = 0.6f;
                pqVar.setVisibility(8);
                this.v.addView(pqVar, kb1.y(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.e = frameLayout;
                frameLayout.addView(this.v, kb1.m(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                i4Var.addView(frameLayout, kb1.m(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f15762f[i17] = i4Var;
                addView(i4Var, kb1.m(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup d = wh.d(context, 0);
                this.h[i17] = new TextView(context);
                this.h[i17].setTextSize(1, 14.0f);
                f7.V(this.h[i17], y6.G6, u6Var);
                TextView textView5 = this.h[i17];
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView5.setGravity(i10);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.f15763n[i17] = new TextView[2];
                for (int i22 = 0; i22 < 2; i22++) {
                    this.f15763n[i17][i22] = new TextView(context);
                    this.f15763n[i17][i22].setTextSize(1, 14.0f);
                    f7.V(this.f15763n[i17][i22], y6.f23768z6, u6Var);
                    TextView textView6 = this.f15763n[i17][i22];
                    if (LocaleController.isRTL) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    textView6.setGravity(i11);
                    frameLayout2.addView(this.f15763n[i17][i22], kb1.i(-1, -1, 119));
                }
                if (LocaleController.isRTL) {
                    d.addView(frameLayout2, kb1.u(-2, -1, 51));
                    d.addView(this.h[i17], kb1.u(-1, -1, 53));
                } else {
                    d.addView(this.h[i17], kb1.u(-2, -1, 51));
                    d.addView(frameLayout2, kb1.u(-1, -1, 53));
                }
                this.f15762f[i17] = d;
                if (i17 == 1) {
                    f7 = 1.0f;
                } else {
                    f7 = 11.66f;
                }
                float f11 = f7;
                if (i17 == 6) {
                    f10 = 16.66f;
                } else {
                    f10 = 0.0f;
                }
                addView(d, kb1.y(-1.0f, -2.0f, 51, 18.0f, f11, 28.0f, f10));
            }
            i17++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i10);

    public final void b(org.telegram.tgnet.tl.TL_account.TL_businessWorkHours r29, boolean r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: jg.k1.b(org.telegram.tgnet.tl.TL_account$TL_businessWorkHours, boolean, boolean, boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.E) {
            Paint V0 = y6.V0("paintDivider", this.f15759a);
            if (V0 == null) {
                V0 = y6.f23479k0;
            }
            Paint paint = V0;
            float f10 = 21.33f;
            if (LocaleController.isRTL) {
                f7 = 0.0f;
            } else {
                f7 = 21.33f;
            }
            float dp = AndroidUtilities.dp(f7);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f10 = 0.0f;
            }
            canvas.drawRect(dp, measuredHeight, width - AndroidUtilities.dp(f10), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int dp;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (!this.F) {
            int dp2 = AndroidUtilities.dp(60.0f);
            int i12 = this.f15766w;
            pq pqVar = this.f15764r;
            if (i12 <= 2 && pqVar.getVisibility() != 0) {
                dp = 0;
            } else {
                int dp3 = AndroidUtilities.dp(15.0f) + this.f15767x;
                if (pqVar.getVisibility() == 0) {
                    f7 = 21.0f;
                } else {
                    f7 = 0.0f;
                }
                dp = AndroidUtilities.dp(f7) + dp3;
            }
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max(dp2, dp) + (this.E ? 1 : 0), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pq pqVar = this.f15764r;
        if (pqVar != null && pqVar.getVisibility() == 0) {
            float x9 = motionEvent.getX();
            ViewGroup[] viewGroupArr = this.f15762f;
            float x10 = x9 - viewGroupArr[0].getX();
            FrameLayout frameLayout = this.e;
            float x11 = x10 - frameLayout.getX();
            FrameLayout frameLayout2 = this.f15765s;
            return pqVar.getClickBounds().contains((int) ((x11 - frameLayout2.getX()) - pqVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - pqVar.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        pq pqVar = this.f15764r;
        if (pqVar != null) {
            pqVar.setOnClickListener(onClickListener);
        }
    }
}
