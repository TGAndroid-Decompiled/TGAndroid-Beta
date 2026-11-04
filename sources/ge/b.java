package ge;

import b8.ib;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.j;
import v0.c;
import v0.h;
import w0.d;
import wd.m;
public final class b implements OnCompleteListener, h {
    public final m f12250a;

    public b(m mVar) {
        this.f12250a = mVar;
    }

    @Override
    public void a(Object obj) {
        d e10 = (d) obj;
        j.e(e10, "e");
        m mVar = this.f12250a;
        if (mVar.w()) {
            mVar.resumeWith(ib.a(e10));
        }
    }

    @Override
    public void onComplete(Task task) {
        Exception exception = task.getException();
        m mVar = this.f12250a;
        if (exception == null) {
            if (task.isCanceled()) {
                mVar.n(null);
                return;
            } else {
                mVar.resumeWith(task.getResult());
                return;
            }
        }
        mVar.resumeWith(ib.a(exception));
    }

    @Override
    public void onResult(Object obj) {
        c result = (c) obj;
        j.e(result, "result");
        m mVar = this.f12250a;
        if (mVar.w()) {
            mVar.resumeWith(result);
        }
    }
}
