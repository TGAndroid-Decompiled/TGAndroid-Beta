package ca;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f2225a;
    public final TaskCompletionSource f2226b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f2225a = jVar;
        this.f2226b = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        this.f2226b.trySetException(exc);
        return true;
    }

    @Override
    public final boolean b(da.b bVar) {
        if (bVar.f4288b == 4 && !this.f2225a.a(bVar)) {
            String str = bVar.f4289c;
            if (str != null) {
                this.f2226b.setResult(new a(bVar.e, bVar.f4290f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}
