package bi;

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
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.l80;
public final class z0 extends FrameLayout implements l80 {
    public final TextView E;
    public final TextView F;
    public final br[] G;
    public final br[] H;
    public int I;
    public ValueAnimator J;
    public e1 K;
    public final Paint L;
    public boolean f4046a;
    public boolean f4047b;
    public final int f4048c;
    public final boolean d;
    public Drawable e;
    public float f4049f;
    public final v0 h;
    public final LinearLayout f4050n;
    public final wh.n f4051r;
    public final wh.n f4052s;
    public CharSequence v;
    public final org.telegram.ui.Components.z9 f4053w;
    public final org.telegram.ui.Components.k9 f4054x;
    public final wh.n f4055y;

    public z0(int i10, Context context, boolean z10) {
        super(context);
        this.f4046a = false;
        this.f4047b = true;
        this.f4049f = 0.5f;
        this.G = new br[1];
        this.H = new br[1];
        this.L = new Paint(1);
        this.f4048c = i10;
        this.d = z10;
        v0 v0Var = new v0(this, context);
        this.h = v0Var;
        v0Var.setOrientation(0);
        addView(v0Var, w7.a6.a(-2.0f, 0.0f, 0.5f, 0.0f, 0.5f, -2, 51));
        this.f4054x = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.f4053w = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        v0Var.addView(z9Var, w7.a6.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        v0Var.addView(linearLayout, w7.a6.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f4050n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, w7.a6.n(-2, -2));
        wh.n nVar = new wh.n(context);
        this.f4051r = nVar;
        nVar.setTextColor(-1);
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(3);
        nVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(nVar, w7.a6.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        wh.n nVar2 = new wh.n(context);
        this.f4052s = nVar2;
        nVar2.setTextColor(org.telegram.ui.ActionBar.g6.m1(0.55f, -1));
        nVar2.setTextSize(1, 12.0f);
        nVar2.setGravity(5);
        linearLayout2.addView(nVar2, w7.a6.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        wh.n nVar3 = new wh.n(context);
        this.f4055y = nVar3;
        nVar3.setTextColor(-1);
        nVar3.setTextSize(1, 14.0f);
        nVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.g6.m1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(nVar3);
        linearLayout.addView(nVar3, w7.a6.n(-2, -2));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        v0Var.addView(textView, w7.a6.p(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        v0Var.addView(textView2, w7.a6.p(-2, -2, 0.0f, 85, 0, 3, 10, 0));
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
                drawable.setAlpha((int) (this.f4049f * 255.0f));
                this.h.invalidate();
            }
        }
        e1 e1Var = this.K;
        if (e1Var != null && this.e != null) {
            this.I = e1Var.f2970a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new ah.c0(this, 5));
            this.J.addListener(new ah.b(this, 5));
            this.J.setDuration(350L);
            this.J.setInterpolator(es.h);
            this.J.start();
        }
    }

    @Override
    public final void c(Canvas canvas, float f7) {
        v0 v0Var = this.h;
        if (v0Var.getBackground() == null) {
            int m12 = org.telegram.ui.ActionBar.g6.m1(f7 * 0.5f, -16777216);
            Paint paint = this.L;
            paint.setColor(m12);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(v0Var.getX(), v0Var.getY(), v0Var.getX() + v0Var.getWidth(), v0Var.getY() + v0Var.getHeight());
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

    public void set(bi.e1 r28) {
        throw new UnsupportedOperationException("Method not decompiled: bi.z0.set(bi.e1):void");
    }

    public void setDrawStar(boolean z10) {
        this.f4047b = z10;
        br brVar = this.G[0];
        if (brVar != null && brVar.draw != z10) {
            brVar.draw = z10;
            this.E.invalidate();
        }
    }
}
