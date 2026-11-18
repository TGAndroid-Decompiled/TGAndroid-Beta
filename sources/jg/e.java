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
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.xj0;
public abstract class e extends xj0 {
    public ArrayList E;
    public final boolean F;
    public int G;
    public final boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public float N;
    public final Context f17441s;
    public final int f17442w;
    public final boolean f17443x;
    public final a0.h f17444y;
    public final int f17440r = j10.f24770t0;
    public float M = 1.0f;
    public final ArrayList O = new ArrayList();

    public e(Context context, int i7, boolean z10, a0.h hVar, int i10) {
        boolean z11;
        this.f17441s = context;
        this.f17442w = i7;
        this.f17443x = z10;
        this.f17444y = hVar;
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
            int i10 = this.f17440r;
            int i11 = this.f17442w;
            i5 r10 = i5.r(i10);
            if (i11 == 2) {
                arrayList = r10.f24572k0;
            } else {
                arrayList = r10.f24570i0;
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
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
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
        int i12 = this.f17440r;
        if (z10 && i7 == 1 && i10 > 1 && i10 - 2 < i5.r(i12).f24560b0.size()) {
            return i5.r(i12).f24560b0.get(i11);
        }
        if (P(i7, i10) == 2) {
            return "Header";
        }
        int i13 = this.f17442w;
        i5 r10 = i5.r(i12);
        if (i13 == 2) {
            hashMap = r10.f24571j0;
        } else {
            hashMap = r10.f24569h0;
        }
        i5 r11 = i5.r(i12);
        if (i13 == 2) {
            arrayList = r11.f24572k0;
        } else {
            arrayList = r11.f24570i0;
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
            if (!this.f17443x || i10 < 0 || i10 >= i5.r(i12).f24560b0.size()) {
                return null;
            }
            return i5.r(i12).f24560b0.get(i10);
        }
    }

    @Override
    public final int P(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: jg.e.P(int, int):int");
    }

    @Override
    public final View T(int i7, View view) {
        ArrayList arrayList;
        int i10 = this.f17440r;
        int i11 = this.f17442w;
        i5.r(i10);
        i5 r10 = i5.r(i10);
        if (i11 == 2) {
            arrayList = r10.f24572k0;
        } else {
            arrayList = r10.f24570i0;
        }
        View view2 = view;
        if (view == null) {
            ?? frameLayout = new FrameLayout(this.f17441s);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(org.telegram.messenger.g0.L(76.0f), org.telegram.messenger.g0.L(64.0f)));
            TextView textView = new TextView(frameLayout.getContext());
            frameLayout.f31830a = textView;
            i5.c.x(textView, 1, 22.0f);
            u6.U(textView, n6.B6, null);
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
            int i11 = this.f17442w;
            int i12 = this.f17440r;
            i5 r10 = i5.r(i12);
            if (i11 == 2) {
                hashMap = r10.f24571j0;
            } else {
                hashMap = r10.f24569h0;
            }
            i5 r11 = i5.r(i12);
            if (i11 == 2) {
                arrayList = r11.f24572k0;
            } else {
                arrayList = r11.f24570i0;
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
                } else if (this.f17443x) {
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
        int i12 = f1Var.f59127f;
        View view = f1Var.f59123a;
        int i13 = 7;
        boolean z10 = this.F;
        int i14 = this.f17440r;
        boolean z11 = true;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 4) {
                        if (i12 != 7) {
                            if (i12 == 8) {
                                r4 r4Var = (r4) view;
                                int i15 = i10 - 2;
                                if (i15 >= 0 && i15 < i5.r(i14).f24560b0.size()) {
                                    r4Var.a((f5) i5.r(i14).f24560b0.get(i15), null);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        o4 o4Var = (o4) view;
                        if (this.L && i10 == 1 && i7 == 1) {
                            o4Var.setText(gd.M0(2131748959, null));
                            return;
                        } else if (this.G == 1) {
                            o4Var.setText(gd.M0(2131745089, null));
                            return;
                        } else {
                            o4Var.setText(gd.M0(2131745090, null));
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
                    y3Var.setText(gd.M0(2131751769, null));
                    return;
                } else if (i16 == 1) {
                    y3Var.setText(gd.M0(2131745089, null));
                    return;
                } else {
                    y3Var.setText(gd.M0(2131745090, null));
                    return;
                }
            }
            n8 n8Var = (n8) view;
            boolean z12 = this.f17443x;
            if (!z12 && z10) {
                int i17 = n6.Zl;
                n8Var.g(i17, i17);
            } else {
                int i18 = n6.G6;
                n8Var.g(i18, i18);
            }
            if (i7 == 0) {
                if (z12) {
                    if (i10 == 0) {
                        n8Var.r(gd.M0(2131748959, null), "", false, 2131232713, -14899731, -15431455, false);
                        return;
                    } else if (i10 == 1) {
                        n8Var.r(gd.M0(2131746174, null), "", false, 2131232702, -11154873, -14175180, false);
                        return;
                    } else {
                        return;
                    }
                } else if (z10) {
                    if (this.H) {
                        n8Var.o(2131232206, gd.M0(2131752391, null), false);
                        return;
                    } else {
                        n8Var.o(2131232206, gd.M0(2131748918, null), false);
                        return;
                    }
                } else if (i10 == 0) {
                    n8Var.r(gd.M0(2131748081, null), "", false, 2131232712, -14899731, -15431455, false);
                    return;
                } else if (i10 == 1) {
                    n8Var.r(gd.M0(2131748094, null), "", false, 2131232703, -11154873, -14175180, false);
                    return;
                } else {
                    return;
                }
            }
            f5 f5Var = (f5) i5.r(i14).f24560b0.get(i10);
            String str = f5Var.f23843i;
            if (str != null && f5Var.f23844j != null) {
                n8Var.k(f5Var.f23843i + " " + f5Var.f23844j, false);
                return;
            } else if (str != null && f5Var.f23844j == null) {
                n8Var.k(str, false);
                return;
            } else {
                n8Var.k(f5Var.f23844j, false);
                return;
            }
        }
        ra raVar = (ra) view;
        raVar.U.f11889a = false;
        if (this.G != 2 && !this.I) {
            i13 = 58;
        }
        raVar.b(i13, 1);
        if (this.G == 2) {
            arrayList2 = this.E;
        } else {
            int i19 = this.f17442w;
            i5 r10 = i5.r(i14);
            if (i19 == 2) {
                hashMap = r10.f24571j0;
            } else {
                hashMap = r10.f24569h0;
            }
            if (i19 == 2) {
                arrayList = i5.r(i14).f24572k0;
            } else {
                arrayList = i5.r(i14).f24570i0;
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
        if (this.f17444y.h(c22.f28552id) < 0) {
            z11 = false;
        }
        raVar.c(z11, false);
    }

    public final void Y(int i7, boolean z10) {
        this.G = i7;
        if (i7 == 2) {
            if (this.E == null || z10) {
                int i10 = this.f17440r;
                this.E = new ArrayList(i5.r(i10).f24567f0);
                long j3 = j10.i(i10).f24789n;
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
        int i7 = this.f17440r;
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
        Context context = this.f17441s;
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
                                        View jnVar = new jn(context, 2);
                                        jnVar.setId(9);
                                        jnVar.setTag(-33024);
                                        view2 = jnVar;
                                    }
                                } else {
                                    view = new r4(context, false);
                                }
                            } else {
                                view = new o4(this.f17441s, n6.L6, 21, 14, 5, false, false, null);
                            }
                        } else {
                            FrameLayout k0Var = new ai.k0(this, context, viewGroup, 8);
                            k0Var.addView(new nq(context), ma.e(-1, -2, 17));
                            k0Var.setLayoutParams(new v4.q0(-1, -2));
                            k0Var.setTag(-33024);
                            view2 = k0Var;
                        }
                        view = view2;
                    } else {
                        View f3Var = new f3(context, null);
                        float f11 = 72.0f;
                        if (gd.f24213a0) {
                            f10 = 28.0f;
                        } else {
                            f10 = 72.0f;
                        }
                        int L = org.telegram.messenger.g0.L(f10);
                        int L2 = org.telegram.messenger.g0.L(8.0f);
                        if (!gd.f24213a0) {
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
