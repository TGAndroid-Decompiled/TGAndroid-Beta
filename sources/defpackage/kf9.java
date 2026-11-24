package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.q;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.SecretMediaViewer;
import org.webrtc.ScreenCapturerAndroid;
public final class kf9 implements Runnable {
    public final byte a;
    public final Object b;

    public kf9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((of9) obj).c();
                return;
            case 1:
                mi9 mi9Var = (mi9) obj;
                uj9 uj9Var = mi9Var.e;
                if (uj9Var == null || !uj9Var.G()) {
                    mi9Var.w.k0();
                    return;
                }
                return;
            case 2:
                View view = ((si9) obj).W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 3:
                View view2 = ((ti9) obj).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                mc2 mc2Var = ((uj9) obj).F;
                if (mc2Var != null) {
                    mc2Var.i();
                    return;
                }
                return;
            case 5:
                tj9 tj9Var = (tj9) obj;
                tj9Var.K = null;
                if (tj9Var.R != null) {
                    tj9Var.L = true;
                    View view3 = tj9Var.T;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    ti9 ti9Var = tj9Var.R;
                    uj9 uj9Var2 = tj9Var.a;
                    rc2 rc2Var = uj9Var2.E;
                    mc2 mc2Var2 = uj9Var2.F;
                    ti9Var.getClass();
                    if (rc2Var != null && mc2Var2 != null) {
                        mc2Var2.m0(rc2Var, ti9Var.b);
                        return;
                    }
                    return;
                } else if (tj9Var.N != null) {
                    tj9Var.L = true;
                    View view4 = tj9Var.T;
                    if (view4 != null) {
                        try {
                            view4.performHapticFeedback(0);
                        } catch (Exception unused2) {
                        }
                    }
                    tj9Var.l(tj9Var.N, true);
                    i66 i66Var = tj9Var.J;
                    if (i66Var != null) {
                        i66Var.e(true);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 6:
                al9 al9Var = (al9) obj;
                if (al9Var.f0 && al9Var.j0() != al9Var.j0) {
                    al9Var.p0("on screen, settled after start", true);
                    return;
                }
                return;
            case 7:
                ((dj3) obj).invalidate();
                return;
            case 8:
                wc1 wc1Var = (wc1) obj;
                if (wc1Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) wc1Var.getParent()).removeView(wc1Var);
                    return;
                }
                return;
            case 9:
                q qVar = (q) ((lj4) obj).a;
                qVar.s0 = true;
                fc4.b("RoundVideo camera flip first frame: elapsedMs=" + q.b(qVar));
                qVar.n(true);
                qVar.q();
                return;
            case 10:
                ((lo9) obj).a.C(false);
                return;
            case 11:
                oo9 oo9Var = ((no9) obj).a;
                if (!oo9Var.w && oo9Var.V != null) {
                    fc4.b("[LivePlayer] stream asks to rejoin");
                    oo9Var.X = true;
                    oo9Var.n();
                    return;
                }
                return;
            case 12:
                vo9 vo9Var = ((to9) obj).a;
                if (!vo9Var.w && vo9Var.O != null) {
                    fc4.b("[LivePlayer] stream asks to rejoin");
                    vo9Var.K();
                    return;
                }
                return;
            case 13:
                u96 u96Var = ((uo9) obj).a.Y;
                if (u96Var != null) {
                    u96Var.run();
                    return;
                }
                return;
            case 14:
                tp9 tp9Var = ((qp9) obj).h;
                ad8 ad8Var = tp9Var.a;
                if (ad8Var != null) {
                    ad8Var.d();
                }
                sp9 sp9Var = tp9Var.f;
                if (sp9Var != null) {
                    sp9Var.a();
                    return;
                }
                return;
            case 15:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.w.clear();
                saveToGallerySettingsActivity.getUserConfig().z(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.w);
                saveToGallerySettingsActivity.e0();
                return;
            case 16:
                ScreenCapturerAndroid.b((ScreenCapturerAndroid) obj);
                return;
            case 17:
                ud5 ud5Var = (ud5) obj;
                ud5Var.dismiss();
                l11.u(ud5Var.getContext(), jb6.M0(2131746351, null));
                return;
            case 18:
                ju9 ju9Var = (ju9) obj;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i = ju9Var.d;
                bc4.G(i).y(arrayList);
                bc4.G(i).P(arrayList2);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    bc4.G(i);
                    if (bc4.M(((k47) arrayList.get(i2)).k, false, true).exists()) {
                        arrayList3.add((k47) arrayList.get(i2));
                    }
                }
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    bc4.G(i);
                    if (!bc4.M(((k47) arrayList2.get(i3)).k, false, true).exists()) {
                        arrayList4.add((k47) arrayList2.get(i3));
                    }
                }
                gm.c3(new ak8(ju9Var, arrayList3, arrayList4, (byte) 27));
                return;
            case 19:
                ((mu9) obj).invalidateSelf();
                return;
            case 20:
                ((xu9) obj).f.setVisibility(8);
                return;
            case 21:
                ((sj3) obj).q();
                return;
            case 22:
                dw9 dw9Var = (dw9) obj;
                ArrayList arrayList5 = dw9Var.f;
                if (!arrayList5.isEmpty()) {
                    dw9Var.getMessagesController().S3(arrayList5, null, null, false, 0);
                    arrayList5.clear();
                    return;
                }
                return;
            case 23:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((ic8) obj).c;
                Runnable runnable = secretMediaViewer.n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.n0 = null;
                    return;
                }
                return;
            case 24:
                tw9 tw9Var = (tw9) ((x59) obj).b;
                tw9Var.R = true;
                tw9Var.O.invalidate();
                return;
            case 25:
                ((ww9) obj).k();
                return;
            case 26:
                rc2 rc2Var2 = ((gx9) obj).n;
                if (rc2Var2 != null) {
                    rc2Var2.invalidate();
                    return;
                }
                return;
            case 27:
                lx9 lx9Var = (lx9) obj;
                lx9Var.q = false;
                lx9Var.b.run();
                return;
            case 28:
                gm.P3(((ny9) obj).c, true, true);
                return;
            default:
                l7c l7cVar = ((k0a) obj).d2;
                if (l7cVar != null) {
                    l7cVar.O(true);
                    return;
                }
                return;
        }
    }
}
