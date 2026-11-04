package org.telegram.messenger;

import android.location.Location;
import android.os.CancellationSignal;
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
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.he0;
public final class vs implements Runnable {
    public final int f26089a;
    public final Object f26090b;

    public vs(Object obj, int i3) {
        this.f26089a = i3;
        this.f26090b = obj;
    }

    @Override
    public final void run() {
        FirebaseMessaging firebaseMessaging;
        Task task;
        TLRPC.Message message;
        boolean z10;
        switch (this.f26089a) {
            case 0:
                hs.f(((ws) this.f26090b).f26253a).k(42, new Object[0]);
                return;
            case 1:
                ((CancellationSignal) this.f26090b).cancel();
                return;
            case 2:
                ht htVar = (ht) this.f26090b;
                htVar.f23369a = true;
                int i3 = h10.f22829t0;
                int i10 = 0;
                boolean z11 = false;
                while (true) {
                    ArrayList arrayList = az.f21683z1;
                    if (i10 < arrayList.size()) {
                        zy zyVar = (zy) arrayList.get(i10);
                        if (!zyVar.f26995c && SystemClock.elapsedRealtime() - zyVar.f26996e >= 120000) {
                            zyVar.f26995c = true;
                            ConnectionsManager.getInstance(i3).checkProxy(zyVar.f26993a, new p1(zyVar, 13));
                            z11 = true;
                        }
                        i10++;
                    } else if (!z11) {
                        htVar.f23369a = false;
                        htVar.a();
                        return;
                    } else {
                        return;
                    }
                }
                break;
            case 3:
                lt ltVar = (lt) this.f26090b;
                try {
                    az.f21634i = SystemClock.elapsedRealtime();
                    n9.h.f(t0.f25457b);
                    he0 he0Var = FirebaseMessaging.f7941m;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(n9.h.c());
                    }
                    if (firebaseMessaging.d.s()) {
                        task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        firebaseMessaging.f7949g.execute(new xh.i(5, firebaseMessaging, taskCompletionSource));
                        task = taskCompletionSource.getTask();
                    }
                    task.addOnCompleteListener(new go(ltVar, 5));
                    return;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 4:
                st stVar = (st) this.f26090b;
                cv cvVar = stVar.f25417e;
                if (cvVar == null || !cvVar.H()) {
                    stVar.f25422w.l0();
                    return;
                }
                return;
            case 5:
                View view = ((zt) this.f26090b).W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 6:
                View view2 = ((au) this.f26090b).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Cells.l1 l1Var = ((cv) this.f26090b).F;
                if (l1Var != null) {
                    l1Var.j();
                    return;
                }
                return;
            case 8:
                bv bvVar = (bv) this.f26090b;
                bvVar.K = null;
                if (bvVar.R != null) {
                    bvVar.L = true;
                    View view3 = bvVar.T;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    au auVar = bvVar.R;
                    cv cvVar2 = bvVar.f21887a;
                    org.telegram.ui.Cells.q1 q1Var = cvVar2.E;
                    org.telegram.ui.Cells.l1 l1Var2 = cvVar2.F;
                    TL_iv.textButton textbutton = auVar.f21586b;
                    if (q1Var != null && l1Var2 != null) {
                        l1Var2.x1(q1Var, textbutton);
                        return;
                    }
                    return;
                } else if (bvVar.N != null) {
                    bvVar.L = true;
                    View view4 = bvVar.T;
                    if (view4 != null) {
                        try {
                            view4.performHapticFeedback(0);
                        } catch (Exception unused2) {
                        }
                    }
                    bvVar.l(bvVar.N, true);
                    m2.p0 p0Var = bvVar.J;
                    if (p0Var != null) {
                        p0Var.f(true);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 9:
                vv vvVar = (vv) this.f26090b;
                ArrayList arrayList2 = vvVar.f26117f;
                if (!arrayList2.isEmpty()) {
                    vvVar.getMessagesController().N3(arrayList2, null, null, false, 0);
                    arrayList2.clear();
                    return;
                }
                return;
            case 10:
                ((gv0) this.f26090b).a(null);
                return;
            case 11:
                g0.h3((ww) this.f26090b);
                return;
            case 12:
                yy yyVar = (yy) this.f26090b;
                yyVar.getNotificationCenter().b(yyVar, 138);
                yyVar.getNotificationCenter().b(yyVar, 140);
                yyVar.getNotificationCenter().b(yyVar, 139);
                yyVar.getNotificationCenter().b(yyVar, 144);
                yyVar.getNotificationCenter().b(yyVar, 145);
                yyVar.getNotificationCenter().b(yyVar, 146);
                yyVar.getNotificationCenter().b(yyVar, 136);
                yyVar.getNotificationCenter().b(yyVar, 135);
                yyVar.getNotificationCenter().b(yyVar, 142);
                yyVar.getNotificationCenter().b(yyVar, 143);
                return;
            case 13:
                zi ziVar = (zi) this.f26090b;
                if (ziVar != null && (message = ziVar.f26868k) != null) {
                    message.reqId = 0;
                    return;
                }
                return;
            case 14:
                l2.e eVar = (l2.e) this.f26090b;
                uy uyVar = (uy) eVar.f17689a;
                Location location = (Location) eVar.f17693f;
                if (location != null) {
                    uyVar.B(location);
                } else {
                    uyVar.y();
                }
                eVar.d();
                return;
            case 15:
                oz ozVar = (oz) this.f26090b;
                android.support.v4.media.session.a0 a0Var = ozVar.f24631b;
                int i11 = h10.f22829t0;
                ozVar.f24632c = i11;
                ozVar.d = g0.b1(hp.s1(i11).f22989d7, "auto_lastSelectedDialog", 0L);
                ozVar.f24633e = false;
                ozVar.f24634f = false;
                ozVar.f24635g.clear();
                ozVar.h.b();
                ozVar.f24636i.b();
                ozVar.f24637j.b();
                ozVar.f24638k.b();
                ozVar.f24639l.b();
                try {
                    a0Var.u(null);
                    ((android.support.v4.media.session.u) a0Var.f1186b).f1216a.setQueueTitle(null);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 16:
                hs.f(((nz) this.f26090b).f24464g.f24632c).k(150, 0);
                return;
            default:
                x00 x00Var = (x00) this.f26090b;
                hp hpVar = x00Var.f26327n;
                String string = hpVar.f22999e7.getString("translating_dialog_languages2", null);
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
                                    str3 = com.google.android.recaptcha.internal.a.j(str3, 1, 0);
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
                                    x00Var.f26325e.put(Long.valueOf(parseLong), str2);
                                    if (!x00Var.w(str2)) {
                                        x00Var.f26322a.put(parseLong, Boolean.valueOf(!z10));
                                        x00Var.f26323b.add(Long.valueOf(parseLong));
                                    }
                                    if (str3 != null) {
                                        x00Var.d.put(Long.valueOf(parseLong), str3);
                                    }
                                }
                            }
                        }
                    }
                    Set<String> stringSet = hpVar.f22999e7.getStringSet("hidden_translation_at", null);
                    if (stringSet != null) {
                        for (String str4 : stringSet) {
                            try {
                                x00Var.h.add(Long.valueOf(Long.parseLong(str4)));
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public vs(yy yyVar, zi ziVar) {
        this.f26089a = 13;
        this.f26090b = ziVar;
    }
}
