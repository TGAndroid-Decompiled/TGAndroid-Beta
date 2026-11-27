package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class v34 implements u69, qec, tj5, aea, v78, fx7, ty9, cj2, dgc, jy2, yu8, z34, be8, a43, k98, y11, esb, p7, on5 {
    public final byte a;
    public Object b;

    public v34(byte b) {
        this.a = b;
        switch (b) {
            case 6:
                return;
            case 16:
                this.b = new Bundle();
                return;
            default:
                this.b = new rr4(5, 1.0f, false, (byte) 0);
                return;
        }
    }

    @Override
    public final void B(gy2 gy2Var) {
        rl7 rl7Var = (rl7) this.b;
        rl7Var.x1 = true;
        String str = gy2Var.c;
        rl7Var.H1.setText(str);
        rl7Var.H0(str, gy2Var);
        rl7Var.x1 = false;
        hl.d3(new fe7(this, (byte) 6), 300L);
        rl7Var.J1.requestFocus();
        ql7 ql7Var = rl7Var.J1;
        ql7Var.setSelection(ql7Var.length());
    }

    @Override
    public final void B0(float f, int i) {
        ArrayList arrayList;
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar != null && (arrayList = c8bVar.T) != null && i >= 0 && i < arrayList.size()) {
            ((c8b) mm8Var.d.T.get(i)).P = f;
        }
    }

    @Override
    public final void C(long j, boolean z) {
        mm8 mm8Var = (mm8) this.b;
        if (!z) {
            mm8Var.m(j);
            return;
        }
        kfc kfcVar = mm8Var.e;
        if (kfcVar != null) {
            kfcVar.p0(j, true);
        } else if (mm8Var.i()) {
            mm8Var.F.m(j, true);
        } else {
            kfc kfcVar2 = mm8Var.E;
            if (kfcVar2 != null) {
                kfcVar2.p0(j, false);
            }
        }
    }

    @Override
    public final TextureView D() {
        return null;
    }

    @Override
    public final void D1(View view, float f, float f2) {
        hj6 hj6Var = (hj6) this.b;
        hj6.n(view, f, f2);
        hj6Var.m(false, false, f);
        hj6Var.invalidate();
    }

    @Override
    public final boolean E() {
        if (hl.C3()) {
            ((j95) this.b).d1().k(0L, 33, null, null, null, null);
            return true;
        }
        return true;
    }

    @Override
    public final void E1(float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.E = f;
        c8bVar.j = true;
        mm8Var.w(true);
    }

    @Override
    public final void F(String str) {
        ((s98) this.b).l0(str);
    }

    @Override
    public final void F0(boolean z) {
        j88 j88Var = ((k88) this.b).a;
        if (j88Var != null) {
            ((ua8) j88Var).b(z);
        }
    }

    @Override
    public final void G(float f) {
        hc8 hc8Var = (hc8) this.b;
        a78.e(hc8Var.z1).k(String.valueOf(v01.a.indexOf(hc8Var.G0.getCurrentBrush())), f);
        igb igbVar = hc8Var.u1;
        igbVar.c = f;
        hc8Var.u0(igbVar, null);
    }

    public final void H(int r23, int r24, defpackage.cb3 r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v34.H(int, int, cb3):void");
    }

    @Override
    public final void H0(float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.P = f;
        mm8Var.b();
    }

    @Override
    public final void J(r47 r47Var) {
        ((ccb) ((o68) this.b).A1).f(false);
    }

    public final void K(int i, long j) {
        vl6 vl6Var = (vl6) this.b;
        boolean z = false;
        if (i != 136) {
            if (i != 137) {
                if (i != 145) {
                    if (i != 146) {
                        if (i != 240) {
                            if (i != 241) {
                                if (i != 20529) {
                                    if (i != 20530) {
                                        if (i != 29636) {
                                            if (i != 29637) {
                                                switch (i) {
                                                    case 131:
                                                        int i2 = (int) j;
                                                        if (i2 != 1) {
                                                            if (i2 != 2) {
                                                                if (i2 != 17) {
                                                                    if (i2 != 33) {
                                                                        vl6Var.h(i);
                                                                        vl6Var.B.f = -1;
                                                                        return;
                                                                    }
                                                                    vl6Var.h(i);
                                                                    vl6Var.B.f = 5;
                                                                    return;
                                                                }
                                                                vl6Var.h(i);
                                                                vl6Var.B.f = 3;
                                                                return;
                                                            }
                                                            vl6Var.h(i);
                                                            vl6Var.B.f = 1;
                                                            return;
                                                        }
                                                        vl6Var.h(i);
                                                        vl6Var.B.f = 2;
                                                        return;
                                                    case 152:
                                                        rl6 k = vl6Var.k(i);
                                                        if (j == 1) {
                                                            z = true;
                                                        }
                                                        k.d = z;
                                                        return;
                                                    case 155:
                                                        vl6Var.X = vl6Var.p(j);
                                                        return;
                                                    case 159:
                                                        vl6Var.h(i);
                                                        vl6Var.B.Q = (int) j;
                                                        return;
                                                    case 176:
                                                        vl6Var.h(i);
                                                        vl6Var.B.o = (int) j;
                                                        return;
                                                    case 179:
                                                        if (!vl6Var.C) {
                                                            vl6Var.g(i);
                                                            vl6Var.H = vl6Var.p(j);
                                                            return;
                                                        }
                                                        return;
                                                    case 186:
                                                        vl6Var.h(i);
                                                        vl6Var.B.p = (int) j;
                                                        return;
                                                    case 215:
                                                        vl6Var.h(i);
                                                        vl6Var.B.d = (int) j;
                                                        return;
                                                    case 231:
                                                        vl6Var.T = vl6Var.p(j);
                                                        return;
                                                    case 238:
                                                        vl6Var.e0 = (int) j;
                                                        return;
                                                    case 247:
                                                        if (!vl6Var.C) {
                                                            vl6Var.g(i);
                                                            vl6Var.I = (int) j;
                                                            return;
                                                        }
                                                        return;
                                                    case 251:
                                                        vl6Var.f0 = true;
                                                        return;
                                                    case 16871:
                                                        vl6Var.h(i);
                                                        vl6Var.B.i = (int) j;
                                                        return;
                                                    case 16980:
                                                        if (j != 3) {
                                                            throw hy7.a("ContentCompAlgo " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 17029:
                                                        if (j < 1 || j > 2) {
                                                            throw hy7.a("DocTypeReadVersion " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 17143:
                                                        if (j != 1) {
                                                            throw hy7.a("EBMLReadVersion " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 18401:
                                                        if (j != 5) {
                                                            throw hy7.a("ContentEncAlgo " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 18408:
                                                        if (j != 1) {
                                                            throw hy7.a("AESSettingsCipherMode " + j + " not supported", null);
                                                        }
                                                        return;
                                                    case 21420:
                                                        vl6Var.E = j + vl6Var.u;
                                                        return;
                                                    case 21432:
                                                        int i3 = (int) j;
                                                        vl6Var.h(i);
                                                        if (i3 != 0) {
                                                            if (i3 != 1) {
                                                                if (i3 != 3) {
                                                                    if (i3 == 15) {
                                                                        vl6Var.B.z = 3;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                vl6Var.B.z = 1;
                                                                return;
                                                            }
                                                            vl6Var.B.z = 2;
                                                            return;
                                                        }
                                                        vl6Var.B.z = 0;
                                                        return;
                                                    case 21680:
                                                        vl6Var.h(i);
                                                        vl6Var.B.r = (int) j;
                                                        return;
                                                    case 21682:
                                                        vl6Var.h(i);
                                                        vl6Var.B.t = (int) j;
                                                        return;
                                                    case 21690:
                                                        vl6Var.h(i);
                                                        vl6Var.B.s = (int) j;
                                                        return;
                                                    case 21930:
                                                        vl6Var.h(i);
                                                        ul6 ul6Var = vl6Var.B;
                                                        if (j == 1) {
                                                            z = true;
                                                        }
                                                        ul6Var.a0 = z;
                                                        return;
                                                    case 21938:
                                                        vl6Var.h(i);
                                                        vl6Var.B.q = (int) j;
                                                        return;
                                                    case 21998:
                                                        vl6Var.h(i);
                                                        vl6Var.B.h = (int) j;
                                                        return;
                                                    case 22186:
                                                        vl6Var.h(i);
                                                        vl6Var.B.U = j;
                                                        return;
                                                    case 22203:
                                                        vl6Var.h(i);
                                                        vl6Var.B.V = j;
                                                        return;
                                                    case 25188:
                                                        vl6Var.h(i);
                                                        vl6Var.B.R = (int) j;
                                                        return;
                                                    case 30114:
                                                        vl6Var.g0 = j;
                                                        return;
                                                    case 30321:
                                                        vl6Var.h(i);
                                                        int i4 = (int) j;
                                                        if (i4 != 0) {
                                                            if (i4 != 1) {
                                                                if (i4 != 2) {
                                                                    if (i4 == 3) {
                                                                        vl6Var.B.u = 3;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                vl6Var.B.u = 2;
                                                                return;
                                                            }
                                                            vl6Var.B.u = 1;
                                                            return;
                                                        }
                                                        vl6Var.B.u = 0;
                                                        return;
                                                    case 2352003:
                                                        vl6Var.h(i);
                                                        vl6Var.B.g = (int) j;
                                                        return;
                                                    case 2807729:
                                                        vl6Var.v = j;
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case 21945:
                                                                vl6Var.h(i);
                                                                int i5 = (int) j;
                                                                if (i5 != 1) {
                                                                    if (i5 == 2) {
                                                                        vl6Var.B.C = 1;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                vl6Var.B.C = 2;
                                                                return;
                                                            case 21946:
                                                                vl6Var.h(i);
                                                                int g = bm2.g((int) j);
                                                                if (g != -1) {
                                                                    vl6Var.B.B = g;
                                                                    return;
                                                                }
                                                                return;
                                                            case 21947:
                                                                vl6Var.h(i);
                                                                int f = bm2.f((int) j);
                                                                if (f != -1) {
                                                                    vl6Var.B.A = f;
                                                                    return;
                                                                }
                                                                return;
                                                            case 21948:
                                                                vl6Var.h(i);
                                                                vl6Var.B.D = (int) j;
                                                                return;
                                                            case 21949:
                                                                vl6Var.h(i);
                                                                vl6Var.B.E = (int) j;
                                                                return;
                                                            default:
                                                                return;
                                                        }
                                                }
                                            }
                                            vl6Var.h(i);
                                            vl6Var.B.e = j;
                                            return;
                                        }
                                        vl6Var.k(i).a = j;
                                        return;
                                    } else if (j != 1) {
                                        throw hy7.a("ContentEncodingScope " + j + " not supported", null);
                                    } else {
                                        return;
                                    }
                                } else if (j != 0) {
                                    throw hy7.a("ContentEncodingOrder " + j + " not supported", null);
                                } else {
                                    return;
                                }
                            } else if (!vl6Var.C) {
                                vl6Var.g(i);
                                if (vl6Var.J == -1) {
                                    vl6Var.J = j;
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (!vl6Var.C) {
                            vl6Var.g(i);
                            if (vl6Var.K == -1) {
                                vl6Var.K = j;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    vl6Var.k(i).c = j;
                    return;
                }
                vl6Var.k(i).b = j;
                return;
            }
            vl6Var.k(i).e = j;
            return;
        }
        vl6Var.h(i);
        ul6 ul6Var2 = vl6Var.B;
        if (j == 1) {
            z = true;
        }
        ul6Var2.b0 = z;
    }

    @Override
    public final h44 L() {
        return ((vab) this.b).t0;
    }

    @Override
    public final void L0() {
        j88 j88Var = ((k88) this.b).a;
        if (j88Var != null) {
            PhotoViewer photoViewer = ((ua8) j88Var).a;
            if (photoViewer.d2 == 1) {
                photoViewer.H2 = true;
                photoViewer.B2();
            }
        }
    }

    public final void M() {
        ((ip4) this.b).d.R();
    }

    public final void N(eh6 eh6Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ph6 ph6Var = (ph6) this.b;
        boolean z5 = true;
        ph6Var.O = true;
        qh6 qh6Var = ph6Var.h0;
        qh6Var.K = false;
        qh6Var.B1(0, false);
        if (hl.L1()) {
            if (qh6Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            if (qh6Var.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 28 && qh6Var.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i >= 26 && qh6Var.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            mh6 mh6Var = ph6Var.a;
            if (mh6Var != null && "888".equals(mh6Var.getText())) {
                z = true;
                z2 = true;
                z3 = true;
                z4 = true;
            }
            if (qh6Var.w) {
                qh6Var.r.clear();
                if (!z) {
                    qh6Var.r.add("android.permission.READ_PHONE_STATE");
                }
                if (!z2) {
                    qh6Var.r.add("android.permission.CALL_PHONE");
                }
                if (!z3) {
                    qh6Var.r.add("android.permission.READ_CALL_LOG");
                }
                if (!z4 && i >= 26) {
                    qh6Var.r.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (!qh6Var.r.isEmpty()) {
                    SharedPreferences e1 = uc7.e1();
                    if (!e1.getBoolean("firstlogin", true) && !qh6Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !qh6Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                        try {
                            qh6Var.getParentActivity().requestPermissions((String[]) qh6Var.r.toArray(new String[0]), 6);
                            return;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                    }
                    e1.edit().putBoolean("firstlogin", false).commit();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qh6Var.getParentActivity());
                    alertDialog$Builder.j(ob6.M0(2131751736, "Continue"), null);
                    int i2 = 2131623958;
                    id idVar = alertDialog$Builder.a;
                    if (!z && (!z2 || !z3)) {
                        idVar.U = ob6.M0(2131754267, "AllowReadCallAndLog");
                    } else if (z2 && z3) {
                        idVar.U = ob6.M0(2131754268, "AllowReadCall");
                        i2 = 2131624067;
                    } else {
                        idVar.U = ob6.M0(2131754266, "AllowReadCallLog");
                    }
                    int i3 = aob.L5;
                    alertDialog$Builder.l(i2, 46, aob.w0(null, i3, false), null);
                    alertDialog$Builder.m(i3, null);
                    qh6Var.h = qh6Var.showDialog(idVar);
                    ph6Var.O = true;
                    return;
                }
            }
            z5 = true;
        }
        oh6 oh6Var = new oh6((byte) 0, this, eh6Var);
        int i4 = eh6.G;
        eh6Var.h.f(z5, z5);
        hl.d3(oh6Var, 400L);
    }

    public final void O(int i) {
        boolean z;
        TLRPC.TL_exportedNoPaidMessagesToken c;
        vz8 vz8Var = ((rz8) this.b).e;
        if (vz8Var != null && vz8Var.d != i) {
            boolean z2 = true;
            byte b = i;
            b = i;
            if (vz8Var.c.d && i == 2) {
                b = 1;
            }
            vz8Var.d = b;
            SharedPreferences.Editor edit = vz8Var.f().edit();
            if (vz8Var.d == 2) {
                z = true;
            } else {
                z = false;
            }
            edit.putBoolean("qrNoPaidPermanent", z).apply();
            byte b2 = vz8Var.d;
            if (b2 == 0) {
                if (vz8Var.n != 0) {
                    ConnectionsManager.getInstance(vz8Var.a).cancelRequest(vz8Var.n, true);
                    vz8Var.n = 0;
                    return;
                }
                return;
            }
            if (b2 == 2 && (c = vz8Var.c()) != null) {
                vz8Var.f = c;
                vz8Var.b.setFreeLink(vz8Var.d(c));
            }
            if (vz8Var.d != 1) {
                z2 = false;
            }
            vz8Var.n(false, z2);
        }
    }

    @Override
    public final void O1(float f, int i) {
        ArrayList arrayList;
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar != null && (arrayList = c8bVar.T) != null && i >= 0 && i < arrayList.size()) {
            ((c8b) mm8Var.d.T.get(i)).W = f;
        }
    }

    public final void P(zv6 zv6Var, ev6 ev6Var, ArrayList arrayList) {
        a05 a05Var = (a05) this.b;
        if (zv6Var == a05Var.y && ev6Var != null) {
            iw6 iw6Var = a05Var.x.a;
            String d = ev6Var.d();
            jw6 jw6Var = new jw6(iw6Var, d, a05Var.b(iw6Var, d), false);
            jw6Var.i(ev6Var);
            if (a05Var.d != jw6Var) {
                a05Var.h(a05Var, jw6Var, a05Var.y, 3, a05Var.x, arrayList);
                a05Var.x = null;
                a05Var.y = null;
            }
        } else if (zv6Var == a05Var.e) {
            if (ev6Var != null) {
                a05Var.n(a05Var.d, ev6Var);
            }
            a05Var.d.n(arrayList);
        }
    }

    @Override
    public final void P1(float f) {
        c8b c8bVar = ((mm8) this.b).d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.a0 = f;
        c8bVar.j = true;
    }

    public final void Q(String str, Bitmap bitmap) {
        qs qsVar = MediaMetadataCompat.d;
        if (qsVar.containsKey(str) && ((Integer) qsVar.get(str)).intValue() != 2) {
            lq5.j(qd4.y("The ", str, " key cannot be used to put a Bitmap"));
        } else {
            ((Bundle) this.b).putParcelable(str, bitmap);
        }
    }

    public final void R(long j) {
        qs qsVar = MediaMetadataCompat.d;
        if (qsVar.containsKey("android.media.metadata.DURATION") && ((Integer) qsVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            lq5.j("The android.media.metadata.DURATION key cannot be used to put a long");
        } else {
            ((Bundle) this.b).putLong("android.media.metadata.DURATION", j);
        }
    }

    public final void S(String str, String str2) {
        qs qsVar = MediaMetadataCompat.d;
        if (qsVar.containsKey(str) && ((Integer) qsVar.get(str)).intValue() != 1) {
            lq5.j(qd4.y("The ", str, " key cannot be used to put a String"));
        } else {
            ((Bundle) this.b).putCharSequence(str, str2);
        }
    }

    @Override
    public final void S1() {
        ((mm8) this.b).p(null);
    }

    public final void T(long j, int i, long j2) {
        vl6 vl6Var = (vl6) this.b;
        vl6Var.q0.getClass();
        if (i != 128) {
            if (i != 160) {
                if (i != 174) {
                    if (i != 187) {
                        if (i != 19899) {
                            if (i != 20533) {
                                if (i != 408125543) {
                                    if (i != 475249515) {
                                        if (i != 524531317) {
                                            if (i != 182) {
                                                if (i == 183 && !vl6Var.C) {
                                                    vl6Var.g(i);
                                                    vl6Var.I = -1;
                                                    vl6Var.J = -1L;
                                                    vl6Var.K = -1L;
                                                    return;
                                                }
                                                return;
                                            }
                                            ?? obj = new Object();
                                            obj.b = -9223372036854775807L;
                                            obj.c = -9223372036854775807L;
                                            vl6Var.A = obj;
                                            return;
                                        } else if (vl6Var.P != -1 && !vl6Var.S) {
                                            vl6Var.Q = true;
                                            return;
                                        } else {
                                            vl6Var.m();
                                            return;
                                        }
                                    } else if (!vl6Var.C) {
                                        vl6Var.G = true;
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                long j3 = vl6Var.u;
                                if (j3 != -1 && j3 != j) {
                                    throw hy7.a("Multiple Segment elements not supported", null);
                                }
                                vl6Var.u = j;
                                vl6Var.t = j2;
                                return;
                            }
                            vl6Var.h(i);
                            vl6Var.B.j = true;
                            return;
                        }
                        vl6Var.D = -1;
                        vl6Var.E = -1L;
                        return;
                    } else if (!vl6Var.C) {
                        vl6Var.g(i);
                        vl6Var.H = -9223372036854775807L;
                        return;
                    } else {
                        return;
                    }
                }
                ?? obj2 = new Object();
                obj2.o = -1;
                obj2.p = -1;
                obj2.q = -1;
                obj2.r = -1;
                obj2.s = -1;
                obj2.t = 0;
                obj2.u = -1;
                obj2.v = 0.0f;
                obj2.w = 0.0f;
                obj2.x = 0.0f;
                obj2.y = null;
                obj2.z = -1;
                obj2.A = -1;
                obj2.B = -1;
                obj2.C = -1;
                obj2.D = 1000;
                obj2.E = 200;
                obj2.F = -1.0f;
                obj2.G = -1.0f;
                obj2.H = -1.0f;
                obj2.I = -1.0f;
                obj2.J = -1.0f;
                obj2.K = -1.0f;
                obj2.L = -1.0f;
                obj2.M = -1.0f;
                obj2.N = -1.0f;
                obj2.O = -1.0f;
                obj2.Q = 1;
                obj2.R = -1;
                obj2.S = -1;
                obj2.T = 8000;
                obj2.U = 0L;
                obj2.V = 0L;
                obj2.X = false;
                obj2.b0 = true;
                obj2.c0 = "eng";
                vl6Var.B = obj2;
                obj2.a = vl6Var.y;
                return;
            }
            vl6Var.f0 = false;
            vl6Var.g0 = 0L;
            return;
        }
        vl6Var.k(i).h = null;
        vl6Var.k(i).i = null;
    }

    @Override
    public final boolean T0(float f, float f2) {
        hj6 hj6Var = (hj6) this.b;
        View view = null;
        hj6Var.P = null;
        int childCount = hj6Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = hj6Var.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && f >= childAt.getLeft() && f <= childAt.getRight() && f2 >= childAt.getTop() && f2 <= childAt.getBottom()) {
                view = childAt;
                break;
            }
            childCount--;
        }
        if (view != null && !hj6Var.Q.contains(view)) {
            return true;
        }
        return false;
    }

    public final void U(int i, String str) {
        vl6 vl6Var = (vl6) this.b;
        if (i != 133) {
            if (i != 134) {
                if (i != 17026) {
                    if (i != 17276) {
                        if (i != 21358) {
                            if (i != 2274716) {
                                return;
                            }
                            vl6Var.h(i);
                            vl6Var.B.c0 = str;
                            return;
                        }
                        vl6Var.h(i);
                        vl6Var.B.b = str;
                        return;
                    }
                    vl6Var.k(i).i = str;
                    return;
                } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                    throw hy7.a("DocType " + str + " not supported", null);
                } else {
                    vl6Var.y = str.equals("webm");
                    return;
                }
            }
            vl6Var.h(i);
            vl6Var.B.c = str;
            return;
        }
        vl6Var.k(i).h = str;
    }

    @Override
    public final void V() {
        mm8 mm8Var = (mm8) this.b;
        mm8Var.s(null, null, true);
        rbb rbbVar = ((gbb) mm8Var).D0;
        gbb gbbVar = rbbVar.Y0;
        if (gbbVar != null) {
            gbbVar.s(null, null, true);
        }
        vab vabVar = rbbVar.w1;
        if (vabVar != null) {
            vabVar.n0();
        }
        hbb hbbVar = rbbVar.d1;
        if (hbbVar != null) {
            hbbVar.setHasRoundVideo(false);
        }
        c8b c8bVar = rbbVar.L1;
        if (c8bVar != null) {
            File file = c8bVar.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                c8bVar = rbbVar.L1;
                c8bVar.o0 = null;
            }
            if (c8bVar.p0 != null) {
                try {
                    new File(rbbVar.L1.p0).delete();
                } catch (Exception unused2) {
                }
                rbbVar.L1.p0 = null;
            }
        }
    }

    @Override
    public final void W() {
        RectF rectF = ProfileActivity.Z6;
        mu9.d(new hj8((ProfileActivity) this.b, (byte) 3));
    }

    @Override
    public final boolean W0(View view, float f, float f2) {
        hj6 hj6Var = (hj6) this.b;
        hj6.n(view, f, f2);
        hl.r(hj6Var.I);
        hj6.k(hj6Var);
        hj6Var.m(true, false, f);
        hj6Var.invalidate();
        hj6Var.R.a(true, true);
        return true;
    }

    @Override
    public final void X(boolean z, float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar != null) {
            c8bVar.Z = f;
            c8bVar.j = true;
            kfc kfcVar = mm8Var.e;
            if (kfcVar != null && kfcVar.U() != -9223372036854775807L) {
                mm8Var.m(f * ((float) mm8Var.e.U()));
            }
        }
    }

    @Override
    public final boolean Y1() {
        return true;
    }

    @Override
    public final void Z1(float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.t0 = f;
        c8bVar.j = true;
        mm8Var.y(true);
    }

    @Override
    public final void b() {
        s98 s98Var = (s98) this.b;
        s98Var.a.b0();
        s98Var.b.b0();
    }

    @Override
    public final void b0() {
        j88 j88Var = ((k88) this.b).a;
        if (j88Var != null) {
            ((ua8) j88Var).a.f0.invalidate();
        }
    }

    @Override
    public final void b1(long j) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.r0 = j;
        c8bVar.j = true;
        mm8Var.y(true);
    }

    @Override
    public final void b2(int i, long j) {
        ArrayList arrayList;
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar != null && (arrayList = c8bVar.T) != null && i >= 0 && i < arrayList.size()) {
            ((c8b) mm8Var.d.T.get(i)).X = j;
        }
    }

    @Override
    public final void c(z11 z11Var, j11 j11Var, fv0 fv0Var, y42 y42Var) {
        ((xd8) this.b).g(true, j11Var, fv0Var, y42Var);
    }

    @Override
    public final boolean mo8d(float f, float f2, int i, View view) {
        yg4 yg4Var = (yg4) this.b;
        if (view instanceof zea) {
            yg4Var.f(((zea) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof cfa) {
            yg4Var.f(((cfa) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof vea) {
            yg4Var.f(((vea) view).getMessage(), view, 0);
            return true;
        } else if (view instanceof vw2) {
            yg4Var.f(((vw2) view).getMessageObject(), view, 0);
            return true;
        } else {
            if (view instanceof of3) {
                if (!yg4Var.p0.u()) {
                    of3 of3Var = (of3) view;
                    if (of3Var.a0(f)) {
                        yg4Var.j0.B(of3Var);
                        return true;
                    }
                }
                yg4Var.f(((of3) view).getMessage(), view, 0);
            }
            return true;
        }
    }

    @Override
    public final void e() {
        vab vabVar = (vab) this.b;
        vabVar.C0(null, true);
        if (vabVar.w0) {
            rbb rbbVar = vabVar.o2;
            rbbVar.d1.f.d();
            rbbVar.k0(-1, false, true);
            vabVar.w0 = false;
        }
        vabVar.N0(false);
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final void e1(boolean z) {
        pp9 pp9Var;
        rbb rbbVar = ((gbb) ((mm8) this.b)).D0;
        vab vabVar = rbbVar.w1;
        if (vabVar != null) {
            pp9 pp9Var2 = null;
            if (!z) {
                if (vabVar.getSelectedEntity() instanceof pp9) {
                    rbbVar.w1.C0(null, true);
                }
            } else if (!(vabVar.getSelectedEntity() instanceof pp9)) {
                zw7 zw7Var = rbbVar.w1.B0;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 < zw7Var.getChildCount()) {
                        View childAt = zw7Var.getChildAt(i2);
                        if (childAt instanceof pp9) {
                            pp9Var = (pp9) childAt;
                            break;
                        }
                        i2++;
                    } else {
                        pp9Var = null;
                        break;
                    }
                }
                if (pp9Var != null) {
                    vab vabVar2 = rbbVar.w1;
                    zw7 zw7Var2 = vabVar2.B0;
                    while (true) {
                        if (i >= zw7Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = zw7Var2.getChildAt(i);
                        if (childAt2 instanceof pp9) {
                            pp9Var2 = (pp9) childAt2;
                            break;
                        }
                        i++;
                    }
                    vabVar2.C0(pp9Var2, true);
                }
            }
        }
    }

    @Override
    public final void f() {
        ((yg4) this.b).j0.finish();
    }

    @Override
    public final void g(int i) {
        kl2 kl2Var = ((mm8) this.b).F;
        if (kl2Var != null) {
            ArrayList arrayList = kl2Var.h;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                jl2 jl2Var = (jl2) obj;
                if (jl2Var.a == i) {
                    jl2Var.b.e(true, 1.0f);
                    kl2Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public final void g2(long j) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.D = j;
        c8bVar.j = true;
        mm8Var.w(true);
    }

    @Override
    public final float get() {
        hc8 hc8Var = (hc8) this.b;
        v01 currentBrush = hc8Var.G0.getCurrentBrush();
        int i = hc8Var.z1;
        if (currentBrush == null) {
            return a78.e(i).i;
        }
        return a78.e(i).f(String.valueOf(v01.a.indexOf(currentBrush)), currentBrush.c());
    }

    @Override
    public final CharSequence getContentDescription() {
        return " ";
    }

    @Override
    public final long getLongPressDuration() {
        return (ViewConfiguration.getLongPressTimeout() * 750) / 1000;
    }

    @Override
    public final void h(float f) {
        ((yg4) this.b).j0.p(f);
    }

    @Override
    public final int i0() {
        return 0;
    }

    @Override
    public final void invalidate() {
        switch (this.a) {
            case 2:
                ((xl4) this.b).o.invalidate();
                return;
            default:
                ((PhotoViewer) this.b).f0.invalidate();
                return;
        }
    }

    @Override
    public final void j(View view, float f, float f2) {
        hj6 hj6Var = (hj6) this.b;
        hj6.n(view, f, f2);
        hj6Var.m(false, true, f);
        hl.d3(hj6Var.I, 450L);
        View view2 = hj6Var.P;
        if (view2 != null) {
            view2.performClick();
        }
        hj6Var.P = null;
        hj6Var.invalidate();
        hj6Var.R.a(false, true);
    }

    @Override
    public final void k(r47 r47Var) {
        ((ccb) ((o68) this.b).A1).f(true);
    }

    @Override
    public final void l() {
        ((np7) this.b).a();
    }

    @Override
    public final void m(ArrayList arrayList) {
        ((zn5) this.b).e(arrayList, false);
    }

    @Override
    public final void m0(float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.s0 = f;
        c8bVar.j = true;
        mm8Var.y(true);
    }

    @Override
    public final void o(boolean z, float f) {
        String a0;
        o86 o86Var = (o86) this.b;
        q86 q86Var = o86Var.E;
        int round = Math.round(f * 100.0f);
        if (round != i86.c()) {
            i86.g = ete.b(round, 0, 100);
            i86.k();
            i86.d(false);
            q86Var.c0();
            ArrayList arrayList = q86Var.s;
            if (arrayList.isEmpty()) {
                q86Var.b0();
            } else if (arrayList.size() >= 2) {
                if (i86.c() <= 0) {
                    a0 = ob6.M0(2131748625, null);
                } else if (i86.c() >= 100) {
                    a0 = ob6.M0(2131748624, null);
                } else {
                    a0 = ob6.a0(null, null, 2131748626, String.format("%d%%", Integer.valueOf(i86.c())));
                }
                arrayList.set(1, new k86(2, 0, 0, 0, a0));
                q86Var.d.g(1);
            }
            if (round <= 0 || round >= 100) {
                try {
                    o86Var.performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override
    public final void onFirstFrameRendered() {
        bn6 bn6Var = (bn6) this.b;
        Surface surface = bn6Var.v1;
        if (surface != null) {
            bn6Var.c1.s(surface);
            bn6Var.y1 = true;
        }
    }

    @Override
    public final void p() {
        bn6 bn6Var = (bn6) this.b;
        if (bn6Var.v1 != null) {
            bn6Var.Y0(0, 1);
        }
    }

    @Override
    public final void p1(float f, int i) {
        ArrayList arrayList;
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar != null && (arrayList = c8bVar.T) != null && i >= 0 && i < arrayList.size()) {
            ((c8b) mm8Var.d.T.get(i)).V = f;
        }
    }

    @Override
    public final void q(z11 z11Var, j11 j11Var, k11 k11Var, hw hwVar) {
        ((xd8) this.b).g(false, j11Var, k11Var, hwVar);
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
        at8 at8Var = ((dt8) this.b).h.H0;
        if (at8Var != null) {
            at8Var.d();
        }
    }

    @Override
    public final void s(View view, float f, float f2) {
        hj6 hj6Var = (hj6) this.b;
        hj6.n(view, f, f2);
        hj6Var.m(false, true, f);
        hl.d3(hj6Var.I, 450L);
        hj6Var.P = null;
        hj6Var.invalidate();
        hj6Var.R.a(false, true);
    }

    @Override
    public final void s1(float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.F = f;
        c8bVar.j = true;
        mm8Var.w(true);
    }

    @Override
    public final void t(float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.u0 = f;
        c8bVar.j = true;
        mm8Var.b();
    }

    @Override
    public final void t0(boolean z) {
        ((k88) this.b).c.setAspectLock(z);
    }

    @Override
    public final void v0(boolean z) {
        mm8 mm8Var = (mm8) this.b;
        if (mm8Var.i()) {
            mm8Var.F.getClass();
        }
        mm8Var.x(-4, z);
    }

    @Override
    public final void w() {
        w64 w64Var = ((bn6) this.b).Y;
        if (w64Var != null) {
            w64Var.a();
        }
    }

    @Override
    public final void y(float f) {
        mm8 mm8Var = (mm8) this.b;
        c8b c8bVar = mm8Var.d;
        if (c8bVar == null) {
            return;
        }
        c8bVar.G = f;
        c8bVar.j = true;
        mm8Var.b();
    }

    @Override
    public final void y0() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            ((zn5) this.b).a.startActivityForResult(intent, 14);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void A() {
    }

    @Override
    public final void p0() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void x0() {
    }

    @Override
    public final void a(ggc ggcVar) {
    }

    @Override
    public final void i(vp7 vp7Var) {
    }

    public v34(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public v34(MediaMetadataCompat mediaMetadataCompat) {
        this.a = (byte) 16;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        rx6.D(bundle);
    }

    @Override
    public final void I(float f, float f2) {
    }

    @Override
    public final void n(float f, float f2) {
    }

    @Override
    public final void z(int i, Drawable drawable) {
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }
}
