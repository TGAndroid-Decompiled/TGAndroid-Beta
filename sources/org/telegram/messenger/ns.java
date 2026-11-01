package org.telegram.messenger;

import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.mw0;
public final class ns implements Runnable {
    public final int f17338a;
    public final Object f17339b;

    public ns(Object obj, int i10) {
        this.f17338a = i10;
        this.f17339b = obj;
    }

    @Override
    public final void run() {
        FirebaseMessaging firebaseMessaging;
        TLRPC.Message message;
        boolean z10;
        switch (this.f17338a) {
            case 0:
                try {
                    w0.f18945b.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, (Bundle) this.f17339b);
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                at.f(((qt) this.f17339b).f17814a).k(42, new Object[0]);
                return;
            case 2:
                ((CancellationSignal) this.f17339b).cancel();
                return;
            case 3:
                cu cuVar = (cu) this.f17339b;
                cuVar.f15210a = true;
                int i10 = e20.f15506s0;
                int i11 = 0;
                boolean z11 = false;
                while (true) {
                    ArrayList arrayList = uz.f18571z1;
                    if (i11 < arrayList.size()) {
                        tz tzVar = (tz) arrayList.get(i11);
                        if (!tzVar.f18327c && SystemClock.elapsedRealtime() - tzVar.e >= 120000) {
                            tzVar.f18327c = true;
                            ConnectionsManager.getInstance(i10).checkProxy(tzVar.f18325a, new s1(tzVar, 13));
                            z11 = true;
                        }
                        i11++;
                    } else if (!z11) {
                        cuVar.f15210a = false;
                        cuVar.a();
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 4:
                fu fuVar = (fu) this.f17339b;
                try {
                    uz.f18521i = SystemClock.elapsedRealtime();
                    l9.h.f(w0.f18945b);
                    vh.w3 w3Var = FirebaseMessaging.f5587l;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(l9.h.c());
                    }
                    firebaseMessaging.getClass();
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    firebaseMessaging.f5593f.execute(new vh.r0(21, firebaseMessaging, taskCompletionSource));
                    taskCompletionSource.getTask().addOnCompleteListener(new e9(fuVar));
                    return;
                } catch (Throwable th2) {
                    f8.g(th2, true);
                    return;
                }
            case 5:
                mu muVar = (mu) this.f17339b;
                wv wvVar = muVar.e;
                if (wvVar == null || !wvVar.H()) {
                    muVar.f17195w.l0();
                    return;
                }
                return;
            case 6:
                View view = ((tu) this.f17339b).V;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                View view2 = ((uu) this.f17339b).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Cells.l1 l1Var = ((wv) this.f17339b).F;
                if (l1Var != null) {
                    l1Var.j();
                    return;
                }
                return;
            case 9:
                vv vvVar = (vv) this.f17339b;
                vvVar.J = null;
                if (vvVar.Q != null) {
                    vvVar.K = true;
                    View view3 = vvVar.S;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    uu uuVar = vvVar.Q;
                    wv wvVar2 = vvVar.f18903a;
                    org.telegram.ui.Cells.q1 q1Var = wvVar2.E;
                    org.telegram.ui.Cells.l1 l1Var2 = wvVar2.F;
                    TL_iv.textButton textbutton = uuVar.f18477b;
                    if (q1Var != null && l1Var2 != null) {
                        l1Var2.q1(q1Var, textbutton);
                        return;
                    }
                    return;
                } else if (vvVar.M != null) {
                    vvVar.K = true;
                    View view4 = vvVar.S;
                    if (view4 != null) {
                        try {
                            view4.performHapticFeedback(0);
                        } catch (Exception unused2) {
                        }
                    }
                    vvVar.l(vvVar.M, true);
                    ji.a aVar = vvVar.I;
                    if (aVar != null) {
                        aVar.f(true);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 10:
                pw pwVar = (pw) this.f17339b;
                ArrayList arrayList2 = pwVar.f17683f;
                if (!arrayList2.isEmpty()) {
                    pwVar.getMessagesController().K3(arrayList2, null, null, false, 0);
                    arrayList2.clear();
                    return;
                }
                return;
            case 11:
                ((mw0) this.f17339b).a(null);
                return;
            case 12:
                i0.g3((qx) this.f17339b);
                return;
            case 13:
                rz rzVar = (rz) this.f17339b;
                rzVar.getNotificationCenter().b(rzVar, 138);
                rzVar.getNotificationCenter().b(rzVar, 140);
                rzVar.getNotificationCenter().b(rzVar, 139);
                rzVar.getNotificationCenter().b(rzVar, 144);
                rzVar.getNotificationCenter().b(rzVar, 145);
                rzVar.getNotificationCenter().b(rzVar, 146);
                rzVar.getNotificationCenter().b(rzVar, 136);
                rzVar.getNotificationCenter().b(rzVar, 135);
                rzVar.getNotificationCenter().b(rzVar, 142);
                rzVar.getNotificationCenter().b(rzVar, 143);
                return;
            case 14:
                kj kjVar = (kj) this.f17339b;
                if (kjVar != null && (message = kjVar.f16690k) != null) {
                    message.reqId = 0;
                    return;
                }
                return;
            case 15:
                j2.f fVar = (j2.f) this.f17339b;
                nz nzVar = (nz) fVar.f9348a;
                Location location = (Location) fVar.f9351f;
                if (location != null) {
                    nzVar.F(location);
                } else {
                    nzVar.E();
                }
                fVar.j();
                return;
            case 16:
                i00 i00Var = (i00) this.f17339b;
                android.support.v4.media.session.a0 a0Var = i00Var.f16183b;
                int i12 = e20.f15506s0;
                i00Var.f16184c = i12;
                i00Var.d = i0.b1(wp.r1(i12).e7, "auto_lastSelectedDialog", 0L);
                i00Var.e = false;
                i00Var.f16185f = false;
                i00Var.f16186g.clear();
                i00Var.h.b();
                i00Var.f16187i.b();
                i00Var.f16188j.b();
                i00Var.f16189k.b();
                i00Var.f16190l.b();
                try {
                    a0Var.D(null);
                    ((android.support.v4.media.session.u) a0Var.f875b).f902a.setQueueTitle(null);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 17:
                at.f(((h00) this.f17339b).f15994g.f16184c).k(150, 0);
                return;
            default:
                u10 u10Var = (u10) this.f17339b;
                wp wpVar = u10Var.f18353n;
                String string = wpVar.f7.getString("translating_dialog_languages2", null);
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
                                    str3 = c3.i0.m(1, 0, str3);
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
                                    u10Var.e.put(Long.valueOf(parseLong), str2);
                                    if (!u10Var.w(str2)) {
                                        u10Var.f18349a.put(parseLong, Boolean.valueOf(!z10));
                                        u10Var.f18350b.add(Long.valueOf(parseLong));
                                    }
                                    if (str3 != null) {
                                        u10Var.d.put(Long.valueOf(parseLong), str3);
                                    }
                                }
                            }
                        }
                    }
                    Set<String> stringSet = wpVar.f7.getStringSet("hidden_translation_at", null);
                    if (stringSet != null) {
                        for (String str4 : stringSet) {
                            try {
                                u10Var.h.add(Long.valueOf(Long.parseLong(str4)));
                            } catch (Exception e7) {
                                f8.g(e7, true);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ns(rz rzVar, kj kjVar) {
        this.f17338a = 14;
        this.f17339b = kjVar;
    }
}
