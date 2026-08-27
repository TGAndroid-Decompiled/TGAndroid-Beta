package j8;

import com.google.android.gms.common.data.DataHolder;

public final class l extends w5.a implements i8.f {
    @Override
    public final String a() {
        DataHolder dataHolder = this.f49266a;
        int i10 = this.f49267b;
        dataHolder.c(i10, "asset_key");
        return dataHolder.d[this.f49268c].getString(i10, dataHolder.f3402c.getInt("asset_key"));
    }

    @Override
    public final String getId() {
        DataHolder dataHolder = this.f49266a;
        int i10 = this.f49267b;
        dataHolder.c(i10, "asset_id");
        return dataHolder.d[this.f49268c].getString(i10, dataHolder.f3402c.getInt("asset_id"));
    }
}
