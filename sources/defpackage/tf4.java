package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class tf4 extends o39 implements tjb {
    public static final rf4[] k3 = {new rf4(2131232693, 2131745215, new TLRPC.TL_inputMessagesFilterPhotoVideo(), 0), new rf4(2131232692, 2131745218, new TLRPC.TL_inputMessagesFilterUrl(), 2), new rf4(2131232691, 2131745222, new TLRPC.TL_inputMessagesFilterDocument(), 1), new rf4(2131232694, 2131745213, new TLRPC.TL_inputMessagesFilterMusic(), 3), new rf4(2131232696, 2131745210, new TLRPC.TL_inputMessagesFilterRoundVoice(), 5)};
    public static final Pattern l3 = Pattern.compile("20[0-9]{1,2}");
    public static final Pattern m3 = Pattern.compile("(\\w{3,}) ([0-9]{0,4})");
    public static final Pattern n3 = Pattern.compile("([0-9]{0,4}) (\\w{2,})");
    public static final Pattern o3 = Pattern.compile("^([0-9]{1,4})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final Pattern p3 = Pattern.compile("^([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final int[] q3 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public final ArrayList f3;
    public final ArrayList g3;
    public final xe2 h3;
    public boolean i3;
    public final of4 j3;

    public tf4(Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.f3 = new ArrayList();
        this.g3 = new ArrayList();
        this.i3 = true;
        this.j3 = new of4(this);
        xe2 xe2Var = new xe2((byte) 2, this, false);
        this.h3 = xe2Var;
        xe2Var.i1(0);
        setLayoutManager(xe2Var);
        setAdapter(new gx0(this, (byte) 3));
        i(new oq1((byte) 4));
        setItemAnimator(new gb3());
        setWillNotDraw(false);
        setHideIfEmpty(false);
        setSelectorRadius(gl.L(28.0f));
        zkb.l(this, 20, bkb.h6, wjbVar);
    }

    public static void A1(int i, int i2, ArrayList arrayList) {
        int i3 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (i2 >= 2013 && i2 <= i3) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(i2, i, 1, 0, 0, 0);
            long timeInMillis2 = calendar.getTimeInMillis();
            if (timeInMillis2 <= timeInMillis) {
                calendar.add(2, 1);
                arrayList.add(new pf4(timeInMillis2, k96.D0().u0().format(timeInMillis2), calendar.getTimeInMillis() - 1));
            }
        }
    }

    public static void B1(String str, ArrayList arrayList) {
        arrayList.clear();
        if (str != null) {
            String trim = str.trim();
            if (trim.length() >= 3) {
                if (!k96.M0(2131745516, null).toLowerCase().startsWith(trim) && !"today".startsWith(trim)) {
                    if (!k96.M0(2131745515, null).toLowerCase().startsWith(trim) && !"yesterday".startsWith(trim)) {
                        Calendar calendar = Calendar.getInstance();
                        int i = -1;
                        if (trim.length() > 3) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
                            for (int i2 = 0; i2 < 7; i2++) {
                                calendar.set(7, i2);
                                if (k96.D0().A0().format(calendar.getTime()).toLowerCase().startsWith(trim) || simpleDateFormat.format(calendar.getTime()).toLowerCase().startsWith(trim)) {
                                    i = i2;
                                    break;
                                }
                            }
                        }
                        if (i >= 0) {
                            Calendar calendar2 = Calendar.getInstance();
                            long timeInMillis = calendar2.getTimeInMillis();
                            calendar2.set(7, i);
                            if (calendar2.getTimeInMillis() > timeInMillis) {
                                calendar2.setTimeInMillis(calendar2.getTimeInMillis() - 604800000);
                            }
                            int i3 = calendar2.get(1);
                            int i4 = calendar2.get(2);
                            int i5 = calendar2.get(5);
                            calendar2.set(i3, i4, i5, 0, 0, 0);
                            long timeInMillis2 = calendar2.getTimeInMillis();
                            calendar2.set(i3, i4, i5 + 1, 0, 0, 0);
                            arrayList.add(new pf4(timeInMillis2, k96.D0().A0().format(timeInMillis2), calendar2.getTimeInMillis() - 1));
                            return;
                        }
                        Matcher matcher = o3.matcher(trim);
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
                        Matcher matcher2 = p3.matcher(trim);
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
                                int i6 = parseInt5;
                                int i7 = Calendar.getInstance().get(1);
                                int i8 = parseInt3 - 1;
                                if (parseInt4 >= 0 && parseInt4 < 12 && i8 >= 0 && i8 < q3[parseInt4] && i6 >= 2013 && i6 <= i7) {
                                    Calendar calendar3 = Calendar.getInstance();
                                    calendar3.set(i6, parseInt4, parseInt3, 0, 0, 0);
                                    long timeInMillis3 = calendar3.getTimeInMillis();
                                    calendar3.set(i6, parseInt4, parseInt3 + 1, 0, 0, 0);
                                    arrayList.add(new pf4(timeInMillis3, k96.D0().C0().format(timeInMillis3), calendar3.getTimeInMillis() - 1));
                                    return;
                                }
                                return;
                            }
                            return;
                        } else if (l3.matcher(trim).matches()) {
                            int intValue = Integer.valueOf(trim).intValue();
                            int i9 = Calendar.getInstance().get(1);
                            if (intValue < 2013) {
                                while (i9 >= 2013) {
                                    Calendar calendar4 = Calendar.getInstance();
                                    calendar4.set(i9, 0, 1, 0, 0, 0);
                                    long timeInMillis4 = calendar4.getTimeInMillis();
                                    calendar4.set(i9 + 1, 0, 1, 0, 0, 0);
                                    arrayList.add(new pf4(timeInMillis4, Integer.toString(i9), calendar4.getTimeInMillis() - 1));
                                    i9--;
                                }
                                return;
                            } else if (intValue <= i9) {
                                Calendar calendar5 = Calendar.getInstance();
                                calendar5.set(intValue, 0, 1, 0, 0, 0);
                                long timeInMillis5 = calendar5.getTimeInMillis();
                                calendar5.set(intValue + 1, 0, 1, 0, 0, 0);
                                arrayList.add(new pf4(timeInMillis5, Integer.toString(intValue), calendar5.getTimeInMillis() - 1));
                                return;
                            } else {
                                return;
                            }
                        } else {
                            Matcher matcher3 = m3.matcher(trim);
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
                            Matcher matcher4 = n3.matcher(trim);
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
                                    for (int i10 = Calendar.getInstance().get(1); i10 >= 2013; i10--) {
                                        Calendar calendar6 = Calendar.getInstance();
                                        calendar6.set(i10, C13, 1, 0, 0, 0);
                                        long timeInMillis7 = calendar6.getTimeInMillis();
                                        if (timeInMillis7 <= timeInMillis6) {
                                            calendar6.add(2, 1);
                                            arrayList.add(new pf4(timeInMillis7, k96.D0().u0().format(timeInMillis7), calendar6.getTimeInMillis() - 1));
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
                    int i11 = calendar7.get(1);
                    int i12 = calendar7.get(2);
                    int i13 = calendar7.get(5);
                    calendar7.set(i11, i12, i13, 0, 0, 0);
                    calendar7.set(i11, i12, i13 + 1, 0, 0, 0);
                    arrayList.add(new pf4(calendar7.getTimeInMillis() - 86400000, k96.M0(2131745515, null), calendar7.getTimeInMillis() - 86400001));
                    return;
                }
                Calendar calendar8 = Calendar.getInstance();
                int i14 = calendar8.get(1);
                int i15 = calendar8.get(2);
                int i16 = calendar8.get(5);
                calendar8.set(i14, i15, i16, 0, 0, 0);
                long timeInMillis8 = calendar8.getTimeInMillis();
                calendar8.set(i14, i15, i16 + 1, 0, 0, 0);
                arrayList.add(new pf4(timeInMillis8, k96.M0(2131745516, null), calendar8.getTimeInMillis() - 1));
            }
        }
    }

    public static int C1(String str) {
        String[] strArr = {k96.M0(2131748894, null).toLowerCase(), k96.M0(2131750817, null).toLowerCase(), k96.M0(2131748491, null).toLowerCase(), k96.M0(2131754170, null).toLowerCase(), k96.M0(2131748470, null).toLowerCase(), k96.M0(2131748872, null).toLowerCase(), k96.M0(2131748874, null).toLowerCase(), k96.M0(2131753892, null).toLowerCase(), k96.M0(2131745373, null).toLowerCase(), k96.M0(2131747637, null).toLowerCase(), k96.M0(2131747642, null).toLowerCase(), k96.M0(2131751593, null).toLowerCase()};
        String[] strArr2 = new String[12];
        Calendar calendar = Calendar.getInstance();
        for (int i = 1; i <= 12; i++) {
            calendar.set(0, 0, 0, 0, 0, 0);
            calendar.set(2, i);
            strArr2[i - 1] = calendar.getDisplayName(2, 2, Locale.ENGLISH).toLowerCase();
        }
        for (int i2 = 0; i2 < 12; i2++) {
            if (strArr2[i2].startsWith(str) || strArr[i2].startsWith(str)) {
                return i2;
            }
        }
        return -1;
    }

    public static void z1(int i, int i2, ArrayList arrayList) {
        int i3 = i2;
        if (i3 >= 0 && i3 < 12 && i >= 0 && i < q3[i3]) {
            int i4 = Calendar.getInstance().get(1);
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance();
            int i5 = i4;
            while (i5 >= 2013) {
                if (i3 != 1 || i != 28 || gregorianCalendar.isLeapYear(i5)) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(i5, i3, i + 1, 0, 0, 0);
                    long timeInMillis2 = calendar.getTimeInMillis();
                    if (timeInMillis2 <= timeInMillis) {
                        calendar.set(i5, i2, i + 2, 0, 0, 0);
                        long timeInMillis3 = calendar.getTimeInMillis() - 1;
                        if (i5 == i4) {
                            arrayList.add(new pf4(timeInMillis2, k96.D0().p0().format(timeInMillis2), timeInMillis3));
                        } else {
                            arrayList.add(new pf4(timeInMillis2, k96.D0().C0().format(timeInMillis2), timeInMillis3));
                        }
                    }
                }
                i5--;
                i3 = i2;
            }
        }
    }

    public final void D1(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        String m;
        ArrayList arrayList3 = this.g3;
        arrayList3.clear();
        ArrayList arrayList4 = this.f3;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    if (y6c.h(y6c.t0).f().id == user.id) {
                        m = k96.M0(2131745709, null);
                    } else {
                        m = qu2.m(10, user.first_name, user.last_name);
                    }
                    rf4 rf4Var = new rf4(2131232695, 4, m);
                    rf4Var.f = user;
                    arrayList4.add(rf4Var);
                } else if (obj instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj;
                    String str = chat.title;
                    if (str.length() > 12) {
                        str = str.substring(0, 10).concat("...");
                    }
                    rf4 rf4Var2 = new rf4(2131232695, 4, str);
                    rf4Var2.f = chat;
                    arrayList4.add(rf4Var2);
                }
            }
        }
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                pf4 pf4Var = (pf4) arrayList2.get(i2);
                rf4 rf4Var3 = new rf4(2131232690, 6, pf4Var.a);
                rf4Var3.g = pf4Var;
                arrayList4.add(rf4Var3);
            }
        }
        if (z) {
            arrayList4.add(new rf4(2131230995, 2131754147, null, 7));
        }
        if (getAdapter() != null) {
            e31 e31Var = new e31((byte) 4, (Object) getAdapter(), false);
            vu7.a(this.j3, true).b(e31Var);
            if (!arrayList4.isEmpty() && e31Var.b) {
                this.h3.g1(0, 0);
            }
        }
    }

    public ArrayList<blb> getThemeDescriptions() {
        ArrayList<blb> arrayList = new ArrayList<>();
        arrayList.add(new blb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.d7));
        arrayList.add(new blb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.e7));
        return arrayList;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.i3) {
            canvas.drawRect(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), bkb.j0);
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
        for (int i = 0; i < getCachedChildCount(); i++) {
            View P = P(i);
            if (P instanceof qf4) {
                ((qf4) P).updateColors();
            }
        }
        for (int i2 = 0; i2 < getAttachedScrapChildCount(); i2++) {
            View O = O(i2);
            if (O instanceof qf4) {
                ((qf4) O).updateColors();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
