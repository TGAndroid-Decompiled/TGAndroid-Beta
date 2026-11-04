package lg;

import ai.g5;
import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import gi.j7;
import gi.j8;
import gi.q4;
import gi.w5;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
public final class r0 extends d2 {
    public static final int V = -1;
    public static final int W = -2;
    public static final int X = -3;
    public static final int Y = -4;
    public static final int Z = -5;
    public static final int f18423a0 = -6;
    public static final int f18424b0 = -7;
    public static final int f18425c0 = -8;
    public static final int f18426d0 = -9;
    public static final int f18427e0 = -10;
    public static final int f18428f0 = -11;
    public static final int f18429g0 = -12;
    public static final int f18430h0 = -13;
    public static final int f18431i0 = -14;
    public static final int f18432j0 = -15;
    public static final int f18433k0 = -16;
    public static final int f18434l0 = -17;
    public static final int m0 = -18;
    public static final int f18435n0 = -19;
    public static final int f18436o0 = -20;
    public static final int f18437p0 = -21;
    public String E;
    public int F;
    public final l0 G;
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
    public b5 f18438a;
    public j7 f18439b;
    public l41 f18440c;
    public kg.v1 d;
    public FrameLayout f18441e;
    public EditTextBoldCursor f18442f;
    public View h;
    public ai.d2 f18443n;
    public TextView f18444r;
    public ImageView f18445s;
    public b0 f18446w;
    public boolean f18447x;
    public boolean f18448y;

    public r0() {
        super(null);
        this.F = 0;
        this.G = new l0(this, 4);
        this.K = TL_account.TL_businessBotRights.makeDefault();
        this.N = null;
        this.O = new LongSparseArray();
        this.P = -4;
        this.Q = true;
        this.R = false;
        this.S = false;
    }

    public static void Z(r0 r0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        d2 T;
        if (tL_error != null) {
            r0Var.f18438a.b(false);
            fc.d0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            r0Var.f18438a.b(false);
            k5.p(null, 2131743889, fc.a0(r0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.d.c(new ii.e(24, r0Var, tLObject));
            }
            int i3 = iArr[0] + 1;
            iArr[0] = i3;
            if (i3 == arrayList.size()) {
                f.a(r0Var.currentAccount).b();
                hp messagesController = r0Var.getMessagesController();
                messagesController.f23115s1.clear();
                messagesController.f23161x1.clear();
                r0Var.finishFragment();
                if (z10 && user != null) {
                    d2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        fc.a0(T2).Q(2131623989, 36, bd.a0(null, null, 2131752817, l10.p(user))).j();
                    }
                } else if (user != null && (T = LaunchActivity.T()) != null) {
                    fc.a0(T).Q(2131623989, 36, bd.a0(null, null, 2131752784, l10.p(user))).j();
                }
            }
        }
    }

    public static void b0(r0 r0Var, r31 r31Var, final View view) {
        if (r31Var.f37623g && !r0Var.f18446w.h(r31Var)) {
            int i3 = r31Var.d;
            if (i3 == V) {
                b0 b0Var = r0Var.f18446w;
                r0Var.J = true;
                b0Var.h = true;
                r0Var.f18440c.f35594g3.O(true);
                r0Var.d0(true);
            } else if (i3 == W) {
                b0 b0Var2 = r0Var.f18446w;
                r0Var.J = false;
                b0Var2.h = false;
                r0Var.f18440c.f35594g3.O(true);
                r0Var.d0(true);
            } else if (i3 == X) {
                r0Var.N = null;
                r0Var.f18440c.f35594g3.O(true);
                r0Var.d0(true);
            } else if (r31Var.f54715a == 13) {
                TLRPC.User user = (TLRPC.User) r0Var.O.get(r31Var.f37638x);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, r0Var.getParentActivity(), r0Var.resourceProvider);
                        String M0 = bd.M0(2131752809, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.g0.X2(bd.M0(2131752810, null));
                        alertDialog$Builder.k(bd.M0(2131747839, null), null);
                        r0Var.showDialog(s1Var);
                        return;
                    }
                    r0Var.N = user;
                    org.telegram.messenger.g0.v1(r0Var.f18442f);
                    r0Var.f18440c.f35594g3.O(true);
                    r0Var.d0(true);
                }
            } else if (i3 == Y) {
                boolean z10 = !r0Var.Q;
                r0Var.Q = z10;
                ((p8) view).setChecked(z10);
                r0Var.f18440c.f35594g3.O(true);
            } else if (i3 == Z) {
                int i10 = -r0Var.P;
                r0Var.P = i10;
                org.telegram.messenger.g0.G3(i10, view, null);
            } else if (i3 == f18423a0) {
                TL_account.TL_businessBotRights tL_businessBotRights = r0Var.K;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((c2) view).c(z11, true);
                r0Var.f18440c.f35594g3.O(true);
                r0Var.d0(true);
            } else if (i3 == f18424b0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = r0Var.K;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((c2) view).c(z12, true);
                r0Var.f18440c.f35594g3.O(true);
                r0Var.d0(true);
            } else if (i3 == f18425c0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = r0Var.K;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((c2) view).c(z13, true);
                r0Var.f18440c.f35594g3.O(true);
                r0Var.d0(true);
            } else if (i3 == f18426d0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = r0Var.K;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((c2) view).c(z14, true);
                r0Var.f18440c.f35594g3.O(true);
                r0Var.d0(true);
            } else if (i3 == f18427e0) {
                boolean z15 = !r0Var.R;
                r0Var.R = z15;
                ((p8) view).setChecked(z15);
                r0Var.f18440c.f35594g3.O(true);
            } else if (i3 == f18428f0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = r0Var.K;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((c2) view).c(z16, true);
                r0Var.f18440c.f35594g3.O(true);
                r0Var.d0(true);
            } else if (i3 == f18429g0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = r0Var.K;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((c2) view).c(z17, true);
                r0Var.f18440c.f35594g3.O(true);
                r0Var.d0(true);
            } else if (i3 == f18430h0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = r0Var.K;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((c2) view).c(z18, true);
                r0Var.f18440c.f35594g3.O(true);
                r0Var.d0(true);
            } else if (i3 == f18431i0) {
                r0Var.c0(i3, !r0Var.K.edit_username, new Runnable(r0Var) {
                    public final r0 f18346b;

                    {
                        this.f18346b = r0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r0 r0Var2 = this.f18346b;
                                r0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = r0Var2.K;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((c2) view).c(z19, true);
                                r0Var2.f18440c.f35594g3.O(true);
                                r0Var2.d0(true);
                                return;
                            case 1:
                                r0 r0Var3 = this.f18346b;
                                r0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = r0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((c2) view).c(z20, true);
                                r0Var3.f18440c.f35594g3.O(true);
                                r0Var3.d0(true);
                                return;
                            case 2:
                                r0 r0Var4 = this.f18346b;
                                r0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = r0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((c2) view).c(z21, true);
                                r0Var4.f18440c.f35594g3.O(true);
                                r0Var4.d0(true);
                                return;
                            case 3:
                                r0 r0Var5 = this.f18346b;
                                r0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = r0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((c2) view).c(z22, true);
                                r0Var5.f18440c.f35594g3.O(true);
                                r0Var5.d0(true);
                                return;
                            case 4:
                                r0 r0Var6 = this.f18346b;
                                r0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = r0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((c2) view).c(z23, true);
                                r0Var6.f18440c.f35594g3.O(true);
                                r0Var6.d0(true);
                                return;
                            default:
                                r0 r0Var7 = this.f18346b;
                                r0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = r0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((c2) view).c(z24, true);
                                r0Var7.f18440c.f35594g3.O(true);
                                r0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i3 == f18432j0) {
                boolean z19 = !r0Var.S;
                r0Var.S = z19;
                ((p8) view).setChecked(z19);
                r0Var.f18440c.f35594g3.O(true);
            } else if (i3 == f18433k0) {
                r0Var.c0(i3, !r0Var.K.view_gifts, new Runnable(r0Var) {
                    public final r0 f18346b;

                    {
                        this.f18346b = r0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r0 r0Var2 = this.f18346b;
                                r0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = r0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((c2) view).c(z192, true);
                                r0Var2.f18440c.f35594g3.O(true);
                                r0Var2.d0(true);
                                return;
                            case 1:
                                r0 r0Var3 = this.f18346b;
                                r0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = r0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((c2) view).c(z20, true);
                                r0Var3.f18440c.f35594g3.O(true);
                                r0Var3.d0(true);
                                return;
                            case 2:
                                r0 r0Var4 = this.f18346b;
                                r0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = r0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((c2) view).c(z21, true);
                                r0Var4.f18440c.f35594g3.O(true);
                                r0Var4.d0(true);
                                return;
                            case 3:
                                r0 r0Var5 = this.f18346b;
                                r0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = r0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((c2) view).c(z22, true);
                                r0Var5.f18440c.f35594g3.O(true);
                                r0Var5.d0(true);
                                return;
                            case 4:
                                r0 r0Var6 = this.f18346b;
                                r0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = r0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((c2) view).c(z23, true);
                                r0Var6.f18440c.f35594g3.O(true);
                                r0Var6.d0(true);
                                return;
                            default:
                                r0 r0Var7 = this.f18346b;
                                r0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = r0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((c2) view).c(z24, true);
                                r0Var7.f18440c.f35594g3.O(true);
                                r0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i3 == f18434l0) {
                r0Var.c0(i3, !r0Var.K.sell_gifts, new Runnable(r0Var) {
                    public final r0 f18346b;

                    {
                        this.f18346b = r0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r0 r0Var2 = this.f18346b;
                                r0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = r0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((c2) view).c(z192, true);
                                r0Var2.f18440c.f35594g3.O(true);
                                r0Var2.d0(true);
                                return;
                            case 1:
                                r0 r0Var3 = this.f18346b;
                                r0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = r0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((c2) view).c(z20, true);
                                r0Var3.f18440c.f35594g3.O(true);
                                r0Var3.d0(true);
                                return;
                            case 2:
                                r0 r0Var4 = this.f18346b;
                                r0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = r0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((c2) view).c(z21, true);
                                r0Var4.f18440c.f35594g3.O(true);
                                r0Var4.d0(true);
                                return;
                            case 3:
                                r0 r0Var5 = this.f18346b;
                                r0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = r0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((c2) view).c(z22, true);
                                r0Var5.f18440c.f35594g3.O(true);
                                r0Var5.d0(true);
                                return;
                            case 4:
                                r0 r0Var6 = this.f18346b;
                                r0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = r0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((c2) view).c(z23, true);
                                r0Var6.f18440c.f35594g3.O(true);
                                r0Var6.d0(true);
                                return;
                            default:
                                r0 r0Var7 = this.f18346b;
                                r0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = r0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((c2) view).c(z24, true);
                                r0Var7.f18440c.f35594g3.O(true);
                                r0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i3 == m0) {
                r0Var.c0(i3, !r0Var.K.change_gift_settings, new Runnable(r0Var) {
                    public final r0 f18346b;

                    {
                        this.f18346b = r0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r0 r0Var2 = this.f18346b;
                                r0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = r0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((c2) view).c(z192, true);
                                r0Var2.f18440c.f35594g3.O(true);
                                r0Var2.d0(true);
                                return;
                            case 1:
                                r0 r0Var3 = this.f18346b;
                                r0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = r0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((c2) view).c(z20, true);
                                r0Var3.f18440c.f35594g3.O(true);
                                r0Var3.d0(true);
                                return;
                            case 2:
                                r0 r0Var4 = this.f18346b;
                                r0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = r0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((c2) view).c(z21, true);
                                r0Var4.f18440c.f35594g3.O(true);
                                r0Var4.d0(true);
                                return;
                            case 3:
                                r0 r0Var5 = this.f18346b;
                                r0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = r0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((c2) view).c(z22, true);
                                r0Var5.f18440c.f35594g3.O(true);
                                r0Var5.d0(true);
                                return;
                            case 4:
                                r0 r0Var6 = this.f18346b;
                                r0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = r0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((c2) view).c(z23, true);
                                r0Var6.f18440c.f35594g3.O(true);
                                r0Var6.d0(true);
                                return;
                            default:
                                r0 r0Var7 = this.f18346b;
                                r0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = r0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((c2) view).c(z24, true);
                                r0Var7.f18440c.f35594g3.O(true);
                                r0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i3 == f18435n0) {
                r0Var.c0(i3, !r0Var.K.transfer_and_upgrade_gifts, new Runnable(r0Var) {
                    public final r0 f18346b;

                    {
                        this.f18346b = r0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r0 r0Var2 = this.f18346b;
                                r0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = r0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((c2) view).c(z192, true);
                                r0Var2.f18440c.f35594g3.O(true);
                                r0Var2.d0(true);
                                return;
                            case 1:
                                r0 r0Var3 = this.f18346b;
                                r0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = r0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((c2) view).c(z20, true);
                                r0Var3.f18440c.f35594g3.O(true);
                                r0Var3.d0(true);
                                return;
                            case 2:
                                r0 r0Var4 = this.f18346b;
                                r0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = r0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((c2) view).c(z21, true);
                                r0Var4.f18440c.f35594g3.O(true);
                                r0Var4.d0(true);
                                return;
                            case 3:
                                r0 r0Var5 = this.f18346b;
                                r0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = r0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((c2) view).c(z22, true);
                                r0Var5.f18440c.f35594g3.O(true);
                                r0Var5.d0(true);
                                return;
                            case 4:
                                r0 r0Var6 = this.f18346b;
                                r0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = r0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((c2) view).c(z23, true);
                                r0Var6.f18440c.f35594g3.O(true);
                                r0Var6.d0(true);
                                return;
                            default:
                                r0 r0Var7 = this.f18346b;
                                r0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = r0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((c2) view).c(z24, true);
                                r0Var7.f18440c.f35594g3.O(true);
                                r0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i3 == f18436o0) {
                r0Var.c0(i3, !r0Var.K.transfer_stars, new Runnable(r0Var) {
                    public final r0 f18346b;

                    {
                        this.f18346b = r0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                r0 r0Var2 = this.f18346b;
                                r0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = r0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((c2) view).c(z192, true);
                                r0Var2.f18440c.f35594g3.O(true);
                                r0Var2.d0(true);
                                return;
                            case 1:
                                r0 r0Var3 = this.f18346b;
                                r0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = r0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((c2) view).c(z20, true);
                                r0Var3.f18440c.f35594g3.O(true);
                                r0Var3.d0(true);
                                return;
                            case 2:
                                r0 r0Var4 = this.f18346b;
                                r0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = r0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((c2) view).c(z21, true);
                                r0Var4.f18440c.f35594g3.O(true);
                                r0Var4.d0(true);
                                return;
                            case 3:
                                r0 r0Var5 = this.f18346b;
                                r0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = r0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((c2) view).c(z22, true);
                                r0Var5.f18440c.f35594g3.O(true);
                                r0Var5.d0(true);
                                return;
                            case 4:
                                r0 r0Var6 = this.f18346b;
                                r0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = r0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((c2) view).c(z23, true);
                                r0Var6.f18440c.f35594g3.O(true);
                                r0Var6.d0(true);
                                return;
                            default:
                                r0 r0Var7 = this.f18346b;
                                r0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = r0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((c2) view).c(z24, true);
                                r0Var7.f18440c.f35594g3.O(true);
                                r0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i3 == f18437p0) {
                r0Var.c0(i3, !r0Var.K.manage_stories, new l0(r0Var, 0));
            }
        }
    }

    public final void c0(int i3, boolean z10, final Runnable runnable) {
        if (!this.L && i3 == f18431i0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = bd.M0(2131752787, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131752788, l10.n(this.N)));
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
            alertDialog$Builder.k(bd.M0(2131754284, null), new org.telegram.ui.ActionBar.p1(this) {
                public final r0 f18412b;

                {
                    this.f18412b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i10) {
                    switch (r3) {
                        case 0:
                            this.f18412b.L = true;
                            runnable.run();
                            return;
                        default:
                            this.f18412b.M = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        } else if (!this.M && z10 && (i3 == f18434l0 || i3 == m0 || i3 == f18435n0 || i3 == f18436o0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M02 = bd.M0(2131752787, null);
            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
            s1Var2.S = M02;
            s1Var2.U = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131752801, l10.n(this.N)));
            alertDialog$Builder2.h(bd.M0(2131752589, null), null);
            alertDialog$Builder2.k(bd.M0(2131754284, null), new org.telegram.ui.ActionBar.p1(this) {
                public final r0 f18412b;

                {
                    this.f18412b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i10) {
                    switch (r3) {
                        case 0:
                            this.f18412b.L = true;
                            runnable.run();
                            return;
                        default:
                            this.f18412b.M = true;
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
        int i3;
        int i10;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(bd.M0(2131752783, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new g5(this, 14));
        this.f18438a = this.simpleActionBar.n(bd.M0(2131745956, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f18442f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        r6.E(this.f18442f, k6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f18442f;
        int i11 = k6.G6;
        r6.V(editTextBoldCursor2, i11, null);
        this.f18442f.setBackgroundDrawable(null);
        this.f18442f.setMaxLines(1);
        this.f18442f.setLines(1);
        this.f18442f.setPadding(0, 0, 0, 0);
        this.f18442f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f18442f;
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        editTextBoldCursor3.setGravity(i3 | 48);
        this.f18442f.setInputType(180224);
        this.f18442f.setImeOptions(6);
        this.f18442f.setHint(bd.M0(2131752816, null));
        r6.w(this.f18442f, i11, null);
        this.f18442f.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f18442f.setCursorWidth(1.5f);
        this.f18442f.setOnEditorActionListener(new ci.o(this, 1));
        this.f18442f.addTextChangedListener(new bh.h(this, 9));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f18441e = frameLayout2;
        frameLayout2.addView(this.f18442f, mf.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f18441e;
        int i12 = k6.f27878d6;
        r6.i(i12, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.h = view;
        r6.i(k6.f27879d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.f18441e;
        View view2 = this.h;
        float f10 = 1.0f / org.telegram.messenger.g0.f22607p;
        boolean z10 = bd.f21784a0;
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
        frameLayout4.addView(view2, mf.d(-1, f10, 87, f11, 0.0f, i13, 0.0f));
        ai.d2 d2Var = new ai.d2(context, 5);
        this.f18443n = d2Var;
        r6.i(i12, d2Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.f18444r = textView;
        textView.setText(bd.M0(2131752811, null));
        this.f18444r.setTextSize(1, 14.0f);
        TextView textView2 = this.f18444r;
        int i14 = k6.f28290z6;
        r6.V(textView2, i14, getResourceProvider());
        this.f18443n.addView(this.f18444r, mf.e(-2, -2, 17));
        this.f18445s = new ImageView(context);
        j7 j7Var = new j7(getThemedColor(i14));
        this.f18445s.setScaleType(ImageView.ScaleType.CENTER);
        this.f18445s.setImageDrawable(j7Var);
        this.f18439b = j7Var;
        this.f18443n.addView(this.f18445s, mf.e(-2, -2, 17));
        this.f18445s.setAlpha(0.0f);
        this.f18445s.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        kg.v1 v1Var = new kg.v1(true);
        this.d = v1Var;
        v1Var.f17206a = new w5(this, 10);
        b0 b0Var = new b0(this, new l0(this, 3));
        this.f18446w = b0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.I;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        b0Var.i(tL_businessBotRecipients);
        l41 l41Var = new l41(this, new q4(this, 18), new o0(this, 3), null);
        this.f18440c = l41Var;
        l41Var.r1();
        this.f18440c.setSectionsDrawBackground(true);
        l41 l41Var2 = this.f18440c;
        l41Var2.f35594g3.f33698r = false;
        frameLayout.addView(l41Var2, mf.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z10) {
        if (this.f18438a == null) {
            return;
        }
        this.f18438a.a(e0(), z10);
    }

    public final boolean e0() {
        boolean z10;
        boolean z11;
        long j10;
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
                long j11 = 0;
                if (user == null) {
                    j10 = 0;
                } else {
                    j10 = user.f27150id;
                }
                if (tL_connectedBot != null) {
                    j11 = tL_connectedBot.bot_id;
                }
                if (j10 == j11 && (user == null || (this.K.equals(tL_connectedBot.rights) && ((b0Var = this.f18446w) == null || !b0Var.g())))) {
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
        if (!this.f18438a.f27421y.f53841f) {
            if (!e0()) {
                finishFragment();
            } else if (this.f18446w.k(this.f18440c)) {
                TLRPC.User user2 = this.N;
                if (user2 != null && ((tL_connectedBot = this.I) == null || tL_connectedBot.bot_id != user2.f27150id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.I;
                if (tL_connectedBot2 != null && ((user = this.N) == null || tL_connectedBot2.bot_id != user.f27150id)) {
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = getMessagesController().o1(this.I.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    arrayList.add(updateconnectedbot);
                }
                if (this.N != null) {
                    TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                    updateconnectedbot2.deleted = false;
                    updateconnectedbot2.rights = this.K;
                    updateconnectedbot2.bot = getMessagesController().q1(this.N);
                    updateconnectedbot2.recipients = this.f18446w.b();
                    arrayList.add(updateconnectedbot2);
                    TL_account.TL_connectedBot tL_connectedBot3 = this.I;
                    if (tL_connectedBot3 != null) {
                        tL_connectedBot3.bot_id = this.N.f27150id;
                        tL_connectedBot3.recipients = this.f18446w.c();
                        this.I.rights = this.K;
                    }
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    getConnectionsManager().sendRequest((TLObject) arrayList.get(i3), new m0(this, iArr, arrayList, z10, user2));
                }
            }
        }
    }

    public final void g0() {
        boolean z10;
        float f10;
        float f11;
        boolean z11 = this.f18447x;
        boolean e10 = this.d.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.O;
        if (!e10 && !this.f18448y && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.d.e() && !this.f18448y && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f18447x = z12;
            ViewPropertyAnimator animate = this.f18444r.animate();
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
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).start();
            ViewPropertyAnimator animate2 = this.f18445s.animate();
            if (!z12) {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f12);
            if (!z12) {
                f13 = org.telegram.messenger.g0.L(8.0f);
            }
            alpha2.translationY(f13).setDuration(320L).setInterpolator(xqVar).start();
        }
    }

    @Override
    public final tj0 getListViewForSimpleGlass() {
        return this.f18440c;
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
                String M0 = bd.M0(2131743845, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131752786, null);
                alertDialog$Builder.k(bd.M0(2131754216, null), new o0(this, 0));
                alertDialog$Builder.h(bd.M0(2131747588, null), new o0(this, 1));
                showDialog(s1Var);
                return false;
            }
        } else if (this.N != null || e0() || (this.d.d.isEmpty() && this.d.f17209e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = bd.M0(2131752812, null);
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                s1Var2.S = M02;
                s1Var2.U = bd.M0(2131752813, null);
                alertDialog$Builder2.k(bd.M0(2131752814, null), new o0(this, 2));
                alertDialog$Builder2.h(bd.M0(2131752589, null), null);
                showDialog(s1Var2);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.T && !this.U) {
            this.T = true;
            f.a(this.currentAccount).c(new j8(this, 8));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            j7 j7Var = this.f18439b;
            if (j7Var != null) {
                j7Var.b(getThemedColor(k6.f28290z6));
                ImageView imageView = this.f18445s;
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
