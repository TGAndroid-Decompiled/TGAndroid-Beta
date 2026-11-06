package a3;

import a8.r7;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.ad;
import bi.da;
import bi.k7;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.b20;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.ya1;
public final class l implements g9.k, Continuation, l5.e, h2.j, Vector.TLDeserializer, b20, r1, o6, p6, ft0, u9.d {
    public final int f102a;

    public l(int i7) {
        this.f102a = i7;
    }

    @Override
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
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
    public void c(int i7, View view) {
        ((da) view).setColor(i7);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z9) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i7, z9);
    }

    @Override
    public Object e(r7 r7Var) {
        Set H = r7Var.H(cb.a.class);
        cb.c cVar = cb.c.f6038c;
        if (cVar == null) {
            synchronized (cb.c.class) {
                try {
                    cVar = cb.c.f6038c;
                    if (cVar == null) {
                        cVar = new cb.c(0);
                        cb.c.f6038c = cVar;
                    }
                } finally {
                }
            }
        }
        return new cb.b(H, cVar);
    }

    @Override
    public void g(u1 u1Var, int i7) {
        switch (this.f102a) {
            case 22:
                int i10 = k7.f4163s3;
                return;
            default:
                k7.c2(new ya1(6, null));
                return;
        }
    }

    @Override
    public float h(RecyclerView recyclerView) {
        return f1.c(recyclerView);
    }

    @Override
    public int i(View view) {
        return ((da) view).f3694y;
    }

    @Override
    public RecyclerView l(View view) {
        return ((ad) view).f3468a;
    }

    @Override
    public void s(RecyclerView recyclerView) {
        f1.b(recyclerView);
    }

    @Override
    public Object then(Task task) {
        boolean z9;
        File file;
        int i7;
        switch (this.f102a) {
            case 5:
                if (task.isSuccessful()) {
                    aa.b bVar = (aa.b) task.getResult();
                    x9.b bVar2 = x9.b.f58570a;
                    bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f776b);
                    z9 = true;
                    if (bVar.f777c.delete()) {
                        bVar2.b("Deleted report file: " + file.getPath());
                    } else {
                        bVar2.d("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z9 = false;
                }
                return Boolean.valueOf(z9);
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
