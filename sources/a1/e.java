package a1;

import a9.r;
import a9.t;
import ag.f1;
import ag.j2;
import ag.m1;
import ag.r1;
import ag.t1;
import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Process;
import android.os.StrictMode;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bg.g1;
import bg.r3;
import bg.u3;
import bg.y2;
import c2.p;
import cg.t0;
import cg.u0;
import cg.v0;
import cg.w2;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.u;
import f2.j0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import v0.i;
import v0.o;
import w0.h;
public final class e implements Runnable {
    public final int f40a;
    public final Object f41b;
    public final Object f42c;

    public e(int i10, Object obj, Object obj2) {
        this.f40a = i10;
        this.f41b = obj;
        this.f42c = obj2;
    }

    private final void a() {
        r rVar = (r) this.f41b;
        z9.b bVar = (z9.b) this.f42c;
        synchronized (rVar) {
            try {
                if (rVar.f267b == null) {
                    rVar.f266a.add(bVar);
                } else {
                    rVar.f267b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        z9.a aVar;
        int i10;
        TLRPC.Document document;
        switch (this.f40a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.f41b, (Exception) this.f42c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.f41b, (q) this.f42c);
                return;
            case 2:
                t tVar = (t) this.f41b;
                z9.b bVar = (z9.b) this.f42c;
                if (tVar.f273b == t.d) {
                    synchronized (tVar) {
                        aVar = tVar.f272a;
                        tVar.f272a = null;
                        tVar.f273b = bVar;
                    }
                    aVar.j(bVar);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 3:
                a();
                return;
            case 4:
                f1 f1Var = (f1) this.f41b;
                f1Var.v = true;
                RectF f9 = f1Var.f();
                Object obj = f1Var.f469a.f624b;
                f1Var.f488w = new j2((ByteBuffer) f1Var.h(f1Var.f(), true, false, false).f50825b, 0, f9);
                f1Var.a(false);
                ((m1) this.f42c).run();
                return;
            case 5:
                Runnable runnable = (Runnable) this.f42c;
                r1 r1Var = ((t1) this.f41b).d;
                if (r1Var != null && r1Var.f644f) {
                    r1.b(r1Var);
                    runnable.run();
                    return;
                }
                return;
            case 6:
                ViewGroup container = (ViewGroup) this.f41b;
                j.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 7:
                ((i) this.f41b).onError(this.f42c);
                return;
            case 8:
                ((i) this.f41b).onResult((o) this.f42c);
                return;
            case 9:
                b9.a aVar2 = (b9.a) this.f41b;
                Runnable runnable2 = (Runnable) this.f42c;
                Process.setThreadPriority(aVar2.f1993c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 10:
                Callable callable = (Callable) this.f41b;
                b9.j jVar = (b9.j) ((ha.c) this.f42c).f7981b;
                try {
                    jVar.k(callable.call());
                    return;
                } catch (Exception e10) {
                    jVar.l(e10);
                    return;
                }
            case 11:
                y2 y2Var = (y2) this.f42c;
                y2Var.m();
                ((g1) this.f41b).r0(y2Var, true);
                return;
            case 12:
                ((y2) this.f41b).s((Bitmap) this.f42c);
                return;
            case 13:
                u3 u3Var = (u3) this.f41b;
                u3Var.C = false;
                r3[] r3VarArr = (r3[]) ((ArrayList) this.f42c).toArray(new r3[0]);
                u3Var.D = r3VarArr;
                if (r3VarArr.length > 0) {
                    u3Var.U.setScaleX(0.3f);
                    u3Var.U.setScaleY(0.3f);
                    u3Var.U.setAlpha(0.0f);
                    u3Var.U.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(jr.f29800f).start();
                    return;
                }
                return;
            case 14:
                ((c1.e) this.f41b).e().onError(((q) this.f42c).f13927a);
                return;
            case 15:
                ((c1.e) this.f41b).e().onError((h) this.f42c);
                return;
            case 16:
                ((c1.e) this.f41b).e().onResult((o) this.f42c);
                return;
            case 17:
                v0 v0Var = (v0) this.f41b;
                TLObject tLObject = (TLObject) this.f42c;
                ArrayList arrayList = v0Var.f3405e0;
                jl0 jl0Var = v0Var.d;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    v0Var.E0 = false;
                    v0Var.F0.b(v0Var.f3410j0 + 4);
                    int i11 = 0;
                    while (true) {
                        if (i11 < jl0Var.getChildCount()) {
                            if (jl0Var.getChildAt(i11) instanceof u0) {
                                i10 = jl0Var.getChildAt(i11).getTop();
                            } else {
                                i11++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    v0Var.M1();
                    if (v0Var.f3408h0 >= 0 && i10 != 0) {
                        ((j0) jl0Var.getLayoutManager()).h1(v0Var.f3408h0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), v0Var.I0.f1366b);
                v0Var.f3419t0.g(max, false);
                v0Var.f3419t0.setBagePosition(max / v0Var.I0.f1367c);
                t0 t0Var = v0Var.f3419t0;
                t0Var.D = true;
                t0Var.requestLayout();
                return;
            case 18:
                ((v0) this.f41b).m1((b90) this.f42c, true);
                return;
            case 19:
                w2 w2Var = (w2) this.f41b;
                AndroidUtilities.runOnUIThread(new e(20, w2Var, FileLoader.getInstance(w2Var.f3452s).getPathToAttach((TLRPC.Document) this.f42c)));
                return;
            case 20:
                w2 w2Var2 = (w2) this.f41b;
                w2Var2.f3448e = (File) this.f42c;
                w2Var2.a();
                return;
            case 21:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f41b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f42c;
                u uVar = FirebaseMessaging.f5109l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
            case 22:
                m mVar = (m) this.f41b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f42c;
                try {
                    taskCompletionSource2.setResult(mVar.a());
                    return;
                } catch (Exception e12) {
                    taskCompletionSource2.setException(e12);
                    return;
                }
            case 23:
                v0.f fVar = (v0.f) this.f42c;
                i iVar = ((d1.e) this.f41b).f5259f;
                if (iVar != null) {
                    iVar.onResult(fVar);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 24:
                cf.b bVar2 = (cf.b) this.f42c;
                if (((AtomicBoolean) ((p) this.f41b).d).compareAndSet(false, true)) {
                    bVar2.a(true);
                    return;
                }
                return;
            case 25:
                ((i) this.f41b).onError((w0.d) this.f42c);
                return;
            case 26:
                ((i) this.f41b).onResult((v0.f) this.f42c);
                return;
            case 27:
                v0.c cVar = (v0.c) this.f42c;
                i iVar2 = ((e1.d) this.f41b).f5769f;
                if (iVar2 != null) {
                    iVar2.onResult(cVar);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 28:
                int i12 = JobInfoSchedulerService.f3514a;
                ((JobInfoSchedulerService) this.f41b).jobFinished((JobParameters) this.f42c, false);
                return;
            default:
                ef.e eVar = (ef.e) this.f41b;
                TLObject tLObject2 = (TLObject) this.f42c;
                if (tLObject2 != null) {
                    if (tLObject2 instanceof TL_account.TL_savedRingtonesNotModified) {
                        eVar.f(true);
                    } else if (tLObject2 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject2;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = eVar.f5901e;
                        if (!eVar.f5902f) {
                            eVar.f(false);
                            eVar.f5902f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList3.get(i13);
                            i13++;
                            ef.d dVar = (ef.d) obj2;
                            if (dVar.f5894b != null && (document = dVar.f5893a) != null) {
                                hashMap.put(Long.valueOf(document.f22398id), dVar.f5894b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = eVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC.Document document2 = arrayList2.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document2.f22398id));
                            SerializedData serializedData = new SerializedData(document2.getObjectSize());
                            document2.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            ?? obj3 = new Object();
                            obj3.f5893a = document2;
                            obj3.f5894b = str;
                            int i15 = eVar.d;
                            eVar.d = i15 + 1;
                            obj3.f5895c = i15;
                            arrayList3.add(obj3);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(eVar.f5900c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = eVar.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        ef.e.f5896g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        ef.e.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
