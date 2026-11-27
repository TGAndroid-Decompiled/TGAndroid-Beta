package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public class l46 extends ny0 implements fn7 {
    public static final int R2 = 0;
    public final TextView A2;
    public c51 B2;
    public Runnable C2;
    public boolean D2;
    public i69 E2;
    public final e F2;
    public tb G2;
    public k46 H2;
    public boolean I2;
    public TLRPC.Chat J2;
    public final tj4 K2;
    public Runnable L2;
    public int M2;
    public final c51 N2;
    public int O2;
    public int P2;
    public String Q2;
    public int S1;
    public boolean T1;
    public int U1;
    public long V1;
    public TL_stories.TL_premium_boostsStatus W1;
    public wg1 X1;
    public j46 Y1;
    public boolean Z1;
    public boolean a2;
    public wb2 b2;
    public final int c2;
    public final ArrayList d2;
    public boolean e2;
    public int f2;
    public int g2;
    public int h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;
    public int m2;
    public int n2;
    public int o2;
    public ArrayList p2;
    public boolean q2;
    public int r2;
    public i46 s2;
    public final HashSet t2;
    public final ArrayList u2;
    public final ArrayList v2;
    public ArrayList w2;
    public ArrayList x2;
    public ArrayList y2;
    public a46 z2;

    public l46(int i, int i2, vnb vnbVar, Context context, e eVar) {
        super(context, eVar, false, h1(i), vnbVar);
        this.U1 = -1;
        this.a2 = false;
        this.d2 = new ArrayList();
        this.g2 = -1;
        this.h2 = -1;
        this.i2 = -1;
        this.j2 = -1;
        this.k2 = -1;
        this.l2 = -1;
        this.m2 = -1;
        this.n2 = -1;
        this.o2 = -1;
        this.r2 = -1;
        this.t2 = new HashSet();
        this.u2 = new ArrayList();
        this.v2 = new ArrayList();
        this.w2 = new ArrayList();
        this.x2 = new ArrayList();
        this.y2 = new ArrayList();
        this.D2 = false;
        this.M2 = 0;
        this.P2 = -4;
        K(aob.v0(aob.h5, this.J0));
        this.O2 = this.H0;
        this.F2 = eVar;
        this.a = i2;
        this.c2 = i;
        X0();
        y1();
        if (i == 2) {
            this.D2 = true;
            y1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new v36(this, (byte) 0));
        } else if (i == 5) {
            this.D2 = true;
            y1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new v36(this, (byte) 2));
        }
        x1();
        if (i == 32 || i1()) {
            tj4 tj4Var = new tj4(getContext());
            this.K2 = tj4Var;
            this.c.addView(tj4Var, tre.c(-1.0f, -1));
        }
        if (i == 18 || i == 20 || i == 24 || i == 25 || i == 26 || i == 29 || i == 22 || i == 23 || i == 21 || i == 27 || i == 28 || i == 30 || i == 35 || i == 31) {
            ((ViewGroup) this.z2.getParent()).removeView(this.z2);
            tb tbVar = this.G2;
            if (tbVar != null) {
                ((ViewGroup) tbVar.getParent()).removeView(this.G2);
            }
            this.n1.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.A2 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(hl.o());
            textView.setText(this.z2.getTextView().getText());
            yob.X(textView, aob.Ji, vnbVar);
            textView.setOnClickListener(new u36(this, (byte) 0));
            int L = hl.L(8.0f);
            int i3 = aob.Fi;
            int v0 = aob.v0(i3, vnbVar);
            int i4 = aob.d6;
            int o = vm2.o(aob.v0(i4, vnbVar), 120);
            hf0 i0 = aob.i0(L, L, L, L, v0, o, o);
            uob M = yob.M(i3);
            uob g = yob.g(i4, 120);
            textView.setBackground(i0);
            yob.j(textView, i0, M, g, vnbVar);
        }
        if (i == 32) {
            ((ViewGroup) this.z2.getParent()).removeView(this.z2);
            c51 c51Var = new c51(vnbVar, context, true);
            this.N2 = c51Var;
            c51Var.k();
            c51Var.i(ob6.M0(2131753618, null), false, true);
            c51Var.setOnClickListener(new u36(this, (byte) 1));
            this.b.addView(c51Var, tre.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.b.post(new w36(this, (byte) 3));
        }
        if (i != 19 && i != 18) {
            return;
        }
        this.b.post(new w36(this, (byte) 4));
    }

    public static k46 g1(int i, int i2) {
        ?? obj = new Object();
        obj.a = 0;
        obj.b = null;
        obj.c = null;
        obj.d = null;
        obj.e = 0;
        obj.f = 0;
        if (i == 0) {
            obj.e = uc7.s1(i2).l4.l1.f();
            obj.f = uc7.s1(i2).l4.m1.f();
            obj.a = 2131232206;
            obj.b = ob6.a0("LimitReachedPinDialogs", null, 2131748708, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = ob6.a0("LimitReachedPinDialogsPremium", null, 2131748706, Integer.valueOf(obj.f));
            obj.d = ob6.a0("LimitReachedPinDialogsLocked", null, 2131748707, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 33) {
            obj.e = uc7.s1(i2).l4.p2.f();
            obj.f = uc7.s1(i2).l4.q2.f();
            obj.a = 2131232206;
            obj.b = ob6.a0(null, null, 2131748705, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = ob6.a0(null, null, 2131748703, Integer.valueOf(obj.f));
            obj.d = ob6.a0(null, null, 2131748704, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 2) {
            obj.e = uc7.s1(i2).l4.p3.f();
            obj.f = uc7.s1(i2).l4.n1.f();
            obj.a = 2131232205;
            obj.b = ob6.a0("LimitReachedPublicLinks", null, 2131748701, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = ob6.a0("LimitReachedPublicLinksPremium", null, 2131748699, Integer.valueOf(obj.f));
            obj.d = ob6.a0("LimitReachedPublicLinksLocked", null, 2131748700, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 12) {
            obj.e = uc7.s1(i2).l4.C1.f();
            obj.f = uc7.s1(i2).l4.B3.f();
            obj.a = 2131232205;
            obj.b = ob6.a0("LimitReachedFolderLinks", null, 2131748714, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = ob6.a0("LimitReachedFolderLinksPremium", null, 2131748712, Integer.valueOf(obj.f));
            obj.d = ob6.a0("LimitReachedFolderLinksLocked", null, 2131748713, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 13) {
            obj.e = uc7.s1(i2).l4.L1.f();
            obj.f = uc7.s1(i2).l4.C3.f();
            obj.a = 2131232203;
            obj.b = ob6.a0("LimitReachedSharedFolders", null, 2131748697, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = ob6.a0("LimitReachedSharedFoldersPremium", null, 2131748695, Integer.valueOf(obj.f));
            obj.d = ob6.a0("LimitReachedSharedFoldersLocked", null, 2131748696, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 3) {
            obj.e = uc7.s1(i2).l4.h1.f();
            obj.f = uc7.s1(i2).l4.i1.f();
            obj.a = 2131232203;
            obj.b = ob6.a0("LimitReachedFolders", null, 2131748711, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = ob6.a0("LimitReachedFoldersPremium", null, 2131748709, Integer.valueOf(obj.f));
            obj.d = ob6.a0("LimitReachedFoldersLocked", null, 2131748710, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 4) {
            obj.e = uc7.s1(i2).l4.j1.f();
            obj.f = uc7.s1(i2).l4.k1.f();
            obj.a = 2131232202;
            obj.b = ob6.a0("LimitReachedChatInFolders", null, 2131748729, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = ob6.a0("LimitReachedChatInFoldersPremium", null, 2131748727, Integer.valueOf(obj.f));
            obj.d = ob6.a0("LimitReachedChatInFoldersLocked", null, 2131748728, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 5) {
            obj.e = uc7.s1(i2).l4.t3.f();
            obj.f = uc7.s1(i2).l4.u3.f();
            obj.a = 2131232204;
            obj.b = ob6.a0("LimitReachedCommunities", null, 2131748726, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = ob6.a0("LimitReachedCommunitiesPremium", null, 2131748724, Integer.valueOf(obj.f));
            obj.d = ob6.a0("LimitReachedCommunitiesLocked", null, 2131748725, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 6) {
            obj.e = 100;
            obj.f = 200;
            obj.a = 2131232203;
            obj.b = ob6.a0("LimitReachedFileSize", null, 2131748717, "2 GB", "4 GB");
            obj.c = ob6.a0("LimitReachedFileSizePremium", null, 2131748715, "4 GB");
            obj.d = ob6.a0("LimitReachedFileSizeLocked", null, 2131748716, "2 GB");
            return obj;
        } else if (i == 7) {
            obj.e = 3;
            obj.f = 4;
            obj.a = 2131232201;
            obj.b = ob6.a0("LimitReachedAccounts", null, 2131748731, 3, Integer.valueOf(obj.f));
            obj.c = ob6.a0("LimitReachedAccountsPremium", null, 2131748730, Integer.valueOf(obj.f));
            obj.d = ob6.a0("LimitReachedAccountsPremium", null, 2131748730, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 11) {
            obj.e = 0;
            obj.f = 0;
            obj.a = 2131232205;
            obj.b = ob6.a0("LimitReachedAccounts", null, 2131748731, 0, Integer.valueOf(obj.f));
            obj.c = "";
            obj.d = "";
            return obj;
        } else if (i == 14) {
            obj.e = uc7.s1(i2).l4.D1.f();
            obj.f = uc7.s1(i2).l4.E1.f();
            obj.a = 2131232207;
            obj.b = ob6.H(',', "LimitReachedStoriesCount2First", obj.e) + "\n" + ob6.H(',', "LimitReachedStoriesCount2Second", obj.f);
            obj.c = ob6.H(',', "LimitReachedStoriesCount2Premium", obj.f);
            obj.d = ob6.H(',', "LimitReachedStoriesCount2Premium", obj.e);
            return obj;
        } else if (i == 15) {
            obj.e = uc7.s1(i2).l4.H1.f();
            obj.f = uc7.s1(i2).l4.I1.f();
            obj.a = 2131232207;
            obj.b = ob6.a0("LimitReachedStoriesWeekly", null, 2131748683, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = ob6.a0("LimitReachedStoriesWeeklyPremium", null, 2131748682, Integer.valueOf(obj.f));
            obj.d = ob6.a0("LimitReachedStoriesWeeklyPremium", null, 2131748682, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 16) {
            obj.e = uc7.s1(i2).l4.J1.f();
            obj.f = uc7.s1(i2).l4.K1.f();
            obj.a = 2131232207;
            obj.b = ob6.a0("LimitReachedStoriesMonthly", null, 2131748685, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = ob6.a0("LimitReachedStoriesMonthlyPremium", null, 2131748684, Integer.valueOf(obj.f));
            obj.d = ob6.a0("LimitReachedStoriesMonthlyPremium", null, 2131748684, Integer.valueOf(obj.e));
            return obj;
        } else if (i != 18 && i != 32 && i != 20 && i != 24 && i != 27 && i != 28 && i != 25 && i != 30 && i != 35 && i != 29 && i != 22 && i != 23 && i != 19 && i != 21 && i != 26) {
            return obj;
        } else {
            obj.e = uc7.s1(i2).l4.J1.f();
            obj.f = uc7.s1(i2).l4.K1.f();
            obj.a = 2131231129;
            obj.b = ob6.a0("LimitReachedStoriesMonthly", null, 2131748685, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = ob6.a0("LimitReachedStoriesMonthlyPremium", null, 2131748684, Integer.valueOf(obj.f));
            obj.d = ob6.a0("LimitReachedStoriesMonthlyPremium", null, 2131748684, Integer.valueOf(obj.e));
            return obj;
        }
    }

    public static boolean h1(int i) {
        if (i != 0 && i != 33 && i != 3 && i != 4 && i != 6 && i != 7 && i != 12 && i != 13 && i != 14 && i != 15 && i != 16) {
            return false;
        }
        return true;
    }

    public static String m1(int i) {
        switch (i) {
            case 0:
                return "double_limits__dialog_pinned";
            case 1:
            case 7:
            case 11:
            default:
                return null;
            case 2:
                return "double_limits__channels_public";
            case 3:
                return "double_limits__dialog_filters";
            case 4:
                return "double_limits__dialog_filters_chats";
            case 5:
                return "double_limits__channels";
            case 6:
                return "double_limits__upload_max_fileparts";
            case 8:
                return "double_limits__caption_length";
            case 9:
                return "double_limits__saved_gifs";
            case 10:
                return "double_limits__stickers_faved";
            case 12:
                return "double_limits__chatlist_invites";
            case 13:
                return "double_limits__chatlists_joined";
        }
    }

    public static void o1(e eVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, wg1 wg1Var, long j, boolean z) {
        if (tL_premium_boostsStatus != null && wg1Var != null && eVar.getContext() != null) {
            l46 l46Var = new l46(32, eVar.getCurrentAccount(), eVar.getResourceProvider(), eVar.getContext(), eVar);
            l46Var.s1(wg1Var);
            l46Var.r1(tL_premium_boostsStatus, true);
            l46Var.t1(j);
            if (z) {
                eVar.showDialog(l46Var);
            } else {
                l46Var.show();
            }
        }
    }

    @Override
    public final c79 H0(d79 d79Var) {
        return new d46(this);
    }

    @Override
    public final CharSequence K0() {
        int i = this.c2;
        if (i != 11) {
            if (i != 34) {
                if (i != 35) {
                    int i2 = 2131753618;
                    switch (i) {
                        case 18:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                            return ob6.M0(2131743529, null);
                        case 19:
                        case 30:
                            if (!j1()) {
                                i2 = 2131753656;
                            }
                            return ob6.M0(i2, null);
                        case 31:
                            return ob6.M0(2131753593, null);
                        case 32:
                            return ob6.M0(2131753618, null);
                        default:
                            return ob6.M0(2131748732, null);
                    }
                }
                return ob6.M0(2131743529, null);
            }
            return ob6.M0(2131752603, null);
        }
        return ob6.M0(2131752373, null);
    }

    @Override
    public final void Q0(wma wmaVar) {
        int i;
        Context context = wmaVar.getContext();
        c51 c51Var = new c51(this.J0, context, true);
        this.B2 = c51Var;
        c51Var.setFlickeringLoading(true);
        this.B2.i(ob6.M0(2131753657, null), false, true);
        this.B2.setOnClickListener(new u36(this, (byte) 2));
        a46 a46Var = new a46(this, context, this.J0);
        this.z2 = a46Var;
        iye.b(a46Var, 0.02f, 1.2f);
        if (!this.s1 && (i = this.c2) != 18 && i != 20 && i != 24 && i != 25 && i != 26 && i != 29 && i != 22 && i != 23 && i != 21 && i != 27 && i != 28 && i != 30 && i != 35) {
            tb tbVar = new tb((byte) 20, context, this);
            this.G2 = tbVar;
            yob.h(aob.h5, this.J0, tbVar);
            wmaVar.addView(this.G2, tre.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        a46 a46Var2 = this.z2;
        float f = (this.u0 / hl.p) + 16.0f;
        wmaVar.addView(a46Var2, tre.d(-1, 48.0f, 80, f, 0.0f, f, 12.0f));
        int L = hl.L(72.0f);
        d79 d79Var = this.n1;
        d79Var.setPadding(0, 0, 0, L);
        d79Var.setClipToPadding(false);
        d79Var.setClipChildren(false);
        d79Var.setOnItemClickListener(new zg4(this, (byte) 9));
        d79Var.setOnItemLongClickListener(new x36(this, (byte) 2));
        this.z2.w.setOnClickListener(new uv5(this, context, (byte) 3));
        this.z2.h.setOnClickListener(new u36(this, (byte) 3));
        this.E2 = new i69(d79Var, true);
    }

    public final void Z0(final ka6 ka6Var, boolean z) {
        if (ka6Var.a() && !z) {
            return;
        }
        ka6Var.setLoading(true);
        uc7.s1(this.a).G0();
        long j = this.V1;
        int i = this.X1.g;
        on0.a(-j, Arrays.asList(Integer.valueOf(i)), new pcc(this) {
            public final l46 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r3;
                ka6 ka6Var2 = ka6Var;
                l46 l46Var = this.b;
                switch (b) {
                    case 0:
                        uc7.s1(l46Var.a).G0().a(l46Var.V1, new gt(l46Var, ka6Var2, (TL_stories.TL_premium_myBoosts) obj, (byte) 24));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                hl.d3(new tg5(l46Var, ka6Var2, (byte) 29), intValue * 1000);
                                return;
                            }
                            ym0.g(intValue);
                        }
                        ka6Var2.setLoading(false);
                        return;
                }
            }
        }, new pcc(this) {
            public final l46 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r3;
                ka6 ka6Var2 = ka6Var;
                l46 l46Var = this.b;
                switch (b) {
                    case 0:
                        uc7.s1(l46Var.a).G0().a(l46Var.V1, new gt(l46Var, ka6Var2, (TL_stories.TL_premium_myBoosts) obj, (byte) 24));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                hl.d3(new tg5(l46Var, ka6Var2, (byte) 29), intValue * 1000);
                                return;
                            }
                            ym0.g(intValue);
                        }
                        ka6Var2.setLoading(false);
                        return;
                }
            }
        });
    }

    public final void a1() {
        if (this.B2.isAttachedToWindow()) {
            Z0(this.B2, false);
            return;
        }
        c51 c51Var = this.N2;
        if (c51Var != null && c51Var.isAttachedToWindow()) {
            Z0(c51Var, false);
        } else {
            Z0(this.z2, false);
        }
    }

    public int b1() {
        return 0;
    }

    public final String c1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.W1.boost_url;
        }
        int i = this.a;
        long j = this.V1;
        uc7 s1 = uc7.s1(i);
        long j2 = -j;
        TLRPC.Chat M0 = s1.M0(Long.valueOf(j2));
        if (!TextUtils.isEmpty(xc2.K(M0, false))) {
            return "https://t.me/boost/" + xc2.K(M0, false);
        }
        return qu6.n(j2, "https://t.me/boost/?c=");
    }

    public final String d1(boolean z) {
        String str;
        boolean z2;
        int i;
        int i2;
        String str2;
        if (this.c2 == 32) {
            TLRPC.Chat f1 = f1();
            TLRPC.ChatFull N0 = uc7.s1(this.a).N0(-this.V1);
            int max = Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0);
            if (f1 == null) {
                str2 = "";
            } else {
                str2 = f1.title;
            }
            return ob6.G(max, "BoostingRemoveRestrictionsSubtitle", str2);
        }
        TLRPC.Chat M0 = uc7.s1(this.a).M0(Long.valueOf(-this.V1));
        if (M0 == null) {
            if (j1()) {
                i2 = 2131754872;
            } else {
                i2 = 2131754900;
            }
            str = ob6.M0(i2, null);
        } else {
            str = M0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = 2131752324;
        if (k1() && this.W1.next_level_boosts != 0 && z) {
            if (j1()) {
                i3 = 2131749174;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.W1;
            int i4 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return ob6.a0(null, null, i3, str, ob6.G(i4, "MoreBoosts", Integer.valueOf(i4)));
        }
        int i5 = 2131752423;
        if (z2 && this.X1.d) {
            if (this.W1.level == 1) {
                if (j1()) {
                    i = 2131749247;
                } else {
                    i = 2131752424;
                }
                return ob6.a0(null, null, i, new Object[0]);
            }
            if (j1()) {
                i5 = 2131749246;
            }
            return ob6.a0(null, null, i5, Integer.valueOf(this.W1.level), ob6.G(this.W1.level, "BoostStories", new Object[0]));
        }
        boolean z3 = this.X1.d;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.W1;
        if (z3) {
            if (tL_premium_boostsStatus3.level == 0) {
                if (j1()) {
                    i3 = 2131749174;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.W1;
                int i6 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return ob6.a0(null, null, i3, str, ob6.G(i6, "MoreBoosts", Integer.valueOf(i6)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (j1()) {
                    i5 = 2131749246;
                }
                return ob6.a0(null, null, i5, Integer.valueOf(this.W1.level), ob6.G(this.W1.level + 1, "BoostStories", new Object[0]));
            } else {
                if (j1()) {
                    i3 = 2131749174;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.W1;
                int i7 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return ob6.a0(null, null, i3, str, ob6.G(i7, "MoreBoosts", Integer.valueOf(i7)));
            }
        } else if (tL_premium_boostsStatus3.level == 0) {
            if (j1()) {
                i3 = 2131749174;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.W1;
            int i8 = tL_premium_boostsStatus6.next_level_boosts - tL_premium_boostsStatus6.boosts;
            return ob6.a0(null, null, i3, str, ob6.G(i8, "MoreBoosts", Integer.valueOf(i8)));
        } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
            if (j1()) {
                i5 = 2131749246;
            }
            return ob6.a0(null, null, i5, Integer.valueOf(this.W1.level), ob6.G(this.W1.level + 1, "BoostStories", new Object[0]));
        } else {
            if (j1()) {
                i3 = 2131749174;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.W1;
            int i9 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return ob6.a0(null, null, i3, str, ob6.G(i9, "MoreBoosts", Integer.valueOf(i9)));
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        TLRPC.ChatFull N0;
        e eVar;
        e eVar2;
        if (i == jn7.X2) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            e eVar3 = this.r1;
            e lastFragment = eVar3.getParentLayout().getLastFragment();
            e eVar4 = null;
            if (lastFragment instanceof t82) {
                List fragmentStack = eVar3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    eVar = (e) bp1.m(2, fragmentStack);
                } else {
                    eVar = null;
                }
                if (fragmentStack.size() >= 3) {
                    eVar2 = (e) bp1.m(3, fragmentStack);
                } else {
                    eVar2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    eVar4 = (e) bp1.m(4, fragmentStack);
                }
                if (eVar instanceof g92) {
                    ((ActionBarLayout) eVar3.getParentLayout()).c0(eVar, false);
                }
                dismiss();
                if (booleanValue) {
                    if (eVar2 instanceof ProfileActivity) {
                        ((ActionBarLayout) eVar3.getParentLayout()).c0(eVar2, false);
                    }
                    lastFragment.finishFragment();
                    ym0.f(eVar4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                ym0.f(eVar2, chat, false);
            } else if ((lastFragment instanceof zu1) && booleanValue) {
                ym0.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof wh1) && booleanValue) {
                List fragmentStack2 = eVar3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    e eVar5 = (e) fragmentStack2.get(size);
                    if (!(eVar5 instanceof zu1) && !(eVar5 instanceof uj3)) {
                        arrayList.add(eVar5);
                    } else {
                        eVar4 = eVar5;
                        break;
                    }
                }
                if (eVar4 != null) {
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((ActionBarLayout) eVar3.getParentLayout()).c0((e) obj, false);
                    }
                    eVar3.finishFragment();
                    dismiss();
                    ym0.f(eVar4, chat, true);
                }
            } else {
                sbb sbbVar = sbb.G2;
                if (booleanValue) {
                    if (sbbVar != null && sbbVar.d) {
                        zu1 ha = zu1.ha(-chat.id);
                        LaunchActivity.Q().presentFragment(ha, false, false);
                        sbb.v();
                        dismiss();
                        ym0.f(ha, chat, true);
                        return;
                    }
                    List fragmentStack3 = eVar3.getParentLayout().getFragmentStack();
                    if (fragmentStack3.size() >= 2) {
                        eVar4 = (e) bp1.m(2, fragmentStack3);
                    }
                    eVar3.finishFragment();
                    dismiss();
                    if (eVar4 instanceof zu1) {
                        ym0.f(eVar4, chat, true);
                    }
                } else if (sbbVar != null && sbbVar.d) {
                    zu1 ha2 = zu1.ha(-chat.id);
                    LaunchActivity.Q().presentFragment(ha2, false, false);
                    sbb.v();
                    dismiss();
                    ym0.f(ha2, chat, false);
                } else {
                    dismiss();
                    ym0.f(LaunchActivity.Q(), chat, false);
                }
            }
        } else if (i == jn7.W2) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus != null && this.X1 != null) {
                this.W1.boosts += intValue;
                if (this.c2 == 32 && (N0 = uc7.s1(this.a).N0(-this.V1)) != null) {
                    N0.boosts_applied += intValue;
                }
                l1();
                r1(tL_premium_boostsStatus, this.Z1);
                wg1 wg1Var = this.X1;
                if (this.W1.next_level_boosts <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                wg1Var.m = z;
                wg1Var.l = true;
                wg1Var.a(tL_premium_myBoosts);
                if (n1()) {
                    v21 Q = new d31(this.c, this.J0).Q(2131624051, 30, ob6.G(intValue, "BoostingReassignedFromPlural", ob6.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                    Q.j = 4000;
                    Q.k(true);
                }
            }
        } else if (i == jn7.V2) {
            dismiss();
        }
    }

    public final String e1() {
        int i;
        int i2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return ob6.a0("BoostsMaxLevelReached", null, 2131753151, new Object[0]);
        }
        int i3 = 2131753656;
        if (tL_premium_boostsStatus.level > 0 && !this.X1.d) {
            if (j1()) {
                i3 = 2131753618;
            }
            return ob6.M0(i3, null);
        }
        boolean z = this.Z1;
        int i4 = this.c2;
        if (z) {
            if (i4 == 32) {
                if (j1()) {
                    i3 = 2131753618;
                }
                return ob6.M0(i3, null);
            }
            TLRPC.Chat M0 = uc7.s1(this.a).M0(Long.valueOf(-this.V1));
            if (this.X1.d) {
                return ob6.a0("YouBoostedChannel2", null, 2131742471, M0.title);
            }
            if (j1()) {
                i3 = 2131753618;
            }
            return ob6.M0(i3, null);
        } else if (i4 == 32) {
            if (j1()) {
                i3 = 2131753618;
            }
            return ob6.M0(i3, null);
        } else if (this.X1.d) {
            if (j1()) {
                i2 = 2131742470;
            } else {
                i2 = 2131742472;
            }
            return ob6.M0(i2, null);
        } else {
            if (j1()) {
                i = 2131753520;
            } else {
                i = 2131753521;
            }
            return ob6.M0(i, null);
        }
    }

    public final TLRPC.Chat f1() {
        return uc7.s1(this.a).M0(Long.valueOf(-this.V1));
    }

    public final boolean i1() {
        int i = this.c2;
        if (i != 19 && i != 18 && i != 20 && i != 24 && i != 25 && i != 26 && i != 29 && i != 22 && i != 27 && i != 28 && i != 23 && i != 30 && i != 35) {
            return false;
        }
        return true;
    }

    public final boolean j1() {
        return !xc2.V(uc7.s1(this.a).M0(Long.valueOf(-this.V1)));
    }

    public final boolean k1() {
        if (i1() && xc2.N(f1())) {
            return true;
        }
        return false;
    }

    public final void l1() {
        int i;
        i46 i46Var = this.s2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        int i2 = tL_premium_boostsStatus.boosts;
        int i3 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        i46Var.b++;
        i46Var.a = ete.a((i2 - i) / i3, 0.0f, 1.0f);
        i46Var.a0 = true;
        i46Var.b0 = i46Var.n;
        i46Var.j(i2, true);
        i46Var.J.requestLayout();
        i46Var.requestLayout();
    }

    public final boolean n1() {
        int f;
        int i;
        int f2;
        int i2;
        int f3;
        int i3;
        int i4;
        int f4;
        int i5;
        int f5;
        int i6;
        int i7;
        int i8;
        jn7 f6 = jn7.f(this.a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        wg1 wg1Var = this.X1;
        wg1Var.getClass();
        wg1 wg1Var2 = new wg1();
        wg1Var2.a = wg1Var.a;
        wg1Var2.b = wg1Var.b;
        wg1Var2.c = wg1Var.c;
        wg1Var2.d = wg1Var.d;
        wg1Var2.e = wg1Var.e;
        wg1Var2.g = wg1Var.g;
        wg1Var2.h = wg1Var.h;
        wg1Var2.i = wg1Var.i;
        wg1Var2.j = wg1Var.j;
        wg1Var2.k = wg1Var.k;
        wg1Var2.m = wg1Var.m;
        f6.m(jn7.r3, tL_premium_boostsStatus, wg1Var2, Long.valueOf(this.V1));
        c51 c51Var = this.N2;
        if (c51Var != null) {
            TLRPC.ChatFull N0 = uc7.s1(this.a).N0(-this.V1);
            int max = Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0);
            if (max == 0) {
                jn7.f(this.a).m(jn7.q3, new Object[0]);
                dismiss();
                return false;
            }
            c51Var.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new i7((byte) 2));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.Y1, transitionSet);
        j46 j46Var = this.Y1;
        mm0 mm0Var = j46Var.c;
        int indexOfChild = j46Var.indexOfChild(j46Var.b);
        l46 l46Var = j46Var.e;
        if (l46Var.Z1) {
            int indexOfChild2 = j46Var.indexOfChild(j46Var.d);
            j46Var.removeView(j46Var.d);
            j46Var.d.removeView(j46Var.a);
            j46Var.d.removeView(mm0Var);
            LinearLayout linearLayout = new LinearLayout(j46Var.getContext());
            j46Var.d = linearLayout;
            linearLayout.setOrientation(0);
            j46Var.d.setWeightSum(1.0f);
            j46Var.d.addView(j46Var.a, tre.p(-2, -2, 1.0f, 0));
            j46Var.d.addView(mm0Var, tre.t(-2, -2, 48, 0, 2, 0, 0));
            j46Var.addView(j46Var.d, indexOfChild2, tre.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = j46Var.indexOfChild(j46Var.a);
            j46Var.removeView(j46Var.a);
            TextView textView = new TextView(j46Var.getContext());
            j46Var.a = textView;
            textView.setTypeface(hl.o());
            j46Var.a.setTextSize(1, 20.0f);
            yob.X(j46Var.a, aob.G6, l46Var.J0);
            j46Var.a.setGravity(17);
            j46Var.addView(j46Var.a, indexOfChild3, tre.t(-2, -2, 1, 0, 22, 0, 0));
        }
        j46Var.removeView(j46Var.b);
        TextView textView2 = new TextView(j46Var.getContext());
        j46Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = j46Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), j46Var.b.getLineSpacingMultiplier() * 1.1f);
        j46Var.b.setGravity(1);
        yob.X(j46Var.b, aob.G6, l46Var.J0);
        j46Var.addView(j46Var.b, indexOfChild, tre.t(-2, -2, 1, 24, -2, 24, 17));
        this.Y1.a.setText(e1());
        TextView textView4 = this.Y1.b;
        hr hrVar = uc7.s1(this.a).l4;
        boolean j1 = j1();
        int i9 = this.c2;
        String str = null;
        if (i9 == 20) {
            if (j1) {
                i8 = 2131749172;
            } else {
                i8 = 2131752321;
            }
            str = ob6.a0(null, null, i8, Integer.valueOf(b1()));
        } else if (i9 == 24) {
            if (j1) {
                i7 = 2131749168;
            } else {
                i7 = 2131752318;
            }
            str = ob6.a0(null, null, i7, Integer.valueOf(b1()));
        } else if (i9 == 29) {
            str = ob6.a0(null, null, 2131749171, Integer.valueOf(hrVar.l2.f()));
        } else if (i9 == 30) {
            str = ob6.a0(null, null, 2131752315, Integer.valueOf(hrVar.b2.f()));
        } else if (i9 == 35) {
            str = ob6.a0(null, null, 2131752322, Integer.valueOf(hrVar.c2.f()));
        } else if (i9 == 25) {
            if (j1) {
                f5 = hrVar.k2.f();
                i6 = 2131749169;
            } else {
                f5 = hrVar.f2.f();
                i6 = 2131752319;
            }
            str = ob6.a0(null, null, i6, Integer.valueOf(f5));
        } else if (i9 == 26) {
            if (j1) {
                f4 = hrVar.k2.f();
                i5 = 2131749164;
            } else {
                f4 = hrVar.f2.f();
                i5 = 2131752313;
            }
            str = ob6.a0(null, null, i5, Integer.valueOf(f4));
        } else if (i9 == 27) {
            if (j1) {
                i4 = 2131749166;
            } else {
                i4 = 2131752316;
            }
            str = ob6.a0(null, null, i4, Integer.valueOf(hrVar.d2.f()));
        } else if (i9 == 28) {
            if (j1) {
                f3 = hrVar.m2.f();
                i3 = 2131749167;
            } else {
                f3 = hrVar.e2.f();
                i3 = 2131752317;
            }
            str = ob6.a0(null, null, i3, Integer.valueOf(f3));
        } else if (i9 == 22) {
            if (j1) {
                f2 = hrVar.j2.f();
                i2 = 2131749165;
            } else {
                f2 = hrVar.n2.f();
                i2 = 2131752314;
            }
            str = ob6.a0(null, null, i2, Integer.valueOf(f2));
        } else if (i9 == 23) {
            if (j1) {
                f = hrVar.g2.f();
                i = 2131749170;
            } else {
                f = hrVar.o2.f();
                i = 2131752320;
            }
            str = ob6.a0(null, null, i, Integer.valueOf(f));
        }
        if (str == null) {
            str = d1(false);
        }
        textView4.setText(hl.S2(str));
        w1();
        tj4 tj4Var = this.K2;
        tj4Var.c(false);
        try {
            tj4Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.Y1.c.a(this.X1.i, true);
        this.n1.A0(0);
        if (i9 == 32) {
            this.Y1.c.setVisibility(8);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.a).b(this, jn7.X2);
        jn7.f(this.a).b(this, jn7.W2);
        jn7.f(this.a).b(this, jn7.V2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.a).n(this, jn7.X2);
        jn7.f(this.a).n(this, jn7.W2);
        jn7.f(this.a).n(this, jn7.V2);
    }

    @Override
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.G0 < 0 && this.H0 == this.O2 && (v0 = aob.v0(aob.h5, this.J0)) != this.H0) {
                this.H0 = v0;
                this.O2 = v0;
                y0(v0);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String G = ob6.G(arrayList.size(), "RevokeLinks", new Object[0]);
        id idVar = alertDialog$Builder.a;
        idVar.S = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            boolean z = this.q2;
            int i = this.a;
            if (z) {
                idVar.U = hl.S2(ob6.a0("RevokeLinkAlertChannel", null, 2131745748, uc7.s1(i).N2 + "/" + xc2.K(chat, false), chat.title));
            } else {
                idVar.U = hl.S2(ob6.a0("RevokeLinkAlert", null, 2131745749, uc7.s1(i).N2 + "/" + xc2.K(chat, false), chat.title));
            }
        } else if (this.q2) {
            idVar.U = hl.S2(ob6.a0("RevokeLinksAlertChannel", null, 2131745745, new Object[0]));
        } else {
            idVar.U = hl.S2(ob6.a0("RevokeLinksAlert", null, 2131745746, new Object[0]));
        }
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131745751, null), new u34(this, arrayList, (byte) 17));
        idVar.show();
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, this.J0);
        }
    }

    public final void q1(HashMap hashMap) {
        String str;
        long longValue;
        ArrayList arrayList;
        HashMap hashMap2 = hashMap;
        if (!TextUtils.isEmpty(this.Q2)) {
            str = this.Q2;
        } else {
            TLRPC.ChatFull N0 = uc7.s1(this.a).N0(this.J2.id);
            if (N0 == null) {
                dismiss();
                return;
            } else if (this.J2.username != null) {
                str = "@" + this.J2.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = N0.exported_invite;
                if (tL_chatInviteExported != null) {
                    str = tL_chatInviteExported.link;
                } else {
                    dismiss();
                    return;
                }
            }
        }
        String str2 = str;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet = this.t2;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long M1 = uc7.s1(this.a).M1(user.id);
            if (M1 <= 0) {
                M1 = wf3.j(uc7.s1(this.a).P2(user.id));
            }
            if (M1 >= 0) {
                arrayList = arrayList2;
            } else {
                arrayList = arrayList3;
            }
            arrayList.add(user);
        }
        int i = 0;
        boolean z = true;
        if (hashMap2 == null && !arrayList2.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                arrayList4.add(Long.valueOf(((TLRPC.User) obj).id));
            }
            jj.Z(this.a, arrayList4, 1, new zj3(this, (byte) 21));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z2 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            if (hashMap2 == null) {
                longValue = 0;
            } else {
                longValue = ((Long) hashMap2.get(Long.valueOf(user2.id))).longValue();
            }
            boolean z3 = z;
            Iterator it3 = it2;
            p7a b = p7a.b(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b.Q = longValue;
            r7a.B(this.a).q0(b);
            if (b.Q > 0) {
                z2 = z3;
            }
            hashMap2 = hashMap;
            z = z3;
            it2 = it3;
        }
        if (!z2) {
            hl.c3(new w36(this, (byte) 2));
        }
        dismiss();
    }

    public final void r1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z) {
        this.W1 = tL_premium_boostsStatus;
        this.Z1 = z;
        y1();
    }

    public final void s1(wg1 wg1Var) {
        this.X1 = wg1Var;
        w1();
        x1();
    }

    public final void t1(long j) {
        this.V1 = j;
        y1();
    }

    public final void u1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        boolean z;
        this.J2 = chat;
        this.Q2 = str;
        if (TextUtils.isEmpty(str) && !xc2.y(3, chat)) {
            z = false;
        } else {
            z = true;
        }
        this.T1 = z;
        this.w2 = new ArrayList(arrayList);
        this.x2 = arrayList2;
        this.y2 = arrayList3;
        HashSet hashSet = this.t2;
        hashSet.clear();
        if (this.T1) {
            ArrayList arrayList4 = this.w2;
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.id))) {
                    hashSet.add(user);
                }
            }
        }
        y1();
        w1();
        int i2 = this.c2;
        if ((i2 == 11 || i2 == 34) && !uc7.s1(this.a).M3()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.w2.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    a46 a46Var = this.z2;
                    if (a46Var != null && a46Var.getParent() != null) {
                        ((ViewGroup) this.z2.getParent()).removeView(this.z2);
                    }
                    tb tbVar = this.G2;
                    if (tbVar != null && tbVar.getParent() != null) {
                        ((ViewGroup) this.G2.getParent()).removeView(this.G2);
                    }
                    d79 d79Var = this.n1;
                    if (d79Var != null) {
                        d79Var.setPadding(0, 0, 0, 0);
                    }
                }
            }
        }
    }

    public final void v1() {
        int i;
        int i2;
        int i3;
        int max;
        int i4;
        int i5;
        int i6;
        String str;
        int i7;
        String str2;
        this.p2 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus != null) {
            i = tL_premium_boostsStatus.level + 1;
        } else {
            i = 1;
        }
        if (this.c2 == 31) {
            i = 1;
        }
        uc7 s1 = uc7.s1(this.a);
        hr hrVar = s1.l4;
        lc7 lc7Var = s1.F3;
        if (lc7Var != null) {
            i2 = lc7Var.e(j1());
        } else {
            i2 = 0;
        }
        int max2 = Math.max(10, i2);
        lc7 lc7Var2 = s1.G3;
        if (lc7Var2 != null) {
            i3 = lc7Var2.e(j1());
        } else {
            i3 = 0;
        }
        int max3 = Math.max(max2, i3);
        if (j1()) {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(max3, hrVar.h2.f()), hrVar.j2.f()), hrVar.g2.f()), hrVar.k2.f()), hrVar.m2.f());
        } else {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max3, hrVar.d2.f()), hrVar.e2.f()), hrVar.f2.f()), hrVar.n2.f()), hrVar.o2.f()), hrVar.b2.f()), hrVar.c2.f());
        }
        ArrayList arrayList = null;
        while (i <= max) {
            boolean j1 = j1();
            ArrayList arrayList2 = new ArrayList();
            uc7 s12 = uc7.s1(this.a);
            hr hrVar2 = s12.l4;
            if (!j1 && i >= hrVar2.c2.f()) {
                arrayList2.add(f46.a(2131231823, 2131753653));
            }
            f46 b = f46.b(2131231820, i, "BoostFeatureStoriesPerDay");
            b.f = true;
            arrayList2.add(b);
            if (!j1) {
                f46 b2 = f46.b(2131231815, i, "BoostFeatureCustomReaction");
                b2.f = true;
                arrayList2.add(b2);
            }
            lc7 lc7Var3 = s12.F3;
            if (lc7Var3 != null) {
                i4 = lc7Var3.a(i, false);
            } else {
                i4 = 0;
            }
            lc7 lc7Var4 = s12.G3;
            if (lc7Var4 != null) {
                i5 = lc7Var4.a(i, j1);
            } else {
                i5 = 0;
            }
            if (!j1 && i4 > 0) {
                arrayList2.add(f46.b(2131231801, 7, "BoostFeatureNameColor"));
            }
            if (!j1 && i4 > 0) {
                arrayList2.add(f46.b(2131231809, i4, "BoostFeatureReplyColor"));
            }
            if (!j1 && i >= hrVar2.d2.f()) {
                arrayList2.add(f46.a(2131231810, 2131753626));
            }
            if (i5 > 0) {
                if (j1) {
                    str2 = "BoostFeatureProfileColorGroup";
                } else {
                    str2 = "BoostFeatureProfileColor";
                }
                arrayList2.add(f46.b(2131231802, i5, str2));
            }
            if (j1 && i >= hrVar2.l2.f()) {
                arrayList2.add(f46.a(2131231812, 2131753644));
            }
            if (j1 ? i >= hrVar2.m2.f() : i >= hrVar2.e2.f()) {
                if (j1) {
                    i7 = 2131753630;
                } else {
                    i7 = 2131753631;
                }
                arrayList2.add(f46.a(2131231803, i7));
            }
            if (j1 && i >= hrVar2.h2.f()) {
                arrayList2.add(f46.a(2131231826, 2131753621));
            }
            if (j1 ? i >= hrVar2.k2.f() : i >= hrVar2.f2.f()) {
                arrayList2.add(new f46(2131231819, 2131753640, -1, "1000+", null));
            }
            if (j1 ? i >= hrVar2.j2.f() : i >= hrVar2.n2.f()) {
                if (j1) {
                    str = "BoostFeatureBackgroundGroup";
                } else {
                    str = "BoostFeatureBackground";
                }
                arrayList2.add(f46.b(2131231827, 8, str));
            }
            if (j1 ? i >= hrVar2.g2.f() : i >= hrVar2.o2.f()) {
                if (j1) {
                    i6 = 2131753645;
                } else {
                    i6 = 2131753646;
                }
                arrayList2.add(f46.a(2131231805, i6));
            }
            if (!j1 && i >= hrVar2.b2.f()) {
                arrayList2.add(f46.a(2131231811, 2131753622));
            }
            Collections.reverse(arrayList2);
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    f46 f46Var = (f46) arrayList.get(i8);
                    f46 f46Var2 = (f46) arrayList2.get(i8);
                    int i9 = f46Var.e;
                    if (f46Var2 != null && ((f46Var.f && i9 > 2) || (f46Var.a == f46Var2.a && f46Var.b == f46Var2.b && TextUtils.equals(f46Var.c, f46Var2.c) && TextUtils.equals(f46Var.d, f46Var2.d) && i9 == f46Var2.e))) {
                    }
                }
                i++;
            }
            ArrayList arrayList3 = this.p2;
            arrayList3.add(new e46(i, arrayList3.isEmpty()));
            this.p2.addAll(arrayList2);
            arrayList = arrayList2;
            i++;
        }
    }

    public final void w1() {
        int i;
        String str = null;
        if (this.e2) {
            this.z2.c(ob6.M0(2131748884, null), false, false);
            return;
        }
        int i2 = this.c2;
        if (i2 != 19 && i2 != 32 && !k1()) {
            HashSet hashSet = this.t2;
            if (i2 != 11 && i2 != 34) {
                if (hashSet.size() > 0) {
                    if (i2 == 2) {
                        str = ob6.G(hashSet.size(), "RevokeLinks", new Object[0]);
                    } else if (i2 == 5) {
                        str = ob6.G(hashSet.size(), "LeaveCommunities", new Object[0]);
                    }
                    this.z2.c(str, true, true);
                    return;
                }
                a46 a46Var = this.z2;
                a46Var.r = false;
                a46Var.d(true);
                return;
            }
            a46 a46Var2 = this.z2;
            if (a46Var2.J == null) {
                ey2 ey2Var = new ey2(a46Var2.getContext(), null);
                a46Var2.J = ey2Var;
                ey2Var.setGravity(3);
                ey2 ey2Var2 = a46Var2.J;
                int i3 = aob.Fi;
                int i4 = aob.Ji;
                dy2 dy2Var = ey2Var2.a;
                dy2Var.v = i3;
                dy2Var.w = i4;
                dy2Var.b = 0.8f;
                a46Var2.setClipChildren(false);
                a46Var2.addView(a46Var2.J, tre.e(-1, 24, 16));
            }
            if (!this.T1) {
                this.z2.c(ob6.M0(2131752006, null), true, true);
            } else {
                int size = hashSet.size();
                a46 a46Var3 = this.z2;
                if (size > 0) {
                    a46Var3.c(ob6.M0(2131745347, null), true, true);
                } else {
                    a46Var3.c(ob6.M0(2131754550, null), true, true);
                }
            }
            this.z2.J.a.c(hashSet.size(), true);
            this.z2.invalidate();
            return;
        }
        wg1 wg1Var = this.X1;
        boolean z = wg1Var.a;
        if ((z || wg1Var.b) && !wg1Var.l && !wg1Var.d) {
            boolean z2 = wg1Var.m;
            a46 a46Var4 = this.z2;
            if (z2) {
                a46Var4.c(ob6.M0(2131747558, null), true, true);
                return;
            }
            a46Var4.r = false;
            a46Var4.d(true);
            return;
        }
        c51 c51Var = this.N2;
        if (z) {
            boolean k = on0.k();
            a46 a46Var5 = this.z2;
            if (k) {
                a46Var5.c(ob6.M0(2131753584, null), true, true);
            } else {
                if (j1()) {
                    i = 2131753618;
                } else {
                    i = 2131753656;
                }
                a46Var5.c(ob6.M0(i, null), true, true);
            }
            this.B2.i(ob6.M0(2131753657, null), true, true);
            if (c51Var != null) {
                c51Var.i(ob6.M0(2131753618, null), true, true);
            }
        } else if (wg1Var.m) {
            this.B2.i(ob6.M0(2131747558, null), true, true);
            if (c51Var != null) {
                c51Var.i(ob6.M0(2131747558, null), true, true);
            }
            this.z2.c(ob6.M0(2131747558, null), true, true);
        } else if (on0.k()) {
            if (c51Var != null) {
                c51Var.i(ob6.M0(2131753618, null), true, true);
            }
            this.B2.i(ob6.M0(2131753657, null), true, true);
            this.z2.c(ob6.M0(2131753584, null), true, true);
        } else {
            if (c51Var != null) {
                c51Var.i(ob6.M0(2131747558, null), true, true);
            }
            this.B2.i(ob6.M0(2131747558, null), true, true);
            this.z2.c(ob6.M0(2131747558, null), true, true);
        }
    }

    public final void x1() {
        String M0;
        if (this.e2) {
            this.z2.c(ob6.M0(2131748884, null), false, false);
            return;
        }
        int i = this.c2;
        if (i != 19 && i != 32 && !k1()) {
            if (i != 18 && i != 20 && i != 24 && i != 25 && i != 26 && i != 29 && i != 22 && i != 23 && i != 21 && i != 27 && i != 28 && i != 30 && i != 35) {
                if (!yac.h(this.a).p() && !uc7.s1(this.a).M3() && !this.I2) {
                    this.z2.f.setText(ob6.M0(2131748953, null));
                    k46 k46Var = this.H2;
                    if (k46Var != null) {
                        int i2 = k46Var.e;
                        int i3 = i2 + 1;
                        int i4 = k46Var.f;
                        if (i3 == i4) {
                            this.z2.setIcon(2131623936);
                            return;
                        }
                        if (i2 != 0 && i4 != 0) {
                            float f = i4 / i2;
                            if (f >= 1.6f && f <= 2.5f) {
                                this.z2.setIcon(2131624002);
                                return;
                            }
                        }
                        a46 a46Var = this.z2;
                        a46Var.E.p = null;
                        a46Var.G.setVisibility(8);
                        return;
                    }
                    a46 a46Var2 = this.z2;
                    a46Var2.E.p = null;
                    a46Var2.G.setVisibility(8);
                    return;
                }
                this.z2.f.setText(ob6.M0(2131747558, null));
                a46 a46Var3 = this.z2;
                a46Var3.E.p = null;
                a46Var3.G.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new wm2(2131232109, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) ob6.M0(2131751727, null));
            this.z2.f.setText(spannableStringBuilder);
            return;
        }
        boolean k = on0.k();
        a46 a46Var4 = this.z2;
        int i5 = 2131753656;
        if (k) {
            mk8 mk8Var = a46Var4.f;
            wg1 wg1Var = this.X1;
            if (wg1Var != null && wg1Var.d) {
                M0 = ob6.M0(2131753584, null);
            } else {
                if (j1()) {
                    i5 = 2131753618;
                }
                M0 = ob6.M0(i5, null);
            }
            mk8Var.setText(M0);
            wg1 wg1Var2 = this.X1;
            if (wg1Var2 != null && wg1Var2.m) {
                this.z2.f.setText(ob6.M0(2131747558, null));
                return;
            }
            return;
        }
        mk8 mk8Var2 = a46Var4.f;
        if (j1()) {
            i5 = 2131753618;
        }
        mk8Var2.setText(ob6.M0(i5, null));
    }

    public final void y1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l46.y1():void");
    }
}
