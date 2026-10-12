package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.ab;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.v20;
import w7.a6;
public final class l extends v20 implements NotificationCenter.NotificationCenterDelegate {
    public final long P;
    public FrameLayout Q;
    public tg.n R;
    public LinearLayout S;
    public ci.p T;
    public da0 U;
    public boolean W;
    public TL_payments.starRefProgram X;
    public TL_payments.starRefProgram Y;
    public boolean f9390b0;
    public g f9391c0;
    public final e V = new e(this, 0);
    public String[] Z = null;
    public final List f9389a0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public l(long j10) {
        this.P = j10;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static void A0(l lVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        long j10 = lVar.P;
        a2Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull userFull = lVar.getMessagesController().getUserFull(j10);
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
                NotificationCenter.getInstance(lVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
            }
            lVar.E0(true);
        } else if (tL_error != null) {
            zc.d0(tL_error);
        }
    }

    public static void B0(l lVar, int i10) {
        g gVar = lVar.f9391c0;
        if (gVar != null) {
            int i11 = gVar.G(i10).d;
            if (i11 == 4) {
                LinearLayout linearLayout = new LinearLayout(lVar.getParentActivity());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                TextView textView = new TextView(lVar.getParentActivity());
                textView.setTextSize(1, 16.0f);
                int i12 = g6.G6;
                textView.setTextColor(g6.w0(i12, lVar.resourceProvider));
                org.telegram.messenger.q.o(R.string.AffiliateProgramStopText, textView);
                linearLayout.addView(textView, a6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                bi.f4 f4Var = new bi.f4(lVar.getParentActivity(), 1);
                f4Var.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
                f4Var.setTextSize(1, 16.0f);
                f4Var.setTextColor(g6.w0(i12, lVar.resourceProvider));
                f4Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText1)));
                linearLayout.addView(f4Var, a6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                bi.f4 f4Var2 = new bi.f4(lVar.getParentActivity(), 1);
                f4Var2.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
                f4Var2.setTextSize(1, 16.0f);
                f4Var2.setTextColor(g6.w0(i12, lVar.resourceProvider));
                f4Var2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText2)));
                linearLayout.addView(f4Var2, a6.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                bi.f4 f4Var3 = new bi.f4(lVar.getParentActivity(), 1);
                f4Var3.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
                f4Var3.setTextSize(1, 16.0f);
                f4Var3.setTextColor(g6.w0(i12, lVar.resourceProvider));
                f4Var3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText3)));
                linearLayout.addView(f4Var3, a6.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getParentActivity(), 0, lVar.resourceProvider);
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.AffiliateProgramAlert);
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.AffiliateProgramStopButton), new f1.a(lVar, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
            } else if (i11 == 2) {
                lVar.presentFragment(new d5(lVar.P));
            }
        }
    }

    public static String H0(int i10) {
        float f7 = i10 / 10.0f;
        if (((int) f7) == f7) {
            Locale locale = Locale.US;
            return a1.g.m(i10 / 10, "%");
        }
        return String.format(Locale.US, "%.1f%%", Float.valueOf(f7));
    }

    public static void y0(l lVar, Context context) {
        String formatPluralString;
        int i10;
        int i11;
        if (!lVar.T.W) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        n01 n01Var = new n01(context, lVar.resourceProvider);
        e eVar = new e(lVar, 1);
        n01Var.c(LocaleController.getString(R.string.AffiliateProgramCommission), H0(lVar.Y.commission_permille), null, null);
        String string = LocaleController.getString(R.string.AffiliateProgramDuration);
        int i12 = lVar.Y.duration_months;
        if (i12 <= 0) {
            formatPluralString = LocaleController.getString(R.string.Infinity);
        } else if (i12 >= 12 && i12 % 12 == 0) {
            formatPluralString = LocaleController.formatPluralString("Years", i12 / 12, new Object[0]);
        } else {
            formatPluralString = LocaleController.formatPluralString("Months", i12, new Object[0]);
        }
        n01Var.c(string, formatPluralString, null, null);
        frameLayout.addView(n01Var, a6.a(-2.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 119));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, lVar.resourceProvider);
        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.AffiliateProgramAlert);
        if (lVar.W) {
            i10 = R.string.AffiliateProgramStartAlertText;
        } else {
            i10 = R.string.AffiliateProgramUpdateAlertText;
        }
        alertDialog$Builder.f19548a.T = LocaleController.getString(i10);
        alertDialog$Builder.n(frameLayout);
        if (lVar.W) {
            i11 = R.string.AffiliateProgramStartAlertButton;
        } else {
            i11 = R.string.AffiliateProgramUpdateAlertButton;
        }
        alertDialog$Builder.k(LocaleController.getString(i11), new f1.a(eVar, 1));
        org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void z0(l lVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = lVar.P;
        a2Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull userFull = lVar.getMessagesController().getUserFull(j10);
            if (userFull != null) {
                userFull.starref_program = starrefprogram;
                lVar.getMessagesStorage().updateUserInfo(userFull, false);
                NotificationCenter.getInstance(lVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
            }
            lVar.E0(false);
        } else if (tL_error != null) {
            zc.d0(tL_error);
        }
    }

    public final void E0(boolean z10) {
        org.telegram.ui.ActionBar.m2 m2Var = null;
        if (getParentLayout() != null && getParentLayout().getFragmentStack() != null) {
            org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size > 0) {
                    org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) fragmentStack.get(size);
                    if ((m2Var2 instanceof ProfileActivity) && ((ProfileActivity) m2Var2).a() == this.P) {
                        m2Var = m2Var2;
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            if (m2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.m2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                m2Var = parentLayout.getBackgroundFragment();
            }
        } else {
            finishFragment();
        }
        if (m2Var != null) {
            if (z10) {
                zc.a0(m2Var).M(LocaleController.getString(R.string.AffiliateProgramEndedTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramEndedText)), R.raw.linkbroken).j();
                return;
            }
            zc.a0(m2Var).M(LocaleController.getString(R.string.AffiliateProgramStartedTitle), LocaleController.getString(R.string.AffiliateProgramStartedText), R.raw.contact_check).j();
        }
    }

    public final void F0(ArrayList arrayList, z61 z61Var) {
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        l61 l61Var = new l61(-2);
        l61Var.f26948c = (ab) super.r0(getParentActivity());
        arrayList.add(l61Var);
        arrayList.add(j.a(R.drawable.menu_feature_premium, LocaleController.getString(R.string.BotAffiliateProgramFeature1Title), LocaleController.getString(R.string.BotAffiliateProgramFeature1)));
        arrayList.add(j.a(R.drawable.msg_channel, LocaleController.getString(R.string.BotAffiliateProgramFeature2Title), LocaleController.getString(R.string.BotAffiliateProgramFeature2)));
        arrayList.add(j.a(R.drawable.menu_feature_links2, LocaleController.getString(R.string.BotAffiliateProgramFeature3Title), LocaleController.getString(R.string.BotAffiliateProgramFeature3)));
        arrayList.add(l61.A(1, null));
        arrayList.add(l61.t(LocaleController.getString(R.string.AffiliateProgramCommission)));
        int i11 = getMessagesController().starrefMinCommissionPermille;
        int i12 = this.Y.commission_permille;
        int i13 = getMessagesController().starrefMaxCommissionPermille;
        c cVar = new c(0);
        a aVar = new a(this, 1);
        l61 l61Var2 = new l61(15);
        l61Var2.f26967z = i12;
        l61Var2.C = aVar;
        y7 y7Var = new y7();
        y7Var.f22785a = i11;
        y7Var.f22786b = i13;
        y7Var.e = new ja(cVar, 7);
        l61Var2.G = y7Var;
        l61Var2.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.X;
        if (starrefprogram == null) {
            i10 = -1;
        } else {
            i10 = starrefprogram.commission_permille;
        }
        l61Var2.B = i10;
        arrayList.add(l61Var2);
        i2.d.y(R.string.AffiliateProgramCommissionInfo, arrayList);
        i2.d.o(R.string.AffiliateProgramDuration, arrayList);
        String[] strArr = this.Z;
        List list = this.f9389a0;
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
        l61 l61Var3 = new l61(14);
        l61Var3.f26958p = strArr2;
        l61Var3.f26967z = indexOf;
        l61Var3.C = aVar2;
        l61Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram2 = this.X;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months <= 0) {
                l61Var3.B = list.size() - 1;
            } else {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.X.duration_months) {
                        l61Var3.B = size;
                        break;
                    }
                    size--;
                }
            }
        }
        arrayList.add(l61Var3);
        i2.d.y(R.string.AffiliateProgramDurationInfo, arrayList);
        arrayList.add(h.a(2, getThemedColor(g6.uj), R.drawable.filled_earn_stars, LocaleController.getString(R.string.AffiliateProgramExistingProgramsTitle), LocaleController.getString(R.string.AffiliateProgramExistingProgramsText)));
        arrayList.add(l61.A(3, null));
        if (!this.W && this.Y.end_date == 0) {
            l61 e = l61.e(4, LocaleController.getString(R.string.AffiliateProgramStop));
            e.f26960r = true;
            arrayList.add(e);
            arrayList.add(l61.A(5, null));
        }
        arrayList.add(l61.A(6, null));
        arrayList.add(l61.A(7, null));
    }

    public final TL_payments.starRefProgram G0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.clamp(50, getMessagesController().starrefMaxCommissionPermille, getMessagesController().starrefMinCommissionPermille);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void I0(boolean z10) {
        int i10;
        int i11;
        ci.p pVar = this.T;
        if (!this.W && this.Y.end_date == 0) {
            i10 = R.string.AffiliateProgramUpdate;
        } else {
            i10 = R.string.AffiliateProgramStart;
        }
        pVar.g(LocaleController.getString(i10), z10, true);
        e eVar = this.V;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        eVar.run();
        da0 da0Var = this.U;
        if (!this.W && this.Y.end_date == 0) {
            i11 = R.string.AffiliateProgramUpdateInfo;
        } else {
            i11 = R.string.AffiliateProgramStartInfo;
        }
        da0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), new e(this, 2)));
        J0();
        g gVar = this.f9391c0;
        if (gVar != null) {
            gVar.N(z10);
        }
    }

    public final void J0() {
        boolean z10;
        TL_payments.starRefProgram starrefprogram;
        ci.p pVar = this.T;
        TL_payments.starRefProgram starrefprogram2 = this.Y;
        if (starrefprogram2.end_date == 0 && ((starrefprogram = this.X) == null || starrefprogram.commission_permille != starrefprogram2.commission_permille || starrefprogram.duration_months != starrefprogram2.duration_months)) {
            z10 = true;
        } else {
            z10 = false;
        }
        pVar.setEnabled(z10);
    }

    @Override
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        new ab(this, context, 2).setBackgroundColor(g6.x0(null, g6.f19989i5, false));
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        frameLayout.setClickable(true);
        tg.n nVar = new tg.n(context, 1, 3);
        this.R = nVar;
        tg.g gVar = nVar.f45740b;
        gVar.f45724z = g6.fk;
        gVar.A = g6.gk;
        gVar.b();
        this.R.setStarParticlesView(this.e);
        this.Q.addView(this.R, a6.a(190.0f, 0.0f, 32.0f, 0.0f, 24.0f, 190, 17));
        m0(LocaleController.getString(R.string.BotAffiliateProgramTitle), LocaleController.getString(R.string.BotAffiliateProgramText), this.Q, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.S = linearLayout;
        linearLayout.setOrientation(1);
        this.S.setBackgroundColor(getThemedColor(g6.f19901d6));
        View view = new View(context);
        view.setBackgroundColor(getThemedColor(g6.f19902d7));
        this.S.addView(view, new LinearLayout.LayoutParams(a6.z(-1.0f), a6.z(1.0f / AndroidUtilities.density)));
        ci.p pVar = new ci.p(1, context, this.resourceProvider, true);
        pVar.setRoundRadius(24);
        this.T = pVar;
        pVar.g(LocaleController.getString(R.string.AffiliateProgramStart), false, true);
        this.T.setOnClickListener(new bi.u1(7, this, context));
        this.S.addView(this.T, a6.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        da0 da0Var = new da0(context, this.resourceProvider);
        this.U = da0Var;
        da0Var.setTextColor(getThemedColor(g6.f20305z6));
        this.U.setLinkTextColor(getThemedColor(g6.f19960gc));
        this.U.setTextSize(1, 12.0f);
        this.U.setGravity(17);
        this.S.addView(this.U, a6.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        I0(false);
        ((FrameLayout) this.fragmentView).addView(this.S, a6.e(-1, -2, 87));
        this.f40861c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f));
        this.f40861c.setOnItemClickListener(new bi.d(this, 8));
        s4.k kVar = new s4.k();
        kVar.f44872m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.f40861c.setItemAnimator(kVar);
        return this.fragmentView;
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(g6.f19901d6);
    }

    @Override
    public final s4.g0 n0() {
        g gVar = new g(this, this.f40861c, getParentActivity(), this.currentAccount, this.classGuid, new ci.u(this, 12), getResourceProvider());
        this.f9391c0 = gVar;
        return gVar;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f9390b0 = true;
        this.W = true;
        this.Y = G0();
        this.X = null;
        MessagesController messagesController = getMessagesController();
        long j10 = this.P;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        if (userFull != null) {
            this.W = false;
            TL_payments.starRefProgram starrefprogram = userFull.starref_program;
            this.Y = starrefprogram;
            if (starrefprogram == null) {
                this.W = true;
                this.Y = G0();
                this.X = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.X = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.Y;
                starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                starrefprogram2.duration_months = starrefprogram3.duration_months;
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                getMessagesController().loadFullUser(user, getClassGuid(), true, new a(this, 0));
            }
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.f9390b0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.V);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f40861c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f) + i13);
        this.f40861c.setClipToPadding(false);
        this.S.setPadding(0, 0, 0, i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        tg.n nVar = this.R;
        if (nVar != null) {
            nVar.setPaused(true);
            this.R.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        tg.n nVar = this.R;
        if (nVar != null) {
            nVar.setPaused(false);
            this.R.setDialogVisible(false);
        }
    }

    @Override
    public final sg.x1 p0() {
        f fVar = new f(getParentActivity(), 0);
        fVar.c();
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
