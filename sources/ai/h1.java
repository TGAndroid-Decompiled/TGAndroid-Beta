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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v70;
public final class h1 extends FrameLayout implements v70 {
    public final TextView E;
    public final TextView F;
    public final oq[] G;
    public final oq[] H;
    public int I;
    public ValueAnimator J;
    public m1 K;
    public final Paint L;
    public boolean f929a;
    public boolean f930b;
    public final int f931c;
    public final boolean d;
    public Drawable e;
    public float f932f;
    public final d1 h;
    public final LinearLayout f933n;
    public final vh.o f934r;
    public final vh.o f935s;
    public CharSequence v;
    public final org.telegram.ui.Components.w9 f936w;
    public final org.telegram.ui.Components.h9 f937x;
    public final vh.o f938y;

    public h1(int i10, Context context, boolean z10) {
        super(context);
        this.f929a = false;
        this.f930b = true;
        this.f932f = 0.5f;
        this.G = new oq[1];
        this.H = new oq[1];
        this.L = new Paint(1);
        this.f931c = i10;
        this.d = z10;
        d1 d1Var = new d1(this, context);
        this.h = d1Var;
        d1Var.setOrientation(0);
        addView(d1Var, w7.y5.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.f937x = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f936w = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        d1Var.addView(w9Var, w7.y5.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        d1Var.addView(linearLayout, w7.y5.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f933n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, w7.y5.n(-2, -2));
        vh.o oVar = new vh.o(context);
        this.f934r = oVar;
        oVar.setTextColor(-1);
        oVar.setTextSize(1, 14.0f);
        oVar.setGravity(3);
        oVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(oVar, w7.y5.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        vh.o oVar2 = new vh.o(context);
        this.f935s = oVar2;
        oVar2.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.55f, -1));
        oVar2.setTextSize(1, 12.0f);
        oVar2.setGravity(5);
        linearLayout2.addView(oVar2, w7.y5.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        vh.o oVar3 = new vh.o(context);
        this.f938y = oVar3;
        oVar3.setTextColor(-1);
        oVar3.setTextSize(1, 14.0f);
        oVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.j6.l1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(oVar3);
        linearLayout.addView(oVar3, w7.y5.n(-2, -2));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        d1Var.addView(textView, w7.y5.p(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        d1Var.addView(textView2, w7.y5.p(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        d1 d1Var = this.h;
        if (d1Var.getBackground() == null) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(f7 * 0.5f, -16777216);
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
                drawable.setAlpha((int) (this.f932f * 255.0f));
                this.h.invalidate();
            }
        }
        m1 m1Var = this.K;
        if (m1Var != null && this.e != null) {
            this.I = m1Var.f1227a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new a(this, 4));
            this.J.addListener(new b(this, 2));
            this.J.setDuration(350L);
            this.J.setInterpolator(qr.h);
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
        this.f930b = z10;
        oq oqVar = this.G[0];
        if (oqVar != null && oqVar.draw != z10) {
            oqVar.draw = z10;
            this.E.invalidate();
        }
    }
}
