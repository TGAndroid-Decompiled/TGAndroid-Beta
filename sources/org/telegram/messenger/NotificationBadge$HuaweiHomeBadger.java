package org.telegram.messenger;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
public class NotificationBadge$HuaweiHomeBadger implements yj7 {
    @Override
    public final void a(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package", a.b.getPackageName());
        bundle.putString("class", ak7.d.getClassName());
        bundle.putInt("badgenumber", i);
        gl.c3(new vl6(bundle, (byte) 24));
    }

    @Override
    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}
