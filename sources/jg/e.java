package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.x5;
import c8.ha;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.d5;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Cells.s4;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.yp;
public abstract class e extends kj0 {
    public ArrayList D;
    public final boolean E;
    public int F;
    public final boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public float M;
    public final Context f16709s;
    public final int f16710w;
    public final boolean f16711x;
    public final a0.h f16712y;
    public final int f16708r = p10.f24474s0;
    public float L = 1.0f;
    public final ArrayList N = new ArrayList();

    public e(Context context, int i7, boolean z9, a0.h hVar, int i10) {
        boolean z10;
        this.f16709s = context;
        this.f16710w = i7;
        this.f16711x = z9;
        this.f16712y = hVar;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E = z10;
        this.G = i10 == 2;
    }

    @Override
    public final String F(int i7) {
        ArrayList arrayList;
        if (this.F != 2 && !this.I) {
            int i10 = this.f16708r;
            int i11 = this.f16710w;
            g5 r10 = g5.r(i10);
            if (i11 == 2) {
                arrayList = r10.f22618j0;
            } else {
                arrayList = r10.f22616h0;
            }
            int S = S(i7);
            if (S == -1) {
                S = arrayList.size() - 1;
            }
            if (i11 != 0 && !this.E) {
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
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
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
        boolean z9 = this.K;
        int i12 = this.f16708r;
        if (z9 && i7 == 1 && i10 > 1 && i10 - 2 < g5.r(i12).f22605a0.size()) {
            return g5.r(i12).f22605a0.get(i11);
        }
        if (P(i7, i10) == 2) {
            return "Header";
        }
        int i13 = this.f16710w;
        g5 r10 = g5.r(i12);
        if (i13 == 2) {
            hashMap = r10.f22617i0;
        } else {
            hashMap = r10.f22615g0;
        }
        g5 r11 = g5.r(i12);
        if (i13 == 2) {
            arrayList = r11.f22618j0;
        } else {
            arrayList = r11.f22616h0;
        }
        if (i13 != 0 && !this.E) {
            if (i7 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i7));
                if (i10 < arrayList2.size()) {
                    return qp.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i10)).user_id));
                }
            }
            return null;
        } else if (i7 == 0) {
            return null;
        } else {
            if (this.F == 2) {
                if (i7 == 1) {
                    if (i10 >= this.D.size()) {
                        return null;
                    }
                    return qp.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) this.D.get(i10)).user_id));
                }
            } else {
                int i14 = i7 - 1;
                if (i14 < arrayList.size()) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get(arrayList.get(i14));
                    if (i10 >= arrayList3.size()) {
                        return null;
                    }
                    return qp.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i10)).user_id));
                }
            }
            if (!this.f16711x || i10 < 0 || i10 >= g5.r(i12).f22605a0.size()) {
                return null;
            }
            return g5.r(i12).f22605a0.get(i10);
        }
    }

    @Override
    public final int P(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: jg.e.P(int, int):int");
    }

    @Override
    public final View T(int i7, View view) {
        ArrayList arrayList;
        int i10 = this.f16708r;
        int i11 = this.f16710w;
        g5.r(i10);
        g5 r10 = g5.r(i10);
        if (i11 == 2) {
            arrayList = r10.f22618j0;
        } else {
            arrayList = r10.f22616h0;
        }
        View view2 = view;
        if (view == null) {
            ?? frameLayout = new FrameLayout(this.f16709s);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(64.0f)));
            TextView textView = new TextView(frameLayout.getContext());
            frameLayout.f30278a = textView;
            com.google.android.recaptcha.internal.a.q(textView, 1, 22.0f);
            t6.U(textView, m6.B6, null);
            textView.setGravity(17);
            frameLayout.addView(textView, ha.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            this.N.add(frameLayout);
            view2 = frameLayout;
        }
        s4 s4Var = (s4) view2;
        float f10 = this.M;
        if (f10 > 0.0f) {
            s4Var.setLetterTextSize(f10);
        }
        s4Var.setLetterProgress(this.L);
        if (this.F != 2 && !this.H && !this.I) {
            if (i11 != 0 && !this.E) {
                if (i7 < arrayList.size()) {
                    s4Var.setLetter((String) arrayList.get(i7));
                    return view2;
                }
                s4Var.setLetter("");
                return view2;
            } else if (i7 == 0) {
                s4Var.setLetter("");
                return view2;
            } else {
                int i12 = i7 - 1;
                if (i12 < arrayList.size()) {
                    s4Var.setLetter((String) arrayList.get(i12));
                    return view2;
                }
                s4Var.setLetter("");
                return view2;
            }
        }
        s4Var.setLetter("");
        return view2;
    }

    @Override
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        HashMap hashMap;
        ArrayList arrayList;
        if (this.K) {
            if (i7 != 1 || i10 <= 1) {
                return false;
            }
        } else {
            int i11 = this.f16710w;
            int i12 = this.f16708r;
            g5 r10 = g5.r(i12);
            if (i11 == 2) {
                hashMap = r10.f22617i0;
            } else {
                hashMap = r10.f22615g0;
            }
            g5 r11 = g5.r(i12);
            if (i11 == 2) {
                arrayList = r11.f22618j0;
            } else {
                arrayList = r11.f22616h0;
            }
            boolean z9 = this.E;
            if (i11 != 0 && !z9) {
                if (this.I || i10 >= ((ArrayList) hashMap.get(arrayList.get(i7))).size()) {
                    return false;
                }
            } else if (i7 == 0) {
                if (z9) {
                    if (i10 >= 1) {
                        return false;
                    }
                } else if (this.f16711x) {
                    if (i10 >= 2) {
                        return false;
                    }
                } else if (i10 >= 3) {
                    return false;
                }
            } else if (!this.I) {
                if (this.F == 2) {
                    if (i7 == 1 && i10 >= this.D.size()) {
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
    public final void W(int i7, int i10, v4.d1 d1Var) {
        HashMap hashMap;
        ArrayList arrayList;
        int i11;
        ArrayList arrayList2;
        float f10;
        int i12 = d1Var.f57056f;
        View view = d1Var.f57052a;
        int i13 = 7;
        boolean z9 = this.E;
        int i14 = this.f16708r;
        boolean z10 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 4) {
                        if (i12 != 7) {
                            if (i12 == 8) {
                                q4 q4Var = (q4) view;
                                int i15 = i10 - 2;
                                if (i15 >= 0 && i15 < g5.r(i14).f22605a0.size()) {
                                    q4Var.a((d5) g5.r(i14).f22605a0.get(i15), null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        n4 n4Var = (n4) view;
                        if (this.K && i10 == 1 && i7 == 1) {
                            n4Var.setText(id.M0(2131749151, null));
                            return;
                        } else if (this.F == 1) {
                            n4Var.setText(id.M0(2131745284, null));
                            return;
                        } else {
                            n4Var.setText(id.M0(2131745285, null));
                            return;
                        }
                    }
                    if (!this.J) {
                        f10 = 96.0f;
                    } else {
                        f10 = 25.0f;
                    }
                    view.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(18.0f));
                    return;
                }
                x3 x3Var = (x3) view;
                int i16 = this.F;
                if (i16 == 0) {
                    x3Var.setText(id.M0(2131751780, null));
                    return;
                } else if (i16 == 1) {
                    x3Var.setText(id.M0(2131745284, null));
                    return;
                } else {
                    x3Var.setText(id.M0(2131745285, null));
                    return;
                }
            }
            m8 m8Var = (m8) view;
            boolean z11 = this.f16711x;
            if (!z11 && z9) {
                int i17 = m6.Wl;
                m8Var.g(i17, i17);
            } else {
                int i18 = m6.G6;
                m8Var.g(i18, i18);
            }
            if (i7 == 0) {
                if (z11) {
                    if (i10 == 0) {
                        m8Var.r(id.M0(2131749151, null), "", false, 2131232711, -14899731, -15431455, false);
                        return;
                    } else if (i10 == 1) {
                        m8Var.r(id.M0(2131746369, null), "", false, 2131232700, -11154873, -14175180, false);
                        return;
                    } else {
                        return;
                    }
                } else if (z9) {
                    if (this.G) {
                        m8Var.o(2131232204, id.M0(2131752402, null), false);
                        return;
                    } else {
                        m8Var.o(2131232204, id.M0(2131749110, null), false);
                        return;
                    }
                } else if (i10 == 0) {
                    m8Var.r(id.M0(2131748273, null), "", false, 2131232710, -14899731, -15431455, false);
                    return;
                } else if (i10 == 1) {
                    m8Var.r(id.M0(2131748286, null), "", false, 2131232701, -11154873, -14175180, false);
                    return;
                } else {
                    return;
                }
            }
            d5 d5Var = (d5) g5.r(i14).f22605a0.get(i10);
            String str = d5Var.f21996i;
            if (str != null && d5Var.f21997j != null) {
                m8Var.k(d5Var.f21996i + " " + d5Var.f21997j, false);
                return;
            } else if (str != null && d5Var.f21997j == null) {
                m8Var.k(str, false);
                return;
            } else {
                m8Var.k(d5Var.f21997j, false);
                return;
            }
        }
        pa paVar = (pa) view;
        paVar.T.f9446a = false;
        if (this.F != 2 && !this.H) {
            i13 = 58;
        }
        paVar.b(i13, 1);
        if (this.F == 2) {
            arrayList2 = this.D;
        } else {
            int i19 = this.f16710w;
            g5 r10 = g5.r(i14);
            if (i19 == 2) {
                hashMap = r10.f22617i0;
            } else {
                hashMap = r10.f22615g0;
            }
            if (i19 == 2) {
                arrayList = g5.r(i14).f22618j0;
            } else {
                arrayList = g5.r(i14).f22616h0;
            }
            if (i19 != 0 && !z9) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            arrayList2 = (ArrayList) hashMap.get(arrayList.get(i7 - i11));
        }
        TLRPC.User a22 = qp.s1(i14).a2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i10)).user_id));
        paVar.d(a22, null, null, false);
        if (this.f16712y.h(a22.f27109id) < 0) {
            z10 = false;
        }
        paVar.c(z10, false);
    }

    public final void Y(int i7, boolean z9) {
        this.F = i7;
        if (i7 == 2) {
            if (this.D == null || z9) {
                int i10 = this.f16708r;
                this.D = new ArrayList(g5.r(i10).f22612e0);
                long j3 = p10.i(i10).f24493n;
                int size = this.D.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    } else if (((TLRPC.TL_contact) this.D.get(i11)).user_id == j3) {
                        this.D.remove(i11);
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
        int i7 = this.f16708r;
        if (this.D == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
            Collections.sort(this.D, new d(qp.s1(i7), currentTime, 0));
            f();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        float f10;
        View view2;
        Context context = this.f16709s;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 7) {
                                if (i7 != 8) {
                                    if (i7 != 9) {
                                        view = new y6(context, (org.telegram.ui.Cells.f1) null);
                                    } else {
                                        View smVar = new sm(context, 3);
                                        smVar.setId(9);
                                        smVar.setTag(-33024);
                                        view2 = smVar;
                                    }
                                } else {
                                    view = new q4(context, false);
                                }
                            } else {
                                view = new n4(this.f16709s, m6.L6, 21, 14, 5, false, false, null);
                            }
                        } else {
                            FrameLayout x5Var = new x5(this, context, viewGroup, 5);
                            x5Var.addView(new yp(context), ha.e(-1, -2, 17));
                            x5Var.setLayoutParams(new v4.o0(-1, -2));
                            x5Var.setTag(-33024);
                            view2 = x5Var;
                        }
                        view = view2;
                    } else {
                        View e3Var = new e3(context, null);
                        float f11 = 72.0f;
                        if (id.f23161a0) {
                            f10 = 28.0f;
                        } else {
                            f10 = 72.0f;
                        }
                        int L = org.telegram.messenger.g0.L(f10);
                        int L2 = org.telegram.messenger.g0.L(8.0f);
                        if (!id.f23161a0) {
                            f11 = 28.0f;
                        }
                        e3Var.setPadding(L, L2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(8.0f));
                        view = e3Var;
                    }
                } else {
                    view = new x3(context, null);
                }
            } else {
                view = new m8(context);
            }
        } else {
            pa paVar = new pa(context, 58, 1, false);
            paVar.setCallCellStyle(58);
            view = paVar;
        }
        return new v4.d1(view);
    }
}
