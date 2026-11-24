package defpackage;
public abstract class r3c {
    public static final lo5 a = new lo5("UNDEFINED");
    public static final lo5 b = new lo5("REUSABLE_CLAIMED");

    public static void a(int i, Object obj) {
        if (obj != null && !b(i, obj)) {
            ClassCastException classCastException = new ClassCastException(tb4.y(obj.getClass().getName(), " cannot be cast to ", de9.k(i, "kotlin.jvm.functions.Function")));
            rp5.d(classCastException, r3c.class.getName());
            throw classCastException;
        }
    }

    public static boolean b(int i, Object obj) {
        int i2;
        if (obj instanceof fq4) {
            if (obj instanceof oq4) {
                i2 = ((oq4) obj).getArity();
            } else if (obj instanceof op4) {
                i2 = 0;
            } else if (obj instanceof qp4) {
                i2 = 1;
            } else if (obj instanceof eq4) {
                i2 = 2;
            } else if (obj instanceof gq4) {
                i2 = 3;
            } else {
                i2 = -1;
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static final void c(fw2 fw2Var, Object obj) {
        Object fp2Var;
        y4c y4cVar;
        if (fw2Var instanceof ho3) {
            ho3 ho3Var = (ho3) fw2Var;
            vw2 vw2Var = ho3Var.d;
            gw2 gw2Var = ho3Var.e;
            Throwable a2 = ta9.a(obj);
            if (a2 == null) {
                fp2Var = obj;
            } else {
                fp2Var = new fp2(a2, false);
            }
            if (vw2Var.d(gw2Var.getContext())) {
                ho3Var.f = fp2Var;
                ho3Var.c = 1;
                vw2Var.c(gw2Var.getContext(), ho3Var);
                return;
            }
            d44 a3 = dnb.a();
            if (a3.c >= 4294967296L) {
                ho3Var.f = fp2Var;
                ho3Var.c = 1;
                ks ksVar = a3.e;
                if (ksVar == null) {
                    ksVar = new ks();
                    a3.e = ksVar;
                }
                ksVar.addLast(ho3Var);
                return;
            }
            a3.g(true);
            try {
                bt5 bt5Var = (bt5) gw2Var.getContext().get(pd5.c);
                if (bt5Var != null && !bt5Var.isActive()) {
                    ho3Var.resumeWith(qse.a(bt5Var.getCancellationException()));
                } else {
                    Object obj2 = ho3Var.h;
                    sw2 context = gw2Var.getContext();
                    Object c = edd.c(context, obj2);
                    if (c != edd.a) {
                        y4cVar = qzd.c(gw2Var, context, c);
                    } else {
                        y4cVar = null;
                    }
                    gw2Var.resumeWith(obj);
                    if (y4cVar == null || y4cVar.S()) {
                        edd.a(context, c);
                    }
                }
                do {
                } while (a3.i());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        fw2Var.resumeWith(obj);
    }
}
