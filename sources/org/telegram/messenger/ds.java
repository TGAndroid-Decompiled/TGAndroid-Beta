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
import org.telegram.ui.Components.jv0;
public final class ds implements Runnable {
    public final int f22073a;
    public final Object f22074b;

    public ds(Object obj, int i7) {
        this.f22073a = i7;
        this.f22074b = obj;
    }

    @Override
    public final void run() {
        FirebaseMessaging firebaseMessaging;
        Task task;
        TLRPC.Message message;
        boolean z9;
        switch (this.f22073a) {
            case 0:
                try {
                    t0.f25566b.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, (Bundle) this.f22074b);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                qs.f(((et) this.f22074b).f22275a).k(42, new Object[0]);
                return;
            case 2:
                qt qtVar = (qt) this.f22074b;
                qtVar.f25140a = true;
                int i7 = p10.f24470s0;
                int i10 = 0;
                boolean z10 = false;
                while (true) {
                    ArrayList arrayList = iz.f23456z1;
                    if (i10 < arrayList.size()) {
                        hz hzVar = (hz) arrayList.get(i10);
                        if (!hzVar.f22996c && SystemClock.elapsedRealtime() - hzVar.f22997e >= 120000) {
                            hzVar.f22996c = true;
                            ConnectionsManager.getInstance(i7).checkProxy(hzVar.f22994a, new j1(hzVar, 14));
                            z10 = true;
                        }
                        i10++;
                    } else if (!z10) {
                        qtVar.f25140a = false;
                        qtVar.a();
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 3:
                tt ttVar = (tt) this.f22074b;
                try {
                    iz.f23407i = SystemClock.elapsedRealtime();
                    o9.g.f(t0.f25566b);
                    ab.d0 d0Var = FirebaseMessaging.f7884m;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(o9.g.c());
                    }
                    if (firebaseMessaging.d.r()) {
                        task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        firebaseMessaging.f7892g.execute(new a1.e(6, firebaseMessaging, taskCompletionSource));
                        task = taskCompletionSource.getTask();
                    }
                    task.addOnCompleteListener(new ch(ttVar, 8));
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 4:
                au auVar = (au) this.f22074b;
                kv kvVar = auVar.f21535e;
                if (kvVar == null || !kvVar.H()) {
                    auVar.f21540w.l0();
                    return;
                }
                return;
            case 5:
                View view = ((hu) this.f22074b).V;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
                View view2 = ((iu) this.f22074b).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.l1 l1Var = ((kv) this.f22074b).F;
                if (l1Var != null) {
                    l1Var.k();
                    return;
                }
                return;
            case 8:
                jv jvVar = (jv) this.f22074b;
                jvVar.J = null;
                if (jvVar.Q != null) {
                    jvVar.K = true;
                    View view3 = jvVar.S;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    iu iuVar = jvVar.Q;
                    kv kvVar2 = jvVar.f23604a;
                    org.telegram.ui.Cells.q1 q1Var = kvVar2.E;
                    org.telegram.ui.Cells.l1 l1Var2 = kvVar2.F;
                    TL_iv.textButton textbutton = iuVar.f23366b;
                    if (q1Var != null && l1Var2 != null) {
                        l1Var2.v1(q1Var, textbutton);
                        return;
                    }
                    return;
                } else if (jvVar.M != null) {
                    jvVar.K = true;
                    View view4 = jvVar.S;
                    if (view4 != null) {
                        try {
                            view4.performHapticFeedback(0);
                        } catch (Exception unused2) {
                        }
                    }
                    jvVar.l(jvVar.M, true);
                    n2.n0 n0Var = jvVar.I;
                    if (n0Var != null) {
                        n0Var.f(true);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                dw dwVar = (dw) this.f22074b;
                ArrayList arrayList2 = dwVar.f22127f;
                if (!arrayList2.isEmpty()) {
                    dwVar.getMessagesController().N3(arrayList2, null, null, false, 0);
                    arrayList2.clear();
                    return;
                }
                return;
            case 10:
                ((jv0) this.f22074b).a(null);
                return;
            case 11:
                g0.h3((dx) this.f22074b);
                return;
            case 12:
                gz gzVar = (gz) this.f22074b;
                gzVar.getNotificationCenter().b(gzVar, 138);
                gzVar.getNotificationCenter().b(gzVar, 140);
                gzVar.getNotificationCenter().b(gzVar, 139);
                gzVar.getNotificationCenter().b(gzVar, 144);
                gzVar.getNotificationCenter().b(gzVar, 145);
                gzVar.getNotificationCenter().b(gzVar, 146);
                gzVar.getNotificationCenter().b(gzVar, 136);
                gzVar.getNotificationCenter().b(gzVar, 135);
                gzVar.getNotificationCenter().b(gzVar, 142);
                gzVar.getNotificationCenter().b(gzVar, 143);
                return;
            case 13:
                ij ijVar = (ij) this.f22074b;
                if (ijVar != null && (message = ijVar.f23262k) != null) {
                    message.reqId = 0;
                    return;
                }
                return;
            case 14:
                a8.b8 b8Var = (a8.b8) this.f22074b;
                cz czVar = (cz) b8Var.f335a;
                Location location = (Location) b8Var.f339f;
                if (location != null) {
                    czVar.K(location);
                } else {
                    czVar.C();
                }
                b8Var.d();
                return;
            case 15:
                wz wzVar = (wz) this.f22074b;
                android.support.v4.media.session.a0 a0Var = wzVar.f26410b;
                int i11 = p10.f24470s0;
                wzVar.f26411c = i11;
                wzVar.d = g0.b1(qp.s1(i11).f24764d7, "auto_lastSelectedDialog", 0L);
                wzVar.f26412e = false;
                wzVar.f26413f = false;
                wzVar.f26414g.clear();
                wzVar.h.b();
                wzVar.f26415i.b();
                wzVar.f26416j.b();
                wzVar.f26417k.b();
                wzVar.f26418l.b();
                try {
                    a0Var.v(null);
                    ((android.support.v4.media.session.u) a0Var.f1763b).f1793a.setQueueTitle(null);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 16:
                qs.f(((vz) this.f22074b).f26238g.f26411c).k(150, 0);
                return;
            default:
                f10 f10Var = (f10) this.f22074b;
                qp qpVar = f10Var.f22347n;
                String string = qpVar.f24774e7.getString("translating_dialog_languages2", null);
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
                                    str3 = com.google.android.recaptcha.internal.a.k(str3, 1, 0);
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if ("null".equals(str2)) {
                                    str2 = null;
                                }
                                if ("null".equals(str3)) {
                                    str3 = null;
                                }
                                if (str2 != null) {
                                    f10Var.f22345e.put(Long.valueOf(parseLong), str2);
                                    if (!f10Var.w(str2)) {
                                        f10Var.f22342a.put(parseLong, Boolean.valueOf(!z9));
                                        f10Var.f22343b.add(Long.valueOf(parseLong));
                                    }
                                    if (str3 != null) {
                                        f10Var.d.put(Long.valueOf(parseLong), str3);
                                    }
                                }
                            }
                        }
                    }
                    Set<String> stringSet = qpVar.f24774e7.getStringSet("hidden_translation_at", null);
                    if (stringSet != null) {
                        for (String str4 : stringSet) {
                            try {
                                f10Var.h.add(Long.valueOf(Long.parseLong(str4)));
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

    public ds(gz gzVar, ij ijVar) {
        this.f22073a = 13;
        this.f22074b = ijVar;
    }
}
