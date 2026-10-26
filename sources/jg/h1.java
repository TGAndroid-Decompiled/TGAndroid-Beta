package jg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Cells.n5;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;
public final class h1 extends r2 implements NotificationCenter.NotificationCenterDelegate {
    public r71 f15721a;
    public u5 f15722b;
    public boolean f15723c;
    public boolean d;
    public ArrayList[] e;
    public ArrayList[] f15724f;
    public String h;
    public String f15725n;

    public h1() {
        super(null);
        this.e = null;
        this.f15724f = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void V(h1 h1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            h1Var.f15722b.b(false);
            wc.e0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (h1Var.getParentActivity() != null) {
                h1Var.f15722b.b(false);
                vh.n(R.string.UnknownError, wc.b0(h1Var), null);
            }
        } else if (!h1Var.isFinished && !h1Var.finishing) {
            h1Var.finishFragment();
        }
    }

    public static void W(h1 h1Var, ArrayList arrayList) {
        String string = LocaleController.getString(R.string.BusinessHours);
        String string2 = LocaleController.getString(R.string.BusinessHoursInfo);
        int i10 = R.raw.biz_clock;
        t61 t61Var = new t61(2);
        t61Var.f32875l = string;
        t61Var.f32878o = string2;
        t61Var.f32874k = i10;
        arrayList.add(t61Var);
        t61 i11 = t61.i(-1, LocaleController.getString(R.string.BusinessHoursShow));
        i11.L(h1Var.d);
        arrayList.add(i11);
        arrayList.add(t61.B(-100, null));
        if (h1Var.d) {
            ic.a.p(R.string.BusinessHours, arrayList);
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = h1Var.f15724f;
                if (i12 < arrayListArr.length) {
                    if (arrayListArr[i12] == null) {
                        arrayListArr[i12] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
                    String b02 = b0(h1Var.f15724f[i12]);
                    t61 t61Var2 = new t61(5);
                    t61Var2.d = i12;
                    t61Var2.f32875l = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    t61Var2.f32876m = b02;
                    t61Var2.L(!h1Var.f15724f[i12].isEmpty());
                    arrayList.add(t61Var2);
                    i12++;
                } else {
                    arrayList.add(t61.B(-101, null));
                    arrayList.add(t61.f(LocaleController.getString(R.string.BusinessHoursTimezone), g2.b(h1Var.currentAccount).d(h1Var.f15725n, false), -2));
                    arrayList.add(t61.B(-102, null));
                    return;
                }
            }
        }
    }

    public static void X(h1 h1Var, View view, String str) {
        g2 b10 = g2.b(h1Var.currentAccount);
        h1Var.f15725n = str;
        ((v8) view).w(b10.d(str, false), true);
        h1Var.Z(true);
    }

    public static ArrayList[] a0(ArrayList arrayList) {
        int i10;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i11 = 0; i11 < 7; i11++) {
            arrayListArr[i11] = new ArrayList();
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i12);
            int i13 = tL_businessWeeklyOpen.start_minute;
            int i14 = i13 % 1440;
            arrayListArr[(i13 / 1440) % 7].add(new g1(i14, (tL_businessWeeklyOpen.end_minute - i13) + i14));
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
                if (!arrayListArr[i21].isEmpty() && ((g1) ic.a.g(1, arrayListArr[i21])).f15714b >= 1440) {
                    ((g1) ic.a.g(1, arrayListArr[i21])).f15714b = 1439;
                }
                int min = Math.min((i19 - i16) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i15 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((g1) arrayList2.get(0)).f15713a < min - 1440) {
                    min = ((g1) arrayList2.get(0)).f15713a + 1439;
                }
                arrayListArr[i15].clear();
                arrayListArr[i15].add(new g1(0, min));
            } else {
                int i22 = i17 % 7;
                if (!arrayListArr[i15].isEmpty() && !arrayListArr[i22].isEmpty()) {
                    g1 g1Var = (g1) ic.a.g(1, arrayListArr[i15]);
                    g1 g1Var2 = (g1) arrayListArr[i22].get(0);
                    int i23 = g1Var.f15714b;
                    if (i23 > 1440 && i23 - 1439 == g1Var2.f15713a) {
                        g1Var.f15714b = 1439;
                        g1Var2.f15713a = 0;
                    }
                }
            }
            i15 = i17;
        }
        return arrayListArr;
    }

    public static String b0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return LocaleController.getString(R.string.BusinessHoursDayClosed);
        }
        if (d0(arrayList)) {
            return LocaleController.getString(R.string.BusinessHoursDayFullOpened);
        }
        String str = "";
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            g1 g1Var = (g1) arrayList.get(i10);
            if (i10 > 0) {
                str = b10.u(str, "\n");
            }
            StringBuilder u10 = a1.g.u(str);
            u10.append(g1.a(g1Var.f15713a));
            u10.append(" - ");
            u10.append(g1.a(g1Var.f15714b));
            str = u10.toString();
        }
        return str;
    }

    public static boolean d0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            g1 g1Var = (g1) arrayList.get(i11);
            if (i10 < g1Var.f15713a) {
                return false;
            }
            i10 = g1Var.f15714b;
        }
        if (i10 != 1439 && i10 != 1440) {
            return false;
        }
        return true;
    }

    public static String g0(int i10, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        int i11;
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] a02 = a0(tL_businessWorkHours.weekly_open);
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(LocaleController.formatString(R.string.BusinessHoursCopyHeader, UserObject.getUserName(user)));
            sb2.append("\n");
        }
        for (int i12 = 0; i12 < 7; i12++) {
            ArrayList arrayList = a02[i12];
            String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (d0(arrayList)) {
                sb2.append(LocaleController.getString(R.string.BusinessHoursProfileOpen));
            } else if (arrayList.isEmpty()) {
                sb2.append(LocaleController.getString(R.string.BusinessHoursProfileClose));
            } else {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (i13 > 0) {
                        sb2.append(", ");
                    }
                    g1 g1Var = (g1) arrayList.get(i13);
                    sb2.append(g1.a(g1Var.f15713a));
                    sb2.append(" - ");
                    sb2.append(g1.a(g1Var.f15714b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a2 = g2.b(i10).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a2 == null) {
            i11 = 0;
        } else {
            i11 = a2.utc_offset;
        }
        if ((rawOffset - i11) / 60 != 0 && a2 != null) {
            int i14 = R.string.BusinessHoursCopyFooter;
            g2.b(i10);
            sb2.append(LocaleController.formatString(i14, g2.e(a2, true)));
        }
        return sb2.toString();
    }

    public final void Y(int i10) {
        g1 g1Var;
        g1 g1Var2 = null;
        if (this.f15724f[i10].isEmpty()) {
            g1Var = null;
        } else {
            g1Var = (g1) ic.a.g(1, this.f15724f[i10]);
        }
        if (g1Var != null) {
            int i11 = (i10 + 6) % 7;
            if (!this.f15724f[i11].isEmpty()) {
                g1Var2 = (g1) ic.a.g(1, this.f15724f[i11]);
            }
            if (g1Var2 != null && g1Var2.f15714b > 1439) {
                g1Var2.f15714b = 1439;
                if (g1Var2.f15713a >= 1439) {
                    this.f15724f[i11].remove(g1Var2);
                }
                View E1 = this.f15721a.E1(i11);
                if (E1 instanceof n5) {
                    ((n5) E1).setValue(b0(this.f15724f[i11]));
                } else {
                    this.f15721a.f32152g3.O(true);
                }
            }
        }
    }

    public final void Z(boolean z10) {
        if (this.f15722b == null) {
            return;
        }
        this.f15722b.a(c0(), z10);
    }

    public final boolean c0() {
        throw new UnsupportedOperationException("Method not decompiled: jg.h1.c0():boolean");
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 16));
        this.f15722b = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        r71 r71Var = new r71(this, new hi.e2(this, 11), new e1(this, 0), null);
        this.f15721a = r71Var;
        r71Var.u1();
        r71 r71Var2 = this.f15721a;
        r71Var2.f32152g3.f29507r = false;
        r71Var2.setSectionsDrawBackground(true);
        frameLayout.addView(this.f15721a, gb1.g(-1.0f, -1));
        f0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j71 j71Var;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            f0();
        } else if (i10 == NotificationCenter.timezonesUpdated) {
            if (this.e == null) {
                this.f15725n = g2.b(this.currentAccount).c();
            }
            r71 r71Var = this.f15721a;
            if (r71Var != null && (j71Var = r71Var.f32152g3) != null) {
                j71Var.O(true);
            }
        }
    }

    public final void e0() {
        if (this.f15722b.f23139x.f19327f) {
            return;
        }
        if (!c0()) {
            finishFragment();
            return;
        }
        this.f15722b.b(true);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.f15724f;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i10 = 0; i10 < arrayListArr.length; i10++) {
                if (arrayListArr[i10] != null) {
                    for (int i11 = 0; i11 < arrayListArr[i10].size(); i11++) {
                        g1 g1Var = (g1) arrayListArr[i10].get(i11);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i12 = i10 * 1440;
                        tL_businessWeeklyOpen.start_minute = g1Var.f15713a + i12;
                        tL_businessWeeklyOpen.end_minute = i12 + g1Var.f15714b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.d && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f15725n;
            tL_businessWorkHours.weekly_open.addAll(arrayList);
            updatebusinessworkhours.flags |= 1;
            updatebusinessworkhours.business_work_hours = tL_businessWorkHours;
            if (userFull != null) {
                userFull.flags2 = 1 | userFull.flags2;
                userFull.business_work_hours = tL_businessWorkHours;
            }
        } else if (userFull != null) {
            userFull.flags2 &= -2;
            userFull.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new bi.i0(this, 19));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public final void f0() {
        boolean z10;
        j71 j71Var;
        if (this.f15723c) {
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
        this.d = z10;
        if (z10) {
            String str = tL_businessWorkHours.timezone_id;
            this.f15725n = str;
            this.h = str;
            this.e = a0(tL_businessWorkHours.weekly_open);
            this.f15724f = a0(userFull.business_work_hours.weekly_open);
        } else {
            String c10 = g2.b(this.currentAccount).c();
            this.f15725n = c10;
            this.h = c10;
            this.e = null;
            this.f15724f = new ArrayList[7];
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f15724f;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i10] = new ArrayList();
                if (i10 >= 0 && i10 < 5) {
                    this.f15724f[i10].add(new g1(0, 1439));
                }
                i10++;
            }
        }
        r71 r71Var = this.f15721a;
        if (r71Var != null && (j71Var = r71Var.f32152g3) != null) {
            j71Var.O(true);
        }
        Z(false);
        this.f15723c = true;
    }

    @Override
    public final mm0 getListViewForSimpleGlass() {
        return this.f15721a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        g2.b(this.currentAccount).g();
        this.f15725n = g2.b(this.currentAccount).c();
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
        e0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
