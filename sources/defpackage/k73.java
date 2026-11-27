package defpackage;

import java.io.IOException;
public class k73 extends IOException {
    public final int a;

    public k73(int i) {
        this.a = i;
    }

    public k73(Exception exc, int i) {
        super(exc);
        this.a = i;
    }

    public k73(String str, int i) {
        super(str);
        this.a = i;
    }

    public k73(String str, Exception exc, int i) {
        super(str, exc);
        this.a = i;
    }
}
