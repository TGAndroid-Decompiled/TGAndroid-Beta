package i8;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.Cells.j2;
public final class k extends v5.a {
    public final int d;
    public final int f11000e;

    public k(DataHolder dataHolder, int i9, int i10, int i11) {
        super(dataHolder, i9);
        this.d = i11;
        this.f11000e = i10;
    }

    public final String toString() {
        String str;
        Object valueOf;
        switch (this.d) {
            case 0:
                DataHolder dataHolder = this.f48356a;
                int i9 = this.f48357b;
                dataHolder.c(i9, "event_type");
                if (dataHolder.d[this.f48358c].getInt(i9, dataHolder.f2957c.getInt("event_type")) == 1) {
                    str = "changed";
                } else {
                    int i10 = this.f48357b;
                    dataHolder.c(i10, "event_type");
                    if (dataHolder.d[this.f48358c].getInt(i10, dataHolder.f2957c.getInt("event_type")) == 2) {
                        str = "deleted";
                    } else {
                        str = "unknown";
                    }
                }
                return j2.h("DataEventRef{ type=", str, ", dataitem=", new k(dataHolder, this.f48357b, this.f11000e, 1).toString(), " }");
            default:
                boolean isLoggable = Log.isLoggable("DataItem", 3);
                DataHolder dataHolder2 = this.f48356a;
                int i11 = this.f48357b;
                dataHolder2.c(i11, "data");
                byte[] blob = dataHolder2.d[this.f48358c].getBlob(i11, dataHolder2.f2957c.getInt("data"));
                int i12 = this.f11000e;
                HashMap hashMap = new HashMap(i12);
                for (int i13 = 0; i13 < i12; i13++) {
                    v5.a aVar = new v5.a(dataHolder2, this.f48357b + i13);
                    DataHolder dataHolder3 = aVar.f48356a;
                    int i14 = aVar.f48357b;
                    dataHolder3.c(i14, "asset_key");
                    if (dataHolder3.d[aVar.f48358c].getString(i14, dataHolder3.f2957c.getInt("asset_key")) != null) {
                        int i15 = aVar.f48357b;
                        dataHolder3.c(i15, "asset_key");
                        hashMap.put(dataHolder3.d[aVar.f48358c].getString(i15, dataHolder3.f2957c.getInt("asset_key")), aVar);
                    }
                }
                StringBuilder sb2 = new StringBuilder("DataItemRef{ ");
                int i16 = this.f48357b;
                dataHolder2.c(i16, "path");
                sb2.append("uri=".concat(String.valueOf(Uri.parse(dataHolder2.d[this.f48358c].getString(i16, dataHolder2.f2957c.getInt("path"))))));
                if (blob == null) {
                    valueOf = "null";
                } else {
                    valueOf = Integer.valueOf(blob.length);
                }
                sb2.append(", dataSz=".concat(valueOf.toString()));
                int size = hashMap.size();
                sb2.append(", numAssets=" + size);
                if (isLoggable && !hashMap.isEmpty()) {
                    sb2.append(", assets=[");
                    String str2 = "";
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String id2 = ((h8.f) entry.getValue()).getId();
                        sb2.append(str2 + ((String) entry.getKey()) + ": " + id2);
                        str2 = ", ";
                    }
                    sb2.append("]");
                }
                sb2.append(" }");
                return sb2.toString();
        }
    }
}
