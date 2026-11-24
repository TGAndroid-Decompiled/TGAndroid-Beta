package defpackage;

import android.text.TextUtils;
import org.telegram.ui.l;
import org.telegram.ui.m;
public final class zw extends wy0 {
    @Override
    public final String b() {
        mw0 mw0Var = this.b;
        if (mw0Var != null && !TextUtils.isEmpty(mw0Var.getTitle())) {
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
            mw0 mw0Var = this.b;
            if (mw0Var != null) {
                mw0Var.onPause();
                this.E = this.b.getTitle();
                this.F = this.b.getFavicon();
                this.x = this.b.getUrl();
                this.q = mVar.x;
                this.r = mVar.y;
            }
        }
    }
}
