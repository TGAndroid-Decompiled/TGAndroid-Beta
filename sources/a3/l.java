package a3;

import a8.r7;
import android.util.Log;
import android.view.View;
import bi.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.j9;
import org.telegram.messenger.y10;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.b41;
public final class l implements g9.k, Continuation, l5.e, h2.j, Vector.TLDeserializer, q1, y10, j9, u9.d {
    public final int f102a;

    public l(int i7) {
        this.f102a = i7;
    }

    @Override
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: a3.l.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i7, z10);
    }

    @Override
    public void h(t1 t1Var, int i7) {
        switch (this.f102a) {
            case 19:
                t1Var.dismiss();
                return;
            default:
                t1Var.dismiss();
                return;
        }
    }

    @Override
    public Object i(r7 r7Var) {
        Set I = r7Var.I(cb.a.class);
        cb.c cVar = cb.c.f4866c;
        if (cVar == null) {
            synchronized (cb.c.class) {
                try {
                    cVar = cb.c.f4866c;
                    if (cVar == null) {
                        cVar = new cb.c(0);
                        cb.c.f4866c = cVar;
                    }
                } finally {
                }
            }
        }
        return new cb.b(I, cVar);
    }

    @Override
    public Object o(Object obj) {
        Integer num = (Integer) obj;
        int i7 = z5.f4032g2;
        return 0;
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        int i7;
        switch (this.f102a) {
            case 5:
                if (task.isSuccessful()) {
                    aa.b bVar = (aa.b) task.getResult();
                    x9.b bVar2 = x9.b.f59856a;
                    bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f780b);
                    z10 = true;
                    if (bVar.f781c.delete()) {
                        bVar2.b("Deleted report file: " + file.getPath());
                    } else {
                        bVar2.d("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 6:
            default:
                i7 = -1;
                break;
            case 7:
                i7 = 403;
                break;
        }
        return Integer.valueOf(i7);
    }

    public l(Object obj, int i7) {
        this.f102a = i7;
    }
}
