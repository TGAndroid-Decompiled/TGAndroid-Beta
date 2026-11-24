package defpackage;
public final class zuc implements Comparable {
    public final int a;
    public final vuc b;

    public zuc(int i, vuc vucVar) {
        this.a = i;
        this.b = vucVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((zuc) obj).a);
    }
}
