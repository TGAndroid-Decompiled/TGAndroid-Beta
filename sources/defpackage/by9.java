package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class by9 implements TextWatcher {
    public final zk9 a = new zk9(this, (byte) 22);
    public final iy9 b;

    public by9(iy9 iy9Var) {
        this.b = iy9Var;
    }

    public final void a() {
        boolean z;
        boolean z2;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        iy9 iy9Var = this.b;
        String obj = iy9Var.X1.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        hy9 hy9Var = iy9Var.b2;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = hy9Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z2 = false;
        } else {
            z = true;
            z2 = true;
        }
        hy9Var.c = tL_channelParticipantsSearch;
        if (z) {
            if (z2) {
                hy9Var.r = false;
                if (hy9Var.n >= 0) {
                    ConnectionsManager.getInstance(hy9Var.a).cancelRequest(hy9Var.n, true);
                    hy9Var.n = -1;
                }
                hy9Var.f = false;
                hy9Var.d.clear();
                hy9Var.h = false;
            } else {
                hy9Var.r = true;
                hy9Var.h = false;
            }
            hy9Var.b();
        }
        l5c l5cVar = iy9Var.d2;
        if (l5cVar != null) {
            l5cVar.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        zk9 zk9Var = this.a;
        if (length <= 0) {
            gl.r(zk9Var);
            a();
            return;
        }
        gl.r(zk9Var);
        gl.e3(zk9Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
