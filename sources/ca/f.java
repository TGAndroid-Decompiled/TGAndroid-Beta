package ca;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f2201a;
    public final TaskCompletionSource f2202b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f2201a = jVar;
        this.f2202b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f2202b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(da.b bVar) {
        if (bVar.f4307b == 4 && !this.f2201a.a(bVar)) {
            String str = bVar.f4308c;
            if (str != null) {
                this.f2202b.setResult(new a(bVar.e, bVar.f4309f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
