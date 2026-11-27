package defpackage;

import android.app.ApplicationExitInfo;
import android.content.pm.ShortcutManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpTransceiver;
public final class vr9 implements NativeLifecycleLock.NativePointerCallable, NativeLifecycleLock.NativePointerRunnable, bs9, ot2, fd, vob, wob, zla, ama, Continuation, nu4, jcc {
    public final byte a;

    public vr9(byte b) {
        this.a = b;
    }

    public static ApplicationExitInfo a(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static Class i() {
        return ShortcutManager.class;
    }

    public static void k(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static void l(Throwable th) {
        throw new IllegalStateException(th);
    }

    @Override
    public final void accept(Object obj) {
        ((ws9) obj).b.release();
    }

    @Override
    public final Object apply(Object obj) {
        byte[] decode;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                rx6 a = ta0.a();
                a.o0(rawQuery.getString(1));
                a.d = qm8.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                if (string == null) {
                    decode = null;
                } else {
                    decode = Base64.decode(string, 0);
                }
                a.c = decode;
                arrayList.add(a.t());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override
    public final Object call(long j) {
        RtpTransceiver.RtpTransceiverDirection lambda$getDirection$3;
        MediaStreamTrack.MediaType lambda$getMediaType$0;
        switch (this.a) {
            case 0:
                lambda$getDirection$3 = RtpTransceiver.lambda$getDirection$3(j);
                return lambda$getDirection$3;
            default:
                lambda$getMediaType$0 = RtpTransceiver.lambda$getMediaType$0(j);
                return lambda$getMediaType$0;
        }
    }

    @Override
    public final void d(Object obj, float f) {
        c8a c8aVar = (c8a) obj;
        c8aVar.n = f;
        c8aVar.invalidate();
    }

    @Override
    public final void e(int i, View view) {
        switch (this.a) {
            case 9:
                int i2 = kx9.x;
                ((kx9) view).setTextColor(i);
                return;
            default:
                ((ixa) view).setColor(i);
                return;
        }
    }

    @Override
    public final int f(View view) {
        switch (this.a) {
            case 8:
                return ((kx9) view).w;
            default:
                return ((ixa) view).y;
        }
    }

    @Override
    public final Object g(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        if (num.intValue() == 0) {
            return ob6.G(num2.intValue(), "MaximumReactionsValue", new Object[0]);
        }
        return String.valueOf(num2);
    }

    @Override
    public final float get(Object obj) {
        return ((c8a) obj).n;
    }

    @Override
    public final Object h(Object obj) {
        Integer num = (Integer) obj;
        int i = kea.T2;
        return 0;
    }

    @Override
    public final void run(long j) {
        RtpTransceiver.lambda$stopStandard$9(j);
    }

    @Override
    public final Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            d80 d80Var = (d80) task.getResult();
            sae saeVar = sae.b;
            saeVar.f("Crashlytics report successfully enqueued to DataTransport: " + d80Var.b);
            File file = d80Var.c;
            if (file.delete()) {
                saeVar.f("Deleted report file: " + file.getPath());
            } else {
                saeVar.l("Crashlytics could not delete report file: " + file.getPath(), null);
            }
            z = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 6:
                idVar.dismiss();
                return;
            case 7:
                idVar.dismiss();
                return;
            case 16:
                return;
            case 17:
                idVar.dismiss();
                return;
            case 18:
                idVar.dismiss();
                return;
            case 19:
                idVar.dismiss();
                return;
            default:
                wua.h2(new o7c(6, null));
                return;
        }
    }

    private final void m(id idVar, int i) {
    }
}
