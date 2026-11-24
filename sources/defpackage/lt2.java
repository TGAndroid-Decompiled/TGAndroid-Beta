package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.e;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;
public final class lt2 implements ed, Continuation, OnFailureListener, xcb, pc3, s8c, ym3, eq6, SuccessContinuation, d39, mx, us2, yc7, wi3, r69, b42, jo9 {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public lt2(EditTextBoldCursor editTextBoldCursor, EditTextBoldCursor editTextBoldCursor2, gf9 gf9Var) {
        this.a = (byte) 28;
        this.d = editTextBoldCursor;
        this.b = editTextBoldCursor2;
        this.c = gf9Var;
    }

    @Override
    public final boolean F() {
        byte b = this.a;
        return false;
    }

    @Override
    public final void a(String str) {
        s28 s28Var = (s28) this.b;
        y28 y28Var = s28Var.x;
        y28Var.getStoriesController().q(y28Var.r1, str, new f28(s28Var, (TL_stories.StoryItem) this.c, (f53) this.d, (byte) 2));
    }

    @Override
    public final void accept(Object obj) {
        ((vx6) obj).k(((kp) this.b).b, (rx6) this.c, (fr6) this.d);
    }

    @Override
    public final Object apply(Object obj) {
        long insert;
        boolean z;
        byte[] bArr;
        lo9 lo9Var = (lo9) this.b;
        p90 p90Var = (p90) this.c;
        o24 o24Var = p90Var.c;
        String str = p90Var.a;
        ra0 ra0Var = (ra0) this.d;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        long simpleQueryForLong = lo9Var.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * lo9Var.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
        q90 q90Var = lo9Var.d;
        if (simpleQueryForLong >= q90Var.a) {
            lo9Var.e(1L, xb6.CACHE_FULL, str);
            return -1L;
        }
        Long b = lo9.b(sQLiteDatabase, ra0Var);
        if (b != null) {
            insert = b.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", ra0Var.a);
            contentValues.put("priority", Integer.valueOf(dj8.a(ra0Var.c)));
            contentValues.put("next_request_ms", (Integer) 0);
            byte[] bArr2 = ra0Var.b;
            if (bArr2 != null) {
                contentValues.put("extras", Base64.encodeToString(bArr2, 0));
            }
            insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        int i = q90Var.e;
        byte[] bArr3 = o24Var.b;
        if (bArr3.length <= i) {
            z = true;
        } else {
            z = false;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(insert));
        contentValues2.put("transport_name", str);
        contentValues2.put("timestamp_ms", Long.valueOf(p90Var.d));
        contentValues2.put("uptime_ms", Long.valueOf(p90Var.e));
        contentValues2.put("payload_encoding", o24Var.a.a);
        contentValues2.put("code", p90Var.b);
        contentValues2.put("num_attempts", (Integer) 0);
        contentValues2.put("inline", Boolean.valueOf(z));
        if (z) {
            bArr = bArr3;
        } else {
            bArr = new byte[0];
        }
        contentValues2.put("payload", bArr);
        contentValues2.put("product_id", p90Var.g);
        contentValues2.put("pseudonymous_id", p90Var.h);
        contentValues2.put("experiment_ids_clear_blob", p90Var.i);
        contentValues2.put("experiment_ids_encrypted_blob", p90Var.j);
        long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
        if (!z) {
            int ceil = (int) Math.ceil(bArr3.length / i);
            for (int i2 = 1; i2 <= ceil; i2++) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr3, (i2 - 1) * i, Math.min(i2 * i, bArr3.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(insert2));
                contentValues3.put("sequence_num", Integer.valueOf(i2));
                contentValues3.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues3);
            }
        }
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(p90Var.f).entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(insert2));
            contentValues4.put("name", (String) entry.getKey());
            contentValues4.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues4);
        }
        return Long.valueOf(insert2);
    }

    @Override
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        hd9 hd9Var = (hd9) this.b;
        lk0 lk0Var = (lk0) this.c;
        x02 x02Var = (x02) this.d;
        if (messageMedia != null && messageMedia.geo != null) {
            ld9 ld9Var = hd9Var.Q.R3;
            if (ld9Var != null) {
                ld9Var.d();
            }
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) lk0Var.b;
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                pageblockmap.w = 600;
                pageblockmap.h = 400;
            }
            ld9 ld9Var2 = hd9Var.Q.R3;
            if (ld9Var2 != null) {
                ld9Var2.h();
            }
            x02Var.a(true);
            hd9Var.Q.post(new sc9(hd9Var, lk0Var, (byte) 9));
        }
    }

    @Override
    public final void c(long j, long j2) {
        vl3 vl3Var = (vl3) this.c;
        long[] jArr = (long[]) this.d;
        long[] jArr2 = (long[]) DictationAsr.h.get((String) this.b);
        if (jArr2 != null) {
            jArr2[0] = j;
            if (j2 > 0) {
                jArr2[1] = j2;
            }
        }
        if (j2 > 0) {
            if (vl3Var != null) {
                vl3Var.k = Math.min(1.0f, ((float) j) / ((float) j2));
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - jArr[0] > 100) {
                jArr[0] = elapsedRealtime;
                DictationAsr.n();
            }
        }
    }

    @Override
    public final void call() {
        y21 y21Var;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
        switch (b) {
            case 25:
                String str = (String) obj;
                if (obj2 == null) {
                    y21Var = null;
                } else {
                    try {
                        y21Var = new y21(obj2);
                    } catch (l31 e) {
                        e.f(iOnDoneCallback, str, e);
                        return;
                    }
                }
                iOnDoneCallback.onSuccess(y21Var);
                return;
            default:
                String str2 = (String) obj;
                try {
                    iOnDoneCallback.onFailure(new y21(new FailureResponse((Exception) obj2)));
                    return;
                } catch (l31 e2) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e2);
                    return;
                }
        }
    }

    @Override
    public final void d(int i, TLObject tLObject) {
        sd3 sd3Var = (sd3) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        long d = cf3.d(tLObject);
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            na7.q1(sd3Var.a).d0(-sd3Var.T1.id, ((Integer) arrayList.get(i3)).intValue(), d);
        }
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj = arrayList2.get(i2);
            i2++;
            na7.q1(sd3Var.a).d0(sd3Var.X1, ((Integer) obj).intValue(), d);
        }
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        ((h75) this.b).j1((LaunchActivity) this.c, (fc2) this.d, view, i);
    }

    @Override
    public final void f(String str, ArrayList arrayList) {
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
                sv3 sv3Var = (sv3) obj3;
                hq6 hq6Var = (hq6) obj;
                ArrayList arrayList6 = sv3Var.h;
                SparseIntArray sparseIntArray = sv3Var.E;
                ArrayList arrayList7 = sv3Var.n;
                tv3 tv3Var = sv3Var.O;
                ArrayList arrayList8 = sv3Var.w;
                HashSet hashSet = sv3Var.M;
                ArrayList arrayList9 = sv3Var.s;
                if (TextUtils.equals((String) obj2, sv3Var.I)) {
                    ArrayList j = vu3.j(sv3Var.I, null);
                    for (int i5 = 0; i5 < j.size(); i5++) {
                        try {
                            ?? obj4 = new Object();
                            obj4.a = ((tu3) j.get(i5)).c.toString();
                            arrayList5.add(obj4);
                        } catch (Exception unused) {
                        }
                    }
                    sv3Var.y = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    sparseIntArray.clear();
                    arrayList7.clear();
                    int i6 = 1;
                    sv3Var.y++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (tv3Var.a == 0) {
                        hashSet.clear();
                        for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                            dq6 dq6Var = (dq6) arrayList5.get(i7);
                            String str2 = dq6Var.a;
                            if (str2 != null && !str2.startsWith("animated_") && (arrayList4 = (ArrayList) sv3Var.d.get(dq6Var.a)) != null) {
                                hashSet.addAll(arrayList4);
                            }
                        }
                        arrayList8.addAll(hashSet);
                        for (int i8 = 0; i8 < hashSet.size(); i8++) {
                            arrayList9.add(null);
                        }
                        sv3Var.y = hashSet.size() + sv3Var.y;
                        i = 0;
                        i2 = 1;
                    } else {
                        HashMap hashMap = hq6Var.e0;
                        int i9 = 0;
                        while (i9 < arrayList5.size()) {
                            dq6 dq6Var2 = (dq6) arrayList5.get(i9);
                            int i10 = i4;
                            String str3 = dq6Var2.a;
                            if (str3 != null && !str3.startsWith("animated_") && (arrayList3 = (ArrayList) hashMap.get(dq6Var2.a)) != null && !arrayList3.isEmpty()) {
                                i3 = i6;
                                for (int i11 = i10; i11 < arrayList3.size(); i11++) {
                                    TLRPC.Document document = (TLRPC.Document) arrayList3.get(i11);
                                    if (document != null && !arrayList9.contains(document)) {
                                        arrayList9.add(document);
                                        sv3Var.y++;
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
                        ArrayList arrayList10 = hq6Var.t0[i];
                        int i12 = i;
                        while (i12 < arrayList5.size()) {
                            dq6 dq6Var3 = (dq6) arrayList5.get(i12);
                            String str4 = dq6Var3.a;
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
                                        String V = k27.V(arrayList2.get(i14), null, null);
                                        if (V != null && V.contains(dq6Var3.a)) {
                                            arrayList9.add(arrayList2.get(i14));
                                            sv3Var.y++;
                                        }
                                    }
                                }
                            }
                            i12++;
                            arrayList5 = arrayList;
                        }
                    }
                    String J3 = gl.J3((sv3Var.I + "").toLowerCase());
                    for (int i15 = i; i15 < arrayList6.size(); i15++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i15);
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            String J32 = gl.J3((tL_messages_stickerSet.set.title + "").toLowerCase());
                            if (J32.startsWith(J3) || J32.contains(" ".concat(J3))) {
                                int size = arrayList7.size();
                                arrayList7.add(tL_messages_stickerSet);
                                sparseIntArray.put(sv3Var.y, size);
                                arrayList9.add(null);
                                sv3Var.y++;
                                arrayList9.addAll(tL_messages_stickerSet.documents);
                                sv3Var.y = tL_messages_stickerSet.documents.size() + sv3Var.y;
                            }
                        }
                    }
                    int i16 = i2;
                    if (arrayList8.size() <= i16 && arrayList9.size() <= i16) {
                        z = i16;
                    } else {
                        z = i;
                    }
                    sv3Var.x = z;
                    if (z != 0) {
                        sv3Var.y += i16;
                    } else {
                        sv3Var.L += i16;
                    }
                    sv3Var.J = sv3Var.I;
                    sv3Var.f();
                    jv3 jv3Var = tv3Var.b;
                    int i17 = jv3.q3;
                    boolean z2 = i;
                    jv3Var.z1(z2 ? 1 : 0, z2 ? 1 : 0);
                    tv3Var.f.c(z2);
                    tv3Var.e.n(z2);
                    return;
                }
                return;
            case 9:
                Runnable runnable = (Runnable) obj;
                t04 t04Var = ((s04) obj3).a;
                if (((String) obj2).equals(t04Var.w)) {
                    t04Var.x = str;
                    t04Var.n.addAll(arrayList5);
                    runnable.run();
                    return;
                }
                return;
            default:
                n14 n14Var = (n14) obj3;
                HashMap hashMap2 = (HashMap) obj2;
                Runnable runnable2 = (Runnable) obj;
                HashMap hashMap3 = n14Var.f;
                if (n14Var.x.N == n14Var.b) {
                    int size2 = arrayList5.size();
                    while (i4 < size2) {
                        String str5 = ((dq6) arrayList5.get(i4)).a;
                        ArrayList arrayList12 = (ArrayList) hashMap2.get(str5);
                        if (arrayList12 != null && !arrayList12.isEmpty() && !hashMap3.containsKey(arrayList12)) {
                            hashMap3.put(arrayList12, str5);
                            n14Var.h.add(arrayList12);
                        }
                        i4++;
                    }
                    runnable2.run();
                    return;
                }
                return;
        }
    }

    public final boolean g(TLRPC.Message message) {
        p pVar = (p) this.b;
        ui5 ui5Var = (ui5) this.c;
        Activity activity = (Activity) this.d;
        if (k27.B1(message.peer_id) == pVar.m0.id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            gl.d3(new jw6(pVar, ui5Var, activity, message, (byte) 14));
            return true;
        }
        return false;
    }

    @Override
    public final w59 j(int i, sxb sxbVar, int[] iArr) {
        nc3 nc3Var = (nc3) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        jm5 p = mm5.p();
        for (int i2 = 0; i2 < sxbVar.a; i2++) {
            p.c(new oc3(i, sxbVar, i2, nc3Var, iArr[i2], str, str2));
        }
        return p.f();
    }

    @Override
    public final Object m() {
        yb3 yb3Var = (yb3) this.b;
        ra0 ra0Var = (ra0) this.c;
        p90 p90Var = (p90) this.d;
        lo9 lo9Var = yb3Var.d;
        lo9Var.getClass();
        cj8 cj8Var = ra0Var.c;
        String str = p90Var.a;
        String str2 = ra0Var.a;
        String c = xne.c("SQLiteEventStore");
        if (Log.isLoggable(c, 3)) {
            StringBuilder sb = new StringBuilder("Storing event with priority=");
            sb.append(cj8Var);
            sb.append(", name=");
            sb.append(str);
            sb.append(" for destination ");
            ir2.x(sb, str2, c);
        }
        ((Long) lo9Var.c(new lt2(lo9Var, p90Var, ra0Var, (byte) 29))).getClass();
        yb3Var.a.F(ra0Var, 1, false);
        return null;
    }

    @Override
    public final void onFailure(Exception exc) {
        us4 ts4Var;
        CancellationSignal cancellationSignal = (CancellationSignal) this.b;
        Executor executor = (Executor) this.c;
        o13 o13Var = (o13) this.d;
        exc.getClass();
        if (exc instanceof zn) {
            int statusCode = ((zn) exc).getStatusCode();
            if (statusCode == 16) {
                ts4Var = new rs4(exc.getMessage());
            } else if (y13.b.contains(Integer.valueOf(statusCode))) {
                ts4Var = new vs4(exc.getMessage());
            } else {
                ts4Var = new ts4("Get digital credential failed, failure: " + exc, (byte) 2);
            }
        } else {
            ts4Var = new ts4("Get digital credential failed, failure: " + exc, (byte) 2);
        }
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (l23.a(cancellationSignal)) {
            return;
        }
        executor.execute(new h23(o13Var, ts4Var, (byte) 0));
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        long j;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 23:
                ArrayList arrayList2 = (ArrayList) obj2;
                mu1 mu1Var = (mu1) obj;
                PhotoViewer photoViewer = ((p78) obj3).b;
                if (arrayList.size() <= 1 && ((zc7) arrayList.get(0)).a != y6c.h(photoViewer.U).e() && charSequence == null) {
                    zc7 zc7Var = (zc7) arrayList.get(0);
                    long j2 = zc7Var.a;
                    Bundle l = ir2.l("scrollToTopOnResume", true);
                    if (cf3.B(j2)) {
                        l.putInt("enc_id", (int) (j2 & 4294967295L));
                    } else if (cf3.D(j2)) {
                        l.putLong("user_id", j2);
                    } else {
                        l.putLong("chat_id", -j2);
                    }
                    mu1 mu1Var2 = new mu1(l);
                    if (zc7Var.b != 0) {
                        mm4.a(mu1Var2, zc7Var);
                    }
                    if (((LaunchActivity) photoViewer.E).u0(mu1Var2, true, false)) {
                        mu1Var2.Ob(arrayList2);
                    } else {
                        cj3Var.finishFragment();
                    }
                } else {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        long j3 = ((zc7) arrayList.get(i3)).a;
                        if (charSequence != null) {
                            j = j3;
                            z3a.B(photoViewer.U).q0(x3a.b(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j = j3;
                        }
                        z3a.B(photoViewer.U).p0(arrayList2, j, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    cj3Var.finishFragment();
                    if (mu1Var != null) {
                        mu1Var.Z5();
                        UndoView undoView = mu1Var.N3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(Integer.valueOf(arrayList2.size()), 53, ((zc7) arrayList.get(0)).a);
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                            }
                        }
                    }
                }
                return true;
            default:
                rn8 rn8Var = (rn8) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                cj3 cj3Var2 = (cj3) obj;
                long j4 = ((zc7) arrayList.get(0)).a;
                ProfileActivity profileActivity = rn8Var.b;
                TLRPC.Chat K0 = na7.q1(ProfileActivity.a0(profileActivity)).K0(Long.valueOf(-j4));
                if (K0 != null && (K0.creator || ((tL_chatAdminRights = K0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().G(K0, user, new hs0(rn8Var, j4, cj3Var2, (byte) 6));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                    String M0 = k96.M0(2131754460, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    if (K0 == null) {
                        str = "";
                    } else {
                        str = K0.title;
                    }
                    hdVar.U = gl.T2(k96.a0("AddMembersAlertNamesText", null, 2131754396, l7c.q(user), str));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    alertDialog$Builder.j(k96.M0(2131754460, null), new qm1(rn8Var, j4, cj3Var, user, (byte) 7));
                    profileActivity.showDialog(hdVar);
                }
                return true;
        }
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        byte b = this.a;
        return false;
    }

    @Override
    public final Task then(Object obj) {
        String d;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        m20 m20Var = (m20) this.d;
        String str2 = (String) obj;
        qj4 c = FirebaseMessaging.c(firebaseMessaging.b);
        jg4 jg4Var = firebaseMessaging.a;
        jg4Var.a();
        if ("[DEFAULT]".equals(jg4Var.b)) {
            d = "";
        } else {
            d = jg4Var.d();
        }
        String a = firebaseMessaging.i.a();
        synchronized (c) {
            String b = m20.b(System.currentTimeMillis(), str2, a);
            if (b != null) {
                SharedPreferences.Editor edit = c.a.edit();
                edit.putString(d + "|T|" + str + "|*", b);
                edit.commit();
            }
        }
        if (firebaseMessaging.d.w() || m20Var == null || !str2.equals((String) m20Var.b)) {
            jg4 jg4Var2 = firebaseMessaging.a;
            jg4Var2.a();
            String str3 = jg4Var2.b;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    jg4Var2.a();
                    sb.append(str3);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                boolean w = firebaseMessaging.d.w();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (w) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new lv6(firebaseMessaging.b).F(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override
    public final void u(hd hdVar, int i) {
        String str;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ContactsActivity contactsActivity = (ContactsActivity) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj3;
                if (editTextBoldCursor != null) {
                    str = editTextBoldCursor.getText().toString();
                } else {
                    str = "0";
                }
                contactsActivity.g0(user, false, str);
                return;
            case 3:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj2;
                dataSettingsActivity.getClass();
                gba.e0 = (String) obj;
                gba.x();
                gba.a = false;
                dataSettingsActivity.r0(dataSettingsActivity.n);
                fl5.z().e(new i63(dataSettingsActivity, (byte) 2));
                ((AlertDialog$Builder) obj3).a.M0.run();
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj3;
                gl.t1(editTextBoldCursor2);
                ((AlertDialog$Builder) obj).a.M0.run();
                mc4 mc4Var = ((kc4) obj2).F.c;
                mc4Var.d.title = editTextBoldCursor2.getText().toString();
                mc4Var.h0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = mc4Var.d;
                if (mc4Var.F != 0) {
                    mc4Var.getConnectionsManager().cancelRequest(mc4Var.F, true);
                    mc4Var.F = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = mc4Var.c.a;
                tL_chatlists_editExportedInvite.slug = mc4Var.d0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                mc4Var.F = mc4Var.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new ac4(mc4Var, (byte) 1));
                p8c p8cVar = mc4Var.y;
                if (p8cVar != null) {
                    p8cVar.a(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 14:
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) obj3;
                gl.t1(editTextBoldCursor3);
                ((k65) obj2).b.T2.z(editTextBoldCursor3.getText().toString());
                ((AlertDialog$Builder) obj).a.M0.run();
                return;
            case 15:
                h26 h26Var = (h26) obj2;
                ArrayList arrayList = (ArrayList) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                h26Var.dismiss();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i2);
                    na7.q1(h26Var.a).S3(chat, false);
                    na7.q1(h26Var.a).b0(chat.id, user2);
                }
                return;
            case 19:
                kz6 kz6Var = (kz6) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                ((boolean[]) obj3)[0] = true;
                if (user3 != null) {
                    na7.q1(kz6Var.f).W3.edit().putBoolean("inlinegeo_" + user3.id, true).commit();
                    kz6Var.G();
                    return;
                }
                return;
            case 20:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj2;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj, (ArrayList) obj3, false));
                return;
            default:
                gf9 gf9Var = (gf9) obj;
                String trim = ((EditTextBoldCursor) obj3).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) obj2).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    switch (gf9Var.a) {
                        case 1:
                            ve9 ve9Var = gf9Var.b;
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            ve9Var.a(trim, tL_inlineButtonTypeUrl);
                            return;
                        default:
                            ve9 ve9Var2 = gf9Var.b;
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            ve9Var2.a(trim, tL_inlineButtonTypeCopy);
                            return;
                    }
                }
                return;
        }
    }

    public lt2(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public lt2(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    public lt2(i23 i23Var, CancellationSignal cancellationSignal, Executor executor, o13 o13Var) {
        this.a = (byte) 2;
        this.b = cancellationSignal;
        this.c = executor;
        this.d = o13Var;
    }

    @Override
    public final void l(View view, float f, float f2) {
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

    @Override
    public final t56 mo15apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 16:
                tv6 tv6Var = (tv6) obj4;
                Handler handler = tv6Var.l;
                oh6 oh6Var = new oh6(tv6Var, (su6) obj3, new lo6(tv6Var, (yw6) obj2, (tu6) obj, (byte) 7));
                o6a o6aVar = new o6a(0);
                String str = g8c.a;
                ?? obj5 = new Object();
                g8c.X(handler, new r1b(obj5, oh6Var, o6aVar, (byte) 24));
                return obj5;
            default:
                tv6 tv6Var2 = (tv6) obj4;
                su6 su6Var = (su6) obj3;
                Handler handler2 = tv6Var2.l;
                oh6 oh6Var2 = new oh6(tv6Var2, su6Var, new jw6(tv6Var2, (jx6) obj2, su6Var, (List) obj, (byte) 1));
                o6a o6aVar2 = new o6a(0);
                String str2 = g8c.a;
                ?? obj6 = new Object();
                g8c.X(handler2, new r1b(obj6, oh6Var2, o6aVar2, (byte) 24));
                return obj6;
        }
    }
}
