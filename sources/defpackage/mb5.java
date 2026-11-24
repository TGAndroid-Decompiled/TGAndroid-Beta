package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class mb5 extends d implements gk7 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public xha M;
    public boolean N;
    public final boolean O;
    public jb5 P;
    public FrameLayout a;
    public zya b;
    public pi4 c;
    public o39 d;
    public kb5 e;
    public lb5 f;
    public t26 h;
    public int n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public TLRPC.ChatFull w;
    public final long x;
    public int y;

    public mb5(long j, int i) {
        super(null);
        this.n = -1;
        this.x = j;
        this.O = true;
    }

    public static int Z(mb5 mb5Var) {
        return mb5Var.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.Ki));
        hashSet.add(Integer.valueOf(bkb.Li));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.I6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    public final TLRPC.StickerSet c0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        if (this.O) {
            return chatFull.emojiset;
        }
        return chatFull.stickerset;
    }

    @Override
    public final View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        pha phaVar = this.simpleActionBar;
        if (this.O) {
            i = 2131749251;
        } else {
            i = 2131749205;
        }
        phaVar.setTitle(k96.M0(i, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 26));
        xha a = this.simpleActionBar.t().a(0, 2131232491);
        this.M = a;
        a.N();
        a.C0 = new q10(this, (byte) 12);
        this.M.setSearchFieldHint(k96.M0(2131745644, null));
        this.e = new kb5(this, context);
        this.f = new lb5(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.d = o39Var;
        o39Var.r1();
        this.d.setSectionsDrawBackground(true);
        gb3 gb3Var = new gb3();
        gb3Var.n(200L);
        gb3Var.m = true;
        this.d.setItemAnimator(gb3Var);
        t26 t26Var = new t26();
        this.h = t26Var;
        t26Var.i1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a = frameLayout2;
        zkb.h(bkb.c6, null, frameLayout2);
        pi4 pi4Var = new pi4(context, getResourceProvider());
        this.c = pi4Var;
        pi4Var.setViewType(19);
        this.c.setIsSingleCell(true);
        this.c.setItemsCount((int) Math.ceil(gl.q.y / gl.N(58.0f)));
        this.a.addView(this.c, nme.c(-1.0f, -1));
        zya zyaVar = new zya(context, this.c, 1, null);
        this.b = zyaVar;
        vk9.c(zyaVar);
        this.a.addView(this.b);
        this.a.setVisibility(8);
        this.d.setEmptyView(this.a);
        frameLayout.addView(this.d, nme.c(-1.0f, -1));
        frameLayout.addView(this.a);
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new bf4(this, (byte) 4));
        this.d.setOnScrollListener(new ao2(this, (byte) 19));
        return this.fragmentView;
    }

    public final int d0() {
        if (this.O) {
            return 5;
        }
        return 0;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.w0) {
            if (((Integer) objArr[0]).intValue() == d0()) {
                k0(true);
            }
        } else if (i == kk7.S) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.x) {
                if (this.w == null && c0(chatFull) != null) {
                    this.r = hq6.d0(this.currentAccount).a0(c0(chatFull));
                }
                this.w = chatFull;
                k0(true);
            }
        } else if (i == kk7.A0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (c0(this.w) != null && c0(this.w).id == longValue) {
                k0(true);
            }
        }
    }

    public final void e0(int i, View view) {
        if (getParentActivity() != null) {
            if (this.N) {
                if (i > this.f.d.size()) {
                    boolean a = ((rza) view).a();
                    lb5 lb5Var = this.f;
                    g0((TLRPC.TL_messages_stickerSet) lb5Var.e.get((i - lb5Var.d.size()) - 1), a, false);
                    return;
                } else if (i != this.f.d.size()) {
                    g0((TLRPC.TL_messages_stickerSet) this.f.d.get(i), ((rza) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i >= this.F && i < this.G) {
                g0((TLRPC.TL_messages_stickerSet) hq6.d0(this.currentAccount).t0(d0()).get(i - this.F), ((rza) view).a(), false);
            }
            if (i == this.K) {
                g0(this.r, true, false);
            }
        }
    }

    public final void f0(TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.r;
            boolean z = this.O;
            if (tL_messages_stickerSet == null) {
                TLRPC.ChatFull chatFull = this.w;
                if (z) {
                    chatFull.emojiset = null;
                } else {
                    chatFull.stickerset = null;
                }
            } else {
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                TLRPC.ChatFull chatFull2 = this.w;
                if (z) {
                    chatFull2.emojiset = stickerSet;
                } else {
                    chatFull2.stickerset = stickerSet;
                }
                hq6 d0 = hq6.d0(this.currentAccount);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.r;
                d0.N.k(tL_messages_stickerSet2, tL_messages_stickerSet2.set.id);
            }
            l0();
            TLRPC.ChatFull chatFull3 = this.w;
            if (z) {
                TLRPC.StickerSet stickerSet2 = chatFull3.emojiset;
                int i = chatFull3.flags2;
                if (stickerSet2 != null) {
                    chatFull3.flags2 = i | 1024;
                } else {
                    chatFull3.flags2 = i & (-1025);
                }
            } else {
                TLRPC.StickerSet stickerSet3 = chatFull3.stickerset;
                int i2 = chatFull3.flags;
                if (stickerSet3 == null) {
                    chatFull3.flags = i2 | 256;
                } else {
                    chatFull3.flags = i2 & (-257);
                }
            }
            ad7.Y(this.currentAccount).K1(this.w, false);
            kk7.f(this.currentAccount).k(kk7.S, this.w, 0, Boolean.TRUE, Boolean.FALSE);
            kk7.f(this.currentAccount).k(kk7.r3, Long.valueOf(this.w.id), Boolean.valueOf(z));
            finishFragment();
        } else if (getParentActivity() != null) {
            Activity parentActivity = getParentActivity();
            Toast.makeText(parentActivity, k96.M0(2131751093, null) + "\n" + tL_error.text, 0).show();
        }
    }

    public final void g0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z, boolean z2) {
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        if (z2) {
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = tL_messages_stickerSet.set.short_name;
            tL_inputStickerSetShortName = tL_inputStickerSetShortName2;
        } else {
            tL_inputStickerSetShortName = null;
        }
        Activity parentActivity = getParentActivity();
        if (!z2) {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
        } else {
            tL_messages_stickerSet2 = null;
        }
        u0b u0bVar = new u0b(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        u0bVar.X1 = new gb5(this, z, tL_messages_stickerSet);
        u0bVar.T0();
        gl.t1(getParentActivity().getCurrentFocus());
        u0bVar.show();
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i = this.n;
        if (tL_messages_stickerSet == null) {
            if (this.r != null) {
                ir2.v(null, 2131749186, u21.b0(this), 2131624000, 36);
            }
            this.r = null;
            this.s = true;
        } else {
            this.r = tL_messages_stickerSet;
            this.s = false;
            ir2.v(null, 2131749186, u21.b0(this), 2131624000, 36);
        }
        l0();
        j0(this.r, false);
        if (i != -1) {
            if (!this.N) {
                for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                    View childAt = this.d.getChildAt(i2);
                    if (this.d.T(childAt).b() == this.F + i) {
                        ((rza) childAt).b(false, true);
                        break;
                    }
                }
            }
            this.e.g(this.F + i);
        }
        if (this.n != -1) {
            if (!this.N) {
                for (int i3 = 0; i3 < this.d.getChildCount(); i3++) {
                    View childAt2 = this.d.getChildAt(i3);
                    if (this.d.T(childAt2).b() == this.F + this.n) {
                        ((rza) childAt2).b(true, true);
                        return;
                    }
                }
            }
            this.e.g(this.F + this.n);
        }
    }

    public final void i0(TLRPC.ChatFull chatFull) {
        this.w = chatFull;
        if (c0(chatFull) != null) {
            this.r = hq6.d0(this.currentAccount).a0(c0(this.w));
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z) {
        boolean z2;
        if (!this.O) {
            return;
        }
        int i = this.K;
        boolean z3 = true;
        if (tL_messages_stickerSet != null) {
            if (i == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.r = tL_messages_stickerSet;
            k0(false);
            kb5 kb5Var = this.e;
            int i2 = this.K;
            if (z2) {
                kb5Var.i(i2);
            } else {
                kb5Var.g(i2);
            }
            if (z) {
                this.e.g(this.J);
            }
            jb5 jb5Var = this.P;
            jb5Var.b = true;
            jb5Var.invalidate();
            return;
        }
        if (i <= 0) {
            z3 = false;
        }
        this.r = null;
        if (z3) {
            this.e.r(i);
            if (z) {
                this.e.g(this.J);
            }
        }
        k0(false);
        jb5 jb5Var2 = this.P;
        jb5Var2.b = false;
        jb5Var2.invalidate();
    }

    public final void k0(boolean z) {
        kb5 kb5Var;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.H = 0;
        if (this.O) {
            this.I = 0;
            int i = 2;
            this.H = 2;
            this.J = 1;
            if (this.r != null) {
                this.H = 3;
                this.K = 2;
                i = 3;
            }
            this.H = i + 1;
            this.L = i;
        }
        ArrayList t0 = hq6.d0(this.currentAccount).t0(d0());
        if (!t0.isEmpty()) {
            int i2 = this.H;
            int i3 = i2 + 1;
            this.H = i3;
            this.E = i2;
            this.F = i3;
            this.G = t0.size() + i3;
            this.H = t0.size() + this.H;
        } else {
            this.E = -1;
            this.F = -1;
            this.G = -1;
        }
        int i4 = this.H;
        this.H = i4 + 1;
        this.y = i4;
        l0();
        if (z && (kb5Var = this.e) != null) {
            kb5Var.f();
        }
    }

    public final void l0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb5.l0():void");
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        hq6.d0(this.currentAccount).D(d0());
        kk7.f(this.currentAccount).b(this, kk7.w0);
        kk7.f(this.currentAccount).b(this, kk7.S);
        kk7.f(this.currentAccount).b(this, kk7.A0);
        k0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.w0);
        kk7.f(this.currentAccount).n(this, kk7.S);
        kk7.f(this.currentAccount).n(this, kk7.A0);
        if ((this.r != null || this.s) && (chatFull = this.w) != null) {
            if (c0(chatFull) == null || (tL_messages_stickerSet = this.r) == null || tL_messages_stickerSet.set.id != c0(this.w).id) {
                if (c0(this.w) != null || this.r != null) {
                    boolean z = this.O;
                    long j = this.x;
                    if (z) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = na7.q1(this.currentAccount).f1(j);
                        if (this.s) {
                            tL_channels_setEmojiStickers.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        } else {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setEmojiStickers.stickerset = tL_inputStickerSetID;
                            TLRPC.StickerSet stickerSet = this.r.set;
                            tL_inputStickerSetID.id = stickerSet.id;
                            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                            tL_channels_setStickers = tL_channels_setEmojiStickers;
                        }
                    } else {
                        TLRPC.TL_channels_setStickers tL_channels_setStickers2 = new TLRPC.TL_channels_setStickers();
                        tL_channels_setStickers2.channel = na7.q1(this.currentAccount).f1(j);
                        if (this.s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = na7.q1(this.currentAccount).Y3.edit();
                            edit.remove("group_hide_stickers_" + this.w.id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.r.set;
                            tL_inputStickerSetID2.id = stickerSet2.id;
                            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                            tL_channels_setStickers = tL_channels_setStickers2;
                        }
                    }
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new n35(this, (byte) 2));
                }
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public mb5(long j) {
        super(null);
        this.n = -1;
        this.x = j;
    }
}
