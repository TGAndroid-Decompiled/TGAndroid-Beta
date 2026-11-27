package defpackage;

import android.content.Context;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;
public final class wj0 extends yla {
    public final Context r;
    public final int s;

    public wj0(Context context) {
        super(new s93[1], new uj0[1]);
        this.r = context;
        this.s = -1;
    }

    @Override
    public final u93 g() {
        return new uj0(this);
    }

    @Override
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override
    public final q93 i(s93 s93Var, u93 u93Var, boolean z) {
        boolean z2;
        uj0 uj0Var = (uj0) u93Var;
        ByteBuffer byteBuffer = s93Var.c;
        byteBuffer.getClass();
        yve.p(byteBuffer.hasArray());
        if (byteBuffer.arrayOffset() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        yve.f(z2);
        try {
            int i = this.s;
            if (i == -1) {
                Context context = this.r;
                if (context != null) {
                    Point y = gcc.y(context);
                    int i2 = y.x;
                    int i3 = y.y;
                    ko4 ko4Var = s93Var.a;
                    if (ko4Var != null) {
                        int i4 = ko4Var.V;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = ko4Var.W;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) << 1) - 1;
                } else {
                    i = 4096;
                }
            }
            uj0Var.a = zz.f(byteBuffer.remaining(), i, byteBuffer.array());
            uj0Var.timeUs = s93Var.e;
            return null;
        } catch (hy7 e) {
            return new Exception("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new Exception(e2);
        }
    }
}
