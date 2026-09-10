package gg;

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
import bi.l4;
import bi.u2;
import bi.x9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zp;
import org.telegram.ui.LaunchActivity;
import w7.a6;
public final class y0 extends p2 {
    public static final int U = -1;
    public static final int V = -2;
    public static final int W = -3;
    public static final int X = -4;
    public static final int Y = -5;
    public static final int Z = -6;
    public static final int f9076a0 = -7;
    public static final int f9077b0 = -8;
    public static final int f9078c0 = -9;
    public static final int f9079d0 = -10;
    public static final int f9080e0 = -11;
    public static final int f9081f0 = -12;
    public static final int f9082g0 = -13;
    public static final int f9083h0 = -14;
    public static final int f9084i0 = -15;
    public static final int f9085j0 = -16;
    public static final int f9086k0 = -17;
    public static final int f9087l0 = -18;
    public static final int m0 = -19;
    public static final int f9088n0 = -20;
    public static final int f9089o0 = -21;
    public int E;
    public final r0 F;
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
    public vr f9090a;
    public org.telegram.ui.ActionBar.w0 f9091b;
    public r61 f9092c;
    public fg.d2 d;
    public FrameLayout e;
    public EditTextBoldCursor f9093f;
    public View h;
    public l4 f9094n;
    public TextView f9095r;
    public ImageView f9096s;
    public e0 v;
    public boolean f9097w;
    public boolean f9098x;
    public String f9099y;

    public y0() {
        super(null);
        this.E = 0;
        this.F = new r0(this, 4);
        this.J = TL_account.TL_businessBotRights.makeDefault();
        this.M = null;
        this.N = new LongSparseArray();
        this.O = -4;
        this.P = true;
        this.Q = false;
        this.R = false;
    }

    public static void U(y0 y0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        p2 U2;
        if (tL_error != null) {
            y0Var.f9090a.a(0.0f);
            wc.b0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            y0Var.f9090a.a(0.0f);
            org.telegram.messenger.a2.p(R.string.UnknownError, wc.a0(y0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.stageQueue.postRunnable(new fg.s1(4, y0Var, tLObject));
            }
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                f.a(y0Var.currentAccount).b();
                y0Var.getMessagesController().clearFullUsers();
                y0Var.finishFragment();
                if (z10 && user != null) {
                    p2 U3 = LaunchActivity.U();
                    if (U3 != null) {
                        com.google.android.gms.internal.vision.e2.o(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, wc.a0(U3), R.raw.contact_check, 36);
                    }
                } else if (user != null && (U2 = LaunchActivity.U()) != null) {
                    com.google.android.gms.internal.vision.e2.o(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, wc.a0(U2), R.raw.contact_check, 36);
                }
            }
        }
    }

    public static void W(y0 y0Var, v51 v51Var, final View view) {
        if (v51Var.f27825g && !y0Var.v.h(v51Var)) {
            int i10 = v51Var.d;
            if (i10 == U) {
                e0 e0Var = y0Var.v;
                y0Var.I = true;
                e0Var.h = true;
                y0Var.f9092c.Y2.N(true);
                y0Var.Y(true);
            } else if (i10 == V) {
                e0 e0Var2 = y0Var.v;
                y0Var.I = false;
                e0Var2.h = false;
                y0Var.f9092c.Y2.N(true);
                y0Var.Y(true);
            } else if (i10 == W) {
                y0Var.M = null;
                y0Var.f9092c.Y2.N(true);
                y0Var.Y(true);
            } else if (v51Var.f14046a == 13) {
                TLRPC.User user = (TLRPC.User) y0Var.N.get(v51Var.f27840x);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y0Var.getParentActivity(), 0, y0Var.resourceProvider);
                        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                        alertDialog$Builder.f17528a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        y0Var.showDialog(alertDialog$Builder.f17528a);
                        return;
                    }
                    y0Var.M = user;
                    AndroidUtilities.hideKeyboard(y0Var.f9093f);
                    y0Var.f9092c.Y2.N(true);
                    y0Var.Y(true);
                }
            } else if (i10 == X) {
                boolean z10 = !y0Var.P;
                y0Var.P = z10;
                ((w8) view).setChecked(z10);
                y0Var.f9092c.Y2.N(true);
            } else if (i10 == Y) {
                int i11 = -y0Var.O;
                y0Var.O = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
            } else if (i10 == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights = y0Var.J;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                y0Var.f9092c.Y2.N(true);
                y0Var.Y(true);
            } else if (i10 == f9076a0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = y0Var.J;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((org.telegram.ui.Cells.z1) view).c(z12, true);
                y0Var.f9092c.Y2.N(true);
                y0Var.Y(true);
            } else if (i10 == f9077b0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = y0Var.J;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((org.telegram.ui.Cells.z1) view).c(z13, true);
                y0Var.f9092c.Y2.N(true);
                y0Var.Y(true);
            } else if (i10 == f9078c0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = y0Var.J;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((org.telegram.ui.Cells.z1) view).c(z14, true);
                y0Var.f9092c.Y2.N(true);
                y0Var.Y(true);
            } else if (i10 == f9079d0) {
                boolean z15 = !y0Var.Q;
                y0Var.Q = z15;
                ((w8) view).setChecked(z15);
                y0Var.f9092c.Y2.N(true);
            } else if (i10 == f9080e0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = y0Var.J;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((org.telegram.ui.Cells.z1) view).c(z16, true);
                y0Var.f9092c.Y2.N(true);
                y0Var.Y(true);
            } else if (i10 == f9081f0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = y0Var.J;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((org.telegram.ui.Cells.z1) view).c(z17, true);
                y0Var.f9092c.Y2.N(true);
                y0Var.Y(true);
            } else if (i10 == f9082g0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = y0Var.J;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((org.telegram.ui.Cells.z1) view).c(z18, true);
                y0Var.f9092c.Y2.N(true);
                y0Var.Y(true);
            } else if (i10 == f9083h0) {
                y0Var.X(i10, !y0Var.J.edit_username, new Runnable(y0Var) {
                    public final y0 f9016b;

                    {
                        this.f9016b = y0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                y0 y0Var2 = this.f9016b;
                                y0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = y0Var2.J;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((org.telegram.ui.Cells.z1) view).c(z19, true);
                                y0Var2.f9092c.Y2.N(true);
                                y0Var2.Y(true);
                                return;
                            case 1:
                                y0 y0Var3 = this.f9016b;
                                y0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = y0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                y0Var3.f9092c.Y2.N(true);
                                y0Var3.Y(true);
                                return;
                            case 2:
                                y0 y0Var4 = this.f9016b;
                                y0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = y0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                y0Var4.f9092c.Y2.N(true);
                                y0Var4.Y(true);
                                return;
                            case 3:
                                y0 y0Var5 = this.f9016b;
                                y0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = y0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                y0Var5.f9092c.Y2.N(true);
                                y0Var5.Y(true);
                                return;
                            case 4:
                                y0 y0Var6 = this.f9016b;
                                y0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = y0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                y0Var6.f9092c.Y2.N(true);
                                y0Var6.Y(true);
                                return;
                            default:
                                y0 y0Var7 = this.f9016b;
                                y0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = y0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                y0Var7.f9092c.Y2.N(true);
                                y0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f9084i0) {
                boolean z19 = !y0Var.R;
                y0Var.R = z19;
                ((w8) view).setChecked(z19);
                y0Var.f9092c.Y2.N(true);
            } else if (i10 == f9085j0) {
                y0Var.X(i10, !y0Var.J.view_gifts, new Runnable(y0Var) {
                    public final y0 f9016b;

                    {
                        this.f9016b = y0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                y0 y0Var2 = this.f9016b;
                                y0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = y0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.z1) view).c(z192, true);
                                y0Var2.f9092c.Y2.N(true);
                                y0Var2.Y(true);
                                return;
                            case 1:
                                y0 y0Var3 = this.f9016b;
                                y0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = y0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                y0Var3.f9092c.Y2.N(true);
                                y0Var3.Y(true);
                                return;
                            case 2:
                                y0 y0Var4 = this.f9016b;
                                y0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = y0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                y0Var4.f9092c.Y2.N(true);
                                y0Var4.Y(true);
                                return;
                            case 3:
                                y0 y0Var5 = this.f9016b;
                                y0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = y0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                y0Var5.f9092c.Y2.N(true);
                                y0Var5.Y(true);
                                return;
                            case 4:
                                y0 y0Var6 = this.f9016b;
                                y0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = y0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                y0Var6.f9092c.Y2.N(true);
                                y0Var6.Y(true);
                                return;
                            default:
                                y0 y0Var7 = this.f9016b;
                                y0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = y0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                y0Var7.f9092c.Y2.N(true);
                                y0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f9086k0) {
                y0Var.X(i10, !y0Var.J.sell_gifts, new Runnable(y0Var) {
                    public final y0 f9016b;

                    {
                        this.f9016b = y0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                y0 y0Var2 = this.f9016b;
                                y0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = y0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.z1) view).c(z192, true);
                                y0Var2.f9092c.Y2.N(true);
                                y0Var2.Y(true);
                                return;
                            case 1:
                                y0 y0Var3 = this.f9016b;
                                y0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = y0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                y0Var3.f9092c.Y2.N(true);
                                y0Var3.Y(true);
                                return;
                            case 2:
                                y0 y0Var4 = this.f9016b;
                                y0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = y0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                y0Var4.f9092c.Y2.N(true);
                                y0Var4.Y(true);
                                return;
                            case 3:
                                y0 y0Var5 = this.f9016b;
                                y0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = y0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                y0Var5.f9092c.Y2.N(true);
                                y0Var5.Y(true);
                                return;
                            case 4:
                                y0 y0Var6 = this.f9016b;
                                y0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = y0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                y0Var6.f9092c.Y2.N(true);
                                y0Var6.Y(true);
                                return;
                            default:
                                y0 y0Var7 = this.f9016b;
                                y0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = y0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                y0Var7.f9092c.Y2.N(true);
                                y0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f9087l0) {
                y0Var.X(i10, !y0Var.J.change_gift_settings, new Runnable(y0Var) {
                    public final y0 f9016b;

                    {
                        this.f9016b = y0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                y0 y0Var2 = this.f9016b;
                                y0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = y0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.z1) view).c(z192, true);
                                y0Var2.f9092c.Y2.N(true);
                                y0Var2.Y(true);
                                return;
                            case 1:
                                y0 y0Var3 = this.f9016b;
                                y0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = y0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                y0Var3.f9092c.Y2.N(true);
                                y0Var3.Y(true);
                                return;
                            case 2:
                                y0 y0Var4 = this.f9016b;
                                y0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = y0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                y0Var4.f9092c.Y2.N(true);
                                y0Var4.Y(true);
                                return;
                            case 3:
                                y0 y0Var5 = this.f9016b;
                                y0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = y0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                y0Var5.f9092c.Y2.N(true);
                                y0Var5.Y(true);
                                return;
                            case 4:
                                y0 y0Var6 = this.f9016b;
                                y0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = y0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                y0Var6.f9092c.Y2.N(true);
                                y0Var6.Y(true);
                                return;
                            default:
                                y0 y0Var7 = this.f9016b;
                                y0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = y0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                y0Var7.f9092c.Y2.N(true);
                                y0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == m0) {
                y0Var.X(i10, !y0Var.J.transfer_and_upgrade_gifts, new Runnable(y0Var) {
                    public final y0 f9016b;

                    {
                        this.f9016b = y0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                y0 y0Var2 = this.f9016b;
                                y0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = y0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.z1) view).c(z192, true);
                                y0Var2.f9092c.Y2.N(true);
                                y0Var2.Y(true);
                                return;
                            case 1:
                                y0 y0Var3 = this.f9016b;
                                y0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = y0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                y0Var3.f9092c.Y2.N(true);
                                y0Var3.Y(true);
                                return;
                            case 2:
                                y0 y0Var4 = this.f9016b;
                                y0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = y0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                y0Var4.f9092c.Y2.N(true);
                                y0Var4.Y(true);
                                return;
                            case 3:
                                y0 y0Var5 = this.f9016b;
                                y0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = y0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                y0Var5.f9092c.Y2.N(true);
                                y0Var5.Y(true);
                                return;
                            case 4:
                                y0 y0Var6 = this.f9016b;
                                y0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = y0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                y0Var6.f9092c.Y2.N(true);
                                y0Var6.Y(true);
                                return;
                            default:
                                y0 y0Var7 = this.f9016b;
                                y0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = y0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                y0Var7.f9092c.Y2.N(true);
                                y0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f9088n0) {
                y0Var.X(i10, !y0Var.J.transfer_stars, new Runnable(y0Var) {
                    public final y0 f9016b;

                    {
                        this.f9016b = y0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                y0 y0Var2 = this.f9016b;
                                y0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = y0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.z1) view).c(z192, true);
                                y0Var2.f9092c.Y2.N(true);
                                y0Var2.Y(true);
                                return;
                            case 1:
                                y0 y0Var3 = this.f9016b;
                                y0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = y0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                y0Var3.f9092c.Y2.N(true);
                                y0Var3.Y(true);
                                return;
                            case 2:
                                y0 y0Var4 = this.f9016b;
                                y0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = y0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                y0Var4.f9092c.Y2.N(true);
                                y0Var4.Y(true);
                                return;
                            case 3:
                                y0 y0Var5 = this.f9016b;
                                y0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = y0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                y0Var5.f9092c.Y2.N(true);
                                y0Var5.Y(true);
                                return;
                            case 4:
                                y0 y0Var6 = this.f9016b;
                                y0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = y0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                y0Var6.f9092c.Y2.N(true);
                                y0Var6.Y(true);
                                return;
                            default:
                                y0 y0Var7 = this.f9016b;
                                y0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = y0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                y0Var7.f9092c.Y2.N(true);
                                y0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f9089o0) {
                y0Var.X(i10, !y0Var.J.manage_stories, new r0(y0Var, 0));
            }
        }
    }

    public final void X(int i10, boolean z10, final Runnable runnable) {
        if (!this.K && i10 == f9083h0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.R = string;
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.c2(this) {
                public final y0 f9063b;

                {
                    this.f9063b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.d2 d2Var2, int i11) {
                    switch (r3) {
                        case 0:
                            this.f9063b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f9063b.L = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        } else if (!this.L && z10 && (i10 == f9086k0 || i10 == f9087l0 || i10 == m0 || i10 == f9088n0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f17528a;
            d2Var2.R = string2;
            d2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.c2(this) {
                public final y0 f9063b;

                {
                    this.f9063b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.d2 d2Var22, int i11) {
                    switch (r3) {
                        case 0:
                            this.f9063b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f9063b.L = true;
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
        if (this.f9091b == null) {
            return;
        }
        boolean Z2 = Z();
        this.f9091b.setEnabled(Z2);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f9091b.animate();
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f9091b;
        if (Z2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        w0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f9091b;
        if (Z2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f9091b;
        if (Z2) {
            f13 = 1.0f;
        }
        w0Var3.setScaleY(f13);
    }

    public final boolean Z() {
        boolean z10;
        boolean z11;
        long j3;
        e0 e0Var;
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
                    j3 = user.f17342id;
                }
                if (tL_connectedBot != null) {
                    j10 = tL_connectedBot.bot_id;
                }
                if (j3 == j10 && (user == null || (this.J.equals(tL_connectedBot.rights) && ((e0Var = this.v) == null || !e0Var.g())))) {
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
        if (this.f9090a.f28591c <= 0.0f) {
            if (!Z()) {
                finishFragment();
            } else if (this.v.k(this.f9092c)) {
                TLRPC.User user2 = this.M;
                if (user2 != null && ((tL_connectedBot = this.H) == null || tL_connectedBot.bot_id != user2.f17342id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.H;
                if (tL_connectedBot2 != null && ((user = this.M) == null || tL_connectedBot2.bot_id != user.f17342id)) {
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
                        tL_connectedBot3.bot_id = this.M.f17342id;
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
                    getConnectionsManager().sendRequest((TLObject) arrayList.get(i10), new s0(this, iArr, arrayList, z10, user2));
                }
            }
        }
    }

    public final void b0() {
        boolean z10;
        float f7;
        float f10;
        boolean z11 = this.f9097w;
        boolean e = this.d.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.N;
        if (!e && !this.f9098x && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.d.e() && !this.f9098x && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f9097w = z12;
            ViewPropertyAnimator animate = this.f9095r.animate();
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
            wr wrVar = wr.h;
            duration.setInterpolator(wrVar).start();
            ViewPropertyAnimator animate2 = this.f9096s.animate();
            if (!z12) {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (!z12) {
                f12 = AndroidUtilities.dp(8.0f);
            }
            alpha2.translationY(f12).setDuration(320L).setInterpolator(wrVar).start();
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
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 11));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i12 = j6.f18256v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
        this.f9090a = new vr(mutate, new zp(j6.w0(null, i12, false)));
        this.f9091b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f9090a);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f17872a7, false));
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f9093f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        this.f9093f.setHintTextColor(j6.w0(null, j6.H6, false));
        EditTextBoldCursor editTextBoldCursor2 = this.f9093f;
        int i13 = j6.G6;
        editTextBoldCursor2.setTextColor(j6.w0(null, i13, false));
        this.f9093f.setBackgroundDrawable(null);
        this.f9093f.setMaxLines(1);
        this.f9093f.setLines(1);
        this.f9093f.setPadding(0, 0, 0, 0);
        this.f9093f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f9093f;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor3.setGravity(i10 | 48);
        this.f9093f.setInputType(180224);
        this.f9093f.setImeOptions(6);
        this.f9093f.setHint(LocaleController.getString(R.string.BusinessBotLink));
        this.f9093f.setCursorColor(j6.w0(null, i13, false));
        this.f9093f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f9093f.setCursorWidth(1.5f);
        this.f9093f.setOnEditorActionListener(new x0(this, 0));
        this.f9093f.addTextChangedListener(new u2(this, 2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f9093f, a6.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i14 = j6.f17928d6;
        frameLayout3.setBackgroundColor(getThemedColor(i14));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(j6.f17929d7));
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
        frameLayout4.addView(view2, a6.d(-1, f7, 87, f10, 0.0f, i15, 0.0f));
        l4 l4Var = new l4(context, 2);
        this.f9094n = l4Var;
        l4Var.setBackgroundColor(getThemedColor(i14));
        TextView textView = new TextView(context);
        this.f9095r = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.f9095r.setTextSize(1, 14.0f);
        TextView textView2 = this.f9095r;
        int i16 = j6.f18325z6;
        textView2.setTextColor(getThemedColor(i16));
        this.f9094n.addView(this.f9095r, a6.e(-2, -2, 17));
        this.f9096s = new ImageView(context);
        x9 x9Var = new x9(getThemedColor(i16));
        this.f9096s.setScaleType(ImageView.ScaleType.CENTER);
        this.f9096s.setImageDrawable(x9Var);
        this.f9094n.addView(this.f9096s, a6.e(-2, -2, 17));
        this.f9096s.setAlpha(0.0f);
        this.f9096s.setTranslationY(AndroidUtilities.dp(8.0f));
        fg.d2 d2Var = new fg.d2(true);
        this.d = d2Var;
        d2Var.f7979a = new xa.c(this, 21);
        e0 e0Var = new e0(this, new r0(this, 3));
        this.v = e0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.H;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        e0Var.i(tL_businessBotRecipients);
        r61 r61Var = new r61(this, new ai.c0(this, 24), new u0(this, 3), null);
        this.f9092c = r61Var;
        r61Var.o1();
        r61 r61Var2 = this.f9092c;
        r61Var2.Y2.f24250r = false;
        frameLayout.addView(r61Var2, a6.c(-1.0f, -1));
        this.actionBar.z(this.f9092c, true);
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
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BusinessBotUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new u0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new u0(this, 1));
                showDialog(alertDialog$Builder.f17528a);
                return false;
            }
        } else if (this.M != null || Z() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.f17528a.R = LocaleController.getString(R.string.BusinessBotNoAddedTitle);
                alertDialog$Builder2.f17528a.T = LocaleController.getString(R.string.BusinessBotNoAddedText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.BusinessBotNoAddedButton), new u0(this, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder2.f17528a);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.S && !this.T) {
            this.S = true;
            f.a(this.currentAccount).c(new ai.b(this, 17));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f9092c.setPadding(0, 0, 0, i13);
        this.f9092c.setClipToPadding(false);
    }
}
