package hg;

import ai.n8;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zl0;
import w7.z5;
public final class g1 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public c71 f11202a;
    public sr f11203b;
    public org.telegram.ui.ActionBar.v0 f11204c;
    public boolean d;
    public boolean f11205e;
    public ArrayList[] f11206f;
    public ArrayList[] h;
    public String f11207n;
    public String f11208r;

    public g1() {
        super(null);
        this.f11206f = null;
        this.h = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void S(g1 g1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            g1Var.f11203b.a(0.0f);
            yc.b0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (g1Var.getParentActivity() != null) {
                g1Var.f11203b.a(0.0f);
                ok.p(R.string.UnknownError, yc.a0(g1Var), null);
            }
        } else if (!g1Var.isFinished && !g1Var.finishing) {
            g1Var.finishFragment();
        }
    }

    public static void T(g1 g1Var, ArrayList arrayList) {
        String string = LocaleController.getString(R.string.BusinessHours);
        String string2 = LocaleController.getString(R.string.BusinessHoursInfo);
        int i10 = R.raw.biz_clock;
        g61 g61Var = new g61(2);
        g61Var.f26668l = string;
        g61Var.f26671o = string2;
        g61Var.f26667k = i10;
        arrayList.add(g61Var);
        g61 i11 = g61.i(-1, LocaleController.getString(R.string.BusinessHoursShow));
        i11.K(g1Var.f11205e);
        arrayList.add(i11);
        arrayList.add(g61.A(-100, null));
        if (g1Var.f11205e) {
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessHours, arrayList);
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = g1Var.h;
                if (i12 < arrayListArr.length) {
                    if (arrayListArr[i12] == null) {
                        arrayListArr[i12] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
                    String Z = Z(g1Var.h[i12]);
                    g61 g61Var2 = new g61(5);
                    g61Var2.d = i12;
                    g61Var2.f26668l = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    g61Var2.f26669m = Z;
                    g61Var2.K(!g1Var.h[i12].isEmpty());
                    arrayList.add(g61Var2);
                    i12++;
                } else {
                    arrayList.add(g61.A(-101, null));
                    arrayList.add(g61.f(LocaleController.getString(R.string.BusinessHoursTimezone), f2.b(g1Var.currentAccount).d(g1Var.f11208r, false), -2));
                    arrayList.add(g61.A(-102, null));
                    return;
                }
            }
        }
    }

    public static void U(g1 g1Var, View view, String str) {
        f2 b10 = f2.b(g1Var.currentAccount);
        g1Var.f11208r = str;
        ((r8) view).u(b10.d(str, false), true);
        g1Var.X(true);
    }

    public static ArrayList[] Y(ArrayList arrayList) {
        int i10;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i11 = 0; i11 < 7; i11++) {
            arrayListArr[i11] = new ArrayList();
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i12);
            int i13 = tL_businessWeeklyOpen.start_minute;
            int i14 = i13 % 1440;
            arrayListArr[(i13 / 1440) % 7].add(new f1(i14, (tL_businessWeeklyOpen.end_minute - i13) + i14));
        }
        int i15 = 0;
        while (i15 < 7) {
            int i16 = i15 * 1440;
            int i17 = i15 + 1;
            int i18 = i17 * 1440;
            int i19 = i16;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i20);
                if (tL_businessWeeklyOpen2.start_minute <= i19 && (i10 = tL_businessWeeklyOpen2.end_minute) >= i19) {
                    i19 = i10 + 1;
                }
            }
            if (i19 >= i18) {
                int i21 = (i15 + 6) % 7;
                if (!arrayListArr[i21].isEmpty() && ((f1) k0.g(1, arrayListArr[i21])).f11191b >= 1440) {
                    ((f1) k0.g(1, arrayListArr[i21])).f11191b = 1439;
                }
                int min = Math.min((i19 - i16) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i15 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((f1) arrayList2.get(0)).f11190a < min - 1440) {
                    min = ((f1) arrayList2.get(0)).f11190a + 1439;
                }
                arrayListArr[i15].clear();
                arrayListArr[i15].add(new f1(0, min));
            } else {
                int i22 = i17 % 7;
                if (!arrayListArr[i15].isEmpty() && !arrayListArr[i22].isEmpty()) {
                    f1 f1Var = (f1) k0.g(1, arrayListArr[i15]);
                    f1 f1Var2 = (f1) arrayListArr[i22].get(0);
                    int i23 = f1Var.f11191b;
                    if (i23 > 1440 && i23 - 1439 == f1Var2.f11190a) {
                        f1Var.f11191b = 1439;
                        f1Var2.f11190a = 0;
                    }
                }
            }
            i15 = i17;
        }
        return arrayListArr;
    }

    public static String Z(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return LocaleController.getString(R.string.BusinessHoursDayClosed);
        }
        if (c0(arrayList)) {
            return LocaleController.getString(R.string.BusinessHoursDayFullOpened);
        }
        String str = "";
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            f1 f1Var = (f1) arrayList.get(i10);
            if (i10 > 0) {
                str = t8.b.v(str, "\n");
            }
            StringBuilder u10 = a4.a.u(str);
            u10.append(f1.a(f1Var.f11190a));
            u10.append(" - ");
            u10.append(f1.a(f1Var.f11191b));
            str = u10.toString();
        }
        return str;
    }

    public static boolean c0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            f1 f1Var = (f1) arrayList.get(i11);
            if (i10 < f1Var.f11190a) {
                return false;
            }
            i10 = f1Var.f11191b;
        }
        if (i10 != 1439 && i10 != 1440) {
            return false;
        }
        return true;
    }

    public static String f0(int i10, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        int i11;
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] Y = Y(tL_businessWorkHours.weekly_open);
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(LocaleController.formatString(R.string.BusinessHoursCopyHeader, UserObject.getUserName(user)));
            sb2.append("\n");
        }
        for (int i12 = 0; i12 < 7; i12++) {
            ArrayList arrayList = Y[i12];
            String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (c0(arrayList)) {
                sb2.append(LocaleController.getString(R.string.BusinessHoursProfileOpen));
            } else if (arrayList.isEmpty()) {
                sb2.append(LocaleController.getString(R.string.BusinessHoursProfileClose));
            } else {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (i13 > 0) {
                        sb2.append(", ");
                    }
                    f1 f1Var = (f1) arrayList.get(i13);
                    sb2.append(f1.a(f1Var.f11190a));
                    sb2.append(" - ");
                    sb2.append(f1.a(f1Var.f11191b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a2 = f2.b(i10).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a2 == null) {
            i11 = 0;
        } else {
            i11 = a2.utc_offset;
        }
        if ((rawOffset - i11) / 60 != 0 && a2 != null) {
            int i14 = R.string.BusinessHoursCopyFooter;
            f2.b(i10);
            sb2.append(LocaleController.formatString(i14, f2.e(a2, true)));
        }
        return sb2.toString();
    }

    public final void W(int i10) {
        f1 f1Var;
        f1 f1Var2 = null;
        if (this.h[i10].isEmpty()) {
            f1Var = null;
        } else {
            f1Var = (f1) k0.g(1, this.h[i10]);
        }
        if (f1Var != null) {
            int i11 = (i10 + 6) % 7;
            if (!this.h[i11].isEmpty()) {
                f1Var2 = (f1) k0.g(1, this.h[i11]);
            }
            if (f1Var2 != null && f1Var2.f11191b > 1439) {
                f1Var2.f11191b = 1439;
                if (f1Var2.f11190a >= 1439) {
                    this.h[i11].remove(f1Var2);
                }
                View A1 = this.f11202a.A1(i11);
                if (A1 instanceof j5) {
                    ((j5) A1).setValue(Z(this.h[i11]));
                } else {
                    this.f11202a.f25244f3.N(true);
                }
            }
        }
    }

    public final void X(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f11204c == null) {
            return;
        }
        boolean b02 = b0();
        this.f11204c.setEnabled(b02);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f11204c.animate();
            if (b02) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (b02) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (b02) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.f11204c;
        if (b02) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f11204c;
        if (b02) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f11204c;
        if (b02) {
            f13 = 1.0f;
        }
        v0Var3.setScaleY(f13);
    }

    public final boolean b0() {
        throw new UnsupportedOperationException("Method not decompiled: hg.g1.b0():boolean");
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 14));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = i6.f21154v8;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f11203b = new sr(mutate, new wp(i6.w0(null, i10, false)));
        this.f11204c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11203b);
        X(false);
        FrameLayout frameLayout = new FrameLayout(context);
        c71 c71Var = new c71(this, new bi.v(this, 27), new ei.f(this, 4), null);
        this.f11202a = c71Var;
        c71Var.s1();
        c71 c71Var2 = this.f11202a;
        c71Var2.f25244f3.f31306r = false;
        c71Var2.setSectionsDrawBackground(true);
        frameLayout.addView(this.f11202a, z5.c(-1.0f, -1));
        e0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        if (this.f11203b.f30863c > 0.0f) {
            return;
        }
        if (!b0()) {
            finishFragment();
            return;
        }
        this.f11203b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.h;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i10 = 0; i10 < arrayListArr.length; i10++) {
                if (arrayListArr[i10] != null) {
                    for (int i11 = 0; i11 < arrayListArr[i10].size(); i11++) {
                        f1 f1Var = (f1) arrayListArr[i10].get(i11);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i12 = i10 * 1440;
                        tL_businessWeeklyOpen.start_minute = f1Var.f11190a + i12;
                        tL_businessWeeklyOpen.end_minute = i12 + f1Var.f11191b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.f11205e && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f11208r;
            tL_businessWorkHours.weekly_open.addAll(arrayList);
            updatebusinessworkhours.flags |= 1;
            updatebusinessworkhours.business_work_hours = tL_businessWorkHours;
            if (userFull != null) {
                userFull.flags2 |= 1;
                userFull.business_work_hours = tL_businessWorkHours;
            }
        } else if (userFull != null) {
            userFull.flags2 &= -2;
            userFull.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new n8(this, 14));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            e0();
        } else if (i10 == NotificationCenter.timezonesUpdated) {
            if (this.f11206f == null) {
                this.f11208r = f2.b(this.currentAccount).c();
            }
            c71 c71Var = this.f11202a;
            if (c71Var != null && (u61Var = c71Var.f25244f3) != null) {
                u61Var.N(true);
            }
        }
    }

    public final void e0() {
        boolean z10;
        u61 u61Var;
        if (this.d) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = userFull.business_work_hours;
        if (tL_businessWorkHours != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11205e = z10;
        if (z10) {
            String str = tL_businessWorkHours.timezone_id;
            this.f11208r = str;
            this.f11207n = str;
            this.f11206f = Y(tL_businessWorkHours.weekly_open);
            this.h = Y(userFull.business_work_hours.weekly_open);
        } else {
            String c10 = f2.b(this.currentAccount).c();
            this.f11208r = c10;
            this.f11207n = c10;
            this.f11206f = null;
            this.h = new ArrayList[7];
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.h;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i10] = new ArrayList();
                if (i10 >= 0 && i10 < 5) {
                    this.h[i10].add(new f1(0, 1439));
                }
                i10++;
            }
        }
        c71 c71Var = this.f11202a;
        if (c71Var != null && (u61Var = c71Var.f25244f3) != null) {
            u61Var.N(true);
        }
        X(false);
        this.d = true;
    }

    @Override
    public final zl0 getListViewForSimpleGlass() {
        return this.f11202a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        f2.b(this.currentAccount).g();
        this.f11208r = f2.b(this.currentAccount).c();
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
        d0();
    }
}
