package nh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import lh.a8;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a20;

public final class k extends a20 implements NotificationCenter.NotificationCenterDelegate {
    public final long L;
    public FrameLayout M;
    public bg.i N;
    public LinearLayout O;
    public hh.p P;
    public p80 Q;
    public boolean S;
    public TL_payments.starRefProgram T;
    public TL_payments.starRefProgram U;
    public boolean X;
    public f Y;
    public final e R = new e(this, 0);
    public String[] V = null;
    public final List W = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public k(long j10) {
        this.L = j10;
        this.I = true;
        this.H = AndroidUtilities.dp(60.0f);
    }

    public static void A0(k kVar, int i10) {
        f fVar = kVar.Y;
        if (fVar == null) {
            return;
        }
        int i11 = fVar.G(i10).d;
        if (i11 != 4) {
            if (i11 == 2) {
                kVar.presentFragment(new p4(kVar.L));
                return;
            }
            return;
        }
        LinearLayout linearLayout = new LinearLayout(kVar.getParentActivity());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        TextView textView = new TextView(kVar.getParentActivity());
        textView.setTextSize(1, 16.0f);
        int i12 = g6.G6;
        textView.setTextColor(g6.v0(i12, kVar.resourceProvider));
        org.telegram.messenger.y1.p(R.string.AffiliateProgramStopText, textView);
        linearLayout.addView(textView, z5.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        cg.q qVar = new cg.q(kVar.getParentActivity(), 3);
        qVar.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        qVar.setTextSize(1, 16.0f);
        qVar.setTextColor(g6.v0(i12, kVar.resourceProvider));
        qVar.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText1)));
        linearLayout.addView(qVar, z5.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        cg.q qVar2 = new cg.q(kVar.getParentActivity(), 3);
        qVar2.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        qVar2.setTextSize(1, 16.0f);
        qVar2.setTextColor(g6.v0(i12, kVar.resourceProvider));
        qVar2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText2)));
        linearLayout.addView(qVar2, z5.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
        cg.q qVar3 = new cg.q(kVar.getParentActivity(), 3);
        qVar3.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
        qVar3.setTextSize(1, 16.0f);
        qVar3.setTextColor(g6.v0(i12, kVar.resourceProvider));
        qVar3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText3)));
        linearLayout.addView(qVar3, z5.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getParentActivity(), 0, kVar.resourceProvider);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AffiliateProgramAlert);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(LocaleController.getString(R.string.AffiliateProgramStopButton), new lh.p(kVar, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }

    public static String G0(int i10) {
        float f10 = i10 / 10.0f;
        if (((int) f10) != f10) {
            return String.format(Locale.US, "%.1f%%", Float.valueOf(f10));
        }
        Locale locale = Locale.US;
        return s3.c.d(i10 / 10, "%");
    }

    public static void x0(k kVar, Context context) {
        String pluralString;
        if (kVar.P.S) {
            FrameLayout frameLayout = new FrameLayout(context);
            yy0 yy0Var = new yy0(context, kVar.resourceProvider);
            e eVar = new e(kVar, 1);
            yy0Var.c(LocaleController.getString(R.string.AffiliateProgramCommission), G0(kVar.U.commission_permille), null, null);
            String string = LocaleController.getString(R.string.AffiliateProgramDuration);
            int i10 = kVar.U.duration_months;
            if (i10 <= 0) {
                pluralString = LocaleController.getString(R.string.Infinity);
            } else {
                pluralString = (i10 < 12 || i10 % 12 != 0) ? LocaleController.formatPluralString("Months", i10, new Object[0]) : LocaleController.formatPluralString("Years", i10 / 12, new Object[0]);
            }
            yy0Var.c(string, pluralString, null, null);
            frameLayout.addView(yy0Var, z5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, kVar.resourceProvider);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AffiliateProgramAlert);
            alertDialog$Builder.f22702a.P = LocaleController.getString(kVar.S ? R.string.AffiliateProgramStartAlertText : R.string.AffiliateProgramUpdateAlertText);
            alertDialog$Builder.n(frameLayout);
            alertDialog$Builder.k(LocaleController.getString(kVar.S ? R.string.AffiliateProgramStartAlertButton : R.string.AffiliateProgramUpdateAlertButton), new lh.p(eVar, 7));
            i0.a.w(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static void y0(k kVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = kVar.L;
        b2Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                mc.b0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull userFull = kVar.getMessagesController().getUserFull(j10);
        if (userFull != null) {
            userFull.starref_program = starrefprogram;
            kVar.getMessagesStorage().updateUserInfo(userFull, false);
            NotificationCenter.getInstance(kVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
        }
        kVar.D0(false);
    }

    public static void z0(k kVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = kVar.L;
        b2Var.dismiss();
        if (!(tLObject instanceof TL_payments.starRefProgram)) {
            if (tL_error != null) {
                mc.b0(tL_error);
                return;
            }
            return;
        }
        TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
        TLRPC.UserFull userFull = kVar.getMessagesController().getUserFull(j10);
        if (userFull != null) {
            TL_payments.starRefProgram starrefprogram2 = kVar.U;
            starrefprogram2.flags |= 2;
            starrefprogram2.end_date = kVar.getConnectionsManager().getCurrentTime() + (kVar.getConnectionsManager().isTestBackend() ? 300 : 86400);
            userFull.starref_program = starrefprogram;
            kVar.getMessagesStorage().updateUserInfo(userFull, false);
            NotificationCenter.getInstance(kVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
        }
        kVar.D0(true);
    }

    public final void D0(boolean z10) {
        org.telegram.ui.ActionBar.n2 backgroundFragment = null;
        if (getParentLayout() == null || getParentLayout().getFragmentStack() == null) {
            finishFragment();
        } else {
            b5 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size <= 0) {
                    size = -1;
                    break;
                }
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(size);
                if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).a() == this.L) {
                    backgroundFragment = n2Var;
                    break;
                }
                size--;
            }
            if (backgroundFragment != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.n2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                backgroundFragment = parentLayout.getBackgroundFragment();
            }
        }
        if (backgroundFragment != null) {
            if (z10) {
                mc.a0(backgroundFragment).M(LocaleController.getString(R.string.AffiliateProgramEndedTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramEndedText)), R.raw.linkbroken).j();
            } else {
                mc.a0(backgroundFragment).M(LocaleController.getString(R.string.AffiliateProgramStartedTitle), LocaleController.getString(R.string.AffiliateProgramStartedText), R.raw.contact_check).j();
            }
        }
    }

    public final void E0(ArrayList arrayList, b51 b51Var) {
        if (getParentActivity() == null) {
            return;
        }
        ag.s0 s0Var = (ag.s0) super.r0(getParentActivity());
        n41 n41Var = new n41(-2);
        n41Var.f30837c = s0Var;
        arrayList.add(n41Var);
        arrayList.add(i.a(R.drawable.menu_feature_premium, LocaleController.getString(R.string.BotAffiliateProgramFeature1Title), LocaleController.getString(R.string.BotAffiliateProgramFeature1)));
        arrayList.add(i.a(R.drawable.msg_channel, LocaleController.getString(R.string.BotAffiliateProgramFeature2Title), LocaleController.getString(R.string.BotAffiliateProgramFeature2)));
        arrayList.add(i.a(R.drawable.menu_feature_links2, LocaleController.getString(R.string.BotAffiliateProgramFeature3Title), LocaleController.getString(R.string.BotAffiliateProgramFeature3)));
        arrayList.add(n41.A(1, null));
        arrayList.add(n41.t(LocaleController.getString(R.string.AffiliateProgramCommission)));
        int i10 = getMessagesController().starrefMinCommissionPermille;
        int i11 = this.U.commission_permille;
        int i12 = getMessagesController().starrefMaxCommissionPermille;
        c cVar = new c(0);
        a aVar = new a(this, 1);
        n41 n41Var2 = new n41(15);
        n41Var2.f30857z = i11;
        n41Var2.C = aVar;
        t7 t7Var = new t7();
        t7Var.f25679a = i10;
        t7Var.f25680b = i12;
        t7Var.f25682e = new ea(cVar, 7);
        n41Var2.G = t7Var;
        n41Var2.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.T;
        n41Var2.B = starrefprogram == null ? -1 : starrefprogram.commission_permille;
        arrayList.add(n41Var2);
        pa.A(R.string.AffiliateProgramCommissionInfo, arrayList);
        pa.o(R.string.AffiliateProgramDuration, arrayList);
        String[] strArr = this.V;
        List list = this.W;
        if (strArr == null) {
            this.V = new String[list.size()];
            for (int i13 = 0; i13 < list.size(); i13++) {
                int iIntValue = ((Integer) list.get(i13)).intValue();
                if (iIntValue == 0) {
                    this.V[i13] = LocaleController.getString(R.string.Infinity);
                } else if (iIntValue < 12 || iIntValue % 12 != 0) {
                    this.V[i13] = LocaleController.formatPluralString("MonthsShort", iIntValue, new Object[0]);
                } else {
                    this.V[i13] = LocaleController.formatPluralString("YearsShort", iIntValue / 12, new Object[0]);
                }
            }
        }
        String[] strArr2 = this.V;
        int iIndexOf = list.indexOf(Integer.valueOf(this.U.duration_months));
        a aVar2 = new a(this, 2);
        n41 n41Var3 = new n41(14);
        n41Var3.f30848p = strArr2;
        n41Var3.f30857z = iIndexOf;
        n41Var3.C = aVar2;
        n41Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram2 = this.T;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months > 0) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.T.duration_months) {
                        n41Var3.B = size;
                        break;
                    }
                }
            } else {
                n41Var3.B = list.size() - 1;
            }
        }
        arrayList.add(n41Var3);
        pa.A(R.string.AffiliateProgramDurationInfo, arrayList);
        arrayList.add(g.a(2, getThemedColor(g6.uj), R.drawable.filled_earn_stars, LocaleController.getString(R.string.AffiliateProgramExistingProgramsTitle), LocaleController.getString(R.string.AffiliateProgramExistingProgramsText)));
        arrayList.add(n41.A(3, null));
        if (!this.S && this.U.end_date == 0) {
            n41 n41VarE = n41.e(4, LocaleController.getString(R.string.AffiliateProgramStop));
            n41VarE.f30850r = true;
            arrayList.add(n41VarE);
            arrayList.add(n41.A(5, null));
        }
        arrayList.add(n41.A(6, null));
        arrayList.add(n41.A(7, null));
    }

    public final TL_payments.starRefProgram F0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.clamp(50, getMessagesController().starrefMaxCommissionPermille, getMessagesController().starrefMinCommissionPermille);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void H0(boolean z10) {
        this.P.g(LocaleController.getString((this.S || this.U.end_date != 0) ? R.string.AffiliateProgramStart : R.string.AffiliateProgramUpdate), z10, true);
        e eVar = this.R;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        eVar.run();
        this.Q.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString((this.S || this.U.end_date != 0) ? R.string.AffiliateProgramStartInfo : R.string.AffiliateProgramUpdateInfo), new e(this, 2)));
        I0();
        f fVar = this.Y;
        if (fVar != null) {
            fVar.N(z10);
        }
    }

    public final void I0() {
        TL_payments.starRefProgram starrefprogram;
        hh.p pVar = this.P;
        TL_payments.starRefProgram starrefprogram2 = this.U;
        pVar.setEnabled(starrefprogram2.end_date == 0 && !((starrefprogram = this.T) != null && starrefprogram.commission_permille == starrefprogram2.commission_permille && starrefprogram.duration_months == starrefprogram2.duration_months));
    }

    @Override
    public final View createView(Context context) {
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        new ag.s0(this, context, 5).setBackgroundColor(g6.w0(null, g6.f23143i5, false));
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.M = frameLayout;
        frameLayout.setClickable(true);
        bg.i iVar = new bg.i(context, 1, 3);
        this.N = iVar;
        bg.a aVar = iVar.f2129b;
        aVar.f2107w = g6.fk;
        aVar.f2108x = g6.gk;
        aVar.b();
        this.N.setStarParticlesView(this.f36343e);
        this.M.addView(this.N, z5.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.BotAffiliateProgramTitle), LocaleController.getString(R.string.BotAffiliateProgramText), this.M, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.O = linearLayout;
        linearLayout.setOrientation(1);
        this.O.setBackgroundColor(getThemedColor(g6.f23053d6));
        View view = new View(context);
        view.setBackgroundColor(getThemedColor(g6.f23054d7));
        this.O.addView(view, new LinearLayout.LayoutParams(z5.z(-1.0f), z5.z(1.0f / AndroidUtilities.density)));
        int i10 = 2;
        hh.p pVar = new hh.p(i10, context, this.resourceProvider, true);
        pVar.setRoundRadius(24);
        this.P = pVar;
        pVar.g(LocaleController.getString(R.string.AffiliateProgramStart), false, true);
        this.P.setOnClickListener(new ag.q0(29, this, context));
        this.O.addView(this.P, z5.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        p80 p80Var = new p80(context, this.resourceProvider);
        this.Q = p80Var;
        p80Var.setTextColor(getThemedColor(g6.f23441z6));
        this.Q.setLinkTextColor(getThemedColor(g6.gc));
        this.Q.setTextSize(1, 12.0f);
        this.Q.setGravity(17);
        this.O.addView(this.Q, z5.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        H0(false);
        ((FrameLayout) this.fragmentView).addView(this.O, z5.e(-1, -2, 87));
        this.f36342c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f));
        this.f36342c.setOnItemClickListener(new ag.p0(this, 17));
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(er.h);
        lVar.n(350L);
        this.f36342c.setItemAnimator(lVar);
        return this.fragmentView;
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(g6.f23053d6);
    }

    @Override
    public final f2.q0 n0() {
        f fVar = new f(this, this.f36342c, getParentActivity(), this.currentAccount, this.classGuid, new a8(this, 5), getResourceProvider());
        this.Y = fVar;
        return fVar;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.X = true;
        this.S = true;
        this.U = F0();
        this.T = null;
        MessagesController messagesController = getMessagesController();
        long j10 = this.L;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        if (userFull != null) {
            this.S = false;
            TL_payments.starRefProgram starrefprogram = userFull.starref_program;
            this.U = starrefprogram;
            if (starrefprogram == null) {
                this.S = true;
                this.U = F0();
                this.T = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.T = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.U;
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
        this.X = false;
        AndroidUtilities.cancelRunOnUIThread(this.R);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f36342c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f) + i13);
        this.f36342c.setClipToPadding(false);
        this.O.setPadding(0, 0, 0, i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        bg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(true);
            this.N.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        bg.i iVar = this.N;
        if (iVar != null) {
            iVar.setPaused(false);
            this.N.setDialogVisible(false);
        }
    }

    @Override
    public final ag.k3 p0() {
        ag.j jVar = new ag.j(getParentActivity(), 2);
        jVar.b();
        return jVar;
    }

    @Override
    public final View r0(Context context) {
        throw null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
