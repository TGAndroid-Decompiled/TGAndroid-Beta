package me;

import a8.jd;
import ce.m;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import v0.c;
import v0.i;
import w0.d;
public final class b implements OnCompleteListener, i {
    public final m f18421a;

    public b(m mVar) {
        this.f18421a = mVar;
    }

    @Override
    public void onComplete(Task task) {
        Exception exception = task.getException();
        m mVar = this.f18421a;
        if (exception == null) {
            if (task.isCanceled()) {
                mVar.n(null);
                return;
            } else {
                mVar.resumeWith(task.getResult());
                return;
            }
        }
        mVar.resumeWith(jd.a(exception));
    }

    @Override
    public void onError(Object obj) {
        d e = (d) obj;
        kotlin.jvm.internal.i.e(e, "e");
        m mVar = this.f18421a;
        if (mVar.w()) {
            mVar.resumeWith(jd.a(e));
        }
    }

    @Override
    public void onResult(Object obj) {
        c result = (c) obj;
        kotlin.jvm.internal.i.e(result, "result");
        m mVar = this.f18421a;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }
}
