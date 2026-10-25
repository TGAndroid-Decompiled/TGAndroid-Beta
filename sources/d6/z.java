package d6;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class z implements com.google.android.gms.common.api.internal.r {
    public static final z f8154b = new z(0);
    public static final z f8155c = new z(1);
    public final int f8156a;

    public z(int i10) {
        this.f8156a = i10;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        h6.w wVar = (h6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f8156a) {
            case 0:
                h6.b bVar = e0.G;
                ((h6.f) wVar.u()).V0();
                taskCompletionSource.setResult(null);
                return;
            default:
                h6.b bVar2 = e0.G;
                h6.f fVar = (h6.f) wVar.u();
                fVar.S0(fVar.N0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                return;
        }
    }
}
