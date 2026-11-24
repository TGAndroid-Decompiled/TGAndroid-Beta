package defpackage;

import android.app.ApplicationExitInfo;
import android.content.pm.ShortcutManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
public final class dq9 implements kq9, fu2, ee, xmb, ymb, gka, hka, Continuation, ku4, kac, dja {
    public final byte a;

    public dq9(byte b) {
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

    public static void m(String str) {
        throw new IllegalStateException(str);
    }

    public static void n(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static void o(Throwable th) {
        throw new IllegalStateException(th);
    }

    @Override
    public final void accept(Object obj) {
        ((fr9) obj).b.release();
    }

    @Override
    public final Object apply(Object obj) {
        byte[] decode;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                mx6 a = rb0.a();
                a.m0(rawQuery.getString(1));
                a.d = gl8.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                if (string == null) {
                    decode = null;
                } else {
                    decode = Base64.decode(string, 0);
                }
                a.c = decode;
                arrayList.add(a.u());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override
    public final void d(Object obj, float f) {
        m6a m6aVar = (m6a) obj;
        m6aVar.n = f;
        m6aVar.invalidate();
    }

    @Override
    public final void e(int i, View view) {
        switch (this.a) {
            case 7:
                int i2 = sv9.x;
                ((sv9) view).setTextColor(i);
                return;
            default:
                ((iva) view).setColor(i);
                return;
        }
    }

    @Override
    public final float f(RecyclerView recyclerView) {
        return fja.j(recyclerView);
    }

    @Override
    public final int g(View view) {
        switch (this.a) {
            case 6:
                return ((sv9) view).w;
            default:
                return ((iva) view).y;
        }
    }

    @Override
    public final float get(Object obj) {
        return ((m6a) obj).n;
    }

    @Override
    public final RecyclerView h(View view) {
        return ((kxa) view).a;
    }

    @Override
    public final Object j(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        if (num.intValue() == 0) {
            return jb6.G(num2.intValue(), "MaximumReactionsValue", new Object[0]);
        }
        return String.valueOf(num2);
    }

    @Override
    public final Object l(Object obj) {
        Integer num = (Integer) obj;
        int i = tca.T2;
        return 0;
    }

    @Override
    public final void q(RecyclerView recyclerView) {
        hg9.d(recyclerView);
    }

    @Override
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 4:
                heVar.dismiss();
                return;
            case 5:
                heVar.dismiss();
                return;
            case 14:
                return;
            case 15:
                heVar.dismiss();
                return;
            case 16:
                heVar.dismiss();
                return;
            case 17:
                heVar.dismiss();
                return;
            default:
                wsa.g2(new p5c(6, null));
                return;
        }
    }

    @Override
    public final Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            b90 b90Var = (b90) task.getResult();
            f8e f8eVar = f8e.b;
            f8eVar.f("Crashlytics report successfully enqueued to DataTransport: " + b90Var.b);
            File file = b90Var.c;
            if (file.delete()) {
                f8eVar.f("Deleted report file: " + file.getPath());
            } else {
                f8eVar.l("Crashlytics could not delete report file: " + file.getPath(), null);
            }
            z = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private final void s(he heVar, int i) {
    }
}
