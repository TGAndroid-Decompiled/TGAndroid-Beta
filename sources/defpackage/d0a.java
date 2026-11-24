package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d0a implements TextWatcher {
    public final c0a a = new c0a(this, (byte) 0);
    public final k0a b;

    public d0a(k0a k0aVar) {
        this.b = k0aVar;
    }

    public final void a() {
        boolean z;
        boolean z2;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        k0a k0aVar = this.b;
        String obj = k0aVar.X1.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        j0a j0aVar = k0aVar.b2;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = j0aVar.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z2 = false;
        } else {
            z = true;
            z2 = true;
        }
        j0aVar.c = tL_channelParticipantsSearch;
        if (z) {
            if (z2) {
                j0aVar.r = false;
                if (j0aVar.n >= 0) {
                    ConnectionsManager.getInstance(j0aVar.a).cancelRequest(j0aVar.n, true);
                    j0aVar.n = -1;
                }
                j0aVar.f = false;
                j0aVar.d.clear();
                j0aVar.h = false;
            } else {
                j0aVar.r = true;
                j0aVar.h = false;
            }
            j0aVar.b();
        }
        l7c l7cVar = k0aVar.d2;
        if (l7cVar != null) {
            l7cVar.O(true);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        c0a c0aVar = this.a;
        if (length <= 0) {
            gm.r(c0aVar);
            a();
            return;
        }
        gm.r(c0aVar);
        gm.d3(c0aVar, 300L);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
