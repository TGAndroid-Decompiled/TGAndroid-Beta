package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b0;
import org.telegram.ui.v;
import org.telegram.ui.z;
public final class q78 implements Runnable {
    public final byte a;
    public final Object b;

    public q78(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        ms1 ms1Var;
        int i;
        boolean z;
        byte b = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((r78) obj).p0.M.f();
                return;
            case 1:
                ((lb8) obj).invalidate();
                return;
            case 2:
                uz0 uz0Var = (uz0) obj;
                PhotoViewer photoViewer = (PhotoViewer) uz0Var.d;
                long j = uz0Var.a;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.C1(j);
                if (photoViewer.d2 == 1) {
                    long j2 = uz0Var.a;
                    photoViewer.c8 = j2;
                    if (photoViewer.b8 != j2) {
                        photoViewer.b8 = -1L;
                    }
                }
                uz0Var.c = null;
                return;
            case 3:
                PhotoViewer photoViewer2 = (PhotoViewer) ((kg3) obj).b;
                ImageView imageView = photoViewer2.E3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.E3.getParent()).removeView(photoViewer2.E3);
                    if (photoViewer2.D3 != null) {
                        ImageView imageView2 = photoViewer2.E3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        gm.w2(photoViewer2.D3);
                        photoViewer2.D3 = null;
                    }
                    photoViewer2.E3 = null;
                    return;
                }
                return;
            case 4:
                yv1 yv1Var = ((ea8) obj).W2.k4;
                if (yv1Var != null && (ms1Var = yv1Var.a0) != null) {
                    ms1Var.j1();
                    return;
                }
                return;
            case 5:
                PhotoViewer photoViewer3 = (PhotoViewer) ((u5) ((s38) obj).b).c;
                photoViewer3.H2 = false;
                ndc ndcVar = photoViewer3.G2;
                if (ndcVar != null) {
                    ndcVar.g0();
                }
                photoViewer3.I2 = null;
                return;
            case 6:
                PhotoViewer photoViewer4 = ((e98) obj).a;
                photoViewer4.H2 = false;
                ndc ndcVar2 = photoViewer4.G2;
                if (ndcVar2 != null) {
                    ndcVar2.g0();
                }
                photoViewer4.I2 = null;
                return;
            case 7:
                PhotoViewer photoViewer5 = ((v) ((s38) obj).b).r;
                photoViewer5.q7.e();
                Runnable runnable = photoViewer5.o4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.o4 = null;
                }
                photoViewer5.H1(true);
                return;
            case 8:
                PhotoViewer photoViewer6 = ((ha8) obj).b;
                Runnable runnable2 = photoViewer6.o4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.o4 = null;
                    return;
                }
                return;
            case 9:
                ((gb8) obj).y.e(true);
                return;
            case 10:
                ((kb8) obj).d = true;
                return;
            case 11:
                z zVar = (z) obj;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zVar.a.O0.getLayoutParams();
                ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                int D = wi8.D(34.0f, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer7 = zVar.a;
                if (!photoViewer7.s) {
                    i = gm.m;
                } else {
                    i = 0;
                }
                int i3 = D + i;
                if (i3 != layoutParams.topMargin) {
                    layoutParams.topMargin = i3;
                    photoViewer7.O0.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) zVar.a.P0.getLayoutParams();
                int D2 = wi8.D(40.0f, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer8 = zVar.a;
                if (!photoViewer8.s) {
                    i2 = gm.m;
                }
                int i4 = D2 + i2;
                if (layoutParams2.topMargin != i4) {
                    layoutParams2.topMargin = i4;
                    photoViewer8.P0.setLayoutParams(layoutParams2);
                    return;
                }
                return;
            case 12:
                ((wb8) obj).h = null;
                return;
            case 13:
                wb8 wb8Var = (wb8) ((wm4) obj).c;
                wb8Var.d.p0(wb8Var.e, false);
                return;
            case 14:
                ya8 ya8Var = (ya8) obj;
                if (ya8Var.y) {
                    ya8Var.h("pollPosition();");
                }
                if (ya8Var.H) {
                    gm.d3(ya8Var.M, 500L);
                    return;
                }
                return;
            case 15:
                yc3 yc3Var = (yc3) obj;
                ArrayList arrayList = (ArrayList) yc3Var.c;
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ad8 ad8Var = (ad8) arrayList.get(i5);
                    tl4 tl4Var = ad8Var.e;
                    if (tl4Var != null && ad8Var.c == 1 && tl4Var.g && !tl4Var.K) {
                        if (tl4Var.b.D() && Settings.canDrawOverlays(tl4Var.c)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z != tl4Var.f) {
                            tl4Var.l();
                            tl4Var.a();
                        }
                    }
                }
                yc3Var.d();
                return;
            case 16:
                ((vc8) obj).e0();
                return;
            case 17:
                ad8 ad8Var2 = (ad8) obj;
                if (ad8Var2.c == 1) {
                    ad8Var2.a.n0();
                    return;
                }
                return;
            case 18:
                ((le8) obj).m--;
                return;
            case 19:
                ((df8) obj).f();
                return;
            case 20:
                gm.E3(((lf8) obj).a);
                return;
            case 21:
                s09 s09Var = ((cj8) obj).G;
                s09Var.getAnimatedDrawable().I(0, true, false);
                s09Var.d();
                return;
            case 22:
                ((kj8) ((ij8) obj).c).D0();
                return;
            case 23:
                PremiumPreviewFragment premiumPreviewFragment = ((b0) obj).c;
                premiumPreviewFragment.showDialog(new cd9(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                return;
            case 24:
                sk8 sk8Var = (sk8) obj;
                int size = 1073741823 - (1073741823 % sk8Var.f3.size());
                u46 u46Var = sk8Var.g3;
                sk8Var.t3 = size;
                u46Var.g1(size, (sk8Var.getMeasuredHeight() - sk8Var.getChildAt(0).getMeasuredHeight()) >> 1);
                sk8Var.z1(null, false);
                return;
            case 25:
                ((k9b) obj).r();
                return;
            case 26:
                fn8 fn8Var = (fn8) obj;
                g36 g36Var = fn8Var.f;
                if (fn8Var.b == 0) {
                    fn8Var.c = true;
                    g36Var.e(u26.ON_PAUSE);
                }
                if (fn8Var.a == 0 && fn8Var.c) {
                    g36Var.e(u26.ON_STOP);
                    fn8Var.d = true;
                    return;
                }
                return;
            case 27:
                RectF rectF = ProfileActivity.e7;
                ((un8) obj).a(0);
                return;
            case 28:
                qo8 qo8Var = (qo8) obj;
                qo8Var.G.getNotificationCenter().j(qo8Var.F);
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) ((su) obj).c;
                if (profileActivity.y5 != 1.0f) {
                    zo8 zo8Var = profileActivity.o0;
                    while (zo8Var.E0.k(i2) != zo8Var.getRealCount() - 1) {
                        i2++;
                    }
                    zo8Var.x(i2, true);
                    return;
                }
                return;
        }
    }
}
