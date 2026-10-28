package hi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.cc;
import bi.md;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.b8;
import org.telegram.ui.Cells.na;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.x01;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b20;
import org.telegram.ui.f20;
public final class k extends f20 implements NotificationCenter.NotificationCenterDelegate {
    public final long R;
    public FrameLayout S;
    public ug.n T;
    public LinearLayout U;
    public bi.v V;
    public aa0 W;
    public boolean Y;
    public TL_payments.starRefProgram Z;
    public TL_payments.starRefProgram f13052a0;
    public boolean f13055d0;
    public f f13056e0;
    public final d X = new d(this, 0);
    public String[] f13053b0 = null;
    public final List f13054c0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public k(long j10) {
        this.R = j10;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static String F0(int i10) {
        float f7 = i10 / 10.0f;
        if (((int) f7) == f7) {
            Locale locale = Locale.US;
            return a1.g.m(i10 / 10, "%");
        }
        return String.format(Locale.US, "%.1f%%", Float.valueOf(f7));
    }

    public static void w0(k kVar, Context context) {
        String formatPluralString;
        int i10;
        int i11;
        if (!kVar.V.f10686c0) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        x01 x01Var = new x01(context, kVar.resourceProvider);
        d dVar = new d(kVar, 1);
        x01Var.c(LocaleController.getString(R.string.AffiliateProgramCommission), F0(kVar.f13052a0.commission_permille), null, null);
        String string = LocaleController.getString(R.string.AffiliateProgramDuration);
        int i12 = kVar.f13052a0.duration_months;
        if (i12 <= 0) {
            formatPluralString = LocaleController.getString(R.string.Infinity);
        } else if (i12 >= 12 && i12 % 12 == 0) {
            formatPluralString = LocaleController.formatPluralString("Years", i12 / 12, new Object[0]);
        } else {
            formatPluralString = LocaleController.formatPluralString("Months", i12, new Object[0]);
        }
        x01Var.c(string, formatPluralString, null, null);
        frameLayout.addView(x01Var, kb1.h(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, kVar.resourceProvider);
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AffiliateProgramAlert);
        if (kVar.Y) {
            i10 = R.string.AffiliateProgramStartAlertText;
        } else {
            i10 = R.string.AffiliateProgramUpdateAlertText;
        }
        alertDialog$Builder.f22369a.T = LocaleController.getString(i10);
        alertDialog$Builder.o(frameLayout);
        if (kVar.Y) {
            i11 = R.string.AffiliateProgramStartAlertButton;
        } else {
            i11 = R.string.AffiliateProgramUpdateAlertButton;
        }
        alertDialog$Builder.k(LocaleController.getString(i11), new e1.c(dVar, 14));
        ic.a.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void x0(k kVar, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = kVar.R;
        e2Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull userFull = kVar.getMessagesController().getUserFull(j10);
            if (userFull != null) {
                userFull.starref_program = starrefprogram;
                kVar.getMessagesStorage().updateUserInfo(userFull, false);
                NotificationCenter.getInstance(kVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
            }
            kVar.C0(false);
        } else if (tL_error != null) {
            wc.e0(tL_error);
        }
    }

    public static void y0(k kVar, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        long j10 = kVar.R;
        e2Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull userFull = kVar.getMessagesController().getUserFull(j10);
            if (userFull != null) {
                TL_payments.starRefProgram starrefprogram2 = kVar.f13052a0;
                starrefprogram2.flags |= 2;
                int currentTime = kVar.getConnectionsManager().getCurrentTime();
                if (kVar.getConnectionsManager().isTestBackend()) {
                    i10 = 300;
                } else {
                    i10 = 86400;
                }
                starrefprogram2.end_date = currentTime + i10;
                userFull.starref_program = starrefprogram;
                kVar.getMessagesStorage().updateUserInfo(userFull, false);
                NotificationCenter.getInstance(kVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(j10), userFull);
            }
            kVar.C0(true);
        } else if (tL_error != null) {
            wc.e0(tL_error);
        }
    }

    public static void z0(k kVar, int i10) {
        f fVar = kVar.f13056e0;
        if (fVar != null) {
            int i11 = fVar.G(i10).d;
            if (i11 == 4) {
                LinearLayout linearLayout = new LinearLayout(kVar.getParentActivity());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                TextView textView = new TextView(kVar.getParentActivity());
                textView.setTextSize(1, 16.0f);
                int i12 = y6.G6;
                f7.V(textView, i12, kVar.resourceProvider);
                org.telegram.messenger.t.n(R.string.AffiliateProgramStopText, textView);
                linearLayout.addView(textView, kb1.o(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                md mdVar = new md(kVar.getParentActivity(), 2);
                mdVar.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
                mdVar.setTextSize(1, 16.0f);
                f7.V(mdVar, i12, kVar.resourceProvider);
                mdVar.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText1)));
                linearLayout.addView(mdVar, kb1.o(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                md mdVar2 = new md(kVar.getParentActivity(), 2);
                mdVar2.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
                mdVar2.setTextSize(1, 16.0f);
                f7.V(mdVar2, i12, kVar.resourceProvider);
                mdVar2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText2)));
                linearLayout.addView(mdVar2, kb1.o(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                md mdVar3 = new md(kVar.getParentActivity(), 2);
                mdVar3.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
                mdVar3.setTextSize(1, 16.0f);
                f7.V(mdVar3, i12, kVar.resourceProvider);
                mdVar3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText3)));
                linearLayout.addView(mdVar3, kb1.o(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kVar.getParentActivity(), 0, kVar.resourceProvider);
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AffiliateProgramAlert);
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.AffiliateProgramStopButton), new e1.c(kVar, 15));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
            } else if (i11 == 2) {
                kVar.presentFragment(new b5(kVar.R));
            }
        }
    }

    public final void C0(boolean z10) {
        org.telegram.ui.ActionBar.r2 r2Var = null;
        if (getParentLayout() != null && getParentLayout().getFragmentStack() != null) {
            j5 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size > 0) {
                    org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) fragmentStack.get(size);
                    if ((r2Var2 instanceof ProfileActivity) && ((ProfileActivity) r2Var2).a() == this.R) {
                        r2Var = r2Var2;
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            if (r2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).c0((org.telegram.ui.ActionBar.r2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                r2Var = parentLayout.getBackgroundFragment();
            }
        } else {
            finishFragment();
        }
        if (r2Var != null) {
            if (z10) {
                wc.b0(r2Var).M(LocaleController.getString(R.string.AffiliateProgramEndedTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramEndedText)), R.raw.linkbroken).j();
                return;
            }
            wc.b0(r2Var).M(LocaleController.getString(R.string.AffiliateProgramStartedTitle), LocaleController.getString(R.string.AffiliateProgramStartedText), R.raw.contact_check).j();
        }
    }

    public final void D0(ArrayList arrayList, k71 k71Var) {
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        u61 u61Var = new u61(-2);
        u61Var.f33243c = (b20) super.k0(getParentActivity());
        arrayList.add(u61Var);
        arrayList.add(i.a(R.drawable.menu_feature_premium, LocaleController.getString(R.string.BotAffiliateProgramFeature1Title), LocaleController.getString(R.string.BotAffiliateProgramFeature1)));
        arrayList.add(i.a(R.drawable.msg_channel, LocaleController.getString(R.string.BotAffiliateProgramFeature2Title), LocaleController.getString(R.string.BotAffiliateProgramFeature2)));
        arrayList.add(i.a(R.drawable.menu_feature_links2, LocaleController.getString(R.string.BotAffiliateProgramFeature3Title), LocaleController.getString(R.string.BotAffiliateProgramFeature3)));
        arrayList.add(u61.B(1, null));
        arrayList.add(u61.u(LocaleController.getString(R.string.AffiliateProgramCommission)));
        int i11 = getMessagesController().starrefMinCommissionPermille;
        int i12 = this.f13052a0.commission_permille;
        int i13 = getMessagesController().starrefMaxCommissionPermille;
        ai.d0 d0Var = new ai.d0(2);
        a aVar = new a(this, 1);
        u61 u61Var2 = new u61(15);
        u61Var2.f33262z = i12;
        u61Var2.C = aVar;
        b8 b8Var = new b8();
        b8Var.f23907a = i11;
        b8Var.f23908b = i13;
        b8Var.e = new na(d0Var, 7);
        u61Var2.G = b8Var;
        u61Var2.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.Z;
        if (starrefprogram == null) {
            i10 = -1;
        } else {
            i10 = starrefprogram.commission_permille;
        }
        u61Var2.B = i10;
        arrayList.add(u61Var2);
        ic.a.z(R.string.AffiliateProgramCommissionInfo, arrayList);
        ic.a.p(R.string.AffiliateProgramDuration, arrayList);
        String[] strArr = this.f13053b0;
        List list = this.f13054c0;
        if (strArr == null) {
            this.f13053b0 = new String[list.size()];
            for (int i14 = 0; i14 < list.size(); i14++) {
                int intValue = ((Integer) list.get(i14)).intValue();
                if (intValue == 0) {
                    this.f13053b0[i14] = LocaleController.getString(R.string.Infinity);
                } else if (intValue >= 12 && intValue % 12 == 0) {
                    this.f13053b0[i14] = LocaleController.formatPluralString("YearsShort", intValue / 12, new Object[0]);
                } else {
                    this.f13053b0[i14] = LocaleController.formatPluralString("MonthsShort", intValue, new Object[0]);
                }
            }
        }
        String[] strArr2 = this.f13053b0;
        int indexOf = list.indexOf(Integer.valueOf(this.f13052a0.duration_months));
        a aVar2 = new a(this, 2);
        u61 u61Var3 = new u61(14);
        u61Var3.f33253p = strArr2;
        u61Var3.f33262z = indexOf;
        u61Var3.C = aVar2;
        u61Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram2 = this.Z;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months <= 0) {
                u61Var3.B = list.size() - 1;
            } else {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.Z.duration_months) {
                        u61Var3.B = size;
                        break;
                    }
                    size--;
                }
            }
        }
        arrayList.add(u61Var3);
        ic.a.z(R.string.AffiliateProgramDurationInfo, arrayList);
        arrayList.add(g.a(2, getThemedColor(y6.uj), R.drawable.filled_earn_stars, LocaleController.getString(R.string.AffiliateProgramExistingProgramsTitle), LocaleController.getString(R.string.AffiliateProgramExistingProgramsText)));
        arrayList.add(u61.B(3, null));
        if (!this.Y && this.f13052a0.end_date == 0) {
            u61 e = u61.e(4, LocaleController.getString(R.string.AffiliateProgramStop));
            e.f33255r = true;
            arrayList.add(e);
            arrayList.add(u61.B(5, null));
        }
        arrayList.add(u61.B(6, null));
        arrayList.add(u61.B(7, null));
    }

    public final TL_payments.starRefProgram E0() {
        TL_payments.starRefProgram starrefprogram = new TL_payments.starRefProgram();
        starrefprogram.commission_permille = Utilities.clamp(50, getMessagesController().starrefMaxCommissionPermille, getMessagesController().starrefMinCommissionPermille);
        starrefprogram.duration_months = 1;
        return starrefprogram;
    }

    public final void G0(boolean z10) {
        int i10;
        int i11;
        bi.v vVar = this.V;
        if (!this.Y && this.f13052a0.end_date == 0) {
            i10 = R.string.AffiliateProgramUpdate;
        } else {
            i10 = R.string.AffiliateProgramStart;
        }
        vVar.i(LocaleController.getString(i10), z10, true);
        d dVar = this.X;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        dVar.run();
        aa0 aa0Var = this.W;
        if (!this.Y && this.f13052a0.end_date == 0) {
            i11 = R.string.AffiliateProgramUpdateInfo;
        } else {
            i11 = R.string.AffiliateProgramStartInfo;
        }
        aa0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), new d(this, 2)));
        H0();
        f fVar = this.f13056e0;
        if (fVar != null) {
            fVar.O(z10);
        }
    }

    public final void H0() {
        boolean z10;
        TL_payments.starRefProgram starrefprogram;
        bi.v vVar = this.V;
        TL_payments.starRefProgram starrefprogram2 = this.f13052a0;
        if (starrefprogram2.end_date == 0 && ((starrefprogram = this.Z) == null || starrefprogram.commission_permille != starrefprogram2.commission_permille || starrefprogram.duration_months != starrefprogram2.duration_months)) {
            z10 = true;
        } else {
            z10 = false;
        }
        vVar.setEnabled(z10);
    }

    @Override
    public final View createView(Context context) {
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        f7.i(y6.f23448i5, new cc(this, context, 3), null);
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        ug.n nVar = new ug.n(context, 1, 3);
        this.T = nVar;
        ug.g gVar = nVar.f49851b;
        gVar.f49835z = y6.fk;
        gVar.A = y6.gk;
        gVar.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, kb1.h(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        f0(LocaleController.getString(R.string.BotAffiliateProgramTitle), LocaleController.getString(R.string.BotAffiliateProgramText), this.S, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        f7.i(y6.f23357d6, this.U, getResourceProvider());
        View view = new View(context);
        f7.i(y6.f23358d7, view, getResourceProvider());
        this.U.addView(view, new LinearLayout.LayoutParams(kb1.I(-1.0f), kb1.I(1.0f / AndroidUtilities.density)));
        bi.v vVar = new bi.v(2, context, this.resourceProvider, true);
        vVar.setRoundRadius(24);
        this.V = vVar;
        vVar.i(LocaleController.getString(R.string.AffiliateProgramStart), false, true);
        this.V.setOnClickListener(new bi.q(17, this, context));
        this.U.addView(this.V, kb1.o(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        aa0 aa0Var = new aa0(context, this.resourceProvider);
        this.W = aa0Var;
        f7.V(aa0Var, y6.f23768z6, getResourceProvider());
        f7.H(this.W, y6.gc, getResourceProvider());
        this.W.setTextSize(1, 12.0f);
        this.W.setGravity(17);
        this.U.addView(this.W, kb1.o(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        G0(false);
        ((FrameLayout) this.fragmentView).addView(this.U, kb1.i(-1, -2, 87));
        this.f39131c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f));
        this.f39131c.setOnItemClickListener(new ai.k(this, 13));
        s4.l lVar = new s4.l();
        lVar.f47798m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.f39131c.setItemAnimator(lVar);
        return this.fragmentView;
    }

    @Override
    public final s4.h0 g0() {
        f fVar = new f(this, this.f39131c, getParentActivity(), this.currentAccount, this.classGuid, new ai.e(this, 26), getResourceProvider());
        this.f13056e0 = fVar;
        return fVar;
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(y6.f23357d6);
    }

    @Override
    public final tg.x1 i0() {
        e eVar = new e(getParentActivity(), 0);
        eVar.c();
        return eVar;
    }

    @Override
    public final View k0(Context context) {
        throw null;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f13055d0 = true;
        this.Y = true;
        this.f13052a0 = E0();
        this.Z = null;
        MessagesController messagesController = getMessagesController();
        long j10 = this.R;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        if (userFull != null) {
            this.Y = false;
            TL_payments.starRefProgram starrefprogram = userFull.starref_program;
            this.f13052a0 = starrefprogram;
            if (starrefprogram == null) {
                this.Y = true;
                this.f13052a0 = E0();
                this.Z = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.Z = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.f13052a0;
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
        this.f13055d0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.X);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f39131c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f) + i13);
        this.f39131c.setClipToPadding(false);
        this.U.setPadding(0, 0, 0, i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        ug.n nVar = this.T;
        if (nVar != null) {
            nVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ug.n nVar = this.T;
        if (nVar != null) {
            nVar.setPaused(false);
            this.T.setDialogVisible(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
    }
}
