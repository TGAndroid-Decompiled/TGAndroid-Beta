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
public abstract class tt2 extends j39 {
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
    public final vf6 y;
    public final int r = y6c.t0;
    public float M = 1.0f;
    public final ArrayList O = new ArrayList();

    public tt2(Context context, int i, boolean z, vf6 vf6Var, int i2) {
        boolean z2;
        this.s = context;
        this.w = i;
        this.x = z;
        this.y = vf6Var;
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
                arrayList = qu2.r(i3).k0;
            } else {
                arrayList = qu2.r(i3).i0;
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
    public final void G(o39 o39Var, float f, int[] iArr) {
        iArr[0] = (int) (b() * f);
        iArr[1] = 0;
    }

    @Override
    public final int M(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt2.M(int):int");
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
        if (z && i == 1 && i2 > 1 && i2 - 2 < qu2.r(i4).b0.size()) {
            return qu2.r(i4).b0.get(i3);
        }
        if (P(i, i2) == 2) {
            return "Header";
        }
        int i5 = this.w;
        qu2 r = qu2.r(i4);
        if (i5 == 2) {
            hashMap = r.j0;
            arrayList = qu2.r(i4).k0;
        } else {
            hashMap = r.h0;
            arrayList = qu2.r(i4).i0;
        }
        if (i5 != 0 && !this.F) {
            if (i < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i));
                if (i2 < arrayList2.size()) {
                    return na7.q1(i4).V1(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i2)).user_id));
                }
                return null;
            }
            return null;
        } else if (i != 0) {
            if (this.G == 2) {
                if (i == 1) {
                    if (i2 < this.E.size()) {
                        return na7.q1(i4).V1(Long.valueOf(((TLRPC.TL_contact) this.E.get(i2)).user_id));
                    }
                    return null;
                }
            } else {
                int i6 = i - 1;
                if (i6 < arrayList.size()) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get(arrayList.get(i6));
                    if (i2 < arrayList3.size()) {
                        return na7.q1(i4).V1(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i2)).user_id));
                    }
                    return null;
                }
            }
            if (this.x && i2 >= 0 && i2 < qu2.r(i4).b0.size()) {
                return qu2.r(i4).b0.get(i2);
            }
            return null;
        } else {
            return null;
        }
    }

    @Override
    public final int P(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt2.P(int, int):int");
    }

    @Override
    public final View T(int i, View view) {
        ArrayList arrayList;
        int i2 = this.w;
        int i3 = this.r;
        qu2.r(i3);
        qu2 r = qu2.r(i3);
        if (i2 == 2) {
            arrayList = r.k0;
        } else {
            arrayList = r.i0;
        }
        View view2 = view;
        if (view == null) {
            ?? frameLayout = new FrameLayout(this.s);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(gl.L(76.0f), gl.L(64.0f)));
            TextView textView = new TextView(frameLayout.getContext());
            frameLayout.a = textView;
            ir2.t(textView, 1, 22.0f);
            zkb.X(textView, bkb.A6, null);
            textView.setGravity(17);
            frameLayout.addView(textView, nme.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            this.O.add(frameLayout);
            view2 = frameLayout;
        }
        p06 p06Var = (p06) view2;
        float f = this.N;
        if (f > 0.0f) {
            p06Var.setLetterTextSize(f);
        }
        p06Var.setLetterProgress(this.M);
        if (this.G != 2 && !this.I && !this.J) {
            if (i2 != 0 && !this.F) {
                if (i < arrayList.size()) {
                    p06Var.setLetter((String) arrayList.get(i));
                    return view2;
                }
                p06Var.setLetter("");
                return view2;
            } else if (i == 0) {
                p06Var.setLetter("");
                return view2;
            } else {
                int i4 = i - 1;
                if (i4 < arrayList.size()) {
                    p06Var.setLetter((String) arrayList.get(i4));
                    return view2;
                }
                p06Var.setLetter("");
                return view2;
            }
        }
        p06Var.setLetter("");
        return view2;
    }

    @Override
    public final boolean V(int i, int i2, s49 s49Var) {
        HashMap hashMap;
        ArrayList arrayList;
        if (this.L) {
            if (i != 1 || i2 <= 1) {
                return false;
            }
        } else {
            int i3 = this.r;
            int i4 = this.w;
            qu2 r = qu2.r(i3);
            if (i4 == 2) {
                hashMap = r.j0;
                arrayList = qu2.r(i3).k0;
            } else {
                hashMap = r.h0;
                arrayList = qu2.r(i3).i0;
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
    public final void W(int i, int i2, s49 s49Var) {
        HashMap hashMap;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        float f;
        int i4 = s49Var.f;
        View view = s49Var.a;
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
                                kr5 kr5Var = (kr5) view;
                                int i7 = i2 - 2;
                                if (i7 >= 0 && i7 < qu2.r(i6).b0.size()) {
                                    kr5Var.a((nu2) qu2.r(i6).b0.get(i7), null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        ld5 ld5Var = (ld5) view;
                        if (this.L && i2 == 1 && i == 1) {
                            ld5Var.setText(k96.M0(2131748959, null));
                            return;
                        } else if (this.G == 1) {
                            ld5Var.setText(k96.M0(2131745092, null));
                            return;
                        } else {
                            ld5Var.setText(k96.M0(2131745093, null));
                            return;
                        }
                    }
                    if (!this.K) {
                        f = 96.0f;
                    } else {
                        f = 25.0f;
                    }
                    view.setPadding(0, gl.L(f), 0, gl.L(18.0f));
                    return;
                }
                l35 l35Var = (l35) view;
                byte b = this.G;
                if (b == 0) {
                    l35Var.setText(k96.M0(2131751768, null));
                    return;
                } else if (b == 1) {
                    l35Var.setText(k96.M0(2131745092, null));
                    return;
                } else {
                    l35Var.setText(k96.M0(2131745093, null));
                    return;
                }
            }
            wgb wgbVar = (wgb) view;
            boolean z3 = this.x;
            if (!z3 && z) {
                int i8 = bkb.Yl;
                wgbVar.g(i8, i8);
            } else {
                int i9 = bkb.F6;
                wgbVar.g(i9, i9);
            }
            if (i == 0) {
                if (z3) {
                    if (i2 == 0) {
                        wgbVar.r(k96.M0(2131748959, null), "", false, 2131232716, -14899731, -15431455, false);
                        return;
                    } else if (i2 == 1) {
                        wgbVar.r(k96.M0(2131746176, null), "", false, 2131232705, -11154873, -14175180, false);
                        return;
                    } else {
                        return;
                    }
                } else if (z) {
                    if (this.H) {
                        wgbVar.o(2131232209, k96.M0(2131752390, null), false);
                        return;
                    } else {
                        wgbVar.o(2131232209, k96.M0(2131748918, null), false);
                        return;
                    }
                } else if (i2 == 0) {
                    wgbVar.r(k96.M0(2131748081, null), "", false, 2131232715, -14899731, -15431455, false);
                    return;
                } else if (i2 == 1) {
                    wgbVar.r(k96.M0(2131748094, null), "", false, 2131232706, -11154873, -14175180, false);
                    return;
                } else {
                    return;
                }
            }
            nu2 nu2Var = (nu2) qu2.r(i6).b0.get(i2);
            String str = nu2Var.i;
            if (str != null) {
                String str2 = nu2Var.j;
                if (str2 != null) {
                    wgbVar.k(nu2Var.i + " " + nu2Var.j, false);
                    return;
                } else if (str2 == null) {
                    wgbVar.k(str, false);
                    return;
                }
            }
            wgbVar.k(nu2Var.j, false);
            return;
        }
        v6c v6cVar = (v6c) view;
        v6cVar.U.a = false;
        if (this.G != 2 && !this.I) {
            i5 = 58;
        }
        v6cVar.b(i5, 1);
        if (this.G == 2) {
            arrayList2 = this.E;
        } else {
            int i10 = this.w;
            qu2 r = qu2.r(i6);
            if (i10 == 2) {
                hashMap = r.j0;
                arrayList = qu2.r(i6).k0;
            } else {
                hashMap = r.h0;
                arrayList = qu2.r(i6).i0;
            }
            if (i10 != 0 && !z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            arrayList2 = (ArrayList) hashMap.get(arrayList.get(i - i3));
        }
        TLRPC.User V1 = na7.q1(i6).V1(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i2)).user_id));
        v6cVar.d(V1, null, null, false);
        if (this.y.h(V1.id) < 0) {
            z2 = false;
        }
        v6cVar.c(z2, false);
    }

    public final void Y(int i, boolean z) {
        this.G = i;
        if (i == 2) {
            if (this.E == null || z) {
                int i2 = this.r;
                this.E = new ArrayList(qu2.r(i2).f0);
                long j = y6c.h(i2).n;
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
            Collections.sort(this.E, new st2(na7.q1(i), currentTime, (byte) 0));
            f();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
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
                                        view = new b9a(context, (de9) null);
                                    } else {
                                        View d62Var = new d62(context, (byte) 5);
                                        d62Var.setId(9);
                                        d62Var.setTag(-33024);
                                        view = d62Var;
                                    }
                                } else {
                                    view = new kr5(context, false);
                                }
                            } else {
                                view = new ld5(this.s, bkb.K6, 21, 14, 5, false, false, null);
                            }
                        } else {
                            FrameLayout stVar = new st(this, context, viewGroup, (byte) 9);
                            stVar.addView(new ru2(context), nme.e(-1, -2, 17));
                            stVar.setLayoutParams(new e49(-1, -2));
                            stVar.setTag(-33024);
                            view = stVar;
                        }
                    } else {
                        View qo3Var = new qo3(context, null);
                        float f2 = 72.0f;
                        if (k96.a0) {
                            f = 28.0f;
                        } else {
                            f = 72.0f;
                        }
                        int L = gl.L(f);
                        int L2 = gl.L(8.0f);
                        if (!k96.a0) {
                            f2 = 28.0f;
                        }
                        qo3Var.setPadding(L, L2, gl.L(f2), gl.L(8.0f));
                        view = qo3Var;
                    }
                } else {
                    view = new l35(context, null);
                }
            } else {
                view = new wgb(context);
            }
        } else {
            v6c v6cVar = new v6c(context, 58, 1, false);
            v6cVar.setCallCellStyle(58);
            view = v6cVar;
        }
        return new s49(view);
    }
}
