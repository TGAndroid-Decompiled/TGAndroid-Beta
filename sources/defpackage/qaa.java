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
public final class qaa extends n39 {
    public int H;
    public paa I;
    public int K;
    public final taa L;
    public final Context c;
    public final oaa e;
    public naa f;
    public naa h;
    public String n;
    public int r;
    public int s;
    public int w;
    public ArrayList d = new ArrayList();
    public int x = -1;
    public int y = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public boolean J = false;

    public qaa(taa taaVar, Context context) {
        this.L = taaVar;
        this.c = context;
        ?? zr9Var = new zr9(false);
        this.e = zr9Var;
        zr9Var.a = new ln8(this, (byte) 14);
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 1 && i != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.n)) {
            return;
        }
        this.n = str;
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        naa naaVar = this.h;
        if (naaVar != null) {
            gl.r(naaVar);
            this.h = null;
        }
        this.d.clear();
        this.e.f(null, null);
        this.e.g(null, true, true, true, true, 0L, false, 0, 0);
        f();
        this.L.D0(true);
        if (TextUtils.isEmpty(str)) {
            this.L.H0();
            this.r = -1;
            this.J = false;
        } else {
            this.J = true;
            int i = this.r + 1;
            this.r = i;
            this.L.L1.e(true, true);
            co3 co3Var = Utilities.g;
            naa naaVar2 = new naa(this, str, i, (byte) 0);
            this.f = naaVar2;
            co3Var.d(naaVar2, 300L);
        }
        this.L.D0(false);
    }

    @Override
    public final int b() {
        this.H = 0;
        this.x = -1;
        this.y = -1;
        this.F = -1;
        this.G = -1;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        int i = this.H;
        if (isEmpty) {
            this.E = i;
            this.H = i + 2;
            this.x = i + 1;
            taa taaVar = this.L;
            if (taaVar.z2.size() > 0) {
                int i2 = this.H;
                int i3 = i2 + 1;
                this.H = i3;
                this.y = i2;
                this.F = i3;
                this.H = taaVar.z2.size() + i3;
            }
            int i4 = this.H;
            int i5 = i4 + 1;
            this.H = i5;
            this.G = i4;
            this.K = i5;
            return i5;
        }
        int i6 = i + 1;
        this.H = i6;
        this.E = i;
        int size = this.e.d.size() + this.d.size() + i6;
        this.H = size;
        if (size == 1) {
            this.E = -1;
            this.H = 0;
            this.K = 0;
            return 0;
        }
        int i7 = size + 1;
        this.H = i7;
        this.G = size;
        this.K = i7;
        return i7;
    }

    @Override
    public final int d(int i) {
        if (i == this.G) {
            return 4;
        }
        if (i == this.E) {
            return 1;
        }
        if (i == this.x) {
            return 2;
        }
        if (i == this.y) {
            return 3;
        }
        if (TextUtils.isEmpty(this.n)) {
            return 0;
        }
        return 5;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        long j;
        String str;
        String str2;
        long j2;
        int y1;
        boolean z;
        boolean z2;
        TLObject tLObject;
        String str3;
        TLRPC.TL_encryptedChat tL_encryptedChat;
        long j3;
        boolean z3;
        boolean z4;
        int y12;
        taa taaVar = this.L;
        vf6 vf6Var = taaVar.P1;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 0 && i2 != 5) {
            if (i2 == 2) {
                ((o39) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        TLObject tLObject2 = null;
        String m = null;
        oaa oaaVar = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (isEmpty) {
            int i3 = this.F;
            if (i3 >= 0 && i >= i3) {
                TLObject tLObject3 = ((al3) taaVar.z2.get(i - i3)).a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j3 = user.id;
                    m = qu2.m(0, user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j3 = -chat.id;
                    m = chat.title;
                } else {
                    if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                        tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject3;
                        TLRPC.User V1 = na7.q1(taaVar.a).V1(Long.valueOf(tL_encryptedChat2.user_id));
                        if (V1 != null) {
                            j3 = V1.id;
                            m = qu2.m(0, V1.first_name, V1.last_name);
                        }
                    }
                    j3 = 0;
                }
                String str4 = oaaVar.c;
                if (!TextUtils.isEmpty(str4) && m != null && (y12 = gl.y1(m.toString(), str4)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(m);
                    spannableStringBuilder.setSpan(new cm4(bkb.p6, taaVar.J0), y12, str4.length() + y12, 33);
                    tLObject = tLObject3;
                    str3 = spannableStringBuilder;
                } else {
                    tLObject = tLObject3;
                    str3 = m;
                }
                tL_encryptedChat = tL_encryptedChat2;
            } else {
                tLObject = null;
                str3 = null;
                tL_encryptedChat = null;
                j3 = 0;
            }
            if (view instanceof rr8) {
                rr8 rr8Var = (rr8) view;
                rr8Var.z(tLObject, tL_encryptedChat, str3, null, false, false);
                if (i < b() - 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                rr8Var.N = z4;
                return;
            }
            String str5 = str3;
            if (view instanceof waa) {
                waa waaVar = (waa) view;
                if (vf6Var.h(j3) >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                waaVar.c(j3, z3, str5);
                return;
            }
            return;
        }
        int i4 = i - 1;
        int size = this.d.size();
        ArrayList arrayList = this.d;
        if (i4 < size) {
            iaa iaaVar = (iaa) arrayList.get(i4);
            j2 = iaaVar.a.id;
            str2 = iaaVar.d;
        } else {
            i4 -= arrayList.size();
            tLObject2 = (TLObject) oaaVar.d.get(i4);
            if (tLObject2 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject2;
                j = user2.id;
                str = qu2.m(0, user2.first_name, user2.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject2;
                j = -chat2.id;
                str = chat2.title;
            }
            String str6 = oaaVar.c;
            if (!TextUtils.isEmpty(str6) && str != null && (y1 = gl.y1(str.toString(), str6)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                spannableStringBuilder2.setSpan(new cm4(bkb.p6, taaVar.J0), y1, str6.length() + y1, 33);
                str2 = spannableStringBuilder2;
            } else {
                str2 = str;
            }
            j2 = j;
        }
        TLObject tLObject4 = tLObject2;
        if (view instanceof rr8) {
            rr8 rr8Var2 = (rr8) view;
            rr8Var2.z(tLObject4, null, str2, null, false, false);
            if (i4 < b() - 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            rr8Var2.N = z2;
            return;
        }
        String str7 = str2;
        if (view instanceof waa) {
            waa waaVar2 = (waa) view;
            if (vf6Var.h(j2) >= 0) {
                z = true;
            } else {
                z = false;
            }
            waaVar2.c(j2, z, str7);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        l35 l35Var;
        rkb rkbVar;
        float f;
        taa taaVar = this.L;
        Context context = this.c;
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            View view = new View(context);
                            if (taaVar.c2 && taaVar.j2[1] != null) {
                                f = 109.0f;
                            } else {
                                f = 56.0f;
                            }
                            view.setLayoutParams(new e49(-1, gl.L(f)));
                            l35Var = view;
                        } else {
                            View waaVar = new waa(0, taaVar.J0, context);
                            waaVar.setLayoutParams(new e49(-1, gl.L(100.0f)));
                            l35Var = waaVar;
                        }
                    } else {
                        rkbVar = new si9((byte) 4, context, this);
                    }
                } else {
                    l35 l35Var2 = new l35(context, taaVar.J0);
                    l35Var2.setTextColor(bkb.e7);
                    zkb.h(bkb.d7, taaVar.J0, l35Var2);
                    l35Var2.setText(k96.M0(2131746177, null));
                    l35Var = l35Var2;
                }
            } else {
                rkb rkbVar2 = new rkb(context, taaVar.J0, (byte) 11);
                rkbVar2.setItemAnimator(null);
                rkbVar2.setLayoutAnimation(null);
                zr zrVar = new zr((byte) 17);
                zrVar.i1(0);
                rkbVar2.setLayoutManager(zrVar);
                paa paaVar = new paa(this, context, taaVar.a, taaVar.J0);
                this.I = paaVar;
                rkbVar2.setAdapter(paaVar);
                rkbVar2.setOnItemClickListener(new f09(this, (byte) 8));
                rkbVar = rkbVar2;
            }
            l35Var = rkbVar;
        } else {
            rr8 rr8Var = new rr8(context, taaVar.J0);
            rr8Var.F0 = true;
            rr8Var.m0 = true;
            l35Var = rr8Var;
        }
        return new s49(l35Var);
    }
}
