package defpackage;

import android.text.TextUtils;
import org.telegram.ui.l;
import org.telegram.ui.m;
public final class zv extends px0 {
    @Override
    public final String b() {
        cv0 cv0Var = this.b;
        if (cv0Var != null && !TextUtils.isEmpty(cv0Var.getTitle())) {
            return this.b.getTitle();
        }
        return super.b();
    }

    public final void c(m mVar) {
        if (mVar != null) {
            l lVar = mVar.f;
            lVar.J();
            this.b = lVar.getWebView();
            this.d = lVar.getProxy();
            cv0 cv0Var = this.b;
            if (cv0Var != null) {
                cv0Var.onPause();
                this.E = this.b.getTitle();
                this.F = this.b.getFavicon();
                this.x = this.b.getUrl();
                this.q = mVar.x;
                this.r = mVar.y;
            }
        }
    }
}
