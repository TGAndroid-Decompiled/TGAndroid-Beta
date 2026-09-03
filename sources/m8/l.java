package m8;

import com.google.android.gms.common.data.DataHolder;
public final class l extends z5.a implements l8.f {
    @Override
    public final String a() {
        DataHolder dataHolder = this.f51118a;
        int i10 = this.f51119b;
        dataHolder.f(i10, "asset_key");
        return dataHolder.d[this.f51120c].getString(i10, dataHolder.f2867c.getInt("asset_key"));
    }

    @Override
    public final String getId() {
        DataHolder dataHolder = this.f51118a;
        int i10 = this.f51119b;
        dataHolder.f(i10, "asset_id");
        return dataHolder.d[this.f51120c].getString(i10, dataHolder.f2867c.getInt("asset_id"));
    }
}
