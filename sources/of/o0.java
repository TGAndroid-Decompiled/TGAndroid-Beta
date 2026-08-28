package of;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import gh.t3;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.wk0;
public final class o0 extends wk0 {
    public static final m0[] Y2 = {new m0(R.drawable.search_media_filled, R.string.SharedMediaTab2, new TLRPC.TL_inputMessagesFilterPhotoVideo(), 0), new m0(R.drawable.search_links_filled, R.string.SharedLinksTab2, new TLRPC.TL_inputMessagesFilterUrl(), 2), new m0(R.drawable.search_files_filled, R.string.SharedFilesTab2, new TLRPC.TL_inputMessagesFilterDocument(), 1), new m0(R.drawable.search_music_filled, R.string.SharedMusicTab2, new TLRPC.TL_inputMessagesFilterMusic(), 3), new m0(R.drawable.search_voice_filled, R.string.SharedVoiceTab2, new TLRPC.TL_inputMessagesFilterRoundVoice(), 5)};
    public static final Pattern Z2 = Pattern.compile("20[0-9]{1,2}");
    public static final Pattern a3 = Pattern.compile("(\\w{3,}) ([0-9]{0,4})");
    public static final Pattern f19434b3 = Pattern.compile("([0-9]{0,4}) (\\w{2,})");
    public static final Pattern f19435c3 = Pattern.compile("^([0-9]{1,4})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final Pattern f19436d3 = Pattern.compile("^([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final int[] f19437e3 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public final ArrayList T2;
    public final ArrayList U2;
    public final g0 V2;
    public boolean W2;
    public final j0 X2;

    public o0(Context context, b6 b6Var) {
        super(context, b6Var);
        this.T2 = new ArrayList();
        this.U2 = new ArrayList();
        this.W2 = true;
        this.X2 = new j0(this);
        g0 g0Var = new g0((Object) this, 0);
        this.V2 = g0Var;
        g0Var.j1(0);
        setLayoutManager(g0Var);
        setAdapter(new t3(this, 1));
        i(new ih.l(1));
        setItemAnimator(new f2.n());
        setWillNotDraw(false);
        setHideIfEmpty(false);
        setSelectorRadius(AndroidUtilities.dp(28.0f));
        setSelectorDrawableColor(f6.v0(f6.f23092i6, this.f34260l2));
    }

    public static void w1(int i9, int i10, ArrayList arrayList) {
        int i11 = i10;
        if (i11 >= 0 && i11 < 12 && i9 >= 0 && i9 < f19437e3[i11]) {
            int i12 = Calendar.getInstance().get(1);
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance();
            int i13 = i12;
            while (i13 >= 2013) {
                if (i11 != 1 || i9 != 28 || gregorianCalendar.isLeapYear(i13)) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(i13, i11, i9 + 1, 0, 0, 0);
                    long timeInMillis2 = calendar.getTimeInMillis();
                    if (timeInMillis2 <= timeInMillis) {
                        calendar.set(i13, i10, i9 + 2, 0, 0, 0);
                        long timeInMillis3 = calendar.getTimeInMillis() - 1;
                        if (i13 == i12) {
                            arrayList.add(new k0(timeInMillis2, timeInMillis3, LocaleController.getInstance().getFormatterDayMonth().format(timeInMillis2)));
                        } else {
                            arrayList.add(new k0(timeInMillis2, timeInMillis3, LocaleController.getInstance().getFormatterYearMax().format(timeInMillis2)));
                        }
                    }
                }
                i13--;
                i11 = i10;
            }
        }
    }

    public static void x1(int i9, int i10, ArrayList arrayList) {
        int i11 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (i10 >= 2013 && i10 <= i11) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(i10, i9, 1, 0, 0, 0);
            long timeInMillis2 = calendar.getTimeInMillis();
            if (timeInMillis2 <= timeInMillis) {
                calendar.add(2, 1);
                arrayList.add(new k0(timeInMillis2, calendar.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterMonthYear().format(timeInMillis2)));
            }
        }
    }

    public static void y1(String str, ArrayList arrayList) {
        arrayList.clear();
        if (str != null) {
            String trim = str.trim();
            if (trim.length() >= 3) {
                if (!LocaleController.getString(R.string.SearchTipToday).toLowerCase().startsWith(trim) && !"today".startsWith(trim)) {
                    if (!LocaleController.getString(R.string.SearchTipYesterday).toLowerCase().startsWith(trim) && !"yesterday".startsWith(trim)) {
                        Calendar calendar = Calendar.getInstance();
                        int i9 = -1;
                        if (trim.length() > 3) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
                            for (int i10 = 0; i10 < 7; i10++) {
                                calendar.set(7, i10);
                                if (LocaleController.getInstance().getFormatterWeekLong().format(calendar.getTime()).toLowerCase().startsWith(trim) || simpleDateFormat.format(calendar.getTime()).toLowerCase().startsWith(trim)) {
                                    i9 = i10;
                                    break;
                                }
                            }
                        }
                        if (i9 >= 0) {
                            Calendar calendar2 = Calendar.getInstance();
                            long timeInMillis = calendar2.getTimeInMillis();
                            calendar2.set(7, i9);
                            if (calendar2.getTimeInMillis() > timeInMillis) {
                                calendar2.setTimeInMillis(calendar2.getTimeInMillis() - 604800000);
                            }
                            int i11 = calendar2.get(1);
                            int i12 = calendar2.get(2);
                            int i13 = calendar2.get(5);
                            calendar2.set(i11, i12, i13, 0, 0, 0);
                            long timeInMillis2 = calendar2.getTimeInMillis();
                            calendar2.set(i11, i12, i13 + 1, 0, 0, 0);
                            arrayList.add(new k0(timeInMillis2, calendar2.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterWeekLong().format(timeInMillis2)));
                            return;
                        }
                        Matcher matcher = f19435c3.matcher(trim);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(3);
                            int parseInt = Integer.parseInt(group);
                            int parseInt2 = Integer.parseInt(group2);
                            if (parseInt > 0 && parseInt <= 31) {
                                if (parseInt2 >= 2013 && parseInt <= 12) {
                                    x1(parseInt - 1, parseInt2, arrayList);
                                    return;
                                } else if (parseInt2 <= 12) {
                                    w1(parseInt - 1, parseInt2 - 1, arrayList);
                                    return;
                                } else {
                                    return;
                                }
                            } else if (parseInt >= 2013 && parseInt2 <= 12) {
                                x1(parseInt2 - 1, parseInt, arrayList);
                                return;
                            } else {
                                return;
                            }
                        }
                        Matcher matcher2 = f19436d3.matcher(trim);
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
                                if (parseInt4 >= 0 && parseInt4 < 12 && i16 >= 0 && i16 < f19437e3[parseInt4] && i14 >= 2013 && i14 <= i15) {
                                    Calendar calendar3 = Calendar.getInstance();
                                    calendar3.set(i14, parseInt4, parseInt3, 0, 0, 0);
                                    long timeInMillis3 = calendar3.getTimeInMillis();
                                    calendar3.set(i14, parseInt4, parseInt3 + 1, 0, 0, 0);
                                    arrayList.add(new k0(timeInMillis3, calendar3.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterYearMax().format(timeInMillis3)));
                                    return;
                                }
                                return;
                            }
                            return;
                        } else if (Z2.matcher(trim).matches()) {
                            int intValue = Integer.valueOf(trim).intValue();
                            int i17 = Calendar.getInstance().get(1);
                            if (intValue < 2013) {
                                while (i17 >= 2013) {
                                    Calendar calendar4 = Calendar.getInstance();
                                    calendar4.set(i17, 0, 1, 0, 0, 0);
                                    long timeInMillis4 = calendar4.getTimeInMillis();
                                    calendar4.set(i17 + 1, 0, 1, 0, 0, 0);
                                    arrayList.add(new k0(timeInMillis4, calendar4.getTimeInMillis() - 1, Integer.toString(i17)));
                                    i17--;
                                }
                                return;
                            } else if (intValue <= i17) {
                                Calendar calendar5 = Calendar.getInstance();
                                calendar5.set(intValue, 0, 1, 0, 0, 0);
                                long timeInMillis5 = calendar5.getTimeInMillis();
                                calendar5.set(intValue + 1, 0, 1, 0, 0, 0);
                                arrayList.add(new k0(timeInMillis5, calendar5.getTimeInMillis() - 1, Integer.toString(intValue)));
                                return;
                            } else {
                                return;
                            }
                        } else {
                            Matcher matcher3 = a3.matcher(trim);
                            if (matcher3.matches()) {
                                String group6 = matcher3.group(1);
                                String group7 = matcher3.group(2);
                                int z12 = z1(group6);
                                if (z12 >= 0) {
                                    int intValue2 = Integer.valueOf(group7).intValue();
                                    if (intValue2 > 0 && intValue2 <= 31) {
                                        w1(intValue2 - 1, z12, arrayList);
                                        return;
                                    } else if (intValue2 >= 2013) {
                                        x1(z12, intValue2, arrayList);
                                        return;
                                    }
                                }
                            }
                            Matcher matcher4 = f19434b3.matcher(trim);
                            if (matcher4.matches()) {
                                String group8 = matcher4.group(1);
                                int z13 = z1(matcher4.group(2));
                                if (z13 >= 0) {
                                    int intValue3 = Integer.valueOf(group8).intValue();
                                    if (intValue3 > 0 && intValue3 <= 31) {
                                        w1(intValue3 - 1, z13, arrayList);
                                        return;
                                    } else if (intValue3 >= 2013) {
                                        x1(z13, intValue3, arrayList);
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(trim) && trim.length() > 2) {
                                int z14 = z1(trim);
                                long timeInMillis6 = Calendar.getInstance().getTimeInMillis();
                                if (z14 >= 0) {
                                    for (int i18 = Calendar.getInstance().get(1); i18 >= 2013; i18--) {
                                        Calendar calendar6 = Calendar.getInstance();
                                        calendar6.set(i18, z14, 1, 0, 0, 0);
                                        long timeInMillis7 = calendar6.getTimeInMillis();
                                        if (timeInMillis7 <= timeInMillis6) {
                                            calendar6.add(2, 1);
                                            arrayList.add(new k0(timeInMillis7, calendar6.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterMonthYear().format(timeInMillis7)));
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
                    arrayList.add(new k0(calendar7.getTimeInMillis() - 86400000, calendar7.getTimeInMillis() - 86400001, LocaleController.getString(R.string.SearchTipYesterday)));
                    return;
                }
                Calendar calendar8 = Calendar.getInstance();
                int i22 = calendar8.get(1);
                int i23 = calendar8.get(2);
                int i24 = calendar8.get(5);
                calendar8.set(i22, i23, i24, 0, 0, 0);
                long timeInMillis8 = calendar8.getTimeInMillis();
                calendar8.set(i22, i23, i24 + 1, 0, 0, 0);
                arrayList.add(new k0(timeInMillis8, calendar8.getTimeInMillis() - 1, LocaleController.getString(R.string.SearchTipToday)));
            }
        }
    }

    public static int z1(String str) {
        String[] strArr = {LocaleController.getString(R.string.January).toLowerCase(), LocaleController.getString(R.string.February).toLowerCase(), LocaleController.getString(R.string.March).toLowerCase(), LocaleController.getString(R.string.April).toLowerCase(), LocaleController.getString(R.string.May).toLowerCase(), LocaleController.getString(R.string.June).toLowerCase(), LocaleController.getString(R.string.July).toLowerCase(), LocaleController.getString(R.string.August).toLowerCase(), LocaleController.getString(R.string.September).toLowerCase(), LocaleController.getString(R.string.October).toLowerCase(), LocaleController.getString(R.string.November).toLowerCase(), LocaleController.getString(R.string.December).toLowerCase()};
        String[] strArr2 = new String[12];
        Calendar calendar = Calendar.getInstance();
        for (int i9 = 1; i9 <= 12; i9++) {
            calendar.set(0, 0, 0, 0, 0, 0);
            calendar.set(2, i9);
            strArr2[i9 - 1] = calendar.getDisplayName(2, 2, Locale.ENGLISH).toLowerCase();
        }
        for (int i10 = 0; i10 < 12; i10++) {
            if (strArr2[i10].startsWith(str) || strArr[i10].startsWith(str)) {
                return i10;
            }
        }
        return -1;
    }

    public final void A1(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        String formatName;
        ArrayList arrayList3 = this.U2;
        arrayList3.clear();
        ArrayList arrayList4 = this.T2;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        if (arrayList != null) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                Object obj = arrayList.get(i9);
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f22527id == user.f22527id) {
                        formatName = LocaleController.getString(R.string.SavedMessages);
                    } else {
                        formatName = ContactsController.formatName(user.first_name, user.last_name, 10);
                    }
                    m0 m0Var = new m0(R.drawable.search_users_filled, 4, formatName);
                    m0Var.f19422f = user;
                    arrayList4.add(m0Var);
                } else if (obj instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj;
                    String str = chat.title;
                    if (str.length() > 12) {
                        str = ta.b.j(str.substring(0, 10), "...");
                    }
                    m0 m0Var2 = new m0(R.drawable.search_users_filled, 4, str);
                    m0Var2.f19422f = chat;
                    arrayList4.add(m0Var2);
                }
            }
        }
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                k0 k0Var = (k0) arrayList2.get(i10);
                m0 m0Var3 = new m0(R.drawable.search_date_filled, 6, k0Var.f19395a);
                m0Var3.f19423g = k0Var;
                arrayList4.add(m0Var3);
            }
        }
        if (z10) {
            arrayList4.add(new m0(R.drawable.chats_archive, R.string.ArchiveSearchFilter, null, 7));
        }
        if (getAdapter() != null) {
            c2.t tVar = new c2.t(getAdapter(), 6);
            f2.s.c(this.X2, true).a(tVar);
            if (!arrayList4.isEmpty() && tVar.f2233b) {
                this.V2.h1(0, 0);
            }
        }
    }

    public final void B1() {
        getRecycledViewPool().a();
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof l0) {
                int i10 = l0.f19403f;
                ((l0) childAt).a();
            }
        }
        for (int i11 = 0; i11 < getCachedChildCount(); i11++) {
            View P = P(i11);
            if (P instanceof l0) {
                int i12 = l0.f19403f;
                ((l0) P).a();
            }
        }
        for (int i13 = 0; i13 < getAttachedScrapChildCount(); i13++) {
            View O = O(i13);
            if (O instanceof l0) {
                int i14 = l0.f19403f;
                ((l0) O).a();
            }
        }
        setSelectorDrawableColor(f6.v0(f6.f23092i6, this.f34260l2));
    }

    public ArrayList<h6> getThemeDescriptions() {
        ArrayList<h6> arrayList = new ArrayList<>();
        arrayList.add(new h6(this, 0, null, null, null, null, f6.f23020e7));
        arrayList.add(new h6(this, 0, null, null, null, null, f6.f23038f7));
        return arrayList;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.W2) {
            canvas.drawRect(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), f6.f23121k0);
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
}
