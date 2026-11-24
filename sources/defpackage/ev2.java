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
public abstract class ev2 extends m59 {
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
    public final vh6 y;
    public final int r = z8c.t0;
    public float M = 1.0f;
    public final ArrayList O = new ArrayList();

    public ev2(Context context, int i, boolean z, vh6 vh6Var, int i2) {
        boolean z2;
        this.s = context;
        this.w = i;
        this.x = z;
        this.y = vh6Var;
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
                arrayList = bw2.r(i3).k0;
            } else {
                arrayList = bw2.r(i3).i0;
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
    public final void G(r59 r59Var, float f, int[] iArr) {
        iArr[0] = (int) (b() * f);
        iArr[1] = 0;
    }

    @Override
    public final int M(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev2.M(int):int");
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
        if (z && i == 1 && i2 > 1 && i2 - 2 < bw2.r(i4).b0.size()) {
            return bw2.r(i4).b0.get(i3);
        }
        if (P(i, i2) == 2) {
            return "Header";
        }
        int i5 = this.w;
        bw2 r = bw2.r(i4);
        if (i5 == 2) {
            hashMap = r.j0;
            arrayList = bw2.r(i4).k0;
        } else {
            hashMap = r.h0;
            arrayList = bw2.r(i4).i0;
        }
        if (i5 != 0 && !this.F) {
            if (i < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i));
                if (i2 < arrayList2.size()) {
                    return oc7.r1(i4).W1(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i2)).user_id));
                }
                return null;
            }
            return null;
        } else if (i != 0) {
            if (this.G == 2) {
                if (i == 1) {
                    if (i2 < this.E.size()) {
                        return oc7.r1(i4).W1(Long.valueOf(((TLRPC.TL_contact) this.E.get(i2)).user_id));
                    }
                    return null;
                }
            } else {
                int i6 = i - 1;
                if (i6 < arrayList.size()) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get(arrayList.get(i6));
                    if (i2 < arrayList3.size()) {
                        return oc7.r1(i4).W1(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i2)).user_id));
                    }
                    return null;
                }
            }
            if (this.x && i2 >= 0 && i2 < bw2.r(i4).b0.size()) {
                return bw2.r(i4).b0.get(i2);
            }
            return null;
        } else {
            return null;
        }
    }

    @Override
    public final int P(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev2.P(int, int):int");
    }

    @Override
    public final View T(int i, View view) {
        ArrayList arrayList;
        int i2 = this.w;
        int i3 = this.r;
        bw2.r(i3);
        bw2 r = bw2.r(i3);
        if (i2 == 2) {
            arrayList = r.k0;
        } else {
            arrayList = r.i0;
        }
        View view2 = view;
        if (view == null) {
            ?? frameLayout = new FrameLayout(this.s);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(gm.L(76.0f), gm.L(64.0f)));
            TextView textView = new TextView(frameLayout.getContext());
            frameLayout.a = textView;
            ts2.s(textView, 1, 22.0f);
            anb.X(textView, cmb.A6, null);
            textView.setGravity(17);
            frameLayout.addView(textView, qoe.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            this.O.add(frameLayout);
            view2 = frameLayout;
        }
        p26 p26Var = (p26) view2;
        float f = this.N;
        if (f > 0.0f) {
            p26Var.setLetterTextSize(f);
        }
        p26Var.setLetterProgress(this.M);
        if (this.G != 2 && !this.I && !this.J) {
            if (i2 != 0 && !this.F) {
                if (i < arrayList.size()) {
                    p26Var.setLetter((String) arrayList.get(i));
                    return view2;
                }
                p26Var.setLetter("");
                return view2;
            } else if (i == 0) {
                p26Var.setLetter("");
                return view2;
            } else {
                int i4 = i - 1;
                if (i4 < arrayList.size()) {
                    p26Var.setLetter((String) arrayList.get(i4));
                    return view2;
                }
                p26Var.setLetter("");
                return view2;
            }
        }
        p26Var.setLetter("");
        return view2;
    }

    @Override
    public final boolean V(int i, int i2, u69 u69Var) {
        HashMap hashMap;
        ArrayList arrayList;
        if (this.L) {
            if (i != 1 || i2 <= 1) {
                return false;
            }
        } else {
            int i3 = this.r;
            int i4 = this.w;
            bw2 r = bw2.r(i3);
            if (i4 == 2) {
                hashMap = r.j0;
                arrayList = bw2.r(i3).k0;
            } else {
                hashMap = r.h0;
                arrayList = bw2.r(i3).i0;
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
    public final void W(int i, int i2, u69 u69Var) {
        HashMap hashMap;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        float f;
        int i4 = u69Var.f;
        View view = u69Var.a;
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
                                jt5 jt5Var = (jt5) view;
                                int i7 = i2 - 2;
                                if (i7 >= 0 && i7 < bw2.r(i6).b0.size()) {
                                    jt5Var.a((yv2) bw2.r(i6).b0.get(i7), null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        jf5 jf5Var = (jf5) view;
                        if (this.L && i2 == 1 && i == 1) {
                            jf5Var.setText(jb6.M0(2131748908, null));
                            return;
                        } else if (this.G == 1) {
                            jf5Var.setText(jb6.M0(2131745018, null));
                            return;
                        } else {
                            jf5Var.setText(jb6.M0(2131745019, null));
                            return;
                        }
                    }
                    if (!this.K) {
                        f = 96.0f;
                    } else {
                        f = 25.0f;
                    }
                    view.setPadding(0, gm.L(f), 0, gm.L(18.0f));
                    return;
                }
                l55 l55Var = (l55) view;
                byte b = this.G;
                if (b == 0) {
                    l55Var.setText(jb6.M0(2131751717, null));
                    return;
                } else if (b == 1) {
                    l55Var.setText(jb6.M0(2131745018, null));
                    return;
                } else {
                    l55Var.setText(jb6.M0(2131745019, null));
                    return;
                }
            }
            xib xibVar = (xib) view;
            boolean z3 = this.x;
            if (!z3 && z) {
                int i8 = cmb.Yl;
                xibVar.g(i8, i8);
            } else {
                int i9 = cmb.F6;
                xibVar.g(i9, i9);
            }
            if (i == 0) {
                if (z3) {
                    if (i2 == 0) {
                        xibVar.r(jb6.M0(2131748908, null), "", false, 2131232728, -14899731, -15431455, false);
                        return;
                    } else if (i2 == 1) {
                        xibVar.r(jb6.M0(2131746102, null), "", false, 2131232717, -11154873, -14175180, false);
                        return;
                    } else {
                        return;
                    }
                } else if (z) {
                    if (this.H) {
                        xibVar.o(2131232210, jb6.M0(2131752346, null), false);
                        return;
                    } else {
                        xibVar.o(2131232210, jb6.M0(2131748867, null), false);
                        return;
                    }
                } else if (i2 == 0) {
                    xibVar.r(jb6.M0(2131748030, null), "", false, 2131232727, -14899731, -15431455, false);
                    return;
                } else if (i2 == 1) {
                    xibVar.r(jb6.M0(2131748043, null), "", false, 2131232718, -11154873, -14175180, false);
                    return;
                } else {
                    return;
                }
            }
            yv2 yv2Var = (yv2) bw2.r(i6).b0.get(i2);
            String str = yv2Var.i;
            if (str != null) {
                String str2 = yv2Var.j;
                if (str2 != null) {
                    xibVar.k(yv2Var.i + " " + yv2Var.j, false);
                    return;
                } else if (str2 == null) {
                    xibVar.k(str, false);
                    return;
                }
            }
            xibVar.k(yv2Var.j, false);
            return;
        }
        w8c w8cVar = (w8c) view;
        w8cVar.U.a = false;
        if (this.G != 2 && !this.I) {
            i5 = 58;
        }
        w8cVar.b(i5, 1);
        if (this.G == 2) {
            arrayList2 = this.E;
        } else {
            int i10 = this.w;
            bw2 r = bw2.r(i6);
            if (i10 == 2) {
                hashMap = r.j0;
                arrayList = bw2.r(i6).k0;
            } else {
                hashMap = r.h0;
                arrayList = bw2.r(i6).i0;
            }
            if (i10 != 0 && !z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            arrayList2 = (ArrayList) hashMap.get(arrayList.get(i - i3));
        }
        TLRPC.User W1 = oc7.r1(i6).W1(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i2)).user_id));
        w8cVar.d(W1, null, null, false);
        if (this.y.h(W1.id) < 0) {
            z2 = false;
        }
        w8cVar.c(z2, false);
    }

    public final void Y(int i, boolean z) {
        this.G = i;
        if (i == 2) {
            if (this.E == null || z) {
                int i2 = this.r;
                this.E = new ArrayList(bw2.r(i2).f0);
                long j = z8c.h(i2).n;
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
            Collections.sort(this.E, new dv2(oc7.r1(i), currentTime, (byte) 0));
            f();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
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
                                        view = new bba(context, (hg9) null);
                                    } else {
                                        View o72Var = new o72(context, (byte) 5);
                                        o72Var.setId(9);
                                        o72Var.setTag(-33024);
                                        view = o72Var;
                                    }
                                } else {
                                    view = new jt5(context, false);
                                }
                            } else {
                                view = new jf5(this.s, cmb.K6, 21, 14, 5, false, false, null);
                            }
                        } else {
                            FrameLayout suVar = new su(this, context, viewGroup, (byte) 10);
                            suVar.addView(new cw2(context), qoe.e(-1, -2, 17));
                            suVar.setLayoutParams(new g69(-1, -2));
                            suVar.setTag(-33024);
                            view = suVar;
                        }
                    } else {
                        View aq3Var = new aq3(context, null);
                        float f2 = 72.0f;
                        if (jb6.a0) {
                            f = 28.0f;
                        } else {
                            f = 72.0f;
                        }
                        int L = gm.L(f);
                        int L2 = gm.L(8.0f);
                        if (!jb6.a0) {
                            f2 = 28.0f;
                        }
                        aq3Var.setPadding(L, L2, gm.L(f2), gm.L(8.0f));
                        view = aq3Var;
                    }
                } else {
                    view = new l55(context, null);
                }
            } else {
                view = new xib(context);
            }
        } else {
            w8c w8cVar = new w8c(context, 58, 1, false);
            w8cVar.setCallCellStyle(58);
            view = w8cVar;
        }
        return new u69(view);
    }
}
