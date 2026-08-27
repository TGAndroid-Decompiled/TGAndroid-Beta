package ag;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.RectF;
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
import gh.c4;
import gh.t3;
import gh.w5;
import gh.x5;
import hh.i5;
import hh.s3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
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
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a51;
import org.telegram.ui.co0;
import org.telegram.ui.gy;
import org.telegram.ui.lo0;
import org.telegram.ui.mf1;
import org.telegram.ui.we1;
import org.telegram.ui.zx;

public final class h0 implements org.telegram.ui.ActionBar.a2, b5.n, OnFailureListener, e3.b, co0, zx, OnCompleteListener, Continuation, d3.f, z8.d, s3, Utilities.Callback5, qk0, mf1, d5.l, d5.k, a51, qg.h {

    public final int f408a;

    public final Object f409b;

    public final Object f410c;

    public h0(int i10, Object obj, Object obj2) {
        this.f408a = i10;
        this.f409b = obj;
        this.f410c = obj2;
    }

    @Override
    public boolean D() {
        switch (this.f408a) {
        }
        return false;
    }

    @Override
    public boolean K(gy gyVar) {
        switch (this.f408a) {
        }
        return false;
    }

    @Override
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        t3 t3Var = (t3) this.f409b;
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f410c;
        wq0 wq0Var = t3Var.f7533a;
        t3Var.f7536e.f9753l.remove(savedStarGift);
        t3Var.f(true);
        int i10 = t3Var.f7534b;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            mc mcVarA0 = mc.a0(wq0Var.f7197a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i11 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            ec ecVarO = mcVarA0.O(document, string, LocaleController.formatString(i11, i0.a.m(tL_starGiftUnique.num, ',', sb2)));
            ecVarO.f28028r = false;
            ecVarO.j();
        } else {
            ec ecVarO2 = mc.a0(wq0Var.f7197a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i10, j10)));
            ecVarO2.f28028r = false;
            ecVarO2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.f35535t0.c(true);
        }
    }

    @Override
    public Object apply(Object obj) {
        d3.h hVar = (d3.h) this.f409b;
        w2.i iVar = (w2.i) this.f410c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        d3.a aVar = hVar.d;
        ArrayList arrayListD = hVar.d(sQLiteDatabase, iVar, aVar.f4731b);
        for (t2.d dVar : t2.d.values()) {
            if (dVar != iVar.f48959c) {
                int size = aVar.f4731b - arrayListD.size();
                if (size <= 0) {
                    break;
                }
                arrayListD.addAll(hVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < arrayListD.size(); i10++) {
            sb2.append(((d3.b) arrayListD.get(i10)).f4734a);
            if (i10 < arrayListD.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j10 = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j10));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j10), hashSet);
                }
                hashSet.add(new d3.g(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListD.listIterator();
        while (listIterator.hasNext()) {
            d3.b bVar = (d3.b) listIterator.next();
            long j11 = bVar.f4734a;
            if (map.containsKey(Long.valueOf(j11))) {
                com.google.firebase.messaging.m mVarC = bVar.f4736c.c();
                for (d3.g gVar : (Set) map.get(Long.valueOf(j11))) {
                    mVarC.c(gVar.f4740a, gVar.f4741b);
                }
                listIterator.set(new d3.b(j11, bVar.f4735b, mVarC.i()));
            }
        }
        return arrayListD;
    }

    @Override
    public void b(int i10) {
        switch (this.f408a) {
            case 8:
                cg.v0 v0Var = (cg.v0) this.f409b;
                cg.v0 v0Var2 = (cg.v0) this.f410c;
                if (i10 == 1) {
                    v0Var.run(null);
                } else if (i10 != 3) {
                    v0Var2.run(null);
                }
                break;
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f409b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f410c;
                if (i10 == 1) {
                    callback.run(null);
                } else if (i10 != 3) {
                    callback2.run(null);
                }
                break;
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        x5.Q((x5) this.f409b, (w5) this.f410c, i10);
    }

    @Override
    public p8.l0 d(int i10, j4.i1 i1Var, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        j4.i1 i1Var2 = i1Var;
        int i15 = this.f408a;
        Object obj = this.f410c;
        b5.i iVar = (b5.i) this.f409b;
        switch (i15) {
            case 1:
                int i16 = ((int[]) obj)[i10];
                int i17 = iVar.f2023r;
                int i18 = iVar.f2024s;
                boolean z10 = iVar.v;
                if (i17 == Integer.MAX_VALUE || i18 == Integer.MAX_VALUE) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = Integer.MAX_VALUE;
                    for (int i19 = 0; i19 < i1Var2.f12583a; i19++) {
                        h3.t0 t0Var = i1Var2.d[i19];
                        int i20 = t0Var.G;
                        int i21 = t0Var.H;
                        if (i20 > 0 && i21 > 0) {
                            if (!z10) {
                                i13 = i17;
                                i14 = i18;
                            } else if ((i20 > i21) != (i17 > i18)) {
                                i14 = i17;
                                i13 = i18;
                            } else {
                                i13 = i17;
                                i14 = i18;
                            }
                            int i22 = i20 * i14;
                            int i23 = i21 * i13;
                            Point point = i22 >= i23 ? new Point(i13, d5.g0.f(i23, i20)) : new Point(d5.g0.f(i22, i21), i14);
                            int i24 = t0Var.G;
                            int i25 = i24 * i21;
                            if (i24 >= ((int) (point.x * 0.98f)) && i21 >= ((int) (point.y * 0.98f)) && i25 < i11) {
                                i11 = i25;
                            }
                        }
                    }
                }
                p8.x xVar = p8.z.f45604b;
                p8.l.a(4, "initialCapacity");
                Object[] objArrCopyOf = new Object[4];
                int i26 = 0;
                int i27 = 0;
                while (i26 < i1Var2.f12583a) {
                    h3.t0 t0Var2 = i1Var2.d[i26];
                    int i28 = t0Var2.G;
                    int i29 = (i28 == -1 || (i12 = t0Var2.H) == -1) ? -1 : i28 * i12;
                    b5.i iVar2 = iVar;
                    b5.p pVar = new b5.p(i10, i1Var2, i26, iVar2, iArr[i26], i16, i11 == Integer.MAX_VALUE || (i29 != -1 && i29 <= i11));
                    int i30 = i27 + 1;
                    if (objArrCopyOf.length < i30) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, p8.w.d(objArrCopyOf.length, i30));
                    }
                    objArrCopyOf[i27] = pVar;
                    i26++;
                    i1Var2 = i1Var;
                    i27 = i30;
                    iVar = iVar2;
                }
                return p8.z.s(i27, objArrCopyOf);
            default:
                String str = (String) obj;
                p8.x xVar2 = p8.z.f45604b;
                p8.l.a(4, "initialCapacity");
                Object[] objArrCopyOf2 = new Object[4];
                int i31 = 0;
                int i32 = 0;
                while (i31 < i1Var2.f12583a) {
                    b5.i iVar3 = iVar;
                    b5.m mVar = new b5.m(i10, i1Var2, i31, iVar3, iArr[i31], str);
                    int i33 = i32 + 1;
                    if (objArrCopyOf2.length < i33) {
                        objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, p8.w.d(objArrCopyOf2.length, i33));
                    }
                    objArrCopyOf2[i32] = mVar;
                    i31++;
                    i32 = i33;
                    iVar = iVar3;
                }
                return p8.z.s(i32, objArrCopyOf2);
        }
    }

    @Override
    public void e(Object obj, d5.g gVar) {
        i3.b bVar = (i3.b) obj;
        bVar.c((h3.c2) this.f410c, new g5.b(gVar, ((i3.f) this.f409b).f10533e));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f408a) {
            case 0:
                i1.Q((i1) this.f409b, (ArrayList) this.f410c);
                break;
            case 6:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f409b;
                cg.a2 a2Var = (cg.a2) this.f410c;
                atomicBoolean.set(true);
                a2Var.run();
                break;
            case 7:
                ((cg.v0) this.f409b).run((TLRPC.TL_premiumGiftCodeOption) this.f410c);
                break;
            case 17:
                gh.v vVar = (gh.v) this.f409b;
                gh.r rVar = (gh.r) this.f410c;
                try {
                    int i11 = Integer.parseInt(rVar.getText().toString().trim());
                    vVar.X(i11);
                    vVar.Y.setValue(i11);
                    b2Var.dismiss();
                } catch (Throwable th) {
                    AndroidUtilities.shakeView(rVar);
                    FileLog.e(th);
                    return;
                }
                break;
            case 18:
                gh.b3 b3Var = (gh.b3) this.f409b;
                Utilities.Callback callback = (Utilities.Callback) this.f410c;
                String string = b3Var.getText().toString();
                if (string.length() > 0 && string.length() <= 12) {
                    callback.run(string);
                    b2Var.dismiss();
                } else {
                    AndroidUtilities.shakeView(b3Var);
                }
                break;
            default:
                i5 i5Var = (i5) this.f409b;
                cg.y2[] y2VarArr = (cg.y2[]) this.f410c;
                we.d dVarG = b2Var.g(i10, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                h0 h0Var = new h0(24, i5Var, twoStepVerificationActivity);
                twoStepVerificationActivity.V = 2;
                twoStepVerificationActivity.X = h0Var;
                twoStepVerificationActivity.W = i5Var.C1();
                dVarG.d();
                twoStepVerificationActivity.s0(new androidx.car.app.utils.a(i5Var, y2VarArr, dVarG, twoStepVerificationActivity, 23));
                break;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(RectF rectF, View view) {
        lg.d dVar = (lg.d) this.f409b;
        View view2 = (View) this.f410c;
        dVar.s(rectF.left, rectF.top);
        view2.invalidate();
    }

    @Override
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f408a) {
            case 22:
                ((hh.r) this.f409b).h0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f410c);
                break;
            default:
                ((i5) this.f409b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f410c);
                break;
        }
    }

    @Override
    public Object i() {
        switch (this.f408a) {
            case 4:
                c3.g gVar = (c3.g) this.f409b;
                Iterable iterable = (Iterable) this.f410c;
                d3.h hVar = (d3.h) ((d3.d) gVar.f2435c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + d3.h.g(iterable)).execute();
                    break;
                }
                break;
            default:
                c3.g gVar2 = (c3.g) this.f409b;
                for (Map.Entry entry : ((HashMap) this.f410c).entrySet()) {
                    ((d3.h) ((d3.c) gVar2.f2439i)).e(((Integer) entry.getValue()).intValue(), z2.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f408a) {
            case 26:
                ((i3.b) obj).g((i3.a) this.f409b, (j4.x) this.f410c);
                break;
            default:
                ((i3.b) obj).onRenderedFirstFrame((i3.a) this.f409b);
                break;
        }
    }

    @Override
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.f409b).a((Intent) this.f410c);
    }

    @Override
    public void onFailure(Exception e9) {
        w0.i gVar;
        w0.d eVar;
        switch (this.f408a) {
            case 3:
                c1.e eVar2 = (c1.e) this.f409b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f410c;
                kotlin.jvm.internal.j.e(e9, "e");
                String str = ((e9 instanceof com.google.android.gms.common.api.f) && b1.d.f1891b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e9).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str2 = "During begin sign in, failure response from one tap: " + e9.getMessage();
                int iHashCode = str.hashCode();
                if (iHashCode != -1567968963) {
                    if (iHashCode != -154594663) {
                        if (iHashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                            gVar = new w0.k(str2);
                        } else {
                            gVar = new w0.h(str2, 2);
                        }
                    } else if (str.equals("GET_INTERRUPTED")) {
                        gVar = new w0.j(str2);
                    } else {
                        gVar = new w0.h(str2, 2);
                    }
                } else if (str.equals("GET_CANCELED_TAG")) {
                    gVar = new w0.g(str2);
                } else {
                    gVar = new w0.h(str2, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal)) {
                    return;
                }
                eVar2.f().execute(new c1.a(eVar2, gVar, 0));
                return;
            default:
                d1.e eVar3 = (d1.e) this.f409b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f410c;
                kotlin.jvm.internal.j.e(e9, "e");
                String str3 = ((e9 instanceof com.google.android.gms.common.api.f) && b1.d.f1891b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e9).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String str4 = "During create public key credential, fido registration failure: " + e9.getMessage();
                if (str3.equals("CREATE_CANCELED")) {
                    eVar = new w0.b(str4);
                } else {
                    eVar = str3.equals("CREATE_INTERRUPTED") ? new w0.e(str4) : new w0.c(str4, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (a1.g.a(cancellationSignal2)) {
                    return;
                }
                Executor executor = eVar3.f4693g;
                if (executor != null) {
                    executor.execute(new d1.a(eVar3, eVar, 1));
                    return;
                } else {
                    kotlin.jvm.internal.j.h("executor");
                    throw null;
                }
        }
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        c4 c4Var = (c4) this.f409b;
        lh.d dVar = (lh.d) this.f410c;
        View view = (View) obj2;
        c4Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((n41) obj).G).gift.f22607id;
        if (c4Var.f7184b == j10) {
            c4Var.f7184b = 0L;
        } else {
            c4Var.f7184b = j10;
        }
        dVar.setEnabled(c4Var.f7184b != 0);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof lo0) {
                    lo0 lo0Var = (lo0) childAt;
                    lo0Var.b(c4Var.f7184b == lo0Var.getGiftId(), true);
                }
            }
        }
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.i iVar = (com.google.firebase.messaging.i) this.f409b;
        String str = (String) this.f410c;
        synchronized (iVar) {
            ((a0.f) iVar.f4594b).remove(str);
        }
        return task;
    }

    @Override
    public Object u0(af.h hVar) {
        String strValueOf;
        String str = (String) this.f409b;
        r4.a aVar = (r4.a) this.f410c;
        Context context = (Context) hVar.a(Context.class);
        switch (aVar.f46720a) {
            case 26:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo == null) {
                    strValueOf = "";
                } else {
                    strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                }
                break;
            case 27:
                strValueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 28:
                int i10 = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    strValueOf = "tv";
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    strValueOf = "watch";
                } else if (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    strValueOf = "auto";
                } else if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    strValueOf = "embedded";
                } else {
                    strValueOf = "";
                }
                break;
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    strValueOf = "";
                } else {
                    strValueOf = FirebaseCommonRegistrar.b(installerPackageName);
                }
                break;
        }
        return new ga.a(str, strValueOf);
    }

    @Override
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        switch (this.f408a) {
            case 10:
                cg.k1 k1Var = (cg.k1) this.f409b;
                String str = (String) this.f410c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    k1Var.f31855n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                gyVar.finishFragment();
                cg.r.h(j10);
                break;
            default:
                dg.e eVar = (dg.e) this.f409b;
                String str2 = (String) this.f410c;
                long j11 = 0;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    j11 = ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId;
                    eVar.f4944e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i13++;
                    eVar = eVar;
                }
                gyVar.finishFragment();
                cg.r.h(j11);
                break;
        }
        return true;
    }

    public h0(i3.a aVar, Object obj, long j10) {
        this.f408a = 27;
        this.f409b = aVar;
        this.f410c = obj;
    }

    @Override
    public void c0(View view, float f10, float f11) {
    }
}
