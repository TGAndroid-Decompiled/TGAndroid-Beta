package defpackage;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public abstract class a4c {
    public String[] a = new String[0];

    public boolean a() {
        return false;
    }

    public String[] b() {
        return this.a;
    }

    public boolean c() {
        return false;
    }

    public boolean d(t3c t3cVar, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(t3c t3cVar, s19 s19Var, MotionEvent motionEvent) {
        return false;
    }

    public abstract void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z);

    public abstract void h(TLRPC.StickerSetCovered stickerSetCovered);

    public void i(String[] strArr) {
        this.a = strArr;
    }

    public void f(int i, Object obj, TLRPC.Document document, boolean z) {
    }
}
