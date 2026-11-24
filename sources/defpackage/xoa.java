package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xoa implements RequestDelegate {
    public final byte a;
    public final vqa b;

    public xoa(vqa vqaVar, byte b) {
        this.a = b;
        this.b = vqaVar;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final vqa vqaVar = this.b;
        switch (b) {
            case 0:
                vqaVar.getClass();
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        vqa vqaVar2 = vqaVar;
                        switch (b2) {
                            case 0:
                                nna nnaVar = vqaVar2.s3;
                                vqaVar2.p3 = false;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    na7.q1(vqaVar2.a).a4(paymentForm.users, false);
                                    vqaVar2.q3 = paymentForm;
                                    gl.r(nnaVar);
                                    gl.d3(nnaVar);
                                    return;
                                }
                                m21 Z = vqaVar2.j().Z(tL_error2);
                                Z.t = true;
                                Z.j();
                                return;
                            default:
                                vqaVar2.p3 = false;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                                    na7.q1(vqaVar2.a).a4(paymentForm2.users, false);
                                    vqaVar2.q3 = paymentForm2;
                                    vqaVar2.e2();
                                    return;
                                }
                                m21 Z2 = vqaVar2.j().Z(tL_error2);
                                Z2.t = true;
                                Z2.j();
                                return;
                        }
                    }
                });
                return;
            default:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r4;
                        TLRPC.TL_error tL_error2 = tL_error;
                        TLObject tLObject2 = tLObject;
                        vqa vqaVar2 = vqaVar;
                        switch (b2) {
                            case 0:
                                nna nnaVar = vqaVar2.s3;
                                vqaVar2.p3 = false;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject2;
                                    na7.q1(vqaVar2.a).a4(paymentForm.users, false);
                                    vqaVar2.q3 = paymentForm;
                                    gl.r(nnaVar);
                                    gl.d3(nnaVar);
                                    return;
                                }
                                m21 Z = vqaVar2.j().Z(tL_error2);
                                Z.t = true;
                                Z.j();
                                return;
                            default:
                                vqaVar2.p3 = false;
                                if (tLObject2 instanceof TLRPC.PaymentForm) {
                                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                                    na7.q1(vqaVar2.a).a4(paymentForm2.users, false);
                                    vqaVar2.q3 = paymentForm2;
                                    vqaVar2.e2();
                                    return;
                                }
                                m21 Z2 = vqaVar2.j().Z(tL_error2);
                                Z2.t = true;
                                Z2.j();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
