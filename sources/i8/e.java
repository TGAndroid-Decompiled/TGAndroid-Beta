package i8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

public final class e implements com.google.android.gms.common.api.q, Iterable, Closeable {

    public final DataHolder f10951a;

    public boolean f10952b = false;

    public ArrayList f10953c;
    public final Status d;

    public e(DataHolder dataHolder) {
        this.f10951a = dataHolder;
        this.d = new Status(dataHolder.f3403e, null, null, null);
    }

    @Override
    public final void close() {
        DataHolder dataHolder = this.f10951a;
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
        if (i10 < 0 || i10 >= this.f10953c.size()) {
            throw new IllegalArgumentException(i0.a.l(i10, "Position ", " is out of bounds for this buffer"));
        }
        return ((Integer) this.f10953c.get(i10)).intValue();
    }

    public final void o() {
        synchronized (this) {
            try {
                if (!this.f10952b) {
                    DataHolder dataHolder = this.f10951a;
                    y5.l.h(dataHolder);
                    int i10 = dataHolder.f3405n;
                    ArrayList arrayList = new ArrayList();
                    this.f10953c = arrayList;
                    if (i10 > 0) {
                        arrayList.add(0);
                        int iB = this.f10951a.b(0);
                        DataHolder dataHolder2 = this.f10951a;
                        dataHolder2.c(0, "path");
                        String string = dataHolder2.d[iB].getString(0, dataHolder2.f3402c.getInt("path"));
                        for (int i11 = 1; i11 < i10; i11++) {
                            int iB2 = this.f10951a.b(i11);
                            DataHolder dataHolder3 = this.f10951a;
                            dataHolder3.c(i11, "path");
                            String string2 = dataHolder3.d[iB2].getString(i11, dataHolder3.f3402c.getInt("path"));
                            if (string2 == null) {
                                throw new NullPointerException("Missing value for markerColumn: path, at row: " + i11 + ", for window: " + iB2);
                            }
                            if (!string2.equals(string)) {
                                this.f10953c.add(Integer.valueOf(i11));
                                string = string2;
                            }
                        }
                    }
                    this.f10952b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
