package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
public class dv6 extends zu6 {
    @Override
    public final nw6 c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.a.getCurrentControllerInfo();
        ?? obj = new Object();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                obj.a = new rw6(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
                return obj;
            }
            w26.j("packageName should be nonempty");
            return null;
        }
        fvc.f("package shouldn't be null");
        return null;
    }

    @Override
    public final void e(nw6 nw6Var) {
    }
}
