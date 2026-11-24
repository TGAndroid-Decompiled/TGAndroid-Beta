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
public final class zga extends q59 {
    public int F;
    public final nha H;
    public final Context c;
    public final int d;
    public boolean r;
    public String x;
    public k39 y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public boolean s = false;
    public int w = 0;
    public int E = -1;
    public final c0a G = new c0a(this, (byte) 17);

    public zga(nha nhaVar, Context context) {
        this.H = nhaVar;
        this.c = context;
        this.d = nhaVar.y1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    public final void E(k39 k39Var, String str) {
        long j;
        String str2;
        if (TextUtils.equals(str, this.x)) {
            k39 k39Var2 = this.y;
            if (k39Var2 == null) {
                if (k39Var == null) {
                    return;
                }
            } else if (k39Var2.equals(k39Var)) {
                return;
            }
        }
        this.x = str;
        this.y = k39Var;
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
            wr9 E1 = oc7.r1(i2).E1();
            int i4 = E1.a;
            ArrayList arrayList2 = E1.j;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                String I3 = gm.I3(str.toLowerCase());
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    vr9 vr9Var = (vr9) arrayList2.get(i5);
                    long j2 = vr9Var.a;
                    String str3 = null;
                    if (j2 == 2666000) {
                        str2 = jb6.M0(2131754217, null);
                    } else if (j2 == z8c.h(i4).e()) {
                        str2 = jb6.M0(2131748060, null);
                        str3 = jb6.M0(2131745635, null);
                    } else if (vr9Var.a >= 0) {
                        str2 = m9c.r(oc7.r1(i4).W1(Long.valueOf(vr9Var.a)));
                    } else {
                        TLRPC.Chat L0 = oc7.r1(i4).L0(Long.valueOf(-vr9Var.a));
                        if (L0 != null) {
                            str2 = L0.title;
                        } else {
                            str2 = "";
                        }
                    }
                    if (str2 != null) {
                        String I32 = gm.I3(str2.toLowerCase());
                        if (!I32.startsWith(I3) && !I32.contains(" ".concat(I3))) {
                            if (str3 != null) {
                                String I33 = gm.I3(str3.toLowerCase());
                                if (I33.startsWith(I3) || I33.contains(" ".concat(I3))) {
                                    arrayList3.add(vr9Var);
                                }
                            }
                        } else {
                            arrayList3.add(vr9Var);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
        }
        while (true) {
            iga[] igaVarArr = this.H.n0;
            if (i3 >= igaVarArr.length) {
                break;
            }
            iga igaVar = igaVarArr[i3];
            if (igaVar.F == 11) {
                igaVar.w.e(true, true);
            }
            i3++;
        }
        if (this.y == null) {
            f();
        }
        c0a c0aVar = this.G;
        gm.r(c0aVar);
        if (this.y != null) {
            j = 60;
        } else {
            j = 600;
        }
        gm.d3(c0aVar, j);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.x) && this.y == null) {
            this.r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i = this.d;
        tL_messages_search.peer = oc7.r1(i).i1(z8c.h(i).e());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.q = this.x;
        k39 k39Var = this.y;
        if (k39Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(k39Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((k47) b10.f(1, arrayList)).e1();
        }
        tL_messages_search.limit = 10;
        this.s = false;
        int i2 = this.F + 1;
        this.F = i2;
        v99 v99Var = new v99(this, i2, tL_messages_search, (byte) 8);
        if (this.y != null) {
            cf7 Y = cf7.Y(i);
            Y.a.c(new se7(Y, this.x, 0L, this.y.g(), 100, this.n.size(), false, new g25(this, v99Var, (byte) 2)));
            return;
        }
        v99Var.run();
    }

    public final void G(boolean z) {
        ArrayList arrayList;
        CharSequence a0;
        CharSequence charSequence;
        iga[] igaVarArr = this.H.n0;
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i >= arrayList3.size()) {
                break;
            }
            k47 k47Var = (k47) arrayList3.get(i);
            if (k47Var != null && !hashSet.contains(Integer.valueOf(k47Var.e1()))) {
                hashSet.add(Integer.valueOf(k47Var.e1()));
                arrayList2.add(k47Var);
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            arrayList = this.n;
            if (i2 >= arrayList.size()) {
                break;
            }
            k47 k47Var2 = (k47) arrayList.get(i2);
            if (k47Var2 != null && !hashSet.contains(Integer.valueOf(k47Var2.e1()))) {
                hashSet.add(Integer.valueOf(k47Var2.e1()));
                arrayList2.add(k47Var2);
            }
            i2++;
        }
        if (!z || !arrayList.isEmpty()) {
            for (int i3 = 0; i3 < igaVarArr.length; i3++) {
                if (igaVarArr[i3].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    xna xnaVar = igaVarArr[i3].w.d;
                    if (this.y != null && TextUtils.isEmpty(this.x)) {
                        String M0 = jb6.M0(2131747898, null);
                        k39 k39Var = this.y;
                        Paint.FontMetricsInt fontMetricsInt = igaVarArr[i3].w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(k39Var.f)) {
                            charSequence = k39Var.f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new gn(k39Var.g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        a0 = gm.G2(M0, charSequence, "%s");
                    } else {
                        a0 = jb6.a0(null, null, 2131747900, this.x);
                    }
                    xnaVar.setText(a0);
                    igaVarArr[i3].w.f.setVisibility(8);
                    igaVarArr[i3].w.e(false, true);
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
                hash = Objects.hash(1, Long.valueOf(((vr9) arrayList.get(i)).a));
            } else {
                i -= arrayList.size();
                ArrayList arrayList2 = this.f;
                if (i < arrayList2.size()) {
                    hash = Objects.hash(2, Long.valueOf(((k47) arrayList2.get(i)).P1()), Integer.valueOf(((k47) arrayList2.get(i)).e1()));
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
    public final void t(u69 u69Var, int i) {
        boolean z;
        if (i >= 0) {
            View view = u69Var.a;
            if (view instanceof hg3) {
                hg3 hg3Var = (hg3) view;
                if (i + 1 < b()) {
                    z = true;
                } else {
                    z = false;
                }
                hg3Var.t2 = z;
                ArrayList arrayList = this.e;
                if (i < arrayList.size()) {
                    vr9 vr9Var = (vr9) arrayList.get(i);
                    hg3Var.e0(vr9Var.a, vr9Var.d, vr9Var.c(), false, false);
                    return;
                }
                int size = i - arrayList.size();
                ArrayList arrayList2 = this.f;
                if (size < arrayList2.size()) {
                    k47 k47Var = (k47) arrayList2.get(size);
                    hg3Var.e0(k47Var.P1(), k47Var, k47Var.k.date, false, false);
                }
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        gm3 gm3Var = new gm3((byte) 2, this.c, true);
        nha nhaVar = this.H;
        gm3Var.setDialogCellDelegate(nhaVar);
        gm3Var.s0 = true;
        anb.h(cmb.c6, nhaVar.I1, gm3Var);
        return new u69(gm3Var);
    }
}
