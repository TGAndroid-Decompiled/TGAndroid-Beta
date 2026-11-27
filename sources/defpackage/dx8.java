package defpackage;

import android.view.View;
import org.telegram.ui.ProxyListActivity;
public final class dx8 implements t69, fd {
    public final ProxyListActivity a;

    public dx8(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override
    public final boolean e(int i, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i >= proxyListActivity.n && i < proxyListActivity.r) {
            proxyListActivity.a.P(i);
            return true;
        }
        return false;
    }

    @Override
    public final void w(id idVar, int i) {
        this.a.e0();
    }
}
