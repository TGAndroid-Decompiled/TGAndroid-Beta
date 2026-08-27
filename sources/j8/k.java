package j8;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.Cells.pa;

public final class k extends w5.a {
    public final int d;

    public final int f12799e;

    public k(DataHolder dataHolder, int i10, int i11, int i12) {
        super(dataHolder, i10);
        this.d = i12;
        this.f12799e = i11;
    }

    public final String toString() {
        String str;
        switch (this.d) {
            case 0:
                DataHolder dataHolder = this.f49266a;
                int i10 = this.f49267b;
                dataHolder.c(i10, "event_type");
                if (dataHolder.d[this.f49268c].getInt(i10, dataHolder.f3402c.getInt("event_type")) == 1) {
                    str = "changed";
                } else {
                    int i11 = this.f49267b;
                    dataHolder.c(i11, "event_type");
                    str = dataHolder.d[this.f49268c].getInt(i11, dataHolder.f3402c.getInt("event_type")) == 2 ? "deleted" : "unknown";
                }
                return pa.j("DataEventRef{ type=", str, ", dataitem=", new k(dataHolder, this.f49267b, this.f12799e, 1).toString(), " }");
            default:
                boolean zIsLoggable = Log.isLoggable("DataItem", 3);
                DataHolder dataHolder2 = this.f49266a;
                int i12 = this.f49267b;
                dataHolder2.c(i12, "data");
                byte[] blob = dataHolder2.d[this.f49268c].getBlob(i12, dataHolder2.f3402c.getInt("data"));
                int i13 = this.f12799e;
                HashMap map = new HashMap(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    l lVar = new l(dataHolder2, this.f49267b + i14);
                    DataHolder dataHolder3 = lVar.f49266a;
                    int i15 = lVar.f49267b;
                    dataHolder3.c(i15, "asset_key");
                    if (dataHolder3.d[lVar.f49268c].getString(i15, dataHolder3.f3402c.getInt("asset_key")) != null) {
                        int i16 = lVar.f49267b;
                        dataHolder3.c(i16, "asset_key");
                        map.put(dataHolder3.d[lVar.f49268c].getString(i16, dataHolder3.f3402c.getInt("asset_key")), lVar);
                    }
                }
                StringBuilder sb2 = new StringBuilder("DataItemRef{ ");
                int i17 = this.f49267b;
                dataHolder2.c(i17, "path");
                sb2.append("uri=".concat(String.valueOf(Uri.parse(dataHolder2.d[this.f49268c].getString(i17, dataHolder2.f3402c.getInt("path"))))));
                sb2.append(", dataSz=".concat((blob == null ? "null" : Integer.valueOf(blob.length)).toString()));
                sb2.append(", numAssets=" + map.size());
                if (zIsLoggable && !map.isEmpty()) {
                    sb2.append(", assets=[");
                    String str2 = "";
                    for (Map.Entry entry : map.entrySet()) {
                        sb2.append(str2 + ((String) entry.getKey()) + ": " + ((i8.f) entry.getValue()).getId());
                        str2 = ", ";
                    }
                    sb2.append("]");
                }
                sb2.append(" }");
                return sb2.toString();
        }
    }
}
