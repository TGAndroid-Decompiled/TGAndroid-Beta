package kg;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.p2;
import c8.ma;
import hi.e7;
import hi.i7;
import hi.t6;
import hi.w4;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.LaunchActivity;
public final class t0 extends h2 {
    public static final int V = -1;
    public static final int W = -2;
    public static final int X = -3;
    public static final int Y = -4;
    public static final int Z = -5;
    public static final int f18459a0 = -6;
    public static final int f18460b0 = -7;
    public static final int f18461c0 = -8;
    public static final int f18462d0 = -9;
    public static final int f18463e0 = -10;
    public static final int f18464f0 = -11;
    public static final int f18465g0 = -12;
    public static final int f18466h0 = -13;
    public static final int f18467i0 = -14;
    public static final int f18468j0 = -15;
    public static final int f18469k0 = -16;
    public static final int f18470l0 = -17;
    public static final int m0 = -18;
    public static final int f18471n0 = -19;
    public static final int f18472o0 = -20;
    public static final int f18473p0 = -21;
    public String E;
    public int F;
    public final n0 G;
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
    public d5 f18474a;
    public i7 f18475b;
    public e51 f18476c;
    public jg.z1 d;
    public FrameLayout f18477e;
    public EditTextBoldCursor f18478f;
    public View h;
    public p2 f18479n;
    public TextView f18480r;
    public ImageView f18481s;
    public a0 f18482w;
    public boolean f18483x;
    public boolean f18484y;

    public t0() {
        super(null);
        this.F = 0;
        this.G = new n0(this, 4);
        this.K = TL_account.TL_businessBotRights.makeDefault();
        this.N = null;
        this.O = new LongSparseArray();
        this.P = -4;
        this.Q = true;
        this.R = false;
        this.S = false;
    }

    public static void Z(t0 t0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        h2 T;
        if (tL_error != null) {
            t0Var.f18474a.b(false);
            lc.e0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            t0Var.f18474a.b(false);
            f3.o(null, 2131743642, lc.b0(t0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.d.c(new h0(1, t0Var, tLObject));
            }
            int i7 = iArr[0] + 1;
            iArr[0] = i7;
            if (i7 == arrayList.size()) {
                f.a(t0Var.currentAccount).b();
                mp messagesController = t0Var.getMessagesController();
                messagesController.f25756s1.clear();
                messagesController.f25820z1.clear();
                t0Var.finishFragment();
                if (z10 && user != null) {
                    h2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        lc.b0(T2).Q(2131623990, 36, gd.a0(null, null, 2131752806, o10.q(user))).j();
                    }
                } else if (user != null && (T = LaunchActivity.T()) != null) {
                    lc.b0(T).Q(2131623990, 36, gd.a0(null, null, 2131752773, o10.q(user))).j();
                }
            }
        }
    }

    public static void b0(t0 t0Var, l41 l41Var, final View view) {
        if (l41Var.f37013g && !t0Var.f18482w.h(l41Var)) {
            int i7 = l41Var.d;
            if (i7 == V) {
                a0 a0Var = t0Var.f18482w;
                t0Var.J = true;
                a0Var.h = true;
                t0Var.f18476c.f34607g3.O(true);
                t0Var.d0(true);
            } else if (i7 == W) {
                a0 a0Var2 = t0Var.f18482w;
                t0Var.J = false;
                a0Var2.h = false;
                t0Var.f18476c.f34607g3.O(true);
                t0Var.d0(true);
            } else if (i7 == X) {
                t0Var.N = null;
                t0Var.f18476c.f34607g3.O(true);
                t0Var.d0(true);
            } else if (l41Var.f56589a == 13) {
                TLRPC.User user = (TLRPC.User) t0Var.O.get(l41Var.f37029y);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t0Var.getParentActivity(), t0Var.resourceProvider);
                        String M0 = gd.M0(2131752798, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.g0.W2(gd.M0(2131752799, null));
                        alertDialog$Builder.k(gd.M0(2131747638, null), null);
                        t0Var.showDialog(u1Var);
                        return;
                    }
                    t0Var.N = user;
                    org.telegram.messenger.g0.v1(t0Var.f18478f);
                    t0Var.f18476c.f34607g3.O(true);
                    t0Var.d0(true);
                }
            } else if (i7 == Y) {
                boolean z10 = !t0Var.Q;
                t0Var.Q = z10;
                ((r8) view).setChecked(z10);
                t0Var.f18476c.f34607g3.O(true);
            } else if (i7 == Z) {
                int i10 = -t0Var.P;
                t0Var.P = i10;
                org.telegram.messenger.g0.E3(i10, view, null);
            } else if (i7 == f18459a0) {
                TL_account.TL_businessBotRights tL_businessBotRights = t0Var.K;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((d2) view).c(z11, true);
                t0Var.f18476c.f34607g3.O(true);
                t0Var.d0(true);
            } else if (i7 == f18460b0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var.K;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((d2) view).c(z12, true);
                t0Var.f18476c.f34607g3.O(true);
                t0Var.d0(true);
            } else if (i7 == f18461c0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var.K;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((d2) view).c(z13, true);
                t0Var.f18476c.f34607g3.O(true);
                t0Var.d0(true);
            } else if (i7 == f18462d0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = t0Var.K;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((d2) view).c(z14, true);
                t0Var.f18476c.f34607g3.O(true);
                t0Var.d0(true);
            } else if (i7 == f18463e0) {
                boolean z15 = !t0Var.R;
                t0Var.R = z15;
                ((r8) view).setChecked(z15);
                t0Var.f18476c.f34607g3.O(true);
            } else if (i7 == f18464f0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = t0Var.K;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((d2) view).c(z16, true);
                t0Var.f18476c.f34607g3.O(true);
                t0Var.d0(true);
            } else if (i7 == f18465g0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = t0Var.K;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((d2) view).c(z17, true);
                t0Var.f18476c.f34607g3.O(true);
                t0Var.d0(true);
            } else if (i7 == f18466h0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = t0Var.K;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((d2) view).c(z18, true);
                t0Var.f18476c.f34607g3.O(true);
                t0Var.d0(true);
            } else if (i7 == f18467i0) {
                t0Var.c0(i7, !t0Var.K.edit_username, new Runnable(t0Var) {
                    public final t0 f18379b;

                    {
                        this.f18379b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f18379b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((d2) view).c(z19, true);
                                t0Var2.f18476c.f34607g3.O(true);
                                t0Var2.d0(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f18379b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                t0Var3.f18476c.f34607g3.O(true);
                                t0Var3.d0(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f18379b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                t0Var4.f18476c.f34607g3.O(true);
                                t0Var4.d0(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f18379b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                t0Var5.f18476c.f34607g3.O(true);
                                t0Var5.d0(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f18379b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                t0Var6.f18476c.f34607g3.O(true);
                                t0Var6.d0(true);
                                return;
                            default:
                                t0 t0Var7 = this.f18379b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                t0Var7.f18476c.f34607g3.O(true);
                                t0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18468j0) {
                boolean z19 = !t0Var.S;
                t0Var.S = z19;
                ((r8) view).setChecked(z19);
                t0Var.f18476c.f34607g3.O(true);
            } else if (i7 == f18469k0) {
                t0Var.c0(i7, !t0Var.K.view_gifts, new Runnable(t0Var) {
                    public final t0 f18379b;

                    {
                        this.f18379b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f18379b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((d2) view).c(z192, true);
                                t0Var2.f18476c.f34607g3.O(true);
                                t0Var2.d0(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f18379b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                t0Var3.f18476c.f34607g3.O(true);
                                t0Var3.d0(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f18379b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                t0Var4.f18476c.f34607g3.O(true);
                                t0Var4.d0(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f18379b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                t0Var5.f18476c.f34607g3.O(true);
                                t0Var5.d0(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f18379b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                t0Var6.f18476c.f34607g3.O(true);
                                t0Var6.d0(true);
                                return;
                            default:
                                t0 t0Var7 = this.f18379b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                t0Var7.f18476c.f34607g3.O(true);
                                t0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18470l0) {
                t0Var.c0(i7, !t0Var.K.sell_gifts, new Runnable(t0Var) {
                    public final t0 f18379b;

                    {
                        this.f18379b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f18379b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((d2) view).c(z192, true);
                                t0Var2.f18476c.f34607g3.O(true);
                                t0Var2.d0(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f18379b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                t0Var3.f18476c.f34607g3.O(true);
                                t0Var3.d0(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f18379b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                t0Var4.f18476c.f34607g3.O(true);
                                t0Var4.d0(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f18379b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                t0Var5.f18476c.f34607g3.O(true);
                                t0Var5.d0(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f18379b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                t0Var6.f18476c.f34607g3.O(true);
                                t0Var6.d0(true);
                                return;
                            default:
                                t0 t0Var7 = this.f18379b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                t0Var7.f18476c.f34607g3.O(true);
                                t0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == m0) {
                t0Var.c0(i7, !t0Var.K.change_gift_settings, new Runnable(t0Var) {
                    public final t0 f18379b;

                    {
                        this.f18379b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f18379b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((d2) view).c(z192, true);
                                t0Var2.f18476c.f34607g3.O(true);
                                t0Var2.d0(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f18379b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                t0Var3.f18476c.f34607g3.O(true);
                                t0Var3.d0(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f18379b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                t0Var4.f18476c.f34607g3.O(true);
                                t0Var4.d0(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f18379b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                t0Var5.f18476c.f34607g3.O(true);
                                t0Var5.d0(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f18379b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                t0Var6.f18476c.f34607g3.O(true);
                                t0Var6.d0(true);
                                return;
                            default:
                                t0 t0Var7 = this.f18379b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                t0Var7.f18476c.f34607g3.O(true);
                                t0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18471n0) {
                t0Var.c0(i7, !t0Var.K.transfer_and_upgrade_gifts, new Runnable(t0Var) {
                    public final t0 f18379b;

                    {
                        this.f18379b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f18379b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((d2) view).c(z192, true);
                                t0Var2.f18476c.f34607g3.O(true);
                                t0Var2.d0(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f18379b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                t0Var3.f18476c.f34607g3.O(true);
                                t0Var3.d0(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f18379b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                t0Var4.f18476c.f34607g3.O(true);
                                t0Var4.d0(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f18379b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                t0Var5.f18476c.f34607g3.O(true);
                                t0Var5.d0(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f18379b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                t0Var6.f18476c.f34607g3.O(true);
                                t0Var6.d0(true);
                                return;
                            default:
                                t0 t0Var7 = this.f18379b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                t0Var7.f18476c.f34607g3.O(true);
                                t0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18472o0) {
                t0Var.c0(i7, !t0Var.K.transfer_stars, new Runnable(t0Var) {
                    public final t0 f18379b;

                    {
                        this.f18379b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f18379b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((d2) view).c(z192, true);
                                t0Var2.f18476c.f34607g3.O(true);
                                t0Var2.d0(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f18379b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                t0Var3.f18476c.f34607g3.O(true);
                                t0Var3.d0(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f18379b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                t0Var4.f18476c.f34607g3.O(true);
                                t0Var4.d0(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f18379b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                t0Var5.f18476c.f34607g3.O(true);
                                t0Var5.d0(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f18379b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                t0Var6.f18476c.f34607g3.O(true);
                                t0Var6.d0(true);
                                return;
                            default:
                                t0 t0Var7 = this.f18379b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                t0Var7.f18476c.f34607g3.O(true);
                                t0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18473p0) {
                t0Var.c0(i7, !t0Var.K.manage_stories, new n0(t0Var, 0));
            }
        }
    }

    public final void c0(int i7, boolean z10, final Runnable runnable) {
        if (!this.L && i7 == f18467i0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = gd.M0(2131752776, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752777, o10.o(this.N)));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
            alertDialog$Builder.k(gd.M0(2131754282, null), new org.telegram.ui.ActionBar.r1(this) {
                public final t0 f18445b;

                {
                    this.f18445b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                    switch (r3) {
                        case 0:
                            this.f18445b.L = true;
                            runnable.run();
                            return;
                        default:
                            this.f18445b.M = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        } else if (!this.M && z10 && (i7 == f18470l0 || i7 == m0 || i7 == f18471n0 || i7 == f18472o0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M02 = gd.M0(2131752776, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28744a;
            u1Var2.S = M02;
            u1Var2.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752790, o10.o(this.N)));
            alertDialog$Builder2.h(gd.M0(2131752578, null), null);
            alertDialog$Builder2.k(gd.M0(2131754282, null), new org.telegram.ui.ActionBar.r1(this) {
                public final t0 f18445b;

                {
                    this.f18445b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.u1 u1Var22, int i10) {
                    switch (r3) {
                        case 0:
                            this.f18445b.L = true;
                            runnable.run();
                            return;
                        default:
                            this.f18445b.M = true;
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
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(gd.M0(2131752772, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 8));
        this.f18474a = this.simpleActionBar.s(gd.M0(2131745751, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f18478f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        u6.D(this.f18478f, n6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f18478f;
        int i11 = n6.G6;
        u6.U(editTextBoldCursor2, i11, null);
        this.f18478f.setBackgroundDrawable(null);
        this.f18478f.setMaxLines(1);
        this.f18478f.setLines(1);
        this.f18478f.setPadding(0, 0, 0, 0);
        this.f18478f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f18478f;
        if (gd.f24213a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor3.setGravity(i7 | 48);
        this.f18478f.setInputType(180224);
        this.f18478f.setImeOptions(6);
        this.f18478f.setHint(gd.M0(2131752805, null));
        u6.v(this.f18478f, i11, null);
        this.f18478f.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f18478f.setCursorWidth(1.5f);
        this.f18478f.setOnEditorActionListener(new di.n(this, 1));
        this.f18478f.addTextChangedListener(new ah.j(this, 11));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f18477e = frameLayout2;
        frameLayout2.addView(this.f18478f, ma.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f18477e;
        int i12 = n6.f29394d6;
        u6.h(i12, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.h = view;
        u6.h(n6.f29395d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.f18477e;
        View view2 = this.h;
        float f10 = 1.0f / org.telegram.messenger.g0.f24117p;
        boolean z10 = gd.f24213a0;
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
        frameLayout4.addView(view2, ma.d(-1, f10, 87, f11, 0.0f, i13, 0.0f));
        p2 p2Var = new p2(context, 5);
        this.f18479n = p2Var;
        u6.h(i12, p2Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.f18480r = textView;
        textView.setText(gd.M0(2131752800, null));
        this.f18480r.setTextSize(1, 14.0f);
        TextView textView2 = this.f18480r;
        int i14 = n6.f29805z6;
        u6.U(textView2, i14, getResourceProvider());
        this.f18479n.addView(this.f18480r, ma.e(-2, -2, 17));
        this.f18481s = new ImageView(context);
        i7 i7Var = new i7(getThemedColor(i14));
        this.f18481s.setScaleType(ImageView.ScaleType.CENTER);
        this.f18481s.setImageDrawable(i7Var);
        this.f18475b = i7Var;
        this.f18479n.addView(this.f18481s, ma.e(-2, -2, 17));
        this.f18481s.setAlpha(0.0f);
        this.f18481s.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        z1Var.f17727a = new w4(this, 8);
        a0 a0Var = new a0(this, new n0(this, 3));
        this.f18482w = a0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.I;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        a0Var.i(tL_businessBotRecipients);
        e51 e51Var = new e51(this, new e7(this, 10), new q0(this, 3), null);
        this.f18476c = e51Var;
        e51Var.r1();
        this.f18476c.setSectionsDrawBackground(true);
        e51 e51Var2 = this.f18476c;
        e51Var2.f34607g3.f42809r = false;
        frameLayout.addView(e51Var2, ma.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z10) {
        if (this.f18474a == null) {
            return;
        }
        this.f18474a.a(e0(), z10);
    }

    public final boolean e0() {
        boolean z10;
        boolean z11;
        long j3;
        a0 a0Var;
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
                    j3 = user.f28552id;
                }
                if (tL_connectedBot != null) {
                    j10 = tL_connectedBot.bot_id;
                }
                if (j3 == j10 && (user == null || (this.K.equals(tL_connectedBot.rights) && ((a0Var = this.f18482w) == null || !a0Var.g())))) {
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
        if (!this.f18474a.f28871y.f57658f) {
            if (!e0()) {
                finishFragment();
            } else if (this.f18482w.k(this.f18476c)) {
                TLRPC.User user2 = this.N;
                if (user2 != null && ((tL_connectedBot = this.I) == null || tL_connectedBot.bot_id != user2.f28552id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.I;
                if (tL_connectedBot2 != null && ((user = this.N) == null || tL_connectedBot2.bot_id != user.f28552id)) {
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
                    updateconnectedbot2.recipients = this.f18482w.b();
                    arrayList.add(updateconnectedbot2);
                    TL_account.TL_connectedBot tL_connectedBot3 = this.I;
                    if (tL_connectedBot3 != null) {
                        tL_connectedBot3.bot_id = this.N.f28552id;
                        tL_connectedBot3.recipients = this.f18482w.c();
                        this.I.rights = this.K;
                    }
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    getConnectionsManager().sendRequest((TLObject) arrayList.get(i7), new o0(this, iArr, arrayList, z10, user2));
                }
            }
        }
    }

    public final void g0() {
        boolean z10;
        float f10;
        float f11;
        boolean z11 = this.f18483x;
        boolean e10 = this.d.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.O;
        if (!e10 && !this.f18484y && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.d.e() && !this.f18484y && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f18483x = z12;
            ViewPropertyAnimator animate = this.f18480r.animate();
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
            lr lrVar = lr.h;
            duration.setInterpolator(lrVar).start();
            ViewPropertyAnimator animate2 = this.f18481s.animate();
            if (!z12) {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f12);
            if (!z12) {
                f13 = org.telegram.messenger.g0.L(8.0f);
            }
            alpha2.translationY(f13).setDuration(320L).setInterpolator(lrVar).start();
        }
    }

    @Override
    public final ck0 getListViewForSimpleGlass() {
        return this.f18476c;
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
                String M0 = gd.M0(2131743598, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                u1Var.U = gd.M0(2131752775, null);
                alertDialog$Builder.k(gd.M0(2131754214, null), new q0(this, 0));
                alertDialog$Builder.h(gd.M0(2131747387, null), new q0(this, 1));
                showDialog(u1Var);
                return false;
            }
        } else if (this.N != null || e0() || (this.d.d.isEmpty() && this.d.f17730e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = gd.M0(2131752801, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f28744a;
                u1Var2.S = M02;
                u1Var2.U = gd.M0(2131752802, null);
                alertDialog$Builder2.k(gd.M0(2131752803, null), new q0(this, 2));
                alertDialog$Builder2.h(gd.M0(2131752578, null), null);
                showDialog(u1Var2);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.T && !this.U) {
            this.T = true;
            f.a(this.currentAccount).c(new t6(this, 9));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            i7 i7Var = this.f18475b;
            if (i7Var != null) {
                i7Var.b(getThemedColor(n6.f29805z6));
                ImageView imageView = this.f18481s;
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
