package aa;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class g implements i {
    public final TaskCompletionSource f294a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f294a = taskCompletionSource;
    }

    @Override
    public final boolean a(ba.b bVar) {
        int i10 = bVar.f2033b;
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            this.f294a.trySetResult(bVar.f2032a);
            return true;
        }
        return false;
    }

    @Override
    public final boolean b(Exception exc) {
        return false;
    }
}
