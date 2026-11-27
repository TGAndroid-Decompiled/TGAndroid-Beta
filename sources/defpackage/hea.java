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
public final class hea extends c79 {
    public int H;
    public gea I;
    public int K;
    public final kea L;
    public final Context c;
    public final fea e;
    public eea f;
    public eea h;
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

    public hea(kea keaVar, Context context) {
        this.L = keaVar;
        this.c = context;
        ?? sv9Var = new sv9(false);
        this.e = sv9Var;
        sv9Var.a = new i09(this, (byte) 12);
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
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
        eea eeaVar = this.h;
        if (eeaVar != null) {
            hl.r(eeaVar);
            this.h = null;
        }
        this.d.clear();
        this.e.f(null, null);
        this.e.g(null, true, true, true, true, 0L, false, 0, 0);
        f();
        this.L.E0(true);
        if (TextUtils.isEmpty(str)) {
            this.L.I0();
            this.r = -1;
            this.J = false;
        } else {
            this.J = true;
            int i = this.r + 1;
            this.r = i;
            this.L.L1.e(true, true);
            to3 to3Var = Utilities.g;
            eea eeaVar2 = new eea(this, str, i, (byte) 0);
            this.f = eeaVar2;
            to3Var.d(eeaVar2, 300L);
        }
        this.L.E0(false);
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
            kea keaVar = this.L;
            if (keaVar.z2.size() > 0) {
                int i2 = this.H;
                int i3 = i2 + 1;
                this.H = i3;
                this.y = i2;
                this.F = i3;
                this.H = keaVar.z2.size() + i3;
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
    public final void t(f89 f89Var, int i) {
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
        kea keaVar = this.L;
        zh6 zh6Var = keaVar.P1;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 0 && i2 != 5) {
            if (i2 == 2) {
                ((d79) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        TLObject tLObject2 = null;
        String m = null;
        fea feaVar = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (isEmpty) {
            int i3 = this.F;
            if (i3 >= 0 && i >= i3) {
                TLObject tLObject3 = ((sl3) keaVar.z2.get(i - i3)).a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j3 = user.id;
                    m = lv2.m(0, user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j3 = -chat.id;
                    m = chat.title;
                } else {
                    if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                        tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject3;
                        TLRPC.User X1 = uc7.s1(keaVar.a).X1(Long.valueOf(tL_encryptedChat2.user_id));
                        if (X1 != null) {
                            j3 = X1.id;
                            m = lv2.m(0, X1.first_name, X1.last_name);
                        }
                    }
                    j3 = 0;
                }
                String str4 = feaVar.c;
                if (!TextUtils.isEmpty(str4) && m != null && (y12 = hl.y1(m.toString(), str4)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(m);
                    spannableStringBuilder.setSpan(new ho4(aob.q6, keaVar.J0), y12, str4.length() + y12, 33);
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
            if (view instanceof bv8) {
                bv8 bv8Var = (bv8) view;
                bv8Var.C(tLObject, tL_encryptedChat, str3, null, false, false);
                if (i < b() - 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                bv8Var.N = z4;
                return;
            }
            String str5 = str3;
            if (view instanceof nea) {
                nea neaVar = (nea) view;
                if (zh6Var.h(j3) >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                neaVar.c(j3, z3, str5);
                return;
            }
            return;
        }
        int i4 = i - 1;
        int size = this.d.size();
        ArrayList arrayList = this.d;
        if (i4 < size) {
            zda zdaVar = (zda) arrayList.get(i4);
            j2 = zdaVar.a.id;
            str2 = zdaVar.d;
        } else {
            i4 -= arrayList.size();
            tLObject2 = (TLObject) feaVar.d.get(i4);
            if (tLObject2 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject2;
                j = user2.id;
                str = lv2.m(0, user2.first_name, user2.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject2;
                j = -chat2.id;
                str = chat2.title;
            }
            String str6 = feaVar.c;
            if (!TextUtils.isEmpty(str6) && str != null && (y1 = hl.y1(str.toString(), str6)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                spannableStringBuilder2.setSpan(new ho4(aob.q6, keaVar.J0), y1, str6.length() + y1, 33);
                str2 = spannableStringBuilder2;
            } else {
                str2 = str;
            }
            j2 = j;
        }
        TLObject tLObject4 = tLObject2;
        if (view instanceof bv8) {
            bv8 bv8Var2 = (bv8) view;
            bv8Var2.C(tLObject4, null, str2, null, false, false);
            if (i4 < b() - 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            bv8Var2.N = z2;
            return;
        }
        String str7 = str2;
        if (view instanceof nea) {
            nea neaVar2 = (nea) view;
            if (zh6Var.h(j2) >= 0) {
                z = true;
            } else {
                z = false;
            }
            neaVar2.c(j2, z, str7);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        p55 p55Var;
        float f;
        kea keaVar = this.L;
        Context context = this.c;
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            View view = new View(context);
                            if (keaVar.c2 && keaVar.j2[1] != null) {
                                f = 109.0f;
                            } else {
                                f = 56.0f;
                            }
                            view.setLayoutParams(new r79(-1, hl.L(f)));
                            p55Var = view;
                        } else {
                            View neaVar = new nea(0, keaVar.J0, context);
                            neaVar.setLayoutParams(new r79(-1, hl.L(100.0f)));
                            p55Var = neaVar;
                        }
                    } else {
                        p55Var = new nf9((byte) 5, context, this);
                    }
                } else {
                    p55 p55Var2 = new p55(context, keaVar.J0);
                    p55Var2.setTextColor(aob.f7);
                    yob.h(aob.e7, keaVar.J0, p55Var2);
                    p55Var2.setText(ob6.M0(2131746097, null));
                    p55Var = p55Var2;
                }
            } else {
                qob qobVar = new qob(context, keaVar.J0, (byte) 11);
                qobVar.setItemAnimator(null);
                qobVar.setLayoutAnimation(null);
                as asVar = new as((byte) 17);
                asVar.i1(0);
                qobVar.setLayoutManager(asVar);
                gea geaVar = new gea(this, context, keaVar.a, keaVar.J0);
                this.I = geaVar;
                qobVar.setAdapter(geaVar);
                qobVar.setOnItemClickListener(new t39(this, (byte) 8));
                p55Var = qobVar;
            }
        } else {
            bv8 bv8Var = new bv8(context, keaVar.J0);
            bv8Var.G0 = true;
            bv8Var.n0 = true;
            p55Var = bv8Var;
        }
        return new f89(p55Var);
    }
}
