package defpackage;

import java.util.ArrayList;
public final class hbc {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public hbc(jbc jbcVar) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = jbcVar.b;
        this.b = jbcVar.i;
        this.c = jbcVar.j;
        arrayList.add(jbcVar);
    }

    public final jbc a() {
        ArrayList arrayList = this.d;
        jbc jbcVar = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jbc jbcVar2 = (jbc) obj;
            if (jbcVar2.b()) {
                return jbcVar2;
            }
        }
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jbc jbcVar3 = (jbc) arrayList.get(i2);
            if (jbcVar3.k < j && lbc.C0(jbcVar3.m)) {
                j = jbcVar3.k;
                jbcVar = jbcVar3;
            }
        }
        if (jbcVar != null) {
            return jbcVar;
        }
        return (jbc) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.b, this.c);
        if (Math.abs(min - 2160) < 55) {
            return 2160;
        }
        if (Math.abs(min - 1440) < 55) {
            return 1440;
        }
        if (Math.abs(min - 1080) < 55) {
            return 1080;
        }
        if (Math.abs(min - 720) < 55) {
            return 720;
        }
        if (Math.abs(min - 480) < 55) {
            return 480;
        }
        if (Math.abs(min - 360) < 55) {
            return 360;
        }
        if (Math.abs(min - 240) < 55) {
            return 240;
        }
        if (Math.abs(min - 144) < 55) {
            return 144;
        }
        return min;
    }

    public final String toString() {
        String str;
        boolean z = gba.N0;
        boolean z2 = this.a;
        String str2 = "";
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append("x");
            sb.append(this.c);
            if (!z2) {
                str = "";
            } else {
                str = " (" + k96.M0(2131746257, null) + ")";
            }
            sb.append(str);
            sb.append("\n");
            ArrayList arrayList = this.d;
            sb.append(gl.i0((long) ((jbc) arrayList.get(0)).l, false, false).replace(" ", ""));
            sb.append("/s");
            if (((jbc) arrayList.get(0)).m != null) {
                str2 = ", " + ((jbc) arrayList.get(0)).m;
            }
            sb.append(str2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b());
        sb2.append("p");
        if (z2) {
            str2 = " (" + k96.M0(2131746257, null) + ")";
        }
        sb2.append(str2);
        return sb2.toString();
    }
}
