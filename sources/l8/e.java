package l8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
public final class e implements com.google.android.gms.common.api.q, Iterable, Closeable {
    public final DataHolder f12122a;
    public boolean f12123b = false;
    public ArrayList f12124c;
    public final Status d;

    public e(DataHolder dataHolder) {
        this.f12122a = dataHolder;
        this.d = new Status(dataHolder.f2868e, null, null, null);
    }

    @Override
    public final void close() {
        DataHolder dataHolder = this.f12122a;
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
        if (i10 >= 0 && i10 < this.f12124c.size()) {
            return ((Integer) this.f12124c.get(i10)).intValue();
        }
        throw new IllegalArgumentException(l.d.k(i10, "Position ", " is out of bounds for this buffer"));
    }

    public final void o() {
        synchronized (this) {
            try {
                if (!this.f12123b) {
                    DataHolder dataHolder = this.f12122a;
                    b6.m.h(dataHolder);
                    int i10 = dataHolder.f2870n;
                    ArrayList arrayList = new ArrayList();
                    this.f12124c = arrayList;
                    if (i10 > 0) {
                        arrayList.add(0);
                        int e6 = this.f12122a.e(0);
                        DataHolder dataHolder2 = this.f12122a;
                        dataHolder2.f(0, "path");
                        String string = dataHolder2.d[e6].getString(0, dataHolder2.f2867c.getInt("path"));
                        for (int i11 = 1; i11 < i10; i11++) {
                            int e10 = this.f12122a.e(i11);
                            DataHolder dataHolder3 = this.f12122a;
                            dataHolder3.f(i11, "path");
                            String string2 = dataHolder3.d[e10].getString(i11, dataHolder3.f2867c.getInt("path"));
                            if (string2 != null) {
                                if (!string2.equals(string)) {
                                    this.f12124c.add(Integer.valueOf(i11));
                                    string = string2;
                                }
                            } else {
                                throw new NullPointerException("Missing value for markerColumn: path, at row: " + i11 + ", for window: " + e10);
                            }
                        }
                    }
                    this.f12123b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
