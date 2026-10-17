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
import ci.i4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.nq;
import w7.z5;
public abstract class g1 extends LinearLayout {
    public boolean E;
    public boolean F;
    public final d6 f12908a;
    public final TextView f12909b;
    public final TextView[] f12910c;
    public final ImageView d;
    public final FrameLayout e;
    public final ViewGroup[] f12911f;
    public final TextView[] h;
    public final TextView[][] f12912n;
    public final nq f12913r;
    public final FrameLayout f12914s;
    public final LinearLayout v;
    public int f12915w;
    public int f12916x;
    public boolean f12917y;

    public g1(Context context, d6 d6Var) {
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
        this.f12910c = new TextView[2];
        this.f12911f = new ViewGroup[7];
        this.h = new TextView[7];
        this.f12912n = new TextView[7];
        this.f12915w = 1;
        this.f12916x = 0;
        this.f12917y = true;
        this.f12908a = d6Var;
        setOrientation(1);
        setClipChildren(false);
        int i17 = 0;
        for (int i18 = 7; i17 < i18; i18 = 7) {
            if (i17 == 0) {
                ViewGroup i4Var = new i4(context, 4);
                i4Var.setMinimumHeight(AndroidUtilities.dp(60.0f));
                TextView textView = new TextView(context);
                this.f12909b = textView;
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView.setGravity(i12);
                textView.setTextSize(1, 16.0f);
                i4Var.addView(textView, z5.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i17] = new TextView(context);
                TextView textView2 = this.h[i17];
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView2.setGravity(i13);
                this.h[i17].setTextSize(1, 13.0f);
                this.h[i17].setTextColor(h6.w0(h6.f21391z6, d6Var));
                i4Var.addView(this.h[i17], z5.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.v = linearLayout;
                linearLayout.setOrientation(1);
                this.f12914s = new FrameLayout(context);
                this.f12912n[i17] = new TextView[2];
                for (int i19 = 0; i19 < 2; i19++) {
                    this.f12912n[i17][i19] = new TextView(context);
                    this.f12912n[i17][i19].setTextSize(1, 14.0f);
                    this.f12912n[i17][i19].setTextColor(h6.w0(h6.f21391z6, d6Var));
                    TextView textView3 = this.f12912n[i17][i19];
                    if (LocaleController.isRTL) {
                        i16 = 3;
                    } else {
                        i16 = 5;
                    }
                    textView3.setGravity(i16);
                    this.f12914s.addView(this.f12912n[i17][i19], z5.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i20 = 0; i20 < 2; i20++) {
                    this.f12910c[i20] = new TextView(context);
                    this.f12910c[i20].setTextSize(1, 14.0f);
                    this.f12910c[i20].setTextColor(h6.w0(h6.f21391z6, d6Var));
                    TextView textView4 = this.f12910c[i20];
                    if (LocaleController.isRTL) {
                        i15 = 3;
                    } else {
                        i15 = 5;
                    }
                    textView4.setGravity(i15);
                    this.f12914s.addView(this.f12910c[i20], z5.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(R.drawable.arrow_more);
                imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.f21391z6, d6Var), PorterDuff.Mode.SRC_IN));
                this.f12914s.addView(imageView, z5.h(20.0f, 20.0f, 8388629));
                this.v.addView(this.f12914s, new LinearLayout.LayoutParams(z5.z(-1.0f), z5.z(-1.0f), Gravity.getAbsoluteGravity(119, LocaleController.isRTL ? 1 : 0)));
                nq nqVar = new nq(context);
                this.f12913r = nqVar;
                nqVar.getDrawable().L = true;
                nqVar.setTextSize(AndroidUtilities.dp(13.0f));
                nqVar.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                if (LocaleController.isRTL) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                nqVar.setGravity(i14);
                int dp = AndroidUtilities.dp(8.0f);
                int i21 = h6.f21189o6;
                int w02 = h6.w0(i21, d6Var);
                a(w02);
                int m12 = h6.m1(0.1f, w02);
                int w03 = h6.w0(i21, d6Var);
                a(w03);
                int m13 = h6.m1(0.22f, w03);
                nqVar.setBackground(h6.j0(dp, dp, dp, dp, m12, m13, m13));
                int w04 = h6.w0(i21, d6Var);
                a(w04);
                nqVar.setTextColor(w04);
                nqVar.getDrawable().A = 0.6f;
                nqVar.setVisibility(8);
                this.v.addView(nqVar, z5.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.e = frameLayout;
                frameLayout.addView(this.v, z5.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                i4Var.addView(frameLayout, z5.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f12911f[i17] = i4Var;
                addView(i4Var, z5.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup e = wh.e(context, 0);
                this.h[i17] = new TextView(context);
                this.h[i17].setTextSize(1, 14.0f);
                this.h[i17].setTextColor(h6.w0(h6.G6, d6Var));
                TextView textView5 = this.h[i17];
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView5.setGravity(i10);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.f12912n[i17] = new TextView[2];
                for (int i22 = 0; i22 < 2; i22++) {
                    this.f12912n[i17][i22] = new TextView(context);
                    this.f12912n[i17][i22].setTextSize(1, 14.0f);
                    this.f12912n[i17][i22].setTextColor(h6.w0(h6.f21391z6, d6Var));
                    TextView textView6 = this.f12912n[i17][i22];
                    if (LocaleController.isRTL) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    textView6.setGravity(i11);
                    frameLayout2.addView(this.f12912n[i17][i22], z5.e(-1, -1, 119));
                }
                if (LocaleController.isRTL) {
                    e.addView(frameLayout2, z5.q(-2, -1, 51));
                    e.addView(this.h[i17], z5.q(-1, -1, 53));
                } else {
                    e.addView(this.h[i17], z5.q(-2, -1, 51));
                    e.addView(frameLayout2, z5.q(-1, -1, 53));
                }
                this.f12911f[i17] = e;
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
                addView(e, z5.u(-1.0f, -2.0f, 51, 18.0f, f11, 28.0f, f10));
            }
            i17++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i10);

    public final void b(org.telegram.tgnet.tl.TL_account.TL_businessWorkHours r29, boolean r30, boolean r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: ig.g1.b(org.telegram.tgnet.tl.TL_account$TL_businessWorkHours, boolean, boolean, boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.E) {
            Paint U0 = h6.U0("paintDivider", this.f12908a);
            if (U0 == null) {
                U0 = h6.f21107k0;
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
            int i12 = this.f12915w;
            nq nqVar = this.f12913r;
            if (i12 <= 2 && nqVar.getVisibility() != 0) {
                dp = 0;
            } else {
                int dp3 = AndroidUtilities.dp(15.0f) + this.f12916x;
                if (nqVar.getVisibility() == 0) {
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
        nq nqVar = this.f12913r;
        if (nqVar != null && nqVar.getVisibility() == 0) {
            float x10 = motionEvent.getX();
            ViewGroup[] viewGroupArr = this.f12911f;
            float x11 = x10 - viewGroupArr[0].getX();
            FrameLayout frameLayout = this.e;
            float x12 = x11 - frameLayout.getX();
            FrameLayout frameLayout2 = this.f12914s;
            return nqVar.getClickBounds().contains((int) ((x12 - frameLayout2.getX()) - nqVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - nqVar.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        nq nqVar = this.f12913r;
        if (nqVar != null) {
            nqVar.setOnClickListener(onClickListener);
        }
    }
}
