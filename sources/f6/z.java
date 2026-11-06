package f6;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class z implements com.google.android.gms.common.api.internal.p {
    public static final z f11349b = new z(0);
    public static final z f11350c = new z(1);
    public final int f11351a;

    public z(int i7) {
        this.f11351a = i7;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        j6.w wVar = (j6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f11351a) {
            case 0:
                j6.b bVar = e0.H;
                ((j6.f) wVar.n()).X0();
                taskCompletionSource.setResult(null);
                return;
            default:
                j6.b bVar2 = e0.H;
                j6.f fVar = (j6.f) wVar.n();
                fVar.U0(fVar.P0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                return;
        }
    }
}
