package ag;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.m5;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import w7.b6;
public final class h2 extends org.telegram.ui.ActionBar.k2 implements us {
    public u51 f546a;
    public l5 f547b;
    public boolean f548c;
    public boolean d;
    public ArrayList[] e;
    public ArrayList[] f549f;
    public String h;
    public String f550n;

    public h2() {
        super(null);
        this.e = null;
        this.f549f = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void Y(h2 h2Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            h2Var.f547b.b(false);
            cc.d0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (h2Var.getParentActivity() != null) {
                h2Var.f547b.b(false);
                m5.o(null, 2131743904, cc.a0(h2Var), null);
            }
        } else if (!h2Var.isFinished && !h2Var.finishing) {
            h2Var.finishFragment();
        }
    }

    public static void Z(h2 h2Var, ArrayList arrayList) {
        String L0 = cd.L0(2131752764, null);
        String L02 = cd.L0(2131752749, null);
        a51 a51Var = new a51(2);
        a51Var.f24292l = L0;
        a51Var.f24295o = L02;
        a51Var.f24291k = 2131623939;
        arrayList.add(a51Var);
        a51 i10 = a51.i(-1, cd.L0(2131752729, null));
        i10.L(h2Var.d);
        arrayList.add(i10);
        arrayList.add(a51.B(-100, null));
        if (h2Var.d) {
            arrayList.add(a51.u(cd.L0(2131752764, null)));
            int i11 = 0;
            while (true) {
                ArrayList[] arrayListArr = h2Var.f549f;
                if (i11 < arrayListArr.length) {
                    if (arrayListArr[i11] == null) {
                        arrayListArr[i11] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i11].getDisplayName(TextStyle.FULL, cd.D0().f15003y);
                    String e02 = e0(h2Var.f549f[i11]);
                    a51 a51Var2 = new a51(5);
                    a51Var2.d = i11;
                    a51Var2.f24292l = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    a51Var2.f24293m = e02;
                    a51Var2.L(!h2Var.f549f[i11].isEmpty());
                    arrayList.add(a51Var2);
                    i11++;
                } else {
                    arrayList.add(a51.B(-101, null));
                    arrayList.add(a51.f(cd.L0(2131752728, null), n3.b(h2Var.currentAccount).d(h2Var.f550n, false), -2));
                    arrayList.add(a51.B(-102, null));
                    return;
                }
            }
        }
    }

    public static void a0(h2 h2Var, View view, String str) {
        n3 b10 = n3.b(h2Var.currentAccount);
        h2Var.f550n = str;
        ((p8) view).w(b10.d(str, false), true);
        h2Var.c0(true);
    }

    public static ArrayList[] d0(ArrayList arrayList) {
        int i10;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i11 = 0; i11 < 7; i11++) {
            arrayListArr[i11] = new ArrayList();
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i12);
            int i13 = tL_businessWeeklyOpen.start_minute;
            int i14 = i13 % 1440;
            arrayListArr[(i13 / 1440) % 7].add(new g2(i14, (tL_businessWeeklyOpen.end_minute - i13) + i14));
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
                if (!arrayListArr[i21].isEmpty() && ((g2) i0.a.g(1, arrayListArr[i21])).f533b >= 1440) {
                    ((g2) i0.a.g(1, arrayListArr[i21])).f533b = 1439;
                }
                int min = Math.min((i19 - i16) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i15 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((g2) arrayList2.get(0)).f532a < min - 1440) {
                    min = ((g2) arrayList2.get(0)).f532a + 1439;
                }
                arrayListArr[i15].clear();
                arrayListArr[i15].add(new g2(0, min));
            } else {
                int i22 = i17 % 7;
                if (!arrayListArr[i15].isEmpty() && !arrayListArr[i22].isEmpty()) {
                    g2 g2Var = (g2) i0.a.g(1, arrayListArr[i15]);
                    g2 g2Var2 = (g2) arrayListArr[i22].get(0);
                    int i23 = g2Var.f533b;
                    if (i23 > 1440 && i23 - 1439 == g2Var2.f532a) {
                        g2Var.f533b = 1439;
                        g2Var2.f532a = 0;
                    }
                }
            }
            i15 = i17;
        }
        return arrayListArr;
    }

    public static String e0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return cd.L0(2131752755, null);
        }
        if (g0(arrayList)) {
            return cd.L0(2131752754, null);
        }
        String str = "";
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            g2 g2Var = (g2) arrayList.get(i10);
            if (i10 > 0) {
                str = sc.e.A(str, "\n");
            }
            StringBuilder t10 = a1.g.t(str);
            t10.append(g2.a(g2Var.f532a));
            t10.append(" - ");
            t10.append(g2.a(g2Var.f533b));
            str = t10.toString();
        }
        return str;
    }

    public static boolean g0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            g2 g2Var = (g2) arrayList.get(i11);
            if (i10 < g2Var.f532a) {
                return false;
            }
            i10 = g2Var.f533b;
        }
        if (i10 != 1439 && i10 != 1440) {
            return false;
        }
        return true;
    }

    public static String j0(int i10, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        int i11;
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] d02 = d0(tL_businessWorkHours.weekly_open);
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(cd.a0(null, null, 2131752759, h20.p(user)));
            sb2.append("\n");
        }
        for (int i12 = 0; i12 < 7; i12++) {
            ArrayList arrayList = d02[i12];
            String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, cd.D0().f15003y);
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (g0(arrayList)) {
                sb2.append(cd.L0(2131752741, null));
            } else if (arrayList.isEmpty()) {
                sb2.append(cd.L0(2131752745, null));
            } else {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (i13 > 0) {
                        sb2.append(", ");
                    }
                    g2 g2Var = (g2) arrayList.get(i13);
                    sb2.append(g2.a(g2Var.f532a));
                    sb2.append(" - ");
                    sb2.append(g2.a(g2Var.f533b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a2 = n3.b(i10).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a2 == null) {
            i11 = 0;
        } else {
            i11 = a2.utc_offset;
        }
        if ((rawOffset - i11) / 60 != 0 && a2 != null) {
            n3.b(i10);
            sb2.append(cd.a0(null, null, 2131752760, n3.e(a2, true)));
        }
        return sb2.toString();
    }

    public final void b0(int i10) {
        g2 g2Var;
        g2 g2Var2 = null;
        if (this.f549f[i10].isEmpty()) {
            g2Var = null;
        } else {
            g2Var = (g2) i0.a.g(1, this.f549f[i10]);
        }
        if (g2Var != null) {
            int i11 = (i10 + 6) % 7;
            if (!this.f549f[i11].isEmpty()) {
                g2Var2 = (g2) i0.a.g(1, this.f549f[i11]);
            }
            if (g2Var2 != null && g2Var2.f533b > 1439) {
                g2Var2.f533b = 1439;
                if (g2Var2.f532a >= 1439) {
                    this.f549f[i11].remove(g2Var2);
                }
                View B1 = this.f546a.B1(i11);
                if (B1 instanceof org.telegram.ui.Cells.l5) {
                    ((org.telegram.ui.Cells.l5) B1).setValue(e0(this.f549f[i11]));
                } else {
                    this.f546a.f30819f3.O(true);
                }
            }
        }
    }

    public final void c0(boolean z10) {
        if (this.f547b == null) {
            return;
        }
        this.f547b.a(f0(), z10);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(cd.L0(2131752764, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 5));
        this.f547b = this.simpleActionBar.n(cd.L0(2131745963, null));
        c0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        u51 u51Var = new u51(this, new a(this, 6), new a1.c(this, 2), null);
        this.f546a = u51Var;
        u51Var.r1();
        u51 u51Var2 = this.f546a;
        u51Var2.f30819f3.f29295r = false;
        u51Var2.setSectionsDrawBackground(true);
        frameLayout.addView(this.f546a, b6.c(-1.0f, -1));
        i0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        p51 p51Var;
        if (i10 == zs.E0) {
            i0();
        } else if (i10 == zs.f19680r3) {
            if (this.e == null) {
                this.f550n = n3.b(this.currentAccount).c();
            }
            u51 u51Var = this.f546a;
            if (u51Var != null && (p51Var = u51Var.f30819f3) != null) {
                p51Var.O(true);
            }
        }
    }

    public final boolean f0() {
        throw new UnsupportedOperationException("Method not decompiled: ag.h2.f0():boolean");
    }

    @Override
    public final tk0 getListViewForSimpleGlass() {
        return this.f546a;
    }

    public final void h0() {
        if (this.f547b.f20547y.f7021f) {
            return;
        }
        if (!f0()) {
            finishFragment();
            return;
        }
        this.f547b.b(true);
        TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.f549f;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i10 = 0; i10 < arrayListArr.length; i10++) {
                if (arrayListArr[i10] != null) {
                    for (int i11 = 0; i11 < arrayListArr[i10].size(); i11++) {
                        g2 g2Var = (g2) arrayListArr[i10].get(i11);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i12 = i10 * 1440;
                        tL_businessWeeklyOpen.start_minute = g2Var.f532a + i12;
                        tL_businessWeeklyOpen.end_minute = i12 + g2Var.f533b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.d && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f550n;
            tL_businessWorkHours.weekly_open.addAll(arrayList);
            updatebusinessworkhours.flags |= 1;
            updatebusinessworkhours.business_work_hours = tL_businessWorkHours;
            if (a2 != null) {
                a2.flags2 = 1 | a2.flags2;
                a2.business_work_hours = tL_businessWorkHours;
            }
        } else if (a2 != null) {
            a2.flags2 &= -2;
            a2.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new c(this, 4));
        getMessagesStorage().j2(a2, false);
    }

    public final void i0() {
        boolean z10;
        p51 p51Var;
        if (this.f548c) {
            return;
        }
        TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
        if (a2 == null) {
            getMessagesController().e3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = a2.business_work_hours;
        if (tL_businessWorkHours != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            String str = tL_businessWorkHours.timezone_id;
            this.f550n = str;
            this.h = str;
            this.e = d0(tL_businessWorkHours.weekly_open);
            this.f549f = d0(a2.business_work_hours.weekly_open);
        } else {
            String c10 = n3.b(this.currentAccount).c();
            this.f550n = c10;
            this.h = c10;
            this.e = null;
            this.f549f = new ArrayList[7];
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f549f;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i10] = new ArrayList();
                if (i10 >= 0 && i10 < 5) {
                    this.f549f[i10].add(new g2(0, 1439));
                }
                i10++;
            }
        }
        u51 u51Var = this.f546a;
        if (u51Var != null && (p51Var = u51Var.f30819f3) != null) {
            p51Var.O(true);
        }
        c0(false);
        this.f548c = true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        n3.b(this.currentAccount).g();
        this.f550n = n3.b(this.currentAccount).c();
        getNotificationCenter().c(this, zs.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, zs.E0);
        super.onFragmentDestroy();
        h0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
