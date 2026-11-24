package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class o81 extends i81 {
    public final ArrayList n;
    public final w81 r;

    public o81(w81 w81Var) {
        super(w81Var, 2);
        this.r = w81Var;
        this.n = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z;
        super.F();
        ArrayList arrayList = this.n;
        arrayList.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i < arrayList2.size()) {
                String path = ((p81) arrayList2.get(i)).d.a.getPath();
                if (((p81) arrayList2.get(i)).d.d == 1) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new jo6(0, path, 0, z, 0, 0));
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        boolean z2;
        String name;
        String str;
        float f;
        View view = u69Var.a;
        n81 n81Var = (n81) view;
        ida idaVar = (ida) n81Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        b81 b81Var = ((p81) arrayList.get(i)).d;
        if (b81Var == view.getTag()) {
            z = true;
        } else {
            z = false;
        }
        if (i != arrayList.size() - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        view.setTag(b81Var);
        File file = b81Var.a;
        long lastModified = file.lastModified();
        String str2 = null;
        if (b81Var.h == 5) {
            name = jb6.M0(2131753906, null);
        } else {
            name = file.getName();
        }
        String str3 = name;
        String s = jb6.s(lastModified / 1000, true);
        String name2 = file.getName();
        Pattern pattern = Utilities.a;
        int lastIndexOf = name2.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = name2.substring(lastIndexOf + 1);
        } else {
            str = null;
        }
        if (str != null) {
            str2 = str.toUpperCase();
        }
        idaVar.d(str3, s, str2, null, 0, z2);
        if (!z) {
            idaVar.setPhoto(file.getPath());
        }
        bf0 imageView = idaVar.getImageView();
        if (b81Var.h == 5) {
            f = 20.0f;
        } else {
            f = 4.0f;
        }
        imageView.setRoundRadius(gm.L(f));
        n81Var.d = z2;
        n81Var.c.setText(gm.i0(b81Var.c, false, false));
        n81Var.a.a(this.r.h.j.contains(b81Var), z);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        n81 n81Var = new n81(this, viewGroup.getContext(), (byte) 0);
        n81Var.e = (byte) 2;
        n81Var.b.addView(new ida(3, null, viewGroup.getContext()));
        return new u69(n81Var);
    }
}
