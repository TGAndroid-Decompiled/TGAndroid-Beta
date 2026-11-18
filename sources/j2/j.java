package j2;

import java.io.IOException;
public class j extends IOException {
    public final int f17173a;

    public j(int i7) {
        this.f17173a = i7;
    }

    public j(Exception exc, int i7) {
        super(exc);
        this.f17173a = i7;
    }

    public j(String str, int i7) {
        super(str);
        this.f17173a = i7;
    }

    public j(String str, Exception exc, int i7) {
        super(str, exc);
        this.f17173a = i7;
    }
}
