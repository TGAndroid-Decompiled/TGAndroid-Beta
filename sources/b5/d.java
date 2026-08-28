package b5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.RectF;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bg.h2;
import bg.p1;
import bg.z0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import fh.e6;
import fh.f6;
import fh.g3;
import fh.h1;
import fh.y3;
import gh.k5;
import gh.u3;
import ih.i4;
import j3.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.f1;
import kh.o8;
import kh.r9;
import kh.w8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b51;
import org.telegram.ui.bo0;
import org.telegram.ui.dy;
import org.telegram.ui.ko0;
import org.telegram.ui.nf1;
import org.telegram.ui.we1;
import org.telegram.ui.wx;
public final class d implements o, b2, bo0, wx, OnFailureListener, e3.b, OnCompleteListener, Continuation, d3.f, y8.d, u3, Utilities.Callback5, nk0, nf1, b51, d5.l, d5.k, pg.g, w8 {
    public final int f1448a;
    public final Object f1449b;
    public final Object f1450c;

    public d(int i9, Object obj, Object obj2) {
        this.f1448a = i9;
        this.f1449b = obj;
        this.f1450c = obj2;
    }

    @Override
    public boolean C() {
        switch (this.f1448a) {
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object H1(b3.b bVar) {
        String valueOf;
        String str = (String) this.f1449b;
        Context context = (Context) bVar.a(Context.class);
        switch (((s0.b) this.f1450c).f47284a) {
            case 18:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                    break;
                }
                valueOf = "";
                break;
            case 19:
                valueOf = FirebaseCommonRegistrar.a(context);
                break;
            case 20:
                int i9 = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    valueOf = "tv";
                    break;
                } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    valueOf = "watch";
                    break;
                } else if (i9 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    valueOf = "auto";
                    break;
                } else {
                    if (i9 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
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
        return new fa.a(str, valueOf);
    }

    @Override
    public boolean I(dy dyVar) {
        switch (this.f1448a) {
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, boolean z10) {
        y3 y3Var = (y3) this.f1449b;
        vq0 vq0Var = y3Var.f6880a;
        y3Var.f6883e.f8625l.remove((TL_stars.SavedStarGift) this.f1450c);
        y3Var.f(true);
        int i9 = y3Var.f6881b;
        if (j10 == UserConfig.getInstance(i9).getClientUserId()) {
            oc a02 = oc.a0(vq0Var.f6545a);
            TLRPC.Document document = tL_starGiftUnique.getDocument();
            String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
            int i10 = R.string.BoughtResoldGiftText;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            gc O = a02.O(document, string, LocaleController.formatString(i10, r0.n(tL_starGiftUnique.num, ',', sb2)));
            O.f28745r = false;
            O.j();
        } else {
            gc O2 = oc.a0(vq0Var.f6545a).O(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(i9, j10)));
            O2.f28745r = false;
            O2.j();
        }
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.f35532t0.c(true);
        }
    }

    @Override
    public Object apply(Object obj) {
        t2.d[] values;
        d3.h hVar = (d3.h) this.f1449b;
        w2.i iVar = (w2.i) this.f1450c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        d3.a aVar = hVar.d;
        ArrayList d = hVar.d(sQLiteDatabase, iVar, aVar.f4289b);
        for (t2.d dVar : t2.d.values()) {
            if (dVar != iVar.f48456c) {
                int size = aVar.f4289b - d.size();
                if (size <= 0) {
                    break;
                }
                d.addAll(hVar.d(sQLiteDatabase, iVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i9 = 0; i9 < d.size(); i9++) {
            sb2.append(((d3.b) d.get(i9)).f4292a);
            if (i9 < d.size() - 1) {
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
                set.add(new d3.g(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = d.listIterator();
        while (listIterator.hasNext()) {
            d3.b bVar = (d3.b) listIterator.next();
            long j11 = bVar.f4292a;
            if (hashMap.containsKey(Long.valueOf(j11))) {
                com.google.firebase.messaging.m c10 = bVar.f4294c.c();
                for (d3.g gVar : (Set) hashMap.get(Long.valueOf(j11))) {
                    c10.c(gVar.f4298a, gVar.f4299b);
                }
                listIterator.set(new d3.b(j11, bVar.f4293b, c10.i()));
            }
        }
        return d;
    }

    @Override
    public void b(int i9) {
        switch (this.f1448a) {
            case 4:
                z0 z0Var = (z0) this.f1449b;
                z0 z0Var2 = (z0) this.f1450c;
                if (i9 == 1) {
                    z0Var.run(null);
                    return;
                } else if (i9 != 3) {
                    z0Var2.run(null);
                    return;
                } else {
                    return;
                }
            default:
                Utilities.Callback callback = (Utilities.Callback) this.f1449b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f1450c;
                if (i9 == 1) {
                    callback.run(null);
                    return;
                } else if (i9 != 3) {
                    callback2.run(null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void c(float f10, float f11, int i9, View view) {
        f6.P((f6) this.f1449b, (e6) this.f1450c, i9);
    }

    @Override
    public void d(r9 r9Var, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i9, o8 o8Var, f1 f1Var) {
        i4 i4Var = (i4) this.f1449b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f1450c;
        TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
        tL_stories_editStory.peer = MessagesController.getInstance(i4Var.f11609y2).getInputPeer(storyItem.dialogId);
        tL_stories_editStory.f22621id = storyItem.f22617id;
        tL_stories_editStory.flags |= 4;
        tL_stories_editStory.privacy_rules = r9Var.f15967b;
        ConnectionsManager.getInstance(i4Var.f11609y2).sendRequest(tL_stories_editStory, new h1(i4Var, o8Var, storyItem, r9Var, 6));
    }

    @Override
    public o8.l0 e(int r17, j4.i1 r18, int[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: b5.d.e(int, j4.i1, int[]):o8.l0");
    }

    @Override
    public void f(c2 c2Var, int i9) {
        switch (this.f1448a) {
            case 2:
                ((AtomicBoolean) this.f1449b).set(true);
                ((h2) this.f1450c).run();
                return;
            case 3:
                ((z0) this.f1449b).run((TLRPC.TL_premiumGiftCodeOption) this.f1450c);
                return;
            case 16:
                fh.x xVar = (fh.x) this.f1449b;
                fh.s sVar = (fh.s) this.f1450c;
                try {
                    int parseInt = Integer.parseInt(sVar.getText().toString().trim());
                    xVar.W(parseInt);
                    xVar.Y.setValue(parseInt);
                    c2Var.dismiss();
                    return;
                } catch (Throwable th) {
                    AndroidUtilities.shakeView(sVar);
                    FileLog.e(th);
                    return;
                }
            case 17:
                g3 g3Var = (g3) this.f1449b;
                Utilities.Callback callback = (Utilities.Callback) this.f1450c;
                String obj = g3Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    callback.run(obj);
                    c2Var.dismiss();
                    return;
                }
                AndroidUtilities.shakeView(g3Var);
                return;
            default:
                k5 k5Var = (k5) this.f1449b;
                ve.d g10 = c2Var.g(i9, true, true);
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                d dVar = new d(23, k5Var, twoStepVerificationActivity);
                twoStepVerificationActivity.V = 2;
                twoStepVerificationActivity.X = dVar;
                twoStepVerificationActivity.W = k5Var.C1();
                g10.d();
                twoStepVerificationActivity.r0(new androidx.car.app.utils.b(k5Var, (bg.g3[]) this.f1450c, g10, twoStepVerificationActivity, 22));
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(Object obj, d5.g gVar) {
        ((i3.b) obj).c((h3.c2) this.f1450c, new g5.b(gVar, ((i3.f) this.f1449b).f10892e));
    }

    @Override
    public void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.f1448a) {
            case 21:
                ((gh.r) this.f1449b).g0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f1450c);
                return;
            default:
                ((k5) this.f1449b).M1(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f1450c);
                return;
        }
    }

    @Override
    public void i(RectF rectF, View view) {
        ((kg.d) this.f1449b).s(rectF.left, rectF.top);
        ((View) this.f1450c).invalidate();
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f1448a) {
            case 26:
                ((i3.b) obj).g((i3.a) this.f1449b, (j4.y) this.f1450c);
                return;
            default:
                ((i3.b) obj).onRenderedFirstFrame((i3.a) this.f1449b);
                return;
        }
    }

    @Override
    public Object j() {
        switch (this.f1448a) {
            case 8:
                Iterable iterable = (Iterable) this.f1450c;
                d3.h hVar = (d3.h) ((d3.d) ((c3.h) this.f1449b).f2302c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + d3.h.g(iterable)).execute();
                    return null;
                }
                return null;
            default:
                c3.h hVar2 = (c3.h) this.f1449b;
                for (Map.Entry entry : ((HashMap) this.f1450c).entrySet()) {
                    ((d3.h) ((d3.c) hVar2.f2306i)).e(((Integer) entry.getValue()).intValue(), z2.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    @Override
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.f1449b).a((Intent) this.f1450c);
    }

    @Override
    public void onFailure(Exception e10) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f1448a) {
            case 7:
                c1.e eVar = (c1.e) this.f1449b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f1450c;
                kotlin.jvm.internal.i.e(e10, "e");
                if ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.f1395b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) {
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
                d1.e eVar2 = (d1.e) this.f1449b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f1450c;
                kotlin.jvm.internal.i.e(e10, "e");
                if ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.f1395b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) {
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
                    Executor executor = eVar2.f4251g;
                    if (executor != null) {
                        executor.execute(new d1.a(eVar2, cVar, 1));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        boolean z11;
        fh.i4 i4Var = (fh.i4) this.f1449b;
        kh.d dVar = (kh.d) this.f1450c;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f10 = (Float) obj4;
        Float f11 = (Float) obj5;
        i4Var.getClass();
        long j10 = ((TL_stars.SavedStarGift) ((l41) obj).G).gift.f22607id;
        if (i4Var.f6519b == j10) {
            i4Var.f6519b = 0L;
        } else {
            i4Var.f6519b = j10;
        }
        if (i4Var.f6519b != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                View childAt = viewGroup.getChildAt(i9);
                if (childAt instanceof ko0) {
                    ko0 ko0Var = (ko0) childAt;
                    if (i4Var.f6519b == ko0Var.getGiftId()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ko0Var.b(z11, true);
                }
            }
        }
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.i iVar = (com.google.firebase.messaging.i) this.f1449b;
        String str = (String) this.f1450c;
        synchronized (iVar) {
            ((a0.f) iVar.f4152b).remove(str);
        }
        return task;
    }

    @Override
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        switch (this.f1448a) {
            case 6:
                p1 p1Var = (p1) this.f1449b;
                String str = (String) this.f1450c;
                long j10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    j10 = ((MessagesStorage.TopicKey) arrayList.get(i11)).dialogId;
                    p1Var.f32410n.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                dyVar.finishFragment();
                bg.u.h(j10);
                return true;
            default:
                cg.e eVar = (cg.e) this.f1449b;
                String str2 = (String) this.f1450c;
                long j11 = 0;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    j11 = ((MessagesStorage.TopicKey) arrayList.get(i12)).dialogId;
                    eVar.f2400e.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(str2, j11, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    i12++;
                    eVar = eVar;
                }
                dyVar.finishFragment();
                bg.u.h(j11);
                return true;
        }
    }

    public d(i3.a aVar, Object obj, long j10) {
        this.f1448a = 27;
        this.f1449b = aVar;
        this.f1450c = obj;
    }

    @Override
    public void g0(View view, float f10, float f11) {
    }
}
