package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import com.google.android.gms.internal.vision.e2;
import di.v6;
import hi.y7;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.f3;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;
public final class e1 extends g2 implements fs {
    public g51 f18396a;
    public c5 f18397b;
    public boolean f18398c;
    public boolean d;
    public ArrayList[] f18399e;
    public ArrayList[] f18400f;
    public String h;
    public String f18401n;

    public e1() {
        super(null);
        this.f18399e = null;
        this.f18400f = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void Z(e1 e1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            e1Var.f18397b.b(false);
            kc.e0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (e1Var.getParentActivity() != null) {
                e1Var.f18397b.b(false);
                f3.o(null, 2131743632, kc.b0(e1Var), null);
            }
        } else if (!e1Var.isFinished && !e1Var.finishing) {
            e1Var.finishFragment();
        }
    }

    public static void a0(e1 e1Var, ArrayList arrayList) {
        String N0 = gd.N0(2131752752, null);
        String N02 = gd.N0(2131752737, null);
        n41 n41Var = new n41(2);
        n41Var.f37655m = N0;
        n41Var.f37658p = N02;
        n41Var.f37653k = 2131623939;
        arrayList.add(n41Var);
        n41 i7 = n41.i(-1, gd.N0(2131752717, null));
        i7.L(e1Var.d);
        arrayList.add(i7);
        arrayList.add(n41.B(-100, null));
        if (e1Var.d) {
            i5.c.s(2131752752, null, arrayList);
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = e1Var.f18400f;
                if (i10 < arrayListArr.length) {
                    if (arrayListArr[i10] == null) {
                        arrayListArr[i10] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i10].getDisplayName(TextStyle.FULL, gd.E0().f24342y);
                    String f02 = f0(e1Var.f18400f[i10]);
                    n41 n41Var2 = new n41(5);
                    n41Var2.d = i10;
                    n41Var2.f37655m = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    n41Var2.f37656n = f02;
                    n41Var2.L(!e1Var.f18400f[i10].isEmpty());
                    arrayList.add(n41Var2);
                    i10++;
                } else {
                    arrayList.add(n41.B(-101, null));
                    arrayList.add(n41.f(gd.N0(2131752716, null), z1.b(e1Var.currentAccount).d(e1Var.f18401n, false), -2));
                    arrayList.add(n41.B(-102, null));
                    return;
                }
            }
        }
    }

    public static void b0(e1 e1Var, View view, String str) {
        z1 b10 = z1.b(e1Var.currentAccount);
        e1Var.f18401n = str;
        ((m8) view).w(b10.d(str, false), true);
        e1Var.d0(true);
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
            arrayListArr[(i12 / 1440) % 7].add(new d1(i13, (tL_businessWeeklyOpen.end_minute - i12) + i13));
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
                if (!arrayListArr[i20].isEmpty() && ((d1) i5.c.h(1, arrayListArr[i20])).f18380b >= 1440) {
                    ((d1) i5.c.h(1, arrayListArr[i20])).f18380b = 1439;
                }
                int min = Math.min((i18 - i15) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i14 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((d1) arrayList2.get(0)).f18379a < min - 1440) {
                    min = ((d1) arrayList2.get(0)).f18379a + 1439;
                }
                arrayListArr[i14].clear();
                arrayListArr[i14].add(new d1(0, min));
            } else {
                int i21 = i16 % 7;
                if (!arrayListArr[i14].isEmpty() && !arrayListArr[i21].isEmpty()) {
                    d1 d1Var = (d1) i5.c.h(1, arrayListArr[i14]);
                    d1 d1Var2 = (d1) arrayListArr[i21].get(0);
                    int i22 = d1Var.f18380b;
                    if (i22 > 1440 && i22 - 1439 == d1Var2.f18379a) {
                        d1Var.f18380b = 1439;
                        d1Var2.f18379a = 0;
                    }
                }
            }
            i14 = i16;
        }
        return arrayListArr;
    }

    public static String f0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return gd.N0(2131752743, null);
        }
        if (h0(arrayList)) {
            return gd.N0(2131752742, null);
        }
        String str = "";
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            d1 d1Var = (d1) arrayList.get(i7);
            if (i7 > 0) {
                str = p5.c.v(str, "\n");
            }
            StringBuilder m10 = e2.m(str);
            m10.append(d1.a(d1Var.f18379a));
            m10.append(" - ");
            m10.append(d1.a(d1Var.f18380b));
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
            d1 d1Var = (d1) arrayList.get(i10);
            if (i7 < d1Var.f18379a) {
                return false;
            }
            i7 = d1Var.f18380b;
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
            sb2.append(gd.a0(null, null, 2131752747, n10.q(user)));
            sb2.append("\n");
        }
        for (int i11 = 0; i11 < 7; i11++) {
            ArrayList arrayList = e02[i11];
            String displayName = DayOfWeek.values()[i11].getDisplayName(TextStyle.FULL, gd.E0().f24342y);
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (h0(arrayList)) {
                sb2.append(gd.N0(2131752729, null));
            } else if (arrayList.isEmpty()) {
                sb2.append(gd.N0(2131752733, null));
            } else {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    d1 d1Var = (d1) arrayList.get(i12);
                    sb2.append(d1.a(d1Var.f18379a));
                    sb2.append(" - ");
                    sb2.append(d1.a(d1Var.f18380b));
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
            sb2.append(gd.a0(null, null, 2131752748, z1.e(a10, true)));
        }
        return sb2.toString();
    }

    public final void c0(int i7) {
        d1 d1Var;
        d1 d1Var2 = null;
        if (this.f18400f[i7].isEmpty()) {
            d1Var = null;
        } else {
            d1Var = (d1) i5.c.h(1, this.f18400f[i7]);
        }
        if (d1Var != null) {
            int i10 = (i7 + 6) % 7;
            if (!this.f18400f[i10].isEmpty()) {
                d1Var2 = (d1) i5.c.h(1, this.f18400f[i10]);
            }
            if (d1Var2 != null && d1Var2.f18380b > 1439) {
                d1Var2.f18380b = 1439;
                if (d1Var2.f18379a >= 1439) {
                    this.f18400f[i10].remove(d1Var2);
                }
                View B1 = this.f18396a.B1(i10);
                if (B1 instanceof i5) {
                    ((i5) B1).setValue(f0(this.f18400f[i10]));
                } else {
                    this.f18396a.f35323g3.O(true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(gd.N0(2131752752, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 11));
        this.f18397b = this.simpleActionBar.s(gd.N0(2131745750, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        g51 g51Var = new g51(this, new y7(this, 13), new v6(this, 29), null);
        this.f18396a = g51Var;
        g51Var.r1();
        g51 g51Var2 = this.f18396a;
        g51Var2.f35323g3.f33631r = false;
        g51Var2.setSectionsDrawBackground(true);
        frameLayout.addView(this.f18396a, na.c(-1.0f, -1));
        j0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z10) {
        if (this.f18397b == null) {
            return;
        }
        this.f18397b.a(g0(), z10);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        b51 b51Var;
        if (i7 == ks.E0) {
            j0();
        } else if (i7 == ks.f25293t3) {
            if (this.f18399e == null) {
                this.f18401n = z1.b(this.currentAccount).c();
            }
            g51 g51Var = this.f18396a;
            if (g51Var != null && (b51Var = g51Var.f35323g3) != null) {
                b51Var.O(true);
            }
        }
    }

    public final boolean g0() {
        throw new UnsupportedOperationException("Method not decompiled: kg.e1.g0():boolean");
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18396a;
    }

    public final void i0() {
        if (this.f18397b.f28920y.f57780f) {
            return;
        }
        if (!g0()) {
            finishFragment();
            return;
        }
        this.f18397b.b(true);
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.f18400f;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i7 = 0; i7 < arrayListArr.length; i7++) {
                if (arrayListArr[i7] != null) {
                    for (int i10 = 0; i10 < arrayListArr[i7].size(); i10++) {
                        d1 d1Var = (d1) arrayListArr[i7].get(i10);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i11 = i7 * 1440;
                        tL_businessWeeklyOpen.start_minute = d1Var.f18379a + i11;
                        tL_businessWeeklyOpen.end_minute = i11 + d1Var.f18380b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.d && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f18401n;
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
        getConnectionsManager().sendRequest(updatebusinessworkhours, new ai.b1(this, 20));
        getMessagesStorage().j2(d2, false);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        boolean z10;
        b51 b51Var;
        if (this.f18398c) {
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
            this.f18401n = str;
            this.h = str;
            this.f18399e = e0(tL_businessWorkHours.weekly_open);
            this.f18400f = e0(d2.business_work_hours.weekly_open);
        } else {
            String c10 = z1.b(this.currentAccount).c();
            this.f18401n = c10;
            this.h = c10;
            this.f18399e = null;
            this.f18400f = new ArrayList[7];
            int i7 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f18400f;
                if (i7 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i7] = new ArrayList();
                if (i7 >= 0 && i7 < 5) {
                    this.f18400f[i7].add(new d1(0, 1439));
                }
                i7++;
            }
        }
        g51 g51Var = this.f18396a;
        if (g51Var != null && (b51Var = g51Var.f35323g3) != null) {
            b51Var.O(true);
        }
        d0(false);
        this.f18398c = true;
    }

    @Override
    public final boolean onFragmentCreate() {
        z1.b(this.currentAccount).g();
        this.f18401n = z1.b(this.currentAccount).c();
        getNotificationCenter().c(this, ks.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.E0);
        super.onFragmentDestroy();
        i0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
