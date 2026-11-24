package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class zea extends n39 {
    public int F;
    public final nfa H;
    public final Context c;
    public final int d;
    public boolean r;
    public String x;
    public h19 y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public boolean s = false;
    public int w = 0;
    public int E = -1;
    public final z6a G = new z6a(this, (byte) 9);

    public zea(nfa nfaVar, Context context) {
        this.H = nfaVar;
        this.c = context;
        this.d = nfaVar.y1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    public final void E(h19 h19Var, String str) {
        long j;
        String str2;
        if (TextUtils.equals(str, this.x)) {
            h19 h19Var2 = this.y;
            if (h19Var2 == null) {
                if (h19Var == null) {
                    return;
                }
            } else if (h19Var2.equals(h19Var)) {
                return;
            }
        }
        this.x = str;
        this.y = h19Var;
        int i = this.E;
        int i2 = this.d;
        if (i >= 0) {
            ConnectionsManager.getInstance(i2).cancelRequest(this.E, true);
            this.E = -1;
        }
        this.n.clear();
        this.h.clear();
        this.f.clear();
        int i3 = 0;
        this.w = 0;
        this.s = false;
        this.r = true;
        ArrayList arrayList = this.e;
        arrayList.clear();
        if (this.y == null) {
            vp9 D1 = na7.q1(i2).D1();
            int i4 = D1.a;
            ArrayList arrayList2 = D1.j;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                String I3 = gl.I3(str.toLowerCase());
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    up9 up9Var = (up9) arrayList2.get(i5);
                    long j2 = up9Var.a;
                    String str3 = null;
                    if (j2 == 2666000) {
                        str2 = k96.M0(2131754249, null);
                    } else if (j2 == y6c.h(i4).e()) {
                        str2 = k96.M0(2131748111, null);
                        str3 = k96.M0(2131745709, null);
                    } else if (up9Var.a >= 0) {
                        str2 = l7c.r(na7.q1(i4).V1(Long.valueOf(up9Var.a)));
                    } else {
                        TLRPC.Chat K0 = na7.q1(i4).K0(Long.valueOf(-up9Var.a));
                        if (K0 != null) {
                            str2 = K0.title;
                        } else {
                            str2 = "";
                        }
                    }
                    if (str2 != null) {
                        String I32 = gl.I3(str2.toLowerCase());
                        if (!I32.startsWith(I3) && !I32.contains(" ".concat(I3))) {
                            if (str3 != null) {
                                String I33 = gl.I3(str3.toLowerCase());
                                if (I33.startsWith(I3) || I33.contains(" ".concat(I3))) {
                                    arrayList3.add(up9Var);
                                }
                            }
                        } else {
                            arrayList3.add(up9Var);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
        }
        while (true) {
            iea[] ieaVarArr = this.H.n0;
            if (i3 >= ieaVarArr.length) {
                break;
            }
            iea ieaVar = ieaVarArr[i3];
            if (ieaVar.F == 11) {
                ieaVar.w.e(true, true);
            }
            i3++;
        }
        if (this.y == null) {
            f();
        }
        z6a z6aVar = this.G;
        gl.r(z6aVar);
        if (this.y != null) {
            j = 60;
        } else {
            j = 600;
        }
        gl.d3(z6aVar, j);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.x) && this.y == null) {
            this.r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i = this.d;
        tL_messages_search.peer = na7.q1(i).h1(y6c.h(i).e());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.q = this.x;
        h19 h19Var = this.y;
        if (h19Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(h19Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((k27) b00.f(1, arrayList)).e1();
        }
        tL_messages_search.limit = 10;
        this.s = false;
        int i2 = this.F + 1;
        this.F = i2;
        t79 t79Var = new t79(this, i2, tL_messages_search, (byte) 8);
        if (this.y != null) {
            ad7 Y = ad7.Y(i);
            Y.a.c(new qc7(Y, this.x, 0L, this.y.g(), 100, this.n.size(), false, new g05(this, t79Var, (byte) 2)));
            return;
        }
        t79Var.run();
    }

    public final void G(boolean z) {
        ArrayList arrayList;
        CharSequence a0;
        CharSequence charSequence;
        iea[] ieaVarArr = this.H.n0;
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i >= arrayList3.size()) {
                break;
            }
            k27 k27Var = (k27) arrayList3.get(i);
            if (k27Var != null && !hashSet.contains(Integer.valueOf(k27Var.e1()))) {
                hashSet.add(Integer.valueOf(k27Var.e1()));
                arrayList2.add(k27Var);
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            arrayList = this.n;
            if (i2 >= arrayList.size()) {
                break;
            }
            k27 k27Var2 = (k27) arrayList.get(i2);
            if (k27Var2 != null && !hashSet.contains(Integer.valueOf(k27Var2.e1()))) {
                hashSet.add(Integer.valueOf(k27Var2.e1()));
                arrayList2.add(k27Var2);
            }
            i2++;
        }
        if (!z || !arrayList.isEmpty()) {
            for (int i3 = 0; i3 < ieaVarArr.length; i3++) {
                if (ieaVarArr[i3].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    wla wlaVar = ieaVarArr[i3].w.d;
                    if (this.y != null && TextUtils.isEmpty(this.x)) {
                        String M0 = k96.M0(2131747972, null);
                        h19 h19Var = this.y;
                        Paint.FontMetricsInt fontMetricsInt = ieaVarArr[i3].w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(h19Var.f)) {
                            charSequence = h19Var.f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new gm(h19Var.g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        a0 = gl.G2(M0, charSequence, "%s");
                    } else {
                        a0 = k96.a0(null, null, 2131747974, this.x);
                    }
                    wlaVar.setText(a0);
                    ieaVarArr[i3].w.f.setVisibility(8);
                    ieaVarArr[i3].w.e(false, true);
                }
            }
        }
        f();
    }

    @Override
    public final int b() {
        return this.f.size() + this.e.size();
    }

    @Override
    public final long c(int i) {
        int hash;
        if (i >= 0) {
            ArrayList arrayList = this.e;
            if (i < arrayList.size()) {
                hash = Objects.hash(1, Long.valueOf(((up9) arrayList.get(i)).a));
            } else {
                i -= arrayList.size();
                ArrayList arrayList2 = this.f;
                if (i < arrayList2.size()) {
                    hash = Objects.hash(2, Long.valueOf(((k27) arrayList2.get(i)).P1()), Integer.valueOf(((k27) arrayList2.get(i)).e1()));
                }
            }
            return hash;
        }
        return i;
    }

    @Override
    public final int d(int i) {
        return 23;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        if (i >= 0) {
            View view = s49Var.a;
            if (view instanceof ue3) {
                ue3 ue3Var = (ue3) view;
                if (i + 1 < b()) {
                    z = true;
                } else {
                    z = false;
                }
                ue3Var.t2 = z;
                ArrayList arrayList = this.e;
                if (i < arrayList.size()) {
                    up9 up9Var = (up9) arrayList.get(i);
                    ue3Var.f0(up9Var.a, up9Var.d, up9Var.c(), false, false);
                    return;
                }
                int size = i - arrayList.size();
                ArrayList arrayList2 = this.f;
                if (size < arrayList2.size()) {
                    k27 k27Var = (k27) arrayList2.get(size);
                    ue3Var.f0(k27Var.P1(), k27Var, k27Var.k.date, false, false);
                }
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        vk3 vk3Var = new vk3((byte) 2, this.c, true);
        nfa nfaVar = this.H;
        vk3Var.setDialogCellDelegate(nfaVar);
        vk3Var.s0 = true;
        zkb.h(bkb.c6, nfaVar.I1, vk3Var);
        return new s49(vk3Var);
    }
}
