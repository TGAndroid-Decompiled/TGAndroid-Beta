package a1;

import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bg.e0;
import bg.g3;
import bg.h1;
import bg.l2;
import bg.z0;
import ch.k;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.upstream.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.n;
import d5.w;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.p;
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
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.eb0;
import org.telegram.ui.qn;
import v0.i;
import w0.h;
public final class e implements Runnable {
    public final int f40a;
    public final Object f41b;
    public final Object f42c;

    public e(int i9, Object obj, Object obj2) {
        this.f40a = i9;
        this.f41b = obj;
        this.f42c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        switch (this.f40a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((i) this.f41b, (Exception) this.f42c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((i) this.f41b, (p) this.f42c);
                return;
            case 2:
                ze.b bVar = (ze.b) this.f42c;
                if (((AtomicBoolean) ((af.f) this.f41b).f161e).compareAndSet(false, true)) {
                    bVar.a(true);
                    return;
                }
                return;
            case 3:
                ViewGroup container = (ViewGroup) this.f41b;
                kotlin.jvm.internal.i.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 4:
                ((i) this.f41b).onError(this.f42c);
                return;
            case 5:
                ((i) this.f41b).onResult((v0.p) this.f42c);
                return;
            case 6:
                bf.d dVar = (bf.d) this.f41b;
                TLObject tLObject = (TLObject) this.f42c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        dVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList = tL_savedRingtones.ringtones;
                        ArrayList arrayList2 = dVar.f1680e;
                        if (!dVar.f1681f) {
                            dVar.f(false);
                            dVar.f1681f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList2.size();
                        int i9 = 0;
                        while (i9 < size) {
                            Object obj = arrayList2.get(i9);
                            i9++;
                            bf.c cVar = (bf.c) obj;
                            if (cVar.f1673b != null && (document = cVar.f1672a) != null) {
                                hashMap.put(Long.valueOf(document.f22386id), cVar.f1673b);
                            }
                        }
                        arrayList2.clear();
                        SharedPreferences d = dVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList.size());
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            TLRPC.Document document3 = arrayList.get(i10);
                            String str = (String) hashMap.get(Long.valueOf(document3.f22386id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i10, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i10, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f1672a = document3;
                            obj2.f1673b = str;
                            int i11 = dVar.d;
                            dVar.d = i11 + 1;
                            obj2.f1674c = i11;
                            arrayList2.add(obj2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(dVar.f1679c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = dVar.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        bf.d.f1675g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        bf.d.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    dVar.b();
                    return;
                }
                return;
            case 7:
                bf.d dVar2 = (bf.d) this.f41b;
                ArrayList arrayList3 = (ArrayList) this.f42c;
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    bf.c cVar2 = (bf.c) arrayList3.get(i12);
                    if (cVar2 != null && ((TextUtils.isEmpty(cVar2.f1673b) || !new File(cVar2.f1673b).exists()) && (document2 = cVar2.f1672a) != null && ((pathToAttach = FileLoader.getInstance(dVar2.f1679c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new e(8, dVar2, document2));
                    }
                }
                return;
            case 8:
                TLRPC.Document document4 = (TLRPC.Document) this.f42c;
                FileLoader.getInstance(((bf.d) this.f41b).f1679c).loadFile(document4, document4, 0, 0);
                return;
            case 9:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f42c;
                int i13 = ((bf.e) this.f41b).f1682a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i13).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i13).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
            case 10:
                ((l2) this.f41b).run((ArrayList) this.f42c);
                return;
            case 11:
                ((z0) this.f41b).run((TLRPC.TL_error) this.f42c);
                return;
            case 12:
                ((eb0) this.f41b).run((ArrayList) this.f42c);
                return;
            case 13:
                Utilities.Callback callback = (Utilities.Callback) this.f42c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f41b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new e0(callback, smallGroupsParticipantsCount, 0));
                    return;
                }
                return;
            case 14:
                gc M = oc.a0((qn) this.f41b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f42c).stars)), R.raw.stars_send);
                M.f28737j = 5000;
                M.k(true);
                return;
            case 15:
                h1 h1Var = (h1) this.f41b;
                h1Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, h1Var.X, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f42c);
                return;
            case 16:
                g3.O((g3) this.f41b, (TLObject) this.f42c);
                return;
            case 17:
                ((c1.e) this.f41b).e().onError(((p) this.f42c).f16499a);
                return;
            case 18:
                ((c1.e) this.f41b).e().onError((h) this.f42c);
                return;
            case 19:
                ((c1.e) this.f41b).e().onResult((v0.p) this.f42c);
                return;
            case 20:
                int i14 = JobInfoSchedulerService.f2500a;
                ((JobInfoSchedulerService) this.f41b).jobFinished((JobParameters) this.f42c, false);
                return;
            case 21:
                k kVar = (k) this.f41b;
                kVar.f2489b.add((String) this.f42c);
                kVar.invalidate();
                return;
            case 22:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f41b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f42c;
                android.support.v4.media.c cVar3 = FirebaseMessaging.f4095l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 23:
                n nVar = (n) this.f41b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f42c;
                try {
                    taskCompletionSource2.setResult(nVar.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
            case 24:
                v0.f fVar = (v0.f) this.f42c;
                i iVar = ((d1.e) this.f41b).f4250f;
                if (iVar != null) {
                    iVar.onResult(fVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 25:
                ((s) this.f42c).a(((w) this.f41b).g());
                return;
            case 26:
                ((bg.i) this.f41b).run((TLRPC.Chat) this.f42c);
                return;
            case 27:
                ((i) this.f41b).onError((w0.d) this.f42c);
                return;
            case 28:
                ((i) this.f41b).onResult((v0.f) this.f42c);
                return;
            default:
                v0.c cVar4 = (v0.c) this.f42c;
                i iVar2 = ((e1.d) this.f41b).f4799f;
                if (iVar2 != null) {
                    iVar2.onResult(cVar4);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
        }
    }
}
