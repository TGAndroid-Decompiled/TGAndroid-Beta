package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class gea extends n39 {
    public final Context c;
    public final zr9 e;
    public fea f;
    public final TLRPC.Chat n;
    public final nfa s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public gea(nfa nfaVar, Context context) {
        this.s = nfaVar;
        this.c = context;
        zr9 zr9Var = new zr9(true);
        this.e = zr9Var;
        zr9Var.a = new eea(this);
        this.n = nfaVar.G1.f();
    }

    @Override
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof gh6) {
            ((gh6) view).a();
        }
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    public final TLObject E(int i) {
        zr9 zr9Var = this.e;
        int size = zr9Var.g.size();
        if (i >= 0 && i < size) {
            return (TLObject) zr9Var.g.get(i);
        }
        return null;
    }

    public final void F(String str, boolean z) {
        long j;
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        this.d.clear();
        this.e.f(null, null);
        zr9 zr9Var = this.e;
        if (hc2.T(this.n)) {
            j = this.n.id;
        } else {
            j = 0;
        }
        zr9Var.g(null, true, false, true, false, j, false, 2, 0);
        f();
        int i = 0;
        while (true) {
            iea[] ieaVarArr = this.s.n0;
            if (i >= ieaVarArr.length) {
                break;
            }
            if (ieaVarArr[i].F == 7 && !TextUtils.isEmpty(str)) {
                this.s.n0[i].w.e(true, z);
            }
            i++;
        }
        if (!TextUtils.isEmpty(str)) {
            co3 co3Var = Utilities.g;
            fea feaVar = new fea(this, str, (byte) 0);
            this.f = feaVar;
            co3Var.d(feaVar, 300L);
        }
    }

    @Override
    public final int b() {
        return this.h;
    }

    @Override
    public final int d(int i) {
        return 22;
    }

    @Override
    public final void f() {
        int size = this.e.g.size();
        this.h = size;
        if (size > 0) {
            nfa nfaVar = this.s;
            if (nfaVar.Y0) {
                iea ieaVar = nfaVar.n0[0];
                if (ieaVar.F == 7 && ieaVar.h.getAdapter() != this) {
                    nfaVar.z1(false);
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        TLRPC.User V1;
        SpannableStringBuilder spannableStringBuilder;
        nfa nfaVar = this.s;
        d dVar = nfaVar.y1;
        TLObject E = E(i);
        if (E instanceof TLRPC.ChannelParticipant) {
            V1 = dVar.getMessagesController().V1(Long.valueOf(k27.B1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            V1 = dVar.getMessagesController().V1(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        l7c.p(V1);
        zr9 zr9Var = this.e;
        zr9Var.g.size();
        String str = zr9Var.n;
        if (str != null) {
            String r = l7c.r(V1);
            spannableStringBuilder = new SpannableStringBuilder(r);
            int y1 = gl.y1(r, str);
            if (y1 != -1) {
                spannableStringBuilder.setSpan(new cm4(bkb.p6, nfaVar.I1), y1, str.length() + y1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = s49Var.a;
        if (view instanceof gh6) {
            gh6 gh6Var = (gh6) view;
            gh6Var.setTag(Integer.valueOf(i));
            gh6Var.c(V1, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        nfa nfaVar = this.s;
        gh6 gh6Var = new gh6(this.c, 9, 5, true, nfaVar.I1);
        zkb.h(bkb.c6, nfaVar.I1, gh6Var);
        gh6Var.setDelegate(new eea(this));
        return new s49(gh6Var);
    }
}
