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
import bi.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cq;
import w7.x5;
public abstract class j1 extends LinearLayout {
    public boolean E;
    public boolean F;
    public final f6 f12111a;
    public final TextView f12112b;
    public final TextView[] f12113c;
    public final ImageView d;
    public final FrameLayout f12114e;
    public final ViewGroup[] f12115f;
    public final TextView[] h;
    public final TextView[][] f12116n;
    public final cq f12117r;
    public final FrameLayout f12118s;
    public final LinearLayout v;
    public int f12119w;
    public int f12120x;
    public boolean f12121y;

    public j1(Context context, f6 f6Var) {
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
        this.f12113c = new TextView[2];
        this.f12115f = new ViewGroup[7];
        this.h = new TextView[7];
        this.f12116n = new TextView[7];
        this.f12119w = 1;
        this.f12120x = 0;
        this.f12121y = true;
        this.f12111a = f6Var;
        setOrientation(1);
        setClipChildren(false);
        int i17 = 0;
        for (int i18 = 7; i17 < i18; i18 = 7) {
            if (i17 == 0) {
                ViewGroup g5Var = new g5(context, 4);
                g5Var.setMinimumHeight(AndroidUtilities.dp(60.0f));
                TextView textView = new TextView(context);
                this.f12112b = textView;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView.setGravity(i12);
                textView.setTextSize(1, 16.0f);
                g5Var.addView(textView, x5.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i17] = new TextView(context);
                TextView textView2 = this.h[i17];
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView2.setGravity(i13);
                this.h[i17].setTextSize(1, 13.0f);
                this.h[i17].setTextColor(j6.v0(j6.f21061z6, f6Var));
                g5Var.addView(this.h[i17], x5.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.v = linearLayout;
                linearLayout.setOrientation(1);
                this.f12118s = new FrameLayout(context);
                this.f12116n[i17] = new TextView[2];
                for (int i19 = 0; i19 < 2; i19++) {
                    this.f12116n[i17][i19] = new TextView(context);
                    this.f12116n[i17][i19].setTextSize(1, 14.0f);
                    this.f12116n[i17][i19].setTextColor(j6.v0(j6.f21061z6, f6Var));
                    TextView textView3 = this.f12116n[i17][i19];
                    if (LocaleController.isRTL) {
                        i16 = 3;
                    } else {
                        i16 = 5;
                    }
                    textView3.setGravity(i16);
                    this.f12118s.addView(this.f12116n[i17][i19], x5.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i20 = 0; i20 < 2; i20++) {
                    this.f12113c[i20] = new TextView(context);
                    this.f12113c[i20].setTextSize(1, 14.0f);
                    this.f12113c[i20].setTextColor(j6.v0(j6.f21061z6, f6Var));
                    TextView textView4 = this.f12113c[i20];
                    if (LocaleController.isRTL) {
                        i15 = 3;
                    } else {
                        i15 = 5;
                    }
                    textView4.setGravity(i15);
                    this.f12118s.addView(this.f12113c[i20], x5.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(R.drawable.arrow_more);
                imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f21061z6, f6Var), PorterDuff.Mode.SRC_IN));
                this.f12118s.addView(imageView, x5.h(20.0f, 20.0f, 8388629));
                this.v.addView(this.f12118s, new LinearLayout.LayoutParams(x5.z(-1.0f), x5.z(-1.0f), Gravity.getAbsoluteGravity(119, LocaleController.isRTL ? 1 : 0)));
                cq cqVar = new cq(context);
                this.f12117r = cqVar;
                cqVar.getDrawable().F = true;
                cqVar.setTextSize(AndroidUtilities.dp(13.0f));
                cqVar.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                if (LocaleController.isRTL) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                cqVar.setGravity(i14);
                int dp = AndroidUtilities.dp(8.0f);
                int i21 = j6.f20862o6;
                int v02 = j6.v0(i21, f6Var);
                a(v02);
                int l1 = j6.l1(0.1f, v02);
                int v03 = j6.v0(i21, f6Var);
                a(v03);
                int l12 = j6.l1(0.22f, v03);
                cqVar.setBackground(j6.i0(dp, dp, dp, dp, l1, l12, l12));
                int v04 = j6.v0(i21, f6Var);
                a(v04);
                cqVar.setTextColor(v04);
                cqVar.getDrawable().v = 0.6f;
                cqVar.setVisibility(8);
                this.v.addView(cqVar, x5.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.f12114e = frameLayout;
                frameLayout.addView(this.v, x5.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                g5Var.addView(frameLayout, x5.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f12115f[i17] = g5Var;
                addView(g5Var, x5.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup f11 = wl.f(context, 0);
                this.h[i17] = new TextView(context);
                this.h[i17].setTextSize(1, 14.0f);
                this.h[i17].setTextColor(j6.v0(j6.G6, f6Var));
                TextView textView5 = this.h[i17];
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView5.setGravity(i10);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.f12116n[i17] = new TextView[2];
                for (int i22 = 0; i22 < 2; i22++) {
                    this.f12116n[i17][i22] = new TextView(context);
                    this.f12116n[i17][i22].setTextSize(1, 14.0f);
                    this.f12116n[i17][i22].setTextColor(j6.v0(j6.f21061z6, f6Var));
                    TextView textView6 = this.f12116n[i17][i22];
                    if (LocaleController.isRTL) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    textView6.setGravity(i11);
                    frameLayout2.addView(this.f12116n[i17][i22], x5.e(-1, -1, 119));
                }
                if (LocaleController.isRTL) {
                    f11.addView(frameLayout2, x5.q(-2, -1, 51));
                    f11.addView(this.h[i17], x5.q(-1, -1, 53));
                } else {
                    f11.addView(this.h[i17], x5.q(-2, -1, 51));
                    f11.addView(frameLayout2, x5.q(-1, -1, 53));
                }
                this.f12115f[i17] = f11;
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
                addView(f11, x5.u(-1.0f, -2.0f, 51, 18.0f, f7, 28.0f, f10));
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
            Paint T0 = j6.T0("paintDivider", this.f12111a);
            if (T0 == null) {
                T0 = j6.f20785k0;
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
            int i12 = this.f12119w;
            cq cqVar = this.f12117r;
            if (i12 <= 2 && cqVar.getVisibility() != 0) {
                dp = 0;
            } else {
                int dp3 = AndroidUtilities.dp(15.0f) + this.f12120x;
                if (cqVar.getVisibility() == 0) {
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
        cq cqVar = this.f12117r;
        if (cqVar != null && cqVar.getVisibility() == 0) {
            float x10 = motionEvent.getX();
            ViewGroup[] viewGroupArr = this.f12115f;
            float x11 = x10 - viewGroupArr[0].getX();
            FrameLayout frameLayout = this.f12114e;
            float x12 = x11 - frameLayout.getX();
            FrameLayout frameLayout2 = this.f12118s;
            return cqVar.getClickBounds().contains((int) ((x12 - frameLayout2.getX()) - cqVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - cqVar.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        cq cqVar = this.f12117r;
        if (cqVar != null) {
            cqVar.setOnClickListener(onClickListener);
        }
    }
}
