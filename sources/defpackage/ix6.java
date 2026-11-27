package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
public class ix6 extends ex6 {
    @Override
    public final sy6 c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        ?? obj = new Object();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                obj.a = new wy6(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
                return obj;
            }
            lq5.j("packageName should be nonempty");
            return null;
        }
        p3d.h("package shouldn't be null");
        return null;
    }

    @Override
    public final void e(sy6 sy6Var) {
    }
}
