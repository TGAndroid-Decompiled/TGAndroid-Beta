package defpackage;

import android.os.Bundle;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class yy6 implements fu2, lz6, jz6, Vector.TLDeserializer, z0c {
    public final byte a;

    public yy6(String str, int i, int i2, dt6 dt6Var) {
        this.a = (byte) 9;
    }

    @Override
    public final void a(cf8 cf8Var, sw6 sw6Var, List list) {
        switch (this.a) {
            case 7:
                cf8Var.w0(list);
                return;
            default:
                cf8Var.w0(list);
                return;
        }
    }

    @Override
    public final void accept(Object obj) {
        cf8 cf8Var = (cf8) obj;
        switch (this.a) {
            case 0:
                cf8Var.d0();
                return;
            case 1:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 11:
            case 14:
            case 16:
            case 20:
            default:
                cf8Var.stop();
                return;
            case 2:
                cf8Var.E0();
                return;
            case 3:
                cf8Var.C();
                return;
            case 6:
                cf8Var.I();
                return;
            case 10:
                cf8Var.a0();
                return;
            case 12:
                cf8Var.E();
                return;
            case 13:
                cf8Var.a();
                return;
            case 15:
                cf8Var.t();
                return;
            case 17:
                cf8Var.c();
                return;
            case 18:
                cf8Var.L0();
                return;
            case 19:
                cf8Var.S();
                return;
            case 21:
                cf8Var.K0();
                return;
            case 22:
                cf8Var.J0();
                return;
        }
    }

    @Override
    public final Object apply(Object obj) {
        hf7 hf7Var = (hf7) obj;
        hf7Var.getClass();
        jv8 jv8Var = bv8.a;
        jv8Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            jv8Var.b(hf7Var, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 25:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i, z);
            case 26:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i, z);
            case 27:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i, z);
            default:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i, z);
        }
    }

    @Override
    public final Object t(tx6 tx6Var, sw6 sw6Var, int i) {
        switch (this.a) {
            case 1:
                return tx6Var.m(sw6Var);
            case 4:
                tx6Var.getClass();
                throw new ClassCastException();
            case 5:
                dhf dhfVar = tx6Var.e;
                tx6Var.q(sw6Var);
                dhfVar.getClass();
                return kke.c(new q8a(-6));
            case 9:
                tx6Var.getClass();
                throw new ClassCastException();
            case 11:
                tx6Var.getClass();
                throw new ClassCastException();
            case 14:
                tx6Var.getClass();
                throw new ClassCastException();
            case 16:
                tx6Var.getClass();
                throw new ClassCastException();
            default:
                dhf dhfVar2 = tx6Var.e;
                tx6Var.q(sw6Var);
                dhfVar2.getClass();
                return kke.c(new q8a(-6));
        }
    }

    public yy6(byte b, Object obj, String str) {
        this.a = b;
    }

    public yy6(Object obj, byte b) {
        this.a = b;
    }

    public yy6(byte b) {
        this.a = b;
    }

    public yy6(boolean z, r7a r7aVar, Bundle bundle) {
        this.a = (byte) 1;
    }
}
