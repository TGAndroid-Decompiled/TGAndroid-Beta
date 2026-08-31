package ca;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f2394a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f2394a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(da.b bVar) {
        int i10 = bVar.f4388b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f2394a.trySetResult(bVar.f4387a);
            return true;
        }
        return false;
    }
}
