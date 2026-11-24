package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
public final class x4d extends e4d {
    public final cib b;
    public final TaskCompletionSource c;
    public final fgf d;

    public x4d(int i, cib cibVar, TaskCompletionSource taskCompletionSource, fgf fgfVar) {
        super(i);
        this.c = taskCompletionSource;
        this.b = cibVar;
        this.d = fgfVar;
        if (i == 2 && cibVar.b) {
            u36.j("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override
    public final void a(Status status) {
        Exception a;
        switch (this.d.a) {
            case 13:
                a = dod.a(status);
                break;
            default:
                int i = status.a;
                int i2 = status.a;
                String str = status.b;
                if (i == 8) {
                    if (str == null) {
                        str = dud.a(i2);
                    }
                    a = new v40(str);
                    break;
                } else {
                    if (str == null) {
                        str = dud.a(i2);
                    }
                    a = new v40(str);
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
    public final void c(rhb rhbVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        TaskCompletionSource taskCompletionSource = this.c;
        ((Map) rhbVar.c).put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new xab(rhbVar, taskCompletionSource));
    }

    @Override
    public final void d(w3d w3dVar) {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            this.b.c(w3dVar.b, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(z4d.e(e2));
        } catch (RuntimeException e3) {
            taskCompletionSource.trySetException(e3);
        }
    }

    @Override
    public final o94[] f(w3d w3dVar) {
        return this.b.a;
    }

    @Override
    public final boolean g(w3d w3dVar) {
        return this.b.b;
    }

    @Override
    public final int h(w3d w3dVar) {
        return this.b.c;
    }
}
