package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashMap;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.a;
public final class lu3 implements ptc {
    public final ou3 a;

    public lu3(ou3 ou3Var) {
        this.a = ou3Var;
    }

    @Override
    public final void a(boolean z, ltc ltcVar, float f, boolean z2) {
        if (z) {
            ou3 ou3Var = this.a;
            if (ou3Var.s1 != null) {
                try {
                    ou3Var.b.setSystemUiVisibility(0);
                    ou3 ou3Var2 = this.a;
                    int i = ou3Var2.F1;
                    if (i != -2) {
                        ou3Var2.s1.setRequestedOrientation(i);
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
            if (this.a.o1.getVisibility() == 0) {
                ViewGroup viewGroup = this.a.b;
                viewGroup.setTranslationY(gl.L(10.0f) + viewGroup.getMeasuredHeight());
                this.a.Z.setAlpha(0);
            }
            this.a.setOnShowListener(null);
            ou3 ou3Var3 = this.a;
            if (z2) {
                TextureView textureView = ou3Var3.m1.getTextureView();
                View controlsView = this.a.m1.getControlsView();
                ImageView textureImageView = this.a.m1.getTextureImageView();
                l29 G0 = this.a.G0(true, f);
                float width = G0.c / textureView.getWidth();
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.SCALE_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, width);
                Property property2 = View.SCALE_Y;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, width);
                Property property3 = View.TRANSLATION_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, G0.a);
                Property property4 = View.TRANSLATION_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textureImageView, property4, G0.b);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textureView, property, width);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textureView, property2, width);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textureView, property3, G0.a);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textureView, property4, G0.b);
                ViewGroup viewGroup2 = this.a.b;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(viewGroup2, property4, gl.L(10.0f) + viewGroup2.getMeasuredHeight());
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this.a.Z, rn.d, 0);
                FrameLayout frameLayout = this.a.o1;
                Property property5 = View.ALPHA;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofInt, ObjectAnimator.ofFloat(frameLayout, property5, 0.0f), ObjectAnimator.ofFloat(controlsView, property5, 0.0f));
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
                animatorSet.addListener(new u5(this, ltcVar, (byte) 19));
                animatorSet.start();
                return;
            }
            if (ou3Var3.o1.getVisibility() == 0) {
                this.a.o1.setAlpha(1.0f);
                this.a.o1.setVisibility(4);
            }
            ltcVar.run();
            this.a.I();
            return;
        }
        if (a.x) {
            try {
                this.a.s1.startService(new Intent(a.b, BringAppForegroundService.class));
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
        ou3 ou3Var4 = this.a;
        if (z2) {
            ou3Var4.setOnShowListener(ou3Var4.L1);
            l29 G02 = this.a.G0(false, f);
            TextureView textureView2 = this.a.m1.getTextureView();
            ImageView textureImageView2 = this.a.m1.getTextureImageView();
            float f2 = G02.c / textureView2.getLayoutParams().width;
            textureImageView2.setScaleX(f2);
            textureImageView2.setScaleY(f2);
            textureImageView2.setTranslationX(G02.a);
            textureImageView2.setTranslationY(G02.b);
            textureView2.setScaleX(f2);
            textureView2.setScaleY(f2);
            textureView2.setTranslationX(G02.a);
            textureView2.setTranslationY(G02.b);
        } else {
            ou3Var4.D0();
        }
        ou3 ou3Var5 = this.a;
        ou3Var5.f0 = true;
        ou3Var5.show();
        if (z2) {
            ou3 ou3Var6 = this.a;
            ou3Var6.J1 = 4;
            ou3Var6.Z.setAlpha(1);
            ViewGroup viewGroup3 = this.a.b;
            viewGroup3.setTranslationY(gl.L(10.0f) + viewGroup3.getMeasuredHeight());
        }
    }

    @Override
    public final TextureView b(View view, boolean z, float f, int i, boolean z2) {
        ou3 ou3Var = this.a;
        Activity activity = ou3Var.s1;
        FrameLayout frameLayout = ou3Var.o1;
        if (z) {
            frameLayout.setVisibility(0);
            frameLayout.setAlpha(1.0f);
            frameLayout.addView(ou3Var.m1.getAspectRatioView());
            ou3Var.H1 = false;
            ou3Var.G1 = z2;
            if (activity != null) {
                try {
                    ou3Var.F1 = activity.getRequestedOrientation();
                    if (z2) {
                        if (((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                            activity.setRequestedOrientation(8);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                    ou3Var.b.setSystemUiVisibility(1028);
                    return null;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return null;
                }
            }
            return null;
        }
        frameLayout.setVisibility(4);
        ou3Var.G1 = false;
        if (activity != null) {
            try {
                ou3Var.b.setSystemUiVisibility(0);
                activity.setRequestedOrientation(ou3Var.F1);
                return null;
            } catch (Exception e2) {
                fa4.g(e2, true);
                return null;
            }
        }
        return null;
    }

    @Override
    public final void c() {
        ou3 ou3Var = this.a;
        if (ou3Var.m1.f()) {
            ou3Var.I();
        }
    }

    @Override
    public final void e() {
        ou3 ou3Var = this.a;
        ku3 ku3Var = ou3Var.l1;
        ku3Var.setVisibility(0);
        ou3Var.t1.setVisibility(0);
        ou3Var.u1.setVisibility(4);
        ku3Var.setKeepScreenOn(true);
        stc stcVar = ou3Var.m1;
        stcVar.setVisibility(4);
        stcVar.getControlsView().setVisibility(4);
        stcVar.getTextureView().setVisibility(4);
        if (stcVar.getTextureImageView() != null) {
            stcVar.getTextureImageView().setVisibility(4);
        }
        ou3Var.m1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            ku3Var.loadUrl(ou3Var.E1, hashMap);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final TextureView f(View view, boolean z, int i, int i2, boolean z2) {
        ou3 ou3Var = this.a;
        stc stcVar = ou3Var.m1;
        int[] iArr = ou3Var.y1;
        if (z) {
            view.setTranslationY(0.0f);
            TextureView textureView = new TextureView(ou3Var.s1);
            ou3Var.J0(textureView, i, i2);
            return textureView;
        } else if (z2) {
            ou3Var.I1 = true;
            stcVar.getAspectRatioView().getLocationInWindow(iArr);
            iArr[0] = iArr[0] - ou3Var.R();
            iArr[1] = (int) (iArr[1] - ou3Var.b.getTranslationY());
            TextureView textureView2 = stcVar.getTextureView();
            ImageView textureImageView = stcVar.getTextureImageView();
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textureImageView, property, 1.0f);
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textureImageView, property2, 1.0f);
            Property property3 = View.TRANSLATION_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textureImageView, property3, iArr[0]);
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(textureImageView, property4, iArr[1]), ObjectAnimator.ofFloat(textureView2, property, 1.0f), ObjectAnimator.ofFloat(textureView2, property2, 1.0f), ObjectAnimator.ofFloat(textureView2, property3, iArr[0]), ObjectAnimator.ofFloat(textureView2, property4, iArr[1]), ObjectAnimator.ofFloat(ou3Var.b, property4, 0.0f), ObjectAnimator.ofInt(ou3Var.Z, rn.d, 51));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(250L);
            animatorSet.addListener(new im2(this, (byte) 15));
            animatorSet.start();
            return null;
        } else {
            ou3Var.b.setTranslationY(0.0f);
            return null;
        }
    }

    @Override
    public final void g(stc stcVar, boolean z) {
        Activity activity = this.a.s1;
        if (z) {
            try {
                activity.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        try {
            activity.getWindow().clearFlags(128);
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public final ViewGroup h() {
        return this.a.c;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final void d(float f) {
    }
}
