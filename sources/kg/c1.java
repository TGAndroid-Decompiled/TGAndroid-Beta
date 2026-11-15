package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.x4;
import c8.ja;
import di.z6;
import hi.q4;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.k5;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class c1 extends e2 implements is {
    public u41 f17888a;
    public z4 f17889b;
    public boolean f17890c;
    public boolean d;
    public ArrayList[] f17891e;
    public ArrayList[] f17892f;
    public String h;
    public String f17893n;

    public c1() {
        super(null);
        this.f17891e = null;
        this.f17892f = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void Z(c1 c1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            c1Var.f17889b.b(false);
            cc.d0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (c1Var.getParentActivity() != null) {
                c1Var.f17889b.b(false);
                k5.o(null, 2131743879, cc.a0(c1Var), null);
            }
        } else if (!c1Var.isFinished && !c1Var.finishing) {
            c1Var.finishFragment();
        }
    }

    public static void a0(c1 c1Var, ArrayList arrayList) {
        String M0 = hd.M0(2131752764, null);
        String M02 = hd.M0(2131752749, null);
        b41 b41Var = new b41(2);
        b41Var.f33184l = M0;
        b41Var.f33187o = M02;
        b41Var.f33183k = 2131623939;
        arrayList.add(b41Var);
        b41 i7 = b41.i(-1, hd.M0(2131752729, null));
        i7.L(c1Var.d);
        arrayList.add(i7);
        arrayList.add(b41.B(-100, null));
        if (c1Var.d) {
            arrayList.add(b41.u(hd.M0(2131752764, null)));
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = c1Var.f17892f;
                if (i10 < arrayListArr.length) {
                    if (arrayListArr[i10] == null) {
                        arrayListArr[i10] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i10].getDisplayName(TextStyle.FULL, hd.E0().f24132y);
                    String f02 = f0(c1Var.f17892f[i10]);
                    b41 b41Var2 = new b41(5);
                    b41Var2.d = i10;
                    b41Var2.f33184l = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    b41Var2.f33185m = f02;
                    b41Var2.L(!c1Var.f17892f[i10].isEmpty());
                    arrayList.add(b41Var2);
                    i10++;
                } else {
                    arrayList.add(b41.B(-101, null));
                    arrayList.add(b41.f(hd.M0(2131752728, null), z1.b(c1Var.currentAccount).d(c1Var.f17893n, false), -2));
                    arrayList.add(b41.B(-102, null));
                    return;
                }
            }
        }
    }

    public static void b0(c1 c1Var, View view, String str) {
        z1 b10 = z1.b(c1Var.currentAccount);
        c1Var.f17893n = str;
        ((l8) view).w(b10.d(str, false), true);
        c1Var.d0(true);
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
            arrayListArr[(i12 / 1440) % 7].add(new b1(i13, (tL_businessWeeklyOpen.end_minute - i12) + i13));
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
                if (!arrayListArr[i20].isEmpty() && ((b1) i5.c.h(1, arrayListArr[i20])).f17876b >= 1440) {
                    ((b1) i5.c.h(1, arrayListArr[i20])).f17876b = 1439;
                }
                int min = Math.min((i18 - i15) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i14 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((b1) arrayList2.get(0)).f17875a < min - 1440) {
                    min = ((b1) arrayList2.get(0)).f17875a + 1439;
                }
                arrayListArr[i14].clear();
                arrayListArr[i14].add(new b1(0, min));
            } else {
                int i21 = i16 % 7;
                if (!arrayListArr[i14].isEmpty() && !arrayListArr[i21].isEmpty()) {
                    b1 b1Var = (b1) i5.c.h(1, arrayListArr[i14]);
                    b1 b1Var2 = (b1) arrayListArr[i21].get(0);
                    int i22 = b1Var.f17876b;
                    if (i22 > 1440 && i22 - 1439 == b1Var2.f17875a) {
                        b1Var.f17876b = 1439;
                        b1Var2.f17875a = 0;
                    }
                }
            }
            i14 = i16;
        }
        return arrayListArr;
    }

    public static String f0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return hd.M0(2131752755, null);
        }
        if (h0(arrayList)) {
            return hd.M0(2131752754, null);
        }
        String str = "";
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            b1 b1Var = (b1) arrayList.get(i7);
            if (i7 > 0) {
                str = r.b.v(str, "\n");
            }
            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str);
            m10.append(b1.a(b1Var.f17875a));
            m10.append(" - ");
            m10.append(b1.a(b1Var.f17876b));
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
            b1 b1Var = (b1) arrayList.get(i10);
            if (i7 < b1Var.f17875a) {
                return false;
            }
            i7 = b1Var.f17876b;
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
            sb2.append(hd.a0(null, null, 2131752759, q10.p(user)));
            sb2.append("\n");
        }
        for (int i11 = 0; i11 < 7; i11++) {
            ArrayList arrayList = e02[i11];
            String displayName = DayOfWeek.values()[i11].getDisplayName(TextStyle.FULL, hd.E0().f24132y);
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (h0(arrayList)) {
                sb2.append(hd.M0(2131752741, null));
            } else if (arrayList.isEmpty()) {
                sb2.append(hd.M0(2131752745, null));
            } else {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    b1 b1Var = (b1) arrayList.get(i12);
                    sb2.append(b1.a(b1Var.f17875a));
                    sb2.append(" - ");
                    sb2.append(b1.a(b1Var.f17876b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a10 = z1.b(i7).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a10 == null) {
            i10 = 0;
        } else {
            i10 = a10.utc_offset;
        }
        if ((rawOffset - i10) / 60 != 0 && a10 != null) {
            z1.b(i7);
            sb2.append(hd.a0(null, null, 2131752760, z1.e(a10, true)));
        }
        return sb2.toString();
    }

    public final void c0(int i7) {
        b1 b1Var;
        b1 b1Var2 = null;
        if (this.f17892f[i7].isEmpty()) {
            b1Var = null;
        } else {
            b1Var = (b1) i5.c.h(1, this.f17892f[i7]);
        }
        if (b1Var != null) {
            int i10 = (i7 + 6) % 7;
            if (!this.f17892f[i10].isEmpty()) {
                b1Var2 = (b1) i5.c.h(1, this.f17892f[i10]);
            }
            if (b1Var2 != null && b1Var2.f17876b > 1439) {
                b1Var2.f17876b = 1439;
                if (b1Var2.f17875a >= 1439) {
                    this.f17892f[i10].remove(b1Var2);
                }
                View B1 = this.f17888a.B1(i10);
                if (B1 instanceof h5) {
                    ((h5) B1).setValue(f0(this.f17892f[i10]));
                } else {
                    this.f17888a.f39892g3.O(true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(hd.M0(2131752764, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 9));
        this.f17889b = this.simpleActionBar.q(hd.M0(2131745946, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        u41 u41Var = new u41(this, new q4(this, 13), new z6(this, 25), null);
        this.f17888a = u41Var;
        u41Var.r1();
        u41 u41Var2 = this.f17888a;
        u41Var2.f39892g3.f38199r = false;
        u41Var2.setSectionsDrawBackground(true);
        frameLayout.addView(this.f17888a, ja.c(-1.0f, -1));
        j0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z10) {
        if (this.f17889b == null) {
            return;
        }
        this.f17889b.a(g0(), z10);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p41 p41Var;
        if (i7 == ns.E0) {
            j0();
        } else if (i7 == ns.f25564r3) {
            if (this.f17891e == null) {
                this.f17893n = z1.b(this.currentAccount).c();
            }
            u41 u41Var = this.f17888a;
            if (u41Var != null && (p41Var = u41Var.f39892g3) != null) {
                p41Var.O(true);
            }
        }
    }

    public final boolean g0() {
        throw new UnsupportedOperationException("Method not decompiled: kg.c1.g0():boolean");
    }

    @Override
    public final uj0 getListViewForSimpleGlass() {
        return this.f17888a;
    }

    public final void i0() {
        if (this.f17889b.f29950y.f57086f) {
            return;
        }
        if (!g0()) {
            finishFragment();
            return;
        }
        this.f17889b.b(true);
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.f17892f;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i7 = 0; i7 < arrayListArr.length; i7++) {
                if (arrayListArr[i7] != null) {
                    for (int i10 = 0; i10 < arrayListArr[i7].size(); i10++) {
                        b1 b1Var = (b1) arrayListArr[i7].get(i10);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i11 = i7 * 1440;
                        tL_businessWeeklyOpen.start_minute = b1Var.f17875a + i11;
                        tL_businessWeeklyOpen.end_minute = i11 + b1Var.f17876b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.d && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f17893n;
            tL_businessWorkHours.weekly_open.addAll(arrayList);
            updatebusinessworkhours.flags |= 1;
            updatebusinessworkhours.business_work_hours = tL_businessWorkHours;
            if (b22 != null) {
                b22.flags2 = 1 | b22.flags2;
                b22.business_work_hours = tL_businessWorkHours;
            }
        } else if (b22 != null) {
            b22.flags2 &= -2;
            b22.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new ai.e1(this, 18));
        getMessagesStorage().j2(b22, false);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        boolean z10;
        p41 p41Var;
        if (this.f17890c) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = b22.business_work_hours;
        if (tL_businessWorkHours != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (z10) {
            String str = tL_businessWorkHours.timezone_id;
            this.f17893n = str;
            this.h = str;
            this.f17891e = e0(tL_businessWorkHours.weekly_open);
            this.f17892f = e0(b22.business_work_hours.weekly_open);
        } else {
            String c10 = z1.b(this.currentAccount).c();
            this.f17893n = c10;
            this.h = c10;
            this.f17891e = null;
            this.f17892f = new ArrayList[7];
            int i7 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f17892f;
                if (i7 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i7] = new ArrayList();
                if (i7 >= 0 && i7 < 5) {
                    this.f17892f[i7].add(new b1(0, 1439));
                }
                i7++;
            }
        }
        u41 u41Var = this.f17888a;
        if (u41Var != null && (p41Var = u41Var.f39892g3) != null) {
            p41Var.O(true);
        }
        d0(false);
        this.f17890c = true;
    }

    @Override
    public final boolean onFragmentCreate() {
        z1.b(this.currentAccount).g();
        this.f17893n = z1.b(this.currentAccount).c();
        getNotificationCenter().c(this, ns.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ns.E0);
        super.onFragmentDestroy();
        i0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
