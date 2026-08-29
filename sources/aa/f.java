package aa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class f implements i {
    public final j f292a;
    public final TaskCompletionSource f293b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f292a = jVar;
        this.f293b = taskCompletionSource;
    }

    @Override
    public final boolean a(ba.b bVar) {
        if (bVar.f2033b == 4 && !this.f292a.a(bVar)) {
            String str = bVar.f2034c;
            if (str != null) {
                this.f293b.setResult(new a(bVar.f2035e, bVar.f2036f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }

    @Override
    public final boolean b(Exception exc) {
        this.f293b.trySetException(exc);
        return true;
    }
}
