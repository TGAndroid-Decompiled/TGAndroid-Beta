package je;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import v0.c;
import v0.i;
import v7.t7;
import w0.d;
import zd.m;
public final class b implements OnCompleteListener, i {
    public final m f14097a;

    public b(m mVar) {
        this.f14097a = mVar;
    }

    @Override
    public void onComplete(Task task) {
        Exception exception = task.getException();
        m mVar = this.f14097a;
        if (exception == null) {
            if (task.isCanceled()) {
                mVar.n(null);
                return;
            } else {
                mVar.resumeWith(task.getResult());
                return;
            }
        }
        mVar.resumeWith(t7.a(exception));
    }

    @Override
    public void onError(Object obj) {
        d e7 = (d) obj;
        kotlin.jvm.internal.i.e(e7, "e");
        m mVar = this.f14097a;
        if (mVar.w()) {
            mVar.resumeWith(t7.a(e7));
        }
    }

    @Override
    public void onResult(Object obj) {
        c result = (c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        m mVar = this.f14097a;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }
}
