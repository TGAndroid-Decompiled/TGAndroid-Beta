package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class pc2 extends FrameLayout implements tjb {
    public final wjb a;
    public final ImageView b;
    public final jia c;
    public final jia d;
    public final jia e;
    public final as1 f;
    public boolean h;
    public boolean n;

    public pc2(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, nme.e(52, 46, 51));
        jia jiaVar = new jia(context);
        this.c = jiaVar;
        jiaVar.setTextSize(14);
        jiaVar.setTypeface(gl.o());
        addView(jiaVar, nme.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        jia jiaVar2 = new jia(context);
        this.d = jiaVar2;
        jiaVar2.setTextSize(14);
        kk7.i(jiaVar2);
        addView(jiaVar2, nme.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        jia jiaVar3 = new jia(context);
        this.e = jiaVar3;
        jiaVar3.setTextSize(14);
        jiaVar3.l(k96.M0(2131744031, null), false);
        jiaVar3.setAlpha(0.0f);
        addView(jiaVar3, nme.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        as1 as1Var = new as1(this, context, new qla());
        this.f = as1Var;
        as1Var.setRoundRadius(gl.L(6.0f));
        addView(as1Var, nme.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.kf));
        hashSet.add(Integer.valueOf(bkb.mf));
        hashSet.add(Integer.valueOf(bkb.Nl));
        hashSet.add(Integer.valueOf(bkb.Wc));
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
        int i = bkb.kf;
        wjb wjbVar = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(bkb.v0(i, wjbVar), PorterDuff.Mode.MULTIPLY));
        this.c.setTextColor(bkb.v0(bkb.mf, wjbVar));
        int i2 = bkb.Nl;
        int v0 = bkb.v0(i2, wjbVar);
        jia jiaVar = this.d;
        jiaVar.setTextColor(v0);
        jiaVar.setLinkTextColor(bkb.v0(bkb.Wc, wjbVar));
        this.e.setTextColor(bkb.v0(i2, wjbVar));
    }
}
