package c6;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class z implements com.google.android.gms.common.api.internal.r {
    public static final z f4931b = new z(0);
    public static final z f4932c = new z(1);
    public final int f4933a;

    public z(int i10) {
        this.f4933a = i10;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        g6.w wVar = (g6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f4933a) {
            case 0:
                g6.b bVar = e0.G;
                ((g6.f) wVar.u()).V0();
                taskCompletionSource.setResult(null);
                return;
            default:
                g6.b bVar2 = e0.G;
                g6.f fVar = (g6.f) wVar.u();
                fVar.S0(fVar.N0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                return;
        }
    }
}
