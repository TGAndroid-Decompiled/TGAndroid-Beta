package jg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import hi.p5;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.bb;
import org.telegram.messenger.g5;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.qd;
import org.telegram.messenger.rd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.ja0;
import org.telegram.ui.la0;
public class r0 extends c {
    public int E;
    public p6 F;
    public Location G;
    public Location H;
    public String I;
    public String J;
    public Location K;
    public final int L;
    public final long M;
    public int N;
    public gj O;
    public TLRPC.TL_channelLocation P;
    public ArrayList Q;
    public boolean R;
    public final boolean S;
    public final e6 T;
    public boolean U;
    public TLRPC.TL_messageMediaVenue V;
    public TLRPC.TL_messageMediaVenue W;
    public boolean X;
    public final boolean Y;
    public ja0 Z;
    public boolean f17256a0;
    public boolean f17257b0;
    public boolean f17258c0;
    public FrameLayout f17259d0;
    public final int f17260x;
    public final Context f17261y;

    public r0(Context context, int i7, long j3, boolean z10, e6 e6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.f17260x = m10.f24934t0;
        this.N = -1;
        this.Q = new ArrayList();
        this.U = true;
        this.f17257b0 = false;
        this.f17258c0 = false;
        this.Y = z12;
        this.f17261y = context;
        this.L = i7;
        this.M = j3;
        this.S = z10;
        this.T = e6Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 == 6) {
            if (rd.f(this.f17260x).h(this.M) == null && this.G == null) {
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
                rd.d(location, this.f17022e ? 1 : 0, this);
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
                rd.d(location2, 0, this);
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
            rd.d(location4, i10, this);
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
        gj gjVar = this.O;
        if (gjVar != null) {
            if (i7 == 1) {
                return gjVar;
            }
            if (i7 > 4 && i7 < this.Q.size() + 5) {
                return this.Q.get(i7 - 5);
            }
        } else {
            int i11 = 2;
            if (i10 == 2) {
                qd h = rd.f(this.f17260x).h(this.M);
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
        if (i7 == 7 && this.f17258c0) {
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
        long e10 = m10.i(this.f17260x).e();
        for (int i7 = 0; i7 < this.Q.size(); i7++) {
            if (((la0) this.Q.get(i7)).f48921a == e10 || ((la0) this.Q.get(i7)).f48922b.out) {
                this.Q.remove(i7);
                break;
            }
        }
        f();
    }

    public final void O(boolean z10, boolean z11) {
        if (this.f17257b0 == z10 && this.f17258c0 == z11) {
            return;
        }
        this.f17257b0 = z10;
        this.f17258c0 = z11;
        if (z11) {
            this.V = null;
            this.W = null;
        }
        f();
    }

    public final void P(int i7) {
        this.E = i7;
        FrameLayout frameLayout = this.f17259d0;
        if (frameLayout != null) {
            v4.p0 p0Var = (v4.p0) frameLayout.getLayoutParams();
            if (p0Var == null) {
                p0Var = new v4.p0(-1, this.E);
            } else {
                ((ViewGroup.MarginLayoutParams) p0Var).height = this.E;
            }
            this.f17259d0.setLayoutParams(p0Var);
            this.f17259d0.forceLayout();
        }
    }

    public final void Q() {
        R(this.F);
    }

    public final void R(p6 p6Var) {
        String M0;
        if (p6Var != null) {
            int i7 = this.L;
            if (i7 == 8) {
                if (!TextUtils.isEmpty(this.I)) {
                    M0 = this.I;
                } else if (!TextUtils.isEmpty(this.J)) {
                    M0 = this.J;
                } else if (this.R) {
                    M0 = hd.M0(2131748779, null);
                } else {
                    M0 = hd.M0(2131743877, null);
                }
                p6Var.b(hd.M0(2131745511, null), M0);
                p6Var.setHasLocation(true);
                return;
            }
            String str = "";
            if (i7 != 4 && this.H == null) {
                if (this.G != null) {
                    p6Var.b(hd.M0(2131745611, null), hd.a0(null, null, 2131754693, hd.G((int) this.G.getAccuracy(), "Meters", new Object[0])));
                    p6Var.setHasLocation(true);
                    return;
                }
                String M02 = hd.M0(2131745611, null);
                if (!this.f17257b0) {
                    str = hd.M0(2131748779, null);
                }
                p6Var.b(M02, str);
                p6Var.setHasLocation(!this.f17257b0);
                return;
            }
            if (!TextUtils.isEmpty(this.I)) {
                str = this.I;
            } else if (!TextUtils.isEmpty(this.J)) {
                str = this.J;
            } else {
                Location location = this.H;
                if ((location == null && this.G == null) || this.R) {
                    str = hd.M0(2131748779, null);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.H.getLongitude()));
                } else {
                    Location location2 = this.G;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.G.getLongitude()));
                    } else if (!this.f17257b0) {
                        str = hd.M0(2131748779, null);
                    }
                }
            }
            if (this.X) {
                p6Var.b(hd.M0(2131753937, null), str);
            } else if (i7 == 4) {
                p6Var.b(hd.M0(2131752211, null), str);
            } else {
                p6Var.b(hd.M0(2131745590, null), str);
            }
            p6Var.setHasLocation(true);
        }
    }

    @Override
    public final int b() {
        int i7 = 2;
        int i10 = this.L;
        if (i10 != 6 && i10 != 5 && i10 != 4 && !this.f17022e) {
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
                qd h = rd.f(this.f17260x).h(this.M);
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
        if (this.Z != null && this.f17256a0) {
            return i7 + 1;
        }
        return i7;
    }

    @Override
    public final int d(int i7) {
        qd h;
        if (i7 == b() - 1 && this.Z != null && this.f17256a0) {
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
                        h = rd.f(this.f17260x).h(this.M);
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
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        long j3;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
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
                                    if (this.f17258c0) {
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
                            q7 q7Var = (q7) view;
                            if (this.L == 6) {
                                q7Var.b(this.O, this.G, this.f17257b0);
                                return;
                            }
                            TLRPC.TL_channelLocation tL_channelLocation = this.P;
                            long j10 = this.M;
                            if (tL_channelLocation != null) {
                                TextView textView = q7Var.f31300f;
                                Location location = q7Var.f31306y;
                                i9 i9Var = q7Var.f31298c;
                                q7Var.F = m10.f24934t0;
                                String str = tL_channelLocation.address;
                                q7Var.f31301n = null;
                                String str2 = "";
                                if (m5.E(j10)) {
                                    TLRPC.User a22 = np.s1(q7Var.F).a2(Long.valueOf(j10));
                                    if (a22 != null) {
                                        q7Var.f31301n = new t8(0, a22);
                                        str2 = q10.p(a22);
                                        i9Var.f(a22, q7Var.f31301n);
                                    }
                                } else {
                                    TLRPC.Chat M0 = np.s1(q7Var.F).M0(Long.valueOf(-j10));
                                    if (M0 != null) {
                                        t8 t8Var = new t8(M0);
                                        q7Var.f31301n = t8Var;
                                        str2 = M0.title;
                                        i9Var.f(M0, t8Var);
                                    }
                                }
                                q7Var.d.l(str2, false);
                                location.setLatitude(tL_channelLocation.geo_point.lat);
                                location.setLongitude(tL_channelLocation.geo_point._long);
                                q7Var.h = true;
                                textView.setSingleLine(true);
                                textView.setText(str);
                                return;
                            }
                            gj gjVar = this.O;
                            if (gjVar != null && i7 == 1) {
                                q7Var.b(gjVar, this.G, this.f17257b0);
                                return;
                            }
                            if (gjVar != null) {
                                i11 = 5;
                            }
                            int i12 = i7 - i11;
                            qd h = rd.f(this.f17260x).h(j10);
                            if (h != null && h.d != Integer.MAX_VALUE) {
                                i12--;
                            }
                            if (i12 >= 0 && i12 < this.Q.size()) {
                                la0 la0Var = (la0) this.Q.get(i12);
                                Location location2 = this.G;
                                TextView textView2 = q7Var.f31300f;
                                i9 i9Var2 = q7Var.f31298c;
                                j5 j5Var = q7Var.d;
                                Location location3 = q7Var.f31306y;
                                q7Var.f31305x = la0Var;
                                if (m5.E(la0Var.f48921a)) {
                                    TLRPC.User a23 = np.s1(q7Var.F).a2(Long.valueOf(la0Var.f48921a));
                                    if (a23 != null) {
                                        q7Var.f31301n.r(a23);
                                        j5Var.l(g5.m(0, a23.first_name, a23.last_name), false);
                                        i9Var2.f(a23, q7Var.f31301n);
                                    }
                                } else {
                                    TLRPC.Chat M02 = np.s1(q7Var.F).M0(Long.valueOf(-la0Var.f48921a));
                                    if (M02 != null) {
                                        q7Var.f31301n.q(M02);
                                        j5Var.l(M02.title, false);
                                        i9Var2.f(M02, q7Var.f31301n);
                                    }
                                }
                                bb a10 = la0Var.f48924e.a();
                                location3.setLatitude(a10.f22677a);
                                location3.setLongitude(a10.f22678b);
                                TLRPC.Message message = la0Var.f48922b;
                                int i13 = message.edit_date;
                                if (i13 != 0) {
                                    j3 = i13;
                                } else {
                                    j3 = message.date;
                                }
                                String D = hd.D(j3);
                                if (location2 != null) {
                                    textView2.setText(D + " - " + hd.y(location3.distanceTo(location2), 0, null));
                                    return;
                                }
                                textView2.setText(D);
                                return;
                            }
                            return;
                        }
                        p6 p6Var = (p6) view;
                        if (this.G == null) {
                            z11 = false;
                        }
                        p6Var.setHasLocation(z11);
                        return;
                    }
                    p6 p6Var2 = (p6) view;
                    if (this.G != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p6Var2.setHasLocation(z10);
                    int i14 = i7 + 1;
                    if (i14 >= b() || d(i14) != 7) {
                        z11 = false;
                    }
                    p6Var2.f30872y = z11;
                    p6Var2.invalidate();
                    return;
                }
                ((n4) view).setText(hd.M0(2131748837, null));
                return;
            }
            p6 p6Var3 = (p6) view;
            p6 p6Var4 = this.F;
            if (p6Var4 == null || !p6Var4.isAttachedToWindow()) {
                this.F = p6Var3;
            }
            R(p6Var3);
            return;
        }
        v4.p0 p0Var = (v4.p0) view.getLayoutParams();
        if (p0Var == null) {
            p0Var = new v4.p0(-1, this.E);
        } else {
            ((ViewGroup.MarginLayoutParams) p0Var).height = this.E;
        }
        view.setLayoutParams(p0Var);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        int i10;
        Context context = this.f17261y;
        if (i7 != 0) {
            e6 e6Var = this.T;
            if (i7 != 1) {
                if (i7 != 2) {
                    long j3 = this.M;
                    switch (i7) {
                        case 6:
                            p6 p6Var = new p6(context, e6Var, true, false);
                            p6Var.setDialogId(j3);
                            view2 = p6Var;
                            break;
                        case 7:
                            p6 p6Var2 = new p6(context, e6Var, true, true);
                            p6Var2.setDialogId(j3);
                            view2 = p6Var2;
                            break;
                        case 8:
                            int i11 = this.L;
                            if (i11 != 4 && i11 != 5 && i11 != 3) {
                                i10 = 54;
                            } else {
                                i10 = 16;
                            }
                            view2 = new q7(i10, context, e6Var, true);
                            break;
                        case 9:
                            w4 w4Var = new w4(context, e6Var);
                            w4Var.setOnButtonClick(new p5(this, 4));
                            view2 = w4Var;
                            break;
                        case 10:
                            View x6Var = new x6(context, (org.telegram.ui.Cells.y0) null);
                            new fq(new ColorDrawable(j6.w0(j6.f28792a7, e6Var)), j6.Y0(context, 2131231230, j6.f28813b7)).f34678x = true;
                            view2 = x6Var;
                            break;
                        case 11:
                            View view3 = new View(context);
                            view3.setTag(-33024);
                            view = view3;
                            break;
                        case 12:
                            v4 v4Var = new v4(context, e6Var);
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
                    view2 = new n4(context, e6Var);
                }
            } else {
                view2 = new p6(context, e6Var, false, false);
            }
            return new v4.e1(view2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17259d0 = frameLayout;
        frameLayout.setTag(-33024);
        this.f17259d0.setLayoutParams(new v4.p0(-1, this.E));
        view = frameLayout;
        view2 = view;
        return new v4.e1(view2);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        if (e1Var.f58539f == 1) {
            this.F = (p6) e1Var.f58535a;
            Q();
        }
    }

    public void J() {
    }
}
