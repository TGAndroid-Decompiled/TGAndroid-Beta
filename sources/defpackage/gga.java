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
public final class gga extends q59 {
    public final Context c;
    public final bu9 e;
    public fga f;
    public final TLRPC.Chat n;
    public final nha s;
    public ArrayList d = new ArrayList();
    public int h = 0;
    public int r = 0;

    public gga(nha nhaVar, Context context) {
        this.s = nhaVar;
        this.c = context;
        bu9 bu9Var = new bu9(true);
        this.e = bu9Var;
        bu9Var.a = new ega(this);
        this.n = nhaVar.G1.f();
    }

    @Override
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof ij6) {
            ((ij6) view).a();
        }
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    public final TLObject E(int i) {
        bu9 bu9Var = this.e;
        int size = bu9Var.g.size();
        if (i >= 0 && i < size) {
            return (TLObject) bu9Var.g.get(i);
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
        bu9 bu9Var = this.e;
        if (sd2.T(this.n)) {
            j = this.n.id;
        } else {
            j = 0;
        }
        bu9Var.g(null, true, false, true, false, j, false, 2, 0);
        f();
        int i = 0;
        while (true) {
            iga[] igaVarArr = this.s.n0;
            if (i >= igaVarArr.length) {
                break;
            }
            if (igaVarArr[i].F == 7 && !TextUtils.isEmpty(str)) {
                this.s.n0[i].w.e(true, z);
            }
            i++;
        }
        if (!TextUtils.isEmpty(str)) {
            mp3 mp3Var = Utilities.g;
            fga fgaVar = new fga(this, str, (byte) 0);
            this.f = fgaVar;
            mp3Var.d(fgaVar, 300L);
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
            nha nhaVar = this.s;
            if (nhaVar.Y0) {
                iga igaVar = nhaVar.n0[0];
                if (igaVar.F == 7 && igaVar.h.getAdapter() != this) {
                    nhaVar.z1(false);
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        TLRPC.User W1;
        SpannableStringBuilder spannableStringBuilder;
        nha nhaVar = this.s;
        d dVar = nhaVar.y1;
        TLObject E = E(i);
        if (E instanceof TLRPC.ChannelParticipant) {
            W1 = dVar.getMessagesController().W1(Long.valueOf(k47.B1(((TLRPC.ChannelParticipant) E).peer)));
        } else if (E instanceof TLRPC.ChatParticipant) {
            W1 = dVar.getMessagesController().W1(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
        } else {
            return;
        }
        m9c.p(W1);
        bu9 bu9Var = this.e;
        bu9Var.g.size();
        String str = bu9Var.n;
        if (str != null) {
            String r = m9c.r(W1);
            spannableStringBuilder = new SpannableStringBuilder(r);
            int y1 = gm.y1(r, str);
            if (y1 != -1) {
                spannableStringBuilder.setSpan(new do4(cmb.p6, nhaVar.I1), y1, str.length() + y1, 33);
            }
        } else {
            spannableStringBuilder = null;
        }
        View view = u69Var.a;
        if (view instanceof ij6) {
            ij6 ij6Var = (ij6) view;
            ij6Var.setTag(Integer.valueOf(i));
            ij6Var.c(W1, spannableStringBuilder, null, false);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        nha nhaVar = this.s;
        ij6 ij6Var = new ij6(this.c, 9, 5, true, nhaVar.I1);
        anb.h(cmb.c6, nhaVar.I1, ij6Var);
        ij6Var.setDelegate(new ega(this));
        return new u69(ij6Var);
    }
}
