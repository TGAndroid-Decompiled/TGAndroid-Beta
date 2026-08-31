package ca;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f2392a;
    public final TaskCompletionSource f2393b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f2392a = jVar;
        this.f2393b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f2393b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(da.b bVar) {
        if (bVar.f4388b == 4 && !this.f2392a.a(bVar)) {
            String str = bVar.f4389c;
            if (str != null) {
                this.f2393b.setResult(new a(bVar.f4390e, bVar.f4391f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
