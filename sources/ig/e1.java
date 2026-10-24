package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.tl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.yr;
import w7.z5;
public final class e1 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public i71 f12910a;
    public yr f12911b;
    public cq f12912c;
    public org.telegram.ui.ActionBar.u0 d;
    public boolean e;
    public boolean f12913f;
    public ArrayList[] h;
    public ArrayList[] f12914n;
    public String f12915r;
    public String f12916s;

    public e1() {
        super(null);
        this.h = null;
        this.f12914n = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void U(e1 e1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            e1Var.f12911b.a(0.0f);
            vc.d0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (e1Var.getParentActivity() != null) {
                e1Var.f12911b.a(0.0f);
                tl.q(R.string.UnknownError, vc.a0(e1Var), null);
            }
        } else if (!e1Var.isFinished && !e1Var.finishing) {
            e1Var.finishFragment();
        }
    }

    public static void V(e1 e1Var, ArrayList arrayList) {
        String string = LocaleController.getString(R.string.BusinessHours);
        String string2 = LocaleController.getString(R.string.BusinessHoursInfo);
        int i10 = R.raw.biz_clock;
        l61 l61Var = new l61(2);
        l61Var.f28227l = string;
        l61Var.f28230o = string2;
        l61Var.f28226k = i10;
        arrayList.add(l61Var);
        l61 i11 = l61.i(-1, LocaleController.getString(R.string.BusinessHoursShow));
        i11.K(e1Var.f12913f);
        arrayList.add(i11);
        arrayList.add(l61.A(-100, null));
        if (e1Var.f12913f) {
            i2.o1.q(R.string.BusinessHours, arrayList);
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = e1Var.f12914n;
                if (i12 < arrayListArr.length) {
                    if (arrayListArr[i12] == null) {
                        arrayListArr[i12] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
                    String a02 = a0(e1Var.f12914n[i12]);
                    l61 l61Var2 = new l61(5);
                    l61Var2.d = i12;
                    l61Var2.f28227l = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    l61Var2.f28228m = a02;
                    l61Var2.K(!e1Var.f12914n[i12].isEmpty());
                    arrayList.add(l61Var2);
                    i12++;
                } else {
                    arrayList.add(l61.A(-101, null));
                    arrayList.add(l61.f(LocaleController.getString(R.string.BusinessHoursTimezone), e2.b(e1Var.currentAccount).d(e1Var.f12916s, false), -2));
                    arrayList.add(l61.A(-102, null));
                    return;
                }
            }
        }
    }

    public static void W(e1 e1Var, View view, String str) {
        e2 b10 = e2.b(e1Var.currentAccount);
        e1Var.f12916s = str;
        ((r8) view).w(b10.d(str, false), true);
        e1Var.Y(true);
    }

    public static ArrayList[] Z(ArrayList arrayList) {
        int i10;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i11 = 0; i11 < 7; i11++) {
            arrayListArr[i11] = new ArrayList();
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i12);
            int i13 = tL_businessWeeklyOpen.start_minute;
            int i14 = i13 % 1440;
            arrayListArr[(i13 / 1440) % 7].add(new d1(i14, (tL_businessWeeklyOpen.end_minute - i13) + i14));
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
                if (!arrayListArr[i21].isEmpty() && ((d1) i2.o1.i(1, arrayListArr[i21])).f12893b >= 1440) {
                    ((d1) i2.o1.i(1, arrayListArr[i21])).f12893b = 1439;
                }
                int min = Math.min((i19 - i16) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i15 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((d1) arrayList2.get(0)).f12892a < min - 1440) {
                    min = ((d1) arrayList2.get(0)).f12892a + 1439;
                }
                arrayListArr[i15].clear();
                arrayListArr[i15].add(new d1(0, min));
            } else {
                int i22 = i17 % 7;
                if (!arrayListArr[i15].isEmpty() && !arrayListArr[i22].isEmpty()) {
                    d1 d1Var = (d1) i2.o1.i(1, arrayListArr[i15]);
                    d1 d1Var2 = (d1) arrayListArr[i22].get(0);
                    int i23 = d1Var.f12893b;
                    if (i23 > 1440 && i23 - 1439 == d1Var2.f12892a) {
                        d1Var.f12893b = 1439;
                        d1Var2.f12892a = 0;
                    }
                }
            }
            i15 = i17;
        }
        return arrayListArr;
    }

    public static String a0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return LocaleController.getString(R.string.BusinessHoursDayClosed);
        }
        if (c0(arrayList)) {
            return LocaleController.getString(R.string.BusinessHoursDayFullOpened);
        }
        String str = "";
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            d1 d1Var = (d1) arrayList.get(i10);
            if (i10 > 0) {
                str = si.o0.u(str, "\n");
            }
            StringBuilder u10 = a1.g.u(str);
            u10.append(d1.a(d1Var.f12892a));
            u10.append(" - ");
            u10.append(d1.a(d1Var.f12893b));
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
            d1 d1Var = (d1) arrayList.get(i11);
            if (i10 < d1Var.f12892a) {
                return false;
            }
            i10 = d1Var.f12893b;
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
        ArrayList[] Z = Z(tL_businessWorkHours.weekly_open);
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(LocaleController.formatString(R.string.BusinessHoursCopyHeader, UserObject.getUserName(user)));
            sb2.append("\n");
        }
        for (int i12 = 0; i12 < 7; i12++) {
            ArrayList arrayList = Z[i12];
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
                    d1 d1Var = (d1) arrayList.get(i13);
                    sb2.append(d1.a(d1Var.f12892a));
                    sb2.append(" - ");
                    sb2.append(d1.a(d1Var.f12893b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a2 = e2.b(i10).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a2 == null) {
            i11 = 0;
        } else {
            i11 = a2.utc_offset;
        }
        if ((rawOffset - i11) / 60 != 0 && a2 != null) {
            int i14 = R.string.BusinessHoursCopyFooter;
            e2.b(i10);
            sb2.append(LocaleController.formatString(i14, e2.e(a2, true)));
        }
        return sb2.toString();
    }

    public final void X(int i10) {
        d1 d1Var;
        d1 d1Var2 = null;
        if (this.f12914n[i10].isEmpty()) {
            d1Var = null;
        } else {
            d1Var = (d1) i2.o1.i(1, this.f12914n[i10]);
        }
        if (d1Var != null) {
            int i11 = (i10 + 6) % 7;
            if (!this.f12914n[i11].isEmpty()) {
                d1Var2 = (d1) i2.o1.i(1, this.f12914n[i11]);
            }
            if (d1Var2 != null && d1Var2.f12893b > 1439) {
                d1Var2.f12893b = 1439;
                if (d1Var2.f12892a >= 1439) {
                    this.f12914n[i11].remove(d1Var2);
                }
                View E1 = this.f12910a.E1(i11);
                if (E1 instanceof i5) {
                    ((i5) E1).setValue(a0(this.f12914n[i11]));
                } else {
                    this.f12910a.Z2.N(true);
                }
            }
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
        boolean b02 = b0();
        this.d.setEnabled(b02);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.d.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.d;
        if (b02) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.d;
        if (b02) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.d;
        if (b02) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean b0() {
        throw new UnsupportedOperationException("Method not decompiled: ig.e1.b0():boolean");
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 16));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = k6.f21519v8;
        r6.z(kVar, mutate, i10, null, PorterDuff.Mode.MULTIPLY);
        cq cqVar = new cq(k6.x0(null, i10, false));
        this.f12912c = cqVar;
        this.f12911b = new yr(mutate, cqVar);
        this.d = this.actionBar.m().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f12911b);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.f21126a7, frameLayout, null);
        i71 i71Var = new i71(this, new hg.o(this, 8), new e1.c(this, 20), null);
        this.f12910a = i71Var;
        i71Var.t1();
        i71 i71Var2 = this.f12910a;
        i71Var2.Z2.f24646r = false;
        frameLayout.addView(i71Var2, z5.c(-1.0f, -1));
        this.actionBar.z(this.f12910a, true);
        e0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        if (this.f12911b.f33027c > 0.0f) {
            return;
        }
        if (!b0()) {
            finishFragment();
            return;
        }
        this.f12911b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.f12914n;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i10 = 0; i10 < arrayListArr.length; i10++) {
                if (arrayListArr[i10] != null) {
                    for (int i11 = 0; i11 < arrayListArr[i10].size(); i11++) {
                        d1 d1Var = (d1) arrayListArr[i10].get(i11);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i12 = i10 * 1440;
                        tL_businessWeeklyOpen.start_minute = d1Var.f12892a + i12;
                        tL_businessWeeklyOpen.end_minute = i12 + d1Var.f12893b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.f12913f && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f12916s;
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
        getConnectionsManager().sendRequest(updatebusinessworkhours, new ai.h(this, 20));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            e0();
        } else if (i10 == NotificationCenter.timezonesUpdated) {
            if (this.h == null) {
                this.f12916s = e2.b(this.currentAccount).c();
            }
            i71 i71Var = this.f12910a;
            if (i71Var != null && (a71Var = i71Var.Z2) != null) {
                a71Var.N(true);
            }
        }
    }

    public final void e0() {
        boolean z10;
        a71 a71Var;
        if (this.e) {
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
        this.f12913f = z10;
        if (z10) {
            String str = tL_businessWorkHours.timezone_id;
            this.f12916s = str;
            this.f12915r = str;
            this.h = Z(tL_businessWorkHours.weekly_open);
            this.f12914n = Z(userFull.business_work_hours.weekly_open);
        } else {
            String c10 = e2.b(this.currentAccount).c();
            this.f12916s = c10;
            this.f12915r = c10;
            this.h = null;
            this.f12914n = new ArrayList[7];
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f12914n;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i10] = new ArrayList();
                if (i10 >= 0 && i10 < 5) {
                    this.f12914n[i10].add(new d1(0, 1439));
                }
                i10++;
            }
        }
        i71 i71Var = this.f12910a;
        if (i71Var != null && (a71Var = i71Var.Z2) != null) {
            a71Var.N(true);
        }
        Y(false);
        this.e = true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        e2.b(this.currentAccount).g();
        this.f12916s = e2.b(this.currentAccount).c();
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
        d0();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f12910a.setPadding(0, 0, 0, i13);
        this.f12910a.setClipToPadding(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            cq cqVar = this.f12912c;
            if (cqVar != null) {
                cqVar.b(k6.x0(null, k6.f21519v8, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
