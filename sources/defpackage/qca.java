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
public final class qca extends q59 {
    public int H;
    public pca I;
    public int K;
    public final tca L;
    public final Context c;
    public final oca e;
    public nca f;
    public nca h;
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

    public qca(tca tcaVar, Context context) {
        this.L = tcaVar;
        this.c = context;
        ?? bu9Var = new bu9(false);
        this.e = bu9Var;
        bu9Var.a = new cf9(this, (byte) 7);
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
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
        nca ncaVar = this.h;
        if (ncaVar != null) {
            gm.r(ncaVar);
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
            mp3 mp3Var = Utilities.g;
            nca ncaVar2 = new nca(this, str, i, (byte) 0);
            this.f = ncaVar2;
            mp3Var.d(ncaVar2, 300L);
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
            tca tcaVar = this.L;
            if (tcaVar.z2.size() > 0) {
                int i2 = this.H;
                int i3 = i2 + 1;
                this.H = i3;
                this.y = i2;
                this.F = i3;
                this.H = tcaVar.z2.size() + i3;
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
    public final void t(u69 u69Var, int i) {
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
        tca tcaVar = this.L;
        vh6 vh6Var = tcaVar.P1;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 0 && i2 != 5) {
            if (i2 == 2) {
                ((r59) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        TLObject tLObject2 = null;
        String m = null;
        oca ocaVar = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (isEmpty) {
            int i3 = this.F;
            if (i3 >= 0 && i >= i3) {
                TLObject tLObject3 = ((lm3) tcaVar.z2.get(i - i3)).a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j3 = user.id;
                    m = bw2.m(0, user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j3 = -chat.id;
                    m = chat.title;
                } else {
                    if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                        tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject3;
                        TLRPC.User W1 = oc7.r1(tcaVar.a).W1(Long.valueOf(tL_encryptedChat2.user_id));
                        if (W1 != null) {
                            j3 = W1.id;
                            m = bw2.m(0, W1.first_name, W1.last_name);
                        }
                    }
                    j3 = 0;
                }
                String str4 = ocaVar.c;
                if (!TextUtils.isEmpty(str4) && m != null && (y12 = gm.y1(m.toString(), str4)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(m);
                    spannableStringBuilder.setSpan(new do4(cmb.p6, tcaVar.J0), y12, str4.length() + y12, 33);
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
            if (view instanceof ut8) {
                ut8 ut8Var = (ut8) view;
                ut8Var.x(tLObject, tL_encryptedChat, str3, null, false, false);
                if (i < b() - 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ut8Var.N = z4;
                return;
            }
            String str5 = str3;
            if (view instanceof wca) {
                wca wcaVar = (wca) view;
                if (vh6Var.h(j3) >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                wcaVar.c(j3, z3, str5);
                return;
            }
            return;
        }
        int i4 = i - 1;
        int size = this.d.size();
        ArrayList arrayList = this.d;
        if (i4 < size) {
            ica icaVar = (ica) arrayList.get(i4);
            j2 = icaVar.a.id;
            str2 = icaVar.d;
        } else {
            i4 -= arrayList.size();
            tLObject2 = (TLObject) ocaVar.d.get(i4);
            if (tLObject2 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject2;
                j = user2.id;
                str = bw2.m(0, user2.first_name, user2.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject2;
                j = -chat2.id;
                str = chat2.title;
            }
            String str6 = ocaVar.c;
            if (!TextUtils.isEmpty(str6) && str != null && (y1 = gm.y1(str.toString(), str6)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                spannableStringBuilder2.setSpan(new do4(cmb.p6, tcaVar.J0), y1, str6.length() + y1, 33);
                str2 = spannableStringBuilder2;
            } else {
                str2 = str;
            }
            j2 = j;
        }
        TLObject tLObject4 = tLObject2;
        if (view instanceof ut8) {
            ut8 ut8Var2 = (ut8) view;
            ut8Var2.x(tLObject4, null, str2, null, false, false);
            if (i4 < b() - 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            ut8Var2.N = z2;
            return;
        }
        String str7 = str2;
        if (view instanceof wca) {
            wca wcaVar2 = (wca) view;
            if (vh6Var.h(j2) >= 0) {
                z = true;
            } else {
                z = false;
            }
            wcaVar2.c(j2, z, str7);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        l55 l55Var;
        float f;
        tca tcaVar = this.L;
        Context context = this.c;
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            View view = new View(context);
                            if (tcaVar.c2 && tcaVar.j2[1] != null) {
                                f = 109.0f;
                            } else {
                                f = 56.0f;
                            }
                            view.setLayoutParams(new g69(-1, gm.L(f)));
                            l55Var = view;
                        } else {
                            View wcaVar = new wca(0, tcaVar.J0, context);
                            wcaVar.setLayoutParams(new g69(-1, gm.L(100.0f)));
                            l55Var = wcaVar;
                        }
                    } else {
                        l55Var = new xd9((byte) 5, context, this);
                    }
                } else {
                    l55 l55Var2 = new l55(context, tcaVar.J0);
                    l55Var2.setTextColor(cmb.e7);
                    anb.h(cmb.d7, tcaVar.J0, l55Var2);
                    l55Var2.setText(jb6.M0(2131746103, null));
                    l55Var = l55Var2;
                }
            } else {
                smb smbVar = new smb(context, tcaVar.J0, (byte) 11);
                smbVar.setItemAnimator(null);
                smbVar.setLayoutAnimation(null);
                zs zsVar = new zs((byte) 17);
                zsVar.i1(0);
                smbVar.setLayoutManager(zsVar);
                pca pcaVar = new pca(this, context, tcaVar.a, tcaVar.J0);
                this.I = pcaVar;
                smbVar.setAdapter(pcaVar);
                smbVar.setOnItemClickListener(new s19(this, (byte) 9));
                l55Var = smbVar;
            }
        } else {
            ut8 ut8Var = new ut8(context, tcaVar.J0);
            ut8Var.F0 = true;
            ut8Var.m0 = true;
            l55Var = ut8Var;
        }
        return new u69(l55Var);
    }
}
