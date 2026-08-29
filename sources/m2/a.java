package m2;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
public abstract class a {
    public final DataSetObservable f16766a = new DataSetObservable();
    public DataSetObserver f16767b;

    public abstract void a(g gVar, Object obj);

    public abstract int b();

    public int c(Object obj) {
        return -1;
    }

    public CharSequence d(int i10) {
        return null;
    }

    public abstract Object e(g gVar, int i10);

    public abstract boolean f(View view, Object obj);

    public void g() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f16767b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f16766a.notifyChanged();
    }

    public final void i(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f16767b = dataSetObserver;
        }
    }

    public void h(int i10) {
    }
}
