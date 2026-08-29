package a9;

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
import bg.c2;
import bg.y2;
import cg.v0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import eg.j1;
import eg.u0;
import eg.w2;
import eg.y1;
import ih.n3;
import ih.p5;
import ih.q5;
import ih.v2;
import ih.w3;
import j7.l1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.h5;
import jh.s3;
import l4.x;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ao0;
import org.telegram.ui.fy;
import org.telegram.ui.jo0;
import org.telegram.ui.pf1;
import org.telegram.ui.yx;
import org.telegram.ui.ze1;
public final class s implements z9.a, OnFailureListener, b2, OnCompleteListener, Continuation, d5.m, g3.b, ao0, yx, f3.f, e, s3, Utilities.Callback5, al0, pf1, f5.k, f5.j {
    public final int f268a;
    public final Object f269b;
    public final Object f270c;

    public s(int i10, Object obj, Object obj2) {
        this.f268a = i10;
        this.f269b = obj;
        this.f270c = obj2;
    }

    @Override
    public boolean C() {
        switch (this.f268a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object I0(a5.j jVar) {
        String valueOf;
        String str = (String) this.f269b;
        Context context = (Context) jVar.a(Context.class);
        switch (((sg.j) this.f270c).f48068a) {
            case 6:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 7:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 8:
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
        return new ha.a(str, valueOf);
    }

    @Override
    public boolean J(fy fyVar) {
        switch (this.f268a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(int i10) {
        switch (this.f268a) {
            case 13:
                u0 u0Var = (u0) this.f269b;
                u0 u0Var2 = (u0) this.f270c;
                if (i10 == 1) {
                    u0Var.run(null);
                    return;
                } else if (i10 != 3) {
                    u0Var2.run(null);
                    return;
                } else {
                    return;
                }
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f269b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f270c;
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
        f3.h hVar = (f3.h) this.f269b;
        y2.i iVar = (y2.i) this.f270c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        f3.a aVar = hVar.d;
        ArrayList d = hVar.d(sQLiteDatabase, iVar, aVar.f6526b);
        for (v2.d dVar : v2.d.values()) {
            if (dVar != iVar.f50189c) {
                int size = aVar.f6526b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(hVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < d.size(); i10++) {
            sb2.append(((f3.b) d.get(i10)).f6529a);
            if (i10 < d.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j10 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j10));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j10), set);
                }
                set.add(new f3.g(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            f3.b bVar = (f3.b) listIterator.next();
            long j11 = bVar.f6529a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                c2 c3 = bVar.f6531c.c();
                for (f3.g gVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c3.c(gVar.f6535a, gVar.f6536b);
                }
                listIterator.set(new f3.b(j11, bVar.f6530b, c3.i()));
            }
        }
        return d;
    }

    @Override
    public void b(float f9, float f10, int i10, View view) {
        q5.Q((q5) this.f269b, (p5) this.f270c, i10);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public q8.l0 c(int r17, l4.j1 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: a9.s.c(int, l4.j1, int[]):q8.l0");
    }

    @Override
    public void d(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        n3 n3Var = (n3) this.f269b;
        gr0 gr0Var = n3Var.f9293a;
        n3Var.f9296e.f12387l.remove((TL_stars.SavedStarGift) this.f270c);
        n3Var.f(true);
        int i10 = n3Var.f9294b;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            tc a02 = tc.a0(gr0Var.f9501a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            mc O = a02.O(document, string, LocaleController.formatString(i11, l1.m(tL_starGiftUnique.num, ',', sb2)));
            O.f30660r = false;
            O.j();
        } else {
            mc O2 = tc.a0(gr0Var.f9501a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j10)));
            O2.f30660r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.f35599t0.c(true);
        }
    }

    @Override
    public void e(Object obj, f5.g gVar) {
        ((k3.b) obj).g((j3.c2) this.f270c, new g9.l(gVar, ((k3.f) this.f269b).f13416e));
    }

    @Override
    public Object f() {
        switch (this.f268a) {
            case 9:
                Iterable iterable = (Iterable) this.f270c;
                f3.h hVar = (f3.h) ((f3.d) ((e3.f) this.f269b).f5814c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + f3.h.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                e3.f fVar = (e3.f) this.f269b;
                for (Map.Entry entry : ((HashMap) this.f270c).entrySet()) {
                    ((f3.h) ((f3.c) fVar.f5818i)).e(((Integer) entry.getValue()).intValue(), b3.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f268a) {
            case 3:
                v0.Q((v0) this.f269b, (ArrayList) this.f270c);
                return;
            case 11:
                ((AtomicBoolean) this.f269b).set(true);
                ((y1) this.f270c).run();
                return;
            case 12:
                ((u0) this.f269b).run((TLRPC.TL_premiumGiftCodeOption) this.f270c);
                return;
            case 19:
                ih.t tVar = (ih.t) this.f269b;
                bh.b bVar = (bh.b) this.f270c;
                try {
                    int parseInt = Integer.parseInt(bVar.getText().toString().trim());
                    tVar.X(parseInt);
                    tVar.Y.setValue(parseInt);
                    c2Var.dismiss();
                    return;
                } catch (Throwable th2) {
                    AndroidUtilities.shakeView(bVar);
                    FileLog.e(th2);
                    return;
                }
            case 20:
                v2 v2Var = (v2) this.f269b;
                Utilities.Callback callback = (Utilities.Callback) this.f270c;
                String obj = v2Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    c2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(v2Var);
                return;
            default:
                h5 h5Var = (h5) this.f269b;
                ye.c g10 = c2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                s sVar = new s(26, h5Var, twoStepVerificationActivity);
                twoStepVerificationActivity.V = 2;
                twoStepVerificationActivity.X = sVar;
                twoStepVerificationActivity.W = h5Var.C1();
                g10.d();
                twoStepVerificationActivity.s0(new androidx.car.app.utils.b(h5Var, (w2[]) this.f270c, g10, twoStepVerificationActivity, 23));
                return;
        }
    }

    @Override
    public void i(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f268a) {
            case 24:
                ((jh.q) this.f269b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f270c);
                return;
            default:
                ((h5) this.f269b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f270c);
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f268a) {
            case 28:
                ((k3.b) obj).b((k3.a) this.f269b, (x) this.f270c);
                return;
            default:
                ((k3.b) obj).onRenderedFirstFrame((k3.a) this.f269b);
                return;
        }
    }

    @Override
    public void j(z9.b bVar) {
        ((z9.a) this.f269b).j(bVar);
        ((z9.a) this.f270c).j(bVar);
    }

    @Override
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.f269b).a((Intent) this.f270c);
    }

    @Override
    public void onFailure(Exception e10) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f268a) {
            case 1:
                y2 y2Var = (y2) this.f269b;
                Bitmap bitmap = (Bitmap) this.f270c;
                y2Var.f2627x0 = false;
                FileLog.e(e10);
                if (Build.VERSION.SDK_INT >= 24 && (e10 instanceof wa.a) && e10.getMessage() != null && e10.getMessage().contains("segmentation optional module to be downloaded") && y2Var.isAttachedToWindow()) {
                    AndroidUtilities.runOnUIThread(new a1.e(12, y2Var, bitmap), 2000L);
                    return;
                } else {
                    y2Var.f2628y0 = true;
                    return;
                }
            case 2:
                c1.e eVar = (c1.e) this.f269b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f270c;
                kotlin.jvm.internal.j.e(e10, "e");
                if ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.f1885b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) {
                    str = "GET_INTERRUPTED";
                } else {
                    str = "GET_NO_CREDENTIALS";
                }
                String str3 = "During begin sign in, failure response from one tap: " + e10.getMessage();
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
                    eVar.f().execute(new c1.a(eVar, gVar, 0));
                    return;
                }
                return;
            default:
                d1.e eVar2 = (d1.e) this.f269b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f270c;
                kotlin.jvm.internal.j.e(e10, "e");
                if ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.f1885b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) {
                    str2 = "CREATE_INTERRUPTED";
                } else {
                    str2 = "CREATE_UNKNOWN";
                }
                String str4 = "During create public key credential, fido registration failure: " + e10.getMessage();
                if (str2.equals("CREATE_CANCELED")) {
                    cVar = new w0.b(str4);
                } else if (str2.equals("CREATE_INTERRUPTED")) {
                    cVar = new w0.e(str4);
                } else {
                    cVar = new w0.c(str4, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Executor executor = eVar2.f5260g;
                    if (executor != null) {
                        executor.execute(new d1.a(eVar2, cVar, 1));
                        return;
                    } else {
                        kotlin.jvm.internal.j.h("executor");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        boolean z11;
        w3 w3Var = (w3) this.f269b;
        nh.d dVar = (nh.d) this.f270c;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f9 = (Float) obj4;
        Float f10 = (Float) obj5;
        w3Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((w41) obj).G).gift.f22619id;
        if (w3Var.f9490b == j10) {
            w3Var.f9490b = 0L;
        } else {
            w3Var.f9490b = j10;
        }
        if (w3Var.f9490b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof jo0) {
                    jo0 jo0Var = (jo0) childAt;
                    if (w3Var.f9490b == jo0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    jo0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.f269b;
        String str = (String) this.f270c;
        synchronized (jVar) {
            ((a0.f) jVar.f5169b).remove(str);
        }
        return task;
    }

    @Override
    public boolean v(fy fyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ze1 ze1Var) {
        switch (this.f268a) {
            case 15:
                j1 j1Var = (j1) this.f269b;
                String str = (String) this.f270c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    j1Var.f34662n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                fyVar.finishFragment();
                eg.s.h(j10);
                return true;
            default:
                fg.e eVar = (fg.e) this.f269b;
                String str2 = (String) this.f270c;
                long j11 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.f6739e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                fyVar.finishFragment();
                eg.s.h(j11);
                return true;
        }
    }

    public s(k3.a aVar, Object obj, long j10) {
        this.f268a = 29;
        this.f269b = aVar;
        this.f270c = obj;
    }

    @Override
    public void o0(View view, float f9, float f10) {
    }
}
