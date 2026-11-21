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
import org.telegram.ui.Components.uv0;
public final class xr implements Runnable {
    public final int f27982a;
    public final Object f27983b;

    public xr(Object obj, int i7) {
        this.f27982a = i7;
        this.f27983b = obj;
    }

    @Override
    public final void run() {
        FirebaseMessaging firebaseMessaging;
        Task task;
        TLRPC.Message message;
        boolean z10;
        switch (this.f27982a) {
            case 0:
                try {
                    t0.f26941b.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, (Bundle) this.f27983b);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                ks.f(((ys) this.f27983b).f28206a).k(42, new Object[0]);
                return;
            case 2:
                kt ktVar = (kt) this.f27983b;
                ktVar.f25282a = true;
                int i7 = j10.f24798t0;
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    ArrayList arrayList = bz.f23244z1;
                    if (i10 < arrayList.size()) {
                        az azVar = (az) arrayList.get(i10);
                        if (!azVar.f23015c && SystemClock.elapsedRealtime() - azVar.f23016e >= 120000) {
                            azVar.f23015c = true;
                            ConnectionsManager.getInstance(i7).checkProxy(azVar.f23013a, new j1(azVar, 15));
                            z11 = true;
                        }
                        i10++;
                    } else if (!z11) {
                        ktVar.f25282a = false;
                        ktVar.a();
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 3:
                nt ntVar = (nt) this.f27983b;
                try {
                    bz.f23195i = SystemClock.elapsedRealtime();
                    o9.g.f(t0.f26941b);
                    ob.c cVar = FirebaseMessaging.f7585m;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(o9.g.c());
                    }
                    if (firebaseMessaging.d.v()) {
                        task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        firebaseMessaging.f7593g.execute(new a1.e(6, firebaseMessaging, taskCompletionSource));
                        task = taskCompletionSource.getTask();
                    }
                    task.addOnCompleteListener(new ed(ntVar, 13));
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 4:
                ut utVar = (ut) this.f27983b;
                ev evVar = utVar.f27272e;
                if (evVar == null || !evVar.H()) {
                    utVar.f27277w.l0();
                    return;
                }
                return;
            case 5:
                View view = ((bu) this.f27983b).W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
                View view2 = ((cu) this.f27983b).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.m1 m1Var = ((ev) this.f27983b).F;
                if (m1Var != null) {
                    m1Var.m();
                    return;
                }
                return;
            case 8:
                dv dvVar = (dv) this.f27983b;
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
                    ev evVar2 = dvVar.f23604a;
                    org.telegram.ui.Cells.r1 r1Var = evVar2.E;
                    org.telegram.ui.Cells.m1 m1Var2 = evVar2.F;
                    TL_iv.textButton textbutton = cuVar.f23448b;
                    if (r1Var != null && m1Var2 != null) {
                        m1Var2.I1(r1Var, textbutton);
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
                xv xvVar = (xv) this.f27983b;
                ArrayList arrayList2 = xvVar.f28039f;
                if (!arrayList2.isEmpty()) {
                    xvVar.getMessagesController().U3(arrayList2, null, null, false, 0);
                    arrayList2.clear();
                    return;
                }
                return;
            case 10:
                ((uv0) this.f27983b).a(null);
                return;
            case 11:
                g0.g3((ww) this.f27983b);
                return;
            case 12:
                zy zyVar = (zy) this.f27983b;
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
                fj fjVar = (fj) this.f27983b;
                if (fjVar != null && (message = fjVar.f23993k) != null) {
                    message.reqId = 0;
                    return;
                }
                return;
            case 14:
                a8.b8 b8Var = (a8.b8) this.f27983b;
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
                qz qzVar = (qz) this.f27983b;
                android.support.v4.media.session.a0 a0Var = qzVar.f26528b;
                int i11 = j10.f24798t0;
                qzVar.f26529c = i11;
                qzVar.d = g0.b1(mp.u1(i11).f25686g7, "auto_lastSelectedDialog", 0L);
                qzVar.f26530e = false;
                qzVar.f26531f = false;
                qzVar.f26532g.clear();
                qzVar.h.b();
                qzVar.f26533i.b();
                qzVar.f26534j.b();
                qzVar.f26535k.b();
                qzVar.f26536l.b();
                try {
                    a0Var.v(null);
                    ((android.support.v4.media.session.u) a0Var.f1717b).f1747a.setQueueTitle(null);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 16:
                ks.f(((pz) this.f27983b).f26351g.f26529c).k(150, 0);
                return;
            default:
                z00 z00Var = (z00) this.f27983b;
                mp mpVar = z00Var.f28270n;
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
                                    z00Var.f28268e.put(Long.valueOf(parseLong), str2);
                                    if (!z00Var.w(str2)) {
                                        z00Var.f28265a.put(parseLong, Boolean.valueOf(!z10));
                                        z00Var.f28266b.add(Long.valueOf(parseLong));
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
        this.f27982a = 13;
        this.f27983b = fjVar;
    }
}
