package og;

import android.content.SharedPreferences;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
public final class x0 {
    public static final List f14546m;
    public static final List f14547n;
    public static final int f14548o;
    public static final int f14549p;
    public static final int f14550q;
    public static final x0[] f14551r;
    public final SharedPreferences f14552a;
    public final ArrayList f14553b;
    public final HashMap f14554c;
    public List d;
    public boolean e;
    public int f14555f;
    public int f14556g;
    public int h;
    public float f14557i;
    public String f14558j;
    public boolean f14559k;
    public boolean f14560l;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        f14546m = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        f14547n = asList2;
        int size = asList.size();
        f14548o = size;
        int size2 = asList2.size();
        f14549p = size2;
        f14550q = size + size2;
        f14551r = new x0[4];
    }

    public x0(int i10) {
        List list;
        int i11 = f14550q;
        this.f14553b = new ArrayList(i11);
        HashMap hashMap = new HashMap(m.f14420a.size());
        this.f14554c = hashMap;
        this.d = new ArrayList(i11);
        int i12 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i10, 0);
        this.f14552a = sharedPreferences;
        this.f14555f = sharedPreferences.getInt("brush", 0);
        this.f14557i = sharedPreferences.getFloat("weight", 0.5f);
        this.f14558j = sharedPreferences.getString("typeface", "roboto");
        this.f14556g = sharedPreferences.getInt("text_alignment", 0);
        this.h = sharedPreferences.getInt("text_type", 0);
        this.f14559k = sharedPreferences.getBoolean("fill_shapes", false);
        int i13 = 0;
        while (i13 < f14548o) {
            i13 = e2.d((int) sharedPreferences.getLong(hc.b.j(i13, "color_"), ((Integer) f14546m.get(i13)).intValue()), i13, 1, this.f14553b);
        }
        while (true) {
            if (i12 < m.f14420a.size()) {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf((int) sharedPreferences.getLong(hc.b.j(i12, "brush_color_"), ((m) list.get(i12)).c())));
                i12++;
            } else {
                hashMap.put(-1, Integer.valueOf((int) sharedPreferences.getLong("brush_color_-1", -1L)));
                return;
            }
        }
    }

    public static x0 e(int i10) {
        x0[] x0VarArr = f14551r;
        if (x0VarArr[i10] == null) {
            x0VarArr[i10] = new x0(i10);
        }
        return x0VarArr[i10];
    }

    public final void a() {
        this.d.clear();
        this.d.addAll(f14546m);
        SharedPreferences.Editor edit = this.f14552a.edit();
        for (int i10 = 0; i10 < m.f14420a.size(); i10++) {
            edit.remove("brush_color_" + i10);
        }
        edit.remove("brush_color_-1");
        this.f14554c.clear();
        edit.apply();
        g();
    }

    public final int b(int i10) {
        int i11 = f14550q;
        if (i10 >= 0 && i10 < i11) {
            List list = f14547n;
            ArrayList arrayList = new ArrayList(list);
            arrayList.addAll(this.f14553b);
            if (i10 >= arrayList.size()) {
                int i12 = f14549p;
                if (i10 < i12) {
                    return ((Integer) list.get(i10)).intValue();
                }
                return ((Integer) f14546m.get(i10 - i12)).intValue();
            }
            return ((Integer) arrayList.get(i10)).intValue();
        }
        throw new IndexOutOfBoundsException(hc.b.j(i11, "Color palette index should be in range 0 ... "));
    }

    public final int c() {
        long c10;
        Integer valueOf = Integer.valueOf(this.f14555f);
        HashMap hashMap = this.f14554c;
        Integer num = (Integer) hashMap.get(valueOf);
        if (num == null) {
            String str = "brush_color_" + this.f14555f;
            int i10 = this.f14555f;
            if (i10 == -1) {
                c10 = -1;
            } else {
                c10 = ((m) m.f14420a.get(i10)).c();
            }
            num = Integer.valueOf((int) this.f14552a.getLong(str, c10));
            hashMap.put(Integer.valueOf(this.f14555f), num);
        }
        return num.intValue();
    }

    public final int d() {
        int c10 = c();
        ArrayList arrayList = new ArrayList(f14547n);
        arrayList.addAll(this.f14553b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Integer) arrayList.get(i10)).intValue() == c10) {
                return i10;
            }
        }
        return 0;
    }

    public final float f(String str, float f7) {
        return this.f14552a.getFloat("weight_" + str, f7);
    }

    public final void g() {
        List list;
        if (this.d.isEmpty() && !this.e) {
            return;
        }
        SharedPreferences.Editor edit = this.f14552a.edit();
        if (!this.d.isEmpty()) {
            for (int i10 = 0; i10 < f14548o; i10++) {
                String j3 = hc.b.j(i10, "color_");
                if (i10 < this.d.size()) {
                    list = this.d;
                } else {
                    list = f14546m;
                }
                edit.putLong(j3, ((Integer) list.get(i10)).intValue());
            }
            ArrayList arrayList = this.f14553b;
            arrayList.clear();
            arrayList.addAll(this.d);
            this.d.clear();
        }
        if (this.e) {
            Integer num = (Integer) this.f14554c.get(Integer.valueOf(this.f14555f));
            if (num != null) {
                edit.putLong("brush_color_" + this.f14555f, num.intValue());
            }
            this.e = false;
        }
        edit.apply();
    }

    public final void h(int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(f14547n);
        Collection collection = this.f14553b;
        arrayList.addAll(collection);
        int indexOf = arrayList.indexOf(Integer.valueOf(i10));
        HashMap hashMap = this.f14554c;
        if (indexOf != -1) {
            if (z10) {
                hashMap.put(Integer.valueOf(this.f14555f), Integer.valueOf(b(indexOf)));
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
        List list = f14546m;
        if (size < list.size()) {
            for (int size2 = this.d.size(); size2 < list.size(); size2++) {
                this.d.add((Integer) list.get(size2));
            }
        } else if (this.d.size() > list.size()) {
            this.d = this.d.subList(0, list.size());
        }
        if (z10) {
            hashMap.put(Integer.valueOf(this.f14555f), Integer.valueOf(i10));
            this.e = true;
        }
    }

    public final void i(int i10, boolean z10) {
        this.f14555f = i10;
        if (z10) {
            this.f14552a.edit().putInt("brush", i10).apply();
        }
        Integer num = (Integer) this.f14554c.get(Integer.valueOf(i10));
        if (num != null) {
            h(num.intValue(), false);
            g();
        }
    }

    public final void j(float f7) {
        this.f14557i = f7;
        this.f14552a.edit().putFloat("weight", f7).apply();
    }

    public final void k(String str, float f7) {
        SharedPreferences.Editor edit = this.f14552a.edit();
        edit.putFloat("weight_" + str, f7).apply();
    }
}
