package a9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.fingerprint.FingerprintManager;
import android.media.MediaRoute2Info;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import b5.x;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.messaging.p;
import e4.g;
import j4.i1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.xb0;
import w2.i;
public final class b implements x9.a, y8.d, h3.f, b2, xb0, Continuation, t2.e, d3.f, g, Vector.TLDeserializer {
    public final int f116a;

    public b(int i9) {
        this.f116a = i9;
    }

    private final java.lang.Object b(b3.b r45) {
        throw new UnsupportedOperationException("Method not decompiled: a9.b.b(b3.b):java.lang.Object");
    }

    public static FingerprintManager d(Object obj) {
        return (FingerprintManager) obj;
    }

    public static MediaRoute2Info h(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public Object H1(b3.b bVar) {
        FirebaseMessaging lambda$getComponents$0;
        switch (this.f116a) {
            case 1:
                return b(bVar);
            case 17:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(bVar);
                return lambda$getComponents$0;
            default:
                Set x10 = bVar.x(fa.a.class);
                fa.c cVar = fa.c.f6032c;
                if (cVar == null) {
                    synchronized (fa.c.class) {
                        try {
                            cVar = fa.c.f6032c;
                            if (cVar == null) {
                                cVar = new fa.c(0);
                                fa.c.f6032c = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new fa.b(x10, cVar);
        }
    }

    @Override
    public boolean a(int i9, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f116a) {
            case 18:
                ea.e eVar = (ea.e) obj;
                eVar.getClass();
                t5.c cVar = p.f4172a;
                cVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    cVar.c(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            default:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        t5.c a2 = i.a();
                        a2.h(rawQuery.getString(1));
                        a2.d = g3.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a2.f47682b = decode;
                        arrayList.add(a2.b());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
        }
    }

    @Override
    public h3.g c(Bundle bundle) {
        List aVar;
        switch (this.f116a) {
            case 5:
                Bundle bundle2 = bundle.getBundle(x.f1506c);
                bundle2.getClass();
                i1 i1Var = (i1) i1.f13480n.c(bundle2);
                int[] intArray = bundle.getIntArray(x.d);
                intArray.getClass();
                if (intArray.length == 0) {
                    aVar = Collections.EMPTY_LIST;
                } else {
                    aVar = new q8.a(0, intArray.length, intArray);
                }
                return new x(i1Var, aVar);
            default:
                return new e5.b(bundle.getInt(e5.b.f4868f, -1), bundle.getInt(e5.b.h, -1), bundle.getInt(e5.b.f4869n, -1), bundle.getByteArray(e5.b.f4870r));
        }
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i9, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i9, z10);
    }

    @Override
    public void e(x9.b bVar) {
        switch (this.f116a) {
            case 0:
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
                }
                bVar.get().getClass();
                throw new ClassCastException();
            default:
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override
    public void f(c2 c2Var, int i9) {
        switch (this.f116a) {
            case 7:
                return;
            case 10:
                c2Var.dismiss();
                return;
            case 11:
                c2Var.dismiss();
                return;
            case 28:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public String g(int i9) {
        switch (this.f116a) {
            case 8:
                return String.valueOf(i9);
            default:
                return String.format("%02d", Integer.valueOf(i9 * 5));
        }
    }

    @Override
    public Object then(Task task) {
        int i9;
        boolean z10;
        File file;
        switch (this.f116a) {
            case 14:
                i9 = 403;
                break;
            case 15:
                i9 = -1;
                break;
            default:
                if (task.isSuccessful()) {
                    e9.b bVar = (e9.b) task.getResult();
                    b9.d dVar = b9.d.f1664a;
                    dVar.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f4993b);
                    z10 = true;
                    if (bVar.f4994c.delete()) {
                        dVar.b("Deleted report file: " + file.getPath());
                    } else {
                        dVar.d("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
        return Integer.valueOf(i9);
    }

    public b(Object obj, int i9) {
        this.f116a = i9;
    }

    private final void k(c2 c2Var, int i9) {
    }
}
