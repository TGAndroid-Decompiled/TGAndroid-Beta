package g2;

import java.io.IOException;
public class j extends IOException {
    public static final int f9356b = 0;
    public final int f9357a;

    public j(int i10) {
        this.f9357a = i10;
    }

    public j(Exception exc, int i10) {
        super(exc);
        this.f9357a = i10;
    }

    public j(String str, int i10) {
        super(str);
        this.f9357a = i10;
    }

    public j(String str, Exception exc, int i10) {
        super(str, exc);
        this.f9357a = i10;
    }
}
