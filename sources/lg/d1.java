package lg;

import ai.g5;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import gi.q4;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class d1 extends d2 implements cs {
    public l41 f18265a;
    public b5 f18266b;
    public boolean f18267c;
    public boolean d;
    public ArrayList[] f18268e;
    public ArrayList[] f18269f;
    public String h;
    public String f18270n;

    public d1() {
        super(null);
        this.f18268e = null;
        this.f18269f = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void Z(d1 d1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            d1Var.f18266b.b(false);
            fc.d0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (d1Var.getParentActivity() != null) {
                d1Var.f18266b.b(false);
                k5.p(null, 2131743889, fc.a0(d1Var), null);
            }
        } else if (!d1Var.isFinished && !d1Var.finishing) {
            d1Var.finishFragment();
        }
    }

    public static void a0(d1 d1Var, ArrayList arrayList) {
        String M0 = bd.M0(2131752764, null);
        String M02 = bd.M0(2131752749, null);
        r31 r31Var = new r31(2);
        r31Var.f37627l = M0;
        r31Var.f37630o = M02;
        r31Var.f37626k = 2131623939;
        arrayList.add(r31Var);
        r31 i3 = r31.i(-1, bd.M0(2131752729, null));
        i3.L(d1Var.d);
        arrayList.add(i3);
        arrayList.add(r31.B(-100, null));
        if (d1Var.d) {
            arrayList.add(r31.u(bd.M0(2131752764, null)));
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = d1Var.f18269f;
                if (i10 < arrayListArr.length) {
                    if (arrayListArr[i10] == null) {
                        arrayListArr[i10] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i10].getDisplayName(TextStyle.FULL, bd.E0().f21812y);
                    String f02 = f0(d1Var.f18269f[i10]);
                    r31 r31Var2 = new r31(5);
                    r31Var2.d = i10;
                    r31Var2.f37627l = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    r31Var2.f37628m = f02;
                    r31Var2.L(!d1Var.f18269f[i10].isEmpty());
                    arrayList.add(r31Var2);
                    i10++;
                } else {
                    arrayList.add(r31.B(-101, null));
                    arrayList.add(r31.f(bd.M0(2131752728, null), y1.b(d1Var.currentAccount).d(d1Var.f18270n, false), -2));
                    arrayList.add(r31.B(-102, null));
                    return;
                }
            }
        }
    }

    public static void b0(d1 d1Var, View view, String str) {
        y1 b10 = y1.b(d1Var.currentAccount);
        d1Var.f18270n = str;
        ((l8) view).w(b10.d(str, false), true);
        d1Var.d0(true);
    }

    public static ArrayList[] e0(ArrayList arrayList) {
        int i3;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i10 = 0; i10 < 7; i10++) {
            arrayListArr[i10] = new ArrayList();
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i11);
            int i12 = tL_businessWeeklyOpen.start_minute;
            int i13 = i12 % 1440;
            arrayListArr[(i12 / 1440) % 7].add(new c1(i13, (tL_businessWeeklyOpen.end_minute - i12) + i13));
        }
        int i14 = 0;
        while (i14 < 7) {
            int i15 = i14 * 1440;
            int i16 = i14 + 1;
            int i17 = i16 * 1440;
            int i18 = i15;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i19);
                if (tL_businessWeeklyOpen2.start_minute <= i18 && (i3 = tL_businessWeeklyOpen2.end_minute) >= i18) {
                    i18 = i3 + 1;
                }
            }
            if (i18 >= i17) {
                int i20 = (i14 + 6) % 7;
                if (!arrayListArr[i20].isEmpty() && ((c1) k2.p1.h(1, arrayListArr[i20])).f18262b >= 1440) {
                    ((c1) k2.p1.h(1, arrayListArr[i20])).f18262b = 1439;
                }
                int min = Math.min((i18 - i15) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i14 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((c1) arrayList2.get(0)).f18261a < min - 1440) {
                    min = ((c1) arrayList2.get(0)).f18261a + 1439;
                }
                arrayListArr[i14].clear();
                arrayListArr[i14].add(new c1(0, min));
            } else {
                int i21 = i16 % 7;
                if (!arrayListArr[i14].isEmpty() && !arrayListArr[i21].isEmpty()) {
                    c1 c1Var = (c1) k2.p1.h(1, arrayListArr[i14]);
                    c1 c1Var2 = (c1) arrayListArr[i21].get(0);
                    int i22 = c1Var.f18262b;
                    if (i22 > 1440 && i22 - 1439 == c1Var2.f18261a) {
                        c1Var.f18262b = 1439;
                        c1Var2.f18261a = 0;
                    }
                }
            }
            i14 = i16;
        }
        return arrayListArr;
    }

    public static String f0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return bd.M0(2131752755, null);
        }
        if (h0(arrayList)) {
            return bd.M0(2131752754, null);
        }
        String str = "";
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            c1 c1Var = (c1) arrayList.get(i3);
            if (i3 > 0) {
                str = t4.c.q(str, "\n");
            }
            StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str);
            l10.append(c1.a(c1Var.f18261a));
            l10.append(" - ");
            l10.append(c1.a(c1Var.f18262b));
            str = l10.toString();
        }
        return str;
    }

    public static boolean h0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c1 c1Var = (c1) arrayList.get(i10);
            if (i3 < c1Var.f18261a) {
                return false;
            }
            i3 = c1Var.f18262b;
        }
        if (i3 != 1439 && i3 != 1440) {
            return false;
        }
        return true;
    }

    public static String k0(int i3, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        int i10;
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] e02 = e0(tL_businessWorkHours.weekly_open);
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(bd.a0(null, null, 2131752759, l10.p(user)));
            sb2.append("\n");
        }
        for (int i11 = 0; i11 < 7; i11++) {
            ArrayList arrayList = e02[i11];
            String displayName = DayOfWeek.values()[i11].getDisplayName(TextStyle.FULL, bd.E0().f21812y);
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (h0(arrayList)) {
                sb2.append(bd.M0(2131752741, null));
            } else if (arrayList.isEmpty()) {
                sb2.append(bd.M0(2131752745, null));
            } else {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    c1 c1Var = (c1) arrayList.get(i12);
                    sb2.append(c1.a(c1Var.f18261a));
                    sb2.append(" - ");
                    sb2.append(c1.a(c1Var.f18262b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a10 = y1.b(i3).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a10 == null) {
            i10 = 0;
        } else {
            i10 = a10.utc_offset;
        }
        if ((rawOffset - i10) / 60 != 0 && a10 != null) {
            y1.b(i3);
            sb2.append(bd.a0(null, null, 2131752760, y1.e(a10, true)));
        }
        return sb2.toString();
    }

    public final void c0(int i3) {
        c1 c1Var;
        c1 c1Var2 = null;
        if (this.f18269f[i3].isEmpty()) {
            c1Var = null;
        } else {
            c1Var = (c1) k2.p1.h(1, this.f18269f[i3]);
        }
        if (c1Var != null) {
            int i10 = (i3 + 6) % 7;
            if (!this.f18269f[i10].isEmpty()) {
                c1Var2 = (c1) k2.p1.h(1, this.f18269f[i10]);
            }
            if (c1Var2 != null && c1Var2.f18262b > 1439) {
                c1Var2.f18262b = 1439;
                if (c1Var2.f18261a >= 1439) {
                    this.f18269f[i10].remove(c1Var2);
                }
                View B1 = this.f18265a.B1(i10);
                if (B1 instanceof h5) {
                    ((h5) B1).setValue(f0(this.f18269f[i10]));
                } else {
                    this.f18265a.f35594g3.O(true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(bd.M0(2131752764, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new g5(this, 17));
        this.f18266b = this.simpleActionBar.n(bd.M0(2131745956, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        l41 l41Var = new l41(this, new q4(this, 21), new l5.b(this, 1), null);
        this.f18265a = l41Var;
        l41Var.r1();
        l41 l41Var2 = this.f18265a;
        l41Var2.f35594g3.f33698r = false;
        l41Var2.setSectionsDrawBackground(true);
        frameLayout.addView(this.f18265a, mf.c(-1.0f, -1));
        j0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z10) {
        if (this.f18266b == null) {
            return;
        }
        this.f18266b.a(g0(), z10);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        f41 f41Var;
        if (i3 == hs.E0) {
            j0();
        } else if (i3 == hs.f23296r3) {
            if (this.f18268e == null) {
                this.f18270n = y1.b(this.currentAccount).c();
            }
            l41 l41Var = this.f18265a;
            if (l41Var != null && (f41Var = l41Var.f35594g3) != null) {
                f41Var.O(true);
            }
        }
    }

    public final boolean g0() {
        throw new UnsupportedOperationException("Method not decompiled: lg.d1.g0():boolean");
    }

    @Override
    public final tj0 getListViewForSimpleGlass() {
        return this.f18265a;
    }

    public final void i0() {
        if (this.f18266b.f27421y.f53841f) {
            return;
        }
        if (!g0()) {
            finishFragment();
            return;
        }
        this.f18266b.b(true);
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.f18269f;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i3 = 0; i3 < arrayListArr.length; i3++) {
                if (arrayListArr[i3] != null) {
                    for (int i10 = 0; i10 < arrayListArr[i3].size(); i10++) {
                        c1 c1Var = (c1) arrayListArr[i3].get(i10);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i11 = i3 * 1440;
                        tL_businessWeeklyOpen.start_minute = c1Var.f18261a + i11;
                        tL_businessWeeklyOpen.end_minute = i11 + c1Var.f18262b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.d && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f18270n;
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
        getConnectionsManager().sendRequest(updatebusinessworkhours, new ci.d0(this, 18));
        getMessagesStorage().j2(b22, false);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        boolean z10;
        f41 f41Var;
        if (this.f18267c) {
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
            this.f18270n = str;
            this.h = str;
            this.f18268e = e0(tL_businessWorkHours.weekly_open);
            this.f18269f = e0(b22.business_work_hours.weekly_open);
        } else {
            String c2 = y1.b(this.currentAccount).c();
            this.f18270n = c2;
            this.h = c2;
            this.f18268e = null;
            this.f18269f = new ArrayList[7];
            int i3 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f18269f;
                if (i3 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i3] = new ArrayList();
                if (i3 >= 0 && i3 < 5) {
                    this.f18269f[i3].add(new c1(0, 1439));
                }
                i3++;
            }
        }
        l41 l41Var = this.f18265a;
        if (l41Var != null && (f41Var = l41Var.f35594g3) != null) {
            f41Var.O(true);
        }
        d0(false);
        this.f18267c = true;
    }

    @Override
    public final boolean onFragmentCreate() {
        y1.b(this.currentAccount).g();
        this.f18270n = y1.b(this.currentAccount).c();
        getNotificationCenter().c(this, hs.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.E0);
        super.onFragmentDestroy();
        i0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
