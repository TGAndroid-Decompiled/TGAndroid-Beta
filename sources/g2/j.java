package g2;

import java.io.IOException;
public class j extends IOException {
    public final int f10800a;

    public j(int i10) {
        this.f10800a = i10;
    }

    public j(Exception exc, int i10) {
        super(exc);
        this.f10800a = i10;
    }

    public j(String str, int i10) {
        super(str);
        this.f10800a = i10;
    }

    public j(String str, Exception exc, int i10) {
        super(str, exc);
        this.f10800a = i10;
    }
}
