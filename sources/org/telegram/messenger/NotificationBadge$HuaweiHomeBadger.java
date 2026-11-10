package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$HuaweiHomeBadger implements cs {
    @Override
    public final void a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package", t0.f25570b.getPackageName());
        bundle.putString("class", fs.d.getClassName());
        bundle.putInt("badgenumber", i7);
        g0.h3(new ds(bundle, 0));
    }

    @Override
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
