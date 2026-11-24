package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ah1 extends n39 {
    public final nh1 c;

    public ah1(nh1 nh1Var) {
        this.c = nh1Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 5 && i != 6) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.c.S;
    }

    @Override
    public final int d(int i) {
        nh1 nh1Var = this.c;
        if (i == nh1Var.T) {
            return 0;
        }
        if (i == nh1Var.X) {
            return 2;
        }
        if (i == nh1Var.a0) {
            return 1;
        }
        if (i == nh1Var.U) {
            return 3;
        }
        if (i == nh1Var.c0) {
            return 4;
        }
        if (i != nh1Var.V && i != nh1Var.d0 && i != nh1Var.g0 && i != nh1Var.i0 && i != nh1Var.k0) {
            if (i != nh1Var.Y && i != nh1Var.f0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        int i2;
        TLRPC.StickerSet stickerSet;
        int i3;
        TLRPC.StickerSet stickerSet2;
        int i4;
        int i5;
        boolean z;
        int i6;
        nh1 nh1Var = this.c;
        long j = nh1Var.a;
        int i7 = s49Var.f;
        View view = s49Var.a;
        if (i7 != 1) {
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 != 5) {
                        if (i7 != 6) {
                            if (i7 == 7) {
                                mhb mhbVar = (mhb) view;
                                mhbVar.setFixedSize(0);
                                if (i == nh1Var.b0) {
                                    mhbVar.setFixedSize(12);
                                    mhbVar.setText("");
                                    return;
                                } else if (i == nh1Var.W) {
                                    mhbVar.setText(k96.M0(2131752298, null));
                                    return;
                                } else if (i == nh1Var.Z) {
                                    mhbVar.setText(k96.M0(nh1Var.Q0(), null));
                                    return;
                                } else if (i == nh1Var.e0) {
                                    mhbVar.setText(k96.M0(nh1Var.N0(), null));
                                    return;
                                } else if (i == nh1Var.h0) {
                                    mhbVar.setText(k96.M0(nh1Var.H0(), null));
                                    return;
                                } else if (i == nh1Var.j0) {
                                    mhbVar.setText(k96.M0(nh1Var.D0(), null));
                                    return;
                                } else if (i == nh1Var.l0) {
                                    mhbVar.setText(k96.M0(nh1Var.O0(), null));
                                    return;
                                } else if (i == 0) {
                                    mhbVar.setText("");
                                    mhbVar.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        bh1 bh1Var = (bh1) view;
                        bh1Var.e = false;
                        jia jiaVar = bh1Var.a;
                        bh1Var.setWillNotDraw(true);
                        if (i == nh1Var.V) {
                            i6 = ((d) nh1Var).currentAccount;
                            bh1Var.a(i6, nh1Var.f, true);
                            jiaVar.l(k96.M0(2131752297, null), false);
                            if (nh1Var.b < nh1Var.getMessagesController().k4.V1.f()) {
                                bh1Var.e(nh1Var.getMessagesController().k4.V1.f());
                            } else {
                                bh1Var.e(0);
                            }
                            bh1Var.c(nh1Var.n, false, false);
                            return;
                        } else if (i == nh1Var.d0) {
                            i5 = ((d) nh1Var).currentAccount;
                            bh1Var.a(i5, nh1Var.s, false);
                            jiaVar.l(k96.M0(2131752307, null), false);
                            if (nh1Var.f0 >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bh1Var.e = z;
                            bh1Var.setWillNotDraw(!z);
                            if (nh1Var.b < nh1Var.M0()) {
                                bh1Var.e(nh1Var.M0());
                            } else {
                                bh1Var.e(0);
                            }
                            bh1Var.c(nh1Var.x, false, false);
                            return;
                        } else if (i == nh1Var.g0) {
                            i4 = ((d) nh1Var).currentAccount;
                            bh1Var.a(i4, nh1Var.s, false);
                            jiaVar.l(k96.M0(nh1Var.J0(), null), false);
                            if (nh1Var.b < nh1Var.I0()) {
                                bh1Var.e(nh1Var.I0());
                            } else {
                                bh1Var.e(0);
                            }
                            bh1Var.c(cf3.f(nh1Var.E), cf3.A(nh1Var.E), false);
                            return;
                        } else if (i == nh1Var.i0) {
                            i3 = ((d) nh1Var).currentAccount;
                            bh1Var.a(i3, nh1Var.s, false);
                            jiaVar.l(k96.M0(nh1Var.E0(), null), false);
                            if (nh1Var.b < nh1Var.K0()) {
                                bh1Var.e(nh1Var.K0());
                            } else {
                                bh1Var.e(0);
                            }
                            TLRPC.ChatFull L0 = nh1Var.getMessagesController().L0(-j);
                            if (L0 != null && (stickerSet2 = L0.emojiset) != null) {
                                bh1Var.c(nh1Var.G0(stickerSet2), false, false);
                                return;
                            } else {
                                bh1Var.c(0L, false, false);
                                return;
                            }
                        } else if (i == nh1Var.k0) {
                            jiaVar.l(k96.M0(nh1Var.P0(), null), false);
                            bh1Var.e(0);
                            TLRPC.ChatFull L02 = nh1Var.getMessagesController().L0(-j);
                            if (L02 != null && (stickerSet = L02.stickerset) != null) {
                                bh1Var.d(nh1Var.F0(stickerSet));
                                return;
                            } else {
                                bh1Var.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    wgb wgbVar = (wgb) view;
                    if (i == nh1Var.f0) {
                        wgbVar.k(k96.M0(2131752312, null), false);
                        return;
                    }
                    wgbVar.k(k96.M0(nh1Var.S0(), null), false);
                    if (nh1Var.b < nh1Var.C0()) {
                        wgbVar.j(nh1Var.C0());
                        return;
                    } else {
                        wgbVar.j(0);
                        return;
                    }
                }
                ((w08) view).a(nh1Var.s, false);
                return;
            }
            ((eh1) view).a(nh1Var.f, false);
            return;
        }
        gh1 gh1Var = (gh1) view;
        e08 e08Var = gh1Var.a;
        fh1 fh1Var = gh1Var.b;
        i2 = ((d) nh1Var).currentAccount;
        e08Var.b(i2, nh1Var.s, false);
        fh1Var.b(nh1Var.s, false);
        fh1Var.d(nh1Var.x, false, false);
        fh1Var.setForum(nh1Var.U0());
        fh1Var.e(cf3.f(nh1Var.E), false, false);
        fh1Var.a(nh1Var.f);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        wjb wjbVar;
        wjb wjbVar2;
        wjb wjbVar3;
        int i2;
        wjb wjbVar4;
        int i3;
        wjb wjbVar5;
        lh1 lh1Var;
        wjb wjbVar6;
        int i4;
        wjb wjbVar7;
        ui5 ui5Var;
        wjb wjbVar8;
        int i5;
        nh1 nh1Var = this.c;
        if (i == 0) {
            Activity parentActivity = nh1Var.getParentActivity();
            ui5Var = ((d) nh1Var).parentLayout;
            int L0 = nh1Var.L0();
            long j = nh1Var.a;
            wjbVar8 = ((d) nh1Var).resourceProvider;
            tmb tmbVar = new tmb(parentActivity, ui5Var, L0, j, wjbVar8);
            tmbVar.G = true;
            tmbVar.setImportantForAccessibility(4);
            tmbVar.x = nh1Var;
            Drawable drawable = nh1Var.I;
            i5 = ((d) nh1Var).currentAccount;
            Drawable e = zi8.e(drawable, i5, nh1Var.G, nh1Var.K);
            nh1Var.I = e;
            tmbVar.setOverrideBackground(e);
            lh1Var = tmbVar;
        } else if (i == 2) {
            Activity parentActivity2 = nh1Var.getParentActivity();
            i4 = ((d) nh1Var).currentAccount;
            wjbVar7 = ((d) nh1Var).resourceProvider;
            lh1 lh1Var2 = new lh1(i4, wjbVar7, parentActivity2);
            lh1Var2.setWithRemovedStub(true);
            String h = je2.h(nh1Var.G);
            if (h == null && nh1Var.G == null && nh1Var.H != null) {
                h = "❌";
            }
            lh1Var2.a(h, false);
            lh1Var2.setGalleryWallpaper(nh1Var.H);
            lh1Var2.setOnEmoticonSelected(new p8c(this) {
                public final ah1 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r2;
                    ah1 ah1Var = this.b;
                    switch (b) {
                        case 0:
                            String str = (String) obj;
                            nh1 nh1Var2 = ah1Var.c;
                            if (str == null) {
                                nh1Var2.G = nh1Var2.H;
                            } else if (str.equals("❌")) {
                                nh1Var2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                nh1Var2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                nh1Var2.G.settings.emoticon = str;
                            }
                            nh1Var2.d1(true);
                            nh1Var2.g1(true);
                            return;
                        default:
                            nh1 nh1Var3 = ah1Var.c;
                            nh1Var3.s = ((Integer) obj).intValue();
                            if (nh1Var3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                nh1Var3.E = null;
                            }
                            nh1Var3.d1(true);
                            nh1Var3.h1();
                            nh1Var3.f1(true);
                            return;
                    }
                }
            });
            lh1Var = lh1Var2;
        } else if (i == 5) {
            lh1Var = new wgb(nh1Var.getParentActivity(), nh1Var.getResourceProvider());
        } else if (i == 6) {
            Activity parentActivity3 = nh1Var.getParentActivity();
            wjbVar6 = ((d) nh1Var).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.e = false;
            frameLayout.d = wjbVar6;
            jia jiaVar = new jia(parentActivity3);
            frameLayout.a = jiaVar;
            jiaVar.setTextSize(16);
            zkb.W(jiaVar, bkb.F6, wjbVar6);
            frameLayout.addView(jiaVar, nme.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.c = new tl(gl.L(24.0f), 13, frameLayout, false);
            lh1Var = frameLayout;
        } else if (i == 3) {
            Activity parentActivity4 = nh1Var.getParentActivity();
            i3 = ((d) nh1Var).currentAccount;
            wjbVar5 = ((d) nh1Var).resourceProvider;
            eh1 eh1Var = new eh1(i3, wjbVar5, parentActivity4);
            eh1Var.b.setOnItemClickListener(new k0(this, eh1Var, (byte) 6));
            lh1Var = eh1Var;
        } else if (i == 4) {
            Activity parentActivity5 = nh1Var.getParentActivity();
            i2 = ((d) nh1Var).currentAccount;
            wjbVar4 = ((d) nh1Var).resourceProvider;
            w08 w08Var = new w08(0, i2, wjbVar4, parentActivity5);
            w08Var.setDivider(false);
            w08Var.setOnColorClick(new p8c(this) {
                public final ah1 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r2;
                    ah1 ah1Var = this.b;
                    switch (b) {
                        case 0:
                            String str = (String) obj;
                            nh1 nh1Var2 = ah1Var.c;
                            if (str == null) {
                                nh1Var2.G = nh1Var2.H;
                            } else if (str.equals("❌")) {
                                nh1Var2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                nh1Var2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                nh1Var2.G.settings.emoticon = str;
                            }
                            nh1Var2.d1(true);
                            nh1Var2.g1(true);
                            return;
                        default:
                            nh1 nh1Var3 = ah1Var.c;
                            nh1Var3.s = ((Integer) obj).intValue();
                            if (nh1Var3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                nh1Var3.E = null;
                            }
                            nh1Var3.d1(true);
                            nh1Var3.h1();
                            nh1Var3.f1(true);
                            return;
                    }
                }
            });
            lh1Var = w08Var;
        } else if (i == 1) {
            FrameLayout gh1Var = new gh1(nh1Var, nh1Var.getParentActivity());
            lh1Var = gh1Var;
            if (nh1Var.d) {
                gh1Var.setTag(-33024);
                lh1Var = gh1Var;
            }
        } else if (i == 8) {
            Activity parentActivity6 = nh1Var.getParentActivity();
            wjbVar3 = ((d) nh1Var).resourceProvider;
            lh1Var = new ld5(parentActivity6, wjbVar3);
        } else if (i == 9) {
            Activity parentActivity7 = nh1Var.getParentActivity();
            wjbVar2 = ((d) nh1Var).resourceProvider;
            lh1Var = new g08(wjbVar2, parentActivity7, false);
        } else if (i == 10) {
            Activity parentActivity8 = nh1Var.getParentActivity();
            wjbVar = ((d) nh1Var).resourceProvider;
            pi4 pi4Var = new pi4(parentActivity8, wjbVar);
            pi4Var.setIsSingleCell(true);
            pi4Var.setViewType(35);
            lh1Var = pi4Var;
        } else {
            lh1Var = new mhb(nh1Var.getParentActivity());
        }
        return new s49(lh1Var);
    }

    @Override
    public final void y(s49 s49Var) {
        View view = s49Var.a;
        boolean z = view instanceof gh1;
        nh1 nh1Var = this.c;
        if (z) {
            fh1 fh1Var = ((gh1) view).b;
            TLRPC.EmojiStatus emojiStatus = nh1Var.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                fh1Var.c(da7.a(emojiStatus), false);
                fh1Var.d(((TLRPC.TL_emojiStatusCollectible) nh1Var.E).pattern_document_id, true, false);
            } else {
                fh1Var.b(nh1Var.s, false);
                fh1Var.d(nh1Var.x, false, false);
            }
            fh1Var.e(cf3.f(nh1Var.E), cf3.A(nh1Var.E), false);
            fh1Var.setForum(nh1Var.U0());
            fh1Var.a(nh1Var.f);
        } else if (view instanceof tmb) {
            ((tmb) view).setOverrideBackground(nh1Var.I);
        } else {
            nh1.e1(view);
        }
    }
}
