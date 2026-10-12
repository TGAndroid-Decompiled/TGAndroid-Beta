package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.i5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.yh;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.qq;
import w7.a6;
public abstract class j1 extends LinearLayout {
    public boolean E;
    public boolean F;
    public final c6 f11541a;
    public final TextView f11542b;
    public final TextView[] f11543c;
    public final ImageView d;
    public final FrameLayout e;
    public final ViewGroup[] f11544f;
    public final TextView[] h;
    public final TextView[][] f11545n;
    public final qq f11546r;
    public final FrameLayout f11547s;
    public final LinearLayout v;
    public int f11548w;
    public int f11549x;
    public boolean f11550y;

    public j1(Context context, c6 c6Var) {
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
        this.f11543c = new TextView[2];
        this.f11544f = new ViewGroup[7];
        this.h = new TextView[7];
        this.f11545n = new TextView[7];
        this.f11548w = 1;
        this.f11549x = 0;
        this.f11550y = true;
        this.f11541a = c6Var;
        setOrientation(1);
        setClipChildren(false);
        int i17 = 0;
        for (int i18 = 7; i17 < i18; i18 = 7) {
            if (i17 == 0) {
                ViewGroup i5Var = new i5(context, 4);
                i5Var.setMinimumHeight(AndroidUtilities.dp(60.0f));
                TextView textView = new TextView(context);
                this.f11542b = textView;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView.setGravity(i12);
                textView.setTextSize(1, 16.0f);
                i5Var.addView(textView, a6.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i17] = new TextView(context);
                TextView textView2 = this.h[i17];
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView2.setGravity(i13);
                this.h[i17].setTextSize(1, 13.0f);
                this.h[i17].setTextColor(g6.w0(g6.f20305z6, c6Var));
                i5Var.addView(this.h[i17], a6.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.v = linearLayout;
                linearLayout.setOrientation(1);
                this.f11547s = new FrameLayout(context);
                this.f11545n[i17] = new TextView[2];
                for (int i19 = 0; i19 < 2; i19++) {
                    this.f11545n[i17][i19] = new TextView(context);
                    this.f11545n[i17][i19].setTextSize(1, 14.0f);
                    this.f11545n[i17][i19].setTextColor(g6.w0(g6.f20305z6, c6Var));
                    TextView textView3 = this.f11545n[i17][i19];
                    if (LocaleController.isRTL) {
                        i16 = 3;
                    } else {
                        i16 = 5;
                    }
                    textView3.setGravity(i16);
                    this.f11547s.addView(this.f11545n[i17][i19], a6.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i20 = 0; i20 < 2; i20++) {
                    this.f11543c[i20] = new TextView(context);
                    this.f11543c[i20].setTextSize(1, 14.0f);
                    this.f11543c[i20].setTextColor(g6.w0(g6.f20305z6, c6Var));
                    TextView textView4 = this.f11543c[i20];
                    if (LocaleController.isRTL) {
                        i15 = 3;
                    } else {
                        i15 = 5;
                    }
                    textView4.setGravity(i15);
                    this.f11547s.addView(this.f11543c[i20], a6.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(R.drawable.arrow_more);
                imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(g6.f20305z6, c6Var), PorterDuff.Mode.SRC_IN));
                this.f11547s.addView(imageView, a6.h(20.0f, 20.0f, 8388629));
                this.v.addView(this.f11547s, new LinearLayout.LayoutParams(a6.z(-1.0f), a6.z(-1.0f), Gravity.getAbsoluteGravity(119, LocaleController.isRTL ? 1 : 0)));
                qq qqVar = new qq(context);
                this.f11546r = qqVar;
                qqVar.getDrawable().L = true;
                qqVar.setTextSize(AndroidUtilities.dp(13.0f));
                qqVar.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                if (LocaleController.isRTL) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                qqVar.setGravity(i14);
                int dp = AndroidUtilities.dp(8.0f);
                int i21 = g6.f20104o6;
                int w02 = g6.w0(i21, c6Var);
                a(w02);
                int m12 = g6.m1(0.1f, w02);
                int w03 = g6.w0(i21, c6Var);
                a(w03);
                int m13 = g6.m1(0.22f, w03);
                qqVar.setBackground(g6.j0(dp, dp, dp, dp, m12, m13, m13));
                int w04 = g6.w0(i21, c6Var);
                a(w04);
                qqVar.setTextColor(w04);
                qqVar.getDrawable().A = 0.6f;
                qqVar.setVisibility(8);
                this.v.addView(qqVar, a6.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.e = frameLayout;
                frameLayout.addView(this.v, a6.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                i5Var.addView(frameLayout, a6.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f11544f[i17] = i5Var;
                addView(i5Var, a6.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup e = yh.e(context, 0);
                this.h[i17] = new TextView(context);
                this.h[i17].setTextSize(1, 14.0f);
                this.h[i17].setTextColor(g6.w0(g6.G6, c6Var));
                TextView textView5 = this.h[i17];
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView5.setGravity(i10);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.f11545n[i17] = new TextView[2];
                for (int i22 = 0; i22 < 2; i22++) {
                    this.f11545n[i17][i22] = new TextView(context);
                    this.f11545n[i17][i22].setTextSize(1, 14.0f);
                    this.f11545n[i17][i22].setTextColor(g6.w0(g6.f20305z6, c6Var));
                    TextView textView6 = this.f11545n[i17][i22];
                    if (LocaleController.isRTL) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    textView6.setGravity(i11);
                    frameLayout2.addView(this.f11545n[i17][i22], a6.e(-1, -1, 119));
                }
                if (LocaleController.isRTL) {
                    e.addView(frameLayout2, a6.q(-2, -1, 51));
                    e.addView(this.h[i17], a6.q(-1, -1, 53));
                } else {
                    e.addView(this.h[i17], a6.q(-2, -1, 51));
                    e.addView(frameLayout2, a6.q(-1, -1, 53));
                }
                this.f11544f[i17] = e;
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
                addView(e, a6.u(-1.0f, -2.0f, 51, 18.0f, f11, 28.0f, f10));
            }
            i17++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i10);

    public final void b(org.telegram.tgnet.tl.TL_account.TL_businessWorkHours r29, boolean r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: ig.j1.b(org.telegram.tgnet.tl.TL_account$TL_businessWorkHours, boolean, boolean, boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.E) {
            Paint U0 = g6.U0("paintDivider", this.f11541a);
            if (U0 == null) {
                U0 = g6.f20022k0;
            }
            Paint paint = U0;
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
            int i12 = this.f11548w;
            qq qqVar = this.f11546r;
            if (i12 <= 2 && qqVar.getVisibility() != 0) {
                dp = 0;
            } else {
                int dp3 = AndroidUtilities.dp(15.0f) + this.f11549x;
                if (qqVar.getVisibility() == 0) {
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
        qq qqVar = this.f11546r;
        if (qqVar != null && qqVar.getVisibility() == 0) {
            float x10 = motionEvent.getX();
            ViewGroup[] viewGroupArr = this.f11544f;
            float x11 = x10 - viewGroupArr[0].getX();
            FrameLayout frameLayout = this.e;
            float x12 = x11 - frameLayout.getX();
            FrameLayout frameLayout2 = this.f11547s;
            return qqVar.getClickBounds().contains((int) ((x12 - frameLayout2.getX()) - qqVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - qqVar.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        qq qqVar = this.f11546r;
        if (qqVar != null) {
            qqVar.setOnClickListener(onClickListener);
        }
    }
}
