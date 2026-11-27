package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.p;
import org.webrtc.AddIceObserver;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.StatsObserver;
public final class fu2 implements fd, Continuation, OnFailureListener, sgb, id3, scc, pn3, is6, SuccessContinuation, s69, nx, ot2, NativeLifecycleLock.NativeCallable, NativeLifecycleLock.NativeRunnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public fu2(a33 a33Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var) {
        this.a = (byte) 2;
        this.b = cancellationSignal;
        this.c = executor;
        this.d = h23Var;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final void a(long j, long j2) {
        nm3 nm3Var = (nm3) this.c;
        long[] jArr = (long[]) this.d;
        long[] jArr2 = (long[]) DictationAsr.h.get((String) this.b);
        if (jArr2 != null) {
            jArr2[0] = j;
            if (j2 > 0) {
                jArr2[1] = j2;
            }
        }
        if (j2 > 0) {
            if (nm3Var != null) {
                nm3Var.k = Math.min(1.0f, ((float) j) / ((float) j2));
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - jArr[0] > 100) {
                jArr[0] = elapsedRealtime;
                DictationAsr.o();
            }
        }
    }

    @Override
    public final void accept(Object obj) {
        ((zz6) obj).k(((lp) this.b).b, (vz6) this.c, (jt6) this.d);
    }

    @Override
    public final x76 apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 16:
                yx6 yx6Var = (yx6) obj4;
                Handler handler = yx6Var.l;
                mn6 mn6Var = new mn6(yx6Var, (xw6) obj3, new yg6(yx6Var, (hz6) obj2, (yw6) obj, (byte) 12));
                gaa gaaVar = new gaa(0);
                String str = gcc.a;
                ?? obj5 = new Object();
                gcc.X(handler, new b6c(obj5, mn6Var, gaaVar, (byte) 3));
                return obj5;
            default:
                yx6 yx6Var2 = (yx6) obj4;
                xw6 xw6Var = (xw6) obj3;
                Handler handler2 = yx6Var2.l;
                mn6 mn6Var2 = new mn6(yx6Var2, xw6Var, new oy6(yx6Var2, (nz6) obj2, xw6Var, (List) obj, (byte) 1));
                gaa gaaVar2 = new gaa(0);
                String str2 = gcc.a;
                ?? obj6 = new Object();
                gcc.X(handler2, new b6c(obj6, mn6Var2, gaaVar2, (byte) 3));
                return obj6;
        }
    }

    @Override
    public final void b(String str, ArrayList arrayList) {
        int i;
        int i2;
        ArrayList<TLRPC.Document> arrayList2;
        int i3;
        ArrayList arrayList3;
        boolean z;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        byte b = this.a;
        int i4 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 8:
                nw3 nw3Var = (nw3) obj3;
                ls6 ls6Var = (ls6) obj;
                ArrayList arrayList6 = nw3Var.h;
                SparseIntArray sparseIntArray = nw3Var.E;
                ArrayList arrayList7 = nw3Var.n;
                ow3 ow3Var = nw3Var.O;
                ArrayList arrayList8 = nw3Var.w;
                HashSet hashSet = nw3Var.M;
                ArrayList arrayList9 = nw3Var.s;
                if (TextUtils.equals((String) obj2, nw3Var.I)) {
                    ArrayList j = pv3.j(nw3Var.I, null);
                    for (int i5 = 0; i5 < j.size(); i5++) {
                        try {
                            ?? obj4 = new Object();
                            obj4.a = ((nv3) j.get(i5)).c.toString();
                            arrayList5.add(obj4);
                        } catch (Exception unused) {
                        }
                    }
                    nw3Var.y = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    sparseIntArray.clear();
                    arrayList7.clear();
                    int i6 = 1;
                    nw3Var.y++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (ow3Var.a == 0) {
                        hashSet.clear();
                        for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                            hs6 hs6Var = (hs6) arrayList5.get(i7);
                            String str2 = hs6Var.a;
                            if (str2 != null && !str2.startsWith("animated_") && (arrayList4 = (ArrayList) nw3Var.d.get(hs6Var.a)) != null) {
                                hashSet.addAll(arrayList4);
                            }
                        }
                        arrayList8.addAll(hashSet);
                        for (int i8 = 0; i8 < hashSet.size(); i8++) {
                            arrayList9.add(null);
                        }
                        nw3Var.y = hashSet.size() + nw3Var.y;
                        i = 0;
                        i2 = 1;
                    } else {
                        HashMap hashMap = ls6Var.e0;
                        int i9 = 0;
                        while (i9 < arrayList5.size()) {
                            hs6 hs6Var2 = (hs6) arrayList5.get(i9);
                            int i10 = i4;
                            String str3 = hs6Var2.a;
                            if (str3 != null && !str3.startsWith("animated_") && (arrayList3 = (ArrayList) hashMap.get(hs6Var2.a)) != null && !arrayList3.isEmpty()) {
                                i3 = i6;
                                for (int i11 = i10; i11 < arrayList3.size(); i11++) {
                                    TLRPC.Document document = (TLRPC.Document) arrayList3.get(i11);
                                    if (document != null && !arrayList9.contains(document)) {
                                        arrayList9.add(document);
                                        nw3Var.y++;
                                    }
                                }
                            } else {
                                i3 = i6;
                            }
                            i9++;
                            i6 = i3;
                            i4 = i10;
                        }
                        i = i4;
                        i2 = i6;
                        ArrayList arrayList10 = ls6Var.t0[i];
                        int i12 = i;
                        while (i12 < arrayList5.size()) {
                            hs6 hs6Var3 = (hs6) arrayList5.get(i12);
                            String str4 = hs6Var3.a;
                            if (str4 != null && !str4.startsWith("animated_")) {
                                for (int i13 = i; i13 < arrayList10.size(); i13++) {
                                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList10.get(i13);
                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                        arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                    } else if (!stickerSetCovered.covers.isEmpty()) {
                                        arrayList2 = stickerSetCovered.covers;
                                    } else if (stickerSetCovered.cover != null) {
                                        ArrayList<TLRPC.Document> arrayList11 = new ArrayList<>();
                                        arrayList11.add(stickerSetCovered.cover);
                                        arrayList2 = arrayList11;
                                    }
                                    for (int i14 = i; i14 < arrayList2.size(); i14++) {
                                        String V = r47.V(arrayList2.get(i14), null, null);
                                        if (V != null && V.contains(hs6Var3.a)) {
                                            arrayList9.add(arrayList2.get(i14));
                                            nw3Var.y++;
                                        }
                                    }
                                }
                            }
                            i12++;
                            arrayList5 = arrayList;
                        }
                    }
                    String I3 = hl.I3((nw3Var.I + "").toLowerCase());
                    for (int i15 = i; i15 < arrayList6.size(); i15++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i15);
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            String I32 = hl.I3((tL_messages_stickerSet.set.title + "").toLowerCase());
                            if (I32.startsWith(I3) || I32.contains(" ".concat(I3))) {
                                int size = arrayList7.size();
                                arrayList7.add(tL_messages_stickerSet);
                                sparseIntArray.put(nw3Var.y, size);
                                arrayList9.add(null);
                                nw3Var.y++;
                                arrayList9.addAll(tL_messages_stickerSet.documents);
                                nw3Var.y = tL_messages_stickerSet.documents.size() + nw3Var.y;
                            }
                        }
                    }
                    int i16 = i2;
                    if (arrayList8.size() <= i16 && arrayList9.size() <= i16) {
                        z = i16;
                    } else {
                        z = i;
                    }
                    nw3Var.x = z;
                    if (z != 0) {
                        nw3Var.y += i16;
                    } else {
                        nw3Var.L += i16;
                    }
                    nw3Var.J = nw3Var.I;
                    nw3Var.f();
                    dw3 dw3Var = ow3Var.b;
                    int i17 = dw3.q3;
                    boolean z2 = i;
                    dw3Var.A1(z2 ? 1 : 0, z2 ? 1 : 0);
                    ow3Var.f.c(z2);
                    ow3Var.e.n(z2);
                    return;
                }
                return;
            case 9:
                Runnable runnable = (Runnable) obj;
                o14 o14Var = ((n14) obj3).a;
                if (((String) obj2).equals(o14Var.w)) {
                    o14Var.x = str;
                    o14Var.n.addAll(arrayList5);
                    runnable.run();
                    return;
                }
                return;
            default:
                i24 i24Var = (i24) obj3;
                HashMap hashMap2 = (HashMap) obj2;
                Runnable runnable2 = (Runnable) obj;
                HashMap hashMap3 = i24Var.f;
                if (i24Var.x.N == i24Var.b) {
                    int size2 = arrayList5.size();
                    while (i4 < size2) {
                        String str5 = ((hs6) arrayList5.get(i4)).a;
                        ArrayList arrayList12 = (ArrayList) hashMap2.get(str5);
                        if (arrayList12 != null && !arrayList12.isEmpty() && !hashMap3.containsKey(arrayList12)) {
                            hashMap3.put(arrayList12, str5);
                            i24Var.h.add(arrayList12);
                        }
                        i4++;
                    }
                    runnable2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i, TLObject tLObject) {
        me3 me3Var = (me3) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        long d = wf3.d(tLObject);
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            uc7.s1(me3Var.a).f0(-me3Var.T1.id, ((Integer) arrayList.get(i3)).intValue(), d);
        }
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj = arrayList2.get(i2);
            i2++;
            uc7.s1(me3Var.a).f0(me3Var.X1, ((Integer) obj).intValue(), d);
        }
    }

    @Override
    public final Object call() {
        DataChannel lambda$createDataChannel$3;
        RtpTransceiver lambda$addTransceiver$29;
        Boolean lambda$getStats$32;
        RtpSender lambda$addTrack$25;
        RtpTransceiver lambda$addTransceiver$30;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        PeerConnection peerConnection = (PeerConnection) this.b;
        switch (b) {
            case 22:
                lambda$createDataChannel$3 = peerConnection.lambda$createDataChannel$3((String) obj2, (DataChannel.Init) obj);
                return lambda$createDataChannel$3;
            case 23:
            case 24:
            case 27:
            default:
                lambda$addTransceiver$30 = peerConnection.lambda$addTransceiver$30((MediaStreamTrack.MediaType) obj2, (RtpTransceiver.RtpTransceiverInit) obj);
                return lambda$addTransceiver$30;
            case 25:
                lambda$addTransceiver$29 = peerConnection.lambda$addTransceiver$29((MediaStreamTrack) obj2, (RtpTransceiver.RtpTransceiverInit) obj);
                return lambda$addTransceiver$29;
            case 26:
                lambda$getStats$32 = peerConnection.lambda$getStats$32((MediaStreamTrack) obj2, (StatsObserver) obj);
                return lambda$getStats$32;
            case 28:
                lambda$addTrack$25 = peerConnection.lambda$addTrack$25((MediaStreamTrack) obj2, (List) obj);
                return lambda$addTrack$25;
        }
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        ((j95) this.b).k1((LaunchActivity) this.c, (vc2) this.d, view, i);
    }

    public final boolean e(TLRPC.Message message) {
        p pVar = (p) this.b;
        wk5 wk5Var = (wk5) this.c;
        Activity activity = (Activity) this.d;
        if (r47.B1(message.peer_id) == pVar.m0.id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            hl.c3(new oy6(pVar, wk5Var, activity, message, (byte) 15));
            return true;
        }
        return false;
    }

    @Override
    public final Object g() {
        rc3 rc3Var = (rc3) this.b;
        ta0 ta0Var = (ta0) this.c;
        r90 r90Var = (r90) this.d;
        ds9 ds9Var = rc3Var.d;
        ds9Var.getClass();
        pm8 pm8Var = ta0Var.c;
        String str = r90Var.a;
        String str2 = ta0Var.a;
        String c = pse.c("SQLiteEventStore");
        if (Log.isLoggable(c, 3)) {
            StringBuilder sb = new StringBuilder("Storing event with priority=");
            sb.append(pm8Var);
            sb.append(", name=");
            sb.append(str);
            sb.append(" for destination ");
            bs2.x(sb, str2, c);
        }
        ((Long) ds9Var.c(new o48(ds9Var, r90Var, ta0Var, (byte) 8))).getClass();
        rc3Var.a.E(ta0Var, 1, false);
        return null;
    }

    @Override
    public final j99 l(int i, t1c t1cVar, int[] iArr) {
        gd3 gd3Var = (gd3) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        mo5 p = po5.p();
        for (int i2 = 0; i2 < t1cVar.a; i2++) {
            p.c(new hd3(i, t1cVar, i2, gd3Var, iArr[i2], str, str2));
        }
        return p.f();
    }

    @Override
    public final void onFailure(Exception exc) {
        yu4 xu4Var;
        CancellationSignal cancellationSignal = (CancellationSignal) this.b;
        Executor executor = (Executor) this.c;
        h23 h23Var = (h23) this.d;
        exc.getClass();
        if (exc instanceof ao) {
            int statusCode = ((ao) exc).getStatusCode();
            if (statusCode == 16) {
                xu4Var = new vu4(exc.getMessage());
            } else if (q23.b.contains(Integer.valueOf(statusCode))) {
                xu4Var = new zu4(exc.getMessage());
            } else {
                xu4Var = new xu4("Get digital credential failed, failure: " + exc, (byte) 2);
            }
        } else {
            xu4Var = new xu4("Get digital credential failed, failure: " + exc, (byte) 2);
        }
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (d33.a(cancellationSignal)) {
            return;
        }
        executor.execute(new z23(h23Var, xu4Var, (byte) 0));
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        PeerConnection peerConnection = (PeerConnection) this.b;
        switch (b) {
            case 23:
                peerConnection.lambda$getStats$37((RtpReceiver) obj2, (RTCStatsCollectorCallback) obj);
                return;
            case 24:
                peerConnection.lambda$getStats$35((RtpSender) obj2, (RTCStatsCollectorCallback) obj);
                return;
            default:
                peerConnection.lambda$addIceCandidate$14((IceCandidate) obj2, (AddIceObserver) obj);
                return;
        }
    }

    @Override
    public final Task then(Object obj) {
        String d;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        n20 n20Var = (n20) this.d;
        String str2 = (String) obj;
        i09 c = FirebaseMessaging.c(firebaseMessaging.b);
        ji4 ji4Var = firebaseMessaging.a;
        ji4Var.a();
        if ("[DEFAULT]".equals(ji4Var.b)) {
            d = "";
        } else {
            d = ji4Var.d();
        }
        String a = firebaseMessaging.i.a();
        synchronized (c) {
            String b = n20.b(System.currentTimeMillis(), str2, a);
            if (b != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c.b).edit();
                edit.putString(d + "|T|" + str + "|*", b);
                edit.commit();
            }
        }
        if (firebaseMessaging.d.A() || n20Var == null || !str2.equals((String) n20Var.b)) {
            ji4 ji4Var2 = firebaseMessaging.a;
            ji4Var2.a();
            String str3 = ji4Var2.b;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    ji4Var2.a();
                    sb.append(str3);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                boolean A = firebaseMessaging.d.A();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (A) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new qx6(firebaseMessaging.b, (byte) 1).H(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override
    public final void w(id idVar, int i) {
        String str;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ContactsActivity contactsActivity = (ContactsActivity) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (editTextBoldCursor != null) {
                    str = editTextBoldCursor.getText().toString();
                } else {
                    str = "0";
                }
                contactsActivity.g0(user, false, str);
                return;
            case 3:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj3;
                dataSettingsActivity.getClass();
                xea.e0 = (String) obj2;
                xea.x();
                xea.a = false;
                dataSettingsActivity.r0(dataSettingsActivity.n);
                in5.z().e(new b73(dataSettingsActivity, (byte) 2));
                ((AlertDialog$Builder) obj).a.M0.run();
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                hl.t1(editTextBoldCursor2);
                ((AlertDialog$Builder) obj2).a.M0.run();
                je4 je4Var = ((he4) obj3).F.c;
                je4Var.d.title = editTextBoldCursor2.getText().toString();
                je4Var.h0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = je4Var.d;
                if (je4Var.F != 0) {
                    je4Var.getConnectionsManager().cancelRequest(je4Var.F, true);
                    je4Var.F = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = je4Var.c.a;
                tL_chatlists_editExportedInvite.slug = je4Var.d0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                je4Var.F = je4Var.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new vd4(je4Var, (byte) 0));
                pcc pccVar = je4Var.y;
                if (pccVar != null) {
                    pccVar.a(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 14:
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) obj;
                hl.t1(editTextBoldCursor3);
                ((m85) obj3).b.T2.z(editTextBoldCursor3.getText().toString());
                ((AlertDialog$Builder) obj2).a.M0.run();
                return;
            case 15:
                l46 l46Var = (l46) obj3;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.User user2 = (TLRPC.User) obj2;
                l46Var.dismiss();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i2);
                    uc7.s1(l46Var.a).a4(chat, false);
                    uc7.s1(l46Var.a).d0(chat.id, user2);
                }
                return;
            case 19:
                r17 r17Var = (r17) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                ((boolean[]) obj)[0] = true;
                if (user3 != null) {
                    uc7.s1(r17Var.f).W3.edit().putBoolean("inlinegeo_" + user3.id, true).commit();
                    r17Var.G();
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj3;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj2, (ArrayList) obj, false));
                return;
        }
    }

    public fu2(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public fu2(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    @Override
    public final void u(View view, float f, float f2) {
    }

    @Override
    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.d;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
        } else if (task.getException() != null) {
            taskCompletionSource.trySetException(task.getException());
        } else if (atomicBoolean.getAndSet(true)) {
            cancellationTokenSource.cancel();
        }
        return Tasks.forResult(null);
    }
}
