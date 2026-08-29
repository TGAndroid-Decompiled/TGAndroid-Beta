package eg;

import android.content.pm.ShortcutManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Insets;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import ih.q5;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.Components.mc0;
public final class c implements org.telegram.ui.ActionBar.b2, mc0, f3.f, g4.g, j3.f, Continuation, a9.e, GenericProvider, p8.e, f5.j {
    public final int f5931a;

    public c(int i10) {
        this.f5931a = i10;
    }

    public static int a(Insets insets) {
        return insets.left;
    }

    public static ShortcutManager d(Object obj) {
        return (ShortcutManager) obj;
    }

    public static FingerprintManager f(Object obj) {
        return (FingerprintManager) obj;
    }

    public static OnBackInvokedDispatcher i(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static Class k() {
        return ShortcutManager.class;
    }

    public static int l(Insets insets) {
        return insets.right;
    }

    public static int m(Insets insets) {
        return insets.bottom;
    }

    @Override
    public Object I0(a5.j jVar) {
        Set r6 = jVar.r(ha.a.class);
        ha.c cVar = ha.c.f7979c;
        if (cVar == null) {
            synchronized (ha.c.class) {
                try {
                    cVar = ha.c.f7979c;
                    if (cVar == null) {
                        cVar = new ha.c(0);
                        ha.c.f7979c = cVar;
                    }
                } finally {
                }
            }
        }
        return new ha.b(r6, cVar);
    }

    @Override
    public Object apply(Object obj) {
        byte[] decode;
        switch (this.f5931a) {
            case 6:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        v5.c a2 = y2.i.a();
                        a2.h(rawQuery.getString(1));
                        a2.d = i3.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        if (string == null) {
                            decode = null;
                        } else {
                            decode = Base64.decode(string, 0);
                        }
                        a2.f49409b = decode;
                        arrayList.add(a2.d());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            default:
                return new k3.f((f5.y) obj);
        }
    }

    @Override
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override
    public j3.g c(Bundle bundle) {
        return new g5.b(bundle.getInt(g5.b.f7024f, -1), bundle.getInt(g5.b.h, -1), bundle.getInt(g5.b.f7025n, -1), bundle.getByteArray(g5.b.f7026r));
    }

    @Override
    public String e(int i10) {
        switch (this.f5931a) {
            case 1:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f5931a) {
            case 0:
                return;
            case 3:
                c2Var.dismiss();
                return;
            case 4:
                c2Var.dismiss();
                return;
            case 22:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        j3.a2 a2Var = (j3.a2) obj;
        switch (this.f5931a) {
            case 26:
                a2Var.onPlayerError(new j3.n(2, new RuntimeException("Player release timed out."), 1003));
                return;
            default:
                a2Var.onSeekProcessed();
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = q5.f9338g0;
        return 0;
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        if (task.isSuccessful()) {
            g9.b bVar = (g9.b) task.getResult();
            d9.d dVar = d9.d.f5538a;
            dVar.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f7147b);
            z10 = true;
            if (bVar.f7148c.delete()) {
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

    public c(bg.c2 c2Var) {
        this.f5931a = 15;
    }

    private final void n(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
    }
}
