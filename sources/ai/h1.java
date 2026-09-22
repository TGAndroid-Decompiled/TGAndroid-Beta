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
import org.telegram.ui.Components.x70;
public final class h1 extends FrameLayout implements x70 {
    public final TextView E;
    public final TextView F;
    public final oq[] G;
    public final oq[] H;
    public int I;
    public ValueAnimator J;
    public m1 K;
    public final Paint L;
    public boolean f926a;
    public boolean f927b;
    public final int f928c;
    public final boolean d;
    public Drawable e;
    public float f929f;
    public final d1 h;
    public final LinearLayout f930n;
    public final vh.n f931r;
    public final vh.n f932s;
    public CharSequence v;
    public final org.telegram.ui.Components.v9 f933w;
    public final org.telegram.ui.Components.g9 f934x;
    public final vh.n f935y;

    public h1(int i10, Context context, boolean z10) {
        super(context);
        this.f926a = false;
        this.f927b = true;
        this.f929f = 0.5f;
        this.G = new oq[1];
        this.H = new oq[1];
        this.L = new Paint(1);
        this.f928c = i10;
        this.d = z10;
        d1 d1Var = new d1(this, context);
        this.h = d1Var;
        d1Var.setOrientation(0);
        addView(d1Var, w7.y5.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.f934x = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
        this.f933w = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        d1Var.addView(v9Var, w7.y5.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        d1Var.addView(linearLayout, w7.y5.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f930n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, w7.y5.n(-2, -2));
        vh.n nVar = new vh.n(context);
        this.f931r = nVar;
        nVar.setTextColor(-1);
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(3);
        nVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(nVar, w7.y5.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        vh.n nVar2 = new vh.n(context);
        this.f932s = nVar2;
        nVar2.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.55f, -1));
        nVar2.setTextSize(1, 12.0f);
        nVar2.setGravity(5);
        linearLayout2.addView(nVar2, w7.y5.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        vh.n nVar3 = new vh.n(context);
        this.f935y = nVar3;
        nVar3.setTextColor(-1);
        nVar3.setTextSize(1, 14.0f);
        nVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.j6.l1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(nVar3);
        linearLayout.addView(nVar3, w7.y5.n(-2, -2));
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
                drawable.setAlpha((int) (this.f929f * 255.0f));
                this.h.invalidate();
            }
        }
        m1 m1Var = this.K;
        if (m1Var != null && this.e != null) {
            this.I = m1Var.f1224a;
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
        this.f927b = z10;
        oq oqVar = this.G[0];
        if (oqVar != null && oqVar.draw != z10) {
            oqVar.draw = z10;
            this.E.invalidate();
        }
    }
}
