package ci;

import ai.uc;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.yq;
public final class q0 extends FrameLayout implements h80 {
    public final TextView E;
    public final TextView F;
    public final yq[] G;
    public final yq[] H;
    public int I;
    public ValueAnimator J;
    public v0 K;
    public final Paint L;
    public boolean f5750a;
    public boolean f5751b;
    public final int f5752c;
    public final boolean d;
    public Drawable e;
    public float f5753f;
    public final uc h;
    public final LinearLayout f5754n;
    public final wh.n f5755r;
    public final wh.n f5756s;
    public CharSequence v;
    public final org.telegram.ui.Components.w9 f5757w;
    public final org.telegram.ui.Components.h9 f5758x;
    public final wh.n f5759y;

    public q0(int i10, Context context, boolean z10) {
        super(context);
        this.f5750a = false;
        this.f5751b = true;
        this.f5753f = 0.5f;
        this.G = new yq[1];
        this.H = new yq[1];
        this.L = new Paint(1);
        this.f5752c = i10;
        this.d = z10;
        uc ucVar = new uc(this, context);
        this.h = ucVar;
        ucVar.setOrientation(0);
        addView(ucVar, w7.z5.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.f5758x = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f5757w = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        ucVar.addView(w9Var, w7.z5.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ucVar.addView(linearLayout, w7.z5.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f5754n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, w7.z5.n(-2, -2));
        wh.n nVar = new wh.n(context);
        this.f5755r = nVar;
        nVar.setTextColor(-1);
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(3);
        nVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(nVar, w7.z5.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        wh.n nVar2 = new wh.n(context);
        this.f5756s = nVar2;
        nVar2.setTextColor(org.telegram.ui.ActionBar.h6.m1(0.55f, -1));
        nVar2.setTextSize(1, 12.0f);
        nVar2.setGravity(5);
        linearLayout2.addView(nVar2, w7.z5.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        wh.n nVar3 = new wh.n(context);
        this.f5759y = nVar3;
        nVar3.setTextColor(-1);
        nVar3.setTextSize(1, 14.0f);
        nVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.h6.m1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(nVar3);
        linearLayout.addView(nVar3, w7.z5.n(-2, -2));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        ucVar.addView(textView, w7.z5.p(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        ucVar.addView(textView2, w7.z5.p(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public final void b() {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f5753f * 255.0f));
                this.h.invalidate();
            }
        }
        v0 v0Var = this.K;
        if (v0Var != null && this.e != null) {
            this.I = v0Var.f6066a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new ah.c0(this, 12));
            this.J.addListener(new ah.b(this, 7));
            this.J.setDuration(350L);
            this.J.setInterpolator(bs.h);
            this.J.start();
        }
    }

    @Override
    public final void c(Canvas canvas, float f7) {
        uc ucVar = this.h;
        if (ucVar.getBackground() == null) {
            int m12 = org.telegram.ui.ActionBar.h6.m1(f7 * 0.5f, -16777216);
            Paint paint = this.L;
            paint.setColor(m12);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(ucVar.getX(), ucVar.getY(), ucVar.getX() + ucVar.getWidth(), ucVar.getY() + ucVar.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
        }
        draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(ci.v0 r28) {
        throw new UnsupportedOperationException("Method not decompiled: ci.q0.set(ci.v0):void");
    }

    public void setDrawStar(boolean z10) {
        this.f5751b = z10;
        yq yqVar = this.G[0];
        if (yqVar != null && yqVar.draw != z10) {
            yqVar.draw = z10;
            this.E.invalidate();
        }
    }
}
