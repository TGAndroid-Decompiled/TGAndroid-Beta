package hg;

import ai.x5;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.i2;
import ci.u8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y51;
import org.telegram.ui.LaunchActivity;
import w7.y5;
public final class u0 extends n2 {
    public static final int U = -1;
    public static final int V = -2;
    public static final int W = -3;
    public static final int X = -4;
    public static final int Y = -5;
    public static final int Z = -6;
    public static final int f10419a0 = -7;
    public static final int f10420b0 = -8;
    public static final int f10421c0 = -9;
    public static final int f10422d0 = -10;
    public static final int f10423e0 = -11;
    public static final int f10424f0 = -12;
    public static final int f10425g0 = -13;
    public static final int f10426h0 = -14;
    public static final int f10427i0 = -15;
    public static final int f10428j0 = -16;
    public static final int f10429k0 = -17;
    public static final int f10430l0 = -18;
    public static final int m0 = -19;
    public static final int f10431n0 = -20;
    public static final int f10432o0 = -21;
    public int E;
    public final n0 F;
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
    public pr f10433a;
    public org.telegram.ui.ActionBar.v0 f10434b;
    public u61 f10435c;
    public gg.c2 d;
    public FrameLayout e;
    public EditTextBoldCursor f10436f;
    public View h;
    public x5 f10437n;
    public TextView f10438r;
    public ImageView f10439s;
    public a0 v;
    public boolean f10440w;
    public boolean f10441x;
    public String f10442y;

    public u0() {
        super(null);
        this.E = 0;
        this.F = new n0(this, 4);
        this.J = TL_account.TL_businessBotRights.makeDefault();
        this.M = null;
        this.N = new LongSparseArray();
        this.O = -4;
        this.P = true;
        this.Q = false;
        this.R = false;
    }

    public static void U(u0 u0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        n2 U2;
        if (tL_error != null) {
            u0Var.f10433a.a(0.0f);
            xc.b0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            u0Var.f10433a.a(0.0f);
            rk.p(R.string.UnknownError, xc.a0(u0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.stageQueue.postRunnable(new gg.x1(4, u0Var, tLObject));
            }
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                f.a(u0Var.currentAccount).b();
                u0Var.getMessagesController().clearFullUsers();
                u0Var.finishFragment();
                if (z10 && user != null) {
                    n2 U3 = LaunchActivity.U();
                    if (U3 != null) {
                        k0.q(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, xc.a0(U3), R.raw.contact_check, 36);
                    }
                } else if (user != null && (U2 = LaunchActivity.U()) != null) {
                    k0.q(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, xc.a0(U2), R.raw.contact_check, 36);
                }
            }
        }
    }

    public static void W(u0 u0Var, y51 y51Var, final View view) {
        if (y51Var.f30514g && !u0Var.v.h(y51Var)) {
            int i10 = y51Var.d;
            if (i10 == U) {
                a0 a0Var = u0Var.v;
                u0Var.I = true;
                a0Var.h = true;
                u0Var.f10435c.Y2.N(true);
                u0Var.Y(true);
            } else if (i10 == V) {
                a0 a0Var2 = u0Var.v;
                u0Var.I = false;
                a0Var2.h = false;
                u0Var.f10435c.Y2.N(true);
                u0Var.Y(true);
            } else if (i10 == W) {
                u0Var.M = null;
                u0Var.f10435c.Y2.N(true);
                u0Var.Y(true);
            } else if (y51Var.f15719a == 13) {
                TLRPC.User user = (TLRPC.User) u0Var.N.get(y51Var.f30529x);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u0Var.getParentActivity(), 0, u0Var.resourceProvider);
                        alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                        alertDialog$Builder.f18669a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        u0Var.showDialog(alertDialog$Builder.f18669a);
                        return;
                    }
                    u0Var.M = user;
                    AndroidUtilities.hideKeyboard(u0Var.f10436f);
                    u0Var.f10435c.Y2.N(true);
                    u0Var.Y(true);
                }
            } else if (i10 == X) {
                boolean z10 = !u0Var.P;
                u0Var.P = z10;
                ((w8) view).setChecked(z10);
                u0Var.f10435c.Y2.N(true);
            } else if (i10 == Y) {
                int i11 = -u0Var.O;
                u0Var.O = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
            } else if (i10 == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights = u0Var.J;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((org.telegram.ui.Cells.a2) view).c(z11, true);
                u0Var.f10435c.Y2.N(true);
                u0Var.Y(true);
            } else if (i10 == f10419a0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = u0Var.J;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((org.telegram.ui.Cells.a2) view).c(z12, true);
                u0Var.f10435c.Y2.N(true);
                u0Var.Y(true);
            } else if (i10 == f10420b0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var.J;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((org.telegram.ui.Cells.a2) view).c(z13, true);
                u0Var.f10435c.Y2.N(true);
                u0Var.Y(true);
            } else if (i10 == f10421c0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = u0Var.J;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((org.telegram.ui.Cells.a2) view).c(z14, true);
                u0Var.f10435c.Y2.N(true);
                u0Var.Y(true);
            } else if (i10 == f10422d0) {
                boolean z15 = !u0Var.Q;
                u0Var.Q = z15;
                ((w8) view).setChecked(z15);
                u0Var.f10435c.Y2.N(true);
            } else if (i10 == f10423e0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = u0Var.J;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((org.telegram.ui.Cells.a2) view).c(z16, true);
                u0Var.f10435c.Y2.N(true);
                u0Var.Y(true);
            } else if (i10 == f10424f0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = u0Var.J;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((org.telegram.ui.Cells.a2) view).c(z17, true);
                u0Var.f10435c.Y2.N(true);
                u0Var.Y(true);
            } else if (i10 == f10425g0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = u0Var.J;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((org.telegram.ui.Cells.a2) view).c(z18, true);
                u0Var.f10435c.Y2.N(true);
                u0Var.Y(true);
            } else if (i10 == f10426h0) {
                u0Var.X(i10, !u0Var.J.edit_username, new Runnable(u0Var) {
                    public final u0 f10363b;

                    {
                        this.f10363b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f10363b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((org.telegram.ui.Cells.a2) view).c(z19, true);
                                u0Var2.f10435c.Y2.N(true);
                                u0Var2.Y(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f10363b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f10435c.Y2.N(true);
                                u0Var3.Y(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f10363b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f10435c.Y2.N(true);
                                u0Var4.Y(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f10363b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f10435c.Y2.N(true);
                                u0Var5.Y(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f10363b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f10435c.Y2.N(true);
                                u0Var6.Y(true);
                                return;
                            default:
                                u0 u0Var7 = this.f10363b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f10435c.Y2.N(true);
                                u0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f10427i0) {
                boolean z19 = !u0Var.R;
                u0Var.R = z19;
                ((w8) view).setChecked(z19);
                u0Var.f10435c.Y2.N(true);
            } else if (i10 == f10428j0) {
                u0Var.X(i10, !u0Var.J.view_gifts, new Runnable(u0Var) {
                    public final u0 f10363b;

                    {
                        this.f10363b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f10363b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                u0Var2.f10435c.Y2.N(true);
                                u0Var2.Y(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f10363b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f10435c.Y2.N(true);
                                u0Var3.Y(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f10363b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f10435c.Y2.N(true);
                                u0Var4.Y(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f10363b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f10435c.Y2.N(true);
                                u0Var5.Y(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f10363b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f10435c.Y2.N(true);
                                u0Var6.Y(true);
                                return;
                            default:
                                u0 u0Var7 = this.f10363b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f10435c.Y2.N(true);
                                u0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f10429k0) {
                u0Var.X(i10, !u0Var.J.sell_gifts, new Runnable(u0Var) {
                    public final u0 f10363b;

                    {
                        this.f10363b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f10363b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                u0Var2.f10435c.Y2.N(true);
                                u0Var2.Y(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f10363b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f10435c.Y2.N(true);
                                u0Var3.Y(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f10363b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f10435c.Y2.N(true);
                                u0Var4.Y(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f10363b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f10435c.Y2.N(true);
                                u0Var5.Y(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f10363b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f10435c.Y2.N(true);
                                u0Var6.Y(true);
                                return;
                            default:
                                u0 u0Var7 = this.f10363b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f10435c.Y2.N(true);
                                u0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f10430l0) {
                u0Var.X(i10, !u0Var.J.change_gift_settings, new Runnable(u0Var) {
                    public final u0 f10363b;

                    {
                        this.f10363b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f10363b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                u0Var2.f10435c.Y2.N(true);
                                u0Var2.Y(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f10363b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f10435c.Y2.N(true);
                                u0Var3.Y(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f10363b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f10435c.Y2.N(true);
                                u0Var4.Y(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f10363b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f10435c.Y2.N(true);
                                u0Var5.Y(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f10363b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f10435c.Y2.N(true);
                                u0Var6.Y(true);
                                return;
                            default:
                                u0 u0Var7 = this.f10363b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f10435c.Y2.N(true);
                                u0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == m0) {
                u0Var.X(i10, !u0Var.J.transfer_and_upgrade_gifts, new Runnable(u0Var) {
                    public final u0 f10363b;

                    {
                        this.f10363b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f10363b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                u0Var2.f10435c.Y2.N(true);
                                u0Var2.Y(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f10363b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f10435c.Y2.N(true);
                                u0Var3.Y(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f10363b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f10435c.Y2.N(true);
                                u0Var4.Y(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f10363b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f10435c.Y2.N(true);
                                u0Var5.Y(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f10363b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f10435c.Y2.N(true);
                                u0Var6.Y(true);
                                return;
                            default:
                                u0 u0Var7 = this.f10363b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f10435c.Y2.N(true);
                                u0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f10431n0) {
                u0Var.X(i10, !u0Var.J.transfer_stars, new Runnable(u0Var) {
                    public final u0 f10363b;

                    {
                        this.f10363b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f10363b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                u0Var2.f10435c.Y2.N(true);
                                u0Var2.Y(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f10363b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f10435c.Y2.N(true);
                                u0Var3.Y(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f10363b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f10435c.Y2.N(true);
                                u0Var4.Y(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f10363b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f10435c.Y2.N(true);
                                u0Var5.Y(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f10363b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f10435c.Y2.N(true);
                                u0Var6.Y(true);
                                return;
                            default:
                                u0 u0Var7 = this.f10363b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f10435c.Y2.N(true);
                                u0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f10432o0) {
                u0Var.X(i10, !u0Var.J.manage_stories, new n0(u0Var, 0));
            }
        }
    }

    public final void X(int i10, boolean z10, final Runnable runnable) {
        if (!this.K && i10 == f10426h0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.a2(this) {
                public final u0 f10408b;

                {
                    this.f10408b = this;
                }

                @Override
                public final void k(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                    switch (r3) {
                        case 0:
                            this.f10408b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f10408b.L = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        } else if (!this.L && z10 && (i10 == f10429k0 || i10 == f10430l0 || i10 == m0 || i10 == f10431n0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18669a;
            b2Var2.R = string2;
            b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.a2(this) {
                public final u0 f10408b;

                {
                    this.f10408b = this;
                }

                @Override
                public final void k(org.telegram.ui.ActionBar.b2 b2Var22, int i11) {
                    switch (r3) {
                        case 0:
                            this.f10408b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f10408b.L = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder2.d(-1);
            alertDialog$Builder2.o();
        } else {
            runnable.run();
        }
    }

    public final void Y(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f10434b == null) {
            return;
        }
        boolean Z2 = Z();
        this.f10434b.setEnabled(Z2);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f10434b.animate();
            if (Z2) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (Z2) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (Z2) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.f10434b;
        if (Z2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f10434b;
        if (Z2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f10434b;
        if (Z2) {
            f13 = 1.0f;
        }
        v0Var3.setScaleY(f13);
    }

    public final boolean Z() {
        boolean z10;
        boolean z11;
        long j3;
        a0 a0Var;
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
                long j10 = 0;
                if (user == null) {
                    j3 = 0;
                } else {
                    j3 = user.f18490id;
                }
                if (tL_connectedBot != null) {
                    j10 = tL_connectedBot.bot_id;
                }
                if (j3 == j10 && (user == null || (this.J.equals(tL_connectedBot.rights) && ((a0Var = this.v) == null || !a0Var.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void a0() {
        boolean z10;
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (this.f10433a.f27411c <= 0.0f) {
            if (!Z()) {
                finishFragment();
            } else if (this.v.k(this.f10435c)) {
                TLRPC.User user2 = this.M;
                if (user2 != null && ((tL_connectedBot = this.H) == null || tL_connectedBot.bot_id != user2.f18490id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.H;
                if (tL_connectedBot2 != null && ((user = this.M) == null || tL_connectedBot2.bot_id != user.f18490id)) {
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = getMessagesController().getInputUser(this.H.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    arrayList.add(updateconnectedbot);
                }
                if (this.M != null) {
                    TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                    updateconnectedbot2.deleted = false;
                    updateconnectedbot2.rights = this.J;
                    updateconnectedbot2.bot = getMessagesController().getInputUser(this.M);
                    updateconnectedbot2.recipients = this.v.b();
                    arrayList.add(updateconnectedbot2);
                    TL_account.TL_connectedBot tL_connectedBot3 = this.H;
                    if (tL_connectedBot3 != null) {
                        tL_connectedBot3.bot_id = this.M.f18490id;
                        tL_connectedBot3.recipients = this.v.c();
                        this.H.rights = this.J;
                    }
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    getConnectionsManager().sendRequest((TLObject) arrayList.get(i10), new o0(this, iArr, arrayList, z10, user2));
                }
            }
        }
    }

    public final void b0() {
        boolean z10;
        float f7;
        float f10;
        boolean z11 = this.f10440w;
        boolean e = this.d.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.N;
        if (!e && !this.f10441x && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.d.e() && !this.f10441x && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f10440w = z12;
            ViewPropertyAnimator animate = this.f10438r.animate();
            float f11 = 1.0f;
            float f12 = 0.0f;
            if (z12) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (z12) {
                f10 = -AndroidUtilities.dp(8.0f);
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator duration = alpha.translationY(f10).setDuration(320L);
            qr qrVar = qr.h;
            duration.setInterpolator(qrVar).start();
            ViewPropertyAnimator animate2 = this.f10439s.animate();
            if (!z12) {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (!z12) {
                f12 = AndroidUtilities.dp(8.0f);
            }
            alpha2.translationY(f12).setDuration(320L).setInterpolator(qrVar).start();
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessBots2));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 11));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i12 = j6.f19442v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
        this.f10433a = new pr(mutate, new tp(j6.w0(null, i12, false)));
        this.f10434b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f10433a);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f19053a7, false));
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f10436f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        this.f10436f.setHintTextColor(j6.w0(null, j6.H6, false));
        EditTextBoldCursor editTextBoldCursor2 = this.f10436f;
        int i13 = j6.G6;
        editTextBoldCursor2.setTextColor(j6.w0(null, i13, false));
        this.f10436f.setBackgroundDrawable(null);
        this.f10436f.setMaxLines(1);
        this.f10436f.setLines(1);
        this.f10436f.setPadding(0, 0, 0, 0);
        this.f10436f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f10436f;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor3.setGravity(i10 | 48);
        this.f10436f.setInputType(180224);
        this.f10436f.setImeOptions(6);
        this.f10436f.setHint(LocaleController.getString(R.string.BusinessBotLink));
        this.f10436f.setCursorColor(j6.w0(null, i13, false));
        this.f10436f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f10436f.setCursorWidth(1.5f);
        this.f10436f.setOnEditorActionListener(new t0(this, 0));
        this.f10436f.addTextChangedListener(new i2(this, 2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f10436f, y5.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i14 = j6.f19109d6;
        frameLayout3.setBackgroundColor(getThemedColor(i14));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(j6.f19110d7));
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f7 = 1.0f / AndroidUtilities.density;
        boolean z10 = LocaleController.isRTL;
        int i15 = 21;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 21;
        }
        float f10 = i11;
        if (!z10) {
            i15 = 0;
        }
        frameLayout4.addView(view2, y5.d(-1, f7, 87, f10, 0.0f, i15, 0.0f));
        x5 x5Var = new x5(context, 3);
        this.f10437n = x5Var;
        x5Var.setBackgroundColor(getThemedColor(i14));
        TextView textView = new TextView(context);
        this.f10438r = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.f10438r.setTextSize(1, 14.0f);
        TextView textView2 = this.f10438r;
        int i16 = j6.f19511z6;
        textView2.setTextColor(getThemedColor(i16));
        this.f10437n.addView(this.f10438r, y5.e(-2, -2, 17));
        this.f10439s = new ImageView(context);
        u8 u8Var = new u8(getThemedColor(i16));
        this.f10439s.setScaleType(ImageView.ScaleType.CENTER);
        this.f10439s.setImageDrawable(u8Var);
        this.f10437n.addView(this.f10439s, y5.e(-2, -2, 17));
        this.f10439s.setAlpha(0.0f);
        this.f10439s.setTranslationY(AndroidUtilities.dp(8.0f));
        gg.c2 c2Var = new gg.c2(true);
        this.d = c2Var;
        c2Var.f9690a = new pb.c(this, 25);
        a0 a0Var = new a0(this, new n0(this, 3));
        this.v = a0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.H;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        a0Var.i(tL_businessBotRecipients);
        u61 u61Var = new u61(this, new bi.v(this, 24), new q0(this, 3), null);
        this.f10435c = u61Var;
        u61Var.q1();
        u61 u61Var2 = this.f10435c;
        u61Var2.Y2.f26342r = false;
        frameLayout.addView(u61Var2, y5.c(-1.0f, -1));
        this.actionBar.z(this.f10435c, true);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (Z()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.BusinessBotUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new q0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new q0(this, 1));
                showDialog(alertDialog$Builder.f18669a);
                return false;
            }
        } else if (this.M != null || Z() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.f18669a.R = LocaleController.getString(R.string.BusinessBotNoAddedTitle);
                alertDialog$Builder2.f18669a.T = LocaleController.getString(R.string.BusinessBotNoAddedText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.BusinessBotNoAddedButton), new q0(this, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder2.f18669a);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.S && !this.T) {
            this.S = true;
            f.a(this.currentAccount).c(new ai.y1(this, 21));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f10435c.setPadding(0, 0, 0, i13);
        this.f10435c.setClipToPadding(false);
    }
}
