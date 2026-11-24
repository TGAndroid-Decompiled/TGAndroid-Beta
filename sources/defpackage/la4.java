package defpackage;
public final class la4 {
    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final String e;
    public final ja4 f;
    public String g;
    public String h;
    public Integer i;
    public final int j;
    public long k;
    public int l;

    public la4(long j, long j2, int i, String str, String str2, String str3, ja4 ja4Var, int i2, long j3) {
        this.a = j;
        this.b = j2;
        this.d = i;
        this.g = str;
        this.h = str2;
        this.e = str3;
        this.f = ja4Var;
        this.j = i2;
        this.c = j3;
    }

    public static la4 a(String str) {
        Long valueOf;
        String str2;
        ja4 ja4Var;
        String[] split = str.split("\t");
        Integer num = null;
        if (split[6].equals("null")) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(split[6]);
        }
        long parseLong = Long.parseLong(split[0]);
        long parseLong2 = Long.parseLong(split[1]);
        int parseInt = Integer.parseInt(split[2]);
        String str3 = split[3];
        String str4 = split[4];
        if (str4.equals("null")) {
            str2 = null;
        } else {
            str2 = str4;
        }
        String str5 = split[5];
        if (valueOf == null && split[8].equals("null")) {
            ja4Var = null;
        } else {
            int parseInt2 = Integer.parseInt(split[7]);
            String str6 = split[8];
            if (str6.equals("null")) {
                str6 = null;
            }
            ja4Var = new ja4(valueOf, parseInt2, str6);
        }
        la4 la4Var = new la4(parseLong, parseLong2, parseInt, str3, str2, str5, ja4Var, Integer.parseInt(split[10]), Long.parseLong(split[11]));
        if (!split[9].equals("null")) {
            num = Integer.valueOf(split[9]);
        }
        la4Var.i = num;
        la4Var.k = Long.parseLong(split[12]);
        la4Var.l = Integer.parseInt(split[13]);
        return la4Var;
    }

    public final String b() {
        ja4 ja4Var;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("\t");
        sb.append(this.b);
        sb.append("\t");
        sb.append(this.d);
        sb.append("\t");
        sb.append(this.g);
        sb.append("\t");
        sb.append(this.h);
        sb.append("\t");
        sb.append(this.e);
        sb.append("\t");
        if (this.f == null) {
            str = "null\t0\tnull";
        } else {
            str = ja4Var.a + "\t" + ja4Var.b + "\t" + ja4Var.c;
        }
        sb.append(str);
        sb.append("\t");
        sb.append(this.i);
        sb.append("\t");
        sb.append(this.j);
        sb.append("\t");
        sb.append(this.c);
        sb.append("\t");
        sb.append(this.k);
        sb.append("\t");
        sb.append(this.l);
        return sb.toString();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.g);
        String str2 = "";
        if (this.h == null) {
            str = "";
        } else {
            str = b10.j(new StringBuilder("("), this.h, ")");
        }
        sb.append(str);
        sb.append(" ");
        sb.append(-this.a);
        sb.append(":");
        sb.append(this.d);
        sb.append(" ");
        sb.append(this.e);
        sb.append(" ");
        Object obj = this.f;
        if (obj == null) {
            obj = "-#0 -";
        }
        sb.append(obj);
        if (this.i != null) {
            str2 = " " + this.i + "ms";
        }
        sb.append(str2);
        return sb.toString();
    }
}
