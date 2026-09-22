package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.eb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.c01;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y51;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r20;
import w7.y5;
public final class l extends r20 implements NotificationCenter.NotificationCenterDelegate {
    public final long P;
    public FrameLayout Q;
    public sg.e R;
    public LinearLayout S;
    public bi.q T;
    public n90 U;
    public boolean W;
    public TL_payments.starRefProgram X;
    public TL_payments.starRefProgram Y;
    public boolean f8464b0;
    public g f8465c0;
    public final e V = new e(this, 0);
    public String[] Z = null;
    public final List f8463a0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public l(long j3) {
        this.P = j3;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static void A0(l lVar, int i10) {
        g gVar = lVar.f8465c0;
        if (gVar != null) {
            int i11 = gVar.G(i10).d;
            if (i11 == 4) {
                LinearLayout linearLayout = new LinearLayout(lVar.getParentActivity());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                TextView textView = new TextView(lVar.getParentActivity());
                textView.setTextSize(1, 16.0f);
                int i12 = j6.G6;
                textView.setTextColor(j6.v0(i12, lVar.resourceProvider));
                org.telegram.messenger.l0.l(R.string.AffiliateProgramStopText, textView);
                linearLayout.addView(textView, y5.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                ai.p4 p4Var = new ai.p4(lVar.getParentActivity(), 1);
                p4Var.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
                p4Var.setTextSize(1, 16.0f);
                p4Var.setTextColor(j6.v0(i12, lVar.resourceProvider));
                p4Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText1)));
                linearLayout.addView(p4Var, y5.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                ai.p4 p4Var2 = new ai.p4(lVar.getParentActivity(), 1);
                p4Var2.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
                p4Var2.setTextSize(1, 16.0f);
                p4Var2.setTextColor(j6.v0(i12, lVar.resourceProvider));
                p4Var2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText2)));
                linearLayout.addView(p4Var2, y5.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                ai.p4 p4Var3 = new ai.p4(lVar.getParentActivity(), 1);
                p4Var3.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
                p4Var3.setTextSize(1, 16.0f);
                p4Var3.setTextColor(j6.v0(i12, lVar.resourceProvider));
                p4Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText3)));
                linearLayout.addView(p4Var3, y5.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getParentActivity(), 0, lVar.resourceProvider);
                alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.AffiliateProgramAlert);
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.AffiliateProgramStopButton), new a1.c(lVar, 29));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
            } else if (i11 == 2) {
                lVar.presentFragment(new e5(lVar.P));
            }
        }
    }

    public static String G0(int i10) {
        float f7 = i10 / 10.0f;
        if (((int) f7) == f7) {
            Locale locale = Locale.US;
            return a4.a.m(i10 / 10, "%");
        }
        return String.format(Locale.US, "%.1f%%", Float.valueOf(f7));
    }

    public static void x0(l lVar, Context context) {
        String formatPluralString;
        int i10;
        int i11;
        if (!lVar.T.W) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        c01 c01Var = new c01(context, lVar.resourceProvider);
        e eVar = new e(lVar, 1);
        c01Var.c(LocaleController.getString(R.string.AffiliateProgramCommission), G0(lVar.Y.commission_permille), null, null);
        String string = LocaleController.getString(R.string.AffiliateProgramDuration);
        int i12 = lVar.Y.duration_months;
        if (i12 <= 0) {
            formatPluralString = LocaleController.getString(R.string.Infinity);
        } else if (i12 >= 12 && i12 % 12 == 0) {
            formatPluralString = LocaleController.formatPluralString("Years", i12 / 12, new Object[0]);
        } else {
            formatPluralString = LocaleController.formatPluralString("Months", i12, new Object[0]);
        }
        c01Var.c(string, formatPluralString, null, null);
        frameLayout.addView(c01Var, y5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, lVar.resourceProvider);
        alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.AffiliateProgramAlert);
        if (lVar.W) {
            i10 = R.string.AffiliateProgramStartAlertText;
        } else {
            i10 = R.string.AffiliateProgramUpdateAlertText;
        }
        alertDialog$Builder.f18669a.T = LocaleController.getString(i10);
        alertDialog$Builder.n(frameLayout);
        if (lVar.W) {
            i11 = R.string.AffiliateProgramStartAlertButton;
        } else {
            i11 = R.string.AffiliateProgramUpdateAlertButton;
        }
        alertDialog$Builder.k(LocaleController.getString(i11), new a1.c(eVar, 28));
        hg.k0.p(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void y0(l lVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j3 = lVar.P;
        b2Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull userFull = lVar.getMessagesController().getUserFull(j3);
            if (userFull != null) {
                userFull.starref_program = starrefprogram;
                lVar.getMessagesStorage().updateUserInfo(userFull, false);
                NotificationCenter.getInstance(lVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j3), userFull);
            }
            lVar.D0(false);
        } else if (tL_error != null) {
            xc.b0(tL_error);
        }
    }

    public static void z0(l lVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        long j3 = lVar.P;
        b2Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull userFull = lVar.getMessagesController().getUserFull(j3);
            if (userFull != null) {
                TL_payments.starRefProgram starrefprogram2 = lVar.Y;
                starrefprogram2.flags |= 2;
                int currentTime = lVar.getConnectionsManager().getCurrentTime();
                if (lVar.getConnectionsManager().isTestBackend()) {
                    i10 = 300;
                } else {
                    i10 = 86400;
                }
                starrefprogram2.end_date = currentTime + i10;
                userFull.starref_program = starrefprogram;
                lVar.getMessagesStorage().updateUserInfo(userFull, false);
                NotificationCenter.getInstance(lVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j3), userFull);
            }
            lVar.D0(true);
        } else if (tL_error != null) {
            xc.b0(tL_error);
        }
    }

    public final void D0(boolean z10) {
        org.telegram.ui.ActionBar.n2 n2Var = null;
        if (getParentLayout() != null && getParentLayout().getFragmentStack() != null) {
            org.telegram.ui.ActionBar.d5 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size > 0) {
                    org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) fragmentStack.get(size);
                    if ((n2Var2 instanceof ProfileActivity) && ((ProfileActivity) n2Var2).a() == this.P) {
                        n2Var = n2Var2;
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            if (n2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.n2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                n2Var = parentLayout.getBackgroundFragment();
            }
        } else {
            finishFragment();
        }
        if (n2Var != null) {
            if (z10) {
                xc.a0(n2Var).M(LocaleController.getString(R.string.AffiliateProgramEndedTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramEndedText)), R.raw.linkbroken).j();
                return;
            }
            xc.a0(n2Var).M(LocaleController.getString(R.string.AffiliateProgramStartedTitle), LocaleController.getString(R.string.AffiliateProgramStartedText), R.raw.contact_check).j();
        }
    }

    public final void E0(ArrayList arrayList, m61 m61Var) {
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        y51 y51Var = new y51(-2);
        y51Var.f30512c = (eb) super.r0(getParentActivity());
        arrayList.add(y51Var);
        arrayList.add(j.a(R.drawable.menu_feature_premium, LocaleController.getString(R.string.BotAffiliateProgramFeature1Title), LocaleController.getString(R.string.BotAffiliateProgramFeature1)));
        arrayList.add(j.a(R.drawable.msg_channel, LocaleController.getString(R.string.BotAffiliateProgramFeature2Title), LocaleController.getString(R.string.BotAffiliateProgramFeature2)));
        arrayList.add(j.a(R.drawable.menu_feature_links2, LocaleController.getString(R.string.BotAffiliateProgramFeature3Title), LocaleController.getString(R.string.BotAffiliateProgramFeature3)));
        arrayList.add(y51.A(1, null));
        arrayList.add(y51.t(LocaleController.getString(R.string.AffiliateProgramCommission)));
        int i11 = getMessagesController().starrefMinCommissionPermille;
        int i12 = this.Y.commission_permille;
        int i13 = getMessagesController().starrefMaxCommissionPermille;
        c cVar = new c(0);
        a aVar = new a(this, 1);
        y51 y51Var2 = new y51(15);
        y51Var2.f30531z = i12;
        y51Var2.C = aVar;
        z7 z7Var = new z7();
        z7Var.f21936a = i11;
        z7Var.f21937b = i13;
        z7Var.e = new ma(cVar, 7);
        y51Var2.G = z7Var;
        y51Var2.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.X;
        if (starrefprogram == null) {
            i10 = -1;
        } else {
            i10 = starrefprogram.commission_permille;
        }
        y51Var2.B = i10;
        arrayList.add(y51Var2);
        com.google.android.gms.internal.vision.e2.w(R.string.AffiliateProgramCommissionInfo, arrayList);
        com.google.android.gms.internal.vision.e2.n(R.string.AffiliateProgramDuration, arrayList);
        String[] strArr = this.Z;
        List list = this.f8463a0;
        if (strArr == null) {
            this.Z = new String[list.size()];
            for (int i14 = 0; i14 < list.size(); i14++) {
                int intValue = ((Integer) list.get(i14)).intValue();
                if (intValue == 0) {
                    this.Z[i14] = LocaleController.getString(R.string.Infinity);
                } else if (intValue >= 12 && intValue % 12 == 0) {
                    this.Z[i14] = LocaleController.formatPluralString("YearsShort", intValue / 12, new Object[0]);
                } else {
                    this.Z[i14] = LocaleController.formatPluralString("MonthsShort", intValue, new Object[0]);
                }
            }
        }
        String[] strArr2 = this.Z;
        int indexOf = list.indexOf(Integer.valueOf(this.Y.duration_months));
        a aVar2 = new a(this, 2);
        y51 y51Var3 = new y51(14);
        y51Var3.f30522p = strArr2;
        y51Var3.f30531z = indexOf;
        y51Var3.C = aVar2;
        y51Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram2 = this.X;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months <= 0) {
                y51Var3.B = list.size() - 1;
            } else {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.X.duration_months) {
                        y51Var3.B = size;
                        break;
                    }
                    size--;
                }
            }
        }
        arrayList.add(y51Var3);
        com.google.android.gms.internal.vision.e2.w(R.string.AffiliateProgramDurationInfo, arrayList);
        arrayList.add(h.a(2, getThemedColor(j6.uj), R.drawable.filled_earn_stars, LocaleController.getString(R.string.AffiliateProgramExistingProgramsTitle), LocaleController.getString(R.string.AffiliateProgramExistingProgramsText)));
        arrayList.add(y51.A(3, null));
        if (!this.W && this.Y.end_date == 0) {
            y51 e = y51.e(4, LocaleController.getString(R.string.AffiliateProgramStop));
            e.f30524r = true;
            arrayList.add(e);
            arrayList.add(y51.A(5, null));
        }
        arrayList.add(y51.A(6, null));
        arrayList.add(y51.A(7, null));
    }

    public final TL_payments.starRefProgram F0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.clamp(50, getMessagesController().starrefMaxCommissionPermille, getMessagesController().starrefMinCommissionPermille);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void H0(boolean z10) {
        int i10;
        int i11;
        bi.q qVar = this.T;
        if (!this.W && this.Y.end_date == 0) {
            i10 = R.string.AffiliateProgramUpdate;
        } else {
            i10 = R.string.AffiliateProgramStart;
        }
        qVar.g(LocaleController.getString(i10), z10, true);
        e eVar = this.V;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        eVar.run();
        n90 n90Var = this.U;
        if (!this.W && this.Y.end_date == 0) {
            i11 = R.string.AffiliateProgramUpdateInfo;
        } else {
            i11 = R.string.AffiliateProgramStartInfo;
        }
        n90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), new e(this, 2)));
        I0();
        g gVar = this.f8465c0;
        if (gVar != null) {
            gVar.N(z10);
        }
    }

    public final void I0() {
        boolean z10;
        TL_payments.starRefProgram starrefprogram;
        bi.q qVar = this.T;
        TL_payments.starRefProgram starrefprogram2 = this.Y;
        if (starrefprogram2.end_date == 0 && ((starrefprogram = this.X) == null || starrefprogram.commission_permille != starrefprogram2.commission_permille || starrefprogram.duration_months != starrefprogram2.duration_months)) {
            z10 = true;
        } else {
            z10 = false;
        }
        qVar.setEnabled(z10);
    }

    @Override
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        new eb(this, context, 2).setBackgroundColor(j6.w0(null, j6.f19198i5, false));
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        frameLayout.setClickable(true);
        sg.e eVar = new sg.e(context, 1, 3);
        this.R = eVar;
        sg.a aVar = eVar.f43260b;
        aVar.f43248w = j6.fk;
        aVar.f43249x = j6.gk;
        aVar.b();
        this.R.setStarParticlesView(this.e);
        this.Q.addView(this.R, y5.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.BotAffiliateProgramTitle), LocaleController.getString(R.string.BotAffiliateProgramText), this.Q, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.S = linearLayout;
        linearLayout.setOrientation(1);
        this.S.setBackgroundColor(getThemedColor(j6.f19109d6));
        View view = new View(context);
        view.setBackgroundColor(getThemedColor(j6.f19110d7));
        this.S.addView(view, new LinearLayout.LayoutParams(y5.z(-1.0f), y5.z(1.0f / AndroidUtilities.density)));
        bi.q qVar = new bi.q(1, context, this.resourceProvider, true);
        qVar.setRoundRadius(24);
        this.T = qVar;
        qVar.g(LocaleController.getString(R.string.AffiliateProgramStart), false, true);
        this.T.setOnClickListener(new ai.f2(7, this, context));
        this.S.addView(this.T, y5.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        n90 n90Var = new n90(context, this.resourceProvider);
        this.U = n90Var;
        n90Var.setTextColor(getThemedColor(j6.f19511z6));
        this.U.setLinkTextColor(getThemedColor(j6.gc));
        this.U.setTextSize(1, 12.0f);
        this.U.setGravity(17);
        this.S.addView(this.U, y5.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        H0(false);
        ((FrameLayout) this.fragmentView).addView(this.S, y5.e(-1, -2, 87));
        this.f37047c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f));
        this.f37047c.setOnItemClickListener(new ai.g(this, 8));
        s4.j jVar = new s4.j();
        jVar.f43030m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.f37047c.setItemAnimator(jVar);
        return this.fragmentView;
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(j6.f19109d6);
    }

    @Override
    public final s4.h0 n0() {
        g gVar = new g(this, this.f37047c, getParentActivity(), this.currentAccount, this.classGuid, new bi.v(this, 12), getResourceProvider());
        this.f8465c0 = gVar;
        return gVar;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f8464b0 = true;
        this.W = true;
        this.Y = F0();
        this.X = null;
        MessagesController messagesController = getMessagesController();
        long j3 = this.P;
        TLRPC.UserFull userFull = messagesController.getUserFull(j3);
        if (userFull != null) {
            this.W = false;
            TL_payments.starRefProgram starrefprogram = userFull.starref_program;
            this.Y = starrefprogram;
            if (starrefprogram == null) {
                this.W = true;
                this.Y = F0();
                this.X = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.X = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.Y;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                getMessagesController().loadFullUser(user, getClassGuid(), true, new a(this, 0));
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.f8464b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.V);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f37047c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f) + i13);
        this.f37047c.setClipToPadding(false);
        this.S.setPadding(0, 0, 0, i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        sg.e eVar = this.R;
        if (eVar != null) {
            eVar.setPaused(true);
            this.R.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        sg.e eVar = this.R;
        if (eVar != null) {
            eVar.setPaused(false);
            this.R.setDialogVisible(false);
        }
    }

    @Override
    public final rg.w1 p0() {
        f fVar = new f(getParentActivity(), 0);
        fVar.b();
        return fVar;
    }

    @Override
    public final View r0(Context context) {
        throw null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
