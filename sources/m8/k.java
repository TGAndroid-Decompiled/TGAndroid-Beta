package m8;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.yh;
public final class k extends z5.a {
    public final int d;
    public final int f13540e;

    public k(DataHolder dataHolder, int i10, int i11, int i12) {
        super(dataHolder, i10);
        this.d = i12;
        this.f13540e = i11;
    }

    public final String toString() {
        String str;
        Object valueOf;
        switch (this.d) {
            case 0:
                DataHolder dataHolder = this.f51118a;
                int i10 = this.f51119b;
                dataHolder.f(i10, "event_type");
                if (dataHolder.d[this.f51120c].getInt(i10, dataHolder.f2867c.getInt("event_type")) == 1) {
                    str = "changed";
                } else {
                    int i11 = this.f51119b;
                    dataHolder.f(i11, "event_type");
                    if (dataHolder.d[this.f51120c].getInt(i11, dataHolder.f2867c.getInt("event_type")) == 2) {
                        str = "deleted";
                    } else {
                        str = "unknown";
                    }
                }
                return yh.l("DataEventRef{ type=", str, ", dataitem=", new k(dataHolder, this.f51119b, this.f13540e, 1).toString(), " }");
            default:
                boolean isLoggable = Log.isLoggable("DataItem", 3);
                DataHolder dataHolder2 = this.f51118a;
                int i12 = this.f51119b;
                dataHolder2.f(i12, "data");
                byte[] blob = dataHolder2.d[this.f51120c].getBlob(i12, dataHolder2.f2867c.getInt("data"));
                int i13 = this.f13540e;
                HashMap hashMap = new HashMap(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    z5.a aVar = new z5.a(dataHolder2, this.f51119b + i14);
                    DataHolder dataHolder3 = aVar.f51118a;
                    int i15 = aVar.f51119b;
                    dataHolder3.f(i15, "asset_key");
                    if (dataHolder3.d[aVar.f51120c].getString(i15, dataHolder3.f2867c.getInt("asset_key")) != null) {
                        int i16 = aVar.f51119b;
                        dataHolder3.f(i16, "asset_key");
                        hashMap.put(dataHolder3.d[aVar.f51120c].getString(i16, dataHolder3.f2867c.getInt("asset_key")), aVar);
                    }
                }
                StringBuilder sb = new StringBuilder("DataItemRef{ ");
                int i17 = this.f51119b;
                dataHolder2.f(i17, "path");
                sb.append("uri=".concat(String.valueOf(Uri.parse(dataHolder2.d[this.f51120c].getString(i17, dataHolder2.f2867c.getInt("path"))))));
                if (blob == null) {
                    valueOf = "null";
                } else {
                    valueOf = Integer.valueOf(blob.length);
                }
                sb.append(", dataSz=".concat(valueOf.toString()));
                int size = hashMap.size();
                sb.append(", numAssets=" + size);
                if (isLoggable && !hashMap.isEmpty()) {
                    sb.append(", assets=[");
                    String str2 = "";
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String id2 = ((l8.f) entry.getValue()).getId();
                        sb.append(str2 + ((String) entry.getKey()) + ": " + id2);
                        str2 = ", ";
                    }
                    sb.append("]");
                }
                sb.append(" }");
                return sb.toString();
        }
    }
}
