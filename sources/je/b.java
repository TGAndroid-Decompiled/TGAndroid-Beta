package je;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import v0.c;
import v0.i;
import v7.u7;
import w0.d;
import zd.m;
public final class b implements OnCompleteListener, i {
    public final m f11870a;

    public b(m mVar) {
        this.f11870a = mVar;
    }

    @Override
    public void onComplete(Task task) {
        Exception exception = task.getException();
        m mVar = this.f11870a;
        if (exception == null) {
            if (task.isCanceled()) {
                mVar.n(null);
                return;
            } else {
                mVar.resumeWith(task.getResult());
                return;
            }
        }
        mVar.resumeWith(u7.a(exception));
    }

    @Override
    public void onError(Object obj) {
        d e = (d) obj;
        kotlin.jvm.internal.i.e(e, "e");
        m mVar = this.f11870a;
        if (mVar.w()) {
            mVar.resumeWith(u7.a(e));
        }
    }

    @Override
    public void onResult(Object obj) {
        c result = (c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        m mVar = this.f11870a;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }
}
