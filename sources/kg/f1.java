package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import com.google.android.gms.internal.vision.e2;
import di.v6;
import hi.e7;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.f3;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;
public final class f1 extends g2 implements gs {
    public h51 f18311a;
    public c5 f18312b;
    public boolean f18313c;
    public boolean d;
    public ArrayList[] f18314e;
    public ArrayList[] f18315f;
    public String h;
    public String f18316n;

    public f1() {
        super(null);
        this.f18314e = null;
        this.f18315f = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void Z(f1 f1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            f1Var.f18312b.b(false);
            lc.e0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (f1Var.getParentActivity() != null) {
                f1Var.f18312b.b(false);
                f3.o(null, 2131743636, lc.b0(f1Var), null);
            }
        } else if (!f1Var.isFinished && !f1Var.finishing) {
            f1Var.finishFragment();
        }
    }

    public static void a0(f1 f1Var, ArrayList arrayList) {
        String N0 = hd.N0(2131752752, null);
        String N02 = hd.N0(2131752737, null);
        o41 o41Var = new o41(2);
        o41Var.f38058m = N0;
        o41Var.f38061p = N02;
        o41Var.f38056k = 2131623939;
        arrayList.add(o41Var);
        o41 i7 = o41.i(-1, hd.N0(2131752717, null));
        i7.L(f1Var.d);
        arrayList.add(i7);
        arrayList.add(o41.B(-100, null));
        if (f1Var.d) {
            i5.c.s(2131752752, null, arrayList);
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = f1Var.f18315f;
                if (i10 < arrayListArr.length) {
                    if (arrayListArr[i10] == null) {
                        arrayListArr[i10] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i10].getDisplayName(TextStyle.FULL, hd.E0().f24436y);
                    String f02 = f0(f1Var.f18315f[i10]);
                    o41 o41Var2 = new o41(5);
                    o41Var2.d = i10;
                    o41Var2.f38058m = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    o41Var2.f38059n = f02;
                    o41Var2.L(!f1Var.f18315f[i10].isEmpty());
                    arrayList.add(o41Var2);
                    i10++;
                } else {
                    arrayList.add(o41.B(-101, null));
                    arrayList.add(o41.f(hd.N0(2131752716, null), a2.b(f1Var.currentAccount).d(f1Var.f18316n, false), -2));
                    arrayList.add(o41.B(-102, null));
                    return;
                }
            }
        }
    }

    public static void b0(f1 f1Var, View view, String str) {
        a2 b10 = a2.b(f1Var.currentAccount);
        f1Var.f18316n = str;
        ((n8) view).w(b10.d(str, false), true);
        f1Var.d0(true);
    }

    public static ArrayList[] e0(ArrayList arrayList) {
        int i7;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i10 = 0; i10 < 7; i10++) {
            arrayListArr[i10] = new ArrayList();
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i11);
            int i12 = tL_businessWeeklyOpen.start_minute;
            int i13 = i12 % 1440;
            arrayListArr[(i12 / 1440) % 7].add(new e1(i13, (tL_businessWeeklyOpen.end_minute - i12) + i13));
        }
        int i14 = 0;
        while (i14 < 7) {
            int i15 = i14 * 1440;
            int i16 = i14 + 1;
            int i17 = i16 * 1440;
            int i18 = i15;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i19);
                if (tL_businessWeeklyOpen2.start_minute <= i18 && (i7 = tL_businessWeeklyOpen2.end_minute) >= i18) {
                    i18 = i7 + 1;
                }
            }
            if (i18 >= i17) {
                int i20 = (i14 + 6) % 7;
                if (!arrayListArr[i20].isEmpty() && ((e1) i5.c.h(1, arrayListArr[i20])).f18301b >= 1440) {
                    ((e1) i5.c.h(1, arrayListArr[i20])).f18301b = 1439;
                }
                int min = Math.min((i18 - i15) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i14 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((e1) arrayList2.get(0)).f18300a < min - 1440) {
                    min = ((e1) arrayList2.get(0)).f18300a + 1439;
                }
                arrayListArr[i14].clear();
                arrayListArr[i14].add(new e1(0, min));
            } else {
                int i21 = i16 % 7;
                if (!arrayListArr[i14].isEmpty() && !arrayListArr[i21].isEmpty()) {
                    e1 e1Var = (e1) i5.c.h(1, arrayListArr[i14]);
                    e1 e1Var2 = (e1) arrayListArr[i21].get(0);
                    int i22 = e1Var.f18301b;
                    if (i22 > 1440 && i22 - 1439 == e1Var2.f18300a) {
                        e1Var.f18301b = 1439;
                        e1Var2.f18300a = 0;
                    }
                }
            }
            i14 = i16;
        }
        return arrayListArr;
    }

    public static String f0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return hd.N0(2131752743, null);
        }
        if (h0(arrayList)) {
            return hd.N0(2131752742, null);
        }
        String str = "";
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            e1 e1Var = (e1) arrayList.get(i7);
            if (i7 > 0) {
                str = p5.c.v(str, "\n");
            }
            StringBuilder m10 = e2.m(str);
            m10.append(e1.a(e1Var.f18300a));
            m10.append(" - ");
            m10.append(e1.a(e1Var.f18301b));
            str = m10.toString();
        }
        return str;
    }

    public static boolean h0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e1 e1Var = (e1) arrayList.get(i10);
            if (i7 < e1Var.f18300a) {
                return false;
            }
            i7 = e1Var.f18301b;
        }
        if (i7 != 1439 && i7 != 1440) {
            return false;
        }
        return true;
    }

    public static String k0(int i7, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        int i10;
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] e02 = e0(tL_businessWorkHours.weekly_open);
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(hd.a0(null, null, 2131752747, p10.q(user)));
            sb2.append("\n");
        }
        for (int i11 = 0; i11 < 7; i11++) {
            ArrayList arrayList = e02[i11];
            String displayName = DayOfWeek.values()[i11].getDisplayName(TextStyle.FULL, hd.E0().f24436y);
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (h0(arrayList)) {
                sb2.append(hd.N0(2131752729, null));
            } else if (arrayList.isEmpty()) {
                sb2.append(hd.N0(2131752733, null));
            } else {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    e1 e1Var = (e1) arrayList.get(i12);
                    sb2.append(e1.a(e1Var.f18300a));
                    sb2.append(" - ");
                    sb2.append(e1.a(e1Var.f18301b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a10 = a2.b(i7).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a10 == null) {
            i10 = 0;
        } else {
            i10 = a10.utc_offset;
        }
        if ((rawOffset - i10) / 60 != 0 && a10 != null) {
            a2.b(i7);
            sb2.append(hd.a0(null, null, 2131752748, a2.e(a10, true)));
        }
        return sb2.toString();
    }

    public final void c0(int i7) {
        e1 e1Var;
        e1 e1Var2 = null;
        if (this.f18315f[i7].isEmpty()) {
            e1Var = null;
        } else {
            e1Var = (e1) i5.c.h(1, this.f18315f[i7]);
        }
        if (e1Var != null) {
            int i10 = (i7 + 6) % 7;
            if (!this.f18315f[i10].isEmpty()) {
                e1Var2 = (e1) i5.c.h(1, this.f18315f[i10]);
            }
            if (e1Var2 != null && e1Var2.f18301b > 1439) {
                e1Var2.f18301b = 1439;
                if (e1Var2.f18300a >= 1439) {
                    this.f18315f[i10].remove(e1Var2);
                }
                View B1 = this.f18311a.B1(i10);
                if (B1 instanceof j5) {
                    ((j5) B1).setValue(f0(this.f18315f[i10]));
                } else {
                    this.f18311a.f35742g3.O(true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(hd.N0(2131752752, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 11));
        this.f18312b = this.simpleActionBar.s(hd.N0(2131745750, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        h51 h51Var = new h51(this, new e7(this, 13), new v6(this, 27), null);
        this.f18311a = h51Var;
        h51Var.r1();
        h51 h51Var2 = this.f18311a;
        h51Var2.f35742g3.f34026r = false;
        h51Var2.setSectionsDrawBackground(true);
        frameLayout.addView(this.f18311a, na.c(-1.0f, -1));
        j0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z10) {
        if (this.f18312b == null) {
            return;
        }
        this.f18312b.a(g0(), z10);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c51 c51Var;
        if (i7 == ls.E0) {
            j0();
        } else if (i7 == ls.f25352t3) {
            if (this.f18314e == null) {
                this.f18316n = a2.b(this.currentAccount).c();
            }
            h51 h51Var = this.f18311a;
            if (h51Var != null && (c51Var = h51Var.f35742g3) != null) {
                c51Var.O(true);
            }
        }
    }

    public final boolean g0() {
        throw new UnsupportedOperationException("Method not decompiled: kg.f1.g0():boolean");
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18311a;
    }

    public final void i0() {
        if (this.f18312b.f28825y.f57666f) {
            return;
        }
        if (!g0()) {
            finishFragment();
            return;
        }
        this.f18312b.b(true);
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.f18315f;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i7 = 0; i7 < arrayListArr.length; i7++) {
                if (arrayListArr[i7] != null) {
                    for (int i10 = 0; i10 < arrayListArr[i7].size(); i10++) {
                        e1 e1Var = (e1) arrayListArr[i7].get(i10);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i11 = i7 * 1440;
                        tL_businessWeeklyOpen.start_minute = e1Var.f18300a + i11;
                        tL_businessWeeklyOpen.end_minute = i11 + e1Var.f18301b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.d && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f18316n;
            tL_businessWorkHours.weekly_open.addAll(arrayList);
            updatebusinessworkhours.flags |= 1;
            updatebusinessworkhours.business_work_hours = tL_businessWorkHours;
            if (d2 != null) {
                d2.flags2 = 1 | d2.flags2;
                d2.business_work_hours = tL_businessWorkHours;
            }
        } else if (d2 != null) {
            d2.flags2 &= -2;
            d2.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new ai.a1(this, 20));
        getMessagesStorage().j2(d2, false);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        boolean z10;
        c51 c51Var;
        if (this.f18313c) {
            return;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        if (d2 == null) {
            getMessagesController().n3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = d2.business_work_hours;
        if (tL_businessWorkHours != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            String str = tL_businessWorkHours.timezone_id;
            this.f18316n = str;
            this.h = str;
            this.f18314e = e0(tL_businessWorkHours.weekly_open);
            this.f18315f = e0(d2.business_work_hours.weekly_open);
        } else {
            String c10 = a2.b(this.currentAccount).c();
            this.f18316n = c10;
            this.h = c10;
            this.f18314e = null;
            this.f18315f = new ArrayList[7];
            int i7 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f18315f;
                if (i7 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i7] = new ArrayList();
                if (i7 >= 0 && i7 < 5) {
                    this.f18315f[i7].add(new e1(0, 1439));
                }
                i7++;
            }
        }
        h51 h51Var = this.f18311a;
        if (h51Var != null && (c51Var = h51Var.f35742g3) != null) {
            c51Var.O(true);
        }
        d0(false);
        this.f18313c = true;
    }

    @Override
    public final boolean onFragmentCreate() {
        a2.b(this.currentAccount).g();
        this.f18316n = a2.b(this.currentAccount).c();
        getNotificationCenter().c(this, ls.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ls.E0);
        super.onFragmentDestroy();
        i0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
