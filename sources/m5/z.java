package m5;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class z implements com.google.android.gms.common.api.internal.s {
    public static final z f17492b = new z(0);
    public static final z f17493c = new z(1);
    public final int f17494a;

    public z(int i9) {
        this.f17494a = i9;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        q5.x xVar = (q5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f17494a) {
            case 0:
                q5.b bVar = f0.G;
                ((q5.f) xVar.u()).U0();
                taskCompletionSource.setResult(null);
                return;
            default:
                q5.b bVar2 = f0.G;
                q5.f fVar = (q5.f) xVar.u();
                fVar.R0(fVar.M0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                return;
        }
    }
}
