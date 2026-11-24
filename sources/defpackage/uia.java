package defpackage;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.concurrent.Callable;
public final class uia implements Callable {
    public final byte a = 0;
    public final Object b;
    public final Object c;

    public uia(hg7 hg7Var, gq5 gq5Var) {
        this.b = hg7Var;
        this.c = gq5Var;
    }

    @Override
    public final Object call() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return (wia) ((ShortcutInfoCompatSaverImpl) obj).b.get((String) obj2);
            default:
                int i = l1f.a;
                k4f.O3();
                int i2 = g4f.a;
                k4f.O3();
                int i3 = l1f.a;
                return ((hg7) obj2).b.e((gq5) obj);
        }
    }

    public uia(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, String str) {
        this.c = shortcutInfoCompatSaverImpl;
        this.b = str;
    }
}
