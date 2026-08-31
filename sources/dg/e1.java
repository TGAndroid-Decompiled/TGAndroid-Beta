package dg;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.yh;
public final class e1 {
    public static final List f4508m;
    public static final List f4509n;
    public static final int f4510o;
    public static final int f4511p;
    public static final int f4512q;
    public static final e1[] f4513r;
    public final SharedPreferences f4514a;
    public final ArrayList f4515b;
    public final HashMap f4516c;
    public List d;
    public boolean f4517e;
    public int f4518f;
    public int f4519g;
    public int h;
    public float f4520i;
    public String f4521j;
    public boolean f4522k;
    public boolean f4523l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f4508m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f4509n = asList2;
        int size = asList.size();
        f4510o = size;
        int size2 = asList2.size();
        f4511p = size2;
        f4512q = size + size2;
        f4513r = new e1[4];
    }

    public e1(int i10) {
        List list;
        int i11 = f4512q;
        this.f4515b = new ArrayList(i11);
        HashMap hashMap = new HashMap(m.f4581a.size());
        this.f4516c = hashMap;
        this.d = new ArrayList(i11);
        int i12 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i10, 0);
        this.f4514a = sharedPreferences;
        this.f4518f = sharedPreferences.getInt("brush", 0);
        this.f4520i = sharedPreferences.getFloat("weight", 0.5f);
        this.f4521j = sharedPreferences.getString("typeface", "roboto");
        this.f4519g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f4522k = sharedPreferences.getBoolean("fill_shapes", false);
        int i13 = 0;
        while (i13 < f4510o) {
            i13 = yh.d((int) sharedPreferences.getLong(l.d.j(i13, "color_"), ((Integer) f4508m.get(i13)).intValue()), i13, 1, this.f4515b);
        }
        while (true) {
            if (i12 < m.f4581a.size()) {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf((int) sharedPreferences.getLong(l.d.j(i12, "brush_color_"), ((m) list.get(i12)).c())));
                i12++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static e1 e(int i10) {
        e1[] e1VarArr = f4513r;
        if (e1VarArr[i10] == null) {
            e1VarArr[i10] = new e1(i10);
        }
        return e1VarArr[i10];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f4508m);
        SharedPreferences.Editor edit = this.f4514a.edit();
        for (int i10 = 0; i10 < m.f4581a.size(); i10++) {
            edit.remove("brush_color_" + i10);
        }
        edit.remove("brush_color_-1");
        this.f4516c.clear();
        edit.apply();
        g();
    }

    public final int b(int i10) {
        int i11 = f4512q;
        if (i10 >= 0 && i10 < i11) {
            List list = f4509n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f4515b);
            if (i10 >= arrayList.size()) {
                int i12 = f4511p;
                if (i10 < i12) {
                    return ((Integer) list.get(i10)).intValue();
                }
                return ((Integer) f4508m.get(i10 - i12)).intValue();
            }
            return ((Integer) arrayList.get(i10)).intValue();
        }
        throw new IndexOutOfBoundsException(l.d.j(i11, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c3;
        Integer valueOf = Integer.valueOf(this.f4518f);
        HashMap hashMap = this.f4516c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f4518f;
            int i10 = this.f4518f;
            if (i10 == -1) {
                c3 = -1;
            } else {
                c3 = ((m) m.f4581a.get(i10)).c();
            }
            num = Integer.valueOf((int) this.f4514a.getLong(str, c3));
            hashMap.put(Integer.valueOf(this.f4518f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c3 = c();
        ArrayList arrayList = new ArrayList(f4509n);
        arrayList.addAll(this.f4515b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Integer) arrayList.get(i10)).intValue() == c3) {
                return i10;
            }
        }
        return 0;
    }

    public final float f(String str, float f10) {
        return this.f4514a.getFloat("weight_" + str, f10);
    }

    public final void g() {
        List list;
        if (this.d.isEmpty() && !this.f4517e) {
            return;
        }
        SharedPreferences.Editor edit = this.f4514a.edit();
        if (!this.d.isEmpty()) {
            for (int i10 = 0; i10 < f4510o; i10++) {
                String j10 = l.d.j(i10, "color_");
                if (i10 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f4508m;
                }
                edit.putLong(j10, ((Integer) list.get(i10)).intValue());
            }
            ArrayList arrayList = this.f4515b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.f4517e) {
            Integer num = (Integer) this.f4516c.get(Integer.valueOf(this.f4518f));
            if (num != null) {
                edit.putLong("brush_color_" + this.f4518f, num.intValue());
            }
            this.f4517e = false;
        }
        edit.apply();
    }

    public final void h(int i10, boolean z4) {
        ArrayList arrayList = new ArrayList(f4509n);
        Collection collection = this.f4515b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i10));
        HashMap hashMap = this.f4516c;
        if (indexOf != -1) {
            if (z4) {
                hashMap.put(Integer.valueOf(this.f4518f), Integer.valueOf(b(indexOf)));
                this.f4517e = true;
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
        List list = f4508m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z4) {
            hashMap.put(Integer.valueOf(this.f4518f), Integer.valueOf(i10));
            this.f4517e = true;
        }
    }

    public final void i(int i10, boolean z4) {
        this.f4518f = i10;
        if (z4) {
            this.f4514a.edit().putInt("brush", i10).apply();
        }
        Integer num = (Integer) this.f4516c.get(Integer.valueOf(i10));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f10) {
        this.f4520i = f10;
        this.f4514a.edit().putFloat("weight", f10).apply();
    }

    public final void k(String str, float f10) {
        SharedPreferences.Editor edit = this.f4514a.edit();
        edit.putFloat("weight_" + str, f10).apply();
    }
}
