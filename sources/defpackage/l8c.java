package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.a;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.IUpdateLayout;
public final class l8c extends IUpdateLayout {
    public FrameLayout a;
    public RadialProgress2 b;
    public mh2 c;
    public final Activity d;
    public final ViewGroup e;

    public l8c(Activity activity, ViewGroup viewGroup) {
        super(activity, viewGroup);
        this.d = activity;
        this.e = viewGroup;
    }

    @Override
    public final void createUpdateUI(int i) {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null && this.a == null) {
            Activity activity = this.d;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.a = frameLayout;
            frameLayout.setVisibility(4);
            this.a.setTranslationY(gm.L(44.0f));
            this.a.setBackground(cmb.f0(1090519039, 2, -1));
            viewGroup.addView(this.a, qoe.e(-1, 44, 83));
            this.a.setOnClickListener(new v0(this, i, (byte) 26));
            mh2 mh2Var = new mh2(this, activity);
            this.c = mh2Var;
            mh2Var.setTextSize(gm.L(15.0f));
            this.c.setTypeface(gm.o());
            this.c.setTextColor(-1);
            this.c.setGravity(17);
            this.a.addView(this.c, qoe.g());
            this.c.c(jb6.M0(2131754194, null), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.c, null);
            this.b = radialProgress2;
            int i2 = cmb.Ei;
            radialProgress2.setColors(-1, -1, cmb.w0(null, i2, false), cmb.w0(null, i2, false));
            this.b.p(0, 0, gm.L(22.0f), gm.L(22.0f));
            this.b.setCircleRadius(gm.L(11.0f));
            this.b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i, boolean z) {
        li0 li0Var;
        int i2;
        if (this.e != null) {
            ((ApplicationLoaderImpl) a.a).getClass();
            oi0 e = oi0.e();
            String str = e.a;
            if (str != null && (i2 = e.b) != 0) {
                li0Var = new li0(str, i2, e.c);
            } else {
                li0Var = null;
            }
            if (li0Var != null) {
                createUpdateUI(i);
                File g = a.a.g();
                if (g != null && g.exists()) {
                    this.b.setIcon(15, true, z);
                    this.c.c(jb6.M0(2131754190, null), z, true);
                } else {
                    ((ApplicationLoaderImpl) a.a).getClass();
                    boolean z2 = oi0.e().j;
                    RadialProgress2 radialProgress2 = this.b;
                    if (z2) {
                        radialProgress2.setIcon(3, true, z);
                        RadialProgress2 radialProgress22 = this.b;
                        ((ApplicationLoaderImpl) a.a).getClass();
                        radialProgress22.o(true, oi0.e().k);
                        ((ApplicationLoaderImpl) a.a).getClass();
                        this.c.c(jb6.a0(null, null, 2131754191, Integer.valueOf((int) (oi0.e().k * 100.0f))), z, true);
                    } else {
                        radialProgress2.setIcon(2, true, z);
                        this.c.c(jb6.M0(2131754194, null), z, true);
                    }
                }
                if (this.a.getTag() == null) {
                    this.a.setVisibility(0);
                    this.a.setTag(1);
                    FrameLayout frameLayout = this.a;
                    if (z) {
                        frameLayout.animate().translationY(0.0f).setInterpolator(d53.g).setListener(null).setDuration(180L).start();
                        return;
                    } else {
                        frameLayout.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            }
            FrameLayout frameLayout2 = this.a;
            if (frameLayout2 != null && frameLayout2.getTag() != null) {
                this.a.setTag(null);
                FrameLayout frameLayout3 = this.a;
                if (z) {
                    frameLayout3.animate().translationY(gm.L(44.0f)).setInterpolator(d53.g).setListener(new q7b(this, (byte) 15)).setDuration(180L).start();
                    return;
                }
                frameLayout3.setTranslationY(gm.L(44.0f));
                this.a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.a != null && this.c != null) {
            ((ApplicationLoaderImpl) a.a).getClass();
            if (oi0.e().j) {
                ((ApplicationLoaderImpl) a.a).getClass();
                float f = oi0.e().k;
                this.b.o(true, f);
                this.c.setText(jb6.a0(null, null, 2131754191, Integer.valueOf((int) (f * 100.0f))));
                this.a.invalidate();
            }
        }
    }
}
