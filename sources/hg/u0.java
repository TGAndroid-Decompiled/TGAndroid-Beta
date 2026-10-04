package hg;

import ai.w5;
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
import ci.q8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import w7.z5;
public final class u0 extends n2 {
    public static final int U = -1;
    public static final int V = -2;
    public static final int W = -3;
    public static final int X = -4;
    public static final int Y = -5;
    public static final int Z = -6;
    public static final int f11334a0 = -7;
    public static final int f11335b0 = -8;
    public static final int f11336c0 = -9;
    public static final int f11337d0 = -10;
    public static final int f11338e0 = -11;
    public static final int f11339f0 = -12;
    public static final int f11340g0 = -13;
    public static final int f11341h0 = -14;
    public static final int f11342i0 = -15;
    public static final int f11343j0 = -16;
    public static final int f11344k0 = -17;
    public static final int f11345l0 = -18;
    public static final int m0 = -19;
    public static final int f11346n0 = -20;
    public static final int f11347o0 = -21;
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
    public sr f11348a;
    public org.telegram.ui.ActionBar.v0 f11349b;
    public c71 f11350c;
    public gg.c2 d;
    public FrameLayout f11351e;
    public EditTextBoldCursor f11352f;
    public View h;
    public w5 f11353n;
    public TextView f11354r;
    public ImageView f11355s;
    public a0 v;
    public boolean f11356w;
    public boolean f11357x;
    public String f11358y;

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

    public static void S(u0 u0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        n2 U2;
        if (tL_error != null) {
            u0Var.f11348a.a(0.0f);
            yc.b0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            u0Var.f11348a.a(0.0f);
            ok.p(R.string.UnknownError, yc.a0(u0Var), null);
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
                        k0.p(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, yc.a0(U3), R.raw.contact_check, 36);
                    }
                } else if (user != null && (U2 = LaunchActivity.U()) != null) {
                    k0.p(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, yc.a0(U2), R.raw.contact_check, 36);
                }
            }
        }
    }

    public static void U(u0 u0Var, g61 g61Var, final View view) {
        if (g61Var.f26664g && !u0Var.v.h(g61Var)) {
            int i10 = g61Var.d;
            if (i10 == U) {
                a0 a0Var = u0Var.v;
                u0Var.I = true;
                a0Var.h = true;
                u0Var.f11350c.f25244f3.N(true);
                u0Var.X(true);
            } else if (i10 == V) {
                a0 a0Var2 = u0Var.v;
                u0Var.I = false;
                a0Var2.h = false;
                u0Var.f11350c.f25244f3.N(true);
                u0Var.X(true);
            } else if (i10 == W) {
                u0Var.M = null;
                u0Var.f11350c.f25244f3.N(true);
                u0Var.X(true);
            } else if (g61Var.f17182a == 13) {
                TLRPC.User user = (TLRPC.User) u0Var.N.get(g61Var.f26679x);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u0Var.getParentActivity(), 0, u0Var.resourceProvider);
                        alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                        alertDialog$Builder.f20367a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        u0Var.showDialog(alertDialog$Builder.f20367a);
                        return;
                    }
                    u0Var.M = user;
                    AndroidUtilities.hideKeyboard(u0Var.f11352f);
                    u0Var.f11350c.f25244f3.N(true);
                    u0Var.X(true);
                }
            } else if (i10 == X) {
                boolean z10 = !u0Var.P;
                u0Var.P = z10;
                ((v8) view).setChecked(z10);
                u0Var.f11350c.f25244f3.N(true);
            } else if (i10 == Y) {
                int i11 = -u0Var.O;
                u0Var.O = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
            } else if (i10 == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights = u0Var.J;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((org.telegram.ui.Cells.a2) view).c(z11, true);
                u0Var.f11350c.f25244f3.N(true);
                u0Var.X(true);
            } else if (i10 == f11334a0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = u0Var.J;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((org.telegram.ui.Cells.a2) view).c(z12, true);
                u0Var.f11350c.f25244f3.N(true);
                u0Var.X(true);
            } else if (i10 == f11335b0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var.J;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((org.telegram.ui.Cells.a2) view).c(z13, true);
                u0Var.f11350c.f25244f3.N(true);
                u0Var.X(true);
            } else if (i10 == f11336c0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = u0Var.J;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((org.telegram.ui.Cells.a2) view).c(z14, true);
                u0Var.f11350c.f25244f3.N(true);
                u0Var.X(true);
            } else if (i10 == f11337d0) {
                boolean z15 = !u0Var.Q;
                u0Var.Q = z15;
                ((v8) view).setChecked(z15);
                u0Var.f11350c.f25244f3.N(true);
            } else if (i10 == f11338e0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = u0Var.J;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((org.telegram.ui.Cells.a2) view).c(z16, true);
                u0Var.f11350c.f25244f3.N(true);
                u0Var.X(true);
            } else if (i10 == f11339f0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = u0Var.J;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((org.telegram.ui.Cells.a2) view).c(z17, true);
                u0Var.f11350c.f25244f3.N(true);
                u0Var.X(true);
            } else if (i10 == f11340g0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = u0Var.J;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((org.telegram.ui.Cells.a2) view).c(z18, true);
                u0Var.f11350c.f25244f3.N(true);
                u0Var.X(true);
            } else if (i10 == f11341h0) {
                u0Var.W(i10, !u0Var.J.edit_username, new Runnable(u0Var) {
                    public final u0 f11271b;

                    {
                        this.f11271b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f11271b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((org.telegram.ui.Cells.a2) view).c(z19, true);
                                u0Var2.f11350c.f25244f3.N(true);
                                u0Var2.X(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f11271b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f11350c.f25244f3.N(true);
                                u0Var3.X(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f11271b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f11350c.f25244f3.N(true);
                                u0Var4.X(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f11271b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f11350c.f25244f3.N(true);
                                u0Var5.X(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f11271b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f11350c.f25244f3.N(true);
                                u0Var6.X(true);
                                return;
                            default:
                                u0 u0Var7 = this.f11271b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f11350c.f25244f3.N(true);
                                u0Var7.X(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f11342i0) {
                boolean z19 = !u0Var.R;
                u0Var.R = z19;
                ((v8) view).setChecked(z19);
                u0Var.f11350c.f25244f3.N(true);
            } else if (i10 == f11343j0) {
                u0Var.W(i10, !u0Var.J.view_gifts, new Runnable(u0Var) {
                    public final u0 f11271b;

                    {
                        this.f11271b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f11271b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                u0Var2.f11350c.f25244f3.N(true);
                                u0Var2.X(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f11271b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f11350c.f25244f3.N(true);
                                u0Var3.X(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f11271b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f11350c.f25244f3.N(true);
                                u0Var4.X(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f11271b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f11350c.f25244f3.N(true);
                                u0Var5.X(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f11271b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f11350c.f25244f3.N(true);
                                u0Var6.X(true);
                                return;
                            default:
                                u0 u0Var7 = this.f11271b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f11350c.f25244f3.N(true);
                                u0Var7.X(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f11344k0) {
                u0Var.W(i10, !u0Var.J.sell_gifts, new Runnable(u0Var) {
                    public final u0 f11271b;

                    {
                        this.f11271b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f11271b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                u0Var2.f11350c.f25244f3.N(true);
                                u0Var2.X(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f11271b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f11350c.f25244f3.N(true);
                                u0Var3.X(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f11271b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f11350c.f25244f3.N(true);
                                u0Var4.X(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f11271b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f11350c.f25244f3.N(true);
                                u0Var5.X(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f11271b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f11350c.f25244f3.N(true);
                                u0Var6.X(true);
                                return;
                            default:
                                u0 u0Var7 = this.f11271b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f11350c.f25244f3.N(true);
                                u0Var7.X(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f11345l0) {
                u0Var.W(i10, !u0Var.J.change_gift_settings, new Runnable(u0Var) {
                    public final u0 f11271b;

                    {
                        this.f11271b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f11271b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                u0Var2.f11350c.f25244f3.N(true);
                                u0Var2.X(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f11271b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f11350c.f25244f3.N(true);
                                u0Var3.X(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f11271b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f11350c.f25244f3.N(true);
                                u0Var4.X(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f11271b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f11350c.f25244f3.N(true);
                                u0Var5.X(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f11271b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f11350c.f25244f3.N(true);
                                u0Var6.X(true);
                                return;
                            default:
                                u0 u0Var7 = this.f11271b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f11350c.f25244f3.N(true);
                                u0Var7.X(true);
                                return;
                        }
                    }
                });
            } else if (i10 == m0) {
                u0Var.W(i10, !u0Var.J.transfer_and_upgrade_gifts, new Runnable(u0Var) {
                    public final u0 f11271b;

                    {
                        this.f11271b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f11271b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                u0Var2.f11350c.f25244f3.N(true);
                                u0Var2.X(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f11271b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f11350c.f25244f3.N(true);
                                u0Var3.X(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f11271b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f11350c.f25244f3.N(true);
                                u0Var4.X(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f11271b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f11350c.f25244f3.N(true);
                                u0Var5.X(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f11271b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f11350c.f25244f3.N(true);
                                u0Var6.X(true);
                                return;
                            default:
                                u0 u0Var7 = this.f11271b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f11350c.f25244f3.N(true);
                                u0Var7.X(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f11346n0) {
                u0Var.W(i10, !u0Var.J.transfer_stars, new Runnable(u0Var) {
                    public final u0 f11271b;

                    {
                        this.f11271b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f11271b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                u0Var2.f11350c.f25244f3.N(true);
                                u0Var2.X(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f11271b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f11350c.f25244f3.N(true);
                                u0Var3.X(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f11271b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f11350c.f25244f3.N(true);
                                u0Var4.X(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f11271b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f11350c.f25244f3.N(true);
                                u0Var5.X(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f11271b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f11350c.f25244f3.N(true);
                                u0Var6.X(true);
                                return;
                            default:
                                u0 u0Var7 = this.f11271b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f11350c.f25244f3.N(true);
                                u0Var7.X(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f11347o0) {
                u0Var.W(i10, !u0Var.J.manage_stories, new n0(u0Var, 0));
            }
        }
    }

    public final void W(int i10, boolean z10, final Runnable runnable) {
        if (!this.K && i10 == f11341h0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.a2(this) {
                public final u0 f11322b;

                {
                    this.f11322b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                    switch (r3) {
                        case 0:
                            this.f11322b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f11322b.L = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        } else if (!this.L && z10 && (i10 == f11344k0 || i10 == f11345l0 || i10 == m0 || i10 == f11346n0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20367a;
            b2Var2.R = string2;
            b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.a2(this) {
                public final u0 f11322b;

                {
                    this.f11322b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i11) {
                    switch (r3) {
                        case 0:
                            this.f11322b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f11322b.L = true;
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

    public final void X(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f11349b == null) {
            return;
        }
        boolean Y2 = Y();
        this.f11349b.setEnabled(Y2);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f11349b.animate();
            if (Y2) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (Y2) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (Y2) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.f11349b;
        if (Y2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f11349b;
        if (Y2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f11349b;
        if (Y2) {
            f13 = 1.0f;
        }
        v0Var3.setScaleY(f13);
    }

    public final boolean Y() {
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
                    j3 = user.f20184id;
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

    public final void Z() {
        boolean z10;
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (this.f11348a.f30863c <= 0.0f) {
            if (!Y()) {
                finishFragment();
            } else if (this.v.k(this.f11350c)) {
                TLRPC.User user2 = this.M;
                if (user2 != null && ((tL_connectedBot = this.H) == null || tL_connectedBot.bot_id != user2.f20184id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.H;
                if (tL_connectedBot2 != null && ((user = this.M) == null || tL_connectedBot2.bot_id != user.f20184id)) {
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
                        tL_connectedBot3.bot_id = this.M.f20184id;
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
        boolean z11 = this.f11356w;
        boolean e7 = this.d.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.N;
        if (!e7 && !this.f11357x && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.d.e() && !this.f11357x && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f11356w = z12;
            ViewPropertyAnimator animate = this.f11354r.animate();
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
            tr trVar = tr.h;
            duration.setInterpolator(trVar).start();
            ViewPropertyAnimator animate2 = this.f11355s.animate();
            if (!z12) {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (!z12) {
                f12 = AndroidUtilities.dp(8.0f);
            }
            alpha2.translationY(f12).setDuration(320L).setInterpolator(trVar).start();
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
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 11));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i12 = i6.f21154v8;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
        this.f11348a = new sr(mutate, new wp(i6.w0(null, i12, false)));
        this.f11349b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11348a);
        X(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.w0(null, i6.f20761a7, false));
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f11352f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        this.f11352f.setHintTextColor(i6.w0(null, i6.H6, false));
        EditTextBoldCursor editTextBoldCursor2 = this.f11352f;
        int i13 = i6.G6;
        editTextBoldCursor2.setTextColor(i6.w0(null, i13, false));
        this.f11352f.setBackgroundDrawable(null);
        this.f11352f.setMaxLines(1);
        this.f11352f.setLines(1);
        this.f11352f.setPadding(0, 0, 0, 0);
        this.f11352f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f11352f;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor3.setGravity(i10 | 48);
        this.f11352f.setInputType(180224);
        this.f11352f.setImeOptions(6);
        this.f11352f.setHint(LocaleController.getString(R.string.BusinessBotLink));
        this.f11352f.setCursorColor(i6.w0(null, i13, false));
        this.f11352f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f11352f.setCursorWidth(1.5f);
        this.f11352f.setOnEditorActionListener(new t0(this, 0));
        this.f11352f.addTextChangedListener(new i2(this, 2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f11351e = frameLayout2;
        frameLayout2.addView(this.f11352f, z5.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.f11351e;
        int i14 = i6.f20817d6;
        frameLayout3.setBackgroundColor(getThemedColor(i14));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(i6.f20818d7));
        FrameLayout frameLayout4 = this.f11351e;
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
        frameLayout4.addView(view2, z5.d(-1, f7, 87, f10, 0.0f, i15, 0.0f));
        w5 w5Var = new w5(context, 3);
        this.f11353n = w5Var;
        w5Var.setBackgroundColor(getThemedColor(i14));
        TextView textView = new TextView(context);
        this.f11354r = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.f11354r.setTextSize(1, 14.0f);
        TextView textView2 = this.f11354r;
        int i16 = i6.f21223z6;
        textView2.setTextColor(getThemedColor(i16));
        this.f11353n.addView(this.f11354r, z5.e(-2, -2, 17));
        this.f11355s = new ImageView(context);
        q8 q8Var = new q8(getThemedColor(i16));
        this.f11355s.setScaleType(ImageView.ScaleType.CENTER);
        this.f11355s.setImageDrawable(q8Var);
        this.f11353n.addView(this.f11355s, z5.e(-2, -2, 17));
        this.f11355s.setAlpha(0.0f);
        this.f11355s.setTranslationY(AndroidUtilities.dp(8.0f));
        gg.c2 c2Var = new gg.c2(true);
        this.d = c2Var;
        c2Var.f10531a = new xa.c(this, 25);
        a0 a0Var = new a0(this, new n0(this, 3));
        this.v = a0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.H;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        a0Var.i(tL_businessBotRecipients);
        c71 c71Var = new c71(this, new bi.v(this, 24), new q0(this, 3), null);
        this.f11350c = c71Var;
        c71Var.s1();
        c71 c71Var2 = this.f11350c;
        c71Var2.f25244f3.f31306r = false;
        frameLayout.addView(c71Var2, z5.c(-1.0f, -1));
        this.actionBar.z(this.f11350c, true);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (Y()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20367a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20367a.T = LocaleController.getString(R.string.BusinessBotUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new q0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new q0(this, 1));
                showDialog(alertDialog$Builder.f20367a);
                return false;
            }
        } else if (this.M != null || Y() || (this.d.d.isEmpty() && this.d.f10534e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.f20367a.R = LocaleController.getString(R.string.BusinessBotNoAddedTitle);
                alertDialog$Builder2.f20367a.T = LocaleController.getString(R.string.BusinessBotNoAddedText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.BusinessBotNoAddedButton), new q0(this, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder2.f20367a);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.S && !this.T) {
            this.S = true;
            f.a(this.currentAccount).c(new ai.y1(this, 24));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f11350c.setPadding(0, 0, 0, i13);
        this.f11350c.setClipToPadding(false);
    }
}
