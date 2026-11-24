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
public final class kd5 extends d implements jm7 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public zja M;
    public boolean N;
    public final boolean O;
    public hd5 P;
    public FrameLayout a;
    public a1b b;
    public tk4 c;
    public r59 d;
    public id5 e;
    public jd5 f;
    public u46 h;
    public int n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public TLRPC.ChatFull w;
    public final long x;
    public int y;

    public kd5(long j, int i) {
        super(null);
        this.n = -1;
        this.x = j;
        this.O = true;
    }

    public static int a0(kd5 kd5Var) {
        return kd5Var.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.Ki));
        hashSet.add(Integer.valueOf(cmb.Li));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override
    public final View createView(Context context) {
        int i;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        rja rjaVar = this.simpleActionBar;
        if (this.O) {
            i = 2131749200;
        } else {
            i = 2131749154;
        }
        rjaVar.setTitle(jb6.M0(i, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 27));
        zja a = this.simpleActionBar.t().a(0, 2131232503);
        this.M = a;
        a.N();
        a.C0 = new q20(this, (byte) 12);
        this.M.setSearchFieldHint(jb6.M0(2131745570, null));
        this.e = new id5(this, context);
        this.f = new jd5(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        r59 r59Var = new r59(context, null);
        this.d = r59Var;
        r59Var.r1();
        this.d.setSectionsDrawBackground(true);
        sc3 sc3Var = new sc3();
        sc3Var.n(200L);
        sc3Var.m = true;
        this.d.setItemAnimator(sc3Var);
        u46 u46Var = new u46();
        this.h = u46Var;
        u46Var.i1(1);
        this.d.setLayoutManager(this.h);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a = frameLayout2;
        anb.h(cmb.c6, null, frameLayout2);
        tk4 tk4Var = new tk4(context, getResourceProvider());
        this.c = tk4Var;
        tk4Var.setViewType(19);
        this.c.setIsSingleCell(true);
        this.c.setItemsCount((int) Math.ceil(gm.q.y / gm.N(58.0f)));
        this.a.addView(this.c, qoe.c(-1.0f, -1));
        a1b a1bVar = new a1b(context, this.c, 1, null);
        this.b = a1bVar;
        wm9.c(a1bVar);
        this.a.addView(this.b);
        this.a.setVisibility(8);
        this.d.setEmptyView(this.a);
        frameLayout.addView(this.d, qoe.c(-1.0f, -1));
        frameLayout.addView(this.a);
        this.d.setAdapter(this.e);
        this.d.setOnItemClickListener(new kg4(this, (byte) 5));
        this.d.setOnScrollListener(new ip2(this, (byte) 20));
        return this.fragmentView;
    }

    public final TLRPC.StickerSet d0(TLRPC.ChatFull chatFull) {
        if (chatFull == null) {
            return null;
        }
        if (this.O) {
            return chatFull.emojiset;
        }
        return chatFull.stickerset;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.x0) {
            if (((Integer) objArr[0]).intValue() == e0()) {
                l0(true);
            }
        } else if (i == nm7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.x) {
                if (this.w == null && d0(chatFull) != null) {
                    this.r = hs6.d0(this.currentAccount).a0(d0(chatFull));
                }
                this.w = chatFull;
                l0(true);
            }
        } else if (i == nm7.B0) {
            long longValue = ((Long) objArr[0]).longValue();
            if (d0(this.w) != null && d0(this.w).id == longValue) {
                l0(true);
            }
        }
    }

    public final int e0() {
        if (this.O) {
            return 5;
        }
        return 0;
    }

    public final void f0(int i, View view) {
        if (getParentActivity() != null) {
            if (this.N) {
                if (i > this.f.d.size()) {
                    boolean a = ((s1b) view).a();
                    jd5 jd5Var = this.f;
                    h0((TLRPC.TL_messages_stickerSet) jd5Var.e.get((i - jd5Var.d.size()) - 1), a, false);
                    return;
                } else if (i != this.f.d.size()) {
                    h0((TLRPC.TL_messages_stickerSet) this.f.d.get(i), ((s1b) view).a(), true);
                    return;
                } else {
                    return;
                }
            }
            if (i >= this.F && i < this.G) {
                h0((TLRPC.TL_messages_stickerSet) hs6.d0(this.currentAccount).t0(e0()).get(i - this.F), ((s1b) view).a(), false);
            }
            if (i == this.K) {
                h0(this.r, true, false);
            }
        }
    }

    public final void g0(TLRPC.TL_error tL_error) {
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
                hs6 d0 = hs6.d0(this.currentAccount);
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.r;
                d0.N.k(tL_messages_stickerSet2, tL_messages_stickerSet2.set.id);
            }
            m0();
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
            cf7.Y(this.currentAccount).K1(this.w, false);
            nm7.f(this.currentAccount).k(nm7.T, this.w, 0, Boolean.TRUE, Boolean.FALSE);
            nm7.f(this.currentAccount).k(nm7.s3, Long.valueOf(this.w.id), Boolean.valueOf(z));
            finishFragment();
        } else if (getParentActivity() != null) {
            Activity parentActivity = getParentActivity();
            Toast.makeText(parentActivity, jb6.M0(2131751042, null) + "\n" + tL_error.text, 0).show();
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z, boolean z2) {
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
        x2b x2bVar = new x2b(parentActivity, this, tL_inputStickerSetShortName, tL_messages_stickerSet2, null, null);
        x2bVar.X1 = new ed5(this, z, tL_messages_stickerSet);
        x2bVar.T0();
        gm.t1(getParentActivity().getCurrentFocus());
        x2bVar.show();
    }

    public final void i0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i = this.n;
        if (tL_messages_stickerSet == null) {
            if (this.r != null) {
                ts2.u(null, 2131749135, c41.b0(this), 2131624000, 36);
            }
            this.r = null;
            this.s = true;
        } else {
            this.r = tL_messages_stickerSet;
            this.s = false;
            ts2.u(null, 2131749135, c41.b0(this), 2131624000, 36);
        }
        m0();
        k0(this.r, false);
        if (i != -1) {
            if (!this.N) {
                for (int i2 = 0; i2 < this.d.getChildCount(); i2++) {
                    View childAt = this.d.getChildAt(i2);
                    if (this.d.T(childAt).b() == this.F + i) {
                        ((s1b) childAt).b(false, true);
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
                        ((s1b) childAt2).b(true, true);
                        return;
                    }
                }
            }
            this.e.g(this.F + this.n);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.ChatFull chatFull) {
        this.w = chatFull;
        if (d0(chatFull) != null) {
            this.r = hs6.d0(this.currentAccount).a0(d0(this.w));
        }
    }

    public final void k0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z) {
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
            l0(false);
            id5 id5Var = this.e;
            int i2 = this.K;
            if (z2) {
                id5Var.i(i2);
            } else {
                id5Var.g(i2);
            }
            if (z) {
                this.e.g(this.J);
            }
            hd5 hd5Var = this.P;
            hd5Var.b = true;
            hd5Var.invalidate();
            return;
        }
        if (i <= 0) {
            z3 = false;
        }
        this.r = null;
        if (z3) {
            this.e.s(i);
            if (z) {
                this.e.g(this.J);
            }
        }
        l0(false);
        hd5 hd5Var2 = this.P;
        hd5Var2.b = false;
        hd5Var2.invalidate();
    }

    public final void l0(boolean z) {
        id5 id5Var;
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
        ArrayList t0 = hs6.d0(this.currentAccount).t0(e0());
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
        m0();
        if (z && (id5Var = this.e) != null) {
            id5Var.f();
        }
    }

    public final void m0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd5.m0():void");
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        hs6.d0(this.currentAccount).D(e0());
        nm7.f(this.currentAccount).b(this, nm7.x0);
        nm7.f(this.currentAccount).b(this, nm7.T);
        nm7.f(this.currentAccount).b(this, nm7.B0);
        l0(true);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        TLRPC.ChatFull chatFull;
        TLRPC.TL_channels_setStickers tL_channels_setStickers;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.x0);
        nm7.f(this.currentAccount).n(this, nm7.T);
        nm7.f(this.currentAccount).n(this, nm7.B0);
        if ((this.r != null || this.s) && (chatFull = this.w) != null) {
            if (d0(chatFull) == null || (tL_messages_stickerSet = this.r) == null || tL_messages_stickerSet.set.id != d0(this.w).id) {
                if (d0(this.w) != null || this.r != null) {
                    boolean z = this.O;
                    long j = this.x;
                    if (z) {
                        TLRPC.TL_channels_setEmojiStickers tL_channels_setEmojiStickers = new TLRPC.TL_channels_setEmojiStickers();
                        tL_channels_setEmojiStickers.channel = oc7.r1(this.currentAccount).g1(j);
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
                        tL_channels_setStickers2.channel = oc7.r1(this.currentAccount).g1(j);
                        if (this.s) {
                            tL_channels_setStickers2.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_channels_setStickers = tL_channels_setStickers2;
                        } else {
                            SharedPreferences.Editor edit = oc7.r1(this.currentAccount).Y3.edit();
                            edit.remove("group_hide_stickers_" + this.w.id).apply();
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            tL_channels_setStickers2.stickerset = tL_inputStickerSetID2;
                            TLRPC.StickerSet stickerSet2 = this.r.set;
                            tL_inputStickerSetID2.id = stickerSet2.id;
                            tL_inputStickerSetID2.access_hash = stickerSet2.access_hash;
                            tL_channels_setStickers = tL_channels_setStickers2;
                        }
                    }
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_setStickers, new r15(this, (byte) 3));
                }
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public kd5(long j) {
        super(null);
        this.n = -1;
        this.x = j;
    }
}
