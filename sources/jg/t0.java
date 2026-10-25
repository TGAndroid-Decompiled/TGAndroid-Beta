package jg;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.i4;
import fi.c8;
import hi.u2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
public final class t0 extends r2 {
    public static final int U = -1;
    public static final int V = -2;
    public static final int W = -3;
    public static final int X = -4;
    public static final int Y = -5;
    public static final int Z = -6;
    public static final int f15833a0 = -7;
    public static final int f15834b0 = -8;
    public static final int f15835c0 = -9;
    public static final int f15836d0 = -10;
    public static final int f15837e0 = -11;
    public static final int f15838f0 = -12;
    public static final int f15839g0 = -13;
    public static final int f15840h0 = -14;
    public static final int f15841i0 = -15;
    public static final int f15842j0 = -16;
    public static final int f15843k0 = -17;
    public static final int f15844l0 = -18;
    public static final int m0 = -19;
    public static final int f15845n0 = -20;
    public static final int f15846o0 = -21;
    public int E;
    public final m0 F;
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
    public u5 f15847a;
    public c8 f15848b;
    public r71 f15849c;
    public ig.a2 d;
    public FrameLayout e;
    public EditTextBoldCursor f15850f;
    public View h;
    public i4 f15851n;
    public TextView f15852r;
    public ImageView f15853s;
    public b0 v;
    public boolean f15854w;
    public boolean f15855x;
    public String f15856y;

    public t0() {
        super(null);
        this.E = 0;
        this.F = new m0(this, 4);
        this.J = TL_account.TL_businessBotRights.makeDefault();
        this.M = null;
        this.N = new LongSparseArray();
        this.O = -4;
        this.P = true;
        this.Q = false;
        this.R = false;
    }

    public static void V(t0 t0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        r2 U2;
        if (tL_error != null) {
            t0Var.f15847a.b(false);
            wc.e0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            t0Var.f15847a.b(false);
            vh.n(R.string.UnknownError, wc.b0(t0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.stageQueue.postRunnable(new u2(22, t0Var, tLObject));
            }
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                f.a(t0Var.currentAccount).b();
                t0Var.getMessagesController().clearFullUsers();
                t0Var.finishFragment();
                if (z10 && user != null) {
                    r2 U3 = LaunchActivity.U();
                    if (U3 != null) {
                        ic.a.s(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, wc.b0(U3), R.raw.contact_check, 36);
                    }
                } else if (user != null && (U2 = LaunchActivity.U()) != null) {
                    ic.a.s(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, wc.b0(U2), R.raw.contact_check, 36);
                }
            }
        }
    }

    public static void X(t0 t0Var, t61 t61Var, final View view) {
        if (t61Var.f32868g && !t0Var.v.h(t61Var)) {
            int i10 = t61Var.d;
            if (i10 == U) {
                b0 b0Var = t0Var.v;
                t0Var.I = true;
                b0Var.h = true;
                t0Var.f15849c.f32150g3.O(true);
                t0Var.Z(true);
            } else if (i10 == V) {
                b0 b0Var2 = t0Var.v;
                t0Var.I = false;
                b0Var2.h = false;
                t0Var.f15849c.f32150g3.O(true);
                t0Var.Z(true);
            } else if (i10 == W) {
                t0Var.M = null;
                t0Var.f15849c.f32150g3.O(true);
                t0Var.Z(true);
            } else if (t61Var.f47037a == 13) {
                TLRPC.User user = (TLRPC.User) t0Var.N.get(t61Var.f32883x);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(t0Var.getParentActivity(), 0, t0Var.resourceProvider);
                        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                        alertDialog$Builder.f22366a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        t0Var.showDialog(alertDialog$Builder.f22366a);
                        return;
                    }
                    t0Var.M = user;
                    AndroidUtilities.hideKeyboard(t0Var.f15850f);
                    t0Var.f15849c.f32150g3.O(true);
                    t0Var.Z(true);
                }
            } else if (i10 == X) {
                boolean z10 = !t0Var.P;
                t0Var.P = z10;
                ((z8) view).setChecked(z10);
                t0Var.f15849c.f32150g3.O(true);
            } else if (i10 == Y) {
                int i11 = -t0Var.O;
                t0Var.O = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
            } else if (i10 == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights = t0Var.J;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((org.telegram.ui.Cells.y1) view).c(z11, true);
                t0Var.f15849c.f32150g3.O(true);
                t0Var.Z(true);
            } else if (i10 == f15833a0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = t0Var.J;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((org.telegram.ui.Cells.y1) view).c(z12, true);
                t0Var.f15849c.f32150g3.O(true);
                t0Var.Z(true);
            } else if (i10 == f15834b0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = t0Var.J;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((org.telegram.ui.Cells.y1) view).c(z13, true);
                t0Var.f15849c.f32150g3.O(true);
                t0Var.Z(true);
            } else if (i10 == f15835c0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = t0Var.J;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((org.telegram.ui.Cells.y1) view).c(z14, true);
                t0Var.f15849c.f32150g3.O(true);
                t0Var.Z(true);
            } else if (i10 == f15836d0) {
                boolean z15 = !t0Var.Q;
                t0Var.Q = z15;
                ((z8) view).setChecked(z15);
                t0Var.f15849c.f32150g3.O(true);
            } else if (i10 == f15837e0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = t0Var.J;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((org.telegram.ui.Cells.y1) view).c(z16, true);
                t0Var.f15849c.f32150g3.O(true);
                t0Var.Z(true);
            } else if (i10 == f15838f0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = t0Var.J;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((org.telegram.ui.Cells.y1) view).c(z17, true);
                t0Var.f15849c.f32150g3.O(true);
                t0Var.Z(true);
            } else if (i10 == f15839g0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = t0Var.J;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((org.telegram.ui.Cells.y1) view).c(z18, true);
                t0Var.f15849c.f32150g3.O(true);
                t0Var.Z(true);
            } else if (i10 == f15840h0) {
                t0Var.Y(i10, !t0Var.J.edit_username, new Runnable(t0Var) {
                    public final t0 f15772b;

                    {
                        this.f15772b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f15772b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((org.telegram.ui.Cells.y1) view).c(z19, true);
                                t0Var2.f15849c.f32150g3.O(true);
                                t0Var2.Z(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f15772b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.y1) view).c(z20, true);
                                t0Var3.f15849c.f32150g3.O(true);
                                t0Var3.Z(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f15772b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.y1) view).c(z21, true);
                                t0Var4.f15849c.f32150g3.O(true);
                                t0Var4.Z(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f15772b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.y1) view).c(z22, true);
                                t0Var5.f15849c.f32150g3.O(true);
                                t0Var5.Z(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f15772b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.y1) view).c(z23, true);
                                t0Var6.f15849c.f32150g3.O(true);
                                t0Var6.Z(true);
                                return;
                            default:
                                t0 t0Var7 = this.f15772b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.y1) view).c(z24, true);
                                t0Var7.f15849c.f32150g3.O(true);
                                t0Var7.Z(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f15841i0) {
                boolean z19 = !t0Var.R;
                t0Var.R = z19;
                ((z8) view).setChecked(z19);
                t0Var.f15849c.f32150g3.O(true);
            } else if (i10 == f15842j0) {
                t0Var.Y(i10, !t0Var.J.view_gifts, new Runnable(t0Var) {
                    public final t0 f15772b;

                    {
                        this.f15772b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f15772b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.y1) view).c(z192, true);
                                t0Var2.f15849c.f32150g3.O(true);
                                t0Var2.Z(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f15772b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.y1) view).c(z20, true);
                                t0Var3.f15849c.f32150g3.O(true);
                                t0Var3.Z(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f15772b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.y1) view).c(z21, true);
                                t0Var4.f15849c.f32150g3.O(true);
                                t0Var4.Z(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f15772b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.y1) view).c(z22, true);
                                t0Var5.f15849c.f32150g3.O(true);
                                t0Var5.Z(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f15772b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.y1) view).c(z23, true);
                                t0Var6.f15849c.f32150g3.O(true);
                                t0Var6.Z(true);
                                return;
                            default:
                                t0 t0Var7 = this.f15772b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.y1) view).c(z24, true);
                                t0Var7.f15849c.f32150g3.O(true);
                                t0Var7.Z(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f15843k0) {
                t0Var.Y(i10, !t0Var.J.sell_gifts, new Runnable(t0Var) {
                    public final t0 f15772b;

                    {
                        this.f15772b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f15772b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.y1) view).c(z192, true);
                                t0Var2.f15849c.f32150g3.O(true);
                                t0Var2.Z(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f15772b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.y1) view).c(z20, true);
                                t0Var3.f15849c.f32150g3.O(true);
                                t0Var3.Z(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f15772b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.y1) view).c(z21, true);
                                t0Var4.f15849c.f32150g3.O(true);
                                t0Var4.Z(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f15772b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.y1) view).c(z22, true);
                                t0Var5.f15849c.f32150g3.O(true);
                                t0Var5.Z(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f15772b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.y1) view).c(z23, true);
                                t0Var6.f15849c.f32150g3.O(true);
                                t0Var6.Z(true);
                                return;
                            default:
                                t0 t0Var7 = this.f15772b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.y1) view).c(z24, true);
                                t0Var7.f15849c.f32150g3.O(true);
                                t0Var7.Z(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f15844l0) {
                t0Var.Y(i10, !t0Var.J.change_gift_settings, new Runnable(t0Var) {
                    public final t0 f15772b;

                    {
                        this.f15772b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f15772b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.y1) view).c(z192, true);
                                t0Var2.f15849c.f32150g3.O(true);
                                t0Var2.Z(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f15772b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.y1) view).c(z20, true);
                                t0Var3.f15849c.f32150g3.O(true);
                                t0Var3.Z(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f15772b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.y1) view).c(z21, true);
                                t0Var4.f15849c.f32150g3.O(true);
                                t0Var4.Z(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f15772b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.y1) view).c(z22, true);
                                t0Var5.f15849c.f32150g3.O(true);
                                t0Var5.Z(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f15772b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.y1) view).c(z23, true);
                                t0Var6.f15849c.f32150g3.O(true);
                                t0Var6.Z(true);
                                return;
                            default:
                                t0 t0Var7 = this.f15772b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.y1) view).c(z24, true);
                                t0Var7.f15849c.f32150g3.O(true);
                                t0Var7.Z(true);
                                return;
                        }
                    }
                });
            } else if (i10 == m0) {
                t0Var.Y(i10, !t0Var.J.transfer_and_upgrade_gifts, new Runnable(t0Var) {
                    public final t0 f15772b;

                    {
                        this.f15772b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f15772b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.y1) view).c(z192, true);
                                t0Var2.f15849c.f32150g3.O(true);
                                t0Var2.Z(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f15772b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.y1) view).c(z20, true);
                                t0Var3.f15849c.f32150g3.O(true);
                                t0Var3.Z(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f15772b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.y1) view).c(z21, true);
                                t0Var4.f15849c.f32150g3.O(true);
                                t0Var4.Z(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f15772b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.y1) view).c(z22, true);
                                t0Var5.f15849c.f32150g3.O(true);
                                t0Var5.Z(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f15772b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.y1) view).c(z23, true);
                                t0Var6.f15849c.f32150g3.O(true);
                                t0Var6.Z(true);
                                return;
                            default:
                                t0 t0Var7 = this.f15772b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.y1) view).c(z24, true);
                                t0Var7.f15849c.f32150g3.O(true);
                                t0Var7.Z(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f15845n0) {
                t0Var.Y(i10, !t0Var.J.transfer_stars, new Runnable(t0Var) {
                    public final t0 f15772b;

                    {
                        this.f15772b = t0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                t0 t0Var2 = this.f15772b;
                                t0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = t0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.y1) view).c(z192, true);
                                t0Var2.f15849c.f32150g3.O(true);
                                t0Var2.Z(true);
                                return;
                            case 1:
                                t0 t0Var3 = this.f15772b;
                                t0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = t0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.y1) view).c(z20, true);
                                t0Var3.f15849c.f32150g3.O(true);
                                t0Var3.Z(true);
                                return;
                            case 2:
                                t0 t0Var4 = this.f15772b;
                                t0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = t0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.y1) view).c(z21, true);
                                t0Var4.f15849c.f32150g3.O(true);
                                t0Var4.Z(true);
                                return;
                            case 3:
                                t0 t0Var5 = this.f15772b;
                                t0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = t0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.y1) view).c(z22, true);
                                t0Var5.f15849c.f32150g3.O(true);
                                t0Var5.Z(true);
                                return;
                            case 4:
                                t0 t0Var6 = this.f15772b;
                                t0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = t0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.y1) view).c(z23, true);
                                t0Var6.f15849c.f32150g3.O(true);
                                t0Var6.Z(true);
                                return;
                            default:
                                t0 t0Var7 = this.f15772b;
                                t0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = t0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.y1) view).c(z24, true);
                                t0Var7.f15849c.f32150g3.O(true);
                                t0Var7.Z(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f15846o0) {
                t0Var.Y(i10, !t0Var.J.manage_stories, new m0(t0Var, 0));
            }
        }
    }

    public final void Y(int i10, boolean z10, final Runnable runnable) {
        if (!this.K && i10 == f15840h0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
            e2Var.R = string;
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.b2(this) {
                public final t0 f15822b;

                {
                    this.f15822b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i11) {
                    switch (r3) {
                        case 0:
                            this.f15822b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f15822b.L = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        } else if (!this.L && z10 && (i10 == f15843k0 || i10 == f15844l0 || i10 == m0 || i10 == f15845n0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22366a;
            e2Var2.R = string2;
            e2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.b2(this) {
                public final t0 f15822b;

                {
                    this.f15822b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var22, int i11) {
                    switch (r3) {
                        case 0:
                            this.f15822b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f15822b.L = true;
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

    public final void Z(boolean z10) {
        if (this.f15847a == null) {
            return;
        }
        this.f15847a.a(a0(), z10);
    }

    public final boolean a0() {
        boolean z10;
        boolean z11;
        long j10;
        b0 b0Var;
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
                    j10 = user.f22174id;
                }
                if (tL_connectedBot != null) {
                    j11 = tL_connectedBot.bot_id;
                }
                if (j10 == j11 && (user == null || (this.J.equals(tL_connectedBot.rights) && ((b0Var = this.v) == null || !b0Var.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void b0() {
        boolean z10;
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (!this.f15847a.f23137x.f19327f) {
            if (!a0()) {
                finishFragment();
            } else if (this.v.k(this.f15849c)) {
                TLRPC.User user2 = this.M;
                if (user2 != null && ((tL_connectedBot = this.H) == null || tL_connectedBot.bot_id != user2.f22174id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.H;
                if (tL_connectedBot2 != null && ((user = this.M) == null || tL_connectedBot2.bot_id != user.f22174id)) {
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
                        tL_connectedBot3.bot_id = this.M.f22174id;
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
                    getConnectionsManager().sendRequest((TLObject) arrayList.get(i10), new n0(this, iArr, arrayList, z10, user2));
                }
            }
        }
    }

    public final void c0() {
        boolean z10;
        float f7;
        float f10;
        boolean z11 = this.f15854w;
        boolean e = this.d.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.N;
        if (!e && !this.f15855x && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.d.e() && !this.f15855x && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f15854w = z12;
            ViewPropertyAnimator animate = this.f15852r.animate();
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
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).start();
            ViewPropertyAnimator animate2 = this.f15853s.animate();
            if (!z12) {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (!z12) {
                f12 = AndroidUtilities.dp(8.0f);
            }
            alpha2.translationY(f12).setDuration(320L).setInterpolator(dsVar).start();
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.BusinessBots2));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 13));
        this.f15847a = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f15850f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        f7.E(this.f15850f, y6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f15850f;
        int i12 = y6.G6;
        f7.V(editTextBoldCursor2, i12, null);
        this.f15850f.setBackgroundDrawable(null);
        this.f15850f.setMaxLines(1);
        this.f15850f.setLines(1);
        this.f15850f.setPadding(0, 0, 0, 0);
        this.f15850f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f15850f;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor3.setGravity(i10 | 48);
        this.f15850f.setInputType(180224);
        this.f15850f.setImeOptions(6);
        this.f15850f.setHint(LocaleController.getString(R.string.BusinessBotLink));
        f7.w(this.f15850f, i12, null);
        this.f15850f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f15850f.setCursorWidth(1.5f);
        this.f15850f.setOnEditorActionListener(new bi.o(this, 1));
        this.f15850f.addTextChangedListener(new bi.u(this, 3));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f15850f, gb1.h(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i13 = y6.f23354d6;
        f7.i(i13, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.h = view;
        f7.i(y6.f23355d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f7 = 1.0f / AndroidUtilities.density;
        boolean z10 = LocaleController.isRTL;
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
        frameLayout4.addView(view2, gb1.h(-1, f7, 87, f10, 0.0f, i14, 0.0f));
        i4 i4Var = new i4(context, 3);
        this.f15851n = i4Var;
        f7.i(i13, i4Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.f15852r = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.f15852r.setTextSize(1, 14.0f);
        TextView textView2 = this.f15852r;
        int i15 = y6.f23765z6;
        f7.V(textView2, i15, getResourceProvider());
        this.f15851n.addView(this.f15852r, gb1.i(-2, -2, 17));
        this.f15853s = new ImageView(context);
        c8 c8Var = new c8(getThemedColor(i15));
        this.f15853s.setScaleType(ImageView.ScaleType.CENTER);
        this.f15853s.setImageDrawable(c8Var);
        this.f15848b = c8Var;
        this.f15851n.addView(this.f15853s, gb1.i(-2, -2, 17));
        this.f15853s.setAlpha(0.0f);
        this.f15853s.setTranslationY(AndroidUtilities.dp(8.0f));
        ig.a2 a2Var = new ig.a2(true);
        this.d = a2Var;
        a2Var.f13988a = new s0(this, 0);
        b0 b0Var = new b0(this, new m0(this, 3));
        this.v = b0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.H;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        b0Var.i(tL_businessBotRecipients);
        r71 r71Var = new r71(this, new hi.e2(this, 8), new p0(this, 3), null);
        this.f15849c = r71Var;
        r71Var.u1();
        this.f15849c.setSectionsDrawBackground(true);
        r71 r71Var2 = this.f15849c;
        r71Var2.f32150g3.f29505r = false;
        frameLayout.addView(r71Var2, gb1.g(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final mm0 getListViewForSimpleGlass() {
        return this.f15849c;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (a0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.BusinessBotUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new p0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new p0(this, 1));
                showDialog(alertDialog$Builder.f22366a);
                return false;
            }
        } else if (this.M != null || a0() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.f22366a.R = LocaleController.getString(R.string.BusinessBotNoAddedTitle);
                alertDialog$Builder2.f22366a.T = LocaleController.getString(R.string.BusinessBotNoAddedText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.BusinessBotNoAddedButton), new p0(this, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder2.f22366a);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.S && !this.T) {
            this.S = true;
            f.a(this.currentAccount).c(new ig.o(this, 4));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            c8 c8Var = this.f15848b;
            if (c8Var != null) {
                c8Var.b(getThemedColor(y6.f23765z6));
                ImageView imageView = this.f15853s;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
