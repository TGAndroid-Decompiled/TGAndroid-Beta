package o5;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class z implements com.google.android.gms.common.api.internal.s {
    public static final z f19351b = new z(0);
    public static final z f19352c = new z(1);
    public final int f19353a;

    public z(int i10) {
        this.f19353a = i10;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        s5.x xVar = (s5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f19353a) {
            case 0:
                s5.b bVar = e0.G;
                ((s5.f) xVar.u()).U0();
                taskCompletionSource.setResult(null);
                return;
            default:
                s5.b bVar2 = e0.G;
                s5.f fVar = (s5.f) xVar.u();
                fVar.R0(fVar.M0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                return;
        }
    }
}
