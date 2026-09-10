package bi;
public final class sa implements Runnable {
    public final int f3657a;
    public final kb f3658b;

    public sa(kb kbVar, int i10) {
        this.f3657a = i10;
        this.f3658b = kbVar;
    }

    @Override
    public final void run() {
        switch (this.f3657a) {
            case 0:
                rb rbVar = this.f3658b.W;
                org.telegram.ui.Components.pc.h(rbVar.container);
                rb.D(rbVar);
                return;
            case 1:
                kb kbVar = this.f3658b;
                kbVar.v.setLoading(false);
                rb rbVar2 = kbVar.W;
                rbVar2.f1();
                rbVar2.f3615b.D(0);
                return;
            case 2:
                this.f3658b.U = false;
                return;
            case 3:
                rb rbVar3 = this.f3658b.W;
                rbVar3.M = 6;
                rbVar3.f3615b.D(1);
                return;
            case 4:
                kb kbVar2 = this.f3658b;
                kbVar2.f3010n.m(2);
                kbVar2.f3009f.forceLayout();
                kbVar2.j();
                return;
            default:
                kb kbVar3 = this.f3658b;
                rb rbVar4 = kbVar3.W;
                if (kbVar3.f3006a == 0) {
                    rbVar4.dismiss();
                    return;
                } else {
                    rbVar4.onBackPressed();
                    return;
                }
        }
    }
}
