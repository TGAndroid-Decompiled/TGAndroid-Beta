package j8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import j7.l1;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
public final class e implements com.google.android.gms.common.api.q, Iterable, Closeable {
    public final DataHolder f11278a;
    public boolean f11279b = false;
    public ArrayList f11280c;
    public final Status d;

    public e(DataHolder dataHolder) {
        this.f11278a = dataHolder;
        this.d = new Status(dataHolder.f3972e, null, null, null);
    }

    @Override
    public final void close() {
        DataHolder dataHolder = this.f11278a;
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
        if (i10 >= 0 && i10 < this.f11280c.size()) {
            return ((Integer) this.f11280c.get(i10)).intValue();
        }
        throw new IllegalArgumentException(l1.l(i10, "Position ", " is out of bounds for this buffer"));
    }

    public final void o() {
        synchronized (this) {
            try {
                if (!this.f11279b) {
                    DataHolder dataHolder = this.f11278a;
                    z5.l.h(dataHolder);
                    int i10 = dataHolder.f3974n;
                    ArrayList arrayList = new ArrayList();
                    this.f11280c = arrayList;
                    if (i10 > 0) {
                        arrayList.add(0);
                        int b10 = this.f11278a.b(0);
                        DataHolder dataHolder2 = this.f11278a;
                        dataHolder2.c(0, "path");
                        String string = dataHolder2.d[b10].getString(0, dataHolder2.f3971c.getInt("path"));
                        for (int i11 = 1; i11 < i10; i11++) {
                            int b11 = this.f11278a.b(i11);
                            DataHolder dataHolder3 = this.f11278a;
                            dataHolder3.c(i11, "path");
                            String string2 = dataHolder3.d[b11].getString(i11, dataHolder3.f3971c.getInt("path"));
                            if (string2 != null) {
                                if (!string2.equals(string)) {
                                    this.f11280c.add(Integer.valueOf(i11));
                                    string = string2;
                                }
                            } else {
                                throw new NullPointerException("Missing value for markerColumn: path, at row: " + i11 + ", for window: " + b11);
                            }
                        }
                    }
                    this.f11279b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
