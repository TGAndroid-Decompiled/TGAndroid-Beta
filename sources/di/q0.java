package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.mc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.zq;
public final class q0 extends FrameLayout implements j80 {
    public final TextView E;
    public final TextView F;
    public final zq[] G;
    public final zq[] H;
    public int I;
    public ValueAnimator J;
    public v0 K;
    public final Paint L;
    public boolean f8947a;
    public boolean f8948b;
    public final int f8949c;
    public final boolean d;
    public Drawable e;
    public float f8950f;
    public final mc h;
    public final LinearLayout f8951n;
    public final xh.n f8952r;
    public final xh.n f8953s;
    public CharSequence v;
    public final org.telegram.ui.Components.y9 f8954w;
    public final org.telegram.ui.Components.j9 f8955x;
    public final xh.n f8956y;

    public q0(int i10, Context context, boolean z10) {
        super(context);
        this.f8947a = false;
        this.f8948b = true;
        this.f8950f = 0.5f;
        this.G = new zq[1];
        this.H = new zq[1];
        this.L = new Paint(1);
        this.f8949c = i10;
        this.d = z10;
        mc mcVar = new mc(this, context);
        this.h = mcVar;
        mcVar.setOrientation(0);
        addView(mcVar, gb1.h(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.f8955x = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f8954w = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        mcVar.addView(y9Var, gb1.t(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        mcVar.addView(linearLayout, gb1.t(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f8951n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, gb1.r(-2, -2));
        xh.n nVar = new xh.n(context);
        this.f8952r = nVar;
        nVar.setTextColor(-1);
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(3);
        nVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(nVar, gb1.t(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        xh.n nVar2 = new xh.n(context);
        this.f8953s = nVar2;
        nVar2.setTextColor(org.telegram.ui.ActionBar.y6.o1(0.55f, -1));
        nVar2.setTextSize(1, 12.0f);
        nVar2.setGravity(5);
        linearLayout2.addView(nVar2, gb1.t(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        xh.n nVar3 = new xh.n(context);
        this.f8956y = nVar3;
        nVar3.setTextColor(-1);
        nVar3.setTextSize(1, 14.0f);
        nVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.y6.o1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(nVar3);
        linearLayout.addView(nVar3, gb1.r(-2, -2));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        mcVar.addView(textView, gb1.t(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        mcVar.addView(textView2, gb1.t(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        mc mcVar = this.h;
        if (mcVar.getBackground() == null) {
            int o12 = org.telegram.ui.ActionBar.y6.o1(f7 * 0.5f, -16777216);
            Paint paint = this.L;
            paint.setColor(o12);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(mcVar.getX(), mcVar.getY(), mcVar.getX() + mcVar.getWidth(), mcVar.getY() + mcVar.getHeight());
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
                drawable.setAlpha((int) (this.f8950f * 255.0f));
                this.h.invalidate();
            }
        }
        v0 v0Var = this.K;
        if (v0Var != null && this.e != null) {
            this.I = v0Var.f9238a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new ai.g0(this, 14));
            this.J.addListener(new bh.b(this, 8));
            this.J.setDuration(350L);
            this.J.setInterpolator(ds.h);
            this.J.start();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(di.v0 r28) {
        throw new UnsupportedOperationException("Method not decompiled: di.q0.set(di.v0):void");
    }

    public void setDrawStar(boolean z10) {
        this.f8948b = z10;
        zq zqVar = this.G[0];
        if (zqVar != null && zqVar.draw != z10) {
            zqVar.draw = z10;
            this.E.invalidate();
        }
    }
}
