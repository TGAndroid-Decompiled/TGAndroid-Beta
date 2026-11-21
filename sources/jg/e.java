package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.f5;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.zj0;
public abstract class e extends zj0 {
    public ArrayList E;
    public final boolean F;
    public int G;
    public final boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public float N;
    public final Context f17466s;
    public final int f17467w;
    public final boolean f17468x;
    public final a0.h f17469y;
    public final int f17465r = j10.f24798t0;
    public float M = 1.0f;
    public final ArrayList O = new ArrayList();

    public e(Context context, int i7, boolean z10, a0.h hVar, int i10) {
        boolean z11;
        this.f17466s = context;
        this.f17467w = i7;
        this.f17468x = z10;
        this.f17469y = hVar;
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.F = z11;
        this.H = i10 == 2;
    }

    @Override
    public final String F(int i7) {
        ArrayList arrayList;
        if (this.G != 2 && !this.J) {
            int i10 = this.f17465r;
            int i11 = this.f17467w;
            i5 r10 = i5.r(i10);
            if (i11 == 2) {
                arrayList = r10.f24600k0;
            } else {
                arrayList = r10.f24598i0;
            }
            int S = S(i7);
            if (S == -1) {
                S = arrayList.size() - 1;
            }
            if (i11 != 0 && !this.F) {
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
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    @Override
    public final int M(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: jg.e.M(int):int");
    }

    @Override
    public final int N(int i7, int i10) {
        return Objects.hash(Integer.valueOf(i7 * (-49612)), O(i7, i10));
    }

    @Override
    public final Object O(int i7, int i10) {
        HashMap hashMap;
        ArrayList arrayList;
        int i11;
        boolean z10 = this.L;
        int i12 = this.f17465r;
        if (z10 && i7 == 1 && i10 > 1 && i10 - 2 < i5.r(i12).f24588b0.size()) {
            return i5.r(i12).f24588b0.get(i11);
        }
        if (P(i7, i10) == 2) {
            return "Header";
        }
        int i13 = this.f17467w;
        i5 r10 = i5.r(i12);
        if (i13 == 2) {
            hashMap = r10.f24599j0;
        } else {
            hashMap = r10.f24597h0;
        }
        i5 r11 = i5.r(i12);
        if (i13 == 2) {
            arrayList = r11.f24600k0;
        } else {
            arrayList = r11.f24598i0;
        }
        if (i13 != 0 && !this.F) {
            if (i7 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i7));
                if (i10 < arrayList2.size()) {
                    return mp.u1(i12).c2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i10)).user_id));
                }
            }
            return null;
        } else if (i7 == 0) {
            return null;
        } else {
            if (this.G == 2) {
                if (i7 == 1) {
                    if (i10 >= this.E.size()) {
                        return null;
                    }
                    return mp.u1(i12).c2(Long.valueOf(((TLRPC.TL_contact) this.E.get(i10)).user_id));
                }
            } else {
                int i14 = i7 - 1;
                if (i14 < arrayList.size()) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get(arrayList.get(i14));
                    if (i10 >= arrayList3.size()) {
                        return null;
                    }
                    return mp.u1(i12).c2(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i10)).user_id));
                }
            }
            if (!this.f17468x || i10 < 0 || i10 >= i5.r(i12).f24588b0.size()) {
                return null;
            }
            return i5.r(i12).f24588b0.get(i10);
        }
    }

    @Override
    public final int P(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: jg.e.P(int, int):int");
    }

    @Override
    public final View T(int i7, View view) {
        ArrayList arrayList;
        int i10 = this.f17465r;
        int i11 = this.f17467w;
        i5.r(i10);
        i5 r10 = i5.r(i10);
        if (i11 == 2) {
            arrayList = r10.f24600k0;
        } else {
            arrayList = r10.f24598i0;
        }
        View view2 = view;
        if (view == null) {
            ?? frameLayout = new FrameLayout(this.f17466s);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(64.0f)));
            TextView textView = new TextView(frameLayout.getContext());
            frameLayout.f31858a = textView;
            i5.c.x(textView, 1, 22.0f);
            t6.U(textView, m6.B6, null);
            textView.setGravity(17);
            frameLayout.addView(textView, ma.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            this.O.add(frameLayout);
            view2 = frameLayout;
        }
        t4 t4Var = (t4) view2;
        float f10 = this.N;
        if (f10 > 0.0f) {
            t4Var.setLetterTextSize(f10);
        }
        t4Var.setLetterProgress(this.M);
        if (this.G != 2 && !this.I && !this.J) {
            if (i11 != 0 && !this.F) {
                if (i7 < arrayList.size()) {
                    t4Var.setLetter((String) arrayList.get(i7));
                    return view2;
                }
                t4Var.setLetter("");
                return view2;
            } else if (i7 == 0) {
                t4Var.setLetter("");
                return view2;
            } else {
                int i12 = i7 - 1;
                if (i12 < arrayList.size()) {
                    t4Var.setLetter((String) arrayList.get(i12));
                    return view2;
                }
                t4Var.setLetter("");
                return view2;
            }
        }
        t4Var.setLetter("");
        return view2;
    }

    @Override
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        HashMap hashMap;
        ArrayList arrayList;
        if (this.L) {
            if (i7 != 1 || i10 <= 1) {
                return false;
            }
        } else {
            int i11 = this.f17467w;
            int i12 = this.f17465r;
            i5 r10 = i5.r(i12);
            if (i11 == 2) {
                hashMap = r10.f24599j0;
            } else {
                hashMap = r10.f24597h0;
            }
            i5 r11 = i5.r(i12);
            if (i11 == 2) {
                arrayList = r11.f24600k0;
            } else {
                arrayList = r11.f24598i0;
            }
            boolean z10 = this.F;
            if (i11 != 0 && !z10) {
                if (this.J || i10 >= ((ArrayList) hashMap.get(arrayList.get(i7))).size()) {
                    return false;
                }
            } else if (i7 == 0) {
                if (z10) {
                    if (i10 >= 1) {
                        return false;
                    }
                } else if (this.f17468x) {
                    if (i10 >= 2) {
                        return false;
                    }
                } else if (i10 >= 3) {
                    return false;
                }
            } else if (!this.J) {
                if (this.G == 2) {
                    if (i7 == 1 && i10 >= this.E.size()) {
                        return false;
                    }
                } else {
                    int i13 = i7 - 1;
                    if (i13 < arrayList.size() && i10 >= ((ArrayList) hashMap.get(arrayList.get(i13))).size()) {
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
    public final void W(int i7, int i10, v4.f1 f1Var) {
        HashMap hashMap;
        ArrayList arrayList;
        int i11;
        ArrayList arrayList2;
        float f10;
        int i12 = f1Var.f59165f;
        View view = f1Var.f59161a;
        int i13 = 7;
        boolean z10 = this.F;
        int i14 = this.f17465r;
        boolean z11 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 4) {
                        if (i12 != 7) {
                            if (i12 == 8) {
                                r4 r4Var = (r4) view;
                                int i15 = i10 - 2;
                                if (i15 >= 0 && i15 < i5.r(i14).f24588b0.size()) {
                                    r4Var.a((f5) i5.r(i14).f24588b0.get(i15), null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        o4 o4Var = (o4) view;
                        if (this.L && i10 == 1 && i7 == 1) {
                            o4Var.setText(gd.N0(2131748958, null));
                            return;
                        } else if (this.G == 1) {
                            o4Var.setText(gd.N0(2131745088, null));
                            return;
                        } else {
                            o4Var.setText(gd.N0(2131745089, null));
                            return;
                        }
                    }
                    if (!this.K) {
                        f10 = 96.0f;
                    } else {
                        f10 = 25.0f;
                    }
                    view.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(18.0f));
                    return;
                }
                y3 y3Var = (y3) view;
                int i16 = this.G;
                if (i16 == 0) {
                    y3Var.setText(gd.N0(2131751768, null));
                    return;
                } else if (i16 == 1) {
                    y3Var.setText(gd.N0(2131745088, null));
                    return;
                } else {
                    y3Var.setText(gd.N0(2131745089, null));
                    return;
                }
            }
            n8 n8Var = (n8) view;
            boolean z12 = this.f17468x;
            if (!z12 && z10) {
                int i17 = m6.Zl;
                n8Var.g(i17, i17);
            } else {
                int i18 = m6.G6;
                n8Var.g(i18, i18);
            }
            if (i7 == 0) {
                if (z12) {
                    if (i10 == 0) {
                        n8Var.r(gd.N0(2131748958, null), "", false, 2131232713, -14899731, -15431455, false);
                        return;
                    } else if (i10 == 1) {
                        n8Var.r(gd.N0(2131746173, null), "", false, 2131232702, -11154873, -14175180, false);
                        return;
                    } else {
                        return;
                    }
                } else if (z10) {
                    if (this.H) {
                        n8Var.o(2131232206, gd.N0(2131752390, null), false);
                        return;
                    } else {
                        n8Var.o(2131232206, gd.N0(2131748917, null), false);
                        return;
                    }
                } else if (i10 == 0) {
                    n8Var.r(gd.N0(2131748080, null), "", false, 2131232712, -14899731, -15431455, false);
                    return;
                } else if (i10 == 1) {
                    n8Var.r(gd.N0(2131748093, null), "", false, 2131232703, -11154873, -14175180, false);
                    return;
                } else {
                    return;
                }
            }
            f5 f5Var = (f5) i5.r(i14).f24588b0.get(i10);
            String str = f5Var.f23871i;
            if (str != null && f5Var.f23872j != null) {
                n8Var.k(f5Var.f23871i + " " + f5Var.f23872j, false);
                return;
            } else if (str != null && f5Var.f23872j == null) {
                n8Var.k(str, false);
                return;
            } else {
                n8Var.k(f5Var.f23872j, false);
                return;
            }
        }
        ra raVar = (ra) view;
        raVar.U.f11931a = false;
        if (this.G != 2 && !this.I) {
            i13 = 58;
        }
        raVar.b(i13, 1);
        if (this.G == 2) {
            arrayList2 = this.E;
        } else {
            int i19 = this.f17467w;
            i5 r10 = i5.r(i14);
            if (i19 == 2) {
                hashMap = r10.f24599j0;
            } else {
                hashMap = r10.f24597h0;
            }
            if (i19 == 2) {
                arrayList = i5.r(i14).f24600k0;
            } else {
                arrayList = i5.r(i14).f24598i0;
            }
            if (i19 != 0 && !z10) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            arrayList2 = (ArrayList) hashMap.get(arrayList.get(i7 - i11));
        }
        TLRPC.User c22 = mp.u1(i14).c2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i10)).user_id));
        raVar.d(c22, null, null, false);
        if (this.f17469y.h(c22.f28580id) < 0) {
            z11 = false;
        }
        raVar.c(z11, false);
    }

    public final void Y(int i7, boolean z10) {
        this.G = i7;
        if (i7 == 2) {
            if (this.E == null || z10) {
                int i10 = this.f17465r;
                this.E = new ArrayList(i5.r(i10).f24595f0);
                long j3 = j10.i(i10).f24817n;
                int size = this.E.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    } else if (((TLRPC.TL_contact) this.E.get(i11)).user_id == j3) {
                        this.E.remove(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            Z();
            return;
        }
        f();
    }

    public final void Z() {
        int i7 = this.f17465r;
        if (this.E == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
            Collections.sort(this.E, new d(mp.u1(i7), currentTime, 0));
            f();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        float f10;
        View view2;
        Context context = this.f17466s;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 7) {
                                if (i7 != 8) {
                                    if (i7 != 9) {
                                        view = new z6(context, (org.telegram.ui.Cells.c0) null);
                                    } else {
                                        View lnVar = new ln(context, 2);
                                        lnVar.setId(9);
                                        lnVar.setTag(-33024);
                                        view2 = lnVar;
                                    }
                                } else {
                                    view = new r4(context, false);
                                }
                            } else {
                                view = new o4(this.f17466s, m6.L6, 21, 14, 5, false, false, null);
                            }
                        } else {
                            FrameLayout l0Var = new ai.l0(this, context, viewGroup, 8);
                            l0Var.addView(new pq(context), ma.e(-1, -2, 17));
                            l0Var.setLayoutParams(new v4.q0(-1, -2));
                            l0Var.setTag(-33024);
                            view2 = l0Var;
                        }
                        view = view2;
                    } else {
                        View f3Var = new f3(context, null);
                        float f11 = 72.0f;
                        if (gd.f24241a0) {
                            f10 = 28.0f;
                        } else {
                            f10 = 72.0f;
                        }
                        int L = org.telegram.messenger.g0.L(f10);
                        int L2 = org.telegram.messenger.g0.L(8.0f);
                        if (!gd.f24241a0) {
                            f11 = 28.0f;
                        }
                        f3Var.setPadding(L, L2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(8.0f));
                        view = f3Var;
                    }
                } else {
                    view = new y3(context, null);
                }
            } else {
                view = new n8(context);
            }
        } else {
            ra raVar = new ra(context, 58, 1, false);
            raVar.setCallCellStyle(58);
            view = raVar;
        }
        return new v4.f1(view);
    }
}
