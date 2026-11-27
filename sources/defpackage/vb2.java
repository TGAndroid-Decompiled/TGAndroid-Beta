package defpackage;

import android.text.StaticLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class vb2 {
    public StaticLayout A;
    public dm B;
    public int C;
    public int D;
    public final wb2 E;
    public int a;
    public int b;
    public int c;
    public int d;
    public float e;
    public int f;
    public float g;
    public float h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public float m;
    public float n;
    public boolean o;
    public StaticLayout p;
    public pkb q;
    public dm r;
    public TLRPC.PollAnswer s;
    public TLRPC.TodoItem t;
    public boolean u;
    public int v;
    public hf0 w;
    public kh8 x;
    public rb0 y;
    public ImageReceiver z;

    public vb2(wb2 wb2Var) {
        this.E = wb2Var;
    }

    public final void a() {
        ImageReceiver imageReceiver = this.z;
        if (imageReceiver != null) {
            imageReceiver.I();
        }
        kh8 kh8Var = this.x;
        if (kh8Var != null) {
            kh8Var.b.a();
            kh8Var.c.I();
            kh8Var.F.e();
        }
    }

    public final void b() {
        ImageReceiver imageReceiver = this.z;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
        kh8 kh8Var = this.x;
        if (kh8Var != null) {
            kh8Var.b.b();
            kh8Var.c.K();
            kh8Var.F.f();
        }
    }
}
