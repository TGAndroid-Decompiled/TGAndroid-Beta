package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class nr8 extends n39 {
    public final Context c;
    public final pr8 d;

    public nr8(pr8 pr8Var, Context context) {
        this.d = pr8Var;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int b = s49Var.b();
        pr8 pr8Var = this.d;
        if (b == pr8Var.G) {
            return pr8Var.r;
        }
        if (s49Var.b() == pr8Var.Y) {
            return true;
        }
        switch (s49Var.f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return pr8Var.r;
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
        pr8 pr8Var = this.d;
        if (i != pr8Var.x && i != pr8Var.M && i != pr8Var.V && i != pr8Var.R) {
            if (i != pr8Var.H && i != pr8Var.I && i != pr8Var.K && i != pr8Var.J && i != pr8Var.S && i != pr8Var.T && i != pr8Var.Y) {
                if (i != pr8Var.P && i != pr8Var.X && i != pr8Var.L && i != pr8Var.U) {
                    if (i == pr8Var.W) {
                        return 3;
                    }
                    if (i != pr8Var.N && i != pr8Var.O) {
                        if (i == pr8Var.y) {
                            return 5;
                        }
                        if (i != pr8Var.E && i != pr8Var.Z) {
                            if (i == pr8Var.F || i == pr8Var.G || i == pr8Var.Q) {
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
    public final void t(s49 s49Var, int i) {
        int i2;
        String f0;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        TLObject K0;
        int i7;
        boolean z;
        int i8;
        pr8 pr8Var = this.d;
        wjb wjbVar = pr8Var.e;
        long j = pr8Var.h;
        long j2 = pr8Var.f;
        int i9 = s49Var.f;
        View view = s49Var.a;
        boolean z2 = true;
        boolean z3 = false;
        switch (i9) {
            case 0:
                ld5 ld5Var = (ld5) view;
                if (i == pr8Var.x) {
                    ld5Var.setText(k96.M0(2131750458, null));
                    return;
                } else if (i == pr8Var.M) {
                    ld5Var.setText(k96.M0(2131746446, null));
                    return;
                } else if (i == pr8Var.V) {
                    ld5Var.setText(k96.M0(2131747711, null));
                    return;
                } else if (i == pr8Var.R) {
                    ld5Var.setText(k96.M0(2131743037, null));
                    return;
                } else {
                    return;
                }
            case 1:
                uib uibVar = (uib) view;
                String p = im7.p(j2, j, false);
                i2 = ((d) pr8Var).currentAccount;
                SharedPreferences sharedPreferences = na7.q1(i2).W3;
                if (i == pr8Var.Y) {
                    uibVar.b(k96.M0(2131745911, null), false);
                    zkb.X(uibVar.getTextView(), bkb.p7, wjbVar);
                    return;
                }
                zkb.X(uibVar.getTextView(), bkb.F6, wjbVar);
                if (i == pr8Var.H) {
                    String string = sharedPreferences.getString(b00.h("sound_", p), k96.M0(2131745088, null));
                    long j3 = sharedPreferences.getLong("sound_document_id_" + p, 0L);
                    if (j3 != 0) {
                        TLRPC.Document c = pr8Var.getMediaDataController().A0.c(j3);
                        if (c == null) {
                            f0 = k96.M0(2131751667, null);
                        } else {
                            f0 = an7.f0(c, c.file_name_fixed);
                        }
                        string = f0;
                    } else if (string.equals("NoSound")) {
                        string = k96.M0(2131747959, null);
                    } else if (string.equals("Default")) {
                        string = k96.M0(2131745088, null);
                    }
                    uibVar.c(k96.M0(2131745091, null), string, false, true);
                    return;
                } else if (i == pr8Var.S) {
                    String string2 = sharedPreferences.getString(b00.h("ringtone_", p), k96.M0(2131751587, null));
                    if (string2.equals("NoSound")) {
                        string2 = k96.M0(2131747959, null);
                    }
                    uibVar.c(k96.M0(2131742999, null), string2, false, false);
                    return;
                } else if (i == pr8Var.I) {
                    int g = ls6.g("vibrate_", p, sharedPreferences, 0);
                    if (g != 0 && g != 4) {
                        if (g == 1) {
                            String M0 = k96.M0(2131743375, null);
                            String M02 = k96.M0(2131745174, null);
                            if (pr8Var.J == -1 && pr8Var.K == -1) {
                                z2 = false;
                            }
                            uibVar.c(M0, M02, false, z2);
                            return;
                        } else if (g == 2) {
                            String M03 = k96.M0(2131743375, null);
                            String M04 = k96.M0(2131743373, null);
                            if (pr8Var.J == -1 && pr8Var.K == -1) {
                                z2 = false;
                            }
                            uibVar.c(M03, M04, false, z2);
                            return;
                        } else if (g == 3) {
                            String M05 = k96.M0(2131743375, null);
                            String M06 = k96.M0(2131748531, null);
                            if (pr8Var.J == -1 && pr8Var.K == -1) {
                                z2 = false;
                            }
                            uibVar.c(M05, M06, false, z2);
                            return;
                        } else {
                            return;
                        }
                    }
                    String M07 = k96.M0(2131743375, null);
                    String M08 = k96.M0(2131743374, null);
                    if (pr8Var.J == -1 && pr8Var.K == -1) {
                        z2 = false;
                    }
                    uibVar.c(M07, M08, false, z2);
                    return;
                } else if (i == pr8Var.K) {
                    int g2 = ls6.g("priority_", p, sharedPreferences, 3);
                    if (g2 == 0) {
                        uibVar.c(k96.M0(2131747713, null), k96.M0(2131747690, null), false, false);
                        return;
                    } else if (g2 != 1 && g2 != 2) {
                        if (g2 == 3) {
                            uibVar.c(k96.M0(2131747713, null), k96.M0(2131747687, null), false, false);
                            return;
                        } else if (g2 == 4) {
                            uibVar.c(k96.M0(2131747713, null), k96.M0(2131747689, null), false, false);
                            return;
                        } else if (g2 == 5) {
                            uibVar.c(k96.M0(2131747713, null), k96.M0(2131747688, null), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        uibVar.c(k96.M0(2131747713, null), k96.M0(2131747686, null), false, false);
                        return;
                    }
                } else if (i == pr8Var.J) {
                    int g3 = ls6.g("smart_max_count_", p, sharedPreferences, 2);
                    int g4 = ls6.g("smart_delay_", p, sharedPreferences, 180);
                    if (g3 == 0) {
                        String M09 = k96.M0(2131745108, null);
                        String M010 = k96.M0(2131745107, null);
                        if (pr8Var.K == -1) {
                            z2 = false;
                        }
                        uibVar.c(M09, M010, false, z2);
                        return;
                    }
                    String G = k96.G(g4 / 60, "Minutes", new Object[0]);
                    String M011 = k96.M0(2131745108, null);
                    String a0 = k96.a0("SmartNotificationsInfo", null, 2131745106, Integer.valueOf(g3), G);
                    if (pr8Var.K == -1) {
                        z2 = false;
                    }
                    uibVar.c(M011, a0, false, z2);
                    return;
                } else if (i == pr8Var.T) {
                    int g5 = ls6.g("calls_vibrate_", p, sharedPreferences, 0);
                    if (g5 != 0 && g5 != 4) {
                        if (g5 == 1) {
                            uibVar.c(k96.M0(2131743375, null), k96.M0(2131745174, null), false, true);
                            return;
                        } else if (g5 == 2) {
                            uibVar.c(k96.M0(2131743375, null), k96.M0(2131743373, null), false, true);
                            return;
                        } else if (g5 == 3) {
                            uibVar.c(k96.M0(2131743375, null), k96.M0(2131748531, null), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    uibVar.c(k96.M0(2131743375, null), k96.M0(2131743374, null), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                mhb mhbVar = (mhb) view;
                mhbVar.setFixedSize(0);
                if (i == pr8Var.P) {
                    mhbVar.setText(k96.M0(2131746445, null));
                    return;
                } else if (i == pr8Var.X) {
                    mhbVar.setText(k96.M0(2131747709, null));
                    return;
                } else if (i == pr8Var.L) {
                    if (pr8Var.K == -1) {
                        mhbVar.setText("");
                        return;
                    } else {
                        mhbVar.setText(k96.M0(2131746678, null));
                        return;
                    }
                } else if (i == pr8Var.U) {
                    mhbVar.setText(k96.M0(2131743002, null));
                    return;
                } else {
                    return;
                }
            case 3:
                chb chbVar = (chb) view;
                String p2 = im7.p(j2, j, false);
                i3 = ((d) pr8Var).currentAccount;
                SharedPreferences sharedPreferences2 = na7.q1(i3).W3;
                if (sharedPreferences2.contains("color_" + p2)) {
                    i4 = ls6.g("color_", p2, sharedPreferences2, -16776961);
                } else if (cf3.y(j2)) {
                    i4 = sharedPreferences2.getInt("GroupLed", -16776961);
                } else {
                    i4 = sharedPreferences2.getInt("MessagesLed", -16776961);
                }
                int i10 = 0;
                while (true) {
                    if (i10 < 9) {
                        if (chb.f[i10] == i4) {
                            i4 = chb.e[i10];
                        } else {
                            i10++;
                        }
                    }
                }
                chbVar.b(i4, k96.M0(2131747710, null), false);
                return;
            case 4:
                vy8 vy8Var = (vy8) view;
                i5 = ((d) pr8Var).currentAccount;
                SharedPreferences sharedPreferences3 = na7.q1(i5).W3;
                int g6 = ls6.g("popup_", im7.p(j2, j, false), sharedPreferences3, 0);
                if (g6 == 0) {
                    if (cf3.y(j2)) {
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
                if (i == pr8Var.N) {
                    String M012 = k96.M0(2131746906, null);
                    if (g6 == 1) {
                        z3 = true;
                    }
                    vy8Var.c(M012, z3, true);
                    vy8Var.setTag(1);
                    return;
                } else if (i == pr8Var.O) {
                    String M013 = k96.M0(2131746907, null);
                    if (g6 != 2) {
                        z2 = false;
                    }
                    vy8Var.c(M013, z2, false);
                    vy8Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                u6c u6cVar = (u6c) view;
                if (cf3.D(j2)) {
                    i7 = ((d) pr8Var).currentAccount;
                    K0 = na7.q1(i7).V1(Long.valueOf(j2));
                } else {
                    i6 = ((d) pr8Var).currentAccount;
                    K0 = na7.q1(i6).K0(Long.valueOf(-j2));
                }
                u6cVar.a(null, K0);
                return;
            case 6:
                b9a b9aVar = (b9a) view;
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (i >= pr8Var.a0 - 1) {
                    z2 = false;
                }
                if (b9aVar.c != z || b9aVar.d != z2) {
                    b9aVar.c = z;
                    b9aVar.d = z2;
                    int i11 = b9aVar.b;
                    if (i11 == 0) {
                        b9aVar.setBackground(null);
                        return;
                    } else {
                        b9aVar.setBackgroundColor(i11);
                        return;
                    }
                }
                return;
            case 7:
                ahb ahbVar = (ahb) view;
                i8 = ((d) pr8Var).currentAccount;
                SharedPreferences sharedPreferences4 = na7.q1(i8).W3;
                if (i == pr8Var.F) {
                    ahbVar.f(k96.M0(2131747731, null), pr8Var.r, true);
                    return;
                } else if (i == pr8Var.G) {
                    String p3 = im7.p(j2, j, false);
                    ahbVar.f(k96.M0(2131748345, null), sharedPreferences4.getBoolean("content_preview_" + p3, true), true);
                    return;
                } else if (i == pr8Var.Q) {
                    String h = b00.h("stories_", im7.p(j2, j, false));
                    if (pr8Var.b0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                        z3 = true;
                    }
                    ahbVar.f(k96.M0(2131744507, null), sharedPreferences4.getBoolean(h, z3), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View ld5Var;
        wjb wjbVar = this.d.e;
        Context context = this.c;
        switch (i) {
            case 0:
                ld5Var = new ld5(context, wjbVar);
                zkb.h(bkb.c6, wjbVar, ld5Var);
                break;
            case 1:
                ld5Var = new uib(0, wjbVar, context);
                zkb.h(bkb.c6, wjbVar, ld5Var);
                break;
            case 2:
                ld5Var = new mhb(context, wjbVar);
                break;
            case 3:
                ld5Var = new chb(context, wjbVar);
                zkb.h(bkb.c6, wjbVar, ld5Var);
                break;
            case 4:
                ld5Var = new vy8(context, wjbVar);
                zkb.h(bkb.c6, wjbVar, ld5Var);
                break;
            case 5:
                ld5Var = new u6c(context, wjbVar);
                zkb.h(bkb.c6, wjbVar, ld5Var);
                break;
            case 6:
                ld5Var = new b9a(context, (de9) null);
                break;
            default:
                ld5Var = new ahb(context, wjbVar);
                zkb.h(bkb.c6, wjbVar, ld5Var);
                break;
        }
        return ls6.h(ld5Var, ld5Var, -1, -2);
    }

    @Override
    public final void y(s49 s49Var) {
        int i = s49Var.f;
        View view = s49Var.a;
        pr8 pr8Var = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 7) {
                                return;
                            }
                            ahb ahbVar = (ahb) view;
                            if (s49Var.b() == pr8Var.G) {
                                ahbVar.e(null, pr8Var.r);
                                return;
                            } else if (s49Var.b() == pr8Var.Q) {
                                ahbVar.e(null, pr8Var.r);
                                return;
                            } else {
                                ahbVar.e(null, true);
                                return;
                            }
                        }
                        ((vy8) view).b(null, pr8Var.r);
                        return;
                    }
                    ((chb) view).a(null, pr8Var.r);
                    return;
                }
                ((mhb) view).c(null, pr8Var.r);
                return;
            }
            uib uibVar = (uib) view;
            if (s49Var.b() == pr8Var.Y) {
                uibVar.a(null, true);
                return;
            } else {
                uibVar.a(null, pr8Var.r);
                return;
            }
        }
        ((ld5) view).a(null, pr8Var.r);
    }
}
