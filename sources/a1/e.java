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
import c9.r;
import c9.s;
import cg.d1;
import cg.k1;
import cg.n1;
import cg.p1;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.m;
import dg.e1;
import dg.n3;
import dg.q3;
import dg.v2;
import eg.t0;
import eg.u0;
import eg.u2;
import eg.v0;
import f2.i0;
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
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rl0;
import v0.i;
import v0.o;
import w0.h;
public final class e implements Runnable {
    public final int f36a;
    public final Object f37b;
    public final Object f38c;

    public e(int i10, Object obj, Object obj2) {
        this.f36a = i10;
        this.f37b = obj;
        this.f38c = obj2;
    }

    private final void a() {
        r rVar = (r) this.f37b;
        ba.b bVar = (ba.b) this.f38c;
        synchronized (rVar) {
            try {
                if (rVar.f2204b == null) {
                    rVar.f2203a.add(bVar);
                } else {
                    rVar.f2204b.add(bVar.get());
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
        switch (this.f36a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.f37b, (Exception) this.f38c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.f37b, (q) this.f38c);
                return;
            case 2:
                ViewGroup container = (ViewGroup) this.f37b;
                j.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 3:
                ((i) this.f37b).onError(this.f38c);
                return;
            case 4:
                ((i) this.f37b).onResult((o) this.f38c);
                return;
            case 5:
                ((c1.f) this.f37b).e().onError(((q) this.f38c).f11100a);
                return;
            case 6:
                ((c1.f) this.f37b).e().onError((h) this.f38c);
                return;
            case 7:
                ((c1.f) this.f37b).e().onResult((o) this.f38c);
                return;
            case 8:
                s sVar = (s) this.f37b;
                ba.b bVar = (ba.b) this.f38c;
                if (sVar.f2207b == s.d) {
                    synchronized (sVar) {
                        aVar = sVar.f2206a;
                        sVar.f2206a = null;
                        sVar.f2207b = bVar;
                    }
                    aVar.f(bVar);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 9:
                a();
                return;
            case 10:
                d1 d1Var = (d1) this.f37b;
                d1Var.v = true;
                RectF f10 = d1Var.f();
                Object obj = d1Var.f2317a.f16439b;
                d1Var.f2335w = new e0((ByteBuffer) d1Var.h(d1Var.f(), true, false, false).f157c, 0, f10);
                d1Var.a(false);
                ((k1) this.f38c).run();
                return;
            case 11:
                Runnable runnable = (Runnable) this.f38c;
                n1 n1Var = ((p1) this.f37b).d;
                if (n1Var != null && n1Var.f2462f) {
                    n1.b(n1Var);
                    runnable.run();
                    return;
                }
                return;
            case 12:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f37b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f38c;
                ja.c cVar = FirebaseMessaging.f3942l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 13:
                m mVar = (m) this.f37b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f38c;
                try {
                    taskCompletionSource2.setResult(mVar.a());
                    return;
                } catch (Exception e6) {
                    taskCompletionSource2.setException(e6);
                    return;
                }
            case 14:
                v0.f fVar = (v0.f) this.f38c;
                i iVar = ((d1.e) this.f37b).f4076f;
                if (iVar != null) {
                    iVar.onResult(fVar);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 15:
                d9.a aVar2 = (d9.a) this.f37b;
                Runnable runnable2 = (Runnable) this.f38c;
                Process.setThreadPriority(aVar2.f4252c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 16:
                Callable callable = (Callable) this.f37b;
                d9.i iVar2 = (d9.i) ((androidx.biometric.e0) this.f38c).f476b;
                try {
                    iVar2.k(callable.call());
                    return;
                } catch (Exception e10) {
                    iVar2.l(e10);
                    return;
                }
            case 17:
                v2 v2Var = (v2) this.f38c;
                v2Var.m();
                ((e1) this.f37b).r0(v2Var, true);
                return;
            case 18:
                ((v2) this.f37b).s((Bitmap) this.f38c);
                return;
            case 19:
                q3 q3Var = (q3) this.f37b;
                q3Var.D = false;
                n3[] n3VarArr = (n3[]) ((ArrayList) this.f38c).toArray(new n3[0]);
                q3Var.E = n3VarArr;
                if (n3VarArr.length > 0) {
                    q3Var.V.setScaleX(0.3f);
                    q3Var.V.setScaleY(0.3f);
                    q3Var.V.setAlpha(0.0f);
                    q3Var.V.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(mr.f27122f).start();
                    return;
                }
                return;
            case 20:
                ((i) this.f37b).onError((w0.d) this.f38c);
                return;
            case 21:
                ((i) this.f37b).onResult((v0.f) this.f38c);
                return;
            case 22:
                v0.c cVar2 = (v0.c) this.f38c;
                i iVar3 = ((e1.d) this.f37b).f5057f;
                if (iVar3 != null) {
                    iVar3.onResult(cVar2);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
            case 23:
                int i11 = JobInfoSchedulerService.f2607a;
                ((JobInfoSchedulerService) this.f37b).jobFinished((JobParameters) this.f38c, false);
                return;
            case 24:
                df.b bVar2 = (df.b) this.f38c;
                if (((AtomicBoolean) ((p) this.f37b).d).compareAndSet(false, true)) {
                    bVar2.a(true);
                    return;
                }
                return;
            case 25:
                v0 v0Var = (v0) this.f37b;
                TLObject tLObject = (TLObject) this.f38c;
                ArrayList arrayList = v0Var.f5528f0;
                rl0 rl0Var = v0Var.d;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    v0Var.F0 = false;
                    v0Var.G0.b(v0Var.f5533k0 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 < rl0Var.getChildCount()) {
                            if (rl0Var.getChildAt(i12) instanceof u0) {
                                i10 = rl0Var.getChildAt(i12).getTop();
                            } else {
                                i12++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    v0Var.M1();
                    if (v0Var.f5531i0 >= 0 && i10 != 0) {
                        ((i0) rl0Var.getLayoutManager()).h1(v0Var.f5531i0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), v0Var.J0.f792b);
                v0Var.f5542u0.g(max, false);
                v0Var.f5542u0.setBagePosition(max / v0Var.J0.f793c);
                t0 t0Var = v0Var.f5542u0;
                t0Var.E = true;
                t0Var.requestLayout();
                return;
            case 26:
                ((v0) this.f37b).m1((i90) this.f38c, true);
                return;
            case 27:
                u2 u2Var = (u2) this.f37b;
                AndroidUtilities.runOnUIThread(new e(28, u2Var, FileLoader.getInstance(u2Var.f5515s).getPathToAttach((TLRPC.Document) this.f38c)));
                return;
            case 28:
                u2 u2Var2 = (u2) this.f37b;
                u2Var2.e = (File) this.f38c;
                u2Var2.a();
                return;
            default:
                ff.e eVar = (ff.e) this.f37b;
                TLObject tLObject2 = (TLObject) this.f38c;
                if (tLObject2 != null) {
                    if (tLObject2 instanceof TL_account.TL_savedRingtonesNotModified) {
                        eVar.f(true);
                    } else if (tLObject2 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject2;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = eVar.e;
                        if (!eVar.f6113f) {
                            eVar.f(false);
                            eVar.f6113f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList3.get(i13);
                            i13++;
                            ff.d dVar = (ff.d) obj2;
                            if (dVar.f6106b != null && (document = dVar.f6105a) != null) {
                                hashMap.put(Long.valueOf(document.f19165id), dVar.f6106b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = eVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC.Document document2 = arrayList2.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document2.f19165id));
                            SerializedData serializedData = new SerializedData(document2.getObjectSize());
                            document2.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            ?? obj3 = new Object();
                            obj3.f6105a = document2;
                            obj3.f6106b = str;
                            int i15 = eVar.d;
                            eVar.d = i15 + 1;
                            obj3.f6107c = i15;
                            arrayList3.add(obj3);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(eVar.f6112c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = eVar.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        ff.e.f6108g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        ff.e.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    eVar.b();
                    return;
                }
                return;
        }
    }
}
