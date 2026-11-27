package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pc5 extends l69 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final rc5 J;
    public final Context c;
    public final sv9 f;
    public Runnable h;
    public boolean n;
    public int s;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public pc5(rc5 rc5Var, Context context) {
        TLRPC.Chat M0;
        String substring;
        String substring2;
        TLRPC.User X1;
        this.J = rc5Var;
        this.c = context;
        HashSet hashSet = new HashSet();
        lv2 contactsController = rc5Var.getContactsController();
        boolean z = rc5Var.R;
        ArrayList arrayList = contactsController.f0;
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.User X12 = rc5Var.getMessagesController().X1(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i)).user_id));
            if (X12 != null && !X12.self && !X12.deleted) {
                this.r.add(X12);
                hashSet.add(Long.valueOf(X12.id));
            }
        }
        if (rc5Var.Q || rc5Var.P || z) {
            ArrayList arrayList2 = rc5Var.getMessagesController().y;
            if (z) {
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i2);
                    if (wf3.D(dialog.id) && !hashSet.contains(Long.valueOf(dialog.id)) && (X1 = rc5Var.getMessagesController().X1(Long.valueOf(dialog.id))) != null && !lbc.z(X1) && !lbc.D(X1) && !lbc.v(X1) && !lbc.C(dialog.id) && !uc7.K2(X1)) {
                        this.r.add(X1);
                        hashSet.add(Long.valueOf(X1.id));
                    }
                }
            } else {
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i3);
                    if (wf3.y(dialog2.id) && (M0 = rc5Var.getMessagesController().M0(Long.valueOf(-dialog2.id))) != null && M0.migrated_to == null && (!xc2.T(M0) || M0.megagroup)) {
                        this.r.add(M0);
                    }
                }
            }
            Collections.sort(this.r, new Object());
            TLObject tLObject = null;
            int i4 = 0;
            while (i4 < this.r.size()) {
                TLObject tLObject2 = (TLObject) this.r.get(i4);
                if (tLObject != null) {
                    String a = kc5.a(tLObject);
                    if (TextUtils.isEmpty(a)) {
                        substring = "";
                    } else {
                        substring = a.substring(0, 1);
                    }
                    String a2 = kc5.a(tLObject2);
                    if (TextUtils.isEmpty(a2)) {
                        substring2 = "";
                    } else {
                        substring2 = a2.substring(0, 1);
                    }
                    if (substring.equals(substring2)) {
                        i4++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList3 = this.r;
                String a3 = kc5.a(tLObject2);
                arrayList3.add(i4, new qc5(TextUtils.isEmpty(a3) ? "" : a3.substring(0, 1)));
                i4++;
                tLObject = tLObject2;
            }
        }
        sv9 sv9Var = new sv9(false);
        this.f = sv9Var;
        sv9Var.a = new e05(this, (byte) 8);
    }

    @Override
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof bd5) {
            ((bd5) view).a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f != 0) {
            rc5 rc5Var = this.J;
            if (rc5Var.K != null) {
                View view = f89Var.a;
                if (view instanceof bd5) {
                    Object object = ((bd5) view).getObject();
                    if ((object instanceof TLRPC.User) && rc5Var.K.h(((TLRPC.User) object).id) >= 0) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i) {
        String str;
        String str2;
        if (!this.n && i >= this.F) {
            ArrayList arrayList = this.r;
            int size = arrayList.size();
            int i2 = this.F;
            if (i < size + i2) {
                TLObject tLObject = (TLObject) arrayList.get(i - i2);
                if (tLObject instanceof qc5) {
                    return ((qc5) tLObject).a;
                }
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    str = user.first_name;
                    str2 = user.last_name;
                } else {
                    str = ((TLRPC.Chat) tLObject).title;
                    str2 = "";
                }
                if (ob6.b0 == 1) {
                    if (!TextUtils.isEmpty(str)) {
                        return str.substring(0, 1).toUpperCase();
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        return str2.substring(0, 1).toUpperCase();
                    }
                } else if (!TextUtils.isEmpty(str2)) {
                    return str2.substring(0, 1).toUpperCase();
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        return str.substring(0, 1).toUpperCase();
                    }
                }
                return "";
            }
            return null;
        }
        return null;
    }

    @Override
    public final void G(d79 d79Var, float f, int[] iArr) {
        iArr[0] = (int) (b() * f);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z;
        if (this.h != null) {
            Utilities.g.a(this.h);
            this.h = null;
        }
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        sv9 sv9Var = this.f;
        rc5 rc5Var = this.J;
        if (!rc5Var.P && !rc5Var.Q) {
            z = false;
        } else {
            z = true;
        }
        sv9Var.g(null, true, z, false, false, 0L, false, 0, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            to3 to3Var = Utilities.g;
            nc5 nc5Var = new nc5(this, str, (byte) 0);
            this.h = nc5Var;
            to3Var.d(nc5Var, 300L);
        }
    }

    @Override
    public final int b() {
        int i;
        boolean z;
        ?? r0;
        rc5 rc5Var = this.J;
        long j = rc5Var.I;
        long j2 = rc5Var.H;
        this.H = -1;
        this.s = -1;
        this.x = -1;
        this.w = -1;
        this.y = -1;
        this.E = -1;
        if (this.n) {
            int size = this.d.size();
            sv9 sv9Var = this.f;
            int size2 = sv9Var.d.size();
            int size3 = sv9Var.e.size();
            int i2 = size + size2;
            if (size3 != 0) {
                i2 += size3 + 1;
            }
            this.I = i2;
            return i2;
        }
        if (rc5Var.R) {
            this.x = 0;
            i = 1;
        } else {
            i = 0;
        }
        if (rc5Var.W) {
            int i3 = i + 1;
            this.w = i;
            this.s = i;
            i += 2;
            this.y = i3;
        } else if (rc5Var.X) {
            int i4 = i + 1;
            this.w = i;
            this.s = i;
            i += 2;
            this.E = i4;
        } else {
            this.w = i;
        }
        this.F = i;
        int size4 = this.r.size() + i;
        if (rc5Var.S) {
            if (j2 != 0) {
                boolean y = xc2.y(3, rc5Var.getMessagesController().M0(Long.valueOf(j2)));
                this.G = y ? 1 : 0;
                z = y;
            } else if (j != 0) {
                TLRPC.Chat M0 = rc5Var.getMessagesController().M0(Long.valueOf(j));
                if (xc2.y(3, M0) && !xc2.t0(M0)) {
                    r0 = 2;
                } else {
                    r0 = 0;
                }
                this.G = r0 == true ? 1 : 0;
                z = r0;
            } else {
                this.G = 0;
                z = false;
            }
            if (z) {
                this.F++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.H = 0;
            size4++;
        }
        this.I = size4;
        return size4;
    }

    @Override
    public final int d(int i) {
        if (this.n) {
            if (i == this.f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i != this.x) {
            if (i != this.s) {
                if (i != this.y && i != this.E) {
                    if (this.G != 0 && i == 0) {
                        return 2;
                    }
                    if (this.H == i) {
                        return 3;
                    }
                    int i2 = i - this.F;
                    if (i2 >= 0) {
                        ArrayList arrayList = this.r;
                        if (i2 < arrayList.size() && (arrayList.get(i - this.F) instanceof qc5)) {
                            return 0;
                        }
                        return 1;
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        } else {
            return 2;
        }
    }

    @Override
    public final void f() {
        super.f();
        this.J.w0();
    }

    @Override
    public final void t(f89 f89Var, int i) {
        String M0;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j;
        boolean z;
        CharSequence charSequence;
        String K;
        int i2 = f89Var.f;
        View view = f89Var.a;
        ArrayList arrayList = this.r;
        rc5 rc5Var = this.J;
        SpannableStringBuilder spannableStringBuilder2 = null;
        if (i2 != 0) {
            boolean z2 = true;
            if (i2 != 1) {
                if (i2 == 2) {
                    skb skbVar = (skb) view;
                    if (i == this.x) {
                        skbVar.o(2131231845, ob6.M0(2131749239, null), false);
                        skbVar.g(aob.v6, aob.u6);
                        return;
                    } else if (this.G == 2) {
                        skbVar.o(2131232209, ob6.M0(2131752374, null), false);
                        skbVar.g(aob.m6, aob.G6);
                        return;
                    } else {
                        skbVar.o(2131232209, ob6.M0(2131748864, null), false);
                        skbVar.g(aob.m6, aob.G6);
                        return;
                    }
                }
                return;
            }
            bd5 bd5Var = (bd5) view;
            if (this.n) {
                int size = this.d.size();
                sv9 sv9Var = this.f;
                ArrayList arrayList2 = sv9Var.e;
                ArrayList arrayList3 = sv9Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i >= 0 && i < size) {
                    tLObject = (TLObject) this.d.get(i);
                } else if (i >= size && i < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i - size);
                } else if (i > size + size3 && i <= size2 + size + size3) {
                    tLObject = (TLObject) sv9Var.e.get(((i - size) - size3) - 1);
                } else {
                    tLObject = null;
                }
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.User) {
                        K = ((TLRPC.User) tLObject).username;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        K = xc2.K((TLRPC.Chat) tLObject, false);
                    } else {
                        return;
                    }
                    if (i < size) {
                        charSequence = (CharSequence) this.e.get(i);
                        if (charSequence != null && !TextUtils.isEmpty(K)) {
                            if (charSequence.toString().startsWith("@" + K)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i > size && !TextUtils.isEmpty(K)) {
                        String str = sv9Var.c;
                        if (str.startsWith("@")) {
                            str = str.substring(1);
                        }
                        try {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) "@");
                            spannableStringBuilder3.append((CharSequence) K);
                            int y1 = hl.y1(K, str);
                            if (y1 != -1) {
                                int length = str.length();
                                if (y1 == 0) {
                                    length++;
                                } else {
                                    y1++;
                                }
                                spannableStringBuilder3.setSpan(new ho4(aob.q6, null), y1, length + y1, 33);
                            }
                            charSequence = null;
                            spannableStringBuilder2 = spannableStringBuilder3;
                        } catch (Exception unused) {
                            charSequence = null;
                            spannableStringBuilder2 = K;
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    spannableStringBuilder2 = charSequence;
                    spannableStringBuilder = spannableStringBuilder4;
                }
                charSequence = null;
                SpannableStringBuilder spannableStringBuilder42 = spannableStringBuilder2;
                spannableStringBuilder2 = charSequence;
                spannableStringBuilder = spannableStringBuilder42;
            } else if (i == this.y) {
                bd5Var.r = true;
                bd5Var.f = "premium";
                bd5Var.a.setImageDrawable(bd5.b(bd5Var.getContext(), false));
                bd5Var.b.l(ob6.M0(2131746509, null), false);
                ema emaVar = bd5Var.c;
                int i3 = aob.y6;
                emaVar.setTag(Integer.valueOf(i3));
                if (bd5Var.L) {
                    i3 = aob.fh;
                }
                yob.W(emaVar, i3, bd5Var.N);
                emaVar.setEmojiColor(emaVar.getTextColor());
                emaVar.l(ob6.M0(2131746507, null), false);
                if (rc5Var.Y == null) {
                    z2 = false;
                }
                bd5Var.c(z2, false);
                return;
            } else if (i == this.E) {
                bd5Var.s = true;
                bd5Var.f = "miniapps";
                de0 de0Var = bd5Var.a;
                bd5Var.getContext();
                de0Var.setImageDrawable(bd5.a(false));
                bd5Var.b.l(ob6.M0(2131746535, null), false);
                ema emaVar2 = bd5Var.c;
                int i4 = aob.y6;
                emaVar2.setTag(Integer.valueOf(i4));
                if (bd5Var.L) {
                    i4 = aob.fh;
                }
                yob.W(emaVar2, i4, bd5Var.N);
                emaVar2.setEmojiColor(emaVar2.getTextColor());
                emaVar2.l(ob6.M0(2131746534, null), false);
                if (rc5Var.Z == null) {
                    z2 = false;
                }
                bd5Var.c(z2, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i - this.F);
                spannableStringBuilder = null;
            }
            bd5Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j = ((TLRPC.User) tLObject).id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j = -((TLRPC.Chat) tLObject).id;
            } else {
                j = 0;
            }
            if (j != 0) {
                zh6 zh6Var = rc5Var.K;
                if (zh6Var != null && zh6Var.h(j) >= 0) {
                    bd5Var.c(true, false);
                    bd5Var.setCheckBoxEnabled(false);
                    return;
                }
                if (rc5Var.a0.h(j) >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                bd5Var.c(z, false);
                bd5Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        p55 p55Var = (p55) view;
        if (this.n) {
            p55Var.setText(ob6.M0(2131749306, null));
        } else if (i == this.s) {
            p55Var.setText(ob6.M0(2131746497, null));
        } else {
            int i5 = i - this.F;
            if (i5 >= 0 && i5 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i - this.F);
                if (tLObject2 instanceof qc5) {
                    p55Var.setText(((qc5) tLObject2).a.toUpperCase());
                }
            }
        }
        if (i == this.w) {
            if (rc5Var.Y == null && rc5Var.a0.i()) {
                M0 = "";
            } else {
                M0 = ob6.M0(2131751422, null);
            }
            p55Var.a(M0, new sa5(this, (byte) 5));
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View p55Var;
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    p55Var = new skb(context);
                } else {
                    oc5 oc5Var = new oc5(context, null, 0, null, (byte) 0);
                    oc5Var.setLayoutParams(new r79(-1, -1));
                    oc5Var.e.setVisibility(8);
                    oc5Var.d.setText(ob6.M0(2131747954, null));
                    oc5Var.setAnimateLayoutChange(true);
                    p55Var = oc5Var;
                }
            } else {
                p55Var = new bd5(context, 1, 0, false);
            }
        } else {
            p55Var = new p55(context, null);
        }
        return new f89(p55Var);
    }
}
