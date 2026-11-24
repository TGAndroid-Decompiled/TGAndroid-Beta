package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class od3 implements s8c, d39, vc7 {
    public final byte a;
    public final sd3 b;

    public od3(sd3 sd3Var, byte b) {
        this.a = b;
        this.b = sd3Var;
    }

    @Override
    public final void d(int r18, org.telegram.tgnet.TLObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od3.d(int, org.telegram.tgnet.TLObject):void");
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        boolean z;
        boolean[] zArr;
        sd3 sd3Var = this.b;
        c4c G = sd3Var.S1.G(i - 1);
        if (G != null) {
            rd3 rd3Var = sd3Var.f2;
            rd3 rd3Var2 = sd3Var.e2;
            rd3 rd3Var3 = sd3Var.d2;
            rd3 rd3Var4 = sd3Var.g2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights = sd3Var.r2;
            int i2 = G.d;
            if (i2 == 103) {
                boolean z2 = !sd3Var.k2;
                sd3Var.k2 = z2;
                ((zgb) view).setChecked(z2);
                return;
            }
            int i3 = G.a;
            if (i3 == 37) {
                int i4 = i2 >>> 24;
                int i5 = 16777215 & i2;
                if (i4 == 0) {
                    rd3Var3.g(i5);
                } else if (i4 == 1) {
                    rd3Var2.g(i5);
                    sd3Var.b1();
                } else if (i2 == 3) {
                    rd3Var.g(i5);
                    sd3Var.b1();
                } else if (i4 == 2) {
                    rd3Var4.g(i5);
                }
            } else if (i3 != 36 && i3 != 35) {
                if (i3 == 39) {
                    if (G.u) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sd3Var.getContext());
                        String M0 = k96.M0(2131743480, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131743479, null);
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        hdVar.show();
                        return;
                    }
                    if (i2 == 2) {
                        tL_chatBannedRights.invite_users = !tL_chatBannedRights.invite_users;
                        sd3Var.c1();
                    } else if (i2 == 3) {
                        tL_chatBannedRights.pin_messages = !tL_chatBannedRights.pin_messages;
                        sd3Var.c1();
                    } else if (i2 == 4) {
                        tL_chatBannedRights.change_info = !tL_chatBannedRights.change_info;
                        sd3Var.c1();
                    } else if (i2 == 5) {
                        tL_chatBannedRights.manage_topics = !tL_chatBannedRights.manage_topics;
                        sd3Var.c1();
                    } else if (i2 == 0) {
                        tL_chatBannedRights.send_plain = !tL_chatBannedRights.send_plain;
                        sd3Var.c1();
                    }
                    sd3Var.S1.O(true);
                } else if (i3 == 40) {
                    sd3Var.t2 = !sd3Var.t2;
                    sd3Var.S0();
                    sd3Var.S1.O(true);
                    sd3Var.D0();
                } else if (i2 == 100) {
                    sd3Var.w2 = false;
                    boolean z3 = !sd3Var.x2;
                    sd3Var.x2 = z3;
                    sd3Var.y2 = z3;
                    sd3Var.S0();
                    sd3Var.S1.O(true);
                    sd3Var.D0();
                    sd3Var.b1();
                } else if (i3 == 38) {
                    boolean z4 = sd3Var.b2;
                    sd3Var.b2 = !z4;
                    if (!z4) {
                        zArr = sd3Var.i2;
                    } else {
                        zArr = sd3Var.h2;
                    }
                    if (rd3Var4.g != 0) {
                        rd3Var4.e = zArr;
                        rd3Var4.h();
                        rd3Var4.i();
                    }
                    sd3Var.S1.O(true);
                    sd3Var.c1();
                }
            } else if (i2 == 0) {
                rd3Var3.f();
            } else if (i2 == 1) {
                rd3Var2.f();
                sd3Var.b1();
            } else if (i2 == 3) {
                rd3Var.f();
                sd3Var.b1();
            } else if (i2 == 2) {
                rd3Var4.f();
            } else if (i3 == 35) {
                if (G.u) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(sd3Var.getContext());
                    String M02 = k96.M0(2131743480, null);
                    hd hdVar2 = alertDialog$Builder2.a;
                    hdVar2.S = M02;
                    hdVar2.U = k96.M0(2131743479, null);
                    alertDialog$Builder2.j(k96.M0(2131747638, null), null);
                    hdVar2.show();
                    return;
                }
                if (i2 == 6) {
                    z = true;
                    tL_chatBannedRights.send_photos = !tL_chatBannedRights.send_photos;
                    sd3Var.c1();
                } else {
                    z = true;
                    if (i2 == 7) {
                        tL_chatBannedRights.send_videos = !tL_chatBannedRights.send_videos;
                        sd3Var.c1();
                    } else if (i2 == 9) {
                        tL_chatBannedRights.send_audios = !tL_chatBannedRights.send_audios;
                        sd3Var.c1();
                    } else if (i2 == 8) {
                        tL_chatBannedRights.send_docs = !tL_chatBannedRights.send_docs;
                        sd3Var.c1();
                    } else if (i2 == 11) {
                        tL_chatBannedRights.send_roundvideos = !tL_chatBannedRights.send_roundvideos;
                        sd3Var.c1();
                    } else if (i2 == 10) {
                        tL_chatBannedRights.send_voices = !tL_chatBannedRights.send_voices;
                        sd3Var.c1();
                    } else if (i2 == 15) {
                        tL_chatBannedRights.send_reactions = !tL_chatBannedRights.send_reactions;
                        sd3Var.c1();
                    } else {
                        if (i2 == 12) {
                            boolean z5 = !tL_chatBannedRights.send_stickers;
                            tL_chatBannedRights.send_inline = z5;
                            tL_chatBannedRights.send_gifs = z5;
                            tL_chatBannedRights.send_games = z5;
                            tL_chatBannedRights.send_stickers = z5;
                            sd3Var.c1();
                        } else if (i2 == 14) {
                            if (!tL_chatBannedRights.send_plain && !sd3Var.q2.send_plain) {
                                tL_chatBannedRights.embed_links = !tL_chatBannedRights.embed_links;
                                sd3Var.c1();
                            } else {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= sd3Var.S1.E.size()) {
                                        break;
                                    }
                                    c4c G2 = sd3Var.S1.G(i6);
                                    if (G2.a == 39 && G2.d == 0) {
                                        s49 K = sd3Var.n1.K(i6 + 1);
                                        if (K != null) {
                                            View view2 = K.a;
                                            float f3 = -sd3Var.A2;
                                            sd3Var.A2 = f3;
                                            gl.A3(f3, view2, null);
                                        }
                                    } else {
                                        i6++;
                                    }
                                }
                                pw0.APP_ERROR.a();
                                return;
                            }
                        } else if (i2 == 13) {
                            z = true;
                            tL_chatBannedRights.send_polls = !tL_chatBannedRights.send_polls;
                            sd3Var.c1();
                        } else {
                            z = true;
                            if (i2 == 101) {
                                sd3Var.x2 = !sd3Var.x2;
                                sd3Var.b1();
                            } else if (i2 == 102) {
                                sd3Var.y2 = !sd3Var.y2;
                                sd3Var.X0();
                            }
                        }
                        z = true;
                    }
                }
                sd3Var.S1.O(z);
            }
        }
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final void run(long j) {
        byte b = this.a;
        sd3 sd3Var = this.b;
        switch (b) {
            case 5:
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(mu1.W9(j));
                }
                sd3Var.dismiss();
                return;
            default:
                d Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.presentFragment(mu1.W9(j));
                }
                sd3Var.dismiss();
                return;
        }
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
