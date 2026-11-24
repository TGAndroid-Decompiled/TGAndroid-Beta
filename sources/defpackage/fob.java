package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
public final class fob extends jb8 {
    public final jo6 a;
    public final gob b;

    public fob(gob gobVar, jo6 jo6Var) {
        this.b = gobVar;
        this.a = jo6Var;
    }

    @Override
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        rob robVar = this.b.a;
        jo6 jo6Var = this.a;
        if (jo6Var.h != null) {
            File z3 = bc4.z(4);
            File file = new File(z3, Utilities.b.nextInt() + ".jpg");
            Point b1 = gm.b1();
            Bitmap G = fn5.G(jo6Var.h, null, (float) b1.x, (float) b1.y, true);
            try {
                G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            File file2 = new File(jo6Var.h);
            robVar.D1 = new ntc(file2, file2, "");
            robVar.E1 = G;
            robVar.d2 = 0;
            robVar.z0.requestLayout();
            robVar.g1(false);
            robVar.y1 = null;
            robVar.n1();
        }
    }

    @Override
    public final boolean y() {
        return false;
    }
}
