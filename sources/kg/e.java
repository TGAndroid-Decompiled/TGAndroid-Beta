package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.d5;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Cells.s4;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.zp;
public abstract class e extends oj0 {
    public ArrayList E;
    public final boolean F;
    public int G;
    public final boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public float N;
    public final Context f16952s;
    public final int f16953w;
    public final boolean f16954x;
    public final a0.h f16955y;
    public final int f16951r = h10.f22829t0;
    public float M = 1.0f;
    public final ArrayList O = new ArrayList();

    public e(Context context, int i3, boolean z10, a0.h hVar, int i10) {
        boolean z11;
        this.f16952s = context;
        this.f16953w = i3;
        this.f16954x = z10;
        this.f16955y = hVar;
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.F = z11;
        this.H = i10 == 2;
    }

    @Override
    public final String F(int i3) {
        ArrayList arrayList;
        if (this.G != 2 && !this.J) {
            int i10 = this.f16951r;
            int i11 = this.f16953w;
            g5 r5 = g5.r(i10);
            if (i11 == 2) {
                arrayList = r5.f22658k0;
            } else {
                arrayList = r5.f22656i0;
            }
            int S = S(i3);
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
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    @Override
    public final int M(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: kg.e.M(int):int");
    }

    @Override
    public final int N(int i3, int i10) {
        return Objects.hash(Integer.valueOf(i3 * (-49612)), O(i3, i10));
    }

    @Override
    public final Object O(int i3, int i10) {
        HashMap hashMap;
        ArrayList arrayList;
        int i11;
        boolean z10 = this.L;
        int i12 = this.f16951r;
        if (z10 && i3 == 1 && i10 > 1 && i10 - 2 < g5.r(i12).f22646b0.size()) {
            return g5.r(i12).f22646b0.get(i11);
        }
        if (P(i3, i10) == 2) {
            return "Header";
        }
        int i13 = this.f16953w;
        g5 r5 = g5.r(i12);
        if (i13 == 2) {
            hashMap = r5.f22657j0;
        } else {
            hashMap = r5.f22655h0;
        }
        g5 r9 = g5.r(i12);
        if (i13 == 2) {
            arrayList = r9.f22658k0;
        } else {
            arrayList = r9.f22656i0;
        }
        if (i13 != 0 && !this.F) {
            if (i3 < arrayList.size()) {
                ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i3));
                if (i10 < arrayList2.size()) {
                    return hp.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i10)).user_id));
                }
            }
            return null;
        } else if (i3 == 0) {
            return null;
        } else {
            if (this.G == 2) {
                if (i3 == 1) {
                    if (i10 >= this.E.size()) {
                        return null;
                    }
                    return hp.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) this.E.get(i10)).user_id));
                }
            } else {
                int i14 = i3 - 1;
                if (i14 < arrayList.size()) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get(arrayList.get(i14));
                    if (i10 >= arrayList3.size()) {
                        return null;
                    }
                    return hp.s1(i12).a2(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i10)).user_id));
                }
            }
            if (!this.f16954x || i10 < 0 || i10 >= g5.r(i12).f22646b0.size()) {
                return null;
            }
            return g5.r(i12).f22646b0.get(i10);
        }
    }

    @Override
    public final int P(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: kg.e.P(int, int):int");
    }

    @Override
    public final View T(int i3, View view) {
        ArrayList arrayList;
        int i10 = this.f16951r;
        int i11 = this.f16953w;
        g5.r(i10);
        g5 r5 = g5.r(i10);
        if (i11 == 2) {
            arrayList = r5.f22658k0;
        } else {
            arrayList = r5.f22656i0;
        }
        View view2 = view;
        if (view == null) {
            ?? frameLayout = new FrameLayout(this.f16952s);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(64.0f)));
            TextView textView = new TextView(frameLayout.getContext());
            frameLayout.f30336a = textView;
            k2.p1.t(textView, 1, 22.0f);
            r6.V(textView, k6.B6, null);
            textView.setGravity(17);
            frameLayout.addView(textView, mf.d(-1, -1.0f, 119, 12.0f, 0.0f, 0.0f, 0.0f));
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
                if (i3 < arrayList.size()) {
                    s4Var.setLetter((String) arrayList.get(i3));
                    return view2;
                }
                s4Var.setLetter("");
                return view2;
            } else if (i3 == 0) {
                s4Var.setLetter("");
                return view2;
            } else {
                int i12 = i3 - 1;
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
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        HashMap hashMap;
        ArrayList arrayList;
        if (this.L) {
            if (i3 != 1 || i10 <= 1) {
                return false;
            }
        } else {
            int i11 = this.f16953w;
            int i12 = this.f16951r;
            g5 r5 = g5.r(i12);
            if (i11 == 2) {
                hashMap = r5.f22657j0;
            } else {
                hashMap = r5.f22655h0;
            }
            g5 r9 = g5.r(i12);
            if (i11 == 2) {
                arrayList = r9.f22658k0;
            } else {
                arrayList = r9.f22656i0;
            }
            boolean z10 = this.F;
            if (i11 != 0 && !z10) {
                if (this.J || i10 >= ((ArrayList) hashMap.get(arrayList.get(i3))).size()) {
                    return false;
                }
            } else if (i3 == 0) {
                if (z10) {
                    if (i10 >= 1) {
                        return false;
                    }
                } else if (this.f16954x) {
                    if (i10 >= 2) {
                        return false;
                    }
                } else if (i10 >= 3) {
                    return false;
                }
            } else if (!this.J) {
                if (this.G == 2) {
                    if (i3 == 1 && i10 >= this.E.size()) {
                        return false;
                    }
                } else {
                    int i13 = i3 - 1;
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
    public final void W(int i3, int i10, u4.d1 d1Var) {
        HashMap hashMap;
        ArrayList arrayList;
        int i11;
        ArrayList arrayList2;
        float f10;
        int i12 = d1Var.f55544f;
        View view = d1Var.f55540a;
        int i13 = 7;
        boolean z10 = this.F;
        int i14 = this.f16951r;
        boolean z11 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 4) {
                        if (i12 != 7) {
                            if (i12 == 8) {
                                q4 q4Var = (q4) view;
                                int i15 = i10 - 2;
                                if (i15 >= 0 && i15 < g5.r(i14).f22646b0.size()) {
                                    q4Var.a((d5) g5.r(i14).f22646b0.get(i15), null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        n4 n4Var = (n4) view;
                        if (this.L && i10 == 1 && i3 == 1) {
                            n4Var.setText(bd.M0(2131749159, null));
                            return;
                        } else if (this.G == 1) {
                            n4Var.setText(bd.M0(2131745294, null));
                            return;
                        } else {
                            n4Var.setText(bd.M0(2131745295, null));
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
                    x3Var.setText(bd.M0(2131751780, null));
                    return;
                } else if (i16 == 1) {
                    x3Var.setText(bd.M0(2131745294, null));
                    return;
                } else {
                    x3Var.setText(bd.M0(2131745295, null));
                    return;
                }
            }
            l8 l8Var = (l8) view;
            boolean z12 = this.f16954x;
            if (!z12 && z10) {
                int i17 = k6.Wl;
                l8Var.g(i17, i17);
            } else {
                int i18 = k6.G6;
                l8Var.g(i18, i18);
            }
            if (i3 == 0) {
                if (z12) {
                    if (i10 == 0) {
                        l8Var.r(bd.M0(2131749159, null), "", false, 2131232709, -14899731, -15431455, false);
                        return;
                    } else if (i10 == 1) {
                        l8Var.r(bd.M0(2131746377, null), "", false, 2131232698, -11154873, -14175180, false);
                        return;
                    } else {
                        return;
                    }
                } else if (z10) {
                    if (this.H) {
                        l8Var.o(2131232204, bd.M0(2131752402, null), false);
                        return;
                    } else {
                        l8Var.o(2131232204, bd.M0(2131749118, null), false);
                        return;
                    }
                } else if (i10 == 0) {
                    l8Var.r(bd.M0(2131748281, null), "", false, 2131232708, -14899731, -15431455, false);
                    return;
                } else if (i10 == 1) {
                    l8Var.r(bd.M0(2131748294, null), "", false, 2131232699, -11154873, -14175180, false);
                    return;
                } else {
                    return;
                }
            }
            d5 d5Var = (d5) g5.r(i14).f22646b0.get(i10);
            String str = d5Var.f22153i;
            if (str != null && d5Var.f22154j != null) {
                l8Var.k(d5Var.f22153i + " " + d5Var.f22154j, false);
                return;
            } else if (str != null && d5Var.f22154j == null) {
                l8Var.k(str, false);
                return;
            } else {
                l8Var.k(d5Var.f22154j, false);
                return;
            }
        }
        pa paVar = (pa) view;
        paVar.U.f10696a = false;
        if (this.G != 2 && !this.I) {
            i13 = 58;
        }
        paVar.b(i13, 1);
        if (this.G == 2) {
            arrayList2 = this.E;
        } else {
            int i19 = this.f16953w;
            g5 r5 = g5.r(i14);
            if (i19 == 2) {
                hashMap = r5.f22657j0;
            } else {
                hashMap = r5.f22655h0;
            }
            if (i19 == 2) {
                arrayList = g5.r(i14).f22658k0;
            } else {
                arrayList = g5.r(i14).f22656i0;
            }
            if (i19 != 0 && !z10) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            arrayList2 = (ArrayList) hashMap.get(arrayList.get(i3 - i11));
        }
        TLRPC.User a22 = hp.s1(i14).a2(Long.valueOf(((TLRPC.TL_contact) arrayList2.get(i10)).user_id));
        paVar.d(a22, null, null, false);
        if (this.f16955y.h(a22.f27150id) < 0) {
            z11 = false;
        }
        paVar.c(z11, false);
    }

    public final void Y(int i3, boolean z10) {
        this.G = i3;
        if (i3 == 2) {
            if (this.E == null || z10) {
                int i10 = this.f16951r;
                this.E = new ArrayList(g5.r(i10).f22653f0);
                long j10 = h10.i(i10).f22848n;
                int size = this.E.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    } else if (((TLRPC.TL_contact) this.E.get(i11)).user_id == j10) {
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
        int i3 = this.f16951r;
        if (this.E == null) {
            return;
        }
        try {
            int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
            Collections.sort(this.E, new d(hp.s1(i3), currentTime, 0));
            f();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        float f10;
        View view2;
        Context context = this.f16952s;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 7) {
                                if (i3 != 8) {
                                    if (i3 != 9) {
                                        view = new x6(context, (org.telegram.ui.Cells.f1) null);
                                    } else {
                                        View smVar = new sm(context, 4);
                                        smVar.setId(9);
                                        smVar.setTag(-33024);
                                        view2 = smVar;
                                    }
                                } else {
                                    view = new q4(context, false);
                                }
                            } else {
                                view = new n4(this.f16952s, k6.L6, 21, 14, 5, false, false, null);
                            }
                        } else {
                            FrameLayout c0Var = new ai.c0(this, context, viewGroup, 6);
                            c0Var.addView(new zp(context), mf.e(-1, -2, 17));
                            c0Var.setLayoutParams(new u4.p0(-1, -2));
                            c0Var.setTag(-33024);
                            view2 = c0Var;
                        }
                        view = view2;
                    } else {
                        View e3Var = new e3(context, null);
                        float f11 = 72.0f;
                        if (bd.f21784a0) {
                            f10 = 28.0f;
                        } else {
                            f10 = 72.0f;
                        }
                        int L = org.telegram.messenger.g0.L(f10);
                        int L2 = org.telegram.messenger.g0.L(8.0f);
                        if (!bd.f21784a0) {
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
        return new u4.d1(view);
    }
}
