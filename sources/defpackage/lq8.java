package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class lq8 extends q59 {
    public final Context c;
    public final HashMap d = new HashMap();
    public final ProfileActivity e;

    public lq8(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.c = context;
    }

    @Override
    public final void A(u69 u69Var) {
        int b = u69Var.b();
        ProfileActivity profileActivity = this.e;
        if (b == profileActivity.P2) {
            profileActivity.N2 = null;
        }
    }

    @Override
    public final boolean D(u69 u69Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.g3 != -1) {
            int b = u69Var.b();
            if (b != profileActivity.g3 && b != profileActivity.U2 && b != profileActivity.i3 && b != profileActivity.h3 && b != profileActivity.W2 && b != profileActivity.X2 && b != profileActivity.A3 && b != profileActivity.j3 && b != profileActivity.k3 && b != profileActivity.r3 && b != profileActivity.o3 && b != profileActivity.l3 && b != profileActivity.n3 && b != profileActivity.s3 && b != profileActivity.t3 && b != profileActivity.w3 && b != profileActivity.x3 && b != profileActivity.y3 && b != profileActivity.z3 && b != profileActivity.P2 && b != profileActivity.d4 && b != profileActivity.f4 && b != profileActivity.j4 && b != profileActivity.i4 && b != profileActivity.m3 && b != profileActivity.V2 && b != profileActivity.R2 && b != profileActivity.g4 && b != profileActivity.h4 && b != profileActivity.t4) {
                return false;
            }
        } else {
            View view = u69Var.a;
            if (view instanceof w8c) {
                Object currentObject = ((w8c) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && m9c.D((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i = u69Var.f;
            if (i == 1 || i == 5 || i == 7 || i == 11 || i == 31 || i == 28 || i == 12 || i == 13 || i == 9 || i == 10 || i == 25 || i == 34 || i == 32) {
                return false;
            }
        }
        return true;
    }

    public final CharSequence E(String str, ArrayList arrayList, String str2) {
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int i = 0;
            while (i < arrayList2.size()) {
                if (!((TLRPC.TL_username) arrayList2.get(i)).active || (str != null && str.equals(((TLRPC.TL_username) arrayList2.get(i)).username))) {
                    arrayList2.remove(i);
                    i--;
                }
                i++;
            }
            if (arrayList2.size() > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList2.get(i2);
                    SpannableString spannableString = new SpannableString(b10.h("@", tL_username.username));
                    HashMap hashMap = this.d;
                    ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                    if (clickableSpan == null) {
                        dq8 dq8Var = new dq8(this, tL_username, tL_username.username);
                        hashMap.put(tL_username, dq8Var);
                        clickableSpan = dq8Var;
                    }
                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                    spannableString.setSpan(new do4(cmb.Wc, this.e.A0), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i2 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String M0 = jb6.M0(2131743355, null);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M0);
                int indexOf = M0.indexOf("%1$s");
                if (indexOf >= 0) {
                    spannableStringBuilder2.replace(indexOf, indexOf + 4, (CharSequence) spannableStringBuilder);
                }
                return spannableStringBuilder2;
            }
        }
        return str2;
    }

    @Override
    public final int b() {
        return this.e.O2;
    }

    @Override
    public final int d(int i) {
        int i2;
        int i3;
        int i4;
        ProfileActivity profileActivity = this.e;
        if (i != profileActivity.E3 && i != profileActivity.B4 && i != profileActivity.f3 && i != profileActivity.T2 && i != profileActivity.q3 && i != profileActivity.v3 && i != profileActivity.v4) {
            if (i != profileActivity.H3 && i != profileActivity.J3 && i != profileActivity.U2 && i != profileActivity.V2) {
                if (i != profileActivity.M3 && i != profileActivity.W2) {
                    if (i == profileActivity.I3) {
                        return 30;
                    }
                    if (i != profileActivity.K3 && i != profileActivity.L3 && i != profileActivity.X2) {
                        if (i != profileActivity.y4 && i != profileActivity.z4 && i != profileActivity.W3 && i != profileActivity.Y3 && i != profileActivity.X3 && i != profileActivity.F4 && i != profileActivity.G4 && i != profileActivity.H4 && i != profileActivity.I4 && i != profileActivity.O4 && i != profileActivity.E4 && i != profileActivity.U4 && i != profileActivity.T4 && i != profileActivity.V3 && i != profileActivity.g3 && i != profileActivity.i3 && i != profileActivity.h3 && i != profileActivity.j3 && i != profileActivity.k3 && i != profileActivity.r3 && i != profileActivity.o3 && i != profileActivity.l3 && i != profileActivity.n3 && i != profileActivity.s3 && i != profileActivity.t3 && i != profileActivity.w3 && i != profileActivity.x3 && i != profileActivity.y3 && i != profileActivity.z3 && i != profileActivity.P2 && i != profileActivity.d4 && i != profileActivity.b4 && i != profileActivity.a4 && i != profileActivity.m3 && i != profileActivity.j4 && i != profileActivity.i4 && i != profileActivity.J4 && i != profileActivity.K4 && i != profileActivity.L4) {
                            i2 = profileActivity.botPermissionLocation;
                            if (i != i2) {
                                i3 = profileActivity.botPermissionBiometry;
                                if (i != i3) {
                                    i4 = profileActivity.botPermissionEmojiStatus;
                                    if (i != i4 && i != profileActivity.h4) {
                                        if (i == profileActivity.N3) {
                                            return 5;
                                        }
                                        if (i == profileActivity.O3) {
                                            return 6;
                                        }
                                        if (i == profileActivity.R3) {
                                            return 20;
                                        }
                                        if (i != profileActivity.V4 && i != profileActivity.P4 && i != profileActivity.u4 && i != profileActivity.A4 && i != profileActivity.e3 && i != profileActivity.p3 && i != profileActivity.u3 && i != profileActivity.Q2 && i != profileActivity.c3 && i != profileActivity.Y2 && i != profileActivity.k4 && i != profileActivity.Z3 && i != profileActivity.c4 && i != profileActivity.S2 && i != profileActivity.a3 && i != profileActivity.N4 && i != profileActivity.x4 && i != profileActivity.M4 && i != profileActivity.s4) {
                                            if (i >= profileActivity.C4 && i < profileActivity.D4) {
                                                return 8;
                                            }
                                            if (i == profileActivity.B3) {
                                                return 11;
                                            }
                                            if (i == profileActivity.C3) {
                                                return 31;
                                            }
                                            if (i == profileActivity.D3) {
                                                return 12;
                                            }
                                            if (i == profileActivity.S4) {
                                                return 13;
                                            }
                                            if (i == profileActivity.A3) {
                                                return 14;
                                            }
                                            if (i != profileActivity.d3 && i != profileActivity.b3 && i != profileActivity.Z2) {
                                                if (i == profileActivity.e4) {
                                                    return 17;
                                                }
                                                if (i == profileActivity.f4) {
                                                    return 18;
                                                }
                                                if (i == profileActivity.g4) {
                                                    return 24;
                                                }
                                                if (i == profileActivity.Q3) {
                                                    return 21;
                                                }
                                                if (i == profileActivity.P3) {
                                                    return 22;
                                                }
                                                if (i == profileActivity.R2) {
                                                    return 23;
                                                }
                                                if (i == profileActivity.l4) {
                                                    return 25;
                                                }
                                                if (i == profileActivity.m4) {
                                                    return 34;
                                                }
                                                if (i >= profileActivity.n4 && i < profileActivity.o4) {
                                                    return 35;
                                                }
                                                if (i != profileActivity.p4) {
                                                    if (i != profileActivity.S3 && i != profileActivity.U3 && i != profileActivity.q4) {
                                                        if (i == profileActivity.r4) {
                                                            return 32;
                                                        }
                                                        if (i == profileActivity.t4) {
                                                            return 33;
                                                        }
                                                        if (i == profileActivity.T3) {
                                                            return 27;
                                                        }
                                                        if (i != profileActivity.F3 && i != profileActivity.G3) {
                                                            return 0;
                                                        }
                                                        return 28;
                                                    }
                                                    return 26;
                                                }
                                                return 4;
                                            }
                                            return 15;
                                        }
                                        return 7;
                                    }
                                    return 4;
                                }
                                return 4;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 19;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void t(defpackage.u69 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq8.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        njb jf5Var;
        boolean z;
        boolean z2;
        hjb hjbVar;
        int i2;
        float f;
        View hq8Var;
        fq8 fq8Var;
        int i3;
        int i4 = 1;
        Context context = this.c;
        ProfileActivity profileActivity = this.e;
        switch (i) {
            case 1:
                jf5Var = new jf5(this.c, cmb.K6, 18, 7, false, profileActivity.A0);
                break;
            case 2:
            case 19:
            case 30:
                ylb ylbVar = profileActivity.A0;
                if (i == 30) {
                    z = true;
                } else {
                    z = false;
                }
                if (i == 19) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                hjb hjbVar2 = new hjb(18, ylbVar, this.c, z, z2);
                hjbVar2.setContentDescriptionValueFirst(true);
                hjbVar = hjbVar2;
                jf5Var = hjbVar;
                break;
            case 3:
                fq8 fq8Var2 = new fq8(this, context, profileActivity, profileActivity.A0);
                profileActivity.o6 = fq8Var2;
                fq8Var = fq8Var2;
                jf5Var = fq8Var;
                break;
            case 4:
                fq8Var = new z92(this, context, profileActivity.A0);
                jf5Var = fq8Var;
                break;
            case 5:
                View aq3Var = new aq3(context, profileActivity.A0);
                aq3Var.setPadding(gm.L(20.0f), gm.L(4.0f), 0, 0);
                jf5Var = aq3Var;
                break;
            case 6:
                jf5Var = new yn7(context, 18, 70, false, profileActivity.A0);
                break;
            case 7:
                jf5Var = new bba(context, (hg9) null);
                break;
            case 8:
                if (profileActivity.E4 == -1) {
                    i2 = 9;
                } else {
                    i2 = 6;
                }
                hjbVar = new w8c(i2, 0, profileActivity.A0, this.c, true, false);
                jf5Var = hjbVar;
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                njb njbVar = new njb(10, profileActivity.A0, context);
                njbVar.getTextView().setGravity(1);
                anb.X(njbVar.getTextView(), cmb.z6, profileActivity.A0);
                njbVar.getTextView().setMovementMethod(null);
                njbVar.setText(gm.C0());
                njbVar.getTextView().setPadding(0, gm.L(14.0f), 0, gm.L(14.0f));
                jf5Var = njbVar;
                break;
            case 11:
            case 31:
                if (i == 31) {
                    f = 12.0f;
                } else {
                    f = 6.0f;
                }
                hq8Var = new hq8(context, gm.L(f));
                hq8Var.setTag(-33024);
                jf5Var = hq8Var;
                break;
            case 12:
                hq8Var = new iq8(this, context);
                hq8Var.setBackground(new ColorDrawable(0));
                hq8Var.setTag(-33024);
                jf5Var = hq8Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                View view = profileActivity.O;
                view.setTag(-33024);
                jf5Var = view;
                break;
            case 15:
                fq8Var = new kq8(this, context, profileActivity.A0);
                jf5Var = fq8Var;
                break;
            case 17:
                jf5Var = new njb(context, profileActivity.A0);
                break;
            case 18:
            case 24:
                if (i == 18) {
                    i4 = 0;
                }
                View tt8Var = new tt8(i4, profileActivity.A0, context);
                anb.h(cmb.c6, profileActivity.A0, tt8Var);
                jf5Var = tt8Var;
                break;
            case 20:
                jf5Var = new bjb(18, profileActivity.A0, context, false);
                break;
            case 21:
                View jt8Var = new jt8(context, profileActivity.A0);
                anb.h(cmb.c6, profileActivity.A0, jt8Var);
                jf5Var = jt8Var;
                break;
            case 22:
                View dt8Var = new dt8(context, profileActivity.A0);
                anb.h(cmb.c6, profileActivity.A0, dt8Var);
                jf5Var = dt8Var;
                break;
            case 23:
                jf5Var = new jr8(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                b61 b61Var = new b61(profileActivity.A0, context, true);
                b61Var.f();
                b61Var.i(jb6.M0(2131746441, null), false, true);
                b61Var.setOnClickListener(new zp8(this, (byte) 2));
                frameLayout.addView(b61Var, qoe.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                anb.h(cmb.c6, profileActivity.A0, frameLayout);
                fq8Var = frameLayout;
                jf5Var = fq8Var;
                break;
            case 26:
                jf5Var = new njb(context, profileActivity.A0);
                break;
            case 27:
                jf5Var = new yb(context, profileActivity.A0);
                break;
            case 28:
                View o72Var = new o72(context, (byte) 21);
                o72Var.setTag(-33024);
                jf5Var = o72Var;
                break;
            case 32:
                jf5Var = new wq8(profileActivity, context);
                break;
            case 33:
                jf5Var = new so2(context, profileActivity.A0);
                break;
            case 34:
                FrameLayout frameLayout2 = new FrameLayout(context);
                b61 b61Var2 = new b61(profileActivity.A0, context, true);
                b61Var2.f();
                b61Var2.i(jb6.M0(2131754302, null), false, true);
                b61Var2.setOnClickListener(new zp8(this, (byte) 0));
                frameLayout2.addView(b61Var2, qoe.d(-1, 48.0f, 119, 18.0f, 10.0f, 18.0f, 10.0f));
                frameLayout2.setBackgroundColor(cmb.v0(cmb.c6, profileActivity.A0));
                fq8Var = frameLayout2;
                jf5Var = fq8Var;
                break;
            case 35:
                i3 = ((d) profileActivity).currentAccount;
                jf5Var = new cd(i3, profileActivity.A0, context);
                break;
        }
        if (i != 13) {
            jf5Var.setLayoutParams(new g69(-1, -2));
        }
        return new u69(jf5Var);
    }

    @Override
    public final void y(u69 u69Var) {
        View view = u69Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof hjb) {
            ((hjb) view).a.setLoading(profileActivity.t5);
            ((hjb) view).b.setLoading(profileActivity.t5);
        }
    }

    @Override
    public final void z(u69 u69Var) {
        View view = u69Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
