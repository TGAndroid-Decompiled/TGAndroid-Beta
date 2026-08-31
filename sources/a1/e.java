package a1;

import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Process;
import android.os.StrictMode;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b4.e0;
import c2.p;
import c9.q;
import c9.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.m;
import dg.c1;
import dg.j1;
import dg.m1;
import dg.o1;
import eg.l3;
import eg.o3;
import eg.t2;
import f2.j0;
import fg.t0;
import fg.u0;
import fg.v0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tl0;
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
        q qVar = (q) this.f41b;
        ba.b bVar = (ba.b) this.f42c;
        synchronized (qVar) {
            try {
                if (qVar.f2370b == null) {
                    qVar.f2369a.add(bVar);
                } else {
                    qVar.f2370b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        ba.a aVar;
        int i10;
        TLRPC.Document document;
        switch (this.f40a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.f41b, (Exception) this.f42c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.f41b, (kotlin.jvm.internal.q) this.f42c);
                return;
            case 2:
                ViewGroup container = (ViewGroup) this.f41b;
                j.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 3:
                ((i) this.f41b).onError(this.f42c);
                return;
            case 4:
                ((i) this.f41b).onResult((o) this.f42c);
                return;
            case 5:
                ((c1.f) this.f41b).e().onError(((kotlin.jvm.internal.q) this.f42c).f11340a);
                return;
            case 6:
                ((c1.f) this.f41b).e().onError((h) this.f42c);
                return;
            case 7:
                ((c1.f) this.f41b).e().onResult((o) this.f42c);
                return;
            case 8:
                r rVar = (r) this.f41b;
                ba.b bVar = (ba.b) this.f42c;
                if (rVar.f2373b == r.d) {
                    synchronized (rVar) {
                        aVar = rVar.f2372a;
                        rVar.f2372a = null;
                        rVar.f2373b = bVar;
                    }
                    aVar.f(bVar);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 9:
                a();
                return;
            case 10:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f41b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f42c;
                ja.c cVar = FirebaseMessaging.f4006l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e6) {
                    taskCompletionSource.setException(e6);
                    return;
                }
            case 11:
                m mVar = (m) this.f41b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f42c;
                try {
                    taskCompletionSource2.setResult(mVar.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource2.setException(e10);
                    return;
                }
            case 12:
                v0.f fVar = (v0.f) this.f42c;
                i iVar = ((d1.e) this.f41b).f4155f;
                if (iVar != null) {
                    iVar.onResult(fVar);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 13:
                d9.a aVar2 = (d9.a) this.f41b;
                Runnable runnable = (Runnable) this.f42c;
                Process.setThreadPriority(aVar2.f4348c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 14:
                Callable callable = (Callable) this.f41b;
                d9.i iVar2 = (d9.i) ((y5.h) this.f42c).f50776b;
                try {
                    iVar2.k(callable.call());
                    return;
                } catch (Exception e11) {
                    iVar2.l(e11);
                    return;
                }
            case 15:
                c1 c1Var = (c1) this.f41b;
                c1Var.v = true;
                RectF f10 = c1Var.f();
                Object obj = c1Var.f4451a.f16615b;
                c1Var.f4470w = new e0((ByteBuffer) c1Var.h(c1Var.f(), true, false, false).f1936c, 0, f10);
                c1Var.a(false);
                ((j1) this.f42c).run();
                return;
            case 16:
                Runnable runnable2 = (Runnable) this.f42c;
                m1 m1Var = ((o1) this.f41b).d;
                if (m1Var != null && m1Var.f4609f) {
                    m1.b(m1Var);
                    runnable2.run();
                    return;
                }
                return;
            case 17:
                ((i) this.f41b).onError((w0.d) this.f42c);
                return;
            case 18:
                ((i) this.f41b).onResult((v0.f) this.f42c);
                return;
            case 19:
                v0.c cVar2 = (v0.c) this.f42c;
                i iVar3 = ((e1.d) this.f41b).f4885f;
                if (iVar3 != null) {
                    iVar3.onResult(cVar2);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 20:
                int i11 = JobInfoSchedulerService.f2543a;
                ((JobInfoSchedulerService) this.f41b).jobFinished((JobParameters) this.f42c, false);
                return;
            case 21:
                t2 t2Var = (t2) this.f42c;
                t2Var.m();
                ((eg.c1) this.f41b).r0(t2Var, true);
                return;
            case 22:
                ((t2) this.f41b).s((Bitmap) this.f42c);
                return;
            case 23:
                o3 o3Var = (o3) this.f41b;
                o3Var.D = false;
                l3[] l3VarArr = (l3[]) ((ArrayList) this.f42c).toArray(new l3[0]);
                o3Var.E = l3VarArr;
                if (l3VarArr.length > 0) {
                    o3Var.V.setScaleX(0.3f);
                    o3Var.V.setScaleY(0.3f);
                    o3Var.V.setAlpha(0.0f);
                    o3Var.V.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(pr.f30183f).start();
                    return;
                }
                return;
            case 24:
                ef.b bVar2 = (ef.b) this.f42c;
                if (((AtomicBoolean) ((p) this.f41b).d).compareAndSet(false, true)) {
                    bVar2.a(true);
                    return;
                }
                return;
            case 25:
                v0 v0Var = (v0) this.f41b;
                TLObject tLObject = (TLObject) this.f42c;
                ArrayList arrayList = v0Var.f6586f0;
                tl0 tl0Var = v0Var.d;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    v0Var.F0 = false;
                    v0Var.G0.b(v0Var.f6591k0 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 < tl0Var.getChildCount()) {
                            if (tl0Var.getChildAt(i12) instanceof u0) {
                                i10 = tl0Var.getChildAt(i12).getTop();
                            } else {
                                i12++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    v0Var.M1();
                    if (v0Var.f6589i0 >= 0 && i10 != 0) {
                        ((j0) tl0Var.getLayoutManager()).h1(v0Var.f6589i0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), v0Var.J0.f848b);
                v0Var.f6600u0.g(max, false);
                v0Var.f6600u0.setBagePosition(max / v0Var.J0.f849c);
                t0 t0Var = v0Var.f6600u0;
                t0Var.E = true;
                t0Var.requestLayout();
                return;
            case 26:
                ((v0) this.f41b).m1((j90) this.f42c, true);
                return;
            case 27:
                fg.t2 t2Var2 = (fg.t2) this.f41b;
                AndroidUtilities.runOnUIThread(new e(28, t2Var2, FileLoader.getInstance(t2Var2.f6564s).getPathToAttach((TLRPC.Document) this.f42c)));
                return;
            case 28:
                fg.t2 t2Var3 = (fg.t2) this.f41b;
                t2Var3.f6560e = (File) this.f42c;
                t2Var3.a();
                return;
            default:
                gf.e eVar = (gf.e) this.f41b;
                TLObject tLObject2 = (TLObject) this.f42c;
                if (tLObject2 != null) {
                    if (tLObject2 instanceof TL_account.TL_savedRingtonesNotModified) {
                        eVar.f(true);
                    } else if (tLObject2 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject2;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = eVar.f7041e;
                        if (!eVar.f7042f) {
                            eVar.f(false);
                            eVar.f7042f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList3.get(i13);
                            i13++;
                            gf.d dVar = (gf.d) obj2;
                            if (dVar.f7034b != null && (document = dVar.f7033a) != null) {
                                hashMap.put(Long.valueOf(document.f20849id), dVar.f7034b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = eVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC.Document document2 = arrayList2.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document2.f20849id));
                            SerializedData serializedData = new SerializedData(document2.getObjectSize());
                            document2.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            ?? obj3 = new Object();
                            obj3.f7033a = document2;
                            obj3.f7034b = str;
                            int i15 = eVar.d;
                            eVar.d = i15 + 1;
                            obj3.f7035c = i15;
                            arrayList3.add(obj3);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(eVar.f7040c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = eVar.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        gf.e.f7036g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        gf.e.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
