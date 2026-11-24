package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class je2 extends q59 {
    public final Context c;
    public boolean d;
    public final ke2 e;

    public je2(ke2 ke2Var, Context context) {
        this.e = ke2Var;
        if (ke2Var.E == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        TLRPC.Chat chat;
        int i = u69Var.f;
        ke2 ke2Var = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = ke2Var.Q;
        int i2 = ke2Var.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = ke2Var.O;
        if (!ke2Var.x.creator || ((i2 != 0 && (i2 != 2 || !ke2Var.L)) || i != 4 || u69Var.b() != ke2Var.f0)) {
            if (ke2Var.J) {
                if ((i2 == 0 || i2 == 2) && i == 4) {
                    int b = u69Var.b();
                    if (b == ke2Var.X) {
                        if (!tL_chatAdminRights.add_admins && ((chat = ke2Var.x) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i2 != 2 || ke2Var.L) {
                        if (b == ke2Var.Y) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !ke2Var.F) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b == ke2Var.Z) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b == ke2Var.a0) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b == ke2Var.b0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b == ke2Var.c0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b == ke2Var.d0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b == ke2Var.L0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b == ke2Var.e0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b == ke2Var.f0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b == ke2Var.g0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b == ke2Var.h0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b == ke2Var.i0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b == ke2Var.j0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b == ke2Var.n0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b == ke2Var.V0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b == ke2Var.W0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b == ke2Var.X0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b == ke2Var.o0) {
                                    return tL_chatAdminRights.manage_linked_peers;
                                }
                            }
                        }
                    } else {
                        return false;
                    }
                }
                if (i == 3 || i == 1 || i == 5 || i == 8 || i == 11) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int b() {
        return this.e.W;
    }

    @Override
    public final long c(int i) {
        ke2 ke2Var = this.e;
        if (ke2Var.E == 2) {
            if (i == ke2Var.X) {
                return 1L;
            }
            if (i == ke2Var.Y) {
                return 2L;
            }
            if (i == ke2Var.Z) {
                return 3L;
            }
            if (i == ke2Var.c0) {
                return 4L;
            }
            if (i == ke2Var.d0) {
                return 5L;
            }
            if (i == ke2Var.e0) {
                return 6L;
            }
            if (i == ke2Var.f0) {
                return 7L;
            }
            if (i == ke2Var.g0) {
                return 8L;
            }
            if (i == ke2Var.h0) {
                return 9L;
            }
            if (i == ke2Var.i0) {
                return 10L;
            }
            if (i == ke2Var.p0) {
                return 11L;
            }
            if (i == ke2Var.q0) {
                return 12L;
            }
            if (i == ke2Var.r0) {
                return 13L;
            }
            if (i == ke2Var.s0) {
                return 14L;
            }
            if (i == ke2Var.t0) {
                return 15L;
            }
            if (i == ke2Var.u0) {
                return 16L;
            }
            if (i == ke2Var.v0) {
                return 17L;
            }
            if (i == ke2Var.w0) {
                return 18L;
            }
            if (i == ke2Var.x0) {
                return 19L;
            }
            if (i == ke2Var.z0) {
                return 20L;
            }
            if (i == ke2Var.C0) {
                return 21L;
            }
            if (i == ke2Var.I0) {
                return 22L;
            }
            if (i == ke2Var.J0) {
                return 23L;
            }
            if (i == ke2Var.K0) {
                return 24L;
            }
            if (i == ke2Var.L0) {
                return 25L;
            }
            if (i == ke2Var.M0) {
                return 26L;
            }
            if (i == ke2Var.N0) {
                return 27L;
            }
            if (i == ke2Var.y0) {
                return 28L;
            }
            if (i == ke2Var.n0) {
                return 29L;
            }
            if (i == ke2Var.D0) {
                return 30L;
            }
            if (i == ke2Var.F0) {
                return 31L;
            }
            if (i == ke2Var.E0) {
                return 32L;
            }
            if (i == ke2Var.G0) {
                return 33L;
            }
            if (i == ke2Var.H0) {
                return 34L;
            }
            if (i == ke2Var.A0) {
                return 35L;
            }
            if (i == ke2Var.O0) {
                return 36L;
            }
            if (i == ke2Var.Q0) {
                return 37L;
            }
            if (i == ke2Var.R0) {
                return 38L;
            }
            if (i == ke2Var.S0) {
                return 39L;
            }
            if (i == ke2Var.T0) {
                return 40L;
            }
            if (i == ke2Var.V0) {
                return 41L;
            }
            if (i == ke2Var.W0) {
                return 42L;
            }
            if (i == ke2Var.X0) {
                return 43L;
            }
            if (i == ke2Var.a0) {
                return 44L;
            }
            if (i == ke2Var.j0) {
                return 45L;
            }
            if (i == ke2Var.k0) {
                return 46L;
            }
            if (i == ke2Var.l0) {
                return 47L;
            }
            if (i == ke2Var.m0) {
                return 48L;
            }
            if (i == ke2Var.o0) {
                return 49L;
            }
            if (i == ke2Var.b0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int d(int i) {
        ke2 ke2Var = this.e;
        if (i != ke2Var.I0 && i != ke2Var.K0 && i != ke2Var.J0 && i != ke2Var.C0 && i != ke2Var.D0 && i != ke2Var.F0 && i != ke2Var.E0 && i != ke2Var.H0 && i != ke2Var.G0 && i != ke2Var.k0 && i != ke2Var.Q0 && i != ke2Var.R0 && i != ke2Var.S0 && i != ke2Var.V0 && i != ke2Var.W0 && i != ke2Var.X0) {
            if (i != ke2Var.A0 && i != ke2Var.O0 && i != ke2Var.T0) {
                if (i == 0) {
                    return 0;
                }
                if (i != 1 && i != ke2Var.p0 && i != ke2Var.r0 && i != ke2Var.M0 && i != ke2Var.t0) {
                    if (i != 2 && i != ke2Var.v0) {
                        if (i != ke2Var.Y && i != ke2Var.Z && i != ke2Var.a0 && i != ke2Var.c0 && i != ke2Var.d0 && i != ke2Var.e0 && i != ke2Var.g0 && i != ke2Var.h0 && i != ke2Var.i0 && i != ke2Var.j0 && i != ke2Var.z0 && i != ke2Var.f0 && i != ke2Var.L0 && i != ke2Var.X && i != ke2Var.n0 && i != ke2Var.l0 && i != ke2Var.o0 && i != ke2Var.b0) {
                            if (i == ke2Var.s0 || i == ke2Var.x0 || i == ke2Var.m0) {
                                return 1;
                            }
                            if (i == ke2Var.N0) {
                                return 6;
                            }
                            if (i == ke2Var.w0) {
                                return 11;
                            }
                            if (i != ke2Var.y0) {
                                return 2;
                            }
                            return 8;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 5;
            }
            return 9;
        }
        return 10;
    }

    @Override
    public final void t(defpackage.u69 r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je2.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View v8cVar;
        View jf5Var;
        int i2;
        int i3;
        ylb ylbVar;
        Context context = this.c;
        ke2 ke2Var = this.e;
        switch (i) {
            case 0:
                v8cVar = new v8c(context, null);
                anb.h(cmb.c6, null, v8cVar);
                break;
            case 1:
                v8cVar = new njb(context);
                break;
            case 2:
            default:
                v8cVar = new vkb(context);
                anb.h(cmb.c6, null, v8cVar);
                break;
            case 3:
                jf5Var = new jf5(this.c, cmb.K6, 21, 15, true, null);
                anb.h(cmb.c6, null, jf5Var);
                v8cVar = jf5Var;
                break;
            case 4:
            case 9:
                v8cVar = new ajb(context);
                anb.h(cmb.c6, null, v8cVar);
                break;
            case 5:
                v8cVar = new bba(context, (hg9) null);
                break;
            case 6:
                v8cVar = new hjb(null, context, false);
                anb.h(cmb.c6, null, v8cVar);
                break;
            case 7:
                ng8 ng8Var = new ng8(context, 0, null, null);
                anb.h(cmb.c6, null, ng8Var);
                ng8Var.c(new b7(this, (byte) 13));
                v8cVar = ng8Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                ke2Var.d = frameLayout;
                int i4 = cmb.Z6;
                anb.h(i4, null, frameLayout);
                ke2Var.e = new FrameLayout(context);
                io ioVar = new io(context, true, false, false);
                ke2Var.f = ioVar;
                ioVar.setTypeface(gm.o());
                ke2Var.f.setTextColor(-1);
                ke2Var.f.setTextSize(gm.L(14.0f));
                ke2Var.f.setGravity(17);
                io ioVar2 = ke2Var.f;
                StringBuilder sb = new StringBuilder(jb6.M0(2131754456, null));
                sb.append(" ");
                if (ke2Var.L) {
                    i2 = 2131754455;
                } else {
                    i2 = 2131754454;
                }
                sb.append(jb6.M0(i2, null));
                ioVar2.setText(sb.toString());
                ke2Var.e.addView(ke2Var.f, qoe.e(-2, -2, 17));
                ke2Var.e.setBackground(ulb.f(cmb.Ei, 4.0f));
                ke2Var.e.setOnClickListener(new k81(this, (byte) 15));
                ke2Var.d.addView(ke2Var.e, qoe.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                ke2Var.d.setLayoutParams(new g69(-1, -2));
                View view = new View(context);
                anb.h(i4, null, view);
                ke2Var.d.setClipChildren(false);
                ke2Var.d.setClipToPadding(false);
                ke2Var.d.addView(view, qoe.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                v8cVar = ke2Var.d;
                break;
            case 10:
                oh2 oh2Var = new oh2(this.c, 4, 21, false, ke2Var.getResourceProvider());
                oh2Var.setPad(1);
                oh2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                oh2Var.getCheckBoxRound().b(cmb.U6, cmb.f7, cmb.j7);
                oh2Var.setEnabled(true);
                anb.h(cmb.c6, null, oh2Var);
                v8cVar = oh2Var;
                break;
            case 11:
                i3 = ((d) ke2Var).currentAccount;
                ylbVar = ((d) ke2Var).resourceProvider;
                jf5Var = new xhb(i3, -ke2Var.s, ylbVar, this.c);
                v8cVar = jf5Var;
                break;
        }
        return new u69(v8cVar);
    }

    @Override
    public final void y(u69 u69Var) {
        int b = u69Var.b();
        ke2 ke2Var = this.e;
        if (b == ke2Var.v0) {
            ke2Var.r0(u69Var.a);
        }
    }

    @Override
    public final void z(u69 u69Var) {
        int b = u69Var.b();
        ke2 ke2Var = this.e;
        if (b == ke2Var.w0 && ke2Var.getParentActivity() != null) {
            gm.t1(ke2Var.getParentActivity().getCurrentFocus());
        }
    }
}
