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
import bi.i5;
import di.h2;
import di.q8;
import fi.q3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import w7.a6;
public final class u0 extends m2 {
    public static final int U = -1;
    public static final int V = -2;
    public static final int W = -3;
    public static final int X = -4;
    public static final int Y = -5;
    public static final int Z = -6;
    public static final int f11633a0 = -7;
    public static final int f11634b0 = -8;
    public static final int f11635c0 = -9;
    public static final int f11636d0 = -10;
    public static final int f11637e0 = -11;
    public static final int f11638f0 = -12;
    public static final int f11639g0 = -13;
    public static final int f11640h0 = -14;
    public static final int f11641i0 = -15;
    public static final int f11642j0 = -16;
    public static final int f11643k0 = -17;
    public static final int f11644l0 = -18;
    public static final int m0 = -19;
    public static final int f11645n0 = -20;
    public static final int f11646o0 = -21;
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
    public ds f11647a;
    public org.telegram.ui.ActionBar.u0 f11648b;
    public h71 f11649c;
    public hg.a2 d;
    public FrameLayout e;
    public EditTextBoldCursor f11650f;
    public View h;
    public i5 f11651n;
    public TextView f11652r;
    public ImageView f11653s;
    public a0 v;
    public boolean f11654w;
    public boolean f11655x;
    public String f11656y;

    public u0() {
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

    public static void U(u0 u0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        m2 U2;
        if (tL_error != null) {
            u0Var.f11647a.a(0.0f);
            zc.d0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            u0Var.f11647a.a(0.0f);
            yh.p(R.string.UnknownError, zc.a0(u0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.stageQueue.postRunnable(new q3(16, u0Var, tLObject));
            }
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                f.a(u0Var.currentAccount).b();
                u0Var.getMessagesController().clearFullUsers();
                u0Var.finishFragment();
                if (z10 && user != null) {
                    m2 U3 = LaunchActivity.U();
                    if (U3 != null) {
                        i2.d.q(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, zc.a0(U3), R.raw.contact_check, 36);
                    }
                } else if (user != null && (U2 = LaunchActivity.U()) != null) {
                    i2.d.q(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, zc.a0(U2), R.raw.contact_check, 36);
                }
            }
        }
    }

    public static void W(u0 u0Var, l61 l61Var, final View view) {
        if (l61Var.f26950g && !u0Var.v.h(l61Var)) {
            int i10 = l61Var.d;
            if (i10 == U) {
                a0 a0Var = u0Var.v;
                u0Var.I = true;
                a0Var.h = true;
                u0Var.f11649c.W2.N(true);
                u0Var.Y(true);
            } else if (i10 == V) {
                a0 a0Var2 = u0Var.v;
                u0Var.I = false;
                a0Var2.h = false;
                u0Var.f11649c.W2.N(true);
                u0Var.Y(true);
            } else if (i10 == W) {
                u0Var.M = null;
                u0Var.f11649c.W2.N(true);
                u0Var.Y(true);
            } else if (l61Var.f43203a == 13) {
                TLRPC.User user = (TLRPC.User) u0Var.N.get(l61Var.f26965x);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u0Var.getParentActivity(), 0, u0Var.resourceProvider);
                        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                        alertDialog$Builder.f19548a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        u0Var.showDialog(alertDialog$Builder.f19548a);
                        return;
                    }
                    u0Var.M = user;
                    AndroidUtilities.hideKeyboard(u0Var.f11650f);
                    u0Var.f11649c.W2.N(true);
                    u0Var.Y(true);
                }
            } else if (i10 == X) {
                boolean z10 = !u0Var.P;
                u0Var.P = z10;
                ((v8) view).setChecked(z10);
                u0Var.f11649c.W2.N(true);
            } else if (i10 == Y) {
                int i11 = -u0Var.O;
                u0Var.O = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
            } else if (i10 == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights = u0Var.J;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((org.telegram.ui.Cells.a2) view).c(z11, true);
                u0Var.f11649c.W2.N(true);
                u0Var.Y(true);
            } else if (i10 == f11633a0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = u0Var.J;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((org.telegram.ui.Cells.a2) view).c(z12, true);
                u0Var.f11649c.W2.N(true);
                u0Var.Y(true);
            } else if (i10 == f11634b0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = u0Var.J;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((org.telegram.ui.Cells.a2) view).c(z13, true);
                u0Var.f11649c.W2.N(true);
                u0Var.Y(true);
            } else if (i10 == f11635c0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = u0Var.J;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((org.telegram.ui.Cells.a2) view).c(z14, true);
                u0Var.f11649c.W2.N(true);
                u0Var.Y(true);
            } else if (i10 == f11636d0) {
                boolean z15 = !u0Var.Q;
                u0Var.Q = z15;
                ((v8) view).setChecked(z15);
                u0Var.f11649c.W2.N(true);
            } else if (i10 == f11637e0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = u0Var.J;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((org.telegram.ui.Cells.a2) view).c(z16, true);
                u0Var.f11649c.W2.N(true);
                u0Var.Y(true);
            } else if (i10 == f11638f0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = u0Var.J;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((org.telegram.ui.Cells.a2) view).c(z17, true);
                u0Var.f11649c.W2.N(true);
                u0Var.Y(true);
            } else if (i10 == f11639g0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = u0Var.J;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((org.telegram.ui.Cells.a2) view).c(z18, true);
                u0Var.f11649c.W2.N(true);
                u0Var.Y(true);
            } else if (i10 == f11640h0) {
                u0Var.X(i10, !u0Var.J.edit_username, new Runnable(u0Var) {
                    public final u0 f11566b;

                    {
                        this.f11566b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f11566b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((org.telegram.ui.Cells.a2) view).c(z19, true);
                                u0Var2.f11649c.W2.N(true);
                                u0Var2.Y(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f11566b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f11649c.W2.N(true);
                                u0Var3.Y(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f11566b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f11649c.W2.N(true);
                                u0Var4.Y(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f11566b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f11649c.W2.N(true);
                                u0Var5.Y(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f11566b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f11649c.W2.N(true);
                                u0Var6.Y(true);
                                return;
                            default:
                                u0 u0Var7 = this.f11566b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f11649c.W2.N(true);
                                u0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f11641i0) {
                boolean z19 = !u0Var.R;
                u0Var.R = z19;
                ((v8) view).setChecked(z19);
                u0Var.f11649c.W2.N(true);
            } else if (i10 == f11642j0) {
                u0Var.X(i10, !u0Var.J.view_gifts, new Runnable(u0Var) {
                    public final u0 f11566b;

                    {
                        this.f11566b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f11566b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                u0Var2.f11649c.W2.N(true);
                                u0Var2.Y(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f11566b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f11649c.W2.N(true);
                                u0Var3.Y(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f11566b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f11649c.W2.N(true);
                                u0Var4.Y(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f11566b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f11649c.W2.N(true);
                                u0Var5.Y(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f11566b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f11649c.W2.N(true);
                                u0Var6.Y(true);
                                return;
                            default:
                                u0 u0Var7 = this.f11566b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f11649c.W2.N(true);
                                u0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f11643k0) {
                u0Var.X(i10, !u0Var.J.sell_gifts, new Runnable(u0Var) {
                    public final u0 f11566b;

                    {
                        this.f11566b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f11566b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                u0Var2.f11649c.W2.N(true);
                                u0Var2.Y(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f11566b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f11649c.W2.N(true);
                                u0Var3.Y(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f11566b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f11649c.W2.N(true);
                                u0Var4.Y(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f11566b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f11649c.W2.N(true);
                                u0Var5.Y(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f11566b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f11649c.W2.N(true);
                                u0Var6.Y(true);
                                return;
                            default:
                                u0 u0Var7 = this.f11566b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f11649c.W2.N(true);
                                u0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f11644l0) {
                u0Var.X(i10, !u0Var.J.change_gift_settings, new Runnable(u0Var) {
                    public final u0 f11566b;

                    {
                        this.f11566b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f11566b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                u0Var2.f11649c.W2.N(true);
                                u0Var2.Y(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f11566b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f11649c.W2.N(true);
                                u0Var3.Y(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f11566b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f11649c.W2.N(true);
                                u0Var4.Y(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f11566b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f11649c.W2.N(true);
                                u0Var5.Y(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f11566b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f11649c.W2.N(true);
                                u0Var6.Y(true);
                                return;
                            default:
                                u0 u0Var7 = this.f11566b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f11649c.W2.N(true);
                                u0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == m0) {
                u0Var.X(i10, !u0Var.J.transfer_and_upgrade_gifts, new Runnable(u0Var) {
                    public final u0 f11566b;

                    {
                        this.f11566b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f11566b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                u0Var2.f11649c.W2.N(true);
                                u0Var2.Y(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f11566b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f11649c.W2.N(true);
                                u0Var3.Y(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f11566b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f11649c.W2.N(true);
                                u0Var4.Y(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f11566b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f11649c.W2.N(true);
                                u0Var5.Y(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f11566b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f11649c.W2.N(true);
                                u0Var6.Y(true);
                                return;
                            default:
                                u0 u0Var7 = this.f11566b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f11649c.W2.N(true);
                                u0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f11645n0) {
                u0Var.X(i10, !u0Var.J.transfer_stars, new Runnable(u0Var) {
                    public final u0 f11566b;

                    {
                        this.f11566b = u0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u0 u0Var2 = this.f11566b;
                                u0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = u0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.a2) view).c(z192, true);
                                u0Var2.f11649c.W2.N(true);
                                u0Var2.Y(true);
                                return;
                            case 1:
                                u0 u0Var3 = this.f11566b;
                                u0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = u0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.a2) view).c(z20, true);
                                u0Var3.f11649c.W2.N(true);
                                u0Var3.Y(true);
                                return;
                            case 2:
                                u0 u0Var4 = this.f11566b;
                                u0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = u0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.a2) view).c(z21, true);
                                u0Var4.f11649c.W2.N(true);
                                u0Var4.Y(true);
                                return;
                            case 3:
                                u0 u0Var5 = this.f11566b;
                                u0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = u0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.a2) view).c(z22, true);
                                u0Var5.f11649c.W2.N(true);
                                u0Var5.Y(true);
                                return;
                            case 4:
                                u0 u0Var6 = this.f11566b;
                                u0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = u0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.a2) view).c(z23, true);
                                u0Var6.f11649c.W2.N(true);
                                u0Var6.Y(true);
                                return;
                            default:
                                u0 u0Var7 = this.f11566b;
                                u0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = u0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.a2) view).c(z24, true);
                                u0Var7.f11649c.W2.N(true);
                                u0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f11646o0) {
                u0Var.X(i10, !u0Var.J.manage_stories, new m0(u0Var, 0));
            }
        }
    }

    public final void X(int i10, boolean z10, final Runnable runnable) {
        if (!this.K && i10 == f11640h0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
            a2Var.R = string;
            a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.z1(this) {
                public final u0 f11616b;

                {
                    this.f11616b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.a2 a2Var2, int i11) {
                    switch (r3) {
                        case 0:
                            this.f11616b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f11616b.L = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        } else if (!this.L && z10 && (i10 == f11643k0 || i10 == f11644l0 || i10 == m0 || i10 == f11645n0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
            a2Var2.R = string2;
            a2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.z1(this) {
                public final u0 f11616b;

                {
                    this.f11616b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.a2 a2Var22, int i11) {
                    switch (r3) {
                        case 0:
                            this.f11616b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f11616b.L = true;
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
        if (this.f11648b == null) {
            return;
        }
        boolean Z2 = Z();
        this.f11648b.setEnabled(Z2);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f11648b.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f11648b;
        if (Z2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f11648b;
        if (Z2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f11648b;
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
                    j10 = user.f19363id;
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
        if (this.f11647a.f24480c <= 0.0f) {
            if (!Z()) {
                finishFragment();
            } else if (this.v.k(this.f11649c)) {
                TLRPC.User user2 = this.M;
                if (user2 != null && ((tL_connectedBot = this.H) == null || tL_connectedBot.bot_id != user2.f19363id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.H;
                if (tL_connectedBot2 != null && ((user = this.M) == null || tL_connectedBot2.bot_id != user.f19363id)) {
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
                        tL_connectedBot3.bot_id = this.M.f19363id;
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

    public final void b0() {
        boolean z10;
        float f7;
        float f10;
        boolean z11 = this.f11654w;
        boolean e = this.d.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.N;
        if (!e && !this.f11655x && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.d.e() && !this.f11655x && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f11654w = z12;
            ViewPropertyAnimator animate = this.f11652r.animate();
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
            es esVar = es.h;
            duration.setInterpolator(esVar).start();
            ViewPropertyAnimator animate2 = this.f11653s.animate();
            if (!z12) {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (!z12) {
                f12 = AndroidUtilities.dp(8.0f);
            }
            alpha2.translationY(f12).setDuration(320L).setInterpolator(esVar).start();
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
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i12 = g6.f20235v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.x0(null, i12, false), PorterDuff.Mode.MULTIPLY));
        this.f11647a = new ds(mutate, new gq(g6.x0(null, i12, false)));
        this.f11648b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11647a);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.x0(null, g6.f19843a7, false));
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f11650f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        this.f11650f.setHintTextColor(g6.x0(null, g6.H6, false));
        EditTextBoldCursor editTextBoldCursor2 = this.f11650f;
        int i13 = g6.G6;
        editTextBoldCursor2.setTextColor(g6.x0(null, i13, false));
        this.f11650f.setBackgroundDrawable(null);
        this.f11650f.setMaxLines(1);
        this.f11650f.setLines(1);
        this.f11650f.setPadding(0, 0, 0, 0);
        this.f11650f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f11650f;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor3.setGravity(i10 | 48);
        this.f11650f.setInputType(180224);
        this.f11650f.setImeOptions(6);
        this.f11650f.setHint(LocaleController.getString(R.string.BusinessBotLink));
        this.f11650f.setCursorColor(g6.x0(null, i13, false));
        this.f11650f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f11650f.setCursorWidth(1.5f);
        this.f11650f.setOnEditorActionListener(new s0(this, 0));
        this.f11650f.addTextChangedListener(new h2(this, 2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f11650f, a6.a(-1.0f, 21.0f, 15.0f, 21.0f, 15.0f, -1, 48));
        FrameLayout frameLayout3 = this.e;
        int i14 = g6.f19901d6;
        frameLayout3.setBackgroundColor(getThemedColor(i14));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(g6.f19902d7));
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
        frameLayout4.addView(view2, a6.a(f7, f10, 0.0f, i15, 0.0f, -1, 87));
        i5 i5Var = new i5(context, 3);
        this.f11651n = i5Var;
        i5Var.setBackgroundColor(getThemedColor(i14));
        TextView textView = new TextView(context);
        this.f11652r = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.f11652r.setTextSize(1, 14.0f);
        TextView textView2 = this.f11652r;
        int i16 = g6.f20305z6;
        textView2.setTextColor(getThemedColor(i16));
        this.f11651n.addView(this.f11652r, a6.e(-2, -2, 17));
        this.f11653s = new ImageView(context);
        q8 q8Var = new q8(getThemedColor(i16));
        this.f11653s.setScaleType(ImageView.ScaleType.CENTER);
        this.f11653s.setImageDrawable(q8Var);
        this.f11651n.addView(this.f11653s, a6.e(-2, -2, 17));
        this.f11653s.setAlpha(0.0f);
        this.f11653s.setTranslationY(AndroidUtilities.dp(8.0f));
        hg.a2 a2Var = new hg.a2(true);
        this.d = a2Var;
        a2Var.f10484a = new a6.i(this, 26);
        a0 a0Var = new a0(this, new m0(this, 3));
        this.v = a0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.H;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        a0Var.i(tL_businessBotRecipients);
        h71 h71Var = new h71(this, new ci.u(this, 24), new p0(this, 3), null);
        this.f11649c = h71Var;
        h71Var.p1();
        h71 h71Var2 = this.f11649c;
        h71Var2.W2.f31780r = false;
        frameLayout.addView(h71Var2, a6.d(-1.0f, -1));
        this.actionBar.A(this.f11649c, true);
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
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.BusinessBotUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new p0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new p0(this, 1));
                showDialog(alertDialog$Builder.f19548a);
                return false;
            }
        } else if (this.M != null || Z() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.BusinessBotNoAddedTitle);
                alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.BusinessBotNoAddedText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.BusinessBotNoAddedButton), new p0(this, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder2.f19548a);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.S && !this.T) {
            this.S = true;
            f.a(this.currentAccount).c(new bi.o1(this, 24));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f11649c.setPadding(0, 0, 0, i13);
        this.f11649c.setClipToPadding(false);
    }
}
