package l8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import kf.k0;
public final class e implements com.google.android.gms.common.api.q, Iterable, Closeable {
    public final DataHolder f11825a;
    public boolean f11826b = false;
    public ArrayList f11827c;
    public final Status d;

    public e(DataHolder dataHolder) {
        this.f11825a = dataHolder;
        this.d = new Status(dataHolder.e, null, null, null);
    }

    @Override
    public final void close() {
        DataHolder dataHolder = this.f11825a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override
    public final Status i() {
        return this.d;
    }

    @Override
    public final Iterator iterator() {
        return new kotlin.jvm.internal.a(this);
    }

    public final int n(int i10) {
        if (i10 >= 0 && i10 < this.f11827c.size()) {
            return ((Integer) this.f11827c.get(i10)).intValue();
        }
        throw new IllegalArgumentException(k0.k(i10, "Position ", " is out of bounds for this buffer"));
    }

    public final void o() {
        synchronized (this) {
            try {
                if (!this.f11826b) {
                    DataHolder dataHolder = this.f11825a;
                    b6.m.h(dataHolder);
                    int i10 = dataHolder.f2910n;
                    ArrayList arrayList = new ArrayList();
                    this.f11827c = arrayList;
                    if (i10 > 0) {
                        arrayList.add(0);
                        int e = this.f11825a.e(0);
                        DataHolder dataHolder2 = this.f11825a;
                        dataHolder2.f(0, "path");
                        String string = dataHolder2.d[e].getString(0, dataHolder2.f2908c.getInt("path"));
                        for (int i11 = 1; i11 < i10; i11++) {
                            int e6 = this.f11825a.e(i11);
                            DataHolder dataHolder3 = this.f11825a;
                            dataHolder3.f(i11, "path");
                            String string2 = dataHolder3.d[e6].getString(i11, dataHolder3.f2908c.getInt("path"));
                            if (string2 != null) {
                                if (!string2.equals(string)) {
                                    this.f11827c.add(Integer.valueOf(i11));
                                    string = string2;
                                }
                            } else {
                                throw new NullPointerException("Missing value for markerColumn: path, at row: " + i11 + ", for window: " + e6);
                            }
                        }
                    }
                    this.f11826b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
