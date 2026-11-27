package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class u1a implements TextWatcher {
    public final ux9 a = new ux9(this, (byte) 8);
    public final b2a b;

    public u1a(b2a b2aVar) {
        this.b = b2aVar;
    }

    public final void a() {
        boolean z;
        boolean z2;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        b2a b2aVar = this.b;
        String obj = b2aVar.X1.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        a2a a2aVar = b2aVar.b2;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = a2aVar.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z2 = false;
        } else {
            z = true;
            z2 = true;
        }
        a2aVar.c = tL_channelParticipantsSearch;
        if (z) {
            if (z2) {
                a2aVar.r = false;
                if (a2aVar.n >= 0) {
                    ConnectionsManager.getInstance(a2aVar.a).cancelRequest(a2aVar.n, true);
                    a2aVar.n = -1;
                }
                a2aVar.f = false;
                a2aVar.d.clear();
                a2aVar.h = false;
            } else {
                a2aVar.r = true;
                a2aVar.h = false;
            }
            a2aVar.b();
        }
        l9c l9cVar = b2aVar.d2;
        if (l9cVar != null) {
            l9cVar.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        ux9 ux9Var = this.a;
        if (length <= 0) {
            hl.r(ux9Var);
            a();
            return;
        }
        hl.r(ux9Var);
        hl.d3(ux9Var, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
