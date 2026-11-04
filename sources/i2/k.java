package i2;

import java.io.IOException;
public class k extends IOException {
    public final int f14552a;

    public k(int i3) {
        this.f14552a = i3;
    }

    public k(Exception exc, int i3) {
        super(exc);
        this.f14552a = i3;
    }

    public k(String str, int i3) {
        super(str);
        this.f14552a = i3;
    }

    public k(String str, Exception exc, int i3) {
        super(str, exc);
        this.f14552a = i3;
    }
}
