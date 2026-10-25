package a5;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
public abstract class a {
    public final DataSetObservable f280a = new DataSetObservable();
    public DataSetObserver f281b;

    public abstract void a(m mVar, Object obj);

    public abstract int b();

    public int c(Object obj) {
        return -1;
    }

    public CharSequence d(int i10) {
        return null;
    }

    public abstract Object e(m mVar, int i10);

    public abstract boolean f(View view, Object obj);

    public void g() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f281b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f280a.notifyChanged();
    }

    public final void i(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f281b = dataSetObserver;
        }
    }

    public void h(int i10) {
    }
}
