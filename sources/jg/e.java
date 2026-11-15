package jg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.d5;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Cells.s4;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.uj0;
public abstract class e extends pj0 {
    public ArrayList E;
    public final boolean F;
    public int G;
    public final boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public float N;
    public final Context f17058s;
    public final int f17059w;
    public final boolean f17060x;
    public final a0.h f17061y;
    public final int f17057r = m10.f24934t0;
    public float M = 1.0f;
    public final ArrayList O = new ArrayList();

    public e(Context context, int i7, boolean z10, a0.h hVar, int i10) {
        boolean z11;
        this.f17058s = context;
        this.f17059w = i7;
        this.f17060x = z10;
        this.f17061y = hVar;
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
            int i10 = this.f17057r;
            int i11 = this.f17059w;
            g5 r10 = g5.r(i10);
            if (i11 == 2) {
                arrayList = r10.f23684k0;
            } else {
                arrayList = r10.f23682i0;
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
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
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
        int i12 = this.f17057r;
        if (z10 && i7 == 1 && i10 > 1 && i10 - 2 < g5.r(i12).f23672b0.size()) {
            return g5.r(i12).f23672b0.get(i11);
        }
        if (P(i7, i10) == 2) {
            return "Header";
        }
        int i13 = this.f17059w;
        g5 r10 = g5.r(i12);
        if (i13 == 2) {
            hashMap = r10.f23683j0;
        } else {
            hashMap = r10.f23681h0;
        }
        g5 r11 = g5.r(i12);
        if (i13 == 2) {
            arrayList = r11.f23684k0;
        } else {
            arrayList = r11.f23682i0;
        }
        if (i13 != 0 && !this.F) {
            if (i7 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i7));
                if (i10 < arrayList2.size()) {
                    return np.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i10)).user_id));
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
                    return np.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) this.E.get(i10)).user_id));
                }
            } else {
                int i14 = i7 - 1;
                if (i14 < arrayList.size()) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get(arrayList.get(i14));
                    if (i10 >= arrayList3.size()) {
                        return null;
                    }
                    return np.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i10)).user_id));
                }
            }
            if (!this.f17060x || i10 < 0 || i10 >= g5.r(i12).f23672b0.size()) {
                return null;
            }
            return g5.r(i12).f23672b0.get(i10);
        }
    }

    @Override
    public final int P(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: jg.e.P(int, int):int");
    }

    @Override
    public final View T(int i7, View view) {
        ArrayList arrayList;
        int i10 = this.f17057r;
        int i11 = this.f17059w;
        g5.r(i10);
        g5 r10 = g5.r(i10);
        if (i11 == 2) {
            arrayList = r10.f23684k0;
        } else {
            arrayList = r10.f23682i0;
        }
        View view2 = view;
        if (view == null) {
            ?? frameLayout = new FrameLayout(this.f17058s);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(64.0f)));
            TextView textView = new TextView(frameLayout.getContext());
            frameLayout.f31412a = textView;
            i5.c.v(textView, 1, 22.0f);
            q6.U(textView, j6.B6, null);
            textView.setGravity(17);
            frameLayout.addView(textView, ja.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
            this.O.add(frameLayout);
            view2 = frameLayout;
        }
        s4 s4Var = (s4) view2;
        float f10 = this.N;
        if (f10 > 0.0f) {
            s4Var.setLetterTextSize(f10);
        }
        s4Var.setLetterProgress(this.M);
        if (this.G != 2 && !this.I && !this.J) {
            if (i11 != 0 && !this.F) {
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
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        HashMap hashMap;
        ArrayList arrayList;
        if (this.L) {
            if (i7 != 1 || i10 <= 1) {
                return false;
            }
        } else {
            int i11 = this.f17059w;
            int i12 = this.f17057r;
            g5 r10 = g5.r(i12);
            if (i11 == 2) {
                hashMap = r10.f23683j0;
            } else {
                hashMap = r10.f23681h0;
            }
            g5 r11 = g5.r(i12);
            if (i11 == 2) {
                arrayList = r11.f23684k0;
            } else {
                arrayList = r11.f23682i0;
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
                } else if (this.f17060x) {
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
    public final void W(int i7, int i10, v4.e1 e1Var) {
        HashMap hashMap;
        ArrayList arrayList;
        int i11;
        ArrayList arrayList2;
        float f10;
        int i12 = e1Var.f58539f;
        View view = e1Var.f58535a;
        int i13 = 7;
        boolean z10 = this.F;
        int i14 = this.f17057r;
        boolean z11 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 4) {
                        if (i12 != 7) {
                            if (i12 == 8) {
                                q4 q4Var = (q4) view;
                                int i15 = i10 - 2;
                                if (i15 >= 0 && i15 < g5.r(i14).f23672b0.size()) {
                                    q4Var.a((d5) g5.r(i14).f23672b0.get(i15), null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        n4 n4Var = (n4) view;
                        if (this.L && i10 == 1 && i7 == 1) {
                            n4Var.setText(hd.M0(2131749151, null));
                            return;
                        } else if (this.G == 1) {
                            n4Var.setText(hd.M0(2131745284, null));
                            return;
                        } else {
                            n4Var.setText(hd.M0(2131745285, null));
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
                x3 x3Var = (x3) view;
                int i16 = this.G;
                if (i16 == 0) {
                    x3Var.setText(hd.M0(2131751780, null));
                    return;
                } else if (i16 == 1) {
                    x3Var.setText(hd.M0(2131745284, null));
                    return;
                } else {
                    x3Var.setText(hd.M0(2131745285, null));
                    return;
                }
            }
            l8 l8Var = (l8) view;
            boolean z12 = this.f17060x;
            if (!z12 && z10) {
                int i17 = j6.Zl;
                l8Var.g(i17, i17);
            } else {
                int i18 = j6.G6;
                l8Var.g(i18, i18);
            }
            if (i7 == 0) {
                if (z12) {
                    if (i10 == 0) {
                        l8Var.r(hd.M0(2131749151, null), "", false, 2131232712, -14899731, -15431455, false);
                        return;
                    } else if (i10 == 1) {
                        l8Var.r(hd.M0(2131746369, null), "", false, 2131232701, -11154873, -14175180, false);
                        return;
                    } else {
                        return;
                    }
                } else if (z10) {
                    if (this.H) {
                        l8Var.o(2131232205, hd.M0(2131752402, null), false);
                        return;
                    } else {
                        l8Var.o(2131232205, hd.M0(2131749110, null), false);
                        return;
                    }
                } else if (i10 == 0) {
                    l8Var.r(hd.M0(2131748273, null), "", false, 2131232711, -14899731, -15431455, false);
                    return;
                } else if (i10 == 1) {
                    l8Var.r(hd.M0(2131748286, null), "", false, 2131232702, -11154873, -14175180, false);
                    return;
                } else {
                    return;
                }
            }
            d5 d5Var = (d5) g5.r(i14).f23672b0.get(i10);
            String str = d5Var.f23037i;
            if (str != null && d5Var.f23038j != null) {
                l8Var.k(d5Var.f23037i + " " + d5Var.f23038j, false);
                return;
            } else if (str != null && d5Var.f23038j == null) {
                l8Var.k(str, false);
                return;
            } else {
                l8Var.k(d5Var.f23038j, false);
                return;
            }
        }
        pa paVar = (pa) view;
        paVar.U.f11778a = false;
        if (this.G != 2 && !this.I) {
            i13 = 58;
        }
        paVar.b(i13, 1);
        if (this.G == 2) {
            arrayList2 = this.E;
        } else {
            int i19 = this.f17059w;
            g5 r10 = g5.r(i14);
            if (i19 == 2) {
                hashMap = r10.f23683j0;
            } else {
                hashMap = r10.f23681h0;
            }
            if (i19 == 2) {
                arrayList = g5.r(i14).f23684k0;
            } else {
                arrayList = g5.r(i14).f23682i0;
            }
            if (i19 != 0 && !z10) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            arrayList2 = (ArrayList) hashMap.get(arrayList.get(i7 - i11));
        }
        TLRPC.User a22 = np.s1(i14).a2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i10)).user_id));
        paVar.d(a22, null, null, false);
        if (this.f17061y.h(a22.f28200id) < 0) {
            z11 = false;
        }
        paVar.c(z11, false);
    }

    public final void Y(int i7, boolean z10) {
        this.G = i7;
        if (i7 == 2) {
            if (this.E == null || z10) {
                int i10 = this.f17057r;
                this.E = new ArrayList(g5.r(i10).f23679f0);
                long j3 = m10.i(i10).f24953n;
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
        int i7 = this.f17057r;
        if (this.E == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
            Collections.sort(this.E, new d(np.s1(i7), currentTime, 0));
            f();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        float f10;
        View view2;
        Context context = this.f17058s;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 7) {
                                if (i7 != 8) {
                                    if (i7 != 9) {
                                        view = new x6(context, (org.telegram.ui.Cells.y0) null);
                                    } else {
                                        View bnVar = new bn(context, 2);
                                        bnVar.setId(9);
                                        bnVar.setTag(-33024);
                                        view2 = bnVar;
                                    }
                                } else {
                                    view = new q4(context, false);
                                }
                            } else {
                                view = new n4(this.f17058s, j6.L6, 21, 14, 5, false, false, null);
                            }
                        } else {
                            FrameLayout j0Var = new ai.j0(this, context, viewGroup, 7);
                            j0Var.addView(new gq(context), ja.e(-1, -2, 17));
                            j0Var.setLayoutParams(new v4.p0(-1, -2));
                            j0Var.setTag(-33024);
                            view2 = j0Var;
                        }
                        view = view2;
                    } else {
                        View e3Var = new e3(context, null);
                        float f11 = 72.0f;
                        if (hd.f24101a0) {
                            f10 = 28.0f;
                        } else {
                            f10 = 72.0f;
                        }
                        int L = org.telegram.messenger.g0.L(f10);
                        int L2 = org.telegram.messenger.g0.L(8.0f);
                        if (!hd.f24101a0) {
                            f11 = 28.0f;
                        }
                        e3Var.setPadding(L, L2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(8.0f));
                        view = e3Var;
                    }
                } else {
                    view = new x3(context, null);
                }
            } else {
                view = new l8(context);
            }
        } else {
            pa paVar = new pa(context, 58, 1, false);
            paVar.setCallCellStyle(58);
            view = paVar;
        }
        return new v4.e1(view);
    }
}
