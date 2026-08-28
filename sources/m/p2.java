package m;
public final class p2 {
    public int f17031a;
    public int f17032b;
    public int f17033c;
    public int d;
    public int f17034e;
    public int f17035f;
    public boolean f17036g;
    public boolean h;

    public final void a(int i9, int i10) {
        this.f17033c = i9;
        this.d = i10;
        this.h = true;
        if (this.f17036g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f17031a = i10;
            }
            if (i9 != Integer.MIN_VALUE) {
                this.f17032b = i9;
                return;
            }
            return;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f17031a = i9;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f17032b = i10;
        }
    }
}
