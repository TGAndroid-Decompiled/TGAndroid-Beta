package k8;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.th;
public final class k extends x5.a {
    public final int d;
    public final int f13523e;

    public k(DataHolder dataHolder, int i10, int i11, int i12) {
        super(dataHolder, i10);
        this.d = i12;
        this.f13523e = i11;
    }

    public final String toString() {
        String str;
        Object valueOf;
        switch (this.d) {
            case 0:
                DataHolder dataHolder = this.f50094a;
                int i10 = this.f50095b;
                dataHolder.c(i10, "event_type");
                if (dataHolder.d[this.f50096c].getInt(i10, dataHolder.f3971c.getInt("event_type")) == 1) {
                    str = "changed";
                } else {
                    int i11 = this.f50095b;
                    dataHolder.c(i11, "event_type");
                    if (dataHolder.d[this.f50096c].getInt(i11, dataHolder.f3971c.getInt("event_type")) == 2) {
                        str = "deleted";
                    } else {
                        str = "unknown";
                    }
                }
                return th.j("DataEventRef{ type=", str, ", dataitem=", new k(dataHolder, this.f50095b, this.f13523e, 1).toString(), " }");
            default:
                boolean isLoggable = Log.isLoggable("DataItem", 3);
                DataHolder dataHolder2 = this.f50094a;
                int i12 = this.f50095b;
                dataHolder2.c(i12, "data");
                byte[] blob = dataHolder2.d[this.f50096c].getBlob(i12, dataHolder2.f3971c.getInt("data"));
                int i13 = this.f13523e;
                HashMap hashMap = new HashMap(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    x5.a aVar = new x5.a(dataHolder2, this.f50095b + i14);
                    DataHolder dataHolder3 = aVar.f50094a;
                    int i15 = aVar.f50095b;
                    dataHolder3.c(i15, "asset_key");
                    if (dataHolder3.d[aVar.f50096c].getString(i15, dataHolder3.f3971c.getInt("asset_key")) != null) {
                        int i16 = aVar.f50095b;
                        dataHolder3.c(i16, "asset_key");
                        hashMap.put(dataHolder3.d[aVar.f50096c].getString(i16, dataHolder3.f3971c.getInt("asset_key")), aVar);
                    }
                }
                StringBuilder sb2 = new StringBuilder("DataItemRef{ ");
                int i17 = this.f50095b;
                dataHolder2.c(i17, "path");
                sb2.append("uri=".concat(String.valueOf(Uri.parse(dataHolder2.d[this.f50096c].getString(i17, dataHolder2.f3971c.getInt("path"))))));
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
                        String id2 = ((j8.f) entry.getValue()).getId();
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
