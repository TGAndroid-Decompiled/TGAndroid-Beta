package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a;
public final class ja4 {
    public final ca4 a;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int k;
    public ha4 l;
    public final ArrayList b = new ArrayList();
    public final HashMap c = new HashMap();
    public final lw3 d = new lw3(this, (byte) 16);
    public int j = 100;

    public ja4(ca4 ca4Var) {
        this.a = ca4Var;
    }

    public final void a(int i, int i2, ArrayList arrayList) {
        int intValue;
        if (i == this.k && this.f) {
            boolean z = false;
            this.f = false;
            int size = arrayList.size();
            HashMap hashMap = this.c;
            ArrayList arrayList2 = this.b;
            if (i2 != -1 && i2 != -2) {
                long j = 2000;
                if (i2 >= 0) {
                    d(Math.max(i2 * 1000, 2000L));
                    return;
                }
                if (i2 == -3) {
                    if (size > 1) {
                        this.j = size / 2;
                        d(0L);
                        return;
                    }
                    ha4 ha4Var = (ha4) arrayList2.remove(0);
                    Integer num = (Integer) hashMap.remove(Long.valueOf(ha4Var.c));
                    if (num == null) {
                        intValue = 1;
                    } else {
                        intValue = num.intValue() + 1;
                    }
                    if (intValue < 3) {
                        arrayList2.add(ha4Var);
                        hashMap.put(Long.valueOf(ha4Var.c), Integer.valueOf(intValue));
                    }
                    c();
                    this.j = 100;
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj = arrayList2.get(i3);
                        i3++;
                        if (!hashMap.containsKey(Long.valueOf(((ha4) obj).c))) {
                            d(0L);
                            return;
                        }
                    }
                }
                if (i2 != -5) {
                    this.i = Math.min(this.i + 1, 8);
                }
                if (i2 == -3) {
                    z = true;
                }
                this.h = z;
                if (i2 != -5) {
                    j = 2000 << (this.i - 1);
                }
                d(j);
                return;
            }
            arrayList2.subList(0, size).clear();
            int size3 = arrayList.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj2 = arrayList.get(i4);
                i4++;
                hashMap.remove(Long.valueOf(((ha4) obj2).c));
            }
            c();
            this.j = 100;
            this.i = 0;
            if (!arrayList2.isEmpty()) {
                d(0L);
            }
        }
    }

    public final void b() {
        ca4 ca4Var = this.a;
        if (!this.e) {
            this.e = true;
            ArrayList arrayList = new ArrayList();
            String[] split = a.b.getSharedPreferences("feed_events", 0).getString("outbox" + ca4Var.a, "").split("\n");
            int length = split.length;
            boolean z = false;
            for (int i = 0; i < length; i++) {
                String trim = split[i].trim();
                if (!trim.isEmpty()) {
                    try {
                        boolean startsWith = trim.startsWith("~");
                        if (startsWith) {
                            trim = trim.substring(1);
                        }
                        arrayList.add(ha4.a(trim));
                        z |= startsWith;
                    } catch (RuntimeException unused) {
                        z = true;
                    }
                }
            }
            this.b.addAll(0, arrayList);
            if (z) {
                c();
            }
        }
    }

    public final void c() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append(((ha4) obj).b());
            sb.append('\n');
        }
        if (this.l != null) {
            sb.append('~');
            sb.append(this.l.b());
            sb.append('\n');
        }
        ca4 ca4Var = this.a;
        String sb2 = sb.toString();
        a.b.getSharedPreferences("feed_events", 0).edit().putString("outbox" + ca4Var.a, sb2).apply();
    }

    public final void d(long j) {
        if (!this.g && !this.f) {
            this.g = true;
            ea4.e.postRunnable(this.d, j);
        }
    }
}
