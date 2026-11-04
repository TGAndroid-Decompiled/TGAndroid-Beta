package lg;

import ai.d2;
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
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.mp;
public abstract class g1 extends LinearLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public final e6 f18307a;
    public final TextView f18308b;
    public final TextView[] f18309c;
    public final ImageView d;
    public final FrameLayout f18310e;
    public final ViewGroup[] f18311f;
    public final TextView[] h;
    public final TextView[][] f18312n;
    public final mp f18313r;
    public final FrameLayout f18314s;
    public final LinearLayout f18315w;
    public int f18316x;
    public int f18317y;

    public g1(Context context, e6 e6Var) {
        super(context);
        int i3;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f18309c = new TextView[2];
        this.f18311f = new ViewGroup[7];
        this.h = new TextView[7];
        this.f18312n = new TextView[7];
        this.f18316x = 1;
        this.f18317y = 0;
        this.E = true;
        this.f18307a = e6Var;
        setOrientation(1);
        setClipChildren(false);
        int i16 = 0;
        for (int i17 = 7; i16 < i17; i17 = 7) {
            if (i16 == 0) {
                ViewGroup d2Var = new d2(context, 6);
                d2Var.setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
                TextView textView = new TextView(context);
                this.f18308b = textView;
                if (bd.f21784a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView.setGravity(i11);
                textView.setTextSize(1, 16.0f);
                d2Var.addView(textView, mf.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i16] = new TextView(context);
                TextView textView2 = this.h[i16];
                if (bd.f21784a0) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView2.setGravity(i12);
                this.h[i16].setTextSize(1, 13.0f);
                r6.V(this.h[i16], k6.f28290z6, e6Var);
                d2Var.addView(this.h[i16], mf.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.f18315w = linearLayout;
                linearLayout.setOrientation(1);
                this.f18314s = new FrameLayout(context);
                this.f18312n[i16] = new TextView[2];
                for (int i18 = 0; i18 < 2; i18++) {
                    this.f18312n[i16][i18] = new TextView(context);
                    this.f18312n[i16][i18].setTextSize(1, 14.0f);
                    r6.V(this.f18312n[i16][i18], k6.f28290z6, e6Var);
                    TextView textView3 = this.f18312n[i16][i18];
                    if (bd.f21784a0) {
                        i15 = 3;
                    } else {
                        i15 = 5;
                    }
                    textView3.setGravity(i15);
                    this.f18314s.addView(this.f18312n[i16][i18], mf.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i19 = 0; i19 < 2; i19++) {
                    this.f18309c[i19] = new TextView(context);
                    this.f18309c[i19].setTextSize(1, 14.0f);
                    r6.V(this.f18309c[i19], k6.f28290z6, e6Var);
                    TextView textView4 = this.f18309c[i19];
                    if (bd.f21784a0) {
                        i14 = 3;
                    } else {
                        i14 = 5;
                    }
                    textView4.setGravity(i14);
                    this.f18314s.addView(this.f18309c[i19], mf.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(2131230871);
                r6.t(imageView, k6.f28290z6, e6Var, PorterDuff.Mode.SRC_IN);
                this.f18314s.addView(imageView, mf.h(20.0f, 20.0f, 8388629));
                this.f18315w.addView(this.f18314s, new LinearLayout.LayoutParams(mf.z(-1.0f), mf.z(-1.0f), Gravity.getAbsoluteGravity(119, bd.f21784a0 ? 1 : 0)));
                mp mpVar = new mp(context);
                this.f18313r = mpVar;
                mpVar.getDrawable().L = true;
                mpVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
                mpVar.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                if (bd.f21784a0) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                mpVar.setGravity(i13);
                int L = org.telegram.messenger.g0.L(8.0f);
                int i20 = k6.f28081o6;
                int w02 = k6.w0(i20, e6Var);
                a(w02);
                int r12 = k6.r1(0.1f, w02);
                int w03 = k6.w0(i20, e6Var);
                a(w03);
                int r13 = k6.r1(0.22f, w03);
                mpVar.setBackground(k6.k0(L, L, L, L, r12, r13, r13));
                int w04 = k6.w0(i20, e6Var);
                a(w04);
                mpVar.setTextColor(w04);
                mpVar.getDrawable().A = 0.6f;
                mpVar.setVisibility(8);
                this.f18315w.addView(mpVar, mf.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.f18310e = frameLayout;
                frameLayout.addView(this.f18315w, mf.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                d2Var.addView(frameLayout, mf.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f18311f[i16] = d2Var;
                addView(d2Var, mf.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup f12 = k5.f(context, 0);
                this.h[i16] = new TextView(context);
                this.h[i16].setTextSize(1, 14.0f);
                r6.V(this.h[i16], k6.G6, e6Var);
                TextView textView5 = this.h[i16];
                if (bd.f21784a0) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                textView5.setGravity(i3);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.f18312n[i16] = new TextView[2];
                for (int i21 = 0; i21 < 2; i21++) {
                    this.f18312n[i16][i21] = new TextView(context);
                    this.f18312n[i16][i21].setTextSize(1, 14.0f);
                    r6.V(this.f18312n[i16][i21], k6.f28290z6, e6Var);
                    TextView textView6 = this.f18312n[i16][i21];
                    if (bd.f21784a0) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    textView6.setGravity(i10);
                    frameLayout2.addView(this.f18312n[i16][i21], mf.e(-1, -1, 119));
                }
                if (bd.f21784a0) {
                    f12.addView(frameLayout2, mf.r(-2, -1, 51));
                    f12.addView(this.h[i16], mf.r(-1, -1, 53));
                } else {
                    f12.addView(this.h[i16], mf.r(-2, -1, 51));
                    f12.addView(frameLayout2, mf.r(-1, -1, 53));
                }
                this.f18311f[i16] = f12;
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
                addView(f12, mf.u(-1.0f, -2.0f, 51, 18.0f, f13, 28.0f, f11));
            }
            i16++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i3);

    public final void b(org.telegram.tgnet.tl.TL_account.TL_businessWorkHours r31, boolean r32, boolean r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: lg.g1.b(org.telegram.tgnet.tl.TL_account$TL_businessWorkHours, boolean, boolean, boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.F) {
            Paint W0 = k6.W0("paintDivider", this.f18307a);
            if (W0 == null) {
                W0 = k6.f28002k0;
            }
            Paint paint = W0;
            float f11 = 21.33f;
            if (bd.f21784a0) {
                f10 = 0.0f;
            } else {
                f10 = 21.33f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!bd.f21784a0) {
                f11 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - org.telegram.messenger.g0.L(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int L;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        if (!this.G) {
            int L2 = org.telegram.messenger.g0.L(60.0f);
            int i11 = this.f18316x;
            mp mpVar = this.f18313r;
            if (i11 <= 2 && mpVar.getVisibility() != 0) {
                L = 0;
            } else {
                int L3 = org.telegram.messenger.g0.L(15.0f) + this.f18317y;
                if (mpVar.getVisibility() == 0) {
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
        mp mpVar = this.f18313r;
        if (mpVar != null && mpVar.getVisibility() == 0) {
            float x10 = motionEvent.getX();
            ViewGroup[] viewGroupArr = this.f18311f;
            float x11 = x10 - viewGroupArr[0].getX();
            FrameLayout frameLayout = this.f18310e;
            float x12 = x11 - frameLayout.getX();
            FrameLayout frameLayout2 = this.f18314s;
            return mpVar.getClickBounds().contains((int) ((x12 - frameLayout2.getX()) - mpVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - mpVar.getY()));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        mp mpVar = this.f18313r;
        if (mpVar != null) {
            mpVar.setOnClickListener(onClickListener);
        }
    }
}
