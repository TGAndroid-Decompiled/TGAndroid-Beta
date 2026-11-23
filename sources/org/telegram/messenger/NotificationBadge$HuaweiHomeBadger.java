package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$HuaweiHomeBadger implements xr {
    @Override
    public final void a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package", t0.f26895b.getPackageName());
        bundle.putString("class", as.d.getClassName());
        bundle.putInt("badgenumber", i7);
        g0.g3(new yr(bundle, 0));
    }

    @Override
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
