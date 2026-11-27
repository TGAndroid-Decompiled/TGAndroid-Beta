package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class od2 extends c79 {
    public final Context c;
    public boolean d;
    public final pd2 e;

    public od2(pd2 pd2Var, Context context) {
        this.e = pd2Var;
        if (pd2Var.E == 2) {
            C(true);
        }
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        TLRPC.Chat chat;
        int i = f89Var.f;
        pd2 pd2Var = this.e;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = pd2Var.Q;
        int i2 = pd2Var.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = pd2Var.O;
        if (!pd2Var.x.creator || ((i2 != 0 && (i2 != 2 || !pd2Var.L)) || i != 4 || f89Var.b() != pd2Var.f0)) {
            if (pd2Var.J) {
                if ((i2 == 0 || i2 == 2) && i == 4) {
                    int b = f89Var.b();
                    if (b == pd2Var.X) {
                        if (!tL_chatAdminRights.add_admins && ((chat = pd2Var.x) == null || !chat.creator)) {
                            return false;
                        }
                    } else if (i2 != 2 || pd2Var.L) {
                        if (b == pd2Var.Y) {
                            if (tL_chatAdminRights.change_info) {
                                if (tL_chatBannedRights != null && !tL_chatBannedRights.change_info && !pd2Var.F) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (b == pd2Var.Z) {
                            return tL_chatAdminRights.post_messages;
                        } else {
                            if (b == pd2Var.a0) {
                                return tL_chatAdminRights.manage_direct_messages;
                            }
                            if (b == pd2Var.b0) {
                                return tL_chatAdminRights.manage_welcome_messages;
                            }
                            if (b == pd2Var.c0) {
                                return tL_chatAdminRights.edit_messages;
                            }
                            if (b == pd2Var.d0) {
                                return tL_chatAdminRights.delete_messages;
                            }
                            if (b == pd2Var.L0) {
                                return tL_chatAdminRights.manage_call;
                            }
                            if (b == pd2Var.e0) {
                                return tL_chatAdminRights.add_admins;
                            }
                            if (b == pd2Var.f0) {
                                return tL_chatAdminRights.anonymous;
                            }
                            if (b == pd2Var.g0) {
                                return tL_chatAdminRights.ban_users;
                            }
                            if (b == pd2Var.h0) {
                                return tL_chatAdminRights.invite_users;
                            }
                            if (b == pd2Var.i0) {
                                if (tL_chatAdminRights.pin_messages) {
                                    if (tL_chatBannedRights != null && !tL_chatBannedRights.pin_messages) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else if (b == pd2Var.j0) {
                                return tL_chatAdminRights.manage_ranks;
                            } else {
                                if (b == pd2Var.n0) {
                                    return tL_chatAdminRights.manage_topics;
                                }
                                if (b == pd2Var.V0) {
                                    return tL_chatAdminRights.post_stories;
                                }
                                if (b == pd2Var.W0) {
                                    return tL_chatAdminRights.edit_stories;
                                }
                                if (b == pd2Var.X0) {
                                    return tL_chatAdminRights.delete_stories;
                                }
                                if (b == pd2Var.o0) {
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
        pd2 pd2Var = this.e;
        if (pd2Var.E == 2) {
            if (i == pd2Var.X) {
                return 1L;
            }
            if (i == pd2Var.Y) {
                return 2L;
            }
            if (i == pd2Var.Z) {
                return 3L;
            }
            if (i == pd2Var.c0) {
                return 4L;
            }
            if (i == pd2Var.d0) {
                return 5L;
            }
            if (i == pd2Var.e0) {
                return 6L;
            }
            if (i == pd2Var.f0) {
                return 7L;
            }
            if (i == pd2Var.g0) {
                return 8L;
            }
            if (i == pd2Var.h0) {
                return 9L;
            }
            if (i == pd2Var.i0) {
                return 10L;
            }
            if (i == pd2Var.p0) {
                return 11L;
            }
            if (i == pd2Var.q0) {
                return 12L;
            }
            if (i == pd2Var.r0) {
                return 13L;
            }
            if (i == pd2Var.s0) {
                return 14L;
            }
            if (i == pd2Var.t0) {
                return 15L;
            }
            if (i == pd2Var.u0) {
                return 16L;
            }
            if (i == pd2Var.v0) {
                return 17L;
            }
            if (i == pd2Var.w0) {
                return 18L;
            }
            if (i == pd2Var.x0) {
                return 19L;
            }
            if (i == pd2Var.z0) {
                return 20L;
            }
            if (i == pd2Var.C0) {
                return 21L;
            }
            if (i == pd2Var.I0) {
                return 22L;
            }
            if (i == pd2Var.J0) {
                return 23L;
            }
            if (i == pd2Var.K0) {
                return 24L;
            }
            if (i == pd2Var.L0) {
                return 25L;
            }
            if (i == pd2Var.M0) {
                return 26L;
            }
            if (i == pd2Var.N0) {
                return 27L;
            }
            if (i == pd2Var.y0) {
                return 28L;
            }
            if (i == pd2Var.n0) {
                return 29L;
            }
            if (i == pd2Var.D0) {
                return 30L;
            }
            if (i == pd2Var.F0) {
                return 31L;
            }
            if (i == pd2Var.E0) {
                return 32L;
            }
            if (i == pd2Var.G0) {
                return 33L;
            }
            if (i == pd2Var.H0) {
                return 34L;
            }
            if (i == pd2Var.A0) {
                return 35L;
            }
            if (i == pd2Var.O0) {
                return 36L;
            }
            if (i == pd2Var.Q0) {
                return 37L;
            }
            if (i == pd2Var.R0) {
                return 38L;
            }
            if (i == pd2Var.S0) {
                return 39L;
            }
            if (i == pd2Var.T0) {
                return 40L;
            }
            if (i == pd2Var.V0) {
                return 41L;
            }
            if (i == pd2Var.W0) {
                return 42L;
            }
            if (i == pd2Var.X0) {
                return 43L;
            }
            if (i == pd2Var.a0) {
                return 44L;
            }
            if (i == pd2Var.j0) {
                return 45L;
            }
            if (i == pd2Var.k0) {
                return 46L;
            }
            if (i == pd2Var.l0) {
                return 47L;
            }
            if (i == pd2Var.m0) {
                return 48L;
            }
            if (i == pd2Var.o0) {
                return 49L;
            }
            if (i == pd2Var.b0) {
                return 50L;
            }
            return 0L;
        }
        return -1L;
    }

    @Override
    public final int d(int i) {
        pd2 pd2Var = this.e;
        if (i != pd2Var.I0 && i != pd2Var.K0 && i != pd2Var.J0 && i != pd2Var.C0 && i != pd2Var.D0 && i != pd2Var.F0 && i != pd2Var.E0 && i != pd2Var.H0 && i != pd2Var.G0 && i != pd2Var.k0 && i != pd2Var.Q0 && i != pd2Var.R0 && i != pd2Var.S0 && i != pd2Var.V0 && i != pd2Var.W0 && i != pd2Var.X0) {
            if (i != pd2Var.A0 && i != pd2Var.O0 && i != pd2Var.T0) {
                if (i == 0) {
                    return 0;
                }
                if (i != 1 && i != pd2Var.p0 && i != pd2Var.r0 && i != pd2Var.M0 && i != pd2Var.t0) {
                    if (i != 2 && i != pd2Var.v0) {
                        if (i != pd2Var.Y && i != pd2Var.Z && i != pd2Var.a0 && i != pd2Var.c0 && i != pd2Var.d0 && i != pd2Var.e0 && i != pd2Var.g0 && i != pd2Var.h0 && i != pd2Var.i0 && i != pd2Var.j0 && i != pd2Var.z0 && i != pd2Var.f0 && i != pd2Var.L0 && i != pd2Var.X && i != pd2Var.n0 && i != pd2Var.l0 && i != pd2Var.o0 && i != pd2Var.b0) {
                            if (i == pd2Var.s0 || i == pd2Var.x0 || i == pd2Var.m0) {
                                return 1;
                            }
                            if (i == pd2Var.N0) {
                                return 6;
                            }
                            if (i == pd2Var.w0) {
                                return 11;
                            }
                            if (i != pd2Var.y0) {
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
    public final void t(defpackage.f89 r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View uacVar;
        View mf5Var;
        int i2;
        int i3;
        vnb vnbVar;
        Context context = this.c;
        pd2 pd2Var = this.e;
        switch (i) {
            case 0:
                uacVar = new uac(context, null);
                yob.h(aob.d6, null, uacVar);
                break;
            case 1:
                uacVar = new ilb(context);
                break;
            case 2:
            default:
                uacVar = new qmb(context);
                yob.h(aob.d6, null, uacVar);
                break;
            case 3:
                mf5Var = new mf5(this.c, aob.L6, 21, 15, true, null);
                yob.h(aob.d6, null, mf5Var);
                uacVar = mf5Var;
                break;
            case 4:
            case 9:
                uacVar = new vkb(context);
                yob.h(aob.d6, null, uacVar);
                break;
            case 5:
                uacVar = new sca(context, (uh9) null);
                break;
            case 6:
                uacVar = new clb(null, context, false);
                yob.h(aob.d6, null, uacVar);
                break;
            case 7:
                zh8 zh8Var = new zh8(context, 0, null, null);
                yob.h(aob.d6, null, zh8Var);
                zh8Var.c(new c7(this, (byte) 12));
                uacVar = zh8Var;
                break;
            case 8:
                FrameLayout frameLayout = new FrameLayout(context);
                pd2Var.d = frameLayout;
                int i4 = aob.a7;
                yob.h(i4, null, frameLayout);
                pd2Var.e = new FrameLayout(context);
                in inVar = new in(context, true, false, false);
                pd2Var.f = inVar;
                inVar.setTypeface(hl.o());
                pd2Var.f.setTextColor(-1);
                pd2Var.f.setTextSize(hl.L(14.0f));
                pd2Var.f.setGravity(17);
                in inVar2 = pd2Var.f;
                StringBuilder sb = new StringBuilder(ob6.M0(2131754452, null));
                sb.append(" ");
                if (pd2Var.L) {
                    i2 = 2131754451;
                } else {
                    i2 = 2131754450;
                }
                sb.append(ob6.M0(i2, null));
                inVar2.setText(sb.toString());
                pd2Var.e.addView(pd2Var.f, tre.e(-2, -2, 17));
                pd2Var.e.setBackground(rnb.f(aob.Fi, 4.0f));
                pd2Var.e.setOnClickListener(new r81(this, (byte) 14));
                pd2Var.d.addView(pd2Var.e, tre.d(-1, 48.0f, 119, 14.0f, 28.0f, 14.0f, 14.0f));
                pd2Var.d.setLayoutParams(new r79(-1, -2));
                View view = new View(context);
                yob.h(i4, null, view);
                pd2Var.d.setClipChildren(false);
                pd2Var.d.setClipToPadding(false);
                pd2Var.d.addView(view, tre.d(-1, 800.0f, 87, 0.0f, 0.0f, 0.0f, -800.0f));
                uacVar = pd2Var.d;
                break;
            case 10:
                sg2 sg2Var = new sg2(this.c, 4, 21, false, pd2Var.getResourceProvider());
                sg2Var.setPad(1);
                sg2Var.getCheckBoxRound().setDrawBackgroundAsArc(14);
                sg2Var.getCheckBoxRound().b(aob.V6, aob.g7, aob.k7);
                sg2Var.setEnabled(true);
                yob.h(aob.d6, null, sg2Var);
                uacVar = sg2Var;
                break;
            case 11:
                i3 = ((e) pd2Var).currentAccount;
                vnbVar = ((e) pd2Var).resourceProvider;
                mf5Var = new sjb(i3, -pd2Var.s, vnbVar, this.c);
                uacVar = mf5Var;
                break;
        }
        return new f89(uacVar);
    }

    @Override
    public final void y(f89 f89Var) {
        int b = f89Var.b();
        pd2 pd2Var = this.e;
        if (b == pd2Var.v0) {
            pd2Var.q0(f89Var.a);
        }
    }

    @Override
    public final void z(f89 f89Var) {
        int b = f89Var.b();
        pd2 pd2Var = this.e;
        if (b == pd2Var.w0 && pd2Var.getParentActivity() != null) {
            hl.t1(pd2Var.getParentActivity().getCurrentFocus());
        }
    }
}
