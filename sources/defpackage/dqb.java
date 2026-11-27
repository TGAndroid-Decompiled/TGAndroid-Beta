package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
public final class dqb extends yc8 {
    public final no6 a;
    public final eqb b;

    public dqb(eqb eqbVar, no6 no6Var) {
        this.b = eqbVar;
        this.a = no6Var;
    }

    @Override
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        pqb pqbVar = this.b.a;
        no6 no6Var = this.a;
        if (no6Var.h != null) {
            File z3 = xb4.z(4);
            File file = new File(z3, Utilities.b.nextInt() + ".jpg");
            Point b1 = hl.b1();
            Bitmap G = in5.G(no6Var.h, null, (float) b1.x, (float) b1.y, true);
            try {
                G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            File file2 = new File(no6Var.h);
            pqbVar.D1 = new zvc(file2, file2, "");
            pqbVar.E1 = G;
            pqbVar.d2 = 0;
            pqbVar.z0.requestLayout();
            pqbVar.g1(false);
            pqbVar.y1 = null;
            pqbVar.n1();
        }
    }

    @Override
    public final boolean y() {
        return false;
    }
}
