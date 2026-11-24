package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
public final class pv6 extends y59 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public nv6 r;
    public final int s;
    public final AccelerateDecelerateInterpolator w;
    public final rv6 x;

    public pv6(rv6 rv6Var) {
        this.x = rv6Var;
        Context context = rv6Var.E;
        this.d = LayoutInflater.from(context);
        this.e = yqe.d(context, 2130968868);
        this.f = yqe.d(context, 2130968877);
        this.h = yqe.d(context, 2130968874);
        this.n = yqe.d(context, 2130968873);
        this.s = context.getResources().getInteger(2131361803);
        this.w = new AccelerateDecelerateInterpolator();
        G();
    }

    @Override
    public final void A(u69 u69Var) {
        this.x.M.values().remove(u69Var);
    }

    public final void D(int i, View view) {
        pu6 pu6Var = new pu6(i, view.getLayoutParams().height, view, (byte) 1);
        pu6Var.setAnimationListener(new le(this, (byte) 2));
        pu6Var.setDuration(this.s);
        pu6Var.setInterpolator(this.w);
        view.startAnimation(pu6Var);
    }

    public final Drawable E(ew6 ew6Var) {
        Uri uri = ew6Var.f;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.x.E.getContentResolver().openInputStream(uri), null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException e) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e);
            }
        }
        int i = ew6Var.n;
        if (i != 1) {
            if (i != 2) {
                if (ew6Var.e()) {
                    return this.n;
                }
                return this.e;
            }
            return this.h;
        }
        return this.f;
    }

    public final void F() {
        tv6 tv6Var;
        rv6 rv6Var = this.x;
        ArrayList arrayList = rv6Var.y;
        arrayList.clear();
        ArrayList arrayList2 = rv6Var.w;
        ArrayList arrayList3 = new ArrayList();
        dw6 dw6Var = rv6Var.r.a;
        gw6.b();
        for (ew6 ew6Var : DesugarCollections.unmodifiableList(dw6Var.b)) {
            k44 b = rv6Var.r.b(ew6Var);
            if (b != null && (tv6Var = (tv6) b.b) != null && tv6Var.d) {
                arrayList3.add(ew6Var);
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        f();
    }

    public final void G() {
        String str;
        String str2;
        ArrayList arrayList = this.c;
        arrayList.clear();
        rv6 rv6Var = this.x;
        ArrayList arrayList2 = rv6Var.x;
        Context context = rv6Var.E;
        ArrayList arrayList3 = rv6Var.w;
        this.r = new nv6(rv6Var.r, 1);
        ArrayList arrayList4 = rv6Var.s;
        boolean z = false;
        if (!arrayList4.isEmpty()) {
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                arrayList.add(new nv6((ew6) obj, 3));
            }
        } else {
            arrayList.add(new nv6(rv6Var.r, 3));
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z2 = false;
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                ew6 ew6Var = (ew6) obj2;
                if (!arrayList4.contains(ew6Var)) {
                    if (!z2) {
                        rv6Var.r.getClass();
                        uv6 a = ew6.a();
                        if (a != null) {
                            str2 = a.j();
                        } else {
                            str2 = null;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str2 = context.getString(2131689664);
                        }
                        arrayList.add(new nv6(str2, 2));
                        z2 = true;
                    }
                    arrayList.add(new nv6(ew6Var, 3));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                ew6 ew6Var2 = (ew6) obj3;
                ew6 ew6Var3 = rv6Var.r;
                if (ew6Var3 != ew6Var2) {
                    if (!z) {
                        ew6Var3.getClass();
                        uv6 a2 = ew6.a();
                        if (a2 != null) {
                            str = a2.k();
                        } else {
                            str = null;
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = context.getString(2131689665);
                        }
                        arrayList.add(new nv6(str, 2));
                        z = true;
                    }
                    arrayList.add(new nv6(ew6Var2, 4));
                }
            }
        }
        F();
    }

    @Override
    public final int b() {
        return this.c.size() + 1;
    }

    @Override
    public final int d(int i) {
        nv6 nv6Var;
        if (i == 0) {
            nv6Var = this.r;
        } else {
            nv6Var = (nv6) this.c.get(i - 1);
        }
        return nv6Var.b;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        nv6 nv6Var;
        nv6 nv6Var2;
        boolean z;
        boolean z2;
        float f;
        float f2;
        k44 b;
        tv6 tv6Var;
        float f3;
        ArrayList arrayList = this.c;
        if (i == 0) {
            nv6Var = this.r;
        } else {
            nv6Var = (nv6) arrayList.get(i - 1);
        }
        byte b2 = nv6Var.b;
        boolean z3 = true;
        if (i == 0) {
            nv6Var2 = this.r;
        } else {
            nv6Var2 = (nv6) arrayList.get(i - 1);
        }
        rv6 rv6Var = this.x;
        int i2 = 0;
        if (b2 != 1) {
            if (b2 != 2) {
                if (b2 != 3) {
                    if (b2 == 4) {
                        kv6 kv6Var = (kv6) u69Var;
                        View view = kv6Var.v;
                        ew6 ew6Var = (ew6) nv6Var2.a;
                        kv6Var.A = ew6Var;
                        ImageView imageView = kv6Var.w;
                        imageView.setVisibility(0);
                        kv6Var.x.setVisibility(4);
                        pv6 pv6Var = kv6Var.B;
                        List unmodifiableList = DesugarCollections.unmodifiableList(pv6Var.x.r.v);
                        if (unmodifiableList.size() == 1 && unmodifiableList.get(0) == ew6Var) {
                            f3 = kv6Var.z;
                        } else {
                            f3 = 1.0f;
                        }
                        view.setAlpha(f3);
                        view.setOnClickListener(new g6(kv6Var, (byte) 11));
                        imageView.setImageDrawable(pv6Var.E(ew6Var));
                        kv6Var.y.setText(ew6Var.d);
                        return;
                    }
                    rjb.h();
                    return;
                }
                rv6Var.M.put(((ew6) nv6Var2.a).c, (jv6) u69Var);
                ov6 ov6Var = (ov6) u69Var;
                float f4 = ov6Var.F;
                g6 g6Var = ov6Var.H;
                ImageView imageView2 = ov6Var.A;
                View view2 = ov6Var.z;
                CheckBox checkBox = ov6Var.E;
                ew6 ew6Var2 = (ew6) nv6Var2.a;
                pv6 pv6Var2 = ov6Var.I;
                rv6 rv6Var2 = pv6Var2.x;
                if (ew6Var2 == rv6Var2.r && DesugarCollections.unmodifiableList(ew6Var2.v).size() > 0) {
                    Iterator it = DesugarCollections.unmodifiableList(ew6Var2.v).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ew6 ew6Var3 = (ew6) it.next();
                        if (!rv6Var2.w.contains(ew6Var3)) {
                            ew6Var2 = ew6Var3;
                            break;
                        }
                    }
                }
                ov6Var.t(ew6Var2);
                imageView2.setImageDrawable(pv6Var2.E(ew6Var2));
                ov6Var.C.setText(ew6Var2.d);
                checkBox.setVisibility(0);
                boolean v = ov6Var.v(ew6Var2);
                if (rv6Var2.y.contains(ew6Var2) || ((ov6Var.v(ew6Var2) && DesugarCollections.unmodifiableList(rv6Var2.r.v).size() < 2) || (ov6Var.v(ew6Var2) && ((b = rv6Var2.r.b(ew6Var2)) == null || ((tv6Var = (tv6) b.b) != null && !tv6Var.c))))) {
                    z = false;
                } else {
                    z = true;
                }
                checkBox.setChecked(v);
                ov6Var.B.setVisibility(4);
                imageView2.setVisibility(0);
                view2.setEnabled(z);
                checkBox.setEnabled(z);
                ImageButton imageButton = ov6Var.w;
                if (!z && !v) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                imageButton.setEnabled(z2);
                MediaRouteVolumeSlider mediaRouteVolumeSlider = ov6Var.x;
                if (!z && !v) {
                    z3 = false;
                }
                mediaRouteVolumeSlider.setEnabled(z3);
                view2.setOnClickListener(g6Var);
                checkBox.setOnClickListener(g6Var);
                RelativeLayout relativeLayout = ov6Var.D;
                if (v && !ov6Var.v.e()) {
                    i2 = ov6Var.G;
                }
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                layoutParams.height = i2;
                relativeLayout.setLayoutParams(layoutParams);
                if (!z && !v) {
                    f = f4;
                } else {
                    f = 1.0f;
                }
                view2.setAlpha(f);
                if (!z && v) {
                    f2 = f4;
                } else {
                    f2 = 1.0f;
                }
                checkBox.setAlpha(f2);
                return;
            }
            ((mv6) u69Var).v.setText(nv6Var2.a.toString());
            return;
        }
        rv6Var.M.put(((ew6) nv6Var2.a).c, (jv6) u69Var);
        lv6 lv6Var = (lv6) u69Var;
        View view3 = lv6Var.a;
        rv6 rv6Var3 = lv6Var.B.x;
        if (rv6Var3.j0 && DesugarCollections.unmodifiableList(rv6Var3.r.v).size() > 1) {
            i2 = lv6Var.A;
        }
        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
        layoutParams2.height = i2;
        view3.setLayoutParams(layoutParams2);
        ew6 ew6Var4 = (ew6) nv6Var2.a;
        lv6Var.t(ew6Var4);
        lv6Var.z.setText(ew6Var4.d);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.d;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return new kv6(this, layoutInflater.inflate(2131492923, viewGroup, false));
                    }
                    rjb.h();
                    return null;
                }
                return new ov6(this, layoutInflater.inflate(2131492927, viewGroup, false));
            }
            return new mv6(layoutInflater.inflate(2131492925, viewGroup, false));
        }
        return new lv6(this, layoutInflater.inflate(2131492924, viewGroup, false));
    }
}
