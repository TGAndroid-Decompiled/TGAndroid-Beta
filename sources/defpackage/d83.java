package defpackage;

import java.io.IOException;
public class d83 extends IOException {
    public final int a;

    public d83(int i) {
        this.a = i;
    }

    public d83(Exception exc, int i) {
        super(exc);
        this.a = i;
    }

    public d83(String str, int i) {
        super(str);
        this.a = i;
    }

    public d83(String str, Exception exc, int i) {
        super(str, exc);
        this.a = i;
    }
}
