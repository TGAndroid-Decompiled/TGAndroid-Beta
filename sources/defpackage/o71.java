package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class o71 extends j71 {
    public final ArrayList n;
    public final w71 r;

    public o71(w71 w71Var) {
        super(w71Var, 2);
        this.r = w71Var;
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
                String path = ((p71) arrayList2.get(i)).d.a.getPath();
                if (((p71) arrayList2.get(i)).d.d == 1) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new no6(0, path, 0, z, 0, 0));
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        boolean z2;
        String name;
        String str;
        float f;
        View view = f89Var.a;
        n71 n71Var = (n71) view;
        zea zeaVar = (zea) n71Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        c71 c71Var = ((p71) arrayList.get(i)).d;
        if (c71Var == view.getTag()) {
            z = true;
        } else {
            z = false;
        }
        if (i != arrayList.size() - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        view.setTag(c71Var);
        File file = c71Var.a;
        long lastModified = file.lastModified();
        String str2 = null;
        if (c71Var.h == 5) {
            name = ob6.M0(2131753934, null);
        } else {
            name = file.getName();
        }
        String str3 = name;
        String s = ob6.s(lastModified / 1000, true);
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
        zeaVar.d(str3, s, str2, null, 0, z2);
        if (!z) {
            zeaVar.setPhoto(file.getPath());
        }
        de0 imageView = zeaVar.getImageView();
        if (c71Var.h == 5) {
            f = 20.0f;
        } else {
            f = 4.0f;
        }
        imageView.setRoundRadius(hl.L(f));
        n71Var.d = z2;
        n71Var.c.setText(hl.i0(c71Var.c, false, false));
        n71Var.a.a(this.r.h.j.contains(c71Var), z);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        n71 n71Var = new n71(this, viewGroup.getContext(), (byte) 0);
        n71Var.e = (byte) 2;
        n71Var.b.addView(new zea(3, null, viewGroup.getContext()));
        return new f89(n71Var);
    }
}
