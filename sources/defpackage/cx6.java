package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
public class cx6 extends bx6 {
    @Override
    public final my6 c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        ?? obj = new Object();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                obj.a = new py6(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
                return obj;
            }
            u36.j("packageName should be nonempty");
            return null;
        }
        gxc.d("package shouldn't be null");
        return null;
    }

    @Override
    public final void d(my6 my6Var) {
    }
}
