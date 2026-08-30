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
import eg.v0;
import f3.g;
import f3.h;
import f5.m;
import gg.i1;
import gg.t0;
import gg.x1;
import h5.j;
import h5.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.a2;
import kh.n3;
import kh.p5;
import kh.q5;
import kh.s;
import kh.v2;
import kh.w3;
import lh.g5;
import lh.q;
import lh.r3;
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
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ag1;
import org.telegram.ui.io0;
import org.telegram.ui.iy;
import org.telegram.ui.kf1;
import org.telegram.ui.oy;
import org.telegram.ui.ro0;
import y2.i;
public final class b implements OnFailureListener, ba.a, OnCompleteListener, Continuation, g3.b, c2, f3.f, m, io0, iy, c9.e, k, j, r3, Utilities.Callback5, jl0, ag1 {
    public final int f1865a;
    public final Object f1866b;
    public final Object f1867c;

    public b(int i10, Object obj, Object obj2) {
        this.f1865a = i10;
        this.f1866b = obj;
        this.f1867c = obj2;
    }

    @Override
    public boolean C() {
        switch (this.f1865a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean K(oy oyVar) {
        switch (this.f1865a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(int i10) {
        switch (this.f1865a) {
            case 14:
                t0 t0Var = (t0) this.f1866b;
                t0 t0Var2 = (t0) this.f1867c;
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
                Utilities.Callback callback = (Utilities.Callback) this.f1866b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f1867c;
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
        h hVar = (h) this.f1866b;
        i iVar = (i) this.f1867c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        f3.a aVar = hVar.d;
        ArrayList d = hVar.d(sQLiteDatabase, iVar, aVar.f5875b);
        for (v2.d dVar : v2.d.values()) {
            if (dVar != iVar.f47016c) {
                int size = aVar.f5875b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(hVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb.append(((f3.b) d.get(i10)).f5877a);
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
            long j11 = bVar.f5877a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                a9.a c3 = bVar.f5879c.c();
                for (g gVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c3.c(gVar.f5883a, gVar.f5884b);
                }
                listIterator.set(new f3.b(j11, bVar.f5878b, c3.j()));
            }
        }
        return d;
    }

    @Override
    public void b(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z4) {
        n3 n3Var = (n3) this.f1866b;
        or0 or0Var = n3Var.f10719a;
        n3Var.e.f12772l.remove((TL_stars.SavedStarGift) this.f1867c);
        n3Var.f(true);
        int i10 = n3Var.f10720b;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            qc a02 = qc.a0(or0Var.f10939a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            ic O = a02.O(document, string, LocaleController.formatString(i11, a2.l(tL_starGiftUnique.num, ',', sb)));
            O.f25680r = false;
            O.j();
        } else {
            ic O2 = qc.a0(or0Var.f10939a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j10)));
            O2.f25680r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            launchActivity.f31652u0.c(true);
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        q5.Q((q5) this.f1866b, (p5) this.f1867c, i10);
    }

    @Override
    public void d(Object obj, h5.g gVar) {
        ((k3.b) obj).a((j3.a2) this.f1867c, new f7.b(gVar, ((k3.f) this.f1866b).e));
    }

    @Override
    public s8.i0 e(int r17, o4.s0 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: c1.b.e(int, o4.s0, int[]):s8.i0");
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public void f(ba.b bVar) {
        ((ba.a) this.f1866b).f(bVar);
        ((ba.a) this.f1867c).f(bVar);
    }

    @Override
    public Object f0(c5.j jVar) {
        String valueOf;
        String str = (String) this.f1866b;
        Context context = (Context) jVar.a(Context.class);
        switch (((s0.b) this.f1867c).f43896a) {
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
    public Object g() {
        switch (this.f1865a) {
            case 6:
                Iterable iterable = (Iterable) this.f1867c;
                h hVar = (h) ((f3.d) ((e3.g) this.f1866b).f5097c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + h.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                e3.g gVar = (e3.g) this.f1866b;
                for (Map.Entry entry : ((HashMap) this.f1867c).entrySet()) {
                    ((h) ((f3.c) gVar.f5100i)).e(((Integer) entry.getValue()).intValue(), b3.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void i(d2 d2Var, int i10) {
        switch (this.f1865a) {
            case 8:
                v0.Q((v0) this.f1866b, (ArrayList) this.f1867c);
                return;
            case 12:
                ((AtomicBoolean) this.f1866b).set(true);
                ((x1) this.f1867c).run();
                return;
            case 13:
                ((t0) this.f1866b).run((TLRPC.TL_premiumGiftCodeOption) this.f1867c);
                return;
            case 22:
                s sVar = (s) this.f1866b;
                dh.b bVar = (dh.b) this.f1867c;
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
                v2 v2Var = (v2) this.f1866b;
                Utilities.Callback callback = (Utilities.Callback) this.f1867c;
                String obj = v2Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    d2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(v2Var);
                return;
            default:
                g5 g5Var = (g5) this.f1866b;
                af.f g10 = d2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                b bVar2 = new b(29, g5Var, twoStepVerificationActivity);
                twoStepVerificationActivity.W = 2;
                twoStepVerificationActivity.Y = bVar2;
                twoStepVerificationActivity.X = g5Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new androidx.car.app.utils.b(g5Var, (gg.v2[]) this.f1867c, g10, twoStepVerificationActivity, 25));
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f1865a) {
            case 20:
                ((k3.b) obj).c((k3.a) this.f1866b, (r) this.f1867c);
                return;
            default:
                ((k3.b) obj).onRenderedFirstFrame((k3.a) this.f1866b);
                return;
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f1865a) {
            case 27:
                ((q) this.f1866b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f1867c);
                return;
            default:
                ((g5) this.f1866b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f1867c);
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.f1866b).a((Intent) this.f1867c);
    }

    @Override
    public void onFailure(Exception e) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f1865a) {
            case 0:
                f fVar = (f) this.f1866b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f1867c;
                kotlin.jvm.internal.j.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f1276b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
                    str = "GET_INTERRUPTED";
                } else {
                    str = "GET_NO_CREDENTIALS";
                }
                String str3 = "During begin sign in, failure response from one tap: " + e.getMessage();
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
                d1.e eVar = (d1.e) this.f1866b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f1867c;
                kotlin.jvm.internal.j.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f1276b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
                    str2 = "CREATE_INTERRUPTED";
                } else {
                    str2 = "CREATE_UNKNOWN";
                }
                String str4 = "During create public key credential, fido registration failure: " + e.getMessage();
                if (str2.equals("CREATE_CANCELED")) {
                    cVar = new w0.b(str4);
                } else if (str2.equals("CREATE_INTERRUPTED")) {
                    cVar = new w0.e(str4);
                } else {
                    cVar = new w0.c(str4, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Executor executor = eVar.f4096g;
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
                dg.v2 v2Var = (dg.v2) this.f1866b;
                Bitmap bitmap = (Bitmap) this.f1867c;
                v2Var.f4828y0 = false;
                FileLog.e(e);
                if (Build.VERSION.SDK_INT >= 24 && (e instanceof ya.a) && e.getMessage() != null && e.getMessage().contains("segmentation optional module to be downloaded") && v2Var.isAttachedToWindow()) {
                    AndroidUtilities.runOnUIThread(new a1.e(18, v2Var, bitmap), 2000L);
                    return;
                } else {
                    v2Var.f4829z0 = true;
                    return;
                }
        }
    }

    @Override
    public void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z4;
        boolean z10;
        w3 w3Var = (w3) this.f1866b;
        ph.d dVar = (ph.d) this.f1867c;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f10 = (Float) obj4;
        Float f11 = (Float) obj5;
        w3Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((i51) obj).G).gift.f19409id;
        if (w3Var.f10907b == j10) {
            w3Var.f10907b = 0L;
        } else {
            w3Var.f10907b = j10;
        }
        if (w3Var.f10907b != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        dVar.setEnabled(z4);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof ro0) {
                    ro0 ro0Var = (ro0) childAt;
                    if (w3Var.f10907b == ro0Var.getGiftId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ro0Var.b(z10, true);
                }
            }
        }
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.f1866b;
        String str = (String) this.f1867c;
        synchronized (jVar) {
            ((a0.f) jVar.f4013b).remove(str);
        }
        return task;
    }

    @Override
    public boolean w(oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        switch (this.f1865a) {
            case 16:
                i1 i1Var = (i1) this.f1866b;
                String str = (String) this.f1867c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    i1Var.f28678n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                oyVar.finishFragment();
                gg.r.h(j10);
                return true;
            default:
                hg.e eVar = (hg.e) this.f1866b;
                String str2 = (String) this.f1867c;
                long j11 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                oyVar.finishFragment();
                gg.r.h(j11);
                return true;
        }
    }

    public b(k3.a aVar, Object obj, long j10) {
        this.f1865a = 21;
        this.f1866b = aVar;
        this.f1867c = obj;
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }
}
