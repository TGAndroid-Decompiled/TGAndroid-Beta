package n4;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
public class s extends r {
    @Override
    public final z c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.f16593a.getCurrentControllerInfo();
        ?? obj = new Object();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                obj.f16617a = new b0(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
                return obj;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    @Override
    public final void d(z zVar) {
    }
}
