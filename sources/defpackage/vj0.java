package defpackage;

import android.content.Context;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;
public final class vj0 extends dia {
    public final Context r;
    public final int s;

    public vj0(Context context) {
        super(new z83[1], new tj0[1]);
        this.r = context;
        this.s = -1;
    }

    @Override
    public final b93 g() {
        return new tj0(this);
    }

    @Override
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override
    public final x83 i(z83 z83Var, b93 b93Var, boolean z) {
        boolean z2;
        tj0 tj0Var = (tj0) b93Var;
        ByteBuffer byteBuffer = z83Var.c;
        byteBuffer.getClass();
        gre.p(byteBuffer.hasArray());
        if (byteBuffer.arrayOffset() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        gre.f(z2);
        try {
            int i = this.s;
            if (i == -1) {
                Context context = this.r;
                if (context != null) {
                    Point y = g8c.y(context);
                    int i2 = y.x;
                    int i3 = y.y;
                    fm4 fm4Var = z83Var.a;
                    if (fm4Var != null) {
                        int i4 = fm4Var.V;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = fm4Var.W;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) << 1) - 1;
                } else {
                    i = 4096;
                }
            }
            tj0Var.a = yz.f(byteBuffer.remaining(), i, byteBuffer.array());
            tj0Var.timeUs = z83Var.e;
            return null;
        } catch (av7 e) {
            return new Exception("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new Exception(e2);
        }
    }
}
