package hg;

import ai.w5;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.gq;
import w7.z5;
public abstract class j1 extends LinearLayout {
    public boolean E;
    public boolean F;
    public final d6 f11228a;
    public final TextView f11229b;
    public final TextView[] f11230c;
    public final ImageView d;
    public final FrameLayout f11231e;
    public final ViewGroup[] f11232f;
    public final TextView[] h;
    public final TextView[][] f11233n;
    public final gq f11234r;
    public final FrameLayout f11235s;
    public final LinearLayout v;
    public int f11236w;
    public int f11237x;
    public boolean f11238y;

    public j1(Context context, d6 d6Var) {
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
        this.f11230c = new TextView[2];
        this.f11232f = new ViewGroup[7];
        this.h = new TextView[7];
        this.f11233n = new TextView[7];
        this.f11236w = 1;
        this.f11237x = 0;
        this.f11238y = true;
        this.f11228a = d6Var;
        setOrientation(1);
        setClipChildren(false);
        int i17 = 0;
        for (int i18 = 7; i17 < i18; i18 = 7) {
            if (i17 == 0) {
                ViewGroup w5Var = new w5(context, 4);
                w5Var.setMinimumHeight(AndroidUtilities.dp(60.0f));
                TextView textView = new TextView(context);
                this.f11229b = textView;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView.setGravity(i12);
                textView.setTextSize(1, 16.0f);
                w5Var.addView(textView, z5.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i17] = new TextView(context);
                TextView textView2 = this.h[i17];
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView2.setGravity(i13);
                this.h[i17].setTextSize(1, 13.0f);
                this.h[i17].setTextColor(i6.v0(i6.f21233z6, d6Var));
                w5Var.addView(this.h[i17], z5.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.v = linearLayout;
                linearLayout.setOrientation(1);
                this.f11235s = new FrameLayout(context);
                this.f11233n[i17] = new TextView[2];
                for (int i19 = 0; i19 < 2; i19++) {
                    this.f11233n[i17][i19] = new TextView(context);
                    this.f11233n[i17][i19].setTextSize(1, 14.0f);
                    this.f11233n[i17][i19].setTextColor(i6.v0(i6.f21233z6, d6Var));
                    TextView textView3 = this.f11233n[i17][i19];
                    if (LocaleController.isRTL) {
                        i16 = 3;
                    } else {
                        i16 = 5;
                    }
                    textView3.setGravity(i16);
                    this.f11235s.addView(this.f11233n[i17][i19], z5.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i20 = 0; i20 < 2; i20++) {
                    this.f11230c[i20] = new TextView(context);
                    this.f11230c[i20].setTextSize(1, 14.0f);
                    this.f11230c[i20].setTextColor(i6.v0(i6.f21233z6, d6Var));
                    TextView textView4 = this.f11230c[i20];
                    if (LocaleController.isRTL) {
                        i15 = 3;
                    } else {
                        i15 = 5;
                    }
                    textView4.setGravity(i15);
                    this.f11235s.addView(this.f11230c[i20], z5.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(R.drawable.arrow_more);
                imageView.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.f21233z6, d6Var), PorterDuff.Mode.SRC_IN));
                this.f11235s.addView(imageView, z5.h(20.0f, 20.0f, 8388629));
                this.v.addView(this.f11235s, new LinearLayout.LayoutParams(z5.z(-1.0f), z5.z(-1.0f), Gravity.getAbsoluteGravity(119, LocaleController.isRTL ? 1 : 0)));
                gq gqVar = new gq(context);
                this.f11234r = gqVar;
                gqVar.getDrawable().F = true;
                gqVar.setTextSize(AndroidUtilities.dp(13.0f));
                gqVar.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                if (LocaleController.isRTL) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                gqVar.setGravity(i14);
                int dp = AndroidUtilities.dp(8.0f);
                int i21 = i6.f21030o6;
                int v02 = i6.v0(i21, d6Var);
                a(v02);
                int l1 = i6.l1(0.1f, v02);
                int v03 = i6.v0(i21, d6Var);
                a(v03);
                int l12 = i6.l1(0.22f, v03);
                gqVar.setBackground(i6.i0(dp, dp, dp, dp, l1, l12, l12));
                int v04 = i6.v0(i21, d6Var);
                a(v04);
                gqVar.setTextColor(v04);
                gqVar.getDrawable().v = 0.6f;
                gqVar.setVisibility(8);
                this.v.addView(gqVar, z5.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.f11231e = frameLayout;
                frameLayout.addView(this.v, z5.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                w5Var.addView(frameLayout, z5.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f11232f[i17] = w5Var;
                addView(w5Var, z5.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup e7 = bi.e(context, 0);
                this.h[i17] = new TextView(context);
                this.h[i17].setTextSize(1, 14.0f);
                this.h[i17].setTextColor(i6.v0(i6.G6, d6Var));
                TextView textView5 = this.h[i17];
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView5.setGravity(i10);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.f11233n[i17] = new TextView[2];
                for (int i22 = 0; i22 < 2; i22++) {
                    this.f11233n[i17][i22] = new TextView(context);
                    this.f11233n[i17][i22].setTextSize(1, 14.0f);
                    this.f11233n[i17][i22].setTextColor(i6.v0(i6.f21233z6, d6Var));
                    TextView textView6 = this.f11233n[i17][i22];
                    if (LocaleController.isRTL) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    textView6.setGravity(i11);
                    frameLayout2.addView(this.f11233n[i17][i22], z5.e(-1, -1, 119));
                }
                if (LocaleController.isRTL) {
                    e7.addView(frameLayout2, z5.q(-2, -1, 51));
                    e7.addView(this.h[i17], z5.q(-1, -1, 53));
                } else {
                    e7.addView(this.h[i17], z5.q(-2, -1, 51));
                    e7.addView(frameLayout2, z5.q(-1, -1, 53));
                }
                this.f11232f[i17] = e7;
                if (i17 == 1) {
                    f7 = 1.0f;
                } else {
                    f7 = 11.66f;
                }
                if (i17 == 6) {
                    f10 = 16.66f;
                } else {
                    f10 = 0.0f;
                }
                addView(e7, z5.u(-1.0f, -2.0f, 51, 18.0f, f7, 28.0f, f10));
            }
            i17++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i10);

    public final void b(org.telegram.tgnet.tl.TL_account.TL_businessWorkHours r29, boolean r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: hg.j1.b(org.telegram.tgnet.tl.TL_account$TL_businessWorkHours, boolean, boolean, boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.E) {
            Paint T0 = i6.T0("paintDivider", this.f11228a);
            if (T0 == null) {
                T0 = i6.f20950k0;
            }
            Paint paint = T0;
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
            int i12 = this.f11236w;
            gq gqVar = this.f11234r;
            if (i12 <= 2 && gqVar.getVisibility() != 0) {
                dp = 0;
            } else {
                int dp3 = AndroidUtilities.dp(15.0f) + this.f11237x;
                if (gqVar.getVisibility() == 0) {
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
        gq gqVar = this.f11234r;
        if (gqVar != null && gqVar.getVisibility() == 0) {
            float x10 = motionEvent.getX();
            ViewGroup[] viewGroupArr = this.f11232f;
            float x11 = x10 - viewGroupArr[0].getX();
            FrameLayout frameLayout = this.f11231e;
            float x12 = x11 - frameLayout.getX();
            FrameLayout frameLayout2 = this.f11235s;
            return gqVar.getClickBounds().contains((int) ((x12 - frameLayout2.getX()) - gqVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - gqVar.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        gq gqVar = this.f11234r;
        if (gqVar != null) {
            gqVar.setOnClickListener(onClickListener);
        }
    }
}
