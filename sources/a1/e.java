package a1;

import a9.k;
import ag.f1;
import ag.g1;
import ag.i1;
import ag.p3;
import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import cg.b0;
import cg.d1;
import cg.e2;
import cg.v0;
import cg.y2;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.n;
import f2.k0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ib0;
import org.telegram.ui.rn;
import v0.i;
import v0.p;
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

    @Override
    public final void run() {
        int top;
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        switch (this.f40a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.f41b, (Exception) this.f42c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.f41b, (q) this.f42c);
                return;
            case 2:
                a9.a aVar = (a9.a) this.f41b;
                Runnable runnable = (Runnable) this.f42c;
                Process.setThreadPriority(aVar.f159c);
                StrictMode.ThreadPolicy threadPolicy = aVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 3:
                Callable callable = (Callable) this.f41b;
                k kVar = (k) ((a9.i) this.f42c).f181b;
                try {
                    kVar.k(callable.call());
                    return;
                } catch (Exception e9) {
                    kVar.l(e9);
                    return;
                }
            case 4:
                i1 i1Var = (i1) this.f41b;
                TLObject tLObject = (TLObject) this.f42c;
                ArrayList arrayList = i1Var.f433e0;
                zk0 zk0Var = i1Var.d;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    i1Var.E0 = false;
                    i1Var.F0.b(i1Var.f438j0 + 4);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= zk0Var.getChildCount()) {
                            top = 0;
                        } else if (zk0Var.getChildAt(i10) instanceof g1) {
                            top = zk0Var.getChildAt(i10).getTop();
                        } else {
                            i10++;
                        }
                    }
                    i1Var.M1();
                    if (i1Var.f436h0 >= 0 && top != 0) {
                        ((k0) zk0Var.getLayoutManager()).h1(i1Var.f436h0 + 1, top);
                    }
                }
                int iMax = Math.max(arrayList.size(), i1Var.I0.f412b);
                i1Var.f447t0.g(iMax, false);
                i1Var.f447t0.setBagePosition(iMax / i1Var.I0.f413c);
                f1 f1Var = i1Var.f447t0;
                f1Var.D = true;
                f1Var.requestLayout();
                return;
            case 5:
                ((i1) this.f41b).m1((s80) this.f42c, true);
                return;
            case 6:
                p3 p3Var = (p3) this.f41b;
                AndroidUtilities.runOnUIThread(new e(7, p3Var, FileLoader.getInstance(p3Var.f605s).getPathToAttach((TLRPC.Document) this.f42c)));
                return;
            case 7:
                p3 p3Var2 = (p3) this.f41b;
                p3Var2.f601e = (File) this.f42c;
                p3Var2.a();
                return;
            case 8:
                ViewGroup container = (ViewGroup) this.f41b;
                j.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 9:
                ((i) this.f41b).onError(this.f42c);
                return;
            case 10:
                ((i) this.f41b).onResult((p) this.f42c);
                return;
            case 11:
                bf.e eVar = (bf.e) this.f41b;
                af.b bVar = (af.b) this.f42c;
                if (((AtomicBoolean) eVar.f2087e).compareAndSet(false, true)) {
                    bVar.a(true);
                    return;
                }
                return;
            case 12:
                ((c1.e) this.f41b).e().onError(((q) this.f42c).f15253a);
                return;
            case 13:
                ((c1.e) this.f41b).e().onError((h) this.f42c);
                return;
            case 14:
                ((c1.e) this.f41b).e().onResult((p) this.f42c);
                return;
            case 15:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f41b;
                JobParameters jobParameters = (JobParameters) this.f42c;
                int i11 = JobInfoSchedulerService.f2937a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 16:
                cf.d dVar = (cf.d) this.f41b;
                TLObject tLObject2 = (TLObject) this.f42c;
                if (tLObject2 != null) {
                    if (tLObject2 instanceof TL_account.TL_savedRingtonesNotModified) {
                        dVar.f(true);
                    } else if (tLObject2 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject2;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = dVar.f2584e;
                        if (!dVar.f2585f) {
                            dVar.f(false);
                            dVar.f2585f = true;
                        }
                        HashMap map = new HashMap();
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            i12++;
                            cf.c cVar = (cf.c) obj;
                            if (cVar.f2577b != null && (document = cVar.f2576a) != null) {
                                map.put(Long.valueOf(document.f22386id), cVar.f2577b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences sharedPreferencesD = dVar.d();
                        sharedPreferencesD.edit().clear().apply();
                        SharedPreferences.Editor editorEdit = sharedPreferencesD.edit();
                        editorEdit.putInt("count", arrayList2.size());
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            TLRPC.Document document3 = arrayList2.get(i13);
                            String str = (String) map.get(Long.valueOf(document3.f22386id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            editorEdit.putString("tone_document" + i13, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                editorEdit.putString("tone_local_path" + i13, str);
                            }
                            cf.c cVar2 = new cf.c();
                            cVar2.f2576a = document3;
                            cVar2.f2577b = str;
                            int i14 = dVar.d;
                            dVar.d = i14 + 1;
                            cVar2.f2578c = i14;
                            arrayList3.add(cVar2);
                        }
                        editorEdit.apply();
                        NotificationCenter.getInstance(dVar.f2583c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor editorEdit2 = dVar.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        cf.d.f2579g = j10;
                        SharedPreferences.Editor editorPutLong = editorEdit2.putLong("hash", j10);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        cf.d.h = jCurrentTimeMillis;
                        editorPutLong.putLong("lastReload", jCurrentTimeMillis).apply();
                    }
                    dVar.b();
                    return;
                }
                return;
            case 17:
                cf.d dVar2 = (cf.d) this.f41b;
                ArrayList arrayList4 = (ArrayList) this.f42c;
                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                    cf.c cVar3 = (cf.c) arrayList4.get(i15);
                    if (cVar3 != null && ((TextUtils.isEmpty(cVar3.f2577b) || !new File(cVar3.f2577b).exists()) && (document2 = cVar3.f2576a) != null && ((pathToAttach = FileLoader.getInstance(dVar2.f2583c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new e(18, dVar2, document2));
                    }
                }
                return;
            case 18:
                cf.d dVar3 = (cf.d) this.f41b;
                TLRPC.Document document4 = (TLRPC.Document) this.f42c;
                FileLoader.getInstance(dVar3.f2583c).loadFile(document4, document4, 0, 0);
                return;
            case 19:
                cf.e eVar2 = (cf.e) this.f41b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f42c;
                int i16 = eVar2.f2586a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i16).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i16).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
            case 20:
                ((e2) this.f41b).run((ArrayList) this.f42c);
                return;
            case 21:
                ((v0) this.f41b).run((TLRPC.TL_error) this.f42c);
                return;
            case 22:
                ((ib0) this.f41b).run((ArrayList) this.f42c);
                return;
            case 23:
                MessagesStorage messagesStorage = (MessagesStorage) this.f41b;
                Utilities.Callback callback = (Utilities.Callback) this.f42c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = messagesStorage.getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new b0(callback, smallGroupsParticipantsCount, 0));
                return;
            case 24:
                ec ecVarM = mc.a0((rn) this.f41b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f42c).stars)), R.raw.stars_send);
                ecVarM.f28020j = 5000;
                ecVarM.k(true);
                return;
            case 25:
                d1 d1Var = (d1) this.f41b;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.f42c;
                d1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, d1Var.X, Boolean.TRUE, prepaidGiveaway);
                return;
            case 26:
                y2.P((y2) this.f41b, (TLObject) this.f42c);
                return;
            case 27:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f41b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f42c;
                ga.c cVar4 = FirebaseMessaging.f4537l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 28:
                n nVar = (n) this.f41b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f42c;
                try {
                    taskCompletionSource2.setResult(nVar.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
            default:
                d1.e eVar3 = (d1.e) this.f41b;
                v0.f fVar = (v0.f) this.f42c;
                i iVar = eVar3.f4692f;
                if (iVar != null) {
                    iVar.onResult(fVar);
                    return;
                } else {
                    j.h("callback");
                    throw null;
                }
        }
    }
}
