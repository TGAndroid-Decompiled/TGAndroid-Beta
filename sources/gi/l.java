package gi;

import ai.jc;
import ai.wd;
import ai.xa;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.zr;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b20;
import w7.z5;
public final class l extends b20 implements NotificationCenter.NotificationCenterDelegate {
    public final long R;
    public FrameLayout S;
    public tg.n T;
    public LinearLayout U;
    public ai.v V;
    public w90 W;
    public boolean Y;
    public TL_payments.starRefProgram Z;
    public TL_payments.starRefProgram f11328a0;
    public boolean f11331d0;
    public g f11332e0;
    public final e X = new e(this, 0);
    public String[] f11329b0 = null;
    public final List f11330c0 = Arrays.asList(1, 3, 6, 12, 24, 36, 0);

    public l(long j10) {
        this.R = j10;
        this.M = true;
        this.L = AndroidUtilities.dp(60.0f);
    }

    public static void A0(l lVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        long j10 = lVar.R;
        c2Var.dismiss();
        if (tLObject instanceof TL_payments.starRefProgram) {
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) tLObject;
            TLRPC.UserFull userFull = lVar.getMessagesController().getUserFull(j10);
            if (userFull != null) {
                TL_payments.starRefProgram starrefprogram2 = lVar.f11328a0;
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
            vc.d0(tL_error);
        }
    }

    public static void B0(l lVar, int i10) {
        g gVar = lVar.f11332e0;
        if (gVar != null) {
            int i11 = gVar.G(i10).d;
            if (i11 == 4) {
                LinearLayout linearLayout = new LinearLayout(lVar.getParentActivity());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
                TextView textView = new TextView(lVar.getParentActivity());
                textView.setTextSize(1, 16.0f);
                int i12 = k6.G6;
                r6.W(textView, i12, lVar.resourceProvider);
                org.telegram.messenger.v0.m(R.string.AffiliateProgramStopText, textView);
                linearLayout.addView(textView, z5.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                wd wdVar = new wd(lVar.getParentActivity(), 2);
                wdVar.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
                wdVar.setTextSize(1, 16.0f);
                r6.W(wdVar, i12, lVar.resourceProvider);
                wdVar.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText1)));
                linearLayout.addView(wdVar, z5.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                wd wdVar2 = new wd(lVar.getParentActivity(), 2);
                wdVar2.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
                wdVar2.setTextSize(1, 16.0f);
                r6.W(wdVar2, i12, lVar.resourceProvider);
                wdVar2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText2)));
                linearLayout.addView(wdVar2, z5.k(0.0f, 0.0f, 0.0f, 17.0f, -1, -2));
                wd wdVar3 = new wd(lVar.getParentActivity(), 2);
                wdVar3.setPadding(AndroidUtilities.dp(15.0f), 0, 0, 0);
                wdVar3.setTextSize(1, 16.0f);
                r6.W(wdVar3, i12, lVar.resourceProvider);
                wdVar3.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramStopText3)));
                linearLayout.addView(wdVar3, z5.k(0.0f, 0.0f, 0.0f, 10.0f, -1, -2));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getParentActivity(), 0, lVar.resourceProvider);
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.AffiliateProgramAlert);
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.AffiliateProgramStopButton), new e1.c(lVar, 11));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
            } else if (i11 == 2) {
                lVar.presentFragment(new s4(lVar.R));
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
        if (!lVar.V.f8862c0) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        n01 n01Var = new n01(context, lVar.resourceProvider);
        e eVar = new e(lVar, 1);
        n01Var.c(LocaleController.getString(R.string.AffiliateProgramCommission), H0(lVar.f11328a0.commission_permille), null, null);
        String string = LocaleController.getString(R.string.AffiliateProgramDuration);
        int i12 = lVar.f11328a0.duration_months;
        if (i12 <= 0) {
            formatPluralString = LocaleController.getString(R.string.Infinity);
        } else if (i12 >= 12 && i12 % 12 == 0) {
            formatPluralString = LocaleController.formatPluralString("Years", i12 / 12, new Object[0]);
        } else {
            formatPluralString = LocaleController.formatPluralString("Months", i12, new Object[0]);
        }
        n01Var.c(string, formatPluralString, null, null);
        frameLayout.addView(n01Var, z5.d(-1, -2.0f, 119, 24.0f, 0.0f, 24.0f, 0.0f));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, lVar.resourceProvider);
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.AffiliateProgramAlert);
        if (lVar.Y) {
            i10 = R.string.AffiliateProgramStartAlertText;
        } else {
            i10 = R.string.AffiliateProgramUpdateAlertText;
        }
        alertDialog$Builder.f20679a.T = LocaleController.getString(i10);
        alertDialog$Builder.o(frameLayout);
        if (lVar.Y) {
            i11 = R.string.AffiliateProgramStartAlertButton;
        } else {
            i11 = R.string.AffiliateProgramUpdateAlertButton;
        }
        alertDialog$Builder.k(LocaleController.getString(i11), new e1.c(eVar, 10));
        i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void z0(l lVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j10 = lVar.R;
        c2Var.dismiss();
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
            vc.d0(tL_error);
        }
    }

    public final void E0(boolean z10) {
        org.telegram.ui.ActionBar.o2 o2Var = null;
        if (getParentLayout() != null && getParentLayout().getFragmentStack() != null) {
            h5 parentLayout = getParentLayout();
            List fragmentStack = parentLayout.getFragmentStack();
            int size = fragmentStack.size() - 1;
            while (true) {
                if (size > 0) {
                    org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) fragmentStack.get(size);
                    if ((o2Var2 instanceof ProfileActivity) && ((ProfileActivity) o2Var2).a() == this.R) {
                        o2Var = o2Var2;
                        break;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            if (o2Var != null) {
                for (int size2 = fragmentStack.size() - 1; size2 > size; size2--) {
                    ((ActionBarLayout) parentLayout).b0((org.telegram.ui.ActionBar.o2) fragmentStack.get(size2), false);
                }
                finishFragment();
            } else {
                finishFragment();
                o2Var = parentLayout.getBackgroundFragment();
            }
        } else {
            finishFragment();
        }
        if (o2Var != null) {
            if (z10) {
                vc.a0(o2Var).M(LocaleController.getString(R.string.AffiliateProgramEndedTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.AffiliateProgramEndedText)), R.raw.linkbroken).j();
                return;
            }
            vc.a0(o2Var).M(LocaleController.getString(R.string.AffiliateProgramStartedTitle), LocaleController.getString(R.string.AffiliateProgramStartedText), R.raw.contact_check).j();
        }
    }

    public final void F0(ArrayList arrayList, a71 a71Var) {
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        l61 l61Var = new l61(-2);
        l61Var.f28221c = (jc) super.r0(getParentActivity());
        arrayList.add(l61Var);
        arrayList.add(j.a(R.drawable.menu_feature_premium, LocaleController.getString(R.string.BotAffiliateProgramFeature1Title), LocaleController.getString(R.string.BotAffiliateProgramFeature1)));
        arrayList.add(j.a(R.drawable.msg_channel, LocaleController.getString(R.string.BotAffiliateProgramFeature2Title), LocaleController.getString(R.string.BotAffiliateProgramFeature2)));
        arrayList.add(j.a(R.drawable.menu_feature_links2, LocaleController.getString(R.string.BotAffiliateProgramFeature3Title), LocaleController.getString(R.string.BotAffiliateProgramFeature3)));
        arrayList.add(l61.A(1, null));
        arrayList.add(l61.t(LocaleController.getString(R.string.AffiliateProgramCommission)));
        int i11 = getMessagesController().starrefMinCommissionPermille;
        int i12 = this.f11328a0.commission_permille;
        int i13 = getMessagesController().starrefMaxCommissionPermille;
        c cVar = new c(0);
        a aVar = new a(this, 1);
        l61 l61Var2 = new l61(15);
        l61Var2.f28240z = i12;
        l61Var2.C = aVar;
        x7 x7Var = new x7();
        x7Var.f23954a = i11;
        x7Var.f23955b = i13;
        x7Var.e = new ja(cVar, 7);
        l61Var2.G = x7Var;
        l61Var2.B = -1L;
        TL_payments.starRefProgram starrefprogram = this.Z;
        if (starrefprogram == null) {
            i10 = -1;
        } else {
            i10 = starrefprogram.commission_permille;
        }
        l61Var2.B = i10;
        arrayList.add(l61Var2);
        i2.o1.B(R.string.AffiliateProgramCommissionInfo, arrayList);
        i2.o1.q(R.string.AffiliateProgramDuration, arrayList);
        String[] strArr = this.f11329b0;
        List list = this.f11330c0;
        if (strArr == null) {
            this.f11329b0 = new String[list.size()];
            for (int i14 = 0; i14 < list.size(); i14++) {
                int intValue = ((Integer) list.get(i14)).intValue();
                if (intValue == 0) {
                    this.f11329b0[i14] = LocaleController.getString(R.string.Infinity);
                } else if (intValue >= 12 && intValue % 12 == 0) {
                    this.f11329b0[i14] = LocaleController.formatPluralString("YearsShort", intValue / 12, new Object[0]);
                } else {
                    this.f11329b0[i14] = LocaleController.formatPluralString("MonthsShort", intValue, new Object[0]);
                }
            }
        }
        String[] strArr2 = this.f11329b0;
        int indexOf = list.indexOf(Integer.valueOf(this.f11328a0.duration_months));
        a aVar2 = new a(this, 2);
        l61 l61Var3 = new l61(14);
        l61Var3.f28231p = strArr2;
        l61Var3.f28240z = indexOf;
        l61Var3.C = aVar2;
        l61Var3.B = -1L;
        TL_payments.starRefProgram starrefprogram2 = this.Z;
        if (starrefprogram2 != null) {
            if (starrefprogram2.duration_months <= 0) {
                l61Var3.B = list.size() - 1;
            } else {
                int size = list.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= this.Z.duration_months) {
                        l61Var3.B = size;
                        break;
                    }
                    size--;
                }
            }
        }
        arrayList.add(l61Var3);
        i2.o1.B(R.string.AffiliateProgramDurationInfo, arrayList);
        arrayList.add(h.a(2, getThemedColor(k6.uj), R.drawable.filled_earn_stars, LocaleController.getString(R.string.AffiliateProgramExistingProgramsTitle), LocaleController.getString(R.string.AffiliateProgramExistingProgramsText)));
        arrayList.add(l61.A(3, null));
        if (!this.Y && this.f11328a0.end_date == 0) {
            l61 e = l61.e(4, LocaleController.getString(R.string.AffiliateProgramStop));
            e.f28233r = true;
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
        ai.v vVar = this.V;
        if (!this.Y && this.f11328a0.end_date == 0) {
            i10 = R.string.AffiliateProgramUpdate;
        } else {
            i10 = R.string.AffiliateProgramStart;
        }
        vVar.i(LocaleController.getString(i10), z10, true);
        e eVar = this.X;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        eVar.run();
        w90 w90Var = this.W;
        if (!this.Y && this.f11328a0.end_date == 0) {
            i11 = R.string.AffiliateProgramUpdateInfo;
        } else {
            i11 = R.string.AffiliateProgramStartInfo;
        }
        w90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), new e(this, 2)));
        J0();
        g gVar = this.f11332e0;
        if (gVar != null) {
            gVar.N(z10);
        }
    }

    public final void J0() {
        boolean z10;
        TL_payments.starRefProgram starrefprogram;
        ai.v vVar = this.V;
        TL_payments.starRefProgram starrefprogram2 = this.f11328a0;
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
        r6.i(k6.f21272i5, new jc(this, context, 3), null);
        super.createView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        tg.n nVar = new tg.n(context, 1, 3);
        this.T = nVar;
        tg.g gVar = nVar.f47546b;
        gVar.f47530z = k6.fk;
        gVar.A = k6.gk;
        gVar.b();
        this.T.setStarParticlesView(this.e);
        this.S.addView(this.T, z5.d(190, 190.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.BotAffiliateProgramTitle), LocaleController.getString(R.string.BotAffiliateProgramText), this.S, null);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        r6.i(k6.f21184d6, this.U, getResourceProvider());
        View view = new View(context);
        r6.i(k6.f21185d7, view, getResourceProvider());
        this.U.addView(view, new LinearLayout.LayoutParams(z5.z(-1.0f), z5.z(1.0f / AndroidUtilities.density)));
        ai.v vVar = new ai.v(2, context, this.resourceProvider, true);
        vVar.setRoundRadius(24);
        this.V = vVar;
        vVar.i(LocaleController.getString(R.string.AffiliateProgramStart), false, true);
        this.V.setOnClickListener(new ai.p(17, this, context));
        this.U.addView(this.V, z5.k(10.0f, 10.0f, 10.0f, 7.0f, -1, 48));
        w90 w90Var = new w90(context, this.resourceProvider);
        this.W = w90Var;
        r6.W(w90Var, k6.f21589z6, getResourceProvider());
        r6.I(this.W, k6.f21243gc, getResourceProvider());
        this.W.setTextSize(1, 12.0f);
        this.W.setGravity(17);
        this.U.addView(this.W, z5.k(32.0f, 1.0f, 32.0f, 8.0f, -1, -2));
        I0(false);
        ((FrameLayout) this.fragmentView).addView(this.U, z5.e(-1, -2, 87));
        this.f35894c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f));
        this.f35894c.setOnItemClickListener(new xa(this, 12));
        s4.k kVar = new s4.k();
        kVar.f46376m = false;
        kVar.C = false;
        kVar.o(zr.h);
        kVar.n(350L);
        this.f35894c.setItemAnimator(kVar);
        return this.fragmentView;
    }

    @Override
    public final int getNavigationBarColor() {
        return getThemedColor(k6.f21184d6);
    }

    @Override
    public final s4.g0 n0() {
        g gVar = new g(this, this.f35894c, getParentActivity(), this.currentAccount, this.classGuid, new ai.q(this, 23), getResourceProvider());
        this.f11332e0 = gVar;
        return gVar;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f11331d0 = true;
        this.Y = true;
        this.f11328a0 = G0();
        this.Z = null;
        MessagesController messagesController = getMessagesController();
        long j10 = this.R;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        if (userFull != null) {
            this.Y = false;
            TL_payments.starRefProgram starrefprogram = userFull.starref_program;
            this.f11328a0 = starrefprogram;
            if (starrefprogram == null) {
                this.Y = true;
                this.f11328a0 = G0();
                this.Z = null;
            } else {
                TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                this.Z = starrefprogram2;
                TL_payments.starRefProgram starrefprogram3 = this.f11328a0;
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
        this.f11331d0 = false;
        AndroidUtilities.cancelRunOnUIThread(this.X);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35894c.setPadding(0, 0, 0, AndroidUtilities.dp(84.0f) + i13);
        this.f35894c.setClipToPadding(false);
        this.U.setPadding(0, 0, 0, i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        tg.n nVar = this.T;
        if (nVar != null) {
            nVar.setPaused(true);
            this.T.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        tg.n nVar = this.T;
        if (nVar != null) {
            nVar.setPaused(false);
            this.T.setDialogVisible(false);
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
