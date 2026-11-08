package je;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.j;
import v0.c;
import v0.g;
import w0.d;
import zd.m;
public final class b implements OnCompleteListener, g {
    public final m f16655a;

    public b(m mVar) {
        this.f16655a = mVar;
    }

    @Override
    public void a(Object obj) {
        d e10 = (d) obj;
        j.e(e10, "e");
        m mVar = this.f16655a;
        if (mVar.w()) {
            mVar.resumeWith(af.b.b(e10));
        }
    }

    @Override
    public void onComplete(Task task) {
        Exception exception = task.getException();
        m mVar = this.f16655a;
        if (exception == null) {
            if (task.isCanceled()) {
                mVar.n(null);
                return;
            } else {
                mVar.resumeWith(task.getResult());
                return;
            }
        }
        mVar.resumeWith(af.b.b(exception));
    }

    @Override
    public void onResult(Object obj) {
        c result = (c) obj;
        j.e(result, "result");
        m mVar = this.f16655a;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }
}
