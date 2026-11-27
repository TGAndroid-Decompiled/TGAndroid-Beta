package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$HuaweiHomeBadger implements xm7 {
    @Override
    public final void a(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package", a.b.getPackageName());
        bundle.putString("class", zm7.d.getClassName());
        bundle.putInt("badgenumber", i);
        hl.c3(new ge7(bundle, (byte) 9));
    }

    @Override
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
