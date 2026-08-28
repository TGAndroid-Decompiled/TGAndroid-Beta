package h8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import j3.r0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
public final class e implements com.google.android.gms.common.api.q, Iterable, Closeable {
    public final DataHolder f10242a;
    public boolean f10243b = false;
    public ArrayList f10244c;
    public final Status d;

    public e(DataHolder dataHolder) {
        this.f10242a = dataHolder;
        this.d = new Status(dataHolder.f2958e, null, null, null);
    }

    @Override
    public final void close() {
        DataHolder dataHolder = this.f10242a;
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
        return new kc.b(this);
    }

    public final int n(int i9) {
        if (i9 >= 0 && i9 < this.f10244c.size()) {
            return ((Integer) this.f10244c.get(i9)).intValue();
        }
        throw new IllegalArgumentException(r0.m(i9, "Position ", " is out of bounds for this buffer"));
    }

    public final void o() {
        synchronized (this) {
            try {
                if (!this.f10243b) {
                    DataHolder dataHolder = this.f10242a;
                    x5.l.h(dataHolder);
                    int i9 = dataHolder.f2960n;
                    ArrayList arrayList = new ArrayList();
                    this.f10244c = arrayList;
                    if (i9 > 0) {
                        arrayList.add(0);
                        int b10 = this.f10242a.b(0);
                        DataHolder dataHolder2 = this.f10242a;
                        dataHolder2.c(0, "path");
                        String string = dataHolder2.d[b10].getString(0, dataHolder2.f2957c.getInt("path"));
                        for (int i10 = 1; i10 < i9; i10++) {
                            int b11 = this.f10242a.b(i10);
                            DataHolder dataHolder3 = this.f10242a;
                            dataHolder3.c(i10, "path");
                            String string2 = dataHolder3.d[b11].getString(i10, dataHolder3.f2957c.getInt("path"));
                            if (string2 != null) {
                                if (!string2.equals(string)) {
                                    this.f10244c.add(Integer.valueOf(i10));
                                    string = string2;
                                }
                            } else {
                                throw new NullPointerException("Missing value for markerColumn: path, at row: " + i10 + ", for window: " + b11);
                            }
                        }
                    }
                    this.f10243b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
