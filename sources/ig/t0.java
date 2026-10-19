package ig;

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
import ci.i4;
import ei.g8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.lk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.u8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import w7.z5;
public final class t0 extends n2 {
    public static final int U = -1;
    public static final int V = -2;
    public static final int W = -3;
    public static final int X = -4;
    public static final int Y = -5;
    public static final int Z = -6;
    public static final int f13018a0 = -7;
    public static final int f13019b0 = -8;
    public static final int f13020c0 = -9;
    public static final int f13021d0 = -10;
    public static final int f13022e0 = -11;
    public static final int f13023f0 = -12;
    public static final int f13024g0 = -13;
    public static final int f13025h0 = -14;
    public static final int f13026i0 = -15;
    public static final int f13027j0 = -16;
    public static final int f13028k0 = -17;
    public static final int f13029l0 = -18;
    public static final int m0 = -19;
    public static final int f13030n0 = -20;
    public static final int f13031o0 = -21;
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
    public as f13032a;
    public org.telegram.ui.ActionBar.u0 f13033b;
    public b71 f13034c;
    public hg.a2 d;
    public FrameLayout e;
    public EditTextBoldCursor f13035f;
    public View h;
    public i4 f13036n;
    public TextView f13037r;
    public ImageView f13038s;
    public a0 v;
    public boolean f13039w;
    public boolean f13040x;
    public String f13041y;

    public t0() {
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

    public static void U(t0 t0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        n2 U2;
        if (tL_error != null) {
            t0Var.f13032a.a(0.0f);
            xc.d0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            t0Var.f13032a.a(0.0f);
            lk.q(R.string.UnknownError, xc.a0(t0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.stageQueue.postRunnable(new hi.t(5, t0Var, tLObject));
            }
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                f.a(t0Var.currentAccount).b();
                t0Var.getMessagesController().clearFullUsers();
                t0Var.finishFragment();
                if (z10 && user != null) {
                    n2 U3 = LaunchActivity.U();
                    if (U3 != null) {
                        i2.e.s(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, xc.a0(U3), R.raw.contact_check, 36);
                    }
                } else if (user != null && (U2 = LaunchActivity.U()) != null) {
                    i2.e.s(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, xc.a0(U2), R.raw.contact_check, 36);
                }
            }
        }
    }

    public static void W(t0 t0Var, g61 g61Var, final View view) {
        if (g61Var.f26495g && !t0Var.v.h(g61Var)) {
            int i10 = g61Var.d;
            if (i10 == U) {
                a0 a0Var = t0Var.v;
                t0Var.I = true;
                a0Var.h = true;
                t0Var.f13034c.W2.N(true);
                t0Var.Y(true);
            } else if (i10 == V) {
                a0 a0Var2 = t0Var.v;
                t0Var.I = false;
                a0Var2.h = false;
                t0Var.f13034c.W2.N(true);
                t0Var.Y(true);
            } else if (i10 == W) {
                t0Var.M = null;
                t0Var.f13034c.W2.N(true);
                t0Var.Y(true);
            } else if (g61Var.f44286a == 13) {
                TLRPC.User user = (TLRPC.User) t0Var.N.get(g61Var.f26510x);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(t0Var.getParentActivity(), 0, t0Var.resourceProvider);
                        alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                        alertDialog$Builder.f20604a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        t0Var.showDialog(alertDialog$Builder.f20604a);
                        return;
                    }
                    t0Var.M = user;
                    AndroidUtilities.hideKeyboard(t0Var.f13035f);
                    t0Var.f13034c.W2.N(true);
                    t0Var.Y(true);
                }
            } else if (i10 == X) {
                boolean z10 = !t0Var.P;
                t0Var.P = z10;
                ((u8) view).setChecked(z10);
                t0Var.f13034c.W2.N(true);
            } else if (i10 == Y) {
                int i11 = -t0Var.O;
                t0Var.O = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
            } else if (i10 == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights = t0Var.J;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((org.telegram.ui.Cells.a2) view).c(z11, true);
                t0Var.f13034c.W2.N(true);
                t0Var.Y(true);
            } else if (i10 == f13018a0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var.J;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((org.telegram.ui.Cells.a2) view).c(z12, true);
                t0Var.f13034c.W2.N(true);
                t0Var.Y(true);
            } else if (i10 == f13019b0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var.J;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((org.telegram.ui.Cells.a2) view).c(z13, true);
                t0Var.f13034c.W2.N(true);
                t0Var.Y(true);
            } else if (i10 == f13020c0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = t0Var.J;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((org.telegram.ui.Cells.a2) view).c(z14, true);
                t0Var.f13034c.W2.N(true);
                t0Var.Y(true);
            } else if (i10 == f13021d0) {
                boolean z15 = !t0Var.Q;
                t0Var.Q = z15;
                ((u8) view).setChecked(z15);
                t0Var.f13034c.W2.N(true);
            } else if (i10 == f13022e0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = t0Var.J;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((org.telegram.ui.Cells.a2) view).c(z16, true);
                t0Var.f13034c.W2.N(true);
                t0Var.Y(true);
            } else if (i10 == f13023f0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = t0Var.J;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((org.telegram.ui.Cells.a2) view).c(z17, true);
                t0Var.f13034c.W2.N(true);
                t0Var.Y(true);
            } else if (i10 == f13024g0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = t0Var.J;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((org.telegram.ui.Cells.a2) view).c(z18, true);
                t0Var.f13034c.W2.N(true);
                t0Var.Y(true);
            } else if (i10 == f13025h0) {
                t0Var.X(i10, !t0Var.J.edit_username, new Runnable(t0Var) {
                    public final t0 f12966b;

                    {
                        this.f12966b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f12966b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((org.telegram.ui.Cells.a2) view).c(z19, true);
                                t0Var2.f13034c.W2.N(true);
                                t0Var2.Y(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f12966b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                t0Var3.f13034c.W2.N(true);
                                t0Var3.Y(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f12966b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                t0Var4.f13034c.W2.N(true);
                                t0Var4.Y(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f12966b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                t0Var5.f13034c.W2.N(true);
                                t0Var5.Y(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f12966b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                t0Var6.f13034c.W2.N(true);
                                t0Var6.Y(true);
                                return;
                            default:
                                t0 t0Var7 = this.f12966b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                t0Var7.f13034c.W2.N(true);
                                t0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f13026i0) {
                boolean z19 = !t0Var.R;
                t0Var.R = z19;
                ((u8) view).setChecked(z19);
                t0Var.f13034c.W2.N(true);
            } else if (i10 == f13027j0) {
                t0Var.X(i10, !t0Var.J.view_gifts, new Runnable(t0Var) {
                    public final t0 f12966b;

                    {
                        this.f12966b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f12966b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                t0Var2.f13034c.W2.N(true);
                                t0Var2.Y(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f12966b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                t0Var3.f13034c.W2.N(true);
                                t0Var3.Y(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f12966b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                t0Var4.f13034c.W2.N(true);
                                t0Var4.Y(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f12966b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                t0Var5.f13034c.W2.N(true);
                                t0Var5.Y(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f12966b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                t0Var6.f13034c.W2.N(true);
                                t0Var6.Y(true);
                                return;
                            default:
                                t0 t0Var7 = this.f12966b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                t0Var7.f13034c.W2.N(true);
                                t0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f13028k0) {
                t0Var.X(i10, !t0Var.J.sell_gifts, new Runnable(t0Var) {
                    public final t0 f12966b;

                    {
                        this.f12966b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f12966b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                t0Var2.f13034c.W2.N(true);
                                t0Var2.Y(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f12966b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                t0Var3.f13034c.W2.N(true);
                                t0Var3.Y(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f12966b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                t0Var4.f13034c.W2.N(true);
                                t0Var4.Y(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f12966b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                t0Var5.f13034c.W2.N(true);
                                t0Var5.Y(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f12966b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                t0Var6.f13034c.W2.N(true);
                                t0Var6.Y(true);
                                return;
                            default:
                                t0 t0Var7 = this.f12966b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                t0Var7.f13034c.W2.N(true);
                                t0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f13029l0) {
                t0Var.X(i10, !t0Var.J.change_gift_settings, new Runnable(t0Var) {
                    public final t0 f12966b;

                    {
                        this.f12966b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f12966b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                t0Var2.f13034c.W2.N(true);
                                t0Var2.Y(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f12966b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                t0Var3.f13034c.W2.N(true);
                                t0Var3.Y(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f12966b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                t0Var4.f13034c.W2.N(true);
                                t0Var4.Y(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f12966b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                t0Var5.f13034c.W2.N(true);
                                t0Var5.Y(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f12966b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                t0Var6.f13034c.W2.N(true);
                                t0Var6.Y(true);
                                return;
                            default:
                                t0 t0Var7 = this.f12966b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                t0Var7.f13034c.W2.N(true);
                                t0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == m0) {
                t0Var.X(i10, !t0Var.J.transfer_and_upgrade_gifts, new Runnable(t0Var) {
                    public final t0 f12966b;

                    {
                        this.f12966b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f12966b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                t0Var2.f13034c.W2.N(true);
                                t0Var2.Y(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f12966b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                t0Var3.f13034c.W2.N(true);
                                t0Var3.Y(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f12966b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                t0Var4.f13034c.W2.N(true);
                                t0Var4.Y(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f12966b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                t0Var5.f13034c.W2.N(true);
                                t0Var5.Y(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f12966b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                t0Var6.f13034c.W2.N(true);
                                t0Var6.Y(true);
                                return;
                            default:
                                t0 t0Var7 = this.f12966b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                t0Var7.f13034c.W2.N(true);
                                t0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f13030n0) {
                t0Var.X(i10, !t0Var.J.transfer_stars, new Runnable(t0Var) {
                    public final t0 f12966b;

                    {
                        this.f12966b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f12966b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                t0Var2.f13034c.W2.N(true);
                                t0Var2.Y(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f12966b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                t0Var3.f13034c.W2.N(true);
                                t0Var3.Y(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f12966b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                t0Var4.f13034c.W2.N(true);
                                t0Var4.Y(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f12966b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                t0Var5.f13034c.W2.N(true);
                                t0Var5.Y(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f12966b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                t0Var6.f13034c.W2.N(true);
                                t0Var6.Y(true);
                                return;
                            default:
                                t0 t0Var7 = this.f12966b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                t0Var7.f13034c.W2.N(true);
                                t0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f13031o0) {
                t0Var.X(i10, !t0Var.J.manage_stories, new n0(t0Var, 0));
            }
        }
    }

    public final void X(int i10, boolean z10, final Runnable runnable) {
        if (!this.K && i10 == f13025h0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.a2(this) {
                public final t0 f13010b;

                {
                    this.f13010b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                    switch (r3) {
                        case 0:
                            this.f13010b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f13010b.L = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        } else if (!this.L && z10 && (i10 == f13028k0 || i10 == f13029l0 || i10 == m0 || i10 == f13030n0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20604a;
            b2Var2.R = string2;
            b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.a2(this) {
                public final t0 f13010b;

                {
                    this.f13010b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var22, int i11) {
                    switch (r3) {
                        case 0:
                            this.f13010b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f13010b.L = true;
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
        if (this.f13033b == null) {
            return;
        }
        boolean Z2 = Z();
        this.f13033b.setEnabled(Z2);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f13033b.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f13033b;
        if (Z2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f13033b;
        if (Z2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f13033b;
        if (Z2) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean Z() {
        boolean z10;
        boolean z11;
        long j10;
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
                long j11 = 0;
                if (user == null) {
                    j10 = 0;
                } else {
                    j10 = user.f20422id;
                }
                if (tL_connectedBot != null) {
                    j11 = tL_connectedBot.bot_id;
                }
                if (j10 == j11 && (user == null || (this.J.equals(tL_connectedBot.rights) && ((a0Var = this.v) == null || !a0Var.g())))) {
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
        if (this.f13032a.f24691c <= 0.0f) {
            if (!Z()) {
                finishFragment();
            } else if (this.v.k(this.f13034c)) {
                TLRPC.User user2 = this.M;
                if (user2 != null && ((tL_connectedBot = this.H) == null || tL_connectedBot.bot_id != user2.f20422id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.H;
                if (tL_connectedBot2 != null && ((user = this.M) == null || tL_connectedBot2.bot_id != user.f20422id)) {
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
                        tL_connectedBot3.bot_id = this.M.f20422id;
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
        boolean z11 = this.f13039w;
        boolean e = this.d.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.N;
        if (!e && !this.f13040x && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.d.e() && !this.f13040x && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f13039w = z12;
            ViewPropertyAnimator animate = this.f13037r.animate();
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
            bs bsVar = bs.h;
            duration.setInterpolator(bsVar).start();
            ViewPropertyAnimator animate2 = this.f13038s.animate();
            if (!z12) {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (!z12) {
                f12 = AndroidUtilities.dp(8.0f);
            }
            alpha2.translationY(f12).setDuration(320L).setInterpolator(bsVar).start();
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
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 13));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i12 = h6.f21324v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.x0(null, i12, false), PorterDuff.Mode.MULTIPLY));
        this.f13032a = new as(mutate, new dq(h6.x0(null, i12, false)));
        this.f13033b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f13032a);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20931a7, false));
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f13035f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        this.f13035f.setHintTextColor(h6.x0(null, h6.H6, false));
        EditTextBoldCursor editTextBoldCursor2 = this.f13035f;
        int i13 = h6.G6;
        editTextBoldCursor2.setTextColor(h6.x0(null, i13, false));
        this.f13035f.setBackgroundDrawable(null);
        this.f13035f.setMaxLines(1);
        this.f13035f.setLines(1);
        this.f13035f.setPadding(0, 0, 0, 0);
        this.f13035f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f13035f;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor3.setGravity(i10 | 48);
        this.f13035f.setInputType(180224);
        this.f13035f.setImeOptions(6);
        this.f13035f.setHint(LocaleController.getString(R.string.BusinessBotLink));
        this.f13035f.setCursorColor(h6.x0(null, i13, false));
        this.f13035f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f13035f.setCursorWidth(1.5f);
        this.f13035f.setOnEditorActionListener(new ai.n(this, 1));
        this.f13035f.addTextChangedListener(new ai.u(this, 3));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f13035f, z5.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i14 = h6.f20989d6;
        frameLayout3.setBackgroundColor(getThemedColor(i14));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(h6.f20990d7));
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
        frameLayout4.addView(view2, z5.d(-1, f7, 87, f10, 0.0f, i15, 0.0f));
        i4 i4Var = new i4(context, 3);
        this.f13036n = i4Var;
        i4Var.setBackgroundColor(getThemedColor(i14));
        TextView textView = new TextView(context);
        this.f13037r = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.f13037r.setTextSize(1, 14.0f);
        TextView textView2 = this.f13037r;
        int i16 = h6.f21394z6;
        textView2.setTextColor(getThemedColor(i16));
        this.f13036n.addView(this.f13037r, z5.e(-2, -2, 17));
        this.f13038s = new ImageView(context);
        g8 g8Var = new g8(getThemedColor(i16));
        this.f13038s.setScaleType(ImageView.ScaleType.CENTER);
        this.f13038s.setImageDrawable(g8Var);
        this.f13036n.addView(this.f13038s, z5.e(-2, -2, 17));
        this.f13038s.setAlpha(0.0f);
        this.f13038s.setTranslationY(AndroidUtilities.dp(8.0f));
        hg.a2 a2Var = new hg.a2(true);
        this.d = a2Var;
        a2Var.f11794a = new a6.i(this, 26);
        a0 a0Var = new a0(this, new n0(this, 3));
        this.v = a0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.H;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        a0Var.i(tL_businessBotRecipients);
        b71 b71Var = new b71(this, new hg.o(this, 5), new q0(this, 3), null);
        this.f13034c = b71Var;
        b71Var.p1();
        b71 b71Var2 = this.f13034c;
        b71Var2.W2.f30438r = false;
        frameLayout.addView(b71Var2, z5.c(-1.0f, -1));
        this.actionBar.A(this.f13034c, true);
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
                alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20604a.T = LocaleController.getString(R.string.BusinessBotUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new q0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new q0(this, 1));
                showDialog(alertDialog$Builder.f20604a);
                return false;
            }
        } else if (this.M != null || Z() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.f20604a.R = LocaleController.getString(R.string.BusinessBotNoAddedTitle);
                alertDialog$Builder2.f20604a.T = LocaleController.getString(R.string.BusinessBotNoAddedText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.BusinessBotNoAddedButton), new q0(this, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder2.f20604a);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.S && !this.T) {
            this.S = true;
            f.a(this.currentAccount).c(new l0(this, 0));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f13034c.setPadding(0, 0, 0, i13);
        this.f13034c.setClipToPadding(false);
    }
}
