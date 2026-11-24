package defpackage;
public final class vqc implements Runnable {
    public final byte a = 0;
    public final xqc b;
    public final wqc c;
    public final mqc d;

    public vqc(xqc xqcVar, mqc mqcVar, wqc wqcVar) {
        this.b = xqcVar;
        this.d = mqcVar;
        this.c = wqcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mqc mqcVar = this.d;
        wqc wqcVar = this.c;
        xqc xqcVar = this.b;
        switch (b) {
            case 0:
                if (mqcVar != null) {
                    xqcVar.a(wqcVar, mqcVar);
                    return;
                } else if (wqcVar.e != null) {
                    xqcVar.c(wqcVar);
                    return;
                } else {
                    xqcVar.e(wqcVar);
                    return;
                }
            default:
                xqcVar.a(wqcVar, mqcVar);
                return;
        }
    }

    public vqc(xqc xqcVar, wqc wqcVar, mqc mqcVar) {
        this.b = xqcVar;
        this.c = wqcVar;
        this.d = mqcVar;
    }
}
