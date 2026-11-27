package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.ApplicationLoaderImpl;
import org.telegram.messenger.a;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.IUpdateLayout;
public final class kac extends IUpdateLayout {
    public FrameLayout a;
    public RadialProgress2 b;
    public qg2 c;
    public final Activity d;
    public final ViewGroup e;

    public kac(Activity activity, ViewGroup viewGroup) {
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
            this.a.setTranslationY(hl.L(44.0f));
            this.a.setBackground(aob.f0(1090519039, 2, -1));
            viewGroup.addView(this.a, tre.e(-1, 44, 83));
            this.a.setOnClickListener(new w0(this, i, (byte) 27));
            qg2 qg2Var = new qg2(this, activity);
            this.c = qg2Var;
            qg2Var.setTextSize(hl.L(15.0f));
            this.c.setTypeface(hl.o());
            this.c.setTextColor(-1);
            this.c.setGravity(17);
            this.a.addView(this.c, tre.g());
            this.c.c(ob6.M0(2131754222, null), false, true);
            RadialProgress2 radialProgress2 = new RadialProgress2(this.c, null);
            this.b = radialProgress2;
            int i2 = aob.Fi;
            radialProgress2.setColors(-1, -1, aob.w0(null, i2, false), aob.w0(null, i2, false));
            this.b.p(0, 0, hl.L(22.0f), hl.L(22.0f));
            this.b.setCircleRadius(hl.L(11.0f));
            this.b.setAsMini();
        }
    }

    @Override
    public final void updateAppUpdateViews(int i, boolean z) {
        mh0 mh0Var;
        int i2;
        if (this.e != null) {
            ((ApplicationLoaderImpl) a.a).getClass();
            ph0 e = ph0.e();
            String str = e.a;
            if (str != null && (i2 = e.b) != 0) {
                mh0Var = new mh0(str, i2, e.c);
            } else {
                mh0Var = null;
            }
            if (mh0Var != null) {
                createUpdateUI(i);
                File g = a.a.g();
                if (g != null && g.exists()) {
                    this.b.setIcon(15, true, z);
                    this.c.c(ob6.M0(2131754218, null), z, true);
                } else {
                    ((ApplicationLoaderImpl) a.a).getClass();
                    boolean z2 = ph0.e().j;
                    RadialProgress2 radialProgress2 = this.b;
                    if (z2) {
                        radialProgress2.setIcon(3, true, z);
                        RadialProgress2 radialProgress22 = this.b;
                        ((ApplicationLoaderImpl) a.a).getClass();
                        radialProgress22.o(true, ph0.e().k);
                        ((ApplicationLoaderImpl) a.a).getClass();
                        this.c.c(ob6.a0(null, null, 2131754219, Integer.valueOf((int) (ph0.e().k * 100.0f))), z, true);
                    } else {
                        radialProgress2.setIcon(2, true, z);
                        this.c.c(ob6.M0(2131754222, null), z, true);
                    }
                }
                if (this.a.getTag() == null) {
                    this.a.setVisibility(0);
                    this.a.setTag(1);
                    FrameLayout frameLayout = this.a;
                    if (z) {
                        frameLayout.animate().translationY(0.0f).setInterpolator(k43.g).setListener(null).setDuration(180L).start();
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
                    frameLayout3.animate().translationY(hl.L(44.0f)).setInterpolator(k43.g).setListener(new omb(this, (byte) 12)).setDuration(180L).start();
                    return;
                }
                frameLayout3.setTranslationY(hl.L(44.0f));
                this.a.setVisibility(4);
            }
        }
    }

    @Override
    public final void updateFileProgress(Object[] objArr) {
        if (this.a != null && this.c != null) {
            ((ApplicationLoaderImpl) a.a).getClass();
            if (ph0.e().j) {
                ((ApplicationLoaderImpl) a.a).getClass();
                float f = ph0.e().k;
                this.b.o(true, f);
                this.c.setText(ob6.a0(null, null, 2131754219, Integer.valueOf((int) (f * 100.0f))));
                this.a.invalidate();
            }
        }
    }
}
