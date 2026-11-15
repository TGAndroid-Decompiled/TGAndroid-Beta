package kg;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.x4;
import c8.ja;
import hi.g7;
import hi.h4;
import hi.i7;
import hi.q4;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
public final class q0 extends e2 {
    public static final int V = -1;
    public static final int W = -2;
    public static final int X = -3;
    public static final int Y = -4;
    public static final int Z = -5;
    public static final int f18044a0 = -6;
    public static final int f18045b0 = -7;
    public static final int f18046c0 = -8;
    public static final int f18047d0 = -9;
    public static final int f18048e0 = -10;
    public static final int f18049f0 = -11;
    public static final int f18050g0 = -12;
    public static final int f18051h0 = -13;
    public static final int f18052i0 = -14;
    public static final int f18053j0 = -15;
    public static final int f18054k0 = -16;
    public static final int f18055l0 = -17;
    public static final int m0 = -18;
    public static final int f18056n0 = -19;
    public static final int f18057o0 = -20;
    public static final int f18058p0 = -21;
    public String E;
    public int F;
    public final k0 G;
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
    public z4 f18059a;
    public i7 f18060b;
    public u41 f18061c;
    public jg.z1 d;
    public FrameLayout f18062e;
    public EditTextBoldCursor f18063f;
    public View h;
    public bi.v1 f18064n;
    public TextView f18065r;
    public ImageView f18066s;
    public a0 f18067w;
    public boolean f18068x;
    public boolean f18069y;

    public q0() {
        super(null);
        this.F = 0;
        this.G = new k0(this, 4);
        this.K = TL_account.TL_businessBotRights.makeDefault();
        this.N = null;
        this.O = new LongSparseArray();
        this.P = -4;
        this.Q = true;
        this.R = false;
        this.S = false;
    }

    public static void Z(q0 q0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        e2 T;
        if (tL_error != null) {
            q0Var.f18059a.b(false);
            cc.d0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            q0Var.f18059a.b(false);
            k5.o(null, 2131743879, cc.a0(q0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.d.c(new h4(28, q0Var, tLObject));
            }
            int i7 = iArr[0] + 1;
            iArr[0] = i7;
            if (i7 == arrayList.size()) {
                f.a(q0Var.currentAccount).b();
                np messagesController = q0Var.getMessagesController();
                messagesController.f25387s1.clear();
                messagesController.f25432x1.clear();
                q0Var.finishFragment();
                if (z10 && user != null) {
                    e2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        cc.a0(T2).Q(2131623990, 36, hd.a0(null, null, 2131752817, q10.p(user))).j();
                    }
                } else if (user != null && (T = LaunchActivity.T()) != null) {
                    cc.a0(T).Q(2131623990, 36, hd.a0(null, null, 2131752784, q10.p(user))).j();
                }
            }
        }
    }

    public static void b0(q0 q0Var, b41 b41Var, final View view) {
        if (b41Var.f33177g && !q0Var.f18067w.h(b41Var)) {
            int i7 = b41Var.d;
            if (i7 == V) {
                a0 a0Var = q0Var.f18067w;
                q0Var.J = true;
                a0Var.h = true;
                q0Var.f18061c.f39895g3.O(true);
                q0Var.d0(true);
            } else if (i7 == W) {
                a0 a0Var2 = q0Var.f18067w;
                q0Var.J = false;
                a0Var2.h = false;
                q0Var.f18061c.f39895g3.O(true);
                q0Var.d0(true);
            } else if (i7 == X) {
                q0Var.N = null;
                q0Var.f18061c.f39895g3.O(true);
                q0Var.d0(true);
            } else if (b41Var.f56015a == 13) {
                TLRPC.User user = (TLRPC.User) q0Var.O.get(b41Var.f33192x);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, q0Var.getParentActivity(), q0Var.resourceProvider);
                        String M0 = hd.M0(2131752809, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.g0.X2(hd.M0(2131752810, null));
                        alertDialog$Builder.k(hd.M0(2131747831, null), null);
                        q0Var.showDialog(t1Var);
                        return;
                    }
                    q0Var.N = user;
                    org.telegram.messenger.g0.v1(q0Var.f18063f);
                    q0Var.f18061c.f39895g3.O(true);
                    q0Var.d0(true);
                }
            } else if (i7 == Y) {
                boolean z10 = !q0Var.Q;
                q0Var.Q = z10;
                ((p8) view).setChecked(z10);
                q0Var.f18061c.f39895g3.O(true);
            } else if (i7 == Z) {
                int i10 = -q0Var.P;
                q0Var.P = i10;
                org.telegram.messenger.g0.F3(i10, view, null);
            } else if (i7 == f18044a0) {
                TL_account.TL_businessBotRights tL_businessBotRights = q0Var.K;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((c2) view).c(z11, true);
                q0Var.f18061c.f39895g3.O(true);
                q0Var.d0(true);
            } else if (i7 == f18045b0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = q0Var.K;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((c2) view).c(z12, true);
                q0Var.f18061c.f39895g3.O(true);
                q0Var.d0(true);
            } else if (i7 == f18046c0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = q0Var.K;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((c2) view).c(z13, true);
                q0Var.f18061c.f39895g3.O(true);
                q0Var.d0(true);
            } else if (i7 == f18047d0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = q0Var.K;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((c2) view).c(z14, true);
                q0Var.f18061c.f39895g3.O(true);
                q0Var.d0(true);
            } else if (i7 == f18048e0) {
                boolean z15 = !q0Var.R;
                q0Var.R = z15;
                ((p8) view).setChecked(z15);
                q0Var.f18061c.f39895g3.O(true);
            } else if (i7 == f18049f0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = q0Var.K;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((c2) view).c(z16, true);
                q0Var.f18061c.f39895g3.O(true);
                q0Var.d0(true);
            } else if (i7 == f18050g0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = q0Var.K;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((c2) view).c(z17, true);
                q0Var.f18061c.f39895g3.O(true);
                q0Var.d0(true);
            } else if (i7 == f18051h0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = q0Var.K;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((c2) view).c(z18, true);
                q0Var.f18061c.f39895g3.O(true);
                q0Var.d0(true);
            } else if (i7 == f18052i0) {
                q0Var.c0(i7, !q0Var.K.edit_username, new Runnable(q0Var) {
                    public final q0 f17973b;

                    {
                        this.f17973b = q0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = this.f17973b;
                                q0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.K;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((c2) view).c(z19, true);
                                q0Var2.f18061c.f39895g3.O(true);
                                q0Var2.d0(true);
                                return;
                            case 1:
                                q0 q0Var3 = this.f17973b;
                                q0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((c2) view).c(z20, true);
                                q0Var3.f18061c.f39895g3.O(true);
                                q0Var3.d0(true);
                                return;
                            case 2:
                                q0 q0Var4 = this.f17973b;
                                q0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((c2) view).c(z21, true);
                                q0Var4.f18061c.f39895g3.O(true);
                                q0Var4.d0(true);
                                return;
                            case 3:
                                q0 q0Var5 = this.f17973b;
                                q0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((c2) view).c(z22, true);
                                q0Var5.f18061c.f39895g3.O(true);
                                q0Var5.d0(true);
                                return;
                            case 4:
                                q0 q0Var6 = this.f17973b;
                                q0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((c2) view).c(z23, true);
                                q0Var6.f18061c.f39895g3.O(true);
                                q0Var6.d0(true);
                                return;
                            default:
                                q0 q0Var7 = this.f17973b;
                                q0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((c2) view).c(z24, true);
                                q0Var7.f18061c.f39895g3.O(true);
                                q0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18053j0) {
                boolean z19 = !q0Var.S;
                q0Var.S = z19;
                ((p8) view).setChecked(z19);
                q0Var.f18061c.f39895g3.O(true);
            } else if (i7 == f18054k0) {
                q0Var.c0(i7, !q0Var.K.view_gifts, new Runnable(q0Var) {
                    public final q0 f17973b;

                    {
                        this.f17973b = q0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = this.f17973b;
                                q0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((c2) view).c(z192, true);
                                q0Var2.f18061c.f39895g3.O(true);
                                q0Var2.d0(true);
                                return;
                            case 1:
                                q0 q0Var3 = this.f17973b;
                                q0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((c2) view).c(z20, true);
                                q0Var3.f18061c.f39895g3.O(true);
                                q0Var3.d0(true);
                                return;
                            case 2:
                                q0 q0Var4 = this.f17973b;
                                q0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((c2) view).c(z21, true);
                                q0Var4.f18061c.f39895g3.O(true);
                                q0Var4.d0(true);
                                return;
                            case 3:
                                q0 q0Var5 = this.f17973b;
                                q0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((c2) view).c(z22, true);
                                q0Var5.f18061c.f39895g3.O(true);
                                q0Var5.d0(true);
                                return;
                            case 4:
                                q0 q0Var6 = this.f17973b;
                                q0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((c2) view).c(z23, true);
                                q0Var6.f18061c.f39895g3.O(true);
                                q0Var6.d0(true);
                                return;
                            default:
                                q0 q0Var7 = this.f17973b;
                                q0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((c2) view).c(z24, true);
                                q0Var7.f18061c.f39895g3.O(true);
                                q0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18055l0) {
                q0Var.c0(i7, !q0Var.K.sell_gifts, new Runnable(q0Var) {
                    public final q0 f17973b;

                    {
                        this.f17973b = q0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = this.f17973b;
                                q0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((c2) view).c(z192, true);
                                q0Var2.f18061c.f39895g3.O(true);
                                q0Var2.d0(true);
                                return;
                            case 1:
                                q0 q0Var3 = this.f17973b;
                                q0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((c2) view).c(z20, true);
                                q0Var3.f18061c.f39895g3.O(true);
                                q0Var3.d0(true);
                                return;
                            case 2:
                                q0 q0Var4 = this.f17973b;
                                q0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((c2) view).c(z21, true);
                                q0Var4.f18061c.f39895g3.O(true);
                                q0Var4.d0(true);
                                return;
                            case 3:
                                q0 q0Var5 = this.f17973b;
                                q0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((c2) view).c(z22, true);
                                q0Var5.f18061c.f39895g3.O(true);
                                q0Var5.d0(true);
                                return;
                            case 4:
                                q0 q0Var6 = this.f17973b;
                                q0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((c2) view).c(z23, true);
                                q0Var6.f18061c.f39895g3.O(true);
                                q0Var6.d0(true);
                                return;
                            default:
                                q0 q0Var7 = this.f17973b;
                                q0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((c2) view).c(z24, true);
                                q0Var7.f18061c.f39895g3.O(true);
                                q0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == m0) {
                q0Var.c0(i7, !q0Var.K.change_gift_settings, new Runnable(q0Var) {
                    public final q0 f17973b;

                    {
                        this.f17973b = q0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = this.f17973b;
                                q0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((c2) view).c(z192, true);
                                q0Var2.f18061c.f39895g3.O(true);
                                q0Var2.d0(true);
                                return;
                            case 1:
                                q0 q0Var3 = this.f17973b;
                                q0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((c2) view).c(z20, true);
                                q0Var3.f18061c.f39895g3.O(true);
                                q0Var3.d0(true);
                                return;
                            case 2:
                                q0 q0Var4 = this.f17973b;
                                q0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((c2) view).c(z21, true);
                                q0Var4.f18061c.f39895g3.O(true);
                                q0Var4.d0(true);
                                return;
                            case 3:
                                q0 q0Var5 = this.f17973b;
                                q0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((c2) view).c(z22, true);
                                q0Var5.f18061c.f39895g3.O(true);
                                q0Var5.d0(true);
                                return;
                            case 4:
                                q0 q0Var6 = this.f17973b;
                                q0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((c2) view).c(z23, true);
                                q0Var6.f18061c.f39895g3.O(true);
                                q0Var6.d0(true);
                                return;
                            default:
                                q0 q0Var7 = this.f17973b;
                                q0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((c2) view).c(z24, true);
                                q0Var7.f18061c.f39895g3.O(true);
                                q0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18056n0) {
                q0Var.c0(i7, !q0Var.K.transfer_and_upgrade_gifts, new Runnable(q0Var) {
                    public final q0 f17973b;

                    {
                        this.f17973b = q0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = this.f17973b;
                                q0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((c2) view).c(z192, true);
                                q0Var2.f18061c.f39895g3.O(true);
                                q0Var2.d0(true);
                                return;
                            case 1:
                                q0 q0Var3 = this.f17973b;
                                q0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((c2) view).c(z20, true);
                                q0Var3.f18061c.f39895g3.O(true);
                                q0Var3.d0(true);
                                return;
                            case 2:
                                q0 q0Var4 = this.f17973b;
                                q0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((c2) view).c(z21, true);
                                q0Var4.f18061c.f39895g3.O(true);
                                q0Var4.d0(true);
                                return;
                            case 3:
                                q0 q0Var5 = this.f17973b;
                                q0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((c2) view).c(z22, true);
                                q0Var5.f18061c.f39895g3.O(true);
                                q0Var5.d0(true);
                                return;
                            case 4:
                                q0 q0Var6 = this.f17973b;
                                q0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((c2) view).c(z23, true);
                                q0Var6.f18061c.f39895g3.O(true);
                                q0Var6.d0(true);
                                return;
                            default:
                                q0 q0Var7 = this.f17973b;
                                q0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((c2) view).c(z24, true);
                                q0Var7.f18061c.f39895g3.O(true);
                                q0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18057o0) {
                q0Var.c0(i7, !q0Var.K.transfer_stars, new Runnable(q0Var) {
                    public final q0 f17973b;

                    {
                        this.f17973b = q0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                q0 q0Var2 = this.f17973b;
                                q0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = q0Var2.K;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((c2) view).c(z192, true);
                                q0Var2.f18061c.f39895g3.O(true);
                                q0Var2.d0(true);
                                return;
                            case 1:
                                q0 q0Var3 = this.f17973b;
                                q0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = q0Var3.K;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((c2) view).c(z20, true);
                                q0Var3.f18061c.f39895g3.O(true);
                                q0Var3.d0(true);
                                return;
                            case 2:
                                q0 q0Var4 = this.f17973b;
                                q0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = q0Var4.K;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((c2) view).c(z21, true);
                                q0Var4.f18061c.f39895g3.O(true);
                                q0Var4.d0(true);
                                return;
                            case 3:
                                q0 q0Var5 = this.f17973b;
                                q0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = q0Var5.K;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((c2) view).c(z22, true);
                                q0Var5.f18061c.f39895g3.O(true);
                                q0Var5.d0(true);
                                return;
                            case 4:
                                q0 q0Var6 = this.f17973b;
                                q0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = q0Var6.K;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((c2) view).c(z23, true);
                                q0Var6.f18061c.f39895g3.O(true);
                                q0Var6.d0(true);
                                return;
                            default:
                                q0 q0Var7 = this.f17973b;
                                q0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = q0Var7.K;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((c2) view).c(z24, true);
                                q0Var7.f18061c.f39895g3.O(true);
                                q0Var7.d0(true);
                                return;
                        }
                    }
                });
            } else if (i7 == f18058p0) {
                q0Var.c0(i7, !q0Var.K.manage_stories, new k0(q0Var, 0));
            }
        }
    }

    public final void c0(int i7, boolean z10, final Runnable runnable) {
        if (!this.L && i7 == f18052i0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = hd.M0(2131752787, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752788, q10.n(this.N)));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            alertDialog$Builder.k(hd.M0(2131754284, null), new org.telegram.ui.ActionBar.q1(this) {
                public final q0 f18034b;

                {
                    this.f18034b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i10) {
                    switch (r3) {
                        case 0:
                            this.f18034b.L = true;
                            runnable.run();
                            return;
                        default:
                            this.f18034b.M = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        } else if (!this.M && z10 && (i7 == f18055l0 || i7 == m0 || i7 == f18056n0 || i7 == f18057o0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M02 = hd.M0(2131752787, null);
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
            t1Var2.S = M02;
            t1Var2.U = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752801, q10.n(this.N)));
            alertDialog$Builder2.h(hd.M0(2131752589, null), null);
            alertDialog$Builder2.k(hd.M0(2131754284, null), new org.telegram.ui.ActionBar.q1(this) {
                public final q0 f18034b;

                {
                    this.f18034b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i10) {
                    switch (r3) {
                        case 0:
                            this.f18034b.L = true;
                            runnable.run();
                            return;
                        default:
                            this.f18034b.M = true;
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 6));
        this.f18059a = this.simpleActionBar.q(hd.M0(2131745946, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f18063f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        q6.D(this.f18063f, j6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f18063f;
        int i11 = j6.G6;
        q6.U(editTextBoldCursor2, i11, null);
        this.f18063f.setBackgroundDrawable(null);
        this.f18063f.setMaxLines(1);
        this.f18063f.setLines(1);
        this.f18063f.setPadding(0, 0, 0, 0);
        this.f18063f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f18063f;
        if (hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor3.setGravity(i7 | 48);
        this.f18063f.setInputType(180224);
        this.f18063f.setImeOptions(6);
        this.f18063f.setHint(hd.M0(2131752816, null));
        q6.v(this.f18063f, i11, null);
        this.f18063f.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        this.f18063f.setCursorWidth(1.5f);
        this.f18063f.setOnEditorActionListener(new di.m(this, 1));
        this.f18063f.addTextChangedListener(new ah.j(this, 10));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f18062e = frameLayout2;
        frameLayout2.addView(this.f18063f, ja.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f18062e;
        int i12 = j6.f28849d6;
        q6.h(i12, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.h = view;
        q6.h(j6.f28850d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.f18062e;
        View view2 = this.h;
        float f10 = 1.0f / org.telegram.messenger.g0.f23608p;
        boolean z10 = hd.f24101a0;
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
        frameLayout4.addView(view2, ja.d(-1, f10, 87, f11, 0.0f, i13, 0.0f));
        bi.v1 v1Var = new bi.v1(context, 5);
        this.f18064n = v1Var;
        q6.h(i12, v1Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.f18065r = textView;
        textView.setText(hd.M0(2131752811, null));
        this.f18065r.setTextSize(1, 14.0f);
        TextView textView2 = this.f18065r;
        int i14 = j6.f29260z6;
        q6.U(textView2, i14, getResourceProvider());
        this.f18064n.addView(this.f18065r, ja.e(-2, -2, 17));
        this.f18066s = new ImageView(context);
        i7 i7Var = new i7(getThemedColor(i14));
        this.f18066s.setScaleType(ImageView.ScaleType.CENTER);
        this.f18066s.setImageDrawable(i7Var);
        this.f18060b = i7Var;
        this.f18064n.addView(this.f18066s, ja.e(-2, -2, 17));
        this.f18066s.setAlpha(0.0f);
        this.f18066s.setTranslationY(org.telegram.messenger.g0.L(8.0f));
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        z1Var.f17344a = new gc.b(this, 12);
        a0 a0Var = new a0(this, new k0(this, 3));
        this.f18067w = a0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.I;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        a0Var.i(tL_businessBotRecipients);
        u41 u41Var = new u41(this, new q4(this, 10), new n0(this, 3), null);
        this.f18061c = u41Var;
        u41Var.r1();
        this.f18061c.setSectionsDrawBackground(true);
        u41 u41Var2 = this.f18061c;
        u41Var2.f39895g3.f38201r = false;
        frameLayout.addView(u41Var2, ja.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z10) {
        if (this.f18059a == null) {
            return;
        }
        this.f18059a.a(e0(), z10);
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
                    j3 = user.f28200id;
                }
                if (tL_connectedBot != null) {
                    j10 = tL_connectedBot.bot_id;
                }
                if (j3 == j10 && (user == null || (this.K.equals(tL_connectedBot.rights) && ((a0Var = this.f18067w) == null || !a0Var.g())))) {
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
        if (!this.f18059a.f29950y.f57082f) {
            if (!e0()) {
                finishFragment();
            } else if (this.f18067w.k(this.f18061c)) {
                TLRPC.User user2 = this.N;
                if (user2 != null && ((tL_connectedBot = this.I) == null || tL_connectedBot.bot_id != user2.f28200id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.I;
                if (tL_connectedBot2 != null && ((user = this.N) == null || tL_connectedBot2.bot_id != user.f28200id)) {
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
                    updateconnectedbot2.recipients = this.f18067w.b();
                    arrayList.add(updateconnectedbot2);
                    TL_account.TL_connectedBot tL_connectedBot3 = this.I;
                    if (tL_connectedBot3 != null) {
                        tL_connectedBot3.bot_id = this.N.f28200id;
                        tL_connectedBot3.recipients = this.f18067w.c();
                        this.I.rights = this.K;
                    }
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    getConnectionsManager().sendRequest((TLObject) arrayList.get(i7), new l0(this, iArr, arrayList, z10, user2));
                }
            }
        }
    }

    public final void g0() {
        boolean z10;
        float f10;
        float f11;
        boolean z11 = this.f18068x;
        boolean e10 = this.d.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.O;
        if (!e10 && !this.f18069y && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.d.e() && !this.f18069y && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f18068x = z12;
            ViewPropertyAnimator animate = this.f18065r.animate();
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
            er erVar = er.h;
            duration.setInterpolator(erVar).start();
            ViewPropertyAnimator animate2 = this.f18066s.animate();
            if (!z12) {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f12);
            if (!z12) {
                f13 = org.telegram.messenger.g0.L(8.0f);
            }
            alpha2.translationY(f13).setDuration(320L).setInterpolator(erVar).start();
        }
    }

    @Override
    public final uj0 getListViewForSimpleGlass() {
        return this.f18061c;
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
                String M0 = hd.M0(2131743835, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131752786, null);
                alertDialog$Builder.k(hd.M0(2131754216, null), new n0(this, 0));
                alertDialog$Builder.h(hd.M0(2131747580, null), new n0(this, 1));
                showDialog(t1Var);
                return false;
            }
        } else if (this.N != null || e0() || (this.d.d.isEmpty() && this.d.f17347e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = hd.M0(2131752812, null);
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                t1Var2.S = M02;
                t1Var2.U = hd.M0(2131752813, null);
                alertDialog$Builder2.k(hd.M0(2131752814, null), new n0(this, 2));
                alertDialog$Builder2.h(hd.M0(2131752589, null), null);
                showDialog(t1Var2);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.T && !this.U) {
            this.T = true;
            f.a(this.currentAccount).c(new g7(this, 8));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            i7 i7Var = this.f18060b;
            if (i7Var != null) {
                i7Var.b(getThemedColor(j6.f29260z6));
                ImageView imageView = this.f18066s;
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
