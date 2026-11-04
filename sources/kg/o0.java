package kg;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.kd;
import org.telegram.messenger.l10;
import org.telegram.messenger.ld;
import org.telegram.messenger.m5;
import org.telegram.messenger.va;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xp;
import org.telegram.ui.fa0;
import org.telegram.ui.ha0;
public class o0 extends c {
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
    public zi O;
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
    public fa0 Z;
    public boolean f17120a0;
    public boolean f17121b0;
    public boolean f17122c0;
    public FrameLayout f17123d0;
    public final int f17124x;
    public final Context f17125y;

    public o0(Context context, int i3, long j10, boolean z10, e6 e6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.f17124x = h10.f22829t0;
        this.N = -1;
        this.Q = new ArrayList();
        this.U = true;
        this.f17121b0 = false;
        this.f17122c0 = false;
        this.Y = z12;
        this.f17125y = context;
        this.L = i3;
        this.M = j10;
        this.S = z10;
        this.T = e6Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 == 6) {
            if (ld.f(this.f17124x).h(this.M) == null && this.G == null) {
                return false;
            }
        } else if (i3 != 1 && i3 != 8 && i3 != 12 && i3 != 7) {
            return false;
        }
        return true;
    }

    public final void H() {
        int i3 = this.L;
        if (i3 == 8) {
            Location location = this.H;
            if (location != null || (location = this.G) != null) {
                this.R = true;
                Q();
                ld.d(location, this.f16932e ? 1 : 0, this);
                return;
            }
            return;
        }
        int i10 = 0;
        if (i3 == 4) {
            Location location2 = this.H;
            if (location2 != null || (location2 = this.G) != null) {
                Location location3 = this.K;
                if (location3 == null || location3.distanceTo(location2) > 100.0f) {
                    this.J = null;
                }
                this.R = true;
                Q();
                ld.d(location2, 0, this);
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
            ld.d(location4, i10, this);
        }
    }

    public final Object I(int i3) {
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
        zi ziVar = this.O;
        if (ziVar != null) {
            if (i3 == 1) {
                return ziVar;
            }
            if (i3 > 4 && i3 < this.Q.size() + 5) {
                return this.Q.get(i3 - 5);
            }
        } else {
            int i11 = 2;
            if (i10 == 2) {
                kd h = ld.f(this.f17124x).h(this.M);
                if (h != null && h.d != Integer.MAX_VALUE) {
                    i11 = 3;
                }
                if (i3 >= i11) {
                    return this.Q.get(i3 - i11);
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
        int i3 = this.L;
        if (i3 == 8) {
            this.J = str2;
        } else {
            this.J = str;
        }
        if (i3 == 7 && this.f17122c0) {
            this.V = null;
            this.W = null;
        }
        if (this.W != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i3 == 7) {
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
        int i3;
        if (this.G == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.G = location;
        if (this.H == null) {
            H();
        }
        if (z10 && (i3 = this.N) > 0) {
            g(i3);
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
        long e10 = h10.i(this.f17124x).e();
        for (int i3 = 0; i3 < this.Q.size(); i3++) {
            if (((ha0) this.Q.get(i3)).f45880a == e10 || ((ha0) this.Q.get(i3)).f45881b.out) {
                this.Q.remove(i3);
                break;
            }
        }
        f();
    }

    public final void O(boolean z10, boolean z11) {
        if (this.f17121b0 == z10 && this.f17122c0 == z11) {
            return;
        }
        this.f17121b0 = z10;
        this.f17122c0 = z11;
        if (z11) {
            this.V = null;
            this.W = null;
        }
        f();
    }

    public final void P(int i3) {
        this.E = i3;
        FrameLayout frameLayout = this.f17123d0;
        if (frameLayout != null) {
            u4.p0 p0Var = (u4.p0) frameLayout.getLayoutParams();
            if (p0Var == null) {
                p0Var = new u4.p0(-1, this.E);
            } else {
                ((ViewGroup.MarginLayoutParams) p0Var).height = this.E;
            }
            this.f17123d0.setLayoutParams(p0Var);
            this.f17123d0.forceLayout();
        }
    }

    public final void Q() {
        R(this.F);
    }

    public final void R(p6 p6Var) {
        String M0;
        if (p6Var != null) {
            int i3 = this.L;
            if (i3 == 8) {
                if (!TextUtils.isEmpty(this.I)) {
                    M0 = this.I;
                } else if (!TextUtils.isEmpty(this.J)) {
                    M0 = this.J;
                } else if (this.R) {
                    M0 = bd.M0(2131748787, null);
                } else {
                    M0 = bd.M0(2131743887, null);
                }
                p6Var.b(bd.M0(2131745521, null), M0);
                p6Var.setHasLocation(true);
                return;
            }
            String str = "";
            if (i3 != 4 && this.H == null) {
                if (this.G != null) {
                    p6Var.b(bd.M0(2131745621, null), bd.a0(null, null, 2131754693, bd.G((int) this.G.getAccuracy(), "Meters", new Object[0])));
                    p6Var.setHasLocation(true);
                    return;
                }
                String M02 = bd.M0(2131745621, null);
                if (!this.f17121b0) {
                    str = bd.M0(2131748787, null);
                }
                p6Var.b(M02, str);
                p6Var.setHasLocation(!this.f17121b0);
                return;
            }
            if (!TextUtils.isEmpty(this.I)) {
                str = this.I;
            } else if (!TextUtils.isEmpty(this.J)) {
                str = this.J;
            } else {
                Location location = this.H;
                if ((location == null && this.G == null) || this.R) {
                    str = bd.M0(2131748787, null);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.H.getLongitude()));
                } else {
                    Location location2 = this.G;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.G.getLongitude()));
                    } else if (!this.f17121b0) {
                        str = bd.M0(2131748787, null);
                    }
                }
            }
            if (this.X) {
                p6Var.b(bd.M0(2131753937, null), str);
            } else if (i3 == 4) {
                p6Var.b(bd.M0(2131752211, null), str);
            } else {
                p6Var.b(bd.M0(2131745600, null), str);
            }
            p6Var.setHasLocation(true);
        }
    }

    @Override
    public final int b() {
        int i3 = 2;
        int i10 = this.L;
        if (i10 != 6 && i10 != 5 && i10 != 4 && !this.f16932e) {
            boolean z10 = this.S;
            int i11 = 0;
            if (i10 == 7) {
                if (this.W != null) {
                    i11 = 1;
                }
                i3 = i11 + 2 + (z10 ? 1 : 0);
            } else if (this.O != null) {
                if (this.Q.isEmpty()) {
                    if (!this.Y) {
                        i11 = 1;
                    }
                } else {
                    i11 = this.Q.size() + 3;
                }
                i3 = 2 + i11;
            } else if (i10 == 2) {
                kd h = ld.f(this.f17124x).h(this.M);
                int size = this.Q.size() + 2;
                if (h != null && h.d != Integer.MAX_VALUE) {
                    i11 = 1;
                }
                i3 = size + i11;
            } else {
                if (i10 == 1) {
                    i3 = 3;
                }
                i3 += z10 ? 1 : 0;
            }
        }
        if (this.Z != null && this.f17120a0) {
            return i3 + 1;
        }
        return i3;
    }

    @Override
    public final int d(int i3) {
        kd h;
        if (i3 == b() - 1 && this.Z != null && this.f17120a0) {
            return 13;
        }
        if (i3 == 0) {
            return 0;
        }
        int i10 = this.L;
        if (i10 != 6) {
            if (this.S && i3 == b() - 1) {
                return 11;
            }
            if (i10 != 5) {
                if (i10 != 4) {
                    if (i10 != 2 && i10 != 1) {
                        h = null;
                    } else {
                        h = ld.f(this.f17124x).h(this.M);
                    }
                    if (this.O != null) {
                        if (this.Q.isEmpty()) {
                            if (i3 == 2) {
                                return 9;
                            }
                            return 8;
                        } else if (i3 == 2) {
                            return 10;
                        } else {
                            if (i3 == 3) {
                                return 2;
                            }
                            if (i3 == 4) {
                                this.N = i3;
                                return 6;
                            }
                            return 8;
                        }
                    } else if (i10 == 2) {
                        if (i3 != 2 || h == null || h.d == Integer.MAX_VALUE) {
                            if (i3 == 1) {
                                if (h == null || h.d != Integer.MAX_VALUE) {
                                    this.N = i3;
                                    return 6;
                                }
                            } else {
                                return 8;
                            }
                        }
                        return 7;
                    } else if (i10 == 1 && i3 == 2) {
                        if (h != null) {
                            this.N = -1;
                            return 7;
                        }
                        this.N = i3;
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
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        long j10;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
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
                                    if (this.f17122c0) {
                                        if (i3 != 1 || this.W == null) {
                                            z11 = false;
                                        }
                                        v4Var.a(null, 2, z11, false);
                                        return;
                                    } else if (i3 == 1) {
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
                                q7Var.b(this.O, this.G, this.f17121b0);
                                return;
                            }
                            TLRPC.TL_channelLocation tL_channelLocation = this.P;
                            long j11 = this.M;
                            if (tL_channelLocation != null) {
                                TextView textView = q7Var.f30224f;
                                Location location = q7Var.f30230y;
                                k9 k9Var = q7Var.f30222c;
                                q7Var.F = h10.f22829t0;
                                String str = tL_channelLocation.address;
                                q7Var.f30225n = null;
                                String str2 = "";
                                if (m5.E(j11)) {
                                    TLRPC.User a22 = hp.s1(q7Var.F).a2(Long.valueOf(j11));
                                    if (a22 != null) {
                                        q7Var.f30225n = new u8(0, a22);
                                        str2 = l10.p(a22);
                                        k9Var.e(a22, q7Var.f30225n);
                                    }
                                } else {
                                    TLRPC.Chat M0 = hp.s1(q7Var.F).M0(Long.valueOf(-j11));
                                    if (M0 != null) {
                                        u8 u8Var = new u8(M0);
                                        q7Var.f30225n = u8Var;
                                        str2 = M0.title;
                                        k9Var.e(M0, u8Var);
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
                            zi ziVar = this.O;
                            if (ziVar != null && i3 == 1) {
                                q7Var.b(ziVar, this.G, this.f17121b0);
                                return;
                            }
                            if (ziVar != null) {
                                i11 = 5;
                            }
                            int i12 = i3 - i11;
                            kd h = ld.f(this.f17124x).h(j11);
                            if (h != null && h.d != Integer.MAX_VALUE) {
                                i12--;
                            }
                            if (i12 >= 0 && i12 < this.Q.size()) {
                                ha0 ha0Var = (ha0) this.Q.get(i12);
                                Location location2 = this.G;
                                TextView textView2 = q7Var.f30224f;
                                k9 k9Var2 = q7Var.f30222c;
                                k5 k5Var = q7Var.d;
                                Location location3 = q7Var.f30230y;
                                q7Var.f30229x = ha0Var;
                                if (m5.E(ha0Var.f45880a)) {
                                    TLRPC.User a23 = hp.s1(q7Var.F).a2(Long.valueOf(ha0Var.f45880a));
                                    if (a23 != null) {
                                        q7Var.f30225n.r(a23);
                                        k5Var.l(g5.m(0, a23.first_name, a23.last_name), false);
                                        k9Var2.e(a23, q7Var.f30225n);
                                    }
                                } else {
                                    TLRPC.Chat M02 = hp.s1(q7Var.F).M0(Long.valueOf(-ha0Var.f45880a));
                                    if (M02 != null) {
                                        q7Var.f30225n.q(M02);
                                        k5Var.l(M02.title, false);
                                        k9Var2.e(M02, q7Var.f30225n);
                                    }
                                }
                                va a10 = ha0Var.f45883e.a();
                                location3.setLatitude(a10.f25843a);
                                location3.setLongitude(a10.f25844b);
                                TLRPC.Message message = ha0Var.f45881b;
                                int i13 = message.edit_date;
                                if (i13 != 0) {
                                    j10 = i13;
                                } else {
                                    j10 = message.date;
                                }
                                String D = bd.D(j10);
                                if (location2 != null) {
                                    textView2.setText(D + " - " + bd.y(location3.distanceTo(location2), 0, null));
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
                    int i14 = i3 + 1;
                    if (i14 >= b() || d(i14) != 7) {
                        z11 = false;
                    }
                    p6Var2.f29811y = z11;
                    p6Var2.invalidate();
                    return;
                }
                ((n4) view).setText(bd.M0(2131748845, null));
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
        u4.p0 p0Var = (u4.p0) view.getLayoutParams();
        if (p0Var == null) {
            p0Var = new u4.p0(-1, this.E);
        } else {
            ((ViewGroup.MarginLayoutParams) p0Var).height = this.E;
        }
        view.setLayoutParams(p0Var);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        View view2;
        int i10;
        Context context = this.f17125y;
        if (i3 != 0) {
            e6 e6Var = this.T;
            if (i3 != 1) {
                if (i3 != 2) {
                    long j10 = this.M;
                    switch (i3) {
                        case 6:
                            p6 p6Var = new p6(context, e6Var, true, false);
                            p6Var.setDialogId(j10);
                            view2 = p6Var;
                            break;
                        case 7:
                            p6 p6Var2 = new p6(context, e6Var, true, true);
                            p6Var2.setDialogId(j10);
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
                            w4Var.setOnButtonClick(new ii.m(this, 8));
                            view2 = w4Var;
                            break;
                        case 10:
                            View x6Var = new x6(context, (org.telegram.ui.Cells.f1) null);
                            new xp(new ColorDrawable(k6.w0(k6.f27824a7, e6Var)), k6.Y0(context, 2131231230, k6.f27843b7)).f40447x = true;
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
            return new u4.d1(view2);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17123d0 = frameLayout;
        frameLayout.setTag(-33024);
        this.f17123d0.setLayoutParams(new u4.p0(-1, this.E));
        view = frameLayout;
        view2 = view;
        return new u4.d1(view2);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        if (d1Var.f55544f == 1) {
            this.F = (p6) d1Var.f55540a;
            Q();
        }
    }

    public void J() {
    }
}
