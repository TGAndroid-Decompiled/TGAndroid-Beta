package defpackage;

import android.content.SharedPreferences;
import android.location.Location;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.SessionsActivity;
public final class ux9 implements Runnable {
    public final byte a;
    public final Object b;

    public ux9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        int f;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                wx9 wx9Var = (wx9) obj;
                ArrayList arrayList = wx9Var.f;
                if (!arrayList.isEmpty()) {
                    wx9Var.getMessagesController().X3(arrayList, null, null, false, 0);
                    arrayList.clear();
                    return;
                }
                return;
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) ((wd8) obj).c;
                Runnable runnable = secretMediaViewer.n0;
                if (runnable != null) {
                    runnable.run();
                    secretMediaViewer.n0 = null;
                    return;
                }
                return;
            case 2:
                ky9 ky9Var = (ky9) ((ve9) obj).b;
                ky9Var.R = true;
                ky9Var.O.invalidate();
                return;
            case 3:
                ((ny9) obj).k();
                return;
            case 4:
                wb2 wb2Var = ((xy9) obj).n;
                if (wb2Var != null) {
                    wb2Var.invalidate();
                    return;
                }
                return;
            case 5:
                cz9 cz9Var = (cz9) obj;
                cz9Var.q = false;
                cz9Var.b.run();
                return;
            case 6:
                hl.P3(((e0a) obj).c, true, true);
                return;
            case 7:
                l9c l9cVar = ((b2a) obj).d2;
                if (l9cVar != null) {
                    l9cVar.O(true);
                    return;
                }
                return;
            case 8:
                ((u1a) obj).a();
                return;
            case 9:
                ((v2a) obj).f();
                return;
            case 10:
                new xk8(((v3a) obj).d.L.f, 14, false).show();
                return;
            case 11:
                int i2 = z3a.c0;
                new xk8(((z3a) obj).L.f, 14, false).show();
                return;
            case 12:
                hl.E3(((h4a) obj).m1);
                return;
            case 13:
                hl.c3((q5a) obj);
                return;
            case 14:
                ((e4b) obj).a(null);
                return;
            case 15:
                r7a r7aVar = (r7a) obj;
                r7aVar.getNotificationCenter().a(r7aVar, 139);
                r7aVar.getNotificationCenter().a(r7aVar, 141);
                r7aVar.getNotificationCenter().a(r7aVar, 140);
                r7aVar.getNotificationCenter().a(r7aVar, 145);
                r7aVar.getNotificationCenter().a(r7aVar, 146);
                r7aVar.getNotificationCenter().a(r7aVar, 147);
                r7aVar.getNotificationCenter().a(r7aVar, 137);
                r7aVar.getNotificationCenter().a(r7aVar, 136);
                r7aVar.getNotificationCenter().a(r7aVar, 143);
                r7aVar.getNotificationCenter().a(r7aVar, 144);
                return;
            case 16:
                fp fpVar = (fp) obj;
                n7a n7aVar = (n7a) fpVar.a;
                Location location = (Location) fpVar.f;
                if (location != null) {
                    n7aVar.T(location);
                } else {
                    n7aVar.O();
                }
                fpVar.c();
                return;
            case 17:
                ((SessionsActivity) obj).l0();
                return;
            case 18:
                ((rda) obj).b.X0(1);
                return;
            case 19:
                ((yv3) obj).setVisibility(8);
                return;
            case 20:
                sea seaVar = (sea) obj;
                yv3[] yv3VarArr = seaVar.a;
                if (seaVar.b != 1) {
                    for (yv3 yv3Var : yv3VarArr) {
                        ema emaVar = (ema) yv3Var.e;
                        emaVar.setAlpha(1.0f);
                        emaVar.setScaleX(1.0f);
                        emaVar.setScaleY(1.0f);
                        ((ema) yv3Var.f).setAlpha(0.0f);
                    }
                    seaVar.F = false;
                    hl.d3(seaVar.H, 4000L);
                    return;
                }
                seaVar.F = !seaVar.F;
                int length = yv3VarArr.length;
                while (i < length) {
                    yv3 yv3Var2 = yv3VarArr[i];
                    ema emaVar2 = (ema) yv3Var2.f;
                    ((ema) yv3Var2.e).setPivotX(0.0f);
                    emaVar2.setPivotX(0.0f);
                    boolean z = seaVar.F;
                    ema emaVar3 = (ema) yv3Var2.e;
                    if (z) {
                        emaVar3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        emaVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        emaVar3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        emaVar2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i++;
                }
                hl.d3(seaVar.H, 4000L);
                return;
            case 21:
                eja ejaVar = ((bga) obj).H;
                if (ejaVar.F1) {
                    ejaVar.l1(false);
                    return;
                }
                return;
            case 22:
                ((jha) obj).a.z1(false);
                return;
            case 23:
                e eVar = ((qha) obj).f.y1;
                if (eVar != null) {
                    eVar.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 24:
                ((ux9) obj).run();
                return;
            case 25:
                pia piaVar = (pia) obj;
                ArrayList arrayList2 = piaVar.f;
                if (piaVar.h) {
                    piaVar.h = false;
                    ArrayList arrayList3 = new ArrayList();
                    while (i < arrayList2.size()) {
                        if (((mt9) arrayList2.get(i)).b) {
                            arrayList3.add(Long.valueOf(((mt9) arrayList2.get(i)).a));
                        }
                        i++;
                    }
                    nt9 F1 = piaVar.y.y1.getMessagesController().F1();
                    ArrayList d = nt9.d(F1.j);
                    int i3 = F1.a;
                    if (yac.h(i3).p()) {
                        f = uc7.s1(i3).l4.q2.f();
                    } else {
                        f = uc7.s1(i3).l4.p2.f();
                    }
                    if (arrayList3.size() <= f && !nt9.j(d, arrayList3)) {
                        F1.o(arrayList3);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ((qia) obj).F();
                return;
            case 27:
                ((jja) obj).h();
                return;
            case 28:
                ko9 ko9Var = (ko9) obj;
                synchronized (((ArrayDeque) ko9Var.c)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) ko9Var.b).edit();
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) ko9Var.c).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(",");
                    }
                    edit.putString("topic_operation_queue", sb.toString()).apply();
                }
                return;
            default:
                ((wma) obj).V();
                return;
        }
    }
}
