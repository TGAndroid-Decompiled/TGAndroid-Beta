package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import bi.k5;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.pj0;
public final class q0 extends pj0 implements a6 {
    public static final o0[] j3 = {new o0(2131232688, 2131745408, new TLRPC.TL_inputMessagesFilterPhotoVideo(), 0), new o0(2131232687, 2131745411, new TLRPC.TL_inputMessagesFilterUrl(), 2), new o0(2131232686, 2131745415, new TLRPC.TL_inputMessagesFilterDocument(), 1), new o0(2131232689, 2131745406, new TLRPC.TL_inputMessagesFilterMusic(), 3), new o0(2131232691, 2131745403, new TLRPC.TL_inputMessagesFilterRoundVoice(), 5)};
    public static final Pattern f16882k3 = Pattern.compile("20[0-9]{1,2}");
    public static final Pattern f16883l3 = Pattern.compile("(\\w{3,}) ([0-9]{0,4})");
    public static final Pattern f16884m3 = Pattern.compile("([0-9]{0,4}) (\\w{2,})");
    public static final Pattern f16885n3 = Pattern.compile("^([0-9]{1,4})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final Pattern f16886o3 = Pattern.compile("^([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final int[] f16887p3 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public final ArrayList f16888e3;
    public final ArrayList f16889f3;
    public final i0 f16890g3;
    public boolean f16891h3;
    public final l0 f16892i3;

    public q0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.f16888e3 = new ArrayList();
        this.f16889f3 = new ArrayList();
        this.f16891h3 = true;
        this.f16892i3 = new l0(this);
        i0 i0Var = new i0((Object) this, 0);
        this.f16890g3 = i0Var;
        i0Var.j1(0);
        setLayoutManager(i0Var);
        setAdapter(new k5(this, 1));
        i(new di.k(3));
        setItemAnimator(new v4.k());
        setWillNotDraw(false);
        setHideIfEmpty(false);
        setSelectorRadius(org.telegram.messenger.g0.L(28.0f));
        r6.m(this, 20, k6.f27940i6, f6Var);
    }

    public static void A1(int i7, int i10, ArrayList arrayList) {
        int i11 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (i10 >= 2013 && i10 <= i11) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(i10, i7, 1, 0, 0, 0);
            long timeInMillis2 = calendar.getTimeInMillis();
            if (timeInMillis2 <= timeInMillis) {
                calendar.add(2, 1);
                arrayList.add(new m0(timeInMillis2, hd.E0().v0().format(timeInMillis2), calendar.getTimeInMillis() - 1));
            }
        }
    }

    public static void B1(String str, ArrayList arrayList) {
        arrayList.clear();
        if (str != null) {
            String trim = str.trim();
            if (trim.length() >= 3) {
                if (!hd.M0(2131745709, null).toLowerCase().startsWith(trim) && !"today".startsWith(trim)) {
                    if (!hd.M0(2131745708, null).toLowerCase().startsWith(trim) && !"yesterday".startsWith(trim)) {
                        Calendar calendar = Calendar.getInstance();
                        int i7 = -1;
                        if (trim.length() > 3) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
                            for (int i10 = 0; i10 < 7; i10++) {
                                calendar.set(7, i10);
                                if (hd.E0().B0().format(calendar.getTime()).toLowerCase().startsWith(trim) || simpleDateFormat.format(calendar.getTime()).toLowerCase().startsWith(trim)) {
                                    i7 = i10;
                                    break;
                                }
                            }
                        }
                        if (i7 >= 0) {
                            Calendar calendar2 = Calendar.getInstance();
                            long timeInMillis = calendar2.getTimeInMillis();
                            calendar2.set(7, i7);
                            if (calendar2.getTimeInMillis() > timeInMillis) {
                                calendar2.setTimeInMillis(calendar2.getTimeInMillis() - 604800000);
                            }
                            int i11 = calendar2.get(1);
                            int i12 = calendar2.get(2);
                            int i13 = calendar2.get(5);
                            calendar2.set(i11, i12, i13, 0, 0, 0);
                            long timeInMillis2 = calendar2.getTimeInMillis();
                            calendar2.set(i11, i12, i13 + 1, 0, 0, 0);
                            arrayList.add(new m0(timeInMillis2, hd.E0().B0().format(timeInMillis2), calendar2.getTimeInMillis() - 1));
                            return;
                        }
                        Matcher matcher = f16885n3.matcher(trim);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(3);
                            int parseInt = Integer.parseInt(group);
                            int parseInt2 = Integer.parseInt(group2);
                            if (parseInt > 0 && parseInt <= 31) {
                                if (parseInt2 >= 2013 && parseInt <= 12) {
                                    A1(parseInt - 1, parseInt2, arrayList);
                                    return;
                                } else if (parseInt2 <= 12) {
                                    z1(parseInt - 1, parseInt2 - 1, arrayList);
                                    return;
                                } else {
                                    return;
                                }
                            } else if (parseInt >= 2013 && parseInt2 <= 12) {
                                A1(parseInt2 - 1, parseInt, arrayList);
                                return;
                            } else {
                                return;
                            }
                        }
                        Matcher matcher2 = f16886o3.matcher(trim);
                        if (matcher2.matches()) {
                            String group3 = matcher2.group(1);
                            String group4 = matcher2.group(3);
                            String group5 = matcher2.group(5);
                            if (matcher2.group(2).equals(matcher2.group(4))) {
                                int parseInt3 = Integer.parseInt(group3);
                                int parseInt4 = Integer.parseInt(group4) - 1;
                                int parseInt5 = Integer.parseInt(group5);
                                if (parseInt5 >= 10 && parseInt5 <= 99) {
                                    parseInt5 += 2000;
                                }
                                int i14 = parseInt5;
                                int i15 = Calendar.getInstance().get(1);
                                int i16 = parseInt3 - 1;
                                if (parseInt4 >= 0 && parseInt4 < 12 && i16 >= 0 && i16 < f16887p3[parseInt4] && i14 >= 2013 && i14 <= i15) {
                                    Calendar calendar3 = Calendar.getInstance();
                                    calendar3.set(i14, parseInt4, parseInt3, 0, 0, 0);
                                    long timeInMillis3 = calendar3.getTimeInMillis();
                                    calendar3.set(i14, parseInt4, parseInt3 + 1, 0, 0, 0);
                                    arrayList.add(new m0(timeInMillis3, hd.E0().D0().format(timeInMillis3), calendar3.getTimeInMillis() - 1));
                                    return;
                                }
                                return;
                            }
                            return;
                        } else if (f16882k3.matcher(trim).matches()) {
                            int intValue = Integer.valueOf(trim).intValue();
                            int i17 = Calendar.getInstance().get(1);
                            if (intValue < 2013) {
                                while (i17 >= 2013) {
                                    Calendar calendar4 = Calendar.getInstance();
                                    calendar4.set(i17, 0, 1, 0, 0, 0);
                                    long timeInMillis4 = calendar4.getTimeInMillis();
                                    calendar4.set(i17 + 1, 0, 1, 0, 0, 0);
                                    arrayList.add(new m0(timeInMillis4, Integer.toString(i17), calendar4.getTimeInMillis() - 1));
                                    i17--;
                                }
                                return;
                            } else if (intValue <= i17) {
                                Calendar calendar5 = Calendar.getInstance();
                                calendar5.set(intValue, 0, 1, 0, 0, 0);
                                long timeInMillis5 = calendar5.getTimeInMillis();
                                calendar5.set(intValue + 1, 0, 1, 0, 0, 0);
                                arrayList.add(new m0(timeInMillis5, Integer.toString(intValue), calendar5.getTimeInMillis() - 1));
                                return;
                            } else {
                                return;
                            }
                        } else {
                            Matcher matcher3 = f16883l3.matcher(trim);
                            if (matcher3.matches()) {
                                String group6 = matcher3.group(1);
                                String group7 = matcher3.group(2);
                                int C1 = C1(group6);
                                if (C1 >= 0) {
                                    int intValue2 = Integer.valueOf(group7).intValue();
                                    if (intValue2 > 0 && intValue2 <= 31) {
                                        z1(intValue2 - 1, C1, arrayList);
                                        return;
                                    } else if (intValue2 >= 2013) {
                                        A1(C1, intValue2, arrayList);
                                        return;
                                    }
                                }
                            }
                            Matcher matcher4 = f16884m3.matcher(trim);
                            if (matcher4.matches()) {
                                String group8 = matcher4.group(1);
                                int C12 = C1(matcher4.group(2));
                                if (C12 >= 0) {
                                    int intValue3 = Integer.valueOf(group8).intValue();
                                    if (intValue3 > 0 && intValue3 <= 31) {
                                        z1(intValue3 - 1, C12, arrayList);
                                        return;
                                    } else if (intValue3 >= 2013) {
                                        A1(C12, intValue3, arrayList);
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(trim) && trim.length() > 2) {
                                int C13 = C1(trim);
                                long timeInMillis6 = Calendar.getInstance().getTimeInMillis();
                                if (C13 >= 0) {
                                    for (int i18 = Calendar.getInstance().get(1); i18 >= 2013; i18--) {
                                        Calendar calendar6 = Calendar.getInstance();
                                        calendar6.set(i18, C13, 1, 0, 0, 0);
                                        long timeInMillis7 = calendar6.getTimeInMillis();
                                        if (timeInMillis7 <= timeInMillis6) {
                                            calendar6.add(2, 1);
                                            arrayList.add(new m0(timeInMillis7, hd.E0().v0().format(timeInMillis7), calendar6.getTimeInMillis() - 1));
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    Calendar calendar7 = Calendar.getInstance();
                    int i19 = calendar7.get(1);
                    int i20 = calendar7.get(2);
                    int i21 = calendar7.get(5);
                    calendar7.set(i19, i20, i21, 0, 0, 0);
                    calendar7.set(i19, i20, i21 + 1, 0, 0, 0);
                    arrayList.add(new m0(calendar7.getTimeInMillis() - 86400000, hd.M0(2131745708, null), calendar7.getTimeInMillis() - 86400001));
                    return;
                }
                Calendar calendar8 = Calendar.getInstance();
                int i22 = calendar8.get(1);
                int i23 = calendar8.get(2);
                int i24 = calendar8.get(5);
                calendar8.set(i22, i23, i24, 0, 0, 0);
                long timeInMillis8 = calendar8.getTimeInMillis();
                calendar8.set(i22, i23, i24 + 1, 0, 0, 0);
                arrayList.add(new m0(timeInMillis8, hd.M0(2131745709, null), calendar8.getTimeInMillis() - 1));
            }
        }
    }

    public static int C1(String str) {
        String[] strArr = {hd.M0(2131749085, null).toLowerCase(), hd.M0(2131750830, null).toLowerCase(), hd.M0(2131748682, null).toLowerCase(), hd.M0(2131754173, null).toLowerCase(), hd.M0(2131748661, null).toLowerCase(), hd.M0(2131749063, null).toLowerCase(), hd.M0(2131749065, null).toLowerCase(), hd.M0(2131753895, null).toLowerCase(), hd.M0(2131745566, null).toLowerCase(), hd.M0(2131747829, null).toLowerCase(), hd.M0(2131747834, null).toLowerCase(), hd.M0(2131751606, null).toLowerCase()};
        String[] strArr2 = new String[12];
        Calendar calendar = Calendar.getInstance();
        for (int i7 = 1; i7 <= 12; i7++) {
            calendar.set(0, 0, 0, 0, 0, 0);
            calendar.set(2, i7);
            strArr2[i7 - 1] = calendar.getDisplayName(2, 2, Locale.ENGLISH).toLowerCase();
        }
        for (int i10 = 0; i10 < 12; i10++) {
            if (strArr2[i10].startsWith(str) || strArr[i10].startsWith(str)) {
                return i10;
            }
        }
        return -1;
    }

    public static void z1(int i7, int i10, ArrayList arrayList) {
        int i11 = i10;
        if (i11 >= 0 && i11 < 12 && i7 >= 0 && i7 < f16887p3[i11]) {
            int i12 = Calendar.getInstance().get(1);
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance();
            int i13 = i12;
            while (i13 >= 2013) {
                if (i11 != 1 || i7 != 28 || gregorianCalendar.isLeapYear(i13)) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(i13, i11, i7 + 1, 0, 0, 0);
                    long timeInMillis2 = calendar.getTimeInMillis();
                    if (timeInMillis2 <= timeInMillis) {
                        calendar.set(i13, i10, i7 + 2, 0, 0, 0);
                        long timeInMillis3 = calendar.getTimeInMillis() - 1;
                        if (i13 == i12) {
                            arrayList.add(new m0(timeInMillis2, hd.E0().q0().format(timeInMillis2), timeInMillis3));
                        } else {
                            arrayList.add(new m0(timeInMillis2, hd.E0().D0().format(timeInMillis2), timeInMillis3));
                        }
                    }
                }
                i13--;
                i11 = i10;
            }
        }
    }

    public final void D1(ArrayList arrayList, ArrayList arrayList2, boolean z9) {
        String m10;
        ArrayList arrayList3 = this.f16889f3;
        arrayList3.clear();
        ArrayList arrayList4 = this.f16888e3;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Object obj = arrayList.get(i7);
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    if (p10.i(p10.f24459s0).f().f27101id == user.f27101id) {
                        m10 = hd.M0(2131745902, null);
                    } else {
                        m10 = g5.m(10, user.first_name, user.last_name);
                    }
                    o0 o0Var = new o0(2131232690, 4, m10);
                    o0Var.f16871f = user;
                    arrayList4.add(o0Var);
                } else if (obj instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj;
                    String str = chat.title;
                    if (str.length() > 12) {
                        str = rf.b.q(str.substring(0, 10), "...");
                    }
                    o0 o0Var2 = new o0(2131232690, 4, str);
                    o0Var2.f16871f = chat;
                    arrayList4.add(o0Var2);
                }
            }
        }
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                m0 m0Var = (m0) arrayList2.get(i10);
                o0 o0Var3 = new o0(2131232685, 6, m0Var.f16835a);
                o0Var3.f16872g = m0Var;
                arrayList4.add(o0Var3);
            }
        }
        if (z9) {
            arrayList4.add(new o0(2131230993, 2131754150, null, 7));
        }
        if (getAdapter() != null) {
            ca.i iVar = new ca.i(3, getAdapter(), false);
            v4.o.c(this.f16892i3, true).b(iVar);
            if (!arrayList4.isEmpty() && iVar.f6015b) {
                this.f16890g3.h1(0, 0);
            }
        }
    }

    public ArrayList<t6> getThemeDescriptions() {
        ArrayList<t6> arrayList = new ArrayList<>();
        arrayList.add(new t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (s6) null, k6.f27868e7));
        arrayList.add(new t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (s6) null, k6.f27887f7));
        return arrayList;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f16891h3) {
            canvas.drawRect(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), k6.f27971k0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        for (int i7 = 0; i7 < getCachedChildCount(); i7++) {
            View P = P(i7);
            if (P instanceof n0) {
                ((n0) P).updateColors();
            }
        }
        for (int i10 = 0; i10 < getAttachedScrapChildCount(); i10++) {
            View O = O(i10);
            if (O instanceof n0) {
                ((n0) O).updateColors();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
