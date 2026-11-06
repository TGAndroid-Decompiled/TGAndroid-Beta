package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import di.q4;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.w31;
public final class c1 extends f2 implements ls {
    public p41 f17326a;
    public b5 f17327b;
    public boolean f17328c;
    public boolean d;
    public ArrayList[] f17329e;
    public ArrayList[] f17330f;
    public String h;
    public String f17331n;

    public c1() {
        super(null);
        this.f17329e = null;
        this.f17330f = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void Z(c1 c1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            c1Var.f17327b.b(false);
            hc.d0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (c1Var.getParentActivity() != null) {
                c1Var.f17327b.b(false);
                k5.p(null, 2131743880, hc.a0(c1Var), null);
            }
        } else if (!c1Var.isFinished && !c1Var.finishing) {
            c1Var.finishFragment();
        }
    }

    public static void a0(c1 c1Var, ArrayList arrayList) {
        String M0 = hd.M0(2131752764, null);
        String M02 = hd.M0(2131752749, null);
        w31 w31Var = new w31(2);
        w31Var.f39830l = M0;
        w31Var.f39833o = M02;
        w31Var.f39829k = 2131623939;
        arrayList.add(w31Var);
        w31 i7 = w31.i(-1, hd.M0(2131752729, null));
        i7.L(c1Var.d);
        arrayList.add(i7);
        arrayList.add(w31.B(-100, null));
        if (c1Var.d) {
            arrayList.add(w31.u(hd.M0(2131752764, null)));
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = c1Var.f17330f;
                if (i10 < arrayListArr.length) {
                    if (arrayListArr[i10] == null) {
                        arrayListArr[i10] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i10].getDisplayName(TextStyle.FULL, hd.E0().f22899y);
                    String f02 = f0(c1Var.f17330f[i10]);
                    w31 w31Var2 = new w31(5);
                    w31Var2.d = i10;
                    w31Var2.f39830l = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    w31Var2.f39831m = f02;
                    w31Var2.L(!c1Var.f17330f[i10].isEmpty());
                    arrayList.add(w31Var2);
                    i10++;
                } else {
                    arrayList.add(w31.B(-101, null));
                    arrayList.add(w31.f(hd.M0(2131752728, null), x1.b(c1Var.currentAccount).d(c1Var.f17331n, false), -2));
                    arrayList.add(w31.B(-102, null));
                    return;
                }
            }
        }
    }

    public static void b0(c1 c1Var, View view, String str) {
        x1 b10 = x1.b(c1Var.currentAccount);
        c1Var.f17331n = str;
        ((m8) view).w(b10.d(str, false), true);
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
                if (!arrayListArr[i20].isEmpty() && ((b1) jg.g.i(1, arrayListArr[i20])).f17314b >= 1440) {
                    ((b1) jg.g.i(1, arrayListArr[i20])).f17314b = 1439;
                }
                int min = Math.min((i18 - i15) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i14 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((b1) arrayList2.get(0)).f17313a < min - 1440) {
                    min = ((b1) arrayList2.get(0)).f17313a + 1439;
                }
                arrayListArr[i14].clear();
                arrayListArr[i14].add(new b1(0, min));
            } else {
                int i21 = i16 % 7;
                if (!arrayListArr[i14].isEmpty() && !arrayListArr[i21].isEmpty()) {
                    b1 b1Var = (b1) jg.g.i(1, arrayListArr[i14]);
                    b1 b1Var2 = (b1) arrayListArr[i21].get(0);
                    int i22 = b1Var.f17314b;
                    if (i22 > 1440 && i22 - 1439 == b1Var2.f17313a) {
                        b1Var.f17314b = 1439;
                        b1Var2.f17313a = 0;
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
                str = rf.b.q(str, "\n");
            }
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str);
            m10.append(b1.a(b1Var.f17313a));
            m10.append(" - ");
            m10.append(b1.a(b1Var.f17314b));
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
            if (i7 < b1Var.f17313a) {
                return false;
            }
            i7 = b1Var.f17314b;
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
            sb2.append(hd.a0(null, null, 2131752759, t10.p(user)));
            sb2.append("\n");
        }
        for (int i11 = 0; i11 < 7; i11++) {
            ArrayList arrayList = e02[i11];
            String displayName = DayOfWeek.values()[i11].getDisplayName(TextStyle.FULL, hd.E0().f22899y);
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
                    sb2.append(b1.a(b1Var.f17313a));
                    sb2.append(" - ");
                    sb2.append(b1.a(b1Var.f17314b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a10 = x1.b(i7).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a10 == null) {
            i10 = 0;
        } else {
            i10 = a10.utc_offset;
        }
        if ((rawOffset - i10) / 60 != 0 && a10 != null) {
            x1.b(i7);
            sb2.append(hd.a0(null, null, 2131752760, x1.e(a10, true)));
        }
        return sb2.toString();
    }

    public final void c0(int i7) {
        b1 b1Var;
        b1 b1Var2 = null;
        if (this.f17330f[i7].isEmpty()) {
            b1Var = null;
        } else {
            b1Var = (b1) jg.g.i(1, this.f17330f[i7]);
        }
        if (b1Var != null) {
            int i10 = (i7 + 6) % 7;
            if (!this.f17330f[i10].isEmpty()) {
                b1Var2 = (b1) jg.g.i(1, this.f17330f[i10]);
            }
            if (b1Var2 != null && b1Var2.f17314b > 1439) {
                b1Var2.f17314b = 1439;
                if (b1Var2.f17313a >= 1439) {
                    this.f17330f[i10].remove(b1Var2);
                }
                View B1 = this.f17326a.B1(i10);
                if (B1 instanceof h5) {
                    ((h5) B1).setValue(f0(this.f17330f[i10]));
                } else {
                    this.f17326a.f36781f3.O(true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(hd.M0(2131752764, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 16));
        this.f17327b = this.simpleActionBar.n(hd.M0(2131745947, null));
        d0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        p41 p41Var = new p41(this, new hi.u1(this, 11), new q4(this, 24), null);
        this.f17326a = p41Var;
        p41Var.r1();
        p41 p41Var2 = this.f17326a;
        p41Var2.f36781f3.f35132r = false;
        p41Var2.setSectionsDrawBackground(true);
        frameLayout.addView(this.f17326a, ha.c(-1.0f, -1));
        j0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z9) {
        if (this.f17327b == null) {
            return;
        }
        this.f17327b.a(g0(), z9);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        k41 k41Var;
        if (i7 == qs.E0) {
            j0();
        } else if (i7 == qs.f25050r3) {
            if (this.f17329e == null) {
                this.f17331n = x1.b(this.currentAccount).c();
            }
            p41 p41Var = this.f17326a;
            if (p41Var != null && (k41Var = p41Var.f36781f3) != null) {
                k41Var.O(true);
            }
        }
    }

    public final boolean g0() {
        throw new UnsupportedOperationException("Method not decompiled: kg.c1.g0():boolean");
    }

    @Override
    public final pj0 getListViewForSimpleGlass() {
        return this.f17326a;
    }

    public final void i0() {
        if (this.f17327b.f27354y.f55396f) {
            return;
        }
        if (!g0()) {
            finishFragment();
            return;
        }
        this.f17327b.b(true);
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.f17330f;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i7 = 0; i7 < arrayListArr.length; i7++) {
                if (arrayListArr[i7] != null) {
                    for (int i10 = 0; i10 < arrayListArr[i7].size(); i10++) {
                        b1 b1Var = (b1) arrayListArr[i7].get(i10);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i11 = i7 * 1440;
                        tL_businessWeeklyOpen.start_minute = b1Var.f17313a + i11;
                        tL_businessWeeklyOpen.end_minute = i11 + b1Var.f17314b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.d && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f17331n;
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
        getConnectionsManager().sendRequest(updatebusinessworkhours, new bi.j0(this, 18));
        getMessagesStorage().j2(b22, false);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        boolean z9;
        k41 k41Var;
        if (this.f17328c) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = b22.business_work_hours;
        if (tL_businessWorkHours != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
        if (z9) {
            String str = tL_businessWorkHours.timezone_id;
            this.f17331n = str;
            this.h = str;
            this.f17329e = e0(tL_businessWorkHours.weekly_open);
            this.f17330f = e0(b22.business_work_hours.weekly_open);
        } else {
            String c10 = x1.b(this.currentAccount).c();
            this.f17331n = c10;
            this.h = c10;
            this.f17329e = null;
            this.f17330f = new ArrayList[7];
            int i7 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f17330f;
                if (i7 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i7] = new ArrayList();
                if (i7 >= 0 && i7 < 5) {
                    this.f17330f[i7].add(new b1(0, 1439));
                }
                i7++;
            }
        }
        p41 p41Var = this.f17326a;
        if (p41Var != null && (k41Var = p41Var.f36781f3) != null) {
            k41Var.O(true);
        }
        d0(false);
        this.f17328c = true;
    }

    @Override
    public final boolean onFragmentCreate() {
        x1.b(this.currentAccount).g();
        this.f17331n = x1.b(this.currentAccount).c();
        getNotificationCenter().c(this, qs.E0);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.E0);
        super.onFragmentDestroy();
        i0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
