package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public final class bg2 extends e implements fn7 {
    public int A0;
    public long A1;
    public int B0;
    public boolean B1;
    public int C0;
    public tk4 C1;
    public int D0;
    public RadialProgressView D1;
    public TLRPC.TL_chatBannedRights E;
    public int E0;
    public int E1;
    public final ArrayList F;
    public int F0;
    public int F1;
    public final ArrayList G;
    public int G0;
    public final ArrayList H;
    public int H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public int J0;
    public final zh6 K;
    public int K0;
    public final zh6 L;
    public int L0;
    public final zh6 M;
    public int M0;
    public long N;
    public int N0;
    public final int O;
    public int O0;
    public final boolean P;
    public int P0;
    public boolean Q;
    public int Q0;
    public boolean R;
    public int R0;
    public int S;
    public int S0;
    public int T;
    public int T0;
    public int U;
    public int U0;
    public int V;
    public int V0;
    public int W;
    public int W0;
    public int X;
    public int X0;
    public int Y;
    public int Y0;
    public int Z;
    public int Z0;
    public xf2 a;
    public int a0;
    public int a1;
    public z2b b;
    public int b0;
    public int b1;
    public gu c;
    public int c0;
    public int c1;
    public of2 d;
    public int d0;
    public int d1;
    public ag2 e;
    public int e0;
    public final int e1;
    public sla f;
    public int f0;
    public int f1;
    public int g0;
    public int g1;
    public UndoView h;
    public int h0;
    public int h1;
    public int i0;
    public int i1;
    public int j0;
    public int j1;
    public int k0;
    public int k1;
    public int l0;
    public boolean l1;
    public int m0;
    public uf2 m1;
    public TLRPC.Chat n;
    public int n0;
    public final boolean n1;
    public int o0;
    public boolean o1;
    public int p0;
    public int p1;
    public int q0;
    public int q1;
    public TLRPC.ChatFull r;
    public int r0;
    public boolean r1;
    public final boolean s;
    public int s0;
    public int s1;
    public int t0;
    public final boolean t1;
    public int u0;
    public final boolean u1;
    public int v0;
    public boolean v1;
    public final boolean w;
    public boolean w0;
    public boolean w1;
    public final boolean x;
    public int x0;
    public boolean x1;
    public final String y;
    public int y0;
    public boolean y1;
    public int z0;
    public long z1;

    public bg2(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.E = new TLRPC.TL_chatBannedRights();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.K = new zh6();
        this.L = new zh6();
        this.M = new zh6();
        this.z1 = 10L;
        this.A1 = 10L;
        this.N = this.arguments.getLong("chat_id");
        this.O = this.arguments.getInt("type");
        this.P = this.arguments.getBoolean("transfer");
        this.n1 = this.arguments.getBoolean("open_search");
        this.e1 = this.arguments.getInt("selectType");
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.N));
        this.n = M0;
        boolean z = false;
        if (M0 != null && (tL_chatBannedRights = M0.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.E;
            tL_chatBannedRights2.view_messages = tL_chatBannedRights.view_messages;
            tL_chatBannedRights2.send_stickers = tL_chatBannedRights.send_stickers;
            boolean z2 = tL_chatBannedRights.send_media;
            tL_chatBannedRights2.send_media = z2;
            tL_chatBannedRights2.embed_links = tL_chatBannedRights.embed_links;
            tL_chatBannedRights2.send_messages = tL_chatBannedRights.send_messages;
            tL_chatBannedRights2.send_games = tL_chatBannedRights.send_games;
            tL_chatBannedRights2.send_inline = tL_chatBannedRights.send_inline;
            tL_chatBannedRights2.send_gifs = tL_chatBannedRights.send_gifs;
            tL_chatBannedRights2.pin_messages = tL_chatBannedRights.pin_messages;
            tL_chatBannedRights2.edit_rank = tL_chatBannedRights.edit_rank;
            tL_chatBannedRights2.send_reactions = tL_chatBannedRights.send_reactions;
            tL_chatBannedRights2.send_polls = tL_chatBannedRights.send_polls;
            tL_chatBannedRights2.invite_users = tL_chatBannedRights.invite_users;
            tL_chatBannedRights2.manage_topics = tL_chatBannedRights.manage_topics;
            tL_chatBannedRights2.change_info = tL_chatBannedRights.change_info;
            tL_chatBannedRights2.manage_linked_peers = tL_chatBannedRights.manage_linked_peers;
            boolean z3 = tL_chatBannedRights.send_photos;
            tL_chatBannedRights2.send_photos = z3;
            boolean z4 = tL_chatBannedRights.send_videos;
            tL_chatBannedRights2.send_videos = z4;
            boolean z5 = tL_chatBannedRights.send_roundvideos;
            tL_chatBannedRights2.send_roundvideos = z5;
            boolean z6 = tL_chatBannedRights.send_audios;
            tL_chatBannedRights2.send_audios = z6;
            boolean z7 = tL_chatBannedRights.send_voices;
            tL_chatBannedRights2.send_voices = z7;
            boolean z8 = tL_chatBannedRights.send_docs;
            tL_chatBannedRights2.send_docs = z8;
            tL_chatBannedRights2.send_plain = tL_chatBannedRights.send_plain;
            if (!z2 && z8 && z7 && z6 && z5 && z4 && z3) {
                tL_chatBannedRights2.send_photos = false;
                tL_chatBannedRights2.send_videos = false;
                tL_chatBannedRights2.send_roundvideos = false;
                tL_chatBannedRights2.send_audios = false;
                tL_chatBannedRights2.send_voices = false;
                tL_chatBannedRights2.send_docs = false;
            }
        }
        this.y = xc2.D(this.E);
        boolean Y = xc2.Y(this.n);
        this.w = Y;
        if (xc2.T(this.n) && !this.n.megagroup && !Y) {
            z = true;
        }
        this.s = z;
        this.x = xc2.c0(this.n);
        TLRPC.Chat chat = this.n;
        if (chat != null) {
            boolean z9 = chat.signatures;
            this.v1 = z9;
            this.t1 = z9;
            boolean z10 = chat.signature_profiles;
            this.w1 = z10;
            this.u1 = z10;
        }
    }

    public static int j0(TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            if (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_channelParticipant)) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static int m0(int i) {
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 10;
        }
        if (i == 3) {
            return 30;
        }
        if (i == 4) {
            return 60;
        }
        if (i == 5) {
            return 300;
        }
        if (i == 6) {
            return 900;
        }
        if (i == 7) {
            return 3600;
        }
        return 0;
    }

    public static int n0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i = !tL_chatBannedRights.send_photos ? 1 : 0;
        if (!tL_chatBannedRights.send_videos) {
            i++;
        }
        if (!tL_chatBannedRights.send_stickers) {
            i++;
        }
        if (!tL_chatBannedRights.send_audios) {
            i++;
        }
        if (!tL_chatBannedRights.send_docs) {
            i++;
        }
        if (!tL_chatBannedRights.send_voices) {
            i++;
        }
        if (!tL_chatBannedRights.send_roundvideos) {
            i++;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            i++;
        }
        if (!tL_chatBannedRights.send_polls) {
            i++;
        }
        if (!tL_chatBannedRights.send_reactions) {
            return i + 1;
        }
        return i;
    }

    public final vf2 A0() {
        vf2 vf2Var = new vf2(this);
        vf2Var.a = this.d1;
        vf2Var.h = this.X0;
        vf2Var.i = this.Y0;
        vf2Var.k.clear();
        vf2Var.k.addAll(this.G);
        vf2Var.g = this.V0;
        vf2Var.f = this.U0;
        vf2Var.l.clear();
        vf2Var.l.addAll(this.H);
        vf2Var.d = this.E0;
        vf2Var.e = this.F0;
        vf2Var.j.clear();
        vf2Var.j.addAll(this.F);
        vf2Var.e(vf2Var.b);
        return vf2Var;
    }

    public final void B0(TLRPC.ChatFull chatFull) {
        boolean z;
        long j;
        this.r = chatFull;
        if (chatFull != null) {
            int k0 = k0();
            this.q1 = k0;
            this.p1 = k0;
            int i = this.r.boosts_unrestrict;
            boolean z2 = false;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            this.r1 = z;
            this.s1 = i;
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.N));
            if (M0 == null) {
                j = 0;
            } else {
                j = M0.send_paid_messages_stars;
            }
            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i2 > 0) {
                z2 = true;
            }
            this.y1 = z2;
            this.x1 = z2;
            if (i2 <= 0) {
                j = 10;
            }
            long k = Utilities.k(j, getMessagesController().l4.P1.f(), 1L);
            this.A1 = k;
            this.z1 = k;
        }
    }

    public final void C0(int i) {
        if (!this.isPaused && this.B1) {
            if (this.c.getAdapter() != this.a || !this.R) {
                tk4 tk4Var = null;
                for (int i2 = 0; i2 < this.c.getChildCount(); i2++) {
                    View childAt = this.c.getChildAt(i2);
                    if (childAt instanceof tk4) {
                        tk4Var = childAt;
                    }
                }
                if (tk4Var != null) {
                    this.c.removeView(tk4Var);
                    i--;
                }
                this.c.getViewTreeObserver().addOnPreDrawListener(new r32(this, tk4Var, i, (byte) 1));
            }
        }
    }

    public final void D0(vf2 vf2Var) {
        View view;
        if (this.a == null) {
            F0();
            return;
        }
        F0();
        vf2Var.e(vf2Var.c);
        cy7.a(vf2Var, true).c(this.a);
        gu guVar = this.c;
        if (guVar != null && this.d != null && guVar.getChildCount() > 0) {
            int i = 0;
            int i2 = -1;
            while (true) {
                if (i < this.c.getChildCount()) {
                    i2 = RecyclerView.S(this.c.getChildAt(i));
                    if (i2 != -1) {
                        view = this.c.getChildAt(i);
                        break;
                    }
                    i++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.d.g1(i2, view.getTop() - this.c.getPaddingTop());
            }
        }
    }

    public final void E0(TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        zh6 zh6Var;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                zh6Var = this.M;
            } else if (i == 1) {
                zh6Var = this.L;
            } else {
                zh6Var = this.K;
            }
            TLObject tLObject = (TLObject) zh6Var.f(r47.B1(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
        }
    }

    public final void F0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bg2.F0():void");
    }

    public final void G0() {
        int attachedScrapChildCount;
        View P;
        try {
            if (this.c != null) {
                int w0 = aob.w0(null, aob.y6, false);
                int w02 = aob.w0(null, aob.n6, false);
                if (w0 != this.E1 || w02 != this.F1) {
                    this.E1 = w0;
                    this.F1 = w02;
                    for (int i = 1; i < 4; i++) {
                        if (i == 0) {
                            attachedScrapChildCount = this.c.getChildCount();
                        } else {
                            gu guVar = this.c;
                            if (i == 1) {
                                attachedScrapChildCount = guVar.getHiddenChildCount();
                            } else if (i == 2) {
                                attachedScrapChildCount = guVar.getCachedChildCount();
                            } else {
                                attachedScrapChildCount = guVar.getAttachedScrapChildCount();
                            }
                        }
                        for (int i2 = 0; i2 < attachedScrapChildCount; i2++) {
                            if (i == 0) {
                                P = this.c.getChildAt(i2);
                            } else {
                                gu guVar2 = this.c;
                                if (i == 1) {
                                    P = guVar2.X(i2);
                                } else if (i == 2) {
                                    P = guVar2.Q(i2);
                                } else {
                                    P = guVar2.P(i2);
                                }
                            }
                            if (P instanceof lj6) {
                                ((lj6) P).updateColors();
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.v6));
        hashSet.add(Integer.valueOf(aob.u6));
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.yj));
        hashSet.add(Integer.valueOf(aob.xj));
        hashSet.add(Integer.valueOf(aob.wj));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.f7));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override
    public final View createView(Context context) {
        int i = 1;
        setHasOwnBackground(true);
        this.o1 = false;
        this.simpleActionBar.setBackButtonImage(2131231243);
        int i2 = this.e1;
        int i3 = this.O;
        if (i3 == 3) {
            this.simpleActionBar.setTitle(ob6.M0(2131752303, "ChannelPermissions"));
        } else if (i3 == 0) {
            this.simpleActionBar.setTitle(ob6.M0(2131752427, "ChannelBlacklist"));
        } else if (i3 == 1) {
            this.simpleActionBar.setTitle(ob6.M0(2131752492, null));
        } else if (i3 == 2) {
            if (i2 == 0) {
                jla jlaVar = this.simpleActionBar;
                if (this.s) {
                    jlaVar.setTitle(ob6.M0(2131752255, null));
                } else {
                    jlaVar.setTitle(ob6.M0(2131752349, "ChannelMembers"));
                }
            } else if (i2 == 1) {
                this.simpleActionBar.setTitle(ob6.M0(2131752509, "ChannelAddAdmin"));
            } else if (i2 == 2) {
                this.simpleActionBar.setTitle(ob6.M0(2131752426, "ChannelBlockUser"));
            } else if (i2 == 3) {
                this.simpleActionBar.setTitle(ob6.M0(2131752508, "ChannelAddException"));
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 29));
        if (i2 == 0 && i3 != 2 && i3 != 0 && i3 != 3) {
            if (i3 == 1 && xc2.V(this.n) && xc2.N(this.n)) {
                this.simpleActionBar.u(ob6.M0(2131745674, null));
            }
        } else {
            this.e = new ag2(this, context);
            sla a = this.simpleActionBar.v().a(0, 2131232502);
            a.N();
            a.C0 = new r10(this, (byte) 5);
            this.f = a;
            if (i3 == 0 && !this.R) {
                a.setVisibility(8);
            }
            sla slaVar = this.f;
            if (i3 == 3) {
                slaVar.setSearchFieldHint(ob6.M0(2131752273, "ChannelSearchException"));
            } else {
                slaVar.setSearchFieldHint(ob6.M0(2131745564, "Search"));
            }
            if (!xc2.T(this.n) && !this.n.creator) {
                this.f.setVisibility(8);
            }
            if (i3 == 3) {
                this.simpleActionBar.u(ob6.M0(2131745674, null));
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        tk4 tk4Var = new tk4(context, null);
        this.C1 = tk4Var;
        tk4Var.setViewType(6);
        tk4 tk4Var2 = this.C1;
        tk4Var2.x = false;
        tk4Var2.setUseHeaderOffset(false);
        tk4 tk4Var3 = this.C1;
        int i4 = aob.G8;
        int i5 = aob.i6;
        tk4Var3.e(i4, i5, i5);
        frameLayout2.addView(this.C1, tre.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.D1 = radialProgressView;
        frameLayout2.addView(radialProgressView, tre.e(-2, -2, 17));
        this.C1.setVisibility(8);
        this.D1.setVisibility(8);
        z2b z2bVar = new z2b(context, frameLayout2, 1, null);
        this.b = z2bVar;
        z2bVar.d.setText(ob6.M0(2131747898, null));
        this.b.e.setText(ob6.M0(2131745535, null));
        this.b.setVisibility(8);
        this.b.setAnimateLayoutChange(true);
        this.b.e(true, false);
        this.b.addView(frameLayout2, 0);
        gu guVar = new gu((byte) 13, context, this);
        this.c = guVar;
        guVar.s1();
        this.c.setSectionsDrawBackground(true);
        gu guVar2 = this.c;
        of2 of2Var = new of2(this, (byte) 0);
        this.d = of2Var;
        guVar2.setLayoutManager(of2Var);
        pf2 pf2Var = new pf2(this);
        pf2Var.n(420L);
        pf2Var.o(k43.h);
        pf2Var.C = false;
        pf2Var.m = false;
        this.c.setItemAnimator(pf2Var);
        gu guVar3 = this.c;
        guVar3.X1 = true;
        guVar3.Y1 = false;
        xf2 xf2Var = new xf2(this, context);
        this.a = xf2Var;
        guVar3.setAdapter(xf2Var);
        gu guVar4 = this.c;
        if (!ob6.a0) {
            i = 2;
        }
        guVar4.setVerticalScrollbarPosition(i);
        frameLayout.addView(this.c, tre.c(-1.0f, -1));
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        this.c.setOnItemClickListener(new ef2(this, (byte) 3));
        this.c.setOnItemLongClickListener(new ef2(this, (byte) 4));
        if (this.f != null) {
            this.c.setOnScrollListener(new y(this, (byte) 27));
        }
        UndoView undoView = new UndoView(context);
        this.h = undoView;
        frameLayout.addView(undoView, tre.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        F0();
        this.c.setEmptyView(this.b);
        gu guVar5 = this.c;
        guVar5.X1 = false;
        guVar5.Y1 = false;
        if (this.n1) {
            this.f.G(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        boolean z2;
        long j;
        if (i == jn7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (chatFull.id == this.N) {
                if (!booleanValue || !xc2.T(this.n)) {
                    boolean z3 = true;
                    if (this.r != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.r = chatFull;
                    if (!z) {
                        int k0 = k0();
                        this.q1 = k0;
                        this.p1 = k0;
                        int i3 = this.r.boosts_unrestrict;
                        if (i3 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.r1 = z2;
                        this.s1 = i3;
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.N));
                        if (M0 == null) {
                            j = 0;
                        } else {
                            j = M0.send_paid_messages_stars;
                        }
                        int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                        if (i4 <= 0) {
                            z3 = false;
                        }
                        this.y1 = z3;
                        this.x1 = z3;
                        if (i4 <= 0) {
                            j = 10;
                        }
                        long k = Utilities.k(j, getMessagesController().l4.P1.f(), 1L);
                        this.A1 = k;
                        this.z1 = k;
                    }
                    hl.c3(new cf2(this, (byte) 0));
                }
            }
        } else if (i == jn7.y1 && ((Long) objArr[0]).longValue() == (-this.N)) {
            wk5 wk5Var = this.parentLayout;
            if (wk5Var != null && wk5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final boolean g0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bg2.g0(boolean):boolean");
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        da2 da2Var = new da2(this, (byte) 2);
        arrayList.add(new apb(this.c, 16, new Class[]{mf5.class, lj6.class, ij6.class, vkb.class, qmb.class, zma.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.c, 0, new Class[]{vkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.U6));
        arrayList.add(new apb(this.c, 0, new Class[]{vkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.V6));
        int i = aob.y6;
        arrayList.add(new apb(this.c, 0, new Class[]{lj6.class}, new String[]{"statusColor"}, (Drawable[]) null, da2Var, i));
        arrayList.add(new apb(this.c, 0, new Class[]{lj6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, da2Var, aob.n6));
        arrayList.add(new apb(this.b.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G6));
        arrayList.add(new apb(this.b.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        return arrayList;
    }

    public final boolean h0(TLObject tLObject, boolean z, View view) {
        int i;
        long j;
        String str;
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i2;
        final long j2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j3;
        String str2;
        int i3;
        final byte b;
        String str3;
        int i4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        String str4;
        int i5;
        boolean z10;
        String str5;
        int i6;
        if (tLObject != null && (i = this.e1) == 0) {
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                j3 = r47.B1(channelParticipant.peer);
                z2 = channelParticipant.can_edit;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = channelParticipant.banned_rights;
                tL_chatAdminRights = channelParticipant.admin_rights;
                i2 = channelParticipant.date;
                str2 = channelParticipant.rank;
                j = 0;
                tL_chatBannedRights = tL_chatBannedRights2;
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                j3 = chatParticipant.user_id;
                i2 = chatParticipant.date;
                z2 = xc2.w(4, this.n);
                str2 = "";
                j = 0;
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
            } else {
                j = 0;
                str = null;
                z2 = false;
                tL_chatAdminRights = null;
                i2 = 0;
                j2 = 0;
                tL_chatBannedRights = null;
                i3 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                if (i3 == 0 && j2 != getUserConfig().e()) {
                    boolean z11 = this.s;
                    int i7 = this.O;
                    if (i7 == 2) {
                        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j2));
                        if (xc2.w(4, this.n) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z2)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean z12 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
                        if ((!z12 && !(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || z2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z12 && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (xc2.w(2, this.n) && z5 && !z11 && xc2.T(this.n) && !this.n.gigagroup) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (i == 0) {
                            z4 &= !lbc.z(X1);
                        }
                        if (!z4) {
                            z8 = z7;
                            if (!xc2.w(2, this.n) || !z5) {
                                z9 = false;
                                if (z && z9) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_chatBannedRights;
                                    int i8 = i2;
                                    boolean z13 = z4;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
                                    boolean z14 = z8;
                                    boolean z15 = z6;
                                    le leVar = new le(this, j2, i8, tLObject, tL_chatAdminRights2, tL_chatBannedRights3, str, z5);
                                    long j4 = j2;
                                    fu5 I = fu5.I(this, view);
                                    I.X(this.c.W0(view, false));
                                    if (z15) {
                                        i5 = 2131751269;
                                        str4 = null;
                                    } else {
                                        str4 = null;
                                        i5 = 2131745275;
                                    }
                                    I.k(2131232054, ob6.M0(i5, str4), new vd2(leVar, (byte) 1), z13);
                                    I.k(2131232281, ob6.M0(2131752521, "ChangePermissions"), new ao1(this, tLObject, X1, leVar, (byte) 10), z14);
                                    if (xc2.w(2, this.n) && z5) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z11) {
                                        str5 = "ChannelRemoveUser";
                                        i6 = 2131752282;
                                    } else {
                                        str5 = "KickFromGroup";
                                        i6 = 2131748809;
                                    }
                                    I.l(2131232333, new ue2(this, X1, j4, (byte) 19), ob6.M0(i6, str5), z10, true);
                                    I.Y = 190;
                                    I.a0();
                                    return true;
                                }
                                return z9;
                            }
                        } else {
                            z8 = z7;
                        }
                        z9 = true;
                        if (z) {
                        }
                        return z9;
                    }
                    String str6 = str;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
                    fu5 I2 = fu5.I(this, view);
                    if (i7 == 3 && xc2.w(2, this.n)) {
                        I2.b(2131232281, ob6.M0(2131752386, null), new da7(this, j2, tL_chatBannedRights, str6, tLObject, (byte) 2), false);
                        I2.b(2131232113, ob6.M0(2131752394, "ChannelDeleteFromList"), new Runnable(this) {
                            public final bg2 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b2 = r4;
                                bg2 bg2Var = this.b;
                                long j5 = j2;
                                switch (b2) {
                                    case 0:
                                        bg2Var.i0(j5);
                                        return;
                                    case 1:
                                        bg2 bg2Var2 = this.b;
                                        bg2Var2.i0(j5);
                                        bg2Var2.getMessagesController().k(bg2Var2.N, bg2Var2.getMessagesController().X1(Long.valueOf(j5)), null, bg2Var2, false, null, null);
                                        return;
                                    case 2:
                                        bg2Var.i0(j5);
                                        return;
                                    default:
                                        bg2 bg2Var3 = this.b;
                                        bg2Var3.getMessagesController().d5(bg2Var3.N, bg2Var3.getMessagesController().X1(Long.valueOf(j5)), new TLRPC.TL_chatAdminRights(), "", !bg2Var3.s, bg2Var3, false, false, null, null, null);
                                        bg2Var3.z0(j5);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i7 == 0 && xc2.w(2, this.n)) {
                        if (xc2.w(3, this.n) && i3 > 0 && !xc2.Y(this.n)) {
                            if (z11) {
                                i4 = 2131752505;
                                str3 = null;
                            } else {
                                str3 = null;
                                i4 = 2131752503;
                            }
                            I2.b(2131232104, ob6.M0(i4, str3), new Runnable(this) {
                                public final bg2 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void run() {
                                    byte b2 = r4;
                                    bg2 bg2Var = this.b;
                                    long j5 = j2;
                                    switch (b2) {
                                        case 0:
                                            bg2Var.i0(j5);
                                            return;
                                        case 1:
                                            bg2 bg2Var2 = this.b;
                                            bg2Var2.i0(j5);
                                            bg2Var2.getMessagesController().k(bg2Var2.N, bg2Var2.getMessagesController().X1(Long.valueOf(j5)), null, bg2Var2, false, null, null);
                                            return;
                                        case 2:
                                            bg2Var.i0(j5);
                                            return;
                                        default:
                                            bg2 bg2Var3 = this.b;
                                            bg2Var3.getMessagesController().d5(bg2Var3.N, bg2Var3.getMessagesController().X1(Long.valueOf(j5)), new TLRPC.TL_chatAdminRights(), "", !bg2Var3.s, bg2Var3, false, false, null, null, null);
                                            bg2Var3.z0(j5);
                                            return;
                                    }
                                }
                            }, false);
                        }
                        I2.b(2131232113, ob6.M0(2131752394, "ChannelDeleteFromList"), new Runnable(this) {
                            public final bg2 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b2 = r4;
                                bg2 bg2Var = this.b;
                                long j5 = j2;
                                switch (b2) {
                                    case 0:
                                        bg2Var.i0(j5);
                                        return;
                                    case 1:
                                        bg2 bg2Var2 = this.b;
                                        bg2Var2.i0(j5);
                                        bg2Var2.getMessagesController().k(bg2Var2.N, bg2Var2.getMessagesController().X1(Long.valueOf(j5)), null, bg2Var2, false, null, null);
                                        return;
                                    case 2:
                                        bg2Var.i0(j5);
                                        return;
                                    default:
                                        bg2 bg2Var3 = this.b;
                                        bg2Var3.getMessagesController().d5(bg2Var3.N, bg2Var3.getMessagesController().X1(Long.valueOf(j5)), new TLRPC.TL_chatAdminRights(), "", !bg2Var3.s, bg2Var3, false, false, null, null, null);
                                        bg2Var3.z0(j5);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i7 == 1 && xc2.w(4, this.n) && z2) {
                        if (!this.n.creator && (tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                            b = 3;
                        } else {
                            b = 3;
                            I2.b(2131232054, ob6.M0(2131751269, "EditAdminRights"), new da7(this, j2, tL_chatAdminRights3, str6, tLObject, (byte) 3), false);
                        }
                        I2.b(2131232333, ob6.M0(2131752281, "ChannelRemoveUserAdmin"), new Runnable(this) {
                            public final bg2 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b2 = b;
                                bg2 bg2Var = this.b;
                                long j5 = j2;
                                switch (b2) {
                                    case 0:
                                        bg2Var.i0(j5);
                                        return;
                                    case 1:
                                        bg2 bg2Var2 = this.b;
                                        bg2Var2.i0(j5);
                                        bg2Var2.getMessagesController().k(bg2Var2.N, bg2Var2.getMessagesController().X1(Long.valueOf(j5)), null, bg2Var2, false, null, null);
                                        return;
                                    case 2:
                                        bg2Var.i0(j5);
                                        return;
                                    default:
                                        bg2 bg2Var3 = this.b;
                                        bg2Var3.getMessagesController().d5(bg2Var3.N, bg2Var3.getMessagesController().X1(Long.valueOf(j5)), new TLRPC.TL_chatAdminRights(), "", !bg2Var3.s, bg2Var3, false, false, null, null, null);
                                        bg2Var3.z0(j5);
                                        return;
                                }
                            }
                        }, true);
                    }
                    I2.X(this.c.W0(view, false));
                    I2.Y = 190;
                    if (I2.y() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z && z3) {
                        I2.a0();
                        return true;
                    }
                    return z3;
                }
            }
            str = str2;
            j2 = j3;
            i3 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
            return i3 == 0 ? false : false;
        }
        return false;
    }

    public final void i0(long j) {
        if (this.w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().j1(j);
            tL_communities_toggleParticipantBanned.community = getMessagesController().h1(this.N);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new ic((byte) 0), new n82(this, (byte) 3));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().j1(j);
        tL_channels_editBanned.channel = getMessagesController().h1(this.N);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new ye(this, (byte) 14));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int k0() {
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull != null) {
            int i = chatFull.slowmode_seconds;
            if (i == 5) {
                return 1;
            }
            if (i == 10) {
                return 2;
            }
            if (i == 30) {
                return 3;
            }
            if (i == 60) {
                return 4;
            }
            if (i == 300) {
                return 5;
            }
            if (i == 900) {
                return 6;
            }
            if (i == 3600) {
                return 7;
            }
            return 0;
        }
        return 0;
    }

    public final int l0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull == null) {
            return 0;
        }
        int i = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        if (chatParticipants != null && (arrayList = chatParticipants.participants) != null) {
            return Math.max(i, arrayList.size());
        }
        return i;
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final boolean o0() {
        boolean z;
        if (this.r1 && q0()) {
            z = true;
        } else {
            z = false;
        }
        TLRPC.ChatFull chatFull = this.r;
        if (chatFull != null) {
            int i = chatFull.boosts_unrestrict;
            int i2 = this.s1;
            if (i != i2 || (!z ? i2 != 0 : i2 == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        return g0(z);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().b(this, jn7.T);
        getNotificationCenter().b(this, jn7.y1);
        t0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.T);
        getNotificationCenter().n(this, jn7.y1);
    }

    @Override
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        hl.V2(getParentActivity(), this.classGuid);
        xf2 xf2Var = this.a;
        if (xf2Var != null) {
            xf2Var.f();
        }
        z2b z2bVar = this.b;
        if (z2bVar != null) {
            z2bVar.requestLayout();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            G0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.B1 = true;
            if (!z2 && this.n1) {
                this.f.getSearchField().requestFocus();
                hl.E3(this.f.getSearchField());
                this.f.setVisibility(8);
            }
        }
    }

    public final boolean p0(int i) {
        if (i != this.V && i != this.W && i != this.X && i != this.Y && i != this.Z && i != this.a0 && i != this.k0 && i != this.b0 && i != this.c0 && i != this.d0) {
            return false;
        }
        return true;
    }

    public final boolean q0() {
        TLRPC.Chat chat = this.n;
        if (chat.megagroup && !chat.gigagroup && xc2.y(13, chat)) {
            if (this.p1 <= 0) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights = this.E;
                if (tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void r0(int r34, android.view.View r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bg2.r0(int, android.view.View):void");
    }

    public final void s0(long j) {
        if (j != 0) {
            this.N = j;
            this.n = uc7.s1(this.currentAccount).M0(Long.valueOf(j));
            y0();
        }
    }

    public final void t0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (!this.Q) {
            int i = 0;
            this.J = false;
            this.I = false;
            boolean z = this.w;
            int i2 = this.O;
            zh6 zh6Var = this.L;
            ArrayList arrayList = this.G;
            zh6 zh6Var2 = this.M;
            ArrayList arrayList2 = this.H;
            zh6 zh6Var3 = this.K;
            ArrayList arrayList3 = this.F;
            if (z && i2 == 2) {
                this.Q = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                zh6Var3.b();
                zh6Var2.b();
                zh6Var.b();
                HashMap hashMap = lv2.r(this.currentAccount).h0;
                ArrayList arrayList4 = lv2.r(this.currentAccount).i0;
                int size = arrayList4.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList4.get(i3);
                    i3++;
                    ArrayList arrayList5 = (ArrayList) hashMap.get((String) obj);
                    int size2 = arrayList5.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayList5.get(i4);
                        i4++;
                        arrayList3.add(getMessagesController().X1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id)));
                    }
                }
                F0();
                xf2 xf2Var = this.a;
                if (xf2Var != null) {
                    xf2Var.f();
                }
            } else if (!xc2.T(this.n)) {
                this.Q = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                zh6Var3.b();
                zh6Var2.b();
                zh6Var.b();
                if (i2 == 1) {
                    TLRPC.ChatFull chatFull2 = this.r;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        int size3 = chatParticipants.participants.size();
                        while (i < size3) {
                            TLRPC.ChatParticipant chatParticipant = this.r.participants.participants.get(i);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                arrayList3.add(chatParticipant);
                            }
                            zh6Var3.k(chatParticipant.user_id, chatParticipant);
                            i++;
                        }
                    }
                } else if (i2 == 2 && (chatFull = this.r) != null && chatFull.participants != null) {
                    long j = getUserConfig().n;
                    int size4 = this.r.participants.participants.size();
                    while (i < size4) {
                        TLRPC.ChatParticipant chatParticipant2 = this.r.participants.participants.get(i);
                        int i5 = this.e1;
                        if (i5 == 0 || chatParticipant2.user_id != j) {
                            if (i5 == 1) {
                                if (getContactsController().x(chatParticipant2.user_id)) {
                                    arrayList2.add(chatParticipant2);
                                    zh6Var2.k(chatParticipant2.user_id, chatParticipant2);
                                } else if (!lbc.z(getMessagesController().X1(Long.valueOf(chatParticipant2.user_id)))) {
                                    arrayList3.add(chatParticipant2);
                                    zh6Var3.k(chatParticipant2.user_id, chatParticipant2);
                                }
                            } else if (getContactsController().x(chatParticipant2.user_id)) {
                                arrayList2.add(chatParticipant2);
                                zh6Var2.k(chatParticipant2.user_id, chatParticipant2);
                            } else {
                                TLRPC.User X1 = getMessagesController().X1(Long.valueOf(chatParticipant2.user_id));
                                if (X1 != null && X1.bot) {
                                    arrayList.add(chatParticipant2);
                                    zh6Var.k(chatParticipant2.user_id, chatParticipant2);
                                } else {
                                    arrayList3.add(chatParticipant2);
                                    zh6Var3.k(chatParticipant2.user_id, chatParticipant2);
                                }
                            }
                        }
                        i++;
                    }
                }
                xf2 xf2Var2 = this.a;
                if (xf2Var2 != null) {
                    xf2Var2.f();
                }
                F0();
                xf2 xf2Var3 = this.a;
                if (xf2Var3 != null) {
                    xf2Var3.f();
                }
            } else {
                this.Q = true;
                z2b z2bVar = this.b;
                if (z2bVar != null) {
                    z2bVar.e(true, false);
                }
                xf2 xf2Var4 = this.a;
                if (xf2Var4 != null) {
                    xf2Var4.f();
                }
                ArrayList u0 = u0();
                ArrayList arrayList6 = new ArrayList();
                on1 on1Var = new on1(this, u0, arrayList6, (byte) 23);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                for (int i6 = 0; i6 < u0.size(); i6++) {
                    arrayList6.add(null);
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) u0.get(i6), new eu0(arrayList6, i6, atomicInteger, u0, on1Var, (byte) 3)), this.classGuid);
                }
            }
        }
    }

    public final ArrayList u0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().h1(this.N);
        int i = this.O;
        if (i == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i == 2) {
            TLRPC.ChatFull chatFull = this.r;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.n) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                boolean z = this.J;
                if (this.e1 == 1) {
                    if (!z) {
                        this.k1 = 2;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                        this.J = true;
                        arrayList.addAll(u0());
                    } else {
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                    }
                } else if (!z) {
                    this.k1 = 3;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.J = true;
                    arrayList.addAll(u0());
                } else if (!this.I) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                    this.I = true;
                    arrayList.addAll(u0());
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            }
        } else if (i == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0(TLRPC.User user) {
        int i;
        zh6 zh6Var;
        ArrayList arrayList;
        boolean z;
        UndoView undoView = this.h;
        long j = -this.N;
        boolean z2 = this.s;
        if (z2) {
            i = 9;
        } else {
            i = 10;
        }
        undoView.m(j, user, i);
        this.n.creator = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            zh6Var = this.K;
            arrayList = this.F;
            if (i2 >= 3) {
                break;
            }
            boolean z4 = true;
            if (i2 == 0) {
                zh6Var = this.M;
                arrayList = this.H;
            } else if (i2 == 1) {
                zh6Var = this.L;
                arrayList = this.G;
            }
            TLObject tLObject = (TLObject) zh6Var.f(user.id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j2 = user.id;
                tL_peerUser.user_id = j2;
                zh6Var.k(j2, tL_channelParticipantCreator);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z3 = true;
                z = true;
            } else {
                z = false;
            }
            long e = getUserConfig().e();
            TLObject tLObject2 = (TLObject) zh6Var.f(e);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = e;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = e;
                tL_channelParticipantAdmin.promoted_by = e;
                tL_channelParticipantAdmin.date = (int) (System.currentTimeMillis() / 1000);
                TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
                tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                tL_chatAdminRights.add_admins = true;
                tL_chatAdminRights.manage_ranks = true;
                tL_chatAdminRights.pin_messages = true;
                tL_chatAdminRights.manage_topics = true;
                tL_chatAdminRights.invite_users = true;
                tL_chatAdminRights.ban_users = true;
                tL_chatAdminRights.delete_messages = true;
                tL_chatAdminRights.edit_messages = true;
                tL_chatAdminRights.post_messages = true;
                tL_chatAdminRights.change_info = true;
                if (!z2) {
                    tL_chatAdminRights.manage_call = true;
                }
                zh6Var.k(e, tL_channelParticipantAdmin);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z4 = z;
            }
            if (z4) {
                Collections.sort(arrayList, new ta((byte) 27));
            }
            i2++;
        }
        if (!z3) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j3 = user.id;
            tL_peerUser3.user_id = j3;
            zh6Var.k(j3, tL_channelParticipantCreator2);
            arrayList.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList, new ta((byte) 26));
            F0();
        }
        this.a.f();
        uf2 uf2Var = this.m1;
        if (uf2Var != null) {
            uf2Var.a(user);
        }
    }

    public final void x0(long j, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, int i, boolean z2) {
        boolean z3;
        long j2 = this.N;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.E;
        if (tLObject == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        pd2 pd2Var = new pd2(j, j2, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, i, z, z3, null);
        pd2Var.Y0 = new lf2(this, tLObject, j, z2);
        presentFragment(pd2Var, z2);
    }

    public final void y0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bg2.y0():void");
    }

    public final void z0(long j) {
        zh6 zh6Var;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        vf2 A0 = A0();
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                zh6Var = this.M;
                arrayList = this.H;
            } else if (i == 1) {
                zh6Var = this.L;
                arrayList = this.G;
            } else {
                zh6Var = this.K;
                arrayList = this.F;
            }
            TLObject tLObject = (TLObject) zh6Var.f(j);
            if (tLObject != null) {
                zh6Var.l(j);
                arrayList.remove(tLObject);
                if (this.O == 0 && (chatFull = this.r) != null) {
                    chatFull.kicked_count--;
                }
                z = true;
            }
        }
        if (z) {
            D0(A0);
        }
        j79 adapter = this.c.getAdapter();
        ag2 ag2Var = this.e;
        if (adapter == ag2Var) {
            sv9 sv9Var = ag2Var.h;
            Object f = sv9Var.f.f(j);
            if (f != null) {
                sv9Var.e.remove(f);
            }
            Object f2 = sv9Var.h.f(j);
            if (f2 != null) {
                sv9Var.g.remove(f2);
            }
            Object f3 = ag2Var.e.f(j);
            if (f3 != null) {
                ag2Var.d.remove(f3);
            }
            ag2Var.f();
        }
    }
}
