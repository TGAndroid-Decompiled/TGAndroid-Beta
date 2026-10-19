package g2;

import java.io.IOException;
public class j extends IOException {
    public final int f10781a;

    public j(int i10) {
        this.f10781a = i10;
    }

    public j(Exception exc, int i10) {
        super(exc);
        this.f10781a = i10;
    }

    public j(String str, int i10) {
        super(str);
        this.f10781a = i10;
    }

    public j(String str, Exception exc, int i10) {
        super(str, exc);
        this.f10781a = i10;
    }
}
