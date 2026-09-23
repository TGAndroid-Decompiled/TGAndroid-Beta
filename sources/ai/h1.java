package ai;

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
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.rr;
public final class h1 extends FrameLayout implements n70 {
    public final TextView E;
    public final TextView F;
    public final pq[] G;
    public final pq[] H;
    public int I;
    public ValueAnimator J;
    public m1 K;
    public final Paint L;
    public boolean f927a;
    public boolean f928b;
    public final int f929c;
    public final boolean d;
    public Drawable e;
    public float f930f;
    public final d1 h;
    public final LinearLayout f931n;
    public final vh.o f932r;
    public final vh.o f933s;
    public CharSequence v;
    public final org.telegram.ui.Components.w9 f934w;
    public final org.telegram.ui.Components.h9 f935x;
    public final vh.o f936y;

    public h1(int i10, Context context, boolean z10) {
        super(context);
        this.f927a = false;
        this.f928b = true;
        this.f930f = 0.5f;
        this.G = new pq[1];
        this.H = new pq[1];
        this.L = new Paint(1);
        this.f929c = i10;
        this.d = z10;
        d1 d1Var = new d1(this, context);
        this.h = d1Var;
        d1Var.setOrientation(0);
        addView(d1Var, w7.x5.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.f935x = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f934w = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        d1Var.addView(w9Var, w7.x5.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        d1Var.addView(linearLayout, w7.x5.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f931n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, w7.x5.n(-2, -2));
        vh.o oVar = new vh.o(context);
        this.f932r = oVar;
        oVar.setTextColor(-1);
        oVar.setTextSize(1, 14.0f);
        oVar.setGravity(3);
        oVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(oVar, w7.x5.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        vh.o oVar2 = new vh.o(context);
        this.f933s = oVar2;
        oVar2.setTextColor(org.telegram.ui.ActionBar.h6.l1(0.55f, -1));
        oVar2.setTextSize(1, 12.0f);
        oVar2.setGravity(5);
        linearLayout2.addView(oVar2, w7.x5.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        vh.o oVar3 = new vh.o(context);
        this.f936y = oVar3;
        oVar3.setTextColor(-1);
        oVar3.setTextSize(1, 14.0f);
        oVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.h6.l1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(oVar3);
        linearLayout.addView(oVar3, w7.x5.n(-2, -2));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        d1Var.addView(textView, w7.x5.p(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        d1Var.addView(textView2, w7.x5.p(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        d1 d1Var = this.h;
        if (d1Var.getBackground() == null) {
            int l1 = org.telegram.ui.ActionBar.h6.l1(f7 * 0.5f, -16777216);
            Paint paint = this.L;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(d1Var.getX(), d1Var.getY(), d1Var.getX() + d1Var.getWidth(), d1Var.getY() + d1Var.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f930f * 255.0f));
                this.h.invalidate();
            }
        }
        m1 m1Var = this.K;
        if (m1Var != null && this.e != null) {
            this.I = m1Var.f1226a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new a(this, 4));
            this.J.addListener(new b(this, 2));
            this.J.setDuration(350L);
            this.J.setInterpolator(rr.h);
            this.J.start();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(ai.m1 r30) {
        throw new UnsupportedOperationException("Method not decompiled: ai.h1.set(ai.m1):void");
    }

    public void setDrawStar(boolean z10) {
        this.f928b = z10;
        pq pqVar = this.G[0];
        if (pqVar != null && pqVar.draw != z10) {
            pqVar.draw = z10;
            this.E.invalidate();
        }
    }
}
