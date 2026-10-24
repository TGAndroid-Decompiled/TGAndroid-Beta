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
import ci.h4;
import ei.g8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.yr;
import org.telegram.ui.Components.zr;
import org.telegram.ui.LaunchActivity;
import w7.z5;
public final class s0 extends o2 {
    public static final int W = -1;
    public static final int X = -2;
    public static final int Y = -3;
    public static final int Z = -4;
    public static final int f13040a0 = -5;
    public static final int f13041b0 = -6;
    public static final int f13042c0 = -7;
    public static final int f13043d0 = -8;
    public static final int f13044e0 = -9;
    public static final int f13045f0 = -10;
    public static final int f13046g0 = -11;
    public static final int f13047h0 = -12;
    public static final int f13048i0 = -13;
    public static final int f13049j0 = -14;
    public static final int f13050k0 = -15;
    public static final int f13051l0 = -16;
    public static final int m0 = -17;
    public static final int f13052n0 = -18;
    public static final int f13053o0 = -19;
    public static final int f13054p0 = -20;
    public static final int f13055q0 = -21;
    public boolean E;
    public String F;
    public int G;
    public final m0 H;
    public TL_account.connectedBots I;
    public TL_account.TL_connectedBot J;
    public boolean K;
    public TL_account.TL_businessBotRights L;
    public boolean M;
    public boolean N;
    public TLRPC.User O;
    public final LongSparseArray P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public yr f13056a;
    public cq f13057b;
    public g8 f13058c;
    public org.telegram.ui.ActionBar.u0 d;
    public i71 e;
    public hg.a2 f13059f;
    public FrameLayout h;
    public EditTextBoldCursor f13060n;
    public View f13061r;
    public h4 f13062s;
    public TextView v;
    public ImageView f13063w;
    public a0 f13064x;
    public boolean f13065y;

    public s0() {
        super(null);
        this.G = 0;
        this.H = new m0(this, 4);
        this.L = TL_account.TL_businessBotRights.makeDefault();
        this.O = null;
        this.P = new LongSparseArray();
        this.Q = -4;
        this.R = true;
        this.S = false;
        this.T = false;
    }

    public static void U(s0 s0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        o2 U;
        if (tL_error != null) {
            s0Var.f13056a.a(0.0f);
            vc.d0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            s0Var.f13056a.a(0.0f);
            tl.q(R.string.UnknownError, vc.a0(s0Var), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.stageQueue.postRunnable(new hi.t(5, s0Var, tLObject));
            }
            int i10 = iArr[0] + 1;
            iArr[0] = i10;
            if (i10 == arrayList.size()) {
                f.a(s0Var.currentAccount).b();
                s0Var.getMessagesController().clearFullUsers();
                s0Var.finishFragment();
                if (z10 && user != null) {
                    o2 U2 = LaunchActivity.U();
                    if (U2 != null) {
                        i2.o1.t(R.string.BusinessBotDone, new Object[]{UserObject.getUserName(user)}, vc.a0(U2), R.raw.contact_check, 36);
                    }
                } else if (user != null && (U = LaunchActivity.U()) != null) {
                    i2.o1.t(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(user)}, vc.a0(U), R.raw.contact_check, 36);
                }
            }
        }
    }

    public static void W(s0 s0Var, l61 l61Var, final View view) {
        if (l61Var.f28223g && !s0Var.f13064x.h(l61Var)) {
            int i10 = l61Var.d;
            if (i10 == W) {
                a0 a0Var = s0Var.f13064x;
                s0Var.K = true;
                a0Var.h = true;
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
            } else if (i10 == X) {
                a0 a0Var2 = s0Var.f13064x;
                s0Var.K = false;
                a0Var2.h = false;
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
            } else if (i10 == Y) {
                s0Var.O = null;
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
            } else if (l61Var.f44712a == 13) {
                TLRPC.User user = (TLRPC.User) s0Var.P.get(l61Var.f28238x);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s0Var.getParentActivity(), 0, s0Var.resourceProvider);
                        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.BusinessBotNotSupportedTitle);
                        alertDialog$Builder.f20679a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessBotNotSupportedMessage));
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        s0Var.showDialog(alertDialog$Builder.f20679a);
                        return;
                    }
                    s0Var.O = user;
                    AndroidUtilities.hideKeyboard(s0Var.f13060n);
                    s0Var.e.Z2.N(true);
                    s0Var.Y(true);
                }
            } else if (i10 == Z) {
                boolean z10 = !s0Var.R;
                s0Var.R = z10;
                ((v8) view).setChecked(z10);
                s0Var.e.Z2.N(true);
            } else if (i10 == f13040a0) {
                int i11 = -s0Var.Q;
                s0Var.Q = i11;
                AndroidUtilities.shakeViewSpring(view, i11);
            } else if (i10 == f13041b0) {
                TL_account.TL_businessBotRights tL_businessBotRights = s0Var.L;
                boolean z11 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
            } else if (i10 == f13042c0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = s0Var.L;
                boolean z12 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z12;
                ((org.telegram.ui.Cells.z1) view).c(z12, true);
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
            } else if (i10 == f13043d0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = s0Var.L;
                boolean z13 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z13;
                ((org.telegram.ui.Cells.z1) view).c(z13, true);
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
            } else if (i10 == f13044e0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = s0Var.L;
                boolean z14 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z14;
                ((org.telegram.ui.Cells.z1) view).c(z14, true);
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
            } else if (i10 == f13045f0) {
                boolean z15 = !s0Var.S;
                s0Var.S = z15;
                ((v8) view).setChecked(z15);
                s0Var.e.Z2.N(true);
            } else if (i10 == f13046g0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = s0Var.L;
                boolean z16 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z16;
                ((org.telegram.ui.Cells.z1) view).c(z16, true);
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
            } else if (i10 == f13047h0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = s0Var.L;
                boolean z17 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z17;
                ((org.telegram.ui.Cells.z1) view).c(z17, true);
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
            } else if (i10 == f13048i0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = s0Var.L;
                boolean z18 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z18;
                ((org.telegram.ui.Cells.z1) view).c(z18, true);
                s0Var.e.Z2.N(true);
                s0Var.Y(true);
            } else if (i10 == f13049j0) {
                s0Var.X(i10, !s0Var.L.edit_username, new Runnable(s0Var) {
                    public final s0 f12985b;

                    {
                        this.f12985b = s0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = this.f12985b;
                                s0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.L;
                                boolean z19 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z19;
                                ((org.telegram.ui.Cells.z1) view).c(z19, true);
                                s0Var2.e.Z2.N(true);
                                s0Var2.Y(true);
                                return;
                            case 1:
                                s0 s0Var3 = this.f12985b;
                                s0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.L;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                s0Var3.e.Z2.N(true);
                                s0Var3.Y(true);
                                return;
                            case 2:
                                s0 s0Var4 = this.f12985b;
                                s0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.L;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                s0Var4.e.Z2.N(true);
                                s0Var4.Y(true);
                                return;
                            case 3:
                                s0 s0Var5 = this.f12985b;
                                s0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.L;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                s0Var5.e.Z2.N(true);
                                s0Var5.Y(true);
                                return;
                            case 4:
                                s0 s0Var6 = this.f12985b;
                                s0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.L;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                s0Var6.e.Z2.N(true);
                                s0Var6.Y(true);
                                return;
                            default:
                                s0 s0Var7 = this.f12985b;
                                s0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.L;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                s0Var7.e.Z2.N(true);
                                s0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f13050k0) {
                boolean z19 = !s0Var.T;
                s0Var.T = z19;
                ((v8) view).setChecked(z19);
                s0Var.e.Z2.N(true);
            } else if (i10 == f13051l0) {
                s0Var.X(i10, !s0Var.L.view_gifts, new Runnable(s0Var) {
                    public final s0 f12985b;

                    {
                        this.f12985b = s0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = this.f12985b;
                                s0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.L;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.z1) view).c(z192, true);
                                s0Var2.e.Z2.N(true);
                                s0Var2.Y(true);
                                return;
                            case 1:
                                s0 s0Var3 = this.f12985b;
                                s0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.L;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                s0Var3.e.Z2.N(true);
                                s0Var3.Y(true);
                                return;
                            case 2:
                                s0 s0Var4 = this.f12985b;
                                s0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.L;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                s0Var4.e.Z2.N(true);
                                s0Var4.Y(true);
                                return;
                            case 3:
                                s0 s0Var5 = this.f12985b;
                                s0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.L;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                s0Var5.e.Z2.N(true);
                                s0Var5.Y(true);
                                return;
                            case 4:
                                s0 s0Var6 = this.f12985b;
                                s0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.L;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                s0Var6.e.Z2.N(true);
                                s0Var6.Y(true);
                                return;
                            default:
                                s0 s0Var7 = this.f12985b;
                                s0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.L;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                s0Var7.e.Z2.N(true);
                                s0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == m0) {
                s0Var.X(i10, !s0Var.L.sell_gifts, new Runnable(s0Var) {
                    public final s0 f12985b;

                    {
                        this.f12985b = s0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = this.f12985b;
                                s0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.L;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.z1) view).c(z192, true);
                                s0Var2.e.Z2.N(true);
                                s0Var2.Y(true);
                                return;
                            case 1:
                                s0 s0Var3 = this.f12985b;
                                s0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.L;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                s0Var3.e.Z2.N(true);
                                s0Var3.Y(true);
                                return;
                            case 2:
                                s0 s0Var4 = this.f12985b;
                                s0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.L;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                s0Var4.e.Z2.N(true);
                                s0Var4.Y(true);
                                return;
                            case 3:
                                s0 s0Var5 = this.f12985b;
                                s0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.L;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                s0Var5.e.Z2.N(true);
                                s0Var5.Y(true);
                                return;
                            case 4:
                                s0 s0Var6 = this.f12985b;
                                s0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.L;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                s0Var6.e.Z2.N(true);
                                s0Var6.Y(true);
                                return;
                            default:
                                s0 s0Var7 = this.f12985b;
                                s0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.L;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                s0Var7.e.Z2.N(true);
                                s0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f13052n0) {
                s0Var.X(i10, !s0Var.L.change_gift_settings, new Runnable(s0Var) {
                    public final s0 f12985b;

                    {
                        this.f12985b = s0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = this.f12985b;
                                s0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.L;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.z1) view).c(z192, true);
                                s0Var2.e.Z2.N(true);
                                s0Var2.Y(true);
                                return;
                            case 1:
                                s0 s0Var3 = this.f12985b;
                                s0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.L;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                s0Var3.e.Z2.N(true);
                                s0Var3.Y(true);
                                return;
                            case 2:
                                s0 s0Var4 = this.f12985b;
                                s0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.L;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                s0Var4.e.Z2.N(true);
                                s0Var4.Y(true);
                                return;
                            case 3:
                                s0 s0Var5 = this.f12985b;
                                s0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.L;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                s0Var5.e.Z2.N(true);
                                s0Var5.Y(true);
                                return;
                            case 4:
                                s0 s0Var6 = this.f12985b;
                                s0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.L;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                s0Var6.e.Z2.N(true);
                                s0Var6.Y(true);
                                return;
                            default:
                                s0 s0Var7 = this.f12985b;
                                s0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.L;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                s0Var7.e.Z2.N(true);
                                s0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f13053o0) {
                s0Var.X(i10, !s0Var.L.transfer_and_upgrade_gifts, new Runnable(s0Var) {
                    public final s0 f12985b;

                    {
                        this.f12985b = s0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = this.f12985b;
                                s0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.L;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.z1) view).c(z192, true);
                                s0Var2.e.Z2.N(true);
                                s0Var2.Y(true);
                                return;
                            case 1:
                                s0 s0Var3 = this.f12985b;
                                s0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.L;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                s0Var3.e.Z2.N(true);
                                s0Var3.Y(true);
                                return;
                            case 2:
                                s0 s0Var4 = this.f12985b;
                                s0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.L;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                s0Var4.e.Z2.N(true);
                                s0Var4.Y(true);
                                return;
                            case 3:
                                s0 s0Var5 = this.f12985b;
                                s0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.L;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                s0Var5.e.Z2.N(true);
                                s0Var5.Y(true);
                                return;
                            case 4:
                                s0 s0Var6 = this.f12985b;
                                s0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.L;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                s0Var6.e.Z2.N(true);
                                s0Var6.Y(true);
                                return;
                            default:
                                s0 s0Var7 = this.f12985b;
                                s0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.L;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                s0Var7.e.Z2.N(true);
                                s0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f13054p0) {
                s0Var.X(i10, !s0Var.L.transfer_stars, new Runnable(s0Var) {
                    public final s0 f12985b;

                    {
                        this.f12985b = s0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                s0 s0Var2 = this.f12985b;
                                s0Var2.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights8 = s0Var2.L;
                                boolean z192 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z192;
                                ((org.telegram.ui.Cells.z1) view).c(z192, true);
                                s0Var2.e.Z2.N(true);
                                s0Var2.Y(true);
                                return;
                            case 1:
                                s0 s0Var3 = this.f12985b;
                                s0Var3.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights9 = s0Var3.L;
                                boolean z20 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z20;
                                ((org.telegram.ui.Cells.z1) view).c(z20, true);
                                s0Var3.e.Z2.N(true);
                                s0Var3.Y(true);
                                return;
                            case 2:
                                s0 s0Var4 = this.f12985b;
                                s0Var4.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights10 = s0Var4.L;
                                boolean z21 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z21;
                                ((org.telegram.ui.Cells.z1) view).c(z21, true);
                                s0Var4.e.Z2.N(true);
                                s0Var4.Y(true);
                                return;
                            case 3:
                                s0 s0Var5 = this.f12985b;
                                s0Var5.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights11 = s0Var5.L;
                                boolean z22 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z22;
                                ((org.telegram.ui.Cells.z1) view).c(z22, true);
                                s0Var5.e.Z2.N(true);
                                s0Var5.Y(true);
                                return;
                            case 4:
                                s0 s0Var6 = this.f12985b;
                                s0Var6.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights12 = s0Var6.L;
                                boolean z23 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z23;
                                ((org.telegram.ui.Cells.z1) view).c(z23, true);
                                s0Var6.e.Z2.N(true);
                                s0Var6.Y(true);
                                return;
                            default:
                                s0 s0Var7 = this.f12985b;
                                s0Var7.getClass();
                                TL_account.TL_businessBotRights tL_businessBotRights13 = s0Var7.L;
                                boolean z24 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z24;
                                ((org.telegram.ui.Cells.z1) view).c(z24, true);
                                s0Var7.e.Z2.N(true);
                                s0Var7.Y(true);
                                return;
                        }
                    }
                });
            } else if (i10 == f13055q0) {
                s0Var.X(i10, !s0Var.L.manage_stories, new m0(s0Var, 0));
            }
        }
    }

    public final void X(int i10, boolean z10, final Runnable runnable) {
        if (!this.M && i10 == f13049j0 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.R = string;
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsUsernamesWarningText, UserObject.getPublicUsername(this.O)));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.z1(this) {
                public final s0 f13034b;

                {
                    this.f13034b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i11) {
                    switch (r3) {
                        case 0:
                            this.f13034b.M = true;
                            runnable.run();
                            return;
                        default:
                            this.f13034b.N = true;
                            runnable.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.d(-1);
            alertDialog$Builder.p();
        } else if (!this.N && z10 && (i10 == m0 || i10 == f13052n0 || i10 == f13053o0 || i10 == f13054p0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            String string2 = LocaleController.getString(R.string.BusinessBotPermissionsWarning);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
            c2Var2.R = string2;
            c2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessBotPermissionsGiftsWarningText, UserObject.getPublicUsername(this.O)));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Allow), new org.telegram.ui.ActionBar.z1(this) {
                public final s0 f13034b;

                {
                    this.f13034b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var22, int i11) {
                    switch (r3) {
                        case 0:
                            this.f13034b.M = true;
                            runnable.run();
                            return;
                        default:
                            this.f13034b.N = true;
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

    public final void Y(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.d == null) {
            return;
        }
        boolean Z2 = Z();
        this.d.setEnabled(Z2);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.d.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.d;
        if (Z2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.d;
        if (Z2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.d;
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
        if (this.V) {
            TLRPC.User user = this.O;
            if (user != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            TL_account.TL_connectedBot tL_connectedBot = this.J;
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
                    j10 = user.f20491id;
                }
                if (tL_connectedBot != null) {
                    j11 = tL_connectedBot.bot_id;
                }
                if (j10 == j11 && (user == null || (this.L.equals(tL_connectedBot.rights) && ((a0Var = this.f13064x) == null || !a0Var.g())))) {
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
        if (this.f13056a.f33027c <= 0.0f) {
            if (!Z()) {
                finishFragment();
            } else if (this.f13064x.k(this.e)) {
                TLRPC.User user2 = this.O;
                if (user2 != null && ((tL_connectedBot = this.J) == null || tL_connectedBot.bot_id != user2.f20491id)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.J;
                if (tL_connectedBot2 != null && ((user = this.O) == null || tL_connectedBot2.bot_id != user.f20491id)) {
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = getMessagesController().getInputUser(this.J.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    arrayList.add(updateconnectedbot);
                }
                if (this.O != null) {
                    TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                    updateconnectedbot2.deleted = false;
                    updateconnectedbot2.rights = this.L;
                    updateconnectedbot2.bot = getMessagesController().getInputUser(this.O);
                    updateconnectedbot2.recipients = this.f13064x.b();
                    arrayList.add(updateconnectedbot2);
                    TL_account.TL_connectedBot tL_connectedBot3 = this.J;
                    if (tL_connectedBot3 != null) {
                        tL_connectedBot3.bot_id = this.O.f20491id;
                        tL_connectedBot3.recipients = this.f13064x.c();
                        this.J.rights = this.L;
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
        boolean z11 = this.f13065y;
        boolean e = this.f13059f.e();
        boolean z12 = true;
        LongSparseArray longSparseArray = this.P;
        if (!e && !this.E && longSparseArray.size() <= 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z11 != z10) {
            if (!this.f13059f.e() && !this.E && longSparseArray.size() <= 0) {
                z12 = false;
            }
            this.f13065y = z12;
            ViewPropertyAnimator animate = this.v.animate();
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
            zr zrVar = zr.h;
            duration.setInterpolator(zrVar).start();
            ViewPropertyAnimator animate2 = this.f13063w.animate();
            if (!z12) {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f11);
            if (!z12) {
                f12 = AndroidUtilities.dp(8.0f);
            }
            alpha2.translationY(f12).setDuration(320L).setInterpolator(zrVar).start();
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
        int i12 = k6.f21519v8;
        int x02 = k6.x0(null, i12, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
        cq cqVar = new cq(k6.x0(null, i12, false));
        this.f13057b = cqVar;
        this.f13056a = new yr(mutate, cqVar);
        org.telegram.ui.ActionBar.u0 i13 = this.actionBar.m().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f13056a);
        this.d = i13;
        r6.z(i13, mutate, i12, null, mode);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.f21126a7, frameLayout, null);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f13060n = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        r6.F(this.f13060n, k6.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f13060n;
        int i14 = k6.G6;
        r6.W(editTextBoldCursor2, i14, null);
        this.f13060n.setBackgroundDrawable(null);
        this.f13060n.setMaxLines(1);
        this.f13060n.setLines(1);
        this.f13060n.setPadding(0, 0, 0, 0);
        this.f13060n.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f13060n;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor3.setGravity(i10 | 48);
        this.f13060n.setInputType(180224);
        this.f13060n.setImeOptions(6);
        this.f13060n.setHint(LocaleController.getString(R.string.BusinessBotLink));
        r6.x(this.f13060n, i14, null);
        this.f13060n.setCursorSize(AndroidUtilities.dp(19.0f));
        this.f13060n.setCursorWidth(1.5f);
        this.f13060n.setOnEditorActionListener(new ai.n(this, 1));
        this.f13060n.addTextChangedListener(new ai.u(this, 3));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        frameLayout2.addView(this.f13060n, z5.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.h;
        int i15 = k6.f21184d6;
        r6.i(i15, frameLayout3, getResourceProvider());
        View view = new View(context);
        this.f13061r = view;
        r6.i(k6.f21185d7, view, getResourceProvider());
        FrameLayout frameLayout4 = this.h;
        View view2 = this.f13061r;
        float f7 = 1.0f / AndroidUtilities.density;
        boolean z10 = LocaleController.isRTL;
        int i16 = 21;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 21;
        }
        float f10 = i11;
        if (!z10) {
            i16 = 0;
        }
        frameLayout4.addView(view2, z5.d(-1, f7, 87, f10, 0.0f, i16, 0.0f));
        h4 h4Var = new h4(context, 3);
        this.f13062s = h4Var;
        r6.i(i15, h4Var, getResourceProvider());
        TextView textView = new TextView(context);
        this.v = textView;
        textView.setText(LocaleController.getString(R.string.BusinessBotNotFound));
        this.v.setTextSize(1, 14.0f);
        TextView textView2 = this.v;
        int i17 = k6.f21589z6;
        r6.W(textView2, i17, getResourceProvider());
        this.f13062s.addView(this.v, z5.e(-2, -2, 17));
        this.f13063w = new ImageView(context);
        g8 g8Var = new g8(getThemedColor(i17));
        this.f13063w.setScaleType(ImageView.ScaleType.CENTER);
        this.f13063w.setImageDrawable(g8Var);
        this.f13058c = g8Var;
        this.f13062s.addView(this.f13063w, z5.e(-2, -2, 17));
        this.f13063w.setAlpha(0.0f);
        this.f13063w.setTranslationY(AndroidUtilities.dp(8.0f));
        hg.a2 a2Var = new hg.a2(true);
        this.f13059f = a2Var;
        a2Var.f11819a = new a6.i(this, 26);
        a0 a0Var = new a0(this, new m0(this, 3));
        this.f13064x = a0Var;
        TL_account.TL_connectedBot tL_connectedBot = this.J;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        a0Var.i(tL_businessBotRecipients);
        i71 i71Var = new i71(this, new hg.o(this, 5), new p0(this, 3), null);
        this.e = i71Var;
        i71Var.t1();
        i71 i71Var2 = this.e;
        i71Var2.Z2.f24646r = false;
        frameLayout.addView(i71Var2, z5.c(-1.0f, -1));
        this.actionBar.z(this.e, true);
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
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.BusinessBotUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new p0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new p0(this, 1));
                showDialog(alertDialog$Builder.f20679a);
                return false;
            }
        } else if (this.O != null || Z() || (this.f13059f.d.isEmpty() && this.f13059f.e.isEmpty())) {
            return super.onBackPressed(z10);
        } else {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.f20679a.R = LocaleController.getString(R.string.BusinessBotNoAddedTitle);
                alertDialog$Builder2.f20679a.T = LocaleController.getString(R.string.BusinessBotNoAddedText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.BusinessBotNoAddedButton), new p0(this, 2));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder2.f20679a);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.U && !this.V) {
            this.U = true;
            f.a(this.currentAccount).c(new k0(this, 0));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.e.setPadding(0, 0, 0, i13);
        this.e.setClipToPadding(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            cq cqVar = this.f13057b;
            if (cqVar != null) {
                cqVar.b(k6.x0(null, k6.f21519v8, false));
            }
            g8 g8Var = this.f13058c;
            if (g8Var != null) {
                g8Var.b(getThemedColor(k6.f21589z6));
                ImageView imageView = this.f13063w;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
