package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class bm7 extends yc8 {
    public final int a;
    public final r47 b;
    public final lm7 c;

    public bm7(int i, r47 r47Var, lm7 lm7Var) {
        this.c = lm7Var;
        this.a = i;
        this.b = r47Var;
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        de0 de0Var;
        if (r47Var != null) {
            lm7 lm7Var = this.c;
            jm7[] jm7VarArr = lm7Var.b;
            int length = jm7VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                im7 im7Var = jm7VarArr[i2].f;
                if (im7Var != null && im7Var.H) {
                    for (int i3 = 0; i3 < im7Var.getChildCount(); i3++) {
                        View childAt = im7Var.getChildAt(i3);
                        if (childAt instanceof v94) {
                            v94 v94Var = (v94) childAt;
                            ArrayList<r47> media = v94Var.getMedia();
                            for (int i4 = 0; i4 < media.size(); i4++) {
                                r47 r47Var2 = media.get(i4);
                                if (r47Var2.e1() == r47Var.e1() && r47.B0(r47Var2.k) == r47.B0(r47Var.k)) {
                                    ArrayList arrayList = v94Var.F;
                                    if (i4 >= 0 && i4 < arrayList.size()) {
                                        de0Var = (de0) arrayList.get(i4);
                                    } else {
                                        de0Var = null;
                                    }
                                    if (de0Var != null && de0Var.isAttachedToWindow() && de0Var.getAlpha() > 0.0f) {
                                        int[] iArr = new int[2];
                                        de0Var.getLocationInWindow(iArr);
                                        fd8 fd8Var = new fd8();
                                        fd8Var.b = iArr[0];
                                        fd8Var.c = iArr[1];
                                        fd8Var.d = im7Var;
                                        im7Var.getLocationInWindow(iArr);
                                        fd8Var.n = -iArr[1];
                                        ImageReceiver imageReceiver = de0Var.getImageReceiver();
                                        fd8Var.a = imageReceiver;
                                        fd8Var.e = imageReceiver.p();
                                        fd8Var.h = fd8Var.a.z();
                                        fd8Var.f = r47.B0(r47Var.k);
                                        fd8Var.j = lm7Var.o0();
                                        return fd8Var;
                                    }
                                }
                            }
                            continue;
                        }
                    }
                    continue;
                }
                i2++;
            }
        }
        return null;
    }

    @Override
    public final void Y(zu1 zu1Var) {
        this.c.B0(zu1Var, this.a, this.b);
    }
}
