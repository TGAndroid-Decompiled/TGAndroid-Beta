package m5;

import com.google.android.gms.tasks.TaskCompletionSource;

public final class a0 implements com.google.android.gms.common.api.internal.s {

    public static final a0 f17737b = new a0(0);

    public static final a0 f17738c = new a0(1);

    public final int f17739a;

    public a0(int i10) {
        this.f17739a = i10;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        r5.x xVar = (r5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f17739a) {
            case 0:
                r5.b bVar = f0.G;
                ((r5.f) xVar.u()).U0();
                taskCompletionSource.setResult(null);
                break;
            default:
                r5.b bVar2 = f0.G;
                r5.f fVar = (r5.f) xVar.u();
                fVar.R0(fVar.M0(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                break;
        }
    }
}
