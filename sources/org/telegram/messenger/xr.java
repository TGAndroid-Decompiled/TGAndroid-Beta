package org.telegram.messenger;

import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.rv0;
public final class xr implements Runnable {
    public final int f27956a;
    public final Object f27957b;

    public xr(Object obj, int i7) {
        this.f27956a = i7;
        this.f27957b = obj;
    }

    @Override
    public final void run() {
        FirebaseMessaging firebaseMessaging;
        Task task;
        TLRPC.Message message;
        boolean z10;
        switch (this.f27956a) {
            case 0:
                try {
                    t0.f26915b.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, (Bundle) this.f27957b);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                ks.f(((ys) this.f27957b).f28180a).k(42, new Object[0]);
                return;
            case 2:
                kt ktVar = (kt) this.f27957b;
                ktVar.f25256a = true;
                int i7 = j10.f24773t0;
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    ArrayList arrayList = bz.f23219z1;
                    if (i10 < arrayList.size()) {
                        az azVar = (az) arrayList.get(i10);
                        if (!azVar.f22990c && SystemClock.elapsedRealtime() - azVar.f22991e >= 120000) {
                            azVar.f22990c = true;
                            ConnectionsManager.getInstance(i7).checkProxy(azVar.f22988a, new j1(azVar, 15));
                            z11 = true;
                        }
                        i10++;
                    } else if (!z11) {
                        ktVar.f25256a = false;
                        ktVar.a();
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 3:
                nt ntVar = (nt) this.f27957b;
                try {
                    bz.f23170i = SystemClock.elapsedRealtime();
                    o9.g.f(t0.f26915b);
                    ob.c cVar = FirebaseMessaging.f7559m;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(o9.g.c());
                    }
                    if (firebaseMessaging.d.v()) {
                        task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        firebaseMessaging.f7567g.execute(new a1.e(6, firebaseMessaging, taskCompletionSource));
                        task = taskCompletionSource.getTask();
                    }
                    task.addOnCompleteListener(new ed(ntVar, 13));
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 4:
                ut utVar = (ut) this.f27957b;
                ev evVar = utVar.f27246e;
                if (evVar == null || !evVar.H()) {
                    utVar.f27251w.l0();
                    return;
                }
                return;
            case 5:
                View view = ((bu) this.f27957b).W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
                View view2 = ((cu) this.f27957b).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.l1 l1Var = ((ev) this.f27957b).F;
                if (l1Var != null) {
                    l1Var.m();
                    return;
                }
                return;
            case 8:
                dv dvVar = (dv) this.f27957b;
                dvVar.K = null;
                if (dvVar.R != null) {
                    dvVar.L = true;
                    View view3 = dvVar.T;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    cu cuVar = dvVar.R;
                    ev evVar2 = dvVar.f23579a;
                    org.telegram.ui.Cells.q1 q1Var = evVar2.E;
                    org.telegram.ui.Cells.l1 l1Var2 = evVar2.F;
                    TL_iv.textButton textbutton = cuVar.f23423b;
                    if (q1Var != null && l1Var2 != null) {
                        l1Var2.I1(q1Var, textbutton);
                        return;
                    }
                    return;
                } else if (dvVar.N != null) {
                    dvVar.L = true;
                    View view4 = dvVar.T;
                    if (view4 != null) {
                        try {
                            view4.performHapticFeedback(0);
                        } catch (Exception unused2) {
                        }
                    }
                    dvVar.l(dvVar.N, true);
                    n2.o0 o0Var = dvVar.J;
                    if (o0Var != null) {
                        o0Var.f(true);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                xv xvVar = (xv) this.f27957b;
                ArrayList arrayList2 = xvVar.f28013f;
                if (!arrayList2.isEmpty()) {
                    xvVar.getMessagesController().U3(arrayList2, null, null, false, 0);
                    arrayList2.clear();
                    return;
                }
                return;
            case 10:
                ((rv0) this.f27957b).a(null);
                return;
            case 11:
                g0.g3((ww) this.f27957b);
                return;
            case 12:
                zy zyVar = (zy) this.f27957b;
                zyVar.getNotificationCenter().b(zyVar, 138);
                zyVar.getNotificationCenter().b(zyVar, 140);
                zyVar.getNotificationCenter().b(zyVar, 139);
                zyVar.getNotificationCenter().b(zyVar, 144);
                zyVar.getNotificationCenter().b(zyVar, 145);
                zyVar.getNotificationCenter().b(zyVar, 146);
                zyVar.getNotificationCenter().b(zyVar, 136);
                zyVar.getNotificationCenter().b(zyVar, 135);
                zyVar.getNotificationCenter().b(zyVar, 142);
                zyVar.getNotificationCenter().b(zyVar, 143);
                return;
            case 13:
                fj fjVar = (fj) this.f27957b;
                if (fjVar != null && (message = fjVar.f23968k) != null) {
                    message.reqId = 0;
                    return;
                }
                return;
            case 14:
                a8.b8 b8Var = (a8.b8) this.f27957b;
                vy vyVar = (vy) b8Var.f341a;
                Location location = (Location) b8Var.f345f;
                if (location != null) {
                    vyVar.f(location);
                } else {
                    vyVar.b();
                }
                b8Var.d();
                return;
            case 15:
                qz qzVar = (qz) this.f27957b;
                android.support.v4.media.session.a0 a0Var = qzVar.f26502b;
                int i11 = j10.f24773t0;
                qzVar.f26503c = i11;
                qzVar.d = g0.b1(mp.u1(i11).f25660g7, "auto_lastSelectedDialog", 0L);
                qzVar.f26504e = false;
                qzVar.f26505f = false;
                qzVar.f26506g.clear();
                qzVar.h.b();
                qzVar.f26507i.b();
                qzVar.f26508j.b();
                qzVar.f26509k.b();
                qzVar.f26510l.b();
                try {
                    a0Var.v(null);
                    ((android.support.v4.media.session.u) a0Var.f1704b).f1734a.setQueueTitle(null);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 16:
                ks.f(((pz) this.f27957b).f26325g.f26503c).k(150, 0);
                return;
            default:
                z00 z00Var = (z00) this.f27957b;
                mp mpVar = z00Var.f28244n;
                String string = mpVar.h7.getString("translating_dialog_languages2", null);
                if (string != null) {
                    for (String str : string.split(";")) {
                        String[] split = str.split("=");
                        if (split.length >= 2) {
                            long parseLong = Long.parseLong(split[0]);
                            String[] split2 = split[1].split(">");
                            if (split2.length == 2) {
                                String str2 = split2[0];
                                String str3 = split2[1];
                                if (str3.length() > 0 && str3.charAt(str3.length() - 1) == '!') {
                                    str3 = com.google.android.gms.internal.vision.e2.k(str3, 1, 0);
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if ("null".equals(str2)) {
                                    str2 = null;
                                }
                                if ("null".equals(str3)) {
                                    str3 = null;
                                }
                                if (str2 != null) {
                                    z00Var.f28242e.put(Long.valueOf(parseLong), str2);
                                    if (!z00Var.w(str2)) {
                                        z00Var.f28239a.put(parseLong, Boolean.valueOf(!z10));
                                        z00Var.f28240b.add(Long.valueOf(parseLong));
                                    }
                                    if (str3 != null) {
                                        z00Var.d.put(Long.valueOf(parseLong), str3);
                                    }
                                }
                            }
                        }
                    }
                    Set<String> stringSet = mpVar.h7.getStringSet("hidden_translation_at", null);
                    if (stringSet != null) {
                        for (String str4 : stringSet) {
                            try {
                                z00Var.h.add(Long.valueOf(Long.parseLong(str4)));
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public xr(zy zyVar, fj fjVar) {
        this.f27956a = 13;
        this.f27957b = fjVar;
    }
}
