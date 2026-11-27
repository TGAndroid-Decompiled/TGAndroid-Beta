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
public class vc6 extends og0 {
    public int E;
    public b5a F;
    public Location G;
    public Location H;
    public String I;
    public String J;
    public Location K;
    public final byte L;
    public final long M;
    public int N;
    public r47 O;
    public TLRPC.TL_channelLocation P;
    public ArrayList Q;
    public boolean R;
    public final boolean S;
    public final vnb T;
    public boolean U;
    public TLRPC.TL_messageMediaVenue V;
    public TLRPC.TL_messageMediaVenue W;
    public boolean X;
    public final boolean Y;
    public nc6 Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public FrameLayout d0;
    public final int x;
    public final Context y;

    public vc6(Context context, int i, long j, boolean z, vnb vnbVar, boolean z2, boolean z3, boolean z4) {
        super(z2, z4);
        this.x = yac.t0;
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
        this.T = vnbVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i == 6) {
            if (id6.f(this.x).h(this.M) == null && this.G == null) {
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
                id6.d(location, this.e ? 1 : 0, this);
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
                id6.d(location, 0, this);
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
            id6.d(location, i, this);
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
        r47 r47Var = this.O;
        if (r47Var != null) {
            if (i == 1) {
                return r47Var;
            }
            if (i > 4 && i < this.Q.size() + 5) {
                return this.Q.get(i - 5);
            }
            return null;
        }
        int i2 = 2;
        if (b == 2) {
            hd6 h = id6.f(this.x).h(this.M);
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
        long e = yac.h(this.x).e();
        for (int i = 0; i < this.Q.size(); i++) {
            if (((pc6) this.Q.get(i)).a == e || ((pc6) this.Q.get(i)).b.out) {
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
            r79 r79Var = (r79) frameLayout.getLayoutParams();
            if (r79Var == null) {
                r79Var = new r79(-1, this.E);
            } else {
                ((ViewGroup.MarginLayoutParams) r79Var).height = this.E;
            }
            this.d0.setLayoutParams(r79Var);
            this.d0.forceLayout();
        }
    }

    public final void Q() {
        R(this.F);
    }

    public final void R(b5a b5aVar) {
        String M0;
        if (b5aVar != null) {
            byte b = this.L;
            if (b == 8) {
                if (!TextUtils.isEmpty(this.I)) {
                    M0 = this.I;
                } else if (!TextUtils.isEmpty(this.J)) {
                    M0 = this.J;
                } else if (this.R) {
                    M0 = ob6.M0(2131748533, null);
                } else {
                    M0 = ob6.M0(2131743532, null);
                }
                b5aVar.b(ob6.M0(2131745239, null), M0);
                b5aVar.setHasLocation(true);
                return;
            }
            String str = "";
            if (b != 4 && this.H == null) {
                if (this.G != null) {
                    b5aVar.b(ob6.M0(2131745339, null), ob6.a0(null, null, 2131754688, ob6.G((int) this.G.getAccuracy(), "Meters", new Object[0])));
                    b5aVar.setHasLocation(true);
                    return;
                }
                String M02 = ob6.M0(2131745339, null);
                if (!this.b0) {
                    str = ob6.M0(2131748533, null);
                }
                b5aVar.b(M02, str);
                b5aVar.setHasLocation(!this.b0);
                return;
            }
            if (!TextUtils.isEmpty(this.I)) {
                str = this.I;
            } else if (!TextUtils.isEmpty(this.J)) {
                str = this.J;
            } else {
                Location location = this.H;
                if ((location == null && this.G == null) || this.R) {
                    str = ob6.M0(2131748533, null);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.H.getLongitude()));
                } else {
                    Location location2 = this.G;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.G.getLongitude()));
                    } else if (!this.b0) {
                        str = ob6.M0(2131748533, null);
                    }
                }
            }
            if (this.X) {
                b5aVar.b(ob6.M0(2131753930, null), str);
            } else if (b == 4) {
                b5aVar.b(ob6.M0(2131752176, null), str);
            } else {
                b5aVar.b(ob6.M0(2131745318, null), str);
            }
            b5aVar.setHasLocation(true);
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
                hd6 h = id6.f(this.x).h(this.M);
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
        hd6 h;
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
                        h = id6.f(this.x).h(this.M);
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
    public final void t(f89 f89Var, int i) {
        boolean z;
        long j;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 0) {
            boolean z2 = true;
            if (i2 != 1) {
                int i3 = 2;
                if (i2 != 2) {
                    if (i2 != 6) {
                        if (i2 != 7) {
                            if (i2 != 8) {
                                if (i2 == 12) {
                                    yc6 yc6Var = (yc6) view;
                                    if (this.c0) {
                                        if (i != 1 || this.W == null) {
                                            z2 = false;
                                        }
                                        yc6Var.a(null, 2, z2, false);
                                        return;
                                    } else if (i == 1) {
                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = this.V;
                                        if (this.W == null) {
                                            z2 = false;
                                        }
                                        yc6Var.a(tL_messageMediaVenue, 2, z2, this.U);
                                        return;
                                    } else {
                                        yc6Var.a(this.W, 2, false, this.U);
                                        return;
                                    }
                                }
                                return;
                            }
                            aka akaVar = (aka) view;
                            if (this.L == 6) {
                                akaVar.b(this.O, this.G, this.b0);
                                return;
                            }
                            TLRPC.TL_channelLocation tL_channelLocation = this.P;
                            long j2 = this.M;
                            if (tL_channelLocation != null) {
                                TextView textView = akaVar.f;
                                Location location = akaVar.y;
                                de0 de0Var = akaVar.c;
                                akaVar.F = yac.t0;
                                String str = tL_channelLocation.address;
                                akaVar.n = null;
                                boolean D = wf3.D(j2);
                                int i4 = akaVar.F;
                                String str2 = "";
                                if (D) {
                                    TLRPC.User X1 = uc7.s1(i4).X1(Long.valueOf(j2));
                                    if (X1 != null) {
                                        akaVar.n = new rb0(0, X1);
                                        str2 = lbc.r(X1);
                                        de0Var.f(X1, akaVar.n);
                                    }
                                } else {
                                    TLRPC.Chat M0 = uc7.s1(i4).M0(Long.valueOf(-j2));
                                    if (M0 != null) {
                                        rb0 rb0Var = new rb0(M0);
                                        akaVar.n = rb0Var;
                                        str2 = M0.title;
                                        de0Var.f(M0, rb0Var);
                                    }
                                }
                                akaVar.d.l(str2, false);
                                location.setLatitude(tL_channelLocation.geo_point.lat);
                                location.setLongitude(tL_channelLocation.geo_point._long);
                                akaVar.h = true;
                                textView.setSingleLine(true);
                                textView.setText(str);
                                return;
                            }
                            r47 r47Var = this.O;
                            if (r47Var != null) {
                                if (i == 1) {
                                    akaVar.b(r47Var, this.G, this.b0);
                                    return;
                                }
                                i3 = 5;
                            }
                            int i5 = i - i3;
                            hd6 h = id6.f(this.x).h(j2);
                            if (h != null && h.d != Integer.MAX_VALUE) {
                                i5--;
                            }
                            if (i5 >= 0 && i5 < this.Q.size()) {
                                pc6 pc6Var = (pc6) this.Q.get(i5);
                                Location location2 = this.G;
                                de0 de0Var2 = akaVar.c;
                                ema emaVar = akaVar.d;
                                Location location3 = akaVar.y;
                                akaVar.x = pc6Var;
                                boolean D2 = wf3.D(pc6Var.a);
                                int i6 = akaVar.F;
                                if (D2) {
                                    TLRPC.User X12 = uc7.s1(i6).X1(Long.valueOf(pc6Var.a));
                                    if (X12 != null) {
                                        akaVar.n.q(X12);
                                        emaVar.l(lv2.m(0, X12.first_name, X12.last_name), false);
                                        de0Var2.f(X12, akaVar.n);
                                    }
                                } else {
                                    TLRPC.Chat M02 = uc7.s1(i6).M0(Long.valueOf(-pc6Var.a));
                                    if (M02 != null) {
                                        akaVar.n.p(M02);
                                        emaVar.l(M02.title, false);
                                        de0Var2.f(M02, akaVar.n);
                                    }
                                }
                                ak5 a = pc6Var.e.a();
                                location3.setLatitude(a.a);
                                location3.setLongitude(a.b);
                                TLRPC.Message message = pc6Var.b;
                                int i7 = message.edit_date;
                                if (i7 != 0) {
                                    j = i7;
                                } else {
                                    j = message.date;
                                }
                                String D3 = ob6.D(j);
                                TextView textView2 = akaVar.f;
                                if (location2 != null) {
                                    textView2.setText(D3 + " - " + ob6.y(location3.distanceTo(location2), 0, null));
                                    return;
                                }
                                textView2.setText(D3);
                                return;
                            }
                            return;
                        }
                        b5a b5aVar = (b5a) view;
                        if (this.G == null) {
                            z2 = false;
                        }
                        b5aVar.setHasLocation(z2);
                        return;
                    }
                    b5a b5aVar2 = (b5a) view;
                    if (this.G != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    b5aVar2.setHasLocation(z);
                    int i8 = i + 1;
                    if (i8 >= b() || d(i8) != 7) {
                        z2 = false;
                    }
                    b5aVar2.y = z2;
                    b5aVar2.invalidate();
                    return;
                }
                ((mf5) view).setText(ob6.M0(2131748591, null));
                return;
            }
            b5a b5aVar3 = (b5a) view;
            b5a b5aVar4 = this.F;
            if (b5aVar4 == null || !b5aVar4.isAttachedToWindow()) {
                this.F = b5aVar3;
            }
            R(b5aVar3);
            return;
        }
        r79 r79Var = (r79) view.getLayoutParams();
        if (r79Var == null) {
            r79Var = new r79(-1, this.E);
        } else {
            ((ViewGroup.MarginLayoutParams) r79Var).height = this.E;
        }
        view.setLayoutParams(r79Var);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        jd6 jd6Var;
        Context context = this.y;
        if (i != 0) {
            vnb vnbVar = this.T;
            if (i != 1) {
                if (i != 2) {
                    long j = this.M;
                    switch (i) {
                        case 6:
                            b5a b5aVar = new b5a(vnbVar, context, true, false);
                            b5aVar.setDialogId(j);
                            view = b5aVar;
                            break;
                        case 7:
                            b5a b5aVar2 = new b5a(vnbVar, context, true, true);
                            b5aVar2.setDialogId(j);
                            view = b5aVar2;
                            break;
                        case 8:
                            byte b = this.L;
                            if (b != 4 && b != 5 && b != 3) {
                                i2 = 54;
                            } else {
                                i2 = 16;
                            }
                            jd6Var = new aka(i2, vnbVar, context, true);
                            view = jd6Var;
                            break;
                        case 9:
                            jd6 jd6Var2 = new jd6(context, vnbVar);
                            jd6Var2.setOnButtonClick(new sa5(this, (byte) 20));
                            jd6Var = jd6Var2;
                            view = jd6Var;
                            break;
                        case 10:
                            View scaVar = new sca(context, (uh9) null);
                            new zm2(new ColorDrawable(aob.v0(aob.a7, vnbVar)), aob.W0(context, 2131231233, aob.b7)).x = true;
                            view = scaVar;
                            break;
                        case 11:
                            View view2 = new View(context);
                            view2.setTag(-33024);
                            view = view2;
                            break;
                        case 12:
                            yc6 yc6Var = new yc6(context, vnbVar);
                            yc6Var.setAllowTextAnimation(true);
                            view = yc6Var;
                            break;
                        case 13:
                            view = this.Z;
                            break;
                        default:
                            view = new View(context);
                            break;
                    }
                } else {
                    view = new mf5(context, vnbVar);
                }
            } else {
                view = new b5a(vnbVar, context, false, false);
            }
        } else {
            FrameLayout frameLayout = new FrameLayout(context);
            this.d0 = frameLayout;
            frameLayout.setTag(-33024);
            this.d0.setLayoutParams(new r79(-1, this.E));
            view = frameLayout;
        }
        return new f89(view);
    }

    @Override
    public final void y(f89 f89Var) {
        if (f89Var.f == 1) {
            this.F = (b5a) f89Var.a;
            Q();
        }
    }

    public void J() {
    }
}
