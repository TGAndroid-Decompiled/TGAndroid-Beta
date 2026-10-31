package ag;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.m5;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.LaunchActivity;
import w7.b6;
public final class t1 extends org.telegram.ui.ActionBar.k2 {
    public static final int U = -1;
    public static final int V = -2;
    public static final int W = -3;
    public static final int X = -4;
    public static final int Y = -5;
    public static final int Z = -6;
    public static final int f713a0 = -7;
    public static final int f714b0 = -8;
    public static final int f715c0 = -9;
    public static final int f716d0 = -10;
    public static final int f717e0 = -11;
    public static final int f718f0 = -12;
    public static final int f719g0 = -13;
    public static final int f720h0 = -14;
    public static final int f721i0 = -15;
    public static final int f722j0 = -16;
    public static final int f723k0 = -17;
    public static final int f724l0 = -18;
    public static final int m0 = -19;
    public static final int f725n0 = -20;
    public static final int f726o0 = -21;
    public String D;
    public int E;
    public final l1 F;
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
    public l5 f727a;
    public s1 f728b;
    public u51 f729c;
    public zf.m1 d;
    public FrameLayout e;
    public EditTextBoldCursor f730f;
    public View h;
    public a5 f731n;
    public TextView f732r;
    public ImageView f733s;
    public x0 f734w;
    public boolean f735x;
    public boolean f736y;

    public t1() {
        super(null);
        this.E = 0;
        this.F = new l1(this, 4);
        this.J = TL_account.TL_businessBotRights.makeDefault();
        this.M = null;
        this.N = new LongSparseArray();
        this.O = -4;
        this.P = true;
        this.Q = false;
        this.R = false;
    }

    public static void Y(t1 t1Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        org.telegram.ui.ActionBar.k2 T;
        if (tL_error != null) {
            t1Var.f727a.b(false);
            cc.d0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            t1Var.f727a.b(false);
            m5.o(null, 2131743904, cc.a0(t1Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.d.c(new a1.f(9, t1Var, tLObject));
            }
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                k.a(t1Var.currentAccount).b();
                vp messagesController = t1Var.getMessagesController();
                messagesController.f18885r1.clear();
                messagesController.f18932w1.clear();
                t1Var.finishFragment();
                if (z10 && user != null) {
                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        cc.a0(T2).Q(2131623989, 36, cd.a0(null, null, 2131752817, h20.p(user))).j();
                    }
                } else if (user != null && (T = LaunchActivity.T()) != null) {
                    cc.a0(T).Q(2131623989, 36, cd.a0(null, null, 2131752784, h20.p(user))).j();
                }
            }
        }
    }

    public static void a0(t1 t1Var, a51 a51Var, final View view) {
        if (a51Var.f24288g && !t1Var.f734w.h(a51Var)) {
            int i10 = a51Var.d;
            if (i10 == U) {
                x0 x0Var = t1Var.f734w;
                t1Var.I = true;
                x0Var.h = true;
                t1Var.f729c.f30819f3.O(true);
                t1Var.c0(true);
            } else if (i10 == V) {
                x0 x0Var2 = t1Var.f734w;
                t1Var.I = false;
                x0Var2.h = false;
                t1Var.f729c.f30819f3.O(true);
                t1Var.c0(true);
            } else if (i10 == W) {
                t1Var.M = null;
                t1Var.f729c.f30819f3.O(true);
                t1Var.c0(true);
            } else if (a51Var.f7680a == 13) {
                TLRPC.User user = (TLRPC.User) t1Var.N.get(a51Var.f24303x);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, t1Var.getParentActivity(), t1Var.resourceProvider);
                        String L0 = cd.L0(2131752809, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.i0.W2(cd.L0(2131752810, null));
                        alertDialog$Builder.k(cd.L0(2131747847, null), null);
                        t1Var.showDialog(x1Var);
                        return;
                    }
                    t1Var.M = user;
                    org.telegram.messenger.i0.v1(t1Var.f730f);
                    t1Var.f729c.f30819f3.O(true);
                    t1Var.c0(true);
                }
            } else if (i10 == X) {
                boolean z10 = !t1Var.P;
                t1Var.P = z10;
                ((s8) view).setChecked(z10);
                t1Var.f729c.f30819f3.O(true);
            } else if (i10 == Y) {
                int i11 = -t1Var.O;
                t1Var.O = i11;
                org.telegram.messenger.i0.F3(i11, view, null);
            } else if (i10 == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights = t1Var.J;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((org.telegram.ui.Cells.c2) view).c(z11, true);
                t1Var.f729c.f30819f3.O(true);
                t1Var.c0(true);
            } else if (i10 == f713a0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = t1Var.J;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((org.telegram.ui.Cells.c2) view).c(z12, true);
                t1Var.f729c.f30819f3.O(true);
                t1Var.c0(true);
            } else if (i10 == f714b0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = t1Var.J;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((org.telegram.ui.Cells.c2) view).c(z13, true);
                t1Var.f729c.f30819f3.O(true);
                t1Var.c0(true);
            } else if (i10 == f715c0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = t1Var.J;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((org.telegram.ui.Cells.c2) view).c(z14, true);
                t1Var.f729c.f30819f3.O(true);
                t1Var.c0(true);
            } else if (i10 == f716d0) {
                boolean z15 = !t1Var.Q;
                t1Var.Q = z15;
                ((s8) view).setChecked(z15);
                t1Var.f729c.f30819f3.O(true);
            } else if (i10 == f717e0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = t1Var.J;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((org.telegram.ui.Cells.c2) view).c(z16, true);
                t1Var.f729c.f30819f3.O(true);
                t1Var.c0(true);
            } else if (i10 == f718f0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = t1Var.J;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((org.telegram.ui.Cells.c2) view).c(z17, true);
                t1Var.f729c.f30819f3.O(true);
                t1Var.c0(true);
            } else if (i10 == f719g0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = t1Var.J;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((org.telegram.ui.Cells.c2) view).c(z18, true);
                t1Var.f729c.f30819f3.O(true);
                t1Var.c0(true);
            } else if (i10 == f720h0) {
                t1Var.b0(i10, !t1Var.J.edit_username, new Runnable(t1Var) {
                    public final t1 f602b;

                    {
                        this.f602b = t1Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t1 t1Var2 = this.f602b;
                                t1Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t1Var2.J;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((org.telegram.ui.Cells.c2) view).c(z19, true);
                                t1Var2.f729c.f30819f3.O(true);
                                t1Var2.c0(true);
                                return;
                            case 1:
                                t1 t1Var3 = this.f602b;
                                t1Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t1Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.c2) view).c(z20, true);
                                t1Var3.f729c.f30819f3.O(true);
                                t1Var3.c0(true);
                                return;
                            case 2:
                                t1 t1Var4 = this.f602b;
                                t1Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t1Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.c2) view).c(z21, true);
                                t1Var4.f729c.f30819f3.O(true);
                                t1Var4.c0(true);
                                return;
                            case 3:
                                t1 t1Var5 = this.f602b;
                                t1Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t1Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.c2) view).c(z22, true);
                                t1Var5.f729c.f30819f3.O(true);
                                t1Var5.c0(true);
                                return;
                            case 4:
                                t1 t1Var6 = this.f602b;
                                t1Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t1Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.c2) view).c(z23, true);
                                t1Var6.f729c.f30819f3.O(true);
                                t1Var6.c0(true);
                                return;
                            default:
                                t1 t1Var7 = this.f602b;
                                t1Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t1Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.c2) view).c(z24, true);
                                t1Var7.f729c.f30819f3.O(true);
                                t1Var7.c0(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f721i0) {
                boolean z19 = !t1Var.R;
                t1Var.R = z19;
                ((s8) view).setChecked(z19);
                t1Var.f729c.f30819f3.O(true);
            } else if (i10 == f722j0) {
                t1Var.b0(i10, !t1Var.J.view_gifts, new Runnable(t1Var) {
                    public final t1 f602b;

                    {
                        this.f602b = t1Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t1 t1Var2 = this.f602b;
                                t1Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t1Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.c2) view).c(z192, true);
                                t1Var2.f729c.f30819f3.O(true);
                                t1Var2.c0(true);
                                return;
                            case 1:
                                t1 t1Var3 = this.f602b;
                                t1Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t1Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.c2) view).c(z20, true);
                                t1Var3.f729c.f30819f3.O(true);
                                t1Var3.c0(true);
                                return;
                            case 2:
                                t1 t1Var4 = this.f602b;
                                t1Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t1Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.c2) view).c(z21, true);
                                t1Var4.f729c.f30819f3.O(true);
                                t1Var4.c0(true);
                                return;
                            case 3:
                                t1 t1Var5 = this.f602b;
                                t1Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t1Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.c2) view).c(z22, true);
                                t1Var5.f729c.f30819f3.O(true);
                                t1Var5.c0(true);
                                return;
                            case 4:
                                t1 t1Var6 = this.f602b;
                                t1Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t1Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.c2) view).c(z23, true);
                                t1Var6.f729c.f30819f3.O(true);
                                t1Var6.c0(true);
                                return;
                            default:
                                t1 t1Var7 = this.f602b;
                                t1Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t1Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.c2) view).c(z24, true);
                                t1Var7.f729c.f30819f3.O(true);
                                t1Var7.c0(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f723k0) {
                t1Var.b0(i10, !t1Var.J.sell_gifts, new Runnable(t1Var) {
                    public final t1 f602b;

                    {
                        this.f602b = t1Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t1 t1Var2 = this.f602b;
                                t1Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t1Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.c2) view).c(z192, true);
                                t1Var2.f729c.f30819f3.O(true);
                                t1Var2.c0(true);
                                return;
                            case 1:
                                t1 t1Var3 = this.f602b;
                                t1Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t1Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.c2) view).c(z20, true);
                                t1Var3.f729c.f30819f3.O(true);
                                t1Var3.c0(true);
                                return;
                            case 2:
                                t1 t1Var4 = this.f602b;
                                t1Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t1Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.c2) view).c(z21, true);
                                t1Var4.f729c.f30819f3.O(true);
                                t1Var4.c0(true);
                                return;
                            case 3:
                                t1 t1Var5 = this.f602b;
                                t1Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t1Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.c2) view).c(z22, true);
                                t1Var5.f729c.f30819f3.O(true);
                                t1Var5.c0(true);
                                return;
                            case 4:
                                t1 t1Var6 = this.f602b;
                                t1Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t1Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.c2) view).c(z23, true);
                                t1Var6.f729c.f30819f3.O(true);
                                t1Var6.c0(true);
                                return;
                            default:
                                t1 t1Var7 = this.f602b;
                                t1Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t1Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.c2) view).c(z24, true);
                                t1Var7.f729c.f30819f3.O(true);
                                t1Var7.c0(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f724l0) {
                t1Var.b0(i10, !t1Var.J.change_gift_settings, new Runnable(t1Var) {
                    public final t1 f602b;

                    {
                        this.f602b = t1Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t1 t1Var2 = this.f602b;
                                t1Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t1Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.c2) view).c(z192, true);
                                t1Var2.f729c.f30819f3.O(true);
                                t1Var2.c0(true);
                                return;
                            case 1:
                                t1 t1Var3 = this.f602b;
                                t1Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t1Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.c2) view).c(z20, true);
                                t1Var3.f729c.f30819f3.O(true);
                                t1Var3.c0(true);
                                return;
                            case 2:
                                t1 t1Var4 = this.f602b;
                                t1Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t1Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.c2) view).c(z21, true);
                                t1Var4.f729c.f30819f3.O(true);
                                t1Var4.c0(true);
                                return;
                            case 3:
                                t1 t1Var5 = this.f602b;
                                t1Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t1Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.c2) view).c(z22, true);
                                t1Var5.f729c.f30819f3.O(true);
                                t1Var5.c0(true);
                                return;
                            case 4:
                                t1 t1Var6 = this.f602b;
                                t1Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t1Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.c2) view).c(z23, true);
                                t1Var6.f729c.f30819f3.O(true);
                                t1Var6.c0(true);
                                return;
                            default:
                                t1 t1Var7 = this.f602b;
                                t1Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t1Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.c2) view).c(z24, true);
                                t1Var7.f729c.f30819f3.O(true);
                                t1Var7.c0(true);
                                return;
                        }
                    }
                });
            } else if (i10 == m0) {
                t1Var.b0(i10, !t1Var.J.transfer_and_upgrade_gifts, new Runnable(t1Var) {
                    public final t1 f602b;

                    {
                        this.f602b = t1Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t1 t1Var2 = this.f602b;
                                t1Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t1Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.c2) view).c(z192, true);
                                t1Var2.f729c.f30819f3.O(true);
                                t1Var2.c0(true);
                                return;
                            case 1:
                                t1 t1Var3 = this.f602b;
                                t1Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t1Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.c2) view).c(z20, true);
                                t1Var3.f729c.f30819f3.O(true);
                                t1Var3.c0(true);
                                return;
                            case 2:
                                t1 t1Var4 = this.f602b;
                                t1Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t1Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.c2) view).c(z21, true);
                                t1Var4.f729c.f30819f3.O(true);
                                t1Var4.c0(true);
                                return;
                            case 3:
                                t1 t1Var5 = this.f602b;
                                t1Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t1Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.c2) view).c(z22, true);
                                t1Var5.f729c.f30819f3.O(true);
                                t1Var5.c0(true);
                                return;
                            case 4:
                                t1 t1Var6 = this.f602b;
                                t1Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t1Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.c2) view).c(z23, true);
                                t1Var6.f729c.f30819f3.O(true);
                                t1Var6.c0(true);
                                return;
                            default:
                                t1 t1Var7 = this.f602b;
                                t1Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t1Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.c2) view).c(z24, true);
                                t1Var7.f729c.f30819f3.O(true);
                                t1Var7.c0(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f725n0) {
                t1Var.b0(i10, !t1Var.J.transfer_stars, new Runnable(t1Var) {
                    public final t1 f602b;

                    {
                        this.f602b = t1Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t1 t1Var2 = this.f602b;
                                t1Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t1Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.c2) view).c(z192, true);
                                t1Var2.f729c.f30819f3.O(true);
                                t1Var2.c0(true);
                                return;
                            case 1:
                                t1 t1Var3 = this.f602b;
                                t1Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t1Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.c2) view).c(z20, true);
                                t1Var3.f729c.f30819f3.O(true);
                                t1Var3.c0(true);
                                return;
                            case 2:
                                t1 t1Var4 = this.f602b;
                                t1Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t1Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.c2) view).c(z21, true);
                                t1Var4.f729c.f30819f3.O(true);
                                t1Var4.c0(true);
                                return;
                            case 3:
                                t1 t1Var5 = this.f602b;
                                t1Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t1Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.c2) view).c(z22, true);
                                t1Var5.f729c.f30819f3.O(true);
                                t1Var5.c0(true);
                                return;
                            case 4:
                                t1 t1Var6 = this.f602b;
                                t1Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t1Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.c2) view).c(z23, true);
                                t1Var6.f729c.f30819f3.O(true);
                                t1Var6.c0(true);
                                return;
                            default:
                                t1 t1Var7 = this.f602b;
                                t1Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t1Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.c2) view).c(z24, true);
                                t1Var7.f729c.f30819f3.O(true);
                                t1Var7.c0(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f726o0) {
                t1Var.b0(i10, !t1Var.J.manage_stories, new l1(t1Var, 0));
            }
        }
    }

    public final void b0(int i10, boolean z10, final Runnable runnable) {
        if (!this.K && i10 == f720h0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String L0 = cd.L0(2131752787, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131752788, h20.n(this.M)));
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
            alertDialog$Builder.k(cd.L0(2131754284, null), new org.telegram.ui.ActionBar.u1(this) {
                public final t1 f686b;

                {
                    this.f686b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i11) {
                    switch (r3) {
                        case 0:
                            this.f686b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f686b.L = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        } else if (!this.L && z10 && (i10 == f723k0 || i10 == f724l0 || i10 == m0 || i10 == f725n0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String L02 = cd.L0(2131752787, null);
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
            x1Var2.R = L02;
            x1Var2.T = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131752801, h20.n(this.M)));
            alertDialog$Builder2.h(cd.L0(2131752589, null), null);
            alertDialog$Builder2.k(cd.L0(2131754284, null), new org.telegram.ui.ActionBar.u1(this) {
                public final t1 f686b;

                {
                    this.f686b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i11) {
                    switch (r3) {
                        case 0:
                            this.f686b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f686b.L = true;
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

    public final void c0(boolean z10) {
        if (this.f727a == null) {
            return;
        }
        this.f727a.a(d0(), z10);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(cd.L0(2131752783, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 2));
        this.f727a = this.simpleActionBar.n(cd.L0(2131745963, null));
        c0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f730f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        a7.E(this.f730f, t6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f730f;
        int i12 = t6.G6;
        a7.V(editTextBoldCursor2, i12, null);
        this.f730f.setBackgroundDrawable(null);
        this.f730f.setMaxLines(1);
        this.f730f.setLines(1);
        this.f730f.setPadding(0, 0, 0, 0);
        this.f730f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f730f;
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor3.setGravity(i10 | 48);
        this.f730f.setInputType(180224);
        this.f730f.setImeOptions(6);
        this.f730f.setHint(cd.L0(2131752816, null));
        a7.w(this.f730f, i12, null);
        this.f730f.setCursorSize(org.telegram.messenger.i0.L(19.0f));
        this.f730f.setCursorWidth(1.5f);
        this.f730f.setOnEditorActionListener(new r1(this, 0));
        this.f730f.addTextChangedListener(new a1(this, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f730f, b6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i13 = t6.f20929d6;
        a7.i(i13, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.h = view;
        a7.i(t6.f20930d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f7 = 1.0f / org.telegram.messenger.i0.f16025p;
        boolean z10 = cd.X;
        int i14 = 21;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 21;
        }
        float f10 = i11;
        if (!z10) {
            i14 = 0;
        }
        frameLayout4.addView(view2, b6.d(-1, f7, 87, f10, 0.0f, i14, 0.0f));
        a5 a5Var = new a5(context, 1);
        this.f731n = a5Var;
        a7.i(i13, a5Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.f732r = textView;
        textView.setText(cd.L0(2131752811, null));
        this.f732r.setTextSize(1, 14.0f);
        TextView textView2 = this.f732r;
        int i15 = t6.f21330z6;
        a7.V(textView2, i15, getResourceProvider());
        this.f731n.addView(this.f732r, b6.e(-2, -2, 17));
        this.f733s = new ImageView(context);
        s1 s1Var = new s1(getThemedColor(i15));
        this.f733s.setScaleType(ImageView.ScaleType.CENTER);
        this.f733s.setImageDrawable(s1Var);
        this.f728b = s1Var;
        this.f731n.addView(this.f733s, b6.e(-2, -2, 17));
        this.f733s.setAlpha(0.0f);
        this.f733s.setTranslationY(org.telegram.messenger.i0.L(8.0f));
        zf.m1 m1Var = new zf.m1(true);
        this.d = m1Var;
        m1Var.f55575a = new a6.i(this, 3);
        x0 x0Var = new x0(this, new l1(this, 3));
        this.f734w = x0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.H;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        x0Var.i(tL_businessBotRecipients);
        u51 u51Var = new u51(this, new a(this, 3), new o1(this, 3), null);
        this.f729c = u51Var;
        u51Var.r1();
        this.f729c.setSectionsDrawBackground(true);
        u51 u51Var2 = this.f729c;
        u51Var2.f30819f3.f29295r = false;
        frameLayout.addView(u51Var2, b6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final boolean d0() {
        boolean z10;
        boolean z11;
        long j10;
        x0 x0Var;
        if (this.T) {
            TLRPC.User user = this.M;
            if (user != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            TL_account.TL_connectedBot tL_connectedBot = this.H;
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
                    j10 = user.f19942id;
                }
                if (tL_connectedBot != null) {
                    j11 = tL_connectedBot.bot_id;
                }
                if (j10 == j11 && (user == null || (this.J.equals(tL_connectedBot.rights) && ((x0Var = this.f734w) == null || !x0Var.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void e0() {
        boolean z10;
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (!this.f727a.f20547y.f7021f) {
            if (!d0()) {
                finishFragment();
            } else if (this.f734w.k(this.f729c)) {
                TLRPC.User user2 = this.M;
                if (user2 != null && ((tL_connectedBot = this.H) == null || tL_connectedBot.bot_id != user2.f19942id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.H;
                if (tL_connectedBot2 != null && ((user = this.M) == null || tL_connectedBot2.bot_id != user.f19942id)) {
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = getMessagesController().n1(this.H.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    arrayList.add(updateconnectedbot);
                }
                if (this.M != null) {
                    TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                    updateconnectedbot2.deleted = false;
                    updateconnectedbot2.rights = this.J;
                    updateconnectedbot2.bot = getMessagesController().p1(this.M);
                    updateconnectedbot2.recipients = this.f734w.b();
                    arrayList.add(updateconnectedbot2);
                    TL_account.TL_connectedBot tL_connectedBot3 = this.H;
                    if (tL_connectedBot3 != null) {
                        tL_connectedBot3.bot_id = this.M.f19942id;
                        tL_connectedBot3.recipients = this.f734w.c();
                        this.H.rights = this.J;
                    }
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    getConnectionsManager().sendRequest((TLObject) arrayList.get(i10), new m1(this, iArr, arrayList, z10, user2));
                }
            }
        }
    }

    public final void f0() {
        boolean z10;
        float f7;
        float f10;
        boolean z11 = this.f735x;
        boolean e = this.d.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.N;
        if (!e && !this.f736y && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.d.e() && !this.f736y && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f735x = z12;
            ViewPropertyAnimator animate = this.f732r.animate();
            float f11 = 1.0f;
            float f12 = 0.0f;
            if (z12) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (z12) {
                f10 = -org.telegram.messenger.i0.L(8.0f);
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = alpha.translationY(f10).setDuration(320L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).start();
            ViewPropertyAnimator animate2 = this.f733s.animate();
            if (!z12) {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (!z12) {
                f12 = org.telegram.messenger.i0.L(8.0f);
            }
            alpha2.translationY(f12).setDuration(320L).setInterpolator(grVar).start();
        }
    }

    @Override
    public final tk0 getListViewForSimpleGlass() {
        return this.f729c;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (d0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = cd.L0(2131743860, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = cd.L0(2131752786, null);
                alertDialog$Builder.k(cd.L0(2131754216, null), new o1(this, 0));
                alertDialog$Builder.h(cd.L0(2131747596, null), new o1(this, 1));
                showDialog(x1Var);
                return false;
            }
        } else if (this.M != null || d0() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String L02 = cd.L0(2131752812, null);
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                x1Var2.R = L02;
                x1Var2.T = cd.L0(2131752813, null);
                alertDialog$Builder2.k(cd.L0(2131752814, null), new o1(this, 2));
                alertDialog$Builder2.h(cd.L0(2131752589, null), null);
                showDialog(x1Var2);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.S && !this.T) {
            this.S = true;
            k.a(this.currentAccount).c(new l(this, 2));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            s1 s1Var = this.f728b;
            if (s1Var != null) {
                s1Var.b(getThemedColor(t6.f21330z6));
                ImageView imageView = this.f733s;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
