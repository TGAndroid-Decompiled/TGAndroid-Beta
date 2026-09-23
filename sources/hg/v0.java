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
import ci.r8;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import w7.x5;
public final class v0 extends n2 {
    public static final int U = -1;
    public static final int V = -2;
    public static final int W = -3;
    public static final int X = -4;
    public static final int Y = -5;
    public static final int Z = -6;
    public static final int f10409a0 = -7;
    public static final int f10410b0 = -8;
    public static final int f10411c0 = -9;
    public static final int f10412d0 = -10;
    public static final int f10413e0 = -11;
    public static final int f10414f0 = -12;
    public static final int f10415g0 = -13;
    public static final int f10416h0 = -14;
    public static final int f10417i0 = -15;
    public static final int f10418j0 = -16;
    public static final int f10419k0 = -17;
    public static final int f10420l0 = -18;
    public static final int m0 = -19;
    public static final int f10421n0 = -20;
    public static final int f10422o0 = -21;
    public int E;
    public final o0 F;
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
    public qr f10423a;
    public org.telegram.ui.ActionBar.v0 f10424b;
    public d61 f10425c;
    public gg.c2 d;
    public FrameLayout e;
    public EditTextBoldCursor f10426f;
    public View h;
    public w5 f10427n;
    public TextView f10428r;
    public ImageView f10429s;
    public c0 v;
    public boolean f10430w;
    public boolean f10431x;
    public String f10432y;

    public v0() {
        super(null);
        this.E = 0;
        this.F = new o0(this, 4);
        this.J = TL_account.TL_businessBotRights.makeDefault();
        this.M = null;
        this.N = new LongSparseArray();
        this.O = -4;
        this.P = true;
        this.Q = false;
        this.R = false;
    }

    public static void U(v0 v0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        n2 U2;
        if (tL_error != null) {
            v0Var.f10423a.a(0.0f);
            xc.b0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            v0Var.f10423a.a(0.0f);
            org.telegram.messenger.z0.p(R.string.UnknownError, xc.a0(v0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.stageQueue.postRunnable(new gg.x1(4, v0Var, tLObject));
            }
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                g.a(v0Var.currentAccount).b();
                v0Var.getMessagesController().clearFullUsers();
                v0Var.finishFragment();
                if (z10 && user != null) {
                    n2 U3 = LaunchActivity.U();
                    if (U3 != null) {
                        c.s(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, xc.a0(U3), R.raw.contact_check, 36);
                    }
                } else if (user != null && (U2 = LaunchActivity.U()) != null) {
                    c.s(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, xc.a0(U2), R.raw.contact_check, 36);
                }
            }
        }
    }

    public static void W(v0 v0Var, h51 h51Var, final View view) {
        if (h51Var.f24503g && !v0Var.v.h(h51Var)) {
            int i10 = h51Var.d;
            if (i10 == U) {
                c0 c0Var = v0Var.v;
                v0Var.I = true;
                c0Var.h = true;
                v0Var.f10425c.Y2.N(true);
                v0Var.Y(true);
            } else if (i10 == V) {
                c0 c0Var2 = v0Var.v;
                v0Var.I = false;
                c0Var2.h = false;
                v0Var.f10425c.Y2.N(true);
                v0Var.Y(true);
            } else if (i10 == W) {
                v0Var.M = null;
                v0Var.f10425c.Y2.N(true);
                v0Var.Y(true);
            } else if (h51Var.f15508a == 13) {
                TLRPC.User user = (TLRPC.User) v0Var.N.get(h51Var.f24518x);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v0Var.getParentActivity(), 0, v0Var.resourceProvider);
                        alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                        alertDialog$Builder.f18409a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        v0Var.showDialog(alertDialog$Builder.f18409a);
                        return;
                    }
                    v0Var.M = user;
                    AndroidUtilities.hideKeyboard(v0Var.f10426f);
                    v0Var.f10425c.Y2.N(true);
                    v0Var.Y(true);
                }
            } else if (i10 == X) {
                boolean z10 = !v0Var.P;
                v0Var.P = z10;
                ((w8) view).setChecked(z10);
                v0Var.f10425c.Y2.N(true);
            } else if (i10 == Y) {
                int i11 = -v0Var.O;
                v0Var.O = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
            } else if (i10 == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights = v0Var.J;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                v0Var.f10425c.Y2.N(true);
                v0Var.Y(true);
            } else if (i10 == f10409a0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = v0Var.J;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((org.telegram.ui.Cells.z1) view).c(z12, true);
                v0Var.f10425c.Y2.N(true);
                v0Var.Y(true);
            } else if (i10 == f10410b0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = v0Var.J;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((org.telegram.ui.Cells.z1) view).c(z13, true);
                v0Var.f10425c.Y2.N(true);
                v0Var.Y(true);
            } else if (i10 == f10411c0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = v0Var.J;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((org.telegram.ui.Cells.z1) view).c(z14, true);
                v0Var.f10425c.Y2.N(true);
                v0Var.Y(true);
            } else if (i10 == f10412d0) {
                boolean z15 = !v0Var.Q;
                v0Var.Q = z15;
                ((w8) view).setChecked(z15);
                v0Var.f10425c.Y2.N(true);
            } else if (i10 == f10413e0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = v0Var.J;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((org.telegram.ui.Cells.z1) view).c(z16, true);
                v0Var.f10425c.Y2.N(true);
                v0Var.Y(true);
            } else if (i10 == f10414f0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = v0Var.J;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((org.telegram.ui.Cells.z1) view).c(z17, true);
                v0Var.f10425c.Y2.N(true);
                v0Var.Y(true);
            } else if (i10 == f10415g0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = v0Var.J;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((org.telegram.ui.Cells.z1) view).c(z18, true);
                v0Var.f10425c.Y2.N(true);
                v0Var.Y(true);
            } else if (i10 == f10416h0) {
                v0Var.X(i10, !v0Var.J.edit_username, new Runnable(v0Var) {
                    public final v0 f10353b;

                    {
                        this.f10353b = v0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v0 v0Var2 = this.f10353b;
                                v0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = v0Var2.J;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((org.telegram.ui.Cells.z1) view).c(z19, true);
                                v0Var2.f10425c.Y2.N(true);
                                v0Var2.Y(true);
                                return;
                            case 1:
                                v0 v0Var3 = this.f10353b;
                                v0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = v0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                v0Var3.f10425c.Y2.N(true);
                                v0Var3.Y(true);
                                return;
                            case 2:
                                v0 v0Var4 = this.f10353b;
                                v0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = v0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                v0Var4.f10425c.Y2.N(true);
                                v0Var4.Y(true);
                                return;
                            case 3:
                                v0 v0Var5 = this.f10353b;
                                v0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = v0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                v0Var5.f10425c.Y2.N(true);
                                v0Var5.Y(true);
                                return;
                            case 4:
                                v0 v0Var6 = this.f10353b;
                                v0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = v0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                v0Var6.f10425c.Y2.N(true);
                                v0Var6.Y(true);
                                return;
                            default:
                                v0 v0Var7 = this.f10353b;
                                v0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = v0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                v0Var7.f10425c.Y2.N(true);
                                v0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f10417i0) {
                boolean z19 = !v0Var.R;
                v0Var.R = z19;
                ((w8) view).setChecked(z19);
                v0Var.f10425c.Y2.N(true);
            } else if (i10 == f10418j0) {
                v0Var.X(i10, !v0Var.J.view_gifts, new Runnable(v0Var) {
                    public final v0 f10353b;

                    {
                        this.f10353b = v0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v0 v0Var2 = this.f10353b;
                                v0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = v0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.z1) view).c(z192, true);
                                v0Var2.f10425c.Y2.N(true);
                                v0Var2.Y(true);
                                return;
                            case 1:
                                v0 v0Var3 = this.f10353b;
                                v0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = v0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                v0Var3.f10425c.Y2.N(true);
                                v0Var3.Y(true);
                                return;
                            case 2:
                                v0 v0Var4 = this.f10353b;
                                v0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = v0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                v0Var4.f10425c.Y2.N(true);
                                v0Var4.Y(true);
                                return;
                            case 3:
                                v0 v0Var5 = this.f10353b;
                                v0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = v0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                v0Var5.f10425c.Y2.N(true);
                                v0Var5.Y(true);
                                return;
                            case 4:
                                v0 v0Var6 = this.f10353b;
                                v0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = v0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                v0Var6.f10425c.Y2.N(true);
                                v0Var6.Y(true);
                                return;
                            default:
                                v0 v0Var7 = this.f10353b;
                                v0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = v0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                v0Var7.f10425c.Y2.N(true);
                                v0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f10419k0) {
                v0Var.X(i10, !v0Var.J.sell_gifts, new Runnable(v0Var) {
                    public final v0 f10353b;

                    {
                        this.f10353b = v0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v0 v0Var2 = this.f10353b;
                                v0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = v0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.z1) view).c(z192, true);
                                v0Var2.f10425c.Y2.N(true);
                                v0Var2.Y(true);
                                return;
                            case 1:
                                v0 v0Var3 = this.f10353b;
                                v0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = v0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                v0Var3.f10425c.Y2.N(true);
                                v0Var3.Y(true);
                                return;
                            case 2:
                                v0 v0Var4 = this.f10353b;
                                v0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = v0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                v0Var4.f10425c.Y2.N(true);
                                v0Var4.Y(true);
                                return;
                            case 3:
                                v0 v0Var5 = this.f10353b;
                                v0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = v0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                v0Var5.f10425c.Y2.N(true);
                                v0Var5.Y(true);
                                return;
                            case 4:
                                v0 v0Var6 = this.f10353b;
                                v0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = v0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                v0Var6.f10425c.Y2.N(true);
                                v0Var6.Y(true);
                                return;
                            default:
                                v0 v0Var7 = this.f10353b;
                                v0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = v0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                v0Var7.f10425c.Y2.N(true);
                                v0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f10420l0) {
                v0Var.X(i10, !v0Var.J.change_gift_settings, new Runnable(v0Var) {
                    public final v0 f10353b;

                    {
                        this.f10353b = v0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v0 v0Var2 = this.f10353b;
                                v0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = v0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.z1) view).c(z192, true);
                                v0Var2.f10425c.Y2.N(true);
                                v0Var2.Y(true);
                                return;
                            case 1:
                                v0 v0Var3 = this.f10353b;
                                v0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = v0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                v0Var3.f10425c.Y2.N(true);
                                v0Var3.Y(true);
                                return;
                            case 2:
                                v0 v0Var4 = this.f10353b;
                                v0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = v0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                v0Var4.f10425c.Y2.N(true);
                                v0Var4.Y(true);
                                return;
                            case 3:
                                v0 v0Var5 = this.f10353b;
                                v0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = v0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                v0Var5.f10425c.Y2.N(true);
                                v0Var5.Y(true);
                                return;
                            case 4:
                                v0 v0Var6 = this.f10353b;
                                v0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = v0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                v0Var6.f10425c.Y2.N(true);
                                v0Var6.Y(true);
                                return;
                            default:
                                v0 v0Var7 = this.f10353b;
                                v0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = v0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                v0Var7.f10425c.Y2.N(true);
                                v0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == m0) {
                v0Var.X(i10, !v0Var.J.transfer_and_upgrade_gifts, new Runnable(v0Var) {
                    public final v0 f10353b;

                    {
                        this.f10353b = v0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v0 v0Var2 = this.f10353b;
                                v0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = v0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.z1) view).c(z192, true);
                                v0Var2.f10425c.Y2.N(true);
                                v0Var2.Y(true);
                                return;
                            case 1:
                                v0 v0Var3 = this.f10353b;
                                v0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = v0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                v0Var3.f10425c.Y2.N(true);
                                v0Var3.Y(true);
                                return;
                            case 2:
                                v0 v0Var4 = this.f10353b;
                                v0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = v0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                v0Var4.f10425c.Y2.N(true);
                                v0Var4.Y(true);
                                return;
                            case 3:
                                v0 v0Var5 = this.f10353b;
                                v0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = v0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                v0Var5.f10425c.Y2.N(true);
                                v0Var5.Y(true);
                                return;
                            case 4:
                                v0 v0Var6 = this.f10353b;
                                v0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = v0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                v0Var6.f10425c.Y2.N(true);
                                v0Var6.Y(true);
                                return;
                            default:
                                v0 v0Var7 = this.f10353b;
                                v0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = v0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                v0Var7.f10425c.Y2.N(true);
                                v0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f10421n0) {
                v0Var.X(i10, !v0Var.J.transfer_stars, new Runnable(v0Var) {
                    public final v0 f10353b;

                    {
                        this.f10353b = v0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                v0 v0Var2 = this.f10353b;
                                v0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = v0Var2.J;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.z1) view).c(z192, true);
                                v0Var2.f10425c.Y2.N(true);
                                v0Var2.Y(true);
                                return;
                            case 1:
                                v0 v0Var3 = this.f10353b;
                                v0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = v0Var3.J;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                v0Var3.f10425c.Y2.N(true);
                                v0Var3.Y(true);
                                return;
                            case 2:
                                v0 v0Var4 = this.f10353b;
                                v0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = v0Var4.J;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                v0Var4.f10425c.Y2.N(true);
                                v0Var4.Y(true);
                                return;
                            case 3:
                                v0 v0Var5 = this.f10353b;
                                v0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = v0Var5.J;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                v0Var5.f10425c.Y2.N(true);
                                v0Var5.Y(true);
                                return;
                            case 4:
                                v0 v0Var6 = this.f10353b;
                                v0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = v0Var6.J;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                v0Var6.f10425c.Y2.N(true);
                                v0Var6.Y(true);
                                return;
                            default:
                                v0 v0Var7 = this.f10353b;
                                v0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = v0Var7.J;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                v0Var7.f10425c.Y2.N(true);
                                v0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f10422o0) {
                v0Var.X(i10, !v0Var.J.manage_stories, new o0(v0Var, 0));
            }
        }
    }

    public final void X(int i10, boolean z10, final Runnable runnable) {
        if (!this.K && i10 == f10416h0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.a2(this) {
                public final v0 f10397b;

                {
                    this.f10397b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                    switch (r3) {
                        case 0:
                            this.f10397b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f10397b.L = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.o();
        } else if (!this.L && z10 && (i10 == f10419k0 || i10 == f10420l0 || i10 == m0 || i10 == f10421n0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f18409a;
            b2Var2.R = string2;
            b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.M)));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.a2(this) {
                public final v0 f10397b;

                {
                    this.f10397b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var22, int i11) {
                    switch (r3) {
                        case 0:
                            this.f10397b.K = true;
                            runnable.run();
                            return;
                        default:
                            this.f10397b.L = true;
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
        if (this.f10424b == null) {
            return;
        }
        boolean Z2 = Z();
        this.f10424b.setEnabled(Z2);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f10424b.animate();
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
        org.telegram.ui.ActionBar.v0 v0Var = this.f10424b;
        if (Z2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f10424b;
        if (Z2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f10424b;
        if (Z2) {
            f13 = 1.0f;
        }
        v0Var3.setScaleY(f13);
    }

    public final boolean Z() {
        boolean z10;
        boolean z11;
        long j3;
        c0 c0Var;
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
                    j3 = user.f18230id;
                }
                if (tL_connectedBot != null) {
                    j10 = tL_connectedBot.bot_id;
                }
                if (j3 == j10 && (user == null || (this.J.equals(tL_connectedBot.rights) && ((c0Var = this.v) == null || !c0Var.g())))) {
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
        if (this.f10423a.f27437c <= 0.0f) {
            if (!Z()) {
                finishFragment();
            } else if (this.v.k(this.f10425c)) {
                TLRPC.User user2 = this.M;
                if (user2 != null && ((tL_connectedBot = this.H) == null || tL_connectedBot.bot_id != user2.f18230id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.H;
                if (tL_connectedBot2 != null && ((user = this.M) == null || tL_connectedBot2.bot_id != user.f18230id)) {
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
                        tL_connectedBot3.bot_id = this.M.f18230id;
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
                    getConnectionsManager().sendRequest((TLObject) arrayList.get(i10), new p0(this, iArr, arrayList, z10, user2));
                }
            }
        }
    }

    public final void b0() {
        boolean z10;
        float f7;
        float f10;
        boolean z11 = this.f10430w;
        boolean e = this.d.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.N;
        if (!e && !this.f10431x && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.d.e() && !this.f10431x && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f10430w = z12;
            ViewPropertyAnimator animate = this.f10428r.animate();
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
            rr rrVar = rr.h;
            duration.setInterpolator(rrVar).start();
            ViewPropertyAnimator animate2 = this.f10429s.animate();
            if (!z12) {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (!z12) {
                f12 = AndroidUtilities.dp(8.0f);
            }
            alpha2.translationY(f12).setDuration(320L).setInterpolator(rrVar).start();
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
        int i12 = h6.f19120v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(null, i12, false), PorterDuff.Mode.MULTIPLY));
        this.f10423a = new qr(mutate, new up(h6.w0(null, i12, false)));
        this.f10424b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f10423a);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.w0(null, h6.f18733a7, false));
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f10426f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        this.f10426f.setHintTextColor(h6.w0(null, h6.H6, false));
        EditTextBoldCursor editTextBoldCursor2 = this.f10426f;
        int i13 = h6.G6;
        editTextBoldCursor2.setTextColor(h6.w0(null, i13, false));
        this.f10426f.setBackgroundDrawable(null);
        this.f10426f.setMaxLines(1);
        this.f10426f.setLines(1);
        this.f10426f.setPadding(0, 0, 0, 0);
        this.f10426f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f10426f;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor3.setGravity(i10 | 48);
        this.f10426f.setInputType(180224);
        this.f10426f.setImeOptions(6);
        this.f10426f.setHint(LocaleController.getString(R.string.BusinessBotLink));
        this.f10426f.setCursorColor(h6.w0(null, i13, false));
        this.f10426f.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f10426f.setCursorWidth(1.5f);
        this.f10426f.setOnEditorActionListener(new u0(this, 0));
        this.f10426f.addTextChangedListener(new i2(this, 2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f10426f, x5.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i14 = h6.f18789d6;
        frameLayout3.setBackgroundColor(getThemedColor(i14));
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(getThemedColor(h6.f18790d7));
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
        frameLayout4.addView(view2, x5.d(-1, f7, 87, f10, 0.0f, i15, 0.0f));
        w5 w5Var = new w5(context, 3);
        this.f10427n = w5Var;
        w5Var.setBackgroundColor(getThemedColor(i14));
        TextView textView = new TextView(context);
        this.f10428r = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.f10428r.setTextSize(1, 14.0f);
        TextView textView2 = this.f10428r;
        int i16 = h6.f19189z6;
        textView2.setTextColor(getThemedColor(i16));
        this.f10427n.addView(this.f10428r, x5.e(-2, -2, 17));
        this.f10429s = new ImageView(context);
        r8 r8Var = new r8(getThemedColor(i16));
        this.f10429s.setScaleType(ImageView.ScaleType.CENTER);
        this.f10429s.setImageDrawable(r8Var);
        this.f10427n.addView(this.f10429s, x5.e(-2, -2, 17));
        this.f10429s.setAlpha(0.0f);
        this.f10429s.setTranslationY(AndroidUtilities.dp(8.0f));
        gg.c2 c2Var = new gg.c2(true);
        this.d = c2Var;
        c2Var.f9672a = new a6.m(this, 24);
        c0 c0Var = new c0(this, new o0(this, 3));
        this.v = c0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.H;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        c0Var.i(tL_businessBotRecipients);
        d61 d61Var = new d61(this, new bi.v(this, 24), new r0(this, 3), null);
        this.f10425c = d61Var;
        d61Var.p1();
        d61 d61Var2 = this.f10425c;
        d61Var2.Y2.f28662r = false;
        frameLayout.addView(d61Var2, x5.c(-1.0f, -1));
        this.actionBar.z(this.f10425c, true);
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
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.BusinessBotUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new r0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new r0(this, 1));
                showDialog(alertDialog$Builder.f18409a);
                return false;
            }
        } else if (this.M != null || Z() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.f18409a.R = LocaleController.getString(R.string.BusinessBotNoAddedTitle);
                alertDialog$Builder2.f18409a.T = LocaleController.getString(R.string.BusinessBotNoAddedText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.BusinessBotNoAddedButton), new r0(this, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder2.f18409a);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.S && !this.T) {
            this.S = true;
            g.a(this.currentAccount).c(new ai.y1(this, 24));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f10425c.setPadding(0, 0, 0, i13);
        this.f10425c.setClipToPadding(false);
    }
}
