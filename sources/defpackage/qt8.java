package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class qt8 extends q59 {
    public final Context c;
    public final st8 d;

    public qt8(st8 st8Var, Context context) {
        this.d = st8Var;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int b = u69Var.b();
        st8 st8Var = this.d;
        if (b == st8Var.G) {
            return st8Var.r;
        }
        if (u69Var.b() == st8Var.Y) {
            return true;
        }
        switch (u69Var.f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return st8Var.r;
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
        st8 st8Var = this.d;
        if (i != st8Var.x && i != st8Var.M && i != st8Var.V && i != st8Var.R) {
            if (i != st8Var.H && i != st8Var.I && i != st8Var.K && i != st8Var.J && i != st8Var.S && i != st8Var.T && i != st8Var.Y) {
                if (i != st8Var.P && i != st8Var.X && i != st8Var.L && i != st8Var.U) {
                    if (i == st8Var.W) {
                        return 3;
                    }
                    if (i != st8Var.N && i != st8Var.O) {
                        if (i == st8Var.y) {
                            return 5;
                        }
                        if (i != st8Var.E && i != st8Var.Z) {
                            if (i == st8Var.F || i == st8Var.G || i == st8Var.Q) {
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
    public final void t(u69 u69Var, int i) {
        int i2;
        String g0;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        TLObject L0;
        int i7;
        boolean z;
        int i8;
        st8 st8Var = this.d;
        ylb ylbVar = st8Var.e;
        long j = st8Var.h;
        long j2 = st8Var.f;
        int i9 = u69Var.f;
        View view = u69Var.a;
        boolean z2 = true;
        boolean z3 = false;
        switch (i9) {
            case 0:
                jf5 jf5Var = (jf5) view;
                if (i == st8Var.x) {
                    jf5Var.setText(jb6.M0(2131750407, null));
                    return;
                } else if (i == st8Var.M) {
                    jf5Var.setText(jb6.M0(2131746372, null));
                    return;
                } else if (i == st8Var.V) {
                    jf5Var.setText(jb6.M0(2131747637, null));
                    return;
                } else if (i == st8Var.R) {
                    jf5Var.setText(jb6.M0(2131742963, null));
                    return;
                } else {
                    return;
                }
            case 1:
                vkb vkbVar = (vkb) view;
                String p = lo7.p(j2, j, false);
                i2 = ((d) st8Var).currentAccount;
                SharedPreferences sharedPreferences = oc7.r1(i2).W3;
                if (i == st8Var.Y) {
                    vkbVar.b(jb6.M0(2131745837, null), false);
                    anb.X(vkbVar.getTextView(), cmb.p7, ylbVar);
                    return;
                }
                anb.X(vkbVar.getTextView(), cmb.F6, ylbVar);
                if (i == st8Var.H) {
                    String string = sharedPreferences.getString(b10.h("sound_", p), jb6.M0(2131745014, null));
                    long j3 = sharedPreferences.getLong("sound_document_id_" + p, 0L);
                    if (j3 != 0) {
                        TLRPC.Document c = st8Var.getMediaDataController().A0.c(j3);
                        if (c == null) {
                            g0 = jb6.M0(2131751616, null);
                        } else {
                            g0 = ep7.g0(c, c.file_name_fixed);
                        }
                        string = g0;
                    } else if (string.equals("NoSound")) {
                        string = jb6.M0(2131747885, null);
                    } else if (string.equals("Default")) {
                        string = jb6.M0(2131745014, null);
                    }
                    vkbVar.c(jb6.M0(2131745017, null), string, false, true);
                    return;
                } else if (i == st8Var.S) {
                    String string2 = sharedPreferences.getString(b10.h("ringtone_", p), jb6.M0(2131751536, null));
                    if (string2.equals("NoSound")) {
                        string2 = jb6.M0(2131747885, null);
                    }
                    vkbVar.c(jb6.M0(2131742925, null), string2, false, false);
                    return;
                } else if (i == st8Var.I) {
                    int g = kt6.g("vibrate_", p, sharedPreferences, 0);
                    if (g != 0 && g != 4) {
                        if (g == 1) {
                            String M0 = jb6.M0(2131743301, null);
                            String M02 = jb6.M0(2131745100, null);
                            if (st8Var.J == -1 && st8Var.K == -1) {
                                z2 = false;
                            }
                            vkbVar.c(M0, M02, false, z2);
                            return;
                        } else if (g == 2) {
                            String M03 = jb6.M0(2131743301, null);
                            String M04 = jb6.M0(2131743299, null);
                            if (st8Var.J == -1 && st8Var.K == -1) {
                                z2 = false;
                            }
                            vkbVar.c(M03, M04, false, z2);
                            return;
                        } else if (g == 3) {
                            String M05 = jb6.M0(2131743301, null);
                            String M06 = jb6.M0(2131748480, null);
                            if (st8Var.J == -1 && st8Var.K == -1) {
                                z2 = false;
                            }
                            vkbVar.c(M05, M06, false, z2);
                            return;
                        } else {
                            return;
                        }
                    }
                    String M07 = jb6.M0(2131743301, null);
                    String M08 = jb6.M0(2131743300, null);
                    if (st8Var.J == -1 && st8Var.K == -1) {
                        z2 = false;
                    }
                    vkbVar.c(M07, M08, false, z2);
                    return;
                } else if (i == st8Var.K) {
                    int g2 = kt6.g("priority_", p, sharedPreferences, 3);
                    if (g2 == 0) {
                        vkbVar.c(jb6.M0(2131747639, null), jb6.M0(2131747616, null), false, false);
                        return;
                    } else if (g2 != 1 && g2 != 2) {
                        if (g2 == 3) {
                            vkbVar.c(jb6.M0(2131747639, null), jb6.M0(2131747613, null), false, false);
                            return;
                        } else if (g2 == 4) {
                            vkbVar.c(jb6.M0(2131747639, null), jb6.M0(2131747615, null), false, false);
                            return;
                        } else if (g2 == 5) {
                            vkbVar.c(jb6.M0(2131747639, null), jb6.M0(2131747614, null), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        vkbVar.c(jb6.M0(2131747639, null), jb6.M0(2131747612, null), false, false);
                        return;
                    }
                } else if (i == st8Var.J) {
                    int g3 = kt6.g("smart_max_count_", p, sharedPreferences, 2);
                    int g4 = kt6.g("smart_delay_", p, sharedPreferences, 180);
                    if (g3 == 0) {
                        String M09 = jb6.M0(2131745034, null);
                        String M010 = jb6.M0(2131745033, null);
                        if (st8Var.K == -1) {
                            z2 = false;
                        }
                        vkbVar.c(M09, M010, false, z2);
                        return;
                    }
                    String G = jb6.G(g4 / 60, "Minutes", new Object[0]);
                    String M011 = jb6.M0(2131745034, null);
                    String a0 = jb6.a0("SmartNotificationsInfo", null, 2131745032, Integer.valueOf(g3), G);
                    if (st8Var.K == -1) {
                        z2 = false;
                    }
                    vkbVar.c(M011, a0, false, z2);
                    return;
                } else if (i == st8Var.T) {
                    int g5 = kt6.g("calls_vibrate_", p, sharedPreferences, 0);
                    if (g5 != 0 && g5 != 4) {
                        if (g5 == 1) {
                            vkbVar.c(jb6.M0(2131743301, null), jb6.M0(2131745100, null), false, true);
                            return;
                        } else if (g5 == 2) {
                            vkbVar.c(jb6.M0(2131743301, null), jb6.M0(2131743299, null), false, true);
                            return;
                        } else if (g5 == 3) {
                            vkbVar.c(jb6.M0(2131743301, null), jb6.M0(2131748480, null), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    vkbVar.c(jb6.M0(2131743301, null), jb6.M0(2131743300, null), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                njb njbVar = (njb) view;
                njbVar.setFixedSize(0);
                if (i == st8Var.P) {
                    njbVar.setText(jb6.M0(2131746371, null));
                    return;
                } else if (i == st8Var.X) {
                    njbVar.setText(jb6.M0(2131747635, null));
                    return;
                } else if (i == st8Var.L) {
                    if (st8Var.K == -1) {
                        njbVar.setText("");
                        return;
                    } else {
                        njbVar.setText(jb6.M0(2131746604, null));
                        return;
                    }
                } else if (i == st8Var.U) {
                    njbVar.setText(jb6.M0(2131742928, null));
                    return;
                } else {
                    return;
                }
            case 3:
                djb djbVar = (djb) view;
                String p2 = lo7.p(j2, j, false);
                i3 = ((d) st8Var).currentAccount;
                SharedPreferences sharedPreferences2 = oc7.r1(i3).W3;
                if (sharedPreferences2.contains("color_" + p2)) {
                    i4 = kt6.g("color_", p2, sharedPreferences2, -16776961);
                } else if (pg3.y(j2)) {
                    i4 = sharedPreferences2.getInt("GroupLed", -16776961);
                } else {
                    i4 = sharedPreferences2.getInt("MessagesLed", -16776961);
                }
                int i10 = 0;
                while (true) {
                    if (i10 < 9) {
                        if (djb.f[i10] == i4) {
                            i4 = djb.e[i10];
                        } else {
                            i10++;
                        }
                    }
                }
                djbVar.b(i4, jb6.M0(2131747636, null), false);
                return;
            case 4:
                w09 w09Var = (w09) view;
                i5 = ((d) st8Var).currentAccount;
                SharedPreferences sharedPreferences3 = oc7.r1(i5).W3;
                int g6 = kt6.g("popup_", lo7.p(j2, j, false), sharedPreferences3, 0);
                if (g6 == 0) {
                    if (pg3.y(j2)) {
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
                if (i == st8Var.N) {
                    String M012 = jb6.M0(2131746832, null);
                    if (g6 == 1) {
                        z3 = true;
                    }
                    w09Var.c(M012, z3, true);
                    w09Var.setTag(1);
                    return;
                } else if (i == st8Var.O) {
                    String M013 = jb6.M0(2131746833, null);
                    if (g6 != 2) {
                        z2 = false;
                    }
                    w09Var.c(M013, z2, false);
                    w09Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                v8c v8cVar = (v8c) view;
                if (pg3.D(j2)) {
                    i7 = ((d) st8Var).currentAccount;
                    L0 = oc7.r1(i7).W1(Long.valueOf(j2));
                } else {
                    i6 = ((d) st8Var).currentAccount;
                    L0 = oc7.r1(i6).L0(Long.valueOf(-j2));
                }
                v8cVar.a(null, L0);
                return;
            case 6:
                bba bbaVar = (bba) view;
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (i >= st8Var.a0 - 1) {
                    z2 = false;
                }
                if (bbaVar.c != z || bbaVar.d != z2) {
                    bbaVar.c = z;
                    bbaVar.d = z2;
                    int i11 = bbaVar.b;
                    if (i11 == 0) {
                        bbaVar.setBackground(null);
                        return;
                    } else {
                        bbaVar.setBackgroundColor(i11);
                        return;
                    }
                }
                return;
            case 7:
                bjb bjbVar = (bjb) view;
                i8 = ((d) st8Var).currentAccount;
                SharedPreferences sharedPreferences4 = oc7.r1(i8).W3;
                if (i == st8Var.F) {
                    bjbVar.f(jb6.M0(2131747657, null), st8Var.r, true);
                    return;
                } else if (i == st8Var.G) {
                    String p3 = lo7.p(j2, j, false);
                    bjbVar.f(jb6.M0(2131748294, null), sharedPreferences4.getBoolean("content_preview_" + p3, true), true);
                    return;
                } else if (i == st8Var.Q) {
                    String h = b10.h("stories_", lo7.p(j2, j, false));
                    if (st8Var.b0 || (sharedPreferences4.contains("EnableAllStories") && sharedPreferences4.getBoolean("EnableAllStories", true))) {
                        z3 = true;
                    }
                    bjbVar.f(jb6.M0(2131744433, null), sharedPreferences4.getBoolean(h, z3), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View jf5Var;
        ylb ylbVar = this.d.e;
        Context context = this.c;
        switch (i) {
            case 0:
                jf5Var = new jf5(context, ylbVar);
                anb.h(cmb.c6, ylbVar, jf5Var);
                break;
            case 1:
                jf5Var = new vkb(0, ylbVar, context);
                anb.h(cmb.c6, ylbVar, jf5Var);
                break;
            case 2:
                jf5Var = new njb(context, ylbVar);
                break;
            case 3:
                jf5Var = new djb(context, ylbVar);
                anb.h(cmb.c6, ylbVar, jf5Var);
                break;
            case 4:
                jf5Var = new w09(context, ylbVar);
                anb.h(cmb.c6, ylbVar, jf5Var);
                break;
            case 5:
                jf5Var = new v8c(context, ylbVar);
                anb.h(cmb.c6, ylbVar, jf5Var);
                break;
            case 6:
                jf5Var = new bba(context, (hg9) null);
                break;
            default:
                jf5Var = new bjb(context, ylbVar);
                anb.h(cmb.c6, ylbVar, jf5Var);
                break;
        }
        return kt6.h(jf5Var, jf5Var, -1, -2);
    }

    @Override
    public final void y(u69 u69Var) {
        int i = u69Var.f;
        View view = u69Var.a;
        st8 st8Var = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 7) {
                                return;
                            }
                            bjb bjbVar = (bjb) view;
                            if (u69Var.b() == st8Var.G) {
                                bjbVar.e(null, st8Var.r);
                                return;
                            } else if (u69Var.b() == st8Var.Q) {
                                bjbVar.e(null, st8Var.r);
                                return;
                            } else {
                                bjbVar.e(null, true);
                                return;
                            }
                        }
                        ((w09) view).b(null, st8Var.r);
                        return;
                    }
                    ((djb) view).a(null, st8Var.r);
                    return;
                }
                ((njb) view).c(null, st8Var.r);
                return;
            }
            vkb vkbVar = (vkb) view;
            if (u69Var.b() == st8Var.Y) {
                vkbVar.a(null, true);
                return;
            } else {
                vkbVar.a(null, st8Var.r);
                return;
            }
        }
        ((jf5) view).a(null, st8Var.r);
    }
}
