package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class ae2 extends FrameLayout implements vlb {
    public final ylb a;
    public final ImageView b;
    public final lka c;
    public final lka d;
    public final lka e;
    public final nt1 f;
    public boolean h;
    public boolean n;

    public ae2(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, qoe.e(52, 46, 51));
        lka lkaVar = new lka(context);
        this.c = lkaVar;
        lkaVar.setTextSize(14);
        lkaVar.setTypeface(gm.o());
        addView(lkaVar, qoe.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        lka lkaVar2 = new lka(context);
        this.d = lkaVar2;
        lkaVar2.setTextSize(14);
        nm7.i(lkaVar2);
        addView(lkaVar2, qoe.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        lka lkaVar3 = new lka(context);
        this.e = lkaVar3;
        lkaVar3.setTextSize(14);
        lkaVar3.l(jb6.M0(2131743957, null), false);
        lkaVar3.setAlpha(0.0f);
        addView(lkaVar3, qoe.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        nt1 nt1Var = new nt1(this, context, new rna());
        this.f = nt1Var;
        nt1Var.setRoundRadius(gm.L(6.0f));
        addView(nt1Var, qoe.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.kf));
        hashSet.add(Integer.valueOf(cmb.mf));
        hashSet.add(Integer.valueOf(cmb.Nl));
        hashSet.add(Integer.valueOf(cmb.Wc));
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
        int i = cmb.kf;
        ylb ylbVar = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(cmb.v0(i, ylbVar), PorterDuff.Mode.MULTIPLY));
        this.c.setTextColor(cmb.v0(cmb.mf, ylbVar));
        int i2 = cmb.Nl;
        int v0 = cmb.v0(i2, ylbVar);
        lka lkaVar = this.d;
        lkaVar.setTextColor(v0);
        lkaVar.setLinkTextColor(cmb.v0(cmb.Wc, ylbVar));
        this.e.setTextColor(cmb.v0(i2, ylbVar));
    }
}
