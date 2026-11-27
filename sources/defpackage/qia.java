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
public final class qia extends c79 {
    public int F;
    public final eja H;
    public final Context c;
    public final int d;
    public boolean r;
    public String x;
    public w49 y;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public boolean s = false;
    public int w = 0;
    public int E = -1;
    public final ux9 G = new ux9(this, (byte) 26);

    public qia(eja ejaVar, Context context) {
        this.H = ejaVar;
        this.c = context;
        this.d = ejaVar.y1.getCurrentAccount();
        C(true);
    }

    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    public final void E(w49 w49Var, String str) {
        long j;
        String str2;
        if (TextUtils.equals(str, this.x)) {
            w49 w49Var2 = this.y;
            if (w49Var2 == null) {
                if (w49Var == null) {
                    return;
                }
            } else if (w49Var2.equals(w49Var)) {
                return;
            }
        }
        this.x = str;
        this.y = w49Var;
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
            nt9 F1 = uc7.s1(i2).F1();
            int i4 = F1.a;
            ArrayList arrayList2 = F1.j;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                String I3 = hl.I3(str.toLowerCase());
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    mt9 mt9Var = (mt9) arrayList2.get(i5);
                    long j2 = mt9Var.a;
                    String str3 = null;
                    if (j2 == 2666000) {
                        str2 = ob6.M0(2131754245, null);
                    } else if (j2 == yac.h(i4).e()) {
                        str2 = ob6.M0(2131748057, null);
                        str3 = ob6.M0(2131745629, null);
                    } else if (mt9Var.a >= 0) {
                        str2 = lbc.r(uc7.s1(i4).X1(Long.valueOf(mt9Var.a)));
                    } else {
                        TLRPC.Chat M0 = uc7.s1(i4).M0(Long.valueOf(-mt9Var.a));
                        if (M0 != null) {
                            str2 = M0.title;
                        } else {
                            str2 = "";
                        }
                    }
                    if (str2 != null) {
                        String I32 = hl.I3(str2.toLowerCase());
                        if (!I32.startsWith(I3) && !I32.contains(" ".concat(I3))) {
                            if (str3 != null) {
                                String I33 = hl.I3(str3.toLowerCase());
                                if (I33.startsWith(I3) || I33.contains(" ".concat(I3))) {
                                    arrayList3.add(mt9Var);
                                }
                            }
                        } else {
                            arrayList3.add(mt9Var);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
        }
        while (true) {
            zha[] zhaVarArr = this.H.n0;
            if (i3 >= zhaVarArr.length) {
                break;
            }
            zha zhaVar = zhaVarArr[i3];
            if (zhaVar.F == 11) {
                zhaVar.w.e(true, true);
            }
            i3++;
        }
        if (this.y == null) {
            f();
        }
        ux9 ux9Var = this.G;
        hl.r(ux9Var);
        if (this.y != null) {
            j = 60;
        } else {
            j = 600;
        }
        hl.d3(ux9Var, j);
    }

    public final void F() {
        if (TextUtils.isEmpty(this.x) && this.y == null) {
            this.r = false;
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        int i = this.d;
        tL_messages_search.peer = uc7.s1(i).j1(yac.h(i).e());
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.q = this.x;
        w49 w49Var = this.y;
        if (w49Var != null) {
            tL_messages_search.flags |= 8;
            tL_messages_search.saved_reaction.add(w49Var.g());
        }
        ArrayList arrayList = this.h;
        if (arrayList.size() > 0) {
            tL_messages_search.offset_id = ((r47) c00.g(1, arrayList)).e1();
        }
        tL_messages_search.limit = 10;
        this.s = false;
        int i2 = this.F + 1;
        this.F = i2;
        a39 a39Var = new a39(this, i2, tL_messages_search, (byte) 9);
        if (this.y != null) {
            kf7 a0 = kf7.a0(i);
            a0.a.c(new ze7(a0, this.x, 0L, this.y.g(), 100, this.n.size(), false, new k25(this, a39Var, (byte) 2)));
            return;
        }
        a39Var.run();
    }

    public final void G(boolean z) {
        ArrayList arrayList;
        CharSequence a0;
        CharSequence charSequence;
        zha[] zhaVarArr = this.H.n0;
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList3 = this.h;
            if (i >= arrayList3.size()) {
                break;
            }
            r47 r47Var = (r47) arrayList3.get(i);
            if (r47Var != null && !hashSet.contains(Integer.valueOf(r47Var.e1()))) {
                hashSet.add(Integer.valueOf(r47Var.e1()));
                arrayList2.add(r47Var);
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            arrayList = this.n;
            if (i2 >= arrayList.size()) {
                break;
            }
            r47 r47Var2 = (r47) arrayList.get(i2);
            if (r47Var2 != null && !hashSet.contains(Integer.valueOf(r47Var2.e1()))) {
                hashSet.add(Integer.valueOf(r47Var2.e1()));
                arrayList2.add(r47Var2);
            }
            i2++;
        }
        if (!z || !arrayList.isEmpty()) {
            for (int i3 = 0; i3 < zhaVarArr.length; i3++) {
                if (zhaVarArr[i3].F == 11 && arrayList2.isEmpty() && this.e.isEmpty()) {
                    tpa tpaVar = zhaVarArr[i3].w.d;
                    if (this.y != null && TextUtils.isEmpty(this.x)) {
                        String M0 = ob6.M0(2131747895, null);
                        w49 w49Var = this.y;
                        Paint.FontMetricsInt fontMetricsInt = zhaVarArr[i3].w.d.getPaint().getFontMetricsInt();
                        if (!TextUtils.isEmpty(w49Var.f)) {
                            charSequence = w49Var.f;
                        } else {
                            SpannableString spannableString = new SpannableString("😀");
                            spannableString.setSpan(new hm(w49Var.g, fontMetricsInt), 0, spannableString.length(), 17);
                            charSequence = spannableString;
                        }
                        a0 = hl.G2(M0, charSequence, "%s");
                    } else {
                        a0 = ob6.a0(null, null, 2131747897, this.x);
                    }
                    tpaVar.setText(a0);
                    zhaVarArr[i3].w.f.setVisibility(8);
                    zhaVarArr[i3].w.e(false, true);
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
                hash = Objects.hash(1, Long.valueOf(((mt9) arrayList.get(i)).a));
            } else {
                i -= arrayList.size();
                ArrayList arrayList2 = this.f;
                if (i < arrayList2.size()) {
                    hash = Objects.hash(2, Long.valueOf(((r47) arrayList2.get(i)).P1()), Integer.valueOf(((r47) arrayList2.get(i)).e1()));
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
    public final void t(f89 f89Var, int i) {
        boolean z;
        if (i >= 0) {
            View view = f89Var.a;
            if (view instanceof of3) {
                of3 of3Var = (of3) view;
                if (i + 1 < b()) {
                    z = true;
                } else {
                    z = false;
                }
                of3Var.t2 = z;
                ArrayList arrayList = this.e;
                if (i < arrayList.size()) {
                    mt9 mt9Var = (mt9) arrayList.get(i);
                    of3Var.e0(mt9Var.a, mt9Var.d, mt9Var.c(), false, false);
                    return;
                }
                int size = i - arrayList.size();
                ArrayList arrayList2 = this.f;
                if (size < arrayList2.size()) {
                    r47 r47Var = (r47) arrayList2.get(size);
                    of3Var.e0(r47Var.P1(), r47Var, r47Var.k.date, false, false);
                }
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        nl3 nl3Var = new nl3((byte) 2, this.c, true);
        eja ejaVar = this.H;
        nl3Var.setDialogCellDelegate(ejaVar);
        nl3Var.s0 = true;
        yob.h(aob.d6, ejaVar.I1, nl3Var);
        return new f89(nl3Var);
    }
}
