package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
public final class g71 extends b71 {
    public final ArrayList n;
    public final o71 r;

    public g71(o71 o71Var) {
        super(o71Var, 2);
        this.r = o71Var;
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
                String path = ((h71) arrayList2.get(i)).d.a.getPath();
                if (((h71) arrayList2.get(i)).d.d == 1) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new jm6(0, path, 0, z, 0, 0));
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        boolean z2;
        String name;
        String str;
        float f;
        View view = s49Var.a;
        f71 f71Var = (f71) view;
        iba ibaVar = (iba) f71Var.b.getChildAt(0);
        ArrayList arrayList = this.e;
        u61 u61Var = ((h71) arrayList.get(i)).d;
        if (u61Var == view.getTag()) {
            z = true;
        } else {
            z = false;
        }
        if (i != arrayList.size() - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        view.setTag(u61Var);
        File file = u61Var.a;
        long lastModified = file.lastModified();
        String str2 = null;
        if (u61Var.h == 5) {
            name = k96.M0(2131753938, null);
        } else {
            name = file.getName();
        }
        String str3 = name;
        String s = k96.s(lastModified / 1000, true);
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
        ibaVar.d(str3, s, str2, null, 0, z2);
        if (!z) {
            ibaVar.setPhoto(file.getPath());
        }
        be0 imageView = ibaVar.getImageView();
        if (u61Var.h == 5) {
            f = 20.0f;
        } else {
            f = 4.0f;
        }
        imageView.setRoundRadius(gl.L(f));
        f71Var.d = z2;
        f71Var.c.setText(gl.i0(u61Var.c, false, false));
        f71Var.a.a(this.r.h.j.contains(u61Var), z);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        f71 f71Var = new f71(this, viewGroup.getContext(), (byte) 0);
        f71Var.e = (byte) 2;
        f71Var.b.addView(new iba(3, null, viewGroup.getContext()));
        return new s49(f71Var);
    }
}
