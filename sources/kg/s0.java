package kg;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.v2;
import c8.na;
import hi.c7;
import hi.c8;
import hi.y7;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.LaunchActivity;
public final class s0 extends g2 {
    public static final int V = -1;
    public static final int W = -2;
    public static final int X = -3;
    public static final int Y = -4;
    public static final int Z = -5;
    public static final int f18539a0 = -6;
    public static final int f18540b0 = -7;
    public static final int f18541c0 = -8;
    public static final int f18542d0 = -9;
    public static final int f18543e0 = -10;
    public static final int f18544f0 = -11;
    public static final int f18545g0 = -12;
    public static final int f18546h0 = -13;
    public static final int f18547i0 = -14;
    public static final int f18548j0 = -15;
    public static final int f18549k0 = -16;
    public static final int f18550l0 = -17;
    public static final int m0 = -18;
    public static final int f18551n0 = -19;
    public static final int f18552o0 = -20;
    public static final int f18553p0 = -21;
    public String E;
    public int F;
    public final m0 G;
    public TL_account.connectedBots H;
    public TL_account.TL_connectedBot I;
    public boolean J;
    public TL_account.TL_businessBotRights K;
    public boolean L;
    public boolean M;
    public TLRPC.User N;
    public final LongSparseArray O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public c5 f18554a;
    public c8 f18555b;
    public g51 f18556c;
    public jg.z1 d;
    public FrameLayout f18557e;
    public EditTextBoldCursor f18558f;
    public View h;
    public v2 f18559n;
    public TextView f18560r;
    public ImageView f18561s;
    public b0 f18562w;
    public boolean f18563x;
    public boolean f18564y;

    public s0() {
        super(null);
        this.F = 0;
        this.G = new m0(this, 4);
        this.K = TL_account.TL_businessBotRights.makeDefault();
        this.N = null;
        this.O = new LongSparseArray();
        this.P = -4;
        this.Q = true;
        this.R = false;
        this.S = false;
    }

    public static void Z(s0 s0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        g2 T;
        if (tL_error != null) {
            s0Var.f18554a.b(false);
            kc.e0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            s0Var.f18554a.b(false);
            f3.o(null, 2131743632, kc.b0(s0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.d.c(new ji.f(5, s0Var, tLObject));
            }
            int i7 = iArr[0] + 1;
            iArr[0] = i7;
            if (i7 == arrayList.size()) {
                f.a(s0Var.currentAccount).b();
                mp messagesController = s0Var.getMessagesController();
                messagesController.f25851s1.clear();
                messagesController.f25915z1.clear();
                s0Var.finishFragment();
                if (z10 && user != null) {
                    g2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        kc.b0(T2).Q(2131623990, 36, gd.a0(null, null, 2131752805, n10.q(user))).j();
                    }
                } else if (user != null && (T = LaunchActivity.T()) != null) {
                    kc.b0(T).Q(2131623990, 36, gd.a0(null, null, 2131752772, n10.q(user))).j();
                }
            }
        }
    }

    public static void b0(s0 s0Var, n41 n41Var, final View view) {
        if (n41Var.f37650g && !s0Var.f18562w.h(n41Var)) {
            int i7 = n41Var.d;
            if (i7 == V) {
                b0 b0Var = s0Var.f18562w;
                s0Var.J = true;
                b0Var.h = true;
                s0Var.f18556c.f35323g3.O(true);
                s0Var.d0(true);
            } else if (i7 == W) {
                b0 b0Var2 = s0Var.f18562w;
                s0Var.J = false;
                b0Var2.h = false;
                s0Var.f18556c.f35323g3.O(true);
                s0Var.d0(true);
            } else if (i7 == X) {
                s0Var.N = null;
                s0Var.f18556c.f35323g3.O(true);
                s0Var.d0(true);
            } else if (n41Var.f56712a == 13) {
                TLRPC.User user = (TLRPC.User) s0Var.O.get(n41Var.f37666y);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, s0Var.getParentActivity(), s0Var.resourceProvider);
                        String N0 = gd.N0(2131752797, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.g0.W2(gd.N0(2131752798, null));
                        alertDialog$Builder.k(gd.N0(2131747637, null), null);
                        s0Var.showDialog(t1Var);
                        return;
                    }
                    s0Var.N = user;
                    org.telegram.messenger.g0.v1(s0Var.f18558f);
                    s0Var.f18556c.f35323g3.O(true);
                    s0Var.d0(true);
                }
            } else if (i7 == Y) {
                boolean z10 = !s0Var.Q;
                s0Var.Q = z10;
                ((q8) view).setChecked(z10);
                s0Var.f18556c.f35323g3.O(true);
            } else if (i7 == Z) {
                int i10 = -s0Var.P;
                s0Var.P = i10;
                org.telegram.messenger.g0.E3(i10, view, null);
            } else if (i7 == f18539a0) {
                TL_account.TL_businessBotRights tL_businessBotRights = s0Var.K;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((d2) view).c(z11, true);
                s0Var.f18556c.f35323g3.O(true);
                s0Var.d0(true);
            } else if (i7 == f18540b0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = s0Var.K;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((d2) view).c(z12, true);
                s0Var.f18556c.f35323g3.O(true);
                s0Var.d0(true);
            } else if (i7 == f18541c0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = s0Var.K;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((d2) view).c(z13, true);
                s0Var.f18556c.f35323g3.O(true);
                s0Var.d0(true);
            } else if (i7 == f18542d0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = s0Var.K;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((d2) view).c(z14, true);
                s0Var.f18556c.f35323g3.O(true);
                s0Var.d0(true);
            } else if (i7 == f18543e0) {
                boolean z15 = !s0Var.R;
                s0Var.R = z15;
                ((q8) view).setChecked(z15);
                s0Var.f18556c.f35323g3.O(true);
            } else if (i7 == f18544f0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = s0Var.K;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((d2) view).c(z16, true);
                s0Var.f18556c.f35323g3.O(true);
                s0Var.d0(true);
            } else if (i7 == f18545g0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = s0Var.K;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((d2) view).c(z17, true);
                s0Var.f18556c.f35323g3.O(true);
                s0Var.d0(true);
            } else if (i7 == f18546h0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = s0Var.K;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((d2) view).c(z18, true);
                s0Var.f18556c.f35323g3.O(true);
                s0Var.d0(true);
            } else if (i7 == f18547i0) {
                s0Var.c0(i7, !s0Var.K.edit_username, new Runnable(s0Var) {
                    public final s0 f18467b;

                    {
                        this.f18467b = s0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = this.f18467b;
                                s0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.K;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((d2) view).c(z19, true);
                                s0Var2.f18556c.f35323g3.O(true);
                                s0Var2.d0(true);
                                return;
                            case 1:
                                s0 s0Var3 = this.f18467b;
                                s0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                s0Var3.f18556c.f35323g3.O(true);
                                s0Var3.d0(true);
                                return;
                            case 2:
                                s0 s0Var4 = this.f18467b;
                                s0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                s0Var4.f18556c.f35323g3.O(true);
                                s0Var4.d0(true);
                                return;
                            case 3:
                                s0 s0Var5 = this.f18467b;
                                s0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                s0Var5.f18556c.f35323g3.O(true);
                                s0Var5.d0(true);
                                return;
                            case 4:
                                s0 s0Var6 = this.f18467b;
                                s0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                s0Var6.f18556c.f35323g3.O(true);
                                s0Var6.d0(true);
                                return;
                            default:
                                s0 s0Var7 = this.f18467b;
                                s0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                s0Var7.f18556c.f35323g3.O(true);
                                s0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18548j0) {
                boolean z19 = !s0Var.S;
                s0Var.S = z19;
                ((q8) view).setChecked(z19);
                s0Var.f18556c.f35323g3.O(true);
            } else if (i7 == f18549k0) {
                s0Var.c0(i7, !s0Var.K.view_gifts, new Runnable(s0Var) {
                    public final s0 f18467b;

                    {
                        this.f18467b = s0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = this.f18467b;
                                s0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((d2) view).c(z192, true);
                                s0Var2.f18556c.f35323g3.O(true);
                                s0Var2.d0(true);
                                return;
                            case 1:
                                s0 s0Var3 = this.f18467b;
                                s0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                s0Var3.f18556c.f35323g3.O(true);
                                s0Var3.d0(true);
                                return;
                            case 2:
                                s0 s0Var4 = this.f18467b;
                                s0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                s0Var4.f18556c.f35323g3.O(true);
                                s0Var4.d0(true);
                                return;
                            case 3:
                                s0 s0Var5 = this.f18467b;
                                s0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                s0Var5.f18556c.f35323g3.O(true);
                                s0Var5.d0(true);
                                return;
                            case 4:
                                s0 s0Var6 = this.f18467b;
                                s0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                s0Var6.f18556c.f35323g3.O(true);
                                s0Var6.d0(true);
                                return;
                            default:
                                s0 s0Var7 = this.f18467b;
                                s0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                s0Var7.f18556c.f35323g3.O(true);
                                s0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18550l0) {
                s0Var.c0(i7, !s0Var.K.sell_gifts, new Runnable(s0Var) {
                    public final s0 f18467b;

                    {
                        this.f18467b = s0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = this.f18467b;
                                s0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((d2) view).c(z192, true);
                                s0Var2.f18556c.f35323g3.O(true);
                                s0Var2.d0(true);
                                return;
                            case 1:
                                s0 s0Var3 = this.f18467b;
                                s0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                s0Var3.f18556c.f35323g3.O(true);
                                s0Var3.d0(true);
                                return;
                            case 2:
                                s0 s0Var4 = this.f18467b;
                                s0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                s0Var4.f18556c.f35323g3.O(true);
                                s0Var4.d0(true);
                                return;
                            case 3:
                                s0 s0Var5 = this.f18467b;
                                s0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                s0Var5.f18556c.f35323g3.O(true);
                                s0Var5.d0(true);
                                return;
                            case 4:
                                s0 s0Var6 = this.f18467b;
                                s0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                s0Var6.f18556c.f35323g3.O(true);
                                s0Var6.d0(true);
                                return;
                            default:
                                s0 s0Var7 = this.f18467b;
                                s0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                s0Var7.f18556c.f35323g3.O(true);
                                s0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == m0) {
                s0Var.c0(i7, !s0Var.K.change_gift_settings, new Runnable(s0Var) {
                    public final s0 f18467b;

                    {
                        this.f18467b = s0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = this.f18467b;
                                s0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((d2) view).c(z192, true);
                                s0Var2.f18556c.f35323g3.O(true);
                                s0Var2.d0(true);
                                return;
                            case 1:
                                s0 s0Var3 = this.f18467b;
                                s0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                s0Var3.f18556c.f35323g3.O(true);
                                s0Var3.d0(true);
                                return;
                            case 2:
                                s0 s0Var4 = this.f18467b;
                                s0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                s0Var4.f18556c.f35323g3.O(true);
                                s0Var4.d0(true);
                                return;
                            case 3:
                                s0 s0Var5 = this.f18467b;
                                s0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                s0Var5.f18556c.f35323g3.O(true);
                                s0Var5.d0(true);
                                return;
                            case 4:
                                s0 s0Var6 = this.f18467b;
                                s0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                s0Var6.f18556c.f35323g3.O(true);
                                s0Var6.d0(true);
                                return;
                            default:
                                s0 s0Var7 = this.f18467b;
                                s0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                s0Var7.f18556c.f35323g3.O(true);
                                s0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18551n0) {
                s0Var.c0(i7, !s0Var.K.transfer_and_upgrade_gifts, new Runnable(s0Var) {
                    public final s0 f18467b;

                    {
                        this.f18467b = s0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = this.f18467b;
                                s0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((d2) view).c(z192, true);
                                s0Var2.f18556c.f35323g3.O(true);
                                s0Var2.d0(true);
                                return;
                            case 1:
                                s0 s0Var3 = this.f18467b;
                                s0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                s0Var3.f18556c.f35323g3.O(true);
                                s0Var3.d0(true);
                                return;
                            case 2:
                                s0 s0Var4 = this.f18467b;
                                s0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                s0Var4.f18556c.f35323g3.O(true);
                                s0Var4.d0(true);
                                return;
                            case 3:
                                s0 s0Var5 = this.f18467b;
                                s0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                s0Var5.f18556c.f35323g3.O(true);
                                s0Var5.d0(true);
                                return;
                            case 4:
                                s0 s0Var6 = this.f18467b;
                                s0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                s0Var6.f18556c.f35323g3.O(true);
                                s0Var6.d0(true);
                                return;
                            default:
                                s0 s0Var7 = this.f18467b;
                                s0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                s0Var7.f18556c.f35323g3.O(true);
                                s0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18552o0) {
                s0Var.c0(i7, !s0Var.K.transfer_stars, new Runnable(s0Var) {
                    public final s0 f18467b;

                    {
                        this.f18467b = s0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = this.f18467b;
                                s0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((d2) view).c(z192, true);
                                s0Var2.f18556c.f35323g3.O(true);
                                s0Var2.d0(true);
                                return;
                            case 1:
                                s0 s0Var3 = this.f18467b;
                                s0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                s0Var3.f18556c.f35323g3.O(true);
                                s0Var3.d0(true);
                                return;
                            case 2:
                                s0 s0Var4 = this.f18467b;
                                s0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                s0Var4.f18556c.f35323g3.O(true);
                                s0Var4.d0(true);
                                return;
                            case 3:
                                s0 s0Var5 = this.f18467b;
                                s0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                s0Var5.f18556c.f35323g3.O(true);
                                s0Var5.d0(true);
                                return;
                            case 4:
                                s0 s0Var6 = this.f18467b;
                                s0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                s0Var6.f18556c.f35323g3.O(true);
                                s0Var6.d0(true);
                                return;
                            default:
                                s0 s0Var7 = this.f18467b;
                                s0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                s0Var7.f18556c.f35323g3.O(true);
                                s0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18553p0) {
                s0Var.c0(i7, !s0Var.K.manage_stories, new m0(s0Var, 0));
            }
        }
    }

    public final void c0(int i7, boolean z10, final Runnable runnable) {
        if (!this.L && i7 == f18547i0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String N0 = gd.N0(2131752775, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752776, n10.o(this.N)));
            alertDialog$Builder.h(gd.N0(2131752577, null), null);
            alertDialog$Builder.k(gd.N0(2131754281, null), new org.telegram.ui.ActionBar.q1(this) {
                public final s0 f18534b;

                {
                    this.f18534b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                    switch (r3) {
                        case 0:
                            this.f18534b.L = true;
                            runnable.run();
                            return;
                        default:
                            this.f18534b.M = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        } else if (!this.M && z10 && (i7 == f18550l0 || i7 == m0 || i7 == f18551n0 || i7 == f18552o0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String N02 = gd.N0(2131752775, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
            t1Var2.S = N02;
            t1Var2.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752789, n10.o(this.N)));
            alertDialog$Builder2.h(gd.N0(2131752577, null), null);
            alertDialog$Builder2.k(gd.N0(2131754281, null), new org.telegram.ui.ActionBar.q1(this) {
                public final s0 f18534b;

                {
                    this.f18534b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.t1 t1Var22, int i10) {
                    switch (r3) {
                        case 0:
                            this.f18534b.L = true;
                            runnable.run();
                            return;
                        default:
                            this.f18534b.M = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder2.d(-1);
            alertDialog$Builder2.p();
        } else {
            runnable.run();
        }
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(gd.N0(2131752771, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 8));
        this.f18554a = this.simpleActionBar.s(gd.N0(2131745750, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f18558f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        u6.D(this.f18558f, n6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f18558f;
        int i11 = n6.G6;
        u6.U(editTextBoldCursor2, i11, null);
        this.f18558f.setBackgroundDrawable(null);
        this.f18558f.setMaxLines(1);
        this.f18558f.setLines(1);
        this.f18558f.setPadding(0, 0, 0, 0);
        this.f18558f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f18558f;
        if (gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor3.setGravity(i7 | 48);
        this.f18558f.setInputType(180224);
        this.f18558f.setImeOptions(6);
        this.f18558f.setHint(gd.N0(2131752804, null));
        u6.v(this.f18558f, i11, null);
        this.f18558f.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f18558f.setCursorWidth(1.5f);
        this.f18558f.setOnEditorActionListener(new di.n(this, 1));
        this.f18558f.addTextChangedListener(new ah.j(this, 11));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f18557e = frameLayout2;
        frameLayout2.addView(this.f18558f, na.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f18557e;
        int i12 = n6.f29451d6;
        u6.h(i12, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.h = view;
        u6.h(n6.f29452d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.f18557e;
        View view2 = this.h;
        float f10 = 1.0f / org.telegram.messenger.g0.f24225p;
        boolean z10 = gd.f24314a0;
        int i13 = 21;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 21;
        }
        float f11 = i10;
        if (!z10) {
            i13 = 0;
        }
        frameLayout4.addView(view2, na.d(-1, f10, 87, f11, 0.0f, i13, 0.0f));
        v2 v2Var = new v2(context, 5);
        this.f18559n = v2Var;
        u6.h(i12, v2Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.f18560r = textView;
        textView.setText(gd.N0(2131752799, null));
        this.f18560r.setTextSize(1, 14.0f);
        TextView textView2 = this.f18560r;
        int i14 = n6.f29862z6;
        u6.U(textView2, i14, getResourceProvider());
        this.f18559n.addView(this.f18560r, na.e(-2, -2, 17));
        this.f18561s = new ImageView(context);
        c8 c8Var = new c8(getThemedColor(i14));
        this.f18561s.setScaleType(ImageView.ScaleType.CENTER);
        this.f18561s.setImageDrawable(c8Var);
        this.f18555b = c8Var;
        this.f18559n.addView(this.f18561s, na.e(-2, -2, 17));
        this.f18561s.setAlpha(0.0f);
        this.f18561s.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        z1Var.f17823a = new h6.o(this, 10);
        b0 b0Var = new b0(this, new m0(this, 3));
        this.f18562w = b0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.I;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        b0Var.i(tL_businessBotRecipients);
        g51 g51Var = new g51(this, new y7(this, 10), new p0(this, 3), null);
        this.f18556c = g51Var;
        g51Var.r1();
        this.f18556c.setSectionsDrawBackground(true);
        g51 g51Var2 = this.f18556c;
        g51Var2.f35323g3.f33631r = false;
        frameLayout.addView(g51Var2, na.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z10) {
        if (this.f18554a == null) {
            return;
        }
        this.f18554a.a(e0(), z10);
    }

    public final boolean e0() {
        boolean z10;
        boolean z11;
        long j3;
        b0 b0Var;
        if (this.U) {
            TLRPC.User user = this.N;
            if (user != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            TL_account.TL_connectedBot tL_connectedBot = this.I;
            if (tL_connectedBot != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11) {
                long j10 = 0;
                if (user == null) {
                    j3 = 0;
                } else {
                    j3 = user.f28641id;
                }
                if (tL_connectedBot != null) {
                    j10 = tL_connectedBot.bot_id;
                }
                if (j3 == j10 && (user == null || (this.K.equals(tL_connectedBot.rights) && ((b0Var = this.f18562w) == null || !b0Var.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f0() {
        boolean z10;
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (!this.f18554a.f28920y.f57780f) {
            if (!e0()) {
                finishFragment();
            } else if (this.f18562w.k(this.f18556c)) {
                TLRPC.User user2 = this.N;
                if (user2 != null && ((tL_connectedBot = this.I) == null || tL_connectedBot.bot_id != user2.f28641id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.I;
                if (tL_connectedBot2 != null && ((user = this.N) == null || tL_connectedBot2.bot_id != user.f28641id)) {
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = getMessagesController().q1(this.I.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    arrayList.add(updateconnectedbot);
                }
                if (this.N != null) {
                    TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                    updateconnectedbot2.deleted = false;
                    updateconnectedbot2.rights = this.K;
                    updateconnectedbot2.bot = getMessagesController().s1(this.N);
                    updateconnectedbot2.recipients = this.f18562w.b();
                    arrayList.add(updateconnectedbot2);
                    TL_account.TL_connectedBot tL_connectedBot3 = this.I;
                    if (tL_connectedBot3 != null) {
                        tL_connectedBot3.bot_id = this.N.f28641id;
                        tL_connectedBot3.recipients = this.f18562w.c();
                        this.I.rights = this.K;
                    }
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    getConnectionsManager().sendRequest((TLObject) arrayList.get(i7), new n0(this, iArr, arrayList, z10, user2));
                }
            }
        }
    }

    public final void g0() {
        boolean z10;
        float f10;
        float f11;
        boolean z11 = this.f18563x;
        boolean e10 = this.d.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.O;
        if (!e10 && !this.f18564y && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.d.e() && !this.f18564y && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f18563x = z12;
            ViewPropertyAnimator animate = this.f18560r.animate();
            float f12 = 1.0f;
            float f13 = 0.0f;
            if (z12) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z12) {
                f11 = -org.telegram.messenger.g0.L(8.0f);
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = alpha.translationY(f11).setDuration(320L);
            kr krVar = kr.h;
            duration.setInterpolator(krVar).start();
            ViewPropertyAnimator animate2 = this.f18561s.animate();
            if (!z12) {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f12);
            if (!z12) {
                f13 = org.telegram.messenger.g0.L(8.0f);
            }
            alpha2.translationY(f13).setDuration(320L).setInterpolator(krVar).start();
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18556c;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (e0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String N0 = gd.N0(2131743588, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131752774, null);
                alertDialog$Builder.k(gd.N0(2131754213, null), new p0(this, 0));
                alertDialog$Builder.h(gd.N0(2131747386, null), new p0(this, 1));
                showDialog(t1Var);
                return false;
            }
        } else if (this.N != null || e0() || (this.d.d.isEmpty() && this.d.f17826e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String N02 = gd.N0(2131752800, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
                t1Var2.S = N02;
                t1Var2.U = gd.N0(2131752801, null);
                alertDialog$Builder2.k(gd.N0(2131752802, null), new p0(this, 2));
                alertDialog$Builder2.h(gd.N0(2131752577, null), null);
                showDialog(t1Var2);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.T && !this.U) {
            this.T = true;
            f.a(this.currentAccount).c(new c7(this, 9));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            c8 c8Var = this.f18555b;
            if (c8Var != null) {
                c8Var.b(getThemedColor(n6.f29862z6));
                ImageView imageView = this.f18561s;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
