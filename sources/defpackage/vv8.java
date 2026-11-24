package defpackage;

import android.view.View;
import org.telegram.ui.ProxyListActivity;
public final class vv8 implements h59, ee {
    public final ProxyListActivity a;

    public vv8(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override
    public final boolean g(int i, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i >= proxyListActivity.n && i < proxyListActivity.r) {
            proxyListActivity.a.P(i);
            return true;
        }
        return false;
    }

    @Override
    public final void r(he heVar, int i) {
        this.a.f0();
    }
}
