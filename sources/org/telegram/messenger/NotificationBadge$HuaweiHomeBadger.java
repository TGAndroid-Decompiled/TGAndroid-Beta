package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$HuaweiHomeBadger implements ls {
    @Override
    public final void a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package", w0.f19025b.getPackageName());
        bundle.putString("class", os.d.getClassName());
        bundle.putInt("badgenumber", i10);
        i0.g3(new ms(bundle, 0));
    }

    @Override
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
