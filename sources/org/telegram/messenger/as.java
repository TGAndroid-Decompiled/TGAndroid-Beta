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
public final class as implements Runnable {
    public final int f22555a;
    public final Object f22556b;

    public as(Object obj, int i7) {
        this.f22555a = i7;
        this.f22556b = obj;
    }

    @Override
    public final void run() {
        FirebaseMessaging firebaseMessaging;
        Task task;
        TLRPC.Message message;
        boolean z10;
        switch (this.f22555a) {
            case 0:
                try {
                    t0.f26609b.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, (Bundle) this.f22556b);
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 1:
                ns.f(((bt) this.f22556b).f22753a).k(42, new Object[0]);
                return;
            case 2:
                nt ntVar = (nt) this.f22556b;
                ntVar.f25637a = true;
                int i7 = m10.f24940t0;
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    ArrayList arrayList = gz.f24003z1;
                    if (i10 < arrayList.size()) {
                        fz fzVar = (fz) arrayList.get(i10);
                        if (!fzVar.f23579c && SystemClock.elapsedRealtime() - fzVar.f23580e >= 120000) {
                            fzVar.f23579c = true;
                            ConnectionsManager.getInstance(i7).checkProxy(fzVar.f23577a, new j1(fzVar, 14));
                            z11 = true;
                        }
                        i10++;
                    } else if (!z11) {
                        ntVar.f25637a = false;
                        ntVar.a();
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 3:
                qt qtVar = (qt) this.f22556b;
                try {
                    gz.f23954i = SystemClock.elapsedRealtime();
                    o9.g.f(t0.f26609b);
                    ob.c cVar = FirebaseMessaging.f7276m;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(o9.g.c());
                    }
                    if (firebaseMessaging.d.t()) {
                        task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        firebaseMessaging.f7284g.execute(new a1.e(6, firebaseMessaging, taskCompletionSource));
                        task = taskCompletionSource.getTask();
                    }
                    task.addOnCompleteListener(new fd(qtVar, 12));
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 4:
                xt xtVar = (xt) this.f22556b;
                iv ivVar = xtVar.f27597e;
                if (ivVar == null || !ivVar.H()) {
                    xtVar.f27602w.l0();
                    return;
                }
                return;
            case 5:
                View view = ((eu) this.f22556b).W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
                View view2 = ((fu) this.f22556b).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.l1 l1Var = ((iv) this.f22556b).F;
                if (l1Var != null) {
                    l1Var.k();
                    return;
                }
                return;
            case 8:
                hv hvVar = (hv) this.f22556b;
                hvVar.K = null;
                if (hvVar.R != null) {
                    hvVar.L = true;
                    View view3 = hvVar.T;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    fu fuVar = hvVar.R;
                    iv ivVar2 = hvVar.f24221a;
                    org.telegram.ui.Cells.q1 q1Var = ivVar2.E;
                    org.telegram.ui.Cells.l1 l1Var2 = ivVar2.F;
                    TL_iv.textButton textbutton = fuVar.f23551b;
                    if (q1Var != null && l1Var2 != null) {
                        l1Var2.I1(q1Var, textbutton);
                        return;
                    }
                    return;
                } else if (hvVar.N != null) {
                    hvVar.L = true;
                    View view4 = hvVar.T;
                    if (view4 != null) {
                        try {
                            view4.performHapticFeedback(0);
                        } catch (Exception unused2) {
                        }
                    }
                    hvVar.l(hvVar.N, true);
                    n2.o0 o0Var = hvVar.J;
                    if (o0Var != null) {
                        o0Var.f(true);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                bw bwVar = (bw) this.f22556b;
                ArrayList arrayList2 = bwVar.f22765f;
                if (!arrayList2.isEmpty()) {
                    bwVar.getMessagesController().N3(arrayList2, null, null, false, 0);
                    arrayList2.clear();
                    return;
                }
                return;
            case 10:
                ((jv0) this.f22556b).a(null);
                return;
            case 11:
                g0.h3((bx) this.f22556b);
                return;
            case 12:
                ez ezVar = (ez) this.f22556b;
                ezVar.getNotificationCenter().b(ezVar, 138);
                ezVar.getNotificationCenter().b(ezVar, 140);
                ezVar.getNotificationCenter().b(ezVar, 139);
                ezVar.getNotificationCenter().b(ezVar, 144);
                ezVar.getNotificationCenter().b(ezVar, 145);
                ezVar.getNotificationCenter().b(ezVar, 146);
                ezVar.getNotificationCenter().b(ezVar, 136);
                ezVar.getNotificationCenter().b(ezVar, 135);
                ezVar.getNotificationCenter().b(ezVar, 142);
                ezVar.getNotificationCenter().b(ezVar, 143);
                return;
            case 13:
                gj gjVar = (gj) this.f22556b;
                if (gjVar != null && (message = gjVar.f23819k) != null) {
                    message.reqId = 0;
                    return;
                }
                return;
            case 14:
                a8.b8 b8Var = (a8.b8) this.f22556b;
                az azVar = (az) b8Var.f341a;
                Location location = (Location) b8Var.f345f;
                if (location != null) {
                    azVar.f(location);
                } else {
                    azVar.c();
                }
                b8Var.d();
                return;
            case 15:
                uz uzVar = (uz) this.f22556b;
                android.support.v4.media.session.a0 a0Var = uzVar.f26902b;
                int i11 = m10.f24940t0;
                uzVar.f26903c = i11;
                uzVar.d = g0.b1(np.s1(i11).f25273e7, "auto_lastSelectedDialog", 0L);
                uzVar.f26904e = false;
                uzVar.f26905f = false;
                uzVar.f26906g.clear();
                uzVar.h.b();
                uzVar.f26907i.b();
                uzVar.f26908j.b();
                uzVar.f26909k.b();
                uzVar.f26910l.b();
                try {
                    a0Var.u(null);
                    ((android.support.v4.media.session.u) a0Var.f1713b).f1743a.setQueueTitle(null);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 16:
                ns.f(((tz) this.f22556b).f26762g.f26903c).k(150, 0);
                return;
            default:
                c10 c10Var = (c10) this.f22556b;
                np npVar = c10Var.f22791n;
                String string = npVar.f25283f7.getString("translating_dialog_languages2", null);
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
                                    c10Var.f22789e.put(Long.valueOf(parseLong), str2);
                                    if (!c10Var.w(str2)) {
                                        c10Var.f22786a.put(parseLong, Boolean.valueOf(!z10));
                                        c10Var.f22787b.add(Long.valueOf(parseLong));
                                    }
                                    if (str3 != null) {
                                        c10Var.d.put(Long.valueOf(parseLong), str3);
                                    }
                                }
                            }
                        }
                    }
                    Set<String> stringSet = npVar.f25283f7.getStringSet("hidden_translation_at", null);
                    if (stringSet != null) {
                        for (String str4 : stringSet) {
                            try {
                                c10Var.h.add(Long.valueOf(Long.parseLong(str4)));
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

    public as(ez ezVar, gj gjVar) {
        this.f22555a = 13;
        this.f22556b = gjVar;
    }
}
