package defpackage;

import java.io.IOException;
public class r63 extends IOException {
    public final int a;

    public r63(int i) {
        this.a = i;
    }

    public r63(Exception exc, int i) {
        super(exc);
        this.a = i;
    }

    public r63(String str, int i) {
        super(str);
        this.a = i;
    }

    public r63(String str, Exception exc, int i) {
        super(str, exc);
        this.a = i;
    }
}
