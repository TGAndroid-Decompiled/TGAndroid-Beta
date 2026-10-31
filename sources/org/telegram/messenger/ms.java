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
import org.telegram.ui.Components.lw0;
public final class ms implements Runnable {
    public final int f16996a;
    public final Object f16997b;

    public ms(Object obj, int i10) {
        this.f16996a = i10;
        this.f16997b = obj;
    }

    @Override
    public final void run() {
        FirebaseMessaging firebaseMessaging;
        TLRPC.Message message;
        boolean z10;
        switch (this.f16996a) {
            case 0:
                try {
                    w0.f19025b.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, (Bundle) this.f16997b);
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 1:
                zs.f(((pt) this.f16997b).f17479a).k(42, new Object[0]);
                return;
            case 2:
                ((CancellationSignal) this.f16997b).cancel();
                return;
            case 3:
                bu buVar = (bu) this.f16997b;
                buVar.f14827a = true;
                int i10 = d20.f15147s0;
                int i11 = 0;
                boolean z11 = false;
                while (true) {
                    ArrayList arrayList = tz.f18202z1;
                    if (i11 < arrayList.size()) {
                        sz szVar = (sz) arrayList.get(i11);
                        if (!szVar.f17976c && SystemClock.elapsedRealtime() - szVar.e >= 120000) {
                            szVar.f17976c = true;
                            ConnectionsManager.getInstance(i10).checkProxy(szVar.f17974a, new s1(szVar, 13));
                            z11 = true;
                        }
                        i11++;
                    } else if (!z11) {
                        buVar.f14827a = false;
                        buVar.a();
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 4:
                eu euVar = (eu) this.f16997b;
                try {
                    tz.f18152i = SystemClock.elapsedRealtime();
                    l9.h.f(w0.f19025b);
                    vh.w3 w3Var = FirebaseMessaging.f5587l;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(l9.h.c());
                    }
                    firebaseMessaging.getClass();
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    firebaseMessaging.f5593f.execute(new vh.d1(20, firebaseMessaging, taskCompletionSource));
                    taskCompletionSource.getTask().addOnCompleteListener(new e9(euVar));
                    return;
                } catch (Throwable th2) {
                    f8.g(th2, true);
                    return;
                }
            case 5:
                lu luVar = (lu) this.f16997b;
                vv vvVar = luVar.e;
                if (vvVar == null || !vvVar.H()) {
                    luVar.f16811w.l0();
                    return;
                }
                return;
            case 6:
                View view = ((su) this.f16997b).V;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                View view2 = ((tu) this.f16997b).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Cells.l1 l1Var = ((vv) this.f16997b).F;
                if (l1Var != null) {
                    l1Var.j();
                    return;
                }
                return;
            case 9:
                uv uvVar = (uv) this.f16997b;
                uvVar.J = null;
                if (uvVar.Q != null) {
                    uvVar.K = true;
                    View view3 = uvVar.S;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    tu tuVar = uvVar.Q;
                    vv vvVar2 = uvVar.f18395a;
                    org.telegram.ui.Cells.q1 q1Var = vvVar2.E;
                    org.telegram.ui.Cells.l1 l1Var2 = vvVar2.F;
                    TL_iv.textButton textbutton = tuVar.f18108b;
                    if (q1Var != null && l1Var2 != null) {
                        l1Var2.q1(q1Var, textbutton);
                        return;
                    }
                    return;
                } else if (uvVar.M != null) {
                    uvVar.K = true;
                    View view4 = uvVar.S;
                    if (view4 != null) {
                        try {
                            view4.performHapticFeedback(0);
                        } catch (Exception unused2) {
                        }
                    }
                    uvVar.l(uvVar.M, true);
                    ji.a aVar = uvVar.I;
                    if (aVar != null) {
                        aVar.f(true);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 10:
                ow owVar = (ow) this.f16997b;
                ArrayList arrayList2 = owVar.f17350f;
                if (!arrayList2.isEmpty()) {
                    owVar.getMessagesController().K3(arrayList2, null, null, false, 0);
                    arrayList2.clear();
                    return;
                }
                return;
            case 11:
                ((lw0) this.f16997b).a(null);
                return;
            case 12:
                i0.g3((px) this.f16997b);
                return;
            case 13:
                qz qzVar = (qz) this.f16997b;
                qzVar.getNotificationCenter().b(qzVar, 138);
                qzVar.getNotificationCenter().b(qzVar, 140);
                qzVar.getNotificationCenter().b(qzVar, 139);
                qzVar.getNotificationCenter().b(qzVar, 144);
                qzVar.getNotificationCenter().b(qzVar, 145);
                qzVar.getNotificationCenter().b(qzVar, 146);
                qzVar.getNotificationCenter().b(qzVar, 136);
                qzVar.getNotificationCenter().b(qzVar, 135);
                qzVar.getNotificationCenter().b(qzVar, 142);
                qzVar.getNotificationCenter().b(qzVar, 143);
                return;
            case 14:
                jj jjVar = (jj) this.f16997b;
                if (jjVar != null && (message = jjVar.f16337k) != null) {
                    message.reqId = 0;
                    return;
                }
                return;
            case 15:
                j2.f fVar = (j2.f) this.f16997b;
                mz mzVar = (mz) fVar.f9347a;
                Location location = (Location) fVar.f9350f;
                if (location != null) {
                    mzVar.F(location);
                } else {
                    mzVar.E();
                }
                fVar.j();
                return;
            case 16:
                h00 h00Var = (h00) this.f16997b;
                android.support.v4.media.session.a0 a0Var = h00Var.f15801b;
                int i12 = d20.f15147s0;
                h00Var.f15802c = i12;
                h00Var.d = i0.b1(vp.r1(i12).e7, "auto_lastSelectedDialog", 0L);
                h00Var.e = false;
                h00Var.f15803f = false;
                h00Var.f15804g.clear();
                h00Var.h.b();
                h00Var.f15805i.b();
                h00Var.f15806j.b();
                h00Var.f15807k.b();
                h00Var.f15808l.b();
                try {
                    a0Var.D(null);
                    ((android.support.v4.media.session.u) a0Var.f875b).f902a.setQueueTitle(null);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 17:
                zs.f(((g00) this.f16997b).f15652g.f15802c).k(150, 0);
                return;
            default:
                t10 t10Var = (t10) this.f16997b;
                vp vpVar = t10Var.f17987n;
                String string = vpVar.f7.getString("translating_dialog_languages2", null);
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
                                    t10Var.e.put(Long.valueOf(parseLong), str2);
                                    if (!t10Var.w(str2)) {
                                        t10Var.f17983a.put(parseLong, Boolean.valueOf(!z10));
                                        t10Var.f17984b.add(Long.valueOf(parseLong));
                                    }
                                    if (str3 != null) {
                                        t10Var.d.put(Long.valueOf(parseLong), str3);
                                    }
                                }
                            }
                        }
                    }
                    Set<String> stringSet = vpVar.f7.getStringSet("hidden_translation_at", null);
                    if (stringSet != null) {
                        for (String str4 : stringSet) {
                            try {
                                t10Var.h.add(Long.valueOf(Long.parseLong(str4)));
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

    public ms(qz qzVar, jj jjVar) {
        this.f16996a = 14;
        this.f16997b = jjVar;
    }
}
