package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$HuaweiHomeBadger implements ur {
    @Override
    public final void a(int i3) {
        Bundle bundle = new Bundle();
        bundle.putString("package", t0.f25457b.getPackageName());
        bundle.putString("class", wr.d.getClassName());
        bundle.putInt("badgenumber", i3);
        g0.h3(new a(bundle, 29));
    }

    @Override
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
