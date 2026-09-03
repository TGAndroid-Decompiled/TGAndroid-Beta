package ca;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f2227a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f2227a = taskCompletionSource;
    }

    @Override
    public final boolean a(Exception exc) {
        return false;
    }

    @Override
    public final boolean b(da.b bVar) {
        int i10 = bVar.f4288b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f2227a.trySetResult(bVar.f4287a);
            return true;
        }
        return false;
    }
}
