package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import hh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.si0;

public final class r8 extends AnimatorListenerAdapter {

    public final int f13921a;

    public final i9 f13922b;

    public r8(i9 i9Var, int i10) {
        this.f13921a = i10;
        this.f13922b = i9Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e4 e4VarT;
        si0 si0Var;
        switch (this.f13921a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.f13922b;
                f9 f9Var = i9Var.f13496o0;
                x8 x8Var = i9Var.v;
                if (x8Var != null) {
                    x8Var.a(true);
                }
                i9Var.o();
                i9Var.F0.unlock();
                w6 w6Var = i9Var.f13501q1;
                if (w6Var != null) {
                    w6Var.b();
                    AndroidUtilities.removeFromParent(i9Var.f13501q1);
                    i9Var.f13501q1 = null;
                }
                ImageReceiver imageReceiver = f9Var.f13334b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    f9Var.f13334b = null;
                }
                ImageReceiver imageReceiver2 = f9Var.f13335c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    f9Var.f13335c.setVisible(true, true);
                }
                if (f9Var.d != null && (e4VarT = i9Var.t()) != null && (si0Var = e4VarT.f13247k1.d) != null) {
                    si0 si0Var2 = f9Var.d;
                    si0Var2.getClass();
                    si0Var2.f32455c = si0Var.f32455c;
                    si0Var2.f32457f = si0Var.f32457f;
                    si0Var2.f32454b = si0Var.f32454b;
                    si0Var2.f32453a = System.currentTimeMillis();
                    si0Var2.c();
                }
                d4 d4Var = i9Var.C0;
                if (d4Var != null) {
                    d4Var.a();
                }
                SurfaceView surfaceView = i9Var.f13516y0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                i9Var.I();
                try {
                    AndroidUtilities.runOnUIThread(new y9(this, 27));
                    break;
                } catch (Exception unused) {
                }
                i9Var.f13485i0 = false;
                i9Var.d = false;
                l3 l3Var = i9Var.f13490k1;
                if (l3Var != null) {
                    l3Var.run();
                    i9Var.f13490k1 = null;
                }
                break;
            case 1:
                i9 i9Var2 = this.f13922b;
                i9Var2.D = null;
                i9Var2.V = 0.0f;
                i9Var2.Z = 0.0f;
                y8 y8Var = i9Var2.f13487j0;
                e4 currentPeerView = y8Var != null ? y8Var.getCurrentPeerView() : null;
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                break;
            default:
                i9 i9Var3 = this.f13922b;
                f9 f9Var2 = i9Var3.f13496o0;
                i9Var3.Q = 1.0f;
                i9Var3.o();
                i9.f13457t1 = false;
                x8 x8Var2 = i9Var3.v;
                if (x8Var2 != null) {
                    x8Var2.a(true);
                }
                w8 w8Var = i9Var3.f13505s;
                if (w8Var != null) {
                    w8Var.invalidate();
                }
                ImageReceiver imageReceiver3 = f9Var2.f13334b;
                if (imageReceiver3 != null && !i9Var3.d) {
                    imageReceiver3.setVisible(true, true);
                    f9Var2.f13334b = null;
                }
                ImageReceiver imageReceiver4 = f9Var2.f13335c;
                if (imageReceiver4 != null && !i9Var3.d) {
                    imageReceiver4.setAlpha(1.0f);
                    f9Var2.f13335c.setVisible(true, true);
                    f9Var2.f13335c = null;
                }
                e4 e4VarT2 = i9Var3.t();
                if (e4VarT2 != null) {
                    e4VarT2.f1(false);
                }
                d1 d1Var = i9Var3.f13512w0;
                if (d1Var != null) {
                    d1Var.v((1.0f - i9Var3.R) * i9Var3.Q);
                }
                if (i9Var3.f13507s1) {
                    i9Var3.f13507s1 = false;
                    i9Var3.p();
                    AndroidUtilities.runOnUIThread(new l3(i9Var3, 1), 30L);
                } else if (!SharedConfig.storiesIntroShown) {
                    if (i9Var3.f13501q1 == null && i9Var3.v != null) {
                        w6 w6Var2 = new w6(i9Var3.v.getContext(), i9Var3.f13505s);
                        i9Var3.f13501q1 = w6Var2;
                        w6Var2.setAlpha(0.0f);
                        i9Var3.v.addView(i9Var3.f13501q1);
                    }
                    w6 w6Var3 = i9Var3.f13501q1;
                    if (w6Var3 != null) {
                        w6Var3.setOnClickListener(new ag.w0(this, 25));
                        i9Var3.f13501q1.animate().alpha(1.0f).setDuration(150L).setListener(new b9(this, 1)).start();
                    }
                    SharedConfig.setStoriesIntroShown(true);
                }
                i9Var3.P();
                i9Var3.F0.unlock();
                break;
        }
    }
}
