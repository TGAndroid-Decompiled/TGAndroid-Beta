package ag;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import hh.i5;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jh.d9;
import jh.x3;
import lh.o9;
import lh.q9;
import nh.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a4;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.s3;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.u3;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.wx;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.y4;
import org.telegram.ui.co0;
import org.telegram.ui.gg;
import org.telegram.ui.gy;
import org.telegram.ui.rn;
import org.telegram.ui.we1;
import org.telegram.ui.zx;

public final class l0 implements org.telegram.ui.ActionBar.a2, androidx.car.app.utils.d, e3.b, SuccessContinuation, d3.f, zx, MessagesStorage.StringCallback, d9, MediaDataController.KeywordResultCallback, co0, dc0, org.telegram.ui.ActionBar.r0, x4 {

    public final int f548a;

    public final Object f549b;

    public final Object f550c;
    public final Object d;

    public l0(Object obj, Object obj2, Object obj3, int i10) {
        this.f548a = i10;
        this.f549b = obj;
        this.f550c = obj2;
        this.d = obj3;
    }

    @Override
    public boolean D() {
        switch (this.f548a) {
        }
        return false;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        int i12;
        switch (this.f548a) {
            case 24:
                tk tkVar = (tk) this.f549b;
                tkVar.f32819t0.d((TLRPC.TL_messageMediaGeo) this.f550c, tkVar.f32820u0, z10, i10, ((Long) this.d).longValue());
                tkVar.f34900b.dismiss(true);
                break;
            case 25:
                in inVar = (in) this.f549b;
                inVar.f29420f0.e((TLRPC.TL_messageMediaToDo) this.f550c, null, null, null, z10, i10, ((Long) this.d).longValue());
                inVar.f34900b.dismiss(true);
                break;
            default:
                j50 j50Var = (j50) this.f549b;
                e50 e50Var = (e50) this.f550c;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) this.d;
                k50 k50Var = j50Var.D0;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, j50Var.f29594a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (e50Var != null) {
                    photoEntry.ttl = e50Var.f27953c;
                    photoEntry.effectId = e50Var.d;
                }
                c50 c50Var = k50Var.f29971c;
                boolean z11 = z10 || e50Var == null || e50Var.f27951a;
                if (i10 != 0) {
                    i12 = i10;
                } else {
                    i12 = e50Var != null ? e50Var.f27952b : 0;
                }
                c50Var.s(photoEntry, videoEditedInfo, z11, i12, i11 != 0 ? i11 : 0, false, e50Var != null ? e50Var.f27954e : 0L);
                k50Var.m(false, false);
                break;
        }
    }

    @Override
    public boolean K(gy gyVar) {
        switch (this.f548a) {
        }
        return false;
    }

    @Override
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        z2.c cVar;
        int i10 = this.f548a;
        int i11 = 5;
        int i12 = 4;
        int i13 = 3;
        z2.c cVar2 = z2.c.CACHE_FULL;
        int i14 = 2;
        int i15 = 1;
        Object obj2 = this.d;
        Object obj3 = this.f550c;
        int i16 = 0;
        d3.h hVar = (d3.h) this.f549b;
        switch (i10) {
            case 5:
                w2.h hVar2 = (w2.h) obj3;
                w2.l lVar = hVar2.f48954c;
                String str = hVar2.f48952a;
                w2.i iVar = (w2.i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                d3.a aVar = hVar.d;
                if (jSimpleQueryForLong >= aVar.f4730a) {
                    hVar.e(1L, cVar2, str);
                    return -1L;
                }
                Long lB = d3.h.b(sQLiteDatabase, iVar);
                if (lB != null) {
                    jInsert = lB.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.f48957a);
                    contentValues.put("priority", Integer.valueOf(g3.a.a(iVar.f48959c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.f48958b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i17 = aVar.f4733e;
                byte[] bArr2 = lVar.f48966b;
                boolean z10 = bArr2.length <= i17;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar2.d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar2.f48955e));
                contentValues2.put("payload_encoding", lVar.f48965a.f48011a);
                contentValues2.put("code", hVar2.f48953b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i17));
                    for (int i18 = 1; i18 <= iCeil; i18++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i18 - 1) * i17, Math.min(i18 * i17, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i18));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(hVar2.f48956f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 6:
                ArrayList arrayList = (ArrayList) obj3;
                w2.i iVar2 = (w2.i) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j10 = cursor2.getLong(0);
                    boolean z11 = cursor2.getInt(7) != 0;
                    com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
                    mVar.f4606f = new HashMap();
                    String string = cursor2.getString(i15);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    mVar.f4602a = string;
                    mVar.d = Long.valueOf(cursor2.getLong(i14));
                    mVar.f4605e = Long.valueOf(cursor2.getLong(3));
                    if (z11) {
                        String string2 = cursor2.getString(4);
                        mVar.f4604c = new w2.l(string2 == null ? d3.h.f4742f : new t2.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        t2.c cVar3 = string3 == null ? d3.h.f4742f : new t2.c(string3);
                        Cursor cursorQuery = hVar.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i19 = 0;
                            int length2 = 0;
                            while (i19 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i19);
                                cursor = cursorQuery;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i19++;
                                    cursorQuery = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            mVar.f4604c = new w2.l(cVar3, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        mVar.f4603b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new d3.b(j10, iVar2, mVar.i()));
                    i14 = 2;
                    i15 = 1;
                }
                return null;
            default:
                HashMap map = (HashMap) obj3;
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) obj2;
                ArrayList arrayList4 = (ArrayList) tVar.d;
                Cursor cursor3 = (Cursor) obj;
                hVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i16);
                    int i20 = cursor3.getInt(1);
                    z2.c cVar4 = z2.c.REASON_UNKNOWN;
                    if (i20 != 0) {
                        if (i20 == 1) {
                            cVar4 = z2.c.MESSAGE_TOO_OLD;
                        } else if (i20 == 2) {
                            cVar = cVar2;
                        } else if (i20 == i13) {
                            cVar4 = z2.c.PAYLOAD_TOO_BIG;
                        } else if (i20 == i12) {
                            cVar4 = z2.c.MAX_RETRIES_REACHED;
                        } else if (i20 == i11) {
                            cVar4 = z2.c.INVALID_PAYLOD;
                        } else if (i20 == 6) {
                            cVar4 = z2.c.SERVER_ERROR;
                        } else {
                            a.a.a(Integer.valueOf(i20), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                        cVar = cVar4;
                    } else {
                        cVar = cVar4;
                    }
                    long j11 = cursor3.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new z2.d(j11, cVar));
                    i16 = 0;
                    i11 = 5;
                    i12 = 4;
                    i13 = 3;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i21 = z2.e.f50181c;
                    new ArrayList();
                    arrayList4.add(new z2.e((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                }
                long jE = hVar.f4744b.E();
                SQLiteDatabase sQLiteDatabaseA = hVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        z2.g gVar = new z2.g(cursorRawQuery.getLong(0), jE);
                        cursorRawQuery.close();
                        sQLiteDatabaseA.setTransactionSuccessful();
                        sQLiteDatabaseA.endTransaction();
                        tVar.f4620c = gVar;
                        tVar.f4621e = new z2.b(new z2.f(hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), d3.a.f4729f.f4730a));
                        tVar.f4619b = (String) hVar.f4746e.mo28get();
                        return new z2.a((z2.g) tVar.f4620c, DesugarCollections.unmodifiableList(arrayList4), (z2.b) tVar.f4621e, (String) tVar.f4619b);
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    sQLiteDatabaseA.endTransaction();
                    throw th4;
                }
        }
    }

    @Override
    public void b(int i10) {
        switch (this.f548a) {
            case 14:
                nh.w2 w2Var = (nh.w2) this.f549b;
                kc0 kc0Var = (kc0) this.f550c;
                String str = (String) this.d;
                if (i10 != 3) {
                    kc0Var.dismiss();
                }
                w2Var.d.f18599x.C(str, pa.C(i10).toLowerCase(Locale.ROOT), false);
                break;
            default:
                kc0 kc0Var2 = (kc0) this.f549b;
                e4 e4Var = (e4) this.f550c;
                String str2 = (String) this.d;
                if (i10 != 3) {
                    kc0Var2.dismiss();
                }
                e4Var.getWebViewContainer().C(str2, pa.C(i10).toLowerCase(Locale.ROOT), false);
                break;
        }
    }

    @Override
    public Object call() {
        w.b bVar;
        switch (this.f548a) {
            case 1:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f549b;
                String str = (String) this.d;
                Object obj = this.f550c;
                if (obj == null) {
                    bVar = null;
                } else {
                    try {
                        bVar = new w.b(obj);
                    } catch (w.f e9) {
                        androidx.car.app.utils.i.f(iOnDoneCallback, str, e9);
                        return null;
                    }
                }
                iOnDoneCallback.onSuccess(bVar);
                break;
            default:
                IOnDoneCallback iOnDoneCallback2 = (IOnDoneCallback) this.f549b;
                Exception exc = (Exception) this.f550c;
                String str2 = (String) this.d;
                try {
                    iOnDoneCallback2.onFailure(new w.b(new FailureResponse(exc)));
                } catch (w.f e10) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e10);
                    return null;
                }
                break;
        }
        return null;
    }

    @Override
    public void d(Canvas canvas, RectF rectF, float f10) {
        o7 o7Var = (o7) this.f549b;
        ik0 ik0Var = (ik0) this.f550c;
        int[] iArr = (int[]) this.d;
        o7Var.c(canvas, rectF, f10);
        o7Var.f(canvas, rectF, f10);
        if (o7Var.h) {
            o7Var.b(canvas, rectF, f10);
        } else {
            o7Var.e(canvas, rectF, f10);
        }
        if (ik0Var != null && ik0Var.T && ik0Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f10 * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            ik0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f548a) {
            case 0:
                i1.P((i1) this.f549b, (ArrayList) this.f550c, (TLRPC.User) this.d);
                break;
            case 12:
                ((q9) this.f549b).g1((o9) this.f550c, (Runnable) this.d, true);
                break;
            case 13:
                Activity activity = (Activity) this.f549b;
                boolean[] zArr = (boolean[]) this.f550c;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                sVar.run(bool, bool);
                break;
            case 15:
                boolean[] zArr2 = (boolean[]) this.f549b;
                Utilities.Callback callback = (Utilities.Callback) this.f550c;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
                zArr2[0] = true;
                callback.run(Boolean.FALSE);
                b2VarArr[0].dismiss();
                break;
            case 19:
                ChatActivityEnterView.i((ChatActivityEnterView) this.f549b, (MessageObject) this.f550c, (TL_keyboard.KeyboardButtonProto) this.d);
                break;
            case 22:
                gi giVar = (gi) this.f549b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.f550c;
                TLRPC.User user = (TLRPC.User) this.d;
                int i11 = giVar.F1;
                if (tL_attachMenuBot == null) {
                    MediaDataController.getInstance(i11).removeInline(user.f22527id);
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(user);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new gg(10, giVar, tL_attachMenuBot), 66);
                }
                break;
            default:
                in inVar = (in) this.f549b;
                View view = (View) this.f550c;
                z5 z5Var = (z5) this.d;
                inVar.getClass();
                view.setTag(null);
                inVar.X(view, z5Var, false);
                break;
        }
    }

    @Override
    public void h(int i10) {
        x4 x4Var = (x4) this.f549b;
        boolean[] zArr = (boolean[]) this.f550c;
        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.d;
        if (i10 == 1) {
            x4Var.I(2147483646, 0, zArr[0]);
            z2Var.f23994a.dismissRunnable.run();
        }
    }

    @Override
    public Object i() {
        b3.a aVar = (b3.a) this.f549b;
        w2.i iVar = (w2.i) this.f550c;
        w2.h hVar = (w2.h) this.d;
        d3.h hVar2 = (d3.h) aVar.d;
        hVar2.getClass();
        t2.d dVar = iVar.f48959c;
        String str = hVar.f48952a;
        String str2 = iVar.f48957a;
        String strC = a.a.c("SQLiteEventStore");
        if (Log.isLoggable(strC, 3)) {
            Log.d(strC, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.c(new l0(hVar2, hVar, iVar, 5))).getClass();
        aVar.f1905a.y(iVar, 1, false);
        return null;
    }

    @Override
    public void m(fc0 fc0Var, int i10) {
        switch (this.f548a) {
            case 16:
                y4.g(null, null, 0L, 0L, 0, (fc0) this.f549b, (a4) this.f550c, (b4) this.d);
                break;
            default:
                y4.g(null, null, 0L, 0L, 0, (fc0) this.f549b, (s3) this.f550c, (u3) this.d);
                break;
        }
    }

    @Override
    public void run(String str) {
        x3 x3Var = (x3) this.f549b;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f550c;
        c6 c6Var = (c6) this.d;
        jh.e4 e4Var = x3Var.f14128l;
        e4Var.getStoriesController().r(e4Var.f13291x1, str, new gh.i(x3Var, storyItem, c6Var, 6));
    }

    @Override
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f549b;
        String str = (String) this.f550c;
        com.google.firebase.messaging.u uVar = (com.google.firebase.messaging.u) this.d;
        String str2 = (String) obj;
        ga.c cVarC = FirebaseMessaging.c(firebaseMessaging.f4541b);
        t8.h hVar = firebaseMessaging.f4540a;
        hVar.a();
        String strD = "[DEFAULT]".equals(hVar.f48120b) ? "" : hVar.d();
        String strA = firebaseMessaging.f4546i.a();
        synchronized (cVarC) {
            String strA2 = com.google.firebase.messaging.u.a(System.currentTimeMillis(), str2, strA);
            if (strA2 != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) cVarC.f6834b).edit();
                editorEdit.putString(strD + "|T|" + str + "|*", strA2);
                editorEdit.commit();
            }
        }
        if (uVar == null || !str2.equals(uVar.f4622a)) {
            t8.h hVar2 = firebaseMessaging.f4540a;
            hVar2.a();
            if ("[DEFAULT]".equals(hVar2.f48120b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    hVar2.a();
                    sb2.append(hVar2.f48120b);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new com.google.firebase.messaging.i(firebaseMessaging.f4541b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        switch (this.f548a) {
            case 8:
                return i5.X((i5) this.f549b, (TL_stars.TL_starGiftUnique) this.f550c, (gy) this.d, arrayList);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f549b;
                MessageObject messageObject = (MessageObject) this.f550c;
                TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline = (TL_keyboard.TL_inlineButtonTypeSwitchInline) this.d;
                rn rnVar = chatActivityEnterView.K2;
                TLRPC.Message message = messageObject.messageOwner;
                long j10 = message.from_id.user_id;
                long j11 = message.via_bot_id;
                if (j11 != 0) {
                    j10 = j11;
                }
                TLRPC.User user = chatActivityEnterView.N.getMessagesController().getUser(Long.valueOf(j10));
                if (user == null) {
                    gyVar.finishFragment();
                } else {
                    long j12 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
                    MediaDataController.getInstance(chatActivityEnterView.M).saveDraft(j12, 0, "@" + UserObject.getPublicUsername(user) + " " + tL_inlineButtonTypeSwitchInline.query, null, null, true, 0L);
                    if (j12 == chatActivityEnterView.L2 || DialogObject.isEncryptedDialog(j12)) {
                        gyVar.finishFragment();
                    } else {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(j12)) {
                            bundle.putLong("user_id", j12);
                        } else {
                            bundle.putLong("chat_id", -j12);
                        }
                        if (chatActivityEnterView.N.getMessagesController().checkCanOpenChat(bundle, gyVar)) {
                            if (!rnVar.presentFragment(new rn(bundle), true)) {
                                gyVar.finishFragment();
                            } else if (!AndroidUtilities.isTablet()) {
                                rnVar.removeSelfFromStack();
                            }
                        }
                    }
                }
                return true;
        }
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        switch (this.f548a) {
            case 11:
                lh.y1 y1Var = (lh.y1) this.f549b;
                String str2 = (String) this.f550c;
                MediaDataController mediaDataController = (MediaDataController) this.d;
                ArrayList arrayList6 = y1Var.h;
                SparseIntArray sparseIntArray = y1Var.f17078y;
                ArrayList arrayList7 = y1Var.f17073n;
                lh.z1 z1Var = y1Var.J;
                ArrayList arrayList8 = y1Var.v;
                HashSet hashSet = y1Var.H;
                ArrayList arrayList9 = y1Var.f17075s;
                if (TextUtils.equals(str2, y1Var.D)) {
                    ArrayList<Emoji.EmojiSpanRange> emojis = Emoji.parseEmojis(y1Var.D);
                    for (int i10 = 0; i10 < emojis.size(); i10++) {
                        try {
                            MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                            keywordResult.emoji = emojis.get(i10).code.toString();
                            arrayList5.add(keywordResult);
                        } catch (Exception unused) {
                        }
                    }
                    y1Var.f17077x = 0;
                    arrayList9.clear();
                    arrayList8.clear();
                    sparseIntArray.clear();
                    arrayList7.clear();
                    y1Var.f17077x++;
                    arrayList9.add(null);
                    arrayList8.add(0L);
                    if (z1Var.f16935a == 0) {
                        hashSet.clear();
                        for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                            MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList5.get(i11);
                            String str3 = keywordResult2.emoji;
                            if (str3 != null && !str3.startsWith("animated_") && (arrayList4 = (ArrayList) y1Var.d.get(keywordResult2.emoji)) != null) {
                                hashSet.addAll(arrayList4);
                            }
                        }
                        arrayList8.addAll(hashSet);
                        for (int i12 = 0; i12 < hashSet.size(); i12++) {
                            arrayList9.add(null);
                        }
                        y1Var.f17077x = hashSet.size() + y1Var.f17077x;
                    } else {
                        HashMap<String, ArrayList<TLRPC.Document>> allStickers = mediaDataController.getAllStickers();
                        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                            MediaDataController.KeywordResult keywordResult3 = (MediaDataController.KeywordResult) arrayList5.get(i13);
                            String str4 = keywordResult3.emoji;
                            if (str4 != null && !str4.startsWith("animated_") && (arrayList3 = allStickers.get(keywordResult3.emoji)) != null && !arrayList3.isEmpty()) {
                                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                    TLRPC.Document document = arrayList3.get(i14);
                                    if (document != null && !arrayList9.contains(document)) {
                                        arrayList9.add(document);
                                        y1Var.f17077x++;
                                    }
                                }
                            }
                        }
                        ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
                        int i15 = 0;
                        while (i15 < arrayList5.size()) {
                            MediaDataController.KeywordResult keywordResult4 = (MediaDataController.KeywordResult) arrayList5.get(i15);
                            String str5 = keywordResult4.emoji;
                            if (str5 != null && !str5.startsWith("animated_")) {
                                for (int i16 = 0; i16 < featuredStickerSets.size(); i16++) {
                                    TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i16);
                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                        arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                    } else if (!stickerSetCovered.covers.isEmpty()) {
                                        arrayList2 = stickerSetCovered.covers;
                                    } else {
                                        if (stickerSetCovered.cover != null) {
                                            ArrayList<TLRPC.Document> arrayList10 = new ArrayList<>();
                                            arrayList10.add(stickerSetCovered.cover);
                                            arrayList2 = arrayList10;
                                        }
                                    }
                                    for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                                        String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i17), null);
                                        if (strFindAnimatedEmojiEmoticon != null && strFindAnimatedEmojiEmoticon.contains(keywordResult4.emoji)) {
                                            arrayList9.add(arrayList2.get(i17));
                                            y1Var.f17077x++;
                                        }
                                    }
                                }
                            }
                            i15++;
                            arrayList5 = arrayList;
                        }
                    }
                    String strTranslitSafe = AndroidUtilities.translitSafe((y1Var.D + "").toLowerCase());
                    for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
                        if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                            String strTranslitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                            if (strTranslitSafe2.startsWith(strTranslitSafe) || org.telegram.messenger.y1.x(" ", strTranslitSafe, strTranslitSafe2)) {
                                int size = arrayList7.size();
                                arrayList7.add(tL_messages_stickerSet);
                                sparseIntArray.put(y1Var.f17077x, size);
                                arrayList9.add(null);
                                y1Var.f17077x++;
                                arrayList9.addAll(tL_messages_stickerSet.documents);
                                y1Var.f17077x = tL_messages_stickerSet.documents.size() + y1Var.f17077x;
                            }
                        }
                    }
                    boolean z10 = arrayList8.size() <= 1 && arrayList9.size() <= 1;
                    y1Var.f17076w = z10;
                    if (z10) {
                        y1Var.f17077x++;
                    }
                    if (!z10) {
                        y1Var.G++;
                    }
                    y1Var.E = y1Var.D;
                    y1Var.l();
                    lh.o1.w1(z1Var.f17173b, 0, 0);
                    z1Var.f17176f.c(false);
                    z1Var.f17175e.n(false);
                    break;
                }
                break;
            case 27:
                vx vxVar = (vx) this.f549b;
                String str6 = (String) this.f550c;
                Runnable runnable = (Runnable) this.d;
                wx wxVar = vxVar.f34062a;
                if (str6.equals(wxVar.v)) {
                    wxVar.f34360w = str;
                    wxVar.f34357n.addAll(arrayList5);
                    runnable.run();
                    break;
                }
                break;
            default:
                ry ryVar = (ry) this.f549b;
                HashMap map = (HashMap) this.f550c;
                Runnable runnable2 = (Runnable) this.d;
                HashMap map2 = ryVar.f32273f;
                if (ryVar.f32277w.I == ryVar.f32270b) {
                    int size2 = arrayList5.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        String str7 = ((MediaDataController.KeywordResult) arrayList5.get(i19)).emoji;
                        ArrayList arrayList11 = (ArrayList) map.get(str7);
                        if (arrayList11 != null && !arrayList11.isEmpty() && !map2.containsKey(arrayList11)) {
                            map2.put(arrayList11, str7);
                            ryVar.h.add(arrayList11);
                        }
                    }
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
