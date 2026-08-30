package cg;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.yh;
public final class f1 {
    public static final List f2386m;
    public static final List f2387n;
    public static final int f2388o;
    public static final int f2389p;
    public static final int f2390q;
    public static final f1[] f2391r;
    public final SharedPreferences f2392a;
    public final ArrayList f2393b;
    public final HashMap f2394c;
    public List d;
    public boolean e;
    public int f2395f;
    public int f2396g;
    public int h;
    public float f2397i;
    public String f2398j;
    public boolean f2399k;
    public boolean f2400l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f2386m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f2387n = asList2;
        int size = asList.size();
        f2388o = size;
        int size2 = asList2.size();
        f2389p = size2;
        f2390q = size + size2;
        f2391r = new f1[4];
    }

    public f1(int i10) {
        List list;
        int i11 = f2390q;
        this.f2393b = new ArrayList(i11);
        HashMap hashMap = new HashMap(m.f2447a.size());
        this.f2394c = hashMap;
        this.d = new ArrayList(i11);
        int i12 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i10, 0);
        this.f2392a = sharedPreferences;
        this.f2395f = sharedPreferences.getInt("brush", 0);
        this.f2397i = sharedPreferences.getFloat("weight", 0.5f);
        this.f2398j = sharedPreferences.getString("typeface", "roboto");
        this.f2396g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f2399k = sharedPreferences.getBoolean("fill_shapes", false);
        int i13 = 0;
        while (i13 < f2388o) {
            i13 = yh.e((int) sharedPreferences.getLong(kh.a2.j(i13, "color_"), ((Integer) f2386m.get(i13)).intValue()), i13, 1, this.f2393b);
        }
        while (true) {
            if (i12 < m.f2447a.size()) {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf((int) sharedPreferences.getLong(kh.a2.j(i12, "brush_color_"), ((m) list.get(i12)).c())));
                i12++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static f1 e(int i10) {
        f1[] f1VarArr = f2391r;
        if (f1VarArr[i10] == null) {
            f1VarArr[i10] = new f1(i10);
        }
        return f1VarArr[i10];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f2386m);
        SharedPreferences.Editor edit = this.f2392a.edit();
        for (int i10 = 0; i10 < m.f2447a.size(); i10++) {
            edit.remove("brush_color_" + i10);
        }
        edit.remove("brush_color_-1");
        this.f2394c.clear();
        edit.apply();
        g();
    }

    public final int b(int i10) {
        int i11 = f2390q;
        if (i10 >= 0 && i10 < i11) {
            List list = f2387n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f2393b);
            if (i10 >= arrayList.size()) {
                int i12 = f2389p;
                if (i10 < i12) {
                    return ((Integer) list.get(i10)).intValue();
                }
                return ((Integer) f2386m.get(i10 - i12)).intValue();
            }
            return ((Integer) arrayList.get(i10)).intValue();
        }
        throw new IndexOutOfBoundsException(kh.a2.j(i11, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c3;
        Integer valueOf = Integer.valueOf(this.f2395f);
        HashMap hashMap = this.f2394c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f2395f;
            int i10 = this.f2395f;
            if (i10 == -1) {
                c3 = -1;
            } else {
                c3 = ((m) m.f2447a.get(i10)).c();
            }
            num = Integer.valueOf((int) this.f2392a.getLong(str, c3));
            hashMap.put(Integer.valueOf(this.f2395f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c3 = c();
        ArrayList arrayList = new ArrayList(f2387n);
        arrayList.addAll(this.f2393b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Integer) arrayList.get(i10)).intValue() == c3) {
                return i10;
            }
        }
        return 0;
    }

    public final float f(String str, float f10) {
        return this.f2392a.getFloat("weight_" + str, f10);
    }

    public final void g() {
        List list;
        if (this.d.isEmpty() && !this.e) {
            return;
        }
        SharedPreferences.Editor edit = this.f2392a.edit();
        if (!this.d.isEmpty()) {
            for (int i10 = 0; i10 < f2388o; i10++) {
                String j10 = kh.a2.j(i10, "color_");
                if (i10 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f2386m;
                }
                edit.putLong(j10, ((Integer) list.get(i10)).intValue());
            }
            ArrayList arrayList = this.f2393b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.e) {
            Integer num = (Integer) this.f2394c.get(Integer.valueOf(this.f2395f));
            if (num != null) {
                edit.putLong("brush_color_" + this.f2395f, num.intValue());
            }
            this.e = false;
        }
        edit.apply();
    }

    public final void h(int i10, boolean z4) {
        ArrayList arrayList = new ArrayList(f2387n);
        Collection collection = this.f2393b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i10));
        HashMap hashMap = this.f2394c;
        if (indexOf != -1) {
            if (z4) {
                hashMap.put(Integer.valueOf(this.f2395f), Integer.valueOf(b(indexOf)));
                this.e = true;
                return;
            }
            return;
        }
        if (!this.d.isEmpty()) {
            collection = this.d;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        this.d.clear();
        this.d.add(Integer.valueOf(i10));
        for (int i11 = 0; i11 < arrayList2.size() - 1; i11++) {
            this.d.add((Integer) arrayList2.get(i11));
        }
        int size = this.d.size();
        List list = f2386m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z4) {
            hashMap.put(Integer.valueOf(this.f2395f), Integer.valueOf(i10));
            this.e = true;
        }
    }

    public final void i(int i10, boolean z4) {
        this.f2395f = i10;
        if (z4) {
            this.f2392a.edit().putInt("brush", i10).apply();
        }
        Integer num = (Integer) this.f2394c.get(Integer.valueOf(i10));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f10) {
        this.f2397i = f10;
        this.f2392a.edit().putFloat("weight", f10).apply();
    }

    public final void k(String str, float f10) {
        SharedPreferences.Editor edit = this.f2392a.edit();
        edit.putFloat("weight_" + str, f10).apply();
    }
}
