package defpackage;

import android.view.View;
import org.telegram.ui.ProxyListActivity;
public final class ut8 implements e39, ed {
    public final ProxyListActivity a;

    public ut8(ProxyListActivity proxyListActivity) {
        this.a = proxyListActivity;
    }

    @Override
    public final boolean d(int i, View view) {
        ProxyListActivity proxyListActivity = this.a;
        if (i >= proxyListActivity.n && i < proxyListActivity.r) {
            proxyListActivity.a.P(i);
            return true;
        }
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        this.a.e0();
    }
}
