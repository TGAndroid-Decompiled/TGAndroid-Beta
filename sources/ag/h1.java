package ag;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.th;
public final class h1 {
    public static final List f509m;
    public static final List f510n;
    public static final int f511o;
    public static final int f512p;
    public static final int f513q;
    public static final h1[] f514r;
    public final SharedPreferences f515a;
    public final ArrayList f516b;
    public final HashMap f517c;
    public List d;
    public boolean f518e;
    public int f519f;
    public int f520g;
    public int h;
    public float f521i;
    public String f522j;
    public boolean f523k;
    public boolean f524l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f509m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f510n = asList2;
        int size = asList.size();
        f511o = size;
        int size2 = asList2.size();
        f512p = size2;
        f513q = size + size2;
        f514r = new h1[4];
    }

    public h1(int i10) {
        List list;
        int i11 = f513q;
        this.f516b = new ArrayList(i11);
        HashMap hashMap = new HashMap(m.f584a.size());
        this.f517c = hashMap;
        this.d = new ArrayList(i11);
        int i12 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i10, 0);
        this.f515a = sharedPreferences;
        this.f519f = sharedPreferences.getInt("brush", 0);
        this.f521i = sharedPreferences.getFloat("weight", 0.5f);
        this.f522j = sharedPreferences.getString("typeface", "roboto");
        this.f520g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f523k = sharedPreferences.getBoolean("fill_shapes", false);
        int i13 = 0;
        while (i13 < f511o) {
            i13 = th.d((int) sharedPreferences.getLong(j7.l1.k(i13, "color_"), ((Integer) f509m.get(i13)).intValue()), i13, 1, this.f516b);
        }
        while (true) {
            if (i12 < m.f584a.size()) {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf((int) sharedPreferences.getLong(j7.l1.k(i12, "brush_color_"), ((m) list.get(i12)).c())));
                i12++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static h1 e(int i10) {
        h1[] h1VarArr = f514r;
        if (h1VarArr[i10] == null) {
            h1VarArr[i10] = new h1(i10);
        }
        return h1VarArr[i10];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f509m);
        SharedPreferences.Editor edit = this.f515a.edit();
        for (int i10 = 0; i10 < m.f584a.size(); i10++) {
            edit.remove("brush_color_" + i10);
        }
        edit.remove("brush_color_-1");
        this.f517c.clear();
        edit.apply();
        g();
    }

    public final int b(int i10) {
        int i11 = f513q;
        if (i10 >= 0 && i10 < i11) {
            List list = f510n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f516b);
            if (i10 >= arrayList.size()) {
                int i12 = f512p;
                if (i10 < i12) {
                    return ((Integer) list.get(i10)).intValue();
                }
                return ((Integer) f509m.get(i10 - i12)).intValue();
            }
            return ((Integer) arrayList.get(i10)).intValue();
        }
        throw new IndexOutOfBoundsException(j7.l1.k(i11, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c3;
        Integer valueOf = Integer.valueOf(this.f519f);
        HashMap hashMap = this.f517c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f519f;
            int i10 = this.f519f;
            if (i10 == -1) {
                c3 = -1;
            } else {
                c3 = ((m) m.f584a.get(i10)).c();
            }
            num = Integer.valueOf((int) this.f515a.getLong(str, c3));
            hashMap.put(Integer.valueOf(this.f519f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c3 = c();
        ArrayList arrayList = new ArrayList(f510n);
        arrayList.addAll(this.f516b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Integer) arrayList.get(i10)).intValue() == c3) {
                return i10;
            }
        }
        return 0;
    }

    public final float f(String str, float f9) {
        return this.f515a.getFloat("weight_" + str, f9);
    }

    public final void g() {
        List list;
        if (this.d.isEmpty() && !this.f518e) {
            return;
        }
        SharedPreferences.Editor edit = this.f515a.edit();
        if (!this.d.isEmpty()) {
            for (int i10 = 0; i10 < f511o; i10++) {
                String k9 = j7.l1.k(i10, "color_");
                if (i10 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f509m;
                }
                edit.putLong(k9, ((Integer) list.get(i10)).intValue());
            }
            ArrayList arrayList = this.f516b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.f518e) {
            Integer num = (Integer) this.f517c.get(Integer.valueOf(this.f519f));
            if (num != null) {
                edit.putLong("brush_color_" + this.f519f, num.intValue());
            }
            this.f518e = false;
        }
        edit.apply();
    }

    public final void h(int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(f510n);
        Collection collection = this.f516b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i10));
        HashMap hashMap = this.f517c;
        if (indexOf != -1) {
            if (z10) {
                hashMap.put(Integer.valueOf(this.f519f), Integer.valueOf(b(indexOf)));
                this.f518e = true;
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
        List list = f509m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            hashMap.put(Integer.valueOf(this.f519f), Integer.valueOf(i10));
            this.f518e = true;
        }
    }

    public final void i(int i10, boolean z10) {
        this.f519f = i10;
        if (z10) {
            this.f515a.edit().putInt("brush", i10).apply();
        }
        Integer num = (Integer) this.f517c.get(Integer.valueOf(i10));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f9) {
        this.f521i = f9;
        this.f515a.edit().putFloat("weight", f9).apply();
    }

    public final void k(String str, float f9) {
        SharedPreferences.Editor edit = this.f515a.edit();
        edit.putFloat("weight_" + str, f9).apply();
    }
}
