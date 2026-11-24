package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.a;
public final class k38 {
    public static final List m;
    public static final List n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final k38[] r;
    public final SharedPreferences a;
    public final ArrayList b;
    public final HashMap c;
    public List d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public float i;
    public String j;
    public boolean k;
    public boolean l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        n = asList2;
        int size = asList.size();
        o = size;
        int size2 = asList2.size();
        p = size2;
        q = size + size2;
        r = new k38[4];
    }

    public k38(int i) {
        List list;
        int i2 = q;
        this.b = new ArrayList(i2);
        HashMap hashMap = new HashMap(m01.a.size());
        this.c = hashMap;
        this.d = new ArrayList(i2);
        int i3 = 0;
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("photo_color_palette_" + i, 0);
        this.a = sharedPreferences;
        this.f = sharedPreferences.getInt("brush", 0);
        this.i = sharedPreferences.getFloat("weight", 0.5f);
        this.j = sharedPreferences.getString("typeface", "roboto");
        this.g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.k = sharedPreferences.getBoolean("fill_shapes", false);
        int i4 = 0;
        while (i4 < o) {
            i4 = tb4.g((int) sharedPreferences.getLong(de9.k(i4, "color_"), ((Integer) m.get(i4)).intValue()), i4, 1, this.b);
        }
        while (true) {
            if (i3 < m01.a.size()) {
                hashMap.put(Integer.valueOf(i3), Integer.valueOf((int) sharedPreferences.getLong(de9.k(i3, "brush_color_"), ((m01) list.get(i3)).b())));
                i3++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static k38 e(int i) {
        k38[] k38VarArr = r;
        if (k38VarArr[i] == null) {
            k38VarArr[i] = new k38(i);
        }
        return k38VarArr[i];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(m);
        SharedPreferences.Editor edit = this.a.edit();
        for (int i = 0; i < m01.a.size(); i++) {
            edit.remove("brush_color_" + i);
        }
        edit.remove("brush_color_-1");
        this.c.clear();
        edit.apply();
        g();
    }

    public final int b(int i) {
        int i2 = q;
        if (i >= 0 && i < i2) {
            List list = n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.b);
            if (i >= arrayList.size()) {
                int i3 = p;
                if (i < i3) {
                    return ((Integer) list.get(i)).intValue();
                }
                return ((Integer) m.get(i - i3)).intValue();
            }
            return ((Integer) arrayList.get(i)).intValue();
        }
        k93.i(de9.k(i2, "Color palette index should be in range 0 ... "));
        return 0;
    }

    public final int c() {
        long b;
        Integer valueOf = Integer.valueOf(this.f);
        HashMap hashMap = this.c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f;
            int i = this.f;
            if (i == -1) {
                b = -1;
            } else {
                b = ((m01) m01.a.get(i)).b();
            }
            num = Integer.valueOf((int) this.a.getLong(str, b));
            hashMap.put(Integer.valueOf(this.f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c = c();
        ArrayList arrayList = new ArrayList(n);
        arrayList.addAll(this.b);
        for (int i = 0; i < arrayList.size(); i++) {
            if (((Integer) arrayList.get(i)).intValue() == c) {
                return i;
            }
        }
        return 0;
    }

    public final float f(String str, float f) {
        return this.a.getFloat("weight_" + str, f);
    }

    public final void g() {
        Integer num;
        List list;
        if (this.d.isEmpty() && !this.e) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        if (!this.d.isEmpty()) {
            for (int i = 0; i < o; i++) {
                String k = de9.k(i, "color_");
                if (i < this.d.size()) {
                    list = this.d;
                } else {
                    list = m;
                }
                edit.putLong(k, ((Integer) list.get(i)).intValue());
            }
            ArrayList arrayList = this.b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.e) {
            if (((Integer) this.c.get(Integer.valueOf(this.f))) != null) {
                edit.putLong("brush_color_" + this.f, num.intValue());
            }
            this.e = false;
        }
        edit.apply();
    }

    public final void h(int i, boolean z) {
        List list;
        ArrayList arrayList = new ArrayList(n);
        Collection collection = this.b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i));
        HashMap hashMap = this.c;
        if (indexOf != -1) {
            if (z) {
                hashMap.put(Integer.valueOf(this.f), Integer.valueOf(b(indexOf)));
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
        this.d.add(Integer.valueOf(i));
        int i2 = 0;
        while (true) {
            int size = arrayList2.size() - 1;
            list = this.d;
            if (i2 >= size) {
                break;
            }
            list.add((Integer) arrayList2.get(i2));
            i2++;
        }
        int size2 = list.size();
        List list2 = m;
        int size3 = list2.size();
        List list3 = this.d;
        if (size2 < size3) {
            for (int size4 = list3.size(); size4 < list2.size(); size4++) {
                this.d.add((Integer) list2.get(size4));
            }
        } else if (list3.size() > list2.size()) {
            this.d = this.d.subList(0, list2.size());
        }
        if (z) {
            hashMap.put(Integer.valueOf(this.f), Integer.valueOf(i));
            this.e = true;
        }
    }

    public final void i(int i, boolean z) {
        this.f = i;
        if (z) {
            this.a.edit().putInt("brush", i).apply();
        }
        Integer num = (Integer) this.c.get(Integer.valueOf(i));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f) {
        this.i = f;
        this.a.edit().putFloat("weight", f).apply();
    }

    public final void k(String str, float f) {
        SharedPreferences.Editor edit = this.a.edit();
        edit.putFloat("weight_" + str, f).apply();
    }
}
