package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
public final class m7d extends t6d {
    public final xjb b;
    public final TaskCompletionSource c;
    public final uif d;

    public m7d(int i, xjb xjbVar, TaskCompletionSource taskCompletionSource, uif uifVar) {
        super(i);
        this.c = taskCompletionSource;
        this.b = xjbVar;
        this.d = uifVar;
        if (i == 2 && xjbVar.b) {
            lq5.j("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override
    public final void a(Status status) {
        Exception a;
        switch (this.d.a) {
            case 13:
                a = sqd.a(status);
                break;
            default:
                int i = status.a;
                int i2 = status.a;
                String str = status.b;
                if (i == 8) {
                    if (str == null) {
                        str = qwd.a(i2);
                    }
                    a = new w30(str);
                    break;
                } else {
                    if (str == null) {
                        str = qwd.a(i2);
                    }
                    a = new w30(str);
                    break;
                }
        }
        this.c.trySetException(a);
    }

    @Override
    public final void b(RuntimeException runtimeException) {
        this.c.trySetException(runtimeException);
    }

    @Override
    public final void c(zhc zhcVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        TaskCompletionSource taskCompletionSource = this.c;
        ((Map) zhcVar.c).put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new k7b(zhcVar, taskCompletionSource));
    }

    @Override
    public final void d(l6d l6dVar) {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            this.b.c(l6dVar.b, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(o7d.e(e2));
        } catch (RuntimeException e3) {
            taskCompletionSource.trySetException(e3);
        }
    }

    @Override
    public final a94[] f(l6d l6dVar) {
        return this.b.a;
    }

    @Override
    public final boolean g(l6d l6dVar) {
        return this.b.b;
    }

    @Override
    public final int h(l6d l6dVar) {
        return this.b.c;
    }
}
