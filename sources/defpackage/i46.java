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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public class i46 extends mz0 implements jm7 {
    public static final int R2 = 0;
    public final TextView A2;
    public b61 B2;
    public Runnable C2;
    public boolean D2;
    public w49 E2;
    public final d F2;
    public sb G2;
    public h46 H2;
    public boolean I2;
    public TLRPC.Chat J2;
    public final uj4 K2;
    public Runnable L2;
    public int M2;
    public final b61 N2;
    public int O2;
    public int P2;
    public String Q2;
    public int S1;
    public boolean T1;
    public int U1;
    public long V1;
    public TL_stories.TL_premium_boostsStatus W1;
    public vh1 X1;
    public g46 Y1;
    public boolean Z1;
    public boolean a2;
    public rc2 b2;
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
    public f46 s2;
    public final HashSet t2;
    public final ArrayList u2;
    public final ArrayList v2;
    public ArrayList w2;
    public ArrayList x2;
    public ArrayList y2;
    public x36 z2;

    public i46(int i, int i2, ylb ylbVar, Context context, d dVar) {
        super(context, dVar, false, g1(i), ylbVar);
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
        K(cmb.v0(cmb.g5, this.J0));
        this.O2 = this.H0;
        this.F2 = dVar;
        this.a = i2;
        this.c2 = i;
        W0();
        x1();
        if (i == 2) {
            this.D2 = true;
            x1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new r36(this, (byte) 0));
        } else if (i == 5) {
            this.D2 = true;
            x1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new r36(this, (byte) 2));
        }
        w1();
        if (i == 32 || h1()) {
            uj4 uj4Var = new uj4(getContext());
            this.K2 = uj4Var;
            this.c.addView(uj4Var, qoe.c(-1.0f, -1));
        }
        if (i == 18 || i == 20 || i == 24 || i == 25 || i == 26 || i == 29 || i == 22 || i == 23 || i == 21 || i == 27 || i == 28 || i == 30 || i == 35 || i == 31) {
            ((ViewGroup) this.z2.getParent()).removeView(this.z2);
            sb sbVar = this.G2;
            if (sbVar != null) {
                ((ViewGroup) sbVar.getParent()).removeView(this.G2);
            }
            this.n1.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.A2 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(gm.o());
            textView.setText(this.z2.getTextView().getText());
            anb.X(textView, cmb.Ii, ylbVar);
            textView.setOnClickListener(new q36(this, (byte) 0));
            int L = gm.L(8.0f);
            int i3 = cmb.Ei;
            int v0 = cmb.v0(i3, ylbVar);
            int i4 = cmb.c6;
            int p = on2.p(cmb.v0(i4, ylbVar), 120);
            fg0 i0 = cmb.i0(L, L, L, L, v0, p, p);
            wmb M = anb.M(i3);
            wmb g = anb.g(i4, 120);
            textView.setBackground(i0);
            anb.j(textView, i0, M, g, ylbVar);
        }
        if (i == 32) {
            ((ViewGroup) this.z2.getParent()).removeView(this.z2);
            b61 b61Var = new b61(ylbVar, context, true);
            this.N2 = b61Var;
            b61Var.k();
            b61Var.i(jb6.M0(2131753590, null), false, true);
            b61Var.setOnClickListener(new q36(this, (byte) 1));
            this.b.addView(b61Var, qoe.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.b.post(new s36(this, (byte) 3));
        }
        if (i != 19 && i != 18) {
            return;
        }
        this.b.post(new s36(this, (byte) 4));
    }

    public static h46 f1(int i, int i2) {
        ?? obj = new Object();
        obj.a = 0;
        obj.b = null;
        obj.c = null;
        obj.d = null;
        obj.e = 0;
        obj.f = 0;
        if (i == 0) {
            obj.e = oc7.r1(i2).l4.d1.f();
            obj.f = oc7.r1(i2).l4.e1.f();
            obj.a = 2131232207;
            obj.b = jb6.a0("LimitReachedPinDialogs", null, 2131748711, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = jb6.a0("LimitReachedPinDialogsPremium", null, 2131748709, Integer.valueOf(obj.f));
            obj.d = jb6.a0("LimitReachedPinDialogsLocked", null, 2131748710, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 33) {
            obj.e = oc7.r1(i2).l4.h2.f();
            obj.f = oc7.r1(i2).l4.i2.f();
            obj.a = 2131232207;
            obj.b = jb6.a0(null, null, 2131748708, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = jb6.a0(null, null, 2131748706, Integer.valueOf(obj.f));
            obj.d = jb6.a0(null, null, 2131748707, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 2) {
            obj.e = oc7.r1(i2).l4.h3.f();
            obj.f = oc7.r1(i2).l4.f1.f();
            obj.a = 2131232206;
            obj.b = jb6.a0("LimitReachedPublicLinks", null, 2131748704, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = jb6.a0("LimitReachedPublicLinksPremium", null, 2131748702, Integer.valueOf(obj.f));
            obj.d = jb6.a0("LimitReachedPublicLinksLocked", null, 2131748703, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 12) {
            obj.e = oc7.r1(i2).l4.u1.f();
            obj.f = oc7.r1(i2).l4.t3.f();
            obj.a = 2131232206;
            obj.b = jb6.a0("LimitReachedFolderLinks", null, 2131748717, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = jb6.a0("LimitReachedFolderLinksPremium", null, 2131748715, Integer.valueOf(obj.f));
            obj.d = jb6.a0("LimitReachedFolderLinksLocked", null, 2131748716, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 13) {
            obj.e = oc7.r1(i2).l4.D1.f();
            obj.f = oc7.r1(i2).l4.u3.f();
            obj.a = 2131232204;
            obj.b = jb6.a0("LimitReachedSharedFolders", null, 2131748700, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = jb6.a0("LimitReachedSharedFoldersPremium", null, 2131748698, Integer.valueOf(obj.f));
            obj.d = jb6.a0("LimitReachedSharedFoldersLocked", null, 2131748699, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 3) {
            obj.e = oc7.r1(i2).l4.Z0.f();
            obj.f = oc7.r1(i2).l4.a1.f();
            obj.a = 2131232204;
            obj.b = jb6.a0("LimitReachedFolders", null, 2131748714, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = jb6.a0("LimitReachedFoldersPremium", null, 2131748712, Integer.valueOf(obj.f));
            obj.d = jb6.a0("LimitReachedFoldersLocked", null, 2131748713, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 4) {
            obj.e = oc7.r1(i2).l4.b1.f();
            obj.f = oc7.r1(i2).l4.c1.f();
            obj.a = 2131232203;
            obj.b = jb6.a0("LimitReachedChatInFolders", null, 2131748732, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = jb6.a0("LimitReachedChatInFoldersPremium", null, 2131748730, Integer.valueOf(obj.f));
            obj.d = jb6.a0("LimitReachedChatInFoldersLocked", null, 2131748731, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 5) {
            obj.e = oc7.r1(i2).l4.l3.f();
            obj.f = oc7.r1(i2).l4.m3.f();
            obj.a = 2131232205;
            obj.b = jb6.a0("LimitReachedCommunities", null, 2131748729, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = jb6.a0("LimitReachedCommunitiesPremium", null, 2131748727, Integer.valueOf(obj.f));
            obj.d = jb6.a0("LimitReachedCommunitiesLocked", null, 2131748728, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 6) {
            obj.e = 100;
            obj.f = 200;
            obj.a = 2131232204;
            obj.b = jb6.a0("LimitReachedFileSize", null, 2131748720, "2 GB", "4 GB");
            obj.c = jb6.a0("LimitReachedFileSizePremium", null, 2131748718, "4 GB");
            obj.d = jb6.a0("LimitReachedFileSizeLocked", null, 2131748719, "2 GB");
            return obj;
        } else if (i == 7) {
            obj.e = 3;
            obj.f = 4;
            obj.a = 2131232202;
            obj.b = jb6.a0("LimitReachedAccounts", null, 2131748734, 3, Integer.valueOf(obj.f));
            obj.c = jb6.a0("LimitReachedAccountsPremium", null, 2131748733, Integer.valueOf(obj.f));
            obj.d = jb6.a0("LimitReachedAccountsPremium", null, 2131748733, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 11) {
            obj.e = 0;
            obj.f = 0;
            obj.a = 2131232206;
            obj.b = jb6.a0("LimitReachedAccounts", null, 2131748734, 0, Integer.valueOf(obj.f));
            obj.c = "";
            obj.d = "";
            return obj;
        } else if (i == 14) {
            obj.e = oc7.r1(i2).l4.v1.f();
            obj.f = oc7.r1(i2).l4.w1.f();
            obj.a = 2131232208;
            obj.b = jb6.H(',', "LimitReachedStoriesCount2First", obj.e) + "\n" + jb6.H(',', "LimitReachedStoriesCount2Second", obj.f);
            obj.c = jb6.H(',', "LimitReachedStoriesCount2Premium", obj.f);
            obj.d = jb6.H(',', "LimitReachedStoriesCount2Premium", obj.e);
            return obj;
        } else if (i == 15) {
            obj.e = oc7.r1(i2).l4.z1.f();
            obj.f = oc7.r1(i2).l4.A1.f();
            obj.a = 2131232208;
            obj.b = jb6.a0("LimitReachedStoriesWeekly", null, 2131748686, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = jb6.a0("LimitReachedStoriesWeeklyPremium", null, 2131748685, Integer.valueOf(obj.f));
            obj.d = jb6.a0("LimitReachedStoriesWeeklyPremium", null, 2131748685, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 16) {
            obj.e = oc7.r1(i2).l4.B1.f();
            obj.f = oc7.r1(i2).l4.C1.f();
            obj.a = 2131232208;
            obj.b = jb6.a0("LimitReachedStoriesMonthly", null, 2131748688, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = jb6.a0("LimitReachedStoriesMonthlyPremium", null, 2131748687, Integer.valueOf(obj.f));
            obj.d = jb6.a0("LimitReachedStoriesMonthlyPremium", null, 2131748687, Integer.valueOf(obj.e));
            return obj;
        } else if (i != 18 && i != 32 && i != 20 && i != 24 && i != 27 && i != 28 && i != 25 && i != 30 && i != 35 && i != 29 && i != 22 && i != 23 && i != 19 && i != 21 && i != 26) {
            return obj;
        } else {
            obj.e = oc7.r1(i2).l4.B1.f();
            obj.f = oc7.r1(i2).l4.C1.f();
            obj.a = 2131231130;
            obj.b = jb6.a0("LimitReachedStoriesMonthly", null, 2131748688, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = jb6.a0("LimitReachedStoriesMonthlyPremium", null, 2131748687, Integer.valueOf(obj.f));
            obj.d = jb6.a0("LimitReachedStoriesMonthlyPremium", null, 2131748687, Integer.valueOf(obj.e));
            return obj;
        }
    }

    public static boolean g1(int i) {
        if (i != 0 && i != 33 && i != 3 && i != 4 && i != 6 && i != 7 && i != 12 && i != 13 && i != 14 && i != 15 && i != 16) {
            return false;
        }
        return true;
    }

    public static String l1(int i) {
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

    public static void n1(d dVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, vh1 vh1Var, long j, boolean z) {
        if (tL_premium_boostsStatus != null && vh1Var != null && dVar.getContext() != null) {
            i46 i46Var = new i46(32, dVar.getCurrentAccount(), dVar.getResourceProvider(), dVar.getContext(), dVar);
            i46Var.r1(vh1Var);
            i46Var.q1(tL_premium_boostsStatus, true);
            i46Var.s1(j);
            if (z) {
                dVar.showDialog(i46Var);
            } else {
                i46Var.show();
            }
        }
    }

    @Override
    public final q59 G0(r59 r59Var) {
        return new a46(this);
    }

    @Override
    public final CharSequence J0() {
        int i = this.c2;
        if (i != 11) {
            if (i != 34) {
                if (i != 35) {
                    int i2 = 2131753590;
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
                            return jb6.M0(2131743561, null);
                        case 19:
                        case 30:
                            if (!i1()) {
                                i2 = 2131753628;
                            }
                            return jb6.M0(i2, null);
                        case 31:
                            return jb6.M0(2131753565, null);
                        case 32:
                            return jb6.M0(2131753590, null);
                        default:
                            return jb6.M0(2131748735, null);
                    }
                }
                return jb6.M0(2131743561, null);
            }
            return jb6.M0(2131752575, null);
        }
        return jb6.M0(2131752345, null);
    }

    @Override
    public final void P0(ela elaVar) {
        int i;
        Context context = elaVar.getContext();
        b61 b61Var = new b61(this.J0, context, true);
        this.B2 = b61Var;
        b61Var.setFlickeringLoading(true);
        this.B2.i(jb6.M0(2131753629, null), false, true);
        this.B2.setOnClickListener(new q36(this, (byte) 2));
        x36 x36Var = new x36(this, context, this.J0);
        this.z2 = x36Var;
        rve.b(x36Var, 0.02f, 1.2f);
        if (!this.s1 && (i = this.c2) != 18 && i != 20 && i != 24 && i != 25 && i != 26 && i != 29 && i != 22 && i != 23 && i != 21 && i != 27 && i != 28 && i != 30 && i != 35) {
            sb sbVar = new sb((byte) 20, context, this);
            this.G2 = sbVar;
            anb.h(cmb.g5, this.J0, sbVar);
            elaVar.addView(this.G2, qoe.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        x36 x36Var2 = this.z2;
        float f = (this.u0 / gm.p) + 16.0f;
        elaVar.addView(x36Var2, qoe.d(-1, 48.0f, 80, f, 0.0f, f, 12.0f));
        int L = gm.L(72.0f);
        r59 r59Var = this.n1;
        r59Var.setPadding(0, 0, 0, L);
        r59Var.setClipToPadding(false);
        r59Var.setClipChildren(false);
        r59Var.setOnItemClickListener(new kg4(this, (byte) 10));
        r59Var.setOnItemLongClickListener(new t36(this, (byte) 2));
        this.z2.w.setOnClickListener(new n06(this, context, (byte) 1));
        this.z2.h.setOnClickListener(new q36(this, (byte) 3));
        this.E2 = new w49(r59Var, true);
    }

    public final void Y0(final fa6 fa6Var, boolean z) {
        if (fa6Var.a() && !z) {
            return;
        }
        fa6Var.setLoading(true);
        oc7.r1(this.a).F0();
        long j = this.V1;
        int i = this.X1.g;
        oo0.a(-j, Arrays.asList(Integer.valueOf(i)), new qac(this) {
            public final i46 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r3;
                fa6 fa6Var2 = fa6Var;
                i46 i46Var = this.b;
                switch (b) {
                    case 0:
                        oc7.r1(i46Var.a).F0().a(i46Var.V1, new iu(i46Var, fa6Var2, (TL_stories.TL_premium_myBoosts) obj, (byte) 24));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                gm.d3(new k16(i46Var, fa6Var2, (byte) 3), intValue * 1000);
                                return;
                            }
                            yn0.g(intValue);
                        }
                        fa6Var2.setLoading(false);
                        return;
                }
            }
        }, new qac(this) {
            public final i46 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r3;
                fa6 fa6Var2 = fa6Var;
                i46 i46Var = this.b;
                switch (b) {
                    case 0:
                        oc7.r1(i46Var.a).F0().a(i46Var.V1, new iu(i46Var, fa6Var2, (TL_stories.TL_premium_myBoosts) obj, (byte) 24));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                gm.d3(new k16(i46Var, fa6Var2, (byte) 3), intValue * 1000);
                                return;
                            }
                            yn0.g(intValue);
                        }
                        fa6Var2.setLoading(false);
                        return;
                }
            }
        });
    }

    public final void Z0() {
        if (this.B2.isAttachedToWindow()) {
            Y0(this.B2, false);
            return;
        }
        b61 b61Var = this.N2;
        if (b61Var != null && b61Var.isAttachedToWindow()) {
            Y0(b61Var, false);
        } else {
            Y0(this.z2, false);
        }
    }

    public int a1() {
        return 0;
    }

    public final String b1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.W1.boost_url;
        }
        int i = this.a;
        long j = this.V1;
        oc7 r1 = oc7.r1(i);
        long j2 = -j;
        TLRPC.Chat L0 = r1.L0(Long.valueOf(j2));
        if (!TextUtils.isEmpty(sd2.K(L0, false))) {
            return "https://t.me/boost/" + sd2.K(L0, false);
        }
        return kt6.n(j2, "https://t.me/boost/?c=");
    }

    public final String c1(boolean z) {
        String str;
        boolean z2;
        int i;
        int i2;
        String str2;
        if (this.c2 == 32) {
            TLRPC.Chat e1 = e1();
            TLRPC.ChatFull M0 = oc7.r1(this.a).M0(-this.V1);
            int max = Math.max(M0.boosts_unrestrict - M0.boosts_applied, 0);
            if (e1 == null) {
                str2 = "";
            } else {
                str2 = e1.title;
            }
            return jb6.G(max, "BoostingRemoveRestrictionsSubtitle", str2);
        }
        TLRPC.Chat L0 = oc7.r1(this.a).L0(Long.valueOf(-this.V1));
        if (L0 == null) {
            if (i1()) {
                i2 = 2131754876;
            } else {
                i2 = 2131754904;
            }
            str = jb6.M0(i2, null);
        } else {
            str = L0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = 2131752296;
        if (j1() && this.W1.next_level_boosts != 0 && z) {
            if (i1()) {
                i3 = 2131749177;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.W1;
            int i4 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return jb6.a0(null, null, i3, str, jb6.G(i4, "MoreBoosts", Integer.valueOf(i4)));
        }
        int i5 = 2131752395;
        if (z2 && this.X1.d) {
            if (this.W1.level == 1) {
                if (i1()) {
                    i = 2131749250;
                } else {
                    i = 2131752396;
                }
                return jb6.a0(null, null, i, new Object[0]);
            }
            if (i1()) {
                i5 = 2131749249;
            }
            return jb6.a0(null, null, i5, Integer.valueOf(this.W1.level), jb6.G(this.W1.level, "BoostStories", new Object[0]));
        }
        boolean z3 = this.X1.d;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.W1;
        if (z3) {
            if (tL_premium_boostsStatus3.level == 0) {
                if (i1()) {
                    i3 = 2131749177;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.W1;
                int i6 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return jb6.a0(null, null, i3, str, jb6.G(i6, "MoreBoosts", Integer.valueOf(i6)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (i1()) {
                    i5 = 2131749249;
                }
                return jb6.a0(null, null, i5, Integer.valueOf(this.W1.level), jb6.G(this.W1.level + 1, "BoostStories", new Object[0]));
            } else {
                if (i1()) {
                    i3 = 2131749177;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.W1;
                int i7 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return jb6.a0(null, null, i3, str, jb6.G(i7, "MoreBoosts", Integer.valueOf(i7)));
            }
        } else if (tL_premium_boostsStatus3.level == 0) {
            if (i1()) {
                i3 = 2131749177;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.W1;
            int i8 = tL_premium_boostsStatus6.next_level_boosts - tL_premium_boostsStatus6.boosts;
            return jb6.a0(null, null, i3, str, jb6.G(i8, "MoreBoosts", Integer.valueOf(i8)));
        } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
            if (i1()) {
                i5 = 2131749249;
            }
            return jb6.a0(null, null, i5, Integer.valueOf(this.W1.level), jb6.G(this.W1.level + 1, "BoostStories", new Object[0]));
        } else {
            if (i1()) {
                i3 = 2131749177;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.W1;
            int i9 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return jb6.a0(null, null, i3, str, jb6.G(i9, "MoreBoosts", Integer.valueOf(i9)));
        }
    }

    public final String d1() {
        int i;
        int i2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return jb6.a0("BoostsMaxLevelReached", null, 2131753123, new Object[0]);
        }
        int i3 = 2131753628;
        if (tL_premium_boostsStatus.level > 0 && !this.X1.d) {
            if (i1()) {
                i3 = 2131753590;
            }
            return jb6.M0(i3, null);
        }
        boolean z = this.Z1;
        int i4 = this.c2;
        if (z) {
            if (i4 == 32) {
                if (i1()) {
                    i3 = 2131753590;
                }
                return jb6.M0(i3, null);
            }
            TLRPC.Chat L0 = oc7.r1(this.a).L0(Long.valueOf(-this.V1));
            if (this.X1.d) {
                return jb6.a0("YouBoostedChannel2", null, 2131742503, L0.title);
            }
            if (i1()) {
                i3 = 2131753590;
            }
            return jb6.M0(i3, null);
        } else if (i4 == 32) {
            if (i1()) {
                i3 = 2131753590;
            }
            return jb6.M0(i3, null);
        } else if (this.X1.d) {
            if (i1()) {
                i2 = 2131742502;
            } else {
                i2 = 2131742504;
            }
            return jb6.M0(i2, null);
        } else {
            if (i1()) {
                i = 2131753492;
            } else {
                i = 2131753493;
            }
            return jb6.M0(i, null);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        TLRPC.ChatFull M0;
        d dVar;
        d dVar2;
        if (i == nm7.X2) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            d dVar3 = this.r1;
            d lastFragment = dVar3.getParentLayout().getLastFragment();
            d dVar4 = null;
            if (lastFragment instanceof n92) {
                List fragmentStack = dVar3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    dVar = (d) aq1.m(2, fragmentStack);
                } else {
                    dVar = null;
                }
                if (fragmentStack.size() >= 3) {
                    dVar2 = (d) aq1.m(3, fragmentStack);
                } else {
                    dVar2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    dVar4 = (d) aq1.m(4, fragmentStack);
                }
                if (dVar instanceof ba2) {
                    ((ActionBarLayout) dVar3.getParentLayout()).c0(dVar, false);
                }
                dismiss();
                if (booleanValue) {
                    if (dVar2 instanceof ProfileActivity) {
                        ((ActionBarLayout) dVar3.getParentLayout()).c0(dVar2, false);
                    }
                    lastFragment.finishFragment();
                    yn0.f(dVar4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                yn0.f(dVar2, chat, false);
            } else if ((lastFragment instanceof yv1) && booleanValue) {
                yn0.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof vi1) && booleanValue) {
                List fragmentStack2 = dVar3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    d dVar5 = (d) fragmentStack2.get(size);
                    if (!(dVar5 instanceof yv1) && !(dVar5 instanceof nk3)) {
                        arrayList.add(dVar5);
                    } else {
                        dVar4 = dVar5;
                        break;
                    }
                }
                if (dVar4 != null) {
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((ActionBarLayout) dVar3.getParentLayout()).c0((d) obj, false);
                    }
                    dVar3.finishFragment();
                    dismiss();
                    yn0.f(dVar4, chat, true);
                }
            } else {
                v9b v9bVar = v9b.G2;
                if (booleanValue) {
                    if (v9bVar != null && v9bVar.d) {
                        yv1 ga = yv1.ga(-chat.id);
                        LaunchActivity.Q().presentFragment(ga, false, false);
                        v9b.v();
                        dismiss();
                        yn0.f(ga, chat, true);
                        return;
                    }
                    List fragmentStack3 = dVar3.getParentLayout().getFragmentStack();
                    if (fragmentStack3.size() >= 2) {
                        dVar4 = (d) aq1.m(2, fragmentStack3);
                    }
                    dVar3.finishFragment();
                    dismiss();
                    if (dVar4 instanceof yv1) {
                        yn0.f(dVar4, chat, true);
                    }
                } else if (v9bVar != null && v9bVar.d) {
                    yv1 ga2 = yv1.ga(-chat.id);
                    LaunchActivity.Q().presentFragment(ga2, false, false);
                    v9b.v();
                    dismiss();
                    yn0.f(ga2, chat, false);
                } else {
                    dismiss();
                    yn0.f(LaunchActivity.Q(), chat, false);
                }
            }
        } else if (i == nm7.W2) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus != null && this.X1 != null) {
                this.W1.boosts += intValue;
                if (this.c2 == 32 && (M0 = oc7.r1(this.a).M0(-this.V1)) != null) {
                    M0.boosts_applied += intValue;
                }
                k1();
                q1(tL_premium_boostsStatus, this.Z1);
                vh1 vh1Var = this.X1;
                if (this.W1.next_level_boosts <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                vh1Var.m = z;
                vh1Var.l = true;
                vh1Var.a(tL_premium_myBoosts);
                if (m1()) {
                    u31 Q = new c41(this.c, this.J0).Q(2131624051, 30, jb6.G(intValue, "BoostingReassignedFromPlural", jb6.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                    Q.j = 4000;
                    Q.k(true);
                }
            }
        } else if (i == nm7.V2) {
            dismiss();
        }
    }

    public final TLRPC.Chat e1() {
        return oc7.r1(this.a).L0(Long.valueOf(-this.V1));
    }

    public final boolean h1() {
        int i = this.c2;
        if (i != 19 && i != 18 && i != 20 && i != 24 && i != 25 && i != 26 && i != 29 && i != 22 && i != 27 && i != 28 && i != 23 && i != 30 && i != 35) {
            return false;
        }
        return true;
    }

    public final boolean i1() {
        return !sd2.V(oc7.r1(this.a).L0(Long.valueOf(-this.V1)));
    }

    public final boolean j1() {
        if (h1() && sd2.N(e1())) {
            return true;
        }
        return false;
    }

    public final void k1() {
        int i;
        f46 f46Var = this.s2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        int i2 = tL_premium_boostsStatus.boosts;
        int i3 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        f46Var.b++;
        f46Var.a = pqe.a((i2 - i) / i3, 0.0f, 1.0f);
        f46Var.a0 = true;
        f46Var.b0 = f46Var.n;
        f46Var.j(i2, true);
        f46Var.J.requestLayout();
        f46Var.requestLayout();
    }

    public final boolean m1() {
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
        nm7 f6 = nm7.f(this.a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        vh1 vh1Var = this.X1;
        vh1Var.getClass();
        vh1 vh1Var2 = new vh1();
        vh1Var2.a = vh1Var.a;
        vh1Var2.b = vh1Var.b;
        vh1Var2.c = vh1Var.c;
        vh1Var2.d = vh1Var.d;
        vh1Var2.e = vh1Var.e;
        vh1Var2.g = vh1Var.g;
        vh1Var2.h = vh1Var.h;
        vh1Var2.i = vh1Var.i;
        vh1Var2.j = vh1Var.j;
        vh1Var2.k = vh1Var.k;
        vh1Var2.m = vh1Var.m;
        f6.m(nm7.r3, tL_premium_boostsStatus, vh1Var2, Long.valueOf(this.V1));
        b61 b61Var = this.N2;
        if (b61Var != null) {
            TLRPC.ChatFull M0 = oc7.r1(this.a).M0(-this.V1);
            int max = Math.max(M0.boosts_unrestrict - M0.boosts_applied, 0);
            if (max == 0) {
                nm7.f(this.a).m(nm7.q3, new Object[0]);
                dismiss();
                return false;
            }
            b61Var.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new h7((byte) 2));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.Y1, transitionSet);
        g46 g46Var = this.Y1;
        mn0 mn0Var = g46Var.c;
        int indexOfChild = g46Var.indexOfChild(g46Var.b);
        i46 i46Var = g46Var.e;
        if (i46Var.Z1) {
            int indexOfChild2 = g46Var.indexOfChild(g46Var.d);
            g46Var.removeView(g46Var.d);
            g46Var.d.removeView(g46Var.a);
            g46Var.d.removeView(mn0Var);
            LinearLayout linearLayout = new LinearLayout(g46Var.getContext());
            g46Var.d = linearLayout;
            linearLayout.setOrientation(0);
            g46Var.d.setWeightSum(1.0f);
            g46Var.d.addView(g46Var.a, qoe.p(-2, -2, 1.0f, 0));
            g46Var.d.addView(mn0Var, qoe.t(-2, -2, 48, 0, 2, 0, 0));
            g46Var.addView(g46Var.d, indexOfChild2, qoe.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = g46Var.indexOfChild(g46Var.a);
            g46Var.removeView(g46Var.a);
            TextView textView = new TextView(g46Var.getContext());
            g46Var.a = textView;
            textView.setTypeface(gm.o());
            g46Var.a.setTextSize(1, 20.0f);
            anb.X(g46Var.a, cmb.F6, i46Var.J0);
            g46Var.a.setGravity(17);
            g46Var.addView(g46Var.a, indexOfChild3, qoe.t(-2, -2, 1, 0, 22, 0, 0));
        }
        g46Var.removeView(g46Var.b);
        TextView textView2 = new TextView(g46Var.getContext());
        g46Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = g46Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), g46Var.b.getLineSpacingMultiplier() * 1.1f);
        g46Var.b.setGravity(1);
        anb.X(g46Var.b, cmb.F6, i46Var.J0);
        g46Var.addView(g46Var.b, indexOfChild, qoe.t(-2, -2, 1, 24, -2, 24, 17));
        this.Y1.a.setText(d1());
        TextView textView4 = this.Y1.b;
        gs gsVar = oc7.r1(this.a).l4;
        boolean i1 = i1();
        int i9 = this.c2;
        String str = null;
        if (i9 == 20) {
            if (i1) {
                i8 = 2131749175;
            } else {
                i8 = 2131752293;
            }
            str = jb6.a0(null, null, i8, Integer.valueOf(a1()));
        } else if (i9 == 24) {
            if (i1) {
                i7 = 2131749171;
            } else {
                i7 = 2131752290;
            }
            str = jb6.a0(null, null, i7, Integer.valueOf(a1()));
        } else if (i9 == 29) {
            str = jb6.a0(null, null, 2131749174, Integer.valueOf(gsVar.d2.f()));
        } else if (i9 == 30) {
            str = jb6.a0(null, null, 2131752287, Integer.valueOf(gsVar.T1.f()));
        } else if (i9 == 35) {
            str = jb6.a0(null, null, 2131752294, Integer.valueOf(gsVar.U1.f()));
        } else if (i9 == 25) {
            if (i1) {
                f5 = gsVar.c2.f();
                i6 = 2131749172;
            } else {
                f5 = gsVar.X1.f();
                i6 = 2131752291;
            }
            str = jb6.a0(null, null, i6, Integer.valueOf(f5));
        } else if (i9 == 26) {
            if (i1) {
                f4 = gsVar.c2.f();
                i5 = 2131749167;
            } else {
                f4 = gsVar.X1.f();
                i5 = 2131752285;
            }
            str = jb6.a0(null, null, i5, Integer.valueOf(f4));
        } else if (i9 == 27) {
            if (i1) {
                i4 = 2131749169;
            } else {
                i4 = 2131752288;
            }
            str = jb6.a0(null, null, i4, Integer.valueOf(gsVar.V1.f()));
        } else if (i9 == 28) {
            if (i1) {
                f3 = gsVar.e2.f();
                i3 = 2131749170;
            } else {
                f3 = gsVar.W1.f();
                i3 = 2131752289;
            }
            str = jb6.a0(null, null, i3, Integer.valueOf(f3));
        } else if (i9 == 22) {
            if (i1) {
                f2 = gsVar.b2.f();
                i2 = 2131749168;
            } else {
                f2 = gsVar.f2.f();
                i2 = 2131752286;
            }
            str = jb6.a0(null, null, i2, Integer.valueOf(f2));
        } else if (i9 == 23) {
            if (i1) {
                f = gsVar.Y1.f();
                i = 2131749173;
            } else {
                f = gsVar.g2.f();
                i = 2131752292;
            }
            str = jb6.a0(null, null, i, Integer.valueOf(f));
        }
        if (str == null) {
            str = c1(false);
        }
        textView4.setText(gm.S2(str));
        v1();
        uj4 uj4Var = this.K2;
        uj4Var.c(false);
        try {
            uj4Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.Y1.c.a(this.X1.i, true);
        this.n1.z0(0);
        if (i9 == 32) {
            this.Y1.c.setVisibility(8);
        }
        return true;
    }

    public final void o1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
        String G = jb6.G(arrayList.size(), "RevokeLinks", new Object[0]);
        he heVar = alertDialog$Builder.a;
        heVar.S = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            boolean z = this.q2;
            int i = this.a;
            if (z) {
                heVar.U = gm.S2(jb6.a0("RevokeLinkAlertChannel", null, 2131745754, oc7.r1(i).N2 + "/" + sd2.K(chat, false), chat.title));
            } else {
                heVar.U = gm.S2(jb6.a0("RevokeLinkAlert", null, 2131745755, oc7.r1(i).N2 + "/" + sd2.K(chat, false), chat.title));
            }
        } else if (this.q2) {
            heVar.U = gm.S2(jb6.a0("RevokeLinksAlertChannel", null, 2131745751, new Object[0]));
        } else {
            heVar.U = gm.S2(jb6.a0("RevokeLinksAlert", null, 2131745752, new Object[0]));
        }
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131745757, null), new nv4(this, arrayList, (byte) 13));
        heVar.show();
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, this.J0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.a).b(this, nm7.X2);
        nm7.f(this.a).b(this, nm7.W2);
        nm7.f(this.a).b(this, nm7.V2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.a).n(this, nm7.X2);
        nm7.f(this.a).n(this, nm7.W2);
        nm7.f(this.a).n(this, nm7.V2);
    }

    @Override
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.G0 < 0 && this.H0 == this.O2 && (v0 = cmb.v0(cmb.g5, this.J0)) != this.H0) {
                this.H0 = v0;
                this.O2 = v0;
                x0(v0);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void p1(HashMap hashMap) {
        String str;
        long longValue;
        ArrayList arrayList;
        HashMap hashMap2 = hashMap;
        if (!TextUtils.isEmpty(this.Q2)) {
            str = this.Q2;
        } else {
            TLRPC.ChatFull M0 = oc7.r1(this.a).M0(this.J2.id);
            if (M0 == null) {
                dismiss();
                return;
            } else if (this.J2.username != null) {
                str = "@" + this.J2.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = M0.exported_invite;
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
            long L1 = oc7.r1(this.a).L1(user.id);
            if (L1 <= 0) {
                L1 = pg3.j(oc7.r1(this.a).L2(user.id));
            }
            if (L1 >= 0) {
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
            ik.Z(this.a, arrayList4, 1, new sk3(this, (byte) 21));
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
            y5a b = y5a.b(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b.Q = longValue;
            a6a.B(this.a).q0(b);
            if (b.Q > 0) {
                z2 = z3;
            }
            hashMap2 = hashMap;
            z = z3;
            it2 = it3;
        }
        if (!z2) {
            gm.c3(new s36(this, (byte) 2));
        }
        dismiss();
    }

    public final void q1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z) {
        this.W1 = tL_premium_boostsStatus;
        this.Z1 = z;
        x1();
    }

    public final void r1(vh1 vh1Var) {
        this.X1 = vh1Var;
        v1();
        w1();
    }

    public final void s1(long j) {
        this.V1 = j;
        x1();
    }

    public final void t1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        boolean z;
        this.J2 = chat;
        this.Q2 = str;
        if (TextUtils.isEmpty(str) && !sd2.y(3, chat)) {
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
        x1();
        v1();
        int i2 = this.c2;
        if ((i2 == 11 || i2 == 34) && !oc7.r1(this.a).H3()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.w2.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    x36 x36Var = this.z2;
                    if (x36Var != null && x36Var.getParent() != null) {
                        ((ViewGroup) this.z2.getParent()).removeView(this.z2);
                    }
                    sb sbVar = this.G2;
                    if (sbVar != null && sbVar.getParent() != null) {
                        ((ViewGroup) this.G2.getParent()).removeView(this.G2);
                    }
                    r59 r59Var = this.n1;
                    if (r59Var != null) {
                        r59Var.setPadding(0, 0, 0, 0);
                    }
                }
            }
        }
    }

    public final void u1() {
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
        oc7 r1 = oc7.r1(this.a);
        gs gsVar = r1.l4;
        fc7 fc7Var = r1.E3;
        if (fc7Var != null) {
            i2 = fc7Var.e(i1());
        } else {
            i2 = 0;
        }
        int max2 = Math.max(10, i2);
        fc7 fc7Var2 = r1.F3;
        if (fc7Var2 != null) {
            i3 = fc7Var2.e(i1());
        } else {
            i3 = 0;
        }
        int max3 = Math.max(max2, i3);
        if (i1()) {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(max3, gsVar.Z1.f()), gsVar.b2.f()), gsVar.Y1.f()), gsVar.c2.f()), gsVar.e2.f());
        } else {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max3, gsVar.V1.f()), gsVar.W1.f()), gsVar.X1.f()), gsVar.f2.f()), gsVar.g2.f()), gsVar.T1.f()), gsVar.U1.f());
        }
        ArrayList arrayList = null;
        while (i <= max) {
            boolean i1 = i1();
            ArrayList arrayList2 = new ArrayList();
            oc7 r12 = oc7.r1(this.a);
            gs gsVar2 = r12.l4;
            if (!i1 && i >= gsVar2.U1.f()) {
                arrayList2.add(c46.a(2131231824, 2131753625));
            }
            c46 b = c46.b(2131231821, i, "BoostFeatureStoriesPerDay");
            b.f = true;
            arrayList2.add(b);
            if (!i1) {
                c46 b2 = c46.b(2131231816, i, "BoostFeatureCustomReaction");
                b2.f = true;
                arrayList2.add(b2);
            }
            fc7 fc7Var3 = r12.E3;
            if (fc7Var3 != null) {
                i4 = fc7Var3.a(i, false);
            } else {
                i4 = 0;
            }
            fc7 fc7Var4 = r12.F3;
            if (fc7Var4 != null) {
                i5 = fc7Var4.a(i, i1);
            } else {
                i5 = 0;
            }
            if (!i1 && i4 > 0) {
                arrayList2.add(c46.b(2131231802, 7, "BoostFeatureNameColor"));
            }
            if (!i1 && i4 > 0) {
                arrayList2.add(c46.b(2131231810, i4, "BoostFeatureReplyColor"));
            }
            if (!i1 && i >= gsVar2.V1.f()) {
                arrayList2.add(c46.a(2131231811, 2131753598));
            }
            if (i5 > 0) {
                if (i1) {
                    str2 = "BoostFeatureProfileColorGroup";
                } else {
                    str2 = "BoostFeatureProfileColor";
                }
                arrayList2.add(c46.b(2131231803, i5, str2));
            }
            if (i1 && i >= gsVar2.d2.f()) {
                arrayList2.add(c46.a(2131231813, 2131753616));
            }
            if (i1 ? i >= gsVar2.e2.f() : i >= gsVar2.W1.f()) {
                if (i1) {
                    i7 = 2131753602;
                } else {
                    i7 = 2131753603;
                }
                arrayList2.add(c46.a(2131231804, i7));
            }
            if (i1 && i >= gsVar2.Z1.f()) {
                arrayList2.add(c46.a(2131231827, 2131753593));
            }
            if (i1 ? i >= gsVar2.c2.f() : i >= gsVar2.X1.f()) {
                arrayList2.add(new c46(2131231820, 2131753612, -1, "1000+", null));
            }
            if (i1 ? i >= gsVar2.b2.f() : i >= gsVar2.f2.f()) {
                if (i1) {
                    str = "BoostFeatureBackgroundGroup";
                } else {
                    str = "BoostFeatureBackground";
                }
                arrayList2.add(c46.b(2131231828, 8, str));
            }
            if (i1 ? i >= gsVar2.Y1.f() : i >= gsVar2.g2.f()) {
                if (i1) {
                    i6 = 2131753617;
                } else {
                    i6 = 2131753618;
                }
                arrayList2.add(c46.a(2131231806, i6));
            }
            if (!i1 && i >= gsVar2.T1.f()) {
                arrayList2.add(c46.a(2131231812, 2131753594));
            }
            Collections.reverse(arrayList2);
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    c46 c46Var = (c46) arrayList.get(i8);
                    c46 c46Var2 = (c46) arrayList2.get(i8);
                    int i9 = c46Var.e;
                    if (c46Var2 != null && ((c46Var.f && i9 > 2) || (c46Var.a == c46Var2.a && c46Var.b == c46Var2.b && TextUtils.equals(c46Var.c, c46Var2.c) && TextUtils.equals(c46Var.d, c46Var2.d) && i9 == c46Var2.e))) {
                    }
                }
                i++;
            }
            ArrayList arrayList3 = this.p2;
            arrayList3.add(new b46(i, arrayList3.isEmpty()));
            this.p2.addAll(arrayList2);
            arrayList = arrayList2;
            i++;
        }
    }

    public final void v1() {
        int i;
        String str = null;
        if (this.e2) {
            this.z2.c(jb6.M0(2131748887, null), false, false);
            return;
        }
        int i2 = this.c2;
        if (i2 != 19 && i2 != 32 && !j1()) {
            HashSet hashSet = this.t2;
            if (i2 != 11 && i2 != 34) {
                if (hashSet.size() > 0) {
                    if (i2 == 2) {
                        str = jb6.G(hashSet.size(), "RevokeLinks", new Object[0]);
                    } else if (i2 == 5) {
                        str = jb6.G(hashSet.size(), "LeaveCommunities", new Object[0]);
                    }
                    this.z2.c(str, true, true);
                    return;
                }
                x36 x36Var = this.z2;
                x36Var.r = false;
                x36Var.d(true);
                return;
            }
            x36 x36Var2 = this.z2;
            if (x36Var2.J == null) {
                uy2 uy2Var = new uy2(x36Var2.getContext(), null);
                x36Var2.J = uy2Var;
                uy2Var.setGravity(3);
                uy2 uy2Var2 = x36Var2.J;
                int i3 = cmb.Ei;
                int i4 = cmb.Ii;
                ty2 ty2Var = uy2Var2.a;
                ty2Var.v = i3;
                ty2Var.w = i4;
                ty2Var.b = 0.8f;
                x36Var2.setClipChildren(false);
                x36Var2.addView(x36Var2.J, qoe.e(-1, 24, 16));
            }
            if (!this.T1) {
                this.z2.c(jb6.M0(2131751978, null), true, true);
            } else {
                int size = hashSet.size();
                x36 x36Var3 = this.z2;
                if (size > 0) {
                    x36Var3.c(jb6.M0(2131745353, null), true, true);
                } else {
                    x36Var3.c(jb6.M0(2131754554, null), true, true);
                }
            }
            this.z2.J.a.c(hashSet.size(), true);
            this.z2.invalidate();
            return;
        }
        vh1 vh1Var = this.X1;
        boolean z = vh1Var.a;
        if ((z || vh1Var.b) && !vh1Var.l && !vh1Var.d) {
            boolean z2 = vh1Var.m;
            x36 x36Var4 = this.z2;
            if (z2) {
                x36Var4.c(jb6.M0(2131747564, null), true, true);
                return;
            }
            x36Var4.r = false;
            x36Var4.d(true);
            return;
        }
        b61 b61Var = this.N2;
        if (z) {
            boolean k = oo0.k();
            x36 x36Var5 = this.z2;
            if (k) {
                x36Var5.c(jb6.M0(2131753556, null), true, true);
            } else {
                if (i1()) {
                    i = 2131753590;
                } else {
                    i = 2131753628;
                }
                x36Var5.c(jb6.M0(i, null), true, true);
            }
            this.B2.i(jb6.M0(2131753629, null), true, true);
            if (b61Var != null) {
                b61Var.i(jb6.M0(2131753590, null), true, true);
            }
        } else if (vh1Var.m) {
            this.B2.i(jb6.M0(2131747564, null), true, true);
            if (b61Var != null) {
                b61Var.i(jb6.M0(2131747564, null), true, true);
            }
            this.z2.c(jb6.M0(2131747564, null), true, true);
        } else if (oo0.k()) {
            if (b61Var != null) {
                b61Var.i(jb6.M0(2131753590, null), true, true);
            }
            this.B2.i(jb6.M0(2131753629, null), true, true);
            this.z2.c(jb6.M0(2131753556, null), true, true);
        } else {
            if (b61Var != null) {
                b61Var.i(jb6.M0(2131747564, null), true, true);
            }
            this.B2.i(jb6.M0(2131747564, null), true, true);
            this.z2.c(jb6.M0(2131747564, null), true, true);
        }
    }

    public final void w1() {
        String M0;
        if (this.e2) {
            this.z2.c(jb6.M0(2131748887, null), false, false);
            return;
        }
        int i = this.c2;
        if (i != 19 && i != 32 && !j1()) {
            if (i != 18 && i != 20 && i != 24 && i != 25 && i != 26 && i != 29 && i != 22 && i != 23 && i != 21 && i != 27 && i != 28 && i != 30 && i != 35) {
                if (!z8c.h(this.a).p() && !oc7.r1(this.a).H3() && !this.I2) {
                    this.z2.f.setText(jb6.M0(2131748956, null));
                    h46 h46Var = this.H2;
                    if (h46Var != null) {
                        int i2 = h46Var.e;
                        int i3 = i2 + 1;
                        int i4 = h46Var.f;
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
                        x36 x36Var = this.z2;
                        x36Var.E.p = null;
                        x36Var.G.setVisibility(8);
                        return;
                    }
                    x36 x36Var2 = this.z2;
                    x36Var2.E.p = null;
                    x36Var2.G.setVisibility(8);
                    return;
                }
                this.z2.f.setText(jb6.M0(2131747564, null));
                x36 x36Var3 = this.z2;
                x36Var3.E.p = null;
                x36Var3.G.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new pn2(2131232110, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) jb6.M0(2131751699, null));
            this.z2.f.setText(spannableStringBuilder);
            return;
        }
        boolean k = oo0.k();
        x36 x36Var4 = this.z2;
        int i5 = 2131753628;
        if (k) {
            aj8 aj8Var = x36Var4.f;
            vh1 vh1Var = this.X1;
            if (vh1Var != null && vh1Var.d) {
                M0 = jb6.M0(2131753556, null);
            } else {
                if (i1()) {
                    i5 = 2131753590;
                }
                M0 = jb6.M0(i5, null);
            }
            aj8Var.setText(M0);
            vh1 vh1Var2 = this.X1;
            if (vh1Var2 != null && vh1Var2.m) {
                this.z2.f.setText(jb6.M0(2131747564, null));
                return;
            }
            return;
        }
        aj8 aj8Var2 = x36Var4.f;
        if (i1()) {
            i5 = 2131753590;
        }
        aj8Var2.setText(jb6.M0(i5, null));
    }

    public final void x1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i46.x1():void");
    }
}
