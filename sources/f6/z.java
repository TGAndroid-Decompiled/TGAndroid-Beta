package f6;

import com.google.android.gms.tasks.TaskCompletionSource;
public final class z implements com.google.android.gms.common.api.internal.q {
    public static final z f11474b = new z(0);
    public static final z f11475c = new z(1);
    public final int f11476a;

    public z(int i7) {
        this.f11476a = i7;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        j6.y yVar = (j6.y) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        switch (this.f11476a) {
            case 0:
                j6.b bVar = e0.H;
                ((j6.f) yVar.n()).x1();
                taskCompletionSource.setResult(null);
                return;
            default:
                j6.b bVar2 = e0.H;
                j6.f fVar = (j6.f) yVar.n();
                fVar.u1(fVar.p1(), 19);
                taskCompletionSource.setResult(Boolean.TRUE);
                return;
        }
    }
}
