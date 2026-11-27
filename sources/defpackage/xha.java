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
import org.telegram.ui.ActionBar.e;
public final class xha extends c79 {
    public final Context c;
    public final sv9 e;
    public wha f;
    public final TLRPC.Chat n;
    public final eja s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public xha(eja ejaVar, Context context) {
        this.s = ejaVar;
        this.c = context;
        sv9 sv9Var = new sv9(true);
        this.e = sv9Var;
        sv9Var.a = new vha(this);
        this.n = ejaVar.G1.e();
    }

    @Override
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof lj6) {
            ((lj6) view).a();
        }
    }

    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    public final TLObject E(int i) {
        sv9 sv9Var = this.e;
        int size = sv9Var.g.size();
        if (i >= 0 && i < size) {
            return (TLObject) sv9Var.g.get(i);
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
        sv9 sv9Var = this.e;
        if (xc2.T(this.n)) {
            j = this.n.id;
        } else {
            j = 0;
        }
        sv9Var.g(null, true, false, true, false, j, false, 2, 0);
        f();
        int i = 0;
        while (true) {
            zha[] zhaVarArr = this.s.n0;
            if (i >= zhaVarArr.length) {
                break;
            }
            if (zhaVarArr[i].F == 7 && !TextUtils.isEmpty(str)) {
                this.s.n0[i].w.e(true, z);
            }
            i++;
        }
        if (!TextUtils.isEmpty(str)) {
            to3 to3Var = Utilities.g;
            wha whaVar = new wha(this, str, (byte) 0);
            this.f = whaVar;
            to3Var.d(whaVar, 300L);
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
            eja ejaVar = this.s;
            if (ejaVar.Y0) {
                zha zhaVar = ejaVar.n0[0];
                if (zhaVar.F == 7 && zhaVar.h.getAdapter() != this) {
                    ejaVar.z1(false);
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        TLRPC.User X1;
        SpannableStringBuilder spannableStringBuilder;
        eja ejaVar = this.s;
        e eVar = ejaVar.y1;
        TLObject E = E(i);
        if (E instanceof TLRPC.ChannelParticipant) {
            X1 = eVar.getMessagesController().X1(Long.valueOf(r47.B1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            X1 = eVar.getMessagesController().X1(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        lbc.p(X1);
        sv9 sv9Var = this.e;
        sv9Var.g.size();
        String str = sv9Var.n;
        if (str != null) {
            String r = lbc.r(X1);
            spannableStringBuilder = new SpannableStringBuilder(r);
            int y1 = hl.y1(r, str);
            if (y1 != -1) {
                spannableStringBuilder.setSpan(new ho4(aob.q6, ejaVar.I1), y1, str.length() + y1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = f89Var.a;
        if (view instanceof lj6) {
            lj6 lj6Var = (lj6) view;
            lj6Var.setTag(Integer.valueOf(i));
            lj6Var.c(X1, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        eja ejaVar = this.s;
        lj6 lj6Var = new lj6(this.c, 9, 5, true, ejaVar.I1);
        yob.h(aob.d6, ejaVar.I1, lj6Var);
        lj6Var.setDelegate(new vha(this));
        return new f89(lj6Var);
    }
}
