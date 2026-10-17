package n4;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
public class o extends n {
    @Override
    public final t c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.f17104a.getCurrentControllerInfo();
        ?? obj = new Object();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                obj.f17123a = new v(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
                return obj;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    @Override
    public final void d(t tVar) {
    }
}
