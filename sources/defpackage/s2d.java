package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class s2d extends c2d {
    public final TaskCompletionSource b;
    public final byte c;
    public final Object d;

    public s2d(u56 u56Var, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.c = (byte) 1;
        this.d = u56Var;
    }

    @Override
    public final void a(Status status) {
        this.b.trySetException(new zn(status));
    }

    @Override
    public final void b(RuntimeException runtimeException) {
        this.b.trySetException(runtimeException);
    }

    @Override
    public final void c(aec aecVar, boolean z) {
        byte b = this.c;
    }

    @Override
    public final void d(u1d u1dVar) {
        try {
            k(u1dVar);
        } catch (DeadObjectException e) {
            a(x2d.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(x2d.e(e2));
        } catch (RuntimeException e3) {
            this.b.trySetException(e3);
        }
    }

    @Override
    public final f84[] f(u1d u1dVar) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((g2d) obj).a.b;
            default:
                g2d g2dVar = (g2d) u1dVar.f.get((u56) obj);
                if (g2dVar == null) {
                    return null;
                }
                return g2dVar.a.b;
        }
    }

    @Override
    public final boolean g(u1d u1dVar) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((g2d) obj).a.c;
            default:
                g2d g2dVar = (g2d) u1dVar.f.get((u56) obj);
                if (g2dVar != null && g2dVar.a.c) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h(u1d u1dVar) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((g2d) obj).a.d;
            default:
                g2d g2dVar = (g2d) u1dVar.f.get((u56) obj);
                if (g2dVar != null) {
                    return g2dVar.a.d;
                }
                return -1;
        }
    }

    public final void k(u1d u1dVar) {
        switch (this.c) {
            case 0:
                g2d g2dVar = (g2d) this.d;
                h2d h2dVar = g2dVar.a;
                h2dVar.e.a.accept(u1dVar.b, this.b);
                u56 u56Var = h2dVar.a.b;
                if (u56Var != null) {
                    u1dVar.f.put(u56Var, g2dVar);
                    return;
                }
                return;
            default:
                g2d g2dVar2 = (g2d) u1dVar.f.remove((u56) this.d);
                if (g2dVar2 != null) {
                    ((t59) g2dVar2.b.c).b.accept(u1dVar.b, this.b);
                    g2dVar2.a.a.b = null;
                    return;
                }
                this.b.trySetResult(Boolean.FALSE);
                return;
        }
    }

    public s2d(int i, TaskCompletionSource taskCompletionSource) {
        super(i);
        this.b = taskCompletionSource;
    }

    public s2d(g2d g2dVar, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.c = (byte) 0;
        this.d = g2dVar;
    }

    private final void i(aec aecVar, boolean z) {
    }

    private final void j(aec aecVar, boolean z) {
    }
}
