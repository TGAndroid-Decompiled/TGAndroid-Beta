package c6;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class z implements com.google.android.gms.common.api.internal.s {
    public static final z f3958b = new z(0);
    public static final z f3959c = new z(1);
    public final int f3960a;

    public z(int i10) {
        this.f3960a = i10;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        g6.w wVar = (g6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f3960a) {
            case 0:
                g6.b bVar = e0.G;
                ((g6.f) wVar.v()).X0();
                taskCompletionSource.setResult(null);
                return;
            default:
                g6.b bVar2 = e0.G;
                g6.f fVar = (g6.f) wVar.v();
                fVar.U0(fVar.P0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                return;
        }
    }
}
