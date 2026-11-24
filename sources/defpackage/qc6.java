package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public class qc6 extends oh0 {
    public int E;
    public k3a F;
    public Location G;
    public Location H;
    public String I;
    public String J;
    public Location K;
    public final byte L;
    public final long M;
    public int N;
    public k47 O;
    public TLRPC.TL_channelLocation P;
    public ArrayList Q;
    public boolean R;
    public final boolean S;
    public final ylb T;
    public boolean U;
    public TLRPC.TL_messageMediaVenue V;
    public TLRPC.TL_messageMediaVenue W;
    public boolean X;
    public final boolean Y;
    public ic6 Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public FrameLayout d0;
    public final int x;
    public final Context y;

    public qc6(Context context, int i, long j, boolean z, ylb ylbVar, boolean z2, boolean z3, boolean z4) {
        super(z2, z4);
        this.x = z8c.t0;
        this.N = -1;
        this.Q = new ArrayList();
        this.U = true;
        this.b0 = false;
        this.c0 = false;
        this.Y = z3;
        this.y = context;
        this.L = i;
        this.M = j;
        this.S = z;
        this.T = ylbVar;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i == 6) {
            if (dd6.f(this.x).h(this.M) == null && this.G == null) {
                return false;
            }
        } else if (i != 1 && i != 8 && i != 12 && i != 7) {
            return false;
        }
        return true;
    }

    public final void H() {
        Location location = this.H;
        byte b = this.L;
        if (b == 8) {
            if (location != null || (location = this.G) != null) {
                this.R = true;
                Q();
                dd6.d(location, this.e ? 1 : 0, this);
                return;
            }
            return;
        }
        int i = 0;
        if (b == 4) {
            if (location != null || (location = this.G) != null) {
                Location location2 = this.K;
                if (location2 == null || location2.distanceTo(location) > 100.0f) {
                    this.J = null;
                }
                this.R = true;
                Q();
                dd6.d(location, 0, this);
            }
        } else if (location != null) {
            Location location3 = this.K;
            if (location3 == null || location3.distanceTo(location) > 20.0f) {
                this.J = null;
            }
            this.R = true;
            Q();
            if (this.d) {
                i = 2;
            }
            dd6.d(location, i, this);
        }
    }

    public final Object I(int i) {
        byte b = this.L;
        if (b == 4) {
            if (this.J != null) {
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                tL_messageMediaVenue.address = this.J;
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaVenue.geo = tL_geoPoint;
                Location location = this.H;
                if (location != null) {
                    tL_geoPoint.lat = location.getLatitude();
                    tL_messageMediaVenue.geo._long = this.H.getLongitude();
                    return tL_messageMediaVenue;
                }
                Location location2 = this.G;
                if (location2 != null) {
                    tL_geoPoint.lat = location2.getLatitude();
                    tL_messageMediaVenue.geo._long = this.G.getLongitude();
                }
                return tL_messageMediaVenue;
            }
            return null;
        }
        k47 k47Var = this.O;
        if (k47Var != null) {
            if (i == 1) {
                return k47Var;
            }
            if (i > 4 && i < this.Q.size() + 5) {
                return this.Q.get(i - 5);
            }
            return null;
        }
        int i2 = 2;
        if (b == 2) {
            cd6 h = dd6.f(this.x).h(this.M);
            if (h != null && h.d != Integer.MAX_VALUE) {
                i2 = 3;
            }
            if (i >= i2) {
                return this.Q.get(i - i2);
            }
            return null;
        }
        return null;
    }

    public final void K(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        boolean z;
        boolean z2 = false;
        this.R = false;
        this.K = location;
        byte b = this.L;
        if (b == 8) {
            this.J = str2;
        } else {
            this.J = str;
        }
        if (b == 7 && this.c0) {
            this.V = null;
            this.W = null;
        }
        if (this.W != null) {
            z = true;
        } else {
            z = false;
        }
        if (b == 7) {
            this.V = tL_messageMediaVenue;
            this.W = tL_messageMediaVenue2;
            if (tL_messageMediaVenue2 == null) {
                z2 = true;
            }
            if (z == z2) {
                g(1);
                if (this.W == null) {
                    s(2);
                    return;
                } else {
                    i(2);
                    return;
                }
            }
            l(1, 2);
            return;
        }
        Q();
    }

    public final void L(Location location) {
        this.H = location;
        H();
        Q();
    }

    public final void M(Location location) {
        boolean z;
        int i;
        if (this.G == null) {
            z = true;
        } else {
            z = false;
        }
        this.G = location;
        if (this.H == null) {
            H();
        }
        if (z && (i = this.N) > 0) {
            g(i);
        }
        if (this.O != null) {
            h(1, new Object());
            if (!this.Q.isEmpty()) {
                n(2, this.Q.size(), new Object());
            }
        } else if (this.L != 2) {
            Q();
        } else if (!this.Q.isEmpty()) {
            n(2, this.Q.size(), new Object());
        }
    }

    public void N(ArrayList arrayList) {
        this.Q = new ArrayList(arrayList);
        long e = z8c.h(this.x).e();
        for (int i = 0; i < this.Q.size(); i++) {
            if (((kc6) this.Q.get(i)).a == e || ((kc6) this.Q.get(i)).b.out) {
                this.Q.remove(i);
                break;
            }
        }
        f();
    }

    public final void O(boolean z, boolean z2) {
        if (this.b0 == z && this.c0 == z2) {
            return;
        }
        this.b0 = z;
        this.c0 = z2;
        if (z2) {
            this.V = null;
            this.W = null;
        }
        f();
    }

    public final void P(int i) {
        this.E = i;
        FrameLayout frameLayout = this.d0;
        if (frameLayout != null) {
            g69 g69Var = (g69) frameLayout.getLayoutParams();
            if (g69Var == null) {
                g69Var = new g69(-1, this.E);
            } else {
                ((ViewGroup.MarginLayoutParams) g69Var).height = this.E;
            }
            this.d0.setLayoutParams(g69Var);
            this.d0.forceLayout();
        }
    }

    public final void Q() {
        R(this.F);
    }

    public final void R(k3a k3aVar) {
        String M0;
        if (k3aVar != null) {
            byte b = this.L;
            if (b == 8) {
                if (!TextUtils.isEmpty(this.I)) {
                    M0 = this.I;
                } else if (!TextUtils.isEmpty(this.J)) {
                    M0 = this.J;
                } else if (this.R) {
                    M0 = jb6.M0(2131748536, null);
                } else {
                    M0 = jb6.M0(2131743564, null);
                }
                k3aVar.b(jb6.M0(2131745245, null), M0);
                k3aVar.setHasLocation(true);
                return;
            }
            String str = "";
            if (b != 4 && this.H == null) {
                if (this.G != null) {
                    k3aVar.b(jb6.M0(2131745345, null), jb6.a0(null, null, 2131754692, jb6.G((int) this.G.getAccuracy(), "Meters", new Object[0])));
                    k3aVar.setHasLocation(true);
                    return;
                }
                String M02 = jb6.M0(2131745345, null);
                if (!this.b0) {
                    str = jb6.M0(2131748536, null);
                }
                k3aVar.b(M02, str);
                k3aVar.setHasLocation(!this.b0);
                return;
            }
            if (!TextUtils.isEmpty(this.I)) {
                str = this.I;
            } else if (!TextUtils.isEmpty(this.J)) {
                str = this.J;
            } else {
                Location location = this.H;
                if ((location == null && this.G == null) || this.R) {
                    str = jb6.M0(2131748536, null);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.H.getLongitude()));
                } else {
                    Location location2 = this.G;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.G.getLongitude()));
                    } else if (!this.b0) {
                        str = jb6.M0(2131748536, null);
                    }
                }
            }
            if (this.X) {
                k3aVar.b(jb6.M0(2131753902, null), str);
            } else if (b == 4) {
                k3aVar.b(jb6.M0(2131752148, null), str);
            } else {
                k3aVar.b(jb6.M0(2131745324, null), str);
            }
            k3aVar.setHasLocation(true);
        }
    }

    @Override
    public final int b() {
        int i = 2;
        byte b = this.L;
        if (b != 6 && b != 5 && b != 4 && !this.e) {
            boolean z = this.S;
            int i2 = 0;
            if (b == 7) {
                if (this.W != null) {
                    i2 = 1;
                }
                i = i2 + 2 + (z ? 1 : 0);
            } else if (this.O != null) {
                if (this.Q.isEmpty()) {
                    if (!this.Y) {
                        i2 = 1;
                    }
                } else {
                    i2 = this.Q.size() + 3;
                }
                i = 2 + i2;
            } else if (b == 2) {
                cd6 h = dd6.f(this.x).h(this.M);
                int size = this.Q.size() + 2;
                if (h != null && h.d != Integer.MAX_VALUE) {
                    i2 = 1;
                }
                i = size + i2;
            } else {
                if (b == 1) {
                    i = 3;
                }
                i += z ? 1 : 0;
            }
        }
        if (this.Z != null && this.a0) {
            return i + 1;
        }
        return i;
    }

    @Override
    public final int d(int i) {
        cd6 h;
        if (i == b() - 1 && this.Z != null && this.a0) {
            return 13;
        }
        if (i == 0) {
            return 0;
        }
        byte b = this.L;
        if (b != 6) {
            if (this.S && i == b() - 1) {
                return 11;
            }
            if (b != 5) {
                if (b != 4) {
                    if (b != 2 && b != 1) {
                        h = null;
                    } else {
                        h = dd6.f(this.x).h(this.M);
                    }
                    if (this.O != null) {
                        if (this.Q.isEmpty()) {
                            if (i == 2) {
                                return 9;
                            }
                            return 8;
                        } else if (i == 2) {
                            return 10;
                        } else {
                            if (i == 3) {
                                return 2;
                            }
                            if (i == 4) {
                                this.N = i;
                                return 6;
                            }
                            return 8;
                        }
                    } else if (b == 2) {
                        if (i != 2 || h == null || h.d == Integer.MAX_VALUE) {
                            if (i == 1) {
                                if (h == null || h.d != Integer.MAX_VALUE) {
                                    this.N = i;
                                    return 6;
                                }
                            } else {
                                return 8;
                            }
                        }
                        return 7;
                    } else if (b == 1 && i == 2) {
                        if (h != null) {
                            this.N = -1;
                            return 7;
                        }
                        this.N = i;
                        return 6;
                    } else if (b == 7) {
                        return 12;
                    }
                }
                return 1;
            }
            return 8;
        }
        return 8;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        long j;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 0) {
            boolean z2 = true;
            if (i2 != 1) {
                int i3 = 2;
                if (i2 != 2) {
                    if (i2 != 6) {
                        if (i2 != 7) {
                            if (i2 != 8) {
                                if (i2 == 12) {
                                    tc6 tc6Var = (tc6) view;
                                    if (this.c0) {
                                        if (i != 1 || this.W == null) {
                                            z2 = false;
                                        }
                                        tc6Var.a(null, 2, z2, false);
                                        return;
                                    } else if (i == 1) {
                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = this.V;
                                        if (this.W == null) {
                                            z2 = false;
                                        }
                                        tc6Var.a(tL_messageMediaVenue, 2, z2, this.U);
                                        return;
                                    } else {
                                        tc6Var.a(this.W, 2, false, this.U);
                                        return;
                                    }
                                }
                                return;
                            }
                            jia jiaVar = (jia) view;
                            if (this.L == 6) {
                                jiaVar.b(this.O, this.G, this.b0);
                                return;
                            }
                            TLRPC.TL_channelLocation tL_channelLocation = this.P;
                            long j2 = this.M;
                            if (tL_channelLocation != null) {
                                TextView textView = jiaVar.f;
                                Location location = jiaVar.y;
                                bf0 bf0Var = jiaVar.c;
                                jiaVar.F = z8c.t0;
                                String str = tL_channelLocation.address;
                                jiaVar.n = null;
                                boolean D = pg3.D(j2);
                                int i4 = jiaVar.F;
                                String str2 = "";
                                if (D) {
                                    TLRPC.User W1 = oc7.r1(i4).W1(Long.valueOf(j2));
                                    if (W1 != null) {
                                        jiaVar.n = new pc0(0, W1);
                                        str2 = m9c.r(W1);
                                        bf0Var.f(W1, jiaVar.n);
                                    }
                                } else {
                                    TLRPC.Chat L0 = oc7.r1(i4).L0(Long.valueOf(-j2));
                                    if (L0 != null) {
                                        pc0 pc0Var = new pc0(L0);
                                        jiaVar.n = pc0Var;
                                        str2 = L0.title;
                                        bf0Var.f(L0, pc0Var);
                                    }
                                }
                                jiaVar.d.l(str2, false);
                                location.setLatitude(tL_channelLocation.geo_point.lat);
                                location.setLongitude(tL_channelLocation.geo_point._long);
                                jiaVar.h = true;
                                textView.setSingleLine(true);
                                textView.setText(str);
                                return;
                            }
                            k47 k47Var = this.O;
                            if (k47Var != null) {
                                if (i == 1) {
                                    jiaVar.b(k47Var, this.G, this.b0);
                                    return;
                                }
                                i3 = 5;
                            }
                            int i5 = i - i3;
                            cd6 h = dd6.f(this.x).h(j2);
                            if (h != null && h.d != Integer.MAX_VALUE) {
                                i5--;
                            }
                            if (i5 >= 0 && i5 < this.Q.size()) {
                                kc6 kc6Var = (kc6) this.Q.get(i5);
                                Location location2 = this.G;
                                bf0 bf0Var2 = jiaVar.c;
                                lka lkaVar = jiaVar.d;
                                Location location3 = jiaVar.y;
                                jiaVar.x = kc6Var;
                                boolean D2 = pg3.D(kc6Var.a);
                                int i6 = jiaVar.F;
                                if (D2) {
                                    TLRPC.User W12 = oc7.r1(i6).W1(Long.valueOf(kc6Var.a));
                                    if (W12 != null) {
                                        jiaVar.n.q(W12);
                                        lkaVar.l(bw2.m(0, W12.first_name, W12.last_name), false);
                                        bf0Var2.f(W12, jiaVar.n);
                                    }
                                } else {
                                    TLRPC.Chat L02 = oc7.r1(i6).L0(Long.valueOf(-kc6Var.a));
                                    if (L02 != null) {
                                        jiaVar.n.p(L02);
                                        lkaVar.l(L02.title, false);
                                        bf0Var2.f(L02, jiaVar.n);
                                    }
                                }
                                xj5 a = kc6Var.e.a();
                                location3.setLatitude(a.a);
                                location3.setLongitude(a.b);
                                TLRPC.Message message = kc6Var.b;
                                int i7 = message.edit_date;
                                if (i7 != 0) {
                                    j = i7;
                                } else {
                                    j = message.date;
                                }
                                String D3 = jb6.D(j);
                                TextView textView2 = jiaVar.f;
                                if (location2 != null) {
                                    textView2.setText(D3 + " - " + jb6.y(location3.distanceTo(location2), 0, null));
                                    return;
                                }
                                textView2.setText(D3);
                                return;
                            }
                            return;
                        }
                        k3a k3aVar = (k3a) view;
                        if (this.G == null) {
                            z2 = false;
                        }
                        k3aVar.setHasLocation(z2);
                        return;
                    }
                    k3a k3aVar2 = (k3a) view;
                    if (this.G != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    k3aVar2.setHasLocation(z);
                    int i8 = i + 1;
                    if (i8 >= b() || d(i8) != 7) {
                        z2 = false;
                    }
                    k3aVar2.y = z2;
                    k3aVar2.invalidate();
                    return;
                }
                ((jf5) view).setText(jb6.M0(2131748594, null));
                return;
            }
            k3a k3aVar3 = (k3a) view;
            k3a k3aVar4 = this.F;
            if (k3aVar4 == null || !k3aVar4.isAttachedToWindow()) {
                this.F = k3aVar3;
            }
            R(k3aVar3);
            return;
        }
        g69 g69Var = (g69) view.getLayoutParams();
        if (g69Var == null) {
            g69Var = new g69(-1, this.E);
        } else {
            ((ViewGroup.MarginLayoutParams) g69Var).height = this.E;
        }
        view.setLayoutParams(g69Var);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        ed6 ed6Var;
        Context context = this.y;
        if (i != 0) {
            ylb ylbVar = this.T;
            if (i != 1) {
                if (i != 2) {
                    long j = this.M;
                    switch (i) {
                        case 6:
                            k3a k3aVar = new k3a(ylbVar, context, true, false);
                            k3aVar.setDialogId(j);
                            view = k3aVar;
                            break;
                        case 7:
                            k3a k3aVar2 = new k3a(ylbVar, context, true, true);
                            k3aVar2.setDialogId(j);
                            view = k3aVar2;
                            break;
                        case 8:
                            byte b = this.L;
                            if (b != 4 && b != 5 && b != 3) {
                                i2 = 54;
                            } else {
                                i2 = 16;
                            }
                            ed6Var = new jia(i2, ylbVar, context, true);
                            view = ed6Var;
                            break;
                        case 9:
                            ed6 ed6Var2 = new ed6(context, ylbVar);
                            ed6Var2.setOnButtonClick(new ca5(this, (byte) 22));
                            ed6Var = ed6Var2;
                            view = ed6Var;
                            break;
                        case 10:
                            View bbaVar = new bba(context, (hg9) null);
                            new sn2(new ColorDrawable(cmb.v0(cmb.Z6, ylbVar)), cmb.W0(context, 2131231234, cmb.a7)).x = true;
                            view = bbaVar;
                            break;
                        case 11:
                            View view2 = new View(context);
                            view2.setTag(-33024);
                            view = view2;
                            break;
                        case 12:
                            tc6 tc6Var = new tc6(context, ylbVar);
                            tc6Var.setAllowTextAnimation(true);
                            view = tc6Var;
                            break;
                        case 13:
                            view = this.Z;
                            break;
                        default:
                            view = new View(context);
                            break;
                    }
                } else {
                    view = new jf5(context, ylbVar);
                }
            } else {
                view = new k3a(ylbVar, context, false, false);
            }
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            this.d0 = frameLayout;
            frameLayout.setTag(-33024);
            this.d0.setLayoutParams(new g69(-1, this.E));
            view = frameLayout;
        }
        return new u69(view);
    }

    @Override
    public final void y(u69 u69Var) {
        if (u69Var.f == 1) {
            this.F = (k3a) u69Var.a;
            Q();
        }
    }

    public void J() {
    }
}
