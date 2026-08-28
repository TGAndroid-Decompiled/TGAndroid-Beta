package i8;

import com.google.android.gms.common.data.DataHolder;
public final class l extends v5.a implements h8.f {
    @Override
    public final String a() {
        DataHolder dataHolder = this.f48356a;
        int i9 = this.f48357b;
        dataHolder.c(i9, "asset_key");
        return dataHolder.d[this.f48358c].getString(i9, dataHolder.f2957c.getInt("asset_key"));
    }

    @Override
    public final String getId() {
        DataHolder dataHolder = this.f48356a;
        int i9 = this.f48357b;
        dataHolder.c(i9, "asset_id");
        return dataHolder.d[this.f48358c].getString(i9, dataHolder.f2957c.getInt("asset_id"));
    }
}
