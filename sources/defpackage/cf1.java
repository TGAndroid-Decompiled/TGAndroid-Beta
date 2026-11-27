package defpackage;

import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;
import org.telegram.tgnet.TLRPC;
public final class cf1 implements Function {
    public final byte a;
    public final Object b;

    public cf1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Function andThen(Function function) {
        byte b = this.a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override
    public final Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                wf1 wf1Var = (wf1) obj2;
                Long l = (Long) obj;
                if (l.longValue() < 0) {
                    TLRPC.Chat M0 = wf1Var.getMessagesController().M0(Long.valueOf(-l.longValue()));
                    if (M0 == null) {
                        return null;
                    }
                    return M0.title;
                }
                return lbc.l(wf1Var.getMessagesController().X1(l));
            default:
                t80 t80Var = (t80) obj2;
                hz2 hz2Var = (hz2) obj;
                s80 a = t80Var.a();
                v80 v80Var = t80Var.c;
                u80 a2 = v80Var.a();
                w80 w80Var = v80Var.a;
                List list = w80Var.a;
                y80 y80Var = w80Var.b;
                cz2 cz2Var = w80Var.c;
                z80 z80Var = w80Var.e;
                List list2 = w80Var.f;
                if (list2 == null) {
                    StringBuilder sb = new StringBuilder();
                    if (list2 == null) {
                        sb.append(" binaries");
                    }
                    grb.i(bs2.o("Missing required properties:", sb));
                    return null;
                }
                a2.a = new w80(list, y80Var, cz2Var, hz2Var, z80Var, list2);
                a.c = a2.a();
                return a.a();
        }
    }

    public final Function compose(Function function) {
        byte b = this.a;
        return Function$CC.$default$compose(this, function);
    }
}
