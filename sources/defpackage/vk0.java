package defpackage;

import android.content.Context;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;
public final class vk0 extends fka {
    public final Context r;
    public final int s;

    public vk0(Context context) {
        super(new la3[1], new tk0[1]);
        this.r = context;
        this.s = -1;
    }

    @Override
    public final na3 g() {
        return new tk0(this);
    }

    @Override
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override
    public final ja3 i(la3 la3Var, na3 na3Var, boolean z) {
        boolean z2;
        tk0 tk0Var = (tk0) na3Var;
        ByteBuffer byteBuffer = la3Var.c;
        byteBuffer.getClass();
        jte.p(byteBuffer.hasArray());
        if (byteBuffer.arrayOffset() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        jte.f(z2);
        try {
            int i = this.s;
            if (i == -1) {
                Context context = this.r;
                if (context != null) {
                    Point y = hac.y(context);
                    int i2 = y.x;
                    int i3 = y.y;
                    go4 go4Var = la3Var.a;
                    if (go4Var != null) {
                        int i4 = go4Var.V;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = go4Var.W;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) << 1) - 1;
                } else {
                    i = 4096;
                }
            }
            tk0Var.a = y00.f(byteBuffer.remaining(), i, byteBuffer.array());
            tk0Var.timeUs = la3Var.e;
            return null;
        } catch (bx7 e) {
            return new Exception("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new Exception(e2);
        }
    }
}
