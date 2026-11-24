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
public class h26 extends fy0 implements gk7 {
    public static final int R2 = 0;
    public final TextView A2;
    public u41 B2;
    public Runnable C2;
    public boolean D2;
    public t29 E2;
    public final d F2;
    public sb G2;
    public g26 H2;
    public boolean I2;
    public TLRPC.Chat J2;
    public final qh4 K2;
    public Runnable L2;
    public int M2;
    public final u41 N2;
    public int O2;
    public int P2;
    public String Q2;
    public int S1;
    public boolean T1;
    public int U1;
    public long V1;
    public TL_stories.TL_premium_boostsStatus W1;
    public ng1 X1;
    public f26 Y1;
    public boolean Z1;
    public boolean a2;
    public gb2 b2;
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
    public e26 s2;
    public final HashSet t2;
    public final ArrayList u2;
    public final ArrayList v2;
    public ArrayList w2;
    public ArrayList x2;
    public ArrayList y2;
    public w16 z2;

    public h26(int i, int i2, wjb wjbVar, Context context, d dVar) {
        super(context, dVar, false, g1(i), wjbVar);
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
        L(bkb.v0(bkb.g5, this.J0));
        this.O2 = this.H0;
        this.F2 = dVar;
        this.a = i2;
        this.c2 = i;
        W0();
        x1();
        if (i == 2) {
            this.D2 = true;
            x1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new r16(this, (byte) 0));
        } else if (i == 5) {
            this.D2 = true;
            x1();
            ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new r16(this, (byte) 2));
        }
        w1();
        if (i == 32 || h1()) {
            qh4 qh4Var = new qh4(getContext());
            this.K2 = qh4Var;
            this.c.addView(qh4Var, nme.c(-1.0f, -1));
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
            textView.setTypeface(gl.o());
            textView.setText(this.z2.getTextView().getText());
            zkb.X(textView, bkb.Ii, wjbVar);
            textView.setOnClickListener(new q16(this, (byte) 0));
            int L = gl.L(8.0f);
            int i3 = bkb.Ei;
            int v0 = bkb.v0(i3, wjbVar);
            int i4 = bkb.c6;
            int o = bm2.o(bkb.v0(i4, wjbVar), 120);
            ff0 i0 = bkb.i0(L, L, L, L, v0, o, o);
            vkb M = zkb.M(i3);
            vkb g = zkb.g(i4, 120);
            textView.setBackground(i0);
            zkb.j(textView, i0, M, g, wjbVar);
        }
        if (i == 32) {
            ((ViewGroup) this.z2.getParent()).removeView(this.z2);
            u41 u41Var = new u41(wjbVar, context, true);
            this.N2 = u41Var;
            u41Var.k();
            u41Var.i(k96.M0(2131753622, null), false, true);
            u41Var.setOnClickListener(new q16(this, (byte) 1));
            this.b.addView(u41Var, nme.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.b.post(new s16(this, (byte) 3));
        }
        if (i != 19 && i != 18) {
            return;
        }
        this.b.post(new s16(this, (byte) 4));
    }

    public static g26 f1(int i, int i2) {
        ?? obj = new Object();
        obj.a = 0;
        obj.b = null;
        obj.c = null;
        obj.d = null;
        obj.e = 0;
        obj.f = 0;
        if (i == 0) {
            obj.e = na7.q1(i2).k4.d1.f();
            obj.f = na7.q1(i2).k4.e1.f();
            obj.a = 2131232206;
            obj.b = k96.a0("LimitReachedPinDialogs", null, 2131748762, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = k96.a0("LimitReachedPinDialogsPremium", null, 2131748760, Integer.valueOf(obj.f));
            obj.d = k96.a0("LimitReachedPinDialogsLocked", null, 2131748761, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 33) {
            obj.e = na7.q1(i2).k4.h2.f();
            obj.f = na7.q1(i2).k4.i2.f();
            obj.a = 2131232206;
            obj.b = k96.a0(null, null, 2131748759, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = k96.a0(null, null, 2131748757, Integer.valueOf(obj.f));
            obj.d = k96.a0(null, null, 2131748758, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 2) {
            obj.e = na7.q1(i2).k4.h3.f();
            obj.f = na7.q1(i2).k4.f1.f();
            obj.a = 2131232205;
            obj.b = k96.a0("LimitReachedPublicLinks", null, 2131748755, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = k96.a0("LimitReachedPublicLinksPremium", null, 2131748753, Integer.valueOf(obj.f));
            obj.d = k96.a0("LimitReachedPublicLinksLocked", null, 2131748754, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 12) {
            obj.e = na7.q1(i2).k4.u1.f();
            obj.f = na7.q1(i2).k4.t3.f();
            obj.a = 2131232205;
            obj.b = k96.a0("LimitReachedFolderLinks", null, 2131748768, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = k96.a0("LimitReachedFolderLinksPremium", null, 2131748766, Integer.valueOf(obj.f));
            obj.d = k96.a0("LimitReachedFolderLinksLocked", null, 2131748767, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 13) {
            obj.e = na7.q1(i2).k4.D1.f();
            obj.f = na7.q1(i2).k4.u3.f();
            obj.a = 2131232203;
            obj.b = k96.a0("LimitReachedSharedFolders", null, 2131748751, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = k96.a0("LimitReachedSharedFoldersPremium", null, 2131748749, Integer.valueOf(obj.f));
            obj.d = k96.a0("LimitReachedSharedFoldersLocked", null, 2131748750, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 3) {
            obj.e = na7.q1(i2).k4.Z0.f();
            obj.f = na7.q1(i2).k4.a1.f();
            obj.a = 2131232203;
            obj.b = k96.a0("LimitReachedFolders", null, 2131748765, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = k96.a0("LimitReachedFoldersPremium", null, 2131748763, Integer.valueOf(obj.f));
            obj.d = k96.a0("LimitReachedFoldersLocked", null, 2131748764, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 4) {
            obj.e = na7.q1(i2).k4.b1.f();
            obj.f = na7.q1(i2).k4.c1.f();
            obj.a = 2131232202;
            obj.b = k96.a0("LimitReachedChatInFolders", null, 2131748783, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = k96.a0("LimitReachedChatInFoldersPremium", null, 2131748781, Integer.valueOf(obj.f));
            obj.d = k96.a0("LimitReachedChatInFoldersLocked", null, 2131748782, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 5) {
            obj.e = na7.q1(i2).k4.l3.f();
            obj.f = na7.q1(i2).k4.m3.f();
            obj.a = 2131232204;
            obj.b = k96.a0("LimitReachedCommunities", null, 2131748780, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = k96.a0("LimitReachedCommunitiesPremium", null, 2131748778, Integer.valueOf(obj.f));
            obj.d = k96.a0("LimitReachedCommunitiesLocked", null, 2131748779, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 6) {
            obj.e = 100;
            obj.f = 200;
            obj.a = 2131232203;
            obj.b = k96.a0("LimitReachedFileSize", null, 2131748771, "2 GB", "4 GB");
            obj.c = k96.a0("LimitReachedFileSizePremium", null, 2131748769, "4 GB");
            obj.d = k96.a0("LimitReachedFileSizeLocked", null, 2131748770, "2 GB");
            return obj;
        } else if (i == 7) {
            obj.e = 3;
            obj.f = 4;
            obj.a = 2131232201;
            obj.b = k96.a0("LimitReachedAccounts", null, 2131748785, 3, Integer.valueOf(obj.f));
            obj.c = k96.a0("LimitReachedAccountsPremium", null, 2131748784, Integer.valueOf(obj.f));
            obj.d = k96.a0("LimitReachedAccountsPremium", null, 2131748784, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 11) {
            obj.e = 0;
            obj.f = 0;
            obj.a = 2131232205;
            obj.b = k96.a0("LimitReachedAccounts", null, 2131748785, 0, Integer.valueOf(obj.f));
            obj.c = "";
            obj.d = "";
            return obj;
        } else if (i == 14) {
            obj.e = na7.q1(i2).k4.v1.f();
            obj.f = na7.q1(i2).k4.w1.f();
            obj.a = 2131232207;
            obj.b = k96.H(',', "LimitReachedStoriesCount2First", obj.e) + "\n" + k96.H(',', "LimitReachedStoriesCount2Second", obj.f);
            obj.c = k96.H(',', "LimitReachedStoriesCount2Premium", obj.f);
            obj.d = k96.H(',', "LimitReachedStoriesCount2Premium", obj.e);
            return obj;
        } else if (i == 15) {
            obj.e = na7.q1(i2).k4.z1.f();
            obj.f = na7.q1(i2).k4.A1.f();
            obj.a = 2131232207;
            obj.b = k96.a0("LimitReachedStoriesWeekly", null, 2131748737, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = k96.a0("LimitReachedStoriesWeeklyPremium", null, 2131748736, Integer.valueOf(obj.f));
            obj.d = k96.a0("LimitReachedStoriesWeeklyPremium", null, 2131748736, Integer.valueOf(obj.e));
            return obj;
        } else if (i == 16) {
            obj.e = na7.q1(i2).k4.B1.f();
            obj.f = na7.q1(i2).k4.C1.f();
            obj.a = 2131232207;
            obj.b = k96.a0("LimitReachedStoriesMonthly", null, 2131748739, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = k96.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(obj.f));
            obj.d = k96.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(obj.e));
            return obj;
        } else if (i != 18 && i != 32 && i != 20 && i != 24 && i != 27 && i != 28 && i != 25 && i != 30 && i != 35 && i != 29 && i != 22 && i != 23 && i != 19 && i != 21 && i != 26) {
            return obj;
        } else {
            obj.e = na7.q1(i2).k4.B1.f();
            obj.f = na7.q1(i2).k4.C1.f();
            obj.a = 2131231129;
            obj.b = k96.a0("LimitReachedStoriesMonthly", null, 2131748739, Integer.valueOf(obj.e), Integer.valueOf(obj.f));
            obj.c = k96.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(obj.f));
            obj.d = k96.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(obj.e));
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

    public static void n1(d dVar, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ng1 ng1Var, long j, boolean z) {
        if (tL_premium_boostsStatus != null && ng1Var != null && dVar.getContext() != null) {
            h26 h26Var = new h26(32, dVar.getCurrentAccount(), dVar.getResourceProvider(), dVar.getContext(), dVar);
            h26Var.r1(ng1Var);
            h26Var.q1(tL_premium_boostsStatus, true);
            h26Var.s1(j);
            if (z) {
                dVar.showDialog(h26Var);
            } else {
                h26Var.show();
            }
        }
    }

    @Override
    public final n39 G0(o39 o39Var) {
        return new z16(this);
    }

    @Override
    public final CharSequence J0() {
        int i = this.c2;
        if (i != 11) {
            if (i != 34) {
                if (i != 35) {
                    int i2 = 2131753622;
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
                            return k96.M0(2131743635, null);
                        case 19:
                        case 30:
                            if (!i1()) {
                                i2 = 2131753660;
                            }
                            return k96.M0(i2, null);
                        case 31:
                            return k96.M0(2131753597, null);
                        case 32:
                            return k96.M0(2131753622, null);
                        default:
                            return k96.M0(2131748786, null);
                    }
                }
                return k96.M0(2131743635, null);
            }
            return k96.M0(2131752610, null);
        }
        return k96.M0(2131752389, null);
    }

    @Override
    public final void P0(cja cjaVar) {
        int i;
        Context context = cjaVar.getContext();
        u41 u41Var = new u41(this.J0, context, true);
        this.B2 = u41Var;
        u41Var.setFlickeringLoading(true);
        this.B2.i(k96.M0(2131753661, null), false, true);
        this.B2.setOnClickListener(new q16(this, (byte) 2));
        w16 w16Var = new w16(this, context, this.J0);
        this.z2 = w16Var;
        ote.b(w16Var, 0.02f, 1.2f);
        if (!this.s1 && (i = this.c2) != 18 && i != 20 && i != 24 && i != 25 && i != 26 && i != 29 && i != 22 && i != 23 && i != 21 && i != 27 && i != 28 && i != 30 && i != 35) {
            sb sbVar = new sb((byte) 19, context, this);
            this.G2 = sbVar;
            zkb.h(bkb.g5, this.J0, sbVar);
            cjaVar.addView(this.G2, nme.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        w16 w16Var2 = this.z2;
        float f = (this.u0 / gl.p) + 16.0f;
        cjaVar.addView(w16Var2, nme.d(-1, 48.0f, 80, f, 0.0f, f, 12.0f));
        int L = gl.L(72.0f);
        o39 o39Var = this.n1;
        o39Var.setPadding(0, 0, 0, L);
        o39Var.setClipToPadding(false);
        o39Var.setClipChildren(false);
        o39Var.setOnItemClickListener(new bf4(this, (byte) 9));
        o39Var.setOnItemLongClickListener(new t16(this, (byte) 2));
        this.z2.w.setOnClickListener(new v16(this, context, (byte) 0));
        this.z2.h.setOnClickListener(new q16(this, (byte) 3));
        this.E2 = new t29(o39Var, true);
    }

    public final void Y0(final g86 g86Var, boolean z) {
        if (g86Var.a() && !z) {
            return;
        }
        g86Var.setLoading(true);
        na7.q1(this.a).E0();
        long j = this.V1;
        int i = this.X1.g;
        on0.a(-j, Arrays.asList(Integer.valueOf(i)), new p8c(this) {
            public final h26 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r3;
                g86 g86Var2 = g86Var;
                h26 h26Var = this.b;
                switch (b) {
                    case 0:
                        na7.q1(h26Var.a).E0().a(h26Var.V1, new ht(h26Var, g86Var2, (TL_stories.TL_premium_myBoosts) obj, (byte) 24));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                gl.d3(new kz5(h26Var, g86Var2, (byte) 2), intValue * 1000);
                                return;
                            }
                            ym0.g(intValue);
                        }
                        g86Var2.setLoading(false);
                        return;
                }
            }
        }, new p8c(this) {
            public final h26 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r3;
                g86 g86Var2 = g86Var;
                h26 h26Var = this.b;
                switch (b) {
                    case 0:
                        na7.q1(h26Var.a).E0().a(h26Var.V1, new ht(h26Var, g86Var2, (TL_stories.TL_premium_myBoosts) obj, (byte) 24));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                gl.d3(new kz5(h26Var, g86Var2, (byte) 2), intValue * 1000);
                                return;
                            }
                            ym0.g(intValue);
                        }
                        g86Var2.setLoading(false);
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
        u41 u41Var = this.N2;
        if (u41Var != null && u41Var.isAttachedToWindow()) {
            Y0(u41Var, false);
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
        na7 q1 = na7.q1(i);
        long j2 = -j;
        TLRPC.Chat K0 = q1.K0(Long.valueOf(j2));
        if (!TextUtils.isEmpty(hc2.K(K0, false))) {
            return "https://t.me/boost/" + hc2.K(K0, false);
        }
        return ls6.n(j2, "https://t.me/boost/?c=");
    }

    public final String c1(boolean z) {
        String str;
        boolean z2;
        int i;
        int i2;
        String str2;
        if (this.c2 == 32) {
            TLRPC.Chat e1 = e1();
            TLRPC.ChatFull L0 = na7.q1(this.a).L0(-this.V1);
            int max = Math.max(L0.boosts_unrestrict - L0.boosts_applied, 0);
            if (e1 == null) {
                str2 = "";
            } else {
                str2 = e1.title;
            }
            return k96.G(max, "BoostingRemoveRestrictionsSubtitle", str2);
        }
        TLRPC.Chat K0 = na7.q1(this.a).K0(Long.valueOf(-this.V1));
        if (K0 == null) {
            if (i1()) {
                i2 = 2131754876;
            } else {
                i2 = 2131754904;
            }
            str = k96.M0(i2, null);
        } else {
            str = K0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = 2131752340;
        if (j1() && this.W1.next_level_boosts != 0 && z) {
            if (i1()) {
                i3 = 2131749228;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.W1;
            int i4 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return k96.a0(null, null, i3, str, k96.G(i4, "MoreBoosts", Integer.valueOf(i4)));
        }
        int i5 = 2131752437;
        if (z2 && this.X1.d) {
            if (this.W1.level == 1) {
                if (i1()) {
                    i = 2131749301;
                } else {
                    i = 2131752438;
                }
                return k96.a0(null, null, i, new Object[0]);
            }
            if (i1()) {
                i5 = 2131749300;
            }
            return k96.a0(null, null, i5, Integer.valueOf(this.W1.level), k96.G(this.W1.level, "BoostStories", new Object[0]));
        }
        boolean z3 = this.X1.d;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.W1;
        if (z3) {
            if (tL_premium_boostsStatus3.level == 0) {
                if (i1()) {
                    i3 = 2131749228;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.W1;
                int i6 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return k96.a0(null, null, i3, str, k96.G(i6, "MoreBoosts", Integer.valueOf(i6)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (i1()) {
                    i5 = 2131749300;
                }
                return k96.a0(null, null, i5, Integer.valueOf(this.W1.level), k96.G(this.W1.level + 1, "BoostStories", new Object[0]));
            } else {
                if (i1()) {
                    i3 = 2131749228;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.W1;
                int i7 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return k96.a0(null, null, i3, str, k96.G(i7, "MoreBoosts", Integer.valueOf(i7)));
            }
        } else if (tL_premium_boostsStatus3.level == 0) {
            if (i1()) {
                i3 = 2131749228;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.W1;
            int i8 = tL_premium_boostsStatus6.next_level_boosts - tL_premium_boostsStatus6.boosts;
            return k96.a0(null, null, i3, str, k96.G(i8, "MoreBoosts", Integer.valueOf(i8)));
        } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
            if (i1()) {
                i5 = 2131749300;
            }
            return k96.a0(null, null, i5, Integer.valueOf(this.W1.level), k96.G(this.W1.level + 1, "BoostStories", new Object[0]));
        } else {
            if (i1()) {
                i3 = 2131749228;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.W1;
            int i9 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return k96.a0(null, null, i3, str, k96.G(i9, "MoreBoosts", Integer.valueOf(i9)));
        }
    }

    public final String d1() {
        int i;
        int i2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return k96.a0("BoostsMaxLevelReached", null, 2131753155, new Object[0]);
        }
        int i3 = 2131753660;
        if (tL_premium_boostsStatus.level > 0 && !this.X1.d) {
            if (i1()) {
                i3 = 2131753622;
            }
            return k96.M0(i3, null);
        }
        boolean z = this.Z1;
        int i4 = this.c2;
        if (z) {
            if (i4 == 32) {
                if (i1()) {
                    i3 = 2131753622;
                }
                return k96.M0(i3, null);
            }
            TLRPC.Chat K0 = na7.q1(this.a).K0(Long.valueOf(-this.V1));
            if (this.X1.d) {
                return k96.a0("YouBoostedChannel2", null, 2131742577, K0.title);
            }
            if (i1()) {
                i3 = 2131753622;
            }
            return k96.M0(i3, null);
        } else if (i4 == 32) {
            if (i1()) {
                i3 = 2131753622;
            }
            return k96.M0(i3, null);
        } else if (this.X1.d) {
            if (i1()) {
                i2 = 2131742576;
            } else {
                i2 = 2131742578;
            }
            return k96.M0(i2, null);
        } else {
            if (i1()) {
                i = 2131753524;
            } else {
                i = 2131753525;
            }
            return k96.M0(i, null);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        TLRPC.ChatFull L0;
        d dVar;
        d dVar2;
        if (i == kk7.W2) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            d dVar3 = this.r1;
            d lastFragment = dVar3.getParentLayout().getLastFragment();
            d dVar4 = null;
            if (lastFragment instanceof c82) {
                List fragmentStack = dVar3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    dVar = (d) oo1.m(2, fragmentStack);
                } else {
                    dVar = null;
                }
                if (fragmentStack.size() >= 3) {
                    dVar2 = (d) oo1.m(3, fragmentStack);
                } else {
                    dVar2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    dVar4 = (d) oo1.m(4, fragmentStack);
                }
                if (dVar instanceof p82) {
                    ((ActionBarLayout) dVar3.getParentLayout()).c0(dVar, false);
                }
                dismiss();
                if (booleanValue) {
                    if (dVar2 instanceof ProfileActivity) {
                        ((ActionBarLayout) dVar3.getParentLayout()).c0(dVar2, false);
                    }
                    lastFragment.finishFragment();
                    ym0.f(dVar4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                ym0.f(dVar2, chat, false);
            } else if ((lastFragment instanceof mu1) && booleanValue) {
                ym0.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof nh1) && booleanValue) {
                List fragmentStack2 = dVar3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    d dVar5 = (d) fragmentStack2.get(size);
                    if (!(dVar5 instanceof mu1) && !(dVar5 instanceof cj3)) {
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
                    ym0.f(dVar4, chat, true);
                }
            } else {
                t7b t7bVar = t7b.G2;
                if (booleanValue) {
                    if (t7bVar != null && t7bVar.d) {
                        mu1 W9 = mu1.W9(-chat.id);
                        LaunchActivity.Q().presentFragment(W9, false, false);
                        t7b.v();
                        dismiss();
                        ym0.f(W9, chat, true);
                        return;
                    }
                    List fragmentStack3 = dVar3.getParentLayout().getFragmentStack();
                    if (fragmentStack3.size() >= 2) {
                        dVar4 = (d) oo1.m(2, fragmentStack3);
                    }
                    dVar3.finishFragment();
                    dismiss();
                    if (dVar4 instanceof mu1) {
                        ym0.f(dVar4, chat, true);
                    }
                } else if (t7bVar != null && t7bVar.d) {
                    mu1 W92 = mu1.W9(-chat.id);
                    LaunchActivity.Q().presentFragment(W92, false, false);
                    t7b.v();
                    dismiss();
                    ym0.f(W92, chat, false);
                } else {
                    dismiss();
                    ym0.f(LaunchActivity.Q(), chat, false);
                }
            }
        } else if (i == kk7.V2) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus != null && this.X1 != null) {
                this.W1.boosts += intValue;
                if (this.c2 == 32 && (L0 = na7.q1(this.a).L0(-this.V1)) != null) {
                    L0.boosts_applied += intValue;
                }
                k1();
                q1(tL_premium_boostsStatus, this.Z1);
                ng1 ng1Var = this.X1;
                if (this.W1.next_level_boosts <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                ng1Var.m = z;
                ng1Var.l = true;
                ng1Var.a(tL_premium_myBoosts);
                if (m1()) {
                    m21 Q = new u21(this.c, this.J0).Q(2131624051, 30, k96.G(intValue, "BoostingReassignedFromPlural", k96.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                    Q.j = 4000;
                    Q.k(true);
                }
            }
        } else if (i == kk7.U2) {
            dismiss();
        }
    }

    public final TLRPC.Chat e1() {
        return na7.q1(this.a).K0(Long.valueOf(-this.V1));
    }

    public final boolean h1() {
        int i = this.c2;
        if (i != 19 && i != 18 && i != 20 && i != 24 && i != 25 && i != 26 && i != 29 && i != 22 && i != 27 && i != 28 && i != 23 && i != 30 && i != 35) {
            return false;
        }
        return true;
    }

    public final boolean i1() {
        return !hc2.V(na7.q1(this.a).K0(Long.valueOf(-this.V1)));
    }

    public final boolean j1() {
        if (h1() && hc2.N(e1())) {
            return true;
        }
        return false;
    }

    public final void k1() {
        int i;
        e26 e26Var = this.s2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        int i2 = tL_premium_boostsStatus.boosts;
        int i3 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        e26Var.b++;
        e26Var.a = moe.a((i2 - i) / i3, 0.0f, 1.0f);
        e26Var.a0 = true;
        e26Var.b0 = e26Var.n;
        e26Var.j(i2, true);
        e26Var.J.requestLayout();
        e26Var.requestLayout();
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
        kk7 f6 = kk7.f(this.a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W1;
        ng1 ng1Var = this.X1;
        ng1Var.getClass();
        ng1 ng1Var2 = new ng1();
        ng1Var2.a = ng1Var.a;
        ng1Var2.b = ng1Var.b;
        ng1Var2.c = ng1Var.c;
        ng1Var2.d = ng1Var.d;
        ng1Var2.e = ng1Var.e;
        ng1Var2.g = ng1Var.g;
        ng1Var2.h = ng1Var.h;
        ng1Var2.i = ng1Var.i;
        ng1Var2.j = ng1Var.j;
        ng1Var2.k = ng1Var.k;
        ng1Var2.m = ng1Var.m;
        f6.m(kk7.q3, tL_premium_boostsStatus, ng1Var2, Long.valueOf(this.V1));
        u41 u41Var = this.N2;
        if (u41Var != null) {
            TLRPC.ChatFull L0 = na7.q1(this.a).L0(-this.V1);
            int max = Math.max(L0.boosts_unrestrict - L0.boosts_applied, 0);
            if (max == 0) {
                kk7.f(this.a).m(kk7.p3, new Object[0]);
                dismiss();
                return false;
            }
            u41Var.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new h7((byte) 2));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.Y1, transitionSet);
        f26 f26Var = this.Y1;
        mm0 mm0Var = f26Var.c;
        int indexOfChild = f26Var.indexOfChild(f26Var.b);
        h26 h26Var = f26Var.e;
        if (h26Var.Z1) {
            int indexOfChild2 = f26Var.indexOfChild(f26Var.d);
            f26Var.removeView(f26Var.d);
            f26Var.d.removeView(f26Var.a);
            f26Var.d.removeView(mm0Var);
            LinearLayout linearLayout = new LinearLayout(f26Var.getContext());
            f26Var.d = linearLayout;
            linearLayout.setOrientation(0);
            f26Var.d.setWeightSum(1.0f);
            f26Var.d.addView(f26Var.a, nme.p(-2, -2, 1.0f, 0));
            f26Var.d.addView(mm0Var, nme.t(-2, -2, 48, 0, 2, 0, 0));
            f26Var.addView(f26Var.d, indexOfChild2, nme.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = f26Var.indexOfChild(f26Var.a);
            f26Var.removeView(f26Var.a);
            TextView textView = new TextView(f26Var.getContext());
            f26Var.a = textView;
            textView.setTypeface(gl.o());
            f26Var.a.setTextSize(1, 20.0f);
            zkb.X(f26Var.a, bkb.F6, h26Var.J0);
            f26Var.a.setGravity(17);
            f26Var.addView(f26Var.a, indexOfChild3, nme.t(-2, -2, 1, 0, 22, 0, 0));
        }
        f26Var.removeView(f26Var.b);
        TextView textView2 = new TextView(f26Var.getContext());
        f26Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = f26Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), f26Var.b.getLineSpacingMultiplier() * 1.1f);
        f26Var.b.setGravity(1);
        zkb.X(f26Var.b, bkb.F6, h26Var.J0);
        f26Var.addView(f26Var.b, indexOfChild, nme.t(-2, -2, 1, 24, -2, 24, 17));
        this.Y1.a.setText(d1());
        TextView textView4 = this.Y1.b;
        gr grVar = na7.q1(this.a).k4;
        boolean i1 = i1();
        int i9 = this.c2;
        String str = null;
        if (i9 == 20) {
            if (i1) {
                i8 = 2131749226;
            } else {
                i8 = 2131752337;
            }
            str = k96.a0(null, null, i8, Integer.valueOf(a1()));
        } else if (i9 == 24) {
            if (i1) {
                i7 = 2131749222;
            } else {
                i7 = 2131752334;
            }
            str = k96.a0(null, null, i7, Integer.valueOf(a1()));
        } else if (i9 == 29) {
            str = k96.a0(null, null, 2131749225, Integer.valueOf(grVar.d2.f()));
        } else if (i9 == 30) {
            str = k96.a0(null, null, 2131752331, Integer.valueOf(grVar.T1.f()));
        } else if (i9 == 35) {
            str = k96.a0(null, null, 2131752338, Integer.valueOf(grVar.U1.f()));
        } else if (i9 == 25) {
            if (i1) {
                f5 = grVar.c2.f();
                i6 = 2131749223;
            } else {
                f5 = grVar.X1.f();
                i6 = 2131752335;
            }
            str = k96.a0(null, null, i6, Integer.valueOf(f5));
        } else if (i9 == 26) {
            if (i1) {
                f4 = grVar.c2.f();
                i5 = 2131749218;
            } else {
                f4 = grVar.X1.f();
                i5 = 2131752329;
            }
            str = k96.a0(null, null, i5, Integer.valueOf(f4));
        } else if (i9 == 27) {
            if (i1) {
                i4 = 2131749220;
            } else {
                i4 = 2131752332;
            }
            str = k96.a0(null, null, i4, Integer.valueOf(grVar.V1.f()));
        } else if (i9 == 28) {
            if (i1) {
                f3 = grVar.e2.f();
                i3 = 2131749221;
            } else {
                f3 = grVar.W1.f();
                i3 = 2131752333;
            }
            str = k96.a0(null, null, i3, Integer.valueOf(f3));
        } else if (i9 == 22) {
            if (i1) {
                f2 = grVar.b2.f();
                i2 = 2131749219;
            } else {
                f2 = grVar.f2.f();
                i2 = 2131752330;
            }
            str = k96.a0(null, null, i2, Integer.valueOf(f2));
        } else if (i9 == 23) {
            if (i1) {
                f = grVar.Y1.f();
                i = 2131749224;
            } else {
                f = grVar.g2.f();
                i = 2131752336;
            }
            str = k96.a0(null, null, i, Integer.valueOf(f));
        }
        if (str == null) {
            str = c1(false);
        }
        textView4.setText(gl.S2(str));
        v1();
        qh4 qh4Var = this.K2;
        qh4Var.c(false);
        try {
            qh4Var.performHapticFeedback(3);
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
        String G = k96.G(arrayList.size(), "RevokeLinks", new Object[0]);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            boolean z = this.q2;
            int i = this.a;
            if (z) {
                hdVar.U = gl.S2(k96.a0("RevokeLinkAlertChannel", null, 2131745828, na7.q1(i).N2 + "/" + hc2.K(chat, false), chat.title));
            } else {
                hdVar.U = gl.S2(k96.a0("RevokeLinkAlert", null, 2131745829, na7.q1(i).N2 + "/" + hc2.K(chat, false), chat.title));
            }
        } else if (this.q2) {
            hdVar.U = gl.S2(k96.a0("RevokeLinksAlertChannel", null, 2131745825, new Object[0]));
        } else {
            hdVar.U = gl.S2(k96.a0("RevokeLinksAlert", null, 2131745826, new Object[0]));
        }
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131745831, null), new h45(this, arrayList, (byte) 12));
        hdVar.show();
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, this.J0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.a).b(this, kk7.W2);
        kk7.f(this.a).b(this, kk7.V2);
        kk7.f(this.a).b(this, kk7.U2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.a).n(this, kk7.W2);
        kk7.f(this.a).n(this, kk7.V2);
        kk7.f(this.a).n(this, kk7.U2);
    }

    @Override
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.G0 < 0 && this.H0 == this.O2 && (v0 = bkb.v0(bkb.g5, this.J0)) != this.H0) {
                this.H0 = v0;
                this.O2 = v0;
                x0(v0);
            }
        } catch (Exception e) {
            fa4.g(e, true);
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
            TLRPC.ChatFull L0 = na7.q1(this.a).L0(this.J2.id);
            if (L0 == null) {
                dismiss();
                return;
            } else if (this.J2.username != null) {
                str = "@" + this.J2.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = L0.exported_invite;
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
            long K1 = na7.q1(this.a).K1(user.id);
            if (K1 <= 0) {
                K1 = cf3.j(na7.q1(this.a).J2(user.id));
            }
            if (K1 >= 0) {
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
            ij.Z(this.a, arrayList4, 1, new hj3(this, (byte) 21));
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
            x3a b = x3a.b(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b.Q = longValue;
            z3a.B(this.a).q0(b);
            if (b.Q > 0) {
                z2 = z3;
            }
            hashMap2 = hashMap;
            z = z3;
            it2 = it3;
        }
        if (!z2) {
            gl.c3(new s16(this, (byte) 2));
        }
        dismiss();
    }

    public final void q1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z) {
        this.W1 = tL_premium_boostsStatus;
        this.Z1 = z;
        x1();
    }

    public final void r1(ng1 ng1Var) {
        this.X1 = ng1Var;
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
        if (TextUtils.isEmpty(str) && !hc2.y(3, chat)) {
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
        if ((i2 == 11 || i2 == 34) && !na7.q1(this.a).F3()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.w2.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    w16 w16Var = this.z2;
                    if (w16Var != null && w16Var.getParent() != null) {
                        ((ViewGroup) this.z2.getParent()).removeView(this.z2);
                    }
                    sb sbVar = this.G2;
                    if (sbVar != null && sbVar.getParent() != null) {
                        ((ViewGroup) this.G2.getParent()).removeView(this.G2);
                    }
                    o39 o39Var = this.n1;
                    if (o39Var != null) {
                        o39Var.setPadding(0, 0, 0, 0);
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
        na7 q1 = na7.q1(this.a);
        gr grVar = q1.k4;
        ea7 ea7Var = q1.E3;
        if (ea7Var != null) {
            i2 = ea7Var.e(i1());
        } else {
            i2 = 0;
        }
        int max2 = Math.max(10, i2);
        ea7 ea7Var2 = q1.F3;
        if (ea7Var2 != null) {
            i3 = ea7Var2.e(i1());
        } else {
            i3 = 0;
        }
        int max3 = Math.max(max2, i3);
        if (i1()) {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(max3, grVar.Z1.f()), grVar.b2.f()), grVar.Y1.f()), grVar.c2.f()), grVar.e2.f());
        } else {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max3, grVar.V1.f()), grVar.W1.f()), grVar.X1.f()), grVar.f2.f()), grVar.g2.f()), grVar.T1.f()), grVar.U1.f());
        }
        ArrayList arrayList = null;
        while (i <= max) {
            boolean i1 = i1();
            ArrayList arrayList2 = new ArrayList();
            na7 q12 = na7.q1(this.a);
            gr grVar2 = q12.k4;
            if (!i1 && i >= grVar2.U1.f()) {
                arrayList2.add(b26.a(2131231823, 2131753657));
            }
            b26 b = b26.b(2131231820, i, "BoostFeatureStoriesPerDay");
            b.f = true;
            arrayList2.add(b);
            if (!i1) {
                b26 b2 = b26.b(2131231815, i, "BoostFeatureCustomReaction");
                b2.f = true;
                arrayList2.add(b2);
            }
            ea7 ea7Var3 = q12.E3;
            if (ea7Var3 != null) {
                i4 = ea7Var3.a(i, false);
            } else {
                i4 = 0;
            }
            ea7 ea7Var4 = q12.F3;
            if (ea7Var4 != null) {
                i5 = ea7Var4.a(i, i1);
            } else {
                i5 = 0;
            }
            if (!i1 && i4 > 0) {
                arrayList2.add(b26.b(2131231801, 7, "BoostFeatureNameColor"));
            }
            if (!i1 && i4 > 0) {
                arrayList2.add(b26.b(2131231809, i4, "BoostFeatureReplyColor"));
            }
            if (!i1 && i >= grVar2.V1.f()) {
                arrayList2.add(b26.a(2131231810, 2131753630));
            }
            if (i5 > 0) {
                if (i1) {
                    str2 = "BoostFeatureProfileColorGroup";
                } else {
                    str2 = "BoostFeatureProfileColor";
                }
                arrayList2.add(b26.b(2131231802, i5, str2));
            }
            if (i1 && i >= grVar2.d2.f()) {
                arrayList2.add(b26.a(2131231812, 2131753648));
            }
            if (i1 ? i >= grVar2.e2.f() : i >= grVar2.W1.f()) {
                if (i1) {
                    i7 = 2131753634;
                } else {
                    i7 = 2131753635;
                }
                arrayList2.add(b26.a(2131231803, i7));
            }
            if (i1 && i >= grVar2.Z1.f()) {
                arrayList2.add(b26.a(2131231826, 2131753625));
            }
            if (i1 ? i >= grVar2.c2.f() : i >= grVar2.X1.f()) {
                arrayList2.add(new b26(2131231819, 2131753644, -1, "1000+", null));
            }
            if (i1 ? i >= grVar2.b2.f() : i >= grVar2.f2.f()) {
                if (i1) {
                    str = "BoostFeatureBackgroundGroup";
                } else {
                    str = "BoostFeatureBackground";
                }
                arrayList2.add(b26.b(2131231827, 8, str));
            }
            if (i1 ? i >= grVar2.Y1.f() : i >= grVar2.g2.f()) {
                if (i1) {
                    i6 = 2131753649;
                } else {
                    i6 = 2131753650;
                }
                arrayList2.add(b26.a(2131231805, i6));
            }
            if (!i1 && i >= grVar2.T1.f()) {
                arrayList2.add(b26.a(2131231811, 2131753626));
            }
            Collections.reverse(arrayList2);
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    b26 b26Var = (b26) arrayList.get(i8);
                    b26 b26Var2 = (b26) arrayList2.get(i8);
                    int i9 = b26Var.e;
                    if (b26Var2 != null && ((b26Var.f && i9 > 2) || (b26Var.a == b26Var2.a && b26Var.b == b26Var2.b && TextUtils.equals(b26Var.c, b26Var2.c) && TextUtils.equals(b26Var.d, b26Var2.d) && i9 == b26Var2.e))) {
                    }
                }
                i++;
            }
            ArrayList arrayList3 = this.p2;
            arrayList3.add(new a26(i, arrayList3.isEmpty()));
            this.p2.addAll(arrayList2);
            arrayList = arrayList2;
            i++;
        }
    }

    public final void v1() {
        int i;
        String str = null;
        if (this.e2) {
            this.z2.c(k96.M0(2131748938, null), false, false);
            return;
        }
        int i2 = this.c2;
        if (i2 != 19 && i2 != 32 && !j1()) {
            HashSet hashSet = this.t2;
            if (i2 != 11 && i2 != 34) {
                if (hashSet.size() > 0) {
                    if (i2 == 2) {
                        str = k96.G(hashSet.size(), "RevokeLinks", new Object[0]);
                    } else if (i2 == 5) {
                        str = k96.G(hashSet.size(), "LeaveCommunities", new Object[0]);
                    }
                    this.z2.c(str, true, true);
                    return;
                }
                w16 w16Var = this.z2;
                w16Var.r = false;
                w16Var.d(true);
                return;
            }
            w16 w16Var2 = this.z2;
            if (w16Var2.J == null) {
                kx2 kx2Var = new kx2(w16Var2.getContext(), null);
                w16Var2.J = kx2Var;
                kx2Var.setGravity(3);
                kx2 kx2Var2 = w16Var2.J;
                int i3 = bkb.Ei;
                int i4 = bkb.Ii;
                jx2 jx2Var = kx2Var2.a;
                jx2Var.v = i3;
                jx2Var.w = i4;
                jx2Var.b = 0.8f;
                w16Var2.setClipChildren(false);
                w16Var2.addView(w16Var2.J, nme.e(-1, 24, 16));
            }
            if (!this.T1) {
                this.z2.c(k96.M0(2131752029, null), true, true);
            } else {
                int size = hashSet.size();
                w16 w16Var3 = this.z2;
                if (size > 0) {
                    w16Var3.c(k96.M0(2131745427, null), true, true);
                } else {
                    w16Var3.c(k96.M0(2131754554, null), true, true);
                }
            }
            this.z2.J.a.c(hashSet.size(), true);
            this.z2.invalidate();
            return;
        }
        ng1 ng1Var = this.X1;
        boolean z = ng1Var.a;
        if ((z || ng1Var.b) && !ng1Var.l && !ng1Var.d) {
            boolean z2 = ng1Var.m;
            w16 w16Var4 = this.z2;
            if (z2) {
                w16Var4.c(k96.M0(2131747638, null), true, true);
                return;
            }
            w16Var4.r = false;
            w16Var4.d(true);
            return;
        }
        u41 u41Var = this.N2;
        if (z) {
            boolean k = on0.k();
            w16 w16Var5 = this.z2;
            if (k) {
                w16Var5.c(k96.M0(2131753588, null), true, true);
            } else {
                if (i1()) {
                    i = 2131753622;
                } else {
                    i = 2131753660;
                }
                w16Var5.c(k96.M0(i, null), true, true);
            }
            this.B2.i(k96.M0(2131753661, null), true, true);
            if (u41Var != null) {
                u41Var.i(k96.M0(2131753622, null), true, true);
            }
        } else if (ng1Var.m) {
            this.B2.i(k96.M0(2131747638, null), true, true);
            if (u41Var != null) {
                u41Var.i(k96.M0(2131747638, null), true, true);
            }
            this.z2.c(k96.M0(2131747638, null), true, true);
        } else if (on0.k()) {
            if (u41Var != null) {
                u41Var.i(k96.M0(2131753622, null), true, true);
            }
            this.B2.i(k96.M0(2131753661, null), true, true);
            this.z2.c(k96.M0(2131753588, null), true, true);
        } else {
            if (u41Var != null) {
                u41Var.i(k96.M0(2131747638, null), true, true);
            }
            this.B2.i(k96.M0(2131747638, null), true, true);
            this.z2.c(k96.M0(2131747638, null), true, true);
        }
    }

    public final void w1() {
        String M0;
        if (this.e2) {
            this.z2.c(k96.M0(2131748938, null), false, false);
            return;
        }
        int i = this.c2;
        if (i != 19 && i != 32 && !j1()) {
            if (i != 18 && i != 20 && i != 24 && i != 25 && i != 26 && i != 29 && i != 22 && i != 23 && i != 21 && i != 27 && i != 28 && i != 30 && i != 35) {
                if (!y6c.h(this.a).p() && !na7.q1(this.a).F3() && !this.I2) {
                    this.z2.f.setText(k96.M0(2131749007, null));
                    g26 g26Var = this.H2;
                    if (g26Var != null) {
                        int i2 = g26Var.e;
                        int i3 = i2 + 1;
                        int i4 = g26Var.f;
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
                        w16 w16Var = this.z2;
                        w16Var.E.p = null;
                        w16Var.G.setVisibility(8);
                        return;
                    }
                    w16 w16Var2 = this.z2;
                    w16Var2.E.p = null;
                    w16Var2.G.setVisibility(8);
                    return;
                }
                this.z2.f.setText(k96.M0(2131747638, null));
                w16 w16Var3 = this.z2;
                w16Var3.E.p = null;
                w16Var3.G.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new cm2(2131232109, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) k96.M0(2131751750, null));
            this.z2.f.setText(spannableStringBuilder);
            return;
        }
        boolean k = on0.k();
        w16 w16Var4 = this.z2;
        int i5 = 2131753660;
        if (k) {
            yg8 yg8Var = w16Var4.f;
            ng1 ng1Var = this.X1;
            if (ng1Var != null && ng1Var.d) {
                M0 = k96.M0(2131753588, null);
            } else {
                if (i1()) {
                    i5 = 2131753622;
                }
                M0 = k96.M0(i5, null);
            }
            yg8Var.setText(M0);
            ng1 ng1Var2 = this.X1;
            if (ng1Var2 != null && ng1Var2.m) {
                this.z2.f.setText(k96.M0(2131747638, null));
                return;
            }
            return;
        }
        yg8 yg8Var2 = w16Var4.f;
        if (i1()) {
            i5 = 2131753622;
        }
        yg8Var2.setText(k96.M0(i5, null));
    }

    public final void x1() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h26.x1():void");
    }
}
