package j2;

import java.io.IOException;
public class j extends IOException {
    public final int f16437a;

    public j(int i7) {
        this.f16437a = i7;
    }

    public j(Exception exc, int i7) {
        super(exc);
        this.f16437a = i7;
    }

    public j(String str, int i7) {
        super(str);
        this.f16437a = i7;
    }

    public j(String str, Exception exc, int i7) {
        super(str, exc);
        this.f16437a = i7;
    }
}
