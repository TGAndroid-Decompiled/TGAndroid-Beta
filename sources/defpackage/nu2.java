package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public abstract class nu2 extends y69 {
    public ArrayList E;
    public final boolean F;
    public byte G;
    public final boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public float N;
    public final Context s;
    public final int w;
    public final boolean x;
    public final zh6 y;
    public final int r = yac.t0;
    public float M = 1.0f;
    public final ArrayList O = new ArrayList();

    public nu2(Context context, int i, boolean z, zh6 zh6Var, int i2) {
        boolean z2;
        this.s = context;
        this.w = i;
        this.x = z;
        this.y = zh6Var;
        if (i2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.F = z2;
        this.H = i2 == 2;
    }

    @Override
    public final String F(int i) {
        ArrayList arrayList;
        if (this.G != 2 && !this.J) {
            int i2 = this.w;
            int i3 = this.r;
            if (i2 == 2) {
                arrayList = lv2.r(i3).k0;
            } else {
                arrayList = lv2.r(i3).i0;
            }
            int S = S(i);
            if (S == -1) {
                S = arrayList.size() - 1;
            }
            if (i2 != 0 && !this.F) {
                if (S >= 0 && S < arrayList.size()) {
                    return (String) arrayList.get(S);
                }
                return null;
            } else if (S > 0 && S <= arrayList.size()) {
                return (String) arrayList.get(S - 1);
            } else {
                return null;
            }
        }
        return null;
    }

    @Override
    public final void G(d79 d79Var, float f, int[] iArr) {
        iArr[0] = (int) (b() * f);
        iArr[1] = 0;
    }

    @Override
    public final int M(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu2.M(int):int");
    }

    @Override
    public final int N(int i, int i2) {
        return Objects.hash(Integer.valueOf(i * (-49612)), O(i, i2));
    }

    @Override
    public final Object O(int i, int i2) {
        HashMap hashMap;
        ArrayList arrayList;
        int i3;
        boolean z = this.L;
        int i4 = this.r;
        if (z && i == 1 && i2 > 1 && i2 - 2 < lv2.r(i4).b0.size()) {
            return lv2.r(i4).b0.get(i3);
        }
        if (P(i, i2) == 2) {
            return "Header";
        }
        int i5 = this.w;
        lv2 r = lv2.r(i4);
        if (i5 == 2) {
            hashMap = r.j0;
            arrayList = lv2.r(i4).k0;
        } else {
            hashMap = r.h0;
            arrayList = lv2.r(i4).i0;
        }
        if (i5 != 0 && !this.F) {
            if (i < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i));
                if (i2 < arrayList2.size()) {
                    return uc7.s1(i4).X1(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i2)).user_id));
                }
                return null;
            }
            return null;
        } else if (i != 0) {
            if (this.G == 2) {
                if (i == 1) {
                    if (i2 < this.E.size()) {
                        return uc7.s1(i4).X1(Long.valueOf(((TLRPC.TL_contact) this.E.get(i2)).user_id));
                    }
                    return null;
                }
            } else {
                int i6 = i - 1;
                if (i6 < arrayList.size()) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get(arrayList.get(i6));
                    if (i2 < arrayList3.size()) {
                        return uc7.s1(i4).X1(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i2)).user_id));
                    }
                    return null;
                }
            }
            if (this.x && i2 >= 0 && i2 < lv2.r(i4).b0.size()) {
                return lv2.r(i4).b0.get(i2);
            }
            return null;
        } else {
            return null;
        }
    }

    @Override
    public final int P(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu2.P(int, int):int");
    }

    @Override
    public final View T(int i, View view) {
        ArrayList arrayList;
        int i2 = this.w;
        int i3 = this.r;
        lv2.r(i3);
        lv2 r = lv2.r(i3);
        if (i2 == 2) {
            arrayList = r.k0;
        } else {
            arrayList = r.i0;
        }
        View view2 = view;
        if (view == null) {
            ?? frameLayout = new FrameLayout(this.s);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(hl.L(76.0f), hl.L(64.0f)));
            TextView textView = new TextView(frameLayout.getContext());
            frameLayout.a = textView;
            bs2.t(textView, 1, 22.0f);
            yob.X(textView, aob.B6, null);
            textView.setGravity(17);
            frameLayout.addView(textView, tre.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            this.O.add(frameLayout);
            view2 = frameLayout;
        }
        t26 t26Var = (t26) view2;
        float f = this.N;
        if (f > 0.0f) {
            t26Var.setLetterTextSize(f);
        }
        t26Var.setLetterProgress(this.M);
        if (this.G != 2 && !this.I && !this.J) {
            if (i2 != 0 && !this.F) {
                if (i < arrayList.size()) {
                    t26Var.setLetter((String) arrayList.get(i));
                    return view2;
                }
                t26Var.setLetter("");
                return view2;
            } else if (i == 0) {
                t26Var.setLetter("");
                return view2;
            } else {
                int i4 = i - 1;
                if (i4 < arrayList.size()) {
                    t26Var.setLetter((String) arrayList.get(i4));
                    return view2;
                }
                t26Var.setLetter("");
                return view2;
            }
        }
        t26Var.setLetter("");
        return view2;
    }

    @Override
    public final boolean V(int i, int i2, f89 f89Var) {
        HashMap hashMap;
        ArrayList arrayList;
        if (this.L) {
            if (i != 1 || i2 <= 1) {
                return false;
            }
        } else {
            int i3 = this.r;
            int i4 = this.w;
            lv2 r = lv2.r(i3);
            if (i4 == 2) {
                hashMap = r.j0;
                arrayList = lv2.r(i3).k0;
            } else {
                hashMap = r.h0;
                arrayList = lv2.r(i3).i0;
            }
            boolean z = this.F;
            if (i4 != 0 && !z) {
                if (this.J || i2 >= ((ArrayList) hashMap.get(arrayList.get(i))).size()) {
                    return false;
                }
            } else if (i == 0) {
                if (z) {
                    if (i2 >= 1) {
                        return false;
                    }
                } else if (this.x) {
                    if (i2 >= 2) {
                        return false;
                    }
                } else if (i2 >= 3) {
                    return false;
                }
            } else if (!this.J) {
                if (this.G == 2) {
                    if (i == 1 && i2 >= this.E.size()) {
                        return false;
                    }
                } else {
                    int i5 = i - 1;
                    if (i5 < arrayList.size() && i2 >= ((ArrayList) hashMap.get(arrayList.get(i5))).size()) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void W(int i, int i2, f89 f89Var) {
        HashMap hashMap;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        float f;
        int i4 = f89Var.f;
        View view = f89Var.a;
        int i5 = 7;
        boolean z = this.F;
        int i6 = this.r;
        boolean z2 = true;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        if (i4 != 7) {
                            if (i4 == 8) {
                                mt5 mt5Var = (mt5) view;
                                int i7 = i2 - 2;
                                if (i7 >= 0 && i7 < lv2.r(i6).b0.size()) {
                                    mt5Var.a((iv2) lv2.r(i6).b0.get(i7), null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        mf5 mf5Var = (mf5) view;
                        if (this.L && i2 == 1 && i == 1) {
                            mf5Var.setText(ob6.M0(2131748905, null));
                            return;
                        } else if (this.G == 1) {
                            mf5Var.setText(ob6.M0(2131745012, null));
                            return;
                        } else {
                            mf5Var.setText(ob6.M0(2131745013, null));
                            return;
                        }
                    }
                    if (!this.K) {
                        f = 96.0f;
                    } else {
                        f = 25.0f;
                    }
                    view.setPadding(0, hl.L(f), 0, hl.L(18.0f));
                    return;
                }
                p55 p55Var = (p55) view;
                byte b = this.G;
                if (b == 0) {
                    p55Var.setText(ob6.M0(2131751745, null));
                    return;
                } else if (b == 1) {
                    p55Var.setText(ob6.M0(2131745012, null));
                    return;
                } else {
                    p55Var.setText(ob6.M0(2131745013, null));
                    return;
                }
            }
            skb skbVar = (skb) view;
            boolean z3 = this.x;
            if (!z3 && z) {
                int i8 = aob.Zl;
                skbVar.g(i8, i8);
            } else {
                int i9 = aob.G6;
                skbVar.g(i9, i9);
            }
            if (i == 0) {
                if (z3) {
                    if (i2 == 0) {
                        skbVar.r(ob6.M0(2131748905, null), "", false, 2131232727, -14899731, -15431455, false);
                        return;
                    } else if (i2 == 1) {
                        skbVar.r(ob6.M0(2131746096, null), "", false, 2131232716, -11154873, -14175180, false);
                        return;
                    } else {
                        return;
                    }
                } else if (z) {
                    if (this.H) {
                        skbVar.o(2131232209, ob6.M0(2131752374, null), false);
                        return;
                    } else {
                        skbVar.o(2131232209, ob6.M0(2131748864, null), false);
                        return;
                    }
                } else if (i2 == 0) {
                    skbVar.r(ob6.M0(2131748027, null), "", false, 2131232726, -14899731, -15431455, false);
                    return;
                } else if (i2 == 1) {
                    skbVar.r(ob6.M0(2131748040, null), "", false, 2131232717, -11154873, -14175180, false);
                    return;
                } else {
                    return;
                }
            }
            iv2 iv2Var = (iv2) lv2.r(i6).b0.get(i2);
            String str = iv2Var.i;
            if (str != null) {
                String str2 = iv2Var.j;
                if (str2 != null) {
                    skbVar.k(iv2Var.i + " " + iv2Var.j, false);
                    return;
                } else if (str2 == null) {
                    skbVar.k(str, false);
                    return;
                }
            }
            skbVar.k(iv2Var.j, false);
            return;
        }
        vac vacVar = (vac) view;
        vacVar.U.a = false;
        if (this.G != 2 && !this.I) {
            i5 = 58;
        }
        vacVar.b(i5, 1);
        if (this.G == 2) {
            arrayList2 = this.E;
        } else {
            int i10 = this.w;
            lv2 r = lv2.r(i6);
            if (i10 == 2) {
                hashMap = r.j0;
                arrayList = lv2.r(i6).k0;
            } else {
                hashMap = r.h0;
                arrayList = lv2.r(i6).i0;
            }
            if (i10 != 0 && !z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            arrayList2 = (ArrayList) hashMap.get(arrayList.get(i - i3));
        }
        TLRPC.User X1 = uc7.s1(i6).X1(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i2)).user_id));
        vacVar.d(X1, null, null, false);
        if (this.y.h(X1.id) < 0) {
            z2 = false;
        }
        vacVar.c(z2, false);
    }

    public final void Y(int i, boolean z) {
        this.G = i;
        if (i == 2) {
            if (this.E == null || z) {
                int i2 = this.r;
                this.E = new ArrayList(lv2.r(i2).f0);
                long j = yac.h(i2).n;
                int size = this.E.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (((TLRPC.TL_contact) this.E.get(i3)).user_id == j) {
                        this.E.remove(i3);
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            Z();
            return;
        }
        f();
    }

    public final void Z() {
        int i = this.r;
        if (this.E == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
            Collections.sort(this.E, new mu2(uc7.s1(i), currentTime, (byte) 0));
            f();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        float f;
        Context context = this.s;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 7) {
                                if (i != 8) {
                                    if (i != 9) {
                                        view = new rca(context, (uh9) null);
                                    } else {
                                        View t62Var = new t62(context, (byte) 5);
                                        t62Var.setId(9);
                                        t62Var.setTag(-33024);
                                        view = t62Var;
                                    }
                                } else {
                                    view = new mt5(context, false);
                                }
                            } else {
                                view = new mf5(this.s, aob.L6, 21, 14, 5, false, false, null);
                            }
                        } else {
                            FrameLayout ttVar = new tt(this, context, viewGroup, (byte) 10);
                            ttVar.addView(new mv2(context), tre.e(-1, -2, 17));
                            ttVar.setLayoutParams(new r79(-1, -2));
                            ttVar.setTag(-33024);
                            view = ttVar;
                        }
                    } else {
                        View hp3Var = new hp3(context, null);
                        float f2 = 72.0f;
                        if (ob6.a0) {
                            f = 28.0f;
                        } else {
                            f = 72.0f;
                        }
                        int L = hl.L(f);
                        int L2 = hl.L(8.0f);
                        if (!ob6.a0) {
                            f2 = 28.0f;
                        }
                        hp3Var.setPadding(L, L2, hl.L(f2), hl.L(8.0f));
                        view = hp3Var;
                    }
                } else {
                    view = new p55(context, null);
                }
            } else {
                view = new skb(context);
            }
        } else {
            vac vacVar = new vac(context, 58, 1, false);
            vacVar.setCallCellStyle(58);
            view = vacVar;
        }
        return new f89(view);
    }
}
