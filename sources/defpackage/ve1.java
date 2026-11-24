package defpackage;

import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;
import org.telegram.tgnet.TLRPC;
public final class ve1 implements Function {
    public final byte a;
    public final Object b;

    public ve1(Object obj, byte b) {
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
                nf1 nf1Var = (nf1) obj2;
                Long l = (Long) obj;
                if (l.longValue() < 0) {
                    TLRPC.Chat K0 = nf1Var.getMessagesController().K0(Long.valueOf(-l.longValue()));
                    if (K0 == null) {
                        return null;
                    }
                    return K0.title;
                }
                return l7c.l(nf1Var.getMessagesController().V1(l));
            default:
                r80 r80Var = (r80) obj2;
                my2 my2Var = (my2) obj;
                q80 a = r80Var.a();
                t80 t80Var = r80Var.c;
                s80 a2 = t80Var.a();
                u80 u80Var = t80Var.a;
                List list = u80Var.a;
                w80 w80Var = u80Var.b;
                hy2 hy2Var = u80Var.c;
                x80 x80Var = u80Var.e;
                List list2 = u80Var.f;
                if (list2 == null) {
                    StringBuilder sb = new StringBuilder();
                    if (list2 == null) {
                        sb.append(" binaries");
                    }
                    sc8.j(ir2.o("Missing required properties:", sb));
                    return null;
                }
                a2.a = new u80(list, w80Var, hy2Var, my2Var, x80Var, list2);
                a.c = a2.a();
                return a.a();
        }
    }

    public final Function compose(Function function) {
        byte b = this.a;
        return Function$CC.$default$compose(this, function);
    }
}
