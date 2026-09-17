package g2;

import java.io.IOException;
public class j extends IOException {
    public static final int f10317b = 0;
    public final int f10318a;

    public j(int i10) {
        this.f10318a = i10;
    }

    public j(Exception exc, int i10) {
        super(exc);
        this.f10318a = i10;
    }

    public j(String str, int i10) {
        super(str);
        this.f10318a = i10;
    }

    public j(String str, Exception exc, int i10) {
        super(str, exc);
        this.f10318a = i10;
    }
}
