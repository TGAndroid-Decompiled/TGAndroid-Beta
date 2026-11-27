package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class xu8 extends c79 {
    public final Context c;
    public final zu8 d;

    public xu8(zu8 zu8Var, Context context) {
        this.d = zu8Var;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int b = f89Var.b();
        zu8 zu8Var = this.d;
        if (b == zu8Var.G) {
            return zu8Var.r;
        }
        if (f89Var.b() == zu8Var.Y) {
            return true;
        }
        switch (f89Var.f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return zu8Var.r;
            default:
                return true;
        }
    }

    @Override
    public final int b() {
        return this.d.a0;
    }

    @Override
    public final int d(int i) {
        zu8 zu8Var = this.d;
        if (i != zu8Var.x && i != zu8Var.M && i != zu8Var.V && i != zu8Var.R) {
            if (i != zu8Var.H && i != zu8Var.I && i != zu8Var.K && i != zu8Var.J && i != zu8Var.S && i != zu8Var.T && i != zu8Var.Y) {
                if (i != zu8Var.P && i != zu8Var.X && i != zu8Var.L && i != zu8Var.U) {
                    if (i == zu8Var.W) {
                        return 3;
                    }
                    if (i != zu8Var.N && i != zu8Var.O) {
                        if (i == zu8Var.y) {
                            return 5;
                        }
                        if (i != zu8Var.E && i != zu8Var.Z) {
                            if (i == zu8Var.F || i == zu8Var.G || i == zu8Var.Q) {
                                return 7;
                            }
                            return 0;
                        }
                        return 6;
                    }
                    return 4;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        int i2;
        String f0;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        TLObject M0;
        int i7;
        boolean z;
        int i8;
        zu8 zu8Var = this.d;
        vnb vnbVar = zu8Var.e;
        long j = zu8Var.h;
        long j2 = zu8Var.f;
        int i9 = f89Var.f;
        View view = f89Var.a;
        boolean z2 = true;
        boolean z3 = false;
        switch (i9) {
            case 0:
                mf5 mf5Var = (mf5) view;
                if (i == zu8Var.x) {
                    mf5Var.setText(ob6.M0(2131750435, null));
                    return;
                } else if (i == zu8Var.M) {
                    mf5Var.setText(ob6.M0(2131746366, null));
                    return;
                } else if (i == zu8Var.V) {
                    mf5Var.setText(ob6.M0(2131747631, null));
                    return;
                } else if (i == zu8Var.R) {
                    mf5Var.setText(ob6.M0(2131742931, null));
                    return;
                } else {
                    return;
                }
            case 1:
                qmb qmbVar = (qmb) view;
                String p = ip7.p(j2, j, false);
                i2 = ((e) zu8Var).currentAccount;
                SharedPreferences sharedPreferences = uc7.s1(i2).X3;
                if (i == zu8Var.Y) {
                    qmbVar.b(ob6.M0(2131745831, null), false);
                    yob.X(qmbVar.getTextView(), aob.q7, vnbVar);
                    return;
                }
                yob.X(qmbVar.getTextView(), aob.G6, vnbVar);
                if (i == zu8Var.H) {
                    String string = sharedPreferences.getString(c00.i("sound_", p), ob6.M0(2131745008, null));
                    long j3 = sharedPreferences.getLong("sound_document_id_" + p, 0L);
                    if (j3 != 0) {
                        TLRPC.Document c = zu8Var.getMediaDataController().A0.c(j3);
                        if (c == null) {
                            f0 = ob6.M0(2131751644, null);
                        } else {
                            f0 = aq7.f0(c, c.file_name_fixed);
                        }
                        string = f0;
                    } else if (string.equals("NoSound")) {
                        string = ob6.M0(2131747882, null);
                    } else if (string.equals("Default")) {
                        string = ob6.M0(2131745008, null);
                    }
                    qmbVar.c(ob6.M0(2131745011, null), string, false, true);
                    return;
                } else if (i == zu8Var.S) {
                    String string2 = sharedPreferences.getString(c00.i("ringtone_", p), ob6.M0(2131751564, null));
                    if (string2.equals("NoSound")) {
                        string2 = ob6.M0(2131747882, null);
                    }
                    qmbVar.c(ob6.M0(2131742893, null), string2, false, false);
                    return;
                } else if (i == zu8Var.I) {
                    int g = qu6.g("vibrate_", p, sharedPreferences, 0);
                    if (g != 0 && g != 4) {
                        if (g == 1) {
                            String M02 = ob6.M0(2131743269, null);
                            String M03 = ob6.M0(2131745094, null);
                            if (zu8Var.J == -1 && zu8Var.K == -1) {
                                z2 = false;
                            }
                            qmbVar.c(M02, M03, false, z2);
                            return;
                        } else if (g == 2) {
                            String M04 = ob6.M0(2131743269, null);
                            String M05 = ob6.M0(2131743267, null);
                            if (zu8Var.J == -1 && zu8Var.K == -1) {
                                z2 = false;
                            }
                            qmbVar.c(M04, M05, false, z2);
                            return;
                        } else if (g == 3) {
                            String M06 = ob6.M0(2131743269, null);
                            String M07 = ob6.M0(2131748477, null);
                            if (zu8Var.J == -1 && zu8Var.K == -1) {
                                z2 = false;
                            }
                            qmbVar.c(M06, M07, false, z2);
                            return;
                        } else {
                            return;
                        }
                    }
                    String M08 = ob6.M0(2131743269, null);
                    String M09 = ob6.M0(2131743268, null);
                    if (zu8Var.J == -1 && zu8Var.K == -1) {
                        z2 = false;
                    }
                    qmbVar.c(M08, M09, false, z2);
                    return;
                } else if (i == zu8Var.K) {
                    int g2 = qu6.g("priority_", p, sharedPreferences, 3);
                    if (g2 == 0) {
                        qmbVar.c(ob6.M0(2131747633, null), ob6.M0(2131747610, null), false, false);
                        return;
                    } else if (g2 != 1 && g2 != 2) {
                        if (g2 == 3) {
                            qmbVar.c(ob6.M0(2131747633, null), ob6.M0(2131747607, null), false, false);
                            return;
                        } else if (g2 == 4) {
                            qmbVar.c(ob6.M0(2131747633, null), ob6.M0(2131747609, null), false, false);
                            return;
                        } else if (g2 == 5) {
                            qmbVar.c(ob6.M0(2131747633, null), ob6.M0(2131747608, null), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        qmbVar.c(ob6.M0(2131747633, null), ob6.M0(2131747606, null), false, false);
                        return;
                    }
                } else if (i == zu8Var.J) {
                    int g3 = qu6.g("smart_max_count_", p, sharedPreferences, 2);
                    int g4 = qu6.g("smart_delay_", p, sharedPreferences, 180);
                    if (g3 == 0) {
                        String M010 = ob6.M0(2131745028, null);
                        String M011 = ob6.M0(2131745027, null);
                        if (zu8Var.K == -1) {
                            z2 = false;
                        }
                        qmbVar.c(M010, M011, false, z2);
                        return;
                    }
                    String G = ob6.G(g4 / 60, "Minutes", new Object[0]);
                    String M012 = ob6.M0(2131745028, null);
                    String a0 = ob6.a0("SmartNotificationsInfo", null, 2131745026, Integer.valueOf(g3), G);
                    if (zu8Var.K == -1) {
                        z2 = false;
                    }
                    qmbVar.c(M012, a0, false, z2);
                    return;
                } else if (i == zu8Var.T) {
                    int g5 = qu6.g("calls_vibrate_", p, sharedPreferences, 0);
                    if (g5 != 0 && g5 != 4) {
                        if (g5 == 1) {
                            qmbVar.c(ob6.M0(2131743269, null), ob6.M0(2131745094, null), false, true);
                            return;
                        } else if (g5 == 2) {
                            qmbVar.c(ob6.M0(2131743269, null), ob6.M0(2131743267, null), false, true);
                            return;
                        } else if (g5 == 3) {
                            qmbVar.c(ob6.M0(2131743269, null), ob6.M0(2131748477, null), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    qmbVar.c(ob6.M0(2131743269, null), ob6.M0(2131743268, null), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                ilb ilbVar = (ilb) view;
                ilbVar.setFixedSize(0);
                if (i == zu8Var.P) {
                    ilbVar.setText(ob6.M0(2131746365, null));
                    return;
                } else if (i == zu8Var.X) {
                    ilbVar.setText(ob6.M0(2131747629, null));
                    return;
                } else if (i == zu8Var.L) {
                    if (zu8Var.K == -1) {
                        ilbVar.setText("");
                        return;
                    } else {
                        ilbVar.setText(ob6.M0(2131746598, null));
                        return;
                    }
                } else if (i == zu8Var.U) {
                    ilbVar.setText(ob6.M0(2131742896, null));
                    return;
                } else {
                    return;
                }
            case 3:
                ykb ykbVar = (ykb) view;
                String p2 = ip7.p(j2, j, false);
                i3 = ((e) zu8Var).currentAccount;
                SharedPreferences sharedPreferences2 = uc7.s1(i3).X3;
                if (sharedPreferences2.contains("color_" + p2)) {
                    i4 = qu6.g("color_", p2, sharedPreferences2, -16776961);
                } else if (wf3.y(j2)) {
                    i4 = sharedPreferences2.getInt("GroupLed", -16776961);
                } else {
                    i4 = sharedPreferences2.getInt("MessagesLed", -16776961);
                }
                int i10 = 0;
                while (true) {
                    if (i10 < 9) {
                        if (ykb.f[i10] == i4) {
                            i4 = ykb.e[i10];
                        } else {
                            i10++;
                        }
                    }
                }
                ykbVar.b(i4, ob6.M0(2131747630, null), false);
                return;
            case 4:
                i29 i29Var = (i29) view;
                i5 = ((e) zu8Var).currentAccount;
                SharedPreferences sharedPreferences3 = uc7.s1(i5).X3;
                int g6 = qu6.g("popup_", ip7.p(j2, j, false), sharedPreferences3, 0);
                if (g6 == 0) {
                    if (wf3.y(j2)) {
                        str = "popupGroup";
                    } else {
                        str = "popupAll";
                    }
                    if (sharedPreferences3.getInt(str, 0) != 0) {
                        g6 = 1;
                    } else {
                        g6 = 2;
                    }
                }
                if (i == zu8Var.N) {
                    String M013 = ob6.M0(2131746826, null);
                    if (g6 == 1) {
                        z3 = true;
                    }
                    i29Var.c(M013, z3, true);
                    i29Var.setTag(1);
                    return;
                } else if (i == zu8Var.O) {
                    String M014 = ob6.M0(2131746827, null);
                    if (g6 != 2) {
                        z2 = false;
                    }
                    i29Var.c(M014, z2, false);
                    i29Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                uac uacVar = (uac) view;
                if (wf3.D(j2)) {
                    i7 = ((e) zu8Var).currentAccount;
                    M0 = uc7.s1(i7).X1(Long.valueOf(j2));
                } else {
                    i6 = ((e) zu8Var).currentAccount;
                    M0 = uc7.s1(i6).M0(Long.valueOf(-j2));
                }
                uacVar.a(null, M0);
                return;
            case 6:
                sca scaVar = (sca) view;
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (i >= zu8Var.a0 - 1) {
                    z2 = false;
                }
                if (scaVar.c != z || scaVar.d != z2) {
                    scaVar.c = z;
                    scaVar.d = z2;
                    int i11 = scaVar.b;
                    if (i11 == 0) {
                        scaVar.setBackground(null);
                        return;
                    } else {
                        scaVar.setBackgroundColor(i11);
                        return;
                    }
                }
                return;
            case 7:
                wkb wkbVar = (wkb) view;
                i8 = ((e) zu8Var).currentAccount;
                SharedPreferences sharedPreferences4 = uc7.s1(i8).X3;
                if (i == zu8Var.F) {
                    wkbVar.f(ob6.M0(2131747651, null), zu8Var.r, true);
                    return;
                } else if (i == zu8Var.G) {
                    String p3 = ip7.p(j2, j, false);
                    wkbVar.f(ob6.M0(2131748291, null), sharedPreferences4.getBoolean("content_preview_" + p3, true), true);
                    return;
                } else if (i == zu8Var.Q) {
                    String i12 = c00.i("stories_", ip7.p(j2, j, false));
                    if (zu8Var.b0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                        z3 = true;
                    }
                    wkbVar.f(ob6.M0(2131744401, null), sharedPreferences4.getBoolean(i12, z3), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View mf5Var;
        vnb vnbVar = this.d.e;
        Context context = this.c;
        switch (i) {
            case 0:
                mf5Var = new mf5(context, vnbVar);
                yob.h(aob.d6, vnbVar, mf5Var);
                break;
            case 1:
                mf5Var = new qmb(0, vnbVar, context);
                yob.h(aob.d6, vnbVar, mf5Var);
                break;
            case 2:
                mf5Var = new ilb(context, vnbVar);
                break;
            case 3:
                mf5Var = new ykb(context, vnbVar);
                yob.h(aob.d6, vnbVar, mf5Var);
                break;
            case 4:
                mf5Var = new i29(context, vnbVar);
                yob.h(aob.d6, vnbVar, mf5Var);
                break;
            case 5:
                mf5Var = new uac(context, vnbVar);
                yob.h(aob.d6, vnbVar, mf5Var);
                break;
            case 6:
                mf5Var = new sca(context, (uh9) null);
                break;
            default:
                mf5Var = new wkb(context, vnbVar);
                yob.h(aob.d6, vnbVar, mf5Var);
                break;
        }
        return qu6.h(mf5Var, mf5Var, -1, -2);
    }

    @Override
    public final void y(f89 f89Var) {
        int i = f89Var.f;
        View view = f89Var.a;
        zu8 zu8Var = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 7) {
                                return;
                            }
                            wkb wkbVar = (wkb) view;
                            if (f89Var.b() == zu8Var.G) {
                                wkbVar.e(null, zu8Var.r);
                                return;
                            } else if (f89Var.b() == zu8Var.Q) {
                                wkbVar.e(null, zu8Var.r);
                                return;
                            } else {
                                wkbVar.e(null, true);
                                return;
                            }
                        }
                        ((i29) view).b(null, zu8Var.r);
                        return;
                    }
                    ((ykb) view).a(null, zu8Var.r);
                    return;
                }
                ((ilb) view).c(null, zu8Var.r);
                return;
            }
            qmb qmbVar = (qmb) view;
            if (f89Var.b() == zu8Var.Y) {
                qmbVar.a(null, true);
                return;
            } else {
                qmbVar.a(null, zu8Var.r);
                return;
            }
        }
        ((mf5) view).a(null, zu8Var.r);
    }
}
