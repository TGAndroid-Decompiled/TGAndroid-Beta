package ig;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
public final class s0 {
    public static final List f8445m;
    public static final List f8446n;
    public static final int f8447o;
    public static final int f8448p;
    public static final int f8449q;
    public static final s0[] f8450r;
    public final SharedPreferences f8451a;
    public final ArrayList f8452b;
    public final HashMap f8453c;
    public List d;
    public boolean e;
    public int f8454f;
    public int f8455g;
    public int h;
    public float f8456i;
    public String f8457j;
    public boolean f8458k;
    public boolean f8459l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f8445m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f8446n = asList2;
        int size = asList.size();
        f8447o = size;
        int size2 = asList2.size();
        f8448p = size2;
        f8449q = size + size2;
        f8450r = new s0[4];
    }

    public s0(int i10) {
        List list;
        int i11 = f8449q;
        this.f8452b = new ArrayList(i11);
        HashMap hashMap = new HashMap(h.f8315a.size());
        this.f8453c = hashMap;
        this.d = new ArrayList(i11);
        int i12 = 0;
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.f19025b.getSharedPreferences("photo_color_palette_" + i10, 0);
        this.f8451a = sharedPreferences;
        this.f8454f = sharedPreferences.getInt("brush", 0);
        this.f8456i = sharedPreferences.getFloat("weight", 0.5f);
        this.f8457j = sharedPreferences.getString("typeface", "roboto");
        this.f8455g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f8458k = sharedPreferences.getBoolean("fill_shapes", false);
        int i13 = 0;
        while (i13 < f8447o) {
            i13 = c3.i0.j((int) sharedPreferences.getLong(i0.a.i(i13, "color_"), ((Integer) f8445m.get(i13)).intValue()), i13, 1, this.f8452b);
        }
        while (true) {
            if (i12 < h.f8315a.size()) {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf((int) sharedPreferences.getLong(i0.a.i(i12, "brush_color_"), ((h) list.get(i12)).c())));
                i12++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static s0 e(int i10) {
        s0[] s0VarArr = f8450r;
        if (s0VarArr[i10] == null) {
            s0VarArr[i10] = new s0(i10);
        }
        return s0VarArr[i10];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f8445m);
        SharedPreferences.Editor edit = this.f8451a.edit();
        for (int i10 = 0; i10 < h.f8315a.size(); i10++) {
            edit.remove("brush_color_" + i10);
        }
        edit.remove("brush_color_-1");
        this.f8453c.clear();
        edit.apply();
        g();
    }

    public final int b(int i10) {
        int i11 = f8449q;
        if (i10 >= 0 && i10 < i11) {
            List list = f8446n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f8452b);
            if (i10 >= arrayList.size()) {
                int i12 = f8448p;
                if (i10 < i12) {
                    return ((Integer) list.get(i10)).intValue();
                }
                return ((Integer) f8445m.get(i10 - i12)).intValue();
            }
            return ((Integer) arrayList.get(i10)).intValue();
        }
        throw new IndexOutOfBoundsException(i0.a.i(i11, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c10;
        Integer valueOf = Integer.valueOf(this.f8454f);
        HashMap hashMap = this.f8453c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f8454f;
            int i10 = this.f8454f;
            if (i10 == -1) {
                c10 = -1;
            } else {
                c10 = ((h) h.f8315a.get(i10)).c();
            }
            num = Integer.valueOf((int) this.f8451a.getLong(str, c10));
            hashMap.put(Integer.valueOf(this.f8454f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(f8446n);
        arrayList.addAll(this.f8452b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Integer) arrayList.get(i10)).intValue() == c10) {
                return i10;
            }
        }
        return 0;
    }

    public final float f(String str, float f7) {
        return this.f8451a.getFloat("weight_" + str, f7);
    }

    public final void g() {
        Integer num;
        List list;
        if (this.d.isEmpty() && !this.e) {
            return;
        }
        SharedPreferences.Editor edit = this.f8451a.edit();
        if (!this.d.isEmpty()) {
            for (int i10 = 0; i10 < f8447o; i10++) {
                String i11 = i0.a.i(i10, "color_");
                if (i10 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f8445m;
                }
                edit.putLong(i11, ((Integer) list.get(i10)).intValue());
            }
            ArrayList arrayList = this.f8452b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.e) {
            if (((Integer) this.f8453c.get(Integer.valueOf(this.f8454f))) != null) {
                edit.putLong("brush_color_" + this.f8454f, num.intValue());
            }
            this.e = false;
        }
        edit.apply();
    }

    public final void h(int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(f8446n);
        Collection collection = this.f8452b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i10));
        HashMap hashMap = this.f8453c;
        if (indexOf != -1) {
            if (z10) {
                hashMap.put(Integer.valueOf(this.f8454f), Integer.valueOf(b(indexOf)));
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
        List list = f8445m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            hashMap.put(Integer.valueOf(this.f8454f), Integer.valueOf(i10));
            this.e = true;
        }
    }

    public final void i(int i10, boolean z10) {
        this.f8454f = i10;
        if (z10) {
            this.f8451a.edit().putInt("brush", i10).apply();
        }
        Integer num = (Integer) this.f8453c.get(Integer.valueOf(i10));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f7) {
        this.f8456i = f7;
        this.f8451a.edit().putFloat("weight", f7).apply();
    }

    public final void k(String str, float f7) {
        SharedPreferences.Editor edit = this.f8451a.edit();
        edit.putFloat("weight_" + str, f7).apply();
    }
}
