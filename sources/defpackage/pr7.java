package defpackage;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
public abstract class pr7 {
    public final DataSetObservable a = new DataSetObservable();
    public DataSetObserver b;

    public void a(gec gecVar, Object obj) {
        gecVar.removeView(((mv) obj).b);
    }

    public abstract int b();

    public int c(Object obj) {
        return -1;
    }

    public CharSequence d(int i) {
        return null;
    }

    public abstract Object e(gec gecVar, int i);

    public boolean f(View view, Object obj) {
        if (((mv) obj).b == view) {
            return true;
        }
        return false;
    }

    public void g() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.a.notifyChanged();
    }

    public final void i(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public void h(int i) {
    }
}
