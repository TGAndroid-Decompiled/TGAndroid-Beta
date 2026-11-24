package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ii1 extends q59 {
    public final vi1 c;

    public ii1(vi1 vi1Var) {
        this.c = vi1Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
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
        vi1 vi1Var = this.c;
        if (i == vi1Var.T) {
            return 0;
        }
        if (i == vi1Var.X) {
            return 2;
        }
        if (i == vi1Var.a0) {
            return 1;
        }
        if (i == vi1Var.U) {
            return 3;
        }
        if (i == vi1Var.c0) {
            return 4;
        }
        if (i != vi1Var.V && i != vi1Var.d0 && i != vi1Var.g0 && i != vi1Var.i0 && i != vi1Var.k0) {
            if (i != vi1Var.Y && i != vi1Var.f0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2;
        TLRPC.StickerSet stickerSet;
        int i3;
        TLRPC.StickerSet stickerSet2;
        int i4;
        int i5;
        boolean z;
        int i6;
        vi1 vi1Var = this.c;
        long j = vi1Var.a;
        int i7 = u69Var.f;
        View view = u69Var.a;
        if (i7 != 1) {
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 != 5) {
                        if (i7 != 6) {
                            if (i7 == 7) {
                                njb njbVar = (njb) view;
                                njbVar.setFixedSize(0);
                                if (i == vi1Var.b0) {
                                    njbVar.setFixedSize(12);
                                    njbVar.setText("");
                                    return;
                                } else if (i == vi1Var.W) {
                                    njbVar.setText(jb6.M0(2131752248, null));
                                    return;
                                } else if (i == vi1Var.Z) {
                                    njbVar.setText(jb6.M0(vi1Var.R0(), null));
                                    return;
                                } else if (i == vi1Var.e0) {
                                    njbVar.setText(jb6.M0(vi1Var.O0(), null));
                                    return;
                                } else if (i == vi1Var.h0) {
                                    njbVar.setText(jb6.M0(vi1Var.I0(), null));
                                    return;
                                } else if (i == vi1Var.j0) {
                                    njbVar.setText(jb6.M0(vi1Var.E0(), null));
                                    return;
                                } else if (i == vi1Var.l0) {
                                    njbVar.setText(jb6.M0(vi1Var.P0(), null));
                                    return;
                                } else if (i == 0) {
                                    njbVar.setText("");
                                    njbVar.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        ji1 ji1Var = (ji1) view;
                        ji1Var.e = false;
                        lka lkaVar = ji1Var.a;
                        ji1Var.setWillNotDraw(true);
                        if (i == vi1Var.V) {
                            i6 = ((d) vi1Var).currentAccount;
                            ji1Var.a(i6, vi1Var.f, true);
                            lkaVar.l(jb6.M0(2131752247, null), false);
                            if (vi1Var.b < vi1Var.getMessagesController().l4.V1.f()) {
                                ji1Var.e(vi1Var.getMessagesController().l4.V1.f());
                            } else {
                                ji1Var.e(0);
                            }
                            ji1Var.c(vi1Var.n, false, false);
                            return;
                        } else if (i == vi1Var.d0) {
                            i5 = ((d) vi1Var).currentAccount;
                            ji1Var.a(i5, vi1Var.s, false);
                            lkaVar.l(jb6.M0(2131752261, null), false);
                            if (vi1Var.f0 >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ji1Var.e = z;
                            ji1Var.setWillNotDraw(!z);
                            if (vi1Var.b < vi1Var.N0()) {
                                ji1Var.e(vi1Var.N0());
                            } else {
                                ji1Var.e(0);
                            }
                            ji1Var.c(vi1Var.x, false, false);
                            return;
                        } else if (i == vi1Var.g0) {
                            i4 = ((d) vi1Var).currentAccount;
                            ji1Var.a(i4, vi1Var.s, false);
                            lkaVar.l(jb6.M0(vi1Var.K0(), null), false);
                            if (vi1Var.b < vi1Var.J0()) {
                                ji1Var.e(vi1Var.J0());
                            } else {
                                ji1Var.e(0);
                            }
                            ji1Var.c(pg3.f(vi1Var.E), pg3.A(vi1Var.E), false);
                            return;
                        } else if (i == vi1Var.i0) {
                            i3 = ((d) vi1Var).currentAccount;
                            ji1Var.a(i3, vi1Var.s, false);
                            lkaVar.l(jb6.M0(vi1Var.F0(), null), false);
                            if (vi1Var.b < vi1Var.L0()) {
                                ji1Var.e(vi1Var.L0());
                            } else {
                                ji1Var.e(0);
                            }
                            TLRPC.ChatFull M0 = vi1Var.getMessagesController().M0(-j);
                            if (M0 != null && (stickerSet2 = M0.emojiset) != null) {
                                ji1Var.c(vi1Var.H0(stickerSet2), false, false);
                                return;
                            } else {
                                ji1Var.c(0L, false, false);
                                return;
                            }
                        } else if (i == vi1Var.k0) {
                            lkaVar.l(jb6.M0(vi1Var.Q0(), null), false);
                            ji1Var.e(0);
                            TLRPC.ChatFull M02 = vi1Var.getMessagesController().M0(-j);
                            if (M02 != null && (stickerSet = M02.stickerset) != null) {
                                ji1Var.d(vi1Var.G0(stickerSet));
                                return;
                            } else {
                                ji1Var.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    xib xibVar = (xib) view;
                    if (i == vi1Var.f0) {
                        xibVar.k(jb6.M0(2131752266, null), false);
                        return;
                    }
                    xibVar.k(jb6.M0(vi1Var.T0(), null), false);
                    if (vi1Var.b < vi1Var.D0()) {
                        xibVar.j(vi1Var.D0());
                        return;
                    } else {
                        xibVar.j(0);
                        return;
                    }
                }
                ((z28) view).a(vi1Var.s, false);
                return;
            }
            ((mi1) view).a(vi1Var.f, false);
            return;
        }
        oi1 oi1Var = (oi1) view;
        h28 h28Var = oi1Var.a;
        ni1 ni1Var = oi1Var.b;
        i2 = ((d) vi1Var).currentAccount;
        h28Var.b(i2, vi1Var.s, false);
        ni1Var.b(vi1Var.s, false);
        ni1Var.d(vi1Var.x, false, false);
        ni1Var.setForum(vi1Var.V0());
        ni1Var.e(pg3.f(vi1Var.E), false, false);
        ni1Var.a(vi1Var.f);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        ylb ylbVar;
        ylb ylbVar2;
        ylb ylbVar3;
        int i2;
        ylb ylbVar4;
        int i3;
        ylb ylbVar5;
        ti1 ti1Var;
        ylb ylbVar6;
        int i4;
        ylb ylbVar7;
        tk5 tk5Var;
        ylb ylbVar8;
        int i5;
        vi1 vi1Var = this.c;
        if (i == 0) {
            Activity parentActivity = vi1Var.getParentActivity();
            tk5Var = ((d) vi1Var).parentLayout;
            int M0 = vi1Var.M0();
            long j = vi1Var.a;
            ylbVar8 = ((d) vi1Var).resourceProvider;
            uob uobVar = new uob(parentActivity, tk5Var, M0, j, ylbVar8);
            uobVar.G = true;
            uobVar.setImportantForAccessibility(4);
            uobVar.x = vi1Var;
            Drawable drawable = vi1Var.I;
            i5 = ((d) vi1Var).currentAccount;
            Drawable e = cl8.e(drawable, i5, vi1Var.G, vi1Var.K);
            vi1Var.I = e;
            uobVar.setOverrideBackground(e);
            ti1Var = uobVar;
        } else if (i == 2) {
            Activity parentActivity2 = vi1Var.getParentActivity();
            i4 = ((d) vi1Var).currentAccount;
            ylbVar7 = ((d) vi1Var).resourceProvider;
            ti1 ti1Var2 = new ti1(i4, ylbVar7, parentActivity2);
            ti1Var2.setWithRemovedStub(true);
            String h = uf2.h(vi1Var.G);
            if (h == null && vi1Var.G == null && vi1Var.H != null) {
                h = "❌";
            }
            ti1Var2.a(h, false);
            ti1Var2.setGalleryWallpaper(vi1Var.H);
            ti1Var2.setOnEmoticonSelected(new qac(this) {
                public final ii1 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r2;
                    ii1 ii1Var = this.b;
                    switch (b) {
                        case 0:
                            String str = (String) obj;
                            vi1 vi1Var2 = ii1Var.c;
                            if (str == null) {
                                vi1Var2.G = vi1Var2.H;
                            } else if (str.equals("❌")) {
                                vi1Var2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                vi1Var2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                vi1Var2.G.settings.emoticon = str;
                            }
                            vi1Var2.e1(true);
                            vi1Var2.h1(true);
                            return;
                        default:
                            vi1 vi1Var3 = ii1Var.c;
                            vi1Var3.s = ((Integer) obj).intValue();
                            if (vi1Var3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                vi1Var3.E = null;
                            }
                            vi1Var3.e1(true);
                            vi1Var3.i1();
                            vi1Var3.g1(true);
                            return;
                    }
                }
            });
            ti1Var = ti1Var2;
        } else if (i == 5) {
            ti1Var = new xib(vi1Var.getParentActivity(), vi1Var.getResourceProvider());
        } else if (i == 6) {
            Activity parentActivity3 = vi1Var.getParentActivity();
            ylbVar6 = ((d) vi1Var).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.e = false;
            frameLayout.d = ylbVar6;
            lka lkaVar = new lka(parentActivity3);
            frameLayout.a = lkaVar;
            lkaVar.setTextSize(16);
            anb.W(lkaVar, cmb.F6, ylbVar6);
            frameLayout.addView(lkaVar, qoe.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.c = new tm(gm.L(24.0f), 13, frameLayout, false);
            ti1Var = frameLayout;
        } else if (i == 3) {
            Activity parentActivity4 = vi1Var.getParentActivity();
            i3 = ((d) vi1Var).currentAccount;
            ylbVar5 = ((d) vi1Var).resourceProvider;
            mi1 mi1Var = new mi1(i3, ylbVar5, parentActivity4);
            mi1Var.b.setOnItemClickListener(new k0(this, mi1Var, (byte) 6));
            ti1Var = mi1Var;
        } else if (i == 4) {
            Activity parentActivity5 = vi1Var.getParentActivity();
            i2 = ((d) vi1Var).currentAccount;
            ylbVar4 = ((d) vi1Var).resourceProvider;
            z28 z28Var = new z28(0, i2, ylbVar4, parentActivity5);
            z28Var.setDivider(false);
            z28Var.setOnColorClick(new qac(this) {
                public final ii1 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r2;
                    ii1 ii1Var = this.b;
                    switch (b) {
                        case 0:
                            String str = (String) obj;
                            vi1 vi1Var2 = ii1Var.c;
                            if (str == null) {
                                vi1Var2.G = vi1Var2.H;
                            } else if (str.equals("❌")) {
                                vi1Var2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                vi1Var2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                vi1Var2.G.settings.emoticon = str;
                            }
                            vi1Var2.e1(true);
                            vi1Var2.h1(true);
                            return;
                        default:
                            vi1 vi1Var3 = ii1Var.c;
                            vi1Var3.s = ((Integer) obj).intValue();
                            if (vi1Var3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                vi1Var3.E = null;
                            }
                            vi1Var3.e1(true);
                            vi1Var3.i1();
                            vi1Var3.g1(true);
                            return;
                    }
                }
            });
            ti1Var = z28Var;
        } else if (i == 1) {
            FrameLayout oi1Var = new oi1(vi1Var, vi1Var.getParentActivity());
            ti1Var = oi1Var;
            if (vi1Var.d) {
                oi1Var.setTag(-33024);
                ti1Var = oi1Var;
            }
        } else if (i == 8) {
            Activity parentActivity6 = vi1Var.getParentActivity();
            ylbVar3 = ((d) vi1Var).resourceProvider;
            ti1Var = new jf5(parentActivity6, ylbVar3);
        } else if (i == 9) {
            Activity parentActivity7 = vi1Var.getParentActivity();
            ylbVar2 = ((d) vi1Var).resourceProvider;
            ti1Var = new j28(ylbVar2, parentActivity7, false);
        } else if (i == 10) {
            Activity parentActivity8 = vi1Var.getParentActivity();
            ylbVar = ((d) vi1Var).resourceProvider;
            tk4 tk4Var = new tk4(parentActivity8, ylbVar);
            tk4Var.setIsSingleCell(true);
            tk4Var.setViewType(35);
            ti1Var = tk4Var;
        } else {
            ti1Var = new njb(vi1Var.getParentActivity());
        }
        return new u69(ti1Var);
    }

    @Override
    public final void y(u69 u69Var) {
        View view = u69Var.a;
        boolean z = view instanceof oi1;
        vi1 vi1Var = this.c;
        if (z) {
            ni1 ni1Var = ((oi1) view).b;
            TLRPC.EmojiStatus emojiStatus = vi1Var.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                ni1Var.c(ec7.a(emojiStatus), false);
                ni1Var.d(((TLRPC.TL_emojiStatusCollectible) vi1Var.E).pattern_document_id, true, false);
            } else {
                ni1Var.b(vi1Var.s, false);
                ni1Var.d(vi1Var.x, false, false);
            }
            ni1Var.e(pg3.f(vi1Var.E), pg3.A(vi1Var.E), false);
            ni1Var.setForum(vi1Var.V0());
            ni1Var.a(vi1Var.f);
        } else if (view instanceof uob) {
            ((uob) view).setOverrideBackground(vi1Var.I);
        } else {
            vi1.f1(view);
        }
    }
}
