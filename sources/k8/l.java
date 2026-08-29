package k8;

import com.google.android.gms.common.data.DataHolder;
public final class l extends x5.a implements j8.f {
    @Override
    public final String a() {
        DataHolder dataHolder = this.f50094a;
        int i10 = this.f50095b;
        dataHolder.c(i10, "asset_key");
        return dataHolder.d[this.f50096c].getString(i10, dataHolder.f3971c.getInt("asset_key"));
    }

    @Override
    public final String getId() {
        DataHolder dataHolder = this.f50094a;
        int i10 = this.f50095b;
        dataHolder.c(i10, "asset_id");
        return dataHolder.d[this.f50096c].getString(i10, dataHolder.f3971c.getInt("asset_id"));
    }
}
