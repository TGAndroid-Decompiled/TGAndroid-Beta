package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
public final class yw6 implements us2, lx6, jx6, Vector.TLDeserializer, yyb, xj0, rj5 {
    public final byte a;

    public yw6(String str, int i, int i2, dr6 dr6Var) {
        this.a = (byte) 7;
    }

    @Override
    public final Object a(Bitmap bitmap) {
        if (bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            return bitmap;
        }
        return bitmap.extractAlpha();
    }

    @Override
    public final void accept(Object obj) {
        ad8 ad8Var = (ad8) obj;
        switch (this.a) {
            case 0:
                ad8Var.E0();
                return;
            case 1:
                ad8Var.C();
                return;
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 9:
            case 12:
            case 14:
            case 18:
            default:
                ad8Var.stop();
                return;
            case 4:
                ad8Var.I();
                return;
            case 8:
                ad8Var.a0();
                return;
            case 10:
                ad8Var.E();
                return;
            case 11:
                ad8Var.a();
                return;
            case 13:
                ad8Var.t();
                return;
            case 15:
                ad8Var.e();
                return;
            case 16:
                ad8Var.L0();
                return;
            case 17:
                ad8Var.S();
                return;
            case 19:
                ad8Var.K0();
                return;
            case 20:
                ad8Var.J0();
                return;
        }
    }

    @Override
    public final Object apply(Object obj) {
        fd7 fd7Var = (fd7) obj;
        fd7Var.getClass();
        it8 it8Var = at8.a;
        it8Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            it8Var.b(fd7Var, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override
    public final void b(ad8 ad8Var, su6 su6Var, List list) {
        switch (this.a) {
            case 5:
                ad8Var.w0(list);
                return;
            default:
                ad8Var.w0(list);
                return;
        }
    }

    @Override
    public final boolean d(int i, int i2, int i3, int i4, int i5) {
        if (i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) {
            if (i2 == 77 && i3 == 76 && i4 == 76) {
                if (i5 == 84 || i == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 23:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i, z);
            case 24:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i, z);
            case 25:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i, z);
            default:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i, z);
        }
    }

    @Override
    public final Object p(tv6 tv6Var, su6 su6Var, int i) {
        switch (this.a) {
            case 2:
                tv6Var.getClass();
                throw new ClassCastException();
            case 3:
                cff cffVar = tv6Var.e;
                tv6Var.q(su6Var);
                cffVar.getClass();
                return jie.c(new o6a(-6));
            case 7:
                tv6Var.getClass();
                throw new ClassCastException();
            case 9:
                tv6Var.getClass();
                throw new ClassCastException();
            case 12:
                tv6Var.getClass();
                throw new ClassCastException();
            case 14:
                tv6Var.getClass();
                throw new ClassCastException();
            default:
                cff cffVar2 = tv6Var.e;
                tv6Var.q(su6Var);
                cffVar2.getClass();
                return jie.c(new o6a(-6));
        }
    }

    public yw6(byte b, Object obj, String str) {
        this.a = b;
    }

    public yw6(Object obj, byte b) {
        this.a = b;
    }

    public yw6(byte b) {
        this.a = b;
    }
}
