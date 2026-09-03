package c1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import eg.t2;
import f3.g;
import f3.h;
import f5.m;
import fg.v0;
import h5.j;
import h5.k;
import hg.i1;
import hg.t0;
import hg.v2;
import hg.x1;
import j3.a2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import lh.n3;
import lh.p5;
import lh.q5;
import lh.s;
import lh.u2;
import lh.w3;
import mh.g5;
import mh.p;
import mh.r3;
import o4.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ig1;
import org.telegram.ui.jy;
import org.telegram.ui.ko0;
import org.telegram.ui.py;
import org.telegram.ui.sf1;
import org.telegram.ui.vo0;
import y2.i;
public final class b implements OnFailureListener, ba.a, OnCompleteListener, Continuation, g3.b, f3.f, m, c2, ko0, jy, c9.e, k, j, r3, Utilities.Callback5, jl0, ig1 {
    public final int f2026a;
    public final Object f2027b;
    public final Object f2028c;

    public b(int i10, Object obj, Object obj2) {
        this.f2026a = i10;
        this.f2027b = obj;
        this.f2028c = obj2;
    }

    @Override
    public boolean C() {
        switch (this.f2026a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean J(py pyVar) {
        switch (this.f2026a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a(int i10) {
        switch (this.f2026a) {
            case 14:
                t0 t0Var = (t0) this.f2027b;
                t0 t0Var2 = (t0) this.f2028c;
                if (i10 == 1) {
                    t0Var.run(null);
                    return;
                } else if (i10 != 3) {
                    t0Var2.run(null);
                    return;
                } else {
                    return;
                }
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f2027b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f2028c;
                if (i10 == 1) {
                    callback.run(null);
                    return;
                } else if (i10 != 3) {
                    callback2.run(null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public Object apply(Object obj) {
        v2.d[] values;
        h hVar = (h) this.f2027b;
        i iVar = (i) this.f2028c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        f3.a aVar = hVar.d;
        ArrayList d = hVar.d(sQLiteDatabase, iVar, aVar.f5970b);
        for (v2.d dVar : v2.d.values()) {
            if (dVar != iVar.f50732c) {
                int size = aVar.f5970b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(hVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb.append(((f3.b) d.get(i10)).f5973a);
            if (i10 < d.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j10 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j10));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j10), set);
                }
                set.add(new g(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            f3.b bVar = (f3.b) listIterator.next();
            long j11 = bVar.f5973a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                a9.a c3 = bVar.f5975c.c();
                for (g gVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c3.c(gVar.f5979a, gVar.f5980b);
                }
                listIterator.set(new f3.b(j11, bVar.f5974b, c3.j()));
            }
        }
        return d;
    }

    @Override
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z4) {
        n3 n3Var = (n3) this.f2027b;
        or0 or0Var = n3Var.f12862a;
        n3Var.f12865e.f14407l.remove((TL_stars.SavedStarGift) this.f2028c);
        n3Var.f(true);
        int i10 = n3Var.f12863b;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            qc a02 = qc.a0(or0Var.f13100a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            ic O = a02.O(document, string, LocaleController.formatString(i11, l.d.l(tL_starGiftUnique.num, ',', sb)));
            O.f27786r = false;
            O.j();
        } else {
            ic O2 = qc.a0(or0Var.f13100a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j10)));
            O2.f27786r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            launchActivity.f34174u0.c(true);
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        q5.Q((q5) this.f2027b, (p5) this.f2028c, i10);
    }

    @Override
    public void d(Object obj, h5.g gVar) {
        ((k3.b) obj).a((a2) this.f2028c, new f7.b(gVar, ((k3.f) this.f2027b).f10425e));
    }

    @Override
    public s8.i0 e(int r17, o4.s0 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: c1.b.e(int, o4.s0, int[]):s8.i0");
    }

    @Override
    public Object e0(c5.j jVar) {
        String valueOf;
        String str = (String) this.f2027b;
        Context context = (Context) jVar.a(Context.class);
        switch (((sg.a) this.f2028c).f47381a) {
            case 24:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 25:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 26:
                int i10 = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    valueOf = "tv";
                    break;
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    valueOf = "watch";
                    break;
                } else if (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    valueOf = "auto";
                    break;
                } else {
                    if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                        valueOf = "embedded";
                        break;
                    }
                    valueOf = "";
                    break;
                }
                break;
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    valueOf = FirebaseCommonRegistrar.b(installerPackageName);
                    break;
                }
                valueOf = "";
                break;
        }
        return new ja.a(str, valueOf);
    }

    @Override
    public void f(ba.b bVar) {
        ((ba.a) this.f2027b).f(bVar);
        ((ba.a) this.f2028c).f(bVar);
    }

    @Override
    public Object g() {
        switch (this.f2026a) {
            case 5:
                Iterable iterable = (Iterable) this.f2028c;
                h hVar = (h) ((f3.d) ((e3.g) this.f2027b).f4933c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + h.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                e3.g gVar = (e3.g) this.f2027b;
                for (Map.Entry entry : ((HashMap) this.f2028c).entrySet()) {
                    ((h) ((f3.c) gVar.f4937i)).e(((Integer) entry.getValue()).intValue(), b3.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f2026a) {
            case 27:
                ((p) this.f2027b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f2028c);
                return;
            default:
                ((g5) this.f2027b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f2028c);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f2026a) {
            case 20:
                ((k3.b) obj).c((k3.a) this.f2027b, (r) this.f2028c);
                return;
            default:
                ((k3.b) obj).onRenderedFirstFrame((k3.a) this.f2027b);
                return;
        }
    }

    @Override
    public void j(d2 d2Var, int i10) {
        switch (this.f2026a) {
            case 11:
                v0.Q((v0) this.f2027b, (ArrayList) this.f2028c);
                return;
            case 12:
                ((AtomicBoolean) this.f2027b).set(true);
                ((x1) this.f2028c).run();
                return;
            case 13:
                ((t0) this.f2027b).run((TLRPC.TL_premiumGiftCodeOption) this.f2028c);
                return;
            case 22:
                s sVar = (s) this.f2027b;
                eh.b bVar = (eh.b) this.f2028c;
                try {
                    int parseInt = Integer.parseInt(bVar.getText().toString().trim());
                    sVar.X(parseInt);
                    sVar.Z.setValue(parseInt);
                    d2Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(bVar);
                    FileLog.e(th2);
                    return;
                }
            case 23:
                u2 u2Var = (u2) this.f2027b;
                Utilities.Callback callback = (Utilities.Callback) this.f2028c;
                String obj = u2Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    d2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(u2Var);
                return;
            default:
                g5 g5Var = (g5) this.f2027b;
                af.f g10 = d2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                b bVar2 = new b(29, g5Var, twoStepVerificationActivity);
                twoStepVerificationActivity.W = 2;
                twoStepVerificationActivity.Y = bVar2;
                twoStepVerificationActivity.X = g5Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new androidx.car.app.utils.b(g5Var, (v2[]) this.f2028c, g10, twoStepVerificationActivity, 25));
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.f2027b).a((Intent) this.f2028c);
    }

    @Override
    public void onFailure(Exception e6) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f2026a) {
            case 0:
                f fVar = (f) this.f2027b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f2028c;
                kotlin.jvm.internal.j.e(e6, "e");
                if ((e6 instanceof com.google.android.gms.common.api.f) && b1.d.f1376b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e6).getStatusCode()))) {
                    str = "GET_INTERRUPTED";
                } else {
                    str = "GET_NO_CREDENTIALS";
                }
                String str3 = "During begin sign in, failure response from one tap: " + e6.getMessage();
                int hashCode = str.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                            gVar = new w0.k(str3);
                        }
                        gVar = new w0.h(str3, 2);
                    } else {
                        if (str.equals("GET_INTERRUPTED")) {
                            gVar = new w0.j(str3);
                        }
                        gVar = new w0.h(str3, 2);
                    }
                } else {
                    if (str.equals("GET_CANCELED_TAG")) {
                        gVar = new w0.g(str3);
                    }
                    gVar = new w0.h(str3, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    fVar.f().execute(new a(fVar, gVar, 0));
                    return;
                }
                return;
            case 4:
                d1.e eVar = (d1.e) this.f2027b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f2028c;
                kotlin.jvm.internal.j.e(e6, "e");
                if ((e6 instanceof com.google.android.gms.common.api.f) && b1.d.f1376b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e6).getStatusCode()))) {
                    str2 = "CREATE_INTERRUPTED";
                } else {
                    str2 = "CREATE_UNKNOWN";
                }
                String str4 = "During create public key credential, fido registration failure: " + e6.getMessage();
                if (str2.equals("CREATE_CANCELED")) {
                    cVar = new w0.b(str4);
                } else if (str2.equals("CREATE_INTERRUPTED")) {
                    cVar = new w0.e(str4);
                } else {
                    cVar = new w0.c(str4, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Executor executor = eVar.f4156g;
                    if (executor != null) {
                        executor.execute(new d1.a(eVar, cVar, 1));
                        return;
                    } else {
                        kotlin.jvm.internal.j.h("executor");
                        throw null;
                    }
                }
                return;
            default:
                t2 t2Var = (t2) this.f2027b;
                Bitmap bitmap = (Bitmap) this.f2028c;
                t2Var.f5493y0 = false;
                FileLog.e(e6);
                if (Build.VERSION.SDK_INT >= 24 && (e6 instanceof ya.a) && e6.getMessage() != null && e6.getMessage().contains("segmentation optional module to be downloaded") && t2Var.isAttachedToWindow()) {
                    AndroidUtilities.runOnUIThread(new a1.e(22, t2Var, bitmap), 2000L);
                    return;
                } else {
                    t2Var.f5494z0 = true;
                    return;
                }
        }
    }

    @Override
    public void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z4;
        boolean z10;
        w3 w3Var = (w3) this.f2027b;
        qh.d dVar = (qh.d) this.f2028c;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f10 = (Float) obj4;
        Float f11 = (Float) obj5;
        w3Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((h51) obj).G).gift.f21072id;
        if (w3Var.f13062b == j10) {
            w3Var.f13062b = 0L;
        } else {
            w3Var.f13062b = j10;
        }
        if (w3Var.f13062b != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        dVar.setEnabled(z4);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof vo0) {
                    vo0 vo0Var = (vo0) childAt;
                    if (w3Var.f13062b == vo0Var.getGiftId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vo0Var.b(z10, true);
                }
            }
        }
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.f2027b;
        String str = (String) this.f2028c;
        synchronized (jVar) {
            ((a0.f) jVar.f4064b).remove(str);
        }
        return task;
    }

    @Override
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        switch (this.f2026a) {
            case 16:
                i1 i1Var = (i1) this.f2027b;
                String str = (String) this.f2028c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    i1Var.f31017n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                pyVar.finishFragment();
                hg.r.h(j10);
                return true;
            default:
                ig.e eVar = (ig.e) this.f2027b;
                String str2 = (String) this.f2028c;
                long j11 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.f8081e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                pyVar.finishFragment();
                hg.r.h(j11);
                return true;
        }
    }

    public b(k3.a aVar, Object obj, long j10) {
        this.f2026a = 21;
        this.f2027b = aVar;
        this.f2028c = obj;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
