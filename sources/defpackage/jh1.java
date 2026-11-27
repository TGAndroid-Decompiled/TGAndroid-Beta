package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class jh1 extends c79 {
    public final wh1 c;

    public jh1(wh1 wh1Var) {
        this.c = wh1Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
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
        wh1 wh1Var = this.c;
        if (i == wh1Var.T) {
            return 0;
        }
        if (i == wh1Var.X) {
            return 2;
        }
        if (i == wh1Var.a0) {
            return 1;
        }
        if (i == wh1Var.U) {
            return 3;
        }
        if (i == wh1Var.c0) {
            return 4;
        }
        if (i != wh1Var.V && i != wh1Var.d0 && i != wh1Var.g0 && i != wh1Var.i0 && i != wh1Var.k0) {
            if (i != wh1Var.Y && i != wh1Var.f0) {
                return 7;
            }
            return 5;
        }
        return 6;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        int i2;
        TLRPC.StickerSet stickerSet;
        int i3;
        TLRPC.StickerSet stickerSet2;
        int i4;
        int i5;
        boolean z;
        int i6;
        wh1 wh1Var = this.c;
        long j = wh1Var.a;
        int i7 = f89Var.f;
        View view = f89Var.a;
        if (i7 != 1) {
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 != 5) {
                        if (i7 != 6) {
                            if (i7 == 7) {
                                ilb ilbVar = (ilb) view;
                                ilbVar.setFixedSize(0);
                                if (i == wh1Var.b0) {
                                    ilbVar.setFixedSize(12);
                                    ilbVar.setText("");
                                    return;
                                } else if (i == wh1Var.W) {
                                    ilbVar.setText(ob6.M0(2131752276, null));
                                    return;
                                } else if (i == wh1Var.Z) {
                                    ilbVar.setText(ob6.M0(wh1Var.R0(), null));
                                    return;
                                } else if (i == wh1Var.e0) {
                                    ilbVar.setText(ob6.M0(wh1Var.O0(), null));
                                    return;
                                } else if (i == wh1Var.h0) {
                                    ilbVar.setText(ob6.M0(wh1Var.I0(), null));
                                    return;
                                } else if (i == wh1Var.j0) {
                                    ilbVar.setText(ob6.M0(wh1Var.E0(), null));
                                    return;
                                } else if (i == wh1Var.l0) {
                                    ilbVar.setText(ob6.M0(wh1Var.P0(), null));
                                    return;
                                } else if (i == 0) {
                                    ilbVar.setText("");
                                    ilbVar.setFixedSize(12);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        kh1 kh1Var = (kh1) view;
                        kh1Var.e = false;
                        ema emaVar = kh1Var.a;
                        kh1Var.setWillNotDraw(true);
                        if (i == wh1Var.V) {
                            i6 = ((e) wh1Var).currentAccount;
                            kh1Var.a(i6, wh1Var.f, true);
                            emaVar.l(ob6.M0(2131752275, null), false);
                            if (wh1Var.b < wh1Var.getMessagesController().l4.d2.f()) {
                                kh1Var.e(wh1Var.getMessagesController().l4.d2.f());
                            } else {
                                kh1Var.e(0);
                            }
                            kh1Var.c(wh1Var.n, false, false);
                            return;
                        } else if (i == wh1Var.d0) {
                            i5 = ((e) wh1Var).currentAccount;
                            kh1Var.a(i5, wh1Var.s, false);
                            emaVar.l(ob6.M0(2131752289, null), false);
                            if (wh1Var.f0 >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            kh1Var.e = z;
                            kh1Var.setWillNotDraw(!z);
                            if (wh1Var.b < wh1Var.N0()) {
                                kh1Var.e(wh1Var.N0());
                            } else {
                                kh1Var.e(0);
                            }
                            kh1Var.c(wh1Var.x, false, false);
                            return;
                        } else if (i == wh1Var.g0) {
                            i4 = ((e) wh1Var).currentAccount;
                            kh1Var.a(i4, wh1Var.s, false);
                            emaVar.l(ob6.M0(wh1Var.K0(), null), false);
                            if (wh1Var.b < wh1Var.J0()) {
                                kh1Var.e(wh1Var.J0());
                            } else {
                                kh1Var.e(0);
                            }
                            kh1Var.c(wf3.f(wh1Var.E), wf3.A(wh1Var.E), false);
                            return;
                        } else if (i == wh1Var.i0) {
                            i3 = ((e) wh1Var).currentAccount;
                            kh1Var.a(i3, wh1Var.s, false);
                            emaVar.l(ob6.M0(wh1Var.F0(), null), false);
                            if (wh1Var.b < wh1Var.L0()) {
                                kh1Var.e(wh1Var.L0());
                            } else {
                                kh1Var.e(0);
                            }
                            TLRPC.ChatFull N0 = wh1Var.getMessagesController().N0(-j);
                            if (N0 != null && (stickerSet2 = N0.emojiset) != null) {
                                kh1Var.c(wh1Var.H0(stickerSet2), false, false);
                                return;
                            } else {
                                kh1Var.c(0L, false, false);
                                return;
                            }
                        } else if (i == wh1Var.k0) {
                            emaVar.l(ob6.M0(wh1Var.Q0(), null), false);
                            kh1Var.e(0);
                            TLRPC.ChatFull N02 = wh1Var.getMessagesController().N0(-j);
                            if (N02 != null && (stickerSet = N02.stickerset) != null) {
                                kh1Var.d(wh1Var.G0(stickerSet));
                                return;
                            } else {
                                kh1Var.c(0L, false, false);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    skb skbVar = (skb) view;
                    if (i == wh1Var.f0) {
                        skbVar.k(ob6.M0(2131752294, null), false);
                        return;
                    }
                    skbVar.k(ob6.M0(wh1Var.T0(), null), false);
                    if (wh1Var.b < wh1Var.D0()) {
                        skbVar.j(wh1Var.D0());
                        return;
                    } else {
                        skbVar.j(0);
                        return;
                    }
                }
                ((d48) view).a(wh1Var.s, false);
                return;
            }
            ((nh1) view).a(wh1Var.f, false);
            return;
        }
        ph1 ph1Var = (ph1) view;
        k38 k38Var = ph1Var.a;
        oh1 oh1Var = ph1Var.b;
        i2 = ((e) wh1Var).currentAccount;
        k38Var.b(i2, wh1Var.s, false);
        oh1Var.b(wh1Var.s, false);
        oh1Var.d(wh1Var.x, false, false);
        oh1Var.setForum(wh1Var.V0());
        oh1Var.e(wf3.f(wh1Var.E), false, false);
        oh1Var.a(wh1Var.f);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        vnb vnbVar;
        vnb vnbVar2;
        vnb vnbVar3;
        int i2;
        vnb vnbVar4;
        int i3;
        vnb vnbVar5;
        uh1 uh1Var;
        vnb vnbVar6;
        int i4;
        vnb vnbVar7;
        wk5 wk5Var;
        vnb vnbVar8;
        int i5;
        wh1 wh1Var = this.c;
        if (i == 0) {
            Activity parentActivity = wh1Var.getParentActivity();
            wk5Var = ((e) wh1Var).parentLayout;
            int M0 = wh1Var.M0();
            long j = wh1Var.a;
            vnbVar8 = ((e) wh1Var).resourceProvider;
            sqb sqbVar = new sqb(parentActivity, wk5Var, M0, j, vnbVar8);
            sqbVar.G = true;
            sqbVar.setImportantForAccessibility(4);
            sqbVar.x = wh1Var;
            Drawable drawable = wh1Var.I;
            i5 = ((e) wh1Var).currentAccount;
            Drawable e = mm8.e(drawable, i5, wh1Var.G, wh1Var.K);
            wh1Var.I = e;
            sqbVar.setOverrideBackground(e);
            uh1Var = sqbVar;
        } else if (i == 2) {
            Activity parentActivity2 = wh1Var.getParentActivity();
            i4 = ((e) wh1Var).currentAccount;
            vnbVar7 = ((e) wh1Var).resourceProvider;
            uh1 uh1Var2 = new uh1(i4, vnbVar7, parentActivity2);
            uh1Var2.setWithRemovedStub(true);
            String h = af2.h(wh1Var.G);
            if (h == null && wh1Var.G == null && wh1Var.H != null) {
                h = "❌";
            }
            uh1Var2.a(h, false);
            uh1Var2.setGalleryWallpaper(wh1Var.H);
            uh1Var2.setOnEmoticonSelected(new pcc(this) {
                public final jh1 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r2;
                    jh1 jh1Var = this.b;
                    switch (b) {
                        case 0:
                            String str = (String) obj;
                            wh1 wh1Var2 = jh1Var.c;
                            if (str == null) {
                                wh1Var2.G = wh1Var2.H;
                            } else if (str.equals("❌")) {
                                wh1Var2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                wh1Var2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                wh1Var2.G.settings.emoticon = str;
                            }
                            wh1Var2.e1(true);
                            wh1Var2.h1(true);
                            return;
                        default:
                            wh1 wh1Var3 = jh1Var.c;
                            wh1Var3.s = ((Integer) obj).intValue();
                            if (wh1Var3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                wh1Var3.E = null;
                            }
                            wh1Var3.e1(true);
                            wh1Var3.i1();
                            wh1Var3.g1(true);
                            return;
                    }
                }
            });
            uh1Var = uh1Var2;
        } else if (i == 5) {
            uh1Var = new skb(wh1Var.getParentActivity(), wh1Var.getResourceProvider());
        } else if (i == 6) {
            Activity parentActivity3 = wh1Var.getParentActivity();
            vnbVar6 = ((e) wh1Var).resourceProvider;
            ?? frameLayout = new FrameLayout(parentActivity3);
            frameLayout.e = false;
            frameLayout.d = vnbVar6;
            ema emaVar = new ema(parentActivity3);
            frameLayout.a = emaVar;
            emaVar.setTextSize(16);
            yob.W(emaVar, aob.G6, vnbVar6);
            frameLayout.addView(emaVar, tre.d(-1, -2.0f, 23, 23.0f, 0.0f, 48.0f, 0.0f));
            frameLayout.c = new ul(hl.L(24.0f), 13, frameLayout, false);
            uh1Var = frameLayout;
        } else if (i == 3) {
            Activity parentActivity4 = wh1Var.getParentActivity();
            i3 = ((e) wh1Var).currentAccount;
            vnbVar5 = ((e) wh1Var).resourceProvider;
            nh1 nh1Var = new nh1(i3, vnbVar5, parentActivity4);
            nh1Var.b.setOnItemClickListener(new l0(this, nh1Var, (byte) 6));
            uh1Var = nh1Var;
        } else if (i == 4) {
            Activity parentActivity5 = wh1Var.getParentActivity();
            i2 = ((e) wh1Var).currentAccount;
            vnbVar4 = ((e) wh1Var).resourceProvider;
            d48 d48Var = new d48(0, i2, vnbVar4, parentActivity5);
            d48Var.setDivider(false);
            d48Var.setOnColorClick(new pcc(this) {
                public final jh1 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r2;
                    jh1 jh1Var = this.b;
                    switch (b) {
                        case 0:
                            String str = (String) obj;
                            wh1 wh1Var2 = jh1Var.c;
                            if (str == null) {
                                wh1Var2.G = wh1Var2.H;
                            } else if (str.equals("❌")) {
                                wh1Var2.G = null;
                            } else {
                                TLRPC.TL_wallPaperNoFile tL_wallPaperNoFile = new TLRPC.TL_wallPaperNoFile();
                                wh1Var2.G = tL_wallPaperNoFile;
                                tL_wallPaperNoFile.id = 0L;
                                tL_wallPaperNoFile.flags |= 4;
                                tL_wallPaperNoFile.settings = new TLRPC.TL_wallPaperSettings();
                                wh1Var2.G.settings.emoticon = str;
                            }
                            wh1Var2.e1(true);
                            wh1Var2.h1(true);
                            return;
                        default:
                            wh1 wh1Var3 = jh1Var.c;
                            wh1Var3.s = ((Integer) obj).intValue();
                            if (wh1Var3.E instanceof TLRPC.TL_emojiStatusCollectible) {
                                wh1Var3.E = null;
                            }
                            wh1Var3.e1(true);
                            wh1Var3.i1();
                            wh1Var3.g1(true);
                            return;
                    }
                }
            });
            uh1Var = d48Var;
        } else if (i == 1) {
            FrameLayout ph1Var = new ph1(wh1Var, wh1Var.getParentActivity());
            uh1Var = ph1Var;
            if (wh1Var.d) {
                ph1Var.setTag(-33024);
                uh1Var = ph1Var;
            }
        } else if (i == 8) {
            Activity parentActivity6 = wh1Var.getParentActivity();
            vnbVar3 = ((e) wh1Var).resourceProvider;
            uh1Var = new mf5(parentActivity6, vnbVar3);
        } else if (i == 9) {
            Activity parentActivity7 = wh1Var.getParentActivity();
            vnbVar2 = ((e) wh1Var).resourceProvider;
            uh1Var = new m38(vnbVar2, parentActivity7, false);
        } else if (i == 10) {
            Activity parentActivity8 = wh1Var.getParentActivity();
            vnbVar = ((e) wh1Var).resourceProvider;
            tk4 tk4Var = new tk4(parentActivity8, vnbVar);
            tk4Var.setIsSingleCell(true);
            tk4Var.setViewType(35);
            uh1Var = tk4Var;
        } else {
            uh1Var = new ilb(wh1Var.getParentActivity());
        }
        return new f89(uh1Var);
    }

    @Override
    public final void y(f89 f89Var) {
        View view = f89Var.a;
        boolean z = view instanceof ph1;
        wh1 wh1Var = this.c;
        if (z) {
            oh1 oh1Var = ((ph1) view).b;
            TLRPC.EmojiStatus emojiStatus = wh1Var.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                oh1Var.c(kc7.a(emojiStatus), false);
                oh1Var.d(((TLRPC.TL_emojiStatusCollectible) wh1Var.E).pattern_document_id, true, false);
            } else {
                oh1Var.b(wh1Var.s, false);
                oh1Var.d(wh1Var.x, false, false);
            }
            oh1Var.e(wf3.f(wh1Var.E), wf3.A(wh1Var.E), false);
            oh1Var.setForum(wh1Var.V0());
            oh1Var.a(wh1Var.f);
        } else if (view instanceof sqb) {
            ((sqb) view).setOverrideBackground(wh1Var.I);
        } else {
            wh1.f1(view);
        }
    }
}
