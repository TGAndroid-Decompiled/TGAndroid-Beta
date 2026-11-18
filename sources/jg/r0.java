package jg;

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
import org.telegram.messenger.ab;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.messenger.pd;
import org.telegram.messenger.qd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.q6;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.q9;
import org.telegram.ui.ja0;
import org.telegram.ui.la0;
public class r0 extends c {
    public int E;
    public q6 F;
    public Location G;
    public Location H;
    public String I;
    public String J;
    public Location K;
    public final int L;
    public final long M;
    public int N;
    public fj O;
    public TLRPC.TL_channelLocation P;
    public ArrayList Q;
    public boolean R;
    public final boolean S;
    public final i6 T;
    public boolean U;
    public TLRPC.TL_messageMediaVenue V;
    public TLRPC.TL_messageMediaVenue W;
    public boolean X;
    public final boolean Y;
    public ja0 Z;
    public boolean f17642a0;
    public boolean f17643b0;
    public boolean f17644c0;
    public FrameLayout f17645d0;
    public final int f17646x;
    public final Context f17647y;

    public r0(Context context, int i7, long j3, boolean z10, i6 i6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.f17646x = j10.f24773t0;
        this.N = -1;
        this.Q = new ArrayList();
        this.U = true;
        this.f17643b0 = false;
        this.f17644c0 = false;
        this.Y = z12;
        this.f17647y = context;
        this.L = i7;
        this.M = j3;
        this.S = z10;
        this.T = i6Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 == 6) {
            if (qd.f(this.f17646x).h(this.M) == null && this.G == null) {
                return false;
            }
        } else if (i7 != 1 && i7 != 8 && i7 != 12 && i7 != 7) {
            return false;
        }
        return true;
    }

    public final void H() {
        int i7 = this.L;
        if (i7 == 8) {
            Location location = this.H;
            if (location != null || (location = this.G) != null) {
                this.R = true;
                Q();
                qd.d(location, this.f17408e ? 1 : 0, this);
                return;
            }
            return;
        }
        int i10 = 0;
        if (i7 == 4) {
            Location location2 = this.H;
            if (location2 != null || (location2 = this.G) != null) {
                Location location3 = this.K;
                if (location3 == null || location3.distanceTo(location2) > 100.0f) {
                    this.J = null;
                }
                this.R = true;
                Q();
                qd.d(location2, 0, this);
                return;
            }
            return;
        }
        Location location4 = this.H;
        if (location4 != null) {
            Location location5 = this.K;
            if (location5 == null || location5.distanceTo(location4) > 20.0f) {
                this.J = null;
            }
            this.R = true;
            Q();
            if (this.d) {
                i10 = 2;
            }
            qd.d(location4, i10, this);
        }
    }

    public final Object I(int i7) {
        int i10 = this.L;
        if (i10 == 4) {
            if (this.J == null) {
                return null;
            }
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
        fj fjVar = this.O;
        if (fjVar != null) {
            if (i7 == 1) {
                return fjVar;
            }
            if (i7 > 4 && i7 < this.Q.size() + 5) {
                return this.Q.get(i7 - 5);
            }
        } else {
            int i11 = 2;
            if (i10 == 2) {
                pd h = qd.f(this.f17646x).h(this.M);
                if (h != null && h.d != Integer.MAX_VALUE) {
                    i11 = 3;
                }
                if (i7 >= i11) {
                    return this.Q.get(i7 - i11);
                }
            }
        }
        return null;
    }

    public final void K(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        boolean z10;
        boolean z11 = false;
        this.R = false;
        this.K = location;
        int i7 = this.L;
        if (i7 == 8) {
            this.J = str2;
        } else {
            this.J = str;
        }
        if (i7 == 7 && this.f17644c0) {
            this.V = null;
            this.W = null;
        }
        if (this.W != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i7 == 7) {
            this.V = tL_messageMediaVenue;
            this.W = tL_messageMediaVenue2;
            if (tL_messageMediaVenue2 == null) {
                z11 = true;
            }
            if (z10 == z11) {
                g(1);
                if (this.W == null) {
                    s(2);
                    return;
                } else {
                    i(2);
                    return;
                }
            }
            k(1, 2);
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
        boolean z10;
        int i7;
        if (this.G == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = location;
        if (this.H == null) {
            H();
        }
        if (z10 && (i7 = this.N) > 0) {
            g(i7);
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
        long e10 = j10.i(this.f17646x).e();
        for (int i7 = 0; i7 < this.Q.size(); i7++) {
            if (((la0) this.Q.get(i7)).f49520a == e10 || ((la0) this.Q.get(i7)).f49521b.out) {
                this.Q.remove(i7);
                break;
            }
        }
        f();
    }

    public final void O(boolean z10, boolean z11) {
        if (this.f17643b0 == z10 && this.f17644c0 == z11) {
            return;
        }
        this.f17643b0 = z10;
        this.f17644c0 = z11;
        if (z11) {
            this.V = null;
            this.W = null;
        }
        f();
    }

    public final void P(int i7) {
        this.E = i7;
        FrameLayout frameLayout = this.f17645d0;
        if (frameLayout != null) {
            v4.q0 q0Var = (v4.q0) frameLayout.getLayoutParams();
            if (q0Var == null) {
                q0Var = new v4.q0(-1, this.E);
            } else {
                ((ViewGroup.MarginLayoutParams) q0Var).height = this.E;
            }
            this.f17645d0.setLayoutParams(q0Var);
            this.f17645d0.forceLayout();
        }
    }

    public final void Q() {
        R(this.F);
    }

    public final void R(q6 q6Var) {
        String M0;
        if (q6Var != null) {
            int i7 = this.L;
            if (i7 == 8) {
                if (!TextUtils.isEmpty(this.I)) {
                    M0 = this.I;
                } else if (!TextUtils.isEmpty(this.J)) {
                    M0 = this.J;
                } else if (this.R) {
                    M0 = gd.M0(2131748587, null);
                } else {
                    M0 = gd.M0(2131743640, null);
                }
                q6Var.b(gd.M0(2131745316, null), M0);
                q6Var.setHasLocation(true);
                return;
            }
            String str = "";
            if (i7 != 4 && this.H == null) {
                if (this.G != null) {
                    q6Var.b(gd.M0(2131745416, null), gd.a0(null, null, 2131754693, gd.G((int) this.G.getAccuracy(), "Meters", new Object[0])));
                    q6Var.setHasLocation(true);
                    return;
                }
                String M02 = gd.M0(2131745416, null);
                if (!this.f17643b0) {
                    str = gd.M0(2131748587, null);
                }
                q6Var.b(M02, str);
                q6Var.setHasLocation(!this.f17643b0);
                return;
            }
            if (!TextUtils.isEmpty(this.I)) {
                str = this.I;
            } else if (!TextUtils.isEmpty(this.J)) {
                str = this.J;
            } else {
                Location location = this.H;
                if ((location == null && this.G == null) || this.R) {
                    str = gd.M0(2131748587, null);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.H.getLongitude()));
                } else {
                    Location location2 = this.G;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.G.getLongitude()));
                    } else if (!this.f17643b0) {
                        str = gd.M0(2131748587, null);
                    }
                }
            }
            if (this.X) {
                q6Var.b(gd.M0(2131753935, null), str);
            } else if (i7 == 4) {
                q6Var.b(gd.M0(2131752200, null), str);
            } else {
                q6Var.b(gd.M0(2131745395, null), str);
            }
            q6Var.setHasLocation(true);
        }
    }

    @Override
    public final int b() {
        int i7 = 2;
        int i10 = this.L;
        if (i10 != 6 && i10 != 5 && i10 != 4 && !this.f17408e) {
            boolean z10 = this.S;
            int i11 = 0;
            if (i10 == 7) {
                if (this.W != null) {
                    i11 = 1;
                }
                i7 = i11 + 2 + (z10 ? 1 : 0);
            } else if (this.O != null) {
                if (this.Q.isEmpty()) {
                    if (!this.Y) {
                        i11 = 1;
                    }
                } else {
                    i11 = this.Q.size() + 3;
                }
                i7 = 2 + i11;
            } else if (i10 == 2) {
                pd h = qd.f(this.f17646x).h(this.M);
                int size = this.Q.size() + 2;
                if (h != null && h.d != Integer.MAX_VALUE) {
                    i11 = 1;
                }
                i7 = size + i11;
            } else {
                if (i10 == 1) {
                    i7 = 3;
                }
                i7 += z10 ? 1 : 0;
            }
        }
        if (this.Z != null && this.f17642a0) {
            return i7 + 1;
        }
        return i7;
    }

    @Override
    public final int d(int i7) {
        pd h;
        if (i7 == b() - 1 && this.Z != null && this.f17642a0) {
            return 13;
        }
        if (i7 == 0) {
            return 0;
        }
        int i10 = this.L;
        if (i10 != 6) {
            if (this.S && i7 == b() - 1) {
                return 11;
            }
            if (i10 != 5) {
                if (i10 != 4) {
                    if (i10 != 2 && i10 != 1) {
                        h = null;
                    } else {
                        h = qd.f(this.f17646x).h(this.M);
                    }
                    if (this.O != null) {
                        if (this.Q.isEmpty()) {
                            if (i7 == 2) {
                                return 9;
                            }
                            return 8;
                        } else if (i7 == 2) {
                            return 10;
                        } else {
                            if (i7 == 3) {
                                return 2;
                            }
                            if (i7 == 4) {
                                this.N = i7;
                                return 6;
                            }
                            return 8;
                        }
                    } else if (i10 == 2) {
                        if (i7 != 2 || h == null || h.d == Integer.MAX_VALUE) {
                            if (i7 == 1) {
                                if (h == null || h.d != Integer.MAX_VALUE) {
                                    this.N = i7;
                                    return 6;
                                }
                            } else {
                                return 8;
                            }
                        }
                        return 7;
                    } else if (i10 == 1 && i7 == 2) {
                        if (h != null) {
                            this.N = -1;
                            return 7;
                        }
                        this.N = i7;
                        return 6;
                    } else if (i10 == 7) {
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
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        long j3;
        int i10 = f1Var.f59126f;
        View view = f1Var.f59122a;
        if (i10 != 0) {
            boolean z11 = true;
            if (i10 != 1) {
                int i11 = 2;
                if (i10 != 2) {
                    if (i10 != 6) {
                        if (i10 != 7) {
                            if (i10 != 8) {
                                if (i10 == 12) {
                                    v4 v4Var = (v4) view;
                                    if (this.f17644c0) {
                                        if (i7 != 1 || this.W == null) {
                                            z11 = false;
                                        }
                                        v4Var.a(null, 2, z11, false);
                                        return;
                                    } else if (i7 == 1) {
                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = this.V;
                                        if (this.W == null) {
                                            z11 = false;
                                        }
                                        v4Var.a(tL_messageMediaVenue, 2, z11, this.U);
                                        return;
                                    } else {
                                        v4Var.a(this.W, 2, false, this.U);
                                        return;
                                    }
                                }
                                return;
                            }
                            r7 r7Var = (r7) view;
                            if (this.L == 6) {
                                r7Var.b(this.O, this.G, this.f17643b0);
                                return;
                            }
                            TLRPC.TL_channelLocation tL_channelLocation = this.P;
                            long j10 = this.M;
                            if (tL_channelLocation != null) {
                                TextView textView = r7Var.f31720f;
                                Location location = r7Var.f31726y;
                                q9 q9Var = r7Var.f31718c;
                                r7Var.F = j10.f24773t0;
                                String str = tL_channelLocation.address;
                                r7Var.f31721n = null;
                                String str2 = "";
                                if (n5.E(j10)) {
                                    TLRPC.User c22 = mp.u1(r7Var.F).c2(Long.valueOf(j10));
                                    if (c22 != null) {
                                        r7Var.f31721n = new b9(0, c22);
                                        str2 = o10.q(c22);
                                        q9Var.f(c22, r7Var.f31721n);
                                    }
                                } else {
                                    TLRPC.Chat O0 = mp.u1(r7Var.F).O0(Long.valueOf(-j10));
                                    if (O0 != null) {
                                        b9 b9Var = new b9(O0);
                                        r7Var.f31721n = b9Var;
                                        str2 = O0.title;
                                        q9Var.f(O0, b9Var);
                                    }
                                }
                                r7Var.d.l(str2, false);
                                location.setLatitude(tL_channelLocation.geo_point.lat);
                                location.setLongitude(tL_channelLocation.geo_point._long);
                                r7Var.h = true;
                                textView.setSingleLine(true);
                                textView.setText(str);
                                return;
                            }
                            fj fjVar = this.O;
                            if (fjVar != null && i7 == 1) {
                                r7Var.b(fjVar, this.G, this.f17643b0);
                                return;
                            }
                            if (fjVar != null) {
                                i11 = 5;
                            }
                            int i12 = i7 - i11;
                            pd h = qd.f(this.f17646x).h(j10);
                            if (h != null && h.d != Integer.MAX_VALUE) {
                                i12--;
                            }
                            if (i12 >= 0 && i12 < this.Q.size()) {
                                la0 la0Var = (la0) this.Q.get(i12);
                                Location location2 = this.G;
                                TextView textView2 = r7Var.f31720f;
                                q9 q9Var2 = r7Var.f31718c;
                                org.telegram.ui.ActionBar.n5 n5Var = r7Var.d;
                                Location location3 = r7Var.f31726y;
                                r7Var.f31725x = la0Var;
                                if (n5.E(la0Var.f49520a)) {
                                    TLRPC.User c23 = mp.u1(r7Var.F).c2(Long.valueOf(la0Var.f49520a));
                                    if (c23 != null) {
                                        r7Var.f31721n.r(c23);
                                        n5Var.l(i5.m(0, c23.first_name, c23.last_name), false);
                                        q9Var2.f(c23, r7Var.f31721n);
                                    }
                                } else {
                                    TLRPC.Chat O02 = mp.u1(r7Var.F).O0(Long.valueOf(-la0Var.f49520a));
                                    if (O02 != null) {
                                        r7Var.f31721n.q(O02);
                                        n5Var.l(O02.title, false);
                                        q9Var2.f(O02, r7Var.f31721n);
                                    }
                                }
                                ab a10 = la0Var.f49523e.a();
                                location3.setLatitude(a10.f22854a);
                                location3.setLongitude(a10.f22855b);
                                TLRPC.Message message = la0Var.f49521b;
                                int i13 = message.edit_date;
                                if (i13 != 0) {
                                    j3 = i13;
                                } else {
                                    j3 = message.date;
                                }
                                String D = gd.D(j3);
                                if (location2 != null) {
                                    textView2.setText(D + " - " + gd.y(location3.distanceTo(location2), 0, null));
                                    return;
                                }
                                textView2.setText(D);
                                return;
                            }
                            return;
                        }
                        q6 q6Var = (q6) view;
                        if (this.G == null) {
                            z11 = false;
                        }
                        q6Var.setHasLocation(z11);
                        return;
                    }
                    q6 q6Var2 = (q6) view;
                    if (this.G != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q6Var2.setHasLocation(z10);
                    int i14 = i7 + 1;
                    if (i14 >= b() || d(i14) != 7) {
                        z11 = false;
                    }
                    q6Var2.f31661y = z11;
                    q6Var2.invalidate();
                    return;
                }
                ((n4) view).setText(gd.M0(2131748645, null));
                return;
            }
            q6 q6Var3 = (q6) view;
            q6 q6Var4 = this.F;
            if (q6Var4 == null || !q6Var4.isAttachedToWindow()) {
                this.F = q6Var3;
            }
            R(q6Var3);
            return;
        }
        v4.q0 q0Var = (v4.q0) view.getLayoutParams();
        if (q0Var == null) {
            q0Var = new v4.q0(-1, this.E);
        } else {
            ((ViewGroup.MarginLayoutParams) q0Var).height = this.E;
        }
        view.setLayoutParams(q0Var);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        int i10;
        Context context = this.f17647y;
        if (i7 != 0) {
            i6 i6Var = this.T;
            if (i7 != 1) {
                if (i7 != 2) {
                    long j3 = this.M;
                    switch (i7) {
                        case 6:
                            q6 q6Var = new q6(context, i6Var, true, false);
                            q6Var.setDialogId(j3);
                            view2 = q6Var;
                            break;
                        case 7:
                            q6 q6Var2 = new q6(context, i6Var, true, true);
                            q6Var2.setDialogId(j3);
                            view2 = q6Var2;
                            break;
                        case 8:
                            int i11 = this.L;
                            if (i11 != 4 && i11 != 5 && i11 != 3) {
                                i10 = 54;
                            } else {
                                i10 = 16;
                            }
                            view2 = new r7(i10, context, i6Var, true);
                            break;
                        case 9:
                            w4 w4Var = new w4(context, i6Var);
                            w4Var.setOnButtonClick(new hi.o0(this, 6));
                            view2 = w4Var;
                            break;
                        case 10:
                            View y6Var = new y6(context, (org.telegram.ui.Cells.c0) null);
                            new mq(new ColorDrawable(n6.w0(n6.f29339a7, i6Var)), n6.Y0(context, 2131231230, n6.f29360b7)).f37616x = true;
                            view2 = y6Var;
                            break;
                        case 11:
                            View view3 = new View(context);
                            view3.setTag(-33024);
                            view = view3;
                            break;
                        case 12:
                            v4 v4Var = new v4(context, i6Var);
                            v4Var.setAllowTextAnimation(true);
                            view2 = v4Var;
                            break;
                        case 13:
                            view2 = this.Z;
                            break;
                        default:
                            view2 = new View(context);
                            break;
                    }
                } else {
                    view2 = new n4(context, i6Var);
                }
            } else {
                view2 = new q6(context, i6Var, false, false);
            }
            return new v4.f1(view2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17645d0 = frameLayout;
        frameLayout.setTag(-33024);
        this.f17645d0.setLayoutParams(new v4.q0(-1, this.E));
        view = frameLayout;
        view2 = view;
        return new v4.f1(view2);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        if (f1Var.f59126f == 1) {
            this.F = (q6) f1Var.f59122a;
            Q();
        }
    }

    public void J() {
    }
}
