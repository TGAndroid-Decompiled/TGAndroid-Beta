package kg;

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
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h3;
import org.telegram.messenger.mp;
import org.telegram.messenger.o5;
import org.telegram.messenger.pz;
import org.telegram.messenger.r20;
import org.telegram.messenger.rz;
import org.telegram.messenger.vs;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.oo;
import org.telegram.ui.un;
import org.telegram.ui.zc;
import org.telegram.ui.zx;
import vh.o8;
import w7.b6;
import w7.e6;
public class q0 extends ha implements vs {
    public static final int O2 = 0;
    public boolean A2;
    public xj0 B2;
    public final org.telegram.ui.ActionBar.k2 C2;
    public bi.t0 D2;
    public androidx.emoji2.text.p E2;
    public boolean F2;
    public TLRPC.Chat G2;
    public final xz H2;
    public Runnable I2;
    public int J2;
    public final vh.d K2;
    public int L2;
    public int M2;
    public String N2;
    public int P1;
    public boolean Q1;
    public int R1;
    public long S1;
    public TL_stories.TL_premium_boostsStatus T1;
    public h3 U1;
    public p0 V1;
    public boolean W1;
    public boolean X1;
    public org.telegram.ui.Cells.q1 Y1;
    public final int Z1;
    public final ArrayList a2;
    public boolean f11226b2;
    public int f11227c2;
    public int f11228d2;
    public int f11229e2;
    public int f11230f2;
    public int f11231g2;
    public int f11232h2;
    public int f11233i2;
    public int f11234j2;
    public int f11235k2;
    public int f11236l2;
    public ArrayList f11237m2;
    public boolean f11238n2;
    public int f11239o2;
    public o0 f11240p2;
    public final HashSet f11241q2;
    public final ArrayList f11242r2;
    public final ArrayList f11243s2;
    public ArrayList f11244t2;
    public ArrayList f11245u2;
    public ArrayList f11246v2;
    public e0 f11247w2;
    public final TextView f11248x2;
    public vh.d f11249y2;
    public Runnable f11250z2;

    public q0(int i10, int i11, Context context, org.telegram.ui.ActionBar.k2 k2Var, p6 p6Var) {
        super(context, k2Var, false, p1(i10), p6Var);
        this.R1 = -1;
        this.X1 = false;
        this.a2 = new ArrayList();
        this.f11228d2 = -1;
        this.f11229e2 = -1;
        this.f11230f2 = -1;
        this.f11231g2 = -1;
        this.f11232h2 = -1;
        this.f11233i2 = -1;
        this.f11234j2 = -1;
        this.f11235k2 = -1;
        this.f11236l2 = -1;
        this.f11239o2 = -1;
        this.f11241q2 = new HashSet();
        this.f11242r2 = new ArrayList();
        this.f11243s2 = new ArrayList();
        this.f11244t2 = new ArrayList();
        this.f11245u2 = new ArrayList();
        this.f11246v2 = new ArrayList();
        this.A2 = false;
        this.J2 = 0;
        this.M2 = -4;
        P(t6.w0(t6.f21002h5, this.I0));
        this.L2 = this.G0;
        this.C2 = k2Var;
        this.f21584a = i11;
        this.Z1 = i10;
        b1();
        G1();
        if (i10 == 2) {
            this.A2 = true;
            G1();
            ConnectionsManager.getInstance(this.f21584a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new z(this, 0));
        } else if (i10 == 5) {
            this.A2 = true;
            G1();
            ConnectionsManager.getInstance(this.f21584a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new z(this, 2));
        }
        F1();
        if (i10 == 32 || q1()) {
            xz xzVar = new xz(getContext());
            this.H2 = xzVar;
            this.f21590c.addView(xzVar, b6.c(-1.0f, -1));
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35 || i10 == 31) {
            ((ViewGroup) this.f11247w2.getParent()).removeView(this.f11247w2);
            bi.t0 t0Var = this.D2;
            if (t0Var != null) {
                ((ViewGroup) t0Var.getParent()).removeView(this.D2);
            }
            this.f26724k1.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.f11248x2 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setText(this.f11247w2.getTextView().getText());
            a7.V(textView, t6.Gi, p6Var);
            textView.setOnClickListener(new y(this, 0));
            int L = org.telegram.messenger.i0.L(8.0f);
            int i12 = t6.Ci;
            int w02 = t6.w0(i12, p6Var);
            int i13 = t6.f20930d6;
            int o10 = i0.b.o(t6.w0(i13, p6Var), 120);
            org.telegram.ui.Cells.y k02 = t6.k0(L, L, L, L, w02, o10, o10);
            w6 N = a7.N(i12);
            w6 h = a7.h(i13, 120);
            textView.setBackground(k02);
            a7.k(textView, k02, N, h, p6Var);
        }
        if (i10 == 32) {
            ((ViewGroup) this.f11247w2.getParent()).removeView(this.f11247w2);
            vh.d dVar = new vh.d(context, p6Var, true);
            this.K2 = dVar;
            dVar.k();
            dVar.i(dd.L0(2131753625, null), false, true);
            dVar.setOnClickListener(new y(this, 1));
            this.f21587b.addView(dVar, b6.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.f21587b.post(new a0(this, 3));
        }
        if (i10 != 19 && i10 != 18) {
            return;
        }
        this.f21587b.post(new a0(this, 4));
    }

    public static androidx.emoji2.text.p o1(int i10, int i11) {
        ?? obj = new Object();
        obj.f1401a = 0;
        obj.d = null;
        obj.e = null;
        obj.f1404f = null;
        obj.f1402b = 0;
        obj.f1403c = 0;
        if (i10 == 0) {
            obj.f1402b = wp.r1(i11).Q4;
            obj.f1403c = wp.r1(i11).R4;
            obj.f1401a = 2131232200;
            obj.d = dd.a0("LimitReachedPinDialogs", null, 2131748964, Integer.valueOf(obj.f1402b), Integer.valueOf(obj.f1403c));
            obj.e = dd.a0("LimitReachedPinDialogsPremium", null, 2131748962, Integer.valueOf(obj.f1403c));
            obj.f1404f = dd.a0("LimitReachedPinDialogsLocked", null, 2131748963, Integer.valueOf(obj.f1402b));
            return obj;
        } else if (i10 == 33) {
            obj.f1402b = wp.r1(i11).f19198n6;
            obj.f1403c = wp.r1(i11).f19207o6;
            obj.f1401a = 2131232200;
            obj.d = dd.a0(null, null, 2131748961, Integer.valueOf(obj.f1402b), Integer.valueOf(obj.f1403c));
            obj.e = dd.a0(null, null, 2131748959, Integer.valueOf(obj.f1403c));
            obj.f1404f = dd.a0(null, null, 2131748960, Integer.valueOf(obj.f1402b));
            return obj;
        } else if (i10 == 2) {
            obj.f1402b = wp.r1(i11).S4;
            obj.f1403c = wp.r1(i11).T4;
            obj.f1401a = 2131232199;
            obj.d = dd.a0("LimitReachedPublicLinks", null, 2131748957, Integer.valueOf(obj.f1402b), Integer.valueOf(obj.f1403c));
            obj.e = dd.a0("LimitReachedPublicLinksPremium", null, 2131748955, Integer.valueOf(obj.f1403c));
            obj.f1404f = dd.a0("LimitReachedPublicLinksLocked", null, 2131748956, Integer.valueOf(obj.f1402b));
            return obj;
        } else if (i10 == 12) {
            obj.f1402b = wp.r1(i11).f19299y6;
            obj.f1403c = wp.r1(i11).f19308z6;
            obj.f1401a = 2131232199;
            obj.d = dd.a0("LimitReachedFolderLinks", null, 2131748970, Integer.valueOf(obj.f1402b), Integer.valueOf(obj.f1403c));
            obj.e = dd.a0("LimitReachedFolderLinksPremium", null, 2131748968, Integer.valueOf(obj.f1403c));
            obj.f1404f = dd.a0("LimitReachedFolderLinksLocked", null, 2131748969, Integer.valueOf(obj.f1402b));
            return obj;
        } else if (i10 == 13) {
            obj.f1402b = wp.r1(i11).A6;
            obj.f1403c = wp.r1(i11).B6;
            obj.f1401a = 2131232197;
            obj.d = dd.a0("LimitReachedSharedFolders", null, 2131748953, Integer.valueOf(obj.f1402b), Integer.valueOf(obj.f1403c));
            obj.e = dd.a0("LimitReachedSharedFoldersPremium", null, 2131748951, Integer.valueOf(obj.f1403c));
            obj.f1404f = dd.a0("LimitReachedSharedFoldersLocked", null, 2131748952, Integer.valueOf(obj.f1402b));
            return obj;
        } else if (i10 == 3) {
            obj.f1402b = wp.r1(i11).M4;
            obj.f1403c = wp.r1(i11).N4;
            obj.f1401a = 2131232197;
            obj.d = dd.a0("LimitReachedFolders", null, 2131748967, Integer.valueOf(obj.f1402b), Integer.valueOf(obj.f1403c));
            obj.e = dd.a0("LimitReachedFoldersPremium", null, 2131748965, Integer.valueOf(obj.f1403c));
            obj.f1404f = dd.a0("LimitReachedFoldersLocked", null, 2131748966, Integer.valueOf(obj.f1402b));
            return obj;
        } else if (i10 == 4) {
            obj.f1402b = wp.r1(i11).O4;
            obj.f1403c = wp.r1(i11).P4;
            obj.f1401a = 2131232196;
            obj.d = dd.a0("LimitReachedChatInFolders", null, 2131748985, Integer.valueOf(obj.f1402b), Integer.valueOf(obj.f1403c));
            obj.e = dd.a0("LimitReachedChatInFoldersPremium", null, 2131748983, Integer.valueOf(obj.f1403c));
            obj.f1404f = dd.a0("LimitReachedChatInFoldersLocked", null, 2131748984, Integer.valueOf(obj.f1402b));
            return obj;
        } else if (i10 == 5) {
            obj.f1402b = wp.r1(i11).E4;
            obj.f1403c = wp.r1(i11).F4;
            obj.f1401a = 2131232198;
            obj.d = dd.a0("LimitReachedCommunities", null, 2131748982, Integer.valueOf(obj.f1402b), Integer.valueOf(obj.f1403c));
            obj.e = dd.a0("LimitReachedCommunitiesPremium", null, 2131748980, Integer.valueOf(obj.f1403c));
            obj.f1404f = dd.a0("LimitReachedCommunitiesLocked", null, 2131748981, Integer.valueOf(obj.f1402b));
            return obj;
        } else if (i10 == 6) {
            obj.f1402b = 100;
            obj.f1403c = 200;
            obj.f1401a = 2131232197;
            obj.d = dd.a0("LimitReachedFileSize", null, 2131748973, "2 GB", "4 GB");
            obj.e = dd.a0("LimitReachedFileSizePremium", null, 2131748971, "4 GB");
            obj.f1404f = dd.a0("LimitReachedFileSizeLocked", null, 2131748972, "2 GB");
            return obj;
        } else if (i10 == 7) {
            obj.f1402b = 3;
            obj.f1403c = 4;
            obj.f1401a = 2131232195;
            obj.d = dd.a0("LimitReachedAccounts", null, 2131748987, 3, Integer.valueOf(obj.f1403c));
            obj.e = dd.a0("LimitReachedAccountsPremium", null, 2131748986, Integer.valueOf(obj.f1403c));
            obj.f1404f = dd.a0("LimitReachedAccountsPremium", null, 2131748986, Integer.valueOf(obj.f1402b));
            return obj;
        } else if (i10 == 11) {
            obj.f1402b = 0;
            obj.f1403c = 0;
            obj.f1401a = 2131232199;
            obj.d = dd.a0("LimitReachedAccounts", null, 2131748987, 0, Integer.valueOf(obj.f1403c));
            obj.e = "";
            obj.f1404f = "";
            return obj;
        } else if (i10 == 14) {
            obj.f1402b = wp.r1(i11).f19163j5;
            obj.f1403c = wp.r1(i11).f19172k5;
            obj.f1401a = 2131232201;
            obj.d = dd.H(',', "LimitReachedStoriesCount2First", obj.f1402b) + "\n" + dd.H(',', "LimitReachedStoriesCount2Second", obj.f1403c);
            obj.e = dd.H(',', "LimitReachedStoriesCount2Premium", obj.f1403c);
            obj.f1404f = dd.H(',', "LimitReachedStoriesCount2Premium", obj.f1402b);
            return obj;
        } else if (i10 == 15) {
            obj.f1402b = wp.r1(i11).f19179l5;
            obj.f1403c = wp.r1(i11).f19187m5;
            obj.f1401a = 2131232201;
            obj.d = dd.a0("LimitReachedStoriesWeekly", null, 2131748939, Integer.valueOf(obj.f1402b), Integer.valueOf(obj.f1403c));
            obj.e = dd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748938, Integer.valueOf(obj.f1403c));
            obj.f1404f = dd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748938, Integer.valueOf(obj.f1402b));
            return obj;
        } else if (i10 == 16) {
            obj.f1402b = wp.r1(i11).f19197n5;
            obj.f1403c = wp.r1(i11).f19206o5;
            obj.f1401a = 2131232201;
            obj.d = dd.a0("LimitReachedStoriesMonthly", null, 2131748941, Integer.valueOf(obj.f1402b), Integer.valueOf(obj.f1403c));
            obj.e = dd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748940, Integer.valueOf(obj.f1403c));
            obj.f1404f = dd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748940, Integer.valueOf(obj.f1402b));
            return obj;
        } else if (i10 != 18 && i10 != 32 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 25 && i10 != 30 && i10 != 35 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 19 && i10 != 21 && i10 != 26) {
            return obj;
        } else {
            obj.f1402b = wp.r1(i11).f19197n5;
            obj.f1403c = wp.r1(i11).f19206o5;
            obj.f1401a = 2131231127;
            obj.d = dd.a0("LimitReachedStoriesMonthly", null, 2131748941, Integer.valueOf(obj.f1402b), Integer.valueOf(obj.f1403c));
            obj.e = dd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748940, Integer.valueOf(obj.f1403c));
            obj.f1404f = dd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748940, Integer.valueOf(obj.f1402b));
            return obj;
        }
    }

    public static boolean p1(int i10) {
        if (i10 != 0 && i10 != 33 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 12 && i10 != 13 && i10 != 14 && i10 != 15 && i10 != 16) {
            return false;
        }
        return true;
    }

    public static String u1(int i10) {
        switch (i10) {
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

    public static void w1(org.telegram.ui.ActionBar.k2 k2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, h3 h3Var, long j10, boolean z10) {
        if (tL_premium_boostsStatus != null && h3Var != null && k2Var.getContext() != null) {
            q0 q0Var = new q0(32, k2Var.getCurrentAccount(), k2Var.getContext(), k2Var, k2Var.getResourceProvider());
            q0Var.A1(h3Var);
            q0Var.z1(tL_premium_boostsStatus, true);
            q0Var.B1(j10);
            if (z10) {
                k2Var.showDialog(q0Var);
            } else {
                q0Var.show();
            }
        }
    }

    public final void A1(h3 h3Var) {
        this.U1 = h3Var;
        E1();
        F1();
    }

    public final void B1(long j10) {
        this.S1 = j10;
        G1();
    }

    public final void C1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        boolean z10;
        this.G2 = chat;
        this.N2 = str;
        if (TextUtils.isEmpty(str) && !w3.y(3, chat)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.Q1 = z10;
        this.f11244t2 = new ArrayList(arrayList);
        this.f11245u2 = arrayList2;
        this.f11246v2 = arrayList3;
        HashSet hashSet = this.f11241q2;
        hashSet.clear();
        if (this.Q1) {
            ArrayList arrayList4 = this.f11244t2;
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.f19943id))) {
                    hashSet.add(user);
                }
            }
        }
        G1();
        E1();
        int i11 = this.Z1;
        if ((i11 == 11 || i11 == 34) && !wp.r1(this.f21584a).A3()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.f11244t2.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    e0 e0Var = this.f11247w2;
                    if (e0Var != null && e0Var.getParent() != null) {
                        ((ViewGroup) this.f11247w2.getParent()).removeView(this.f11247w2);
                    }
                    bi.t0 t0Var = this.D2;
                    if (t0Var != null && t0Var.getParent() != null) {
                        ((ViewGroup) this.D2.getParent()).removeView(this.D2);
                    }
                    uk0 uk0Var = this.f26724k1;
                    if (uk0Var != null) {
                        uk0Var.setPadding(0, 0, 0, 0);
                    }
                }
            }
        }
    }

    public final void D1() {
        int i10;
        int i11;
        int i12;
        int max;
        int i13;
        int i14;
        int i15;
        String str;
        int i16;
        String str2;
        this.f11237m2 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        if (tL_premium_boostsStatus != null) {
            i10 = tL_premium_boostsStatus.level + 1;
        } else {
            i10 = 1;
        }
        if (this.Z1 == 31) {
            i10 = 1;
        }
        wp r12 = wp.r1(this.f21584a);
        mp mpVar = r12.f19231r4;
        if (mpVar != null) {
            i11 = mpVar.e(r1());
        } else {
            i11 = 0;
        }
        int max2 = Math.max(10, i11);
        mp mpVar2 = r12.f19241s4;
        if (mpVar2 != null) {
            i12 = mpVar2.e(r1());
        } else {
            i12 = 0;
        }
        int max3 = Math.max(max2, i12);
        if (r1()) {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(max3, r12.B5), r12.f19307z5), r12.A5), r12.f19289x5), r12.f19279w5);
        } else {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max3, r12.f19232r5), r12.f19242s5), r12.f19251t5), r12.f19260u5), r12.f19269v5), r12.A4), r12.B4);
        }
        ArrayList arrayList = null;
        while (i10 <= max) {
            boolean r13 = r1();
            ArrayList arrayList2 = new ArrayList();
            wp r14 = wp.r1(this.f21584a);
            if (!r13 && i10 >= r14.B4) {
                arrayList2.add(l0.a(2131231818, 2131753660));
            }
            l0 b10 = l0.b(2131231815, i10, "BoostFeatureStoriesPerDay");
            b10.f11168f = true;
            arrayList2.add(b10);
            if (!r13) {
                l0 b11 = l0.b(2131231810, i10, "BoostFeatureCustomReaction");
                b11.f11168f = true;
                arrayList2.add(b11);
            }
            mp mpVar3 = r14.f19231r4;
            if (mpVar3 != null) {
                i13 = mpVar3.a(i10, false);
            } else {
                i13 = 0;
            }
            mp mpVar4 = r14.f19241s4;
            if (mpVar4 != null) {
                i14 = mpVar4.a(i10, r13);
            } else {
                i14 = 0;
            }
            if (!r13 && i13 > 0) {
                arrayList2.add(l0.b(2131231796, 7, "BoostFeatureNameColor"));
            }
            if (!r13 && i13 > 0) {
                arrayList2.add(l0.b(2131231804, i13, "BoostFeatureReplyColor"));
            }
            if (!r13 && i10 >= r14.f19232r5) {
                arrayList2.add(l0.a(2131231805, 2131753633));
            }
            if (i14 > 0) {
                if (r13) {
                    str2 = "BoostFeatureProfileColorGroup";
                } else {
                    str2 = "BoostFeatureProfileColor";
                }
                arrayList2.add(l0.b(2131231797, i14, str2));
            }
            if (r13 && i10 >= r14.f19298y5) {
                arrayList2.add(l0.a(2131231807, 2131753651));
            }
            if ((!r13 && i10 >= r14.f19242s5) || (r13 && i10 >= r14.f19279w5)) {
                if (r13) {
                    i16 = 2131753637;
                } else {
                    i16 = 2131753638;
                }
                arrayList2.add(l0.a(2131231798, i16));
            }
            if (r13 && i10 >= r14.B5) {
                arrayList2.add(l0.a(2131231821, 2131753628));
            }
            if ((!r13 && i10 >= r14.f19251t5) || (r13 && i10 >= r14.f19289x5)) {
                arrayList2.add(new l0(2131231814, 2131753647, -1, "1000+", null));
            }
            if ((!r13 && i10 >= r14.f19260u5) || (r13 && i10 >= r14.f19307z5)) {
                if (r13) {
                    str = "BoostFeatureBackgroundGroup";
                } else {
                    str = "BoostFeatureBackground";
                }
                arrayList2.add(l0.b(2131231822, 8, str));
            }
            if ((!r13 && i10 >= r14.f19269v5) || (r13 && i10 >= r14.A5)) {
                if (r13) {
                    i15 = 2131753652;
                } else {
                    i15 = 2131753653;
                }
                arrayList2.add(l0.a(2131231800, i15));
            }
            if (!r13 && i10 >= r14.A4) {
                arrayList2.add(l0.a(2131231806, 2131753629));
            }
            Collections.reverse(arrayList2);
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    l0 l0Var = (l0) arrayList.get(i17);
                    l0 l0Var2 = (l0) arrayList2.get(i17);
                    int i18 = l0Var.e;
                    if (l0Var2 != null && ((l0Var.f11168f && i18 > 2) || (l0Var.f11165a == l0Var2.f11165a && l0Var.f11166b == l0Var2.f11166b && TextUtils.equals(l0Var.f11167c, l0Var2.f11167c) && TextUtils.equals(l0Var.d, l0Var2.d) && i18 == l0Var2.e))) {
                    }
                }
                i10++;
            }
            ArrayList arrayList3 = this.f11237m2;
            arrayList3.add(new k0(i10, arrayList3.isEmpty()));
            this.f11237m2.addAll(arrayList2);
            arrayList = arrayList2;
            i10++;
        }
    }

    public final void E1() {
        int i10;
        String str = null;
        if (this.f11226b2) {
            this.f11247w2.c(dd.L0(2131749140, null), false, false);
            return;
        }
        int i11 = this.Z1;
        if (i11 != 19 && i11 != 32 && !s1()) {
            HashSet hashSet = this.f11241q2;
            if (i11 != 11 && i11 != 34) {
                if (hashSet.size() > 0) {
                    if (i11 == 2) {
                        str = dd.G(hashSet.size(), "RevokeLinks", new Object[0]);
                    } else if (i11 == 5) {
                        str = dd.G(hashSet.size(), "LeaveCommunities", new Object[0]);
                    }
                    this.f11247w2.c(str, true, true);
                    return;
                }
                e0 e0Var = this.f11247w2;
                e0Var.f11330r = false;
                e0Var.d(true);
                return;
            }
            e0 e0Var2 = this.f11247w2;
            if (e0Var2.I == null) {
                lq lqVar = new lq(e0Var2.getContext(), null);
                e0Var2.I = lqVar;
                lqVar.setGravity(3);
                lq lqVar2 = e0Var2.I;
                int i12 = t6.Ci;
                int i13 = t6.Gi;
                kq kqVar = lqVar2.f28240a;
                kqVar.v = i12;
                kqVar.f27938w = i13;
                kqVar.f27921b = 0.8f;
                e0Var2.setClipChildren(false);
                e0Var2.addView(e0Var2.I, b6.e(-1, 24, 16));
            }
            if (!this.Q1) {
                this.f11247w2.c(dd.L0(2131752041, null), true, true);
            } else if (hashSet.size() > 0) {
                this.f11247w2.c(dd.L0(2131745636, null), true, true);
            } else {
                this.f11247w2.c(dd.L0(2131754557, null), true, true);
            }
            this.f11247w2.I.f28240a.c(hashSet.size(), true);
            this.f11247w2.invalidate();
            return;
        }
        h3 h3Var = this.U1;
        boolean z10 = h3Var.f16005a;
        if ((z10 || h3Var.f16006b) && !h3Var.f16013l && !h3Var.d) {
            if (h3Var.f16014m) {
                this.f11247w2.c(dd.L0(2131747847, null), true, true);
                return;
            }
            e0 e0Var3 = this.f11247w2;
            e0Var3.f11330r = false;
            e0Var3.d(true);
            return;
        }
        vh.d dVar = this.K2;
        if (z10) {
            if (mg.k0.i()) {
                this.f11247w2.c(dd.L0(2131753591, null), true, true);
            } else {
                e0 e0Var4 = this.f11247w2;
                if (r1()) {
                    i10 = 2131753625;
                } else {
                    i10 = 2131753663;
                }
                e0Var4.c(dd.L0(i10, null), true, true);
            }
            this.f11249y2.i(dd.L0(2131753664, null), true, true);
            if (dVar != null) {
                dVar.i(dd.L0(2131753625, null), true, true);
            }
        } else if (h3Var.f16014m) {
            this.f11249y2.i(dd.L0(2131747847, null), true, true);
            if (dVar != null) {
                dVar.i(dd.L0(2131747847, null), true, true);
            }
            this.f11247w2.c(dd.L0(2131747847, null), true, true);
        } else if (mg.k0.i()) {
            if (dVar != null) {
                dVar.i(dd.L0(2131753625, null), true, true);
            }
            this.f11249y2.i(dd.L0(2131753664, null), true, true);
            this.f11247w2.c(dd.L0(2131753591, null), true, true);
        } else {
            if (dVar != null) {
                dVar.i(dd.L0(2131747847, null), true, true);
            }
            this.f11249y2.i(dd.L0(2131747847, null), true, true);
            this.f11247w2.c(dd.L0(2131747847, null), true, true);
        }
    }

    public final void F1() {
        String L0;
        if (this.f11226b2) {
            this.f11247w2.c(dd.L0(2131749140, null), false, false);
            return;
        }
        int i10 = this.Z1;
        if (i10 != 19 && i10 != 32 && !s1()) {
            if (i10 != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
                if (!e20.i(this.f21584a).q() && !wp.r1(this.f21584a).A3() && !this.F2) {
                    this.f11247w2.f11328f.setText(dd.L0(2131749208, null));
                    androidx.emoji2.text.p pVar = this.E2;
                    if (pVar != null) {
                        int i11 = pVar.f1402b;
                        int i12 = i11 + 1;
                        int i13 = pVar.f1403c;
                        if (i12 == i13) {
                            this.f11247w2.setIcon(2131623936);
                            return;
                        }
                        if (i11 != 0 && i13 != 0) {
                            float f7 = i13 / i11;
                            if (f7 >= 1.6f && f7 <= 2.5f) {
                                this.f11247w2.setIcon(2131624001);
                                return;
                            }
                        }
                        e0 e0Var = this.f11247w2;
                        e0Var.D.f31503p = null;
                        e0Var.F.setVisibility(8);
                        return;
                    }
                    e0 e0Var2 = this.f11247w2;
                    e0Var2.D.f31503p = null;
                    e0Var2.F.setVisibility(8);
                    return;
                }
                this.f11247w2.f11328f.setText(dd.L0(2131747847, null));
                e0 e0Var3 = this.f11247w2;
                e0Var3.D.f31503p = null;
                e0Var3.F.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new dq(2131232103, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) dd.L0(2131751762, null));
            this.f11247w2.f11328f.setText(spannableStringBuilder);
            return;
        }
        int i14 = 2131753663;
        if (mg.k0.i()) {
            w0 w0Var = this.f11247w2.f11328f;
            h3 h3Var = this.U1;
            if (h3Var != null && h3Var.d) {
                L0 = dd.L0(2131753591, null);
            } else {
                if (r1()) {
                    i14 = 2131753625;
                }
                L0 = dd.L0(i14, null);
            }
            w0Var.setText(L0);
            h3 h3Var2 = this.U1;
            if (h3Var2 != null && h3Var2.f16014m) {
                this.f11247w2.f11328f.setText(dd.L0(2131747847, null));
                return;
            }
            return;
        }
        w0 w0Var2 = this.f11247w2.f11328f;
        if (r1()) {
            i14 = 2131753625;
        }
        w0Var2.setText(dd.L0(i14, null));
    }

    public final void G1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.f11229e2 = -1;
        this.f11231g2 = -1;
        this.f11232h2 = -1;
        this.f11233i2 = -1;
        this.R1 = -1;
        this.f11234j2 = -1;
        this.f11236l2 = -1;
        this.f11227c2 = 1;
        this.f11228d2 = 0;
        int i10 = this.Z1;
        if (i10 != 19 && i10 != 18 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 22 && i10 != 23 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 21 && i10 != 30 && i10 != 35) {
            if (i10 != 31 && i10 != 32) {
                if (!p1(i10)) {
                    if (i10 != 11 && i10 != 34) {
                        int i11 = this.f11227c2;
                        this.f11229e2 = i11;
                        this.f11227c2 = i11 + 2;
                        this.f11230f2 = i11 + 1;
                    } else {
                        this.f26730r1 = 0.24f;
                    }
                    if (this.A2) {
                        int i12 = this.f11227c2;
                        this.f11227c2 = i12 + 1;
                        this.f11233i2 = i12;
                    } else if (i10 != 11 || this.Q1) {
                        if (i10 != 11 || wp.r1(this.f21584a).A3() || ((((arrayList = this.f11246v2) == null || arrayList.isEmpty()) && ((arrayList2 = this.f11245u2) == null || arrayList2.size() < this.f11244t2.size())) || (arrayList3 = this.f11246v2) == null || arrayList3.size() != 1 || (arrayList4 = this.f11245u2) == null || arrayList4.size() != 1 || !this.Q1)) {
                            int i13 = this.f11227c2;
                            this.f11231g2 = i13;
                            if (i10 != 11 && i10 != 34) {
                                if (i10 == 5) {
                                    this.f11227c2 = this.f11242r2.size() + i13;
                                } else {
                                    this.f11227c2 = this.a2.size() + i13;
                                }
                            } else {
                                this.f11227c2 = this.f11244t2.size() + i13;
                            }
                            this.f11232h2 = this.f11227c2;
                        }
                        if (this.f11232h2 - this.f11231g2 > 1) {
                            int i14 = this.f11227c2;
                            this.f11227c2 = i14 + 1;
                            this.f11234j2 = i14;
                        }
                    }
                }
            } else {
                this.f26730r1 = 0.24f;
                D1();
                int i15 = this.f11227c2;
                this.f11231g2 = i15;
                int i16 = i15 + 1;
                this.f11227c2 = i16;
                this.f11236l2 = i15;
                int size = (this.f11237m2.size() - 1) + i16;
                this.f11227c2 = size;
                this.f11232h2 = size;
            }
        } else {
            if (i10 != 19 || w3.N(n1())) {
                this.f26730r1 = 0.24f;
                int i17 = this.f11227c2;
                this.f11227c2 = i17 + 1;
                this.R1 = i17;
                if (wp.r1(this.f21584a).f19222q4) {
                    int i18 = this.f11227c2;
                    this.f11227c2 = i18 + 1;
                    this.f11235k2 = i18;
                }
            }
            D1();
            int i19 = this.f11227c2;
            int i20 = i19 + 1;
            this.f11227c2 = i20;
            this.f11236l2 = i19;
            this.f11227c2 = (this.f11237m2.size() - 1) + i20;
        }
        this.f26724k1.getAdapter().f();
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        return new j0(this);
    }

    @Override
    public final CharSequence O0() {
        int i10 = this.Z1;
        if (i10 != 11) {
            if (i10 != 34) {
                if (i10 != 35) {
                    int i11 = 2131753625;
                    switch (i10) {
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
                            return dd.L0(2131743899, null);
                        case 19:
                        case 30:
                            if (!r1()) {
                                i11 = 2131753663;
                            }
                            return dd.L0(i11, null);
                        case 31:
                            return dd.L0(2131753600, null);
                        case 32:
                            return dd.L0(2131753625, null);
                        default:
                            return dd.L0(2131748988, null);
                    }
                }
                return dd.L0(2131743899, null);
            }
            return dd.L0(2131752622, null);
        }
        return dd.L0(2131752401, null);
    }

    @Override
    public final void U0(vu0 vu0Var) {
        int i10;
        Context context = vu0Var.getContext();
        vh.d dVar = new vh.d(context, this.I0, true);
        this.f11249y2 = dVar;
        dVar.setFlickeringLoading(true);
        this.f11249y2.i(dd.L0(2131753664, null), false, true);
        this.f11249y2.setOnClickListener(new y(this, 2));
        e0 e0Var = new e0(this, context, this.I0);
        this.f11247w2 = e0Var;
        e6.b(e0Var, 0.02f, 1.2f);
        if (!this.f26728p1 && (i10 = this.Z1) != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
            bi.t0 t0Var = new bi.t0(this, context, 3);
            this.D2 = t0Var;
            a7.i(t6.f21002h5, t0Var, this.I0);
            vu0Var.addView(this.D2, b6.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        e0 e0Var2 = this.f11247w2;
        float f7 = (this.f21616t0 / org.telegram.messenger.i0.f16171p) + 16.0f;
        vu0Var.addView(e0Var2, b6.d(-1, 48.0f, 80, f7, 0.0f, f7, 12.0f));
        int L = org.telegram.messenger.i0.L(72.0f);
        uk0 uk0Var = this.f26724k1;
        uk0Var.setPadding(0, 0, 0, L);
        uk0Var.setClipToPadding(false);
        uk0Var.setClipChildren(false);
        uk0Var.setOnItemClickListener(new ag.y0(this, 6));
        uk0Var.setOnItemLongClickListener(new b0(this, 2));
        this.f11247w2.f11332w.setOnClickListener(new ag.t0(7, this, context));
        this.f11247w2.h.setOnClickListener(new y(this, 3));
        this.B2 = new xj0(uk0Var, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        TLRPC.ChatFull M0;
        org.telegram.ui.ActionBar.k2 k2Var;
        org.telegram.ui.ActionBar.k2 k2Var2;
        if (i10 == at.V2) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            org.telegram.ui.ActionBar.k2 k2Var3 = this.f26727o1;
            org.telegram.ui.ActionBar.k2 lastFragment = k2Var3.getParentLayout().getLastFragment();
            org.telegram.ui.ActionBar.k2 k2Var4 = null;
            if (lastFragment instanceof sg.o) {
                List fragmentStack = k2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    k2Var = (org.telegram.ui.ActionBar.k2) sc.e.g(2, fragmentStack);
                } else {
                    k2Var = null;
                }
                if (fragmentStack.size() >= 3) {
                    k2Var2 = (org.telegram.ui.ActionBar.k2) sc.e.g(3, fragmentStack);
                } else {
                    k2Var2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    k2Var4 = (org.telegram.ui.ActionBar.k2) sc.e.g(4, fragmentStack);
                }
                if (k2Var instanceof oo) {
                    ((ActionBarLayout) k2Var3.getParentLayout()).c0(k2Var, false);
                }
                dismiss();
                if (booleanValue) {
                    if (k2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) k2Var3.getParentLayout()).c0(k2Var2, false);
                    }
                    lastFragment.finishFragment();
                    mg.p.f(k2Var4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                mg.p.f(k2Var2, chat, false);
            } else if ((lastFragment instanceof un) && booleanValue) {
                mg.p.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof zc) && booleanValue) {
                List fragmentStack2 = k2Var3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    org.telegram.ui.ActionBar.k2 k2Var5 = (org.telegram.ui.ActionBar.k2) fragmentStack2.get(size);
                    if (!(k2Var5 instanceof un) && !(k2Var5 instanceof zx)) {
                        arrayList.add(k2Var5);
                    } else {
                        k2Var4 = k2Var5;
                        break;
                    }
                }
                if (k2Var4 != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList.get(i12);
                        i12++;
                        ((ActionBarLayout) k2Var3.getParentLayout()).c0((org.telegram.ui.ActionBar.k2) obj, false);
                    }
                    k2Var3.finishFragment();
                    dismiss();
                    mg.p.f(k2Var4, chat, true);
                }
            } else if (booleanValue) {
                o8 o8Var = o8.F2;
                if (o8Var != null && o8Var.d) {
                    un ma2 = un.ma(-chat.f19794id);
                    LaunchActivity.Q().presentFragment(ma2, false, false);
                    o8.w();
                    dismiss();
                    mg.p.f(ma2, chat, true);
                    return;
                }
                List fragmentStack3 = k2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack3.size() >= 2) {
                    k2Var4 = (org.telegram.ui.ActionBar.k2) sc.e.g(2, fragmentStack3);
                }
                k2Var3.finishFragment();
                dismiss();
                if (k2Var4 instanceof un) {
                    mg.p.f(k2Var4, chat, true);
                }
            } else {
                o8 o8Var2 = o8.F2;
                if (o8Var2 != null && o8Var2.d) {
                    un ma3 = un.ma(-chat.f19794id);
                    LaunchActivity.Q().presentFragment(ma3, false, false);
                    o8.w();
                    dismiss();
                    mg.p.f(ma3, chat, false);
                    return;
                }
                dismiss();
                mg.p.f(LaunchActivity.Q(), chat, false);
            }
        } else if (i10 == at.U2) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus != null && this.U1 != null) {
                this.T1.boosts += intValue;
                if (this.Z1 == 32 && (M0 = wp.r1(this.f21584a).M0(-this.S1)) != null) {
                    M0.boosts_applied += intValue;
                }
                t1();
                z1(tL_premium_boostsStatus, this.W1);
                h3 h3Var = this.U1;
                if (this.T1.next_level_boosts <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h3Var.f16014m = z10;
                h3Var.f16013l = true;
                h3Var.a(tL_premium_myBoosts);
                if (v1()) {
                    wb Q = new cc(this.f21590c, this.I0).Q(2131624049, 30, dd.G(intValue, "BoostingReassignedFromPlural", dd.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                    Q.f32201j = 4000;
                    Q.k(true);
                }
            }
        } else if (i10 == at.T2) {
            dismiss();
        }
    }

    public final void h1(final s80 s80Var, boolean z10) {
        if (s80Var.a() && !z10) {
            return;
        }
        s80Var.setLoading(true);
        wp.r1(this.f21584a).G0();
        mg.k0.a(-this.S1, Arrays.asList(Integer.valueOf(this.U1.f16009g)), new r20(this) {
            public final q0 f11016b;

            {
                this.f11016b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r3) {
                    case 0:
                        q0 q0Var = this.f11016b;
                        wp.r1(q0Var.f21584a).G0().a(q0Var.S1, new d0(q0Var, s80Var, (TL_stories.TL_premium_myBoosts) obj, 0));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        s80 s80Var2 = s80Var;
                        if (startsWith) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                org.telegram.messenger.i0.h3(new k2.u(5, this.f11016b, s80Var2), intValue * 1000);
                                return;
                            }
                            mg.p.g(intValue);
                        }
                        s80Var2.setLoading(false);
                        return;
                }
            }
        }, new r20(this) {
            public final q0 f11016b;

            {
                this.f11016b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r3) {
                    case 0:
                        q0 q0Var = this.f11016b;
                        wp.r1(q0Var.f21584a).G0().a(q0Var.S1, new d0(q0Var, s80Var, (TL_stories.TL_premium_myBoosts) obj, 0));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        s80 s80Var2 = s80Var;
                        if (startsWith) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                org.telegram.messenger.i0.h3(new k2.u(5, this.f11016b, s80Var2), intValue * 1000);
                                return;
                            }
                            mg.p.g(intValue);
                        }
                        s80Var2.setLoading(false);
                        return;
                }
            }
        });
    }

    public final void i1() {
        if (this.f11249y2.isAttachedToWindow()) {
            h1(this.f11249y2, false);
            return;
        }
        vh.d dVar = this.K2;
        if (dVar != null && dVar.isAttachedToWindow()) {
            h1(dVar, false);
        } else {
            h1(this.f11247w2, false);
        }
    }

    public int j1() {
        return 0;
    }

    public final String k1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.T1.boost_url;
        }
        int i10 = this.f21584a;
        long j10 = -this.S1;
        TLRPC.Chat L0 = wp.r1(i10).L0(Long.valueOf(j10));
        if (!TextUtils.isEmpty(w3.K(L0, false))) {
            return "https://t.me/boost/" + w3.K(L0, false);
        }
        return a1.g.l(j10, "https://t.me/boost/?c=");
    }

    public final String l1(boolean z10) {
        String str;
        boolean z11;
        int i10;
        int i11;
        String str2;
        if (this.Z1 == 32) {
            TLRPC.Chat n12 = n1();
            TLRPC.ChatFull M0 = wp.r1(this.f21584a).M0(-this.S1);
            int max = Math.max(M0.boosts_unrestrict - M0.boosts_applied, 0);
            if (n12 == null) {
                str2 = "";
            } else {
                str2 = n12.title;
            }
            return dd.G(max, "BoostingRemoveRestrictionsSubtitle", str2);
        }
        TLRPC.Chat L0 = wp.r1(this.f21584a).L0(Long.valueOf(-this.S1));
        if (L0 == null) {
            if (r1()) {
                i11 = 2131754876;
            } else {
                i11 = 2131754904;
            }
            str = dd.L0(i11, null);
        } else {
            str = L0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = 2131752352;
        if (s1() && this.T1.next_level_boosts != 0 && z10) {
            if (r1()) {
                i12 = 2131749429;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.T1;
            int i13 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return dd.a0(null, null, i12, str, dd.G(i13, "MoreBoosts", Integer.valueOf(i13)));
        }
        int i14 = 2131752449;
        if (z11 && this.U1.d) {
            if (this.T1.level == 1) {
                if (r1()) {
                    i10 = 2131749502;
                } else {
                    i10 = 2131752450;
                }
                return dd.a0(null, null, i10, new Object[0]);
            }
            if (r1()) {
                i14 = 2131749501;
            }
            return dd.a0(null, null, i14, Integer.valueOf(this.T1.level), dd.G(this.T1.level, "BoostStories", new Object[0]));
        } else if (this.U1.d) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.T1;
            if (tL_premium_boostsStatus3.level == 0) {
                if (r1()) {
                    i12 = 2131749429;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.T1;
                int i15 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return dd.a0(null, null, i12, str, dd.G(i15, "MoreBoosts", Integer.valueOf(i15)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (r1()) {
                    i14 = 2131749501;
                }
                return dd.a0(null, null, i14, Integer.valueOf(this.T1.level), dd.G(this.T1.level + 1, "BoostStories", new Object[0]));
            } else {
                if (r1()) {
                    i12 = 2131749429;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.T1;
                int i16 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return dd.a0(null, null, i12, str, dd.G(i16, "MoreBoosts", Integer.valueOf(i16)));
            }
        } else {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.T1;
            if (tL_premium_boostsStatus6.level == 0) {
                if (r1()) {
                    i12 = 2131749429;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.T1;
                int i17 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
                return dd.a0(null, null, i12, str, dd.G(i17, "MoreBoosts", Integer.valueOf(i17)));
            } else if (tL_premium_boostsStatus6.next_level_boosts == 0) {
                if (r1()) {
                    i14 = 2131749501;
                }
                return dd.a0(null, null, i14, Integer.valueOf(this.T1.level), dd.G(this.T1.level + 1, "BoostStories", new Object[0]));
            } else {
                if (r1()) {
                    i12 = 2131749429;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.T1;
                int i18 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
                return dd.a0(null, null, i12, str, dd.G(i18, "MoreBoosts", Integer.valueOf(i18)));
            }
        }
    }

    public final String m1() {
        int i10;
        int i11;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return dd.a0("BoostsMaxLevelReached", null, 2131753158, new Object[0]);
        }
        int i12 = 2131753663;
        if (tL_premium_boostsStatus.level > 0 && !this.U1.d) {
            if (r1()) {
                i12 = 2131753625;
            }
            return dd.L0(i12, null);
        }
        boolean z10 = this.W1;
        int i13 = this.Z1;
        if (z10) {
            if (i13 == 32) {
                if (r1()) {
                    i12 = 2131753625;
                }
                return dd.L0(i12, null);
            }
            TLRPC.Chat L0 = wp.r1(this.f21584a).L0(Long.valueOf(-this.S1));
            if (this.U1.d) {
                return dd.a0("YouBoostedChannel2", null, 2131742865, L0.title);
            }
            if (r1()) {
                i12 = 2131753625;
            }
            return dd.L0(i12, null);
        } else if (i13 == 32) {
            if (r1()) {
                i12 = 2131753625;
            }
            return dd.L0(i12, null);
        } else if (this.U1.d) {
            if (r1()) {
                i11 = 2131742864;
            } else {
                i11 = 2131742866;
            }
            return dd.L0(i11, null);
        } else {
            if (r1()) {
                i10 = 2131753527;
            } else {
                i10 = 2131753528;
            }
            return dd.L0(i10, null);
        }
    }

    public final TLRPC.Chat n1() {
        return wp.r1(this.f21584a).L0(Long.valueOf(-this.S1));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        at.f(this.f21584a).c(this, at.V2);
        at.f(this.f21584a).c(this, at.U2);
        at.f(this.f21584a).c(this, at.T2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        at.f(this.f21584a).n(this, at.V2);
        at.f(this.f21584a).n(this, at.U2);
        at.f(this.f21584a).n(this, at.T2);
    }

    public final boolean q1() {
        int i10 = this.Z1;
        if (i10 != 19 && i10 != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 27 && i10 != 28 && i10 != 23 && i10 != 30 && i10 != 35) {
            return false;
        }
        return true;
    }

    public final boolean r1() {
        return !w3.V(wp.r1(this.f21584a).L0(Long.valueOf(-this.S1)));
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.F0 < 0 && this.G0 == this.L2 && (w02 = t6.w0(t6.f21002h5, this.I0)) != this.G0) {
                this.G0 = w02;
                this.L2 = w02;
                E0(w02);
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final boolean s1() {
        if (q1() && w3.N(n1())) {
            return true;
        }
        return false;
    }

    public final void t1() {
        int i10;
        o0 o0Var = this.f11240p2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        int i11 = tL_premium_boostsStatus.boosts;
        int i12 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        o0Var.f24100b++;
        o0Var.f24098a = w7.u.a((i11 - i10) / i12, 0.0f, 1.0f);
        o0Var.W = true;
        o0Var.f24099a0 = o0Var.f24114n;
        o0Var.i(i11, true);
        o0Var.I.requestLayout();
        o0Var.requestLayout();
    }

    public final boolean v1() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        at f7 = at.f(this.f21584a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        h3 h3Var = this.U1;
        h3Var.getClass();
        h3 h3Var2 = new h3();
        h3Var2.f16005a = h3Var.f16005a;
        h3Var2.f16006b = h3Var.f16006b;
        h3Var2.f16007c = h3Var.f16007c;
        h3Var2.d = h3Var.d;
        h3Var2.e = h3Var.e;
        h3Var2.f16009g = h3Var.f16009g;
        h3Var2.h = h3Var.h;
        h3Var2.f16010i = h3Var.f16010i;
        h3Var2.f16011j = h3Var.f16011j;
        h3Var2.f16012k = h3Var.f16012k;
        h3Var2.f16014m = h3Var.f16014m;
        f7.m(at.f14764p3, tL_premium_boostsStatus, h3Var2, Long.valueOf(this.S1));
        vh.d dVar = this.K2;
        if (dVar != null) {
            TLRPC.ChatFull M0 = wp.r1(this.f21584a).M0(-this.S1);
            int max = Math.max(M0.boosts_unrestrict - M0.boosts_applied, 0);
            if (max == 0) {
                at.f(this.f21584a).m(at.f14758o3, new Object[0]);
                dismiss();
                return false;
            }
            dVar.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new g0(0));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.V1, transitionSet);
        p0 p0Var = this.V1;
        mg.b bVar = p0Var.f11216c;
        int indexOfChild = p0Var.indexOfChild(p0Var.f11215b);
        q0 q0Var = p0Var.e;
        if (q0Var.W1) {
            int indexOfChild2 = p0Var.indexOfChild(p0Var.d);
            p0Var.removeView(p0Var.d);
            p0Var.d.removeView(p0Var.f11214a);
            p0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(p0Var.getContext());
            p0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            p0Var.d.setWeightSum(1.0f);
            p0Var.d.addView(p0Var.f11214a, b6.p(-2, -2, 1.0f, 0));
            p0Var.d.addView(bVar, b6.t(-2, -2, 48, 0, 2, 0, 0));
            p0Var.addView(p0Var.d, indexOfChild2, b6.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = p0Var.indexOfChild(p0Var.f11214a);
            p0Var.removeView(p0Var.f11214a);
            TextView textView = new TextView(p0Var.getContext());
            p0Var.f11214a = textView;
            textView.setTypeface(org.telegram.messenger.i0.o());
            p0Var.f11214a.setTextSize(1, 20.0f);
            a7.V(p0Var.f11214a, t6.G6, q0Var.I0);
            p0Var.f11214a.setGravity(17);
            p0Var.addView(p0Var.f11214a, indexOfChild3, b6.t(-2, -2, 1, 0, 22, 0, 0));
        }
        p0Var.removeView(p0Var.f11215b);
        TextView textView2 = new TextView(p0Var.getContext());
        p0Var.f11215b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = p0Var.f11215b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), p0Var.f11215b.getLineSpacingMultiplier() * 1.1f);
        p0Var.f11215b.setGravity(1);
        a7.V(p0Var.f11215b, t6.G6, q0Var.I0);
        p0Var.addView(p0Var.f11215b, indexOfChild, b6.t(-2, -2, 1, 24, -2, 24, 17));
        this.V1.f11214a.setText(m1());
        TextView textView4 = this.V1.f11215b;
        wp r12 = wp.r1(this.f21584a);
        boolean r13 = r1();
        int i23 = this.Z1;
        String str = null;
        if (i23 == 20) {
            if (r13) {
                i22 = 2131749427;
            } else {
                i22 = 2131752349;
            }
            str = dd.a0(null, null, i22, Integer.valueOf(j1()));
        } else if (i23 == 24) {
            if (r13) {
                i21 = 2131749423;
            } else {
                i21 = 2131752346;
            }
            str = dd.a0(null, null, i21, Integer.valueOf(j1()));
        } else if (i23 == 29) {
            str = dd.a0(null, null, 2131749426, Integer.valueOf(r12.f19298y5));
        } else if (i23 == 30) {
            str = dd.a0(null, null, 2131752343, Integer.valueOf(r12.A4));
        } else if (i23 == 35) {
            str = dd.a0(null, null, 2131752350, Integer.valueOf(r12.B4));
        } else if (i23 == 25) {
            if (r13) {
                i19 = 2131749424;
            } else {
                i19 = 2131752347;
            }
            if (r13) {
                i20 = r12.f19289x5;
            } else {
                i20 = r12.f19251t5;
            }
            str = dd.a0(null, null, i19, Integer.valueOf(i20));
        } else if (i23 == 26) {
            if (r13) {
                i17 = 2131749419;
            } else {
                i17 = 2131752341;
            }
            if (r13) {
                i18 = r12.f19289x5;
            } else {
                i18 = r12.f19251t5;
            }
            str = dd.a0(null, null, i17, Integer.valueOf(i18));
        } else if (i23 == 27) {
            if (r13) {
                i16 = 2131749421;
            } else {
                i16 = 2131752344;
            }
            str = dd.a0(null, null, i16, Integer.valueOf(r12.f19232r5));
        } else if (i23 == 28) {
            if (r13) {
                i14 = 2131749422;
            } else {
                i14 = 2131752345;
            }
            if (r13) {
                i15 = r12.f19279w5;
            } else {
                i15 = r12.f19242s5;
            }
            str = dd.a0(null, null, i14, Integer.valueOf(i15));
        } else if (i23 == 22) {
            if (r13) {
                i12 = 2131749420;
            } else {
                i12 = 2131752342;
            }
            if (r13) {
                i13 = r12.f19307z5;
            } else {
                i13 = r12.f19260u5;
            }
            str = dd.a0(null, null, i12, Integer.valueOf(i13));
        } else if (i23 == 23) {
            if (r13) {
                i10 = 2131749425;
            } else {
                i10 = 2131752348;
            }
            if (r13) {
                i11 = r12.A5;
            } else {
                i11 = r12.f19269v5;
            }
            str = dd.a0(null, null, i10, Integer.valueOf(i11));
        }
        if (str == null) {
            str = l1(false);
        }
        textView4.setText(org.telegram.messenger.i0.W2(str));
        E1();
        xz xzVar = this.H2;
        xzVar.c(false);
        try {
            xzVar.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.V1.f11216c.a(this.U1.f16010i, true);
        this.f26724k1.y0(0);
        if (i23 == 32) {
            this.V1.f11216c.setVisibility(8);
        }
        return true;
    }

    public final void x1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        String G = dd.G(arrayList.size(), "RevokeLinks", new Object[0]);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.f11238n2) {
                x1Var.T = org.telegram.messenger.i0.W2(dd.a0("RevokeLinkAlertChannel", null, 2131746038, wp.r1(this.f21584a).U2 + "/" + w3.K(chat, false), chat.title));
            } else {
                x1Var.T = org.telegram.messenger.i0.W2(dd.a0("RevokeLinkAlert", null, 2131746039, wp.r1(this.f21584a).U2 + "/" + w3.K(chat, false), chat.title));
            }
        } else if (this.f11238n2) {
            x1Var.T = org.telegram.messenger.i0.W2(dd.a0("RevokeLinksAlertChannel", null, 2131746035, new Object[0]));
        } else {
            x1Var.T = org.telegram.messenger.i0.W2(dd.a0("RevokeLinksAlert", null, 2131746036, new Object[0]));
        }
        alertDialog$Builder.h(dd.L0(2131752589, null), null);
        alertDialog$Builder.k(dd.L0(2131746041, null), new ag.m(16, this, arrayList));
        x1Var.show();
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            a7.V(textView, t6.f21171q7, this.I0);
        }
    }

    public final void y1(HashMap hashMap) {
        String str;
        long longValue;
        ArrayList arrayList;
        HashMap hashMap2 = hashMap;
        if (!TextUtils.isEmpty(this.N2)) {
            str = this.N2;
        } else {
            TLRPC.ChatFull M0 = wp.r1(this.f21584a).M0(this.G2.f19794id);
            if (M0 == null) {
                dismiss();
                return;
            } else if (this.G2.username != null) {
                str = "@" + this.G2.username;
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
        HashSet hashSet = this.f11241q2;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long M1 = wp.r1(this.f21584a).M1(user.f19943id);
            if (M1 <= 0) {
                M1 = o5.k(wp.r1(this.f21584a).H2(user.f19943id));
            }
            if (M1 >= 0) {
                arrayList = arrayList2;
            } else {
                arrayList = arrayList3;
            }
            arrayList.add(user);
        }
        int i10 = 0;
        boolean z10 = true;
        if (hashMap2 == null && !arrayList2.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                arrayList4.add(Long.valueOf(((TLRPC.User) obj).f19943id));
            }
            s4.b0(this.f21584a, arrayList4, 1, new ag.l(this, 15));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            if (hashMap2 == null) {
                longValue = 0;
            } else {
                longValue = ((Long) hashMap2.get(Long.valueOf(user2.f19943id))).longValue();
            }
            boolean z12 = z10;
            Iterator it3 = it2;
            pz b10 = pz.b(str2, user2.f19943id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b10.Q = longValue;
            rz.C(this.f21584a).r0(b10);
            if (b10.Q > 0) {
                z11 = z12;
            }
            hashMap2 = hashMap;
            z10 = z12;
            it2 = it3;
        }
        if (!z11) {
            org.telegram.messenger.i0.g3(new a0(this, 2));
        }
        dismiss();
    }

    public final void z1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.T1 = tL_premium_boostsStatus;
        this.W1 = z10;
        G1();
    }
}
