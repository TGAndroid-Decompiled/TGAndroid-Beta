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
import hi.e7;
import hi.i7;
import hi.x4;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.f3;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.LaunchActivity;
public final class t0 extends g2 {
    public static final int V = -1;
    public static final int W = -2;
    public static final int X = -3;
    public static final int Y = -4;
    public static final int Z = -5;
    public static final int f18458a0 = -6;
    public static final int f18459b0 = -7;
    public static final int f18460c0 = -8;
    public static final int f18461d0 = -9;
    public static final int f18462e0 = -10;
    public static final int f18463f0 = -11;
    public static final int f18464g0 = -12;
    public static final int f18465h0 = -13;
    public static final int f18466i0 = -14;
    public static final int f18467j0 = -15;
    public static final int f18468k0 = -16;
    public static final int f18469l0 = -17;
    public static final int m0 = -18;
    public static final int f18470n0 = -19;
    public static final int f18471o0 = -20;
    public static final int f18472p0 = -21;
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
    public c5 f18473a;
    public i7 f18474b;
    public h51 f18475c;
    public jg.z1 d;
    public FrameLayout f18476e;
    public EditTextBoldCursor f18477f;
    public View h;
    public v2 f18478n;
    public TextView f18479r;
    public ImageView f18480s;
    public b0 f18481w;
    public boolean f18482x;
    public boolean f18483y;

    public t0() {
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

    public static void Z(t0 t0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        g2 T;
        if (tL_error != null) {
            t0Var.f18473a.b(false);
            lc.e0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            t0Var.f18473a.b(false);
            f3.o(null, 2131743636, lc.b0(t0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.d.c(new i0(1, t0Var, tLObject));
            }
            int i7 = iArr[0] + 1;
            iArr[0] = i7;
            if (i7 == arrayList.size()) {
                f.a(t0Var.currentAccount).b();
                np messagesController = t0Var.getMessagesController();
                messagesController.f25919s1.clear();
                messagesController.f25983z1.clear();
                t0Var.finishFragment();
                if (z10 && user != null) {
                    g2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        lc.b0(T2).Q(2131623990, 36, hd.a0(null, null, 2131752805, p10.q(user))).j();
                    }
                } else if (user != null && (T = LaunchActivity.T()) != null) {
                    lc.b0(T).Q(2131623990, 36, hd.a0(null, null, 2131752772, p10.q(user))).j();
                }
            }
        }
    }

    public static void b0(t0 t0Var, o41 o41Var, final View view) {
        if (o41Var.f38053g && !t0Var.f18481w.h(o41Var)) {
            int i7 = o41Var.d;
            if (i7 == V) {
                b0 b0Var = t0Var.f18481w;
                t0Var.J = true;
                b0Var.h = true;
                t0Var.f18475c.f35742g3.O(true);
                t0Var.d0(true);
            } else if (i7 == W) {
                b0 b0Var2 = t0Var.f18481w;
                t0Var.J = false;
                b0Var2.h = false;
                t0Var.f18475c.f35742g3.O(true);
                t0Var.d0(true);
            } else if (i7 == X) {
                t0Var.N = null;
                t0Var.f18475c.f35742g3.O(true);
                t0Var.d0(true);
            } else if (o41Var.f56599a == 13) {
                TLRPC.User user = (TLRPC.User) t0Var.O.get(o41Var.f38069y);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t0Var.getParentActivity(), t0Var.resourceProvider);
                        String N0 = hd.N0(2131752797, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.g0.W2(hd.N0(2131752798, null));
                        alertDialog$Builder.k(hd.N0(2131747637, null), null);
                        t0Var.showDialog(t1Var);
                        return;
                    }
                    t0Var.N = user;
                    org.telegram.messenger.g0.v1(t0Var.f18477f);
                    t0Var.f18475c.f35742g3.O(true);
                    t0Var.d0(true);
                }
            } else if (i7 == Y) {
                boolean z10 = !t0Var.Q;
                t0Var.Q = z10;
                ((r8) view).setChecked(z10);
                t0Var.f18475c.f35742g3.O(true);
            } else if (i7 == Z) {
                int i10 = -t0Var.P;
                t0Var.P = i10;
                org.telegram.messenger.g0.E3(i10, view, null);
            } else if (i7 == f18458a0) {
                TL_account.TL_businessBotRights tL_businessBotRights = t0Var.K;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((d2) view).c(z11, true);
                t0Var.f18475c.f35742g3.O(true);
                t0Var.d0(true);
            } else if (i7 == f18459b0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var.K;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((d2) view).c(z12, true);
                t0Var.f18475c.f35742g3.O(true);
                t0Var.d0(true);
            } else if (i7 == f18460c0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var.K;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((d2) view).c(z13, true);
                t0Var.f18475c.f35742g3.O(true);
                t0Var.d0(true);
            } else if (i7 == f18461d0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = t0Var.K;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((d2) view).c(z14, true);
                t0Var.f18475c.f35742g3.O(true);
                t0Var.d0(true);
            } else if (i7 == f18462e0) {
                boolean z15 = !t0Var.R;
                t0Var.R = z15;
                ((r8) view).setChecked(z15);
                t0Var.f18475c.f35742g3.O(true);
            } else if (i7 == f18463f0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = t0Var.K;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((d2) view).c(z16, true);
                t0Var.f18475c.f35742g3.O(true);
                t0Var.d0(true);
            } else if (i7 == f18464g0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = t0Var.K;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((d2) view).c(z17, true);
                t0Var.f18475c.f35742g3.O(true);
                t0Var.d0(true);
            } else if (i7 == f18465h0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = t0Var.K;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((d2) view).c(z18, true);
                t0Var.f18475c.f35742g3.O(true);
                t0Var.d0(true);
            } else if (i7 == f18466i0) {
                t0Var.c0(i7, !t0Var.K.edit_username, new Runnable(t0Var) {
                    public final t0 f18372b;

                    {
                        this.f18372b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f18372b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((d2) view).c(z19, true);
                                t0Var2.f18475c.f35742g3.O(true);
                                t0Var2.d0(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f18372b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                t0Var3.f18475c.f35742g3.O(true);
                                t0Var3.d0(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f18372b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                t0Var4.f18475c.f35742g3.O(true);
                                t0Var4.d0(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f18372b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                t0Var5.f18475c.f35742g3.O(true);
                                t0Var5.d0(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f18372b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                t0Var6.f18475c.f35742g3.O(true);
                                t0Var6.d0(true);
                                return;
                            default:
                                t0 t0Var7 = this.f18372b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                t0Var7.f18475c.f35742g3.O(true);
                                t0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18467j0) {
                boolean z19 = !t0Var.S;
                t0Var.S = z19;
                ((r8) view).setChecked(z19);
                t0Var.f18475c.f35742g3.O(true);
            } else if (i7 == f18468k0) {
                t0Var.c0(i7, !t0Var.K.view_gifts, new Runnable(t0Var) {
                    public final t0 f18372b;

                    {
                        this.f18372b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f18372b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((d2) view).c(z192, true);
                                t0Var2.f18475c.f35742g3.O(true);
                                t0Var2.d0(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f18372b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                t0Var3.f18475c.f35742g3.O(true);
                                t0Var3.d0(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f18372b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                t0Var4.f18475c.f35742g3.O(true);
                                t0Var4.d0(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f18372b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                t0Var5.f18475c.f35742g3.O(true);
                                t0Var5.d0(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f18372b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                t0Var6.f18475c.f35742g3.O(true);
                                t0Var6.d0(true);
                                return;
                            default:
                                t0 t0Var7 = this.f18372b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                t0Var7.f18475c.f35742g3.O(true);
                                t0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18469l0) {
                t0Var.c0(i7, !t0Var.K.sell_gifts, new Runnable(t0Var) {
                    public final t0 f18372b;

                    {
                        this.f18372b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f18372b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((d2) view).c(z192, true);
                                t0Var2.f18475c.f35742g3.O(true);
                                t0Var2.d0(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f18372b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                t0Var3.f18475c.f35742g3.O(true);
                                t0Var3.d0(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f18372b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                t0Var4.f18475c.f35742g3.O(true);
                                t0Var4.d0(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f18372b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                t0Var5.f18475c.f35742g3.O(true);
                                t0Var5.d0(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f18372b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                t0Var6.f18475c.f35742g3.O(true);
                                t0Var6.d0(true);
                                return;
                            default:
                                t0 t0Var7 = this.f18372b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                t0Var7.f18475c.f35742g3.O(true);
                                t0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == m0) {
                t0Var.c0(i7, !t0Var.K.change_gift_settings, new Runnable(t0Var) {
                    public final t0 f18372b;

                    {
                        this.f18372b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f18372b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((d2) view).c(z192, true);
                                t0Var2.f18475c.f35742g3.O(true);
                                t0Var2.d0(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f18372b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                t0Var3.f18475c.f35742g3.O(true);
                                t0Var3.d0(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f18372b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                t0Var4.f18475c.f35742g3.O(true);
                                t0Var4.d0(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f18372b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                t0Var5.f18475c.f35742g3.O(true);
                                t0Var5.d0(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f18372b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                t0Var6.f18475c.f35742g3.O(true);
                                t0Var6.d0(true);
                                return;
                            default:
                                t0 t0Var7 = this.f18372b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                t0Var7.f18475c.f35742g3.O(true);
                                t0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18470n0) {
                t0Var.c0(i7, !t0Var.K.transfer_and_upgrade_gifts, new Runnable(t0Var) {
                    public final t0 f18372b;

                    {
                        this.f18372b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f18372b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((d2) view).c(z192, true);
                                t0Var2.f18475c.f35742g3.O(true);
                                t0Var2.d0(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f18372b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                t0Var3.f18475c.f35742g3.O(true);
                                t0Var3.d0(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f18372b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                t0Var4.f18475c.f35742g3.O(true);
                                t0Var4.d0(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f18372b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                t0Var5.f18475c.f35742g3.O(true);
                                t0Var5.d0(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f18372b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                t0Var6.f18475c.f35742g3.O(true);
                                t0Var6.d0(true);
                                return;
                            default:
                                t0 t0Var7 = this.f18372b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                t0Var7.f18475c.f35742g3.O(true);
                                t0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18471o0) {
                t0Var.c0(i7, !t0Var.K.transfer_stars, new Runnable(t0Var) {
                    public final t0 f18372b;

                    {
                        this.f18372b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f18372b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((d2) view).c(z192, true);
                                t0Var2.f18475c.f35742g3.O(true);
                                t0Var2.d0(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f18372b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((d2) view).c(z20, true);
                                t0Var3.f18475c.f35742g3.O(true);
                                t0Var3.d0(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f18372b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((d2) view).c(z21, true);
                                t0Var4.f18475c.f35742g3.O(true);
                                t0Var4.d0(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f18372b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((d2) view).c(z22, true);
                                t0Var5.f18475c.f35742g3.O(true);
                                t0Var5.d0(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f18372b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((d2) view).c(z23, true);
                                t0Var6.f18475c.f35742g3.O(true);
                                t0Var6.d0(true);
                                return;
                            default:
                                t0 t0Var7 = this.f18372b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((d2) view).c(z24, true);
                                t0Var7.f18475c.f35742g3.O(true);
                                t0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18472p0) {
                t0Var.c0(i7, !t0Var.K.manage_stories, new m0(t0Var, 0));
            }
        }
    }

    public final void c0(int i7, boolean z10, final Runnable runnable) {
        if (!this.L && i7 == f18466i0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String N0 = hd.N0(2131752775, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131752776, p10.o(this.N)));
            alertDialog$Builder.h(hd.N0(2131752577, null), null);
            alertDialog$Builder.k(hd.N0(2131754281, null), new org.telegram.ui.ActionBar.q1(this) {
                public final t0 f18439b;

                {
                    this.f18439b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                    switch (r3) {
                        case 0:
                            this.f18439b.L = true;
                            runnable.run();
                            return;
                        default:
                            this.f18439b.M = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        } else if (!this.M && z10 && (i7 == f18469l0 || i7 == m0 || i7 == f18470n0 || i7 == f18471o0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String N02 = hd.N0(2131752775, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
            t1Var2.S = N02;
            t1Var2.U = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131752789, p10.o(this.N)));
            alertDialog$Builder2.h(hd.N0(2131752577, null), null);
            alertDialog$Builder2.k(hd.N0(2131754281, null), new org.telegram.ui.ActionBar.q1(this) {
                public final t0 f18439b;

                {
                    this.f18439b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i10) {
                    switch (r3) {
                        case 0:
                            this.f18439b.L = true;
                            runnable.run();
                            return;
                        default:
                            this.f18439b.M = true;
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
        this.simpleActionBar.setTitle(hd.N0(2131752771, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 8));
        this.f18473a = this.simpleActionBar.s(hd.N0(2131745750, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f18477f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        t6.D(this.f18477f, m6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f18477f;
        int i11 = m6.G6;
        t6.U(editTextBoldCursor2, i11, null);
        this.f18477f.setBackgroundDrawable(null);
        this.f18477f.setMaxLines(1);
        this.f18477f.setLines(1);
        this.f18477f.setPadding(0, 0, 0, 0);
        this.f18477f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f18477f;
        if (hd.f24408a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor3.setGravity(i7 | 48);
        this.f18477f.setInputType(180224);
        this.f18477f.setImeOptions(6);
        this.f18477f.setHint(hd.N0(2131752804, null));
        t6.v(this.f18477f, i11, null);
        this.f18477f.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f18477f.setCursorWidth(1.5f);
        this.f18477f.setOnEditorActionListener(new di.n(this, 1));
        this.f18477f.addTextChangedListener(new ah.j(this, 11));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f18476e = frameLayout2;
        frameLayout2.addView(this.f18477f, na.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f18476e;
        int i12 = m6.f29347d6;
        t6.h(i12, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.h = view;
        t6.h(m6.f29348d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.f18476e;
        View view2 = this.h;
        float f10 = 1.0f / org.telegram.messenger.g0.f24009p;
        boolean z10 = hd.f24408a0;
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
        this.f18478n = v2Var;
        t6.h(i12, v2Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.f18479r = textView;
        textView.setText(hd.N0(2131752799, null));
        this.f18479r.setTextSize(1, 14.0f);
        TextView textView2 = this.f18479r;
        int i14 = m6.f29758z6;
        t6.U(textView2, i14, getResourceProvider());
        this.f18478n.addView(this.f18479r, na.e(-2, -2, 17));
        this.f18480s = new ImageView(context);
        i7 i7Var = new i7(getThemedColor(i14));
        this.f18480s.setScaleType(ImageView.ScaleType.CENTER);
        this.f18480s.setImageDrawable(i7Var);
        this.f18474b = i7Var;
        this.f18478n.addView(this.f18480s, na.e(-2, -2, 17));
        this.f18480s.setAlpha(0.0f);
        this.f18480s.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        z1Var.f17721a = new x4(this, 8);
        b0 b0Var = new b0(this, new m0(this, 3));
        this.f18481w = b0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.I;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        b0Var.i(tL_businessBotRecipients);
        h51 h51Var = new h51(this, new e7(this, 10), new p0(this, 3), null);
        this.f18475c = h51Var;
        h51Var.r1();
        this.f18475c.setSectionsDrawBackground(true);
        h51 h51Var2 = this.f18475c;
        h51Var2.f35742g3.f34026r = false;
        frameLayout.addView(h51Var2, na.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z10) {
        if (this.f18473a == null) {
            return;
        }
        this.f18473a.a(e0(), z10);
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
                    j3 = user.f28547id;
                }
                if (tL_connectedBot != null) {
                    j10 = tL_connectedBot.bot_id;
                }
                if (j3 == j10 && (user == null || (this.K.equals(tL_connectedBot.rights) && ((b0Var = this.f18481w) == null || !b0Var.g())))) {
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
        if (!this.f18473a.f28825y.f57666f) {
            if (!e0()) {
                finishFragment();
            } else if (this.f18481w.k(this.f18475c)) {
                TLRPC.User user2 = this.N;
                if (user2 != null && ((tL_connectedBot = this.I) == null || tL_connectedBot.bot_id != user2.f28547id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.I;
                if (tL_connectedBot2 != null && ((user = this.N) == null || tL_connectedBot2.bot_id != user.f28547id)) {
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
                    updateconnectedbot2.recipients = this.f18481w.b();
                    arrayList.add(updateconnectedbot2);
                    TL_account.TL_connectedBot tL_connectedBot3 = this.I;
                    if (tL_connectedBot3 != null) {
                        tL_connectedBot3.bot_id = this.N.f28547id;
                        tL_connectedBot3.recipients = this.f18481w.c();
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
        boolean z11 = this.f18482x;
        boolean e10 = this.d.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.O;
        if (!e10 && !this.f18483y && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.d.e() && !this.f18483y && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f18482x = z12;
            ViewPropertyAnimator animate = this.f18479r.animate();
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
            nr nrVar = nr.h;
            duration.setInterpolator(nrVar).start();
            ViewPropertyAnimator animate2 = this.f18480s.animate();
            if (!z12) {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f12);
            if (!z12) {
                f13 = org.telegram.messenger.g0.L(8.0f);
            }
            alpha2.translationY(f13).setDuration(320L).setInterpolator(nrVar).start();
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18475c;
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
                String N0 = hd.N0(2131743592, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                t1Var.S = N0;
                t1Var.U = hd.N0(2131752774, null);
                alertDialog$Builder.k(hd.N0(2131754213, null), new p0(this, 0));
                alertDialog$Builder.h(hd.N0(2131747386, null), new p0(this, 1));
                showDialog(t1Var);
                return false;
            }
        } else if (this.N != null || e0() || (this.d.d.isEmpty() && this.d.f17724e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String N02 = hd.N0(2131752800, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28743a;
                t1Var2.S = N02;
                t1Var2.U = hd.N0(2131752801, null);
                alertDialog$Builder2.k(hd.N0(2131752802, null), new p0(this, 2));
                alertDialog$Builder2.h(hd.N0(2131752577, null), null);
                showDialog(t1Var2);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.T && !this.U) {
            this.T = true;
            f.a(this.currentAccount).c(new hi.t6(this, 9));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            i7 i7Var = this.f18474b;
            if (i7Var != null) {
                i7Var.b(getThemedColor(m6.f29758z6));
                ImageView imageView = this.f18480s;
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
