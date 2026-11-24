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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public final class wg2 extends d implements jm7 {
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
    public final vh6 K;
    public int K0;
    public final vh6 L;
    public int L0;
    public final vh6 M;
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
    public sg2 a;
    public int a0;
    public int a1;
    public a1b b;
    public int b0;
    public int b1;
    public fv c;
    public int c0;
    public int c1;
    public jg2 d;
    public int d0;
    public int d1;
    public vg2 e;
    public int e0;
    public final int e1;
    public zja f;
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
    public pg2 m1;
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

    public wg2(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.E = new TLRPC.TL_chatBannedRights();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.K = new vh6();
        this.L = new vh6();
        this.M = new vh6();
        this.z1 = 10L;
        this.A1 = 10L;
        this.N = this.arguments.getLong("chat_id");
        this.O = this.arguments.getInt("type");
        this.P = this.arguments.getBoolean("transfer");
        this.n1 = this.arguments.getBoolean("open_search");
        this.e1 = this.arguments.getInt("selectType");
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.N));
        this.n = L0;
        boolean z = false;
        if (L0 != null && (tL_chatBannedRights = L0.default_banned_rights) != null) {
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
        this.y = sd2.D(this.E);
        boolean Y = sd2.Y(this.n);
        this.w = Y;
        if (sd2.T(this.n) && !this.n.megagroup && !Y) {
            z = true;
        }
        this.s = z;
        this.x = sd2.c0(this.n);
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

    public static int k0(TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            if (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_channelParticipant)) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static int n0(int i) {
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

    public static int o0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
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

    public final qg2 A0() {
        qg2 qg2Var = new qg2(this);
        qg2Var.a = this.d1;
        qg2Var.h = this.X0;
        qg2Var.i = this.Y0;
        qg2Var.k.clear();
        qg2Var.k.addAll(this.G);
        qg2Var.g = this.V0;
        qg2Var.f = this.U0;
        qg2Var.l.clear();
        qg2Var.l.addAll(this.H);
        qg2Var.d = this.E0;
        qg2Var.e = this.F0;
        qg2Var.j.clear();
        qg2Var.j.addAll(this.F);
        qg2Var.e(qg2Var.b);
        return qg2Var;
    }

    public final void B0(TLRPC.ChatFull chatFull) {
        boolean z;
        long j;
        this.r = chatFull;
        if (chatFull != null) {
            int l0 = l0();
            this.q1 = l0;
            this.p1 = l0;
            int i = this.r.boosts_unrestrict;
            boolean z2 = false;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            this.r1 = z;
            this.s1 = i;
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.N));
            if (L0 == null) {
                j = 0;
            } else {
                j = L0.send_paid_messages_stars;
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
            long k = Utilities.k(j, getMessagesController().l4.H1.f(), 1L);
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
                this.c.getViewTreeObserver().addOnPreDrawListener(new m42(this, tk4Var, i, (byte) 1));
            }
        }
    }

    public final void D0(qg2 qg2Var) {
        View view;
        if (this.a == null) {
            F0();
            return;
        }
        F0();
        qg2Var.e(qg2Var.c);
        ww7.a(qg2Var, true).c(this.a);
        fv fvVar = this.c;
        if (fvVar != null && this.d != null && fvVar.getChildCount() > 0) {
            int i = 0;
            int i2 = -1;
            while (true) {
                if (i < this.c.getChildCount()) {
                    i2 = RecyclerView.R(this.c.getChildAt(i));
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
        vh6 vh6Var;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                vh6Var = this.M;
            } else if (i == 1) {
                vh6Var = this.L;
            } else {
                vh6Var = this.K;
            }
            TLObject tLObject = (TLObject) vh6Var.f(k47.B1(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
        }
    }

    public final void F0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.F0():void");
    }

    public final void G0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.c != null) {
                int w0 = cmb.w0(null, cmb.x6, false);
                int w02 = cmb.w0(null, cmb.m6, false);
                if (w0 != this.E1 || w02 != this.F1) {
                    this.E1 = w0;
                    this.F1 = w02;
                    for (int i = 1; i < 4; i++) {
                        if (i == 0) {
                            attachedScrapChildCount = this.c.getChildCount();
                        } else {
                            fv fvVar = this.c;
                            if (i == 1) {
                                attachedScrapChildCount = fvVar.getHiddenChildCount();
                            } else if (i == 2) {
                                attachedScrapChildCount = fvVar.getCachedChildCount();
                            } else {
                                attachedScrapChildCount = fvVar.getAttachedScrapChildCount();
                            }
                        }
                        for (int i2 = 0; i2 < attachedScrapChildCount; i2++) {
                            if (i == 0) {
                                O = this.c.getChildAt(i2);
                            } else {
                                fv fvVar2 = this.c;
                                if (i == 1) {
                                    O = fvVar2.W(i2);
                                } else if (i == 2) {
                                    O = fvVar2.P(i2);
                                } else {
                                    O = fvVar2.O(i2);
                                }
                            }
                            if (O instanceof ij6) {
                                ((ij6) O).updateColors();
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.u6));
        hashSet.add(Integer.valueOf(cmb.t6));
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.xj));
        hashSet.add(Integer.valueOf(cmb.wj));
        hashSet.add(Integer.valueOf(cmb.vj));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.e7));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override
    public final boolean canBeginSlide() {
        return h0(true);
    }

    @Override
    public final View createView(Context context) {
        int i = 1;
        setHasOwnBackground(true);
        this.o1 = false;
        this.simpleActionBar.setBackButtonImage(2131231244);
        int i2 = this.e1;
        int i3 = this.O;
        if (i3 == 3) {
            this.simpleActionBar.setTitle(jb6.M0(2131752275, "ChannelPermissions"));
        } else if (i3 == 0) {
            this.simpleActionBar.setTitle(jb6.M0(2131752399, "ChannelBlacklist"));
        } else if (i3 == 1) {
            this.simpleActionBar.setTitle(jb6.M0(2131752464, null));
        } else if (i3 == 2) {
            if (i2 == 0) {
                rja rjaVar = this.simpleActionBar;
                if (this.s) {
                    rjaVar.setTitle(jb6.M0(2131752227, null));
                } else {
                    rjaVar.setTitle(jb6.M0(2131752321, "ChannelMembers"));
                }
            } else if (i2 == 1) {
                this.simpleActionBar.setTitle(jb6.M0(2131752481, "ChannelAddAdmin"));
            } else if (i2 == 2) {
                this.simpleActionBar.setTitle(jb6.M0(2131752398, "ChannelBlockUser"));
            } else if (i2 == 3) {
                this.simpleActionBar.setTitle(jb6.M0(2131752480, "ChannelAddException"));
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 29));
        if (i2 == 0 && i3 != 2 && i3 != 0 && i3 != 3) {
            if (i3 == 1 && sd2.V(this.n) && sd2.N(this.n)) {
                this.simpleActionBar.s(jb6.M0(2131745680, null));
            }
        } else {
            this.e = new vg2(this, context);
            zja a = this.simpleActionBar.t().a(0, 2131232503);
            a.N();
            a.C0 = new q20(this, (byte) 5);
            this.f = a;
            if (i3 == 0 && !this.R) {
                a.setVisibility(8);
            }
            zja zjaVar = this.f;
            if (i3 == 3) {
                zjaVar.setSearchFieldHint(jb6.M0(2131752245, "ChannelSearchException"));
            } else {
                zjaVar.setSearchFieldHint(jb6.M0(2131745570, "Search"));
            }
            if (!sd2.T(this.n) && !this.n.creator) {
                this.f.setVisibility(8);
            }
            if (i3 == 3) {
                this.simpleActionBar.s(jb6.M0(2131745680, null));
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
        int i4 = cmb.F8;
        int i5 = cmb.h6;
        tk4Var3.e(i4, i5, i5);
        frameLayout2.addView(this.C1, qoe.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.D1 = radialProgressView;
        frameLayout2.addView(radialProgressView, qoe.e(-2, -2, 17));
        this.C1.setVisibility(8);
        this.D1.setVisibility(8);
        a1b a1bVar = new a1b(context, frameLayout2, 1, null);
        this.b = a1bVar;
        a1bVar.d.setText(jb6.M0(2131747901, null));
        this.b.e.setText(jb6.M0(2131745541, null));
        this.b.setVisibility(8);
        this.b.setAnimateLayoutChange(true);
        this.b.e(true, false);
        this.b.addView(frameLayout2, 0);
        fv fvVar = new fv((byte) 13, context, this);
        this.c = fvVar;
        fvVar.r1();
        this.c.setSectionsDrawBackground(true);
        fv fvVar2 = this.c;
        jg2 jg2Var = new jg2(this, (byte) 0);
        this.d = jg2Var;
        fvVar2.setLayoutManager(jg2Var);
        kg2 kg2Var = new kg2(this);
        kg2Var.n(420L);
        kg2Var.o(d53.h);
        kg2Var.C = false;
        kg2Var.m = false;
        this.c.setItemAnimator(kg2Var);
        fv fvVar3 = this.c;
        fvVar3.X1 = true;
        fvVar3.Y1 = false;
        sg2 sg2Var = new sg2(this, context);
        this.a = sg2Var;
        fvVar3.setAdapter(sg2Var);
        fv fvVar4 = this.c;
        if (!jb6.a0) {
            i = 2;
        }
        fvVar4.setVerticalScrollbarPosition(i);
        frameLayout.addView(this.c, qoe.c(-1.0f, -1));
        frameLayout.addView(this.b, qoe.c(-1.0f, -1));
        this.c.setOnItemClickListener(new zf2(this, (byte) 3));
        this.c.setOnItemLongClickListener(new zf2(this, (byte) 4));
        if (this.f != null) {
            this.c.setOnScrollListener(new y(this, (byte) 28));
        }
        UndoView undoView = new UndoView(context);
        this.h = undoView;
        frameLayout.addView(undoView, qoe.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        F0();
        this.c.setEmptyView(this.b);
        fv fvVar5 = this.c;
        fvVar5.X1 = false;
        fvVar5.Y1 = false;
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
        if (i == nm7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (chatFull.id == this.N) {
                if (!booleanValue || !sd2.T(this.n)) {
                    boolean z3 = true;
                    if (this.r != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.r = chatFull;
                    if (!z) {
                        int l0 = l0();
                        this.q1 = l0;
                        this.p1 = l0;
                        int i3 = this.r.boosts_unrestrict;
                        if (i3 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.r1 = z2;
                        this.s1 = i3;
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.N));
                        if (L0 == null) {
                            j = 0;
                        } else {
                            j = L0.send_paid_messages_stars;
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
                        long k = Utilities.k(j, getMessagesController().l4.H1.f(), 1L);
                        this.A1 = k;
                        this.z1 = k;
                    }
                    gm.c3(new wf2(this, (byte) 0));
                }
            }
        } else if (i == nm7.y1 && ((Long) objArr[0]).longValue() == (-this.N)) {
            tk5 tk5Var = this.parentLayout;
            if (tk5Var != null && tk5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        za2 za2Var = new za2(this, (byte) 2);
        arrayList.add(new cnb(this.c, 16, new Class[]{jf5.class, ij6.class, fj6.class, ajb.class, vkb.class, hla.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.c, 0, new Class[]{ajb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.T6));
        arrayList.add(new cnb(this.c, 0, new Class[]{ajb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.U6));
        int i = cmb.x6;
        arrayList.add(new cnb(this.c, 0, new Class[]{ij6.class}, new String[]{"statusColor"}, (Drawable[]) null, za2Var, i));
        arrayList.add(new cnb(this.c, 0, new Class[]{ij6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, za2Var, cmb.m6));
        arrayList.add(new cnb(this.b.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F6));
        arrayList.add(new cnb(this.b.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        return arrayList;
    }

    public final boolean h0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.h0(boolean):boolean");
    }

    public final boolean i0(TLObject tLObject, boolean z, View view) {
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
                j3 = k47.B1(channelParticipant.peer);
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
                z2 = sd2.w(4, this.n);
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
                        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j2));
                        if (sd2.w(4, this.n) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z2)) {
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
                        if (sd2.w(2, this.n) && z5 && !z11 && sd2.T(this.n) && !this.n.gigagroup) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (i == 0) {
                            z4 &= !m9c.z(W1);
                        }
                        if (!z4) {
                            z8 = z7;
                            if (!sd2.w(2, this.n) || !z5) {
                                z9 = false;
                                if (z && z9) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_chatBannedRights;
                                    int i8 = i2;
                                    boolean z13 = z4;
                                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
                                    boolean z14 = z8;
                                    boolean z15 = z6;
                                    fi fiVar = new fi(this, j2, i8, tLObject, tL_chatAdminRights2, tL_chatBannedRights3, str, z5);
                                    long j4 = j2;
                                    bu5 I = bu5.I(this, view);
                                    I.X(this.c.V0(view, false));
                                    if (z15) {
                                        i5 = 2131751241;
                                        str4 = null;
                                    } else {
                                        str4 = null;
                                        i5 = 2131745281;
                                    }
                                    I.k(2131232055, jb6.M0(i5, str4), new xf2(fiVar, (byte) 0), z13);
                                    I.k(2131232282, jb6.M0(2131752493, "ChangePermissions"), new xo1(this, tLObject, W1, fiVar, (byte) 10), z14);
                                    if (sd2.w(2, this.n) && z5) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z11) {
                                        str5 = "ChannelRemoveUser";
                                        i6 = 2131752254;
                                    } else {
                                        str5 = "KickFromGroup";
                                        i6 = 2131748812;
                                    }
                                    I.l(2131232334, new of2(this, W1, j4, (byte) 19), jb6.M0(i6, str5), z10, true);
                                    I.V = 190;
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
                    bu5 I2 = bu5.I(this, view);
                    if (i7 == 3 && sd2.w(2, this.n)) {
                        I2.b(2131232282, jb6.M0(2131752358, null), new r97(this, j2, tL_chatBannedRights, str6, tLObject, (byte) 2), false);
                        I2.b(2131232114, jb6.M0(2131752366, "ChannelDeleteFromList"), new Runnable(this) {
                            public final wg2 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b2 = r4;
                                wg2 wg2Var = this.b;
                                long j5 = j2;
                                switch (b2) {
                                    case 0:
                                        wg2Var.j0(j5);
                                        return;
                                    case 1:
                                        wg2 wg2Var2 = this.b;
                                        wg2Var2.j0(j5);
                                        wg2Var2.getMessagesController().k(wg2Var2.N, wg2Var2.getMessagesController().W1(Long.valueOf(j5)), null, wg2Var2, false, null, null);
                                        return;
                                    case 2:
                                        wg2Var.j0(j5);
                                        return;
                                    default:
                                        wg2 wg2Var3 = this.b;
                                        wg2Var3.getMessagesController().X4(wg2Var3.N, wg2Var3.getMessagesController().W1(Long.valueOf(j5)), new TLRPC.TL_chatAdminRights(), "", !wg2Var3.s, wg2Var3, false, false, null, null, null);
                                        wg2Var3.z0(j5);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i7 == 0 && sd2.w(2, this.n)) {
                        if (sd2.w(3, this.n) && i3 > 0 && !sd2.Y(this.n)) {
                            if (z11) {
                                i4 = 2131752477;
                                str3 = null;
                            } else {
                                str3 = null;
                                i4 = 2131752475;
                            }
                            I2.b(2131232105, jb6.M0(i4, str3), new Runnable(this) {
                                public final wg2 b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void run() {
                                    byte b2 = r4;
                                    wg2 wg2Var = this.b;
                                    long j5 = j2;
                                    switch (b2) {
                                        case 0:
                                            wg2Var.j0(j5);
                                            return;
                                        case 1:
                                            wg2 wg2Var2 = this.b;
                                            wg2Var2.j0(j5);
                                            wg2Var2.getMessagesController().k(wg2Var2.N, wg2Var2.getMessagesController().W1(Long.valueOf(j5)), null, wg2Var2, false, null, null);
                                            return;
                                        case 2:
                                            wg2Var.j0(j5);
                                            return;
                                        default:
                                            wg2 wg2Var3 = this.b;
                                            wg2Var3.getMessagesController().X4(wg2Var3.N, wg2Var3.getMessagesController().W1(Long.valueOf(j5)), new TLRPC.TL_chatAdminRights(), "", !wg2Var3.s, wg2Var3, false, false, null, null, null);
                                            wg2Var3.z0(j5);
                                            return;
                                    }
                                }
                            }, false);
                        }
                        I2.b(2131232114, jb6.M0(2131752366, "ChannelDeleteFromList"), new Runnable(this) {
                            public final wg2 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b2 = r4;
                                wg2 wg2Var = this.b;
                                long j5 = j2;
                                switch (b2) {
                                    case 0:
                                        wg2Var.j0(j5);
                                        return;
                                    case 1:
                                        wg2 wg2Var2 = this.b;
                                        wg2Var2.j0(j5);
                                        wg2Var2.getMessagesController().k(wg2Var2.N, wg2Var2.getMessagesController().W1(Long.valueOf(j5)), null, wg2Var2, false, null, null);
                                        return;
                                    case 2:
                                        wg2Var.j0(j5);
                                        return;
                                    default:
                                        wg2 wg2Var3 = this.b;
                                        wg2Var3.getMessagesController().X4(wg2Var3.N, wg2Var3.getMessagesController().W1(Long.valueOf(j5)), new TLRPC.TL_chatAdminRights(), "", !wg2Var3.s, wg2Var3, false, false, null, null, null);
                                        wg2Var3.z0(j5);
                                        return;
                                }
                            }
                        }, true);
                    } else if (i7 == 1 && sd2.w(4, this.n) && z2) {
                        if (!this.n.creator && (tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                            b = 3;
                        } else {
                            b = 3;
                            I2.b(2131232055, jb6.M0(2131751241, "EditAdminRights"), new r97(this, j2, tL_chatAdminRights3, str6, tLObject, (byte) 3), false);
                        }
                        I2.b(2131232334, jb6.M0(2131752253, "ChannelRemoveUserAdmin"), new Runnable(this) {
                            public final wg2 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b2 = b;
                                wg2 wg2Var = this.b;
                                long j5 = j2;
                                switch (b2) {
                                    case 0:
                                        wg2Var.j0(j5);
                                        return;
                                    case 1:
                                        wg2 wg2Var2 = this.b;
                                        wg2Var2.j0(j5);
                                        wg2Var2.getMessagesController().k(wg2Var2.N, wg2Var2.getMessagesController().W1(Long.valueOf(j5)), null, wg2Var2, false, null, null);
                                        return;
                                    case 2:
                                        wg2Var.j0(j5);
                                        return;
                                    default:
                                        wg2 wg2Var3 = this.b;
                                        wg2Var3.getMessagesController().X4(wg2Var3.N, wg2Var3.getMessagesController().W1(Long.valueOf(j5)), new TLRPC.TL_chatAdminRights(), "", !wg2Var3.s, wg2Var3, false, false, null, null, null);
                                        wg2Var3.z0(j5);
                                        return;
                                }
                            }
                        }, true);
                    }
                    I2.X(this.c.V0(view, false));
                    I2.V = 190;
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

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(long j) {
        if (this.w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().i1(j);
            tL_communities_toggleParticipantBanned.community = getMessagesController().g1(this.N);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new kc((byte) 0), new h92(this, (byte) 3));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().i1(j);
        tL_channels_editBanned.channel = getMessagesController().g1(this.N);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new tg(this, (byte) 14));
    }

    public final int l0() {
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

    public final int m0() {
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

    @Override
    public final boolean onBackPressed(boolean z) {
        return h0(z);
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
        getNotificationCenter().b(this, nm7.T);
        getNotificationCenter().b(this, nm7.y1);
        u0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.T);
        getNotificationCenter().n(this, nm7.y1);
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
        gm.V2(getParentActivity(), this.classGuid);
        sg2 sg2Var = this.a;
        if (sg2Var != null) {
            sg2Var.f();
        }
        a1b a1bVar = this.b;
        if (a1bVar != null) {
            a1bVar.requestLayout();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            G0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.B1 = true;
            if (!z2 && this.n1) {
                this.f.getSearchField().requestFocus();
                gm.E3(this.f.getSearchField());
                this.f.setVisibility(8);
            }
        }
    }

    public final boolean p0() {
        boolean z;
        if (this.r1 && r0()) {
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

    public final boolean q0(int i) {
        if (i != this.V && i != this.W && i != this.X && i != this.Y && i != this.Z && i != this.a0 && i != this.k0 && i != this.b0 && i != this.c0 && i != this.d0) {
            return false;
        }
        return true;
    }

    public final boolean r0() {
        TLRPC.Chat chat = this.n;
        if (chat.megagroup && !chat.gigagroup && sd2.y(13, chat)) {
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

    public final void s0(int r34, android.view.View r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.s0(int, android.view.View):void");
    }

    public final void t0(long j) {
        if (j != 0) {
            this.N = j;
            this.n = oc7.r1(this.currentAccount).L0(Long.valueOf(j));
            y0();
        }
    }

    public final void u0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (!this.Q) {
            int i = 0;
            this.J = false;
            this.I = false;
            boolean z = this.w;
            int i2 = this.O;
            vh6 vh6Var = this.L;
            ArrayList arrayList = this.G;
            vh6 vh6Var2 = this.M;
            ArrayList arrayList2 = this.H;
            vh6 vh6Var3 = this.K;
            ArrayList arrayList3 = this.F;
            if (z && i2 == 2) {
                this.Q = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                vh6Var3.b();
                vh6Var2.b();
                vh6Var.b();
                HashMap hashMap = bw2.r(this.currentAccount).h0;
                ArrayList arrayList4 = bw2.r(this.currentAccount).i0;
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
                        arrayList3.add(getMessagesController().W1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id)));
                    }
                }
                F0();
                sg2 sg2Var = this.a;
                if (sg2Var != null) {
                    sg2Var.f();
                }
            } else if (!sd2.T(this.n)) {
                this.Q = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                vh6Var3.b();
                vh6Var2.b();
                vh6Var.b();
                if (i2 == 1) {
                    TLRPC.ChatFull chatFull2 = this.r;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        int size3 = chatParticipants.participants.size();
                        while (i < size3) {
                            TLRPC.ChatParticipant chatParticipant = this.r.participants.participants.get(i);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                arrayList3.add(chatParticipant);
                            }
                            vh6Var3.k(chatParticipant, chatParticipant.user_id);
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
                                    vh6Var2.k(chatParticipant2, chatParticipant2.user_id);
                                } else if (!m9c.z(getMessagesController().W1(Long.valueOf(chatParticipant2.user_id)))) {
                                    arrayList3.add(chatParticipant2);
                                    vh6Var3.k(chatParticipant2, chatParticipant2.user_id);
                                }
                            } else if (getContactsController().x(chatParticipant2.user_id)) {
                                arrayList2.add(chatParticipant2);
                                vh6Var2.k(chatParticipant2, chatParticipant2.user_id);
                            } else {
                                TLRPC.User W1 = getMessagesController().W1(Long.valueOf(chatParticipant2.user_id));
                                if (W1 != null && W1.bot) {
                                    arrayList.add(chatParticipant2);
                                    vh6Var.k(chatParticipant2, chatParticipant2.user_id);
                                } else {
                                    arrayList3.add(chatParticipant2);
                                    vh6Var3.k(chatParticipant2, chatParticipant2.user_id);
                                }
                            }
                        }
                        i++;
                    }
                }
                sg2 sg2Var2 = this.a;
                if (sg2Var2 != null) {
                    sg2Var2.f();
                }
                F0();
                sg2 sg2Var3 = this.a;
                if (sg2Var3 != null) {
                    sg2Var3.f();
                }
            } else {
                this.Q = true;
                a1b a1bVar = this.b;
                if (a1bVar != null) {
                    a1bVar.e(true, false);
                }
                sg2 sg2Var4 = this.a;
                if (sg2Var4 != null) {
                    sg2Var4.f();
                }
                ArrayList v0 = v0();
                ArrayList arrayList6 = new ArrayList();
                co1 co1Var = new co1(this, v0, arrayList6, (byte) 21);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                for (int i6 = 0; i6 < v0.size(); i6++) {
                    arrayList6.add(null);
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) v0.get(i6), new ev0(arrayList6, i6, atomicInteger, v0, co1Var, (byte) 3)), this.classGuid);
                }
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final ArrayList v0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().g1(this.N);
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
                        arrayList.addAll(v0());
                    } else {
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                    }
                } else if (!z) {
                    this.k1 = 3;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.J = true;
                    arrayList.addAll(v0());
                } else if (!this.I) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                    this.I = true;
                    arrayList.addAll(v0());
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

    public final void w0(TLRPC.User user) {
        int i;
        vh6 vh6Var;
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
        undoView.m(user, i, j);
        this.n.creator = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            vh6Var = this.K;
            arrayList = this.F;
            if (i2 >= 3) {
                break;
            }
            boolean z4 = true;
            if (i2 == 0) {
                vh6Var = this.M;
                arrayList = this.H;
            } else if (i2 == 1) {
                vh6Var = this.L;
                arrayList = this.G;
            }
            TLObject tLObject = (TLObject) vh6Var.f(user.id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j2 = user.id;
                tL_peerUser.user_id = j2;
                vh6Var.k(tL_channelParticipantCreator, j2);
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
            TLObject tLObject2 = (TLObject) vh6Var.f(e);
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
                vh6Var.k(tL_channelParticipantAdmin, e);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z4 = z;
            }
            if (z4) {
                Collections.sort(arrayList, new sa((byte) 27));
            }
            i2++;
        }
        if (!z3) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j3 = user.id;
            tL_peerUser3.user_id = j3;
            vh6Var.k(tL_channelParticipantCreator2, j3);
            arrayList.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList, new sa((byte) 26));
            F0();
        }
        this.a.f();
        pg2 pg2Var = this.m1;
        if (pg2Var != null) {
            pg2Var.a(user);
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
        ke2 ke2Var = new ke2(j, j2, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, i, z, z3, null);
        ke2Var.Y0 = new gg2(this, tLObject, j, z2);
        presentFragment(ke2Var, z2);
    }

    public final void y0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.y0():void");
    }

    public final void z0(long j) {
        vh6 vh6Var;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        qg2 A0 = A0();
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                vh6Var = this.M;
                arrayList = this.H;
            } else if (i == 1) {
                vh6Var = this.L;
                arrayList = this.G;
            } else {
                vh6Var = this.K;
                arrayList = this.F;
            }
            TLObject tLObject = (TLObject) vh6Var.f(j);
            if (tLObject != null) {
                vh6Var.l(j);
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
        y59 adapter = this.c.getAdapter();
        vg2 vg2Var = this.e;
        if (adapter == vg2Var) {
            bu9 bu9Var = vg2Var.h;
            Object f = bu9Var.f.f(j);
            if (f != null) {
                bu9Var.e.remove(f);
            }
            Object f2 = bu9Var.h.f(j);
            if (f2 != null) {
                bu9Var.g.remove(f2);
            }
            Object f3 = vg2Var.e.f(j);
            if (f3 != null) {
                vg2Var.d.remove(f3);
            }
            vg2Var.f();
        }
    }
}
