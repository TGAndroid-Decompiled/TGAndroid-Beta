package e6;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class z implements com.google.android.gms.common.api.internal.p {
    public static final z f9792b = new z(0);
    public static final z f9793c = new z(1);
    public final int f9794a;

    public z(int i3) {
        this.f9794a = i3;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        i6.w wVar = (i6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f9794a) {
            case 0:
                i6.b bVar = e0.H;
                ((i6.f) wVar.m()).X0();
                taskCompletionSource.setResult(null);
                return;
            default:
                i6.b bVar2 = e0.H;
                i6.f fVar = (i6.f) wVar.m();
                fVar.U0(fVar.P0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                return;
        }
    }
}
