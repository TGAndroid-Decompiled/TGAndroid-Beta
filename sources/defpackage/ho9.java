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
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.ArrayList;
public final class ho9 implements jo9, us2, ed, wkb, xkb, eia, fia, Continuation, js4, j8c, bha, OnFailureListener {
    public final byte a;

    public ho9(byte b) {
        this.a = b;
    }

    public static ApplicationExitInfo a(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static ShortcutManager f(Object obj) {
        return (ShortcutManager) obj;
    }

    public static Class j() {
        return ShortcutManager.class;
    }

    public static void l(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static void n(Throwable th) {
        throw new IllegalStateException(th);
    }

    @Override
    public final void accept(Object obj) {
        ((ep9) obj).b.release();
    }

    @Override
    public final Object apply(Object obj) {
        byte[] decode;
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                mv6 a = ra0.a();
                a.j0(rawQuery.getString(1));
                a.d = dj8.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                if (string == null) {
                    decode = null;
                } else {
                    decode = Base64.decode(string, 0);
                }
                a.c = decode;
                arrayList.add(a.o());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override
    public final void b(Object obj, float f) {
        k4a k4aVar = (k4a) obj;
        k4aVar.n = f;
        k4aVar.invalidate();
    }

    @Override
    public final float c(RecyclerView recyclerView) {
        return dha.j(recyclerView);
    }

    @Override
    public final void d(int i, View view) {
        switch (this.a) {
            case 6:
                int i2 = qt9.x;
                ((qt9) view).setTextColor(i);
                return;
            default:
                ((fta) view).setColor(i);
                return;
        }
    }

    @Override
    public final int e(View view) {
        switch (this.a) {
            case 5:
                return ((qt9) view).w;
            default:
                return ((fta) view).y;
        }
    }

    @Override
    public final Object g(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        if (num.intValue() == 0) {
            return k96.G(num2.intValue(), "MaximumReactionsValue", new Object[0]);
        }
        return String.valueOf(num2);
    }

    @Override
    public final float get(Object obj) {
        return ((k4a) obj).n;
    }

    @Override
    public final RecyclerView h(View view) {
        return ((gva) view).a;
    }

    @Override
    public final Object m(Object obj) {
        Integer num = (Integer) obj;
        int i = taa.T2;
        return 0;
    }

    @Override
    public final void t(RecyclerView recyclerView) {
        de9.d(recyclerView);
    }

    @Override
    public final Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            b80 b80Var = (b80) task.getResult();
            c6e c6eVar = c6e.b;
            c6eVar.g("Crashlytics report successfully enqueued to DataTransport: " + b80Var.b);
            File file = b80Var.c;
            if (file.delete()) {
                c6eVar.g("Deleted report file: " + file.getPath());
            } else {
                c6eVar.l("Crashlytics could not delete report file: " + file.getPath(), null);
            }
            z = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 3:
                hdVar.dismiss();
                return;
            case 4:
                hdVar.dismiss();
                return;
            case 13:
                return;
            case 14:
                hdVar.dismiss();
                return;
            case 15:
                hdVar.dismiss();
                return;
            case 16:
                hdVar.dismiss();
                return;
            default:
                vqa.g2(new p3c(6, null));
                return;
        }
    }

    @Override
    public final void onFailure(Exception exc) {
    }

    private final void p(hd hdVar, int i) {
    }
}
