package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class fd2 extends FrameLayout implements snb {
    public final vnb a;
    public final ImageView b;
    public final ema c;
    public final ema d;
    public final ema e;
    public final os1 f;
    public boolean h;
    public boolean n;

    public fd2(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, tre.e(52, 46, 51));
        ema emaVar = new ema(context);
        this.c = emaVar;
        emaVar.setTextSize(14);
        emaVar.setTypeface(hl.o());
        addView(emaVar, tre.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        ema emaVar2 = new ema(context);
        this.d = emaVar2;
        emaVar2.setTextSize(14);
        jn7.i(emaVar2);
        addView(emaVar2, tre.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        ema emaVar3 = new ema(context);
        this.e = emaVar3;
        emaVar3.setTextSize(14);
        emaVar3.l(ob6.M0(2131743925, null), false);
        emaVar3.setAlpha(0.0f);
        addView(emaVar3, tre.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        os1 os1Var = new os1(this, context, new npa());
        this.f = os1Var;
        os1Var.setRoundRadius(hl.L(6.0f));
        addView(os1Var, tre.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.lf));
        hashSet.add(Integer.valueOf(aob.nf));
        hashSet.add(Integer.valueOf(aob.Ol));
        hashSet.add(Integer.valueOf(aob.Xc));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.n) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        int i = aob.lf;
        vnb vnbVar = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(aob.v0(i, vnbVar), PorterDuff.Mode.MULTIPLY));
        this.c.setTextColor(aob.v0(aob.nf, vnbVar));
        int i2 = aob.Ol;
        int v0 = aob.v0(i2, vnbVar);
        ema emaVar = this.d;
        emaVar.setTextColor(v0);
        emaVar.setLinkTextColor(aob.v0(aob.Xc, vnbVar));
        this.e.setTextColor(aob.v0(i2, vnbVar));
    }
}
