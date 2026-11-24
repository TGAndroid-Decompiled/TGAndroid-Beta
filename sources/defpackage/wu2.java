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
public final class wu2 implements ee, Continuation, OnFailureListener, yeb, ce3, tac, io3, es6, SuccessContinuation, g59, ny, fu2, af7, hk3, t89, m52, kq9 {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public wu2(EditTextBoldCursor editTextBoldCursor, EditTextBoldCursor editTextBoldCursor2, kh9 kh9Var) {
        this.a = (byte) 28;
        this.d = editTextBoldCursor;
        this.b = editTextBoldCursor2;
        this.c = kh9Var;
    }

    @Override
    public final boolean E() {
        byte b = this.a;
        return false;
    }

    @Override
    public final void a(String str) {
        v48 v48Var = (v48) this.b;
        a58 a58Var = v48Var.x;
        a58Var.getStoriesController().q(a58Var.r1, str, new i48(v48Var, (TL_stories.StoryItem) this.c, (r63) this.d, (byte) 2));
    }

    @Override
    public final void accept(Object obj) {
        ((vz6) obj).k(((kq) this.b).b, (rz6) this.c, (ft6) this.d);
    }

    @Override
    public final Object apply(Object obj) {
        long insert;
        boolean z;
        byte[] bArr;
        mq9 mq9Var = (mq9) this.b;
        pa0 pa0Var = (pa0) this.c;
        z34 z34Var = pa0Var.c;
        String str = pa0Var.a;
        rb0 rb0Var = (rb0) this.d;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        long simpleQueryForLong = mq9Var.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * mq9Var.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
        qa0 qa0Var = mq9Var.d;
        if (simpleQueryForLong >= qa0Var.a) {
            mq9Var.e(1L, wd6.CACHE_FULL, str);
            return -1L;
        }
        Long b = mq9.b(sQLiteDatabase, rb0Var);
        if (b != null) {
            insert = b.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", rb0Var.a);
            contentValues.put("priority", Integer.valueOf(gl8.a(rb0Var.c)));
            contentValues.put("next_request_ms", (Integer) 0);
            byte[] bArr2 = rb0Var.b;
            if (bArr2 != null) {
                contentValues.put("extras", Base64.encodeToString(bArr2, 0));
            }
            insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        int i = qa0Var.e;
        byte[] bArr3 = z34Var.b;
        if (bArr3.length <= i) {
            z = true;
        } else {
            z = false;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(insert));
        contentValues2.put("transport_name", str);
        contentValues2.put("timestamp_ms", Long.valueOf(pa0Var.d));
        contentValues2.put("uptime_ms", Long.valueOf(pa0Var.e));
        contentValues2.put("payload_encoding", z34Var.a.a);
        contentValues2.put("code", pa0Var.b);
        contentValues2.put("num_attempts", (Integer) 0);
        contentValues2.put("inline", Boolean.valueOf(z));
        if (z) {
            bArr = bArr3;
        } else {
            bArr = new byte[0];
        }
        contentValues2.put("payload", bArr);
        contentValues2.put("product_id", pa0Var.g);
        contentValues2.put("pseudonymous_id", pa0Var.h);
        contentValues2.put("experiment_ids_clear_blob", pa0Var.i);
        contentValues2.put("experiment_ids_encrypted_blob", pa0Var.j);
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
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(pa0Var.f).entrySet()) {
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
        jf9 jf9Var = (jf9) this.b;
        ll0 ll0Var = (ll0) this.c;
        i22 i22Var = (i22) this.d;
        if (messageMedia != null && messageMedia.geo != null) {
            of9 of9Var = jf9Var.Q.R3;
            if (of9Var != null) {
                of9Var.d();
            }
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) ll0Var.b;
            pageblockmap.geo = messageMedia.geo;
            pageblockmap.zoom = 15;
            if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                pageblockmap.w = 600;
                pageblockmap.h = 400;
            }
            of9 of9Var2 = jf9Var.Q.R3;
            if (of9Var2 != null) {
                of9Var2.h();
            }
            i22Var.a(true);
            jf9Var.Q.post(new te9(jf9Var, ll0Var, (byte) 9));
        }
    }

    @Override
    public final void c(long j, long j2) {
        gn3 gn3Var = (gn3) this.c;
        long[] jArr = (long[]) this.d;
        long[] jArr2 = (long[]) DictationAsr.h.get((String) this.b);
        if (jArr2 != null) {
            jArr2[0] = j;
            if (j2 > 0) {
                jArr2[1] = j2;
            }
        }
        if (j2 > 0) {
            if (gn3Var != null) {
                gn3Var.k = Math.min(1.0f, ((float) j) / ((float) j2));
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
        g41 g41Var;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
        switch (b) {
            case 25:
                String str = (String) obj;
                if (obj2 == null) {
                    g41Var = null;
                } else {
                    try {
                        g41Var = new g41(obj2);
                    } catch (t41 e) {
                        e.f(iOnDoneCallback, str, e);
                        return;
                    }
                }
                iOnDoneCallback.onSuccess(g41Var);
                return;
            default:
                String str2 = (String) obj;
                try {
                    iOnDoneCallback.onFailure(new g41(new FailureResponse((Exception) obj2)));
                    return;
                } catch (t41 e2) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e2);
                    return;
                }
        }
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        ((g95) this.b).j1((LaunchActivity) this.c, (qd2) this.d, view, i);
    }

    @Override
    public final Object e() {
        kd3 kd3Var = (kd3) this.b;
        rb0 rb0Var = (rb0) this.c;
        pa0 pa0Var = (pa0) this.d;
        mq9 mq9Var = kd3Var.d;
        mq9Var.getClass();
        fl8 fl8Var = rb0Var.c;
        String str = pa0Var.a;
        String str2 = rb0Var.a;
        String c = aqe.c("SQLiteEventStore");
        if (Log.isLoggable(c, 3)) {
            StringBuilder sb = new StringBuilder("Storing event with priority=");
            sb.append(fl8Var);
            sb.append(", name=");
            sb.append(str);
            sb.append(" for destination ");
            ts2.w(sb, str2, c);
        }
        ((Long) mq9Var.c(new wu2(mq9Var, pa0Var, rb0Var, (byte) 29))).getClass();
        kd3Var.a.E(rb0Var, 1, false);
        return null;
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
                dx3 dx3Var = (dx3) obj3;
                hs6 hs6Var = (hs6) obj;
                ArrayList arrayList6 = dx3Var.h;
                SparseIntArray sparseIntArray = dx3Var.E;
                ArrayList arrayList7 = dx3Var.n;
                ex3 ex3Var = dx3Var.O;
                ArrayList arrayList8 = dx3Var.w;
                HashSet hashSet = dx3Var.M;
                ArrayList arrayList9 = dx3Var.s;
                if (TextUtils.equals((String) obj2, dx3Var.I)) {
                    ArrayList j = gw3.j(dx3Var.I, null);
                    for (int i5 = 0; i5 < j.size(); i5++) {
                        try {
                            ?? obj4 = new Object();
                            obj4.a = ((ew3) j.get(i5)).c.toString();
                            arrayList5.add(obj4);
                        } catch (Exception unused) {
                        }
                    }
                    dx3Var.y = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    sparseIntArray.clear();
                    arrayList7.clear();
                    int i6 = 1;
                    dx3Var.y++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (ex3Var.a == 0) {
                        hashSet.clear();
                        for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                            ds6 ds6Var = (ds6) arrayList5.get(i7);
                            String str2 = ds6Var.a;
                            if (str2 != null && !str2.startsWith("animated_") && (arrayList4 = (ArrayList) dx3Var.d.get(ds6Var.a)) != null) {
                                hashSet.addAll(arrayList4);
                            }
                        }
                        arrayList8.addAll(hashSet);
                        for (int i8 = 0; i8 < hashSet.size(); i8++) {
                            arrayList9.add(null);
                        }
                        dx3Var.y = hashSet.size() + dx3Var.y;
                        i = 0;
                        i2 = 1;
                    } else {
                        HashMap hashMap = hs6Var.e0;
                        int i9 = 0;
                        while (i9 < arrayList5.size()) {
                            ds6 ds6Var2 = (ds6) arrayList5.get(i9);
                            int i10 = i4;
                            String str3 = ds6Var2.a;
                            if (str3 != null && !str3.startsWith("animated_") && (arrayList3 = (ArrayList) hashMap.get(ds6Var2.a)) != null && !arrayList3.isEmpty()) {
                                i3 = i6;
                                for (int i11 = i10; i11 < arrayList3.size(); i11++) {
                                    TLRPC.Document document = (TLRPC.Document) arrayList3.get(i11);
                                    if (document != null && !arrayList9.contains(document)) {
                                        arrayList9.add(document);
                                        dx3Var.y++;
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
                        ArrayList arrayList10 = hs6Var.t0[i];
                        int i12 = i;
                        while (i12 < arrayList5.size()) {
                            ds6 ds6Var3 = (ds6) arrayList5.get(i12);
                            String str4 = ds6Var3.a;
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
                                        String V = k47.V(arrayList2.get(i14), null, null);
                                        if (V != null && V.contains(ds6Var3.a)) {
                                            arrayList9.add(arrayList2.get(i14));
                                            dx3Var.y++;
                                        }
                                    }
                                }
                            }
                            i12++;
                            arrayList5 = arrayList;
                        }
                    }
                    String I3 = gm.I3((dx3Var.I + "").toLowerCase());
                    for (int i15 = i; i15 < arrayList6.size(); i15++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i15);
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            String I32 = gm.I3((tL_messages_stickerSet.set.title + "").toLowerCase());
                            if (I32.startsWith(I3) || I32.contains(" ".concat(I3))) {
                                int size = arrayList7.size();
                                arrayList7.add(tL_messages_stickerSet);
                                sparseIntArray.put(dx3Var.y, size);
                                arrayList9.add(null);
                                dx3Var.y++;
                                arrayList9.addAll(tL_messages_stickerSet.documents);
                                dx3Var.y = tL_messages_stickerSet.documents.size() + dx3Var.y;
                            }
                        }
                    }
                    int i16 = i2;
                    if (arrayList8.size() <= i16 && arrayList9.size() <= i16) {
                        z = i16;
                    } else {
                        z = i;
                    }
                    dx3Var.x = z;
                    if (z != 0) {
                        dx3Var.y += i16;
                    } else {
                        dx3Var.L += i16;
                    }
                    dx3Var.J = dx3Var.I;
                    dx3Var.f();
                    uw3 uw3Var = ex3Var.b;
                    int i17 = uw3.q3;
                    boolean z2 = i;
                    uw3Var.z1(z2 ? 1 : 0, z2 ? 1 : 0);
                    ex3Var.f.c(z2);
                    ex3Var.e.n(z2);
                    return;
                }
                return;
            case 9:
                Runnable runnable = (Runnable) obj;
                e24 e24Var = ((d24) obj3).a;
                if (((String) obj2).equals(e24Var.w)) {
                    e24Var.x = str;
                    e24Var.n.addAll(arrayList5);
                    runnable.run();
                    return;
                }
                return;
            default:
                y24 y24Var = (y24) obj3;
                HashMap hashMap2 = (HashMap) obj2;
                Runnable runnable2 = (Runnable) obj;
                HashMap hashMap3 = y24Var.f;
                if (y24Var.x.N == y24Var.b) {
                    int size2 = arrayList5.size();
                    while (i4 < size2) {
                        String str5 = ((ds6) arrayList5.get(i4)).a;
                        ArrayList arrayList12 = (ArrayList) hashMap2.get(str5);
                        if (arrayList12 != null && !arrayList12.isEmpty() && !hashMap3.containsKey(arrayList12)) {
                            hashMap3.put(arrayList12, str5);
                            y24Var.h.add(arrayList12);
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
    public final void g(int i, TLObject tLObject) {
        ef3 ef3Var = (ef3) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        long d = pg3.d(tLObject);
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            oc7.r1(ef3Var.a).d0(-ef3Var.T1.id, ((Integer) arrayList.get(i3)).intValue(), d);
        }
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj = arrayList2.get(i2);
            i2++;
            oc7.r1(ef3Var.a).d0(ef3Var.X1, ((Integer) obj).intValue(), d);
        }
    }

    public final boolean h(TLRPC.Message message) {
        p pVar = (p) this.b;
        tk5 tk5Var = (tk5) this.c;
        Activity activity = (Activity) this.d;
        if (k47.B1(message.peer_id) == pVar.m0.id && (message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            gm.c3(new jy6(pVar, tk5Var, activity, message, (byte) 14));
            return true;
        }
        return false;
    }

    @Override
    public final y79 n(int i, uzb uzbVar, int[] iArr) {
        ae3 ae3Var = (ae3) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        jo5 p = mo5.p();
        for (int i2 = 0; i2 < uzbVar.a; i2++) {
            p.c(new be3(i, uzbVar, i2, ae3Var, iArr[i2], str, str2));
        }
        return p.f();
    }

    @Override
    public final void onFailure(Exception exc) {
        vu4 uu4Var;
        CancellationSignal cancellationSignal = (CancellationSignal) this.b;
        Executor executor = (Executor) this.c;
        a33 a33Var = (a33) this.d;
        exc.getClass();
        if (exc instanceof ap) {
            int statusCode = ((ap) exc).getStatusCode();
            if (statusCode == 16) {
                uu4Var = new su4(exc.getMessage());
            } else if (j33.b.contains(Integer.valueOf(statusCode))) {
                uu4Var = new wu4(exc.getMessage());
            } else {
                uu4Var = new uu4("Get digital credential failed, failure: " + exc, (byte) 2);
            }
        } else {
            uu4Var = new uu4("Get digital credential failed, failure: " + exc, (byte) 2);
        }
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (w33.a(cancellationSignal)) {
            return;
        }
        executor.execute(new s33(a33Var, uu4Var, (byte) 0));
    }

    @Override
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
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
                yv1 yv1Var = (yv1) obj;
                PhotoViewer photoViewer = ((r98) obj3).b;
                if (arrayList.size() <= 1 && ((bf7) arrayList.get(0)).a != z8c.h(photoViewer.U).e() && charSequence == null) {
                    bf7 bf7Var = (bf7) arrayList.get(0);
                    long j2 = bf7Var.a;
                    Bundle l = ts2.l("scrollToTopOnResume", true);
                    if (pg3.B(j2)) {
                        l.putInt("enc_id", (int) (j2 & 4294967295L));
                    } else if (pg3.D(j2)) {
                        l.putLong("user_id", j2);
                    } else {
                        l.putLong("chat_id", -j2);
                    }
                    yv1 yv1Var2 = new yv1(l);
                    if (bf7Var.b != 0) {
                        no4.a(yv1Var2, bf7Var);
                    }
                    if (((LaunchActivity) photoViewer.E).u0(yv1Var2, true, false)) {
                        yv1Var2.cc(arrayList2);
                    } else {
                        nk3Var.finishFragment();
                    }
                } else {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        long j3 = ((bf7) arrayList.get(i3)).a;
                        if (charSequence != null) {
                            j = j3;
                            a6a.B(photoViewer.U).q0(y5a.b(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                        } else {
                            j = j3;
                        }
                        a6a.B(photoViewer.U).p0(arrayList2, j, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                    }
                    nk3Var.finishFragment();
                    if (yv1Var != null) {
                        yv1Var.i6();
                        UndoView undoView = yv1Var.N3;
                        if (undoView != null) {
                            if (arrayList.size() == 1) {
                                undoView.m(Integer.valueOf(arrayList2.size()), 53, ((bf7) arrayList.get(0)).a);
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), null, null);
                            }
                        }
                    }
                }
                return true;
            default:
                sp8 sp8Var = (sp8) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                nk3 nk3Var2 = (nk3) obj;
                long j4 = ((bf7) arrayList.get(0)).a;
                ProfileActivity profileActivity = sp8Var.b;
                TLRPC.Chat L0 = oc7.r1(ProfileActivity.b0(profileActivity)).L0(Long.valueOf(-j4));
                if (L0 != null && (L0.creator || ((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                    profileActivity.getMessagesController().G(L0, user, new pt0(sp8Var, j4, nk3Var2, (byte) 6));
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                    String M0 = jb6.M0(2131754460, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    if (L0 == null) {
                        str = "";
                    } else {
                        str = L0.title;
                    }
                    heVar.U = gm.S2(jb6.a0("AddMembersAlertNamesText", null, 2131754396, m9c.r(user), str));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    alertDialog$Builder.j(jb6.M0(2131754460, null), new zn1(sp8Var, j4, nk3Var, user, (byte) 7));
                    profileActivity.showDialog(heVar);
                }
                return true;
        }
    }

    @Override
    public final void r(he heVar, int i) {
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
                contactsActivity.h0(user, false, str);
                return;
            case 3:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj2;
                dataSettingsActivity.getClass();
                gda.e0 = (String) obj;
                gda.x();
                gda.a = false;
                dataSettingsActivity.s0(dataSettingsActivity.n);
                fn5.z().e(new u73(dataSettingsActivity, (byte) 2));
                ((AlertDialog$Builder) obj3).a.M0.run();
                return;
            case 11:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj3;
                gm.t1(editTextBoldCursor2);
                ((AlertDialog$Builder) obj).a.M0.run();
                me4 me4Var = ((ke4) obj2).F.c;
                me4Var.d.title = editTextBoldCursor2.getText().toString();
                me4Var.i0(true);
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = me4Var.d;
                if (me4Var.F != 0) {
                    me4Var.getConnectionsManager().cancelRequest(me4Var.F, true);
                    me4Var.F = 0;
                }
                TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = me4Var.c.a;
                tL_chatlists_editExportedInvite.slug = me4Var.e0();
                tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
                tL_chatlists_editExportedInvite.flags |= 2;
                tL_chatlists_editExportedInvite.title = tL_exportedChatlistInvite.title;
                me4Var.F = me4Var.getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new ae4(me4Var, (byte) 1));
                qac qacVar = me4Var.y;
                if (qacVar != null) {
                    qacVar.a(tL_exportedChatlistInvite);
                    return;
                }
                return;
            case 14:
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) obj3;
                gm.t1(editTextBoldCursor3);
                ((i85) obj2).b.T2.z(editTextBoldCursor3.getText().toString());
                ((AlertDialog$Builder) obj).a.M0.run();
                return;
            case 15:
                i46 i46Var = (i46) obj2;
                ArrayList arrayList = (ArrayList) obj3;
                TLRPC.User user2 = (TLRPC.User) obj;
                i46Var.dismiss();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i2);
                    oc7.r1(i46Var.a).V3(chat, false);
                    oc7.r1(i46Var.a).b0(chat.id, user2);
                }
                return;
            case 19:
                k17 k17Var = (k17) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                ((boolean[]) obj3)[0] = true;
                if (user3 != null) {
                    oc7.r1(k17Var.f).W3.edit().putBoolean("inlinegeo_" + user3.id, true).commit();
                    k17Var.G();
                    return;
                }
                return;
            case 20:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj2;
                notificationsSettingsActivity.getClass();
                notificationsSettingsActivity.presentFragment(new NotificationsCustomSettingsActivity(-1, (ArrayList) obj, (ArrayList) obj3, false));
                return;
            default:
                kh9 kh9Var = (kh9) obj;
                String trim = ((EditTextBoldCursor) obj3).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) obj2).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    switch (kh9Var.a) {
                        case 1:
                            zg9 zg9Var = kh9Var.b;
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            zg9Var.a(trim, tL_inlineButtonTypeUrl);
                            return;
                        default:
                            zg9 zg9Var2 = kh9Var.b;
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            zg9Var2.a(trim, tL_inlineButtonTypeCopy);
                            return;
                    }
                }
                return;
        }
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        byte b = this.a;
        return false;
    }

    @Override
    public final Task then(Object obj) {
        String d;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        m30 m30Var = (m30) this.d;
        String str2 = (String) obj;
        cf9 c = FirebaseMessaging.c(firebaseMessaging.b);
        li4 li4Var = firebaseMessaging.a;
        li4Var.a();
        if ("[DEFAULT]".equals(li4Var.b)) {
            d = "";
        } else {
            d = li4Var.d();
        }
        String a = firebaseMessaging.i.a();
        synchronized (c) {
            String b = m30.b(System.currentTimeMillis(), str2, a);
            if (b != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c.b).edit();
                edit.putString(d + "|T|" + str + "|*", b);
                edit.commit();
            }
        }
        if (firebaseMessaging.d.z() || m30Var == null || !str2.equals((String) m30Var.b)) {
            li4 li4Var2 = firebaseMessaging.a;
            li4Var2.a();
            String str3 = li4Var2.b;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    li4Var2.a();
                    sb.append(str3);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                boolean z = firebaseMessaging.d.z();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (z) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new lx6(firebaseMessaging.b, (byte) 1).K(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    public wu2(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public wu2(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    public wu2(t33 t33Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var) {
        this.a = (byte) 2;
        this.b = cancellationSignal;
        this.c = executor;
        this.d = a33Var;
    }

    @Override
    public final void p(View view, float f, float f2) {
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
    public final t76 mo22apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 16:
                tx6 tx6Var = (tx6) obj4;
                Handler handler = tx6Var.l;
                lj6 lj6Var = new lj6(tx6Var, (sw6) obj3, new fp6(tx6Var, (yy6) obj2, (tw6) obj, (byte) 9));
                q8a q8aVar = new q8a(0);
                String str = hac.a;
                ?? obj5 = new Object();
                hac.X(handler, new j2b(obj5, lj6Var, q8aVar, (byte) 27));
                return obj5;
            default:
                tx6 tx6Var2 = (tx6) obj4;
                sw6 sw6Var = (sw6) obj3;
                Handler handler2 = tx6Var2.l;
                lj6 lj6Var2 = new lj6(tx6Var2, sw6Var, new jy6(tx6Var2, (jz6) obj2, sw6Var, (List) obj, (byte) 1));
                q8a q8aVar2 = new q8a(0);
                String str2 = hac.a;
                ?? obj6 = new Object();
                hac.X(handler2, new j2b(obj6, lj6Var2, q8aVar2, (byte) 27));
                return obj6;
        }
    }
}
