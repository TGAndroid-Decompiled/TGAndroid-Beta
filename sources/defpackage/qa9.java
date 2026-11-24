package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.FrameLayout;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.d;
public final class qa9 extends d implements gk7 {
    public static boolean s;
    public static HashSet w;
    public ix5 a;
    public o39 b;
    public ix5 c;
    public g24 d;
    public int e;
    public ArrayList f;
    public ArrayList h;
    public HashSet n;
    public HashSet r;

    public qa9() {
        super(null);
        this.e = -1;
    }

    public static void Y(boolean z) {
        boolean z2 = na7.c1().getBoolean("translate_button_restricted_languages_changed", false);
        if (na7.c1().getInt("translate_button_restricted_languages_version", 0) == 2 && (!z || z2)) {
            return;
        }
        bm0 bm0Var = new bm0((byte) 24);
        final HashSet hashSet = new HashSet();
        Utilities.u(0, new p8c() {
            @Override
            public final void a(Object obj) {
                byte b = r2;
                HashSet hashSet2 = hashSet;
                Runnable runnable = (Runnable) obj;
                switch (b) {
                    case 0:
                        try {
                            String str = k96.D0().B.f;
                            if (rzb.J0(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        runnable.run();
                        return;
                    case 1:
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (rzb.J0(language, null, null) != null) {
                                hashSet2.add(language);
                            }
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        runnable.run();
                        return;
                    default:
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) a.b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (rzb.J0(locale, null, null) != null) {
                                            hashSet2.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e3) {
                            fa4.g(e3, true);
                        }
                        runnable.run();
                        return;
                }
            }
        }, new p8c() {
            @Override
            public final void a(Object obj) {
                byte b = r2;
                HashSet hashSet2 = hashSet;
                Runnable runnable = (Runnable) obj;
                switch (b) {
                    case 0:
                        try {
                            String str = k96.D0().B.f;
                            if (rzb.J0(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        runnable.run();
                        return;
                    case 1:
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (rzb.J0(language, null, null) != null) {
                                hashSet2.add(language);
                            }
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        runnable.run();
                        return;
                    default:
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) a.b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (rzb.J0(locale, null, null) != null) {
                                            hashSet2.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e3) {
                            fa4.g(e3, true);
                        }
                        runnable.run();
                        return;
                }
            }
        }, new p8c() {
            @Override
            public final void a(Object obj) {
                byte b = r2;
                HashSet hashSet2 = hashSet;
                Runnable runnable = (Runnable) obj;
                switch (b) {
                    case 0:
                        try {
                            String str = k96.D0().B.f;
                            if (rzb.J0(str, null, null) != null) {
                                hashSet2.add(str);
                            }
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        runnable.run();
                        return;
                    case 1:
                        try {
                            String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                            if (rzb.J0(language, null, null) != null) {
                                hashSet2.add(language);
                            }
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        runnable.run();
                        return;
                    default:
                        try {
                            InputMethodManager inputMethodManager = (InputMethodManager) a.b.getSystemService("input_method");
                            for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                                        String locale = inputMethodSubtype.getLocale();
                                        if (locale != null && locale.contains("_")) {
                                            locale = locale.split("_")[0];
                                        }
                                        if (rzb.J0(locale, null, null) != null) {
                                            hashSet2.add(locale);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e3) {
                            fa4.g(e3, true);
                        }
                        runnable.run();
                        return;
                }
            }
        }, new x15(bm0Var, hashSet, (byte) 24));
    }

    public static void Z() {
        s = false;
        na7.c1().edit().remove("translate_button_restricted_languages_changed").remove("translate_button_restricted_languages_version").remove("translate_button_restricted_languages").apply();
        Y(false);
    }

    public static HashSet b0() {
        if (!s) {
            HashSet hashSet = null;
            Set<String> stringSet = na7.c1().getStringSet("translate_button_restricted_languages", null);
            if (stringSet != null) {
                hashSet = new HashSet(stringSet);
            }
            w = hashSet;
            s = true;
        }
        HashSet hashSet2 = w;
        if (hashSet2 == null) {
            HashSet hashSet3 = new HashSet(coe.a(1));
            Collections.addAll(hashSet3, k96.D0().B.f);
            w = hashSet3;
            return hashSet3;
        }
        return hashSet2;
    }

    public static void e0(HashSet hashSet, Boolean bool) {
        w = hashSet;
        s = true;
        SharedPreferences.Editor edit = na7.c1().edit();
        if (hashSet == null) {
            edit.remove("translate_button_restricted_languages");
        } else {
            edit.putStringSet("translate_button_restricted_languages", hashSet);
        }
        if (bool == null) {
            edit.remove("translate_button_restricted_languages_changed");
        } else if (bool.booleanValue()) {
            edit.putBoolean("translate_button_restricted_languages_changed", true);
        }
        edit.apply();
    }

    public final void a0() {
        this.h = b1c.m();
        String str = k96.D0().B.f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.n);
        u0c u0cVar = null;
        int i = 0;
        while (i < this.h.size()) {
            u0c u0cVar2 = (u0c) this.h.get(i);
            if (TextUtils.equals(u0cVar2.a, str)) {
                arrayList2.remove(u0cVar2.a);
                this.h.remove(i);
                i--;
                u0cVar = u0cVar2;
            } else if (this.n.contains(u0cVar2.a)) {
                arrayList.add(u0cVar2);
                arrayList2.remove(u0cVar2.a);
                this.h.remove(i);
                i--;
            }
            i++;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ?? obj = new Object();
            String str2 = (String) arrayList2.get(i2);
            obj.a = str2;
            String upperCase = str2.toUpperCase();
            obj.b = upperCase;
            obj.c = upperCase;
            obj.d = obj.a.toLowerCase();
            arrayList.add(obj);
        }
        this.e = 0;
        this.h.addAll(0, arrayList);
        int size = arrayList.size() + this.e;
        this.e = size;
        if (u0cVar != null) {
            this.h.add(0, u0cVar);
            size = this.e + 1;
            this.e = size;
        }
        if (size <= 0) {
            this.e = -1;
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public final void c0(int i, View view) {
        boolean z;
        u0c u0cVar;
        ArrayList arrayList;
        if (getParentActivity() != null && this.parentLayout != null && (view instanceof bhb)) {
            int i2 = 0;
            if (this.b.getAdapter() == this.c) {
                z = true;
            } else {
                z = false;
            }
            if (z && (arrayList = this.f) != null) {
                u0cVar = (u0c) arrayList.get(i);
            } else {
                int i3 = this.e;
                if (i3 >= 0 && i > i3) {
                    i--;
                }
                if (i >= 0 && i < this.h.size()) {
                    u0cVar = (u0c) this.h.get(i);
                } else {
                    u0cVar = null;
                }
            }
            if (u0cVar != null && u0cVar.a != null) {
                i96 i96Var = k96.D0().B;
                String str = u0cVar.a;
                boolean contains = this.r.contains(str);
                HashSet hashSet = this.r;
                if (contains) {
                    Collection.EL.removeIf(hashSet, new gx5(str, (byte) 2));
                } else {
                    hashSet.add(str);
                }
                if (this.r.size() == 1 && this.r.contains(i96Var.f)) {
                    e0(null, null);
                } else {
                    e0(this.r, Boolean.TRUE);
                }
                if (z) {
                    int i4 = 0;
                    while (i2 < this.f.size()) {
                        if (TextUtils.equals(str, ((u0c) this.f.get(i2)).a)) {
                            d0(i4);
                        }
                        i2++;
                        i4++;
                    }
                } else {
                    int i5 = 0;
                    while (i2 < this.h.size()) {
                        if (i5 == this.e) {
                            i5++;
                        }
                        if (TextUtils.equals(str, ((u0c) this.h.get(i2)).a)) {
                            d0(i5);
                        }
                        i2++;
                        i5++;
                    }
                }
                na7.q1(this.currentAccount).i4.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131751346, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 8));
        xha a = this.simpleActionBar.t().a(0, 2131232491);
        a.N();
        a.C0 = new q10(this, (byte) 20);
        a.setSearchFieldHint(k96.M0(2131745644, null));
        this.a = new ix5(this, context, false, (byte) 1);
        this.c = new ix5(this, context, true, (byte) 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        g24 g24Var = new g24(context, null);
        this.d = g24Var;
        g24Var.setText(k96.M0(2131747975, null));
        this.d.c();
        this.d.setShowAtCenter(true);
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setEmptyView(this.d);
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new t26(1, false));
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setAdapter(this.a);
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        frameLayout.addView(this.d, nme.c(-1.0f, -1));
        this.b.setOnItemClickListener(new f09(this, (byte) 2));
        this.b.setOnScrollListener(new n58(this, (byte) 13));
        return this.fragmentView;
    }

    public final void d0(int i) {
        int b;
        w39 adapter = this.b.getAdapter();
        for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
            s49 T = this.b.T(this.b.getChildAt(i2));
            if (T != null && (b = T.b()) != -1 && b == i) {
                adapter.t(T, i);
                return;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.A4 && this.a != null) {
            a0();
            this.a.f();
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
        arrayList.add(new blb(this.b, 0, new Class[]{xw5.class}, new String[]{"checkImage"}, (Drawable[]) null, (alb) null, bkb.Ci));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.n = b0();
        this.r = b0();
        a0();
        k96.D0().V0(this.currentAccount, true);
        kk7.e().b(this, kk7.A4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.e().n(this, kk7.A4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ix5 ix5Var = this.a;
        if (ix5Var != null) {
            ix5Var.f();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
