package defpackage;

import android.location.Location;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.q;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.SecretMediaViewer;
import org.webrtc.ScreenCapturerAndroid;
public final class zk9 implements Runnable {
    public final byte a;
    public final Object b;

    public zk9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pb1 pb1Var = (pb1) obj;
                if (pb1Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pb1Var.getParent()).removeView(pb1Var);
                    return;
                }
                return;
            case 1:
                q qVar = (q) ((gi3) obj).a;
                qVar.s0 = true;
                fa4.b("RoundVideo camera flip first frame: elapsedMs=" + q.b(qVar));
                qVar.n(true);
                qVar.q();
                return;
            case 2:
                ((km9) obj).a.C(false);
                return;
            case 3:
                nm9 nm9Var = ((mm9) obj).a;
                if (!nm9Var.w && nm9Var.V != null) {
                    fa4.b("[LivePlayer] stream asks to rejoin");
                    nm9Var.X = true;
                    nm9Var.n();
                    return;
                }
                return;
            case 4:
                um9 um9Var = ((sm9) obj).a;
                if (!um9Var.w && um9Var.O != null) {
                    fa4.b("[LivePlayer] stream asks to rejoin");
                    um9Var.K();
                    return;
                }
                return;
            case 5:
                v76 v76Var = ((tm9) obj).a.Y;
                if (v76Var != null) {
                    v76Var.run();
                    return;
                }
                return;
            case 6:
                sn9 sn9Var = ((pn9) obj).h;
                xa8 xa8Var = sn9Var.a;
                if (xa8Var != null) {
                    xa8Var.d();
                }
                rn9 rn9Var = sn9Var.f;
                if (rn9Var != null) {
                    rn9Var.a();
                    return;
                }
                return;
            case 7:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.w.clear();
                saveToGallerySettingsActivity.getUserConfig().z(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.w);
                saveToGallerySettingsActivity.d0();
                return;
            case 8:
                ScreenCapturerAndroid.b((ScreenCapturerAndroid) obj);
                return;
            case 9:
                wb5 wb5Var = (wb5) obj;
                wb5Var.dismiss();
                d01.t(wb5Var.getContext(), k96.M0(2131746425, null));
                return;
            case 10:
                hs9 hs9Var = (hs9) obj;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i = hs9Var.d;
                ba4.G(i).y(arrayList);
                ba4.G(i).P(arrayList2);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ba4.G(i);
                    if (ba4.M(((k27) arrayList.get(i2)).k, false, true).exists()) {
                        arrayList3.add((k27) arrayList.get(i2));
                    }
                }
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    ba4.G(i);
                    if (!ba4.M(((k27) arrayList2.get(i3)).k, false, true).exists()) {
                        arrayList4.add((k27) arrayList2.get(i3));
                    }
                }
                gl.c3(new gm8(hs9Var, arrayList3, arrayList4, (byte) 24));
                return;
            case 11:
                ((ks9) obj).invalidateSelf();
                return;
            case 12:
                ((vs9) obj).f.setVisibility(8);
                return;
            case 13:
                ((hi3) obj).r();
                return;
            case 14:
                bu9 bu9Var = (bu9) obj;
                ArrayList arrayList5 = bu9Var.f;
                if (!arrayList5.isEmpty()) {
                    bu9Var.getMessagesController().Q3(arrayList5, null, null, false, 0);
                    arrayList5.clear();
                    return;
                }
                return;
            case 15:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((eh8) obj).c;
                Runnable runnable = secretMediaViewer.n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.n0 = null;
                    return;
                }
                return;
            case 16:
                qu9 qu9Var = (qu9) ((u39) obj).b;
                qu9Var.R = true;
                qu9Var.O.invalidate();
                return;
            case 17:
                ((tu9) obj).k();
                return;
            case 18:
                gb2 gb2Var = ((dv9) obj).n;
                if (gb2Var != null) {
                    gb2Var.invalidate();
                    return;
                }
                return;
            case 19:
                iv9 iv9Var = (iv9) obj;
                iv9Var.q = false;
                iv9Var.b.run();
                return;
            case 20:
                gl.P3(((lw9) obj).c, true, true);
                return;
            case 21:
                l5c l5cVar = ((iy9) obj).d2;
                if (l5cVar != null) {
                    l5cVar.O(true);
                    return;
                }
                return;
            case 22:
                ((by9) obj).a();
                return;
            case 23:
                ((bz9) obj).f();
                return;
            case 24:
                new jh8(((c0a) obj).d.L.f, 14, false).show();
                return;
            case 25:
                gl.E3(((o0a) obj).m1);
                return;
            case 26:
                ((g0b) obj).a(null);
                return;
            case 27:
                gl.c3((c2a) obj);
                return;
            case 28:
                z3a z3aVar = (z3a) obj;
                z3aVar.getNotificationCenter().a(z3aVar, 138);
                z3aVar.getNotificationCenter().a(z3aVar, 140);
                z3aVar.getNotificationCenter().a(z3aVar, 139);
                z3aVar.getNotificationCenter().a(z3aVar, 144);
                z3aVar.getNotificationCenter().a(z3aVar, 145);
                z3aVar.getNotificationCenter().a(z3aVar, 146);
                z3aVar.getNotificationCenter().a(z3aVar, 136);
                z3aVar.getNotificationCenter().a(z3aVar, 135);
                z3aVar.getNotificationCenter().a(z3aVar, 142);
                z3aVar.getNotificationCenter().a(z3aVar, 143);
                return;
            default:
                ep epVar = (ep) obj;
                v3a v3aVar = (v3a) epVar.a;
                Location location = (Location) epVar.f;
                if (location != null) {
                    v3aVar.X(location);
                } else {
                    v3aVar.S();
                }
                epVar.c();
                return;
        }
    }
}
