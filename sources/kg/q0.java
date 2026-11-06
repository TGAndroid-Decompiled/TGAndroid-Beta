package kg;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import di.a4;
import fi.j7;
import java.util.ArrayList;
import jg.z1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
public final class q0 extends f2 {
    public static final int U = -1;
    public static final int V = -2;
    public static final int W = -3;
    public static final int X = -4;
    public static final int Y = -5;
    public static final int Z = -6;
    public static final int f17483a0 = -7;
    public static final int f17484b0 = -8;
    public static final int f17485c0 = -9;
    public static final int f17486d0 = -10;
    public static final int f17487e0 = -11;
    public static final int f17488f0 = -12;
    public static final int f17489g0 = -13;
    public static final int f17490h0 = -14;
    public static final int f17491i0 = -15;
    public static final int f17492j0 = -16;
    public static final int f17493k0 = -17;
    public static final int f17494l0 = -18;
    public static final int m0 = -19;
    public static final int f17495n0 = -20;
    public static final int f17496o0 = -21;
    public String D;
    public int E;
    public final k0 F;
    public TL_account.connectedBots G;
    public TL_account.TL_connectedBot H;
    public boolean I;
    public TL_account.TL_businessBotRights J;
    public boolean K;
    public boolean L;
    public TLRPC.User M;
    public final LongSparseArray N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public b5 f17497a;
    public j7 f17498b;
    public q41 f17499c;
    public z1 d;
    public FrameLayout f17500e;
    public EditTextBoldCursor f17501f;
    public View h;
    public a4 f17502n;
    public TextView f17503r;
    public ImageView f17504s;
    public a0 f17505w;
    public boolean f17506x;
    public boolean f17507y;

    public q0() {
        super(null);
        this.E = 0;
        this.F = new k0(this, 4);
        this.J = TL_account.TL_businessBotRights.makeDefault();
        this.M = null;
        this.N = new LongSparseArray();
        this.O = -4;
        this.P = true;
        this.Q = false;
        this.R = false;
    }

    public static void Z(q0 q0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z9, TLRPC.User user) {
        f2 T;
        if (tL_error != null) {
            q0Var.f17497a.b(false);
            hc.d0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            q0Var.f17497a.b(false);
            k5.p(null, 2131743880, hc.a0(q0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.d.c(new ha.b(18, q0Var, tLObject));
            }
            int i7 = iArr[0] + 1;
            iArr[0] = i7;
            if (i7 == arrayList.size()) {
                f.a(q0Var.currentAccount).b();
                qp messagesController = q0Var.getMessagesController();
                messagesController.f24874r1.clear();
                messagesController.f24919w1.clear();
                q0Var.finishFragment();
                if (z9 && user != null) {
                    f2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        hc.a0(T2).Q(2131623989, 36, hd.a0(null, null, 2131752817, t10.p(user))).j();
                    }
                } else if (user != null && (T = LaunchActivity.T()) != null) {
                    hc.a0(T).Q(2131623989, 36, hd.a0(null, null, 2131752784, t10.p(user))).j();
                }
            }
        }
    }

    public static void b0(q0 q0Var, x31 x31Var, final View view) {
        if (x31Var.f40155g && !q0Var.f17505w.h(x31Var)) {
            int i7 = x31Var.d;
            if (i7 == U) {
                a0 a0Var = q0Var.f17505w;
                q0Var.I = true;
                a0Var.h = true;
                q0Var.f17499c.f37160f3.O(true);
                q0Var.d0(true);
            } else if (i7 == V) {
                a0 a0Var2 = q0Var.f17505w;
                q0Var.I = false;
                a0Var2.h = false;
                q0Var.f17499c.f37160f3.O(true);
                q0Var.d0(true);
            } else if (i7 == W) {
                q0Var.M = null;
                q0Var.f17499c.f37160f3.O(true);
                q0Var.d0(true);
            } else if (x31Var.f54439a == 13) {
                TLRPC.User user = (TLRPC.User) q0Var.N.get(x31Var.f40170x);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, q0Var.getParentActivity(), q0Var.resourceProvider);
                        String M0 = hd.M0(2131752809, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.g0.X2(hd.M0(2131752810, null));
                        alertDialog$Builder.k(hd.M0(2131747830, null), null);
                        q0Var.showDialog(u1Var);
                        return;
                    }
                    q0Var.M = user;
                    org.telegram.messenger.g0.v1(q0Var.f17501f);
                    q0Var.f17499c.f37160f3.O(true);
                    q0Var.d0(true);
                }
            } else if (i7 == X) {
                boolean z9 = !q0Var.P;
                q0Var.P = z9;
                ((q8) view).setChecked(z9);
                q0Var.f17499c.f37160f3.O(true);
            } else if (i7 == Y) {
                int i10 = -q0Var.O;
                q0Var.O = i10;
                org.telegram.messenger.g0.G3(i10, view, null);
            } else if (i7 == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights = q0Var.J;
                boolean z10 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z10;
                ((c2) view).c(z10, true);
                q0Var.f17499c.f37160f3.O(true);
                q0Var.d0(true);
            } else if (i7 == f17483a0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = q0Var.J;
                boolean z11 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z11;
                ((c2) view).c(z11, true);
                q0Var.f17499c.f37160f3.O(true);
                q0Var.d0(true);
            } else if (i7 == f17484b0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = q0Var.J;
                boolean z12 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z12;
                ((c2) view).c(z12, true);
                q0Var.f17499c.f37160f3.O(true);
                q0Var.d0(true);
            } else if (i7 == f17485c0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = q0Var.J;
                boolean z13 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z13;
                ((c2) view).c(z13, true);
                q0Var.f17499c.f37160f3.O(true);
                q0Var.d0(true);
            } else if (i7 == f17486d0) {
                boolean z14 = !q0Var.Q;
                q0Var.Q = z14;
                ((q8) view).setChecked(z14);
                q0Var.f17499c.f37160f3.O(true);
            } else if (i7 == f17487e0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = q0Var.J;
                boolean z15 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z15;
                ((c2) view).c(z15, true);
                q0Var.f17499c.f37160f3.O(true);
                q0Var.d0(true);
            } else if (i7 == f17488f0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = q0Var.J;
                boolean z16 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z16;
                ((c2) view).c(z16, true);
                q0Var.f17499c.f37160f3.O(true);
                q0Var.d0(true);
            } else if (i7 == f17489g0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = q0Var.J;
                boolean z17 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z17;
                ((c2) view).c(z17, true);
                q0Var.f17499c.f37160f3.O(true);
                q0Var.d0(true);
            } else if (i7 == f17490h0) {
                q0Var.c0(i7, !q0Var.J.edit_username, new Runnable(q0Var) {
                    public final q0 f17407b;

                    {
                        this.f17407b = q0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = this.f17407b;
                                q0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.J;
                                boolean z18 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z18;
                                ((c2) view).c(z18, true);
                                q0Var2.f17499c.f37160f3.O(true);
                                q0Var2.d0(true);
                                return;
                            case 1:
                                q0 q0Var3 = this.f17407b;
                                q0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.J;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                ((c2) view).c(z19, true);
                                q0Var3.f17499c.f37160f3.O(true);
                                q0Var3.d0(true);
                                return;
                            case 2:
                                q0 q0Var4 = this.f17407b;
                                q0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.J;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                ((c2) view).c(z20, true);
                                q0Var4.f17499c.f37160f3.O(true);
                                q0Var4.d0(true);
                                return;
                            case 3:
                                q0 q0Var5 = this.f17407b;
                                q0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.J;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                ((c2) view).c(z21, true);
                                q0Var5.f17499c.f37160f3.O(true);
                                q0Var5.d0(true);
                                return;
                            case 4:
                                q0 q0Var6 = this.f17407b;
                                q0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.J;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                ((c2) view).c(z22, true);
                                q0Var6.f17499c.f37160f3.O(true);
                                q0Var6.d0(true);
                                return;
                            default:
                                q0 q0Var7 = this.f17407b;
                                q0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.J;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                ((c2) view).c(z23, true);
                                q0Var7.f17499c.f37160f3.O(true);
                                q0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f17491i0) {
                boolean z18 = !q0Var.R;
                q0Var.R = z18;
                ((q8) view).setChecked(z18);
                q0Var.f17499c.f37160f3.O(true);
            } else if (i7 == f17492j0) {
                q0Var.c0(i7, !q0Var.J.view_gifts, new Runnable(q0Var) {
                    public final q0 f17407b;

                    {
                        this.f17407b = q0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = this.f17407b;
                                q0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.J;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                ((c2) view).c(z182, true);
                                q0Var2.f17499c.f37160f3.O(true);
                                q0Var2.d0(true);
                                return;
                            case 1:
                                q0 q0Var3 = this.f17407b;
                                q0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.J;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                ((c2) view).c(z19, true);
                                q0Var3.f17499c.f37160f3.O(true);
                                q0Var3.d0(true);
                                return;
                            case 2:
                                q0 q0Var4 = this.f17407b;
                                q0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.J;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                ((c2) view).c(z20, true);
                                q0Var4.f17499c.f37160f3.O(true);
                                q0Var4.d0(true);
                                return;
                            case 3:
                                q0 q0Var5 = this.f17407b;
                                q0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.J;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                ((c2) view).c(z21, true);
                                q0Var5.f17499c.f37160f3.O(true);
                                q0Var5.d0(true);
                                return;
                            case 4:
                                q0 q0Var6 = this.f17407b;
                                q0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.J;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                ((c2) view).c(z22, true);
                                q0Var6.f17499c.f37160f3.O(true);
                                q0Var6.d0(true);
                                return;
                            default:
                                q0 q0Var7 = this.f17407b;
                                q0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.J;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                ((c2) view).c(z23, true);
                                q0Var7.f17499c.f37160f3.O(true);
                                q0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f17493k0) {
                q0Var.c0(i7, !q0Var.J.sell_gifts, new Runnable(q0Var) {
                    public final q0 f17407b;

                    {
                        this.f17407b = q0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = this.f17407b;
                                q0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.J;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                ((c2) view).c(z182, true);
                                q0Var2.f17499c.f37160f3.O(true);
                                q0Var2.d0(true);
                                return;
                            case 1:
                                q0 q0Var3 = this.f17407b;
                                q0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.J;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                ((c2) view).c(z19, true);
                                q0Var3.f17499c.f37160f3.O(true);
                                q0Var3.d0(true);
                                return;
                            case 2:
                                q0 q0Var4 = this.f17407b;
                                q0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.J;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                ((c2) view).c(z20, true);
                                q0Var4.f17499c.f37160f3.O(true);
                                q0Var4.d0(true);
                                return;
                            case 3:
                                q0 q0Var5 = this.f17407b;
                                q0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.J;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                ((c2) view).c(z21, true);
                                q0Var5.f17499c.f37160f3.O(true);
                                q0Var5.d0(true);
                                return;
                            case 4:
                                q0 q0Var6 = this.f17407b;
                                q0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.J;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                ((c2) view).c(z22, true);
                                q0Var6.f17499c.f37160f3.O(true);
                                q0Var6.d0(true);
                                return;
                            default:
                                q0 q0Var7 = this.f17407b;
                                q0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.J;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                ((c2) view).c(z23, true);
                                q0Var7.f17499c.f37160f3.O(true);
                                q0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f17494l0) {
                q0Var.c0(i7, !q0Var.J.change_gift_settings, new Runnable(q0Var) {
                    public final q0 f17407b;

                    {
                        this.f17407b = q0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = this.f17407b;
                                q0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.J;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                ((c2) view).c(z182, true);
                                q0Var2.f17499c.f37160f3.O(true);
                                q0Var2.d0(true);
                                return;
                            case 1:
                                q0 q0Var3 = this.f17407b;
                                q0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.J;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                ((c2) view).c(z19, true);
                                q0Var3.f17499c.f37160f3.O(true);
                                q0Var3.d0(true);
                                return;
                            case 2:
                                q0 q0Var4 = this.f17407b;
                                q0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.J;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                ((c2) view).c(z20, true);
                                q0Var4.f17499c.f37160f3.O(true);
                                q0Var4.d0(true);
                                return;
                            case 3:
                                q0 q0Var5 = this.f17407b;
                                q0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.J;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                ((c2) view).c(z21, true);
                                q0Var5.f17499c.f37160f3.O(true);
                                q0Var5.d0(true);
                                return;
                            case 4:
                                q0 q0Var6 = this.f17407b;
                                q0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.J;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                ((c2) view).c(z22, true);
                                q0Var6.f17499c.f37160f3.O(true);
                                q0Var6.d0(true);
                                return;
                            default:
                                q0 q0Var7 = this.f17407b;
                                q0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.J;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                ((c2) view).c(z23, true);
                                q0Var7.f17499c.f37160f3.O(true);
                                q0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == m0) {
                q0Var.c0(i7, !q0Var.J.transfer_and_upgrade_gifts, new Runnable(q0Var) {
                    public final q0 f17407b;

                    {
                        this.f17407b = q0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = this.f17407b;
                                q0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.J;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                ((c2) view).c(z182, true);
                                q0Var2.f17499c.f37160f3.O(true);
                                q0Var2.d0(true);
                                return;
                            case 1:
                                q0 q0Var3 = this.f17407b;
                                q0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.J;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                ((c2) view).c(z19, true);
                                q0Var3.f17499c.f37160f3.O(true);
                                q0Var3.d0(true);
                                return;
                            case 2:
                                q0 q0Var4 = this.f17407b;
                                q0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.J;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                ((c2) view).c(z20, true);
                                q0Var4.f17499c.f37160f3.O(true);
                                q0Var4.d0(true);
                                return;
                            case 3:
                                q0 q0Var5 = this.f17407b;
                                q0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.J;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                ((c2) view).c(z21, true);
                                q0Var5.f17499c.f37160f3.O(true);
                                q0Var5.d0(true);
                                return;
                            case 4:
                                q0 q0Var6 = this.f17407b;
                                q0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.J;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                ((c2) view).c(z22, true);
                                q0Var6.f17499c.f37160f3.O(true);
                                q0Var6.d0(true);
                                return;
                            default:
                                q0 q0Var7 = this.f17407b;
                                q0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.J;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                ((c2) view).c(z23, true);
                                q0Var7.f17499c.f37160f3.O(true);
                                q0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f17495n0) {
                q0Var.c0(i7, !q0Var.J.transfer_stars, new Runnable(q0Var) {
                    public final q0 f17407b;

                    {
                        this.f17407b = q0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = this.f17407b;
                                q0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.J;
                                boolean z182 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z182;
                                ((c2) view).c(z182, true);
                                q0Var2.f17499c.f37160f3.O(true);
                                q0Var2.d0(true);
                                return;
                            case 1:
                                q0 q0Var3 = this.f17407b;
                                q0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.J;
                                boolean z19 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z19;
                                ((c2) view).c(z19, true);
                                q0Var3.f17499c.f37160f3.O(true);
                                q0Var3.d0(true);
                                return;
                            case 2:
                                q0 q0Var4 = this.f17407b;
                                q0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.J;
                                boolean z20 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z20;
                                ((c2) view).c(z20, true);
                                q0Var4.f17499c.f37160f3.O(true);
                                q0Var4.d0(true);
                                return;
                            case 3:
                                q0 q0Var5 = this.f17407b;
                                q0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.J;
                                boolean z21 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z21;
                                ((c2) view).c(z21, true);
                                q0Var5.f17499c.f37160f3.O(true);
                                q0Var5.d0(true);
                                return;
                            case 4:
                                q0 q0Var6 = this.f17407b;
                                q0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.J;
                                boolean z22 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z22;
                                ((c2) view).c(z22, true);
                                q0Var6.f17499c.f37160f3.O(true);
                                q0Var6.d0(true);
                                return;
                            default:
                                q0 q0Var7 = this.f17407b;
                                q0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.J;
                                boolean z23 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z23;
                                ((c2) view).c(z23, true);
                                q0Var7.f17499c.f37160f3.O(true);
                                q0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f17496o0) {
                q0Var.c0(i7, !q0Var.J.manage_stories, new k0(q0Var, 0));
            }
        }
    }

    public final void c0(int i7, boolean z9, final Runnable runnable) {
        if (!this.K && i7 == f17490h0 && z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = hd.M0(2131752787, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752788, t10.n(this.M)));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            alertDialog$Builder.k(hd.M0(2131754284, null), new org.telegram.ui.ActionBar.r1(this) {
                public final q0 f17472b;

                {
                    this.f17472b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i10) {
                    switch (r3) {
                        case 0:
                            this.f17472b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f17472b.L = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        } else if (!this.L && z9 && (i7 == f17493k0 || i7 == f17494l0 || i7 == m0 || i7 == f17495n0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M02 = hd.M0(2131752787, null);
            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27293a;
            u1Var2.R = M02;
            u1Var2.T = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752801, t10.n(this.M)));
            alertDialog$Builder2.h(hd.M0(2131752589, null), null);
            alertDialog$Builder2.k(hd.M0(2131754284, null), new org.telegram.ui.ActionBar.r1(this) {
                public final q0 f17472b;

                {
                    this.f17472b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var22, int i10) {
                    switch (r3) {
                        case 0:
                            this.f17472b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f17472b.L = true;
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
        this.simpleActionBar.setTitle(hd.M0(2131752783, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 13));
        this.f17497a = this.simpleActionBar.n(hd.M0(2131745947, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f17501f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        r6.E(this.f17501f, k6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f17501f;
        int i11 = k6.G6;
        r6.V(editTextBoldCursor2, i11, null);
        this.f17501f.setBackgroundDrawable(null);
        this.f17501f.setMaxLines(1);
        this.f17501f.setLines(1);
        this.f17501f.setPadding(0, 0, 0, 0);
        this.f17501f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f17501f;
        if (hd.f22878a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor3.setGravity(i7 | 48);
        this.f17501f.setInputType(180224);
        this.f17501f.setImeOptions(6);
        this.f17501f.setHint(hd.M0(2131752816, null));
        r6.w(this.f17501f, i11, null);
        this.f17501f.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f17501f.setCursorWidth(1.5f);
        this.f17501f.setOnEditorActionListener(new bi.p(this, 1));
        this.f17501f.addTextChangedListener(new ah.j(this, 9));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f17500e = frameLayout2;
        frameLayout2.addView(this.f17501f, ha.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f17500e;
        int i12 = k6.f27849d6;
        r6.i(i12, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.h = view;
        r6.i(k6.f27850d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.f17500e;
        View view2 = this.h;
        float f10 = 1.0f / org.telegram.messenger.g0.f22543p;
        boolean z9 = hd.f22878a0;
        int i13 = 21;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 21;
        }
        float f11 = i10;
        if (!z9) {
            i13 = 0;
        }
        frameLayout4.addView(view2, ha.d(-1, f10, 87, f11, 0.0f, i13, 0.0f));
        a4 a4Var = new a4(context, 3);
        this.f17502n = a4Var;
        r6.i(i12, a4Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.f17503r = textView;
        textView.setText(hd.M0(2131752811, null));
        this.f17503r.setTextSize(1, 14.0f);
        TextView textView2 = this.f17503r;
        int i14 = k6.f28259z6;
        r6.V(textView2, i14, getResourceProvider());
        this.f17502n.addView(this.f17503r, ha.e(-2, -2, 17));
        this.f17504s = new ImageView(context);
        j7 j7Var = new j7(getThemedColor(i14));
        this.f17504s.setScaleType(ImageView.ScaleType.CENTER);
        this.f17504s.setImageDrawable(j7Var);
        this.f17498b = j7Var;
        this.f17502n.addView(this.f17504s, ha.e(-2, -2, 17));
        this.f17504s.setAlpha(0.0f);
        this.f17504s.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        z1 z1Var = new z1(true);
        this.d = z1Var;
        z1Var.f16989a = new gf.g(this, 8);
        a0 a0Var = new a0(this, new k0(this, 3));
        this.f17505w = a0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.H;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        a0Var.i(tL_businessBotRecipients);
        q41 q41Var = new q41(this, new hi.u1(this, 8), new n0(this, 3), null);
        this.f17499c = q41Var;
        q41Var.r1();
        this.f17499c.setSectionsDrawBackground(true);
        q41 q41Var2 = this.f17499c;
        q41Var2.f37160f3.f35510r = false;
        frameLayout.addView(q41Var2, ha.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z9) {
        if (this.f17497a == null) {
            return;
        }
        this.f17497a.a(e0(), z9);
    }

    public final boolean e0() {
        boolean z9;
        boolean z10;
        long j3;
        a0 a0Var;
        if (this.T) {
            TLRPC.User user = this.M;
            if (user != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            TL_account.TL_connectedBot tL_connectedBot = this.H;
            if (tL_connectedBot != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z9 == z10) {
                long j10 = 0;
                if (user == null) {
                    j3 = 0;
                } else {
                    j3 = user.f27102id;
                }
                if (tL_connectedBot != null) {
                    j10 = tL_connectedBot.bot_id;
                }
                if (j3 == j10 && (user == null || (this.J.equals(tL_connectedBot.rights) && ((a0Var = this.f17505w) == null || !a0Var.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f0() {
        boolean z9;
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (!this.f17497a.f27355y.f55395f) {
            if (!e0()) {
                finishFragment();
            } else if (this.f17505w.k(this.f17499c)) {
                TLRPC.User user2 = this.M;
                if (user2 != null && ((tL_connectedBot = this.H) == null || tL_connectedBot.bot_id != user2.f27102id)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.H;
                if (tL_connectedBot2 != null && ((user = this.M) == null || tL_connectedBot2.bot_id != user.f27102id)) {
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = getMessagesController().o1(this.H.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    arrayList.add(updateconnectedbot);
                }
                if (this.M != null) {
                    TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                    updateconnectedbot2.deleted = false;
                    updateconnectedbot2.rights = this.J;
                    updateconnectedbot2.bot = getMessagesController().q1(this.M);
                    updateconnectedbot2.recipients = this.f17505w.b();
                    arrayList.add(updateconnectedbot2);
                    TL_account.TL_connectedBot tL_connectedBot3 = this.H;
                    if (tL_connectedBot3 != null) {
                        tL_connectedBot3.bot_id = this.M.f27102id;
                        tL_connectedBot3.recipients = this.f17505w.c();
                        this.H.rights = this.J;
                    }
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    getConnectionsManager().sendRequest((TLObject) arrayList.get(i7), new l0(this, iArr, arrayList, z9, user2));
                }
            }
        }
    }

    public final void g0() {
        boolean z9;
        float f10;
        float f11;
        boolean z10 = this.f17506x;
        boolean e10 = this.d.e();
        boolean z11 = true;
        LongSparseArray longSparseArray = this.N;
        if (!e10 && !this.f17507y && longSparseArray.size() <= 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z10 != z9) {
            if (!this.d.e() && !this.f17507y && longSparseArray.size() <= 0) {
                z11 = false;
            }
            this.f17506x = z11;
            ViewPropertyAnimator animate = this.f17503r.animate();
            float f12 = 1.0f;
            float f13 = 0.0f;
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (z11) {
                f11 = -org.telegram.messenger.g0.L(8.0f);
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = alpha.translationY(f11).setDuration(320L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).start();
            ViewPropertyAnimator animate2 = this.f17504s.animate();
            if (!z11) {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f12);
            if (!z11) {
                f13 = org.telegram.messenger.g0.L(8.0f);
            }
            alpha2.translationY(f13).setDuration(320L).setInterpolator(xqVar).start();
        }
    }

    @Override
    public final pj0 getListViewForSimpleGlass() {
        return this.f17499c;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (e0()) {
            if (z9) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = hd.M0(2131743836, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                u1Var.R = M0;
                u1Var.T = hd.M0(2131752786, null);
                alertDialog$Builder.k(hd.M0(2131754216, null), new n0(this, 0));
                alertDialog$Builder.h(hd.M0(2131747579, null), new n0(this, 1));
                showDialog(u1Var);
                return false;
            }
        } else if (this.M != null || e0() || (this.d.d.isEmpty() && this.d.f16992e.isEmpty())) {
            return super.onBackPressed(z9);
        } else {
            if (z9) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = hd.M0(2131752812, null);
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27293a;
                u1Var2.R = M02;
                u1Var2.T = hd.M0(2131752813, null);
                alertDialog$Builder2.k(hd.M0(2131752814, null), new n0(this, 2));
                alertDialog$Builder2.h(hd.M0(2131752589, null), null);
                showDialog(u1Var2);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.S && !this.T) {
            this.S = true;
            f.a(this.currentAccount).c(new ii.c(this, 5));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            j7 j7Var = this.f17498b;
            if (j7Var != null) {
                j7Var.b(getThemedColor(k6.f28259z6));
                ImageView imageView = this.f17504s;
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
