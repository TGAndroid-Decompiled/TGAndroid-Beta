package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class yc2 extends n39 {
    public final Context c;
    public boolean d;
    public final zc2 e;

    public yc2(zc2 zc2Var, Context context) {
        this.e = zc2Var;
        if (zc2Var.E == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        TLRPC.Chat chat;
        int i = s49Var.f;
        zc2 zc2Var = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = zc2Var.Q;
        int i2 = zc2Var.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = zc2Var.O;
        if (!zc2Var.x.creator || ((i2 != 0 && (i2 != 2 || !zc2Var.L)) || i != 4 || s49Var.b() != zc2Var.f0)) {
            if (zc2Var.J) {
                if ((i2 == 0 || i2 == 2) && i == 4) {
                    int b = s49Var.b();
                    if (b == zc2Var.X) {
                        if (!tL_chatAdminRights.add_admins && ((chat = zc2Var.x) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i2 != 2 || zc2Var.L) {
                        if (b == zc2Var.Y) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !zc2Var.F) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b == zc2Var.Z) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b == zc2Var.a0) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b == zc2Var.b0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b == zc2Var.c0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b == zc2Var.d0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b == zc2Var.L0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b == zc2Var.e0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b == zc2Var.f0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b == zc2Var.g0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b == zc2Var.h0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b == zc2Var.i0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b == zc2Var.j0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b == zc2Var.n0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b == zc2Var.V0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b == zc2Var.W0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b == zc2Var.X0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b == zc2Var.o0) {
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
        zc2 zc2Var = this.e;
        if (zc2Var.E == 2) {
            if (i == zc2Var.X) {
                return 1L;
            }
            if (i == zc2Var.Y) {
                return 2L;
            }
            if (i == zc2Var.Z) {
                return 3L;
            }
            if (i == zc2Var.c0) {
                return 4L;
            }
            if (i == zc2Var.d0) {
                return 5L;
            }
            if (i == zc2Var.e0) {
                return 6L;
            }
            if (i == zc2Var.f0) {
                return 7L;
            }
            if (i == zc2Var.g0) {
                return 8L;
            }
            if (i == zc2Var.h0) {
                return 9L;
            }
            if (i == zc2Var.i0) {
                return 10L;
            }
            if (i == zc2Var.p0) {
                return 11L;
            }
            if (i == zc2Var.q0) {
                return 12L;
            }
            if (i == zc2Var.r0) {
                return 13L;
            }
            if (i == zc2Var.s0) {
                return 14L;
            }
            if (i == zc2Var.t0) {
                return 15L;
            }
            if (i == zc2Var.u0) {
                return 16L;
            }
            if (i == zc2Var.v0) {
                return 17L;
            }
            if (i == zc2Var.w0) {
                return 18L;
            }
            if (i == zc2Var.x0) {
                return 19L;
            }
            if (i == zc2Var.z0) {
                return 20L;
            }
            if (i == zc2Var.C0) {
                return 21L;
            }
            if (i == zc2Var.I0) {
                return 22L;
            }
            if (i == zc2Var.J0) {
                return 23L;
            }
            if (i == zc2Var.K0) {
                return 24L;
            }
            if (i == zc2Var.L0) {
                return 25L;
            }
            if (i == zc2Var.M0) {
                return 26L;
            }
            if (i == zc2Var.N0) {
                return 27L;
            }
            if (i == zc2Var.y0) {
                return 28L;
            }
            if (i == zc2Var.n0) {
                return 29L;
            }
            if (i == zc2Var.D0) {
                return 30L;
            }
            if (i == zc2Var.F0) {
                return 31L;
            }
            if (i == zc2Var.E0) {
                return 32L;
            }
            if (i == zc2Var.G0) {
                return 33L;
            }
            if (i == zc2Var.H0) {
                return 34L;
            }
            if (i == zc2Var.A0) {
                return 35L;
            }
            if (i == zc2Var.O0) {
                return 36L;
            }
            if (i == zc2Var.Q0) {
                return 37L;
            }
            if (i == zc2Var.R0) {
                return 38L;
            }
            if (i == zc2Var.S0) {
                return 39L;
            }
            if (i == zc2Var.T0) {
                return 40L;
            }
            if (i == zc2Var.V0) {
                return 41L;
            }
            if (i == zc2Var.W0) {
                return 42L;
            }
            if (i == zc2Var.X0) {
                return 43L;
            }
            if (i == zc2Var.a0) {
                return 44L;
            }
            if (i == zc2Var.j0) {
                return 45L;
            }
            if (i == zc2Var.k0) {
                return 46L;
            }
            if (i == zc2Var.l0) {
                return 47L;
            }
            if (i == zc2Var.m0) {
                return 48L;
            }
            if (i == zc2Var.o0) {
                return 49L;
            }
            if (i == zc2Var.b0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int d(int i) {
        zc2 zc2Var = this.e;
        if (i != zc2Var.I0 && i != zc2Var.K0 && i != zc2Var.J0 && i != zc2Var.C0 && i != zc2Var.D0 && i != zc2Var.F0 && i != zc2Var.E0 && i != zc2Var.H0 && i != zc2Var.G0 && i != zc2Var.k0 && i != zc2Var.Q0 && i != zc2Var.R0 && i != zc2Var.S0 && i != zc2Var.V0 && i != zc2Var.W0 && i != zc2Var.X0) {
            if (i != zc2Var.A0 && i != zc2Var.O0 && i != zc2Var.T0) {
                if (i == 0) {
                    return 0;
                }
                if (i != 1 && i != zc2Var.p0 && i != zc2Var.r0 && i != zc2Var.M0 && i != zc2Var.t0) {
                    if (i != 2 && i != zc2Var.v0) {
                        if (i != zc2Var.Y && i != zc2Var.Z && i != zc2Var.a0 && i != zc2Var.c0 && i != zc2Var.d0 && i != zc2Var.e0 && i != zc2Var.g0 && i != zc2Var.h0 && i != zc2Var.i0 && i != zc2Var.j0 && i != zc2Var.z0 && i != zc2Var.f0 && i != zc2Var.L0 && i != zc2Var.X && i != zc2Var.n0 && i != zc2Var.l0 && i != zc2Var.o0 && i != zc2Var.b0) {
                            if (i == zc2Var.s0 || i == zc2Var.x0 || i == zc2Var.m0) {
                                return 1;
                            }
                            if (i == zc2Var.N0) {
                                return 6;
                            }
                            if (i == zc2Var.w0) {
                                return 11;
                            }
                            if (i != zc2Var.y0) {
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
    public final void t(defpackage.s49 r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc2.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View u6cVar;
        View ld5Var;
        int i2;
        int i3;
        wjb wjbVar;
        Context context = this.c;
        zc2 zc2Var = this.e;
        switch (i) {
            case 0:
                u6cVar = new u6c(context, null);
                zkb.h(bkb.c6, null, u6cVar);
                break;
            case 1:
                u6cVar = new mhb(context);
                break;
            case 2:
            default:
                u6cVar = new uib(context);
                zkb.h(bkb.c6, null, u6cVar);
                break;
            case 3:
                ld5Var = new ld5(this.c, bkb.K6, 21, 15, true, null);
                zkb.h(bkb.c6, null, ld5Var);
                u6cVar = ld5Var;
                break;
            case 4:
            case 9:
                u6cVar = new zgb(context);
                zkb.h(bkb.c6, null, u6cVar);
                break;
            case 5:
                u6cVar = new b9a(context, (de9) null);
                break;
            case 6:
                u6cVar = new ghb(null, context, false);
                zkb.h(bkb.c6, null, u6cVar);
                break;
            case 7:
                le8 le8Var = new le8(context, 0, null, null);
                zkb.h(bkb.c6, null, le8Var);
                le8Var.c(new b7(this, (byte) 12));
                u6cVar = le8Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                zc2Var.d = frameLayout;
                int i4 = bkb.Z6;
                zkb.h(i4, null, frameLayout);
                zc2Var.e = new FrameLayout(context);
                hn hnVar = new hn(context, true, false, false);
                zc2Var.f = hnVar;
                hnVar.setTypeface(gl.o());
                zc2Var.f.setTextColor(-1);
                zc2Var.f.setTextSize(gl.L(14.0f));
                zc2Var.f.setGravity(17);
                hn hnVar2 = zc2Var.f;
                StringBuilder sb = new StringBuilder(k96.M0(2131754456, null));
                sb.append(" ");
                if (zc2Var.L) {
                    i2 = 2131754455;
                } else {
                    i2 = 2131754454;
                }
                sb.append(k96.M0(i2, null));
                hnVar2.setText(sb.toString());
                zc2Var.e.addView(zc2Var.f, nme.e(-2, -2, 17));
                zc2Var.e.setBackground(sjb.f(bkb.Ei, 4.0f));
                zc2Var.e.setOnClickListener(new x91(this, (byte) 12));
                zc2Var.d.addView(zc2Var.e, nme.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                zc2Var.d.setLayoutParams(new e49(-1, -2));
                View view = new View(context);
                zkb.h(i4, null, view);
                zc2Var.d.setClipChildren(false);
                zc2Var.d.setClipToPadding(false);
                zc2Var.d.addView(view, nme.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                u6cVar = zc2Var.d;
                break;
            case 10:
                ag2 ag2Var = new ag2(this.c, 4, 21, false, zc2Var.getResourceProvider());
                ag2Var.setPad(1);
                ag2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                ag2Var.getCheckBoxRound().b(bkb.U6, bkb.f7, bkb.j7);
                ag2Var.setEnabled(true);
                zkb.h(bkb.c6, null, ag2Var);
                u6cVar = ag2Var;
                break;
            case 11:
                i3 = ((d) zc2Var).currentAccount;
                wjbVar = ((d) zc2Var).resourceProvider;
                ld5Var = new wfb(i3, -zc2Var.s, wjbVar, this.c);
                u6cVar = ld5Var;
                break;
        }
        return new s49(u6cVar);
    }

    @Override
    public final void y(s49 s49Var) {
        int b = s49Var.b();
        zc2 zc2Var = this.e;
        if (b == zc2Var.v0) {
            zc2Var.q0(s49Var.a);
        }
    }

    @Override
    public final void z(s49 s49Var) {
        int b = s49Var.b();
        zc2 zc2Var = this.e;
        if (b == zc2Var.w0 && zc2Var.getParentActivity() != null) {
            gl.t1(zc2Var.getParentActivity().getCurrentFocus());
        }
    }
}
