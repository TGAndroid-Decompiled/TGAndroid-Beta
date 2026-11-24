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
import org.telegram.ui.ProfileActivity;
public final class ko8 extends n39 {
    public final Context c;
    public final HashMap d = new HashMap();
    public final ProfileActivity e;

    public ko8(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.c = context;
    }

    @Override
    public final void A(s49 s49Var) {
        int b = s49Var.b();
        ProfileActivity profileActivity = this.e;
        if (b == profileActivity.P2) {
            profileActivity.N2 = null;
        }
    }

    @Override
    public final boolean D(s49 s49Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.g3 != -1) {
            int b = s49Var.b();
            if (b != profileActivity.g3 && b != profileActivity.U2 && b != profileActivity.i3 && b != profileActivity.h3 && b != profileActivity.W2 && b != profileActivity.X2 && b != profileActivity.A3 && b != profileActivity.j3 && b != profileActivity.k3 && b != profileActivity.r3 && b != profileActivity.o3 && b != profileActivity.l3 && b != profileActivity.n3 && b != profileActivity.s3 && b != profileActivity.t3 && b != profileActivity.w3 && b != profileActivity.x3 && b != profileActivity.y3 && b != profileActivity.z3 && b != profileActivity.P2 && b != profileActivity.d4 && b != profileActivity.f4 && b != profileActivity.j4 && b != profileActivity.i4 && b != profileActivity.m3 && b != profileActivity.V2 && b != profileActivity.R2 && b != profileActivity.g4 && b != profileActivity.h4 && b != profileActivity.o4) {
                return false;
            }
        } else {
            View view = s49Var.a;
            if (view instanceof v6c) {
                Object currentObject = ((v6c) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && l7c.D((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i = s49Var.f;
            if (i == 1 || i == 5 || i == 7 || i == 11 || i == 31 || i == 28 || i == 12 || i == 13 || i == 9 || i == 10 || i == 25 || i == 32) {
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
                    SpannableString spannableString = new SpannableString(b00.h("@", tL_username.username));
                    HashMap hashMap = this.d;
                    ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                    if (clickableSpan == null) {
                        co8 co8Var = new co8(this, tL_username, tL_username.username);
                        hashMap.put(tL_username, co8Var);
                        clickableSpan = co8Var;
                    }
                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                    spannableString.setSpan(new cm4(bkb.Wc, this.e.A0), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i2 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String M0 = k96.M0(2131743429, null);
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
        if (i != profileActivity.E3 && i != profileActivity.w4 && i != profileActivity.f3 && i != profileActivity.T2 && i != profileActivity.q3 && i != profileActivity.v3 && i != profileActivity.q4) {
            if (i != profileActivity.H3 && i != profileActivity.J3 && i != profileActivity.U2 && i != profileActivity.V2) {
                if (i != profileActivity.M3 && i != profileActivity.W2) {
                    if (i == profileActivity.I3) {
                        return 30;
                    }
                    if (i != profileActivity.K3 && i != profileActivity.L3 && i != profileActivity.X2) {
                        if (i != profileActivity.t4 && i != profileActivity.u4 && i != profileActivity.W3 && i != profileActivity.Y3 && i != profileActivity.X3 && i != profileActivity.A4 && i != profileActivity.B4 && i != profileActivity.C4 && i != profileActivity.D4 && i != profileActivity.J4 && i != profileActivity.z4 && i != profileActivity.P4 && i != profileActivity.O4 && i != profileActivity.V3 && i != profileActivity.g3 && i != profileActivity.i3 && i != profileActivity.h3 && i != profileActivity.j3 && i != profileActivity.k3 && i != profileActivity.r3 && i != profileActivity.o3 && i != profileActivity.l3 && i != profileActivity.n3 && i != profileActivity.s3 && i != profileActivity.t3 && i != profileActivity.w3 && i != profileActivity.x3 && i != profileActivity.y3 && i != profileActivity.z3 && i != profileActivity.P2 && i != profileActivity.d4 && i != profileActivity.b4 && i != profileActivity.a4 && i != profileActivity.m3 && i != profileActivity.j4 && i != profileActivity.i4 && i != profileActivity.E4 && i != profileActivity.F4 && i != profileActivity.G4) {
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
                                        if (i != profileActivity.Q4 && i != profileActivity.K4 && i != profileActivity.p4 && i != profileActivity.v4 && i != profileActivity.e3 && i != profileActivity.p3 && i != profileActivity.u3 && i != profileActivity.Q2 && i != profileActivity.c3 && i != profileActivity.Y2 && i != profileActivity.k4 && i != profileActivity.Z3 && i != profileActivity.c4 && i != profileActivity.S2 && i != profileActivity.a3 && i != profileActivity.I4 && i != profileActivity.s4 && i != profileActivity.H4 && i != profileActivity.n4) {
                                            if (i >= profileActivity.x4 && i < profileActivity.y4) {
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
                                            if (i == profileActivity.N4) {
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
                                                if (i != profileActivity.S3 && i != profileActivity.U3) {
                                                    if (i == profileActivity.m4) {
                                                        return 32;
                                                    }
                                                    if (i == profileActivity.o4) {
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
    public final void t(defpackage.s49 r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko8.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        mhb ld5Var;
        boolean z;
        boolean z2;
        ghb ghbVar;
        int i2;
        float f;
        View go8Var;
        eo8 eo8Var;
        int i3 = 1;
        Context context = this.c;
        ProfileActivity profileActivity = this.e;
        switch (i) {
            case 1:
                ld5Var = new ld5(this.c, bkb.K6, 18, 7, false, profileActivity.A0);
                break;
            case 2:
            case 19:
            case 30:
                wjb wjbVar = profileActivity.A0;
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
                ghb ghbVar2 = new ghb(18, wjbVar, this.c, z, z2);
                ghbVar2.setContentDescriptionValueFirst(true);
                ghbVar = ghbVar2;
                ld5Var = ghbVar;
                break;
            case 3:
                eo8 eo8Var2 = new eo8(this, context, profileActivity, profileActivity.A0);
                profileActivity.j6 = eo8Var2;
                eo8Var = eo8Var2;
                ld5Var = eo8Var;
                break;
            case 4:
                eo8Var = new n82(this, context, profileActivity.A0);
                ld5Var = eo8Var;
                break;
            case 5:
                View qo3Var = new qo3(context, profileActivity.A0);
                qo3Var.setPadding(gl.L(20.0f), gl.L(4.0f), 0, 0);
                ld5Var = qo3Var;
                break;
            case 6:
                ld5Var = new vl7(context, 18, 70, false, profileActivity.A0);
                break;
            case 7:
                ld5Var = new b9a(context, (de9) null);
                break;
            case 8:
                if (profileActivity.z4 == -1) {
                    i2 = 9;
                } else {
                    i2 = 6;
                }
                ghbVar = new v6c(i2, 0, profileActivity.A0, this.c, true, false);
                ld5Var = ghbVar;
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                mhb mhbVar = new mhb(10, profileActivity.A0, context);
                mhbVar.getTextView().setGravity(1);
                zkb.X(mhbVar.getTextView(), bkb.z6, profileActivity.A0);
                mhbVar.getTextView().setMovementMethod(null);
                mhbVar.setText(gl.C0());
                mhbVar.getTextView().setPadding(0, gl.L(14.0f), 0, gl.L(14.0f));
                ld5Var = mhbVar;
                break;
            case 11:
            case 31:
                if (i == 31) {
                    f = 12.0f;
                } else {
                    f = 6.0f;
                }
                go8Var = new go8(context, gl.L(f));
                go8Var.setTag(-33024);
                ld5Var = go8Var;
                break;
            case 12:
                go8Var = new ho8(this, context);
                go8Var.setBackground(new ColorDrawable(0));
                go8Var.setTag(-33024);
                ld5Var = go8Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                View view = profileActivity.O;
                view.setTag(-33024);
                ld5Var = view;
                break;
            case 15:
                eo8Var = new jo8(this, context, profileActivity.A0);
                ld5Var = eo8Var;
                break;
            case 17:
                ld5Var = new mhb(context, profileActivity.A0);
                break;
            case 18:
            case 24:
                if (i == 18) {
                    i3 = 0;
                }
                View qr8Var = new qr8(i3, profileActivity.A0, context);
                zkb.h(bkb.c6, profileActivity.A0, qr8Var);
                ld5Var = qr8Var;
                break;
            case 20:
                ld5Var = new ahb(18, profileActivity.A0, context, false);
                break;
            case 21:
                View gr8Var = new gr8(context, profileActivity.A0);
                zkb.h(bkb.c6, profileActivity.A0, gr8Var);
                ld5Var = gr8Var;
                break;
            case 22:
                View br8Var = new br8(context, profileActivity.A0);
                zkb.h(bkb.c6, profileActivity.A0, br8Var);
                ld5Var = br8Var;
                break;
            case 23:
                ld5Var = new ip8(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                u41 u41Var = new u41(profileActivity.A0, context, true);
                u41Var.f();
                u41Var.i(k96.M0(2131746515, null), false, true);
                u41Var.setOnClickListener(new yn8(this, (byte) 0));
                frameLayout.addView(u41Var, nme.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                zkb.h(bkb.c6, profileActivity.A0, frameLayout);
                eo8Var = frameLayout;
                ld5Var = eo8Var;
                break;
            case 26:
                ld5Var = new mhb(context, profileActivity.A0);
                break;
            case 27:
                ld5Var = new yb(context, profileActivity.A0);
                break;
            case 28:
                View d62Var = new d62(context, (byte) 21);
                d62Var.setTag(-33024);
                ld5Var = d62Var;
                break;
            case 32:
                ld5Var = new vo8(profileActivity, context);
                break;
            case 33:
                ld5Var = new hn2(context, profileActivity.A0);
                break;
        }
        if (i != 13) {
            ld5Var.setLayoutParams(new e49(-1, -2));
        }
        return new s49(ld5Var);
    }

    @Override
    public final void y(s49 s49Var) {
        View view = s49Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof ghb) {
            ((ghb) view).a.setLoading(profileActivity.o5);
            ((ghb) view).b.setLoading(profileActivity.o5);
        }
    }

    @Override
    public final void z(s49 s49Var) {
        View view = s49Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
