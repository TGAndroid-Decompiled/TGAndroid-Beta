package defpackage;

import android.media.MediaRoute2Info;
import android.os.Bundle;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class tq6 implements nu4, xx6, pz6, ot2, nz6 {
    public final byte a;

    public tq6(boolean z, h9a h9aVar, Bundle bundle) {
        this.a = (byte) 11;
    }

    public static MediaRoute2Info c(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override
    public final void a(og8 og8Var, xw6 xw6Var, List list) {
        switch (this.a) {
            case 17:
                og8Var.w0(list);
                return;
            default:
                og8Var.w0(list);
                return;
        }
    }

    @Override
    public final void accept(Object obj) {
        og8 og8Var = (og8) obj;
        switch (this.a) {
            case 9:
                og8Var.C0();
                return;
            case 10:
                og8Var.d0();
                return;
            case 11:
            case 14:
            case 15:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 26:
            default:
                og8Var.S();
                return;
            case 12:
                og8Var.E0();
                return;
            case 13:
                og8Var.C();
                return;
            case 16:
                og8Var.I();
                return;
            case 20:
                og8Var.a0();
                return;
            case 22:
                og8Var.E();
                return;
            case 23:
                og8Var.a();
                return;
            case 25:
                og8Var.t();
                return;
            case 27:
                og8Var.b();
                return;
            case 28:
                og8Var.L0();
                return;
        }
    }

    @Override
    public final void b(ww6 ww6Var, int i) {
        switch (this.a) {
            case 4:
                ww6Var.getClass();
                return;
            case 5:
                ww6Var.b(i);
                return;
            default:
                ww6Var.getClass();
                return;
        }
    }

    @Override
    public final Object h(Object obj) {
        Void r1 = (Void) obj;
        switch (this.a) {
            case 0:
                return new TLRPC.TL_messageEntitySpoiler();
            default:
                return new TLRPC.TL_messageEntityStrike();
        }
    }

    @Override
    public final Object j(yx6 yx6Var, xw6 xw6Var, int i) {
        switch (this.a) {
            case 7:
                yx6Var.getClass();
                throw new ClassCastException();
            case 8:
                yx6Var.getClass();
                throw new ClassCastException();
            case 11:
                return yx6Var.m(xw6Var);
            case 14:
                yx6Var.getClass();
                throw new ClassCastException();
            case 15:
                sjf sjfVar = yx6Var.e;
                yx6Var.q(xw6Var);
                sjfVar.getClass();
                return fne.c(new gaa(-6));
            case 19:
                yx6Var.getClass();
                throw new ClassCastException();
            case 21:
                yx6Var.getClass();
                throw new ClassCastException();
            case 24:
                yx6Var.getClass();
                throw new ClassCastException();
            default:
                yx6Var.getClass();
                throw new ClassCastException();
        }
    }

    public tq6(byte b, Object obj, String str) {
        this.a = b;
    }

    public tq6(Object obj, byte b) {
        this.a = b;
    }

    public tq6(String str, int i, int i2, ht6 ht6Var, byte b) {
        this.a = b;
    }

    public tq6(byte b) {
        this.a = b;
    }
}
