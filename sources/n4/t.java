package n4;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
public class t extends s {
    @Override
    public final a0 c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.f16476a.getCurrentControllerInfo();
        ?? obj = new Object();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                obj.f16425a = new c0(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
                return obj;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    @Override
    public final void d(a0 a0Var) {
    }
}
