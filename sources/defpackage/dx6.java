package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
public class dx6 extends zw6 {
    @Override
    public final ny6 c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        ?? obj = new Object();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                obj.a = new ry6(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
                return obj;
            }
            u36.j("packageName should be nonempty");
            return null;
        }
        gxc.d("package shouldn't be null");
        return null;
    }

    @Override
    public final void e(ny6 ny6Var) {
    }
}
