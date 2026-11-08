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
import org.telegram.messenger.cb;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.rd;
import org.telegram.messenger.sd;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.q6;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.ja0;
import org.telegram.ui.la0;
public class r0 extends c {
    public int D;
    public q6 E;
    public Location F;
    public Location G;
    public String H;
    public String I;
    public Location J;
    public final int K;
    public final long L;
    public int M;
    public ij N;
    public TLRPC.TL_channelLocation O;
    public ArrayList P;
    public boolean Q;
    public final boolean R;
    public final f6 S;
    public boolean T;
    public TLRPC.TL_messageMediaVenue U;
    public TLRPC.TL_messageMediaVenue V;
    public boolean W;
    public final boolean X;
    public ja0 Y;
    public boolean Z;
    public boolean f16902a0;
    public boolean f16903b0;
    public FrameLayout f16904c0;
    public final int f16905x;
    public final Context f16906y;

    public r0(Context context, int i7, long j3, boolean z9, f6 f6Var, boolean z10, boolean z11, boolean z12) {
        super(z10, z12);
        this.f16905x = p10.f24470s0;
        this.M = -1;
        this.P = new ArrayList();
        this.T = true;
        this.f16902a0 = false;
        this.f16903b0 = false;
        this.X = z11;
        this.f16906y = context;
        this.K = i7;
        this.L = j3;
        this.R = z9;
        this.S = f6Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57047f;
        if (i7 == 6) {
            if (sd.f(this.f16905x).h(this.L) == null && this.F == null) {
                return false;
            }
        } else if (i7 != 1 && i7 != 8 && i7 != 12 && i7 != 7) {
            return false;
        }
        return true;
    }

    public final void H() {
        int i7 = this.K;
        if (i7 == 8) {
            Location location = this.G;
            if (location != null || (location = this.F) != null) {
                this.Q = true;
                Q();
                sd.d(location, this.f16673e ? 1 : 0, this);
                return;
            }
            return;
        }
        int i10 = 0;
        if (i7 == 4) {
            Location location2 = this.G;
            if (location2 != null || (location2 = this.F) != null) {
                Location location3 = this.J;
                if (location3 == null || location3.distanceTo(location2) > 100.0f) {
                    this.I = null;
                }
                this.Q = true;
                Q();
                sd.d(location2, 0, this);
                return;
            }
            return;
        }
        Location location4 = this.G;
        if (location4 != null) {
            Location location5 = this.J;
            if (location5 == null || location5.distanceTo(location4) > 20.0f) {
                this.I = null;
            }
            this.Q = true;
            Q();
            if (this.d) {
                i10 = 2;
            }
            sd.d(location4, i10, this);
        }
    }

    public final Object I(int i7) {
        int i10 = this.K;
        if (i10 == 4) {
            if (this.I == null) {
                return null;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            tL_messageMediaVenue.address = this.I;
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaVenue.geo = tL_geoPoint;
            Location location = this.G;
            if (location != null) {
                tL_geoPoint.lat = location.getLatitude();
                tL_messageMediaVenue.geo._long = this.G.getLongitude();
                return tL_messageMediaVenue;
            }
            Location location2 = this.F;
            if (location2 != null) {
                tL_geoPoint.lat = location2.getLatitude();
                tL_messageMediaVenue.geo._long = this.F.getLongitude();
            }
            return tL_messageMediaVenue;
        }
        ij ijVar = this.N;
        if (ijVar != null) {
            if (i7 == 1) {
                return ijVar;
            }
            if (i7 > 4 && i7 < this.P.size() + 5) {
                return this.P.get(i7 - 5);
            }
        } else {
            int i11 = 2;
            if (i10 == 2) {
                rd h = sd.f(this.f16905x).h(this.L);
                if (h != null && h.d != Integer.MAX_VALUE) {
                    i11 = 3;
                }
                if (i7 >= i11) {
                    return this.P.get(i7 - i11);
                }
            }
        }
        return null;
    }

    public final void K(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        boolean z9;
        boolean z10 = false;
        this.Q = false;
        this.J = location;
        int i7 = this.K;
        if (i7 == 8) {
            this.I = str2;
        } else {
            this.I = str;
        }
        if (i7 == 7 && this.f16903b0) {
            this.U = null;
            this.V = null;
        }
        if (this.V != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i7 == 7) {
            this.U = tL_messageMediaVenue;
            this.V = tL_messageMediaVenue2;
            if (tL_messageMediaVenue2 == null) {
                z10 = true;
            }
            if (z9 == z10) {
                g(1);
                if (this.V == null) {
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
        this.G = location;
        H();
        Q();
    }

    public final void M(Location location) {
        boolean z9;
        int i7;
        if (this.F == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.F = location;
        if (this.G == null) {
            H();
        }
        if (z9 && (i7 = this.M) > 0) {
            g(i7);
        }
        if (this.N != null) {
            h(1, new Object());
            if (!this.P.isEmpty()) {
                n(2, this.P.size(), new Object());
            }
        } else if (this.K != 2) {
            Q();
        } else if (!this.P.isEmpty()) {
            n(2, this.P.size(), new Object());
        }
    }

    public void N(ArrayList arrayList) {
        this.P = new ArrayList(arrayList);
        long e10 = p10.i(this.f16905x).e();
        for (int i7 = 0; i7 < this.P.size(); i7++) {
            if (((la0) this.P.get(i7)).f47488a == e10 || ((la0) this.P.get(i7)).f47489b.out) {
                this.P.remove(i7);
                break;
            }
        }
        f();
    }

    public final void O(boolean z9, boolean z10) {
        if (this.f16902a0 == z9 && this.f16903b0 == z10) {
            return;
        }
        this.f16902a0 = z9;
        this.f16903b0 = z10;
        if (z10) {
            this.U = null;
            this.V = null;
        }
        f();
    }

    public final void P(int i7) {
        this.D = i7;
        FrameLayout frameLayout = this.f16904c0;
        if (frameLayout != null) {
            v4.o0 o0Var = (v4.o0) frameLayout.getLayoutParams();
            if (o0Var == null) {
                o0Var = new v4.o0(-1, this.D);
            } else {
                ((ViewGroup.MarginLayoutParams) o0Var).height = this.D;
            }
            this.f16904c0.setLayoutParams(o0Var);
            this.f16904c0.forceLayout();
        }
    }

    public final void Q() {
        R(this.E);
    }

    public final void R(q6 q6Var) {
        String M0;
        if (q6Var != null) {
            int i7 = this.K;
            if (i7 == 8) {
                if (!TextUtils.isEmpty(this.H)) {
                    M0 = this.H;
                } else if (!TextUtils.isEmpty(this.I)) {
                    M0 = this.I;
                } else if (this.Q) {
                    M0 = id.M0(2131748780, null);
                } else {
                    M0 = id.M0(2131743880, null);
                }
                q6Var.b(id.M0(2131745514, null), M0);
                q6Var.setHasLocation(true);
                return;
            }
            String str = "";
            if (i7 != 4 && this.G == null) {
                if (this.F != null) {
                    q6Var.b(id.M0(2131745614, null), id.a0(null, null, 2131754693, id.G((int) this.F.getAccuracy(), "Meters", new Object[0])));
                    q6Var.setHasLocation(true);
                    return;
                }
                String M02 = id.M0(2131745614, null);
                if (!this.f16902a0) {
                    str = id.M0(2131748780, null);
                }
                q6Var.b(M02, str);
                q6Var.setHasLocation(!this.f16902a0);
                return;
            }
            if (!TextUtils.isEmpty(this.H)) {
                str = this.H;
            } else if (!TextUtils.isEmpty(this.I)) {
                str = this.I;
            } else {
                Location location = this.G;
                if ((location == null && this.F == null) || this.Q) {
                    str = id.M0(2131748780, null);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.G.getLongitude()));
                } else {
                    Location location2 = this.F;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.F.getLongitude()));
                    } else if (!this.f16902a0) {
                        str = id.M0(2131748780, null);
                    }
                }
            }
            if (this.W) {
                q6Var.b(id.M0(2131753937, null), str);
            } else if (i7 == 4) {
                q6Var.b(id.M0(2131752211, null), str);
            } else {
                q6Var.b(id.M0(2131745593, null), str);
            }
            q6Var.setHasLocation(true);
        }
    }

    @Override
    public final int b() {
        int i7 = 2;
        int i10 = this.K;
        if (i10 != 6 && i10 != 5 && i10 != 4 && !this.f16673e) {
            boolean z9 = this.R;
            int i11 = 0;
            if (i10 == 7) {
                if (this.V != null) {
                    i11 = 1;
                }
                i7 = i11 + 2 + (z9 ? 1 : 0);
            } else if (this.N != null) {
                if (this.P.isEmpty()) {
                    if (!this.X) {
                        i11 = 1;
                    }
                } else {
                    i11 = this.P.size() + 3;
                }
                i7 = 2 + i11;
            } else if (i10 == 2) {
                rd h = sd.f(this.f16905x).h(this.L);
                int size = this.P.size() + 2;
                if (h != null && h.d != Integer.MAX_VALUE) {
                    i11 = 1;
                }
                i7 = size + i11;
            } else {
                if (i10 == 1) {
                    i7 = 3;
                }
                i7 += z9 ? 1 : 0;
            }
        }
        if (this.Y != null && this.Z) {
            return i7 + 1;
        }
        return i7;
    }

    @Override
    public final int d(int i7) {
        rd h;
        if (i7 == b() - 1 && this.Y != null && this.Z) {
            return 13;
        }
        if (i7 == 0) {
            return 0;
        }
        int i10 = this.K;
        if (i10 != 6) {
            if (this.R && i7 == b() - 1) {
                return 11;
            }
            if (i10 != 5) {
                if (i10 != 4) {
                    if (i10 != 2 && i10 != 1) {
                        h = null;
                    } else {
                        h = sd.f(this.f16905x).h(this.L);
                    }
                    if (this.N != null) {
                        if (this.P.isEmpty()) {
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
                                this.M = i7;
                                return 6;
                            }
                            return 8;
                        }
                    } else if (i10 == 2) {
                        if (i7 != 2 || h == null || h.d == Integer.MAX_VALUE) {
                            if (i7 == 1) {
                                if (h == null || h.d != Integer.MAX_VALUE) {
                                    this.M = i7;
                                    return 6;
                                }
                            } else {
                                return 8;
                            }
                        }
                        return 7;
                    } else if (i10 == 1 && i7 == 2) {
                        if (h != null) {
                            this.M = -1;
                            return 7;
                        }
                        this.M = i7;
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
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        long j3;
        int i10 = d1Var.f57047f;
        View view = d1Var.f57043a;
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 != 1) {
                int i11 = 2;
                if (i10 != 2) {
                    if (i10 != 6) {
                        if (i10 != 7) {
                            if (i10 != 8) {
                                if (i10 == 12) {
                                    v4 v4Var = (v4) view;
                                    if (this.f16903b0) {
                                        if (i7 != 1 || this.V == null) {
                                            z10 = false;
                                        }
                                        v4Var.a(null, 2, z10, false);
                                        return;
                                    } else if (i7 == 1) {
                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = this.U;
                                        if (this.V == null) {
                                            z10 = false;
                                        }
                                        v4Var.a(tL_messageMediaVenue, 2, z10, this.T);
                                        return;
                                    } else {
                                        v4Var.a(this.V, 2, false, this.T);
                                        return;
                                    }
                                }
                                return;
                            }
                            r7 r7Var = (r7) view;
                            if (this.K == 6) {
                                r7Var.b(this.N, this.F, this.f16902a0);
                                return;
                            }
                            TLRPC.TL_channelLocation tL_channelLocation = this.O;
                            long j10 = this.L;
                            if (tL_channelLocation != null) {
                                TextView textView = r7Var.f30200f;
                                Location location = r7Var.f30206y;
                                l9 l9Var = r7Var.f30198c;
                                r7Var.E = p10.f24470s0;
                                String str = tL_channelLocation.address;
                                r7Var.f30201n = null;
                                String str2 = "";
                                if (m5.E(j10)) {
                                    TLRPC.User a22 = qp.s1(r7Var.E).a2(Long.valueOf(j10));
                                    if (a22 != null) {
                                        r7Var.f30201n = new w8(0, a22);
                                        str2 = t10.p(a22);
                                        l9Var.e(a22, r7Var.f30201n);
                                    }
                                } else {
                                    TLRPC.Chat M0 = qp.s1(r7Var.E).M0(Long.valueOf(-j10));
                                    if (M0 != null) {
                                        w8 w8Var = new w8(M0);
                                        r7Var.f30201n = w8Var;
                                        str2 = M0.title;
                                        l9Var.e(M0, w8Var);
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
                            ij ijVar = this.N;
                            if (ijVar != null && i7 == 1) {
                                r7Var.b(ijVar, this.F, this.f16902a0);
                                return;
                            }
                            if (ijVar != null) {
                                i11 = 5;
                            }
                            int i12 = i7 - i11;
                            rd h = sd.f(this.f16905x).h(j10);
                            if (h != null && h.d != Integer.MAX_VALUE) {
                                i12--;
                            }
                            if (i12 >= 0 && i12 < this.P.size()) {
                                la0 la0Var = (la0) this.P.get(i12);
                                Location location2 = this.F;
                                TextView textView2 = r7Var.f30200f;
                                l9 l9Var2 = r7Var.f30198c;
                                k5 k5Var = r7Var.d;
                                Location location3 = r7Var.f30206y;
                                r7Var.f30205x = la0Var;
                                if (m5.E(la0Var.f47488a)) {
                                    TLRPC.User a23 = qp.s1(r7Var.E).a2(Long.valueOf(la0Var.f47488a));
                                    if (a23 != null) {
                                        r7Var.f30201n.r(a23);
                                        k5Var.l(g5.m(0, a23.first_name, a23.last_name), false);
                                        l9Var2.e(a23, r7Var.f30201n);
                                    }
                                } else {
                                    TLRPC.Chat M02 = qp.s1(r7Var.E).M0(Long.valueOf(-la0Var.f47488a));
                                    if (M02 != null) {
                                        r7Var.f30201n.q(M02);
                                        k5Var.l(M02.title, false);
                                        l9Var2.e(M02, r7Var.f30201n);
                                    }
                                }
                                cb a10 = la0Var.f47491e.a();
                                location3.setLatitude(a10.f21833a);
                                location3.setLongitude(a10.f21834b);
                                TLRPC.Message message = la0Var.f47489b;
                                int i13 = message.edit_date;
                                if (i13 != 0) {
                                    j3 = i13;
                                } else {
                                    j3 = message.date;
                                }
                                String D = id.D(j3);
                                if (location2 != null) {
                                    textView2.setText(D + " - " + id.y(location3.distanceTo(location2), 0, null));
                                    return;
                                }
                                textView2.setText(D);
                                return;
                            }
                            return;
                        }
                        q6 q6Var = (q6) view;
                        if (this.F == null) {
                            z10 = false;
                        }
                        q6Var.setHasLocation(z10);
                        return;
                    }
                    q6 q6Var2 = (q6) view;
                    if (this.F != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    q6Var2.setHasLocation(z9);
                    int i14 = i7 + 1;
                    if (i14 >= b() || d(i14) != 7) {
                        z10 = false;
                    }
                    q6Var2.f30154y = z10;
                    q6Var2.invalidate();
                    return;
                }
                ((n4) view).setText(id.M0(2131748838, null));
                return;
            }
            q6 q6Var3 = (q6) view;
            q6 q6Var4 = this.E;
            if (q6Var4 == null || !q6Var4.isAttachedToWindow()) {
                this.E = q6Var3;
            }
            R(q6Var3);
            return;
        }
        v4.o0 o0Var = (v4.o0) view.getLayoutParams();
        if (o0Var == null) {
            o0Var = new v4.o0(-1, this.D);
        } else {
            ((ViewGroup.MarginLayoutParams) o0Var).height = this.D;
        }
        view.setLayoutParams(o0Var);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        View view2;
        int i10;
        Context context = this.f16906y;
        if (i7 != 0) {
            f6 f6Var = this.S;
            if (i7 != 1) {
                if (i7 != 2) {
                    long j3 = this.L;
                    switch (i7) {
                        case 6:
                            q6 q6Var = new q6(context, f6Var, true, false);
                            q6Var.setDialogId(j3);
                            view2 = q6Var;
                            break;
                        case 7:
                            q6 q6Var2 = new q6(context, f6Var, true, true);
                            q6Var2.setDialogId(j3);
                            view2 = q6Var2;
                            break;
                        case 8:
                            int i11 = this.K;
                            if (i11 != 4 && i11 != 5 && i11 != 3) {
                                i10 = 54;
                            } else {
                                i10 = 16;
                            }
                            view2 = new r7(i10, context, f6Var, true);
                            break;
                        case 9:
                            w4 w4Var = new w4(context, f6Var);
                            w4Var.setOnButtonClick(new ii.g(this, 5));
                            view2 = w4Var;
                            break;
                        case 10:
                            View y6Var = new y6(context, (org.telegram.ui.Cells.f1) null);
                            new xp(new ColorDrawable(k6.w0(k6.f27796a7, f6Var)), k6.Y0(context, 2131231230, k6.f27816b7)).f40361x = true;
                            view2 = y6Var;
                            break;
                        case 11:
                            View view3 = new View(context);
                            view3.setTag(-33024);
                            view = view3;
                            break;
                        case 12:
                            v4 v4Var = new v4(context, f6Var);
                            v4Var.setAllowTextAnimation(true);
                            view2 = v4Var;
                            break;
                        case 13:
                            view2 = this.Y;
                            break;
                        default:
                            view2 = new View(context);
                            break;
                    }
                } else {
                    view2 = new n4(context, f6Var);
                }
            } else {
                view2 = new q6(context, f6Var, false, false);
            }
            return new v4.d1(view2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f16904c0 = frameLayout;
        frameLayout.setTag(-33024);
        this.f16904c0.setLayoutParams(new v4.o0(-1, this.D));
        view = frameLayout;
        view2 = view;
        return new v4.d1(view2);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        if (d1Var.f57047f == 1) {
            this.E = (q6) d1Var.f57043a;
            Q();
        }
    }

    public void J() {
    }
}
